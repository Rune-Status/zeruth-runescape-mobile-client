package p000;

/* compiled from: im */
public final class TFloatLinkedList {
    static final int ACTION_FALSE = 0;
    static final int ALIGNMENT = 16;
    static final int MP3_MAX_INPUT_SIZE = 4096;
    static final int PTABLE = 23;
    static final int TextView_drawableTop = 50;
    static final int WEEKS_BUFFER = 1;
    static AbstractInsnNode next = new AbstractInsnNode();
    static final int size = 6;

    TFloatLinkedList() throws Throwable {
        throw new Error();
    }

    static int add(int i, AbstractInsnNode abstractInsnNode) {
        while (abstractInsnNode.buffer * 516494385 < i) {
            abstractInsnNode.key = (((abstractInsnNode.key * 1307633119) << 8) | (abstractInsnNode.elements[abstractInsnNode.start * 34263007] & (short) 255)) * 1213011487;
            abstractInsnNode.buffer -= 376559992;
            abstractInsnNode.start -= 673600481;
            abstractInsnNode.position -= 391034999;
            if (abstractInsnNode.position * -605593927 == 0) {
            }
        }
        int $i1 = ((abstractInsnNode.key * 1307633119) >> ((abstractInsnNode.buffer * 516494385) - i)) & ((1 << i) - 1);
        abstractInsnNode.buffer -= -1657682735 * i;
        return $i1;
    }

