package p000;

/* compiled from: mi */
public class IntArray {
    public static final int INIT_CAPACITY = 8;
    static int content = 0;
    public static final int mSize = 4;
    public static final IntArray map = new IntArray(0);
    public static final IntArray size = new IntArray(1);
    public final int items;

    IntArray(int $i0) {
        try {
            this.items = -1360698397 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mi.<init>(" + ')');
        }
    }

    public static void add(Class classR, int i) {
        Model.name = classR;
    }
}
