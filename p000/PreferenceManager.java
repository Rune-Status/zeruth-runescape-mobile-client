package p000;

/* compiled from: ar */
public class PreferenceManager extends BitSet {
    public static final int Theme_colorAccent = 82;
    static Long[] context;
    public static short[] data;
    static Class mActivity;
    public static RuntimeException this$0 = new RuntimeException(64, null);
    public int size;

    PreferenceManager() {
        try {
            this.size = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ar.<init>(" + ')');
        }
    }

    static String get(String $r0, boolean z, int i) {
        String $r1 = z ? "https://" : "http://";
        if (client.activity * 1902364993 == 1) {
            try {
                $r0 = $r0 + "-wtrc";
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "ar.fw(" + ')');
            }
        } else if (client.activity * 1902364993 == 2) {
            $r0 = $r0 + "-wtqa";
        } else if (client.activity * 1902364993 == 3) {
            $r0 = $r0 + "-wtwip";
        } else if (client.activity * 1902364993 == 5) {
            $r0 = $r0 + "-wti";
        } else if (client.activity * 1902364993 == 4) {
            $r0 = "local";
        }
        String $r3 = "";
        if (client.color != null) {
            $r3 = "/p=" + client.color;
        }
        return $r1 + $r0 + "." + "runescape.com" + "/l=" + (-1387037251 * client.title) + "/a=" + (1107417901 * IntArray.content) + $r3 + "/";
    }

    public static PreferenceManager getData(int i) {
        PreferenceManager $r2 = (PreferenceManager) this$0.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = mActivity.get(5, i, -1693634537);
        $r2 = new PreferenceManager();
        if ($r4 != null) {
            $r2.add(new Logger($r4), 340996386);
        }
        this$0.get($r2, (long) i);
        return $r2;
    }

    public static PreferenceManager getSize(int i) {
        PreferenceManager $r2 = (PreferenceManager) this$0.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = mActivity.get(5, i, 557414758);
        $r2 = new PreferenceManager();
        if ($r4 != null) {
            $r2.add(new Logger($r4), -1879054124);
        }
        this$0.get($r2, (long) i);
        return $r2;
    }

    public static void init(Class classR) {
        mActivity = classR;
    }

    public static PreferenceManager newInstance(int i) {
        PreferenceManager $r2 = (PreferenceManager) this$0.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = mActivity.get(5, i, -1368466524);
        $r2 = new PreferenceManager();
        if ($r4 != null) {
            $r2.add(new Logger($r4), 1321533530);
        }
        this$0.get($r2, (long) i);
        return $r2;
    }

    static boolean next(int i, int i2) {
        return i == 57 || i == 58 || i == 1007 || 25 == i || 30 == i;
    }

    public static PreferenceManager save(int i) {
        PreferenceManager $r2 = (PreferenceManager) this$0.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = mActivity.get(5, i, 111680344);
        $r2 = new PreferenceManager();
        if ($r4 != null) {
            $r2.add(new Logger($r4), 1599766761);
        }
        this$0.get($r2, (long) i);
        return $r2;
    }

    public static void setOnNavigateToScreenListener(Class classR) {
        mActivity = classR;
    }

    void add(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    get(logger, i, 223784542);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ar.an(" + ')');
            }
        }
    }

    void clear(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, 18809773);
            } else {
                return;
            }
        }
    }

    void create(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, 288161150);
            } else {
                return;
            }
        }
    }

    void get(Logger logger, int i, int i2) {
        if (2 == i) {
            try {
                this.size = logger.get(-1853432963) * -1067956967;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ar.aa(" + ')');
            }
        }
    }

    void init(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, 602919278);
            } else {
                return;
            }
        }
    }

    void init(Logger logger, int i) {
        if (2 == i) {
            this.size = logger.get(-323103808) * -986706145;
        }
    }

    void save(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                get(logger, $i0, 871089046);
            } else {
                return;
            }
        }
    }

    void setSize(Logger logger, int i) {
        if (2 == i) {
            this.size = logger.get(-1926619371) * -1067956967;
        }
    }
}
