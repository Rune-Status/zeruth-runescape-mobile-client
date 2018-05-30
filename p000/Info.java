package p000;

/* compiled from: ol */
public class Info {
    public static final int TRANSACTION_getInfo = 5;
    public static final Info file = new Info(1);
    static final Info name = new Info(2);
    static final Info title = new Info(0);
    public final int data;

    Info(int $i0) {
        try {
            this.data = -20557115 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ol.<init>(" + ')');
        }
    }

    public static Info[] clear() {
        return new Info[]{name, title, file};
    }

    public static void m29d(Class classR, int i) {
        ByteVector.f28c = classR;
    }

    public static Info[] getName() {
        return new Info[]{name, title, file};
    }

    public static Info[] getTitle() {
        return new Info[]{name, title, file};
    }

    public static Info[] init() {
        return new Info[]{name, title, file};
    }
}
