package p000;

/* compiled from: cs */
public class Main {
    public static final int ALIGNMENT = 16;
    static final int NORMAL_LINE = 5;
    static final int REQUEST_EDIT_TAG = 1;
    static int f203a;
    static boolean active = true;
    static int f204b;
    public static int count = 0;
    public static boolean data = false;
    public static boolean f205e = false;
    static int f206i;
    public static int size = 0;
    public static int text = 0;
    static SearchActivity this$0;
    public static long[] value = new long[1000];
    static int view;
    static int f207x;

    Main() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cs.<init>(" + ')');
        }
    }

    static final boolean add(Integer integer, int i, int i2, int i3, LazyList lazyList) {
        if (!data) {
            return false;
        }
        Connection.init(lazyList.this$0, 143420760);
        int $i4 = integer.f147y + i;
        int $i3 = integer.f145p + i2;
        int $i5 = integer.f143m + i3;
        i = integer.f139b;
        i2 = integer.f141g;
        int $i6 = integer.f142i;
        i3 = (-1860397235 * f206i) - $i4;
        $i3 = (343041604 * f204b) - $i3;
        $i5 = (1822668035 * f203a) - $i5;
        return Math.abs(i3) > (State.view * 1497686983) + i ? false : Math.abs($i3) > (-1966739019 * Server.name) + i2 ? false : Math.abs($i5) > (2101877851 * Level.text) + $i6 ? false : Math.abs(((GifDrawable.view * 2043038857) * $i5) - ((1499032267 * AbstractParser.view) * $i3)) > ((Server.name * -1966739019) * $i6) + ((Level.text * 772467910) * i2) ? false : Math.abs(((-1090871127 * AbstractParser.view) * i3) - ($i5 * (-185772607 * view))) > ($i6 * (1497686983 * State.view)) + ((Level.text * 1367273011) * i) ? false : Math.abs(($i3 * (-185772607 * view)) - (i3 * (GifDrawable.view * -1951369948))) <= ((1497686983 * State.view) * i2) + ((Server.name * -32641290) * i);
    }

    public static int computeDotSize(int i) {
        return (int) ((value[i] >>> 14) & 3);
    }

    public static String decode(CharSequence charSequence, int i) {
        try {
            i = charSequence.length();
            StringBuilder $r1 = new StringBuilder(i);
            for (int $i1 = 0; $i1 < i; $i1++) {
                char $c2 = charSequence.charAt($i1);
                if (($c2 >= 'a' && $c2 <= 'z') || (($c2 >= 'A' && $c2 <= 'Z') || (($c2 >= '0' && $c2 <= '9') || '.' == $c2 || '-' == $c2 || '*' == $c2 || '_' == $c2))) {
                    $r1.append($c2);
                } else if (' ' == $c2) {
                    $r1.append('+');
                } else {
                    byte $b4 = TextUtils.append($c2, -53433961);
                    $r1.append('%');
                    byte $b5 = ($b4 >> (byte) 4) & (byte) 15;
                    if ($b5 >= (byte) 10) {
                        $r1.append((char) ($b5 + 55));
                    } else {
                        $r1.append((char) ($b5 + 48));
                    }
                    $b4 &= (byte) 15;
                    if ($b4 >= (byte) 10) {
                        $r1.append((char) ($b4 + 55));
                    } else {
                        $r1.append((char) ($b4 + 48));
                    }
                }
            }
            return $r1.toString();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cs.af(" + ')');
        }
    }

    static final void doInBackground(Point point) {
        if (!f205e) {
            int $i0 = Log.f178a;
            int $i1 = Log.f187q;
            int $i2 = Log.f190t;
            int $i3 = Log.key;
            int $i4 = (((1711605139 * count) - (point.data * -1575402035)) * 50) / (point.this$0 * 542614623);
            int $i7 = (((340086283 * text) - (point.parent * 664913911)) * 50) / (point.this$0 * 899693785);
            int $i6 = (((count * -1264659246) - (point.data * -1575402035)) * 3500) / (point.this$0 * -2140315124);
            int $i8 = (((1662106129 * text) - (-1508152919 * point.parent)) * 3500) / (point.this$0 * 542614623);
            int $i5 = (($i0 * 50) + ($i1 * $i7)) >> 16;
            int $i9 = ((50 * $i1) - ($i7 * $i0)) >> 16;
            $i7 = ((3500 * $i0) + ($i8 * $i1)) >> 16;
            $i8 = (($i1 * 3500) - ($i0 * $i8)) >> 16;
            $i1 = Resource.set($i4, $i9, $i3, $i2, (byte) 0);
            $i0 = (($i9 * $i3) + ($i2 * $i4)) >> 16;
            $i4 = Resource.set($i6, $i8, $i3, $i2, (byte) 0);
            $i3 = (($i8 * $i3) + ($i2 * $i6)) >> 16;
            f206i = 364686861 * (($i1 + $i4) / 2);
            f204b = (($i7 + $i5) / 2) * 997123485;
            f203a = -793124921 * (($i0 + $i3) / 2);
            view = (($i4 - $i1) / 2) * 745474562;
            GifDrawable.view = (($i7 - $i5) / 2) * -2059736647;
            AbstractParser.view = (($i3 - $i0) / 2) * 1131621091;
            State.view = Math.abs(-185772607 * view) * 1288648736;
            Server.name = Math.abs(GifDrawable.view * 2043038857) * 179975325;
            Level.text = Math.abs(AbstractParser.view * 1320870259) * 442214226;
        }
    }

    public static int encodeLength(long $l0) {
        return (int) (($l0 >>> null) & 127);
    }

    public static int encodeTypeSize(long $l0) {
        return (int) (($l0 >>> null) & 127);
    }

    static final int generate() {
        return text * 340086283;
    }

    public static int generate(int i) {
        return (int) ((value[i] >>> 14) & 3);
    }

    static final boolean get(System system, short s) {
        try {
            if (system.pointCount == null) {
                return false;
            }
            for (int $i1 = 0; $i1 < system.pointCount.length; $i1++) {
                int $i2 = Resource.parse(system, $i1, -1274375699);
                int $i3 = system.cipher[$i1];
                if (system.pointCount[$i1] == 2) {
                    if ($i2 >= $i3) {
                        return false;
                    }
                } else if (system.pointCount[$i1] == 3) {
                    if ($i2 <= $i3) {
                        return false;
                    }
                } else if (4 == system.pointCount[$i1]) {
                    if ($i2 == $i3) {
                        return false;
                    }
                } else if ($i3 != $i2) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cs.ez(" + ')');
        }
    }

    public static int getObject(int i) {
        return Data.get(value[i]);
    }

    public static int getType(int i) {
        return Data.get(value[i]);
    }

    static final int go() {
        return text * 340086283;
    }

    public static int go(int i) {
        return Method.get(value[i]);
    }

    public static long go(int i, int i2, int i3, boolean z, int i4) {
        long $l4 = ((long) ((((i & 127) << 0) | ((495045019 & i2) << 7)) | ((i3 & 3) << 14))) | ((((long) i4) & 4294967295L) << 17);
        return z ? $l4 | 65536 : $l4;
    }

    static final boolean go(int $i0, int i, int i2, int i3, int i4, int i5, int i6) {
        int $i7 = (text * 340086283) + i6;
        if ($i7 < $i0 && $i7 < i && $i7 < i2) {
            return false;
        }
        $i7 = (-1312301177 * text) - i6;
        if ($i7 <= $i0 || $i7 <= i || $i7 <= i2) {
            $i0 = (-429386291 * count) + i6;
            if ($i0 >= i3 || $i0 >= i4 || $i0 >= i5) {
                $i0 = (-758794784 * count) - i6;
                if ($i0 <= i3 || $i0 <= i4 || $i0 <= i5) {
                    return true;
                }
            }
        }
        return false;
    }

    static final void init(Point point) {
        if (!f205e) {
            int $i0 = Log.f178a;
            int $i1 = Log.f187q;
            int $i2 = Log.f190t;
            int $i3 = Log.key;
            int $i4 = (((count * -429386291) - (point.data * 325746330)) * 50) / (point.this$0 * 542614623);
            int $i7 = (((340086283 * text) - (point.parent * -1508152919)) * 50) / (point.this$0 * 542614623);
            int $i6 = (((count * -429386291) - (1101975039 * point.data)) * 567936181) / (point.this$0 * -1162380430);
            int $i8 = (((-1732153805 * text) - (point.parent * -1508152919)) * 567936181) / (point.this$0 * 59159791);
            int $i5 = (($i0 * 50) + ($i1 * $i7)) >> 16;
            int $i9 = ((50 * $i1) - ($i7 * $i0)) >> 16;
            $i7 = ((567936181 * $i0) + ($i8 * $i1)) >> 16;
            $i8 = (($i1 * 567936181) - ($i0 * $i8)) >> 16;
            $i1 = Resource.set($i4, $i9, $i3, $i2, (byte) 0);
            $i0 = (($i9 * $i3) + ($i2 * $i4)) >> 16;
            $i4 = Resource.set($i6, $i8, $i3, $i2, (byte) 0);
            $i3 = (($i8 * $i3) + ($i2 * $i6)) >> 16;
            f206i = -1869469831 * (($i1 + $i4) / 2);
            f204b = (($i7 + $i5) / 2) * 997123485;
            f203a = 323771819 * (($i0 + $i3) / 2);
            view = (($i4 - $i1) / 2) * -1594150224;
            GifDrawable.view = (($i7 - $i5) / 2) * -1792249466;
            AbstractParser.view = (($i3 - $i0) / 2) * 2054686053;
            State.view = Math.abs(-185772607 * view) * 1225780727;
            Server.name = Math.abs(GifDrawable.view * 2043038857) * 1992265209;
            Level.text = Math.abs(AbstractParser.view * 1499032267) * 592324629;
        }
    }

    static final boolean init(Integer integer, int i, int i2, int i3, LazyList lazyList) {
        if (!data) {
            return false;
        }
        Connection.init(lazyList.this$0, 263745733);
        int $i4 = integer.f147y + i;
        int $i3 = integer.f145p + i2;
        int $i5 = integer.f143m + i3;
        i = integer.f139b;
        i2 = integer.f141g;
        int $i6 = integer.f142i;
        i3 = (-2086919111 * f206i) - $i4;
        $i3 = (276416693 * f204b) - $i3;
        $i5 = (1822668035 * f203a) - $i5;
        return Math.abs(i3) > (State.view * 1497686983) + i ? false : Math.abs($i3) > (-1966739019 * Server.name) + i2 ? false : Math.abs($i5) > (2101877851 * Level.text) + $i6 ? false : Math.abs(((GifDrawable.view * 2043038857) * $i5) - ((1499032267 * AbstractParser.view) * $i3)) > ((Server.name * -1966739019) * $i6) + ((Level.text * 2101877851) * i2) ? false : Math.abs(((1499032267 * AbstractParser.view) * i3) - ($i5 * (-185772607 * view))) > ($i6 * (1497686983 * State.view)) + ((Level.text * 2101877851) * i) ? false : Math.abs(($i3 * (-185772607 * view)) - (i3 * (GifDrawable.view * 2043038857))) <= ((1497686983 * State.view) * i2) + ((Server.name * -1966739019) * i);
    }

    public static int mul33DWordAdd(long $l0) {
        return (int) (($l0 >>> 17) & 4294967295L);
    }

    public static int mul33WordAdd(long $l0) {
        return (int) (($l0 >>> 17) & 4294967295L);
    }

    public static int mulAddTo(long $l0) {
        return (int) (($l0 >>> 17) & 4294967295L);
    }

    public static int mulByWordAddTo(long $l0) {
        return (int) (($l0 >>> 17) & 4294967295L);
    }

    public static int objectHeader(long $l0) {
        return (int) (($l0 >>> 7) & 127);
    }

    public static int ofsDelta(long $l0) {
        return (int) (($l0 >>> 7) & 127);
    }

    public static int onAppendBase(long $l0) {
        return (int) (($l0 >>> 7) & 127);
    }

    public static final void onCreate() {
        data = false;
        size = 0;
    }

    public static int onProgressChanged(int i) {
        return Data.get(value[i]);
    }

    static final int pack() {
        return text * -417008042;
    }

    public static int pack(int i) {
        return (int) ((value[i] >>> 14) & 3);
    }

    static CharSequence read(byte[] bArr, int i) {
        i = 0;
        CharSequence $r1 = new CharSequence();
        Logger $r2 = new Logger(bArr);
        byte[] $r0 = $r2.size;
        $r2.data = ($r0.length - 2) * 2065011939;
        int $i1 = $r2.get(-768011267);
        $r0 = $r2.size;
        $i1 = (($r0.length - 2) - $i1) - 12;
        $r2.data = $i1 * 2065011939;
        int $i3 = $r2.size(863760284);
        $r1.pos = $r2.get(1791941648) * -224765331;
        $r1.head = $r2.get(395560629) * -2113356825;
        $r1.size = $r2.get(-1275140535) * 347150479;
        $r1.name = $r2.get(2022319448) * -707503511;
        int $i4 = $r2.get((byte) 0);
        if ($i4 > 0) {
            $r1.offset = $r1.size($i4, -1355641844);
            int $i5 = 0;
            while ($i5 < $i4) {
                int $i6 = $r2.get(-1114506553);
                int $i7 = $i6;
                if ($i6 > 0) {
                    $i6--;
                    $i6 |= $i6 >>> 1;
                    $i6 |= $i6 >>> 2;
                    $i6 |= $i6 >>> 4;
                    $i6 |= $i6 >>> 8;
                    $i6 = ($i6 | ($i6 >>> 16)) + 1;
                } else {
                    $i6 = 1;
                }
                try {
                    Date $r5 = new Date($i6);
                    $r1.offset[$i5] = $r5;
                    while (true) {
                        $i6 = $i7 - 1;
                        if ($i7 <= 0) {
                            break;
                        }
                        long $l2 = (long) $r2.size(-876958033);
                        $r5.get(new Value($r2.size(131632459)), $l2);
                        $i7 = $i6;
                    }
                    $i5++;
                } catch (Throwable $r9) {
                    throw StringBuilder.append($r9, "cs.an(" + ')');
                }
            }
        }
        $r2.data = 0;
        $r2.write((byte) 20);
        int[] $r6 = new int[$i3];
        $r1.value = $r6;
        $r6 = new int[$i3];
        $r1.data = $r6;
        String[] $r7 = new String[$i3];
        $r1.length = $r7;
        while ($r2.data * 1978945739 < $i1) {
            $i3 = $r2.get(1183829658);
            if ($i3 == 3) {
                $r1.length[i] = $r2.toString(2059956591);
            } else if ($i3 >= 100 || 21 == $i3 || 38 == $i3 || $i3 == 39) {
                $r1.data[i] = $r2.get((byte) 0);
            } else {
                $r1.data[i] = $r2.size(-915460530);
            }
            $r1.value[i] = $i3;
            i++;
        }
        return $r1;
    }

    public static boolean readB(long $l0) {
        boolean $z0 = $l0 != 0;
        if (!$z0) {
            return $z0;
        }
        return !(((int) (($l0 >>> 16) & 1)) == 1);
    }

    static final int readSource() {
        return text * 340086283;
    }

    public static long readUint32(int i, int i2, int i3, boolean z, int i4) {
        long $l4 = ((long) ((((i & 127) << 0) | ((-999280623 & i2) << 7)) | ((i3 & 3) << 14))) | ((((long) i4) & 4294967295L) << 17);
        return z ? $l4 | 65536 : $l4;
    }

    public static long readUint32Primitive(int i, int i2, int i3, boolean z, int i4) {
        long $l4 = ((long) ((((i & 127) << 0) | ((i2 & 127) << 7)) | ((i3 & 3) << 14))) | ((((long) i4) & 4294967295L) << 17);
        return z ? $l4 | 65536 : $l4;
    }

    public static int recPtr(long $l0) {
        return (int) (($l0 >>> null) & 127);
    }

    static final void reset(Point point) {
        if (!f205e) {
            int $i0 = Log.f178a;
            int $i1 = Log.f187q;
            int $i2 = Log.f190t;
            int $i3 = Log.key;
            int $i4 = (((-429386291 * count) - (point.data * -1575402035)) * 50) / (-1357855367 * point.this$0);
            int $i7 = (((text * 340086283) - (point.parent * -1629751904)) * 50) / (point.this$0 * -1912799137);
            int $i6 = (((count * -1092651253) - (1528635400 * point.data)) * 3500) / (point.this$0 * 1342187539);
            int $i8 = (((text * 340086283) - (-1508152919 * point.parent)) * 3500) / (point.this$0 * -743610976);
            int $i5 = (($i0 * 50) + ($i1 * $i7)) >> 16;
            int $i9 = ((50 * $i1) - ($i7 * $i0)) >> 16;
            $i7 = ((3500 * $i0) + ($i8 * $i1)) >> 16;
            $i8 = (($i1 * 3500) - ($i0 * $i8)) >> 16;
            $i1 = Resource.set($i4, $i9, $i3, $i2, (byte) 0);
            $i0 = (($i9 * $i3) + ($i2 * $i4)) >> 16;
            $i4 = Resource.set($i6, $i8, $i3, $i2, (byte) 0);
            $i3 = (($i8 * $i3) + ($i2 * $i6)) >> 16;
            f206i = -1411610103 * (($i1 + $i4) / 2);
            f204b = (($i7 + $i5) / 2) * 538204334;
            f203a = 323771819 * (($i0 + $i3) / 2);
            view = (($i4 - $i1) / 2) * -516965823;
            GifDrawable.view = (($i7 - $i5) / 2) * -2059736647;
            AbstractParser.view = (($i3 - $i0) / 2) * 1874378326;
            State.view = Math.abs(-185772607 * view) * 455777963;
            Server.name = Math.abs(GifDrawable.view * 2043038857) * 179975325;
            Level.text = Math.abs(AbstractParser.view * 1570526057) * -1673626853;
        }
    }

    static final void run(Point point) {
        if (!f205e) {
            int $i0 = Log.f178a;
            int $i1 = Log.f187q;
            int $i2 = Log.f190t;
            int $i3 = Log.key;
            int $i4 = (((count * -429386291) - (point.data * -1400627097)) * -1623204618) / (point.this$0 * 542614623);
            int $i7 = (((-1723520753 * text) - (point.parent * -1508152919)) * -1623204618) / (point.this$0 * 542614623);
            int $i6 = (((count * -429386291) - (-1575402035 * point.data)) * 3500) / (point.this$0 * 542614623);
            int $i8 = (((-196645707 * text) - (-1193124379 * point.parent)) * 3500) / (point.this$0 * 542614623);
            int $i5 = (($i0 * -1623204618) + ($i1 * $i7)) >> 16;
            int $i9 = ((-1623204618 * $i1) - ($i7 * $i0)) >> 16;
            $i7 = ((3500 * $i0) + ($i8 * $i1)) >> 16;
            $i8 = (($i1 * 3500) - ($i0 * $i8)) >> 16;
            $i1 = Resource.set($i4, $i9, $i3, $i2, (byte) 0);
            $i0 = (($i9 * $i3) + ($i2 * $i4)) >> 16;
            $i4 = Resource.set($i6, $i8, $i3, $i2, (byte) 0);
            $i3 = (($i8 * $i3) + ($i2 * $i6)) >> 16;
            f206i = -1411610103 * (($i1 + $i4) / 2);
            f204b = (($i7 + $i5) / 2) * 997123485;
            f203a = 323771819 * (($i0 + $i3) / 2);
            view = (($i4 - $i1) / 2) * -279542499;
            GifDrawable.view = (($i7 - $i5) / 2) * -2059736647;
            AbstractParser.view = (($i3 - $i0) / 2) * 56968532;
            State.view = Math.abs(-185772607 * view) * 1225780727;
            Server.name = Math.abs(GifDrawable.view * -1655326417) * -1671559202;
            Level.text = Math.abs(AbstractParser.view * 1499032267) * 1200267621;
        }
    }

    public static int select(int i) {
        return Data.get(value[i]);
    }

    public static int writeVarint(long $l0) {
        return (int) (($l0 >>> 7) & 127);
    }
}
