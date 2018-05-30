package p000;

/* compiled from: bi */
public abstract class Point {
    static final int Id_pow = 14;
    static final int TextView_drawableTop = 50;
    public static final int[] count = new int[PingManager.STATE_SENSOR_ON_FLAG];
    static final int[] f196i = new int[Constants.ACC_STRICT];
    static HttpRequest name;
    public static StatusLine type;
    public static final int[] f197x = new int[Constants.ACC_STRICT];
    public static final int[] f198y = new int[Constants.ACC_STRICT];
    static final int[] f199z = new int[512];
    int f200b;
    int buffer;
    boolean f201c;
    int data;
    int header;
    int height;
    int index;
    int key;
    int length;
    int limit;
    int[] next;
    int offset;
    int parent;
    boolean pos;
    int position;
    boolean f202s;
    int size;
    int this$0;
    int total;
    boolean value;
    int width;

    Point() {
        this.total = 0;
        this.limit = 0;
        this.offset = 0;
        this.position = 0;
        this.f201c = false;
        this.pos = false;
        this.value = false;
        this.f202s = true;
        this.f200b = 0;
        this.this$0 = 527384064;
        this.next = new int[1024];
        int $i2 = 1;
        while ($i2 < 512) {
            try {
                f199z[$i2] = 32768 / $i2;
                $i2++;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "bi.<init>(" + ')');
            }
        }
        for (int $i0 = 1; $i0 < Constants.ACC_STRICT; $i0++) {
            f196i[$i0] = PingManager.STATE_SENSOR_ON_FLAG / $i0;
        }
        for (int $i1 = 0; $i1 < Constants.ACC_STRICT; $i1++) {
            f197x[$i1] = (int) (Math.sin(((double) $i1) * 0.0030679615d) * 65536.0d);
            f198y[$i1] = (int) (Math.cos(((double) $i1) * 0.0030679615d) * 65536.0d);
        }
    }

    public static final int apply(int $i0, double $d0) {
        double $d2 = ((double) (($i0 >> 8) & 854314870)) / 256.0d;
        double $d3 = ((double) (-1081416802 & $i0)) / 256.0d;
        double $d1 = Math.pow(((double) (($i0 >> 16) & -1446682249)) / 256.0d, $d0);
        int $i2 = (int) ($d1 * 256.0d);
        return ((($i2 << 16) + (((int) (Math.pow($d2, $d0) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow($d3, $d0)))) | (-16777216 & $i0);
    }

    static final int apply(int $i0, int $i1, int i, int i2) {
        return (($i0 * i) - (i2 * $i1)) >> 16;
    }

    static final int divide(int $i0, int $i1, int i, int i2) {
        return (($i0 * i) - (i2 * $i1)) >> 16;
    }

    static final void get(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 >= 1 && i4 >= 1 && i3 <= 102 && i4 <= 102 && (!client.LOG || i == Msg.size * -1674539149)) {
            long $l8 = 0;
            if (i2 == 0) {
                try {
                    $l8 = OrgFile.this$0.append(i, i3, i4);
                } catch (Throwable $r7) {
                    throw StringBuilder.append($r7, "bi.dp(" + ')');
                }
            }
            if (1 == i2) {
                $l8 = OrgFile.this$0.getType(i, i3, i4);
            }
            if (i2 == 2) {
                $l8 = OrgFile.this$0.next(i, i3, i4);
            }
            if (3 == i2) {
                $l8 = OrgFile.this$0.get(i, i3, i4);
            }
            if (0 != $l8) {
                Transaction $r1;
                int $i10 = OrgFile.this$0.toString(i, i3, i4, $l8);
                i8 = Method.get($l8);
                int $i11 = $i10 & 31;
                $i10 = ($i10 >> 6) & 3;
                if (i2 == 0) {
                    OrgFile.this$0.close(i, i3, i4);
                    $r1 = BigInteger.get(i8, 2034210210);
                    if (-1655214851 * $r1.count != 0) {
                        client.value[i].read(i3, i4, $i11, $i10, $r1.index, 1224014431);
                    }
                }
                if (1 == i2) {
                    OrgFile.this$0.error(i, i3, i4);
                }
                if (i2 == 2) {
                    OrgFile.this$0.add(i, i3, i4);
                    $r1 = BigInteger.get(i8, 1490000479);
                    int $i112 = $r1.this$0 * -265754695;
                    $i11 = $i112;
                    if ($i112 + i3 <= 103) {
                        $i112 = $r1.this$0 * -265754695;
                        $i11 = $i112;
                        if ($i112 + i4 <= 103) {
                            $i112 = $r1.offset * -344743753;
                            $i11 = $i112;
                            if ($i112 + i3 <= 103) {
                                $i112 = $r1.offset * -344743753;
                                $i11 = $i112;
                                if ($i112 + i4 <= 103) {
                                    if ($r1.count * -1655214851 != 0) {
                                        Context $r3 = client.value[i];
                                        $i11 = -265754695 * $r1.this$0;
                                        int $i12 = -344743753 * $r1.offset;
                                        $r3.encode(i3, i4, $i11, $i12, $i10, $r1.index, -290516790);
                                    }
                                }
                            }
                        }
                    }
                }
                if (i2 == 3) {
                    OrgFile.this$0.log(i, i3, i4);
                    if (1 == BigInteger.get(i8, 1679687885).count * -1655214851) {
                        client.value[i].toString(i3, i4, (byte) -1);
                    }
                }
            }
            if (i5 >= 0) {
                if (i < 3) {
                    if ((byte) 2 == (Chart.size[1][i3][i4] & (byte) 2)) {
                        i2 = i + 1;
                        Short.add(i, i2, i3, i4, i5, i6, i7, OrgFile.this$0, client.value[i], -852998796);
                    }
                }
                i2 = i;
                Short.add(i, i2, i3, i4, i5, i6, i7, OrgFile.this$0, client.value[i], -852998796);
            }
        }
    }

    public static final int multiply(int $i0, double $d0) {
        double $d2 = ((double) (($i0 >> 8) & 255)) / 256.0d;
        double $d3 = ((double) (145300189 & $i0)) / 256.0d;
        double $d1 = Math.pow(((double) (($i0 >> 16) & 255)) / 256.0d, $d0);
        int $i2 = (int) ($d1 * 256.0d);
        return ((($i2 << 16) + (((int) (Math.pow($d2, $d0) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow($d3, $d0)))) | (980901593 & $i0);
    }

    static final int multiply(int i, int i2) {
        int $i2 = 126;
        i2 = ((-734173598 & i) * i2) >> 7;
        if (i2 < 2) {
            $i2 = 2;
        } else if (i2 <= 126) {
            $i2 = i2;
        }
        return $i2 + (65408 & i);
    }

    static final int multiply(int $i0, int $i1, int i, int i2) {
        return ((i * $i0) + (i2 * $i1)) >> 16;
    }

    public static final int set(int $i0, double $d0) {
        double $d2 = ((double) (($i0 >> 8) & 255)) / 256.0d;
        double $d3 = ((double) ($i0 & 255)) / 256.0d;
        double $d1 = Math.pow(((double) (($i0 >> 16) & 255)) / 256.0d, $d0);
        int $i2 = (int) ($d1 * 256.0d);
        return ((($i2 << 16) + (((int) (Math.pow($d2, $d0) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow($d3, $d0)))) | (1877689999 & $i0);
    }

    public static final void set(StatusLine statusLine) {
        type = statusLine;
    }

    public static final void setY(StatusLine statusLine) {
        type = statusLine;
    }

    public static final int toString(int $i0, double $d0) {
        double $d2 = ((double) (($i0 >> 8) & 255)) / 256.0d;
        double $d3 = ((double) (-2066063016 & $i0)) / 256.0d;
        double $d1 = Math.pow(((double) (($i0 >> 16) & -2038232085)) / 256.0d, $d0);
        int $i2 = (int) ($d1 * 256.0d);
        return ((($i2 << 16) + (((int) (Math.pow($d2, $d0) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow($d3, $d0)))) | (-16777216 & $i0);
    }

    static final int translate(int $i0, int $i1, int i, int i2) {
        return ((i * $i0) + (i2 * $i1)) >> 16;
    }

    public static final int update(int $i0, double $d0) {
        double $d2 = ((double) (($i0 >> 8) & 255)) / 256.0d;
        double $d3 = ((double) ($i0 & 255)) / 256.0d;
        double $d1 = Math.pow(((double) (($i0 >> 16) & 255)) / 256.0d, $d0);
        int $i2 = (int) ($d1 * 256.0d);
        return ((($i2 << 16) + (((int) (Math.pow($d2, $d0) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow($d3, $d0)))) | (-16777216 & $i0);
    }

    public static final void update(double d) {
        d += (Math.random() * 0.03d) - 0.015d;
        int $i0 = 0;
        for (int $i1 = 0; $i1 < 512; $i1++) {
            double $d1 = (((double) ($i1 >> 3)) / 64.0d) + 0.0078125d;
            double $d2 = (((double) ($i1 & 7)) / 8.0d) + 0.0625d;
            int $i2 = 0;
            while ($i2 < Constants.f93X) {
                double d2;
                double $d5;
                double $d3 = ((double) $i2) / 128.0d;
                if (0.0d != $d2) {
                    double $d7;
                    double d3;
                    d2 = $d3 < 0.5d ? (1.0d + $d2) * $d3 : ($d2 + $d3) - ($d3 * $d2);
                    $d3 = ($d3 * 2.0d) - d2;
                    $d5 = 0.3333333333333333d + $d1;
                    double $d6 = $d5 > 1.0d ? $d5 - 1.0d : $d5;
                    $d5 = $d1 - 0.3333333333333333d;
                    if ($d5 < 0.0d) {
                        $d5 += 1.0d;
                    }
                    $d6 = 6.0d * $d6 < 1.0d ? $d3 + ((6.0d * (d2 - $d3)) * $d6) : 2.0d * $d6 < 1.0d ? d2 : 3.0d * $d6 < 2.0d ? $d3 + (((d2 - $d3) * (0.6666666666666666d - $d6)) * 6.0d) : $d3;
                    if (6.0d * $d1 < 1.0d) {
                        $d7 = (d2 - $d3) * 6.0d;
                        d3 = $d7;
                        $d7 *= $d1;
                        d3 = $d7;
                        d3 = $d7 + $d3;
                    } else {
                        d3 = 2.0d * $d1 < 1.0d ? d2 : 3.0d * $d1 < 2.0d ? (6.0d * ((d2 - $d3) * (0.6666666666666666d - $d1))) + $d3 : $d3;
                    }
                    if (6.0d * $d5 < 1.0d) {
                        $d7 = (d2 - $d3) * 6.0d;
                        d2 = $d7;
                        $d7 *= $d5;
                        d2 = $d7;
                        $d3 += $d7;
                        d2 = d3;
                        $d5 = $d6;
                    } else if (2.0d * $d5 < 1.0d) {
                        $d3 = d2;
                        d2 = d3;
                        $d5 = $d6;
                    } else if (3.0d * $d5 < 2.0d) {
                        $d7 = ((d2 - $d3) * (0.6666666666666666d - $d5)) * 6.0d;
                        d2 = $d7;
                        $d3 += $d7;
                        d2 = d3;
                        $d5 = $d6;
                    } else {
                        d2 = d3;
                        $d5 = $d6;
                    }
                } else {
                    d2 = $d3;
                    $d5 = $d3;
                }
                int $i4 = $d5 * 256.0d;
                long j = $i4;
                int $i42 = (int) $i4;
                $i4 = d2 * 256.0d;
                long j2 = $i4;
                $i4 = ((int) ($d3 * 256.0d)) + ((((int) $i4) << 8) + ($i42 << 16));
                int i = $i4;
                $i42 = Hashtable.get($i4, d);
                i = $i42;
                if ($i42 == 0) {
                    i = 1;
                }
                count[$i0] = i;
                $i2++;
                $i0++;
            }
        }
    }

    public final void add(byte b) {
        try {
            this.data = ((784773023 * this.buffer) / 2) * 2004168453;
            this.parent = 240863897 * ((this.length * -1759402563) / 2);
            this.key = -(this.data * 222871323);
            this.index = (this.buffer * -252416693) - (2011356561 * this.data);
            this.height = -(501170457 * this.parent);
            this.width = (-523764989 * this.length) - (24574999 * this.parent);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bi.bp(" + ')');
        }
    }

    public final void add(int $i0, int i) {
        int $i3 = this.next[0];
        int $i4 = $i3 / (this.size * -1741252353);
        this.data = ($i0 - ($i3 - ((-1910069581 * this.size) * $i4))) * 1971172540;
        this.parent = (i - $i4) * 240863897;
        this.key = -(this.data * -999761740);
        this.index = (this.buffer * -252416693) - (-1435708826 * this.data);
        this.height = -(this.parent * 501170457);
        this.width = (-523764989 * this.length) - (24574999 * this.parent);
    }

    public final void add(int $i0, int i, byte b) {
        try {
            int $i3 = this.next[0];
            int $i4 = $i3 / (this.size * -1741252353);
            this.data = ($i0 - ($i3 - ((this.size * -1741252353) * $i4))) * 2004168453;
            this.parent = (i - $i4) * 240863897;
            this.key = -(this.data * 222871323);
            this.index = (this.buffer * -252416693) - (2011356561 * this.data);
            this.height = -(this.parent * 501170457);
            this.width = (-523764989 * this.length) - (24574999 * this.parent);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bi.bx(" + ')');
        }
    }

    void add(int $i0, int $i1, int $i2, int i) {
        this.buffer = 1006283871 * ($i2 - $i0);
        this.length = -1589321638 * (i - $i1);
        add((byte) 19);
        if (this.next.length < -1376519472 * this.length) {
            $i2 = (this.length * -1759402563) - 1;
            $i2 |= $i2 >>> 1;
            $i2 |= $i2 >>> 2;
            $i2 |= $i2 >>> 4;
            $i2 |= $i2 >>> 8;
            this.next = new int[(($i2 | ($i2 >>> 16)) + 1)];
        }
        $i0 += (this.size * -1741252353) * $i1;
        for ($i1 = 0; $i1 < this.length * -813714580; $i1++) {
            this.next[$i1] = $i0;
            $i0 += this.size * -1741252353;
        }
    }

    public final void add(int $i1, int $i2, int $i3, int $i4, byte b) {
        if ($i1 < 0) {
            $i1 = 0;
        }
        if ($i2 < 0) {
            $i2 = 0;
        }
        try {
            if ($i3 > this.size * -1741252353) {
                $i3 = -1741252353 * this.size;
            }
            if ($i4 > this.header * -163842587) {
                $i4 = -163842587 * this.header;
            }
            this.offset = -1579568447 * $i1;
            this.total = 714299273 * $i2;
            this.position = -851208251 * $i3;
            this.limit = 1644395011 * $i4;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bi.bf(" + ')');
        }
    }

    public final void copy() {
        put(-1916381655 * this.offset, this.total * 797593273, 1896206093 * this.position, 77705503 * this.limit, (byte) 58);
    }

    public abstract void get();

    public abstract void get(int i);

    public void get(int i, int i2) {
        try {
            open(i, -2012494136);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bi.an(" + ')');
        }
    }

    public void getSize(int i) {
        open(i, 1233093029);
    }

    public abstract void init();

    public final void insert(int $i0, int i) {
        int $i2 = this.next[0];
        int $i3 = $i2 / (this.size * -1741252353);
        this.data = ($i0 - ($i2 - ((this.size * -1741252353) * $i3))) * 2004168453;
        this.parent = (i - $i3) * 240863897;
        this.key = -(this.data * 222871323);
        this.index = (this.buffer * -252416693) - (2011356561 * this.data);
        this.height = -(this.parent * 501170457);
        this.width = (-523764989 * this.length) - (24574999 * this.parent);
    }

    public void move(int i, int i2, int i3) {
        boolean $z0 = i < 0 || i > 595856860 * this.buffer || i2 < 0 || i2 > -2115352327 * this.buffer || i3 < 0 || i3 > this.buffer * 784773023;
        this.f201c = $z0;
    }

    public final int multiply() {
        return 1351300758 * this.this$0;
    }

    public final int multiply(int i) {
        try {
            return 542614623 * this.this$0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bi.bg(" + ')');
        }
    }

    public final void open(int $i0, int i) {
        try {
            this.this$0 = -829442145 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bi.bz(" + ')');
        }
    }

    void put(int $i0, int $i1, int $i2, int i) {
        this.buffer = 1006283871 * ($i2 - $i0);
        this.length = 2015804821 * (i - $i1);
        add((byte) 49);
        if (this.next.length < this.length * -1759402563) {
            $i2 = (this.length * -1759402563) - 1;
            $i2 |= $i2 >>> 1;
            $i2 |= $i2 >>> 2;
            $i2 |= $i2 >>> 4;
            $i2 |= $i2 >>> 8;
            this.next = new int[(($i2 | ($i2 >>> 16)) + 1)];
        }
        $i0 += (this.size * -1741252353) * $i1;
        for ($i1 = 0; $i1 < this.length * -1759402563; $i1++) {
            this.next[$i1] = $i0;
            $i0 += this.size * -1741252353;
        }
    }

    void put(int $i0, int $i1, int $i2, int i, byte b) {
        this.buffer = 1006283871 * ($i2 - $i0);
        this.length = 2015804821 * (i - $i1);
        add((byte) 46);
        if (this.next.length < this.length * -1759402563) {
            $i2 = (this.length * -1759402563) - 1;
            $i2 |= $i2 >>> 1;
            $i2 |= $i2 >>> 2;
            $i2 |= $i2 >>> 4;
            $i2 |= $i2 >>> 8;
            this.next = new int[(($i2 | ($i2 >>> 16)) + 1)];
        }
        $i0 += (this.size * -1741252353) * $i1;
        $i1 = 0;
        while ($i1 < this.length * -1759402563) {
            try {
                this.next[$i1] = $i0;
                $i0 += this.size * -1741252353;
                $i1++;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "bi.ad(" + ')');
            }
        }
    }

    public final void read(boolean z, int i) {
        try {
            this.f202s = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bi.bh(" + ')');
        }
    }

    public final void reset(int $i0, int $i1, int $i2, int $i3) {
        if ($i0 < 0) {
            $i0 = 0;
        }
        if ($i1 < 0) {
            $i1 = 0;
        }
        if ($i2 > this.size * -1741252353) {
            $i2 = -1741252353 * this.size;
        }
        if ($i3 > -163842587 * this.header) {
            $i3 = -493271067 * this.header;
        }
        this.offset = 413658996 * $i0;
        this.total = 714299273 * $i1;
        this.position = -851208251 * $i2;
        this.limit = -2097957343 * $i3;
    }

    public final void set() {
        this.data = ((784773023 * this.buffer) / 2) * 2004168453;
        this.parent = 240863897 * ((this.length * -1759402563) / 2);
        this.key = -(this.data * 222871323);
        this.index = (this.buffer * -252416693) - (2011356561 * this.data);
        this.height = -(501170457 * this.parent);
        this.width = (-1994895642 * this.length) - (24574999 * this.parent);
    }

    public void set(int i) {
        open(i, -531112868);
    }

    public final void set(int $i0, int i) {
        int $i2 = this.next[0];
        int $i3 = $i2 / (this.size * -1741252353);
        this.data = ($i0 - ($i2 - ((this.size * -1741252353) * $i3))) * 2004168453;
        this.parent = (i - $i3) * 240863897;
        this.key = -(this.data * 222871323);
        this.index = (this.buffer * -252416693) - (2011356561 * this.data);
        this.height = -(this.parent * 501170457);
        this.width = (-523764989 * this.length) - (24574999 * this.parent);
    }

    public void set(int i, int i2, int i3) {
        boolean $z0 = i < 0 || i > this.buffer * 784773023 || i2 < 0 || i2 > this.buffer * 784773023 || i3 < 0 || i3 > this.buffer * 784773023;
        this.f201c = $z0;
    }

    void set(int $i0, int $i1, int $i2, int i) {
        this.buffer = -993272143 * ($i2 - $i0);
        this.length = -249093371 * (i - $i1);
        add((byte) -16);
        if (this.next.length < this.length * -1759402563) {
            $i2 = (this.length * 823525845) - 1;
            $i2 |= $i2 >>> 1;
            $i2 |= $i2 >>> 2;
            $i2 |= $i2 >>> 4;
            $i2 |= $i2 >>> 8;
            this.next = new int[(($i2 | ($i2 >>> 16)) + 1)];
        }
        $i0 += (this.size * -1473647897) * $i1;
        for ($i1 = 0; $i1 < this.length * -1759402563; $i1++) {
            this.next[$i1] = $i0;
            $i0 += this.size * -91504289;
        }
    }

    public final void set(boolean z) {
        this.f202s = z;
    }

    public final void setLocation(boolean z) {
        this.f202s = z;
    }

    public final void setRow(int $i0) {
        this.this$0 = 2070207686 * $i0;
    }

    public final void toString(int i) {
        try {
            put(-1213604543 * this.offset, this.total * 797593273, 1896206093 * this.position, 1625587883 * this.limit, (byte) 108);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bi.bv(" + ')');
        }
    }

    public void toString(int i, int i2, int i3, int i4) {
        boolean $z0;
        if (i >= 0) {
            try {
                if (i <= this.buffer * 784773023 && i2 >= 0) {
                    if (i2 <= this.buffer * 784773023 && i3 >= 0) {
                        if (i3 <= this.buffer * 784773023) {
                            $z0 = false;
                            this.f201c = $z0;
                        }
                    }
                }
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "bi.bt(" + ')');
            }
        }
        $z0 = true;
        this.f201c = $z0;
    }

    public final int translate() {
        return 542614623 * this.this$0;
    }

    public final void translate(boolean z) {
        this.f202s = z;
    }

    public final void update(int $i0, int $i1, int $i2, int $i3) {
        if ($i0 < 0) {
            $i0 = 0;
        }
        if ($i1 < 0) {
            $i1 = 0;
        }
        if ($i2 > this.size * -1741252353) {
            $i2 = 1998956076 * this.size;
        }
        if ($i3 > -163842587 * this.header) {
            $i3 = -84530768 * this.header;
        }
        this.offset = -1579568447 * $i0;
        this.total = 714299273 * $i1;
        this.position = -851208251 * $i2;
        this.limit = 1644395011 * $i3;
    }

    public final void write(int $i0, int $i1, int $i2, int $i3) {
        if ($i0 < 0) {
            $i0 = 0;
        }
        if ($i1 < 0) {
            $i1 = 0;
        }
        if ($i2 > this.size * -1741252353) {
            $i2 = -1715784827 * this.size;
        }
        if ($i3 > this.header * -163842587) {
            $i3 = -163842587 * this.header;
        }
        this.offset = -1579568447 * $i0;
        this.total = 714299273 * $i1;
        this.position = -1152874927 * $i2;
        this.limit = 1427382878 * $i3;
    }
}
