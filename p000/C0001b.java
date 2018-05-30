package p000;

/* compiled from: dk */
public class C0001b {
    public static final int CODE_PLAYLISTMEMBER = 11;
    public static final int N_100 = 100;
    public static final int STATE_PAUSED_ROAMING = 12;
    static final int Theme_textAppearanceSearchResultTitle = 58;
    static int f375a = 0;
    public static final int f376e = 5;
    public static final int f377g = 9;
    public static final int f378i = 6;
    public static final int f379k = 1;

    C0001b() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dk.<init>(" + ')');
        }
    }

    public static boolean close(Class classR, Class classR2, Class classR3, Window window, int i) {
        MultiInputStream.data = classR;
        MultiInputStream.buffer = classR2;
        MultiInputStream.in = classR3;
        MultiInputStream.this$0 = window;
        return true;
    }

    public static final void run(int i) {
        Main.data = false;
        Main.size = 0;
    }

    public static StringBuilder toString(Class classR, Class classR2, int i, boolean z, byte b) {
        boolean $z1 = true;
        int[] $r2 = classR.getKey(i, -94148844);
        int $i2 = 0;
        while ($i2 < $r2.length) {
            try {
                byte[] $r3 = classR.add(i, $r2[$i2], 1820509216);
                if ($r3 == null) {
                    $z1 = false;
                } else {
                    int $i3 = ($r3[1] & (short) 255) | (($r3[0] & (short) 255) << 8);
                    if ((z ? classR2.add(0, $i3, -496997082) : classR2.add($i3, 0, 1714449212)) == null) {
                        $z1 = false;
                    }
                }
                $i2++;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "dk.af(" + ')');
            }
        }
        if (!$z1) {
            return null;
        }
        try {
            return new StringBuilder(classR, classR2, i, z);
        } catch (Exception e) {
            return null;
        }
    }
}
