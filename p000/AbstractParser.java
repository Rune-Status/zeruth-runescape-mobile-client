package p000;

import java.io.File;

/* compiled from: jc */
public class AbstractParser {
    static final int MENU_AGENDA = 2;
    public static final int TAG_GPS_DEST_DISTANCE_REF = 25;
    public static File context;
    public static int[] name = new int[99];
    public static final boolean[] parser = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    static short[] value;
    static int view;

    static {
        int $i2 = 0;
        for (int $i1 = 0; $i1 < 99; $i1++) {
            int $i0 = $i1 + 1;
            $i2 += (int) ((Math.pow(2.0d, ((double) $i0) / 7.0d) * 300.0d) + ((double) $i0));
            name[$i1] = $i2 / 4;
        }
    }

    AbstractParser() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jc.<init>(" + ')');
        }
    }
}
