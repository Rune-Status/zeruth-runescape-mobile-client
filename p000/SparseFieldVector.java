package p000;

import java.lang.reflect.Array;

/* compiled from: ec */
public class SparseFieldVector {
    public static final int AppCompatTheme_popupWindowStyle = 61;
    static final int Id_pow = 14;
    public static final byte MASKXMLLETTER = (byte) 2;
    static int data;
    static MediaType value;
    byte[][][] count;
    int size;

    SparseFieldVector(int $i0) {
        try {
            this.size = -1855196225 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ec.<init>(" + ')');
        }
    }

    static final short add(int i, byte b) {
        return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
    }

    static final void add(String str, int i) {
        try {
            Config $r4 = Logger.add(R$string.other, client.this$0.key, (byte) 40);
            $r4.this$0.append(Record.toString(str, -971064741), (byte) 31);
            $r4.this$0.add(str, (byte) -126);
            client.this$0.add($r4, (short) 255);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ec.at(" + ')');
        }
    }

    static void add(byte[] $r0, int i) {
        Logger $r1 = new Logger($r0);
        int $i0 = ($r0.length - 2) * 2065011939;
        i = $i0;
        $r1.data = $i0;
        Level.size = $r1.get(-1064025443) * -1203809431;
        $i0 = Level.size * 1473408217;
        i = $i0;
        ZStream.index = new int[$i0];
        $i0 = Level.size * 1473408217;
        i = $i0;
        Level.index = new int[$i0];
        $i0 = Level.size * 1473408217;
        i = $i0;
        TCharArrayList.index = new int[$i0];
        $i0 = Level.size * 1473408217;
        i = $i0;
        TFloatArrayList.buffer = new int[$i0];
        $i0 = Level.size * 1473408217;
        i = $i0;
        Level.data = new byte[$i0][];
        $i0 = (($r0.length - 7) - (Level.size * -1097636152)) * 2065011939;
        i = $i0;
        $r1.data = $i0;
        Level.count = $r1.get(-1919311589) * -81838593;
        App.index = $r1.get(63025841) * -124756417;
        i = ($r1.get((byte) 0) & 255) + 1;
        int $i1 = 0;
        while ($i1 < Level.size * 1473408217) {
            try {
                ZStream.index[$i1] = $r1.get(960019645);
                $i1++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "ec.ah(" + ')');
            }
        }
        for ($i1 = 0; $i1 < Level.size * 1473408217; $i1++) {
            Level.index[$i1] = $r1.get(-550853026);
        }
        for ($i1 = 0; $i1 < Level.size * 1473408217; $i1++) {
            TCharArrayList.index[$i1] = $r1.get(-1895552540);
        }
        for ($i1 = 0; $i1 < Level.size * 1473408217; $i1++) {
            TFloatArrayList.buffer[$i1] = $r1.get(319722952);
        }
        $r1.data = ((($r0.length - 7) - (Level.size * -1097636152)) - ((i - 1) * 3)) * 2065011939;
        DatabaseUtil.buffer = new int[i];
        for ($i1 = 1; $i1 < i; $i1++) {
            DatabaseUtil.buffer[$i1] = $r1.set(-555452741);
            if (DatabaseUtil.buffer[$i1] == 0) {
                DatabaseUtil.buffer[$i1] = 1;
            }
        }
        $r1.data = 0;
        for (i = 0; i < Level.size * 1473408217; i++) {
            $i1 = TCharArrayList.index[i];
            int $i2 = TFloatArrayList.buffer[i];
            int $i4 = $i1 * $i2;
            $r0 = new byte[$i4];
            Level.data[i] = $r0;
            int $i5 = $r1.get((byte) 0);
            if ($i5 == 0) {
                for ($i1 = 0; $i1 < $i4; $i1++) {
                    $r0[$i1] = $r1.next(1247983979);
                }
                continue;
            } else if (1 == $i5) {
                for ($i5 = 0; $i5 < $i1; $i5++) {
                    for ($i4 = 0; $i4 < $i2; $i4++) {
                        $r0[($i4 * $i1) + $i5] = $r1.next(1247983979);
                    }
                }
                continue;
            } else {
                continue;
            }
        }
    }

    static String parse(int $i2, int i, boolean z, int i2) {
        i2 = 2;
        if (i < 2 || i > 36) {
            try {
                throw new IllegalArgumentException("");
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "ec.ay(" + ')');
            }
        } else if (!z || $i2 < 0) {
            return Integer.toString($i2, i);
        } else {
            int $i3 = $i2 / i;
            while ($i3 != 0) {
                $i3 /= i;
                i2++;
            }
            char[] $r5 = new char[i2];
            $r5[0] = '+';
            i2--;
            while (i2 > 0) {
                $i3 = $i2 / i;
                $i2 -= i * $i3;
                if ($i2 >= 10) {
                    $r5[i2] = (char) ($i2 + 87);
                } else {
                    $r5[i2] = (char) ($i2 + 48);
                }
                i2--;
                $i2 = $i3;
            }
            return new String($r5);
        }
    }

