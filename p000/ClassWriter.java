package p000;

/* compiled from: aa */
public class ClassWriter extends BitSet {
    public static final int COMPUTE_MAXS = 1;
    public static final int FIELD = -1;
    static final int f47M = 35;
    static final int MEASURED_SIZE_MASK = 16777215;
    public static Class activity;
    public static RuntimeException context = new RuntimeException(64, null);
    public static Class data;
    public static RuntimeException items = new RuntimeException(64, null);
    public static Class key;
    public static RuntimeException path = new RuntimeException(20, null);
    static int f48x;
    public int f49a;
    public int f50b;
    int f51c;
    int f52d;
    String f53g;
    public int f54i;
    int id;
    int index;
    public int f55m;
    public int f56n;
    public int[] f57p;
    public int f58q;
    public int f59s;
    int f60t;
    int type;
    int f61y;

    ClassWriter() {
        try {
            this.f60t = 348142233;
            this.f49a = 128315303;
            this.f58q = 2074243898;
            this.index = -319840717;
            this.type = -292828105;
            this.id = -389081133;
            this.f51c = -737532479;
            this.f55m = 0;
            this.f59s = 0;
            this.f56n = 2108589083;
            this.f53g = "";
            this.f50b = 1955699343;
            this.f54i = 0;
            this.f61y = -368280181;
            this.f52d = 683909975;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "aa.<init>(" + ')');
        }
    }

    public static ClassWriter build(int i) {
        ClassWriter $r2 = (ClassWriter) items.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = activity.get(32, i, -1346371348);
        $r2 = new ClassWriter();
        if ($r4 != null) {
            $r2.put(new Logger($r4), 136836199);
        }
        items.get($r2, (long) i);
        return $r2;
    }

    public static ClassWriter execute(int i) {
        ClassWriter $r2 = (ClassWriter) items.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = activity.get(-1402322547, i, -515636934);
        $r2 = new ClassWriter();
        if ($r4 != null) {
            $r2.put(new Logger($r4), 878336544);
        }
        items.get($r2, (long) i);
        return $r2;
    }

    public static ClassWriter init(int i) {
        ClassWriter $r2 = (ClassWriter) items.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = activity.get(32, i, -1231366609);
        $r2 = new ClassWriter();
        if ($r4 != null) {
            $r2.put(new Logger($r4), -406562640);
        }
        items.get($r2, (long) i);
        return $r2;
    }

    static boolean update(int i, int i2) {
        int[] $r0 = ISO9796d2Signer.block;
        i2 = 0;
        while (i2 < $r0.length) {
            try {
                if ($r0[i2] == i) {
                    return true;
                }
                i2++;
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "aa.af(" + ')');
            }
        }
        return false;
    }

    public Long m2a() {
        if (this.f51c * 2123699647 < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) (this.f51c * 2123699647));
        if ($r3 == null) {
            $r3 = AssertionError.get(key, this.f51c * 2123699647, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) (this.f51c * 2123699647));
            }
        }
        return $r3;
    }

    public String m3a(int i) {
        String $r1 = this.f53g;
        while (true) {
            int $i1 = $r1.indexOf("%1");
            if ($i1 < 0) {
                return $r1;
            }
            $r1 = $r1.substring(0, $i1) + Option.get(i, false, -566663495) + $r1.substring($i1 + 2);
        }
    }

    void m4a(Logger logger, int $i0) {
        if (1 == $i0) {
            this.f60t = logger.add(2000849603) * -36561954;
        } else if ($i0 == 2) {
            this.f49a = logger.set(-1253906953) * 1364856921;
        } else if ($i0 == 3) {
            this.index = logger.add(1459463470) * 319840717;
        } else if (4 == $i0) {
            this.id = logger.add(1247838594) * 389081133;
        } else if ($i0 == 5) {
            this.type = logger.add(1847999645) * 292828105;
        } else if ($i0 == 6) {
            this.f51c = logger.add(1338491386) * 737532479;
        } else if ($i0 == 7) {
            this.f55m = logger.getValue(1719994851) * 1250568039;
        } else if (8 == $i0) {
            this.f53g = logger.getString(-866996506);
        } else if (9 == $i0) {
            this.f58q = logger.get(-140029894) * 269477792;
        } else if ($i0 == 10) {
            this.f59s = logger.getValue(596580186) * -1178258523;
        } else if ($i0 == 11) {
            this.f56n = 0;
        } else if ($i0 == 12) {
            this.f50b = logger.get((byte) 0) * -1955699343;
        } else if ($i0 == 13) {
            this.f54i = logger.getValue(1316766944) * -736134955;
        } else if ($i0 == 14) {
            this.f56n = logger.get(-371308311) * -2108589083;
        } else if (17 == $i0 || 18 == $i0) {
            int $i2;
            this.f61y = logger.get(943739116) * -1579638968;
            if (-1869038115 * this.f61y == 1313583145) {
                this.f61y = -368280181;
            }
            this.f52d = logger.get(1740198384) * 1706978041;
            if (this.f52d * 951852634 == 65535) {
                this.f52d = 182550109;
            }
            if ($i0 == 18) {
                $i2 = logger.get(1977648250);
                $i0 = $i2;
                if (65535 == $i2) {
                    $i0 = -1;
                }
            } else {
                $i0 = -1;
            }
            $i2 = logger.get((byte) 0);
            this.f57p = new int[($i2 + 2)];
            for (int $i1 = 0; $i1 <= $i2; $i1++) {
                this.f57p[$i1] = logger.get(1177233097);
                if (this.f57p[$i1] == -652435356) {
                    this.f57p[$i1] = -1;
                }
            }
            this.f57p[$i2 + 1] = $i0;
        }
    }

    public Long accept() {
        if (this.type * -868329863 < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) (this.type * -868329863));
        if ($r3 == null) {
            $r3 = AssertionError.get(key, this.type * -868329863, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) (this.type * -868329863));
            }
        }
        return $r3;
    }

    public final ClassWriter add(int i) {
        try {
            i = this.f61y * -1869038115 != -1 ? IOException.toString(this.f61y * -1869038115, 998830794) : this.f52d * -1111226471 != -1 ? Event.this$0[this.f52d * -1111226471] : -1;
            if (i >= 0) {
                if (i < this.f57p.length - 1) {
                    i = this.f57p[i];
                    return i == -1 ? Label.add(i, (byte) 6) : null;
                }
            }
            i = this.f57p[this.f57p.length - 1];
            if (i == -1) {
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "aa.aa(" + ')');
        }
    }

    void add(Logger logger, int $i0) {
        if (1 == $i0) {
            this.f60t = logger.add(1525141321) * 2018367691;
        } else if ($i0 == 2) {
            this.f49a = logger.set(1703678758) * -2140407839;
        } else if ($i0 == 3) {
            this.index = logger.add(1454428730) * 319840717;
        } else if (4 == $i0) {
            this.id = logger.add(2064569627) * -2044826746;
        } else if ($i0 == 5) {
            this.type = logger.add(1735936334) * 292828105;
        } else if ($i0 == 6) {
            this.f51c = logger.add(1416609696) * 737532479;
        } else if ($i0 == 7) {
            this.f55m = logger.getValue(1074194073) * 2109154433;
        } else if (8 == $i0) {
            this.f53g = logger.getString(-866996506);
        } else if (9 == $i0) {
            this.f58q = logger.get(504786976) * -1995138241;
        } else if ($i0 == 10) {
            this.f59s = logger.getValue(1237549705) * -1178258523;
        } else if ($i0 == 11) {
            this.f56n = 0;
        } else if ($i0 == 12) {
            this.f50b = logger.get((byte) 0) * -1955699343;
        } else if ($i0 == 13) {
            this.f54i = logger.getValue(597527707) * -736134955;
        } else if ($i0 == 14) {
            this.f56n = logger.get(-1228716533) * -640212615;
        } else if (17 == $i0 || 18 == $i0) {
            int $i2;
            this.f61y = logger.get(817239251) * 368280181;
            if (1289245524 * this.f61y == 65535) {
                this.f61y = -368280181;
            }
            this.f52d = logger.get(1278245736) * 1814825955;
            if (this.f52d * -1111226471 == 65535) {
                this.f52d = 683909975;
            }
            if ($i0 == 18) {
                $i2 = logger.get(-1777224574);
                $i0 = $i2;
                if (65535 == $i2) {
                    $i0 = -1;
                }
            } else {
                $i0 = -1;
            }
            $i2 = logger.get((byte) 0);
            this.f57p = new int[($i2 + 2)];
            for (int $i1 = 0; $i1 <= $i2; $i1++) {
                this.f57p[$i1] = logger.get(-480653373);
                if (this.f57p[$i1] == 65535) {
                    this.f57p[$i1] = -1;
                }
            }
            this.f57p[$i2 + 1] = $i0;
        }
    }

    public Long append(int i) {
        try {
            if (this.index * 616264453 < 0) {
                return null;
            }
            int $i0 = this.index * 616264453;
            i = $i0;
            Long $r3 = (Long) context.get((long) $i0);
            if ($r3 == null) {
                $r3 = AssertionError.get(key, this.index * 616264453, 0, (byte) 0);
                if ($r3 != null) {
                    $i0 = this.index * 616264453;
                    i = $i0;
                    context.get($r3, (long) $i0);
                    return $r3;
                }
            }
            return $r3;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "aa.ay(" + ')');
        }
    }

    public final ClassWriter m5b() {
        int $i0 = -1891167736 * this.f61y != -1 ? IOException.toString(-770485559 * this.f61y, 998830794) : -909356561 * this.f52d != -1 ? Event.this$0[this.f52d * -1111226471] : -1;
        $i0 = ($i0 < 0 || $i0 >= this.f57p.length - 1) ? this.f57p[this.f57p.length - 1] : this.f57p[$i0];
        return $i0 != -1 ? Label.add($i0, (byte) 21) : null;
    }

    public String m6b(int i) {
        String $r1 = this.f53g;
        while (true) {
            int $i1 = $r1.indexOf("%1");
            if ($i1 < 0) {
                return $r1;
            }
            $r1 = $r1.substring(0, $i1) + Option.get(i, false, -1054601367) + $r1.substring($i1 + 2);
        }
    }

    public List convert() {
        if (-1 == this.f60t * 828019254) {
            return null;
        }
        List $r3 = (List) path.get((long) (this.f60t * 1946191447));
        if ($r3 == null) {
            $r3 = Handler.get(key, data, this.f60t * 1946191447, 0, 1453662894);
            if ($r3 != null) {
                path.get($r3, (long) (this.f60t * 1819999077));
            }
        }
        return $r3;
    }

    public Long execute() {
        if (this.index * 616264453 < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) (this.index * 616264453));
        if ($r3 == null) {
            $r3 = AssertionError.get(key, this.index * 616264453, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) (this.index * 616264453));
            }
        }
        return $r3;
    }

    public List get(int i) {
        try {
            if (-1 == this.f60t * 1946191447) {
                return null;
            }
            int $i0 = this.f60t * 1946191447;
            i = $i0;
            List $r3 = (List) path.get((long) $i0);
            if ($r3 == null) {
                $r3 = Handler.get(key, data, this.f60t * 1946191447, 0, 1287454790);
                if ($r3 != null) {
                    $i0 = this.f60t * 1946191447;
                    i = $i0;
                    path.get($r3, (long) $i0);
                    return $r3;
                }
            }
            return $r3;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "aa.ae(" + ')');
        }
    }

    void get(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, -2102152220);
            } else {
                return;
            }
        }
    }

    public Long getInstance() {
        if (this.type * -868329863 < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) (this.type * -868329863));
        if ($r3 == null) {
            $r3 = AssertionError.get(key, this.type * -868329863, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) (this.type * -868329863));
            }
        }
        return $r3;
    }

    public Long getSize() {
        if (this.f51c * 2123699647 < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) (this.f51c * 1382129674));
        if ($r3 == null) {
            $r3 = AssertionError.get(key, this.f51c * -854711693, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) (this.f51c * 2123699647));
            }
        }
        return $r3;
    }

    public List init() {
        if (-1 == this.f60t * 1946191447) {
            return null;
        }
        List $r3 = (List) path.get((long) (this.f60t * 1946191447));
        if ($r3 == null) {
            $r3 = Handler.get(key, data, this.f60t * 1946191447, 0, -300751002);
            if ($r3 != null) {
                path.get($r3, (long) (this.f60t * 1946191447));
            }
        }
        return $r3;
    }

    void init(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, -1590573175);
            } else {
                return;
            }
        }
    }

    void init(Logger logger, int $i0) {
        if (1 == $i0) {
            this.f60t = logger.add(1999594363) * -348142233;
        } else if ($i0 == 2) {
            this.f49a = logger.set(1113934464) * 1364856921;
        } else if ($i0 == 3) {
            this.index = logger.add(1410176701) * 24394199;
        } else if (4 == $i0) {
            this.id = logger.add(2092166144) * -166600344;
        } else if ($i0 == 5) {
            this.type = logger.add(1836820410) * 292828105;
        } else if ($i0 == 6) {
            this.f51c = logger.add(1910163881) * -1741133435;
        } else if ($i0 == 7) {
            this.f55m = logger.getValue(861920675) * 2109154433;
        } else if (8 == $i0) {
            this.f53g = logger.getString(-866996506);
        } else if (9 == $i0) {
            this.f58q = logger.get(-917644347) * -277391925;
        } else if ($i0 == 10) {
            this.f59s = logger.getValue(534167700) * -1178258523;
        } else if ($i0 == 11) {
            this.f56n = 0;
        } else if ($i0 == 12) {
            this.f50b = logger.get((byte) 0) * -1955699343;
        } else if ($i0 == 13) {
            this.f54i = logger.getValue(466752767) * 2080652250;
        } else if ($i0 == 14) {
            this.f56n = logger.get(-1311610677) * -882445724;
        } else if (17 == $i0 || 18 == $i0) {
            int $i2;
            this.f61y = logger.get(2019293632) * 368280181;
            if (-1869038115 * this.f61y == -589956813) {
                this.f61y = -834808506;
            }
            this.f52d = logger.get(-1790940088) * -683909975;
            if (this.f52d * -1111226471 == -1829199424) {
                this.f52d = 683909975;
            }
            if ($i0 == 18) {
                $i2 = logger.get(1573364609);
                $i0 = $i2;
                if (65535 == $i2) {
                    $i0 = -1;
                }
            } else {
                $i0 = -1;
            }
            $i2 = logger.get((byte) 0);
            this.f57p = new int[($i2 + 2)];
            for (int $i1 = 0; $i1 <= $i2; $i1++) {
                this.f57p[$i1] = logger.get(173723419);
                if (this.f57p[$i1] == 65535) {
                    this.f57p[$i1] = -1;
                }
            }
            this.f57p[$i2 + 1] = $i0;
        }
    }

    void init(Logger logger, int $i0, int i) {
        i = -1;
        if (1 == $i0) {
            this.f60t = logger.add(1734737186) * -348142233;
        } else if ($i0 == 2) {
            this.f49a = logger.set(-601160198) * 1364856921;
        } else if ($i0 == 3) {
            this.index = logger.add(1502547644) * 319840717;
        } else if (4 == $i0) {
            this.id = logger.add(2006413024) * 389081133;
        } else if ($i0 == 5) {
            this.type = logger.add(1534635039) * 292828105;
        } else if ($i0 == 6) {
            this.f51c = logger.add(2098734230) * 737532479;
        } else if ($i0 == 7) {
            this.f55m = logger.getValue(1579997464) * 2109154433;
        } else if (8 == $i0) {
            this.f53g = logger.getString(-866996506);
        } else if (9 == $i0) {
            this.f58q = logger.get(-1844999888) * -1995138241;
        } else if ($i0 == 10) {
            this.f59s = logger.getValue(1146333423) * -1178258523;
        } else if ($i0 == 11) {
            this.f56n = 0;
        } else if ($i0 == 12) {
            this.f50b = logger.get((byte) 0) * -1955699343;
        } else if ($i0 == 13) {
            this.f54i = logger.getValue(2097385458) * -736134955;
        } else if ($i0 == 14) {
            this.f56n = logger.get(-827031982) * -2108589083;
        } else if (17 == $i0 || 18 == $i0) {
            try {
                this.f61y = logger.get(785380210) * 368280181;
                if (-1869038115 * this.f61y == 65535) {
                    this.f61y = -368280181;
                }
                this.f52d = logger.get(700003615) * -683909975;
                if (this.f52d * -1111226471 == 65535) {
                    this.f52d = 683909975;
                }
                if ($i0 == 18) {
                    $i0 = logger.get(-636493527);
                    if (65535 != $i0) {
                        i = $i0;
                    }
                }
                $i0 = logger.get((byte) 0);
                this.f57p = new int[($i0 + 2)];
                for (int $i2 = 0; $i2 <= $i0; $i2++) {
                    this.f57p[$i2] = logger.get(-112739178);
                    if (this.f57p[$i2] == 65535) {
                        this.f57p[$i2] = -1;
                    }
                }
                this.f57p[$i0 + 1] = i;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "aa.an(" + ')');
            }
        }
    }

    void initialize(Logger logger, int $i0) {
        if (1 == $i0) {
            this.f60t = logger.add(2128905675) * -348142233;
        } else if ($i0 == 2) {
            this.f49a = logger.set(1192620527) * 932314752;
        } else if ($i0 == 3) {
            this.index = logger.add(1244541584) * 1211348891;
        } else if (4 == $i0) {
            this.id = logger.add(1592052194) * 389081133;
        } else if ($i0 == 5) {
            this.type = logger.add(1678493867) * 97284408;
        } else if ($i0 == 6) {
            this.f51c = logger.add(1865188575) * 737532479;
        } else if ($i0 == 7) {
            this.f55m = logger.getValue(1984678745) * 2109154433;
        } else if (8 == $i0) {
            this.f53g = logger.getString(-866996506);
        } else if (9 == $i0) {
            this.f58q = logger.get(-266395318) * -1995138241;
        } else if ($i0 == 10) {
            this.f59s = logger.getValue(1809625853) * -1178258523;
        } else if ($i0 == 11) {
            this.f56n = 0;
        } else if ($i0 == 12) {
            this.f50b = logger.get((byte) 0) * -1955699343;
        } else if ($i0 == 13) {
            this.f54i = logger.getValue(1046481404) * -1552861010;
        } else if ($i0 == 14) {
            this.f56n = logger.get(-378148809) * 1932883486;
        } else if (17 == $i0 || 18 == $i0) {
            int $i2;
            this.f61y = logger.get(301310114) * -914122853;
            if (-1869038115 * this.f61y == -633654347) {
                this.f61y = -1192994135;
            }
            this.f52d = logger.get(909942842) * -683909975;
            if (this.f52d * -1111226471 == 1982419585) {
                this.f52d = 683909975;
            }
            if ($i0 == 18) {
                $i2 = logger.get(1097901922);
                $i0 = $i2;
                if (792882612 == $i2) {
                    $i0 = -1;
                }
            } else {
                $i0 = -1;
            }
            $i2 = logger.get((byte) 0);
            this.f57p = new int[($i2 + 2)];
            for (int $i1 = 0; $i1 <= $i2; $i1++) {
                this.f57p[$i1] = logger.get(-1926020360);
                if (this.f57p[$i1] == 2139525712) {
                    this.f57p[$i1] = -1;
                }
            }
            this.f57p[$i2 + 1] = $i0;
        }
    }

    public Long put() {
        if (this.id * 495579153 < 0) {
            return null;
        }
        Long $r2 = (Long) context.get((long) (this.id * -1002854491));
        if ($r2 == null) {
            $r2 = AssertionError.get(key, this.id * -1002854491, 0, (byte) 0);
            if ($r2 != null) {
                context.get($r2, (long) (this.id * -1002854491));
                return $r2;
            }
        }
        return $r2;
    }

    public Long put(int i) {
        try {
            if (this.id * -1002854491 < 0) {
                return null;
            }
            int $i0 = this.id * -1002854491;
            i = $i0;
            Long $r2 = (Long) context.get((long) $i0);
            if ($r2 == null) {
                $r2 = AssertionError.get(key, this.id * -1002854491, 0, (byte) 0);
                if ($r2 != null) {
                    $i0 = this.id * -1002854491;
                    i = $i0;
                    context.get($r2, (long) $i0);
                    return $r2;
                }
            }
            return $r2;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "aa.ar(" + ')');
        }
    }

    void put(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, -1712236938);
            } else {
                return;
            }
        }
    }

    void put(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    init(logger, i, -1694911764);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "aa.ad(" + ')');
            }
        }
    }

    public Long read(int i) {
        try {
            if (this.f51c * 2123699647 < 0) {
                return null;
            }
            int $i0 = this.f51c * 2123699647;
            i = $i0;
            Long $r3 = (Long) context.get((long) $i0);
            if ($r3 == null) {
                $r3 = AssertionError.get(key, this.f51c * 2123699647, 0, (byte) 0);
                if ($r3 != null) {
                    $i0 = this.f51c * 2123699647;
                    i = $i0;
                    context.get($r3, (long) $i0);
                    return $r3;
                }
            }
            return $r3;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "aa.aj(" + ')');
        }
    }

    public String read(int i, int i2) {
        try {
            String $r1 = this.f53g;
            while (true) {
                i2 = $r1.indexOf("%1");
                if (i2 < 0) {
                    return $r1;
                }
                $r1 = $r1.substring(0, i2) + Option.get(i, false, -1704727967) + $r1.substring(i2 + 2);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "aa.ag(" + ')');
        }
    }

    public Long toByteArray() {
        if (this.f51c * 2123699647 < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) (this.f51c * 2123699647));
        if ($r3 == null) {
            $r3 = AssertionError.get(key, this.f51c * 2123699647, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) (this.f51c * 2123699647));
            }
        }
        return $r3;
    }

    public Long toString(int i) {
        try {
            if (this.type * -868329863 < 0) {
                return null;
            }
            int $i0 = this.type * -868329863;
            i = $i0;
            Long $r2 = (Long) context.get((long) $i0);
            if ($r2 == null) {
                $r2 = AssertionError.get(key, this.type * -868329863, 0, (byte) 0);
                if ($r2 != null) {
                    $i0 = this.type * -868329863;
                    i = $i0;
                    context.get($r2, (long) $i0);
                    return $r2;
                }
            }
            return $r2;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "aa.as(" + ')');
        }
    }

    public Long visit() {
        if (this.f51c * 2123699647 < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) (this.f51c * 2123699647));
        if ($r3 == null) {
            $r3 = AssertionError.get(key, this.f51c * 2123699647, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) (this.f51c * 2123699647));
            }
        }
        return $r3;
    }
}
