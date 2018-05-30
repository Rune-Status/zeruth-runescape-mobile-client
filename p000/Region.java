package p000;

/* compiled from: ho */
public class Region extends Object {
    public static final int length = 4;
    static final int resultStart = 1004;
    static Math value = new Math(32);
    int[] data;
    int[] size;

    Region() {
        try {
            this.size = new int[]{-1};
            this.data = new int[]{0};
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ho.<init>(" + ')');
        }
    }

    static int add(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        if ($r2 == null) {
            return 0;
        }
        if (-1 == i2) {
            return 0;
        }
        i = 0;
        for (int $i2 = 0; $i2 < $r2.data.length; $i2++) {
            if ($r2.size[$i2] == i2) {
                i += $r2.data[$i2];
            }
        }
        return i;
    }

    static void add(int i) {
        Region $r2 = (Region) value.get((long) i);
        if ($r2 != null) {
            for (i = 0; i < $r2.size.length; i++) {
                $r2.size[i] = -1;
                $r2.data[i] = 0;
            }
        }
    }

    static int compareTo(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        if ($r2 == null) {
            return 0;
        }
        if (-1 == i2) {
            return 0;
        }
        i = 0;
        for (int $i2 = 0; $i2 < $r2.data.length; $i2++) {
            if ($r2.size[$i2] == i2) {
                i += $r2.data[$i2];
            }
        }
        return i;
    }

    static int copy(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        return $r2 == null ? 0 : (i2 < 0 || i2 >= $r2.data.length) ? 0 : $r2.data[i2];
    }

    static void copy(int i) {
        Region $r2 = (Region) value.get((long) i);
        if ($r2 != null) {
            $r2.iterator();
        }
    }

    public static String decode(CharSequence charSequence, byte b) {
        try {
            int $i1 = charSequence.length();
            long $l3 = 0;
            for (int $i2 = 0; $i2 < $i1; $i2++) {
                $l3 *= 37;
                char $c4 = charSequence.charAt($i2);
                if ($c4 >= 'A' && $c4 <= 'Z') {
                    $l3 += (long) (($c4 + 1) - 65);
                } else if ($c4 >= 'a' && $c4 <= 'z') {
                    $l3 += (long) (($c4 + 1) - 97);
                } else if ($c4 >= '0' && $c4 <= '9') {
                    $l3 += (long) (($c4 + 27) - 48);
                }
                if ($l3 >= 177917621779460413L) {
                    break;
                }
            }
            while (0 == $l3 % 37 && $l3 != 0) {
                $l3 /= 37;
            }
            String $r1 = URI.decode($l3);
            return $r1 == null ? "" : $r1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ho.an(" + ')');
        }
    }

    static int equals(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        if ($r2 == null) {
            return 0;
        }
        if (-1 == i2) {
            return 0;
        }
        i = 0;
        for (int $i2 = 0; $i2 < $r2.data.length; $i2++) {
            if ($r2.size[$i2] == i2) {
                i += $r2.data[$i2];
            }
        }
        return i;
    }

    static void equals(int i) {
        Region $r2 = (Region) value.get((long) i);
        if ($r2 != null) {
            for (i = 0; i < $r2.size.length; i++) {
                $r2.size[i] = -1;
                $r2.data[i] = 0;
            }
        }
    }

    static int get(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        return $r2 == null ? 0 : (i2 < 0 || i2 >= $r2.data.length) ? 0 : $r2.data[i2];
    }

    static int getLength(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        return $r2 == null ? 0 : (i2 < 0 || i2 >= $r2.data.length) ? 0 : $r2.data[i2];
    }

    static int getValue(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        return $r2 == null ? 0 : (i2 < 0 || i2 >= $r2.data.length) ? 0 : $r2.data[i2];
    }

    static int set(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        return $r2 == null ? 0 : (i2 < 0 || i2 >= $r2.data.length) ? 0 : $r2.data[i2];
    }

    static int toString(int i, int i2) {
        Region $r2 = (Region) value.get((long) i);
        if ($r2 == null) {
            return 0;
        }
        if (-1 == i2) {
            return 0;
        }
        i = 0;
        for (int $i2 = 0; $i2 < $r2.data.length; $i2++) {
            if ($r2.size[$i2] == i2) {
                i += $r2.data[$i2];
            }
        }
        return i;
    }

    static void toString(int i) {
        Region $r2 = (Region) value.get((long) i);
        if ($r2 != null) {
            for (i = 0; i < $r2.size.length; i++) {
                $r2.size[i] = -1;
                $r2.data[i] = 0;
            }
        }
    }
}
