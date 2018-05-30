package p000;

/* compiled from: cl */
public class Integer extends ArrayMap {
    static byte[] cache = new byte[1];
    static int ch;
    static Integer color = new Integer();
    static Integer context = new Integer();
    static int end;
    static int id = 0;
    static final int[] log = Point.f198y;
    static int offset;
    static final int[] pos = Point.f197x;
    public static boolean f137s = true;
    static byte[] text = new byte[1];
    boolean f138a;
    int f139b;
    byte[] buffer;
    int[] f140c;
    int[][] children;
    int[] count;
    int[] current;
    int cursor;
    int data = 0;
    int first;
    public boolean flags = false;
    int f141g;
    int head;
    int height;
    int f142i;
    int[] index;
    int[] key;
    int[] length;
    int[] list;
    int f143m;
    int[] f144n;
    byte[] name;
    int[] next;
    int f145p;
    int[] parent;
    short[] path;
    byte[] position;
    int[] queue;
    int[][] root;
    int size = 0;
    int state;
    byte status = (byte) 0;
    int[] table;
    int[] this$0;
    boolean type;
    int value = 0;
    int[] values;
    int width;
    int f146x;
    int f147y;

    Integer() {
        int $i1 = id;
        id = $i1 + 1;
        this.cursor = $i1;
        this.type = true;
        this.state = -1;
        this.f138a = false;
        this.f139b = -1;
        this.f141g = -1;
        this.f142i = -1;
    }

    public Integer(Integer[] integerArr, int i) {
        ArrayMap arrayMap = this;
        int $i1 = id;
        id = $i1 + 1;
        this.cursor = $i1;
        this.type = true;
        this.state = -1;
        this.f138a = false;
        this.f139b = -1;
        this.f141g = -1;
        this.f142i = -1;
        this.size = 0;
        this.data = 0;
        this.value = 0;
        this.status = (byte) -1;
        boolean $z0 = false;
        boolean $z1 = false;
        boolean $z2 = false;
        boolean $z3 = false;
        for ($i1 = 0; $i1 < i; $i1++) {
            Integer $r2 = integerArr[$i1];
            if ($r2 != null) {
                this.size += $r2.size;
                this.data += $r2.data;
                this.value += $r2.value;
                if ($r2.buffer != null) {
                    $z3 = true;
                } else {
                    if (this.status == (byte) -1) {
                        byte b = $r2.status;
                        byte $b6 = b;
                        this.status = b;
                    }
                    if (this.status != $r2.status) {
                        $z3 = true;
                    }
                }
                $z2 |= $r2.position != null;
                $z1 |= $r2.path != null;
                $z0 |= $r2.name != null;
            }
        }
        this.next = new int[this.size];
        this.length = new int[this.size];
        this.this$0 = new int[this.size];
        this.count = new int[this.data];
        this.queue = new int[this.data];
        this.key = new int[this.data];
        this.list = new int[this.data];
        this.current = new int[this.data];
        this.index = new int[this.data];
        if ($z3) {
            this.buffer = new byte[this.data];
        }
        if ($z2) {
            this.position = new byte[this.data];
        }
        if ($z1) {
            this.path = new short[this.data];
        }
        if ($z0) {
            this.name = new byte[this.data];
        }
        if (this.value > 0) {
            this.values = new int[this.value];
            this.table = new int[this.value];
            this.parent = new int[this.value];
        }
        this.size = 0;
        this.data = 0;
        this.value = 0;
        for ($i1 = 0; $i1 < i; $i1++) {
            $r2 = integerArr[$i1];
            if ($r2 != null) {
                int $i2 = 0;
                while ($i2 < $r2.data) {
                    this.count[this.data] = $r2.count[$i2] + this.size;
                    this.queue[this.data] = $r2.queue[$i2] + this.size;
                    this.key[this.data] = $r2.key[$i2] + this.size;
                    this.list[this.data] = $r2.list[$i2];
                    this.current[this.data] = $r2.current[$i2];
                    this.index[this.data] = $r2.index[$i2];
                    if ($z3) {
                        if ($r2.buffer != null) {
                            this.buffer[this.data] = $r2.buffer[$i2];
                        } else {
                            this.buffer[this.data] = $r2.status;
                        }
                    }
                    if ($z2 && $r2.position != null) {
                        this.position[this.data] = $r2.position[$i2];
                    }
                    if ($z1) {
                        if ($r2.path != null) {
                            this.path[this.data] = $r2.path[$i2];
                        } else {
                            this.path[this.data] = (short) -1;
                        }
                    }
                    if ($z0) {
                        if ($r2.name == null || $r2.name[$i2] == (byte) -1) {
                            this.name[this.data] = (byte) -1;
                        } else {
                            this.name[this.data] = (byte) ($r2.name[$i2] + this.value);
                        }
                    }
                    this.data++;
                    $i2++;
                }
                for ($i2 = 0; $i2 < $r2.value; $i2++) {
                    this.values[this.value] = $r2.values[$i2] + this.size;
                    this.table[this.value] = $r2.table[$i2] + this.size;
                    this.parent[this.value] = $r2.parent[$i2] + this.size;
                    this.value++;
                }
                for ($i2 = 0; $i2 < $r2.size; $i2++) {
                    this.next[this.size] = $r2.next[$i2];
                    this.length[this.size] = $r2.length[$i2];
                    this.this$0[this.size] = $r2.this$0[$i2];
                    this.size++;
                }
            }
        }
    }

    protected final Integer add() {
        return this;
    }