    int add(int i, int i2) {
        return (9 == i || 10 == i) ? 1 : 11 == i ? 8 : i;
    }

    int add(int $i0, int i, int i2) {
        if (9 == i) {
            $i0 = ($i0 + 1) & 3;
        }
        if (10 == i) {
            $i0 = ($i0 + 3) & 3;
        }
        return i == 11 ? ($i0 + 3) & 3 : $i0;
    }

    void add() {
        if (this.count == null) {
            this.count = (byte[][][]) Array.newInstance(byte[].class, new int[]{8, 4});
            append((byte) 94);
            append((short) 256);
            get(-1369754040);
            append(-1123501553);
            add(1758105835);
            getData(-32137470);
            getEntry(523230421);
            add((byte) 59);
        }
    }

    void add(byte b) {
        int $i1 = 0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i2 = 0;
        int $i3 = 0;
        while ($i2 < this.size * -1321075649) {
            int $i4;
            try {
                for ($i4 = 0; $i4 < this.size * -1321075649; $i4++) {
                    if ($i4 >= $i2 - ((this.size * -1321075649) / 2)) {
                        $r1[$i3] = (byte) -1;
                    }
                    $i3++;
                }
                $i2++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "ec.am(" + ')');
            }
        }
        this.count[7][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i3 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i4 = 0; $i4 < this.size * -1321075649; $i4++) {
                if ($i4 >= $i2 - ((this.size * -1321075649) / 2)) {
                    $r1[$i3] = (byte) -1;
                }
                $i3++;
            }
        }
        this.count[7][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
            for ($i4 = (this.size * -1321075649) - 1; $i4 >= 0; $i4--) {
                if ($i4 >= $i3 - ((this.size * -1321075649) / 2)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[7][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 >= $i2 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[7][3] = $r1;
    }

    void add(int i) {
        int $i2;
        int $i3;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 >= ($i2 >> 1)) {
                    try {
                        $r1[$i1] = (byte) -1;
                    } catch (RuntimeException $r4) {
                        throw StringBuilder.append($r4, "ec.aj(" + ')');
                    }
                }
                $i1++;
            }
        }
        this.count[4][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 <= ($i1 << 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[4][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 >= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[4][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for (i = 0; i < this.size * -1321075649; i++) {
            for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                if ($i2 <= (i << 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[4][3] = $r1;
    }

    void add(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, File file, int i9) {
        if (i7 != 0) {
            try {
                if (this.size * -1321075649 != 0) {
                    if (this.count != null) {
                        file.read(i, i2, i5, i6, i3, i4, this.count[add(i7, -843924404) - 1][add(i8, i7, -1649202705)], -1321075649 * this.size, true, (byte) 8);
                    }
                }
            } catch (Throwable $r5) {
                throw StringBuilder.append($r5, "ec.af(" + ')');
            }
        }
    }

    void add(short s) {
        try {
            if (this.count == null) {
                this.count = (byte[][][]) Array.newInstance(byte[].class, new int[]{8, 4});
                append((byte) 106);
                append((short) 256);
                get(-2091836700);
                append(-1735064253);
                add(-760273570);
                getData(1256830412);
                getEntry(523230421);
                add((byte) 15);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ec.aa(" + ')');
        }
    }

    void append() {
        int $i1;
        int $i3;
        int $i0 = 0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 <= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[1][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i2 < 0 || $i2 >= $r1.length) {
                    $i2++;
                } else {
                    if ($i3 >= ($i1 << 1)) {
                        $r1[$i2] = (byte) -1;
                    }
                    $i2++;
                }
            }
        }
        this.count[1][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            $i3 = (this.size * -1321075649) - 1;
            while ($i3 >= 0) {
                if ($i3 <= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3--;
                $i2++;
            }
        }
        this.count[1][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                if ($i2 >= ($i1 << 1)) {
                    $r1[$i0] = (byte) -1;
                }
                $i0++;
            }
        }
        this.count[1][3] = $r1;
    }

    void append(byte b) {
        try {
            int $i1;
            int $i3;
            byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            int $i2 = 0;
            for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
                for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                    if ($i3 <= $i1) {
                        $r1[$i2] = (byte) -1;
                    }
                    $i2++;
                }
            }
            this.count[0][0] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i2 = 0;
            for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
                for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                    if ($i3 <= $i1) {
                        $r1[$i2] = (byte) -1;
                    }
                    $i2++;
                }
            }
            this.count[0][1] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i2 = 0;
            for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
                for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                    if ($i3 >= $i1) {
                        $r1[$i2] = (byte) -1;
                    }
                    $i2++;
                }
            }
            this.count[0][2] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i2 = 0;
            for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
                for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                    if ($i3 >= $i1) {
                        $r1[$i2] = (byte) -1;
                    }
                    $i2++;
                }
            }
            this.count[0][3] = $r1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ec.ag(" + ')');
        }
    }

    void append(int i) {
        try {
            int $i2;
            byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            int $i1 = 0;
            for (i = (this.size * -1321075649) - 1; i >= 0; i--) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if ($i2 >= (i >> 1)) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[3][0] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i1 = 0;
            for (i = 0; i < this.size * -1321075649; i++) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if ($i2 <= (i << 1)) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[3][1] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            i = 0;
            for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
                for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                    if ($i2 >= ($i1 >> 1)) {
                        $r1[i] = (byte) -1;
                    }
                    i++;
                }
            }
            this.count[3][2] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            i = 0;
            for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
                for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                    if ($i2 <= ($i1 << 1)) {
                        $r1[i] = (byte) -1;
                    }
                    i++;
                }
            }
            this.count[3][3] = $r1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ec.ar(" + ')');
        }
    }

    void append(short s) {
        int $i2;
        int $i1 = 0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i3 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            int $i4;
            for ($i4 = 0; $i4 < this.size * -1321075649; $i4++) {
                if ($i4 <= ($i2 >> 1)) {
                    try {
                        $r1[$i3] = (byte) -1;
                    } catch (RuntimeException $r4) {
                        throw StringBuilder.append($r4, "ec.ay(" + ')');
                    }
                }
                $i3++;
            }
        }
        this.count[1][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
            for ($i4 = 0; $i4 < this.size * -1321075649; $i4++) {
                if ($i2 >= 0) {
                    if ($i2 < $r1.length) {
                        if ($i4 >= ($i3 << 1)) {
                            $r1[$i2] = (byte) -1;
                        }
                        $i2++;
                    }
                }
                $i2++;
            }
        }
        this.count[1][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
            for ($i4 = (this.size * -1321075649) - 1; $i4 >= 0; $i4--) {
                if ($i4 <= ($i3 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[1][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 >= ($i2 << 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[1][3] = $r1;
    }

    void call() {
        int $i1;
        int $i0 = 0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            int $i3;
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 >= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[3][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 <= ($i1 << 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[3][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            $i3 = (this.size * -1321075649) - 1;
            while ($i3 >= 0) {
                if ($i3 >= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3--;
                $i2++;
            }
        }
        this.count[3][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                if ($i2 <= ($i1 << 1)) {
                    $r1[$i0] = (byte) -1;
                }
                $i0++;
            }
        }
        this.count[3][3] = $r1;
    }

    int copy(int $i0, int i) {
        if (9 == i) {
            $i0 = ($i0 + 1) & 3;
        }
        if (10 == i) {
            $i0 = ($i0 + 3) & 3;
        }
        return i == 11 ? ($i0 + 3) & 3 : $i0;
    }

    void copy() {
        if (this.count == null) {
            this.count = (byte[][][]) Array.newInstance(byte[].class, new int[]{8, 4});
            append((byte) 43);
            append((short) 256);
            get(-2096972256);
            append(791990831);
            add(1363625564);
            getData(841206827);
            getEntry(523230421);
            add((byte) 35);
        }
    }

    void copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, File file) {
        if (i7 != 0 && this.size * -1321075649 != 0 && this.count != null) {
            file.read(i, i2, i5, i6, i3, i4, this.count[add(i7, -843924404) - 1][add(i8, i7, -1527829505)], -1321075649 * this.size, true, (byte) -94);
        }
    }

    void decryptBlock() {
        int $i1;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            int $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 >= $i1 - ((this.size * -1321075649) / 2)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[7][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 >= $i2 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[7][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 >= $i2 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[7][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for (int $i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = (this.size * -1321075649) - 1;
            while ($i2 >= 0) {
                if ($i2 >= $i0 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i2--;
                $i1++;
            }
        }
        this.count[7][3] = $r1;
    }

    void drawDataSet() {
        int $i0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (-886084828 * this.size))];
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            int $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i2 <= (this.size * -1321075649) / 2) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[5][0] = $r1;
        $r1 = new byte[((-1561377538 * this.size) * (253842975 * this.size))];
        $i1 = 0;
        for ($i0 = 0; $i0 < -111594596 * this.size; $i0++) {
            $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i0 <= (this.size * -1765289511) / 2) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[5][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1060059850; $i0++) {
            $i2 = 0;
            while ($i2 < 92800678 * this.size) {
                if ($i2 >= (this.size * -1321075649) / 2) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[5][2] = $r1;
        $r1 = new byte[((this.size * 1579846973) * (this.size * -556947779))];
        $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i0 >= (this.size * -1321075649) / 2) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[5][3] = $r1;
    }

    void encryptBlock() {
        int $i1;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            int $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 <= $i1 - ((this.size * -1321075649) / 2)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[6][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 <= $i1 - ((this.size * -1321075649) / 2)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[6][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 <= $i2 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[6][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for (int $i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = (this.size * -1321075649) - 1;
            while ($i2 >= 0) {
                if ($i2 <= $i0 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i2--;
                $i1++;
            }
        }
        this.count[6][3] = $r1;
    }

    void equals() {
        int $i0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            int $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i2 <= $i0) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[0][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i0 = (this.size * -1321075649) - 1; $i0 >= 0; $i0--) {
            for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                if ($i2 <= $i0) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[0][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i2 >= $i0) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[0][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i0 = (this.size * -1321075649) - 1; $i0 >= 0; $i0--) {
            for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                if ($i2 >= $i0) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[0][3] = $r1;
    }

    void get(int i) {
        try {
            int $i1;
            int $i2;
            byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            i = 0;
            for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
                for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                    if ($i2 <= ($i1 >> 1)) {
                        $r1[i] = (byte) -1;
                    }
                    i++;
                }
            }
            this.count[2][0] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i1 = 0;
            for (i = (this.size * -1321075649) - 1; i >= 0; i--) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if ($i2 >= (i << 1)) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[2][1] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i1 = 0;
            for (i = 0; i < this.size * -1321075649; i++) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if ($i2 <= (i >> 1)) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[2][2] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            i = 0;
            for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
                for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                    if ($i2 >= ($i1 << 1)) {
                        $r1[i] = (byte) -1;
                    }
                    i++;
                }
            }
            this.count[2][3] = $r1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ec.as(" + ')');
        }
    }

    int getData(int $i0, int i) {
        if (9 == i) {
            $i0 = ($i0 + 1) & 3;
        }
        if (10 == i) {
            $i0 = ($i0 + 3) & 3;
        }
        return i == 11 ? ($i0 + 3) & 3 : $i0;
    }

    void getData() {
        if (this.count == null) {
            this.count = (byte[][][]) Array.newInstance(byte[].class, new int[]{8, 4});
            append((byte) 18);
            append((short) 256);
            get(-1871396358);
            append(-1660031509);
            add(751744271);
            getData(-881070393);
            getEntry(523230421);
            add((byte) 67);
        }
    }

    void getData(int i) {
        try {
            int $i2;
            byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            int $i1 = 0;
            for (i = 0; i < this.size * -1321075649; i++) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if ($i2 <= (this.size * -1321075649) / 2) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[5][0] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i1 = 0;
            for (i = 0; i < this.size * -1321075649; i++) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if (i <= (this.size * -1321075649) / 2) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[5][1] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i1 = 0;
            for (i = 0; i < this.size * -1321075649; i++) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if ($i2 >= (this.size * -1321075649) / 2) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[5][2] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i1 = 0;
            for (i = 0; i < this.size * -1321075649; i++) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if (i >= (this.size * -1321075649) / 2) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[5][3] = $r1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ec.ae(" + ')');
        }
    }

    int getEntries(int $i0, int i) {
        if (9 == i) {
            $i0 = ($i0 + 1) & 3;
        }
        if (10 == i) {
            $i0 = ($i0 + 3) & 3;
        }
        return i == 11 ? ($i0 + 3) & 3 : $i0;
    }

    int getEntry(int $i0, int i) {
        if (9 == i) {
            $i0 = ($i0 + 1) & 3;
        }
        if (10 == i) {
            $i0 = ($i0 + 3) & 3;
        }
        return i == 11 ? ($i0 + 3) & 3 : $i0;
    }

    void getEntry() {
        int $i1;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            int $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 >= $i1 - ((this.size * -1321075649) / 2)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[7][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 >= $i2 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[7][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 >= $i2 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[7][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for (int $i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = (this.size * -1321075649) - 1;
            while ($i2 >= 0) {
                if ($i2 >= $i0 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i2--;
                $i1++;
            }
        }
        this.count[7][3] = $r1;
    }

    void getEntry(int i) {
        try {
            int $i2;
            byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            int $i1 = 0;
            for (i = 0; i < this.size * -1321075649; i++) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if ($i2 <= i - ((this.size * -1321075649) / 2)) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[6][0] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            $i1 = 0;
            for (i = (this.size * -1321075649) - 1; i >= 0; i--) {
                for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                    if ($i2 <= i - ((this.size * -1321075649) / 2)) {
                        $r1[$i1] = (byte) -1;
                    }
                    $i1++;
                }
            }
            this.count[6][1] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            i = 0;
            for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
                for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                    if ($i2 <= $i1 - ((this.size * -1321075649) / 2)) {
                        $r1[i] = (byte) -1;
                    }
                    i++;
                }
            }
            this.count[6][2] = $r1;
            $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
            i = 0;
            for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
                for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
                    if ($i2 <= $i1 - ((this.size * -1321075649) / 2)) {
                        $r1[i] = (byte) -1;
                    }
                    i++;
                }
            }
            this.count[6][3] = $r1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ec.aq(" + ')');
        }
    }

    void getKeys() {
        int $i2;
        int $i3;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 <= ($i2 >> 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[2][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 >= ($i1 << 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[2][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 <= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[2][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for (int $i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = (this.size * -1321075649) - 1;
            while ($i2 >= 0) {
                if ($i2 >= ($i0 << 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i2--;
                $i1++;
            }
        }
        this.count[2][3] = $r1;
    }

    void increment() {
        int $i2;
        int $i3;
        byte[] $r1 = new byte[((670012654 * this.size) * (this.size * 1006003867))];
        int $i1 = 0;
        for ($i2 = (1422644577 * this.size) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * 1849673164) - 1; $i3 >= 0; $i3--) {
                if ($i3 >= ($i2 >> 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[4][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < 666098966 * this.size; $i3++) {
                if ($i3 <= ($i1 << 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[4][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * 778897933))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            $i3 = 0;
            while ($i3 < this.size * -1332951452) {
                if ($i3 >= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[4][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -192840565))];
        $i1 = 0;
        for (int $i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = (-658741842 * this.size) - 1;
            while ($i2 >= 0) {
                if ($i2 <= ($i0 << 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i2--;
                $i1++;
            }
        }
        this.count[4][3] = $r1;
    }

    void pack() {
        int $i2;
        int $i3;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 >= ($i2 >> 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[4][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 <= ($i1 << 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[4][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 >= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[4][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for (int $i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = (this.size * -1321075649) - 1;
            while ($i2 >= 0) {
                if ($i2 <= ($i0 << 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i2--;
                $i1++;
            }
        }
        this.count[4][3] = $r1;
    }

    void placeBarcode() {
        int $i1;
        int $i3;
        int $i0 = 0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 >= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[3][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 <= ($i1 << 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[3][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            $i3 = (this.size * -1321075649) - 1;
            while ($i3 >= 0) {
                if ($i3 >= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3--;
                $i2++;
            }
        }
        this.count[3][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 <= ($i1 << 1)) {
                    $r1[$i0] = (byte) -1;
                }
                $i0++;
            }
        }
        this.count[3][3] = $r1;
    }

    void readCache() {
        int $i2;
        int $i3;
        byte[] $r1 = new byte[((this.size * 1983665759) * (this.size * -1321075649))];
        int $i1 = 0;
        for ($i2 = (1026938636 * this.size) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 <= ($i2 >> 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[2][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 >= ($i1 << 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[2][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (1379283972 * this.size))];
        $i2 = 0;
        for ($i1 = 0; $i1 < this.size * 1456227545; $i1++) {
            $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 <= ($i1 >> 1)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[2][2] = $r1;
        $r1 = new byte[((this.size * -1729284725) * (this.size * -1321075649))];
        $i1 = 0;
        for (int $i0 = 0; $i0 < this.size * 124820111; $i0++) {
            $i2 = (this.size * -586457744) - 1;
            while ($i2 >= 0) {
                if ($i2 >= ($i0 << 1)) {
                    $r1[$i1] = (byte) -1;
                }
                $i2--;
                $i1++;
            }
        }
        this.count[2][3] = $r1;
    }

    int set(int i) {
        return (9 == i || 10 == i) ? 1 : 11 == i ? 8 : i;
    }

    int set(int $i0, int i) {
        if (9 == i) {
            $i0 = ($i0 + 1) & 3;
        }
        if (10 == i) {
            $i0 = ($i0 + 3) & 3;
        }
        return i == 11 ? ($i0 + 3) & 3 : $i0;
    }

    void set() {
        if (this.count == null) {
            this.count = (byte[][][]) Array.newInstance(byte[].class, new int[]{8, 4});
            append((byte) 72);
            append((short) 256);
            get(-1824111586);
            append(-1392753425);
            add(1726041818);
            getData(-749317501);
            getEntry(523230421);
            add((byte) 80);
        }
    }

    void subtract() {
        int $i1;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i2 = 0;
        for ($i1 = 0; $i1 < this.size * -1321075649; $i1++) {
            int $i3 = 0;
            while ($i3 < this.size * -1321075649) {
                if ($i3 >= $i1 - ((this.size * -1321075649) / 2)) {
                    $r1[$i2] = (byte) -1;
                }
                $i3++;
                $i2++;
            }
        }
        this.count[7][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i2 = 0;
        for ($i1 = (this.size * -1321075649) - 1; $i1 >= 0; $i1--) {
            for ($i3 = 0; $i3 < this.size * -1321075649; $i3++) {
                if ($i3 >= $i1 - ((this.size * -1321075649) / 2)) {
                    $r1[$i2] = (byte) -1;
                }
                $i2++;
            }
        }
        this.count[7][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i2 = (this.size * -1321075649) - 1; $i2 >= 0; $i2--) {
            for ($i3 = (this.size * -1321075649) - 1; $i3 >= 0; $i3--) {
                if ($i3 >= $i2 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[7][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for (int $i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = (this.size * -1321075649) - 1;
            while ($i2 >= 0) {
                if ($i2 >= $i0 - ((this.size * -1321075649) / 2)) {
                    $r1[$i1] = (byte) -1;
                }
                $i2--;
                $i1++;
            }
        }
        this.count[7][3] = $r1;
    }

    void toArray() {
        int $i0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (-257531377 * this.size))];
        $r1 = new byte[((this.size * 745073019) * (921014980 * this.size))];
        int $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            int $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i2 <= (18468009 * this.size) / 2) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[5][0] = $r1;
        $r1 = new byte[((-406127771 * this.size) * (-847648766 * this.size))];
        $i1 = 0;
        for ($i0 = 0; $i0 < 207084586 * this.size; $i0++) {
            $i2 = 0;
            while ($i2 < 799120312 * this.size) {
                if ($i0 <= (this.size * -1321075649) / 2) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[5][1] = $r1;
        $r1 = new byte[((-1699713743 * this.size) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i2 >= (1863954780 * this.size) / 2) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[5][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -410600262))];
        $i1 = 0;
        for ($i0 = 0; $i0 < 2068724932 * this.size; $i0++) {
            $i2 = 0;
            while ($i2 < this.size * -904352164) {
                if ($i0 >= (309727526 * this.size) / 2) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[5][3] = $r1;
    }

    void toPdf() {
        int $i0;
        byte[] $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        int $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            int $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i2 <= $i0) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[0][0] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i0 = (this.size * -1321075649) - 1; $i0 >= 0; $i0--) {
            for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                if ($i2 <= $i0) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[0][1] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i0 = 0; $i0 < this.size * -1321075649; $i0++) {
            $i2 = 0;
            while ($i2 < this.size * -1321075649) {
                if ($i2 >= $i0) {
                    $r1[$i1] = (byte) -1;
                }
                $i2++;
                $i1++;
            }
        }
        this.count[0][2] = $r1;
        $r1 = new byte[((this.size * -1321075649) * (this.size * -1321075649))];
        $i1 = 0;
        for ($i0 = (this.size * -1321075649) - 1; $i0 >= 0; $i0--) {
            for ($i2 = 0; $i2 < this.size * -1321075649; $i2++) {
                if ($i2 >= $i0) {
                    $r1[$i1] = (byte) -1;
                }
                $i1++;
            }
        }
        this.count[0][3] = $r1;
    }
}
