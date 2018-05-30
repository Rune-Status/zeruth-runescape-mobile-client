package p000;

/* compiled from: bz */
public class SoapEnvelope {
    static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    static final int EXPIRES_ORDINAL = 17;
    static final int NOCODE = 1005;
    static final int STATE_TEXT = 5;
    static final int TRANSACTION_getInfo = 5;
    static int[] length;

    SoapEnvelope() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bz.<init>(" + ')');
        }
    }

    public static boolean canUnescapeVersion4(int i) {
        return ((i >> 21) & 1) != 0;
    }

    public static int parse(int i) {
        return (i >> 17) & 7;
    }

    public static void parse(ByteArrayOutputStream byteArrayOutputStream, int i) {
        MimeType.data = byteArrayOutputStream;
    }

    public static boolean parseHeader(int i) {
        return ((i >> 20) & 1) != 0;
    }

    public static boolean write(int i) {
        return ((i >> 31) & 1) != 0;
    }

    public static boolean writeHeader(int i) {
        return ((i >> 20) & 1) != 0;
    }
}
