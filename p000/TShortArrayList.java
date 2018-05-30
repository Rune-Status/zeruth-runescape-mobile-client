package p000;

import java.util.Collection;

/* compiled from: nd */
public class TShortArrayList extends Entry {
    Field head;
    Iterator next;
    Window this$0;

    TShortArrayList(Window window) {
        try {
            this.next = new Iterator();
            this.head = new Field();
            this.this$0 = window;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nd.<init>(" + ')');
        }
    }

    public static void add(Collection collection, byte b) {
        try {
            collection.add(Model.parent);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nd.ar(" + ')');
        }
    }

    protected Entry add() {
        Range $r4 = (Range) this.next.get();
        return $r4 == null ? null : $r4.data != null ? $r4.data : get();
    }

    void add(Range range, int $i0) {
        boolean $z0 = false;
        if ((this.this$0.type[-894156381 * range.this$0] & 4) != 0 && -1027449183 * range.size < 0) {
            int $i1 = this.this$0.buffer[-706934978 * range.this$0] / (1688035177 * FileInfo.data);
            int $i2 = ((-1172486687 + $i1) - (-273916857 * range.field)) / $i1;
            range.field = (((range.field * -1469811002) + ($i1 * $i0)) & -459667923) * 1797201239;
            if ($i2 <= $i0) {
                if (this.this$0.data[range.this$0 * 1829364743] == 0) {
                    range.data = Address.equals(range.next, range.data.getKey(), range.data.getValue(), range.data.length());
                } else {
                    range.data = Address.equals(range.next, range.data.getKey(), 0, range.data.length());
                    Window $r2 = this.this$0;
                    if (range.current.data[2078821397 * range.length] < (short) 0) {
                        $z0 = true;
                    }
                    $r2.toString(range, $z0, 1352620236);
                }
                if (range.current.data[range.length * -1127084445] < (short) 0) {
                    range.data.equals(-1);
                }
                $i0 = (-7733305 * range.field) / $i1;
            }
        }
        range.data.get($i0);
    }

    void add(Range range, int i, int i2) {
        boolean $z0 = false;
        try {
            if ((this.this$0.type[range.this$0 * 1829364743] & 4) != 0) {
                if (-1027449183 * range.size < 0) {
                    i2 = this.this$0.buffer[range.this$0 * 1829364743] / (1688035177 * FileInfo.data);
                    int $i2 = ((i2 + 1048575) - (range.field * -7733305)) / i2;
                    range.field = (((range.field * -7733305) + (i2 * i)) & 1048575) * 355602935;
                    if ($i2 <= i) {
                        if (this.this$0.data[range.this$0 * 1829364743] == 0) {
                            range.data = Address.equals(range.next, range.data.getKey(), range.data.getValue(), range.data.length());
                        } else {
                            range.data = Address.equals(range.next, range.data.getKey(), 0, range.data.length());
                            Window $r2 = this.this$0;
                            if (range.current.data[range.length * 2078821397] < (short) 0) {
                                $z0 = true;
                            }
                            $r2.toString(range, $z0, 276747326);
                        }
                        if (range.current.data[range.length * 2078821397] < (short) 0) {
                            range.data.equals(-1);
                        }
                        int $i1 = range.field * -7733305;
                        i = $i1;
                        i = $i1 / i2;
                    }
                }
            }
            range.data.get(i);
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "nd.ad(" + ')');
        }
    }

    void add(Range range, int[] iArr, int i, int i2, int i3) {
        if ((this.this$0.type[range.this$0 * -210812835] & 4) != 0 && range.size * 1149528672 < 0) {
            int $i3 = this.this$0.buffer[-1318036135 * range.this$0] / (FileInfo.data * 498929432);
            while (true) {
                int $i5 = ((-1912611216 + $i3) - (-7733305 * range.field)) / $i3;
                if ($i5 > i2) {
                    break;
                }
                range.data.toString(iArr, i, $i5);
                i += $i5;
                i2 -= $i5;
                range.field = ((($i5 * $i3) - Helper.MB) * 355602935) + range.field;
                $i5 = (499303597 * FileInfo.data) / -1396891203;
                int $i4 = 262144 / $i3;
                if ($i4 >= $i5) {
                    $i4 = $i5;
                }
                Address $r5 = range.data;
                if (this.this$0.data[range.this$0 * 1829364743] == 0) {
                    range.data = Address.equals(range.next, $r5.getKey(), $r5.getValue(), $r5.length());
                } else {
                    range.data = Address.equals(range.next, $r5.getKey(), 0, $r5.length());
                    this.this$0.toString(range, range.current.data[-133068659 * range.length] < (short) 0, 968894970);
                    range.data.equals($i4, $r5.getValue());
                }
                if (range.current.data[-457021831 * range.length] < (short) 0) {
                    range.data.equals(-1);
                }
                $r5.toString($i4);
                $r5.toString(iArr, i, i3 - i);
                if ($r5.equals()) {
                    Field $r10 = this.head;
                    $r10.equals($r5);
                }
            }
            int $i0 = range.field + (($i3 * i2) * -1564725914);
            i3 = $i0;
            range.field = $i0;
        }
        range.data.toString(iArr, i, i2);
    }

    protected int clear() {
        return 0;
    }

    protected Entry contains() {
        Range $r4 = (Range) this.next.get();
        return $r4 == null ? null : $r4.data != null ? $r4.data : get();
    }

    void equals(Range range, int $i0) {
        boolean $z0 = false;
        if ((this.this$0.type[range.this$0 * 1829364743] & 4) != 0 && -1027449183 * range.size < 0) {
            int $i1 = this.this$0.buffer[range.this$0 * 1829364743] / (1688035177 * FileInfo.data);
            int $i2 = (($i1 + 1048575) - (range.field * -7733305)) / $i1;
            range.field = (((range.field * -7733305) + ($i1 * $i0)) & 1048575) * 355602935;
            if ($i2 <= $i0) {
                if (this.this$0.data[range.this$0 * 1829364743] == 0) {
                    range.data = Address.equals(range.next, range.data.getKey(), range.data.getValue(), range.data.length());
                } else {
                    range.data = Address.equals(range.next, range.data.getKey(), 0, range.data.length());
                    Window $r2 = this.this$0;
                    if (range.current.data[range.length * 2078821397] < (short) 0) {
                        $z0 = true;
                    }
                    $r2.toString(range, $z0, 1281340655);
                }
                if (range.current.data[range.length * 2078821397] < (short) 0) {
                    range.data.equals(-1);
                }
                $i0 = (range.field * -7733305) / $i1;
            }
        }
        range.data.get($i0);
    }

    protected int fill() {
        return 0;
    }

    protected Entry get() {
        Range $r3;
        do {
            try {
                $r3 = (Range) this.next.next();
                if ($r3 == null) {
                    return null;
                }
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "nd.as(" + ')');
            }
        } while ($r3.data == null);
        return $r3.data;
    }

