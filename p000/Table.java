package p000;

/* compiled from: bj */
public class Table extends ArrayMap {
    static int[] code = new int[Geometry.UNKNOWN_INT];
    static final int[] context = Point.f198y;
    static int field = 0;
    static final int[] instance = Point.f197x;
    static int[] offset = new int[Geometry.UNKNOWN_INT];
    short[] buffer;
    int content;
    FieldInfo[] count;
    int[] data;
    boolean first;
    short[] f308i;
    short[] id;
    FieldInfo[] index;
    int[] items;
    short[] key;
    KeyPair[] last;
    int[] length;
    int limit;
    short[] list;
    byte[] listener;
    int lock;
    int log;
    int[] name;
    int next;
    byte[] parent;
    public short pos;
    int position;
    int queue;
    int[] root;
    int[] size;
    public short start;
    int[] state;
    byte status;
    byte[] text;
    int this$0;
    int[] type;
    byte[] value;
    byte[] values;
    int[][] f309x;
    int[][] f310y;

    Table() {
        this.next = 0;
        this.this$0 = 0;
        this.status = (byte) 0;
        this.first = false;
    }

    public Table(Table table, boolean z, boolean z2, boolean z3, boolean z4) {
        int $i1;
        ArrayMap arrayMap = this;
        this.next = 0;
        this.this$0 = 0;
        this.status = (byte) 0;
        this.first = false;
        this.next = table.next;
        this.this$0 = table.this$0;
        this.content = table.content;
        if (z) {
            this.type = table.type;
            this.data = table.data;
            this.size = table.size;
        } else {
            this.type = new int[this.next];
            this.data = new int[this.next];
            this.size = new int[this.next];
            for ($i1 = 0; $i1 < this.next; $i1++) {
                this.type[$i1] = table.type[$i1];
                this.data[$i1] = table.data[$i1];
                this.size[$i1] = table.size[$i1];
            }
        }
        if (z2) {
            this.id = table.id;
        } else {
            this.id = new short[this.this$0];
            for ($i1 = 0; $i1 < this.this$0; $i1++) {
                this.id[$i1] = table.id[$i1];
            }
        }
        if (z3 || table.list == null) {
            this.list = table.list;
        } else {
            this.list = new short[this.this$0];
            for ($i1 = 0; $i1 < this.this$0; $i1++) {
                this.list[$i1] = table.list[$i1];
            }
        }
        if (z4) {
            this.parent = table.parent;
        } else {
            this.parent = new byte[this.this$0];
            int $i0;
            if (table.parent == null) {
                for ($i0 = 0; $i0 < this.this$0; $i0++) {
                    this.parent[$i0] = (byte) 0;
                }
            } else {
                for ($i0 = 0; $i0 < this.this$0; $i0++) {
                    this.parent[$i0] = table.parent[$i0];
                }
            }
        }
        this.name = table.name;
        this.length = table.length;
        this.items = table.items;
        this.value = table.value;
        this.listener = table.listener;
        this.text = table.text;
        this.status = table.status;
        this.values = table.values;
        this.f308i = table.f308i;
        this.buffer = table.buffer;
        this.key = table.key;
        this.root = table.root;
        this.state = table.state;
        this.f309x = table.f309x;
        this.f310y = table.f310y;
        this.count = table.count;
        this.last = table.last;
        this.index = table.index;
        this.start = table.start;
        this.pos = table.pos;
    }

    Table(byte[] bArr) {
        this.next = 0;
        this.this$0 = 0;
        this.status = (byte) 0;
        this.first = false;
        if (bArr[bArr.length - 1] == (byte) -1 && bArr[bArr.length - 2] == (byte) -1) {
            init(bArr);
        } else {
            add(bArr);
        }
    }

    public Table(Table[] tableArr, int i) {
        int $i2;
        short[] sArr;
        short[] $r5;
        ArrayMap arrayMap = this;
        this.next = 0;
        this.this$0 = 0;
        this.status = (byte) 0;
        this.first = false;
        this.next = 0;
        this.this$0 = 0;
        this.content = 0;
        this.status = (byte) -1;
        boolean $z0 = false;
        boolean $z1 = false;
        boolean $z2 = false;
        boolean $z3 = false;
        boolean $z4 = false;
        boolean $z5 = false;
        for ($i2 = 0; $i2 < i; $i2++) {
            Table $r2 = tableArr[$i2];
            if ($r2 != null) {
                this.next += $r2.next;
                this.this$0 += $r2.this$0;
                this.content += $r2.content;
                if ($r2.listener != null) {
                    $z4 = true;
                } else {
                    if (this.status == (byte) -1) {
                        byte b = $r2.status;
                        byte $b5 = b;
                        this.status = b;
                    }
                    if (this.status != $r2.status) {
                        $z4 = true;
                    }
                }
                $z5 |= $r2.value != null;
                $z3 |= $r2.parent != null;
                $z2 |= $r2.state != null;
                $z1 |= $r2.list != null;
                $z0 |= $r2.text != null;
            }
        }
        this.type = new int[this.next];
        this.data = new int[this.next];
        this.size = new int[this.next];
        this.root = new int[this.next];
        this.name = new int[this.this$0];
        this.length = new int[this.this$0];
        this.items = new int[this.this$0];
        if ($z5) {
            this.value = new byte[this.this$0];
        }
        if ($z4) {
            this.listener = new byte[this.this$0];
        }
        if ($z3) {
            this.parent = new byte[this.this$0];
        }
        if ($z2) {
            this.state = new int[this.this$0];
        }
        if ($z1) {
            sArr = new short[this.this$0];
            $r5 = sArr;
            this.list = sArr;
        }
        if ($z0) {
            this.text = new byte[this.this$0];
        }
        sArr = new short[this.this$0];
        $r5 = sArr;
        this.id = sArr;
        if (this.content > 0) {
            this.values = new byte[this.content];
            sArr = new short[this.content];
            $r5 = sArr;
            this.f308i = sArr;
            sArr = new short[this.content];
            $r5 = sArr;
            this.buffer = sArr;
            sArr = new short[this.content];
            $r5 = sArr;
            this.key = sArr;
        }
        this.next = 0;
        this.this$0 = 0;
        this.content = 0;
        for ($i2 = 0; $i2 < i; $i2++) {
            $r2 = tableArr[$i2];
            if ($r2 != null) {
                int $i3 = 0;
                while ($i3 < $r2.this$0) {
                    if ($z5 && $r2.value != null) {
                        this.value[this.this$0] = $r2.value[$i3];
                    }
                    if ($z4) {
                        if ($r2.listener != null) {
                            this.listener[this.this$0] = $r2.listener[$i3];
                        } else {
                            this.listener[this.this$0] = $r2.status;
                        }
                    }
                    if ($z3 && $r2.parent != null) {
                        this.parent[this.this$0] = $r2.parent[$i3];
                    }
                    if ($z2 && $r2.state != null) {
                        this.state[this.this$0] = $r2.state[$i3];
                    }
                    if ($z1) {
                        if ($r2.list != null) {
                            this.list[this.this$0] = $r2.list[$i3];
                        } else {
                            this.list[this.this$0] = (short) -1;
                        }
                    }
                    if ($z0) {
                        if ($r2.text == null || $r2.text[$i3] == (byte) -1) {
                            this.text[this.this$0] = (byte) -1;
                        } else {
                            this.text[this.this$0] = (byte) ($r2.text[$i3] + this.content);
                        }
                    }
                    this.id[this.this$0] = $r2.id[$i3];
                    this.name[this.this$0] = get($r2, $r2.name[$i3]);
                    this.length[this.this$0] = get($r2, $r2.length[$i3]);
                    this.items[this.this$0] = get($r2, $r2.items[$i3]);
                    this.this$0++;
                    $i3++;
                }
                for ($i3 = 0; $i3 < $r2.content; $i3++) {
                    byte[] $r3 = this.values;
                    int $i4 = this.content;
                    $b5 = $r2.values[$i3];
                    $r3[$i4] = $b5;
                    if ($b5 == (byte) 0) {
                        this.f308i[this.content] = (short) get($r2, (int) $r2.f308i[$i3]);
                        this.buffer[this.content] = (short) get($r2, (int) $r2.buffer[$i3]);
                        this.key[this.content] = (short) get($r2, (int) $r2.key[$i3]);
                    }
                    this.content++;
                }
            }
        }
    }

