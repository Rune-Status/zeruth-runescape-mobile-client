package p000;

/* compiled from: ch */
public abstract class Server {
    public static final int INFO_LEN_EXTENDED = 64;
    public static final int LOG_WARNING = 2;
    public static boolean f23b = true;
    static int name;
    static byte[][][] value;

    Server() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ch.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void init(int r74, int r75, int r76, int r77, int r78) {
        /*
        r11 = java.lang.System.nanoTime();	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = p000.client.list;
        r13 = 1370958301; // 0x51b729dd float:9.8335171E10 double:6.773433984E-315;
        r0 = r78;
        r0 = r0 + r13;
        r78 = r0;
        p000.client.list = r78;
        r14 = p000.File.this$0;
        r0 = r14.size;	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = r0;
        r13 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r78 = r13 * r78;
        r78 = r78 >> 7;
        r15 = p000.client.version;
        r13 = -502376731; // 0xffffffffe20e56e5 float:-6.564248E20 double:NaN;
        r15 = r15 * r13;
        r0 = r78;
        if (r0 != r15) goto L_0x0042;
    L_0x0027:
        r14 = p000.File.this$0;
        r0 = r14.value;	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = r0;
        r13 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r78 = r13 * r78;
        r78 = r78 >> 7;
        r15 = p000.client.element;
        r13 = 1931904491; // 0x732685eb float:1.319332E31 double:9.5448764E-315;
        r15 = r13 * r15;
        r0 = r78;
        if (r0 != r15) goto L_0x0042;
    L_0x003f:
        r13 = 0;
        p000.client.version = r13;
    L_0x0042:
        r13 = -2106217445; // 0xffffffff8275ac1b float:-1.8049149E-37 double:NaN;
        p000.Locale.exec(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = p000.client.f402r;
        r13 = 1640838373; // 0x61cd34e5 float:4.7317425E20 double:8.106818705E-315;
        r78 = r13 * r78;
        if (r78 < 0) goto L_0x0075;
    L_0x0051:
        r16 = p000.client.size;
        r78 = p000.client.f402r;
        r13 = 1640838373; // 0x61cd34e5 float:4.7317425E20 double:8.106818705E-315;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r14 = r16[r78];	 Catch:{ RuntimeException -> 0x06c4 }
        if (r14 == 0) goto L_0x0075;
    L_0x0061:
        r16 = p000.client.size;
        r78 = p000.client.f402r;
        r13 = 1640838373; // 0x61cd34e5 float:4.7317425E20 double:8.106818705E-315;
        r78 = r13 * r78;
        r14 = r16[r78];	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 0;
        r17 = -648412244; // 0xffffffffd95a03ac float:-3.83534889E15 double:NaN;
        r0 = r17;
        p000.Class.toString(r14, r13, r0);	 Catch:{ RuntimeException -> 0x06c4 }
    L_0x0075:
        r13 = 1;
        r17 = -1954745340; // 0xffffffff8b7cf404 float:-4.8717012E-32 double:NaN;
        r0 = r17;
        p000.Envelope.toString(r13, r0);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = -1532092339; // 0xffffffffa4ae204d float:-7.551519E-17 double:NaN;
        p000.StringBuilder.load(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 0;
        r17 = -1640174051; // 0xffffffff9e3cee1d float:-1.0001878E-20 double:NaN;
        r0 = r17;
        p000.Envelope.toString(r13, r0);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 555494997; // 0x211c2e55 float:5.2916176E-19 double:2.744509945E-315;
        p000.Collection.read(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r18 = p000.client.points;
        r0 = r18;
        r19 = r0.get();	 Catch:{ RuntimeException -> 0x06c4 }
        r21 = r19;
        r21 = (p000.LinkedList) r21;	 Catch:{ RuntimeException -> 0x06c4 }
        r20 = r21;
    L_0x00a1:
        if (r20 == 0) goto L_0x0292;
    L_0x00a3:
        r78 = p000.Msg.size;
        r13 = -1674539149; // 0xffffffff9c308f73 float:-5.841892E-22 double:NaN;
        r78 = r13 * r78;
        r0 = r20;
        r15 = r0.dir;	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 487694493; // 0x1d11a09d float:1.9273625E-21 double:2.409530947E-315;
        r15 = r13 * r15;
        r0 = r78;
        if (r0 != r15) goto L_0x00bf;
    L_0x00b7:
        r0 = r20;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x06c4 }
        r22 = r0;
        if (r22 == 0) goto L_0x075a;
    L_0x00bf:
        r0 = r20;
        r0.iterator();	 Catch:{ RuntimeException -> 0x06c4 }
    L_0x00c4:
        r18 = p000.client.points;
        r0 = r18;
        r19 = r0.next();	 Catch:{ RuntimeException -> 0x06c4 }
        r23 = r19;
        r23 = (p000.LinkedList) r23;	 Catch:{ RuntimeException -> 0x06c4 }
        r20 = r23;
        goto L_0x00a1;
    L_0x00d3:
        r24 = -1;
        r25 = -1;
        r13 = -59;
        r22 = p000.LazyList.get(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        if (r22 == 0) goto L_0x00fc;
    L_0x00df:
        r26 = p000.client.$assertionsDisabled;
        r0 = r26;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x06c4 }
        r24 = r0;
        r13 = -356911569; // 0xffffffffeab9f62f float:-1.1240692E26 double:NaN;
        r24 = r13 * r24;
        r26 = p000.client.$assertionsDisabled;
        r0 = r26;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x06c4 }
        r25 = r0;
        r13 = 695318399; // 0x2971b77f float:5.3671907E-14 double:3.43532934E-315;
        r0 = r25;
        r0 = r0 * r13;
        r25 = r0;
    L_0x00fc:
        r0 = r24;
        r1 = r74;
        if (r0 < r1) goto L_0x07b4;
    L_0x0102:
        r27 = r76 + r74;
        r0 = r24;
        r1 = r27;
        if (r0 >= r1) goto L_0x07b4;
    L_0x010a:
        r0 = r25;
        r1 = r75;
        if (r0 < r1) goto L_0x07b4;
    L_0x0110:
        r27 = r77 + r75;
        r0 = r25;
        r1 = r27;
        if (r0 >= r1) goto L_0x07b4;
    L_0x0118:
        r0 = r24;
        r1 = r74;
        r0 = r0 - r1;
        r24 = r0;
        r0 = r25;
        r1 = r75;
        r0 = r0 - r1;
        r25 = r0;
        r13 = -287121659; // 0xffffffffeee2df05 float:-3.5106613E28 double:NaN;
        r0 = r24;
        r0 = r0 * r13;
        r24 = r0;
        p000.Main.count = r24;
        r13 = 200428963; // 0xbf24da3 float:9.3331824E-32 double:9.9025065E-316;
        r24 = r25 * r13;
        p000.Main.text = r24;
        r13 = 1;
        p000.Main.data = r13;
        r13 = 0;
        p000.Main.size = r13;
        r13 = 0;
        p000.Main.f205e = r13;
    L_0x0140:
        r24 = p000.client.type;
        r13 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r24 = r13 * r24;
        r13 = -73;
        r0 = r28;
        r1 = r24;
        r0.add(r1, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = -1208701334; // 0xffffffffb7f4ae6a float:-2.9168285E-5 double:NaN;
        r0 = r29;
        r24 = r0.multiply(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r25 = p000.client.helper;
        r13 = 2097392939; // 0x7d03ad2b float:1.093925E37 double:1.036249797E-314;
        r0 = r25;
        r0 = r0 * r13;
        r25 = r0;
        r13 = -1701198609; // 0xffffffff9a99c4ef float:-6.359748E-23 double:NaN;
        r0 = r29;
        r1 = r25;
        r0.get(r1, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r22 = p000.client.history;
        if (r22 == 0) goto L_0x01b2;
    L_0x0171:
        r30 = p000.OrgFile.this$0;
        r25 = p000.ClassWriter.f48x;
        r13 = -721800181; // 0xffffffffd4fa340b float:-8.5969197E12 double:NaN;
        r0 = r25;
        r0 = r0 * r13;
        r25 = r0;
        r27 = p000.Locale.f177y;
        r13 = 43525885; // 0x29826fd float:2.235677E-37 double:2.15046445E-316;
        r0 = r27;
        r0 = r0 * r13;
        r27 = r0;
        r31 = p000.Wallet.f372y;
        r13 = -2076152847; // 0xffffffff84406bf1 float:-2.2619056E-36 double:NaN;
        r31 = r13 * r31;
        r32 = p000.Segment.f277y;
        r13 = -1421687705; // 0xffffffffab42c467 float:-6.919521E-13 double:NaN;
        r32 = r13 * r32;
        r33 = p000.Request.f272y;
        r13 = 1124758849; // 0x430a7541 float:138.45802 double:5.55704707E-315;
        r0 = r33;
        r0 = r0 * r13;
        r33 = r0;
        r0 = r30;
        r1 = r28;
        r2 = r25;
        r3 = r27;
        r4 = r31;
        r5 = r32;
        r6 = r33;
        r7 = r34;
        r0.run(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x06c4 }
    L_0x01b2:
        r13 = -2067554013; // 0xffffffff84c3a123 float:-4.599226E-36 double:NaN;
        r0 = r29;
        r1 = r24;
        r0.open(r1, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r30 = p000.OrgFile.this$0;
        r0 = r30;
        r0.initialize();	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = -1374758230; // 0xffffffffae0edaaa float:-3.2481275E-11 double:NaN;
        r0 = r74;
        r1 = r75;
        r2 = r76;
        r3 = r77;
        p000.Tools.m58a(r0, r1, r2, r3, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 1842045126; // 0x6dcb60c6 float:7.867806E27 double:9.10091215E-315;
        r0 = r74;
        r1 = r75;
        p000.Generator.read(r0, r1, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r35 = p000.Point.type;
        r37 = r35;
        r37 = (p000.AbstractBuffer) r37;	 Catch:{ RuntimeException -> 0x06c4 }
        r36 = r37;
        r34 = p000.client.file;
        r13 = -2000050073; // 0xffffffff88c9a867 float:-1.2136839E-33 double:NaN;
        r34 = r13 * r34;
        r13 = -1860035093; // 0xffffffff91221deb float:-1.2788766E-28 double:NaN;
        r0 = r36;
        r1 = r34;
        r0.process(r1, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r38 = p000.Settings.this$0;
        r39 = p000.client.context;
        r0 = r39;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x06c4 }
        r40 = r0;
        r13 = -204921627; // 0xfffffffff3c924e5 float:-3.1872558E31 double:NaN;
        r0 = r40;
        r41 = r0.get(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = -368034426; // 0xffffffffea103d86 float:-4.3593964E25 double:NaN;
        r0 = r38;
        r1 = r41;
        r0.clear(r1, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 0;
        p000.Set.init(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = -443041885; // 0xffffffffe597b7a3 float:-8.9558105E22 double:NaN;
        r78 = r13 * r78;
        p000.ClassWriter.f48x = r78;
        r13 = -1527798187; // 0xffffffffa4efa655 float:-1.03931505E-16 double:NaN;
        r78 = r13 * r15;
        p000.Locale.f177y = r78;
        r13 = -451992303; // 0xffffffffe50f2511 float:-4.2248885E22 double:NaN;
        r78 = r13 * r42;
        p000.Wallet.f372y = r78;
        r13 = -741992617; // 0xffffffffd3c61757 float:-1.7015902E12 double:NaN;
        r78 = r13 * r43;
        p000.Segment.f277y = r78;
        r13 = -1359668543; // 0xffffffffaef51ac1 float:-1.11460625E-10 double:NaN;
        r78 = r13 * r44;
        p000.Request.f272y = r78;
        r22 = p000.client.f406w;
        if (r22 == 0) goto L_0x024f;
    L_0x023c:
        r13 = 1;
        r17 = 0;
        r45 = 708775659; // 0x2a3f0eeb float:1.6969384E-13 double:3.501817037E-315;
        r0 = r17;
        r1 = r45;
        r78 = p000.Server.read(r13, r0, r1);	 Catch:{ RuntimeException -> 0x06c4 }
        if (r78 != 0) goto L_0x024f;
    L_0x024c:
        r13 = 0;
        p000.client.f406w = r13;
    L_0x024f:
        r22 = p000.client.f406w;
        if (r22 == 0) goto L_0x0284;
    L_0x0253:
        r39 = p000.client.context;
        r0 = r39;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x06c4 }
        r40 = r0;
        r13 = 1645442261; // 0x621374d5 float:6.800225E20 double:8.129564934E-315;
        r0 = r40;
        r41 = r0.get(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 0;
        r17 = 31;
        r0 = r41;
        r1 = r74;
        r2 = r75;
        r3 = r76;
        r4 = r77;
        r5 = r13;
        r6 = r17;
        r0.add(r1, r2, r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x06c4 }
        r46 = p000.R$id.out;
        r13 = 0;
        r17 = 178159538; // 0xa9e7fb2 float:1.526288E-32 double:8.8022507E-316;
        r0 = r46;
        r1 = r17;
        p000.Float.decode(r0, r13, r1);	 Catch:{ RuntimeException -> 0x06c4 }
    L_0x0284:
        r47 = p000.client.adapter;
        r48 = java.lang.System.nanoTime();	 Catch:{ RuntimeException -> 0x06c4 }
        r11 = r48 - r11;
        r0 = r47;
        r0.add(r11);	 Catch:{ RuntimeException -> 0x06c4 }
        return;
    L_0x0292:
        r13 = 1;
        r17 = -1814050410; // 0xffffffff93dfc996 float:-5.6491893E-27 double:NaN;
        r0 = r74;
        r1 = r75;
        r2 = r76;
        r3 = r77;
        r4 = r13;
        r5 = r17;
        p000.MultiInputStream.init(r0, r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x06c4 }
        r74 = p000.client.mColor;
        r13 = -799207233; // 0xffffffffd05d10bf float:-1.48354488E10 double:NaN;
        r0 = r74;
        r0 = r0 * r13;
        r74 = r0;
        r75 = p000.client.mType;
        r13 = -784386417; // 0xffffffffd13f368f float:-5.1328381E10 double:NaN;
        r0 = r75;
        r0 = r0 * r13;
        r75 = r0;
        r76 = p000.client.mCurrent;
        r13 = 2140963035; // 0x7f9c80db float:NaN double:1.0577762846E-314;
        r76 = r13 * r76;
        r77 = p000.client.page;
        r13 = -1949120505; // 0xffffffff8bd2c807 float:-8.1190025E-32 double:NaN;
        r77 = r13 * r77;
        r39 = p000.client.context;
        r0 = r39;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x06c4 }
        r40 = r0;
        r13 = 457068554; // 0x1b3e500a float:1.5742294E-22 double:2.258218703E-315;
        r0 = r40;
        r41 = r0.get(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = r74 + r76;
        r15 = r75 + r77;
        r13 = -1879486423; // 0xffffffff8ff95029 float:-2.4584172E-29 double:NaN;
        r0 = r41;
        r1 = r74;
        r2 = r75;
        r3 = r78;
        r4 = r15;
        r5 = r13;
        r0.close(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x06c4 }
        r39 = p000.client.context;
        r13 = -1725047075; // 0xffffffff992ddedd float:-8.988897E-24 double:NaN;
        r0 = r39;
        r28 = r0.connect(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 144700525; // 0x89ff46d float:9.626929E-34 double:7.14915583E-316;
        r0 = r28;
        r29 = r0.get(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = -271693784; // 0xffffffffefce4828 float:-1.2768229E29 double:NaN;
        r0 = r29;
        r0.get(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = r76 + r74;
        r15 = r77 + r75;
        r13 = 48;
        r0 = r29;
        r1 = r74;
        r2 = r75;
        r3 = r78;
        r4 = r15;
        r5 = r13;
        r0.add(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = -2126838720; // 0xffffffff813b0440 float:-3.4349525E-38 double:NaN;
        r0 = r29;
        r0.toString(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r22 = p000.client.dir;
        if (r22 != 0) goto L_0x052a;
    L_0x0326:
        r50 = p000.PickerActivity.count;
        r78 = p000.client.priority;
        r13 = -424339111; // 0xffffffffe6b51959 float:-4.2760796E23 double:NaN;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r0 = (float) r0;
        r51 = r0;
        r0 = r50;
        r1 = r51;
        r0 = r0 * r1;
        r50 = r0;
        r78 = p000.client.tag;
        r13 = 1679658745; // 0x641d8ef9 float:1.1625764E22 double:8.298616826E-315;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r0 = (float) r0;
        r51 = r0;
        r0 = r50;
        r1 = r51;
        r0 = r0 + r1;
        r50 = r0;
        r53 = 1124073472; // 0x43000000 float:128.0 double:5.55366086E-315;
        r52 = (r50 > r53 ? 1 : (r50 == r53 ? 0 : -1));
        if (r52 >= 0) goto L_0x0792;
    L_0x0357:
        r50 = 1124073472; // 0x43000000 float:128.0 double:5.55366086E-315;
    L_0x035a:
        r0 = r50;
        r0 = (int) r0;
        r78 = r0;
        r15 = p000.client.settings;
        r13 = 1959418925; // 0x74ca5c2d float:1.2826093E32 double:9.680815767E-315;
        r15 = r15 * r13;
        r15 = r15 / 256;
        r0 = r78;
        if (r15 <= r0) goto L_0x0378;
    L_0x036b:
        r78 = p000.client.settings;
        r13 = 1959418925; // 0x74ca5c2d float:1.2826093E32 double:9.680815767E-315;
        r78 = r13 * r78;
        r0 = r78;
        r0 = r0 / 256;
        r78 = r0;
    L_0x0378:
        r54 = p000.client.origin;
        r13 = 4;
        r22 = r54[r13];	 Catch:{ RuntimeException -> 0x06c4 }
        if (r22 == 0) goto L_0x07c2;
    L_0x037f:
        r55 = p000.client.f401q;
        r13 = 4;
        r15 = r55[r13];	 Catch:{ RuntimeException -> 0x06c4 }
        r15 = r15 + 128;
        r0 = r78;
        if (r15 <= r0) goto L_0x07c2;
    L_0x038a:
        r55 = p000.client.f401q;
        r13 = 4;
        r78 = r55[r13];	 Catch:{ RuntimeException -> 0x06c4 }
        r0 = r78;
        r0 = r0 + 128;
        r78 = r0;
    L_0x0395:
        r50 = p000.PickerActivity.count;
        r15 = p000.client.action;
        r13 = 1025736795; // 0x3d23805b float:0.03991733 double:5.06781312E-315;
        r15 = r15 * r13;
        r0 = (float) r15;
        r51 = r0;
        r0 = r50;
        r1 = r51;
        r0 = r0 * r1;
        r50 = r0;
        r15 = p000.client.level;
        r13 = -198683079; // 0xfffffffff4285639 float:-5.3348064E31 double:NaN;
        r15 = r15 * r13;
        r0 = (float) r15;
        r51 = r0;
        r0 = r50;
        r1 = r51;
        r0 = r0 + r1;
        r50 = r0;
        r53 = 1157627904; // 0x45000000 float:2048.0 double:5.71944178E-315;
        r0 = r50;
        r1 = r53;
        r0 = r0 % r1;
        r50 = r0;
        r15 = (int) r0;
        r15 = r15 & 2047;
        r42 = p000.Shape.data;
        r13 = -1216222673; // 0xffffffffb781ea2f float:-1.5487049E-5 double:NaN;
        r44 = r13 * r42;
        r42 = p000.State.state;
        r13 = -1241354743; // 0xffffffffb6026e09 float:-1.9435558E-6 double:NaN;
        r43 = r42 * r13;
        r42 = p000.Cell.data;
        r13 = 1417186721; // 0x54788da1 float:4.27011211E12 double:7.001832726E-315;
        r0 = r42;
        r0 = r0 * r13;
        r42 = r0;
        r34 = r78 * 3;
        r0 = r34;
        r0 = r0 + 600;
        r34 = r0;
        r13 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r24 = r13 - r78;
        r0 = r24;
        r0 = r0 & 2047;
        r27 = r0;
        r13 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r24 = r13 - r15;
        r0 = r24;
        r0 = r0 & 2047;
        r25 = r0;
        r24 = 0;
        if (r27 == 0) goto L_0x0422;
    L_0x03fc:
        r55 = p000.Point.f197x;
        r24 = r55[r27];	 Catch:{ RuntimeException -> 0x06c4 }
        r55 = p000.Point.f198y;
        r27 = r55[r27];	 Catch:{ RuntimeException -> 0x06c4 }
        r31 = r27 * 0;
        r32 = r24 * r34;
        r0 = r31;
        r1 = r32;
        r0 = r0 - r1;
        r31 = r0;
        r13 = 0;
        r24 = r13 * r24;
        r0 = r34;
        r1 = r27;
        r0 = r0 * r1;
        r34 = r0;
        r1 = r24;
        r0 = r0 + r1;
        r34 = r0;
        r34 = r34 >> 16;
        r24 = r31 >> 16;
    L_0x0422:
        if (r25 == 0) goto L_0x07bd;
    L_0x0424:
        r55 = p000.Point.f197x;
        r27 = r55[r25];	 Catch:{ RuntimeException -> 0x06c4 }
        r55 = p000.Point.f198y;
        r25 = r55[r25];	 Catch:{ RuntimeException -> 0x06c4 }
        r31 = r27 * r34;
        r13 = 0;
        r32 = r13 * r25;
        r0 = r31;
        r1 = r32;
        r0 = r0 + r1;
        r31 = r0;
        r31 = r31 >> 16;
        r0 = r34;
        r1 = r25;
        r0 = r0 * r1;
        r34 = r0;
        r13 = 0;
        r25 = r13 * r27;
        r0 = r34;
        r1 = r25;
        r0 = r0 - r1;
        r34 = r0;
        r34 = r34 >> 16;
    L_0x044d:
        r0 = r44;
        r1 = r31;
        r0 = r0 - r1;
        r44 = r0;
        r13 = -443041885; // 0xffffffffe597b7a3 float:-8.9558105E22 double:NaN;
        r0 = r44;
        r0 = r0 * r13;
        r44 = r0;
        p000.ClassWriter.f48x = r44;
        r0 = r43;
        r1 = r24;
        r0 = r0 - r1;
        r43 = r0;
        r13 = -1527798187; // 0xffffffffa4efa655 float:-1.03931505E-16 double:NaN;
        r0 = r43;
        r0 = r0 * r13;
        r43 = r0;
        p000.Locale.f177y = r43;
        r0 = r42;
        r1 = r34;
        r0 = r0 - r1;
        r42 = r0;
        r13 = -451992303; // 0xffffffffe50f2511 float:-4.2248885E22 double:NaN;
        r0 = r42;
        r0 = r0 * r13;
        r42 = r0;
        p000.Wallet.f372y = r42;
        r13 = -741992617; // 0xffffffffd3c61757 float:-1.7015902E12 double:NaN;
        r78 = r13 * r78;
        p000.Segment.f277y = r78;
        r13 = -1359668543; // 0xffffffffaef51ac1 float:-1.11460625E-10 double:NaN;
        r78 = r13 * r15;
        p000.Request.f272y = r78;
        r78 = p000.client.info;
        r13 = 780758273; // 0x2e896d01 float:6.249402E-11 double:3.857458404E-315;
        r78 = r13 * r78;
        r13 = 1;
        r0 = r78;
        if (r13 != r0) goto L_0x052a;
    L_0x049a:
        r78 = p000.client.out;
        r13 = -2036797811; // 0xffffffff8698ee8d float:-5.7526564E-35 double:NaN;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r13 = 2;
        r0 = r78;
        if (r0 < r13) goto L_0x052a;
    L_0x04a9:
        r78 = p000.client.type;
        r13 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r78 = r78 % 50;
        if (r78 != 0) goto L_0x052a;
    L_0x04b7:
        r14 = p000.File.this$0;
        r0 = r14.size;	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = r0;
        r13 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r78 = r13 * r78;
        r78 = r78 >> 7;
        r15 = p000.Shape.data;
        r13 = -1216222673; // 0xffffffffb781ea2f float:-1.5487049E-5 double:NaN;
        r15 = r15 * r13;
        r15 = r15 >> 7;
        r0 = r78;
        if (r0 != r15) goto L_0x04e7;
    L_0x04d0:
        r78 = p000.Cell.data;
        r13 = 1417186721; // 0x54788da1 float:4.27011211E12 double:7.001832726E-315;
        r78 = r13 * r78;
        r78 = r78 >> 7;
        r14 = p000.File.this$0;
        r15 = r14.value;	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r15 = r15 * r13;
        r15 = r15 >> 7;
        r0 = r78;
        if (r0 == r15) goto L_0x052a;
    L_0x04e7:
        r14 = p000.File.this$0;
        r0 = r14.context;	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = r0;
        r13 = -277606385; // 0xffffffffef74100f float:-7.5533756E28 double:NaN;
        r78 = r13 * r78;
        r15 = p000.Shape.data;
        r13 = -1216222673; // 0xffffffffb781ea2f float:-1.5487049E-5 double:NaN;
        r15 = r15 * r13;
        r15 = r15 >> 7;
        r42 = p000.Build$VERSION.type;
        r13 = 1407993063; // 0x53ec44e7 float:2.02953654E12 double:6.95641002E-315;
        r42 = r13 * r42;
        r0 = r42;
        r15 = r15 + r0;
        r42 = p000.Cell.data;
        r13 = 1417186721; // 0x54788da1 float:4.27011211E12 double:7.001832726E-315;
        r42 = r13 * r42;
        r42 = r42 >> 7;
        r43 = p000.Level.type;
        r13 = 1289967967; // 0x4ce3595f float:1.19196408E8 double:6.373288567E-315;
        r0 = r43;
        r0 = r0 * r13;
        r43 = r0;
        r0 = r42;
        r1 = r43;
        r0 = r0 + r1;
        r42 = r0;
        r13 = 1;
        r17 = -44;
        r0 = r42;
        r1 = r78;
        r2 = r17;
        p000.CharSequence.init(r15, r0, r1, r13, r2);	 Catch:{ RuntimeException -> 0x06c4 }
    L_0x052a:
        r22 = p000.client.dir;
        if (r22 != 0) goto L_0x079f;
    L_0x052e:
        r13 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r78 = p000.CompassView.write(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r34 = r78;
    L_0x0537:
        r78 = p000.ClassWriter.f48x;
        r13 = -721800181; // 0xffffffffd4fa340b float:-8.5969197E12 double:NaN;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r15 = p000.Locale.f177y;
        r13 = 43525885; // 0x29826fd float:2.235677E-37 double:2.15046445E-316;
        r15 = r15 * r13;
        r42 = p000.Wallet.f372y;
        r13 = -2076152847; // 0xffffffff84406bf1 float:-2.2619056E-36 double:NaN;
        r42 = r13 * r42;
        r43 = p000.Segment.f277y;
        r13 = -1421687705; // 0xffffffffab42c467 float:-6.919521E-13 double:NaN;
        r0 = r43;
        r0 = r0 * r13;
        r43 = r0;
        r44 = p000.Request.f272y;
        r13 = 1124758849; // 0x430a7541 float:138.45802 double:5.55704707E-315;
        r44 = r13 * r44;
        r24 = 0;
    L_0x0561:
        r13 = 5;
        r0 = r24;
        if (r0 >= r13) goto L_0x00d3;
    L_0x0566:
        r54 = p000.client.origin;
        r22 = r54[r24];	 Catch:{ RuntimeException -> 0x06c4 }
        if (r22 == 0) goto L_0x0671;
    L_0x056c:
        r56 = java.lang.Math.random();	 Catch:{ RuntimeException -> 0x06c4 }
        r55 = p000.client.checks;
        r25 = r55[r24];	 Catch:{ RuntimeException -> 0x06c4 }
        r25 = r25 * 2;
        r25 = r25 + 1;
        r0 = r25;
        r0 = (double) r0;
        r58 = r0;
        r0 = r56;
        r2 = r58;
        r0 = r0 * r2;
        r56 = r0;
        r55 = p000.client.checks;
        r25 = r55[r24];	 Catch:{ RuntimeException -> 0x06c4 }
        r0 = r25;
        r0 = (double) r0;
        r58 = r0;
        r0 = r56;
        r2 = r58;
        r0 = r0 - r2;
        r56 = r0;
        r55 = p000.client.f392h;
        r25 = r55[r24];	 Catch:{ RuntimeException -> 0x06c4 }
        r0 = r25;
        r0 = (double) r0;
        r58 = r0;
        r60 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r0 = r58;
        r2 = r60;
        r0 = r0 / r2;
        r58 = r0;
        r55 = p000.client.images;
        r25 = r55[r24];	 Catch:{ RuntimeException -> 0x06c4 }
        r0 = r25;
        r0 = (double) r0;
        r62 = r0;
        r0 = r58;
        r2 = r62;
        r0 = r0 * r2;
        r58 = r0;
        r58 = java.lang.Math.sin(r0);	 Catch:{ RuntimeException -> 0x06c4 }
        r55 = p000.client.f401q;
        r25 = r55[r24];	 Catch:{ RuntimeException -> 0x06c4 }
        r0 = r25;
        r0 = (double) r0;
        r62 = r0;
        r0 = r58;
        r2 = r62;
        r0 = r0 * r2;
        r58 = r0;
        r0 = r56;
        r2 = r58;
        r0 = r0 + r2;
        r56 = r0;
        r0 = (int) r0;
        r25 = r0;
        if (r24 != 0) goto L_0x05e9;
    L_0x05d9:
        r27 = p000.ClassWriter.f48x;
        r13 = -443041885; // 0xffffffffe597b7a3 float:-8.9558105E22 double:NaN;
        r31 = r13 * r25;
        r0 = r27;
        r1 = r31;
        r0 = r0 + r1;
        r27 = r0;
        p000.ClassWriter.f48x = r27;
    L_0x05e9:
        r13 = 1;
        r0 = r24;
        if (r0 != r13) goto L_0x05fe;
    L_0x05ee:
        r27 = p000.Locale.f177y;
        r13 = -1527798187; // 0xffffffffa4efa655 float:-1.03931505E-16 double:NaN;
        r31 = r13 * r25;
        r0 = r27;
        r1 = r31;
        r0 = r0 + r1;
        r27 = r0;
        p000.Locale.f177y = r27;
    L_0x05fe:
        r13 = 2;
        r0 = r24;
        if (r0 != r13) goto L_0x0613;
    L_0x0603:
        r27 = p000.Wallet.f372y;
        r13 = -451992303; // 0xffffffffe50f2511 float:-4.2248885E22 double:NaN;
        r31 = r13 * r25;
        r0 = r27;
        r1 = r31;
        r0 = r0 + r1;
        r27 = r0;
        p000.Wallet.f372y = r27;
    L_0x0613:
        r13 = 3;
        r0 = r24;
        if (r13 != r0) goto L_0x0634;
    L_0x0618:
        r27 = p000.Request.f272y;
        r13 = 1124758849; // 0x430a7541 float:138.45802 double:5.55704707E-315;
        r27 = r13 * r27;
        r0 = r27;
        r1 = r25;
        r0 = r0 + r1;
        r27 = r0;
        r0 = r0 & 2047;
        r27 = r0;
        r13 = -1359668543; // 0xffffffffaef51ac1 float:-1.11460625E-10 double:NaN;
        r0 = r27;
        r0 = r0 * r13;
        r27 = r0;
        p000.Request.f272y = r27;
    L_0x0634:
        r13 = 4;
        r0 = r24;
        if (r13 != r0) goto L_0x0671;
    L_0x0639:
        r27 = p000.Segment.f277y;
        r13 = -741992617; // 0xffffffffd3c61757 float:-1.7015902E12 double:NaN;
        r0 = r25;
        r0 = r0 * r13;
        r25 = r0;
        r1 = r27;
        r0 = r0 + r1;
        r25 = r0;
        p000.Segment.f277y = r25;
        r25 = p000.Segment.f277y;
        r13 = -1421687705; // 0xffffffffab42c467 float:-6.919521E-13 double:NaN;
        r0 = r25;
        r0 = r0 * r13;
        r25 = r0;
        r13 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r25;
        if (r0 >= r13) goto L_0x065f;
    L_0x065a:
        r13 = -485774464; // 0xffffffffe30bab80 float:-2.5764553E21 double:NaN;
        p000.Segment.f277y = r13;
    L_0x065f:
        r25 = p000.Segment.f277y;
        r13 = -1421687705; // 0xffffffffab42c467 float:-6.919521E-13 double:NaN;
        r25 = r13 * r25;
        r13 = 383; // 0x17f float:5.37E-43 double:1.89E-321;
        r0 = r25;
        if (r0 <= r13) goto L_0x0671;
    L_0x066c:
        r13 = -715330775; // 0xffffffffd55ceb29 float:-1.51814102E13 double:NaN;
        p000.Segment.f277y = r13;
    L_0x0671:
        r24 = r24 + 1;
        goto L_0x0561;
    L_0x0676:
        r30 = p000.OrgFile.this$0;
        r0 = r20;
        r0 = r0.dir;	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = r0;
        r13 = 487694493; // 0x1d11a09d float:1.9273625E-21 double:2.409530947E-315;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r0 = r20;
        r15 = r0.items;	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = -570609171; // 0xffffffffddfd31ed float:-2.28057802E18 double:NaN;
        r15 = r15 * r13;
        r0 = r20;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x06c4 }
        r42 = r0;
        r13 = -1662952889; // 0xffffffff9ce15a47 float:-1.4912587E-21 double:NaN;
        r42 = r13 * r42;
        r0 = r20;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x06c4 }
        r43 = r0;
        r13 = 1820774789; // 0x6c86d185 float:1.3038839E27 double:8.99582272E-315;
        r43 = r13 * r43;
        r13 = 60;
        r17 = 0;
        r64 = -1;
        r45 = 0;
        r0 = r30;
        r1 = r78;
        r2 = r15;
        r3 = r42;
        r4 = r43;
        r5 = r13;
        r6 = r20;
        r7 = r17;
        r8 = r64;
        r10 = r45;
        r0.get(r1, r2, r3, r4, r5, r6, r7, r8, r10);	 Catch:{ RuntimeException -> 0x06c4 }
        goto L_0x00c4;
    L_0x06c4:
        r66 = move-exception;
        r67 = new java.lang.StringBuilder;
        r0 = r67;
        r0.<init>();
        r68 = "ch.cj(";
        r0 = r67;
        r1 = r68;
        r67 = r0.append(r1);
        r13 = 41;
        r0 = r67;
        r67 = r0.append(r13);
        r0 = r67;
        r46 = r0.toString();
        r0 = r66;
        r1 = r46;
        r69 = p000.StringBuilder.append(r0, r1);
        throw r69;
    L_0x06ed:
        r78 = p000.ClassWriter.f48x;
        r13 = -721800181; // 0xffffffffd4fa340b float:-8.5969197E12 double:NaN;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r15 = p000.Wallet.f372y;
        r13 = -2076152847; // 0xffffffff84406bf1 float:-2.2619056E-36 double:NaN;
        r15 = r13 * r15;
        r42 = p000.Msg.size;
        r13 = -1674539149; // 0xffffffff9c308f73 float:-5.841892E-22 double:NaN;
        r0 = r42;
        r0 = r0 * r13;
        r42 = r0;
        r13 = 1752324281; // 0x687258b9 float:4.5777973E24 double:8.657632276E-315;
        r0 = r78;
        r1 = r42;
        r78 = p000.InputStream.toString(r0, r15, r1, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r15 = p000.Locale.f177y;
        r13 = 43525885; // 0x29826fd float:2.235677E-37 double:2.15046445E-316;
        r15 = r13 * r15;
        r0 = r78;
        r0 = r0 - r15;
        r78 = r0;
        r13 = 800; // 0x320 float:1.121E-42 double:3.953E-321;
        r0 = r78;
        if (r0 >= r13) goto L_0x07b1;
    L_0x0725:
        r70 = p000.Chart.size;
        r78 = p000.Msg.size;
        r13 = -1674539149; // 0xffffffff9c308f73 float:-5.841892E-22 double:NaN;
        r78 = r13 * r78;
        r71 = r70[r78];	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = p000.ClassWriter.f48x;
        r13 = -721800181; // 0xffffffffd4fa340b float:-8.5969197E12 double:NaN;
        r78 = r13 * r78;
        r78 = r78 >> 7;
        r72 = r71[r78];	 Catch:{ RuntimeException -> 0x06c4 }
        r78 = p000.Wallet.f372y;
        r13 = -2076152847; // 0xffffffff84406bf1 float:-2.2619056E-36 double:NaN;
        r78 = r13 * r78;
        r78 = r78 >> 7;
        r52 = r72[r78];	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 4;
        r0 = r52;
        r0 = r0 & r13;
        r52 = r0;
        if (r52 == 0) goto L_0x07b1;
    L_0x074e:
        r78 = p000.Msg.size;
        r13 = -1674539149; // 0xffffffff9c308f73 float:-5.841892E-22 double:NaN;
        r78 = r13 * r78;
    L_0x0755:
        r34 = r78;
        goto L_0x0537;
    L_0x075a:
        r78 = p000.client.type;
        r13 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r78 = r13 * r78;
        r0 = r20;
        r15 = r0.state;	 Catch:{ RuntimeException -> 0x06c4 }
        r13 = 1033436157; // 0x3d98fbfd float:0.07469938 double:5.105853023E-315;
        r15 = r13 * r15;
        r0 = r78;
        if (r0 < r15) goto L_0x00c4;
    L_0x076e:
        r78 = p000.client.file;
        r13 = -2000050073; // 0xffffffff88c9a867 float:-1.2136839E-33 double:NaN;
        r0 = r78;
        r0 = r0 * r13;
        r78 = r0;
        r13 = 444742068; // 0x1a8239b4 float:5.3859964E-23 double:2.19731777E-315;
        r0 = r20;
        r1 = r78;
        r0.add(r1, r13);	 Catch:{ RuntimeException -> 0x06c4 }
        r0 = r20;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x06c4 }
        r22 = r0;
        if (r22 == 0) goto L_0x0676;
    L_0x078a:
        r0 = r20;
        r0.iterator();	 Catch:{ RuntimeException -> 0x06c4 }
        goto L_0x00c4;
    L_0x0792:
        r53 = 1136623616; // 0x43bf8000 float:383.0 double:5.61566681E-315;
        r52 = (r50 > r53 ? 1 : (r50 == r53 ? 0 : -1));
        if (r52 <= 0) goto L_0x035a;
    L_0x0799:
        r50 = 1136623616; // 0x43bf8000 float:383.0 double:5.61566681E-315;
        goto L_0x035a;
    L_0x079f:
        r73 = p000.Main.this$0;
        r0 = r73;
        r0 = r0.f276i;	 Catch:{ RuntimeException -> 0x06c4 }
        r22 = r0;
        if (r22 == 0) goto L_0x06ed;
    L_0x07a9:
        r78 = p000.Msg.size;
        r13 = -1674539149; // 0xffffffff9c308f73 float:-5.841892E-22 double:NaN;
        r78 = r13 * r78;
        goto L_0x0755;
    L_0x07b1:
        r78 = 3;
        goto L_0x0755;
    L_0x07b4:
        r13 = 1134844291; // 0x43a45983 float:328.6993 double:5.606875776E-315;
        p000.C0001b.run(r13);	 Catch:{ RuntimeException -> 0x06c4 }
        goto L_0x0140;
    L_0x07bd:
        r31 = 0;
        goto L_0x044d;
    L_0x07c2:
        goto L_0x0395;
        */
        throw new UnsupportedOperationException("Method not decompiled: Server.init(int, int, int, int, int):void");
    }

