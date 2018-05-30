package p000;

/* compiled from: jd */
public class DTrace {
    public static final int HINT_CONTEXT_CAR_HOME = 2;
    public static final int META_ALT_LOCKED = 512;
    public static final int OTHER = 99;
    public static final int OUTPUT_MARKING = 27;
    public static final int QUIET_HOURS_DEFAULT_END_MINUTE = 0;
    public static final int SDLK_F = 9;
    public static final int WEEKS_BUFFER = 1;
    public static final int _breakEventCount = 3;
    static Long[] f110i;

    DTrace() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jd.<init>(" + ')');
        }
    }

    public static System add(int i, int i2, byte b) {
        try {
            System $r0 = ArrayList.get(i, 1660450167);
            if (i2 == -1) {
                return $r0;
            }
            if ($r0 != null) {
                if ($r0.key != null) {
                    if (i2 < $r0.key.length) {
                        return $r0.key[i2];
                    }
                }
            }
            return null;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jd.an(" + ')');
        }
    }

    public static void update(Object obj, String str, byte b) {
        DatabaseUtil.data = str;
    }
}
