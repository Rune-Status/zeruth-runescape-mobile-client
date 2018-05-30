package p000;

import java.util.HashMap;

/* compiled from: iy */
public class Block {
    static final int INFO_LEN_EXTENDED = 64;
    static final int RESPONSE_STATUS_OK = 128;

    static {
        HashMap $r0 = new HashMap();
    }

    Block() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "iy.<init>(" + ')');
        }
    }

    public static Converter add(Converter[] converterArr, int i) {
        for (Converter $r1 : converterArr) {
            if (i == $r1.get(1092885148)) {
                return $r1;
            }
        }
        return null;
    }

    public static Converter toString(Converter[] converterArr, int i) {
        for (Converter $r1 : converterArr) {
            if (i == $r1.get(1331572792)) {
                return $r1;
            }
        }
        return null;
    }

    static String toString(Date date, int i, String $r1, byte b) {
        if (date == null) {
            return $r1;
        }
        try {
            Shell $r3 = (Shell) date.get((long) i);
            return $r3 != null ? (String) $r3.activity : $r1;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "iy.an(" + ')');
        }
    }
}
