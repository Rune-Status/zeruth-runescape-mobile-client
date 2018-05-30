package p000;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: ie */
public class Thread {
    public static final int Theme_radioButtonStyle = 105;
    public static Calendar f316c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    public static final String[][] data;
    public static final String[] id = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    static {
        $r0 = new String[2][];
        $r0[0] = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        $r0[1] = new String[]{"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"};
        data = $r0;
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
    }

    Thread() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ie.<init>(" + ')');
        }
    }

    public static Vector add(int i, byte b) {
        try {
            Vector $r2 = (Vector) Vector.f363g.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = Vector.f361c.get(9, i, -1248680877);
            $r2 = new Vector();
            $r2.f370y = 1213021879 * i;
            if ($r4 != null) {
                $r2.get(new Logger($r4), 1188651807);
            }
            $r2.add((byte) -118);
            Vector.f363g.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "ie.ad(" + ')');
        }
    }
}
