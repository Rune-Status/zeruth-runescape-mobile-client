package p000;

/* compiled from: fy */
public abstract class LongMap extends HashMap {
    public static final int Theme_listPreferredItemHeightLarge = 65;
    public static int size;
    protected Build$VERSION keys;
    protected LruCache table;
    protected AbstractHashedMap this$0;
    protected TDoubleLinkedList values;

    protected LongMap() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fy.<init>(" + ')');
        }
    }

    public void clear() {
        this.this$0.get(1270459333).execute(-629432309);
    }

    public void clear(int i) {
        try {
            this.this$0.get(1338030597).execute(-629432309);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "fy.ar(" + ')');
        }
    }

    public Server containsKey() {
        return this.keys;
    }

    public File get() {
        return this.values;
    }

    public File get(int i) {
        try {
            return this.values;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fy.af(" + ')');
        }
    }

    public Point get(byte b) {
        try {
            return this.table;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fy.ad(" + ')');
        }
    }

    public void get(int i, int i2) {
        this.this$0.get(i, i2, -1830205086);
        this.values.add(this.this$0.id, i, i2, -399104258);
    }

    public void get(int i, int i2, int i3) {
        try {
            this.this$0.remove(i, i2, 663977946);
            this.values.add(this.this$0.id, this.this$0.size(1723074616), this.this$0.get((short) 4032), -1423741167);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "fy.as(" + ')');
        }
    }

    public Point getEntry() {
        return this.table;
    }

    public Server getKey() {
        return this.keys;
    }

    public void insert() {
        this.this$0.get(472525308).execute(-629432309);
    }

    public Server keys() {
        return this.keys;
    }

    public void push(int i, int i2) {
        this.this$0.remove(i, i2, -441804543);
        this.values.add(this.this$0.id, this.this$0.size(1723074616), this.this$0.get((short) 4032), -990631816);
    }

    public Point put() {
        return this.table;
    }

    public void put(int i, int i2) {
        this.this$0.get(i, i2, -1732122936);
        this.values.add(this.this$0.id, i, i2, 2066873063);
    }

    public void put(int i, int i2, int i3) {
        try {
            this.this$0.get(i, i2, -1920718864);
            this.values.add(this.this$0.id, i, i2, -664512668);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "fy.aa(" + ')');
        }
    }

    public void put(int i, int i2, int i3, int i4) {
        this.this$0.init(i, i2, i3, i4, 1682435243);
    }

    public void put(int i, int i2, int i3, int i4, byte b) {
        try {
            this.this$0.init(i, i2, i3, i4, -2136499917);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "fy.ay(" + ')');
        }
    }

    public void remove() {
        this.this$0.get(2011118511).execute(-629432309);
    }

    public void remove(int i, int i2) {
        this.this$0.remove(i, i2, 149272871);
        this.values.add(this.this$0.id, this.this$0.size(1723074616), this.this$0.get((short) 4032), 335814158);
    }

    public Server toString(int i) {
        try {
            return this.keys;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fy.an(" + ')');
        }
    }

    public void toString(int i, int i2) {
        this.this$0.get(i, i2, -1958674831);
        this.values.add(this.this$0.id, i, i2, 182119693);
    }

    public File values() {
        return this.values;
    }
}
