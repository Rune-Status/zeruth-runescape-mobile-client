package p000;

/* compiled from: la */
public class Kit {
    public static final int Id_uneval = 13;

    Kit() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "la.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.Long get(int r57, int r58, int r59, int r60, int r61, boolean r62, int r63) {
        /*
        r10 = -1;
        r0 = r58;
        if (r10 != r0) goto L_0x0308;
    L_0x0005:
        r61 = 0;
    L_0x0007:
        r0 = r60;
        r11 = (long) r0;
        r10 = 42;
        r11 = r11 << r10;
        r0 = r61;
        r13 = (long) r0;
        r10 = 40;
        r13 = r13 << r10;
        r0 = r57;
        r0 = (long) r0;
        r15 = r0;
        r0 = r58;
        r0 = (long) r0;
        r17 = r0;
        r10 = 16;
        r0 = r17;
        r0 = r0 << r10;
        r17 = r0;
        r0 = r15;
        r2 = r17;
        r0 = r0 + r2;
        r15 = r0;
        r0 = r59;
        r0 = (long) r0;
        r17 = r0;
        r10 = 38;
        r0 = r17;
        r0 = r0 << r10;
        r17 = r0;
        r0 = r15;
        r2 = r17;
        r0 = r0 + r2;
        r15 = r0;
        r13 = r13 + r0;
        r11 = r11 + r13;
        if (r62 != 0) goto L_0x0053;
    L_0x0042:
        r19 = p000.Message.context;
        r0 = r19;
        r20 = r0.get(r11);	 Catch:{ RuntimeException -> 0x041c }
        r22 = r20;
        r22 = (p000.Long) r22;	 Catch:{ RuntimeException -> 0x041c }
        r21 = r22;
        if (r21 == 0) goto L_0x0053;
    L_0x0052:
        return r21;
    L_0x0053:
        r10 = 1560205217; // 0x5cfed7a1 float:5.73853845E17 double:7.70843798E-315;
        r0 = r57;
        r23 = p000.Set.get(r0, r10);	 Catch:{ RuntimeException -> 0x041c }
        r10 = 1;
        r0 = r58;
        if (r0 <= r10) goto L_0x0445;
    L_0x0061:
        r0 = r23;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        if (r24 == 0) goto L_0x0445;
    L_0x0069:
        r57 = -1;
        r63 = 0;
    L_0x006d:
        r10 = 10;
        r0 = r63;
        if (r0 >= r10) goto L_0x035d;
    L_0x0073:
        r0 = r23;
        r0 = r0.entries;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        r25 = r24[r63];	 Catch:{ RuntimeException -> 0x041c }
        r0 = r58;
        r1 = r25;
        if (r0 < r1) goto L_0x0093;
    L_0x0081:
        r0 = r23;
        r0 = r0.entries;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        r25 = r24[r63];	 Catch:{ RuntimeException -> 0x041c }
        if (r25 == 0) goto L_0x0093;
    L_0x008b:
        r0 = r23;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        r57 = r24[r63];	 Catch:{ RuntimeException -> 0x041c }
    L_0x0093:
        r63 = r63 + 1;
        goto L_0x006d;
    L_0x0096:
        r26 = r21;
    L_0x0098:
        r21 = new Long;
        r10 = 36;
        r27 = 32;
        r0 = r21;
        r1 = r27;
        r0.<init>(r10, r1);	 Catch:{ RuntimeException -> 0x041c }
        r28 = p000.Message.params;
        r0 = r21;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        r10 = 36;
        r27 = 32;
        r29 = -1571714745; // 0xffffffffa2518947 float:-2.8397456E-18 double:NaN;
        r0 = r28;
        r1 = r24;
        r2 = r27;
        r3 = r29;
        r0.add(r1, r10, r2, r3);	 Catch:{ RuntimeException -> 0x041c }
        r28 = p000.Message.params;
        r10 = 986688567; // 0x3acfac37 float:0.0015844171 double:4.87488924E-315;
        r0 = r28;
        r30 = r0.get(r10);	 Catch:{ RuntimeException -> 0x041c }
        r32 = r30;
        r32 = (p000.CopyOnWriteArrayList) r32;	 Catch:{ RuntimeException -> 0x041c }
        r31 = r32;
        r28 = p000.Message.params;
        r10 = -5;
        r0 = r28;
        r33 = r0.get(r10);	 Catch:{ RuntimeException -> 0x041c }
        r35 = r33;
        r35 = (p000.Resource) r35;	 Catch:{ RuntimeException -> 0x041c }
        r34 = r35;
        r28 = p000.Message.params;
        r10 = -914536586; // 0xffffffffc97d4776 float:-1037431.4 double:NaN;
        r0 = r28;
        r36 = r0.toString(r10);	 Catch:{ RuntimeException -> 0x041c }
        r10 = 2;
        r0 = r36;
        r37 = r0.get(r10);	 Catch:{ RuntimeException -> 0x041c }
        r10 = -1496883656; // 0xffffffffa6c75e38 float:-1.3833937E-15 double:NaN;
        r0 = r34;
        r0.toString(r10);	 Catch:{ RuntimeException -> 0x041c }
        r10 = 16;
        r27 = 16;
        r29 = -21;
        r0 = r34;
        r1 = r27;
        r2 = r29;
        r0.add(r10, r1, r2);	 Catch:{ RuntimeException -> 0x041c }
        r10 = 0;
        r27 = 1838242425; // 0x6d915a79 float:5.6230876E27 double:9.08212431E-315;
        r0 = r34;
        r1 = r27;
        r0.read(r10, r1);	 Catch:{ RuntimeException -> 0x041c }
        r0 = r23;
        r0 = r0.url;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = 2018587685; // 0x78513425 float:1.697262E34 double:9.973148283E-315;
        r57 = r10 * r57;
        r10 = -1;
        r0 = r57;
        if (r10 == r0) goto L_0x0134;
    L_0x0123:
        r10 = 0;
        r27 = 0;
        r29 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r31;
        r1 = r26;
        r2 = r27;
        r3 = r29;
        r0.get(r1, r10, r2, r3);	 Catch:{ RuntimeException -> 0x041c }
    L_0x0134:
        r0 = r23;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = 1910776979; // 0x71e42493 float:2.2594175E30 double:9.44049262E-315;
        r0 = r57;
        r0 = r0 * r10;
        r57 = r0;
        if (r62 == 0) goto L_0x0400;
    L_0x0144:
        r0 = r57;
        r0 = (double) r0;
        r38 = r0;
        r40 = 4609434218613702656; // 0x3ff8000000000000 float:0.0 double:1.5;
        r38 = r40 * r38;
        r0 = r38;
        r0 = (int) r0;
        r57 = r0;
    L_0x0155:
        r24 = p000.Point.f197x;
        r0 = r23;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x041c }
        r63 = r0;
        r10 = 491480759; // 0x1d4b66b7 float:2.6919929E-21 double:2.428237586E-315;
        r0 = r63;
        r0 = r0 * r10;
        r63 = r0;
        r63 = r24[r63];	 Catch:{ RuntimeException -> 0x041c }
        r0 = r63;
        r1 = r57;
        r0 = r0 * r1;
        r63 = r0;
        r25 = r63 >> 16;
        r24 = p000.Point.f198y;
        r0 = r23;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x041c }
        r63 = r0;
        r10 = 491480759; // 0x1d4b66b7 float:2.6919929E-21 double:2.428237586E-315;
        r63 = r10 * r63;
        r63 = r24[r63];	 Catch:{ RuntimeException -> 0x041c }
        r0 = r57;
        r1 = r63;
        r0 = r0 * r1;
        r57 = r0;
        r57 = r57 >> 16;
        r0 = r42;
        r0.append();	 Catch:{ RuntimeException -> 0x041c }
        r0 = r23;
        r0 = r0.level;	 Catch:{ RuntimeException -> 0x041c }
        r63 = r0;
        r10 = 292684555; // 0x1172030b float:1.9091372E-28 double:1.446053837E-315;
        r0 = r63;
        r0 = r0 * r10;
        r63 = r0;
        r0 = r23;
        r0 = r0.f217x;	 Catch:{ RuntimeException -> 0x041c }
        r43 = r0;
        r10 = 1218015627; // 0x4899718b float:314252.34 double:6.017796774E-315;
        r0 = r43;
        r0 = r0 * r10;
        r43 = r0;
        r0 = r23;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x041c }
        r44 = r0;
        r10 = 491480759; // 0x1d4b66b7 float:2.6919929E-21 double:2.428237586E-315;
        r0 = r44;
        r0 = r0 * r10;
        r44 = r0;
        r0 = r23;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x041c }
        r45 = r0;
        r10 = 835169745; // 0x31c7add1 float:5.811423E-9 double:4.126286795E-315;
        r0 = r45;
        r0 = r0 * r10;
        r45 = r0;
        r0 = r42;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x041c }
        r46 = r0;
        r10 = 1500767459; // 0x5973e4e3 float:4.29063018E15 double:7.41477644E-315;
        r46 = r10 * r46;
        r46 = r46 / 2;
        r0 = r25;
        r1 = r46;
        r0 = r0 + r1;
        r25 = r0;
        r0 = r23;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x041c }
        r46 = r0;
        r10 = 1330988217; // 0x4f5544b9 float:3.57805082E9 double:6.57595553E-315;
        r0 = r46;
        r0 = r0 * r10;
        r46 = r0;
        r0 = r25;
        r1 = r46;
        r0 = r0 + r1;
        r25 = r0;
        r0 = r23;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x041c }
        r46 = r0;
        r10 = 1330988217; // 0x4f5544b9 float:3.57805082E9 double:6.57595553E-315;
        r0 = r46;
        r0 = r0 * r10;
        r46 = r0;
        r57 = r46 + r57;
        r10 = 0;
        r27 = -1762093497; // 0xffffffff96f89647 float:-4.01614E-25 double:NaN;
        r0 = r37;
        r1 = r42;
        r2 = r10;
        r3 = r63;
        r4 = r43;
        r5 = r44;
        r6 = r45;
        r7 = r25;
        r8 = r57;
        r9 = r27;
        r0.add(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x041c }
        r0 = r23;
        r0 = r0.height;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = -1216365831; // 0xffffffffb77fbaf9 float:-1.5242717E-5 double:NaN;
        r0 = r57;
        r0 = r0 * r10;
        r57 = r0;
        r10 = -1;
        r0 = r57;
        if (r10 == r0) goto L_0x023c;
    L_0x022b:
        r10 = 0;
        r27 = 0;
        r29 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r31;
        r1 = r26;
        r2 = r27;
        r3 = r29;
        r0.get(r1, r10, r2, r3);	 Catch:{ RuntimeException -> 0x041c }
    L_0x023c:
        r10 = 1;
        r0 = r59;
        if (r0 < r10) goto L_0x0247;
    L_0x0241:
        r10 = 1;
        r0 = r21;
        r0.copy(r10);	 Catch:{ RuntimeException -> 0x041c }
    L_0x0247:
        r10 = 2;
        r0 = r59;
        if (r0 < r10) goto L_0x0254;
    L_0x024c:
        r10 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r0 = r21;
        r0.copy(r10);	 Catch:{ RuntimeException -> 0x041c }
    L_0x0254:
        if (r60 == 0) goto L_0x025d;
    L_0x0256:
        r0 = r21;
        r1 = r60;
        r0.flush(r1);	 Catch:{ RuntimeException -> 0x041c }
    L_0x025d:
        r28 = p000.Message.params;
        r0 = r21;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        r10 = 36;
        r27 = 32;
        r29 = -1760737181; // 0xffffffff970d4863 float:-4.565092E-25 double:NaN;
        r0 = r28;
        r1 = r24;
        r2 = r27;
        r3 = r29;
        r0.add(r1, r10, r2, r3);	 Catch:{ RuntimeException -> 0x041c }
        r0 = r23;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = -50977591; // 0xfffffffffcf624c9 float:-1.0224409E37 double:NaN;
        r0 = r57;
        r0 = r0 * r10;
        r57 = r0;
        r10 = -1;
        r0 = r57;
        if (r10 == r0) goto L_0x029b;
    L_0x028a:
        r10 = 0;
        r27 = 0;
        r29 = 2106205673; // 0x7d8a25e9 float:2.2953788E37 double:1.040603866E-314;
        r0 = r31;
        r1 = r26;
        r2 = r27;
        r3 = r29;
        r0.get(r1, r10, r2, r3);	 Catch:{ RuntimeException -> 0x041c }
    L_0x029b:
        r10 = 1;
        r0 = r61;
        if (r0 == r10) goto L_0x02b5;
    L_0x02a0:
        r10 = 2;
        r0 = r61;
        if (r0 != r10) goto L_0x02d8;
    L_0x02a5:
        r0 = r23;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = 1099170281; // 0x418401e9 float:16.500933 double:5.43062275E-315;
        r57 = r10 * r57;
        r10 = 1;
        r0 = r57;
        if (r10 != r0) goto L_0x02d8;
    L_0x02b5:
        r47 = p000.Profile.path;
        r10 = -802100233; // 0xffffffffd030ebf7 float:-1.18730168E10 double:NaN;
        r0 = r58;
        r48 = p000.Complex.read(r0, r10);	 Catch:{ RuntimeException -> 0x041c }
        r10 = 0;
        r27 = 9;
        r29 = 16776960; // 0xffff00 float:2.3509528E-38 double:8.2889196E-317;
        r49 = 1;
        r0 = r47;
        r1 = r48;
        r2 = r10;
        r3 = r27;
        r4 = r29;
        r5 = r49;
        r6 = r31;
        r0.add(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x041c }
    L_0x02d8:
        r57 = 0;
    L_0x02da:
        r0 = r21;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x041c }
        r58 = r0;
        r0 = r57;
        r1 = r58;
        if (r0 >= r1) goto L_0x037b;
    L_0x02e9:
        r0 = r21;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        r58 = r24[r57];	 Catch:{ RuntimeException -> 0x041c }
        if (r58 == 0) goto L_0x0305;
    L_0x02f3:
        r0 = r21;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x041c }
        r24 = r0;
        r58 = r24[r57];	 Catch:{ RuntimeException -> 0x041c }
        r10 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r58;
        r0 = r0 | r10;
        r58 = r0;
        r24[r57] = r58;	 Catch:{ RuntimeException -> 0x041c }
    L_0x0305:
        r57 = r57 + 1;
        goto L_0x02da;
    L_0x0308:
        r10 = 2;
        r0 = r61;
        if (r10 != r0) goto L_0x0007;
    L_0x030d:
        r10 = 1;
        r0 = r58;
        if (r10 == r0) goto L_0x0007;
    L_0x0312:
        r61 = 1;
        goto L_0x0007;
    L_0x0317:
        r0 = r23;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = -50977591; // 0xfffffffffcf624c9 float:-1.0224409E37 double:NaN;
        r0 = r57;
        r0 = r0 * r10;
        r57 = r0;
        r10 = -1;
        r0 = r57;
        if (r0 == r10) goto L_0x0387;
    L_0x032a:
        r0 = r23;
        r0 = r0.tag;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = -1461501241; // 0xffffffffa8e342c7 float:-2.5231023E-14 double:NaN;
        r0 = r57;
        r0 = r0 * r10;
        r57 = r0;
        r10 = 10;
        r27 = 1;
        r29 = 0;
        r49 = 0;
        r50 = 1;
        r51 = 610736546; // 0x246719a2 float:5.0111852E-17 double:3.01743946E-315;
        r0 = r57;
        r1 = r10;
        r2 = r27;
        r3 = r29;
        r4 = r49;
        r5 = r50;
        r6 = r51;
        r26 = p000.Kit.get(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x041c }
        r21 = r26;
        if (r26 != 0) goto L_0x0096;
    L_0x035a:
        r52 = 0;
        return r52;
    L_0x035d:
        r10 = -1;
        r0 = r57;
        if (r10 == r0) goto L_0x0445;
    L_0x0362:
        r10 = 1206862970; // 0x47ef447a float:122504.95 double:5.962695327E-315;
        r0 = r57;
        r23 = p000.Set.get(r0, r10);	 Catch:{ RuntimeException -> 0x041c }
    L_0x036b:
        r10 = 1;
        r27 = 34;
        r0 = r23;
        r1 = r27;
        r42 = r0.get(r10, r1);	 Catch:{ RuntimeException -> 0x041c }
        if (r42 != 0) goto L_0x0317;
    L_0x0378:
        r52 = 0;
        return r52;
    L_0x037b:
        if (r62 != 0) goto L_0x0386;
    L_0x037d:
        r19 = p000.Message.context;
        r0 = r19;
        r1 = r21;
        r0.get(r1, r11);	 Catch:{ RuntimeException -> 0x041c }
    L_0x0386:
        return r21;
    L_0x0387:
        r0 = r23;
        r0 = r0.height;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = -1216365831; // 0xffffffffb77fbaf9 float:-1.5242717E-5 double:NaN;
        r57 = r10 * r57;
        r10 = -1;
        r0 = r57;
        if (r0 == r10) goto L_0x03c0;
    L_0x0397:
        r0 = r23;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = 1034178721; // 0x3da450a1 float:0.08023191 double:5.109521777E-315;
        r57 = r10 * r57;
        r10 = 0;
        r27 = 0;
        r29 = 610736546; // 0x246719a2 float:5.0111852E-17 double:3.01743946E-315;
        r0 = r57;
        r1 = r58;
        r2 = r59;
        r3 = r60;
        r4 = r10;
        r5 = r27;
        r6 = r29;
        r26 = p000.Kit.get(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x041c }
        r21 = r26;
        if (r26 != 0) goto L_0x0096;
    L_0x03bd:
        r52 = 0;
        return r52;
    L_0x03c0:
        r0 = r23;
        r0 = r0.url;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = 2018587685; // 0x78513425 float:1.697262E34 double:9.973148283E-315;
        r0 = r57;
        r0 = r0 * r10;
        r57 = r0;
        r10 = -1;
        r0 = r57;
        if (r10 == r0) goto L_0x0448;
    L_0x03d3:
        r0 = r23;
        r0 = r0.source;	 Catch:{ RuntimeException -> 0x041c }
        r57 = r0;
        r10 = -778372525; // 0xffffffffd19afa53 float:-8.3203088E10 double:NaN;
        r57 = r10 * r57;
        r10 = 0;
        r27 = 0;
        r29 = 0;
        r49 = 0;
        r50 = 610736546; // 0x246719a2 float:5.0111852E-17 double:3.01743946E-315;
        r0 = r57;
        r1 = r58;
        r2 = r10;
        r3 = r27;
        r4 = r29;
        r5 = r49;
        r6 = r50;
        r26 = p000.Kit.get(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x041c }
        r21 = r26;
        if (r26 != 0) goto L_0x0096;
    L_0x03fd:
        r52 = 0;
        return r52;
    L_0x0400:
        r10 = 2;
        r0 = r59;
        if (r10 != r0) goto L_0x0155;
    L_0x0405:
        r0 = r57;
        r0 = (double) r0;
        r38 = r0;
        r40 = 4607362562785112228; // 0x3ff0a3d70a3d70a4 float:9.121204E-33 double:1.04;
        r0 = r38;
        r2 = r40;
        r0 = r0 * r2;
        r38 = r0;
        r0 = (int) r0;
        r57 = r0;
        goto L_0x0155;
    L_0x041c:
        r53 = move-exception;
        r54 = new java.lang.StringBuilder;
        r0 = r54;
        r0.<init>();
        r55 = "la.aq(";
        r0 = r54;
        r1 = r55;
        r54 = r0.append(r1);
        r10 = 41;
        r0 = r54;
        r54 = r0.append(r10);
        r0 = r54;
        r48 = r0.toString();
        r0 = r53;
        r1 = r48;
        r56 = p000.StringBuilder.append(r0, r1);
        throw r56;
    L_0x0445:
        goto L_0x036b;
    L_0x0448:
        r26 = 0;
        goto L_0x0098;
        */
        throw new UnsupportedOperationException("Method not decompiled: Kit.get(int, int, int, int, int, boolean, int):Long");
    }
}
