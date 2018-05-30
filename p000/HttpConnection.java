package p000;

import java.util.HashMap;

/* compiled from: ok */
public class HttpConnection {
    static final int STATE_CLOSED = 6;
    static final float STROKE_WIDTH_LARGE = 3.0f;
    static int[] length;
    int[] data;
    int[] key;
    Wallet state;
    final HashMap this$0;
    int value;

    public HttpConnection() {
        try {
            this.this$0 = new HashMap();
            this.state = new Wallet(0, 0);
            this.key = new int[Constants.ACC_STRICT];
            this.data = new int[Constants.ACC_STRICT];
            this.value = 0;
            MediaFile.update(2098459329);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ok.<init>(" + ')');
        }
    }

    public static Model create(int i, byte b) {
        try {
            Model $r2 = (Model) Model.parent.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = Model.name.get(34, i, -316935174);
            $r2 = new Model();
            if ($r4 != null) {
                $r2.add(new Logger($r4), (byte) 12);
            }
            $r2.load(-843123423);
            Model.parent.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ok.ad(" + ')');
        }
    }

    static void draw() {
        length = new int[2000];
        int $i0 = 0;
        int $i1 = 240;
        while ($i0 < 16) {
            length[$i0] = FastMath.getValue((double) (((float) $i1) / 360.0f), 0.9998999834060669d, (double) (0.075f + ((((float) $i0) * 0.425f) / 16.0f)));
            $i0++;
            $i1 -= 12;
        }
        int $i3 = $i0;
        $i0 = 3713547;
        while ($i3 < length.length) {
            $i1 = $i3 * 2;
            int $i2 = FastMath.getValue((double) (((float) $i0) / 360.0f), 0.9998999834060669d, 0.5d);
            while ($i3 < $i1 && $i3 < length.length) {
                length[$i3] = $i2;
                $i3++;
            }
            $i0 -= 618924;
        }
    }

    static void format() {
        length = new int[-1885563899];
        int $i0 = 0;
        int $i1 = 1427185702;
        while ($i0 < 16) {
            length[$i0] = FastMath.getValue((double) (((float) $i1) / 360.0f), 0.9998999834060669d, (double) (0.075f + ((((float) $i0) * 0.425f) / 16.0f)));
            $i0++;
            $i1 -= 12;
        }
        int $i3 = $i0;
        $i0 = 48;
        while ($i3 < length.length) {
            $i1 = $i3 * 2;
            int $i2 = FastMath.getValue((double) (((float) $i0) / 360.0f), 0.9998999834060669d, 0.5d);
            while ($i3 < $i1 && $i3 < length.length) {
                length[$i3] = $i2;
                $i3++;
            }
            $i0 -= 8;
        }
    }

    static void update() {
        length = new int[2000];
        int $i0 = 0;
        int $i1 = 240;
        while ($i0 < 16) {
            length[$i0] = FastMath.getValue((double) (((float) $i1) / 360.0f), 0.9998999834060669d, (double) (0.075f + ((((float) $i0) * 0.425f) / 16.0f)));
            $i0++;
            $i1 -= 12;
        }
        int $i3 = $i0;
        $i0 = 48;
        while ($i3 < length.length) {
            $i1 = $i3 * 2;
            int $i2 = FastMath.getValue((double) (((float) $i0) / 360.0f), 0.9998999834060669d, 0.5d);
            while ($i3 < $i1 && $i3 < length.length) {
                length[$i3] = $i2;
                $i3++;
            }
            $i0 -= 8;
        }
    }

    void add(int i) {
        int $i3;
        int $i1 = (i * 2) + 1;
        double $d0 = (double) (((float) i) / STROKE_WIDTH_LARGE);
        double[] $r2 = new double[((i * 2) + 1)];
        int $i2 = 0;
        for ($i3 = -i; $i3 <= i; $i3++) {
            $r2[$i2] = IOException.get((double) $i3, 0.0d, $d0);
            $i2++;
        }
        $d0 = $r2[i] * $r2[i];
        int[] $r1 = new int[($i1 * $i1)];
        Object obj = null;
        for ($i2 = 0; $i2 < $i1; $i2++) {
            for ($i3 = 0; $i3 < $i1; $i3++) {
                int $i5 = (int) ((($r2[$i2] * $r2[$i3]) / $d0) * 4643211215818981376L);
                $r1[($i2 * $i1) + $i3] = $i5;
                if (obj == null && $i5 > 0) {
                    obj = 1;
                }
            }
        }
        Long longR = new Long($r1, $i1, $i1);
        this.this$0.put(Integer.valueOf(i), longR);
    }

    void add(Long longR, Long longR2, Wallet wallet) {
        if (wallet.data * 1292316989 != 0 && wallet.value * 1953141137 != 0) {
            int $i5 = (wallet.message * -22382459) + (longR2.length * (wallet.type * 1508303939));
            int $i4 = ((wallet.type * 1508303939 == 0 ? longR.data - (wallet.value * 1953141137) : 0) * longR.length) + (wallet.message * -22382459 == 0 ? longR.length - (wallet.data * 1292316989) : 0);
            for (int $i2 = 0; $i2 < wallet.value * 1953141137; $i2++) {
                int $i3 = 0;
                while ($i3 < wallet.data * 1292316989) {
                    int[] $r4 = longR2.size;
                    int $i0 = $i4 + 1;
                    $r4[$i5] = longR.size[$i4] + $r4[$i5];
                    $i3++;
                    $i5++;
                    $i4 = $i0;
                }
                $i4 += longR.length - (wallet.data * 1292316989);
                $i5 = (longR2.length - (wallet.data * 1292316989)) + $i5;
            }
        }
    }

    void add(Long longR, Long longR2, Wallet wallet, int i) {
        try {
            if (1292316989 * wallet.data != 0) {
                if (wallet.value * 1953141137 != 0) {
                    i = 0;
                    int $i2 = 0;
                    if (-22382459 * wallet.message == 0) {
                        i = longR.length - (1292316989 * wallet.data);
                    }
                    if (wallet.type * 1508303939 == 0) {
                        $i2 = longR.data - (1953141137 * wallet.value);
                    }
                    int $i3 = i + ($i2 * longR.length);
                    i = (longR2.length * (wallet.type * 1508303939)) + (wallet.message * -22382459);
                    for ($i2 = 0; $i2 < wallet.value * 1953141137; $i2++) {
                        int $i4 = 0;
                        while ($i4 < wallet.data * 1292316989) {
                            int[] $r4 = longR2.size;
                            int $i6 = $i3 + 1;
                            $r4[i] = longR.size[$i3] + $r4[i];
                            $i4++;
                            i++;
                            $i3 = $i6;
                        }
                        $i3 += longR.length - (1292316989 * wallet.data);
                        i += longR2.length - (wallet.data * 1292316989);
                    }
                }
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ok.as(" + ')');
        }
    }

    public final void close(int i) {
        try {
            this.value = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ok.ag(" + ')');
        }
    }

    void draw(int i) {
        int $i3;
        int $i1 = (i * 2) + 1;
        double $d0 = (double) (((float) i) / STROKE_WIDTH_LARGE);
        double[] $r2 = new double[((i * 2) + 1)];
        int $i2 = 0;
        for ($i3 = -i; $i3 <= i; $i3++) {
            $r2[$i2] = IOException.get((double) $i3, 0.0d, $d0);
            $i2++;
        }
        $d0 = $r2[i] * $r2[i];
        int[] $r1 = new int[($i1 * $i1)];
        Object obj = null;
        for ($i2 = 0; $i2 < $i1; $i2++) {
            for ($i3 = 0; $i3 < $i1; $i3++) {
                int $i5 = (int) ((($r2[$i2] * $r2[$i3]) / $d0) * 4643211215818981376L);
                $r1[($i2 * $i1) + $i3] = $i5;
                if (obj == null && $i5 > 0) {
                    obj = 1;
                }
            }
        }
        Long longR = new Long($r1, $i1, $i1);
        this.this$0.put(Integer.valueOf(i), longR);
    }

    Long get(int i) {
        if (!this.this$0.containsKey(Integer.valueOf(i))) {
            parse(i, 122139625);
        }
        return (Long) this.this$0.get(Integer.valueOf(i));
    }

    Long get(int i, int i2) {
        try {
            if (!this.this$0.containsKey(Integer.valueOf(i))) {
                parse(i, 122139625);
            }
            return (Long) this.this$0.get(Integer.valueOf(i));
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ok.an(" + ')');
        }
    }

    public final void get(int i, int i2, byte b) {
        try {
            if (this.value * 891726683 < this.key.length) {
                this.key[this.value * 891726683] = i;
                this.data[this.value * 891726683] = i2;
                this.value -= 315519789;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ok.aa(" + ')');
        }
    }

    void getBitmap(int i) {
        int $i3;
        int $i1 = (i * 2) + 1;
        double $d0 = (double) (((float) i) / STROKE_WIDTH_LARGE);
        double[] $r2 = new double[((i * 2) + 1)];
        int $i2 = 0;
        for ($i3 = -i; $i3 <= i; $i3++) {
            $r2[$i2] = IOException.get((double) $i3, 0.0d, $d0);
            $i2++;
        }
        $d0 = $r2[i] * $r2[i];
        int[] $r1 = new int[($i1 * $i1)];
        Object obj = null;
        for ($i2 = 0; $i2 < $i1; $i2++) {
            for ($i3 = 0; $i3 < $i1; $i3++) {
                int $i5 = (int) ((($r2[$i2] * $r2[$i3]) / $d0) * 4643211215818981376L);
                $r1[($i2 * $i1) + $i3] = $i5;
                if (obj == null && $i5 > 0) {
                    obj = 1;
                }
            }
        }
        Long longR = new Long($r1, $i1, $i1);
        this.this$0.put(Integer.valueOf(i), longR);
    }

    public final void open(int i, int i2) {
        if (this.value * -1346029230 < this.key.length) {
            this.key[this.value * 891726683] = i;
            this.data[this.value * 891726683] = i2;
            this.value -= 315519789;
        }
    }

    void parse(int i, int i2) {
        i2 = (i * 2) + 1;
        double $d0 = (double) (((float) i) / STROKE_WIDTH_LARGE);
        double[] $r2 = new double[((i * 2) + 1)];
        int $i2 = 0;
        int $i3 = -i;
        while ($i3 <= i) {
            try {
                $r2[$i2] = IOException.get((double) $i3, 0.0d, $d0);
                $i2++;
                $i3++;
            } catch (Throwable $r6) {
                throw StringBuilder.append($r6, "ok.ad(" + ')');
            }
        }
        $d0 = $r2[i] * $r2[i];
        int[] $r1 = new int[(i2 * i2)];
        Object obj = null;
        for ($i2 = 0; $i2 < i2; $i2++) {
            for ($i3 = 0; $i3 < i2; $i3++) {
                int $i5 = (int) ((($r2[$i2] * $r2[$i3]) / $d0) * 4643211215818981376L);
                $r1[($i2 * i2) + $i3] = $i5;
                if (obj == null && $i5 > 0) {
                    obj = 1;
                }
            }
        }
        Long longR = new Long($r1, i2, i2);
        this.this$0.put(Integer.valueOf(i), longR);
    }

    void put(Long longR, Long longR2, Wallet wallet) {
        if (wallet.data * 1292316989 != 0 && wallet.value * 1953141137 != 0) {
            int $i3 = (wallet.message * -22382459) + (longR2.length * (wallet.type * 1508303939));
            int $i4 = ((wallet.type * 1508303939 == 0 ? longR.data - (wallet.value * 1953141137) : 0) * longR.length) + (wallet.message * -22382459 == 0 ? longR.length - (wallet.data * 1292316989) : 0);
            for (int $i2 = 0; $i2 < wallet.value * 1953141137; $i2++) {
                int $i5 = 0;
                while ($i5 < wallet.data * 1292316989) {
                    int[] $r4 = longR2.size;
                    int $i0 = $i4 + 1;
                    $r4[$i3] = longR.size[$i4] + $r4[$i3];
                    $i5++;
                    $i3++;
                    $i4 = $i0;
                }
                $i4 += longR.length - (wallet.data * 1292316989);
                $i3 = (longR2.length - (wallet.data * 1292316989)) + $i3;
            }
        }
    }

    public final void read(int i, int i2, Long longR, float f) {
        int $i2 = 0;
        int $i3 = (int) (18.0f * f);
        Long $r3 = get($i3, -2038446588);
        int $i4 = ($i3 * 2) + 1;
        Wallet $r2 = new Wallet(0, 0, longR.length, longR.data);
        Wallet $r4 = new Wallet(0, 0);
        this.state.add($i4, $i4, -117383770);
        System.nanoTime();
        for ($i4 = 0; $i4 < 284612004 * this.value; $i4++) {
            int $i6 = this.key[$i4];
            int $i5 = this.data[$i4];
            $i6 = ((int) (((float) ($i6 - i)) * f)) - $i3;
            int $i7 = longR.data;
            float $f1 = (float) $i7;
            float $f2 = (float) ($i5 - i2);
            $f2 *= f;
            float f2 = $f2;
            this.state.update($i6, ((int) ($f1 - $f2)) - $i3, (byte) -67);
            this.state.read($r2, $r4, 2102736655);
            add($r3, longR, $r4, 1342438741);
        }
        System.nanoTime();
        System.nanoTime();
        while (true) {
            $i7 = longR.size.length;
            if ($i2 < $i7) {
                if (longR.size[$i2] == 0) {
                    longR.size[$i2] = -1538776029;
                } else {
                    i = ((longR.size[$i2] + 64) - 1) / 256;
                    if (i <= 0) {
                        longR.size[$i2] = -2006543619;
                    } else {
                        if (i > length.length) {
                            i = length.length;
                        }
                        longR.size[$i2] = length[i - 1] | 22789652;
                    }
                }
                $i2++;
            } else {
                System.nanoTime();
                return;
            }
        }
    }

    public final void read(int i, int i2, Long longR, float f, int i3) {
        i3 = (int) (18.0f * f);
        Long $r2 = get(i3, -179713488);
        int $i3 = (i3 * 2) + 1;
        Wallet $r3 = new Wallet(0, 0, longR.length, longR.data);
        Wallet $r4 = new Wallet(0, 0);
        this.state.add($i3, $i3, -886684415);
        System.nanoTime();
        $i3 = 0;
        while ($i3 < 891726683 * this.value) {
            try {
                this.state.update(((int) (((float) (this.key[$i3] - i)) * f)) - i3, ((int) (((float) longR.data) - (((float) (this.data[$i3] - i2)) * f))) - i3, (byte) -70);
                this.state.read($r3, $r4, 2102736655);
                add($r2, longR, $r4, -1204483249);
                $i3++;
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "ok.ay(" + ')');
            }
        }
        System.nanoTime();
        System.nanoTime();
        for (i = 0; i < longR.size.length; i++) {
            if (longR.size[i] == 0) {
                longR.size[i] = -16777216;
            } else {
                i3 = ((longR.size[i] + 64) - 1) / 256;
                if (i3 <= 0) {
                    longR.size[i] = -16777216;
                } else {
                    if (i3 > length.length) {
                        i3 = length.length;
                    }
                    longR.size[i] = length[i3 - 1] | -16777216;
                }
            }
        }
        System.nanoTime();
    }

    Long readHeader(int i) {
        if (!this.this$0.containsKey(Integer.valueOf(i))) {
            parse(i, 122139625);
        }
        return (Long) this.this$0.get(Integer.valueOf(i));
    }

    void request(int i) {
        int $i3;
        int $i1 = (i * 2) + 1;
        double $d0 = (double) (((float) i) / STROKE_WIDTH_LARGE);
        double[] $r2 = new double[((i * 2) + 1)];
        int $i2 = 0;
        for ($i3 = -i; $i3 <= i; $i3++) {
            $r2[$i2] = IOException.get((double) $i3, 0.0d, $d0);
            $i2++;
        }
        $d0 = $r2[i] * $r2[i];
        int[] $r1 = new int[($i1 * $i1)];
        Object obj = null;
        for ($i2 = 0; $i2 < $i1; $i2++) {
            for ($i3 = 0; $i3 < $i1; $i3++) {
                int $i5 = (int) ((($r2[$i2] * $r2[$i3]) / $d0) * 4643211215818981376L);
                $r1[($i2 * $i1) + $i3] = $i5;
                if (obj == null && $i5 > 0) {
                    obj = 1;
                }
            }
        }
        Long longR = new Long($r1, $i1, $i1);
        this.this$0.put(Integer.valueOf(i), longR);
    }

    void update(int i) {
        int $i3;
        int $i1 = (i * 2) + 1;
        double $d0 = (double) (((float) i) / STROKE_WIDTH_LARGE);
        double[] $r2 = new double[((i * 2) + 1)];
        int $i2 = 0;
        for ($i3 = -i; $i3 <= i; $i3++) {
            $r2[$i2] = IOException.get((double) $i3, 0.0d, $d0);
            $i2++;
        }
        $d0 = $r2[i] * $r2[i];
        int[] $r1 = new int[($i1 * $i1)];
        Object obj = null;
        for ($i2 = 0; $i2 < $i1; $i2++) {
            for ($i3 = 0; $i3 < $i1; $i3++) {
                int $i5 = (int) ((($r2[$i2] * $r2[$i3]) / $d0) * 4643211215818981376L);
                $r1[($i2 * $i1) + $i3] = $i5;
                if (obj == null && $i5 > 0) {
                    obj = 1;
                }
            }
        }
        Long longR = new Long($r1, $i1, $i1);
        this.this$0.put(Integer.valueOf(i), longR);
    }

    void writeTo(Long longR, Long longR2, Wallet wallet) {
        if (wallet.data * 1292316989 != 0 && wallet.value * 1953141137 != 0) {
            int $i5 = (wallet.message * -22382459) + (longR2.length * (wallet.type * 1508303939));
            int $i4 = ((wallet.type * 1508303939 == 0 ? longR.data - (wallet.value * 1953141137) : 0) * longR.length) + (wallet.message * -22382459 == 0 ? longR.length - (wallet.data * 1292316989) : 0);
            for (int $i2 = 0; $i2 < wallet.value * 1953141137; $i2++) {
                int $i3 = 0;
                while ($i3 < wallet.data * 1292316989) {
                    int[] $r4 = longR2.size;
                    int $i0 = $i4 + 1;
                    $r4[$i5] = longR.size[$i4] + $r4[$i5];
                    $i3++;
                    $i5++;
                    $i4 = $i0;
                }
                $i4 += longR.length - (wallet.data * 1292316989);
                $i5 = (longR2.length - (wallet.data * 1292316989)) + $i5;
            }
        }
    }
}
