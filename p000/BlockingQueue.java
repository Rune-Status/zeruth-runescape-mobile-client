package p000;

/* compiled from: ma */
public abstract class BlockingQueue {
    static final int TA_BASELINE = 24;

    BlockingQueue() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ma.<init>(" + ')');
        }
    }

    public static boolean add(int i, int i2) {
        return ((i >> 31) & 1) != 0;
    }

    public abstract void dump();

    public abstract void get(int i);

    public abstract void remove();

    public abstract void stop();
}
