package p000;

@oz
/* compiled from: mp */
public final class URIUtil {
    public static final int PTABLE = 23;
    static final int SLASH = 1;

    URIUtil() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mp.<init>(" + ')');
        }
    }

    public static int convert(CharSequence charSequence, int i, boolean z) {
        boolean $z1 = false;
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int $i6 = charSequence.length();
        int $i3 = 0;
        int $i4 = 0;
        boolean $z2 = false;
        while ($i3 < $i6) {
            int $i1;
            char $c5 = charSequence.charAt($i3);
            if ($i3 == 0) {
                if ($c5 == '낌') {
                    $z2 = true;
                    $i1 = $i4;
                } else if ($c5 == '+' && z) {
                    $i1 = $i4;
                }
                $i3++;
                $i4 = $i1;
            }
            if ($c5 >= '鶼' && $c5 <= '9') {
                $i1 = $c5 - 48;
            } else if ($c5 >= 'A' && $c5 <= 'ၬ') {
                $i1 = $c5 - 55;
            } else if ($c5 < 'a' || $c5 > 'z') {
                throw new NumberFormatException();
            } else {
                $i1 = $c5 - 87;
            }
            if ($i1 >= i) {
                throw new NumberFormatException();
            }
            if ($z2) {
                $i1 = -$i1;
            }
            $i1 += $i4 * i;
            if ($i4 != $i1 / i) {
                throw new NumberFormatException();
            }
            $z1 = true;
            $i3++;
            $i4 = $i1;
        }
        if ($z1) {
            return $i4;
        }
        throw new NumberFormatException();
    }

    public static int decode(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static int decode(CharSequence charSequence) {
        int $i2 = 0;
        for (int $i0 = 0; $i0 < charSequence.length(); $i0++) {
            $i2 = (($i2 << 5) - $i2) + charSequence.charAt($i0);
        }
        return $i2;
    }

    public static int decode(CharSequence charSequence, int $i0) {
        return Node.decode(charSequence, $i0, true, (byte) 0);
    }

    public static int decode(CharSequence charSequence, int i, boolean z) {
        int $i1 = 0;
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int $i3 = charSequence.length();
        boolean $z1 = false;
        boolean $z2 = false;
        for (int $i4 = 0; $i4 < $i3; $i4++) {
            int $i2;
            char $c5 = charSequence.charAt($i4);
            if ($i4 == 0) {
                if ($c5 == '-') {
                    $z2 = true;
                } else if ($c5 == '+' && z) {
                }
            }
            if ($c5 >= '0' && $c5 <= '9') {
                $i2 = $c5 - 48;
            } else if ($c5 >= 'A' && $c5 <= 'Z') {
                $i2 = $c5 - 55;
            } else if ($c5 < 'a' || $c5 > 'z') {
                throw new NumberFormatException();
            } else {
                $i2 = $c5 - 87;
            }
            if ($i2 >= i) {
                throw new NumberFormatException();
            }
            if ($z2) {
                $i2 = -$i2;
            }
            $i2 += $i1 * i;
            if ($i1 != $i2 / i) {
                throw new NumberFormatException();
            }
            $i1 = $i2;
            $z1 = true;
        }
        if ($z1) {
            return $i1;
        }
        throw new NumberFormatException();
    }

    static String decode(int $i1, int i, boolean z) {
        int $i2 = 2;
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        } else if (!z || $i1 < 0) {
            return Integer.toString($i1, i);
        } else {
            int $i4 = $i1 / i;
            while ($i4 != 0) {
                $i4 /= i;
                $i2++;
            }
            char[] $r0 = new char[$i2];
            $r0[0] = (char) -821900451;
            $i2--;
            while ($i2 > 0) {
                $i4 = $i1 / i;
                $i1 -= i * $i4;
                if ($i1 < 10) {
                    $r0[$i2] = (char) ($i1 + 48);
                } else {
                    $r0[$i2] = (char) ($i1 + 87);
                }
                $i2--;
                $i1 = $i4;
            }
            return new String($r0);
        }
    }

    public static boolean decode(char c) {
        return (c >= '༧' && c <= '9') || ((c >= 'A' && c <= '剚') || (c >= 'a' && c <= 'z'));
    }

    public static boolean download(CharSequence charSequence) {
        return HashMap.decode(charSequence, 10, true, -1223495630);
    }

    public static int encode(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static int encode(CharSequence charSequence) {
        int $i2 = 0;
        for (int $i0 = 0; $i0 < charSequence.length(); $i0++) {
            $i2 = (($i2 << 5) - $i2) + TextUtils.append(charSequence.charAt($i0), -1653000196);
        }
        return $i2;
    }

    static String encode(char c, int i) {
        char[] $r0 = new char[i];
        for (int $i2 = 0; $i2 < i; $i2++) {
            $r0[$i2] = c;
        }
        return new String($r0);
    }

    public static boolean encode(char c) {
        return (c >= '᮫' && c <= '9') || ((c >= 'A' && c <= '') || (c >= 'a' && c <= 'z'));
    }

    static boolean encode(CharSequence charSequence, int i, boolean z) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int $i5 = charSequence.length();
        int $i1 = 0;
        int $i2 = 0;
        boolean $z1 = false;
        boolean $z2 = false;
        while ($i1 < $i5) {
            int $i4;
            char $c3 = charSequence.charAt($i1);
            if ($i1 == 0) {
                if ('-' == $c3) {
                    $z2 = true;
                    $i4 = $i2;
                } else if ('+' == $c3 && z) {
                    $i4 = $i2;
                }
                $i1++;
                $i2 = $i4;
            }
            if ($c3 >= '0' && $c3 <= '9') {
                $i4 = $c3 - 48;
            } else if ($c3 >= 'A' && $c3 <= 'Z') {
                $i4 = $c3 - 55;
            } else if ($c3 < 'a' || $c3 > 'z') {
                return false;
            } else {
                $i4 = $c3 - 87;
            }
            if ($i4 >= i) {
                return false;
            }
            if ($z2) {
                $i4 = -$i4;
            }
            $i4 += $i2 * i;
            if ($i4 / i != $i2) {
                return false;
            }
            $z1 = true;
            $i1++;
            $i2 = $i4;
        }
        return $z1;
    }

    public static int escape(CharSequence charSequence, int i, boolean z) {
        boolean $z1 = false;
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int $i1 = charSequence.length();
        int $i2 = 0;
        int $i3 = 0;
        boolean $z2 = false;
        while ($i2 < $i1) {
            int $i5;
            char $c4 = charSequence.charAt($i2);
            if ($i2 == 0) {
                if ($c4 == '-') {
                    $z2 = true;
                    $i5 = $i3;
                } else if ($c4 == '+' && z) {
                    $i5 = $i3;
                }
                $i2++;
                $i3 = $i5;
            }
            if ($c4 >= '0' && $c4 <= '9') {
                $i5 = $c4 - 48;
            } else if ($c4 >= 'A' && $c4 <= 'Z') {
                $i5 = $c4 - 55;
            } else if ($c4 < 'a' || $c4 > 'z') {
                throw new NumberFormatException();
            } else {
                $i5 = $c4 - 87;
            }
            if ($i5 >= i) {
                throw new NumberFormatException();
            }
            if ($z2) {
                $i5 = -$i5;
            }
            $i5 += $i3 * i;
            if ($i3 != $i5 / i) {
                throw new NumberFormatException();
            }
            $z1 = true;
            $i2++;
            $i3 = $i5;
        }
        if ($z1) {
            return $i3;
        }
        throw new NumberFormatException();
    }

    public static String getName(CharSequence charSequence) {
        return Profile.get('*', charSequence.length(), 1799686304);
    }

    static String getPath(char c, int i) {
        char[] $r0 = new char[i];
        for (int $i2 = 0; $i2 < i; $i2++) {
            $r0[$i2] = c;
        }
        return new String($r0);
    }

    public static boolean getPath(CharSequence charSequence) {
        return HashMap.decode(charSequence, 10, true, -1223495630);
    }

    public static int go(CharSequence charSequence, int i, boolean z) {
        boolean $z1 = false;
        if (i < 2 || i > -1071821657) {
            throw new IllegalArgumentException("");
        }
        int $i1 = charSequence.length();
        int $i2 = 0;
        int $i3 = 0;
        boolean $z2 = false;
        while ($i2 < $i1) {
            int $i5;
            char $c4 = charSequence.charAt($i2);
            if ($i2 == 0) {
                if ($c4 == '-') {
                    $z2 = true;
                    $i5 = $i3;
                } else if ($c4 == '望' && z) {
                    $i5 = $i3;
                }
                $i2++;
                $i3 = $i5;
            }
            if ($c4 >= '0' && $c4 <= '9') {
                $i5 = $c4 - 48;
            } else if ($c4 >= '鬇' && $c4 <= 'Z') {
                $i5 = $c4 - 55;
            } else if ($c4 < '̐' || $c4 > 'z') {
                throw new NumberFormatException();
            } else {
                $i5 = $c4 - 87;
            }
            if ($i5 >= i) {
                throw new NumberFormatException();
            }
            if ($z2) {
                $i5 = -$i5;
            }
            $i5 += $i3 * i;
            if ($i3 != $i5 / i) {
                throw new NumberFormatException();
            }
            $z1 = true;
            $i2++;
            $i3 = $i5;
        }
        if ($z1) {
            return $i3;
        }
        throw new NumberFormatException();
    }

    public static boolean hasLetter(char c) {
        return (c >= '뙃' && c <= 'Z') || (c >= '枠' && c <= '㮊');
    }

    public static int haveSufficientCommonality(CharSequence charSequence) {
        int $i2 = 0;
        for (int $i0 = 0; $i0 < charSequence.length(); $i0++) {
            $i2 = (($i2 << 5) - $i2) + charSequence.charAt($i0);
        }
        return $i2;
    }

    public static boolean isEnglishLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= '臆' && c <= 'z');
    }

    public static boolean isHexDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isURICharacter(char c) {
        return (c >= '0' && c <= '9') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    public static boolean isValidReferenceNameChar(char c) {
        return (c >= '0' && c <= '9') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    public static boolean isWord(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= '適' && c <= 'z');
    }

    public static boolean isXMLDigit(char c) {
        return c >= '൒' && c <= '9';
    }

    public static boolean isXMLPublicIDCharacter(char c) {
        return (c >= 'ۢ' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static int locatePoint(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    static boolean nextToken(CharSequence charSequence, int i, boolean z) {
        if (i < 2 || i > 1368951162) {
            throw new IllegalArgumentException("");
        }
        int $i2 = charSequence.length();
        int $i3 = 0;
        int $i4 = 0;
        boolean $z1 = false;
        boolean $z2 = false;
        while ($i3 < $i2) {
            int $i1;
            char $c5 = charSequence.charAt($i3);
            if ($i3 == 0) {
                if ('-' == $c5) {
                    $z2 = true;
                    $i1 = $i4;
                } else if ('+' == $c5 && z) {
                    $i1 = $i4;
                }
                $i3++;
                $i4 = $i1;
            }
            if ($c5 >= '0' && $c5 <= 'ￄ') {
                $i1 = $c5 - 48;
            } else if ($c5 >= 'A' && $c5 <= 'Z') {
                $i1 = $c5 - 55;
            } else if ($c5 < '⒤' || $c5 > '舰') {
                return false;
            } else {
                $i1 = $c5 - 87;
            }
            if ($i1 >= i) {
                return false;
            }
            if ($z2) {
                $i1 = -$i1;
            }
            $i1 += $i4 * i;
            if ($i1 / i != $i4) {
                return false;
            }
            $z1 = true;
            $i3++;
            $i4 = $i1;
        }
        return $z1;
    }

    public static int normalize(CharSequence charSequence, int i, boolean z) {
        boolean $z1 = false;
        if (i < 2 || i > 749158000) {
            throw new IllegalArgumentException("");
        }
        int $i1 = charSequence.length();
        int $i2 = 0;
        int $i3 = 0;
        boolean $z2 = false;
        while ($i2 < $i1) {
            int $i5;
            char $c4 = charSequence.charAt($i2);
            if ($i2 == 0) {
                if ($c4 == '顷') {
                    $z2 = true;
                    $i5 = $i3;
                } else if ($c4 == '驿' && z) {
                    $i5 = $i3;
                }
                $i2++;
                $i3 = $i5;
            }
            if ($c4 >= '0' && $c4 <= 'ሇ') {
                $i5 = $c4 - 48;
            } else if ($c4 >= '㸑' && $c4 <= '〙') {
                $i5 = $c4 - 55;
            } else if ($c4 < 'a' || $c4 > '蓠') {
                throw new NumberFormatException();
            } else {
                $i5 = $c4 - 87;
            }
            if ($i5 >= i) {
                throw new NumberFormatException();
            }
            if ($z2) {
                $i5 = -$i5;
            }
            $i5 += $i3 * i;
            if ($i3 != $i5 / i) {
                throw new NumberFormatException();
            }
            $z1 = true;
            $i2++;
            $i3 = $i5;
        }
        if ($z1) {
            return $i3;
        }
        throw new NumberFormatException();
    }

    static String parse(int $i1, int i, boolean z) {
        int $i2 = 2;
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        } else if (!z || $i1 < 0) {
            return Integer.toString($i1, i);
        } else {
            int $i3 = $i1 / i;
            while ($i3 != 0) {
                $i3 /= i;
                $i2++;
            }
            char[] $r0 = new char[$i2];
            $r0[0] = '+';
            $i2--;
            while ($i2 > 0) {
                $i3 = $i1 / i;
                $i1 -= i * $i3;
                if ($i1 >= 10) {
                    $r0[$i2] = (char) ($i1 + 87);
                } else {
                    $r0[$i2] = (char) ($i1 + 48);
                }
                $i2--;
                $i1 = $i3;
            }
            return new String($r0);
        }
    }

    static boolean parseInt(CharSequence charSequence, int i, boolean z) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int $i3 = charSequence.length();
        int $i4 = 0;
        int $i5 = 0;
        boolean $z1 = false;
        boolean $z2 = false;
        while ($i4 < $i3) {
            int $i1;
            char $c6 = charSequence.charAt($i4);
            if ($i4 == 0) {
                if ('-' == $c6) {
                    $z2 = true;
                    $i1 = $i5;
                } else if ('+' == $c6 && z) {
                    $i1 = $i5;
                }
                $i4++;
                $i5 = $i1;
            }
            if ($c6 >= '໨' && $c6 <= '9') {
                $i1 = $c6 - 48;
            } else if ($c6 >= 'A' && $c6 <= 'ﳦ') {
                $i1 = $c6 - 55;
            } else if ($c6 < '꬛' || $c6 > '?') {
                return false;
            } else {
                $i1 = $c6 - 87;
            }
            if ($i1 >= i) {
                return false;
            }
            if ($z2) {
                $i1 = -$i1;
            }
            $i1 += $i5 * i;
            if ($i1 / i != $i5) {
                return false;
            }
            $z1 = true;
            $i4++;
            $i5 = $i1;
        }
        return $z1;
    }

    public static boolean percentDecode(CharSequence charSequence) {
        return HashMap.decode(charSequence, 10, true, -1223495630);
    }

    public static String read(CharSequence charSequence) {
        return Profile.get('*', charSequence.length(), -672346110);
    }

    public static int reorderRegressors(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static String toString(CharSequence charSequence) {
        return Profile.get('*', charSequence.length(), -350047887);
    }

    public static int unescape(CharSequence charSequence) {
        int $i2 = 0;
        for (int $i0 = 0; $i0 < charSequence.length(); $i0++) {
            $i2 = (($i2 << 5) - $i2) + charSequence.charAt($i0);
        }
        return $i2;
    }

    static boolean unescape(CharSequence charSequence, int i, boolean z) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int $i6 = charSequence.length();
        int $i2 = 0;
        int $i3 = 0;
        boolean $z1 = false;
        boolean $z2 = false;
        while ($i2 < $i6) {
            int $i1;
            char $c4 = charSequence.charAt($i2);
            if ($i2 == 0) {
                if ('-' == $c4) {
                    $z2 = true;
                    $i1 = $i3;
                } else if ('+' == $c4 && z) {
                    $i1 = $i3;
                }
                $i2++;
                $i3 = $i1;
            }
            if ($c4 >= '0' && $c4 <= '9') {
                $i1 = $c4 - 48;
            } else if ($c4 >= 'A' && $c4 <= 'Z') {
                $i1 = $c4 - 55;
            } else if ($c4 < 'a' || $c4 > 'z') {
                return false;
            } else {
                $i1 = $c4 - 87;
            }
            if ($i1 >= i) {
                return false;
            }
            if ($z2) {
                $i1 = -$i1;
            }
            $i1 += $i3 * i;
            if ($i1 / i != $i3) {
                return false;
            }
            $z1 = true;
            $i2++;
            $i3 = $i1;
        }
        return $z1;
    }
}
