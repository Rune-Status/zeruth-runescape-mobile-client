package p000;

/* compiled from: bg */
public class Utils {
    static final int FILE_COPY_BUFFER_SIZE = 2048;
    static final int MODIFY_UNINITIALIZED = 0;
    static final int NETWORK_NONE = 0;
    public static final short[] f339a = new short[]{(short) 6798, (short) 8741, (short) 25238, (short) 4626, (short) 4550};
    public static final short[][] f340b = new short[][]{new short[]{(short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744, (short) 5799, (short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, new short[]{(short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, new short[]{(short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, new short[]{(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270}, new short[]{(short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806, (short) 8076, (short) 4574, (short) 17050, (short) 0, (short) 127, (short) -31821}};
    public static final short[] handler = new short[]{(short) -10304, (short) 9104, (short) -1, (short) -1, (short) -1};
    public static final short[][] name = new short[][]{new short[]{(short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756, (short) 5681, (short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339, (short) 16, (short) 5157, (short) 10446, (short) 3658, (short) -27314, (short) -21965, (short) 472, (short) 580, (short) 784, (short) 21966, (short) 28950, (short) -15697, (short) -14002}, new short[]{(short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526, (short) 918, (short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027, (short) 1457, (short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392, (short) 10429, (short) 3673, (short) -27335, (short) -21957, (short) 192, (short) 687, (short) 412, (short) 21821, (short) 28835, (short) -15460, (short) -14019}, new short[0], new short[0], new short[0]};

    Utils() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bg.<init>(" + ')');
        }
    }

    static void add(ByteBuffer byteBuffer, int i) {
        try {
            if (byteBuffer.size(-155742930) != client.start) {
                client.start = byteBuffer.size(-742564815);
                Feed.add(byteBuffer.size(842511121), (byte) -17);
            }
            Intent.data = byteBuffer.buffer;
            client.f407x = 900776355 * byteBuffer.length;
            client.f397m = 1885480123 * byteBuffer.index;
            Character.f38b = (client.activity * 1902364993 == 0 ? 43594 : 40000 + (byteBuffer.length * -756728079)) * 246734963;
            Chart.f40a = (client.activity * 1902364993 == 0 ? 443 : 50000 + (byteBuffer.length * -756728079)) * -294315831;
            FileUtils.f118a = 1876323531 * Character.f38b;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bg.ao(" + ')');
        }
    }

    static boolean checkPrefix2(int i, int i2) {
        return i != 4 || i2 < 8;
    }

    static byte[] get(byte[] bArr, int i) {
        try {
            i = bArr.length;
            byte[] $r1 = new byte[i];
            System.arraycopy(bArr, 0, $r1, 0, i);
            return $r1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bg.an(" + ')');
        }
    }

    static boolean inBounds(int i, int i2) {
        return i != 4 || i2 < 8;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void init(p000.System r11, int r12, int r13, boolean r14, int r15) {
        /*
        r15 = r11.this$0;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r0 = r1 * r15;
        r15 = r11.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r15 = r15 * r1;
        r2 = r11.f295p;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1514052731; // 0x5a3e9c7b float:1.34130744E16 double:7.480414404E-315;
        r2 = r2 * r1;
        if (r2 != 0) goto L_0x00aa;
    L_0x0015:
        r12 = r11.f300x;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1684437759; // 0x64667aff float:1.7006456E22 double:8.322228293E-315;
        r12 = r1 * r12;
        r11.this$0 = r12;	 Catch:{ RuntimeException -> 0x00c3 }
    L_0x001e:
        r12 = r11.f290g;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1658471413; // 0x62da43f5 float:2.0131435E21 double:8.1939375E-315;
        r12 = r12 * r1;
        if (r12 != 0) goto L_0x0115;
    L_0x0026:
        r12 = r11.f288e;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 4587323; // 0x45ff3b float:6.428209E-39 double:2.2664387E-317;
        r12 = r12 * r1;
        r11.$assertionsDisabled = r12;	 Catch:{ RuntimeException -> 0x00c3 }
    L_0x002e:
        r12 = r11.f295p;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1514052731; // 0x5a3e9c7b float:1.34130744E16 double:7.480414404E-315;
        r12 = r12 * r1;
        r1 = 4;
        if (r1 != r12) goto L_0x0052;
    L_0x0037:
        r12 = r11.f296q;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 309302415; // 0x126f948f float:7.5598215E-28 double:1.528156974E-315;
        r12 = r1 * r12;
        r13 = r11.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r13 = r13 * r1;
        r12 = r12 * r13;
        r13 = r11.f297r;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = -1111787169; // 0xffffffffbdbb795f float:-0.09154009 double:NaN;
        r13 = r13 * r1;
        r12 = r12 / r13;
        r1 = -1766254579; // 0xffffffff96b9180d float:-2.990354E-25 double:NaN;
        r12 = r12 * r1;
        r11.this$0 = r12;	 Catch:{ RuntimeException -> 0x00c3 }
    L_0x0052:
        r12 = r11.f290g;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1658471413; // 0x62da43f5 float:2.0131435E21 double:8.1939375E-315;
        r12 = r12 * r1;
        r1 = 4;
        if (r1 != r12) goto L_0x0076;
    L_0x005b:
        r12 = r11.this$0;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r12 = r12 * r1;
        r13 = r11.f297r;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = -1111787169; // 0xffffffffbdbb795f float:-0.09154009 double:NaN;
        r13 = r1 * r13;
        r12 = r12 * r13;
        r13 = r11.f296q;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 309302415; // 0x126f948f float:7.5598215E-28 double:1.528156974E-315;
        r13 = r13 * r1;
        r12 = r12 / r13;
        r1 = -24391825; // 0xfffffffffe8bcf6f float:-9.291987E37 double:NaN;
        r12 = r12 * r1;
        r11.$assertionsDisabled = r12;	 Catch:{ RuntimeException -> 0x00c3 }
    L_0x0076:
        r12 = r11.context;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = -586529633; // 0xffffffffdd0a449f float:-6.2270394E17 double:NaN;
        r12 = r1 * r12;
        r1 = 1337; // 0x539 float:1.874E-42 double:6.606E-321;
        if (r12 != r1) goto L_0x0083;
    L_0x0081:
        p000.client.options = r11;
    L_0x0083:
        if (r14 == 0) goto L_0x012f;
    L_0x0085:
        r3 = r11.adapter;	 Catch:{ RuntimeException -> 0x00c3 }
        if (r3 == 0) goto L_0x012f;
    L_0x0089:
        r12 = r11.this$0;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 256177861; // 0xf44f6c5 float:9.711072E-30 double:1.265686803E-315;
        r12 = r12 * r1;
        if (r0 != r12) goto L_0x0099;
    L_0x0091:
        r12 = r11.$assertionsDisabled;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 57307023; // 0x36a6f8f float:6.8894483E-37 double:2.83134313E-316;
        r12 = r12 * r1;
        if (r12 == r15) goto L_0x012f;
    L_0x0099:
        r4 = new ArrayList;
        r4.<init>();	 Catch:{ RuntimeException -> 0x00c3 }
        r4.name = r11;	 Catch:{ RuntimeException -> 0x00c3 }
        r3 = r11.adapter;	 Catch:{ RuntimeException -> 0x00c3 }
        r4.size = r3;	 Catch:{ RuntimeException -> 0x00c3 }
        r5 = p000.client.lock;
        r5.toString(r4);	 Catch:{ RuntimeException -> 0x00c3 }
        return;
    L_0x00aa:
        r2 = r11.f295p;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1514052731; // 0x5a3e9c7b float:1.34130744E16 double:7.480414404E-315;
        r2 = r2 * r1;
        r1 = 1;
        if (r1 != r2) goto L_0x00de;
    L_0x00b3:
        r2 = r11.f300x;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1506390075; // 0x59c9b03b float:7.0962797E15 double:7.442555853E-315;
        r2 = r2 * r1;
        r12 = r12 - r2;
        r1 = -1766254579; // 0xffffffff96b9180d float:-2.990354E-25 double:NaN;
        r12 = r12 * r1;
        r11.this$0 = r12;	 Catch:{ RuntimeException -> 0x00c3 }
        goto L_0x001e;
    L_0x00c3:
        r6 = move-exception;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "bg.ej(";
        r7 = r7.append(r8);
        r1 = 41;
        r7 = r7.append(r1);
        r9 = r7.toString();
        r10 = p000.StringBuilder.append(r6, r9);
        throw r10;
    L_0x00de:
        r2 = r11.f295p;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1514052731; // 0x5a3e9c7b float:1.34130744E16 double:7.480414404E-315;
        r2 = r2 * r1;
        r1 = 2;
        if (r2 != r1) goto L_0x001e;
    L_0x00e7:
        r2 = r11.f300x;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1506390075; // 0x59c9b03b float:7.0962797E15 double:7.442555853E-315;
        r2 = r2 * r1;
        r12 = r2 * r12;
        r12 = r12 >> 14;
        r1 = -1766254579; // 0xffffffff96b9180d float:-2.990354E-25 double:NaN;
        r12 = r12 * r1;
        r11.this$0 = r12;	 Catch:{ RuntimeException -> 0x00c3 }
        goto L_0x001e;
    L_0x00fa:
        r12 = r11.f290g;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1658471413; // 0x62da43f5 float:2.0131435E21 double:8.1939375E-315;
        r12 = r12 * r1;
        r1 = 2;
        if (r12 != r1) goto L_0x002e;
    L_0x0103:
        r12 = r11.f288e;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = -533584139; // 0xffffffffe03226f5 float:-5.134887E19 double:NaN;
        r12 = r12 * r1;
        r12 = r12 * r13;
        r12 = r12 >> 14;
        r1 = -24391825; // 0xfffffffffe8bcf6f float:-9.291987E37 double:NaN;
        r12 = r12 * r1;
        r11.$assertionsDisabled = r12;	 Catch:{ RuntimeException -> 0x00c3 }
        goto L_0x002e;
    L_0x0115:
        r12 = r11.f290g;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = 1658471413; // 0x62da43f5 float:2.0131435E21 double:8.1939375E-315;
        r12 = r12 * r1;
        r1 = 1;
        if (r12 != r1) goto L_0x00fa;
    L_0x011e:
        r12 = r11.f288e;	 Catch:{ RuntimeException -> 0x00c3 }
        r1 = -533584139; // 0xffffffffe03226f5 float:-5.134887E19 double:NaN;
        r12 = r12 * r1;
        r12 = r13 - r12;
        r1 = -24391825; // 0xfffffffffe8bcf6f float:-9.291987E37 double:NaN;
        r12 = r12 * r1;
        r11.$assertionsDisabled = r12;	 Catch:{ RuntimeException -> 0x00c3 }
        goto L_0x002e;
    L_0x012f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Utils.init(System, int, int, boolean, int):void");
    }

    static void read(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i6 = iArr2[i5];
                if (i6 != 0) {
                    i5 = (16711935 & i6) * i12;
                    i6 = ((((i6 * i12) - i5) & 16711680) + (i5 & -16711936)) >>> 8;
                    try {
                        i7 = iArr[i4];
                        i5 = i6 + i7;
                        i6 = (i6 & 16711935) + (i7 & 16711935);
                        i7 = ((i5 - i6) & PingManager.STATE_SENSOR_ON_FLAG) + (i6 & 16777472);
                        i6 = i4 + 1;
                        iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "bg.bb(" + ')');
                    }
                }
                i6 = i4 + 1;
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }

    static boolean spanWillOverlap(int i, int i2) {
        return i != 4 || i2 < 8;
    }

    static boolean sqAttacked(int i, int i2) {
        return i != 4 || i2 < 8;
    }

    static void write(byte b) {
        int $i1 = 0;
        Database.size = 0;
        while ($i1 < 2048) {
            try {
                Database.id[$i1] = null;
                Database.parent[$i1] = (byte) 1;
                $i1++;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "bg.ar(" + ')');
            }
        }
    }
}
