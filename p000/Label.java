package p000;

/* compiled from: lq */
public class Label {
    static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    static final int LONGEST_PAST_TIME = 200;
    static final int MEASURED_SIZE_MASK = 16777215;
    static final int TARGET = 16;
    public static final Label f169a = new Label("PLAIN12", "p12_full");
    public static final Label f170b = new Label("VERDANA15", "verdana_15pt_regular");
    public static final Label f171c = new Label("VERDANA13", "verdana_13pt_regular");
    public static final Label f172h = new Label("BOLD12", "b12_full");
    public static final Label f173i = new Label("PLAIN11", "p11_full");
    public static final Label f174k = new Label("VERDANA11", "verdana_11pt_regular");
    final String owner;
    String value;

    Label(String str, String str2) {
        try {
            this.owner = str;
            this.value = str2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "lq.<init>(" + ')');
        }
    }

    public static Label[] m36a() {
        return new Label[]{f171c, f173i, f174k, f170b, f172h, f169a};
    }

    public static ClassWriter add(int i, byte b) {
        try {
            ClassWriter $r2 = (ClassWriter) ClassWriter.items.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = ClassWriter.activity.get(32, i, 373342904);
            $r2 = new ClassWriter();
            if ($r4 != null) {
                $r2.put(new Logger($r4), 1639800210);
            }
            ClassWriter.items.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "lq.af(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void add(p000.Collection r16, int r17, int r18) {
        /*
        r0 = r16;
        r0 = r0.body;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 81181341; // 0x4d6ba9d float:5.0482535E-36 double:4.01089117E-316;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r18 = p000.client.type;
        r2 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        if (r0 <= r1) goto L_0x01b8;
    L_0x001e:
        r2 = -446476644; // 0xffffffffe5634e9c float:-6.7089205E22 double:NaN;
        r0 = r16;
        p000.CSVReader.add(r0, r2);	 Catch:{ RuntimeException -> 0x032a }
    L_0x0026:
        r0 = r16;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r17;
        if (r0 < r2) goto L_0x0076;
    L_0x003a:
        r0 = r16;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r17;
        if (r0 < r2) goto L_0x0076;
    L_0x004e:
        r0 = r16;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = 13184; // 0x3380 float:1.8475E-41 double:6.514E-320;
        r0 = r17;
        if (r0 >= r2) goto L_0x0076;
    L_0x0062:
        r0 = r16;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = 13184; // 0x3380 float:1.8475E-41 double:6.514E-320;
        r0 = r17;
        if (r0 < r2) goto L_0x00e3;
    L_0x0076:
        r2 = 2033542925; // 0x7935670d float:5.886849E34 double:1.0047036986E-314;
        r0 = r16;
        r0.data = r2;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 2015474731; // 0x7821b42b float:1.3118969E34 double:9.957768246E-315;
        r0 = r16;
        r0.state = r2;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 0;
        r0 = r16;
        r0.body = r2;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 0;
        r0 = r16;
        r0.title = r2;	 Catch:{ RuntimeException -> 0x032a }
        r0 = r16;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 962703424; // 0x3961b040 float:2.152333E-4 double:4.75638689E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r0 = r16;
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 0;
        r18 = r3[r2];	 Catch:{ RuntimeException -> 0x032a }
        r2 = -399324032; // 0xffffffffe832cc80 float:-3.3774144E24 double:NaN;
        r18 = r2 * r18;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r1 = r16;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x032a }
        r0 = r16;
        r3 = r0.length;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 0;
        r17 = r3[r2];	 Catch:{ RuntimeException -> 0x032a }
        r2 = 698183808; // 0x299d7080 float:6.991716E-14 double:3.44948634E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r0 = r16;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x032a }
        r18 = r0;
        r2 = -1948888512; // 0xffffffff8bd65240 float:-8.255356E-32 double:NaN;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r1 = r16;
        r1.value = r0;	 Catch:{ RuntimeException -> 0x032a }
        r2 = -38898407; // 0xfffffffffdae7519 float:-2.898671E37 double:NaN;
        r0 = r16;
        r0.add(r2);	 Catch:{ RuntimeException -> 0x032a }
    L_0x00e3:
        r4 = p000.File.this$0;
        r0 = r16;
        if (r0 != r4) goto L_0x01a9;
    L_0x00e9:
        r0 = r16;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        r0 = r17;
        if (r0 < r2) goto L_0x0139;
    L_0x00fd:
        r0 = r16;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
        r0 = r17;
        if (r0 < r2) goto L_0x0139;
    L_0x0111:
        r0 = r16;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        r0 = r17;
        if (r0 >= r2) goto L_0x0139;
    L_0x0125:
        r0 = r16;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = 11776; // 0x2e00 float:1.6502E-41 double:5.818E-320;
        r0 = r17;
        if (r0 < r2) goto L_0x01a9;
    L_0x0139:
        r2 = 2033542925; // 0x7935670d float:5.886849E34 double:1.0047036986E-314;
        r0 = r16;
        r0.data = r2;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 2015474731; // 0x7821b42b float:1.3118969E34 double:9.957768246E-315;
        r0 = r16;
        r0.state = r2;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 0;
        r0 = r16;
        r0.body = r2;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 0;
        r0 = r16;
        r0.title = r2;	 Catch:{ RuntimeException -> 0x032a }
        r0 = r16;
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 0;
        r17 = r3[r2];	 Catch:{ RuntimeException -> 0x032a }
        r2 = -399324032; // 0xffffffffe832cc80 float:-3.3774144E24 double:NaN;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r0 = r16;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x032a }
        r18 = r0;
        r2 = 962703424; // 0x3961b040 float:2.152333E-4 double:4.75638689E-315;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r1 = r16;
        r1.size = r0;	 Catch:{ RuntimeException -> 0x032a }
        r0 = r16;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = -1948888512; // 0xffffffff8bd65240 float:-8.255356E-32 double:NaN;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r0 = r16;
        r3 = r0.length;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 0;
        r18 = r3[r2];	 Catch:{ RuntimeException -> 0x032a }
        r2 = 698183808; // 0x299d7080 float:6.991716E-14 double:3.44948634E-315;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r0 = r0 + r1;
        r17 = r0;
        r1 = r16;
        r1.value = r0;	 Catch:{ RuntimeException -> 0x032a }
        r2 = -38898407; // 0xfffffffffdae7519 float:-2.898671E37 double:NaN;
        r0 = r16;
        r0.add(r2);	 Catch:{ RuntimeException -> 0x032a }
    L_0x01a9:
        r2 = -109; // 0xffffffffffffff93 float:NaN double:NaN;
        r0 = r16;
        p000.IOException.add(r0, r2);	 Catch:{ RuntimeException -> 0x032a }
        r2 = -49;
        r0 = r16;
        p000.ByteArray.write(r0, r2);	 Catch:{ RuntimeException -> 0x032a }
        return;
    L_0x01b8:
        r0 = r16;
        r0 = r0.title;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = -216586625; // 0xfffffffff317267f float:-1.1975367E31 double:NaN;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r18 = p000.client.type;
        r2 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x0345;
    L_0x01d6:
        r17 = p000.client.type;
        r2 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r0 = r16;
        r0 = r0.title;	 Catch:{ RuntimeException -> 0x032a }
        r18 = r0;
        r2 = -216586625; // 0xfffffffff317267f float:-1.1975367E31 double:NaN;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        if (r0 == r1) goto L_0x0250;
    L_0x01f4:
        r0 = r16;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r2 = -1;
        r0 = r17;
        if (r2 == r0) goto L_0x0250;
    L_0x0207:
        r0 = r16;
        r0 = r0.start;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 1913892303; // 0x7213adcf float:2.9250828E30 double:9.455884368E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        if (r17 != 0) goto L_0x0250;
    L_0x0217:
        r0 = r16;
        r0 = r0.limit;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = -829213351; // 0xffffffffce933559 float:-1.23487347E9 double:NaN;
        r17 = r2 * r17;
        r17 = r17 + 1;
        r0 = r16;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x032a }
        r18 = r0;
        r2 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r2 = 785603082; // 0x2ed35a0a float:9.611163E-11 double:3.88139494E-315;
        r0 = r18;
        r5 = p000.AbstractBuffer.get(r0, r2);	 Catch:{ RuntimeException -> 0x032a }
        r3 = r5.buffer;	 Catch:{ RuntimeException -> 0x032a }
        r0 = r16;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x032a }
        r18 = r0;
        r2 = 1816971127; // 0x6c4cc777 float:9.9025125E26 double:8.977030133E-315;
        r18 = r2 * r18;
        r18 = r3[r18];	 Catch:{ RuntimeException -> 0x032a }
        r0 = r17;
        r1 = r18;
        if (r0 <= r1) goto L_0x02fe;
    L_0x0250:
        r0 = r16;
        r0 = r0.title;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = -216586625; // 0xfffffffff317267f float:-1.1975367E31 double:NaN;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r0 = r16;
        r0 = r0.body;	 Catch:{ RuntimeException -> 0x032a }
        r18 = r0;
        r2 = 81181341; // 0x4d6ba9d float:5.0482535E-36 double:4.01089117E-316;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r0 = r0 - r1;
        r17 = r0;
        r18 = p000.client.type;
        r2 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r0 = r18;
        r0 = r0 * r2;
        r18 = r0;
        r0 = r16;
        r6 = r0.body;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 81181341; // 0x4d6ba9d float:5.0482535E-36 double:4.01089117E-316;
        r6 = r6 * r2;
        r0 = r18;
        r0 = r0 - r6;
        r18 = r0;
        r0 = r16;
        r6 = r0.items;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 549017216; // 0x20b95680 float:3.139746E-19 double:2.712505454E-315;
        r6 = r6 * r2;
        r0 = r16;
        r7 = r0.count;	 Catch:{ RuntimeException -> 0x032a }
        r2 = -144385472; // 0xfffffffff764da40 float:-4.641681E33 double:NaN;
        r7 = r7 * r2;
        r7 = r6 + r7;
        r0 = r16;
        r6 = r0.count;	 Catch:{ RuntimeException -> 0x032a }
        r2 = -144385472; // 0xfffffffff764da40 float:-4.641681E33 double:NaN;
        r6 = r6 * r2;
        r0 = r16;
        r8 = r0.offset;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 717643904; // 0x2ac66080 float:3.5238826E-13 double:3.54563199E-315;
        r8 = r2 * r8;
        r6 = r6 + r8;
        r0 = r16;
        r8 = r0.count;	 Catch:{ RuntimeException -> 0x032a }
        r2 = -144385472; // 0xfffffffff764da40 float:-4.641681E33 double:NaN;
        r8 = r8 * r2;
        r0 = r16;
        r9 = r0.color;	 Catch:{ RuntimeException -> 0x032a }
        r2 = -1680259200; // 0xffffffff9bd94780 float:-3.5945844E-22 double:NaN;
        r9 = r2 * r9;
        r9 = r8 + r9;
        r0 = r16;
        r8 = r0.count;	 Catch:{ RuntimeException -> 0x032a }
        r2 = -144385472; // 0xfffffffff764da40 float:-4.641681E33 double:NaN;
        r8 = r8 * r2;
        r0 = r16;
        r10 = r0.location;	 Catch:{ RuntimeException -> 0x032a }
        r2 = 1759040896; // 0x68d8d580 float:8.1917563E24 double:8.690816763E-315;
        r10 = r10 * r2;
        r8 = r8 + r10;
        r0 = r18;
        r9 = r9 * r0;
        r10 = r17 - r18;
        r7 = r7 * r10;
        r7 = r7 + r9;
        r0 = r17;
        r7 = r7 / r0;
        r2 = 1506829721; // 0x59d06599 float:7.3323129E15 double:7.444727993E-315;
        r7 = r7 * r2;
        r0 = r16;
        r0.size = r7;	 Catch:{ RuntimeException -> 0x032a }
        r7 = r17 - r18;
        r6 = r7 * r6;
        r0 = r18;
        r0 = r0 * r8;
        r18 = r0;
        r0 = r0 + r6;
        r18 = r0;
        r17 = r18 / r17;
        r2 = -1638712607; // 0xffffffff9e533ae1 float:-1.1182423E-20 double:NaN;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r1 = r16;
        r1.value = r0;	 Catch:{ RuntimeException -> 0x032a }
    L_0x02fe:
        r2 = 0;
        r0 = r16;
        r0.height = r2;	 Catch:{ RuntimeException -> 0x032a }
        r0 = r16;
        r0 = r0.uri;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = 1060454559; // 0x3f35409f float:0.7080173 double:5.239341666E-315;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r1 = r16;
        r1.name = r0;	 Catch:{ RuntimeException -> 0x032a }
        r0 = r16;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x032a }
        r17 = r0;
        r2 = -376326741; // 0xffffffffe991b5ab float:-2.2019018E25 double:NaN;
        r0 = r17;
        r0 = r0 * r2;
        r17 = r0;
        r1 = r16;
        r1.index = r0;	 Catch:{ RuntimeException -> 0x032a }
        goto L_0x0026;
    L_0x032a:
        r11 = move-exception;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = "lq.bj(";
        r12 = r12.append(r13);
        r2 = 41;
        r12 = r12.append(r2);
        r14 = r12.toString();
        r15 = p000.StringBuilder.append(r11, r14);
        throw r15;
    L_0x0345:
        r2 = 1037211688; // 0x3dd29828 float:0.10282928 double:5.124506625E-315;
        r0 = r16;
        p000.Namespace.set(r0, r2);	 Catch:{ RuntimeException -> 0x032a }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: Label.add(Collection, int, int):void");
    }

    static boolean add(int i) {
        return ((client.message * 1424263497) & 8) != 0;
    }

    public static Label[] draw() {
        return new Label[]{f171c, f173i, f174k, f170b, f172h, f169a};
    }

    public static Label[] equals() {
        return new Label[]{f171c, f173i, f174k, f170b, f172h, f169a};
    }

    public static int log(int $i0, int i, int $i1, int i2, int i3, int $i2, int i4) {
        if (($i2 & 1) != 1) {
            $i2 = i3;
            i3 = i2;
            i2 = $i2;
        }
        $i1 &= 3;
        if ($i1 == 0) {
            return i;
        }
        if ($i1 == 1) {
            $i0 = (7 - $i0) - (i3 - 1);
        } else if ($i1 == 2) {
            return (7 - i) - (i2 - 1);
        }
        return $i0;
    }

    public static Label[] toString(byte b) {
        try {
            Label[] $r0 = new Label[6];
            $r0[0] = f171c;
            $r0[1] = f173i;
            $r0[2] = f174k;
            $r0[3] = f170b;
            $r0[4] = f172h;
            $r0[5] = f169a;
            return $r0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lq.af(" + ')');
        }
    }
}
