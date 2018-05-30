package p000;

/* compiled from: dx */
public class Complex {
    public static final int HINT_CONTEXT_CAR_HOME = 2;
    static final int STATE_SENSOR_ON_FLAG = 65536;
    public static final int f91x = 16;
    final int count;
    final int data;
    public final Method key;
    public final Method length;
    int next;
    int size;
    public final int this$0;
    final ByteString value;

    Complex(int $i0, Method method, Method method2, ByteString byteString) {
        try {
            this.this$0 = -1185409961 * $i0;
            this.length = method;
            this.key = method2;
            this.value = byteString;
            Long $r6 = ByteBufferList.data[-459008153 * this.this$0].get(false, -1298938706);
            if ($r6 != null) {
                this.count = 1892717677 * $r6.length;
                this.data = $r6.data * -1875663895;
                return;
            }
            this.count = 0;
            this.data = 0;
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "dx.<init>(" + ')');
        }
    }

    static final String read(int $i0, int i) {
        if ($i0 >= 100000) {
            return $i0 < 10000000 ? "<col=ffffff>" + ($i0 / 1000) + R$id.settings + "</col>" : "<col=00ff80>" + ($i0 / 1000000) + R$id.TAG + "</col>";
        } else {
            try {
                return "<col=ffff00>" + $i0 + "</col>";
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "dx.am(" + ')');
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean add(int r8, int r9) {
        /*
        r7 = this;
        r0 = p000.ByteBufferList.data;
        r1 = r7.this$0;
        r2 = -459008153; // 0xffffffffe4a41767 float:-2.4215619E22 double:NaN;
        r1 = r2 * r1;
        r3 = r0[r1];
        r4 = r3.name;
        r1 = r4.value;
        r2 = -54677256; // 0xfffffffffcbdb0f8 float:-7.8794677E36 double:NaN;
        r1 = r2 * r1;
        switch(r1) {
            case 0: goto L_0x003f;
            case 1: goto L_0x0026;
            case 2: goto L_0x0059;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x0018;
    L_0x0018:
        r5 = r3.content;
        r8 = r5.value;
        r2 = -101861059; // 0xfffffffff9edb93d float:-1.5429143E35 double:NaN;
        r8 = r8 * r2;
        switch(r8) {
            case 0: goto L_0x007d;
            case 1: goto L_0x00bc;
            case 2: goto L_0x0098;
            default: goto L_0x0023;
        };
    L_0x0023:
        goto L_0x0024;
    L_0x0024:
        r2 = 1;
        return r2;
    L_0x0026:
        r1 = r7.next;
        r2 = -948961453; // 0xffffffffc76fff53 float:-61439.324 double:NaN;
        r1 = r1 * r2;
        if (r8 < r1) goto L_0x00d3;
    L_0x002e:
        r1 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r1 = r1 * r2;
        r6 = r7.next;
        r2 = 1262861037; // 0x4b45baed float:1.2958445E7 double:6.23936254E-315;
        r6 = r6 * r2;
        r1 = r1 + r6;
        if (r8 < r1) goto L_0x0018;
    L_0x003d:
        r2 = 0;
        return r2;
    L_0x003f:
        r1 = r7.next;
        r2 = -1102700350; // 0xffffffffbe4620c2 float:-0.19348434 double:NaN;
        r1 = r2 * r1;
        r6 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r6 = r6 * r2;
        r1 = r1 - r6;
        if (r8 <= r1) goto L_0x00d3;
    L_0x004f:
        r1 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r1 = r1 * r2;
        if (r8 <= r1) goto L_0x0018;
    L_0x0057:
        r2 = 0;
        return r2;
    L_0x0059:
        r1 = r7.next;
        r2 = -1364419107; // 0xffffffffaeac9ddd float:-7.8496966E-11 double:NaN;
        r1 = r1 * r2;
        r6 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r6 = r6 * r2;
        r6 = r6 / 2;
        r1 = r1 - r6;
        if (r8 < r1) goto L_0x00d3;
    L_0x006a:
        r1 = r7.count;
        r2 = -2050080348; // 0xffffffff85ce41a4 float:-1.939626E-35 double:NaN;
        r1 = r1 * r2;
        r1 = r1 / 2;
        r6 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r6 = r6 * r2;
        r1 = r1 + r6;
        if (r8 <= r1) goto L_0x0018;
    L_0x007b:
        r2 = 0;
        return r2;
    L_0x007d:
        r8 = r7.size;
        r2 = 816527419; // 0x30ab383b float:1.2457869E-9 double:4.034181466E-315;
        r8 = r2 * r8;
        if (r9 < r8) goto L_0x00d3;
    L_0x0086:
        r8 = r7.size;
        r2 = 1643202023; // 0x61f145e7 float:5.563378E20 double:8.118496687E-315;
        r8 = r2 * r8;
        r1 = r7.data;
        r2 = 498629150; // 0x1db87a1e float:4.883066E-21 double:2.46355533E-315;
        r1 = r1 * r2;
        r8 = r8 + r1;
        if (r9 < r8) goto L_0x0024;
    L_0x0096:
        r2 = 0;
        return r2;
    L_0x0098:
        r8 = r7.size;
        r2 = -981823829; // 0xffffffffc57a8eab float:-4008.9167 double:NaN;
        r8 = r8 * r2;
        r1 = r7.data;
        r2 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r1 = r1 * r2;
        r1 = r1 / 2;
        r8 = r8 - r1;
        if (r9 < r8) goto L_0x00d3;
    L_0x00a9:
        r8 = r7.data;
        r2 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r8 = r8 * r2;
        r8 = r8 / 2;
        r1 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r1 = r1 * r2;
        r8 = r8 + r1;
        if (r9 <= r8) goto L_0x0024;
    L_0x00ba:
        r2 = 0;
        return r2;
    L_0x00bc:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        r1 = r7.data;
        r2 = 1159404515; // 0x451b1be3 float:2481.743 double:5.728219405E-315;
        r1 = r1 * r2;
        r8 = r8 - r1;
        if (r9 <= r8) goto L_0x00d3;
    L_0x00cb:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        if (r9 <= r8) goto L_0x0024;
    L_0x00d3:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: Complex.add(int, int):boolean");
    }

    boolean add(int $i0, int i, byte b) {
        try {
            if (this.value == null) {
                return false;
            }
            if ($i0 >= (this.next * 1177898615) - ((this.value.offset * -61780877) / 2)) {
                if ($i0 > ((this.value.offset * -61780877) / 2) + (this.next * 1177898615)) {
                    return false;
                }
                if (i >= this.size * 229893279) {
                    if (i <= (this.size * 229893279) + (957930101 * this.value.index)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dx.an(" + ')');
        }
    }

    boolean add(int i, int i2, int i3) {
        try {
            return get(i, i2, 2128121400) ? true : add(i, i2, (byte) -112);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dx.af(" + ')');
        }
    }

    boolean equals(int i, int i2) {
        return get(i, i2, 1722743949) ? true : add(i, i2, (byte) 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean get(int r8, int r9) {
        /*
        r7 = this;
        r0 = p000.ByteBufferList.data;
        r1 = r7.this$0;
        r2 = -459008153; // 0xffffffffe4a41767 float:-2.4215619E22 double:NaN;
        r1 = r2 * r1;
        r3 = r0[r1];
        r4 = r3.name;
        r1 = r4.value;
        r2 = 870311939; // 0x33dfe803 float:1.04264494E-7 double:4.2999123E-315;
        r1 = r2 * r1;
        switch(r1) {
            case 0: goto L_0x0063;
            case 1: goto L_0x004a;
            case 2: goto L_0x0026;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x0018;
    L_0x0018:
        r5 = r3.content;
        r8 = r5.value;
        r2 = -101861059; // 0xfffffffff9edb93d float:-1.5429143E35 double:NaN;
        r8 = r8 * r2;
        switch(r8) {
            case 0: goto L_0x00b9;
            case 1: goto L_0x00a0;
            case 2: goto L_0x007c;
            default: goto L_0x0023;
        };
    L_0x0023:
        goto L_0x0024;
    L_0x0024:
        r2 = 1;
        return r2;
    L_0x0026:
        r1 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r1 = r1 * r2;
        r6 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r6 = r6 * r2;
        r6 = r6 / 2;
        r1 = r1 - r6;
        if (r8 < r1) goto L_0x00d0;
    L_0x0037:
        r1 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r1 = r1 * r2;
        r1 = r1 / 2;
        r6 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r6 = r6 * r2;
        r1 = r1 + r6;
        if (r8 <= r1) goto L_0x0018;
    L_0x0048:
        r2 = 0;
        return r2;
    L_0x004a:
        r1 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r1 = r1 * r2;
        if (r8 < r1) goto L_0x00d0;
    L_0x0052:
        r1 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r1 = r1 * r2;
        r6 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r6 = r6 * r2;
        r1 = r1 + r6;
        if (r8 < r1) goto L_0x0018;
    L_0x0061:
        r2 = 0;
        return r2;
    L_0x0063:
        r1 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r1 = r1 * r2;
        r6 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r6 = r6 * r2;
        r1 = r1 - r6;
        if (r8 <= r1) goto L_0x00d0;
    L_0x0072:
        r1 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r1 = r1 * r2;
        if (r8 <= r1) goto L_0x0018;
    L_0x007a:
        r2 = 0;
        return r2;
    L_0x007c:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        r1 = r7.data;
        r2 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r1 = r1 * r2;
        r1 = r1 / 2;
        r8 = r8 - r1;
        if (r9 < r8) goto L_0x00d0;
    L_0x008d:
        r8 = r7.data;
        r2 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r8 = r8 * r2;
        r8 = r8 / 2;
        r1 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r1 = r1 * r2;
        r8 = r8 + r1;
        if (r9 <= r8) goto L_0x0024;
    L_0x009e:
        r2 = 0;
        return r2;
    L_0x00a0:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        r1 = r7.data;
        r2 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r1 = r1 * r2;
        r8 = r8 - r1;
        if (r9 <= r8) goto L_0x00d0;
    L_0x00af:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        if (r9 <= r8) goto L_0x0024;
    L_0x00b7:
        r2 = 0;
        return r2;
    L_0x00b9:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        if (r9 < r8) goto L_0x00d0;
    L_0x00c1:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        r1 = r7.data;
        r2 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r1 = r1 * r2;
        r8 = r8 + r1;
        if (r9 < r8) goto L_0x0024;
    L_0x00d0:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: Complex.get(int, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean get(int r12, int r13, int r14) {
        /*
        r11 = this;
        r0 = p000.ByteBufferList.data;
        r14 = r11.this$0;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -459008153; // 0xffffffffe4a41767 float:-2.4215619E22 double:NaN;
        r14 = r1 * r14;
        r2 = r0[r14];	 Catch:{ RuntimeException -> 0x00d2 }
        r3 = r2.name;	 Catch:{ RuntimeException -> 0x00d2 }
        r14 = r3.value;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 870311939; // 0x33dfe803 float:1.04264494E-7 double:4.2999123E-315;
        r14 = r1 * r14;
        switch(r14) {
            case 0: goto L_0x0058;
            case 1: goto L_0x003f;
            case 2: goto L_0x0071;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x0018;
    L_0x0018:
        r4 = r2.content;	 Catch:{ RuntimeException -> 0x00d2 }
        r12 = r4.value;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -101861059; // 0xfffffffff9edb93d float:-1.5429143E35 double:NaN;
        r12 = r12 * r1;
        switch(r12) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0095;
            case 2: goto L_0x00ae;
            default: goto L_0x0023;
        };
    L_0x0023:
        goto L_0x0024;
    L_0x0024:
        r1 = 1;
        return r1;
    L_0x0026:
        r12 = r11.size;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r12 = r12 * r1;
        if (r13 < r12) goto L_0x00ed;
    L_0x002e:
        r12 = r11.size;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r12 = r12 * r1;
        r14 = r11.data;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r14 = r14 * r1;
        r12 = r12 + r14;
        if (r13 < r12) goto L_0x0024;
    L_0x003d:
        r1 = 0;
        return r1;
    L_0x003f:
        r14 = r11.next;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r14 = r14 * r1;
        if (r12 < r14) goto L_0x00ed;
    L_0x0047:
        r14 = r11.count;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r14 = r14 * r1;
        r5 = r11.next;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r5 = r5 * r1;
        r14 = r14 + r5;
        if (r12 < r14) goto L_0x0018;
    L_0x0056:
        r1 = 0;
        return r1;
    L_0x0058:
        r14 = r11.next;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r14 = r14 * r1;
        r5 = r11.count;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r5 = r5 * r1;
        r14 = r14 - r5;
        if (r12 <= r14) goto L_0x00ed;
    L_0x0067:
        r14 = r11.next;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r14 = r14 * r1;
        if (r12 <= r14) goto L_0x0018;
    L_0x006f:
        r1 = 0;
        return r1;
    L_0x0071:
        r14 = r11.next;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r14 = r14 * r1;
        r5 = r11.count;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r5 = r5 * r1;
        r5 = r5 / 2;
        r14 = r14 - r5;
        if (r12 < r14) goto L_0x00ed;
    L_0x0082:
        r14 = r11.count;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r14 = r14 * r1;
        r14 = r14 / 2;
        r5 = r11.next;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r5 = r5 * r1;
        r14 = r14 + r5;
        if (r12 <= r14) goto L_0x0018;
    L_0x0093:
        r1 = 0;
        return r1;
    L_0x0095:
        r12 = r11.size;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r12 = r12 * r1;
        r14 = r11.data;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r14 = r14 * r1;
        r12 = r12 - r14;
        if (r13 <= r12) goto L_0x00ed;
    L_0x00a4:
        r12 = r11.size;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r12 = r12 * r1;
        if (r13 <= r12) goto L_0x0024;
    L_0x00ac:
        r1 = 0;
        return r1;
    L_0x00ae:
        r12 = r11.size;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r12 = r12 * r1;
        r14 = r11.data;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r14 = r14 * r1;
        r14 = r14 / 2;
        r12 = r12 - r14;
        if (r13 < r12) goto L_0x00ed;
    L_0x00bf:
        r12 = r11.data;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r12 = r12 * r1;
        r12 = r12 / 2;
        r14 = r11.size;	 Catch:{ RuntimeException -> 0x00d2 }
        r1 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r14 = r14 * r1;
        r12 = r12 + r14;
        if (r13 <= r12) goto L_0x0024;
    L_0x00d0:
        r1 = 0;
        return r1;
    L_0x00d2:
        r6 = move-exception;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "dx.ad(";
        r7 = r7.append(r8);
        r1 = 41;
        r7 = r7.append(r1);
        r9 = r7.toString();
        r10 = p000.StringBuilder.append(r6, r9);
        throw r10;
    L_0x00ed:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: Complex.get(int, int, int):boolean");
    }

    boolean log(int i, int i2) {
        return get(i, i2, 1809230781) ? true : add(i, i2, (byte) -7);
    }

    boolean push(int i, int i2) {
        return this.value == null ? false : i >= (this.next * 1177898615) - ((this.value.offset * -61780877) / 2) && i <= ((this.value.offset * -61780877) / 2) + (this.next * 1177898615) && i2 >= this.size * 229893279 && i2 <= (this.size * 229893279) + (957930101 * this.value.index);
    }

    boolean m81read(int i, int i2) {
        return this.value == null ? false : i >= (this.next * 1177898615) - ((this.value.offset * -61780877) / 2) && i <= ((this.value.offset * -61780877) / 2) + (this.next * 1177898615) && i2 >= this.size * 229893279 && i2 <= (this.size * 229893279) + (957930101 * this.value.index);
    }

    boolean set(int i, int i2) {
        return this.value == null ? false : i >= (this.next * 1177898615) - ((this.value.offset * -61780877) / 2) && i <= ((this.value.offset * -61780877) / 2) + (this.next * 1177898615) && i2 >= this.size * 229893279 && i2 <= (this.size * 229893279) + (957930101 * this.value.index);
    }

    boolean swap(int i, int i2) {
        return get(i, i2, 1831456161) ? true : add(i, i2, (byte) -103);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean toString(int r8, int r9) {
        /*
        r7 = this;
        r0 = p000.ByteBufferList.data;
        r1 = r7.this$0;
        r2 = -459008153; // 0xffffffffe4a41767 float:-2.4215619E22 double:NaN;
        r1 = r2 * r1;
        r3 = r0[r1];
        r4 = r3.name;
        r1 = r4.value;
        r2 = 870311939; // 0x33dfe803 float:1.04264494E-7 double:4.2999123E-315;
        r1 = r2 * r1;
        switch(r1) {
            case 0: goto L_0x0058;
            case 1: goto L_0x0026;
            case 2: goto L_0x0072;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x0018;
    L_0x0018:
        r5 = r3.content;
        r8 = r5.value;
        r2 = -1338523302; // 0xffffffffb037c15a float:-6.684978E-10 double:NaN;
        r8 = r8 * r2;
        switch(r8) {
            case 0: goto L_0x00ba;
            case 1: goto L_0x003f;
            case 2: goto L_0x0096;
            default: goto L_0x0023;
        };
    L_0x0023:
        goto L_0x0024;
    L_0x0024:
        r2 = 1;
        return r2;
    L_0x0026:
        r1 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r1 = r1 * r2;
        if (r8 < r1) goto L_0x00d2;
    L_0x002e:
        r1 = r7.count;
        r2 = -192174419; // 0xfffffffff48ba6ad float:-8.851439E31 double:NaN;
        r1 = r1 * r2;
        r6 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r6 = r6 * r2;
        r1 = r1 + r6;
        if (r8 < r1) goto L_0x0018;
    L_0x003d:
        r2 = 0;
        return r2;
    L_0x003f:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        r1 = r7.data;
        r2 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r1 = r1 * r2;
        r8 = r8 - r1;
        if (r9 <= r8) goto L_0x00d2;
    L_0x004e:
        r8 = r7.size;
        r2 = -185048990; // 0xfffffffff4f86062 float:-1.5742731E32 double:NaN;
        r8 = r8 * r2;
        if (r9 <= r8) goto L_0x0024;
    L_0x0056:
        r2 = 0;
        return r2;
    L_0x0058:
        r1 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r1 = r1 * r2;
        r6 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r6 = r6 * r2;
        r1 = r1 - r6;
        if (r8 <= r1) goto L_0x00d2;
    L_0x0067:
        r1 = r7.next;
        r2 = -1494286170; // 0xffffffffa6ef00a6 float:-1.6584132E-15 double:NaN;
        r1 = r2 * r1;
        if (r8 <= r1) goto L_0x0018;
    L_0x0070:
        r2 = 0;
        return r2;
    L_0x0072:
        r1 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r1 = r1 * r2;
        r6 = r7.count;
        r2 = -312830619; // 0xffffffffed5a9565 float:-4.2280212E27 double:NaN;
        r6 = r6 * r2;
        r6 = r6 / 2;
        r1 = r1 - r6;
        if (r8 < r1) goto L_0x00d2;
    L_0x0083:
        r1 = r7.count;
        r2 = 873950720; // 0x34176e00 float:1.4102989E-7 double:4.31789027E-315;
        r1 = r1 * r2;
        r1 = r1 / 2;
        r6 = r7.next;
        r2 = 1177898615; // 0x46354e77 float:11603.616 double:5.8195924E-315;
        r6 = r6 * r2;
        r1 = r1 + r6;
        if (r8 <= r1) goto L_0x0018;
    L_0x0094:
        r2 = 0;
        return r2;
    L_0x0096:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        r1 = r7.data;
        r2 = 1374063178; // 0x51e68a4a float:1.23770323E11 double:6.788774115E-315;
        r1 = r1 * r2;
        r1 = r1 / 2;
        r8 = r8 - r1;
        if (r9 < r8) goto L_0x00d2;
    L_0x00a7:
        r8 = r7.data;
        r2 = -675453863; // 0xffffffffd7bd6459 float:-4.16477375E14 double:NaN;
        r8 = r8 * r2;
        r8 = r8 / 2;
        r1 = r7.size;
        r2 = 1543604854; // 0x5c018a76 float:1.45850046E17 double:7.62642129E-315;
        r1 = r1 * r2;
        r8 = r8 + r1;
        if (r9 <= r8) goto L_0x0024;
    L_0x00b8:
        r2 = 0;
        return r2;
    L_0x00ba:
        r8 = r7.size;
        r2 = 530266364; // 0x1f9b38fc float:6.5739326E-20 double:2.619863936E-315;
        r8 = r2 * r8;
        if (r9 < r8) goto L_0x00d2;
    L_0x00c3:
        r8 = r7.size;
        r2 = 229893279; // 0xdb3e49f float:1.1086765E-30 double:1.135823714E-315;
        r8 = r8 * r2;
        r1 = r7.data;
        r2 = -1389433273; // 0xffffffffad2eee47 float:-9.943663E-12 double:NaN;
        r1 = r1 * r2;
        r8 = r8 + r1;
        if (r9 < r8) goto L_0x0024;
    L_0x00d2:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: Complex.toString(int, int):boolean");
    }
}
