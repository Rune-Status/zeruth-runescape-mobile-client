package p000;

import java.io.IOException;

/* compiled from: cf */
public class CharacterReference extends Element {
    final boolean f39x;

    public CharacterReference(boolean z) {
        try {
            this.f39x = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cf.<init>(" + ')');
        }
    }

    static final void init(boolean z, int i) {
        Boolean $r0 = client.this$0;
        try {
            $r0.value -= 1295817409;
            if (client.this$0.value * 1375537855 >= 50 || z) {
                client.this$0.value = 0;
                if (!client.enabled) {
                    if (client.this$0.get(550627750) != null) {
                        client.this$0.add(Logger.add(R$string.hash, client.this$0.key, (byte) 24), (short) 255);
                        try {
                            client.this$0.put(1985846616);
                        } catch (IOException e) {
                            client.enabled = true;
                        }
                    }
                }
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "cf.dx(" + ')');
        }
    }

    int add(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * -1161455169 == 0 || coordinate2.this$0 * -1161455169 == 0) ? equals(coordinate, coordinate2, 730945767) : this.f39x ? (coordinate.f35y * 2046794799) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * 2046794799);
    }

    public int add(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 433843991);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * -1161455169 == 0 || coordinate2.this$0 * -1161455169 == 0) ? equals(coordinate, coordinate2, 362821540) : this.f39x ? (coordinate.f35y * 2046794799) - (-726154165 * coordinate2.f35y) : (-1785318032 * coordinate2.f35y) - (coordinate.f35y * 2046794799);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2, int i) {
        try {
            if (coordinate.this$0 * -1161455169 != 0) {
                if (coordinate2.this$0 * -1161455169 != 0) {
                    return this.f39x ? (coordinate.f35y * 2046794799) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * 2046794799);
                }
            }
            return equals(coordinate, coordinate2, 2094796703);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cf.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((Coordinate) obj, (Coordinate) obj2, 1000816834);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cf.compare(" + ')');
        }
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1796452487);
    }

    int filter(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * 1928037494 == 0 || coordinate2.this$0 * -1161455169 == 0) ? equals(coordinate, coordinate2, 1467978016) : this.f39x ? (coordinate.f35y * 2046794799) - (-1793015258 * coordinate2.f35y) : (-1272543274 * coordinate2.f35y) - (coordinate.f35y * 2046794799);
    }

    int insert(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * 578760247 == 0 || coordinate2.this$0 * -1161455169 == 0) ? equals(coordinate, coordinate2, 808130967) : this.f39x ? (719206726 * coordinate.f35y) - (-791979436 * coordinate2.f35y) : (-339549571 * coordinate2.f35y) - (2046794799 * coordinate.f35y);
    }

    public int parse(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1287916128);
    }

    int toString(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * -1161455169 == 0 || coordinate2.this$0 * -1161455169 == 0) ? equals(coordinate, coordinate2, 565473209) : this.f39x ? (coordinate.f35y * 2046794799) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * 2046794799);
    }

    int transform(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * -1161455169 == 0 || coordinate2.this$0 * -1161455169 == 0) ? equals(coordinate, coordinate2, 1382442296) : this.f39x ? (coordinate.f35y * 2046794799) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * 2046794799);
    }
}
