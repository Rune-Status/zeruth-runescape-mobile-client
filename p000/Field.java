package p000;

/* compiled from: fl */
public class Field extends Entry {
    int count = -1;
    Iterator name = new Iterator();
    Iterator parent = new Iterator();
    int value = 0;

    protected Entry add() {
        return (Entry) this.parent.get();
    }

    public final synchronized void add(Entry entry) {
        entry.iterator();
    }

    void add(int[] iArr, int i, int i2) {
        Entry $r4 = (Entry) this.parent.get();
        while ($r4 != null) {
            $r4.next(iArr, i, i2);
            $r4 = (Entry) this.parent.next();
        }
    }

    public final synchronized void bind(Entry entry) {
        entry.iterator();
    }

    protected int clear() {
        return 0;
    }

    void clone() {
        if (this.value > 0) {
            Header $r3 = (Header) this.name.get();
            while ($r3 != null) {
                $r3.value -= this.value;
                $r3 = (Header) this.name.next();
            }
            this.count -= this.value;
            this.value = 0;
        }
    }

    void clone(Header header) {
        header.iterator();
        header.init();
        Object $r3 = this.name.list.list;
        if ($r3 == this.name.list) {
            this.count = -1;
        } else {
            this.count = ((Header) $r3).value;
        }
    }

    protected Entry contains() {
        return (Entry) this.parent.get();
    }

    public final synchronized void equals(Entry entry) {
        this.parent.get(entry);
    }

    protected int fill() {
        return 0;
    }

    protected Entry get() {
        return (Entry) this.parent.next();
    }

    public final synchronized void get(int $i0) {
        do {
            if (this.count < 0) {
                toString($i0);
                break;
            } else if (this.value + $i0 < this.count) {
                this.value += $i0;
                toString($i0);
                break;
            } else {
                int $i1 = this.count - this.value;
                toString($i1);
                $i0 -= $i1;
                this.value = $i1 + this.value;
                process();
                Header $r4 = (Header) this.name.get();
                synchronized ($r4) {
                    $i1 = $r4.getValue(this);
                    if ($i1 < 0) {
                        $r4.value = 0;
                        process($r4);
                    } else {
                        $r4.value = $i1;
                        toString($r4.list, $r4);
                    }
                }
            }
        } while ($i0 != 0);
    }

    protected Entry getEntry() {
        return (Entry) this.parent.next();
    }

    public final synchronized void getProperty(Entry entry) {
        this.parent.get(entry);
    }

    protected int getType() {
        return 0;
    }

    protected Entry indexOf() {
        return (Entry) this.parent.get();
    }

    void init() {
        if (this.value > 0) {
            Header $r3 = (Header) this.name.get();
            while ($r3 != null) {
                $r3.value -= this.value;
                $r3 = (Header) this.name.next();
            }
            this.count -= this.value;
            this.value = 0;
        }
    }

    protected int isEmpty() {
        return 0;
    }

    protected int open() {
        return 0;
    }

    public final synchronized void parse(int $i0) {
        do {
            if (this.count < 0) {
                toString($i0);
                break;
            } else if (this.value + $i0 < this.count) {
                this.value += $i0;
                toString($i0);
                break;
            } else {
                int $i1 = this.count - this.value;
                toString($i1);
                $i0 -= $i1;
                this.value = $i1 + this.value;
                process();
                Header $r4 = (Header) this.name.get();
                synchronized ($r4) {
                    $i1 = $r4.getValue(this);
                    if ($i1 < 0) {
                        $r4.value = 0;
                        process($r4);
                    } else {
                        $r4.value = $i1;
                        toString($r4.list, $r4);
                    }
                }
            }
        } while ($i0 != 0);
    }

    void process() {
        if (this.value > 0) {
            Header $r3 = (Header) this.name.get();
            while ($r3 != null) {
                $r3.value -= this.value;
                $r3 = (Header) this.name.next();
            }
            this.count -= this.value;
            this.value = 0;
        }
    }

    public final synchronized void process(int $i0) {
        do {
            if (this.count < 0) {
                toString($i0);
                break;
            } else if (this.value + $i0 < this.count) {
                this.value += $i0;
                toString($i0);
                break;
            } else {
                int $i1 = this.count - this.value;
                toString($i1);
                $i0 -= $i1;
                this.value = $i1 + this.value;
                process();
                Header $r4 = (Header) this.name.get();
                synchronized ($r4) {
                    $i1 = $r4.getValue(this);
                    if ($i1 < 0) {
                        $r4.value = 0;
                        process($r4);
                    } else {
                        $r4.value = $i1;
                        toString($r4.list, $r4);
                    }
                }
            }
        } while ($i0 != 0);
    }