    Integer add(boolean z, Integer integer, byte[] $r2) {
        int $i0;
        integer.size = this.size;
        integer.data = this.data;
        integer.value = this.value;
        if (integer.next == null || integer.next.length < this.size) {
            integer.next = new int[(this.size + 100)];
            integer.length = new int[(this.size + 100)];
            integer.this$0 = new int[(this.size + 100)];
        }
        for (int $i1 = 0; $i1 < this.size; $i1++) {
            integer.next[$i1] = this.next[$i1];
            integer.length[$i1] = this.length[$i1];
            integer.this$0[$i1] = this.this$0[$i1];
        }
        if (z) {
            integer.position = this.position;
        } else {
            integer.position = $r2;
            if (this.position == null) {
                for ($i0 = 0; $i0 < this.data; $i0++) {
                    integer.position[$i0] = (byte) 0;
                }
            } else {
                for ($i0 = 0; $i0 < this.data; $i0++) {
                    integer.position[$i0] = this.position[$i0];
                }
            }
        }
        integer.count = this.count;
        integer.queue = this.queue;
        integer.key = this.key;
        integer.list = this.list;
        integer.current = this.current;
        integer.index = this.index;
        integer.buffer = this.buffer;
        integer.name = this.name;
        integer.path = this.path;
        integer.status = this.status;
        integer.values = this.values;
        integer.table = this.table;
        integer.parent = this.parent;
        integer.children = this.children;
        integer.root = this.root;
        integer.f140c = this.f140c;
        integer.f144n = this.f144n;
        integer.flags = this.flags;
        $i0 = id;
        id = $i0 + 1;
        integer.cursor = $i0;
        integer.f138a = true;
        integer.next();
        return integer;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.Integer add(int[][] r19, int r20, int r21, int r22, boolean r23, int r24) {
        /*
        r18 = this;
        r0 = r18;
        r0.append();
        r0 = r18;
        r1 = r0.width;
        r18 = r0;
        r2 = r20 - r1;
        r0 = r18;
        r1 = r0.width;
        r18 = r0;
        r3 = r1 + r20;
        r0 = r18;
        r1 = r0.width;
        r18 = r0;
        r1 = r22 - r1;
        r0 = r18;
        r4 = r0.width;
        r0 = r22;
        r4 = r4 + r0;
        if (r2 < 0) goto L_0x0206;
    L_0x0026:
        r5 = r3 + 128;
        r5 = r5 >> 7;
        r0 = r19;
        r6 = r0.length;
        if (r5 >= r6) goto L_0x0206;
    L_0x002f:
        if (r1 < 0) goto L_0x0206;
    L_0x0031:
        r5 = r4 + 128;
        r5 = r5 >> 7;
        r8 = 0;
        r7 = r19[r8];
        r6 = r7.length;
        if (r5 < r6) goto L_0x01d0;
    L_0x003b:
        return r18;
    L_0x003c:
        r1 = 0;
    L_0x003d:
        r4 = r9.size;
        if (r1 >= r4) goto L_0x0202;
    L_0x0041:
        r0 = r18;
        r7 = r0.length;
        r4 = r7[r1];
        r4 = -r4;
        r4 = r4 << 16;
        r0 = r18;
        r2 = r0.size;
        r8 = 1500767459; // 0x5973e4e3 float:4.29063018E15 double:7.41477644E-315;
        r2 = r2 * r8;
        r4 = r4 / r2;
        r0 = r24;
        if (r4 >= r0) goto L_0x00b8;
    L_0x0057:
        r0 = r18;
        r7 = r0.next;
        r2 = r7[r1];
        r5 = r2 + r20;
        r0 = r18;
        r7 = r0.this$0;
        r2 = r7[r1];
        r6 = r2 + r22;
        r3 = r5 & 127;
        r2 = r6 & 127;
        r5 = r5 >> 7;
        r6 = r6 >> 7;
        r7 = r19[r5];
        r10 = r7[r6];
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r11 = r8 - r3;
        r10 = r10 * r11;
        r11 = r5 + 1;
        r7 = r19[r11];
        r11 = r7[r6];
        r11 = r11 * r3;
        r10 = r10 + r11;
        r10 = r10 >> 7;
        r7 = r19[r5];
        r11 = r6 + 1;
        r11 = r7[r11];
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r12 = r8 - r3;
        r11 = r11 * r12;
        r5 = r5 + 1;
        r7 = r19[r5];
        r5 = r6 + 1;
        r5 = r7[r5];
        r3 = r5 * r3;
        r3 = r3 + r11;
        r3 = r3 >> 7;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r5 = r8 - r2;
        r5 = r5 * r10;
        r2 = r3 * r2;
        r2 = r2 + r5;
        r3 = r2 >> 7;
        r7 = r9.length;
        r0 = r18;
        r13 = r0.length;
        r2 = r13[r1];
        r0 = r21;
        r3 = r3 - r0;
        r4 = r24 - r4;
        r4 = r4 * r3;
        r0 = r24;
        r4 = r4 / r0;
        r4 = r4 + r2;
        r7[r1] = r4;
    L_0x00b8:
        r1 = r1 + 1;
        goto L_0x003d;
    L_0x00bb:
        if (r23 == 0) goto L_0x01fd;
    L_0x00bd:
        r9 = new Integer;
        r9.<init>();
        r0 = r18;
        r1 = r0.size;
        r18 = r0;
        r9.size = r1;
        r0 = r18;
        r1 = r0.data;
        r18 = r0;
        r9.data = r1;
        r0 = r18;
        r1 = r0.value;
        r18 = r0;
        r9.value = r1;
        r0 = r18;
        r7 = r0.next;
        r9.next = r7;
        r0 = r18;
        r7 = r0.this$0;
        r9.this$0 = r7;
        r0 = r18;
        r7 = r0.count;
        r9.count = r7;
        r0 = r18;
        r7 = r0.queue;
        r9.queue = r7;
        r0 = r18;
        r7 = r0.key;
        r9.key = r7;
        r0 = r18;
        r7 = r0.list;
        r9.list = r7;
        r0 = r18;
        r7 = r0.current;
        r9.current = r7;
        r0 = r18;
        r7 = r0.index;
        r9.index = r7;
        r0 = r18;
        r14 = r0.buffer;
        r9.buffer = r14;
        r0 = r18;
        r14 = r0.position;
        r9.position = r14;
        r0 = r18;
        r14 = r0.name;
        r9.name = r14;
        r0 = r18;
        r15 = r0.path;
        r9.path = r15;
        r0 = r18;
        r0 = r0.status;
        r16 = r0;
        r9.status = r0;
        r0 = r18;
        r7 = r0.values;
        r9.values = r7;
        r0 = r18;
        r7 = r0.table;
        r9.table = r7;
        r0 = r18;
        r7 = r0.parent;
        r9.parent = r7;
        r0 = r18;
        r0 = r0.children;
        r17 = r0;
        r9.children = r0;
        r0 = r18;
        r0 = r0.root;
        r17 = r0;
        r9.root = r0;
        r0 = r18;
        r7 = r0.f140c;
        r9.f140c = r7;
        r0 = r18;
        r7 = r0.f144n;
        r9.f144n = r7;
        r0 = r18;
        r0 = r0.flags;
        r23 = r0;
        r9.flags = r0;
        r1 = r9.size;
        r7 = new int[r1];
        r9.length = r7;
    L_0x0166:
        if (r24 != 0) goto L_0x003c;
    L_0x0168:
        r24 = 0;
    L_0x016a:
        r1 = r9.size;
        r0 = r24;
        if (r0 >= r1) goto L_0x0202;
    L_0x0170:
        r0 = r18;
        r7 = r0.next;
        r1 = r7[r24];
        r2 = r1 + r20;
        r0 = r18;
        r7 = r0.this$0;
        r1 = r7[r24];
        r3 = r1 + r22;
        r4 = r2 & 127;
        r1 = r3 & 127;
        r2 = r2 >> 7;
        r3 = r3 >> 7;
        r7 = r19[r2];
        r5 = r7[r3];
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = r8 - r4;
        r5 = r5 * r6;
        r6 = r2 + 1;
        r7 = r19[r6];
        r6 = r7[r3];
        r6 = r6 * r4;
        r5 = r5 + r6;
        r5 = r5 >> 7;
        r7 = r19[r2];
        r6 = r3 + 1;
        r6 = r7[r6];
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r10 = r8 - r4;
        r6 = r6 * r10;
        r2 = r2 + 1;
        r7 = r19[r2];
        r2 = r3 + 1;
        r2 = r7[r2];
        r4 = r2 * r4;
        r4 = r4 + r6;
        r4 = r4 >> 7;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r8 - r1;
        r2 = r2 * r5;
        r1 = r4 * r1;
        r1 = r1 + r2;
        r1 = r1 >> 7;
        r7 = r9.length;
        r0 = r18;
        r13 = r0.length;
        r4 = r13[r24];
        r1 = r1 + r4;
        r0 = r21;
        r1 = r1 - r0;
        r21 = r0;
        r7[r24] = r1;
        r24 = r24 + 1;
        goto L_0x016a;
    L_0x01d0:
        r2 = r2 >> 7;
        r3 = r3 + 127;
        r3 = r3 >> 7;
        r1 = r1 >> 7;
        r4 = r4 + 127;
        r4 = r4 >> 7;
        r7 = r19[r2];
        r5 = r7[r1];
        r0 = r21;
        if (r5 != r0) goto L_0x00bb;
    L_0x01e4:
        r7 = r19[r3];
        r1 = r7[r1];
        r0 = r21;
        if (r1 != r0) goto L_0x00bb;
    L_0x01ec:
        r7 = r19[r2];
        r1 = r7[r4];
        r0 = r21;
        if (r1 != r0) goto L_0x00bb;
    L_0x01f4:
        r7 = r19[r3];
        r1 = r7[r4];
        r0 = r21;
        if (r1 != r0) goto L_0x00bb;
    L_0x01fc:
        return r18;
    L_0x01fd:
        r9 = r18;
        goto L_0x0166;
    L_0x0202:
        r9.next();
        return r9;
    L_0x0206:
        return r18;
        */
        throw new UnsupportedOperationException("Method not decompiled: Integer.add(int[][], int, int, int, boolean, int):Integer");
    }

    void add(int i) {
        if (this.f139b == -1) {
            int $i1 = log[i];
            int $i2 = pos[i];
            i = 0;
            int $i6 = 0;
            int $i7 = 0;
            int $i5 = 0;
            int $i8 = 0;
            int $i9 = 0;
            for (int $i4 = 0; $i4 < this.size; $i4++) {
                int $i3 = Tag.equals(this.next[$i4], this.this$0[$i4], $i1, $i2, -1666565096);
                int $i10 = this.length[$i4];
                int $i11 = ((this.this$0[$i4] * $i1) - (this.next[$i4] * $i2)) >> 16;
                if ($i3 < $i9) {
                    $i9 = $i3;
                }
                if ($i3 > $i7) {
                    $i7 = $i3;
                }
                if ($i10 < $i8) {
                    $i8 = $i10;
                }
                if ($i10 > $i6) {
                    $i6 = $i10;
                }
                if ($i11 < $i5) {
                    $i5 = $i11;
                }
                if ($i11 > i) {
                    i = $i11;
                }
            }
            this.f147y = ($i7 + $i9) / 2;
            this.f145p = ($i6 + $i8) / 2;
            this.f143m = (i + $i5) / 2;
            this.f139b = (($i7 - $i9) + 1) / 2;
            this.f141g = (($i6 - $i8) + 1) / 2;
            this.f142i = ((i - $i5) + 1) / 2;
            if (this.f139b < 1943028235) {
                this.f139b = 32;
            }
            if (this.f142i < 305063824) {
                this.f142i = 32;
            }
            if (this.flags) {
                this.f139b += 8;
                this.f142i += 8;
            }
        }
    }

    public void add(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size; $i3++) {
            this.next[$i3] = (this.next[$i3] * i) / Constants.f93X;
            this.length[$i3] = (this.length[$i3] * i2) / Constants.f93X;
            this.this$0[$i3] = (this.this$0[$i3] * i3) / Constants.f93X;
        }
        next();
    }

