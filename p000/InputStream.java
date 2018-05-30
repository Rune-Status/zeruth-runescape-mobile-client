package p000;

/* compiled from: iz */
public class InputStream {
    static final int TAG_GPS_DEST_DISTANCE_REF = 25;
    static Class value;

    InputStream() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "iz.<init>(" + ')');
        }
    }

    public static int contains(int $i1, int $i2) {
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

    public static int decodeDirectBits(int i, int i2) {
        int $i2 = i >>> 31;
        return (($i2 + i) / i2) - $i2;
    }

    public static int encodeUTF8(int i, int i2) {
        int $i2 = i >>> 31;
        return (($i2 + i) / i2) - $i2;
    }

    public static int getInt(int $i0) {
        int $i1 = 0;
        if ($i0 < 0 || $i0 >= PingManager.STATE_SENSOR_ON_FLAG) {
            $i0 >>>= 16;
            $i1 = 16;
        }
        if ($i0 >= 256) {
            $i0 >>>= 8;
            $i1 += 8;
        }
        if ($i0 >= 16) {
            $i0 >>>= 4;
            $i1 += 4;
        }
        if ($i0 >= 4) {
            $i0 >>>= 2;
            $i1 += 2;
        }
        if ($i0 >= 1) {
            $i0 >>>= 1;
            $i1++;
        }
        return $i1 + $i0;
    }

    public static int getInt(int $i1, int $i2) {
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

    public static int readB(int $i0) {
        int $i1 = 0;
        if ($i0 < 0 || $i0 >= PingManager.STATE_SENSOR_ON_FLAG) {
            $i0 >>>= 16;
            $i1 = 16;
        }
        if ($i0 >= -503836615) {
            $i0 >>>= 8;
            $i1 += 8;
        }
        if ($i0 >= 16) {
            $i0 >>>= 4;
            $i1 += 4;
        }
        if ($i0 >= 4) {
            $i0 >>>= 2;
            $i1 += 2;
        }
        if ($i0 >= 1) {
            $i0 >>>= 1;
            $i1++;
        }
        return $i1 + $i0;
    }

    public static int readB(int i, int i2) {
        int $i2 = i >>> -1443531541;
        return (($i2 + i) / i2) - $i2;
    }

    public static int setValue(int $i1, int $i2) {
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

    static final int toString(int i, int i2, int $i3, int i3) {
        i3 = i >> 7;
        int $i4 = i2 >> 7;
        if (i3 < 0 || $i4 < 0 || i3 > 103 || $i4 > 103) {
            return 0;
        }
        if ($i3 < 3) {
            try {
                if ((byte) 2 == (Chart.size[1][i3][$i4] & (byte) 2)) {
                    $i3++;
                }
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "iz.de(" + ')');
            }
        }
        int $i6 = i & 127;
        i = i2 & 127;
        i2 = (((Constants.f93X - $i6) * Chart.length[$i3][i3][$i4]) + (Chart.length[$i3][i3 + 1][$i4] * $i6)) >> 7;
        int $i7 = Chart.length[$i3][i3 + 1][$i4 + 1] * $i6;
        int $i32 = Chart.length[$i3][i3][$i4 + 1] * (Constants.f93X - $i6);
        $i3 = $i32;
        return (((($i32 + $i7) >> 7) * i) + ((Constants.f93X - i) * i2)) >> 7;
    }
}
