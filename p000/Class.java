package p000;

/* compiled from: kf */
public abstract class Class {
    static final String COMMA = ",";
    static final int N_100 = 100;
    static int f45b = 0;
    static Generator f46g = new Generator();
    int[] context;
    int[] dir;
    int[] id;
    int items;
    int[][] key;
    boolean length;
    Object[][] name;
    boolean pos;
    int[] size;
    Cursor[] state;
    Object[] this$0;
    public int type;
    Cursor uri;
    int[] value;
    int[][] values;

    Class(boolean z, boolean z2) {
        try {
            this.pos = z;
            this.length = z2;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "kf.<init>(" + ')');
        }
    }

    static final byte[] add(byte[] $r0) {
        Logger $r1 = new Logger($r0);
        int $i0 = $r1.get((byte) 0);
        int $i1 = $r1.size(409742183);
        if ($i1 < 0 || (f45b * 1621223447 != 0 && $i1 > f45b * 1621223447)) {
            throw new RuntimeException();
        } else if ($i0 == 0) {
            $r0 = new byte[$i1];
            $r1.add($r0, 0, $i1, 725190012);
            return $r0;
        } else {
            int $i2 = $r1.size(728523580);
            if ($i2 < 0 || (941031566 * f45b != 0 && $i2 > f45b * 1621223447)) {
                throw new RuntimeException();
            }
            byte[] $r4 = new byte[$i2];
            if (1 == $i0) {
                TFloatLinkedList.add($r4, $i2, $r0, $i1, 9);
                return $r4;
            }
            f46g.write($r1, $r4, 91258545);
            return $r4;
        }
    }

    public static String toString(byte[] bArr, int i, int i2, int i3) {
        try {
            char[] $r1 = new char[i2];
            i3 = 0;
            int $i3 = 0;
            while (i3 < i2) {
                int $i4;
                short $s6 = bArr[i + i3] & (short) 255;
                if ($s6 == (short) 0) {
                    $i4 = $i3;
                } else {
                    int $i8;
                    if ($s6 < (short) 128 || $s6 >= (short) 160) {
                        short $i82 = $s6;
                    } else {
                        char $c7 = DirCache.this$0[$s6 - 128];
                        if ($c7 == '\u0000') {
                            $c7 = '?';
                        }
                        $i8 = $c7;
                    }
                    $i4 = $i3 + 1;
                    $r1[$i3] = (char) $i8;
                }
                i3++;
                $i3 = $i4;
            }
            return new String($r1, 0, $i3);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.aa(" + ')');
        }
    }

    static void toString(Item item, boolean z, int i) {
        if (item != null) {
            try {
                if (item.toString(-274436643)) {
                    if (!item.data) {
                        item.state = false;
                        if (((client.LOG && -1675758365 * Database.size > 50) || -1675758365 * Database.size > 200) && z) {
                            if (-629432309 * item.type == 259701737 * item.text) {
                                item.state = true;
                            }
                        }
                        i = (item.size * 516759209) >> 7;
                        int $i1 = (2328865 * item.value) >> 7;
                        if (i >= 0 && i < 104 && $i1 >= 0 && $i1 < 104) {
                            int $i0;
                            long $l3 = Exception.format(0, 0, 0, false, 437122101 * item.f163n, -575776873);
                            if (item.index != null) {
                                if (1581849891 * client.type >= -55133803 * item.current) {
                                    if (client.type * 1581849891 < item.path * -1100434689) {
                                        item.state = false;
                                        $i0 = InputStream.toString(516759209 * item.size, item.value * 2328865, Msg.size * -1674539149, 1873320547) * 1725052319;
                                        i = $i0;
                                        item.value = $i0;
                                        $i0 = client.type * -1541697971;
                                        i = $i0;
                                        item.path = $i0;
                                        OrgFile.this$0.log(-1674539149 * Msg.size, 516759209 * item.size, 2328865 * item.value, item.value * -500717985, 60, item, -626668509 * item.index, $l3, -2120353559 * item.f159c, 2137842387 * item.f162j, -1073493993 * item.f160g, item.width * 706708607);
                                        return;
                                    }
                                }
                            }
                            if (64 == ((516759209 * item.size) & 127)) {
                                if (64 == ((2328865 * item.value) & 127)) {
                                    if (-1793689995 * client.list != client.parameters[i][$i1]) {
                                        client.parameters[i][$i1] = -1793689995 * client.list;
                                    }
                                }
                            }
                            $i0 = InputStream.toString(516759209 * item.size, 2328865 * item.value, -1674539149 * Msg.size, 1878177684) * 1725052319;
                            i = $i0;
                            item.value = $i0;
                            $i0 = client.type * -1541697971;
                            i = $i0;
                            item.path = $i0;
                            Log $r2 = OrgFile.this$0;
                            i = Msg.size * -1674539149;
                            $i1 = 516759209 * item.size;
                            int i2 = item.value * 2328865;
                            int $i4 = -500717985 * item.value;
                            int $i5 = -626668509 * item.index;
                            $r2.get(i, $i1, i2, $i4, 60, item, $i5, $l3, item.pos);
                        }
                    }
                }
            } catch (Throwable $r5) {
                throw StringBuilder.append($r5, "kf.cu(" + ')');
            }
        }
    }

    static final byte[] write(byte[] $r0) {
        Logger $r1 = new Logger($r0);
        int $i0 = $r1.get((byte) 0);
        int $i1 = $r1.size(954243933);
        if ($i1 < 0 || (f45b * 1621223447 != 0 && $i1 > f45b * 1621223447)) {
            throw new RuntimeException();
        } else if ($i0 == 0) {
            $r0 = new byte[$i1];
            $r1.add($r0, 0, $i1, -128016551);
            return $r0;
        } else {
            int $i2 = $r1.size(1180605947);
            if ($i2 < 0 || (f45b * 1621223447 != 0 && $i2 > f45b * -1422793019)) {
                throw new RuntimeException();
            }
            byte[] $r3 = new byte[$i2];
            if (1 == $i0) {
                TFloatLinkedList.add($r3, $i2, $r0, $i1, 9);
                return $r3;
            }
            f46g.write($r1, $r3, 91258545);
            return $r3;
        }
    }

    public void accept(int i, int i2) {
        i2 = 0;
        while (i2 < this.name[i].length) {
            try {
                this.name[i][i2] = null;
                i2++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "kf.ah(" + ')');
            }
        }
    }

    public int add(int i, int i2) {
        try {
            return this.name[i].length;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.aw(" + ')');
        }
    }

    public void add(String $r1, int i) {
        try {
            i = this.uri.toString(Intent.get($r1.toLowerCase(), -826393083));
            if (i >= 0) {
                put(i, -1331363370);
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.bw(" + ')');
        }
    }

    public boolean add(int i) {
        if (this.this$0[i] != null) {
            return true;
        }
        toString(i, -306305206);
        return this.this$0[i] != null;
    }

    public boolean add(String $r1, String $r2, byte b) {
        try {
            $r1 = $r1.toLowerCase();
            $r2 = $r2.toLowerCase();
            int $i1 = this.uri.toString(Intent.get($r1, -696624658));
            return equals($i1, this.state[$i1].toString(Intent.get($r2, -600146835)), 1665187577);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "kf.al(" + ')');
        }
    }

    public byte[] add(int i, byte b) {
        try {
            if (1 == this.name.length) {
                return get(0, i, 459990835);
            }
            if (1 == this.name[i].length) {
                return get(i, 0, -771702375);
            }
            throw new RuntimeException();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "kf.ae(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] add(int r16, int r17, int r18) {
        /*
        r15 = this;
        if (r16 < 0) goto L_0x0076;
    L_0x0002:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x005b }
        r0 = r2.length;	 Catch:{ RuntimeException -> 0x005b }
        r18 = r0;
        r0 = r16;
        r1 = r18;
        if (r0 >= r1) goto L_0x0076;
    L_0x000d:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x005b }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x005b }
        if (r3 == 0) goto L_0x0076;
    L_0x0013:
        if (r17 < 0) goto L_0x0076;
    L_0x0015:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x005b }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x005b }
        r0 = r3.length;	 Catch:{ RuntimeException -> 0x005b }
        r18 = r0;
        r0 = r17;
        r1 = r18;
        if (r0 < r1) goto L_0x0024;
    L_0x0022:
        r4 = 0;
        return r4;
    L_0x0024:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x005b }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x005b }
        r5 = r3[r17];	 Catch:{ RuntimeException -> 0x005b }
        if (r5 != 0) goto L_0x004c;
    L_0x002c:
        r4 = 0;
        r7 = -1558795411; // 0xffffffffa316ab6d float:-8.167817E-18 double:NaN;
        r0 = r16;
        r6 = r15.write(r0, r4, r7);	 Catch:{ RuntimeException -> 0x005b }
        if (r6 != 0) goto L_0x004c;
    L_0x0038:
        r7 = -100166690; // 0xfffffffffa0793de float:-1.759898E35 double:NaN;
        r0 = r16;
        r15.toString(r0, r7);	 Catch:{ RuntimeException -> 0x005b }
        r4 = 0;
        r7 = 233838394; // 0xdf0173a float:1.4796734E-30 double:1.15531517E-315;
        r0 = r16;
        r6 = r15.write(r0, r4, r7);	 Catch:{ RuntimeException -> 0x005b }
        if (r6 == 0) goto L_0x0076;
    L_0x004c:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x005b }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x005b }
        r5 = r3[r17];	 Catch:{ RuntimeException -> 0x005b }
        r7 = 0;
        r9 = -1878492973; // 0xffffffff900878d3 float:-2.691435E-29 double:NaN;
        r8 = p000.TDoubleArrayList.get(r5, r7, r9);	 Catch:{ RuntimeException -> 0x005b }
        return r8;
    L_0x005b:
        r10 = move-exception;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = "kf.aq(";
        r11 = r11.append(r12);
        r7 = 41;
        r11 = r11.append(r7);
        r13 = r11.toString();
        r14 = p000.StringBuilder.append(r10, r13);
        throw r14;
    L_0x0076:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.add(int, int, int):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] add(int r10, int r11, int[] r12) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0052;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0052;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0052;
    L_0x000d:
        if (r11 < 0) goto L_0x0052;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x0038;
    L_0x0020:
        r6 = -1263909693; // 0xffffffffb4aa44c3 float:-3.1714998E-7 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 != 0) goto L_0x0038;
    L_0x0029:
        r6 = -327685082; // 0xffffffffec77ec26 float:-1.1988794E27 double:NaN;
        r9.toString(r10, r6);
        r6 = -1042623191; // 0xffffffffc1dad529 float:-27.354082 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 == 0) goto L_0x0052;
    L_0x0038:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = -1395248268; // 0xffffffffacd63374 float:-6.0879583E-12 double:NaN;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        r5 = r9.length;
        if (r5 == 0) goto L_0x0051;
    L_0x004a:
        r0 = r9.name;
        r2 = r0[r10];
        r3 = 0;
        r2[r11] = r3;
    L_0x0051:
        return r7;
    L_0x0052:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.add(int, int, int[]):byte[]");
    }

    public void addTimestamp() {
        for (int $i0 = 0; $i0 < this.this$0.length; $i0++) {
            this.this$0[$i0] = null;
        }
    }

    public byte[] append(int i, int i2) {
        try {
            if (this.name.length == 1) {
                return add(0, i, -496726829);
            }
            if (1 == this.name[i].length) {
                return add(i, 0, -1960059982);
            }
            throw new RuntimeException();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "kf.am(" + ')');
        }
    }

    public boolean apply(int i) {
        if (this.this$0[i] != null) {
            return true;
        }
        toString(i, -820680292);
        return this.this$0[i] != null;
    }

    public boolean apply(String $r1) {
        return replace(this.uri.toString(Intent.get($r1.toLowerCase(), -1326436461)), 2328865);
    }

    public boolean apply(String $r1, int i) {
        try {
            return replace(this.uri.toString(Intent.get($r1.toLowerCase(), -1177805423)), 2328865);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.ap(" + ')');
        }
    }

    public byte[] apply(String $r1, String $r2) {
        $r1 = $r1.toLowerCase();
        $r2 = $r2.toLowerCase();
        int $i0 = this.uri.toString(Intent.get($r1, -584212339));
        return get($i0, this.state[$i0].toString(Intent.get($r2, -957735081)), -1085608852);
    }

    public void applyNameToStarImports() {
        for (int $i0 = 0; $i0 < this.name.length; $i0++) {
            if (this.name[$i0] != null) {
                for (int $i1 = 0; $i1 < this.name[$i0].length; $i1++) {
                    this.name[$i0][$i1] = null;
                }
            }
        }
    }

    public boolean checkTag(int i) {
        if (1 == this.name.length) {
            return equals(0, i, 1934713521);
        }
        if (1 == this.name[i].length) {
            return equals(i, 0, 1798795364);
        }
        throw new RuntimeException();
    }

    public void computeBinStats() {
        for (int $i0 = 0; $i0 < this.this$0.length; $i0++) {
            this.this$0[$i0] = null;
        }
    }

    public void computeStats() {
        for (int $i0 = 0; $i0 < this.this$0.length; $i0++) {
            this.this$0[$i0] = null;
        }
    }

    void connect(int i) {
    }

    public byte[] createChannel(String $r1, String $r2) {
        $r1 = $r1.toLowerCase();
        $r2 = $r2.toLowerCase();
        int $i0 = this.uri.toString(Intent.get($r1, -543929044));
        return get($i0, this.state[$i0].toString(Intent.get($r2, -506627761)), -502576011);
    }

    public int createFolder(String $r1) {
        return this.uri.toString(Intent.get($r1.toLowerCase(), -1040062148));
    }

    public int createWither(int i) {
        return this.name[i].length;
    }

    int decode(int i, int i2) {
        try {
            return this.this$0[i] != null ? 100 : 0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.aj(" + ')');
        }
    }

    public int decode(String $r1) {
        return decode(this.uri.toString(Intent.get($r1.toLowerCase(), -1610296463)), -1395525957);
    }

    public byte[] decode(int i) {
        if (this.name.length == 1) {
            return add(0, i, 2031327251);
        }
        if (1 == this.name[i].length) {
            return add(i, 0, -367975999);
        }
        throw new RuntimeException();
    }

    public int download(String $r1) {
        return decode(this.uri.toString(Intent.get($r1.toLowerCase(), -2045384210)), 1998432018);
    }

    int encode(int i) {
        return this.this$0[i] != null ? 100 : 0;
    }

    public boolean equals(int i, int i2, int i3) {
        if (i >= 0) {
            try {
                if (i < this.name.length) {
                    if (this.name[i] != null && i2 >= 0) {
                        if (i2 < this.name[i].length) {
                            if (this.name[i][i2] == null) {
                                if (this.this$0[i] != null) {
                                    return true;
                                }
                                toString(i, 726817223);
                                if (this.this$0[i] == null) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                }
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "kf.ag(" + ')');
            }
        }
        return false;
    }

    public boolean eval() {
        boolean $z0 = true;
        for (int $i1 : this.context) {
            if (this.this$0[$i1] == null) {
                toString($i1, -412657325);
                if (this.this$0[$i1] == null) {
                    $z0 = false;
                }
            }
        }
        return $z0;
    }

    public void fillActiveViews() {
        for (int $i0 = 0; $i0 < this.this$0.length; $i0++) {
            this.this$0[$i0] = null;
        }
    }

    public int get(int i) {
        try {
            return this.name.length;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "kf.ai(" + ')');
        }
    }

    public int get(int i, String $r1, int i2) {
        try {
            return this.state[i].toString(Intent.get($r1.toLowerCase(), -1662204132));
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "kf.au(" + ')');
        }
    }

    public int get(String $r1, int i) {
        try {
            return this.uri.toString(Intent.get($r1.toLowerCase(), -1460510113));
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.ax(" + ')');
        }
    }

    public void get(byte b) {
        int $i1 = 0;
        while ($i1 < this.name.length) {
            try {
                if (this.name[$i1] != null) {
                    for (int $i2 = 0; $i2 < this.name[$i1].length; $i2++) {
                        this.name[$i1][$i2] = null;
                    }
                    continue;
                }
                $i1++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "kf.ak(" + ')');
            }
        }
    }

    public byte[] get(int i, int i2, int i3) {
        try {
            return toString(i, i2, null, 1894061078);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "kf.an(" + ')');
        }
    }

    public boolean getAttribute(String $r1, String $r2, int i) {
        try {
            $r1 = $r1.toLowerCase();
            $r2 = $r2.toLowerCase();
            i = this.uri.toString(Intent.get($r1, -952513908));
            return i < 0 ? false : this.state[i].toString(Intent.get($r2, -475634757)) >= 0;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "kf.av(" + ')');
        }
    }

    public byte[] getCacheName(int i, int i2) {
        return toString(i, i2, null, 761692413);
    }

    public int getData(int i, String $r1) {
        return this.state[i].toString(Intent.get($r1.toLowerCase(), -1498278137));
    }

    public void getData(String $r1) {
        int $i0 = this.uri.toString(Intent.get($r1.toLowerCase(), -2081680071));
        if ($i0 >= 0) {
            put($i0, 264157047);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getData(int r10, int r11) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0049;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0049;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0049;
    L_0x000d:
        if (r11 < 0) goto L_0x0049;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x003a;
    L_0x0020:
        r3 = 0;
        r6 = -1402234752; // 0xffffffffac6b9880 float:-3.3480163E-12 double:NaN;
        r5 = r9.write(r10, r3, r6);
        if (r5 != 0) goto L_0x003a;
    L_0x002a:
        r6 = -1941674749; // 0xffffffff8c446503 float:-1.5129688E-31 double:NaN;
        r9.toString(r10, r6);
        r3 = 0;
        r6 = 173598936; // 0xa58e8d8 float:1.0443815E-32 double:8.57692704E-316;
        r5 = r9.write(r10, r3, r6);
        if (r5 == 0) goto L_0x0049;
    L_0x003a:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = -1228074492; // 0xffffffffb6cd1204 float:-6.1115734E-6 double:NaN;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        return r7;
    L_0x0049:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.getData(int, int):byte[]");
    }

    public byte[] getData(String $r1, String $r2) {
        $r1 = $r1.toLowerCase();
        $r2 = $r2.toLowerCase();
        int $i0 = this.uri.toString(Intent.get($r1, -688444060));
        return get($i0, this.state[$i0].toString(Intent.get($r2, -2011094011)), -1884362720);
    }

    public byte[] getData(String $r1, String $r2, int i) {
        try {
            $r1 = $r1.toLowerCase();
            $r2 = $r2.toLowerCase();
            i = this.uri.toString(Intent.get($r1, -807310165));
            return get(i, this.state[i].toString(Intent.get($r2, -418649316)), -995565013);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "kf.ac(" + ')');
        }
    }

    public boolean getDictionaryName(String $r1) {
        return replace(this.uri.toString(Intent.get($r1.toLowerCase(), -414127967)), 2328865);
    }

    public int getFocalLength() {
        return this.name.length;
    }

    public int[] getKey(int i, int i2) {
        try {
            return this.key[i];
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.ab(" + ')');
        }
    }

    public boolean getName(String $r1) {
        return replace(this.uri.toString(Intent.get($r1.toLowerCase(), -1946069525)), 2328865);
    }

    public int getProfile(int i, String $r1) {
        return this.state[i].toString(Intent.get($r1.toLowerCase(), -1161399514));
    }

    public int getProtocol(int i) {
        return this.name[i].length;
    }

    public boolean getValue(int i, int i2) {
        try {
            if (1 == this.name.length) {
                return equals(0, i, 1697187301);
            }
            if (1 == this.name[i].length) {
                return equals(i, 0, 2139144633);
            }
            throw new RuntimeException();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.ay(" + ')');
        }
    }

    public int[] getValue(int i) {
        return this.key[i];
    }

    public boolean handleTouchEnd(int i) {
        if (this.this$0[i] != null) {
            return true;
        }
        toString(i, 812040364);
        return this.this$0[i] != null;
    }

    public void hasStarImport() {
        for (int $i0 = 0; $i0 < this.name.length; $i0++) {
            if (this.name[$i0] != null) {
                for (int $i1 = 0; $i1 < this.name[$i0].length; $i1++) {
                    this.name[$i0][$i1] = null;
                }
            }
        }
    }

    public boolean hasStarImport(int i, int i2) {
        if (i < 0 || i >= this.name.length || this.name[i] == null || i2 < 0 || i2 >= this.name[i].length) {
            return false;
        }
        if (this.name[i][i2] == null && this.this$0[i] == null) {
            toString(i, -2141093244);
            if (this.this$0[i] == null) {
                return false;
            }
        }
        return true;
    }

    void init(byte[] bArr) {
        this.type = Boolean.log(bArr, bArr.length, (byte) 2) * 1054629742;
        Logger $r2 = new Logger(Geometry.add(bArr, (byte) 18));
        int $i1 = $r2.get((byte) 0);
        if ($i1 < 5 || $i1 > 7) {
            throw new RuntimeException("");
        }
        int $i2;
        int $i5;
        int $i3;
        int i;
        if ($i1 >= 6) {
            $r2.size(1745731048);
        }
        int $i0 = $r2.get((byte) 0);
        if ($i1 >= 7) {
            this.items = $r2.log((byte) 0) * 1566209516;
        } else {
            this.items = $r2.get(-1348780523) * 1641978221;
        }
        this.context = new int[(this.items * 1110464613)];
        int $i4;
        if ($i1 < 7) {
            $i2 = 0;
            $i5 = -1;
            $i3 = 0;
            while (true) {
                $i4 = this.items * 1110464613;
                i = $i4;
                if ($i2 >= $i4) {
                    break;
                }
                $i3 += $r2.get(-730996034);
                this.context[$i2] = $i3;
                if (this.context[$i2] > $i5) {
                    $i5 = this.context[$i2];
                }
                $i2++;
            }
        } else {
            $i2 = 0;
            $i5 = -1;
            $i3 = 0;
            while (true) {
                $i4 = this.items * 1110464613;
                i = $i4;
                if ($i2 >= $i4) {
                    break;
                }
                $i3 += $r2.log((byte) 0);
                this.context[$i2] = $i3;
                if (this.context[$i2] > $i5) {
                    $i5 = this.context[$i2];
                }
                $i2++;
            }
        }
        this.id = new int[($i5 + 1)];
        this.value = new int[($i5 + 1)];
        this.size = new int[($i5 + 1)];
        this.key = new int[($i5 + 1)][];
        this.this$0 = new Object[($i5 + 1)];
        this.name = new Object[($i5 + 1)][];
        if ($i0 != 0) {
            this.dir = new int[($i5 + 1)];
            for ($i2 = 0; $i2 < -515961999 * this.items; $i2++) {
                this.dir[this.context[$i2]] = $r2.size(-1001216243);
            }
            this.uri = new Cursor(this.dir);
        }
        for ($i2 = 0; $i2 < this.items * -1349696117; $i2++) {
            this.id[this.context[$i2]] = $r2.size(298434558);
        }
        for ($i2 = 0; $i2 < this.items * 1110464613; $i2++) {
            this.value[this.context[$i2]] = $r2.size(314174411);
        }
        for ($i2 = 0; $i2 < this.items * 1110464613; $i2++) {
            this.size[this.context[$i2]] = $r2.get(-2062106068);
        }
        int $i6;
        int i2;
        if ($i1 >= 7) {
            for ($i1 = 0; $i1 < 1808154865 * this.items; $i1++) {
                $i2 = this.context[$i1];
                $i3 = this.size[$i2];
                this.key[$i2] = new int[$i3];
                $i6 = -1;
                i2 = 0;
                for (i = 0; i < $i3; i++) {
                    i2 += $r2.log((byte) 0);
                    this.key[$i2][i] = i2;
                    if (i2 > $i6) {
                        $i6 = i2;
                    }
                }
                this.name[$i2] = new Object[($i6 + 1)];
            }
        } else {
            for ($i1 = 0; $i1 < this.items * 1110464613; $i1++) {
                $i2 = this.context[$i1];
                $i3 = this.size[$i2];
                this.key[$i2] = new int[$i3];
                $i6 = -1;
                i2 = 0;
                for (i = 0; i < $i3; i++) {
                    i2 += $r2.get(757096167);
                    this.key[$i2][i] = i2;
                    if (i2 > $i6) {
                        $i6 = i2;
                    }
                }
                this.name[$i2] = new Object[($i6 + 1)];
            }
        }
        if ($i0 != 0) {
            this.values = new int[($i5 + 1)][];
            Cursor[] cursorArr = new Cursor[($i5 + 1)];
            Cursor[] $r9 = cursorArr;
            this.state = cursorArr;
            for ($i0 = 0; $i0 < this.items * 1110464613; $i0++) {
                $i5 = this.context[$i0];
                $i1 = this.size[$i5];
                this.values[$i5] = new int[this.name[$i5].length];
                for ($i2 = 0; $i2 < $i1; $i2++) {
                    this.values[$i5][this.key[$i5][$i2]] = $r2.size(1144022478);
                }
                this.state[$i5] = new Cursor(this.values[$i5]);
            }
        }
    }

    void init(byte[] bArr, int i) {
        try {
            int $i0 = Boolean.log(bArr, bArr.length, (byte) 2) * -1968198093;
            i = $i0;
            this.type = $i0;
            Logger $r2 = new Logger(Geometry.add(bArr, (byte) 97));
            int $i1 = $r2.get((byte) 0);
            if ($i1 < 5 || $i1 > 7) {
                throw new RuntimeException("");
            }
            int i2;
            int $i2;
            int $i3;
            if ($i1 >= 6) {
                $r2.size(-357634893);
            }
            i = $r2.get((byte) 0);
            if ($i1 >= 7) {
                $i0 = $r2.log((byte) 0) * 1641978221;
                i2 = $i0;
                this.items = $i0;
            } else {
                $i0 = $r2.get(-1627888275) * 1641978221;
                i2 = $i0;
                this.items = $i0;
            }
            i2 = 0;
            this.context = new int[(1110464613 * this.items)];
            if ($i1 >= 7) {
                $i2 = -1;
                for ($i3 = 0; $i3 < 1110464613 * this.items; $i3++) {
                    i2 += $r2.log((byte) 0);
                    this.context[$i3] = i2;
                    if (this.context[$i3] > $i2) {
                        $i2 = this.context[$i3];
                    }
                }
                i2 = $i2;
            } else {
                $i2 = -1;
                for ($i3 = 0; $i3 < 1110464613 * this.items; $i3++) {
                    i2 += $r2.get(1016503742);
                    this.context[$i3] = i2;
                    if (this.context[$i3] > $i2) {
                        $i2 = this.context[$i3];
                    }
                }
                i2 = $i2;
            }
            this.id = new int[(i2 + 1)];
            this.value = new int[(i2 + 1)];
            this.size = new int[(i2 + 1)];
            this.key = new int[(i2 + 1)][];
            Object[] objArr = new Object[(i2 + 1)];
            Object[] $r13 = objArr;
            this.this$0 = objArr;
            Object[][] objArr2 = new Object[(i2 + 1)][];
            Object[][] $r12 = objArr2;
            this.name = objArr2;
            if (i != 0) {
                this.dir = new int[(i2 + 1)];
                for ($i2 = 0; $i2 < 1110464613 * this.items; $i2++) {
                    this.dir[this.context[$i2]] = $r2.size(507103575);
                }
                this.uri = new Cursor(this.dir);
            }
            for ($i2 = 0; $i2 < this.items * 1110464613; $i2++) {
                this.id[this.context[$i2]] = $r2.size(83659099);
            }
            for ($i2 = 0; $i2 < 1110464613 * this.items; $i2++) {
                this.value[this.context[$i2]] = $r2.size(1277496428);
            }
            for ($i2 = 0; $i2 < 1110464613 * this.items; $i2++) {
                this.size[this.context[$i2]] = $r2.get(355722031);
            }
            int $i4;
            int i3;
            int $i6;
            if ($i1 >= 7) {
                for ($i1 = 0; $i1 < 1110464613 * this.items; $i1++) {
                    $i2 = this.context[$i1];
                    $i3 = this.size[$i2];
                    this.key[$i2] = new int[$i3];
                    $i4 = -1;
                    i3 = 0;
                    for ($i6 = 0; $i6 < $i3; $i6++) {
                        i3 += $r2.log((byte) 0);
                        this.key[$i2][$i6] = i3;
                        if (i3 > $i4) {
                            $i4 = i3;
                        }
                    }
                    this.name[$i2] = new Object[($i4 + 1)];
                }
            } else {
                for ($i1 = 0; $i1 < 1110464613 * this.items; $i1++) {
                    $i2 = this.context[$i1];
                    $i3 = this.size[$i2];
                    this.key[$i2] = new int[$i3];
                    $i4 = -1;
                    i3 = 0;
                    for ($i6 = 0; $i6 < $i3; $i6++) {
                        i3 += $r2.get(-1086216764);
                        this.key[$i2][$i6] = i3;
                        if (i3 > $i4) {
                            $i4 = i3;
                        }
                    }
                    this.name[$i2] = new Object[($i4 + 1)];
                }
            }
            if (i != 0) {
                this.values = new int[(i2 + 1)][];
                Cursor[] cursorArr = new Cursor[(i2 + 1)];
                Cursor[] $r10 = cursorArr;
                this.state = cursorArr;
                for (i = 0; i < 1110464613 * this.items; i++) {
                    i2 = this.context[i];
                    $i1 = this.size[i2];
                    this.values[i2] = new int[this.name[i2].length];
                    for ($i2 = 0; $i2 < $i1; $i2++) {
                        this.values[i2][this.key[i2][$i2]] = $r2.size(-1117248933);
                    }
                    this.state[i2] = new Cursor(this.values[i2]);
                }
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.af(" + ')');
        }
    }

    public boolean insert(String $r1) {
        return replace(this.uri.toString(Intent.get($r1.toLowerCase(), -994522924)), 2328865);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] insert(int r10, int r11) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0049;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0049;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0049;
    L_0x000d:
        if (r11 < 0) goto L_0x0049;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x003a;
    L_0x0020:
        r3 = 0;
        r6 = 114890050; // 0x6d91542 float:8.1657563E-35 double:5.6763227E-316;
        r5 = r9.write(r10, r3, r6);
        if (r5 != 0) goto L_0x003a;
    L_0x002a:
        r6 = -236831040; // 0xfffffffff1e23ec0 float:-2.2406231E30 double:NaN;
        r9.toString(r10, r6);
        r3 = 0;
        r6 = -1300262505; // 0xffffffffb27f9197 float:-1.4876057E-8 double:NaN;
        r5 = r9.write(r10, r3, r6);
        if (r5 == 0) goto L_0x0049;
    L_0x003a:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = -340552250; // 0xffffffffebb395c6 float:-4.3421E26 double:NaN;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        return r7;
    L_0x0049:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.insert(int, int):byte[]");
    }

    public boolean isAccountActivated(int i, int i2) {
        if (i < 0 || i >= this.name.length || this.name[i] == null || i2 < 0 || i2 >= this.name[i].length) {
            return false;
        }
        if (this.name[i][i2] == null && this.this$0[i] == null) {
            toString(i, -140419190);
            if (this.this$0[i] == null) {
                return false;
            }
        }
        return true;
    }

    public int loadFile(String $r1) {
        return this.uri.toString(Intent.get($r1.toLowerCase(), -1183491720));
    }

    public boolean loadFile(String $r1, String $r2) {
        $r1 = $r1.toLowerCase();
        $r2 = $r2.toLowerCase();
        int $i0 = this.uri.toString(Intent.get($r1, -2019978678));
        return equals($i0, this.state[$i0].toString(Intent.get($r2, -434305086)), 1842232789);
    }

    public void loadProperties(String $r1) {
        int $i0 = this.uri.toString(Intent.get($r1.toLowerCase(), -1260090603));
        if ($i0 >= 0) {
            put($i0, 1331125966);
        }
    }

    public int methodExists(int i) {
        return this.name[i].length;
    }

    public void onDataAvailable() {
        for (int $i0 = 0; $i0 < this.this$0.length; $i0++) {
            this.this$0[$i0] = null;
        }
    }

    public boolean onProgressUpdate() {
        boolean $z0 = true;
        for (int $i1 : this.context) {
            if (this.this$0[$i1] == null) {
                toString($i1, -1460526737);
                if (this.this$0[$i1] == null) {
                    $z0 = false;
                }
            }
        }
        return $z0;
    }

    boolean parse(int $i0, int[] $r1) {
        byte[] $r9;
        if (this.this$0[$i0] == null) {
            return false;
        }
        int $i3;
        int $i2 = this.size[$i0];
        int[] $r2 = this.key[$i0];
        Object[] $r3 = this.name[$i0];
        boolean $z0 = true;
        for ($i3 = 0; $i3 < $i2; $i3++) {
            if ($r3[$r2[$i3]] == null) {
                $z0 = false;
                break;
            }
        }
        if ($z0) {
            return true;
        }
        if ($r1 == null || ($r1[0] == 0 && $r1[1] == 0 && $r1[2] == 0 && $r1[3] == 0)) {
            $r9 = TDoubleArrayList.get(this.this$0[$i0], false, -301518963);
        } else {
            $r9 = TDoubleArrayList.get(this.this$0[$i0], true, -786265582);
            Logger logger = new Logger($r9);
            byte[] $r10 = logger.size;
            logger.init($r1, 5, $r10.length, 1916070449);
        }
        try {
            $r9 = Geometry.add($r9, (byte) 86);
            if (this.pos) {
                this.this$0[$i0] = null;
            }
            if ($i2 > 1) {
                int $i4;
                int i;
                int $i7;
                $i3 = $r9.length - 1;
                $i0 = $r9[$i3] & -283812500;
                $i3 -= ($i0 * $i2) * 4;
                logger = new Logger($r9);
                $r1 = new int[$i2];
                logger.data = 1845262344 * $i3;
                for ($i4 = 0; $i4 < $i0; $i4++) {
                    i = 0;
                    for ($i7 = 0; $i7 < $i2; $i7++) {
                        i += logger.size(1010177315);
                        $r1[$i7] = $r1[$i7] + i;
                    }
                }
                byte[][] $r15 = new byte[$i2][];
                for ($i4 = 0; $i4 < $i2; $i4++) {
                    $r15[$i4] = new byte[$r1[$i4]];
                    $r1[$i4] = 0;
                }
                logger.data = -2106664144 * $i3;
                $i3 = 0;
                for ($i4 = 0; $i4 < $i0; $i4++) {
                    i = 0;
                    for ($i7 = 0; $i7 < $i2; $i7++) {
                        i += logger.size(-48425107);
                        System.arraycopy($r9, $i3, $r15[$i7], $r1[$i7], i);
                        $r1[$i7] = $r1[$i7] + i;
                        $i3 += i;
                    }
                }
                for ($i0 = 0; $i0 < $i2; $i0++) {
                    if (this.length) {
                        $r3[$r2[$i0]] = $r15[$i0];
                    } else {
                        $r3[$r2[$i0]] = Level.toString($r15[$i0], false, 2128526619);
                    }
                }
            } else if (this.length) {
                $r3[$r2[0]] = $r9;
            } else {
                $r3[$r2[0]] = Level.toString($r9, false, 2147178948);
            }
            return true;
        } catch (RuntimeException $r11) {
            throw StringBuilder.append($r11, "" + ($r1 != null) + COMMA + $i0 + COMMA + $r9.length + COMMA + Boolean.log($r9, $r9.length, (byte) 2) + COMMA + Boolean.log($r9, $r9.length - 2, (byte) 2) + COMMA + this.id[$i0] + COMMA + (this.type * 410956414));
        }
    }

    public int parseBody(String $r1) {
        return decode(this.uri.toString(Intent.get($r1.toLowerCase(), -508199697)), -1463572073);
    }

    public int parseName(String $r1) {
        return decode(this.uri.toString(Intent.get($r1.toLowerCase(), -503513097)), -1612845342);
    }

    public boolean prepare(int i, int i2) {
        if (i < 0 || i >= this.name.length || this.name[i] == null || i2 < 0 || i2 >= this.name[i].length) {
            return false;
        }
        if (this.name[i][i2] == null && this.this$0[i] == null) {
            toString(i, -2007022160);
            if (this.this$0[i] == null) {
                return false;
            }
        }
        return true;
    }

    public byte[] processBlock(int i) {
        if (this.name.length == 1) {
            return add(0, i, -994672712);
        }
        if (1 == this.name[i].length) {
            return add(i, 0, -12312095);
        }
        throw new RuntimeException();
    }

    void put(int i) {
    }

    void put(int i, int i2) {
    }

    void read(int i) {
    }

    public byte[] reloadClasses(int i, int i2) {
        return toString(i, i2, null, 1740835727);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] remove(int r10, int r11) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0049;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0049;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0049;
    L_0x000d:
        if (r11 < 0) goto L_0x0049;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x003a;
    L_0x0020:
        r3 = 0;
        r6 = -1216497482; // 0xffffffffb77db8b6 float:-1.51229815E-5 double:NaN;
        r5 = r9.write(r10, r3, r6);
        if (r5 != 0) goto L_0x003a;
    L_0x002a:
        r6 = -2093287899; // 0xffffffff833af625 float:-5.4943047E-37 double:NaN;
        r9.toString(r10, r6);
        r3 = 0;
        r6 = -515817540; // 0xffffffffe1413fbc float:-2.2280088E20 double:NaN;
        r5 = r9.write(r10, r3, r6);
        if (r5 == 0) goto L_0x0049;
    L_0x003a:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = 2081121171; // 0x7c0b6393 float:2.8949955E36 double:1.0282104754E-314;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        return r7;
    L_0x0049:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.remove(int, int):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] remove(int r10, int r11, int[] r12) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0052;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0052;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0052;
    L_0x000d:
        if (r11 < 0) goto L_0x0052;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x0038;
    L_0x0020:
        r6 = -1237198800; // 0xffffffffb641d830 float:-2.8885079E-6 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 != 0) goto L_0x0038;
    L_0x0029:
        r6 = -256580936; // 0xfffffffff0b4e2b8 float:-4.478511E29 double:NaN;
        r9.toString(r10, r6);
        r6 = -276535788; // 0xffffffffef846614 float:-8.195085E28 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 == 0) goto L_0x0052;
    L_0x0038:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = -908481401; // 0xffffffffc9d9ac87 float:-1783184.9 double:NaN;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        r5 = r9.length;
        if (r5 == 0) goto L_0x0051;
    L_0x004a:
        r0 = r9.name;
        r2 = r0[r10];
        r3 = 0;
        r2[r11] = r3;
    L_0x0051:
        return r7;
    L_0x0052:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.remove(int, int, int[]):byte[]");
    }

    public int[] remove(int i) {
        return this.key[i];
    }

    public boolean replace(int i) {
        boolean $z0 = true;
        for (int $i1 : this.context) {
            if (this.this$0[$i1] == null) {
                try {
                    toString($i1, -1254547241);
                    if (this.this$0[$i1] == null) {
                        $z0 = false;
                    }
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "kf.ar(" + ')');
                }
            }
        }
        return $z0;
    }

    public boolean replace(int i, int i2) {
        try {
            if (this.this$0[i] != null) {
                return true;
            }
            toString(i, -42348076);
            return this.this$0[i] != null;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.as(" + ')');
        }
    }

    public void retryFailedUploads() {
        for (int $i0 = 0; $i0 < this.name.length; $i0++) {
            if (this.name[$i0] != null) {
                for (int $i1 = 0; $i1 < this.name[$i0].length; $i1++) {
                    this.name[$i0][$i1] = null;
                }
            }
        }
    }

    void run(byte[] bArr) {
        this.type = Boolean.log(bArr, bArr.length, (byte) 2) * -1968198093;
        Logger $r2 = new Logger(Geometry.add(bArr, (byte) 77));
        int $i1 = $r2.get((byte) 0);
        if ($i1 < 5 || $i1 > 7) {
            throw new RuntimeException("");
        }
        int $i2;
        int $i4;
        int $i3;
        int $i5;
        if ($i1 >= 6) {
            $r2.size(1364444965);
        }
        int $i0 = $r2.get((byte) 0);
        if ($i1 >= 7) {
            this.items = $r2.log((byte) 0) * 1641978221;
        } else {
            this.items = $r2.get(-420559347) * 1641978221;
        }
        this.context = new int[(this.items * 1110464613)];
        if ($i1 >= 7) {
            $i2 = -1;
            $i4 = 0;
            for ($i3 = 0; $i3 < this.items * 1110464613; $i3++) {
                $i4 += $r2.log((byte) 0);
                this.context[$i3] = $i4;
                if (this.context[$i3] > $i2) {
                    $i2 = this.context[$i3];
                }
            }
        } else {
            $i2 = -1;
            $i4 = 0;
            for ($i3 = 0; $i3 < this.items * 1110464613; $i3++) {
                $i4 += $r2.get(472426349);
                this.context[$i3] = $i4;
                if (this.context[$i3] > $i2) {
                    $i2 = this.context[$i3];
                }
            }
        }
        this.id = new int[($i2 + 1)];
        this.value = new int[($i2 + 1)];
        this.size = new int[($i2 + 1)];
        this.key = new int[($i2 + 1)][];
        this.this$0 = new Object[($i2 + 1)];
        this.name = new Object[($i2 + 1)][];
        if ($i0 != 0) {
            this.dir = new int[($i2 + 1)];
            for ($i3 = 0; $i3 < this.items * 1110464613; $i3++) {
                this.dir[this.context[$i3]] = $r2.size(231751411);
            }
            this.uri = new Cursor(this.dir);
        }
        for ($i3 = 0; $i3 < this.items * 1110464613; $i3++) {
            this.id[this.context[$i3]] = $r2.size(-594948215);
        }
        for ($i3 = 0; $i3 < this.items * 1110464613; $i3++) {
            this.value[this.context[$i3]] = $r2.size(2051211034);
        }
        for ($i3 = 0; $i3 < this.items * 1110464613; $i3++) {
            this.size[this.context[$i3]] = $r2.get(1798488917);
        }
        int $i6;
        int $i7;
        if ($i1 >= 7) {
            for ($i1 = 0; $i1 < this.items * 1110464613; $i1++) {
                $i3 = this.context[$i1];
                $i4 = this.size[$i3];
                this.key[$i3] = new int[$i4];
                $i6 = -1;
                $i7 = 0;
                for ($i5 = 0; $i5 < $i4; $i5++) {
                    $i7 += $r2.log((byte) 0);
                    this.key[$i3][$i5] = $i7;
                    if ($i7 > $i6) {
                        $i6 = $i7;
                    }
                }
                this.name[$i3] = new Object[($i6 + 1)];
            }
        } else {
            for ($i1 = 0; $i1 < this.items * 1110464613; $i1++) {
                $i3 = this.context[$i1];
                int $i8 = this.size[$i3];
                this.key[$i3] = new int[$i8];
                $i7 = -1;
                $i6 = 0;
                for ($i4 = 0; $i4 < $i8; $i4++) {
                    $i6 += $r2.get(-1820196364);
                    this.key[$i3][$i4] = $i6;
                    if ($i6 > $i7) {
                        $i7 = $i6;
                    }
                }
                this.name[$i3] = new Object[($i7 + 1)];
            }
        }
        if ($i0 != 0) {
            this.values = new int[($i2 + 1)][];
            Cursor[] cursorArr = new Cursor[($i2 + 1)];
            Cursor[] $r9 = cursorArr;
            this.state = cursorArr;
            for ($i0 = 0; $i0 < this.items * 1110464613; $i0++) {
                $i2 = this.context[$i0];
                $i1 = this.size[$i2];
                this.values[$i2] = new int[this.name[$i2].length];
                for ($i5 = 0; $i5 < $i1; $i5++) {
                    this.values[$i2][this.key[$i2][$i5]] = $r2.size(-311826180);
                }
                this.state[$i2] = new Cursor(this.values[$i2]);
            }
        }
    }

    void send(int i) {
    }

    void set(int i) {
    }

    public void set(String $r1) {
        int $i0 = this.uri.toString(Intent.get($r1.toLowerCase(), -1126157890));
        if ($i0 >= 0) {
            put($i0, 2025986518);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] set(int r10, int r11) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0049;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0049;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0049;
    L_0x000d:
        if (r11 < 0) goto L_0x0049;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x003a;
    L_0x0020:
        r3 = 0;
        r6 = 365923120; // 0x15cf8b30 float:8.3826233E-26 double:1.807900426E-315;
        r5 = r9.write(r10, r3, r6);
        if (r5 != 0) goto L_0x003a;
    L_0x002a:
        r6 = -811671277; // 0xffffffffcf9ee113 float:-5.3311012E9 double:NaN;
        r9.toString(r10, r6);
        r3 = 0;
        r6 = -1314851012; // 0xffffffffb1a0f73c float:-4.68472E-9 double:NaN;
        r5 = r9.write(r10, r3, r6);
        if (r5 == 0) goto L_0x0049;
    L_0x003a:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = -1117949664; // 0xffffffffbd5d7120 float:-0.054062963 double:NaN;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        return r7;
    L_0x0049:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.set(int, int):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] set(int r10, int r11, int[] r12) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0052;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0052;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0052;
    L_0x000d:
        if (r11 < 0) goto L_0x0052;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x0038;
    L_0x0020:
        r6 = -2142800702; // 0xffffffff804774c2 float:-6.562205E-39 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 != 0) goto L_0x0038;
    L_0x0029:
        r6 = -975620265; // 0xffffffffc5d93757 float:-6950.9175 double:NaN;
        r9.toString(r10, r6);
        r6 = -666210824; // 0xffffffffd84a6df8 float:-8.9029464E14 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 == 0) goto L_0x0052;
    L_0x0038:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = -1712449072; // 0xffffffff99ee19d0 float:-2.4619049E-23 double:NaN;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        r5 = r9.length;
        if (r5 == 0) goto L_0x0051;
    L_0x004a:
        r0 = r9.name;
        r2 = r0[r10];
        r3 = 0;
        r2[r11] = r3;
    L_0x0051:
        return r7;
    L_0x0052:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.set(int, int, int[]):byte[]");
    }

    public byte[] solve(int i) {
        if (this.name.length == 1) {
            return add(0, i, 821217590);
        }
        if (1 == this.name[i].length) {
            return add(i, 0, 1531254501);
        }
        throw new RuntimeException();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] toArray(int r10, int r11) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0049;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0049;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0049;
    L_0x000d:
        if (r11 < 0) goto L_0x0049;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x003a;
    L_0x0020:
        r3 = 0;
        r6 = -131710789; // 0xfffffffff82640bb float:-1.3488034E34 double:NaN;
        r5 = r9.write(r10, r3, r6);
        if (r5 != 0) goto L_0x003a;
    L_0x002a:
        r6 = -642641112; // 0xffffffffd9b21328 float:-6.265451E15 double:NaN;
        r9.toString(r10, r6);
        r3 = 0;
        r6 = 531420852; // 0x1facd6b4 float:7.320003E-20 double:2.625567865E-315;
        r5 = r9.write(r10, r3, r6);
        if (r5 == 0) goto L_0x0049;
    L_0x003a:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = -1886382080; // 0xffffffff8f901800 float:-1.4208741E-29 double:NaN;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        return r7;
    L_0x0049:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.toArray(int, int):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] toArray(int r10, int r11, int[] r12) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0052;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0052;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0052;
    L_0x000d:
        if (r11 < 0) goto L_0x0052;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x0038;
    L_0x0020:
        r6 = -745916704; // 0xffffffffd38a36e0 float:-1.18725227E12 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 != 0) goto L_0x0038;
    L_0x0029:
        r6 = -618836390; // 0xffffffffdb1d4e5a float:-4.427772E16 double:NaN;
        r9.toString(r10, r6);
        r6 = -95921526; // 0xfffffffffa485a8a float:-2.6007393E35 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 == 0) goto L_0x0052;
    L_0x0038:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = 1070443604; // 0x3fcdac54 float:1.6068215 double:5.288694105E-315;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        r5 = r9.length;
        if (r5 == 0) goto L_0x0051;
    L_0x004a:
        r0 = r9.name;
        r2 = r0[r10];
        r3 = 0;
        r2[r11] = r3;
    L_0x0051:
        return r7;
    L_0x0052:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.toArray(int, int, int[]):byte[]");
    }

    public int toString(String $r1, int i) {
        try {
            return decode(this.uri.toString(Intent.get($r1.toLowerCase(), -1554062348)), -1115559217);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "kf.bb(" + ')');
        }
    }

    void toString(int i, int i2) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] toString(int r10, int r11, int[] r12) {
        /*
        r9 = this;
        if (r10 < 0) goto L_0x0052;
    L_0x0002:
        r0 = r9.name;
        r1 = r0.length;
        if (r10 >= r1) goto L_0x0052;
    L_0x0007:
        r0 = r9.name;
        r2 = r0[r10];
        if (r2 == 0) goto L_0x0052;
    L_0x000d:
        if (r11 < 0) goto L_0x0052;
    L_0x000f:
        r0 = r9.name;
        r2 = r0[r10];
        r1 = r2.length;
        if (r11 < r1) goto L_0x0018;
    L_0x0016:
        r3 = 0;
        return r3;
    L_0x0018:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        if (r4 != 0) goto L_0x0038;
    L_0x0020:
        r6 = -145519375; // 0xfffffffff7538cf1 float:-4.290755E33 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 != 0) goto L_0x0038;
    L_0x0029:
        r6 = -613579775; // 0xffffffffdb6d8401 float:-6.6854709E16 double:NaN;
        r9.toString(r10, r6);
        r6 = -1975607623; // 0xffffffff8a3e9eb9 float:-9.17802E-33 double:NaN;
        r5 = r9.write(r10, r12, r6);
        if (r5 == 0) goto L_0x0052;
    L_0x0038:
        r0 = r9.name;
        r2 = r0[r10];
        r4 = r2[r11];
        r6 = 0;
        r8 = -1422411887; // 0xffffffffab37b791 float:-6.526941E-13 double:NaN;
        r7 = p000.TDoubleArrayList.get(r4, r6, r8);
        r5 = r9.length;
        if (r5 == 0) goto L_0x0051;
    L_0x004a:
        r0 = r9.name;
        r2 = r0[r10];
        r3 = 0;
        r2[r11] = r3;
    L_0x0051:
        return r7;
    L_0x0052:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.toString(int, int, int[]):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] toString(int r16, int r17, int[] r18, int r19) {
        /*
        r15 = this;
        if (r16 < 0) goto L_0x0083;
    L_0x0002:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x0068 }
        r0 = r2.length;	 Catch:{ RuntimeException -> 0x0068 }
        r19 = r0;
        r0 = r16;
        r1 = r19;
        if (r0 >= r1) goto L_0x0083;
    L_0x000d:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x0068 }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x0068 }
        if (r3 == 0) goto L_0x0083;
    L_0x0013:
        if (r17 < 0) goto L_0x0083;
    L_0x0015:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x0068 }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x0068 }
        r0 = r3.length;	 Catch:{ RuntimeException -> 0x0068 }
        r19 = r0;
        r0 = r17;
        r1 = r19;
        if (r0 < r1) goto L_0x0024;
    L_0x0022:
        r4 = 0;
        return r4;
    L_0x0024:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x0068 }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x0068 }
        r5 = r3[r17];	 Catch:{ RuntimeException -> 0x0068 }
        if (r5 != 0) goto L_0x004e;
    L_0x002c:
        r7 = -1981607406; // 0xffffffff89e31212 float:-5.4665255E-33 double:NaN;
        r0 = r16;
        r1 = r18;
        r6 = r15.write(r0, r1, r7);	 Catch:{ RuntimeException -> 0x0068 }
        if (r6 != 0) goto L_0x004e;
    L_0x0039:
        r7 = -667451793; // 0xffffffffd8377e6f float:-8.0701462E14 double:NaN;
        r0 = r16;
        r15.toString(r0, r7);	 Catch:{ RuntimeException -> 0x0068 }
        r7 = -1611379376; // 0xffffffff9ff44d50 float:-1.0346592E-19 double:NaN;
        r0 = r16;
        r1 = r18;
        r6 = r15.write(r0, r1, r7);	 Catch:{ RuntimeException -> 0x0068 }
        if (r6 == 0) goto L_0x0083;
    L_0x004e:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x0068 }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x0068 }
        r5 = r3[r17];	 Catch:{ RuntimeException -> 0x0068 }
        r7 = 0;
        r9 = 1428581124; // 0x55266b04 float:1.14361599E13 double:7.058128557E-315;
        r8 = p000.TDoubleArrayList.get(r5, r7, r9);	 Catch:{ RuntimeException -> 0x0068 }
        r6 = r15.length;	 Catch:{ RuntimeException -> 0x0068 }
        if (r6 == 0) goto L_0x0085;
    L_0x0060:
        r2 = r15.name;	 Catch:{ RuntimeException -> 0x0068 }
        r3 = r2[r16];	 Catch:{ RuntimeException -> 0x0068 }
        r4 = 0;
        r3[r17] = r4;	 Catch:{ RuntimeException -> 0x0068 }
        return r8;
    L_0x0068:
        r10 = move-exception;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = "kf.aa(";
        r11 = r11.append(r12);
        r7 = 41;
        r11 = r11.append(r7);
        r13 = r11.toString();
        r14 = p000.StringBuilder.append(r10, r13);
        throw r14;
    L_0x0083:
        r4 = 0;
        return r4;
    L_0x0085:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.toString(int, int, int[], int):byte[]");
    }

    public byte[] toXML(String $r1, String $r2) {
        $r1 = $r1.toLowerCase();
        $r2 = $r2.toLowerCase();
        int $i0 = this.uri.toString(Intent.get($r1, -2008130703));
        return get($i0, this.state[$i0].toString(Intent.get($r2, -1410332585)), -1588731916);
    }

    public void updatePlaylist(int i) {
        i = 0;
        while (i < this.this$0.length) {
            try {
                this.this$0[i] = null;
                i++;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "kf.az(" + ')');
            }
        }
    }

    public boolean validate() {
        boolean $z0 = true;
        for (int $i1 : this.context) {
            if (this.this$0[$i1] == null) {
                toString($i1, -1198188052);
                if (this.this$0[$i1] == null) {
                    $z0 = false;
                }
            }
        }
        return $z0;
    }

    boolean write(int $i0, int[] $r1) {
        if (this.this$0[$i0] == null) {
            return false;
        }
        int $i4;
        int $i3 = this.size[$i0];
        int[] $r2 = this.key[$i0];
        Object[] $r3 = this.name[$i0];
        boolean $z0 = true;
        for ($i4 = 0; $i4 < $i3; $i4++) {
            if ($r3[$r2[$i4]] == null) {
                $z0 = false;
                break;
            }
        }
        if ($z0) {
            return true;
        }
        byte[] $r9;
        if ($r1 == null || ($r1[0] == 0 && $r1[1] == 0 && $r1[2] == 0 && $r1[3] == 0)) {
            $r9 = TDoubleArrayList.get(this.this$0[$i0], false, -386677437);
        } else {
            $r9 = TDoubleArrayList.get(this.this$0[$i0], true, 523619887);
            Logger logger = new Logger($r9);
            byte[] $r10 = logger.size;
            logger.init($r1, 5, $r10.length, 1789832700);
        }
        try {
            $r9 = Geometry.add($r9, (byte) 102);
            if (this.pos) {
                this.this$0[$i0] = null;
            }
            if ($i3 > 1) {
                short $i42;
                int $i5;
                int $i7;
                $i0 = $r9.length - 1;
                short $s1 = $r9[$i0] & (short) 255;
                $i0 -= ($s1 * $i3) * 4;
                int $i02 = new Logger($r9);
                $r1 = new int[$i3];
                $i02.data = 2065011939 * $i0;
                for ($i42 = (short) 0; $i42 < $s1; $i42++) {
                    $i5 = 0;
                    for ($i7 = 0; $i7 < $i3; $i7++) {
                        $i5 += $i02.size(-659762178);
                        $r1[$i7] = $r1[$i7] + $i5;
                    }
                }
                byte[][] $r15 = new byte[$i3][];
                for ($i4 = 0; $i4 < $i3; $i4++) {
                    $r15[$i4] = new byte[$r1[$i4]];
                    $r1[$i4] = 0;
                }
                $i02.data = 2065011939 * $i0;
                $i0 = 0;
                for ($i42 = (short) 0; $i42 < $s1; $i42++) {
                    $i5 = 0;
                    for ($i7 = 0; $i7 < $i3; $i7++) {
                        $i5 += $i02.size(1552882822);
                        System.arraycopy($r9, $i0, $r15[$i7], $r1[$i7], $i5);
                        $r1[$i7] = $r1[$i7] + $i5;
                        $i0 += $i5;
                    }
                }
                for ($i0 = 0; $i0 < $i3; $i0++) {
                    if (this.length) {
                        $r3[$r2[$i0]] = $r15[$i0];
                    } else {
                        $r3[$r2[$i0]] = Level.toString($r15[$i0], false, 2033568132);
                    }
                }
            } else if (this.length) {
                $r3[$r2[0]] = $r9;
            } else {
                $r3[$r2[0]] = Level.toString($r9, false, 2135878751);
            }
            return true;
        } catch (RuntimeException $r11) {
            throw StringBuilder.append($r11, "" + ($r1 != null) + COMMA + $i0 + COMMA + $r9.length + COMMA + Boolean.log($r9, $r9.length, (byte) 2) + COMMA + Boolean.log($r9, $r9.length - 2, (byte) 2) + COMMA + this.id[$i0] + COMMA + (this.type * -1096614661));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean write(int r29, int[] r30, int r31) {
        /*
        r28 = this;
        r0 = r28;
        r2 = r0.this$0;	 Catch:{ RuntimeException -> 0x019c }
        r3 = r2[r29];	 Catch:{ RuntimeException -> 0x019c }
        if (r3 != 0) goto L_0x000a;
    L_0x0008:
        r4 = 0;
        return r4;
    L_0x000a:
        r0 = r28;
        r5 = r0.size;	 Catch:{ RuntimeException -> 0x019c }
        r31 = r5[r29];	 Catch:{ RuntimeException -> 0x019c }
        r0 = r28;
        r6 = r0.key;	 Catch:{ RuntimeException -> 0x019c }
        r5 = r6[r29];	 Catch:{ RuntimeException -> 0x019c }
        r0 = r28;
        r7 = r0.name;	 Catch:{ RuntimeException -> 0x019c }
        r2 = r7[r29];	 Catch:{ RuntimeException -> 0x019c }
        r8 = 1;
        r9 = 0;
    L_0x001e:
        r0 = r31;
        if (r9 >= r0) goto L_0x0029;
    L_0x0022:
        r10 = r5[r9];	 Catch:{ RuntimeException -> 0x019c }
        r3 = r2[r10];	 Catch:{ RuntimeException -> 0x019c }
        if (r3 != 0) goto L_0x002d;
    L_0x0028:
        r8 = 0;
    L_0x0029:
        if (r8 == 0) goto L_0x0030;
    L_0x002b:
        r4 = 1;
        return r4;
    L_0x002d:
        r9 = r9 + 1;
        goto L_0x001e;
    L_0x0030:
        if (r30 == 0) goto L_0x00c8;
    L_0x0032:
        r4 = 0;
        r9 = r30[r4];	 Catch:{ RuntimeException -> 0x019c }
        if (r9 != 0) goto L_0x0046;
    L_0x0037:
        r4 = 1;
        r9 = r30[r4];	 Catch:{ RuntimeException -> 0x019c }
        if (r9 != 0) goto L_0x0046;
    L_0x003c:
        r4 = 2;
        r9 = r30[r4];	 Catch:{ RuntimeException -> 0x019c }
        if (r9 != 0) goto L_0x0046;
    L_0x0041:
        r4 = 3;
        r9 = r30[r4];	 Catch:{ RuntimeException -> 0x019c }
        if (r9 == 0) goto L_0x00c8;
    L_0x0046:
        r0 = r28;
        r11 = r0.this$0;	 Catch:{ RuntimeException -> 0x019c }
        r3 = r11[r29];	 Catch:{ RuntimeException -> 0x019c }
        r4 = 1;
        r13 = -1256618816; // 0xffffffffb51984c0 float:-5.719012E-7 double:NaN;
        r12 = p000.TDoubleArrayList.get(r3, r4, r13);	 Catch:{ RuntimeException -> 0x019c }
        r14 = new Logger;
        r14.<init>(r12);	 Catch:{ RuntimeException -> 0x019c }
        r15 = r14.size;	 Catch:{ RuntimeException -> 0x019c }
        r9 = r15.length;	 Catch:{ RuntimeException -> 0x019c }
        r4 = 5;
        r13 = 674565804; // 0x28350eac float:1.00507E-14 double:3.332797896E-315;
        r0 = r30;
        r14.init(r0, r4, r9, r13);	 Catch:{ RuntimeException -> 0x019c }
    L_0x0065:
        r4 = 91;
        r12 = p000.Geometry.add(r12, r4);	 Catch:{ RuntimeException -> 0x00d7 }
        r0 = r28;
        r8 = r0.pos;	 Catch:{ RuntimeException -> 0x019c }
        if (r8 == 0) goto L_0x0079;
    L_0x0071:
        r0 = r28;
        r11 = r0.this$0;	 Catch:{ RuntimeException -> 0x019c }
        r16 = 0;
        r11[r29] = r16;	 Catch:{ RuntimeException -> 0x019c }
    L_0x0079:
        r4 = 1;
        r0 = r31;
        if (r0 <= r4) goto L_0x024d;
    L_0x007e:
        r0 = r12.length;	 Catch:{ RuntimeException -> 0x019c }
        r29 = r0;
        r29 = r29 + -1;
        r17 = r12[r29];	 Catch:{ RuntimeException -> 0x019c }
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r18 = r17 & r4;
        r9 = r18 * r31;
        r9 = r9 * 4;
        r0 = r29;
        r0 = r0 - r9;
        r29 = r0;
        r14 = new Logger;
        r14.<init>(r12);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r31;
        r0 = new int[r0];	 Catch:{ RuntimeException -> 0x019c }
        r30 = r0;
        r4 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r9 = r4 * r29;
        r14.data = r9;	 Catch:{ RuntimeException -> 0x019c }
        r9 = 0;
    L_0x00a5:
        r0 = r18;
        if (r9 >= r0) goto L_0x01ce;
    L_0x00a9:
        r10 = 0;
        r19 = 0;
    L_0x00ac:
        r0 = r19;
        r1 = r31;
        if (r0 >= r1) goto L_0x01c9;
    L_0x00b2:
        r4 = 2064101039; // 0x7b07aeaf float:7.045031E35 double:1.019801413E-314;
        r20 = r14.size(r4);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r20;
        r10 = r10 + r0;
        r20 = r30[r19];	 Catch:{ RuntimeException -> 0x019c }
        r0 = r20;
        r0 = r0 + r10;
        r20 = r0;
        r30[r19] = r20;	 Catch:{ RuntimeException -> 0x019c }
        r19 = r19 + 1;
        goto L_0x00ac;
    L_0x00c8:
        r0 = r28;
        r11 = r0.this$0;	 Catch:{ RuntimeException -> 0x019c }
        r3 = r11[r29];	 Catch:{ RuntimeException -> 0x019c }
        r4 = 0;
        r13 = -220872654; // 0xfffffffff2d5c032 float:-8.46754E30 double:NaN;
        r12 = p000.TDoubleArrayList.get(r3, r4, r13);	 Catch:{ RuntimeException -> 0x019c }
        goto L_0x0065;
    L_0x00d7:
        r21 = move-exception;
        r22 = new java.lang.StringBuilder;
        r0 = r22;
        r0.<init>();	 Catch:{ RuntimeException -> 0x019c }
        r23 = "";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        if (r30 == 0) goto L_0x01c5;
    L_0x00eb:
        r8 = 1;
    L_0x00ec:
        r0 = r22;
        r22 = r0.append(r8);	 Catch:{ RuntimeException -> 0x019c }
        r23 = ",";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r22;
        r1 = r29;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r23 = ",";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r12.length;	 Catch:{ RuntimeException -> 0x019c }
        r31 = r0;
        r0 = r22;
        r1 = r31;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r23 = ",";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r12.length;	 Catch:{ RuntimeException -> 0x019c }
        r31 = r0;
        r4 = 2;
        r0 = r31;
        r31 = p000.Boolean.log(r12, r0, r4);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r22;
        r1 = r31;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r23 = ",";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r12.length;	 Catch:{ RuntimeException -> 0x019c }
        r31 = r0;
        r31 = r31 + -2;
        r4 = 2;
        r0 = r31;
        r31 = p000.Boolean.log(r12, r0, r4);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r22;
        r1 = r31;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r23 = ",";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r28;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x019c }
        r30 = r0;
        r29 = r30[r29];	 Catch:{ RuntimeException -> 0x019c }
        r0 = r22;
        r1 = r29;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r23 = ",";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r28;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x019c }
        r29 = r0;
        r4 = -1096614661; // 0xffffffffbea2fcfb float:-0.31833634 double:NaN;
        r0 = r29;
        r0 = r0 * r4;
        r29 = r0;
        r0 = r22;
        r1 = r29;
        r22 = r0.append(r1);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r22;
        r24 = r0.toString();	 Catch:{ RuntimeException -> 0x019c }
        r0 = r21;
        r1 = r24;
        r25 = p000.StringBuilder.append(r0, r1);	 Catch:{ RuntimeException -> 0x019c }
        throw r25;	 Catch:{ RuntimeException -> 0x019c }
    L_0x019c:
        r26 = move-exception;
        r22 = new java.lang.StringBuilder;
        r0 = r22;
        r0.<init>();
        r23 = "kf.ao(";
        r0 = r22;
        r1 = r23;
        r22 = r0.append(r1);
        r4 = 41;
        r0 = r22;
        r22 = r0.append(r4);
        r0 = r22;
        r24 = r0.toString();
        r0 = r26;
        r1 = r24;
        r25 = p000.StringBuilder.append(r0, r1);
        throw r25;
    L_0x01c5:
        r8 = 0;
        goto L_0x00ec;
    L_0x01c9:
        r9 = r9 + 1;
        goto L_0x00a5;
    L_0x01ce:
        r0 = r31;
        r0 = new byte[r0][];	 Catch:{ RuntimeException -> 0x019c }
        r27 = r0;
        r9 = 0;
    L_0x01d5:
        r0 = r31;
        if (r9 >= r0) goto L_0x01e5;
    L_0x01d9:
        r10 = r30[r9];	 Catch:{ RuntimeException -> 0x019c }
        r15 = new byte[r10];	 Catch:{ RuntimeException -> 0x019c }
        r27[r9] = r15;	 Catch:{ RuntimeException -> 0x019c }
        r4 = 0;
        r30[r9] = r4;	 Catch:{ RuntimeException -> 0x019c }
        r9 = r9 + 1;
        goto L_0x01d5;
    L_0x01e5:
        r4 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r29 = r4 * r29;
        r0 = r29;
        r14.data = r0;	 Catch:{ RuntimeException -> 0x019c }
        r29 = 0;
        r9 = 0;
    L_0x01f1:
        r0 = r18;
        if (r9 >= r0) goto L_0x0227;
    L_0x01f5:
        r10 = 0;
        r19 = 0;
    L_0x01f8:
        r0 = r19;
        r1 = r31;
        if (r0 >= r1) goto L_0x0224;
    L_0x01fe:
        r4 = -448868976; // 0xffffffffe53ecd90 float:-5.63151E22 double:NaN;
        r20 = r14.size(r4);	 Catch:{ RuntimeException -> 0x019c }
        r0 = r20;
        r10 = r10 + r0;
        r15 = r27[r19];	 Catch:{ RuntimeException -> 0x019c }
        r20 = r30[r19];	 Catch:{ RuntimeException -> 0x019c }
        r0 = r29;
        r1 = r20;
        java.lang.System.arraycopy(r12, r0, r15, r1, r10);	 Catch:{ RuntimeException -> 0x019c }
        r20 = r30[r19];	 Catch:{ RuntimeException -> 0x019c }
        r0 = r20;
        r0 = r0 + r10;
        r20 = r0;
        r30[r19] = r20;	 Catch:{ RuntimeException -> 0x019c }
        r0 = r29;
        r0 = r0 + r10;
        r29 = r0;
        r19 = r19 + 1;
        goto L_0x01f8;
    L_0x0224:
        r9 = r9 + 1;
        goto L_0x01f1;
    L_0x0227:
        r29 = 0;
    L_0x0229:
        r0 = r29;
        r1 = r31;
        if (r0 >= r1) goto L_0x0260;
    L_0x022f:
        r0 = r28;
        r8 = r0.length;	 Catch:{ RuntimeException -> 0x019c }
        if (r8 != 0) goto L_0x0246;
    L_0x0235:
        r9 = r5[r29];	 Catch:{ RuntimeException -> 0x019c }
        r12 = r27[r29];	 Catch:{ RuntimeException -> 0x019c }
        r4 = 0;
        r13 = 2108879713; // 0x7db2f361 float:2.9733285E37 double:1.0419250174E-314;
        r3 = p000.Level.toString(r12, r4, r13);	 Catch:{ RuntimeException -> 0x019c }
        r2[r9] = r3;	 Catch:{ RuntimeException -> 0x019c }
    L_0x0243:
        r29 = r29 + 1;
        goto L_0x0229;
    L_0x0246:
        r9 = r5[r29];	 Catch:{ RuntimeException -> 0x019c }
        r12 = r27[r29];	 Catch:{ RuntimeException -> 0x019c }
        r2[r9] = r12;	 Catch:{ RuntimeException -> 0x019c }
        goto L_0x0243;
    L_0x024d:
        r0 = r28;
        r8 = r0.length;	 Catch:{ RuntimeException -> 0x019c }
        if (r8 != 0) goto L_0x0262;
    L_0x0253:
        r4 = 0;
        r29 = r5[r4];	 Catch:{ RuntimeException -> 0x019c }
        r4 = 0;
        r13 = 2022438802; // 0x788bf792 float:2.2710956E34 double:9.99217533E-315;
        r3 = p000.Level.toString(r12, r4, r13);	 Catch:{ RuntimeException -> 0x019c }
        r2[r29] = r3;	 Catch:{ RuntimeException -> 0x019c }
    L_0x0260:
        r4 = 1;
        return r4;
    L_0x0262:
        r4 = 0;
        r29 = r5[r4];	 Catch:{ RuntimeException -> 0x019c }
        r2[r29] = r12;	 Catch:{ RuntimeException -> 0x019c }
        goto L_0x0260;
        */
        throw new UnsupportedOperationException("Method not decompiled: Class.write(int, int[], int):boolean");
    }

    public boolean writeApiJar(int i) {
        if (this.this$0[i] != null) {
            return true;
        }
        toString(i, 181354452);
        return this.this$0[i] != null;
    }
}