    void add(int $i0, int[] iArr, int $i1, int $i2, int $i3) {
        int $i5;
        int[] $r3;
        int $i7;
        if ($i0 == 0) {
            $i0 = 0;
            offset = 0;
            end = 0;
            ch = 0;
            for (int $i6 : iArr) {
                if ($i6 < this.children.length) {
                    $r3 = this.children[$i6];
                    for (int $i72 : $r3) {
                        offset += this.next[$i72];
                        end += this.length[$i72];
                        ch = this.this$0[$i72] + ch;
                        $i0++;
                    }
                }
            }
            if ($i0 > 0) {
                offset = (offset / $i0) + $i1;
                int $i12 = end / $i0;
                $i1 = $i12;
                end = $i12 + $i2;
                ch = (ch / $i0) + $i3;
                return;
            }
            offset = $i1;
            end = $i2;
            ch = $i3;
            return;
        }
        int[] $r4;
        if ($i0 == 1) {
            for (int $i52 : iArr) {
                if ($i52 < this.children.length) {
                    $r3 = this.children[$i52];
                    for (int $i62 : $r3) {
                        $r4 = this.next;
                        $r4[$i62] = $r4[$i62] + $i1;
                        $r4 = this.length;
                        $r4[$i62] = $r4[$i62] + $i2;
                        $r4 = this.this$0;
                        $r4[$i62] = $r4[$i62] + $i3;
                    }
                }
            }
        } else if ($i0 == 2) {
            for (int $i522 : iArr) {
                if ($i522 < this.children.length) {
                    $r3 = this.children[$i522];
                    for (int $i622 : $r3) {
                        int $i9;
                        $r4 = this.next;
                        $r4[$i622] = $r4[$i622] - offset;
                        $r4 = this.length;
                        $r4[$i622] = $r4[$i622] - end;
                        $r4 = this.this$0;
                        $r4[$i622] = $r4[$i622] - ch;
                        int $i8 = (-1822316498 & $i1) * 8;
                        $i72 = ($i2 & 255) * 8;
                        int $i11 = (75044771 & $i3) * 8;
                        if ($i11 != 0) {
                            $i9 = pos[$i11];
                            $i11 = log[$i11];
                            $i12 = this.next[$i622] * $i11;
                            int i = $i12;
                            int $i122 = ((this.length[$i622] * $i9) + $i12) >> 16;
                            this.length[$i622] = (($i11 * this.length[$i622]) - ($i9 * this.next[$i622])) >> 16;
                            this.next[$i622] = $i122;
                        }
                        if ($i8 != 0) {
                            $i9 = pos[$i8];
                            $i8 = log[$i8];
                            $i11 = ((this.length[$i622] * $i8) - (this.this$0[$i622] * $i9)) >> 16;
                            this.this$0[$i622] = (($i8 * this.this$0[$i622]) + ($i9 * this.length[$i622])) >> 16;
                            this.length[$i622] = $i11;
                        }
                        if ($i72 != 0) {
                            $i8 = pos[$i72];
                            $i72 = log[$i72];
                            $i9 = ((this.this$0[$i622] * $i8) + (this.next[$i622] * $i72)) >> 16;
                            this.this$0[$i622] = (($i72 * this.this$0[$i622]) - ($i8 * this.next[$i622])) >> 16;
                            this.next[$i622] = $i9;
                        }
                        $r4 = this.next;
                        $r4[$i622] = $r4[$i622] + offset;
                        $r4 = this.length;
                        $r4[$i622] = $r4[$i622] + end;
                        $r4 = this.this$0;
                        $r4[$i622] = $r4[$i622] + ch;
                    }
                }
            }
        } else if ($i0 == 3) {
            for (int $i5222 : iArr) {
                if ($i5222 < this.children.length) {
                    $r3 = this.children[$i5222];
                    for (int $i6222 : $r3) {
                        $r4 = this.next;
                        $r4[$i6222] = $r4[$i6222] - offset;
                        $r4 = this.length;
                        $r4[$i6222] = $r4[$i6222] - end;
                        $r4 = this.this$0;
                        $r4[$i6222] = $r4[$i6222] - ch;
                        this.next[$i6222] = (this.next[$i6222] * $i1) / 161782795;
                        this.length[$i6222] = (this.length[$i6222] * $i2) / -876709861;
                        this.this$0[$i6222] = (this.this$0[$i6222] * $i3) / 602488114;
                        $r4 = this.next;
                        $r4[$i6222] = $r4[$i6222] + offset;
                        $r4 = this.length;
                        $r4[$i6222] = $r4[$i6222] + end;
                        $r4 = this.this$0;
                        $r4[$i6222] = $r4[$i6222] + ch;
                    }
                }
            }
        } else if (!($i0 != 5 || this.root == null || this.position == null)) {
            for (int $i22 : iArr) {
                if ($i22 < this.root.length) {
                    $r3 = this.root[$i22];
                    for (int $i32 : $r3) {
                        $i5222 = (this.position[$i32] & -363624821) + ($i1 * 8);
                        if ($i5222 < 0) {
                            $i5222 = 0;
                        } else if ($i5222 > 255) {
                            $i5222 = 1870607421;
                        }
                        this.position[$i32] = (byte) $i5222;
                    }
                }
            }
        }
    }

    public void add(StringBuilder stringBuilder, int $i0) {
        if (this.children != null && $i0 != -1) {
            BitMatrix $r2 = stringBuilder.size[$i0];
            PolynomialGF2mSmallM $r3 = $r2.width;
            offset = 0;
            end = 0;
            ch = 0;
            $i0 = 0;
            while ($i0 < $r2.height && $r3.data[$r2.value[$i0]] != 5) {
                $i0++;
            }
            for ($i0 = 0; $i0 < $r2.height; $i0++) {
                int $i1 = $r2.value[$i0];
                get($r3.data[$i1], $r3.field[$i1], $r2.next[$i0], $r2.key[$i0], $r2.size[$i0]);
            }
            next();
        }
    }

    public void add(StringBuilder stringBuilder, int i, StringBuilder stringBuilder2, int $i1, int[] iArr) {
        if (i != -1) {
            if (iArr == null || $i1 == -1) {
                toString(stringBuilder, i);
                return;
            }
            int $i3;
            BitMatrix $r4 = stringBuilder.size[i];
            BitMatrix $r5 = stringBuilder2.size[$i1];
            PolynomialGF2mSmallM $r6 = $r4.width;
            offset = 0;
            end = 0;
            ch = 0;
            $i1 = iArr[0];
            int $i2 = 1;
            for (i = 0; i < $r4.height; i++) {
                $i3 = $r4.value[i];
                while ($i3 > $i1) {
                    $i1 = iArr[$i2];
                    $i2++;
                }
                if ($i3 != $i1 || $r6.data[$i3] == 0) {
                    get($r6.data[$i3], $r6.field[$i3], $r4.next[i], $r4.key[i], $r4.size[i]);
                }
            }
            offset = 0;
            end = 0;
            ch = 0;
            $i1 = iArr[0];
            $i2 = 1;
            for (i = 0; i < $r5.height; i++) {
                $i3 = $r5.value[i];
                while ($i3 > $i1) {
                    $i1 = iArr[$i2];
                    $i2++;
                }
                if ($i3 == $i1 || $r6.data[$i3] == 0) {
                    get($r6.data[$i3], $r6.field[$i3], $r5.next[i], $r5.key[i], $r5.size[i]);
                }
            }
            next();
        }
    }

    public void append() {
        if (this.f146x != 1) {
            this.f146x = 1;
            this.size = 0;
            this.first = 0;
            this.width = 0;
            for (int $i0 = 0; $i0 < this.size; $i0++) {
                int $i2 = this.next[$i0];
                int $i3 = this.length[$i0];
                int $i1 = this.this$0[$i0];
                if ((-$i3) > this.size * 1500767459) {
                    this.size = (-$i3) * 1329103051;
                }
                if ($i3 > this.first) {
                    this.first = $i3;
                }
                $i1 = ($i2 * $i2) + ($i1 * $i1);
                if ($i1 > this.width) {
                    this.width = $i1;
                }
            }
            this.width = (int) (Math.sqrt((double) this.width) + 0.99d);
            this.height = (int) (Math.sqrt((double) ((this.width * this.width) + ((this.size * 1500767459) * (this.size * 1500767459)))) + 0.99d);
            this.head = this.height + ((int) (Math.sqrt((double) ((this.width * this.width) + (this.first * this.first))) + 0.99d));
        }
    }

