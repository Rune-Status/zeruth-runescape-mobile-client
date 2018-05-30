package p000;

/* compiled from: gx */
public abstract class Collection extends ArrayMap {
    int f62a;
    int active;
    String f63b;
    int body;
    int buffer;
    int bytes;
    int f64c;
    int color;
    int count;
    int[] f65d;
    int data;
    int[] f66e;
    int element;
    int first;
    int flags;
    int f67g;
    boolean f68h;
    int height;
    int f69i;
    Preferences id;
    int index;
    int items;
    int[] f70j;
    int key;
    boolean last;
    int[] length;
    int limit;
    int location;
    byte[] log;
    int f71m;
    int max;
    int min;
    int f72n;
    int name;
    int next;
    int offset;
    int out;
    int[] f73p;
    int parent;
    int path;
    int pointer;
    boolean pos;
    int position;
    int[] f74q;
    byte f75r;
    int f76s;
    public int size;
    int start;
    int state;
    int status;
    int text;
    int[] this$0;
    int title;
    int type;
    int uri;
    int f77v;
    public int value;
    boolean f78w;
    int width;
    int f79x;
    int f80y;

    Collection() {
        try {
            this.pos = false;
            this.count = 1981295833;
            this.type = -108915619;
            this.status = 878920581;
            this.f69i = 1204179289;
            this.flags = -1523276509;
            this.min = -539275743;
            this.max = 447796541;
            this.f79x = 1542339397;
            this.element = -1627332603;
            this.f63b = null;
            this.f78w = false;
            this.buffer = -206649612;
            this.f67g = 0;
            this.f71m = 0;
            this.f75r = (byte) 0;
            this.f73p = new int[4];
            this.f66e = new int[4];
            this.f74q = new int[4];
            this.f65d = new int[4];
            this.f70j = new int[4];
            this.id = new Preferences();
            this.key = -1968525927;
            this.last = false;
            this.next = -464408867;
            this.text = 662713255;
            this.bytes = 0;
            this.pointer = 0;
            this.data = 2033542925;
            this.position = 0;
            this.limit = 0;
            this.start = 0;
            this.first = 0;
            this.state = 2015474731;
            this.f62a = 0;
            this.f64c = 0;
            this.f80y = 0;
            this.f72n = 525082664;
            this.f77v = 0;
            this.f76s = 1180237088;
            this.parent = 0;
            this.this$0 = new int[10];
            this.length = new int[10];
            this.log = new byte[10];
            this.height = 0;
            this.width = 0;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gx.<init>(" + ')');
        }
    }

    static void init(int i) {
        client.session = -1196463673077901099L;
        client.properties = 873731045;
        Channel$1.value = true;
        client.initialized = true;
        client.m_count = -3203028930291284989L;
        Helper.data = new Preferences();
        client.this$0.update(258475297);
        client.this$0.this$0.data = 0;
        client.this$0.type = null;
        client.this$0.index = null;
        client.this$0.name = null;
        client.this$0.position = null;
        client.this$0.size = 0;
        client.this$0.data = 0;
        client.description = 0;
        client.text = 0;
        client.limit = 0;
        Settings.this$0.set(2045381524);
        Element.data = LinkedList.toString(2062926749) * -5162520218119863815L;
        DrawingGroup.content.clear();
        DrawingGroup.data.clear();
        DrawingGroup.map.set();
        DrawingGroup.size = 0;
        client.count = 0;
        Settings.this$0.initialize(false, 878291517);
        client.cache = 0;
        client.level = 0;
        client.info = 0;
        Context.data = null;
        client.location = 0;
        client.fileName = -1523675123;
        client.version = 0;
        client.element = 0;
        Settings.this$0.add(Channel$1.this$0, 1847129779);
        Settings.this$0.add(Channel$1.this$0, (byte) 47);
        client.length = 0;
        Utils.write((byte) -23);
        i = 0;
        while (i < 2048) {
            try {
                client.size[i] = null;
                i++;
            } catch (Throwable $r25) {
                throw StringBuilder.append($r25, "gx.bw(" + ')');
            }
        }
        for (i = 0; i < 32768; i++) {
            client.next[i] = null;
        }
        client.f402r = -1909811437;
        client.root.clear();
        client.points.clear();
        for (i = 0; i < 4; i++) {
            for (int $i2 = 0; $i2 < 104; $i2++) {
                for (int $i3 = 0; $i3 < 104; $i3++) {
                    client.map[i][$i2][$i3] = null;
                }
            }
        }
        client.buf = new Iterator();
        Primitive.data.set((byte) 6);
        for (i = 0; i < 1213286257 * ThemeDialog.size; i++) {
            if (TextUtils.get(i, (byte) 0) != null) {
                Event.size[i] = 0;
                Event.this$0[i] = 0;
            }
        }
        Connection.this$0.clear(876096636);
        client.f409z = 1001387759;
        if (-1 != client.parent * 1704673651) {
            Exception.write(1704673651 * client.parent, 1880211468);
        }
        for (Character $r21 = (Character) client.position.next(); $r21 != null; $r21 = (Character) client.position.get()) {
            Vector2D.add($r21, true, 870246130);
        }
        client.parent = -172739515;
        client.position = new Math(8);
        client.buffer = null;
        Settings.this$0.set(966473684);
        int[] iArr = new int[5];
        client.hash.toString(null, new int[]{0, 0, 0, 0, 0}, false, -1, 542614623);
        Settings.this$0.read(-773148759);
        Region.value = new Math(32);
        client.f406w = true;
        for (i = 0; i < 100; i++) {
            client.key[i] = true;
        }
        Connection.set((byte) -5);
        MyAsyncTask.this$0 = null;
        for (i = 0; i < 8; i++) {
            client.target[i] = new TokenStream();
        }
        ZStream.data = null;
    }

    static final void read(int i) {
        for (ArrayMap $r2 = (Color) client.root.get(); $r2 != null; $r2 = (Color) client.root.next()) {
            if ($r2.next * 668080881 == Msg.size * -1674539149) {
                if (client.type * 1581849891 <= $r2.this$0 * 12924235) {
                    if (client.type * 1581849891 >= $r2.type * 863217461) {
                        if (-740197611 * $r2.key > 0) {
                            Collection $r4 = client.next[(-740197611 * $r2.key) - 1];
                            if ($r4 != null) {
                                if (516759209 * $r4.size >= 0) {
                                    if ($r4.size * 516759209 < 13312) {
                                        if (2328865 * $r4.value >= 0) {
                                            if (2328865 * $r4.value < 13312) {
                                                $r2.add(516759209 * $r4.size, $r4.value * 2328865, InputStream.toString(516759209 * $r4.size, $r4.value * 2328865, 668080881 * $r2.next, 1764875317) - (-286436349 * $r2.position), 1581849891 * client.type, 739697424);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (-740197611 * $r2.key < 0) {
                            int $i0 = $r2.key * -740197611;
                            i = $i0;
                            i = (-$i0) - 1;
                            Item $r5 = i == -1522892003 * client.flags ? File.this$0 : client.size[i];
                            if ($r5 != null) {
                                if (516759209 * $r5.size >= 0) {
                                    if (516759209 * $r5.size < 13312) {
                                        if ($r5.value * 2328865 >= 0) {
                                            if (2328865 * $r5.value < 13312) {
                                                try {
                                                    $r2.add($r5.size * 516759209, $r5.value * 2328865, InputStream.toString(516759209 * $r5.size, $r5.value * 2328865, $r2.next * 668080881, 2111816012) - ($r2.position * -286436349), client.type * 1581849891, -138456134);
                                                } catch (Throwable $r7) {
                                                    throw StringBuilder.append($r7, "gx.dc(" + ')');
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        $r2.add(client.file * -2000050073, 985679668);
                        Log $r6 = OrgFile.this$0;
                        i = -1674539149 * Msg.size;
                        double $d0 = $r2.size;
                        int $i2 = (int) $d0;
                        $d0 = $r2.cache;
                        int $i3 = (int) $d0;
                        $d0 = $r2.f82b;
                        $r6.get(i, $i2, $i3, (int) $d0, 60, $r2, 2046375323 * $r2.f86n, -1, false);
                    }
                }
            }
            $r2.iterator();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void write(p000.System[] r25, int r26, int r27) {
        /*
        r27 = 0;
    L_0x0002:
        r0 = r25;
        r2 = r0.length;	 Catch:{ RuntimeException -> 0x0117 }
        r0 = r27;
        if (r0 >= r2) goto L_0x01c2;
    L_0x0009:
        r3 = r25[r27];	 Catch:{ RuntimeException -> 0x0117 }
        if (r3 != 0) goto L_0x019a;
    L_0x000d:
        r27 = r27 + 1;
        goto L_0x0002;
    L_0x0010:
        r4 = r3.position;	 Catch:{ RuntimeException -> 0x0117 }
        if (r4 == 0) goto L_0x0018;
    L_0x0014:
        r4 = r3.start;	 Catch:{ RuntimeException -> 0x0117 }
        if (r4 != 0) goto L_0x000d;
    L_0x0018:
        r2 = r3.name;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r2 = r2 * r5;
        if (r2 != 0) goto L_0x006d;
    L_0x0020:
        r4 = r3.position;	 Catch:{ RuntimeException -> 0x0117 }
        if (r4 != 0) goto L_0x002c;
    L_0x0024:
        r4 = r3.start;	 Catch:{ RuntimeException -> 0x0117 }
        if (r4 == 0) goto L_0x002c;
    L_0x0028:
        r6 = p000.Device.name;
        if (r6 != r3) goto L_0x000d;
    L_0x002c:
        r2 = r3.value;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1172750087; // 0x45e6bf07 float:7383.8784 double:5.79415529E-315;
        r2 = r2 * r5;
        r5 = 1843719551; // 0x6de4ed7f float:8.856212E27 double:9.109184907E-315;
        r0 = r25;
        p000.Collection.write(r0, r2, r5);	 Catch:{ RuntimeException -> 0x0117 }
        r7 = r3.key;	 Catch:{ RuntimeException -> 0x0117 }
        if (r7 == 0) goto L_0x004c;
    L_0x003e:
        r7 = r3.key;	 Catch:{ RuntimeException -> 0x0117 }
        r2 = r3.value;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1172750087; // 0x45e6bf07 float:7383.8784 double:5.79415529E-315;
        r2 = r2 * r5;
        r5 = 2003180942; // 0x77661d8e float:4.6672958E33 double:9.89702886E-315;
        p000.Collection.write(r7, r2, r5);	 Catch:{ RuntimeException -> 0x0117 }
    L_0x004c:
        r8 = p000.client.position;
        r2 = r3.value;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1172750087; // 0x45e6bf07 float:7383.8784 double:5.79415529E-315;
        r2 = r2 * r5;
        r9 = (long) r2;
        r11 = r8.get(r9);	 Catch:{ RuntimeException -> 0x0117 }
        r13 = r11;
        r13 = (p000.Character) r13;	 Catch:{ RuntimeException -> 0x0117 }
        r12 = r13;
        if (r12 == 0) goto L_0x006d;
    L_0x005f:
        r2 = r12.size;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 669823817; // 0x27ecb349 float:6.569754E-15 double:3.309369367E-315;
        r2 = r2 * r5;
        r5 = -52;
        r4 = p000.Hashtable.get(r2, r5);	 Catch:{ RuntimeException -> 0x0117 }
        if (r4 != 0) goto L_0x01a8;
    L_0x006d:
        r2 = r3.name;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -128421835; // 0xfffffffff8587035 float:-1.7559562E34 double:NaN;
        r2 = r5 * r2;
        r5 = 6;
        if (r2 != r5) goto L_0x000d;
    L_0x0077:
        r2 = r3.parent;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -1332946961; // 0xffffffffb08cd7ef float:-1.0247713E-9 double:NaN;
        r2 = r2 * r5;
        r5 = -1;
        if (r2 != r5) goto L_0x008a;
    L_0x0080:
        r2 = r3.root;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1431144723; // 0x554d8913 float:1.41242883E13 double:7.07079442E-315;
        r2 = r5 * r2;
        r5 = -1;
        if (r5 == r2) goto L_0x0140;
    L_0x008a:
        r5 = 25947; // 0x655b float:3.636E-41 double:1.28195E-319;
        r4 = p000.Main.get(r3, r5);	 Catch:{ RuntimeException -> 0x0117 }
        if (r4 == 0) goto L_0x01b8;
    L_0x0092:
        r2 = r3.root;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1431144723; // 0x554d8913 float:1.41242883E13 double:7.07079442E-315;
        r2 = r5 * r2;
    L_0x0099:
        r5 = -1;
        if (r2 == r5) goto L_0x0140;
    L_0x009c:
        r5 = 1672457752; // 0x63afae18 float:6.48145E21 double:8.263039194E-315;
        r14 = p000.AbstractBuffer.get(r2, r5);	 Catch:{ RuntimeException -> 0x0117 }
        r2 = r3.cnt;	 Catch:{ RuntimeException -> 0x0117 }
        r15 = p000.client.file;
        r5 = -976802993; // 0xffffffffc5c72b4f float:-6373.4136 double:NaN;
        r15 = r5 * r15;
        r2 = r2 + r15;
        r3.cnt = r2;	 Catch:{ RuntimeException -> 0x0117 }
    L_0x00af:
        r2 = r3.cnt;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -136606871; // 0xfffffffff7db8b69 float:-8.905786E33 double:NaN;
        r2 = r2 * r5;
        r0 = r14.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r16 = r0;
        r15 = r3.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1305639591; // 0x4dd27aa7 float:4.41406688E8 double:6.45071668E-315;
        r15 = r15 * r5;
        r15 = r16[r15];	 Catch:{ RuntimeException -> 0x0117 }
        if (r2 <= r15) goto L_0x0140;
    L_0x00c3:
        r2 = r3.cnt;	 Catch:{ RuntimeException -> 0x0117 }
        r0 = r14.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r16 = r0;
        r15 = r3.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1305639591; // 0x4dd27aa7 float:4.41406688E8 double:6.45071668E-315;
        r15 = r15 * r5;
        r15 = r16[r15];	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 985248985; // 0x3ab9b4d9 float:0.0014168277 double:4.86777676E-315;
        r15 = r15 * r5;
        r2 = r2 - r15;
        r3.cnt = r2;	 Catch:{ RuntimeException -> 0x0117 }
        r2 = r3.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1297059095; // 0x4d4f8d17 float:2.17633136E8 double:6.408323395E-315;
        r2 = r2 + r5;
        r3.buffer = r2;	 Catch:{ RuntimeException -> 0x0117 }
        r2 = r3.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1305639591; // 0x4dd27aa7 float:4.41406688E8 double:6.45071668E-315;
        r2 = r2 * r5;
        r0 = r14.size;	 Catch:{ RuntimeException -> 0x0117 }
        r16 = r0;
        r15 = r0.length;	 Catch:{ RuntimeException -> 0x0117 }
        if (r2 < r15) goto L_0x0111;
    L_0x00ed:
        r2 = r3.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r15 = r14.data;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 111453891; // 0x6a4a6c3 float:6.193498E-35 double:5.50655386E-316;
        r15 = r5 * r15;
        r2 = r2 - r15;
        r3.buffer = r2;	 Catch:{ RuntimeException -> 0x0117 }
        r2 = r3.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1305639591; // 0x4dd27aa7 float:4.41406688E8 double:6.45071668E-315;
        r2 = r2 * r5;
        if (r2 < 0) goto L_0x010e;
    L_0x0101:
        r2 = r3.buffer;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 1305639591; // 0x4dd27aa7 float:4.41406688E8 double:6.45071668E-315;
        r2 = r2 * r5;
        r0 = r14.size;	 Catch:{ RuntimeException -> 0x0117 }
        r16 = r0;
        r15 = r0.length;	 Catch:{ RuntimeException -> 0x0117 }
        if (r2 < r15) goto L_0x0111;
    L_0x010e:
        r5 = 0;
        r3.buffer = r5;	 Catch:{ RuntimeException -> 0x0117 }
    L_0x0111:
        r5 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        p000.client.add(r3, r5);	 Catch:{ RuntimeException -> 0x0117 }
        goto L_0x00af;
    L_0x0117:
        r17 = move-exception;
        r18 = new java.lang.StringBuilder;
        r0 = r18;
        r0.<init>();
        r19 = "gx.fr(";
        r0 = r18;
        r1 = r19;
        r18 = r0.append(r1);
        r5 = 41;
        r0 = r18;
        r18 = r0.append(r5);
        r0 = r18;
        r20 = r0.toString();
        r0 = r17;
        r1 = r20;
        r21 = p000.StringBuilder.append(r0, r1);
        throw r21;
    L_0x0140:
        r2 = r3.limit;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 256192875; // 0xf45316b float:9.7223675E-30 double:1.26576098E-315;
        r2 = r2 * r5;
        if (r2 == 0) goto L_0x000d;
    L_0x0148:
        r4 = r3.position;	 Catch:{ RuntimeException -> 0x0117 }
        if (r4 != 0) goto L_0x000d;
    L_0x014c:
        r2 = r3.limit;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 256192875; // 0xf45316b float:9.7223675E-30 double:1.26576098E-315;
        r2 = r2 * r5;
        r2 = r2 >> 16;
        r15 = r3.limit;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 256192875; // 0xf45316b float:9.7223675E-30 double:1.26576098E-315;
        r15 = r15 * r5;
        r15 = r15 << 16;
        r15 = r15 >> 16;
        r22 = p000.client.file;
        r5 = -2000050073; // 0xffffffff88c9a867 float:-1.2136839E-33 double:NaN;
        r0 = r22;
        r0 = r0 * r5;
        r22 = r0;
        r22 = r2 * r22;
        r2 = p000.client.file;
        r5 = -2000050073; // 0xffffffff88c9a867 float:-1.2136839E-33 double:NaN;
        r2 = r2 * r5;
        r2 = r15 * r2;
        r15 = r3.data;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -1375479599; // 0xffffffffae03d8d1 float:-2.9978523E-11 double:NaN;
        r15 = r15 * r5;
        r15 = r22 + r15;
        r15 = r15 & 2047;
        r5 = 770408497; // 0x2deb8031 float:2.6773335E-11 double:3.806323716E-315;
        r15 = r15 * r5;
        r3.data = r15;	 Catch:{ RuntimeException -> 0x0117 }
        r15 = r3.count;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -2032348791; // 0xffffffff86dcd189 float:-8.3062687E-35 double:NaN;
        r15 = r15 * r5;
        r2 = r15 + r2;
        r2 = r2 & 2047;
        r5 = -41487175; // 0xfffffffffd86f4b9 float:-2.2423403E37 double:NaN;
        r2 = r2 * r5;
        r3.count = r2;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = 11;
        p000.client.add(r3, r5);	 Catch:{ RuntimeException -> 0x0117 }
        goto L_0x000d;
    L_0x019a:
        r2 = r3.type;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -1008623461; // 0xffffffffc3e1a09b float:-451.25473 double:NaN;
        r2 = r5 * r2;
        r0 = r26;
        if (r2 == r0) goto L_0x0010;
    L_0x01a5:
        goto L_0x000d;
    L_0x01a8:
        r23 = p000.Float.size;
        r7 = r23[r2];	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -1;
        r24 = 1163945089; // 0x45606481 float:3590.2815 double:5.75065282E-315;
        r0 = r24;
        p000.Collection.write(r7, r5, r0);	 Catch:{ RuntimeException -> 0x0117 }
        goto L_0x006d;
    L_0x01b8:
        r2 = r3.parent;	 Catch:{ RuntimeException -> 0x0117 }
        r5 = -1332946961; // 0xffffffffb08cd7ef float:-1.0247713E-9 double:NaN;
        r2 = r5 * r2;
        goto L_0x0099;
    L_0x01c2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Collection.write(System[], int, int):void");
    }

    final void m7a(int i, int i2, int i3, int i4, int i5, int i6) {
        int $i7;
        int $i8;
        int $i6 = 0;
        boolean $z0 = true;
        boolean $z1 = true;
        for ($i7 = 0; $i7 < 4; $i7++) {
            if (this.f74q[$i7] > i5) {
                $z1 = false;
            } else {
                $z0 = false;
            }
        }
        if (i >= 0) {
            ClassWriter $r1 = Label.add(i, (byte) 29);
            $i8 = 483376017 * $r1.f50b;
            $i7 = $r1.f58q * 1659950271;
        } else {
            $i7 = 0;
            $i8 = -1;
        }
        if (!$z0) {
            if ($z1) {
                this.f75r = (byte) 0;
            }
            for ($i8 = 0; $i8 < 4; $i8++) {
                $i6 = this.f75r;
                this.f75r = (byte) ((this.f75r + 1) % 4);
                if (this.f74q[$i6] <= i5) {
                    break;
                }
            }
            $i6 = -1;
        } else if ($i8 != -1) {
            int $i10 = $i8 == 0 ? this.f74q[0] : $i8 == 1 ? this.f66e[0] : 0;
            int $i11 = 1;
            while ($i11 < 4) {
                if ($i8 == 0) {
                    if (this.f74q[$i11] < $i10) {
                        $i10 = this.f74q[$i11];
                        $i6 = $i11;
                    }
                } else if ($i8 == 1 && this.f66e[$i11] < $i10) {
                    $i10 = this.f66e[$i11];
                    $i6 = $i11;
                }
                $i11++;
            }
            if (1 == $i8 && $i10 >= i2) {
                return;
            }
        } else {
            return;
        }
        if ($i6 >= 0) {
            this.f73p[$i6] = i;
            this.f66e[$i6] = i2;
            this.f65d[$i6] = i3;
            this.f70j[$i6] = i4;
            this.f74q[$i6] = (i5 + $i7) + i6;
        }
    }

    final void add(int i) {
        try {
            this.parent = 0;
            this.width = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gx.br(" + ')');
        }
    }

    final void delete(int i) {
        Task $r3 = (Task) Task.context.get((long) i);
        if ($r3 == null) {
            byte[] $r9 = Task.activity.get(33, i, -278543099);
            $r3 = new Task();
            if ($r9 != null) {
                $r3.create(new Logger($r9), -2132871108);
            }
            Task.context.get($r3, (long) i);
        }
        LogActivity $r6 = (LogActivity) this.id.get();
        while ($r6 != null) {
            if ($r6.name == $r3) {
                $r6.iterator();
                return;
            }
            $r6 = (LogActivity) this.id.next();
        }
    }

    final void delete(int $i0, int i, int i2, int i3, int i4, int i5) {
        Task $r3 = (Task) Task.context.get((long) $i0);
        if ($r3 == null) {
            byte[] $r11 = Task.activity.get(33, $i0, -344991778);
            $r3 = new Task();
            if ($r11 != null) {
                $r3.create(new Logger($r11), -1548820356);
            }
            Task.context.get($r3, (long) $i0);
        }
        LogActivity $r4 = null;
        $i0 = $r3.id * -1753707067;
        Object $r7 = (LogActivity) this.id.get();
        int $i7 = 0;
        Object $r8 = null;
        while ($r7 != null) {
            $i7++;
            int $i8 = $r7.name;
            Task $r9 = $i8;
            if (-1793163190 * $i8.name == $r3.name * -26676483) {
                $r7.add(i + i3, i4, i5, i2, (byte) 15);
                return;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            if (1028749543 * $i8.length <= $r3.length * 1230603438) {
                $r8 = $r7;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            $i8 = $i8.id * -1753707067;
            int i6 = $i8;
            if ($i8 > $i0) {
                $i8 = $r7.name;
                $r9 = $i8;
                $i0 = 94029212 * $i8.id;
                $r4 = $r7;
            }
            $r7 = (LogActivity) this.id.next();
        }
        if ($r4 != null || $i7 < 4) {
            Object logActivity = new LogActivity($r3);
            if ($r8 == null) {
                this.id.add(logActivity);
            } else {
                Preferences.add(logActivity, $r8);
            }
            logActivity.add(i + i3, i4, i5, i2, (byte) 81);
            if ($i7 >= 4) {
                $r4.iterator();
            }
        }
    }

    final void doInBackground(int $i0, int i, int i2, int i3, int i4, int i5) {
        Task $r3 = (Task) Task.context.get((long) $i0);
        if ($r3 == null) {
            byte[] $r11 = Task.activity.get(33, $i0, -1050938365);
            $r3 = new Task();
            if ($r11 != null) {
                $r3.create(new Logger($r11), -1154539662);
            }
            Task.context.get($r3, (long) $i0);
        }
        LogActivity $r4 = null;
        Object $r7 = (LogActivity) this.id.get();
        int $i7 = 0;
        $i0 = $r3.id * -1753707067;
        Object $r8 = null;
        while ($r7 != null) {
            $i7++;
            int $i8 = $r7.name;
            Task $r9 = $i8;
            if (-26676483 * $i8.name == $r3.name * -26676483) {
                $r7.add(i + i3, i4, i5, i2, (byte) 105);
                return;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            if (1028749543 * $i8.length <= $r3.length * 1028749543) {
                $r8 = $r7;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            $i8 = $i8.id * -1753707067;
            int i6 = $i8;
            if ($i8 > $i0) {
                $i8 = $r7.name;
                $r9 = $i8;
                $i0 = -1753707067 * $i8.id;
                $r4 = $r7;
            }
            $r7 = (LogActivity) this.id.next();
        }
        if ($r4 != null || $i7 < 4) {
            LogActivity $r72 = new LogActivity($r3);
            if ($r8 == null) {
                this.id.add($r72);
            } else {
                Preferences.add($r72, $r8);
            }
            $r72.add(i + i3, i4, i5, i2, (byte) 106);
            if ($i7 >= 4) {
                $r4.iterator();
            }
        }
    }

    final void flush() {
        this.parent = 0;
        this.width = 0;
    }

    final void get(int i, int i2) {
        Task $r3 = (Task) Task.context.get((long) i);
        if ($r3 == null) {
            byte[] $r9 = Task.activity.get(33, i, -1374793306);
            $r3 = new Task();
            if ($r9 != null) {
                $r3.create(new Logger($r9), -1391131321);
            }
            Task.context.get($r3, (long) i);
        }
        try {
            LogActivity $r6 = (LogActivity) this.id.get();
            while ($r6 != null) {
                if ($r6.name == $r3) {
                    $r6.iterator();
                    return;
                }
                $r6 = (LogActivity) this.id.next();
            }
        } catch (Throwable $r11) {
            throw StringBuilder.append($r11, "gx.bq(" + ')');
        }
    }

    final void get(int $i0, int i, int i2, int i3, int i4, int i5) {
        Task $r3 = (Task) Task.context.get((long) $i0);
        if ($r3 == null) {
            byte[] $r11 = Task.activity.get(-23020248, $i0, -107753191);
            $r3 = new Task();
            if ($r11 != null) {
                $r3.create(new Logger($r11), -1534820974);
            }
            Task.context.get($r3, (long) $i0);
        }
        LogActivity $r4 = null;
        $i0 = $r3.id * -1753707067;
        Object $r7 = (LogActivity) this.id.get();
        int $i7 = 0;
        Object $r8 = null;
        while ($r7 != null) {
            $i7++;
            int $i8 = $r7.name;
            Task $r9 = $i8;
            if (-26676483 * $i8.name == $r3.name * -26676483) {
                $r7.add(i + i3, i4, i5, i2, (byte) 25);
                return;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            if (2085855333 * $i8.length <= $r3.length * 1028749543) {
                $r8 = $r7;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            $i8 = $i8.id * 2069055019;
            int i6 = $i8;
            if ($i8 > $i0) {
                $i8 = $r7.name;
                $r9 = $i8;
                $i0 = -803698322 * $i8.id;
                $r4 = $r7;
            }
            $r7 = (LogActivity) this.id.next();
        }
        if ($r4 != null || $i7 < 4) {
            Object logActivity = new LogActivity($r3);
            if ($r8 == null) {
                this.id.add(logActivity);
            } else {
                Preferences.add(logActivity, $r8);
            }
            logActivity.add(i + i3, i4, i5, i2, (byte) 64);
            if ($i7 >= 4) {
                $r4.iterator();
            }
        }
    }

    final void get(int $i0, int i, int i2, int i3, int i4, int i5, byte b) {
        Task $r3 = (Task) Task.context.get((long) $i0);
        if ($r3 == null) {
            byte[] $r11 = Task.activity.get(33, $i0, -1133693932);
            $r3 = new Task();
            if ($r11 != null) {
                $r3.create(new Logger($r11), -1561905536);
            }
            Task.context.get($r3, (long) $i0);
        }
        try {
            Object $r6 = (LogActivity) this.id.get();
            int $i8 = 0;
            Object $r7 = null;
            $i0 = $r3.id * -1753707067;
            Object $r8 = null;
            while ($r6 != null) {
                $i8++;
                int $i9 = $r6.name;
                Task $r9 = $i9;
                if (-26676483 * $i9.name == $r3.name * -26676483) {
                    $r6.add(i + i3, i4, i5, i2, (byte) 78);
                    return;
                }
                $i9 = $r6.name;
                $r9 = $i9;
                if (1028749543 * $i9.length <= $r3.length * 1028749543) {
                    $r8 = $r6;
                }
                $i9 = $r6.name;
                $r9 = $i9;
                $i9 = $i9.id * -1753707067;
                int i6 = $i9;
                if ($i9 > $i0) {
                    $i9 = $r6.name;
                    $r9 = $i9;
                    $i0 = -1753707067 * $i9.id;
                    $r7 = $r6;
                }
                $r6 = (LogActivity) this.id.next();
            }
            if ($r7 != null || $i8 < 4) {
                LogActivity $r62 = new LogActivity($r3);
                if ($r8 == null) {
                    this.id.add($r62);
                } else {
                    Preferences.add($r62, $r8);
                }
                $r62.add(i + i3, i4, i5, i2, (byte) 124);
                if ($i8 >= 4) {
                    $r7.iterator();
                }
            }
        } catch (Throwable $r13) {
            throw StringBuilder.append($r13, "gx.bi(" + ')');
        }
    }

    final void init(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean $z0 = true;
        boolean $z1 = true;
        i7 = 0;
        while (i7 < 4) {
            try {
                if (this.f74q[i7] > i5) {
                    $z1 = false;
                } else {
                    $z0 = false;
                }
                i7++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "gx.bj(" + ')');
            }
        }
        int $i11 = -1;
        int $i7 = 0;
        if (i >= 0) {
            ClassWriter $r2 = Label.add(i, (byte) 67);
            $i11 = 483376017 * $r2.f50b;
            $i7 = $r2.f58q * 1659950271;
        }
        if (!$z0) {
            if ($z1) {
                this.f75r = (byte) 0;
            }
            for ($i11 = 0; $i11 < 4; $i11++) {
                i7 = this.f75r;
                this.f75r = (byte) ((this.f75r + 1) % 4);
                if (this.f74q[i7] <= i5) {
                    break;
                }
            }
            i7 = -1;
        } else if ($i11 != -1) {
            i7 = 0;
            int $i8 = 0;
            if ($i11 == 0) {
                $i8 = this.f74q[0];
            } else if ($i11 == 1) {
                $i8 = this.f66e[0];
            }
            for (int $i9 = 1; $i9 < 4; $i9++) {
                if ($i11 == 0) {
                    if (this.f74q[$i9] < $i8) {
                        $i8 = this.f74q[$i9];
                        i7 = $i9;
                    } else {
                        continue;
                    }
                } else if ($i11 != 1) {
                    continue;
                } else if (this.f66e[$i9] < $i8) {
                    $i8 = this.f66e[$i9];
                    i7 = $i9;
                } else {
                    continue;
                }
            }
            if (1 == $i11 && $i8 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i7 >= 0) {
            this.f73p[i7] = i;
            this.f66e[i7] = i2;
            this.f65d[i7] = i3;
            this.f70j[i7] = i4;
            this.f74q[i7] = (i5 + $i7) + i6;
        }
    }

    boolean isNegative() {
        return false;
    }

    boolean isValid() {
        return false;
    }

    final void reset() {
        this.parent = 0;
        this.width = 0;
    }

    final void save(int i) {
        Task $r3 = (Task) Task.context.get((long) i);
        if ($r3 == null) {
            byte[] $r9 = Task.activity.get(33, i, -1504481731);
            $r3 = new Task();
            if ($r9 != null) {
                $r3.create(new Logger($r9), -1762162315);
            }
            Task.context.get($r3, (long) i);
        }
        LogActivity $r6 = (LogActivity) this.id.get();
        while ($r6 != null) {
            if ($r6.name == $r3) {
                $r6.iterator();
                return;
            }
            $r6 = (LogActivity) this.id.next();
        }
    }

    final void save(int $i0, int i, int i2, int i3, int i4, int i5) {
        Task $r3 = (Task) Task.context.get((long) $i0);
        if ($r3 == null) {
            byte[] $r11 = Task.activity.get(33, $i0, -463317602);
            $r3 = new Task();
            if ($r11 != null) {
                $r3.create(new Logger($r11), -1472204498);
            }
            Task.context.get($r3, (long) $i0);
        }
        LogActivity $r4 = null;
        $i0 = $r3.id * -1753707067;
        Object $r7 = (LogActivity) this.id.get();
        int $i7 = 0;
        Object $r8 = null;
        while ($r7 != null) {
            $i7++;
            int $i8 = $r7.name;
            Task $r9 = $i8;
            if (-26676483 * $i8.name == $r3.name * -26676483) {
                $r7.add(i + i3, i4, i5, i2, (byte) 66);
                return;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            if (1028749543 * $i8.length <= $r3.length * 1028749543) {
                $r8 = $r7;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            $i8 = $i8.id * -1753707067;
            int i6 = $i8;
            if ($i8 > $i0) {
                $i8 = $r7.name;
                $r9 = $i8;
                $i0 = -1753707067 * $i8.id;
                $r4 = $r7;
            }
            $r7 = (LogActivity) this.id.next();
        }
        if ($r4 != null || $i7 < 4) {
            Object logActivity = new LogActivity($r3);
            if ($r8 == null) {
                this.id.add(logActivity);
            } else {
                Preferences.add(logActivity, $r8);
            }
            logActivity.add(i + i3, i4, i5, i2, (byte) 16);
            if ($i7 >= 4) {
                $r4.iterator();
            }
        }
    }

    boolean toString(int i) {
        return false;
    }

    final void write(int i) {
        Task $r3 = (Task) Task.context.get((long) i);
        if ($r3 == null) {
            byte[] $r9 = Task.activity.get(33, i, 196089934);
            $r3 = new Task();
            if ($r9 != null) {
                $r3.create(new Logger($r9), -1707386216);
            }
            Task.context.get($r3, (long) i);
        }
        LogActivity $r6 = (LogActivity) this.id.get();
        while ($r6 != null) {
            if ($r6.name == $r3) {
                $r6.iterator();
                return;
            }
            $r6 = (LogActivity) this.id.next();
        }
    }

    final void write(int $i0, int i, int i2, int i3, int i4, int i5) {
        Task $r3 = (Task) Task.context.get((long) $i0);
        if ($r3 == null) {
            byte[] $r11 = Task.activity.get(33, $i0, -1642319694);
            $r3 = new Task();
            if ($r11 != null) {
                $r3.create(new Logger($r11), -1738571036);
            }
            Task.context.get($r3, (long) $i0);
        }
        LogActivity $r4 = null;
        Object $r7 = (LogActivity) this.id.get();
        int $i7 = 0;
        $i0 = $r3.id * -1753707067;
        Object $r8 = null;
        while ($r7 != null) {
            $i7++;
            int $i8 = $r7.name;
            Task $r9 = $i8;
            if (-26676483 * $i8.name == $r3.name * -26676483) {
                $r7.add(i + i3, i4, i5, i2, (byte) 52);
                return;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            if (1028749543 * $i8.length <= $r3.length * 1028749543) {
                $r8 = $r7;
            }
            $i8 = $r7.name;
            $r9 = $i8;
            $i8 = $i8.id * -1753707067;
            int i6 = $i8;
            if ($i8 > $i0) {
                $i8 = $r7.name;
                $r9 = $i8;
                $i0 = -1753707067 * $i8.id;
                $r4 = $r7;
            }
            $r7 = (LogActivity) this.id.next();
        }
        if ($r4 != null || $i7 < 4) {
            LogActivity $r72 = new LogActivity($r3);
            if ($r8 == null) {
                this.id.add($r72);
            } else {
                Preferences.add($r72, $r8);
            }
            $r72.add(i + i3, i4, i5, i2, (byte) 17);
            if ($i7 >= 4) {
                $r4.iterator();
            }
        }
    }
}
