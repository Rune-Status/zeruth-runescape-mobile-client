package p000;

/* compiled from: cz */
public class Locale extends Element {
    static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    static final int EXPIRES_ORDINAL = 17;
    static HttpRequest activity;
    static int value;
    static int f177y;
    final boolean this$0;

    public Locale(boolean z) {
        try {
            this.this$0 = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cz.<init>(" + ')');
        }
    }

    static final void append(String str, byte b) {
        try {
            Message.add(30, "", str, 1719729534);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cz.aj(" + ')');
        }
    }

    static void exec(int i) {
        if (client.date) {
            try {
                Class.toString(File.this$0, false, 2133224411);
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "cz.ct(" + ')');
            }
        }
    }

    public static boolean isValidReferenceNameChar(char c, int i) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static int stackChange(int i, int i2) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    int add(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * -678832347 == client.f407x * -1304916389 && coordinate2.this$0 * -1161455169 == client.f407x * -1304916389) ? this.this$0 ? (89622 * coordinate.f35y) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * 1633588183) : equals(coordinate, coordinate2, 1842412636);
    }

    public int add(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, -1403571357);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * -1161455169 == -1566473992 * client.f407x && coordinate2.this$0 * 1979744621 == client.f407x * -1304916389) ? this.this$0 ? (1666786459 * coordinate.f35y) - (-108773822 * coordinate2.f35y) : (-676320821 * coordinate2.f35y) - (coordinate.f35y * -466580549) : equals(coordinate, coordinate2, 728258649);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2, int i) {
        try {
            if (coordinate.this$0 * -1161455169 == client.f407x * -1304916389) {
                if (coordinate2.this$0 * -1161455169 == client.f407x * -1304916389) {
                    return this.this$0 ? (coordinate.f35y * 2046794799) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * 2046794799);
                }
            }
            return equals(coordinate, coordinate2, 700789352);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cz.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((Coordinate) obj, (Coordinate) obj2, -1849795422);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cz.compare(" + ')');
        }
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, -1849596552);
    }

    int filter(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * -1498276099 == client.f407x * -1304916389 && coordinate2.this$0 * -1161455169 == client.f407x * -1304916389) ? this.this$0 ? (725526915 * coordinate.f35y) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * -1679865715) : equals(coordinate, coordinate2, 1246098068);
    }

    public int parse(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 584729270);
    }
}
