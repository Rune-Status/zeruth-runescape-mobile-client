package p000;

/* compiled from: ms */
public class StorageManager {
    static final char[] $assertionsDisabled = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    static final int DONE = 12;
    static final int MB = 1048576;
    public static final int PATH = 1;
    static int f282a;
    static final char[] log = new char[]{'[', ']', '#'};

    StorageManager() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ms.<init>(" + ')');
        }
    }

    public static final int add(Scalar scalar) {
        if (scalar == null) {
            return 12;
        }
        switch (scalar.val * -2079118595) {
            case 1:
                return 20;
            default:
                return 12;
        }
    }

    public static final boolean apply(char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        if (Logger.write(c, (byte) 53)) {
            return true;
        }
        char[] $r0 = $assertionsDisabled;
        for (char $c3 : $r0) {
            if ($c3 == c) {
                return true;
            }
        }
        $r0 = log;
        for (char $c32 : $r0) {
            if (c == $c32) {
                return true;
            }
        }
        return false;
    }

    public static final int compare(Scalar scalar) {
        if (scalar == null) {
            return 12;
        }
        switch (scalar.val * -2079118595) {
            case 1:
                return 20;
            default:
                return 12;
        }
    }

    public static final boolean delete(char c) {
        return '먥' == c || '쑈' == c || '_' == c || '鶫' == c;
    }

    public static final int divide(Scalar scalar) {
        if (scalar == null) {
            return 12;
        }
        switch (scalar.val * 1742231213) {
            case 1:
                return 20;
            default:
                return 12;
        }
    }

    public static final boolean isIdentifierHelperChar(char c) {
        return ' ' == c || ' ' == c || '_' == c || '-' == c;
    }

    public static final boolean read(char c) {
        return ' ' == c || ' ' == c || '_' == c || '-' == c;
    }

    public static final boolean write(char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        if (Logger.write(c, (byte) 123)) {
            return true;
        }
        char[] $r0 = $assertionsDisabled;
        for (char $c3 : $r0) {
            if ($c3 == c) {
                return true;
            }
        }
        $r0 = log;
        for (char $c32 : $r0) {
            if (c == $c32) {
                return true;
            }
        }
        return false;
    }
}