    protected void get(int i) {
        try {
            this.head.get(i);
            Range $r4 = (Range) this.next.get();
            while ($r4 != null) {
                if (!this.this$0.get($r4, 2128488874)) {
                    int $i1 = i;
                    do {
                        int $i2 = $r4.value * 400280827;
                        int i2 = $i2;
                        if ($i1 <= $i2) {
                            add($r4, $i1, 935080145);
                            $r4.value -= 1463180851 * $i1;
                            break;
                        }
                        add($r4, $r4.value * 400280827, 493483648);
                        $i2 = $r4.value * 400280827;
                        i2 = $i2;
                        $i1 -= $i2;
                    } while (!this.this$0.add($r4, null, 0, $i1, (byte) -19));
                }
                $r4 = (Range) this.next.next();
            }
        } catch (Throwable $r6) {
            throw StringBuilder.append($r6, "nd.aq(" + ')');
        }
    }

    protected Entry getEntry() {
        Range $r4;
        do {
            $r4 = (Range) this.next.next();
            if ($r4 == null) {
                return null;
            }
        } while ($r4.data == null);
        return $r4.data;
    }

    protected int getType() {
        return 0;
    }

    protected Entry indexOf() {
        Range $r4 = (Range) this.next.get();
        return $r4 == null ? null : $r4.data != null ? $r4.data : get();
    }