    static void add(Table table, Table table2, int $i0, int $i1, int $i2, boolean z) {
        table.put();
        table.next();
        table2.put();
        table2.next();
        field++;
        int $i7 = 0;
        int[] $r2 = table2.type;
        int $i3 = table2.next;
        for (int $i8 = 0; $i8 < table.next; $i8++) {
            FieldInfo $r3 = table.count[$i8];
            if ($r3.count * -1213562125 != 0) {
                int $i4 = table.data[$i8] - $i1;
                if ($i4 <= table2.position) {
                    int $i5 = table.type[$i8] - $i0;
                    if ($i5 >= table2.log && $i5 <= table2.lock) {
                        int $i6 = table.size[$i8] - $i2;
                        if ($i6 >= table2.queue) {
                            if ($i6 <= table2.limit) {
                                int $i9 = 0;
                                while ($i9 < $i3) {
                                    FieldInfo $r5 = table2.count[$i9];
                                    if ($i5 == $r2[$i9] && $i6 == table2.size[$i9] && $i4 == table2.data[$i9] && $r5.count * -1213562125 != 0) {
                                        FieldInfo[] $r4;
                                        FieldInfo fieldInfo;
                                        if (table.index == null) {
                                            table.index = new FieldInfo[table.next];
                                        }
                                        if (table2.index == null) {
                                            table2.index = new FieldInfo[$i3];
                                        }
                                        FieldInfo $r7 = table.index[$i8];
                                        if ($r7 == null) {
                                            $r4 = table.index;
                                            fieldInfo = new FieldInfo($r3);
                                            $r4[$i8] = fieldInfo;
                                        }
                                        FieldInfo $r8 = table2.index[$i9];
                                        if ($r8 == null) {
                                            $r4 = table2.index;
                                            fieldInfo = new FieldInfo($r5);
                                            $r4[$i9] = fieldInfo;
                                        }
                                        $r7.name += $r5.name * 1;
                                        $r7.value += $r5.value * 1;
                                        $r7.data += $r5.data * 1;
                                        $r7.count = ($r5.count * 1) + $r7.count;
                                        $r8.name += $r3.name * 1;
                                        $r8.value += $r3.value * 1;
                                        $r8.data += $r3.data * 1;
                                        $r8.count += $r3.count * 1;
                                        $i7++;
                                        offset[$i8] = field;
                                        code[$i9] = field;
                                    }
                                    $i9++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if ($i7 >= 3 && z) {
            byte[] $r9;
            byte[] $r92;
            $i0 = 0;
            while ($i0 < table.this$0) {
                if (offset[table.name[$i0]] == field && offset[table.length[$i0]] == field && offset[table.items[$i0]] == field) {
                    if (table.value == null) {
                        $r9 = table.this$0;
                        $i1 = $r9;
                        $r9 = new byte[$r9];
                        $r92 = $r9;
                        table.value = $r9;
                    }
                    table.value[$i0] = (byte) 2;
                }
                $i0++;
            }
            $i0 = 0;
            while ($i0 < table2.this$0) {
                if (code[table2.name[$i0]] == field && code[table2.length[$i0]] == field && code[table2.items[$i0]] == field) {
                    if (table2.value == null) {
                        $r9 = table2.this$0;
                        $i1 = $r9;
                        $r9 = new byte[$r9];
                        $r92 = $r9;
                        table2.value = $r9;
                    }
                    table2.value[$i0] = (byte) 2;
                }
                $i0++;
            }
        }
    }

    static final int adjustActivationDepth(int i) {
        return i < 2 ? 2 : i > 126 ? 126 : i;
    }

    static final int adjustDepthToBorders(int i) {
        return i < 2 ? 2 : i > 1723007314 ? 126 : i;
    }

    public static Table as(Class classR, int i, int i2) {
        byte[] $r1 = classR.get(i, i2, 77571671);
        return $r1 == null ? null : new Table($r1);
    }

    public static Table createObject(Class classR, int i, int i2) {
        byte[] $r1 = classR.get(i, i2, 102341287);
        return $r1 == null ? null : new Table($r1);
    }

    static final int encryptBlock(int i, int i2) {
        int $i2 = 126;
        i2 = ((i & 127) * i2) >> 7;
        if (i2 < 2) {
            $i2 = 2;
        } else if (i2 <= 126) {
            $i2 = i2;
        }
        return $i2 + (65408 & i);
    }

    static final int generateOTP(int i, int i2) {
        int $i2 = 2;
        i2 = ((i & 127) * i2) >> 7;
        if (i2 >= 2) {
            $i2 = i2 > -512526000 ? -1751004420 : i2;
        }
        return $i2 + (65408 & i);
    }

    public static Table get(Class classR, int i, int i2) {
        byte[] $r1 = classR.get(i, i2, -1409180301);
        return $r1 == null ? null : new Table($r1);
    }

    public static Table getTable(Class classR, int i, int i2) {
        byte[] $r1 = classR.get(i, i2, -968843180);
        return $r1 == null ? null : new Table($r1);
    }

    static void read(Table table, Table table2, int $i0, int $i1, int i, boolean z) {
        table.put();
        table.next();
        table2.put();
        table2.next();
        field++;
        int $i7 = 0;
        int[] $r2 = table2.type;
        int $i3 = table2.next;
        for (int $i8 = 0; $i8 < table.next; $i8++) {
            FieldInfo $r3 = table.count[$i8];
            if ($r3.count * -1213562125 != 0) {
                int $i4 = table.data[$i8] - $i1;
                if ($i4 <= table2.position) {
                    int $i5 = table.type[$i8] - $i0;
                    if ($i5 >= table2.log) {
                        if ($i5 <= table2.lock) {
                            int $i6 = table.size[$i8] - i;
                            if ($i6 >= table2.queue && $i6 <= table2.limit) {
                                int $i9 = 0;
                                while ($i9 < $i3) {
                                    FieldInfo $r6 = table2.count[$i9];
                                    if ($i5 == $r2[$i9] && $i6 == table2.size[$i9] && $i4 == table2.data[$i9] && $r6.count * -1213562125 != 0) {
                                        FieldInfo[] $r4;
                                        FieldInfo fieldInfo;
                                        if (table.index == null) {
                                            table.index = new FieldInfo[table.next];
                                        }
                                        if (table2.index == null) {
                                            table2.index = new FieldInfo[$i3];
                                        }
                                        FieldInfo $r7 = table.index[$i8];
                                        if ($r7 == null) {
                                            $r4 = table.index;
                                            fieldInfo = new FieldInfo($r3);
                                            $r4[$i8] = fieldInfo;
                                        }
                                        FieldInfo $r8 = table2.index[$i9];
                                        if ($r8 == null) {
                                            $r4 = table2.index;
                                            fieldInfo = new FieldInfo($r6);
                                            $r4[$i9] = fieldInfo;
                                        }
                                        $r7.name += $r6.name * 1;
                                        $r7.value += $r6.value * 1;
                                        $r7.data += $r6.data * 1;
                                        $r7.count = ($r6.count * 1) + $r7.count;
                                        $r8.name += $r3.name * 1;
                                        $r8.value += $r3.value * 1;
                                        $r8.data += $r3.data * 1;
                                        $r8.count += $r3.count * 1;
                                        $i7++;
                                        offset[$i8] = field;
                                        code[$i9] = field;
                                    }
                                    $i9++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if ($i7 >= 3 && z) {
            byte[] $r9;
            byte[] $r92;
            $i0 = 0;
            while ($i0 < table.this$0) {
                if (offset[table.name[$i0]] == field && offset[table.length[$i0]] == field && offset[table.items[$i0]] == field) {
                    if (table.value == null) {
                        $r9 = table.this$0;
                        $i1 = $r9;
                        $r9 = new byte[$r9];
                        $r92 = $r9;
                        table.value = $r9;
                    }
                    table.value[$i0] = (byte) 2;
                }
                $i0++;
            }
            $i0 = 0;
            while ($i0 < table2.this$0) {
                if (code[table2.name[$i0]] == field && code[table2.length[$i0]] == field && code[table2.items[$i0]] == field) {
                    if (table2.value == null) {
                        $r9 = table2.this$0;
                        $i1 = $r9;
                        $r9 = new byte[$r9];
                        $r92 = $r9;
                        table2.value = $r9;
                    }
                    table2.value[$i0] = (byte) 2;
                }
                $i0++;
            }
        }
    }

    static final int readHeader(int i) {
        return i < 2 ? 2 : i > 126 ? 2122109659 : i;
    }

    static void run(Table table, Table table2, int $i0, int $i1, int $i2, boolean z) {
        table.put();
        table.next();
        table2.put();
        table2.next();
        field++;
        int $i7 = 0;
        int[] $r2 = table2.type;
        int $i3 = table2.next;
        for (int $i8 = 0; $i8 < table.next; $i8++) {
            FieldInfo $r3 = table.count[$i8];
            if ($r3.count * -1213562125 != 0) {
                int $i4 = table.data[$i8] - $i1;
                if ($i4 <= table2.position) {
                    int $i5 = table.type[$i8] - $i0;
                    if ($i5 >= table2.log && $i5 <= table2.lock) {
                        int $i6 = table.size[$i8] - $i2;
                        if ($i6 >= table2.queue) {
                            if ($i6 <= table2.limit) {
                                int $i9 = 0;
                                while ($i9 < $i3) {
                                    FieldInfo $r5 = table2.count[$i9];
                                    if ($i5 == $r2[$i9] && $i6 == table2.size[$i9] && $i4 == table2.data[$i9] && $r5.count * -1213562125 != 0) {
                                        FieldInfo[] $r4;
                                        FieldInfo fieldInfo;
                                        if (table.index == null) {
                                            table.index = new FieldInfo[table.next];
                                        }
                                        if (table2.index == null) {
                                            table2.index = new FieldInfo[$i3];
                                        }
                                        FieldInfo $r7 = table.index[$i8];
                                        if ($r7 == null) {
                                            $r4 = table.index;
                                            fieldInfo = new FieldInfo($r3);
                                            $r4[$i8] = fieldInfo;
                                        }
                                        FieldInfo $r8 = table2.index[$i9];
                                        if ($r8 == null) {
                                            $r4 = table2.index;
                                            fieldInfo = new FieldInfo($r5);
                                            $r4[$i9] = fieldInfo;
                                        }
                                        $r7.name += $r5.name * 1;
                                        $r7.value += $r5.value * 1;
                                        $r7.data += $r5.data * 1;
                                        $r7.count = ($r5.count * 1) + $r7.count;
                                        $r8.name += $r3.name * 1;
                                        $r8.value += $r3.value * 1;
                                        $r8.data += $r3.data * 1;
                                        $r8.count += $r3.count * 1;
                                        $i7++;
                                        offset[$i8] = field;
                                        code[$i9] = field;
                                    }
                                    $i9++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if ($i7 >= 3 && z) {
            byte[] $r9;
            byte[] $r92;
            $i0 = 0;
            while ($i0 < table.this$0) {
                if (offset[table.name[$i0]] == field && offset[table.length[$i0]] == field && offset[table.items[$i0]] == field) {
                    if (table.value == null) {
                        $r9 = table.this$0;
                        $i1 = $r9;
                        $r9 = new byte[$r9];
                        $r92 = $r9;
                        table.value = $r9;
                    }
                    table.value[$i0] = (byte) 2;
                }
                $i0++;
            }
            $i0 = 0;
            while ($i0 < table2.this$0) {
                if (code[table2.name[$i0]] == field && code[table2.length[$i0]] == field && code[table2.items[$i0]] == field) {
                    if (table2.value == null) {
                        $r9 = table2.this$0;
                        $i1 = $r9;
                        $r9 = new byte[$r9];
                        $r92 = $r9;
                        table2.value = $r9;
                    }
                    table2.value[$i0] = (byte) 2;
                }
                $i0++;
            }
        }
    }

    public static Table size(Class classR, int i, int i2) {
        byte[] $r1 = classR.get(i, i2, 489934852);
        return $r1 == null ? null : new Table($r1);
    }

    static final int testConnection(int i) {
        return i < 2 ? 2 : i > 1098539273 ? 270857939 : i;
    }

    static void toString(Table table, Table table2, int i, int i2, int i3, boolean z) {
        table.put();
        table.next();
        table2.put();
        table2.next();
        field++;
        int $i7 = 0;
        int[] $r2 = table2.type;
        int $i3 = table2.next;
        for (int $i8 = 0; $i8 < table.next; $i8++) {
            FieldInfo $r3 = table.count[$i8];
            if ($r3.count * -1202453356 != 0) {
                int $i4 = table.data[$i8] - i2;
                if ($i4 <= table2.position) {
                    int $i5 = table.type[$i8] - i;
                    if ($i5 >= table2.log && $i5 <= table2.lock) {
                        int $i6 = table.size[$i8] - i3;
                        if ($i6 >= table2.queue && $i6 <= table2.limit) {
                            int $i9 = 0;
                            while ($i9 < $i3) {
                                FieldInfo $r6 = table2.count[$i9];
                                if ($i5 == $r2[$i9] && $i6 == table2.size[$i9] && $i4 == table2.data[$i9] && $r6.count * -951538092 != 0) {
                                    FieldInfo[] $r4;
                                    FieldInfo fieldInfo;
                                    if (table.index == null) {
                                        table.index = new FieldInfo[table.next];
                                    }
                                    if (table2.index == null) {
                                        table2.index = new FieldInfo[$i3];
                                    }
                                    FieldInfo $r7 = table.index[$i8];
                                    if ($r7 == null) {
                                        $r4 = table.index;
                                        fieldInfo = new FieldInfo($r3);
                                        $r4[$i8] = fieldInfo;
                                    }
                                    FieldInfo $r8 = table2.index[$i9];
                                    if ($r8 == null) {
                                        $r4 = table2.index;
                                        fieldInfo = new FieldInfo($r6);
                                        $r4[$i9] = fieldInfo;
                                    }
                                    $r7.name += $r6.name * 1;
                                    $r7.value += $r6.value * 1;
                                    $r7.data += $r6.data * 1;
                                    $r7.count = ($r6.count * 1) + $r7.count;
                                    $r8.name += $r3.name * 1;
                                    $r8.value += $r3.value * 1;
                                    $r8.data += $r3.data * 1;
                                    $r8.count += $r3.count * 1;
                                    $i7++;
                                    offset[$i8] = field;
                                    code[$i9] = field;
                                }
                                $i9++;
                            }
                        }
                    }
                }
            }
        }
        if ($i7 >= 3 && z) {
            byte[] $r9;
            byte[] $r92;
            i = 0;
            while (i < table.this$0) {
                if (offset[table.name[i]] == field && offset[table.length[i]] == field && offset[table.items[i]] == field) {
                    if (table.value == null) {
                        $r9 = table.this$0;
                        i2 = $r9;
                        $r9 = new byte[$r9];
                        $r92 = $r9;
                        table.value = $r9;
                    }
                    table.value[i] = (byte) 2;
                }
                i++;
            }
            i = 0;
            while (i < table2.this$0) {
                if (code[table2.name[i]] == field && code[table2.length[i]] == field && code[table2.items[i]] == field) {
                    if (table2.value == null) {
                        $r9 = table2.this$0;
                        i2 = $r9;
                        $r9 = new byte[$r9];
                        $r92 = $r9;
                        table2.value = $r9;
                    }
                    table2.value[i] = (byte) 2;
                }
                i++;
            }
        }
    }

    static void write(Table table, Table table2, int $i0, int $i1, int $i2, boolean z) {
        table.put();
        table.next();
        table2.put();
        table2.next();
        field++;
        int $i7 = 0;
        int[] $r2 = table2.type;
        int $i3 = table2.next;
        for (int $i8 = 0; $i8 < table.next; $i8++) {
            int $i6;
            FieldInfo $r3 = table.count[$i8];
            if ($r3.count * -1213562125 != 0) {
                int $i4 = table.data[$i8] - $i1;
                if ($i4 <= table2.position) {
                    int $i5 = table.type[$i8] - $i0;
                    $i6 = table2.log;
                    if ($i5 >= $i6) {
                        $i6 = table2.lock;
                        if ($i5 <= $i6) {
                            int i = table.size[$i8] - $i2;
                            if (i >= table2.queue) {
                                if (i <= table2.limit) {
                                    int $i9 = 0;
                                    while ($i9 < $i3) {
                                        FieldInfo $r7 = table2.count[$i9];
                                        if ($i5 == $r2[$i9] && i == table2.size[$i9] && $i4 == table2.data[$i9] && $r7.count * -1213562125 != 0) {
                                            FieldInfo[] $r4;
                                            FieldInfo fieldInfo;
                                            if (table.index == null) {
                                                table.index = new FieldInfo[table.next];
                                            }
                                            if (table2.index == null) {
                                                table2.index = new FieldInfo[$i3];
                                            }
                                            FieldInfo $r8 = table.index[$i8];
                                            if ($r8 == null) {
                                                $r4 = table.index;
                                                fieldInfo = new FieldInfo($r3);
                                                $r4[$i8] = fieldInfo;
                                            }
                                            FieldInfo $r9 = table2.index[$i9];
                                            if ($r9 == null) {
                                                $r4 = table2.index;
                                                fieldInfo = new FieldInfo($r7);
                                                $r4[$i9] = fieldInfo;
                                            }
                                            $r8.name += $r7.name * 1;
                                            $r8.value += $r7.value * 1;
                                            $r8.data += $r7.data * 1;
                                            $r8.count = ($r7.count * 1) + $r8.count;
                                            $r9.name += $r3.name * 1;
                                            $r9.value += $r3.value * 1;
                                            $r9.data += $r3.data * 1;
                                            $r9.count += $r3.count * 1;
                                            $i7++;
                                            offset[$i8] = field;
                                            code[$i9] = field;
                                        }
                                        $i9++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if ($i7 >= 3 && z) {
            $i0 = 0;
            while ($i0 < table.this$0) {
                if (offset[table.name[$i0]] == field && offset[table.length[$i0]] == field && offset[table.items[$i0]] == field) {
                    if (table.value == null) {
                        $i6 = table.this$0;
                        table.value = new byte[$i6];
                    }
                    table.value[$i0] = (byte) 2;
                }
                $i0++;
            }
            $i0 = 0;
            while ($i0 < table2.this$0) {
                if (code[table2.name[$i0]] == field && code[table2.length[$i0]] == field && code[table2.items[$i0]] == field) {
                    if (table2.value == null) {
                        $i6 = table2.this$0;
                        table2.value = new byte[$i6];
                    }
                    table2.value[$i0] = (byte) 2;
                }
                $i0++;
            }
        }
    }

    public void accept() {
        int $i1;
        for ($i1 = 0; $i1 < this.next; $i1++) {
            this.size[$i1] = -this.size[$i1];
        }
        for (int $i0 = 0; $i0 < this.this$0; $i0++) {
            $i1 = this.name[$i0];
            this.name[$i0] = this.items[$i0];
            this.items[$i0] = $i1;
        }
        append();
    }

    final int add(Table table, int $i0) {
        int $i3 = table.type[$i0];
        int $i1 = table.data[$i0];
        int $i2 = table.size[$i0];
        int $i4 = 0;
        while ($i4 < this.next) {
            if ($i3 == this.type[$i4] && $i1 == this.data[$i4] && $i2 == this.size[$i4]) {
                break;
            }
            $i4++;
        }
        $i4 = -1;
        if ($i4 != -1) {
            return $i4;
        }
        this.type[this.next] = $i3;
        this.data[this.next] = $i1;
        this.size[this.next] = $i2;
        if (table.root != null) {
            this.root[this.next] = table.root[$i0];
        }
        $i0 = this.next;
        this.next = $i0 + 1;
        return $i0;
    }

    protected final Integer add() {
        return null;
    }

    public Table add(int[][] iArr, int i, int i2, int i3, boolean z, int $i3) {
        put();
        int $i5 = this.log + i;
        int $i6 = this.lock + i;
        int $i4 = this.queue + i3;
        int $i7 = this.limit + i3;
        if ($i5 < 0 || (($i6 + Constants.f93X) >> 7) >= iArr.length || $i4 < 0 || (($i7 + Constants.f93X) >> 7) >= iArr[0].length) {
            return this;
        }
        $i5 >>= 7;
        $i6 = ($i6 + 127) >> 7;
        $i4 >>= 7;
        $i7 = ($i7 + 127) >> 7;
        if (!(iArr[$i5][$i4] == i2 && iArr[$i6][$i4] == i2 && iArr[$i5][$i7] == i2 && iArr[$i6][$i7] == i2)) {
            Table $r4;
            if (z) {
                $r4 = new Table();
                $r4.next = this.next;
                $r4.this$0 = this.this$0;
                $r4.content = this.content;
                $r4.type = this.type;
                $r4.size = this.size;
                $r4.name = this.name;
                $r4.length = this.length;
                $r4.items = this.items;
                $r4.value = this.value;
                $r4.listener = this.listener;
                $r4.parent = this.parent;
                $r4.text = this.text;
                $r4.id = this.id;
                $r4.list = this.list;
                $r4.status = this.status;
                $r4.values = this.values;
                $r4.f308i = this.f308i;
                $r4.buffer = this.buffer;
                $r4.key = this.key;
                $r4.root = this.root;
                $r4.state = this.state;
                int[][] $r7 = this.f309x;
                $r4.f309x = $r7;
                $r7 = this.f310y;
                $r4.f310y = $r7;
                short $s12 = this.start;
                $r4.start = $s12;
                $s12 = this.pos;
                $r4.pos = $s12;
                $r4.data = new int[$r4.next];
            } else {
                $r4 = this;
            }
            int $i8;
            if ($i3 == 0) {
                for ($i3 = 0; $i3 < $r4.next; $i3++) {
                    $i5 = this.type[$i3] + i;
                    $i8 = this.size[$i3] + i3;
                    $i7 = $i5 & 127;
                    $i4 = $i8 & 127;
                    $i6 = $i5 >> 7;
                    $i5 = $i8 >> 7;
                    $i4 = (((iArr[$i6 + 1][$i5 + 1] * $i7) + (iArr[$i6][$i5 + 1] * (Constants.f93X - $i7))) >> 7) * $i4;
                    $r4.data[$i3] = ((($i4 + ((Constants.f93X - $i4) * (((iArr[$i6][$i5] * (Constants.f93X - $i7)) + (iArr[$i6 + 1][$i5] * $i7)) >> 7))) >> 7) + this.data[$i3]) - i2;
                }
            } else {
                for ($i4 = 0; $i4 < $r4.next; $i4++) {
                    $i7 = ((-this.data[$i4]) << 16) / (this.size * 1500767459);
                    if ($i7 < $i3) {
                        $i8 = this.type[$i4] + i;
                        int $i9 = this.size[$i4] + i3;
                        $i6 = $i8 & 127;
                        $i5 = $i9 & 127;
                        $i8 >>= 7;
                        $i9 >>= 7;
                        int $i13 = iArr[$i8 + 1][$i9] * $i6;
                        int i4 = $i13;
                        $i5 = (((iArr[$i8 + 1][$i9 + 1] * $i6) + (iArr[$i8][$i9 + 1] * (Constants.f93X - $i6))) >> 7) * $i5;
                        $i7 = $i3 - $i7;
                        $r4.data[$i4] = (($i7 * ((($i5 + ((Constants.f93X - $i5) * (((iArr[$i8][$i9] * (Constants.f93X - $i6)) + $i13) >> 7))) >> 7) - i2)) / $i3) + this.data[$i4];
                    }
                }
            }
            $r4.append();
            return $r4;
        }
        return this;
    }

    public void add(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.next; $i3++) {
            int[] $r1 = this.type;
            $r1[$i3] = $r1[$i3] + i;
            $r1 = this.data;
            $r1[$i3] = $r1[$i3] + i2;
            $r1 = this.size;
            $r1[$i3] = $r1[$i3] + i3;
        }
        append();
    }

    void add(byte[] bArr) {
        short[] sArr;
        short[] $r8;
        Logger $r2 = new Logger(bArr);
        Logger $r3 = new Logger(bArr);
        Logger $r4 = new Logger(bArr);
        Logger $r5 = new Logger(bArr);
        Logger $r6 = new Logger(bArr);
        $r2.data = (bArr.length - 18) * 2065011939;
        int $i4 = $r2.get(1228705290);
        int $i3 = $r2.get(-701664899);
        int $i5 = $r2.get((byte) 0);
        int $i6 = $r2.get((byte) 0);
        int $i7 = $r2.get((byte) 0);
        int $i8 = $r2.get((byte) 0);
        int $i9 = $r2.get((byte) 0);
        int $i10 = $r2.get((byte) 0);
        int $i11 = $r2.get(-1075945492);
        int $i12 = $r2.get(812398279);
        $r2.get(1972499908);
        int $i2 = $r2.get(13848044);
        int $i0 = 0 + $i4;
        int i = $i0 + $i3;
        int i2 = $i7 == 255 ? i + $i3 : i;
        int $i15 = $i9 == 1 ? i2 + $i3 : i2;
        int $i16 = $i6 == 1 ? $i15 + $i3 : $i15;
        int $i17 = $i10 == 1 ? $i16 + $i4 : $i16;
        int $i18 = $i8 == 1 ? $i17 + $i3 : $i17;
        int $i1 = $i18 + $i2;
        $i2 = $i1 + ($i3 * 2);
        int $i19 = ($i5 * 6) + $i2;
        $i11 += $i19;
        $i12 += $i11;
        this.next = $i4;
        this.this$0 = $i3;
        this.content = $i5;
        int[] iArr = new int[$i4];
        int[] $r7 = iArr;
        this.type = iArr;
        iArr = new int[$i4];
        $r7 = iArr;
        this.data = iArr;
        iArr = new int[$i4];
        $r7 = iArr;
        this.size = iArr;
        iArr = new int[$i3];
        $r7 = iArr;
        this.name = iArr;
        iArr = new int[$i3];
        $r7 = iArr;
        this.length = iArr;
        iArr = new int[$i3];
        $r7 = iArr;
        this.items = iArr;
        if ($i5 > 0) {
            byte[] bArr2 = new byte[$i5];
            bArr = bArr2;
            this.values = bArr2;
            sArr = new short[$i5];
            $r8 = sArr;
            this.f308i = sArr;
            sArr = new short[$i5];
            $r8 = sArr;
            this.buffer = sArr;
            sArr = new short[$i5];
            $r8 = sArr;
            this.key = sArr;
        }
        if ($i10 == 1) {
            iArr = new int[$i4];
            $r7 = iArr;
            this.root = iArr;
        }
        if ($i6 == 1) {
            bArr2 = new byte[$i3];
            bArr = bArr2;
            this.value = bArr2;
            bArr2 = new byte[$i3];
            bArr = bArr2;
            this.text = bArr2;
            sArr = new short[$i3];
            $r8 = sArr;
            this.list = sArr;
        }
        if ($i7 == 255) {
            bArr2 = new byte[$i3];
            bArr = bArr2;
            this.listener = bArr2;
        } else {
            byte b = (byte) $i7;
            byte $b25 = b;
            this.status = b;
        }
        if ($i8 == 1) {
            bArr2 = new byte[$i3];
            bArr = bArr2;
            this.parent = bArr2;
        }
        if ($i9 == 1) {
            iArr = new int[$i3];
            $r7 = iArr;
            this.state = iArr;
        }
        sArr = new short[$i3];
        $r8 = sArr;
        this.id = sArr;
        $r2.data = 0;
        $r3.data = 2065011939 * $i19;
        int i3 = $i11 * 2065011939;
        $i11 = i3;
        $r4.data = i3;
        $r5.data = 2065011939 * $i12;
        i3 = $i16 * 2065011939;
        $i16 = i3;
        $r6.data = i3;
        $i11 = 0;
        $i12 = 0;
        $i19 = 0;
        for ($i16 = 0; $i16 < $i4; $i16++) {
            int $i20 = $r2.get((byte) 0);
            int $i21 = 0;
            if (($i20 & 1) != 0) {
                $i21 = $r3.log(-2043020499);
            }
            int $i22 = ($i20 & 2) != 0 ? $r4.log(-1331497806) : 0;
            int $i23 = 0;
            if (($i20 & 4) != 0) {
                $i23 = $r5.log(-1463575120);
            }
            this.type[$i16] = $i21 + $i19;
            this.data[$i16] = $i22 + $i12;
            this.size[$i16] = $i23 + $i11;
            $i19 = this.type[$i16];
            $i12 = this.data[$i16];
            $i11 = this.size[$i16];
            if ($i10 == 1) {
                this.root[$i16] = $r6.get((byte) 0);
            }
        }
        $r2.data = 2065011939 * $i1;
        $r3.data = 2065011939 * $i15;
        i3 = i * 2065011939;
        i = i3;
        $r4.data = i3;
        $r5.data = 2065011939 * $i17;
        i3 = i2 * 2065011939;
        i2 = i3;
        $r6.data = i3;
        Object obj = null;
        Object obj2 = null;
        for (i2 = 0; i2 < $i3; i2++) {
            this.id[i2] = (short) $r2.get(-881325767);
            if ($i6 == 1) {
                $i17 = $r3.get((byte) 0);
                if (($i17 & 1) == 1) {
                    this.value[i2] = (byte) 1;
                    obj2 = 1;
                } else {
                    this.value[i2] = (byte) 0;
                }
                if (($i17 & 2) == 2) {
                    this.text[i2] = (byte) ($i17 >> 2);
                    this.list[i2] = this.id[i2];
                    this.id[i2] = (short) 127;
                    if (this.list[i2] != (short) -1) {
                        obj = 1;
                    }
                } else {
                    this.text[i2] = (byte) -1;
                    this.list[i2] = (short) -1;
                }
            }
            if ($i7 == 255) {
                this.listener[i2] = $r4.next(1247983979);
            }
            if ($i8 == 1) {
                this.parent[i2] = $r5.next(1247983979);
            }
            if ($i9 == 1) {
                this.state[i2] = $r6.get((byte) 0);
            }
        }
        $r2.data = 2065011939 * $i18;
        $r3.data = 2065011939 * $i0;
        $i8 = 0;
        $i6 = 0;
        $i18 = 0;
        $i7 = 0;
        $i0 = 0;
        while ($i0 < $i3) {
            $i9 = $r3.get((byte) 0);
            if ($i9 == 1) {
                $i7 = $r2.log(-1624411858) + $i6;
                $i8 = $r2.log(-1438228156) + $i7;
                $i6 = $r2.log(-1876444550) + $i8;
                this.name[$i0] = $i7;
                this.length[$i0] = $i8;
                this.items[$i0] = $i6;
                $i18 = $i6;
            }
            if ($i9 == 2) {
                $i6 += $r2.log(-1418977308);
                this.name[$i0] = $i7;
                this.length[$i0] = $i18;
                this.items[$i0] = $i6;
                $i8 = $i18;
                $i18 = $i6;
            }
            if ($i9 == 3) {
                $i6 += $r2.log(-1317572677);
                this.name[$i0] = $i18;
                this.length[$i0] = $i8;
                this.items[$i0] = $i6;
                $i7 = $i18;
                $i18 = $i6;
            }
            if ($i9 == 4) {
                $i6 += $r2.log(-2146396324);
                this.name[$i0] = $i8;
                this.length[$i0] = $i7;
                this.items[$i0] = $i6;
                $i18 = $i6;
            } else {
                $i9 = $i8;
                $i8 = $i7;
                $i7 = $i9;
            }
            $i0++;
            $i9 = $i7;
            $i7 = $i8;
            $i8 = $i9;
        }
        $r2.data = 2065011939 * $i2;
        for ($i2 = 0; $i2 < $i5; $i2++) {
            this.values[$i2] = (byte) 0;
            this.f308i[$i2] = (short) $r2.get(-718968762);
            this.buffer[$i2] = (short) $r2.get(1449057497);
            this.key[$i2] = (short) $r2.get(1611364543);
        }
        if (this.text != null) {
            Object obj3 = null;
            $i5 = 0;
            while ($i5 < $i3) {
                short $s24 = this.text[$i5] & (short) 255;
                if ($s24 != (short) 255) {
                    if ((this.f308i[$s24] & 65535) == this.name[$i5] && (this.buffer[$s24] & 65535) == this.length[$i5] && (this.key[$s24] & 65535) == this.items[$i5]) {
                        this.text[$i5] = (byte) -1;
                    } else {
                        obj3 = 1;
                    }
                }
                $i5++;
            }
            if (obj3 == null) {
                this.text = null;
            }
        }
        if (obj == null) {
            this.list = null;
        }
        if (obj2 == null) {
            this.value = null;
        }
    }

    public void addAll() {
        int $i1;
        for ($i1 = 0; $i1 < this.next; $i1++) {
            this.size[$i1] = -this.size[$i1];
        }
        for (int $i0 = 0; $i0 < this.this$0; $i0++) {
            $i1 = this.name[$i0];
            this.name[$i0] = this.items[$i0];
            this.items[$i0] = $i1;
        }
        append();
    }

    void append() {
        this.count = null;
        this.index = null;
        this.last = null;
        this.first = false;
    }

    public void binaryElement(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.next; $i3++) {
            this.type[$i3] = (this.type[$i3] * i) / Constants.f93X;
            this.data[$i3] = (this.data[$i3] * i2) / Constants.f93X;
            this.size[$i3] = (this.size[$i3] * i3) / Constants.f93X;
        }
        append();
    }

    void clear() {
        if (!this.first) {
            this.size = 0;
            this.position = 0;
            this.log = 999999;
            this.lock = -999999;
            this.limit = -99999;
            this.queue = 99999;
            for (int $i0 = 0; $i0 < this.next; $i0++) {
                int $i2 = this.type[$i0];
                int $i1 = this.data[$i0];
                int $i3 = this.size[$i0];
                if ($i2 < this.log) {
                    this.log = $i2;
                }
                if ($i2 > this.lock) {
                    this.lock = $i2;
                }
                if ($i3 < this.queue) {
                    this.queue = $i3;
                }
                if ($i3 > this.limit) {
                    this.limit = $i3;
                }
                if ((-$i1) > this.size * 1500767459) {
                    this.size = (-$i1) * 1329103051;
                }
                if ($i1 > this.position) {
                    this.position = $i1;
                }
            }
            this.first = true;
        }
    }

    public void clear(int $i0) {
        int $i1 = instance[$i0];
        $i0 = context[$i0];
        for (int $i2 = 0; $i2 < this.next; $i2++) {
            int $i3 = ((this.size[$i2] * $i1) + (this.type[$i2] * $i0)) >> 16;
            this.size[$i2] = ((this.size[$i2] * $i0) - (this.type[$i2] * $i1)) >> 16;
            this.type[$i2] = $i3;
        }
        append();
    }

    public void clear(short s, short s2) {
        if (this.list != null) {
            for (int $i2 = 0; $i2 < this.this$0; $i2++) {
                if (this.list[$i2] == s) {
                    this.list[$i2] = s2;
                }
            }
        }
    }

    protected final Integer clone() {
        return null;
    }

    void close() {
        this.count = null;
        this.index = null;
        this.last = null;
        this.first = false;
    }

    public void create(short s, short s2) {
        if (this.list != null) {
            for (int $i2 = 0; $i2 < this.this$0; $i2++) {
                if (this.list[$i2] == s) {
                    this.list[$i2] = s2;
                }
            }
        }
    }

    public void createLinks() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            this.type[$i0] = -this.type[$i0];
            this.size[$i0] = -this.size[$i0];
        }
        append();
    }

    void decode() {
        int[] $r1;
        int $i2;
        int $i0;
        int $i3;
        if (this.root != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.next; $i0++) {
                $i3 = this.root[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f309x = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f309x[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for ($i2 = 0; $i2 < this.next; $i2++) {
                $i3 = this.root[$i2];
                int[] $r2 = this.f309x[$i3];
                int $i4 = $r1[$i3];
                $r1[$i3] = $i4 + 1;
                $r2[$i4] = $i2;
            }
        }
        if (this.state != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.this$0; $i0++) {
                $i3 = this.state[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f310y = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f310y[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for (int $i1 = 0; $i1 < this.this$0; $i1++) {
                $i2 = this.state[$i1];
                $r2 = this.f310y[$i2];
                $i0 = $r1[$i2];
                $r1[$i2] = $i0 + 1;
                $r2[$i0] = $i1;
            }
        }
    }

    public void doDeferredCheckBlobs() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.size[$i0];
            this.size[$i0] = this.type[$i0];
            this.type[$i0] = -$i1;
        }
        append();
    }

    public void doInBackground() {
        if (this.count == null) {
            int $i10;
            int $i102 = this.next;
            this.count = new FieldInfo[$i102];
            for ($i10 = 0; $i10 < this.next; $i10++) {
                this.count[$i10] = new FieldInfo();
            }
            $i10 = 0;
            while ($i10 < this.this$0) {
                int $i7 = this.name[$i10];
                int $i9 = this.length[$i10];
                int $i0 = this.items[$i10];
                int $i5 = this.type[$i9] - this.type[$i7];
                int $i4 = this.data[$i9] - this.data[$i7];
                int $i8 = this.size[$i9] - this.size[$i7];
                int $i2 = this.type[$i0] - this.type[$i7];
                int $i3 = this.data[$i0] - this.data[$i7];
                int $i11 = this.size[$i0] - this.size[$i7];
                $i2 = ($i5 * $i3) - ($i4 * $i2);
                $i4 = ($i4 * $i11) - ($i3 * $i8);
                $i5 = ($i8 * $i2) - ($i11 * $i5);
                $i8 = $i2;
                while (true) {
                    if ($i4 <= 8192 && $i5 <= 8192 && $i8 <= 8192 && $i4 >= -8192 && $i5 >= 332711364 && $i8 >= 1318920009) {
                        break;
                    }
                    $i4 >>= 1;
                    $i5 >>= 1;
                    $i8 >>= 1;
                }
                $i3 = (int) Math.sqrt((double) ((($i4 * $i4) + ($i5 * $i5)) + ($i8 * $i8)));
                if ($i3 <= 0) {
                    $i3 = 1;
                }
                $i2 = ($i4 * 256) / $i3;
                $i4 = ($i5 * -1117487116) / $i3;
                $i5 = ($i8 * 2120999741) / $i3;
                byte $b6 = this.value == null ? (byte) 0 : this.value[$i10];
                if ($b6 == (byte) 0) {
                    FieldInfo $r3 = this.count[$i7];
                    $r3.name += -1902240919 * $i2;
                    $r3.value += 350773987 * $i4;
                    $r3.data += 1738065774 * $i5;
                    $r3.count += 35481147;
                    $r3 = this.count[$i9];
                    $r3.name += -196218177 * $i2;
                    $r3.value += -1773083656 * $i4;
                    $r3.data += 721805631 * $i5;
                    $r3.count += 35481147;
                    $r3 = this.count[$i0];
                    $r3.name = ($i2 * -143990912) + $r3.name;
                    $r3.value = ($i4 * -2043274062) + $r3.value;
                    $r3.data = ($i5 * 1852648383) + $r3.data;
                    $i102 = $r3.count + 35481147;
                    $i0 = $i102;
                    $r3.count = $i102;
                } else if ($b6 == (byte) 1) {
                    KeyPair[] $r5;
                    if (this.last == null) {
                        KeyPair[] $r52 = this.this$0;
                        $i0 = $r52;
                        $r52 = new KeyPair[$r52];
                        $r5 = $r52;
                        this.last = $r52;
                    }
                    $r5 = this.last;
                    KeyPair keyPair = new KeyPair();
                    $r5[$i10] = keyPair;
                    keyPair.next = 546327713 * $i2;
                    keyPair.count = -1894193981 * $i4;
                    keyPair.data = -1860299741 * $i5;
                }
                $i10++;
            }
        }
    }

    public void draw() {
        int $i1;
        for ($i1 = 0; $i1 < this.next; $i1++) {
            this.size[$i1] = -this.size[$i1];
        }
        for (int $i0 = 0; $i0 < this.this$0; $i0++) {
            $i1 = this.name[$i0];
            this.name[$i0] = this.items[$i0];
            this.items[$i0] = $i1;
        }
        append();
    }

    public void emitSubroutine() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            this.type[$i0] = -this.type[$i0];
            this.size[$i0] = -this.size[$i0];
        }
        append();
    }

    public void equals(short s, short s2) {
        if (this.list != null) {
            for (int $i2 = 0; $i2 < this.this$0; $i2++) {
                if (this.list[$i2] == s) {
                    this.list[$i2] = s2;
                }
            }
        }
    }

    public void executeScript(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.next; $i3++) {
            this.type[$i3] = (this.type[$i3] * i) / Constants.f93X;
            this.data[$i3] = (this.data[$i3] * i2) / Constants.f93X;
            this.size[$i3] = (this.size[$i3] * i3) / Constants.f93X;
        }
        append();
    }

    public void fixPgKey() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            this.type[$i0] = -this.type[$i0];
            this.size[$i0] = -this.size[$i0];
        }
        append();
    }

    final int get(Table table, int $i0) {
        int $i3 = table.type[$i0];
        int $i1 = table.data[$i0];
        int $i2 = table.size[$i0];
        int $i4 = 0;
        while ($i4 < this.next) {
            if ($i3 == this.type[$i4] && $i1 == this.data[$i4] && $i2 == this.size[$i4]) {
                break;
            }
            $i4++;
        }
        $i4 = -1;
        if ($i4 != -1) {
            return $i4;
        }
        this.type[this.next] = $i3;
        this.data[this.next] = $i1;
        this.size[this.next] = $i2;
        if (table.root != null) {
            this.root[this.next] = table.root[$i0];
        }
        $i0 = this.next;
        this.next = $i0 + 1;
        return $i0;
    }

    public void get(short s, short s2) {
        for (int $i2 = 0; $i2 < this.this$0; $i2++) {
            if (this.id[$i2] == s) {
                this.id[$i2] = s2;
            }
        }
    }

    public void getItem() {
        int $i1;
        for ($i1 = 0; $i1 < this.next; $i1++) {
            this.size[$i1] = -this.size[$i1];
        }
        for (int $i0 = 0; $i0 < this.this$0; $i0++) {
            $i1 = this.name[$i0];
            this.name[$i0] = this.items[$i0];
            this.items[$i0] = $i1;
        }
        append();
    }

    public void handleTagNode() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.type[$i0];
            this.type[$i0] = this.size[$i0];
            this.size[$i0] = -$i1;
        }
        append();
    }

    public Table init() {
        Table $r1 = new Table();
        if (this.value != null) {
            $r1.value = new byte[this.this$0];
            for (int $i0 = 0; $i0 < this.this$0; $i0++) {
                $r1.value[$i0] = this.value[$i0];
            }
        }
        $r1.next = this.next;
        $r1.this$0 = this.this$0;
        $r1.content = this.content;
        $r1.type = this.type;
        $r1.data = this.data;
        $r1.size = this.size;
        $r1.name = this.name;
        $r1.length = this.length;
        $r1.items = this.items;
        $r1.listener = this.listener;
        $r1.parent = this.parent;
        $r1.text = this.text;
        $r1.id = this.id;
        $r1.list = this.list;
        $r1.status = this.status;
        $r1.values = this.values;
        $r1.f308i = this.f308i;
        $r1.buffer = this.buffer;
        $r1.key = this.key;
        $r1.root = this.root;
        $r1.state = this.state;
        $r1.f309x = this.f309x;
        $r1.f310y = this.f310y;
        $r1.count = this.count;
        $r1.last = this.last;
        $r1.start = this.start;
        $r1.pos = this.pos;
        return $r1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.Table init(int[][] r21, int r22, int r23, int r24, boolean r25, int r26) {
        /*
        r20 = this;
        r0 = r20;
        r0.put();
        r0 = r20;
        r2 = r0.log;
        r3 = r2 + r22;
        r0 = r20;
        r2 = r0.lock;
        r4 = r2 + r22;
        r0 = r20;
        r2 = r0.queue;
        r0 = r24;
        r2 = r2 + r0;
        r0 = r20;
        r5 = r0.limit;
        r0 = r24;
        r5 = r5 + r0;
        if (r3 < 0) goto L_0x0224;
    L_0x0021:
        r6 = r4 + 128;
        r6 = r6 >> 7;
        r0 = r21;
        r7 = r0.length;
        if (r6 >= r7) goto L_0x0224;
    L_0x002a:
        if (r2 < 0) goto L_0x0224;
    L_0x002c:
        r8 = -1709645197; // 0xffffffff9a18e273 float:-3.1615787E-23 double:NaN;
        r6 = r8 + r5;
        r6 = r6 >> 7;
        r8 = 0;
        r9 = r21[r8];
        r7 = r9.length;
        if (r6 < r7) goto L_0x014a;
    L_0x0039:
        return r20;
    L_0x003a:
        if (r25 == 0) goto L_0x021f;
    L_0x003c:
        r10 = new Table;
        r10.<init>();
        r0 = r20;
        r2 = r0.next;
        r10.next = r2;
        r0 = r20;
        r2 = r0.this$0;
        r10.this$0 = r2;
        r0 = r20;
        r2 = r0.content;
        r10.content = r2;
        r0 = r20;
        r9 = r0.type;
        r10.type = r9;
        r0 = r20;
        r9 = r0.size;
        r10.size = r9;
        r0 = r20;
        r9 = r0.name;
        r10.name = r9;
        r0 = r20;
        r9 = r0.length;
        r10.length = r9;
        r0 = r20;
        r9 = r0.items;
        r10.items = r9;
        r0 = r20;
        r11 = r0.value;
        r10.value = r11;
        r0 = r20;
        r11 = r0.listener;
        r10.listener = r11;
        r0 = r20;
        r11 = r0.parent;
        r10.parent = r11;
        r0 = r20;
        r11 = r0.text;
        r10.text = r11;
        r0 = r20;
        r12 = r0.id;
        r10.id = r12;
        r0 = r20;
        r12 = r0.list;
        r10.list = r12;
        r0 = r20;
        r13 = r0.status;
        r10.status = r13;
        r0 = r20;
        r11 = r0.values;
        r10.values = r11;
        r0 = r20;
        r12 = r0.f308i;
        r10.f308i = r12;
        r0 = r20;
        r12 = r0.buffer;
        r10.buffer = r12;
        r0 = r20;
        r12 = r0.key;
        r10.key = r12;
        r0 = r20;
        r9 = r0.root;
        r10.root = r9;
        r0 = r20;
        r9 = r0.state;
        r10.state = r9;
        r0 = r20;
        r14 = r0.f309x;
        r10.f309x = r14;
        r0 = r20;
        r14 = r0.f310y;
        r10.f310y = r14;
        r0 = r20;
        r15 = r0.start;
        r10.start = r15;
        r0 = r20;
        r15 = r0.pos;
        r10.pos = r15;
        r2 = r10.next;
        r9 = new int[r2];
        r10.data = r9;
    L_0x00dd:
        if (r26 != 0) goto L_0x0177;
    L_0x00df:
        r26 = 0;
    L_0x00e1:
        r2 = r10.next;
        r0 = r26;
        if (r0 >= r2) goto L_0x021b;
    L_0x00e7:
        r0 = r20;
        r9 = r0.type;
        r2 = r9[r26];
        r3 = r2 + r22;
        r0 = r20;
        r9 = r0.size;
        r2 = r9[r26];
        r4 = r2 + r24;
        r5 = r3 & 127;
        r2 = r4 & 127;
        r3 = r3 >> 7;
        r4 = r4 >> 7;
        r9 = r21[r3];
        r6 = r9[r4];
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r7 = r8 - r5;
        r6 = r6 * r7;
        r7 = r3 + 1;
        r9 = r21[r7];
        r7 = r9[r4];
        r7 = r7 * r5;
        r6 = r6 + r7;
        r6 = r6 >> 7;
        r9 = r21[r3];
        r7 = r4 + 1;
        r7 = r9[r7];
        r8 = -328768952; // 0xffffffffec676248 float:-1.11890394E27 double:NaN;
        r16 = r8 - r5;
        r0 = r16;
        r7 = r7 * r0;
        r3 = r3 + 1;
        r9 = r21[r3];
        r3 = r4 + 1;
        r3 = r9[r3];
        r5 = r3 * r5;
        r5 = r5 + r7;
        r5 = r5 >> 7;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r3 = r8 - r2;
        r3 = r3 * r6;
        r2 = r5 * r2;
        r2 = r2 + r3;
        r2 = r2 >> 7;
        r9 = r10.data;
        r0 = r20;
        r0 = r0.data;
        r17 = r0;
        r5 = r17[r26];
        r2 = r2 + r5;
        r0 = r23;
        r2 = r2 - r0;
        r9[r26] = r2;
        r26 = r26 + 1;
        goto L_0x00e1;
    L_0x014a:
        r3 = r3 >> 7;
        r4 = r4 + 127;
        r4 = r4 >> 7;
        r2 = r2 >> 7;
        r5 = r5 + 127;
        r5 = r5 >> 7;
        r9 = r21[r3];
        r6 = r9[r2];
        r0 = r23;
        if (r6 != r0) goto L_0x003a;
    L_0x015e:
        r9 = r21[r4];
        r2 = r9[r2];
        r0 = r23;
        if (r2 != r0) goto L_0x003a;
    L_0x0166:
        r9 = r21[r3];
        r2 = r9[r5];
        r0 = r23;
        if (r2 != r0) goto L_0x003a;
    L_0x016e:
        r9 = r21[r4];
        r2 = r9[r5];
        r0 = r23;
        if (r2 != r0) goto L_0x003a;
    L_0x0176:
        return r20;
    L_0x0177:
        r2 = 0;
    L_0x0178:
        r5 = r10.next;
        if (r2 >= r5) goto L_0x021b;
    L_0x017c:
        r0 = r20;
        r9 = r0.data;
        r5 = r9[r2];
        r5 = -r5;
        r5 = r5 << 16;
        r0 = r20;
        r3 = r0.size;
        r8 = -1232474727; // 0xffffffffb689ed99 float:-4.110578E-6 double:NaN;
        r3 = r3 * r8;
        r5 = r5 / r3;
        r0 = r26;
        if (r5 >= r0) goto L_0x0216;
    L_0x0192:
        r0 = r20;
        r9 = r0.type;
        r3 = r9[r2];
        r6 = r3 + r22;
        r0 = r20;
        r9 = r0.size;
        r3 = r9[r2];
        r7 = r3 + r24;
        r8 = 1766721258; // 0x694e06ea float:1.5566961E25 double:8.728762794E-315;
        r4 = r8 & r6;
        r8 = 1319599651; // 0x4ea77e23 float:1.40503078E9 double:6.51968854E-315;
        r3 = r8 & r7;
        r6 = r6 >> 7;
        r7 = r7 >> 7;
        r9 = r21[r6];
        r16 = r9[r7];
        r8 = -1562704625; // 0xffffffffa2db050f float:-5.9365425E-18 double:NaN;
        r18 = r8 - r4;
        r0 = r16;
        r1 = r18;
        r0 = r0 * r1;
        r16 = r0;
        r18 = r6 + 1;
        r9 = r21[r18];
        r18 = r9[r7];
        r0 = r18;
        r0 = r0 * r4;
        r18 = r0;
        r0 = r16;
        r1 = r18;
        r0 = r0 + r1;
        r16 = r0;
        r16 = r16 >> 7;
        r9 = r21[r6];
        r18 = r7 + 1;
        r18 = r9[r18];
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r19 = r8 - r4;
        r0 = r18;
        r1 = r19;
        r0 = r0 * r1;
        r18 = r0;
        r6 = r6 + 1;
        r9 = r21[r6];
        r6 = r7 + 1;
        r6 = r9[r6];
        r4 = r6 * r4;
        r0 = r18;
        r4 = r4 + r0;
        r4 = r4 >> 7;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = r8 - r3;
        r0 = r16;
        r6 = r6 * r0;
        r3 = r4 * r3;
        r3 = r3 + r6;
        r4 = r3 >> 7;
        r9 = r10.data;
        r0 = r20;
        r0 = r0.data;
        r17 = r0;
        r3 = r17[r2];
        r0 = r23;
        r4 = r4 - r0;
        r5 = r26 - r5;
        r5 = r5 * r4;
        r0 = r26;
        r5 = r5 / r0;
        r5 = r5 + r3;
        r9[r2] = r5;
    L_0x0216:
        r2 = r2 + 1;
        goto L_0x0178;
    L_0x021b:
        r10.append();
        return r10;
    L_0x021f:
        r10 = r20;
        goto L_0x00dd;
    L_0x0224:
        return r20;
        */
        throw new UnsupportedOperationException("Method not decompiled: Table.init(int[][], int, int, int, boolean, int):Table");
    }

    void init(byte[] bArr) {
        int $i18;
        short[] sArr;
        short[] $r10;
        Logger $r2 = new Logger(bArr);
        Logger $r3 = new Logger(bArr);
        Logger $r4 = new Logger(bArr);
        Logger $r5 = new Logger(bArr);
        Logger $r6 = new Logger(bArr);
        Logger $r7 = new Logger(bArr);
        Logger $r8 = new Logger(bArr);
        $r2.data = (bArr.length - 23) * 2065011939;
        int $i9 = $r2.get(7614240);
        int $i10 = $r2.get(-2048797205);
        int $i8 = $r2.get((byte) 0);
        int $i11 = $r2.get((byte) 0);
        int $i12 = $r2.get((byte) 0);
        int $i13 = $r2.get((byte) 0);
        int $i14 = $r2.get((byte) 0);
        int $i15 = $r2.get((byte) 0);
        int $i16 = $r2.get((byte) 0);
        int $i3 = $r2.get(-727488793);
        int $i2 = $r2.get(1137852443);
        int $i1 = $r2.get(-2022309732);
        int $i5 = $r2.get(140477158);
        int $i4 = $r2.get(758180690);
        int $i6 = 0;
        int $i17 = 0;
        int $i7 = 0;
        if ($i8 > 0) {
            byte[] bArr2 = new byte[$i8];
            bArr = bArr2;
            this.values = bArr2;
            $r2.data = 0;
            for ($i18 = 0; $i18 < $i8; $i18++) {
                bArr = this.values;
                byte $b19 = $r2.next(1247983979);
                bArr[$i18] = $b19;
                if ($b19 == (byte) 0) {
                    $i6++;
                }
                if ($b19 >= (byte) 1 && $b19 <= (byte) 3) {
                    $i17++;
                }
                if ($b19 == (byte) 2) {
                    $i7++;
                }
            }
        }
        int $i20 = $i8 + $i9;
        $i18 = $i11 == 1 ? $i20 + $i10 : $i20;
        int $i0 = $i18 + $i10;
        int $i21 = $i12 == 255 ? $i0 + $i10 : $i0;
        int $i22 = $i14 == 1 ? $i21 + $i10 : $i21;
        int $i23 = $i16 == 1 ? $i22 + $i9 : $i22;
        int $i24 = $i13 == 1 ? $i23 + $i10 : $i23;
        int $i25 = $i5 + $i24;
        int $i26 = $i15 == 1 ? ($i10 * 2) + $i25 : $i25;
        int $i27 = $i4 + $i26;
        int $i28 = ($i10 * 2) + $i27;
        int $i29 = $i3 + $i28;
        int $i30 = $i2 + $i29;
        $i1 = $i30 + $i1;
        $i2 = $i1 + ($i6 * 6);
        $i3 = $i2 + ($i17 * 6);
        $i4 = $i3 + ($i17 * 6);
        $i5 = $i4 + ($i17 * 2);
        $i6 = $i5 + $i17;
        $i7 = $i6 + (($i7 * 2) + ($i17 * 2));
        this.next = $i9;
        this.this$0 = $i10;
        this.content = $i8;
        int[] iArr = new int[$i9];
        int[] $r9 = iArr;
        this.type = iArr;
        iArr = new int[$i9];
        $r9 = iArr;
        this.data = iArr;
        iArr = new int[$i9];
        $r9 = iArr;
        this.size = iArr;
        iArr = new int[$i10];
        $r9 = iArr;
        this.name = iArr;
        iArr = new int[$i10];
        $r9 = iArr;
        this.length = iArr;
        iArr = new int[$i10];
        $r9 = iArr;
        this.items = iArr;
        if ($i16 == 1) {
            iArr = new int[$i9];
            $r9 = iArr;
            this.root = iArr;
        }
        if ($i11 == 1) {
            bArr2 = new byte[$i10];
            bArr = bArr2;
            this.value = bArr2;
        }
        if ($i12 == 255) {
            bArr2 = new byte[$i10];
            bArr = bArr2;
            this.listener = bArr2;
        } else {
            byte b = (byte) $i12;
            $b19 = b;
            this.status = b;
        }
        if ($i13 == 1) {
            bArr2 = new byte[$i10];
            bArr = bArr2;
            this.parent = bArr2;
        }
        if ($i14 == 1) {
            iArr = new int[$i10];
            $r9 = iArr;
            this.state = iArr;
        }
        if ($i15 == 1) {
            sArr = new short[$i10];
            $r10 = sArr;
            this.list = sArr;
        }
        if ($i15 == 1 && $i8 > 0) {
            bArr2 = new byte[$i10];
            bArr = bArr2;
            this.text = bArr2;
        }
        sArr = new short[$i10];
        $r10 = sArr;
        this.id = sArr;
        if ($i8 > 0) {
            sArr = new short[$i8];
            $r10 = sArr;
            this.f308i = sArr;
            sArr = new short[$i8];
            $r10 = sArr;
            this.buffer = sArr;
            sArr = new short[$i8];
            $r10 = sArr;
            this.key = sArr;
        }
        $r2.data = 2065011939 * $i8;
        $r3.data = 2065011939 * $i28;
        $r4.data = 2065011939 * $i29;
        $r5.data = 2065011939 * $i30;
        $r6.data = 2065011939 * $i22;
        $i28 = 0;
        $i17 = 0;
        $i29 = 0;
        for ($i22 = 0; $i22 < $i9; $i22++) {
            $i30 = $r2.get((byte) 0);
            int $i31 = ($i30 & 1) != 0 ? $r3.log(-2068857047) : 0;
            int $i32 = 0;
            if (($i30 & 2) != 0) {
                $i32 = $r4.log(-1804623246);
            }
            int $i33 = 0;
            if (($i30 & 4) != 0) {
                $i33 = $r5.log(-1565699513);
            }
            this.type[$i22] = $i31 + $i29;
            this.data[$i22] = $i32 + $i17;
            this.size[$i22] = $i33 + $i28;
            $i29 = this.type[$i22];
            $i17 = this.data[$i22];
            $i28 = this.size[$i22];
            if ($i16 == 1) {
                this.root[$i22] = $r6.get((byte) 0);
            }
        }
        $r2.data = 2065011939 * $i27;
        $r3.data = 2065011939 * $i20;
        $r4.data = 2065011939 * $i0;
        $r5.data = 2065011939 * $i23;
        $r6.data = 2065011939 * $i21;
        $r7.data = 2065011939 * $i25;
        $r8.data = 2065011939 * $i26;
        $i21 = 0;
        while ($i21 < $i10) {
            this.id[$i21] = (short) $r2.get(791437654);
            if ($i11 == 1) {
                this.value[$i21] = $r3.next(1247983979);
            }
            if ($i12 == 255) {
                this.listener[$i21] = $r4.next(1247983979);
            }
            if ($i13 == 1) {
                this.parent[$i21] = $r5.next(1247983979);
            }
            if ($i14 == 1) {
                this.state[$i21] = $r6.get((byte) 0);
            }
            if ($i15 == 1) {
                this.list[$i21] = (short) ($r7.get(-542475478) - 1);
            }
            if (!(this.text == null || this.list[$i21] == (short) -1)) {
                this.text[$i21] = (byte) ($r8.get((byte) 0) - 1);
            }
            $i21++;
        }
        $r2.data = 2065011939 * $i24;
        $r3.data = 2065011939 * $i18;
        $i14 = 0;
        $i12 = 0;
        $i18 = 0;
        $i13 = 0;
        $i11 = 0;
        while ($i11 < $i10) {
            $i15 = $r3.get((byte) 0);
            if ($i15 == 1) {
                $i13 = $r2.log(-2075466815) + $i12;
                $i14 = $r2.log(-1365285896) + $i13;
                $i12 = $r2.log(-1717510933) + $i14;
                this.name[$i11] = $i13;
                this.length[$i11] = $i14;
                this.items[$i11] = $i12;
                $i18 = $i12;
            }
            if ($i15 == 2) {
                $i12 += $r2.log(-1670654506);
                this.name[$i11] = $i13;
                this.length[$i11] = $i18;
                this.items[$i11] = $i12;
                $i14 = $i18;
                $i18 = $i12;
            }
            if ($i15 == 3) {
                $i12 += $r2.log(-1978528549);
                this.name[$i11] = $i18;
                this.length[$i11] = $i14;
                this.items[$i11] = $i12;
                $i13 = $i18;
                $i18 = $i12;
            }
            if ($i15 == 4) {
                $i12 += $r2.log(-2065961351);
                this.name[$i11] = $i14;
                this.length[$i11] = $i13;
                this.items[$i11] = $i12;
                $i18 = $i12;
            } else {
                $i15 = $i14;
                $i14 = $i13;
                $i13 = $i15;
            }
            $i11++;
            $i15 = $i13;
            $i13 = $i14;
            $i14 = $i15;
        }
        $r2.data = 2065011939 * $i1;
        $r3.data = 2065011939 * $i2;
        $r4.data = 2065011939 * $i3;
        $r5.data = 2065011939 * $i4;
        $r6.data = 2065011939 * $i5;
        $r7.data = 2065011939 * $i6;
        for ($i10 = 0; $i10 < $i8; $i10++) {
            if ((this.values[$i10] & (short) 255) == (short) 0) {
                this.f308i[$i10] = (short) $r2.get(-456082324);
                this.buffer[$i10] = (short) $r2.get(1372457322);
                this.key[$i10] = (short) $r2.get(303487410);
            }
        }
        $r2.data = 2065011939 * $i7;
        if ($r2.get((byte) 0) != 0) {
            CompassView compassView = new CompassView();
            $r2.get(1719633286);
            $r2.get(-922975538);
            $r2.get(122488629);
            $r2.size(1887791406);
        }
    }

    public void initialize(int $i0) {
        int $i1 = instance[$i0];
        $i0 = context[$i0];
        for (int $i2 = 0; $i2 < this.next; $i2++) {
            int $i3 = ((this.size[$i2] * $i1) + (this.type[$i2] * $i0)) >> 16;
            this.size[$i2] = ((this.size[$i2] * $i0) - (this.type[$i2] * $i1)) >> 16;
            this.type[$i2] = $i3;
        }
        append();
    }

    final int insert(Table table, int $i0) {
        int $i3 = table.type[$i0];
        int $i1 = table.data[$i0];
        int $i2 = table.size[$i0];
        int $i4 = 0;
        while ($i4 < this.next) {
            if ($i3 == this.type[$i4] && $i1 == this.data[$i4] && $i2 == this.size[$i4]) {
                break;
            }
            $i4++;
        }
        $i4 = -1;
        if ($i4 != -1) {
            return $i4;
        }
        this.type[this.next] = $i3;
        this.data[this.next] = $i1;
        this.size[this.next] = $i2;
        if (table.root != null) {
            this.root[this.next] = table.root[$i0];
        }
        $i0 = this.next;
        this.next = $i0 + 1;
        return $i0;
    }

    void insert() {
        int[] $r1;
        int $i2;
        int $i0;
        int $i3;
        if (this.root != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.next; $i0++) {
                $i3 = this.root[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f309x = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f309x[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for ($i2 = 0; $i2 < this.next; $i2++) {
                $i3 = this.root[$i2];
                int[] $r2 = this.f309x[$i3];
                int $i4 = $r1[$i3];
                $r1[$i3] = $i4 + 1;
                $r2[$i4] = $i2;
            }
        }
        if (this.state != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.this$0; $i0++) {
                $i3 = this.state[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f310y = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f310y[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for (int $i1 = 0; $i1 < this.this$0; $i1++) {
                $i2 = this.state[$i1];
                $r2 = this.f310y[$i2];
                $i0 = $r1[$i2];
                $r1[$i2] = $i0 + 1;
                $r2[$i0] = $i1;
            }
        }
    }

    void load() {
        if (!this.first) {
            this.size = 0;
            this.position = 0;
            this.log = 1763967601;
            this.lock = 1275075051;
            this.limit = -1249518600;
            this.queue = 99999;
            for (int $i0 = 0; $i0 < this.next; $i0++) {
                int $i3 = this.type[$i0];
                int $i2 = this.data[$i0];
                int $i1 = this.size[$i0];
                if ($i3 < this.log) {
                    this.log = $i3;
                }
                if ($i3 > this.lock) {
                    this.lock = $i3;
                }
                if ($i1 < this.queue) {
                    this.queue = $i1;
                }
                if ($i1 > this.limit) {
                    this.limit = $i1;
                }
                if ((-$i2) > this.size * 1500767459) {
                    this.size = (-$i2) * 362216638;
                }
                if ($i2 > this.position) {
                    this.position = $i2;
                }
            }
            this.first = true;
        }
    }

    public void next() {
        if (this.count == null) {
            int $i10;
            int $i102 = this.next;
            this.count = new FieldInfo[$i102];
            for ($i10 = 0; $i10 < this.next; $i10++) {
                this.count[$i10] = new FieldInfo();
            }
            $i10 = 0;
            while ($i10 < this.this$0) {
                int $i7 = this.name[$i10];
                int $i9 = this.length[$i10];
                int $i0 = this.items[$i10];
                int $i5 = this.type[$i9] - this.type[$i7];
                int $i4 = this.data[$i9] - this.data[$i7];
                int $i8 = this.size[$i9] - this.size[$i7];
                int $i2 = this.type[$i0] - this.type[$i7];
                int $i3 = this.data[$i0] - this.data[$i7];
                int $i11 = this.size[$i0] - this.size[$i7];
                $i2 = ($i5 * $i3) - ($i4 * $i2);
                $i4 = ($i4 * $i11) - ($i3 * $i8);
                $i5 = ($i8 * $i2) - ($i11 * $i5);
                $i8 = $i2;
                while (true) {
                    if ($i4 <= 8192 && $i5 <= 8192 && $i8 <= 8192 && $i4 >= -8192 && $i5 >= -8192 && $i8 >= -8192) {
                        break;
                    }
                    $i4 >>= 1;
                    $i5 >>= 1;
                    $i8 >>= 1;
                }
                $i3 = (int) Math.sqrt((double) ((($i4 * $i4) + ($i5 * $i5)) + ($i8 * $i8)));
                if ($i3 <= 0) {
                    $i3 = 1;
                }
                $i2 = ($i4 * 256) / $i3;
                $i4 = ($i5 * 256) / $i3;
                $i5 = ($i8 * 256) / $i3;
                byte $b6 = this.value == null ? (byte) 0 : this.value[$i10];
                if ($b6 == (byte) 0) {
                    FieldInfo $r3 = this.count[$i7];
                    $r3.name += -1902240919 * $i2;
                    $r3.value += 350773987 * $i4;
                    $r3.data += 1852648383 * $i5;
                    $r3.count += 35481147;
                    $r3 = this.count[$i9];
                    $r3.name += -1902240919 * $i2;
                    $r3.value += 350773987 * $i4;
                    $r3.data += 1852648383 * $i5;
                    $r3.count += 35481147;
                    $r3 = this.count[$i0];
                    $r3.name = ($i2 * -1902240919) + $r3.name;
                    $r3.value = ($i4 * 350773987) + $r3.value;
                    $r3.data = ($i5 * 1852648383) + $r3.data;
                    $i102 = $r3.count + 35481147;
                    $i0 = $i102;
                    $r3.count = $i102;
                } else if ($b6 == (byte) 1) {
                    KeyPair[] $r5;
                    if (this.last == null) {
                        KeyPair[] $r52 = this.this$0;
                        $i0 = $r52;
                        $r52 = new KeyPair[$r52];
                        $r5 = $r52;
                        this.last = $r52;
                    }
                    $r5 = this.last;
                    KeyPair keyPair = new KeyPair();
                    $r5[$i10] = keyPair;
                    keyPair.next = 546327713 * $i2;
                    keyPair.count = -1894193981 * $i4;
                    keyPair.data = -285743361 * $i5;
                }
                $i10++;
            }
        }
    }

    public void onMoovContainerAtomRead(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.next; $i3++) {
            this.type[$i3] = (this.type[$i3] * i) / 1977485485;
            this.data[$i3] = (this.data[$i3] * i2) / 650826507;
            this.size[$i3] = (this.size[$i3] * i3) / 328228912;
        }
        append();
    }

    public void parse() {
        if (this.count == null) {
            int $i10;
            int $i102 = this.next;
            this.count = new FieldInfo[$i102];
            for ($i10 = 0; $i10 < this.next; $i10++) {
                this.count[$i10] = new FieldInfo();
            }
            $i10 = 0;
            while ($i10 < this.this$0) {
                int $i7 = this.name[$i10];
                int $i9 = this.length[$i10];
                int $i0 = this.items[$i10];
                int $i5 = this.type[$i9] - this.type[$i7];
                int $i4 = this.data[$i9] - this.data[$i7];
                int $i8 = this.size[$i9] - this.size[$i7];
                int $i2 = this.type[$i0] - this.type[$i7];
                int $i3 = this.data[$i0] - this.data[$i7];
                int $i11 = this.size[$i0] - this.size[$i7];
                $i2 = ($i5 * $i3) - ($i4 * $i2);
                $i4 = ($i4 * $i11) - ($i3 * $i8);
                $i5 = ($i8 * $i2) - ($i11 * $i5);
                $i8 = $i2;
                while (true) {
                    if ($i4 <= 8192 && $i5 <= 657428661 && $i8 <= 811082072 && $i4 >= 1464371349 && $i5 >= 797926184 && $i8 >= -8192) {
                        break;
                    }
                    $i4 >>= 1;
                    $i5 >>= 1;
                    $i8 >>= 1;
                }
                $i3 = (int) Math.sqrt((double) ((($i4 * $i4) + ($i5 * $i5)) + ($i8 * $i8)));
                if ($i3 <= 0) {
                    $i3 = 1;
                }
                $i2 = ($i4 * 220798310) / $i3;
                $i4 = ($i5 * -301192009) / $i3;
                $i5 = ($i8 * 256) / $i3;
                byte $b6 = this.value == null ? (byte) 0 : this.value[$i10];
                if ($b6 == (byte) 0) {
                    FieldInfo $r3 = this.count[$i7];
                    $r3.name += -2034151 * $i2;
                    $r3.value += 350773987 * $i4;
                    $r3.data += 1852648383 * $i5;
                    $r3.count += 35481147;
                    $r3 = this.count[$i9];
                    $r3.name += 1597081681 * $i2;
                    $r3.value += 350773987 * $i4;
                    $r3.data += -259129945 * $i5;
                    $r3.count += 35481147;
                    $r3 = this.count[$i0];
                    $r3.name = ($i2 * -54466491) + $r3.name;
                    $r3.value = ($i4 * 350773987) + $r3.value;
                    $r3.data = ($i5 * 919852441) + $r3.data;
                    $i102 = $r3.count + 35481147;
                    $i0 = $i102;
                    $r3.count = $i102;
                } else if ($b6 == (byte) 1) {
                    KeyPair[] $r5;
                    if (this.last == null) {
                        KeyPair[] $r52 = this.this$0;
                        $i0 = $r52;
                        $r52 = new KeyPair[$r52];
                        $r5 = $r52;
                        this.last = $r52;
                    }
                    $r5 = this.last;
                    KeyPair keyPair = new KeyPair();
                    $r5[$i10] = keyPair;
                    keyPair.next = 546327713 * $i2;
                    keyPair.count = 1822135435 * $i4;
                    keyPair.data = -285743361 * $i5;
                }
                $i10++;
            }
        }
    }

    public void parse(int $i0) {
        int $i1 = instance[$i0];
        $i0 = context[$i0];
        for (int $i2 = 0; $i2 < this.next; $i2++) {
            int $i3 = ((this.size[$i2] * $i1) + (this.type[$i2] * $i0)) >> 16;
            this.size[$i2] = ((this.size[$i2] * $i0) - (this.type[$i2] * $i1)) >> 16;
            this.type[$i2] = $i3;
        }
        append();
    }

    public void parse(short s, short s2) {
        if (this.list != null) {
            for (int $i2 = 0; $i2 < this.this$0; $i2++) {
                if (this.list[$i2] == s) {
                    this.list[$i2] = s2;
                }
            }
        }
    }

    void parse(byte[] bArr) {
        short[] sArr;
        short[] $r8;
        Logger $r2 = new Logger(bArr);
        Logger $r3 = new Logger(bArr);
        Logger $r4 = new Logger(bArr);
        Logger $r5 = new Logger(bArr);
        Logger $r6 = new Logger(bArr);
        $r2.data = (bArr.length - 18) * 2065011939;
        int $i4 = $r2.get(1613401916);
        int $i3 = $r2.get(-1414625062);
        int $i5 = $r2.get((byte) 0);
        int $i6 = $r2.get((byte) 0);
        int $i7 = $r2.get((byte) 0);
        int $i8 = $r2.get((byte) 0);
        int $i9 = $r2.get((byte) 0);
        int $i10 = $r2.get((byte) 0);
        int $i11 = $r2.get(825776);
        int $i12 = $r2.get(-492618544);
        $r2.get(-1977000675);
        int $i2 = $r2.get(1285549273);
        int $i0 = 0 + $i4;
        int $i13 = $i0 + $i3;
        int $i14 = $i7 == 255 ? $i13 + $i3 : $i13;
        int $i15 = $i9 == 1 ? $i14 + $i3 : $i14;
        int $i16 = $i6 == 1 ? $i15 + $i3 : $i15;
        int $i17 = $i10 == 1 ? $i16 + $i4 : $i16;
        int $i18 = $i8 == 1 ? $i17 + $i3 : $i17;
        int $i1 = $i18 + $i2;
        $i2 = $i1 + ($i3 * 2);
        int $i19 = ($i5 * 6) + $i2;
        $i11 += $i19;
        $i12 += $i11;
        this.next = $i4;
        this.this$0 = $i3;
        this.content = $i5;
        int[] iArr = new int[$i4];
        int[] $r7 = iArr;
        this.type = iArr;
        iArr = new int[$i4];
        $r7 = iArr;
        this.data = iArr;
        iArr = new int[$i4];
        $r7 = iArr;
        this.size = iArr;
        iArr = new int[$i3];
        $r7 = iArr;
        this.name = iArr;
        iArr = new int[$i3];
        $r7 = iArr;
        this.length = iArr;
        iArr = new int[$i3];
        $r7 = iArr;
        this.items = iArr;
        if ($i5 > 0) {
            byte[] bArr2 = new byte[$i5];
            bArr = bArr2;
            this.values = bArr2;
            sArr = new short[$i5];
            $r8 = sArr;
            this.f308i = sArr;
            sArr = new short[$i5];
            $r8 = sArr;
            this.buffer = sArr;
            sArr = new short[$i5];
            $r8 = sArr;
            this.key = sArr;
        }
        if ($i10 == 1) {
            iArr = new int[$i4];
            $r7 = iArr;
            this.root = iArr;
        }
        if ($i6 == 1) {
            bArr2 = new byte[$i3];
            bArr = bArr2;
            this.value = bArr2;
            bArr2 = new byte[$i3];
            bArr = bArr2;
            this.text = bArr2;
            sArr = new short[$i3];
            $r8 = sArr;
            this.list = sArr;
        }
        if ($i7 == 255) {
            bArr2 = new byte[$i3];
            bArr = bArr2;
            this.listener = bArr2;
        } else {
            byte b = (byte) $i7;
            byte $b25 = b;
            this.status = b;
        }
        if ($i8 == 1) {
            bArr2 = new byte[$i3];
            bArr = bArr2;
            this.parent = bArr2;
        }
        if ($i9 == 1) {
            iArr = new int[$i3];
            $r7 = iArr;
            this.state = iArr;
        }
        sArr = new short[$i3];
        $r8 = sArr;
        this.id = sArr;
        $r2.data = 0;
        $r3.data = 2065011939 * $i19;
        int i = $i11 * 2065011939;
        $i11 = i;
        $r4.data = i;
        $r5.data = 2065011939 * $i12;
        i = $i16 * 2065011939;
        $i16 = i;
        $r6.data = i;
        $i11 = 0;
        $i12 = 0;
        $i19 = 0;
        for ($i16 = 0; $i16 < $i4; $i16++) {
            int $i20 = $r2.get((byte) 0);
            int $i21 = 0;
            if (($i20 & 1) != 0) {
                $i21 = $r3.log(-1591509271);
            }
            int $i22 = 0;
            if (($i20 & 2) != 0) {
                $i22 = $r4.log(-1845148953);
            }
            int $i23 = 0;
            if (($i20 & 4) != 0) {
                $i23 = $r5.log(-1958733268);
            }
            this.type[$i16] = $i21 + $i19;
            this.data[$i16] = $i22 + $i12;
            this.size[$i16] = $i11 + $i23;
            $i19 = this.type[$i16];
            $i12 = this.data[$i16];
            $i11 = this.size[$i16];
            if ($i10 == 1) {
                this.root[$i16] = $r6.get((byte) 0);
            }
        }
        $r2.data = 2065011939 * $i1;
        $r3.data = 2065011939 * $i15;
        i = $i13 * 2065011939;
        $i13 = i;
        $r4.data = i;
        $r5.data = 2065011939 * $i17;
        i = $i14 * 2065011939;
        $i14 = i;
        $r6.data = i;
        Object obj = null;
        Object obj2 = null;
        for ($i14 = 0; $i14 < $i3; $i14++) {
            this.id[$i14] = (short) $r2.get(784637976);
            if ($i6 == 1) {
                $i17 = $r3.get((byte) 0);
                if (($i17 & 1) == 1) {
                    this.value[$i14] = (byte) 1;
                    obj2 = 1;
                } else {
                    this.value[$i14] = (byte) 0;
                }
                if (($i17 & 2) == 2) {
                    this.text[$i14] = (byte) ($i17 >> 2);
                    this.list[$i14] = this.id[$i14];
                    this.id[$i14] = (short) 127;
                    if (this.list[$i14] != (short) -1) {
                        obj = 1;
                    }
                } else {
                    this.text[$i14] = (byte) -1;
                    this.list[$i14] = (short) -1;
                }
            }
            if ($i7 == 255) {
                this.listener[$i14] = $r4.next(1247983979);
            }
            if ($i8 == 1) {
                this.parent[$i14] = $r5.next(1247983979);
            }
            if ($i9 == 1) {
                this.state[$i14] = $r6.get((byte) 0);
            }
        }
        $r2.data = 2065011939 * $i18;
        $r3.data = 2065011939 * $i0;
        $i8 = 0;
        $i6 = 0;
        $i18 = 0;
        $i7 = 0;
        $i0 = 0;
        while ($i0 < $i3) {
            $i9 = $r3.get((byte) 0);
            if ($i9 == 1) {
                $i7 = $r2.log(-1405840210) + $i6;
                $i8 = $r2.log(-1380868993) + $i7;
                $i6 = $r2.log(-1678382600) + $i8;
                this.name[$i0] = $i7;
                this.length[$i0] = $i8;
                this.items[$i0] = $i6;
                $i18 = $i6;
            }
            if ($i9 == 2) {
                $i6 += $r2.log(-1410569054);
                this.name[$i0] = $i7;
                this.length[$i0] = $i18;
                this.items[$i0] = $i6;
                $i8 = $i18;
                $i18 = $i6;
            }
            if ($i9 == 3) {
                $i6 += $r2.log(-1404615264);
                this.name[$i0] = $i18;
                this.length[$i0] = $i8;
                this.items[$i0] = $i6;
                $i7 = $i18;
                $i18 = $i6;
            }
            if ($i9 == 4) {
                $i6 += $r2.log(-1805467565);
                this.name[$i0] = $i8;
                this.length[$i0] = $i7;
                this.items[$i0] = $i6;
                $i18 = $i6;
            } else {
                $i9 = $i8;
                $i8 = $i7;
                $i7 = $i9;
            }
            $i0++;
            $i9 = $i7;
            $i7 = $i8;
            $i8 = $i9;
        }
        $r2.data = 2065011939 * $i2;
        for ($i2 = 0; $i2 < $i5; $i2++) {
            this.values[$i2] = (byte) 0;
            this.f308i[$i2] = (short) $r2.get(-1571234120);
            this.buffer[$i2] = (short) $r2.get(1696506745);
            this.key[$i2] = (short) $r2.get(590808795);
        }
        if (this.text != null) {
            Object obj3 = null;
            $i5 = 0;
            while ($i5 < $i3) {
                short $s24 = this.text[$i5] & (short) 255;
                if ($s24 != (short) 255) {
                    if ((this.f308i[$s24] & 65535) == this.name[$i5] && (this.buffer[$s24] & 65535) == this.length[$i5] && (this.key[$s24] & 65535) == this.items[$i5]) {
                        this.text[$i5] = (byte) -1;
                    } else {
                        obj3 = 1;
                    }
                }
                $i5++;
            }
            if (obj3 == null) {
                this.text = null;
            }
        }
        if (obj == null) {
            this.list = null;
        }
        if (obj2 == null) {
            this.value = null;
        }
    }

    public void placeBarcode() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.type[$i0];
            this.type[$i0] = this.size[$i0];
            this.size[$i0] = -$i1;
        }
        append();
    }

    void previous() {
        this.count = null;
        this.index = null;
        this.last = null;
        this.first = false;
    }

    void process() {
        int[] $r1;
        int $i2;
        int $i0;
        int $i3;
        if (this.root != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.next; $i0++) {
                $i3 = this.root[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f309x = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f309x[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for ($i2 = 0; $i2 < this.next; $i2++) {
                $i3 = this.root[$i2];
                int[] $r2 = this.f309x[$i3];
                int $i4 = $r1[$i3];
                $r1[$i3] = $i4 + 1;
                $r2[$i4] = $i2;
            }
        }
        if (this.state != null) {
            $r1 = new int[-1776266836];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.this$0; $i0++) {
                $i3 = this.state[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f310y = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f310y[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for (int $i1 = 0; $i1 < this.this$0; $i1++) {
                $i2 = this.state[$i1];
                $r2 = this.f310y[$i2];
                $i0 = $r1[$i2];
                $r1[$i2] = $i0 + 1;
                $r2[$i0] = $i1;
            }
        }
    }

    void put() {
        if (!this.first) {
            this.size = 0;
            this.position = 0;
            this.log = 999999;
            this.lock = -999999;
            this.limit = -99999;
            this.queue = 99999;
            for (int $i0 = 0; $i0 < this.next; $i0++) {
                int $i2 = this.type[$i0];
                int $i1 = this.data[$i0];
                int $i3 = this.size[$i0];
                if ($i2 < this.log) {
                    this.log = $i2;
                }
                if ($i2 > this.lock) {
                    this.lock = $i2;
                }
                if ($i3 < this.queue) {
                    this.queue = $i3;
                }
                if ($i3 > this.limit) {
                    this.limit = $i3;
                }
                if ((-$i1) > this.size * 1500767459) {
                    this.size = (-$i1) * 1329103051;
                }
                if ($i1 > this.position) {
                    this.position = $i1;
                }
            }
            this.first = true;
        }
    }

    public void put(short s, short s2) {
        if (this.list != null) {
            for (int $i2 = 0; $i2 < this.this$0; $i2++) {
                if (this.list[$i2] == s) {
                    this.list[$i2] = s2;
                }
            }
        }
    }

    final int read(Table table, int $i0) {
        int $i3 = table.type[$i0];
        int $i1 = table.data[$i0];
        int $i2 = table.size[$i0];
        int $i4 = 0;
        while ($i4 < this.next) {
            if ($i3 == this.type[$i4] && $i1 == this.data[$i4] && $i2 == this.size[$i4]) {
                break;
            }
            $i4++;
        }
        $i4 = -1;
        if ($i4 != -1) {
            return $i4;
        }
        this.type[this.next] = $i3;
        this.data[this.next] = $i1;
        this.size[this.next] = $i2;
        if (table.root != null) {
            this.root[this.next] = table.root[$i0];
        }
        $i0 = this.next;
        this.next = $i0 + 1;
        return $i0;
    }

    protected final Integer read() {
        return null;
    }

    void read(byte[] bArr) {
        int $i19;
        short[] sArr;
        short[] $r10;
        Logger $r2 = new Logger(bArr);
        Logger $r3 = new Logger(bArr);
        Logger $r4 = new Logger(bArr);
        Logger $r5 = new Logger(bArr);
        Logger $r6 = new Logger(bArr);
        Logger $r7 = new Logger(bArr);
        Logger $r8 = new Logger(bArr);
        $r2.data = (bArr.length - 23) * 2065011939;
        int $i10 = $r2.get(1763429499);
        int $i11 = $r2.get(1637906146);
        int $i9 = $r2.get((byte) 0);
        int $i12 = $r2.get((byte) 0);
        int $i13 = $r2.get((byte) 0);
        int $i14 = $r2.get((byte) 0);
        int $i15 = $r2.get((byte) 0);
        int $i16 = $r2.get((byte) 0);
        int $i17 = $r2.get((byte) 0);
        int $i4 = $r2.get(-760202301);
        int $i3 = $r2.get(-844152162);
        int $i2 = $r2.get(-735418554);
        int $i6 = $r2.get(830597404);
        int $i5 = $r2.get(-1582088258);
        int $i7 = 0;
        int $i18 = 0;
        int $i8 = 0;
        if ($i9 > 0) {
            byte[] bArr2 = new byte[$i9];
            bArr = bArr2;
            this.values = bArr2;
            $r2.data = 0;
            for ($i19 = 0; $i19 < $i9; $i19++) {
                bArr = this.values;
                byte $b20 = $r2.next(1247983979);
                bArr[$i19] = $b20;
                if ($b20 == (byte) 0) {
                    $i7++;
                }
                if ($b20 >= (byte) 1 && $b20 <= (byte) 3) {
                    $i18++;
                }
                if ($b20 == (byte) 2) {
                    $i8++;
                }
            }
        }
        int $i29 = $i9 + $i10;
        $i19 = $i12 == 1 ? $i29 + $i11 : $i29;
        int $i1 = $i19 + $i11;
        int $i30 = $i13 == 255 ? $i1 + $i11 : $i1;
        int $i27 = $i15 == 1 ? $i30 + $i11 : $i30;
        int $i31 = $i17 == 1 ? $i27 + $i10 : $i27;
        int $i32 = $i14 == 1 ? $i31 + $i11 : $i31;
        int $i0 = $i32 + $i6;
        int $i33 = $i16 == 1 ? ($i11 * 2) + $i0 : $i0;
        int $i34 = $i5 + $i33;
        int $i25 = ($i11 * 2) + $i34;
        int $i24 = $i4 + $i25;
        int $i26 = $i3 + $i24;
        $i2 = $i26 + $i2;
        $i3 = $i2 + ($i7 * 6);
        $i4 = $i3 + ($i18 * 6);
        $i5 = $i4 + ($i18 * 6);
        $i6 = $i5 + ($i18 * 2);
        $i7 = $i6 + $i18;
        $i8 = $i7 + (($i8 * 2) + ($i18 * 2));
        this.next = $i10;
        this.this$0 = $i11;
        this.content = $i9;
        int[] iArr = new int[$i10];
        int[] $r9 = iArr;
        this.type = iArr;
        iArr = new int[$i10];
        $r9 = iArr;
        this.data = iArr;
        iArr = new int[$i10];
        $r9 = iArr;
        this.size = iArr;
        iArr = new int[$i11];
        $r9 = iArr;
        this.name = iArr;
        iArr = new int[$i11];
        $r9 = iArr;
        this.length = iArr;
        iArr = new int[$i11];
        $r9 = iArr;
        this.items = iArr;
        if ($i17 == 1) {
            iArr = new int[$i10];
            $r9 = iArr;
            this.root = iArr;
        }
        if ($i12 == 1) {
            bArr2 = new byte[$i11];
            bArr = bArr2;
            this.value = bArr2;
        }
        if ($i13 == 255) {
            bArr2 = new byte[$i11];
            bArr = bArr2;
            this.listener = bArr2;
        } else {
            byte b = (byte) $i13;
            $b20 = b;
            this.status = b;
        }
        if ($i14 == 1) {
            bArr2 = new byte[$i11];
            bArr = bArr2;
            this.parent = bArr2;
        }
        if ($i15 == 1) {
            iArr = new int[$i11];
            $r9 = iArr;
            this.state = iArr;
        }
        if ($i16 == 1) {
            sArr = new short[$i11];
            $r10 = sArr;
            this.list = sArr;
        }
        if ($i16 == 1 && $i9 > 0) {
            bArr2 = new byte[$i11];
            bArr = bArr2;
            this.text = bArr2;
        }
        sArr = new short[$i11];
        $r10 = sArr;
        this.id = sArr;
        if ($i9 > 0) {
            sArr = new short[$i9];
            $r10 = sArr;
            this.f308i = sArr;
            sArr = new short[$i9];
            $r10 = sArr;
            this.buffer = sArr;
            sArr = new short[$i9];
            $r10 = sArr;
            this.key = sArr;
        }
        $r2.data = 2065011939 * $i9;
        $r3.data = 2065011939 * $i25;
        $r4.data = 2065011939 * $i24;
        $r5.data = 2065011939 * $i26;
        $r6.data = 2065011939 * $i27;
        $i25 = 0;
        $i18 = 0;
        $i24 = 0;
        for ($i27 = 0; $i27 < $i10; $i27++) {
            int $i22 = $r2.get((byte) 0);
            $i26 = 0;
            if (($i22 & 1) != 0) {
                $i26 = $r3.log(-2139178865);
            }
            int $i28 = 0;
            if (($i22 & 2) != 0) {
                $i28 = $r4.log(-2026759659);
            }
            int $i23 = 0;
            if (($i22 & 4) != 0) {
                $i23 = $r5.log(-1926541597);
            }
            this.type[$i27] = $i26 + $i24;
            this.data[$i27] = $i28 + $i18;
            this.size[$i27] = $i25 + $i23;
            $i24 = this.type[$i27];
            $i18 = this.data[$i27];
            $i25 = this.size[$i27];
            if ($i17 == 1) {
                this.root[$i27] = $r6.get((byte) 0);
            }
        }
        $r2.data = 2065011939 * $i34;
        $r3.data = 2065011939 * $i29;
        $r4.data = 2065011939 * $i1;
        $r5.data = 2065011939 * $i31;
        $r6.data = 2065011939 * $i30;
        $r7.data = 2065011939 * $i0;
        $r8.data = 2065011939 * $i33;
        $i0 = 0;
        while ($i0 < $i11) {
            this.id[$i0] = (short) $r2.get(-1293911319);
            if ($i12 == 1) {
                this.value[$i0] = $r3.next(1247983979);
            }
            if ($i13 == 255) {
                this.listener[$i0] = $r4.next(1247983979);
            }
            if ($i14 == 1) {
                this.parent[$i0] = $r5.next(1247983979);
            }
            if ($i15 == 1) {
                this.state[$i0] = $r6.get((byte) 0);
            }
            if ($i16 == 1) {
                this.list[$i0] = (short) ($r7.get(-1551557615) - 1);
            }
            if (!(this.text == null || this.list[$i0] == (short) -1)) {
                this.text[$i0] = (byte) ($r8.get((byte) 0) - 1);
            }
            $i0++;
        }
        $r2.data = 2065011939 * $i32;
        $r3.data = 2065011939 * $i19;
        $i15 = 0;
        $i13 = 0;
        $i19 = 0;
        $i14 = 0;
        $i12 = 0;
        while ($i12 < $i11) {
            $i16 = $r3.get((byte) 0);
            if ($i16 == 1) {
                $i14 = $r2.log(-1499034880) + $i13;
                $i15 = $r2.log(-2053962786) + $i14;
                $i13 = $r2.log(-1857007922) + $i15;
                this.name[$i12] = $i14;
                this.length[$i12] = $i15;
                this.items[$i12] = $i13;
                $i19 = $i13;
            }
            if ($i16 == 2) {
                $i13 += $r2.log(-2140776068);
                this.name[$i12] = $i14;
                this.length[$i12] = $i19;
                this.items[$i12] = $i13;
                $i15 = $i19;
                $i19 = $i13;
            }
            if ($i16 == 3) {
                $i13 += $r2.log(-2086993718);
                this.name[$i12] = $i19;
                this.length[$i12] = $i15;
                this.items[$i12] = $i13;
                $i14 = $i19;
                $i19 = $i13;
            }
            if ($i16 == 4) {
                $i13 += $r2.log(-1313348078);
                this.name[$i12] = $i15;
                this.length[$i12] = $i14;
                this.items[$i12] = $i13;
                $i19 = $i13;
            } else {
                $i16 = $i15;
                $i15 = $i14;
                $i14 = $i16;
            }
            $i12++;
            $i16 = $i14;
            $i14 = $i15;
            $i15 = $i16;
        }
        $r2.data = 2065011939 * $i2;
        $r3.data = 2065011939 * $i3;
        $r4.data = 2065011939 * $i4;
        $r5.data = 2065011939 * $i5;
        $r6.data = 2065011939 * $i6;
        $r7.data = 2065011939 * $i7;
        for ($i11 = 0; $i11 < $i9; $i11++) {
            if ((this.values[$i11] & (short) 255) == (short) 0) {
                this.f308i[$i11] = (short) $r2.get(-1542223514);
                this.buffer[$i11] = (short) $r2.get(-906538277);
                this.key[$i11] = (short) $r2.get(1185268434);
            }
        }
        $r2.data = 2065011939 * $i8;
        if ($r2.get((byte) 0) != 0) {
            CompassView compassView = new CompassView();
            $r2.get(-989864699);
            $r2.get(-706134178);
            $r2.get(-1344106164);
            $r2.size(351591731);
        }
    }

    void readObject() {
        this.count = null;
        this.index = null;
        this.last = null;
        this.first = false;
    }

    public void rebuildCachedFields() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.type[$i0];
            this.type[$i0] = this.size[$i0];
            this.size[$i0] = -$i1;
        }
        append();
    }

    public void recurse() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.size[$i0];
            this.size[$i0] = this.type[$i0];
            this.type[$i0] = -$i1;
        }
        append();
    }

    public void reload() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.size[$i0];
            this.size[$i0] = this.type[$i0];
            this.type[$i0] = -$i1;
        }
        append();
    }

    protected final Integer remove() {
        return null;
    }

    void removeAll() {
        this.count = null;
        this.index = null;
        this.last = null;
        this.first = false;
    }

    public void removeChannel(short s, short s2) {
        for (int $i2 = 0; $i2 < this.this$0; $i2++) {
            if (this.id[$i2] == s) {
                this.id[$i2] = s2;
            }
        }
    }

    public void replace() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            this.type[$i0] = -this.type[$i0];
            this.size[$i0] = -this.size[$i0];
        }
        append();
    }

    public void reserveSpace() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            this.type[$i0] = -this.type[$i0];
            this.size[$i0] = -this.size[$i0];
        }
        append();
    }

    void reset() {
        int[] $r1;
        int $i2;
        int $i0;
        int $i3;
        if (this.root != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.next; $i0++) {
                $i3 = this.root[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f309x = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f309x[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for ($i2 = 0; $i2 < this.next; $i2++) {
                $i3 = this.root[$i2];
                int[] $r2 = this.f309x[$i3];
                int $i4 = $r1[$i3];
                $r1[$i3] = $i4 + 1;
                $r2[$i4] = $i2;
            }
        }
        if (this.state != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.this$0; $i0++) {
                $i3 = this.state[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f310y = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f310y[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for (int $i1 = 0; $i1 < this.this$0; $i1++) {
                $i2 = this.state[$i1];
                $r2 = this.f310y[$i2];
                $i0 = $r1[$i2];
                $r1[$i2] = $i0 + 1;
                $r2[$i0] = $i1;
            }
        }
    }

    public void resolveDeltas() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.size[$i0];
            this.size[$i0] = this.type[$i0];
            this.type[$i0] = -$i1;
        }
        append();
    }

    public void resolveDeltas(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.next; $i3++) {
            this.type[$i3] = (this.type[$i3] * i) / Constants.f93X;
            this.data[$i3] = (this.data[$i3] * i2) / Constants.f93X;
            this.size[$i3] = (this.size[$i3] * i3) / Constants.f93X;
        }
        append();
    }

    public Table run() {
        Table $r1 = new Table();
        if (this.value != null) {
            $r1.value = new byte[this.this$0];
            for (int $i0 = 0; $i0 < this.this$0; $i0++) {
                $r1.value[$i0] = this.value[$i0];
            }
        }
        $r1.next = this.next;
        $r1.this$0 = this.this$0;
        $r1.content = this.content;
        $r1.type = this.type;
        $r1.data = this.data;
        $r1.size = this.size;
        $r1.name = this.name;
        $r1.length = this.length;
        $r1.items = this.items;
        $r1.listener = this.listener;
        $r1.parent = this.parent;
        $r1.text = this.text;
        $r1.id = this.id;
        $r1.list = this.list;
        $r1.status = this.status;
        $r1.values = this.values;
        $r1.f308i = this.f308i;
        $r1.buffer = this.buffer;
        $r1.key = this.key;
        $r1.root = this.root;
        $r1.state = this.state;
        $r1.f309x = this.f309x;
        $r1.f310y = this.f310y;
        $r1.count = this.count;
        $r1.last = this.last;
        $r1.start = this.start;
        $r1.pos = this.pos;
        return $r1;
    }

    void run(byte[] bArr) {
        int $i17;
        short[] sArr;
        short[] $r9;
        Logger $r2 = new Logger(bArr);
        Logger $r3 = new Logger(bArr);
        Logger $r4 = new Logger(bArr);
        Logger $r5 = new Logger(bArr);
        Logger $r6 = new Logger(bArr);
        Logger $r7 = new Logger(bArr);
        Logger $r8 = new Logger(bArr);
        $r2.data = (bArr.length - 23) * 2065011939;
        int $i8 = $r2.get(1450525106);
        int $i9 = $r2.get(-440820764);
        int $i7 = $r2.get((byte) 0);
        int $i10 = $r2.get((byte) 0);
        int $i11 = $r2.get((byte) 0);
        int $i12 = $r2.get((byte) 0);
        int $i13 = $r2.get((byte) 0);
        int $i14 = $r2.get((byte) 0);
        int $i15 = $r2.get((byte) 0);
        int $i2 = $r2.get(-33659437);
        int $i1 = $r2.get(-138383117);
        int $i0 = $r2.get(1302985705);
        int $i4 = $r2.get(1556149223);
        int $i3 = $r2.get(702368712);
        int $i5 = 0;
        int $i16 = 0;
        int $i6 = 0;
        if ($i7 > 0) {
            byte[] bArr2 = new byte[$i7];
            bArr = bArr2;
            this.values = bArr2;
            $r2.data = 0;
            for ($i17 = 0; $i17 < $i7; $i17++) {
                bArr = this.values;
                byte $b18 = $r2.next(1247983979);
                bArr[$i17] = $b18;
                if ($b18 == (byte) 0) {
                    $i5++;
                }
                if ($b18 >= (byte) 1 && $b18 <= (byte) 3) {
                    $i16++;
                }
                if ($b18 == (byte) 2) {
                    $i6++;
                }
            }
        }
        int $i20 = $i7 + $i8;
        $i17 = $i10 == 1 ? $i20 + $i9 : $i20;
        int $i21 = $i17 + $i9;
        int $i22 = $i11 == 1271600733 ? $i21 + $i9 : $i21;
        int $i23 = $i13 == 1 ? $i22 + $i9 : $i22;
        int $i24 = $i15 == 1 ? $i23 + $i8 : $i23;
        int $i25 = $i12 == 1 ? $i24 + $i9 : $i24;
        int $i26 = $i4 + $i25;
        int $i27 = $i14 == 1 ? ($i9 * 2) + $i26 : $i26;
        int $i28 = $i3 + $i27;
        int $i29 = ($i9 * 2) + $i28;
        int $i30 = $i2 + $i29;
        int $i31 = $i1 + $i30;
        $i0 = $i31 + $i0;
        $i1 = $i0 + ($i5 * 6);
        $i2 = $i1 + ($i16 * 6);
        $i3 = $i2 + ($i16 * 6);
        $i4 = $i3 + ($i16 * 2);
        $i5 = $i4 + $i16;
        $i6 = $i5 + (($i6 * 2) + ($i16 * 2));
        this.next = $i8;
        this.this$0 = $i9;
        this.content = $i7;
        int[] iArr = new int[$i8];
        int[] $r10 = iArr;
        this.type = iArr;
        iArr = new int[$i8];
        $r10 = iArr;
        this.data = iArr;
        iArr = new int[$i8];
        $r10 = iArr;
        this.size = iArr;
        iArr = new int[$i9];
        $r10 = iArr;
        this.name = iArr;
        iArr = new int[$i9];
        $r10 = iArr;
        this.length = iArr;
        iArr = new int[$i9];
        $r10 = iArr;
        this.items = iArr;
        if ($i15 == 1) {
            iArr = new int[$i8];
            $r10 = iArr;
            this.root = iArr;
        }
        if ($i10 == 1) {
            bArr2 = new byte[$i9];
            bArr = bArr2;
            this.value = bArr2;
        }
        if ($i11 == 255) {
            bArr2 = new byte[$i9];
            bArr = bArr2;
            this.listener = bArr2;
        } else {
            byte b = (byte) $i11;
            $b18 = b;
            this.status = b;
        }
        if ($i12 == 1) {
            bArr2 = new byte[$i9];
            bArr = bArr2;
            this.parent = bArr2;
        }
        if ($i13 == 1) {
            iArr = new int[$i9];
            $r10 = iArr;
            this.state = iArr;
        }
        if ($i14 == 1) {
            sArr = new short[$i9];
            $r9 = sArr;
            this.list = sArr;
        }
        if ($i14 == 1 && $i7 > 0) {
            bArr2 = new byte[$i9];
            bArr = bArr2;
            this.text = bArr2;
        }
        sArr = new short[$i9];
        $r9 = sArr;
        this.id = sArr;
        if ($i7 > 0) {
            sArr = new short[$i7];
            $r9 = sArr;
            this.f308i = sArr;
            sArr = new short[$i7];
            $r9 = sArr;
            this.buffer = sArr;
            sArr = new short[$i7];
            $r9 = sArr;
            this.key = sArr;
        }
        $r2.data = 2065011939 * $i7;
        $r3.data = 2065011939 * $i29;
        $r4.data = -1014690600 * $i30;
        $r5.data = -1868765438 * $i31;
        $r6.data = 1788701470 * $i23;
        $i29 = 0;
        $i16 = 0;
        $i30 = 0;
        for ($i23 = 0; $i23 < $i8; $i23++) {
            int $i32 = $r2.get((byte) 0);
            $i31 = 0;
            if (($i32 & 1) != 0) {
                $i31 = $r3.log(-1544374973);
            }
            int $i33 = 0;
            if (($i32 & 2) != 0) {
                $i33 = $r4.log(-2134482834);
            }
            int $i34 = 0;
            if (($i32 & 4) != 0) {
                $i34 = $r5.log(-2119561937);
            }
            this.type[$i23] = $i31 + $i30;
            this.data[$i23] = $i33 + $i16;
            this.size[$i23] = $i29 + $i34;
            $i30 = this.type[$i23];
            $i16 = this.data[$i23];
            $i29 = this.size[$i23];
            if ($i15 == 1) {
                this.root[$i23] = $r6.get((byte) 0);
            }
        }
        $r2.data = 2065011939 * $i28;
        $r3.data = 2065011939 * $i20;
        $r4.data = 2065011939 * $i21;
        $r5.data = 7615473 * $i24;
        $r6.data = 164055249 * $i22;
        $r7.data = 2065011939 * $i26;
        $r8.data = 2065011939 * $i27;
        $i22 = 0;
        while ($i22 < $i9) {
            this.id[$i22] = (short) $r2.get(470411410);
            if ($i10 == 1) {
                this.value[$i22] = $r3.next(1247983979);
            }
            if ($i11 == 255) {
                this.listener[$i22] = $r4.next(1247983979);
            }
            if ($i12 == 1) {
                this.parent[$i22] = $r5.next(1247983979);
            }
            if ($i13 == 1) {
                this.state[$i22] = $r6.get((byte) 0);
            }
            if ($i14 == 1) {
                this.list[$i22] = (short) ($r7.get(-1435321345) - 1);
            }
            if (!(this.text == null || this.list[$i22] == (short) -1)) {
                this.text[$i22] = (byte) ($r8.get((byte) 0) - 1);
            }
            $i22++;
        }
        $r2.data = 385805839 * $i25;
        $r3.data = 2065011939 * $i17;
        $i13 = 0;
        $i11 = 0;
        $i17 = 0;
        $i12 = 0;
        $i10 = 0;
        while ($i10 < $i9) {
            $i14 = $r3.get((byte) 0);
            if ($i14 == 1) {
                $i12 = $r2.log(-2054018369) + $i11;
                $i13 = $r2.log(-1617101447) + $i12;
                $i11 = $r2.log(-2013874821) + $i13;
                this.name[$i10] = $i12;
                this.length[$i10] = $i13;
                this.items[$i10] = $i11;
                $i17 = $i11;
            }
            if ($i14 == 2) {
                $i11 += $r2.log(-1537856262);
                this.name[$i10] = $i12;
                this.length[$i10] = $i17;
                this.items[$i10] = $i11;
                $i13 = $i17;
                $i17 = $i11;
            }
            if ($i14 == 3) {
                $i11 += $r2.log(-1454073681);
                this.name[$i10] = $i17;
                this.length[$i10] = $i13;
                this.items[$i10] = $i11;
                $i12 = $i17;
                $i17 = $i11;
            }
            if ($i14 == 4) {
                $i11 += $r2.log(-1909416518);
                this.name[$i10] = $i13;
                this.length[$i10] = $i12;
                this.items[$i10] = $i11;
                $i17 = $i11;
            } else {
                $i14 = $i13;
                $i13 = $i12;
                $i12 = $i14;
            }
            $i10++;
            $i14 = $i12;
            $i12 = $i13;
            $i13 = $i14;
        }
        $r2.data = 801578728 * $i0;
        $r3.data = 2065011939 * $i1;
        $r4.data = 2065011939 * $i2;
        $r5.data = -171774987 * $i3;
        $r6.data = -472367423 * $i4;
        $r7.data = 2080572246 * $i5;
        for ($i9 = 0; $i9 < $i7; $i9++) {
            if ((this.values[$i9] & (short) 255) == (short) 0) {
                this.f308i[$i9] = (short) $r2.get(-2071533916);
                this.buffer[$i9] = (short) $r2.get(255747171);
                this.key[$i9] = (short) $r2.get(-623241540);
            }
        }
        $r2.data = -2011337104 * $i6;
        if ($r2.get((byte) 0) != 0) {
            CompassView compassView = new CompassView();
            $r2.get(1342126500);
            $r2.get(1694150782);
            $r2.get(-1756536357);
            $r2.size(487544409);
        }
    }

    public void select() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.type[$i0];
            this.type[$i0] = this.size[$i0];
            this.size[$i0] = -$i1;
        }
        append();
    }

    void set() {
        int[] $r1;
        int $i2;
        int $i0;
        int $i3;
        if (this.root != null) {
            $r1 = new int[-438497178];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.next; $i0++) {
                $i3 = this.root[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f309x = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f309x[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for ($i2 = 0; $i2 < this.next; $i2++) {
                $i3 = this.root[$i2];
                int[] $r2 = this.f309x[$i3];
                int $i4 = $r1[$i3];
                $r1[$i3] = $i4 + 1;
                $r2[$i4] = $i2;
            }
        }
        if (this.state != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.this$0; $i0++) {
                $i3 = this.state[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f310y = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f310y[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for (int $i1 = 0; $i1 < this.this$0; $i1++) {
                $i3 = this.state[$i1];
                $r2 = this.f310y[$i3];
                $i2 = $r1[$i3];
                $r1[$i3] = $i2 + 1;
                $r2[$i2] = $i1;
            }
        }
    }

    void solveTOI() {
        int[] $r1;
        int $i2;
        int $i0;
        int $i3;
        if (this.root != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.next; $i0++) {
                $i3 = this.root[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f309x = new int[($i2 + 1)][];
            for ($i3 = 0; $i3 <= $i2; $i3++) {
                this.f309x[$i3] = new int[$r1[$i3]];
                $r1[$i3] = 0;
            }
            for ($i2 = 0; $i2 < this.next; $i2++) {
                $i3 = this.root[$i2];
                int[] $r2 = this.f309x[$i3];
                int $i4 = $r1[$i3];
                $r1[$i3] = $i4 + 1;
                $r2[$i4] = $i2;
            }
        }
        if (this.state != null) {
            $r1 = new int[256];
            $i2 = 0;
            for ($i0 = 0; $i0 < this.this$0; $i0++) {
                $i3 = this.state[$i0];
                $r1[$i3] = $r1[$i3] + 1;
                if ($i3 > $i2) {
                    $i2 = $i3;
                }
            }
            this.f310y = new int[($i2 + 1)][];
            for ($i0 = 0; $i0 <= $i2; $i0++) {
                this.f310y[$i0] = new int[$r1[$i0]];
                $r1[$i0] = 0;
            }
            for (int $i1 = 0; $i1 < this.this$0; $i1++) {
                $i3 = this.state[$i1];
                $r2 = this.f310y[$i3];
                $i2 = $r1[$i3];
                $r1[$i3] = $i2 + 1;
                $r2[$i2] = $i1;
            }
        }
    }

    public void toPdf() {
        for (int $i0 = 0; $i0 < this.next; $i0++) {
            int $i1 = this.size[$i0];
            this.size[$i0] = this.type[$i0];
            this.type[$i0] = -$i1;
        }
        append();
    }

    public final Integer toString(int $i0, int i, int i2, int i3, int i4) {
        int $i5;
        int $i6;
        int i5;
        next();
        i = (((int) Math.sqrt((double) (((i2 * i2) + (i3 * i3)) + (i4 * i4)))) * i) >> 8;
        Integer $r1 = new Integer();
        $r1.list = new int[this.this$0];
        $r1.current = new int[this.this$0];
        $r1.index = new int[this.this$0];
        if (this.content > 0 && this.text != null) {
            int[] $r2 = new int[this.content];
            for ($i5 = 0; $i5 < this.this$0; $i5++) {
                if (this.text[$i5] != (byte) -1) {
                    short $s8 = this.text[$i5] & (short) 255;
                    $r2[$s8] = $r2[$s8] + 1;
                }
            }
            $r1.value = 0;
            $i5 = 0;
            while ($i5 < this.content) {
                if ($r2[$i5] > 0 && this.values[$i5] == (byte) 0) {
                    $r1.value++;
                }
                $i5++;
            }
            int[] $r10 = new int[$r1.value];
            $r1.values = $r10;
            $r10 = new int[$r1.value];
            $r1.table = $r10;
            $r10 = new int[$r1.value];
            $r1.parent = $r10;
            $i5 = 0;
            $i6 = 0;
            while (true) {
                i5 = this.content;
                int $i9 = i5;
                if ($i6 >= i5) {
                    break;
                }
                if ($r2[$i6] <= 0 || this.values[$i6] != (byte) 0) {
                    $r2[$i6] = -1;
                } else {
                    $r1.values[$i5] = this.f308i[$i6] & 65535;
                    $r1.table[$i5] = this.buffer[$i6] & 65535;
                    $r1.parent[$i5] = this.key[$i6] & 65535;
                    $r2[$i6] = $i5;
                    $i5++;
                }
                $i6++;
            }
            $r1.name = new byte[this.this$0];
            for ($i5 = 0; $i5 < this.this$0; $i5++) {
                if (this.text[$i5] != (byte) -1) {
                    $r1.name[$i5] = (byte) $r2[this.text[$i5] & (short) 255];
                } else {
                    $r1.name[$i5] = (byte) -1;
                }
            }
        }
        $i5 = 0;
        while ($i5 < this.this$0) {
            byte b = this.value == null ? (byte) 0 : this.value[$i5];
            byte b2 = this.parent == null ? (byte) 0 : this.parent[$i5];
            $s8 = this.list == null ? (short) -1 : this.list[$i5];
            if (b2 == (byte) -2) {
                b = (byte) 3;
            }
            if (b2 == (byte) -1) {
                b = (byte) 2;
            }
            FieldInfo $r9;
            KeyPair $r7;
            if ($s8 == (short) -1) {
                if (b == (byte) 0) {
                    $i6 = 65535 & this.id[$i5];
                    $r9 = (this.index == null || this.index[this.name[$i5]] == null) ? this.count[this.name[$i5]] : this.index[this.name[$i5]];
                    i5 = $r9.name * 2065704153;
                    $i9 = i5;
                    $i9 = i5 * i2;
                    i5 = $r9.value * 1777726155;
                    int i6 = i5;
                    $i9 += i5 * i3;
                    i5 = $r9.data * -1151548353;
                    i6 = i5;
                    $i9 += i5 * i4;
                    i5 = $r9.count * -1213562125;
                    i6 = i5;
                    i5 = $i9 / (i5 * i);
                    $i9 = i5;
                    $r1.list[$i5] = Table.encryptBlock($i6, i5 + $i0);
                    $r9 = (this.index == null || this.index[this.length[$i5]] == null) ? this.count[this.length[$i5]] : this.index[this.length[$i5]];
                    i5 = $r9.name * 2065704153;
                    $i9 = i5;
                    $i9 = i5 * i2;
                    i5 = $r9.value * 1777726155;
                    i6 = i5;
                    $i9 += i5 * i3;
                    i5 = $r9.data * -1151548353;
                    i6 = i5;
                    $i9 += i5 * i4;
                    i5 = $r9.count * -1213562125;
                    i6 = i5;
                    i5 = $i9 / (i5 * i);
                    $i9 = i5;
                    $r1.current[$i5] = Table.encryptBlock($i6, i5 + $i0);
                    $r9 = (this.index == null || this.index[this.items[$i5]] == null) ? this.count[this.items[$i5]] : this.index[this.items[$i5]];
                    i5 = $r9.name * 2065704153;
                    $i9 = i5;
                    $i9 = i5 * i2;
                    i5 = $r9.value * 1777726155;
                    i6 = i5;
                    $i9 += i5 * i3;
                    i5 = $r9.data * -1151548353;
                    i6 = i5;
                    $i9 += i5 * i4;
                    i5 = $r9.count * -1213562125;
                    i6 = i5;
                    i5 = $i9 / (i5 * i);
                    $i9 = i5;
                    $r1.index[$i5] = Table.encryptBlock($i6, i5 + $i0);
                } else if (b == (byte) 1) {
                    $r7 = this.last[$i5];
                    i5 = $r7.count * 1590553579;
                    $i9 = i5;
                    i5 *= i3;
                    $i9 = i5;
                    $i6 = (($r7.next * -132081823) * i2) + i5;
                    i5 = $r7.data * -2020140801;
                    $i9 = i5;
                    $i6 = (i5 * i4) + $i6;
                    i5 = (i / 2) + i;
                    $i9 = i5;
                    $r1.list[$i5] = Table.encryptBlock(this.id[$i5] & 65535, ($i6 / i5) + $i0);
                    $r1.index[$i5] = -1;
                } else if (b == (byte) 3) {
                    $r1.list[$i5] = Constants.f93X;
                    $r1.index[$i5] = -1;
                } else {
                    $r1.index[$i5] = -2;
                }
            } else if (b == (byte) 0) {
                $r9 = (this.index == null || this.index[this.name[$i5]] == null) ? this.count[this.name[$i5]] : this.index[this.name[$i5]];
                i5 = $r9.value * 1777726155;
                $i9 = i5;
                i5 *= i3;
                $i9 = i5;
                $i6 = (($r9.name * 2065704153) * i2) + i5;
                i5 = $r9.data * -1151548353;
                $i9 = i5;
                i5 *= i4;
                $i9 = i5;
                $i6 += i5;
                i5 = $r9.count * -1213562125;
                $i9 = i5;
                i5 *= i;
                $i9 = i5;
                $r1.list[$i5] = Table.adjustActivationDepth(($i6 / i5) + $i0);
                $r9 = (this.index == null || this.index[this.length[$i5]] == null) ? this.count[this.length[$i5]] : this.index[this.length[$i5]];
                i5 = $r9.value * 1777726155;
                $i9 = i5;
                i5 *= i3;
                $i9 = i5;
                $i6 = (($r9.name * 2065704153) * i2) + i5;
                i5 = $r9.data * -1151548353;
                $i9 = i5;
                i5 *= i4;
                $i9 = i5;
                $i6 += i5;
                i5 = $r9.count * -1213562125;
                $i9 = i5;
                i5 *= i;
                $i9 = i5;
                $r1.current[$i5] = Table.adjustActivationDepth(($i6 / i5) + $i0);
                $r9 = (this.index == null || this.index[this.items[$i5]] == null) ? this.count[this.items[$i5]] : this.index[this.items[$i5]];
                i5 = $r9.value * 1777726155;
                $i9 = i5;
                i5 *= i3;
                $i9 = i5;
                $i6 = (($r9.name * 2065704153) * i2) + i5;
                i5 = $r9.data * -1151548353;
                $i9 = i5;
                i5 *= i4;
                $i9 = i5;
                $i6 += i5;
                i5 = $r9.count * -1213562125;
                $i9 = i5;
                i5 *= i;
                $i9 = i5;
                $r1.index[$i5] = Table.adjustActivationDepth(($i6 / i5) + $i0);
            } else if (b == (byte) 1) {
                $r7 = this.last[$i5];
                i5 = $r7.count * 1590553579;
                $i9 = i5;
                i5 *= i3;
                $i9 = i5;
                $i6 = (($r7.next * -132081823) * i2) + i5;
                i5 = $r7.data * -2020140801;
                $i9 = i5;
                $i6 = (i5 * i4) + $i6;
                i5 = (i / 2) + i;
                $i9 = i5;
                $r1.list[$i5] = Table.adjustActivationDepth(($i6 / i5) + $i0);
                $r1.index[$i5] = -1;
            } else {
                $r1.index[$i5] = -2;
            }
            $i5++;
        }
        decode();
        i5 = this.next;
        $r1.size = i5;
        $r1.next = this.type;
        $r1.length = this.data;
        $r1.this$0 = this.size;
        i5 = this.this$0;
        $r1.data = i5;
        $r1.count = this.name;
        $r1.queue = this.length;
        $r1.key = this.items;
        $r1.buffer = this.listener;
        $r1.position = this.parent;
        $r1.status = this.status;
        $r1.children = this.f309x;
        $r1.root = this.f310y;
        $r1.f140c = this.root;
        $r1.f144n = this.state;
        $r1.path = this.list;
        return $r1;
    }

    public void trim(int i, int i2, int i3) {
        for (int $i3 = 0; $i3 < this.next; $i3++) {
            this.type[$i3] = (this.type[$i3] * i) / Constants.f93X;
            this.data[$i3] = (this.data[$i3] * i2) / Constants.f93X;
            this.size[$i3] = (this.size[$i3] * i3) / Constants.f93X;
        }
        append();
    }

    public void update() {
        if (this.count == null) {
            int $i2;
            this.count = new FieldInfo[this.next];
            for ($i2 = 0; $i2 < this.next; $i2++) {
                this.count[$i2] = new FieldInfo();
            }
            $i2 = 0;
            while ($i2 < this.this$0) {
                int $i3 = this.name[$i2];
                int $i4 = this.length[$i2];
                int $i0 = this.items[$i2];
                int $i5 = this.type[$i4] - this.type[$i3];
                int $i6 = this.data[$i4] - this.data[$i3];
                int $i8 = this.size[$i4] - this.size[$i3];
                int $i7 = this.type[$i0] - this.type[$i3];
                int $i9 = this.data[$i0] - this.data[$i3];
                int $i10 = this.size[$i0] - this.size[$i3];
                $i7 = ($i5 * $i9) - ($i6 * $i7);
                $i6 = ($i6 * $i10) - ($i9 * $i8);
                $i5 = ($i8 * $i7) - ($i10 * $i5);
                $i8 = $i7;
                while (true) {
                    if ($i6 <= 8192 && $i5 <= 1125576907 && $i8 <= 8192 && $i6 >= 332627473 && $i5 >= -1149164499 && $i8 >= -8192) {
                        break;
                    }
                    $i6 >>= 1;
                    $i5 >>= 1;
                    $i8 >>= 1;
                }
                double $d0 = (double) ((($i6 * $i6) + ($i5 * $i5)) + ($i8 * $i8));
                double d = $d0;
                $i9 = (int) Math.sqrt($d0);
                if ($i9 <= 0) {
                    $i9 = 1;
                }
                $i7 = ($i6 * 555475661) / $i9;
                $i6 = ($i5 * 256) / $i9;
                $i5 = ($i8 * 256) / $i9;
                byte b = this.value == null ? (byte) 0 : this.value[$i2];
                if (b == (byte) 0) {
                    FieldInfo $r3 = this.count[$i3];
                    $r3.name += -825995482 * $i7;
                    $r3.value += -1586074762 * $i6;
                    $r3.data += 543917951 * $i5;
                    $r3.count -= 1812446036;
                    $r3 = this.count[$i4];
                    $r3.name += -1902240919 * $i7;
                    $r3.value += 350773987 * $i6;
                    $r3.data += -80248110 * $i5;
                    $r3.count += 35481147;
                    $r3 = this.count[$i0];
                    $r3.name = ($i7 * -1902240919) + $r3.name;
                    $r3.value = ($i6 * -1766949217) + $r3.value;
                    $r3.data = ($i5 * 1412913599) + $r3.data;
                    $r3.count += 35481147;
                } else if (b == (byte) 1) {
                    KeyPair[] $r5;
                    if (this.last == null) {
                        KeyPair[] keyPairArr = new KeyPair[this.this$0];
                        $r5 = keyPairArr;
                        this.last = keyPairArr;
                    }
                    $r5 = this.last;
                    KeyPair keyPair = new KeyPair();
                    $r5[$i2] = keyPair;
                    keyPair.next = 546327713 * $i7;
                    keyPair.count = 2061736355 * $i6;
                    keyPair.data = 500195132 * $i5;
                }
                $i2++;
            }
        }
    }

    void update(byte[] bArr) {
        int $i18;
        short[] sArr;
        short[] $r10;
        Logger $r2 = new Logger(bArr);
        Logger $r3 = new Logger(bArr);
        Logger $r4 = new Logger(bArr);
        Logger $r5 = new Logger(bArr);
        Logger $r6 = new Logger(bArr);
        Logger $r7 = new Logger(bArr);
        Logger $r8 = new Logger(bArr);
        $r2.data = (bArr.length - 23) * 2065011939;
        int $i9 = $r2.get(457394588);
        int $i10 = $r2.get(1452229145);
        int $i8 = $r2.get((byte) 0);
        int $i11 = $r2.get((byte) 0);
        int $i12 = $r2.get((byte) 0);
        int $i13 = $r2.get((byte) 0);
        int $i14 = $r2.get((byte) 0);
        int $i15 = $r2.get((byte) 0);
        int $i16 = $r2.get((byte) 0);
        int $i3 = $r2.get(-1065613845);
        int $i2 = $r2.get(-838347526);
        int $i1 = $r2.get(-182601617);
        int $i5 = $r2.get(950655534);
        int $i4 = $r2.get(-2033449618);
        int $i6 = 0;
        int $i17 = 0;
        int $i7 = 0;
        if ($i8 > 0) {
            byte[] bArr2 = new byte[$i8];
            bArr = bArr2;
            this.values = bArr2;
            $r2.data = 0;
            for ($i18 = 0; $i18 < $i8; $i18++) {
                bArr = this.values;
                byte $b19 = $r2.next(1247983979);
                bArr[$i18] = $b19;
                if ($b19 == (byte) 0) {
                    $i6++;
                }
                if ($b19 >= (byte) 1 && $b19 <= (byte) 3) {
                    $i17++;
                }
                if ($b19 == (byte) 2) {
                    $i7++;
                }
            }
        }
        int $i20 = $i8 + $i9;
        $i18 = $i11 == 1 ? $i20 + $i10 : $i20;
        int $i21 = $i18 + $i10;
        int $i22 = $i12 == 255 ? $i21 + $i10 : $i21;
        int $i23 = $i14 == 1 ? $i22 + $i10 : $i22;
        int $i24 = $i16 == 1 ? $i23 + $i9 : $i23;
        int $i25 = $i13 == 1 ? $i24 + $i10 : $i24;
        int $i0 = $i25 + $i5;
        int $i26 = $i15 == 1 ? ($i10 * 2) + $i0 : $i0;
        int $i27 = $i4 + $i26;
        int $i28 = ($i10 * 2) + $i27;
        int $i29 = $i3 + $i28;
        int $i30 = $i2 + $i29;
        $i1 = $i30 + $i1;
        $i2 = $i1 + ($i6 * 6);
        $i3 = $i2 + ($i17 * 6);
        $i4 = $i3 + ($i17 * 6);
        $i5 = $i4 + ($i17 * 2);
        $i6 = $i5 + $i17;
        $i7 = $i6 + (($i7 * 2) + ($i17 * 2));
        this.next = $i9;
        this.this$0 = $i10;
        this.content = $i8;
        int[] iArr = new int[$i9];
        int[] $r9 = iArr;
        this.type = iArr;
        iArr = new int[$i9];
        $r9 = iArr;
        this.data = iArr;
        iArr = new int[$i9];
        $r9 = iArr;
        this.size = iArr;
        iArr = new int[$i10];
        $r9 = iArr;
        this.name = iArr;
        iArr = new int[$i10];
        $r9 = iArr;
        this.length = iArr;
        iArr = new int[$i10];
        $r9 = iArr;
        this.items = iArr;
        if ($i16 == 1) {
            iArr = new int[$i9];
            $r9 = iArr;
            this.root = iArr;
        }
        if ($i11 == 1) {
            bArr2 = new byte[$i10];
            bArr = bArr2;
            this.value = bArr2;
        }
        if ($i12 == 255) {
            bArr2 = new byte[$i10];
            bArr = bArr2;
            this.listener = bArr2;
        } else {
            byte b = (byte) $i12;
            $b19 = b;
            this.status = b;
        }
        if ($i13 == 1) {
            bArr2 = new byte[$i10];
            bArr = bArr2;
            this.parent = bArr2;
        }
        if ($i14 == 1) {
            iArr = new int[$i10];
            $r9 = iArr;
            this.state = iArr;
        }
        if ($i15 == 1) {
            sArr = new short[$i10];
            $r10 = sArr;
            this.list = sArr;
        }
        if ($i15 == 1 && $i8 > 0) {
            bArr2 = new byte[$i10];
            bArr = bArr2;
            this.text = bArr2;
        }
        sArr = new short[$i10];
        $r10 = sArr;
        this.id = sArr;
        if ($i8 > 0) {
            sArr = new short[$i8];
            $r10 = sArr;
            this.f308i = sArr;
            sArr = new short[$i8];
            $r10 = sArr;
            this.buffer = sArr;
            sArr = new short[$i8];
            $r10 = sArr;
            this.key = sArr;
        }
        $r2.data = 2065011939 * $i8;
        $r3.data = 2065011939 * $i28;
        $r4.data = 2065011939 * $i29;
        $r5.data = 2065011939 * $i30;
        $r6.data = 2065011939 * $i23;
        $i28 = 0;
        $i17 = 0;
        $i29 = 0;
        for ($i23 = 0; $i23 < $i9; $i23++) {
            $i30 = $r2.get((byte) 0);
            int $i31 = ($i30 & 1) != 0 ? $r3.log(-1475183914) : 0;
            int $i32 = 0;
            if (($i30 & 2) != 0) {
                $i32 = $r4.log(-1804957225);
            }
            int $i33 = 0;
            if (($i30 & 4) != 0) {
                $i33 = $r5.log(-1949540295);
            }
            this.type[$i23] = $i31 + $i29;
            this.data[$i23] = $i32 + $i17;
            this.size[$i23] = $i33 + $i28;
            $i29 = this.type[$i23];
            $i17 = this.data[$i23];
            $i28 = this.size[$i23];
            if ($i16 == 1) {
                this.root[$i23] = $r6.get((byte) 0);
            }
        }
        $r2.data = 2065011939 * $i27;
        $r3.data = 2065011939 * $i20;
        $r4.data = 2065011939 * $i21;
        $r5.data = 2065011939 * $i24;
        $r6.data = 2065011939 * $i22;
        $r7.data = 2065011939 * $i0;
        $r8.data = 2065011939 * $i26;
        $i0 = 0;
        while ($i0 < $i10) {
            this.id[$i0] = (short) $r2.get(813985558);
            if ($i11 == 1) {
                this.value[$i0] = $r3.next(1247983979);
            }
            if ($i12 == 255) {
                this.listener[$i0] = $r4.next(1247983979);
            }
            if ($i13 == 1) {
                this.parent[$i0] = $r5.next(1247983979);
            }
            if ($i14 == 1) {
                this.state[$i0] = $r6.get((byte) 0);
            }
            if ($i15 == 1) {
                this.list[$i0] = (short) ($r7.get(1423283584) - 1);
            }
            if (!(this.text == null || this.list[$i0] == (short) -1)) {
                this.text[$i0] = (byte) ($r8.get((byte) 0) - 1);
            }
            $i0++;
        }
        $r2.data = 2065011939 * $i25;
        $r3.data = 2065011939 * $i18;
        $i14 = 0;
        $i13 = 0;
        $i18 = 0;
        $i12 = 0;
        $i11 = 0;
        while ($i11 < $i10) {
            $i15 = $r3.get((byte) 0);
            if ($i15 == 1) {
                $i12 = $r2.log(-1587201426) + $i13;
                $i14 = $r2.log(-1370203758) + $i12;
                $i13 = $r2.log(-1346980960) + $i14;
                this.name[$i11] = $i12;
                this.length[$i11] = $i14;
                this.items[$i11] = $i13;
                $i18 = $i13;
            }
            if ($i15 == 2) {
                $i13 += $r2.log(-1527717207);
                this.name[$i11] = $i12;
                this.length[$i11] = $i18;
                this.items[$i11] = $i13;
                $i14 = $i18;
                $i18 = $i13;
            }
            if ($i15 == 3) {
                $i13 += $r2.log(-1429360847);
                this.name[$i11] = $i18;
                this.length[$i11] = $i14;
                this.items[$i11] = $i13;
                $i12 = $i18;
                $i18 = $i13;
            }
            if ($i15 == 4) {
                $i13 += $r2.log(-1814838631);
                this.name[$i11] = $i14;
                this.length[$i11] = $i12;
                this.items[$i11] = $i13;
                $i18 = $i13;
            } else {
                $i15 = $i14;
                $i14 = $i12;
                $i12 = $i15;
            }
            $i11++;
            $i15 = $i12;
            $i12 = $i14;
            $i14 = $i15;
        }
        $r2.data = 2065011939 * $i1;
        $r3.data = 2065011939 * $i2;
        $r4.data = 2065011939 * $i3;
        $r5.data = 2065011939 * $i4;
        $r6.data = 2065011939 * $i5;
        $r7.data = 2065011939 * $i6;
        for ($i10 = 0; $i10 < $i8; $i10++) {
            if ((this.values[$i10] & (short) 255) == (short) 0) {
                this.f308i[$i10] = (short) $r2.get(-816406459);
                this.buffer[$i10] = (short) $r2.get(1181378973);
                this.key[$i10] = (short) $r2.get(-1876917223);
            }
        }
        $r2.data = 2065011939 * $i7;
        if ($r2.get((byte) 0) != 0) {
            CompassView compassView = new CompassView();
            $r2.get(-1339465683);
            $r2.get(-1553895861);
            $r2.get(-442041573);
            $r2.size(546988992);
        }
    }

    public void validate(int $i0) {
        int $i1 = instance[$i0];
        $i0 = context[$i0];
        for (int $i2 = 0; $i2 < this.next; $i2++) {
            int $i3 = ((this.size[$i2] * $i1) + (this.type[$i2] * $i0)) >> 16;
            this.size[$i2] = ((this.size[$i2] * $i0) - (this.type[$i2] * $i1)) >> 16;
            this.type[$i2] = $i3;
        }
        append();
    }

    protected final Integer write() {
        return null;
    }
}
