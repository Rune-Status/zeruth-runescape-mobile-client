package p000;

import group.jagex.oldscape.osrenderer.List;
import group.jagex.oldscape.osrenderer.StringBuilder;

/* compiled from: by */
public class LruCache extends Point {
    static final int ALIGNMENT = 16;
    static final int MARK_LIMIT_BYTES = 2048;
    static int length = 0;
    static final int size = 128;
    final ConcurrentHashMap map;
    FileUtils next;
    boolean value;

    public LruCache(ConcurrentHashMap concurrentHashMap) {
        try {
            this.value = true;
            this.map = concurrentHashMap;
            this.size = concurrentHashMap.size(1723074616) * -145201409;
            this.header = concurrentHashMap.get((short) 4032) * 359809005;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "by.<init>(" + ')');
        }
    }

    static final short m48a(int i) {
        return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
    }

    static final short contains(int i) {
        return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
    }

    static final short fromString(int i) {
        return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
    }

    void add(int i, int i2, int $i2, int $i3) {
        super.put(i, i2, $i2, $i3, (byte) 21);
        this.next.execute(i, i2, $i2 - i, $i3 - i2, -1134046261);
    }

    final void add(int i, int i2, int i3, int i4, int i5, int i6, int $i6, int $i7, int $i8, int i7, int i8, int i9, float f, float f2, float f3, float f4, float f5, float f6, int i10, byte b) {
        try {
            if (Point.type.get(i10, (short) 255) == null) {
                $i6 = Point.type.toString(i10, 1577195485);
                get(i, i2, i3, i4, i5, i6, Calendar.get($i6, i7, -2107138704), Calendar.get($i6, i8, -2109107034), Calendar.get($i6, i9, -2145251182), (byte) -1);
                return;
            }
            short $s15 = ((238267341 * this.f200b == 0 ? 255 : 238267341 * this.f200b) << 8) | 255;
            short $i14 = $s15;
            short $s152 = (short) $s15;
            short $i9 = Math.min(Math.max(i7, 2), 126) + 1024;
            short $i10 = Math.min(Math.max(i8, 2), 126) + 1024;
            short $i11 = Math.min(Math.max(i9, 2), 126) + 1024;
            $i14 = 1 == $i6 ? (short) 1 : this.this$0 * 542614623;
            short $s16 = SparseFieldVector.add(i10, (byte) 126);
            int $i17 = ((AbstractBuffer) Point.type).get(i10, (byte) 2).buf / 2;
            i10 = ((AbstractBuffer) Point.type).get(i10, (byte) 2).count / 2;
            List.add((short) i4, (short) i, (short) $i6, (short) $i14, (short) $i9, $s152, $s16, Resources.add(f, f4, $i17, i10, -1211015751), (short) i5, (short) i2, (short) $i7, (short) $i14, (short) $i10, $s152, $s16, Resources.add(f2, f5, $i17, i10, 1582843149), (short) i6, (short) i3, (short) $i8, (short) $i14, (short) $i11, $s152, $s16, Resources.add(f3, f6, $i17, i10, 1472275732), 615410240);
        } catch (Throwable $r5) {
            throw StringBuilder.append($r5, "by.aj(" + ')');
        }
    }

    final void contains(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        short $s16 = ((238267341 * this.f200b == 0 ? 255 : this.f200b * 238267341) << 8) | 255;
        short $i22 = $s16;
        short $s162 = (short) $s16;
        List.add((short) i4, (short) i, (short) i7, (short) i13, (short) i10, $s162, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, (short) i13, (short) i11, $s162, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, (short) i13, (short) i12, $s162, (short) 0, (short) 0, 319698624);
    }

    final void create(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        toString(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i7, i7, 1, (short) -7466);
    }

    public void get() {
        if (!StringBuilder.endsWith()) {
            this.value = true;
        }
        if (this.value && StringBuilder.startsWith() && PingManager.getInstance((byte) -91).get(Point.type, 2137323012)) {
            this.value = false;
            PingManager.getInstance((byte) -45).add((byte) 109);
        }
        PingManager.getInstance((byte) -88).toString(Point.type, -2023980801);
        this.next = this.map.get(-55060928);
        this.size = this.map.size(1723074616) * -145201409;
        this.header = this.map.get((short) 4032) * 359809005;
        List.replace((byte) 1);
        PingManager.getInstance((byte) -7).index = StringBuilder.length() * -6680082885010789569L;
    }

    public void get(int i) {
        try {
            if (!StringBuilder.endsWith()) {
                this.value = true;
            }
            if (this.value) {
                if (StringBuilder.startsWith()) {
                    if (PingManager.getInstance((byte) -21).get(Point.type, 2140022296)) {
                        this.value = false;
                        PingManager.getInstance((byte) -60).add((byte) 88);
                    }
                }
            }
            PingManager.getInstance((byte) -6).toString(Point.type, -2023980801);
            this.next = this.map.get(629027069);
            int $i0 = this.map.size(1723074616) * -145201409;
            i = $i0;
            this.size = $i0;
            $i0 = this.map.get((short) 4032) * 359809005;
            i = $i0;
            this.header = $i0;
            List.replace((byte) 1);
            PingManager.getInstance((byte) -89).index = StringBuilder.length() * -6680082885010789569L;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "by.af(" + ')');
        }
    }

    public void get(int i, int i2) {
        try {
            super.get(i, 150622085);
            List.add(i, (byte) -101);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "by.an(" + ')');
        }
    }

    final void get(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, byte b) {
        try {
            toString(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i8, i9, 1, (short) -19698);
        } catch (Throwable $r1) {
            throw StringBuilder.append($r1, "by.ag(" + ')');
        }
    }

    public void getSize(int i) {
        super.get(i, -2055606558);
        List.add(i, (byte) -121);
    }

    final void getSize(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        short $s16 = ((238267341 * this.f200b == 0 ? 255 : this.f200b * 238267341) << 8) | 255;
        short $i22 = $s16;
        short $s162 = (short) $s16;
        List.add((short) i4, (short) i, (short) i7, (short) i13, (short) i10, $s162, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, (short) i13, (short) i11, $s162, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, (short) i13, (short) i12, $s162, (short) 0, (short) 0, 758220464);
    }

    public void init() {
        if (!StringBuilder.endsWith()) {
            this.value = true;
        }
        if (this.value && StringBuilder.startsWith() && PingManager.getInstance((byte) -105).get(Point.type, 2144756871)) {
            this.value = false;
            PingManager.getInstance((byte) -65).add((byte) 14);
        }
        PingManager.getInstance((byte) -92).toString(Point.type, -2023980801);
        this.next = this.map.get(612166555);
        this.size = this.map.size(1723074616) * 994397232;
        this.header = this.map.get((short) 4032) * 359809005;
        List.replace((byte) 1);
        PingManager.getInstance((byte) -112).index = StringBuilder.length() * -6680082885010789569L;
    }

    void put(int i, int i2, int $i2, int $i3) {
        super.put(i, i2, $i2, $i3, (byte) 97);
        this.next.execute(i, i2, $i2 - i, $i3 - i2, -1894906866);
    }

    void put(int i, int i2, int i3, int i4, byte b) {
        try {
            super.put(i, i2, i3, i4, (byte) 20);
            this.next.execute(i, i2, i3 - i, i4 - i2, -1540264342);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "by.ad(" + ')');
        }
    }

    final void put(int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        try {
            toString(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i7, i7, 1, (short) -22348);
        } catch (Throwable $r1) {
            throw StringBuilder.append($r1, "by.ay(" + ')');
        }
    }

    public void set(int i) {
        super.get(i, 1342513425);
        List.add(i, (byte) -32);
    }

    void set(int i, int i2, int $i2, int $i3) {
        super.put(i, i2, $i2, $i3, (byte) 14);
        this.next.execute(i, i2, $i2 - i, $i3 - i2, -1726829448);
    }

    final void toString(int i, int i2, int i3, int i4, int i5, int i6, int $i6, int $i7, int $i8, int i7, int i8, int i9, float f, float f2, float f3, float f4, float f5, float f6, int i10) {
        if (Point.type.get(i10, (short) 255) == null) {
            $i6 = Point.type.toString(i10, 1577195485);
            get(i, i2, i3, i4, i5, i6, Calendar.get($i6, i7, -2122665193), Calendar.get($i6, i8, -2086814224), Calendar.get($i6, i9, -2101314686), (byte) -1);
            return;
        }
        short $s14 = ((-1530228264 * this.f200b == 0 ? 255 : 238267341 * this.f200b) << 8) | 255;
        short $i13 = $s14;
        short $s142 = (short) $s14;
        short $i9 = 184603070 + Math.min(Math.max(i7, 2), 126);
        short $i10 = 2035699361 + Math.min(Math.max(i8, 2), -1704163084);
        short $i11 = Math.min(Math.max(i9, 2), -1018027753) + 1024;
        $i13 = 1 == $i6 ? (short) 1 : this.this$0 * 542614623;
        short $s15 = SparseFieldVector.add(i10, (byte) 109);
        int $i16 = ((AbstractBuffer) Point.type).get(i10, (byte) 2).buf / 2;
        i10 = ((AbstractBuffer) Point.type).get(i10, (byte) 2).count / 2;
        List.add((short) i4, (short) i, (short) $i6, (short) $i13, (short) $i9, $s142, $s15, Resources.add(f, f4, $i16, i10, 420097255), (short) i5, (short) i2, (short) $i7, (short) $i13, (short) $i10, $s142, $s15, Resources.add(f2, f5, $i16, i10, 1103514168), (short) i6, (short) i3, (short) $i8, (short) $i13, (short) $i11, $s142, $s15, Resources.add(f3, f6, $i16, i10, 1284021897), 377063426);
    }

    final void toString(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        short $s16 = ((238267341 * this.f200b == 0 ? 255 : this.f200b * 687554356) << 8) | 255;
        short $i22 = $s16;
        short $s162 = (short) $s16;
        List.add((short) i4, (short) i, (short) i7, (short) i13, (short) i10, $s162, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, (short) i13, (short) i11, $s162, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, (short) i13, (short) i12, $s162, (short) 0, (short) 0, 740086135);
    }

    final void toString(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, short s) {
        try {
            short $s15 = ((238267341 * this.f200b == 0 ? 255 : this.f200b * 238267341) << 8) | 255;
            short $i21 = $s15;
            short $s152 = (short) $s15;
            List.add((short) i4, (short) i, (short) i7, (short) i13, (short) i10, $s152, (short) 0, (short) 0, (short) i5, (short) i2, (short) i8, (short) i13, (short) i11, $s152, (short) 0, (short) 0, (short) i6, (short) i3, (short) i9, (short) i13, (short) i12, $s152, (short) 0, (short) 0, 156173978);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "by.aa(" + ')');
        }
    }

    final void trimToSize(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        toString(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i7, i7, 1, (short) -19324);
    }

    final void trimToSize(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        toString(i, i2, i3, i4, i5, i6, 1, 1, 1, i7, i8, i9, 1, (short) -17042);
    }
}
