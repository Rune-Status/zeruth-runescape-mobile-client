package p000;

/* compiled from: if */
public final class TwofishEngine {
    static final int AppCompatTheme_editTextStyle = 104;
    static final int MAX_KEY_BITS = 256;
    static final int P_00 = 1;
    static final int ROUND_SUBKEYS = 8;
    int[] f334P;
    int f335T;
    int f336b;
    int[] blockSize;
    int count;
    int f337g;

    public TwofishEngine(int[] iArr) {
        try {
            this.f334P = new int[256];
            this.blockSize = new int[256];
            for (int $i0 = 0; $i0 < iArr.length; $i0++) {
                this.blockSize[$i0] = iArr[$i0];
            }
            aa((byte) -85);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "if.<init>(" + ')');
        }
    }

    public static int af(int i, int i2, int i3) {
        throw new Error("Unresolved compilation error: Method <TwofishEngine: int af(int,int,int)> does not exist!");
    }

    public static int init(int i, int i2, int i3) {
        return (i << 8) + i2;
    }

    public void aa(byte b) {
        throw new Error("Unresolved compilation error: Method <TwofishEngine: void aa(byte)> does not exist!");
    }

    public int ad(byte b) {
        throw new Error("Unresolved compilation error: Method <TwofishEngine: int ad(byte)> does not exist!");
    }

    public int af(int i) {
        throw new Error("Unresolved compilation error: Method <TwofishEngine: int af(int)> does not exist!");
    }

    public void an(byte b) {
        throw new Error("Unresolved compilation error: Method <TwofishEngine: void an(byte)> does not exist!");
    }

    final void decryptBlock() {
        int $i9;
        int $i1 = -1640531527;
        int $i2 = -1640531527;
        int $i3 = -1640531527;
        int $i4 = -1640531527;
        int $i5 = -1640531527;
        int $i6 = -1640531527;
        int $i7 = -1640531527;
        int $i8 = -1640531527;
        for ($i9 = 0; $i9 < 4; $i9++) {
            $i8 ^= $i7 << 11;
            $i5 += $i8;
            $i7 = ($i7 + $i6) ^ ($i6 >>> 2);
            $i4 += $i7;
            $i6 = ($i6 + $i5) ^ ($i5 << 8);
            $i3 += $i6;
            $i5 = ($i5 + $i4) ^ ($i4 >>> 16);
            $i2 += $i5;
            $i4 = ($i4 + $i3) ^ ($i3 << 10);
            $i1 += $i4;
            $i3 = ($i3 + $i2) ^ ($i2 >>> 4);
            $i8 += $i3;
            $i2 = ($i2 + $i1) ^ ($i1 << 8);
            $i7 += $i2;
            $i1 = ($i1 + $i8) ^ ($i8 >>> 9);
            $i6 += $i1;
            $i8 += $i7;
        }
        for ($i9 = 0; $i9 < 256; $i9 += 8) {
            int $i10 = $i7 + this.blockSize[$i9 + 1];
            $i7 = $i6 + this.blockSize[$i9 + 2];
            int $i11 = $i5 + this.blockSize[$i9 + 3];
            $i6 = $i4 + this.blockSize[$i9 + 4];
            $i5 = $i3 + this.blockSize[$i9 + 5];
            $i4 = $i2 + this.blockSize[$i9 + 6];
            $i3 = $i1 + this.blockSize[$i9 + 7];
            $i2 = ($i8 + this.blockSize[$i9]) ^ ($i10 << 11);
            $i8 = $i11 + $i2;
            $i1 = ($i10 + $i7) ^ ($i7 >>> 2);
            $i10 = $i6 + $i1;
            $i6 = ($i7 + $i8) ^ ($i8 << 8);
            $i7 = $i5 + $i6;
            $i5 = ($i8 + $i10) ^ ($i10 >>> 16);
            $i8 = $i4 + $i5;
            $i4 = ($i10 + $i7) ^ ($i7 << 10);
            $i10 = $i3 + $i4;
            $i3 = ($i7 + $i8) ^ ($i8 >>> 4);
            $i11 = $i2 + $i3;
            $i2 = ($i8 + $i10) ^ ($i10 << 8);
            $i7 = $i1 + $i2;
            $i1 = ($i10 + $i11) ^ ($i11 >>> 9);
            $i6 += $i1;
            $i8 = $i11 + $i7;
            this.f334P[$i9] = $i8;
            this.f334P[$i9 + 1] = $i7;
            this.f334P[$i9 + 2] = $i6;
            this.f334P[$i9 + 3] = $i5;
            this.f334P[$i9 + 4] = $i4;
            this.f334P[$i9 + 5] = $i3;
            this.f334P[$i9 + 6] = $i2;
            this.f334P[$i9 + 7] = $i1;
        }
        for (int $i0 = 0; $i0 < 256; $i0 += 8) {
            $i9 = $i8 + this.f334P[$i0];
            $i8 = $i7 + this.f334P[$i0 + 1];
            $i7 = $i6 + this.f334P[$i0 + 2];
            $i10 = $i5 + this.f334P[$i0 + 3];
            $i6 = $i4 + this.f334P[$i0 + 4];
            $i5 = $i3 + this.f334P[$i0 + 5];
            $i4 = $i2 + this.f334P[$i0 + 6];
            $i3 = $i1 + this.f334P[$i0 + 7];
            $i2 = $i9 ^ ($i8 << 11);
            $i10 += $i2;
            $i1 = ($i8 + $i7) ^ ($i7 >>> 2);
            $i6 += $i1;
            $i9 = ($i7 + $i10) ^ ($i10 << 8);
            $i8 = $i5 + $i9;
            $i5 = ($i10 + $i6) ^ ($i6 >>> 16);
            $i7 = $i4 + $i5;
            $i4 = ($i6 + $i8) ^ ($i8 << 10);
            $i6 = $i3 + $i4;
            $i3 = ($i8 + $i7) ^ ($i7 >>> 4);
            $i8 = $i2 + $i3;
            $i2 = ($i7 + $i6) ^ ($i6 << 8);
            $i7 = $i1 + $i2;
            $i1 = ($i6 + $i8) ^ ($i8 >>> 9);
            $i6 = $i9 + $i1;
            $i8 += $i7;
            this.f334P[$i0] = $i8;
            this.f334P[$i0 + 1] = $i7;
            this.f334P[$i0 + 2] = $i6;
            this.f334P[$i0 + 3] = $i5;
            this.f334P[$i0 + 4] = $i4;
            this.f334P[$i0 + 5] = $i3;
            this.f334P[$i0 + 6] = $i2;
            this.f334P[$i0 + 7] = $i1;
        }
        an((byte) 5);
        this.count = 1402439424;
    }

    final void doFinal() {
        int $i0 = this.f337g;
        int $i1 = this.f336b - 2136757977;
        this.f336b = $i1;
        this.f337g = $i0 + ($i1 * 397091059);
        for ($i0 = 0; $i0 < 256; $i0++) {
            $i1 = this.f334P[$i0];
            if (($i0 & 2) == 0) {
                if (($i0 & 1) == 0) {
                    this.f335T = 733957943 * ((this.f335T * 723997705) ^ ((this.f335T * -102381039) << 13));
                } else {
                    this.f335T = ((this.f335T * -102381039) ^ ((this.f335T * -102381039) >>> 6)) * 327837425;
                }
            } else if (($i0 & 1) == 0) {
                this.f335T = ((-1198285296 * this.f335T) ^ ((this.f335T * -102381039) << 2)) * 327837425;
            } else {
                this.f335T = ((-330368301 * this.f335T) ^ ((this.f335T * 1722351593) >>> 16)) * -74320320;
            }
            this.f335T += this.f334P[($i0 + Constants.f93X) & -1060976865] * 309008912;
            int $i2 = (this.f337g * 1781830767) + ((this.f335T * -102381039) + this.f334P[(-42805976 & $i1) >> 2]);
            this.f334P[$i0] = $i2;
            int[] $r1 = this.blockSize;
            $i1 = ($i1 + this.f334P[(($i2 >> 8) & 359592551) >> 2]) * 2018986639;
            this.f337g = $i1;
            $r1[$i0] = $i1 * 1781830767;
        }
    }

    final void encryptBlock() {
        int $i9;
        int $i1 = -1640531527;
        int $i2 = -1640531527;
        int $i3 = -1640531527;
        int $i4 = -1640531527;
        int $i5 = -1640531527;
        int $i6 = -1640531527;
        int $i7 = -1640531527;
        int $i8 = -1640531527;
        for ($i9 = 0; $i9 < 4; $i9++) {
            $i8 ^= $i7 << 11;
            $i5 += $i8;
            $i7 = ($i7 + $i6) ^ ($i6 >>> 2);
            $i4 += $i7;
            $i6 = ($i6 + $i5) ^ ($i5 << 8);
            $i3 += $i6;
            $i5 = ($i5 + $i4) ^ ($i4 >>> 16);
            $i2 += $i5;
            $i4 = ($i4 + $i3) ^ ($i3 << 10);
            $i1 += $i4;
            $i3 = ($i3 + $i2) ^ ($i2 >>> 4);
            $i8 += $i3;
            $i2 = ($i2 + $i1) ^ ($i1 << 8);
            $i7 += $i2;
            $i1 = ($i1 + $i8) ^ ($i8 >>> 9);
            $i6 += $i1;
            $i8 += $i7;
        }
        for ($i9 = 0; $i9 < 256; $i9 += 8) {
            int $i10 = $i7 + this.blockSize[$i9 + 1];
            $i7 = $i6 + this.blockSize[$i9 + 2];
            int $i11 = $i5 + this.blockSize[$i9 + 3];
            $i6 = $i4 + this.blockSize[$i9 + 4];
            $i5 = $i3 + this.blockSize[$i9 + 5];
            $i4 = $i2 + this.blockSize[$i9 + 6];
            $i3 = $i1 + this.blockSize[$i9 + 7];
            $i2 = ($i8 + this.blockSize[$i9]) ^ ($i10 << 11);
            $i8 = $i11 + $i2;
            $i1 = ($i10 + $i7) ^ ($i7 >>> 2);
            $i10 = $i6 + $i1;
            $i6 = ($i7 + $i8) ^ ($i8 << 8);
            $i7 = $i5 + $i6;
            $i5 = ($i8 + $i10) ^ ($i10 >>> 16);
            $i8 = $i4 + $i5;
            $i4 = ($i10 + $i7) ^ ($i7 << 10);
            $i10 = $i3 + $i4;
            $i3 = ($i7 + $i8) ^ ($i8 >>> 4);
            $i11 = $i2 + $i3;
            $i2 = ($i8 + $i10) ^ ($i10 << 8);
            $i7 = $i1 + $i2;
            $i1 = ($i10 + $i11) ^ ($i11 >>> 9);
            $i6 += $i1;
            $i8 = $i11 + $i7;
            this.f334P[$i9] = $i8;
            this.f334P[$i9 + 1] = $i7;
            this.f334P[$i9 + 2] = $i6;
            this.f334P[$i9 + 3] = $i5;
            this.f334P[$i9 + 4] = $i4;
            this.f334P[$i9 + 5] = $i3;
            this.f334P[$i9 + 6] = $i2;
            this.f334P[$i9 + 7] = $i1;
        }
        for (int $i0 = 0; $i0 < 256; $i0 += 8) {
            $i7 += this.f334P[$i0 + 1];
            $i9 = $i6 + this.f334P[$i0 + 2];
            $i10 = $i5 + this.f334P[$i0 + 3];
            $i6 = $i4 + this.f334P[$i0 + 4];
            $i5 = $i3 + this.f334P[$i0 + 5];
            $i4 = $i2 + this.f334P[$i0 + 6];
            $i3 = $i1 + this.f334P[$i0 + 7];
            $i2 = ($i8 + this.f334P[$i0]) ^ ($i7 << 11);
            $i8 = $i10 + $i2;
            $i1 = ($i7 + $i9) ^ ($i9 >>> 2);
            $i7 = $i6 + $i1;
            $i9 = ($i9 + $i8) ^ ($i8 << 8);
            $i6 = $i5 + $i9;
            $i5 = ($i8 + $i7) ^ ($i7 >>> 16);
            $i8 = $i4 + $i5;
            $i4 = ($i7 + $i6) ^ ($i6 << 10);
            $i10 = $i3 + $i4;
            $i3 = ($i6 + $i8) ^ ($i8 >>> 4);
            $i11 = $i2 + $i3;
            $i2 = ($i8 + $i10) ^ ($i10 << 8);
            $i7 = $i1 + $i2;
            $i1 = ($i10 + $i11) ^ ($i11 >>> 9);
            $i6 = $i9 + $i1;
            $i8 = $i11 + $i7;
            this.f334P[$i0] = $i8;
            this.f334P[$i0 + 1] = $i7;
            this.f334P[$i0 + 2] = $i6;
            this.f334P[$i0 + 3] = $i5;
            this.f334P[$i0 + 4] = $i4;
            this.f334P[$i0 + 5] = $i3;
            this.f334P[$i0 + 6] = $i2;
            this.f334P[$i0 + 7] = $i1;
        }
        an((byte) -12);
        this.count = 1402439424;
    }

    final int get() {
        if (811236919 * this.count == 0) {
            an((byte) 44);
            this.count = 299622413;
        }
        return this.blockSize[(this.count * 863538167) - 1];
    }

    final int init() {
        int $i0 = this.count - 1817417607;
        this.count = $i0;
        if (($i0 * 811236919) + 1 == 0) {
            an((byte) -20);
            this.count = -414978183;
        }
        return this.blockSize[this.count * 811236919];
    }

    final int init(byte b) {
        try {
            if (this.count * 811236919 == 0) {
                an((byte) -94);
                this.count = 1402439424;
            }
            return this.blockSize[(this.count * 811236919) - 1];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "if.ad(" + ')');
        }
    }

    final int init(int i) {
        try {
            i = this.count - 1817417607;
            this.count = i;
            if ((i * 811236919) + 1 == 0) {
                an((byte) 22);
                this.count = -414978183;
            }
            return this.blockSize[this.count * 811236919];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "if.af(" + ')');
        }
    }

    final int process() {
        if (this.count * 811236919 == 0) {
            an((byte) 17);
            this.count = -1830239311;
        }
        return this.blockSize[(this.count * 811236919) - 1];
    }

    final int processBlock() {
        int $i0 = this.count - 1817417607;
        this.count = $i0;
        if (($i0 * 811236919) + 1 == 0) {
            an((byte) 43);
            this.count = -414978183;
        }
        return this.blockSize[this.count * 811236919];
    }

    final void processBlock(byte b) {
        try {
            int $i1 = this.f337g;
            int $i2 = this.f336b + 541898485;
            this.f336b = $i2;
            this.f337g = $i1 + ($i2 * 397091059);
            for ($i1 = 0; $i1 < 256; $i1++) {
                $i2 = this.f334P[$i1];
                if (($i1 & 2) == 0) {
                    if (($i1 & 1) == 0) {
                        this.f335T = ((this.f335T * -102381039) ^ ((this.f335T * -102381039) << 13)) * 327837425;
                    } else {
                        this.f335T = ((this.f335T * -102381039) ^ ((this.f335T * -102381039) >>> 6)) * 327837425;
                    }
                } else if (($i1 & 1) == 0) {
                    this.f335T = ((this.f335T * -102381039) ^ ((this.f335T * -102381039) << 2)) * 327837425;
                } else {
                    this.f335T = ((this.f335T * -102381039) ^ ((this.f335T * -102381039) >>> 16)) * 327837425;
                }
                this.f335T += this.f334P[($i1 + Constants.f93X) & 255] * 327837425;
                int $i3 = (this.f337g * 1781830767) + ((this.f335T * -102381039) + this.f334P[($i2 & 1020) >> 2]);
                this.f334P[$i1] = $i3;
                int[] $r1 = this.blockSize;
                $i2 = ($i2 + this.f334P[(($i3 >> 8) & 1020) >> 2]) * 2018986639;
                this.f337g = $i2;
                $r1[$i1] = $i2 * 1781830767;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "if.an(" + ')');
        }
    }

    final int reset() {
        int $i0 = this.count - -1496562348;
        this.count = $i0;
        if (($i0 * -922956318) + 1 == 0) {
            an((byte) -25);
            this.count = -414978183;
        }
        return this.blockSize[811236919 * this.count];
    }

    final void setKey() {
        int $i9;
        int $i1 = -1640531527;
        int $i2 = -1071727365;
        int $i3 = 923569171;
        int $i4 = 2145801086;
        int $i5 = -1914313336;
        int $i6 = -1640531527;
        int $i7 = -1640531527;
        int $i8 = -1640531527;
        for ($i9 = 0; $i9 < 4; $i9++) {
            $i8 ^= $i5 << 11;
            $i4 += $i8;
            $i5 = ($i5 + $i7) ^ ($i7 >>> 2);
            $i6 += $i5;
            $i7 = ($i7 + $i4) ^ ($i4 << 8);
            $i3 += $i7;
            $i4 = ($i4 + $i6) ^ ($i6 >>> 16);
            $i1 += $i4;
            $i6 = ($i6 + $i3) ^ ($i3 << 10);
            $i2 += $i6;
            $i3 = ($i3 + $i1) ^ ($i1 >>> 4);
            $i8 += $i3;
            $i1 = ($i1 + $i2) ^ ($i2 << 8);
            $i5 += $i1;
            $i2 = ($i2 + $i8) ^ ($i8 >>> 9);
            $i7 += $i2;
            $i8 += $i5;
        }
        for ($i9 = 0; $i9 < 256; $i9 += 8) {
            int $i10 = $i5 + this.blockSize[$i9 + 1];
            $i5 = $i7 + this.blockSize[$i9 + 2];
            int $i11 = $i4 + this.blockSize[$i9 + 3];
            $i7 = $i6 + this.blockSize[$i9 + 4];
            $i4 = $i3 + this.blockSize[$i9 + 5];
            $i6 = $i1 + this.blockSize[$i9 + 6];
            $i3 = $i2 + this.blockSize[$i9 + 7];
            $i1 = ($i8 + this.blockSize[$i9]) ^ ($i10 << 11);
            $i8 = $i11 + $i1;
            $i2 = ($i10 + $i5) ^ ($i5 >>> 2);
            $i10 = $i7 + $i2;
            $i7 = ($i5 + $i8) ^ ($i8 << 8);
            $i5 = $i4 + $i7;
            $i4 = ($i8 + $i10) ^ ($i10 >>> 16);
            $i8 = $i6 + $i4;
            $i6 = ($i10 + $i5) ^ ($i5 << 10);
            $i10 = $i3 + $i6;
            $i3 = ($i5 + $i8) ^ ($i8 >>> 4);
            $i11 = $i1 + $i3;
            $i1 = ($i8 + $i10) ^ ($i10 << 8);
            $i5 = $i2 + $i1;
            $i2 = ($i10 + $i11) ^ ($i11 >>> 9);
            $i7 += $i2;
            $i8 = $i11 + $i5;
            this.f334P[$i9] = $i8;
            this.f334P[$i9 + 1] = $i5;
            this.f334P[$i9 + 2] = $i7;
            this.f334P[$i9 + 3] = $i4;
            this.f334P[$i9 + 4] = $i6;
            this.f334P[$i9 + 5] = $i3;
            this.f334P[$i9 + 6] = $i1;
            this.f334P[$i9 + 7] = $i2;
        }
        for (int $i0 = 0; $i0 < 256; $i0 += 8) {
            $i5 += this.f334P[$i0 + 1];
            $i9 = $i7 + this.f334P[$i0 + 2];
            $i10 = $i4 + this.f334P[$i0 + 3];
            $i7 = $i6 + this.f334P[$i0 + 4];
            $i4 = $i3 + this.f334P[$i0 + 5];
            $i6 = $i1 + this.f334P[$i0 + 6];
            $i3 = $i2 + this.f334P[$i0 + 7];
            $i1 = ($i8 + this.f334P[$i0]) ^ ($i5 << 11);
            $i8 = $i10 + $i1;
            $i2 = ($i5 + $i9) ^ ($i9 >>> 2);
            $i5 = $i7 + $i2;
            $i9 = ($i9 + $i8) ^ ($i8 << 8);
            $i7 = $i4 + $i9;
            $i4 = ($i8 + $i5) ^ ($i5 >>> 16);
            $i8 = $i6 + $i4;
            $i6 = ($i5 + $i7) ^ ($i7 << 10);
            $i10 = $i3 + $i6;
            $i3 = ($i7 + $i8) ^ ($i8 >>> 4);
            $i11 = $i1 + $i3;
            $i1 = ($i8 + $i10) ^ ($i10 << 8);
            $i5 = $i2 + $i1;
            $i2 = ($i10 + $i11) ^ ($i11 >>> 9);
            $i7 = $i9 + $i2;
            $i8 = $i11 + $i5;
            this.f334P[$i0] = $i8;
            this.f334P[$i0 + 1] = $i5;
            this.f334P[$i0 + 2] = $i7;
            this.f334P[$i0 + 3] = $i4;
            this.f334P[$i0 + 4] = $i6;
            this.f334P[$i0 + 5] = $i3;
            this.f334P[$i0 + 6] = $i1;
            this.f334P[$i0 + 7] = $i2;
        }
        an((byte) -58);
        this.count = 277976424;
    }

    final void setKey(byte b) {
        int $i10;
        int $i2 = -1640531527;
        int $i3 = -1640531527;
        int $i4 = -1640531527;
        int $i5 = -1640531527;
        int $i6 = -1640531527;
        int $i7 = -1640531527;
        int $i8 = -1640531527;
        int $i9 = -1640531527;
        for ($i10 = 0; $i10 < 4; $i10++) {
            $i9 ^= $i8 << 11;
            $i6 += $i9;
            $i8 = ($i8 + $i7) ^ ($i7 >>> 2);
            $i5 += $i8;
            $i7 = ($i7 + $i6) ^ ($i6 << 8);
            $i4 += $i7;
            $i6 = ($i6 + $i5) ^ ($i5 >>> 16);
            $i3 += $i6;
            $i5 = ($i5 + $i4) ^ ($i4 << 10);
            $i2 += $i5;
            $i4 = ($i4 + $i3) ^ ($i3 >>> 4);
            $i9 += $i4;
            $i3 = ($i3 + $i2) ^ ($i2 << 8);
            $i8 += $i3;
            $i2 = ($i2 + $i9) ^ ($i9 >>> 9);
            $i7 += $i2;
            $i9 += $i8;
        }
        $i10 = 0;
        while ($i10 < 256) {
            int $i11 = $i8 + this.blockSize[$i10 + 1];
            $i8 = $i7 + this.blockSize[$i10 + 2];
            int $i12 = $i6 + this.blockSize[$i10 + 3];
            $i7 = $i5 + this.blockSize[$i10 + 4];
            try {
                $i6 = $i4 + this.blockSize[$i10 + 5];
                $i5 = $i3 + this.blockSize[$i10 + 6];
                $i4 = $i2 + this.blockSize[$i10 + 7];
                $i3 = ($i9 + this.blockSize[$i10]) ^ ($i11 << 11);
                $i9 = $i12 + $i3;
                $i2 = ($i11 + $i8) ^ ($i8 >>> 2);
                $i11 = $i7 + $i2;
                $i7 = ($i8 + $i9) ^ ($i9 << 8);
                $i8 = $i6 + $i7;
                $i6 = ($i9 + $i11) ^ ($i11 >>> 16);
                $i9 = $i5 + $i6;
                $i5 = ($i11 + $i8) ^ ($i8 << 10);
                $i11 = $i4 + $i5;
                $i4 = ($i8 + $i9) ^ ($i9 >>> 4);
                $i12 = $i3 + $i4;
                $i3 = ($i9 + $i11) ^ ($i11 << 8);
                $i8 = $i2 + $i3;
                $i2 = ($i11 + $i12) ^ ($i12 >>> 9);
                $i7 += $i2;
                $i9 = $i12 + $i8;
                this.f334P[$i10] = $i9;
                this.f334P[$i10 + 1] = $i8;
                this.f334P[$i10 + 2] = $i7;
                this.f334P[$i10 + 3] = $i6;
                this.f334P[$i10 + 4] = $i5;
                this.f334P[$i10 + 5] = $i4;
                this.f334P[$i10 + 6] = $i3;
                this.f334P[$i10 + 7] = $i2;
                $i10 += 8;
            } catch (Throwable $r2) {
                throw StringBuilder.append($r2, "if.aa(" + ')');
            }
        }
        for (int $i1 = 0; $i1 < 256; $i1 += 8) {
            $i10 = $i9 + this.f334P[$i1];
            $i9 = $i8 + this.f334P[$i1 + 1];
            $i8 = $i7 + this.f334P[$i1 + 2];
            $i11 = $i6 + this.f334P[$i1 + 3];
            $i7 = $i5 + this.f334P[$i1 + 4];
            $i6 = $i4 + this.f334P[$i1 + 5];
            $i5 = $i3 + this.f334P[$i1 + 6];
            $i4 = $i2 + this.f334P[$i1 + 7];
            $i3 = $i10 ^ ($i9 << 11);
            $i11 += $i3;
            $i2 = ($i9 + $i8) ^ ($i8 >>> 2);
            $i7 += $i2;
            $i10 = ($i8 + $i11) ^ ($i11 << 8);
            $i8 = $i6 + $i10;
            $i6 = ($i11 + $i7) ^ ($i7 >>> 16);
            $i9 = $i5 + $i6;
            $i5 = ($i7 + $i8) ^ ($i8 << 10);
            $i7 = $i4 + $i5;
            $i4 = ($i8 + $i9) ^ ($i9 >>> 4);
            $i11 = $i3 + $i4;
            $i3 = ($i9 + $i7) ^ ($i7 << 8);
            $i8 = $i2 + $i3;
            $i2 = ($i7 + $i11) ^ ($i11 >>> 9);
            $i7 = $i10 + $i2;
            $i9 = $i11 + $i8;
            this.f334P[$i1] = $i9;
            this.f334P[$i1 + 1] = $i8;
            this.f334P[$i1 + 2] = $i7;
            this.f334P[$i1 + 3] = $i6;
            this.f334P[$i1 + 4] = $i5;
            this.f334P[$i1 + 5] = $i4;
            this.f334P[$i1 + 6] = $i3;
            this.f334P[$i1 + 7] = $i2;
        }
        an((byte) -78);
        this.count = 1402439424;
    }

    final int skip() {
        int $i0 = this.count - -1088175565;
        this.count = $i0;
        if (($i0 * -2133457882) + 1 == 0) {
            an((byte) 86);
            this.count = -414978183;
        }
        return this.blockSize[811236919 * this.count];
    }

    final int update() {
        int $i0 = this.count - 1817417607;
        this.count = $i0;
        if (($i0 * 811236919) + 1 == 0) {
            an((byte) -77);
            this.count = -414978183;
        }
        return this.blockSize[this.count * 811236919];
    }
}
