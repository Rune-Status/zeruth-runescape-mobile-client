package p000;

/* compiled from: hx */
public final class Color extends ArrayMap {
    static final int BLUE1 = 14;
    public static final int RIGHT_M = 48;
    double f81a;
    double f82b;
    double f83c;
    double cache;
    int count;
    JSONArray data;
    int f84g;
    int f85i;
    int index;
    int key;
    int level;
    int f86n;
    int name;
    int next;
    int position;
    int f87r;
    double size;
    int state;
    int this$0;
    boolean top;
    int type;
    double f88v;
    int value;
    double f89x;
    double f90y;

    Color(int $i0, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        try {
            this.top = false;
            this.count = 0;
            this.level = 0;
            this.name = -1813871183 * $i0;
            this.next = 1970509329 * i;
            this.state = -997462911 * i2;
            this.f85i = -50319663 * i3;
            this.f87r = 164853729 * i4;
            this.type = 160215837 * i5;
            this.this$0 = -49632157 * i6;
            this.f84g = 1534922877 * i7;
            this.value = 1493914479 * i8;
            this.key = 1760164925 * i9;
            this.position = -622135637 * i10;
            this.top = false;
            $i0 = HyperlinkRecord.get(this.name * 1182049105, 2145948855).count * 1690052581;
            if ($i0 != -1) {
                this.data = AbstractBuffer.get($i0, 1012142155);
            } else {
                this.data = null;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hx.<init>(" + ')');
        }
    }

    static final void toString(int i) {
        i = 0;
        while (i < -1675758365 * Database.size) {
            try {
                client.size[Database.next[i]].add((byte) 5);
                i++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "hx.fe(" + ')');
            }
        }
        AsyncTask.add((byte) 16);
        if (MyAsyncTask.this$0 != null) {
            MyAsyncTask.this$0.add(-979465386);
        }
    }

    protected final Integer add() {
        Integer $r2 = HyperlinkRecord.get(-671156126 * this.name, 1824137425).get(1248708835 * this.count, -2125569035);
        if ($r2 == null) {
            return null;
        }
        $r2.toString(this.index * -1604612010);
        return $r2;
    }

    final void add(int i) {
        this.top = true;
        this.size += this.f90y * ((double) i);
        this.cache += this.f89x * ((double) i);
        this.f82b += (((double) i) * ((this.f88v * 0.5d) * ((double) i))) + (this.f81a * ((double) i));
        this.f81a += ((double) i) * this.f88v;
        this.f86n = ((((int) (Math.atan2(this.f90y, this.f89x) * 325.949d)) + 1687617630) & 2047) * 468854931;
        this.index = (((int) (Math.atan2(this.f81a, this.f83c) * 325.949d)) & -1085720743) * -796840834;
        if (this.data != null) {
            this.level += i * 946322807;
            while (this.level * -1859769273 > this.data.buffer[-1728927445 * this.count]) {
                this.level -= this.data.buffer[-40430484 * this.count] * 946322807;
                this.count += 1483256510;
                if (-413687252 * this.count >= this.data.size.length) {
                    this.count -= -611962105 * this.data.data;
                    if (this.count * 733371089 < 0 || this.count * 1457084762 >= this.data.size.length) {
                        this.count = 0;
                    }
                }
            }
        }
    }

    final void add(int i, int i2) {
        try {
            this.top = true;
            this.size += this.f90y * ((double) i);
            this.cache += this.f89x * ((double) i);
            this.f82b += (((double) i) * ((this.f88v * 0.5d) * ((double) i))) + (this.f81a * ((double) i));
            this.f81a += ((double) i) * this.f88v;
            int $i1 = (int) (Math.atan2(this.f90y, this.f89x) * 325.949d);
            $i1 += 1024;
            $i1 = ($i1 & 2047) * 468854931;
            i2 = $i1;
            this.f86n = $i1;
            $i1 = (int) (Math.atan2(this.f81a, this.f83c) * 325.949d);
            $i1 = ($i1 & 2047) * 516332499;
            i2 = $i1;
            this.index = $i1;
            if (this.data != null) {
                this.level += i * 946322807;
                while (true) {
                    if (this.level * -1859769273 > this.data.buffer[this.count * 1248708835]) {
                        $i1 = this.level - (this.data.buffer[this.count * 1248708835] * 946322807);
                        i = $i1;
                        this.level = $i1;
                        $i1 = this.count + 299482315;
                        i = $i1;
                        this.count = $i1;
                        if (this.count * 1248708835 >= this.data.size.length) {
                            $i1 = this.count - (-611962105 * this.data.data);
                            i = $i1;
                            this.count = $i1;
                            if (this.count * 1248708835 >= 0) {
                                if (this.count * 1248708835 < this.data.size.length) {
                                    continue;
                                }
                            }
                            this.count = 0;
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hx.ad(" + ')');
        }
    }

    final void add(int i, int i2, int i3, int $i3) {
        double $d1;
        boolean $z0 = this.top;
        Object obj = this;
        if (!$z0) {
            double $d0 = (double) (i - (obj.state * -271559807));
            $d1 = (double) (i2 - (obj.f85i * 678226481));
            double $d2 = Math.sqrt(($d1 * $d1) + ($d0 * $d0));
            obj.size = (($d0 * ((double) (-75273329 * obj.value))) / $d2) + ((double) (-271559807 * obj.state));
            obj.cache = ((((double) (obj.value * -75273329)) * $d1) / $d2) + ((double) (678226481 * obj.f85i));
            obj.f82b = (double) (-1979773919 * obj.f87r);
        }
        $d1 = (double) (((12924235 * obj.this$0) + 1) - $i3);
        obj.f90y = (((double) i) - obj.size) / $d1;
        obj.f89x = (((double) i2) - obj.cache) / $d1;
        obj.f83c = Math.sqrt((obj.f90y * obj.f90y) + (obj.f89x * obj.f89x));
        $z0 = obj.top;
        this = obj;
        if (!$z0) {
            this.f81a = (-this.f83c) * Math.tan(0.02454369d * ((double) (-771692331 * this.f84g)));
        }
        this.f88v = (2.0d * ((((double) i3) - this.f82b) - (this.f81a * $d1))) / ($d1 * $d1);
    }

    final void add(int i, int i2, int i3, int $i3, int i4) {
        try {
            double $d1;
            if (!this.top) {
                double $d0 = (double) (i - (this.state * -271559807));
                $d1 = (double) (i2 - (this.f85i * 678226481));
                double $d2 = Math.sqrt(($d1 * $d1) + ($d0 * $d0));
                this.size = (($d0 * ((double) (-75273329 * this.value))) / $d2) + ((double) (-271559807 * this.state));
                int $i4 = this.value * -75273329;
                i4 = $i4;
                this.cache = ((((double) $i4) * $d1) / $d2) + ((double) (678226481 * this.f85i));
                this.f82b = (double) (-1979773919 * this.f87r);
            }
            $d1 = (double) (((12924235 * this.this$0) + 1) - $i3);
            this.f90y = (((double) i) - this.size) / $d1;
            this.f89x = (((double) i2) - this.cache) / $d1;
            this.f83c = Math.sqrt((this.f90y * this.f90y) + (this.f89x * this.f89x));
            if (!this.top) {
                this.f81a = (-this.f83c) * Math.tan(0.02454369d * ((double) (-771692331 * this.f84g)));
            }
            this.f88v = (2.0d * ((((double) i3) - this.f82b) - (this.f81a * $d1))) / ($d1 * $d1);
        } catch (Throwable $r1) {
            throw StringBuilder.append($r1, "hx.af(" + ')');
        }
    }

    protected final Integer clone() {
        Integer $r2 = HyperlinkRecord.get(1182049105 * this.name, 1734497117).get(1248708835 * this.count, -2117614499);
        if ($r2 == null) {
            return null;
        }
        $r2.toString(this.index * -198609829);
        return $r2;
    }

    protected final Integer read() {
        try {
            Integer $r2 = HyperlinkRecord.get(1182049105 * this.name, 1887057622).get(1248708835 * this.count, -1939193665);
            if ($r2 == null) {
                return null;
            }
            $r2.toString(this.index * -198609829);
            return $r2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hx.ac(" + ')');
        }
    }

    protected final Integer remove() {
        Integer $r2 = HyperlinkRecord.get(1182049105 * this.name, 1996042044).get(1248708835 * this.count, -1766824117);
        if ($r2 == null) {
            return null;
        }
        $r2.toString(this.index * -198609829);
        return $r2;
    }

    protected final Integer write() {
        Integer $r2 = HyperlinkRecord.get(-2075455121 * this.name, 1775593026).get(-1003985489 * this.count, -1954516361);
        if ($r2 == null) {
            return null;
        }
        $r2.toString(this.index * -198609829);
        return $r2;
    }

    final void write(int i) {
        this.top = true;
        this.size += this.f90y * ((double) i);
        this.cache += this.f89x * ((double) i);
        this.f82b += (((double) i) * ((this.f88v * 0.5d) * ((double) i))) + (this.f81a * ((double) i));
        this.f81a += ((double) i) * this.f88v;
        this.f86n = ((((int) (Math.atan2(this.f90y, this.f89x) * 325.949d)) + 1024) & 2047) * 468854931;
        this.index = (((int) (Math.atan2(this.f81a, this.f83c) * 325.949d)) & 2047) * 516332499;
        if (this.data != null) {
            this.level += i * 946322807;
            while (this.level * -1859769273 > this.data.buffer[this.count * 1248708835]) {
                this.level -= this.data.buffer[this.count * 1248708835] * 946322807;
                this.count += 299482315;
                if (this.count * 1248708835 >= this.data.size.length) {
                    this.count -= -611962105 * this.data.data;
                    if (this.count * 1248708835 < 0 || this.count * 1248708835 >= this.data.size.length) {
                        this.count = 0;
                    }
                }
            }
        }
    }
}