    protected int isEmpty() {
        return 0;
    }

    protected int open() {
        return 0;
    }

    protected void parse(int i) {
        this.head.get(i);
        Range $r4 = (Range) this.next.get();
        while ($r4 != null) {
            if (!this.this$0.get($r4, 2099743320)) {
                int $i1 = i;
                while ($i1 > 400280827 * $r4.value) {
                    add($r4, $r4.value * 2013655420, 996152955);
                    int $i2 = $r4.value * -1135059325;
                    int i2 = $i2;
                    $i1 -= $i2;
                    if (this.this$0.add($r4, null, 0, $i1, (byte) -5)) {
                        break;
                    }
                }
                add($r4, $i1, 1212493034);
                $r4.value -= 1463180851 * $i1;
            }
            $r4 = (Range) this.next.next();
        }
    }

    protected void process(int i) {
        this.head.get(i);
        Range $r4 = (Range) this.next.get();
        while ($r4 != null) {
            if (!this.this$0.get($r4, 2146331184)) {
                int $i2 = i;
                do {
                    int $i1 = $r4.value * 400280827;
                    int i2 = $i1;
                    if ($i2 <= $i1) {
                        add($r4, $i2, -1232366641);
                        $r4.value -= 1463180851 * $i2;
                        break;
                    }
                    add($r4, $r4.value * 400280827, 947071426);
                    $i1 = $r4.value * -1625207244;
                    i2 = $i1;
                    $i2 -= $i1;
                } while (!this.this$0.add($r4, null, 0, $i2, (byte) -72));
            }
            $r4 = (Range) this.next.next();
        }
    }

    protected Entry remove() {
        Range $r4 = (Range) this.next.get();
        return $r4 == null ? null : $r4.data != null ? $r4.data : get();
    }

    protected void run(int i) {
        this.head.get(i);
        Range $r4 = (Range) this.next.get();
        while ($r4 != null) {
            if (!this.this$0.get($r4, 2115287327)) {
                int $i1 = i;
                do {
                    int $i2 = $r4.value * 400280827;
                    int i2 = $i2;
                    if ($i1 <= $i2) {
                        add($r4, $i1, 2100422404);
                        $r4.value -= 1463180851 * $i1;
                        break;
                    }
                    add($r4, $r4.value * 400280827, -297782653);
                    $i2 = $r4.value * 400280827;
                    i2 = $i2;
                    $i1 -= $i2;
                } while (!this.this$0.add($r4, null, 0, $i1, (byte) -50));
            }
            $r4 = (Range) this.next.next();
        }
    }

    protected void run(int[] iArr, int i, int i2) {
        this.head.toString(iArr, i, i2);
        Range $r5 = (Range) this.next.get();
        while ($r5 != null) {
            if (!this.this$0.get($r5, 2129014416)) {
                int i3 = i2;
                int i4 = i;
                while (i3 > $r5.value * 400280827) {
                    toString($r5, iArr, i4, $r5.value * 400280827, i3 + i4, -963378828);
                    i4 += $r5.value * 400280827;
                    i3 -= $r5.value * 400280827;
                    if (this.this$0.add($r5, iArr, i4, i3, (byte) -66)) {
                        break;
                    }
                }
                toString($r5, iArr, i4, i3, i4 + i3, 1184678719);
                $r5.value -= 1463180851 * i3;
            }
            $r5 = (Range) this.next.next();
        }
    }

