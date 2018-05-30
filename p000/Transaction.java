package p000;

import java.util.Collection;

/* compiled from: ae */
public class Transaction extends BitSet {
    static RuntimeException body = new RuntimeException(ScrollingTextView.MP3_MAX_INPUT_SIZE, null);
    static RuntimeException content = new RuntimeException(Constants.f93X, null);
    static Class current;
    static Class data;
    static boolean header = false;
    static RuntimeException id = new RuntimeException(Constants.f93X, null);
    public static System instance;
    static Table[] map = new Table[4];
    protected static Location out;
    public static RuntimeException parent = new RuntimeException(500, null);
    static Double[] state;
    static Long[] version;
    public boolean $assertionsDisabled;
    public int f325a;
    public int f326b;
    public int buf;
    public int buffer;
    int f327c;
    boolean code;
    boolean context;
    public int count;
    public boolean end;
    int first;
    int flags;
    int f328g;
    public int head;
    public boolean index;
    short[] item;
    int[] items;
    short[] key;
    short[] keys;
    int[] length;
    int limit;
    public int list;
    int lock;
    int log;
    public int f329n;
    public String name;
    public int[] next;
    public int offset;
    boolean f330p;
    public int pos;
    public int position;
    public boolean root;
    public int[] size;
    int start;
    int status;
    public int text;
    public int this$0;
    public String[] type;
    Date uri;
    int f331v;
    public int value;
    short[] values;
    int f332x;

