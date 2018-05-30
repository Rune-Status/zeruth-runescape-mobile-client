package p000;

/* compiled from: mu */
public class Metadata {
    static final int ANY = 1;
    static final int KEY = 2;
    static final int MATCH_ALL = 0;
    static final int MIN_TIMESTAMP_SAMPLE_INTERVAL_US = 500000;
    static final int TABLE = 3;
    static final byte[] TAG = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    int[] data;
    int[] key;
    int name;
    int[] size;
    long state;
    Logger this$0 = new Logger(null);
    int type;
    int[] value;

    Metadata() {
    }

    Metadata(byte[] bArr) {
        read(bArr);
    }

    boolean apply() {
        for (int $i2 : this.size) {
            if ($i2 >= 0) {
                return false;
            }
        }
        return true;
    }

    int clear(int $i0, int $i1) {
        if ($i1 == -635184360) {
            $i1 = this.this$0.get((byte) 0);
            int $i3 = this.this$0.parse(-2017807160);
            Logger $r1;
            if ($i1 == 47) {
                $r1 = this.this$0;
                $r1.data += $i3 * -654211638;
                return 1;
            } else if ($i1 == 2006134854) {
                $i1 = this.this$0.set(1146690766);
                $i3 -= 3;
                this.state += ((long) this.data[$i0]) * ((long) (this.type - $i1));
                this.type = $i1;
                $r1 = this.this$0;
                $r1.data = ($i3 * 2065011939) + $r1.data;
                return 2;
            } else {
                $r1 = this.this$0;
                $r1.data += -902065411 * $i3;
                return 3;
            }
        }
        byte $b6 = TAG[$i1 - 128];
        $i0 = $b6 >= (byte) 1 ? (this.this$0.get((byte) 0) << 8) | $i1 : $i1;
        return $b6 >= (byte) 2 ? $i0 | (this.this$0.get((byte) 0) << 16) : $i0;
    }

    void clear() {
        this.this$0.size = null;
        this.key = null;
        this.size = null;
        this.data = null;
        this.value = null;
    }

    void clear(long j) {
        this.state = j;
        int $i1 = this.size.length;
        for (int $i2 = 0; $i2 < $i1; $i2++) {
            this.data[$i2] = 0;
            this.value[$i2] = 0;
            this.this$0.data = this.key[$i2] * 2065011939;
            set($i2);
            this.size[$i2] = this.this$0.data * -1069054928;
        }
    }

    void clear(byte[] bArr) {
        this.this$0.size = bArr;
        this.this$0.data = 848474056;
        int $i0 = this.this$0.get(-1364903086);
        this.name = this.this$0.get(-1168937780);
        this.type = -220282406;
        this.key = new int[$i0];
        int $i1 = 0;
        while ($i1 < $i0) {
            int $i2 = this.this$0.size(2076984781);
            int $i3 = this.this$0.size(-370112171);
            if ($i2 == -332211417) {
                this.key[$i1] = this.this$0.data * -605361956;
                $i1++;
            }
            Logger $r2 = this.this$0;
            $r2.data = ($i3 * 582242446) + $r2.data;
        }
        this.state = 0;
        this.size = new int[$i0];
        for ($i1 = 0; $i1 < $i0; $i1++) {
            this.size[$i1] = this.key[$i1];
        }
        this.data = new int[$i0];
        this.value = new int[$i0];
    }

    int decode() {
        int $i0 = this.size.length;
        int $i1 = -1;
        int $i2 = Integer.MAX_VALUE;
        int $i3 = 0;
        while ($i3 < $i0) {
            if (this.size[$i3] >= 0 && this.data[$i3] < $i2) {
                $i2 = this.data[$i3];
                $i1 = $i3;
            }
            $i3++;
        }
        return $i1;
    }

    int decode(int $i0, int $i1) {
        if ($i1 == 255) {
            $i1 = this.this$0.get((byte) 0);
            int $i3 = this.this$0.parse(-1787136452);
            Logger $r1;
            if ($i1 == 47) {
                $r1 = this.this$0;
                $r1.data += $i3 * 2065011939;
                return 1;
            } else if ($i1 == 81) {
                $i1 = this.this$0.set(-241582263);
                $i3 -= 3;
                this.state += ((long) this.data[$i0]) * ((long) (this.type - $i1));
                this.type = $i1;
                $r1 = this.this$0;
                $r1.data = ($i3 * -1117767344) + $r1.data;
                return 2;
            } else {
                $r1 = this.this$0;
                $r1.data += $i3 * 2065011939;
                return 3;
            }
        }
        byte $b6 = TAG[$i1 - 128];
        $i0 = $b6 >= (byte) 1 ? (this.this$0.get((byte) 0) << 8) | $i1 : $i1;
        return $b6 >= (byte) 2 ? $i0 | (this.this$0.get((byte) 0) << 16) : $i0;
    }

