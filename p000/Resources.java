package p000;

/* compiled from: ej */
public class Resources extends StringBuffer {
    static final int DELAY_WAIT_FOR_RUNNER_TO_STOP = 500;
    static final int NUMBER = 25;
    static final int N_100 = 100;
    static final int TAG_DEST_LATITUDE_REF = 19;
    public int f273a;
    public String key;
    int length;
    final Scalar log;
    final Scriptable parent;
    public byte state;
    public String value;

    public Resources(Scalar scalar, Scriptable scriptable) {
        try {
            super(100);
            this.key = null;
            this.value = null;
            this.length = -487339143;
            this.log = scalar;
            this.parent = scriptable;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ej.<init>(" + ')');
        }
    }

    static final short add(float $f0, float $f1, int $i0, int $i1, int i) {
        return (short) ((((int) (($f0 + 1.0f) * 64.0f)) + ($i0 >> 1)) | ((((int) ((1.0f + $f1) * 64.0f)) + ($i1 >> 1)) << 8));
    }

    static void add(File file, byte b) {
        try {
            file.add(GifDecoder.value, Contact.state * 286016249, 0, (byte) -12);
            file.add(Contact.left, (Contact.state * 286016249) + 382, 0, (byte) -42);
            file.add(Document.f115y, ((Contact.state * 286016249) + 382) - (Document.f115y.length / 2), 18, (short) 11017);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ej.au(" + ')');
        }
    }

    public static boolean add(CharSequence charSequence, int i) {
        try {
            return HashMap.decode(charSequence, 10, true, -1223495630);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ej.af(" + ')');
        }
    }

    static final void init(Handler handler, int i) {
        try {
            handler.debug(1565299499);
            i = client.flags * -1522892003;
            Item[] $r1 = client.size;
            Item $r2 = new Item();
            $r1[i] = $r2;
            File.this$0 = $r2;
            $r2.f163n = -1174618595 * i;
            int $i1 = handler.add(30, (byte) 2);
            byte $b3 = (byte) ($i1 >> 28);
            int $i2 = ($i1 >> 14) & 16383;
            $i1 &= 16383;
            $r2.this$0[0] = $i2 - (Build$VERSION.type * 1407993063);
            $r2.size = (($r2.this$0[0] << 7) + ($r2.getKey(-1945749563) << 6)) * 1506829721;
            $r2.length[0] = $i1 - (Level.type * 1289967967);
            $r2.value = (($r2.length[0] << 7) + ($r2.getKey(-2071658760) << 6)) * -1638712607;
            $i1 = -1345790225 * $b3;
            $r2.context = $i1;
            Msg.size = $i1 * -1742053899;
            if (Database.id[i] != null) {
                $r2.add(Database.id[i], -1248088380);
            }
            Database.size = 0;
            int[] $r3 = Database.next;
            $i1 = Database.size - 1328615221;
            Database.size = $i1;
            $r3[($i1 * -1675758365) - 1] = i;
            Database.type[i] = (byte) 0;
            Database.state = 0;
            for ($i1 = 1; $i1 < Constants.ACC_STRICT; $i1++) {
                if ($i1 != i) {
                    $i2 = handler.add(18, (byte) -91);
                    int $i4 = $i2 >> 16;
                    int $i5 = ($i2 >> 8) & 597;
                    Database.values[$i1] = ($i2 & 597) + (($i4 << 28) + ($i5 << 14));
                    Database.$assertionsDisabled[$i1] = 0;
                    Database.name[$i1] = -1;
                    $r3 = Database.key;
                    $i2 = Database.state - 948652261;
                    Database.state = $i2;
                    $r3[($i2 * -844313837) - 1] = $i1;
                    Database.type[$i1] = (byte) 0;
                }
            }
            handler.create(1885733558);
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "ej.af(" + ')');
        }
    }

    static CharSequence toString(int $i0, int i, int i2) {
        try {
            CharSequence $r2 = (CharSequence) CharSequence.this$0.get((long) ($i0 << 16));
            if ($r2 != null) {
                return $r2;
            }
            i = Envelope.data.get(String.valueOf($i0), -195658242);
            if (-1 != i) {
                byte[] $r8 = Envelope.data.add(i, (byte) 94);
                if ($r8 != null) {
                    if ($r8.length <= 1) {
                        return null;
                    }
                    $r2 = Main.read($r8, 683716154);
                    if ($r2 != null) {
                        CharSequence.this$0.get($r2, (long) ($i0 << 16));
                        return $r2;
                    }
                }
            }
            return null;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ej.ad(" + ')');
        }
    }

    public final void add() {
        for (int $i0 = 0; $i0 < get(1721969291); $i0++) {
            ((Cell) get($i0, 1851739537)).get(1958281519);
        }
    }

    public final void add(int i) {
        i = 0;
        while (i < get(1088989546)) {
            try {
                ((Cell) get(i, 2021897416)).get(1994998957);
                i++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ej.dl(" + ')');
            }
        }
    }

    final void add(Cell cell) {
        if (cell.getKey(1857062602).equals(this.parent.getEntry(1890059345))) {
            this.f273a = -596937871 * cell.count;
        }
    }

    final void add(Cell cell, int i) {
        try {
            if (cell.getKey(1861909674).equals(this.parent.getEntry(-979886233))) {
                this.f273a = -596937871 * cell.count;
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ej.da(" + ')');
        }
    }

    public final void add(Logger logger) {
        JSONObject $r2 = new JSONObject(logger.toString(957009174), this.log);
        int $i0 = logger.get(-1366139518);
        byte $b1 = logger.next(1247983979);
        boolean $z0 = false;
        if ($b1 == Byte.MIN_VALUE) {
            $z0 = true;
        }
        if (!$z0) {
            logger.toString(1413849048);
            Cell $r6 = (Cell) get($r2, 1099558325);
            if ($r6 == null) {
                if (get(1326703818) <= -1405975609 * this.records) {
                    $r6 = (Cell) read($r2, -26527899);
                } else {
                    return;
                }
            }
            int $i2 = this.length - 487339143;
            this.length = $i2;
            $r6.add($i0, ($i2 * 1095872201) - 1, -1696302622);
            $r6.count = 862083601 * $b1;
            add($r6, -1667957683);
        } else if (get(1856065286) != 0) {
            State $r62 = (Cell) get($r2, 1099558325);
            if ($r62 != null && $r62.write((byte) -75) == $i0) {
                toString($r62, 2142124456);
            }
        }
    }

    public final void add(Logger logger, int i) {
        try {
            JSONObject $r2 = new JSONObject(logger.toString(1937771875), this.log);
            i = logger.get(-1435758005);
            byte $b2 = logger.next(1247983979);
            boolean $z0 = false;
            if ($b2 == Byte.MIN_VALUE) {
                $z0 = true;
            }
            if (!$z0) {
                logger.toString(263911569);
                Cell $r6 = (Cell) get($r2, 1099558325);
                if ($r6 == null) {
                    if (get(1489018673) <= -1405975609 * this.records) {
                        $r6 = (Cell) read($r2, 1800801941);
                    }
                }
                int $i3 = this.length - 487339143;
                this.length = $i3;
                $r6.add(i, ($i3 * 1095872201) - 1, -250274758);
                $r6.count = 862083601 * $b2;
                add($r6, -1694878805);
            } else if (get(1671749416) != 0) {
                State $r62 = (Cell) get($r2, 1099558325);
                if ($r62 != null) {
                    if ($r62.write((byte) 41) == i) {
                        toString($r62, 2142124456);
                    }
                }
            }
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "ej.dd(" + ')');
        }
    }

    final void add(String $r1) {
        this.key = Region.decode($r1, (byte) 40);
    }

    final void add(String $r1, byte b) {
        try {
            this.key = Region.decode($r1, (byte) 3);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ej.dt(" + ')');
        }
    }

    final void add(String $r1, int i) {
        try {
            this.value = Region.decode($r1, (byte) -38);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ej.dz(" + ')');
        }
    }

    public final void clear() {
        for (int $i0 = 0; $i0 < get(1367989114); $i0++) {
            ((Cell) get($i0, 1523437845)).set(183908766);
        }
    }

    State copy() {
        return new Cell();
    }

    final void copy(String $r1) {
        this.value = Region.decode($r1, (byte) -20);
    }

    State equals() {
        return new Cell();
    }

    State[] getValue(int i) {
        return new Cell[i];
    }

    public final void init(Logger logger) {
        add(logger.toString(506516487), -730581979);
        add(Document.decode(logger.replace(-633385453)), (byte) 46);
        this.state = logger.next(1247983979);
        int $i2 = logger.get((byte) 0);
        if ($i2 != 255) {
            set(-339705518);
            for (int $i3 = 0; $i3 < $i2; $i3++) {
                Cell $r6 = (Cell) read(new JSONObject(logger.toString(606863331), this.log), 940165911);
                int $i4 = logger.get(-2018080320);
                int $i5 = this.length - 487339143;
                this.length = $i5;
                $r6.add($i4, ($i5 * 1095872201) - 1, 1653570432);
                $r6.count = logger.next(1247983979) * 862083601;
                logger.toString(1101567892);
                add($r6, -1840213562);
            }
        }
    }

    public final void isEmpty() {
        for (int $i0 = 0; $i0 < get(1389363165); $i0++) {
            ((Cell) get($i0, 413379361)).get(1810808290);
        }
    }

    public final void parse(Logger logger) {
        add(logger.toString(1801228949), -820538781);
        add(Document.decode(logger.replace(-633385453)), (byte) 79);
        this.state = logger.next(1247983979);
        int $i2 = logger.get((byte) 0);
        if ($i2 != -907327413) {
            set(-855616034);
            for (int $i3 = 0; $i3 < $i2; $i3++) {
                Cell $r6 = (Cell) read(new JSONObject(logger.toString(801109443), this.log), -589740713);
                int $i4 = logger.get(157863324);
                int $i5 = this.length - 671355879;
                this.length = $i5;
                $r6.add($i4, ($i5 * 1587755087) - 1, 2070010600);
                $r6.count = logger.next(1247983979) * -423409601;
                logger.toString(629573973);
                add($r6, -1670078609);
            }
        }
    }

    public final void parse(Logger logger, int i) {
        try {
            add(logger.toString(918486489), -1609810255);
            add(Document.decode(logger.replace(-633385453)), (byte) 95);
            this.state = logger.next(1247983979);
            i = logger.get((byte) 0);
            if (i != 255) {
                set(2061346352);
                for (int $i3 = 0; $i3 < i; $i3++) {
                    Cell $r6 = (Cell) read(new JSONObject(logger.toString(284225182), this.log), -988323740);
                    int $i4 = logger.get(-863343103);
                    int $i5 = this.length - 487339143;
                    this.length = $i5;
                    $r6.add($i4, ($i5 * 1095872201) - 1, 342240317);
                    $r6.count = logger.next(1247983979) * 862083601;
                    logger.toString(1017285183);
                    add($r6, -1592207185);
                }
            }
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "ej.dv(" + ')');
        }
    }

    public final void read(Logger logger) {
        add(logger.toString(1128961780), -2137544687);
        add(Document.decode(logger.replace(-633385453)), (byte) 90);
        this.state = logger.next(1247983979);
        int $i2 = logger.get((byte) 0);
        if ($i2 != 255) {
            set(549555891);
            for (int $i3 = 0; $i3 < $i2; $i3++) {
                Cell $r6 = (Cell) read(new JSONObject(logger.toString(870615439), this.log), 1538932693);
                int $i4 = logger.get(-1520337259);
                int $i5 = this.length + 267747698;
                this.length = $i5;
                $r6.add($i4, ($i5 * 877071669) - 1, 1043320814);
                $r6.count = logger.next(1247983979) * 415709903;
                logger.toString(747658163);
                add($r6, -1638913296);
            }
        }
    }

    final void set(Cell cell) {
        if (cell.getKey(2093813301).equals(this.parent.getEntry(1022541960))) {
            this.f273a = -942363319 * cell.count;
        }
    }

    final void set(String $r1) {
        this.key = Region.decode($r1, (byte) 77);
    }

    public final void setValue() {
        for (int $i0 = 0; $i0 < get(1871158370); $i0++) {
            ((Cell) get($i0, 304739074)).get(1876100727);
        }
    }

    final void setValue(String $r1) {
        this.value = Region.decode($r1, (byte) -61);
    }

    State[] setValue(int i) {
        return new Cell[i];
    }

    State[] toByteArray(int i) {
        return new Cell[i];
    }

    State toString(byte b) {
        try {
            return new Cell();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ej.ao(" + ')');
        }
    }

    final void toString(Cell cell) {
        if (cell.getKey(1767712669).equals(this.parent.getEntry(436494427))) {
            this.f273a = -596937871 * cell.count;
        }
    }

    State[] toString(int i, int i2) {
        try {
            return new Cell[i];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ej.ax(" + ')');
        }
    }

    public final void validate() {
        for (int $i0 = 0; $i0 < get(1610802634); $i0++) {
            ((Cell) get($i0, 929605524)).set(-1590479693);
        }
    }

    public final void validate(int i) {
        i = 0;
        while (i < get(1954793795)) {
            try {
                ((Cell) get(i, 1158922305)).set(1996251453);
                i++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ej.di(" + ')');
            }
        }
    }
}
