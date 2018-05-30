package p000;

/* compiled from: ja */
public class Resolver {
    public static final int ALIGNMENT = 16;
    public static final int FORMAT_ISO_8859_7 = 8;
    static final int SHORT_ID = 8;

    Resolver() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ja.<init>(" + ')');
        }
    }

    public static int next(int i, int i2) {
        return (i << 8) + i2;
    }
}
