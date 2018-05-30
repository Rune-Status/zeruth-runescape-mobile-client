package p000;

/* compiled from: mb */
public class Notification {
    public static final int PROTOCOL_VERSION = 2;
    static final int QUIET_HOURS_DEFAULT_END_MINUTE = 0;
    public static final int mon = 1;
    public volatile Object data;
    Object id;
    int name;
    public volatile int size;
    public int url;
    Notification value;

    Notification() {
        try {
            this.size = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mb.<init>(" + ')');
        }
    }
}