    public static int add(byte[] bArr, int $i0, byte[] bArr2, int i, int i2) {
        synchronized (next) {
            next.elements = bArr2;
            next.start = -673600481 * i2;
            next.first = bArr;
            next.last = 0;
            next.prev = 1395821013 * $i0;
            next.buffer = 0;
            next.key = 0;
            next.position = 0;
            next.element = 0;
            TFloatLinkedList.toString(next);
            $i0 -= next.prev * -1603901571;
            next.elements = null;
            next.first = null;
        }
        return $i0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void add(p000.AbstractInsnNode r17) {
        /*
        r0 = r17;
        r1 = r0.len;
        r17 = r0;
        r2 = r0.value;
        r4 = 186635259; // 0xb1fd3fb float:3.0781762E-32 double:9.221007E-316;
        r3 = r2 * r4;
        r0 = r17;
        r2 = r0.count;
        r4 = -1770320531; // 0xffffffff967b0d6d float:-2.0279855E-25 double:NaN;
        r5 = r2 * r4;
        r0 = r17;
        r2 = r0.pos;
        r4 = -280960315; // 0xffffffffef40e2c5 float:-5.969527E28 double:NaN;
        r6 = r2 * r4;
        r7 = p000.History.value;
        r0 = r17;
        r2 = r0.index;
        r4 = -1574273729; // 0xffffffffa22a7d3f float:-2.31056E-18 double:NaN;
        r8 = r2 * r4;
        r0 = r17;
        r9 = r0.first;
        r0 = r17;
        r2 = r0.last;
        r4 = 1997070121; // 0x7708df29 float:2.7760883E33 double:9.86683739E-315;
        r2 = r4 * r2;
        r0 = r17;
        r10 = r0.prev;
        r4 = -1603901571; // 0xffffffffa066677d float:-1.9515999E-19 double:NaN;
        r11 = r10 * r4;
        r0 = r17;
        r10 = r0.head;
        r4 = 1835797505; // 0x6d6c0c01 float:4.565811E27 double:9.0700448E-315;
        r10 = r10 * r4;
        r12 = r10 + 1;
        r10 = r11;
    L_0x004b:
        if (r3 <= 0) goto L_0x0107;
    L_0x004d:
        if (r10 != 0) goto L_0x00f8;
    L_0x004f:
        r0 = r17;
        r12 = r0.element;
        r4 = -641879619; // 0xffffffffd9bdb1bd float:-6.6742745E15 double:NaN;
        r12 = r12 * r4;
        r0 = r17;
        r13 = r0.element;
        r11 = r11 - r10;
        r4 = 1720848789; // 0x66921195 float:3.4489492E23 double:8.502122683E-315;
        r11 = r11 * r4;
        r11 = r11 + r13;
        r0 = r17;
        r0.element = r11;
        r0 = r17;
        r11 = r0.element;
        r4 = -641879619; // 0xffffffffd9bdb1bd float:-6.6742745E15 double:NaN;
        r11 = r11 * r4;
        if (r11 >= r12) goto L_0x006f;
    L_0x006f:
        r0 = r17;
        r0.len = r1;
        r4 = -2078654669; // 0xffffffff841a3f33 float:-1.8131633E-36 double:NaN;
        r11 = r3 * r4;
        r0 = r17;
        r0.value = r11;
        r4 = 2037777509; // 0x79760465 float:7.9837135E34 double:1.006795861E-314;
        r11 = r5 * r4;
        r0 = r17;
        r0.count = r11;
        r4 = -1158001651; // 0xffffffffbafa4c0d float:-0.0019096151 double:NaN;
        r6 = r6 * r4;
        r0 = r17;
        r0.pos = r6;
        p000.History.value = r7;
        r4 = 1935274687; // 0x7359f2bf float:1.7267638E31 double:9.56152738E-315;
        r6 = r8 * r4;
        r0 = r17;
        r0.index = r6;
        r0 = r17;
        r0.first = r9;
        r4 = 782773529; // 0x2ea82d19 float:7.6477664E-11 double:3.86741509E-315;
        r2 = r2 * r4;
        r0 = r17;
        r0.last = r2;
        r4 = 1395821013; // 0x533289d5 float:7.6681662E11 double:6.896272103E-315;
        r2 = r10 * r4;
        r0 = r17;
        r0.prev = r2;
        return;
    L_0x00ae:
        if (r5 != r12) goto L_0x0144;
    L_0x00b0:
        if (r10 != 0) goto L_0x0111;
    L_0x00b2:
        r3 = 1;
        goto L_0x004f;
    L_0x00b4:
        r1 = (byte) r6;
        r8 = r7[r8];
        r3 = r8 & 255;
        r14 = (byte) r3;
        r8 = r8 >> 8;
        r5 = r5 + 1;
        if (r14 == r6) goto L_0x00ae;
    L_0x00c0:
        if (r10 != 0) goto L_0x00c5;
    L_0x00c2:
        r3 = 1;
        r6 = r14;
        goto L_0x004f;
    L_0x00c5:
        r9[r2] = r1;
        r10 = r10 + -1;
        r2 = r2 + 1;
        r6 = r14;
        r15 = 1;
    L_0x00cd:
        if (r15 == 0) goto L_0x0119;
    L_0x00cf:
        if (r5 != r12) goto L_0x00b4;
    L_0x00d1:
        r3 = 0;
        goto L_0x004f;
    L_0x00d5:
        if (r14 == r6) goto L_0x00dd;
    L_0x00d7:
        r6 = r14;
        r5 = r3;
        r3 = 2;
        goto L_0x004b;
    L_0x00dd:
        r8 = r7[r8];
        r5 = r8 & 255;
        r14 = (byte) r5;
        r8 = r8 >> 8;
        r3 = r3 + 1;
        if (r3 != r12) goto L_0x0109;
    L_0x00e8:
        r5 = r3;
        r3 = 3;
        goto L_0x004b;
    L_0x00ed:
        r9[r2] = r1;
        r3 = r3 + -1;
        r2 = r2 + 1;
        r10 = r10 + -1;
        goto L_0x004d;
    L_0x00f8:
        r4 = 1;
        if (r3 != r4) goto L_0x00ed;
    L_0x00fb:
        if (r10 != 0) goto L_0x0101;
    L_0x00fd:
        r3 = 1;
        goto L_0x004f;
    L_0x0101:
        r9[r2] = r1;
        r2 = r2 + 1;
        r10 = r10 + -1;
    L_0x0107:
        r15 = 1;
        goto L_0x00cd;
    L_0x0109:
        if (r14 == r6) goto L_0x0129;
    L_0x010b:
        r6 = r14;
        r5 = r3;
        r3 = 3;
        goto L_0x004b;
    L_0x0111:
        r9[r2] = r1;
        r10 = r10 + -1;
        r2 = r2 + 1;
        r15 = 1;
        goto L_0x00cd;
    L_0x0119:
        r8 = r7[r8];
        r3 = r8 & 255;
        r14 = (byte) r3;
        r8 = r8 >> 8;
        r3 = r5 + 1;
        if (r3 != r12) goto L_0x00d5;
    L_0x0124:
        r5 = r3;
        r3 = 2;
        goto L_0x004b;
    L_0x0129:
        r6 = r7[r8];
        r8 = r6 & 255;
        r14 = (byte) r8;
        r6 = r6 >> 8;
        r5 = r3 + 1;
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r16 = r14 & r4;
        r3 = r16 + 4;
        r8 = r7[r6];
        r6 = r8 & 255;
        r6 = (byte) r6;
        r8 = r8 >> 8;
        r5 = r5 + 1;
        goto L_0x004b;
    L_0x0144:
        r15 = 0;
        goto L_0x00cd;
        */
        throw new UnsupportedOperationException("Method not decompiled: TFloatLinkedList.add(AbstractInsnNode):void");
    }

    static void add(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, int $i0, int i, int i2) {
        int $i5 = 0;
        for (byte $i4 = $i0; $i4 <= i; $i4++) {
            for (int $i6 = 0; $i6 < i2; $i6++) {
                if (bArr[$i6] == $i4) {
                    iArr3[$i5] = $i6;
                    $i5++;
                }
            }
        }
        for ($i5 = 0; $i5 < 23; $i5++) {
            iArr2[$i5] = 0;
        }
        for ($i5 = 0; $i5 < i2; $i5++) {
            int $i42 = bArr[$i5] + 1;
            iArr2[$i42] = iArr2[$i42] + 1;
        }
        for (i2 = 1; i2 < 23; i2++) {
            iArr2[i2] = iArr2[i2] + iArr2[i2 - 1];
        }
        for (i2 = 0; i2 < 23; i2++) {
            iArr[i2] = 0;
        }
        $i5 = 0;
        for (i2 = $i0; i2 <= i; i2++) {
            $i5 += iArr2[i2 + 1] - iArr2[i2];
            iArr[i2] = $i5 - 1;
            $i5 <<= 1;
        }
        for ($i0++; $i0 <= i; $i0++) {
            iArr2[$i0] = ((iArr[$i0 - 1] + 1) << 1) - iArr2[$i0];
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void append(p000.AbstractInsnNode r15) {
        /*
        r0 = r15.len;
        r1 = r15.value;
        r3 = 186635259; // 0xb1fd3fb float:3.0781762E-32 double:9.221007E-316;
        r2 = r1 * r3;
        r1 = r15.count;
        r3 = -270640204; // 0xffffffffefde5bb4 float:-1.3763307E29 double:NaN;
        r4 = r1 * r3;
        r1 = r15.pos;
        r3 = -280960315; // 0xffffffffef40e2c5 float:-5.969527E28 double:NaN;
        r5 = r1 * r3;
        r6 = p000.History.value;
        r1 = r15.index;
        r3 = -1574273729; // 0xffffffffa22a7d3f float:-2.31056E-18 double:NaN;
        r7 = r1 * r3;
        r8 = r15.first;
        r1 = r15.last;
        r3 = 1997070121; // 0x7708df29 float:2.7760883E33 double:9.86683739E-315;
        r1 = r3 * r1;
        r9 = r15.prev;
        r3 = 757930631; // 0x2d2d1a87 float:9.839802E-12 double:3.744674867E-315;
        r10 = r9 * r3;
        r9 = r15.head;
        r3 = 1835797505; // 0x6d6c0c01 float:4.565811E27 double:9.0700448E-315;
        r9 = r9 * r3;
        r11 = r9 + 1;
        r9 = r10;
    L_0x0039:
        if (r2 <= 0) goto L_0x00d4;
    L_0x003b:
        if (r9 != 0) goto L_0x00ba;
    L_0x003d:
        r11 = r15.element;
        r3 = -641879619; // 0xffffffffd9bdb1bd float:-6.6742745E15 double:NaN;
        r11 = r11 * r3;
        r12 = r15.element;
        r10 = r10 - r9;
        r3 = 1975850473; // 0x75c515e9 float:4.9967132E32 double:9.7619984E-315;
        r10 = r10 * r3;
        r10 = r10 + r12;
        r15.element = r10;
        r10 = r15.element;
        r3 = -641879619; // 0xffffffffd9bdb1bd float:-6.6742745E15 double:NaN;
        r10 = r10 * r3;
        if (r10 >= r11) goto L_0x0055;
    L_0x0055:
        r15.len = r0;
        r3 = -677199819; // 0xffffffffd7a2c035 float:-3.57892813E14 double:NaN;
        r10 = r2 * r3;
        r15.value = r10;
        r3 = 2037777509; // 0x79760465 float:7.9837135E34 double:1.006795861E-314;
        r10 = r4 * r3;
        r15.count = r10;
        r3 = -1158001651; // 0xffffffffbafa4c0d float:-0.0019096151 double:NaN;
        r5 = r5 * r3;
        r15.pos = r5;
        p000.History.value = r6;
        r3 = 102418152; // 0x61ac6e8 float:2.9110314E-35 double:5.06012904E-316;
        r5 = r7 * r3;
        r15.index = r5;
        r15.first = r8;
        r3 = 782773529; // 0x2ea82d19 float:7.6477664E-11 double:3.86741509E-315;
        r1 = r1 * r3;
        r15.last = r1;
        r3 = 1395821013; // 0x533289d5 float:7.6681662E11 double:6.896272103E-315;
        r1 = r9 * r3;
        r15.prev = r1;
        return;
    L_0x0084:
        r8[r1] = r0;
        r9 = r9 + -1;
        r1 = r1 + 1;
        r13 = 1;
    L_0x008b:
        if (r13 == 0) goto L_0x00fc;
    L_0x008d:
        if (r4 != r11) goto L_0x00d6;
    L_0x008f:
        r2 = 0;
        goto L_0x003d;
    L_0x0091:
        r5 = r6[r7];
        r3 = -835023618; // 0xffffffffce3a8cfe float:-7.8245056E8 double:NaN;
        r7 = r3 & r5;
        r14 = (byte) r7;
        r5 = r5 >> 8;
        r4 = r2 + 1;
        r3 = 1784711582; // 0x6a60899e float:6.7862316E25 double:8.817646804E-315;
        r7 = r14 & r3;
        r2 = r7 + 4;
        r7 = r6[r5];
        r3 = -1135828768; // 0xffffffffbc4ca0e0 float:-0.012489527 double:NaN;
        r5 = r3 & r7;
        r5 = (byte) r5;
        r7 = r7 >> 8;
        r4 = r4 + 1;
        goto L_0x0039;
    L_0x00b1:
        r8[r1] = r0;
        r9 = r9 + -1;
        r1 = r1 + 1;
        r5 = r14;
        r13 = 1;
        goto L_0x008b;
    L_0x00ba:
        r3 = 1;
        if (r2 != r3) goto L_0x00c3;
    L_0x00bd:
        if (r9 != 0) goto L_0x00ce;
    L_0x00bf:
        r2 = 1;
        goto L_0x003d;
    L_0x00c3:
        r8[r1] = r0;
        r2 = r2 + -1;
        r1 = r1 + 1;
        r9 = r9 + -1;
        goto L_0x003b;
    L_0x00ce:
        r8[r1] = r0;
        r1 = r1 + 1;
        r9 = r9 + -1;
    L_0x00d4:
        r13 = 1;
        goto L_0x008b;
    L_0x00d6:
        r0 = (byte) r5;
        r7 = r6[r7];
        r2 = r7 & 255;
        r14 = (byte) r2;
        r7 = r7 >> 8;
        r4 = r4 + 1;
        if (r14 == r5) goto L_0x010f;
    L_0x00e2:
        if (r9 != 0) goto L_0x00b1;
    L_0x00e4:
        r2 = 1;
        r5 = r14;
        goto L_0x003d;
    L_0x00e9:
        r7 = r6[r7];
        r3 = 275829302; // 0x1070d236 float:4.7493595E-29 double:1.36277782E-315;
        r4 = r3 & r7;
        r14 = (byte) r4;
        r7 = r7 >> 8;
        r2 = r2 + 1;
        if (r2 != r11) goto L_0x011f;
    L_0x00f7:
        r4 = r2;
        r2 = 3;
        goto L_0x0039;
    L_0x00fc:
        r7 = r6[r7];
        r3 = 1076349298; // 0x4027c972 float:2.6216702 double:5.31787211E-315;
        r2 = r3 & r7;
        r14 = (byte) r2;
        r7 = r7 >> 8;
        r2 = r4 + 1;
        if (r2 != r11) goto L_0x0117;
    L_0x010a:
        r4 = r2;
        r2 = 2;
        goto L_0x0039;
    L_0x010f:
        if (r4 != r11) goto L_0x0127;
    L_0x0111:
        if (r9 != 0) goto L_0x0084;
    L_0x0113:
        r2 = 1;
        goto L_0x003d;
    L_0x0117:
        if (r14 == r5) goto L_0x00e9;
    L_0x0119:
        r5 = r14;
        r4 = r2;
        r2 = 2;
        goto L_0x0039;
    L_0x011f:
        if (r14 == r5) goto L_0x0091;
    L_0x0121:
        r5 = r14;
        r4 = r2;
        r2 = 3;
        goto L_0x0039;
    L_0x0127:
        r13 = 0;
        goto L_0x008b;
        */
        throw new UnsupportedOperationException("Method not decompiled: TFloatLinkedList.append(AbstractInsnNode):void");
    }

    static byte execute(AbstractInsnNode abstractInsnNode) {
        return (byte) TFloatLinkedList.add(1, abstractInsnNode);
    }

    static byte get(AbstractInsnNode abstractInsnNode) {
        return (byte) TFloatLinkedList.add(1, abstractInsnNode);
    }

    static void hbCreateDecodeTables(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, int $i0, int i, int $i2) {
        int $i5 = 0;
        for (byte $i4 = $i0; $i4 <= i; $i4++) {
            for (int $i6 = 0; $i6 < $i2; $i6++) {
                if (bArr[$i6] == $i4) {
                    iArr3[$i5] = $i6;
                    $i5++;
                }
            }
        }
        for ($i5 = 0; $i5 < 23; $i5++) {
            iArr2[$i5] = 0;
        }
        for ($i5 = 0; $i5 < $i2; $i5++) {
            int $i42 = bArr[$i5] + 1;
            iArr2[$i42] = iArr2[$i42] + 1;
        }
        for ($i2 = 1; $i2 < 23; $i2++) {
            iArr2[$i2] = iArr2[$i2] + iArr2[$i2 - 1];
        }
        for ($i2 = 0; $i2 < 23; $i2++) {
            iArr[$i2] = 0;
        }
        $i5 = 0;
        for ($i2 = $i0; $i2 <= i; $i2++) {
            $i5 += iArr2[$i2 + 1] - iArr2[$i2];
            iArr[$i2] = $i5 - 1;
            $i5 <<= 1;
        }
        for ($i0++; $i0 <= i; $i0++) {
            iArr2[$i0] = ((iArr[$i0 - 1] + 1) << 1) - iArr2[$i0];
        }
    }

    static int indexOf(int i, AbstractInsnNode abstractInsnNode) {
        while (abstractInsnNode.buffer * 516494385 < i) {
            abstractInsnNode.key = (((abstractInsnNode.key * 1307633119) << 8) | (abstractInsnNode.elements[abstractInsnNode.start * 34263007] & (short) 255)) * 1213011487;
            abstractInsnNode.buffer -= 376559992;
            abstractInsnNode.start -= 673600481;
            abstractInsnNode.position -= 391034999;
            if (abstractInsnNode.position * -605593927 == 0) {
            }
        }
        int $i1 = ((abstractInsnNode.key * 1307633119) >> ((abstractInsnNode.buffer * 516494385) - i)) & ((1 << i) - 1);
        abstractInsnNode.buffer -= -1657682735 * i;
        return $i1;
    }

    static void indexOf(AbstractInsnNode abstractInsnNode) {
        abstractInsnNode.size = 0;
        for (int $i0 = 0; $i0 < 256; $i0++) {
            if (abstractInsnNode.next[$i0]) {
                abstractInsnNode.data[abstractInsnNode.size * 31808279] = (byte) $i0;
                abstractInsnNode.size += 496471207;
            }
        }
    }

    static void init(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, int i, int i2, int $i2) {
        int $i4 = 0;
        int $i6 = 0;
        for (byte $i5 = i; $i5 <= i2; $i5++) {
            for (int $i7 = 0; $i7 < $i2; $i7++) {
                if (bArr[$i7] == $i5) {
                    iArr3[$i6] = $i7;
                    $i6++;
                }
            }
        }
        for ($i6 = 0; $i6 < 23; $i6++) {
            iArr2[$i6] = 0;
        }
        for ($i6 = 0; $i6 < $i2; $i6++) {
            int $i52 = bArr[$i6] + 1;
            iArr2[$i52] = iArr2[$i52] + 1;
        }
        for ($i2 = 1; $i2 < 23; $i2++) {
            iArr2[$i2] = iArr2[$i2] + iArr2[$i2 - 1];
        }
        for ($i2 = 0; $i2 < 23; $i2++) {
            iArr[$i2] = 0;
        }
        for ($i2 = i; $i2 <= i2; $i2++) {
            $i4 = (iArr2[$i2 + 1] - iArr2[$i2]) + $i4;
            iArr[$i2] = $i4 - 1;
            $i4 <<= 1;
        }
        for (i++; i <= i2; i++) {
            iArr2[i] = ((iArr[i - 1] + 1) << 1) - iArr2[i];
        }
    }

    static void insert(AbstractInsnNode abstractInsnNode) {
        abstractInsnNode.size = 0;
        for (int $i0 = 0; $i0 < 676727592; $i0++) {
            if (abstractInsnNode.next[$i0]) {
                abstractInsnNode.data[abstractInsnNode.size * 1057663751] = (byte) $i0;
                abstractInsnNode.size -= 257175822;
            }
        }
    }

    static byte max(AbstractInsnNode abstractInsnNode) {
        return (byte) TFloatLinkedList.add(1, abstractInsnNode);
    }

    static byte min(AbstractInsnNode abstractInsnNode) {
        return (byte) TFloatLinkedList.add(1, abstractInsnNode);
    }

    static byte next(AbstractInsnNode abstractInsnNode) {
        return (byte) TFloatLinkedList.add(8, abstractInsnNode);
    }

    static void parse(AbstractInsnNode abstractInsnNode) {
        abstractInsnNode.line = -715662529;
        if (History.value == null) {
            History.value = new int[(abstractInsnNode.line * -288911456)];
        }
        boolean $z0 = true;
        while ($z0 && TFloatLinkedList.next(abstractInsnNode) != (byte) 23) {
            int $i1;
            int $i0;
            int $i6;
            int $i7;
            byte $b2;
            int $i72;
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            if (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                abstractInsnNode.length = 0;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * -2114736370) << 8)) * -1302846508;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & -221994521) | ((abstractInsnNode.length * 1141932919) << 8)) * 1827960179;
            } else {
                abstractInsnNode.length = 0;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * -2114736370) << 8)) * -1302846508;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & -221994521) | ((abstractInsnNode.length * 1141932919) << 8)) * 1827960179;
            }
            for ($i1 = 0; $i1 < 16; $i1++) {
                if (TFloatLinkedList.get(abstractInsnNode) == (byte) 1) {
                    abstractInsnNode.buf[$i1] = true;
                } else {
                    abstractInsnNode.buf[$i1] = false;
                }
            }
            for ($i1 = 0; $i1 < 593237081; $i1++) {
                abstractInsnNode.next[$i1] = false;
            }
            for ($i1 = 0; $i1 < 16; $i1++) {
                if (abstractInsnNode.buf[$i1]) {
                    for ($i0 = 0; $i0 < 16; $i0++) {
                        if (TFloatLinkedList.get(abstractInsnNode) == (byte) 1) {
                            abstractInsnNode.next[($i1 * 16) + $i0] = true;
                        }
                    }
                }
            }
            TFloatLinkedList.set(abstractInsnNode);
            $i1 = (abstractInsnNode.size * -1693624717) + 2;
            byte $i02 = TFloatLinkedList.add(3, abstractInsnNode);
            int $i8 = TFloatLinkedList.add(15, abstractInsnNode);
            for ($i6 = 0; $i6 < $i8; $i6++) {
                $i7 = 0;
                while (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                    $i7++;
                }
                abstractInsnNode.type[$i6] = (byte) $i7;
            }
            byte[] $r2 = new byte[6];
            for ($b2 = (byte) 0; $b2 < $i02; $b2 = (byte) ($b2 + 1)) {
                $r2[$b2] = $b2;
            }
            for ($i6 = 0; $i6 < $i8; $i6++) {
                $b2 = abstractInsnNode.type[$i6];
                byte $b4 = $r2[$b2];
                while ($b2 > (byte) 0) {
                    $r2[$b2] = $r2[$b2 - 1];
                    $b2 = (byte) ($b2 - 1);
                }
                $r2[0] = $b4;
                abstractInsnNode.text[$i6] = $b4;
            }
            for (byte $i82 = (byte) 0; $i82 < $i02; $i82++) {
                $i6 = TFloatLinkedList.add(5, abstractInsnNode);
                for ($i7 = 0; $i7 < $i1; $i7++) {
                    while (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                        $i6 = TFloatLinkedList.get(abstractInsnNode) == (byte) 0 ? $i6 + 1 : $i6 - 1;
                    }
                    abstractInsnNode.name[$i82][$i7] = (byte) $i6;
                }
            }
            for (byte $i62 = (byte) 0; $i62 < $i02; $i62++) {
                $b4 = (byte) 32;
                $b2 = (byte) 0;
                for ($i8 = 0; $i8 < $i1; $i8++) {
                    if (abstractInsnNode.name[$i62][$i8] > $b2) {
                        $b2 = abstractInsnNode.name[$i62][$i8];
                    }
                    if (abstractInsnNode.name[$i62][$i8] < $b4) {
                        $b4 = abstractInsnNode.name[$i62][$i8];
                    }
                }
                TFloatLinkedList.add(abstractInsnNode.fields[$i62], abstractInsnNode.header[$i62], abstractInsnNode.items[$i62], abstractInsnNode.name[$i62], $b4, $b2, $i1);
                abstractInsnNode.log[$i62] = $b4;
            }
            $i0 = (abstractInsnNode.size * 31808279) + 1;
            for ($i1 = 0; $i1 <= 998010161; $i1++) {
                abstractInsnNode.parent[$i1] = 0;
            }
            $i1 = 4095;
            for ($i8 = 15; $i8 >= 0; $i8--) {
                for ($i6 = 15; $i6 >= 0; $i6--) {
                    $i72 = ($i8 * 16) + $i6;
                    $i7 = $i72;
                    abstractInsnNode.offset[$i1] = (byte) $i72;
                    $i1--;
                }
                abstractInsnNode.this$0[$i8] = $i1 + 1;
            }
            $i1 = 0;
            $b2 = abstractInsnNode.text[0];
            $i8 = abstractInsnNode.log[$b2];
            int[] $r1 = abstractInsnNode.fields[$b2];
            int[] $r5 = abstractInsnNode.items[$b2];
            int[] $r6 = abstractInsnNode.header[$b2];
            $i7 = TFloatLinkedList.add($i8, abstractInsnNode);
            $i6 = $i8;
            while ($i7 > $r1[$i6]) {
                $i6++;
                $i7 = ($i7 << 1) | TFloatLinkedList.get(abstractInsnNode);
            }
            int $i9 = $r5[$i7 - $r6[$i6]];
            $i6 = 0;
            $i7 = 49;
            while ($i9 != $i0) {
                int $i3;
                int $i10;
                int[] $r3;
                if ($i9 == 0 || $i9 == 1) {
                    $i3 = 1;
                    $i10 = $i9;
                    $i9 = -1;
                    while (true) {
                        if ($i10 == 0) {
                            $i9 += $i3 * 1;
                        } else if ($i10 == 1) {
                            $i9 += $i3 * 2;
                        }
                        $i3 *= 2;
                        if ($i7 == 0) {
                            $i6++;
                            $i7 = 50;
                            $b2 = abstractInsnNode.text[$i6];
                            $i8 = abstractInsnNode.log[$b2];
                            $r1 = abstractInsnNode.fields[$b2];
                            $r5 = abstractInsnNode.items[$b2];
                            $r6 = abstractInsnNode.header[$b2];
                        }
                        $i7--;
                        $i10 = TFloatLinkedList.add($i8, abstractInsnNode);
                        int $i11 = $i8;
                        while ($i10 > $r1[$i11]) {
                            $i11++;
                            $i10 = ($i10 << 1) | TFloatLinkedList.get(abstractInsnNode);
                        }
                        $i10 = $r5[$i10 - $r6[$i11]];
                        if ($i10 != 0 && $i10 != 1) {
                            break;
                        }
                    }
                    $i3 = $i9 + 1;
                    $b2 = abstractInsnNode.data[abstractInsnNode.offset[abstractInsnNode.this$0[0]] & -1475866053];
                    $r3 = abstractInsnNode.parent;
                    $i9 = -748700642 & $b2;
                    $r3[$i9] = $r3[$i9] + $i3;
                    while ($i3 > 0) {
                        History.value[$i1] = $b2 & (short) 255;
                        $i1++;
                        $i3--;
                    }
                    $i9 = $i10;
                } else {
                    $i3 = $i9 - 1;
                    if ($i3 < 16) {
                        $i9 = abstractInsnNode.this$0[0];
                        $b2 = abstractInsnNode.offset[$i9 + $i3];
                        while ($i3 > 3) {
                            $i10 = $i9 + $i3;
                            abstractInsnNode.offset[$i10] = abstractInsnNode.offset[$i10 - 1];
                            abstractInsnNode.offset[$i10 - 1] = abstractInsnNode.offset[$i10 - 2];
                            abstractInsnNode.offset[$i10 - 2] = abstractInsnNode.offset[$i10 - 3];
                            abstractInsnNode.offset[$i10 - 3] = abstractInsnNode.offset[$i10 - 4];
                            $i3 -= 4;
                        }
                        while ($i3 > 0) {
                            abstractInsnNode.offset[$i9 + $i3] = abstractInsnNode.offset[($i9 + $i3) - 1];
                            $i3--;
                        }
                        abstractInsnNode.offset[$i9] = $b2;
                    } else {
                        $i9 = $i3 / 16;
                        $i3 = abstractInsnNode.this$0[$i9] + ($i3 % 16);
                        $b2 = abstractInsnNode.offset[$i3];
                        while ($i3 > abstractInsnNode.this$0[$i9]) {
                            abstractInsnNode.offset[$i3] = abstractInsnNode.offset[$i3 - 1];
                            $i3--;
                        }
                        $r3 = abstractInsnNode.this$0;
                        $r3[$i9] = $r3[$i9] + 1;
                        for ($i3 = $i9; $i3 > 0; $i3--) {
                            $r3 = abstractInsnNode.this$0;
                            $r3[$i3] = $r3[$i3] - 1;
                            abstractInsnNode.offset[abstractInsnNode.this$0[$i3]] = abstractInsnNode.offset[(abstractInsnNode.this$0[$i3 - 1] + 16) - 1];
                        }
                        $r3 = abstractInsnNode.this$0;
                        $r3[0] = $r3[0] - 1;
                        abstractInsnNode.offset[abstractInsnNode.this$0[0]] = $b2;
                        if (abstractInsnNode.this$0[0] == 0) {
                            $i3 = 4095;
                            for ($i9 = 15; $i9 >= 0; $i9--) {
                                for ($i10 = 15; $i10 >= 0; $i10--) {
                                    abstractInsnNode.offset[$i3] = abstractInsnNode.offset[abstractInsnNode.this$0[$i9] + $i10];
                                    $i3--;
                                }
                                abstractInsnNode.this$0[$i9] = $i3 + 1;
                            }
                        }
                    }
                    $r3 = abstractInsnNode.parent;
                    short $s5 = abstractInsnNode.data[-250801170 & $b2] & (short) 255;
                    $r3[$s5] = $r3[$s5] + 1;
                    History.value[$i1] = abstractInsnNode.data[$b2 & (short) 255] & (short) 255;
                    $i1++;
                    if ($i7 == 0) {
                        $i6++;
                        $i7 = 2124217646;
                        $b2 = abstractInsnNode.text[$i6];
                        $i8 = abstractInsnNode.log[$b2];
                        $r1 = abstractInsnNode.fields[$b2];
                        $r5 = abstractInsnNode.items[$b2];
                        $r6 = abstractInsnNode.header[$b2];
                    }
                    $i7--;
                    $i3 = TFloatLinkedList.add($i8, abstractInsnNode);
                    $i9 = $i8;
                    while ($i3 > $r1[$i9]) {
                        $i9++;
                        $i3 = ($i3 << 1) | TFloatLinkedList.get(abstractInsnNode);
                    }
                    $i9 = $r5[$i3 - $r6[$i9]];
                }
            }
            abstractInsnNode.value = 0;
            abstractInsnNode.len = (byte) 0;
            abstractInsnNode.state[0] = 0;
            for ($i0 = 1; $i0 <= 256; $i0++) {
                abstractInsnNode.state[$i0] = abstractInsnNode.parent[$i0 - 1];
            }
            for ($i0 = 1; $i0 <= 256; $i0++) {
                $r1 = abstractInsnNode.state;
                $r1[$i0] = $r1[$i0] + abstractInsnNode.state[$i0 - 1];
            }
            for ($i0 = 0; $i0 < $i1; $i0++) {
                $i72 = History.value[$i0] & 255;
                $b2 = (byte) $i72;
                $r1 = History.value;
                $i8 = abstractInsnNode.state[1544483671 & $b2];
                $r1[$i8] = $r1[$i8] | ($i0 << 8);
                $r1 = abstractInsnNode.state;
                $i8 = $b2 & -1817321716;
                $r1[$i8] = $r1[$i8] + 1;
            }
            $i72 = (History.value[abstractInsnNode.length * 1248049083] >> 8) * 1935274687;
            $i0 = $i72;
            abstractInsnNode.index = $i72;
            abstractInsnNode.count = 0;
            $i72 = History.value[abstractInsnNode.index * -1574273729] * 1935274687;
            $i0 = $i72;
            abstractInsnNode.index = $i72;
            $i72 = abstractInsnNode.index * -1650074692;
            $i0 = $i72;
            $i72 &= 255;
            abstractInsnNode.pos = ((byte) $i72) * -860407900;
            $i72 = ((abstractInsnNode.index * -1574273729) >> 8) * 1935274687;
            $i0 = $i72;
            abstractInsnNode.index = $i72;
            $i72 = abstractInsnNode.count + 2037777509;
            $i0 = $i72;
            abstractInsnNode.count = $i72;
            abstractInsnNode.head = -215747583 * $i1;
            TFloatLinkedList.add(abstractInsnNode);
            $z0 = abstractInsnNode.count * -1770320531 == (abstractInsnNode.head * 1835797505) + 1 && abstractInsnNode.value * 186635259 == 0;
        }
    }

    static void read(AbstractInsnNode abstractInsnNode) {
        abstractInsnNode.line = -174984167;
        if (History.value == null) {
            History.value = new int[(abstractInsnNode.line * -288911456)];
        }
        boolean $z0 = true;
        while ($z0 && TFloatLinkedList.next(abstractInsnNode) != (byte) 23) {
            int $i1;
            int $i0;
            int $i3;
            int $i4;
            byte $b2;
            byte $i5;
            int $i42;
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            if (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                abstractInsnNode.length = 0;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * -248951723) << 8)) * 1827960179;
            } else {
                abstractInsnNode.length = 0;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * -248951723) << 8)) * 1827960179;
            }
            for ($i1 = 0; $i1 < 16; $i1++) {
                if (TFloatLinkedList.get(abstractInsnNode) == (byte) 1) {
                    abstractInsnNode.buf[$i1] = true;
                } else {
                    abstractInsnNode.buf[$i1] = false;
                }
            }
            for ($i0 = 0; $i0 < 16; $i0++) {
                if (abstractInsnNode.buf[$i0]) {
                    for ($i1 = 0; $i1 < 16; $i1++) {
                        if (TFloatLinkedList.get(abstractInsnNode) == (byte) 1) {
                            abstractInsnNode.next[($i0 * 16) + $i1] = true;
                        }
                    }
                }
            }
            TFloatLinkedList.set(abstractInsnNode);
            $i1 = (abstractInsnNode.size * 31808279) + 2;
            byte $i02 = TFloatLinkedList.add(3, abstractInsnNode);
            int $i52 = TFloatLinkedList.add(15, abstractInsnNode);
            for ($i3 = 0; $i3 < $i52; $i3++) {
                $i4 = 0;
                while (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                    $i4++;
                }
                abstractInsnNode.type[$i3] = (byte) $i4;
            }
            byte[] $r3 = new byte[6];
            for ($b2 = (byte) 0; $b2 < $i02; $b2 = (byte) ($b2 + 1)) {
                $r3[$b2] = $b2;
            }
            for ($i3 = 0; $i3 < $i52; $i3++) {
                $b2 = abstractInsnNode.type[$i3];
                byte $b11 = $r3[$b2];
                while ($b2 > (byte) 0) {
                    $r3[$b2] = $r3[$b2 - 1];
                    $b2 = (byte) ($b2 - 1);
                }
                $r3[0] = $b11;
                abstractInsnNode.text[$i3] = $b11;
            }
            for ($i5 = (byte) 0; $i5 < $i02; $i5++) {
                $i3 = TFloatLinkedList.add(5, abstractInsnNode);
                for ($i4 = 0; $i4 < $i1; $i4++) {
                    while (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                        $i3 = TFloatLinkedList.get(abstractInsnNode) == (byte) 0 ? $i3 + 1 : $i3 - 1;
                    }
                    abstractInsnNode.name[$i5][$i4] = (byte) $i3;
                }
            }
            for ($i5 = (byte) 0; $i5 < $i02; $i5++) {
                $i3 = 2147464356;
                $b2 = (byte) 0;
                for ($i4 = 0; $i4 < $i1; $i4++) {
                    if (abstractInsnNode.name[$i5][$i4] > $b2) {
                        $b2 = abstractInsnNode.name[$i5][$i4];
                    }
                    if (abstractInsnNode.name[$i5][$i4] < $i3) {
                        $i3 = abstractInsnNode.name[$i5][$i4];
                    }
                }
                TFloatLinkedList.add(abstractInsnNode.fields[$i5], abstractInsnNode.header[$i5], abstractInsnNode.items[$i5], abstractInsnNode.name[$i5], $i3, $b2, $i1);
                abstractInsnNode.log[$i5] = $i3;
            }
            $i0 = (abstractInsnNode.size * -1274544518) + 1;
            for ($i1 = 0; $i1 <= 255; $i1++) {
                abstractInsnNode.parent[$i1] = 0;
            }
            $i1 = 420843565;
            for ($i52 = 15; $i52 >= 0; $i52--) {
                for ($i3 = 15; $i3 >= 0; $i3--) {
                    $i42 = ($i52 * 16) + $i3;
                    $i4 = $i42;
                    abstractInsnNode.offset[$i1] = (byte) $i42;
                    $i1--;
                }
                abstractInsnNode.this$0[$i52] = $i1 + 1;
            }
            $i1 = 0;
            $b2 = abstractInsnNode.text[0];
            $i52 = abstractInsnNode.log[$b2];
            int[] $r1 = abstractInsnNode.fields[$b2];
            int[] $r5 = abstractInsnNode.items[$b2];
            int[] $r4 = abstractInsnNode.header[$b2];
            $i3 = TFloatLinkedList.add($i52, abstractInsnNode);
            $i4 = $i52;
            while ($i3 > $r1[$i4]) {
                $i4++;
                $i3 = ($i3 << 1) | TFloatLinkedList.get(abstractInsnNode);
            }
            int $i8 = $r5[$i3 - $r4[$i4]];
            $i4 = $i52;
            $i3 = -1571189053;
            $i52 = 0;
            while ($i8 != $i0) {
                int $i6;
                int $i7;
                int[] $r8;
                if ($i8 == 0 || $i8 == 1) {
                    $i6 = -1;
                    $i7 = $i8;
                    $i8 = 1;
                    while (true) {
                        if ($i7 == 0) {
                            $i6 += $i8 * 1;
                        } else if ($i7 == 1) {
                            $i6 += $i8 * 2;
                        }
                        $i8 *= 2;
                        if ($i3 == 0) {
                            $i52++;
                            $i3 = 1033619446;
                            $b2 = abstractInsnNode.text[$i52];
                            $i4 = abstractInsnNode.log[$b2];
                            $r1 = abstractInsnNode.fields[$b2];
                            $r5 = abstractInsnNode.items[$b2];
                            $r4 = abstractInsnNode.header[$b2];
                        }
                        $i3--;
                        $i7 = TFloatLinkedList.add($i4, abstractInsnNode);
                        int $i9 = $i4;
                        while ($i7 > $r1[$i9]) {
                            $i9++;
                            $i7 = ($i7 << 1) | TFloatLinkedList.get(abstractInsnNode);
                        }
                        $i7 = $r5[$i7 - $r4[$i9]];
                        if ($i7 != 0 && $i7 != 1) {
                            break;
                        }
                    }
                    $i8 = $i6 + 1;
                    $b2 = abstractInsnNode.data[abstractInsnNode.offset[abstractInsnNode.this$0[0]] & -1876402593];
                    $r8 = abstractInsnNode.parent;
                    $i6 = 1435060059 & $b2;
                    $r8[$i6] = $r8[$i6] + $i8;
                    while ($i8 > 0) {
                        History.value[$i1] = 780542514 & $b2;
                        $i1++;
                        $i8--;
                    }
                    $i8 = $i7;
                } else {
                    $i8--;
                    if ($i8 < 16) {
                        $i7 = abstractInsnNode.this$0[0];
                        $b2 = abstractInsnNode.offset[$i7 + $i8];
                        while ($i8 > 3) {
                            $i6 = $i7 + $i8;
                            abstractInsnNode.offset[$i6] = abstractInsnNode.offset[$i6 - 1];
                            abstractInsnNode.offset[$i6 - 1] = abstractInsnNode.offset[$i6 - 2];
                            abstractInsnNode.offset[$i6 - 2] = abstractInsnNode.offset[$i6 - 3];
                            abstractInsnNode.offset[$i6 - 3] = abstractInsnNode.offset[$i6 - 4];
                            $i8 -= 4;
                        }
                        while ($i8 > 0) {
                            abstractInsnNode.offset[$i7 + $i8] = abstractInsnNode.offset[($i7 + $i8) - 1];
                            $i8--;
                        }
                        abstractInsnNode.offset[$i7] = $b2;
                    } else {
                        $i7 = $i8 / 16;
                        $i8 = ($i8 % 16) + abstractInsnNode.this$0[$i7];
                        $b2 = abstractInsnNode.offset[$i8];
                        while ($i8 > abstractInsnNode.this$0[$i7]) {
                            abstractInsnNode.offset[$i8] = abstractInsnNode.offset[$i8 - 1];
                            $i8--;
                        }
                        $r8 = abstractInsnNode.this$0;
                        $r8[$i7] = $r8[$i7] + 1;
                        for ($i8 = $i7; $i8 > 0; $i8--) {
                            $r8 = abstractInsnNode.this$0;
                            $r8[$i8] = $r8[$i8] - 1;
                            abstractInsnNode.offset[abstractInsnNode.this$0[$i8]] = abstractInsnNode.offset[(abstractInsnNode.this$0[$i8 - 1] + 16) - 1];
                        }
                        $r8 = abstractInsnNode.this$0;
                        $r8[0] = $r8[0] - 1;
                        abstractInsnNode.offset[abstractInsnNode.this$0[0]] = $b2;
                        if (abstractInsnNode.this$0[0] == 0) {
                            $i8 = 4095;
                            for ($i7 = 15; $i7 >= 0; $i7--) {
                                for ($i6 = 15; $i6 >= 0; $i6--) {
                                    abstractInsnNode.offset[$i8] = abstractInsnNode.offset[abstractInsnNode.this$0[$i7] + $i6];
                                    $i8--;
                                }
                                abstractInsnNode.this$0[$i7] = $i8 + 1;
                            }
                        }
                    }
                    $r8 = abstractInsnNode.parent;
                    $i8 = abstractInsnNode.data[$b2 & (short) 255] & 1392418870;
                    $r8[$i8] = $r8[$i8] + 1;
                    History.value[$i1] = abstractInsnNode.data[$b2 & (short) 255] & -753564826;
                    $i1++;
                    if ($i3 == 0) {
                        $i52++;
                        $i3 = 50;
                        $b2 = abstractInsnNode.text[$i52];
                        $i4 = abstractInsnNode.log[$b2];
                        $r1 = abstractInsnNode.fields[$b2];
                        $r5 = abstractInsnNode.items[$b2];
                        $r4 = abstractInsnNode.header[$b2];
                    }
                    $i3--;
                    $i8 = TFloatLinkedList.add($i4, abstractInsnNode);
                    $i7 = $i4;
                    while ($i8 > $r1[$i7]) {
                        $i7++;
                        $i8 = ($i8 << 1) | TFloatLinkedList.get(abstractInsnNode);
                    }
                    $i8 = $r5[$i8 - $r4[$i7]];
                }
            }
            abstractInsnNode.value = 0;
            abstractInsnNode.len = (byte) 0;
            abstractInsnNode.state[0] = 0;
            for ($i0 = 1; $i0 <= 256; $i0++) {
                $r1 = abstractInsnNode.state;
                $r1[$i0] = $r1[$i0] + abstractInsnNode.state[$i0 - 1];
            }
            for ($i0 = 0; $i0 < $i1; $i0++) {
                $b2 = (byte) (History.value[$i0] & 255);
                $r1 = History.value;
                $i52 = abstractInsnNode.state[1605329245 & $b2];
                $r1[$i52] = $r1[$i52] | ($i0 << 8);
                $r1 = abstractInsnNode.state;
                $i52 = $b2 & -1845949739;
                $r1[$i52] = $r1[$i52] + 1;
            }
            $i42 = (History.value[abstractInsnNode.length * -2119511795] >> 8) * 1935274687;
            $i0 = $i42;
            abstractInsnNode.index = $i42;
            abstractInsnNode.count = 0;
            $i42 = History.value[abstractInsnNode.index * -1869562998] * 940509557;
            $i0 = $i42;
            abstractInsnNode.index = $i42;
            $i42 = (abstractInsnNode.index * -1574273729) & 98770616;
            $i0 = $i42;
            abstractInsnNode.pos = ((byte) $i42) * 1100328744;
            $i42 = ((abstractInsnNode.index * 1470684491) >> 8) * 1935274687;
            $i0 = $i42;
            abstractInsnNode.index = $i42;
            $i42 = abstractInsnNode.count + 2037777509;
            $i0 = $i42;
            abstractInsnNode.count = $i42;
            abstractInsnNode.head = -236770833 * $i1;
            TFloatLinkedList.add(abstractInsnNode);
            $z0 = abstractInsnNode.count * -1507525207 == (abstractInsnNode.head * -1243039615) + 1 && abstractInsnNode.value * 186635259 == 0;
        }
    }

    public static int remove(byte[] bArr, int $i0, byte[] bArr2, int i, int i2) {
        synchronized (next) {
            next.elements = bArr2;
            next.start = 1617076620 * i2;
            next.first = bArr;
            next.last = 0;
            next.prev = 1395821013 * $i0;
            next.buffer = 0;
            next.key = 0;
            next.position = 0;
            next.element = 0;
            TFloatLinkedList.toString(next);
            $i0 -= next.prev * -1603901571;
            next.elements = null;
            next.first = null;
        }
        return $i0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void remove(p000.AbstractInsnNode r17) {
        /*
        r0 = r17;
        r1 = r0.len;
        r17 = r0;
        r2 = r0.value;
        r4 = 186635259; // 0xb1fd3fb float:3.0781762E-32 double:9.221007E-316;
        r3 = r2 * r4;
        r0 = r17;
        r2 = r0.count;
        r4 = -1770320531; // 0xffffffff967b0d6d float:-2.0279855E-25 double:NaN;
        r5 = r2 * r4;
        r0 = r17;
        r2 = r0.pos;
        r4 = -280960315; // 0xffffffffef40e2c5 float:-5.969527E28 double:NaN;
        r6 = r2 * r4;
        r7 = p000.History.value;
        r0 = r17;
        r2 = r0.index;
        r4 = -1574273729; // 0xffffffffa22a7d3f float:-2.31056E-18 double:NaN;
        r8 = r2 * r4;
        r0 = r17;
        r9 = r0.first;
        r0 = r17;
        r2 = r0.last;
        r4 = 1997070121; // 0x7708df29 float:2.7760883E33 double:9.86683739E-315;
        r2 = r4 * r2;
        r0 = r17;
        r10 = r0.prev;
        r4 = -1603901571; // 0xffffffffa066677d float:-1.9515999E-19 double:NaN;
        r11 = r10 * r4;
        r0 = r17;
        r10 = r0.head;
        r4 = 1835797505; // 0x6d6c0c01 float:4.565811E27 double:9.0700448E-315;
        r10 = r10 * r4;
        r12 = r10 + 1;
        r10 = r11;
    L_0x004b:
        if (r3 <= 0) goto L_0x00c2;
    L_0x004d:
        if (r10 != 0) goto L_0x00f5;
    L_0x004f:
        r0 = r17;
        r12 = r0.element;
        r4 = -641879619; // 0xffffffffd9bdb1bd float:-6.6742745E15 double:NaN;
        r12 = r12 * r4;
        r0 = r17;
        r13 = r0.element;
        r11 = r11 - r10;
        r4 = 1720848789; // 0x66921195 float:3.4489492E23 double:8.502122683E-315;
        r11 = r11 * r4;
        r11 = r11 + r13;
        r0 = r17;
        r0.element = r11;
        r0 = r17;
        r11 = r0.element;
        r4 = -641879619; // 0xffffffffd9bdb1bd float:-6.6742745E15 double:NaN;
        r11 = r11 * r4;
        if (r11 >= r12) goto L_0x006f;
    L_0x006f:
        r0 = r17;
        r0.len = r1;
        r4 = -2078654669; // 0xffffffff841a3f33 float:-1.8131633E-36 double:NaN;
        r11 = r3 * r4;
        r0 = r17;
        r0.value = r11;
        r4 = 2037777509; // 0x79760465 float:7.9837135E34 double:1.006795861E-314;
        r11 = r5 * r4;
        r0 = r17;
        r0.count = r11;
        r4 = -1158001651; // 0xffffffffbafa4c0d float:-0.0019096151 double:NaN;
        r6 = r6 * r4;
        r0 = r17;
        r0.pos = r6;
        p000.History.value = r7;
        r4 = 1935274687; // 0x7359f2bf float:1.7267638E31 double:9.56152738E-315;
        r6 = r8 * r4;
        r0 = r17;
        r0.index = r6;
        r0 = r17;
        r0.first = r9;
        r4 = 782773529; // 0x2ea82d19 float:7.6477664E-11 double:3.86741509E-315;
        r2 = r2 * r4;
        r0 = r17;
        r0.last = r2;
        r4 = 1395821013; // 0x533289d5 float:7.6681662E11 double:6.896272103E-315;
        r2 = r10 * r4;
        r0 = r17;
        r0.prev = r2;
        return;
    L_0x00ae:
        r9[r2] = r1;
        r10 = r10 + -1;
        r2 = r2 + 1;
        r6 = r14;
        r15 = 1;
    L_0x00b6:
        if (r15 == 0) goto L_0x00ca;
    L_0x00b8:
        if (r5 != r12) goto L_0x0119;
    L_0x00ba:
        r3 = 0;
        goto L_0x004f;
    L_0x00bc:
        r9[r2] = r1;
        r2 = r2 + 1;
        r10 = r10 + -1;
    L_0x00c2:
        r15 = 1;
        goto L_0x00b6;
    L_0x00c4:
        if (r14 == r6) goto L_0x00fe;
    L_0x00c6:
        r6 = r14;
        r5 = r3;
        r3 = 3;
        goto L_0x004b;
    L_0x00ca:
        r8 = r7[r8];
        r3 = r8 & 255;
        r14 = (byte) r3;
        r8 = r8 >> 8;
        r3 = r5 + 1;
        if (r3 != r12) goto L_0x012c;
    L_0x00d5:
        r5 = r3;
        r3 = 2;
        goto L_0x004b;
    L_0x00da:
        r8 = r7[r8];
        r5 = r8 & 255;
        r14 = (byte) r5;
        r8 = r8 >> 8;
        r3 = r3 + 1;
        if (r3 != r12) goto L_0x00c4;
    L_0x00e5:
        r5 = r3;
        r3 = 3;
        goto L_0x004b;
    L_0x00ea:
        r9[r2] = r1;
        r3 = r3 + -1;
        r2 = r2 + 1;
        r10 = r10 + -1;
        goto L_0x004d;
    L_0x00f5:
        r4 = 1;
        if (r3 != r4) goto L_0x00ea;
    L_0x00f8:
        if (r10 != 0) goto L_0x00bc;
    L_0x00fa:
        r3 = 1;
        goto L_0x004f;
    L_0x00fe:
        r6 = r7[r8];
        r8 = r6 & 255;
        r14 = (byte) r8;
        r6 = r6 >> 8;
        r5 = r3 + 1;
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r16 = r14 & r4;
        r3 = r16 + 4;
        r8 = r7[r6];
        r6 = r8 & 255;
        r6 = (byte) r6;
        r8 = r8 >> 8;
        r5 = r5 + 1;
        goto L_0x004b;
    L_0x0119:
        r1 = (byte) r6;
        r8 = r7[r8];
        r3 = r8 & 255;
        r14 = (byte) r3;
        r8 = r8 >> 8;
        r5 = r5 + 1;
        if (r14 == r6) goto L_0x0134;
    L_0x0125:
        if (r10 != 0) goto L_0x00ae;
    L_0x0127:
        r3 = 1;
        r6 = r14;
        goto L_0x004f;
    L_0x012c:
        if (r14 == r6) goto L_0x00da;
    L_0x012e:
        r6 = r14;
        r5 = r3;
        r3 = 2;
        goto L_0x004b;
    L_0x0134:
        if (r5 != r12) goto L_0x0146;
    L_0x0136:
        if (r10 != 0) goto L_0x013c;
    L_0x0138:
        r3 = 1;
        goto L_0x004f;
    L_0x013c:
        r9[r2] = r1;
        r10 = r10 + -1;
        r2 = r2 + 1;
        r15 = 1;
        goto L_0x00b6;
    L_0x0146:
        r15 = 0;
        goto L_0x00b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: TFloatLinkedList.remove(AbstractInsnNode):void");
    }

    static int set(int i, AbstractInsnNode abstractInsnNode) {
        while (abstractInsnNode.buffer * 516494385 < i) {
            abstractInsnNode.key = (((abstractInsnNode.key * 1307633119) << 8) | (abstractInsnNode.elements[abstractInsnNode.start * 467899502] & 1209160642)) * 1213011487;
            abstractInsnNode.buffer += 1567528848;
            abstractInsnNode.start -= 1087495000;
            abstractInsnNode.position -= 391034999;
            if (abstractInsnNode.position * 1344889780 == 0) {
            }
        }
        int $i1 = ((abstractInsnNode.key * 122406386) >> ((abstractInsnNode.buffer * -1485174751) - i)) & ((1 << i) - 1);
        abstractInsnNode.buffer -= -1957449009 * i;
        return $i1;
    }

    public static int set(byte[] bArr, int $i0, byte[] bArr2, int i, int i2) {
        synchronized (next) {
            next.elements = bArr2;
            next.start = -673600481 * i2;
            next.first = bArr;
            next.last = 0;
            next.prev = 1395821013 * $i0;
            next.buffer = 0;
            next.key = 0;
            next.position = 0;
            next.element = 0;
            TFloatLinkedList.toString(next);
            $i0 -= next.prev * -1603901571;
            next.elements = null;
            next.first = null;
        }
        return $i0;
    }

    static void set(AbstractInsnNode abstractInsnNode) {
        abstractInsnNode.size = 0;
        for (int $i0 = 0; $i0 < 256; $i0++) {
            if (abstractInsnNode.next[$i0]) {
                abstractInsnNode.data[abstractInsnNode.size * 31808279] = (byte) $i0;
                abstractInsnNode.size += 496471207;
            }
        }
    }

    static void toArray(AbstractInsnNode abstractInsnNode) {
        abstractInsnNode.size = 0;
        for (int $i0 = 0; $i0 < 256; $i0++) {
            if (abstractInsnNode.next[$i0]) {
                abstractInsnNode.data[abstractInsnNode.size * 31808279] = (byte) $i0;
                abstractInsnNode.size += 496471207;
            }
        }
    }

    static void toString(AbstractInsnNode abstractInsnNode) {
        abstractInsnNode.line = -174984167;
        if (History.value == null) {
            History.value = new int[(abstractInsnNode.line * -288911456)];
        }
        boolean $z0 = true;
        while ($z0 && TFloatLinkedList.next(abstractInsnNode) != (byte) 23) {
            int $i1;
            int $i0;
            int $i10;
            int $i3;
            byte $b2;
            byte $i9;
            int $i92;
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            if (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                abstractInsnNode.length = 0;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
            } else {
                abstractInsnNode.length = 0;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
            }
            for ($i1 = 0; $i1 < 16; $i1++) {
                if (TFloatLinkedList.get(abstractInsnNode) == (byte) 1) {
                    abstractInsnNode.buf[$i1] = true;
                } else {
                    abstractInsnNode.buf[$i1] = false;
                }
            }
            for ($i1 = 0; $i1 < 256; $i1++) {
                abstractInsnNode.next[$i1] = false;
            }
            for ($i1 = 0; $i1 < 16; $i1++) {
                if (abstractInsnNode.buf[$i1]) {
                    for ($i0 = 0; $i0 < 16; $i0++) {
                        if (TFloatLinkedList.get(abstractInsnNode) == (byte) 1) {
                            abstractInsnNode.next[($i1 * 16) + $i0] = true;
                        }
                    }
                }
            }
            TFloatLinkedList.set(abstractInsnNode);
            $i1 = (abstractInsnNode.size * 31808279) + 2;
            byte $i02 = TFloatLinkedList.add(3, abstractInsnNode);
            int $i93 = TFloatLinkedList.add(15, abstractInsnNode);
            for ($i10 = 0; $i10 < $i93; $i10++) {
                $i3 = 0;
                while (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                    $i3++;
                }
                abstractInsnNode.type[$i10] = (byte) $i3;
            }
            byte[] $r3 = new byte[6];
            for ($b2 = (byte) 0; $b2 < $i02; $b2 = (byte) ($b2 + 1)) {
                $r3[$b2] = $b2;
            }
            for ($i10 = 0; $i10 < $i93; $i10++) {
                int $b4 = abstractInsnNode.type[$i10];
                byte $b13 = $r3[$b4];
                while ($b4 > 0) {
                    $r3[$b4] = $r3[$b4 - 1];
                    $b4 = (byte) ($b4 - 1);
                }
                $r3[0] = $b13;
                abstractInsnNode.text[$i10] = $b13;
            }
            for ($i9 = (byte) 0; $i9 < $i02; $i9++) {
                $i10 = TFloatLinkedList.add(5, abstractInsnNode);
                for ($i3 = 0; $i3 < $i1; $i3++) {
                    while (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                        $i10 = TFloatLinkedList.get(abstractInsnNode) == (byte) 0 ? $i10 + 1 : $i10 - 1;
                    }
                    abstractInsnNode.name[$i9][$i3] = (byte) $i10;
                }
            }
            for ($i9 = (byte) 0; $i9 < $i02; $i9++) {
                $b2 = (byte) 32;
                byte $b42 = (byte) 0;
                for ($i10 = 0; $i10 < $i1; $i10++) {
                    if (abstractInsnNode.name[$i9][$i10] > $b42) {
                        $b42 = abstractInsnNode.name[$i9][$i10];
                    }
                    if (abstractInsnNode.name[$i9][$i10] < $b2) {
                        $b2 = abstractInsnNode.name[$i9][$i10];
                    }
                }
                TFloatLinkedList.add(abstractInsnNode.fields[$i9], abstractInsnNode.header[$i9], abstractInsnNode.items[$i9], abstractInsnNode.name[$i9], $b2, $b42, $i1);
                abstractInsnNode.log[$i9] = $b2;
            }
            $i0 = (abstractInsnNode.size * 31808279) + 1;
            for ($i1 = 0; $i1 <= 255; $i1++) {
                abstractInsnNode.parent[$i1] = 0;
            }
            $i1 = 4095;
            for ($i93 = 15; $i93 >= 0; $i93--) {
                for ($i10 = 15; $i10 >= 0; $i10--) {
                    abstractInsnNode.offset[$i1] = (byte) (($i93 * 16) + $i10);
                    $i1--;
                }
                abstractInsnNode.this$0[$i93] = $i1 + 1;
            }
            $i1 = 0;
            $b2 = abstractInsnNode.text[0];
            $i93 = abstractInsnNode.log[$b2];
            int[] $r1 = abstractInsnNode.fields[$b2];
            int[] $r7 = abstractInsnNode.items[$b2];
            int[] $r6 = abstractInsnNode.header[$b2];
            $i3 = TFloatLinkedList.add($i93, abstractInsnNode);
            $i10 = $i93;
            while ($i3 > $r1[$i10]) {
                $i10++;
                $i3 = ($i3 << 1) | TFloatLinkedList.get(abstractInsnNode);
            }
            int $i6 = $r7[$i3 - $r6[$i10]];
            $i3 = $i93;
            $i10 = 49;
            $i93 = 0;
            while ($i6 != $i0) {
                short $s12;
                int $i5;
                int $i7;
                int[] $r2;
                if ($i6 == 0 || $i6 == 1) {
                    int $i8 = 1;
                    $i5 = -1;
                    while (true) {
                        if ($i6 == 0) {
                            $i5 += $i8 * 1;
                        } else if ($i6 == 1) {
                            $i5 += $i8 * 2;
                        }
                        $i6 = $i8 * 2;
                        if ($i10 == 0) {
                            $i93++;
                            $i10 = 50;
                            $b2 = abstractInsnNode.text[$i93];
                            $i3 = abstractInsnNode.log[$b2];
                            $r1 = abstractInsnNode.fields[$b2];
                            $r7 = abstractInsnNode.items[$b2];
                            $r6 = abstractInsnNode.header[$b2];
                        }
                        $i10--;
                        $i7 = TFloatLinkedList.add($i3, abstractInsnNode);
                        $i8 = $i3;
                        while ($i7 > $r1[$i8]) {
                            $i8++;
                            $i7 = ($i7 << 1) | TFloatLinkedList.get(abstractInsnNode);
                        }
                        $i7 = $r7[$i7 - $r6[$i8]];
                        if ($i7 != 0 && $i7 != 1) {
                            break;
                        }
                        $i8 = $i6;
                        $i6 = $i7;
                    }
                    $i5++;
                    $b2 = abstractInsnNode.data[abstractInsnNode.offset[abstractInsnNode.this$0[0]] & (short) 255];
                    $r2 = abstractInsnNode.parent;
                    $s12 = $b2 & (short) 255;
                    $r2[$s12] = $r2[$s12] + $i5;
                    while ($i5 > 0) {
                        History.value[$i1] = $b2 & (short) 255;
                        $i1++;
                        $i5--;
                    }
                    $i6 = $i7;
                } else {
                    $i5 = $i6 - 1;
                    if ($i5 < 16) {
                        $i6 = abstractInsnNode.this$0[0];
                        $b2 = abstractInsnNode.offset[$i6 + $i5];
                        while ($i5 > 3) {
                            $i7 = $i6 + $i5;
                            abstractInsnNode.offset[$i7] = abstractInsnNode.offset[$i7 - 1];
                            abstractInsnNode.offset[$i7 - 1] = abstractInsnNode.offset[$i7 - 2];
                            abstractInsnNode.offset[$i7 - 2] = abstractInsnNode.offset[$i7 - 3];
                            abstractInsnNode.offset[$i7 - 3] = abstractInsnNode.offset[$i7 - 4];
                            $i5 -= 4;
                        }
                        while ($i5 > 0) {
                            abstractInsnNode.offset[$i6 + $i5] = abstractInsnNode.offset[($i6 + $i5) - 1];
                            $i5--;
                        }
                        abstractInsnNode.offset[$i6] = $b2;
                    } else {
                        $i6 = $i5 / 16;
                        $i5 = ($i5 % 16) + abstractInsnNode.this$0[$i6];
                        $b2 = abstractInsnNode.offset[$i5];
                        while ($i5 > abstractInsnNode.this$0[$i6]) {
                            abstractInsnNode.offset[$i5] = abstractInsnNode.offset[$i5 - 1];
                            $i5--;
                        }
                        $r2 = abstractInsnNode.this$0;
                        $r2[$i6] = $r2[$i6] + 1;
                        for ($i5 = $i6; $i5 > 0; $i5--) {
                            $r2 = abstractInsnNode.this$0;
                            $r2[$i5] = $r2[$i5] - 1;
                            abstractInsnNode.offset[abstractInsnNode.this$0[$i5]] = abstractInsnNode.offset[(abstractInsnNode.this$0[$i5 - 1] + 16) - 1];
                        }
                        $r2 = abstractInsnNode.this$0;
                        $r2[0] = $r2[0] - 1;
                        abstractInsnNode.offset[abstractInsnNode.this$0[0]] = $b2;
                        if (abstractInsnNode.this$0[0] == 0) {
                            $i5 = 4095;
                            for ($i6 = 15; $i6 >= 0; $i6--) {
                                for ($i7 = 15; $i7 >= 0; $i7--) {
                                    abstractInsnNode.offset[$i5] = abstractInsnNode.offset[abstractInsnNode.this$0[$i6] + $i7];
                                    $i5--;
                                }
                                abstractInsnNode.this$0[$i6] = $i5 + 1;
                            }
                        }
                    }
                    $r2 = abstractInsnNode.parent;
                    $s12 = abstractInsnNode.data[$b2 & (short) 255] & (short) 255;
                    $r2[$s12] = $r2[$s12] + 1;
                    History.value[$i1] = abstractInsnNode.data[$b2 & (short) 255] & (short) 255;
                    $i1++;
                    if ($i10 == 0) {
                        $i93++;
                        $i10 = 50;
                        $b2 = abstractInsnNode.text[$i93];
                        $i3 = abstractInsnNode.log[$b2];
                        $r1 = abstractInsnNode.fields[$b2];
                        $r7 = abstractInsnNode.items[$b2];
                        $r6 = abstractInsnNode.header[$b2];
                    }
                    $i10--;
                    $i5 = TFloatLinkedList.add($i3, abstractInsnNode);
                    $i6 = $i3;
                    while ($i5 > $r1[$i6]) {
                        $i6++;
                        $i5 = ($i5 << 1) | TFloatLinkedList.get(abstractInsnNode);
                    }
                    $i6 = $r7[$i5 - $r6[$i6]];
                }
            }
            abstractInsnNode.value = 0;
            abstractInsnNode.len = (byte) 0;
            abstractInsnNode.state[0] = 0;
            for ($i0 = 1; $i0 <= 256; $i0++) {
                abstractInsnNode.state[$i0] = abstractInsnNode.parent[$i0 - 1];
            }
            for ($i0 = 1; $i0 <= 256; $i0++) {
                $r1 = abstractInsnNode.state;
                $r1[$i0] = $r1[$i0] + abstractInsnNode.state[$i0 - 1];
            }
            for ($i0 = 0; $i0 < $i1; $i0++) {
                $i92 = History.value[$i0] & 255;
                $b2 = (byte) $i92;
                $r1 = History.value;
                $i93 = abstractInsnNode.state[$b2 & (short) 255];
                $r1[$i93] = $r1[$i93] | ($i0 << 8);
                $r1 = abstractInsnNode.state;
                $s12 = $b2 & (short) 255;
                $r1[$s12] = $r1[$s12] + 1;
            }
            $i92 = (History.value[abstractInsnNode.length * 1248049083] >> 8) * 1935274687;
            $i0 = $i92;
            abstractInsnNode.index = $i92;
            abstractInsnNode.count = 0;
            $i92 = History.value[abstractInsnNode.index * -1574273729] * 1935274687;
            $i0 = $i92;
            abstractInsnNode.index = $i92;
            $i92 = abstractInsnNode.index * -1574273729;
            $i0 = $i92;
            $i92 &= 255;
            abstractInsnNode.pos = ((byte) $i92) * -1158001651;
            $i92 = ((abstractInsnNode.index * -1574273729) >> 8) * 1935274687;
            $i0 = $i92;
            abstractInsnNode.index = $i92;
            $i92 = abstractInsnNode.count + 2037777509;
            $i0 = $i92;
            abstractInsnNode.count = $i92;
            abstractInsnNode.head = -215747583 * $i1;
            TFloatLinkedList.add(abstractInsnNode);
            $z0 = abstractInsnNode.count * -1770320531 == (abstractInsnNode.head * 1835797505) + 1 && abstractInsnNode.value * 186635259 == 0;
        }
    }

    static void update(AbstractInsnNode abstractInsnNode) {
        abstractInsnNode.line = -174984167;
        if (History.value == null) {
            History.value = new int[(abstractInsnNode.line * -288911456)];
        }
        boolean $z0 = true;
        while ($z0 && TFloatLinkedList.next(abstractInsnNode) != (byte) 23) {
            int $i1;
            int $i0;
            int $i3;
            int $i5;
            byte $b2;
            byte $i11;
            int $i52;
            short $s13;
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            TFloatLinkedList.next(abstractInsnNode);
            if (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                abstractInsnNode.length = 0;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
            } else {
                abstractInsnNode.length = 0;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
                abstractInsnNode.length = ((TFloatLinkedList.next(abstractInsnNode) & (short) 255) | ((abstractInsnNode.length * 1248049083) << 8)) * 1827960179;
            }
            for ($i1 = 0; $i1 < 16; $i1++) {
                if (TFloatLinkedList.get(abstractInsnNode) != (byte) 1) {
                    abstractInsnNode.buf[$i1] = false;
                } else {
                    abstractInsnNode.buf[$i1] = true;
                }
            }
            for ($i1 = 0; $i1 < 256; $i1++) {
                abstractInsnNode.next[$i1] = false;
            }
            for ($i1 = 0; $i1 < 16; $i1++) {
                if (abstractInsnNode.buf[$i1]) {
                    for ($i0 = 0; $i0 < 16; $i0++) {
                        if (TFloatLinkedList.get(abstractInsnNode) == (byte) 1) {
                            abstractInsnNode.next[($i1 * 16) + $i0] = true;
                        }
                    }
                }
            }
            TFloatLinkedList.set(abstractInsnNode);
            $i1 = (abstractInsnNode.size * 31808279) + 2;
            byte $i02 = TFloatLinkedList.add(3, abstractInsnNode);
            int $i112 = TFloatLinkedList.add(15, abstractInsnNode);
            for ($i3 = 0; $i3 < $i112; $i3++) {
                $i5 = 0;
                while (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                    $i5++;
                }
                abstractInsnNode.type[$i3] = (byte) $i5;
            }
            byte[] $r3 = new byte[6];
            for ($b2 = (byte) 0; $b2 < $i02; $b2 = (byte) ($b2 + 1)) {
                $r3[$b2] = $b2;
            }
            for ($i3 = 0; $i3 < $i112; $i3++) {
                $b2 = abstractInsnNode.type[$i3];
                byte $b4 = $r3[$b2];
                while ($b2 > (byte) 0) {
                    $r3[$b2] = $r3[$b2 - 1];
                    $b2 = (byte) ($b2 - 1);
                }
                $r3[0] = $b4;
                abstractInsnNode.text[$i3] = $b4;
            }
            for ($i11 = (byte) 0; $i11 < $i02; $i11++) {
                $i3 = TFloatLinkedList.add(5, abstractInsnNode);
                for ($i5 = 0; $i5 < $i1; $i5++) {
                    while (TFloatLinkedList.get(abstractInsnNode) != (byte) 0) {
                        $i3 = TFloatLinkedList.get(abstractInsnNode) == (byte) 0 ? $i3 + 1 : $i3 - 1;
                    }
                    abstractInsnNode.name[$i11][$i5] = (byte) $i3;
                }
            }
            for ($i11 = (byte) 0; $i11 < $i02; $i11++) {
                $b2 = (byte) 32;
                $b4 = (byte) 0;
                for ($i3 = 0; $i3 < $i1; $i3++) {
                    if (abstractInsnNode.name[$i11][$i3] > $b4) {
                        $b4 = abstractInsnNode.name[$i11][$i3];
                    }
                    if (abstractInsnNode.name[$i11][$i3] < $b2) {
                        $b2 = abstractInsnNode.name[$i11][$i3];
                    }
                }
                TFloatLinkedList.add(abstractInsnNode.fields[$i11], abstractInsnNode.header[$i11], abstractInsnNode.items[$i11], abstractInsnNode.name[$i11], $b2, $b4, $i1);
                abstractInsnNode.log[$i11] = $b2;
            }
            $i0 = (abstractInsnNode.size * 31808279) + 1;
            for ($i1 = 0; $i1 <= 255; $i1++) {
                abstractInsnNode.parent[$i1] = 0;
            }
            $i1 = 4095;
            for ($i112 = 15; $i112 >= 0; $i112--) {
                for ($i3 = 15; $i3 >= 0; $i3--) {
                    $i52 = ($i112 * 16) + $i3;
                    $i5 = $i52;
                    abstractInsnNode.offset[$i1] = (byte) $i52;
                    $i1--;
                }
                abstractInsnNode.this$0[$i112] = $i1 + 1;
            }
            $i1 = 0;
            $b2 = abstractInsnNode.text[0];
            $i112 = abstractInsnNode.log[$b2];
            int[] $r1 = abstractInsnNode.fields[$b2];
            int[] $r7 = abstractInsnNode.items[$b2];
            int[] $r8 = abstractInsnNode.header[$b2];
            $i3 = TFloatLinkedList.add($i112, abstractInsnNode);
            $i5 = $i112;
            while ($i3 > $r1[$i5]) {
                $i5++;
                $i3 = ($i3 << 1) | TFloatLinkedList.get(abstractInsnNode);
            }
            int $i10 = $r7[$i3 - $r8[$i5]];
            $i5 = $i112;
            $i3 = 49;
            $i112 = 0;
            while ($i10 != $i0) {
                int $i8;
                int $i9;
                int[] $r4;
                if ($i10 == 0 || $i10 == 1) {
                    int $i7 = 1;
                    $i8 = -1;
                    while (true) {
                        if ($i10 == 0) {
                            $i8 += $i7 * 1;
                        } else if ($i10 == 1) {
                            $i8 += $i7 * 2;
                        }
                        $i10 = $i7 * 2;
                        if ($i3 == 0) {
                            $i112++;
                            $i3 = 50;
                            $b2 = abstractInsnNode.text[$i112];
                            $i5 = abstractInsnNode.log[$b2];
                            $r1 = abstractInsnNode.fields[$b2];
                            $r7 = abstractInsnNode.items[$b2];
                            $r8 = abstractInsnNode.header[$b2];
                        }
                        $i3--;
                        $i9 = TFloatLinkedList.add($i5, abstractInsnNode);
                        $i7 = $i5;
                        while ($i9 > $r1[$i7]) {
                            $i7++;
                            $i9 = ($i9 << 1) | TFloatLinkedList.get(abstractInsnNode);
                        }
                        $i9 = $r7[$i9 - $r8[$i7]];
                        if ($i9 != 0 && $i9 != 1) {
                            break;
                        }
                        $i7 = $i10;
                        $i10 = $i9;
                    }
                    $i8++;
                    $b2 = abstractInsnNode.data[abstractInsnNode.offset[abstractInsnNode.this$0[0]] & (short) 255];
                    $r4 = abstractInsnNode.parent;
                    $s13 = $b2 & (short) 255;
                    $r4[$s13] = $r4[$s13] + $i8;
                    while ($i8 > 0) {
                        History.value[$i1] = $b2 & (short) 255;
                        $i1++;
                        $i8--;
                    }
                    $i10 = $i9;
                } else {
                    $i8 = $i10 - 1;
                    if ($i8 < 16) {
                        $i10 = abstractInsnNode.this$0[0];
                        $b2 = abstractInsnNode.offset[$i10 + $i8];
                        while ($i8 > 3) {
                            $i9 = $i10 + $i8;
                            abstractInsnNode.offset[$i9] = abstractInsnNode.offset[$i9 - 1];
                            abstractInsnNode.offset[$i9 - 1] = abstractInsnNode.offset[$i9 - 2];
                            abstractInsnNode.offset[$i9 - 2] = abstractInsnNode.offset[$i9 - 3];
                            abstractInsnNode.offset[$i9 - 3] = abstractInsnNode.offset[$i9 - 4];
                            $i8 -= 4;
                        }
                        while ($i8 > 0) {
                            abstractInsnNode.offset[$i10 + $i8] = abstractInsnNode.offset[($i10 + $i8) - 1];
                            $i8--;
                        }
                        abstractInsnNode.offset[$i10] = $b2;
                    } else {
                        $i10 = $i8 / 16;
                        $i8 = ($i8 % 16) + abstractInsnNode.this$0[$i10];
                        $b2 = abstractInsnNode.offset[$i8];
                        while ($i8 > abstractInsnNode.this$0[$i10]) {
                            abstractInsnNode.offset[$i8] = abstractInsnNode.offset[$i8 - 1];
                            $i8--;
                        }
                        $r4 = abstractInsnNode.this$0;
                        $r4[$i10] = $r4[$i10] + 1;
                        for ($i8 = $i10; $i8 > 0; $i8--) {
                            $r4 = abstractInsnNode.this$0;
                            $r4[$i8] = $r4[$i8] - 1;
                            abstractInsnNode.offset[abstractInsnNode.this$0[$i8]] = abstractInsnNode.offset[(abstractInsnNode.this$0[$i8 - 1] + 16) - 1];
                        }
                        $r4 = abstractInsnNode.this$0;
                        $r4[0] = $r4[0] - 1;
                        abstractInsnNode.offset[abstractInsnNode.this$0[0]] = $b2;
                        if (abstractInsnNode.this$0[0] == 0) {
                            $i8 = 4095;
                            for ($i10 = 15; $i10 >= 0; $i10--) {
                                for ($i9 = 15; $i9 >= 0; $i9--) {
                                    abstractInsnNode.offset[$i8] = abstractInsnNode.offset[abstractInsnNode.this$0[$i10] + $i9];
                                    $i8--;
                                }
                                abstractInsnNode.this$0[$i10] = $i8 + 1;
                            }
                        }
                    }
                    $r4 = abstractInsnNode.parent;
                    $s13 = abstractInsnNode.data[$b2 & (short) 255] & (short) 255;
                    $r4[$s13] = $r4[$s13] + 1;
                    History.value[$i1] = abstractInsnNode.data[$b2 & (short) 255] & (short) 255;
                    $i1++;
                    if ($i3 == 0) {
                        $i112++;
                        $i3 = 50;
                        $b2 = abstractInsnNode.text[$i112];
                        $i5 = abstractInsnNode.log[$b2];
                        $r1 = abstractInsnNode.fields[$b2];
                        $r7 = abstractInsnNode.items[$b2];
                        $r8 = abstractInsnNode.header[$b2];
                    }
                    $i3--;
                    $i8 = TFloatLinkedList.add($i5, abstractInsnNode);
                    $i10 = $i5;
                    while ($i8 > $r1[$i10]) {
                        $i10++;
                        $i8 = ($i8 << 1) | TFloatLinkedList.get(abstractInsnNode);
                    }
                    $i10 = $r7[$i8 - $r8[$i10]];
                }
            }
            abstractInsnNode.value = 0;
            abstractInsnNode.len = (byte) 0;
            abstractInsnNode.state[0] = 0;
            for ($i0 = 1; $i0 <= 256; $i0++) {
                abstractInsnNode.state[$i0] = abstractInsnNode.parent[$i0 - 1];
            }
            for ($i0 = 1; $i0 <= 256; $i0++) {
                $r1 = abstractInsnNode.state;
                $r1[$i0] = $r1[$i0] + abstractInsnNode.state[$i0 - 1];
            }
            for ($i0 = 0; $i0 < $i1; $i0++) {
                $b2 = (byte) (History.value[$i0] & 255);
                $r1 = History.value;
                $i112 = abstractInsnNode.state[$b2 & (short) 255];
                $r1[$i112] = $r1[$i112] | ($i0 << 8);
                $r1 = abstractInsnNode.state;
                $s13 = $b2 & (short) 255;
                $r1[$s13] = $r1[$s13] + 1;
            }
            $i52 = (History.value[abstractInsnNode.length * 1248049083] >> 8) * 1935274687;
            $i0 = $i52;
            abstractInsnNode.index = $i52;
            abstractInsnNode.count = 0;
            $i52 = History.value[abstractInsnNode.index * -1574273729] * 1935274687;
            $i0 = $i52;
            abstractInsnNode.index = $i52;
            $i52 = abstractInsnNode.index * -1574273729;
            $i0 = $i52;
            $i52 &= 255;
            abstractInsnNode.pos = ((byte) $i52) * -1158001651;
            $i52 = ((abstractInsnNode.index * -1574273729) >> 8) * 1935274687;
            $i0 = $i52;
            abstractInsnNode.index = $i52;
            $i52 = abstractInsnNode.count + 2037777509;
            $i0 = $i52;
            abstractInsnNode.count = $i52;
            abstractInsnNode.head = -215747583 * $i1;
            TFloatLinkedList.add(abstractInsnNode);
            $z0 = abstractInsnNode.count * -1770320531 == (abstractInsnNode.head * 1835797505) + 1 && abstractInsnNode.value * 186635259 == 0;
        }
    }
}
