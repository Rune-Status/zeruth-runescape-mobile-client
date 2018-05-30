package p000;

/* compiled from: gg */
public class Reader implements Converter {
    public static final int META_ALT_LOCKED = 512;
    public static final int SherlockTheme_windowMinWidthMinor = 49;
    public static final Reader in = new Reader(4, 4);
    public static final Reader lock = new Reader(0, 0);
    public static final Reader log = new Reader(2, 2);
    static final int f271m = 45;
    public static final Reader mHandler = new Reader(3, 3);
    public static final Reader queue = new Reader(1, 1);
    public final int name;
    final int position;

    Reader(int $i0, int i) {
        try {
            this.name = -56300337 * $i0;
            this.position = -1001580815 * i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gg.<init>(" + ')');
        }
    }

    public static String get(int i, short s) {
        try {
            return "<col=" + Integer.toHexString(i) + ">";
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gg.ad(" + ')');
        }
    }

    public int get() {
        return this.position * -1654842863;
    }

    public int get(int i) {
        try {
            return this.position * -1654842863;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gg.af(" + ')');
        }
    }

    public int read() {
        return this.position * -1654842863;
    }

    public int write() {
        return this.position * -1654842863;
    }
}
