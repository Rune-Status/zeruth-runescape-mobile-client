package p000;

/* compiled from: an */
public class Feed extends BitSet {
    static final int DAV_CHECKOUT = 22;
    static final int MEASURED_SIZE_MASK = 16777215;
    static final int f117P = 0;
    public static Class count;
    public static RuntimeException next = new RuntimeException(64, null);
    static CSVReader state;
    static Class type;
    public boolean id = false;

    public static void add(boolean z, byte b) {
        if (z != Chunk.data) {
            try {
                State.start(-1159917896);
                Chunk.data = z;
            } catch (RuntimeException $r0) {
                throw StringBuilder.append($r0, "an.au(" + ')');
            }
        }
    }

    static Session getInstance(int i) {
        return State.this$0;
    }

    public static void init(Class classR, byte b) {
        PreferenceManager.mActivity = classR;
    }

    void clear(Logger logger, int i) {
        if (2 == i) {
            this.id = true;
        }
    }

    void get(Logger logger, int i, int i2) {
        if (2 == i) {
            try {
                this.id = true;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "an.ad(" + ')');
            }
        }
    }

    public void getSize(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, 1948714792);
            } else {
                return;
            }
        }
    }

    public void read(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    get(logger, i, 1122643060);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "an.af(" + ')');
            }
        }
    }

    void setId(Logger logger, int i) {
        if (2 == i) {
            this.id = true;
        }
    }

    public void setTitle(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, 1793582910);
            } else {
                return;
            }
        }
    }
}
