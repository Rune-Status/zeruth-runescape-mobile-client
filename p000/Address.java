package p000;

/* compiled from: fh */
public class Address extends Entry {
    int count;
    int data;
    int id;
    int key;
    int length;
    int name;
    int next;
    int offset;
    int parent;
    int size;
    int state;
    boolean text;
    int type;
    int value;
    int f6y;

    Address(User user, int i, int i2) {
        this.value = user;
        this.parent = user.name;
        this.offset = user.value;
        this.text = user.token;
        this.name = i;
        this.state = i2;
        this.f6y = 8192;
        this.size = 0;
        set();
    }

    Address(User user, int i, int i2, int i3) {
        this.value = user;
        this.parent = user.name;
        this.offset = user.value;
        this.text = user.token;
        this.name = i;
        this.state = i2;
        this.f6y = i3;
        this.size = 0;
        set();
    }

    static int add(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (FileInfo.INITIAL_MAX_FRAME_SIZE - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int add(int r6, int r7, byte[] r8, int[] r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.Address r19, int r20, int r21) {
        /*
        r0 = r19;
        r6 = r0.value;
        r0 = r19;
        r7 = r0.key;
        r7 = r7 * r11;
        r6 = r6 - r7;
        r0 = r19;
        r0.value = r6;
        if (r20 == 0) goto L_0x0020;
    L_0x0010:
        r6 = r18 - r10;
        r0 = r20;
        r6 = r6 + r0;
        r6 = r6 + -257;
        r0 = r20;
        r6 = r6 / r0;
        r7 = r6 + r11;
        r0 = r17;
        if (r7 <= r0) goto L_0x0022;
    L_0x0020:
        r7 = r17;
    L_0x0022:
        r6 = r11 << 1;
        r16 = r7 << 1;
        r11 = r13;
        r7 = r10;
    L_0x0028:
        r0 = r16;
        if (r6 >= r0) goto L_0x0074;
    L_0x002c:
        r13 = r7 >> 8;
        r2 = r8[r13];
        r10 = r2 << 8;
        r13 = r13 + 1;
        r3 = r8[r13];
        r13 = r3 - r2;
        r4 = r7 & 255;
        r13 = r13 * r4;
        r13 = r13 + r10;
        r10 = r6 + 1;
        r4 = r9[r6];
        r5 = r13 * r12;
        r5 = r5 >> 6;
        r4 = r4 + r5;
        r9[r6] = r4;
        r12 = r12 + r14;
        r6 = r10 + 1;
        r4 = r9[r10];
        r13 = r13 * r11;
        r13 = r13 >> 6;
        r13 = r13 + r4;
        r9[r10] = r13;
        r11 = r11 + r15;
        r0 = r20;
        r7 = r7 + r0;
        goto L_0x0028;
    L_0x0057:
        r7 = r12 >> 1;
        r0 = r19;
        r12 = r0.value;
        r0 = r19;
        r13 = r0.key;
        r13 = r13 * r7;
        r12 = r12 + r13;
        r0 = r19;
        r0.value = r12;
        r0 = r19;
        r0.next = r11;
        r0 = r19;
        r0.count = r10;
        r0 = r19;
        r0.size = r6;
        return r7;
    L_0x0074:
        if (r20 == 0) goto L_0x0087;
    L_0x0076:
        r10 = r6 >> 1;
        r13 = r18 - r7;
        r0 = r20;
        r13 = r13 + r0;
        r13 = r13 + -1;
        r0 = r20;
        r13 = r13 / r0;
        r10 = r10 + r13;
        r0 = r17;
        if (r10 <= r0) goto L_0x00d0;
    L_0x0087:
        r13 = r17 << 1;
        r10 = r11;
        r11 = r12;
        r12 = r6;
        r6 = r7;
    L_0x008d:
        if (r12 >= r13) goto L_0x0057;
    L_0x008f:
        r7 = r6 >> 8;
        r2 = r8[r7];
        r7 = r2 << 8;
        r16 = r21 - r2;
        r0 = r6 & 255;
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r0 = r0 * r1;
        r16 = r0;
        r0 = r0 + r7;
        r16 = r0;
        r7 = r12 + 1;
        r17 = r9[r12];
        r18 = r16 * r11;
        r18 = r18 >> 6;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r9[r12] = r17;
        r11 = r11 + r14;
        r12 = r7 + 1;
        r17 = r9[r7];
        r0 = r16;
        r0 = r0 * r10;
        r16 = r0;
        r16 = r16 >> 6;
        r0 = r16;
        r1 = r17;
        r0 = r0 + r1;
        r16 = r0;
        r9[r7] = r16;
        r10 = r10 + r15;
        r0 = r20;
        r6 = r6 + r0;
        goto L_0x008d;
    L_0x00d0:
        r17 = r10;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.add(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, Address, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int add(int r5, int r6, byte[] r7, int[] r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, p000.Address r16, int r17, int r18) {
        /*
        if (r17 == 0) goto L_0x0010;
    L_0x0002:
        r5 = r15 - r9;
        r0 = r17;
        r5 = r5 + r0;
        r5 = r5 + -257;
        r0 = r17;
        r5 = r5 / r0;
        r6 = r5 + r10;
        if (r6 <= r14) goto L_0x0011;
    L_0x0010:
        r6 = r14;
    L_0x0011:
        r5 = r10 << 1;
        r10 = r6 << 1;
        r6 = r9;
    L_0x0016:
        if (r5 >= r10) goto L_0x0041;
    L_0x0018:
        r13 = r6 >> 8;
        r1 = r7[r13];
        r9 = r1 << 8;
        r13 = r13 + 1;
        r2 = r7[r13];
        r13 = r2 - r1;
        r3 = r6 & 255;
        r13 = r13 * r3;
        r13 = r13 + r9;
        r9 = r5 + 1;
        r3 = r8[r5];
        r4 = r13 * r11;
        r4 = r4 >> 6;
        r3 = r3 + r4;
        r8[r5] = r3;
        r5 = r9 + 1;
        r3 = r8[r9];
        r13 = r13 * r12;
        r13 = r13 >> 6;
        r13 = r13 + r3;
        r8[r9] = r13;
        r0 = r17;
        r6 = r6 + r0;
        goto L_0x0016;
    L_0x0041:
        if (r17 == 0) goto L_0x0052;
    L_0x0043:
        r9 = r5 >> 1;
        r10 = r15 - r6;
        r0 = r17;
        r10 = r10 + r0;
        r10 = r10 + -1;
        r0 = r17;
        r10 = r10 / r0;
        r9 = r9 + r10;
        if (r9 <= r14) goto L_0x0082;
    L_0x0052:
        r9 = r14 << 1;
    L_0x0054:
        if (r5 >= r9) goto L_0x007b;
    L_0x0056:
        r10 = r6 >> 8;
        r1 = r7[r10];
        r10 = r1 << 8;
        r13 = r18 - r1;
        r14 = r6 & 255;
        r13 = r13 * r14;
        r13 = r13 + r10;
        r10 = r5 + 1;
        r14 = r8[r5];
        r15 = r13 * r11;
        r15 = r15 >> 6;
        r14 = r14 + r15;
        r8[r5] = r14;
        r5 = r10 + 1;
        r14 = r8[r10];
        r13 = r13 * r12;
        r13 = r13 >> 6;
        r13 = r13 + r14;
        r8[r10] = r13;
        r0 = r17;
        r6 = r6 + r0;
        goto L_0x0054;
    L_0x007b:
        r0 = r16;
        r0.size = r6;
        r5 = r5 >> 1;
        return r5;
    L_0x0082:
        r14 = r9;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.add(int, int, byte[], int[], int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int add(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        byte $b11;
        if (i7 != 0) {
            i4 = ((((i6 - $i7) + i7) - 257) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i8;
                i = $i7;
                while (i2 < i4) {
                    int $i10 = i >> 8;
                    $b11 = bArr[$i10];
                    iArr[i2] = (((((bArr[$i10 + 1] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i2++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = ((((i6 - i) + i7) - 1) / i7) + i2;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                while (i2 < i5) {
                    $b11 = bArr[i >> 8];
                    iArr[i2] = (((((i8 - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i += i7;
                    i2++;
                }
                address.size = i;
                return i2;
            }
        }
        i4 = i5;
        i2 = $i8;
        i = $i7;
        while (i2 < i4) {
            int $i102 = i >> 8;
            $b11 = bArr[$i102];
            iArr[i2] = (((((bArr[$i102 + 1] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
            i2++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = ((((i6 - i) + i7) - 1) / i7) + i2;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        while (i2 < i5) {
            $b11 = bArr[i >> 8];
            iArr[i2] = (((((i8 - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
            i += i7;
            i2++;
        }
        address.size = i;
        return i2;
    }

    static int add(int i, byte[] bArr, int[] iArr, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8, int i9, Address address) {
        i7 = i2 >> 8;
        int $i10 = i9 >> 8;
        $i3 <<= 2;
        i9 = i4 << 2;
        i = i5 << 2;
        i2 = i6 << 2;
        i4 = ($i10 + i3) - i7;
        if (i4 <= i8) {
            i8 = i4;
        }
        address.value += address.key * (i8 - i3);
        i5 = i3 << 1;
        i3 = (i8 << 1) - 6;
        i4 = $i3;
        $i3 = i5;
        i5 = i9;
        while ($i3 < i3) {
            i6 = i7 + 1;
            byte $b11 = bArr[i7];
            i8 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            $i3 = i6 + 1;
            $b11 = bArr[i6];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i4);
            i6 = i4 + i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i4 = $i3 + 1;
            $b11 = bArr[$i3];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i6);
            $i3 = i6 + i;
            i6 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i7 = i4 + 1;
            $b11 = bArr[i4];
            i8 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b11 * $i3);
            i4 = $i3 + i;
            $i3 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
        }
        i3 += 6;
        while ($i3 < i3) {
            i6 = i7 + 1;
            $b11 = bArr[i7];
            i7 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            $i3 = i7 + 1;
            iArr[i7] = ($b11 * i5) + iArr[i7];
            i5 += i2;
            i7 = i6;
        }
        address.next = i4 >> 2;
        address.count = i5 >> 2;
        address.size = i7 << 8;
        return $i3 >> 1;
    }

    static int add(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int $i6, Address address) {
        i6 = i2 >> 8;
        i = i4 << 2;
        i2 = i5 << 2;
        i4 = (($i6 >> 8) + i3) - i6;
        if (i4 <= i7) {
            i7 = i4;
        }
        i4 = i3 << 1;
        i3 = (i7 << 1) - 6;
        while (i4 < i3) {
            i5 = i6 + 1;
            byte $b8 = bArr[i6];
            i7 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i6 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i4 = i5 + 1;
            $b8 = bArr[i5];
            i5 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i6 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
            i5 = i4 + 1;
            $b8 = bArr[i4];
            i7 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i4 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i6 = i5 + 1;
            $b8 = bArr[i5];
            i5 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
        }
        i3 += 6;
        while (i4 < i3) {
            i5 = i6 + 1;
            $b8 = bArr[i6];
            i6 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i6 + 1;
            iArr[i6] = ($b8 * i2) + iArr[i6];
            i6 = i5;
        }
        address.size = i6 << 8;
        return i4 >> 1;
    }

    static int add(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int $i4, Address address) {
        i3 = i >> 8;
        i = i2 << 2;
        i2 = (($i4 >> 8) + $i1) - i3;
        if (i2 <= i4) {
            i4 = i2;
        }
        i2 = i4 - 3;
        while ($i1 < i2) {
            i4 = $i1 + 1;
            $i4 = i3 + 1;
            iArr[$i1] = (bArr[i3] * i) + iArr[$i1];
            $i1 = i4 + 1;
            i3 = $i4 + 1;
            iArr[i4] = iArr[i4] + (bArr[$i4] * i);
            i4 = $i1 + 1;
            $i4 = i3 + 1;
            iArr[$i1] = iArr[$i1] + (bArr[i3] * i);
            $i1 = i4 + 1;
            i3 = $i4 + 1;
            iArr[i4] = iArr[i4] + (bArr[$i4] * i);
        }
        i2 += 3;
        int $i6 = i3;
        while ($i1 < i2) {
            i4 = $i6 + 1;
            iArr[$i1] = (bArr[$i6] * i) + iArr[$i1];
            $i1++;
            $i6 = i4;
        }
        address.size = $i6 << 8;
        return $i1;
    }

    static int apply(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i7 + $i1) - i4;
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 + 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 + 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 + 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 + 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 + 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    static int clear(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int $i9, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        byte $b12;
        address.next -= address.length * $i8;
        address.count -= address.type * $i8;
        if (i7 != 0) {
            i4 = ((((i6 - $i7) + i7) - 257) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i9;
                i = $i7;
                while ($i8 < i4) {
                    int $i11 = i >> 8;
                    $b12 = bArr[$i11];
                    iArr[$i8] = (((((bArr[$i11 + 1] - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i8];
                    i2 += i3;
                    $i8++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = ((((i6 - i) + i7) - 1) / i7) + $i8;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = $i8;
                while ($i7 < i5) {
                    $b12 = bArr[i >> 8];
                    iArr[$i7] = (((((i8 - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i7];
                    i2 += i3;
                    i += i7;
                    $i7++;
                }
                address.next += address.length * $i7;
                address.count += address.type * $i7;
                address.value = i2;
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i9;
        i = $i7;
        while ($i8 < i4) {
            int $i112 = i >> 8;
            $b12 = bArr[$i112];
            iArr[$i8] = (((((bArr[$i112 + 1] - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i8];
            i2 += i3;
            $i8++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = ((((i6 - i) + i7) - 1) / i7) + $i8;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = $i8;
        while ($i7 < i5) {
            $b12 = bArr[i >> 8];
            iArr[$i7] = (((((i8 - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i7];
            i2 += i3;
            i += i7;
            $i7++;
        }
        address.next += address.length * $i7;
        address.count += address.type * $i7;
        address.value = i2;
        address.size = i;
        return $i7;
    }

    static int clone(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i7 + $i1) - i4;
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 + 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 + 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 + 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 + 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 + 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    public static Address clone(User user, int i, int i2, int i3) {
        return (user.data == null || user.data.length == 0) ? null : new Address(user, i, i2, i3);
    }

    static int copy(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int $i6, Address address) {
        i6 = i2 >> 8;
        i = i4 << 2;
        i2 = i5 << 2;
        i4 = (i3 + i6) - (($i6 >> 8) - 1);
        if (i4 <= i7) {
            i7 = i4;
        }
        i4 = i3 << 1;
        i3 = (i7 << 1) - 6;
        while (i4 < i3) {
            i5 = i6 - 1;
            byte $b8 = bArr[i6];
            i7 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i6 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i4 = i5 - 1;
            $b8 = bArr[i5];
            i5 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i6 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
            i5 = i4 - 1;
            $b8 = bArr[i4];
            i7 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i4 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i6 = i5 - 1;
            $b8 = bArr[i5];
            i5 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
        }
        i5 = i3 + 6;
        while (i4 < i5) {
            i3 = i6 - 1;
            $b8 = bArr[i6];
            i6 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i6 + 1;
            iArr[i6] = ($b8 * i2) + iArr[i6];
            i6 = i3;
        }
        address.size = i6 << 8;
        return i4 >> 1;
    }

    public static Address copy(User user, int i, int $i1) {
        return (user.data == null || user.data.length == 0) ? null : new Address(user, (int) (((((long) user.type) * 256) * ((long) i)) / ((long) (FileInfo.data * 1299793156))), $i1 << 6);
    }

    public static Address copy(User user, int i, int i2, int i3) {
        return (user.data == null || user.data.length == 0) ? null : new Address(user, i, i2, i3);
    }

    static int create(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i7 + $i1) - i4;
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 + 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 + 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 + 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 + 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 + 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    static int decryptBlock(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int $i6, Address address) {
        i6 = i2 >> 8;
        i = i4 << 2;
        i2 = i5 << 2;
        i4 = (i3 + i6) - (($i6 >> 8) - 1);
        if (i4 <= i7) {
            i7 = i4;
        }
        i4 = i3 << 1;
        i3 = (i7 << 1) - 6;
        while (i4 < i3) {
            i5 = i6 - 1;
            byte $b8 = bArr[i6];
            i7 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i6 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i4 = i5 - 1;
            $b8 = bArr[i5];
            i5 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i6 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
            i5 = i4 - 1;
            $b8 = bArr[i4];
            i7 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i4 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i6 = i5 - 1;
            $b8 = bArr[i5];
            i5 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
        }
        i5 = i3 + 6;
        while (i4 < i5) {
            i3 = i6 - 1;
            $b8 = bArr[i6];
            i6 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i6 + 1;
            iArr[i6] = ($b8 * i2) + iArr[i6];
            i6 = i3;
        }
        address.size = i6 << 8;
        return i4 >> 1;
    }

    static int draw(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int $i6, Address address) {
        i6 = i2 >> 8;
        i = i4 << 2;
        i2 = i5 << 2;
        i4 = (($i6 >> 8) + i3) - i6;
        if (i4 <= i7) {
            i7 = i4;
        }
        i4 = i3 << 1;
        i3 = (i7 << 1) - 6;
        while (i4 < i3) {
            i5 = i6 + 1;
            byte $b8 = bArr[i6];
            i7 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i6 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i4 = i5 + 1;
            $b8 = bArr[i5];
            i5 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i6 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
            i5 = i4 + 1;
            $b8 = bArr[i4];
            i7 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i4 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i6 = i5 + 1;
            $b8 = bArr[i5];
            i5 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
        }
        i3 += 6;
        while (i4 < i3) {
            i5 = i6 + 1;
            $b8 = bArr[i6];
            i6 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i6 + 1;
            iArr[i6] = ($b8 * i2) + iArr[i6];
            i6 = i5;
        }
        address.size = i6 << 8;
        return i4 >> 1;
    }

    static int encode(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int $i4, Address address) {
        i3 = i >> 8;
        i = i2 << 2;
        i2 = (($i4 >> 8) + $i1) - i3;
        if (i2 <= i4) {
            i4 = i2;
        }
        i2 = i4 - 3;
        while ($i1 < i2) {
            i4 = $i1 + 1;
            $i4 = i3 + 1;
            iArr[$i1] = (bArr[i3] * i) + iArr[$i1];
            $i1 = i4 + 1;
            i3 = $i4 + 1;
            iArr[i4] = iArr[i4] + (bArr[$i4] * i);
            i4 = $i1 + 1;
            $i4 = i3 + 1;
            iArr[$i1] = iArr[$i1] + (bArr[i3] * i);
            $i1 = i4 + 1;
            i3 = $i4 + 1;
            iArr[i4] = iArr[i4] + (bArr[$i4] * i);
        }
        i2 += 3;
        int $i6 = i3;
        while ($i1 < i2) {
            i4 = $i6 + 1;
            iArr[$i1] = (bArr[$i6] * i) + iArr[$i1];
            $i1++;
            $i6 = i4;
        }
        address.size = $i6 << 8;
        return $i1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int encryptBlock(int r6, int r7, byte[] r8, int[] r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.Address r19, int r20, int r21) {
        /*
        r0 = r19;
        r6 = r0.value;
        r0 = r19;
        r7 = r0.key;
        r7 = r7 * r11;
        r6 = r6 - r7;
        r0 = r19;
        r0.value = r6;
        if (r20 == 0) goto L_0x0021;
    L_0x0010:
        r0 = r18;
        r6 = r0 + 256;
        r6 = r6 - r10;
        r0 = r20;
        r6 = r6 + r0;
        r0 = r20;
        r6 = r6 / r0;
        r7 = r6 + r11;
        r0 = r17;
        if (r7 <= r0) goto L_0x0023;
    L_0x0021:
        r7 = r17;
    L_0x0023:
        r6 = r11 << 1;
        r16 = r7 << 1;
        r11 = r13;
        r7 = r10;
    L_0x0029:
        r0 = r16;
        if (r6 >= r0) goto L_0x0058;
    L_0x002d:
        r13 = r7 >> 8;
        r10 = r13 + -1;
        r2 = r8[r10];
        r10 = r2 << 8;
        r3 = r8[r13];
        r13 = r3 - r2;
        r4 = r7 & 255;
        r13 = r13 * r4;
        r13 = r13 + r10;
        r10 = r6 + 1;
        r4 = r9[r6];
        r5 = r13 * r12;
        r5 = r5 >> 6;
        r4 = r4 + r5;
        r9[r6] = r4;
        r12 = r12 + r14;
        r6 = r10 + 1;
        r4 = r9[r10];
        r13 = r13 * r11;
        r13 = r13 >> 6;
        r13 = r13 + r4;
        r9[r10] = r13;
        r11 = r11 + r15;
        r0 = r20;
        r7 = r7 + r0;
        goto L_0x0029;
    L_0x0058:
        if (r20 == 0) goto L_0x0069;
    L_0x005a:
        r10 = r6 >> 1;
        r13 = r18 - r7;
        r0 = r20;
        r13 = r13 + r0;
        r0 = r20;
        r13 = r13 / r0;
        r10 = r10 + r13;
        r0 = r17;
        if (r10 <= r0) goto L_0x00ce;
    L_0x0069:
        r13 = r17 << 1;
        r10 = r11;
        r11 = r12;
        r12 = r6;
        r6 = r7;
    L_0x006f:
        if (r12 >= r13) goto L_0x00b1;
    L_0x0071:
        r7 = r21 << 8;
        r16 = r6 >> 8;
        r2 = r8[r16];
        r16 = r2 - r21;
        r0 = r6 & 255;
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r0 = r0 * r1;
        r16 = r0;
        r16 = r7 + r16;
        r7 = r12 + 1;
        r17 = r9[r12];
        r18 = r16 * r11;
        r18 = r18 >> 6;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r9[r12] = r17;
        r11 = r11 + r14;
        r12 = r7 + 1;
        r17 = r9[r7];
        r0 = r16;
        r0 = r0 * r10;
        r16 = r0;
        r16 = r16 >> 6;
        r0 = r16;
        r1 = r17;
        r0 = r0 + r1;
        r16 = r0;
        r9[r7] = r16;
        r10 = r10 + r15;
        r0 = r20;
        r6 = r6 + r0;
        goto L_0x006f;
    L_0x00b1:
        r7 = r12 >> 1;
        r0 = r19;
        r12 = r0.value;
        r0 = r19;
        r13 = r0.key;
        r13 = r13 * r7;
        r12 = r12 + r13;
        r0 = r19;
        r0.value = r12;
        r0 = r19;
        r0.next = r11;
        r0 = r19;
        r0.count = r10;
        r0 = r19;
        r0.size = r6;
        return r7;
    L_0x00ce:
        r17 = r10;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.encryptBlock(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int encryptBlock(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int $i6, Address address) {
        i6 = i2 >> 8;
        i = i4 << 2;
        i2 = i5 << 2;
        i4 = (i3 + i6) - (($i6 >> 8) - 1);
        if (i4 <= i7) {
            i7 = i4;
        }
        i4 = i3 << 1;
        i3 = (i7 << 1) - 6;
        while (i4 < i3) {
            i5 = i6 - 1;
            byte $b8 = bArr[i6];
            i7 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i6 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i4 = i5 - 1;
            $b8 = bArr[i5];
            i5 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i6 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
            i5 = i4 - 1;
            $b8 = bArr[i4];
            i7 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i4 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i6 = i5 - 1;
            $b8 = bArr[i5];
            i5 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
        }
        i3 += 6;
        while (i4 < i3) {
            i5 = i6 - 1;
            $b8 = bArr[i6];
            i6 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i6 + 1;
            iArr[i6] = ($b8 * i2) + iArr[i6];
            i6 = i5;
        }
        address.size = i6 << 8;
        return i4 >> 1;
    }

    public static Address equals(User user, int i, int i2, int i3) {
        return (user.data == null || user.data.length == 0) ? null : new Address(user, i, i2, i3);
    }

    static int extract(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int $i4, Address address) {
        i3 = i >> 8;
        i = i2 << 2;
        i2 = (($i4 >> 8) + $i1) - i3;
        if (i2 <= i4) {
            i4 = i2;
        }
        i2 = i4 - 3;
        while ($i1 < i2) {
            i4 = $i1 + 1;
            $i4 = i3 + 1;
            iArr[$i1] = (bArr[i3] * i) + iArr[$i1];
            $i1 = i4 + 1;
            i3 = $i4 + 1;
            iArr[i4] = iArr[i4] + (bArr[$i4] * i);
            i4 = $i1 + 1;
            $i4 = i3 + 1;
            iArr[$i1] = iArr[$i1] + (bArr[i3] * i);
            $i1 = i4 + 1;
            i3 = $i4 + 1;
            iArr[i4] = iArr[i4] + (bArr[$i4] * i);
        }
        i2 += 3;
        int $i6 = i3;
        while ($i1 < i2) {
            i4 = $i6 + 1;
            iArr[$i1] = (bArr[$i6] * i) + iArr[$i1];
            $i1++;
            $i6 = i4;
        }
        address.size = $i6 << 8;
        return $i1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int format(int r6, int r7, byte[] r8, int[] r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, p000.Address r17, int r18, int r19) {
        /*
        if (r18 == 0) goto L_0x0012;
    L_0x0002:
        r6 = r16 - r10;
        r0 = r18;
        r6 = r6 + r0;
        r1 = 1318529535; // 0x4e9729ff float:1.26805594E9 double:6.514401463E-315;
        r6 = r6 - r1;
        r0 = r18;
        r6 = r6 / r0;
        r7 = r6 + r11;
        if (r7 <= r15) goto L_0x0013;
    L_0x0012:
        r7 = r15;
    L_0x0013:
        r6 = r11 << 1;
        r11 = r7 << 1;
        r7 = r10;
    L_0x0018:
        if (r6 >= r11) goto L_0x0043;
    L_0x001a:
        r14 = r7 >> 8;
        r2 = r8[r14];
        r10 = r2 << 8;
        r14 = r14 + 1;
        r3 = r8[r14];
        r14 = r3 - r2;
        r4 = r7 & 255;
        r14 = r14 * r4;
        r14 = r14 + r10;
        r10 = r6 + 1;
        r4 = r9[r6];
        r5 = r14 * r12;
        r5 = r5 >> 6;
        r4 = r4 + r5;
        r9[r6] = r4;
        r6 = r10 + 1;
        r4 = r9[r10];
        r14 = r14 * r13;
        r14 = r14 >> 6;
        r14 = r14 + r4;
        r9[r10] = r14;
        r0 = r18;
        r7 = r7 + r0;
        goto L_0x0018;
    L_0x0043:
        if (r18 == 0) goto L_0x0054;
    L_0x0045:
        r10 = r6 >> 1;
        r11 = r16 - r7;
        r0 = r18;
        r11 = r11 + r0;
        r11 = r11 + -1;
        r0 = r18;
        r11 = r11 / r0;
        r10 = r10 + r11;
        if (r10 <= r15) goto L_0x0086;
    L_0x0054:
        r10 = r15 << 1;
    L_0x0056:
        if (r6 >= r10) goto L_0x007f;
    L_0x0058:
        r11 = r7 >> 8;
        r2 = r8[r11];
        r11 = r2 << 8;
        r14 = r19 - r2;
        r15 = r7 & 255;
        r14 = r14 * r15;
        r14 = r14 + r11;
        r11 = r6 + 1;
        r15 = r9[r6];
        r16 = r14 * r12;
        r16 = r16 >> 6;
        r0 = r16;
        r15 = r15 + r0;
        r9[r6] = r15;
        r6 = r11 + 1;
        r15 = r9[r11];
        r14 = r14 * r13;
        r14 = r14 >> 6;
        r14 = r14 + r15;
        r9[r11] = r14;
        r0 = r18;
        r7 = r7 + r0;
        goto L_0x0056;
    L_0x007f:
        r0 = r17;
        r0.size = r7;
        r6 = r6 >> 1;
        return r6;
    L_0x0086:
        r15 = r10;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.format(int, int, byte[], int[], int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int format(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int i3, int i4, int i5, int $i4, Address address, int i6, int i7) {
        if (i6 != 0) {
            i4 = (((($i4 + 256) - $i7) + i6) / i6) + $i8;
            if (i4 <= i5) {
                i2 = $i8;
                i = $i7;
                while (i2 < i4) {
                    int $i10 = i >> 8;
                    byte $b11 = bArr[$i10 - 1];
                    iArr[i2] = (((((bArr[$i10] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i2++;
                    i += i6;
                }
                if (i6 != 0) {
                    $i7 = ((($i4 - i) + i6) / i6) + i2;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = i2;
                while ($i7 < i5) {
                    iArr[$i7] = iArr[$i7] + ((((i7 << 8) + ((bArr[i >> 8] - i7) * (i & 255))) * i3) >> 6);
                    i += i6;
                    $i7++;
                }
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i8;
        i = $i7;
        while (i2 < i4) {
            int $i102 = i >> 8;
            byte $b112 = bArr[$i102 - 1];
            iArr[i2] = (((((bArr[$i102] - $b112) * (i & 255)) + ($b112 << 8)) * i3) >> 6) + iArr[i2];
            i2++;
            i += i6;
        }
        if (i6 != 0) {
            $i7 = ((($i4 - i) + i6) / i6) + i2;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = i2;
        while ($i7 < i5) {
            iArr[$i7] = iArr[$i7] + ((((i7 << 8) + ((bArr[i >> 8] - i7) * (i & 255))) * i3) >> 6);
            i += i6;
            $i7++;
        }
        address.size = i;
        return $i7;
    }

    static int format(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i1 + i4) - ($i7 - 1);
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 - 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 - 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 - 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 - 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 - 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int get(int r6, int r7, byte[] r8, int[] r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.Address r19, int r20, int r21) {
        /*
        r0 = r19;
        r6 = r0.value;
        r0 = r19;
        r7 = r0.key;
        r7 = r7 * r11;
        r6 = r6 - r7;
        r0 = r19;
        r0.value = r6;
        if (r20 == 0) goto L_0x0021;
    L_0x0010:
        r0 = r18;
        r6 = r0 + 256;
        r6 = r6 - r10;
        r0 = r20;
        r6 = r6 + r0;
        r0 = r20;
        r6 = r6 / r0;
        r7 = r6 + r11;
        r0 = r17;
        if (r7 <= r0) goto L_0x0023;
    L_0x0021:
        r7 = r17;
    L_0x0023:
        r6 = r11 << 1;
        r16 = r7 << 1;
        r11 = r13;
        r7 = r10;
    L_0x0029:
        r0 = r16;
        if (r6 >= r0) goto L_0x00b7;
    L_0x002d:
        r13 = r7 >> 8;
        r10 = r13 + -1;
        r2 = r8[r10];
        r10 = r2 << 8;
        r3 = r8[r13];
        r13 = r3 - r2;
        r4 = r7 & 255;
        r13 = r13 * r4;
        r13 = r13 + r10;
        r10 = r6 + 1;
        r4 = r9[r6];
        r5 = r13 * r12;
        r5 = r5 >> 6;
        r4 = r4 + r5;
        r9[r6] = r4;
        r12 = r12 + r14;
        r6 = r10 + 1;
        r4 = r9[r10];
        r13 = r13 * r11;
        r13 = r13 >> 6;
        r13 = r13 + r4;
        r9[r10] = r13;
        r11 = r11 + r15;
        r0 = r20;
        r7 = r7 + r0;
        goto L_0x0029;
    L_0x0058:
        r7 = r12 >> 1;
        r0 = r19;
        r12 = r0.value;
        r0 = r19;
        r13 = r0.key;
        r13 = r13 * r7;
        r12 = r12 + r13;
        r0 = r19;
        r0.value = r12;
        r0 = r19;
        r0.next = r11;
        r0 = r19;
        r0.count = r10;
        r0 = r19;
        r0.size = r6;
        return r7;
    L_0x0075:
        r0 = r20;
        r6 = r6 + r0;
    L_0x0078:
        if (r12 >= r13) goto L_0x0058;
    L_0x007a:
        r7 = r21 << 8;
        r16 = r6 >> 8;
        r2 = r8[r16];
        r16 = r2 - r21;
        r0 = r6 & 255;
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r0 = r0 * r1;
        r16 = r0;
        r16 = r7 + r16;
        r7 = r12 + 1;
        r17 = r9[r12];
        r18 = r16 * r11;
        r18 = r18 >> 6;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r9[r12] = r17;
        r11 = r11 + r14;
        r12 = r7 + 1;
        r17 = r9[r7];
        r0 = r16;
        r0 = r0 * r10;
        r16 = r0;
        r16 = r16 >> 6;
        r0 = r16;
        r1 = r17;
        r0 = r0 + r1;
        r16 = r0;
        r9[r7] = r16;
        r10 = r10 + r15;
        goto L_0x0075;
    L_0x00b7:
        if (r20 == 0) goto L_0x00c8;
    L_0x00b9:
        r10 = r6 >> 1;
        r13 = r18 - r7;
        r0 = r20;
        r13 = r13 + r0;
        r0 = r20;
        r13 = r13 / r0;
        r10 = r10 + r13;
        r0 = r17;
        if (r10 <= r0) goto L_0x00cf;
    L_0x00c8:
        r13 = r17 << 1;
        r10 = r11;
        r11 = r12;
        r12 = r6;
        r6 = r7;
        goto L_0x0078;
    L_0x00cf:
        r17 = r10;
        goto L_0x00c8;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.get(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int get(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int $i9, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        address.next -= address.length * $i8;
        address.count -= address.type * $i8;
        if (i7 != 0) {
            i4 = ((((i6 + 256) - $i7) + i7) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i9;
                i = $i7;
                while ($i8 < i4) {
                    int $i11 = i >> 8;
                    byte $b12 = bArr[$i11 - 1];
                    iArr[$i8] = (((((bArr[$i11] - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i8];
                    i2 += i3;
                    $i8++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = (((i6 - i) + i7) / i7) + $i8;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = $i8;
                while ($i7 < i5) {
                    int $i4 = (bArr[i >> 8] - i8) * (i & 255);
                    i6 = $i4;
                    iArr[$i7] = iArr[$i7] + ((((i8 << 8) + $i4) * i2) >> 6);
                    i2 += i3;
                    i += i7;
                    $i7++;
                }
                address.next += address.length * $i7;
                address.count += address.type * $i7;
                address.value = i2;
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i9;
        i = $i7;
        while ($i8 < i4) {
            int $i112 = i >> 8;
            byte $b122 = bArr[$i112 - 1];
            iArr[$i8] = (((((bArr[$i112] - $b122) * (i & 255)) + ($b122 << 8)) * i2) >> 6) + iArr[$i8];
            i2 += i3;
            $i8++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = (((i6 - i) + i7) / i7) + $i8;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = $i8;
        while ($i7 < i5) {
            int $i42 = (bArr[i >> 8] - i8) * (i & 255);
            i6 = $i42;
            iArr[$i7] = iArr[$i7] + ((((i8 << 8) + $i42) * i2) >> 6);
            i2 += i3;
            i += i7;
            $i7++;
        }
        address.next += address.length * $i7;
        address.count += address.type * $i7;
        address.value = i2;
        address.size = i;
        return $i7;
    }

    static int get(int i, byte[] bArr, int[] iArr, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8, int i9, Address address) {
        i7 = i2 >> 8;
        int $i10 = i9 >> 8;
        $i3 <<= 2;
        i9 = i4 << 2;
        i = i5 << 2;
        i2 = i6 << 2;
        i4 = (i3 + i7) - ($i10 - 1);
        if (i4 <= i8) {
            i8 = i4;
        }
        address.value += address.key * (i8 - i3);
        i5 = i3 << 1;
        i3 = (i8 << 1) - 6;
        i4 = $i3;
        $i3 = i5;
        i5 = i9;
        while ($i3 < i3) {
            i6 = i7 - 1;
            byte $b11 = bArr[i7];
            i8 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            $i3 = i6 - 1;
            $b11 = bArr[i6];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i4);
            i6 = i4 + i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i4 = $i3 - 1;
            $b11 = bArr[$i3];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i6);
            $i3 = i6 + i;
            i6 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i7 = i4 - 1;
            $b11 = bArr[i4];
            i8 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b11 * $i3);
            i4 = $i3 + i;
            $i3 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
        }
        i3 += 6;
        while ($i3 < i3) {
            i6 = i7 - 1;
            $b11 = bArr[i7];
            i7 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            $i3 = i7 + 1;
            iArr[i7] = ($b11 * i5) + iArr[i7];
            i5 += i2;
            i7 = i6;
        }
        address.next = i4 >> 2;
        address.count = i5 >> 2;
        address.size = i7 << 8;
        return $i3 >> 1;
    }

    static int get(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i7 + $i1) - i4;
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 + 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 + 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 + 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 + 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 + 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    static int get(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int $i4, Address address) {
        i3 = i >> 8;
        i = i2 << 2;
        i2 = ($i1 + i3) - (($i4 >> 8) - 1);
        if (i2 <= i4) {
            i4 = i2;
        }
        i2 = i4 - 3;
        while ($i1 < i2) {
            i4 = $i1 + 1;
            $i4 = i3 - 1;
            iArr[$i1] = (bArr[i3] * i) + iArr[$i1];
            $i1 = i4 + 1;
            i3 = $i4 - 1;
            iArr[i4] = iArr[i4] + (bArr[$i4] * i);
            i4 = $i1 + 1;
            $i4 = i3 - 1;
            iArr[$i1] = iArr[$i1] + (bArr[i3] * i);
            $i1 = i4 + 1;
            i3 = $i4 - 1;
            iArr[i4] = iArr[i4] + (bArr[$i4] * i);
        }
        i2 += 3;
        int $i6 = i3;
        while ($i1 < i2) {
            i4 = $i6 - 1;
            iArr[$i1] = (bArr[$i6] * i) + iArr[$i1];
            $i1++;
            $i6 = i4;
        }
        address.size = $i6 << 8;
        return $i1;
    }

    public static Address get(User user, int i, int $i1) {
        return (user.data == null || user.data.length == 0) ? null : new Address(user, (int) (((((long) user.type) * 256) * ((long) i)) / ((long) (FileInfo.data * 1299793156))), $i1 << 6);
    }

    static int getInstance(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i7 + $i1) - i4;
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 + 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 + 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 + 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 + 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 + 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int getSize(int r6, int r7, byte[] r8, int[] r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, p000.Address r17, int r18, int r19) {
        /*
        if (r18 == 0) goto L_0x0012;
    L_0x0002:
        r6 = r16 - r10;
        r0 = r18;
        r6 = r6 + r0;
        r1 = 617348823; // 0x24cbfed7 float:8.846893E-17 double:3.05010845E-315;
        r6 = r6 - r1;
        r0 = r18;
        r6 = r6 / r0;
        r7 = r6 + r11;
        if (r7 <= r15) goto L_0x0013;
    L_0x0012:
        r7 = r15;
    L_0x0013:
        r6 = r11 << 1;
        r11 = r7 << 1;
        r7 = r10;
    L_0x0018:
        if (r6 >= r11) goto L_0x0046;
    L_0x001a:
        r14 = r7 >> 8;
        r2 = r8[r14];
        r10 = r2 << 8;
        r14 = r14 + 1;
        r3 = r8[r14];
        r14 = r3 - r2;
        r1 = 1172468336; // 0x45e27270 float:7246.3047 double:5.792763257E-315;
        r4 = r1 & r7;
        r14 = r14 * r4;
        r14 = r14 + r10;
        r10 = r6 + 1;
        r4 = r9[r6];
        r5 = r14 * r12;
        r5 = r5 >> 6;
        r4 = r4 + r5;
        r9[r6] = r4;
        r6 = r10 + 1;
        r4 = r9[r10];
        r14 = r14 * r13;
        r14 = r14 >> 6;
        r14 = r14 + r4;
        r9[r10] = r14;
        r0 = r18;
        r7 = r7 + r0;
        goto L_0x0018;
    L_0x0046:
        if (r18 == 0) goto L_0x0057;
    L_0x0048:
        r10 = r6 >> 1;
        r11 = r16 - r7;
        r0 = r18;
        r11 = r11 + r0;
        r11 = r11 + -1;
        r0 = r18;
        r11 = r11 / r0;
        r10 = r10 + r11;
        if (r10 <= r15) goto L_0x0089;
    L_0x0057:
        r10 = r15 << 1;
    L_0x0059:
        if (r6 >= r10) goto L_0x0082;
    L_0x005b:
        r11 = r7 >> 8;
        r2 = r8[r11];
        r11 = r2 << 8;
        r14 = r19 - r2;
        r15 = r7 & 255;
        r14 = r14 * r15;
        r14 = r14 + r11;
        r11 = r6 + 1;
        r15 = r9[r6];
        r16 = r14 * r12;
        r16 = r16 >> 6;
        r0 = r16;
        r15 = r15 + r0;
        r9[r6] = r15;
        r6 = r11 + 1;
        r15 = r9[r11];
        r14 = r14 * r13;
        r14 = r14 >> 6;
        r14 = r14 + r15;
        r9[r11] = r14;
        r0 = r18;
        r7 = r7 + r0;
        goto L_0x0059;
    L_0x0082:
        r0 = r17;
        r0.size = r7;
        r6 = r6 >> 1;
        return r6;
    L_0x0089:
        r15 = r10;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.getSize(int, int, byte[], int[], int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int init(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i1 + i4) - ($i7 - 1);
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 - 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 - 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 - 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 - 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 - 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int parse(int r7, int r8, byte[] r9, int[] r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, p000.Address r20, int r21, int r22) {
        /*
        r0 = r20;
        r7 = r0.value;
        r0 = r20;
        r8 = r0.key;
        r8 = r8 * r12;
        r7 = r7 - r8;
        r0 = r20;
        r0.value = r7;
        if (r21 == 0) goto L_0x0021;
    L_0x0010:
        r0 = r19;
        r7 = r0 + 256;
        r7 = r7 - r11;
        r0 = r21;
        r7 = r7 + r0;
        r0 = r21;
        r7 = r7 / r0;
        r8 = r7 + r12;
        r0 = r18;
        if (r8 <= r0) goto L_0x0023;
    L_0x0021:
        r8 = r18;
    L_0x0023:
        r7 = r12 << 1;
        r17 = r8 << 1;
        r12 = r14;
        r8 = r11;
    L_0x0029:
        r0 = r17;
        if (r7 >= r0) goto L_0x005d;
    L_0x002d:
        r14 = r8 >> 8;
        r11 = r14 + -1;
        r2 = r9[r11];
        r11 = r2 << 8;
        r3 = r9[r14];
        r14 = r3 - r2;
        r5 = -723436621; // 0xffffffffd4e13bb3 float:-7.7389538E12 double:NaN;
        r4 = r5 & r8;
        r14 = r14 * r4;
        r14 = r14 + r11;
        r11 = r7 + 1;
        r4 = r10[r7];
        r6 = r14 * r13;
        r6 = r6 >> 6;
        r4 = r4 + r6;
        r10[r7] = r4;
        r13 = r13 + r15;
        r7 = r11 + 1;
        r4 = r10[r11];
        r14 = r14 * r12;
        r14 = r14 >> 6;
        r14 = r14 + r4;
        r10[r11] = r14;
        r0 = r16;
        r12 = r12 + r0;
        r0 = r21;
        r8 = r8 + r0;
        goto L_0x0029;
    L_0x005d:
        if (r21 == 0) goto L_0x006e;
    L_0x005f:
        r11 = r7 >> 1;
        r14 = r19 - r8;
        r0 = r21;
        r14 = r14 + r0;
        r0 = r21;
        r14 = r14 / r0;
        r11 = r11 + r14;
        r0 = r18;
        if (r11 <= r0) goto L_0x00d5;
    L_0x006e:
        r14 = r18 << 1;
        r11 = r12;
        r12 = r13;
        r13 = r7;
        r7 = r8;
    L_0x0074:
        if (r13 >= r14) goto L_0x00b8;
    L_0x0076:
        r8 = r22 << 8;
        r17 = r7 >> 8;
        r2 = r9[r17];
        r17 = r2 - r22;
        r0 = r7 & 255;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r0 = r0 * r1;
        r17 = r0;
        r17 = r8 + r17;
        r8 = r13 + 1;
        r18 = r10[r13];
        r19 = r17 * r12;
        r19 = r19 >> 6;
        r0 = r18;
        r1 = r19;
        r0 = r0 + r1;
        r18 = r0;
        r10[r13] = r18;
        r12 = r12 + r15;
        r13 = r8 + 1;
        r18 = r10[r8];
        r0 = r17;
        r0 = r0 * r11;
        r17 = r0;
        r17 = r17 >> 6;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r10[r8] = r17;
        r0 = r16;
        r11 = r11 + r0;
        r0 = r21;
        r7 = r7 + r0;
        goto L_0x0074;
    L_0x00b8:
        r8 = r13 >> 1;
        r0 = r20;
        r13 = r0.value;
        r0 = r20;
        r14 = r0.key;
        r14 = r14 * r8;
        r13 = r13 + r14;
        r0 = r20;
        r0.value = r13;
        r0 = r20;
        r0.next = r12;
        r0 = r20;
        r0.count = r11;
        r0 = r20;
        r0.size = r7;
        return r8;
    L_0x00d5:
        r18 = r11;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.parse(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int parse(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int $i9, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        byte $b12;
        address.next -= address.length * $i8;
        address.count -= address.type * $i8;
        if (i7 != 0) {
            i4 = ((((i6 - $i7) + i7) - 257) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i9;
                i = $i7;
                while ($i8 < i4) {
                    int $i11 = i >> 8;
                    $b12 = bArr[$i11];
                    iArr[$i8] = (((((bArr[$i11 + 1] - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i8];
                    i2 += i3;
                    $i8++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = ((((i6 - i) + i7) - 1) / i7) + $i8;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = $i8;
                while ($i7 < i5) {
                    $b12 = bArr[i >> 8];
                    iArr[$i7] = (((((i8 - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i7];
                    i2 += i3;
                    i += i7;
                    $i7++;
                }
                address.next += address.length * $i7;
                address.count += address.type * $i7;
                address.value = i2;
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i9;
        i = $i7;
        while ($i8 < i4) {
            int $i112 = i >> 8;
            $b12 = bArr[$i112];
            iArr[$i8] = (((((bArr[$i112 + 1] - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i8];
            i2 += i3;
            $i8++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = ((((i6 - i) + i7) - 1) / i7) + $i8;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = $i8;
        while ($i7 < i5) {
            $b12 = bArr[i >> 8];
            iArr[$i7] = (((((i8 - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i7];
            i2 += i3;
            i += i7;
            $i7++;
        }
        address.next += address.length * $i7;
        address.count += address.type * $i7;
        address.value = i2;
        address.size = i;
        return $i7;
    }

    static int parse(int i, byte[] bArr, int[] iArr, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8, int i9, Address address) {
        i7 = i2 >> 8;
        int $i10 = i9 >> 8;
        $i3 <<= 2;
        i9 = i4 << 2;
        i = i5 << 2;
        i2 = i6 << 2;
        i4 = (i3 + i7) - ($i10 - 1);
        if (i4 <= i8) {
            i8 = i4;
        }
        address.value += address.key * (i8 - i3);
        i5 = i3 << 1;
        i3 = (i8 << 1) - 6;
        i4 = $i3;
        $i3 = i5;
        i5 = i9;
        while ($i3 < i3) {
            i6 = i7 - 1;
            byte $b11 = bArr[i7];
            i8 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            $i3 = i6 - 1;
            $b11 = bArr[i6];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i4);
            i6 = i4 + i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i4 = $i3 - 1;
            $b11 = bArr[$i3];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i6);
            $i3 = i6 + i;
            i6 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i7 = i4 - 1;
            $b11 = bArr[i4];
            i8 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b11 * $i3);
            i4 = $i3 + i;
            $i3 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
        }
        i3 += 6;
        while ($i3 < i3) {
            i6 = i7 - 1;
            $b11 = bArr[i7];
            i7 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            $i3 = i7 + 1;
            iArr[i7] = ($b11 * i5) + iArr[i7];
            i5 += i2;
            i7 = i6;
        }
        address.next = i4 >> 2;
        address.count = i5 >> 2;
        address.size = i7 << 8;
        return $i3 >> 1;
    }

    static int parse(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i1 + i4) - ($i7 - 1);
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 - 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 - 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 - 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 - 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 - 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    public static Address parse(User user, int i, int $i1) {
        return (user.data == null || user.data.length == 0) ? null : new Address(user, (int) (((((long) user.type) * 256) * ((long) i)) / ((long) (FileInfo.data * 1299793156))), $i1 << 6);
    }

    static int process(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int $i9, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        address.next -= address.length * $i8;
        address.count -= address.type * $i8;
        if (i7 != 0) {
            i4 = ((((1014396844 + i6) - $i7) + i7) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i9;
                i = $i7;
                while ($i8 < i4) {
                    int $i11 = i >> 8;
                    byte $b12 = bArr[$i11 - 1];
                    iArr[$i8] = (((((bArr[$i11] - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i8];
                    i2 += i3;
                    $i8++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = (((i6 - i) + i7) / i7) + $i8;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = $i8;
                while ($i7 < i5) {
                    int $i4 = (bArr[i >> 8] - i8) * (i & 255);
                    i6 = $i4;
                    iArr[$i7] = iArr[$i7] + ((((i8 << 8) + $i4) * i2) >> 6);
                    i2 += i3;
                    i += i7;
                    $i7++;
                }
                address.next += address.length * $i7;
                address.count += address.type * $i7;
                address.value = i2;
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i9;
        i = $i7;
        while ($i8 < i4) {
            int $i112 = i >> 8;
            byte $b122 = bArr[$i112 - 1];
            iArr[$i8] = (((((bArr[$i112] - $b122) * (i & 255)) + ($b122 << 8)) * i2) >> 6) + iArr[$i8];
            i2 += i3;
            $i8++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = (((i6 - i) + i7) / i7) + $i8;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = $i8;
        while ($i7 < i5) {
            int $i42 = (bArr[i >> 8] - i8) * (i & 255);
            i6 = $i42;
            iArr[$i7] = iArr[$i7] + ((((i8 << 8) + $i42) * i2) >> 6);
            i2 += i3;
            i += i7;
            $i7++;
        }
        address.next += address.length * $i7;
        address.count += address.type * $i7;
        address.value = i2;
        address.size = i;
        return $i7;
    }

    static int processBlock(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int $i6, Address address) {
        i6 = i2 >> 8;
        i = i4 << 2;
        i2 = i5 << 2;
        i4 = (($i6 >> 8) + i3) - i6;
        if (i4 <= i7) {
            i7 = i4;
        }
        i4 = i3 << 1;
        i3 = (i7 << 1) - 6;
        while (i4 < i3) {
            i5 = i6 + 1;
            byte $b8 = bArr[i6];
            i7 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i6 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i4 = i5 + 1;
            $b8 = bArr[i5];
            i5 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i6 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
            i5 = i4 + 1;
            $b8 = bArr[i4];
            i7 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i4 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i6 = i5 + 1;
            $b8 = bArr[i5];
            i5 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
        }
        i3 += 6;
        while (i4 < i3) {
            i5 = i6 + 1;
            $b8 = bArr[i6];
            i6 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i6 + 1;
            iArr[i6] = ($b8 * i2) + iArr[i6];
            i6 = i5;
        }
        address.size = i6 << 8;
        return i4 >> 1;
    }

    static int push(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i1 + i4) - ($i7 - 1);
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 - 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 - 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 - 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 - 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 - 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    static int readBytesFromStream(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        byte $b11;
        if (i7 != 0) {
            i4 = ((((i6 - $i7) + i7) - 257) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i8;
                i = $i7;
                while (i2 < i4) {
                    int $i10 = i >> 8;
                    $b11 = bArr[$i10];
                    iArr[i2] = (((((bArr[$i10 + 1] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i2++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = ((((i6 - i) + i7) - 1) / i7) + i2;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                while (i2 < i5) {
                    $b11 = bArr[i >> 8];
                    iArr[i2] = (((((i8 - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i += i7;
                    i2++;
                }
                address.size = i;
                return i2;
            }
        }
        i4 = i5;
        i2 = $i8;
        i = $i7;
        while (i2 < i4) {
            int $i102 = i >> 8;
            $b11 = bArr[$i102];
            iArr[i2] = (((((bArr[$i102 + 1] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
            i2++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = ((((i6 - i) + i7) - 1) / i7) + i2;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        while (i2 < i5) {
            $b11 = bArr[i >> 8];
            iArr[i2] = (((((i8 - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
            i += i7;
            i2++;
        }
        address.size = i;
        return i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int resolve(int r5, int r6, byte[] r7, int[] r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, p000.Address r16, int r17, int r18) {
        /*
        if (r17 == 0) goto L_0x000f;
    L_0x0002:
        r5 = r15 + 256;
        r5 = r5 - r9;
        r0 = r17;
        r5 = r5 + r0;
        r0 = r17;
        r5 = r5 / r0;
        r6 = r5 + r10;
        if (r6 <= r14) goto L_0x0010;
    L_0x000f:
        r6 = r14;
    L_0x0010:
        r5 = r10 << 1;
        r10 = r6 << 1;
        r6 = r9;
    L_0x0015:
        if (r5 >= r10) goto L_0x0068;
    L_0x0017:
        r13 = r6 >> 8;
        r9 = r13 + -1;
        r1 = r7[r9];
        r9 = r1 << 8;
        r2 = r7[r13];
        r13 = r2 - r1;
        r3 = r6 & 255;
        r13 = r13 * r3;
        r13 = r13 + r9;
        r9 = r5 + 1;
        r3 = r8[r5];
        r4 = r13 * r11;
        r4 = r4 >> 6;
        r3 = r3 + r4;
        r8[r5] = r3;
        r5 = r9 + 1;
        r3 = r8[r9];
        r13 = r13 * r12;
        r13 = r13 >> 6;
        r13 = r13 + r3;
        r8[r9] = r13;
        r0 = r17;
        r6 = r6 + r0;
        goto L_0x0015;
    L_0x0040:
        r0 = r17;
        r6 = r6 + r0;
    L_0x0043:
        if (r5 >= r9) goto L_0x007a;
    L_0x0045:
        r10 = r18 << 8;
        r13 = r6 >> 8;
        r1 = r7[r13];
        r13 = r1 - r18;
        r14 = r6 & 255;
        r13 = r13 * r14;
        r13 = r10 + r13;
        r10 = r5 + 1;
        r14 = r8[r5];
        r15 = r13 * r11;
        r15 = r15 >> 6;
        r14 = r14 + r15;
        r8[r5] = r14;
        r5 = r10 + 1;
        r14 = r8[r10];
        r13 = r13 * r12;
        r13 = r13 >> 6;
        r13 = r13 + r14;
        r8[r10] = r13;
        goto L_0x0040;
    L_0x0068:
        if (r17 == 0) goto L_0x0077;
    L_0x006a:
        r9 = r5 >> 1;
        r10 = r15 - r6;
        r0 = r17;
        r10 = r10 + r0;
        r0 = r17;
        r10 = r10 / r0;
        r9 = r9 + r10;
        if (r9 <= r14) goto L_0x0081;
    L_0x0077:
        r9 = r14 << 1;
        goto L_0x0043;
    L_0x007a:
        r0 = r16;
        r0.size = r6;
        r5 = r5 >> 1;
        return r5;
    L_0x0081:
        r14 = r9;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.resolve(int, int, byte[], int[], int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int resolve(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        if (i7 != 0) {
            i4 = ((((i6 + 256) - $i7) + i7) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i8;
                i = $i7;
                while (i2 < i4) {
                    int $i10 = i >> 8;
                    byte $b11 = bArr[$i10 - 1];
                    iArr[i2] = (((((bArr[$i10] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i2++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = (((i6 - i) + i7) / i7) + i2;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = i2;
                while ($i7 < i5) {
                    iArr[$i7] = iArr[$i7] + ((((i8 << 8) + ((bArr[i >> 8] - i8) * (i & 255))) * i3) >> 6);
                    i += i7;
                    $i7++;
                }
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i8;
        i = $i7;
        while (i2 < i4) {
            int $i102 = i >> 8;
            byte $b112 = bArr[$i102 - 1];
            iArr[i2] = (((((bArr[$i102] - $b112) * (i & 255)) + ($b112 << 8)) * i3) >> 6) + iArr[i2];
            i2++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = (((i6 - i) + i7) / i7) + i2;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = i2;
        while ($i7 < i5) {
            iArr[$i7] = iArr[$i7] + ((((i8 << 8) + ((bArr[i >> 8] - i8) * (i & 255))) * i3) >> 6);
            i += i7;
            $i7++;
        }
        address.size = i;
        return $i7;
    }

    static int set(int $i0, int i) {
        return i < 0 ? -$i0 : (int) ((((double) $i0) * Math.sqrt(((double) i) * 1.220703125E-4d)) + 0.5d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int toArray(int r6, int r7, byte[] r8, int[] r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, p000.Address r17, int r18, int r19) {
        /*
        if (r18 == 0) goto L_0x0011;
    L_0x0002:
        r0 = r16;
        r6 = r0 + 256;
        r6 = r6 - r10;
        r0 = r18;
        r6 = r6 + r0;
        r0 = r18;
        r6 = r6 / r0;
        r7 = r6 + r11;
        if (r7 <= r15) goto L_0x0012;
    L_0x0011:
        r7 = r15;
    L_0x0012:
        r6 = r11 << 1;
        r11 = r7 << 1;
        r7 = r10;
    L_0x0017:
        if (r6 >= r11) goto L_0x0045;
    L_0x0019:
        r14 = r7 >> 8;
        r10 = r14 + -1;
        r1 = r8[r10];
        r10 = r1 << 8;
        r2 = r8[r14];
        r14 = r2 - r1;
        r4 = 261806431; // 0xf9ad95f float:1.52693E-29 double:1.293495634E-315;
        r3 = r4 & r7;
        r14 = r14 * r3;
        r14 = r14 + r10;
        r10 = r6 + 1;
        r3 = r9[r6];
        r5 = r14 * r12;
        r5 = r5 >> 6;
        r3 = r3 + r5;
        r9[r6] = r3;
        r6 = r10 + 1;
        r3 = r9[r10];
        r14 = r14 * r13;
        r14 = r14 >> 6;
        r14 = r14 + r3;
        r9[r10] = r14;
        r0 = r18;
        r7 = r7 + r0;
        goto L_0x0017;
    L_0x0045:
        if (r18 == 0) goto L_0x0054;
    L_0x0047:
        r10 = r6 >> 1;
        r11 = r16 - r7;
        r0 = r18;
        r11 = r11 + r0;
        r0 = r18;
        r11 = r11 / r0;
        r10 = r10 + r11;
        if (r10 <= r15) goto L_0x0087;
    L_0x0054:
        r10 = r15 << 1;
    L_0x0056:
        if (r6 >= r10) goto L_0x0080;
    L_0x0058:
        r11 = r19 << 8;
        r14 = r7 >> 8;
        r1 = r8[r14];
        r14 = r1 - r19;
        r15 = r7 & 255;
        r14 = r14 * r15;
        r14 = r11 + r14;
        r11 = r6 + 1;
        r15 = r9[r6];
        r16 = r14 * r12;
        r16 = r16 >> 6;
        r0 = r16;
        r15 = r15 + r0;
        r9[r6] = r15;
        r6 = r11 + 1;
        r15 = r9[r11];
        r14 = r14 * r13;
        r14 = r14 >> 6;
        r14 = r14 + r15;
        r9[r11] = r14;
        r0 = r18;
        r7 = r7 + r0;
        goto L_0x0056;
    L_0x0080:
        r0 = r17;
        r0.size = r7;
        r6 = r6 >> 1;
        return r6;
    L_0x0087:
        r15 = r10;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.toArray(int, int, byte[], int[], int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int toArray(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        if (i7 != 0) {
            i4 = ((((-1128844011 + i6) - $i7) + i7) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i8;
                i = $i7;
                while (i2 < i4) {
                    int $i10 = i >> 8;
                    byte $b11 = bArr[$i10 - 1];
                    iArr[i2] = (((((bArr[$i10] - $b11) * (1703783232 & i)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i2++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = (((i6 - i) + i7) / i7) + i2;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = i2;
                while ($i7 < i5) {
                    int $i4 = (bArr[i >> 8] - i8) * (1625775593 & i);
                    i6 = $i4;
                    iArr[$i7] = iArr[$i7] + ((((i8 << 8) + $i4) * i3) >> 6);
                    i += i7;
                    $i7++;
                }
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i8;
        i = $i7;
        while (i2 < i4) {
            int $i102 = i >> 8;
            byte $b112 = bArr[$i102 - 1];
            iArr[i2] = (((((bArr[$i102] - $b112) * (1703783232 & i)) + ($b112 << 8)) * i3) >> 6) + iArr[i2];
            i2++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = (((i6 - i) + i7) / i7) + i2;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = i2;
        while ($i7 < i5) {
            int $i42 = (bArr[i >> 8] - i8) * (1625775593 & i);
            i6 = $i42;
            iArr[$i7] = iArr[$i7] + ((((i8 << 8) + $i42) * i3) >> 6);
            i += i7;
            $i7++;
        }
        address.size = i;
        return $i7;
    }

    static int toString(int $i0, int i) {
        return i < 0 ? -$i0 : (int) ((((double) $i0) * Math.sqrt(((double) i) * 1.220703125E-4d)) + 0.5d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int toString(int r7, int r8, byte[] r9, int[] r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, p000.Address r20, int r21, int r22) {
        /*
        r0 = r20;
        r7 = r0.value;
        r0 = r20;
        r8 = r0.key;
        r8 = r8 * r12;
        r7 = r7 - r8;
        r0 = r20;
        r0.value = r7;
        if (r21 == 0) goto L_0x0022;
    L_0x0010:
        r2 = 1595263274; // 0x5f15c92a float:1.0793204E19 double:7.8816478E-315;
        r7 = r2 + r19;
        r7 = r7 - r11;
        r0 = r21;
        r7 = r7 + r0;
        r0 = r21;
        r7 = r7 / r0;
        r8 = r7 + r12;
        r0 = r18;
        if (r8 <= r0) goto L_0x0024;
    L_0x0022:
        r8 = r18;
    L_0x0024:
        r7 = r12 << 1;
        r17 = r8 << 1;
        r12 = r14;
        r8 = r11;
    L_0x002a:
        r0 = r17;
        if (r7 >= r0) goto L_0x005b;
    L_0x002e:
        r14 = r8 >> 8;
        r11 = r14 + -1;
        r3 = r9[r11];
        r11 = r3 << 8;
        r4 = r9[r14];
        r14 = r4 - r3;
        r5 = r8 & 255;
        r14 = r14 * r5;
        r14 = r14 + r11;
        r11 = r7 + 1;
        r5 = r10[r7];
        r6 = r14 * r13;
        r6 = r6 >> 6;
        r5 = r5 + r6;
        r10[r7] = r5;
        r13 = r13 + r15;
        r7 = r11 + 1;
        r5 = r10[r11];
        r14 = r14 * r12;
        r14 = r14 >> 6;
        r14 = r14 + r5;
        r10[r11] = r14;
        r0 = r16;
        r12 = r12 + r0;
        r0 = r21;
        r8 = r8 + r0;
        goto L_0x002a;
    L_0x005b:
        if (r21 == 0) goto L_0x006c;
    L_0x005d:
        r11 = r7 >> 1;
        r14 = r19 - r8;
        r0 = r21;
        r14 = r14 + r0;
        r0 = r21;
        r14 = r14 / r0;
        r11 = r11 + r14;
        r0 = r18;
        if (r11 <= r0) goto L_0x00d4;
    L_0x006c:
        r14 = r18 << 1;
        r11 = r12;
        r12 = r13;
        r13 = r7;
        r7 = r8;
    L_0x0072:
        if (r13 >= r14) goto L_0x00b7;
    L_0x0074:
        r8 = r22 << 8;
        r17 = r7 >> 8;
        r3 = r9[r17];
        r17 = r3 - r22;
        r2 = -376438212; // 0xffffffffe990023c float:-2.1761984E25 double:NaN;
        r18 = r2 & r7;
        r0 = r17;
        r1 = r18;
        r0 = r0 * r1;
        r17 = r0;
        r17 = r8 + r17;
        r8 = r13 + 1;
        r18 = r10[r13];
        r19 = r17 * r12;
        r19 = r19 >> 6;
        r0 = r18;
        r1 = r19;
        r0 = r0 + r1;
        r18 = r0;
        r10[r13] = r18;
        r12 = r12 + r15;
        r13 = r8 + 1;
        r18 = r10[r8];
        r0 = r17;
        r0 = r0 * r11;
        r17 = r0;
        r17 = r17 >> 6;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r10[r8] = r17;
        r0 = r16;
        r11 = r11 + r0;
        r0 = r21;
        r7 = r7 + r0;
        goto L_0x0072;
    L_0x00b7:
        r8 = r13 >> 1;
        r0 = r20;
        r13 = r0.value;
        r0 = r20;
        r14 = r0.key;
        r14 = r14 * r8;
        r13 = r13 + r14;
        r0 = r20;
        r0.value = r13;
        r0 = r20;
        r0.next = r12;
        r0 = r20;
        r0.count = r11;
        r0 = r20;
        r0.size = r7;
        return r8;
    L_0x00d4:
        r18 = r11;
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.toString(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int toString(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int $i9, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        byte $b12;
        address.next -= address.length * $i8;
        address.count -= address.type * $i8;
        if (i7 != 0) {
            i4 = ((((i6 - $i7) + i7) - 257) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i9;
                i = $i7;
                while ($i8 < i4) {
                    int $i11 = i >> 8;
                    $b12 = bArr[$i11];
                    iArr[$i8] = (((((bArr[$i11 + 1] - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i8];
                    i2 += i3;
                    $i8++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = ((((i6 - i) + i7) - 1) / i7) + $i8;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = $i8;
                while ($i7 < i5) {
                    $b12 = bArr[i >> 8];
                    iArr[$i7] = (((((i8 - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i7];
                    i2 += i3;
                    i += i7;
                    $i7++;
                }
                address.next += address.length * $i7;
                address.count += address.type * $i7;
                address.value = i2;
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i9;
        i = $i7;
        while ($i8 < i4) {
            int $i112 = i >> 8;
            $b12 = bArr[$i112];
            iArr[$i8] = (((((bArr[$i112 + 1] - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i8];
            i2 += i3;
            $i8++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = ((((i6 - i) + i7) - 1) / i7) + $i8;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = $i8;
        while ($i7 < i5) {
            $b12 = bArr[i >> 8];
            iArr[$i7] = (((((i8 - $b12) * (i & 255)) + ($b12 << 8)) * i2) >> 6) + iArr[$i7];
            i2 += i3;
            i += i7;
            $i7++;
        }
        address.next += address.length * $i7;
        address.count += address.type * $i7;
        address.value = i2;
        address.size = i;
        return $i7;
    }

    static int toString(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        if (i7 != 0) {
            i4 = ((((1733403337 + i6) - $i7) + i7) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i8;
                i = $i7;
                while (i2 < i4) {
                    int $i10 = i >> 8;
                    byte $b11 = bArr[$i10 - 1];
                    iArr[i2] = (((((bArr[$i10] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i2++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = (((i6 - i) + i7) / i7) + i2;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = i2;
                while ($i7 < i5) {
                    int $i4 = (bArr[i >> 8] - i8) * (i & 255);
                    i6 = $i4;
                    iArr[$i7] = iArr[$i7] + ((((i8 << 8) + $i4) * i3) >> 6);
                    i += i7;
                    $i7++;
                }
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i8;
        i = $i7;
        while (i2 < i4) {
            int $i102 = i >> 8;
            byte $b112 = bArr[$i102 - 1];
            iArr[i2] = (((((bArr[$i102] - $b112) * (i & 255)) + ($b112 << 8)) * i3) >> 6) + iArr[i2];
            i2++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = (((i6 - i) + i7) / i7) + i2;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = i2;
        while ($i7 < i5) {
            int $i42 = (bArr[i >> 8] - i8) * (i & 255);
            i6 = $i42;
            iArr[$i7] = iArr[$i7] + ((((i8 << 8) + $i42) * i3) >> 6);
            i += i7;
            $i7++;
        }
        address.size = i;
        return $i7;
    }

    static int toString(int i, byte[] bArr, int[] iArr, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8, int i9, Address address) {
        i7 = i2 >> 8;
        int $i10 = i9 >> 8;
        $i3 <<= 2;
        i9 = i4 << 2;
        i = i5 << 2;
        i2 = i6 << 2;
        i4 = (i3 + i7) - ($i10 - 1);
        if (i4 <= i8) {
            i8 = i4;
        }
        address.value += address.key * (i8 - i3);
        i5 = i3 << 1;
        i3 = (i8 << 1) - 6;
        i4 = $i3;
        $i3 = i5;
        i5 = i9;
        while ($i3 < i3) {
            i6 = i7 - 1;
            byte $b11 = bArr[i7];
            i8 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            $i3 = i6 - 1;
            $b11 = bArr[i6];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i4);
            i6 = i4 + i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i4 = $i3 - 1;
            $b11 = bArr[$i3];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i6);
            $i3 = i6 + i;
            i6 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i7 = i4 - 1;
            $b11 = bArr[i4];
            i8 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b11 * $i3);
            i4 = $i3 + i;
            $i3 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
        }
        i3 += 6;
        while ($i3 < i3) {
            i6 = i7 - 1;
            $b11 = bArr[i7];
            i7 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            $i3 = i7 + 1;
            iArr[i7] = ($b11 * i5) + iArr[i7];
            i5 += i2;
            i7 = i6;
        }
        address.next = i4 >> 2;
        address.count = i5 >> 2;
        address.size = i7 << 8;
        return $i3 >> 1;
    }

    static int toString(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int $i6, Address address) {
        i6 = i2 >> 8;
        i = i4 << 2;
        i2 = i5 << 2;
        i4 = (i3 + i6) - (($i6 >> 8) - 1);
        if (i4 <= i7) {
            i7 = i4;
        }
        i4 = i3 << 1;
        i3 = (i7 << 1) - 6;
        while (i4 < i3) {
            i5 = i6 - 1;
            byte $b8 = bArr[i6];
            i7 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i6 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i4 = i5 - 1;
            $b8 = bArr[i5];
            i5 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i6 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
            i5 = i4 - 1;
            $b8 = bArr[i4];
            i7 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i4 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i6 = i5 - 1;
            $b8 = bArr[i5];
            i5 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
        }
        i5 = i3 + 6;
        while (i4 < i5) {
            i3 = i6 - 1;
            $b8 = bArr[i6];
            i6 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i6 + 1;
            iArr[i6] = ($b8 * i2) + iArr[i6];
            i6 = i3;
        }
        address.size = i6 << 8;
        return i4 >> 1;
    }

    static int toString(byte[] bArr, int[] iArr, int i, int $i1, int i2, int i3, int i4, int i5, int i6, Address address) {
        i4 = i >> 8;
        int $i7 = i6 >> 8;
        i6 = i2 << 2;
        i = i3 << 2;
        i2 = ($i1 + i4) - ($i7 - 1);
        if (i2 <= i5) {
            i5 = i2;
        }
        address.next += address.length * (i5 - $i1);
        address.count += address.type * (i5 - $i1);
        i2 = i5 - 3;
        i3 = i6;
        while ($i1 < i2) {
            i5 = $i1 + 1;
            i6 = i4 - 1;
            iArr[$i1] = (bArr[i4] * i3) + iArr[$i1];
            i3 += i;
            $i1 = i5 + 1;
            i4 = i6 - 1;
            iArr[i5] = iArr[i5] + (bArr[i6] * i3);
            i6 = i3 + i;
            i3 = $i1 + 1;
            i5 = i4 - 1;
            iArr[$i1] = iArr[$i1] + (bArr[i4] * i6);
            i6 += i;
            $i1 = i3 + 1;
            i4 = i5 - 1;
            iArr[i3] = iArr[i3] + (bArr[i5] * i6);
            i3 = i6 + i;
        }
        i2 += 3;
        i6 = i4;
        while ($i1 < i2) {
            i5 = i6 - 1;
            iArr[$i1] = (bArr[i6] * i3) + iArr[$i1];
            i3 += i;
            $i1++;
            i6 = i5;
        }
        address.value = i3 >> 2;
        address.size = i6 << 8;
        return $i1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int transform(int r6, int r7, byte[] r8, int[] r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, p000.Address r19, int r20, int r21) {
        /*
        r0 = r19;
        r6 = r0.value;
        r0 = r19;
        r7 = r0.key;
        r7 = r7 * r11;
        r6 = r6 - r7;
        r0 = r19;
        r0.value = r6;
        if (r20 == 0) goto L_0x0020;
    L_0x0010:
        r6 = r18 - r10;
        r0 = r20;
        r6 = r6 + r0;
        r6 = r6 + -257;
        r0 = r20;
        r6 = r6 / r0;
        r7 = r6 + r11;
        r0 = r17;
        if (r7 <= r0) goto L_0x0022;
    L_0x0020:
        r7 = r17;
    L_0x0022:
        r6 = r11 << 1;
        r16 = r7 << 1;
        r11 = r13;
        r7 = r10;
    L_0x0028:
        r0 = r16;
        if (r6 >= r0) goto L_0x0074;
    L_0x002c:
        r13 = r7 >> 8;
        r2 = r8[r13];
        r10 = r2 << 8;
        r13 = r13 + 1;
        r3 = r8[r13];
        r13 = r3 - r2;
        r4 = r7 & 255;
        r13 = r13 * r4;
        r13 = r13 + r10;
        r10 = r6 + 1;
        r4 = r9[r6];
        r5 = r13 * r12;
        r5 = r5 >> 6;
        r4 = r4 + r5;
        r9[r6] = r4;
        r12 = r12 + r14;
        r6 = r10 + 1;
        r4 = r9[r10];
        r13 = r13 * r11;
        r13 = r13 >> 6;
        r13 = r13 + r4;
        r9[r10] = r13;
        r11 = r11 + r15;
        r0 = r20;
        r7 = r7 + r0;
        goto L_0x0028;
    L_0x0057:
        r7 = r12 >> 1;
        r0 = r19;
        r12 = r0.value;
        r0 = r19;
        r13 = r0.key;
        r13 = r13 * r7;
        r12 = r12 + r13;
        r0 = r19;
        r0.value = r12;
        r0 = r19;
        r0.next = r11;
        r0 = r19;
        r0.count = r10;
        r0 = r19;
        r0.size = r6;
        return r7;
    L_0x0074:
        if (r20 == 0) goto L_0x0087;
    L_0x0076:
        r10 = r6 >> 1;
        r13 = r18 - r7;
        r0 = r20;
        r13 = r13 + r0;
        r13 = r13 + -1;
        r0 = r20;
        r13 = r13 / r0;
        r10 = r10 + r13;
        r0 = r17;
        if (r10 <= r0) goto L_0x00d0;
    L_0x0087:
        r13 = r17 << 1;
        r10 = r11;
        r11 = r12;
        r12 = r6;
        r6 = r7;
    L_0x008d:
        if (r12 >= r13) goto L_0x0057;
    L_0x008f:
        r7 = r6 >> 8;
        r2 = r8[r7];
        r7 = r2 << 8;
        r16 = r21 - r2;
        r0 = r6 & 255;
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r0 = r0 * r1;
        r16 = r0;
        r0 = r0 + r7;
        r16 = r0;
        r7 = r12 + 1;
        r17 = r9[r12];
        r18 = r16 * r11;
        r18 = r18 >> 6;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r9[r12] = r17;
        r11 = r11 + r14;
        r12 = r7 + 1;
        r17 = r9[r7];
        r0 = r16;
        r0 = r0 * r10;
        r16 = r0;
        r16 = r16 >> 6;
        r0 = r16;
        r1 = r17;
        r0 = r0 + r1;
        r16 = r0;
        r9[r7] = r16;
        r10 = r10 + r15;
        r0 = r20;
        r6 = r6 + r0;
        goto L_0x008d;
    L_0x00d0:
        r17 = r10;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.transform(int, int, byte[], int[], int, int, int, int, int, int, int, int, int, Address, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int transform(int r5, int r6, byte[] r7, int[] r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, p000.Address r16, int r17, int r18) {
        /*
        if (r17 == 0) goto L_0x0010;
    L_0x0002:
        r5 = r15 - r9;
        r0 = r17;
        r5 = r5 + r0;
        r5 = r5 + -257;
        r0 = r17;
        r5 = r5 / r0;
        r6 = r5 + r10;
        if (r6 <= r14) goto L_0x0011;
    L_0x0010:
        r6 = r14;
    L_0x0011:
        r5 = r10 << 1;
        r10 = r6 << 1;
        r6 = r9;
    L_0x0016:
        if (r5 >= r10) goto L_0x0041;
    L_0x0018:
        r13 = r6 >> 8;
        r1 = r7[r13];
        r9 = r1 << 8;
        r13 = r13 + 1;
        r2 = r7[r13];
        r13 = r2 - r1;
        r3 = r6 & 255;
        r13 = r13 * r3;
        r13 = r13 + r9;
        r9 = r5 + 1;
        r3 = r8[r5];
        r4 = r13 * r11;
        r4 = r4 >> 6;
        r3 = r3 + r4;
        r8[r5] = r3;
        r5 = r9 + 1;
        r3 = r8[r9];
        r13 = r13 * r12;
        r13 = r13 >> 6;
        r13 = r13 + r3;
        r8[r9] = r13;
        r0 = r17;
        r6 = r6 + r0;
        goto L_0x0016;
    L_0x0041:
        if (r17 == 0) goto L_0x0052;
    L_0x0043:
        r9 = r5 >> 1;
        r10 = r15 - r6;
        r0 = r17;
        r10 = r10 + r0;
        r10 = r10 + -1;
        r0 = r17;
        r10 = r10 / r0;
        r9 = r9 + r10;
        if (r9 <= r14) goto L_0x0082;
    L_0x0052:
        r9 = r14 << 1;
    L_0x0054:
        if (r5 >= r9) goto L_0x007b;
    L_0x0056:
        r10 = r6 >> 8;
        r1 = r7[r10];
        r10 = r1 << 8;
        r13 = r18 - r1;
        r14 = r6 & 255;
        r13 = r13 * r14;
        r13 = r13 + r10;
        r10 = r5 + 1;
        r14 = r8[r5];
        r15 = r13 * r11;
        r15 = r15 >> 6;
        r14 = r14 + r15;
        r8[r5] = r14;
        r5 = r10 + 1;
        r14 = r8[r10];
        r13 = r13 * r12;
        r13 = r13 >> 6;
        r13 = r13 + r14;
        r8[r10] = r13;
        r0 = r17;
        r6 = r6 + r0;
        goto L_0x0054;
    L_0x007b:
        r0 = r16;
        r0.size = r6;
        r5 = r5 >> 1;
        return r5;
    L_0x0082:
        r14 = r9;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.transform(int, int, byte[], int[], int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int transform(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        byte $b11;
        if (i7 != 0) {
            i4 = ((((i6 - $i7) + i7) - 257) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i8;
                i = $i7;
                while (i2 < i4) {
                    int $i10 = i >> 8;
                    $b11 = bArr[$i10];
                    iArr[i2] = (((((bArr[$i10 + 1] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i2++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = ((((i6 - i) + i7) - 1) / i7) + i2;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                while (i2 < i5) {
                    $b11 = bArr[i >> 8];
                    iArr[i2] = (((((i8 - $b11) * (-1735337126 & i)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i += i7;
                    i2++;
                }
                address.size = i;
                return i2;
            }
        }
        i4 = i5;
        i2 = $i8;
        i = $i7;
        while (i2 < i4) {
            int $i102 = i >> 8;
            $b11 = bArr[$i102];
            iArr[i2] = (((((bArr[$i102 + 1] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
            i2++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = ((((i6 - i) + i7) - 1) / i7) + i2;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        while (i2 < i5) {
            $b11 = bArr[i >> 8];
            iArr[i2] = (((((i8 - $b11) * (-1735337126 & i)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
            i += i7;
            i2++;
        }
        address.size = i;
        return i2;
    }

    static int trsbox(int $i0, int i) {
        return i < 0 ? -$i0 : (int) ((((double) $i0) * Math.sqrt(((double) i) * 1.220703125E-4d)) + 0.5d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int write(int r5, int r6, byte[] r7, int[] r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, p000.Address r16, int r17, int r18) {
        /*
        if (r17 == 0) goto L_0x000f;
    L_0x0002:
        r5 = r15 + 256;
        r5 = r5 - r9;
        r0 = r17;
        r5 = r5 + r0;
        r0 = r17;
        r5 = r5 / r0;
        r6 = r5 + r10;
        if (r6 <= r14) goto L_0x0010;
    L_0x000f:
        r6 = r14;
    L_0x0010:
        r5 = r10 << 1;
        r10 = r6 << 1;
        r6 = r9;
    L_0x0015:
        if (r5 >= r10) goto L_0x0040;
    L_0x0017:
        r13 = r6 >> 8;
        r9 = r13 + -1;
        r1 = r7[r9];
        r9 = r1 << 8;
        r2 = r7[r13];
        r13 = r2 - r1;
        r3 = r6 & 255;
        r13 = r13 * r3;
        r13 = r13 + r9;
        r9 = r5 + 1;
        r3 = r8[r5];
        r4 = r13 * r11;
        r4 = r4 >> 6;
        r3 = r3 + r4;
        r8[r5] = r3;
        r5 = r9 + 1;
        r3 = r8[r9];
        r13 = r13 * r12;
        r13 = r13 >> 6;
        r13 = r13 + r3;
        r8[r9] = r13;
        r0 = r17;
        r6 = r6 + r0;
        goto L_0x0015;
    L_0x0040:
        if (r17 == 0) goto L_0x004f;
    L_0x0042:
        r9 = r5 >> 1;
        r10 = r15 - r6;
        r0 = r17;
        r10 = r10 + r0;
        r0 = r17;
        r10 = r10 / r0;
        r9 = r9 + r10;
        if (r9 <= r14) goto L_0x0080;
    L_0x004f:
        r9 = r14 << 1;
    L_0x0051:
        if (r5 >= r9) goto L_0x0079;
    L_0x0053:
        r10 = r18 << 8;
        r13 = r6 >> 8;
        r1 = r7[r13];
        r13 = r1 - r18;
        r14 = r6 & 255;
        r13 = r13 * r14;
        r13 = r10 + r13;
        r10 = r5 + 1;
        r14 = r8[r5];
        r15 = r13 * r11;
        r15 = r15 >> 6;
        r14 = r14 + r15;
        r8[r5] = r14;
        r5 = r10 + 1;
        r14 = r8[r10];
        r13 = r13 * r12;
        r13 = r13 >> 6;
        r13 = r13 + r14;
        r8[r10] = r13;
        r0 = r17;
        r6 = r6 + r0;
        goto L_0x0051;
    L_0x0079:
        r0 = r16;
        r0.size = r6;
        r5 = r5 >> 1;
        return r5;
    L_0x0080:
        r14 = r9;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.write(int, int, byte[], int[], int, int, int, int, int, int, int, Address, int, int):int");
    }

    static int write(int i, int i2, byte[] bArr, int[] iArr, int $i7, int $i8, int i3, int i4, int i5, int i6, Address address, int i7, int i8) {
        if (i7 != 0) {
            i4 = ((((i6 + 256) - $i7) + i7) / i7) + $i8;
            if (i4 <= i5) {
                i2 = $i8;
                i = $i7;
                while (i2 < i4) {
                    int $i10 = i >> 8;
                    byte $b11 = bArr[$i10 - 1];
                    iArr[i2] = (((((bArr[$i10] - $b11) * (i & 255)) + ($b11 << 8)) * i3) >> 6) + iArr[i2];
                    i2++;
                    i += i7;
                }
                if (i7 != 0) {
                    $i7 = (((i6 - i) + i7) / i7) + i2;
                    if ($i7 <= i5) {
                        i5 = $i7;
                    }
                }
                $i7 = i2;
                while ($i7 < i5) {
                    iArr[$i7] = iArr[$i7] + ((((i8 << 8) + ((bArr[i >> 8] - i8) * (i & 255))) * i3) >> 6);
                    i += i7;
                    $i7++;
                }
                address.size = i;
                return $i7;
            }
        }
        i4 = i5;
        i2 = $i8;
        i = $i7;
        while (i2 < i4) {
            int $i102 = i >> 8;
            byte $b112 = bArr[$i102 - 1];
            iArr[i2] = (((((bArr[$i102] - $b112) * (i & 255)) + ($b112 << 8)) * i3) >> 6) + iArr[i2];
            i2++;
            i += i7;
        }
        if (i7 != 0) {
            $i7 = (((i6 - i) + i7) / i7) + i2;
            if ($i7 <= i5) {
                i5 = $i7;
            }
        }
        $i7 = i2;
        while ($i7 < i5) {
            iArr[$i7] = iArr[$i7] + ((((i8 << 8) + ((bArr[i >> 8] - i8) * (i & 255))) * i3) >> 6);
            i += i7;
            $i7++;
        }
        address.size = i;
        return $i7;
    }

    static int write(int i, byte[] bArr, int[] iArr, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8, int i9, Address address) {
        i7 = i2 >> 8;
        int $i10 = i9 >> 8;
        $i3 <<= 2;
        i9 = i4 << 2;
        i = i5 << 2;
        i2 = i6 << 2;
        i4 = ($i10 + i3) - i7;
        if (i4 <= i8) {
            i8 = i4;
        }
        address.value += address.key * (i8 - i3);
        i5 = i3 << 1;
        i3 = (i8 << 1) - 6;
        i4 = $i3;
        $i3 = i5;
        i5 = i9;
        while ($i3 < i3) {
            i6 = i7 + 1;
            byte $b11 = bArr[i7];
            i8 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            $i3 = i6 + 1;
            $b11 = bArr[i6];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i4);
            i6 = i4 + i;
            i7 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i4 = $i3 + 1;
            $b11 = bArr[$i3];
            i8 = i7 + 1;
            iArr[i7] = iArr[i7] + ($b11 * i6);
            $i3 = i6 + i;
            i6 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
            i7 = i4 + 1;
            $b11 = bArr[i4];
            i8 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b11 * $i3);
            i4 = $i3 + i;
            $i3 = i8 + 1;
            iArr[i8] = ($b11 * i5) + iArr[i8];
            i5 += i2;
        }
        i6 = i3 + 6;
        while ($i3 < i6) {
            i3 = i7 + 1;
            $b11 = bArr[i7];
            i7 = $i3 + 1;
            iArr[$i3] = iArr[$i3] + ($b11 * i4);
            i4 += i;
            $i3 = i7 + 1;
            iArr[i7] = ($b11 * i5) + iArr[i7];
            i5 += i2;
            i7 = i3;
        }
        address.next = i4 >> 2;
        address.count = i5 >> 2;
        address.size = i7 << 8;
        return $i3 >> 1;
    }

    static int write(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int $i6, Address address) {
        i6 = i2 >> 8;
        i = i4 << 2;
        i2 = i5 << 2;
        i4 = (($i6 >> 8) + i3) - i6;
        if (i4 <= i7) {
            i7 = i4;
        }
        i4 = i3 << 1;
        i3 = (i7 << 1) - 6;
        while (i4 < i3) {
            i5 = i6 + 1;
            byte $b8 = bArr[i6];
            i7 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i6 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i4 = i5 + 1;
            $b8 = bArr[i5];
            i5 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i6 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
            i5 = i4 + 1;
            $b8 = bArr[i4];
            i7 = i6 + 1;
            iArr[i6] = iArr[i6] + ($b8 * i);
            i4 = i7 + 1;
            iArr[i7] = ($b8 * i2) + iArr[i7];
            i6 = i5 + 1;
            $b8 = bArr[i5];
            i5 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i5 + 1;
            iArr[i5] = ($b8 * i2) + iArr[i5];
        }
        i3 += 6;
        while (i4 < i3) {
            i5 = i6 + 1;
            $b8 = bArr[i6];
            i6 = i4 + 1;
            iArr[i4] = iArr[i4] + ($b8 * i);
            i4 = i6 + 1;
            iArr[i6] = ($b8 * i2) + iArr[i6];
            i6 = i5;
        }
        address.size = i6 << 8;
        return i4 >> 1;
    }

    public synchronized int m0a() {
        return this.f6y < 0 ? -1 : this.f6y;
    }

    protected Entry add() {
        return null;
    }

    public synchronized void add(int $i0) {
        if ($i0 == 0) {
            getPath(0);
            iterator();
        } else if (this.next == 0 && this.count == 0) {
            this.data = 0;
            this.state = 0;
            this.value = 0;
            iterator();
        } else {
            int $i1 = -this.value;
            if (this.value > $i1) {
                $i1 = this.value;
            }
            if ((-this.next) > $i1) {
                $i1 = -this.next;
            }
            if (this.next > $i1) {
                $i1 = this.next;
            }
            if ((-this.count) > $i1) {
                $i1 = -this.count;
            }
            if (this.count > $i1) {
                $i1 = this.count;
            }
            if ($i0 > $i1) {
                $i0 = $i1;
            }
            this.data = $i0;
            this.state = Integer.MIN_VALUE;
            this.key = (-this.value) / $i0;
            this.length = (-this.next) / $i0;
            this.type = (-this.count) / $i0;
        }
    }

    public synchronized void apply(int $i0) {
        if (this.name < 0) {
            this.name = -$i0;
        } else {
            this.name = $i0;
        }
    }

    boolean bind() {
        int $i1;
        int $i2;
        int $i0 = this.state;
        if ($i0 == Integer.MIN_VALUE) {
            $i1 = 0;
            $i2 = 0;
            $i0 = 0;
        } else {
            $i2 = Address.add($i0, this.f6y);
            $i1 = Address.set($i0, this.f6y);
        }
        if (this.value != $i0 || this.next != $i2 || this.count != $i1) {
            if (this.value < $i0) {
                this.key = 1;
                this.data = $i0 - this.value;
            } else if (this.value > $i0) {
                this.key = -1;
                this.data = this.value - $i0;
            } else {
                this.key = 0;
            }
            if (this.next < $i2) {
                this.length = 1;
                if (this.data == 0 || this.data > $i2 - this.next) {
                    this.data = $i2 - this.next;
                }
            } else if (this.next > $i2) {
                this.length = -1;
                if (this.data == 0 || this.data > this.next - $i2) {
                    this.data = this.next - $i2;
                }
            } else {
                this.length = 0;
            }
            if (this.count < $i1) {
                this.type = 1;
                if (this.data == 0 || this.data > $i1 - this.count) {
                    this.data = $i1 - this.count;
                    return false;
                }
            } else if (this.count > $i1) {
                this.type = -1;
                if (this.data == 0 || this.data > this.count - $i1) {
                    this.data = this.count - $i1;
                    return false;
                }
            } else {
                this.type = 0;
                return false;
            }
        } else if (this.state == Integer.MIN_VALUE) {
            this.state = 0;
            this.count = 0;
            this.next = 0;
            this.value = 0;
            iterator();
            return true;
        } else {
            set();
        }
        return false;
    }

    public boolean call() {
        return this.size < 0 || this.size >= (((User) this.value).data.length << 8);
    }

    public boolean cleanup() {
        return this.data != 0;
    }

    protected int clear() {
        return (this.state == 0 && this.data == 0) ? 0 : 1;
    }

    public synchronized void clear(int $i0) {
        if ($i0 == 0) {
            getPath(0);
            iterator();
        } else if (this.next == 0 && this.count == 0) {
            this.data = 0;
            this.state = 0;
            this.value = 0;
            iterator();
        } else {
            int $i1 = -this.value;
            if (this.value > $i1) {
                $i1 = this.value;
            }
            if ((-this.next) > $i1) {
                $i1 = -this.next;
            }
            if (this.next > $i1) {
                $i1 = this.next;
            }
            if ((-this.count) > $i1) {
                $i1 = -this.count;
            }
            if (this.count > $i1) {
                $i1 = this.count;
            }
            if ($i0 > $i1) {
                $i0 = $i1;
            }
            this.data = $i0;
            this.state = Integer.MIN_VALUE;
            this.key = (-this.value) / $i0;
            this.length = (-this.next) / $i0;
            this.type = (-this.count) / $i0;
        }
    }

    void clone() {
        this.value = this.state;
        this.next = Address.add(this.state, this.f6y);
        this.count = Address.set(this.state, this.f6y);
    }

    synchronized void clone(int i, int i2) {
        this.state = i;
        this.f6y = i2;
        this.data = 0;
        set();
    }

    synchronized void close(int i, int i2) {
        this.state = i;
        this.f6y = i2;
        this.data = 0;
        set();
    }

    int compare() {
        int $i0 = (this.value * 3) >> 6;
        $i0 = (($i0 >> 31) ^ $i0) + ($i0 >>> 31);
        if (this.id == 0) {
            $i0 -= ($i0 * this.size) / (((User) this.value).data.length << 8);
        } else if (this.id >= 0) {
            $i0 -= ($i0 * this.parent) / ((User) this.value).data.length;
        }
        return $i0 > 255 ? 255 : $i0;
    }

    public boolean compareTo() {
        return this.size < 0 || this.size >= (((User) this.value).data.length << 8);
    }

    void connect() {
        if (this.data != 0) {
            if (this.state == Integer.MIN_VALUE) {
                this.state = 0;
            }
            this.data = 0;
            set();
        }
    }

    protected Entry contains() {
        return null;
    }

    public synchronized void copy(int i) {
        int $i1 = -1;
        synchronized (this) {
            int $i2 = ((User) this.value).data.length << 8;
            if (i >= -1) {
                $i1 = i;
            }
            if ($i1 <= $i2) {
                $i2 = $i1;
            }
            this.size = $i2;
        }
    }

    public boolean copy() {
        return this.size < 0 || this.size >= (((User) this.value).data.length << 8);
    }

    public synchronized void equals(int i) {
        this.id = i;
    }

    public synchronized void equals(int i, int i2) {
        set(i, i2, length());
    }

    public boolean equals() {
        return this.data != 0;
    }

    protected int fill() {
        return (this.state == 0 && this.data == 0) ? 0 : 1;
    }

    public synchronized void from(int i) {
        close(i << 6, length());
    }

    public synchronized void from(int i, int i2) {
        set(i, i2, length());
    }

    protected Entry get() {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void get(int r14) {
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = r13.data;	 Catch:{ Throwable -> 0x009c }
        if (r0 <= 0) goto L_0x0027;
    L_0x0005:
        r0 = r13.data;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r0) goto L_0x00ce;
    L_0x0009:
        r0 = r13.state;	 Catch:{ Throwable -> 0x009c }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r1) goto L_0x0021;
    L_0x0010:
        r1 = 0;
        r13.state = r1;	 Catch:{ Throwable -> 0x009c }
        r1 = 0;
        r13.count = r1;	 Catch:{ Throwable -> 0x009c }
        r1 = 0;
        r13.next = r1;	 Catch:{ Throwable -> 0x009c }
        r1 = 0;
        r13.value = r1;	 Catch:{ Throwable -> 0x009c }
        r13.iterator();	 Catch:{ Throwable -> 0x009c }
        r14 = r13.data;	 Catch:{ Throwable -> 0x009c }
    L_0x0021:
        r1 = 0;
        r13.data = r1;	 Catch:{ Throwable -> 0x009c }
        r13.set();	 Catch:{ Throwable -> 0x009c }
    L_0x0027:
        r2 = r13.value;	 Catch:{ Throwable -> 0x009c }
        r4 = r2;
        r4 = (p000.User) r4;	 Catch:{ Throwable -> 0x009c }
        r3 = r4;
        r0 = r13.parent;	 Catch:{ Throwable -> 0x009c }
        r0 = r0 << 8;
        r5 = r13.offset;	 Catch:{ Throwable -> 0x009c }
        r5 = r5 << 8;
        r6 = r3.data;	 Catch:{ Throwable -> 0x009c }
        r7 = r6.length;	 Catch:{ Throwable -> 0x009c }
        r7 = r7 << 8;
        r8 = r5 - r0;
        if (r8 > 0) goto L_0x0041;
    L_0x003e:
        r1 = 0;
        r13.id = r1;	 Catch:{ Throwable -> 0x009c }
    L_0x0041:
        r9 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r9 >= 0) goto L_0x004c;
    L_0x0045:
        r9 = r13.name;	 Catch:{ Throwable -> 0x009c }
        if (r9 <= 0) goto L_0x00ee;
    L_0x0049:
        r1 = 0;
        r13.size = r1;	 Catch:{ Throwable -> 0x009c }
    L_0x004c:
        r9 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r9 < r7) goto L_0x0058;
    L_0x0050:
        r9 = r13.name;	 Catch:{ Throwable -> 0x009c }
        if (r9 >= 0) goto L_0x010d;
    L_0x0054:
        r9 = r7 + -1;
        r13.size = r9;	 Catch:{ Throwable -> 0x009c }
    L_0x0058:
        r9 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r10 = r13.name;	 Catch:{ Throwable -> 0x009c }
        r14 = r10 * r14;
        r14 = r9 + r14;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.id;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= 0) goto L_0x016b;
    L_0x0066:
        r11 = r13.text;	 Catch:{ Throwable -> 0x009c }
        if (r11 == 0) goto L_0x00f7;
    L_0x006a:
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= 0) goto L_0x013c;
    L_0x006e:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r0) goto L_0x012e;
    L_0x0072:
        monitor-exit(r13);
        return;
    L_0x0074:
        r14 = r0 + r0;
        r14 = r14 + -1;
        r8 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r8;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.id;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 + -1;
        r13.id = r14;	 Catch:{ Throwable -> 0x009c }
        if (r14 != 0) goto L_0x017e;
    L_0x008a:
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= 0) goto L_0x00ad;
    L_0x008e:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= 0) goto L_0x0072;
    L_0x0092:
        r1 = -1;
        r13.size = r1;	 Catch:{ Throwable -> 0x009c }
        r13.parse();	 Catch:{ Throwable -> 0x009c }
        r13.iterator();	 Catch:{ Throwable -> 0x009c }
        goto L_0x0072;
    L_0x009c:
        r12 = move-exception;
        monitor-exit(r13);
        throw r12;
    L_0x009f:
        r0 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r5 = r8 * r14;
        r0 = r0 + r5;
        r13.size = r0;	 Catch:{ Throwable -> 0x009c }
        r0 = r13.id;	 Catch:{ Throwable -> 0x009c }
        r14 = r0 - r14;
        r13.id = r14;	 Catch:{ Throwable -> 0x009c }
        goto L_0x0072;
    L_0x00ad:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r7) goto L_0x0072;
    L_0x00b1:
        r13.size = r7;	 Catch:{ Throwable -> 0x009c }
        r13.parse();	 Catch:{ Throwable -> 0x009c }
        r13.iterator();	 Catch:{ Throwable -> 0x009c }
        goto L_0x0072;
    L_0x00ba:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r0;
        r14 = r14 / r8;
        r0 = r13.id;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r0) goto L_0x01ce;
    L_0x00c2:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r0 = r13.id;	 Catch:{ Throwable -> 0x009c }
        r0 = r0 * r8;
        r14 = r14 - r0;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r1 = 0;
        r13.id = r1;	 Catch:{ Throwable -> 0x009c }
        goto L_0x008a;
    L_0x00ce:
        r0 = r13.value;	 Catch:{ Throwable -> 0x009c }
        r5 = r13.key;	 Catch:{ Throwable -> 0x009c }
        r5 = r5 * r14;
        r0 = r0 + r5;
        r13.value = r0;	 Catch:{ Throwable -> 0x009c }
        r0 = r13.next;	 Catch:{ Throwable -> 0x009c }
        r5 = r13.length;	 Catch:{ Throwable -> 0x009c }
        r5 = r5 * r14;
        r0 = r0 + r5;
        r13.next = r0;	 Catch:{ Throwable -> 0x009c }
        r0 = r13.count;	 Catch:{ Throwable -> 0x009c }
        r5 = r13.type;	 Catch:{ Throwable -> 0x009c }
        r5 = r5 * r14;
        r0 = r0 + r5;
        r13.count = r0;	 Catch:{ Throwable -> 0x009c }
        r0 = r13.data;	 Catch:{ Throwable -> 0x009c }
        r0 = r0 - r14;
        r13.data = r0;	 Catch:{ Throwable -> 0x009c }
        goto L_0x0027;
    L_0x00ee:
        r13.parse();	 Catch:{ Throwable -> 0x009c }
        r13.iterator();	 Catch:{ Throwable -> 0x009c }
        goto L_0x0072;
    L_0x00f7:
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= 0) goto L_0x01b5;
    L_0x00fb:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= r0) goto L_0x0072;
    L_0x00ff:
        r14 = r5 + -1;
        r0 = r5 + -1;
        r5 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r0 = r0 - r5;
        r0 = r0 % r8;
        r14 = r14 - r0;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        goto L_0x0072;
    L_0x010d:
        r13.parse();	 Catch:{ Throwable -> 0x009c }
        r13.iterator();	 Catch:{ Throwable -> 0x009c }
        goto L_0x0072;
    L_0x0116:
        r14 = r5 + -1;
        r0 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r0;
        r14 = r14 / r8;
        r0 = r13.id;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r0) goto L_0x009f;
    L_0x0120:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r0 = r13.id;	 Catch:{ Throwable -> 0x009c }
        r0 = r0 * r8;
        r14 = r14 + r0;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r1 = 0;
        r13.id = r1;	 Catch:{ Throwable -> 0x009c }
        goto L_0x008a;
    L_0x012e:
        r14 = r0 + r0;
        r14 = r14 + -1;
        r7 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r7;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x009c }
    L_0x013c:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r5) goto L_0x0072;
    L_0x0140:
        r14 = r5 + r5;
        r14 = r14 + -1;
        r7 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r7;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= r0) goto L_0x0072;
    L_0x0152:
        r14 = r0 + r0;
        r14 = r14 + -1;
        r7 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r7;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x009c }
        goto L_0x013c;
    L_0x0161:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r0;
        r14 = r14 % r8;
        r14 = r14 + r0;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        goto L_0x0072;
    L_0x016b:
        r14 = r13.id;	 Catch:{ Throwable -> 0x009c }
        if (r14 <= 0) goto L_0x008a;
    L_0x016f:
        r11 = r13.text;	 Catch:{ Throwable -> 0x009c }
        if (r11 == 0) goto L_0x01bc;
    L_0x0173:
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= 0) goto L_0x017e;
    L_0x0177:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r0) goto L_0x0074;
    L_0x017b:
        goto L_0x0072;
    L_0x017e:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r5) goto L_0x0072;
    L_0x0182:
        r14 = r5 + r5;
        r14 = r14 + -1;
        r8 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r8;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.id;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 + -1;
        r13.id = r14;	 Catch:{ Throwable -> 0x009c }
        if (r14 == 0) goto L_0x008a;
    L_0x0198:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= r0) goto L_0x0072;
    L_0x019c:
        r14 = r0 + r0;
        r14 = r14 + -1;
        r8 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 - r8;
        r13.size = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x009c }
        r14 = r13.id;	 Catch:{ Throwable -> 0x009c }
        r14 = r14 + -1;
        r13.id = r14;	 Catch:{ Throwable -> 0x009c }
        if (r14 != 0) goto L_0x017e;
    L_0x01b2:
        goto L_0x008a;
    L_0x01b5:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= r5) goto L_0x0161;
    L_0x01b9:
        goto L_0x0072;
    L_0x01bc:
        r14 = r13.name;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= 0) goto L_0x01c7;
    L_0x01c0:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 < r0) goto L_0x0116;
    L_0x01c4:
        goto L_0x0072;
    L_0x01c7:
        r14 = r13.size;	 Catch:{ Throwable -> 0x009c }
        if (r14 >= r5) goto L_0x00ba;
    L_0x01cb:
        goto L_0x0072;
    L_0x01ce:
        r0 = r13.size;	 Catch:{ Throwable -> 0x009c }
        r5 = r8 * r14;
        r0 = r0 - r5;
        r13.size = r0;	 Catch:{ Throwable -> 0x009c }
        r0 = r13.id;	 Catch:{ Throwable -> 0x009c }
        r14 = r0 - r14;
        r13.id = r14;	 Catch:{ Throwable -> 0x009c }
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.get(int):void");
    }

    synchronized void getByName(int i) {
        close(i, length());
    }

    public synchronized void getBytes(int i) {
        close(i << 6, length());
    }

    int getData() {
        int $i0 = (this.value * 3) >> 6;
        $i0 = (($i0 >> 31) ^ $i0) + ($i0 >>> 31);
        if (this.id == 0) {
            $i0 -= ($i0 * this.size) / (((User) this.value).data.length << 8);
        } else if (this.id >= 0) {
            $i0 -= ($i0 * this.parent) / ((User) this.value).data.length;
        }
        return $i0 > 255 ? 255 : $i0;
    }

    protected Entry getEntry() {
        return null;
    }

    public synchronized int getHeight() {
        return this.f6y < 0 ? -1 : this.f6y;
    }

    public synchronized int getKey() {
        return this.name < 0 ? -this.name : this.name;
    }

    public synchronized void getParameters(int i) {
        close(i << 6, length());
    }

    synchronized void getPath(int i) {
        close(i, length());
    }

    synchronized void getQuery(int i) {
        close(i, length());
    }

    public synchronized int getState() {
        return this.state == Integer.MIN_VALUE ? 0 : this.state;
    }

    protected int getType() {
        return (this.state == 0 && this.data == 0) ? 0 : 1;
    }

    public synchronized int getValue() {
        return this.state == Integer.MIN_VALUE ? 0 : this.state;
    }

    public synchronized int getVersion() {
        return this.f6y < 0 ? -1 : this.f6y;
    }

    protected Entry indexOf() {
        return null;
    }

    public synchronized void init(int $i0) {
        if ($i0 == 0) {
            getPath(0);
            iterator();
        } else if (this.next == 0 && this.count == 0) {
            this.data = 0;
            this.state = 0;
            this.value = 0;
            iterator();
        } else {
            int $i1 = -this.value;
            if (this.value > $i1) {
                $i1 = this.value;
            }
            if ((-this.next) > $i1) {
                $i1 = -this.next;
            }
            if (this.next > $i1) {
                $i1 = this.next;
            }
            if ((-this.count) > $i1) {
                $i1 = -this.count;
            }
            if (this.count > $i1) {
                $i1 = this.count;
            }
            if ($i0 > $i1) {
                $i0 = $i1;
            }
            this.data = $i0;
            this.state = Integer.MIN_VALUE;
            this.key = (-this.value) / $i0;
            this.length = (-this.next) / $i0;
            this.type = (-this.count) / $i0;
        }
    }

    boolean insert() {
        int $i1;
        int $i2;
        int $i0 = this.state;
        if ($i0 == 1835435602) {
            $i1 = 0;
            $i2 = 0;
            $i0 = 0;
        } else {
            $i2 = Address.add($i0, this.f6y);
            $i1 = Address.set($i0, this.f6y);
        }
        if (this.value != $i0 || this.next != $i2 || this.count != $i1) {
            if (this.value < $i0) {
                this.key = 1;
                this.data = $i0 - this.value;
            } else if (this.value > $i0) {
                this.key = -1;
                this.data = this.value - $i0;
            } else {
                this.key = 0;
            }
            if (this.next < $i2) {
                this.length = 1;
                if (this.data == 0 || this.data > $i2 - this.next) {
                    this.data = $i2 - this.next;
                }
            } else if (this.next > $i2) {
                this.length = -1;
                if (this.data == 0 || this.data > this.next - $i2) {
                    this.data = this.next - $i2;
                }
            } else {
                this.length = 0;
            }
            if (this.count < $i1) {
                this.type = 1;
                if (this.data == 0 || this.data > $i1 - this.count) {
                    this.data = $i1 - this.count;
                    return false;
                }
            } else if (this.count > $i1) {
                this.type = -1;
                if (this.data == 0 || this.data > this.count - $i1) {
                    this.data = this.count - $i1;
                    return false;
                }
            } else {
                this.type = 0;
            }
            return false;
        } else if (this.state == Integer.MIN_VALUE) {
            this.state = 0;
            this.count = 0;
            this.next = 0;
            this.value = 0;
            iterator();
            return true;
        } else {
            set();
            return false;
        }
    }

    protected int isEmpty() {
        return (this.state == 0 && this.data == 0) ? 0 : 1;
    }

    public boolean isValid() {
        return this.data != 0;
    }

    public synchronized int length() {
        return this.f6y < 0 ? -1 : this.f6y;
    }

    boolean next() {
        int $i1;
        int $i2;
        int $i0 = this.state;
        if ($i0 == Integer.MIN_VALUE) {
            $i1 = 0;
            $i2 = 0;
            $i0 = 0;
        } else {
            $i2 = Address.add($i0, this.f6y);
            $i1 = Address.set($i0, this.f6y);
        }
        if (this.value != $i0 || this.next != $i2 || this.count != $i1) {
            if (this.value < $i0) {
                this.key = 1;
                this.data = $i0 - this.value;
            } else if (this.value > $i0) {
                this.key = -1;
                this.data = this.value - $i0;
            } else {
                this.key = 0;
            }
            if (this.next < $i2) {
                this.length = 1;
                if (this.data == 0 || this.data > $i2 - this.next) {
                    this.data = $i2 - this.next;
                }
            } else if (this.next > $i2) {
                this.length = -1;
                if (this.data == 0 || this.data > this.next - $i2) {
                    this.data = this.next - $i2;
                }
            } else {
                this.length = 0;
            }
            if (this.count < $i1) {
                this.type = 1;
                if (this.data == 0 || this.data > $i1 - this.count) {
                    this.data = $i1 - this.count;
                    return false;
                }
            } else if (this.count > $i1) {
                this.type = -1;
                if (this.data == 0 || this.data > this.count - $i1) {
                    this.data = this.count - $i1;
                    return false;
                }
            } else {
                this.type = 0;
                return false;
            }
        } else if (this.state == Integer.MIN_VALUE) {
            this.state = 0;
            this.count = 0;
            this.next = 0;
            this.value = 0;
            iterator();
            return true;
        } else {
            set();
        }
        return false;
    }

    synchronized void onResult(int i) {
        close(i, length());
    }

    protected int open() {
        return (this.state == 0 && this.data == 0) ? 0 : 1;
    }

    public synchronized void open(int $i0) {
        if ($i0 == 0) {
            getPath(0);
            iterator();
        } else if (this.next == 0 && this.count == 0) {
            this.data = 0;
            this.state = 0;
            this.value = 0;
            iterator();
        } else {
            int $i1 = -this.value;
            if (this.value > $i1) {
                $i1 = this.value;
            }
            if ((-this.next) > $i1) {
                $i1 = -this.next;
            }
            if (this.next > $i1) {
                $i1 = this.next;
            }
            if ((-this.count) > $i1) {
                $i1 = -this.count;
            }
            if (this.count > $i1) {
                $i1 = this.count;
            }
            if ($i0 > $i1) {
                $i0 = $i1;
            }
            this.data = $i0;
            this.state = Integer.MIN_VALUE;
            this.key = (-this.value) / $i0;
            this.length = (-this.next) / $i0;
            this.type = (-this.count) / $i0;
        }
    }

    void pack() {
        this.value = this.state;
        this.next = Address.add(this.state, this.f6y);
        this.count = Address.set(this.state, this.f6y);
    }

    synchronized void pack(int i, int i2) {
        this.state = i;
        this.f6y = i2;
        this.data = 0;
        set();
    }

    void parse() {
        if (this.data != 0) {
            if (this.state == Integer.MIN_VALUE) {
                this.state = 0;
            }
            this.data = 0;
            set();
        }
    }

    public synchronized void parse(int $i0) {
        if (this.data > 0) {
            if ($i0 >= this.data) {
                if (this.state == Integer.MIN_VALUE) {
                    this.state = 0;
                    this.count = 0;
                    this.next = 0;
                    this.value = 0;
                    iterator();
                    $i0 = this.data;
                }
                this.data = 0;
                set();
            } else {
                this.value += this.key * $i0;
                this.next += this.length * $i0;
                this.count += this.type * $i0;
                this.data -= $i0;
            }
        }
        int $i1 = this.parent << 8;
        int $i2 = this.offset << 8;
        int $i3 = ((User) this.value).data.length << 8;
        int $i4 = $i2 - $i1;
        if ($i4 <= 0) {
            this.id = 0;
        }
        if (this.size < 0) {
            if (this.name > 0) {
                this.size = 0;
            } else {
                parse();
                iterator();
            }
        }
        if (this.size >= $i3) {
            if (this.name < 0) {
                this.size = $i3 - 1;
            } else {
                parse();
                iterator();
            }
        }
        this.size += this.name * $i0;
        if (this.id >= 0) {
            if (this.id > 0) {
                if (this.text) {
                    if (this.name < 0) {
                        if (this.size < $i1) {
                            this.size = (($i1 + $i1) - 1) - this.size;
                            this.name = -this.name;
                            $i0 = this.id - 1;
                            this.id = $i0;
                            if ($i0 == 0) {
                            }
                        }
                    }
                    while (this.size >= $i2) {
                        this.size = (($i2 + $i2) - 1) - this.size;
                        this.name = -this.name;
                        $i0 = this.id - 1;
                        this.id = $i0;
                        if ($i0 != 0) {
                            if (this.size >= $i1) {
                                break;
                            }
                            this.size = (($i1 + $i1) - 1) - this.size;
                            this.name = -this.name;
                            $i0 = this.id - 1;
                            this.id = $i0;
                            if ($i0 == 0) {
                            }
                        }
                    }
                } else if (this.name < 0) {
                    if (this.size < $i1) {
                        $i0 = (($i2 - 1) - this.size) / $i4;
                        if ($i0 >= this.id) {
                            this.size += this.id * $i4;
                            this.id = 0;
                        } else {
                            this.size += $i4 * $i0;
                            this.id -= $i0;
                        }
                    }
                } else if (this.size >= $i2) {
                    $i0 = (this.size - $i1) / $i4;
                    if ($i0 >= this.id) {
                        this.size -= this.id * $i4;
                        this.id = 0;
                    } else {
                        this.size -= $i4 * $i0;
                        this.id -= $i0;
                    }
                }
            }
            if (this.name < 0) {
                if (this.size < 0) {
                    this.size = -1;
                    parse();
                    iterator();
                }
            } else if (this.size >= $i3) {
                this.size = $i3;
                parse();
                iterator();
            }
        } else if (this.text) {
            if (this.name < 0) {
                if (this.size < $i1) {
                    this.size = (($i1 + $i1) - 1) - this.size;
                    this.name = -this.name;
                }
            }
            while (this.size >= $i2) {
                this.size = (($i2 + $i2) - 1) - this.size;
                this.name = -this.name;
                if (this.size >= $i1) {
                    break;
                }
                this.size = (($i1 + $i1) - 1) - this.size;
                this.name = -this.name;
            }
        } else if (this.name < 0) {
            if (this.size < $i1) {
                this.size = ($i2 - 1) - ((($i2 - 1) - this.size) % $i4);
            }
        } else if (this.size >= $i2) {
            this.size = ((this.size - $i1) % $i4) + $i1;
        }
    }

    int process(int[] iArr, int $i0, int i, int i2, int $i3) {
        while (this.data > 0) {
            int $i4 = $i0 + this.data;
            if ($i4 > i2) {
                $i4 = i2;
            }
            int $i5 = this.data;
            $i5 += $i0;
            int i3 = $i5;
            this.data = $i5;
            if (this.name == 256) {
                $i5 = this.size;
                if (($i5 & 255) == 0) {
                    if (Puzzle.data) {
                        $i0 = Address.add(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this);
                    } else {
                        $i0 = Address.get(((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this);
                    }
                    $i5 = this.data;
                    $i5 -= $i0;
                    $i4 = $i5;
                    this.data = $i5;
                    if (this.data != 0) {
                        return $i0;
                    }
                    if (next()) {
                        return i2;
                    }
                }
            }
            if (Puzzle.data) {
                $i0 = Address.add(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this, this.name, $i3);
            } else {
                $i0 = Address.toString(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this, this.name, $i3);
            }
            $i5 = this.data;
            $i5 -= $i0;
            $i4 = $i5;
            this.data = $i5;
            if (this.data != 0) {
                return $i0;
            }
            if (next()) {
                return i2;
            }
        }
        if (this.name == 256) {
            $i5 = this.size;
            if (($i5 & 255) == 0) {
                if (Puzzle.data) {
                    return Address.add(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this);
                }
                return Address.add(((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this);
            }
        }
        if (Puzzle.data) {
            return Address.add(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this, this.name, $i3);
        }
        return Address.add(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this, this.name, $i3);
    }

    public synchronized void process(int $i0) {
        if (this.data > 0) {
            if ($i0 >= this.data) {
                if (this.state == Integer.MIN_VALUE) {
                    this.state = 0;
                    this.count = 0;
                    this.next = 0;
                    this.value = 0;
                    iterator();
                    $i0 = this.data;
                }
                this.data = 0;
                set();
            } else {
                this.value += this.key * $i0;
                this.next += this.length * $i0;
                this.count += this.type * $i0;
                this.data -= $i0;
            }
        }
        int $i1 = this.parent << 8;
        int $i2 = this.offset << 8;
        int $i3 = ((User) this.value).data.length << 8;
        int $i4 = $i2 - $i1;
        if ($i4 <= 0) {
            this.id = 0;
        }
        if (this.size < 0) {
            if (this.name > 0) {
                this.size = 0;
            } else {
                parse();
                iterator();
            }
        }
        if (this.size >= $i3) {
            if (this.name < 0) {
                this.size = $i3 - 1;
            } else {
                parse();
                iterator();
            }
        }
        this.size += this.name * $i0;
        if (this.id >= 0) {
            if (this.id > 0) {
                if (this.text) {
                    if (this.name < 0) {
                        if (this.size < $i1) {
                            this.size = (($i1 + $i1) - 1) - this.size;
                            this.name = -this.name;
                            $i0 = this.id - 1;
                            this.id = $i0;
                            if ($i0 == 0) {
                            }
                        }
                    }
                    while (this.size >= $i2) {
                        this.size = (($i2 + $i2) - 1) - this.size;
                        this.name = -this.name;
                        $i0 = this.id - 1;
                        this.id = $i0;
                        if ($i0 != 0) {
                            if (this.size >= $i1) {
                                break;
                            }
                            this.size = (($i1 + $i1) - 1) - this.size;
                            this.name = -this.name;
                            $i0 = this.id - 1;
                            this.id = $i0;
                            if ($i0 == 0) {
                            }
                        }
                    }
                } else if (this.name < 0) {
                    if (this.size < $i1) {
                        $i0 = (($i2 - 1) - this.size) / $i4;
                        if ($i0 >= this.id) {
                            this.size += this.id * $i4;
                            this.id = 0;
                        } else {
                            this.size += $i4 * $i0;
                            this.id -= $i0;
                        }
                    }
                } else if (this.size >= $i2) {
                    $i0 = (this.size - $i1) / $i4;
                    if ($i0 >= this.id) {
                        this.size -= this.id * $i4;
                        this.id = 0;
                    } else {
                        this.size -= $i4 * $i0;
                        this.id -= $i0;
                    }
                }
            }
            if (this.name < 0) {
                if (this.size < 0) {
                    this.size = -1;
                    parse();
                    iterator();
                }
            } else if (this.size >= $i3) {
                this.size = $i3;
                parse();
                iterator();
            }
        } else if (this.text) {
            if (this.name < 0) {
                if (this.size < $i1) {
                    this.size = (($i1 + $i1) - 1) - this.size;
                    this.name = -this.name;
                }
            }
            while (this.size >= $i2) {
                this.size = (($i2 + $i2) - 1) - this.size;
                this.name = -this.name;
                if (this.size >= $i1) {
                    break;
                }
                this.size = (($i1 + $i1) - 1) - this.size;
                this.name = -this.name;
            }
        } else if (this.name < 0) {
            if (this.size < $i1) {
                this.size = ($i2 - 1) - ((($i2 - 1) - this.size) % $i4);
            }
        } else if (this.size >= $i2) {
            this.size = ((this.size - $i1) % $i4) + $i1;
        }
    }

    public boolean proxy() {
        return this.data != 0;
    }

    int read(int[] iArr, int $i0, int i, int i2, int $i3) {
        while (this.data > 0) {
            int $i4 = $i0 + this.data;
            if ($i4 > i2) {
                $i4 = i2;
            }
            int $i5 = this.data;
            $i5 += $i0;
            int i3 = $i5;
            this.data = $i5;
            if (this.name == 256) {
                $i5 = this.size;
                if (($i5 & 255) == 0) {
                    if (Puzzle.data) {
                        $i0 = Address.add(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this);
                    } else {
                        $i0 = Address.get(((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this);
                    }
                    $i5 = this.data;
                    $i5 -= $i0;
                    $i4 = $i5;
                    this.data = $i5;
                    if (this.data != 0) {
                        return $i0;
                    }
                    if (next()) {
                        return i2;
                    }
                }
            }
            if (Puzzle.data) {
                $i0 = Address.add(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this, this.name, $i3);
            } else {
                $i0 = Address.toString(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this, this.name, $i3);
            }
            $i5 = this.data;
            $i5 -= $i0;
            $i4 = $i5;
            this.data = $i5;
            if (this.data != 0) {
                return $i0;
            }
            if (next()) {
                return i2;
            }
        }
        if (this.name == 256) {
            $i5 = this.size;
            if (($i5 & 255) == 0) {
                if (Puzzle.data) {
                    return Address.add(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this);
                }
                return Address.add(((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this);
            }
        }
        if (Puzzle.data) {
            return Address.add(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this, this.name, $i3);
        }
        return Address.add(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this, this.name, $i3);
    }

    protected Entry remove() {
        return null;
    }

    public synchronized int resolve() {
        return this.name < 0 ? -this.name : this.name;
    }

    public synchronized void resolve(int $i0) {
        if (this.name < 0) {
            this.name = -$i0;
        } else {
            this.name = $i0;
        }
    }

    int run(int[] iArr, int $i0, int i, int i2, int $i3) {
        while (this.data > 0) {
            int $i4 = $i0 + this.data;
            if ($i4 > i2) {
                $i4 = i2;
            }
            int $i5 = this.data;
            $i5 += $i0;
            int i3 = $i5;
            this.data = $i5;
            if (this.name == 1738591611) {
                $i5 = this.size;
                if (($i5 & 255) == 0) {
                    if (Puzzle.data) {
                        $i0 = Address.get(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this);
                    } else {
                        $i0 = Address.toString(((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this);
                    }
                    $i5 = this.data;
                    $i5 -= $i0;
                    $i4 = $i5;
                    this.data = $i5;
                    if (this.data != 0) {
                        return $i0;
                    }
                    if (next()) {
                        return i2;
                    }
                }
            }
            if (Puzzle.data) {
                $i0 = Address.get(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this, this.name, $i3);
            } else {
                $i0 = Address.get(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this, this.name, $i3);
            }
            $i5 = this.data;
            $i5 -= $i0;
            $i4 = $i5;
            this.data = $i5;
            if (this.data != 0) {
                return $i0;
            }
            if (next()) {
                return i2;
            }
        }
        if (this.name == -256 && (this.size & 1827644254) == 0) {
            if (Puzzle.data) {
                return Address.toString(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this);
            }
            return Address.get(((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this);
        } else if (Puzzle.data) {
            return Address.write(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this, this.name, $i3);
        } else {
            return Address.write(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this, this.name, $i3);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void run(int r14) {
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = r13.data;	 Catch:{ Throwable -> 0x007b }
        if (r0 <= 0) goto L_0x0027;
    L_0x0005:
        r0 = r13.data;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r0) goto L_0x00a3;
    L_0x0009:
        r0 = r13.state;	 Catch:{ Throwable -> 0x007b }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r1) goto L_0x0021;
    L_0x0010:
        r1 = 0;
        r13.state = r1;	 Catch:{ Throwable -> 0x007b }
        r1 = 0;
        r13.count = r1;	 Catch:{ Throwable -> 0x007b }
        r1 = 0;
        r13.next = r1;	 Catch:{ Throwable -> 0x007b }
        r1 = 0;
        r13.value = r1;	 Catch:{ Throwable -> 0x007b }
        r13.iterator();	 Catch:{ Throwable -> 0x007b }
        r14 = r13.data;	 Catch:{ Throwable -> 0x007b }
    L_0x0021:
        r1 = 0;
        r13.data = r1;	 Catch:{ Throwable -> 0x007b }
        r13.set();	 Catch:{ Throwable -> 0x007b }
    L_0x0027:
        r2 = r13.value;	 Catch:{ Throwable -> 0x007b }
        r4 = r2;
        r4 = (p000.User) r4;	 Catch:{ Throwable -> 0x007b }
        r3 = r4;
        r0 = r13.parent;	 Catch:{ Throwable -> 0x007b }
        r0 = r0 << 8;
        r5 = r13.offset;	 Catch:{ Throwable -> 0x007b }
        r5 = r5 << 8;
        r6 = r3.data;	 Catch:{ Throwable -> 0x007b }
        r7 = r6.length;	 Catch:{ Throwable -> 0x007b }
        r7 = r7 << 8;
        r8 = r5 - r0;
        if (r8 > 0) goto L_0x0041;
    L_0x003e:
        r1 = 0;
        r13.id = r1;	 Catch:{ Throwable -> 0x007b }
    L_0x0041:
        r9 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r9 >= 0) goto L_0x004c;
    L_0x0045:
        r9 = r13.name;	 Catch:{ Throwable -> 0x007b }
        if (r9 <= 0) goto L_0x0135;
    L_0x0049:
        r1 = 0;
        r13.size = r1;	 Catch:{ Throwable -> 0x007b }
    L_0x004c:
        r9 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r9 < r7) goto L_0x0058;
    L_0x0050:
        r9 = r13.name;	 Catch:{ Throwable -> 0x007b }
        if (r9 >= 0) goto L_0x0074;
    L_0x0054:
        r9 = r7 + -1;
        r13.size = r9;	 Catch:{ Throwable -> 0x007b }
    L_0x0058:
        r9 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r10 = r13.name;	 Catch:{ Throwable -> 0x007b }
        r14 = r10 * r14;
        r14 = r9 + r14;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.id;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= 0) goto L_0x01b0;
    L_0x0066:
        r11 = r13.text;	 Catch:{ Throwable -> 0x007b }
        if (r11 == 0) goto L_0x019e;
    L_0x006a:
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= 0) goto L_0x00e3;
    L_0x006e:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r0) goto L_0x0175;
    L_0x0072:
        monitor-exit(r13);
        return;
    L_0x0074:
        r13.parse();	 Catch:{ Throwable -> 0x007b }
        r13.iterator();	 Catch:{ Throwable -> 0x007b }
        goto L_0x0072;
    L_0x007b:
        r12 = move-exception;
        monitor-exit(r13);
        throw r12;
    L_0x007e:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r0;
        r14 = r14 / r8;
        r0 = r13.id;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r0) goto L_0x013e;
    L_0x0086:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r0 = r13.id;	 Catch:{ Throwable -> 0x007b }
        r0 = r0 * r8;
        r14 = r14 - r0;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r1 = 0;
        r13.id = r1;	 Catch:{ Throwable -> 0x007b }
    L_0x0091:
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= 0) goto L_0x0166;
    L_0x0095:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= 0) goto L_0x0072;
    L_0x0099:
        r1 = -1;
        r13.size = r1;	 Catch:{ Throwable -> 0x007b }
        r13.parse();	 Catch:{ Throwable -> 0x007b }
        r13.iterator();	 Catch:{ Throwable -> 0x007b }
        goto L_0x0072;
    L_0x00a3:
        r0 = r13.value;	 Catch:{ Throwable -> 0x007b }
        r5 = r13.key;	 Catch:{ Throwable -> 0x007b }
        r5 = r5 * r14;
        r0 = r0 + r5;
        r13.value = r0;	 Catch:{ Throwable -> 0x007b }
        r0 = r13.next;	 Catch:{ Throwable -> 0x007b }
        r5 = r13.length;	 Catch:{ Throwable -> 0x007b }
        r5 = r5 * r14;
        r0 = r0 + r5;
        r13.next = r0;	 Catch:{ Throwable -> 0x007b }
        r0 = r13.count;	 Catch:{ Throwable -> 0x007b }
        r5 = r13.type;	 Catch:{ Throwable -> 0x007b }
        r5 = r5 * r14;
        r0 = r0 + r5;
        r13.count = r0;	 Catch:{ Throwable -> 0x007b }
        r0 = r13.data;	 Catch:{ Throwable -> 0x007b }
        r0 = r0 - r14;
        r13.data = r0;	 Catch:{ Throwable -> 0x007b }
        goto L_0x0027;
    L_0x00c3:
        r14 = r5 + r5;
        r14 = r14 + -1;
        r7 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r7;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= r0) goto L_0x0072;
    L_0x00d5:
        r14 = r0 + r0;
        r14 = r14 + -1;
        r7 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r7;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x007b }
    L_0x00e3:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= r5) goto L_0x00c3;
    L_0x00e7:
        goto L_0x0072;
    L_0x00e8:
        r14 = r0 + r0;
        r14 = r14 + -1;
        r8 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r8;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.id;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 + -1;
        r13.id = r14;	 Catch:{ Throwable -> 0x007b }
        if (r14 == 0) goto L_0x0091;
    L_0x00fe:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r5) goto L_0x0072;
    L_0x0102:
        r14 = r5 + r5;
        r14 = r14 + -1;
        r8 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r8;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.id;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 + -1;
        r13.id = r14;	 Catch:{ Throwable -> 0x007b }
        if (r14 == 0) goto L_0x0091;
    L_0x0118:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= r0) goto L_0x0072;
    L_0x011c:
        r14 = r0 + r0;
        r14 = r14 + -1;
        r8 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r8;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.id;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 + -1;
        r13.id = r14;	 Catch:{ Throwable -> 0x007b }
        if (r14 != 0) goto L_0x00fe;
    L_0x0132:
        goto L_0x0091;
    L_0x0135:
        r13.parse();	 Catch:{ Throwable -> 0x007b }
        r13.iterator();	 Catch:{ Throwable -> 0x007b }
        goto L_0x0072;
    L_0x013e:
        r0 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r5 = r8 * r14;
        r0 = r0 - r5;
        r13.size = r0;	 Catch:{ Throwable -> 0x007b }
        r0 = r13.id;	 Catch:{ Throwable -> 0x007b }
        r14 = r0 - r14;
        r13.id = r14;	 Catch:{ Throwable -> 0x007b }
        goto L_0x0072;
    L_0x014e:
        r14 = r5 + -1;
        r0 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r0;
        r14 = r14 / r8;
        r0 = r13.id;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r0) goto L_0x01ce;
    L_0x0158:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r0 = r13.id;	 Catch:{ Throwable -> 0x007b }
        r0 = r0 * r8;
        r14 = r14 + r0;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r1 = 0;
        r13.id = r1;	 Catch:{ Throwable -> 0x007b }
        goto L_0x0091;
    L_0x0166:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r7) goto L_0x0072;
    L_0x016a:
        r13.size = r7;	 Catch:{ Throwable -> 0x007b }
        r13.parse();	 Catch:{ Throwable -> 0x007b }
        r13.iterator();	 Catch:{ Throwable -> 0x007b }
        goto L_0x0072;
    L_0x0175:
        r14 = r0 + r0;
        r14 = r14 + -1;
        r7 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r7;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        r14 = -r14;
        r13.name = r14;	 Catch:{ Throwable -> 0x007b }
        goto L_0x00e3;
    L_0x0186:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r14 = r14 - r0;
        r14 = r14 % r8;
        r14 = r14 + r0;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        goto L_0x0072;
    L_0x0190:
        r14 = r5 + -1;
        r0 = r5 + -1;
        r5 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r0 = r0 - r5;
        r0 = r0 % r8;
        r14 = r14 - r0;
        r13.size = r14;	 Catch:{ Throwable -> 0x007b }
        goto L_0x0072;
    L_0x019e:
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= 0) goto L_0x01a9;
    L_0x01a2:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r0) goto L_0x0190;
    L_0x01a6:
        goto L_0x0072;
    L_0x01a9:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= r5) goto L_0x0186;
    L_0x01ad:
        goto L_0x0072;
    L_0x01b0:
        r14 = r13.id;	 Catch:{ Throwable -> 0x007b }
        if (r14 <= 0) goto L_0x0091;
    L_0x01b4:
        r11 = r13.text;	 Catch:{ Throwable -> 0x007b }
        if (r11 == 0) goto L_0x01c3;
    L_0x01b8:
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= 0) goto L_0x00fe;
    L_0x01bc:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r0) goto L_0x00e8;
    L_0x01c0:
        goto L_0x0072;
    L_0x01c3:
        r14 = r13.name;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= 0) goto L_0x01de;
    L_0x01c7:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 < r0) goto L_0x014e;
    L_0x01cb:
        goto L_0x0072;
    L_0x01ce:
        r0 = r13.size;	 Catch:{ Throwable -> 0x007b }
        r5 = r8 * r14;
        r0 = r0 + r5;
        r13.size = r0;	 Catch:{ Throwable -> 0x007b }
        r0 = r13.id;	 Catch:{ Throwable -> 0x007b }
        r14 = r0 - r14;
        r13.id = r14;	 Catch:{ Throwable -> 0x007b }
        goto L_0x0072;
    L_0x01de:
        r14 = r13.size;	 Catch:{ Throwable -> 0x007b }
        if (r14 >= r5) goto L_0x007e;
    L_0x01e2:
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.run(int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void run(int[] r23, int r24, int r25) {
        /*
        r22 = this;
        monitor-enter(r22);
        r0 = r22;
        r6 = r0.state;	 Catch:{ Throwable -> 0x0065 }
        if (r6 != 0) goto L_0x0086;
    L_0x0007:
        r0 = r22;
        r6 = r0.data;	 Catch:{ Throwable -> 0x0065 }
        if (r6 != 0) goto L_0x0086;
    L_0x000d:
        r0 = r22;
        r1 = r25;
        r0.get(r1);	 Catch:{ Throwable -> 0x0065 }
    L_0x0014:
        monitor-exit(r22);
        return;
    L_0x0016:
        r7 = r6 + r6;
        r7 = r7 + -1;
        r0 = r22;
        r8 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r7 = r7 - r8;
        r0 = r22;
        r0.size = r7;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r7 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        r7 = -r7;
        r0 = r22;
        r0.name = r7;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r7 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r7 = r7 + -1;
        r0 = r22;
        r0.id = r7;	 Catch:{ Throwable -> 0x0065 }
        if (r7 != 0) goto L_0x0287;
    L_0x0038:
        r0 = r22;
        r6 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        if (r6 >= 0) goto L_0x0376;
    L_0x003e:
        r9 = 0;
        r10 = 0;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r9;
        r4 = r25;
        r5 = r10;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r24 = r0;
        if (r24 >= 0) goto L_0x0014;
    L_0x0055:
        r9 = -1;
        r0 = r22;
        r0.size = r9;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0.parse();	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0.iterator();	 Catch:{ Throwable -> 0x0065 }
        goto L_0x0014;
    L_0x0065:
        r11 = move-exception;
        monitor-exit(r22);
        throw r11;
    L_0x0068:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.parent;	 Catch:{ Throwable -> 0x0065 }
        r24 = r0;
        r14 = r12[r24];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r7;
        r3 = r6;
        r4 = r25;
        r5 = r14;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r7 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        if (r7 < r6) goto L_0x0016;
    L_0x0085:
        goto L_0x0014;
    L_0x0086:
        r0 = r22;
        r15 = r0.value;	 Catch:{ Throwable -> 0x0065 }
        r16 = r15;
        r16 = (p000.User) r16;	 Catch:{ Throwable -> 0x0065 }
        r13 = r16;
        r0 = r22;
        r6 = r0.parent;	 Catch:{ Throwable -> 0x0065 }
        r6 = r6 << 8;
        r0 = r22;
        r0 = r0.offset;	 Catch:{ Throwable -> 0x0065 }
        r17 = r0;
        r17 = r17 << 8;
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r12.length;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r18 = r18 << 8;
        r7 = r17 - r6;
        if (r7 > 0) goto L_0x00ae;
    L_0x00a9:
        r9 = 0;
        r0 = r22;
        r0.id = r9;	 Catch:{ Throwable -> 0x0065 }
    L_0x00ae:
        r0 = r25;
        r1 = r24;
        r0 = r0 + r1;
        r25 = r0;
        r0 = r22;
        r8 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        if (r8 >= 0) goto L_0x00c6;
    L_0x00bb:
        r0 = r22;
        r8 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        if (r8 <= 0) goto L_0x01b2;
    L_0x00c1:
        r9 = 0;
        r0 = r22;
        r0.size = r9;	 Catch:{ Throwable -> 0x0065 }
    L_0x00c6:
        r0 = r22;
        r8 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r0 = r18;
        if (r8 < r0) goto L_0x00da;
    L_0x00ce:
        r0 = r22;
        r8 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        if (r8 >= 0) goto L_0x0228;
    L_0x00d4:
        r8 = r18 + -1;
        r0 = r22;
        r0.size = r8;	 Catch:{ Throwable -> 0x0065 }
    L_0x00da:
        r0 = r22;
        r8 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        if (r8 >= 0) goto L_0x0235;
    L_0x00e0:
        r0 = r22;
        r0 = r0.text;	 Catch:{ Throwable -> 0x0065 }
        r19 = r0;
        if (r19 == 0) goto L_0x03a2;
    L_0x00e8:
        r0 = r22;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        if (r18 >= 0) goto L_0x0400;
    L_0x00f0:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.parent;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r14 = r12[r18];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r14;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        if (r0 >= r6) goto L_0x0014;
    L_0x0110:
        r18 = r6 + r6;
        r18 = r18 + -1;
        r0 = r22;
        r7 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r0 = r18;
        r0 = r0 - r7;
        r18 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r0 = -r0;
        r18 = r0;
        r1 = r22;
        r1.name = r0;	 Catch:{ Throwable -> 0x0065 }
    L_0x012e:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.offset;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r18 = r18 + -1;
        r14 = r12[r18];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r17;
        r4 = r25;
        r5 = r14;
        r24 = r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r1 = r17;
        if (r0 < r1) goto L_0x0014;
    L_0x0153:
        r18 = r17 + r17;
        r18 = r18 + -1;
        r0 = r22;
        r7 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r0 = r18;
        r0 = r0 - r7;
        r18 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r0 = -r0;
        r18 = r0;
        r1 = r22;
        r1.name = r0;	 Catch:{ Throwable -> 0x0065 }
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.parent;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r14 = r12[r18];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r14;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        if (r0 >= r6) goto L_0x0014;
    L_0x0191:
        r18 = r6 + r6;
        r18 = r18 + -1;
        r0 = r22;
        r7 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r0 = r18;
        r0 = r0 - r7;
        r18 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r0 = -r0;
        r18 = r0;
        r1 = r22;
        r1.name = r0;	 Catch:{ Throwable -> 0x0065 }
        goto L_0x012e;
    L_0x01b2:
        r0 = r22;
        r0.parse();	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0.iterator();	 Catch:{ Throwable -> 0x0065 }
        goto L_0x0014;
    L_0x01bf:
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r20 = r0;
        r21 = r7 * r8;
        r0 = r20;
        r1 = r21;
        r0 = r0 + r1;
        r20 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r20 = r0;
        r8 = r20 - r8;
        r0 = r22;
        r0.id = r8;	 Catch:{ Throwable -> 0x0065 }
    L_0x01de:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r8 = r0.offset;	 Catch:{ Throwable -> 0x0065 }
        r8 = r8 + -1;
        r14 = r12[r8];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r14;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r8 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        if (r8 >= r6) goto L_0x0014;
    L_0x01fc:
        r8 = r17 + -1;
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r20 = r0;
        r8 = r8 - r0;
        r8 = r8 / r7;
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r20 = r0;
        if (r8 < r0) goto L_0x01bf;
    L_0x020e:
        r0 = r22;
        r6 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r17 = r0;
        r0 = r0 * r7;
        r17 = r0;
        r6 = r6 + r0;
        r0 = r22;
        r0.size = r6;	 Catch:{ Throwable -> 0x0065 }
        r9 = 0;
        r0 = r22;
        r0.id = r9;	 Catch:{ Throwable -> 0x0065 }
        goto L_0x0038;
    L_0x0228:
        r0 = r22;
        r0.parse();	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0.iterator();	 Catch:{ Throwable -> 0x0065 }
        goto L_0x0014;
    L_0x0235:
        r0 = r22;
        r8 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        if (r8 <= 0) goto L_0x040a;
    L_0x023b:
        r0 = r22;
        r0 = r0.text;	 Catch:{ Throwable -> 0x0065 }
        r19 = r0;
        if (r19 == 0) goto L_0x03ad;
    L_0x0243:
        r0 = r22;
        r7 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        if (r7 >= 0) goto L_0x0407;
    L_0x0249:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r7 = r0.parent;	 Catch:{ Throwable -> 0x0065 }
        r14 = r12[r7];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r14;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r7 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        if (r7 >= r6) goto L_0x0014;
    L_0x0265:
        r7 = r6 + r6;
        r7 = r7 + -1;
        r0 = r22;
        r8 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r7 = r7 - r8;
        r0 = r22;
        r0.size = r7;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r7 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        r7 = -r7;
        r0 = r22;
        r0.name = r7;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r7 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r7 = r7 + -1;
        r0 = r22;
        r0.id = r7;	 Catch:{ Throwable -> 0x0065 }
        if (r7 == 0) goto L_0x0038;
    L_0x0287:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r7 = r0.offset;	 Catch:{ Throwable -> 0x0065 }
        r7 = r7 + -1;
        r14 = r12[r7];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r17;
        r4 = r25;
        r5 = r14;
        r7 = r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r24 = r7;
        r0 = r22;
        r8 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r0 = r17;
        if (r8 < r0) goto L_0x0014;
    L_0x02aa:
        r8 = r17 + r17;
        r8 = r8 + -1;
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r20 = r0;
        r8 = r8 - r0;
        r0 = r22;
        r0.size = r8;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r8 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        r8 = -r8;
        r0 = r22;
        r0.name = r8;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r8 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r8 = r8 + -1;
        r0 = r22;
        r0.id = r8;	 Catch:{ Throwable -> 0x0065 }
        if (r8 != 0) goto L_0x0068;
    L_0x02ce:
        goto L_0x0038;
    L_0x02d1:
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r0 = r0 - r6;
        r18 = r0;
        r0 = r0 % r7;
        r18 = r0;
        r0 = r0 + r6;
        r18 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0065 }
    L_0x02e4:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.parent;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r14 = r12[r18];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r17;
        r4 = r25;
        r5 = r14;
        r24 = r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r1 = r17;
        if (r0 >= r1) goto L_0x02d1;
    L_0x0307:
        goto L_0x0014;
    L_0x030a:
        r18 = r17 + -1;
        r8 = r17 + -1;
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r20 = r0;
        r8 = r8 - r0;
        r8 = r8 % r7;
        r0 = r18;
        r0 = r0 - r8;
        r18 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0065 }
    L_0x031f:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.offset;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        r18 = r18 + -1;
        r14 = r12[r18];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r14;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        if (r0 < r6) goto L_0x030a;
    L_0x0341:
        goto L_0x0014;
    L_0x0344:
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r20 = r0;
        r0 = r0 - r6;
        r20 = r0;
        r0 = r0 / r7;
        r20 = r0;
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r21 = r0;
        r0 = r20;
        r1 = r21;
        if (r0 < r1) goto L_0x03b6;
    L_0x035c:
        r0 = r22;
        r6 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r17 = r0;
        r0 = r0 * r7;
        r17 = r0;
        r6 = r6 - r0;
        r0 = r22;
        r0.size = r6;	 Catch:{ Throwable -> 0x0065 }
        r9 = 0;
        r0 = r22;
        r0.id = r9;	 Catch:{ Throwable -> 0x0065 }
        goto L_0x0038;
    L_0x0376:
        r9 = 0;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r18;
        r4 = r25;
        r5 = r9;
        r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r24 = r0;
        r1 = r18;
        if (r0 < r1) goto L_0x0014;
    L_0x038f:
        r0 = r18;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0.parse();	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0.iterator();	 Catch:{ Throwable -> 0x0065 }
        goto L_0x0014;
    L_0x03a2:
        r0 = r22;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        r18 = r0;
        if (r18 >= 0) goto L_0x0404;
    L_0x03aa:
        goto L_0x031f;
    L_0x03ad:
        r0 = r22;
        r8 = r0.name;	 Catch:{ Throwable -> 0x0065 }
        if (r8 >= 0) goto L_0x0403;
    L_0x03b3:
        goto L_0x01de;
    L_0x03b6:
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r24 = r0;
        r21 = r7 * r20;
        r0 = r24;
        r1 = r21;
        r0 = r0 - r1;
        r24 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0065 }
        r24 = r0;
        r1 = r20;
        r0 = r0 - r1;
        r24 = r0;
        r1 = r22;
        r1.id = r0;	 Catch:{ Throwable -> 0x0065 }
        r24 = r8;
    L_0x03da:
        r12 = r13.data;	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r8 = r0.parent;	 Catch:{ Throwable -> 0x0065 }
        r14 = r12[r8];	 Catch:{ Throwable -> 0x0065 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r17;
        r4 = r25;
        r5 = r14;
        r8 = r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0065 }
        r24 = r8;
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0065 }
        r20 = r0;
        r1 = r17;
        if (r0 >= r1) goto L_0x0344;
    L_0x03fd:
        goto L_0x0014;
    L_0x0400:
        goto L_0x012e;
    L_0x0403:
        goto L_0x03da;
    L_0x0404:
        goto L_0x02e4;
    L_0x0407:
        goto L_0x0287;
    L_0x040a:
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.run(int[], int, int):void");
    }

    public boolean sendMessage() {
        return this.data != 0;
    }

    void set() {
        this.value = this.state;
        this.next = Address.add(this.state, this.f6y);
        this.count = Address.set(this.state, this.f6y);
    }

    public synchronized void set(int $i0) {
        if ($i0 == 0) {
            getPath(0);
            iterator();
        } else if (this.next == 0 && this.count == 0) {
            this.data = 0;
            this.state = 0;
            this.value = 0;
            iterator();
        } else {
            int $i1 = -this.value;
            if (this.value > $i1) {
                $i1 = this.value;
            }
            if ((-this.next) > $i1) {
                $i1 = -this.next;
            }
            if (this.next > $i1) {
                $i1 = this.next;
            }
            if ((-this.count) > $i1) {
                $i1 = -this.count;
            }
            if (this.count > $i1) {
                $i1 = this.count;
            }
            if ($i0 > $i1) {
                $i0 = $i1;
            }
            this.data = $i0;
            this.state = Integer.MIN_VALUE;
            this.key = (-this.value) / $i0;
            this.length = (-this.next) / $i0;
            this.type = (-this.count) / $i0;
        }
    }

    public synchronized void set(int $i2, int $i0, int $i1) {
        if ($i2 == 0) {
            close($i0, $i1);
        } else {
            int $i5 = Address.add($i0, $i1);
            int $i6 = Address.set($i0, $i1);
            if (this.next == $i5 && this.count == $i6) {
                this.data = 0;
            } else {
                int $i3 = $i0 - this.value;
                if (this.value - $i0 > $i3) {
                    $i3 = this.value - $i0;
                }
                if ($i5 - this.next > $i3) {
                    $i3 = $i5 - this.next;
                }
                if (this.next - $i5 > $i3) {
                    $i3 = this.next - $i5;
                }
                if ($i6 - this.count > $i3) {
                    $i3 = $i6 - this.count;
                }
                if (this.count - $i6 > $i3) {
                    $i3 = this.count - $i6;
                }
                if ($i2 > $i3) {
                    $i2 = $i3;
                }
                this.data = $i2;
                this.state = $i0;
                this.f6y = $i1;
                this.key = ($i0 - this.value) / $i2;
                this.length = ($i5 - this.next) / $i2;
                this.type = ($i6 - this.count) / $i2;
            }
        }
    }

    synchronized void setRegion(int i, int i2) {
        this.state = i;
        this.f6y = i2;
        this.data = 0;
        set();
    }

    public boolean setRegion() {
        return this.data != 0;
    }

    public synchronized void setState(int $i0) {
        if (this.name < 0) {
            this.name = -$i0;
        } else {
            this.name = $i0;
        }
    }

    synchronized void setState(int i, int i2) {
        this.state = i;
        this.f6y = i2;
        this.data = 0;
        set();
    }

    protected Entry size() {
        return null;
    }

    protected Entry toArray() {
        return null;
    }

    public synchronized void toArray(int i) {
        close(i << 6, length());
    }

    public synchronized void toArray(int i, int i2) {
        set(i, i2, length());
    }

    int toString(int[] iArr, int $i0, int i, int i2, int $i3) {
        while (this.data > 0) {
            int $i4 = $i0 + this.data;
            if ($i4 > i2) {
                $i4 = i2;
            }
            int $i5 = this.data;
            $i5 += $i0;
            int i3 = $i5;
            this.data = $i5;
            if (this.name == -256) {
                $i5 = this.size;
                if (($i5 & 255) == 0) {
                    if (Puzzle.data) {
                        $i0 = Address.get(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this);
                    } else {
                        $i0 = Address.toString(((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this);
                    }
                    $i5 = this.data;
                    $i5 -= $i0;
                    $i4 = $i5;
                    this.data = $i5;
                    if (this.data != 0) {
                        return $i0;
                    }
                    if (next()) {
                        return i2;
                    }
                }
            }
            if (Puzzle.data) {
                $i0 = Address.get(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this, this.name, $i3);
            } else {
                $i0 = Address.get(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this, this.name, $i3);
            }
            $i5 = this.data;
            $i5 -= $i0;
            $i4 = $i5;
            this.data = $i5;
            if (this.data != 0) {
                return $i0;
            }
            if (next()) {
                return i2;
            }
        }
        if (this.name == -256 && (this.size & -621007793) == 0) {
            if (Puzzle.data) {
                return Address.toString(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this);
            }
            return Address.get(((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this);
        } else if (Puzzle.data) {
            return Address.write(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this, this.name, $i3);
        } else {
            return Address.write(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this, this.name, $i3);
        }
    }

    public synchronized void toString(int $i0) {
        if ($i0 == 0) {
            getPath(0);
            iterator();
        } else if (this.next == 0 && this.count == 0) {
            this.data = 0;
            this.state = 0;
            this.value = 0;
            iterator();
        } else {
            int $i1 = -this.value;
            if (this.value > $i1) {
                $i1 = this.value;
            }
            if ((-this.next) > $i1) {
                $i1 = -this.next;
            }
            if (this.next > $i1) {
                $i1 = this.next;
            }
            if ((-this.count) > $i1) {
                $i1 = -this.count;
            }
            if (this.count > $i1) {
                $i1 = this.count;
            }
            if ($i0 > $i1) {
                $i0 = $i1;
            }
            this.data = $i0;
            this.state = Integer.MIN_VALUE;
            this.key = (-this.value) / $i0;
            this.length = (-this.next) / $i0;
            this.type = (-this.count) / $i0;
        }
    }

    public synchronized void toString(boolean z) {
        this.name = (this.name ^ (this.name >> 31)) + (this.name >>> 31);
        if (z) {
            this.name = -this.name;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void toString(int[] r23, int r24, int r25) {
        /*
        r22 = this;
        monitor-enter(r22);
        r0 = r22;
        r6 = r0.state;	 Catch:{ Throwable -> 0x0112 }
        if (r6 != 0) goto L_0x0016;
    L_0x0007:
        r0 = r22;
        r6 = r0.data;	 Catch:{ Throwable -> 0x0112 }
        if (r6 != 0) goto L_0x0016;
    L_0x000d:
        r0 = r22;
        r1 = r25;
        r0.get(r1);	 Catch:{ Throwable -> 0x0112 }
    L_0x0014:
        monitor-exit(r22);
        return;
    L_0x0016:
        r0 = r22;
        r7 = r0.value;	 Catch:{ Throwable -> 0x0112 }
        r9 = r7;
        r9 = (p000.User) r9;	 Catch:{ Throwable -> 0x0112 }
        r8 = r9;
        r0 = r22;
        r6 = r0.parent;	 Catch:{ Throwable -> 0x0112 }
        r6 = r6 << 8;
        r0 = r22;
        r10 = r0.offset;	 Catch:{ Throwable -> 0x0112 }
        r10 = r10 << 8;
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r12 = r11.length;	 Catch:{ Throwable -> 0x0112 }
        r12 = r12 << 8;
        r13 = r10 - r6;
        if (r13 > 0) goto L_0x0038;
    L_0x0033:
        r14 = 0;
        r0 = r22;
        r0.id = r14;	 Catch:{ Throwable -> 0x0112 }
    L_0x0038:
        r0 = r25;
        r1 = r24;
        r0 = r0 + r1;
        r25 = r0;
        r0 = r22;
        r15 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r15 >= 0) goto L_0x0050;
    L_0x0045:
        r0 = r22;
        r15 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        if (r15 <= 0) goto L_0x020c;
    L_0x004b:
        r14 = 0;
        r0 = r22;
        r0.size = r14;	 Catch:{ Throwable -> 0x0112 }
    L_0x0050:
        r0 = r22;
        r15 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r15 < r12) goto L_0x0062;
    L_0x0056:
        r0 = r22;
        r15 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        if (r15 >= 0) goto L_0x0219;
    L_0x005c:
        r15 = r12 + -1;
        r0 = r22;
        r0.size = r15;	 Catch:{ Throwable -> 0x0112 }
    L_0x0062:
        r0 = r22;
        r15 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        if (r15 >= 0) goto L_0x034b;
    L_0x0068:
        r0 = r22;
        r0 = r0.text;	 Catch:{ Throwable -> 0x0112 }
        r16 = r0;
        if (r16 == 0) goto L_0x037f;
    L_0x0070:
        r0 = r22;
        r12 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        if (r12 >= 0) goto L_0x03b8;
    L_0x0076:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.parent;	 Catch:{ Throwable -> 0x0112 }
        r17 = r11[r12];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r17;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r12 >= r6) goto L_0x0014;
    L_0x0093:
        r12 = r6 + r6;
        r12 = r12 + -1;
        r0 = r22;
        r13 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r12 = r12 - r13;
        r0 = r22;
        r0.size = r12;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        r12 = -r12;
        r0 = r22;
        r0.name = r12;	 Catch:{ Throwable -> 0x0112 }
    L_0x00a9:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.offset;	 Catch:{ Throwable -> 0x0112 }
        r12 = r12 + -1;
        r17 = r11[r12];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r10;
        r4 = r25;
        r5 = r17;
        r24 = r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r12 < r10) goto L_0x0014;
    L_0x00c8:
        r12 = r10 + r10;
        r12 = r12 + -1;
        r0 = r22;
        r13 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r12 = r12 - r13;
        r0 = r22;
        r0.size = r12;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        r12 = -r12;
        r0 = r22;
        r0.name = r12;	 Catch:{ Throwable -> 0x0112 }
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.parent;	 Catch:{ Throwable -> 0x0112 }
        r17 = r11[r12];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r17;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r12 >= r6) goto L_0x0014;
    L_0x00fb:
        r12 = r6 + r6;
        r12 = r12 + -1;
        r0 = r22;
        r13 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r12 = r12 - r13;
        r0 = r22;
        r0.size = r12;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        r12 = -r12;
        r0 = r22;
        r0.name = r12;	 Catch:{ Throwable -> 0x0112 }
        goto L_0x00a9;
    L_0x0112:
        r18 = move-exception;
        monitor-exit(r22);
        throw r18;
    L_0x0115:
        r13 = r10 + r10;
        r13 = r13 + -1;
        r0 = r22;
        r15 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r13 = r13 - r15;
        r0 = r22;
        r0.size = r13;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        r13 = -r13;
        r0 = r22;
        r0.name = r13;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r13 = r13 + -1;
        r0 = r22;
        r0.id = r13;	 Catch:{ Throwable -> 0x0112 }
        if (r13 != 0) goto L_0x0226;
    L_0x0137:
        r0 = r22;
        r6 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        if (r6 >= 0) goto L_0x0388;
    L_0x013d:
        r14 = 0;
        r19 = 0;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r14;
        r4 = r25;
        r5 = r19;
        r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r24 = r0;
        if (r24 >= 0) goto L_0x0014;
    L_0x0156:
        r14 = -1;
        r0 = r22;
        r0.size = r14;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0.parse();	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0.iterator();	 Catch:{ Throwable -> 0x0112 }
        goto L_0x0014;
    L_0x0168:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.offset;	 Catch:{ Throwable -> 0x0112 }
        r13 = r13 + -1;
        r17 = r11[r13];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r10;
        r4 = r25;
        r5 = r17;
        r24 = r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r13 >= r10) goto L_0x0115;
    L_0x0187:
        goto L_0x0014;
    L_0x018a:
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r24 = r0;
        r20 = r13 * r21;
        r0 = r24;
        r1 = r20;
        r0 = r0 + r1;
        r24 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r24 = r0;
        r1 = r21;
        r0 = r0 - r1;
        r24 = r0;
        r1 = r22;
        r1.id = r0;	 Catch:{ Throwable -> 0x0112 }
        r24 = r15;
    L_0x01ae:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r15 = r0.offset;	 Catch:{ Throwable -> 0x0112 }
        r15 = r15 + -1;
        r17 = r11[r15];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r17;
        r15 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r24 = r15;
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r21 = r0;
        if (r0 >= r6) goto L_0x0014;
    L_0x01d1:
        r21 = r10 + -1;
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r20 = r0;
        r0 = r21;
        r1 = r20;
        r0 = r0 - r1;
        r21 = r0;
        r0 = r0 / r13;
        r21 = r0;
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r20 = r0;
        r0 = r21;
        r1 = r20;
        if (r0 < r1) goto L_0x018a;
    L_0x01ef:
        r0 = r22;
        r6 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r10 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r10 = r10 * r13;
        r6 = r6 + r10;
        r0 = r22;
        r0.size = r6;	 Catch:{ Throwable -> 0x0112 }
        r14 = 0;
        r0 = r22;
        r0.id = r14;	 Catch:{ Throwable -> 0x0112 }
        goto L_0x0137;
    L_0x0205:
        r0 = r22;
        r15 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        if (r15 >= 0) goto L_0x03b2;
    L_0x020b:
        goto L_0x01ae;
    L_0x020c:
        r0 = r22;
        r0.parse();	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0.iterator();	 Catch:{ Throwable -> 0x0112 }
        goto L_0x0014;
    L_0x0219:
        r0 = r22;
        r0.parse();	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0.iterator();	 Catch:{ Throwable -> 0x0112 }
        goto L_0x0014;
    L_0x0226:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.parent;	 Catch:{ Throwable -> 0x0112 }
        r17 = r11[r13];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r17;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r13 >= r6) goto L_0x0014;
    L_0x0243:
        r13 = r6 + r6;
        r13 = r13 + -1;
        r0 = r22;
        r15 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r13 = r13 - r15;
        r0 = r22;
        r0.size = r13;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        r13 = -r13;
        r0 = r22;
        r0.name = r13;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r13 = r13 + -1;
        r0 = r22;
        r0.id = r13;	 Catch:{ Throwable -> 0x0112 }
        if (r13 != 0) goto L_0x0168;
    L_0x0265:
        goto L_0x0137;
    L_0x0268:
        r12 = r10 + -1;
        r15 = r10 + -1;
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r21 = r0;
        r15 = r15 - r0;
        r15 = r15 % r13;
        r12 = r12 - r15;
        r0 = r22;
        r0.size = r12;	 Catch:{ Throwable -> 0x0112 }
    L_0x0279:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.offset;	 Catch:{ Throwable -> 0x0112 }
        r12 = r12 + -1;
        r17 = r11[r12];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r17;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r12 < r6) goto L_0x0268;
    L_0x0298:
        goto L_0x0014;
    L_0x029b:
        r0 = r22;
        r12 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r12 = r12 - r6;
        r12 = r12 % r13;
        r12 = r12 + r6;
        r0 = r22;
        r0.size = r12;	 Catch:{ Throwable -> 0x0112 }
    L_0x02a6:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.parent;	 Catch:{ Throwable -> 0x0112 }
        r17 = r11[r12];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r10;
        r4 = r25;
        r5 = r17;
        r24 = r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r12 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r12 >= r10) goto L_0x029b;
    L_0x02c3:
        goto L_0x0014;
    L_0x02c6:
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r21 = r0;
        r20 = r13 * r15;
        r0 = r21;
        r1 = r20;
        r0 = r0 - r1;
        r21 = r0;
        r1 = r22;
        r1.size = r0;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r21 = r0;
        r15 = r21 - r15;
        r0 = r22;
        r0.id = r15;	 Catch:{ Throwable -> 0x0112 }
    L_0x02e5:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r15 = r0.parent;	 Catch:{ Throwable -> 0x0112 }
        r17 = r11[r15];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r10;
        r4 = r25;
        r5 = r17;
        r24 = r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r15 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r15 < r10) goto L_0x0014;
    L_0x0302:
        r0 = r22;
        r15 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r15 = r15 - r6;
        r15 = r15 / r13;
        r0 = r22;
        r0 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r21 = r0;
        if (r15 < r0) goto L_0x02c6;
    L_0x0310:
        r0 = r22;
        r6 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r10 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r10 = r10 * r13;
        r6 = r6 - r10;
        r0 = r22;
        r0.size = r6;	 Catch:{ Throwable -> 0x0112 }
        r14 = 0;
        r0 = r22;
        r0.id = r14;	 Catch:{ Throwable -> 0x0112 }
        goto L_0x0137;
    L_0x0326:
        r13 = r6 + r6;
        r13 = r13 + -1;
        r0 = r22;
        r15 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r13 = r13 - r15;
        r0 = r22;
        r0.size = r13;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        r13 = -r13;
        r0 = r22;
        r0.name = r13;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        r13 = r13 + -1;
        r0 = r22;
        r0.id = r13;	 Catch:{ Throwable -> 0x0112 }
        if (r13 != 0) goto L_0x0168;
    L_0x0348:
        goto L_0x0137;
    L_0x034b:
        r0 = r22;
        r15 = r0.id;	 Catch:{ Throwable -> 0x0112 }
        if (r15 <= 0) goto L_0x03b5;
    L_0x0351:
        r0 = r22;
        r0 = r0.text;	 Catch:{ Throwable -> 0x0112 }
        r16 = r0;
        if (r16 == 0) goto L_0x0205;
    L_0x0359:
        r0 = r22;
        r13 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        if (r13 >= 0) goto L_0x0168;
    L_0x035f:
        r11 = r8.data;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.parent;	 Catch:{ Throwable -> 0x0112 }
        r17 = r11[r13];	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r6;
        r4 = r25;
        r5 = r17;
        r24 = r0.write(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r13 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        if (r13 < r6) goto L_0x0326;
    L_0x037c:
        goto L_0x0014;
    L_0x037f:
        r0 = r22;
        r12 = r0.name;	 Catch:{ Throwable -> 0x0112 }
        if (r12 >= 0) goto L_0x03af;
    L_0x0385:
        goto L_0x0279;
    L_0x0388:
        r14 = 0;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r12;
        r4 = r25;
        r5 = r14;
        r0.read(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0 = r0.size;	 Catch:{ Throwable -> 0x0112 }
        r24 = r0;
        if (r0 < r12) goto L_0x0014;
    L_0x039e:
        r0 = r22;
        r0.size = r12;	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0.parse();	 Catch:{ Throwable -> 0x0112 }
        r0 = r22;
        r0.iterator();	 Catch:{ Throwable -> 0x0112 }
        goto L_0x0014;
    L_0x03af:
        goto L_0x02a6;
    L_0x03b2:
        goto L_0x02e5;
    L_0x03b5:
        goto L_0x0137;
    L_0x03b8:
        goto L_0x00a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: Address.toString(int[], int, int):void");
    }

    public synchronized void transform(int $i0) {
        if (this.name < 0) {
            this.name = -$i0;
        } else {
            this.name = $i0;
        }
    }

    int update() {
        int $i0 = (this.value * 3) >> 6;
        $i0 = (($i0 >> 31) ^ $i0) + ($i0 >>> 31);
        if (this.id == 0) {
            $i0 -= ($i0 * this.size) / (((User) this.value).data.length << 8);
        } else if (this.id >= 0) {
            $i0 -= ($i0 * this.parent) / ((User) this.value).data.length;
        }
        return $i0 > 255 ? 255 : $i0;
    }

    int write() {
        int $i0 = (this.value * 3) >> 6;
        $i0 = (($i0 >> 31) ^ $i0) + ($i0 >>> 31);
        if (this.id == 0) {
            $i0 -= ($i0 * this.size) / (((User) this.value).data.length << 8);
        } else if (this.id >= 0) {
            $i0 -= ($i0 * this.parent) / ((User) this.value).data.length;
        }
        return $i0 > 255 ? 255 : $i0;
    }

    int write(int[] iArr, int $i0, int i, int i2, int $i3) {
        while (this.data > 0) {
            int $i4 = $i0 + this.data;
            if ($i4 > i2) {
                $i4 = i2;
            }
            int $i5 = this.data;
            $i5 += $i0;
            int i3 = $i5;
            this.data = $i5;
            if (this.name == -256) {
                $i5 = this.size;
                if (($i5 & 255) == 0) {
                    if (Puzzle.data) {
                        $i0 = Address.get(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this);
                    } else {
                        $i0 = Address.toString(((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this);
                    }
                    $i5 = this.data;
                    $i5 -= $i0;
                    $i4 = $i5;
                    this.data = $i5;
                    if (this.data != 0) {
                        return $i0;
                    }
                    if (next()) {
                        return i2;
                    }
                }
            }
            if (Puzzle.data) {
                $i0 = Address.get(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, this.length, this.type, 0, $i4, i, this, this.name, $i3);
            } else {
                $i0 = Address.get(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, this.key, 0, $i4, i, this, this.name, $i3);
            }
            $i5 = this.data;
            $i5 -= $i0;
            $i4 = $i5;
            this.data = $i5;
            if (this.data != 0) {
                return $i0;
            }
            if (next()) {
                return i2;
            }
        }
        if (this.name == -256) {
            $i5 = this.size;
            if (($i5 & 255) == 0) {
                if (Puzzle.data) {
                    return Address.toString(0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this);
                }
                return Address.get(((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this);
            }
        }
        if (Puzzle.data) {
            return Address.write(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.next, this.count, 0, i2, i, this, this.name, $i3);
        }
        return Address.write(0, 0, ((User) this.value).data, iArr, this.size, $i0, this.value, 0, i2, i, this, this.name, $i3);
    }

    public synchronized void write(int i) {
        int $i1 = -1;
        synchronized (this) {
            int $i2 = ((User) this.value).data.length << 8;
            if (i >= -1) {
                $i1 = i;
            }
            if ($i1 <= $i2) {
                $i2 = $i1;
            }
            this.size = $i2;
        }
    }
}
