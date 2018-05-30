package p000;

/* compiled from: io */
public class IOException implements Renderer {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void add(p000.Collection r26, byte r27) {
        /*
        r6 = 0;
        r0 = r26;
        r7 = r0.f76s;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 1791262809; // 0x6ac48059 float:1.1877778E26 double:8.850014166E-315;
        r7 = r7 * r8;
        if (r7 != 0) goto L_0x00ab;
    L_0x000b:
        return;
    L_0x000c:
        r0 = r26;
        r9 = r0.index;	 Catch:{ RuntimeException -> 0x0090 }
        r0 = r26;
        r10 = r0.f76s;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 1811938131; // 0x6bfffb53 float:6.1892586E26 double:8.95216383E-315;
        r10 = r8 * r10;
        r9 = r9 + r10;
        r0 = r26;
        r0.index = r9;	 Catch:{ RuntimeException -> 0x0090 }
        r6 = 1;
        r0 = r26;
        r9 = r0.f76s;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 1791262809; // 0x6ac48059 float:1.1877778E26 double:8.850014166E-315;
        r9 = r9 * r8;
        if (r7 < r9) goto L_0x0037;
    L_0x0029:
        r0 = r26;
        r9 = r0.f76s;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 1791262809; // 0x6ac48059 float:1.1877778E26 double:8.850014166E-315;
        r9 = r9 * r8;
        r8 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r9 = r8 - r9;
        if (r7 <= r9) goto L_0x0044;
    L_0x0037:
        r0 = r26;
        r7 = r0.name;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -376326741; // 0xffffffffe991b5ab float:-2.2019018E25 double:NaN;
        r7 = r7 * r8;
        r0 = r26;
        r0.index = r7;	 Catch:{ RuntimeException -> 0x0090 }
        r6 = 0;
    L_0x0044:
        r0 = r26;
        r7 = r0.text;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 259701737; // 0xf7abbe9 float:1.2362142E-29 double:1.283097064E-315;
        r7 = r7 * r8;
        r0 = r26;
        r9 = r0.type;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -629432309; // 0xffffffffda7ba00b float:-1.77065471E16 double:NaN;
        r9 = r8 * r9;
        if (r7 != r9) goto L_0x007c;
    L_0x0057:
        r0 = r26;
        r7 = r0.f77v;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -1845676781; // 0xffffffff91fd3513 float:-3.9949071E-28 double:NaN;
        r7 = r7 * r8;
        r8 = 25;
        if (r7 > r8) goto L_0x0065;
    L_0x0063:
        if (r6 == 0) goto L_0x007c;
    L_0x0065:
        r0 = r26;
        r7 = r0.f69i;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -863692521; // 0xffffffffcc851917 float:-6.9781688E7 double:NaN;
        r7 = r7 * r8;
        r8 = -1;
        if (r8 == r7) goto L_0x0247;
    L_0x0070:
        r0 = r26;
        r7 = r0.f69i;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 78449919; // 0x4ad0cff float:4.068404E-36 double:3.875941E-316;
        r7 = r7 * r8;
        r0 = r26;
        r0.text = r7;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x007c:
        r0 = r26;
        r7 = r0.index;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -626668509; // 0xffffffffdaa5cc23 float:-2.33339109E16 double:NaN;
        r7 = r8 * r7;
        r7 = r7 & 2047;
        r8 = 1955545995; // 0x748f438b float:9.080425E31 double:9.66168095E-315;
        r7 = r7 * r8;
        r0 = r26;
        r0.index = r7;	 Catch:{ RuntimeException -> 0x0090 }
        return;
    L_0x0090:
        r11 = move-exception;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = "io.cc(";
        r12 = r12.append(r13);
        r8 = 41;
        r12 = r12.append(r8);
        r14 = r12.toString();
        r15 = p000.StringBuilder.append(r11, r14);
        throw r15;
    L_0x00ab:
        r0 = r26;
        r7 = r0.key;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -609375913; // 0xffffffffdbada957 float:-9.7762724E16 double:NaN;
        r7 = r7 * r8;
        r8 = -1;
        if (r7 == r8) goto L_0x0120;
    L_0x00b6:
        r16 = 0;
        r0 = r26;
        r7 = r0.key;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -609375913; // 0xffffffffdbada957 float:-9.7762724E16 double:NaN;
        r7 = r7 * r8;
        r8 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        if (r7 >= r8) goto L_0x0219;
    L_0x00c5:
        r17 = p000.client.next;
        r0 = r26;
        r7 = r0.key;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -609375913; // 0xffffffffdbada957 float:-9.7762724E16 double:NaN;
        r7 = r7 * r8;
        r16 = r17[r7];	 Catch:{ RuntimeException -> 0x0090 }
    L_0x00d1:
        if (r16 == 0) goto L_0x0202;
    L_0x00d3:
        r0 = r26;
        r7 = r0.size;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r7 = r7 * r8;
        r0 = r16;
        r9 = r0.size;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r9 = r8 * r9;
        r7 = r7 - r9;
        r0 = r26;
        r9 = r0.value;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r9 = r8 * r9;
        r0 = r16;
        r10 = r0.value;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r10 = r10 * r8;
        r9 = r9 - r10;
        if (r7 != 0) goto L_0x00fb;
    L_0x00f9:
        if (r9 == 0) goto L_0x0120;
    L_0x00fb:
        r0 = (double) r7;
        r18 = r0;
        r0 = (double) r9;
        r20 = r0;
        r0 = r18;
        r2 = r20;
        r18 = java.lang.Math.atan2(r0, r2);	 Catch:{ RuntimeException -> 0x0090 }
        r22 = 4644441771640602231; // 0x40745f2f1a9fbe77 float:6.606857E-23 double:325.949;
        r0 = r18;
        r2 = r22;
        r0 = r0 * r2;
        r18 = r0;
        r7 = (int) r0;
        r7 = r7 & 2047;
        r8 = 1453001121; // 0x569b09a1 float:8.5232829E13 double:7.178779373E-315;
        r7 = r7 * r8;
        r0 = r26;
        r0.name = r7;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x0120:
        r0 = r26;
        r7 = r0.next;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 323118731; // 0x1342668b float:2.45368E-27 double:1.596418645E-315;
        r7 = r7 * r8;
        r8 = -1;
        if (r8 == r7) goto L_0x0154;
    L_0x012b:
        r0 = r26;
        r7 = r0.parent;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 761444243; // 0x2d62b793 float:1.2887374E-11 double:3.762034417E-315;
        r7 = r8 * r7;
        if (r7 == 0) goto L_0x0140;
    L_0x0136:
        r0 = r26;
        r7 = r0.height;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -1269933949; // 0xffffffffb44e5883 float:-1.9217445E-7 double:NaN;
        r7 = r7 * r8;
        if (r7 <= 0) goto L_0x0154;
    L_0x0140:
        r0 = r26;
        r7 = r0.next;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 981885035; // 0x3a86606b float:0.0010252123 double:4.85115664E-315;
        r7 = r8 * r7;
        r0 = r26;
        r0.name = r7;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -464408867; // 0xffffffffe451aedd float:-1.5471879E22 double:NaN;
        r0 = r26;
        r0.next = r8;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x0154:
        r0 = r26;
        r7 = r0.name;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -1058596255; // 0xffffffffc0e71a61 float:-7.22197 double:NaN;
        r7 = r8 * r7;
        r0 = r26;
        r9 = r0.index;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -626668509; // 0xffffffffdaa5cc23 float:-2.33339109E16 double:NaN;
        r9 = r9 * r8;
        r7 = r7 - r9;
        r7 = r7 & 2047;
        if (r7 != 0) goto L_0x017e;
    L_0x016a:
        r0 = r26;
        r0 = r0.last;	 Catch:{ RuntimeException -> 0x0090 }
        r24 = r0;
        if (r24 == 0) goto L_0x017e;
    L_0x0172:
        r8 = -1968525927; // 0xffffffff8aaaad99 float:-1.6435705E-32 double:NaN;
        r0 = r26;
        r0.key = r8;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 0;
        r0 = r26;
        r0.last = r8;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x017e:
        if (r7 == 0) goto L_0x0257;
    L_0x0180:
        r0 = r26;
        r9 = r0.f77v;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -1344348901; // 0xffffffffafdedd1b float:-4.053867E-10 double:NaN;
        r9 = r9 + r8;
        r0 = r26;
        r0.f77v = r9;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r7 <= r8) goto L_0x000c;
    L_0x0190:
        r0 = r26;
        r9 = r0.index;	 Catch:{ RuntimeException -> 0x0090 }
        r0 = r26;
        r10 = r0.f76s;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 1811938131; // 0x6bfffb53 float:6.1892586E26 double:8.95216383E-315;
        r10 = r8 * r10;
        r9 = r9 - r10;
        r0 = r26;
        r0.index = r9;	 Catch:{ RuntimeException -> 0x0090 }
        r0 = r26;
        r9 = r0.f76s;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 1791262809; // 0x6ac48059 float:1.1877778E26 double:8.850014166E-315;
        r9 = r9 * r8;
        if (r7 < r9) goto L_0x01ba;
    L_0x01ac:
        r0 = r26;
        r9 = r0.f76s;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 1791262809; // 0x6ac48059 float:1.1877778E26 double:8.850014166E-315;
        r9 = r9 * r8;
        r8 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r9 = r8 - r9;
        if (r7 <= r9) goto L_0x025d;
    L_0x01ba:
        r0 = r26;
        r7 = r0.name;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -376326741; // 0xffffffffe991b5ab float:-2.2019018E25 double:NaN;
        r7 = r7 * r8;
        r0 = r26;
        r0.index = r7;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x01c6:
        r0 = r26;
        r7 = r0.type;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -629432309; // 0xffffffffda7ba00b float:-1.77065471E16 double:NaN;
        r7 = r7 * r8;
        r0 = r26;
        r9 = r0.text;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 259701737; // 0xf7abbe9 float:1.2362142E-29 double:1.283097064E-315;
        r9 = r9 * r8;
        if (r7 != r9) goto L_0x007c;
    L_0x01d8:
        r0 = r26;
        r7 = r0.f77v;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -1845676781; // 0xffffffff91fd3513 float:-3.9949071E-28 double:NaN;
        r7 = r8 * r7;
        r8 = 25;
        if (r7 > r8) goto L_0x01e7;
    L_0x01e5:
        if (r6 == 0) goto L_0x007c;
    L_0x01e7:
        r0 = r26;
        r7 = r0.status;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 986301107; // 0x3ac9c2b3 float:0.0015393108 double:4.872974934E-315;
        r7 = r8 * r7;
        r8 = -1;
        if (r8 == r7) goto L_0x0237;
    L_0x01f3:
        r0 = r26;
        r7 = r0.status;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -703048645; // 0xffffffffd618543b float:-4.1871884E13 double:NaN;
        r7 = r7 * r8;
        r0 = r26;
        r0.text = r7;	 Catch:{ RuntimeException -> 0x0090 }
        goto L_0x007c;
    L_0x0202:
        r0 = r26;
        r0 = r0.last;	 Catch:{ RuntimeException -> 0x0090 }
        r24 = r0;
        if (r24 == 0) goto L_0x0120;
    L_0x020a:
        r8 = -1968525927; // 0xffffffff8aaaad99 float:-1.6435705E-32 double:NaN;
        r0 = r26;
        r0.key = r8;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = 0;
        r0 = r26;
        r0.last = r8;	 Catch:{ RuntimeException -> 0x0090 }
        goto L_0x0120;
    L_0x0219:
        r0 = r26;
        r7 = r0.key;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -609375913; // 0xffffffffdbada957 float:-9.7762724E16 double:NaN;
        r7 = r7 * r8;
        r8 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        if (r7 < r8) goto L_0x00d1;
    L_0x0226:
        r25 = p000.client.size;
        r0 = r26;
        r7 = r0.key;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -609375913; // 0xffffffffdbada957 float:-9.7762724E16 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -32768;
        r16 = r25[r7];	 Catch:{ RuntimeException -> 0x0090 }
        goto L_0x00d1;
    L_0x0237:
        r0 = r26;
        r7 = r0.flags;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -230807123; // 0xfffffffff23e29ad float:-3.7665622E30 double:NaN;
        r7 = r8 * r7;
        r0 = r26;
        r0.text = r7;	 Catch:{ RuntimeException -> 0x0090 }
        goto L_0x007c;
    L_0x0247:
        r0 = r26;
        r7 = r0.flags;	 Catch:{ RuntimeException -> 0x0090 }
        r8 = -230807123; // 0xfffffffff23e29ad float:-3.7665622E30 double:NaN;
        r7 = r8 * r7;
        r0 = r26;
        r0.text = r7;	 Catch:{ RuntimeException -> 0x0090 }
        goto L_0x007c;
    L_0x0257:
        r8 = 0;
        r0 = r26;
        r0.f77v = r8;	 Catch:{ RuntimeException -> 0x0090 }
        return;
    L_0x025d:
        r6 = 1;
        goto L_0x01c6;
        */
        throw new UnsupportedOperationException("Method not decompiled: IOException.add(Collection, byte):void");
    }

