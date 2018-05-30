package p000;

/* compiled from: ek */
public class ByteString {
    static final int EMPTY = 2;
    static final int Id_cbrt = 20;
    static boolean[] count = null;
    public static final int hashCode = 1012;
    String data;
    int index;
    int offset;
    Msg value;

    ByteString(String str, int $i0, int i, Msg msg) {
        try {
            this.data = str;
            this.offset = 1133263035 * $i0;
            this.index = 168207837 * i;
            this.value = msg;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ek.<init>(" + ')');
        }
    }

    static ByteBuffer read(int i) {
        if (ByteBuffer.head * 821077127 >= ByteBuffer.size * 443593871) {
            return null;
        }
        ByteBuffer[] $r0 = Short.value;
        i = ByteBuffer.head - 2059476681;
        ByteBuffer.head = i;
        try {
            return $r0[(i * 821077127) - 1];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ek.aj(" + ')');
        }
    }
}
