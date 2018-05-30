package p000;

/* compiled from: gf */
public abstract class File {
    public static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    static final int EXPIRES_ORDINAL = 17;
    static final int Id_slice = 15;
    static final int STATE_PAUSED_ROAMING = 12;
    public static Item this$0;
    public int buffer;
    public int count;
    public int data;
    public int index;
    public int length;
    public int pos;
    public int[] size;

    File(int i, int i2) {
        try {
            this(new int[(i * i2)], i, i2);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gf.<init>(" + ')');
        }
    }

    File(int[] iArr, int i, int i2) {
        try {
            this.count = 0;
            this.data = 0;
            this.buffer = 0;
            this.index = 0;
            add(iArr, i, i2, 483234143);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gf.<init>(" + ')');
        }
    }

    static void execute(int i) {
        try {
            Contact.text = Contact.text.trim();
            if (Contact.text.length() == 0) {
                TIntArrayList.append(R$id.max, R$id.logger, R$id.directory, (byte) -15);
                return;
            }
            long $l1 = Record.execute((byte) 14);
            switch (0 == $l1 ? 5 : Preconditions.read($l1, Contact.text, -1138585834)) {
                case 2:
                    TIntArrayList.append(R$id.view, R$id.entry, R$id.index, (byte) -127);
                    Contact.f109y = 847273666;
                    return;
                case 3:
                    TIntArrayList.append(R$id.status, R$id.receiver, R$id.filter, (byte) -95);
                    return;
                case 4:
                    TIntArrayList.append(R$id.context, R$id.provider, R$id.main, (byte) -5);
                    return;
                case 5:
                    TIntArrayList.append(R$id.start, R$id.secret, R$id.port, (byte) -99);
                    return;
                case 6:
                    TIntArrayList.append(R$id.server, R$id.from, R$id.result, (byte) -13);
                    return;
                case 7:
                    TIntArrayList.append(R$id.set, R$id.session, R$id.options, (byte) -75);
                    return;
                default:
                    return;
            }
            throw StringBuilder.append($r3, "gf.am(" + ')');
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gf.am(" + ')');
        }
    }

    static void update(boolean z, int i) {
        Contact.f109y = 0;
        if (z) {
            Contact.text = "";
            Contact.data = "";
            Page.f222n = 0;
            Context.value = "";
        }
    }

    public abstract void add();

    abstract void add(int i);

    public abstract void add(int i, int i2, int i3, int i4);

    public abstract void add(int i, int i2, int i3, int i4, byte b);

    public abstract void add(int i, int i2, int i3, int i4, int i5);

    public abstract void add(int i, int i2, int i3, int i4, int i5, byte b);

    abstract void add(int i, int i2, int i3, int i4, int i5, int i6);

    public final void add(int i, int $i1, int i2, int i3, int i4, int i5, int i6) {
        try {
            toString(i, $i1, i2, i4, i5, -712802515);
            toString(i, ($i1 + i3) - 1, i2, i4, i5, -921648429);
            if (i3 >= 3) {
                add(i, $i1 + 1, i3 - 2, i4, i5, -1591613633);
                add((i2 + i) - 1, $i1 + 1, i3 - 2, i4, i5, 655499326);
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gf.fw(" + ')');
        }
    }

    public final void add(int $i0, int $i1, int i, int[] iArr, int[] iArr2, byte b) {
        try {
            $i0 = ((this.length * -481290979) * $i1) + $i0;
            for ($i1 = 0; $i1 < iArr.length; $i1++) {
                int $i4 = iArr[$i1] + $i0;
                int $i6 = -iArr2[$i1];
                while ($i6 < 0) {
                    this.size[$i4] = i;
                    $i6++;
                    $i4++;
                }
                $i0 = (this.length * -481290979) + $i0;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gf.gs(" + ')');
        }
    }

    public abstract void add(Double doubleR, int i, int i2);

    public abstract void add(Double doubleR, int i, int i2, int i3, int i4);

    public abstract void add(Double doubleR, int i, int i2, short s);

    public abstract void add(Long longR, int i, int i2);

    public abstract void add(Long longR, int i, int i2, byte b);

    public abstract void add(Long longR, int i, int i2, int i3);

    public abstract void add(Long longR, int i, int i2, int i3, int i4);

    public abstract void add(Long longR, int i, int i2, int i3, int i4, int i5);

    abstract void add(Long longR, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void add(Long longR, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7);

    public abstract void add(Long longR, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8);

    abstract void add(Long longR, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void add(Long longR, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2);

    public abstract void add(Long longR, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, int i9);

    public abstract void add(Long longR, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2);

    public abstract void add(Long longR, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, int i7);

    public final void add(int[] iArr) {
        this.buffer = iArr[0] * -673133015;
        this.count = iArr[1] * -708039019;
        this.index = iArr[2] * -1229689680;
        this.data = iArr[3] * -2134198253;
    }

    public final void add(int[] iArr, int i) {
        try {
            this.buffer = iArr[0] * -673133015;
            this.count = iArr[1] * -708039019;
            this.index = iArr[2] * 1716422713;
            this.data = iArr[3] * 516632147;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gf.fy(" + ')');
        }
    }

    void add(int[] iArr, int $i0, int i, int i2) {
        try {
            this.size = iArr;
            this.length = 1606243637 * $i0;
            this.pos = -1639717589 * i;
            clear(2049579341);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gf.fe(" + ')');
        }
    }

    abstract void addAll();

    public final void append(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            get(i, i2, i3, i5, -1099522146);
            get(i, (i2 + i4) - 1, i3, i5, -1991171464);
            add(i, i2, i4, i5, (byte) 1);
            add((i + i3) - 1, i2, i4, i5, (byte) 1);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gf.fi(" + ')');
        }
    }

    public final void apply(int i, int $i1, int i2, int i3, int i4, int i5) {
        toString(i, $i1, i2, i4, i5, 1927503205);
        toString(i, ($i1 + i3) - 1, i2, i4, i5, 1306264535);
        if (i3 >= 3) {
            add(i, $i1 + 1, i3 - 2, i4, i5, -1801782594);
            add((i2 + i) - 1, $i1 + 1, i3 - 2, i4, i5, -138956316);
        }
    }

    public final void check(int i, int i2, int i3, int i4, int i5) {
        get(i, i2, i3, i5, -445820587);
        get(i, (i2 + i4) - 1, i3, i5, 40502588);
        add(i, i2, i4, i5, (byte) 1);
        add((i + i3) - 1, i2, i4, i5, (byte) 1);
    }

    public abstract void clear();

    public final void clear(int i) {
        try {
            this.buffer = 0;
            this.count = 0;
            this.index = 618797941 * this.length;
            this.data = 1087838073 * this.pos;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gf.fs(" + ')');
        }
    }

    public final void clear(int $i0, int i, int i2, int i3) {
        if (1829547545 * this.buffer < $i0) {
            this.buffer = -673133015 * $i0;
        }
        if (this.count * 1561088547 < i) {
            this.count = -708039019 * i;
        }
        if (this.index * 90576357 > i2) {
            this.index = 1037947376 * i2;
        }
        if (this.data * -467581477 > i3) {
            this.data = 516632147 * i3;
        }
    }

    public final void clear(int $i0, int $i1, int i, int[] iArr, int[] iArr2) {
        $i0 = ((this.length * -481290979) * $i1) + $i0;
        for ($i1 = 0; $i1 < iArr.length; $i1++) {
            int $i3 = iArr[$i1] + $i0;
            int $i5 = -iArr2[$i1];
            while ($i5 < 0) {
                this.size[$i3] = i;
                $i5++;
                $i3++;
            }
            $i0 += -2067791400 * this.length;
        }
    }

    public abstract void clear(Long longR, int i, int i2);

    public abstract void clear(Long longR, int i, int i2, int i3);

    public abstract void clear(Long longR, int i, int i2, int i3, int i4);

    public final void clear(int[] iArr) {
        this.buffer = iArr[0] * -673133015;
        this.count = iArr[1] * -708039019;
        this.index = iArr[2] * -1434604653;
        this.data = iArr[3] * 516632147;
    }

    void clear(int[] iArr, int $i0, int i) {
        this.size = iArr;
        this.length = 377841318 * $i0;
        this.pos = -1639717589 * i;
        clear(1547533115);
    }

    public final void close(int $i1, int $i2, int $i3, int $i4, int i) {
        if ($i1 < 0) {
            $i1 = 0;
        }
        if ($i2 < 0) {
            $i2 = 0;
        }
        try {
            if ($i3 > this.length * -481290979) {
                $i3 = -481290979 * this.length;
            }
            if ($i4 > this.pos * 1005433219) {
                $i4 = this.pos * 1005433219;
            }
            this.buffer = -673133015 * $i1;
            this.count = -708039019 * $i2;
            this.index = 1716422713 * $i3;
            this.data = 516632147 * $i4;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gf.fj(" + ')');
        }
    }

    public abstract void contains(int i, int i2, int i3, int i4);

    public abstract void contains(int i, int i2, int i3, int i4, int i5);

    public abstract void contains(Long longR, int i, int i2, int i3, int i4);

    public final void create(int i, int $i1, int i2, int i3, int i4, int i5) {
        toString(i, $i1, i2, i4, i5, -1964864713);
        toString(i, ($i1 + i3) - 1, i2, i4, i5, -1261894111);
        if (i3 >= 3) {
            add(i, $i1 + 1, i3 - 2, i4, i5, -656982447);
            add((i2 + i) - 1, $i1 + 1, i3 - 2, i4, i5, -1697264988);
        }
    }

    public abstract void decode(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void decode(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public abstract void encode(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    void gc(int[] iArr, int $i0, int i) {
        this.size = iArr;
        this.length = 1606243637 * $i0;
        this.pos = -1639717589 * i;
        clear(1665162323);
    }

    public abstract void get(int i);

    public abstract void get(int i, int i2, int i3, int i4, int i5);

    public abstract void get(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void get(Long longR, int i, int i2, int i3);

    public abstract void get(Long longR, int i, int i2, int i3, int i4);

    public abstract void get(Long longR, int i, int i2, int i3, int i4, byte b);

    public void get(Long longR, int $i0, int $i1, int i, int i2, int i3) {
        try {
            add(longR, longR.this$0 << 3, longR.count << 3, $i0 << 4, $i1 << 4, i, i2, 1549469807);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gf.gp(" + ')');
        }
    }

    public abstract void getBytes(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void getBytes(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z);

    public abstract void indexOf(int i, int i2, int i3, int i4, int i5);

    public abstract void init(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void init(Long longR, int i, int i2, int i3, int i4, int i5);

    public abstract void init(Long longR, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7);

    public final void init(int[] iArr) {
        this.buffer = iArr[0] * -457624710;
        this.count = iArr[1] * -708039019;
        this.index = iArr[2] * 558317067;
        this.data = iArr[3] * 427165473;
    }

    public abstract void insert(int i, int i2, int i3, int i4, int i5);

    public abstract void insert(Long longR, int i, int i2, int i3, int i4);

    public final void move(int $i0, int $i1, int i, int[] iArr, int[] iArr2) {
        $i0 = ((this.length * -481290979) * $i1) + $i0;
        for ($i1 = 0; $i1 < iArr.length; $i1++) {
            int $i3 = iArr[$i1] + $i0;
            int $i5 = -iArr2[$i1];
            while ($i5 < 0) {
                this.size[$i3] = i;
                $i5++;
                $i3++;
            }
            $i0 += this.length * -481290979;
        }
    }

    public abstract void next(int i, int i2, int i3, int i4);

    abstract void next(int i, int i2, int i3, int i4, int i5);

    public abstract void next(Long longR, int i, int i2, int i3, int i4);

    public abstract void next(Long longR, int i, int i2, int i3, int i4, int i5);

    public final void next(int[] iArr) {
        iArr[0] = this.buffer * 1503408326;
        iArr[1] = 407587899 * this.count;
        iArr[2] = -207083326 * this.index;
        iArr[3] = -467581477 * this.data;
    }

    public abstract void parse(Long longR, int i, int i2, int i3, int i4);

    abstract void read(int i, int i2, int i3, int i4, int i5);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6, byte b);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, short s);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z);

    public abstract void read(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z, byte b);

    public abstract void read(Long longR, int i, int i2);

    public abstract void read(Long longR, int i, int i2, int i3);

    public abstract void read(Long longR, int i, int i2, int i3, int i4);

    public abstract void read(Long longR, int i, int i2, int i3, int i4, int i5);

    public abstract void read(Long longR, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void read(Long longR, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7);

    public abstract void readInt(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public final void readObject() {
        this.buffer = 0;
        this.count = 0;
        this.index = 618797941 * this.length;
        this.data = 1087838073 * this.pos;
    }

    public final void readObject(int $i0, int $i1, int $i2, int $i3) {
        if ($i0 < 0) {
            $i0 = 0;
        }
        if ($i1 < 0) {
            $i1 = 0;
        }
        if ($i2 > -1771339754 * this.length) {
            $i2 = -81639018 * this.length;
        }
        if ($i3 > this.pos * 1005433219) {
            $i3 = this.pos * 1005433219;
        }
        this.buffer = -673133015 * $i0;
        this.count = 432305505 * $i1;
        this.index = -902083746 * $i2;
        this.data = 516632147 * $i3;
    }

    public void readObject(Long longR, int $i0, int $i1, int i, int i2) {
        add(longR, longR.this$0 << 3, longR.count << 3, $i0 << 4, $i1 << 4, i, i2, 1639669391);
    }

    public final void readObject(int[] iArr) {
        this.buffer = iArr[0] * -673133015;
        this.count = iArr[1] * -708039019;
        this.index = iArr[2] * 1716422713;
        this.data = iArr[3] * 516632147;
    }

    void readObject(int[] iArr, int $i0, int i) {
        this.size = iArr;
        this.length = 1606243637 * $i0;
        this.pos = -1639717589 * i;
        clear(1360295741);
    }

    abstract void remove();

    public abstract void remove(int i, int i2, int i3, int i4);

    public abstract void remove(int i, int i2, int i3, int i4, int i5);

    public abstract void remove(Double doubleR, int i, int i2);

    public abstract void remove(Long longR, int i, int i2, int i3);

    public abstract void remove(Long longR, int i, int i2, int i3, int i4);

    abstract void removeAll();

    abstract void search(int i, int i2, int i3, int i4, int i5);

    abstract void set();

    public abstract void set(int i, int i2, int i3, int i4);

    abstract void set(int i, int i2, int i3, int i4, int i5);

    public abstract void set(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void set(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void set(Long longR, int i, int i2, int i3);

    public abstract void set(Long longR, int i, int i2, int i3, int i4);

    public abstract void set(Long longR, int i, int i2, int i3, int i4, int i5);

    public abstract void set(Long longR, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7);

    public abstract void set(Long longR, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2);

    public abstract void set(Long longR, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2);

    public final void set(int[] iArr) {
        this.buffer = iArr[0] * 2030259670;
        this.count = iArr[1] * -186777323;
        this.index = iArr[2] * 1244645682;
        this.data = iArr[3] * 516632147;
    }

    public final void setData(int i, int i2, int i3, int i4, int i5) {
        get(i, i2, i3, i5, -2112458190);
        get(i, (i2 + i4) - 1, i3, i5, -429085534);
        add(i, i2, i4, i5, (byte) 1);
        add((i + i3) - 1, i2, i4, i5, (byte) 1);
    }

    public final void setData(int[] iArr) {
        iArr[0] = this.buffer * -1891494550;
        iArr[1] = 2085489788 * this.count;
        iArr[2] = -1994033133 * this.index;
        iArr[3] = 239966695 * this.data;
    }

    public final void setExecutable(int i, int $i1, int i2, int i3, int i4, int i5) {
        toString(i, $i1, i2, i4, i5, 25685908);
        toString(i, ($i1 + i3) - 1, i2, i4, i5, 545072844);
        if (i3 >= 3) {
            add(i, $i1 + 1, i3 - 2, i4, i5, -1803217581);
            add((i2 + i) - 1, $i1 + 1, i3 - 2, i4, i5, 1641131917);
        }
    }

    public abstract void size(Long longR, int i, int i2, int i3, int i4);

    public final void skip(int $i0, int $i1, int $i2, int $i3) {
        if ($i0 < 0) {
            $i0 = 0;
        }
        if ($i1 < 0) {
            $i1 = 0;
        }
        if ($i2 > this.length * -481290979) {
            $i2 = -481290979 * this.length;
        }
        if ($i3 > 1005433219 * this.pos) {
            $i3 = this.pos * -1002042985;
        }
        this.buffer = -673133015 * $i0;
        this.count = -708039019 * $i1;
        this.index = 1716422713 * $i2;
        this.data = 516632147 * $i3;
    }

    public abstract void skip(int i, int i2, int i3, int i4, int i5);

    public final void skip(int $i0, int $i1, int i, int[] iArr, int[] iArr2) {
        $i0 = ((this.length * -481290979) * $i1) + $i0;
        for ($i1 = 0; $i1 < iArr.length; $i1++) {
            int $i3 = iArr[$i1] + $i0;
            int $i5 = -iArr2[$i1];
            while ($i5 < 0) {
                this.size[$i3] = i;
                $i5++;
                $i3++;
            }
            $i0 += this.length * -481290979;
        }
    }

    public final void skip(int[] iArr) {
        iArr[0] = this.buffer * 1829547545;
        iArr[1] = -12571459 * this.count;
        iArr[2] = 2074797577 * this.index;
        iArr[3] = -467581477 * this.data;
    }

    abstract void toArray(int i, int i2, int i3, int i4, int i5);

    public abstract void toArray(Long longR, int i, int i2, int i3);

    abstract void toByteArray(int i, int i2, int i3, int i4, int i5);

    public abstract void toByteArray(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void toByteArray(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z);

    abstract void toString(int i, int i2, int i3, int i4, int i5);

    abstract void toString(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void toString(Double doubleR, int i, int i2, int i3, int i4);

    public abstract void toString(Double doubleR, int i, int i2, int i3, int i4, int i5);

    public abstract void toString(Long longR, int i, int i2, int i3, int i4);

    public abstract void toString(Long longR, int i, int i2, int i3, int i4, int i5);

    public final void write() {
        this.buffer = 0;
        this.count = 0;
        this.index = 618797941 * this.length;
        this.data = 1087838073 * this.pos;
    }

    public final void write(int $i0, int i, int i2, int i3) {
        if (1829547545 * this.buffer < $i0) {
            this.buffer = -673133015 * $i0;
        }
        if (this.count * -12571459 < i) {
            this.count = -708039019 * i;
        }
        if (this.index * 2074797577 > i2) {
            this.index = 1716422713 * i2;
        }
        if (this.data * -467581477 > i3) {
            this.data = 516632147 * i3;
        }
    }

    public final void write(int $i0, int i, int i2, int i3, int i4) {
        try {
            if (1829547545 * this.buffer < $i0) {
                this.buffer = -673133015 * $i0;
            }
            if (this.count * -12571459 < i) {
                this.count = -708039019 * i;
            }
            if (this.index * 2074797577 > i2) {
                this.index = 1716422713 * i2;
            }
            if (this.data * -467581477 > i3) {
                this.data = 516632147 * i3;
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gf.fx(" + ')');
        }
    }

    public abstract void write(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void write(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public final void write(int $i0, int $i1, int i, int[] iArr, int[] iArr2) {
        $i0 = ((this.length * -481290979) * $i1) + $i0;
        for ($i1 = 0; $i1 < iArr.length; $i1++) {
            int $i3 = iArr[$i1] + $i0;
            int $i5 = -iArr2[$i1];
            while ($i5 < 0) {
                this.size[$i3] = i;
                $i5++;
                $i3++;
            }
            $i0 += this.length * -481290979;
        }
    }

    public abstract void write(Double doubleR, int i, int i2);

    public abstract void write(Long longR, int i, int i2, int i3);

    public abstract void write(Long longR, int i, int i2, int i3, int i4);

    public abstract void write(Long longR, int i, int i2, int i3, int i4, int i5);

    public final void write(int[] iArr) {
        iArr[0] = this.buffer * 2017239917;
        iArr[1] = 1477915039 * this.count;
        iArr[2] = 2074797577 * this.index;
        iArr[3] = -1397399714 * this.data;
    }

    public final void write(int[] iArr, int i) {
        try {
            iArr[0] = this.buffer * 1829547545;
            iArr[1] = -12571459 * this.count;
            iArr[2] = 2074797577 * this.index;
            iArr[3] = -467581477 * this.data;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gf.ft(" + ')');
        }
    }

    void write(int[] iArr, int $i0, int i) {
        this.size = iArr;
        this.length = 1606243637 * $i0;
        this.pos = -1639717589 * i;
        clear(1720951607);
    }

    abstract void writeObject();
}
