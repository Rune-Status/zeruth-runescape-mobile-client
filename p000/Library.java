package p000;

/* compiled from: ly */
public class Library implements Comparable {
    static final int TIMEOUT = 2000;
    public static final int Theme_listPreferredItemPaddingRight = 66;
    int f176h;

    Library(int $i0, String str) {
        try {
            this.f176h = -2114823439 * $i0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ly.<init>(" + ')');
        }
    }

    public int compare(Object obj) {
        return compareTo((Library) obj, -597465541);
    }

    int compareTo(Library library) {
        return (this.f176h * -871672303) - (library.f176h * -871672303);
    }

    int compareTo(Library library, int i) {
        try {
            return (this.f176h * -871672303) - (library.f176h * -871672303);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ly.af(" + ')');
        }
    }

    public int compareTo(Object obj) {
        try {
            return compareTo((Library) obj, 450374253);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ly.compareTo(" + ')');
        }
    }

    public int find(Object obj) {
        return compareTo((Library) obj, 12441397);
    }
}
