package p000;

/* compiled from: ld */
public final class Game implements Playlist {
    int f128y;

    Game() {
        try {
            this.f128y = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ld.<init>(" + ')');
        }
    }

    public synchronized int calculate() {
        int $i0;
        $i0 = 1555218057 * this.f128y;
        this.f128y = 0;
        return $i0;
    }

    public synchronized int start() {
        int $i0;
        $i0 = 2132450441 * this.f128y;
        this.f128y = 0;
        return $i0;
    }

    public synchronized int start(int i) {
        try {
            i = 1555218057 * this.f128y;
            this.f128y = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ld.af(" + ')');
        }
        return i;
    }
}
