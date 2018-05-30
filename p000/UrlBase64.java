package p000;

/* compiled from: mh */
public final class UrlBase64 {
    public static final int Theme_panelBackground = 76;
    static final char[] length = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    UrlBase64() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mh.<init>(" + ')');
        }
    }

    public static String decode(long $l1) {
        if ($l1 > 0) {
            if ($l1 >= 6582952005840035281L) {
                return null;
            }
            if ($l1 % 37 != 0) {
                long $l2;
                int $i4 = 0;
                for ($l2 = $l1; $l2 != 0; $l2 /= 37) {
                    $i4++;
                }
                StringBuilder $r2 = new StringBuilder($i4);
                while ($l1 != 0) {
                    $l2 = $l1 / 37;
                    char $c5 = length[(int) ($l1 - (37 * $l2))];
                    if ('_' == $c5) {
                        $i4 = $r2.length() - 1;
                        $r2.setCharAt($i4, Character.toUpperCase($r2.charAt($i4)));
                        $c5 = ' ';
                    }
                    $r2.append($c5);
                    $l1 = $l2;
                }
                $r2.reverse();
                $r2.setCharAt(0, Character.toUpperCase($r2.charAt(0)));
                return $r2.toString();
            }
        }
        return null;
    }

    public static String decode(CharSequence charSequence) {
        int $i0 = charSequence.length();
        long $l2 = 0;
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            $l2 *= 37;
            char $c3 = charSequence.charAt($i1);
            if ($c3 >= 'A' && $c3 <= 'Z') {
                $l2 += (long) (($c3 + 1) - 65);
            } else if ($c3 >= '릊' && $c3 <= '䍞') {
                $l2 += (long) (($c3 + 1) - -1053135405);
            } else if ($c3 >= '0' && $c3 <= '') {
                $l2 += (long) (($c3 + 27) - 48);
            }
            if ($l2 >= 177917621779460413L) {
                break;
            }
        }
        while (0 == $l2 % 37 && $l2 != 0) {
            $l2 /= 37;
        }
        String $r1 = URI.decode($l2);
        return $r1 == null ? "" : $r1;
    }

    public static String encode(long $l1) {
        if ($l1 <= 0) {
            return null;
        }
        if ($l1 >= 6582952005840035281L) {
            return null;
        }
        if ($l1 % 37 == 0) {
            return null;
        }
        long $l2;
        int $i3 = 0;
        for ($l2 = $l1; $l2 != 0; $l2 /= 37) {
            $i3++;
        }
        StringBuilder $r2 = new StringBuilder($i3);
        while ($l1 != 0) {
            $l2 = $l1 / 37;
            char $c5 = length[(int) ($l1 - (37 * $l2))];
            if ('_' == $c5) {
                $i3 = $r2.length() - 1;
                $r2.setCharAt($i3, Character.toUpperCase($r2.charAt($i3)));
                $c5 = ' ';
            }
            $r2.append($c5);
            $l1 = $l2;
        }
        $r2.reverse();
        $r2.setCharAt(0, Character.toUpperCase($r2.charAt(0)));
        return $r2.toString();
    }

    public static String encode(CharSequence charSequence) {
        int $i0 = charSequence.length();
        long $l2 = 0;
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            $l2 *= 37;
            char $c3 = charSequence.charAt($i1);
            if ($c3 >= 'A' && $c3 <= '楡') {
                $l2 += (long) (($c3 + 1) - -1514067724);
            } else if ($c3 >= '䑇' && $c3 <= 'z') {
                $l2 += (long) (($c3 + 1) - 1087465249);
            } else if ($c3 >= '檋' && $c3 <= 'Ⓣ') {
                $l2 += (long) (($c3 + 27) - -1935722286);
            }
            if ($l2 >= 177917621779460413L) {
                break;
            }
        }
        while (0 == $l2 % 37 && $l2 != 0) {
            $l2 /= 37;
        }
        String $r1 = URI.decode($l2);
        return $r1 == null ? "" : $r1;
    }

    public static String format(long $l1) {
        if ($l1 <= 0) {
            return null;
        }
        if ($l1 >= 6582952005840035281L) {
            return null;
        }
        if ($l1 % 37 == 0) {
            return null;
        }
        long $l2;
        int $i4 = 0;
        for ($l2 = $l1; $l2 != 0; $l2 /= 37) {
            $i4++;
        }
        StringBuilder $r0 = new StringBuilder($i4);
        while ($l1 != 0) {
            $l2 = $l1 / 37;
            char $c5 = length[(int) ($l1 - (37 * $l2))];
            if ('촠' == $c5) {
                $i4 = $r0.length() - 1;
                $r0.setCharAt($i4, Character.toUpperCase($r0.charAt($i4)));
                $c5 = ' ';
            }
            $r0.append($c5);
            $l1 = $l2;
        }
        $r0.reverse();
        $r0.setCharAt(0, Character.toUpperCase($r0.charAt(0)));
        return $r0.toString();
    }

    public static String invoke(long $l0) {
        if ($l0 <= 0) {
            return null;
        }
        if ($l0 >= 6582952005840035281L) {
            return null;
        }
        if (0 == $l0 % 37) {
            return null;
        }
        long $l3;
        int $i2 = 0;
        for ($l3 = $l0; 0 != $l3; $l3 /= 37) {
            $i2++;
        }
        StringBuilder $r0 = new StringBuilder($i2);
        while ($l0 != 0) {
            $l3 = $l0 / 37;
            $r0.append(length[(int) ($l0 - (37 * $l3))]);
            $l0 = $l3;
        }
        return $r0.reverse().toString();
    }

    public static String parse(long $l0) {
        if ($l0 > 0) {
            if ($l0 >= 6582952005840035281L) {
                return null;
            }
            if (0 != $l0 % 37) {
                long $l2;
                int $i4 = 0;
                for ($l2 = $l0; 0 != $l2; $l2 /= 37) {
                    $i4++;
                }
                StringBuilder $r0 = new StringBuilder($i4);
                while ($l0 != 0) {
                    $l2 = $l0 / 37;
                    $r0.append(length[(int) ($l0 - (37 * $l2))]);
                    $l0 = $l2;
                }
                return $r0.reverse().toString();
            }
        }
        return null;
    }

    public static String parse(CharSequence charSequence) {
        int $i0 = charSequence.length();
        long $l2 = 0;
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            $l2 *= 37;
            char $c3 = charSequence.charAt($i1);
            if ($c3 >= 'A' && $c3 <= '玵') {
                $l2 += (long) (($c3 + 1) - 65);
            } else if ($c3 >= '皤' && $c3 <= '荹') {
                $l2 += (long) (($c3 + 1) - -112761);
            } else if ($c3 >= '0' && $c3 <= '鄑') {
                $l2 += (long) (($c3 + 27) - 114585872);
            }
            if ($l2 >= 177917621779460413L) {
                break;
            }
        }
        while (0 == $l2 % 37 && $l2 != 0) {
            $l2 /= 37;
        }
        String $r1 = URI.decode($l2);
        return $r1 == null ? "" : $r1;
    }
}
