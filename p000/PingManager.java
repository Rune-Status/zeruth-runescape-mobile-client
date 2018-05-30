package p000;

/* compiled from: ic */
public class PingManager {
    public static final int DIR_TYPE_CACHE_SIZE = 1792;
    public static final int ELEMENT = 768;
    public static final int FLAGS_DEFAULT_TYPE_STRING = 256;
    static final int MARK_LIMIT_BYTES = 2048;
    public static final int META_ALT_LOCKED = 512;
    public static final int STATE_SENSOR_ON_FLAG = 65536;
    static final int[] URI_MATCHER = new int[2048];
    static final int[] sTables = new int[2048];

    static {
        for (int $i0 = 0; $i0 < 2048; $i0++) {
            URI_MATCHER[$i0] = (int) (Math.sin(((double) $i0) * 0.0030679615757712823d) * 65536.0d);
            sTables[$i0] = (int) (Math.cos(((double) $i0) * 0.0030679615757712823d) * 65536.0d);
        }
    }

    PingManager() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ic.<init>(" + ')');
        }
    }

    public static synchronized Device getInstance(byte b) {
        Device $r0;
        synchronized (ic.class) {
            if (Device.instance == null) {
                try {
                    Device.instance = new Device();
                } catch (RuntimeException $r1) {
                    throw StringBuilder.append($r1, "ic.af(" + ')');
                }
            }
            $r0 = Device.instance;
        }
        return $r0;
    }
}
