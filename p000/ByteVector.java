package p000;

/* compiled from: ai */
public class ByteVector extends BitSet {
    public static final int H3 = 33;
    static final int INCOMPARABLE = 2;
    static int f26a = 0;
    public static RuntimeException f27b = new RuntimeException(64, null);
    static Class f28c = null;
    static final int f29n = 4700;
    static HttpRequest this$0;
    public int count;
    public int current;
    public char data;
    public int[] index;
    public String[] length;
    public int[] next;
    public String size;
    public char value;

    ByteVector() {
        try {
            this.size = R$id.this$0;
            this.count = 0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ai.<init>(" + ')');
        }
    }

    public static void read(int $i0, int i) {
        MultiInputStream.index = 63807465;
        ParserHelper.index = null;
        DirCache.value = 1919717083;
        MultiInputStream.value = 2021257265;
        FieldInfo.index = 0;
        Time.index = false;
        AssertionError.name = 1758792857 * $i0;
    }

    public static ByteVector write(int i) {
        ByteVector $r2 = (ByteVector) f27b.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = f28c.get(8, i, -704820823);
        $r2 = new ByteVector();
        if ($r4 != null) {
            $r2.write(new Logger($r4), 812414808);
        }
        f27b.get($r2, (long) i);
        return $r2;
    }

    public int add(byte b) {
        try {
            return this.count * -112083573;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ai.ag(" + ')');
        }
    }

    void add(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) -83);
            } else {
                return;
            }
        }
    }

    void add(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.data = (char) logger.get((byte) 0);
        } else if ($i0 == 2) {
            this.value = (char) logger.get((byte) 0);
        } else if ($i0 == 3) {
            this.size = logger.toString(745377045);
        } else if (4 == $i0) {
            this.current = logger.size(39573345) * 808635215;
        } else {
            if ($i0 == 5) {
                this.count = logger.get(-1400279550) * 1309147683;
                this.index = new int[(this.count * -112083573)];
                this.length = new String[(this.count * -112083573)];
                while ($i1 < this.count * -112083573) {
                    this.index[$i1] = logger.size(-1151260827);
                    this.length[$i1] = logger.toString(2070021169);
                    $i1++;
                }
            } else if ($i0 == 6) {
                this.count = logger.get(-2136980798) * 1309147683;
                this.index = new int[(this.count * -112083573)];
                this.next = new int[(this.count * -112083573)];
                while ($i1 < this.count * -112083573) {
                    this.index[$i1] = logger.size(105993363);
                    this.next[$i1] = logger.size(2135949420);
                    $i1++;
                }
            }
        }
    }

    void add(Logger logger, int $i0, byte b) {
        int $i2 = 0;
        if (1 == $i0) {
            try {
                this.data = (char) logger.get((byte) 0);
                return;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "ai.aa(" + ')');
            }
        }
        if ($i0 == 2) {
            this.value = (char) logger.get((byte) 0);
        } else if ($i0 == 3) {
            this.size = logger.toString(259440205);
        } else if (4 == $i0) {
            this.current = logger.size(1525355296) * 808635215;
        } else if ($i0 == 5) {
            this.count = logger.get(-1153312276) * 1309147683;
            this.index = new int[(this.count * -112083573)];
            this.length = new String[(this.count * -112083573)];
            while ($i2 < this.count * -112083573) {
                this.index[$i2] = logger.size(1455620126);
                this.length[$i2] = logger.toString(1371065677);
                $i2++;
            }
        } else if ($i0 == 6) {
            this.count = logger.get(1660950482) * 1309147683;
            this.index = new int[(this.count * -112083573)];
            this.next = new int[(this.count * -112083573)];
            while ($i2 < this.count * -112083573) {
                this.index[$i2] = logger.size(-757209399);
                this.next[$i2] = logger.size(1073938267);
                $i2++;
            }
        }
    }

    void create(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) -93);
            } else {
                return;
            }
        }
    }

    public int length() {
        return this.count * -112083573;
    }

    void put(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) -81);
            } else {
                return;
            }
        }
    }

    void put(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.data = (char) logger.get((byte) 0);
        } else if ($i0 == 2) {
            this.value = (char) logger.get((byte) 0);
        } else if ($i0 == 3) {
            this.size = logger.toString(655952238);
        } else if (4 == $i0) {
            this.current = logger.size(2114218360) * 808635215;
        } else {
            if ($i0 == 5) {
                this.count = logger.get(-1595514077) * 1309147683;
                this.index = new int[(this.count * -112083573)];
                this.length = new String[(this.count * -112083573)];
                while ($i1 < this.count * -112083573) {
                    this.index[$i1] = logger.size(841591959);
                    this.length[$i1] = logger.toString(1289182608);
                    $i1++;
                }
            } else if ($i0 == 6) {
                this.count = logger.get(1330341371) * 1309147683;
                this.index = new int[(this.count * -112083573)];
                this.next = new int[(this.count * -112083573)];
                while ($i1 < this.count * -112083573) {
                    this.index[$i1] = logger.size(1329688826);
                    this.next[$i1] = logger.size(-782433030);
                    $i1++;
                }
            }
        }
    }

    void read(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.data = (char) logger.get((byte) 0);
        } else if ($i0 == 2) {
            this.value = (char) logger.get((byte) 0);
        } else if ($i0 == 3) {
            this.size = logger.toString(1908277437);
        } else {
            if (4 == $i0) {
                this.current = logger.size(-178716257) * 808635215;
            } else if ($i0 == 5) {
                this.count = logger.get(-1368066836) * 1309147683;
                this.index = new int[(this.count * -112083573)];
                this.length = new String[(this.count * -112083573)];
                while ($i1 < this.count * -112083573) {
                    this.index[$i1] = logger.size(-119162489);
                    this.length[$i1] = logger.toString(357793495);
                    $i1++;
                }
            } else if ($i0 == 6) {
                this.count = logger.get(895397969) * 1309147683;
                this.index = new int[(this.count * -112083573)];
                this.next = new int[(this.count * -112083573)];
                while ($i1 < this.count * -112083573) {
                    this.index[$i1] = logger.size(26457778);
                    this.next[$i1] = logger.size(1482821035);
                    $i1++;
                }
            }
        }
    }

    void write(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) -46);
            } else {
                return;
            }
        }
    }

    void write(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    add(logger, i, (byte) -94);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ai.an(" + ')');
            }
        }
    }
}