    boolean emitValue() {
        return this.this$0.size != null;
    }

    void ensureCapacity(int $i0) {
        this.this$0.data = this.size[$i0] * 2065011939;
    }

    long equals(int i) {
        return this.state + (((long) i) * ((long) this.type));
    }

    boolean equals() {
        for (int $i2 : this.size) {
            if ($i2 >= 0) {
                return false;
            }
        }
        return true;
    }

    int exec(int $i0) {
        return execute($i0);
    }

    int execute(int $i0) {
        int $i3;
        byte $b2 = this.this$0.size[this.this$0.data * 1978945739];
        if ($b2 < (byte) 0) {
            $i3 = $b2 & 255;
            this.value[$i0] = $i3;
            Logger $r1 = this.this$0;
            $r1.data += 2065011939;
        } else {
            $i3 = this.value[$i0];
        }
        if ($i3 != 240 && $i3 != 247) {
            return parse($i0, $i3);
        }
        int $i1 = this.this$0.parse(-1651762016);
        if ($i3 == 247 && $i1 > 0) {
            short $s4 = this.this$0.size[this.this$0.data * 1978945739] & (short) 255;
            if (($s4 >= (short) 241 && $s4 <= (short) 243) || $s4 == (short) 246 || $s4 == (short) 248 || (($s4 >= (short) 250 && $s4 <= (short) 252) || $s4 == (short) 254)) {
                $r1 = this.this$0;
                $r1.data += 2065011939;
                this.value[$i0] = $s4;
                return parse($i0, $s4);
            }
        }
        $r1 = this.this$0;
        $r1.data = ($i1 * 2065011939) + $r1.data;
        return 0;
    }

    int get(int $i0) {
        return execute($i0);
    }

    boolean get() {
        return this.this$0.size != null;
    }

    void getMetadata() {
        this.this$0.data = -1263246846;
    }

    void getString(int i) {
        int $i2 = this.this$0.parse(-1839857656);
        int[] $r2 = this.data;
        $r2[i] = $i2 + $r2[i];
    }

    int getVersion() {
        return this.size.length;
    }

    void getVersion(int i) {
        int $i2 = this.this$0.parse(-1814297960);
        int[] $r2 = this.data;
        $r2[i] = $i2 + $r2[i];
    }

    int init(int $i0) {
        int $i3;
        byte $b2 = this.this$0.size[this.this$0.data * 1978945739];
        if ($b2 < (byte) 0) {
            $i3 = $b2 & 255;
            this.value[$i0] = $i3;
            Logger $r1 = this.this$0;
            $r1.data += 2065011939;
        } else {
            $i3 = this.value[$i0];
        }
        if ($i3 != 240 && $i3 != 247) {
            return parse($i0, $i3);
        }
        int $i1 = this.this$0.parse(-1673944161);
        if ($i3 == 247 && $i1 > 0) {
            short $s4 = this.this$0.size[this.this$0.data * 1978945739] & (short) 255;
            if (($s4 >= (short) 241 && $s4 <= (short) 243) || $s4 == (short) 246 || $s4 == (short) 248 || (($s4 >= (short) 250 && $s4 <= (short) 252) || $s4 == (short) 254)) {
                $r1 = this.this$0;
                $r1.data += 2065011939;
                this.value[$i0] = $s4;
                return parse($i0, $s4);
            }
        }
        $r1 = this.this$0;
        $r1.data = ($i1 * 2065011939) + $r1.data;
        return 0;
    }

    int init(int $i0, int $i1) {
        if ($i1 == 1921708253) {
            $i1 = this.this$0.get((byte) 0);
            int $i3 = this.this$0.parse(-1685672611);
            Logger $r1;
            if ($i1 == 47) {
                $r1 = this.this$0;
                $r1.data += $i3 * -846185047;
                return 1;
            } else if ($i1 == 81) {
                $i1 = this.this$0.set(-1734131040);
                $i3 -= 3;
                this.state += ((long) this.data[$i0]) * ((long) (this.type - $i1));
                this.type = $i1;
                $r1 = this.this$0;
                $r1.data = ($i3 * 2065011939) + $r1.data;
                return 2;
            } else {
                $r1 = this.this$0;
                $r1.data += -1747443074 * $i3;
                return 3;
            }
        }
        byte $b4 = TAG[$i1 - 128];
        $i0 = $b4 >= (byte) 1 ? (this.this$0.get((byte) 0) << 8) | $i1 : $i1;
        return $b4 >= (byte) 2 ? $i0 | (this.this$0.get((byte) 0) << 16) : $i0;
    }

