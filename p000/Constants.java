package p000;

/* compiled from: mn */
public class Constants {
    public static final int ACC_STRICT = 2048;
    public static final int PHOTO_THUMBNAIL_URI = 6;
    public static final int f93X = 128;
    static System data;
    static int size;

    Constants() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mn.<init>(" + ')');
        }
    }

    public static String decode(CharSequence charSequence) {
        int $i0 = charSequence.length();
        StringBuilder $r1 = new StringBuilder($i0);
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            char $c2 = charSequence.charAt($i1);
            if (($c2 >= 'a' && $c2 <= 'z') || (($c2 >= 'A' && $c2 <= 'Z') || (($c2 >= '0' && $c2 <= '9') || '.' == $c2 || '-' == $c2 || '*' == $c2 || '_' == $c2))) {
                $r1.append($c2);
            } else if (' ' == $c2) {
                $r1.append('+');
            } else {
                byte $b3 = TextUtils.append($c2, -1053569484);
                $r1.append('%');
                byte $b4 = ($b3 >> (byte) 4) & (byte) 15;
                if ($b4 >= (byte) 10) {
                    $r1.append((char) ($b4 + 55));
                } else {
                    $r1.append((char) ($b4 + 48));
                }
                $b3 &= (byte) 15;
                if ($b3 >= (byte) 10) {
                    $r1.append((char) ($b3 + 55));
                } else {
                    $r1.append((char) ($b3 + 48));
                }
            }
        }
        return $r1.toString();
    }

    public static String encode(CharSequence charSequence) {
        int $i0 = charSequence.length();
        StringBuilder $r1 = new StringBuilder($i0);
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            char $c2 = charSequence.charAt($i1);
            if (($c2 >= 'a' && $c2 <= 'z') || (($c2 >= 'A' && $c2 <= 'Z') || (($c2 >= '0' && $c2 <= '9') || '.' == $c2 || '-' == $c2 || '*' == $c2 || '_' == $c2))) {
                $r1.append($c2);
            } else if (' ' == $c2) {
                $r1.append('+');
            } else {
                byte $b3 = TextUtils.append($c2, 398235379);
                $r1.append('%');
                byte $b4 = ($b3 >> (byte) 4) & (byte) 15;
                if ($b4 >= (byte) 10) {
                    $r1.append((char) ($b4 + 55));
                } else {
                    $r1.append((char) ($b4 + 48));
                }
                $b3 &= (byte) 15;
                if ($b3 >= (byte) 10) {
                    $r1.append((char) ($b3 + 55));
                } else {
                    $r1.append((char) ($b3 + 48));
                }
            }
        }
        return $r1.toString();
    }

    public static String nextToken(CharSequence charSequence) {
        int $i0 = charSequence.length();
        StringBuilder $r1 = new StringBuilder($i0);
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            char $c2 = charSequence.charAt($i1);
            if (($c2 >= 'a' && $c2 <= 'గ') || (($c2 >= 'A' && $c2 <= 'Z') || (($c2 >= '0' && $c2 <= '루') || '.' == $c2 || '鈚' == $c2 || '*' == $c2 || '䉯' == $c2))) {
                $r1.append($c2);
            } else if (' ' == $c2) {
                $r1.append('+');
            } else {
                byte $b4 = TextUtils.append($c2, -359376086);
                $r1.append('䩘');
                byte $b5 = ($b4 >> (byte) 4) & (byte) 15;
                if ($b5 >= (byte) 10) {
                    $r1.append((char) ($b5 - 1825210007));
                } else {
                    $r1.append((char) ($b5 + 48));
                }
                $b4 &= (byte) 15;
                if ($b4 >= (byte) 10) {
                    $r1.append((char) ($b4 + 2042182355));
                } else {
                    $r1.append((char) ($b4 + 944859328));
                }
            }
        }
        return $r1.toString();
    }
}
