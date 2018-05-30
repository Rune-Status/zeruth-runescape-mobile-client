package p000;

/* compiled from: fw */
public class StringMap extends HashMap {
    public static final int Theme_alertDialogStyle = 90;
    public static int header = 0;
    public static final int seed = 5;
    Option keys;
    CopyOnWriteArrayList this$0;
    Resource values;

    public StringMap() {
        try {
            this.this$0 = new CopyOnWriteArrayList(0, 0);
            this.values = new Resource(this.this$0.size, 0, 0);
            this.keys = new Option(this.values);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "fw.<init>(" + ')');
        }
    }

    public static int add(int $i0, byte b) {
        int $i2 = 0;
        if ($i0 < 0 || $i0 >= PingManager.STATE_SENSOR_ON_FLAG) {
            $i0 >>>= 16;
            $i2 = 16;
        }
        if ($i0 >= 256) {
            $i0 >>>= 8;
            $i2 += 8;
        }
        if ($i0 >= 16) {
            $i0 >>>= 4;
            $i2 += 4;
        }
        if ($i0 >= 4) {
            $i0 >>>= 2;
            $i2 += 2;
        }
        if ($i0 >= 1) {
            $i0 >>>= 1;
            $i2++;
        }
        return $i2 + $i0;
    }

    static final int add(int i, int i2, byte b) {
        int $i3 = 2;
        if (i == -1) {
            return 12345678;
        }
        i2 = ((i & 127) * i2) / Constants.f93X;
        if (i2 >= 2) {
            $i3 = i2 > 126 ? 126 : i2;
        }
        return $i3 + (65408 & i);
    }

    public void add(Long longR) {
        add(longR.size, longR.length, longR.data, -2044182609);
    }

    public void add(Long longR, byte b) {
        try {
            add(longR.size, longR.length, longR.data, 458987911);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "fw.bb(" + ')');
        }
    }

    public void add(int[] iArr, int i, int i2) {
        this.this$0.add(iArr, i, i2, 1598390010);
        this.values.get(iArr, i, i2, -505807934);
    }

    public void add(int[] iArr, int i, int i2, int i3) {
        try {
            this.this$0.add(iArr, i, i2, 311104969);
            this.values.get(iArr, i, i2, -6201778);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "fw.bw(" + ')');
        }
    }

    public void clear() {
    }

    public void clear(int i) {
    }

    public Server containsKey() {
        return this.keys;
    }

    public File get() {
        return this.this$0;
    }

    public File get(int i) {
        try {
            return this.this$0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fw.af(" + ')');
        }
    }

    public Point get(byte b) {
        try {
            return this.values;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fw.ad(" + ')');
        }
    }

    public void get(int i, int i2) {
        add(new int[(i * i2)], i, i2, -1621072713);
    }

    public void get(int i, int i2, int i3) {
        try {
            throw new Error("");
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "fw.as(" + ')');
        }
    }

    public void get(Long longR) {
        add(longR.size, longR.length, longR.data, 632433078);
    }

    public Point getEntry() {
        return this.values;
    }

    public Server getKey() {
        return this.keys;
    }

    public void insert() {
    }

    public Server keys() {
        return this.keys;
    }

    public void push(int i, int i2) {
        throw new Error("");
    }

    public Point put() {
        return this.values;
    }

    public void put(int i, int i2) {
        add(new int[(i * i2)], i, i2, 876478525);
    }

    public void put(int i, int i2, int i3) {
        try {
            add(new int[(i * i2)], i, i2, 667610327);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "fw.aa(" + ')');
        }
    }

    public void put(int i, int i2, int i3, int i4) {
        throw new Error("");
    }

    public void put(int i, int i2, int i3, int i4, byte b) {
        try {
            throw new Error("");
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "fw.ay(" + ')');
        }
    }

    public void put(Long longR) {
        add(longR.size, longR.length, longR.data, -1279960201);
    }

    public void read(Long longR) {
        add(longR.size, longR.length, longR.data, 450322778);
    }

    public void remove() {
    }

    public void remove(int i, int i2) {
        throw new Error("");
    }

    public Server toString(int i) {
        try {
            return this.keys;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fw.an(" + ')');
        }
    }

    public void toString(int i, int i2) {
        add(new int[(i * i2)], i, i2, -23095162);
    }

    public File values() {
        return this.this$0;
    }
}