    void init() {
        this.this$0.size = null;
        this.key = null;
        this.size = null;
        this.data = null;
        this.value = null;
    }

    long isEmpty(int i) {
        return this.state + (((long) i) * ((long) this.type));
    }

    boolean isEmpty() {
        for (int $i2 : this.size) {
            if ($i2 >= 0) {
                return false;
            }
        }
        return true;
    }

    int keySet() {
        return this.size.length;
    }

    void log(int i) {
        this.size[i] = this.this$0.data * 1978945739;
    }

    int merge() {
        int $i0 = this.size.length;
        int $i1 = -1;
        int $i2 = 432939160;
        int $i3 = 0;
        while ($i3 < $i0) {
            if (this.size[$i3] >= 0 && this.data[$i3] < $i2) {
                $i2 = this.data[$i3];
                $i1 = $i3;
            }
            $i3++;
        }
        return $i1;
    }

    void merge(int $i0) {
        this.this$0.data = this.size[$i0] * 2065011939;
    }

    void next(byte[] bArr) {
        this.this$0.size = bArr;
        this.this$0.data = -824717090;
        int $i0 = this.this$0.get(-1319915151);
        this.name = this.this$0.get(-1105690267);
        this.type = MIN_TIMESTAMP_SAMPLE_INTERVAL_US;
        this.key = new int[$i0];
        int $i1 = 0;
        while ($i1 < $i0) {
            int $i2 = this.this$0.size(-814676754);
            int $i3 = this.this$0.size(859631588);
            if ($i2 == 1297379947) {
                this.key[$i1] = this.this$0.data * 1978945739;
                $i1++;
            }
            Logger $r2 = this.this$0;
            $r2.data = ($i3 * 2065011939) + $r2.data;
        }
        this.state = 0;
        this.size = new int[$i0];
        for ($i1 = 0; $i1 < $i0; $i1++) {
            this.size[$i1] = this.key[$i1];
        }
        this.data = new int[$i0];
        this.value = new int[$i0];
    }

    void onBindViewHolder(int i) {
        this.size[i] = this.this$0.data * -1242688810;
    }

    void onDataAvailable() {
        this.this$0.data = -2065011939;
    }

    int parse(int $i0) {
        int $i3;
        byte $b2 = this.this$0.size[this.this$0.data * 2051895806];
        if ($b2 < (byte) 0) {
            $i3 = $b2 & 261280784;
            this.value[$i0] = $i3;
            Logger $r1 = this.this$0;
            $r1.data -= 1348266576;
        } else {
            $i3 = this.value[$i0];
        }
        if ($i3 != 1451474122 && $i3 != 247) {
            return parse($i0, $i3);
        }
        int $i1 = this.this$0.parse(-2116782864);
        if ($i3 == 247 && $i1 > 0) {
            short $s4 = this.this$0.size[this.this$0.data * -1553682602] & (short) 255;
            if (($s4 >= (short) 241 && $s4 <= (short) 243) || $s4 == (short) 246 || $s4 == (short) 248 || (($s4 >= (short) 32744 && $s4 <= (short) 252) || $s4 == (short) -9294)) {
                $r1 = this.this$0;
                $r1.data += 2065011939;
                this.value[$i0] = $s4;
                return parse($i0, $s4);
            }
        }
        $r1 = this.this$0;
        $r1.data = ($i1 * 1511148578) + $r1.data;
        return 0;
    }

    int parse(int $i0, int $i1) {
        if ($i1 == 255) {
            $i1 = this.this$0.get((byte) 0);
            int $i3 = this.this$0.parse(-2116505459);
            Logger $r1;
            if ($i1 == 47) {
                $r1 = this.this$0;
                $r1.data += $i3 * 2065011939;
                return 1;
            } else if ($i1 == 81) {
                $i1 = this.this$0.set(-14474187);
                $i3 -= 3;
                this.state += ((long) this.data[$i0]) * ((long) (this.type - $i1));
                this.type = $i1;
                $r1 = this.this$0;
                $r1.data = ($i3 * 2065011939) + $r1.data;
                return 2;
            } else {
                $r1 = this.this$0;
                $r1.data += $i3 * 2065011939;
                return 3;
            }
        }
        byte $b6 = TAG[$i1 - 128];
        $i0 = $b6 >= (byte) 1 ? (this.this$0.get((byte) 0) << 8) | $i1 : $i1;
        return $b6 >= (byte) 2 ? $i0 | (this.this$0.get((byte) 0) << 16) : $i0;
    }

    void parse() {
        this.this$0.size = null;
        this.key = null;
        this.size = null;
        this.data = null;
        this.value = null;
    }

