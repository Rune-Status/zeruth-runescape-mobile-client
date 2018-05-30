package p000;

import java.util.Collection;

/* compiled from: ab */
public class TIntArrayList extends BitSet {
    static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int Theme_alertDialogCenterButtons = 91;
    public static int buffer;
    static List count;
    static Class index;
    static RuntimeException items = new RuntimeException(64, null);
    static Class length;
    short[] f302a;
    short[] f303b;
    short[] f304c;
    short[] f305e;
    public int header;
    int[] f306i;
    public boolean f307s;
    int[] type;

    TIntArrayList() {
        try {
            this.header = 912079519;
            this.type = new int[]{-1, -1, -1, -1, -1};
            this.f307s = false;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ab.<init>(" + ')');
        }
    }

    public static TIntArrayList add(int i) {
        TIntArrayList $r2 = (TIntArrayList) items.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = index.get(3, i, -1395035541);
        $r2 = new TIntArrayList();
        if ($r4 != null) {
            $r2.add(new Logger($r4), 1800935353);
        }
        items.get($r2, (long) i);
        return $r2;
    }

    public static void add(Class classR, Class classR2) {
        index = classR;
        length = classR2;
        buffer = index.add(3, -1259483291) * 533815797;
    }

    static final void add(String str, byte b) {
        try {
            if (!str.equals("")) {
                Config $r4 = Logger.add(R$string.this$0, client.this$0.key, (byte) -2);
                $r4.this$0.append(Record.toString(str, -1603034346), (byte) 31);
                $r4.this$0.add(str, (byte) 9);
                client.this$0.add($r4, (short) 255);
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ab.ft(" + ')');
        }
    }

    static void append(String str, String str2, String str3, byte b) {
        Contact.id = str;
        Contact.last = str2;
        Contact.f98e = str3;
    }

    public static void insert(Class classR, Class classR2) {
        index = classR;
        length = classR2;
        buffer = index.add(3, -829038940) * 533815797;
    }

    public static void insert(Collection collection) {
        collection.add(items);
    }

    public static void read(int $i0, Class classR, String str, String str2, int $i1, boolean z, int i) {
        try {
            int $i3 = classR.get(str, 158664448);
            i = classR.get($i3, str2, -473661119);
            MultiInputStream.index = 63807465;
            ParserHelper.index = classR;
            DirCache.value = $i3 * -1919717083;
            MultiInputStream.value = -2021257265 * i;
            FieldInfo.index = -1734207119 * $i1;
            Time.index = z;
            AssertionError.name = 1758792857 * $i0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ab.aa(" + ')');
        }
    }

    public static void reset(Class classR, Class classR2) {
        index = classR;
        length = classR2;
        buffer = index.add(3, -1192384688) * 533815797;
    }

    public static void set(Class classR, Class classR2) {
        index = classR;
        length = classR2;
        buffer = index.add(3, -1000115498) * 533815797;
    }

    public static void set(Collection collection) {
        collection.add(items);
    }

    public static void sort(Collection collection) {
        collection.add(items);
    }

    public static void toArray(Collection collection) {
        collection.add(items);
    }

    public Table m50a() {
        Table[] $r2 = new Table[5];
        int $i1 = 0;
        int $i2 = 0;
        while ($i1 < 5) {
            int $i3;
            if (-1 != this.type[$i1]) {
                $i3 = $i2 + 1;
                $r2[$i2] = Table.get(length, this.type[$i1], 0);
            } else {
                $i3 = $i2;
            }
            $i1++;
            $i2 = $i3;
        }
        Table $r1 = new Table($r2, $i2);
        if (this.f305e != null) {
            for ($i2 = 0; $i2 < this.f305e.length; $i2++) {
                $r1.get(this.f305e[$i2], this.f302a[$i2]);
            }
        }
        if (this.f303b == null) {
            return $r1;
        }
        for (int $i0 = 0; $i0 < this.f303b.length; $i0++) {
            $r1.equals(this.f303b[$i0], this.f304c[$i0]);
        }
        return $r1;
    }

    public Table m51a(int i) {
        try {
            Table[] $r1 = new Table[5];
            i = 0;
            int $i1 = 0;
            while (i < 5) {
                int $i2;
                if (-1 != this.type[i]) {
                    $i2 = $i1 + 1;
                    $r1[$i1] = Table.get(length, this.type[i], 0);
                } else {
                    $i2 = $i1;
                }
                i++;
                $i1 = $i2;
            }
            Table $r4 = new Table($r1, $i1);
            if (this.f305e != null) {
                for (i = 0; i < this.f305e.length; i++) {
                    $r4.get(this.f305e[i], this.f302a[i]);
                }
            }
            if (this.f303b != null) {
                for (i = 0; i < this.f303b.length; i++) {
                    $r4.equals(this.f303b[i], this.f304c[i]);
                }
            }
            return $r4;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ab.ar(" + ')');
        }
    }

    void m52a(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.header = logger.get((byte) 0) * -912079519;
            return;
        }
        if ($i0 == 2) {
            $i0 = logger.get((byte) 0);
            this.f306i = new int[$i0];
            while ($i1 < $i0) {
                this.f306i[$i1] = logger.get(585649446);
                $i1++;
            }
        } else if (3 == $i0) {
            this.f307s = true;
        } else if (40 == $i0) {
            $i0 = logger.get((byte) 0);
            this.f305e = new short[$i0];
            this.f302a = new short[$i0];
            while ($i1 < $i0) {
                this.f305e[$i1] = (short) logger.get(-977409495);
                this.f302a[$i1] = (short) logger.get(-578126278);
                $i1++;
            }
        } else if (41 == $i0) {
            $i0 = logger.get((byte) 0);
            this.f303b = new short[$i0];
            this.f304c = new short[$i0];
            while ($i1 < $i0) {
                this.f303b[$i1] = (short) logger.get(-1400874264);
                this.f304c[$i1] = (short) logger.get(1348351344);
                $i1++;
            }
        } else if ($i0 >= 60 && $i0 < 70) {
            this.type[$i0 - 60] = logger.get(-1667070234);
        }
    }

    void m53a(Logger logger, int $i0, int i) {
        i = 0;
        if (1 == $i0) {
            try {
                this.header = logger.get((byte) 0) * -912079519;
                return;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ab.aa(" + ')');
            }
        }
        if ($i0 == 2) {
            $i0 = logger.get((byte) 0);
            this.f306i = new int[$i0];
            while (i < $i0) {
                this.f306i[i] = logger.get(692996665);
                i++;
            }
        } else if (3 == $i0) {
            this.f307s = true;
        } else if (40 == $i0) {
            $i0 = logger.get((byte) 0);
            this.f305e = new short[$i0];
            this.f302a = new short[$i0];
            while (i < $i0) {
                this.f305e[i] = (short) logger.get(-1399544559);
                this.f302a[i] = (short) logger.get(-1235845989);
                i++;
            }
        } else if (41 == $i0) {
            $i0 = logger.get((byte) 0);
            this.f303b = new short[$i0];
            this.f304c = new short[$i0];
            while (i < $i0) {
                this.f303b[i] = (short) logger.get(1438859273);
                this.f304c[i] = (short) logger.get(-1183363689);
                i++;
            }
        } else if ($i0 >= 60 && $i0 < 70) {
            this.type[$i0 - 60] = logger.get(-822520828);
        }
    }

    void add(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                m53a(logger, $i0, -1902121153);
            } else {
                return;
            }
        }
    }

    void add(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    m53a(logger, i, -1676335111);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ab.an(" + ')');
            }
        }
    }

    public boolean add() {
        boolean $z1 = true;
        int $i0 = 0;
        while ($i0 < 5) {
            if (!(this.type[$i0] == -1 || length.equals(this.type[$i0], 0, 1818693545))) {
                $z1 = false;
            }
            $i0++;
        }
        return $z1;
    }

    public Table m54b() {
        if (this.f306i == null) {
            return null;
        }
        int $i2;
        Table[] $r5 = new Table[this.f306i.length];
        for ($i2 = 0; $i2 < this.f306i.length; $i2++) {
            $r5[$i2] = Table.get(length, this.f306i[$i2], 0);
        }
        Table $r1 = $r5.length == 1 ? $r5[0] : new Table($r5, $r5.length);
        if (this.f305e != null) {
            for ($i2 = 0; $i2 < this.f305e.length; $i2++) {
                $r1.get(this.f305e[$i2], this.f302a[$i2]);
            }
        }
        if (this.f303b != null) {
            for (int $i0 = 0; $i0 < this.f303b.length; $i0++) {
                $r1.equals(this.f303b[$i0], this.f304c[$i0]);
            }
        }
        return $r1;
    }

    void m55b(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.header = logger.get((byte) 0) * -912079519;
            return;
        }
        if ($i0 == 2) {
            $i0 = logger.get((byte) 0);
            this.f306i = new int[$i0];
            while ($i1 < $i0) {
                this.f306i[$i1] = logger.get(-2076244162);
                $i1++;
            }
        } else if (3 == $i0) {
            this.f307s = true;
        } else if (40 == $i0) {
            $i0 = logger.get((byte) 0);
            this.f305e = new short[$i0];
            this.f302a = new short[$i0];
            while ($i1 < $i0) {
                this.f305e[$i1] = (short) logger.get(158521908);
                this.f302a[$i1] = (short) logger.get(-1562785494);
                $i1++;
            }
        } else if (41 == $i0) {
            $i0 = logger.get((byte) 0);
            this.f303b = new short[$i0];
            this.f304c = new short[$i0];
            while ($i1 < $i0) {
                this.f303b[$i1] = (short) logger.get(272498066);
                this.f304c[$i1] = (short) logger.get(245419041);
                $i1++;
            }
        } else if ($i0 >= 60 && $i0 < -1439341010) {
            this.type[$i0 - 1064022995] = logger.get(-2072336333);
        }
    }

    void clear(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                m53a(logger, $i0, -1575336298);
            } else {
                return;
            }
        }
    }

    public boolean contains() {
        boolean $z1 = true;
        int $i0 = 0;
        while ($i0 < 5) {
            if (!(this.type[$i0] == -1 || length.equals(this.type[$i0], 0, 1639399047))) {
                $z1 = false;
            }
            $i0++;
        }
        return $z1;
    }

    public Table doInBackground() {
        if (this.f306i == null) {
            return null;
        }
        int $i1;
        Table[] $r4 = new Table[this.f306i.length];
        for ($i1 = 0; $i1 < this.f306i.length; $i1++) {
            $r4[$i1] = Table.get(length, this.f306i[$i1], 0);
        }
        Table $r1 = $r4.length == 1 ? $r4[0] : new Table($r4, $r4.length);
        if (this.f305e != null) {
            for ($i1 = 0; $i1 < this.f305e.length; $i1++) {
                $r1.get(this.f305e[$i1], this.f302a[$i1]);
            }
        }
        if (this.f303b != null) {
            for (int $i0 = 0; $i0 < this.f303b.length; $i0++) {
                $r1.equals(this.f303b[$i0], this.f304c[$i0]);
            }
        }
        return $r1;
    }

    void doInBackground(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.header = logger.get((byte) 0) * 1923417829;
            return;
        }
        if ($i0 == 2) {
            $i0 = logger.get((byte) 0);
            this.f306i = new int[$i0];
            while ($i1 < $i0) {
                this.f306i[$i1] = logger.get(342245496);
                $i1++;
            }
        } else if (3 == $i0) {
            this.f307s = true;
        } else if (752402124 == $i0) {
            $i0 = logger.get((byte) 0);
            this.f305e = new short[$i0];
            this.f302a = new short[$i0];
            while ($i1 < $i0) {
                this.f305e[$i1] = (short) logger.get(-969889429);
                this.f302a[$i1] = (short) logger.get(1161865260);
                $i1++;
            }
        } else if (1046264585 == $i0) {
            $i0 = logger.get((byte) 0);
            this.f303b = new short[$i0];
            this.f304c = new short[$i0];
            while ($i1 < $i0) {
                this.f303b[$i1] = (short) logger.get(779320241);
                this.f304c[$i1] = (short) logger.get(968974414);
                $i1++;
            }
        } else if ($i0 >= 60 && $i0 < 70) {
            this.type[$i0 - 60] = logger.get(-1608515357);
        }
    }

    public boolean equals() {
        boolean $z1 = true;
        int $i0 = 0;
        while ($i0 < 5) {
            if (!(this.type[$i0] == -1 || length.equals(this.type[$i0], 0, 1802969577))) {
                $z1 = false;
            }
            $i0++;
        }
        return $z1;
    }

    public boolean get(int i) {
        boolean $z0 = true;
        i = 0;
        while (i < 5) {
            try {
                if (this.type[i] != -1) {
                    if (!length.equals(this.type[i], 0, 1774290107)) {
                        $z0 = false;
                    }
                }
                i++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ab.as(" + ')');
            }
        }
        return $z0;
    }

    public boolean invoke() {
        if (this.f306i == null) {
            return true;
        }
        boolean $z1 = true;
        for (int $i1 : this.f306i) {
            if (!length.equals($i1, 0, 1815796019)) {
                $z1 = false;
            }
        }
        return $z1;
    }

    public boolean invoke(int i) {
        boolean $z0 = true;
        if (this.f306i == null) {
            return true;
        }
        i = 0;
        while (i < this.f306i.length) {
            try {
                if (!length.equals(this.f306i[i], 0, 1774538504)) {
                    $z0 = false;
                }
                i++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ab.ag(" + ')');
            }
        }
        return $z0;
    }

    void remove(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                m53a(logger, $i0, -365111727);
            } else {
                return;
            }
        }
    }

    public boolean remove() {
        boolean $z1 = true;
        int $i0 = 0;
        while ($i0 < 5) {
            if (!(this.type[$i0] == -1 || length.equals(this.type[$i0], 0, 2103911972))) {
                $z1 = false;
            }
            $i0++;
        }
        return $z1;
    }

    public boolean set() {
        boolean $z1 = true;
        int $i0 = 0;
        while ($i0 < 5) {
            if (!(this.type[$i0] == -1 || length.equals(this.type[$i0], 0, 1625815413))) {
                $z1 = false;
            }
            $i0++;
        }
        return $z1;
    }

    public Table toString(int i) {
        int[] $r1 = this.f306i;
        int[] iArr = this;
        if ($r1 == null) {
            return null;
        }
        iArr = iArr;
        Table[] $r4 = new Table[iArr.f306i.length];
        int $i1 = 0;
        while (true) {
            int[] $r12 = iArr;
            iArr = $r12;
            if ($i1 >= $r12.f306i.length) {
                break;
            }
            try {
                $r12 = iArr;
                iArr = $r12;
                $r4[$i1] = Table.get(length, $r12.f306i[$i1], 0);
                $i1++;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "ab.ay(" + ')');
            }
        }
        Table $r2 = $r4.length == 1 ? $r4[0] : new Table($r4, $r4.length);
        if (iArr.f305e != null) {
            for ($i1 = 0; $i1 < iArr.f305e.length; $i1++) {
                $r2.get(iArr.f305e[$i1], iArr.f302a[$i1]);
            }
        }
        if (iArr.f303b != null) {
            for (i = 0; i < iArr.f303b.length; i++) {
                $r2.equals(iArr.f303b[i], iArr.f304c[i]);
            }
        }
        return $r2;
    }
}
