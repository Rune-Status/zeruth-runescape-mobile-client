package p000;

/* compiled from: cp */
public class AbstractLoadingActivity$3$1 extends Element {
    static final int HINT_CONTEXT_CAR_HOME = 2;
    static final int Id_cbrt = 20;
    static final int Theme_switchStyle = 57;
    static final int random = 7169111;
    final boolean this$1;

    public AbstractLoadingActivity$3$1(boolean z) {
        try {
            this.this$1 = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cp.<init>(" + ')');
        }
    }

    public static void parse(Class classR, int i) {
        Parser.count = classR;
        MimeType.value = new Parser[classR.add(1, 1418373798)];
        i = 0;
        while (i < MimeType.value.length) {
            try {
                byte[] $r2 = Parser.count.get(1, i, -2141732547);
                MimeType.value[i] = new Parser();
                if ($r2 != null) {
                    MimeType.value[i].add(new Logger($r2), i, (byte) 116);
                }
                MimeType.value[i].parse(-2037890695);
                i++;
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "cp.af(" + ')');
            }
        }
    }

    public int add(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, (byte) 124);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2) {
        return 1575101184 * coordinate2.this$0 != coordinate.this$0 * 554984567 ? this.this$1 ? (1080317286 * coordinate.this$0) - (coordinate2.this$0 * -1161455169) : (coordinate2.this$0 * -1161455169) - (702193134 * coordinate.this$0) : equals(coordinate, coordinate2, 1721257902);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2, byte b) {
        try {
            return coordinate2.this$0 * -1161455169 != coordinate.this$0 * -1161455169 ? this.this$1 ? (coordinate.this$0 * -1161455169) - (coordinate2.this$0 * -1161455169) : (coordinate2.this$0 * -1161455169) - (coordinate.this$0 * -1161455169) : equals(coordinate, coordinate2, 157260329);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cp.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((Coordinate) obj, (Coordinate) obj2, (byte) 16);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cp.compare(" + ')');
        }
    }

    public int parse(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, (byte) 17);
    }

    public int unsafeCompare(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, (byte) 90);
    }
}
