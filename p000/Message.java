package p000;

import java.util.Collection;

/* compiled from: ax */
public class Message extends BitSet {
    static final int ERROR = -2;
    public static final int INDEX_ID = 0;
    static final int NO_COLOR = -1;
    static final int TRANSACTION_addSpeechFile = 7;
    public static final int TSIG_INTERMEDIATE = 2;
    public static final int TSIG_VERIFIED = 1;
    public static Class activity;
    static RuntimeException cache = new RuntimeException(50, null);
    static RuntimeException callback = new RuntimeException(64, null);
    public static RuntimeException context = new RuntimeException(200, null);
    public static int entry;
    static final StringMap params = new StringMap();
    int f209a;
    int f210b;
    public int buf;
    int[] buffer;
    int f211c;
    short[] count;
    int current;
    public int data;
    int[] entries;
    int first;
    int flags;
    int hash;
    int header;
    int height;
    int f212i;
    public int id;
    public int index;
    public int key;
    int last;
    short[] length;
    public int level;
    int list;
    public int log;
    public int name;
    short[] next;
    public int offset;
    int f213p;
    public int parent;
    Date path;
    int pos;
    int position;
    int f214r;
    public boolean root;
    short[] size;
    public int source;
    int start;
    public int state;
    int f215t;
    public int tag;
    public String[] text;
    public String[] this$0;
    public boolean type;
    public int url;
    int f216v;
    public String value;
    public int f217x;
    public int f218y;