    public final synchronized void process(Entry entry) {
        this.parent.get(entry);
    }

    void process(Header header) {
        header.iterator();
        header.init();
        Object $r3 = this.name.list.list;
        if ($r3 == this.name.list) {
            this.count = -1;
        } else {
            this.count = ((Header) $r3).value;
        }
    }

    void process(Object $r1, Header header) {
        while ($r1 != this.name.list && ((Header) $r1).value <= header.value) {
            $r1 = $r1.list;
        }
        Iterator.add(header, $r1);
        this.count = ((Header) this.name.list.list).value;
    }

    void process(int[] iArr, int i, int i2) {
        Entry $r4 = (Entry) this.parent.get();
        while ($r4 != null) {
            $r4.next(iArr, i, i2);
            $r4 = (Entry) this.parent.next();
        }
    }

    protected Entry remove() {
        return (Entry) this.parent.get();
    }

    public final synchronized void run(int $i0) {
        do {
            if (this.count < 0) {
                toString($i0);
                break;
            } else if (this.value + $i0 < this.count) {
                this.value += $i0;
                toString($i0);
                break;
            } else {
                int $i1 = this.count - this.value;
                toString($i1);
                $i0 -= $i1;
                this.value = $i1 + this.value;
                process();
                Header $r4 = (Header) this.name.get();
                synchronized ($r4) {
                    $i1 = $r4.getValue(this);
                    if ($i1 < 0) {
                        $r4.value = 0;
                        process($r4);
                    } else {
                        $r4.value = $i1;
                        toString($r4.list, $r4);
                    }
                }
            }
        } while ($i0 != 0);
    }

    public final synchronized void run(int[] iArr, int $i0, int $i1) {
        do {
            if (this.count < 0) {
                write(iArr, $i0, $i1);
                break;
            } else if (this.value + $i1 < this.count) {
                this.value += $i1;
                write(iArr, $i0, $i1);
                break;
            } else {
                int $i2 = this.count - this.value;
                write(iArr, $i0, $i2);
                $i0 += $i2;
                $i1 -= $i2;
                this.value = $i2 + this.value;
                process();
                Header $r5 = (Header) this.name.get();
                synchronized ($r5) {
                    $i2 = $r5.getValue(this);
                    if ($i2 < 0) {
                        $r5.value = 0;
                        process($r5);
                    } else {
                        $r5.value = $i2;
                        toString($r5.list, $r5);
                    }
                }
            }
        } while ($i1 != 0);
    }

    protected Entry size() {
        return (Entry) this.parent.get();
    }

    public final synchronized void stop(Entry entry) {
        entry.iterator();
    }

    protected Entry toArray() {
        return (Entry) this.parent.next();
    }

    void toString(int i) {
        Entry $r3 = (Entry) this.parent.get();
        while ($r3 != null) {
            $r3.get(i);
            $r3 = (Entry) this.parent.next();
        }
    }

    public final synchronized void toString(Entry entry) {
        entry.iterator();
    }

    void toString(Object $r1, Header header) {
        while ($r1 != this.name.list && ((Header) $r1).value <= header.value) {
            $r1 = $r1.list;
        }
        Iterator.add(header, $r1);
        this.count = ((Header) this.name.list.list).value;
    }

    public final synchronized void toString(int[] iArr, int $i0, int $i1) {
        do {
            if (this.count < 0) {
                write(iArr, $i0, $i1);
                break;
            } else if (this.value + $i1 < this.count) {
                this.value += $i1;
                write(iArr, $i0, $i1);
                break;
            } else {
                int $i2 = this.count - this.value;
                write(iArr, $i0, $i2);
                $i0 += $i2;
                $i1 -= $i2;
                this.value = $i2 + this.value;
                process();
                Header $r5 = (Header) this.name.get();
                synchronized ($r5) {
                    $i2 = $r5.getValue(this);
                    if ($i2 < 0) {
                        $r5.value = 0;
                        process($r5);
                    } else {
                        $r5.value = $i2;
                        toString($r5.list, $r5);
                    }
                }
            }
        } while ($i1 != 0);
    }

    public final synchronized void validate(Entry entry) {
        this.parent.get(entry);
    }

    void validate(int[] iArr, int i, int i2) {
        Entry $r4 = (Entry) this.parent.get();
        while ($r4 != null) {
            $r4.next(iArr, i, i2);
            $r4 = (Entry) this.parent.next();
        }
    }

    void write(int[] iArr, int i, int i2) {
        Entry $r4 = (Entry) this.parent.get();
        while ($r4 != null) {
            $r4.next(iArr, i, i2);
            $r4 = (Entry) this.parent.next();
        }
    }
}