    Transaction() {
        try {
            this.name = R$id.this$0;
            this.this$0 = 589229705;
            this.offset = 818756871;
            this.count = 154804394;
            this.index = true;
            this.value = 1266592117;
            this.f332x = -644101141;
            this.f330p = false;
            this.root = false;
            this.position = -812229481;
            this.buf = 1942492432;
            this.start = 0;
            this.status = 0;
            this.type = new String[5];
            this.buffer = -1334911343;
            this.pos = -1179477531;
            this.code = false;
            this.$assertionsDisabled = true;
            this.log = -1788332160;
            this.lock = 1015656832;
            this.f328g = -1735073408;
            this.f331v = 0;
            this.f327c = 0;
            this.first = 0;
            this.end = false;
            this.context = false;
            this.list = -1673096533;
            this.limit = 2075616583;
            this.flags = 311714513;
            this.head = 1635453729;
            this.f325a = 0;
            this.f326b = 0;
            this.f329n = 0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ae.<init>(" + ')');
        }
    }

    static void add(Logger logger, long $l0) {
        long $l2 = 65535;
        $l0 /= 10;
        if ($l0 < 0) {
            $l2 = 0;
        } else if ($l0 <= 65535) {
            $l2 = $l0;
        }
        try {
            logger.get((int) $l2, -1752508204);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ae.ar(" + ')');
        }
    }

    static final int get(int i, int i2, int i3, int i4, int i5) {
        try {
            i3 = (PingManager.STATE_SENSOR_ON_FLAG - Point.f198y[(i3 * 1024) / i4]) >> 1;
            return (((PingManager.STATE_SENSOR_ON_FLAG - i3) * i) >> 16) + ((i3 * i2) >> 16);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ae.aq(" + ')');
        }
    }

    public static Transaction get(int i) {
        Transaction $r2 = (Transaction) body.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = current.get(6, i, -2277994);
        $r2 = new Transaction();
        $r2.text = -1563878481 * i;
        if ($r4 != null) {
            $r2.parse(new Logger($r4), -536521880);
        }
        $r2.parse(1116751216);
        if ($r2.context) {
            $r2.count = 0;
            $r2.index = false;
        }
        body.get($r2, (long) i);
        return $r2;
    }

    public static void get(Class classR, Class classR2, boolean z) {
        current = classR;
        data = classR2;
        header = z;
    }

    public static void isEmpty(Collection collection) {
        collection.add(body);
        collection.add(parent);
        collection.add(id);
        collection.add(content);
    }

    public static void parse(Class classR, Class classR2, boolean z) {
        current = classR;
        data = classR2;
        header = z;
    }

    public static void serialize(Collection collection) {
        collection.add(body);
        collection.add(parent);
        collection.add(id);
        collection.add(content);
    }

    public static void set(Collection collection) {
        collection.add(body);
        collection.add(parent);
        collection.add(id);
        collection.add(content);
    }

    public int add(int $i0, int i, byte b) {
        try {
            return CompositeInlineMap.add(this.uri, $i0, i, -630945277);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ae.at(" + ')');
        }
    }

    public final ArrayMap add(int $i0, int i, int[][] iArr, int i2, int i3, int i4) {
        long $l6 = this.items == null ? (long) (((-281160693 * this.text) << 10) + i) : (long) ((((this.text * 2085520429) << 10) + ($i0 << 3)) + i);
        ArrayMap $r5 = (ArrayMap) id.get($l6);
        if ($r5 == null) {
            ArrayMap $r6 = get($i0, i, (byte) 1);
            $r5 = $r6;
            if ($r6 == null) {
                return null;
            }
            if (this.f330p) {
                short s = (short) (-1707719040 + (1586640798 * this.start));
                short $s7 = s;
                $r6.start = s;
                int $i02 = this.status * -1165876272;
                $i0 = $i02;
                s = $i02 + PingManager.ELEMENT;
                short $i03 = s;
                s = (short) s;
                $s7 = s;
                $r6.pos = s;
                $r6.next();
            } else {
                $r5 = $r6.toString(1135935562 + (-336608773 * this.start), (-1501370844 * this.status) - 689023758, -50, -1954482621, -50);
            }
            id.get($r5, $l6);
        }
        if (this.f330p) {
            $r5 = ((Table) $r5).run();
        }
        if (-1980149456 * this.f332x >= 0) {
            if ($r5 instanceof Integer) {
                return ((Integer) $r5).add(iArr, i2, i3, i4, true, -1483474115 * this.f332x);
            } else if ($r5 instanceof Table) {
                return ((Table) $r5).add(iArr, i2, i3, i4, true, this.f332x * -1483474115);
            }
        }
        return $r5;
    }

    public final ArrayMap add(int $i0, int $i1, int[][] iArr, int i, int i2, int i3, short s) {
        try {
            long $l7 = this.items == null ? (long) (((2085520429 * this.text) << 10) + $i1) : (long) ((((this.text * 2085520429) << 10) + ($i0 << 3)) + $i1);
            ArrayMap $r5 = (ArrayMap) id.get($l7);
            if ($r5 == null) {
                ArrayMap $r6 = get($i0, $i1, (byte) 1);
                $r5 = $r6;
                if ($r6 == null) {
                    return null;
                }
                if (this.f330p) {
                    short s2 = (short) ((-549827343 * this.start) + 64);
                    s = s2;
                    $r6.start = s2;
                    int $i02 = this.status * 1852456887;
                    $i0 = $i02;
                    s2 = $i02 + PingManager.ELEMENT;
                    short $i03 = s2;
                    s2 = (short) s2;
                    s = s2;
                    $r6.pos = s2;
                    $r6.next();
                } else {
                    $r5 = $r6.toString((-549827343 * this.start) + 64, (1852456887 * this.status) + PingManager.ELEMENT, -50, -10, -50);
                }
                id.get($r5, $l7);
            }
            if (this.f330p) {
                $r5 = ((Table) $r5).run();
            }
            if (-1483474115 * this.f332x >= 0) {
                if ($r5 instanceof Integer) {
                    return ((Integer) $r5).add(iArr, i, i2, i3, true, -1483474115 * this.f332x);
                }
                if ($r5 instanceof Table) {
                    return ((Table) $r5).add(iArr, i, i2, i3, true, this.f332x * -1483474115);
                }
            }
            return $r5;
        } catch (Throwable $r8) {
            throw StringBuilder.append($r8, "ae.ar(" + ')');
        }
    }

    public final Integer add(int i, int i2, int[][] iArr, int i3, int i4, int i5, int i6) {
        try {
            int $i5;
            long $l6;
            if (this.items == null) {
                $i5 = ((this.text * 2085520429) << 10) + i2;
                i6 = $i5;
                $l6 = (long) $i5;
            } else {
                $i5 = (i << 3) + ((this.text * 2085520429) << 10);
                i6 = $i5;
                $i5 += i2;
                i6 = $i5;
                $l6 = (long) $i5;
            }
            Integer $r5 = (Integer) content.get($l6);
            if ($r5 == null) {
                Table $r6 = get(i, i2, (byte) 1);
                if ($r6 == null) {
                    return null;
                }
                $i5 = this.status * 1852456887;
                i2 = $i5;
                BitSet $r7 = $r6.toString((this.start * -549827343) + 64, $i5 + PingManager.ELEMENT, -50, -10, -50);
                $r5 = $r7;
                content.get($r7, $l6);
            }
            return this.f332x * -1483474115 >= 0 ? $r5.add(iArr, i3, i4, i5, true, this.f332x * -1483474115) : $r5;
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "ae.aj(" + ')');
        }
    }

    public final Integer add(int i, int i2, int[][] iArr, int i3, int i4, int i5, JSONArray jSONArray, int i6) {
        long $l7 = this.items == null ? (long) (((this.text * 2085520429) << 10) + i2) : (long) (((i << 3) + ((886211736 * this.text) << 10)) + i2);
        Integer $r6 = (Integer) content.get($l7);
        if ($r6 == null) {
            Table $r7 = get(i, i2, (byte) 1);
            if ($r7 == null) {
                return null;
            }
            BitSet $r8 = $r7.toString((-549827343 * this.start) + 64, (2038691552 * this.status) + 2094661867, -50, -2119788875, -50);
            $r6 = $r8;
            content.get($r8, $l7);
        }
        if (!(jSONArray == null && this.f332x * 1518465767 == -1)) {
            $r6 = jSONArray != null ? jSONArray.get($r6, i6, i2, (byte) -33) : $r6.getValue(true);
            if (this.f332x * -215875495 >= 0) {
                return $r6.add(iArr, i3, i4, i5, false, this.f332x * 1600253978);
            }
        }
        return $r6;
    }

    final Table add(int $i0, int $i1) {
        int $i3;
        Table $r3;
        int $i6;
        boolean $z0;
        if (this.items != null) {
            $i6 = 0;
            while (true) {
                $i3 = this.items.length;
                if ($i6 >= $i3) {
                    break;
                } else if (this.items[$i6] == $i0) {
                    break;
                } else {
                    $i6++;
                }
            }
            $i6 = -1;
            if ($i6 == -1) {
                return null;
            }
            $i6 = this.length[$i6];
            $z0 = this.code ^ ($i1 > 3 ? 1 : 0);
            if ($z0) {
                $i6 += PingManager.STATE_SENSOR_ON_FLAG;
            }
            $r3 = (Table) parent.get((long) $i6);
            if ($r3 == null) {
                $r3 = Table.get(data, -1996900563 & $i6, 0);
                if ($r3 == null) {
                    return null;
                }
                if ($z0) {
                    $r3.getItem();
                }
                parent.get($r3, (long) $i6);
            }
        } else if ($i0 != 10) {
            return null;
        } else {
            if (this.length == null) {
                return null;
            }
            $z0 = this.code;
            if ($i0 == 2 && $i1 > 3) {
                $z0 = !$z0;
            }
            $i6 = this.length.length;
            $r3 = null;
            for (int $i32 = 0; $i32 < $i6; $i32++) {
                int $i4 = this.length[$i32];
                if ($z0) {
                    $i4 -= 2112359673;
                }
                $r3 = (Table) parent.get((long) $i4);
                if ($r3 == null) {
                    $r3 = Table.get(data, 65535 & $i4, 0);
                    if ($r3 == null) {
                        return null;
                    }
                    if ($z0) {
                        $r3.getItem();
                    }
                    parent.get($r3, (long) $i4);
                }
                if ($i6 > 1) {
                    map[$i32] = $r3;
                }
            }
            if ($i6 > 1) {
                $r3 = new Table(map, $i6);
            }
        }
        Object obj = (-588520178 == this.log * -1685529536 && Constants.f93X == 2005993035 * this.lock && Constants.f93X == this.f328g * 1614498680) ? null : 1;
        Object obj2 = (this.f331v * -2064324213 == 0 && this.f327c * 1628640203 == 0 && 1940325805 * this.first == 0) ? null : 1;
        boolean z = $i1 == 0 && obj == null && obj2 == null;
        Table table = new Table($r3, z, this.key == null, this.values == null, true);
        if (4 == $i0 && $i1 > 3) {
            table.initialize(256);
            table.add(45, 0, 2057521237);
        }
        $i0 = $i1 & 3;
        if (1 == $i0) {
            table.select();
        } else if (2 == $i0) {
            table.replace();
        } else if ($i0 == 3) {
            table.resolveDeltas();
        }
        if (this.key != null) {
            $i0 = 0;
            while (true) {
                $i3 = this.key;
                short[] $r7 = $i3;
                if ($i0 >= $i3.length) {
                    break;
                }
                table.get(this.key[$i0], this.item[$i0]);
                $i0++;
            }
        }
        if (this.values != null) {
            $i0 = 0;
            while (true) {
                $i3 = this.values;
                $r7 = $i3;
                if ($i0 >= $i3.length) {
                    break;
                }
                table.equals(this.values[$i0], this.keys[$i0]);
                $i0++;
            }
        }
        if (obj != null) {
            table.trim(1174965903 * this.log, this.lock * 2005993035, 1065446451 * this.f328g);
        }
        if (obj2 == null) {
            return table;
        }
        table.add(-2064324213 * this.f331v, 23876833 * this.f327c, 1940325805 * this.first);
        return table;
    }

    public final Transaction add(byte b) {
        try {
            int $i1 = this.limit * -1848030327 != -1 ? IOException.toString(this.limit * -1848030327, 998830794) : -1 != this.flags * 1091488207 ? Event.this$0[this.flags * 1091488207] : -1;
            if ($i1 >= 0) {
                if ($i1 < this.size.length - 1) {
                    $i1 = this.size[$i1];
                    return -1 == $i1 ? BigInteger.get($i1, 1459201171) : null;
                }
            }
            $i1 = this.size[this.size.length - 1];
            if (-1 == $i1) {
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ae.am(" + ')');
        }
    }

    void add() {
        byte $b0 = (byte) 0;
        if (this.value * -1193025245 == -1) {
            this.value = 0;
            if (this.length != null && (this.items == null || 10 == this.items[0])) {
                this.value = -1266592117;
            }
            for (int $i1 = 0; $i1 < 5; $i1++) {
                if (this.type[$i1] != null) {
                    this.value = -1266592117;
                }
            }
        }
        if (-1 == 29042685 * this.list) {
            if (-1655214851 * this.count != 0) {
                $b0 = (byte) 1;
            }
            this.list = $b0 * 1673096533;
        }
    }

    void add(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) 126);
            } else {
                return;
            }
        }
    }

    void add(Logger logger, int i, byte b) {
        int $i2 = -1;
        int $i3 = 0;
        if (1 == i) {
            try {
                i = logger.get((byte) 0);
                if (i > 0) {
                    if (this.length == null || header) {
                        this.items = new int[i];
                        this.length = new int[i];
                        while ($i3 < i) {
                            this.length[$i3] = logger.get(-1379171780);
                            this.items[$i3] = logger.get((byte) 0);
                            $i3++;
                        }
                    } else {
                        logger.data += i * 1900068521;
                    }
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ae.ag(" + ')');
            }
        } else if (2 == i) {
            this.name = logger.toString(1610775101);
        } else if (i == 5) {
            i = logger.get((byte) 0);
            if (i > 0) {
                if (this.length == null || header) {
                    this.items = null;
                    this.length = new int[i];
                    while ($i3 < i) {
                        this.length[$i3] = logger.get(1532714637);
                        $i3++;
                    }
                } else {
                    logger.data += i * -164943418;
                }
            }
        } else if (14 == i) {
            $i0 = logger.get((byte) 0) * 589229705;
            i = $i0;
            this.this$0 = $i0;
        } else if (15 == i) {
            $i0 = logger.get((byte) 0) * 818756871;
            i = $i0;
            this.offset = $i0;
        } else if (i == 17) {
            this.count = 0;
            this.index = false;
        } else if (18 == i) {
            this.index = false;
        } else if (19 == i) {
            $i0 = logger.get((byte) 0) * -1266592117;
            i = $i0;
            this.value = $i0;
        } else if (21 == i) {
            this.f332x = 0;
        } else if (i == 22) {
            this.f330p = true;
        } else if (i == 23) {
            this.root = true;
        } else if (24 == i) {
            $i0 = logger.get(381728849) * 812229481;
            i = $i0;
            this.position = $i0;
            if (65535 == this.position * -229827367) {
                this.position = -812229481;
            }
        } else if (27 == i) {
            this.count = -2070081451;
        } else if (i == 28) {
            $i0 = logger.get((byte) 0) * 1195147601;
            i = $i0;
            this.buf = $i0;
        } else if (i == 29) {
            this.start = logger.next(1247983979) * -1153489903;
        } else if (39 == i) {
            this.status = logger.next(1247983979) * 1599151791;
        } else if (i >= 30 && i < 35) {
            this.type[i - 30] = logger.toString(2117225881);
            if (this.type[i - 30].equalsIgnoreCase(R$id.names)) {
                this.type[i - 30] = null;
            }
        } else if (i == 40) {
            i = logger.get((byte) 0);
            this.key = new short[i];
            this.item = new short[i];
            while ($i3 < i) {
                this.key[$i3] = (short) logger.get(2135366640);
                this.item[$i3] = (short) logger.get(1886447953);
                $i3++;
            }
        } else if (i == 41) {
            i = logger.get((byte) 0);
            this.values = new short[i];
            this.keys = new short[i];
            while ($i3 < i) {
                this.values[$i3] = (short) logger.get(1375094199);
                this.keys[$i3] = (short) logger.get(817420127);
                $i3++;
            }
        } else if (i == 62) {
            this.code = true;
        } else if (64 == i) {
            this.$assertionsDisabled = false;
        } else if (i == 65) {
            $i0 = logger.get(1300228737) * -2060791697;
            i = $i0;
            this.log = $i0;
        } else if (66 == i) {
            $i0 = logger.get(-1534740391) * 1383666531;
            i = $i0;
            this.lock = $i0;
        } else if (i == 67) {
            $i0 = logger.get(1067436495) * 254880195;
            i = $i0;
            this.f328g = $i0;
        } else if (68 == i) {
            $i0 = logger.get(1587157093) * 1179477531;
            i = $i0;
            this.pos = $i0;
        } else if (i == 69) {
            logger.get((byte) 0);
        } else if (i == 70) {
            $i0 = logger.getValue(983375929) * -61180381;
            i = $i0;
            this.f331v = $i0;
        } else if (71 == i) {
            $i0 = logger.getValue(1542958632) * 1625291235;
            i = $i0;
            this.f327c = $i0;
        } else if (72 == i) {
            $i0 = logger.getValue(1936317844) * 564569637;
            i = $i0;
            this.first = $i0;
        } else if (73 == i) {
            this.end = true;
        } else if (i == 74) {
            this.context = true;
        } else if (i == 75) {
            $i0 = logger.get((byte) 0) * 1673096533;
            i = $i0;
            this.list = $i0;
        } else if (i == 77 || i == 92) {
            this.limit = logger.get(-1622089456) * -2075616583;
            if (this.limit * -1848030327 == 65535) {
                this.limit = 2075616583;
            }
            this.flags = logger.get(-2089527932) * -311714513;
            if (this.flags * 1091488207 == 65535) {
                this.flags = 311714513;
            }
            if (92 == i) {
                i = logger.get(1160362423);
                if (65535 != i) {
                    $i2 = i;
                }
            }
            i = logger.get((byte) 0);
            this.size = new int[(i + 2)];
            while ($i3 <= i) {
                this.size[$i3] = logger.get(-2009644003);
                if (this.size[$i3] == 65535) {
                    this.size[$i3] = -1;
                }
                $i3++;
            }
            this.size[i + 1] = $i2;
        } else if (78 == i) {
            $i0 = logger.get(-986347447) * -1635453729;
            i = $i0;
            this.head = $i0;
            $i0 = logger.get((byte) 0) * 1172561879;
            i = $i0;
            this.f325a = $i0;
        } else if (i == 79) {
            $i0 = logger.get(1844350099) * 2072889243;
            i = $i0;
            this.f326b = $i0;
            $i0 = logger.get(-1079628697) * 926933525;
            i = $i0;
            this.f329n = $i0;
            $i0 = logger.get((byte) 0) * 1172561879;
            i = $i0;
            this.f325a = $i0;
            i = logger.get((byte) 0);
            this.next = new int[i];
            while ($i3 < i) {
                this.next[$i3] = logger.get(345067982);
                $i3++;
            }
        } else if (i == 81) {
            $i0 = logger.get((byte) 0) * 1681134848;
            i = $i0;
            this.f332x = $i0;
        } else if (82 == i) {
            $i0 = logger.get(-1116986905) * 1334911343;
            i = $i0;
            this.buffer = $i0;
        } else if (i == 249) {
            this.uri = IllegalStateException.add(logger, this.uri, (byte) -42);
        }
    }

    public final Transaction apply() {
        int $i0 = this.limit * -1848030327 != -1 ? IOException.toString(this.limit * -1848030327, 998830794) : -1 != this.flags * 1091488207 ? Event.this$0[this.flags * 1091488207] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.size.length - 1) ? this.size[this.size.length - 1] : this.size[$i0];
        return -1 != $i0 ? BigInteger.get($i0, 1226195021) : null;
    }

    public final Transaction build() {
        int $i0 = this.limit * -1848030327 != -1 ? IOException.toString(this.limit * -1848030327, 998830794) : -1 != this.flags * 1091488207 ? Event.this$0[this.flags * 1091488207] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.size.length - 1) ? this.size[this.size.length - 1] : this.size[$i0];
        return -1 != $i0 ? BigInteger.get($i0, 1264277532) : null;
    }

    void clear() {
        byte $b0 = (byte) 0;
        if (this.value * 1333978434 == -1) {
            this.value = 0;
            if (this.length != null && (this.items == null || 10 == this.items[0])) {
                this.value = -1295333696;
            }
            for (int $i1 = 0; $i1 < 5; $i1++) {
                if (this.type[$i1] != null) {
                    this.value = 1970783470;
                }
            }
        }
        if (-1 == 29042685 * this.list) {
            if (-557239609 * this.count != 0) {
                $b0 = (byte) 1;
            }
            this.list = $b0 * -1564528733;
        }
    }

    public final Transaction clone() {
        int $i0 = this.limit * -1848030327 != -1 ? IOException.toString(this.limit * -1848030327, 998830794) : -1 != this.flags * 1091488207 ? Event.this$0[this.flags * 1091488207] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.size.length - 1) ? this.size[this.size.length - 1] : this.size[$i0];
        return -1 != $i0 ? BigInteger.get($i0, 1515561789) : null;
    }

