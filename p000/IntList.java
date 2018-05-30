package p000;

/* compiled from: bu */
public final class IntList {
    public static final int ALIGNMENT = 16;
    int bytes;
    int count;
    ArrayMap data;
    ArrayMap header;
    int name;
    ArrayMap next;
    long size;
    int value;

    IntList() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bu.<init>(" + ')');
        }
    }
}
