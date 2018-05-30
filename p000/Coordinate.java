package p000;

/* compiled from: ez */
public class Coordinate extends State {
    static HttpRequest size;
    public static Base64 value;
    public int count;
    public int this$0;
    public int f35y;

    Coordinate() {
        try {
            this.this$0 = -1820808767;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ez.<init>(" + ')');
        }
    }

    static void add(int i, int i2, int i3, int i4, int i5) {
        Region $r3 = (Region) Region.value.get((long) i);
        if ($r3 == null) {
            $r3 = new Region();
            Region.value.get($r3, (long) i);
        }
        int length = $r3.size.length;
        i = length;
        if (length <= i2) {
            int[] $r0 = new int[(i2 + 1)];
            int[] $r4 = new int[(i2 + 1)];
            i = 0;
            while (i < $r3.size.length) {
                try {
                    $r0[i] = $r3.size[i];
                    $r4[i] = $r3.data[i];
                    i++;
                } catch (RuntimeException $r6) {
                    throw StringBuilder.append($r6, "ez.an(" + ')');
                }
            }
            for (i = $r3.size.length; i < i2; i++) {
                $r0[i] = -1;
                $r4[i] = 0;
            }
            $r3.size = $r0;
            $r3.data = $r4;
        }
        $r3.size[i2] = i3;
        $r3.data[i2] = i4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void read(boolean r42, p000.Handler r43, byte r44) {
        /*
        r8 = 0;
        p000.client.f408y = r8;
        r8 = 0;
        p000.client.f403s = r8;
        r9 = p000.client.this$0;
        r10 = r9.this$0;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1565299499; // 0x5d4c932b float:9.2132333E17 double:7.73360708E-315;
        r10.debug(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 8;
        r12 = -3;
        r11 = r10.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r13 = p000.client.length;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r13 = r8 * r13;
        if (r11 >= r13) goto L_0x086f;
    L_0x0020:
        r13 = r11;
    L_0x0021:
        r14 = p000.client.length;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r14 = r14 * r8;
        if (r13 >= r14) goto L_0x086f;
    L_0x0029:
        r15 = p000.client.f383M;
        r14 = p000.client.f408y;
        r8 = 549087301; // 0x20ba6845 float:3.1578625E-19 double:2.71285172E-315;
        r14 = r14 + r8;
        p000.client.f408y = r14;
        r8 = -402101619; // 0xffffffffe8086a8d float:-2.5768294E24 double:NaN;
        r14 = r14 * r8;
        r14 = r14 + -1;
        r16 = p000.client.hasNext;
        r17 = r16[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        r15[r14] = r17;	 Catch:{ RuntimeException -> 0x00e0 }
        r13 = r13 + 1;
        goto L_0x0021;
    L_0x0042:
        r8 = 1;
        r0 = r17;
        if (r8 != r0) goto L_0x07e7;
    L_0x0047:
        r15 = p000.client.hasNext;
        r17 = p000.client.length;
        r8 = -1235796565; // 0xffffffffb6573dab float:-3.2073392E-6 double:NaN;
        r0 = r17;
        r0 = r0 + r8;
        r17 = r0;
        p000.client.length = r17;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r17 = r17 + -1;
        r15[r17] = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = p000.client.type;
        r8 = -92345463; // 0xfffffffffa7eeb89 float:-3.3090516E35 double:NaN;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r1 = r18;
        r1.f80y = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 3;
        r12 = -36;
        r17 = r10.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1;
        r12 = -121; // 0xffffffffffffff87 float:NaN double:NaN;
        r0 = r18;
        r1 = r17;
        r0.add(r1, r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1;
        r12 = -5;
        r17 = r10.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1;
        r0 = r17;
        if (r8 != r0) goto L_0x00a5;
    L_0x008b:
        r15 = p000.client.read;
        r17 = p000.client.f403s;
        r8 = 757154825; // 0x2d214409 float:9.166897E-12 double:3.740841876E-315;
        r0 = r17;
        r0 = r0 + r8;
        r17 = r0;
        p000.client.f403s = r17;
        r8 = -967603655; // 0xffffffffc6538a39 float:-13538.556 double:NaN;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r17 = r17 + -1;
        r15[r17] = r14;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x00a5:
        r13 = r13 + 1;
    L_0x00a7:
        if (r13 >= r11) goto L_0x0657;
    L_0x00a9:
        r15 = p000.client.hasNext;
        r14 = r15[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        r19 = p000.client.next;
        r18 = r19[r14];	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1;
        r12 = -123; // 0xffffffffffffff85 float:NaN double:NaN;
        r17 = r10.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        if (r17 != 0) goto L_0x06f9;
    L_0x00ba:
        r15 = p000.client.hasNext;
        r17 = p000.client.length;
        r8 = -1235796565; // 0xffffffffb6573dab float:-3.2073392E-6 double:NaN;
        r0 = r17;
        r0 = r0 + r8;
        r17 = r0;
        p000.client.length = r17;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r17 = r17 + -1;
        r15[r17] = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r14 = p000.client.type;
        r8 = -92345463; // 0xfffffffffa7eeb89 float:-3.3090516E35 double:NaN;
        r14 = r8 * r14;
        r0 = r18;
        r0.f80y = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        goto L_0x00a5;
    L_0x00e0:
        r20 = move-exception;
        r21 = new java.lang.StringBuilder;
        r0 = r21;
        r0.<init>();
        r22 = "ez.df(";
        r0 = r21;
        r1 = r22;
        r21 = r0.append(r1);
        r8 = 41;
        r0 = r21;
        r21 = r0.append(r8);
        r0 = r21;
        r23 = r0.toString();
        r0 = r20;
        r1 = r23;
        r24 = p000.StringBuilder.append(r0, r1);
        throw r24;
    L_0x0109:
        r14 = r13 & 8;
        if (r14 == 0) goto L_0x01aa;
    L_0x010d:
        r8 = 1752567216; // 0x68760db0 float:4.6478186E24 double:8.658832535E-315;
        r0 = r43;
        r25 = r0.get(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 887752143; // 0x34ea05cf float:4.3590123E-7 double:4.38607836E-315;
        r0 = r43;
        r14 = r0.encode(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r26 = p000.Build$VERSION.type;
        r8 = 1407993063; // 0x53ec44e7 float:2.02953654E12 double:6.95641002E-315;
        r0 = r26;
        r0 = r0 * r8;
        r26 = r0;
        r0 = r25;
        r1 = r26;
        r0 = r0 - r1;
        r25 = r0;
        r26 = p000.Build$VERSION.type;
        r8 = 1407993063; // 0x53ec44e7 float:2.02953654E12 double:6.95641002E-315;
        r0 = r26;
        r0 = r0 * r8;
        r26 = r0;
        r0 = r25;
        r1 = r26;
        r0 = r0 - r1;
        r25 = r0;
        r25 = r25 * 64;
        r0 = r17;
        r1 = r25;
        r0 = r0 - r1;
        r17 = r0;
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r25 = r0;
        r8 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r0 = r25;
        r0 = r0 * r8;
        r25 = r0;
        r26 = p000.Level.type;
        r8 = 1289967967; // 0x4ce3595f float:1.19196408E8 double:6.373288567E-315;
        r0 = r26;
        r0 = r0 * r8;
        r26 = r0;
        r14 = r14 - r0;
        r26 = p000.Level.type;
        r8 = 1289967967; // 0x4ce3595f float:1.19196408E8 double:6.373288567E-315;
        r26 = r8 * r26;
        r0 = r26;
        r14 = r14 - r0;
        r14 = r14 * 64;
        r14 = r25 - r14;
        if (r17 != 0) goto L_0x0183;
    L_0x0181:
        if (r14 == 0) goto L_0x01aa;
    L_0x0183:
        r0 = r17;
        r0 = (double) r0;
        r27 = r0;
        r0 = (double) r14;
        r29 = r0;
        r0 = r27;
        r2 = r29;
        r27 = java.lang.Math.atan2(r0, r2);	 Catch:{ RuntimeException -> 0x00e0 }
        r31 = 4644441771640602231; // 0x40745f2f1a9fbe77 float:6.606857E-23 double:325.949;
        r0 = r27;
        r2 = r31;
        r0 = r0 * r2;
        r27 = r0;
        r14 = (int) r0;
        r14 = r14 & 2047;
        r8 = 464408867; // 0x1bae5123 float:2.8838319E-22 double:2.29448467E-315;
        r14 = r14 * r8;
        r0 = r18;
        r0.next = r14;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x01aa:
        r14 = r13 & 16;
        if (r14 == 0) goto L_0x0225;
    L_0x01ae:
        r8 = 2020122778; // 0x7868a09a float:1.8872973E34 double:9.98073265E-315;
        r0 = r43;
        r14 = r0.get(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -2015474731; // 0xffffffff87de4bd5 float:-3.3447418E-34 double:NaN;
        r14 = r14 * r8;
        r0 = r18;
        r0.state = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -94;
        r0 = r43;
        r14 = r0.next(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r14 >> 16;
        r8 = -2073088321; // 0xffffffff846f2ebf float:-2.811578E-36 double:NaN;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r1 = r18;
        r1.active = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = p000.client.type;
        r8 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r17 = r8 * r17;
        r8 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r14 = r14 & r8;
        r0 = r17;
        r14 = r14 + r0;
        r8 = 243104753; // 0xe7d7bf1 float:3.1244333E-30 double:1.20109707E-315;
        r14 = r14 * r8;
        r0 = r18;
        r0.out = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r0 = r18;
        r0.f62a = r8;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r0 = r18;
        r0.f64c = r8;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r14 = r0.out;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 645928209; // 0x26801511 float:8.887494E-16 double:3.191309377E-315;
        r14 = r8 * r14;
        r17 = p000.client.type;
        r8 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        if (r14 <= r0) goto L_0x0211;
    L_0x020a:
        r8 = 367216679; // 0x15e34827 float:9.1798406E-26 double:1.814291457E-315;
        r0 = r18;
        r0.f62a = r8;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0211:
        r0 = r18;
        r14 = r0.state;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 269129085; // 0x100a957d float:2.7330863E-29 double:1.32967435E-315;
        r14 = r14 * r8;
        r8 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r8 != r14) goto L_0x0225;
    L_0x021e:
        r8 = 2015474731; // 0x7821b42b float:1.3118969E34 double:9.957768246E-315;
        r0 = r18;
        r0.state = r8;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0225:
        r14 = r13 & 4;
        if (r14 == 0) goto L_0x0297;
    L_0x0229:
        r8 = -1005835619; // 0xffffffffc40c2a9d float:-560.66583 double:NaN;
        r0 = r43;
        r14 = r0.getName(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r14;
        r8 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r8 != r14) goto L_0x023b;
    L_0x0239:
        r17 = -1;
    L_0x023b:
        r8 = 1359628204; // 0x510a47ac float:3.7119246E10 double:6.717455867E-315;
        r0 = r43;
        r14 = r0.decode(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00e0 }
        r25 = r0;
        r8 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r25 = r8 * r25;
        r0 = r17;
        r1 = r25;
        if (r0 != r1) goto L_0x0413;
    L_0x0255:
        r8 = -1;
        r0 = r17;
        if (r8 == r0) goto L_0x0413;
    L_0x025a:
        r8 = 1878937083; // 0x6ffe4dfb float:1.5740693E29 double:9.283182634E-315;
        r0 = r17;
        r33 = p000.AbstractBuffer.get(r0, r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r33;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = 493411451; // 0x1d68dc7b float:3.081893E-21 double:2.43777647E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r8 = 1;
        r0 = r17;
        if (r8 != r0) goto L_0x028d;
    L_0x0276:
        r8 = 0;
        r0 = r18;
        r0.position = r8;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r0 = r18;
        r0.limit = r8;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -464504529; // 0xffffffffe450392f float:-1.5364173E22 double:NaN;
        r14 = r14 * r8;
        r0 = r18;
        r0.start = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r0 = r18;
        r0.first = r8;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x028d:
        r8 = 2;
        r0 = r17;
        if (r8 != r0) goto L_0x0297;
    L_0x0292:
        r8 = 0;
        r0 = r18;
        r0.first = r8;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0297:
        r14 = r13 & 64;
        if (r14 == 0) goto L_0x0342;
    L_0x029b:
        r8 = -257789126; // 0xfffffffff0a2733a float:-4.0220698E29 double:NaN;
        r0 = r43;
        r14 = r0.get(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 100;
        r34 = p000.Thread.add(r14, r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r34;
        r1 = r18;
        r1.value = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.size;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1197001545; // 0x4758cb49 float:55499.285 double:5.913973414E-315;
        r14 = r14 * r8;
        r0 = r18;
        r0.count = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.f365b;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -448214397; // 0xffffffffe548ca83 float:-5.926306E22 double:NaN;
        r14 = r14 * r8;
        r0 = r18;
        r0.f76s = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.state;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -1666788173; // 0xffffffff9ca6d4b3 float:-1.103994E-21 double:NaN;
        r14 = r8 * r14;
        r0 = r18;
        r0.flags = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.out;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -1858657423; // 0xffffffff91372371 float:-1.4447076E-28 double:NaN;
        r14 = r14 * r8;
        r0 = r18;
        r0.min = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.log;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -1864285277; // 0xffffffff90e143a3 float:-8.885106E-29 double:NaN;
        r14 = r14 * r8;
        r0 = r18;
        r0.max = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.active;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1276211489; // 0x4c117121 float:3.8126724E7 double:6.305322535E-315;
        r14 = r8 * r14;
        r0 = r18;
        r0.f79x = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.name;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 351400791; // 0x14f1f357 float:2.4430762E-26 double:1.73615059E-315;
        r14 = r14 * r8;
        r0 = r18;
        r0.type = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.min;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 199040615; // 0xbdd1e67 float:8.517185E-32 double:9.833913E-316;
        r14 = r14 * r8;
        r0 = r18;
        r0.status = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r14 = r0.f366i;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1383034215; // 0x526f6d67 float:2.57083163E11 double:6.833096927E-315;
        r14 = r14 * r8;
        r0 = r18;
        r0.f69i = r14;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0342:
        r13 = r13 & 1;
        if (r13 == 0) goto L_0x035c;
    L_0x0346:
        r8 = 1434564143; // 0x5581b62f float:1.78274341E13 double:7.0876886E-315;
        r0 = r43;
        r23 = r0.toString(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r23;
        r1 = r18;
        r1.f63b = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -206649612; // 0xfffffffff3aec6f4 float:-2.7694547E31 double:NaN;
        r0 = r18;
        r0.buffer = r8;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x035c:
        r11 = r11 + 1;
    L_0x035e:
        r13 = p000.client.f403s;
        r8 = -967603655; // 0xffffffffc6538a39 float:-13538.556 double:NaN;
        r13 = r8 * r13;
        if (r11 >= r13) goto L_0x07ad;
    L_0x0367:
        r15 = p000.client.read;
        r13 = r15[r11];	 Catch:{ RuntimeException -> 0x00e0 }
        r19 = p000.client.next;
        r18 = r19[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r0 = r43;
        r13 = r0.get(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r14 = r13 & 2;
        if (r14 == 0) goto L_0x03a0;
    L_0x037a:
        r8 = 807792926; // 0x3025f11e float:6.03693E-10 double:3.991027337E-315;
        r0 = r43;
        r14 = r0.encode(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1968525927; // 0x75555267 float:2.7041761E32 double:9.725810335E-315;
        r14 = r14 * r8;
        r0 = r18;
        r0.key = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r14 = r0.key;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -609375913; // 0xffffffffdbada957 float:-9.7762724E16 double:NaN;
        r14 = r8 * r14;
        r8 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r8 != r14) goto L_0x03a0;
    L_0x0399:
        r8 = -1968525927; // 0xffffffff8aaaad99 float:-1.6435705E-32 double:NaN;
        r0 = r18;
        r0.key = r8;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x03a0:
        r14 = r13 & 32;
        if (r14 == 0) goto L_0x0109;
    L_0x03a4:
        r8 = 2127339229; // 0x7ecc9edd float:1.3599369E38 double:1.05104523E-314;
        r0 = r43;
        r14 = r0.decode(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        if (r14 <= 0) goto L_0x06eb;
    L_0x03af:
        r17 = 0;
    L_0x03b1:
        r0 = r17;
        if (r0 >= r14) goto L_0x06eb;
    L_0x03b5:
        r26 = -1;
        r35 = -1;
        r36 = -1;
        r8 = 87;
        r0 = r43;
        r37 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r25 = r37;
        r8 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r0 = r37;
        if (r0 != r8) goto L_0x06da;
    L_0x03cb:
        r8 = 3;
        r0 = r43;
        r25 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 25;
        r0 = r43;
        r26 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r35 = r26;
        r8 = 67;
        r0 = r43;
        r26 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 21;
        r0 = r43;
        r36 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x03ec:
        r8 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r0 = r43;
        r37 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r38 = p000.client.type;
        r8 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r38 = r8 * r38;
        r8 = -1380243778; // 0xffffffffadbb26be float:-2.1276644E-11 double:NaN;
        r0 = r18;
        r1 = r25;
        r2 = r35;
        r3 = r26;
        r4 = r36;
        r5 = r38;
        r6 = r37;
        r7 = r8;
        r0.init(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r17 + 1;
        goto L_0x03b1;
    L_0x0413:
        r8 = -1;
        r0 = r17;
        if (r8 == r0) goto L_0x046a;
    L_0x0418:
        r0 = r18;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00e0 }
        r25 = r0;
        r8 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r0 = r25;
        r0 = r0 * r8;
        r25 = r0;
        r8 = -1;
        r0 = r25;
        if (r0 == r8) goto L_0x046a;
    L_0x042b:
        r8 = 625958175; // 0x254f5d1f float:1.7985939E-16 double:3.0926443E-315;
        r0 = r17;
        r33 = p000.AbstractBuffer.get(r0, r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r33;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x00e0 }
        r25 = r0;
        r8 = -2086360965; // 0xffffffff83a4a87b float:-9.677735E-37 double:NaN;
        r0 = r25;
        r0 = r0 * r8;
        r25 = r0;
        r0 = r18;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x00e0 }
        r26 = r0;
        r8 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r26 = r8 * r26;
        r8 = 2119992516; // 0x7e5c84c4 float:7.327988E37 double:1.0474154716E-314;
        r0 = r26;
        r33 = p000.AbstractBuffer.get(r0, r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r33;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x00e0 }
        r26 = r0;
        r8 = -2086360965; // 0xffffffff83a4a87b float:-9.677735E-37 double:NaN;
        r0 = r26;
        r0 = r0 * r8;
        r26 = r0;
        r0 = r25;
        r1 = r26;
        if (r0 < r1) goto L_0x0297;
    L_0x046a:
        r8 = -2033542925; // 0xffffffff86ca98f3 float:-7.6208694E-35 double:NaN;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r1 = r18;
        r1.data = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r0 = r18;
        r0.position = r8;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r0 = r18;
        r0.limit = r8;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -464504529; // 0xffffffffe450392f float:-1.5364173E22 double:NaN;
        r14 = r8 * r14;
        r0 = r18;
        r0.start = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r0 = r18;
        r0.first = r8;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r14 = r0.parent;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -709529395; // 0xffffffffd5b570cd float:-2.493701E13 double:NaN;
        r14 = r8 * r14;
        r0 = r18;
        r0.width = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        goto L_0x0297;
    L_0x049e:
        r39 = 0;
        r19 = p000.client.next;
        r18 = r19[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        if (r18 != 0) goto L_0x04b3;
    L_0x04a6:
        r19 = p000.client.next;
        r18 = new Time;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x00e0 }
        r19[r13] = r18;	 Catch:{ RuntimeException -> 0x00e0 }
        r39 = 1;
    L_0x04b3:
        r19 = p000.client.next;
        r18 = r19[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        r15 = p000.client.hasNext;
        r11 = p000.client.length;
        r8 = -1235796565; // 0xffffffffb6573dab float:-3.2073392E-6 double:NaN;
        r11 = r11 + r8;
        p000.client.length = r11;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r11 = r11 * r8;
        r11 = r11 + -1;
        r15[r11] = r13;	 Catch:{ RuntimeException -> 0x00e0 }
        r11 = p000.client.type;
        r8 = -92345463; // 0xfffffffffa7eeb89 float:-3.3090516E35 double:NaN;
        r11 = r11 * r8;
        r0 = r18;
        r0.f80y = r11;	 Catch:{ RuntimeException -> 0x00e0 }
        if (r42 == 0) goto L_0x0884;
    L_0x04d5:
        r8 = 8;
        r12 = -118; // 0xffffffffffffff8a float:NaN double:NaN;
        r0 = r43;
        r14 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r11 = r14;
        r8 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r14 <= r8) goto L_0x04e6;
    L_0x04e4:
        r11 = r14 + -256;
    L_0x04e6:
        r8 = 1;
        r12 = -30;
        r0 = r43;
        r14 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1;
        if (r14 != r8) goto L_0x0504;
    L_0x04f2:
        r15 = p000.client.read;
        r14 = p000.client.f403s;
        r8 = 757154825; // 0x2d214409 float:9.166897E-12 double:3.740841876E-315;
        r14 = r14 + r8;
        p000.client.f403s = r14;
        r8 = -967603655; // 0xffffffffc6538a39 float:-13538.556 double:NaN;
        r14 = r14 * r8;
        r14 = r14 + -1;
        r15[r14] = r13;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0504:
        r15 = p000.client.capacity;
        r8 = 3;
        r12 = -73;
        r0 = r43;
        r13 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r13 = r15[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        if (r39 == 0) goto L_0x0524;
    L_0x0513:
        r8 = 1955545995; // 0x748f438b float:9.080425E31 double:9.66168095E-315;
        r13 = r8 * r13;
        r0 = r18;
        r0.index = r13;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -1314677501; // 0xffffffffb1a39d03 float:-4.7617745E-9 double:NaN;
        r13 = r13 * r8;
        r0 = r18;
        r0.name = r13;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0524:
        r8 = 1;
        r12 = -45;
        r0 = r43;
        r13 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        if (r42 == 0) goto L_0x0797;
    L_0x052f:
        r8 = 8;
        r12 = -71;
        r0 = r43;
        r17 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r14 = r17;
        r8 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r17;
        if (r0 <= r8) goto L_0x0545;
    L_0x0541:
        r0 = r17;
        r14 = r0 + -256;
    L_0x0545:
        r8 = 14;
        r12 = -19;
        r0 = r43;
        r17 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 77;
        r0 = r17;
        r34 = p000.Thread.add(r0, r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r34;
        r1 = r18;
        r1.value = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = 1197001545; // 0x4758cb49 float:55499.285 double:5.913973414E-315;
        r17 = r8 * r17;
        r0 = r17;
        r1 = r18;
        r1.count = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.f365b;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = -448214397; // 0xffffffffe548ca83 float:-5.926306E22 double:NaN;
        r17 = r8 * r17;
        r0 = r17;
        r1 = r18;
        r1.f76s = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.f76s;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = 1791262809; // 0x6ac48059 float:1.1877778E26 double:8.850014166E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        if (r17 != 0) goto L_0x059c;
    L_0x0597:
        r8 = 0;
        r0 = r18;
        r0.index = r8;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x059c:
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.state;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = -1666788173; // 0xffffffff9ca6d4b3 float:-1.103994E-21 double:NaN;
        r17 = r8 * r17;
        r0 = r17;
        r1 = r18;
        r1.flags = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.out;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = -1858657423; // 0xffffffff91372371 float:-1.4447076E-28 double:NaN;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r1 = r18;
        r1.min = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = -1864285277; // 0xffffffff90e143a3 float:-8.885106E-29 double:NaN;
        r17 = r8 * r17;
        r0 = r17;
        r1 = r18;
        r1.max = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.active;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = 1276211489; // 0x4c117121 float:3.8126724E7 double:6.305322535E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r1 = r18;
        r1.f79x = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = 351400791; // 0x14f1f357 float:2.4430762E-26 double:1.73615059E-315;
        r17 = r8 * r17;
        r0 = r17;
        r1 = r18;
        r1.type = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.min;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = 199040615; // 0xbdd1e67 float:8.517185E-32 double:9.833913E-316;
        r17 = r8 * r17;
        r0 = r17;
        r1 = r18;
        r1.status = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00e0 }
        r34 = r0;
        r0 = r0.f366i;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = r0;
        r8 = 1383034215; // 0x526f6d67 float:2.57083163E11 double:6.833096927E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r1 = r18;
        r1.f69i = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r40 = p000.File.this$0;
        r0 = r40;
        r15 = r0.this$0;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r17 = r15[r8];	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r17;
        r11 = r11 + r0;
        r40 = p000.File.this$0;
        r0 = r40;
        r15 = r0.length;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 0;
        r17 = r15[r8];	 Catch:{ RuntimeException -> 0x00e0 }
        r14 = r17 + r14;
        r8 = 1;
        if (r13 != r8) goto L_0x08b9;
    L_0x064c:
        r39 = 1;
    L_0x064e:
        r8 = -19936; // 0xffffffffffffb220 float:NaN double:NaN;
        r0 = r18;
        r1 = r39;
        r0.add(r11, r14, r1, r8);	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0657:
        r9 = p000.client.this$0;
        r11 = r9.size;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 414296057; // 0x18b1a7f9 float:4.5923037E-24 double:2.04689449E-315;
        r11 = r11 * r8;
        r8 = 1;
        r0 = r43;
        r11 = r0.getType(r11, r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 27;
        if (r11 >= r8) goto L_0x085e;
    L_0x066a:
        r8 = 1885733558; // 0x706602b6 float:2.8473932E29 double:9.31676168E-315;
        r0 = r43;
        r0.create(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r11 = 0;
        goto L_0x035e;
    L_0x0676:
        r8 = 0;
        p000.client.length = r8;
        r13 = 0;
        goto L_0x00a7;
    L_0x067d:
        r8 = 2066656122; // 0x7b2eab7a float:9.069376E35 double:1.0210637916E-314;
        r0 = r18;
        r1 = r25;
        r0.get(r1, r8);	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0687:
        r17 = r17 + 1;
    L_0x0689:
        r0 = r17;
        if (r0 >= r14) goto L_0x0109;
    L_0x068d:
        r8 = 64;
        r0 = r43;
        r25 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 95;
        r0 = r43;
        r26 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r0 = r26;
        if (r8 == r0) goto L_0x067d;
    L_0x06a3:
        r8 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r0 = r43;
        r35 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -595784155; // 0xffffffffdc7d0e25 float:-2.84914885E17 double:NaN;
        r0 = r43;
        r36 = r0.read(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        if (r26 <= 0) goto L_0x090a;
    L_0x06b6:
        r8 = -835952025; // 0xffffffffce2c6267 float:-7.2303251E8 double:NaN;
        r0 = r43;
        r37 = r0.read(r8);	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x06bf:
        r38 = p000.client.type;
        r8 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r38 = r8 * r38;
        r8 = 0;
        r0 = r18;
        r1 = r25;
        r2 = r38;
        r3 = r26;
        r4 = r35;
        r5 = r36;
        r6 = r37;
        r7 = r8;
        r0.get(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x00e0 }
        goto L_0x0687;
    L_0x06da:
        r8 = 32766; // 0x7ffe float:4.5915E-41 double:1.61886E-319;
        r0 = r37;
        if (r0 == r8) goto L_0x08be;
    L_0x06e0:
        r8 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0 = r43;
        r35 = r0.add(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        goto L_0x03ec;
    L_0x06eb:
        r8 = -1999743292; // 0xffffffff88ce56c4 float:-1.24185725E-33 double:NaN;
        r0 = r43;
        r14 = r0.read(r8);	 Catch:{ RuntimeException -> 0x00e0 }
        if (r14 <= 0) goto L_0x0109;
    L_0x06f6:
        r17 = 0;
        goto L_0x0689;
    L_0x06f9:
        r8 = 2;
        r12 = -47;
        r17 = r10.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        if (r17 != 0) goto L_0x0042;
    L_0x0702:
        r15 = p000.client.hasNext;
        r17 = p000.client.length;
        r8 = -1235796565; // 0xffffffffb6573dab float:-3.2073392E-6 double:NaN;
        r0 = r17;
        r0 = r0 + r8;
        r17 = r0;
        p000.client.length = r17;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r17 = r17 + -1;
        r15[r17] = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = p000.client.type;
        r8 = -92345463; // 0xfffffffffa7eeb89 float:-3.3090516E35 double:NaN;
        r17 = r8 * r17;
        r0 = r17;
        r1 = r18;
        r1.f80y = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r15 = p000.client.read;
        r17 = p000.client.f403s;
        r8 = 757154825; // 0x2d214409 float:9.166897E-12 double:3.740841876E-315;
        r0 = r17;
        r0 = r0 + r8;
        r17 = r0;
        p000.client.f403s = r17;
        r8 = -967603655; // 0xffffffffc6538a39 float:-13538.556 double:NaN;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r17 = r17 + -1;
        r15[r17] = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        goto L_0x00a5;
    L_0x0746:
        r9 = p000.client.this$0;
        r11 = r9.size;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 414296057; // 0x18b1a7f9 float:4.5923037E-24 double:2.04689449E-315;
        r11 = r8 * r11;
        r0 = r43;
        r13 = r0.data;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r13 = r13 * r8;
        if (r11 == r13) goto L_0x08c3;
    L_0x0759:
        r20 = new java.lang.RuntimeException;
        r21 = new java.lang.StringBuilder;
        r0 = r21;
        r0.<init>();	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r43;
        r11 = r0.data;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r11 = r11 * r8;
        r0 = r21;
        r21 = r0.append(r11);	 Catch:{ RuntimeException -> 0x00e0 }
        r23 = p000.JGitText.length;
        r0 = r21;
        r1 = r23;
        r21 = r0.append(r1);	 Catch:{ RuntimeException -> 0x00e0 }
        r9 = p000.client.this$0;
        r11 = r9.size;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 414296057; // 0x18b1a7f9 float:4.5923037E-24 double:2.04689449E-315;
        r11 = r8 * r11;
        r0 = r21;
        r21 = r0.append(r11);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r21;
        r23 = r0.toString();	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r20;
        r1 = r23;
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00e0 }
        throw r20;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0797:
        r8 = 5;
        r12 = -60;
        r0 = r43;
        r17 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r14 = r17;
        r8 = 15;
        r0 = r17;
        if (r0 <= r8) goto L_0x0545;
    L_0x07a8:
        r14 = r17 + -32;
        goto L_0x0545;
    L_0x07ad:
        r11 = 0;
    L_0x07ae:
        r13 = p000.client.f408y;
        r8 = -402101619; // 0xffffffffe8086a8d float:-2.5768294E24 double:NaN;
        r13 = r8 * r13;
        if (r11 >= r13) goto L_0x0746;
    L_0x07b7:
        r15 = p000.client.f383M;
        r13 = r15[r11];	 Catch:{ RuntimeException -> 0x00e0 }
        r19 = p000.client.next;
        r18 = r19[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r18;
        r14 = r0.f80y;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = -449430453; // 0xffffffffe5363c4b float:-5.378643E22 double:NaN;
        r14 = r14 * r8;
        r17 = p000.client.type;
        r8 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r17 = r8 * r17;
        r0 = r17;
        if (r14 == r0) goto L_0x07e4;
    L_0x07d2:
        r19 = p000.client.next;
        r18 = r19[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        r41 = 0;
        r0 = r41;
        r1 = r18;
        r1.value = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r19 = p000.client.next;
        r41 = 0;
        r19[r13] = r41;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x07e4:
        r11 = r11 + 1;
        goto L_0x07ae;
    L_0x07e7:
        r8 = 2;
        r0 = r17;
        if (r0 != r8) goto L_0x0897;
    L_0x07ec:
        r15 = p000.client.hasNext;
        r17 = p000.client.length;
        r8 = -1235796565; // 0xffffffffb6573dab float:-3.2073392E-6 double:NaN;
        r0 = r17;
        r0 = r0 + r8;
        r17 = r0;
        p000.client.length = r17;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r17 = r17 + -1;
        r15[r17] = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        r17 = p000.client.type;
        r8 = -92345463; // 0xfffffffffa7eeb89 float:-3.3090516E35 double:NaN;
        r17 = r8 * r17;
        r0 = r17;
        r1 = r18;
        r1.f80y = r0;	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 3;
        r12 = -72;
        r17 = r10.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 2;
        r12 = -112; // 0xffffffffffffff90 float:NaN double:NaN;
        r0 = r18;
        r1 = r17;
        r0.add(r1, r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 3;
        r12 = -50;
        r17 = r10.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 2;
        r12 = -100;
        r0 = r18;
        r1 = r17;
        r0.add(r1, r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1;
        r12 = -82;
        r17 = r10.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 1;
        r0 = r17;
        if (r0 != r8) goto L_0x00a5;
    L_0x0841:
        r15 = p000.client.read;
        r17 = p000.client.f403s;
        r8 = 757154825; // 0x2d214409 float:9.166897E-12 double:3.740841876E-315;
        r0 = r17;
        r0 = r0 + r8;
        r17 = r0;
        p000.client.f403s = r17;
        r8 = -967603655; // 0xffffffffc6538a39 float:-13538.556 double:NaN;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r17 = r17 + -1;
        r15[r17] = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        goto L_0x00a5;
    L_0x085e:
        r8 = 15;
        r12 = -50;
        r0 = r43;
        r13 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r8 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r13 != r8) goto L_0x049e;
    L_0x086c:
        goto L_0x066a;
    L_0x086f:
        r13 = p000.client.length;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r13 = r8 * r13;
        if (r11 <= r13) goto L_0x0676;
    L_0x0878:
        r20 = new java.lang.RuntimeException;
        r22 = "";
        r0 = r20;
        r1 = r22;
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00e0 }
        throw r20;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x0884:
        r8 = 5;
        r12 = -124; // 0xffffffffffffff84 float:NaN double:NaN;
        r0 = r43;
        r14 = r0.add(r8, r12);	 Catch:{ RuntimeException -> 0x00e0 }
        r11 = r14;
        r8 = 15;
        if (r14 <= r8) goto L_0x04e6;
    L_0x0892:
        r11 = r14 + -32;
        goto L_0x04e6;
    L_0x0897:
        r8 = 3;
        r0 = r17;
        if (r0 != r8) goto L_0x00a5;
    L_0x089c:
        r15 = p000.client.f383M;
        r17 = p000.client.f408y;
        r8 = 549087301; // 0x20ba6845 float:3.1578625E-19 double:2.71285172E-315;
        r0 = r17;
        r0 = r0 + r8;
        r17 = r0;
        p000.client.f408y = r17;
        r8 = -402101619; // 0xffffffffe8086a8d float:-2.5768294E24 double:NaN;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r17 = r17 + -1;
        r15[r17] = r14;	 Catch:{ RuntimeException -> 0x00e0 }
        goto L_0x00a5;
    L_0x08b9:
        r39 = 0;
        goto L_0x064e;
    L_0x08be:
        r25 = -1;
        goto L_0x03ec;
    L_0x08c3:
        r11 = 0;
    L_0x08c4:
        r13 = p000.client.length;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r13 = r13 * r8;
        if (r11 >= r13) goto L_0x0912;
    L_0x08cc:
        r19 = p000.client.next;
        r15 = p000.client.hasNext;
        r13 = r15[r11];	 Catch:{ RuntimeException -> 0x00e0 }
        r18 = r19[r13];	 Catch:{ RuntimeException -> 0x00e0 }
        if (r18 != 0) goto L_0x090f;
    L_0x08d6:
        r20 = new java.lang.RuntimeException;
        r21 = new java.lang.StringBuilder;
        r0 = r21;
        r0.<init>();	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r21;
        r21 = r0.append(r11);	 Catch:{ RuntimeException -> 0x00e0 }
        r23 = p000.JGitText.length;
        r0 = r21;
        r1 = r23;
        r21 = r0.append(r1);	 Catch:{ RuntimeException -> 0x00e0 }
        r11 = p000.client.length;
        r8 = 453104899; // 0x1b01d503 float:1.0739458E-22 double:2.238635646E-315;
        r11 = r8 * r11;
        r0 = r21;
        r21 = r0.append(r11);	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r21;
        r23 = r0.toString();	 Catch:{ RuntimeException -> 0x00e0 }
        r0 = r20;
        r1 = r23;
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00e0 }
        throw r20;	 Catch:{ RuntimeException -> 0x00e0 }
    L_0x090a:
        r37 = r36;
        goto L_0x06bf;
    L_0x090f:
        r11 = r11 + 1;
        goto L_0x08c4;
    L_0x0912:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Coordinate.read(boolean, Handler, byte):void");
    }

    public static Long[] toString(Class classR, int i, byte b) {
        try {
            return !Short.add(classR, i, (byte) -94) ? null : Device.read(1460694999);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ez.ae(" + ')');
        }
    }

    void add(int $i0, int i) {
        this.this$0 = 1820808767 * $i0;
        this.f35y = 1327442639 * i;
    }

    void add(int $i0, int i, int i2) {
        try {
            this.this$0 = 1820808767 * $i0;
            this.f35y = 1327442639 * i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ez.bk(" + ')');
        }
    }

    public int compareTo() {
        return -1161455169 * this.this$0;
    }

    public int getIndex() {
        return -1161455169 * this.this$0;
    }

    public int getLatitude() {
        return -1161455169 * this.this$0;
    }

    public boolean isValid() {
        return this.this$0 * -1161455169 > 0;
    }

    void setOrdinate(int $i0, int i) {
        this.this$0 = -1433080456 * $i0;
        this.f35y = 1327442639 * i;
    }

    public int sub() {
        return 1010622186 * this.this$0;
    }

    public boolean translate() {
        return this.this$0 * -410670724 > 0;
    }

    public int write(byte b) {
        try {
            return -1161455169 * this.this$0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ez.by(" + ')');
        }
    }

    public boolean write(int i) {
        try {
            return this.this$0 * -1161455169 > 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ez.bn(" + ')');
        }
    }
}
