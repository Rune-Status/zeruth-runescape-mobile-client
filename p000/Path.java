package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: je */
public class Path {
    public static final int ATTENDEES_INDEX_RELATIONSHIP = 3;
    static final int CALENDARS_INDEX_CALENDAR_COLOR = 2;
    public static final int HINT_CONTEXT_CAR_HOME = 2;
    public static final int ROOT = 1;
    public static final int id = 0;
    static PriorityQueue size;
    protected final AppLog content;
    final IllegalArgumentException data;
    final List this$0;
    int value;

    protected Path(IllegalArgumentException illegalArgumentException) {
        try {
            this.content = new AppLog();
            this.this$0 = new ArrayList();
            this.data = illegalArgumentException;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "je.<init>(" + ')');
        }
    }

    public static boolean encode(int i, int i2) {
        return ((i >> 20) & 1) != 0;
    }

    public int add() {
        synchronized (this.this$0) {
            int $i0 = 0;
            while (true) {
                if ($i0 >= this.this$0.size()) {
                    return -1;
                } else if (((TextView) this.this$0.get($i0)).get(547370778)) {
                    return $i0;
                } else {
                    $i0++;
                }
            }
        }
    }

    protected void add(byte b) {
    }

    public void add(int i) {
        try {
            this.data.add(new TextUtils(this), 597978178);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "je.ag(" + ')');
        }
    }

    public void add(int i, byte b) {
        try {
            add(i, 0, -1701014009);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "je.ac(" + ')');
        }
    }

    protected void add(int i, int i2) {
        try {
            this.value = 644636725 * i;
            this.data.add(new HKDFBytesGenerator(this, i), 789528477);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "je.aw(" + ')');
        }
    }

    void add(int i, int i2, int i3) {
        try {
            this.data.add(new ScrollingTextView(this, i, i2), 1668576783);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "je.al(" + ')');
        }
    }

    public void add(Preference preference) {
        this.content.add(preference, (byte) 26);
    }

    public void add(Preference preference, byte b) {
        try {
            this.content.add(preference, (byte) 51);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "je.ah(" + ')');
        }
    }

    protected void add(TextView textView) {
        synchronized (this.this$0) {
            this.this$0.add(textView);
        }
    }

    public void add(String str, byte b) {
        try {
            add(str, 0, 422943044);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "je.au(" + ')');
        }
    }

    public void add(String str, int i) {
        this.data.add(new Args(this, str, i), 1397950395);
    }

    public void add(String str, int i, int i2) {
        try {
            this.data.add(new Args(this, str, i), 936485020);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "je.av(" + ')');
        }
    }

    public void append() {
        toString(0, -1029348024);
    }

    public void append(byte b) {
        try {
            toString(0, -2048245801);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "je.ak(" + ')');
        }
    }

    public void append(int i) {
        add(i, 0, -2097869104);
    }

    void append(int i, int i2) {
        this.data.add(new ScrollingTextView(this, i, i2), 589508972);
    }

    protected void append(TextView textView, int i) {
        try {
            synchronized (this.this$0) {
                this.this$0.add(textView);
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "je.az(" + ')');
        }
    }

    public void append(String str) {
        add(str, 0, 63775588);
    }

    public int apply() {
        return this.value * -561253859;
    }

    public void apply(Preference preference) {
        this.content.add(preference, (byte) 4);
    }

    public void check() {
        toString(0, 148305379);
    }

    public void check(int i) {
        add(i, 0, -1429969628);
    }

    public void check(String str) {
        add(str, 0, 547809893);
    }

    public int clear() {
        synchronized (this.this$0) {
            int $i0 = 0;
            while (true) {
                if ($i0 >= this.this$0.size()) {
                    return -1;
                } else if (((TextView) this.this$0.get($i0)).get(-280250444)) {
                    return $i0;
                } else {
                    $i0++;
                }
            }
        }
    }

    public int clear(byte b) {
        try {
            return this.value * -561253859;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "je.ai(" + ')');
        }
    }

    protected void concatenate(int i) {
        this.value = 1333030504 * i;
        this.data.add(new HKDFBytesGenerator(this, i), 1890390936);
    }

    public void createPath(String str) {
        add(str, 0, -439061433);
    }

    protected void curveTo() {
    }

    public void encode() {
        this.data.add(new SearchFragment$2(this), -543329965);
    }

    public void encode(byte b) {
        try {
            this.data.add(new SearchFragment$2(this), 2128211818);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "je.ap(" + ')');
        }
    }

    protected void extract() {
    }

    protected void extract(byte b) {
    }

    protected void extract(int i) {
    }

    void extract(int i, int i2) {
        this.data.add(new ScrollingTextView(this, i, i2), 1140649764);
    }

    public void extract(Preference preference) {
        this.content.add(preference, (byte) 112);
    }

    public int fromString() {
        return this.value * -561253859;
    }

    public void fromString(String str) {
        add(str, 0, -1383824350);
    }

    public int get(short s) {
        try {
            synchronized (this.this$0) {
                int $i1 = 0;
                while (true) {
                    if ($i1 >= this.this$0.size()) {
                        return -1;
                    } else if (((TextView) this.this$0.get($i1)).get(-795046029)) {
                        return $i1;
                    } else {
                        $i1++;
                    }
                }
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "je.ax(" + ')');
        }
    }

    protected void getChild() {
    }

    public int getDuration() {
        synchronized (this.this$0) {
            int $i0 = 0;
            while (true) {
                if ($i0 >= this.this$0.size()) {
                    return -1;
                } else if (((TextView) this.this$0.get($i0)).get(276346041)) {
                    return $i0;
                } else {
                    $i0++;
                }
            }
        }
    }

    public void iterator() {
        this.data.add(new SearchFragment$2(this), -627410285);
    }

    protected void lineTo() {
    }

    protected void list() {
    }

    protected void list(TextView textView) {
        synchronized (this.this$0) {
            this.this$0.add(textView);
        }
    }

    public void moveTo() {
        toString(0, -1000016408);
    }

    public void moveTo(int i) {
        add(i, 0, -1488474802);
    }

    public void onLoadFinished() {
        this.data.add(new TextUtils(this), -231659280);
    }

    public void onPostExecute() {
        this.data.add(new TextUtils(this), 1027432524);
    }

    public void rectangle(int i) {
        add(i, 0, -1414272122);
    }

    public void reset() {
        this.data.add(new TextUtils(this), 1546204159);
    }

    public void result() {
        this.data.add(new TextUtils(this), -167270216);
    }

    public void set(int i) {
        this.data.add(new Update(this, i), 1574662718);
    }

    public void setObject() {
        this.data.add(new SearchFragment$2(this), 1297632173);
    }

    public int size() {
        return this.value * -561253859;
    }

    public void split() {
        this.data.add(new SearchFragment$2(this), 718069336);
    }

    protected void split(int i) {
        this.value = 644636725 * i;
        this.data.add(new HKDFBytesGenerator(this, i), 1888301801);
    }

    void split(int i, int i2) {
        this.data.add(new ScrollingTextView(this, i, i2), 167543189);
    }

    public void split(String str, int i) {
        this.data.add(new Args(this, str, i), 1432250675);
    }

    protected void toString(byte b) {
    }

    public void toString(int i) {
        this.data.add(new Update(this, i), -582368740);
    }

    public void toString(int i, int i2) {
        try {
            this.data.add(new Update(this, i), 442916150);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "je.ao(" + ')');
        }
    }
}
