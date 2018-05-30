package p000;

/* compiled from: kb */
public final class Math {
    Object data;
    int id = 0;
    int list;
    Object result;
    Object[] size;

    public Math(int i) {
        this.list = i;
        this.size = new Object[i];
        for (int $i1 = 0; $i1 < i; $i1++) {
            Object[] $r2 = this.size;
            Object $r1 = new Object();
            $r2[$i1] = $r1;
            $r1.list = $r1;
            $r1.id = $r1;
        }
    }

    public void add(Object object, long j) {
        if (object.id != null) {
            object.iterator();
        }
        Object $r2 = this.size[(int) (((long) (this.list - 1)) & j)];
        object.id = $r2.id;
        object.list = $r2;
        object.id.list = object;
        object.list.id = object;
        object.size = j;
    }

    void build() {
        for (int $i0 = 0; $i0 < this.list; $i0++) {
            Object $r3 = this.size[$i0];
            while (true) {
                Object $r1 = $r3.list;
                if ($r1 == $r3) {
                    break;
                }
                $r1.iterator();
            }
        }
        this.data = null;
        this.result = null;
    }

    void clear() {
        for (int $i0 = 0; $i0 < this.list; $i0++) {
            Object $r3 = this.size[$i0];
            while (true) {
                Object $r1 = $r3.list;
                if ($r1 == $r3) {
                    break;
                }
                $r1.iterator();
            }
        }
        this.data = null;
        this.result = null;
    }

    void create() {
        for (int $i0 = 0; $i0 < this.list; $i0++) {
            Object $r3 = this.size[$i0];
            while (true) {
                Object $r1 = $r3.list;
                if ($r1 == $r3) {
                    break;
                }
                $r1.iterator();
            }
        }
        this.data = null;
        this.result = null;
    }

    public Object doInBackground() {
        Object $r1;
        if (this.id <= 0 || this.result == this.size[this.id - 1]) {
            while (this.id < this.list) {
                Object[] $r2 = this.size;
                int $i0 = this.id;
                this.id = $i0 + 1;
                $r1 = $r2[$i0].list;
                if ($r1 != this.size[this.id - 1]) {
                    this.result = $r1.list;
                    return $r1;
                }
            }
            return null;
        }
        $r1 = this.result;
        this.result = $r1.list;
        return $r1;
    }

    public Object findId() {
        this.id = 0;
        return get();
    }

    public Object generateId() {
        this.id = 0;
        return get();
    }

    public Object get() {
        Object $r1;
        if (this.id <= 0 || this.result == this.size[this.id - 1]) {
            while (this.id < this.list) {
                Object[] $r2 = this.size;
                int $i0 = this.id;
                this.id = $i0 + 1;
                $r1 = $r2[$i0].list;
                if ($r1 != this.size[this.id - 1]) {
                    this.result = $r1.list;
                    return $r1;
                }
            }
            return null;
        }
        $r1 = this.result;
        this.result = $r1.list;
        return $r1;
    }

    public Object get(long j) {
        Object $r2 = this.size[(int) (((long) (this.list - 1)) & j)];
        this.data = $r2.list;
        while (this.data != $r2) {
            if (this.data.size == j) {
                $r2 = this.data;
                this.data = this.data.list;
                return $r2;
            }
            this.data = this.data.list;
        }
        this.data = null;
        return null;
    }

    public void get(Object object, long j) {
        if (object.id != null) {
            object.iterator();
        }
        Object $r2 = this.size[(int) (((long) (this.list - 1)) & j)];
        object.id = $r2.id;
        object.list = $r2;
        object.id.list = object;
        object.list.id = object;
        object.size = j;
    }

    public Object load(long j) {
        Object $r2 = this.size[(int) (((long) (this.list - 1)) & j)];
        this.data = $r2.list;
        while (this.data != $r2) {
            if (this.data.size == j) {
                $r2 = this.data;
                this.data = this.data.list;
                return $r2;
            }
            this.data = this.data.list;
        }
        this.data = null;
        return null;
    }

    void load() {
        for (int $i0 = 0; $i0 < this.list; $i0++) {
            Object $r3 = this.size[$i0];
            while (true) {
                Object $r1 = $r3.list;
                if ($r1 == $r3) {
                    break;
                }
                $r1.iterator();
            }
        }
        this.data = null;
        this.result = null;
    }

    public Object next() {
        this.id = 0;
        return get();
    }

    public void parse(Object object, long j) {
        if (object.id != null) {
            object.iterator();
        }
        Object $r2 = this.size[(int) (((long) (this.list - 1)) & j)];
        object.id = $r2.id;
        object.list = $r2;
        object.id.list = object;
        object.list.id = object;
        object.size = j;
    }

    public Object produce() {
        this.id = 0;
        return get();
    }
}
