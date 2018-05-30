package p000;

/* compiled from: hs */
public class LongArray {
    public static final int PHOTO_THUMBNAIL_URI = 6;
    static final int TRANSACTION_onStateEvent = 3;
    public static final int TRANSACTION_setPlaybackSpeed = 34;
    static final int UNKNOWN_INT = 10000;
    final int map;
    int size;
    final HttpRequest this$0;

    LongArray(HttpRequest httpRequest, String str) {
        try {
            this.size = 0;
            this.this$0 = httpRequest;
            this.map = httpRequest.get(1166550266) * 1079881739;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hs.<init>(" + ')');
        }
    }

    boolean add() {
        this.size = 0;
        int $i0 = 0;
        while ($i0 < this.map * 1718573987) {
            if (!this.this$0.next($i0, 889242622) || this.this$0.get($i0, 1750984977)) {
                this.size += 545014795;
            }
            $i0++;
        }
        return -1368840285 * this.size >= this.map * 1718573987;
    }

    boolean addAll() {
        this.size = 0;
        int $i0 = 0;
        while ($i0 < this.map * 1718573987) {
            if (!this.this$0.next($i0, 889242622) || this.this$0.get($i0, 1389913768)) {
                this.size += 545014795;
            }
            $i0++;
        }
        return -1368840285 * this.size >= this.map * 1718573987;
    }

    boolean equals() {
        this.size = 0;
        int $i0 = 0;
        while ($i0 < 355377698 * this.map) {
            if (!this.this$0.next($i0, 889242622) || this.this$0.get($i0, 1908700532)) {
                this.size -= 1378446403;
            }
            $i0++;
        }
        return -1368840285 * this.size >= 1718573987 * this.map;
    }

    boolean get() {
        this.size = 0;
        int $i0 = 0;
        while ($i0 < this.map * 1718573987) {
            if (!this.this$0.next($i0, 889242622) || this.this$0.get($i0, 1972598117)) {
                this.size += 545014795;
            }
            $i0++;
        }
        return -1368840285 * this.size >= this.map * 1718573987;
    }

    boolean get(byte b) {
        try {
            this.size = 0;
            for (int $i1 = 0; $i1 < this.map * 1718573987; $i1++) {
                if (this.this$0.next($i1, 889242622)) {
                    if (!this.this$0.get($i1, 1721120878)) {
                        continue;
                    }
                }
                this.size += 545014795;
            }
            return -1368840285 * this.size >= this.map * 1718573987;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hs.af(" + ')');
        }
    }
}
