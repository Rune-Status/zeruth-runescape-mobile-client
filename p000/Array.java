package p000;

import java.util.Collection;

/* compiled from: aj */
public class Array extends BitSet {
    static RuntimeException items = new RuntimeException(64, null);
    boolean data;
    char f7n;
    public String size;
    public int value;

    Array() {
        try {
            this.data = true;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "aj.<init>(" + ')');
        }
    }

    public static void add(Class classR) {
        Score.id = classR;
    }

    static final void add(Entry entry, byte b) {
        try {
            entry.size = false;
            if (entry.value != null) {
                entry.value.size = 0;
            }
            Entry $r2 = entry.size();
            while ($r2 != null) {
                Array.add($r2, (byte) -106);
                $r2 = entry.get();
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "aj.aj(" + ')');
        }
    }

    public static void addAll(Collection collection) {
        collection.add(items);
    }

    public static void clear(Class classR) {
        Score.id = classR;
    }

    public static Array get(int i) {
        Array $r2 = (Array) items.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = Score.id.get(11, i, -900942730);
        $r2 = new Array();
        if ($r4 != null) {
            $r2.add(new Logger($r4), (byte) -50);
        }
        $r2.add((byte) 59);
        items.get($r2, (long) i);
        return $r2;
    }

    public static void insert(Class classR) {
        Score.id = classR;
    }

    public static void insert(Collection collection) {
        collection.add(items);
    }

    public static Array set(int i) {
        Array $r2 = (Array) items.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = Score.id.get(11, i, -2107305317);
        $r2 = new Array();
        if ($r4 != null) {
            $r2.add(new Logger($r4), (byte) -22);
        }
        $r2.add((byte) 29);
        items.get($r2, (long) i);
        return $r2;
    }

    public static void setId(Class classR) {
        Score.id = classR;
    }

    public static void sort(Collection collection) {
        collection.add(items);
    }

    public static void toArray(Collection collection) {
        collection.add(items);
    }

    static void toString(int[] iArr, byte[] bArr, int[] iArr2, int i, int $i6, int $i1, int i2, int i3, int i4, int i5) {
        i5 = -($i1 >> 2);
        $i1 = -($i1 & 3);
        i2 = -i2;
        int $i7 = i;
        while (i2 < 0) {
            int $i8;
            for (i = i5; i < 0; i++) {
                int $i10;
                $i8 = $i7 + 1;
                byte $b9 = bArr[$i7];
                if ($b9 != (byte) 0) {
                    $i10 = $i6 + 1;
                    iArr[$i6] = iArr2[$b9 & (short) 255];
                } else {
                    $i10 = $i6 + 1;
                }
                $i7 = $i8 + 1;
                $b9 = bArr[$i8];
                if ($b9 != (byte) 0) {
                    iArr[$i10] = iArr2[$b9 & (short) 255];
                    $i8 = $i10 + 1;
                } else {
                    $i8 = $i10 + 1;
                }
                $i6 = $i7 + 1;
                $b9 = bArr[$i7];
                if ($b9 != (byte) 0) {
                    iArr[$i8] = iArr2[$b9 & (short) 255];
                    $i8++;
                } else {
                    $i8++;
                }
                $i7 = $i6 + 1;
                $b9 = bArr[$i6];
                if ($b9 != (byte) 0) {
                    $i6 = $i8 + 1;
                    iArr[$i8] = iArr2[$b9 & (short) 255];
                } else {
                    $i6 = $i8 + 1;
                }
            }
            i = $i6;
            $i8 = $i7;
            $i6 = $i1;
            while ($i6 < 0) {
                $i7 = $i8 + 1;
                $b9 = bArr[$i8];
                if ($b9 != (byte) 0) {
                    $i8 = i + 1;
                    try {
                        iArr[i] = iArr2[$b9 & (short) 255];
                    } catch (RuntimeException $r3) {
                        throw StringBuilder.append($r3, "aj.au(" + ')');
                    }
                }
                $i8 = i + 1;
                $i6++;
                i = $i8;
                $i8 = $i7;
            }
            $i7 = $i8 + i4;
            i2++;
            $i6 = i + i3;
        }
    }

    void add(byte b) {
    }

    void add(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, 1023940203);
            } else {
                return;
            }
        }
    }

    void add(Logger logger, byte b) {
        while (true) {
            try {
                int $i1 = logger.get((byte) 0);
                if ($i1 != 0) {
                    add(logger, $i1, 2137691933);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "aj.aa(" + ')');
            }
        }
    }

    void add(Logger logger, int $i0) {
        if (1 == $i0) {
            $i0 = logger.next(1247983979) & 633726340;
            if ($i0 == 0) {
                throw new IllegalArgumentException("");
            }
            if ($i0 >= Constants.f93X && $i0 < -1254242658) {
                $i0 = DirCache.this$0[$i0 - -1127776389];
                if ($i0 == 0) {
                    $i0 = -1891316160;
                }
            }
            this.f7n = (char) $i0;
        } else if ($i0 == 2) {
            this.value = logger.size(-118302978) * 269458754;
        } else if ($i0 == 4) {
            this.data = false;
        } else {
            if ($i0 == 5) {
                this.size = logger.toString(1414495370);
            }
        }
    }

    void add(Logger logger, int $i0, int i) {
        if (1 == $i0) {
            try {
                $i0 = logger.next(1247983979) & 255;
                if ($i0 == 0) {
                    throw new IllegalArgumentException("");
                }
                if ($i0 >= Constants.f93X && $i0 < 160) {
                    $i0 = DirCache.this$0[$i0 - 128];
                    if ($i0 == 0) {
                        $i0 = 63;
                    }
                }
                this.f7n = (char) $i0;
                return;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "aj.ag(" + ')');
            }
        }
        if ($i0 == 2) {
            this.value = logger.size(100002431) * -2014609209;
        } else if ($i0 == 4) {
            this.data = false;
        } else if ($i0 == 5) {
            this.size = logger.toString(759726727);
        }
    }

    public boolean add(int i) {
        try {
            return this.f7n == 's';
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "aj.ay(" + ')');
        }
    }

    void addAll(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, 525640274);
            } else {
                return;
            }
        }
    }

    void init(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, -530983912);
            } else {
                return;
            }
        }
    }

    void init(Logger logger, int $i0) {
        if (1 == $i0) {
            $i0 = logger.next(1247983979) & 255;
            if ($i0 == 0) {
                throw new IllegalArgumentException("");
            }
            if ($i0 >= Constants.f93X && $i0 < 160) {
                $i0 = DirCache.this$0[$i0 - 128];
                if ($i0 == 0) {
                    $i0 = 63;
                }
            }
            this.f7n = (char) $i0;
        } else if ($i0 == 2) {
            this.value = logger.size(1539995637) * -2014609209;
        } else {
            if ($i0 == 4) {
                this.data = false;
            } else if ($i0 == 5) {
                this.size = logger.toString(1931019895);
            }
        }
    }

    public boolean insert() {
        return this.f7n == 's';
    }

    void load(Logger logger, int $i0) {
        if (1 == $i0) {
            $i0 = logger.next(1247983979) & 255;
            if ($i0 == 0) {
                throw new IllegalArgumentException("");
            }
            if ($i0 >= Constants.f93X && $i0 < 1187809352) {
                $i0 = DirCache.this$0[$i0 - 128];
                if ($i0 == 0) {
                    $i0 = 63;
                }
            }
            this.f7n = (char) $i0;
            return;
        }
        if ($i0 == 2) {
            this.value = logger.size(-927848407) * 326640618;
        } else if ($i0 == 4) {
            this.data = false;
        } else if ($i0 == 5) {
            this.size = logger.toString(952090854);
        }
    }

    void read(Logger logger, int $i0) {
        if (1 == $i0) {
            $i0 = logger.next(1247983979) & 255;
            if ($i0 == 0) {
                throw new IllegalArgumentException("");
            }
            if ($i0 >= Constants.f93X && $i0 < 603000829) {
                $i0 = DirCache.this$0[$i0 - 1554051744];
                if ($i0 == 0) {
                    $i0 = -2143887902;
                }
            }
            this.f7n = (char) $i0;
        } else if ($i0 == 2) {
            this.value = logger.size(-1020766255) * -268971166;
        } else if ($i0 == 4) {
            this.data = false;
        } else {
            if ($i0 == 5) {
                this.size = logger.toString(1853284592);
            }
        }
    }

    void resize() {
    }

    void shrink() {
    }
}
