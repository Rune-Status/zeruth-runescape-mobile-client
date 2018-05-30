package p000;

/* compiled from: ji */
public class Action implements Converter {
    public static final int AnySoftKeyboardTheme_suggestionWordXGap = 38;
    static final Action DISPLAY = new Action(13, 2);
    static final Action EMAIL = new Action(14, 2);
    static final Action Library = new Action(17, 2);
    static final Action Nothing = new Action(16, 2);
    static final Action PROCEDURE = new Action(15, 2);
    static final Action PlayPause = new Action(18, 2);
    static final Action action = new Action(7, 1);
    static final Action cancel = new Action(8, 1);
    static final Action complete = new Action(19, 2);
    public static final Action data = new Action(9, 2);
    static final Action execute = new Action(20, 2);
    static final Action icon = new Action(4, 1);
    static final Action id = new Action(11, 2);
    static final Action instance = new Action(21, 2);
    public static final Action length = new Action(0, 0);
    static final Action log = new Action(10, 2);
    static final Action next = new Action(1, 0);
    static final Action prev = new Action(12, 2);
    static final Action f5s = new Action(22, 3);
    public static final Action size = new Action(2, 0);
    static final Action status = new Action(6, 1);
    static final Action title = new Action(5, 1);
    public static final Action value = new Action(3, 0);
    public final int this$0;

    Action(int $i0, int i) {
        try {
            this.this$0 = 596344861 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ji.<init>(" + ')');
        }
    }

    public static boolean complete(int i) {
        return i == f5s.this$0 * -2024373551;
    }

    public static boolean execute(int i) {
        return i == f5s.this$0 * -1010613707;
    }

    public static boolean getValue(int i) {
        return (i >= length.this$0 * -1010613707 && i <= value.this$0 * 738506886) || i == data.this$0 * -1010613707;
    }

    public static boolean isVisible(int i) {
        return i == f5s.this$0 * -1010613707;
    }

    public static boolean setType(int i) {
        return (i >= length.this$0 * -1010613707 && i <= value.this$0 * -596994586) || i == -1683098234 * data.this$0;
    }

    public static boolean setValue(int i) {
        return (i >= length.this$0 * -1010613707 && i <= value.this$0 * -1010613707) || i == data.this$0 * -1010613707;
    }

    public static boolean update(int i) {
        return i == f5s.this$0 * 1170431563;
    }

    public static boolean validate(int i) {
        return i >= 32318444 * log.this$0 && i <= -1517938935 * id.this$0;
    }

    public int get() {
        return this.this$0 * -1010613707;
    }

    public int get(int i) {
        try {
            return this.this$0 * -1010613707;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ji.af(" + ')');
        }
    }

    public int read() {
        return this.this$0 * -1010613707;
    }

    public int write() {
        return this.this$0 * -1010613707;
    }
}
