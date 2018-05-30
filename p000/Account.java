package p000;

/* compiled from: dv */
public class Account implements Key {
    static final int TYPE_MOBILE = 2160;
    static final int limit = 6;
    static int f4y;
    int address;
    int color;
    int data;
    int id;
    int name;
    int password;
    int path;
    int selected;
    int text;
    int type;

    Account() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dv.<init>(" + ')');
        }
    }

    public int[] compareTo(int i, int i2, int i3) {
        if (!toString(i, i2, i3, 1118294430)) {
            return null;
        }
        return new int[]{((-910992064 * this.id) - (1357078848 * this.name)) + i2, ((-243054144 * this.data) - (1538107840 * this.path)) + i3};
    }

    public Method equals(int $i0, int $i1) {
        if (!toString($i0, $i1, -1753581745)) {
            return null;
        }
        return new Method(this.text * -967489595, $i0 + ((this.name * 1190810919) - (-1450354251 * this.id)), $i1 + ((1538107840 * this.path) - (-477526180 * this.data)));
    }

    public void equals(Arrays arrays) {
        if (-1332676195 * arrays.value > this.id * -416887435) {
            arrays.value = -558782535 * this.id;
        }
        if (arrays.type * 845527457 < 710360795 * this.color) {
            arrays.type = -1474461957 * this.color;
        }
        if (arrays.path * -668436401 > 1741032743 * this.data) {
            arrays.path = this.data * 123604905;
        }
        if (-519973341 * arrays.title < this.selected * -1972415121) {
            arrays.title = 590596677 * this.selected;
        }
    }

    public boolean equals(int i, int i2, int i3) {
        if (i >= this.text * -967489595) {
            if (i >= (this.text * -967489595) + (this.address * 268133919)) {
                return false;
            }
            if ((i2 >> 6) >= this.name * -582775419 && (i2 >> 6) <= -1709087619 * this.password && (i3 >> 6) >= this.path * -1720797529 && (i3 >> 6) <= 263185789 * this.type) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(int i, int i2, int i3) {
        if (i >= 980025377 * this.text) {
            if (i >= (-967489595 * this.text) + (this.address * -952902708)) {
                return false;
            }
            if ((i2 >> 6) >= this.name * -22966838 && (i2 >> 6) <= -216501235 * this.password && (i3 >> 6) >= this.path * -1720797529 && (i3 >> 6) <= 1078531765 * this.type) {
                return true;
            }
        }
        return false;
    }

    public Method get(int $i0, int $i1) {
        if (!toString($i0, $i1, -247008018)) {
            return null;
        }
        return new Method(this.text * -1405727035, $i0 + ((this.name * -1557585448) - (325632499 * this.id)), $i1 + ((1365208971 * this.path) - (-997984397 * this.data)));
    }

    public boolean get(int i, int i2, int i3) {
        if (i >= -967489595 * this.text) {
            if (i >= (834752647 * this.text) + (this.address * -1460761081)) {
                return false;
            }
            if ((i2 >> 6) >= this.name * -582775419 && (i2 >> 6) <= -494069934 * this.password && (i3 >> 6) >= this.path * -1577781556 && (i3 >> 6) <= 263185789 * this.type) {
                return true;
            }
        }
        return false;
    }

    public boolean init(int i, int i2, int i3) {
        if (i >= this.text * -967489595) {
            if (i >= (this.text * -967489595) + (this.address * 268133919)) {
                return false;
            }
            if ((i2 >> 6) >= this.name * -582775419 && (i2 >> 6) <= -1709087619 * this.password && (i3 >> 6) >= this.path * -1720797529 && (i3 >> 6) <= 263185789 * this.type) {
                return true;
            }
        }
        return false;
    }

    public int[] onClick(int i, int i2, int i3) {
        if (!toString(i, i2, i3, -12278834)) {
            return null;
        }
        return new int[]{((-910992064 * this.id) - (1357078848 * this.name)) + i2, ((-243054144 * this.data) - (1538107840 * this.path)) + i3};
    }

    public Method onCreate(int $i0, int $i1) {
        if (!toString($i0, $i1, -187495001)) {
            return null;
        }
        return new Method(this.text * -967489595, $i0 + ((this.name * -1668967221) - (1831509672 * this.id)), $i1 + ((1538107840 * this.path) - (144163796 * this.data)));
    }

    public void onCreate(Arrays arrays) {
        if (-1591552110 * arrays.value > this.id * -416887435) {
            arrays.value = 1563693049 * this.id;
        }
        if (arrays.type * 845527457 < 710360795 * this.color) {
            arrays.type = -1474461957 * this.color;
        }
        if (arrays.path * -668436401 > -2103665134 * this.data) {
            arrays.path = this.data * -2065411328;
        }
        if (-519973341 * arrays.title < this.selected * -1972415121) {
            arrays.title = 748570292 * this.selected;
        }
    }

    public void onCreate(Logger logger) {
        this.text = logger.get((byte) 0) * 1731763981;
        this.address = logger.get((byte) 0) * -1741777441;
        this.name = logger.get(-158601603) * 1331979085;
        this.path = logger.get(1478674102) * 1304400151;
        this.password = logger.get(-572602858) * -1335479083;
        this.type = logger.get(890897293) * 1046445013;
        this.id = logger.get(-1570051413) * -1644176675;
        this.data = logger.get(-1945435722) * -593325417;
        this.color = logger.get(-1968512960) * 1741196627;
        this.selected = logger.get(-495701016) * 531081615;
        setLabel(336983649);
    }

    public void onCreate(Logger logger, byte b) {
        try {
            this.text = logger.get((byte) 0) * 1731763981;
            this.address = logger.get((byte) 0) * -1741777441;
            this.name = logger.get(1073596332) * 1331979085;
            this.path = logger.get(-1122036919) * 1304400151;
            this.password = logger.get(-1424976864) * -1335479083;
            this.type = logger.get(-924790530) * 1046445013;
            this.id = logger.get(1536605772) * -1644176675;
            this.data = logger.get(-1669561722) * -593325417;
            this.color = logger.get(241599025) * 1741196627;
            this.selected = logger.get(213838070) * 531081615;
            setLabel(340149197);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dv.ay(" + ')');
        }
    }

    public int[] onCreate(int i, int i2, int i3) {
        if (!toString(i, i2, i3, 1640185201)) {
            return null;
        }
        return new int[]{((-910992064 * this.id) - (1357078848 * this.name)) + i2, ((-243054144 * this.data) - (1538107840 * this.path)) + i3};
    }

    public int[] run(int i, int i2, int i3) {
        if (!toString(i, i2, i3, 812346846)) {
            return null;
        }
        return new int[]{((-910992064 * this.id) - (-805177606 * this.name)) + i2, ((-243054144 * this.data) - (-1292311912 * this.path)) + i3};
    }

    void send() {
    }

    void setActive() {
    }

    void setLabel() {
    }

    void setLabel(int i) {
    }

    public Method toString(int $i0, int $i1) {
        if (!toString($i0, $i1, -1282436058)) {
            return null;
        }
        return new Method(this.text * -967489595, $i0 + ((this.name * 1357078848) - (-910992064 * this.id)), $i1 + ((1538107840 * this.path) - (-243054144 * this.data)));
    }

    public void toString(Arrays arrays) {
        if (-149320766 * arrays.value > this.id * -416887435) {
            arrays.value = -739601875 * this.id;
        }
        if (arrays.type * 342419423 < 710360795 * this.color) {
            arrays.type = -1474461957 * this.color;
        }
        if (arrays.path * -1565693652 > 1224086522 * this.data) {
            arrays.path = this.data * 123604905;
        }
        if (-519973341 * arrays.title < this.selected * 1703500361) {
            arrays.title = 1249370769 * this.selected;
        }
    }

    public void toString(Arrays arrays, int i) {
        try {
            if (-1332676195 * arrays.value > this.id * -416887435) {
                arrays.value = -558782535 * this.id;
            }
            if (arrays.type * 845527457 < 710360795 * this.color) {
                arrays.type = -1474461957 * this.color;
            }
            if (arrays.path * -668436401 > 1741032743 * this.data) {
                arrays.path = this.data * 123604905;
            }
            if (-519973341 * arrays.title < this.selected * -1972415121) {
                arrays.title = 590596677 * this.selected;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dv.af(" + ')');
        }
    }

    public boolean toString(int $i0, int i, int i2) {
        try {
            if (($i0 >> 6) >= this.id * -416887435) {
                if (($i0 >> 6) <= this.color * 710360795) {
                    if ((i >> 6) >= this.data * 1741032743) {
                        if ((i >> 6) <= -1972415121 * this.selected) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dv.an(" + ')');
        }
    }

    public boolean toString(int i, int i2, int i3, int i4) {
        try {
            if (i >= this.text * -967489595) {
                if (i >= (this.text * -967489595) + (this.address * 268133919)) {
                    return false;
                }
                if ((i2 >> 6) >= this.name * -582775419) {
                    if ((i2 >> 6) <= -1709087619 * this.password) {
                        if ((i3 >> 6) >= this.path * -1720797529) {
                            if ((i3 >> 6) <= 263185789 * this.type) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dv.ad(" + ')');
        }
    }

    public int[] toString(int i, int i2, int i3, byte b) {
        try {
            if (!toString(i, i2, i3, 833204303)) {
                return null;
            }
            int[] $r1 = new int[2];
            $r1[0] = ((-910992064 * this.id) - (1357078848 * this.name)) + i2;
            $r1[1] = ((-243054144 * this.data) - (1538107840 * this.path)) + i3;
            return $r1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dv.aa(" + ')');
        }
    }

    public Method update(int $i0, int $i1, int i) {
        try {
            return !toString($i0, $i1, -279185287) ? null : new Method(this.text * -967489595, $i0 + ((this.name * 1357078848) - (-910992064 * this.id)), $i1 + ((1538107840 * this.path) - (-243054144 * this.data)));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dv.ag(" + ')');
        }
    }

    public boolean update(int $i0, int i) {
        return ($i0 >> 6) >= this.id * -416887435 && ($i0 >> 6) <= this.color * 710360795 && (i >> 6) >= this.data * 1741032743 && (i >> 6) <= -1972415121 * this.selected;
    }
}
