package p000;

/* compiled from: dp */
public class History implements Key {
    static int[] value;
    int date;
    int file;
    int id;
    int name;
    int path;
    int position;
    int state;
    int status;
    int title;
    int url;

    History() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dp.<init>(" + ')');
        }
    }

    public static Double valueOf(Class classR, String str, String str2, int i) {
        try {
            i = classR.get(str, -82513747);
            return Image.toString(classR, i, classR.get(i, str2, -696298492), 281035902);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "dp.ay(" + ')');
        }
    }

    void add(int i) {
    }

    void cancel() {
    }

    void clear() {
    }

    public int[] compareTo(int i, int i2, int i3) {
        if (!toString(i, i2, i3, 712932232)) {
            return null;
        }
        return new int[]{(((this.name * 1385578048) - (1433349184 * this.path)) + i2) + ((this.date * 1234444888) - (-456277080 * this.state)), (((this.id * -1708228928) - (this.title * 922343488)) + i3) + ((this.status * 595928904) - (this.position * -839141992))};
    }

    public Method equals(int i, int i2) {
        if (!toString(i, i2, -200177529)) {
            return null;
        }
        return new Method(this.file * 1039874991, (((1433349184 * this.path) - (-1406747008 * this.name)) + i) + ((703033245 * this.state) - (this.date * 1234444888)), (((this.title * 922343488) - (-408013846 * this.id)) + i2) + ((this.position * 869369262) - (this.status * 595928904)));
    }

    public void equals(Arrays arrays) {
        if (-1332676195 * arrays.value > this.name * 692738297) {
            arrays.value = this.name * -377840627;
        }
        if (arrays.type * 845527457 < this.name * 692738297) {
            arrays.type = this.name * -1428500391;
        }
        if (-668436401 * arrays.path > this.id * 912833019) {
            arrays.path = this.id * 1184435349;
        }
        if (-519973341 * arrays.title < this.id * 912833019) {
            arrays.title = this.id * -66302391;
        }
    }

    public boolean equals(int i, int i2, int i3) {
        if (i >= this.file * -339840039) {
            if (i >= (this.url * 180952367) + (this.file * -339840039)) {
                return false;
            }
            if (i2 >= ((this.path * 156613809) << 6) + ((this.state * -593905547) << 3) && i2 <= (((this.state * -593905547) << 3) + ((this.path * 156613809) << 6)) + 7 && i3 >= ((this.title * 551282529) << 6) + ((this.position * 2042590899) << 3) && i3 <= (((this.title * 551282529) << 6) + ((2042590899 * this.position) << 3)) + 7) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(int i, int i2, int i3) {
        if (i >= this.file * -339840039) {
            if (i >= (this.url * 180952367) + (this.file * -339840039)) {
                return false;
            }
            if (i2 >= ((this.path * 156613809) << 6) + ((this.state * -593905547) << 3) && i2 <= (((this.state * -593905547) << 3) + ((this.path * 156613809) << 6)) + 7 && i3 >= ((this.title * 551282529) << 6) + ((this.position * 2042590899) << 3) && i3 <= (((this.title * 551282529) << 6) + ((2042590899 * this.position) << 3)) + 7) {
                return true;
            }
        }
        return false;
    }

    public Method get(int i, int i2) {
        if (!toString(i, i2, -2139107007)) {
            return null;
        }
        return new Method(this.file * -339840039, (((1433349184 * this.path) - (1385578048 * this.name)) + i) + ((-456277080 * this.state) - (this.date * 1234444888)), (((this.title * 922343488) - (-1708228928 * this.id)) + i2) + ((this.position * -839141992) - (this.status * 595928904)));
    }

    public boolean get(int i, int i2, int i3) {
        if (i >= this.file * -339840039) {
            if (i >= (this.url * 929264924) + (-923240595 * this.file)) {
                return false;
            }
            if (i2 >= ((this.path * -538356643) << 6) + ((this.state * -344937655) << 3) && i2 <= (((this.state * -593905547) << 3) + ((2113530024 * this.path) << 6)) + 7 && i3 >= ((1165640698 * this.title) << 6) + ((this.position * 219161193) << 3) && i3 <= (((-1734020387 * this.title) << 6) + ((460334821 * this.position) << 3)) + 7) {
                return true;
            }
        }
        return false;
    }

    public boolean init(int i, int i2, int i3) {
        if (i >= this.file * -339840039) {
            if (i >= (this.url * 180952367) + (this.file * -339840039)) {
                return false;
            }
            if (i2 >= ((this.path * 156613809) << 6) + ((this.state * -593905547) << 3) && i2 <= (((this.state * -593905547) << 3) + ((this.path * 156613809) << 6)) + 7 && i3 >= ((this.title * 551282529) << 6) + ((this.position * 2042590899) << 3) && i3 <= (((this.title * 551282529) << 6) + ((2042590899 * this.position) << 3)) + 7) {
                return true;
            }
        }
        return false;
    }

    public int[] onClick(int i, int i2, int i3) {
        if (!toString(i, i2, i3, -432690514)) {
            return null;
        }
        return new int[]{(((this.name * 1385578048) - (1433349184 * this.path)) + i2) + ((this.date * -1932743490) - (-1184970746 * this.state)), (((this.id * -680272008) - (this.title * 922343488)) + i3) + ((this.status * 385146887) - (this.position * 848389247))};
    }

    public Method onCreate(int i, int i2) {
        if (!toString(i, i2, -302093980)) {
            return null;
        }
        return new Method(this.file * -339840039, (((1433349184 * this.path) - (1385578048 * this.name)) + i) + ((-456277080 * this.state) - (this.date * 1234444888)), (((this.title * 922343488) - (-1708228928 * this.id)) + i2) + ((this.position * -839141992) - (this.status * 595928904)));
    }

    public void onCreate(Arrays arrays) {
        if (-1332676195 * arrays.value > this.name * 692738297) {
            arrays.value = this.name * -377840627;
        }
        if (arrays.type * 845527457 < this.name * 692738297) {
            arrays.type = this.name * -1428500391;
        }
        if (-668436401 * arrays.path > this.id * 912833019) {
            arrays.path = this.id * 1184435349;
        }
        if (-519973341 * arrays.title < this.id * 912833019) {
            arrays.title = this.id * -66302391;
        }
    }

    public void onCreate(Logger logger) {
        this.file = logger.get((byte) 0) * 762633321;
        this.url = logger.get((byte) 0) * -987674161;
        this.path = logger.get(-556147451) * -1925772207;
        this.state = logger.get((byte) 0) * 2007783389;
        this.title = logger.get(-1558241223) * -739181407;
        this.position = logger.get((byte) 0) * -1162729349;
        this.name = logger.get(-1641859816) * -605886135;
        this.date = logger.get((byte) 0) * 1711809891;
        this.id = logger.get(1656592900) * 1520527667;
        this.status = logger.get((byte) 0) * 863138649;
        add(-1405952515);
    }

    public void onCreate(Logger logger, byte b) {
        try {
            this.file = logger.get((byte) 0) * 762633321;
            this.url = logger.get((byte) 0) * -987674161;
            this.path = logger.get(2077245335) * -1925772207;
            this.state = logger.get((byte) 0) * 2007783389;
            this.title = logger.get(-956810211) * -739181407;
            this.position = logger.get((byte) 0) * -1162729349;
            this.name = logger.get(195211316) * -605886135;
            this.date = logger.get((byte) 0) * 1711809891;
            this.id = logger.get(-211655699) * 1520527667;
            this.status = logger.get((byte) 0) * 863138649;
            add(-285723637);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dp.ay(" + ')');
        }
    }

    public int[] onCreate(int i, int i2, int i3) {
        if (!toString(i, i2, i3, 387364513)) {
            return null;
        }
        return new int[]{(((this.name * 1385578048) - (1433349184 * this.path)) + i2) + ((this.date * 1234444888) - (-456277080 * this.state)), (((this.id * -1708228928) - (this.title * 922343488)) + i3) + ((this.status * 595928904) - (this.position * -839141992))};
    }

    public int[] run(int i, int i2, int i3) {
        if (!toString(i, i2, i3, -1677769150)) {
            return null;
        }
        return new int[]{(((this.name * 1385578048) - (1433349184 * this.path)) + i2) + ((this.date * 1234444888) - (-456277080 * this.state)), (((this.id * -1708228928) - (this.title * 922343488)) + i3) + ((this.status * 595928904) - (this.position * -839141992))};
    }

    void setObserver() {
    }

    public Method toString(int i, int i2) {
        if (!toString(i, i2, -1079577919)) {
            return null;
        }
        return new Method(this.file * -1965692128, (((-93710225 * this.path) - (2083773884 * this.name)) + i) + ((-1847845091 * this.state) - (this.date * 1940925801)), (((this.title * 1698968483) - (-424965759 * this.id)) + i2) + ((this.position * -839141992) - (this.status * 1248875480)));
    }

    public void toString(Arrays arrays) {
        if (-1176403883 * arrays.value > this.name * 692738297) {
            arrays.value = this.name * -100246290;
        }
        if (arrays.type * -1898460017 < this.name * 692738297) {
            arrays.type = this.name * -1428500391;
        }
        if (-668436401 * arrays.path > this.id * -2077768864) {
            arrays.path = this.id * 1184435349;
        }
        if (-519973341 * arrays.title < 912833019 * this.id) {
            arrays.title = this.id * -66302391;
        }
    }

    public void toString(Arrays arrays, int i) {
        try {
            if (-1332676195 * arrays.value > this.name * 692738297) {
                arrays.value = this.name * -377840627;
            }
            if (arrays.type * 845527457 < this.name * 692738297) {
                arrays.type = this.name * -1428500391;
            }
            if (-668436401 * arrays.path > this.id * 912833019) {
                arrays.path = this.id * 1184435349;
            }
            if (-519973341 * arrays.title < this.id * 912833019) {
                arrays.title = this.id * -66302391;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dp.af(" + ')');
        }
    }

    public boolean toString(int i, int i2, int i3) {
        try {
            if (i >= ((this.date * 1764918347) << 3) + ((this.name * 692738297) << 6)) {
                if (i <= (((this.date * 1764918347) << 3) + ((this.name * 692738297) << 6)) + 7) {
                    if (i2 >= ((this.id * 912833019) << 6) + ((this.status * 74491113) << 3)) {
                        if (i2 <= (((this.status * 74491113) << 3) + ((this.id * 912833019) << 6)) + 7) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dp.an(" + ')');
        }
    }

    public boolean toString(int i, int i2, int i3, int i4) {
        try {
            if (i >= this.file * -339840039) {
                if (i >= (this.url * 180952367) + (this.file * -339840039)) {
                    return false;
                }
                if (i2 >= ((this.path * 156613809) << 6) + ((this.state * -593905547) << 3)) {
                    if (i2 <= (((this.state * -593905547) << 3) + ((this.path * 156613809) << 6)) + 7) {
                        if (i3 >= ((this.title * 551282529) << 6) + ((this.position * 2042590899) << 3)) {
                            if (i3 <= (((this.title * 551282529) << 6) + ((2042590899 * this.position) << 3)) + 7) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dp.ad(" + ')');
        }
    }

    public int[] toString(int i, int i2, int i3, byte b) {
        try {
            if (!toString(i, i2, i3, -1613572239)) {
                return null;
            }
            int[] $r1 = new int[2];
            $r1[0] = (((this.name * 1385578048) - (1433349184 * this.path)) + i2) + ((this.date * 1234444888) - (-456277080 * this.state));
            $r1[1] = (((this.id * -1708228928) - (this.title * 922343488)) + i3) + ((this.status * 595928904) - (this.position * -839141992));
            return $r1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dp.aa(" + ')');
        }
    }

    public Method update(int i, int i2, int i3) {
        try {
            return !toString(i, i2, -399318461) ? null : new Method(this.file * -339840039, (((1433349184 * this.path) - (1385578048 * this.name)) + i) + ((-456277080 * this.state) - (this.date * 1234444888)), (((this.title * 922343488) - (-1708228928 * this.id)) + i2) + ((this.position * -839141992) - (this.status * 595928904)));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dp.ag(" + ')');
        }
    }

    public boolean update(int i, int i2) {
        return i >= ((1764918347 * this.date) << 3) + ((this.name * 692738297) << 6) && i <= (((this.date * -2091404393) << 3) + ((this.name * 692738297) << 6)) + 7 && i2 >= ((365266133 * this.id) << 6) + ((74491113 * this.status) << 3) && i2 <= (((643163261 * this.status) << 3) + ((912833019 * this.id) << 6)) + 7;
    }
}
