package p000;

/* compiled from: jr */
public class MediaFile {
    public static final int FILE_TYPE_AVI = 29;
    public static final int FILE_TYPE_DIVX = 31;
    public static final int FILE_TYPE_GIF = 32;
    public static final int FILE_TYPE_HTML = 101;
    public static final int FILE_TYPE_M4A = 2;
    public static final int FILE_TYPE_PCM = 15;
    public static final int FILE_TYPE_WEBP = 37;
    public static final int INT_7 = 55;
    static final int META_ALT_LOCKED = 512;
    public static final int Theme_switchStyle = 57;

    MediaFile() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jr.<init>(" + ')');
        }
    }

    static void update(int i) {
        try {
            HttpConnection.length = new int[2000];
            i = 0;
            int $i1 = 240;
            while (i < 16) {
                HttpConnection.length[i] = FastMath.getValue((double) (((float) $i1) / 360.0f), 0.9998999834060669d, (double) (0.075f + ((((float) i) * 0.425f) / 16.0f)));
                i++;
                $i1 -= 12;
            }
            $i1 = 48;
            while (i < HttpConnection.length.length) {
                int $i2 = i * 2;
                int $i3 = FastMath.getValue((double) (((float) $i1) / 360.0f), 0.9998999834060669d, 0.5d);
                while (i < $i2) {
                    if (i >= HttpConnection.length.length) {
                        continue;
                        break;
                    } else {
                        HttpConnection.length[i] = $i3;
                        i++;
                    }
                }
                $i1 -= 8;
            }
        } catch (Throwable $r1) {
            throw StringBuilder.append($r1, "jr.af(" + ')');
        }
    }
}
