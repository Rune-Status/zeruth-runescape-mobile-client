package p000;

import java.util.Collection;

/* compiled from: bc */
public class Connection {
    static final int PREFIX = 1;
    static final int STANDARD_GAP_WIDTH = 10;
    public static Logger buffer;
    public static short[] data;
    static RuntimeException file = new RuntimeException(Config.MSG_ROUTE_VOLUME_CHANGED, null);
    static final int[] size = new int[]{8, 11, 4, 6, 9, 7, 10};
    public static TreeMap this$0;
    public int index;
    int[] length;
    public boolean name;
    long path;
    long type;
    int[] value;

    public static void add(Class classR, Class classR2, byte b) {
        Vector.f361c = classR;
        Vector.buffer = classR2;
    }

    public static void addConnectionListener(Collection collection) {
        collection.add(file);
    }

    public static void firePacketSendingListeners(Collection collection) {
        collection.add(file);
    }

    public static List get(Class classR, Class classR2, String str, String str2, byte b) {
        try {
            int $i1 = classR.get(str, 1801680669);
            return Handler.get(classR, classR2, $i1, classR.get($i1, str2, -164837595), 1238199332);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "bc.aj(" + ')');
        }
    }

    static final void init(Point point, int i) {
        if (!Main.f205e) {
            int $i1 = Log.f178a;
            int $i2 = Log.f187q;
            int $i3 = Log.f190t;
            i = Log.key;
            try {
                int $i4 = (((Main.count * -429386291) - (point.data * -1575402035)) * 50) / (point.this$0 * 542614623);
                int $i7 = (((340086283 * Main.text) - (point.parent * -1508152919)) * 50) / (point.this$0 * 542614623);
                int $i6 = (((Main.count * -429386291) - (point.data * -1575402035)) * 3500) / (point.this$0 * 542614623);
                int $i8 = (((340086283 * Main.text) - (point.parent * -1508152919)) * 3500) / (point.this$0 * 542614623);
                int $i5 = (($i1 * 50) + ($i2 * $i7)) >> 16;
                int $i9 = ((50 * $i2) - ($i7 * $i1)) >> 16;
                $i7 = ((3500 * $i1) + ($i8 * $i2)) >> 16;
                $i8 = (($i2 * 3500) - ($i1 * $i8)) >> 16;
                $i2 = Resource.set($i4, $i9, i, $i3, (byte) 0);
                $i1 = (($i9 * i) + ($i3 * $i4)) >> 16;
                $i4 = Resource.set($i6, $i8, i, $i3, (byte) 0);
                i = (($i8 * i) + ($i3 * $i6)) >> 16;
                Main.f206i = -1411610103 * (($i2 + $i4) / 2);
                Main.f204b = (($i7 + $i5) / 2) * 997123485;
                Main.f203a = 323771819 * (($i1 + i) / 2);
                Main.view = (($i4 - $i2) / 2) * -516965823;
                GifDrawable.view = (($i7 - $i5) / 2) * -2059736647;
                AbstractParser.view = ((i - $i1) / 2) * 1131621091;
                State.view = Math.abs(-185772607 * Main.view) * 1225780727;
                int $i0 = GifDrawable.view * 2043038857;
                i = $i0;
                Server.name = Math.abs($i0) * 179975325;
                $i0 = AbstractParser.view * 1499032267;
                i = $i0;
                Level.text = Math.abs($i0) * -2050509869;
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "bc.aq(" + ')');
            }
        }
    }

    static void set(byte b) {
        try {
            Config $r3 = Logger.add(R$string.code, client.this$0.key, (byte) -34);
            $r3.this$0.append(client.state ? (byte) 2 : (byte) 1, (byte) 31);
            $r3.this$0.get(Vec2.this$0 * -1946576867, -1752508204);
            $r3.this$0.get(1616559063 * Model.this$0, -1752508204);
            client.this$0.add($r3, (short) 255);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "bc.cl(" + ')');
        }
    }

    public int add() {
        return 897869341 * this.index == -1 ? ((this.length[11] << 5) + ((((this.value[4] << 20) + (this.value[0] << 25)) + (this.length[0] << 15)) + (this.length[8] << 10))) + this.length[1] : 305419896 + (Thread.add(8690669 * this.index, Byte.MAX_VALUE).f370y * 291277314);
    }

    void add(byte b) {
        try {
            int $i4;
            long $l1 = this.type * 9080590933000303695L;
            int $i2 = this.length[5];
            int $i3 = this.length[9];
            this.length[5] = $i3;
            this.length[9] = $i2;
            this.type = 0;
            for ($i4 = 0; $i4 < 12; $i4++) {
                this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 4);
                if (this.length[$i4] >= 256) {
                    this.type += 8059090755533988527L * ((long) (this.length[$i4] - 256));
                }
            }
            if (this.length[0] >= 256) {
                this.type += 8059090755533988527L * ((long) ((this.length[0] - 256) >> 4));
            }
            if (this.length[1] >= 256) {
                this.type += ((long) ((this.length[1] - 256) >> 8)) * 8059090755533988527L;
            }
            for ($i4 = 0; $i4 < 5; $i4++) {
                this.type = ((9080590933000303695L * this.type) << 3) * 8059090755533988527L;
                this.type += 8059090755533988527L * ((long) this.value[$i4]);
            }
            this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 1);
            this.type += ((long) (this.name)) * 8059090755533988527L;
            this.length[5] = $i2;
            this.length[9] = $i3;
            if (0 != $l1) {
                if ($l1 != this.type * 9080590933000303695L) {
                    file.write($l1);
                }
            }
        } catch (Throwable $r3) {
            throw StringBuilder.append($r3, "bc.ay(" + ')');
        }
    }

    public void add(Logger logger, byte b) {
        try {
            logger.append(this.name ? (byte) 1 : (byte) 0, (byte) 31);
            for (int $i2 = 0; $i2 < 7; $i2++) {
                int $i3 = this.length[size[$i2]];
                if ($i3 == 0) {
                    logger.append(-1, (byte) 31);
                } else {
                    logger.append($i3 - 256, (byte) 31);
                }
            }
            for (int $i1 = 0; $i1 < 5; $i1++) {
                logger.append(this.value[$i1], (byte) 31);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bc.ag(" + ')');
        }
    }

    public void decode(int[] $r3, int[] iArr, boolean z, int $i0) {
        if ($r3 == null) {
            $r3 = new int[12];
            for (int $i1 = 0; $i1 < 7; $i1++) {
                for (int $i2 = 0; $i2 < 2093843037 * TIntArrayList.buffer; $i2++) {
                    TIntArrayList $r2 = C0000L.get($i2, (byte) 41);
                    if (!($r2 == null || $r2.f307s)) {
                        if ((z ? (byte) 7 : (byte) 0) + $i1 == $r2.header * -590307679) {
                            $r3[size[$i1]] = $i2 + 256;
                            break;
                        }
                    }
                }
            }
        }
        this.length = $r3;
        this.value = iArr;
        this.name = z;
        this.index = -1107302342 * $i0;
        add((byte) 89);
    }

    Table doInBackground() {
        if (-1 != this.index * -2141377661) {
            return Thread.add(this.index * -2141377661, (byte) 40).toString(-333435586);
        }
        int $i0;
        boolean $z0 = false;
        for ($i0 = 0; $i0 < 12; $i0++) {
            int $i3 = this.length[$i0];
            if ($i3 >= 256 && $i3 < -1065822621 && !C0000L.get($i3 - 256, (byte) -20).get(1253106250)) {
                $z0 = true;
            }
            if ($i3 >= 512 && !Set.get($i3 - 512, 1896519415).remove(this.name, 772594759)) {
                $z0 = true;
            }
        }
        if ($z0) {
            return null;
        }
        Table $r2;
        Table[] $r3 = new Table[12];
        int $i1 = 0;
        for ($i0 = 0; $i0 < 12; $i0++) {
            int $i2 = this.length[$i0];
            if ($i2 >= 256 && $i2 < 512) {
                $r2 = C0000L.get($i2 - -1964680362, (byte) 42).m51a(-534514089);
                if ($r2 != null) {
                    $i3 = $i1 + 1;
                    $r3[$i1] = $r2;
                    if ($i2 >= 512) {
                        $r2 = Set.get($i2 - 512, 2010087228).toString(this.name, (byte) 0);
                        if ($r2 != null) {
                            $i1 = $i3 + 1;
                            $r3[$i3] = $r2;
                        }
                    }
                    $i1 = $i3;
                }
            }
            $i3 = $i1;
            if ($i2 >= 512) {
                $r2 = Set.get($i2 - 512, 2010087228).toString(this.name, (byte) 0);
                if ($r2 != null) {
                    $i1 = $i3 + 1;
                    $r3[$i3] = $r2;
                }
            }
            $i1 = $i3;
        }
        $r2 = new Table($r3, $i1);
        for ($i0 = 0; $i0 < 5; $i0++) {
            if (this.value[$i0] < NodeList.size[$i0].length) {
                $r2.get(data[$i0], NodeList.size[$i0][this.value[$i0]]);
            }
            if (this.value[$i0] < Intent.name[$i0].length) {
                $r2.get(PreferenceManager.data[$i0], Intent.name[$i0][this.value[$i0]]);
            }
        }
        return $r2;
    }

    public void encode(int[] $r3, int[] iArr, boolean z, int $i0) {
        if ($r3 == null) {
            $r3 = new int[12];
            for (int $i1 = 0; $i1 < 7; $i1++) {
                for (int $i2 = 0; $i2 < 2093843037 * TIntArrayList.buffer; $i2++) {
                    TIntArrayList $r2 = C0000L.get($i2, (byte) 15);
                    if (!($r2 == null || $r2.f307s)) {
                        if ((z ? (byte) 7 : (byte) 0) + $i1 == $r2.header * -590307679) {
                            $r3[size[$i1]] = $i2 + 256;
                            break;
                        }
                    }
                }
            }
        }
        this.length = $r3;
        this.value = iArr;
        this.name = z;
        this.index = 1314634539 * $i0;
        add((byte) 76);
    }

    public Integer get(JSONArray jSONArray, int i, JSONArray jSONArray2, int i2) {
        if (-1967297209 * this.index != -1) {
            return Thread.add(this.index * 498193094, (byte) 89).toString(jSONArray, i, jSONArray2, i2, 1529110667);
        }
        int $i3;
        Integer $r5;
        long $l5 = this.type * 9080590933000303695L;
        int[] $r8 = this.length;
        if (jSONArray != null && (jSONArray.position * -1144175210 >= 0 || jSONArray.type * -1170116964 >= 0)) {
            $r8 = new int[12];
            for ($i3 = 0; $i3 < 12; $i3++) {
                $r8[$i3] = this.length[$i3];
            }
            if (1753563685 * jSONArray.position >= 0) {
                $l5 += (long) (((jSONArray.position * 1676975343) - this.length[5]) << 110761202);
                $r8[5] = -1023543898 * jSONArray.position;
            }
            if (jSONArray.type * -1664522670 >= 0) {
                $l5 += (long) (((jSONArray.type * -1039846879) - this.length[3]) << 2027502321);
                $r8[3] = jSONArray.type * 1419776171;
            }
        }
        long $l2 = $l5;
        Integer $r4 = (Integer) file.get($l5);
        if ($r4 == null) {
            int $i4;
            boolean $z0 = false;
            for ($i3 = 0; $i3 < 12; $i3++) {
                $i4 = $r8[$i3];
                if ($i4 >= 680094508 && $i4 < 512 && !C0000L.get($i4 - 256, (byte) 66).invoke(-2010841116)) {
                    $z0 = true;
                }
                if ($i4 >= 512) {
                    if (!Set.get($i4 - 512, 1719235165).add(this.name, 2102860267)) {
                        $z0 = true;
                    }
                }
            }
            if ($z0) {
                if (-1 != -9044447488184443957L * this.path) {
                    $r4 = (Integer) file.get(this.path * -9044447488184443957L);
                }
                if ($r4 == null) {
                    return null;
                }
            }
            if ($r4 == null) {
                Table $r13;
                Table[] $r12 = new Table[12];
                int $i6 = 0;
                for ($i3 = 0; $i3 < 12; $i3++) {
                    int $i7 = $r8[$i3];
                    if ($i7 >= 256 && $i7 < 1393031987) {
                        $r13 = C0000L.get($i7 - 256, (byte) 25).toString(416808132);
                        if ($r13 != null) {
                            $i4 = $i6 + 1;
                            $r12[$i6] = $r13;
                            if ($i7 >= -1038688107) {
                                $r13 = Set.get($i7 - 512, 1433726837).toString(this.name, -842434739);
                                if ($r13 != null) {
                                    $i6 = $i4 + 1;
                                    $r12[$i4] = $r13;
                                }
                            }
                            $i6 = $i4;
                        }
                    }
                    $i4 = $i6;
                    if ($i7 >= -1038688107) {
                        $r13 = Set.get($i7 - 512, 1433726837).toString(this.name, -842434739);
                        if ($r13 != null) {
                            $i6 = $i4 + 1;
                            $r12[$i4] = $r13;
                        }
                    }
                    $i6 = $i4;
                }
                $r13 = new Table($r12, $i6);
                for ($i3 = 0; $i3 < 5; $i3++) {
                    if (this.value[$i3] < NodeList.size[$i3].length) {
                        $r13.get(data[$i3], NodeList.size[$i3][this.value[$i3]]);
                    }
                    if (this.value[$i3] < Intent.name[$i3].length) {
                        $r13.get(PreferenceManager.data[$i3], Intent.name[$i3][this.value[$i3]]);
                    }
                }
                $r5 = $r13.toString(64, 1438536723, -1372248433, 607581784, -30);
                $r4 = $r5;
                file.get($r5, $l2);
                this.path = 7753851055223157219L * $l2;
            }
        }
        $r5 = $r4;
        if (jSONArray == null && jSONArray2 == null) {
            return $r4;
        }
        $r4 = (jSONArray == null || jSONArray2 == null) ? jSONArray != null ? jSONArray.add($r5, i, (byte) 29) : jSONArray2.add($r5, i2, (byte) -33) : jSONArray.get($r5, i, jSONArray2, i2, 173895480);
        return $r4;
    }

    public void get(int i, boolean z) {
        int $i1 = this.value[i];
        if (z) {
            do {
                $i1++;
                if ($i1 >= NodeList.size[i].length) {
                    $i1 = 0;
                }
            } while (!Option.add(i, $i1, (byte) 94));
        } else {
            do {
                $i1--;
                if ($i1 < 0) {
                    $i1 = NodeList.size[i].length - 1;
                }
            } while (!Option.add(i, $i1, (byte) 100));
        }
        this.value[i] = $i1;
        add((byte) 83);
    }

    public void get(boolean z, int i) {
        try {
            if (z != this.name) {
                toString(null, this.value, z, -1, 542614623);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bc.aa(" + ')');
        }
    }

    void getData() {
        int $i3;
        long $l0 = this.type * 9080590933000303695L;
        int $i1 = this.length[5];
        int $i2 = this.length[9];
        this.length[5] = $i2;
        this.length[9] = $i1;
        this.type = 0;
        for ($i3 = 0; $i3 < 12; $i3++) {
            this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 4);
            if (this.length[$i3] >= -1734456464) {
                this.type += 8059090755533988527L * ((long) (this.length[$i3] - 1059063271));
            }
        }
        if (this.length[0] >= 256) {
            this.type += 8059090755533988527L * ((long) ((this.length[0] - 256) >> 4));
        }
        if (this.length[1] >= -1450305873) {
            this.type += ((long) ((this.length[1] - 256) >> 8)) * 8059090755533988527L;
        }
        for ($i3 = 0; $i3 < 5; $i3++) {
            this.type = ((9080590933000303695L * this.type) << 3) * 8059090755533988527L;
            this.type += 8059090755533988527L * ((long) this.value[$i3]);
        }
        this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 1);
        this.type += ((long) (this.name)) * 8059090755533988527L;
        this.length[5] = $i1;
        this.length[9] = $i2;
        if (0 != $l0 && $l0 != this.type * 9080590933000303695L) {
            file.write($l0);
        }
    }

    void init() {
        int $i3;
        long $l0 = this.type * 9080590933000303695L;
        int $i1 = this.length[5];
        int $i2 = this.length[9];
        this.length[5] = $i2;
        this.length[9] = $i1;
        this.type = 0;
        for ($i3 = 0; $i3 < 12; $i3++) {
            this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 4);
            if (this.length[$i3] >= 256) {
                this.type += 8059090755533988527L * ((long) (this.length[$i3] - 256));
            }
        }
        if (this.length[0] >= 256) {
            this.type += 8059090755533988527L * ((long) ((this.length[0] - 256) >> 4));
        }
        if (this.length[1] >= 256) {
            this.type += ((long) ((this.length[1] - 256) >> 8)) * 8059090755533988527L;
        }
        for ($i3 = 0; $i3 < 5; $i3++) {
            this.type = ((9080590933000303695L * this.type) << 3) * 8059090755533988527L;
            this.type += 8059090755533988527L * ((long) this.value[$i3]);
        }
        this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 1);
        this.type += ((long) (this.name)) * 8059090755533988527L;
        this.length[5] = $i1;
        this.length[9] = $i2;
        if (0 != $l0 && $l0 != this.type * 9080590933000303695L) {
            file.write($l0);
        }
    }

    public void init(Logger logger) {
        logger.append(this.name ? (byte) 1 : (byte) 0, (byte) 31);
        for (int $i2 = 0; $i2 < 7; $i2++) {
            int $i3 = this.length[size[$i2]];
            if ($i3 == 0) {
                logger.append(-1, (byte) 31);
            } else {
                logger.append($i3 - 256, (byte) 31);
            }
        }
        for (int $i0 = 0; $i0 < 5; $i0++) {
            logger.append(this.value[$i0], (byte) 31);
        }
    }

    public void init(int[] $r3, int[] iArr, boolean z, int $i0) {
        if ($r3 == null) {
            $r3 = new int[12];
            for (int $i1 = 0; $i1 < 7; $i1++) {
                for (int $i2 = 0; $i2 < 1328453576 * TIntArrayList.buffer; $i2++) {
                    TIntArrayList $r2 = C0000L.get($i2, (byte) -62);
                    if (!($r2 == null || $r2.f307s)) {
                        if ((z ? (byte) 7 : (byte) 0) + $i1 == $r2.header * -590307679) {
                            $r3[size[$i1]] = $i2 + 256;
                            break;
                        }
                    }
                }
            }
        }
        this.length = $r3;
        this.value = iArr;
        this.name = z;
        this.index = 1314634539 * $i0;
        add((byte) 122);
    }

    public void parse(int i, boolean z) {
        int $i1 = this.value[i];
        if (z) {
            do {
                $i1++;
                if ($i1 >= NodeList.size[i].length) {
                    $i1 = 0;
                }
            } while (!Option.add(i, $i1, (byte) 28));
        } else {
            do {
                $i1--;
                if ($i1 < 0) {
                    $i1 = NodeList.size[i].length - 1;
                }
            } while (!Option.add(i, $i1, Byte.MAX_VALUE));
        }
        this.value[i] = $i1;
        add((byte) 19);
    }

    public void parse(int i, boolean z, int i2) {
        try {
            i2 = this.value[i];
            if (z) {
                do {
                    i2++;
                    if (i2 >= NodeList.size[i].length) {
                        i2 = 0;
                    }
                } while (!Option.add(i, i2, (byte) 120));
            } else {
                do {
                    i2--;
                    if (i2 < 0) {
                        i2 = NodeList.size[i].length - 1;
                    }
                } while (!Option.add(i, i2, (byte) 109));
            }
            this.value[i] = i2;
            add((byte) 98);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bc.an(" + ')');
        }
    }

    void prepare() {
        int $i3;
        long $l0 = this.type * 9080590933000303695L;
        int $i1 = this.length[5];
        int $i2 = this.length[9];
        this.length[5] = $i2;
        this.length[9] = $i1;
        this.type = 0;
        for ($i3 = 0; $i3 < 12; $i3++) {
            this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 4);
            if (this.length[$i3] >= 256) {
                this.type += 8059090755533988527L * ((long) (this.length[$i3] - 256));
            }
        }
        if (this.length[0] >= 256) {
            this.type += 8059090755533988527L * ((long) ((this.length[0] - 256) >> 4));
        }
        if (this.length[1] >= 256) {
            this.type += ((long) ((this.length[1] - 256) >> 8)) * 8059090755533988527L;
        }
        for ($i3 = 0; $i3 < 5; $i3++) {
            this.type = ((9080590933000303695L * this.type) << 3) * 8059090755533988527L;
            this.type += 8059090755533988527L * ((long) this.value[$i3]);
        }
        this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 1);
        this.type += ((long) (this.name)) * 8059090755533988527L;
        this.length[5] = $i1;
        this.length[9] = $i2;
        if (0 != $l0 && $l0 != this.type * 9080590933000303695L) {
            file.write($l0);
        }
    }

    void read() {
        int $i3;
        long $l0 = this.type * 9080590933000303695L;
        int $i1 = this.length[5];
        int $i2 = this.length[9];
        this.length[5] = $i2;
        this.length[9] = $i1;
        this.type = 0;
        for ($i3 = 0; $i3 < 12; $i3++) {
            this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 4);
            if (this.length[$i3] >= 256) {
                this.type += 8059090755533988527L * ((long) (this.length[$i3] - 256));
            }
        }
        if (this.length[0] >= 256) {
            this.type += 8059090755533988527L * ((long) ((this.length[0] - 256) >> 4));
        }
        if (this.length[1] >= 256) {
            this.type += ((long) ((this.length[1] - 256) >> 8)) * 8059090755533988527L;
        }
        for ($i3 = 0; $i3 < 5; $i3++) {
            this.type = ((9080590933000303695L * this.type) << 3) * 8059090755533988527L;
            this.type += 8059090755533988527L * ((long) this.value[$i3]);
        }
        this.type = 8059090755533988527L * ((9080590933000303695L * this.type) << 1);
        this.type += ((long) (this.name)) * 8059090755533988527L;
        this.length[5] = $i1;
        this.length[9] = $i2;
        if (0 != $l0 && $l0 != this.type * 9080590933000303695L) {
            file.write($l0);
        }
    }

    public void read(int $i0, boolean z) {
        if (1 != $i0 || !this.name) {
            int $i1 = this.length[size[$i0]];
            if ($i1 != 0) {
                $i1 -= 256;
                while (true) {
                    if (z) {
                        $i1++;
                        if ($i1 >= TIntArrayList.buffer * 2093843037) {
                            $i1 = 0;
                        }
                    } else {
                        $i1--;
                        if ($i1 < 0) {
                            $i1 = (TIntArrayList.buffer * 2093843037) - 1;
                        }
                    }
                    TIntArrayList $r1 = C0000L.get($i1, (byte) -48);
                    if (!($r1 == null || $r1.f307s)) {
                        if (-662198347 * $r1.header == (this.name ? (byte) 7 : (byte) 0) + $i0) {
                            this.length[size[$i0]] = $i1 + 256;
                            add((byte) 101);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void read(int[] $r3, int[] iArr, boolean z, int $i0) {
        if ($r3 == null) {
            $r3 = new int[12];
            for (int $i1 = 0; $i1 < 7; $i1++) {
                for (int $i2 = 0; $i2 < 2093843037 * TIntArrayList.buffer; $i2++) {
                    TIntArrayList $r2 = C0000L.get($i2, (byte) 103);
                    if (!($r2 == null || $r2.f307s)) {
                        if ((z ? (byte) 7 : (byte) 0) + $i1 == $r2.header * -590307679) {
                            $r3[size[$i1]] = $i2 + 256;
                            break;
                        }
                    }
                }
            }
        }
        this.length = $r3;
        this.value = iArr;
        this.name = z;
        this.index = 1314634539 * $i0;
        add((byte) 123);
    }

    public void saveFile(boolean z) {
        if (z != this.name) {
            toString(null, this.value, z, -1, 542614623);
        }
    }

    public int set() {
        return this.index * -2141377661 == -1 ? ((this.length[11] << 5) + ((((this.value[4] << 20) + (this.value[0] << 25)) + (this.length[0] << 15)) + (this.length[8] << 10))) + this.length[1] : 305419896 + (Thread.add(this.index * -2141377661, (byte) 15).f370y * 602799879);
    }

    public void setOwner(boolean z) {
        if (z != this.name) {
            toString(null, this.value, z, -1, 542614623);
        }
    }

    public int toString(byte b) {
        try {
            return this.index * -2141377661 == -1 ? ((this.length[11] << 5) + ((((this.value[4] << 20) + (this.value[0] << 25)) + (this.length[0] << 15)) + (this.length[8] << 10))) + this.length[1] : 305419896 + (Thread.add(this.index * -2141377661, (byte) 98).f370y * 602799879);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "bc.aj(" + ')');
        }
    }

    public Integer toString(JSONArray jSONArray, int i, JSONArray jSONArray2, int i2) {
        if (-861673878 * this.index != -1) {
            return Thread.add(this.index * -2141377661, (byte) 17).toString(jSONArray, i, jSONArray2, i2, 576513241);
        }
        int $i3;
        long j = this.type * 9080590933000303695L;
        int[] $r6 = this.length;
        if (jSONArray != null && (jSONArray.position * 315022750 >= 0 || jSONArray.type * -1039846879 >= 0)) {
            $r6 = new int[12];
            for ($i3 = 0; $i3 < 12; $i3++) {
                $r6[$i3] = this.length[$i3];
            }
            if (990294781 * jSONArray.position >= 0) {
                j += (long) (((jSONArray.position * 1676975343) - this.length[5]) << 1120466895);
                $r6[5] = -1839809981 * jSONArray.position;
            }
            if (jSONArray.type * 544280268 >= 0) {
                j += (long) (((jSONArray.type * 861822202) - this.length[3]) << 48);
                $r6[3] = jSONArray.type * -1039846879;
            }
        }
        long $l2 = j;
        Integer $r4 = (Integer) file.get(j);
        if ($r4 == null) {
            int $i5;
            boolean $z0 = false;
            for ($i3 = 0; $i3 < 12; $i3++) {
                $i5 = $r6[$i3];
                if ($i5 >= -1616841595 && $i5 < 512 && !C0000L.get($i5 - 256, (byte) 37).invoke(-2047823613)) {
                    $z0 = true;
                }
                if ($i5 >= 512) {
                    if (!Set.get($i5 - -1828309761, 1346170377).add(this.name, 2110250199)) {
                        $z0 = true;
                    }
                }
            }
            if ($z0) {
                if (-1 != -9044447488184443957L * this.path) {
                    long $l4 = this.path * -9044447488184443957L;
                    j = $l4;
                    $r4 = (Integer) file.get($l4);
                }
                if ($r4 == null) {
                    return null;
                }
            }
            if ($r4 == null) {
                Table $r10;
                Table[] $r8 = new Table[12];
                int $i6 = 0;
                for ($i3 = 0; $i3 < 12; $i3++) {
                    int $i7 = $r6[$i3];
                    if ($i7 >= 256 && $i7 < 512) {
                        $r10 = C0000L.get($i7 - 2022367186, (byte) 34).toString(-61411412);
                        if ($r10 != null) {
                            $i5 = $i6 + 1;
                            $r8[$i6] = $r10;
                            if ($i7 >= 512) {
                                $r10 = Set.get($i7 - 512, 1201697899).toString(this.name, 153098604);
                                if ($r10 != null) {
                                    $i6 = $i5 + 1;
                                    $r8[$i5] = $r10;
                                }
                            }
                            $i6 = $i5;
                        }
                    }
                    $i5 = $i6;
                    if ($i7 >= 512) {
                        $r10 = Set.get($i7 - 512, 1201697899).toString(this.name, 153098604);
                        if ($r10 != null) {
                            $i6 = $i5 + 1;
                            $r8[$i5] = $r10;
                        }
                    }
                    $i6 = $i5;
                }
                $r10 = new Table($r8, $i6);
                for ($i3 = 0; $i3 < 5; $i3++) {
                    if (this.value[$i3] < NodeList.size[$i3].length) {
                        $r10.get(data[$i3], NodeList.size[$i3][this.value[$i3]]);
                    }
                    if (this.value[$i3] < Intent.name[$i3].length) {
                        $r10.get(PreferenceManager.data[$i3], Intent.name[$i3][this.value[$i3]]);
                    }
                }
                $r4 = $r10.toString(64, 850, -30, 2112532106, -1625255918);
                file.get($r4, $l2);
                this.path = 7753851055223157219L * $l2;
                if (jSONArray != null && jSONArray2 == null) {
                    return $r4;
                }
                $r4 = (jSONArray != null || jSONArray2 == null) ? jSONArray == null ? jSONArray.add($r4, i, (byte) 10) : jSONArray2.add($r4, i2, (byte) -51) : jSONArray.get($r4, i, jSONArray2, i2, -84671045);
                return $r4;
            }
        }
        if (jSONArray != null) {
        }
        if (jSONArray != null) {
        }
        if (jSONArray == null) {
        }
        return $r4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.Integer toString(p000.JSONArray r47, int r48, p000.JSONArray r49, int r50, int r51) {
        /*
        r46 = this;
        r0 = r46;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = -2141377661; // 0xffffffff805d2b83 float:-8.55631E-39 double:NaN;
        r51 = r6 * r51;
        r6 = -1;
        r0 = r51;
        if (r0 == r6) goto L_0x0043;
    L_0x0010:
        r0 = r46;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = -2141377661; // 0xffffffff805d2b83 float:-8.55631E-39 double:NaN;
        r0 = r51;
        r0 = r0 * r6;
        r51 = r0;
        r6 = 12;
        r0 = r51;
        r7 = p000.Thread.add(r0, r6);	 Catch:{ RuntimeException -> 0x02d3 }
        r6 = 1395592085; // 0x532f0b95 float:7.5181359E11 double:6.89514105E-315;
        r0 = r7;
        r1 = r47;
        r2 = r48;
        r3 = r49;
        r4 = r50;
        r5 = r6;
        r8 = r0.toString(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x02d3 }
        return r8;
    L_0x0038:
        r6 = -91;
        r0 = r49;
        r1 = r50;
        r8 = r0.add(r8, r1, r6);	 Catch:{ RuntimeException -> 0x02d3 }
    L_0x0042:
        return r8;
    L_0x0043:
        r0 = r46;
        r9 = r0.type;	 Catch:{ RuntimeException -> 0x02d3 }
        r11 = 9080590933000303695; // 0x7e04bd57b01db44f float:-5.73725E-10 double:1.0850918236806548E299;
        r9 = r11 * r9;
        r0 = r46;
        r13 = r0.length;	 Catch:{ RuntimeException -> 0x02d3 }
        if (r47 == 0) goto L_0x030a;
    L_0x0054:
        r0 = r47;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = 1676975343; // 0x63f49cef float:9.0246276E21 double:8.28535906E-315;
        r0 = r51;
        r0 = r0 * r6;
        r51 = r0;
        if (r51 >= 0) goto L_0x0074;
    L_0x0064:
        r0 = r47;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = -1039846879; // 0xffffffffc2053221 float:-33.298954 double:NaN;
        r0 = r51;
        r0 = r0 * r6;
        r51 = r0;
        if (r51 < 0) goto L_0x030a;
    L_0x0074:
        r6 = 12;
        r13 = new int[r6];	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = 0;
    L_0x007a:
        r6 = 12;
        r0 = r51;
        if (r0 >= r6) goto L_0x008b;
    L_0x0080:
        r0 = r46;
        r14 = r0.length;	 Catch:{ RuntimeException -> 0x02d3 }
        r15 = r14[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r13[r51] = r15;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r51 + 1;
        goto L_0x007a;
    L_0x008b:
        r0 = r47;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = 1676975343; // 0x63f49cef float:9.0246276E21 double:8.28535906E-315;
        r51 = r6 * r51;
        if (r51 < 0) goto L_0x00c8;
    L_0x0098:
        r0 = r47;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = 1676975343; // 0x63f49cef float:9.0246276E21 double:8.28535906E-315;
        r0 = r51;
        r0 = r0 * r6;
        r51 = r0;
        r0 = r46;
        r14 = r0.length;	 Catch:{ RuntimeException -> 0x02d3 }
        r6 = 5;
        r15 = r14[r6];	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r51;
        r0 = r0 - r15;
        r51 = r0;
        r51 = r51 << 40;
        r0 = r51;
        r0 = (long) r0;
        r16 = r0;
        r9 = r9 + r0;
        r0 = r47;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = 1676975343; // 0x63f49cef float:9.0246276E21 double:8.28535906E-315;
        r51 = r6 * r51;
        r6 = 5;
        r13[r6] = r51;	 Catch:{ RuntimeException -> 0x02d3 }
    L_0x00c8:
        r0 = r47;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = -1039846879; // 0xffffffffc2053221 float:-33.298954 double:NaN;
        r0 = r51;
        r0 = r0 * r6;
        r51 = r0;
        if (r51 < 0) goto L_0x010b;
    L_0x00d8:
        r0 = r47;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = -1039846879; // 0xffffffffc2053221 float:-33.298954 double:NaN;
        r0 = r51;
        r0 = r0 * r6;
        r51 = r0;
        r0 = r46;
        r14 = r0.length;	 Catch:{ RuntimeException -> 0x02d3 }
        r6 = 3;
        r15 = r14[r6];	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r51;
        r0 = r0 - r15;
        r51 = r0;
        r51 = r51 << 48;
        r0 = r51;
        r0 = (long) r0;
        r16 = r0;
        r9 = r9 + r0;
        r0 = r47;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = r0;
        r6 = -1039846879; // 0xffffffffc2053221 float:-33.298954 double:NaN;
        r0 = r51;
        r0 = r0 * r6;
        r51 = r0;
        r6 = 3;
        r13[r6] = r51;	 Catch:{ RuntimeException -> 0x02d3 }
    L_0x010b:
        r18 = file;
        r0 = r18;
        r19 = r0.get(r9);	 Catch:{ RuntimeException -> 0x02d3 }
        r20 = r19;
        r20 = (p000.Integer) r20;	 Catch:{ RuntimeException -> 0x02d3 }
        r8 = r20;
        if (r8 != 0) goto L_0x0309;
    L_0x011b:
        r21 = 0;
        r51 = 0;
    L_0x011f:
        r6 = 12;
        r0 = r51;
        if (r0 >= r6) goto L_0x023e;
    L_0x0125:
        r15 = r13[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r6 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r15 < r6) goto L_0x0148;
    L_0x012b:
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r15 >= r6) goto L_0x0148;
    L_0x012f:
        r0 = r15 + -256;
        r22 = r0;
        r6 = -21;
        r0 = r22;
        r23 = p000.C0000L.get(r0, r6);	 Catch:{ RuntimeException -> 0x02d3 }
        r6 = -1492842868; // 0xffffffffa705068c float:-1.8461007E-15 double:NaN;
        r0 = r23;
        r24 = r0.invoke(r6);	 Catch:{ RuntimeException -> 0x02d3 }
        if (r24 != 0) goto L_0x0148;
    L_0x0146:
        r21 = 1;
    L_0x0148:
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r15 < r6) goto L_0x016a;
    L_0x014c:
        r15 = r15 + -512;
        r6 = 1149296825; // 0x4480e0b9 float:1031.0226 double:5.67828078E-315;
        r25 = p000.Set.get(r15, r6);	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r46;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x02d3 }
        r24 = r0;
        r6 = 2051401478; // 0x7a45e706 float:2.5689205E35 double:1.013526996E-314;
        r0 = r25;
        r1 = r24;
        r24 = r0.add(r1, r6);	 Catch:{ RuntimeException -> 0x02d3 }
        if (r24 != 0) goto L_0x016a;
    L_0x0168:
        r21 = 1;
    L_0x016a:
        r51 = r51 + 1;
        goto L_0x011f;
    L_0x016d:
        r26 = new Table;
        r0 = r26;
        r1 = r27;
        r2 = r22;
        r0.<init>(r1, r2);	 Catch:{ RuntimeException -> 0x02d3 }
        r51 = 0;
    L_0x017a:
        r6 = 5;
        r0 = r51;
        if (r0 >= r6) goto L_0x029f;
    L_0x017f:
        r0 = r46;
        r13 = r0.value;	 Catch:{ RuntimeException -> 0x02d3 }
        r15 = r13[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r28 = p000.NodeList.size;
        r29 = r28[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r29;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x02d3 }
        r22 = r0;
        if (r15 >= r0) goto L_0x01a9;
    L_0x0190:
        r29 = data;
        r30 = r29[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r28 = p000.NodeList.size;
        r29 = r28[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r46;
        r13 = r0.value;	 Catch:{ RuntimeException -> 0x02d3 }
        r15 = r13[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r31 = r29[r15];	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r26;
        r1 = r30;
        r2 = r31;
        r0.get(r1, r2);	 Catch:{ RuntimeException -> 0x02d3 }
    L_0x01a9:
        r0 = r46;
        r13 = r0.value;	 Catch:{ RuntimeException -> 0x02d3 }
        r15 = r13[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r28 = p000.Intent.name;
        r29 = r28[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r29;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x02d3 }
        r22 = r0;
        if (r15 >= r0) goto L_0x01d3;
    L_0x01ba:
        r29 = p000.PreferenceManager.data;
        r30 = r29[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r28 = p000.Intent.name;
        r29 = r28[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r46;
        r13 = r0.value;	 Catch:{ RuntimeException -> 0x02d3 }
        r15 = r13[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r31 = r29[r15];	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r26;
        r1 = r30;
        r2 = r31;
        r0.get(r1, r2);	 Catch:{ RuntimeException -> 0x02d3 }
    L_0x01d3:
        r51 = r51 + 1;
        goto L_0x017a;
    L_0x01d6:
        if (r8 != 0) goto L_0x02ce;
    L_0x01d8:
        r6 = 12;
        r0 = new p000.Table[r6];	 Catch:{ RuntimeException -> 0x02d3 }
        r27 = r0;
        r22 = 0;
        r51 = 0;
    L_0x01e2:
        r6 = 12;
        r0 = r51;
        if (r0 >= r6) goto L_0x016d;
    L_0x01e8:
        r32 = r13[r51];	 Catch:{ RuntimeException -> 0x02d3 }
        r6 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r0 = r32;
        if (r0 < r6) goto L_0x0301;
    L_0x01f0:
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r32;
        if (r0 >= r6) goto L_0x0301;
    L_0x01f6:
        r0 = r32;
        r15 = r0 + -256;
        r6 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r23 = p000.C0000L.get(r15, r6);	 Catch:{ RuntimeException -> 0x02d3 }
        r6 = 289987850; // 0x1148dd0a float:1.5845331E-28 double:1.432730344E-315;
        r0 = r23;
        r26 = r0.toString(r6);	 Catch:{ RuntimeException -> 0x02d3 }
        if (r26 == 0) goto L_0x0301;
    L_0x020b:
        r15 = r22 + 1;
        r27[r22] = r26;	 Catch:{ RuntimeException -> 0x02d3 }
    L_0x020f:
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r32;
        if (r0 < r6) goto L_0x02fc;
    L_0x0215:
        r0 = r32;
        r0 = r0 + -512;
        r22 = r0;
        r6 = 1863421939; // 0x6f118ff3 float:4.504935E28 double:9.20652764E-315;
        r0 = r22;
        r25 = p000.Set.get(r0, r6);	 Catch:{ RuntimeException -> 0x02d3 }
        r0 = r46;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x02d3 }
        r21 = r0;
        r6 = -783010586; // 0xffffffffd15434e6 float:-5.6963785E10 double:NaN;
        r0 = r25;
        r1 = r21;
        r26 = r0.toString(r1, r6);	 Catch:{ RuntimeException -> 0x02d3 }
        if (r26 == 0) goto L_0x02fc;
    L_0x0237:
        r22 = r15 + 1;
        r27[r15] = r26;	 Catch:{ RuntimeException -> 0x02d3 }
    L_0x023b:
        r51 = r51 + 1;
        goto L_0x01e2;
    L_0x023e:
        if (r21 == 0) goto L_0x01d6;
    L_0x0240:
        r0 = r46;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x02d3 }
        r16 = r0;
        r11 = -9044447488184443957; // 0x827baaedd5179bcb float:-1.04184613E13 double:-1.0576383965972908E-296;
        r16 = r11 * r16;
        r11 = -1;
        r33 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r33 == 0) goto L_0x0306;
    L_0x0253:
        r18 = file;
        r0 = r46;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x02d3 }
        r16 = r0;
        r11 = -9044447488184443957; // 0x827baaedd5179bcb float:-1.04184613E13 double:-1.0576383965972908E-296;
        r0 = r16;
        r0 = r0 * r11;
        r16 = r0;
        r0 = r18;
        r1 = r16;
        r19 = r0.get(r1);	 Catch:{ RuntimeException -> 0x02d3 }
        r34 = r19;
        r34 = (p000.Integer) r34;	 Catch:{ RuntimeException -> 0x02d3 }
        r8 = r34;
    L_0x0273:
        if (r8 != 0) goto L_0x01d6;
    L_0x0275:
        r35 = 0;
        return r35;
    L_0x0278:
        if (r47 == 0) goto L_0x0290;
    L_0x027a:
        if (r49 == 0) goto L_0x0290;
    L_0x027c:
        r6 = 828677934; // 0x31649f2e float:3.326885E-9 double:4.094212987E-315;
        r0 = r47;
        r1 = r8;
        r2 = r48;
        r3 = r49;
        r4 = r50;
        r5 = r6;
        r8 = r0.get(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x02d3 }
        goto L_0x0042;
    L_0x0290:
        if (r47 == 0) goto L_0x0038;
    L_0x0292:
        r6 = -41;
        r0 = r47;
        r1 = r48;
        r8 = r0.add(r8, r1, r6);	 Catch:{ RuntimeException -> 0x02d3 }
        goto L_0x0042;
    L_0x029f:
        r6 = 64;
        r37 = 850; // 0x352 float:1.191E-42 double:4.2E-321;
        r38 = -30;
        r39 = -50;
        r40 = -30;
        r0 = r26;
        r1 = r6;
        r2 = r37;
        r3 = r38;
        r4 = r39;
        r5 = r40;
        r36 = r0.toString(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x02d3 }
        r8 = r36;
        r18 = file;
        r0 = r18;
        r1 = r36;
        r0.get(r1, r9);	 Catch:{ RuntimeException -> 0x02d3 }
        r11 = 7753851055223157219; // 0x6b9b3673fbdd31e3 float:-2.2970189E36 double:2.236602164141891E210;
        r9 = r11 * r9;
        r0 = r46;
        r0.path = r9;	 Catch:{ RuntimeException -> 0x02d3 }
    L_0x02ce:
        if (r47 != 0) goto L_0x0278;
    L_0x02d0:
        if (r49 != 0) goto L_0x0278;
    L_0x02d2:
        return r8;
    L_0x02d3:
        r41 = move-exception;
        r42 = new java.lang.StringBuilder;
        r0 = r42;
        r0.<init>();
        r43 = "bc.as(";
        r0 = r42;
        r1 = r43;
        r42 = r0.append(r1);
        r6 = 41;
        r0 = r42;
        r42 = r0.append(r6);
        r0 = r42;
        r44 = r0.toString();
        r0 = r41;
        r1 = r44;
        r45 = p000.StringBuilder.append(r0, r1);
        throw r45;
    L_0x02fc:
        r22 = r15;
        goto L_0x023b;
    L_0x0301:
        r15 = r22;
        goto L_0x020f;
    L_0x0306:
        goto L_0x0273;
    L_0x0309:
        goto L_0x02ce;
    L_0x030a:
        goto L_0x010b;
        */
        throw new UnsupportedOperationException("Method not decompiled: Connection.toString(JSONArray, int, JSONArray, int, int):Integer");
    }

    public void toString(int $i0, boolean z) {
        if (1 != $i0 || !this.name) {
            int $i1 = this.length[size[$i0]];
            if ($i1 != 0) {
                $i1 -= 256;
                while (true) {
                    if (z) {
                        $i1++;
                        if ($i1 >= TIntArrayList.buffer * 2093843037) {
                            $i1 = 0;
                        }
                    } else {
                        $i1--;
                        if ($i1 < 0) {
                            $i1 = (TIntArrayList.buffer * 2093843037) - 1;
                        }
                    }
                    TIntArrayList $r1 = C0000L.get($i1, (byte) 7);
                    if (!($r1 == null || $r1.f307s)) {
                        if (-590307679 * $r1.header == (this.name ? (byte) 7 : (byte) 0) + $i0) {
                            this.length[size[$i0]] = $i1 + 256;
                            add((byte) 48);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void toString(int $i0, boolean z, byte b) {
        if (1 == $i0) {
            if (this.name) {
                return;
            }
        }
        try {
            int $i2 = this.length[size[$i0]];
            if ($i2 != 0) {
                $i2 -= 256;
                while (true) {
                    if (z) {
                        $i2++;
                        if ($i2 >= TIntArrayList.buffer * 2093843037) {
                            $i2 = 0;
                        }
                    } else {
                        $i2--;
                        if ($i2 < 0) {
                            $i2 = (TIntArrayList.buffer * 2093843037) - 1;
                        }
                    }
                    TIntArrayList $r1 = C0000L.get($i2, (byte) 13);
                    if ($r1 != null) {
                        if ($r1.f307s) {
                            continue;
                        } else {
                            if (-590307679 * $r1.header == (this.name ? (byte) 7 : (byte) 0) + $i0) {
                                this.length[size[$i0]] = $i2 + 256;
                                add((byte) 99);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bc.ad(" + ')');
        }
    }

    public void toString(int[] $r2, int[] iArr, boolean z, int $i0, int i) {
        if ($r2 == null) {
            $r2 = new int[12];
            for (i = 0; i < 7; i++) {
                for (int $i2 = 0; $i2 < 2093843037 * TIntArrayList.buffer; $i2++) {
                    TIntArrayList $r3 = C0000L.get($i2, (byte) -76);
                    if ($r3 != null) {
                        if ($r3.f307s) {
                            continue;
                        } else {
                            if ((z ? (byte) 7 : (byte) 0) + i == $r3.header * -590307679) {
                                try {
                                    $r2[size[i]] = $i2 + 256;
                                    break;
                                } catch (RuntimeException $r5) {
                                    throw StringBuilder.append($r5, "bc.af(" + ')');
                                }
                            }
                        }
                    }
                }
            }
        }
        this.length = $r2;
        this.value = iArr;
        this.name = z;
        this.index = 1314634539 * $i0;
        add((byte) 102);
    }

    public void update(int[] $r3, int[] iArr, boolean z, int $i0) {
        if ($r3 == null) {
            $r3 = new int[12];
            for (int $i1 = 0; $i1 < 7; $i1++) {
                for (int $i2 = 0; $i2 < -315485884 * TIntArrayList.buffer; $i2++) {
                    TIntArrayList $r2 = C0000L.get($i2, (byte) 6);
                    if (!($r2 == null || $r2.f307s)) {
                        if ((z ? (byte) 7 : (byte) 0) + $i1 == $r2.header * -590307679) {
                            $r3[size[$i1]] = $i2 + 1539192816;
                            break;
                        }
                    }
                }
            }
        }
        this.length = $r3;
        this.value = iArr;
        this.name = z;
        this.index = 1314634539 * $i0;
        add((byte) 18);
    }

    public void verifyCredentials(boolean z) {
        if (z != this.name) {
            toString(null, this.value, z, -1, 542614623);
        }
    }

    Table write() {
        if (-1 != this.index * -2141377661) {
            return Thread.add(this.index * -2141377661, (byte) 30).toString(2071867942);
        }
        int $i0;
        boolean $z0 = false;
        for ($i0 = 0; $i0 < 12; $i0++) {
            int $i3 = this.length[$i0];
            if ($i3 >= 256 && $i3 < 512 && !C0000L.get($i3 - 256, (byte) -72).get(521832708)) {
                $z0 = true;
            }
            if ($i3 >= 512 && !Set.get($i3 - 512, 2115220692).remove(this.name, 1225891528)) {
                $z0 = true;
            }
        }
        if ($z0) {
            return null;
        }
        Table $r2;
        Table[] $r3 = new Table[12];
        int $i1 = 0;
        for ($i0 = 0; $i0 < 12; $i0++) {
            int $i2 = this.length[$i0];
            if ($i2 >= 256 && $i2 < 512) {
                $r2 = C0000L.get($i2 - 256, (byte) -29).m51a(-1397828874);
                if ($r2 != null) {
                    $i3 = $i1 + 1;
                    $r3[$i1] = $r2;
                    if ($i2 >= 512) {
                        $r2 = Set.get($i2 - 512, 1521904217).toString(this.name, (byte) 0);
                        if ($r2 != null) {
                            $i1 = $i3 + 1;
                            $r3[$i3] = $r2;
                        }
                    }
                    $i1 = $i3;
                }
            }
            $i3 = $i1;
            if ($i2 >= 512) {
                $r2 = Set.get($i2 - 512, 1521904217).toString(this.name, (byte) 0);
                if ($r2 != null) {
                    $i1 = $i3 + 1;
                    $r3[$i3] = $r2;
                }
            }
            $i1 = $i3;
        }
        $r2 = new Table($r3, $i1);
        for ($i0 = 0; $i0 < 5; $i0++) {
            if (this.value[$i0] < NodeList.size[$i0].length) {
                $r2.get(data[$i0], NodeList.size[$i0][this.value[$i0]]);
            }
            if (this.value[$i0] < Intent.name[$i0].length) {
                $r2.get(PreferenceManager.data[$i0], Intent.name[$i0][this.value[$i0]]);
            }
        }
        return $r2;
    }

    Table write(int i) {
        try {
            if (-1 != this.index * -2141377661) {
                return Thread.add(this.index * -2141377661, (byte) 46).toString(1283738298);
            }
            int $i1;
            boolean $z0 = false;
            for (i = 0; i < 12; i++) {
                $i1 = this.length[i];
                if ($i1 >= 256 && $i1 < 512) {
                    if (!C0000L.get($i1 - 256, (byte) -77).get(2113891875)) {
                        $z0 = true;
                    }
                }
                if ($i1 >= 512) {
                    if (!Set.get($i1 - 512, 1661745601).remove(this.name, 1818573249)) {
                        $z0 = true;
                    }
                }
            }
            if ($z0) {
                return null;
            }
            Table $r2;
            Table[] $r8 = new Table[12];
            int $i2 = 0;
            for (i = 0; i < 12; i++) {
                int $i5 = this.length[i];
                if ($i5 >= 256 && $i5 < 512) {
                    $r2 = C0000L.get($i5 - 256, (byte) -62).m51a(-893761118);
                    if ($r2 != null) {
                        $i1 = $i2 + 1;
                        $r8[$i2] = $r2;
                        if ($i5 >= 512) {
                            $r2 = Set.get($i5 - 512, 1447516592).toString(this.name, (byte) 0);
                            if ($r2 != null) {
                                $i2 = $i1 + 1;
                                $r8[$i1] = $r2;
                            }
                        }
                        $i2 = $i1;
                    }
                }
                $i1 = $i2;
                if ($i5 >= 512) {
                    $r2 = Set.get($i5 - 512, 1447516592).toString(this.name, (byte) 0);
                    if ($r2 != null) {
                        $i2 = $i1 + 1;
                        $r8[$i1] = $r2;
                    }
                }
                $i2 = $i1;
            }
            $r2 = new Table($r8, $i2);
            for (i = 0; i < 5; i++) {
                if (this.value[i] < NodeList.size[i].length) {
                    $r2.get(data[i], NodeList.size[i][this.value[i]]);
                }
                if (this.value[i] < Intent.name[i].length) {
                    $r2.get(PreferenceManager.data[i], Intent.name[i][this.value[i]]);
                }
            }
            return $r2;
        } catch (Throwable $r9) {
            throw StringBuilder.append($r9, "bc.ar(" + ')');
        }
    }
}
