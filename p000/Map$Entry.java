package p000;

/* compiled from: cu */
public class Map$Entry {
    public static final int REFRESH_TIME = 5000;
    public static final int SYNC_READ_TIMEOUT = 40000;

    Map$Entry() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cu.<init>(" + ')');
        }
    }

    public static final void get(long $l0) {
        if ($l0 > 0) {
            if (0 == $l0 % 10) {
                try {
                    Data.execute($l0 - 1);
                    Data.execute(1);
                    return;
                } catch (RuntimeException $r0) {
                    throw StringBuilder.append($r0, "cu.af(" + ')');
                }
            }
            Data.execute($l0);
        }
    }
}
