package p000;

/* compiled from: bf */
public class PolynomialGF2mSmallM extends Object {
    public static final int numCoeffs = 0;
    int[] coefficients;
    int[] data;
    int[] degree;
    int[][] field;
    int name;
    int value;

    PolynomialGF2mSmallM(int $i0, byte[] bArr) {
        int $i1 = 0;
        this.name = 188272583 * $i0;
        Logger $r2 = new Logger(bArr);
        int $i02 = $r2.get((byte) 0) * -226945423;
        $i0 = $i02;
        this.value = $i02;
        $i02 = this.value * 1121446545;
        $i0 = $i02;
        this.data = new int[$i02];
        $i02 = this.value * 1121446545;
        $i0 = $i02;
        this.field = new int[$i02][];
        this.degree = new int[(-672493312 * this.value)];
        $i02 = this.value * 1121446545;
        $i0 = $i02;
        this.coefficients = new int[$i02];
        $i0 = 0;
        while ($i0 < this.value * 1121446545) {
            try {
                this.data[$i0] = $r2.get((byte) 0);
                $i0++;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "bf.<init>(" + ')');
            }
        }
        for ($i0 = 0; $i0 < this.value * 1121446545; $i0++) {
            this.field[$i0] = new int[$r2.get((byte) 0)];
        }
        for ($i0 = 0; $i0 < this.value * 1121446545; $i0++) {
            for (int $i2 = 0; $i2 < this.field[$i0].length; $i2++) {
                int[] $r3 = this.degree;
                int $i3 = ($i0 * 256) + $i2;
                int[] $r5 = this.field[$i0];
                int $i4 = $r2.get((byte) 0);
                $r5[$i2] = $i4;
                $r3[$i3] = $i4;
            }
        }
        while (true) {
            $i02 = this.value * 1121446545;
            $i0 = $i02;
            if ($i1 < $i02) {
                this.coefficients[$i1] = this.field[$i1].length;
                $i1++;
            } else {
                return;
            }
        }
    }

    static void add(int[] iArr, int[] iArr2, int i, int i2, int $i1, int i3, int $i3, int i4, int i5, int i6) {
        i = -(i3 >> 2);
        i3 = -(i3 & 3);
        $i3 = -$i3;
        int $i8 = i2;
        while ($i3 < 0) {
            i2 = i;
            while (i2 < 0) {
                i6 = $i8 + 1;
                $i8 = iArr2[$i8];
                if ($i8 != 0) {
                    iArr[$i1] = $i8;
                    $i1++;
                } else {
                    $i1++;
                }
                $i8 = i6 + 1;
                i6 = iArr2[i6];
                if (i6 != 0) {
                    iArr[$i1] = i6;
                    i6 = $i1 + 1;
                } else {
                    i6 = $i1 + 1;
                }
                $i1 = $i8 + 1;
                $i8 = iArr2[$i8];
                if ($i8 != 0) {
                    iArr[i6] = $i8;
                    $i8 = i6 + 1;
                } else {
                    $i8 = i6 + 1;
                }
                i6 = $i1 + 1;
                int $i9 = iArr2[$i1];
                if ($i9 != 0) {
                    $i1 = $i8 + 1;
                    iArr[$i8] = $i9;
                } else {
                    $i1 = $i8 + 1;
                }
                i2++;
                $i8 = i6;
            }
            i2 = $i1;
            $i1 = i3;
            while ($i1 < 0) {
                i6 = $i8 + 1;
                try {
                    $i8 = iArr2[$i8];
                    if ($i8 != 0) {
                        $i9 = i2 + 1;
                        iArr[i2] = $i8;
                    } else {
                        $i9 = i2 + 1;
                    }
                    $i1++;
                    i2 = $i9;
                    $i8 = i6;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "bf.ak(" + ')');
                }
            }
            $i1 = i2 + i4;
            $i3++;
            int $i82 = i5;
            $i8 += $i82;
            i5 = $i82;
        }
    }
}
