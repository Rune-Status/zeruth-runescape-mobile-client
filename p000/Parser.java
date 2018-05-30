package p000;

/* compiled from: am */
public class Parser extends BitSet {
    static final int ATTENDEES_INDEX_RELATIONSHIP = 3;
    static final int Id_slice = 15;
    static Parser NONE = new Parser();
    static int f223a;
    static Class count;
    public int context;
    int data;
    public int size;
    public int type;
    public int value;

    Parser() {
        try {
            this.data = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "am.<init>(" + ')');
        }
    }

    public static final int equals(int i) {
        return 453104899 * client.length;
    }

    public static Parser find(int i) {
        return (i < 0 || i >= MimeType.value.length) ? NONE : MimeType.value[i];
    }

    public static Parser get(int i) {
        return (i < 0 || i >= MimeType.value.length) ? NONE : MimeType.value[i];
    }

    public static Parser getToken(int i) {
        return (i < 0 || i >= MimeType.value.length) ? NONE : MimeType.value[i];
    }

    public static Parser getType(int i) {
        return (i < 0 || i >= MimeType.value.length) ? NONE : MimeType.value[i];
    }

    public static int parse(int i, int i2) {
        try {
            return Method.get(Main.value[i]);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "am.ay(" + ')');
        }
    }

    public static void parse(Class classR) {
        count = classR;
        MimeType.value = new Parser[classR.add(1, 1539013826)];
        for (int $i0 = 0; $i0 < MimeType.value.length; $i0++) {
            byte[] $r2 = count.get(1, $i0, 114315398);
            MimeType.value[$i0] = new Parser();
            if ($r2 != null) {
                MimeType.value[$i0].add(new Logger($r2), $i0, (byte) 89);
            }
            MimeType.value[$i0].parse(-2034068341);
        }
    }

    public static void process(Class classR) {
        count = classR;
        MimeType.value = new Parser[classR.add(1, 1380396537)];
        for (int $i0 = 0; $i0 < MimeType.value.length; $i0++) {
            byte[] $r2 = count.get(1, $i0, -403451481);
            MimeType.value[$i0] = new Parser();
            if ($r2 != null) {
                MimeType.value[$i0].add(new Logger($r2), $i0, (byte) 18);
            }
            MimeType.value[$i0].parse(-1953432959);
        }
    }

    static final void read(Handler handler, short s) {
        int $i4;
        byte[] $r2;
        handler.debug(1565299499);
        int $i2 = 0;
        int $i3 = 0;
        while ($i2 < Database.size * -1675758365) {
            try {
                $i4 = Database.next[$i2];
                if ((Database.type[$i4] & (byte) 1) == (byte) 0) {
                    if ($i3 > 0) {
                        $i3--;
                        $r2 = Database.type;
                        $r2[$i4] = (byte) ($r2[$i4] | (byte) 2);
                    } else if (handler.add(1, (byte) -39) == 0) {
                        $i3 = Character.decode(handler, -1798257477);
                        $r2 = Database.type;
                        $r2[$i4] = (byte) ($r2[$i4] | (byte) 2);
                    } else {
                        Wrapper.init(handler, $i4, 1452776650);
                    }
                }
                $i2++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "am.an(" + ')');
            }
        }
        handler.create(1885733558);
        if ($i3 != 0) {
            throw new RuntimeException();
        }
        handler.debug(1565299499);
        for ($i2 = 0; $i2 < Database.size * -1675758365; $i2++) {
            $i4 = Database.next[$i2];
            if ((Database.type[$i4] & (byte) 1) != (byte) 0) {
                if ($i3 > 0) {
                    $i3--;
                    $r2 = Database.type;
                    $r2[$i4] = (byte) ($r2[$i4] | (byte) 2);
                } else if (handler.add(1, (byte) -11) == 0) {
                    $i3 = Character.decode(handler, -2025671722);
                    $r2 = Database.type;
                    $r2[$i4] = (byte) ($r2[$i4] | (byte) 2);
                } else {
                    Wrapper.init(handler, $i4, 1452776650);
                }
            }
        }
        handler.create(1885733558);
        if ($i3 != 0) {
            throw new RuntimeException();
        }
        handler.debug(1565299499);
        for ($i2 = 0; $i2 < Database.state * -844313837; $i2++) {
            $i4 = Database.key[$i2];
            if ((Database.type[$i4] & (byte) 1) != (byte) 0) {
                if ($i3 > 0) {
                    $i3--;
                    $r2 = Database.type;
                    $r2[$i4] = (byte) ($r2[$i4] | (byte) 2);
                } else if (handler.add(1, (byte) -31) == 0) {
                    $i3 = Character.decode(handler, -1879687682);
                    $r2 = Database.type;
                    $r2[$i4] = (byte) ($r2[$i4] | (byte) 2);
                } else if (FileUtils.add(handler, $i4, 212560054)) {
                    $r2 = Database.type;
                    $r2[$i4] = (byte) ($r2[$i4] | (byte) 2);
                } else {
                    continue;
                }
            }
        }
        handler.create(1885733558);
        if ($i3 != 0) {
            throw new RuntimeException();
        }
        int $i1;
        handler.debug(1565299499);
        for ($i1 = 0; $i1 < -844313837 * Database.state; $i1++) {
            $i2 = Database.key[$i1];
            if ((Database.type[$i2] & (byte) 1) == (byte) 0) {
                if ($i3 > 0) {
                    $i3--;
                    $r2 = Database.type;
                    $r2[$i2] = (byte) ($r2[$i2] | (byte) 2);
                } else if (handler.add(1, (byte) -99) == 0) {
                    $i3 = Character.decode(handler, -1799136884);
                    $r2 = Database.type;
                    $r2[$i2] = (byte) ($r2[$i2] | (byte) 2);
                } else if (FileUtils.add(handler, $i2, 690863437)) {
                    $r2 = Database.type;
                    $r2[$i2] = (byte) ($r2[$i2] | (byte) 2);
                } else {
                    continue;
                }
            }
        }
        handler.create(1885733558);
        if ($i3 != 0) {
            throw new RuntimeException();
        }
        Database.size = 0;
        Database.state = 0;
        for ($i1 = 1; $i1 < Constants.ACC_STRICT; $i1++) {
            $r2 = Database.type;
            $r2[$i1] = (byte) ($r2[$i1] >> (byte) 1);
            int[] $r1;
            if (client.size[$i1] != null) {
                $r1 = Database.next;
                $i3 = Database.size - 1328615221;
                Database.size = $i3;
                $r1[($i3 * -1675758365) - 1] = $i1;
            } else {
                $r1 = Database.key;
                $i3 = Database.state - 948652261;
                Database.state = $i3;
                $r1[($i3 * -844313837) - 1] = $i1;
            }
        }
    }

    public static void write(Class classR) {
        count = classR;
        MimeType.value = new Parser[classR.add(1, -250160431)];
        for (int $i0 = 0; $i0 < MimeType.value.length; $i0++) {
            byte[] $r2 = count.get(1, $i0, -1392532109);
            MimeType.value[$i0] = new Parser();
            if ($r2 != null) {
                MimeType.value[$i0].add(new Logger($r2), $i0, (byte) 70);
            }
            MimeType.value[$i0].parse(-2081474698);
        }
    }

    void add(Logger logger, int i) {
        while (true) {
            int $i1 = logger.get((byte) 0);
            if ($i1 != 0) {
                add(logger, $i1, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void add(Logger logger, int i, byte b) {
        while (true) {
            try {
                int $i2 = logger.get((byte) 0);
                if ($i2 != 0) {
                    add(logger, $i2, i, -2089076771);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "am.aa(" + ')');
            }
        }
    }

    void add(Logger logger, int i, int i2, int i3) {
        if (i == 1) {
            try {
                this.data = logger.set(-1300241258) * 1916380473;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "am.ag(" + ')');
            }
        }
    }

    void create(Logger logger, int i) {
        while (true) {
            int $i1 = logger.get((byte) 0);
            if ($i1 != 0) {
                add(logger, $i1, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void init(int i) {
        double $d1 = ((double) ((i >> 16) & 255)) / 256.0d;
        double $d0 = ((double) ((i >> 8) & 255)) / 256.0d;
        int $i0 = i & 255;
        double $d3 = ((double) $i0) / 256.0d;
        double $d4 = $d0 < $d1 ? $d0 : $d1;
        if ($d3 < $d4) {
            $d4 = $d3;
        }
        double $d2 = $d0 > $d1 ? $d0 : $d1;
        double $d5 = $d3 > $d2 ? $d3 : $d2;
        double $d6 = 0.0d;
        $d2 = ($d4 + $d5) / 2.0d;
        if ($d5 != $d4) {
            if ($d2 < 0.5d) {
                $d6 = ($d5 - $d4) / ($d5 + $d4);
            }
            if ($d2 >= 0.5d) {
                $d6 = ($d5 - $d4) / ((2.0d - $d5) - $d4);
            }
            if ($d5 == $d1) {
                $d1 = ($d0 - $d3) / ($d5 - $d4);
                $d4 = $d6;
            } else if ($d5 == $d0) {
                $d1 = (($d3 - $d1) / ($d5 - $d4)) + 2.0d;
                $d4 = $d6;
            } else if ($d5 == $d3) {
                $d1 = (($d1 - $d0) / ($d5 - $d4)) + 4.0d;
                $d4 = $d6;
            }
            $d6 = $d1 / 6.0d;
            this.value = 562902111 * ((int) (256.0d * $d4));
            $i0 = ((int) (256.0d * $d2)) * -1434216303;
            i = $i0;
            this.type = $i0;
            if (this.value * -890361953 < 0) {
                this.value = 0;
            } else if (-890361953 * this.value > 255) {
                this.value = 1806117537;
            }
            if (1818437745 * this.type < 0) {
                this.type = 0;
            } else if (1818437745 * this.type > 255) {
                this.type = -652937105;
            }
            if ($d2 <= 0.5d) {
                $i0 = ((int) (($d4 * (1.0d - $d2)) * 512.0d)) * 1001815629;
                i = $i0;
                this.context = $i0;
            } else {
                $i0 = ((int) (($d4 * $d2) * 512.0d)) * 1001815629;
                i = $i0;
                this.context = $i0;
            }
            if (this.context * -524883323 < 1) {
                this.context = 1001815629;
            }
            $i0 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
            i = $i0;
            this.size = $i0;
        }
        $d4 = $d6;
        $d1 = 0.0d;
        $d6 = $d1 / 6.0d;
        this.value = 562902111 * ((int) (256.0d * $d4));
        $i0 = ((int) (256.0d * $d2)) * -1434216303;
        i = $i0;
        this.type = $i0;
        if (this.value * -890361953 < 0) {
            this.value = 0;
        } else if (-890361953 * this.value > 255) {
            this.value = 1806117537;
        }
        if (1818437745 * this.type < 0) {
            this.type = 0;
        } else if (1818437745 * this.type > 255) {
            this.type = -652937105;
        }
        if ($d2 <= 0.5d) {
            $i0 = ((int) (($d4 * $d2) * 512.0d)) * 1001815629;
            i = $i0;
            this.context = $i0;
        } else {
            $i0 = ((int) (($d4 * (1.0d - $d2)) * 512.0d)) * 1001815629;
            i = $i0;
            this.context = $i0;
        }
        if (this.context * -524883323 < 1) {
            this.context = 1001815629;
        }
        $i0 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
        i = $i0;
        this.size = $i0;
    }

    void init(Logger logger, int i) {
        while (true) {
            int $i1 = logger.get((byte) 0);
            if ($i1 != 0) {
                add(logger, $i1, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void initialize(int i) {
        double $d1 = ((double) ((i >> 16) & 255)) / 256.0d;
        double $d0 = ((double) ((i >> 8) & 255)) / 256.0d;
        int $i0 = i & 255;
        double $d3 = ((double) $i0) / 256.0d;
        double $d2 = $d0 < $d1 ? $d0 : $d1;
        double $d4 = $d3 < $d2 ? $d3 : $d2;
        double $d5 = $d0 > $d1 ? $d0 : $d1;
        if ($d3 > $d5) {
            $d5 = $d3;
        }
        double $d6 = 0.0d;
        $d2 = ($d4 + $d5) / 2.0d;
        if ($d5 != $d4) {
            if ($d2 < 0.5d) {
                $d6 = ($d5 - $d4) / ($d5 + $d4);
            }
            if ($d2 >= 0.5d) {
                $d6 = ($d5 - $d4) / ((2.0d - $d5) - $d4);
            }
            if ($d5 == $d1) {
                $d4 = ($d0 - $d3) / ($d5 - $d4);
                $d1 = $d6;
            } else if ($d5 == $d0) {
                $d4 = (($d3 - $d1) / ($d5 - $d4)) + 2.0d;
                $d1 = $d6;
            } else if ($d5 == $d3) {
                $d4 = (($d1 - $d0) / ($d5 - $d4)) + 4.0d;
                $d1 = $d6;
            }
            $d6 = $d4 / 6.0d;
            this.value = 562902111 * ((int) (256.0d * $d1));
            $i0 = ((int) (256.0d * $d2)) * -1434216303;
            i = $i0;
            this.type = $i0;
            if (this.value * -890361953 < 0) {
                this.value = 0;
            } else if (-890361953 * this.value > 255) {
                this.value = 1806117537;
            }
            if (1818437745 * this.type < 0) {
                this.type = 0;
            } else if (1818437745 * this.type > 255) {
                this.type = -652937105;
            }
            if ($d2 <= 0.5d) {
                $i0 = ((int) (($d1 * (1.0d - $d2)) * 512.0d)) * 1001815629;
                i = $i0;
                this.context = $i0;
            } else {
                $i0 = ((int) (($d1 * $d2) * 512.0d)) * 1001815629;
                i = $i0;
                this.context = $i0;
            }
            if (this.context * -524883323 < 1) {
                this.context = 1001815629;
            }
            $i0 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
            i = $i0;
            this.size = $i0;
        }
        $d1 = $d6;
        $d4 = 0.0d;
        $d6 = $d4 / 6.0d;
        this.value = 562902111 * ((int) (256.0d * $d1));
        $i0 = ((int) (256.0d * $d2)) * -1434216303;
        i = $i0;
        this.type = $i0;
        if (this.value * -890361953 < 0) {
            this.value = 0;
        } else if (-890361953 * this.value > 255) {
            this.value = 1806117537;
        }
        if (1818437745 * this.type < 0) {
            this.type = 0;
        } else if (1818437745 * this.type > 255) {
            this.type = -652937105;
        }
        if ($d2 <= 0.5d) {
            $i0 = ((int) (($d1 * $d2) * 512.0d)) * 1001815629;
            i = $i0;
            this.context = $i0;
        } else {
            $i0 = ((int) (($d1 * (1.0d - $d2)) * 512.0d)) * 1001815629;
            i = $i0;
            this.context = $i0;
        }
        if (this.context * -524883323 < 1) {
            this.context = 1001815629;
        }
        $i0 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
        i = $i0;
        this.size = $i0;
    }

    void mustHaveXML() {
        parse(724285705 * this.data, 843648342);
    }

    void parse() {
        parse(724285705 * this.data, 1073479120);
    }

    void parse(int i) {
        try {
            parse(724285705 * this.data, 128094075);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "am.an(" + ')');
        }
    }

    void m79parse(int i, int i2) {
        int $i1 = (i >> 16) & 255;
        double $d1 = ((double) $i1) / 256.0d;
        $i1 = (i >> 8) & 255;
        double $d0 = ((double) $i1) / 256.0d;
        $i1 = i & 255;
        double $d3 = ((double) $i1) / 256.0d;
        double $d2 = $d0 < $d1 ? $d0 : $d1;
        double $d4 = $d3 < $d2 ? $d3 : $d2;
        double $d5 = $d0 > $d1 ? $d0 : $d1;
        if ($d3 > $d5) {
            $d5 = $d3;
        }
        double $d6 = 0.0d;
        $d2 = ($d4 + $d5) / 2.0d;
        if ($d5 != $d4) {
            if ($d2 < 0.5d) {
                $d6 = ($d5 - $d4) / ($d5 + $d4);
            }
            if ($d2 >= 0.5d) {
                $d6 = ($d5 - $d4) / ((2.0d - $d5) - $d4);
            }
            if ($d5 == $d1) {
                $d4 = ($d0 - $d3) / ($d5 - $d4);
                $d1 = $d6;
            } else if ($d5 == $d0) {
                $d4 = (($d3 - $d1) / ($d5 - $d4)) + 2.0d;
                $d1 = $d6;
            } else if ($d5 == $d3) {
                $d4 = (($d1 - $d0) / ($d5 - $d4)) + 4.0d;
                $d1 = $d6;
            }
            $d6 = $d4 / 6.0d;
            this.value = 562902111 * ((int) (256.0d * $d1));
            $i1 = ((int) (256.0d * $d2)) * -1434216303;
            i = $i1;
            this.type = $i1;
            if (this.value * -890361953 < 0) {
                this.value = 0;
            } else if (-890361953 * this.value > 255) {
                this.value = 1806117537;
            }
            if (1818437745 * this.type < 0) {
                this.type = 0;
            } else if (1818437745 * this.type > 255) {
                this.type = -652937105;
            }
            if ($d2 <= 0.5d) {
                $i1 = ((int) (($d1 * (1.0d - $d2)) * 512.0d)) * 1001815629;
                i = $i1;
                this.context = $i1;
            } else {
                $i1 = ((int) (($d1 * $d2) * 512.0d)) * 1001815629;
                i = $i1;
                this.context = $i1;
            }
            if (this.context * -524883323 < 1) {
                this.context = 1001815629;
            }
            $i1 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
            i = $i1;
            this.size = $i1;
        }
        $d1 = $d6;
        $d4 = 0.0d;
        $d6 = $d4 / 6.0d;
        try {
            this.value = 562902111 * ((int) (256.0d * $d1));
            $i1 = ((int) (256.0d * $d2)) * -1434216303;
            i = $i1;
            this.type = $i1;
            if (this.value * -890361953 < 0) {
                this.value = 0;
            } else if (-890361953 * this.value > 255) {
                this.value = 1806117537;
            }
            if (1818437745 * this.type < 0) {
                this.type = 0;
            } else if (1818437745 * this.type > 255) {
                this.type = -652937105;
            }
            if ($d2 <= 0.5d) {
                $i1 = ((int) (($d1 * $d2) * 512.0d)) * 1001815629;
                i = $i1;
                this.context = $i1;
            } else {
                $i1 = ((int) (($d1 * (1.0d - $d2)) * 512.0d)) * 1001815629;
                i = $i1;
                this.context = $i1;
            }
            if (this.context * -524883323 < 1) {
                this.context = 1001815629;
            }
            $i1 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
            i = $i1;
            this.size = $i1;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "am.ay(" + ')');
        }
    }

    void parse(Logger logger, int i) {
        while (true) {
            int $i1 = logger.get((byte) 0);
            if ($i1 != 0) {
                add(logger, $i1, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void parse(Logger logger, int i, int i2) {
        if (i == 1) {
            this.data = logger.set(1408847339) * -1533809911;
        }
    }

    void process() {
        parse(724285705 * this.data, -2091399806);
    }

    void trace(Logger logger, int i) {
        while (true) {
            int $i1 = logger.get((byte) 0);
            if ($i1 != 0) {
                add(logger, $i1, i, -2089076771);
            } else {
                return;
            }
        }
    }

    void transform(int i) {
        double $d1 = ((double) ((i >> 16) & 255)) / 256.0d;
        double $d0 = ((double) ((i >> 8) & 255)) / 256.0d;
        int $i0 = i & 255;
        double $d3 = ((double) $i0) / 256.0d;
        double $d4 = $d0 < $d1 ? $d0 : $d1;
        if ($d3 < $d4) {
            $d4 = $d3;
        }
        double $d5 = $d0 > $d1 ? $d0 : $d1;
        if ($d3 > $d5) {
            $d5 = $d3;
        }
        double $d6 = 0.0d;
        double $d2 = ($d4 + $d5) / 2.0d;
        if ($d5 != $d4) {
            if ($d2 < 0.5d) {
                $d6 = ($d5 - $d4) / ($d5 + $d4);
            }
            if ($d2 >= 0.5d) {
                $d6 = ($d5 - $d4) / ((2.0d - $d5) - $d4);
            }
            if ($d5 == $d1) {
                $d5 = ($d0 - $d3) / ($d5 - $d4);
                $d4 = $d6;
            } else if ($d5 == $d0) {
                $d5 = (($d3 - $d1) / ($d5 - $d4)) + 2.0d;
                $d4 = $d6;
            } else if ($d5 == $d3) {
                $d5 = (($d1 - $d0) / ($d5 - $d4)) + 4.0d;
                $d4 = $d6;
            }
            $d6 = $d5 / 6.0d;
            this.value = 562902111 * ((int) (256.0d * $d4));
            $i0 = ((int) (256.0d * $d2)) * -1434216303;
            i = $i0;
            this.type = $i0;
            if (this.value * -890361953 < 0) {
                this.value = 0;
            } else if (-890361953 * this.value > 255) {
                this.value = 1806117537;
            }
            if (1818437745 * this.type < 0) {
                this.type = 0;
            } else if (1818437745 * this.type > 255) {
                this.type = -652937105;
            }
            if ($d2 <= 0.5d) {
                $i0 = ((int) (($d4 * (1.0d - $d2)) * 512.0d)) * 1001815629;
                i = $i0;
                this.context = $i0;
            } else {
                $i0 = ((int) (($d4 * $d2) * 512.0d)) * 1001815629;
                i = $i0;
                this.context = $i0;
            }
            if (this.context * -524883323 < 1) {
                this.context = 1001815629;
            }
            $i0 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
            i = $i0;
            this.size = $i0;
        }
        $d4 = $d6;
        $d5 = 0.0d;
        $d6 = $d5 / 6.0d;
        this.value = 562902111 * ((int) (256.0d * $d4));
        $i0 = ((int) (256.0d * $d2)) * -1434216303;
        i = $i0;
        this.type = $i0;
        if (this.value * -890361953 < 0) {
            this.value = 0;
        } else if (-890361953 * this.value > 255) {
            this.value = 1806117537;
        }
        if (1818437745 * this.type < 0) {
            this.type = 0;
        } else if (1818437745 * this.type > 255) {
            this.type = -652937105;
        }
        if ($d2 <= 0.5d) {
            $i0 = ((int) (($d4 * $d2) * 512.0d)) * 1001815629;
            i = $i0;
            this.context = $i0;
        } else {
            $i0 = ((int) (($d4 * (1.0d - $d2)) * 512.0d)) * 1001815629;
            i = $i0;
            this.context = $i0;
        }
        if (this.context * -524883323 < 1) {
            this.context = 1001815629;
        }
        $i0 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
        i = $i0;
        this.size = $i0;
    }

    void update(int i) {
        double $d1 = ((double) ((i >> 16) & 255)) / 256.0d;
        double $d0 = ((double) ((i >> 8) & 255)) / 256.0d;
        int $i0 = i & 255;
        double $d3 = ((double) $i0) / 256.0d;
        double $d4 = $d0 < $d1 ? $d0 : $d1;
        if ($d3 < $d4) {
            $d4 = $d3;
        }
        double $d5 = $d0 > $d1 ? $d0 : $d1;
        if ($d3 > $d5) {
            $d5 = $d3;
        }
        double $d6 = 0.0d;
        double $d2 = ($d4 + $d5) / 2.0d;
        if ($d5 != $d4) {
            if ($d2 < 0.5d) {
                $d6 = ($d5 - $d4) / ($d5 + $d4);
            }
            if ($d2 >= 0.5d) {
                $d6 = ($d5 - $d4) / ((2.0d - $d5) - $d4);
            }
            if ($d5 == $d1) {
                $d5 = ($d0 - $d3) / ($d5 - $d4);
                $d4 = $d6;
            } else if ($d5 == $d0) {
                $d5 = (($d3 - $d1) / ($d5 - $d4)) + 2.0d;
                $d4 = $d6;
            } else if ($d5 == $d3) {
                $d5 = (($d1 - $d0) / ($d5 - $d4)) + 4.0d;
                $d4 = $d6;
            }
            $d6 = $d5 / 6.0d;
            this.value = 562902111 * ((int) (256.0d * $d4));
            $i0 = ((int) (256.0d * $d2)) * -1434216303;
            i = $i0;
            this.type = $i0;
            if (this.value * -890361953 < 0) {
                this.value = 0;
            } else if (-890361953 * this.value > 255) {
                this.value = 1806117537;
            }
            if (1818437745 * this.type < 0) {
                this.type = 0;
            } else if (1818437745 * this.type > 255) {
                this.type = -652937105;
            }
            if ($d2 <= 0.5d) {
                $i0 = ((int) (($d4 * (1.0d - $d2)) * 512.0d)) * 1001815629;
                i = $i0;
                this.context = $i0;
            } else {
                $i0 = ((int) (($d4 * $d2) * 512.0d)) * 1001815629;
                i = $i0;
                this.context = $i0;
            }
            if (this.context * -524883323 < 1) {
                this.context = 1001815629;
            }
            $i0 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
            i = $i0;
            this.size = $i0;
        }
        $d4 = $d6;
        $d5 = 0.0d;
        $d6 = $d5 / 6.0d;
        this.value = 562902111 * ((int) (256.0d * $d4));
        $i0 = ((int) (256.0d * $d2)) * -1434216303;
        i = $i0;
        this.type = $i0;
        if (this.value * -890361953 < 0) {
            this.value = 0;
        } else if (-890361953 * this.value > 255) {
            this.value = 1806117537;
        }
        if (1818437745 * this.type < 0) {
            this.type = 0;
        } else if (1818437745 * this.type > 255) {
            this.type = -652937105;
        }
        if ($d2 <= 0.5d) {
            $i0 = ((int) (($d4 * $d2) * 512.0d)) * 1001815629;
            i = $i0;
            this.context = $i0;
        } else {
            $i0 = ((int) (($d4 * (1.0d - $d2)) * 512.0d)) * 1001815629;
            i = $i0;
            this.context = $i0;
        }
        if (this.context * -524883323 < 1) {
            this.context = 1001815629;
        }
        $i0 = ((int) (((double) (-524883323 * this.context)) * $d6)) * 426735677;
        i = $i0;
        this.size = $i0;
    }
}
