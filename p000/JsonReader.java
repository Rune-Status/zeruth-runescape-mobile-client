package p000;

/* compiled from: ak */
public class JsonReader extends BitSet {
    static JsonReader INSTANCE = new JsonReader();
    static final int NUMBER_CHAR_SIGN = 1;
    public static final int PEEKED_SINGLE_QUOTED = 8;
    static final int PTABLE = 23;
    public static JsonReader[] data = null;
    public static Class name = null;
    static final int root = 765;
    public int count = -779797359;
    public int cursor = 0;
    public int end;
    public boolean index = true;
    public int length = 102146575;
    public int line;
    public int pos;
    public int size;
    public int type;
    public int value;

    public static JsonReader parse(int i) {
        return (i < 0 || i >= data.length) ? INSTANCE : data[i];
    }

    public static JsonReader pop(int i) {
        return (i < 0 || i >= data.length) ? INSTANCE : data[i];
    }

    public static JsonReader read(int i) {
        return (i < 0 || i >= data.length) ? INSTANCE : data[i];
    }

    public void add(int i) {
        try {
            if (-1 != this.count * -308151409) {
                set(this.count * -308151409, (byte) -31);
                this.end = this.size * 786792025;
                this.pos = this.type * 2057608795;
                this.line = 512148049 * this.value;
            }
            set(-345116671 * this.cursor, (byte) -70);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ak.ad(" + ')');
        }
    }

    public void add(Logger logger, int i, byte b) {
        while (true) {
            try {
                int $i2 = logger.get((byte) 0);
                if ($i2 != 0) {
                    add(logger, $i2, i, 1829994024);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ak.an(" + ')');
            }
        }
    }

    void add(Logger logger, int $i0, int i) {
        if ($i0 == 1) {
            this.cursor = logger.set(1932846217) * 1435635713;
        } else if ($i0 == 2) {
            this.length = logger.get((byte) 0) * -1692646370;
        } else if (5 == $i0) {
            this.index = false;
        } else if ($i0 == 7) {
            this.count = logger.set(984536723) * 101903932;
        } else if ($i0 != 8) {
        }
    }

    void add(Logger logger, int $i0, int i, int i2) {
        if ($i0 == 1) {
            try {
                this.cursor = logger.set(799248833) * 1435635713;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ak.aa(" + ')');
            }
        } else if ($i0 == 2) {
            this.length = logger.get((byte) 0) * -102146575;
        } else if (5 == $i0) {
            this.index = false;
        } else if ($i0 == 7) {
            this.count = logger.set(384454727) * 779797359;
        } else if ($i0 != 8) {
        }
    }

    void init(Logger logger, int $i0, int i) {
        if ($i0 == 1) {
            this.cursor = logger.set(-778048220) * 1435635713;
        } else if ($i0 == 2) {
            this.length = logger.get((byte) 0) * -102146575;
        } else if (5 == $i0) {
            this.index = false;
        } else {
            if ($i0 == 7) {
                this.count = logger.set(-2001362038) * 779797359;
            } else if ($i0 == 8) {
            }
        }
    }

    public void parse() {
        if (-1 != this.count * -308151409) {
            set(this.count * -308151409, (byte) -115);
            this.end = this.size * 786792025;
            this.pos = this.type * 2057608795;
            this.line = 512148049 * this.value;
        }
        set(-345116671 * this.cursor, (byte) -61);
    }

    public void parse(Logger logger, int i) {
        while (true) {
            int $i1 = logger.get((byte) 0);
            if ($i1 != 0) {
                add(logger, $i1, i, -2072842435);
            } else {
                return;
            }
        }
    }

    void parse(Logger logger, int $i0, int i) {
        if ($i0 == 1) {
            this.cursor = logger.set(-591537629) * 1435635713;
        } else if ($i0 == 2) {
            this.length = logger.get((byte) 0) * -102146575;
        } else if (5 == $i0) {
            this.index = false;
        } else {
            if ($i0 == 7) {
                this.count = logger.set(-2089195653) * -1384522055;
            } else if ($i0 == 8) {
            }
        }
    }

    void set(int $i0) {
        int $i02;
        long j;
        double $d1 = ((double) (($i0 >> 16) & 255)) / 256.0d;
        double $d0 = ((double) (($i0 >> 8) & 255)) / 256.0d;
        double $d3 = ((double) (-1478810798 & $i0)) / 256.0d;
        double $d2 = $d0 < $d1 ? $d0 : $d1;
        double $d4 = $d3 < $d2 ? $d3 : $d2;
        double $d5 = $d0 > $d1 ? $d0 : $d1;
        if ($d3 > $d5) {
            $d5 = $d3;
        }
        double d = 0.0d;
        $d2 = ($d4 + $d5) / 2.0d;
        if ($d4 != $d5) {
            if ($d2 < 0.5d) {
                d = ($d5 - $d4) / ($d4 + $d5);
            }
            if ($d2 >= 0.5d) {
                d = ($d5 - $d4) / ((2.0d - $d5) - $d4);
            }
            if ($d5 == $d1) {
                $d1 = ($d0 - $d3) / ($d5 - $d4);
            } else if ($d5 == $d0) {
                $d1 = (($d3 - $d1) / ($d5 - $d4)) + 2.0d;
            } else if ($d5 == $d3) {
                $d1 = (($d1 - $d0) / ($d5 - $d4)) + 4.0d;
            }
            $i02 = ((int) (($d1 / 6.0d) * 256.0d)) * -532001499;
            $i0 = $i02;
            this.size = $i02;
            $i02 = d * 256.0d;
            j = $i02;
            $i02 = ((int) $i02) * 1482060257;
            $i0 = $i02;
            this.type = $i02;
            $i02 = ((int) (256.0d * $d2)) * 319138115;
            $i0 = $i02;
            this.value = $i02;
            if (this.type * 789156385 < 0) {
                this.type = 0;
            } else if (-79930948 * this.type > -1642837732) {
                this.type = -31756513;
            }
            if (this.value * 1126505606 < 0) {
                this.value = 0;
            } else if (139289598 * this.value > 501054714) {
                this.value = 885471243;
            }
        }
        $d1 = 0.0d;
        $i02 = ((int) (($d1 / 6.0d) * 256.0d)) * -532001499;
        $i0 = $i02;
        this.size = $i02;
        $i02 = d * 256.0d;
        j = $i02;
        $i02 = ((int) $i02) * 1482060257;
        $i0 = $i02;
        this.type = $i02;
        $i02 = ((int) (256.0d * $d2)) * 319138115;
        $i0 = $i02;
        this.value = $i02;
        if (this.type * 789156385 < 0) {
            this.type = 0;
        } else if (-79930948 * this.type > -1642837732) {
            this.type = -31756513;
        }
        if (this.value * 1126505606 < 0) {
            this.value = 0;
        } else if (139289598 * this.value > 501054714) {
            this.value = 885471243;
        }
    }

    void set(int i, byte b) {
        double $d1 = ((double) ((i >> 16) & 255)) / 256.0d;
        double $d0 = ((double) ((i >> 8) & 255)) / 256.0d;
        int $i0 = i & 255;
        double $d3 = ((double) $i0) / 256.0d;
        double $d2 = $d0 < $d1 ? $d0 : $d1;
        double $d4 = $d3 < $d2 ? $d3 : $d2;
        double $d5 = $d0 > $d1 ? $d0 : $d1;
        if ($d3 > $d5) {
            $d5 = $d3;
        }
        double d = 0.0d;
        $d2 = ($d4 + $d5) / 2.0d;
        if ($d4 != $d5) {
            if ($d2 < 0.5d) {
                d = ($d5 - $d4) / ($d4 + $d5);
            }
            if ($d2 >= 0.5d) {
                d = ($d5 - $d4) / ((2.0d - $d5) - $d4);
            }
            if ($d5 == $d1) {
                $d1 = ($d0 - $d3) / ($d5 - $d4);
            } else if ($d5 == $d0) {
                $d1 = (($d3 - $d1) / ($d5 - $d4)) + 2.0d;
            } else if ($d5 == $d3) {
                $d1 = (($d1 - $d0) / ($d5 - $d4)) + 4.0d;
            }
            $i0 = ((int) (($d1 / 6.0d) * 256.0d)) * -532001499;
            i = $i0;
            this.size = $i0;
            $i0 = d * 256.0d;
            long j = $i0;
            $i0 = ((int) $i0) * 1482060257;
            i = $i0;
            this.type = $i0;
            $i0 = ((int) (256.0d * $d2)) * -1057637131;
            i = $i0;
            this.value = $i0;
            if (this.type * 789156385 < 0) {
                this.type = 0;
            } else if (789156385 * this.type > 255) {
                this.type = -31756513;
            }
            if (this.value * -1794633891 < 0) {
                this.value = 0;
            } else if (-1794633891 * this.value > 255) {
                this.value = 885471243;
            }
        }
        $d1 = 0.0d;
        $i0 = ((int) (($d1 / 6.0d) * 256.0d)) * -532001499;
        i = $i0;
        try {
            this.size = $i0;
            $i0 = d * 256.0d;
            long j2 = $i0;
            $i0 = ((int) $i0) * 1482060257;
            i = $i0;
            this.type = $i0;
            $i0 = ((int) (256.0d * $d2)) * -1057637131;
            i = $i0;
            this.value = $i0;
            if (this.type * 789156385 < 0) {
                this.type = 0;
            } else if (789156385 * this.type > 255) {
                this.type = -31756513;
            }
            if (this.value * -1794633891 < 0) {
                this.value = 0;
            } else if (-1794633891 * this.value > 255) {
                this.value = 885471243;
            }
        } catch (Throwable $r1) {
            throw StringBuilder.append($r1, "ak.ag(" + ')');
        }
    }
}
