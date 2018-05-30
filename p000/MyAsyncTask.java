package p000;

/* compiled from: df */
public class MyAsyncTask implements Key {
    static Long[] data;
    static Resources this$0;
    static FileInfo value;
    int activity;
    int content;
    int date;
    int file;
    int id;
    int message;
    int name;
    int path;
    int result;
    int text;
    int timestamp;
    int title;
    int type;
    int view;

    MyAsyncTask() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "df.<init>(" + ')');
        }
    }

    static void init(char c, int i) {
        boolean $z0 = true;
        boolean $z1 = false;
        if (2 == Contact.f109y * 1773673955) {
            i = 0;
            while (i < Contact.points.length()) {
                try {
                    if (c == Contact.points.charAt(i)) {
                        $z1 = true;
                        break;
                    }
                    i++;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "df.as(" + ')');
                }
            }
            if ($z1) {
                if (Contact.f108x * -2099968095 == 0) {
                    if (Contact.text.length() < 320) {
                        Contact.text += c;
                    }
                } else if (Contact.f108x * -2099968095 == 1) {
                    if (Contact.data.length() < 20) {
                        Contact.data += c;
                    }
                }
            }
        } else if (4 == Contact.f109y * 1773673955) {
            for (i = 0; i < Contact.image.length(); i++) {
                if (c == Contact.image.charAt(i)) {
                    break;
                }
            }
            $z0 = false;
            if ($z0) {
                if (Context.value.length() < 6) {
                    Context.value += c;
                }
            }
        } else if (5 == Contact.f109y * 1773673955) {
            for (i = 0; i < Contact.points.length(); i++) {
                if (c == Contact.points.charAt(i)) {
                    break;
                }
            }
            $z0 = false;
            if ($z0) {
                if (Contact.text.length() < 320) {
                    Contact.text += c;
                }
            }
        }
    }

    static void read(int i, Properties properties, HttpRequest httpRequest, int i2) {
        try {
            Program $r2 = new Program();
            $r2.name = 913720689;
            $r2.size = (long) i;
            $r2.size = properties;
            $r2.value = httpRequest;
            Channel.this$0.write($r2, (byte) -42);
            Channel.this$0.start(602581061);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "df.af(" + ')');
        }
    }

    public int[] compareTo(int i, int $i1, int i2) {
        if (!toString(i, $i1, i2, 49213731)) {
            return null;
        }
        return new int[]{((-604004975 * this.date) - (346459864 * this.path)) + (((-1674513472 * this.file) - (978651257 * this.name)) + $i1), (((this.id * 138139328) - (345485888 * this.activity)) + i2) + ((722706472 * this.text) - (-1361550503 * this.view))};
    }

    public Method equals(int $i0, int $i1) {
        if (!toString($i0, $i1, 266275966)) {
            return null;
        }
        return new Method(this.result * 1614019961, ((346459864 * this.path) - (-766601896 * this.date)) + (((this.name * 583019072) - (this.file * -1674513472)) + $i0), ((this.view * 2018013928) - (this.text * 722706472)) + (((345485888 * this.activity) - (138139328 * this.id)) + $i1));
    }

    public void equals(Arrays arrays) {
        if (-1332676195 * arrays.value > this.file * -1972321329) {
            arrays.value = -50176677 * this.file;
        }
        if (845527457 * arrays.type < this.file * -1972321329) {
            arrays.type = 1203103599 * this.file;
        }
        if (arrays.path * -668436401 > this.id * -199168165) {
            arrays.path = this.id * 1637271861;
        }
        if (arrays.title * -519973341 < this.id * -199168165) {
            arrays.title = -1734235799 * this.id;
        }
    }

    public boolean equals(int i, int i2, int i3) {
        if (i >= this.result * 1614019961) {
            if (i >= (this.result * 1614019961) + (-1842130103 * this.type)) {
                return false;
            }
            if (i2 >= ((this.name * 1753940137) << 6) + ((-1030434341 * this.path) << 3) && i2 <= (((this.name * 1753940137) << 6) + ((1316382147 * this.content) << 3)) + 7 && i3 >= ((this.activity * 542269129) << 6) + ((-1895231907 * this.view) << 3) && i3 <= (((-1113816667 * this.title) << 3) + ((this.activity * 542269129) << 6)) + 7) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(int i, int i2, int i3) {
        if (i >= 1325204823 * this.result) {
            if (i >= (this.result * 1614019961) + (-1842130103 * this.type)) {
                return false;
            }
            if (i2 >= ((1159626366 * this.name) << 6) + ((-488252220 * this.path) << 3) && i2 <= (((this.name * 1753940137) << 6) + ((-1162836217 * this.content) << 3)) + 7 && i3 >= ((-1510338854 * this.activity) << 6) + ((-376295700 * this.view) << 3) && i3 <= (((-309589399 * this.title) << 3) + ((this.activity * -2121508479) << 6)) + 7) {
                return true;
            }
        }
        return false;
    }

    public Method get(int $i0, int $i1) {
        if (!toString($i0, $i1, -1106085455)) {
            return null;
        }
        return new Method(this.result * 1614019961, ((346459864 * this.path) - (-766601896 * this.date)) + (((this.name * 583019072) - (this.file * -1674513472)) + $i0), ((this.view * 2018013928) - (this.text * 722706472)) + (((345485888 * this.activity) - (138139328 * this.id)) + $i1));
    }

    public boolean get(int i, int i2, int i3) {
        if (i >= -672195514 * this.result) {
            if (i >= (this.result * 952656885) + (34106564 * this.type)) {
                return false;
            }
            if (i2 >= ((this.name * 1753940137) << 6) + ((-1831631409 * this.path) << 3) && i2 <= (((this.name * 1753940137) << 6) + ((255587968 * this.content) << 3)) + 7 && i3 >= ((957964600 * this.activity) << 6) + ((990296009 * this.view) << 3) && i3 <= (((-976116637 * this.title) << 3) + ((this.activity * 542269129) << 6)) + 7) {
                return true;
            }
        }
        return false;
    }

    void init() {
    }

    void init(int i) {
    }

    public boolean init(int i, int i2, int i3) {
        if (i >= this.result * 1614019961) {
            if (i >= (this.result * 1614019961) + (-1842130103 * this.type)) {
                return false;
            }
            if (i2 >= ((this.name * 1753940137) << 6) + ((-1030434341 * this.path) << 3) && i2 <= (((this.name * 1753940137) << 6) + ((1316382147 * this.content) << 3)) + 7 && i3 >= ((this.activity * 542269129) << 6) + ((-1895231907 * this.view) << 3) && i3 <= (((-1113816667 * this.title) << 3) + ((this.activity * 542269129) << 6)) + 7) {
                return true;
            }
        }
        return false;
    }

    public int[] onClick(int i, int $i1, int i2) {
        if (!toString(i, $i1, i2, -764866815)) {
            return null;
        }
        return new int[]{((-766601896 * this.date) - (346459864 * this.path)) + (((-1674513472 * this.file) - (583019072 * this.name)) + $i1), (((this.id * 138139328) - (345485888 * this.activity)) + i2) + ((722706472 * this.text) - (2018013928 * this.view))};
    }

    public Method onCreate(int $i0, int $i1) {
        if (!toString($i0, $i1, -295856003)) {
            return null;
        }
        return new Method(this.result * 1614019961, ((346459864 * this.path) - (-766601896 * this.date)) + (((this.name * 583019072) - (this.file * -1674513472)) + $i0), ((this.view * 2018013928) - (this.text * 722706472)) + (((345485888 * this.activity) - (138139328 * this.id)) + $i1));
    }

    public void onCreate(Arrays arrays) {
        if (-1332676195 * arrays.value > this.file * -1972321329) {
            arrays.value = -50176677 * this.file;
        }
        if (845527457 * arrays.type < this.file * -1972321329) {
            arrays.type = 1203103599 * this.file;
        }
        if (arrays.path * -668436401 > this.id * -199168165) {
            arrays.path = this.id * 1637271861;
        }
        if (arrays.title * -519973341 < this.id * -199168165) {
            arrays.title = -1734235799 * this.id;
        }
    }

    public void onCreate(Logger logger) {
        this.result = logger.get((byte) 0) * 1873468617;
        this.type = logger.get((byte) 0) * -346681607;
        this.name = logger.get(-2099023608) * 991536025;
        this.path = logger.get((byte) 0) * -1314340269;
        this.content = logger.get((byte) 0) * 1397076715;
        this.activity = logger.get(-1927049004) * 797055865;
        this.view = logger.get((byte) 0) * -804506123;
        this.title = logger.get((byte) 0) * 1771470381;
        this.file = logger.get(176673384) * -1426234577;
        this.date = logger.get((byte) 0) * 740792323;
        this.message = logger.get((byte) 0) * 1024149527;
        this.id = logger.get(2009551605) * -1392138029;
        this.text = logger.get((byte) 0) * 237517005;
        this.timestamp = logger.get((byte) 0) * 94351113;
        init(-249810479);
    }

    public void onCreate(Logger logger, byte b) {
        try {
            this.result = logger.get((byte) 0) * 1873468617;
            this.type = logger.get((byte) 0) * -346681607;
            this.name = logger.get(1540792039) * 991536025;
            this.path = logger.get((byte) 0) * -1314340269;
            this.content = logger.get((byte) 0) * 1397076715;
            this.activity = logger.get(1505889889) * 797055865;
            this.view = logger.get((byte) 0) * -804506123;
            this.title = logger.get((byte) 0) * 1771470381;
            this.file = logger.get(-973478428) * -1426234577;
            this.date = logger.get((byte) 0) * 740792323;
            this.message = logger.get((byte) 0) * 1024149527;
            this.id = logger.get(1179999877) * -1392138029;
            this.text = logger.get((byte) 0) * 237517005;
            this.timestamp = logger.get((byte) 0) * 94351113;
            init(324251440);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "df.ay(" + ')');
        }
    }

    public int[] onCreate(int i, int $i1, int i2) {
        if (!toString(i, $i1, i2, 1653209088)) {
            return null;
        }
        return new int[]{((-766601896 * this.date) - (346459864 * this.path)) + (((-1674513472 * this.file) - (1521909283 * this.name)) + $i1), (((this.id * 1661038667) - (1032491541 * this.activity)) + i2) + ((1582804986 * this.text) - (1016572878 * this.view))};
    }

    void postResultIfNotInvoked() {
    }

    void publishProgress() {
    }

    public int[] run(int i, int $i1, int i2) {
        if (!toString(i, $i1, i2, -157141558)) {
            return null;
        }
        return new int[]{((-766601896 * this.date) - (346459864 * this.path)) + (((-1674513472 * this.file) - (583019072 * this.name)) + $i1), (((this.id * 138139328) - (345485888 * this.activity)) + i2) + ((722706472 * this.text) - (2018013928 * this.view))};
    }

    public Method toString(int $i0, int $i1) {
        if (!toString($i0, $i1, -1634694630)) {
            return null;
        }
        return new Method(this.result * 1614019961, ((346459864 * this.path) - (-766601896 * this.date)) + (((this.name * 583019072) - (this.file * -1674513472)) + $i0), ((this.view * 2018013928) - (this.text * 722706472)) + (((345485888 * this.activity) - (138139328 * this.id)) + $i1));
    }

    public void toString(Arrays arrays) {
        if (-1332676195 * arrays.value > this.file * -1972321329) {
            arrays.value = -50176677 * this.file;
        }
        if (845527457 * arrays.type < this.file * -1972321329) {
            arrays.type = 1203103599 * this.file;
        }
        if (arrays.path * -668436401 > this.id * -199168165) {
            arrays.path = this.id * 1637271861;
        }
        if (arrays.title * -519973341 < this.id * -199168165) {
            arrays.title = -1734235799 * this.id;
        }
    }

    public void toString(Arrays arrays, int i) {
        try {
            if (-1332676195 * arrays.value > this.file * -1972321329) {
                arrays.value = -50176677 * this.file;
            }
            if (845527457 * arrays.type < this.file * -1972321329) {
                arrays.type = 1203103599 * this.file;
            }
            if (arrays.path * -668436401 > this.id * -199168165) {
                arrays.path = this.id * 1637271861;
            }
            if (arrays.title * -519973341 < this.id * -199168165) {
                arrays.title = -1734235799 * this.id;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "df.af(" + ')');
        }
    }

    public boolean toString(int i, int i2, int i3) {
        try {
            if (i >= ((this.file * -1972321329) << 6) + ((977916587 * this.date) << 3)) {
                if (i <= (((this.message * 1559130023) << 3) + ((this.file * -1972321329) << 6)) + 7) {
                    if (i2 >= ((this.id * -199168165) << 6) + ((this.text * -983403515) << 3)) {
                        if (i2 <= (((this.timestamp * 1716293433) << 3) + ((this.id * -199168165) << 6)) + 7) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "df.an(" + ')');
        }
    }

    public boolean toString(int i, int i2, int i3, int i4) {
        try {
            if (i >= this.result * 1614019961) {
                if (i >= (this.result * 1614019961) + (-1842130103 * this.type)) {
                    return false;
                }
                if (i2 >= ((this.name * 1753940137) << 6) + ((-1030434341 * this.path) << 3)) {
                    if (i2 <= (((this.name * 1753940137) << 6) + ((1316382147 * this.content) << 3)) + 7) {
                        if (i3 >= ((this.activity * 542269129) << 6) + ((-1895231907 * this.view) << 3)) {
                            if (i3 <= (((-1113816667 * this.title) << 3) + ((this.activity * 542269129) << 6)) + 7) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "df.ad(" + ')');
        }
    }

    public int[] toString(int i, int $i1, int i2, byte b) {
        try {
            if (!toString(i, $i1, i2, -1387239309)) {
                return null;
            }
            int[] $r1 = new int[2];
            $r1[0] = ((-766601896 * this.date) - (346459864 * this.path)) + (((-1674513472 * this.file) - (583019072 * this.name)) + $i1);
            $r1[1] = (((this.id * 138139328) - (345485888 * this.activity)) + i2) + ((722706472 * this.text) - (2018013928 * this.view));
            return $r1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "df.aa(" + ')');
        }
    }

    public Method update(int $i0, int $i1, int i) {
        try {
            return !toString($i0, $i1, -1526547592) ? null : new Method(this.result * 1614019961, ((346459864 * this.path) - (-766601896 * this.date)) + (((this.name * 583019072) - (this.file * -1674513472)) + $i0), ((this.view * 2018013928) - (this.text * 722706472)) + (((345485888 * this.activity) - (138139328 * this.id)) + $i1));
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "df.ag(" + ')');
        }
    }

    public boolean update(int i, int i2) {
        return i >= ((1739629697 * this.file) << 6) + ((977916587 * this.date) << 3) && i <= (((this.message * 1559130023) << 3) + ((this.file * -1785375294) << 6)) + 7 && i2 >= ((-300867028 * this.id) << 6) + ((this.text * 1066933588) << 3) && i2 <= (((this.timestamp * 1716293433) << 3) + ((-312930906 * this.id) << 6)) + 7;
    }
}
