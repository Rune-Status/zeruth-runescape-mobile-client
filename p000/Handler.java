package p000;

/* compiled from: ia */
public final class Handler extends Logger {
    static final int FLAGS2_PERMIT_READ_IF_EXECUTE_PERM = 8192;
    static final int[] next = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    TwofishEngine type;
    int value;

    public Handler(int i) {
        try {
            super(i);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ia.<init>(" + ')');
        }
    }

    public static List get(Class classR, Class classR2, int i, int i2, int i3) {
        try {
            return !Args.add(classR, i, i2, 1278410975) ? null : Arrays.toString(classR2.get(i, i2, -916231443), -1712999332);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ia.aa(" + ')');
        }
    }

    public static Config remove(byte b) {
        try {
            Config $r0 = Envelope.get(170632450);
            $r0.value = null;
            $r0.f92n = 0;
            $r0.this$0 = new Handler(5000);
            return $r0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ia.an(" + ')');
        }
    }

    public int m22a() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        $i0 = ($r1[($i0 * 1978945739) - 1] - this.type.af(769349355)) & 255;
        if ($i0 < Constants.f93X) {
            return $i0;
        }
        $i0 = ($i0 - 128) << 8;
        $r1 = this.size;
        int $i2 = this.data + 2065011939;
        this.data = $i2;
        return $i0 + (($r1[($i2 * 1978945739) - 1] - this.type.af(-2029949454)) & 255);
    }

    public int m23a(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            i = ($r1[(i * 1978945739) - 1] - this.type.af(1326853114)) & 255;
            if (i < Constants.f93X) {
                return i;
            }
            i = (i - 128) << 8;
            $r1 = this.size;
            int $i2 = this.data + 2065011939;
            this.data = $i2;
            return i + (($r1[($i2 * 1978945739) - 1] - this.type.af(-898044897)) & 255);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ia.jj(" + ')');
        }
    }

    public void m24a(TwofishEngine twofishEngine) {
        this.type = twofishEngine;
    }

    public void m25a(TwofishEngine twofishEngine, short s) {
        try {
            this.type = twofishEngine;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ia.jn(" + ')');
        }
    }

    public void m26a(int[] iArr) {
        this.type = new TwofishEngine(iArr);
    }

    public void m27a(int[] iArr, int i) {
        try {
            this.type = new TwofishEngine(iArr);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ia.jo(" + ')');
        }
    }

    public int add(int $i1, byte b) {
        try {
            int $i3 = (this.value * -1146623207) >> 3;
            int $i4 = 8 - ((this.value * -1146623207) & 7);
            int $i2 = 0;
            this.value += -1577434839 * $i1;
            while ($i1 > $i4) {
                $i2 += (this.size[$i3] & next[$i4]) << ($i1 - $i4);
                $i1 -= $i4;
                $i4 = 8;
                $i3++;
            }
            if ($i4 != $i1) {
                return $i2 + ((this.size[$i3] >> ($i4 - $i1)) & next[$i1]);
            }
            return $i2 + (next[$i4] & this.size[$i3]);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ia.kf(" + ')');
        }
    }

    public void create(int i) {
        try {
            this.data = (((-1146623207 * this.value) + 7) / 8) * 2065011939;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ia.kh(" + ')');
        }
    }

    public void debug(int i) {
        try {
            this.value = -283911144 * this.data;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ia.jw(" + ')');
        }
    }

    public boolean get() {
        return ((this.size[-1804817128 * this.data] - this.type.ad((byte) 59)) & 255) >= Constants.f93X;
    }

    public int getInstance() {
        byte[] $r1 = this.size;
        int $i0 = this.data + 2065011939;
        this.data = $i0;
        return ($r1[($i0 * -293893182) - 1] - this.type.af(1345589958)) & -1651465702;
    }

    public int getSize(int $i0) {
        int $i2 = (this.value * -1146623207) >> 3;
        int $i3 = 8 - ((this.value * -1146623207) & 7);
        int $i1 = 0;
        this.value += -1577434839 * $i0;
        while ($i0 > $i3) {
            $i1 += (this.size[$i2] & next[$i3]) << ($i0 - $i3);
            $i0 -= $i3;
            $i3 = 8;
            $i2++;
        }
        if ($i3 != $i0) {
            return $i1 + ((this.size[$i2] >> ($i3 - $i0)) & next[$i0]);
        }
        return $i1 + (next[$i3] & this.size[$i2]);
    }

    public int getType() {
        byte[] $r1 = this.size;
        int $i0 = this.data - 1948098226;
        this.data = $i0;
        $i0 = ($r1[($i0 * 1978945739) - 1] - this.type.af(400499300)) & 255;
        if ($i0 < 147230930) {
            return $i0;
        }
        $i0 = ($i0 - 624182041) << 8;
        $r1 = this.size;
        int $i2 = this.data - 212994128;
        this.data = $i2;
        return $i0 + (($r1[($i2 * 1978945739) - 1] - this.type.af(-1525599598)) & 255);
    }

    public int getType(int $i0) {
        return ($i0 * 8) - (this.value * -1146623207);
    }

    public int getType(int $i0, byte b) {
        try {
            return ($i0 * 8) - (this.value * -1146623207);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ia.kc(" + ')');
        }
    }

    public int init() {
        byte[] $r1 = this.size;
        int $i0 = this.data - 994211118;
        this.data = $i0;
        return ($r1[($i0 * 571655111) - 1] - this.type.af(-931514517)) & 255;
    }

    public int init(int $i0) {
        int $i2 = (-1146623207 * this.value) >> 3;
        int $i3 = 8 - ((-481036785 * this.value) & 7);
        int $i1 = 0;
        this.value += 2045433780 * $i0;
        while ($i0 > $i3) {
            $i1 += (this.size[$i2] & next[$i3]) << ($i0 - $i3);
            $i0 -= $i3;
            $i3 = 8;
            $i2++;
        }
        if ($i3 != $i0) {
            return $i1 + ((this.size[$i2] >> ($i3 - $i0)) & next[$i0]);
        }
        return $i1 + (next[$i3] & this.size[$i2]);
    }

    public void init(TwofishEngine twofishEngine) {
        this.type = twofishEngine;
    }

    public int match(int $i0) {
        return ($i0 * 8) - (this.value * -1146623207);
    }

    public void match() {
        this.data = (((-1146623207 * this.value) + 7) / 8) * 2065011939;
    }

    public int multiply(int $i0) {
        int $i2 = (-1484124325 * this.value) >> 3;
        int $i3 = 8 - ((478506320 * this.value) & 7);
        int $i1 = 0;
        this.value += -1873722745 * $i0;
        while ($i0 > $i3) {
            $i1 += (this.size[$i2] & next[$i3]) << ($i0 - $i3);
            $i0 -= $i3;
            $i3 = 8;
            $i2++;
        }
        if ($i3 != $i0) {
            return $i1 + ((this.size[$i2] >> ($i3 - $i0)) & next[$i0]);
        }
        return $i1 + (next[$i3] & this.size[$i2]);
    }

    public void onCreate() {
        this.value = -283911144 * this.data;
    }

    public void onMessageReceived(TwofishEngine twofishEngine) {
        this.type = twofishEngine;
    }

    public boolean open(int i) {
        try {
            return ((this.size[1978945739 * this.data] - this.type.ad((byte) 111)) & 255) >= Constants.f93X;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ia.jq(" + ')');
        }
    }

    public void put(int $i0) {
        byte[] $r1 = this.size;
        int $i2 = this.data + 2065011939;
        this.data = $i2;
        $r1[($i2 * 1978945739) - 1] = (byte) (this.type.af(356179191) + $i0);
    }

    public void put(int $i0, int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            $r1[(i * 1978945739) - 1] = (byte) (this.type.af(204984041) + $i0);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ia.jf(" + ')');
        }
    }

    public boolean put() {
        return ((this.size[1978945739 * this.data] - this.type.ad((byte) 96)) & 255) >= Constants.f93X;
    }

    public boolean reset() {
        return ((this.size[1162198495 * this.data] - this.type.ad((byte) 6)) & 255) >= Constants.f93X;
    }

    public void setState() {
        this.data = (((-1146623207 * this.value) + 7) / 8) * 2065011939;
    }

    public int start() {
        byte[] $r1 = this.size;
        int $i0 = this.data - 1042684200;
        this.data = $i0;
        return ($r1[($i0 * -842476178) - 1] - this.type.af(1529756865)) & 255;
    }

    public int start(int i) {
        try {
            byte[] $r1 = this.size;
            i = this.data + 2065011939;
            this.data = i;
            return ($r1[(i * 1978945739) - 1] - this.type.af(-58184460)) & 255;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ia.jg(" + ')');
        }
    }

    public void visitTryCatchBlock(TwofishEngine twofishEngine) {
        this.type = twofishEngine;
    }
}