    public void append(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size; $i3++) {
            int[] $r1 = this.next;
            $r1[$i3] = $r1[$i3] + i;
            $r1 = this.length;
            $r1[$i3] = $r1[$i3] + i2;
            $r1 = this.this$0;
            $r1[$i3] = $r1[$i3] + i3;
        }
        next();
    }

    void m30b() {
        this.f146x = 0;
        this.f139b = -1;
        this.type = true;
    }

    public Integer build(boolean z) {
        if (!z && text.length < this.data) {
            text = new byte[(this.data - 1689673449)];
        }
        return add(z, context, text);
    }

    public int chmod() {
        append();
        return this.width;
    }

    public void clear() {
        if (this.f146x != 1) {
            this.f146x = 1;
            this.size = 0;
            this.first = 0;
            this.width = 0;
            for (int $i0 = 0; $i0 < this.size; $i0++) {
                int $i2 = this.next[$i0];
                int $i3 = this.length[$i0];
                int $i1 = this.this$0[$i0];
                if ((-$i3) > this.size * 1500767459) {
                    this.size = (-$i3) * 1329103051;
                }
                if ($i3 > this.first) {
                    this.first = $i3;
                }
                $i1 = ($i2 * $i2) + ($i1 * $i1);
                if ($i1 > this.width) {
                    this.width = $i1;
                }
            }
            this.width = (int) (Math.sqrt((double) this.width) + 0.99d);
            this.height = (int) (Math.sqrt((double) ((this.width * this.width) + ((this.size * 1500767459) * (this.size * 1500767459)))) + 0.99d);
            this.head = this.height + ((int) (Math.sqrt((double) ((this.width * this.width) + (this.first * this.first))) + 0.99d));
        }
    }

    protected final Integer clone() {
        return this;
    }

    public void close() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.next[$i0];
            this.next[$i0] = this.this$0[$i0];
            this.this$0[$i0] = -$i1;
        }
        next();
    }

    public void computeDerivatives() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.this$0[$i0];
            this.this$0[$i0] = this.next[$i0];
            this.next[$i0] = -$i1;
        }
        next();
    }

    public void computeDerivatives(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size; $i3++) {
            int[] $r1 = this.next;
            $r1[$i3] = $r1[$i3] + i;
            $r1 = this.length;
            $r1[$i3] = $r1[$i3] + i2;
            $r1 = this.this$0;
            $r1[$i3] = $r1[$i3] + i3;
        }
        next();
    }

    public void createLinks() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.next[$i0];
            this.next[$i0] = this.this$0[$i0];
            this.this$0[$i0] = -$i1;
        }
        next();
    }

    public void doDeferredCheckBlobs() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.this$0[$i0];
            this.this$0[$i0] = this.next[$i0];
            this.next[$i0] = -$i1;
        }
        next();
    }

    public void equals() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.this$0[$i0];
            this.this$0[$i0] = this.next[$i0];
            this.next[$i0] = -$i1;
        }
        next();
    }

    public Integer get(boolean z) {
        if (!z && cache.length < this.data) {
            cache = new byte[(this.data + 100)];
        }
        return add(z, color, cache);
    }

    void get(int i, int[] iArr, int $i1, int $i2, int $i3) {
        int $i5;
        int $i6;
        int[] $r3;
        if (i == 0) {
            offset = 0;
            end = 0;
            ch = 0;
            i = 0;
            for (int $i62 : iArr) {
                if ($i62 < this.children.length) {
                    $r3 = this.children[$i62];
                    $i62 = 0;
                    while ($i62 < $r3.length) {
                        int $i7 = $r3[$i62];
                        offset += this.next[$i7];
                        end += this.length[$i7];
                        ch = this.this$0[$i7] + ch;
                        $i62++;
                        i++;
                    }
                }
            }
            if (i > 0) {
                offset = (offset / i) + $i1;
                int $i12 = end / i;
                $i1 = $i12;
                end = $i12 + $i2;
                ch = (ch / i) + $i3;
                return;
            }
            offset = $i1;
            end = $i2;
            ch = $i3;
            return;
        }
        int[] $r4;
        if (i == 1) {
            for (int $i52 : iArr) {
                if ($i52 < this.children.length) {
                    $r3 = this.children[$i52];
                    for (int $i622 : $r3) {
                        $r4 = this.next;
                        $r4[$i622] = $r4[$i622] + $i1;
                        $r4 = this.length;
                        $r4[$i622] = $r4[$i622] + $i2;
                        $r4 = this.this$0;
                        $r4[$i622] = $r4[$i622] + $i3;
                    }
                }
            }
        } else if (i == 2) {
            for (int $i522 : iArr) {
                if ($i522 < this.children.length) {
                    $r3 = this.children[$i522];
                    for (int $i6222 : $r3) {
                        int $i9;
                        $r4 = this.next;
                        $r4[$i6222] = $r4[$i6222] - offset;
                        $r4 = this.length;
                        $r4[$i6222] = $r4[$i6222] - end;
                        $r4 = this.this$0;
                        $r4[$i6222] = $r4[$i6222] - ch;
                        int $i8 = ($i1 & 255) * 8;
                        $i7 = ($i2 & 255) * 8;
                        int $i122 = ($i3 & 255) * 8;
                        if ($i122 != 0) {
                            $i9 = pos[$i122];
                            $i122 = log[$i122];
                            int $i13 = ((this.length[$i6222] * $i9) + (this.next[$i6222] * $i122)) >> 16;
                            this.length[$i6222] = (($i122 * this.length[$i6222]) - ($i9 * this.next[$i6222])) >> 16;
                            this.next[$i6222] = $i13;
                        }
                        if ($i8 != 0) {
                            $i9 = pos[$i8];
                            $i8 = log[$i8];
                            $i122 = ((this.length[$i6222] * $i8) - (this.this$0[$i6222] * $i9)) >> 16;
                            this.this$0[$i6222] = (($i8 * this.this$0[$i6222]) + ($i9 * this.length[$i6222])) >> 16;
                            this.length[$i6222] = $i122;
                        }
                        if ($i7 != 0) {
                            $i8 = pos[$i7];
                            $i7 = log[$i7];
                            $i12 = this.next[$i6222] * $i7;
                            $i122 = $i12;
                            $i9 = ((this.this$0[$i6222] * $i8) + $i12) >> 16;
                            this.this$0[$i6222] = (($i7 * this.this$0[$i6222]) - ($i8 * this.next[$i6222])) >> 16;
                            this.next[$i6222] = $i9;
                        }
                        $r4 = this.next;
                        $r4[$i6222] = $r4[$i6222] + offset;
                        $r4 = this.length;
                        $r4[$i6222] = $r4[$i6222] + end;
                        $r4 = this.this$0;
                        $r4[$i6222] = $r4[$i6222] + ch;
                    }
                }
            }
        } else if (i == 3) {
            for (int $i5222 : iArr) {
                if ($i5222 < this.children.length) {
                    $r3 = this.children[$i5222];
                    for (int $i62222 : $r3) {
                        $r4 = this.next;
                        $r4[$i62222] = $r4[$i62222] - offset;
                        $r4 = this.length;
                        $r4[$i62222] = $r4[$i62222] - end;
                        $r4 = this.this$0;
                        $r4[$i62222] = $r4[$i62222] - ch;
                        this.next[$i62222] = (this.next[$i62222] * $i1) / Constants.f93X;
                        this.length[$i62222] = (this.length[$i62222] * $i2) / Constants.f93X;
                        this.this$0[$i62222] = (this.this$0[$i62222] * $i3) / Constants.f93X;
                        $r4 = this.next;
                        $r4[$i62222] = $r4[$i62222] + offset;
                        $r4 = this.length;
                        $r4[$i62222] = $r4[$i62222] + end;
                        $r4 = this.this$0;
                        $r4[$i62222] = $r4[$i62222] + ch;
                    }
                }
            }
        } else if (!(i != 5 || this.root == null || this.position == null)) {
            for (int $i22 : iArr) {
                if ($i22 < this.root.length) {
                    $r3 = this.root[$i22];
                    for (int $i32 : $r3) {
                        $i5222 = (this.position[$i32] & (short) 255) + ($i1 * 8);
                        if ($i5222 < 0) {
                            $i5222 = 0;
                        } else if ($i5222 > 255) {
                            $i5222 = 255;
                        }
                        this.position[$i32] = (byte) $i5222;
                    }
                }
            }
        }
    }

    public int getDimension() {
        append();
        return this.width;
    }

    public Integer getValue(boolean z) {
        if (!z && text.length < this.data) {
            text = new byte[(this.data + 100)];
        }
        return add(z, context, text);
    }

    public int getWidth() {
        append();
        return this.width;
    }

    public void handleTagNode() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            this.next[$i0] = -this.next[$i0];
            this.this$0[$i0] = -this.this$0[$i0];
        }
        next();
    }

    public void handleTagNode(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size; $i3++) {
            int[] $r1 = this.next;
            $r1[$i3] = $r1[$i3] + i;
            $r1 = this.length;
            $r1[$i3] = $r1[$i3] + i2;
            $r1 = this.this$0;
            $r1[$i3] = $r1[$i3] + i3;
        }
        next();
    }

    public Integer init(boolean z) {
        if (!z && text.length < this.data) {
            text = new byte[(this.data + 100)];
        }
        return add(z, context, text);
    }

    void init() {
        if (this.f146x != 2) {
            this.f146x = 2;
            this.width = 0;
            for (int $i0 = 0; $i0 < this.size; $i0++) {
                int $i2 = this.next[$i0];
                int $i1 = this.length[$i0];
                int $i3 = this.this$0[$i0];
                $i1 = (($i2 * $i2) + ($i3 * $i3)) + ($i1 * $i1);
                if ($i1 > this.width) {
                    this.width = $i1;
                }
            }
            this.width = (int) (Math.sqrt((double) this.width) + 0.99d);
            this.height = this.width;
            this.head = this.width + this.width;
        }
    }

    void init(int $i0) {
        if (this.f139b == -1) {
            int $i1 = log[$i0];
            int $i2 = pos[$i0];
            $i0 = 0;
            int $i7 = 0;
            int $i6 = 0;
            int $i5 = 0;
            int $i8 = 0;
            int $i9 = 0;
            for (int $i4 = 0; $i4 < this.size; $i4++) {
                int $i3 = Tag.equals(this.next[$i4], this.this$0[$i4], $i1, $i2, -1666565096);
                int $i10 = this.length[$i4];
                int $i11 = ((this.this$0[$i4] * $i1) - (this.next[$i4] * $i2)) >> 16;
                if ($i3 < $i9) {
                    $i9 = $i3;
                }
                if ($i3 > $i6) {
                    $i6 = $i3;
                }
                if ($i10 < $i8) {
                    $i8 = $i10;
                }
                if ($i10 > $i7) {
                    $i7 = $i10;
                }
                if ($i11 < $i5) {
                    $i5 = $i11;
                }
                if ($i11 > $i0) {
                    $i0 = $i11;
                }
            }
            this.f147y = ($i6 + $i9) / 2;
            this.f145p = ($i7 + $i8) / 2;
            this.f143m = ($i0 + $i5) / 2;
            this.f139b = (($i6 - $i9) + 1) / 2;
            this.f141g = (($i7 - $i8) + 1) / 2;
            this.f142i = (($i0 - $i5) + 1) / 2;
            if (this.f139b < 32) {
                this.f139b = 32;
            }
            if (this.f142i < 32) {
                this.f142i = 32;
            }
            if (this.flags) {
                this.f139b += 8;
                this.f142i += 8;
            }
        }
    }

    public void injectMembers() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.this$0[$i0];
            this.this$0[$i0] = this.next[$i0];
            this.next[$i0] = -$i1;
        }
        next();
    }

    public void insert() {
        if (this.f146x != 1) {
            this.f146x = 1;
            this.size = 0;
            this.first = 0;
            this.width = 0;
            for (int $i0 = 0; $i0 < this.size; $i0++) {
                int $i2 = this.next[$i0];
                int $i3 = this.length[$i0];
                int $i1 = this.this$0[$i0];
                if ((-$i3) > this.size * 1032390726) {
                    this.size = (-$i3) * 1329103051;
                }
                if ($i3 > this.first) {
                    this.first = $i3;
                }
                $i1 = ($i2 * $i2) + ($i1 * $i1);
                if ($i1 > this.width) {
                    this.width = $i1;
                }
            }
            this.width = (int) (Math.sqrt((double) this.width) + 0.99d);
            this.height = (int) (Math.sqrt((double) ((this.width * this.width) + ((this.size * -481161561) * (this.size * -1156894103)))) + 0.99d);
            this.head = this.height + ((int) (Math.sqrt((double) ((this.width * this.width) + (this.first * this.first))) + 0.99d));
        }
    }

    public Integer load(boolean z) {
        if (!z && cache.length < this.data) {
            cache = new byte[(this.data + 100)];
        }
        return add(z, color, cache);
    }

    public void moveFiles(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size; $i3++) {
            int[] $r1 = this.next;
            $r1[$i3] = $r1[$i3] + i;
            $r1 = this.length;
            $r1[$i3] = $r1[$i3] + i2;
            $r1 = this.this$0;
            $r1[$i3] = $r1[$i3] + i3;
        }
        next();
    }

    void next() {
        this.f146x = 0;
        this.f139b = -1;
        this.type = true;
    }

    void next(int $i0) {
        if (this.f139b == -1) {
            int $i1 = log[$i0];
            int $i2 = pos[$i0];
            $i0 = 0;
            int $i7 = 0;
            int $i6 = 0;
            int $i5 = 0;
            int $i8 = 0;
            int $i9 = 0;
            for (int $i4 = 0; $i4 < this.size; $i4++) {
                int $i3 = Tag.equals(this.next[$i4], this.this$0[$i4], $i1, $i2, -1666565096);
                int $i10 = this.length[$i4];
                int $i11 = ((this.this$0[$i4] * $i1) - (this.next[$i4] * $i2)) >> 16;
                if ($i3 < $i9) {
                    $i9 = $i3;
                }
                if ($i3 > $i6) {
                    $i6 = $i3;
                }
                if ($i10 < $i8) {
                    $i8 = $i10;
                }
                if ($i10 > $i7) {
                    $i7 = $i10;
                }
                if ($i11 < $i5) {
                    $i5 = $i11;
                }
                if ($i11 > $i0) {
                    $i0 = $i11;
                }
            }
            this.f147y = ($i6 + $i9) / 2;
            this.f145p = ($i7 + $i8) / 2;
            this.f143m = ($i0 + $i5) / 2;
            this.f139b = (($i6 - $i9) + 1) / 2;
            this.f141g = (($i7 - $i8) + 1) / 2;
            this.f142i = (($i0 - $i5) + 1) / 2;
            if (this.f139b < 32) {
                this.f139b = 32;
            }
            if (this.f142i < 32) {
                this.f142i = 32;
            }
            if (this.flags) {
                this.f139b += 8;
                this.f142i += 8;
            }
        }
    }

    public void onDataAvailable() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.next[$i0];
            this.next[$i0] = this.this$0[$i0];
            this.this$0[$i0] = -$i1;
        }
        next();
    }

    public void onDataAvailable(int $i0) {
        int $i1 = pos[$i0];
        $i0 = log[$i0];
        for (int $i2 = 0; $i2 < this.size; $i2++) {
            int $i3 = ((this.length[$i2] * $i0) - (this.this$0[$i2] * $i1)) >> 16;
            this.this$0[$i2] = ((this.length[$i2] * $i1) + (this.this$0[$i2] * $i0)) >> 16;
            this.length[$i2] = $i3;
        }
        next();
    }

    public void onDataAvailable(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size; $i3++) {
            int[] $r1 = this.next;
            $r1[$i3] = $r1[$i3] + i;
            $r1 = this.length;
            $r1[$i3] = $r1[$i3] + i2;
            $r1 = this.this$0;
            $r1[$i3] = $r1[$i3] + i3;
        }
        next();
    }

    public void onQuickActionClicked() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.this$0[$i0];
            this.this$0[$i0] = this.next[$i0];
            this.next[$i0] = -$i1;
        }
        next();
    }

    void parse(int i, int[] iArr, int $i1, int $i2, int $i3) {
        int $i5;
        int $i6;
        int[] $r3;
        if (i == 0) {
            offset = 0;
            end = 0;
            ch = 0;
            i = 0;
            for (int $i62 : iArr) {
                if ($i62 < this.children.length) {
                    $r3 = this.children[$i62];
                    $i62 = 0;
                    while ($i62 < $r3.length) {
                        int $i7 = $r3[$i62];
                        offset += this.next[$i7];
                        end += this.length[$i7];
                        ch = this.this$0[$i7] + ch;
                        $i62++;
                        i++;
                    }
                }
            }
            if (i > 0) {
                offset = (offset / i) + $i1;
                int $i12 = end / i;
                $i1 = $i12;
                end = $i12 + $i2;
                ch = (ch / i) + $i3;
                return;
            }
            offset = $i1;
            end = $i2;
            ch = $i3;
            return;
        }
        int[] $r4;
        if (i == 1) {
            for (int $i52 : iArr) {
                if ($i52 < this.children.length) {
                    $r3 = this.children[$i52];
                    for (int $i622 : $r3) {
                        $r4 = this.next;
                        $r4[$i622] = $r4[$i622] + $i1;
                        $r4 = this.length;
                        $r4[$i622] = $r4[$i622] + $i2;
                        $r4 = this.this$0;
                        $r4[$i622] = $r4[$i622] + $i3;
                    }
                }
            }
        } else if (i == 2) {
            for (int $i522 : iArr) {
                if ($i522 < this.children.length) {
                    $r3 = this.children[$i522];
                    for (int $i6222 : $r3) {
                        int $i9;
                        $r4 = this.next;
                        $r4[$i6222] = $r4[$i6222] - offset;
                        $r4 = this.length;
                        $r4[$i6222] = $r4[$i6222] - end;
                        $r4 = this.this$0;
                        $r4[$i6222] = $r4[$i6222] - ch;
                        int $i8 = (-494464423 & $i1) * 8;
                        $i7 = (-309472672 & $i2) * 8;
                        int $i10 = (-269204566 & $i3) * 8;
                        if ($i10 != 0) {
                            $i9 = pos[$i10];
                            $i10 = log[$i10];
                            int $i11 = ((this.length[$i6222] * $i9) + (this.next[$i6222] * $i10)) >> 16;
                            this.length[$i6222] = (($i10 * this.length[$i6222]) - ($i9 * this.next[$i6222])) >> 16;
                            this.next[$i6222] = $i11;
                        }
                        if ($i8 != 0) {
                            $i9 = pos[$i8];
                            $i8 = log[$i8];
                            $i10 = ((this.length[$i6222] * $i8) - (this.this$0[$i6222] * $i9)) >> 16;
                            this.this$0[$i6222] = (($i8 * this.this$0[$i6222]) + ($i9 * this.length[$i6222])) >> 16;
                            this.length[$i6222] = $i10;
                        }
                        if ($i7 != 0) {
                            $i8 = pos[$i7];
                            $i7 = log[$i7];
                            $i9 = ((this.this$0[$i6222] * $i8) + (this.next[$i6222] * $i7)) >> 16;
                            this.this$0[$i6222] = (($i7 * this.this$0[$i6222]) - ($i8 * this.next[$i6222])) >> 16;
                            this.next[$i6222] = $i9;
                        }
                        $r4 = this.next;
                        $r4[$i6222] = $r4[$i6222] + offset;
                        $r4 = this.length;
                        $r4[$i6222] = $r4[$i6222] + end;
                        $r4 = this.this$0;
                        $r4[$i6222] = $r4[$i6222] + ch;
                    }
                }
            }
        } else if (i == 3) {
            for (int $i5222 : iArr) {
                if ($i5222 < this.children.length) {
                    $r3 = this.children[$i5222];
                    for (int $i62222 : $r3) {
                        $r4 = this.next;
                        $r4[$i62222] = $r4[$i62222] - offset;
                        $r4 = this.length;
                        $r4[$i62222] = $r4[$i62222] - end;
                        $r4 = this.this$0;
                        $r4[$i62222] = $r4[$i62222] - ch;
                        this.next[$i62222] = (this.next[$i62222] * $i1) / 119942059;
                        this.length[$i62222] = (this.length[$i62222] * $i2) / 2103469704;
                        this.this$0[$i62222] = (this.this$0[$i62222] * $i3) / Constants.f93X;
                        $r4 = this.next;
                        $r4[$i62222] = $r4[$i62222] + offset;
                        $r4 = this.length;
                        $r4[$i62222] = $r4[$i62222] + end;
                        $r4 = this.this$0;
                        $r4[$i62222] = $r4[$i62222] + ch;
                    }
                }
            }
        } else if (!(i != 5 || this.root == null || this.position == null)) {
            for (int $i22 : iArr) {
                if ($i22 < this.root.length) {
                    $r3 = this.root[$i22];
                    for (int $i32 : $r3) {
                        $i5222 = (this.position[$i32] & (short) 255) + ($i1 * 8);
                        if ($i5222 < 0) {
                            $i5222 = 0;
                        } else if ($i5222 > -1715461198) {
                            $i5222 = 2026937111;
                        }
                        this.position[$i32] = (byte) $i5222;
                    }
                }
            }
        }
    }

    public void process() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            this.next[$i0] = -this.next[$i0];
            this.this$0[$i0] = -this.this$0[$i0];
        }
        next();
    }

    protected final Integer read() {
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.Integer read(int[][] r20, int r21, int r22, int r23, boolean r24, int r25) {
        /*
        r19 = this;
        r0 = r19;
        r0.append();
        r0 = r19;
        r2 = r0.width;
        r3 = r21 - r2;
        r0 = r19;
        r2 = r0.width;
        r4 = r2 + r21;
        r0 = r19;
        r2 = r0.width;
        r2 = r23 - r2;
        r0 = r19;
        r5 = r0.width;
        r0 = r23;
        r5 = r5 + r0;
        if (r3 < 0) goto L_0x0216;
    L_0x0020:
        r7 = -1063183558; // 0xffffffffc0a11b3a float:-5.0345736 double:NaN;
        r6 = r7 + r4;
        r6 = r6 >> 7;
        r0 = r20;
        r8 = r0.length;
        if (r6 >= r8) goto L_0x0216;
    L_0x002c:
        if (r2 < 0) goto L_0x0216;
    L_0x002e:
        r6 = r5 + 128;
        r6 = r6 >> 7;
        r7 = 0;
        r9 = r20[r7];
        r8 = r9.length;
        if (r6 < r8) goto L_0x01e2;
    L_0x0038:
        return r19;
    L_0x0039:
        if (r24 == 0) goto L_0x0211;
    L_0x003b:
        r10 = new Integer;
        r10.<init>();
        r0 = r19;
        r2 = r0.size;
        r10.size = r2;
        r0 = r19;
        r2 = r0.data;
        r10.data = r2;
        r0 = r19;
        r2 = r0.value;
        r10.value = r2;
        r0 = r19;
        r9 = r0.next;
        r10.next = r9;
        r0 = r19;
        r9 = r0.this$0;
        r10.this$0 = r9;
        r0 = r19;
        r9 = r0.count;
        r10.count = r9;
        r0 = r19;
        r9 = r0.queue;
        r10.queue = r9;
        r0 = r19;
        r9 = r0.key;
        r10.key = r9;
        r0 = r19;
        r9 = r0.list;
        r10.list = r9;
        r0 = r19;
        r9 = r0.current;
        r10.current = r9;
        r0 = r19;
        r9 = r0.index;
        r10.index = r9;
        r0 = r19;
        r11 = r0.buffer;
        r10.buffer = r11;
        r0 = r19;
        r11 = r0.position;
        r10.position = r11;
        r0 = r19;
        r11 = r0.name;
        r10.name = r11;
        r0 = r19;
        r12 = r0.path;
        r10.path = r12;
        r0 = r19;
        r13 = r0.status;
        r10.status = r13;
        r0 = r19;
        r9 = r0.values;
        r10.values = r9;
        r0 = r19;
        r9 = r0.table;
        r10.table = r9;
        r0 = r19;
        r9 = r0.parent;
        r10.parent = r9;
        r0 = r19;
        r14 = r0.children;
        r10.children = r14;
        r0 = r19;
        r14 = r0.root;
        r10.root = r14;
        r0 = r19;
        r9 = r0.f140c;
        r10.f140c = r9;
        r0 = r19;
        r9 = r0.f144n;
        r10.f144n = r9;
        r0 = r19;
        r0 = r0.flags;
        r24 = r0;
        r10.flags = r0;
        r2 = r10.size;
        r9 = new int[r2];
        r10.length = r9;
    L_0x00d8:
        if (r25 != 0) goto L_0x0148;
    L_0x00da:
        r25 = 0;
    L_0x00dc:
        r2 = r10.size;
        r0 = r25;
        if (r0 >= r2) goto L_0x01de;
    L_0x00e2:
        r0 = r19;
        r9 = r0.next;
        r2 = r9[r25];
        r3 = r2 + r21;
        r0 = r19;
        r9 = r0.this$0;
        r2 = r9[r25];
        r4 = r2 + r23;
        r7 = 265924348; // 0xfd9aefc float:2.1465254E-29 double:1.313840847E-315;
        r5 = r7 & r3;
        r7 = 1896127185; // 0x71049ad1 float:6.566269E29 double:9.368113023E-315;
        r2 = r7 & r4;
        r3 = r3 >> 7;
        r4 = r4 >> 7;
        r9 = r20[r3];
        r6 = r9[r4];
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r8 = r7 - r5;
        r6 = r6 * r8;
        r8 = r3 + 1;
        r9 = r20[r8];
        r8 = r9[r4];
        r8 = r8 * r5;
        r6 = r6 + r8;
        r6 = r6 >> 7;
        r9 = r20[r3];
        r8 = r4 + 1;
        r8 = r9[r8];
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r15 = r7 - r5;
        r8 = r8 * r15;
        r3 = r3 + 1;
        r9 = r20[r3];
        r3 = r4 + 1;
        r3 = r9[r3];
        r5 = r3 * r5;
        r5 = r5 + r8;
        r5 = r5 >> 7;
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r3 = r7 - r2;
        r3 = r3 * r6;
        r2 = r5 * r2;
        r2 = r2 + r3;
        r2 = r2 >> 7;
        r9 = r10.length;
        r0 = r19;
        r0 = r0.length;
        r16 = r0;
        r5 = r16[r25];
        r2 = r2 + r5;
        r0 = r22;
        r2 = r2 - r0;
        r9[r25] = r2;
        r25 = r25 + 1;
        goto L_0x00dc;
    L_0x0148:
        r2 = 0;
    L_0x0149:
        r5 = r10.size;
        if (r2 >= r5) goto L_0x01de;
    L_0x014d:
        r0 = r19;
        r9 = r0.length;
        r5 = r9[r2];
        r5 = -r5;
        r5 = r5 << 16;
        r0 = r19;
        r3 = r0.size;
        r7 = 1500767459; // 0x5973e4e3 float:4.29063018E15 double:7.41477644E-315;
        r3 = r3 * r7;
        r5 = r5 / r3;
        r0 = r25;
        if (r5 >= r0) goto L_0x01d9;
    L_0x0163:
        r0 = r19;
        r9 = r0.next;
        r3 = r9[r2];
        r6 = r3 + r21;
        r0 = r19;
        r9 = r0.this$0;
        r3 = r9[r2];
        r8 = r3 + r23;
        r4 = r6 & 127;
        r7 = -1039009315; // 0xffffffffc211f9dd float:-36.494007 double:NaN;
        r3 = r7 & r8;
        r6 = r6 >> 7;
        r8 = r8 >> 7;
        r9 = r20[r6];
        r15 = r9[r8];
        r7 = 310093757; // 0x127ba7bd float:7.940839E-28 double:1.532066723E-315;
        r17 = r7 - r4;
        r0 = r17;
        r15 = r15 * r0;
        r17 = r6 + 1;
        r9 = r20[r17];
        r17 = r9[r8];
        r0 = r17;
        r0 = r0 * r4;
        r17 = r0;
        r15 = r15 + r0;
        r15 = r15 >> 7;
        r9 = r20[r6];
        r17 = r8 + 1;
        r17 = r9[r17];
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r18 = r7 - r4;
        r0 = r17;
        r1 = r18;
        r0 = r0 * r1;
        r17 = r0;
        r6 = r6 + 1;
        r9 = r20[r6];
        r6 = r8 + 1;
        r6 = r9[r6];
        r4 = r6 * r4;
        r0 = r17;
        r4 = r4 + r0;
        r4 = r4 >> 7;
        r7 = -553198686; // 0xffffffffdf06dba2 float:-9.717539E18 double:NaN;
        r6 = r7 - r3;
        r6 = r6 * r15;
        r3 = r4 * r3;
        r3 = r3 + r6;
        r4 = r3 >> 7;
        r9 = r10.length;
        r0 = r19;
        r0 = r0.length;
        r16 = r0;
        r3 = r16[r2];
        r0 = r22;
        r4 = r4 - r0;
        r5 = r25 - r5;
        r5 = r5 * r4;
        r0 = r25;
        r5 = r5 / r0;
        r5 = r5 + r3;
        r9[r2] = r5;
    L_0x01d9:
        r2 = r2 + 1;
        goto L_0x0149;
    L_0x01de:
        r10.next();
        return r10;
    L_0x01e2:
        r3 = r3 >> 7;
        r7 = 1527801611; // 0x5b10670b float:4.0645694E16 double:7.548342897E-315;
        r4 = r4 + r7;
        r4 = r4 >> 7;
        r2 = r2 >> 7;
        r5 = r5 + 127;
        r5 = r5 >> 7;
        r9 = r20[r3];
        r6 = r9[r2];
        r0 = r22;
        if (r6 != r0) goto L_0x0039;
    L_0x01f8:
        r9 = r20[r4];
        r2 = r9[r2];
        r0 = r22;
        if (r2 != r0) goto L_0x0039;
    L_0x0200:
        r9 = r20[r3];
        r2 = r9[r5];
        r0 = r22;
        if (r2 != r0) goto L_0x0039;
    L_0x0208:
        r9 = r20[r4];
        r2 = r9[r5];
        r0 = r22;
        if (r2 != r0) goto L_0x0039;
    L_0x0210:
        return r19;
    L_0x0211:
        r10 = r19;
        goto L_0x00d8;
    L_0x0216:
        return r19;
        */
        throw new UnsupportedOperationException("Method not decompiled: Integer.read(int[][], int, int, int, boolean, int):Integer");
    }

    void read(int $i0) {
        if (this.f139b == -1) {
            int $i1 = log[$i0];
            int $i2 = pos[$i0];
            $i0 = 0;
            int $i7 = 0;
            int $i6 = 0;
            int $i5 = 0;
            int $i8 = 0;
            int $i9 = 0;
            for (int $i4 = 0; $i4 < this.size; $i4++) {
                int $i3 = Tag.equals(this.next[$i4], this.this$0[$i4], $i1, $i2, -1666565096);
                int $i10 = this.length[$i4];
                int $i11 = ((this.this$0[$i4] * $i1) - (this.next[$i4] * $i2)) >> 16;
                if ($i3 < $i9) {
                    $i9 = $i3;
                }
                if ($i3 > $i6) {
                    $i6 = $i3;
                }
                if ($i10 < $i8) {
                    $i8 = $i10;
                }
                if ($i10 > $i7) {
                    $i7 = $i10;
                }
                if ($i11 < $i5) {
                    $i5 = $i11;
                }
                if ($i11 > $i0) {
                    $i0 = $i11;
                }
            }
            this.f147y = ($i6 + $i9) / 2;
            this.f145p = ($i7 + $i8) / 2;
            this.f143m = ($i0 + $i5) / 2;
            this.f139b = (($i6 - $i9) + 1) / 2;
            this.f141g = (($i7 - $i8) + 1) / 2;
            this.f142i = (($i0 - $i5) + 1) / 2;
            if (this.f139b < 32) {
                this.f139b = 32;
            }
            if (this.f142i < 32) {
                this.f142i = 32;
            }
            if (this.flags) {
                this.f139b += 8;
                this.f142i += 8;
            }
        }
    }

    public void readProperty(int $i0) {
        int $i1 = pos[$i0];
        $i0 = log[$i0];
        for (int $i2 = 0; $i2 < this.size; $i2++) {
            int $i3 = ((this.length[$i2] * $i0) - (this.this$0[$i2] * $i1)) >> 16;
            this.this$0[$i2] = ((this.length[$i2] * $i1) + (this.this$0[$i2] * $i0)) >> 16;
            this.length[$i2] = $i3;
        }
        next();
    }

    protected final Integer remove() {
        return this;
    }

    public void removeChannel() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            int $i1 = this.this$0[$i0];
            this.this$0[$i0] = this.next[$i0];
            this.next[$i0] = -$i1;
        }
        next();
    }

    public void removeChannel(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.size; $i3++) {
            int[] $r1 = this.next;
            $r1[$i3] = $r1[$i3] + i;
            $r1 = this.length;
            $r1[$i3] = $r1[$i3] + i2;
            $r1 = this.this$0;
            $r1[$i3] = $r1[$i3] + i3;
        }
        next();
    }

    public int render() {
        append();
        return this.width;
    }

    public void resize() {
        if (this.f146x != 1) {
            this.f146x = 1;
            this.size = 0;
            this.first = 0;
            this.width = 0;
            for (int $i0 = 0; $i0 < this.size; $i0++) {
                int $i2 = this.next[$i0];
                int $i3 = this.length[$i0];
                int $i1 = this.this$0[$i0];
                if ((-$i3) > this.size * 1500767459) {
                    this.size = (-$i3) * 1329103051;
                }
                if ($i3 > this.first) {
                    this.first = $i3;
                }
                $i1 = ($i2 * $i2) + ($i1 * $i1);
                if ($i1 > this.width) {
                    this.width = $i1;
                }
            }
            this.width = (int) (Math.sqrt((double) this.width) + 0.99d);
            this.height = (int) (Math.sqrt((double) ((this.width * this.width) + ((this.size * 1500767459) * (this.size * 1500767459)))) + 0.99d);
            this.head = this.height + ((int) (Math.sqrt((double) ((this.width * this.width) + (this.first * this.first))) + 0.99d));
        }
    }

    void set() {
        if (this.f146x != 2) {
            this.f146x = 2;
            this.width = 0;
            for (int $i0 = 0; $i0 < this.size; $i0++) {
                int $i2 = this.next[$i0];
                int $i1 = this.length[$i0];
                int $i3 = this.this$0[$i0];
                $i1 = (($i2 * $i2) + ($i3 * $i3)) + ($i1 * $i1);
                if ($i1 > this.width) {
                    this.width = $i1;
                }
            }
            this.width = (int) (Math.sqrt((double) this.width) + 0.99d);
            this.height = this.width;
            this.head = this.width + this.width;
        }
    }

    void setKey() {
        this.f146x = 0;
        this.f139b = -1;
        this.type = true;
    }

    public void size() {
        for (int $i0 = 0; $i0 < this.size; $i0++) {
            this.next[$i0] = -this.next[$i0];
            this.this$0[$i0] = -this.this$0[$i0];
        }
        next();
    }

    public void toString(int $i0) {
        int $i1 = pos[$i0];
        $i0 = log[$i0];
        for (int $i2 = 0; $i2 < this.size; $i2++) {
            int $i3 = ((this.length[$i2] * $i0) - (this.this$0[$i2] * $i1)) >> 16;
            this.this$0[$i2] = ((this.length[$i2] * $i1) + (this.this$0[$i2] * $i0)) >> 16;
            this.length[$i2] = $i3;
        }
        next();
    }

    void toString(int $i0, int[] iArr, int $i1, int $i2, int $i3) {
        int $i5;
        int[] $r3;
        if ($i0 == 0) {
            $i0 = 0;
            offset = 0;
            end = 0;
            ch = 0;
            for (int $i6 : iArr) {
                if ($i6 < this.children.length) {
                    $r3 = this.children[$i6];
                    for (int $i7 : $r3) {
                        int $i72;
                        offset += this.next[$i72];
                        end += this.length[$i72];
                        ch = this.this$0[$i72] + ch;
                        $i0++;
                    }
                }
            }
            if ($i0 > 0) {
                offset = (offset / $i0) + $i1;
                int $i12 = end / $i0;
                $i1 = $i12;
                end = $i12 + $i2;
                ch = (ch / $i0) + $i3;
                return;
            }
            offset = $i1;
            end = $i2;
            ch = $i3;
            return;
        }
        int[] $r4;
        if ($i0 == 1) {
            for (int $i52 : iArr) {
                if ($i52 < this.children.length) {
                    $r3 = this.children[$i52];
                    for (int $i62 : $r3) {
                        $r4 = this.next;
                        $r4[$i62] = $r4[$i62] + $i1;
                        $r4 = this.length;
                        $r4[$i62] = $r4[$i62] + $i2;
                        $r4 = this.this$0;
                        $r4[$i62] = $r4[$i62] + $i3;
                    }
                }
            }
        } else if ($i0 == 2) {
            for (int $i522 : iArr) {
                if ($i522 < this.children.length) {
                    $r3 = this.children[$i522];
                    for (int $i622 : $r3) {
                        int $i9;
                        $r4 = this.next;
                        $r4[$i622] = $r4[$i622] - offset;
                        $r4 = this.length;
                        $r4[$i622] = $r4[$i622] - end;
                        $r4 = this.this$0;
                        $r4[$i622] = $r4[$i622] - ch;
                        int $i8 = ($i1 & 255) * 8;
                        $i72 = ($i2 & 255) * 8;
                        int $i10 = ($i3 & 255) * 8;
                        if ($i10 != 0) {
                            $i9 = pos[$i10];
                            $i10 = log[$i10];
                            int $i11 = ((this.length[$i622] * $i9) + (this.next[$i622] * $i10)) >> 16;
                            this.length[$i622] = (($i10 * this.length[$i622]) - ($i9 * this.next[$i622])) >> 16;
                            this.next[$i622] = $i11;
                        }
                        if ($i8 != 0) {
                            $i9 = pos[$i8];
                            $i8 = log[$i8];
                            $i10 = ((this.length[$i622] * $i8) - (this.this$0[$i622] * $i9)) >> 16;
                            this.this$0[$i622] = (($i8 * this.this$0[$i622]) + ($i9 * this.length[$i622])) >> 16;
                            this.length[$i622] = $i10;
                        }
                        if ($i72 != 0) {
                            $i8 = pos[$i72];
                            $i72 = log[$i72];
                            $i9 = ((this.this$0[$i622] * $i8) + (this.next[$i622] * $i72)) >> 16;
                            this.this$0[$i622] = (($i72 * this.this$0[$i622]) - ($i8 * this.next[$i622])) >> 16;
                            this.next[$i622] = $i9;
                        }
                        $r4 = this.next;
                        $r4[$i622] = $r4[$i622] + offset;
                        $r4 = this.length;
                        $r4[$i622] = $r4[$i622] + end;
                        $r4 = this.this$0;
                        $r4[$i622] = $r4[$i622] + ch;
                    }
                }
            }
        } else if ($i0 == 3) {
            for (int $i5222 : iArr) {
                if ($i5222 < this.children.length) {
                    $r3 = this.children[$i5222];
                    for (int $i6222 : $r3) {
                        $r4 = this.next;
                        $r4[$i6222] = $r4[$i6222] - offset;
                        $r4 = this.length;
                        $r4[$i6222] = $r4[$i6222] - end;
                        $r4 = this.this$0;
                        $r4[$i6222] = $r4[$i6222] - ch;
                        this.next[$i6222] = (this.next[$i6222] * $i1) / Constants.f93X;
                        this.length[$i6222] = (this.length[$i6222] * $i2) / Constants.f93X;
                        this.this$0[$i6222] = (this.this$0[$i6222] * $i3) / Constants.f93X;
                        $r4 = this.next;
                        $r4[$i6222] = $r4[$i6222] + offset;
                        $r4 = this.length;
                        $r4[$i6222] = $r4[$i6222] + end;
                        $r4 = this.this$0;
                        $r4[$i6222] = $r4[$i6222] + ch;
                    }
                }
            }
        } else if (!($i0 != 5 || this.root == null || this.position == null)) {
            for (int $i22 : iArr) {
                if ($i22 < this.root.length) {
                    $r3 = this.root[$i22];
                    for (int $i32 : $r3) {
                        $i5222 = (this.position[$i32] & (short) 255) + ($i1 * 8);
                        if ($i5222 < 0) {
                            $i5222 = 0;
                        } else if ($i5222 > 255) {
                            $i5222 = 255;
                        }
                        this.position[$i32] = (byte) $i5222;
                    }
                }
            }
        }
    }

    public void toString(StringBuilder stringBuilder, int $i0) {
        if (this.children != null && $i0 != -1) {
            BitMatrix $r2 = stringBuilder.size[$i0];
            PolynomialGF2mSmallM $r3 = $r2.width;
            offset = 0;
            end = 0;
            ch = 0;
            $i0 = 0;
            while ($i0 < $r2.height && $r3.data[$r2.value[$i0]] != 5) {
                $i0++;
            }
            for ($i0 = 0; $i0 < $r2.height; $i0++) {
                int $i1 = $r2.value[$i0];
                get($r3.data[$i1], $r3.field[$i1], $r2.next[$i0], $r2.key[$i0], $r2.size[$i0]);
            }
            next();
        }
    }

    void update() {
        if (this.f146x != 2) {
            this.f146x = 2;
            this.width = 0;
            for (int $i0 = 0; $i0 < this.size; $i0++) {
                int $i2 = this.next[$i0];
                int $i1 = this.length[$i0];
                int $i3 = this.this$0[$i0];
                $i1 = (($i2 * $i2) + ($i3 * $i3)) + ($i1 * $i1);
                if ($i1 > this.width) {
                    this.width = $i1;
                }
            }
            this.width = (int) (Math.sqrt((double) this.width) + 0.99d);
            this.height = this.width;
            this.head = this.width + this.width;
        }
    }

    public int width() {
        append();
        return this.width;
    }

    protected final Integer write() {
        return this;
    }

    public Integer write(boolean z) {
        if (!z && cache.length < this.data) {
            cache = new byte[(this.data + 100)];
        }
        return add(z, color, cache);
    }
}
