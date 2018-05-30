package p000;

import java.util.Iterator;

/* compiled from: ko */
public class TLongArrayList implements Iterable {
    public BitSet next = new BitSet();
    BitSet value;

    public void add() {
        while (this.next.next != this.next) {
            this.next.next.get();
        }
    }

    public void add(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.next.size;
        bitSet.next = this.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    public void clear() {
        while (this.next.next != this.next) {
            this.next.next.get();
        }
    }

    public void clear(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.next.size;
        bitSet.next = this.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    BitSet clone() {
        BitSet $r1 = this.value;
        if ($r1 == this.next) {
            this.value = null;
            return null;
        }
        this.value = $r1.next;
        return $r1;
    }

    BitSet contains() {
        return get(null);
    }

    BitSet equals() {
        BitSet $r2 = this.next.next;
        if ($r2 == this.next) {
            return null;
        }
        $r2.get();
        return $r2;
    }

    BitSet get() {
        BitSet $r2 = this.next.next;
        if ($r2 == this.next) {
            return null;
        }
        $r2.get();
        return $r2;
    }

    BitSet get(BitSet $r1) {
        if ($r1 == null) {
            $r1 = this.next.next;
        }
        if ($r1 == this.next) {
            this.value = null;
            return null;
        }
        this.value = $r1.next;
        return $r1;
    }

    BitSet indexOf() {
        return get(null);
    }

    BitSet insert() {
        BitSet $r1 = this.value;
        if ($r1 == this.next) {
            this.value = null;
            return null;
        }
        this.value = $r1.next;
        return $r1;
    }

    public Iterator iterator() {
        return new TLinkedList$IteratorImpl(this);
    }

    BitSet next() {
        return get(null);
    }

    BitSet remove() {
        BitSet $r1 = this.value;
        if ($r1 == this.next) {
            this.value = null;
            return null;
        }
        this.value = $r1.next;
        return $r1;
    }

    BitSet remove(BitSet $r1) {
        if ($r1 == null) {
            $r1 = this.next.next;
        }
        if ($r1 == this.next) {
            this.value = null;
            return null;
        }
        this.value = $r1.next;
        return $r1;
    }

    BitSet removeAll() {
        return get(null);
    }

    BitSet removeAt() {
        return get(null);
    }

    BitSet replace() {
        BitSet $r1 = this.value;
        if ($r1 == this.next) {
            this.value = null;
            return null;
        }
        this.value = $r1.next;
        return $r1;
    }

    public void reset() {
        while (this.next.next != this.next) {
            this.next.next.get();
        }
    }

    BitSet reverse() {
        BitSet $r2 = this.next.next;
        if ($r2 == this.next) {
            return null;
        }
        $r2.get();
        return $r2;
    }

    public void set() {
        while (this.next.next != this.next) {
            this.next.next.get();
        }
    }

    public void set(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.next.size;
        bitSet.next = this.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    BitSet size() {
        BitSet $r2 = this.next.next;
        if ($r2 == this.next) {
            return null;
        }
        $r2.get();
        return $r2;
    }

    BitSet sum() {
        return get(null);
    }

    public void toArray() {
        while (this.next.next != this.next) {
            this.next.next.get();
        }
    }

    public Iterator trimToSize() {
        return new TLinkedList$IteratorImpl(this);
    }
}