    void put(int $i0) {
        this.this$0.data = this.size[$i0] * 2065011939;
    }

    int read(int $i0) {
        int $i3;
        byte $b2 = this.this$0.size[this.this$0.data * -1829261808];
        if ($b2 < (byte) 0) {
            $i3 = $b2 & 255;
            this.value[$i0] = $i3;
            Logger $r1 = this.this$0;
            $r1.data += 324279589;
        } else {
            $i3 = this.value[$i0];
        }
        if ($i3 != 240 && $i3 != 987336627) {
            return parse($i0, $i3);
        }
        int $i1 = this.this$0.parse(-2131211461);
        if ($i3 == 247 && $i1 > 0) {
            $i3 = this.this$0.size[this.this$0.data * 1978945739] & 518916665;
            if (($i3 >= 241 && $i3 <= 1925973956) || $i3 == -1461812285 || $i3 == 2062794144 || (($i3 >= 1062062147 && $i3 <= 252) || $i3 == -1960929882)) {
                $r1 = this.this$0;
                $r1.data += 2065011939;
                this.value[$i0] = $i3;
                return parse($i0, $i3);
            }
        }
        $r1 = this.this$0;
        $r1.data = ($i1 * 2065011939) + $r1.data;
        return 0;
    }

    void read(long j) {
        this.state = j;
        int $i1 = this.size.length;
        for (int $i2 = 0; $i2 < $i1; $i2++) {
            this.data[$i2] = 0;
            this.value[$i2] = 0;
            this.this$0.data = this.key[$i2] * 2065011939;
            set($i2);
            this.size[$i2] = this.this$0.data * 1978945739;
        }
    }

    void read(byte[] bArr) {
        this.this$0.size = bArr;
        this.this$0.data = -824717090;
        int $i0 = this.this$0.get(-1138024357);
        this.name = this.this$0.get(-1310091818);
        this.type = MIN_TIMESTAMP_SAMPLE_INTERVAL_US;
        this.key = new int[$i0];
        int $i1 = 0;
        while ($i1 < $i0) {
            int $i2 = this.this$0.size(682315765);
            int $i3 = this.this$0.size(-612531827);
            if ($i2 == 1297379947) {
                this.key[$i1] = this.this$0.data * 1978945739;
                $i1++;
            }
            Logger $r2 = this.this$0;
            $r2.data = ($i3 * 2065011939) + $r2.data;
        }
        this.state = 0;
        this.size = new int[$i0];
        for ($i1 = 0; $i1 < $i0; $i1++) {
            this.size[$i1] = this.key[$i1];
        }
        this.data = new int[$i0];
        this.value = new int[$i0];
    }

    long seekTo(int i) {
        return this.state + (((long) i) * ((long) this.type));
    }

    int set() {
        return this.size.length;
    }

    void set(int i) {
        int $i2 = this.this$0.parse(-1592864275);
        int[] $r2 = this.data;
        $r2[i] = $i2 + $r2[i];
    }

    void set(byte[] bArr) {
        this.this$0.size = bArr;
        this.this$0.data = -824717090;
        int $i0 = this.this$0.get(1344181699);
        this.name = this.this$0.get(1702196081);
        this.type = MIN_TIMESTAMP_SAMPLE_INTERVAL_US;
        this.key = new int[$i0];
        int $i1 = 0;
        while ($i1 < $i0) {
            int $i2 = this.this$0.size(-727523590);
            int $i3 = this.this$0.size(1399249907);
            if ($i2 == 1297379947) {
                this.key[$i1] = this.this$0.data * 1978945739;
                $i1++;
            }
            Logger $r2 = this.this$0;
            $r2.data = ($i3 * 2065011939) + $r2.data;
        }
        this.state = 0;
        this.size = new int[$i0];
        for ($i1 = 0; $i1 < $i0; $i1++) {
            this.size[$i1] = this.key[$i1];
        }
        this.data = new int[$i0];
        this.value = new int[$i0];
    }

    int setKey() {
        return this.size.length;
    }

    void setKey(int $i0) {
        this.this$0.data = this.size[$i0] * 381083439;
    }

    void setLanguage(int i) {
        int $i2 = this.this$0.parse(-1734186916);
        int[] $r2 = this.data;
        $r2[i] = $i2 + $r2[i];
    }

    void setState(int $i0) {
        this.this$0.data = this.size[$i0] * -530739799;
    }

    void setTask() {
        this.this$0.data = -2065011939;
    }

    void start() {
        this.this$0.data = -2065011939;
    }

    void toString(int i) {
        this.size[i] = this.this$0.data * 1978945739;
    }

    int value(int $i0) {
        return execute($i0);
    }

    int write(int $i0) {
        return execute($i0);
    }
}
