package p000;

/* compiled from: mf */
public class MultiInputStream {
    static final int WINDOW_UPDATE_THRESHOLD = 32768;
    public static Class buffer;
    public static Class data;
    public static Class in;
    public static int index = 0;
    public static Window this$0;
    public static int value;

    MultiInputStream() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mf.<init>(" + ')');
        }
    }

    public static void add() {
        if (-219207591 * index == 1) {
            try {
                int $i0 = this$0.open(-1279327527);
                if ($i0 > 0) {
                    if (this$0.apply(1809919242)) {
                        $i0 -= 187074473 * AssertionError.name;
                        if ($i0 < 0) {
                            $i0 = 0;
                        }
                        this$0.write($i0, 1868131861);
                        return;
                    }
                }
                this$0.write(-1686415269);
                this$0.transform(2141847191);
                if (ParserHelper.index != null) {
                    index = 127614930;
                } else {
                    index = 0;
                }
                Coordinate.value = null;
                HyperlinkRecord.offset = null;
            } catch (Throwable $r2) {
                ((Exception) $r2).printStackTrace();
                this$0.write(-900740764);
                index = 0;
                Coordinate.value = null;
                HyperlinkRecord.offset = null;
                ParserHelper.index = null;
            }
        }
    }

    public static void advance() {
        this$0.write(-1699545795);
        index = 63807465;
        ParserHelper.index = null;
    }

    public static void advance(int $i0) {
        index = -1886561380;
        ParserHelper.index = null;
        DirCache.value = -364563073;
        value = 2021257265;
        FieldInfo.index = 0;
        Time.index = false;
        AssertionError.name = -1720706710 * $i0;
    }

    public static void close() {
        this$0.write(-1364242175);
        index = 63807465;
        ParserHelper.index = null;
    }

    public static void close(int $i0) {
        index = 63807465;
        ParserHelper.index = null;
        DirCache.value = 1980223073;
        value = -478603149;
        FieldInfo.index = 0;
        Time.index = false;
        AssertionError.name = 1758792857 * $i0;
    }

    public static boolean close(Class classR, Class classR2, Class classR3, Window window) {
        data = classR;
        buffer = classR2;
        in = classR3;
        this$0 = window;
        return true;
    }

    static final void init(int $i4, int i, int i2, int i3, boolean z, int i4) {
        File $r2 = client.context.this$0.get(-1764990504);
        if (i2 < 1) {
            i2 = 1;
        }
        if (i3 < 1) {
            i3 = 1;
        }
        i4 = i3 - 334;
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > 100) {
            i4 = 100;
        }
        int $i3 = (((client.instance - client.TAG) * i4) / 100) + client.TAG;
        short $i8 = ((i3 * $i3) * 512) / (i2 * 334);
        short $s6;
        short $s7;
        if ($i8 < client.last) {
            $s6 = client.last;
            $i3 = (($s6 * i2) * 334) / (i3 * 512);
            if ($i3 > client.left) {
                $s7 = client.left;
                $i3 = (i2 - ((($s7 * i3) * 512) / ($s6 * 334))) / 2;
                if (z) {
                    $r2.clear(1936327021);
                    $r2.add($i4, i, $i3, i3, 0, (byte) -26);
                    $r2.add((i2 + $i4) - $i3, i, $i3, i3, 0, (byte) -18);
                }
                $i4 += $i3;
                i2 -= $i3 * 2;
                $i3 = $s7;
            }
        } else if ($i8 > client.max) {
            $s6 = client.max;
            $i3 = (($s6 * i2) * 334) / (i3 * 512);
            if ($i3 < client.line) {
                $s7 = client.line;
                $i3 = (i3 - ((($s6 * i2) * 334) / ($s7 * 512))) / 2;
                if (z) {
                    $r2.clear(1332593365);
                    $r2.add($i4, i, i2, $i3, 0, (byte) 45);
                    $r2.add($i4, (i3 + i) - $i3, i2, $i3, 0, (byte) -29);
                }
                i += $i3;
                i3 -= $i3 * 2;
                short $i32 = $s7;
            }
        }
        client.helper = (((($i3 * i3) * (client.counter + (((client.order - client.counter) * i4) / 100))) / 85504) << 1) * 149399939;
        if (!(i2 == 2140963035 * client.mCurrent && i3 == client.page * -1949120505)) {
            try {
                int[] $r3 = new int[9];
                for (i4 = 0; i4 < 9; i4++) {
                    $i3 = ((i4 * 32) + Constants.f93X) + 15;
                    $r3[i4] = (Point.f197x[$i3] * (($i3 * 3) + 600)) >> 16;
                }
                Log.init($r3, 500, 800, i2, i3);
            } catch (Throwable $r5) {
                throw StringBuilder.append($r5, "mf.cp(" + ')');
            }
        }
        client.mColor = -1499570369 * $i4;
        client.mType = 2053056623 * i;
        client.mCurrent = -1982104749 * i2;
        client.page = 549856695 * i3;
    }

    public static boolean prepare(Class classR, Class classR2, Class classR3, Window window) {
        data = classR;
        buffer = classR2;
        in = classR3;
        this$0 = window;
        return true;
    }

    public static void read() {
        if (1988454940 * index == 1) {
            try {
                int $i0 = this$0.open(-544969185);
                if ($i0 > 0) {
                    if (this$0.apply(-25053610)) {
                        $i0 -= 187074473 * AssertionError.name;
                        if ($i0 < 0) {
                            $i0 = 0;
                        }
                        this$0.write($i0, -1240670658);
                        return;
                    }
                }
                this$0.write(-1028841199);
                this$0.transform(876140417);
                if (ParserHelper.index != null) {
                    index = 127614930;
                } else {
                    index = 0;
                }
                Coordinate.value = null;
                HyperlinkRecord.offset = null;
            } catch (Throwable $r2) {
                ((Exception) $r2).printStackTrace();
                this$0.write(-1412604777);
                index = 0;
                Coordinate.value = null;
                HyperlinkRecord.offset = null;
                ParserHelper.index = null;
            }
        }
    }

    public static void read(int $i0) {
        index = 63807465;
        ParserHelper.index = null;
        DirCache.value = 1919717083;
        value = 2021257265;
        FieldInfo.index = 0;
        Time.index = false;
        AssertionError.name = 1758792857 * $i0;
    }

    public static void read(int $i0, Class classR, String str, String str2, int $i1, boolean z) {
        int $i2 = classR.get(str, 1710583586);
        int $i3 = classR.get($i2, str2, 2019821647);
        index = 1456756545;
        ParserHelper.index = classR;
        DirCache.value = $i2 * -1919717083;
        value = -2021257265 * $i3;
        FieldInfo.index = -1734207119 * $i1;
        Time.index = z;
        AssertionError.name = 1758792857 * $i0;
    }

    public static void read(Class classR, int $i0, int i, int i2, boolean z) {
        index = 63807465;
        ParserHelper.index = classR;
        DirCache.value = 1579188871 * $i0;
        value = 683620456 * i;
        FieldInfo.index = 1157076141 * i2;
        Time.index = z;
        AssertionError.name = 656342154;
    }

    public static void skip() {
        this$0.write(-2050232874);
        index = 63807465;
        ParserHelper.index = null;
    }

    public static void update(Class classR, int $i0, int i, int i2, boolean z) {
        index = 63807465;
        ParserHelper.index = classR;
        DirCache.value = -1919717083 * $i0;
        value = -2021257265 * i;
        FieldInfo.index = 1891212107 * i2;
        Time.index = z;
        AssertionError.name = 37492880;
    }
}
