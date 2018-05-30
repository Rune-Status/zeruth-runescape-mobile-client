package p000;

import java.io.File;
import java.io.IOException;
import java.util.zip.CRC32;

/* compiled from: kh */
public class HttpRequest extends Class {
    public static final int Theme_listPopupWindowStyle = 68;
    static CRC32 path = new CRC32();
    int data;
    int method;
    int name;
    boolean port;
    Properties pos;
    Properties size;
    volatile boolean[] this$0;
    int uri;
    volatile boolean value;

    public HttpRequest(Properties properties, Properties properties2, int $i0, boolean z, boolean z2, boolean z3) {
        try {
            super(z, z2);
            this.value = false;
            this.port = false;
            this.name = -1341935297;
            this.size = properties;
            this.pos = properties2;
            this.data = -674852995 * $i0;
            this.port = z3;
            $i0 = -984505899 * this.data;
            if (Select.buffer != null) {
                Select.buffer.data = 1735125103 + (-659773672 * $i0);
                add(Select.buffer.size(-93885965), Select.buffer.size(1239912081), (byte) 41);
                return;
            }
            TFloatArrayList.add(null, 255, 255, 0, (byte) 0, true, (short) 27489);
            MappedRandomAccessFile.flags[$i0] = this;
        } catch (Throwable $r5) {
            throw StringBuilder.append($r5, "kh.<init>(" + ')');
        }
    }

    public static ByteArrayBuffer get(String str, String str2, boolean z, int i) {
        try {
            File $r2 = new File(Helper.context, "preferences" + str + ".dat");
            if ($r2.exists()) {
                try {
                    return new ByteArrayBuffer($r2, Diff.WRITE_MODE, 10000);
                } catch (IOException e) {
                }
            }
            String $r5 = "";
            if (ThemeDialog.name * -1064806823 == 33) {
                $r5 = "_rc";
            } else if (ThemeDialog.name * -1064806823 == 34) {
                $r5 = "_wip";
            }
            File $r3 = new File(AbstractParser.context, "jagex_" + str2 + "_preferences" + str + $r5 + ".dat");
            if (!z) {
                if ($r3.exists()) {
                    try {
                        return new ByteArrayBuffer($r3, Diff.WRITE_MODE, 10000);
                    } catch (IOException e2) {
                    }
                }
            }
            return new ByteArrayBuffer($r2, Diff.WRITE_MODE, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        } catch (RuntimeException $r11) {
            throw StringBuilder.append($r11, "kh.af(" + ')');
        }
    }

    public void add(int $i0, int i, byte b) {
        try {
            this.uri = -1745991667 * $i0;
            this.method = -5828757 * i;
            if (this.pos != null) {
                $i0 = -984505899 * this.data;
                Properties $r1 = this.pos;
                byte[] $r3 = Channel.this$0.get($i0, $r1, 404437947);
                if ($r3 != null) {
                    toString($r1, $i0, $r3, true, 126670934);
                    return;
                }
                toString($r1, $i0, $r1.read($i0, 1975280112), true, -896826150);
                return;
            }
            TFloatArrayList.add(this, 255, -984505899 * this.data, 1928021701 * this.uri, (byte) 0, true, (short) 6759);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "kh.ec(" + ')');
        }
    }

    void call() {
        this.this$0 = new boolean[this.this$0.length];
        for (int $i1 = 0; $i1 < this.this$0.length; $i1++) {
            this.this$0[$i1] = false;
        }
        if (this.size == null) {
            this.value = true;
        } else {
            this.name = -1341935297;
            for (int $i0 = 0; $i0 < this.this$0.length; $i0++) {
                if (this.size[$i0] > 0) {
                    MyAsyncTask.read($i0, this.size, this, -174818168);
                    this.name = 1341935297 * $i0;
                }
            }
            if (this.name * 238108993 == -1) {
                this.value = true;
            }
        }
    }

