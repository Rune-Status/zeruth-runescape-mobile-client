package p000;

/* compiled from: bs */
public final class Line {
    public static final int BLUE = 34;
    static final int META_ALT_LOCKED = 512;
    static final int ORANGE = 19136782;
    public ArrayMap buffer;
    int count;
    public long data;
    public ArrayMap length;
    int name;
    int next;
    int pos;
    int size;
    int value;

    Line() {
        try {
            this.data = 0;
            this.next = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bs.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean add(p000.Item r9, byte r10) {
        /*
        r0 = p000.client.message;
        r1 = 1424263497; // 0x54e48949 float:7.8524464E12 double:7.036796645E-315;
        r0 = r0 * r1;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r1 = 0;
        return r1;
    L_0x000a:
        r2 = p000.File.this$0;
        if (r2 == r9) goto L_0x004b;
    L_0x000e:
        r0 = p000.client.message;
        r1 = 1424263497; // 0x54e48949 float:7.8524464E12 double:7.036796645E-315;
        r0 = r0 * r1;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x0049;
    L_0x0018:
        r3 = 1;
    L_0x0019:
        if (r3 != 0) goto L_0x0032;
    L_0x001b:
        r0 = p000.client.message;
        r1 = 1424263497; // 0x54e48949 float:7.8524464E12 double:7.036796645E-315;
        r0 = r0 * r1;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x0047;
    L_0x0025:
        r3 = 1;
    L_0x0026:
        if (r3 == 0) goto L_0x0053;
    L_0x0028:
        r1 = 1309371446; // 0x4e0b6c36 float:5.8478118E8 double:6.46915449E-315;
        r3 = r9.get(r1);	 Catch:{ RuntimeException -> 0x0055 }
        if (r3 == 0) goto L_0x0053;
    L_0x0031:
        r3 = 1;
    L_0x0032:
        if (r3 != 0) goto L_0x0045;
    L_0x0034:
        r1 = -1998857572; // 0xffffffff88dbda9c float:-1.3231978E-33 double:NaN;
        r3 = p000.Shape.update(r1);	 Catch:{ RuntimeException -> 0x0055 }
        if (r3 == 0) goto L_0x0070;
    L_0x003d:
        r1 = 20009; // 0x4e29 float:2.8039E-41 double:9.886E-320;
        r3 = r9.get(r1);	 Catch:{ RuntimeException -> 0x0055 }
        if (r3 == 0) goto L_0x0070;
    L_0x0045:
        r1 = 1;
        return r1;
    L_0x0047:
        r3 = 0;
        goto L_0x0026;
    L_0x0049:
        r3 = 0;
        goto L_0x0019;
    L_0x004b:
        r1 = 1905334525; // 0x719118fd float:1.4369771E30 double:9.413603326E-315;
        r3 = p000.Label.add(r1);	 Catch:{ RuntimeException -> 0x0055 }
        return r3;
    L_0x0053:
        r3 = 0;
        goto L_0x0032;
    L_0x0055:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "bs.dv(";
        r5 = r5.append(r6);
        r1 = 41;
        r5 = r5.append(r1);
        r7 = r5.toString();
        r8 = p000.StringBuilder.append(r4, r7);
        throw r8;
    L_0x0070:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: Line.add(Item, byte):boolean");
    }

    public static final void update(double d) {
        try {
            d += (Math.random() * 0.03d) - 0.015d;
            int $i0 = 0;
            for (int $i1 = 0; $i1 < 512; $i1++) {
                double $d1 = (((double) ($i1 >> 3)) / 64.0d) + 0.0078125d;
                double $d2 = (((double) ($i1 & 7)) / 8.0d) + 0.0625d;
                int $i2 = 0;
                while ($i2 < Constants.f93X) {
                    double $d4;
                    double $d6;
                    double $d3 = ((double) $i2) / 128.0d;
                    if (0.0d != $d2) {
                        double d2;
                        $d4 = $d3 < 0.5d ? (1.0d + $d2) * $d3 : ($d2 + $d3) - ($d3 * $d2);
                        $d3 = ($d3 * 2.0d) - $d4;
                        double $d5 = 0.3333333333333333d + $d1;
                        if ($d5 > 1.0d) {
                            $d5 -= 1.0d;
                        }
                        $d6 = $d1 - 0.3333333333333333d;
                        if ($d6 < 0.0d) {
                            $d6 += 1.0d;
                        }
                        $d5 = 6.0d * $d5 < 1.0d ? $d3 + ($d5 * (6.0d * ($d4 - $d3))) : 2.0d * $d5 < 1.0d ? $d4 : 3.0d * $d5 < 2.0d ? $d3 + (((0.6666666666666666d - $d5) * ($d4 - $d3)) * 6.0d) : $d3;
                        if (6.0d * $d1 < 1.0d) {
                            double $d7 = ($d4 - $d3) * 6.0d;
                            d2 = $d7;
                            d2 = $d3 + ($d7 * $d1);
                        } else {
                            d2 = 2.0d * $d1 < 1.0d ? $d4 : 3.0d * $d1 < 2.0d ? $d3 + (6.0d * (($d4 - $d3) * (0.6666666666666666d - $d1))) : $d3;
                        }
                        if (6.0d * $d6 < 1.0d) {
                            $d3 = ((6.0d * ($d4 - $d3)) * $d6) + $d3;
                            $d4 = d2;
                            $d6 = $d5;
                        } else if (2.0d * $d6 < 1.0d) {
                            $d3 = $d4;
                            $d6 = $d5;
                            $d4 = d2;
                        } else if (3.0d * $d6 < 2.0d) {
                            $d3 = (6.0d * (($d4 - $d3) * (0.6666666666666666d - $d6))) + $d3;
                            $d4 = d2;
                            $d6 = $d5;
                        } else {
                            $d4 = d2;
                            $d6 = $d5;
                        }
                    } else {
                        $d4 = $d3;
                        $d6 = $d3;
                    }
                    int $i4 = $d6 * 256.0d;
                    long j = $i4;
                    int $i42 = (int) $i4;
                    $i4 = $d4 * 256.0d;
                    long j2 = $i4;
                    $i4 = ((int) ($d3 * 256.0d)) + ((((int) $i4) << 8) + ($i42 << 16));
                    int i = $i4;
                    $i42 = Hashtable.get($i4, d);
                    i = $i42;
                    if ($i42 == 0) {
                        i = 1;
                    }
                    Point.count[$i0] = i;
                    $i2++;
                    $i0++;
                }
            }
        } catch (Throwable $r1) {
            throw StringBuilder.append($r1, "bs.bw(" + ')');
        }
    }
}
