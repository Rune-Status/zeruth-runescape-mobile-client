package p000;

import java.util.Iterator;

/* compiled from: ka */
public class TLinkedList$IteratorImpl implements Iterator {
    BitSet current = null;
    BitSet next;
    TLongArrayList this$0;

    TLinkedList$IteratorImpl(TLongArrayList tLongArrayList) {
        this.this$0 = tLongArrayList;
        this.next = this.this$0.next.next;
        this.current = null;
    }

    public Object add() {
        BitSet $r1 = this.next;
        if ($r1 == this.this$0.next) {
            this.next = null;
            $r1 = null;
        } else {
            this.next = $r1.next;
        }
        this.current = $r1;
        return $r1;
    }

    public boolean get() {
        return this.next != this.this$0.next;
    }

    public boolean hasNext() {
        return this.next != this.this$0.next;
    }

    public boolean hasPrevious() {
        return this.next != this.this$0.next;
    }

    public Object next() {
        BitSet $r1 = this.next;
        if ($r1 == this.this$0.next) {
            this.next = null;
            $r1 = null;
        } else {
            this.next = $r1.next;
        }
        this.current = $r1;
        return $r1;
    }

    public Object previous() {
        BitSet $r2 = null;
        BitSet $r1 = this.next;
        if ($r1 == this.this$0.next) {
            this.next = null;
        } else {
            this.next = $r1.next;
            $r2 = $r1;
        }
        this.current = $r2;
        return $r2;
    }

    public void remove() {
        if (this.current == null) {
            throw new IllegalStateException();
        }
        this.current.get();
        this.current = null;
    }

    public void set() {
        if (this.current == null) {
            throw new IllegalStateException();
        }
        this.current.get();
        this.current = null;
    }
}
