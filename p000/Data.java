package p000;

/* compiled from: aq */
public class Data extends BitSet {
    static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    public static final int SDLK_F = 9;
    public static final int TAG = 100;
    public static RuntimeException data = new RuntimeException(64, null);
    public static Class value;
    public boolean index = false;

    static void add(HttpRequest httpRequest, String str, int i) {
        try {
            LongArray $r2 = new LongArray(httpRequest, str);
            client.iterator.add($r2);
            client.currentIndex = ($r2.map * -184682577) + client.currentIndex;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "aq.ao(" + ')');
        }
    }

    static void add(System system, int $i0, int $i1, byte b) {
        try {
            if (system.f298s * -181534661 == 0) {
                system.head = system.f285b * -1519221509;
            } else if (system.f298s * -181534661 == 1) {
                system.head = ((($i0 - (256177861 * system.this$0)) / 2) + (system.f285b * -2010738599)) * 1082094963;
            } else if (2 == system.f298s * -181534661) {
                system.head = (($i0 - (256177861 * system.this$0)) - (system.f285b * -2010738599)) * 1082094963;
            } else if (3 == system.f298s * -181534661) {
                system.head = (((system.f285b * -2010738599) * $i0) >> 14) * 1082094963;
            } else if (system.f298s * -181534661 == 4) {
                system.head = ((($i0 - (256177861 * system.this$0)) / 2) + (((system.f285b * -2010738599) * $i0) >> 14)) * 1082094963;
            } else {
                system.head = (($i0 - (system.this$0 * 256177861)) - (((system.f285b * -2010738599) * $i0) >> 14)) * 1082094963;
            }
            if (system.f301y * -570752573 == 0) {
                system.max = system.f299w * 1676005485;
            } else if (1 == system.f301y * -570752573) {
                system.max = ((2145844449 * system.f299w) + (($i1 - (57307023 * system.$assertionsDisabled)) / 2)) * -1265034995;
            } else if (system.f301y * -570752573 == 2) {
                system.max = (($i1 - (57307023 * system.$assertionsDisabled)) - (2145844449 * system.f299w)) * -1265034995;
            } else if (system.f301y * -570752573 == 3) {
                system.max = (((system.f299w * 2145844449) * $i1) >> 14) * -1265034995;
            } else if (4 == system.f301y * -570752573) {
                system.max = ((($i1 - (57307023 * system.$assertionsDisabled)) / 2) + (((2145844449 * system.f299w) * $i1) >> 14)) * -1265034995;
            } else {
                system.max = (($i1 - (57307023 * system.$assertionsDisabled)) - (((system.f299w * 2145844449) * $i1) >> 14)) * -1265034995;
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "aq.ed(" + ')');
        }
    }

    static final void execute(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "aq.ad(" + ')');
        }
    }

    static int get(int $i3, int i, int i2, int i3) {
        try {
            if ((Chart.size[$i3][i][i2] & (byte) 8) != (byte) 0) {
                return 0;
            }
            if ($i3 > 0) {
                if ((Chart.size[1][i][i2] & (byte) 2) != (byte) 0) {
                    return $i3 - 1;
                }
            }
            return $i3;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "aq.ar(" + ')');
        }
    }

    public static int get(long $l0) {
        return (int) (($l0 >>> null) & 127);
    }

    public static void load(Class classR) {
        value = classR;
    }

    static void read(int[] iArr, int[] iArr2, int i, int i2, int $i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i7 >= 255) {
            Stream.read(iArr, iArr2, 0, i2, $i2, i3, i4, i5, i6, -272836284);
            return;
        }
        i = i7 << 24;
        i8 = 255 - i7;
        for (i4 = -i4; i4 < 0; i4++) {
            int $i9 = i2;
            i2 = $i2;
            $i2 = -i3;
            while ($i2 < 0) {
                int $i10 = $i9 + 1;
                int $i11 = iArr2[$i9];
                if ($i11 != 0) {
                    int $i12 = iArr[i2];
                    if ($i12 == 0) {
                        $i9 = i2 + 1;
                        try {
                            iArr[i2] = ($i11 & 16777215) | i;
                        } catch (RuntimeException $r2) {
                            throw StringBuilder.append($r2, "aq.bh(" + ')');
                        }
                    }
                    $i9 = i2 + 1;
                    iArr[i2] = (((((($i11 & 65280) * i7) + (($i12 & 65280) * i8)) & 16711680) + ((((16711935 & $i12) * i8) + ((16711935 & $i11) * i7)) & -16711936)) >>> 8) | (-16777216 & ($i12 | i));
                } else {
                    $i9 = i2 + 1;
                }
                $i2++;
                i2 = $i9;
                $i9 = $i10;
            }
            $i2 = i2 + i5;
            i2 = $i9 + i6;
        }
    }

    public static void replace(Class classR) {
        value = classR;
    }

    public static void sort(Class classR) {
        value = classR;
    }

    public void add(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    add(logger, i, (byte) -1);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "aq.ad(" + ')');
            }
        }
    }

    void add(Logger logger, int i, byte b) {
        if (2 == i) {
            try {
                this.index = true;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "aq.an(" + ')');
            }
        }
    }

    void initialize(Logger logger, int i) {
        if (2 == i) {
            this.index = true;
        }
    }

    public void replace(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) -1);
            } else {
                return;
            }
        }
    }

    public void trim(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                add(logger, $i0, (byte) -1);
            } else {
                return;
            }
        }
    }
}
