package p000;

import java.util.Iterator;

/* compiled from: ku */
public class InsnList$InsnListIterator implements Iterator {
    int index;
    Object next;
    Date this$0;
    Object value = null;

    InsnList$InsnListIterator(Date date) {
        this.this$0 = date;
        set();
    }

    public boolean add() {
        if (this.next != this.this$0.index[this.index - 1]) {
            return true;
        }
        while (this.index < this.this$0.this$0) {
            Object[] $r3 = this.this$0.index;
            int $i0 = this.index;
            this.index = $i0 + 1;
            if ($r3[$i0].list != this.this$0.index[this.index - 1]) {
                this.next = this.this$0.index[this.index - 1].list;
                return true;
            }
            this.next = this.this$0.index[this.index - 1];
        }
        return false;
    }

    public void addElement() {
        if (this.value == null) {
            throw new IllegalStateException();
        }
        this.value.iterator();
        this.value = null;
    }

    public Object get() {
        if (this.next != this.this$0.index[this.index - 1]) {
            Object $r1 = this.next;
            this.next = $r1.list;
            this.value = $r1;
            return $r1;
        }
        while (this.index < this.this$0.this$0) {
            Object[] $r3 = this.this$0.index;
            int $i0 = this.index;
            this.index = $i0 + 1;
            $r1 = $r3[$i0].list;
            if ($r1 != this.this$0.index[this.index - 1]) {
                this.next = $r1.list;
                this.value = $r1;
                return $r1;
            }
        }
        return null;
    }

    public boolean hasNext() {
        if (this.next != this.this$0.index[this.index - 1]) {
            return true;
        }
        while (this.index < this.this$0.this$0) {
            Object[] $r3 = this.this$0.index;
            int $i0 = this.index;
            this.index = $i0 + 1;
            if ($r3[$i0].list != this.this$0.index[this.index - 1]) {
                this.next = this.this$0.index[this.index - 1].list;
                return true;
            }
            this.next = this.this$0.index[this.index - 1];
        }
        return false;
    }

    public Object next() {
        if (this.next != this.this$0.index[this.index - 1]) {
            Object $r1 = this.next;
            this.next = $r1.list;
            this.value = $r1;
            return $r1;
        }
        while (this.index < this.this$0.this$0) {
            Object[] $r3 = this.this$0.index;
            int $i0 = this.index;
            this.index = $i0 + 1;
            $r1 = $r3[$i0].list;
            if ($r1 != this.this$0.index[this.index - 1]) {
                this.next = $r1.list;
                this.value = $r1;
                return $r1;
            }
        }
        return null;
    }

    public boolean parse() {
        if (this.next != this.this$0.index[this.index - 1]) {
            return true;
        }
        while (this.index < this.this$0.this$0) {
            Object[] $r3 = this.this$0.index;
            int $i0 = this.index;
            this.index = $i0 + 1;
            if ($r3[$i0].list != this.this$0.index[this.index - 1]) {
                this.next = this.this$0.index[this.index - 1].list;
                return true;
            }
            this.next = this.this$0.index[this.index - 1];
        }
        return false;
    }

    void previous() {
        this.next = this.this$0.index[0].list;
        this.index = 1;
        this.value = null;
    }

    public Object read() {
        if (this.next != this.this$0.index[this.index - 1]) {
            Object $r1 = this.next;
            this.next = $r1.list;
            this.value = $r1;
            return $r1;
        }
        while (this.index < this.this$0.this$0) {
            Object[] $r3 = this.this$0.index;
            int $i0 = this.index;
            this.index = $i0 + 1;
            $r1 = $r3[$i0].list;
            if ($r1 != this.this$0.index[this.index - 1]) {
                this.next = $r1.list;
                this.value = $r1;
                return $r1;
            }
        }
        return null;
    }

    public void remove() {
        if (this.value == null) {
            throw new IllegalStateException();
        }
        this.value.iterator();
        this.value = null;
    }

    void set() {
        this.next = this.this$0.index[0].list;
        this.index = 1;
        this.value = null;
    }
}
