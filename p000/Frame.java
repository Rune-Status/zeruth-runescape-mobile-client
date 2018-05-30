package p000;

/* compiled from: dn */
public class Frame {
    static final int BOOLEAN = 1;
    static final int OLD_ENVIRONMENT_VARIABLES = 36;
    static Long data = null;
    static final int f125g = 585;
    static boolean f126i;
    static int[] f127p;

    Frame() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dn.<init>(" + ')');
        }
    }

    public static final int m10a(double $d0, double d, double d2) {
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

    public static final int distance(double $d0, double d, double $d2) {
        double $d3;
        double $d22;
        if (d != 0.0d) {
            if ($d2 < 0.5d) {
                $d3 = (1.0d + d) * $d2;
            } else {
                $d3 = d + $d2;
                $d22 = d * $d2;
                d = $d22;
                $d3 -= $d22;
            }
            d = (2.0d * $d2) - $d3;
            double $d4 = 0.3333333333333333d + $d0;
            if ($d4 > 1.0d) {
                $d4 -= 1.0d;
            }
            $d2 = $d0 - 0.3333333333333333d;
            if ($d2 < 0.0d) {
                $d2 += 1.0d;
            }
            $d4 = 6.0d * $d4 < 1.0d ? ($d4 * (6.0d * ($d3 - d))) + d : 2.0d * $d4 < 1.0d ? $d3 : 3.0d * $d4 < 2.0d ? (((0.6666666666666666d - $d4) * ($d3 - d)) * 6.0d) + d : d;
            if (6.0d * $d0 < 1.0d) {
                $d0 = ((6.0d * ($d3 - d)) * $d0) + d;
            } else if (2.0d * $d0 < 1.0d) {
                $d0 = $d3;
            } else if (3.0d * $d0 < 2.0d) {
                $d22 = ((0.6666666666666666d - $d0) * ($d3 - d)) * 6.0d;
                $d0 = $d22;
                $d0 = $d22 + d;
            } else {
                $d0 = d;
            }
            if (6.0d * $d2 < 1.0d) {
                $d3 = ((($d3 - d) * 6.0d) * $d2) + d;
                $d2 = $d0;
                $d0 = $d4;
            } else if (2.0d * $d2 < 1.0d) {
                $d2 = $d0;
                $d0 = $d4;
            } else if (3.0d * $d2 < 2.0d) {
                $d3 = ((($d3 - d) * (0.6666666666666666d - $d2)) * 6.0d) + d;
                $d2 = $d0;
                $d0 = $d4;
            } else {
                $d3 = d;
                $d2 = $d0;
                $d0 = $d4;
            }
        } else {
            $d3 = $d2;
            $d0 = $d2;
        }
        $d22 = $d0 * 256.0d;
        $d0 = $d22;
        return ((int) ($d3 * 256.0d)) + ((((int) (256.0d * $d2)) << 8) + (((int) $d22) << 16));
    }

    static final void init(int i, int i2, int i3, int i4, int i5) {
        i5 = i2;
        while (i5 <= i4 + i2) {
            int $i5 = i;
            while ($i5 <= i + i3) {
                if ($i5 >= 0 && $i5 < DiskLruCache.AppCompatTheme_editTextStyle && i5 >= 0 && i5 < 104) {
                    Server.value[0][$i5][i5] = Byte.MAX_VALUE;
                    if ($i5 == i && $i5 > 0) {
                        Chart.length[0][$i5][i5] = Chart.length[0][$i5 - 1][i5];
                    }
                    if ($i5 == i3 + i && $i5 < 103) {
                        Chart.length[0][$i5][i5] = Chart.length[0][$i5 + 1][i5];
                    }
                    if (i5 == i2 && i5 > 0) {
                        Chart.length[0][$i5][i5] = Chart.length[0][$i5][i5 - 1];
                    }
                    if (i2 + i4 == i5 && i5 < 103) {
                        try {
                            Chart.length[0][$i5][i5] = Chart.length[0][$i5][i5 + 1];
                        } catch (RuntimeException $r7) {
                            throw StringBuilder.append($r7, "dn.an(" + ')');
                        }
                    }
                }
                $i5++;
            }
            i5++;
        }
    }

    public static final int set(double d, double d2, double $d2) {
        double $d3;
        double $d22;
        if (d2 != 0.0d) {
            if ($d2 < 0.5d) {
                $d3 = (1.0d + d2) * $d2;
            } else {
                $d3 = d2 + $d2;
                $d22 = d2 * $d2;
                d2 = $d22;
                $d3 -= $d22;
            }
            d2 = (2.0d * $d2) - $d3;
            double $d4 = 0.3333333333333333d + d;
            if ($d4 > 1.0d) {
                $d4 -= 1.0d;
            }
            $d2 = d - 0.3333333333333333d;
            if ($d2 < 0.0d) {
                $d2 += 1.0d;
            }
            $d4 = 6.0d * $d4 < 1.0d ? ($d4 * (6.0d * ($d3 - d2))) + d2 : 2.0d * $d4 < 1.0d ? $d3 : 3.0d * $d4 < 2.0d ? (((0.6666666666666666d - $d4) * ($d3 - d2)) * 6.0d) + d2 : d2;
            if (6.0d * d < 1.0d) {
                d = ((6.0d * ($d3 - d2)) * d) + d2;
            } else if (2.0d * d < 1.0d) {
                d = $d3;
            } else if (3.0d * d < 2.0d) {
                $d22 = ((0.6666666666666666d - d) * ($d3 - d2)) * 6.0d;
                d = $d22;
                d = $d22 + d2;
            } else {
                d = d2;
            }
            if (6.0d * $d2 < 1.0d) {
                $d3 = ((($d3 - d2) * 6.0d) * $d2) + d2;
                $d2 = d;
                d = $d4;
            } else if (2.0d * $d2 < 1.0d) {
                $d2 = d;
                d = $d4;
            } else if (3.0d * $d2 < 2.0d) {
                $d3 = ((($d3 - d2) * (0.6666666666666666d - $d2)) * 6.0d) + d2;
                $d2 = d;
                d = $d4;
            } else {
                $d3 = d2;
                $d2 = d;
                d = $d4;
            }
        } else {
            $d3 = $d2;
            d = $d2;
        }
        $d22 = d * 256.0d;
        d = $d22;
        return ((int) ($d3 * 256.0d)) + ((((int) (256.0d * $d2)) << 8) + (((int) $d22) << 16));
    }

    public static final int update(double d, double d2, double d3) {
        double $d0;
        if (d2 != 0.0d) {
            d2 = d3 < 0.5d ? d3 * (1.0d + d2) : (d2 + d3) - (d2 * d3);
            d3 = (2.0d * d3) - d2;
            double $d3 = 0.3333333333333333d + d;
            if ($d3 > 1.0d) {
                $d3 -= 1.0d;
            }
            double $d4 = d - 0.3333333333333333d;
            if ($d4 < 0.0d) {
                $d4 += 1.0d;
            }
            $d3 = 6.0d * $d3 < 1.0d ? ($d3 * (6.0d * (d2 - d3))) + d3 : 2.0d * $d3 < 1.0d ? d2 : 3.0d * $d3 < 2.0d ? (((0.6666666666666666d - $d3) * (d2 - d3)) * 6.0d) + d3 : d3;
            if (6.0d * d < 1.0d) {
                d = ((6.0d * (d2 - d3)) * d) + d3;
            } else if (2.0d * d < 1.0d) {
                d = d2;
            } else if (3.0d * d < 2.0d) {
                $d0 = ((0.6666666666666666d - d) * (d2 - d3)) * 6.0d;
                d = $d0;
                d = $d0 + d3;
            } else {
                d = d3;
            }
            if (6.0d * $d4 < 1.0d) {
                $d0 = (d2 - d3) * 6.0d;
                d2 = $d0;
                d3 += $d0 * $d4;
                d2 = $d3;
            } else if (2.0d * $d4 < 1.0d) {
                d3 = d2;
                d2 = $d3;
            } else if (3.0d * $d4 < 2.0d) {
                d3 += ((d2 - d3) * (0.6666666666666666d - $d4)) * 6.0d;
                d2 = $d3;
            } else {
                d2 = $d3;
            }
        } else {
            d = d3;
            d2 = d3;
        }
        $d0 = d2 * 256.0d;
        d2 = $d0;
        int $i2 = (int) $d0;
        $d0 = d * 256.0d;
        d = $d0;
        return ((((int) $d0) << 8) + ($i2 << 16)) + ((int) (256.0d * d3));
    }
}
