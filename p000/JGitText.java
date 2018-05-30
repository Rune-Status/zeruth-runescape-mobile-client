package p000;

/* compiled from: ha */
public class JGitText {
    public static final int Theme_alertDialogCenterButtons = 91;
    static final int WEEKS_BUFFER = 1;
    static final int be = 0;
    protected static int count = 0;
    public static String data = ")";
    static String end = "true";
    static int f166i = 0;
    static String label = "|";
    static String length = ",";
    static String name = "<br>";
    public static String size = "</col>";
    public static String this$0 = "->";
    static Long title = null;
    public static String type = " (";
    static Headers value = null;
    static final int voice_input = 19136899;

    JGitText() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ha.<init>(" + ')');
        }
    }

    public static String decompressXML(int i) {
        return "<col=" + Integer.toHexString(i) + ">";
    }

    static String get(int i) {
        return "<img=" + i + ">";
    }

    public static boolean get(char c, byte b) {
        return c >= '0' && c <= '9';
    }

    static String getPathAsString(int i) {
        return "<img=" + i + ">";
    }

    public static final void write(int i, int i2, int i3, int i4, short s) {
        int $i5 = 0;
        while ($i5 < -1093692631 * client.head) {
            try {
                if (client.fields[$i5] + client.toString[$i5] > i) {
                    if (client.fields[$i5] >= i + i3) {
                        continue;
                    } else if (client.delegate[$i5] + client.segments[$i5] <= i2) {
                        continue;
                    } else if (client.segments[$i5] < i2 + i4) {
                        client.field[$i5] = true;
                    } else {
                        continue;
                    }
                }
                $i5++;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ha.ex(" + ')');
            }
        }
    }
}
