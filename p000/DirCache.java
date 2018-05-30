package p000;

/* compiled from: ml */
public class DirCache {
    static final int CALENDARS_INDEX_CALENDAR_COLOR = 2;
    static final int HINT_CONTEXT_CAR_HOME = 2;
    public static final char[] this$0 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
    public static int value;

    DirCache() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ml.<init>(" + ')');
        }
    }

    public static int build(CharSequence charSequence, int i, int $i1, byte[] bArr, int i2) {
        $i1 -= i;
        for (int $i4 = 0; $i4 < $i1; $i4++) {
            char $c3 = charSequence.charAt(i + $i4);
            if (($c3 > '\u0000' && $c3 < '') || ($c3 >= ' ' && $c3 <= 'ÿ')) {
                bArr[$i4 + i2] = (byte) $c3;
            } else if ('€' == $c3) {
                bArr[i2 + $i4] = Byte.MIN_VALUE;
            } else if ('‚' == $c3) {
                bArr[$i4 + i2] = (byte) -126;
            } else if ($c3 == 'ƒ') {
                bArr[i2 + $i4] = (byte) -125;
            } else if ('„' == $c3) {
                bArr[i2 + $i4] = (byte) -124;
            } else if ($c3 == '…') {
                bArr[i2 + $i4] = (byte) -123;
            } else if ($c3 == '†') {
                bArr[$i4 + i2] = (byte) -122;
            } else if ($c3 == '‡') {
                bArr[i2 + $i4] = (byte) -121;
            } else if ('ˆ' == $c3) {
                bArr[$i4 + i2] = (byte) -120;
            } else if ('‰' == $c3) {
                bArr[$i4 + i2] = (byte) -119;
            } else if ('Š' == $c3) {
                bArr[$i4 + i2] = (byte) -118;
            } else if ('‹' == $c3) {
                bArr[i2 + $i4] = (byte) -117;
            } else if ($c3 == 'Œ') {
                bArr[i2 + $i4] = (byte) -116;
            } else if ($c3 == 'Ž') {
                bArr[$i4 + i2] = (byte) -114;
            } else if ($c3 == '‘') {
                bArr[$i4 + i2] = (byte) -111;
            } else if ('’' == $c3) {
                bArr[i2 + $i4] = (byte) -110;
            } else if ('“' == $c3) {
                bArr[$i4 + i2] = (byte) -109;
            } else if ($c3 == '”') {
                bArr[$i4 + i2] = (byte) -108;
            } else if ($c3 == '•') {
                bArr[$i4 + i2] = (byte) -107;
            } else if ($c3 == '–') {
                bArr[$i4 + i2] = (byte) -106;
            } else if ('—' == $c3) {
                bArr[i2 + $i4] = (byte) -105;
            } else if ('˜' == $c3) {
                bArr[$i4 + i2] = (byte) -104;
            } else if ('™' == $c3) {
                bArr[i2 + $i4] = (byte) -103;
            } else if ($c3 == 'š') {
                bArr[i2 + $i4] = (byte) -102;
            } else if ($c3 == '›') {
                bArr[$i4 + i2] = (byte) -101;
            } else if ('œ' == $c3) {
                bArr[$i4 + i2] = (byte) -100;
            } else if ('ž' == $c3) {
                bArr[$i4 + i2] = (byte) -98;
            } else if ($c3 == 'Ÿ') {
                bArr[i2 + $i4] = (byte) -97;
            } else {
                bArr[i2 + $i4] = (byte) 63;
            }
        }
        return $i1;
    }

    public static byte[] build(CharSequence charSequence) {
        int $i0 = charSequence.length();
        byte[] $r1 = new byte[$i0];
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            char $c2 = charSequence.charAt($i1);
            if (($c2 > '\u0000' && $c2 < '') || ($c2 >= ' ' && $c2 <= 'ÿ')) {
                $r1[$i1] = (byte) $c2;
            } else if ('€' == $c2) {
                $r1[$i1] = Byte.MIN_VALUE;
            } else if ('‚' == $c2) {
                $r1[$i1] = (byte) -126;
            } else if ('ƒ' == $c2) {
                $r1[$i1] = (byte) -125;
            } else if ('„' == $c2) {
                $r1[$i1] = (byte) -124;
            } else if ('…' == $c2) {
                $r1[$i1] = (byte) -123;
            } else if ('†' == $c2) {
                $r1[$i1] = (byte) -122;
            } else if ($c2 == '‡') {
                $r1[$i1] = (byte) -121;
            } else if ('ˆ' == $c2) {
                $r1[$i1] = (byte) -120;
            } else if ($c2 == '‰') {
                $r1[$i1] = (byte) -119;
            } else if ('Š' == $c2) {
                $r1[$i1] = (byte) -118;
            } else if ($c2 == '‹') {
                $r1[$i1] = (byte) -117;
            } else if ('Œ' == $c2) {
                $r1[$i1] = (byte) -116;
            } else if ($c2 == 'Ž') {
                $r1[$i1] = (byte) -114;
            } else if ('‘' == $c2) {
                $r1[$i1] = (byte) -111;
            } else if ('’' == $c2) {
                $r1[$i1] = (byte) -110;
            } else if ($c2 == '“') {
                $r1[$i1] = (byte) -109;
            } else if ('”' == $c2) {
                $r1[$i1] = (byte) -108;
            } else if ('•' == $c2) {
                $r1[$i1] = (byte) -107;
            } else if ('–' == $c2) {
                $r1[$i1] = (byte) -106;
            } else if ('—' == $c2) {
                $r1[$i1] = (byte) -105;
            } else if ('˜' == $c2) {
                $r1[$i1] = (byte) -104;
            } else if ('™' == $c2) {
                $r1[$i1] = (byte) -103;
            } else if ($c2 == 'š') {
                $r1[$i1] = (byte) -102;
            } else if ('›' == $c2) {
                $r1[$i1] = (byte) -101;
            } else if ('œ' == $c2) {
                $r1[$i1] = (byte) -100;
            } else if ('ž' == $c2) {
                $r1[$i1] = (byte) -98;
            } else if ('Ÿ' == $c2) {
                $r1[$i1] = (byte) -97;
            } else {
                $r1[$i1] = (byte) 63;
            }
        }
        return $r1;
    }

    public static int decode(CharSequence charSequence, int i, int $i1, byte[] bArr, int i2) {
        $i1 -= i;
        for (int $i4 = 0; $i4 < $i1; $i4++) {
            char $c3 = charSequence.charAt(i + $i4);
            if (($c3 > '\u0000' && $c3 < '') || ($c3 >= ' ' && $c3 <= 'ÿ')) {
                bArr[$i4 + i2] = (byte) $c3;
            } else if ('€' == $c3) {
                bArr[i2 + $i4] = Byte.MIN_VALUE;
            } else if ('‚' == $c3) {
                bArr[$i4 + i2] = (byte) -126;
            } else if ($c3 == 'ƒ') {
                bArr[i2 + $i4] = (byte) -125;
            } else if ('„' == $c3) {
                bArr[i2 + $i4] = (byte) -124;
            } else if ($c3 == '…') {
                bArr[i2 + $i4] = (byte) -123;
            } else if ($c3 == '†') {
                bArr[$i4 + i2] = (byte) -122;
            } else if ($c3 == '‡') {
                bArr[i2 + $i4] = (byte) -121;
            } else if ('ˆ' == $c3) {
                bArr[$i4 + i2] = (byte) -120;
            } else if ('‰' == $c3) {
                bArr[$i4 + i2] = (byte) -119;
            } else if ('Š' == $c3) {
                bArr[$i4 + i2] = (byte) -118;
            } else if ('‹' == $c3) {
                bArr[i2 + $i4] = (byte) -117;
            } else if ($c3 == 'Œ') {
                bArr[i2 + $i4] = (byte) -116;
            } else if ($c3 == 'Ž') {
                bArr[$i4 + i2] = (byte) -114;
            } else if ($c3 == '‘') {
                bArr[$i4 + i2] = (byte) -111;
            } else if ('’' == $c3) {
                bArr[i2 + $i4] = (byte) -110;
            } else if ('“' == $c3) {
                bArr[$i4 + i2] = (byte) -109;
            } else if ($c3 == '”') {
                bArr[$i4 + i2] = (byte) -108;
            } else if ($c3 == '•') {
                bArr[$i4 + i2] = (byte) -107;
            } else if ($c3 == '–') {
                bArr[$i4 + i2] = (byte) -106;
            } else if ('—' == $c3) {
                bArr[i2 + $i4] = (byte) -105;
            } else if ('˜' == $c3) {
                bArr[$i4 + i2] = (byte) -104;
            } else if ('™' == $c3) {
                bArr[i2 + $i4] = (byte) -103;
            } else if ($c3 == 'š') {
                bArr[i2 + $i4] = (byte) -102;
            } else if ($c3 == '›') {
                bArr[$i4 + i2] = (byte) -101;
            } else if ('œ' == $c3) {
                bArr[$i4 + i2] = (byte) -100;
            } else if ('ž' == $c3) {
                bArr[$i4 + i2] = (byte) -98;
            } else if ($c3 == 'Ÿ') {
                bArr[i2 + $i4] = (byte) -97;
            } else {
                bArr[i2 + $i4] = (byte) 63;
            }
        }
        return $i1;
    }

    public static byte[] decode(CharSequence charSequence) {
        int $i0 = charSequence.length();
        byte[] $r1 = new byte[$i0];
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            char $c2 = charSequence.charAt($i1);
            if (($c2 > '\u0000' && $c2 < '') || ($c2 >= ' ' && $c2 <= 'ÿ')) {
                $r1[$i1] = (byte) $c2;
            } else if ('€' == $c2) {
                $r1[$i1] = Byte.MIN_VALUE;
            } else if ('‚' == $c2) {
                $r1[$i1] = (byte) -126;
            } else if ('ƒ' == $c2) {
                $r1[$i1] = (byte) -125;
            } else if ('„' == $c2) {
                $r1[$i1] = (byte) -124;
            } else if ('…' == $c2) {
                $r1[$i1] = (byte) -123;
            } else if ('†' == $c2) {
                $r1[$i1] = (byte) -122;
            } else if ($c2 == '‡') {
                $r1[$i1] = (byte) -121;
            } else if ('ˆ' == $c2) {
                $r1[$i1] = (byte) -120;
            } else if ($c2 == '‰') {
                $r1[$i1] = (byte) -119;
            } else if ('Š' == $c2) {
                $r1[$i1] = (byte) -118;
            } else if ($c2 == '‹') {
                $r1[$i1] = (byte) -117;
            } else if ('Œ' == $c2) {
                $r1[$i1] = (byte) -116;
            } else if ($c2 == 'Ž') {
                $r1[$i1] = (byte) -114;
            } else if ('‘' == $c2) {
                $r1[$i1] = (byte) -111;
            } else if ('’' == $c2) {
                $r1[$i1] = (byte) -110;
            } else if ($c2 == '“') {
                $r1[$i1] = (byte) -109;
            } else if ('”' == $c2) {
                $r1[$i1] = (byte) -108;
            } else if ('•' == $c2) {
                $r1[$i1] = (byte) -107;
            } else if ('–' == $c2) {
                $r1[$i1] = (byte) -106;
            } else if ('—' == $c2) {
                $r1[$i1] = (byte) -105;
            } else if ('˜' == $c2) {
                $r1[$i1] = (byte) -104;
            } else if ('™' == $c2) {
                $r1[$i1] = (byte) -103;
            } else if ($c2 == 'š') {
                $r1[$i1] = (byte) -102;
            } else if ('›' == $c2) {
                $r1[$i1] = (byte) -101;
            } else if ('œ' == $c2) {
                $r1[$i1] = (byte) -100;
            } else if ('ž' == $c2) {
                $r1[$i1] = (byte) -98;
            } else if ('Ÿ' == $c2) {
                $r1[$i1] = (byte) -97;
            } else {
                $r1[$i1] = (byte) 63;
            }
        }
        return $r1;
    }

    public static int encode(CharSequence charSequence, int i, int $i1, byte[] bArr, int i2) {
        $i1 -= i;
        for (int $i4 = 0; $i4 < $i1; $i4++) {
            char $c3 = charSequence.charAt(i + $i4);
            if (($c3 > '\u0000' && $c3 < '') || ($c3 >= ' ' && $c3 <= 'ÿ')) {
                bArr[$i4 + i2] = (byte) $c3;
            } else if ('€' == $c3) {
                bArr[i2 + $i4] = Byte.MIN_VALUE;
            } else if ('‚' == $c3) {
                bArr[$i4 + i2] = (byte) -126;
            } else if ($c3 == 'ƒ') {
                bArr[i2 + $i4] = (byte) -125;
            } else if ('„' == $c3) {
                bArr[i2 + $i4] = (byte) -124;
            } else if ($c3 == '…') {
                bArr[i2 + $i4] = (byte) -123;
            } else if ($c3 == '†') {
                bArr[$i4 + i2] = (byte) -122;
            } else if ($c3 == '‡') {
                bArr[i2 + $i4] = (byte) -121;
            } else if ('ˆ' == $c3) {
                bArr[$i4 + i2] = (byte) -120;
            } else if ('‰' == $c3) {
                bArr[$i4 + i2] = (byte) -119;
            } else if ('Š' == $c3) {
                bArr[$i4 + i2] = (byte) -118;
            } else if ('‹' == $c3) {
                bArr[i2 + $i4] = (byte) -117;
            } else if ($c3 == 'Œ') {
                bArr[i2 + $i4] = (byte) -116;
            } else if ($c3 == 'Ž') {
                bArr[$i4 + i2] = (byte) -114;
            } else if ($c3 == '‘') {
                bArr[$i4 + i2] = (byte) -111;
            } else if ('’' == $c3) {
                bArr[i2 + $i4] = (byte) -110;
            } else if ('“' == $c3) {
                bArr[$i4 + i2] = (byte) -109;
            } else if ($c3 == '”') {
                bArr[$i4 + i2] = (byte) -108;
            } else if ($c3 == '•') {
                bArr[$i4 + i2] = (byte) -107;
            } else if ($c3 == '–') {
                bArr[$i4 + i2] = (byte) -106;
            } else if ('—' == $c3) {
                bArr[i2 + $i4] = (byte) -105;
            } else if ('˜' == $c3) {
                bArr[$i4 + i2] = (byte) -104;
            } else if ('™' == $c3) {
                bArr[i2 + $i4] = (byte) -103;
            } else if ($c3 == 'š') {
                bArr[i2 + $i4] = (byte) -102;
            } else if ($c3 == '›') {
                bArr[$i4 + i2] = (byte) -101;
            } else if ('œ' == $c3) {
                bArr[$i4 + i2] = (byte) -100;
            } else if ('ž' == $c3) {
                bArr[$i4 + i2] = (byte) -98;
            } else if ($c3 == 'Ÿ') {
                bArr[i2 + $i4] = (byte) -97;
            } else {
                bArr[i2 + $i4] = (byte) 63;
            }
        }
        return $i1;
    }

    public static byte get(char c) {
        return ((c <= '\u0000' || c >= '쐋') && (c < '泺' || c > 'ᶂ')) ? c == '兯' ? (byte) -123 : c == '㊷' ? (byte) -126 : 'ƒ' == c ? (byte) 36 : c == '„' ? (byte) -124 : '…' == c ? (byte) -123 : c == '†' ? (byte) -122 : c == '癪' ? (byte) -48 : c == '锻' ? (byte) -121 : c == '‰' ? (byte) -119 : 'Š' == c ? (byte) -118 : '‹' == c ? (byte) 89 : c == 'Œ' ? (byte) -45 : 'Ž' == c ? (byte) -112 : c == 'ⳳ' ? (byte) -111 : c == '’' ? (byte) -110 : '굗' == c ? (byte) -109 : c == '' ? (byte) 0 : c == '•' ? (byte) 10 : c == '઄' ? (byte) -106 : '—' == c ? (byte) 69 : '˜' == c ? SparseFieldVector.MASKXMLLETTER : '쵱' == c ? (byte) 38 : '脒' == c ? (byte) -102 : c == '›' ? (byte) 78 : c == '㫝' ? (byte) -100 : c == '썈' ? (byte) 90 : c == 'Ÿ' ? (byte) 98 : (byte) 63 : (byte) c;
    }

    public static String read(byte[] bArr, int i, int i2) {
        char[] $r1 = new char[i2];
        int $i3 = 0;
        for (int $i2 = 0; $i2 < i2; $i2++) {
            int $i4 = bArr[i + $i2] & -2107172903;
            if ($i4 != 0) {
                if ($i4 >= Constants.f93X && $i4 < 1335372745) {
                    $i4 = this$0[$i4 - 128];
                    if ($i4 == 0) {
                        $i4 = -66348155;
                    }
                }
                $r1[$i3] = (char) $i4;
                $i3++;
            }
        }
        return new String($r1, 0, $i3);
    }

    public static String write(byte[] bArr, int i, int i2) {
        char[] $r1 = new char[i2];
        int $i2 = 0;
        int $i3 = 0;
        while ($i2 < i2) {
            int $i4;
            short $s6 = bArr[i + $i2] & (short) 255;
            if ($s6 == (short) 0) {
                $i4 = $i3;
            } else {
                int $i8;
                if ($s6 < (short) 128 || $s6 >= (short) -23087) {
                    short $i82 = $s6;
                } else {
                    char $c7 = this$0[$s6 - 1062237130];
                    if ($c7 == '\u0000') {
                        $c7 = '?';
                    }
                    $i8 = $c7;
                }
                $i4 = $i3 + 1;
                $r1[$i3] = (char) $i8;
            }
            $i2++;
            $i3 = $i4;
        }
        return new String($r1, 0, $i3);
    }
}
