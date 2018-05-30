package p000;

/* compiled from: lh */
public class MimeType {
    static final int NULL = 8;
    static final int STATS = 100;
    public static ByteArrayOutputStream data;
    static Parser[] value;

    MimeType() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lh.<init>(" + ')');
        }
    }

    public static String get(CharSequence charSequence, int i) {
        try {
            return Profile.get('*', charSequence.length(), -119110955);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lh.ab(" + ')');
        }
    }

    public static final void open(StatusLine statusLine, int i) {
        Point.type = statusLine;
    }

    public static void parse(ByteArrayOutputStream byteArrayOutputStream) {
        data = byteArrayOutputStream;
    }

    public static void setSubType(ByteArrayOutputStream byteArrayOutputStream) {
        data = byteArrayOutputStream;
    }

    public static void write(ByteArrayOutputStream byteArrayOutputStream) {
        data = byteArrayOutputStream;
    }
}
