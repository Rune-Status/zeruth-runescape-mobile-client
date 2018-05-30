package p000;

/* compiled from: ao */
public class Hashtable implements Converter {
    static final int ATTENDEES_INDEX_RELATIONSHIP = 3;
    static final Hashtable f129a = new Hashtable(0, 0);
    static final Hashtable f130h = new Hashtable(1, 2);
    static final Hashtable f131i = new Hashtable(2, 1);
    static System[] name;
    final int address;
    public final int value;

    Hashtable(int $i0, int i) {
        try {
            this.value = -572521813 * $i0;
            this.address = -1110913981 * i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ao.<init>(" + ')');
        }
    }

    static void add(byte b) {
        try {
            if (Msg.get(-1679128282)) {
                Contact.f101i = true;
            }
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "ao.ax(" + ')');
        }
    }

    public static final int get(int $i0, double d) {
        double $d2 = ((double) (($i0 >> 8) & 255)) / 256.0d;
        double $d3 = ((double) ($i0 & 255)) / 256.0d;
        try {
            double $d1 = Math.pow(((double) (($i0 >> 16) & 255)) / 256.0d, d);
            return (((((int) ($d1 * 256.0d)) << 16) + (((int) (Math.pow($d2, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow($d3, d)))) | (-16777216 & $i0);
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "ao.bb(" + ')');
        }
    }

    static Double get(boolean z, boolean z2, short s) {
        return z ? z2 ? CharArray.f37a : Contact.f96c : z2 ? Contact.f107v : Build$VERSION.value;
    }

    public static boolean get(int i, byte b) {
        int $i2 = 0;
        if (ByteString.count[i]) {
            return true;
        }
        if (!Dictionary.buffer.replace(i, 2328865)) {
            return false;
        }
        int $i4 = Dictionary.buffer.add(i, -870843897);
        if ($i4 == 0) {
            ByteString.count[i] = true;
            return true;
        }
        if (Float.size[i] == null) {
            Float.size[i] = new System[$i4];
        }
        while ($i2 < $i4) {
            if (Float.size[i][$i2] == null) {
                try {
                    byte[] $r9 = Dictionary.buffer.get(i, $i2, 366685550);
                    if ($r9 != null) {
                        Float.size[i][$i2] = new System();
                        int $i3 = ((i << 16) + $i2) * 1337491127;
                        int i2 = $i3;
                        Float.size[i][$i2].value = $i3;
                        if ((byte) -1 == $r9[0]) {
                            Float.size[i][$i2].init((Logger) new Logger($r9), (byte) 72);
                        } else {
                            Float.size[i][$i2].init((Logger) new Logger($r9), -918986700);
                        }
                    } else {
                        continue;
                    }
                } catch (RuntimeException $r1) {
                    throw StringBuilder.append($r1, "ao.aa(" + ')');
                }
            }
            $i2++;
        }
        ByteString.count[i] = true;
        return true;
    }

    public static void read(Class classR, int $i0, int i, int i2, boolean z, int i3) {
        MultiInputStream.index = 63807465;
        ParserHelper.index = classR;
        DirCache.value = -1919717083 * $i0;
        MultiInputStream.value = -2021257265 * i;
        FieldInfo.index = -1734207119 * i2;
        Time.index = z;
        AssertionError.name = 37492880;
    }

    public static int toString(CharSequence charSequence, int $i0, int i) {
        try {
            return Node.decode(charSequence, $i0, true, (byte) -20);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ao.an(" + ')');
        }
    }

    public int get() {
        return this.address * -1563893653;
    }

    public int get(int i) {
        try {
            return this.address * -1563893653;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ao.af(" + ')');
        }
    }

    public int read() {
        return this.address * -1563893653;
    }

    public int write() {
        return this.address * -1563893653;
    }
}
