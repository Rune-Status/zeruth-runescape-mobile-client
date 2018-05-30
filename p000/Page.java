package p000;

/* compiled from: gy */
public class Page {
    static final int TIMEOUT = 2000;
    static final Page content = new Page(7);
    static final Page id = new Page(6);
    static int f222n;
    static final Page owner = new Page(5);
    static final Page parent = new Page(1);
    static final Page path = new Page(2);
    static final Page root = new Page(3);
    static int size;
    static final Page tags = new Page(0);
    static final Page title = new Page(4);
    final int base;

    Page(int $i0) {
        try {
            this.base = -1666469861 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gy.<init>(" + ')');
        }
    }

    static void add(int i) {
        ZStream.index = null;
        Level.index = null;
        TCharArrayList.index = null;
        TFloatArrayList.buffer = null;
        DatabaseUtil.buffer = null;
        Level.data = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void read(int r27) {
        /*
        r8 = p000.client.buf;
        r9 = r8.get();	 Catch:{ RuntimeException -> 0x01b7 }
        r11 = r9;
        r11 = (p000.BigInteger) r11;	 Catch:{ RuntimeException -> 0x01b7 }
        r10 = r11;
    L_0x000a:
        if (r10 == 0) goto L_0x0291;
    L_0x000c:
        r0 = r10.size;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -121157141; // 0xfffffffff8c749eb float:-3.2336447E34 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        if (r27 <= 0) goto L_0x0028;
    L_0x001a:
        r0 = r10.size;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = 1558812355; // 0x5ce996c3 float:5.25995471E17 double:7.70155633E-315;
        r0 = r27;
        r0 = r0 - r12;
        r27 = r0;
        r10.size = r0;	 Catch:{ RuntimeException -> 0x01b7 }
    L_0x0028:
        r0 = r10.size;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -121157141; // 0xfffffffff8c749eb float:-3.2336447E34 double:NaN;
        r27 = r12 * r27;
        if (r27 != 0) goto L_0x007c;
    L_0x0033:
        r0 = r10.head;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1558467153; // 0xffffffffa31badaf float:-8.439346E-18 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        if (r27 < 0) goto L_0x01e0;
    L_0x0041:
        r0 = r10.head;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1558467153; // 0xffffffffa31badaf float:-8.439346E-18 double:NaN;
        r27 = r12 * r27;
        r13 = r10.next;	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = 447871657; // 0x1ab1faa9 float:7.361045E-23 double:2.212779995E-315;
        r13 = r13 * r12;
        r12 = 2069831324; // 0x7b5f1e9c float:1.158503E36 double:1.02263255E-314;
        r0 = r27;
        r14 = p000.BigInteger.get(r0, r12);	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = 11;
        if (r12 != r13) goto L_0x005f;
    L_0x005d:
        r13 = 10;
    L_0x005f:
        r12 = 5;
        if (r13 < r12) goto L_0x0067;
    L_0x0062:
        r12 = 8;
        if (r13 > r12) goto L_0x0067;
    L_0x0066:
        r13 = 4;
    L_0x0067:
        r12 = -116; // 0xffffffffffffff8c float:NaN double:NaN;
        r15 = r14.get(r13, r12);	 Catch:{ RuntimeException -> 0x01b7 }
        if (r15 != 0) goto L_0x01e0;
    L_0x006f:
        r8 = p000.client.buf;
        r9 = r8.next();	 Catch:{ RuntimeException -> 0x01b7 }
        r16 = r9;
        r16 = (p000.BigInteger) r16;	 Catch:{ RuntimeException -> 0x01b7 }
        r10 = r16;
        goto L_0x000a;
    L_0x007c:
        r0 = r10.pos;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1684395455; // 0xffffffff9b9a2a41 float:-2.550447E-22 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        if (r27 <= 0) goto L_0x0098;
    L_0x008a:
        r0 = r10.pos;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = 645588417; // 0x267ae5c1 float:8.704755E-16 double:3.18963058E-315;
        r0 = r27;
        r0 = r0 - r12;
        r27 = r0;
        r10.pos = r0;	 Catch:{ RuntimeException -> 0x01b7 }
    L_0x0098:
        r0 = r10.pos;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1684395455; // 0xffffffff9b9a2a41 float:-2.550447E-22 double:NaN;
        r27 = r12 * r27;
        if (r27 != 0) goto L_0x006f;
    L_0x00a3:
        r0 = r10.value;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1294114749; // 0xffffffffb2dd6043 float:-2.577156E-8 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r12 = 1;
        r0 = r27;
        if (r0 < r12) goto L_0x006f;
    L_0x00b4:
        r0 = r10.length;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -401817923; // 0xffffffffe80cbebd float:-2.6585992E24 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r12 = 1;
        r0 = r27;
        if (r0 < r12) goto L_0x006f;
    L_0x00c5:
        r0 = r10.value;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1294114749; // 0xffffffffb2dd6043 float:-2.577156E-8 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r12 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0 = r27;
        if (r0 > r12) goto L_0x006f;
    L_0x00d7:
        r0 = r10.length;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -401817923; // 0xffffffffe80cbebd float:-2.6585992E24 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r12 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0 = r27;
        if (r0 > r12) goto L_0x006f;
    L_0x00e9:
        r0 = r10.buffer;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1353394405; // 0xffffffffaf54d71b float:-1.9357708E-10 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        if (r27 < 0) goto L_0x0128;
    L_0x00f7:
        r0 = r10.buffer;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1353394405; // 0xffffffffaf54d71b float:-1.9357708E-10 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r13 = r10.offset;	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = 1223376025; // 0x48eb3c99 float:481764.78 double:6.04428066E-315;
        r13 = r13 * r12;
        r12 = 1864275365; // 0x6f1e95a5 float:4.907954E28 double:9.21074412E-315;
        r0 = r27;
        r14 = p000.BigInteger.get(r0, r12);	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = 11;
        if (r13 != r12) goto L_0x0118;
    L_0x0116:
        r13 = 10;
    L_0x0118:
        r12 = 5;
        if (r13 < r12) goto L_0x0120;
    L_0x011b:
        r12 = 8;
        if (r13 > r12) goto L_0x0120;
    L_0x011f:
        r13 = 4;
    L_0x0120:
        r12 = -90;
        r15 = r14.get(r13, r12);	 Catch:{ RuntimeException -> 0x01b7 }
        if (r15 == 0) goto L_0x006f;
    L_0x0128:
        r0 = r10.data;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1783248061; // 0xffffffff95b5cb43 float:-7.342601E-26 double:NaN;
        r27 = r12 * r27;
        r13 = r10.count;	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = -1833730097; // 0xffffffff92b37fcf float:-1.1327995E-27 double:NaN;
        r13 = r12 * r13;
        r0 = r10.value;	 Catch:{ RuntimeException -> 0x01b7 }
        r17 = r0;
        r12 = -1294114749; // 0xffffffffb2dd6043 float:-2.577156E-8 double:NaN;
        r0 = r17;
        r0 = r0 * r12;
        r17 = r0;
        r0 = r10.length;	 Catch:{ RuntimeException -> 0x01b7 }
        r18 = r0;
        r12 = -401817923; // 0xffffffffe80cbebd float:-2.6585992E24 double:NaN;
        r0 = r18;
        r0 = r0 * r12;
        r18 = r0;
        r0 = r10.buffer;	 Catch:{ RuntimeException -> 0x01b7 }
        r19 = r0;
        r12 = -1353394405; // 0xffffffffaf54d71b float:-1.9357708E-10 double:NaN;
        r0 = r19;
        r0 = r0 * r12;
        r19 = r0;
        r0 = r10.buf;	 Catch:{ RuntimeException -> 0x01b7 }
        r20 = r0;
        r12 = 595582881; // 0x237fdfa1 float:1.3870933E-17 double:2.94257041E-315;
        r0 = r20;
        r0 = r0 * r12;
        r20 = r0;
        r0 = r10.offset;	 Catch:{ RuntimeException -> 0x01b7 }
        r21 = r0;
        r12 = 1223376025; // 0x48eb3c99 float:481764.78 double:6.04428066E-315;
        r21 = r12 * r21;
        r12 = 659514639; // 0x274f650f float:2.8781805E-15 double:3.25843526E-315;
        r0 = r27;
        r1 = r13;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r21;
        r7 = r12;
        p000.Point.get(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = -645588417; // 0xffffffffd9851a3f float:-4.6831287E15 double:NaN;
        r10.pos = r12;	 Catch:{ RuntimeException -> 0x01b7 }
        r0 = r10.buffer;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1353394405; // 0xffffffffaf54d71b float:-1.9357708E-10 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r13 = r10.head;	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = -1558467153; // 0xffffffffa31badaf float:-8.439346E-18 double:NaN;
        r13 = r13 * r12;
        r0 = r27;
        if (r0 != r13) goto L_0x0248;
    L_0x01a0:
        r0 = r10.head;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1558467153; // 0xffffffffa31badaf float:-8.439346E-18 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r12 = -1;
        r0 = r27;
        if (r12 != r0) goto L_0x0248;
    L_0x01b1:
        r10.iterator();	 Catch:{ RuntimeException -> 0x01b7 }
        goto L_0x006f;
    L_0x01b7:
        r22 = move-exception;
        r23 = new java.lang.StringBuilder;
        r0 = r23;
        r0.<init>();
        r24 = "gy.du(";
        r0 = r23;
        r1 = r24;
        r23 = r0.append(r1);
        r12 = 41;
        r0 = r23;
        r23 = r0.append(r12);
        r0 = r23;
        r25 = r0.toString();
        r0 = r22;
        r1 = r25;
        r26 = p000.StringBuilder.append(r0, r1);
        throw r26;
    L_0x01e0:
        r0 = r10.data;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1783248061; // 0xffffffff95b5cb43 float:-7.342601E-26 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r13 = r10.count;	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = -1833730097; // 0xffffffff92b37fcf float:-1.1327995E-27 double:NaN;
        r13 = r13 * r12;
        r0 = r10.value;	 Catch:{ RuntimeException -> 0x01b7 }
        r17 = r0;
        r12 = -1294114749; // 0xffffffffb2dd6043 float:-2.577156E-8 double:NaN;
        r0 = r17;
        r0 = r0 * r12;
        r17 = r0;
        r0 = r10.length;	 Catch:{ RuntimeException -> 0x01b7 }
        r18 = r0;
        r12 = -401817923; // 0xffffffffe80cbebd float:-2.6585992E24 double:NaN;
        r0 = r18;
        r0 = r0 * r12;
        r18 = r0;
        r0 = r10.head;	 Catch:{ RuntimeException -> 0x01b7 }
        r19 = r0;
        r12 = -1558467153; // 0xffffffffa31badaf float:-8.439346E-18 double:NaN;
        r0 = r19;
        r0 = r0 * r12;
        r19 = r0;
        r0 = r10.index;	 Catch:{ RuntimeException -> 0x01b7 }
        r20 = r0;
        r12 = 1295327399; // 0x4d3520a7 float:1.89926E8 double:6.39976768E-315;
        r0 = r20;
        r0 = r0 * r12;
        r20 = r0;
        r0 = r10.next;	 Catch:{ RuntimeException -> 0x01b7 }
        r21 = r0;
        r12 = 447871657; // 0x1ab1faa9 float:7.361045E-23 double:2.212779995E-315;
        r0 = r21;
        r0 = r0 * r12;
        r21 = r0;
        r12 = 1251211778; // 0x4a93fa02 float:4848897.0 double:6.18180755E-315;
        r0 = r27;
        r1 = r13;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r21;
        r7 = r12;
        p000.Point.get(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x01b7 }
        r10.iterator();	 Catch:{ RuntimeException -> 0x01b7 }
        goto L_0x006f;
    L_0x0248:
        r0 = r10.buffer;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = -1353394405; // 0xffffffffaf54d71b float:-1.9357708E-10 double:NaN;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r13 = r10.head;	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = -1558467153; // 0xffffffffa31badaf float:-8.439346E-18 double:NaN;
        r13 = r13 * r12;
        r0 = r27;
        if (r0 != r13) goto L_0x006f;
    L_0x025e:
        r0 = r10.index;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = 1295327399; // 0x4d3520a7 float:1.89926E8 double:6.39976768E-315;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r13 = r10.buf;	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = 595582881; // 0x237fdfa1 float:1.3870933E-17 double:2.94257041E-315;
        r13 = r12 * r13;
        r0 = r27;
        if (r0 != r13) goto L_0x006f;
    L_0x0275:
        r0 = r10.offset;	 Catch:{ RuntimeException -> 0x01b7 }
        r27 = r0;
        r12 = 1223376025; // 0x48eb3c99 float:481764.78 double:6.04428066E-315;
        r0 = r27;
        r0 = r0 * r12;
        r27 = r0;
        r13 = r10.next;	 Catch:{ RuntimeException -> 0x01b7 }
        r12 = 447871657; // 0x1ab1faa9 float:7.361045E-23 double:2.212779995E-315;
        r13 = r13 * r12;
        r0 = r27;
        if (r0 != r13) goto L_0x006f;
    L_0x028b:
        r10.iterator();	 Catch:{ RuntimeException -> 0x01b7 }
        goto L_0x006f;
    L_0x0291:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Page.read(int):void");
    }

    public static boolean toString(int i, byte b) {
        return i == 10 || i == 11 || i == 12 || i == 13 || 14 == i || i == 15 || i == 16 || 17 == i;
    }
}
