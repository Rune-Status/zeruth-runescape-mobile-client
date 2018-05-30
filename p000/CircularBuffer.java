package p000;

/* compiled from: ju */
public class CircularBuffer implements Converter {
    public static final int SATURDAY = 39;
    static final int SUB = 26;
    public static final int TAG_GPS_DEST_DISTANCE_REF = 25;
    static final int TRANSACTION_enableDataConnectivity = 27;
    public static final int Theme_colorControlActivated = 86;
    static int f43a;
    public static final CircularBuffer buffer = new CircularBuffer(3, 2, false, false, true);
    public static final CircularBuffer cache = new CircularBuffer(0, -1, true, false, true);
    public static final CircularBuffer context = new CircularBuffer(2, 1, true, true, false);
    public static final CircularBuffer count = new CircularBuffer(1, 0, true, true, true);
    public static final CircularBuffer f44s = new CircularBuffer(4, 3, false, false, true);
    public static final CircularBuffer this$0 = new CircularBuffer(5, 10, false, false, true);
    public final boolean address;
    final int available;
    public final boolean data;
    public final int size;

    CircularBuffer(int $i0, int i, boolean z, boolean z2, boolean z3) {
        try {
            this.available = -708751767 * $i0;
            this.size = 1650556241 * i;
            this.data = z2;
            this.address = z3;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ju.<init>(" + ')');
        }
    }

    public static void parse(Class classR, Class classR2, boolean z, int i) {
        Transaction.current = classR;
        Transaction.data = classR2;
        Transaction.header = z;
    }

    public int get() {
        return this.available * 1956717017;
    }

    public int get(int i) {
        try {
            return this.available * 1956717017;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ju.af(" + ')');
        }
    }

    public int read() {
        return this.available * 1956717017;
    }

    public int write() {
        return this.available * -2037673360;
    }
}
