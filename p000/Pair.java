package p000;

/* compiled from: ei */
public class Pair extends Coordinate {
    boolean count;
    boolean size;

    Pair() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ei.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int compare(p000.Pair r9, int r10) {
        /*
        r8 = this;
        r10 = r8.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r10 = r10 * r0;
        r1 = p000.client.f407x;
        r0 = -1304916389; // 0xffffffffb2388e5b float:-1.07425775E-8 double:NaN;
        r1 = r1 * r0;
        if (r10 != r1) goto L_0x0030;
    L_0x000e:
        r10 = p000.client.f407x;
        r0 = -1304916389; // 0xffffffffb2388e5b float:-1.07425775E-8 double:NaN;
        r10 = r10 * r0;
        r1 = r9.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r1 = r1 * r0;
        if (r10 == r1) goto L_0x0030;
    L_0x001c:
        r0 = -1;
        return r0;
    L_0x001e:
        r2 = r8.size;	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 == 0) goto L_0x0026;
    L_0x0022:
        r2 = r9.size;	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 == 0) goto L_0x00c1;
    L_0x0026:
        r2 = r8.size;	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 != 0) goto L_0x0094;
    L_0x002a:
        r2 = r9.size;	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 == 0) goto L_0x0094;
    L_0x002e:
        r0 = 1;
        return r0;
    L_0x0030:
        r10 = r9.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r10 = r10 * r0;
        r1 = p000.client.f407x;
        r0 = -1304916389; // 0xffffffffb2388e5b float:-1.07425775E-8 double:NaN;
        r1 = r1 * r0;
        if (r10 != r1) goto L_0x005c;
    L_0x003e:
        r10 = r8.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r10 = r10 * r0;
        r1 = p000.client.f407x;
        r0 = -1304916389; // 0xffffffffb2388e5b float:-1.07425775E-8 double:NaN;
        r1 = r1 * r0;
        if (r10 == r1) goto L_0x005c;
    L_0x004c:
        r0 = 1;
        return r0;
    L_0x004e:
        r10 = r9.f35y;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = 2046794799; // 0x79ff9c2f float:1.6590043E35 double:1.0112509943E-314;
        r10 = r10 * r0;
        r1 = r8.f35y;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = 2046794799; // 0x79ff9c2f float:1.6590043E35 double:1.0112509943E-314;
        r1 = r1 * r0;
        r10 = r10 - r1;
        return r10;
    L_0x005c:
        r10 = r8.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r10 = r10 * r0;
        if (r10 == 0) goto L_0x006c;
    L_0x0064:
        r10 = r9.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r10 = r10 * r0;
        if (r10 == 0) goto L_0x00c1;
    L_0x006c:
        r10 = r9.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r10 = r10 * r0;
        if (r10 == 0) goto L_0x001e;
    L_0x0074:
        r10 = r8.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r10 = r10 * r0;
        if (r10 != 0) goto L_0x001e;
    L_0x007c:
        r0 = 1;
        return r0;
    L_0x007e:
        r10 = r8.this$0;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = -1161455169; // 0xffffffffbac599bf float:-0.0015075727 double:NaN;
        r10 = r10 * r0;
        if (r10 == 0) goto L_0x004e;
    L_0x0086:
        r10 = r8.f35y;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = 2046794799; // 0x79ff9c2f float:1.6590043E35 double:1.0112509943E-314;
        r10 = r10 * r0;
        r1 = r9.f35y;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = 2046794799; // 0x79ff9c2f float:1.6590043E35 double:1.0112509943E-314;
        r1 = r1 * r0;
        r10 = r10 - r1;
        return r10;
    L_0x0094:
        r2 = r8.count;	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 == 0) goto L_0x009c;
    L_0x0098:
        r2 = r9.count;	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 == 0) goto L_0x00c1;
    L_0x009c:
        r2 = r8.count;	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 != 0) goto L_0x007e;
    L_0x00a0:
        r2 = r9.count;	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 == 0) goto L_0x007e;
    L_0x00a4:
        r0 = 1;
        return r0;
    L_0x00a6:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "ei.af(";
        r4 = r4.append(r5);
        r0 = 41;
        r4 = r4.append(r0);
        r6 = r4.toString();
        r7 = p000.StringBuilder.append(r3, r6);
        throw r7;
    L_0x00c1:
        r0 = -1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: Pair.compare(Pair, int):int");
    }

    public int compare(State state) {
        return compare((Pair) state, 117735812);
    }

    public int compare(Object obj) {
        return compare((Pair) obj, 105332805);
    }

    int compareTo(Pair pair) {
        return (this.this$0 * -1161455169 != client.f407x * -1304916389 || client.f407x * -1304916389 == pair.this$0 * -1161455169) ? (pair.this$0 * -1161455169 != client.f407x * -1304916389 || this.this$0 * -1161455169 == client.f407x * -1304916389) ? (this.this$0 * -1161455169 == 0 || pair.this$0 * -1161455169 != 0) ? (pair.this$0 * -1161455169 == 0 || this.this$0 * -1161455169 != 0) ? (!this.size || pair.size) ? (this.size || !pair.size) ? (!this.count || pair.count) ? (this.count || !pair.count) ? this.this$0 * -1161455169 != 0 ? (this.f35y * 2046794799) - (pair.f35y * 2046794799) : (pair.f35y * 2046794799) - (this.f35y * 2046794799) : 1 : -1 : 1 : -1 : 1 : -1 : 1 : -1;
    }

    public int compareTo(State state) {
        return compare((Pair) state, 771519035);
    }

    public int compareTo(State state, byte b) {
        try {
            return compare((Pair) state, -1591392558);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ei.ad(" + ')');
        }
    }

    public int compareTo(Object obj) {
        try {
            return compare((Pair) obj, 10996896);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ei.compareTo(" + ')');
        }
    }

    int insert(Pair pair) {
        return (this.this$0 * -1161455169 != client.f407x * -1304916389 || 356041184 * client.f407x == 1260518925 * pair.this$0) ? (pair.this$0 * -1161455169 != client.f407x * -1304916389 || this.this$0 * -1161455169 == client.f407x * -1304916389) ? (this.this$0 * 1339969695 == 0 || pair.this$0 * 2038653611 != 0) ? (pair.this$0 * -1756245118 == 0 || this.this$0 * -1161455169 != 0) ? (!this.size || pair.size) ? (this.size || !pair.size) ? (!this.count || pair.count) ? (this.count || !pair.count) ? this.this$0 * -1521054952 != 0 ? (this.f35y * 2046794799) - (pair.f35y * 794259585) : (pair.f35y * 2046794799) - (this.f35y * 2046794799) : 1 : -1 : 1 : -1 : 1 : -1 : 1 : -1;
    }

    public int reset(Object obj) {
        return compare((Pair) obj, -240303289);
    }
}
