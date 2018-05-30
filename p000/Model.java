package p000;

import java.util.Collection;

/* compiled from: af */
public class Model extends BitSet {
    public static final int Debug = 0;
    static final int FLAGS_DEFAULT_TYPE_STRING = 256;
    static final int TAG_AUDIO = 32;
    static Class name;
    static RuntimeException parent = new RuntimeException(64, null);
    public static int this$0;
    Date value;

    Model() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "af.<init>(" + ')');
        }
    }

    public static Model get(int i) {
        Model $r2 = (Model) parent.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = name.get(34, i, -768287271);
        $r2 = new Model();
        if ($r4 != null) {
            $r2.add(new Logger($r4), (byte) 12);
        }
        $r2.load(-843123423);
        parent.get($r2, (long) i);
        return $r2;
    }

    public static void inflate(Class classR) {
        name = classR;
    }

    public static void load(Class classR, int i) {
        Data.value = classR;
    }

    public static void merge(Class classR) {
        name = classR;
    }

    public static Model set(int i) {
        Model $r2 = (Model) parent.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = name.get(34, i, -1335590769);
        $r2 = new Model();
        if ($r4 != null) {
            $r2.add(new Logger($r4), (byte) 12);
        }
        $r2.load(-843123423);
        parent.get($r2, (long) i);
        return $r2;
    }

    public static void set(Collection collection) {
        collection.add(parent);
    }

    public static void setName(Class classR) {
        name = classR;
    }

    public static void setup(Class classR) {
        name = classR;
    }

    static void write(System[] systemArr, System system, boolean z, byte b) {
        try {
            int $i1 = system.cursor * 1151268625 != 0 ? system.cursor * 1151268625 : system.this$0 * 256177861;
            int $i2 = system.buf * -1243953689 != 0 ? -1243953689 * system.buf : 57307023 * system.$assertionsDisabled;
            CopyOnWriteArrayList.parse(systemArr, 1172750087 * system.value, $i1, $i2, z, 1760437802);
            if (system.key != null) {
                CopyOnWriteArrayList.parse(system.key, system.value * 1172750087, $i1, $i2, z, 1760437802);
            }
            Character $r4 = (Character) client.position.get((long) (system.value * 1172750087));
            if ($r4 != null) {
                int $i3 = $r4.size * 669823817;
                if (Hashtable.get($i3, (byte) -95)) {
                    CopyOnWriteArrayList.parse(Float.size[$i3], -1, $i1, $i2, z, 1760437802);
                }
            }
            if (-586529633 * system.context != System.NOTIFICATION_ID) {
            }
        } catch (Throwable $r6) {
            throw StringBuilder.append($r6, "af.et(" + ')');
        }
    }

    void add(Logger logger, byte b) {
        while (true) {
            try {
                int $i1 = logger.get((byte) 0);
                if ($i1 != 0) {
                    add(logger, $i1, 2098900089);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "af.aa(" + ')');
            }
        }
    }

    void add(Logger logger, int i) {
        if (i == 249) {
            this.value = IllegalStateException.add(logger, this.value, (byte) -120);
        }
    }

    void add(Logger logger, int i, int i2) {
        if (i == 249) {
            try {
                this.value = IllegalStateException.add(logger, this.value, (byte) -54);
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "af.ag(" + ')');
            }
        }
    }

    public String get(int i, String $r1, int i2) {
        try {
            return Block.toString(this.value, i, $r1, (byte) 12);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "af.as(" + ')');
        }
    }

    void init(Logger logger, int i) {
        if (i == 249) {
            this.value = IllegalStateException.add(logger, this.value, (byte) -7);
        }
    }

    void load(int i) {
    }

    void lookup(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, 1509027211);
            } else {
                return;
            }
        }
    }

    void merge() {
    }

    public int read(int $i0, int i) {
        return CompositeInlineMap.add(this.value, $i0, i, -1087033416);
    }

    public int set(int $i0, int i) {
        return CompositeInlineMap.add(this.value, $i0, i, 2080222652);
    }

    public int set(int $i0, int i, int i2) {
        try {
            return CompositeInlineMap.add(this.value, $i0, i, -729180540);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "af.ay(" + ')');
        }
    }

    void set(Logger logger, int i) {
        if (i == -1762857881) {
            this.value = IllegalStateException.add(logger, this.value, (byte) -64);
        }
    }

    void setAccountType() {
    }

    void setTo() {
    }
}
