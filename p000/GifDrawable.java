package p000;

/* compiled from: nb */
public class GifDrawable extends Object {
    static int view;
    byte[] bytes;
    int count;
    short[] data;
    User[] header;
    int[] name;
    Chunk[] size;
    byte[] state;
    byte[] type;

    GifDrawable(byte[] bArr) {
        try {
            int $i1;
            int $i3;
            int $i4;
            int $i5;
            int $i6;
            int $i8;
            int $i52;
            Chunk $r9;
            short[] $r5;
            byte $b2;
            byte $b9;
            byte $i53;
            Object object = this;
            this.header = new User[Constants.f93X];
            this.data = new short[Constants.f93X];
            this.type = new byte[Constants.f93X];
            this.state = new byte[Constants.f93X];
            this.size = new Chunk[Constants.f93X];
            this.bytes = new byte[Constants.f93X];
            this.name = new int[Constants.f93X];
            Logger $r2 = new Logger(bArr);
            int $i0 = 0;
            while ($r2.size[($r2.data * 1978945739) + $i0] != (byte) 0) {
                $i0++;
            }
            byte[] $r11 = new byte[$i0];
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r11[$i1] = $r2.next(1247983979);
            }
            $r2.data += 2065011939;
            $i1 = 1978945739 * $r2.data;
            $r2.data = (($i0 + 1) * 2065011939) + $r2.data;
            $i0 = 0;
            while ($r2.size[($r2.data * 1978945739) + $i0] != (byte) 0) {
                $i0++;
            }
            byte[] $r10 = new byte[$i0];
            for ($i3 = 0; $i3 < $i0; $i3++) {
                $r10[$i3] = $r2.next(1247983979);
            }
            $r2.data += 2065011939;
            $i3 = $r2.data * 1978945739;
            $r2.data = (($i0 + 1) * 2065011939) + $r2.data;
            $i0 = 0;
            while ($r2.size[(1978945739 * $r2.data) + $i0] != (byte) 0) {
                $i0++;
            }
            byte[] $r12 = new byte[$i0];
            for ($i4 = 0; $i4 < $i0; $i4++) {
                $r12[$i4] = $r2.next(1247983979);
            }
            $r2.data += 2065011939;
            $i0++;
            byte[] $r3 = new byte[$i0];
            if ($i0 > 1) {
                $r3[1] = (byte) 1;
                $i4 = 1;
                $i5 = 2;
                $i6 = 2;
                while ($i6 < $i0) {
                    int $i7 = $r2.get((byte) 0);
                    $i8 = $i7;
                    if ($i7 == 0) {
                        $i7 = $i5 + 1;
                    } else {
                        if ($i7 <= $i4) {
                            $i8 = $i7 - 1;
                        }
                        $i7 = $i5;
                        $i5 = $i8;
                    }
                    $r3[$i6] = (byte) $i5;
                    $i6++;
                    $i4 = $i5;
                    $i5 = $i7;
                }
                $i0 = $i5;
            }
            Chunk[] $r7 = new Chunk[$i0];
            $i4 = 0;
            while (true) {
                $i52 = $r7.length;
                if ($i4 >= $i52) {
                    break;
                }
                byte[] $r1;
                $r9 = new Chunk();
                $r7[$i4] = $r9;
                $i5 = $r2.get((byte) 0);
                if ($i5 > 0) {
                    $r1 = new byte[($i5 * 2)];
                    $r9.value = $r1;
                }
                $i5 = $r2.get((byte) 0);
                if ($i5 > 0) {
                    $r1 = new byte[(($i5 * 2) + 2)];
                    $r9.type = $r1;
                    $r9.type[1] = (byte) 64;
                }
                $i4++;
            }
            $i4 = $r2.get((byte) 0);
            byte[] $r6 = $i4 > 0 ? new byte[($i4 * 2)] : null;
            $i4 = $r2.get((byte) 0);
            bArr = $i4 > 0 ? new byte[($i4 * 2)] : null;
            $i4 = 0;
            while (true) {
                $i52 = $r2.data * 1978945739;
                $i5 = $i52;
                if ($r2.size[$i52 + $i4] == (byte) 0) {
                    break;
                }
                $i4++;
            }
            byte[] $r14 = new byte[$i4];
            for ($i5 = 0; $i5 < $i4; $i5++) {
                $r14[$i5] = $r2.next(1247983979);
            }
            $r2.data += 2065011939;
            $i4 = 0;
            for ($i5 = 0; $i5 < 128; $i5++) {
                $i4 += $r2.get((byte) 0);
                this.data[$i5] = (short) $i4;
            }
            $i4 = 0;
            for ($i5 = 0; $i5 < 128; $i5++) {
                $i4 += $r2.get((byte) 0);
                $r5 = this.data;
                $r5[$i5] = (short) ($r5[$i5] + ($i4 << 8));
            }
            $i8 = 0;
            $i4 = 0;
            $i6 = 0;
            $i5 = 0;
            while ($i5 < 128) {
                if ($i6 == 0) {
                    $i52 = $r14.length;
                    if ($i4 < $i52) {
                        $i8 = $i4 + 1;
                        $b2 = $r14[$i4];
                    } else {
                        $b2 = (byte) -1;
                        $i8 = $i4;
                    }
                    $i6 = $b2;
                    $i4 = $i8;
                    $i8 = $r2.parse(-1680468067);
                }
                $r5 = this.data;
                $r5[$i5] = (short) ($r5[$i5] + ((($i8 - 1) & 2) << 14));
                this.name[$i5] = $i8;
                $i5++;
                $i6--;
            }
            $i6 = 0;
            $i4 = 0;
            $i8 = 0;
            for ($i5 = 0; $i5 < 128; $i5++) {
                if (this.name[$i5] != 0) {
                    if ($i8 == 0) {
                        $i52 = $r11.length;
                        if ($i4 < $i52) {
                            $b2 = $r11[$i4];
                            $i4++;
                        } else {
                            $b2 = (byte) -1;
                        }
                        $b9 = $r2.size[$i1];
                        $i1++;
                        $i6 = $b9 - 1;
                        $i8 = $b2;
                    }
                    this.bytes[$i5] = (byte) $i6;
                    $i8--;
                }
            }
            $i6 = 0;
            $i1 = 0;
            $i4 = 0;
            for ($i5 = 0; $i5 < 128; $i5++) {
                if (this.name[$i5] != 0) {
                    if ($i4 == 0) {
                        if ($i1 < $r10.length) {
                            $i4 = $r10[$i1];
                            $i1++;
                        } else {
                            $i4 = -1;
                        }
                        $i6 = ($r2.size[$i3] + 16) << 2;
                        $i3++;
                    }
                    this.state[$i5] = (byte) $i6;
                    $i4--;
                }
            }
            $r9 = null;
            $i3 = 0;
            $i4 = 0;
            for ($i1 = 0; $i1 < Constants.f93X; $i1++) {
                if (this.name[$i1] != 0) {
                    if ($i4 == 0) {
                        $r9 = $r7[$r3[$i3]];
                        if ($i3 < $r12.length) {
                            byte $i42 = $r12[$i3];
                            $i3++;
                        } else {
                            $i4 = -1;
                        }
                    }
                    this.size[$i1] = $r9;
                    $i4--;
                }
            }
            $i3 = 0;
            $i1 = 0;
            $i5 = 0;
            $i4 = 0;
            while ($i4 < Constants.f93X) {
                if ($i5 == 0) {
                    $i52 = $r14.length;
                    if ($i1 < $i52) {
                        $i5 = $r14[$i1];
                        $i1++;
                    } else {
                        $i5 = -1;
                    }
                    if (this.name[$i4] > 0) {
                        $i3 = $r2.get((byte) 0) + 1;
                    }
                }
                this.type[$i4] = (byte) $i3;
                $i4++;
                $i5--;
            }
            this.count = ($r2.get((byte) 0) + 1) * -726688045;
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r9 = $r7[$i1];
                if ($r9.value != null) {
                    for ($i3 = 1; $i3 < $r9.value.length; $i3 += 2) {
                        $r9.value[$i3] = $r2.next(1247983979);
                    }
                }
                if ($r9.type != null) {
                    for ($i3 = 3; $i3 < $r9.type.length - 2; $i3 += 2) {
                        $r9.type[$i3] = $r2.next(1247983979);
                    }
                    continue;
                }
            }
            if ($r6 != null) {
                for ($i1 = 1; $i1 < $r6.length; $i1 += 2) {
                    $r6[$i1] = $r2.next(1247983979);
                }
            }
            if (bArr != null) {
                for ($i1 = 1; $i1 < bArr.length; $i1 += 2) {
                    bArr[$i1] = $r2.next(1247983979);
                }
            }
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r9 = $r7[$i1];
                if ($r9.type != null) {
                    $i4 = 0;
                    $i3 = 2;
                    while (true) {
                        $i52 = $r9.type.length;
                        if ($i3 >= $i52) {
                            continue;
                            break;
                        }
                        $i4 = ($i4 + 1) + $r2.get((byte) 0);
                        $r9.type[$i3] = (byte) $i4;
                        $i3 += 2;
                    }
                }
            }
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r9 = $r7[$i1];
                if ($r9.value != null) {
                    $i4 = 0;
                    $i3 = 2;
                    while (true) {
                        $i52 = $r9.value.length;
                        if ($i3 >= $i52) {
                            continue;
                            break;
                        }
                        $i4 = ($i4 + 1) + $r2.get((byte) 0);
                        $r9.value[$i3] = (byte) $i4;
                        $i3 += 2;
                    }
                }
            }
            if ($r6 != null) {
                byte $i12;
                $i1 = $r2.get((byte) 0);
                $i3 = $i1;
                $r6[0] = (byte) $i1;
                for ($i1 = 2; $i1 < $r6.length; $i1 += 2) {
                    $i3 = ($i3 + 1) + $r2.get((byte) 0);
                    $r6[$i1] = (byte) $i3;
                }
                $b9 = $r6[0];
                $b2 = $r6[1];
                for ($i12 = (byte) 0; $i12 < $b9; $i12++) {
                    this.type[$i12] = (byte) (((this.type[$i12] * $b2) + 32) >> 6);
                }
                $i3 = 2;
                $i12 = $b9;
                while ($i3 < $r6.length) {
                    $b9 = $r6[$i3];
                    byte $b10 = $r6[$i3 + 1];
                    $i52 = ($b9 - $i1) * $b2;
                    $i5 = $i52;
                    $i4 = (($b9 - $i1) / 2) + $i52;
                    for ($i53 = $i1; $i53 < $b9; $i53++) {
                        this.type[$i53] = (byte) (((HashMap.update($i4, $b9 - $i1, 1681357304) * this.type[$i53]) + 32) >> 6);
                        $i4 += $b10 - $b2;
                    }
                    $i3 += 2;
                    $b2 = $b10;
                    $i1 = $b9;
                }
                while ($i1 < Constants.f93X) {
                    this.type[$i1] = (byte) (((this.type[$i1] * $b2) + 32) >> 6);
                    $i1++;
                }
            }
            if (bArr != null) {
                $i1 = $r2.get((byte) 0);
                $i3 = $i1;
                bArr[0] = (byte) $i1;
                for ($i1 = 2; $i1 < bArr.length; $i1 += 2) {
                    $i3 = ($i3 + 1) + $r2.get((byte) 0);
                    bArr[$i1] = (byte) $i3;
                }
                $b2 = bArr[0];
                $i1 = bArr[1] << 1;
                for (byte $i32 = (byte) 0; $i32 < $b2; $i32++) {
                    $i4 = (this.state[$i32] & (short) 255) + $i1;
                    if ($i4 < 0) {
                        $i4 = 0;
                    }
                    if ($i4 > Constants.f93X) {
                        $i4 = Constants.f93X;
                    }
                    this.state[$i32] = (byte) $i4;
                }
                $i3 = 2;
                while ($i3 < bArr.length) {
                    $b9 = bArr[$i3];
                    $i4 = bArr[$i3 + 1] << 1;
                    $i6 = (($b9 - $b2) * $i1) + (($b9 - $b2) / 2);
                    for ($i53 = $b2; $i53 < $b9; $i53++) {
                        byte update = HashMap.update($i6, $b9 - $b2, -1540188955) + (this.state[$i53] & (short) 255);
                        if (update < (byte) 0) {
                            update = (byte) 0;
                        }
                        if (update > Constants.f93X) {
                            update = Byte.MIN_VALUE;
                        }
                        this.state[$i53] = (byte) update;
                        $i6 += $i4 - $i1;
                    }
                    $i3 += 2;
                    $i1 = $i4;
                    $b2 = $b9;
                }
                for ($i3 = $b2; $i3 < Constants.f93X; $i3++) {
                    $i4 = (this.state[$i3] & (short) 255) + $i1;
                    if ($i4 < 0) {
                        $i4 = 0;
                    }
                    if ($i4 > Constants.f93X) {
                        $i4 = Constants.f93X;
                    }
                    this.state[$i3] = (byte) $i4;
                }
            }
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r7[$i1].position = $r2.get((byte) 0) * -529915055;
            }
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r9 = $r7[$i1];
                if ($r9.value != null) {
                    $r9.key = $r2.get((byte) 0) * -1807563047;
                }
                if ($r9.type != null) {
                    $r9.pos = $r2.get((byte) 0) * 851611311;
                }
                if ($r9.position * 400360881 > 0) {
                    $r9.size = $r2.get((byte) 0) * 130426205;
                }
            }
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r7[$i1].content = $r2.get((byte) 0) * 2031947481;
            }
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r9 = $r7[$i1];
                if (1468830057 * $r9.content > 0) {
                    $r9.length = $r2.get((byte) 0) * 876330179;
                }
            }
            for ($i1 = 0; $i1 < $i0; $i1++) {
                $r9 = $r7[$i1];
                if ($r9.length * 1204278251 > 0) {
                    $r9.id = $r2.get((byte) 0) * 102558217;
                }
            }
        } catch (RuntimeException $r15) {
            throw StringBuilder.append($r15, "nb.<init>(" + ')');
        }
    }

    static final void create(int i) {
        if (-236480925 * client.text <= 0) {
            try {
                if (LinkedList.toString(191731252) <= 60000 + (8910287064128864421L * Client.count)) {
                    client.names.create(-1398342445);
                    IllegalStateException.add(40, -2031373184);
                    JGitText.value = client.this$0.get(1217888446);
                    client.this$0.parse(-2010783442);
                    return;
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "nb.bg(" + ')');
            }
        }
        NodeList.add(20665930);
    }

    boolean decode(GifDecoder gifDecoder, byte[] bArr, int[] iArr) {
        boolean $z0 = true;
        User $r4 = null;
        int $i0 = 0;
        int $i1 = 0;
        while ($i0 < Constants.f93X) {
            if (bArr == null || bArr[$i0] != (byte) 0) {
                int $i3 = this.name[$i0];
                if ($i3 != 0) {
                    if ($i3 != $i1) {
                        $i1 = $i3 - 1;
                        $r4 = ($i1 & 1) == 0 ? gifDecoder.read($i1 >> 2, iArr, (byte) -35) : gifDecoder.read($i1 >> 2, iArr, 842696807);
                        if ($r4 == null) {
                            $i1 = $i3;
                            $z0 = false;
                        } else {
                            $i1 = $i3;
                        }
                    }
                    if ($r4 != null) {
                        this.header[$i0] = $r4;
                        this.name[$i0] = 0;
                    }
                }
            }
            $i0++;
        }
        return $z0;
    }

    boolean decode(GifDecoder gifDecoder, byte[] bArr, int[] iArr, int i) {
        boolean $z0 = true;
        User $r4 = null;
        i = 0;
        int $i1 = 0;
        while (i < 128) {
            if (bArr != null) {
                if (bArr[i] == (byte) 0) {
                    continue;
                    i++;
                }
            }
            try {
                int $i3 = this.name[i];
                if ($i3 != 0) {
                    if ($i3 != $i1) {
                        $i1 = $i3 - 1;
                        $r4 = ($i1 & 1) == 0 ? gifDecoder.read($i1 >> 2, iArr, (byte) -97) : gifDecoder.read($i1 >> 2, iArr, 842696807);
                        if ($r4 == null) {
                            $i1 = $i3;
                            $z0 = false;
                        } else {
                            $i1 = $i3;
                        }
                    }
                    if ($r4 != null) {
                        this.header[i] = $r4;
                        this.name[i] = 0;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i++;
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "nb.af(" + ')');
            }
        }
        return $z0;
    }

    boolean encode(GifDecoder gifDecoder, byte[] bArr, int[] iArr) {
        boolean $z0 = true;
        User $r4 = null;
        int $i0 = 0;
        int $i1 = 0;
        while ($i0 < Constants.f93X) {
            if (bArr == null || bArr[$i0] != (byte) 0) {
                int $i3 = this.name[$i0];
                if ($i3 != 0) {
                    if ($i3 != $i1) {
                        $i1 = $i3 - 1;
                        $r4 = ($i1 & 1) == 0 ? gifDecoder.read($i1 >> 2, iArr, (byte) -78) : gifDecoder.read($i1 >> 2, iArr, 842696807);
                        if ($r4 == null) {
                            $i1 = $i3;
                            $z0 = false;
                        } else {
                            $i1 = $i3;
                        }
                    }
                    if ($r4 != null) {
                        this.header[$i0] = $r4;
                        this.name[$i0] = 0;
                    }
                }
            }
            $i0++;
        }
        return $z0;
    }

    void get(int i) {
        try {
            this.name = null;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nb.ad(" + ')');
        }
    }

    void recycle() {
        this.name = null;
    }

    void start() {
        this.name = null;
    }

    void stop() {
        this.name = null;
    }
}
