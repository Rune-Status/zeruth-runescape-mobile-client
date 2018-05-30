package p000;

/* compiled from: ir */
public class Profile {
    static final int CURRENT = -7597807;
    static final int META_SAVEDC = 30;
    protected static String name;
    public static List path;

    Profile() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ir.<init>(" + ')');
        }
    }

    public static int add(char $c0, int i) {
        return (Character.isUpperCase($c0) || Character.isTitleCase($c0)) ? (Character.toLowerCase($c0) << 4) + 1 : $c0 << 4;
    }

    static String get(char c, int i, int i2) {
        try {
            char[] $r0 = new char[i];
            for (i2 = 0; i2 < i; i2++) {
                $r0[i2] = c;
            }
            return new String($r0);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ir.at(" + ')');
        }
    }

    public static char getCorrespondingSymbol(char c, int i) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if ('ý' == c || c == 'ÿ') {
                return 'y';
            }
        }
        return c == 'Œ' ? 'O' : 'œ' == c ? 'o' : 'Ÿ' == c ? 'Y' : c;
    }

    public static char getIndex(char c, int i) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if ('ý' == c || c == 'ÿ') {
                return 'y';
            }
        }
        return c == 'Œ' ? 'O' : 'œ' == c ? 'o' : 'Ÿ' == c ? 'Y' : c;
    }

    public static char passesSmallPrimeTest(char c, int i) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if ('ý' == c || c == 'ÿ') {
                return 'y';
            }
        }
        return c == 'Œ' ? 'O' : 'œ' == c ? 'o' : 'Ÿ' == c ? 'Y' : c;
    }

    public static int read(char $c0, int i) {
        return (Character.isUpperCase($c0) || Character.isTitleCase($c0)) ? (Character.toLowerCase($c0) << 4) + 1 : $c0 << 4;
    }
}
