package p000;

/* compiled from: ay */
public class ByteBufferList extends BitSet {
    static final int LOCK = 19136896;
    static boolean f25a;
    public static RuntimeException context = new RuntimeException(256, null);
    static int count;
    public static ByteBufferList[] data;
    static int[][] length;
    static Info position;
    public AsyncTask content;
    public String file;
    public String[] header;
    int index;
    int[] key;
    int last;
    public Hashtable name;
    int next;
    public int pos;
    int size;
    byte[] state;
    int target;
    public int text;
    public final int this$0;
    public int type;
    public String value;
    int[] values;
    public int width;

    ByteBufferList(int $i0) {
        try {
            this.pos = 258469943;
            this.target = -1068562769;
            this.text = 0;
            this.header = new String[5];
            this.last = 1437165031;
            this.next = -1851252223;
            this.index = Integer.MIN_VALUE;
            this.size = Integer.MIN_VALUE;
            this.name = Hashtable.f131i;
            this.content = AsyncTask.f8g;
            this.type = -1018359203;
            this.this$0 = -299567135 * $i0;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ay.<init>(" + ')');
        }
    }

    static void add(int i, int i2, byte b) {
        try {
            int[] $r0 = new int[4];
            int[] $r1 = new int[4];
            $r0[0] = i;
            $r1[0] = i2;
            i2 = 1;
            for (int $i3 = 0; $i3 < 4; $i3++) {
                if (i != ByteBuffer.data[$i3]) {
                    $r0[i2] = ByteBuffer.data[$i3];
                    $r1[i2] = ByteBuffer.count[$i3];
                    i2++;
                }
            }
            ByteBuffer.data = $r0;
            ByteBuffer.count = $r1;
            System.append(Short.value, 0, Short.value.length - 1, ByteBuffer.data, ByteBuffer.count, 1263361591);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ay.ad(" + ')');
        }
    }

    public static boolean add(Class classR, Class classR2) {
        InputStream.value = classR2;
        if (!classR.replace(1899370123)) {
            return false;
        }
        count = classR.add(35, -1221692810) * 104489825;
        data = new ByteBufferList[(-1577615199 * count)];
        for (int $i0 = 0; $i0 < count * 1317435203; $i0++) {
            byte[] $r3 = classR.get(35, $i0, 454146028);
            if ($r3 != null) {
                data[$i0] = new ByteBufferList($i0);
                data[$i0].add(new Logger($r3), -217716362);
                data[$i0].add(-236208886);
            }
        }
        return true;
    }

    public static boolean get(Class classR, Class classR2) {
        InputStream.value = classR2;
        if (!classR.replace(10588212)) {
            return false;
        }
        count = classR.add(182429997, -637912598) * -422114734;
        data = new ByteBufferList[(count * -1577615199)];
        for (int $i0 = 0; $i0 < count * -1577615199; $i0++) {
            byte[] $r3 = classR.get(280677131, $i0, -651169704);
            if ($r3 != null) {
                data[$i0] = new ByteBufferList($i0);
                data[$i0].add(new Logger($r3), 442779375);
                data[$i0].add(-1475397527);
            }
        }
        return true;
    }

    public static boolean read(Class classR, Class classR2) {
        InputStream.value = classR2;
        if (!classR.replace(1195587339)) {
            return false;
        }
        count = classR.add(35, -1651783344) * -191799785;
        data = new ByteBufferList[(-1992801971 * count)];
        for (int $i0 = 0; $i0 < count * -1577615199; $i0++) {
            byte[] $r3 = classR.get(35, $i0, -1003940799);
            if ($r3 != null) {
                data[$i0] = new ByteBufferList($i0);
                data[$i0].add(new Logger($r3), 1068989012);
                data[$i0].add(-822027232);
            }
        }
        return true;
    }

    public static boolean send(Class classR, Class classR2) {
        InputStream.value = classR2;
        if (!classR.replace(1428375898)) {
            return false;
        }
        count = classR.add(35, -871138350) * 104489825;
        data = new ByteBufferList[(-1688171509 * count)];
        for (int $i0 = 0; $i0 < count * -1577615199; $i0++) {
            byte[] $r4 = classR.get(35, $i0, -254549472);
            if ($r4 != null) {
                data[$i0] = new ByteBufferList($i0);
                data[$i0].add(new Logger($r4), -291770474);
                data[$i0].add(-1829363843);
            }
        }
        return true;
    }

    void add() {
        if (this.key != null) {
            for (int $i0 = 0; $i0 < this.key.length; $i0 += 2) {
                if (this.key[$i0] < this.last * -29744599) {
                    this.last = this.key[$i0] * 710318617;
                } else if (this.key[$i0] > this.index * 1301316395) {
                    this.index = this.key[$i0] * 1348084611;
                }
                if (this.key[$i0 + 1] < -182181377 * this.next) {
                    this.next = this.key[$i0 + 1] * -296231425;
                } else if (this.key[$i0 + 1] > -211523553 * this.size) {
                    this.size = -1437527073 * this.key[$i0 + 1];
                }
            }
        }
    }

    void add(int i) {
        try {
            if (this.key != null) {
                for (i = 0; i < this.key.length; i += 2) {
                    if (this.key[i] < this.last * -29744599) {
                        this.last = this.key[i] * 710318617;
                    } else if (this.key[i] > this.index * 1301316395) {
                        this.index = this.key[i] * 1348084611;
                    }
                    if (this.key[i + 1] < -182181377 * this.next) {
                        this.next = this.key[i + 1] * -296231425;
                    } else if (this.key[i + 1] > -211523553 * this.size) {
                        this.size = -1437527073 * this.key[i + 1];
                    } else {
                        continue;
                    }
                }
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ay.aa(" + ')');
        }
    }

    void add(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, -1446242676);
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
                    init(logger, i, -1446242676);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ay.ad(" + ')');
            }
        }
    }

    Long get(int i) {
        if (i < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) i);
        if ($r3 == null) {
            $r3 = AssertionError.get(InputStream.value, i, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) i);
            }
        }
        return $r3;
    }

    public Long get(boolean z, int i) {
        if (z) {
            try {
                i = this.target * 1469181873;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ay.ag(" + ')');
            }
        }
        i = this.pos * 1755658873;
        return read(i, 1233498407);
    }

    Long getInt(int i) {
        if (i < 0) {
            return null;
        }
        Long $r2 = (Long) context.get((long) i);
        if ($r2 == null) {
            $r2 = AssertionError.get(InputStream.value, i, 0, (byte) 0);
            if ($r2 != null) {
                context.get($r2, (long) i);
                return $r2;
            }
        }
        return $r2;
    }

    Long getLong(int i) {
        if (i < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) i);
        if ($r3 == null) {
            $r3 = AssertionError.get(InputStream.value, i, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) i);
            }
        }
        return $r3;
    }

    public int getShort() {
        return -948262145 * this.this$0;
    }

    void init(Logger logger, int $i0) {
        int $i02;
        if (1 == $i0) {
            $i02 = logger.add(1735513523) * -258469943;
            $i0 = $i02;
            this.pos = $i02;
        } else if ($i0 == 2) {
            $i02 = logger.add(1509348201) * 1068562769;
            $i0 = $i02;
            this.target = $i02;
        } else if (3 == $i0) {
            this.value = logger.toString(659616838);
        } else if ($i0 == 4) {
            $i02 = logger.set(293935647) * -963166195;
            $i0 = $i02;
            this.width = $i02;
        } else if (5 == $i0) {
            logger.set(1862162258);
        } else if ($i0 == 6) {
            $i02 = logger.get((byte) 0) * 1354301917;
            $i0 = $i02;
            this.text = $i02;
        } else {
            if (7 == $i0) {
                $i0 = logger.get((byte) 0);
                if (($i0 & 1) == 0) {
                }
                if (2 == ($i0 & 2)) {
                }
            } else if (8 == $i0) {
                logger.get((byte) 0);
            } else if ($i0 >= 10 && $i0 <= 14) {
                this.header[$i0 - 10] = logger.toString(806008437);
            } else if (15 == $i0) {
                int $i2;
                $i0 = logger.get((byte) 0);
                this.key = new int[($i0 * 2)];
                for ($i2 = 0; $i2 < $i0 * 2; $i2++) {
                    this.key[$i2] = logger.getValue(1842880688);
                }
                logger.size(-263201305);
                this.values = new int[logger.get((byte) 0)];
                for ($i2 = 0; $i2 < this.values.length; $i2++) {
                    this.values[$i2] = logger.size(291511266);
                }
                this.state = new byte[$i0];
                for (int $i1 = 0; $i1 < $i0; $i1++) {
                    this.state[$i1] = logger.next(1247983979);
                }
            } else if (16 != $i0) {
                if (17 == $i0) {
                    this.file = logger.toString(875799906);
                } else if (18 == $i0) {
                    logger.add(1311035159);
                } else if ($i0 == 19) {
                    $i02 = logger.get(-1092902791) * 1018359203;
                    $i0 = $i02;
                    this.type = $i02;
                } else if ($i0 == 21) {
                    logger.size(-725212944);
                } else if ($i0 == 22) {
                    logger.size(139811978);
                } else if (23 == $i0) {
                    logger.get((byte) 0);
                    logger.get((byte) 0);
                    logger.get((byte) 0);
                } else if ($i0 == 24) {
                    logger.getValue(1277440516);
                    logger.getValue(1127702115);
                } else if ($i0 == 25) {
                    logger.add(1886111614);
                } else if ($i0 == 28) {
                    logger.get((byte) 0);
                } else if ($i0 == 29) {
                    this.name = (Hashtable) Calendar.add(new Hashtable[]{Hashtable.f129a, Hashtable.f130h, Hashtable.f131i}, logger.get((byte) 0), (byte) 107);
                } else if ($i0 == 30) {
                    this.content = (AsyncTask) Calendar.add(new AsyncTask[]{AsyncTask.f10y, AsyncTask.f9q, AsyncTask.f8g}, logger.get((byte) 0), (byte) 78);
                }
            }
        }
    }

    void init(Logger logger, int $i0, int i) {
        int $i02;
        if (1 == $i0) {
            $i02 = logger.add(1631124430) * -258469943;
            $i0 = $i02;
            this.pos = $i02;
        } else if ($i0 == 2) {
            $i02 = logger.add(1248445749) * 1068562769;
            $i0 = $i02;
            this.target = $i02;
        } else if (3 == $i0) {
            this.value = logger.toString(1932109879);
        } else if ($i0 == 4) {
            $i02 = logger.set(-1602399872) * -963166195;
            $i0 = $i02;
            this.width = $i02;
        } else if (5 == $i0) {
            logger.set(-1023942759);
        } else if ($i0 == 6) {
            $i02 = logger.get((byte) 0) * 1354301917;
            $i0 = $i02;
            this.text = $i02;
        } else {
            if (7 == $i0) {
                $i0 = logger.get((byte) 0);
                if (($i0 & 1) == 0) {
                }
                if (2 == ($i0 & 2)) {
                }
            } else if (8 == $i0) {
                logger.get((byte) 0);
            } else if ($i0 >= 10 && $i0 <= 14) {
                this.header[$i0 - 10] = logger.toString(1492017852);
            } else if (15 == $i0) {
                $i0 = logger.get((byte) 0);
                this.key = new int[($i0 * 2)];
                int $i3 = 0;
                while ($i3 < $i0 * 2) {
                    try {
                        this.key[$i3] = logger.getValue(1749168560);
                        $i3++;
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "ay.an(" + ')');
                    }
                }
                logger.size(189087352);
                this.values = new int[logger.get((byte) 0)];
                for ($i3 = 0; $i3 < this.values.length; $i3++) {
                    this.values[$i3] = logger.size(255459746);
                }
                byte[] bArr = new byte[$i0];
                byte[] $r11 = bArr;
                this.state = bArr;
                for (i = 0; i < $i0; i++) {
                    this.state[i] = logger.next(1247983979);
                }
            } else if (16 != $i0) {
                if (17 == $i0) {
                    this.file = logger.toString(519499249);
                } else if (18 == $i0) {
                    logger.add(1505114826);
                } else if ($i0 == 19) {
                    $i02 = logger.get(-1459698331) * 1018359203;
                    $i0 = $i02;
                    this.type = $i02;
                } else if ($i0 == 21) {
                    logger.size(578912514);
                } else if ($i0 == 22) {
                    logger.size(2008428201);
                } else if (23 == $i0) {
                    logger.get((byte) 0);
                    logger.get((byte) 0);
                    logger.get((byte) 0);
                } else if ($i0 == 24) {
                    logger.getValue(828088916);
                    logger.getValue(1176296493);
                } else if ($i0 == 25) {
                    logger.add(2006593998);
                } else if ($i0 == 28) {
                    logger.get((byte) 0);
                } else if ($i0 == 29) {
                    Hashtable[] $r8 = new Hashtable[3];
                    $r8[0] = Hashtable.f129a;
                    $r8[1] = Hashtable.f130h;
                    $r8[2] = Hashtable.f131i;
                    this.name = (Hashtable) Calendar.add($r8, logger.get((byte) 0), (byte) 60);
                } else if ($i0 == 30) {
                    AsyncTask[] $r12 = new AsyncTask[3];
                    $r12[0] = AsyncTask.f10y;
                    $r12[1] = AsyncTask.f9q;
                    $r12[2] = AsyncTask.f8g;
                    this.content = (AsyncTask) Calendar.add($r12, logger.get((byte) 0), (byte) 36);
                }
            }
        }
    }

    void next() {
        if (this.key != null) {
            for (int $i0 = 0; $i0 < this.key.length; $i0 += 2) {
                if (this.key[$i0] < this.last * -29744599) {
                    this.last = this.key[$i0] * -1507163214;
                } else if (this.key[$i0] > this.index * -1758761318) {
                    this.index = this.key[$i0] * -757308429;
                }
                if (this.key[$i0 + 1] < 27112099 * this.next) {
                    this.next = this.key[$i0 + 1] * -1156539369;
                } else if (this.key[$i0 + 1] > -211523553 * this.size) {
                    this.size = -1513457903 * this.key[$i0 + 1];
                }
            }
        }
    }

    public int order() {
        return 74279443 * this.this$0;
    }

    Long read(int i) {
        if (i < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) i);
        if ($r3 == null) {
            $r3 = AssertionError.get(InputStream.value, i, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) i);
            }
        }
        return $r3;
    }

    Long read(int i, int i2) {
        if (i < 0) {
            return null;
        }
        try {
            Long $r3 = (Long) context.get((long) i);
            if ($r3 == null) {
                $r3 = AssertionError.get(InputStream.value, i, 0, (byte) 0);
                if ($r3 != null) {
                    context.get($r3, (long) i);
                    return $r3;
                }
            }
            return $r3;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ay.ay(" + ')');
        }
    }

    public Long read(boolean z) {
        return read(z ? this.target * 1469181873 : this.pos * 1755658873, -1288408222);
    }

    void read() {
        if (this.key != null) {
            for (int $i0 = 0; $i0 < this.key.length; $i0 += 2) {
                if (this.key[$i0] < this.last * -29744599) {
                    this.last = this.key[$i0] * 710318617;
                } else if (this.key[$i0] > this.index * 1301316395) {
                    this.index = this.key[$i0] * 1348084611;
                }
                if (this.key[$i0 + 1] < -182181377 * this.next) {
                    this.next = this.key[$i0 + 1] * -296231425;
                } else if (this.key[$i0 + 1] > -211523553 * this.size) {
                    this.size = -1437527073 * this.key[$i0 + 1];
                }
            }
        }
    }

    void read(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, -1446242676);
            } else {
                return;
            }
        }
    }

    Long remove(int i) {
        if (i < 0) {
            return null;
        }
        Long $r3 = (Long) context.get((long) i);
        if ($r3 == null) {
            $r3 = AssertionError.get(InputStream.value, i, 0, (byte) 0);
            if ($r3 != null) {
                context.get($r3, (long) i);
            }
        }
        return $r3;
    }

    void remove() {
        if (this.key != null) {
            for (int $i0 = 0; $i0 < this.key.length; $i0 += 2) {
                if (this.key[$i0] < this.last * -14301413) {
                    this.last = this.key[$i0] * 710318617;
                } else if (this.key[$i0] > this.index * 343548947) {
                    this.index = this.key[$i0] * -318203334;
                }
                if (this.key[$i0 + 1] < -1934070577 * this.next) {
                    this.next = this.key[$i0 + 1] * -296231425;
                } else if (this.key[$i0 + 1] > -211523553 * this.size) {
                    this.size = 1813832181 * this.key[$i0 + 1];
                }
            }
        }
    }

    public int size() {
        return -2093583532 * this.this$0;
    }

    public int size(int i) {
        try {
            return 1733135393 * this.this$0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ay.as(" + ')');
        }
    }
}
