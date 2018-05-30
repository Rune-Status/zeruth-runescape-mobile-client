package p000;

import java.util.Collection;

/* compiled from: au */
public class Vector extends BitSet {
    static final int I1 = 9226041;
    static final int SC_RESET_CONTENT = 205;
    public static final int Theme_colorControlNormal = 85;
    static Class buffer;
    static Class f361c;
    static RuntimeException f362d = new RuntimeException(50, null);
    static RuntimeException f363g = new RuntimeException(64, null);
    static HttpRequest this$0;
    public int f364a;
    public int active;
    public int f365b;
    public int count;
    int[] current;
    Date data;
    int db;
    int flags;
    public String[] head;
    public int f366i;
    int id;
    public boolean index;
    short[] key;
    short[] length;
    public int log;
    public boolean max;
    public int min;
    int f367n;
    public int name;
    short[] next;
    public int out;
    int[] parent;
    public boolean pos;
    int position;
    public String root;
    public boolean f368s;
    public int size;
    public int state;
    public int[] type;
    public boolean value;
    short[] values;
    int f369x;
    public int f370y;

    Vector() {
        try {
            this.root = R$id.this$0;
            this.size = -819444463;
            this.name = 1535457643;
            this.min = 760021811;
            this.f366i = 1674466111;
            this.state = -645888559;
            this.out = -1992811087;
            this.log = 372117919;
            this.active = 669594021;
            this.head = new String[5];
            this.pos = true;
            this.count = -1619936881;
            this.id = 1432299392;
            this.position = 1206884992;
            this.f368s = false;
            this.f369x = 0;
            this.f367n = 0;
            this.f364a = 1216641433;
            this.f365b = 790692960;
            this.db = -754763457;
            this.flags = 1584637093;
            this.value = true;
            this.max = true;
            this.index = false;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "au.<init>(" + ')');
        }
    }

    public static Vector add(int i) {
        Vector $r2 = (Vector) f363g.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = f361c.get(9, i, -479714210);
        $r2 = new Vector();
        $r2.f370y = 1213021879 * i;
        if ($r4 != null) {
            $r2.get(new Logger($r4), 1188651807);
        }
        $r2.add((byte) -28);
        f363g.get($r2, (long) i);
        return $r2;
    }

    public static void add(Class classR, Class classR2) {
        f361c = classR;
        buffer = classR2;
    }

    public static void add(Collection collection) {
        collection.add(f363g);
        collection.add(f362d);
    }

    public static Vector get(int i) {
        Vector $r2 = (Vector) f363g.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = f361c.get(9, i, -1815756488);
        $r2 = new Vector();
        $r2.f370y = 1213021879 * i;
        if ($r4 != null) {
            $r2.get(new Logger($r4), 1188651807);
        }
        $r2.add((byte) -82);
        f363g.get($r2, (long) i);
        return $r2;
    }

    public static void init(Collection collection) {
        collection.add(f363g);
        collection.add(f362d);
    }

    public static Vector set(int i) {
        Vector $r2 = (Vector) f363g.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = f361c.get(9, i, -1203789121);
        $r2 = new Vector();
        $r2.f370y = -814593274 * i;
        if ($r4 != null) {
            $r2.get(new Logger($r4), 1188651807);
        }
        $r2.add((byte) -112);
        f363g.get($r2, (long) i);
        return $r2;
    }

    public static void set(Class classR, Class classR2) {
        f361c = classR;
        buffer = classR2;
    }

    public static void set(Collection collection) {
        collection.add(f363g);
        collection.add(f362d);
    }

    public static boolean set(byte b) {
        return client.name != null;
    }

    public static final Iterator toString(int i, int i2, int i3, byte b) {
        try {
            return client.map[i][i2][i3];
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "au.ek(" + ')');
        }
    }

    public static void toString(Collection collection) {
        collection.add(f363g);
        collection.add(f362d);
    }

    public static Vector write(int i) {
        Vector $r2 = (Vector) f363g.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = f361c.get(9, i, 280140285);
        $r2 = new Vector();
        $r2.f370y = -487111642 * i;
        if ($r4 != null) {
            $r2.get(new Logger($r4), 1188651807);
        }
        $r2.add((byte) -6);
        f363g.get($r2, (long) i);
        return $r2;
    }

    public int add(int $i0, int i, byte b) {
        try {
            return CompositeInlineMap.add(this.data, $i0, i, 52876256);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "au.ae(" + ')');
        }
    }

    public final Integer add(JSONArray jSONArray, int i, JSONArray jSONArray2, int i2) {
        int $i2 = 0;
        if (this.type != null) {
            this = getType(2125288365);
            return this == null ? null : toString(jSONArray, i, jSONArray2, i2, 728624548);
        } else {
            Integer $r5;
            Integer $r4 = (Integer) f362d.get((long) (602799879 * this.f370y));
            if ($r4 == null) {
                int $i5;
                int $i3 = 0;
                Object obj = null;
                while (true) {
                    $i5 = this.parent.length;
                    if ($i3 >= $i5) {
                        break;
                    }
                    if (!buffer.equals(this.parent[$i3], 0, 2038426213)) {
                        obj = 1;
                    }
                    $i3++;
                }
                if (obj != null) {
                    return null;
                }
                Table[] $r11 = new Table[this.parent.length];
                $i3 = 0;
                while (true) {
                    $i5 = this.parent.length;
                    if ($i3 >= $i5) {
                        break;
                    }
                    $r11[$i3] = Table.get(buffer, this.parent[$i3], 0);
                    $i3++;
                }
                Table $r7 = $r11.length == 1 ? $r11[0] : new Table($r11, $r11.length);
                if (this.key != null) {
                    $i3 = 0;
                    while (true) {
                        $i5 = this.key;
                        short[] $r8 = $i5;
                        $i5 = $i5.length;
                        if ($i3 >= $i5) {
                            break;
                        }
                        $r7.get(this.key[$i3], this.values[$i3]);
                        $i3++;
                    }
                }
                if (this.next != null) {
                    while (true) {
                        short[] $r82 = this.next;
                        if ($i2 >= $r82.length) {
                            break;
                        }
                        $r7.equals(this.next[$i2], this.length[$i2]);
                        $i2++;
                    }
                }
                $r4 = $r7.toString((this.f369x * 1053858635) + 64, (691568963 * this.f367n) + 850, -30, -50, -30);
                $r5 = $r4;
                f362d.get($r4, (long) (this.f370y * 602799879));
            } else {
                $r5 = $r4;
            }
            $r4 = (jSONArray == null || jSONArray2 == null) ? jSONArray != null ? jSONArray.add($r5, i, (byte) 38) : jSONArray2 != null ? jSONArray2.add($r5, i2, (byte) 94) : $r5.getValue(true) : jSONArray.get($r5, i, jSONArray2, i2, -1902711847);
            if (this.id * 266836143 == Constants.f93X && this.position * 470334237 == Constants.f93X) {
                return $r4;
            }
            $r4.add(this.id * 266836143, this.position * 470334237, this.id * 266836143);
            return $r4;
        }
    }

    public final Table add() {
        if (this.type != null) {
            this = getType(2125288365);
            return this == null ? null : toString(-276425418);
        } else if (this.current == null) {
            return null;
        } else {
            int $i1;
            boolean $z1 = false;
            for (int $i2 : this.current) {
                if (!buffer.equals($i2, 0, 1852099156)) {
                    $z1 = true;
                }
            }
            if ($z1) {
                return null;
            }
            Table[] $r5 = new Table[this.current.length];
            for ($i1 = 0; $i1 < this.current.length; $i1++) {
                $r5[$i1] = Table.get(buffer, this.current[$i1], 0);
            }
            Table $r2 = 1 == $r5.length ? $r5[0] : new Table($r5, $r5.length);
            if (this.key != null) {
                for ($i1 = 0; $i1 < this.key.length; $i1++) {
                    $r2.get(this.key[$i1], this.values[$i1]);
                }
            }
            if (this.next != null) {
                for (int $i0 = 0; $i0 < this.next.length; $i0++) {
                    $r2.equals(this.next[$i0], this.length[$i0]);
                }
            }
            return $r2;
        }
    }

    void add(byte b) {
    }

    void add(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            $i0 = logger.get((byte) 0);
            this.parent = new int[$i0];
            while ($i1 < $i0) {
                this.parent[$i1] = logger.get(624769580);
                $i1++;
            }
        } else if ($i0 == 2) {
            this.root = logger.toString(613853411);
        } else if (12 == $i0) {
            $i0 = logger.get((byte) 0) * -819444463;
            $i0 = $i0;
            this.size = $i0;
        } else if ($i0 == 13) {
            $i0 = logger.get(50646473) * -1535457643;
            $i0 = $i0;
            this.name = $i0;
        } else if (14 == $i0) {
            $i0 = logger.get(1100319004) * 466721556;
            $i0 = $i0;
            this.state = $i0;
        } else if ($i0 == 15) {
            $i0 = logger.get(1919253169) * 576780293;
            $i0 = $i0;
            this.min = $i0;
        } else if ($i0 == 16) {
            $i0 = logger.get(2008668382) * 1367033719;
            $i0 = $i0;
            this.f366i = $i0;
        } else if ($i0 == 17) {
            $i0 = logger.get(-1157429745) * 645888559;
            $i0 = $i0;
            this.state = $i0;
            $i0 = logger.get(-533371395) * -1836467412;
            $i0 = $i0;
            this.out = $i0;
            $i0 = logger.get(1115474016) * -372117919;
            $i0 = $i0;
            this.log = $i0;
            $i0 = logger.get(1919831753) * 1330331649;
            $i0 = $i0;
            this.active = $i0;
        } else if ($i0 >= 30 && $i0 < 35) {
            this.head[$i0 - 30] = logger.toString(680388328);
            if (this.head[$i0 - 30].equalsIgnoreCase(R$id.names)) {
                this.head[$i0 - 30] = null;
            }
        } else if (-901777140 == $i0) {
            $i0 = logger.get((byte) 0);
            this.key = new short[$i0];
            this.values = new short[$i0];
            while ($i1 < $i0) {
                this.key[$i1] = (short) logger.get(-1083556794);
                this.values[$i1] = (short) logger.get(-1337569697);
                $i1++;
            }
        } else if ($i0 == 41) {
            $i0 = logger.get((byte) 0);
            this.next = new short[$i0];
            this.length = new short[$i0];
            while ($i1 < $i0) {
                this.next[$i1] = (short) logger.get(1268144160);
                this.length[$i1] = (short) logger.get(1207048385);
                $i1++;
            }
        } else if (60 == $i0) {
            $i0 = logger.get((byte) 0);
            this.current = new int[$i0];
            while ($i1 < $i0) {
                this.current[$i1] = logger.get(-185798507);
                $i1++;
            }
        } else if (-139504163 == $i0) {
            this.pos = false;
        } else if (95 == $i0) {
            $i0 = logger.get(19949535) * 1619936881;
            $i0 = $i0;
            this.count = $i0;
        } else if ($i0 == -1141807570) {
            $i0 = logger.get(1435612196) * 816496207;
            $i0 = $i0;
            this.id = $i0;
        } else if ($i0 == -2129966120) {
            $i0 = logger.get(-1702180438) * -1164976331;
            $i0 = $i0;
            this.position = $i0;
        } else if (1145687488 == $i0) {
            this.f368s = true;
        } else if (100 == $i0) {
            this.f369x = logger.next(1247983979) * 2103629615;
        } else if ($i0 == MediaFile.FILE_TYPE_HTML) {
            this.f367n = logger.next(1247983979) * -1364671192;
        } else if (-1336488157 == $i0) {
            $i0 = logger.get(1635864502) * -1216641433;
            $i0 = $i0;
            this.f364a = $i0;
        } else if ($i0 == 475147007) {
            $i0 = logger.get(1641758504) * -194823042;
            $i0 = $i0;
            this.f365b = $i0;
        } else if ($i0 == -2128378475 || $i0 == -595223092) {
            int $i2;
            this.db = logger.get(328617004) * 754763457;
            if (this.db * -993251037 == 65535) {
                this.db = 411507604;
            }
            this.flags = logger.get(-1309492102) * -2092664165;
            if (this.flags * -1372300077 == 1493173950) {
                this.flags = 1007422677;
            }
            if ($i0 == -303417386) {
                $i2 = logger.get(-1110166288);
                $i0 = $i2;
                if ($i2 == 631590687) {
                    $i0 = -1;
                }
            } else {
                $i0 = -1;
            }
            $i2 = logger.get((byte) 0);
            this.type = new int[($i2 + 2)];
            while ($i1 <= $i2) {
                this.type[$i1] = logger.get(-2031248904);
                if (this.type[$i1] == 65535) {
                    this.type[$i1] = -1;
                }
                $i1++;
            }
            this.type[$i2 + 1] = $i0;
        } else if (1358708627 == $i0) {
            this.value = false;
        } else if ($i0 == 109) {
            this.max = false;
        } else if (1533666047 == $i0) {
            this.index = true;
        } else if ($i0 == 307422709) {
            this.data = IllegalStateException.add(logger, this.data, (byte) -7);
        }
    }

    void check(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, 1938758352);
            } else {
                return;
            }
        }
    }

    public final Vector copy() {
        int $i0 = -1 != this.db * -255538879 ? IOException.toString(this.db * -255538879, 998830794) : this.flags * -1372300077 != -1 ? Event.this$0[this.flags * -1372300077] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.type.length - 1) ? this.type[this.type.length - 1] : this.type[$i0];
        return -1 != $i0 ? Thread.add($i0, (byte) 8) : null;
    }

    void debug() {
    }

    public final Vector doInBackground() {
        int $i0 = -1 != this.db * -255538879 ? IOException.toString(this.db * 622427241, 998830794) : this.flags * -1372300077 != -1 ? Event.this$0[this.flags * -1372300077] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.type.length - 1) ? this.type[this.type.length - 1] : this.type[$i0];
        return -1 != $i0 ? Thread.add($i0, (byte) 106) : null;
    }

    public final Table equals() {
        if (this.type != null) {
            this = getType(2125288365);
            return this == null ? null : toString(1057324872);
        } else if (this.current == null) {
            return null;
        } else {
            int $i1;
            boolean $z0 = false;
            for (int $i2 : this.current) {
                if (!buffer.equals($i2, 0, 2057509396)) {
                    $z0 = true;
                }
            }
            if ($z0) {
                return null;
            }
            Table[] $r5 = new Table[this.current.length];
            for ($i1 = 0; $i1 < this.current.length; $i1++) {
                $r5[$i1] = Table.get(buffer, this.current[$i1], 0);
            }
            Table $r2 = 1 == $r5.length ? $r5[0] : new Table($r5, $r5.length);
            if (this.key != null) {
                for ($i1 = 0; $i1 < this.key.length; $i1++) {
                    $r2.get(this.key[$i1], this.values[$i1]);
                }
            }
            if (this.next != null) {
                for (int $i0 = 0; $i0 < this.next.length; $i0++) {
                    $r2.equals(this.next[$i0], this.length[$i0]);
                }
            }
            return $r2;
        }
    }

    public String get(int i, String $r1) {
        return Block.toString(this.data, i, $r1, (byte) 12);
    }

    void get(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    init(logger, i, 1427134533);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "au.aa(" + ')');
            }
        }
    }

    public boolean get(byte b) {
        boolean $z0 = false;
        try {
            if (this.type == null) {
                return true;
            }
            int $i1 = -1 != this.db * -255538879 ? IOException.toString(this.db * -255538879, 998830794) : -1 != this.flags * -1372300077 ? Event.this$0[this.flags * -1372300077] : -1;
            if ($i1 >= 0) {
                if ($i1 < this.type.length) {
                    if (this.type[$i1] != -1) {
                        $z0 = true;
                    }
                    return $z0;
                }
            }
            return -1 != this.type[this.type.length + -1];
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "au.aj(" + ')');
        }
    }

    public final Vector getType(int i) {
        try {
            i = -1 != this.db * -255538879 ? IOException.toString(this.db * -255538879, 998830794) : this.flags * -1372300077 != -1 ? Event.this$0[this.flags * -1372300077] : -1;
            if (i >= 0) {
                if (i < this.type.length - 1) {
                    i = this.type[i];
                    return -1 == i ? Thread.add(i, (byte) 64) : null;
                }
            }
            i = this.type[this.type.length - 1];
            if (-1 == i) {
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "au.ar(" + ')');
        }
    }

    public final Vector init() {
        int $i0 = -1 != this.db * 1251768918 ? IOException.toString(this.db * -255538879, 998830794) : this.flags * -1372300077 != -1 ? Event.this$0[this.flags * -1372300077] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.type.length - 1) ? this.type[this.type.length - 1] : this.type[$i0];
        return -1 != $i0 ? Thread.add($i0, (byte) 43) : null;
    }

    void init(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, 1154089217);
            } else {
                return;
            }
        }
    }

    void init(Logger logger, int i) {
        int $i1 = 0;
        if (1 == i) {
            i = logger.get((byte) 0);
            this.parent = new int[i];
            while ($i1 < i) {
                this.parent[$i1] = logger.get(-764110969);
                $i1++;
            }
        } else if (i == 2) {
            this.root = logger.toString(1459691867);
        } else if (12 == i) {
            $i0 = logger.get((byte) 0) * 1644536739;
            i = $i0;
            this.size = $i0;
        } else if (i == 13) {
            $i0 = logger.get(-1937504714) * -1535457643;
            i = $i0;
            this.name = $i0;
        } else if (14 == i) {
            $i0 = logger.get(-312841187) * 1343561903;
            i = $i0;
            this.state = $i0;
        } else if (i == 15) {
            $i0 = logger.get(-160069349) * -760021811;
            i = $i0;
            this.min = $i0;
        } else if (i == 16) {
            $i0 = logger.get(826898200) * -1674466111;
            i = $i0;
            this.f366i = $i0;
        } else if (i == 17) {
            $i0 = logger.get(-1139824656) * 1191795671;
            i = $i0;
            this.state = $i0;
            $i0 = logger.get(-1165479003) * 1992811087;
            i = $i0;
            this.out = $i0;
            $i0 = logger.get(633387630) * -372117919;
            i = $i0;
            this.log = $i0;
            $i0 = logger.get(-1838426291) * 1952951148;
            i = $i0;
            this.active = $i0;
        } else if (i >= 30 && i < 1075277719) {
            this.head[i - 30] = logger.toString(1115893327);
            if (this.head[i - 30].equalsIgnoreCase(R$id.names)) {
                this.head[i - 30] = null;
            }
        } else if (2096841440 == i) {
            i = logger.get((byte) 0);
            this.key = new short[i];
            this.values = new short[i];
            while ($i1 < i) {
                this.key[$i1] = (short) logger.get(-1079443250);
                this.values[$i1] = (short) logger.get(1572273793);
                $i1++;
            }
        } else if (i == 2036224397) {
            i = logger.get((byte) 0);
            this.next = new short[i];
            this.length = new short[i];
            for ($i1 = 0; $i1 < i; $i1++) {
                this.next[$i1] = (short) logger.get(-2027091236);
                this.length[$i1] = (short) logger.get(-1414753752);
            }
        } else if (60 == i) {
            i = logger.get((byte) 0);
            this.current = new int[i];
            while ($i1 < i) {
                this.current[$i1] = logger.get(1823309828);
                $i1++;
            }
        } else if (93 == i) {
            this.pos = false;
        } else if (-1165248730 == i) {
            $i0 = logger.get(-1639877065) * 1619936881;
            i = $i0;
            this.count = $i0;
        } else if (i == 860511735) {
            $i0 = logger.get(-155625373) * 1543837248;
            i = $i0;
            this.id = $i0;
        } else if (i == 463983279) {
            $i0 = logger.get(1978700090) * -1164976331;
            i = $i0;
            this.position = $i0;
        } else if (99 == i) {
            this.f368s = true;
        } else if (-804059972 == i) {
            this.f369x = logger.next(1247983979) * -1287481757;
        } else if (i == MediaFile.FILE_TYPE_HTML) {
            this.f367n = logger.next(1247983979) * -1743875155;
        } else if (-112023715 == i) {
            $i0 = logger.get(-95381801) * -1085151248;
            i = $i0;
            this.f364a = $i0;
        } else if (i == 103) {
            $i0 = logger.get(-966935325) * -1451685853;
            i = $i0;
            this.f365b = $i0;
        } else if (i == -938177511 || i == -6083215) {
            int $i2;
            this.db = logger.get(85890063) * 754763457;
            if (this.db * 1283084233 == -2132386633) {
                this.db = 628158601;
            }
            this.flags = logger.get(-1255329886) * -1584637093;
            if (this.flags * -1556018223 == -1664149807) {
                this.flags = 1584637093;
            }
            if (i == 1777107390) {
                $i2 = logger.get(1676929692);
                i = $i2;
                if ($i2 == 65535) {
                    i = -1;
                }
            } else {
                i = -1;
            }
            $i2 = logger.get((byte) 0);
            this.type = new int[($i2 + 2)];
            while ($i1 <= $i2) {
                this.type[$i1] = logger.get(725479212);
                if (this.type[$i1] == -1006901389) {
                    this.type[$i1] = -1;
                }
                $i1++;
            }
            this.type[$i2 + 1] = i;
        } else if (107 == i) {
            this.value = false;
        } else if (i == 109) {
            this.max = false;
        } else if (111 == i) {
            this.index = true;
        } else if (i == 249) {
            this.data = IllegalStateException.add(logger, this.data, (byte) -77);
        }
    }

    void init(Logger logger, int $i0, int i) {
        int $i2 = -1;
        i = 0;
        if (1 == $i0) {
            try {
                $i0 = logger.get((byte) 0);
                this.parent = new int[$i0];
                while (i < $i0) {
                    this.parent[i] = logger.get(-695157023);
                    i++;
                }
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "au.ag(" + ')');
            }
        } else if ($i0 == 2) {
            this.root = logger.toString(533090426);
        } else if (12 == $i0) {
            $i0 = logger.get((byte) 0) * -819444463;
            $i0 = $i0;
            this.size = $i0;
        } else if ($i0 == 13) {
            $i0 = logger.get(26842384) * -1535457643;
            $i0 = $i0;
            this.name = $i0;
        } else if (14 == $i0) {
            $i0 = logger.get(-1783112089) * 645888559;
            $i0 = $i0;
            this.state = $i0;
        } else if ($i0 == 15) {
            $i0 = logger.get(-1785161641) * -760021811;
            $i0 = $i0;
            this.min = $i0;
        } else if ($i0 == 16) {
            $i0 = logger.get(-1506557097) * -1674466111;
            $i0 = $i0;
            this.f366i = $i0;
        } else if ($i0 == 17) {
            $i0 = logger.get(821695297) * 645888559;
            $i0 = $i0;
            this.state = $i0;
            $i0 = logger.get(1382382113) * 1992811087;
            $i0 = $i0;
            this.out = $i0;
            $i0 = logger.get(991853361) * -372117919;
            $i0 = $i0;
            this.log = $i0;
            $i0 = logger.get(-1116144485) * -669594021;
            $i0 = $i0;
            this.active = $i0;
        } else if ($i0 >= 30 && $i0 < 35) {
            this.head[$i0 - 30] = logger.toString(842792041);
            if (this.head[$i0 - 30].equalsIgnoreCase(R$id.names)) {
                this.head[$i0 - 30] = null;
            }
        } else if (40 == $i0) {
            $i0 = logger.get((byte) 0);
            this.key = new short[$i0];
            this.values = new short[$i0];
            while (i < $i0) {
                this.key[i] = (short) logger.get(-817381480);
                this.values[i] = (short) logger.get(1530527641);
                i++;
            }
        } else if ($i0 == 41) {
            $i0 = logger.get((byte) 0);
            this.next = new short[$i0];
            this.length = new short[$i0];
            while (i < $i0) {
                this.next[i] = (short) logger.get(-1997981171);
                this.length[i] = (short) logger.get(574490997);
                i++;
            }
        } else if (60 == $i0) {
            $i0 = logger.get((byte) 0);
            this.current = new int[$i0];
            while (i < $i0) {
                this.current[i] = logger.get(1909231442);
                i++;
            }
        } else if (93 == $i0) {
            this.pos = false;
        } else if (95 == $i0) {
            $i0 = logger.get(1338991010) * 1619936881;
            $i0 = $i0;
            this.count = $i0;
        } else if ($i0 == 97) {
            $i0 = logger.get(-1597402769) * 816496207;
            $i0 = $i0;
            this.id = $i0;
        } else if ($i0 == 98) {
            $i0 = logger.get(-1238537924) * -1164976331;
            $i0 = $i0;
            this.position = $i0;
        } else if (99 == $i0) {
            this.f368s = true;
        } else if (100 == $i0) {
            this.f369x = logger.next(1247983979) * -1287481757;
        } else if ($i0 == MediaFile.FILE_TYPE_HTML) {
            this.f367n = logger.next(1247983979) * -786013929;
        } else if (102 == $i0) {
            $i0 = logger.get(1268789947) * -1216641433;
            $i0 = $i0;
            this.f364a = $i0;
        } else if ($i0 == 103) {
            $i0 = logger.get(-126882662) * -1451685853;
            $i0 = $i0;
            this.f365b = $i0;
        } else if ($i0 == 106 || $i0 == 118) {
            $i0 = logger.get(241474029) * 754763457;
            int i2 = $i0;
            this.db = $i0;
            if (this.db * -255538879 == 65535) {
                this.db = -754763457;
            }
            $i0 = logger.get(-727450149) * -1584637093;
            i2 = $i0;
            this.flags = $i0;
            if (this.flags * -1372300077 == 65535) {
                this.flags = 1584637093;
            }
            if ($i0 == 118) {
                $i0 = logger.get(-1478596816);
                if ($i0 != 65535) {
                    $i2 = $i0;
                }
            }
            $i0 = logger.get((byte) 0);
            this.type = new int[($i0 + 2)];
            while (i <= $i0) {
                this.type[i] = logger.get(1167190133);
                if (this.type[i] == 65535) {
                    this.type[i] = -1;
                }
                i++;
            }
            this.type[$i0 + 1] = $i2;
        } else if (107 == $i0) {
            this.value = false;
        } else if ($i0 == 109) {
            this.max = false;
        } else if (111 == $i0) {
            this.index = true;
        } else if ($i0 == 249) {
            this.data = IllegalStateException.add(logger, this.data, (byte) -90);
        }
    }

    void initFrom() {
    }

    public boolean move() {
        if (this.type == null) {
            return true;
        }
        int $i0 = -1 != this.db * -255538879 ? IOException.toString(this.db * -255538879, 998830794) : -1 != this.flags * -1372300077 ? Event.this$0[125590653 * this.flags] : -1;
        if ($i0 < 0 || $i0 >= this.type.length) {
            if (-1 == this.type[this.type.length - 1]) {
                return false;
            }
        } else if (this.type[$i0] == -1) {
            return false;
        }
        return true;
    }

    public int multiply(int $i0, int i) {
        return CompositeInlineMap.add(this.data, $i0, i, 1627877270);
    }

    public String multiply(int i, String $r1) {
        return Block.toString(this.data, i, $r1, (byte) 12);
    }

    public final Vector next() {
        int $i0 = -1 != this.db * -255538879 ? IOException.toString(this.db * -255538879, 998830794) : 1184233100 * this.flags != -1 ? Event.this$0[this.flags * -1372300077] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.type.length - 1) ? this.type[this.type.length - 1] : this.type[$i0];
        return -1 != $i0 ? Thread.add($i0, (byte) 98) : null;
    }

    void normalize() {
    }

    public final Vector processBlock() {
        int $i0 = -1 != this.db * -255538879 ? IOException.toString(this.db * -1474115908, 998830794) : -1372300077 * this.flags != -1 ? Event.this$0[this.flags * 324948757] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.type.length - 1) ? this.type[this.type.length - 1] : this.type[$i0];
        return -1 != $i0 ? Thread.add($i0, (byte) 40) : null;
    }

    void put(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, 1266290714);
            } else {
                return;
            }
        }
    }

    public final Integer set(JSONArray jSONArray, int i, JSONArray jSONArray2, int i2) {
        int $i2 = 0;
        if (this.type != null) {
            this = getType(2125288365);
            return this == null ? null : toString(jSONArray, i, jSONArray2, i2, 499534469);
        } else {
            Integer $r11;
            Integer $r5 = (Integer) f362d.get((long) (this.f370y * 602799879));
            if ($r5 == null) {
                int $i3;
                boolean $z1 = false;
                for (int $i4 : this.parent) {
                    if (!buffer.equals($i4, 0, 1833935569)) {
                        $z1 = true;
                    }
                }
                if ($z1) {
                    return null;
                }
                Table $r7;
                short[] $r8;
                Table[] $r6 = new Table[this.parent.length];
                for ($i3 = 0; $i3 < this.parent.length; $i3++) {
                    $r6[$i3] = Table.get(buffer, this.parent[$i3], 0);
                }
                if ($r6.length == 1) {
                    $r7 = $r6[0];
                } else {
                    Table table = new Table($r6, $r6.length);
                }
                if (this.key != null) {
                    $i3 = 0;
                    while (true) {
                        $r8 = this.key;
                        if ($i3 >= $r8.length) {
                            break;
                        }
                        $r7.get(this.key[$i3], this.values[$i3]);
                        $i3++;
                    }
                }
                if (this.next != null) {
                    while (true) {
                        $r8 = this.next;
                        if ($i2 >= $r8.length) {
                            break;
                        }
                        $r7.equals(this.next[$i2], this.length[$i2]);
                        $i2++;
                    }
                }
                BitSet $r52 = $r7.toString((this.f369x * 1053858635) + 1951542269, (-1410880347 * this.f367n) + 67406448, -1630343724, 755439636, -30);
                $r11 = $r52;
                f362d.get($r52, (long) (this.f370y * 602799879));
            } else {
                $r11 = $r5;
            }
            $r5 = (jSONArray == null || jSONArray2 == null) ? jSONArray != null ? jSONArray.add($r11, i, (byte) 64) : jSONArray2 != null ? jSONArray2.add($r11, i2, (byte) 52) : $r11.getValue(true) : jSONArray.get($r11, i, jSONArray2, i2, 739269644);
            if (this.id * 266836143 == 635229430 && this.position * 470334237 == -792737494) {
                return $r5;
            }
            $r5.add(this.id * 266836143, this.position * -2121579320, this.id * 838207166);
            return $r5;
        }
    }

    public final Table set() {
        if (this.type != null) {
            this = getType(2125288365);
            return this == null ? null : toString(-318132800);
        } else if (this.current == null) {
            return null;
        } else {
            int $i1;
            boolean $z0 = false;
            for (int $i2 : this.current) {
                if (!buffer.equals($i2, 0, 2037790847)) {
                    $z0 = true;
                }
            }
            if ($z0) {
                return null;
            }
            Table[] $r2 = new Table[this.current.length];
            for ($i1 = 0; $i1 < this.current.length; $i1++) {
                $r2[$i1] = Table.get(buffer, this.current[$i1], 0);
            }
            Table $r4 = 1 == $r2.length ? $r2[0] : new Table($r2, $r2.length);
            if (this.key != null) {
                for ($i1 = 0; $i1 < this.key.length; $i1++) {
                    $r4.get(this.key[$i1], this.values[$i1]);
                }
            }
            if (this.next != null) {
                for (int $i0 = 0; $i0 < this.next.length; $i0++) {
                    $r4.equals(this.next[$i0], this.length[$i0]);
                }
            }
            return $r4;
        }
    }

    public int subtract(int $i0, int i) {
        return CompositeInlineMap.add(this.data, $i0, i, -1455701032);
    }

    public final Integer toString(JSONArray jSONArray, int i, JSONArray jSONArray2, int i2) {
        int $i2 = 0;
        if (this.type != null) {
            this = getType(2125288365);
            return this == null ? null : toString(jSONArray, i, jSONArray2, i2, 1172334284);
        } else {
            Integer $r5;
            Integer $r4 = (Integer) f362d.get((long) (602799879 * this.f370y));
            if ($r4 == null) {
                int $i5;
                int $i3 = 0;
                Object obj = null;
                while (true) {
                    $i5 = this.parent.length;
                    if ($i3 >= $i5) {
                        break;
                    }
                    if (!buffer.equals(this.parent[$i3], 0, 2113459541)) {
                        obj = 1;
                    }
                    $i3++;
                }
                if (obj != null) {
                    return null;
                }
                Table[] $r11 = new Table[this.parent.length];
                $i3 = 0;
                while (true) {
                    $i5 = this.parent.length;
                    if ($i3 >= $i5) {
                        break;
                    }
                    $r11[$i3] = Table.get(buffer, this.parent[$i3], 0);
                    $i3++;
                }
                Table $r9 = $r11.length == 1 ? $r11[0] : new Table($r11, $r11.length);
                if (this.key != null) {
                    $i3 = 0;
                    while (true) {
                        $i5 = this.key;
                        short[] $r10 = $i5;
                        $i5 = $i5.length;
                        if ($i3 >= $i5) {
                            break;
                        }
                        $r9.get(this.key[$i3], this.values[$i3]);
                        $i3++;
                    }
                }
                if (this.next != null) {
                    while (true) {
                        short[] $r102 = this.next;
                        if ($i2 >= $r102.length) {
                            break;
                        }
                        $r9.equals(this.next[$i2], this.length[$i2]);
                        $i2++;
                    }
                }
                $r4 = $r9.toString((this.f369x * 1053858635) + 64, (691568963 * this.f367n) + 850, -30, -50, -30);
                $r5 = $r4;
                f362d.get($r4, (long) (this.f370y * 602799879));
            } else {
                $r5 = $r4;
            }
            $r4 = (jSONArray == null || jSONArray2 == null) ? jSONArray != null ? jSONArray.add($r5, i, (byte) 47) : jSONArray2 != null ? jSONArray2.add($r5, i2, (byte) -27) : $r5.getValue(true) : jSONArray.get($r5, i, jSONArray2, i2, 154546822);
            if (this.id * 266836143 == Constants.f93X && this.position * 470334237 == Constants.f93X) {
                return $r4;
            }
            $r4.add(this.id * 266836143, this.position * 470334237, this.id * 266836143);
            return $r4;
        }
    }

    public final Integer toString(JSONArray jSONArray, int i, JSONArray jSONArray2, int i2, int i3) {
        i3 = 0;
        if (this.type != null) {
            this = getType(2125288365);
            return this == null ? null : toString(jSONArray, i, jSONArray2, i2, 1423964412);
        } else {
            Integer $r15;
            Integer $r7 = (Integer) f362d.get((long) (602799879 * this.f370y));
            if ($r7 == null) {
                int $i3 = 0;
                Object obj = null;
                while ($i3 < this.parent.length) {
                    try {
                        if (!buffer.equals(this.parent[$i3], 0, 1775492869)) {
                            obj = 1;
                        }
                        $i3++;
                    } catch (RuntimeException $r8) {
                        throw StringBuilder.append($r8, "au.ay(" + ')');
                    }
                }
                if (obj != null) {
                    return null;
                }
                short[] $r14;
                long $l5;
                Object obj2;
                Table[] $r4 = new Table[this.parent.length];
                for ($i3 = 0; $i3 < this.parent.length; $i3++) {
                    $r4[$i3] = Table.get(buffer, this.parent[$i3], 0);
                }
                Table $r6 = $r4.length == 1 ? $r4[0] : new Table($r4, $r4.length);
                if (this.key != null) {
                    $i3 = 0;
                    while (true) {
                        $r14 = this.key;
                        if ($i3 < $r14.length) {
                            $r6.get(this.key[$i3], this.values[$i3]);
                            $i3++;
                        }
                    }
                    if (this.next != null) {
                        while (true) {
                            $r14 = this.next;
                            if (i3 < $r14.length) {
                                $r6.equals(this.next[i3], this.length[i3]);
                                i3++;
                            }
                        }
                        $r7 = $r6.toString((this.f369x * 1053858635) + 64, (691568963 * this.f367n) + 850, -30, -50, -30);
                        $r15 = $r7;
                        $l5 = this.f370y * 602799879;
                        obj2 = $l5;
                        f362d.get($r7, (long) $l5);
                    }
                    $r7 = $r6.toString((this.f369x * 1053858635) + 64, (691568963 * this.f367n) + 850, -30, -50, -30);
                    $r15 = $r7;
                    $l5 = this.f370y * 602799879;
                    obj2 = $l5;
                    f362d.get($r7, (long) $l5);
                }
                if (this.next != null) {
                    while (true) {
                        $r14 = this.next;
                        if (i3 < $r14.length) {
                            $r6.equals(this.next[i3], this.length[i3]);
                            i3++;
                        }
                    }
                    $r7 = $r6.toString((this.f369x * 1053858635) + 64, (691568963 * this.f367n) + 850, -30, -50, -30);
                    $r15 = $r7;
                    $l5 = this.f370y * 602799879;
                    obj2 = $l5;
                    f362d.get($r7, (long) $l5);
                }
                $r7 = $r6.toString((this.f369x * 1053858635) + 64, (691568963 * this.f367n) + 850, -30, -50, -30);
                $r15 = $r7;
                $l5 = this.f370y * 602799879;
                obj2 = $l5;
                f362d.get($r7, (long) $l5);
            } else {
                $r15 = $r7;
            }
            $r7 = (jSONArray == null || jSONArray2 == null) ? jSONArray != null ? jSONArray.add($r15, i, (byte) -3) : jSONArray2 != null ? jSONArray2.add($r15, i2, (byte) 106) : $r15.getValue(true) : jSONArray.get($r15, i, jSONArray2, i2, -1210752013);
            if (this.id * 266836143 == Constants.f93X) {
                if (this.position * 470334237 == Constants.f93X) {
                    return $r7;
                }
            }
            $r7.add(this.id * 266836143, this.position * 470334237, this.id * 266836143);
            return $r7;
        }
    }

    public final Table toString(int i) {
        try {
            int[] $r1 = this.type;
            this = this;
            if ($r1 != null) {
                this = getType(2125288365);
                return this == null ? null : toString(1931512440);
            } else {
                $r1 = this.current;
                this = this;
                if ($r1 == null) {
                    return null;
                }
                int[] $r12;
                i = 0;
                boolean $z0 = false;
                while (true) {
                    $r12 = this;
                    this = $r12;
                    if (i >= $r12.current.length) {
                        break;
                    }
                    $r12 = this;
                    this = $r12;
                    if (!buffer.equals($r12.current[i], 0, 1899740625)) {
                        $z0 = true;
                    }
                    i++;
                }
                if ($z0) {
                    return null;
                }
                Table $r2;
                Vector vector = this;
                this = vector;
                int $i0 = vector.current.length;
                Table[] $r5 = new Table[$i0];
                i = 0;
                while (true) {
                    $r12 = this;
                    this = $r12;
                    if (i >= $r12.current.length) {
                        break;
                    }
                    $r12 = this;
                    this = $r12;
                    $r5[i] = Table.get(buffer, $r12.current[i], 0);
                    i++;
                }
                if (1 == $r5.length) {
                    $r2 = $r5[0];
                } else {
                    $i0 = $r5.length;
                    $r2 = new Table($r5, $i0);
                }
                if (this.key != null) {
                    int $i3 = 0;
                    while (true) {
                        $i0 = this.key.length;
                        if ($i3 < $i0) {
                            $r2.get(this.key[$i3], this.values[$i3]);
                            $i3++;
                        }
                    }
                    if (this.next != null) {
                        for (i = 0; i < this.next.length; i++) {
                            $r2.equals(this.next[i], this.length[i]);
                        }
                    }
                    return $r2;
                }
                if (this.next != null) {
                    for (i = 0; i < this.next.length; i++) {
                        $r2.equals(this.next[i], this.length[i]);
                    }
                }
                return $r2;
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "au.as(" + ')');
        }
    }

    public String toString(int i, String $r1) {
        return Block.toString(this.data, i, $r1, (byte) 12);
    }

    public String toString(int i, String $r1, int i2) {
        try {
            return Block.toString(this.data, i, $r1, (byte) 12);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "au.aq(" + ')');
        }
    }

    void updated() {
    }

    public boolean write() {
        if (this.type == null) {
            return true;
        }
        int $i0 = -1 != -520483304 * this.db ? IOException.toString(this.db * -255538879, 998830794) : -1 != this.flags * -1334498026 ? Event.this$0[-1372300077 * this.flags] : -1;
        if ($i0 < 0 || $i0 >= this.type.length) {
            if (-1 == this.type[this.type.length - 1]) {
                return false;
            }
        } else if (this.type[$i0] == -1) {
            return false;
        }
        return true;
    }
}