    public static int read(boolean z, boolean z2, int i) {
        i = 0;
        if (z) {
            i = 0 + ((-773058017 * MappedRandomAccessFile.size) + (-33214903 * MappedRandomAccessFile.count));
        }
        return z2 ? i + ((-2034551303 * MappedRandomAccessFile.value) + (-920885363 * MappedRandomAccessFile.data)) : i;
    }

    public void add(int i) {
    }

    public void add(int i, byte b) {
    }

    abstract void add(Log log, Shape shape, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    abstract void add(Log log, Shape shape, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    abstract void doInBackground(Log log, R$drawable r$drawable, int i, int i2, int i3, int i4, int i5, int i6);

    abstract void doInBackground(Log log, R$drawable r$drawable, int i, int i2, int i3, int i4, int i5, int i6, byte b);

    public abstract LazyList get(byte b);

    public abstract Point get();

    public abstract Point get(int i);

    public abstract LazyList getKey();

    public abstract Point getType();

    public abstract LazyList getValue();

    public abstract Point init();

    abstract void init(Log log, Shape shape, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public void insert(int i) {
    }

    public void process(int i) {
    }

    abstract void run(Log log, R$drawable r$drawable, int i, int i2, int i3, int i4, int i5, int i6);

    abstract void set(Log log, Shape shape, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public void toString(int i) {
    }

    abstract void toString(Log log, Shape shape, int i, int i2, int i3, int i4, int i5, int i6, int i7);
}