    public boolean contains() {
        if (this.size != null) {
            for (int $i0 = 0; $i0 < this.size.length; $i0++) {
                if (-1 != this.size[$i0]) {
                    Transaction $r1 = BigInteger.get(this.size[$i0], 1848924708);
                    if ($r1.head * -1726757089 != -1 || $r1.next != null) {
                        return true;
                    }
                }
            }
        } else if (!(this.head * 393560711 == -1 && this.next == null)) {
            return true;
        }
        return false;
    }

    public final boolean contains(int $i0) {
        boolean $z0;
        int $i1;
        if (this.items != null) {
            $i1 = 0;
            while ($i1 < this.items.length) {
                if ($i0 == this.items[$i1]) {
                    $z0 = data.equals(this.length[$i1] & 65535, 0, 1958052301);
                } else {
                    $i1++;
                }
            }
            return true;
        } else if (this.length == null) {
            return true;
        } else {
            if ($i0 == 10) {
                $z0 = true;
                for (int $i12 : this.length) {
                    $z0 &= data.equals($i12 & 75951155, 0, 1915983142);
                }
            }
            return true;
        }
        return $z0;
    }

    public final boolean convert() {
        if (this.length == null) {
            return true;
        }
        boolean $z1 = true;
        for (int $i1 : this.length) {
            $z1 &= data.equals($i1 & 65535, 0, 1777820642);
        }
        return $z1;
    }