    void set(Range range, int $i0) {
        boolean $z0 = false;
        if ((this.this$0.type[range.this$0 * 1829364743] & 4) != 0 && -1027449183 * range.size < 0) {
            int $i1 = this.this$0.buffer[range.this$0 * 1829364743] / (1688035177 * FileInfo.data);
            int $i2 = (($i1 + 1048575) - (range.field * -7733305)) / $i1;
            range.field = (((range.field * -7733305) + ($i1 * $i0)) & 1048575) * 355602935;
            if ($i2 <= $i0) {
                if (this.this$0.data[range.this$0 * 1829364743] == 0) {
                    range.data = Address.equals(range.next, range.data.getKey(), range.data.getValue(), range.data.length());
                } else {
                    range.data = Address.equals(range.next, range.data.getKey(), 0, range.data.length());
                    Window $r2 = this.this$0;
                    if (range.current.data[range.length * 2078821397] < (short) 0) {
                        $z0 = true;
                    }
                    $r2.toString(range, $z0, 152870155);
                }
                if (range.current.data[range.length * 2078821397] < (short) 0) {
                    range.data.equals(-1);
                }
                $i0 = (range.field * -7733305) / $i1;
            }
        }
        range.data.get($i0);
    }

    protected Entry size() {
        try {
            Range $r3 = (Range) this.next.get();
            return $r3 == null ? null : $r3.data != null ? $r3.data : get();
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "nd.ay(" + ')');
        }
    }

    protected Entry toArray() {
        Range $r4;
        do {
            $r4 = (Range) this.next.next();
            if ($r4 == null) {
                return null;
            }
        } while ($r4.data == null);
        return $r4.data;
    }

    void toString(Range range, int $i0) {
        boolean $z0 = false;
        if ((this.this$0.type[range.this$0 * 1829364743] & 4) != 0 && -1027449183 * range.size < 0) {
            int $i1 = this.this$0.buffer[range.this$0 * 1829364743] / (823084447 * FileInfo.data);
            int $i2 = (($i1 + 1048575) - (range.field * -7733305)) / $i1;
            range.field = (((range.field * 241453909) + ($i1 * $i0)) & 1048575) * 355602935;
            if ($i2 <= $i0) {
                if (this.this$0.data[range.this$0 * -16558608] == 0) {
                    range.data = Address.equals(range.next, range.data.getKey(), range.data.getValue(), range.data.length());
                } else {
                    range.data = Address.equals(range.next, range.data.getKey(), 0, range.data.length());
                    Window $r2 = this.this$0;
                    if (range.current.data[2078821397 * range.length] < (short) 0) {
                        $z0 = true;
                    }
                    $r2.toString(range, $z0, 1644331504);
                }
                if (range.current.data[range.length * 332287890] < (short) 0) {
                    range.data.equals(-1);
                }
                $i0 = (range.field * -7733305) / $i1;
            }
        }
        range.data.get($i0);
    }

    void toString(Range range, int[] iArr, int i, int i2, int i3) {
        if ((this.this$0.type[range.this$0 * 1829364743] & 4) != 0 && range.size * -1027449183 < 0) {
            int $i3 = this.this$0.buffer[1829364743 * range.this$0] / (FileInfo.data * 1688035177);
            while (true) {
                int $i5 = ((1048575 + $i3) - (-7733305 * range.field)) / $i3;
                if ($i5 > i2) {
                    break;
                }
                range.data.toString(iArr, i, $i5);
                i += $i5;
                i2 -= $i5;
                range.field = ((($i5 * $i3) - Helper.MB) * 355602935) + range.field;
                $i5 = (1688035177 * FileInfo.data) / 100;
                int $i4 = 262144 / $i3;
                if ($i4 >= $i5) {
                    $i4 = $i5;
                }
                Address $r5 = range.data;
                if (this.this$0.data[range.this$0 * 1829364743] == 0) {
                    range.data = Address.equals(range.next, $r5.getKey(), $r5.getValue(), $r5.length());
                } else {
                    range.data = Address.equals(range.next, $r5.getKey(), 0, $r5.length());
                    this.this$0.toString(range, range.current.data[2078821397 * range.length] < (short) 0, 1515915831);
                    range.data.equals($i4, $r5.getValue());
                }
                if (range.current.data[2078821397 * range.length] < (short) 0) {
                    range.data.equals(-1);
                }
                $r5.toString($i4);
                $r5.toString(iArr, i, i3 - i);
                if ($r5.equals()) {
                    this.head.equals($r5);
                }
            }
            int $i0 = range.field + (($i3 * i2) * 355602935);
            i3 = $i0;
            range.field = $i0;
        }
        range.data.toString(iArr, i, i2);
    }

    void toString(Range range, int[] iArr, int i, int i2, int i3, int i4) {
        try {
            if ((this.this$0.type[range.this$0 * 1829364743] & 4) != 0) {
                if (range.size * -1027449183 < 0) {
                    i4 = this.this$0.buffer[1829364743 * range.this$0] / (FileInfo.data * 1688035177);
                    while (true) {
                        int $i5 = ((1048575 + i4) - (-7733305 * range.field)) / i4;
                        if ($i5 > i2) {
                            break;
                        }
                        range.data.toString(iArr, i, $i5);
                        i += $i5;
                        i2 -= $i5;
                        range.field = ((($i5 * i4) - Helper.MB) * 355602935) + range.field;
                        int $i4 = (1688035177 * FileInfo.data) / 100;
                        $i5 = 262144 / i4;
                        if ($i5 < $i4) {
                            $i4 = $i5;
                        }
                        Address $r5 = range.data;
                        if (this.this$0.data[range.this$0 * 1829364743] == 0) {
                            range.data = Address.equals(range.next, $r5.getKey(), $r5.getValue(), $r5.length());
                        } else {
                            range.data = Address.equals(range.next, $r5.getKey(), 0, $r5.length());
                            this.this$0.toString(range, range.current.data[2078821397 * range.length] < (short) 0, 1991506304);
                            range.data.equals($i4, $r5.getValue());
                        }
                        if (range.current.data[2078821397 * range.length] < (short) 0) {
                            range.data.equals(-1);
                        }
                        $r5.toString($i4);
                        $r5.toString(iArr, i, i3 - i);
                        if ($r5.equals()) {
                            Field $r10 = this.head;
                            $r10.equals($r5);
                        }
                    }
                    int $i0 = range.field + ((i4 * i2) * 355602935);
                    i3 = $i0;
                    range.field = $i0;
                }
            }
            range.data.toString(iArr, i, i2);
        } catch (Throwable $r11) {
            throw StringBuilder.append($r11, "nd.af(" + ')');
        }
    }

    protected void toString(int[] iArr, int i, int i2) {
        try {
            this.head.toString(iArr, i, i2);
            Range $r5 = (Range) this.next.get();
            while ($r5 != null) {
                if (!this.this$0.get($r5, 2113374893)) {
                    int $i5 = i2;
                    int $i4 = i;
                    do {
                        if ($i5 <= 400280827 * $r5.value) {
                            toString($r5, iArr, $i4, $i5, $i4 + $i5, 1468460752);
                            $r5.value -= 1463180851 * $i5;
                            break;
                        }
                        toString($r5, iArr, $i4, $r5.value * 400280827, $i5 + $i4, -276428272);
                        $i4 += $r5.value * 400280827;
                        $i5 -= $r5.value * 400280827;
                    } while (!this.this$0.add($r5, iArr, $i4, $i5, (byte) -123));
                }
                $r5 = (Range) this.next.next();
            }
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "nd.aj(" + ')');
        }
    }
}
