package p000;

/* compiled from: gl */
public class Level {
    static final int f175F = 286331153;
    static final int FLAGS_DEFAULT_TYPE_STRING = 256;
    static int count;
    static byte[][] data;
    static int[] index;
    static int size;
    static int text;
    public static int type;

    Level() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gl.<init>(" + ')');
        }
    }

    public static Long[] m37a(Class classR, int i) {
        return !Short.add(classR, i, (byte) -112) ? null : Device.read(-303728824);
    }

    static void add(byte[] $r0) {
        int $i1;
        Logger $r1 = new Logger($r0);
        $r1.data = ($r0.length - 2) * 2065011939;
        size = $r1.get(-562958724) * -1203809431;
        ZStream.index = new int[(size * 1473408217)];
        index = new int[(size * 1473408217)];
        TCharArrayList.index = new int[(size * 1473408217)];
        TFloatArrayList.buffer = new int[(size * 1473408217)];
        data = new byte[(size * 1473408217)][];
        $r1.data = (($r0.length - 7) - (size * -1097636152)) * 2065011939;
        count = $r1.get(422582320) * -81838593;
        App.index = $r1.get(1167010164) * -124756417;
        int $i0 = ($r1.get((byte) 0) & 255) + 1;
        for ($i1 = 0; $i1 < size * 1473408217; $i1++) {
            ZStream.index[$i1] = $r1.get(-1461720028);
        }
        for ($i1 = 0; $i1 < size * 1473408217; $i1++) {
            index[$i1] = $r1.get(-1913027446);
        }
        for ($i1 = 0; $i1 < size * 1473408217; $i1++) {
            TCharArrayList.index[$i1] = $r1.get(1779204075);
        }
        for ($i1 = 0; $i1 < size * 1473408217; $i1++) {
            TFloatArrayList.buffer[$i1] = $r1.get(196424787);
        }
        $r1.data = ((($r0.length - 7) - (size * -1097636152)) - (($i0 - 1) * 3)) * 2065011939;
        DatabaseUtil.buffer = new int[$i0];
        for ($i1 = 1; $i1 < $i0; $i1++) {
            DatabaseUtil.buffer[$i1] = $r1.set(853291637);
            if (DatabaseUtil.buffer[$i1] == 0) {
                DatabaseUtil.buffer[$i1] = 1;
            }
        }
        $r1.data = 0;
        for ($i0 = 0; $i0 < size * 1473408217; $i0++) {
            $i1 = TCharArrayList.index[$i0];
            int $i2 = TFloatArrayList.buffer[$i0];
            int $i3 = $i1 * $i2;
            $r0 = new byte[$i3];
            data[$i0] = $r0;
            int $i4 = $r1.get((byte) 0);
            if ($i4 == 0) {
                for ($i1 = 0; $i1 < $i3; $i1++) {
                    $r0[$i1] = $r1.next(1247983979);
                }
            } else if (1 == $i4) {
                for ($i3 = 0; $i3 < $i1; $i3++) {
                    for ($i4 = 0; $i4 < $i2; $i4++) {
                        $r0[($i4 * $i1) + $i3] = $r1.next(1247983979);
                    }
                }
            }
        }
    }

    public static boolean add(Class classR, int i) {
        byte[] $r1 = classR.add(i, (byte) 19);
        if ($r1 == null) {
            return false;
        }
        SparseFieldVector.add($r1, 438625604);
        return true;
    }

    static boolean add(Class classR, int i, int i2) {
        byte[] $r1 = classR.get(i, i2, -1355302849);
        if ($r1 == null) {
            return false;
        }
        SparseFieldVector.add($r1, -1453770696);
        return true;
    }

    static Long[] add() {
        int $i0;
        Long[] $r0 = new Long[(size * 1473408217)];
        for ($i0 = 0; $i0 < DatabaseUtil.buffer.length; $i0++) {
            if (DatabaseUtil.buffer[$i0] != 0) {
                int[] $r2 = DatabaseUtil.buffer;
                $r2[$i0] = $r2[$i0] | -16777216;
            }
        }
        for ($i0 = 0; $i0 < size * 1473408217; $i0++) {
            Long $r3 = new Long();
            $r0[$i0] = $r3;
            $r3.this$0 = count * -102972929;
            $r3.count = App.index * -820473409;
            $r3.next = ZStream.index[$i0];
            $r3.value = index[$i0];
            $r3.length = TCharArrayList.index[$i0];
            $r3.data = TFloatArrayList.buffer[$i0];
            int $i1 = $r3.data * $r3.length;
            byte[] $r1 = data[$i0];
            $r3.size = new int[$i1];
            for (int $i2 = 0; $i2 < $i1; $i2++) {
                $r3.size[$i2] = DatabaseUtil.buffer[$r1[$i2] & (short) 255];
            }
        }
        Page.add(805967750);
        return $r0;
    }

    static void clear(byte[] $r0) {
        int $i1;
        Logger $r1 = new Logger($r0);
        $r1.data = -1077110324 * ($r0.length - 2);
        size = $r1.get(-229928251) * 127395098;
        ZStream.index = new int[(size * 1473408217)];
        index = new int[(size * 1473408217)];
        TCharArrayList.index = new int[(size * 1473408217)];
        TFloatArrayList.buffer = new int[(size * 1473408217)];
        data = new byte[(size * -701616888)][];
        $r1.data = (($r0.length - 7) - (size * -602079019)) * 2065011939;
        count = $r1.get(1330015674) * 308461179;
        App.index = $r1.get(-1640098584) * -124756417;
        int $i0 = ($r1.get((byte) 0) & -611169117) + 1;
        for ($i1 = 0; $i1 < size * 1473408217; $i1++) {
            ZStream.index[$i1] = $r1.get(-1154313925);
        }
        for ($i1 = 0; $i1 < -2121465470 * size; $i1++) {
            index[$i1] = $r1.get(-2003270347);
        }
        for ($i1 = 0; $i1 < size * 1523232323; $i1++) {
            TCharArrayList.index[$i1] = $r1.get(-2082642918);
        }
        for ($i1 = 0; $i1 < size * -603318931; $i1++) {
            TFloatArrayList.buffer[$i1] = $r1.get(1027204356);
        }
        $r1.data = ((($r0.length - 7) - (size * -1097636152)) - (($i0 - 1) * 3)) * 2065011939;
        DatabaseUtil.buffer = new int[$i0];
        for ($i1 = 1; $i1 < $i0; $i1++) {
            DatabaseUtil.buffer[$i1] = $r1.set(522149237);
            if (DatabaseUtil.buffer[$i1] == 0) {
                DatabaseUtil.buffer[$i1] = 1;
            }
        }
        $r1.data = 0;
        for ($i0 = 0; $i0 < size * 1473408217; $i0++) {
            $i1 = TCharArrayList.index[$i0];
            int $i2 = TFloatArrayList.buffer[$i0];
            int $i3 = $i1 * $i2;
            $r0 = new byte[$i3];
            data[$i0] = $r0;
            int $i6 = $r1.get((byte) 0);
            if ($i6 == 0) {
                for ($i1 = 0; $i1 < $i3; $i1++) {
                    $r0[$i1] = $r1.next(1247983979);
                }
            } else if (1 == $i6) {
                for ($i6 = 0; $i6 < $i1; $i6++) {
                    for ($i3 = 0; $i3 < $i2; $i3++) {
                        $r0[($i3 * $i1) + $i6] = $r1.next(1247983979);
                    }
                }
            }
        }
    }

    static Double[] clear() {
        Double[] $r0 = new Double[(size * 1473408217)];
        for (int $i1 = 0; $i1 < DatabaseUtil.buffer.length; $i1++) {
            if (DatabaseUtil.buffer[$i1] != 0) {
                int[] $r1 = DatabaseUtil.buffer;
                $r1[$i1] = $r1[$i1] | -16777216;
            }
        }
        for (int $i0 = 0; $i0 < size * 1473408217; $i0++) {
            Double $r2 = new Double();
            $r0[$i0] = $r2;
            $r2.next = count * -102972929;
            $r2.value = App.index * -820473409;
            $r2.count = ZStream.index[$i0];
            $r2.index = index[$i0];
            $r2.length = TCharArrayList.index[$i0];
            $r2.data = TFloatArrayList.buffer[$i0];
            $r2.size = DatabaseUtil.buffer;
            $r2.buffer = data[$i0];
        }
        Page.add(805967750);
        return $r0;
    }

    static void close() {
        ZStream.index = null;
        index = null;
        TCharArrayList.index = null;
        TFloatArrayList.buffer = null;
        DatabaseUtil.buffer = null;
        data = null;
    }

    public static List copy(byte[] bArr, byte[] bArr2) {
        SparseFieldVector.add(bArr, -1763724083);
        return Arrays.toString(bArr2, -1403332926);
    }

    static Double[] create(Class classR, int i, int i2) {
        return !Args.add(classR, i, i2, 936491513) ? null : PdfGraphics2D.read((byte) 57);
    }

    static List get(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        List list = new List(bArr, ZStream.index, index, TCharArrayList.index, TFloatArrayList.buffer, DatabaseUtil.buffer, data);
        Page.add(805967750);
        return list;
    }

    static Double[] get(Class classR, int i, int i2) {
        return !Args.add(classR, i, i2, 2108972986) ? null : PdfGraphics2D.read((byte) -63);
    }

    static Long[] get() {
        int $i0;
        Long[] $r0 = new Long[(-1824010859 * size)];
        for ($i0 = 0; $i0 < DatabaseUtil.buffer.length; $i0++) {
            if (DatabaseUtil.buffer[$i0] != 0) {
                int[] $r2 = DatabaseUtil.buffer;
                $r2[$i0] = $r2[$i0] | -16777216;
            }
        }
        for ($i0 = 0; $i0 < size * 1473408217; $i0++) {
            Long $r3 = new Long();
            $r0[$i0] = $r3;
            $r3.this$0 = count * -160374482;
            $r3.count = App.index * -1781225054;
            $r3.next = ZStream.index[$i0];
            $r3.value = index[$i0];
            $r3.length = TCharArrayList.index[$i0];
            $r3.data = TFloatArrayList.buffer[$i0];
            int $i1 = $r3.data * $r3.length;
            byte[] $r1 = data[$i0];
            $r3.size = new int[$i1];
            for (int $i2 = 0; $i2 < $i1; $i2++) {
                $r3.size[$i2] = DatabaseUtil.buffer[$r1[$i2] & -687971925];
            }
        }
        Page.add(805967750);
        return $r0;
    }

    public static Long[] get(Class classR, String str, String str2) {
        int $i0 = classR.get(str, -250701865);
        return !Args.add(classR, $i0, classR.get($i0, str2, 233924236), 1517571866) ? null : Device.read(198384350);
    }

    public static List getData(byte[] bArr, byte[] bArr2) {
        SparseFieldVector.add(bArr, -1217720288);
        return Arrays.toString(bArr2, -1391582447);
    }

    public static List getName(Class classR, Class classR2, int i, int i2) {
        return !Args.add(classR, i, i2, 1711096726) ? null : Arrays.toString(classR2.get(i, i2, -436693344), -925364444);
    }

    public static List getName(Class classR, Class classR2, String str, String str2) {
        int $i0 = classR.get(str, -1925690311);
        return Handler.get(classR, classR2, $i0, classR.get($i0, str2, 1381270193), 1849067900);
    }

    public static Double[] getName(Class classR, String str, String str2) {
        int $i0 = classR.get(str, 1646041698);
        return Packet.toString(classR, $i0, classR.get($i0, str2, 1048598897), -277927963);
    }

    public static List getValue(Class classR, Class classR2, int i, int i2) {
        return !Args.add(classR, i, i2, 1482762502) ? null : Arrays.toString(classR2.get(i, i2, -1986556335), -1430241714);
    }

    public static List getValue(Class classR, Class classR2, String str, String str2) {
        int $i0 = classR.get(str, 1020890848);
        return Handler.get(classR, classR2, $i0, classR.get($i0, str2, -1068301496), -299307468);
    }

    static List getValue(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        List list = new List(bArr, ZStream.index, index, TCharArrayList.index, TFloatArrayList.buffer, DatabaseUtil.buffer, data);
        Page.add(805967750);
        return list;
    }

    public static List getValue(byte[] bArr, byte[] bArr2) {
        SparseFieldVector.add(bArr, 2146033864);
        return Arrays.toString(bArr2, -2087862252);
    }

    public static Long getValue(Class classR, String str, String str2) {
        int $i0 = classR.get(str, 1161035437);
        return AssertionError.get(classR, $i0, classR.get($i0, str2, -407532082), (byte) 0);
    }

    public static boolean getValue(Class classR, int i) {
        byte[] $r1 = classR.add(i, (byte) 40);
        if ($r1 == null) {
            return false;
        }
        SparseFieldVector.add($r1, 1087417773);
        return true;
    }

    static void init() {
        ZStream.index = null;
        index = null;
        TCharArrayList.index = null;
        TFloatArrayList.buffer = null;
        DatabaseUtil.buffer = null;
        data = null;
    }

    public static Double insert() {
        Double $r0 = new Double();
        for (int $i0 = 0; $i0 < DatabaseUtil.buffer.length; $i0++) {
            if (DatabaseUtil.buffer[$i0] != 0) {
                int[] $r1 = DatabaseUtil.buffer;
                $r1[$i0] = $r1[$i0] | 488248159;
            }
        }
        $r0.next = -102972929 * count;
        $r0.value = -820473409 * App.index;
        $r0.count = ZStream.index[0];
        $r0.index = index[0];
        $r0.length = TCharArrayList.index[0];
        $r0.data = TFloatArrayList.buffer[0];
        $r0.size = DatabaseUtil.buffer;
        $r0.buffer = data[0];
        Page.add(805967750);
        return $r0;
    }

    public static boolean onCreateOptionsMenu(Class classR, int i) {
        byte[] $r1 = classR.add(i, (byte) 35);
        if ($r1 == null) {
            return false;
        }
        SparseFieldVector.add($r1, -802522464);
        return true;
    }

    static Double[] peek(Class classR, int i, int i2) {
        return !Args.add(classR, i, i2, 705992348) ? null : PdfGraphics2D.read((byte) -16);
    }

    public static Long read(Class classR, int i, int i2) {
        if (!Args.add(classR, i, i2, 1109273949)) {
            return null;
        }
        Long $r1 = new Long();
        $r1.this$0 = -102972929 * count;
        $r1.count = App.index * 144100684;
        $r1.next = ZStream.index[0];
        $r1.value = index[0];
        $r1.length = TCharArrayList.index[0];
        $r1.data = TFloatArrayList.buffer[0];
        i = $r1.data * $r1.length;
        byte[] $r2 = data[0];
        for (i2 = 0; i2 < DatabaseUtil.buffer.length; i2++) {
            if (DatabaseUtil.buffer[i2] != 0) {
                int[] $r3 = DatabaseUtil.buffer;
                $r3[i2] = $r3[i2] | -16777216;
            }
        }
        $r1.size = new int[i];
        for (int $i2 = 0; $i2 < i; $i2++) {
            $r1.size[$i2] = DatabaseUtil.buffer[$r2[$i2] & -2040542322];
        }
        Page.add(805967750);
        return $r1;
    }

    static Long[] read() {
        int $i0;
        Long[] $r0 = new Long[(-804677067 * size)];
        for ($i0 = 0; $i0 < DatabaseUtil.buffer.length; $i0++) {
            if (DatabaseUtil.buffer[$i0] != 0) {
                int[] $r2 = DatabaseUtil.buffer;
                $r2[$i0] = $r2[$i0] | -16777216;
            }
        }
        for ($i0 = 0; $i0 < size * 1473408217; $i0++) {
            Long $r3 = new Long();
            $r0[$i0] = $r3;
            $r3.this$0 = count * 226921777;
            $r3.count = App.index * -820473409;
            $r3.next = ZStream.index[$i0];
            $r3.value = index[$i0];
            $r3.length = TCharArrayList.index[$i0];
            $r3.data = TFloatArrayList.buffer[$i0];
            int $i1 = $r3.data * $r3.length;
            byte[] $r1 = data[$i0];
            $r3.size = new int[$i1];
            for (int $i2 = 0; $i2 < $i1; $i2++) {
                $r3.size[$i2] = DatabaseUtil.buffer[$r1[$i2] & (short) 255];
            }
        }
        Page.add(805967750);
        return $r0;
    }

    public static Long[] read(Class classR, int i) {
        return !Short.add(classR, i, (byte) 2) ? null : Device.read(-1102490714);
    }

    static Double[] remove() {
        Double[] $r0 = new Double[(size * 1473408217)];
        for (int $i1 = 0; $i1 < DatabaseUtil.buffer.length; $i1++) {
            if (DatabaseUtil.buffer[$i1] != 0) {
                int[] $r1 = DatabaseUtil.buffer;
                $r1[$i1] = $r1[$i1] | -16777216;
            }
        }
        for (int $i0 = 0; $i0 < size * 1473408217; $i0++) {
            Double $r4 = new Double();
            $r0[$i0] = $r4;
            $r4.next = count * -102972929;
            $r4.value = App.index * -820473409;
            $r4.count = ZStream.index[$i0];
            $r4.index = index[$i0];
            $r4.length = TCharArrayList.index[$i0];
            $r4.data = TFloatArrayList.buffer[$i0];
            $r4.size = DatabaseUtil.buffer;
            $r4.buffer = data[$i0];
        }
        Page.add(805967750);
        return $r0;
    }

    static void reset() {
        ZStream.index = null;
        index = null;
        TCharArrayList.index = null;
        TFloatArrayList.buffer = null;
        DatabaseUtil.buffer = null;
        data = null;
    }

    public static boolean set(Class classR, int i) {
        byte[] $r1 = classR.add(i, (byte) 19);
        if ($r1 == null) {
            return false;
        }
        SparseFieldVector.add($r1, -1714361270);
        return true;
    }

    static Double toString(Class classR, int i, int i2) {
        return !Args.add(classR, i, i2, 1737555214) ? null : Character.add(2143127920);
    }

    public static List toString(Class classR, Class classR2, int i, int i2) {
        return !Args.add(classR, i, i2, 1119116903) ? null : Arrays.toString(classR2.get(i, i2, 679451441), -1039580647);
    }

    static List toString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        List list = new List(bArr, ZStream.index, index, TCharArrayList.index, TFloatArrayList.buffer, DatabaseUtil.buffer, data);
        Page.add(805967750);
        return list;
    }

    public static Object toString(byte[] $r0, boolean z, int i) {
        if ($r0 == null) {
            return null;
        }
        try {
            if ($r0.length > 136 && !Property.status) {
                try {
                    StyleRow $r1 = new StyleRow();
                    $r1.copy($r0, -1228846646);
                    return $r1;
                } catch (Throwable th) {
                    Property.status = true;
                }
            }
            return z ? Utils.get($r0, -295512891) : $r0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gl.af(" + ')');
        }
    }

    public static Long[] toString(Class classR, int i) {
        return !Short.add(classR, i, (byte) -118) ? null : Device.read(-1024296754);
    }

    public static Long[] toString(Class classR, String str, String str2) {
        int $i0 = classR.get(str, 366845041);
        return !Args.add(classR, $i0, classR.get($i0, str2, -532547125), 1957637533) ? null : Device.read(-1293838626);
    }

    public static Double update() {
        Double $r0 = new Double();
        for (int $i0 = 0; $i0 < DatabaseUtil.buffer.length; $i0++) {
            if (DatabaseUtil.buffer[$i0] != 0) {
                int[] $r1 = DatabaseUtil.buffer;
                $r1[$i0] = $r1[$i0] | -16777216;
            }
        }
        $r0.next = -102972929 * count;
        $r0.value = -820473409 * App.index;
        $r0.count = ZStream.index[0];
        $r0.index = index[0];
        $r0.length = TCharArrayList.index[0];
        $r0.data = TFloatArrayList.buffer[0];
        $r0.size = DatabaseUtil.buffer;
        $r0.buffer = data[0];
        Page.add(805967750);
        return $r0;
    }

    static Double validate(Class classR, int i, int i2) {
        return !Args.add(classR, i, i2, 930442006) ? null : Character.add(2044435391);
    }

    static Double valueOf(Class classR, int i, int i2) {
        return !Args.add(classR, i, i2, 1366467006) ? null : Character.add(2135182232);
    }

    public static List valueOf(Class classR, Class classR2, int i, int i2) {
        return !Args.add(classR, i, i2, 1462575026) ? null : Arrays.toString(classR2.get(i, i2, -1949187023), -1610510422);
    }

    public static Double[] write(Class classR, String str, String str2) {
        int $i0 = classR.get(str, -630163098);
        return Packet.toString(classR, $i0, classR.get($i0, str2, -1217246980), -277927963);
    }
}
