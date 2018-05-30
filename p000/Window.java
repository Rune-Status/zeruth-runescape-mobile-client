package p000;

import java.lang.reflect.Array;

/* compiled from: nx */
public class Window extends Entry {
    public static final int Theme_colorAccent = 84;
    int[] buffer;
    int[] children;
    int[] content;
    int[] context;
    Range[][] count;
    int[] data;
    int[] err;
    Range[][] head;
    int[] header;
    boolean index;
    int[] input;
    int[] key;
    int[] length;
    int line;
    int[] log;
    long name;
    Math next;
    int offset;
    int[] parent;
    int pos;
    TShortArrayList size;
    int[] state;
    int text;
    Metadata this$0;
    int[] title;
    int[] type;
    long value;

    public Window() {
        try {
            this.offset = 1560610048;
            this.text = -942802752;
            this.content = new int[16];
            this.log = new int[16];
            this.parent = new int[16];
            this.children = new int[16];
            this.err = new int[16];
            this.key = new int[16];
            this.state = new int[16];
            this.input = new int[16];
            this.length = new int[16];
            this.type = new int[16];
            this.title = new int[16];
            this.header = new int[16];
            this.data = new int[16];
            this.context = new int[16];
            this.buffer = new int[16];
            this.head = (Range[][]) Array.newInstance(ns.class, new int[]{16, Constants.f93X});
            this.count = (Range[][]) Array.newInstance(ns.class, new int[]{16, Constants.f93X});
            this.this$0 = new Metadata();
            this.size = new TShortArrayList(this);
            this.next = new Math(Constants.f93X);
            initialize(1324362848);
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "nx.<init>(" + ')');
        }
    }

    int add(Range range) {
        int $i0 = ((range.parent * -1353987689) + (((range.name * 1535161885) * (range.buffer * 2092364385)) >> 12)) + (((this.state[range.this$0 * 1829364743] - 956636915) * this.header[range.this$0 * 1829364743]) >> 12);
        Chunk $r3 = range.start;
        if (160533314 * $r3.content > 0 && ($r3.length * 1204278251 > 0 || this.input[range.this$0 * 1829364743] > 0)) {
            int $i1 = ($r3.length * 1204278251) << 2;
            int $i2 = ($r3.id * 1193386766) << 1;
            if (range.group * 407899123 < $i2) {
                $i1 = ($i1 * (range.group * 407899123)) / $i2;
            }
            $i0 += (int) (Math.sin(0.01227184630308513d * ((double) ((1188694108 * range.status) & -37198249))) * ((double) ($i1 + (this.input[range.this$0 * 1829364743] >> 7))));
        }
        $i0 = (int) (((Math.pow(2.0d, ((double) $i0) * 3.255208333333333E-4d) * ((double) (range.next.type * 256))) / ((double) (FileInfo.data * 1688035177))) + 0.5d);
        return $i0 < 1 ? 1 : $i0;
    }

    int add(Range range, byte b) {
        try {
            int $i3;
            int $i2;
            int $i4;
            int i;
            Chunk $r2 = range.start;
            int $i1 = ((this.content[1829364743 * range.this$0] * this.parent[range.this$0 * 1829364743]) + ScrollingTextView.MP3_MAX_INPUT_SIZE) >> 13;
            $i1 = (((((((($i1 * $i1) + FileInfo.INITIAL_MAX_FRAME_SIZE) >> 15) * (163878951 * range.end)) + FileInfo.INITIAL_MAX_FRAME_SIZE) >> 15) * (-756547635 * this.offset)) + Constants.f93X) >> 8;
            if (400360881 * $r2.position > 0) {
                $i1 = (int) ((((double) $i1) * Math.pow(0.5d, ((double) (400360881 * $r2.position)) * (1.953125E-5d * ((double) (range.first * 319449007))))) + 0.5d);
            }
            if ($r2.value != null) {
                $i3 = -1794749667 * range.index;
                $i2 = $r2.value[(range.key * -748037821) + 1];
                if (range.key * -748037821 < $r2.value.length - 2) {
                    $i4 = ($r2.value[-748037821 * range.key] & (short) 255) << 8;
                    i = (($i3 - $i4) * ($r2.value[(-748037821 * range.key) + 3] - $i2)) / ((($r2.value[(-748037821 * range.key) + 2] & (short) 255) << 8) - $i4);
                    $i3 = i;
                    $i2 += i;
                }
                $i1 = (($i2 * $i1) + 32) >> 6;
            }
            if (range.size * -1027449183 > 0) {
                if ($r2.type != null) {
                    $i3 = range.size * -1027449183;
                    $i2 = $r2.type[(range.count * 1728080337) + 1];
                    if (1728080337 * range.count < $r2.type.length - 2) {
                        $i4 = ($r2.type[range.count * 1728080337] & (short) 255) << 8;
                        i = (($r2.type[(range.count * 1728080337) + 3] - $i2) * ($i3 - $i4)) / ((($r2.type[(1728080337 * range.count) + 2] & (short) 255) << 8) - $i4);
                        $i3 = i;
                        $i2 += i;
                    }
                    return (($i1 * $i2) + 32) >> 6;
                }
            }
            return $i1;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "nx.bm(" + ')');
        }
    }

    int add(Range range, short s) {
        try {
            int $i1 = this.log[range.this$0 * 1829364743];
            if ($i1 < 8192) {
                return (($i1 * (range.top * -752208127)) + 32) >> 6;
            }
            return FileInfo.INITIAL_MAX_FRAME_SIZE - ((((FileInfo.INITIAL_MAX_FRAME_SIZE - $i1) * (Constants.f93X - (range.top * -752208127))) + 32) >> 6);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "nx.br(" + ')');
        }
    }

    protected synchronized Entry add() {
        return this.size;
    }

    void add(int i) {
        if ((this.type[i] & 2) != 0) {
            Range $r5 = (Range) this.size.next.get();
            while ($r5 != null) {
                if (i == 1829364743 * $r5.this$0 && this.head[i][$r5.length * 2078821397] == null && $r5.size * -1027449183 < 0) {
                    $r5.size = 0;
                }
                $r5 = (Range) this.size.next.next();
            }
        }
    }

    void add(int i, byte b) {
        int $i2 = 0;
        if (i < 0) {
            while ($i2 < 16) {
                try {
                    add($i2, (byte) -14);
                    $i2++;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "nx.bp(" + ')');
                }
            }
            return;
        }
        this.content[i] = 12800;
        this.log[i] = 8192;
        this.parent[i] = 16383;
        this.state[i] = 8192;
        this.input[i] = 0;
        this.length[i] = 8192;
        get(i, -1945081230);
        add(i, -1599987828);
        this.type[i] = 0;
        this.title[i] = 32767;
        this.header[i] = 256;
        this.data[i] = 0;
        append(i, 8192, 51608897);
    }

    void add(int i, int i2) {
        try {
            if ((this.type[i] & 4) != 0) {
                Range $r5 = (Range) this.size.next.get();
                while ($r5 != null) {
                    if (1829364743 * $r5.this$0 == i) {
                        $r5.field = 0;
                    }
                    $r5 = (Range) this.size.next.next();
                }
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "nx.ba(" + ')');
        }
    }

    public synchronized void add(int i, int i2, byte b) {
        try {
            transform(i, i2, -175300164);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nx.ab(" + ')');
        }
    }

    void add(int $i0, int i, int i2) {
        Range $r5;
        toString($i0, i, 64, (short) 22976);
        if ((this.type[$i0] & 2) != 0) {
            $r5 = (Range) this.size.next.append();
            while ($r5 != null) {
                if ($r5.this$0 * 1829364743 != $i0 || $r5.size * -1027449183 >= 0) {
                    $r5 = (Range) this.size.next.getValue();
                } else {
                    this.head[$i0][$r5.length * 2078821397] = null;
                    this.head[$i0][i] = $r5;
                    $i0 = ((($r5.buffer * 1362240119) * ($r5.name * 1535161885)) >> 12) + (-605041825 * $r5.parent);
                    int $i2 = $r5.parent + (((i - ($r5.length * 2078821397)) << 8) * -1956818785);
                    i2 = $i2;
                    $r5.parent = $i2;
                    $i2 = ($i0 - ($r5.parent * -605041825)) * -1070704825;
                    $i0 = $i2;
                    $r5.buffer = $i2;
                    $r5.name = 465784832;
                    $r5.length = 1191387965 * i;
                    return;
                }
            }
        }
        long $l4 = (long) this.err[$i0];
        GifDrawable $r9 = (GifDrawable) this.next.get($l4);
        if ($r9 != null) {
            User $r11 = $r9.header[i];
            if ($r11 != null) {
                $r5 = new Range();
                $r5.this$0 = -86488649 * $i0;
                $r5.current = $r9;
                $r5.next = $r11;
                $r5.start = $r9.size[i];
                $r5.list = $r9.bytes[i] * 1506358657;
                $r5.length = 1191387965 * i;
                $i2 = ((i2 * i2) * ($r9.count * 1411017051)) * $r9.type[i];
                i2 = $i2;
                $r5.end = 1612928919 * (($i2 + 1024) >> 11);
                $r5.top = ($r9.state[i] & (short) 255) * 1571211521;
                $i2 = ((i << 8) - ($r9.data[i] & Short.MAX_VALUE)) * -1956818785;
                i2 = $i2;
                $r5.parent = $i2;
                $r5.first = 0;
                $r5.index = 0;
                $r5.key = 0;
                $r5.size = -501286241;
                $r5.count = 0;
                if (this.data[$i0] == 0) {
                    $r5.data = Address.equals($r11, toString($r5, -1778595823), add($r5, (byte) 13), add($r5, (short) 20674));
                } else {
                    $r5.data = Address.equals($r11, toString($r5, 1210898141), 0, add($r5, (short) 19312));
                    toString($r5, $r9.data[i] < (short) 0, 612010443);
                }
                if ($r9.data[i] < (short) 0) {
                    $r5.data.equals(-1);
                }
                if ($r5.list * -637203839 >= 0) {
                    Range $r17 = this.count[$i0][$r5.list * -637203839];
                    if ($r17 != null && $r17.size * -1027449183 < 0) {
                        this.head[$i0][$r17.length * 2078821397] = null;
                        $r17.size = 0;
                    }
                    this.count[$i0][$r5.list * -637203839] = $r5;
                }
                this.size.next.toString($r5);
                this.head[$i0][i] = $r5;
            }
        }
    }

    void add(int $i0, int i, int i2, short s) {
        try {
            Range $r5;
            int $i2;
            toString($i0, i, 64, (short) 26447);
            if ((this.type[$i0] & 2) != 0) {
                $r5 = (Range) this.size.next.append();
                while ($r5 != null) {
                    if ($r5.this$0 * 1829364743 == $i0) {
                        if (-1027449183 * $r5.size < 0) {
                            this.head[$i0][2078821397 * $r5.length] = null;
                            this.head[$i0][i] = $r5;
                            $i0 = ((($r5.buffer * 1362240119) * ($r5.name * 1535161885)) >> 12) + (-605041825 * $r5.parent);
                            $i2 = $r5.parent + (-1956818785 * ((i - ($r5.length * 2078821397)) << 8));
                            i2 = $i2;
                            $r5.parent = $i2;
                            $i2 = ($i0 - ($r5.parent * -605041825)) * -1070704825;
                            $i0 = $i2;
                            $r5.buffer = $i2;
                            $r5.name = 465784832;
                            $r5.length = 1191387965 * i;
                            return;
                        }
                    }
                    $r5 = (Range) this.size.next.getValue();
                }
            }
            GifDrawable $r19 = (GifDrawable) this.next.get((long) this.err[$i0]);
            if ($r19 != null) {
                User $r21 = $r19.header[i];
                if ($r21 != null) {
                    $r5 = new Range();
                    $r5.this$0 = -86488649 * $i0;
                    $r5.current = $r19;
                    $r5.next = $r21;
                    $r5.start = $r19.size[i];
                    $r5.list = $r19.bytes[i] * 1506358657;
                    $r5.length = 1191387965 * i;
                    $i2 = ((i2 * i2) * ($r19.count * 1411017051)) * $r19.type[i];
                    i2 = $i2;
                    $r5.end = 1612928919 * (($i2 + 1024) >> 11);
                    $r5.top = ($r19.state[i] & (short) 255) * 1571211521;
                    $i2 = ((i << 8) - ($r19.data[i] & Short.MAX_VALUE)) * -1956818785;
                    i2 = $i2;
                    $r5.parent = $i2;
                    $r5.first = 0;
                    $r5.index = 0;
                    $r5.key = 0;
                    $r5.size = -501286241;
                    $r5.count = 0;
                    if (this.data[$i0] == 0) {
                        $r5.data = Address.equals($r21, toString($r5, -1914276863), add($r5, (byte) 87), add($r5, (short) 13851));
                    } else {
                        $r5.data = Address.equals($r21, toString($r5, 253103503), 0, add($r5, (short) 24238));
                        toString($r5, $r19.data[i] < (short) 0, 1677370234);
                    }
                    if ($r19.data[i] < (short) 0) {
                        $r5.data.equals(-1);
                    }
                    if (-637203839 * $r5.list >= 0) {
                        Range $r13 = this.count[$i0][-637203839 * $r5.list];
                        if ($r13 != null) {
                            if (-1027449183 * $r13.size < 0) {
                                this.head[$i0][2078821397 * $r13.length] = null;
                                $r13.size = 0;
                            }
                        }
                        this.count[$i0][$r5.list * -637203839] = $r5;
                    }
                    this.size.next.toString($r5);
                    this.head[$i0][i] = $r5;
                }
            }
        } catch (RuntimeException $r14) {
            throw StringBuilder.append($r14, "nx.az(" + ')');
        }
    }

    boolean add(Range range, int[] iArr, int i, int $i1) {
        range.value = 1080858401 * ((1688035177 * FileInfo.data) / 100);
        if (range.size * -1582833880 < 0 || !(range.data == null || range.data.copy())) {
            int $i2;
            long j;
            double $d1;
            long j2;
            int $i3 = range.name * 1535161885;
            if ($i3 > 0) {
                $i2 = (16.0d * Math.pow(2.0d, 4.921259842519685E-4d * ((double) this.length[range.this$0 * 1083981996]))) + 0.5d;
                j = $i2;
                $i2 = (int) $i2;
                $i3 -= $i2;
                if ($i3 < 0) {
                    $i3 = 0;
                }
                range.name = $i3 * 1207247324;
            }
            range.data.transform(toString(range, -1103876298));
            Chunk $r11 = range.start;
            boolean $z0 = false;
            range.group -= 2125953733;
            range.status += 1031440259 * $r11.content;
            $i2 = range.buffer * -1944461665;
            int i2 = $i2;
            double $d0 = 5.086263020833333E-6d * ((double) ((((range.name * -924181292) * $i2) >> 12) + (((-813031793 * range.length) - 60) << 8)));
            if (427936179 * $r11.position > 0) {
                if ($r11.size * 335894261 > 0) {
                    $d1 = (double) (-639056340 * $r11.size);
                    $i2 = (128.0d * Math.pow(2.0d, $d1 * $d0)) + 0.5d;
                    j2 = $i2;
                    $i2 = ((int) $i2) * 1010461384;
                    i2 = $i2;
                    range.first += $i2;
                } else {
                    range.first += 1386719104;
                }
            }
            if ($r11.value != null) {
                if (376658281 * $r11.key > 0) {
                    $d1 = (double) (376658281 * $r11.key);
                    $i2 = (128.0d * Math.pow(2.0d, $d1 * $d0)) + 0.5d;
                    j2 = $i2;
                    $i2 = ((int) $i2) * -299489263;
                    i2 = $i2;
                    range.index += $i2;
                } else {
                    range.index += 2003278464;
                }
                while (range.key * 1359862939 < $r11.value.length - 2 && range.index * -1794749667 > (($r11.value[(1596543946 * range.key) + 2] & (short) 255) << 8)) {
                    range.key -= 1602706118;
                }
                $i2 = range.key * -748037821;
                i2 = $i2;
                if ($r11.value.length - 2 == $i2 && $r11.value[(1291464042 * range.key) + 1] == (byte) 0) {
                    $z0 = true;
                }
            }
            if (-277673047 * range.size >= 0 && $r11.type != null && (this.type[238085141 * range.this$0] & 1) == 0 && (-429470428 * range.list < 0 || this.count[-176777135 * range.this$0][1600518545 * range.list] != range)) {
                if (1039691113 * $r11.pos > 0) {
                    $i2 = (Math.pow(2.0d, $d0 * ((double) (-89683889 * $r11.pos))) * 128.0d) + 0.5d;
                    j = $i2;
                    range.size = (((int) $i2) * 501286241) + range.size;
                } else {
                    range.size -= 1870198975;
                }
                while (range.count * -661844682 < $r11.type.length - 2 && range.size * -1027449183 > (($r11.type[(range.count * -515612770) + 2] & (short) 255) << 8)) {
                    range.count += 1171006815;
                }
                $i2 = range.count * 1728080337;
                i2 = $i2;
                if ($r11.type.length - 2 == $i2) {
                    $z0 = true;
                }
            }
            if ($z0) {
                range.data.toString(400280827 * range.value);
                if (iArr != null) {
                    range.data.toString(iArr, i, $i1);
                } else {
                    range.data.get($i1);
                }
                if (range.data.equals()) {
                    Entry $r9 = this.size;
                    Entry $r8 = $r9;
                    $r9.head.equals(range.data);
                }
                range.next((byte) 2);
                if (-1511138565 * range.size >= 0) {
                    range.iterator();
                    if (-637203839 * range.list > 0 && this.count[-1733964192 * range.this$0][784881678 * range.list] == range) {
                        this.count[range.this$0 * 1154795185][range.list * -637203839] = null;
                    }
                }
                return true;
            }
            range.data.set(range.value * -861965887, add(range, (byte) 10), add(range, (short) 9112));
            return false;
        }
        range.next((byte) 2);
        range.iterator();
        if (range.list * -637203839 > 0 && range == this.count[1829364743 * range.this$0][-637203839 * range.list]) {
            this.count[range.this$0 * -1265513172][range.list * -637203839] = null;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean add(p000.Range r33, int[] r34, int r35, int r36, byte r37) {
        /*
        r32 = this;
        r6 = p000.FileInfo.data;
        r7 = 1688035177; // 0x649d5f69 float:2.322411E22 double:8.3400019E-315;
        r6 = r7 * r6;
        r6 = r6 / 100;
        r7 = 1463180851; // 0x57365e33 float:2.00515699E14 double:7.22907392E-315;
        r6 = r7 * r6;
        r0 = r33;
        r0.value = r6;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r6 = r0.size;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -1027449183; // 0xffffffffc2c25ea1 float:-97.18482 double:NaN;
        r6 = r6 * r7;
        if (r6 < 0) goto L_0x0152;
    L_0x001c:
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        if (r8 == 0) goto L_0x002c;
    L_0x0022:
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        r9 = r8.copy();	 Catch:{ RuntimeException -> 0x0308 }
        if (r9 == 0) goto L_0x0152;
    L_0x002c:
        r7 = 2;
        r0 = r33;
        r0.next(r7);	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0.iterator();	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = -637203839; // 0xffffffffda050a81 float:-9.3619303E15 double:NaN;
        r0 = r35;
        r0 = r0 * r7;
        r35 = r0;
        if (r35 <= 0) goto L_0x008e;
    L_0x0047:
        r0 = r32;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r35 = r7 * r35;
        r11 = r10[r35];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = -637203839; // 0xffffffffda050a81 float:-9.3619303E15 double:NaN;
        r35 = r7 * r35;
        r12 = r11[r35];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        if (r0 != r12) goto L_0x008e;
    L_0x0069:
        r0 = r32;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r0 = r35;
        r0 = r0 * r7;
        r35 = r0;
        r11 = r10[r35];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = -637203839; // 0xffffffffda050a81 float:-9.3619303E15 double:NaN;
        r0 = r35;
        r0 = r0 * r7;
        r35 = r0;
        r13 = 0;
        r11[r35] = r13;	 Catch:{ RuntimeException -> 0x0308 }
    L_0x008e:
        r7 = 1;
        return r7;
    L_0x0090:
        r14 = r15.type;	 Catch:{ RuntimeException -> 0x0308 }
        r6 = r14.length;	 Catch:{ RuntimeException -> 0x0308 }
        r6 = r6 + -2;
        r0 = r33;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = 1728080337; // 0x670069d1 float:6.064149E23 double:8.53785128E-315;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        if (r6 != r0) goto L_0x00a6;
    L_0x00a5:
        r9 = 1;
    L_0x00a6:
        if (r9 == 0) goto L_0x0331;
    L_0x00a8:
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r6 = r0.value;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 400280827; // 0x17dbccfb float:1.4204288E-24 double:1.977650053E-315;
        r6 = r7 * r6;
        r8.toString(r6);	 Catch:{ RuntimeException -> 0x0308 }
        if (r34 == 0) goto L_0x049d;
    L_0x00ba:
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r34;
        r1 = r35;
        r2 = r36;
        r8.toString(r0, r1, r2);	 Catch:{ RuntimeException -> 0x0308 }
    L_0x00c7:
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        r9 = r8.equals();	 Catch:{ RuntimeException -> 0x0308 }
        if (r9 == 0) goto L_0x00e4;
    L_0x00d1:
        r0 = r32;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0308 }
        r17 = r0;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x0308 }
        r18 = r0;
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r18;
        r0.equals(r8);	 Catch:{ RuntimeException -> 0x0308 }
    L_0x00e4:
        r7 = 2;
        r0 = r33;
        r0.next(r7);	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = -1027449183; // 0xffffffffc2c25ea1 float:-97.18482 double:NaN;
        r35 = r7 * r35;
        if (r35 < 0) goto L_0x0150;
    L_0x00f7:
        r0 = r33;
        r0.iterator();	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = -637203839; // 0xffffffffda050a81 float:-9.3619303E15 double:NaN;
        r35 = r7 * r35;
        if (r35 <= 0) goto L_0x0150;
    L_0x0109:
        r0 = r32;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r35 = r7 * r35;
        r11 = r10[r35];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = -637203839; // 0xffffffffda050a81 float:-9.3619303E15 double:NaN;
        r35 = r7 * r35;
        r12 = r11[r35];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        if (r12 != r0) goto L_0x0150;
    L_0x012b:
        r0 = r32;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r0 = r35;
        r0 = r0 * r7;
        r35 = r0;
        r11 = r10[r35];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = -637203839; // 0xffffffffda050a81 float:-9.3619303E15 double:NaN;
        r0 = r35;
        r0 = r0 * r7;
        r35 = r0;
        r13 = 0;
        r11[r35] = r13;	 Catch:{ RuntimeException -> 0x0308 }
    L_0x0150:
        r7 = 1;
        return r7;
    L_0x0152:
        r0 = r33;
        r6 = r0.name;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 1535161885; // 0x5b80b61d float:7.2458065E16 double:7.58470748E-315;
        r6 = r6 * r7;
        if (r6 <= 0) goto L_0x01ad;
    L_0x015c:
        r0 = r32;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0308 }
        r19 = r0;
        r0 = r33;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r16 = r19[r16];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r16;
        r0 = (double) r0;
        r20 = r0;
        r22 = 4557678284313330696; // 0x3f40204081020408 float:-2.388012E-38 double:4.921259842519685E-4;
        r20 = r22 * r20;
        r22 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r0 = r22;
        r2 = r20;
        r20 = java.lang.Math.pow(r0, r2);	 Catch:{ RuntimeException -> 0x0308 }
        r22 = 4625196817309499392; // 0x4030000000000000 float:0.0 double:16.0;
        r20 = r22 * r20;
        r22 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r0 = r20;
        r2 = r22;
        r0 = r0 + r2;
        r20 = r0;
        r0 = (int) r0;
        r16 = r0;
        r6 = r6 - r0;
        if (r6 >= 0) goto L_0x01a5;
    L_0x01a4:
        r6 = 0;
    L_0x01a5:
        r7 = -1803437003; // 0xffffffff9481bc35 float:-1.3099906E-26 double:NaN;
        r6 = r6 * r7;
        r0 = r33;
        r0.name = r6;	 Catch:{ RuntimeException -> 0x0308 }
    L_0x01ad:
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -1963636319; // 0xffffffff8af549a1 float:-2.3620338E-32 double:NaN;
        r0 = r32;
        r1 = r33;
        r6 = r0.toString(r1, r7);	 Catch:{ RuntimeException -> 0x0308 }
        r8.transform(r6);	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r15 = r0.start;	 Catch:{ RuntimeException -> 0x0308 }
        r9 = 0;
        r0 = r33;
        r6 = r0.group;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -2125953733; // 0xffffffff8148853b float:-3.6829787E-38 double:NaN;
        r6 = r6 + r7;
        r0 = r33;
        r0.group = r6;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r6 = r0.status;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r15.content;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = 1031440259; // 0x3d7a8783 float:0.06116439 double:5.095991977E-315;
        r16 = r7 * r16;
        r0 = r16;
        r6 = r6 + r0;
        r0 = r33;
        r0.status = r6;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r6 = r0.name;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 1535161885; // 0x5b80b61d float:7.2458065E16 double:7.58470748E-315;
        r6 = r6 * r7;
        r0 = r33;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = 1362240119; // 0x51322277 float:4.781765E10 double:6.73036044E-315;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r6 = r6 * r0;
        r6 = r6 >> 12;
        r0 = r33;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = 2078821397; // 0x7be84c15 float:2.412312E36 double:1.027074236E-314;
        r16 = r7 * r16;
        r16 = r16 + -60;
        r16 = r16 << 8;
        r0 = r16;
        r6 = r6 + r0;
        r0 = (double) r6;
        r20 = r0;
        r22 = 4527618825383138645; // 0x3ed5555555555555 float:1.46601547E13 double:5.086263020833333E-6;
        r20 = r22 * r20;
        r6 = r15.position;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 400360881; // 0x17dd05b1 float:1.4283227E-24 double:1.97804557E-315;
        r6 = r7 * r6;
        if (r6 <= 0) goto L_0x0271;
    L_0x0222:
        r6 = r15.size;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 335894261; // 0x140556f5 float:6.731933E-27 double:1.65953815E-315;
        r6 = r6 * r7;
        if (r6 <= 0) goto L_0x0481;
    L_0x022a:
        r0 = r33;
        r6 = r0.first;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r15.size;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = 335894261; // 0x140556f5 float:6.731933E-27 double:1.65953815E-315;
        r16 = r7 * r16;
        r0 = r16;
        r0 = (double) r0;
        r24 = r0;
        r2 = r20;
        r0 = r0 * r2;
        r24 = r0;
        r22 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r0 = r22;
        r2 = r24;
        r24 = java.lang.Math.pow(r0, r2);	 Catch:{ RuntimeException -> 0x0308 }
        r22 = 4638707616191610880; // 0x4060000000000000 float:0.0 double:128.0;
        r24 = r22 * r24;
        r22 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r0 = r24;
        r2 = r22;
        r0 = r0 + r2;
        r24 = r0;
        r0 = (int) r0;
        r16 = r0;
        r7 = -895135921; // 0xffffffffcaa54f4f float:-5416871.5 double:NaN;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r6 = r6 + r0;
        r0 = r33;
        r0.first = r6;	 Catch:{ RuntimeException -> 0x0308 }
    L_0x0271:
        r14 = r15.value;	 Catch:{ RuntimeException -> 0x0308 }
        if (r14 == 0) goto L_0x0396;
    L_0x0275:
        r6 = r15.key;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 376658281; // 0x16735969 float:1.9657597E-25 double:1.86093917E-315;
        r6 = r7 * r6;
        if (r6 <= 0) goto L_0x0360;
    L_0x027e:
        r0 = r33;
        r6 = r0.index;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r15.key;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = 376658281; // 0x16735969 float:1.9657597E-25 double:1.86093917E-315;
        r16 = r7 * r16;
        r0 = r16;
        r0 = (double) r0;
        r24 = r0;
        r2 = r20;
        r0 = r0 * r2;
        r24 = r0;
        r22 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r0 = r22;
        r2 = r24;
        r24 = java.lang.Math.pow(r0, r2);	 Catch:{ RuntimeException -> 0x0308 }
        r22 = 4638707616191610880; // 0x4060000000000000 float:0.0 double:128.0;
        r24 = r22 * r24;
        r22 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r0 = r24;
        r2 = r22;
        r0 = r0 + r2;
        r24 = r0;
        r0 = (int) r0;
        r16 = r0;
        r7 = 49205045; // 0x2eecf35 float:3.5089888E-37 double:2.43105223E-316;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r6 = r6 + r0;
        r0 = r33;
        r0.index = r6;	 Catch:{ RuntimeException -> 0x0308 }
    L_0x02c5:
        r0 = r33;
        r6 = r0.key;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -748037821; // 0xffffffffd369d943 float:-1.00437243E12 double:NaN;
        r6 = r6 * r7;
        r14 = r15.value;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r14.length;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r16 = r16 + -2;
        r0 = r16;
        if (r6 >= r0) goto L_0x036f;
    L_0x02d8:
        r0 = r33;
        r6 = r0.index;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -1794749667; // 0xffffffff95064b1d float:-2.7120338E-26 double:NaN;
        r6 = r6 * r7;
        r14 = r15.value;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = -748037821; // 0xffffffffd369d943 float:-1.00437243E12 double:NaN;
        r16 = r7 * r16;
        r16 = r16 + 2;
        r37 = r14[r16];	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r26 = r37 & r7;
        r16 = r26 << 8;
        r0 = r16;
        if (r6 <= r0) goto L_0x036f;
    L_0x02fb:
        r0 = r33;
        r6 = r0.key;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -211093802; // 0xfffffffff36af6d6 float:-1.8615782E31 double:NaN;
        r6 = r6 + r7;
        r0 = r33;
        r0.key = r6;	 Catch:{ RuntimeException -> 0x0308 }
        goto L_0x02c5;
    L_0x0308:
        r27 = move-exception;
        r28 = new java.lang.StringBuilder;
        r0 = r28;
        r0.<init>();
        r29 = "nx.bq(";
        r0 = r28;
        r1 = r29;
        r28 = r0.append(r1);
        r7 = 41;
        r0 = r28;
        r28 = r0.append(r7);
        r0 = r28;
        r30 = r0.toString();
        r0 = r27;
        r1 = r30;
        r31 = p000.StringBuilder.append(r0, r1);
        throw r31;
    L_0x0331:
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x0308 }
        r35 = r0;
        r7 = 400280827; // 0x17dbccfb float:1.4204288E-24 double:1.977650053E-315;
        r0 = r35;
        r0 = r0 * r7;
        r35 = r0;
        r7 = 17;
        r0 = r32;
        r1 = r33;
        r36 = r0.add(r1, r7);	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 30212; // 0x7604 float:4.2336E-41 double:1.49267E-319;
        r0 = r32;
        r1 = r33;
        r6 = r0.add(r1, r7);	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r35;
        r1 = r36;
        r8.set(r0, r1, r6);	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 0;
        return r7;
    L_0x0360:
        r0 = r33;
        r6 = r0.index;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 2003278464; // 0x77679a80 float:4.6974774E33 double:9.89751068E-315;
        r6 = r6 + r7;
        r0 = r33;
        r0.index = r6;	 Catch:{ RuntimeException -> 0x0308 }
        goto L_0x02c5;
    L_0x036f:
        r14 = r15.value;	 Catch:{ RuntimeException -> 0x0308 }
        r6 = r14.length;	 Catch:{ RuntimeException -> 0x0308 }
        r6 = r6 + -2;
        r0 = r33;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = -748037821; // 0xffffffffd369d943 float:-1.00437243E12 double:NaN;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        if (r6 != r0) goto L_0x0396;
    L_0x0384:
        r14 = r15.value;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r6 = r0.key;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -748037821; // 0xffffffffd369d943 float:-1.00437243E12 double:NaN;
        r6 = r7 * r6;
        r6 = r6 + 1;
        r37 = r14[r6];	 Catch:{ RuntimeException -> 0x0308 }
        if (r37 != 0) goto L_0x0396;
    L_0x0395:
        r9 = 1;
    L_0x0396:
        r0 = r33;
        r6 = r0.size;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -1027449183; // 0xffffffffc2c25ea1 float:-97.18482 double:NaN;
        r6 = r7 * r6;
        if (r6 < 0) goto L_0x00a6;
    L_0x03a1:
        r14 = r15.type;	 Catch:{ RuntimeException -> 0x0308 }
        if (r14 == 0) goto L_0x00a6;
    L_0x03a5:
        r0 = r32;
        r0 = r0.type;	 Catch:{ RuntimeException -> 0x0308 }
        r19 = r0;
        r0 = r33;
        r6 = r0.this$0;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r6 = r7 * r6;
        r6 = r19[r6];	 Catch:{ RuntimeException -> 0x0308 }
        r6 = r6 & 1;
        if (r6 != 0) goto L_0x00a6;
    L_0x03ba:
        r0 = r33;
        r6 = r0.list;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -637203839; // 0xffffffffda050a81 float:-9.3619303E15 double:NaN;
        r6 = r7 * r6;
        if (r6 < 0) goto L_0x03e3;
    L_0x03c5:
        r0 = r32;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r6 = r0.this$0;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r6 = r7 * r6;
        r11 = r10[r6];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r6 = r0.list;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -637203839; // 0xffffffffda050a81 float:-9.3619303E15 double:NaN;
        r6 = r7 * r6;
        r12 = r11[r6];	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        if (r12 == r0) goto L_0x00a6;
    L_0x03e3:
        r6 = r15.pos;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -89683889; // 0xfffffffffaa7884f float:-4.3493912E35 double:NaN;
        r6 = r7 * r6;
        if (r6 <= 0) goto L_0x0490;
    L_0x03ec:
        r0 = r33;
        r6 = r0.size;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r15.pos;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = -89683889; // 0xfffffffffaa7884f float:-4.3493912E35 double:NaN;
        r16 = r7 * r16;
        r0 = r16;
        r0 = (double) r0;
        r24 = r0;
        r0 = r20;
        r2 = r24;
        r0 = r0 * r2;
        r20 = r0;
        r22 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r0 = r22;
        r2 = r20;
        r20 = java.lang.Math.pow(r0, r2);	 Catch:{ RuntimeException -> 0x0308 }
        r22 = 4638707616191610880; // 0x4060000000000000 float:0.0 double:128.0;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r22 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r0 = r20;
        r2 = r22;
        r0 = r0 + r2;
        r20 = r0;
        r0 = (int) r0;
        r16 = r0;
        r7 = 501286241; // 0x1de10561 float:5.9562566E-21 double:2.476683104E-315;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r6 = r16 + r6;
        r0 = r33;
        r0.size = r6;	 Catch:{ RuntimeException -> 0x0308 }
    L_0x043b:
        r0 = r33;
        r6 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 1728080337; // 0x670069d1 float:6.064149E23 double:8.53785128E-315;
        r6 = r6 * r7;
        r14 = r15.type;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r14.length;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r16 = r16 + -2;
        r0 = r16;
        if (r6 >= r0) goto L_0x0090;
    L_0x044e:
        r0 = r33;
        r6 = r0.size;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -1027449183; // 0xffffffffc2c25ea1 float:-97.18482 double:NaN;
        r6 = r6 * r7;
        r14 = r15.type;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r33;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r16 = r0;
        r7 = 1728080337; // 0x670069d1 float:6.064149E23 double:8.53785128E-315;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r16 = r16 + 2;
        r37 = r14[r16];	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r26 = r37 & r7;
        r16 = r26 << 8;
        r0 = r16;
        if (r6 <= r0) goto L_0x0090;
    L_0x0474:
        r0 = r33;
        r6 = r0.count;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -1449058718; // 0xffffffffa9a11e62 float:-7.155107E-14 double:NaN;
        r6 = r6 + r7;
        r0 = r33;
        r0.count = r6;	 Catch:{ RuntimeException -> 0x0308 }
        goto L_0x043b;
    L_0x0481:
        r0 = r33;
        r6 = r0.first;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = 1386719104; // 0x52a7a780 float:3.60034861E11 double:6.851302697E-315;
        r6 = r6 + r7;
        r0 = r33;
        r0.first = r6;	 Catch:{ RuntimeException -> 0x0308 }
        goto L_0x0271;
    L_0x0490:
        r0 = r33;
        r6 = r0.size;	 Catch:{ RuntimeException -> 0x0308 }
        r7 = -259870592; // 0xfffffffff082b080 float:-3.235714E29 double:NaN;
        r6 = r6 + r7;
        r0 = r33;
        r0.size = r6;	 Catch:{ RuntimeException -> 0x0308 }
        goto L_0x043b;
    L_0x049d:
        r0 = r33;
        r8 = r0.data;	 Catch:{ RuntimeException -> 0x0308 }
        r0 = r36;
        r8.get(r0);	 Catch:{ RuntimeException -> 0x0308 }
        goto L_0x00c7;
        */
        throw new UnsupportedOperationException("Method not decompiled: Window.add(Range, int[], int, int, byte):boolean");
    }

    void addAll(int i) {
        Range $r4 = (Range) this.size.next.get();
        while ($r4 != null) {
            if ((i < 0 || i == $r4.this$0 * 1829364743) && $r4.size * -817842549 < 0) {
                this.head[$r4.this$0 * 1829364743][$r4.length * 2078821397] = null;
                $r4.size = 0;
            }
            $r4 = (Range) this.size.next.next();
        }
    }

    void append(int i, int i2, int i3) {
        try {
            this.context[i] = i2;
            this.buffer[i] = (int) ((2097152.0d * Math.pow(2.0d, 5.4931640625E-4d * ((double) i2))) + 0.5d);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nx.bd(" + ')');
        }
    }

    public synchronized boolean apply(int i) {
        try {
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nx.at(" + ')');
        }
        return this.this$0.get();
    }

    synchronized void check() {
        GifDrawable $r3 = (GifDrawable) this.next.next();
        while ($r3 != null) {
            $r3.iterator();
            $r3 = (GifDrawable) this.next.get();
        }
    }

    void check(int i, int i2) {
        this.state[i] = i2;
    }

    protected synchronized int clear() {
        return 0;
    }

    int clear(Range range) {
        int $i0 = this.log[range.this$0 * 1829364743];
        if ($i0 < 8192) {
            return (($i0 * (range.top * -752208127)) + 32) >> 6;
        }
        return FileInfo.INITIAL_MAX_FRAME_SIZE - ((((FileInfo.INITIAL_MAX_FRAME_SIZE - $i0) * (Constants.f93X - (range.top * -752208127))) + 32) >> 6);
    }

    void clear(int i) {
        if ((this.type[i] & 2) != 0) {
            Range $r5 = (Range) this.size.next.get();
            while ($r5 != null) {
                if (i == 1829364743 * $r5.this$0 && this.head[i][$r5.length * 2078821397] == null && $r5.size * -1027449183 < 0) {
                    $r5.size = 0;
                }
                $r5 = (Range) this.size.next.next();
            }
        }
    }

    void clear(int i, int i2, int i3) {
        try {
            if (this.err[i] != i2) {
                this.err[i] = i2;
                for (i2 = 0; i2 < Constants.f93X; i2++) {
                    this.count[i][i2] = null;
                }
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nx.ai(" + ')');
        }
    }

    void clear(Range range, boolean z) {
        int $i1;
        int $i0 = range.next.data.length;
        if (z && range.next.token) {
            $i1 = (int) ((((long) this.data[range.this$0 * 1829364743]) * ((long) (($i0 + $i0) - range.next.name))) >> 6);
            $i0 <<= 8;
            if ($i1 >= $i0) {
                $i1 = (($i0 + $i0) - 1) - $i1;
                range.data.toString(true);
            }
        } else {
            $i1 = (int) ((((long) $i0) * ((long) this.data[576842699 * range.this$0])) >> 6);
        }
        range.data.write($i1);
    }

    synchronized void close() {
        GifDrawable $r3 = (GifDrawable) this.next.next();
        while ($r3 != null) {
            $r3.iterator();
            $r3 = (GifDrawable) this.next.get();
        }
    }

    public synchronized void close(int $i0) {
        this.offset = 475858181 * $i0;
    }

    void close(int i, int i2) {
        this.state[i] = i2;
    }

    void consume(int i) {
        if (i < 0) {
            for (int $i1 = 0; $i1 < 16; $i1++) {
                add($i1, (byte) -46);
            }
            return;
        }
        this.content[i] = 12800;
        this.log[i] = 8192;
        this.parent[i] = 16383;
        this.state[i] = 8192;
        this.input[i] = 0;
        this.length[i] = 8192;
        get(i, -2028183028);
        add(i, -1508428739);
        this.type[i] = 0;
        this.title[i] = 32767;
        this.header[i] = 256;
        this.data[i] = 0;
        append(i, 8192, 51608897);
    }

    void consume(int i, int i2) {
        this.state[i] = i2;
    }

    protected synchronized Entry contains() {
        return this.size;
    }

    public synchronized boolean decode(Base64 base64, Class classR, GifDecoder gifDecoder, int i) {
        boolean $z0 = true;
        synchronized (this) {
            base64.decode();
            int[] $r4 = i > 0 ? new int[]{i} : null;
            ReflectiveTypeAdapterFactory$BoundField $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.next();
            while ($r7 != null) {
                i = (int) $r7.size;
                GifDrawable $r8 = (GifDrawable) this.next.get((long) i);
                if ($r8 == null) {
                    byte[] $r9 = classR.add(i, (byte) 51);
                    $r8 = $r9 == null ? null : new GifDrawable($r9);
                    if ($r8 == null) {
                        $z0 = false;
                        $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.get();
                    } else {
                        this.next.get($r8, (long) i);
                    }
                }
                if (!$r8.decode(gifDecoder, $r7.name, $r4, -1161439010)) {
                    $z0 = false;
                }
                $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.get();
            }
            if ($z0) {
                base64.reset();
            }
        }
        return $z0;
    }

    void draw(int i, int i2) {
        this.children[i] = i2;
        this.key[i] = i2 & -128;
        clear(i, i2, 2082092636);
    }

    void dump() {
        toString(-1, -2138407130);
        add(-1, (byte) -8);
        for (int $i1 = 0; $i1 < 16; $i1++) {
            this.err[$i1] = this.children[$i1];
        }
        for (int $i0 = 0; $i0 < 16; $i0++) {
            this.key[$i0] = this.children[$i0] & -128;
        }
    }

    void equals(int i) {
        Range $r4 = (Range) this.size.next.get();
        while ($r4 != null) {
            if (i < 0 || i == $r4.this$0 * -63736097) {
                if ($r4.data != null) {
                    $r4.data.toString((FileInfo.data * 1688035177) / -1981052898);
                    if ($r4.data.equals()) {
                        this.size.head.equals($r4.data);
                    }
                    $r4.next((byte) 2);
                }
                if ($r4.size * 683686410 < 0) {
                    this.head[$r4.this$0 * -632042516][1722360805 * $r4.length] = null;
                }
                $r4.iterator();
            }
            $r4 = (Range) this.size.next.next();
        }
    }

    void expand(int i, int i2) {
        this.context[i] = i2;
        this.buffer[i] = (int) ((2097152.0d * Math.pow(2.0d, 5.4931640625E-4d * ((double) i2))) + 0.5d);
    }

    void expand(int i, int i2, int i3) {
    }

    protected synchronized int fill() {
        return 0;
    }

    int get(Range range) {
        int $i2;
        int $i1;
        Chunk $r2 = range.start;
        int $i0 = ((this.content[1829364743 * range.this$0] * this.parent[range.this$0 * 1829364743]) + ScrollingTextView.MP3_MAX_INPUT_SIZE) >> 13;
        $i0 = (((((((($i0 * $i0) + FileInfo.INITIAL_MAX_FRAME_SIZE) >> 15) * (163878951 * range.end)) + FileInfo.INITIAL_MAX_FRAME_SIZE) >> 15) * (-756547635 * this.offset)) + Constants.f93X) >> 8;
        if (400360881 * $r2.position > 0) {
            $i0 = (int) ((((double) $i0) * Math.pow(0.5d, ((double) (400360881 * $r2.position)) * (1.953125E-5d * ((double) (range.first * 319449007))))) + 0.5d);
        }
        if ($r2.value != null) {
            $i2 = -1794749667 * range.index;
            $i1 = $r2.value[(range.key * -748037821) + 1];
            if (range.key * -748037821 < $r2.value.length - 2) {
                int $i3 = ($r2.value[-748037821 * range.key] & (short) 255) << 8;
                $i2 -= $i3;
                int i = ($i2 * ($r2.value[(-748037821 * range.key) + 3] - $i1)) / ((($r2.value[(-748037821 * range.key) + 2] & (short) 255) << 8) - $i3);
                $i2 = i;
                $i1 += i;
            }
            $i0 = (($i0 * $i1) + 32) >> 6;
        }
        if (range.size * -1027449183 <= 0 || $r2.type == null) {
            return $i0;
        }
        $i2 = range.size * -1027449183;
        $i1 = $r2.type[(range.count * 1728080337) + 1];
        if (1728080337 * range.count < $r2.type.length - 2) {
            $i3 = ($r2.type[range.count * 1728080337] & (short) 255) << 8;
            i = (($r2.type[(range.count * 1728080337) + 3] - $i1) * ($i2 - $i3)) / ((($r2.type[(1728080337 * range.count) + 2] & (short) 255) << 8) - $i3);
            $i2 = i;
            $i1 += i;
        }
        return (($i0 * $i1) + 32) >> 6;
    }

    protected synchronized Entry get() {
        return null;
    }

    protected synchronized void get(int r24) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x004d in list [B:55:0x00d7]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r23 = this;
        monitor-enter(r23);
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r2 = r0.this$0;	 Catch:{ RuntimeException -> 0x00ae }
        r3 = r2.get();	 Catch:{ RuntimeException -> 0x00ae }
        if (r3 == 0) goto L_0x004d;	 Catch:{ RuntimeException -> 0x00ae }
    L_0x000b:
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r2 = r0.this$0;	 Catch:{ RuntimeException -> 0x00ae }
        r4 = r2.name;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r5 = r0.text;	 Catch:{ RuntimeException -> 0x00ae }
        r6 = -763407581; // 0xffffffffd27f5323 float:-2.74152866E11 double:NaN;	 Catch:{ RuntimeException -> 0x00ae }
        r5 = r5 * r6;	 Catch:{ RuntimeException -> 0x00ae }
        r4 = r4 * r5;	 Catch:{ RuntimeException -> 0x00ae }
        r5 = p000.FileInfo.data;	 Catch:{ RuntimeException -> 0x00ae }
        r6 = 1688035177; // 0x649d5f69 float:2.322411E22 double:8.3400019E-315;	 Catch:{ RuntimeException -> 0x00ae }
        r5 = r5 * r6;	 Catch:{ RuntimeException -> 0x00ae }
        r4 = r4 / r5;	 Catch:{ RuntimeException -> 0x00ae }
    L_0x0021:
        r0 = r24;	 Catch:{ RuntimeException -> 0x00ae }
        r7 = (long) r0;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = (long) r4;	 Catch:{ RuntimeException -> 0x00ae }
        r7 = r7 * r9;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = r0.value;	 Catch:{ RuntimeException -> 0x00ae }
        r11 = 7801888413140150363; // 0x6c45e02cf274685b float:-4.840992E30 double:3.6822105743432117E213;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = r9 * r11;	 Catch:{ RuntimeException -> 0x00ae }
        r7 = r7 + r9;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = r0.name;	 Catch:{ RuntimeException -> 0x00ae }
        r11 = -4495405376033779737; // 0xc19d1ca0d0200fe7 float:-1.07415869E10 double:-1.2210386003131066E8;
        r9 = r9 * r11;
        r9 = r9 - r7;
        r11 = 0;
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 < 0) goto L_0x0058;
    L_0x0042:
        r11 = 4870572680668153811; // 0x4397c00c33f287d3 float:1.12937094E-7 double:4.2784531891316038E17;
        r7 = r11 * r7;
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r0.value = r7;	 Catch:{ RuntimeException -> 0x00ae }
    L_0x004d:
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r14 = r0.size;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00ae }
        r14.get(r0);	 Catch:{ RuntimeException -> 0x00ae }
        monitor-exit(r23);
        return;
    L_0x0058:
        r7 = (long) r4;
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = r0.name;	 Catch:{ RuntimeException -> 0x00ae }
        r11 = -4495405376033779737; // 0xc19d1ca0d0200fe7 float:-1.07415869E10 double:-1.2210386003131066E8;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = r9 * r11;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00ae }
        r15 = r0;	 Catch:{ RuntimeException -> 0x00ae }
        r11 = 7801888413140150363; // 0x6c45e02cf274685b float:-4.840992E30 double:3.6822105743432117E213;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r15;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r0 * r11;	 Catch:{ RuntimeException -> 0x00ae }
        r15 = r0;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = r9 - r0;	 Catch:{ RuntimeException -> 0x00ae }
        r7 = r7 + r9;	 Catch:{ RuntimeException -> 0x00ae }
        r11 = 1;	 Catch:{ RuntimeException -> 0x00ae }
        r7 = r7 - r11;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = (long) r4;	 Catch:{ RuntimeException -> 0x00ae }
        r7 = r7 / r9;	 Catch:{ RuntimeException -> 0x00ae }
        r5 = (int) r7;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r7 = r0.value;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = (long) r5;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = (long) r4;	 Catch:{ RuntimeException -> 0x00ae }
        r15 = r0;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = r9 * r0;	 Catch:{ RuntimeException -> 0x00ae }
        r11 = 4870572680668153811; // 0x4397c00c33f287d3 float:1.12937094E-7 double:4.2784531891316038E17;	 Catch:{ RuntimeException -> 0x00ae }
        r9 = r9 * r11;	 Catch:{ RuntimeException -> 0x00ae }
        r7 = r7 + r9;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r0.value = r7;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r14 = r0.size;	 Catch:{ RuntimeException -> 0x00ae }
        r14.get(r5);	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r24;
        r0 = r0 - r5;
        r24 = r0;
        r6 = -1668316417; // 0xffffffff9c8f82ff float:-9.496808E-22 double:NaN;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r0.read(r6);	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r23;	 Catch:{ RuntimeException -> 0x00ae }
        r2 = r0.this$0;	 Catch:{ RuntimeException -> 0x00ae }
        r3 = r2.get();	 Catch:{ RuntimeException -> 0x00ae }
        if (r3 != 0) goto L_0x0021;
    L_0x00ad:
        goto L_0x004d;
    L_0x00ae:
        r17 = move-exception;
        r18 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r18;	 Catch:{ RuntimeException -> 0x00ae }
        r0.<init>();	 Catch:{ RuntimeException -> 0x00ae }
        r19 = "nx.aq(";	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r18;	 Catch:{ RuntimeException -> 0x00ae }
        r1 = r19;	 Catch:{ RuntimeException -> 0x00ae }
        r18 = r0.append(r1);	 Catch:{ RuntimeException -> 0x00ae }
        r6 = 41;	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r18;	 Catch:{ RuntimeException -> 0x00ae }
        r18 = r0.append(r6);	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r18;	 Catch:{ RuntimeException -> 0x00ae }
        r20 = r0.toString();	 Catch:{ RuntimeException -> 0x00ae }
        r0 = r17;	 Catch:{ RuntimeException -> 0x00ae }
        r1 = r20;	 Catch:{ RuntimeException -> 0x00ae }
        r21 = p000.StringBuilder.append(r0, r1);	 Catch:{ RuntimeException -> 0x00ae }
        throw r21;	 Catch:{ RuntimeException -> 0x00ae }
    L_0x00d7:
        r22 = move-exception;
        monitor-exit(r23);
        throw r22;
        */
        throw new UnsupportedOperationException("Method not decompiled: Window.get(int):void");
    }

    void get(int i, int i2) {
        try {
            if ((this.type[i] & 2) != 0) {
                Range $r5 = (Range) this.size.next.get();
                while ($r5 != null) {
                    if (i == 1829364743 * $r5.this$0) {
                        if (this.head[i][$r5.length * 2078821397] == null) {
                            if ($r5.size * -1027449183 < 0) {
                                $r5.size = 0;
                            }
                        }
                    }
                    $r5 = (Range) this.size.next.next();
                }
            }
        } catch (RuntimeException $r9) {
            throw StringBuilder.append($r9, "nx.bn(" + ')');
        }
    }

    boolean get(Range range, int i) {
        try {
            if (range.data != null) {
                return false;
            }
            if (-1027449183 * range.size >= 0) {
                range.iterator();
                if (range.list * -637203839 > 0) {
                    if (this.count[range.this$0 * 1829364743][range.list * -637203839] == range) {
                        this.count[range.this$0 * 1829364743][range.list * -637203839] = null;
                    }
                }
            }
            return true;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "nx.bi(" + ')');
        }
    }

    protected synchronized Entry getEntry() {
        return null;
    }

    public synchronized void getSize() {
        GifDrawable $r3 = (GifDrawable) this.next.next();
        while ($r3 != null) {
            $r3.get(1804370547);
            $r3 = (GifDrawable) this.next.get();
        }
    }

    public synchronized void getSize(int i) {
        try {
            GifDrawable $r3 = (GifDrawable) this.next.next();
            while ($r3 != null) {
                $r3.get(1913104827);
                $r3 = (GifDrawable) this.next.get();
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nx.aa(" + ')');
        }
    }

    void getSize(int i, int i2, int i3) {
    }

    public synchronized boolean getTitle() {
        return this.this$0.get();
    }

    protected synchronized int getType() {
        return 0;
    }

    protected synchronized Entry indexOf() {
        return this.size;
    }

    void indexOf(int i) {
        Range $r4 = (Range) this.size.next.get();
        while ($r4 != null) {
            if ((i < 0 || i == $r4.this$0 * 1829364743) && $r4.size * -1027449183 < 0) {
                this.head[$r4.this$0 * 1829364743][$r4.length * 2078821397] = null;
                $r4.size = 0;
            }
            $r4 = (Range) this.size.next.next();
        }
    }

    void init(int $i0) {
        int $i1 = $i0 & 240;
        if (Constants.f93X == $i1) {
            toString($i0 & 15, ($i0 >> 8) & 127, ($i0 >> 16) & 127, (short) 12962);
        } else if (144 == $i1) {
            $i1 = $i0 & 15;
            $i2 = ($i0 >> 8) & 127;
            $i0 = ($i0 >> 16) & 127;
            if ($i0 > 0) {
                add($i1, $i2, $i0, (short) 255);
            } else {
                toString($i1, $i2, 64, (short) 27523);
            }
        } else if (160 == $i1) {
            map($i0 & 15, ($i0 >> 8) & 127, ($i0 >> 16) & 127, (short) 13344);
        } else {
            if ($i1 == 176) {
                int[] $r1;
                $i1 = $i0 & 15;
                $i2 = ($i0 >> 8) & 127;
                $i0 = ($i0 >> 16) & 127;
                if ($i2 == 0) {
                    this.key[$i1] = (this.key[$i1] & -2080769) + ($i0 << 14);
                }
                if (32 == $i2) {
                    this.key[$i1] = (this.key[$i1] & -16257) + ($i0 << 7);
                }
                if (1 == $i2) {
                    this.input[$i1] = ($i0 << 7) + (this.input[$i1] & -16257);
                }
                if ($i2 == 33) {
                    this.input[$i1] = (this.input[$i1] & -128) + $i0;
                }
                if ($i2 == 5) {
                    this.length[$i1] = ($i0 << 7) + (this.length[$i1] & -16257);
                }
                if (37 == $i2) {
                    this.length[$i1] = (this.length[$i1] & -128) + $i0;
                }
                if ($i2 == 7) {
                    this.content[$i1] = (this.content[$i1] & -16257) + ($i0 << 7);
                }
                if (39 == $i2) {
                    this.content[$i1] = (this.content[$i1] & -128) + $i0;
                }
                if ($i2 == 10) {
                    this.log[$i1] = ($i0 << 7) + (this.log[$i1] & -16257);
                }
                if (42 == $i2) {
                    this.log[$i1] = (this.log[$i1] & -128) + $i0;
                }
                if ($i2 == 11) {
                    this.parent[$i1] = ($i0 << 7) + (this.parent[$i1] & -16257);
                }
                if (43 == $i2) {
                    this.parent[$i1] = (this.parent[$i1] & -128) + $i0;
                }
                if (64 == $i2) {
                    if ($i0 >= 64) {
                        $r1 = this.type;
                        $r1[$i1] = $r1[$i1] | 1;
                    } else {
                        $r1 = this.type;
                        $r1[$i1] = $r1[$i1] & -2;
                    }
                }
                if (65 == $i2) {
                    if ($i0 >= 64) {
                        $r1 = this.type;
                        $r1[$i1] = $r1[$i1] | 2;
                    } else {
                        get($i1, -2106773804);
                        $r1 = this.type;
                        $r1[$i1] = $r1[$i1] & -3;
                    }
                }
                if (99 == $i2) {
                    this.title[$i1] = ($i0 << 7) + (this.title[$i1] & 127);
                }
                if ($i2 == 98) {
                    this.title[$i1] = (this.title[$i1] & 16256) + $i0;
                }
                if ($i2 == MediaFile.FILE_TYPE_HTML) {
                    this.title[$i1] = ((this.title[$i1] & 127) + FileInfo.INITIAL_MAX_FRAME_SIZE) + ($i0 << 7);
                }
                if ($i2 == 100) {
                    this.title[$i1] = ((this.title[$i1] & 16256) + FileInfo.INITIAL_MAX_FRAME_SIZE) + $i0;
                }
                if ($i2 == 120) {
                    toString($i1, -2138407130);
                }
                if (121 == $i2) {
                    add($i1, (byte) -114);
                }
                if (123 == $i2) {
                    toArray($i1, -1037377479);
                }
                if ($i2 == 6 && this.title[$i1] == FileInfo.INITIAL_MAX_FRAME_SIZE) {
                    this.header[$i1] = ($i0 << 7) + (this.header[$i1] & -16257);
                }
                if ($i2 == 38 && FileInfo.INITIAL_MAX_FRAME_SIZE == this.title[$i1]) {
                    this.header[$i1] = (this.header[$i1] & -128) + $i0;
                }
                if (16 == $i2) {
                    this.data[$i1] = ($i0 << 7) + (this.data[$i1] & -16257);
                }
                if ($i2 == 48) {
                    this.data[$i1] = (this.data[$i1] & -128) + $i0;
                }
                if ($i2 == 81) {
                    if ($i0 >= 64) {
                        $r1 = this.type;
                        $r1[$i1] = $r1[$i1] | 4;
                    } else {
                        add($i1, -2032148933);
                        $r1 = this.type;
                        $r1[$i1] = $r1[$i1] & -5;
                    }
                }
                if (17 == $i2) {
                    append($i1, ($i0 << 7) + (this.context[$i1] & -16257), 51608897);
                }
                if ($i2 == 49) {
                    append($i1, (this.context[$i1] & -128) + $i0, 51608897);
                }
            } else if ($i1 == 192) {
                $i1 = $i0 & 15;
                clear($i1, (($i0 >> 8) & 127) + this.key[$i1], -1321630439);
            } else if ($i1 == 208) {
                map($i0 & 15, ($i0 >> 8) & 127, 497948861);
            } else if (224 == $i1) {
                open($i0 & 15, (($i0 >> 9) & 16256) + (($i0 >> 8) & 127), 340086283);
            } else if (255 == ($i0 & 255)) {
                initialize(1324362848);
            }
        }
    }

    void init(int $i0, int i) {
        i = $i0 & 240;
        if (Constants.f93X == i) {
            try {
                toString($i0 & 15, ($i0 >> 8) & 127, ($i0 >> 16) & 127, (short) 8556);
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "nx.bl(" + ')');
            }
        } else if (144 == i) {
            i = $i0 & 15;
            $i2 = ($i0 >> 8) & 127;
            $i0 = ($i0 >> 16) & 127;
            if ($i0 > 0) {
                add(i, $i2, $i0, (short) 255);
            } else {
                toString(i, $i2, 64, (short) 30506);
            }
        } else if (160 == i) {
            map($i0 & 15, ($i0 >> 8) & 127, ($i0 >> 16) & 127, (short) 1499);
        } else {
            if (i == 176) {
                int[] $r1;
                i = $i0 & 15;
                $i2 = ($i0 >> 8) & 127;
                $i0 = ($i0 >> 16) & 127;
                if ($i2 == 0) {
                    this.key[i] = (this.key[i] & -2080769) + ($i0 << 14);
                }
                if (32 == $i2) {
                    this.key[i] = (this.key[i] & -16257) + ($i0 << 7);
                }
                if (1 == $i2) {
                    this.input[i] = ($i0 << 7) + (this.input[i] & -16257);
                }
                if ($i2 == 33) {
                    this.input[i] = (this.input[i] & -128) + $i0;
                }
                if ($i2 == 5) {
                    this.length[i] = ($i0 << 7) + (this.length[i] & -16257);
                }
                if (37 == $i2) {
                    this.length[i] = (this.length[i] & -128) + $i0;
                }
                if ($i2 == 7) {
                    this.content[i] = (this.content[i] & -16257) + ($i0 << 7);
                }
                if (39 == $i2) {
                    this.content[i] = (this.content[i] & -128) + $i0;
                }
                if ($i2 == 10) {
                    this.log[i] = ($i0 << 7) + (this.log[i] & -16257);
                }
                if (42 == $i2) {
                    this.log[i] = (this.log[i] & -128) + $i0;
                }
                if ($i2 == 11) {
                    this.parent[i] = ($i0 << 7) + (this.parent[i] & -16257);
                }
                if (43 == $i2) {
                    this.parent[i] = (this.parent[i] & -128) + $i0;
                }
                if (64 == $i2) {
                    if ($i0 >= 64) {
                        $r1 = this.type;
                        $r1[i] = $r1[i] | 1;
                    } else {
                        $r1 = this.type;
                        $r1[i] = $r1[i] & -2;
                    }
                }
                if (65 == $i2) {
                    if ($i0 >= 64) {
                        $r1 = this.type;
                        $r1[i] = $r1[i] | 2;
                    } else {
                        get(i, -2113957506);
                        $r1 = this.type;
                        $r1[i] = $r1[i] & -3;
                    }
                }
                if (99 == $i2) {
                    this.title[i] = ($i0 << 7) + (this.title[i] & 127);
                }
                if ($i2 == 98) {
                    this.title[i] = (this.title[i] & 16256) + $i0;
                }
                if ($i2 == MediaFile.FILE_TYPE_HTML) {
                    this.title[i] = ((this.title[i] & 127) + FileInfo.INITIAL_MAX_FRAME_SIZE) + ($i0 << 7);
                }
                if ($i2 == 100) {
                    this.title[i] = ((this.title[i] & 16256) + FileInfo.INITIAL_MAX_FRAME_SIZE) + $i0;
                }
                if ($i2 == 120) {
                    toString(i, -2138407130);
                }
                if (121 == $i2) {
                    add(i, (byte) -19);
                }
                if (123 == $i2) {
                    toArray(i, -1481869948);
                }
                if ($i2 == 6) {
                    if (this.title[i] == FileInfo.INITIAL_MAX_FRAME_SIZE) {
                        this.header[i] = ($i0 << 7) + (this.header[i] & -16257);
                    }
                }
                if ($i2 == 38) {
                    if (FileInfo.INITIAL_MAX_FRAME_SIZE == this.title[i]) {
                        this.header[i] = (this.header[i] & -128) + $i0;
                    }
                }
                if (16 == $i2) {
                    this.data[i] = ($i0 << 7) + (this.data[i] & -16257);
                }
                if ($i2 == 48) {
                    this.data[i] = (this.data[i] & -128) + $i0;
                }
                if ($i2 == 81) {
                    if ($i0 >= 64) {
                        $r1 = this.type;
                        $r1[i] = $r1[i] | 4;
                    } else {
                        add(i, -1555097605);
                        $r1 = this.type;
                        $r1[i] = $r1[i] & -5;
                    }
                }
                if (17 == $i2) {
                    append(i, ($i0 << 7) + (this.context[i] & -16257), 51608897);
                }
                if ($i2 == 49) {
                    append(i, (this.context[i] & -128) + $i0, 51608897);
                }
            } else if (i == 192) {
                i = $i0 & 15;
                clear(i, (($i0 >> 8) & 127) + this.key[i], -85995174);
            } else if (i == 208) {
                map($i0 & 15, ($i0 >> 8) & 127, 1980164470);
            } else if (224 == i) {
                open($i0 & 15, (($i0 >> 9) & 16256) + (($i0 >> 8) & 127), 340086283);
            } else if (255 == ($i0 & 255)) {
                initialize(1324362848);
            }
        }
    }

    void initialize() {
        toString(-1, -2138407130);
        add(-1, (byte) -27);
        for (int $i1 = 0; $i1 < 16; $i1++) {
            this.err[$i1] = this.children[$i1];
        }
        for (int $i0 = 0; $i0 < 16; $i0++) {
            this.key[$i0] = this.children[$i0] & -128;
        }
    }

    void initialize(int i) {
        toString(-1, -2138407130);
        add(-1, (byte) 25);
        int $i1 = 0;
        while ($i1 < 16) {
            try {
                this.err[$i1] = this.children[$i1];
                $i1++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "nx.by(" + ')');
            }
        }
        for (i = 0; i < 16; i++) {
            this.key[i] = this.children[i] & -128;
        }
    }

    protected synchronized int isEmpty() {
        return 0;
    }

    boolean isEmpty(Range range) {
        if (range.data != null) {
            return false;
        }
        if (-1027449183 * range.size >= 0) {
            range.iterator();
            if (range.list * -2085614151 > 0 && this.count[range.this$0 * 1829364743][-1870114787 * range.list] == range) {
                this.count[range.this$0 * 1829364743][range.list * 559382687] = null;
            }
        }
        return true;
    }

    void iterate(int i, int i2) {
        if (this.err[i] != i2) {
            this.err[i] = i2;
            for (i2 = 0; i2 < Constants.f93X; i2++) {
                this.count[i][i2] = null;
            }
        }
    }

    public synchronized void layout() {
        this.this$0.clear();
        initialize(1324362848);
    }

    public synchronized void layout(int i, int i2) {
        transform(i, i2, -175300164);
    }

    void load() {
        toString(-1, -2138407130);
        add(-1, (byte) 67);
        for (int $i1 = 0; $i1 < 16; $i1++) {
            this.err[$i1] = this.children[$i1];
        }
        for (int $i0 = 0; $i0 < 16; $i0++) {
            this.key[$i0] = this.children[$i0] & -128;
        }
    }

    public synchronized void map() {
        this.this$0.clear();
        initialize(1324362848);
    }

    public synchronized void map(int i, int i2) {
        transform(i, i2, -175300164);
    }

    void map(int i, int i2, int i3) {
    }

    void map(int i, int i2, int i3, short s) {
    }

    void next(int i) {
        if (i < 0) {
            for (int $i1 = 0; $i1 < 16; $i1++) {
                add($i1, (byte) 91);
            }
            return;
        }
        this.content[i] = 12800;
        this.log[i] = 8192;
        this.parent[i] = -910613984;
        this.state[i] = 1002697636;
        this.input[i] = 0;
        this.length[i] = -865888211;
        get(i, -1991868246);
        add(i, -1757667298);
        this.type[i] = 0;
        this.title[i] = 1834094312;
        this.header[i] = 256;
        this.data[i] = 0;
        append(i, -1610627755, 51608897);
    }

    void next(int $i0, int i, int i2) {
        Range $r5;
        toString($i0, i, 64, (short) 21790);
        if ((this.type[$i0] & 2) != 0) {
            $r5 = (Range) this.size.next.append();
            while ($r5 != null) {
                if ($r5.this$0 * 1829364743 != $i0 || $r5.size * -1027449183 >= 0) {
                    $r5 = (Range) this.size.next.getValue();
                } else {
                    this.head[$i0][$r5.length * 2078821397] = null;
                    this.head[$i0][i] = $r5;
                    $i0 = ((($r5.buffer * 1362240119) * ($r5.name * 1535161885)) >> 12) + (-605041825 * $r5.parent);
                    int $i2 = $r5.parent + (((i - ($r5.length * 2078821397)) << 8) * -1956818785);
                    i2 = $i2;
                    $r5.parent = $i2;
                    $i2 = ($i0 - ($r5.parent * -605041825)) * -1070704825;
                    $i0 = $i2;
                    $r5.buffer = $i2;
                    $r5.name = 465784832;
                    $r5.length = 1191387965 * i;
                    return;
                }
            }
        }
        GifDrawable $r17 = (GifDrawable) this.next.get((long) this.err[$i0]);
        if ($r17 != null) {
            User $r9 = $r17.header[i];
            if ($r9 != null) {
                $r5 = new Range();
                $r5.this$0 = -86488649 * $i0;
                $r5.current = $r17;
                $r5.next = $r9;
                $r5.start = $r17.size[i];
                $r5.list = $r17.bytes[i] * 1506358657;
                $r5.length = 1191387965 * i;
                $i2 = ((i2 * i2) * ($r17.count * 1411017051)) * $r17.type[i];
                i2 = $i2;
                $r5.end = 1612928919 * (($i2 + 1024) >> 11);
                $r5.top = ($r17.state[i] & (short) 255) * 1571211521;
                $i2 = ((i << 8) - ($r17.data[i] & Short.MAX_VALUE)) * -1956818785;
                i2 = $i2;
                $r5.parent = $i2;
                $r5.first = 0;
                $r5.index = 0;
                $r5.key = 0;
                $r5.size = -501286241;
                $r5.count = 0;
                if (this.data[$i0] == 0) {
                    $r5.data = Address.equals($r9, toString($r5, 127504792), add($r5, (byte) 12), add($r5, (short) 6646));
                } else {
                    $r5.data = Address.equals($r9, toString($r5, 360640389), 0, add($r5, (short) 12136));
                    toString($r5, $r17.data[i] < (short) 0, 375903996);
                }
                if ($r17.data[i] < (short) 0) {
                    $r5.data.equals(-1);
                }
                if ($r5.list * -637203839 >= 0) {
                    Range $r15 = this.count[$i0][$r5.list * -637203839];
                    if ($r15 != null && $r15.size * -1027449183 < 0) {
                        this.head[$i0][$r15.length * 2078821397] = null;
                        $r15.size = 0;
                    }
                    this.count[$i0][$r5.list * -637203839] = $r5;
                }
                this.size.next.toString($r5);
                this.head[$i0][i] = $r5;
            }
        }
    }

    int onTouchEvent() {
        return -756547635 * this.offset;
    }

    protected synchronized int open() {
        return 0;
    }

    int open(int i) {
        try {
            return -756547635 * this.offset;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nx.ad(" + ')');
        }
    }

    int open(Range range) {
        int $i0 = this.log[range.this$0 * 1829364743];
        if ($i0 < 8192) {
            return (($i0 * (range.top * -752208127)) + 32) >> 6;
        }
        return FileInfo.INITIAL_MAX_FRAME_SIZE - ((((FileInfo.INITIAL_MAX_FRAME_SIZE - $i0) * (Constants.f93X - (range.top * -752208127))) + 32) >> 6);
    }

    void open(int i, int i2) {
        if (this.err[i] != i2) {
            this.err[i] = i2;
            for (i2 = 0; i2 < Constants.f93X; i2++) {
                this.count[i][i2] = null;
            }
        }
    }

    void open(int i, int i2, int i3) {
        try {
            this.state[i] = i2;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nx.au(" + ')');
        }
    }

    protected synchronized void parse(int i) {
        Metadata metadata = this;
        if (this.this$0.get()) {
            int $i1 = (metadata.this$0.name * (metadata.text * -763407581)) / (FileInfo.data * 1688035177);
            Metadata $r1;
            do {
                long $l3 = (((long) i) * ((long) $i1)) + (metadata.value * 7801888413140150363L);
                if ((metadata.name * -4495405376033779737L) - $l3 >= 0) {
                    metadata.value = 4870572680668153811L * $l3;
                    break;
                }
                int $i2 = (int) (((((long) $i1) + ((metadata.name * -4495405376033779737L) - (metadata.value * 7801888413140150363L))) - 1) / ((long) $i1));
                metadata.value += (((long) $i2) * ((long) $i1)) * 4870572680668153811L;
                metadata.size.get($i2);
                i -= $i2;
                metadata.read(-1668316417);
                $r1 = metadata;
                metadata = $r1;
            } while ($r1.this$0.get());
        }
        metadata.size.get(i);
    }

    protected synchronized void process(int i) {
        Metadata metadata = this;
        if (this.this$0.get()) {
            int $i1 = (metadata.this$0.name * (metadata.text * -763407581)) / (FileInfo.data * 431748697);
            Metadata $r1;
            do {
                long $l3 = (((long) i) * ((long) $i1)) + (metadata.value * 7801888413140150363L);
                if ((metadata.name * -4495405376033779737L) - $l3 >= 0) {
                    metadata.value = 4870572680668153811L * $l3;
                    break;
                }
                int $i2 = (int) (((((long) $i1) + ((metadata.name * -4495405376033779737L) - (metadata.value * 7801888413140150363L))) - 1) / ((long) $i1));
                metadata.value += (((long) $i2) * ((long) $i1)) * 4870572680668153811L;
                metadata.size.get($i2);
                i -= $i2;
                metadata.read(-1668316417);
                $r1 = metadata;
                metadata = $r1;
            } while ($r1.this$0.get());
        }
        metadata.size.get(i);
    }

    boolean put(Range range) {
        if (range.data != null) {
            return false;
        }
        if (-1027449183 * range.size >= 0) {
            range.iterator();
            if (range.list * -637203839 > 0 && this.count[range.this$0 * 1829364743][range.list * -637203839] == range) {
                this.count[range.this$0 * 1829364743][range.list * -637203839] = null;
            }
        }
        return true;
    }

    void putChar(int i, int i2, int i3) {
    }

    public synchronized boolean putString() {
        return this.this$0.get();
    }

    void read() {
        int $i0 = 443178827 * this.pos;
        int $i1 = -47567629 * this.line;
        long $l2 = -4495405376033779737L * this.name;
        while (this.line * -47567629 == $i1) {
            while ($i1 == this.this$0.data[$i0]) {
                this.this$0.put($i0);
                int $i3 = this.this$0.get($i0);
                if (1 == $i3) {
                    this.this$0.start();
                    this.this$0.log($i0);
                    if (!this.this$0.isEmpty()) {
                        continue;
                    } else if (!this.index || $i1 == 0) {
                        initialize(1324362848);
                        this.this$0.clear();
                        return;
                    } else {
                        this.this$0.read($l2);
                    }
                    $i1 = this.this$0.decode();
                    $i0 = $i1;
                    $i1 = this.this$0.data[$i1];
                    $l2 = this.this$0.isEmpty($i1);
                } else {
                    if (($i3 & Constants.f93X) != 0) {
                        init($i3, -940270447);
                    }
                    this.this$0.set($i0);
                    this.this$0.log($i0);
                }
            }
            $i1 = this.this$0.decode();
            $i0 = $i1;
            $i1 = this.this$0.data[$i1];
            $l2 = this.this$0.isEmpty($i1);
        }
        this.pos = $i0 * 938586723;
        this.line = $i1 * 1653319579;
        this.name = $l2 * -2801257523919219753L;
    }

    void read(int i) {
        try {
            i = 443178827 * this.pos;
            int $i1 = -47567629 * this.line;
            long $l2 = -4495405376033779737L * this.name;
            while (this.line * -47567629 == $i1) {
                while ($i1 == this.this$0.data[i]) {
                    this.this$0.put(i);
                    int $i3 = this.this$0.get(i);
                    if (1 == $i3) {
                        this.this$0.start();
                        this.this$0.log(i);
                        if (this.this$0.isEmpty()) {
                            if (!this.index || $i1 == 0) {
                                initialize(1324362848);
                                this.this$0.clear();
                                return;
                            }
                            this.this$0.read($l2);
                        }
                    } else {
                        if (($i3 & Constants.f93X) != 0) {
                            init($i3, 895922116);
                        }
                        this.this$0.set(i);
                        this.this$0.log(i);
                    }
                }
                $i1 = this.this$0.decode();
                i = $i1;
                $i1 = this.this$0.data[$i1];
                $l2 = this.this$0.isEmpty($i1);
            }
            int $i0 = i * 938586723;
            i = $i0;
            this.pos = $i0;
            this.line = $i1 * -1405957061;
            this.name = $l2 * -2801257523919219753L;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "nx.bj(" + ')');
        }
    }

    public synchronized void read(Base64 base64, boolean z) {
        write(-1499500616);
        this.this$0.read(base64.context);
        this.index = z;
        this.value = 0;
        int $i0 = this.this$0.set();
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            this.this$0.put($i1);
            this.this$0.set($i1);
            this.this$0.log($i1);
        }
        this.pos = this.this$0.decode() * 938586723;
        this.line = -1032367509 * this.this$0.data[this.pos * -640958034];
        this.name = this.this$0.isEmpty(this.line * -1838492803) * -2801257523919219753L;
    }

    public synchronized void read(Base64 base64, boolean z, int i) {
        try {
            write(-1086481980);
            this.this$0.read(base64.context);
            this.index = z;
            this.value = 0;
            i = this.this$0.set();
            for (int $i1 = 0; $i1 < i; $i1++) {
                this.this$0.put($i1);
                this.this$0.set($i1);
                this.this$0.log($i1);
            }
            int $i0 = this.this$0.decode() * 938586723;
            i = $i0;
            this.pos = $i0;
            this.line = -1405957061 * this.this$0.data[this.pos * 443178827];
            $i0 = this.line * -47567629;
            i = $i0;
            this.name = this.this$0.isEmpty($i0) * -2801257523919219753L;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "nx.ae(" + ')');
        }
    }

    public synchronized boolean read(Base64 base64, Class classR, GifDecoder gifDecoder, int i) {
        boolean $z0 = true;
        synchronized (this) {
            base64.decode();
            int[] $r4 = i > 0 ? new int[]{i} : null;
            ReflectiveTypeAdapterFactory$BoundField $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.next();
            while ($r7 != null) {
                i = (int) $r7.size;
                GifDrawable $r8 = (GifDrawable) this.next.get((long) i);
                if ($r8 == null) {
                    byte[] $r9 = classR.add(i, (byte) 54);
                    $r8 = $r9 == null ? null : new GifDrawable($r9);
                    if ($r8 == null) {
                        $z0 = false;
                        $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.get();
                    } else {
                        this.next.get($r8, (long) i);
                    }
                }
                if (!$r8.decode(gifDecoder, $r7.name, $r4, -1553674479)) {
                    $z0 = false;
                }
                $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.get();
            }
            if ($z0) {
                base64.reset();
            }
        }
        return $z0;
    }

    public synchronized void recycle() {
        GifDrawable $r3 = (GifDrawable) this.next.next();
        while ($r3 != null) {
            $r3.get(-143206778);
            $r3 = (GifDrawable) this.next.get();
        }
    }

    protected synchronized Entry remove() {
        return this.size;
    }

    void remove(int i) {
        if ((this.type[i] & 2) != 0) {
            Range $r5 = (Range) this.size.next.get();
            while ($r5 != null) {
                if (i == 1829364743 * $r5.this$0 && this.head[i][$r5.length * 701758830] == null && $r5.size * -1027449183 < 0) {
                    $r5.size = 0;
                }
                $r5 = (Range) this.size.next.next();
            }
        }
    }

    public synchronized void restoreState() {
        GifDrawable $r3 = (GifDrawable) this.next.next();
        while ($r3 != null) {
            $r3.get(-1438174673);
            $r3 = (GifDrawable) this.next.get();
        }
    }

    void run() {
        int $i0 = -621587610 * this.pos;
        int $i1 = 71793344 * this.line;
        long $l2 = -4495405376033779737L * this.name;
        while (-21818419 * this.line == $i1) {
            while ($i1 == this.this$0.data[$i0]) {
                this.this$0.put($i0);
                int $i3 = this.this$0.get($i0);
                if (1 == $i3) {
                    this.this$0.start();
                    this.this$0.log($i0);
                    if (!this.this$0.isEmpty()) {
                        continue;
                    } else if (!this.index || $i1 == 0) {
                        initialize(1324362848);
                        this.this$0.clear();
                        return;
                    } else {
                        this.this$0.read($l2);
                    }
                    $i1 = this.this$0.decode();
                    $i0 = $i1;
                    $i1 = this.this$0.data[$i1];
                    $l2 = this.this$0.isEmpty($i1);
                } else {
                    if ((245339021 & $i3) != 0) {
                        init($i3, 1016284080);
                    }
                    this.this$0.set($i0);
                    this.this$0.log($i0);
                }
            }
            $i1 = this.this$0.decode();
            $i0 = $i1;
            $i1 = this.this$0.data[$i1];
            $l2 = this.this$0.isEmpty($i1);
        }
        this.pos = $i0 * 938586723;
        this.line = $i1 * -1423965355;
        this.name = $l2 * -2801257523919219753L;
    }

    protected synchronized void run(int i) {
        Metadata metadata = this;
        if (this.this$0.get()) {
            int $i1 = (metadata.this$0.name * (metadata.text * -763407581)) / (FileInfo.data * 1688035177);
            Metadata $r1;
            do {
                long $l3 = (((long) i) * ((long) $i1)) + (metadata.value * 7801888413140150363L);
                if ((metadata.name * -4495405376033779737L) - $l3 >= 0) {
                    metadata.value = 4870572680668153811L * $l3;
                    break;
                }
                int $i2 = (int) (((((long) $i1) + ((metadata.name * -4495405376033779737L) - (metadata.value * 7801888413140150363L))) - 1) / ((long) $i1));
                metadata.value += (((long) $i2) * ((long) $i1)) * 4870572680668153811L;
                metadata.size.get($i2);
                i -= $i2;
                metadata.read(-1668316417);
                $r1 = metadata;
                metadata = $r1;
            } while ($r1.this$0.get());
        }
        metadata.size.get(i);
    }

    protected synchronized void run(int[] iArr, int i, int i2) {
        if (this.this$0.get()) {
            int $i2 = ((-763407581 * this.text) * this.this$0.name) / (1688035177 * FileInfo.data);
            do {
                long $l4 = (((long) i2) * ((long) $i2)) + (7801888413140150363L * this.value);
                if ((-4495405376033779737L * this.name) - $l4 >= 0) {
                    this.value = 4870572680668153811L * $l4;
                    break;
                }
                long $l7 = this.value * 7801888413140150363L;
                long j = $l7;
                int $i3 = (int) (((((long) $i2) + ((-4495405376033779737L * this.name) - $l7)) - 1) / ((long) $i2));
                $l7 = (long) $i3;
                this.value += 4870572680668153811L * (((long) $i2) * $l7);
                this.size.toString(iArr, i, $i3);
                i += $i3;
                i2 -= $i3;
                read(-1668316417);
            } while (this.this$0.get());
        }
        this.size.toString(iArr, i, i2);
    }

    void set(int i) {
        if ((this.type[i] & 2) != 0) {
            Range $r5 = (Range) this.size.next.get();
            while ($r5 != null) {
                if (i == 1829364743 * $r5.this$0 && this.head[i][$r5.length * -883760182] == null && $r5.size * -1027449183 < 0) {
                    $r5.size = 0;
                }
                $r5 = (Range) this.size.next.next();
            }
        }
    }

    void set(int $i0, int i, int i2) {
        Range $r5;
        toString($i0, i, 64, (short) 6284);
        if ((this.type[$i0] & 2) != 0) {
            $r5 = (Range) this.size.next.append();
            while ($r5 != null) {
                if ($r5.this$0 * 1829364743 != $i0 || $r5.size * -1027449183 >= 0) {
                    $r5 = (Range) this.size.next.getValue();
                } else {
                    this.head[$i0][$r5.length * 2078821397] = null;
                    this.head[$i0][i] = $r5;
                    $i0 = ((($r5.buffer * 1362240119) * ($r5.name * 1535161885)) >> 12) + (-605041825 * $r5.parent);
                    int $i2 = $r5.parent + (((i - ($r5.length * 2078821397)) << 8) * -1956818785);
                    i2 = $i2;
                    $r5.parent = $i2;
                    $i2 = ($i0 - ($r5.parent * -605041825)) * -1070704825;
                    $i0 = $i2;
                    $r5.buffer = $i2;
                    $r5.name = 465784832;
                    $r5.length = 1191387965 * i;
                    return;
                }
            }
        }
        GifDrawable $r15 = (GifDrawable) this.next.get((long) this.err[$i0]);
        if ($r15 != null) {
            User $r17 = $r15.header[i];
            if ($r17 != null) {
                $i2 = new Range();
                $i2.this$0 = -86488649 * $i0;
                $i2.current = $r15;
                $i2.next = $r17;
                $i2.start = $r15.size[i];
                $i2.list = $r15.bytes[i] * 1506358657;
                $i2.length = 1191387965 * i;
                $i2 = ((i2 * i2) * ($r15.count * 1411017051)) * $r15.type[i];
                i2 = $i2;
                $i2.end = 1612928919 * (($i2 + 1024) >> 11);
                $i2.top = ($r15.state[i] & (short) 255) * 1571211521;
                $i2 = ((i << 8) - ($r15.data[i] & Short.MAX_VALUE)) * -1956818785;
                i2 = $i2;
                $i2.parent = $i2;
                $i2.first = 0;
                $i2.index = 0;
                $i2.key = 0;
                $i2.size = -501286241;
                $i2.count = 0;
                if (this.data[$i0] == 0) {
                    $i2.data = Address.equals($r17, toString((Range) $i2, -1292281321), add((Range) $i2, (byte) 6), add((Range) $i2, (short) 27194));
                } else {
                    $i2.data = Address.equals($r17, toString((Range) $i2, -1901909967), 0, add((Range) $i2, (short) 15723));
                    toString((Range) $i2, $r15.data[i] < (short) 0, 1819740142);
                }
                if ($r15.data[i] < (short) 0) {
                    $i2.data.equals(-1);
                }
                if ($i2.list * -637203839 >= 0) {
                    $r5 = this.count[$i0][$i2.list * -637203839];
                    if ($r5 != null && $r5.size * -1027449183 < 0) {
                        this.head[$i0][$r5.length * 2078821397] = null;
                        $r5.size = 0;
                    }
                    this.count[$i0][$i2.list * -637203839] = $i2;
                }
                this.size.next.toString($i2);
                this.head[$i0][i] = $i2;
            }
        }
    }

    void set(Range range, boolean z) {
        int $i1;
        int $i0 = range.next.data.length;
        if (z && range.next.token) {
            $i1 = (int) ((((long) this.data[range.this$0 * 1829364743]) * ((long) (($i0 + $i0) - range.next.name))) >> 6);
            $i0 <<= 8;
            if ($i1 >= $i0) {
                $i1 = (($i0 + $i0) - 1) - $i1;
                range.data.toString(true);
            }
        } else {
            $i1 = (int) ((((long) $i0) * ((long) this.data[range.this$0 * 1829364743])) >> 6);
        }
        range.data.write($i1);
    }

    boolean set(Range range) {
        if (range.data != null) {
            return false;
        }
        if (-1027449183 * range.size >= 0) {
            range.iterator();
            if (range.list * -637203839 > 0 && this.count[range.this$0 * -844260763][range.list * -637203839] == range) {
                this.count[-1480582926 * range.this$0][range.list * -294483633] = null;
            }
        }
        return true;
    }

    public synchronized void setStyle(int $i0) {
        this.offset = 475858181 * $i0;
    }

    void setStyle(int i, int i2) {
    }

    void setText(int i, int i2) {
    }

    void setText(int i, int i2, int i3) {
    }

    protected synchronized Entry size() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nx.ay(" + ')');
        }
        return this.size;
    }

    protected synchronized Entry toArray() {
        return null;
    }

    void toArray(int i) {
        Range $r4 = (Range) this.size.next.get();
        while ($r4 != null) {
            if ((i < 0 || i == 727179616 * $r4.this$0) && $r4.size * -1027449183 < 0) {
                this.head[$r4.this$0 * 1829364743][$r4.length * 2078821397] = null;
                $r4.size = 0;
            }
            $r4 = (Range) this.size.next.next();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void toArray(int r18, int r19) {
        /*
        r17 = this;
        r0 = r17;
        r2 = r0.size;	 Catch:{ RuntimeException -> 0x0065 }
        r3 = r2.next;	 Catch:{ RuntimeException -> 0x0065 }
        r4 = r3.get();	 Catch:{ RuntimeException -> 0x0065 }
        r6 = r4;
        r6 = (p000.Range) r6;	 Catch:{ RuntimeException -> 0x0065 }
        r5 = r6;
    L_0x000e:
        if (r5 == 0) goto L_0x0080;
    L_0x0010:
        if (r18 < 0) goto L_0x0024;
    L_0x0012:
        r0 = r5.this$0;	 Catch:{ RuntimeException -> 0x0065 }
        r19 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r0 = r19;
        r0 = r0 * r7;
        r19 = r0;
        r0 = r18;
        r1 = r19;
        if (r0 != r1) goto L_0x0056;
    L_0x0024:
        r0 = r5.size;	 Catch:{ RuntimeException -> 0x0065 }
        r19 = r0;
        r7 = -1027449183; // 0xffffffffc2c25ea1 float:-97.18482 double:NaN;
        r0 = r19;
        r0 = r0 * r7;
        r19 = r0;
        if (r19 >= 0) goto L_0x0056;
    L_0x0032:
        r0 = r17;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r5.this$0;	 Catch:{ RuntimeException -> 0x0065 }
        r19 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r0 = r19;
        r0 = r0 * r7;
        r19 = r0;
        r9 = r8[r19];	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r5.length;	 Catch:{ RuntimeException -> 0x0065 }
        r19 = r0;
        r7 = 2078821397; // 0x7be84c15 float:2.412312E36 double:1.027074236E-314;
        r0 = r19;
        r0 = r0 * r7;
        r19 = r0;
        r10 = 0;
        r9[r19] = r10;	 Catch:{ RuntimeException -> 0x0065 }
        r7 = 0;
        r5.size = r7;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0056:
        r0 = r17;
        r2 = r0.size;	 Catch:{ RuntimeException -> 0x0065 }
        r3 = r2.next;	 Catch:{ RuntimeException -> 0x0065 }
        r4 = r3.next();	 Catch:{ RuntimeException -> 0x0065 }
        r11 = r4;
        r11 = (p000.Range) r11;	 Catch:{ RuntimeException -> 0x0065 }
        r5 = r11;
        goto L_0x000e;
    L_0x0065:
        r12 = move-exception;
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r14 = "nx.bx(";
        r13 = r13.append(r14);
        r7 = 41;
        r13 = r13.append(r7);
        r15 = r13.toString();
        r16 = p000.StringBuilder.append(r12, r15);
        throw r16;
    L_0x0080:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Window.toArray(int, int):void");
    }

    int toString(Range range) {
        int $i2;
        int $i1;
        Chunk $r2 = range.start;
        int $i0 = ((this.content[1829364743 * range.this$0] * this.parent[range.this$0 * 1829364743]) + ScrollingTextView.MP3_MAX_INPUT_SIZE) >> 13;
        $i0 = (((((((($i0 * $i0) + FileInfo.INITIAL_MAX_FRAME_SIZE) >> 15) * (163878951 * range.end)) + FileInfo.INITIAL_MAX_FRAME_SIZE) >> 15) * (-756547635 * this.offset)) + Constants.f93X) >> 8;
        if (400360881 * $r2.position > 0) {
            $i0 = (int) ((((double) $i0) * Math.pow(0.5d, ((double) (400360881 * $r2.position)) * (1.953125E-5d * ((double) (range.first * 319449007))))) + 0.5d);
        }
        if ($r2.value != null) {
            $i2 = -1794749667 * range.index;
            $i1 = $r2.value[(range.key * -748037821) + 1];
            if (range.key * -748037821 < $r2.value.length - 2) {
                int $i3 = ($r2.value[-748037821 * range.key] & (short) 255) << 8;
                $i2 -= $i3;
                int i = ($i2 * ($r2.value[(-748037821 * range.key) + 3] - $i1)) / ((($r2.value[(-748037821 * range.key) + 2] & (short) 255) << 8) - $i3);
                $i2 = i;
                $i1 += i;
            }
            $i0 = (($i0 * $i1) + 32) >> 6;
        }
        if (range.size * -1027449183 <= 0 || $r2.type == null) {
            return $i0;
        }
        $i2 = range.size * -1027449183;
        $i1 = $r2.type[(range.count * 1728080337) + 1];
        if (1728080337 * range.count < $r2.type.length - 2) {
            $i3 = ($r2.type[range.count * 1728080337] & (short) 255) << 8;
            i = (($r2.type[(range.count * 1728080337) + 3] - $i1) * ($i2 - $i3)) / ((($r2.type[(1728080337 * range.count) + 2] & (short) 255) << 8) - $i3);
            $i2 = i;
            $i1 += i;
        }
        return (($i0 * $i1) + 32) >> 6;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int toString(p000.Range r20, int r21) {
        /*
        r19 = this;
        r0 = r20;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x00f7 }
        r21 = r0;
        r1 = -605041825; // 0xffffffffdbefcb5f float:-1.34992257E17 double:NaN;
        r0 = r21;
        r0 = r0 * r1;
        r21 = r0;
        r0 = r20;
        r2 = r0.name;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1535161885; // 0x5b80b61d float:7.2458065E16 double:7.58470748E-315;
        r2 = r2 * r1;
        r0 = r20;
        r3 = r0.buffer;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1362240119; // 0x51322277 float:4.781765E10 double:6.73036044E-315;
        r3 = r3 * r1;
        r2 = r2 * r3;
        r2 = r2 >> 12;
        r0 = r21;
        r0 = r0 + r2;
        r21 = r0;
        r0 = r19;
        r4 = r0.state;	 Catch:{ RuntimeException -> 0x00f7 }
        r0 = r20;
        r2 = r0.this$0;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r2 = r2 * r1;
        r2 = r4[r2];	 Catch:{ RuntimeException -> 0x00f7 }
        r2 = r2 + -8192;
        r0 = r19;
        r4 = r0.header;	 Catch:{ RuntimeException -> 0x00f7 }
        r0 = r20;
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r3 = r3 * r1;
        r3 = r4[r3];	 Catch:{ RuntimeException -> 0x00f7 }
        r2 = r2 * r3;
        r2 = r2 >> 12;
        r21 = r2 + r21;
        r0 = r20;
        r5 = r0.start;	 Catch:{ RuntimeException -> 0x00f7 }
        r2 = r5.content;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1468830057; // 0x578c9169 float:3.0911232E14 double:7.256984707E-315;
        r2 = r1 * r2;
        if (r2 <= 0) goto L_0x0116;
    L_0x0056:
        r2 = r5.length;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1204278251; // 0x47c7d3eb float:102311.836 double:5.94992512E-315;
        r2 = r2 * r1;
        if (r2 > 0) goto L_0x006e;
    L_0x005e:
        r0 = r19;
        r4 = r0.input;	 Catch:{ RuntimeException -> 0x00f7 }
        r0 = r20;
        r2 = r0.this$0;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r2 = r2 * r1;
        r2 = r4[r2];	 Catch:{ RuntimeException -> 0x00f7 }
        if (r2 <= 0) goto L_0x0116;
    L_0x006e:
        r2 = r5.length;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1204278251; // 0x47c7d3eb float:102311.836 double:5.94992512E-315;
        r2 = r2 * r1;
        r2 = r2 << 2;
        r3 = r5.id;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = -644234183; // 0xffffffffd999c439 float:-5.4101776E15 double:NaN;
        r3 = r3 * r1;
        r3 = r3 << 1;
        r0 = r20;
        r6 = r0.group;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 407899123; // 0x18500bf3 float:2.6889403E-24 double:2.015289436E-315;
        r6 = r6 * r1;
        if (r6 >= r3) goto L_0x0092;
    L_0x0088:
        r0 = r20;
        r6 = r0.group;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 407899123; // 0x18500bf3 float:2.6889403E-24 double:2.015289436E-315;
        r6 = r6 * r1;
        r2 = r2 * r6;
        r2 = r2 / r3;
    L_0x0092:
        r0 = r19;
        r4 = r0.input;	 Catch:{ RuntimeException -> 0x00f7 }
        r0 = r20;
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r3 = r3 * r1;
        r3 = r4[r3];	 Catch:{ RuntimeException -> 0x00f7 }
        r3 = r3 >> 7;
        r2 = r2 + r3;
        r0 = r20;
        r3 = r0.status;	 Catch:{ RuntimeException -> 0x00f7 }
        r1 = -1126480989; // 0xffffffffbcdb43a3 float:-0.02676565 double:NaN;
        r3 = r1 * r3;
        r3 = r3 & 511;
        r7 = (double) r3;
        r9 = 4578227859533081880; // 0x3f8921fb54442d18 float:3.37028055E12 double:0.01227184630308513;
        r7 = r9 * r7;
        r7 = java.lang.Math.sin(r7);	 Catch:{ RuntimeException -> 0x00f7 }
        r11 = (double) r2;
        r7 = r7 * r11;
        r2 = (int) r7;
        r21 = r2 + r21;
    L_0x00bf:
        r0 = r20;
        r13 = r0.next;	 Catch:{ RuntimeException -> 0x00f7 }
        r2 = r13.type;	 Catch:{ RuntimeException -> 0x00f7 }
        r2 = r2 * 256;
        r7 = (double) r2;
        r0 = r21;
        r11 = (double) r0;
        r9 = 4554640423147361621; // 0x3f35555555555555 float:1.46601547E13 double:3.255208333333333E-4;
        r11 = r11 * r9;
        r9 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r11 = java.lang.Math.pow(r9, r11);	 Catch:{ RuntimeException -> 0x00f7 }
        r7 = r7 * r11;
        r21 = p000.FileInfo.data;
        r1 = 1688035177; // 0x649d5f69 float:2.322411E22 double:8.3400019E-315;
        r0 = r21;
        r0 = r0 * r1;
        r21 = r0;
        r11 = (double) r0;
        r7 = r7 / r11;
        r9 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r7 = r7 + r9;
        r0 = (int) r7;
        r21 = r0;
        r1 = 1;
        r0 = r21;
        if (r0 >= r1) goto L_0x0117;
    L_0x00f5:
        r1 = 1;
        return r1;
    L_0x00f7:
        r14 = move-exception;
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r16 = "nx.bs(";
        r0 = r16;
        r15 = r15.append(r0);
        r1 = 41;
        r15 = r15.append(r1);
        r17 = r15.toString();
        r0 = r17;
        r18 = p000.StringBuilder.append(r14, r0);
        throw r18;
    L_0x0116:
        goto L_0x00bf;
    L_0x0117:
        return r21;
        */
        throw new UnsupportedOperationException("Method not decompiled: Window.toString(Range, int):int");
    }

    void toString(int i) {
        Range $r4 = (Range) this.size.next.get();
        while ($r4 != null) {
            if (i < 0 || i == $r4.this$0 * 1011006564) {
                if ($r4.data != null) {
                    $r4.data.toString((FileInfo.data * 1688035177) / 1437225381);
                    if ($r4.data.equals()) {
                        this.size.head.equals($r4.data);
                    }
                    $r4.next((byte) 2);
                }
                if ($r4.size * -1027449183 < 0) {
                    this.head[$r4.this$0 * 1760221594][96527626 * $r4.length] = null;
                }
                $r4.iterator();
            }
            $r4 = (Range) this.size.next.next();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void toString(int r21, int r22) {
        /*
        r20 = this;
        r0 = r20;
        r2 = r0.size;	 Catch:{ RuntimeException -> 0x0092 }
        r3 = r2.next;	 Catch:{ RuntimeException -> 0x0092 }
        r4 = r3.get();	 Catch:{ RuntimeException -> 0x0092 }
        r6 = r4;
        r6 = (p000.Range) r6;	 Catch:{ RuntimeException -> 0x0092 }
        r5 = r6;
    L_0x000e:
        if (r5 == 0) goto L_0x00b9;
    L_0x0010:
        if (r21 < 0) goto L_0x0024;
    L_0x0012:
        r0 = r5.this$0;	 Catch:{ RuntimeException -> 0x0092 }
        r22 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r0 = r22;
        r0 = r0 * r7;
        r22 = r0;
        r0 = r21;
        r1 = r22;
        if (r0 != r1) goto L_0x0081;
    L_0x0024:
        r8 = r5.data;	 Catch:{ RuntimeException -> 0x0092 }
        if (r8 == 0) goto L_0x0052;
    L_0x0028:
        r8 = r5.data;	 Catch:{ RuntimeException -> 0x0092 }
        r22 = p000.FileInfo.data;
        r7 = 1688035177; // 0x649d5f69 float:2.322411E22 double:8.3400019E-315;
        r0 = r22;
        r0 = r0 * r7;
        r22 = r0;
        r22 = r22 / 100;
        r0 = r22;
        r8.toString(r0);	 Catch:{ RuntimeException -> 0x0092 }
        r8 = r5.data;	 Catch:{ RuntimeException -> 0x0092 }
        r9 = r8.equals();	 Catch:{ RuntimeException -> 0x0092 }
        if (r9 == 0) goto L_0x004e;
    L_0x0043:
        r0 = r20;
        r2 = r0.size;	 Catch:{ RuntimeException -> 0x0092 }
        r10 = r2.head;	 Catch:{ RuntimeException -> 0x0092 }
        r8 = r5.data;	 Catch:{ RuntimeException -> 0x0092 }
        r10.equals(r8);	 Catch:{ RuntimeException -> 0x0092 }
    L_0x004e:
        r7 = 2;
        r5.next(r7);	 Catch:{ RuntimeException -> 0x0092 }
    L_0x0052:
        r0 = r5.size;	 Catch:{ RuntimeException -> 0x0092 }
        r22 = r0;
        r7 = -1027449183; // 0xffffffffc2c25ea1 float:-97.18482 double:NaN;
        r0 = r22;
        r0 = r0 * r7;
        r22 = r0;
        if (r22 >= 0) goto L_0x007e;
    L_0x0060:
        r0 = r20;
        r11 = r0.head;	 Catch:{ RuntimeException -> 0x0092 }
        r0 = r5.this$0;	 Catch:{ RuntimeException -> 0x0092 }
        r22 = r0;
        r7 = 1829364743; // 0x6d09e407 float:2.6671947E27 double:9.03826273E-315;
        r0 = r22;
        r0 = r0 * r7;
        r22 = r0;
        r12 = r11[r22];	 Catch:{ RuntimeException -> 0x0092 }
        r0 = r5.length;	 Catch:{ RuntimeException -> 0x0092 }
        r22 = r0;
        r7 = 2078821397; // 0x7be84c15 float:2.412312E36 double:1.027074236E-314;
        r22 = r7 * r22;
        r13 = 0;
        r12[r22] = r13;	 Catch:{ RuntimeException -> 0x0092 }
    L_0x007e:
        r5.iterator();	 Catch:{ RuntimeException -> 0x0092 }
    L_0x0081:
        r0 = r20;
        r2 = r0.size;	 Catch:{ RuntimeException -> 0x0092 }
        r3 = r2.next;	 Catch:{ RuntimeException -> 0x0092 }
        r4 = r3.next();	 Catch:{ RuntimeException -> 0x0092 }
        r14 = r4;
        r14 = (p000.Range) r14;	 Catch:{ RuntimeException -> 0x0092 }
        r5 = r14;
        goto L_0x000e;
    L_0x0092:
        r15 = move-exception;
        r16 = new java.lang.StringBuilder;
        r0 = r16;
        r0.<init>();
        r17 = "nx.bv(";
        r0 = r16;
        r1 = r17;
        r16 = r0.append(r1);
        r7 = 41;
        r0 = r16;
        r16 = r0.append(r7);
        r0 = r16;
        r18 = r0.toString();
        r0 = r18;
        r19 = p000.StringBuilder.append(r15, r0);
        throw r19;
    L_0x00b9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Window.toString(int, int):void");
    }

    void toString(int i, int i2, int i3) {
        Range $r1 = this.head[i][i2];
        if ($r1 != null) {
            this.head[i][i2] = null;
            if ((this.type[i] & 2) != 0) {
                Range $r8 = (Range) this.size.next.get();
                while ($r8 != null) {
                    if ($r8.this$0 * 1829364743 != $r1.this$0 * 1588609663 || $r8.size * 457782569 >= 0 || $r1 == $r8) {
                        $r8 = (Range) this.size.next.next();
                    } else {
                        $r1.size = 0;
                        return;
                    }
                }
            }
            $r1.size = 0;
        }
    }

    void toString(int i, int i2, int i3, short s) {
        try {
            Range $r3 = this.head[i][i2];
            if ($r3 != null) {
                this.head[i][i2] = null;
                if ((this.type[i] & 2) != 0) {
                    Range $r12 = (Range) this.size.next.get();
                    while ($r12 != null) {
                        if ($r12.this$0 * 1829364743 == $r3.this$0 * 1829364743) {
                            if ($r12.size * -1027449183 < 0 && $r3 != $r12) {
                                $r3.size = 0;
                                return;
                            }
                        }
                        $r12 = (Range) this.size.next.next();
                    }
                    return;
                }
                $r3.size = 0;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nx.ak(" + ')');
        }
    }

    void toString(Range range, boolean z) {
        int $i1;
        int $i0 = range.next.data.length;
        if (z && range.next.token) {
            $i1 = (int) ((((long) this.data[range.this$0 * 1829364743]) * ((long) (($i0 + $i0) - range.next.name))) >> 6);
            $i0 <<= 8;
            if ($i1 >= $i0) {
                $i1 = (($i0 + $i0) - 1) - $i1;
                range.data.toString(true);
            }
        } else {
            $i1 = (int) ((((long) $i0) * ((long) this.data[range.this$0 * 1829364743])) >> 6);
        }
        range.data.write($i1);
    }

    void toString(Range range, boolean z, int i) {
        try {
            int $i1;
            i = range.next.data.length;
            if (z) {
                if (range.next.token) {
                    $i1 = (int) ((((long) this.data[range.this$0 * 1829364743]) * ((long) ((i + i) - range.next.name))) >> 6);
                    i <<= 8;
                    if ($i1 >= i) {
                        $i1 = ((i + i) - 1) - $i1;
                        range.data.toString(true);
                    }
                    range.data.write($i1);
                }
            }
            $i1 = (int) ((((long) i) * ((long) this.data[range.this$0 * 1829364743])) >> 6);
            range.data.write($i1);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "nx.ah(" + ')');
        }
    }

    protected synchronized void toString(int[] r25, int r26, int r27) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0051 in list [B:59:0x00ea]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r24 = this;
        monitor-enter(r24);
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x00c1 }
        r4 = r3.get();	 Catch:{ RuntimeException -> 0x00c1 }
        if (r4 == 0) goto L_0x0051;	 Catch:{ RuntimeException -> 0x00c1 }
    L_0x000b:
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r5 = r0.text;	 Catch:{ RuntimeException -> 0x00c1 }
        r6 = -763407581; // 0xffffffffd27f5323 float:-2.74152866E11 double:NaN;	 Catch:{ RuntimeException -> 0x00c1 }
        r5 = r6 * r5;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x00c1 }
        r7 = r3.name;	 Catch:{ RuntimeException -> 0x00c1 }
        r5 = r5 * r7;	 Catch:{ RuntimeException -> 0x00c1 }
        r7 = p000.FileInfo.data;	 Catch:{ RuntimeException -> 0x00c1 }
        r6 = 1688035177; // 0x649d5f69 float:2.322411E22 double:8.3400019E-315;	 Catch:{ RuntimeException -> 0x00c1 }
        r7 = r6 * r7;	 Catch:{ RuntimeException -> 0x00c1 }
        r5 = r5 / r7;	 Catch:{ RuntimeException -> 0x00c1 }
    L_0x0023:
        r0 = r27;	 Catch:{ RuntimeException -> 0x00c1 }
        r8 = (long) r0;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = (long) r5;	 Catch:{ RuntimeException -> 0x00c1 }
        r8 = r8 * r10;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = r0.value;	 Catch:{ RuntimeException -> 0x00c1 }
        r12 = 7801888413140150363; // 0x6c45e02cf274685b float:-4.840992E30 double:3.6822105743432117E213;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = r12 * r10;	 Catch:{ RuntimeException -> 0x00c1 }
        r8 = r8 + r10;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = r0.name;	 Catch:{ RuntimeException -> 0x00c1 }
        r12 = -4495405376033779737; // 0xc19d1ca0d0200fe7 float:-1.07415869E10 double:-1.2210386003131066E8;
        r10 = r12 * r10;
        r10 = r10 - r8;
        r12 = 0;
        r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r14 < 0) goto L_0x0060;
    L_0x0046:
        r12 = 4870572680668153811; // 0x4397c00c33f287d3 float:1.12937094E-7 double:4.2784531891316038E17;
        r8 = r12 * r8;
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r0.value = r8;	 Catch:{ RuntimeException -> 0x00c1 }
    L_0x0051:
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r15 = r0.size;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r25;	 Catch:{ RuntimeException -> 0x00c1 }
        r1 = r26;	 Catch:{ RuntimeException -> 0x00c1 }
        r2 = r27;	 Catch:{ RuntimeException -> 0x00c1 }
        r15.toString(r0, r1, r2);	 Catch:{ RuntimeException -> 0x00c1 }
        monitor-exit(r24);
        return;
    L_0x0060:
        r8 = (long) r5;
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = r0.name;	 Catch:{ RuntimeException -> 0x00c1 }
        r12 = -4495405376033779737; // 0xc19d1ca0d0200fe7 float:-1.07415869E10 double:-1.2210386003131066E8;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = r12 * r10;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x00c1 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00c1 }
        r12 = 7801888413140150363; // 0x6c45e02cf274685b float:-4.840992E30 double:3.6822105743432117E213;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r16;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r0 * r12;	 Catch:{ RuntimeException -> 0x00c1 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = r10 - r0;	 Catch:{ RuntimeException -> 0x00c1 }
        r8 = r8 + r10;	 Catch:{ RuntimeException -> 0x00c1 }
        r12 = 1;	 Catch:{ RuntimeException -> 0x00c1 }
        r8 = r8 - r12;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = (long) r5;	 Catch:{ RuntimeException -> 0x00c1 }
        r8 = r8 / r10;	 Catch:{ RuntimeException -> 0x00c1 }
        r7 = (int) r8;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r8 = r0.value;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = (long) r5;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = (long) r7;	 Catch:{ RuntimeException -> 0x00c1 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = r10 * r0;	 Catch:{ RuntimeException -> 0x00c1 }
        r12 = 4870572680668153811; // 0x4397c00c33f287d3 float:1.12937094E-7 double:4.2784531891316038E17;	 Catch:{ RuntimeException -> 0x00c1 }
        r10 = r12 * r10;	 Catch:{ RuntimeException -> 0x00c1 }
        r8 = r8 + r10;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r0.value = r8;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r15 = r0.size;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r25;	 Catch:{ RuntimeException -> 0x00c1 }
        r1 = r26;	 Catch:{ RuntimeException -> 0x00c1 }
        r15.toString(r0, r1, r7);	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r26;
        r0 = r0 + r7;
        r26 = r0;
        r0 = r27;
        r0 = r0 - r7;
        r27 = r0;
        r6 = -1668316417; // 0xffffffff9c8f82ff float:-9.496808E-22 double:NaN;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r0.read(r6);	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x00c1 }
        r3 = r0.this$0;	 Catch:{ RuntimeException -> 0x00c1 }
        r4 = r3.get();	 Catch:{ RuntimeException -> 0x00c1 }
        if (r4 != 0) goto L_0x0023;
    L_0x00c0:
        goto L_0x0051;
    L_0x00c1:
        r18 = move-exception;
        r19 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r19;	 Catch:{ RuntimeException -> 0x00c1 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x00c1 }
        r20 = "nx.aj(";	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r19;	 Catch:{ RuntimeException -> 0x00c1 }
        r1 = r20;	 Catch:{ RuntimeException -> 0x00c1 }
        r19 = r0.append(r1);	 Catch:{ RuntimeException -> 0x00c1 }
        r6 = 41;	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r19;	 Catch:{ RuntimeException -> 0x00c1 }
        r19 = r0.append(r6);	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r19;	 Catch:{ RuntimeException -> 0x00c1 }
        r21 = r0.toString();	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r18;	 Catch:{ RuntimeException -> 0x00c1 }
        r1 = r21;	 Catch:{ RuntimeException -> 0x00c1 }
        r22 = p000.StringBuilder.append(r0, r1);	 Catch:{ RuntimeException -> 0x00c1 }
        throw r22;	 Catch:{ RuntimeException -> 0x00c1 }
    L_0x00ea:
        r23 = move-exception;
        monitor-exit(r24);
        throw r23;
        */
        throw new UnsupportedOperationException("Method not decompiled: Window.toString(int[], int, int):void");
    }

    boolean toString(Range range, int[] iArr, int i, int $i1) {
        range.value = 1463180851 * ((1688035177 * FileInfo.data) / 100);
        if (range.size * -1027449183 < 0 || !(range.data == null || range.data.copy())) {
            int $i2;
            long j;
            double $d1;
            long j2;
            int $i3 = range.name * 1535161885;
            if ($i3 > 0) {
                $i2 = (16.0d * Math.pow(2.0d, 4.921259842519685E-4d * ((double) this.length[range.this$0 * 1829364743]))) + 0.5d;
                j = $i2;
                $i2 = (int) $i2;
                $i3 -= $i2;
                if ($i3 < 0) {
                    $i3 = 0;
                }
                range.name = $i3 * -1803437003;
            }
            range.data.transform(toString(range, 1508464313));
            Chunk $r9 = range.start;
            boolean $z0 = false;
            range.group -= 2125953733;
            range.status += 1031440259 * $r9.content;
            $i2 = range.buffer * 1362240119;
            int i2 = $i2;
            double $d0 = 5.086263020833333E-6d * ((double) ((((range.name * 1535161885) * $i2) >> 12) + (((2078821397 * range.length) - 60) << 8)));
            if (400360881 * $r9.position > 0) {
                if ($r9.size * 335894261 > 0) {
                    $d1 = (double) (335894261 * $r9.size);
                    $i2 = (128.0d * Math.pow(2.0d, $d1 * $d0)) + 0.5d;
                    j2 = $i2;
                    $i2 = ((int) $i2) * -895135921;
                    i2 = $i2;
                    range.first += $i2;
                } else {
                    range.first += 1386719104;
                }
            }
            if ($r9.value != null) {
                if (376658281 * $r9.key > 0) {
                    $d1 = (double) (376658281 * $r9.key);
                    $i2 = (128.0d * Math.pow(2.0d, $d1 * $d0)) + 0.5d;
                    j2 = $i2;
                    $i2 = ((int) $i2) * 49205045;
                    i2 = $i2;
                    range.index += $i2;
                } else {
                    range.index += 2003278464;
                }
                while (range.key * -748037821 < $r9.value.length - 2 && range.index * -1794749667 > (($r9.value[(-748037821 * range.key) + 2] & (short) 255) << 8)) {
                    range.key -= 211093802;
                }
                $i2 = range.key * -748037821;
                i2 = $i2;
                if ($r9.value.length - 2 == $i2 && $r9.value[(-748037821 * range.key) + 1] == (byte) 0) {
                    $z0 = true;
                }
            }
            if (-1027449183 * range.size >= 0 && $r9.type != null && (this.type[1829364743 * range.this$0] & 1) == 0 && (-637203839 * range.list < 0 || this.count[1829364743 * range.this$0][-637203839 * range.list] != range)) {
                if (-89683889 * $r9.pos > 0) {
                    $i2 = (Math.pow(2.0d, $d0 * ((double) (-89683889 * $r9.pos))) * 128.0d) + 0.5d;
                    j = $i2;
                    range.size = (((int) $i2) * 501286241) + range.size;
                } else {
                    range.size -= 259870592;
                }
                while (range.count * 1728080337 < $r9.type.length - 2 && range.size * -1027449183 > (($r9.type[(range.count * 1728080337) + 2] & (short) 255) << 8)) {
                    range.count -= 1449058718;
                }
                $i2 = range.count * 1728080337;
                i2 = $i2;
                if ($r9.type.length - 2 == $i2) {
                    $z0 = true;
                }
            }
            if ($z0) {
                range.data.toString(400280827 * range.value);
                if (iArr != null) {
                    range.data.toString(iArr, i, $i1);
                } else {
                    range.data.get($i1);
                }
                if (range.data.equals()) {
                    Entry $r11 = this.size;
                    Entry $r10 = $r11;
                    $r11.head.equals(range.data);
                }
                range.next((byte) 2);
                if (-1027449183 * range.size >= 0) {
                    range.iterator();
                    if (-637203839 * range.list > 0 && this.count[1829364743 * range.this$0][-637203839 * range.list] == range) {
                        this.count[range.this$0 * 1829364743][range.list * -637203839] = null;
                    }
                }
                return true;
            }
            range.data.set(range.value * 400280827, add(range, (byte) 12), add(range, (short) 4488));
            return false;
        }
        range.next((byte) 2);
        range.iterator();
        if (range.list * -637203839 > 0 && range == this.count[1829364743 * range.this$0][-637203839 * range.list]) {
            this.count[range.this$0 * 1829364743][range.list * -637203839] = null;
        }
        return true;
    }

    public synchronized void transform() {
        GifDrawable $r3 = (GifDrawable) this.next.next();
        while ($r3 != null) {
            $r3.get(458497612);
            $r3 = (GifDrawable) this.next.get();
        }
    }

    synchronized void transform(int i) {
        try {
            GifDrawable $r3 = (GifDrawable) this.next.next();
            while ($r3 != null) {
                $r3.iterator();
                $r3 = (GifDrawable) this.next.get();
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nx.ag(" + ')');
        }
    }

    void transform(int i, int i2) {
        this.state[i] = i2;
    }

    void transform(int i, int i2, int i3) {
        try {
            this.children[i] = i2;
            this.key[i] = i2 & -128;
            clear(i, i2, -324701229);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nx.aw(" + ')');
        }
    }

    public synchronized void write(int i) {
        try {
            this.this$0.clear();
            initialize(1324362848);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nx.am(" + ')');
        }
    }

    public synchronized void write(int $i0, int i) {
        try {
            this.offset = 475858181 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nx.af(" + ')');
        }
    }

    public synchronized boolean write(Base64 base64, Class classR, GifDecoder gifDecoder, int i) {
        boolean $z0 = true;
        synchronized (this) {
            base64.decode();
            int[] $r4 = i > 0 ? new int[]{i} : null;
            ReflectiveTypeAdapterFactory$BoundField $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.next();
            while ($r7 != null) {
                i = (int) $r7.size;
                GifDrawable $r8 = (GifDrawable) this.next.get((long) i);
                if ($r8 == null) {
                    byte[] $r9 = classR.add(i, (byte) 115);
                    $r8 = $r9 == null ? null : new GifDrawable($r9);
                    if ($r8 == null) {
                        $z0 = false;
                        $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.get();
                    } else {
                        this.next.get($r8, (long) i);
                    }
                }
                if (!$r8.decode(gifDecoder, $r7.name, $r4, -556895772)) {
                    $z0 = false;
                }
                $r7 = (ReflectiveTypeAdapterFactory$BoundField) base64.buffer.get();
            }
            if ($z0) {
                base64.reset();
            }
        }
        return $z0;
    }

    public synchronized boolean write(p000.Base64 r23, p000.Class r24, p000.GifDecoder r25, int r26, int r27) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x00a6 in list [B:46:0x008a]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r22 = this;
        r2 = 1;
        monitor-enter(r22);
        r0 = r23;	 Catch:{ RuntimeException -> 0x0063 }
        r0.decode();	 Catch:{ RuntimeException -> 0x0063 }
        if (r26 <= 0) goto L_0x00a6;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x0009:
        r4 = 1;	 Catch:{ RuntimeException -> 0x0063 }
        r3 = new int[r4];	 Catch:{ RuntimeException -> 0x0063 }
        r4 = 0;	 Catch:{ RuntimeException -> 0x0063 }
        r3[r4] = r26;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x000f:
        r0 = r23;	 Catch:{ RuntimeException -> 0x0063 }
        r5 = r0.buffer;	 Catch:{ RuntimeException -> 0x0063 }
        r6 = r5.next();	 Catch:{ RuntimeException -> 0x0063 }
        r8 = r6;	 Catch:{ RuntimeException -> 0x0063 }
        r8 = (p000.ReflectiveTypeAdapterFactory$BoundField) r8;	 Catch:{ RuntimeException -> 0x0063 }
        r7 = r8;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x001b:
        if (r7 == 0) goto L_0x0054;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x001d:
        r9 = r7.size;	 Catch:{ RuntimeException -> 0x0063 }
        r0 = (int) r9;	 Catch:{ RuntimeException -> 0x0063 }
        r26 = r0;	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r22;	 Catch:{ RuntimeException -> 0x0063 }
        r5 = r0.next;	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r26;	 Catch:{ RuntimeException -> 0x0063 }
        r9 = (long) r0;	 Catch:{ RuntimeException -> 0x0063 }
        r6 = r5.get(r9);	 Catch:{ RuntimeException -> 0x0063 }
        r12 = r6;	 Catch:{ RuntimeException -> 0x0063 }
        r12 = (p000.GifDrawable) r12;	 Catch:{ RuntimeException -> 0x0063 }
        r11 = r12;	 Catch:{ RuntimeException -> 0x0063 }
        if (r11 != 0) goto L_0x0097;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x0035:
        r4 = 124; // 0x7c float:1.74E-43 double:6.13E-322;	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r24;	 Catch:{ RuntimeException -> 0x0063 }
        r1 = r26;	 Catch:{ RuntimeException -> 0x0063 }
        r13 = r0.add(r1, r4);	 Catch:{ RuntimeException -> 0x0063 }
        if (r13 != 0) goto L_0x005d;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x0041:
        r11 = 0;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x0042:
        if (r11 != 0) goto L_0x008d;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x0044:
        r2 = 0;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x0045:
        r0 = r23;	 Catch:{ RuntimeException -> 0x0063 }
        r5 = r0.buffer;	 Catch:{ RuntimeException -> 0x0063 }
        r6 = r5.get();	 Catch:{ RuntimeException -> 0x0063 }
        r14 = r6;	 Catch:{ RuntimeException -> 0x0063 }
        r14 = (p000.ReflectiveTypeAdapterFactory$BoundField) r14;	 Catch:{ RuntimeException -> 0x0063 }
        r7 = r14;	 Catch:{ RuntimeException -> 0x0063 }
        goto L_0x001b;
    L_0x0054:
        if (r2 == 0) goto L_0x005b;
    L_0x0056:
        r0 = r23;	 Catch:{ RuntimeException -> 0x0063 }
        r0.reset();	 Catch:{ RuntimeException -> 0x0063 }
    L_0x005b:
        monitor-exit(r22);
        return r2;
    L_0x005d:
        r11 = new GifDrawable;
        r11.<init>(r13);	 Catch:{ RuntimeException -> 0x0063 }
        goto L_0x0042;
    L_0x0063:
        r15 = move-exception;
        r16 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r16;	 Catch:{ RuntimeException -> 0x0063 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0063 }
        r17 = "nx.an(";	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r16;	 Catch:{ RuntimeException -> 0x0063 }
        r1 = r17;	 Catch:{ RuntimeException -> 0x0063 }
        r16 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0063 }
        r4 = 41;	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r16;	 Catch:{ RuntimeException -> 0x0063 }
        r16 = r0.append(r4);	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r16;	 Catch:{ RuntimeException -> 0x0063 }
        r18 = r0.toString();	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r18;	 Catch:{ RuntimeException -> 0x0063 }
        r19 = p000.StringBuilder.append(r15, r0);	 Catch:{ RuntimeException -> 0x0063 }
        throw r19;	 Catch:{ RuntimeException -> 0x0063 }
    L_0x008a:
        r20 = move-exception;
        monitor-exit(r22);
        throw r20;
    L_0x008d:
        r0 = r22;	 Catch:{ RuntimeException -> 0x0063 }
        r5 = r0.next;	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r26;
        r9 = (long) r0;
        r5.get(r11, r9);	 Catch:{ RuntimeException -> 0x0063 }
    L_0x0097:
        r13 = r7.name;	 Catch:{ RuntimeException -> 0x0063 }
        r4 = -1237520467; // 0xffffffffb63cefad float:-2.8153693E-6 double:NaN;	 Catch:{ RuntimeException -> 0x0063 }
        r0 = r25;	 Catch:{ RuntimeException -> 0x0063 }
        r21 = r11.decode(r0, r13, r3, r4);	 Catch:{ RuntimeException -> 0x0063 }
        if (r21 != 0) goto L_0x0045;
    L_0x00a4:
        r2 = 0;
        goto L_0x0045;
    L_0x00a6:
        r3 = 0;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: Window.write(Base64, Class, GifDecoder, int, int):boolean");
    }
}