    public static double get(double d, double d2, double d3) {
        d = (d - d2) / d3;
        try {
            return (Math.exp((d * (-d)) / 2.0d) / Math.sqrt(6.283185307179586d)) / d3;
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "io.af(" + ')');
        }
    }

    public static int toString(int $i0, int i) {
        try {
            HyperlinkRecord $r2 = (HyperlinkRecord) HyperlinkRecord.data.get((long) $i0);
            if ($r2 == null) {
                byte[] $r5 = HyperlinkRecord.file.get(14, $i0, -1520147322);
                $r2 = new HyperlinkRecord();
                if ($r5 != null) {
                    $r2.add(new Logger($r5), (byte) -121);
                }
                HyperlinkRecord.data.get($r2, (long) $i0);
            }
            i = $r2.f132c * -1983699515;
            return Event.f116c[($r2.index * -2000072461) - i] & (Event.this$0[-345339061 * $r2.position] >> i);
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "io.af(" + ')');
        }
    }

    public float getInterpolation(float $f0) {
        return ((float) (Math.cos(3.141592653589793d * ((double) (1.0f + $f0))) / 2.0d)) + 0.5f;
    }

    public float inout(float $f0) {
        return ((float) (Math.cos(3.141592653589793d * ((double) (1.0f + $f0))) / 2.0d)) + 0.5f;
    }

    public float move(float $f0) {
        return ((float) (Math.cos(3.141592653589793d * ((double) (1.0f + $f0))) / 2.0d)) + 0.5f;
    }

    public float update(float $f0, int i) {
        try {
            return ((float) (Math.cos(3.141592653589793d * ((double) (1.0f + $f0))) / 2.0d)) + 0.5f;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "io.af(" + ')');
        }
    }
}
