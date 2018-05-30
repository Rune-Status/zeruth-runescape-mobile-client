package p000;

/* compiled from: jx */
public class Binding implements Converter {
    static final int LIBRARY = 2340;
    static final int TAG_GPS_DEST_DISTANCE_REF = 25;
    public static final Binding buffer = new Binding(0, 1);
    public static final Binding f17c = new Binding(4, 2);
    public static final Binding cache = new Binding(2, 6);
    public static final Binding context = new Binding(3, 3);
    public static final Binding data = new Binding(5, 4);
    public static final Binding id = new Binding(1, 7);
    public static final Binding index = new Binding(7, 0);
    public static final Binding settings = new Binding(6, 5);
    public final int blocks;
    final int value;

    Binding(int $i0, int i) {
        try {
            this.blocks = 739122735 * $i0;
            this.value = 775667691 * i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "jx.<init>(" + ')');
        }
    }

    public int get() {
        return this.value * 1229714456;
    }

    public int get(int i) {
        try {
            return this.value * -233672509;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "jx.af(" + ')');
        }
    }

    public int read() {
        return this.value * -1394979852;
    }

    public int write() {
        return this.value * -233672509;
    }
}
