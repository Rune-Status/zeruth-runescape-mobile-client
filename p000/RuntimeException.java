package p000;

/* compiled from: ky */
public final class RuntimeException {
    int index;
    int size;
    Math stack;
    RefList this$0 = new RefList();
    BitSet value = new BitSet();

    public RuntimeException(int i, String str) {
        this.size = i;
        this.index = i;
        int $i1 = 1;
        while ($i1 + $i1 < i) {
            $i1 += $i1;
        }
        this.stack = new Math($i1);
    }

    public void add(long j) {
        BitSet $r3 = (BitSet) this.stack.get(j);
        if ($r3 != null) {
            $r3.iterator();
            $r3.get();
            this.index++;
        }
    }

    public void add(BitSet bitSet, long j) {
        if (this.index == 0) {
            BitSet $r4 = this.this$0.remove();
            $r4.iterator();
            $r4.get();
            if ($r4 == this.value) {
                BitSet $r2 = this.this$0.remove();
                $r2.iterator();
                $r2.get();
            }
        } else {
            this.index--;
        }
        this.stack.get(bitSet, j);
        this.this$0.set(bitSet);
    }

    public void clear(BitSet bitSet, long j) {
        if (this.index == 0) {
            BitSet $r4 = this.this$0.remove();
            $r4.iterator();
            $r4.get();
            if ($r4 == this.value) {
                BitSet $r2 = this.this$0.remove();
                $r2.iterator();
                $r2.get();
            }
        } else {
            this.index--;
        }
        this.stack.get(bitSet, j);
        this.this$0.set(bitSet);
    }

    public BitSet copy(long j) {
        BitSet $r4 = (BitSet) this.stack.get(j);
        if ($r4 != null) {
            this.this$0.set($r4);
        }
        return $r4;
    }

    public BitSet get(long j) {
        BitSet $r4 = (BitSet) this.stack.get(j);
        if ($r4 != null) {
            this.this$0.set($r4);
        }
        return $r4;
    }

    public void get() {
        this.this$0.set();
        this.stack.clear();
        this.value = new BitSet();
        this.index = this.size;
    }

    public void get(BitSet bitSet, long j) {
        if (this.index == 0) {
            BitSet $r4 = this.this$0.remove();
            $r4.iterator();
            $r4.get();
            if ($r4 == this.value) {
                BitSet $r2 = this.this$0.remove();
                $r2.iterator();
                $r2.get();
            }
        } else {
            this.index--;
        }
        this.stack.get(bitSet, j);
        this.this$0.set(bitSet);
    }

    public String getExistingPrefixFor() {
        return "";
    }

    public String getPersistentNotificationMessage() {
        return "";
    }

    public BitSet next(long j) {
        BitSet $r4 = (BitSet) this.stack.get(j);
        if ($r4 != null) {
            this.this$0.set($r4);
        }
        return $r4;
    }

    public void next() {
        this.this$0.set();
        this.stack.clear();
        this.value = new BitSet();
        this.index = this.size;
    }

    public BitSet read(long j) {
        BitSet $r4 = (BitSet) this.stack.get(j);
        if ($r4 != null) {
            this.this$0.set($r4);
        }
        return $r4;
    }

    public void remove() {
        this.this$0.set();
        this.stack.clear();
        this.value = new BitSet();
        this.index = this.size;
    }

    public void remove(BitSet bitSet, long j) {
        if (this.index == 0) {
            BitSet $r4 = this.this$0.remove();
            $r4.iterator();
            $r4.get();
            if ($r4 == this.value) {
                BitSet $r2 = this.this$0.remove();
                $r2.iterator();
                $r2.get();
            }
        } else {
            this.index--;
        }
        this.stack.get(bitSet, j);
        this.this$0.set(bitSet);
    }

    public void set() {
        this.this$0.set();
        this.stack.clear();
        this.value = new BitSet();
        this.index = this.size;
    }

    public String toString() {
        return "";
    }

    public String tokenToString() {
        return "";
    }

    public void write(long j) {
        BitSet $r3 = (BitSet) this.stack.get(j);
        if ($r3 != null) {
            $r3.iterator();
            $r3.get();
            this.index++;
        }
    }
}
