package p000;

/* compiled from: ct */
public class Vector2D extends Element {
    static final int AppCompatTheme_editTextStyle = 104;
    public static final int VERSION_CODE = 67;
    static int this$0;
    final boolean f355y;

    public Vector2D(boolean z) {
        try {
            this.f355y = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ct.<init>(" + ')');
        }
    }

    static final void add(Character character, boolean z, int i) {
        try {
            i = 669823817 * character.size;
            int $i2 = (int) character.size;
            character.iterator();
            if (z) {
                Exception.write(i, 1880211468);
            }
            for (Value $r3 = (Value) client.children.next(); $r3 != null; $r3 = (Value) client.children.get()) {
                if (((long) i) == (($r3.size >> 48) & 65535)) {
                    $r3.iterator();
                }
            }
            System $r4 = ArrayList.get($i2, 731679723);
            if ($r4 != null) {
                client.add($r4, (byte) 68);
            }
            Settings.this$0.clear(-2126365372);
            if (-1 != client.parent * 1704673651) {
                i = client.parent * 1704673651;
                if (Hashtable.get(i, (byte) -77)) {
                    JSONObject.get(Float.size[i], 1, 1656291254);
                }
            }
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "ct.fo(" + ')');
        }
    }

    int add(Coordinate coordinate, Coordinate coordinate2) {
        return 1372979651 * coordinate2.count != 270724794 * coordinate.count ? this.f355y ? (coordinate.count * -533735695) - (coordinate2.count * -533735695) : (coordinate2.count * -533735695) - (1148841067 * coordinate.count) : equals(coordinate, coordinate2, 19890349);
    }

    int add(Coordinate coordinate, Coordinate coordinate2, byte b) {
        try {
            return coordinate2.count * -533735695 != coordinate.count * -533735695 ? this.f355y ? (coordinate.count * -533735695) - (coordinate2.count * -533735695) : (coordinate2.count * -533735695) - (coordinate.count * -533735695) : equals(coordinate, coordinate2, 618193673);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ct.af(" + ')');
        }
    }

    public int add(Object obj, Object obj2) {
        return add((Coordinate) obj, (Coordinate) obj2, (byte) 106);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return add((Coordinate) obj, (Coordinate) obj2, (byte) 107);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ct.compare(" + ')');
        }
    }

    public int create(Object obj, Object obj2) {
        return add((Coordinate) obj, (Coordinate) obj2, (byte) 42);
    }

    public int parse(Object obj, Object obj2) {
        return add((Coordinate) obj, (Coordinate) obj2, (byte) 113);
    }
}