    Message() {
        try {
            this.value = R$id.this$0;
            this.data = 177212144;
            this.parent = 0;
            this.level = 0;
            this.f217x = 0;
            this.index = 0;
            this.key = 0;
            this.name = 0;
            this.id = 1913816197;
            this.type = false;
            String[] $r2 = new String[5];
            $r2[0] = null;
            $r2[1] = null;
            $r2[2] = R$id.value;
            $r2[3] = null;
            $r2[4] = null;
            this.text = $r2;
            $r2 = new String[5];
            $r2[0] = null;
            $r2[1] = null;
            $r2[2] = null;
            $r2[3] = null;
            $r2[4] = R$id.group;
            this.this$0 = $r2;
            this.header = 1183121794;
            this.list = 477473513;
            this.current = -1359143283;
            this.f216v = 0;
            this.f214r = 1096124525;
            this.f213p = -852112093;
            this.f215t = 0;
            this.f209a = -1059764727;
            this.f212i = 1453532903;
            this.f210b = -1251184065;
            this.f211c = 1365894559;
            this.first = 1700727811;
            this.last = -1399188579;
            this.tag = -782163703;
            this.log = 164416135;
            this.pos = -1285486976;
            this.hash = 1219957632;
            this.flags = -741001344;
            this.offset = 0;
            this.f218y = 0;
            this.state = 0;
            this.root = false;
            this.position = -399610721;
            this.height = 469375159;
            this.source = 2006492709;
            this.url = 1005860947;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ax.<init>(" + ')');
        }
    }

    public static void add(int i, String str, String str2, int i2) {
        try {
            BigInteger.add(i, str, str2, null, 1364315208);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ax.af(" + ')');
        }
    }

    static final void close(int i) {
        i = -1675758365 * Database.size;
        int[] $r0 = Database.next;
        for (int $i1 = 0; $i1 < i; $i1++) {
            Item $r2 = client.size[$r0[$i1]];
            if ($r2 != null) {
                try {
                    Label.add($r2, 1, -468311029);
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "ax.bm(" + ')');
                }
            }
        }
    }

    public static final Long get(int $i0, int i, int i2, int i3, int i4, boolean z) {
        Long $r0;
        Integer $r4;
        Long $r5;
        File $r9;
        Point $r11;
        LazyList $r13;
        int $i02;
        long j;
        int $i10;
        int[] $r7;
        if (-1 == i) {
            i4 = 0;
        } else if (2 == i4 && 1 != i) {
            i4 = 1;
        }
        long $l8 = (((long) $i0) + (((long) i) << 16)) + (((long) i2) << 38);
        long j2 = $l8;
        long $l4 = (((long) i3) << 42) + ((((long) i4) << 40) + $l8);
        if (!z) {
            $r0 = (Long) context.get($l4);
            if ($r0 != null) {
                return $r0;
            }
        }
        Message $r3 = Set.get($i0, 2146831391);
        if (i > 1 && $r3.buffer != null) {
            $i0 = -1;
            int $i9 = 0;
            while ($i9 < 10) {
                if (i >= $r3.entries[$i9] && $r3.entries[$i9] != 0) {
                    $i0 = $r3.buffer[$i9];
                }
                $i9++;
            }
            if (-1 != $i0) {
                $r3 = Set.get($i0, 1232641402);
                $r4 = $r3.get(1, (byte) -23);
                if ($r4 == null) {
                    return null;
                }
                if ($r3.log * -50977591 != -1) {
                    $r5 = Kit.get($r3.tag * -1461501241, 10, 1, 0, 0, true, 610736546);
                    $r0 = $r5;
                    if ($r5 == null) {
                        return null;
                    }
                } else if (-1216365831 * $r3.height != -1) {
                    $r5 = Kit.get(1034178721 * $r3.position, i, i2, i3, 0, false, 610736546);
                    $r0 = $r5;
                    if ($r5 == null) {
                        return null;
                    }
                } else if (-1 == $r3.url * 2018587685) {
                    $r5 = Kit.get(-778372525 * $r3.source, i, 0, 0, 0, false, 610736546);
                    $r0 = $r5;
                    if ($r5 == null) {
                        return null;
                    }
                } else {
                    $r5 = null;
                    $l8 = new Long(36, 32);
                    params.add($l8.size, 36, 32, -1971339601);
                    $r9 = (CopyOnWriteArrayList) params.get(359423069);
                    $r11 = (Resource) params.get((byte) -101);
                    $r13 = params.toString(-914536586).get((byte) 2);
                    $r11.toString(-1628373391);
                    $r11.add(16, 16, (byte) 58);
                    $r11.read(false, 1821808160);
                    if (-1 != 2018587685 * $r3.url) {
                        $r9.get($r5, 0, 0, 2106205673);
                    }
                    $i0 = $r3.data * 1910776979;
                    if (!z) {
                        $i0 = (int) (1.5d * ((double) $i0));
                    } else if (2 == i2) {
                        $i02 = ((double) $i0) * 1.04d;
                        j = $i02;
                        $i0 = (int) $i02;
                    }
                    $i10 = (Point.f197x[$r3.parent * 491480759] * $i0) >> 16;
                    $i0 = ($i0 * Point.f198y[491480759 * $r3.parent]) >> 16;
                    $r4.append();
                    $r13.add($r4, 0, $r3.level * 292684555, $r3.f217x * 1218015627, $r3.parent * 491480759, $r3.index * 835169745, ($i10 + ((1500767459 * $r4.size) / 2)) + ($r3.key * 1330988217), ($r3.key * 1330988217) + $i0, 999894669);
                    if (-1 != $r3.height * -1216365831) {
                        $r9.get($r5, 0, 0, 2106205673);
                    }
                    if (i2 >= 1) {
                        $l8.copy(1);
                    }
                    if (i2 >= 2) {
                        $l8.copy(16777215);
                    }
                    if (i3 != 0) {
                        $l8.flush(i3);
                    }
                    params.add($l8.size, 36, 32, -1811181976);
                    if (-1 != $r3.log * -50977591) {
                        $r9.get($r5, 0, 0, 2106205673);
                    }
                    if (i4 == 1 || (i4 == 2 && 1 == 1099170281 * $r3.name)) {
                        Profile.path.add(Complex.read(i, -802100233), 0, 9, 16776960, 1, $r9);
                    }
                    $i0 = 0;
                    while (true) {
                        $i02 = $l8.size;
                        $r7 = $i02;
                        if ($i0 >= $i02.length) {
                            break;
                        }
                        if ($l8.size[$i0] == 0) {
                            $r7 = $l8.size;
                            $r7[$i0] = $r7[$i0] | -16777216;
                        }
                        $i0++;
                    }
                    if (!z) {
                        context.get($l8, $l4);
                    }
                    return $l8;
                }
                $r5 = $r0;
                $l8 = new Long(36, 32);
                params.add($l8.size, 36, 32, -1971339601);
                $r9 = (CopyOnWriteArrayList) params.get(359423069);
                $r11 = (Resource) params.get((byte) -101);
                $r13 = params.toString(-914536586).get((byte) 2);
                $r11.toString(-1628373391);
                $r11.add(16, 16, (byte) 58);
                $r11.read(false, 1821808160);
                if (-1 != 2018587685 * $r3.url) {
                    $r9.get($r5, 0, 0, 2106205673);
                }
                $i0 = $r3.data * 1910776979;
                if (!z) {
                    $i0 = (int) (1.5d * ((double) $i0));
                } else if (2 == i2) {
                    $i02 = ((double) $i0) * 1.04d;
                    j = $i02;
                    $i0 = (int) $i02;
                }
                $i10 = (Point.f197x[$r3.parent * 491480759] * $i0) >> 16;
                $i0 = ($i0 * Point.f198y[491480759 * $r3.parent]) >> 16;
                $r4.append();
                $r13.add($r4, 0, $r3.level * 292684555, $r3.f217x * 1218015627, $r3.parent * 491480759, $r3.index * 835169745, ($i10 + ((1500767459 * $r4.size) / 2)) + ($r3.key * 1330988217), ($r3.key * 1330988217) + $i0, 999894669);
                if (-1 != $r3.height * -1216365831) {
                    $r9.get($r5, 0, 0, 2106205673);
                }
                if (i2 >= 1) {
                    $l8.copy(1);
                }
                if (i2 >= 2) {
                    $l8.copy(16777215);
                }
                if (i3 != 0) {
                    $l8.flush(i3);
                }
                params.add($l8.size, 36, 32, -1811181976);
                if (-1 != $r3.log * -50977591) {
                    $r9.get($r5, 0, 0, 2106205673);
                }
                Profile.path.add(Complex.read(i, -802100233), 0, 9, 16776960, 1, $r9);
                $i0 = 0;
                while (true) {
                    $i02 = $l8.size;
                    $r7 = $i02;
                    if ($i0 >= $i02.length) {
                        break;
                    }
                    if ($l8.size[$i0] == 0) {
                        $r7 = $l8.size;
                        $r7[$i0] = $r7[$i0] | -16777216;
                    }
                    $i0++;
                }
                if (z) {
                    context.get($l8, $l4);
                }
                return $l8;
            }
        }
        $r4 = $r3.get(1, (byte) -23);
        if ($r4 == null) {
            return null;
        }
        if ($r3.log * -50977591 != -1) {
            $r5 = Kit.get($r3.tag * -1461501241, 10, 1, 0, 0, true, 610736546);
            $r0 = $r5;
            if ($r5 == null) {
                return null;
            }
        } else if (-1216365831 * $r3.height != -1) {
            $r5 = Kit.get(1034178721 * $r3.position, i, i2, i3, 0, false, 610736546);
            $r0 = $r5;
            if ($r5 == null) {
                return null;
            }
        } else if (-1 == $r3.url * 2018587685) {
            $r5 = null;
            $l8 = new Long(36, 32);
            params.add($l8.size, 36, 32, -1971339601);
            $r9 = (CopyOnWriteArrayList) params.get(359423069);
            $r11 = (Resource) params.get((byte) -101);
            $r13 = params.toString(-914536586).get((byte) 2);
            $r11.toString(-1628373391);
            $r11.add(16, 16, (byte) 58);
            $r11.read(false, 1821808160);
            if (-1 != 2018587685 * $r3.url) {
                $r9.get($r5, 0, 0, 2106205673);
            }
            $i0 = $r3.data * 1910776979;
            if (!z) {
                $i0 = (int) (1.5d * ((double) $i0));
            } else if (2 == i2) {
                $i02 = ((double) $i0) * 1.04d;
                j = $i02;
                $i0 = (int) $i02;
            }
            $i10 = (Point.f197x[$r3.parent * 491480759] * $i0) >> 16;
            $i0 = ($i0 * Point.f198y[491480759 * $r3.parent]) >> 16;
            $r4.append();
            $r13.add($r4, 0, $r3.level * 292684555, $r3.f217x * 1218015627, $r3.parent * 491480759, $r3.index * 835169745, ($i10 + ((1500767459 * $r4.size) / 2)) + ($r3.key * 1330988217), ($r3.key * 1330988217) + $i0, 999894669);
            if (-1 != $r3.height * -1216365831) {
                $r9.get($r5, 0, 0, 2106205673);
            }
            if (i2 >= 1) {
                $l8.copy(1);
            }
            if (i2 >= 2) {
                $l8.copy(16777215);
            }
            if (i3 != 0) {
                $l8.flush(i3);
            }
            params.add($l8.size, 36, 32, -1811181976);
            if (-1 != $r3.log * -50977591) {
                $r9.get($r5, 0, 0, 2106205673);
            }
            Profile.path.add(Complex.read(i, -802100233), 0, 9, 16776960, 1, $r9);
            $i0 = 0;
            while (true) {
                $i02 = $l8.size;
                $r7 = $i02;
                if ($i0 >= $i02.length) {
                    break;
                }
                if ($l8.size[$i0] == 0) {
                    $r7 = $l8.size;
                    $r7[$i0] = $r7[$i0] | -16777216;
                }
                $i0++;
            }
            if (z) {
                context.get($l8, $l4);
            }
            return $l8;
        } else {
            $r5 = Kit.get(-778372525 * $r3.source, i, 0, 0, 0, false, 610736546);
            $r0 = $r5;
            if ($r5 == null) {
                return null;
            }
        }
        $r5 = $r0;
        $l8 = new Long(36, 32);
        params.add($l8.size, 36, 32, -1971339601);
        $r9 = (CopyOnWriteArrayList) params.get(359423069);
        $r11 = (Resource) params.get((byte) -101);
        $r13 = params.toString(-914536586).get((byte) 2);
        $r11.toString(-1628373391);
        $r11.add(16, 16, (byte) 58);
        $r11.read(false, 1821808160);
        if (-1 != 2018587685 * $r3.url) {
            $r9.get($r5, 0, 0, 2106205673);
        }
        $i0 = $r3.data * 1910776979;
        if (!z) {
            $i0 = (int) (1.5d * ((double) $i0));
        } else if (2 == i2) {
            $i02 = ((double) $i0) * 1.04d;
            j = $i02;
            $i0 = (int) $i02;
        }
        $i10 = (Point.f197x[$r3.parent * 491480759] * $i0) >> 16;
        $i0 = ($i0 * Point.f198y[491480759 * $r3.parent]) >> 16;
        $r4.append();
        $r13.add($r4, 0, $r3.level * 292684555, $r3.f217x * 1218015627, $r3.parent * 491480759, $r3.index * 835169745, ($i10 + ((1500767459 * $r4.size) / 2)) + ($r3.key * 1330988217), ($r3.key * 1330988217) + $i0, 999894669);
        if (-1 != $r3.height * -1216365831) {
            $r9.get($r5, 0, 0, 2106205673);
        }
        if (i2 >= 1) {
            $l8.copy(1);
        }
        if (i2 >= 2) {
            $l8.copy(16777215);
        }
        if (i3 != 0) {
            $l8.flush(i3);
        }
        params.add($l8.size, 36, 32, -1811181976);
        if (-1 != $r3.log * -50977591) {
            $r9.get($r5, 0, 0, 2106205673);
        }
        Profile.path.add(Complex.read(i, -802100233), 0, 9, 16776960, 1, $r9);
        $i0 = 0;
        while (true) {
            $i02 = $l8.size;
            $r7 = $i02;
            if ($i0 >= $i02.length) {
                break;
            }
            if ($l8.size[$i0] == 0) {
                $r7 = $l8.size;
                $r7[$i0] = $r7[$i0] | -16777216;
            }
            $i0++;
        }
        if (z) {
            context.get($l8, $l4);
        }
        return $l8;
    }

    static final String getBytes(int $i0) {
        return $i0 < 100000 ? "<col=ffff00>" + $i0 + "</col>" : $i0 < 10000000 ? "<col=ffffff>" + ($i0 / -1907480628) + R$id.settings + "</col>" : "<col=00ff80>" + ($i0 / 1000000) + R$id.TAG + "</col>";
    }

    public static void getContent(boolean z) {
        if (z != Chunk.data) {
            State.start(884543598);
            Chunk.data = z;
        }
    }

    static final String getHash(int $i0) {
        return $i0 < 529091674 ? "<col=ffff00>" + $i0 + "</col>" : $i0 < 831529294 ? "<col=ffffff>" + ($i0 / 1000) + R$id.settings + "</col>" : "<col=00ff80>" + ($i0 / -1701507577) + R$id.TAG + "</col>";
    }

    static void init(int $i0, int i) {
        if (-1 != $i0) {
            if (Hashtable.get($i0, (byte) -126)) {
                System[] $r1 = Float.size[$i0];
                for (System $r2 : $r1) {
                    if ($r2.listener != null) {
                        try {
                            ArrayList $r4 = new ArrayList();
                            $r4.name = $r2;
                            $r4.size = $r2.listener;
                            C0000L.parse($r4, 5000000, 2135550014);
                        } catch (RuntimeException $r5) {
                            throw StringBuilder.append($r5, "ax.av(" + ')');
                        }
                    }
                }
            }
        }
    }

    public static Message load(int i) {
        Message $r2 = (Message) callback.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = activity.get(10, i, -1725197888);
        $r2 = new Message();
        $r2.buf = 923506921 * i;
        if ($r4 != null) {
            $r2.create(new Logger($r4), -702567698);
        }
        $r2.indexOf((byte) -10);
        if (-1 != $r2.log * -50977591) {
            $r2.set(Set.get($r2.log * -50977591, 1822942853), Set.get(-1461501241 * $r2.tag, 1745139550), (byte) -42);
        }
        if (-1 != $r2.height * -1216365831) {
            $r2.add(Set.get($r2.height * -1216365831, 1180164859), Set.get(1034178721 * $r2.position, 1071451220), 1437130979);
        }
        if (-1 != 2018587685 * $r2.url) {
            $r2.add(Set.get(2018587685 * $r2.url, 1265079525), Set.get($r2.source * -778372525, 1986175848), (byte) 1);
        }
        if (!Chunk.data && $r2.type) {
            $r2.value = R$id.counter;
            $r2.root = false;
            $r2.text = null;
            $r2.this$0 = null;
            $r2.header = -1555922751;
            $r2.state = 0;
            if ($r2.path != null) {
                boolean $z0 = false;
                Object $r10 = $r2.path.add();
                while ($r10 != null) {
                    if (PriorityQueue.add((int) $r10.size, (byte) 98).data) {
                        $r10.iterator();
                    } else {
                        $z0 = true;
                    }
                    Date $r9 = $r2.path;
                    $r10 = $r9.get();
                }
                if (!$z0) {
                    $r2.path = null;
                }
            }
        }
        callback.get($r2, (long) i);
        return $r2;
    }

    public static void load(boolean z) {
        if (z != Chunk.data) {
            State.start(-116022348);
            Chunk.data = z;
        }
    }

    static final String read(int $i0) {
        return $i0 < 100000 ? "<col=ffff00>" + $i0 + "</col>" : $i0 < 10000000 ? "<col=ffffff>" + ($i0 / 1000) + R$id.settings + "</col>" : "<col=00ff80>" + ($i0 / 1000000) + R$id.TAG + "</col>";
    }

    public static final Long toString(int i, int i2, int i3, int i4, int i5, boolean z) {
        Long $r0;
        Integer $r15;
        Long $r4;
        BitSet bitSet;
        File $r7;
        Point $r9;
        LazyList $r11;
        int $i0;
        long j;
        int $i9;
        int[] $r3;
        if (-1 == i2) {
            i5 = 0;
        } else if (2 == i5 && 1 != i2) {
            i5 = 1;
        }
        long $l8 = (((long) i) + (((long) i2) << 16)) + (((long) i3) << 38);
        long j2 = $l8;
        long $l4 = (((long) i4) << 1673606111) + ((((long) i5) << 40) + $l8);
        if (!z) {
            $r0 = (Long) context.get($l4);
            if ($r0 != null) {
                return $r0;
            }
        }
        Message $r14 = Set.get(i, 1473253283);
        if (i2 > 1 && $r14.buffer != null) {
            i = -1;
            int $i10 = 0;
            while ($i10 < 10) {
                if (i2 >= $r14.entries[$i10] && $r14.entries[$i10] != 0) {
                    i = $r14.buffer[$i10];
                }
                $i10++;
            }
            if (-1 != i) {
                $r14 = Set.get(i, 2022198188);
                $r15 = $r14.get(1, (byte) -5);
                if ($r15 == null) {
                    return null;
                }
                if ($r14.log * 932407900 != -1) {
                    $r4 = Kit.get($r14.tag * 458589444, 10, 1, 0, 0, true, 610736546);
                    $r0 = $r4;
                    if ($r4 == null) {
                        return null;
                    }
                } else if (-1216365831 * $r14.height != -1) {
                    $r4 = Kit.get(1933840246 * $r14.position, i2, i3, i4, 0, false, 610736546);
                    $r0 = $r4;
                    if ($r4 == null) {
                        return null;
                    }
                } else if (-1 == $r14.url * -1627158523) {
                    $r4 = Kit.get(217420745 * $r14.source, i2, 0, 0, 0, false, 610736546);
                    $r0 = $r4;
                    if ($r4 == null) {
                        return null;
                    }
                } else {
                    $r4 = null;
                    bitSet = new Long(36, 1976163280);
                    params.add(bitSet.size, 839826104, 32, -2097808643);
                    $r7 = (CopyOnWriteArrayList) params.get(-556759503);
                    $r9 = (Resource) params.get((byte) -42);
                    $r11 = params.toString(-914536586).get((byte) 2);
                    $r9.toString(-1703318893);
                    $r9.add(16, 16, (byte) -88);
                    $r9.read(false, 2102133980);
                    if (-1 != 559500998 * $r14.url) {
                        $r7.get($r4, 0, 0, 2106205673);
                    }
                    i = $r14.data * 1910776979;
                    if (!z) {
                        i = (int) (1.5d * ((double) i));
                    } else if (2 == i3) {
                        $i0 = ((double) i) * 1.04d;
                        j = $i0;
                        i = (int) $i0;
                    }
                    $i9 = (Point.f197x[$r14.parent * 491480759] * i) >> 16;
                    i = (i * Point.f198y[1937838580 * $r14.parent]) >> 16;
                    $r15.append();
                    $r11.add($r15, 0, $r14.level * -1979550299, $r14.f217x * 2036878490, $r14.parent * 491480759, $r14.index * -96616343, ($i9 + ((-808538846 * $r15.size) / 2)) + ($r14.key * 1330988217), ($r14.key * 1159324351) + i, -1801577212);
                    if (-1 != $r14.height * -1216365831) {
                        $r7.get($r4, 0, 0, 2106205673);
                    }
                    if (i3 >= 1) {
                        bitSet.copy(1);
                    }
                    if (i3 >= 2) {
                        bitSet.copy(1281313520);
                    }
                    if (i4 != 0) {
                        bitSet.flush(i4);
                    }
                    params.add(bitSet.size, 1974542017, -1567987033, 1228571127);
                    if (-1 != $r14.log * 1722965818) {
                        $r7.get($r4, 0, 0, 2106205673);
                    }
                    if (i5 == 1 || (i5 == 2 && 1 == 1099170281 * $r14.name)) {
                        Profile.path.add(Complex.read(i2, -802100233), 0, 9, 16776960, 1, $r7);
                    }
                    i = 0;
                    while (true) {
                        $i0 = bitSet.size;
                        $r3 = $i0;
                        if (i >= $i0.length) {
                            break;
                        }
                        if (bitSet.size[i] == 0) {
                            $r3 = bitSet.size;
                            $r3[i] = $r3[i] | -777864395;
                        }
                        i++;
                    }
                    if (!z) {
                        context.get(bitSet, $l4);
                    }
                    return bitSet;
                }
                $r4 = $r0;
                bitSet = new Long(36, 1976163280);
                params.add(bitSet.size, 839826104, 32, -2097808643);
                $r7 = (CopyOnWriteArrayList) params.get(-556759503);
                $r9 = (Resource) params.get((byte) -42);
                $r11 = params.toString(-914536586).get((byte) 2);
                $r9.toString(-1703318893);
                $r9.add(16, 16, (byte) -88);
                $r9.read(false, 2102133980);
                if (-1 != 559500998 * $r14.url) {
                    $r7.get($r4, 0, 0, 2106205673);
                }
                i = $r14.data * 1910776979;
                if (!z) {
                    i = (int) (1.5d * ((double) i));
                } else if (2 == i3) {
                    $i0 = ((double) i) * 1.04d;
                    j = $i0;
                    i = (int) $i0;
                }
                $i9 = (Point.f197x[$r14.parent * 491480759] * i) >> 16;
                i = (i * Point.f198y[1937838580 * $r14.parent]) >> 16;
                $r15.append();
                $r11.add($r15, 0, $r14.level * -1979550299, $r14.f217x * 2036878490, $r14.parent * 491480759, $r14.index * -96616343, ($i9 + ((-808538846 * $r15.size) / 2)) + ($r14.key * 1330988217), ($r14.key * 1159324351) + i, -1801577212);
                if (-1 != $r14.height * -1216365831) {
                    $r7.get($r4, 0, 0, 2106205673);
                }
                if (i3 >= 1) {
                    bitSet.copy(1);
                }
                if (i3 >= 2) {
                    bitSet.copy(1281313520);
                }
                if (i4 != 0) {
                    bitSet.flush(i4);
                }
                params.add(bitSet.size, 1974542017, -1567987033, 1228571127);
                if (-1 != $r14.log * 1722965818) {
                    $r7.get($r4, 0, 0, 2106205673);
                }
                Profile.path.add(Complex.read(i2, -802100233), 0, 9, 16776960, 1, $r7);
                i = 0;
                while (true) {
                    $i0 = bitSet.size;
                    $r3 = $i0;
                    if (i >= $i0.length) {
                        break;
                    }
                    if (bitSet.size[i] == 0) {
                        $r3 = bitSet.size;
                        $r3[i] = $r3[i] | -777864395;
                    }
                    i++;
                }
                if (z) {
                    context.get(bitSet, $l4);
                }
                return bitSet;
            }
        }
        $r15 = $r14.get(1, (byte) -5);
        if ($r15 == null) {
            return null;
        }
        if ($r14.log * 932407900 != -1) {
            $r4 = Kit.get($r14.tag * 458589444, 10, 1, 0, 0, true, 610736546);
            $r0 = $r4;
            if ($r4 == null) {
                return null;
            }
        } else if (-1216365831 * $r14.height != -1) {
            $r4 = Kit.get(1933840246 * $r14.position, i2, i3, i4, 0, false, 610736546);
            $r0 = $r4;
            if ($r4 == null) {
                return null;
            }
        } else if (-1 == $r14.url * -1627158523) {
            $r4 = null;
            bitSet = new Long(36, 1976163280);
            params.add(bitSet.size, 839826104, 32, -2097808643);
            $r7 = (CopyOnWriteArrayList) params.get(-556759503);
            $r9 = (Resource) params.get((byte) -42);
            $r11 = params.toString(-914536586).get((byte) 2);
            $r9.toString(-1703318893);
            $r9.add(16, 16, (byte) -88);
            $r9.read(false, 2102133980);
            if (-1 != 559500998 * $r14.url) {
                $r7.get($r4, 0, 0, 2106205673);
            }
            i = $r14.data * 1910776979;
            if (!z) {
                i = (int) (1.5d * ((double) i));
            } else if (2 == i3) {
                $i0 = ((double) i) * 1.04d;
                j = $i0;
                i = (int) $i0;
            }
            $i9 = (Point.f197x[$r14.parent * 491480759] * i) >> 16;
            i = (i * Point.f198y[1937838580 * $r14.parent]) >> 16;
            $r15.append();
            $r11.add($r15, 0, $r14.level * -1979550299, $r14.f217x * 2036878490, $r14.parent * 491480759, $r14.index * -96616343, ($i9 + ((-808538846 * $r15.size) / 2)) + ($r14.key * 1330988217), ($r14.key * 1159324351) + i, -1801577212);
            if (-1 != $r14.height * -1216365831) {
                $r7.get($r4, 0, 0, 2106205673);
            }
            if (i3 >= 1) {
                bitSet.copy(1);
            }
            if (i3 >= 2) {
                bitSet.copy(1281313520);
            }
            if (i4 != 0) {
                bitSet.flush(i4);
            }
            params.add(bitSet.size, 1974542017, -1567987033, 1228571127);
            if (-1 != $r14.log * 1722965818) {
                $r7.get($r4, 0, 0, 2106205673);
            }
            Profile.path.add(Complex.read(i2, -802100233), 0, 9, 16776960, 1, $r7);
            i = 0;
            while (true) {
                $i0 = bitSet.size;
                $r3 = $i0;
                if (i >= $i0.length) {
                    break;
                }
                if (bitSet.size[i] == 0) {
                    $r3 = bitSet.size;
                    $r3[i] = $r3[i] | -777864395;
                }
                i++;
            }
            if (z) {
                context.get(bitSet, $l4);
            }
            return bitSet;
        } else {
            $r4 = Kit.get(217420745 * $r14.source, i2, 0, 0, 0, false, 610736546);
            $r0 = $r4;
            if ($r4 == null) {
                return null;
            }
        }
        $r4 = $r0;
        bitSet = new Long(36, 1976163280);
        params.add(bitSet.size, 839826104, 32, -2097808643);
        $r7 = (CopyOnWriteArrayList) params.get(-556759503);
        $r9 = (Resource) params.get((byte) -42);
        $r11 = params.toString(-914536586).get((byte) 2);
        $r9.toString(-1703318893);
        $r9.add(16, 16, (byte) -88);
        $r9.read(false, 2102133980);
        if (-1 != 559500998 * $r14.url) {
            $r7.get($r4, 0, 0, 2106205673);
        }
        i = $r14.data * 1910776979;
        if (!z) {
            i = (int) (1.5d * ((double) i));
        } else if (2 == i3) {
            $i0 = ((double) i) * 1.04d;
            j = $i0;
            i = (int) $i0;
        }
        $i9 = (Point.f197x[$r14.parent * 491480759] * i) >> 16;
        i = (i * Point.f198y[1937838580 * $r14.parent]) >> 16;
        $r15.append();
        $r11.add($r15, 0, $r14.level * -1979550299, $r14.f217x * 2036878490, $r14.parent * 491480759, $r14.index * -96616343, ($i9 + ((-808538846 * $r15.size) / 2)) + ($r14.key * 1330988217), ($r14.key * 1159324351) + i, -1801577212);
        if (-1 != $r14.height * -1216365831) {
            $r7.get($r4, 0, 0, 2106205673);
        }
        if (i3 >= 1) {
            bitSet.copy(1);
        }
        if (i3 >= 2) {
            bitSet.copy(1281313520);
        }
        if (i4 != 0) {
            bitSet.flush(i4);
        }
        params.add(bitSet.size, 1974542017, -1567987033, 1228571127);
        if (-1 != $r14.log * 1722965818) {
            $r7.get($r4, 0, 0, 2106205673);
        }
        Profile.path.add(Complex.read(i2, -802100233), 0, 9, 16776960, 1, $r7);
        i = 0;
        while (true) {
            $i0 = bitSet.size;
            $r3 = $i0;
            if (i >= $i0.length) {
                break;
            }
            if (bitSet.size[i] == 0) {
                $r3 = bitSet.size;
                $r3[i] = $r3[i] | -777864395;
            }
            i++;
        }
        if (z) {
            context.get(bitSet, $l4);
        }
        return bitSet;
    }

    public static void write(Collection collection) {
        collection.add(callback);
        collection.add(cache);
        collection.add(context);
    }

    public int add() {
        if (-1 != this.header * 653127871) {
            if (this.this$0 == null) {
                return -1;
            }
            if (this.header * 653127871 >= 0) {
                if (this.this$0[this.header * 653127871] != null) {
                    return this.header * 653127871;
                }
            } else if (R$id.group.equalsIgnoreCase(this.this$0[4])) {
                return 4;
            }
        }
        return -1;
    }

    public final Table add(int i) {
        if (this.buffer != null && i > 1) {
            int $i2 = 0;
            int $i3 = -1;
            while ($i2 < 10) {
                if (i >= this.entries[$i2] && this.entries[$i2] != 0) {
                    $i3 = this.buffer[$i2];
                }
                $i2++;
            }
            if (-1 != $i3) {
                return Set.get($i3, 1444376453).add(1, (byte) -54);
            }
        }
        Table $r3 = Table.get(HttpFields.count, this.start * -1050083861, 0);
        if ($r3 == null) {
            return null;
        }
        if (!(1458592965 * this.pos == Constants.f93X && 172534883 == 1849053831 * this.hash && -1214840348 * this.flags == 615280331)) {
            $r3.trim(1268881996 * this.pos, 83042711 * this.hash, -518419489 * this.flags);
        }
        if (this.size != null) {
            for (i = 0; i < this.size.length; i++) {
                $r3.get(this.size[i], this.next[i]);
            }
        }
        if (this.count != null) {
            for (int $i1 = 0; $i1 < this.count.length; $i1++) {
                $r3.equals(this.count[$i1], this.length[$i1]);
            }
        }
        return $r3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.Table add(int r20, byte r21) {
        /*
        r19 = this;
        r1 = 0;
        r0 = r19;
        r2 = r0.buffer;	 Catch:{ RuntimeException -> 0x00f0 }
        if (r2 == 0) goto L_0x00a7;
    L_0x0007:
        r3 = 1;
        r0 = r20;
        if (r0 <= r3) goto L_0x00a7;
    L_0x000c:
        r4 = 0;
        r5 = -1;
    L_0x000e:
        r3 = 10;
        if (r4 >= r3) goto L_0x00c2;
    L_0x0012:
        r0 = r19;
        r2 = r0.entries;	 Catch:{ RuntimeException -> 0x00f0 }
        r6 = r2[r4];	 Catch:{ RuntimeException -> 0x00f0 }
        r0 = r20;
        if (r0 < r6) goto L_0x002a;
    L_0x001c:
        r0 = r19;
        r2 = r0.entries;	 Catch:{ RuntimeException -> 0x00f0 }
        r6 = r2[r4];	 Catch:{ RuntimeException -> 0x00f0 }
        if (r6 == 0) goto L_0x002a;
    L_0x0024:
        r0 = r19;
        r2 = r0.buffer;	 Catch:{ RuntimeException -> 0x00f0 }
        r5 = r2[r4];	 Catch:{ RuntimeException -> 0x00f0 }
    L_0x002a:
        r4 = r4 + 1;
        goto L_0x000e;
    L_0x002d:
        r0 = r19;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x00f0 }
        r20 = r0;
        r3 = 1458592965; // 0x56f05cc5 float:1.32140616E14 double:7.206406753E-315;
        r20 = r3 * r20;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r20;
        if (r0 != r3) goto L_0x0063;
    L_0x003e:
        r0 = r19;
        r0 = r0.hash;	 Catch:{ RuntimeException -> 0x00f0 }
        r20 = r0;
        r3 = 83042711; // 0x4f32197 float:5.7159873E-36 double:4.10285506E-316;
        r20 = r3 * r20;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r20;
        if (r3 != r0) goto L_0x0063;
    L_0x004f:
        r0 = r19;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x00f0 }
        r20 = r0;
        r3 = -2139425649; // 0xffffffff807af48f float:-1.1291662E-38 double:NaN;
        r0 = r20;
        r0 = r0 * r3;
        r20 = r0;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r20;
        if (r0 == r3) goto L_0x0084;
    L_0x0063:
        r0 = r19;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x00f0 }
        r20 = r0;
        r3 = 1458592965; // 0x56f05cc5 float:1.32140616E14 double:7.206406753E-315;
        r20 = r3 * r20;
        r0 = r19;
        r4 = r0.hash;	 Catch:{ RuntimeException -> 0x00f0 }
        r3 = 83042711; // 0x4f32197 float:5.7159873E-36 double:4.10285506E-316;
        r4 = r3 * r4;
        r0 = r19;
        r5 = r0.flags;	 Catch:{ RuntimeException -> 0x00f0 }
        r3 = -2139425649; // 0xffffffff807af48f float:-1.1291662E-38 double:NaN;
        r5 = r5 * r3;
        r0 = r20;
        r7.trim(r0, r4, r5);	 Catch:{ RuntimeException -> 0x00f0 }
    L_0x0084:
        r0 = r19;
        r8 = r0.size;	 Catch:{ RuntimeException -> 0x00f0 }
        if (r8 == 0) goto L_0x010f;
    L_0x008a:
        r20 = 0;
    L_0x008c:
        r0 = r19;
        r8 = r0.size;	 Catch:{ RuntimeException -> 0x00f0 }
        r4 = r8.length;	 Catch:{ RuntimeException -> 0x00f0 }
        r0 = r20;
        if (r0 >= r4) goto L_0x010f;
    L_0x0095:
        r0 = r19;
        r8 = r0.size;	 Catch:{ RuntimeException -> 0x00f0 }
        r9 = r8[r20];	 Catch:{ RuntimeException -> 0x00f0 }
        r0 = r19;
        r8 = r0.next;	 Catch:{ RuntimeException -> 0x00f0 }
        r10 = r8[r20];	 Catch:{ RuntimeException -> 0x00f0 }
        r7.get(r9, r10);	 Catch:{ RuntimeException -> 0x00f0 }
        r20 = r20 + 1;
        goto L_0x008c;
    L_0x00a7:
        r11 = p000.HttpFields.count;
        r0 = r19;
        r0 = r0.start;	 Catch:{ RuntimeException -> 0x00f0 }
        r20 = r0;
        r3 = -898183341; // 0xffffffffca76cf53 float:-4043732.8 double:NaN;
        r0 = r20;
        r0 = r0 * r3;
        r20 = r0;
        r3 = 0;
        r0 = r20;
        r7 = p000.Table.get(r11, r0, r3);	 Catch:{ RuntimeException -> 0x00f0 }
        if (r7 != 0) goto L_0x002d;
    L_0x00c0:
        r12 = 0;
        return r12;
    L_0x00c2:
        r3 = -1;
        if (r3 == r5) goto L_0x00a7;
    L_0x00c5:
        r3 = 1252435682; // 0x4aa6a6e2 float:5460849.0 double:6.18785444E-315;
        r19 = p000.Set.get(r5, r3);	 Catch:{ RuntimeException -> 0x00f0 }
        r3 = 1;
        r13 = -2;
        r0 = r19;
        r7 = r0.add(r3, r13);	 Catch:{ RuntimeException -> 0x00f0 }
        return r7;
    L_0x00d5:
        r1 = r1 + 1;
    L_0x00d7:
        r0 = r19;
        r8 = r0.count;	 Catch:{ RuntimeException -> 0x00f0 }
        r0 = r8.length;	 Catch:{ RuntimeException -> 0x00f0 }
        r20 = r0;
        if (r1 >= r0) goto L_0x0116;
    L_0x00e0:
        r0 = r19;
        r8 = r0.count;	 Catch:{ RuntimeException -> 0x00f0 }
        r9 = r8[r1];	 Catch:{ RuntimeException -> 0x00f0 }
        r0 = r19;
        r8 = r0.length;	 Catch:{ RuntimeException -> 0x00f0 }
        r10 = r8[r1];	 Catch:{ RuntimeException -> 0x00f0 }
        r7.equals(r9, r10);	 Catch:{ RuntimeException -> 0x00f0 }
        goto L_0x00d5;
    L_0x00f0:
        r14 = move-exception;
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r16 = "ax.ar(";
        r0 = r16;
        r15 = r15.append(r0);
        r3 = 41;
        r15 = r15.append(r3);
        r17 = r15.toString();
        r0 = r17;
        r18 = p000.StringBuilder.append(r14, r0);
        throw r18;
    L_0x010f:
        r0 = r19;
        r8 = r0.count;	 Catch:{ RuntimeException -> 0x00f0 }
        if (r8 == 0) goto L_0x0116;
    L_0x0115:
        goto L_0x00d7;
    L_0x0116:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: Message.add(int, byte):Table");
    }

    public final Table add(boolean z) {
        int $i2 = 1937519271 * this.list;
        int $i3 = -1088607301 * this.current;
        int $i1 = -92416057 * this.f209a;
        if (z) {
            $i2 = this.f214r * -1621344613;
            $i3 = this.f213p * 1926968693;
            $i1 = this.f212i * 1943237417;
        }
        if ($i2 == -1) {
            return null;
        }
        Table $r3 = Table.get(HttpFields.count, $i2, 0);
        if ($i3 != -1) {
            $r3 = Table.get(HttpFields.count, $i3, 0);
            if (-1 != $i1) {
                Table $r6 = Table.get(HttpFields.count, $i1, 0);
                $r3 = new Table(new Table[]{$r5, $r3, $r6}, 3);
            } else {
                $r3 = new Table(new Table[]{$r5, $r3}, 2);
            }
        }
        if (!(z || this.f216v * 1899140937 == 0)) {
            $r3.add(0, this.f216v * 1899140937, 0);
        }
        if (z && this.f215t * -1672426487 != 0) {
            $r3.add(0, this.f215t * -1672426487, 0);
        }
        if (this.size != null) {
            for ($i1 = 0; $i1 < this.size.length; $i1++) {
                $r3.get(this.size[$i1], this.next[$i1]);
            }
        }
        if (this.count != null) {
            for (int $i0 = 0; $i0 < this.count.length; $i0++) {
                $r3.equals(this.count[$i0], this.length[$i0]);
            }
        }
        return $r3;
    }

    void add(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.start = logger.get(1554223115) * 334515419;
        } else if ($i0 == 2) {
            this.value = logger.toString(453813376);
        } else if ($i0 == 4) {
            this.data = logger.get(-1476011671) * 1580636571;
        } else if ($i0 == 5) {
            this.parent = logger.get(1873754613) * -738729943;
        } else if (6 == $i0) {
            this.level = logger.get(-1512602176) * 289550499;
        } else {
            if ($i0 == 7) {
                this.index = logger.get(9116085) * 769523696;
                if (this.index * 1755696631 > 32767) {
                    this.index -= -885981184;
                }
            } else if (8 == $i0) {
                this.key = logger.get(-1997469585) * -1089681040;
                if (1330988217 * this.key > 1200050576) {
                    this.key -= -2121728000;
                }
            } else if (11 == $i0) {
                this.name = 1103423065;
            } else if ($i0 == 12) {
                this.id = logger.size(1762891493) * 1913816197;
            } else if (16 == $i0) {
                this.type = true;
            } else if (23 == $i0) {
                this.list = logger.get(-305941108) * 1931403088;
                this.f216v = logger.get((byte) 0) * 1121061625;
            } else if (24 == $i0) {
                this.current = logger.get(524938537) * -164215845;
            } else if ($i0 == 25) {
                this.f214r = logger.get(-212054494) * -1096124525;
                this.f215t = logger.get((byte) 0) * 1018593849;
            } else if (26 == $i0) {
                this.f213p = logger.get(1798590128) * 354683759;
            } else if ($i0 >= 30 && $i0 < -1691105516) {
                this.text[$i0 - 30] = logger.toString(1643540454);
                if (this.text[$i0 - 30].equalsIgnoreCase(R$id.names)) {
                    this.text[$i0 - 30] = null;
                }
            } else if ($i0 >= -945090621 && $i0 < 682621462) {
                this.this$0[$i0 - 732816799] = logger.toString(1180045209);
            } else if ($i0 == 40) {
                $i0 = logger.get((byte) 0);
                this.size = new short[$i0];
                this.next = new short[$i0];
                while ($i1 < $i0) {
                    this.size[$i1] = (short) logger.get(1785953303);
                    this.next[$i1] = (short) logger.get(34150121);
                    $i1++;
                }
            } else if ($i0 == -86601635) {
                $i0 = logger.get((byte) 0);
                this.count = new short[$i0];
                this.length = new short[$i0];
                while ($i1 < $i0) {
                    this.count[$i1] = (short) logger.get(510269079);
                    this.length[$i1] = (short) logger.get(-1273090072);
                    $i1++;
                }
            } else if ($i0 == -143418770) {
                this.header = logger.next(1247983979) * 1555922751;
            } else if ($i0 == 65) {
                this.root = true;
            } else if (-706087146 == $i0) {
                this.f209a = logger.get(1959260902) * 1059764727;
            } else if (-809221071 == $i0) {
                this.f212i = logger.get(-283855357) * 192996590;
            } else if (90 == $i0) {
                this.f210b = logger.get(-750580496) * -614619349;
            } else if (91 == $i0) {
                this.first = logger.get(1415461602) * 765159363;
            } else if ($i0 == -1648650030) {
                this.f211c = logger.get(-150558502) * -1365894559;
            } else if (93 == $i0) {
                this.last = logger.get(582560141) * -409096903;
            } else if (1925891732 == $i0) {
                this.f217x = logger.get(-626983533) * 1280167234;
            } else if ($i0 == 97) {
                this.tag = logger.get(55925628) * 1558245608;
            } else if ($i0 == 98) {
                this.log = logger.get(1842804835) * -164416135;
            } else if ($i0 >= 100 && $i0 < 1064093572) {
                if (this.buffer == null) {
                    this.buffer = new int[10];
                    this.entries = new int[10];
                }
                this.buffer[$i0 - 100] = logger.get(1263726250);
                this.entries[$i0 - 1569373233] = logger.get(-318330502);
            } else if ($i0 == 110) {
                this.pos = logger.get(-1587647325) * 1112092531;
            } else if ($i0 == 111) {
                this.hash = logger.get(-843454079) * -1775997203;
            } else if ($i0 == 112) {
                this.flags = logger.get(374231696) * -1247303057;
            } else if ($i0 == -1799643558) {
                this.offset = logger.next(1247983979) * -414551681;
            } else if (425858956 == $i0) {
                this.f218y = logger.next(1247983979) * -271376179;
            } else if (115 == $i0) {
                this.state = logger.get((byte) 0) * 329871751;
            } else if ($i0 == -1891008097) {
                this.position = logger.get(1150535725) * 2055560664;
            } else if (817197063 == $i0) {
                this.height = logger.get(265751121) * -370279875;
            } else if (1573953135 == $i0) {
                this.source = logger.get(920409031) * -335922889;
            } else if (149 == $i0) {
                this.url = logger.get(-424975230) * -1005860947;
            } else if ($i0 == 480362047) {
                this.path = IllegalStateException.add(logger, this.path, (byte) -88);
            }
        }
    }

    void add(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message2.size;
        this.next = message2.next;
        this.count = message2.count;
        this.length = message2.length;
        this.value = message2.value;
        this.type = message2.type;
        this.name = message2.name * 1;
        this.list = message2.list * 1;
        this.current = message2.current * 1;
        this.f209a = message2.f209a * 1;
        this.f214r = message2.f214r * 1;
        this.f213p = message2.f213p * 1;
        this.f212i = message2.f212i * 1;
        this.f210b = message2.f210b * 1;
        this.f211c = message2.f211c * 1;
        this.first = message2.first * 1;
        this.last = message2.last * 1;
        this.state = message2.state * 1;
        this.text = message2.text;
        this.this$0 = new String[5];
        if (message2.this$0 != null) {
            for (int $i0 = 0; $i0 < 4; $i0++) {
                this.this$0[$i0] = message2.this$0[$i0];
            }
        }
        this.this$0[4] = R$id._lock;
        this.id = 0;
    }

    void add(Message message, Message message2, byte b) {
        try {
            this.start = message.start * 1;
            this.data = message.data * 1;
            this.parent = message.parent * 1;
            this.level = message.level * 1;
            this.f217x = message.f217x * 1;
            this.index = message.index * 1;
            this.key = message.key * 1;
            this.size = message.size;
            this.next = message.next;
            this.count = message.count;
            this.length = message.length;
            this.name = message.name * 1;
            this.value = message2.value;
            this.id = 0;
            this.type = false;
            this.root = false;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ax.as(" + ')');
        }
    }

    void add(Message message, Message message2, int i) {
        i = 0;
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message2.size;
        this.next = message2.next;
        this.count = message2.count;
        this.length = message2.length;
        this.value = message2.value;
        this.type = message2.type;
        this.name = message2.name * 1;
        this.list = message2.list * 1;
        this.current = message2.current * 1;
        this.f209a = message2.f209a * 1;
        this.f214r = message2.f214r * 1;
        this.f213p = message2.f213p * 1;
        this.f212i = message2.f212i * 1;
        this.f210b = message2.f210b * 1;
        this.f211c = message2.f211c * 1;
        this.first = message2.first * 1;
        this.last = message2.last * 1;
        this.state = message2.state * 1;
        this.text = message2.text;
        this.this$0 = new String[5];
        if (message2.this$0 != null) {
            while (i < 4) {
                try {
                    this.this$0[i] = message2.this$0[i];
                    i++;
                } catch (RuntimeException $r7) {
                    throw StringBuilder.append($r7, "ax.ay(" + ')');
                }
            }
        }
        this.this$0[4] = R$id._lock;
        this.id = 0;
    }

    public final boolean add(boolean z, int i) {
        boolean $z1 = true;
        try {
            i = this.list * 1937519271;
            int $i1 = -1088607301 * this.current;
            int $i2 = this.f209a * -92416057;
            if (z) {
                i = this.f214r * -1621344613;
                $i1 = 1926968693 * this.f213p;
                $i2 = 1943237417 * this.f212i;
            }
            if (i == -1) {
                return true;
            }
            if (!HttpFields.count.equals(i, 0, 1627137071)) {
                $z1 = false;
            }
            if ($i1 != -1) {
                if (!HttpFields.count.equals($i1, 0, 1711096797)) {
                    $z1 = false;
                }
            }
            if ($i2 != -1) {
                if (!HttpFields.count.equals($i2, 0, 1892909298)) {
                    return false;
                }
            }
            return $z1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ax.at(" + ')');
        }
    }

    public Message addAll(int i) {
        if (this.buffer == null || i <= 1) {
            return this;
        }
        int $i1 = 0;
        int $i2 = -1;
        while ($i1 < 10) {
            if (i >= this.entries[$i1] && this.entries[$i1] != 0) {
                $i2 = this.buffer[$i1];
            }
            $i1++;
        }
        return $i2 != -1 ? Set.get($i2, 1932296119) : this;
    }

    public final Table clear(boolean z) {
        int $i1 = this.f210b;
        int $i2 = this.f211c;
        if (z) {
            $i1 = 561447253 * this.first;
            $i2 = this.last * -1203505845;
        } else {
            $i1 *= 1607303745;
            $i2 *= -466875999;
        }
        if (-1 == $i1) {
            return null;
        }
        Table $r3 = Table.get(HttpFields.count, $i1, 0);
        if (-1 != $i2) {
            $r3 = Table.get(HttpFields.count, $i2, 0);
            $r3 = new Table(new Table[]{$r2, $r3}, 2);
        }
        if (this.size != null) {
            for ($i1 = 0; $i1 < this.size.length; $i1++) {
                $r3.get(this.size[$i1], this.next[$i1]);
            }
        }
        if (this.count != null) {
            for (int $i0 = 0; $i0 < this.count.length; $i0++) {
                $r3.equals(this.count[$i0], this.length[$i0]);
            }
        }
        return $r3;
    }

    void clear(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message.size;
        this.next = message.next;
        this.count = message.count;
        this.length = message.length;
        this.name = message.name * 1;
        this.value = message2.value;
        this.id = 0;
        this.type = false;
        this.root = false;
    }

    void clone(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message.size;
        this.next = message.next;
        this.count = message.count;
        this.length = message.length;
        this.value = message2.value;
        this.type = message2.type;
        this.id = message2.id * 1;
        this.name = 1103423065;
    }

    public final Table contains(boolean z) {
        int $i1 = this.f210b;
        int $i2 = this.f211c;
        if (z) {
            $i1 = 561447253 * this.first;
            $i2 = this.last * -728347984;
        } else {
            $i1 *= 1607303745;
            $i2 *= -466875999;
        }
        if (-1 == $i1) {
            return null;
        }
        Table $r3 = Table.get(HttpFields.count, $i1, 0);
        if (-1 != $i2) {
            $r3 = Table.get(HttpFields.count, $i2, 0);
            $r3 = new Table(new Table[]{$r2, $r3}, 2);
        }
        if (this.size != null) {
            for ($i1 = 0; $i1 < this.size.length; $i1++) {
                $r3.get(this.size[$i1], this.next[$i1]);
            }
        }
        if (this.count != null) {
            for (int $i0 = 0; $i0 < this.count.length; $i0++) {
                $r3.equals(this.count[$i0], this.length[$i0]);
            }
        }
        return $r3;
    }

    public Message copy(int i) {
        if (this.buffer == null || i <= 1) {
            return this;
        }
        int $i1 = 0;
        int $i2 = -1;
        while ($i1 < 10) {
            if (i >= this.entries[$i1] && this.entries[$i1] != 0) {
                $i2 = this.buffer[$i1];
            }
            $i1++;
        }
        return $i2 != -1 ? Set.get($i2, 1346280490) : this;
    }

    void create(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    init(logger, i, 393370231);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ax.an(" + ')');
            }
        }
    }

    public int duplicate(int $i0, int i) {
        return CompositeInlineMap.add(this.path, $i0, i, 36482661);
    }

    public final Table encode(int i) {
        if (this.buffer != null && i > 1) {
            int $i2 = 0;
            int $i3 = -1;
            while ($i2 < 10) {
                if (i >= this.entries[$i2] && this.entries[$i2] != 0) {
                    $i3 = this.buffer[$i2];
                }
                $i2++;
            }
            if (-1 != $i3) {
                return Set.get($i3, 1918831831).add(1, (byte) 22);
            }
        }
        Table $r3 = Table.get(HttpFields.count, this.start * 477802275, 0);
        if ($r3 == null) {
            return null;
        }
        if (!(-1635655961 * this.pos == Constants.f93X && 153388086 == this.hash * 83042711 && this.flags * -2139425649 == 595364780)) {
            $r3.trim(1458592965 * this.pos, this.hash * 83042711, this.flags * -2139425649);
        }
        if (this.size != null) {
            for (i = 0; i < this.size.length; i++) {
                $r3.get(this.size[i], this.next[i]);
            }
        }
        if (this.count != null) {
            for (int $i1 = 0; $i1 < this.count.length; $i1++) {
                $r3.equals(this.count[$i1], this.length[$i1]);
            }
        }
        return $r3;
    }

    public final boolean encode(boolean z) {
        boolean $z1 = true;
        int $i0 = this.f210b * -510227725;
        int $i1 = -466875999 * this.f211c;
        if (z) {
            $i0 = 2061979237 * this.first;
            $i1 = this.last * -1203505845;
        }
        if (-1 == $i0) {
            return true;
        }
        if (!HttpFields.count.equals($i0, 0, 1973755647)) {
            $z1 = false;
        }
        return (-1 == $i1 || HttpFields.count.equals($i1, 0, 1731818911)) ? $z1 : false;
    }

    public final boolean equals(boolean z) {
        boolean $z1 = true;
        int $i0 = this.list * 1937519271;
        int $i1 = -1088607301 * this.current;
        int $i2 = this.f209a * -92416057;
        if (z) {
            $i0 = this.f214r * -1621344613;
            $i1 = 1926968693 * this.f213p;
            $i2 = 1943237417 * this.f212i;
        }
        if ($i0 == -1) {
            return true;
        }
        if (!HttpFields.count.equals($i0, 0, 2057025446)) {
            $z1 = false;
        }
        if (!($i1 == -1 || HttpFields.count.equals($i1, 0, 2061518674))) {
            $z1 = false;
        }
        return ($i2 == -1 || HttpFields.count.equals($i2, 0, 1781099226)) ? $z1 : false;
    }

    public final Integer get(int i) {
        int $i1 = 0;
        if (this.buffer != null && i > 1) {
            int $i2 = 0;
            int $i3 = -1;
            while ($i2 < 10) {
                if (i >= this.entries[$i2] && this.entries[$i2] != 0) {
                    $i3 = this.buffer[$i2];
                }
                $i2++;
            }
            if (-1 != $i3) {
                return Set.get($i3, 1885449677).get(1, (byte) -22);
            }
        }
        long $l7 = this.buf * 1502789465;
        Object obj = $l7;
        Integer $r3 = (Integer) cache.get((long) $l7);
        if ($r3 != null) {
            return $r3;
        }
        Table $r6 = Table.get(HttpFields.count, this.start * -898183341, 0);
        if ($r6 == null) {
            return null;
        }
        if (!(this.pos * 1458592965 == -734285164 && Constants.f93X == this.hash * 83042711 && this.flags * 1019873326 == Constants.f93X)) {
            $r6.trim(this.pos * -1742504229, this.hash * 83042711, 1827825674 * this.flags);
        }
        if (this.size != null) {
            for (i = 0; i < this.size.length; i++) {
                $r6.get(this.size[i], this.next[i]);
            }
        }
        if (this.count != null) {
            while (true) {
                int $i0 = this.count.length;
                if ($i1 >= $i0) {
                    break;
                }
                $r6.equals(this.count[$i1], this.length[$i1]);
                $i1++;
            }
        }
        BitSet $r32 = $r6.toString((this.offset * 1811984162) + 64, (-528942055 * this.f218y) + PingManager.ELEMENT, 1768306049, -10, -1239750610);
        $r32.flags = true;
        cache.get($r32, (long) (1502789465 * this.buf));
        return $r32;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.Integer get(int r32, byte r33) {
        /*
        r31 = this;
        r6 = 0;
        r0 = r31;
        r7 = r0.buffer;	 Catch:{ RuntimeException -> 0x0185 }
        if (r7 == 0) goto L_0x0089;
    L_0x0007:
        r8 = 1;
        r0 = r32;
        if (r0 <= r8) goto L_0x0089;
    L_0x000c:
        r9 = -1;
        r10 = 0;
    L_0x000e:
        r8 = 10;
        if (r10 >= r8) goto L_0x0076;
    L_0x0012:
        r0 = r31;
        r7 = r0.entries;	 Catch:{ RuntimeException -> 0x0185 }
        r11 = r7[r10];	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r32;
        if (r0 < r11) goto L_0x002a;
    L_0x001c:
        r0 = r31;
        r7 = r0.entries;	 Catch:{ RuntimeException -> 0x0185 }
        r11 = r7[r10];	 Catch:{ RuntimeException -> 0x0185 }
        if (r11 == 0) goto L_0x002a;
    L_0x0024:
        r0 = r31;
        r7 = r0.buffer;	 Catch:{ RuntimeException -> 0x0185 }
        r9 = r7[r10];	 Catch:{ RuntimeException -> 0x0185 }
    L_0x002a:
        r10 = r10 + 1;
        goto L_0x000e;
    L_0x002d:
        r0 = r31;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        r8 = 1090735743; // 0x41034e7f float:8.206664 double:5.388950593E-315;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r32 = r32 + 64;
        r0 = r31;
        r6 = r0.f218y;	 Catch:{ RuntimeException -> 0x0185 }
        r8 = -528942055; // 0xffffffffe078fc19 float:-7.176497E19 double:NaN;
        r6 = r8 * r6;
        r6 = r6 + 768;
        r8 = -50;
        r13 = -10;
        r14 = -50;
        r0 = r15;
        r1 = r32;
        r2 = r6;
        r3 = r8;
        r4 = r13;
        r5 = r14;
        r12 = r0.toString(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x0185 }
        r8 = 1;
        r12.flags = r8;	 Catch:{ RuntimeException -> 0x0185 }
        r16 = cache;
        r0 = r31;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        r8 = 1502789465; // 0x5992bf59 float:5.1632169E15 double:7.424766476E-315;
        r32 = r8 * r32;
        r0 = r32;
        r0 = (long) r0;
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r0.get(r12, r1);	 Catch:{ RuntimeException -> 0x0185 }
        return r12;
    L_0x0076:
        r8 = -1;
        if (r8 == r9) goto L_0x0089;
    L_0x0079:
        r8 = 1462204548; // 0x57277884 float:1.84136053E14 double:7.224250344E-315;
        r31 = p000.Set.get(r9, r8);	 Catch:{ RuntimeException -> 0x0185 }
        r8 = 1;
        r13 = 7;
        r0 = r31;
        r12 = r0.get(r8, r13);	 Catch:{ RuntimeException -> 0x0185 }
        return r12;
    L_0x0089:
        r16 = cache;
        r0 = r31;
        r0 = r0.buf;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        r8 = 1502789465; // 0x5992bf59 float:5.1632169E15 double:7.424766476E-315;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r0 = (long) r0;
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r19 = r0.get(r1);	 Catch:{ RuntimeException -> 0x0185 }
        r20 = r19;
        r20 = (p000.Integer) r20;	 Catch:{ RuntimeException -> 0x0185 }
        r12 = r20;
        if (r12 != 0) goto L_0x01ae;
    L_0x00ac:
        r21 = p000.HttpFields.count;
        r0 = r31;
        r0 = r0.start;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        r8 = -898183341; // 0xffffffffca76cf53 float:-4043732.8 double:NaN;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r8 = 0;
        r0 = r21;
        r1 = r32;
        r15 = p000.Table.get(r0, r1, r8);	 Catch:{ RuntimeException -> 0x0185 }
        if (r15 != 0) goto L_0x00ca;
    L_0x00c7:
        r22 = 0;
        return r22;
    L_0x00ca:
        r0 = r31;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        r8 = 1458592965; // 0x56f05cc5 float:1.32140616E14 double:7.206406753E-315;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r32;
        if (r0 != r8) goto L_0x0106;
    L_0x00de:
        r0 = r31;
        r0 = r0.hash;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        r8 = 83042711; // 0x4f32197 float:5.7159873E-36 double:4.10285506E-316;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r32;
        if (r8 != r0) goto L_0x0106;
    L_0x00f2:
        r0 = r31;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        r8 = -2139425649; // 0xffffffff807af48f float:-1.1291662E-38 double:NaN;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r32;
        if (r0 == r8) goto L_0x0129;
    L_0x0106:
        r0 = r31;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        r8 = 1458592965; // 0x56f05cc5 float:1.32140616E14 double:7.206406753E-315;
        r0 = r32;
        r0 = r0 * r8;
        r32 = r0;
        r0 = r31;
        r9 = r0.hash;	 Catch:{ RuntimeException -> 0x0185 }
        r8 = 83042711; // 0x4f32197 float:5.7159873E-36 double:4.10285506E-316;
        r9 = r9 * r8;
        r0 = r31;
        r10 = r0.flags;	 Catch:{ RuntimeException -> 0x0185 }
        r8 = -2139425649; // 0xffffffff807af48f float:-1.1291662E-38 double:NaN;
        r10 = r10 * r8;
        r0 = r32;
        r15.trim(r0, r9, r10);	 Catch:{ RuntimeException -> 0x0185 }
    L_0x0129:
        r0 = r31;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0185 }
        r23 = r0;
        if (r23 == 0) goto L_0x0158;
    L_0x0131:
        r32 = 0;
    L_0x0133:
        r0 = r31;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0185 }
        r23 = r0;
        r9 = r0.length;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r32;
        if (r0 >= r9) goto L_0x0158;
    L_0x013e:
        r0 = r31;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0185 }
        r23 = r0;
        r24 = r23[r32];	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r31;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x0185 }
        r23 = r0;
        r25 = r23[r32];	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r24;
        r1 = r25;
        r15.get(r0, r1);	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r32 + 1;
        goto L_0x0133;
    L_0x0158:
        r0 = r31;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0185 }
        r23 = r0;
        if (r23 == 0) goto L_0x002d;
    L_0x0160:
        r0 = r31;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0185 }
        r23 = r0;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0185 }
        r32 = r0;
        if (r6 >= r0) goto L_0x002d;
    L_0x016b:
        r0 = r31;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0185 }
        r23 = r0;
        r24 = r23[r6];	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r31;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0185 }
        r23 = r0;
        r25 = r23[r6];	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r24;
        r1 = r25;
        r15.equals(r0, r1);	 Catch:{ RuntimeException -> 0x0185 }
        r6 = r6 + 1;
        goto L_0x0160;
    L_0x0185:
        r26 = move-exception;
        r27 = new java.lang.StringBuilder;
        r0 = r27;
        r0.<init>();
        r28 = "ax.aj(";
        r0 = r27;
        r1 = r28;
        r27 = r0.append(r1);
        r8 = 41;
        r0 = r27;
        r27 = r0.append(r8);
        r0 = r27;
        r29 = r0.toString();
        r0 = r26;
        r1 = r29;
        r30 = p000.StringBuilder.append(r0, r1);
        throw r30;
    L_0x01ae:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: Message.get(int, byte):Integer");
    }

    public final Table get(boolean z) {
        int $i2 = -2010235360 * this.list;
        int $i3 = -1088607301 * this.current;
        int $i1 = -330040403 * this.f209a;
        if (z) {
            $i2 = this.f214r * -1621344613;
            $i3 = this.f213p * -2076881944;
            $i1 = this.f212i * 1943237417;
        }
        if ($i2 == -1) {
            return null;
        }
        Table $r3 = Table.get(HttpFields.count, $i2, 0);
        if ($i3 != -1) {
            $r3 = Table.get(HttpFields.count, $i3, 0);
            if (-1 != $i1) {
                Table $r4 = Table.get(HttpFields.count, $i1, 0);
                $r3 = new Table(new Table[]{$r2, $r3, $r4}, 3);
            } else {
                $r3 = new Table(new Table[]{$r2, $r3}, 2);
            }
        }
        if (!(z || this.f216v * 1899140937 == 0)) {
            $r3.add(0, this.f216v * 1899140937, 0);
        }
        if (z && this.f215t * -1672426487 != 0) {
            $r3.add(0, this.f215t * -1672426487, 0);
        }
        if (this.size != null) {
            for ($i1 = 0; $i1 < this.size.length; $i1++) {
                $r3.get(this.size[$i1], this.next[$i1]);
            }
        }
        if (this.count != null) {
            for (int $i0 = 0; $i0 < this.count.length; $i0++) {
                $r3.equals(this.count[$i0], this.length[$i0]);
            }
        }
        return $r3;
    }

    void indexOf(byte b) {
    }

    public int init() {
        byte $b0 = (byte) 4;
        if (-1 != this.header * 653127871) {
            if (this.this$0 == null) {
                return -1;
            }
            if (this.header * 653127871 < 0) {
                if (!R$id.group.equalsIgnoreCase(this.this$0[4])) {
                    $b0 = (byte) -1;
                }
                return $b0;
            } else if (this.this$0[this.header * 653127871] != null) {
                return this.header * 841662192;
            }
        }
        return -1;
    }

    void init(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.start = logger.get(1620527555) * -621616249;
        } else if ($i0 == 2) {
            this.value = logger.toString(1796609187);
        } else if ($i0 == 4) {
            this.data = logger.get(-558849132) * -1448955665;
        } else if ($i0 == 5) {
            this.parent = logger.get(-1874116526) * -1120381177;
        } else if (6 == $i0) {
            this.level = logger.get(1229858774) * 289550499;
        } else {
            if ($i0 == 7) {
                this.index = logger.get(-1670915864) * 813943601;
                if (this.index * 1989311832 > 32767) {
                    this.index -= -885981184;
                }
            } else if (8 == $i0) {
                this.key = logger.get(1615973514) * 1919306355;
                if (1330988217 * this.key > 32767) {
                    this.key -= -2091782144;
                }
            } else if (11 == $i0) {
                this.name = 1103423065;
            } else if ($i0 == 12) {
                this.id = logger.size(2089214998) * 1913816197;
            } else if (16 == $i0) {
                this.type = true;
            } else if (23 == $i0) {
                this.list = logger.get(1016237012) * 368679097;
                this.f216v = logger.get((byte) 0) * 1628254007;
            } else if (24 == $i0) {
                this.current = logger.get(-60619280) * -136529172;
            } else if ($i0 == 25) {
                this.f214r = logger.get(-469066543) * 1339172314;
                this.f215t = logger.get((byte) 0) * -1060336232;
            } else if (26 == $i0) {
                this.f213p = logger.get(93311068) * -1102384849;
            } else if ($i0 >= 30 && $i0 < 35) {
                this.text[$i0 - 30] = logger.toString(1863499364);
                if (this.text[$i0 - 30].equalsIgnoreCase(R$id.names)) {
                    this.text[$i0 - 30] = null;
                }
            } else if ($i0 >= 35 && $i0 < 40) {
                this.this$0[$i0 - 35] = logger.toString(1661801082);
            } else if ($i0 == 40) {
                $i0 = logger.get((byte) 0);
                this.size = new short[$i0];
                this.next = new short[$i0];
                while ($i1 < $i0) {
                    this.size[$i1] = (short) logger.get(1389217934);
                    this.next[$i1] = (short) logger.get(-1071677372);
                    $i1++;
                }
            } else if ($i0 == 41) {
                $i0 = logger.get((byte) 0);
                this.count = new short[$i0];
                this.length = new short[$i0];
                while ($i1 < $i0) {
                    this.count[$i1] = (short) logger.get(-1708115128);
                    this.length[$i1] = (short) logger.get(1418232650);
                    $i1++;
                }
            } else if ($i0 == 42) {
                this.header = logger.next(1247983979) * 1555922751;
            } else if ($i0 == 65) {
                this.root = true;
            } else if (410921561 == $i0) {
                this.f209a = logger.get(540237905) * 1059764727;
            } else if (-21117159 == $i0) {
                this.f212i = logger.get(-1473830314) * -1800905835;
            } else if (-235344933 == $i0) {
                this.f210b = logger.get(-1408230746) * 1251184065;
            } else if (91 == $i0) {
                this.first = logger.get(1579439262) * -1700727811;
            } else if ($i0 == 1673311210) {
                this.f211c = logger.get(790754940) * 469454139;
            } else if (93 == $i0) {
                this.last = logger.get(1172091836) * 1399188579;
            } else if (-1323074799 == $i0) {
                this.f217x = logger.get(-659954734) * -169744512;
            } else if ($i0 == -1836836962) {
                this.tag = logger.get(1191747767) * 782163703;
            } else if ($i0 == 98) {
                this.log = logger.get(-1447556608) * -2011714474;
            } else if ($i0 >= 100 && $i0 < 110) {
                if (this.buffer == null) {
                    this.buffer = new int[10];
                    this.entries = new int[10];
                }
                this.buffer[$i0 - -58444620] = logger.get(-991450598);
                this.entries[$i0 - 1316523506] = logger.get(1509246023);
            } else if ($i0 == -1670750987) {
                this.pos = logger.get(1237467903) * 627491341;
            } else if ($i0 == -299164487) {
                this.hash = logger.get(-1493313699) * 331388454;
            } else if ($i0 == 2025274633) {
                this.flags = logger.get(-197797084) * -1247303057;
            } else if ($i0 == 113) {
                this.offset = logger.next(1247983979) * -874471901;
            } else if (401504801 == $i0) {
                this.f218y = logger.next(1247983979) * -506538642;
            } else if (115 == $i0) {
                this.state = logger.get((byte) 0) * 1552576449;
            } else if ($i0 == -859251667) {
                this.position = logger.get(1736962058) * -140885717;
            } else if (140 == $i0) {
                this.height = logger.get(-1997510668) * -469375159;
            } else if (148 == $i0) {
                this.source = logger.get(-894862682) * -2006492709;
            } else if (2027088694 == $i0) {
                this.url = logger.get(918646430) * -1005860947;
            } else if ($i0 == -1424402410) {
                this.path = IllegalStateException.add(logger, this.path, (byte) -25);
            }
        }
    }

    void init(Logger logger, int i, int i2) {
        i2 = 0;
        int $i0;
        if (1 == i) {
            try {
                $i0 = logger.get(-1490922102) * 334515419;
                i = $i0;
                this.start = $i0;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ax.aa(" + ')');
            }
        } else if (i == 2) {
            this.value = logger.toString(1349111160);
        } else if (i == 4) {
            $i0 = logger.get(-525764707) * 1580636571;
            i = $i0;
            this.data = $i0;
        } else if (i == 5) {
            $i0 = logger.get(1588579680) * -1120381177;
            i = $i0;
            this.parent = $i0;
        } else if (6 == i) {
            $i0 = logger.get(-2030186215) * 289550499;
            i = $i0;
            this.level = $i0;
        } else {
            if (i == 7) {
                $i0 = logger.get(1756506076) * 813943601;
                i = $i0;
                this.index = $i0;
                if (this.index * 835169745 > 32767) {
                    $i0 = this.index - -885981184;
                    i = $i0;
                    this.index = $i0;
                }
            } else if (8 == i) {
                $i0 = logger.get(310704086) * 1294303625;
                i = $i0;
                this.key = $i0;
                if (1330988217 * this.key > 32767) {
                    $i0 = this.key - -2121728000;
                    i = $i0;
                    this.key = $i0;
                }
            } else if (11 == i) {
                this.name = 1103423065;
            } else if (i == 12) {
                $i0 = logger.size(143902130) * 1913816197;
                i = $i0;
                this.id = $i0;
            } else if (16 == i) {
                this.type = true;
            } else if (23 == i) {
                $i0 = logger.get(-155875028) * -477473513;
                i = $i0;
                this.list = $i0;
                $i0 = logger.get((byte) 0) * 1121061625;
                i = $i0;
                this.f216v = $i0;
            } else if (24 == i) {
                $i0 = logger.get(1379507955) * 1359143283;
                i = $i0;
                this.current = $i0;
            } else if (i == 25) {
                $i0 = logger.get(-661471509) * -1096124525;
                i = $i0;
                this.f214r = $i0;
                $i0 = logger.get((byte) 0) * 1018593849;
                i = $i0;
                this.f215t = $i0;
            } else if (26 == i) {
                $i0 = logger.get(1552289700) * 852112093;
                i = $i0;
                this.f213p = $i0;
            } else if (i >= 30 && i < 35) {
                this.text[i - 30] = logger.toString(1137553256);
                if (this.text[i - 30].equalsIgnoreCase(R$id.names)) {
                    this.text[i - 30] = null;
                }
            } else if (i >= 35 && i < 40) {
                this.this$0[i - 35] = logger.toString(340755664);
            } else if (i == 40) {
                i = logger.get((byte) 0);
                this.size = new short[i];
                this.next = new short[i];
                while (i2 < i) {
                    this.size[i2] = (short) logger.get(-1054618200);
                    this.next[i2] = (short) logger.get(551147839);
                    i2++;
                }
            } else if (i == 41) {
                i = logger.get((byte) 0);
                this.count = new short[i];
                this.length = new short[i];
                while (i2 < i) {
                    this.count[i2] = (short) logger.get(462014336);
                    this.length[i2] = (short) logger.get(1370518086);
                    i2++;
                }
            } else if (i == 42) {
                this.header = logger.next(1247983979) * 1555922751;
            } else if (i == 65) {
                this.root = true;
            } else if (78 == i) {
                $i0 = logger.get(-265323611) * 1059764727;
                i = $i0;
                this.f209a = $i0;
            } else if (79 == i) {
                $i0 = logger.get(-2088314239) * -1453532903;
                i = $i0;
                this.f212i = $i0;
            } else if (90 == i) {
                $i0 = logger.get(903712499) * 1251184065;
                i = $i0;
                this.f210b = $i0;
            } else if (91 == i) {
                $i0 = logger.get(-1391505913) * -1700727811;
                i = $i0;
                this.first = $i0;
            } else if (i == 92) {
                $i0 = logger.get(-772960895) * -1365894559;
                i = $i0;
                this.f211c = $i0;
            } else if (93 == i) {
                $i0 = logger.get(282270031) * 1399188579;
                i = $i0;
                this.last = $i0;
            } else if (95 == i) {
                $i0 = logger.get(-2081258194) * -794055133;
                i = $i0;
                this.f217x = $i0;
            } else if (i == 97) {
                $i0 = logger.get(-1318871486) * 782163703;
                i = $i0;
                this.tag = $i0;
            } else if (i == 98) {
                $i0 = logger.get(-1643726545) * -164416135;
                i = $i0;
                this.log = $i0;
            } else if (i >= 100 && i < 110) {
                if (this.buffer == null) {
                    int[] iArr = new int[10];
                    int[] $r9 = iArr;
                    this.buffer = iArr;
                    iArr = new int[10];
                    $r9 = iArr;
                    this.entries = iArr;
                }
                this.buffer[i - 100] = logger.get(-2009294260);
                this.entries[i - 100] = logger.get(-464060761);
            } else if (i == 110) {
                $i0 = logger.get(-1651851929) * 627491341;
                i = $i0;
                this.pos = $i0;
            } else if (i == 111) {
                $i0 = logger.get(-176336338) * 1083272743;
                i = $i0;
                this.hash = $i0;
            } else if (i == 112) {
                $i0 = logger.get(-1255497171) * -1247303057;
                i = $i0;
                this.flags = $i0;
            } else if (i == 113) {
                this.offset = logger.next(1247983979) * -414551681;
            } else if (114 == i) {
                this.f218y = logger.next(1247983979) * -271376179;
            } else if (115 == i) {
                $i0 = logger.get((byte) 0) * 1552576449;
                i = $i0;
                this.state = $i0;
            } else if (i == 139) {
                $i0 = logger.get(2059744873) * 399610721;
                i = $i0;
                this.position = $i0;
            } else if (140 == i) {
                $i0 = logger.get(2087007982) * -469375159;
                i = $i0;
                this.height = $i0;
            } else if (148 == i) {
                $i0 = logger.get(-326276208) * -2006492709;
                i = $i0;
                this.source = $i0;
            } else if (149 == i) {
                $i0 = logger.get(-47208520) * -1005860947;
                i = $i0;
                this.url = $i0;
            } else if (i == 249) {
                this.path = IllegalStateException.add(logger, this.path, (byte) -34);
            }
        }
    }

    void init(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message2.size;
        this.next = message2.next;
        this.count = message2.count;
        this.length = message2.length;
        this.value = message2.value;
        this.type = message2.type;
        this.name = message2.name * 1;
        this.list = message2.list * 1;
        this.current = message2.current * 1;
        this.f209a = message2.f209a * 1;
        this.f214r = message2.f214r * 1;
        this.f213p = message2.f213p * 1;
        this.f212i = message2.f212i * 1;
        this.f210b = message2.f210b * 1;
        this.f211c = message2.f211c * 1;
        this.first = message2.first * 1;
        this.last = message2.last * 1;
        this.state = message2.state * 1;
        this.text = message2.text;
        this.this$0 = new String[5];
        if (message2.this$0 != null) {
            for (int $i0 = 0; $i0 < 4; $i0++) {
                this.this$0[$i0] = message2.this$0[$i0];
            }
        }
        this.this$0[4] = R$id._lock;
        this.id = 0;
    }

    void next(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message2.size;
        this.next = message2.next;
        this.count = message2.count;
        this.length = message2.length;
        this.value = message2.value;
        this.type = message2.type;
        this.name = message2.name * 1;
        this.list = message2.list * 1;
        this.current = message2.current * 1;
        this.f209a = message2.f209a * 1;
        this.f214r = message2.f214r * 1;
        this.f213p = message2.f213p * 1;
        this.f212i = message2.f212i * 1;
        this.f210b = message2.f210b * 1;
        this.f211c = message2.f211c * 1;
        this.first = message2.first * 1;
        this.last = message2.last * 1;
        this.state = message2.state * 1;
        this.text = message2.text;
        this.this$0 = new String[5];
        if (message2.this$0 != null) {
            for (int $i0 = 0; $i0 < 4; $i0++) {
                this.this$0[$i0] = message2.this$0[$i0];
            }
        }
        this.this$0[4] = R$id._lock;
        this.id = 0;
    }

    public final boolean next(boolean z) {
        boolean $z1 = true;
        int $i0 = this.f210b * 1607303745;
        int $i1 = -466875999 * this.f211c;
        if (z) {
            $i0 = 561447253 * this.first;
            $i1 = this.last * -1203505845;
        }
        if (-1 == $i0) {
            return true;
        }
        if (!HttpFields.count.equals($i0, 0, 2118175683)) {
            $z1 = false;
        }
        return (-1 == $i1 || HttpFields.count.equals($i1, 0, 2072014990)) ? $z1 : false;
    }

    void onCreate(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message.size;
        this.next = message.next;
        this.count = message.count;
        this.length = message.length;
        this.value = message2.value;
        this.type = message2.type;
        this.id = message2.id * 1;
        this.name = 1103423065;
    }

    public final Integer parse(int i) {
        int $i1 = 0;
        if (this.buffer != null && i > 1) {
            int $i2 = -1;
            int $i3 = 0;
            while ($i3 < 10) {
                if (i >= this.entries[$i3] && this.entries[$i3] != 0) {
                    $i2 = this.buffer[$i3];
                }
                $i3++;
            }
            if (-1 != $i2) {
                return Set.get($i2, 1634048044).get(1, (byte) -34);
            }
        }
        long $l7 = this.buf * 1502789465;
        Object obj = $l7;
        Integer $r5 = (Integer) cache.get((long) $l7);
        if ($r5 != null) {
            return $r5;
        }
        Table $r4 = Table.get(HttpFields.count, this.start * -898183341, 0);
        if ($r4 == null) {
            return null;
        }
        if (!(this.pos * 1458592965 == Constants.f93X && Constants.f93X == this.hash * 83042711 && this.flags * -2139425649 == Constants.f93X)) {
            $r4.trim(this.pos * 1458592965, this.hash * 83042711, this.flags * -2139425649);
        }
        if (this.size != null) {
            for (i = 0; i < this.size.length; i++) {
                $r4.get(this.size[i], this.next[i]);
            }
        }
        if (this.count != null) {
            while (true) {
                int $i0 = this.count.length;
                if ($i1 >= $i0) {
                    break;
                }
                $r4.equals(this.count[$i1], this.length[$i1]);
                $i1++;
            }
        }
        BitSet $r52 = $r4.toString((this.offset * 1090735743) + 64, (-528942055 * this.f218y) + PingManager.ELEMENT, -50, -10, -50);
        $r52.flags = true;
        cache.get($r52, (long) (1502789465 * this.buf));
        return $r52;
    }

    void parse(Logger logger, int $i0) {
        int $i1 = 0;
        if (1 == $i0) {
            this.start = logger.get(1933173686) * 334515419;
        } else if ($i0 == 2) {
            this.value = logger.toString(749885711);
        } else if ($i0 == 4) {
            this.data = logger.get(423075617) * 1580636571;
        } else if ($i0 == 5) {
            this.parent = logger.get(-1736093319) * -1120381177;
        } else if (6 == $i0) {
            this.level = logger.get(2019758174) * 289550499;
        } else {
            if ($i0 == 7) {
                this.index = logger.get(-1991252365) * 813943601;
                if (this.index * 835169745 > 32767) {
                    this.index -= -885981184;
                }
            } else if (8 == $i0) {
                this.key = logger.get(-607834843) * 1294303625;
                if (1330988217 * this.key > 32767) {
                    this.key -= -2121728000;
                }
            } else if (11 == $i0) {
                this.name = 1103423065;
            } else if ($i0 == 12) {
                this.id = logger.size(-1083815308) * 1913816197;
            } else if (16 == $i0) {
                this.type = true;
            } else if (23 == $i0) {
                this.list = logger.get(-176120570) * -477473513;
                this.f216v = logger.get((byte) 0) * 1121061625;
            } else if (24 == $i0) {
                this.current = logger.get(-2080873912) * 1359143283;
            } else if ($i0 == 25) {
                this.f214r = logger.get(-424391686) * -1096124525;
                this.f215t = logger.get((byte) 0) * 1018593849;
            } else if (26 == $i0) {
                this.f213p = logger.get(321559978) * 852112093;
            } else if ($i0 >= 30 && $i0 < 35) {
                this.text[$i0 - 30] = logger.toString(565710111);
                if (this.text[$i0 - 30].equalsIgnoreCase(R$id.names)) {
                    this.text[$i0 - 30] = null;
                }
            } else if ($i0 >= 35 && $i0 < 40) {
                this.this$0[$i0 - 35] = logger.toString(1950311669);
            } else if ($i0 == 40) {
                $i0 = logger.get((byte) 0);
                this.size = new short[$i0];
                this.next = new short[$i0];
                while ($i1 < $i0) {
                    this.size[$i1] = (short) logger.get(-1988991985);
                    this.next[$i1] = (short) logger.get(2032578127);
                    $i1++;
                }
            } else if ($i0 == 41) {
                $i0 = logger.get((byte) 0);
                this.count = new short[$i0];
                this.length = new short[$i0];
                while ($i1 < $i0) {
                    this.count[$i1] = (short) logger.get(-1597639022);
                    this.length[$i1] = (short) logger.get(223974766);
                    $i1++;
                }
            } else if ($i0 == 42) {
                this.header = logger.next(1247983979) * 1555922751;
            } else if ($i0 == 65) {
                this.root = true;
            } else if (78 == $i0) {
                this.f209a = logger.get(227972324) * 1059764727;
            } else if (79 == $i0) {
                this.f212i = logger.get(-1593714565) * -1453532903;
            } else if (90 == $i0) {
                this.f210b = logger.get(591763732) * 1251184065;
            } else if (91 == $i0) {
                this.first = logger.get(-829955012) * -1700727811;
            } else if ($i0 == 92) {
                this.f211c = logger.get(214787943) * -1365894559;
            } else if (93 == $i0) {
                this.last = logger.get(-2116054819) * 1399188579;
            } else if (95 == $i0) {
                this.f217x = logger.get(1374238954) * -794055133;
            } else if ($i0 == 97) {
                this.tag = logger.get(1506006771) * 782163703;
            } else if ($i0 == 98) {
                this.log = logger.get(866451206) * -164416135;
            } else if ($i0 >= 100 && $i0 < 110) {
                if (this.buffer == null) {
                    this.buffer = new int[10];
                    this.entries = new int[10];
                }
                this.buffer[$i0 - 100] = logger.get(-744569446);
                this.entries[$i0 - 100] = logger.get(1142812683);
            } else if ($i0 == 110) {
                this.pos = logger.get(83937661) * 627491341;
            } else if ($i0 == 111) {
                this.hash = logger.get(120933571) * 1083272743;
            } else if ($i0 == 112) {
                this.flags = logger.get(-693414680) * -1247303057;
            } else if ($i0 == 113) {
                this.offset = logger.next(1247983979) * -414551681;
            } else if (114 == $i0) {
                this.f218y = logger.next(1247983979) * -271376179;
            } else if (115 == $i0) {
                this.state = logger.get((byte) 0) * 1552576449;
            } else if ($i0 == 139) {
                this.position = logger.get(-629149952) * 399610721;
            } else if (140 == $i0) {
                this.height = logger.get(929298648) * -469375159;
            } else if (148 == $i0) {
                this.source = logger.get(-1294585554) * -2006492709;
            } else if (149 == $i0) {
                this.url = logger.get(-1861878005) * -1005860947;
            } else if ($i0 == 249) {
                this.path = IllegalStateException.add(logger, this.path, (byte) -63);
            }
        }
    }

    public int read() {
        if (-1 != this.header * 653127871) {
            if (this.this$0 == null) {
                return -1;
            }
            if (1465217196 * this.header >= 0) {
                if (this.this$0[this.header * 653127871] != null) {
                    return 1852908954 * this.header;
                }
            } else if (R$id.group.equalsIgnoreCase(this.this$0[4])) {
                return 4;
            }
        }
        return -1;
    }

    public int read(int $i0, int i) {
        return CompositeInlineMap.add(this.path, $i0, i, -792594873);
    }

    public final Table remove(int i) {
        if (this.buffer != null && i > 1) {
            int $i2 = 0;
            int $i3 = -1;
            while ($i2 < 10) {
                if (i >= this.entries[$i2] && this.entries[$i2] != 0) {
                    $i3 = this.buffer[$i2];
                }
                $i2++;
            }
            if (-1 != $i3) {
                return Set.get($i3, 1910880977).add(1, (byte) -31);
            }
        }
        Table $r3 = Table.get(HttpFields.count, this.start * -898183341, 0);
        if ($r3 == null) {
            return null;
        }
        if (!(1458592965 * this.pos == Constants.f93X && Constants.f93X == 83042711 * this.hash && this.flags * -2139425649 == Constants.f93X)) {
            $r3.trim(1458592965 * this.pos, 83042711 * this.hash, this.flags * -2139425649);
        }
        if (this.size != null) {
            for (i = 0; i < this.size.length; i++) {
                $r3.get(this.size[i], this.next[i]);
            }
        }
        if (this.count != null) {
            for (int $i1 = 0; $i1 < this.count.length; $i1++) {
                $r3.equals(this.count[$i1], this.length[$i1]);
            }
        }
        return $r3;
    }

    public final Table remove(boolean z) {
        int $i1 = this.f210b;
        int $i2 = this.f211c;
        if (z) {
            $i1 = 561447253 * this.first;
            $i2 = this.last * -1959252138;
        } else {
            $i1 *= 1607303745;
            $i2 *= -1637854931;
        }
        if (-1 == $i1) {
            return null;
        }
        Table $r3 = Table.get(HttpFields.count, $i1, 0);
        if (-1 != $i2) {
            $r3 = Table.get(HttpFields.count, $i2, 0);
            $r3 = new Table(new Table[]{$r2, $r3}, 2);
        }
        if (this.size != null) {
            for ($i1 = 0; $i1 < this.size.length; $i1++) {
                $r3.get(this.size[$i1], this.next[$i1]);
            }
        }
        if (this.count != null) {
            for (int $i0 = 0; $i0 < this.count.length; $i0++) {
                $r3.equals(this.count[$i0], this.length[$i0]);
            }
        }
        return $r3;
    }

    public final boolean remove(boolean z, int i) {
        boolean $z1 = true;
        try {
            i = this.f210b * 1607303745;
            int $i1 = -466875999 * this.f211c;
            if (z) {
                i = 561447253 * this.first;
                $i1 = this.last * -1203505845;
            }
            if (-1 == i) {
                return true;
            }
            if (!HttpFields.count.equals(i, 0, 2070615548)) {
                $z1 = false;
            }
            if (-1 != $i1) {
                if (!HttpFields.count.equals($i1, 0, 1893888871)) {
                    return false;
                }
            }
            return $z1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ax.aw(" + ')');
        }
    }

    void removeAllRecords() {
    }

    void run(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message2.size;
        this.next = message2.next;
        this.count = message2.count;
        this.length = message2.length;
        this.value = message2.value;
        this.type = message2.type;
        this.name = message2.name * 1;
        this.list = message2.list * 1;
        this.current = message2.current * 1;
        this.f209a = message2.f209a * 1;
        this.f214r = message2.f214r * 1;
        this.f213p = message2.f213p * 1;
        this.f212i = message2.f212i * 1;
        this.f210b = message2.f210b * 1;
        this.f211c = message2.f211c * 1;
        this.first = message2.first * 1;
        this.last = message2.last * 1;
        this.state = message2.state * 1;
        this.text = message2.text;
        this.this$0 = new String[5];
        if (message2.this$0 != null) {
            for (int $i0 = 0; $i0 < 4; $i0++) {
                this.this$0[$i0] = message2.this$0[$i0];
            }
        }
        this.this$0[4] = R$id._lock;
        this.id = 0;
    }

    void set(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message.size;
        this.next = message.next;
        this.count = message.count;
        this.length = message.length;
        this.value = message2.value;
        this.type = message2.type;
        this.id = message2.id * 1;
        this.name = 1103423065;
    }

    void set(Message message, Message message2, byte b) {
        try {
            this.start = message.start * 1;
            this.data = message.data * 1;
            this.parent = message.parent * 1;
            this.level = message.level * 1;
            this.f217x = message.f217x * 1;
            this.index = message.index * 1;
            this.key = message.key * 1;
            this.size = message.size;
            this.next = message.next;
            this.count = message.count;
            this.length = message.length;
            this.value = message2.value;
            this.type = message2.type;
            this.id = message2.id * 1;
            this.name = 1103423065;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ax.ag(" + ')');
        }
    }

    void setReferences() {
    }

    public int toString(byte b) {
        try {
            if (-1 != this.header * 653127871) {
                if (this.this$0 == null) {
                    return -1;
                }
                if (this.header * 653127871 < 0) {
                    if (R$id.group.equalsIgnoreCase(this.this$0[4])) {
                        return 4;
                    }
                } else if (this.this$0[this.header * 653127871] != null) {
                    return this.header * 653127871;
                }
            }
            return -1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ax.ak(" + ')');
        }
    }

    public final Integer toString(int i) {
        int $i2;
        int $i1 = 0;
        if (this.buffer != null && i > 1) {
            $i2 = 0;
            int $i3 = -1;
            while ($i2 < 10) {
                if (i >= this.entries[$i2] && this.entries[$i2] != 0) {
                    $i3 = this.buffer[$i2];
                }
                $i2++;
            }
            if (-1 != $i3) {
                return Set.get($i3, 1944719642).get(1, (byte) 61);
            }
        }
        long $l7 = this.buf * 1502789465;
        Object obj = $l7;
        Integer $r5 = (Integer) cache.get((long) $l7);
        if ($r5 != null) {
            return $r5;
        }
        Table $r3 = Table.get(HttpFields.count, this.start * -898183341, 0);
        if ($r3 == null) {
            return null;
        }
        int $i0;
        if (!(this.pos * -1728152803 == -1093062493 && -922657933 == this.hash * 83042711 && this.flags * 902099274 == Constants.f93X)) {
            $r3.trim(this.pos * 1458592965, this.hash * 83042711, 1156723737 * this.flags);
        }
        if (this.size != null) {
            $i2 = 0;
            while (true) {
                $i0 = this.size.length;
                if ($i2 >= $i0) {
                    break;
                }
                $r3.get(this.size[$i2], this.next[$i2]);
                $i2++;
            }
        }
        if (this.count != null) {
            while (true) {
                $i0 = this.count.length;
                i = $i0;
                if ($i1 >= $i0) {
                    break;
                }
                $r3.equals(this.count[$i1], this.length[$i1]);
                $i1++;
            }
        }
        BitSet $r52 = $r3.toString((this.offset * 519225044) - 183395238, (-528942055 * this.f218y) + PingManager.ELEMENT, -312601446, -10, -1643656143);
        $r52.flags = true;
        $l7 = this.buf * 1502789465;
        obj = $l7;
        cache.get($r52, (long) $l7);
        return $r52;
    }

    public Message toString(int i, int i2) {
        try {
            if (this.buffer != null && i > 1) {
                int $i2 = -1;
                for (i2 = 0; i2 < 10; i2++) {
                    if (i >= this.entries[i2]) {
                        if (this.entries[i2] != 0) {
                            $i2 = this.buffer[i2];
                        } else {
                            continue;
                        }
                    }
                }
                if ($i2 != -1) {
                    return Set.get($i2, 1850913360);
                }
            }
            return this;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ax.ae(" + ')');
        }
    }

    public final Table toString(boolean z) {
        int $i2 = -1409954714 * this.list;
        int $i3 = -544180954 * this.current;
        int $i1 = 2125305234 * this.f209a;
        if (z) {
            $i2 = this.f214r * -1621344613;
            $i3 = this.f213p * 1926968693;
            $i1 = this.f212i * 1943237417;
        }
        if ($i2 == -1) {
            return null;
        }
        Table $r3 = Table.get(HttpFields.count, $i2, 0);
        if ($i3 != -1) {
            $r3 = Table.get(HttpFields.count, $i3, 0);
            if (-1 != $i1) {
                Table $r6 = Table.get(HttpFields.count, $i1, 0);
                $r3 = new Table(new Table[]{$r5, $r3, $r6}, 3);
            } else {
                $r3 = new Table(new Table[]{$r5, $r3}, 2);
            }
        }
        if (!(z || this.f216v * -451091373 == 0)) {
            $r3.add(0, this.f216v * 71300495, 0);
        }
        if (z && this.f215t * -1672426487 != 0) {
            $r3.add(0, this.f215t * -1672426487, 0);
        }
        if (this.size != null) {
            for ($i1 = 0; $i1 < this.size.length; $i1++) {
                $r3.get(this.size[$i1], this.next[$i1]);
            }
        }
        if (this.count != null) {
            for (int $i0 = 0; $i0 < this.count.length; $i0++) {
                $r3.equals(this.count[$i0], this.length[$i0]);
            }
        }
        return $r3;
    }

    public final Table toString(boolean z, byte b) {
        int $i2 = this.f210b;
        int $i3 = this.f211c;
        if (z) {
            $i2 = 561447253 * this.first;
            $i3 = this.last * -1203505845;
        } else {
            $i2 *= 1607303745;
            $i3 *= -466875999;
        }
        if (-1 == $i2) {
            return null;
        }
        Table $r3 = Table.get(HttpFields.count, $i2, 0);
        if (-1 != $i3) {
            $r3 = Table.get(HttpFields.count, $i3, 0);
            $r3 = new Table(new Table[]{$r2, $r3}, 2);
        }
        if (this.size != null) {
            $i2 = 0;
            while ($i2 < this.size.length) {
                try {
                    $r3.get(this.size[$i2], this.next[$i2]);
                    $i2++;
                } catch (RuntimeException $r6) {
                    throw StringBuilder.append($r6, "ax.ai(" + ')');
                }
            }
        }
        if (this.count != null) {
            for (int $i1 = 0; $i1 < this.count.length; $i1++) {
                $r3.equals(this.count[$i1], this.length[$i1]);
            }
        }
        return $r3;
    }

    public final Table toString(boolean z, int i) {
        int $i1 = this.list;
        int $i2 = this.current;
        int $i3 = this.f209a;
        if (z) {
            $i1 = this.f214r;
            $i1 *= -1621344613;
            $i2 = this.f213p * 1926968693;
            $i3 = this.f212i * 1943237417;
        } else {
            $i1 = 1937519271 * $i1;
            $i2 = -1088607301 * $i2;
            $i3 = -92416057 * $i3;
        }
        if ($i1 == -1) {
            return null;
        }
        Table $r2 = Table.get(HttpFields.count, $i1, 0);
        if ($i2 != -1) {
            $r2 = Table.get(HttpFields.count, $i2, 0);
            if (-1 != $i3) {
                Table $r6 = Table.get(HttpFields.count, $i3, 0);
                $r2 = new Table(new Table[]{$r5, $r2, $r6}, 3);
            } else {
                $r2 = new Table(new Table[]{$r5, $r2}, 2);
            }
        }
        if (!z) {
            if (this.f216v * 1899140937 != 0) {
                $r2.add(0, this.f216v * 1899140937, 0);
            }
        }
        if (z) {
            if (this.f215t * -1672426487 != 0) {
                $r2.add(0, this.f215t * -1672426487, 0);
            }
        }
        if (this.size != null) {
            $i1 = 0;
            while ($i1 < this.size.length) {
                try {
                    $r2.get(this.size[$i1], this.next[$i1]);
                    $i1++;
                } catch (Throwable $r7) {
                    throw StringBuilder.append($r7, "ax.ab(" + ')');
                }
            }
        }
        if (this.count != null) {
            for (i = 0; i < this.count.length; i++) {
                $r2.equals(this.count[i], this.length[i]);
            }
        }
        return $r2;
    }

    void update(Message message, Message message2) {
        this.start = message.start * 1;
        this.data = message.data * 1;
        this.parent = message.parent * 1;
        this.level = message.level * 1;
        this.f217x = message.f217x * 1;
        this.index = message.index * 1;
        this.key = message.key * 1;
        this.size = message.size;
        this.next = message.next;
        this.count = message.count;
        this.length = message.length;
        this.value = message2.value;
        this.type = message2.type;
        this.id = message2.id * 1;
        this.name = -887677863;
    }

    public int write() {
        if (-1 != this.header * 653127871) {
            if (this.this$0 == null) {
                return -1;
            }
            if (this.header * 653127871 >= 0) {
                if (this.this$0[this.header * 653127871] != null) {
                    return this.header * 653127871;
                }
            } else if (R$id.group.equalsIgnoreCase(this.this$0[4])) {
                return 4;
            }
        }
        return -1;
    }

    public int write(int $i0, int i) {
        return CompositeInlineMap.add(this.path, $i0, i, -1936625866);
    }

    public int write(int $i0, int i, int i2) {
        try {
            return CompositeInlineMap.add(this.path, $i0, i, -1813001877);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ax.az(" + ')');
        }
    }

    public String write(int i, String $r1, int i2) {
        try {
            return Block.toString(this.path, i, $r1, (byte) 12);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ax.ah(" + ')');
        }
    }
}
