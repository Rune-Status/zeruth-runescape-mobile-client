package p000;

/* compiled from: ca */
public class FastMath {
    static final int PI = 16;
    public static final int PRAGMA = 170;
    public static final int SC_SERVICE_UNAVAILABLE = 503;

    FastMath() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ca.<init>(" + ')');
        }
    }

    public static final int getValue(double $d0, double d, double d2) {
        double $d02;
        if (d != 0.0d) {
            d = d2 < 0.5d ? d2 * (1.0d + d) : (d + d2) - (d * d2);
            d2 = (2.0d * d2) - d;
            double $d3 = 0.3333333333333333d + $d0;
            if ($d3 > 1.0d) {
                $d3 -= 1.0d;
            }
            double $d4 = $d0 - 0.3333333333333333d;
            if ($d4 < 0.0d) {
                $d4 += 1.0d;
            }
            $d3 = 6.0d * $d3 < 1.0d ? ($d3 * (6.0d * (d - d2))) + d2 : 2.0d * $d3 < 1.0d ? d : 3.0d * $d3 < 2.0d ? (((0.6666666666666666d - $d3) * (d - d2)) * 6.0d) + d2 : d2;
            if (6.0d * $d0 < 1.0d) {
                $d0 = ((6.0d * (d - d2)) * $d0) + d2;
            } else if (2.0d * $d0 < 1.0d) {
                $d0 = d;
            } else if (3.0d * $d0 < 2.0d) {
                $d02 = ((0.6666666666666666d - $d0) * (d - d2)) * 6.0d;
                $d0 = $d02;
                $d0 = $d02 + d2;
            } else {
                $d0 = d2;
            }
            if (6.0d * $d4 < 1.0d) {
                $d02 = (d - d2) * 6.0d;
                d = $d02;
                d2 += $d02 * $d4;
                d = $d3;
            } else if (2.0d * $d4 < 1.0d) {
                d2 = d;
                d = $d3;
            } else if (3.0d * $d4 < 2.0d) {
                d2 += ((d - d2) * (0.6666666666666666d - $d4)) * 6.0d;
                d = $d3;
            } else {
                d = $d3;
            }
        } else {
            $d0 = d2;
            d = d2;
        }
        $d02 = d * 256.0d;
        d = $d02;
        int $i2 = (int) $d02;
        $d02 = $d0 * 256.0d;
        $d0 = $d02;
        return ((((int) $d02) << 8) + ($i2 << 16)) + ((int) (256.0d * d2));
    }

    public static int pow(int $i1, int $i2, int i) {
        int $i3 = 1;
        while ($i2 > 1) {
            if (($i2 & 1) != 0) {
                $i3 *= $i1;
            }
            $i1 *= $i1;
            $i2 >>= 1;
        }
        return $i2 == 1 ? $i3 * $i1 : $i3;
    }
}
