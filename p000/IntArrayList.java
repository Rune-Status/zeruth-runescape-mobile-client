package p000;

/* compiled from: kk */
public class IntArrayList {
    final Object[] data;
    int size = 0;
    final Class type;

    public IntArrayList(Class cls, int i) {
        this.type = cls;
        this.data = new Object[i];
    }

    public synchronized Object add() {
        return this.size == 0 ? get() : set();
    }

    public synchronized void add(Object obj) {
        if (this.size < this.data.length) {
            Object[] $r2 = this.data;
            int $i1 = this.size;
            this.size = $i1 + 1;
            $r2[$i1] = obj;
        }
    }

    Object get() {
        try {
            return this.type.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException();
        }
    }

    public synchronized void get(Object obj) {
        if (this.size < this.data.length) {
            Object[] $r2 = this.data;
            int $i1 = this.size;
            this.size = $i1 + 1;
            $r2[$i1] = obj;
        }
    }

    Object length() {
        Object[] $r1 = this.data;
        int $i0 = this.size - 1;
        this.size = $i0;
        return $r1[$i0];
    }

    public synchronized Object put() {
        return this.size == 0 ? get() : set();
    }

    public synchronized void put(Object obj) {
        if (this.size < this.data.length) {
            Object[] $r2 = this.data;
            int $i1 = this.size;
            this.size = $i1 + 1;
            $r2[$i1] = obj;
        }
    }

    Object set() {
        Object[] $r1 = this.data;
        int $i0 = this.size - 1;
        this.size = $i0;
        return $r1[$i0];
    }

    public synchronized void set(Object obj) {
        if (this.size < this.data.length) {
            Object[] $r2 = this.data;
            int $i1 = this.size;
            this.size = $i1 + 1;
            $r2[$i1] = obj;
        }
    }

    public synchronized Object swap() {
        return this.size == 0 ? get() : set();
    }

    Object toArray() {
        try {
            return this.type.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException();
        }
    }
}
