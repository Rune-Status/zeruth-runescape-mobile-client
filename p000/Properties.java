package p000;

/* compiled from: mr */
public final class Properties {
    public static final int FLAGS_DEFAULT_TYPE_STRING = 256;
    static final int PREF_SIZE = 300;
    public static final int Theme_listPreferredItemHeightLarge = 71;
    static byte[] context = new byte[520];
    MappedChannelRandomAccessSource data;
    int name;
    int source;
    MappedChannelRandomAccessSource this$0;

    public Properties(int $i0, MappedChannelRandomAccessSource mappedChannelRandomAccessSource, MappedChannelRandomAccessSource mappedChannelRandomAccessSource2, int i) {
        try {
            this.this$0 = null;
            this.data = null;
            this.source = -636576424;
            this.name = 1874332673 * $i0;
            this.this$0 = mappedChannelRandomAccessSource;
            this.data = mappedChannelRandomAccessSource2;
            this.source = -1077451897 * i;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mr.<init>(" + ')');
        }
    }

    public boolean execute(int i, byte[] bArr, int i2) {
        boolean $z1;
        synchronized (this.this$0) {
            if (i2 >= 0) {
                if (i2 <= this.source * 474804791) {
                    boolean $z0 = load(i, bArr, i2, true, 537618701);
                    $z1 = $z0;
                    if (!$z0) {
                        $z1 = load(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return $z1;
    }

    public boolean get(int i, byte[] bArr, int i2) {
        boolean $z1;
        synchronized (this.this$0) {
            if (i2 >= 0) {
                if (i2 <= this.source * -839398266) {
                    boolean $z0 = load(i, bArr, i2, true, 537618701);
                    $z1 = $z0;
                    if (!$z0) {
                        $z1 = load(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return $z1;
    }

    public boolean load(int i, byte[] bArr, int i2) {
        boolean $z1;
        synchronized (this.this$0) {
            if (i2 >= 0) {
                if (i2 <= this.source * 474804791) {
                    boolean $z0 = load(i, bArr, i2, true, 537618701);
                    $z1 = $z0;
                    if (!$z0) {
                        $z1 = load(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return $z1;
    }

    public boolean load(int i, byte[] bArr, int i2, int i3) {
        try {
            boolean $z1;
            synchronized (this.this$0) {
                if (i2 >= 0) {
                    if (i2 <= this.source * 474804791) {
                        boolean $z0 = load(i, bArr, i2, true, 537618701);
                        $z1 = $z0;
                        if (!$z0) {
                            $z1 = load(i, bArr, i2, false, 537618701);
                        }
                    }
                }
                throw new IllegalArgumentException();
            }
            return $z1;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "mr.ad(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean load(int r28, byte[] r29, int r30, boolean r31) {
        /*
        r27 = this;
        r0 = r27;
        r2 = r0.this$0;
        monitor-enter(r2);
        if (r31 == 0) goto L_0x0077;
    L_0x0007:
        r0 = r27;
        r3 = r0.data;
        r6 = -13520; // 0xffffffffffffcb30 float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x0266 }
        r7 = r28 * 6;
        r7 = r7 + 6;
        r8 = (long) r7;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x001d;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x001d:
        r0 = r27;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0074 }
        r7 = r28 * 6;
        r4 = (long) r7;	 Catch:{ Throwable -> 0x0074 }
        r3.get(r4);	 Catch:{ IOException -> 0x0266 }
        r0 = r27;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r12 = 6;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r11, r6, r12, r13);	 Catch:{ IOException -> 0x0266 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 5;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r7 = r15 << 16;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 4;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r16 = r15 << 8;
        r0 = r16;
        r7 = r7 + r0;
        r17 = r14 + r7;
        if (r17 <= 0) goto L_0x0071;
    L_0x005b:
        r0 = r17;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x0074 }
        r0 = r27;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = -31645; // 0xffffffffffff8463 float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x0266 }
        r18 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r18;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x0092;
    L_0x0071:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x0074:
        r20 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        throw r20;
    L_0x0077:
        r0 = r27;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = -30131; // 0xffffffffffff8a4d float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x0266 }
        r18 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r0 = r18;
        r4 = r4 + r0;
        r18 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r18;
        r4 = r4 / r0;
        r0 = (int) r4;	 Catch:{ Throwable -> 0x0074 }
        r17 = r0;
        if (r17 != 0) goto L_0x0092;
    L_0x0090:
        r17 = 1;
    L_0x0092:
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r7 = r30 >> 16;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r7 = r30 >> 8;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0074 }
        r6 = 1;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r30;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 2;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r7 = r17 >> 16;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r7 = r17 >> 8;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0074 }
        r6 = 4;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r17;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 5;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r0 = r27;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0074 }
        r7 = r28 * 6;
        r4 = (long) r7;	 Catch:{ Throwable -> 0x0074 }
        r3.get(r4);	 Catch:{ IOException -> 0x0266 }
        r0 = r27;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r12 = 6;
        r13 = -495081600; // 0xffffffffe27da780 float:-1.169774E21 double:NaN;
        r3.read(r11, r6, r12, r13);	 Catch:{ IOException -> 0x0266 }
        r16 = 0;
        r7 = 0;
    L_0x00dd:
        r0 = r30;
        if (r7 >= r0) goto L_0x0263;
    L_0x00e1:
        r21 = 0;
        if (r31 == 0) goto L_0x019c;
    L_0x00e5:
        r0 = r27;
        r3 = r0.this$0;
        r0 = r17;
        r0 = r0 * 520;
        r22 = r0;
        r4 = (long) r0;
        r3.get(r4);	 Catch:{ IOException -> 0x0266 }
        r0 = r27;
        r3 = r0.this$0;
        r11 = context;
        r6 = 0;
        r12 = 8;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r11, r6, r12, r13);	 Catch:{ EOFException -> 0x0262 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r22 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 1;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r22 = r14 + r22;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 2;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r21 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r23 = r14 + r21;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 5;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r21 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 4;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r24 = r14 << 16;
        r0 = r21;
        r1 = r24;
        r0 = r0 + r1;
        r21 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 6;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r0 = r21;
        r0 = r0 + r14;
        r21 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 7;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r0 = r28;
        r1 = r22;
        if (r0 != r1) goto L_0x017e;
    L_0x0168:
        r0 = r16;
        r1 = r23;
        if (r0 != r1) goto L_0x017e;
    L_0x016e:
        r0 = r27;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0074 }
        r22 = r0;
        r6 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r0 = r22;
        r0 = r0 * r6;
        r22 = r0;
        if (r14 == r0) goto L_0x0181;
    L_0x017e:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x0181:
        if (r21 < 0) goto L_0x0199;
    L_0x0183:
        r0 = r21;
        r4 = (long) r0;
        r0 = r27;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = -1003; // 0xfffffffffffffc15 float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x0266 }
        r18 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r18;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x019c;
    L_0x0199:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x019c:
        if (r21 != 0) goto L_0x026f;
    L_0x019e:
        r31 = 0;
        r0 = r27;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = -20916; // 0xffffffffffffae4c float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x0266 }
        r18 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r0 = r18;
        r4 = r4 + r0;
        r18 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r18;
        r4 = r4 / r0;
        r0 = (int) r4;	 Catch:{ Throwable -> 0x0074 }
        r21 = r0;
        if (r21 != 0) goto L_0x01bb;
    L_0x01b9:
        r21 = r21 + 1;
    L_0x01bb:
        r0 = r17;
        r1 = r21;
        if (r0 != r1) goto L_0x026f;
    L_0x01c1:
        r21 = r21 + 1;
        r31 = 0;
    L_0x01c5:
        r22 = r30 - r7;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r22;
        if (r0 > r6) goto L_0x026a;
    L_0x01cd:
        r22 = 0;
    L_0x01cf:
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r21 = r28 >> 8;
        r0 = r21;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r28;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 1;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r21 = r16 >> 8;
        r0 = r21;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 2;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r16;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r21 = r22 >> 16;
        r0 = r21;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 4;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r21 = r22 >> 8;
        r0 = r21;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 5;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r22;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 6;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r27;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0074 }
        r21 = r0;
        r6 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r0 = r21;
        r0 = r0 * r6;
        r21 = r0;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 7;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r0 = r27;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r0 = r17;
        r0 = r0 * 520;
        r17 = r0;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x0074 }
        r3.get(r4);	 Catch:{ IOException -> 0x0266 }
        r0 = r27;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r12 = 8;
        r13 = 416495601; // 0x18d337f1 float:5.4598708E-24 double:2.05776168E-315;
        r3.read(r11, r6, r12, r13);	 Catch:{ IOException -> 0x0266 }
        r17 = r30 - r7;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r17;
        if (r0 <= r6) goto L_0x024a;
    L_0x0248:
        r17 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x024a:
        r0 = r27;
        r3 = r0.this$0;
        r6 = -1145823650; // 0xffffffffbbb41e5e float:-0.005496784 double:NaN;
        r0 = r29;
        r1 = r17;
        r3.read(r0, r7, r1, r6);	 Catch:{ IOException -> 0x0266 }
        r0 = r17;
        r7 = r7 + r0;
        r16 = r16 + 1;
        r17 = r22;
        goto L_0x00dd;
    L_0x0262:
        r25 = move-exception;
    L_0x0263:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 1;
        return r6;
    L_0x0266:
        r26 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x026a:
        r22 = r21;
        goto L_0x01cf;
    L_0x026f:
        goto L_0x01c5;
        */
        throw new UnsupportedOperationException("Method not decompiled: Properties.load(int, byte[], int, boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean load(int r33, byte[] r34, int r35, boolean r36, int r37) {
        /*
        r32 = this;
        r0 = r32;
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x007f }
        monitor-enter(r3);	 Catch:{ RuntimeException -> 0x007f }
        if (r36 == 0) goto L_0x00a8;
    L_0x0007:
        r0 = r32;
        r4 = r0.data;
        r7 = -31956; // 0xffffffffffff832c float:NaN double:NaN;
        r5 = r4.get(r7);	 Catch:{ IOException -> 0x02aa }
        r37 = r33 * 6;
        r37 = r37 + 6;
        r0 = r37;
        r8 = (long) r0;
        r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x001f;
    L_0x001c:
        monitor-exit(r3);	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        return r7;
    L_0x001f:
        r0 = r32;
        r4 = r0.data;	 Catch:{ Throwable -> 0x007c }
        r37 = r33 * 6;
        r0 = r37;
        r5 = (long) r0;	 Catch:{ Throwable -> 0x007c }
        r4.get(r5);	 Catch:{ IOException -> 0x02aa }
        r0 = r32;
        r4 = r0.data;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        r12 = 6;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r4.get(r11, r7, r12, r13);	 Catch:{ IOException -> 0x02aa }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 5;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 3;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r7;
        r37 = r15 << 16;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 4;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r7;
        r16 = r15 << 8;
        r0 = r37;
        r1 = r16;
        r0 = r0 + r1;
        r37 = r0;
        r17 = r14 + r37;
        if (r17 <= 0) goto L_0x0079;
    L_0x0063:
        r0 = r17;
        r5 = (long) r0;	 Catch:{ Throwable -> 0x007c }
        r0 = r32;
        r4 = r0.this$0;	 Catch:{ Throwable -> 0x007c }
        r7 = -15351; // 0xffffffffffffc409 float:NaN double:NaN;
        r8 = r4.get(r7);	 Catch:{ IOException -> 0x02aa }
        r18 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r18;
        r8 = r8 / r0;
        r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x00c3;
    L_0x0079:
        monitor-exit(r3);	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        return r7;
    L_0x007c:
        r20 = move-exception;
        monitor-exit(r3);	 Catch:{ Throwable -> 0x007c }
        throw r20;	 Catch:{ RuntimeException -> 0x007f }
    L_0x007f:
        r21 = move-exception;
        r22 = new java.lang.StringBuilder;
        r0 = r22;
        r0.<init>();
        r23 = "mr.an(";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);
        r7 = 41;
        r0 = r22;
        r22 = r0.append(r7);
        r0 = r22;
        r24 = r0.toString();
        r0 = r21;
        r1 = r24;
        r25 = p000.StringBuilder.append(r0, r1);
        throw r25;
    L_0x00a8:
        r0 = r32;
        r4 = r0.this$0;	 Catch:{ Throwable -> 0x007c }
        r7 = -1977; // 0xfffffffffffff847 float:NaN double:NaN;
        r5 = r4.get(r7);	 Catch:{ IOException -> 0x02aa }
        r18 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r0 = r18;
        r5 = r5 + r0;
        r18 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r18;
        r5 = r5 / r0;
        r0 = (int) r5;	 Catch:{ Throwable -> 0x007c }
        r17 = r0;
        if (r17 != 0) goto L_0x00c3;
    L_0x00c1:
        r17 = 1;
    L_0x00c3:
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r37 = r35 >> 16;
        r0 = r37;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r37 = r35 >> 8;
        r0 = r37;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 1;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r0 = r35;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 2;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r37 = r17 >> 16;
        r0 = r37;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 3;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r37 = r17 >> 8;
        r0 = r37;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 4;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r0 = r17;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 5;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r0 = r32;
        r4 = r0.data;	 Catch:{ Throwable -> 0x007c }
        r37 = r33 * 6;
        r0 = r37;
        r5 = (long) r0;	 Catch:{ Throwable -> 0x007c }
        r4.get(r5);	 Catch:{ IOException -> 0x02aa }
        r0 = r32;
        r4 = r0.data;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        r12 = 6;
        r13 = 1683843711; // 0x645d6a7f float:1.6337617E22 double:8.319293306E-315;
        r4.read(r11, r7, r12, r13);	 Catch:{ IOException -> 0x02aa }
        r16 = 0;
        r37 = 0;
    L_0x0119:
        r0 = r37;
        r1 = r35;
        if (r0 >= r1) goto L_0x02a7;
    L_0x011f:
        r26 = 0;
        if (r36 == 0) goto L_0x01da;
    L_0x0123:
        r0 = r32;
        r4 = r0.this$0;
        r0 = r17;
        r0 = r0 * 520;
        r27 = r0;
        r5 = (long) r0;
        r4.get(r5);	 Catch:{ IOException -> 0x02aa }
        r0 = r32;
        r4 = r0.this$0;
        r11 = context;
        r7 = 0;
        r12 = 8;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r4.get(r11, r7, r12, r13);	 Catch:{ EOFException -> 0x02a6 }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r27 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 1;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r27 = r14 + r27;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 2;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r26 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 3;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r28 = r14 + r26;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 5;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r26 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 4;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r29 = r14 << 16;
        r0 = r26;
        r1 = r29;
        r0 = r0 + r1;
        r26 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 6;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r0 = r26;
        r0 = r0 + r14;
        r26 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 7;
        r10 = r11[r7];	 Catch:{ Throwable -> 0x007c }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r7;
        r0 = r33;
        r1 = r27;
        if (r0 != r1) goto L_0x01bc;
    L_0x01a6:
        r0 = r16;
        r1 = r28;
        if (r0 != r1) goto L_0x01bc;
    L_0x01ac:
        r0 = r32;
        r0 = r0.name;	 Catch:{ Throwable -> 0x007c }
        r27 = r0;
        r7 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r0 = r27;
        r0 = r0 * r7;
        r27 = r0;
        if (r14 == r0) goto L_0x01bf;
    L_0x01bc:
        monitor-exit(r3);	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        return r7;
    L_0x01bf:
        if (r26 < 0) goto L_0x01d7;
    L_0x01c1:
        r0 = r26;
        r5 = (long) r0;
        r0 = r32;
        r4 = r0.this$0;	 Catch:{ Throwable -> 0x007c }
        r7 = -30442; // 0xffffffffffff8916 float:NaN double:NaN;
        r8 = r4.get(r7);	 Catch:{ IOException -> 0x02aa }
        r18 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r18;
        r8 = r8 / r0;
        r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x01da;
    L_0x01d7:
        monitor-exit(r3);	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        return r7;
    L_0x01da:
        if (r26 != 0) goto L_0x02b3;
    L_0x01dc:
        r36 = 0;
        r0 = r32;
        r4 = r0.this$0;	 Catch:{ Throwable -> 0x007c }
        r7 = -6232; // 0xffffffffffffe7a8 float:NaN double:NaN;
        r5 = r4.get(r7);	 Catch:{ IOException -> 0x02aa }
        r18 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r0 = r18;
        r5 = r5 + r0;
        r18 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r18;
        r5 = r5 / r0;
        r0 = (int) r5;	 Catch:{ Throwable -> 0x007c }
        r26 = r0;
        if (r26 != 0) goto L_0x01f9;
    L_0x01f7:
        r26 = r26 + 1;
    L_0x01f9:
        r0 = r17;
        r1 = r26;
        if (r0 != r1) goto L_0x02b3;
    L_0x01ff:
        r26 = r26 + 1;
        r36 = 0;
    L_0x0203:
        r27 = r35 - r37;
        r7 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r27;
        if (r0 > r7) goto L_0x02ae;
    L_0x020b:
        r27 = 0;
    L_0x020d:
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r26 = r33 >> 8;
        r0 = r26;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r0 = r33;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 1;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r26 = r16 >> 8;
        r0 = r26;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 2;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r0 = r16;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 3;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r26 = r27 >> 16;
        r0 = r26;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 4;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r26 = r27 >> 8;
        r0 = r26;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 5;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r0 = r27;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 6;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r0 = r32;
        r0 = r0.name;	 Catch:{ Throwable -> 0x007c }
        r26 = r0;
        r7 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r0 = r26;
        r0 = r0 * r7;
        r26 = r0;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x007c }
        r7 = 7;
        r11[r7] = r10;	 Catch:{ Throwable -> 0x007c }
        r0 = r32;
        r4 = r0.this$0;	 Catch:{ Throwable -> 0x007c }
        r0 = r17;
        r0 = r0 * 520;
        r17 = r0;
        r5 = (long) r0;	 Catch:{ Throwable -> 0x007c }
        r4.get(r5);	 Catch:{ IOException -> 0x02aa }
        r0 = r32;
        r4 = r0.this$0;	 Catch:{ Throwable -> 0x007c }
        r11 = context;	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        r12 = 8;
        r13 = 1762713527; // 0x6910dfb7 float:1.0946361E25 double:8.70896197E-315;
        r4.read(r11, r7, r12, r13);	 Catch:{ IOException -> 0x02aa }
        r17 = r35 - r37;
        r7 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r17;
        if (r0 <= r7) goto L_0x0288;
    L_0x0286:
        r17 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x0288:
        r0 = r32;
        r4 = r0.this$0;
        r7 = 1389572047; // 0x52d32fcf float:4.53520097E11 double:6.86539811E-315;
        r0 = r34;
        r1 = r37;
        r2 = r17;
        r4.read(r0, r1, r2, r7);	 Catch:{ IOException -> 0x02aa }
        r0 = r37;
        r1 = r17;
        r0 = r0 + r1;
        r37 = r0;
        r16 = r16 + 1;
        r17 = r27;
        goto L_0x0119;
    L_0x02a6:
        r30 = move-exception;
    L_0x02a7:
        monitor-exit(r3);	 Catch:{ Throwable -> 0x007c }
        r7 = 1;
        return r7;
    L_0x02aa:
        r31 = move-exception;
        monitor-exit(r3);	 Catch:{ Throwable -> 0x007c }
        r7 = 0;
        return r7;
    L_0x02ae:
        r27 = r26;
        goto L_0x020d;
    L_0x02b3:
        goto L_0x0203;
        */
        throw new UnsupportedOperationException("Method not decompiled: Properties.load(int, byte[], int, boolean, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] load(int r30) {
        /*
        r29 = this;
        r0 = r29;
        r2 = r0.this$0;
        monitor-enter(r2);
        r0 = r29;
        r3 = r0.data;
        r6 = -16745; // 0xffffffffffffbe97 float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x01b2 }
        r7 = r30 * 6;
        r7 = r7 + 6;
        r8 = (long) r7;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x001b;
    L_0x0018:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        r11 = 0;
        return r11;
    L_0x001b:
        r0 = r29;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0097 }
        r7 = r30 * 6;
        r4 = (long) r7;	 Catch:{ Throwable -> 0x0097 }
        r3.get(r4);	 Catch:{ IOException -> 0x01b2 }
        r0 = r29;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0097 }
        r12 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 0;
        r13 = 6;
        r14 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r12, r6, r13, r14);	 Catch:{ IOException -> 0x01b2 }
        r12 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 2;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r12 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 1;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 201201915; // 0xbfe18fb float:9.787483E-32 double:9.9406954E-316;
        r7 = r10 & r6;
        r7 = r7 << 8;
        r12 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 0;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = -289892632; // 0xffffffffeeb896e8 float:-2.8563838E28 double:NaN;
        r16 = r10 & r6;
        r16 = r16 << 16;
        r0 = r16;
        r7 = r7 + r0;
        r7 = r15 + r7;
        r12 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 3;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r16 = r15 << 16;
        r12 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 4;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 1694882709; // 0x6505db95 float:3.950783E22 double:8.373833202E-315;
        r17 = r10 & r6;
        r17 = r17 << 8;
        r0 = r16;
        r1 = r17;
        r0 = r0 + r1;
        r16 = r0;
        r12 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 5;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = -1741676430; // 0xffffffff98302072 float:-2.2763848E-24 double:NaN;
        r17 = r10 & r6;
        r18 = r16 + r17;
        if (r7 < 0) goto L_0x0094;
    L_0x0085:
        r0 = r29;
        r0 = r0.source;	 Catch:{ Throwable -> 0x0097 }
        r16 = r0;
        r6 = -1619249541; // 0xffffffff9f7c367b float:-5.340814E-20 double:NaN;
        r16 = r6 * r16;
        r0 = r16;
        if (r7 <= r0) goto L_0x009a;
    L_0x0094:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        r11 = 0;
        return r11;
    L_0x0097:
        r19 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        throw r19;
    L_0x009a:
        if (r18 <= 0) goto L_0x00b2;
    L_0x009c:
        r0 = r18;
        r4 = (long) r0;
        r0 = r29;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0097 }
        r6 = -3633; // 0xfffffffffffff1cf float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x01b2 }
        r20 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r20;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x00b5;
    L_0x00b2:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        r11 = 0;
        return r11;
    L_0x00b5:
        r12 = new byte[r7];	 Catch:{ Throwable -> 0x0097 }
        r16 = 0;
        r17 = 0;
    L_0x00bb:
        r0 = r16;
        if (r0 >= r7) goto L_0x01b0;
    L_0x00bf:
        if (r18 != 0) goto L_0x00c4;
    L_0x00c1:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        r11 = 0;
        return r11;
    L_0x00c4:
        r0 = r29;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0097 }
        r0 = r18;
        r0 = r0 * 520;
        r18 = r0;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x0097 }
        r3.get(r4);	 Catch:{ IOException -> 0x01b2 }
        r18 = r7 - r16;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r18;
        if (r0 <= r6) goto L_0x01b6;
    L_0x00da:
        r18 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x00dc:
        r0 = r29;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0097 }
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r23 = r18 + 8;
        r6 = 0;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r0 = r22;
        r1 = r23;
        r3.get(r0, r6, r1, r13);	 Catch:{ IOException -> 0x01b2 }
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 0;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 1900709624; // 0x714a86f8 float:1.0028662E30 double:9.39075328E-315;
        r23 = r10 & r6;
        r23 = r23 << 8;
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 1;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 1172578931; // 0x45e42273 float:7300.306 double:5.79330967E-315;
        r24 = r10 & r6;
        r0 = r23;
        r1 = r24;
        r0 = r0 + r1;
        r23 = r0;
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 3;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 2;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = -279192933; // 0xffffffffef5bda9b float:-6.8041495E28 double:NaN;
        r24 = r10 & r6;
        r24 = r24 << 8;
        r25 = r15 + r24;
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 6;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = -1768626408; // 0xffffffff9694e718 float:-2.405653E-25 double:NaN;
        r24 = r10 & r6;
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 4;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r26 = r15 << 16;
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 5;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 1298714854; // 0x4d68d0e6 float:2.4412528E8 double:6.41650393E-315;
        r27 = r10 & r6;
        r27 = r27 << 8;
        r0 = r26;
        r1 = r27;
        r0 = r0 + r1;
        r26 = r0;
        r0 = r24;
        r1 = r26;
        r0 = r0 + r1;
        r24 = r0;
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r6 = 7;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0097 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r0 = r23;
        r1 = r30;
        if (r0 != r1) goto L_0x0176;
    L_0x0161:
        r0 = r17;
        r1 = r25;
        if (r0 != r1) goto L_0x0176;
    L_0x0167:
        r0 = r29;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0097 }
        r23 = r0;
        r6 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r23 = r6 * r23;
        r0 = r23;
        if (r0 == r15) goto L_0x0179;
    L_0x0176:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        r11 = 0;
        return r11;
    L_0x0179:
        if (r24 < 0) goto L_0x0191;
    L_0x017b:
        r0 = r24;
        r4 = (long) r0;
        r0 = r29;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0097 }
        r6 = -6130; // 0xffffffffffffe80e float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x01b2 }
        r20 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r20;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x0194;
    L_0x0191:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        r11 = 0;
        return r11;
    L_0x0194:
        r23 = 0;
    L_0x0196:
        r0 = r23;
        r1 = r18;
        if (r0 >= r1) goto L_0x01a9;
    L_0x019c:
        r22 = context;	 Catch:{ Throwable -> 0x0097 }
        r26 = r23 + 8;
        r10 = r22[r26];	 Catch:{ Throwable -> 0x0097 }
        r12[r16] = r10;	 Catch:{ Throwable -> 0x0097 }
        r23 = r23 + 1;
        r16 = r16 + 1;
        goto L_0x0196;
    L_0x01a9:
        r17 = r17 + 1;
        r18 = r24;
        goto L_0x00bb;
    L_0x01b0:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        return r12;
    L_0x01b2:
        r28 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0097 }
        r11 = 0;
        return r11;
    L_0x01b6:
        goto L_0x00dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: Properties.load(int):byte[]");
    }

    public boolean open(int i, byte[] bArr, int i2) {
        boolean $z1;
        synchronized (this.this$0) {
            if (i2 >= 0) {
                if (i2 <= this.source * 474804791) {
                    boolean $z0 = load(i, bArr, i2, true, 537618701);
                    $z1 = $z0;
                    if (!$z0) {
                        $z1 = load(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return $z1;
    }

    public boolean parse(int i, byte[] bArr, int i2) {
        boolean $z1;
        synchronized (this.this$0) {
            if (i2 >= 0) {
                if (i2 <= this.source * 890725105) {
                    boolean $z0 = load(i, bArr, i2, true, 537618701);
                    $z1 = $z0;
                    if (!$z0) {
                        $z1 = load(i, bArr, i2, false, 537618701);
                    }
                }
            }
            throw new IllegalArgumentException();
        }
        return $z1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean parse(int r27, byte[] r28, int r29, boolean r30) {
        /*
        r26 = this;
        r0 = r26;
        r2 = r0.this$0;
        monitor-enter(r2);
        if (r30 == 0) goto L_0x0079;
    L_0x0007:
        r0 = r26;
        r3 = r0.data;
        r6 = -31605; // 0xffffffffffff848b float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x026e }
        r7 = r27 * 6;
        r7 = r7 + 6;
        r8 = (long) r7;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x001d;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        return r6;
    L_0x001d:
        r0 = r26;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0076 }
        r7 = r27 * 6;
        r4 = (long) r7;	 Catch:{ Throwable -> 0x0076 }
        r3.get(r4);	 Catch:{ IOException -> 0x026e }
        r0 = r26;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        r12 = 6;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r11, r6, r12, r13);	 Catch:{ IOException -> 0x026e }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 5;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 115687856; // 0x6e541b0 float:8.6236745E-35 double:5.71573953E-316;
        r7 = r10 & r6;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 3;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r15 = r14 << 16;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 4;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = -401180959; // 0xffffffffe81676e1 float:-2.8421916E24 double:NaN;
        r16 = r10 & r6;
        r16 = r16 << 8;
        r0 = r16;
        r15 = r15 + r0;
        r16 = r7 + r15;
        if (r16 <= 0) goto L_0x0073;
    L_0x005d:
        r0 = r16;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x0076 }
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0076 }
        r6 = -657; // 0xfffffffffffffd6f float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x026e }
        r17 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r17;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x0094;
    L_0x0073:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        return r6;
    L_0x0076:
        r19 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0076 }
        throw r19;
    L_0x0079:
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0076 }
        r6 = -30905; // 0xffffffffffff8747 float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x026e }
        r17 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r0 = r17;
        r4 = r4 + r0;
        r17 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r17;
        r4 = r4 / r0;
        r0 = (int) r4;	 Catch:{ Throwable -> 0x0076 }
        r16 = r0;
        if (r16 != 0) goto L_0x0094;
    L_0x0092:
        r16 = 1;
    L_0x0094:
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r7 = r29 >> 16;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r7 = r29 >> 8;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0076 }
        r6 = 1;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r0 = r29;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 2;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r7 = r16 >> 16;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0076 }
        r6 = 3;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r7 = r16 >> 8;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0076 }
        r6 = 4;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r0 = r16;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 5;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r0 = r26;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0076 }
        r7 = r27 * 6;
        r4 = (long) r7;	 Catch:{ Throwable -> 0x0076 }
        r3.get(r4);	 Catch:{ IOException -> 0x026e }
        r0 = r26;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        r12 = 6;
        r13 = 107252025; // 0x6648939 float:4.298285E-35 double:5.2989541E-316;
        r3.read(r11, r6, r12, r13);	 Catch:{ IOException -> 0x026e }
        r15 = 0;
        r7 = 0;
    L_0x00de:
        r0 = r29;
        if (r7 >= r0) goto L_0x026b;
    L_0x00e2:
        r20 = 0;
        if (r30 == 0) goto L_0x01a3;
    L_0x00e6:
        r0 = r26;
        r3 = r0.this$0;
        r0 = r16;
        r0 = r0 * 520;
        r21 = r0;
        r4 = (long) r0;
        r3.get(r4);	 Catch:{ IOException -> 0x026e }
        r0 = r26;
        r3 = r0.this$0;
        r11 = context;
        r6 = 0;
        r12 = 8;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r11, r6, r12, r13);	 Catch:{ EOFException -> 0x026a }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 402455233; // 0x17fcfac1 float:1.63484175E-24 double:1.988393046E-315;
        r21 = r10 & r6;
        r21 = r21 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 1;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r21 = r14 + r21;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 2;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 854832554; // 0x32f3b5aa float:2.8371534E-8 double:4.22343398E-315;
        r20 = r10 & r6;
        r20 = r20 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 3;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = -322208223; // 0xffffffffeccb7e21 float:-1.9680605E27 double:NaN;
        r22 = r10 & r6;
        r0 = r22;
        r1 = r20;
        r0 = r0 + r1;
        r22 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 5;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r20 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 4;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r23 = r14 << 16;
        r0 = r20;
        r1 = r23;
        r0 = r0 + r1;
        r20 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 6;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r0 = r20;
        r0 = r0 + r14;
        r20 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 7;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0076 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r0 = r27;
        r1 = r21;
        if (r0 != r1) goto L_0x0185;
    L_0x0171:
        r0 = r22;
        if (r15 != r0) goto L_0x0185;
    L_0x0175:
        r0 = r26;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0076 }
        r21 = r0;
        r6 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r0 = r21;
        r0 = r0 * r6;
        r21 = r0;
        if (r14 == r0) goto L_0x0188;
    L_0x0185:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        return r6;
    L_0x0188:
        if (r20 < 0) goto L_0x01a0;
    L_0x018a:
        r0 = r20;
        r4 = (long) r0;
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0076 }
        r6 = -31276; // 0xffffffffffff85d4 float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x026e }
        r17 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r17;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x01a3;
    L_0x01a0:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        return r6;
    L_0x01a3:
        if (r20 != 0) goto L_0x0277;
    L_0x01a5:
        r30 = 0;
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0076 }
        r6 = -13501; // 0xffffffffffffcb43 float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x026e }
        r17 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r0 = r17;
        r4 = r4 + r0;
        r17 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r17;
        r4 = r4 / r0;
        r0 = (int) r4;	 Catch:{ Throwable -> 0x0076 }
        r20 = r0;
        if (r20 != 0) goto L_0x01c2;
    L_0x01c0:
        r20 = r20 + 1;
    L_0x01c2:
        r0 = r16;
        r1 = r20;
        if (r0 != r1) goto L_0x0277;
    L_0x01c8:
        r20 = r20 + 1;
        r30 = 0;
    L_0x01cc:
        r21 = r29 - r7;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r21;
        if (r0 > r6) goto L_0x0272;
    L_0x01d4:
        r21 = 0;
    L_0x01d6:
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r20 = r27 >> 8;
        r0 = r20;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r0 = r27;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 1;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r20 = r15 >> 8;
        r0 = r20;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 2;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r10 = (byte) r15;	 Catch:{ Throwable -> 0x0076 }
        r6 = 3;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r20 = r21 >> 16;
        r0 = r20;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 4;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r20 = r21 >> 8;
        r0 = r20;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 5;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r0 = r21;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 6;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r0 = r26;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0076 }
        r20 = r0;
        r6 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r0 = r20;
        r0 = r0 * r6;
        r20 = r0;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 7;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0076 }
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0076 }
        r6 = 1722969497; // 0x66b26d99 float:4.2130148E23 double:8.512600373E-315;
        r0 = r16;
        r0 = r0 * r6;
        r16 = r0;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x0076 }
        r3.get(r4);	 Catch:{ IOException -> 0x026e }
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0076 }
        r11 = context;	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        r12 = 8;
        r13 = 1650002675; // 0x62590af3 float:1.0009331E21 double:8.152096373E-315;
        r3.read(r11, r6, r12, r13);	 Catch:{ IOException -> 0x026e }
        r16 = r29 - r7;
        r6 = 1386434939; // 0x52a3517b float:3.50723342E11 double:6.849898736E-315;
        r0 = r16;
        if (r0 <= r6) goto L_0x0252;
    L_0x0250:
        r16 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x0252:
        r0 = r26;
        r3 = r0.this$0;
        r6 = 1978023000; // 0x75e63c58 float:5.837169E32 double:9.77273211E-315;
        r0 = r28;
        r1 = r16;
        r3.read(r0, r7, r1, r6);	 Catch:{ IOException -> 0x026e }
        r0 = r16;
        r7 = r7 + r0;
        r15 = r15 + 1;
        r16 = r21;
        goto L_0x00de;
    L_0x026a:
        r24 = move-exception;
    L_0x026b:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0076 }
        r6 = 1;
        return r6;
    L_0x026e:
        r25 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0076 }
        r6 = 0;
        return r6;
    L_0x0272:
        r21 = r20;
        goto L_0x01d6;
    L_0x0277:
        goto L_0x01cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: Properties.parse(int, byte[], int, boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] parse(int r30) {
        /*
        r29 = this;
        r0 = r29;
        r2 = r0.this$0;
        monitor-enter(r2);
        r0 = r29;
        r3 = r0.data;
        r6 = -25300; // 0xffffffffffff9d2c float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x01ab }
        r7 = r30 * 6;
        r7 = r7 + 6;
        r8 = (long) r7;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x001b;
    L_0x0018:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        r11 = 0;
        return r11;
    L_0x001b:
        r0 = r29;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0096 }
        r7 = r30 * 6;
        r4 = (long) r7;	 Catch:{ Throwable -> 0x0096 }
        r3.get(r4);	 Catch:{ IOException -> 0x01ab }
        r0 = r29;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0096 }
        r12 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 0;
        r13 = 6;
        r14 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r12, r6, r13, r14);	 Catch:{ IOException -> 0x01ab }
        r12 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 2;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r12 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 1;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 1557147977; // 0x5cd03149 float:4.68807878E17 double:7.69333321E-315;
        r7 = r10 & r6;
        r7 = r7 << 8;
        r12 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 0;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 366936245; // 0x15df00b5 float:9.00701E-26 double:1.81290593E-315;
        r16 = r10 & r6;
        r16 = r16 << 16;
        r0 = r16;
        r7 = r7 + r0;
        r7 = r15 + r7;
        r12 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 3;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r16 = r15 << 16;
        r12 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 4;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r17 = r15 << 8;
        r0 = r16;
        r1 = r17;
        r0 = r0 + r1;
        r16 = r0;
        r12 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 5;
        r10 = r12[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = -742890080; // 0xffffffffd3b865a0 float:-1.58395793E12 double:NaN;
        r17 = r10 & r6;
        r18 = r16 + r17;
        if (r7 < 0) goto L_0x0093;
    L_0x0084:
        r0 = r29;
        r0 = r0.source;	 Catch:{ Throwable -> 0x0096 }
        r16 = r0;
        r6 = -767129588; // 0xffffffffd246880c float:-2.13171503E11 double:NaN;
        r16 = r6 * r16;
        r0 = r16;
        if (r7 <= r0) goto L_0x0099;
    L_0x0093:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        r11 = 0;
        return r11;
    L_0x0096:
        r19 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        throw r19;
    L_0x0099:
        if (r18 <= 0) goto L_0x00b1;
    L_0x009b:
        r0 = r18;
        r4 = (long) r0;
        r0 = r29;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0096 }
        r6 = -20927; // 0xffffffffffffae41 float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x01ab }
        r20 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r20;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x00b4;
    L_0x00b1:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        r11 = 0;
        return r11;
    L_0x00b4:
        r12 = new byte[r7];	 Catch:{ Throwable -> 0x0096 }
        r16 = 0;
        r17 = 0;
    L_0x00ba:
        r0 = r16;
        if (r0 >= r7) goto L_0x01a9;
    L_0x00be:
        if (r18 != 0) goto L_0x00c3;
    L_0x00c0:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        r11 = 0;
        return r11;
    L_0x00c3:
        r0 = r29;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0096 }
        r0 = r18;
        r0 = r0 * 520;
        r18 = r0;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x0096 }
        r3.get(r4);	 Catch:{ IOException -> 0x01ab }
        r18 = r7 - r16;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r18;
        if (r0 <= r6) goto L_0x01af;
    L_0x00d9:
        r18 = -1276555387; // 0xffffffffb3e94f85 float:-1.08643725E-7 double:NaN;
    L_0x00dc:
        r0 = r29;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0096 }
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r23 = r18 + 8;
        r6 = 0;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r0 = r22;
        r1 = r23;
        r3.get(r0, r6, r1, r13);	 Catch:{ IOException -> 0x01ab }
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 0;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r23 = r15 << 8;
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 1;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = -679491972; // 0xffffffffd77fc67c float:-2.81227949E14 double:NaN;
        r24 = r10 & r6;
        r0 = r23;
        r1 = r24;
        r0 = r0 + r1;
        r23 = r0;
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 3;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 2;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = -1022631952; // 0xffffffffc30bdff0 float:-139.87476 double:NaN;
        r24 = r10 & r6;
        r24 = r24 << 8;
        r25 = r15 + r24;
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 6;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 4;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 1431472801; // 0x55528aa1 float:1.4468303E13 double:7.07241534E-315;
        r24 = r10 & r6;
        r24 = r24 << 16;
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 5;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r26 = r10 & r6;
        r27 = r26 << 8;
        r0 = r24;
        r1 = r27;
        r0 = r0 + r1;
        r24 = r0;
        r24 = r15 + r24;
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r6 = 7;
        r10 = r22[r6];	 Catch:{ Throwable -> 0x0096 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r10 & r6;
        r0 = r23;
        r1 = r30;
        if (r0 != r1) goto L_0x016f;
    L_0x015a:
        r0 = r17;
        r1 = r25;
        if (r0 != r1) goto L_0x016f;
    L_0x0160:
        r0 = r29;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0096 }
        r23 = r0;
        r6 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r23 = r6 * r23;
        r0 = r23;
        if (r0 == r15) goto L_0x0172;
    L_0x016f:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        r11 = 0;
        return r11;
    L_0x0172:
        if (r24 < 0) goto L_0x018a;
    L_0x0174:
        r0 = r24;
        r4 = (long) r0;
        r0 = r29;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0096 }
        r6 = -13752; // 0xffffffffffffca48 float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x01ab }
        r20 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r20;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x018d;
    L_0x018a:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        r11 = 0;
        return r11;
    L_0x018d:
        r23 = 0;
    L_0x018f:
        r0 = r23;
        r1 = r18;
        if (r0 >= r1) goto L_0x01a2;
    L_0x0195:
        r22 = context;	 Catch:{ Throwable -> 0x0096 }
        r27 = r23 + 8;
        r10 = r22[r27];	 Catch:{ Throwable -> 0x0096 }
        r12[r16] = r10;	 Catch:{ Throwable -> 0x0096 }
        r23 = r23 + 1;
        r16 = r16 + 1;
        goto L_0x018f;
    L_0x01a2:
        r17 = r17 + 1;
        r18 = r24;
        goto L_0x00ba;
    L_0x01a9:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        return r12;
    L_0x01ab:
        r28 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0096 }
        r11 = 0;
        return r11;
    L_0x01af:
        goto L_0x00dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: Properties.parse(int):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] read(int r34, int r35) {
        /*
        r33 = this;
        r0 = r33;
        r2 = r0.this$0;	 Catch:{ RuntimeException -> 0x00a0 }
        monitor-enter(r2);	 Catch:{ RuntimeException -> 0x00a0 }
        r0 = r33;
        r3 = r0.data;
        r6 = -18803; // 0xffffffffffffb68d float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x01d6 }
        r35 = r34 * 6;
        r35 = r35 + 6;
        r0 = r35;
        r7 = (long) r0;
        r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x001d;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        r10 = 0;
        return r10;
    L_0x001d:
        r0 = r33;
        r3 = r0.data;	 Catch:{ Throwable -> 0x009d }
        r35 = r34 * 6;
        r0 = r35;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x009d }
        r3.get(r4);	 Catch:{ IOException -> 0x01d6 }
        r0 = r33;
        r3 = r0.data;	 Catch:{ Throwable -> 0x009d }
        r11 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 0;
        r12 = 6;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r11, r6, r12, r13);	 Catch:{ IOException -> 0x01d6 }
        r11 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 2;
        r9 = r11[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r11 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 1;
        r9 = r11[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r9 & r6;
        r35 = r15 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 0;
        r9 = r11[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r9 & r6;
        r16 = r15 << 16;
        r0 = r35;
        r1 = r16;
        r0 = r0 + r1;
        r35 = r0;
        r35 = r14 + r35;
        r11 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 3;
        r9 = r11[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r16 = r14 << 16;
        r11 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 4;
        r9 = r11[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r17 = r14 << 8;
        r0 = r16;
        r1 = r17;
        r0 = r0 + r1;
        r16 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 5;
        r9 = r11[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r18 = r16 + r14;
        if (r35 < 0) goto L_0x009a;
    L_0x0089:
        r0 = r33;
        r0 = r0.source;	 Catch:{ Throwable -> 0x009d }
        r16 = r0;
        r6 = 474804791; // 0x1c4cf237 float:6.7810993E-22 double:2.345847357E-315;
        r16 = r6 * r16;
        r0 = r35;
        r1 = r16;
        if (r0 <= r1) goto L_0x00c9;
    L_0x009a:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        r10 = 0;
        return r10;
    L_0x009d:
        r19 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        throw r19;	 Catch:{ RuntimeException -> 0x00a0 }
    L_0x00a0:
        r20 = move-exception;
        r21 = new java.lang.StringBuilder;
        r0 = r21;
        r0.<init>();
        r22 = "mr.af(";
        r0 = r21;
        r1 = r22;
        r21 = r0.append(r1);
        r6 = 41;
        r0 = r21;
        r21 = r0.append(r6);
        r0 = r21;
        r23 = r0.toString();
        r0 = r20;
        r1 = r23;
        r24 = p000.StringBuilder.append(r0, r1);
        throw r24;
    L_0x00c9:
        if (r18 <= 0) goto L_0x00e1;
    L_0x00cb:
        r0 = r18;
        r4 = (long) r0;
        r0 = r33;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x009d }
        r6 = -9605; // 0xffffffffffffda7b float:NaN double:NaN;
        r7 = r3.get(r6);	 Catch:{ IOException -> 0x01d6 }
        r25 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r25;
        r7 = r7 / r0;
        r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x00e4;
    L_0x00e1:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        r10 = 0;
        return r10;
    L_0x00e4:
        r0 = r35;
        r11 = new byte[r0];	 Catch:{ Throwable -> 0x009d }
        r16 = 0;
        r17 = 0;
    L_0x00ec:
        r0 = r16;
        r1 = r35;
        if (r0 >= r1) goto L_0x01d4;
    L_0x00f2:
        if (r18 != 0) goto L_0x00f7;
    L_0x00f4:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        r10 = 0;
        return r10;
    L_0x00f7:
        r0 = r33;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x009d }
        r0 = r18;
        r0 = r0 * 520;
        r18 = r0;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x009d }
        r3.get(r4);	 Catch:{ IOException -> 0x01d6 }
        r18 = r35 - r16;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r18;
        if (r0 <= r6) goto L_0x01da;
    L_0x010d:
        r18 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x010f:
        r0 = r33;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x009d }
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r28 = r18 + 8;
        r6 = 0;
        r12 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r0 = r27;
        r1 = r28;
        r3.get(r0, r6, r1, r12);	 Catch:{ IOException -> 0x01d6 }
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 0;
        r9 = r27[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r28 = r14 << 8;
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 1;
        r9 = r27[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r29 = r28 + r14;
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 3;
        r9 = r27[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 2;
        r9 = r27[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r9 & r6;
        r28 = r15 << 8;
        r30 = r14 + r28;
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 6;
        r9 = r27[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 4;
        r9 = r27[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r9 & r6;
        r28 = r15 << 16;
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 5;
        r9 = r27[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = r9 & r6;
        r31 = r15 << 8;
        r0 = r28;
        r1 = r31;
        r0 = r0 + r1;
        r28 = r0;
        r28 = r14 + r28;
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r6 = 7;
        r9 = r27[r6];	 Catch:{ Throwable -> 0x009d }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r9 & r6;
        r0 = r29;
        r1 = r34;
        if (r0 != r1) goto L_0x019a;
    L_0x0185:
        r0 = r17;
        r1 = r30;
        if (r0 != r1) goto L_0x019a;
    L_0x018b:
        r0 = r33;
        r0 = r0.name;	 Catch:{ Throwable -> 0x009d }
        r29 = r0;
        r6 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r29 = r6 * r29;
        r0 = r29;
        if (r0 == r14) goto L_0x019d;
    L_0x019a:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        r10 = 0;
        return r10;
    L_0x019d:
        if (r28 < 0) goto L_0x01b5;
    L_0x019f:
        r0 = r28;
        r4 = (long) r0;
        r0 = r33;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x009d }
        r6 = -6303; // 0xffffffffffffe761 float:NaN double:NaN;
        r7 = r3.get(r6);	 Catch:{ IOException -> 0x01d6 }
        r25 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r25;
        r7 = r7 / r0;
        r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x01b8;
    L_0x01b5:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        r10 = 0;
        return r10;
    L_0x01b8:
        r29 = 0;
    L_0x01ba:
        r0 = r29;
        r1 = r18;
        if (r0 >= r1) goto L_0x01cd;
    L_0x01c0:
        r27 = context;	 Catch:{ Throwable -> 0x009d }
        r31 = r29 + 8;
        r9 = r27[r31];	 Catch:{ Throwable -> 0x009d }
        r11[r16] = r9;	 Catch:{ Throwable -> 0x009d }
        r29 = r29 + 1;
        r16 = r16 + 1;
        goto L_0x01ba;
    L_0x01cd:
        r17 = r17 + 1;
        r18 = r28;
        goto L_0x00ec;
    L_0x01d4:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        return r11;
    L_0x01d6:
        r32 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x009d }
        r10 = 0;
        return r10;
    L_0x01da:
        goto L_0x010f;
        */
        throw new UnsupportedOperationException("Method not decompiled: Properties.read(int, int):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean update(int r27, byte[] r28, int r29, boolean r30) {
        /*
        r26 = this;
        r0 = r26;
        r2 = r0.this$0;
        monitor-enter(r2);
        if (r30 == 0) goto L_0x0077;
    L_0x0007:
        r0 = r26;
        r3 = r0.data;
        r6 = -30425; // 0xffffffffffff8927 float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x026d }
        r7 = r27 * 6;
        r7 = r7 + 6;
        r8 = (long) r7;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x001d;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x001d:
        r0 = r26;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0074 }
        r7 = r27 * 6;
        r4 = (long) r7;	 Catch:{ Throwable -> 0x0074 }
        r3.get(r4);	 Catch:{ IOException -> 0x026d }
        r0 = r26;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r12 = 6;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r11, r6, r12, r13);	 Catch:{ IOException -> 0x026d }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 5;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 193385451; // 0xb86d3eb float:5.193378E-32 double:9.55451077E-316;
        r7 = r10 & r6;
        r7 = r7 << 16;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 4;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = -1582815528; // 0xffffffffa1a826d8 float:-1.1394405E-18 double:NaN;
        r15 = r10 & r6;
        r15 = r15 << 8;
        r7 = r7 + r15;
        r16 = r14 + r7;
        if (r16 <= 0) goto L_0x0071;
    L_0x005b:
        r0 = r16;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x0074 }
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 395; // 0x18b float:5.54E-43 double:1.95E-321;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x026d }
        r17 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r17;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x0092;
    L_0x0071:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x0074:
        r19 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        throw r19;
    L_0x0077:
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = -16112; // 0xffffffffffffc110 float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x026d }
        r17 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r0 = r17;
        r4 = r4 + r0;
        r17 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r17;
        r4 = r4 / r0;
        r0 = (int) r4;	 Catch:{ Throwable -> 0x0074 }
        r16 = r0;
        if (r16 != 0) goto L_0x0092;
    L_0x0090:
        r16 = 1;
    L_0x0092:
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r7 = r29 >> 16;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r7 = r29 >> 8;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0074 }
        r6 = 1;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r29;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 2;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r7 = r16 >> 16;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r7 = r16 >> 8;
        r10 = (byte) r7;	 Catch:{ Throwable -> 0x0074 }
        r6 = 4;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r16;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 5;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r0 = r26;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0074 }
        r7 = r27 * 6;
        r4 = (long) r7;	 Catch:{ Throwable -> 0x0074 }
        r3.get(r4);	 Catch:{ IOException -> 0x026d }
        r0 = r26;
        r3 = r0.data;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r12 = 6;
        r13 = 361159088; // 0x1586d9b0 float:5.446562E-26 double:1.78436298E-315;
        r3.read(r11, r6, r12, r13);	 Catch:{ IOException -> 0x026d }
        r15 = 0;
        r7 = 0;
    L_0x00dc:
        r0 = r29;
        if (r7 >= r0) goto L_0x026a;
    L_0x00e0:
        r20 = 0;
        if (r30 == 0) goto L_0x01a3;
    L_0x00e4:
        r0 = r26;
        r3 = r0.this$0;
        r6 = 953529225; // 0x38d5b389 float:1.01900725E-4 double:4.711060324E-315;
        r21 = r6 * r16;
        r0 = r21;
        r4 = (long) r0;
        r3.get(r4);	 Catch:{ IOException -> 0x026d }
        r0 = r26;
        r3 = r0.this$0;
        r11 = context;
        r6 = 0;
        r12 = 8;
        r13 = -606087449; // 0xffffffffdbdfd6e7 float:-1.26010415E17 double:NaN;
        r3.get(r11, r6, r12, r13);	 Catch:{ EOFException -> 0x0269 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r21 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 1;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r21 = r14 + r21;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 2;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = -1853383321; // 0xffffffff91879d67 float:-2.139625E-28 double:NaN;
        r22 = r10 & r6;
        r22 = r22 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r22 = r14 + r22;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 5;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r20 = r14 << 8;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 4;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r14 = r10 & r6;
        r23 = r14 << 16;
        r0 = r20;
        r1 = r23;
        r0 = r0 + r1;
        r20 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 6;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = -517750281; // 0xffffffffe123c1f7 float:-1.8879975E20 double:NaN;
        r23 = r10 & r6;
        r0 = r20;
        r1 = r23;
        r0 = r0 + r1;
        r20 = r0;
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 7;
        r10 = r11[r6];	 Catch:{ Throwable -> 0x0074 }
        r6 = -1827686815; // 0xffffffff930fb661 float:-1.8139057E-27 double:NaN;
        r23 = r10 & r6;
        r0 = r27;
        r1 = r21;
        if (r0 != r1) goto L_0x0185;
    L_0x016d:
        r0 = r22;
        if (r15 != r0) goto L_0x0185;
    L_0x0171:
        r0 = r26;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0074 }
        r21 = r0;
        r6 = 282588161; // 0x10d7f401 float:8.5178495E-29 double:1.396171023E-315;
        r0 = r21;
        r0 = r0 * r6;
        r21 = r0;
        r0 = r23;
        r1 = r21;
        if (r0 == r1) goto L_0x0188;
    L_0x0185:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x0188:
        if (r20 < 0) goto L_0x01a0;
    L_0x018a:
        r0 = r20;
        r4 = (long) r0;
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = -19063; // 0xffffffffffffb589 float:NaN double:NaN;
        r8 = r3.get(r6);	 Catch:{ IOException -> 0x026d }
        r17 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r17;
        r8 = r8 / r0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x01a3;
    L_0x01a0:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x01a3:
        if (r20 != 0) goto L_0x0276;
    L_0x01a5:
        r30 = 0;
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = -2284; // 0xfffffffffffff714 float:NaN double:NaN;
        r4 = r3.get(r6);	 Catch:{ IOException -> 0x026d }
        r17 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r0 = r17;
        r4 = r4 + r0;
        r17 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r0 = r17;
        r4 = r4 / r0;
        r0 = (int) r4;	 Catch:{ Throwable -> 0x0074 }
        r20 = r0;
        if (r20 != 0) goto L_0x01c2;
    L_0x01c0:
        r20 = r20 + 1;
    L_0x01c2:
        r0 = r16;
        r1 = r20;
        if (r0 != r1) goto L_0x0276;
    L_0x01c8:
        r20 = r20 + 1;
        r30 = 0;
    L_0x01cc:
        r21 = r29 - r7;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r21;
        if (r0 > r6) goto L_0x0271;
    L_0x01d4:
        r21 = 0;
    L_0x01d6:
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r22 = r27 >> 8;
        r0 = r22;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r27;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 1;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r22 = r15 >> 8;
        r0 = r22;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 2;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r10 = (byte) r15;	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r22 = r21 >> 16;
        r0 = r22;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 4;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r22 = r21 >> 8;
        r0 = r22;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 5;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r21;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 6;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r0 = r26;
        r0 = r0.name;	 Catch:{ Throwable -> 0x0074 }
        r22 = r0;
        r6 = 1451289142; // 0x5680ea36 float:7.0871708E13 double:7.17032107E-315;
        r0 = r22;
        r0 = r0 * r6;
        r22 = r0;
        r10 = (byte) r0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 7;
        r11[r6] = r10;	 Catch:{ Throwable -> 0x0074 }
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r6 = 1687526883; // 0x64959de3 float:2.2079534E22 double:8.337490593E-315;
        r0 = r16;
        r0 = r0 * r6;
        r16 = r0;
        r4 = (long) r0;	 Catch:{ Throwable -> 0x0074 }
        r3.get(r4);	 Catch:{ IOException -> 0x026d }
        r0 = r26;
        r3 = r0.this$0;	 Catch:{ Throwable -> 0x0074 }
        r11 = context;	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        r12 = 8;
        r13 = 727167935; // 0x2b57b3bf float:7.663279E-13 double:3.592686954E-315;
        r3.read(r11, r6, r12, r13);	 Catch:{ IOException -> 0x026d }
        r16 = r29 - r7;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r16;
        if (r0 <= r6) goto L_0x0251;
    L_0x024f:
        r16 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
    L_0x0251:
        r0 = r26;
        r3 = r0.this$0;
        r6 = -325395095; // 0xffffffffec9add69 float:-1.4977612E27 double:NaN;
        r0 = r28;
        r1 = r16;
        r3.read(r0, r7, r1, r6);	 Catch:{ IOException -> 0x026d }
        r0 = r16;
        r7 = r7 + r0;
        r15 = r15 + 1;
        r16 = r21;
        goto L_0x00dc;
    L_0x0269:
        r24 = move-exception;
    L_0x026a:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 1;
        return r6;
    L_0x026d:
        r25 = move-exception;
        monitor-exit(r2);	 Catch:{ Throwable -> 0x0074 }
        r6 = 0;
        return r6;
    L_0x0271:
        r21 = r20;
        goto L_0x01d6;
    L_0x0276:
        goto L_0x01cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: Properties.update(int, byte[], int, boolean):boolean");
    }
}
