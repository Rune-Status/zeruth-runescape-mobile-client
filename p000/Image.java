package p000;

/* compiled from: gq */
public class Image implements Preference {
    static final int FLAGS_DEFAULT_TYPE_STRING = 256;
    static final int N_100 = 100;
    static final int PROGRAM_INIT_SIZE = 100;
    static final int TEXTWRAP = 4;
    public int[] TAG;
    double adapter;
    public int[] buffer;
    boolean cache;
    public TimeUnit context;
    long count;
    public int[] data;
    int height;
    int id;
    boolean index;
    int[] key;
    int length;
    boolean level;
    int lock;
    int name;
    int[] f133p;
    int parent;
    long path;
    int[] f134r;
    int scaledHeight;
    boolean settings;
    int size;
    boolean state;
    boolean[] text;
    public int[] this$0;
    int title;
    char[] type;
    int value;
    TimeUnit values;
    int view;
    int width;
    long[] f135x;
    int f136y;

    Image() {
        try {
            this.context = TimeUnit.activity;
            this.id = 0;
            this.lock = 0;
            this.TAG = new int[4];
            this.buffer = new int[4];
            this.this$0 = new int[4];
            this.data = new int[4];
            this.name = 823062321;
            this.value = -1512441983;
            this.parent = 308435853;
            this.view = -32292623;
            this.settings = false;
            this.cache = true;
            this.index = true;
            this.values = null;
            this.state = false;
            this.length = 0;
            this.key = new int[Constants.f93X];
            this.type = new char[Constants.f93X];
            this.text = new boolean[Caption.Theme_spinnerStyle];
            this.width = -309954765;
            this.height = 1111166909;
            this.size = 0;
            this.f133p = new int[500];
            this.f134r = new int[500];
            this.f135x = new long[500];
            this.f136y = 0;
            transform(100, -1520821683);
            init(-1372031147);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "gq.<init>(" + ')');
        }
    }

    static Double toString(Class classR, int i, int i2, int i3) {
        try {
            return !Args.add(classR, i, i2, 2092341782) ? null : Character.add(1961832503);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gq.ad(" + ')');
        }
    }

    void add(int $i0, int i, long $l2, boolean z) {
        this.width = 309954765 * $i0;
        this.height = -1111166909 * i;
        this.count = 8296885441471954829L * $l2;
        this.level = z;
    }

    void add(TimeUnit timeUnit, int i) {
        try {
            if (this.values == null) {
                this.values = timeUnit;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gq.ak(" + ')');
        }
    }

    public boolean add(char c, long j) {
        try {
            if (this.length * 205531465 < this.key.length) {
                this.key[this.length * 205531465] = -1;
                this.type[this.length * 205531465] = c;
                this.length -= 1796138759;
            }
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gq.ar(" + ')');
        }
    }

    public boolean add(int i, byte b) {
        try {
            return this.text[i];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gq.ac(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(int r11, int r12, int r13, int r14, long r15) {
        /*
        r10 = this;
        r0 = 0;
        r1 = 4;
        if (r11 < r1) goto L_0x0075;
    L_0x0004:
        r1 = 1;
        return r1;
    L_0x0006:
        r12 = r10.lock;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = -328008069; // 0xffffffffec72fe7b float:-1.1750472E27 double:NaN;
        r12 = r12 - r1;
        r10.lock = r12;	 Catch:{ RuntimeException -> 0x0048 }
        if (r11 != 0) goto L_0x0010;
    L_0x0010:
        r12 = r10.lock;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = -1370279757; // 0xffffffffae5330b3 float:-4.80191E-11 double:NaN;
        r12 = r12 * r1;
        if (r12 != 0) goto L_0x0025;
    L_0x0018:
        r2 = r10.context;	 Catch:{ RuntimeException -> 0x0048 }
        r12 = r2.name;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = -1174131427; // 0xffffffffba042d1d float:-5.042123E-4 double:NaN;
        r12 = r1 * r12;
        switch(r12) {
            case 0: goto L_0x00ca;
            case 1: goto L_0x00ca;
            case 2: goto L_0x0025;
            case 3: goto L_0x00a9;
            case 4: goto L_0x006c;
            case 5: goto L_0x0025;
            case 6: goto L_0x0025;
            case 7: goto L_0x00a0;
            case 8: goto L_0x00bf;
            case 9: goto L_0x0063;
            case 10: goto L_0x00b4;
            case 11: goto L_0x0025;
            case 12: goto L_0x007f;
            default: goto L_0x0024;
        };
    L_0x0024:
        goto L_0x0025;
    L_0x0025:
        r12 = r10.lock;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = -1370279757; // 0xffffffffae5330b3 float:-4.80191E-11 double:NaN;
        r12 = r12 * r1;
        r1 = 1;
        if (r12 != r1) goto L_0x00d5;
    L_0x002e:
        r2 = r10.context;	 Catch:{ RuntimeException -> 0x0048 }
        r3 = p000.TimeUnit.owner;
        if (r2 != r3) goto L_0x00d5;
    L_0x0034:
        if (r11 != 0) goto L_0x0037;
    L_0x0036:
        r0 = 1;
    L_0x0037:
        r1 = 2130578643; // 0x7efe0cd3 float:1.6884525E38 double:1.0526457133E-314;
        r11 = r0 * r1;
        r10.f136y = r11;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = p000.TimeUnit.type;
        r1 = 1986087731; // 0x76614b33 float:1.142375E33 double:9.812577175E-315;
        r10.get(r2, r1);	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1;
        return r1;
    L_0x0048:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "gq.ae(";
        r5 = r5.append(r6);
        r1 = 41;
        r5 = r5.append(r1);
        r7 = r5.toString();
        r8 = p000.StringBuilder.append(r4, r7);
        throw r8;
    L_0x0063:
        r2 = p000.TimeUnit.count;
        r1 = 2039291121; // 0x798d1cf1 float:9.158761E34 double:1.007543685E-314;
        r10.get(r2, r1);	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0025;
    L_0x006c:
        r2 = p000.TimeUnit.count;
        r1 = 1864098800; // 0x6f1be3f0 float:4.8245736E28 double:9.209871775E-315;
        r10.get(r2, r1);	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0025;
    L_0x0075:
        r12 = r10.lock;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = -1370279757; // 0xffffffffae5330b3 float:-4.80191E-11 double:NaN;
        r12 = r12 * r1;
        if (r12 != 0) goto L_0x0006;
    L_0x007d:
        r1 = 1;
        return r1;
    L_0x007f:
        r2 = p000.TimeUnit.context;
        r1 = 1497527608; // 0x59427538 float:3.4209393E15 double:7.39876945E-315;
        r10.get(r2, r1);	 Catch:{ RuntimeException -> 0x0048 }
        r9 = r10.this$0;	 Catch:{ RuntimeException -> 0x0048 }
        r12 = r10.parent;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1768661179; // 0x696ba0bb float:1.7803537E25 double:8.738347277E-315;
        r12 = r1 * r12;
        r1 = 0;
        r9[r1] = r12;	 Catch:{ RuntimeException -> 0x0048 }
        r9 = r10.data;	 Catch:{ RuntimeException -> 0x0048 }
        r12 = r10.view;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = -893628433; // 0xffffffffcabc4fef float:-6170615.5 double:NaN;
        r12 = r1 * r12;
        r1 = 0;
        r9[r1] = r12;	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0025;
    L_0x00a0:
        r1 = -1420540759; // 0xffffffffab5444a9 float:-7.5412815E-13 double:NaN;
        r10.init(r1);	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0025;
    L_0x00a9:
        r2 = p000.TimeUnit.count;
        r1 = 1587823849; // 0x5ea444e9 float:5.918421E18 double:7.844892154E-315;
        r10.get(r2, r1);	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0025;
    L_0x00b4:
        r2 = p000.TimeUnit.text;
        r1 = 1415797950; // 0x54635cbe float:3.90605413E12 double:6.994971285E-315;
        r10.get(r2, r1);	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0025;
    L_0x00bf:
        r2 = p000.TimeUnit.$assertionsDisabled;
        r1 = 1826458481; // 0x6cdd8b71 float:2.1426488E27 double:9.02390389E-315;
        r10.get(r2, r1);	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0025;
    L_0x00ca:
        r2 = p000.TimeUnit.$assertionsDisabled;
        r1 = 2144131092; // 0x7fccd814 float:NaN double:1.0593415127E-314;
        r10.get(r2, r1);	 Catch:{ RuntimeException -> 0x0048 }
        goto L_0x0025;
    L_0x00d5:
        r1 = 1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: Image.add(int, int, int, int, long):boolean");
    }

    public boolean add(int i, long j) {
        try {
            if (this.length * 205531465 < this.key.length) {
                this.key[this.length * 205531465] = i;
                this.type[this.length * 205531465] = '\u0000';
                this.length -= 1796138759;
            }
            this.text[i] = true;
            if (-2036797811 * client.out >= 2 && i == 66) {
                if (this.text[82]) {
                    PdfGraphics2D.write(1617769316);
                    return true;
                }
            }
            return true;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gq.ay(" + ')');
        }
    }

    void call() {
        for (int $i0 = 0; $i0 < 4; $i0++) {
            int[] $r1 = this.TAG;
            this.buffer[$i0] = -1;
            $r1[$i0] = -1;
            $r1 = this.this$0;
            this.data[$i0] = -1;
            $r1[$i0] = -1;
        }
    }

    void clear() {
        this.value = 787259948;
        this.name = 975007826;
    }

    void clear(int i) {
        try {
            this.name = -823062321 * this.this$0[0];
            this.value = 1512441983 * this.data[0];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gq.aw(" + ')');
        }
    }

    void clear(int $i0, int i) {
        this.name = -823062321 * $i0;
        this.value = 1512441983 * i;
    }

    void clear(TimeUnit timeUnit) {
        if (this.values == null) {
            this.values = timeUnit;
        }
    }

    void click(int i, int i2, long j) {
        int $i4 = this.size * 1857239005;
        if ($i4 > 0 && j / 50 == this.f135x[$i4 - 1] / 50) {
            $i4--;
        } else if ($i4 >= -190892559) {
            return;
        }
        this.f133p[$i4] = i;
        this.f134r[$i4] = i2;
        this.f135x[$i4] = j;
    }

    public boolean close(int i, long j) {
        return true;
    }

    void decode(int i) {
        i = 0;
        while (i < 4) {
            try {
                int[] $r1 = this.TAG;
                this.buffer[i] = -1;
                $r1[i] = -1;
                $r1 = this.this$0;
                this.data[i] = -1;
                $r1[i] = -1;
                i++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "gq.av(" + ')');
            }
        }
    }

    void delete() {
        this.length = 0;
        this.state = false;
        update(-358519115);
        switch (-1174131427 * this.context.name) {
            case 6:
                get(TimeUnit.$assertionsDisabled, 2070837986);
                return;
            default:
                return;
        }
    }

    void delete(int i) {
        try {
            this.value = -1512441983;
            this.name = 823062321;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gq.ag(" + ')');
        }
    }

    double distance(int $i0, int $i1) {
        return Math.hypot((double) (this.this$0[$i0] - this.this$0[$i1]), (double) (this.data[$i0] - this.data[$i1]));
    }

    void doLoad() {
        this.value = -1512441983;
        this.name = 823062321;
    }

    public void get(TimeUnit timeUnit, int i) {
        try {
            this.context = timeUnit;
            switch (this.context.name * -1174131427) {
                case 0:
                    client.locale = 2000264999 * this.this$0[this.f136y * 336472923];
                    client.resource = -710090741 * this.data[this.f136y * 336472923];
                    return;
                case 7:
                    if (-1 != this.parent * 1768661179) {
                        update(this.parent * 1768661179, this.view * -893628433, 829664992);
                        this.this$0[0] = this.parent * 1768661179;
                        this.data[0] = this.view * -893628433;
                    } else {
                        delete(1137019151);
                    }
                    init(633786339);
                    return;
                case 12:
                    if (this.lock * -1370279757 == 0) {
                        this.context = TimeUnit.context;
                    }
                    return;
                default:
                    return;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gq.ao(" + ')');
        }
        throw StringBuilder.append($r3, "gq.ao(" + ')');
    }

    double getDistance(int $i0, int $i1) {
        return Math.hypot((double) (this.this$0[$i0] - this.this$0[$i1]), (double) (this.data[$i0] - this.data[$i1]));
    }

    double getScale(int $i0, int $i1) {
        return Math.hypot((double) (this.this$0[$i0] - this.this$0[$i1]), (double) (this.data[$i0] - this.data[$i1]));
    }

    double getSpan(int $i0, int $i1) {
        return Math.hypot((double) (this.this$0[$i0] - this.this$0[$i1]), (double) (this.data[$i0] - this.data[$i1]));
    }

    public boolean getValue(int i) {
        return this.text[i];
    }

    void init() {
        if (this.lock * -1370279757 == 0) {
            this.context = TimeUnit.activity;
            this.values = null;
            this.id = 0;
            decode(1214057127);
            if (-1 != this.parent * 1768661179) {
                this.this$0[0] = this.parent * 1768661179;
                this.data[0] = -893628433 * this.view;
            }
            this.f136y = 0;
        }
    }

    void init(int i) {
        try {
            if (this.lock * -1370279757 == 0) {
                this.context = TimeUnit.activity;
                this.values = null;
                this.id = 0;
                decode(1071533755);
                if (-1 != this.parent * 1768661179) {
                    this.this$0[0] = this.parent * 1768661179;
                    this.data[0] = -893628433 * this.view;
                }
                this.f136y = 0;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gq.au(" + ')');
        }
    }

    void init(int $i0, int i, long $l2, boolean z) {
        this.width = 309954765 * $i0;
        this.height = -1111166909 * i;
        this.count = 8296885441471954829L * $l2;
        this.level = z;
    }

    void init(int $i0, int i, long $l2, boolean z, int i2) {
        try {
            this.width = 309954765 * $i0;
            this.height = -1111166909 * i;
            this.count = 8296885441471954829L * $l2;
            this.level = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gq.an(" + ')');
        }
    }

    public void init(TimeUnit timeUnit) {
        this.context = timeUnit;
        switch (this.context.name * -1174131427) {
            case 0:
                client.locale = 2000264999 * this.this$0[this.f136y * 336472923];
                client.resource = -710090741 * this.data[this.f136y * 336472923];
                return;
            case 7:
                if (-1 != this.parent * 1768661179) {
                    update(this.parent * 1768661179, this.view * -893628433, 2072618689);
                    this.this$0[0] = this.parent * 1768661179;
                    this.data[0] = this.view * -893628433;
                } else {
                    delete(2115963064);
                }
                init(524429756);
                return;
            case 12:
                if (this.lock * -1370279757 == 0) {
                    this.context = TimeUnit.context;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void init(short s) {
        try {
            this.values = null;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gq.ah(" + ')');
        }
    }

    public boolean init(char c, long j) {
        if (this.length * 205531465 < this.key.length) {
            this.key[this.length * 205531465] = -1;
            this.type[this.length * 205531465] = c;
            this.length += 2084787857;
        }
        return true;
    }

    public boolean init(int $i0, int i, int i2, int i3, long j) {
        if ($i0 >= 4) {
            return true;
        }
        if ($i0 > this.id * -1165392305) {
            return true;
        }
        if ($i0 == 0) {
            this.path = LinkedList.toString(477754323) * 184667085080661311L;
        }
        if (this.id * -1165392305 == $i0) {
            this.id += 152293551;
            this.TAG[$i0] = i2;
            this.buffer[$i0] = i3;
        }
        this.lock -= 328008069;
        this.this$0[$i0] = i2;
        this.data[$i0] = i3;
        if (-1165392305 * this.id == 1) {
            this.state = true;
            switch (this.context.name * -1174131427) {
                case 5:
                    if (i == 4 && ByteBufferList.f25a) {
                        get(TimeUnit.type, 1636507597);
                        break;
                    }
                    try {
                        update(i2, i3, -1487005747);
                        if (i == 2) {
                            get(TimeUnit.data, 1847492390);
                        } else {
                            get(TimeUnit.file, 2120287279);
                        }
                        init(i2, i3, j, i == 2, 1983865886);
                        break;
                    } catch (RuntimeException $r3) {
                        throw StringBuilder.append($r3, "gq.aj(" + ')');
                    }
                    break;
                case 9:
                    if (this.settings) {
                        get(TimeUnit.count, 1820303570);
                        break;
                    }
                    break;
                default:
                    break;
            }
        } else if (2 == this.id * -1165392305) {
            get(TimeUnit.owner, 2093346587);
            this.adapter = reset(0, 1, 1659389268);
            log(0, 1, (byte) 15);
            double $d0 = (double) client.TAG;
            Math.log($d0);
        } else if (-1165392305 * this.id > 2) {
            get(TimeUnit.$assertionsDisabled, 2013982967);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean init(int r31, int r32, int r33, long r34) {
        /*
        r30 = this;
        r6 = 4;
        r0 = r31;
        if (r0 < r6) goto L_0x00e4;
    L_0x0005:
        r6 = 1;
        return r6;
    L_0x0007:
        r6 = 0;
        r9 = 1;
        r10 = 86701741; // 0x52af6ad float:8.038669E-36 double:4.28363517E-316;
        r0 = r30;
        r7 = r0.reset(r6, r9, r10);	 Catch:{ RuntimeException -> 0x0139 }
        r0 = r30;
        r11 = r0.adapter;	 Catch:{ RuntimeException -> 0x0139 }
        r7 = r7 - r11;
        r13 = 4617315517961601024; // 0x4014000000000000 float:0.0 double:5.0;
        r7 = r7 / r13;
        r15 = (int) r7;
        r0 = r30;
        r7 = r0.adapter;	 Catch:{ RuntimeException -> 0x0139 }
        r16 = r15 * 5;
        r0 = r16;
        r11 = (double) r0;
        r7 = r7 + r11;
        r0 = r30;
        r0.adapter = r7;	 Catch:{ RuntimeException -> 0x0139 }
        r16 = p000.client.listener;
        r15 = -r15;
        r6 = 2110560611; // 0x7dcc9963 float:3.3994868E37 double:1.0427554914E-314;
        r15 = r15 * r6;
        r16 = r15 + r16;
        p000.client.listener = r16;
    L_0x0037:
        if (r31 != 0) goto L_0x00e2;
    L_0x0039:
        r0 = r30;
        r1 = r32;
        r2 = r33;
        r3 = r34;
        r0.recycle(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0139 }
        r0 = r30;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x0139 }
        r31 = r0;
        r6 = -1165392305; // 0xffffffffba89864f float:-0.0010492298 double:NaN;
        r31 = r6 * r31;
        r6 = 1;
        r0 = r31;
        if (r0 != r6) goto L_0x00e2;
    L_0x0054:
        r0 = r30;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x0139 }
        r34 = r0;
        r17 = 6528501353364054719; // 0x5a99e56432ebe2bf float:2.7460713E-8 double:2.8047352036725868E128;
        r34 = r17 * r34;
        r17 = 100;
        r0 = r34;
        r2 = r17;
        r0 = r0 + r2;
        r34 = r0;
        r19 = (r20 > r34 ? 1 : (r20 == r34 ? 0 : -1));
        if (r19 < 0) goto L_0x00e2;
    L_0x006e:
        r0 = r30;
        r0 = r0.TAG;	 Catch:{ RuntimeException -> 0x0139 }
        r22 = r0;
        r6 = 0;
        r16 = r22[r6];	 Catch:{ RuntimeException -> 0x0139 }
        r0 = r30;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x0139 }
        r22 = r0;
        r6 = 0;
        r31 = r22[r6];	 Catch:{ RuntimeException -> 0x0139 }
        r0 = r30;
        r15 = r0.title;	 Catch:{ RuntimeException -> 0x0139 }
        r6 = 1740097055; // 0x67b7c61f float:1.7356955E24 double:8.597221753E-315;
        r15 = r6 * r15;
        r15 = r16 - r15;
        r0 = r32;
        if (r0 < r15) goto L_0x00cc;
    L_0x008f:
        r0 = r30;
        r15 = r0.title;	 Catch:{ RuntimeException -> 0x0139 }
        r6 = 1740097055; // 0x67b7c61f float:1.7356955E24 double:8.597221753E-315;
        r15 = r6 * r15;
        r0 = r16;
        r0 = r0 + r15;
        r16 = r0;
        r0 = r32;
        r1 = r16;
        if (r0 > r1) goto L_0x00cc;
    L_0x00a3:
        r0 = r30;
        r0 = r0.title;	 Catch:{ RuntimeException -> 0x0139 }
        r32 = r0;
        r6 = 1740097055; // 0x67b7c61f float:1.7356955E24 double:8.597221753E-315;
        r32 = r6 * r32;
        r32 = r31 - r32;
        r0 = r33;
        r1 = r32;
        if (r0 < r1) goto L_0x00cc;
    L_0x00b6:
        r0 = r30;
        r0 = r0.title;	 Catch:{ RuntimeException -> 0x0139 }
        r32 = r0;
        r6 = 1740097055; // 0x67b7c61f float:1.7356955E24 double:8.597221753E-315;
        r0 = r32;
        r0 = r0 * r6;
        r32 = r0;
        r31 = r32 + r31;
        r0 = r33;
        r1 = r31;
        if (r0 <= r1) goto L_0x00e2;
    L_0x00cc:
        r0 = r30;
        r0 = r0.context;	 Catch:{ RuntimeException -> 0x0139 }
        r23 = r0;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x0139 }
        r31 = r0;
        r6 = -1174131427; // 0xffffffffba042d1d float:-5.042123E-4 double:NaN;
        r0 = r31;
        r0 = r0 * r6;
        r31 = r0;
        switch(r31) {
            case 3: goto L_0x018c;
            case 4: goto L_0x0171;
            case 8: goto L_0x0180;
            case 12: goto L_0x012c;
            default: goto L_0x00e1;
        };
    L_0x00e1:
        goto L_0x00e2;
    L_0x00e2:
        r6 = 1;
        return r6;
    L_0x00e4:
        r6 = 804194930; // 0x2fef0a72 float:4.3481269E-10 double:3.973250875E-315;
        r20 = p000.LinkedList.toString(r6);	 Catch:{ RuntimeException -> 0x0139 }
        r0 = r30;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0139 }
        r22 = r0;
        r24 = r22[r31];	 Catch:{ RuntimeException -> 0x0139 }
        r0 = r30;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0139 }
        r22 = r0;
        r22[r31] = r32;	 Catch:{ RuntimeException -> 0x0139 }
        r0 = r30;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0139 }
        r22 = r0;
        r22[r31] = r33;	 Catch:{ RuntimeException -> 0x0139 }
        r0 = r30;
        r0 = r0.lock;	 Catch:{ RuntimeException -> 0x0139 }
        r16 = r0;
        r6 = -1370279757; // 0xffffffffae5330b3 float:-4.80191E-11 double:NaN;
        r0 = r16;
        r0 = r0 * r6;
        r16 = r0;
        r6 = 2;
        r0 = r16;
        if (r6 != r0) goto L_0x0037;
    L_0x0116:
        r0 = r30;
        r0 = r0.context;	 Catch:{ RuntimeException -> 0x0139 }
        r23 = r0;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x0139 }
        r16 = r0;
        r6 = -1174131427; // 0xffffffffba042d1d float:-5.042123E-4 double:NaN;
        r16 = r6 * r16;
        switch(r16) {
            case 1: goto L_0x0007;
            default: goto L_0x0128;
        };
    L_0x0128:
        goto L_0x0129;
    L_0x0129:
        goto L_0x0037;
    L_0x012c:
        r23 = p000.TimeUnit.context;
        r6 = 1384248081; // 0x5281f311 float:2.79064379E11 double:6.83909422E-315;
        r0 = r30;
        r1 = r23;
        r0.get(r1, r6);	 Catch:{ RuntimeException -> 0x0139 }
        goto L_0x00e2;
    L_0x0139:
        r25 = move-exception;
        r26 = new java.lang.StringBuilder;
        r0 = r26;
        r0.<init>();
        r27 = "gq.aq(";
        r0 = r26;
        r1 = r27;
        r26 = r0.append(r1);
        r6 = 41;
        r0 = r26;
        r26 = r0.append(r6);
        r0 = r26;
        r28 = r0.toString();
        r0 = r25;
        r1 = r28;
        r29 = p000.StringBuilder.append(r0, r1);
        throw r29;
    L_0x0162:
        r23 = p000.TimeUnit.this$0;
    L_0x0164:
        r6 = 1389873551; // 0x52d7c98f float:4.6339978E11 double:6.866887736E-315;
        r0 = r30;
        r1 = r23;
        r0.get(r1, r6);	 Catch:{ RuntimeException -> 0x0139 }
        goto L_0x00e2;
    L_0x0171:
        r0 = r30;
        r0 = r0.values;	 Catch:{ RuntimeException -> 0x0139 }
        r23 = r0;
        if (r23 == 0) goto L_0x0162;
    L_0x0179:
        r0 = r30;
        r0 = r0.values;	 Catch:{ RuntimeException -> 0x0139 }
        r23 = r0;
        goto L_0x0164;
    L_0x0180:
        r31 = r33 - r24;
        r6 = -1931488387; // 0xffffffff8cdfd37d float:-3.4485875E-31 double:NaN;
        r31 = r6 * r31;
        p000.client.active = r31;
        goto L_0x00e2;
    L_0x018c:
        r23 = p000.TimeUnit.$assertionsDisabled;
        r6 = 1562438797; // 0x5d20ec8d float:7.2473739E17 double:7.719473333E-315;
        r0 = r30;
        r1 = r23;
        r0.get(r1, r6);	 Catch:{ RuntimeException -> 0x0139 }
        goto L_0x00e2;
        */
        throw new UnsupportedOperationException("Method not decompiled: Image.init(int, int, int, long):boolean");
    }

    public boolean init(int i, int i2, long j) {
        try {
            this.parent = -308435853 * i;
            this.view = 32292623 * i2;
            recycle(i, i2, j);
            switch (this.context.name * -1174131427) {
                case 5:
                    this.this$0[0] = i;
                    this.data[0] = i2;
                    update(i, i2, 1866747525);
                    break;
                case 9:
                case 12:
                    if (TimeUnit.data == this.context) {
                        get(TimeUnit.context, 2095810681);
                    }
                    this.this$0[0] = i;
                    this.data[0] = i2;
                    break;
                default:
                    break;
            }
            return true;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gq.am(" + ')');
        }
    }

    public boolean init(int i, long j) {
        if (this.length * 205531465 < this.key.length) {
            this.key[this.length * 205531465] = i;
            this.type[this.length * 205531465] = '\u0000';
            this.length -= 1796138759;
        }
        this.text[i] = true;
        if (-2036797811 * client.out >= 2 && i == 66 && this.text[82]) {
            PdfGraphics2D.write(612730085);
        }
        return true;
    }

    void layout() {
        this.height = 1111166909;
        this.width = -309954765;
    }

    double log(int $i0, int $i1) {
        return Math.atan2((double) (this.this$0[$i0] - this.this$0[$i1]), (double) (this.data[$i0] - this.data[$i1]));
    }

    double log(int $i0, int $i1, byte b) {
        try {
            return Math.atan2((double) (this.this$0[$i0] - this.this$0[$i1]), (double) (this.data[$i0] - this.data[$i1]));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gq.al(" + ')');
        }
    }

    public boolean onClick(int $i0, int i, int i2, int i3, long j) {
        if ($i0 >= 4) {
            return true;
        }
        if ($i0 > this.id * -1165392305) {
            return true;
        }
        if ($i0 == 0) {
            this.path = LinkedList.toString(1458371315) * 184667085080661311L;
        }
        if (this.id * -1165392305 == $i0) {
            this.id += 152293551;
            this.TAG[$i0] = i2;
            this.buffer[$i0] = i3;
        }
        this.lock -= 328008069;
        this.this$0[$i0] = i2;
        this.data[$i0] = i3;
        if (-1165392305 * this.id == 1) {
            this.state = true;
            switch (this.context.name * -1174131427) {
                case 5:
                    if (i != 4 || !ByteBufferList.f25a) {
                        update(i2, i3, 526480154);
                        if (i == 2) {
                            get(TimeUnit.data, 1827963367);
                        } else {
                            get(TimeUnit.file, 2089880980);
                        }
                        init(i2, i3, j, i == 2, 2105788721);
                        break;
                    }
                    get(TimeUnit.type, 1667161437);
                    break;
                    break;
                case 9:
                    if (this.settings) {
                        get(TimeUnit.count, 1523085305);
                        break;
                    }
                    break;
                default:
                    break;
            }
        } else if (2 == this.id * -1165392305) {
            get(TimeUnit.owner, 1625633472);
            this.adapter = reset(0, 1, -90389375);
            log(0, 1, (byte) 60);
            double $d0 = (double) client.TAG;
            Math.log($d0);
        } else if (-1165392305 * this.id > 2) {
            get(TimeUnit.$assertionsDisabled, 1937945369);
        }
        return true;
    }

    public boolean onClick(int i, long j) {
        this.text[i] = false;
        return true;
    }

    public boolean onCreate(int $i0, int i, int i2, int i3, long j) {
        byte $b5 = (byte) 0;
        if ($i0 >= 4) {
            return true;
        }
        if (this.lock * -269232425 != 0) {
            this.lock -= -328008069;
            if ($i0 == 0) {
            }
            if (-1370279757 * this.lock == 0) {
                switch (-1174131427 * this.context.name) {
                    case 0:
                    case 1:
                        get(TimeUnit.$assertionsDisabled, 1669003034);
                        break;
                    case 2:
                    case 5:
                    case 6:
                    case 11:
                        break;
                    case 3:
                        get(TimeUnit.count, 1707881267);
                        break;
                    case 4:
                        get(TimeUnit.count, 2132354810);
                        break;
                    case 7:
                        init(-956921927);
                        break;
                    case 8:
                        get(TimeUnit.$assertionsDisabled, 2019647556);
                        break;
                    case 9:
                        get(TimeUnit.count, 1459881253);
                        break;
                    case 10:
                        get(TimeUnit.text, 1467233884);
                        break;
                    case 12:
                        get(TimeUnit.context, 1766407193);
                        this.this$0[0] = 1768661179 * this.parent;
                        this.data[0] = -1880907316 * this.view;
                        break;
                    default:
                        break;
                }
            }
            if (this.lock * -1860808713 == 1 && this.context == TimeUnit.owner) {
                if ($i0 == 0) {
                    $b5 = (byte) 1;
                }
                this.f136y = $b5 * 2130578643;
                get(TimeUnit.type, 1870427501);
                return true;
            }
        }
        return true;
    }

    public boolean onCreate(int i, int i2, long j) {
        this.parent = -308435853 * i;
        this.view = 32292623 * i2;
        recycle(i, i2, j);
        switch (this.context.name * -1174131427) {
            case 5:
                this.this$0[0] = i;
                this.data[0] = i2;
                update(i, i2, 1556886996);
                break;
            case 9:
            case 12:
                if (TimeUnit.data == this.context) {
                    get(TimeUnit.context, 1619796463);
                }
                this.this$0[0] = i;
                this.data[0] = i2;
                break;
            default:
                break;
        }
        return true;
    }

    public boolean onCreate(int i, long j) {
        return true;
    }

    public void onOptionsItemSelected() {
        if (TimeUnit.file == this.context) {
            delete(1872362707);
            if (this.settings || this.lock * -1370279757 == 0) {
                get(TimeUnit.count, 1896002806);
                return;
            }
            if (this.index && this.lock * -1370279757 == 1 && LinkedList.toString(2097470514) >= 600 + (this.path * 6528501353364054719L)) {
                get(TimeUnit.data, 2063857212);
            }
        }
    }

    public boolean onOptionsItemSelected(char c, long j) {
        if (this.length * 205531465 < this.key.length) {
            this.key[this.length * 205531465] = -1;
            this.type[-1710596922 * this.length] = c;
            this.length -= 1796138759;
        }
        return true;
    }

    public boolean onOptionsItemSelected(int i, int i2, int i3, int i4, long j) {
        if (i >= 4) {
            return true;
        }
        if (i > this.id * -1165392305) {
            return true;
        }
        if (i == 0) {
            this.path = LinkedList.toString(1453823978) * 184667085080661311L;
        }
        if (this.id * -1165392305 == i) {
            this.id += 152293551;
            this.TAG[i] = i3;
            this.buffer[i] = i4;
        }
        this.lock -= 328008069;
        this.this$0[i] = i3;
        this.data[i] = i4;
        if (-1165392305 * this.id == 1) {
            this.state = true;
            switch (this.context.name * -1174131427) {
                case 5:
                    if (i2 != 4 || !ByteBufferList.f25a) {
                        update(i3, i4, 510837813);
                        if (i2 == 2) {
                            get(TimeUnit.data, 1641990712);
                        } else {
                            get(TimeUnit.file, 1524809422);
                        }
                        init(i3, i4, j, i2 == 2, 2021175691);
                        break;
                    }
                    get(TimeUnit.type, 1666482405);
                    break;
                    break;
                case 9:
                    if (this.settings) {
                        get(TimeUnit.count, 2098915974);
                        break;
                    }
                    break;
                default:
                    break;
            }
        } else if (2 == this.id * -1165392305) {
            get(TimeUnit.owner, 1445232594);
            this.adapter = reset(0, 1, 1639725625);
            log(0, 1, (byte) 108);
            double $d0 = (double) client.TAG;
            Math.log($d0);
        } else if (-1165392305 * this.id > 2) {
            get(TimeUnit.$assertionsDisabled, 1899837962);
        }
        return true;
    }

    public boolean onOptionsItemSelected(int i, long j) {
        this.text[i] = false;
        return true;
    }

    void onResume() {
        this.length = 0;
        this.state = false;
        update(-358519115);
        switch (-1174131427 * this.context.name) {
            case 6:
                get(TimeUnit.$assertionsDisabled, 1776361257);
                return;
            default:
                return;
        }
    }

    public boolean onResume(char c, long j) {
        if (185498993 * this.length < this.key.length) {
            this.key[this.length * 1216847014] = -1;
            this.type[-539747055 * this.length] = c;
            this.length -= 311040769;
        }
        return true;
    }

    public boolean onResume(int i, int i2, int i3, int i4, long j) {
        boolean $z0 = false;
        if (i >= 4) {
            return true;
        }
        if (i > this.id * 1891431241) {
            return true;
        }
        if (i == 0) {
            long $l6 = LinkedList.toString(95173644) * 184667085080661311L;
            long j2 = $l6;
            this.path = $l6;
        }
        int $i7 = this.id * -1165392305;
        int i5 = $i7;
        if ($i7 == i) {
            $i7 = this.id + 152293551;
            i5 = $i7;
            this.id = $i7;
            this.TAG[i] = i3;
            this.buffer[i] = i4;
        }
        $i7 = this.lock + 127948991;
        i5 = $i7;
        this.lock = $i7;
        this.this$0[i] = i3;
        this.data[i] = i4;
        if (1590317364 * this.id == 1) {
            this.state = true;
            switch (this.context.name * -280214182) {
                case 5:
                    if (i2 == 4 && ByteBufferList.f25a) {
                        get(TimeUnit.type, 1453912939);
                        return true;
                    }
                    update(i3, i4, -652146913);
                    if (i2 == 2) {
                        get(TimeUnit.data, 1716266509);
                    } else {
                        get(TimeUnit.file, 1426827673);
                    }
                    if (i2 == 2) {
                        $z0 = true;
                    }
                    init(i3, i4, j, $z0, 2123947700);
                    return true;
                case 9:
                    if (this.settings) {
                        get(TimeUnit.count, 1509211569);
                        return true;
                    }
                    break;
                default:
                    return true;
            }
        } else if (2 == this.id * -1910425086) {
            get(TimeUnit.owner, 1399820539);
            this.adapter = reset(0, 1, 780422185);
            log(0, 1, (byte) 79);
            Math.log((double) client.TAG);
            return true;
        } else if (1375476520 * this.id > 2) {
            get(TimeUnit.$assertionsDisabled, 1664004321);
        }
        return true;
    }

    public boolean onResume(int i, int i2, int i3, long j) {
        if (i >= 4) {
            return true;
        }
        long $l4 = LinkedList.toString(837569506);
        int $i5 = this.data[i];
        this.this$0[i] = i2;
        this.data[i] = i3;
        if (2 == this.lock * -1142122450) {
            switch (1054709439 * this.context.name) {
                case 1:
                    int $i8 = (reset(0, 1, 587587635) - this.adapter) / 5.0d;
                    long j2 = $i8;
                    int $i82 = (int) $i8;
                    double $d0 = this.adapter + ((double) ($i82 * 5));
                    double d = $d0;
                    this.adapter = $d0;
                    client.listener = ((-$i82) * 344887945) + client.listener;
                    break;
                default:
                    break;
            }
        }
        if (i == 0) {
            recycle(i2, i3, j);
            if (14818714 * this.id == 1 && $l4 >= (6528501353364054719L * this.path) + 100) {
                int $i6 = this.TAG[0];
                i = this.buffer[0];
                if (i2 < $i6 - (-2001588319 * this.title) || i2 > $i6 + (1740097055 * this.title) || i3 < i - (1740097055 * this.title) || i3 > (this.title * 1740097055) + i) {
                    switch (this.context.name * -1174131427) {
                        case 3:
                            get(TimeUnit.$assertionsDisabled, 1425082552);
                            break;
                        case 4:
                            get(this.values != null ? this.values : TimeUnit.this$0, 1838478765);
                            break;
                        case 8:
                            client.active = 1676739485 * (i3 - $i5);
                            break;
                        case 12:
                            get(TimeUnit.context, 1547549187);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return true;
    }

    public boolean onResume(int i, long j) {
        this.text[i] = false;
        return true;
    }

    public void open(int i) {
        try {
            if (TimeUnit.file == this.context) {
                delete(1816861045);
                if (!this.settings) {
                    if (this.lock * -1370279757 != 0) {
                        if (this.index) {
                            if (this.lock * -1370279757 == 1) {
                                if (LinkedList.toString(1104689226) >= 600 + (this.path * 6528501353364054719L)) {
                                    get(TimeUnit.data, 1990463949);
                                }
                            }
                        }
                        return;
                    }
                }
                get(TimeUnit.count, 1943582034);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gq.ax(" + ')');
        }
    }

    void process() {
        this.length = 0;
        this.state = false;
        update(-358519115);
        switch (-1174131427 * this.context.name) {
            case 6:
                get(TimeUnit.$assertionsDisabled, 1816028262);
                return;
            default:
                return;
        }
    }

    void process(int i) {
        try {
            this.length = 0;
            this.state = false;
            update(-358519115);
            switch (-1174131427 * this.context.name) {
                case 6:
                    get(TimeUnit.$assertionsDisabled, 1696976028);
                    return;
                default:
                    return;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gq.az(" + ')');
        }
        throw StringBuilder.append($r2, "gq.az(" + ')');
    }

    public boolean process(int i, long j) {
        if (this.length * 205531465 < this.key.length) {
            this.key[this.length * 205531465] = i;
            this.type[this.length * 205531465] = '\u0000';
            this.length -= 1796138759;
        }
        this.text[i] = true;
        if (-2036797811 * client.out >= 2 && i == 66 && this.text[82]) {
            PdfGraphics2D.write(483528407);
        }
        return true;
    }

    void processParameters(int $i0) {
        this.scaledHeight = 1199541781 * $i0;
        transform(1054789969);
    }

    void read() {
        for (int $i0 = 0; $i0 < 4; $i0++) {
            int[] $r1 = this.TAG;
            this.buffer[$i0] = -1;
            $r1[$i0] = -1;
            $r1 = this.this$0;
            this.data[$i0] = -1;
            $r1[$i0] = -1;
        }
    }

    double recycle(int $i0, int $i1) {
        return Math.atan2((double) (this.this$0[$i0] - this.this$0[$i1]), (double) (this.data[$i0] - this.data[$i1]));
    }

    void recycle() {
        this.length = 0;
        this.state = false;
        update(-358519115);
        switch (-1174131427 * this.context.name) {
            case 6:
                get(TimeUnit.$assertionsDisabled, 1832377040);
                return;
            default:
                return;
        }
    }

    void recycle(int i, int i2, long j) {
        try {
            int $i3 = this.size;
            this = this;
            $i3 *= 1857239005;
            if ($i3 > 0) {
                if (j / 50 == this.f135x[$i3 - 1] / 50) {
                    $i3--;
                    this.f133p[$i3] = i;
                    this.f134r[$i3] = i2;
                    this.f135x[$i3] = j;
                }
            }
            if ($i3 >= 500) {
                return;
            }
            this.f133p[$i3] = i;
            this.f134r[$i3] = i2;
            this.f135x[$i3] = j;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gq.aa(" + ')');
        }
    }

    public boolean render(int i, long j) {
        this.text[i] = false;
        return true;
    }

    double reset(int $i0, int $i1, int i) {
        try {
            return Math.hypot((double) (this.this$0[$i0] - this.this$0[$i1]), (double) (this.data[$i0] - this.data[$i1]));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gq.ap(" + ')');
        }
    }

    void reset() {
        this.length = 0;
        this.state = false;
        update(-358519115);
        switch (-1174131427 * this.context.name) {
            case 6:
                get(TimeUnit.$assertionsDisabled, 1802647617);
                return;
            default:
                return;
        }
    }

    void reset(int $i0, int i) {
        this.name = -823062321 * $i0;
        this.value = 1512441983 * i;
    }

    void reset(int $i0, int i, long $l2, boolean z) {
        this.width = 309954765 * $i0;
        this.height = -1111166909 * i;
        this.count = 8296885441471954829L * $l2;
        this.level = z;
    }

    public void reset(TimeUnit timeUnit) {
        this.context = timeUnit;
        switch (this.context.name * -1174131427) {
            case 0:
                client.locale = 2000264999 * this.this$0[this.f136y * 336472923];
                client.resource = 2001850531 * this.data[this.f136y * 336472923];
                return;
            case 7:
                if (-1 != this.parent * 1768661179) {
                    update(this.parent * 1768661179, -1306767953 * this.view, 681646674);
                    this.this$0[0] = this.parent * 1768661179;
                    this.data[0] = this.view * -893628433;
                } else {
                    delete(2018344706);
                }
                init(-1099115542);
                return;
            case 12:
                if (this.lock * 1596809782 == 0) {
                    this.context = TimeUnit.context;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean reset(int i, long j) {
        if (1130400241 * this.length < this.key.length) {
            this.key[this.length * 1585189062] = i;
            this.type[this.length * 202797803] = '\u0000';
            this.length -= 1796138759;
        }
        this.text[i] = true;
        if (1004196118 * client.out >= 2 && i == 66 && this.text[2110799028]) {
            PdfGraphics2D.write(-51616051);
        }
        return true;
    }

    public void resize() {
        this.values = null;
    }

    void resize(TimeUnit timeUnit) {
        if (this.values == null) {
            this.values = timeUnit;
        }
    }

    public boolean send(int i, long j) {
        return true;
    }

    void set(int $i0, int i, long $l2, boolean z) {
        this.width = 309954765 * $i0;
        this.height = -1111166909 * i;
        this.count = 8296885441471954829L * $l2;
        this.level = z;
    }

    void setFrom() {
        this.height = 1111166909;
        this.width = -309954765;
    }

    void setPath() {
        this.value = -1512441983;
        this.name = -690656681;
    }

    void setPos() {
        this.title = ((this.scaledHeight * -1939837195) / 200) * -1940245025;
    }

    void setRotation(int $i0) {
        this.scaledHeight = 1199541781 * $i0;
        transform(307152647);
    }

    public void setUrl() {
        this.values = null;
    }

    void start() {
        if (this.lock * -1370279757 == 0) {
            this.context = TimeUnit.activity;
            this.values = null;
            this.id = 0;
            decode(1359963550);
            if (-1 != this.parent * 1768661179) {
                this.this$0[0] = this.parent * 1768661179;
                this.data[0] = -893628433 * this.view;
            }
            this.f136y = 0;
        }
    }

    public boolean toString(char c, long j) {
        if (this.length * 205531465 < this.key.length) {
            this.key[this.length * 887428367] = -1;
            this.type[this.length * 205531465] = c;
            this.length -= 1796138759;
        }
        return true;
    }

    public boolean toString(int i) {
        return this.text[i];
    }

    public boolean toString(int i, long j) {
        try {
            this.text[i] = false;
            return true;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gq.as(" + ')');
        }
    }

    void transform() {
        this.name = -823062321 * this.this$0[0];
        this.value = 1512441983 * this.data[0];
    }

    void transform(int i) {
        try {
            this.title = ((this.scaledHeight * -1939837195) / 200) * -1940245025;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gq.ai(" + ')');
        }
    }

    void transform(int $i0, int i) {
        try {
            this.scaledHeight = 1199541781 * $i0;
            transform(1852632959);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gq.af(" + ')');
        }
    }

    void update() {
        this.name = -823062321 * this.this$0[0];
        this.value = 1512441983 * this.data[0];
    }

    void update(int i) {
        try {
            this.height = 1111166909;
            this.width = -309954765;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gq.ad(" + ')');
        }
    }

    void update(int $i0, int i, int i2) {
        try {
            this.name = -823062321 * $i0;
            this.value = 1512441983 * i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gq.ab(" + ')');
        }
    }

    public boolean update(char c, long j) {
        if (this.length * 205531465 < this.key.length) {
            this.key[this.length * 205531465] = -1;
            this.type[this.length * 205531465] = c;
            this.length -= 1796138759;
        }
        return true;
    }

    public boolean update(int i, long j) {
        if (this.length * 205531465 < this.key.length) {
            this.key[this.length * -85077343] = i;
            this.type[this.length * 205531465] = '\u0000';
            this.length -= 1796138759;
        }
        this.text[i] = true;
        if (1917353034 * client.out >= 2 && i == 1233470841 && this.text[1933690019]) {
            PdfGraphics2D.write(-1227011729);
        }
        return true;
    }

    void visit() {
        this.value = 53976573;
        this.name = 823062321;
    }
}
