package p000;

import java.util.Iterator;

/* compiled from: kp */
public final class Date implements Iterable {
    Object data;
    Object[] index;
    Object key;
    int size = 0;
    int this$0;

    public Date(int i) {
        this.this$0 = i;
        this.index = new Object[i];
        for (int $i1 = 0; $i1 < i; $i1++) {
            Object[] $r2 = this.index;
            Object $r1 = new Object();
            $r2[$i1] = $r1;
            $r1.list = $r1;
            $r1.id = $r1;
        }
    }

    public Object add() {
        this.size = 0;
        return get();
    }

    public void add(Object object, long j) {
        if (object.id != null) {
            object.iterator();
        }
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        object.id = $r2.id;
        object.list = $r2;
        object.id.list = object;
        object.list.id = object;
        object.size = j;
    }

    public void clear() {
        for (int $i0 = 0; $i0 < this.this$0; $i0++) {
            Object $r3 = this.index[$i0];
            while (true) {
                Object $r1 = $r3.list;
                if ($r1 == $r3) {
                    break;
                }
                $r1.iterator();
            }
        }
        this.key = null;
        this.data = null;
    }

    public Iterator createEntryIterator() {
        return new InsnList$InsnListIterator(this);
    }

    public Object doInBackground() {
        Object $r1;
        if (this.size <= 0 || this.data == this.index[this.size - 1]) {
            while (this.size < this.this$0) {
                Object[] $r2 = this.index;
                int $i0 = this.size;
                this.size = $i0 + 1;
                $r1 = $r2[$i0].list;
                if ($r1 != this.index[this.size - 1]) {
                    this.data = $r1.list;
                    return $r1;
                }
            }
            return null;
        }
        $r1 = this.data;
        this.data = $r1.list;
        return $r1;
    }

    public Object get() {
        Object $r1;
        if (this.size <= 0 || this.data == this.index[this.size - 1]) {
            while (this.size < this.this$0) {
                Object[] $r2 = this.index;
                int $i0 = this.size;
                this.size = $i0 + 1;
                $r1 = $r2[$i0].list;
                if ($r1 != this.index[this.size - 1]) {
                    this.data = $r1.list;
                    return $r1;
                }
            }
            return null;
        }
        $r1 = this.data;
        this.data = $r1.list;
        return $r1;
    }

    public Object get(long j) {
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        this.key = $r2.list;
        while (this.key != $r2) {
            if (this.key.size == j) {
                $r2 = this.key;
                this.key = this.key.list;
                return $r2;
            }
            this.key = this.key.list;
        }
        this.key = null;
        return null;
    }

    public void get(Object object, long j) {
        if (object.id != null) {
            object.iterator();
        }
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        object.id = $r2.id;
        object.list = $r2;
        object.id.list = object;
        object.list.id = object;
        object.size = j;
    }

    public Object getValue() {
        this.size = 0;
        return get();
    }

    public Iterator iterator() {
        return new InsnList$InsnListIterator(this);
    }

    public Object next(long j) {
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        this.key = $r2.list;
        while (this.key != $r2) {
            if (this.key.size == j) {
                $r2 = this.key;
                this.key = this.key.list;
                return $r2;
            }
            this.key = this.key.list;
        }
        this.key = null;
        return null;
    }

    public void parse(Object object, long j) {
        if (object.id != null) {
            object.iterator();
        }
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        object.id = $r2.id;
        object.list = $r2;
        object.id.list = object;
        object.list.id = object;
        object.size = j;
    }

    public Object remove(long j) {
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        this.key = $r2.list;
        while (this.key != $r2) {
            if (this.key.size == j) {
                $r2 = this.key;
                this.key = this.key.list;
                return $r2;
            }
            this.key = this.key.list;
        }
        this.key = null;
        return null;
    }

    public Object set(long j) {
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        this.key = $r2.list;
        while (this.key != $r2) {
            if (this.key.size == j) {
                $r2 = this.key;
                this.key = this.key.list;
                return $r2;
            }
            this.key = this.key.list;
        }
        this.key = null;
        return null;
    }

    public void start() {
        for (int $i0 = 0; $i0 < this.this$0; $i0++) {
            Object $r3 = this.index[$i0];
            while (true) {
                Object $r1 = $r3.list;
                if ($r1 == $r3) {
                    break;
                }
                $r1.iterator();
            }
        }
        this.key = null;
        this.data = null;
    }

    public Object toString(long j) {
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        this.key = $r2.list;
        while (this.key != $r2) {
            if (this.key.size == j) {
                $r2 = this.key;
                this.key = this.key.list;
                return $r2;
            }
            this.key = this.key.list;
        }
        this.key = null;
        return null;
    }

    public void toString(Object object, long j) {
        if (object.id != null) {
            object.iterator();
        }
        Object $r2 = this.index[(int) (((long) (this.this$0 - 1)) & j)];
        object.id = $r2.id;
        object.list = $r2;
        object.id.list = object;
        object.list.id = object;
        object.size = j;
    }
}
