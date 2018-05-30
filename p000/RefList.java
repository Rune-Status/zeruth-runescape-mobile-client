package p000;

/* compiled from: kw */
public final class RefList {
    BitSet size = new BitSet();

    static void add(BitSet bitSet, BitSet $r1) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = $r1;
        bitSet.next = $r1.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    static void remove(BitSet bitSet, BitSet $r1) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = $r1;
        bitSet.next = $r1.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    static void set(BitSet bitSet, BitSet $r1) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = $r1;
        bitSet.next = $r1.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    void add() {
        while (true) {
            BitSet $r2 = this.size.next;
            if ($r2 != this.size) {
                $r2.get();
            } else {
                return;
            }
        }
    }

    public void add(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.size.size;
        bitSet.next = this.size;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    void clear() {
        while (true) {
            BitSet $r2 = this.size.next;
            if ($r2 != this.size) {
                $r2.get();
            } else {
                return;
            }
        }
    }

    public void clear(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.size.size;
        bitSet.next = this.size;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    BitSet copy() {
        BitSet $r2 = this.size.next;
        if ($r2 == this.size) {
            return null;
        }
        $r2.get();
        return $r2;
    }

    public void copy(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.size;
        bitSet.next = this.size.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    public BitSet find() {
        BitSet $r2 = this.size.next;
        return $r2 == this.size ? null : $r2;
    }

    public BitSet get() {
        BitSet $r2 = this.size.next;
        return $r2 == this.size ? null : $r2;
    }

    public void get(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.size;
        bitSet.next = this.size.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    BitSet next() {
        BitSet $r2 = this.size.next;
        if ($r2 == this.size) {
            return null;
        }
        $r2.get();
        return $r2;
    }

    public BitSet pop() {
        BitSet $r2 = this.size.next;
        return $r2 == this.size ? null : $r2;
    }

    BitSet read() {
        BitSet $r2 = this.size.next;
        if ($r2 == this.size) {
            return null;
        }
        $r2.get();
        return $r2;
    }

    BitSet remove() {
        BitSet $r2 = this.size.next;
        if ($r2 == this.size) {
            return null;
        }
        $r2.get();
        return $r2;
    }

    public void remove(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.size.size;
        bitSet.next = this.size;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    void set() {
        while (true) {
            BitSet $r2 = this.size.next;
            if ($r2 != this.size) {
                $r2.get();
            } else {
                return;
            }
        }
    }

    public void set(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.size.size;
        bitSet.next = this.size;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }

    void size() {
        while (true) {
            BitSet $r2 = this.size.next;
            if ($r2 != this.size) {
                $r2.get();
            } else {
                return;
            }
        }
    }

    public void size(BitSet bitSet) {
        if (bitSet.size != null) {
            bitSet.get();
        }
        bitSet.size = this.size;
        bitSet.next = this.size.next;
        bitSet.size.next = bitSet;
        bitSet.next.size = bitSet;
    }
}