    void connect(int i) {
        if (this.size == null || this.this$0 == null || !this.this$0[i]) {
            TFloatArrayList.add(this, 1608729264 * this.data, i, this.id[i], (byte) 2, true, (short) 12897);
            return;
        }
        Properties $r1 = this.size;
        byte[] $r4 = Channel.this$0.get(i, $r1, 404437947);
        if ($r4 != null) {
            toString($r1, i, $r4, true, -2082521301);
            return;
        }
        toString($r1, i, $r1.read(i, 2045988551), true, -786164057);
    }

    public int convert() {
        if (this.value) {
            return 100;
        }
        if (this.this$0 == null) {
            int $i0 = Tag.toString(255, -984505899 * this.data, -616538746);
            if ($i0 < 100) {
                return $i0;
            }
        }
        return 99;
    }

    int decode(int $i0, int i) {
        try {
            return this.this$0[$i0] != null ? 100 : this.this$0[$i0] ? 100 : Tag.toString(-984505899 * this.data, $i0, -616538746);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "kh.aj(" + ')');
        }
    }

    public int encode() {
        if (this.value) {
            return 100;
        }
        if (this.this$0 == null) {
            int $i0 = Tag.toString(255, -984505899 * this.data, -616538746);
            if ($i0 < 100) {
                return $i0;
            }
        }
        return 99;
    }

    int encode(int $i0) {
        return this.this$0[$i0] != null ? 100 : !this.this$0[$i0] ? Tag.toString(-984505899 * this.data, $i0, -616538746) : 100;
    }

    public int equals() {
        if (this.value) {
            return -281460423;
        }
        if (this.this$0 != null) {
            return -1251138217;
        }
        int $i0 = Tag.toString(255, -984505899 * this.data, -616538746);
        return $i0 >= 1133268460 ? -1701356861 : $i0;
    }

    public boolean equals(int i) {
        return getKey(i, -1719747825) != null;
    }

    void execute() {
        this.this$0 = new boolean[this.this$0.length];
        for (int $i1 = 0; $i1 < this.this$0.length; $i1++) {
            this.this$0[$i1] = false;
        }
        if (this.size == null) {
            this.value = true;
            return;
        }
        this.name = -1341935297;
        for (int $i0 = 0; $i0 < this.this$0.length; $i0++) {
            if (this.size[$i0] > 0) {
                MyAsyncTask.read($i0, this.size, this, -1555677738);
                this.name = 1341935297 * $i0;
            }
        }
        if (this.name * 238108993 == -1) {
            this.value = true;
        }
    }

    void execute(Properties properties, int $i0, byte[] bArr, boolean $z0) {
        int $i3;
        if (properties != this.pos) {
            if (!$z0 && $i0 == 238108993 * this.name) {
                this.value = true;
            }
            if (bArr == null || bArr.length <= 2) {
                this.this$0[$i0] = false;
                if (this.port || $z0) {
                    TFloatArrayList.add(this, -984505899 * this.data, $i0, this.id[$i0], (byte) 2, $z0, (short) 26731);
                    return;
                }
            }
            path.reset();
            path.update(bArr, 0, bArr.length - 2);
            $i3 = (bArr[bArr.length - 1] & (short) 255) + ((bArr[bArr.length - 2] & (short) 255) << 8);
            if (this.id[$i0] == ((int) path.getValue()) && this.value[$i0] == $i3) {
                this.this$0[$i0] = true;
                if ($z0) {
                    this.this$0[$i0] = Level.toString(bArr, false, 2083015527);
                    return;
                }
            }
            this.this$0[$i0] = false;
            if (this.port || $z0) {
                TFloatArrayList.add(this, -984505899 * this.data, $i0, this.id[$i0], (byte) 2, $z0, (short) 5776);
            }
        } else if (this.value) {
            throw new RuntimeException();
        } else if (bArr == null) {
            TFloatArrayList.add(this, 255, -984505899 * this.data, this.uri * 1928021701, (byte) 0, true, (short) 29384);
        } else {
            path.reset();
            path.update(bArr, 0, bArr.length);
            int $i32 = this.uri * 1928021701;
            $i3 = $i32;
            if ($i32 != ((int) path.getValue())) {
                TFloatArrayList.add(this, 255, -984505899 * this.data, 1928021701 * this.uri, (byte) 0, true, (short) 10251);
                return;
            }
            Logger logger = new Logger(Geometry.add(bArr, Byte.MAX_VALUE));
            int $i1 = logger.get((byte) 0);
            if ($i1 == 5 || $i1 == 6) {
                if (($i1 >= 6 ? logger.size(-230176575) : 0) != this.method * -406477501) {
                    TFloatArrayList.add(this, 255, -984505899 * this.data, 1928021701 * this.uri, (byte) 0, true, (short) 3239);
                    return;
                }
                init(bArr, -1666972764);
                toString((byte) -1);
                return;
            }
            throw new RuntimeException($i1 + "," + (this.data * -984505899) + "," + $i0);
        }
    }

    public int format() {
        int $i2 = 0;
        int $i3 = 0;
        for (int $i1 = 0; $i1 < this.this$0.length; $i1++) {
            if (this.size[$i1] > 0) {
                $i3 += 100;
                $i2 += decode($i1, 718662433);
            }
        }
        return $i3 == 0 ? 100 : ($i2 * 100) / $i3;
    }

    public boolean get(int i, int i2) {
        try {
            return this.this$0[i];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "kh.en(" + ')');
        }
    }

    public boolean getConnection(int i) {
        return this.this$0[i];
    }

    public boolean getContent(int i) {
        return this.this$0[i];
    }

    public boolean getInputStream(int i) {
        return this.this$0[i];
    }

    public boolean headers(int i) {
        return this.this$0[i];
    }

    public boolean next(int i, int i2) {
        try {
            return getKey(i, 225578706) != null;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "kh.ea(" + ')');
        }
    }

    public int parse() {
        int $i2 = 0;
        int $i3 = 0;
        for (int $i1 = 0; $i1 < this.this$0.length; $i1++) {
            if (this.size[$i1] > 0) {
                $i3 += 100;
                $i2 += decode($i1, 1283816528);
            }
        }
        return $i3 == 0 ? 100 : ($i2 * 100) / $i3;
    }

    public void parse(int $i0, byte[] bArr, boolean z, boolean z2) {
        Properties $r4;
        Program $r5;
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.value[$i0] >> 8);
            bArr[bArr.length - 1] = (byte) this.value[$i0];
            if (this.size != null) {
                $r4 = this.size;
                $r5 = new Program();
                $r5.name = 0;
                $r5.size = (long) $i0;
                $r5.data = bArr;
                $r5.size = $r4;
                Channel.this$0.write($r5, (byte) -118);
                Channel.this$0.start(602581061);
                this.this$0[$i0] = true;
            }
            if (z2) {
                this.this$0[$i0] = Level.toString(bArr, false, 2057657498);
            }
        } else if (this.value) {
            throw new RuntimeException();
        } else {
            if (this.pos != null) {
                $i0 = -984505899 * this.data;
                $r4 = this.pos;
                $r5 = new Program();
                $r5.name = 0;
                $r5.size = (long) $i0;
                $r5.data = bArr;
                $r5.size = $r4;
                Channel.this$0.write($r5, (byte) -14);
                Channel.this$0.start(602581061);
            }
            init(bArr, 62136427);
            toString((byte) -1);
        }
    }

    void put(int $i0) {
        Number $r3 = (Number) MappedRandomAccessFile.cursor.get((long) (((this.data * 795499574) << 16) + $i0));
        if ($r3 != null) {
            MappedRandomAccessFile.this$0.size($r3);
        }
    }

    void put(int $i0, int i) {
        try {
            Number $r3 = (Number) MappedRandomAccessFile.cursor.get((long) (((this.data * -984505899) << 16) + $i0));
            if ($r3 != null) {
                MappedRandomAccessFile.this$0.size($r3);
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "kh.ad(" + ')');
        }
    }

    public int read() {
        int $i2 = 0;
        int $i3 = 0;
        for (int $i1 = 0; $i1 < this.this$0.length; $i1++) {
            if (this.size[$i1] > 0) {
                $i3 += 100;
                $i2 += decode($i1, 661239627);
            }
        }
        return $i3 == 0 ? 100 : (-1700892072 * $i2) / $i3;
    }

    public int read(byte b) {
        int $i1 = 0;
        int $i3 = 0;
        for (int $i2 = 0; $i2 < this.this$0.length; $i2++) {
            if (this.size[$i2] > 0) {
                $i3 += 100;
                try {
                    $i1 += decode($i2, -1568348982);
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "kh.ey(" + ')');
                }
            }
        }
        return $i3 == 0 ? 100 : ($i1 * 100) / $i3;
    }

    void read(int $i0) {
        Number $r3 = (Number) MappedRandomAccessFile.cursor.get((long) (((this.data * -984505899) << 16) + $i0));
        if ($r3 != null) {
            MappedRandomAccessFile.this$0.size($r3);
        }
    }

    public void read(int i, byte[] bArr, boolean z, boolean z2) {
        Properties $r5;
        Program $r6;
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.value[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.value[i];
            if (this.size != null) {
                $r5 = this.size;
                $r6 = new Program();
                $r6.name = 0;
                $r6.size = (long) i;
                $r6.data = bArr;
                $r6.size = $r5;
                Channel.this$0.write($r6, (byte) -122);
                Channel.this$0.start(602581061);
                this.this$0[i] = true;
            }
            if (z2) {
                this.this$0[i] = Level.toString(bArr, false, 2110651062);
            }
        } else if (this.value) {
            throw new RuntimeException();
        } else {
            if (this.pos != null) {
                i = -984505899 * this.data;
                $r5 = this.pos;
                $r6 = new Program();
                $r6.name = 0;
                $r6.size = (long) i;
                $r6.data = bArr;
                $r6.size = $r5;
                Channel.this$0.write($r6, (byte) 2);
                Channel.this$0.start(602581061);
            }
            init(bArr, -114128578);
            toString((byte) -1);
        }
    }

    public void read(int $i0, byte[] bArr, boolean z, boolean z2, int i) {
        if (z) {
            try {
                if (this.value) {
                    throw new RuntimeException();
                }
                if (this.pos != null) {
                    $i0 = -984505899 * this.data;
                    Properties $r6 = this.pos;
                    Program $r7 = new Program();
                    $r7.name = 0;
                    $r7.size = (long) $i0;
                    $r7.data = bArr;
                    $r7.size = $r6;
                    Channel.this$0.write($r7, (byte) -109);
                    Channel.this$0.start(602581061);
                }
                init(bArr, 718622033);
                toString((byte) -1);
                return;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "kh.ep(" + ')');
            }
        }
        bArr[bArr.length - 2] = (byte) (this.value[$i0] >> 8);
        bArr[bArr.length - 1] = (byte) this.value[$i0];
        if (this.size != null) {
            $r6 = this.size;
            $r7 = new Program();
            $r7.name = 0;
            $r7.size = (long) $i0;
            $r7.data = bArr;
            $r7.size = $r6;
            Channel.this$0.write($r7, (byte) -52);
            Channel.this$0.start(602581061);
            this.this$0[$i0] = true;
        }
        if (z2) {
            this.this$0[$i0] = Level.toString(bArr, false, 2128347559);
        }
    }

    void run() {
        this.this$0 = new boolean[this.this$0.length];
        for (int $i1 = 0; $i1 < this.this$0.length; $i1++) {
            this.this$0[$i1] = false;
        }
        if (this.size == null) {
            this.value = true;
            return;
        }
        this.name = -1341935297;
        for (int $i0 = 0; $i0 < this.this$0.length; $i0++) {
            if (this.size[$i0] > 0) {
                MyAsyncTask.read($i0, this.size, this, -270562687);
                this.name = 1341935297 * $i0;
            }
        }
        if (this.name * 1581865095 == -1) {
            this.value = true;
        }
    }

    void send(int i) {
        if (this.size == null || this.this$0 == null || !this.this$0[i]) {
            TFloatArrayList.add(this, -984505899 * this.data, i, this.id[i], (byte) 2, true, (short) 9500);
            return;
        }
        Properties $r1 = this.size;
        byte[] $r4 = Channel.this$0.get(i, $r1, 404437947);
        if ($r4 != null) {
            toString($r1, i, $r4, true, -1207426891);
            return;
        }
        toString($r1, i, $r1.read(i, 2011910647), true, -590844706);
    }

    void set(int $i0) {
        Number $r3 = (Number) MappedRandomAccessFile.cursor.get((long) (((this.data * 1303218512) << 16) + $i0));
        if ($r3 != null) {
            MappedRandomAccessFile.this$0.size($r3);
        }
    }

    public boolean setProperty(int i) {
        return getKey(i, -151798631) != null;
    }

    public int skip() {
        int $i2 = 0;
        int $i3 = 0;
        for (int $i1 = 0; $i1 < this.this$0.length; $i1++) {
            if (this.size[$i1] > 0) {
                $i3 += 100;
                $i2 += decode($i1, -97592628);
            }
        }
        return $i3 == 0 ? -1042172030 : (62718635 * $i2) / $i3;
    }

    public int toString(int i) {
        try {
            if (this.value) {
                return 100;
            }
            if (this.this$0 == null) {
                i = Tag.toString(255, -984505899 * this.data, -616538746);
                if (i < 100) {
                    return i;
                }
            }
            return 99;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "kh.eu(" + ')');
        }
    }

    void toString(byte b) {
        this.this$0 = new boolean[this.this$0.length];
        int $i2 = 0;
        while ($i2 < this.this$0.length) {
            try {
                this.this$0[$i2] = false;
                $i2++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "kh.eq(" + ')');
            }
        }
        if (this.size == null) {
            this.value = true;
            return;
        }
        this.name = -1341935297;
        for (int $i1 = 0; $i1 < this.this$0.length; $i1++) {
            if (this.size[$i1] > 0) {
                MyAsyncTask.read($i1, this.size, this, 1276775226);
                this.name = 1341935297 * $i1;
            }
        }
        if (this.name * 238108993 == -1) {
            this.value = true;
        }
    }

    void toString(int i, int i2) {
        try {
            if (this.size != null) {
                if (this.this$0 != null) {
                    if (this.this$0[i]) {
                        Properties $r1 = this.size;
                        byte[] $r4 = Channel.this$0.get(i, $r1, 404437947);
                        if ($r4 != null) {
                            toString($r1, i, $r4, true, -1359113164);
                            return;
                        }
                        toString($r1, i, $r1.read(i, 1973955633), true, -1535935634);
                        return;
                    }
                }
            }
            TFloatArrayList.add(this, -984505899 * this.data, i, this.id[i], (byte) 2, true, (short) 26603);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "kh.at(" + ')');
        }
    }

    void toString(Properties properties, int $i0, byte[] bArr, boolean $z0) {
        if (properties != this.pos) {
            if (!$z0 && $i0 == 238108993 * this.name) {
                this.value = true;
            }
            if (bArr == null || bArr.length <= 2) {
                this.this$0[$i0] = false;
                if (this.port || $z0) {
                    TFloatArrayList.add(this, -984505899 * this.data, $i0, this.id[$i0], (byte) 2, $z0, (short) 10139);
                    return;
                }
            }
            path.reset();
            path.update(bArr, 0, bArr.length - 2);
            int $i3 = (bArr[bArr.length - 1] & -1211875642) + ((bArr[bArr.length - 2] & (short) 255) << 8);
            if (this.id[$i0] == ((int) path.getValue()) && this.value[$i0] == $i3) {
                this.this$0[$i0] = true;
                if ($z0) {
                    this.this$0[$i0] = Level.toString(bArr, false, 2074914283);
                    return;
                }
            }
            this.this$0[$i0] = false;
            if (this.port || $z0) {
                TFloatArrayList.add(this, -984505899 * this.data, $i0, this.id[$i0], (byte) 2, $z0, (short) 3870);
            }
        } else if (this.value) {
            throw new RuntimeException();
        } else if (bArr == null) {
            TFloatArrayList.add(this, -797276689, -984505899 * this.data, this.uri * 1928021701, (byte) 0, true, (short) 15952);
        } else {
            path.reset();
            path.update(bArr, 0, bArr.length);
            if (this.uri * 1928021701 != ((int) path.getValue())) {
                TFloatArrayList.add(this, 255, -984505899 * this.data, 1928021701 * this.uri, (byte) 0, true, (short) 9810);
                return;
            }
            Logger logger = new Logger(Geometry.add(bArr, (byte) 81));
            int $i1 = logger.get((byte) 0);
            if ($i1 == 5 || $i1 == 6) {
                if (($i1 >= 6 ? logger.size(1671652494) : 0) != this.method * -1126615020) {
                    TFloatArrayList.add(this, -598255693, -984505899 * this.data, 1928021701 * this.uri, (byte) 0, true, (short) 6687);
                    return;
                }
                init(bArr, 763997334);
                toString((byte) -1);
                return;
            }
            throw new RuntimeException($i1 + "," + (this.data * -1499751496) + "," + $i0);
        }
    }

    void toString(Properties properties, int $i0, byte[] bArr, boolean $z0, int i) {
        i = 0;
        try {
            int $i2;
            if (properties != this.pos) {
                if (!$z0) {
                    if ($i0 == 238108993 * this.name) {
                        this.value = true;
                    }
                }
                if (bArr != null) {
                    if (bArr.length > 2) {
                        path.reset();
                        path.update(bArr, 0, bArr.length - 2);
                        $i2 = (bArr[bArr.length - 1] & (short) 255) + ((bArr[bArr.length - 2] & (short) 255) << 8);
                        if (this.id[$i0] == ((int) path.getValue())) {
                            if (this.value[$i0] == $i2) {
                                this.this$0[$i0] = true;
                                if ($z0) {
                                    this.this$0[$i0] = Level.toString(bArr, false, 2093757621);
                                }
                            }
                        }
                        this.this$0[$i0] = false;
                        if (this.port || $z0) {
                            TFloatArrayList.add(this, -984505899 * this.data, $i0, this.id[$i0], (byte) 2, $z0, (short) 2952);
                            return;
                        }
                    }
                }
                this.this$0[$i0] = false;
                if (this.port || $z0) {
                    TFloatArrayList.add(this, -984505899 * this.data, $i0, this.id[$i0], (byte) 2, $z0, (short) 29029);
                }
            } else if (this.value) {
                throw new RuntimeException();
            } else if (bArr == null) {
                TFloatArrayList.add(this, 255, -984505899 * this.data, this.uri * 1928021701, (byte) 0, true, (short) 3691);
            } else {
                path.reset();
                CRC32 $r10 = path;
                $r10.update(bArr, 0, bArr.length);
                int $i7 = this.uri * 1928021701;
                int i2 = $i7;
                if ($i7 != ((int) path.getValue())) {
                    TFloatArrayList.add(this, 255, -984505899 * this.data, 1928021701 * this.uri, (byte) 0, true, (short) 23754);
                    return;
                }
                Logger logger = new Logger(Geometry.add(bArr, (byte) 104));
                $i2 = logger.get((byte) 0);
                if ($i2 == 5 || $i2 == 6) {
                    if ($i2 >= 6) {
                        i = logger.size(625250498);
                    }
                    if (i != this.method * -406477501) {
                        TFloatArrayList.add(this, 255, -984505899 * this.data, 1928021701 * this.uri, (byte) 0, true, (short) 15145);
                        return;
                    }
                    init(bArr, -679052253);
                    toString((byte) -1);
                    return;
                }
                $i7 = this.data * -984505899;
                i = $i7;
                throw new RuntimeException($i2 + "," + $i7 + "," + $i0);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "kh.ev(" + ')');
        }
    }
}