    public final Transaction copy() {
        int $i0 = this.limit * -1848030327 != -1 ? IOException.toString(this.limit * -1848030327, 998830794) : -1 != this.flags * 1091488207 ? Event.this$0[this.flags * 1091488207] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.size.length - 1) ? this.size[this.size.length - 1] : this.size[$i0];
        return -1 != $i0 ? BigInteger.get($i0, 1553679974) : null;
    }

    public final Integer doInBackground(int i, int $i1, int[][] iArr, int i2, int i3, int i4) {
        long $l6 = this.items == null ? (long) (((this.text * 2085520429) << 10) + $i1) : (long) (((i << 3) + ((this.text * 2085520429) << 10)) + $i1);
        Integer $r5 = (Integer) content.get($l6);
        if ($r5 == null) {
            Table $r6 = get(i, $i1, (byte) 1);
            if ($r6 == null) {
                return null;
            }
            int $i12 = this.status * 1852456887;
            $i1 = $i12;
            BitSet $r7 = $r6.toString((this.start * -549827343) - 729313158, $i12 + PingManager.ELEMENT, -50, 1661076788, 1699232688);
            $r5 = $r7;
            content.get($r7, $l6);
        }
        if (this.f332x * -1483474115 < 0) {
            return $r5;
        }
        return $r5.add(iArr, i2, i3, i4, true, this.f332x * -102820884);
    }

    public final Integer get(int i, int $i1, int[][] iArr, int i2, int i3, int i4) {
        long $l6 = this.items == null ? (long) (((this.text * 2085520429) << 10) + $i1) : (long) (((i << 3) + ((this.text * 2085520429) << 10)) + $i1);
        Integer $r5 = (Integer) content.get($l6);
        if ($r5 == null) {
            Table $r6 = get(i, $i1, (byte) 1);
            if ($r6 == null) {
                return null;
            }
            int $i12 = this.status * 1852456887;
            $i1 = $i12;
            BitSet $r7 = $r6.toString((this.start * -549827343) + 64, $i12 + PingManager.ELEMENT, -50, -10, -50);
            $r5 = $r7;
            content.get($r7, $l6);
        }
        if (this.f332x * -1483474115 < 0) {
            return $r5;
        }
        return $r5.add(iArr, i2, i3, i4, true, this.f332x * -1483474115);
    }

    final Table get(int $i0, int $i1) {
        Table $r2;
        int $i12;
        int $i2;
        boolean $z0;
        long $l5;
        if (this.items != null) {
            $i2 = 0;
            while ($i2 < this.items.length) {
                if (this.items[$i2] == $i0) {
                    break;
                }
                $i2++;
            }
            $i2 = -1;
            if ($i2 == -1) {
                return null;
            }
            $i2 = this.length[$i2];
            $z0 = this.code ^ ($i1 > 3 ? 1 : 0);
            if ($z0) {
                $i2 = PingManager.STATE_SENSOR_ON_FLAG + $i2;
            }
            $l5 = (long) $i2;
            $r2 = (Table) parent.get($l5);
            if ($r2 == null) {
                $r2 = Table.get(data, 65535 & $i2, 0);
                if ($r2 == null) {
                    return null;
                }
                if ($z0) {
                    $r2.getItem();
                }
                $l5 = (long) $i2;
                parent.get($r2, $l5);
            }
        } else if ($i0 != 10) {
            return null;
        } else {
            if (this.length == null) {
                return null;
            }
            $z0 = this.code;
            if ($i0 == 2 && $i1 > 3) {
                $z0 = !$z0;
            }
            $i2 = this.length.length;
            int $i3 = 0;
            $r2 = null;
            while ($i3 < $i2) {
                int $i4 = this.length[$i3];
                if ($z0) {
                    $i4 += PingManager.STATE_SENSOR_ON_FLAG;
                }
                $l5 = (long) $i4;
                $r2 = (Table) parent.get($l5);
                if ($r2 == null) {
                    BitSet $r6 = Table.get(data, 1872403240 & $i4, 0);
                    $r2 = $r6;
                    if ($r6 == null) {
                        return null;
                    }
                    if ($z0) {
                        $r6.getItem();
                    }
                    parent.get($r6, (long) $i4);
                }
                Table $r62 = $r2;
                if ($i2 > 1) {
                    map[$i3] = $r2;
                }
                $i3++;
                $r2 = $r62;
            }
            if ($i2 > 1) {
                $r2 = new Table(map, $i2);
            }
        }
        Object obj = (169833378 == this.log * 1174965903 && -873746234 == 480788085 * this.lock && Constants.f93X == this.f328g * 481431275) ? null : 1;
        Object obj2 = (this.f331v * -2064324213 == 0 && this.f327c * 1628640203 == 0 && 1940325805 * this.first == 0) ? null : 1;
        boolean z = $i1 == 0 && obj == null && obj2 == null;
        Table table = new Table($r2, z, this.key == null, this.values == null, true);
        if (4 == $i0 && $i1 > 3) {
            table.initialize(256);
            table.add(-1624609846, 0, 223316027);
        }
        $i0 = $i1 & 3;
        if (1 == $i0) {
            table.select();
        } else if (2 == $i0) {
            table.replace();
        } else if ($i0 == 3) {
            table.resolveDeltas();
        }
        if (this.key != null) {
            $i0 = 0;
            while (true) {
                $i12 = this.key;
                short[] $r7 = $i12;
                if ($i0 >= $i12.length) {
                    break;
                }
                table.get(this.key[$i0], this.item[$i0]);
                $i0++;
            }
        }
        if (this.values != null) {
            $i0 = 0;
            while (true) {
                $i12 = this.values;
                $r7 = $i12;
                if ($i0 >= $i12.length) {
                    break;
                }
                table.equals(this.values[$i0], this.keys[$i0]);
                $i0++;
            }
        }
        if (obj != null) {
            table.trim(-1128025620 * this.log, this.lock * 1375064681, -1406524579 * this.f328g);
        }
        if (obj2 == null) {
            return table;
        }
        table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, -880838978 * this.first);
        return table;
    }

    final Table get(int $i0, int $i1, byte b) {
        try {
            int $i5;
            Table $r4;
            Table table;
            Object obj;
            Object obj2;
            boolean z;
            short[] $r6;
            int $i3;
            boolean $z0;
            if (this.items != null) {
                $i3 = 0;
                while (true) {
                    $i5 = this.items.length;
                    if ($i3 >= $i5) {
                        break;
                    } else if (this.items[$i3] == $i0) {
                        break;
                    } else {
                        $i3++;
                    }
                }
                $i3 = -1;
                if ($i3 == -1) {
                    return null;
                }
                $i3 = this.length[$i3];
                $z0 = this.code ^ ($i1 > 3);
                if ($z0) {
                    $i3 = PingManager.STATE_SENSOR_ON_FLAG + $i3;
                }
                $r4 = (Table) parent.get((long) $i3);
                if ($r4 == null) {
                    BitSet $r42 = Table.get(data, 65535 & $i3, 0);
                    if ($r42 == null) {
                        return null;
                    }
                    if ($z0) {
                        $r42.getItem();
                    }
                    parent.get($r42, (long) $i3);
                }
            } else if ($i0 != 10) {
                return null;
            } else {
                if (this.length == null) {
                    return null;
                }
                $z0 = this.code;
                if ($i0 == 2 && $i1 > 3) {
                    $z0 = !$z0;
                }
                $i3 = this.length.length;
                int $i52 = 0;
                $r4 = null;
                while ($i52 < $i3) {
                    Table $r7;
                    int i = this.length[$i52];
                    if ($z0) {
                        i += PingManager.STATE_SENSOR_ON_FLAG;
                    }
                    $r4 = (Table) parent.get((long) i);
                    if ($r4 == null) {
                        $r7 = Table.get(data, 65535 & i, 0);
                        $r4 = $r7;
                        if ($r7 == null) {
                            return null;
                        }
                        if ($z0) {
                            $r7.getItem();
                        }
                        parent.get($r7, (long) i);
                    }
                    $r7 = $r4;
                    if ($i3 > 1) {
                        map[$i52] = $r4;
                    }
                    $i52++;
                    $r4 = $r7;
                }
                if ($i3 > 1) {
                    table = new Table(map, $i3);
                }
            }
            if (Constants.f93X == this.log * 1174965903) {
                if (Constants.f93X == 2005993035 * this.lock) {
                    if (Constants.f93X == this.f328g * 481431275) {
                        obj = null;
                        if (this.f331v * -2064324213 == 0) {
                            if (this.f327c * 1628640203 == 0) {
                                if (1940325805 * this.first == 0) {
                                    obj2 = null;
                                    z = $i1 != 0 && obj == null && obj2 == null;
                                    table = new Table($r4, z, this.key != null, this.values != null, true);
                                    if (4 == $i0 && $i1 > 3) {
                                        table.initialize(256);
                                        table.add(45, 0, -45);
                                    }
                                    $i0 = $i1 & 3;
                                    if (1 != $i0) {
                                        table.select();
                                    } else if (2 != $i0) {
                                        table.replace();
                                    } else if ($i0 == 3) {
                                        table.resolveDeltas();
                                    }
                                    if (this.key != null) {
                                        $i0 = 0;
                                        while (true) {
                                            $i5 = this.key;
                                            $r6 = $i5;
                                            if ($i0 < $i5.length) {
                                                table.get(this.key[$i0], this.item[$i0]);
                                                $i0++;
                                            }
                                        }
                                        if (this.values != null) {
                                            $i0 = 0;
                                            while (true) {
                                                $i5 = this.values;
                                                $r6 = $i5;
                                                if ($i0 >= $i5.length) {
                                                    break;
                                                }
                                                table.equals(this.values[$i0], this.keys[$i0]);
                                                $i0++;
                                            }
                                        }
                                        if (obj != null) {
                                            table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
                                        }
                                        if (obj2 == null) {
                                            return table;
                                        }
                                        table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
                                        return table;
                                    }
                                    if (this.values != null) {
                                        $i0 = 0;
                                        while (true) {
                                            $i5 = this.values;
                                            $r6 = $i5;
                                            if ($i0 >= $i5.length) {
                                                break;
                                            }
                                            table.equals(this.values[$i0], this.keys[$i0]);
                                            $i0++;
                                        }
                                    }
                                    if (obj != null) {
                                        table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
                                    }
                                    if (obj2 == null) {
                                        return table;
                                    }
                                    table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
                                    return table;
                                }
                            }
                        }
                        obj2 = 1;
                        if ($i1 != 0) {
                        }
                        if (this.key != null) {
                        }
                        if (this.values != null) {
                        }
                        table = new Table($r4, z, this.key != null, this.values != null, true);
                        table.initialize(256);
                        table.add(45, 0, -45);
                        $i0 = $i1 & 3;
                        if (1 != $i0) {
                            table.select();
                        } else if (2 != $i0) {
                            table.replace();
                        } else if ($i0 == 3) {
                            table.resolveDeltas();
                        }
                        if (this.key != null) {
                            $i0 = 0;
                            while (true) {
                                $i5 = this.key;
                                $r6 = $i5;
                                if ($i0 < $i5.length) {
                                    table.get(this.key[$i0], this.item[$i0]);
                                    $i0++;
                                }
                            }
                            if (this.values != null) {
                                $i0 = 0;
                                while (true) {
                                    $i5 = this.values;
                                    $r6 = $i5;
                                    if ($i0 >= $i5.length) {
                                        break;
                                    }
                                    table.equals(this.values[$i0], this.keys[$i0]);
                                    $i0++;
                                }
                            }
                            if (obj != null) {
                                table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
                            }
                            if (obj2 == null) {
                                return table;
                            }
                            table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
                            return table;
                        }
                        if (this.values != null) {
                            $i0 = 0;
                            while (true) {
                                $i5 = this.values;
                                $r6 = $i5;
                                if ($i0 >= $i5.length) {
                                    break;
                                }
                                table.equals(this.values[$i0], this.keys[$i0]);
                                $i0++;
                            }
                        }
                        if (obj != null) {
                            table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
                        }
                        if (obj2 == null) {
                            return table;
                        }
                        table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
                        return table;
                    }
                }
            }
            obj = 1;
            if (this.f331v * -2064324213 == 0) {
                if (this.f327c * 1628640203 == 0) {
                    if (1940325805 * this.first == 0) {
                        obj2 = null;
                        if ($i1 != 0) {
                        }
                        if (this.key != null) {
                        }
                        if (this.values != null) {
                        }
                        table = new Table($r4, z, this.key != null, this.values != null, true);
                        table.initialize(256);
                        table.add(45, 0, -45);
                        $i0 = $i1 & 3;
                        if (1 != $i0) {
                            table.select();
                        } else if (2 != $i0) {
                            table.replace();
                        } else if ($i0 == 3) {
                            table.resolveDeltas();
                        }
                        if (this.key != null) {
                            $i0 = 0;
                            while (true) {
                                $i5 = this.key;
                                $r6 = $i5;
                                if ($i0 < $i5.length) {
                                    table.get(this.key[$i0], this.item[$i0]);
                                    $i0++;
                                }
                            }
                            if (this.values != null) {
                                $i0 = 0;
                                while (true) {
                                    $i5 = this.values;
                                    $r6 = $i5;
                                    if ($i0 >= $i5.length) {
                                        break;
                                    }
                                    table.equals(this.values[$i0], this.keys[$i0]);
                                    $i0++;
                                }
                            }
                            if (obj != null) {
                                table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
                            }
                            if (obj2 == null) {
                                return table;
                            }
                            table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
                            return table;
                        }
                        if (this.values != null) {
                            $i0 = 0;
                            while (true) {
                                $i5 = this.values;
                                $r6 = $i5;
                                if ($i0 >= $i5.length) {
                                    break;
                                }
                                table.equals(this.values[$i0], this.keys[$i0]);
                                $i0++;
                            }
                        }
                        if (obj != null) {
                            table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
                        }
                        if (obj2 == null) {
                            return table;
                        }
                        table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
                        return table;
                    }
                }
            }
            obj2 = 1;
            if ($i1 != 0) {
            }
            if (this.key != null) {
            }
            if (this.values != null) {
            }
            table = new Table($r4, z, this.key != null, this.values != null, true);
            table.initialize(256);
            table.add(45, 0, -45);
            $i0 = $i1 & 3;
            if (1 != $i0) {
                table.select();
            } else if (2 != $i0) {
                table.replace();
            } else if ($i0 == 3) {
                table.resolveDeltas();
            }
            if (this.key != null) {
                $i0 = 0;
                while (true) {
                    $i5 = this.key;
                    $r6 = $i5;
                    if ($i0 < $i5.length) {
                        table.get(this.key[$i0], this.item[$i0]);
                        $i0++;
                    }
                }
                if (this.values != null) {
                    $i0 = 0;
                    while (true) {
                        $i5 = this.values;
                        $r6 = $i5;
                        if ($i0 >= $i5.length) {
                            break;
                        }
                        table.equals(this.values[$i0], this.keys[$i0]);
                        $i0++;
                    }
                }
                if (obj != null) {
                    table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
                }
                if (obj2 == null) {
                    return table;
                }
                table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
                return table;
            }
            if (this.values != null) {
                $i0 = 0;
                while (true) {
                    $i5 = this.values;
                    $r6 = $i5;
                    if ($i0 >= $i5.length) {
                        break;
                    }
                    table.equals(this.values[$i0], this.keys[$i0]);
                    $i0++;
                }
            }
            if (obj != null) {
                table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
            }
            if (obj2 == null) {
                return table;
            }
            table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
            return table;
        } catch (Throwable $r9) {
            throw StringBuilder.append($r9, "ae.aq(" + ')');
        }
    }

    public String get(int i, String $r1) {
        return Block.toString(this.uri, i, $r1, (byte) 12);
    }

    public String get(int i, String $r1, byte b) {
        try {
            return Block.toString(this.uri, i, $r1, (byte) 12);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ae.ab(" + ')');
        }
    }

    public boolean get(byte b) {
        try {
            if (this.size != null) {
                for (int $i1 = 0; $i1 < this.size.length; $i1++) {
                    if (-1 != this.size[$i1]) {
                        Transaction $r2 = BigInteger.get(this.size[$i1], 2078791438);
                        if ($r2.head * -1726757089 == -1) {
                            if ($r2.next != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } else if (this.head * -1726757089 == -1) {
                return this.next != null;
            }
            return true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ae.ai(" + ')');
        }
    }

    public final boolean get(int $i0, byte b) {
        boolean $z0 = true;
        int $i2 = 0;
        try {
            if (this.items != null) {
                while ($i2 < this.items.length) {
                    if ($i0 == this.items[$i2]) {
                        return data.equals(this.length[$i2] & 65535, 0, 1782889078);
                    }
                    $i2++;
                }
                return true;
            } else if (this.length == null) {
                return true;
            } else {
                if ($i0 != 10) {
                    return true;
                }
                while ($i2 < this.length.length) {
                    $z0 &= data.equals(this.length[$i2] & 65535, 0, 1613907085);
                    $i2++;
                }
                return $z0;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ae.ay(" + ')');
        }
    }

    public final boolean getBytes() {
        if (this.length == null) {
            return true;
        }
        boolean $z1 = true;
        for (int $i1 : this.length) {
            $z1 &= data.equals($i1 & -138545849, 0, 1750555881);
        }
        return $z1;
    }

    public final boolean getValue() {
        if (this.length == null) {
            return true;
        }
        boolean $z1 = true;
        for (int $i1 : this.length) {
            $z1 &= data.equals($i1 & 65535, 0, 1944507307);
        }
        return $z1;
    }

    public final boolean getValue(int i) {
        boolean $z0 = true;
        i = 0;
        if (this.length == null) {
            return true;
        }
        while (i < this.length.length) {
            try {
                boolean $z1 = data.equals(this.length[i] & 65535, 0, 1999462713);
                i++;
                $z0 = $z1 & $z0;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ae.as(" + ')');
            }
        }
        return $z0;
    }

    public String getVersion(int i, String $r1) {
        return Block.toString(this.uri, i, $r1, (byte) 12);
    }

    void init() {
        byte $b0 = (byte) 0;
        if (this.value * -1193025245 == -1) {
            this.value = 0;
            if (this.length != null && (this.items == null || 10 == this.items[0])) {
                this.value = -1266592117;
            }
            for (int $i1 = 0; $i1 < 5; $i1++) {
                if (this.type[$i1] != null) {
                    this.value = -1266592117;
                }
            }
        }
        if (-1 == 29042685 * this.list) {
            if (-1655214851 * this.count != 0) {
                $b0 = (byte) 1;
            }
            this.list = $b0 * 1673096533;
        }
    }

    void init(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) 47);
            } else {
                return;
            }
        }
    }

    public boolean isEmpty() {
        if (this.size != null) {
            for (int $i0 = 0; $i0 < this.size.length; $i0++) {
                if (-1 != this.size[$i0]) {
                    Transaction $r1 = BigInteger.get(this.size[$i0], 1668314770);
                    if ($r1.head * -1726757089 != -1 || $r1.next != null) {
                        return true;
                    }
                }
            }
        } else if (!(this.head * 1869667932 == -1 && this.next == null)) {
            return true;
        }
        return false;
    }

    void parse() {
        byte $b0 = (byte) 0;
        if (this.value * -1193025245 == -1) {
            this.value = 0;
            if (this.length != null && (this.items == null || 10 == this.items[0])) {
                this.value = -1266592117;
            }
            for (int $i1 = 0; $i1 < 5; $i1++) {
                if (this.type[$i1] != null) {
                    this.value = -1266592117;
                }
            }
        }
        if (-1 == 753560697 * this.list) {
            if (-1655214851 * this.count != 0) {
                $b0 = (byte) 1;
            }
            this.list = $b0 * -1528893581;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void parse(int r10) {
        /*
        r9 = this;
        r0 = 0;
        r10 = r9.value;	 Catch:{ RuntimeException -> 0x0051 }
        r1 = -1193025245; // 0xffffffffb8e3e123 float:-1.08661385E-4 double:NaN;
        r10 = r10 * r1;
        r1 = -1;
        if (r10 != r1) goto L_0x0035;
    L_0x000a:
        r1 = 0;
        r9.value = r1;	 Catch:{ RuntimeException -> 0x0051 }
        r2 = r9.length;	 Catch:{ RuntimeException -> 0x0051 }
        if (r2 == 0) goto L_0x0023;
    L_0x0011:
        r2 = r9.items;	 Catch:{ RuntimeException -> 0x0051 }
        if (r2 == 0) goto L_0x001e;
    L_0x0015:
        r2 = r9.items;	 Catch:{ RuntimeException -> 0x0051 }
        r1 = 0;
        r10 = r2[r1];	 Catch:{ RuntimeException -> 0x0051 }
        r1 = 10;
        if (r1 != r10) goto L_0x0023;
    L_0x001e:
        r1 = -1266592117; // 0xffffffffb481568b float:-2.409109E-7 double:NaN;
        r9.value = r1;	 Catch:{ RuntimeException -> 0x0051 }
    L_0x0023:
        r10 = 0;
    L_0x0024:
        r1 = 5;
        if (r10 >= r1) goto L_0x0035;
    L_0x0027:
        r3 = r9.type;	 Catch:{ RuntimeException -> 0x0051 }
        r4 = r3[r10];	 Catch:{ RuntimeException -> 0x0051 }
        if (r4 == 0) goto L_0x0032;
    L_0x002d:
        r1 = -1266592117; // 0xffffffffb481568b float:-2.409109E-7 double:NaN;
        r9.value = r1;	 Catch:{ RuntimeException -> 0x0051 }
    L_0x0032:
        r10 = r10 + 1;
        goto L_0x0024;
    L_0x0035:
        r10 = r9.list;	 Catch:{ RuntimeException -> 0x0051 }
        r1 = 29042685; // 0x1bb27fd float:6.875033E-38 double:1.4348993E-316;
        r10 = r1 * r10;
        r1 = -1;
        if (r1 != r10) goto L_0x006c;
    L_0x003f:
        r10 = r9.count;	 Catch:{ RuntimeException -> 0x0051 }
        r1 = -1655214851; // 0xffffffff9d576cfd float:-2.8511359E-21 double:NaN;
        r10 = r1 * r10;
        if (r10 == 0) goto L_0x0049;
    L_0x0048:
        r0 = 1;
    L_0x0049:
        r1 = 1673096533; // 0x63b96d55 float:6.8410517E21 double:8.26619519E-315;
        r10 = r0 * r1;
        r9.list = r10;	 Catch:{ RuntimeException -> 0x0051 }
        return;
    L_0x0051:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = "ae.an(";
        r6 = r6.append(r7);
        r1 = 41;
        r6 = r6.append(r1);
        r4 = r6.toString();
        r8 = p000.StringBuilder.append(r5, r4);
        throw r8;
    L_0x006c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Transaction.parse(int):void");
    }

    void parse(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    add(logger, i, (byte) 86);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ae.aa(" + ')');
            }
        }
    }

    public boolean remove() {
        if (this.size != null) {
            for (int $i0 = 0; $i0 < this.size.length; $i0++) {
                if (-1 != this.size[$i0]) {
                    Transaction $r1 = BigInteger.get(this.size[$i0], 1487179977);
                    if ($r1.head * -1726757089 != -1 || $r1.next != null) {
                        return true;
                    }
                }
            }
        } else if (!(this.head * -1726757089 == -1 && this.next == null)) {
            return true;
        }
        return false;
    }

    void set() {
        byte $b0 = (byte) 0;
        if (this.value * -1193025245 == -1) {
            this.value = 0;
            if (this.length != null && (this.items == null || 10 == this.items[0])) {
                this.value = 1771379653;
            }
            for (int $i1 = 0; $i1 < 5; $i1++) {
                if (this.type[$i1] != null) {
                    this.value = -1266592117;
                }
            }
        }
        if (-1 == 29042685 * this.list) {
            if (1718551027 * this.count != 0) {
                $b0 = (byte) 1;
            }
            this.list = $b0 * 2004744451;
        }
    }

    public final ArrayMap toString(int i, int i2, int[][] iArr, int i3, int i4, int i5) {
        long $l6 = this.items == null ? (long) (((2085520429 * this.text) << 10) + i2) : (long) ((((this.text * -1416497173) << 10) + (i << 3)) + i2);
        ArrayMap $r5 = (ArrayMap) id.get($l6);
        if ($r5 == null) {
            ArrayMap $r6 = get(i, i2, (byte) 1);
            $r5 = $r6;
            if ($r6 == null) {
                return null;
            }
            if (this.f330p) {
                short s = (short) (-839972106 + (-549827343 * this.start));
                short $s8 = s;
                $r6.start = s;
                s = (this.status * 1852456887) - (short) -302;
                short s2 = s;
                s = (short) s;
                $s8 = s;
                $r6.pos = s;
                $r6.next();
            } else {
                $r5 = $r6.toString(-895991931 + (872603254 * this.start), (100102398 * this.status) + PingManager.ELEMENT, 1255808496, -10, -1603455991);
            }
            id.get($r5, $l6);
        }
        if (this.f330p) {
            $r5 = ((Table) $r5).run();
        }
        if (474665927 * this.f332x >= 0) {
            if ($r5 instanceof Integer) {
                return ((Integer) $r5).add(iArr, i3, i4, i5, true, -1483474115 * this.f332x);
            } else if ($r5 instanceof Table) {
                return ((Table) $r5).add(iArr, i3, i4, i5, true, this.f332x * -1089913614);
            }
        }
        return $r5;
    }

    public final Integer toString(int i, int i2, int[][] iArr, int i3, int i4, int i5, JSONArray jSONArray, int i6) {
        long $l7 = this.items == null ? (long) (((this.text * 2085520429) << 10) + i2) : (long) (((i << 3) + ((2085520429 * this.text) << 10)) + i2);
        Integer $r6 = (Integer) content.get($l7);
        if ($r6 == null) {
            Table $r7 = get(i, i2, (byte) 1);
            if ($r7 == null) {
                return null;
            }
            BitSet $r8 = $r7.toString((-549827343 * this.start) + 64, (1852456887 * this.status) + PingManager.ELEMENT, -50, -10, -50);
            $r6 = $r8;
            content.get($r8, $l7);
        }
        if (!(jSONArray == null && this.f332x * -1483474115 == -1)) {
            $r6 = jSONArray != null ? jSONArray.get($r6, i6, i2, (byte) 19) : $r6.getValue(true);
            if (this.f332x * -1483474115 >= 0) {
                return $r6.add(iArr, i3, i4, i5, false, this.f332x * -1483474115);
            }
        }
        return $r6;
    }

    public final Integer toString(int i, int i2, int[][] iArr, int i3, int i4, int i5, JSONArray jSONArray, int i6, int i7) {
        try {
            long $l7;
            int $i6;
            if (this.items == null) {
                $i6 = ((this.text * 2085520429) << 10) + i2;
                i7 = $i6;
                $l7 = (long) $i6;
            } else {
                $i6 = (i << 3) + ((2085520429 * this.text) << 10);
                i7 = $i6;
                $i6 += i2;
                i7 = $i6;
                $l7 = (long) $i6;
            }
            Integer $r6 = (Integer) content.get($l7);
            if ($r6 == null) {
                Table $r7 = get(i, i2, (byte) 1);
                if ($r7 == null) {
                    return null;
                }
                BitSet $r8 = $r7.toString((-549827343 * this.start) + 64, (1852456887 * this.status) + PingManager.ELEMENT, -50, -10, -50);
                $r6 = $r8;
                content.get($r8, $l7);
            }
            if (jSONArray == null) {
                if (this.f332x * -1483474115 == -1) {
                    return $r6;
                }
            }
            $r6 = jSONArray != null ? jSONArray.get($r6, i6, i2, (byte) 13) : $r6.getValue(true);
            return this.f332x * -1483474115 >= 0 ? $r6.add(iArr, i3, i4, i5, false, this.f332x * -1483474115) : $r6;
        } catch (RuntimeException $r9) {
            throw StringBuilder.append($r9, "ae.ae(" + ')');
        }
    }

    final Table toString(int $i0, int $i1) {
        int $i6;
        boolean $z0;
        Table $r5;
        Table table;
        int $i3;
        if (this.items != null) {
            $i3 = 0;
            while (true) {
                $i6 = this.items.length;
                if ($i3 >= $i6) {
                    break;
                } else if (this.items[$i3] == $i0) {
                    break;
                } else {
                    $i3++;
                }
            }
            $i3 = -1;
            if ($i3 == -1) {
                return null;
            }
            $i3 = this.length[$i3];
            $z0 = this.code ^ ($i1 > 3);
            if ($z0) {
                $i3 = PingManager.STATE_SENSOR_ON_FLAG + $i3;
            }
            $r5 = (Table) parent.get((long) $i3);
            if ($r5 == null) {
                Table $r3 = Table.get(data, 65535 & $i3, 0);
                $r5 = $r3;
                if ($r3 == null) {
                    return null;
                }
                if ($z0) {
                    $r3.getItem();
                }
                parent.get($r3, (long) $i3);
            }
        } else if ($i0 != 10) {
            return null;
        } else {
            if (this.length == null) {
                return null;
            }
            $z0 = this.code;
            if ($i0 == 2 && $i1 > 3) {
                $z0 = !$z0;
            }
            $i3 = this.length.length;
            $r5 = null;
            for (int $i62 = 0; $i62 < $i3; $i62++) {
                int i = this.length[$i62];
                if ($z0) {
                    i += PingManager.STATE_SENSOR_ON_FLAG;
                }
                $r5 = (Table) parent.get((long) i);
                if ($r5 == null) {
                    $r5 = Table.get(data, 65535 & i, 0);
                    if ($r5 == null) {
                        return null;
                    }
                    if ($z0) {
                        $r5.getItem();
                    }
                    parent.get($r5, (long) i);
                }
                if ($i3 > 1) {
                    map[$i62] = $r5;
                }
            }
            if ($i3 > 1) {
                table = new Table(map, $i3);
            }
        }
        $z0 = (Constants.f93X == this.log * 1174965903 && Constants.f93X == 2005993035 * this.lock && Constants.f93X == this.f328g * 481431275) ? false : true;
        boolean $z1 = (this.f331v * -2064324213 == 0 && this.f327c * 1628640203 == 0 && 1940325805 * this.first == 0) ? false : true;
        boolean z = ($i1 != 0 || $z0 || $z1) ? false : true;
        table = new Table($r5, z, this.key == null, this.values == null, true);
        if (4 == $i0 && $i1 > 3) {
            table.initialize(256);
            table.add(45, 0, -45);
        }
        $i0 = $i1 & 3;
        if (1 == $i0) {
            table.select();
        } else if (2 == $i0) {
            table.replace();
        } else if ($i0 == 3) {
            table.resolveDeltas();
        }
        if (this.key != null) {
            $i0 = 0;
            while (true) {
                $i6 = this.key;
                short[] $r4 = $i6;
                if ($i0 >= $i6.length) {
                    break;
                }
                table.get(this.key[$i0], this.item[$i0]);
                $i0++;
            }
        }
        if (this.values != null) {
            $i0 = 0;
            while (true) {
                $i6 = this.values;
                $r4 = $i6;
                if ($i0 >= $i6.length) {
                    break;
                }
                table.equals(this.values[$i0], this.keys[$i0]);
                $i0++;
            }
        }
        if ($z0) {
            table.trim(1174965903 * this.log, this.lock * 2005993035, 481431275 * this.f328g);
        }
        if (!$z1) {
            return table;
        }
        table.add(-2064324213 * this.f331v, 1628640203 * this.f327c, 1940325805 * this.first);
        return table;
    }

    void translate(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) 102);
            } else {
                return;
            }
        }
    }

    public final ArrayMap update(int i, int $i1, int[][] iArr, int i2, int i3, int i4) {
        long $l6 = this.items == null ? (long) (((-1601228262 * this.text) << 10) + $i1) : (long) ((((this.text * -782761080) << 10) + (i << 3)) + $i1);
        ArrayMap $r5 = (ArrayMap) id.get($l6);
        if ($r5 == null) {
            ArrayMap $r6 = get(i, $i1, (byte) 1);
            $r5 = $r6;
            if ($r6 == null) {
                return null;
            }
            if (this.f330p) {
                short s = (short) ((-549827343 * this.start) + 64);
                short $s7 = s;
                $r6.start = s;
                s = (this.status * 1206274112) - (short) -28817;
                short s2 = s;
                s = (short) s;
                $s7 = s;
                $r6.pos = s;
                $r6.next();
            } else {
                $r5 = $r6.toString((1839508530 * this.start) + 64, (1852456887 * this.status) + PingManager.ELEMENT, -597115105, 1932073772, -50);
            }
            id.get($r5, $l6);
        }
        if (this.f330p) {
            $r5 = ((Table) $r5).run();
        }
        if (814473364 * this.f332x >= 0) {
            if ($r5 instanceof Integer) {
                return ((Integer) $r5).add(iArr, i2, i3, i4, true, -1483474115 * this.f332x);
            } else if ($r5 instanceof Table) {
                return ((Table) $r5).add(iArr, i2, i3, i4, true, this.f332x * 1189329435);
            }
        }
        return $r5;
    }

    void verify(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) 46);
            } else {
                return;
            }
        }
    }

    public final boolean verify() {
        if (this.length == null) {
            return true;
        }
        boolean $z1 = true;
        for (int $i0 : this.length) {
            $z1 &= data.equals($i0 & 65535, 0, 1627885639);
        }
        return $z1;
    }

    public boolean writeObject() {
        if (this.size != null) {
            for (int $i0 = 0; $i0 < this.size.length; $i0++) {
                if (-1 != this.size[$i0]) {
                    Transaction $r1 = BigInteger.get(this.size[$i0], 2061979057);
                    if ($r1.head * -1726757089 != -1 || $r1.next != null) {
                        return true;
                    }
                }
            }
        } else if (!(this.head * -1726757089 == -1 && this.next == null)) {
            return true;
        }
        return false;
    }
}
