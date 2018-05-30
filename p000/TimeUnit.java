package p000;

/* compiled from: gt */
public class TimeUnit {
    public static final TimeUnit $assertionsDisabled = new TimeUnit(7);
    static final TimeUnit HOURS = new TimeUnit(11);
    static final TimeUnit MICROSECONDS = new TimeUnit(3);
    public static final int TAG_AUDIO = 32;
    static int f317a;
    public static final TimeUnit activity = new TimeUnit(5);
    public static final TimeUnit context = new TimeUnit(9);
    public static final TimeUnit count = new TimeUnit(2);
    public static final TimeUnit data = new TimeUnit(12);
    static final TimeUnit file = new TimeUnit(4);
    static final TimeUnit owner = new TimeUnit(1);
    static final TimeUnit text = new TimeUnit(6);
    public static final TimeUnit this$0 = new TimeUnit(10);
    static final TimeUnit type = new TimeUnit(0);
    static final TimeUnit values = new TimeUnit(8);
    final int name;

    TimeUnit(int $i0) {
        try {
            this.name = -2110653131 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gt.<init>(" + ')');
        }
    }

    static int add(byte b) {
        if (client.iterator != null) {
            try {
                if (client.tail * -427906923 < client.iterator.size()) {
                    int $i1 = 0;
                    for (int $i2 = 0; $i2 <= client.tail * -427906923; $i2++) {
                        $i1 += ((LongArray) client.iterator.get($i2)).size * -1368840285;
                    }
                    return ($i1 * Geometry.UNKNOWN_INT) / (-1160977331 * client.currentIndex);
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "gt.au(" + ')');
            }
        }
        return Geometry.UNKNOWN_INT;
    }

    public static byte[] decode(CharSequence charSequence, int i) {
        try {
            i = charSequence.length();
            byte[] $r1 = new byte[i];
            for (int $i1 = 0; $i1 < i; $i1++) {
                char $c2 = charSequence.charAt($i1);
                if (($c2 > '\u0000' && $c2 < '') || ($c2 >= ' ' && $c2 <= 'ÿ')) {
                    $r1[$i1] = (byte) $c2;
                } else if ('€' == $c2) {
                    $r1[$i1] = Byte.MIN_VALUE;
                } else if ('‚' == $c2) {
                    $r1[$i1] = (byte) -126;
                } else if ('ƒ' == $c2) {
                    $r1[$i1] = (byte) -125;
                } else if ('„' == $c2) {
                    $r1[$i1] = (byte) -124;
                } else if ('…' == $c2) {
                    $r1[$i1] = (byte) -123;
                } else if ('†' == $c2) {
                    $r1[$i1] = (byte) -122;
                } else if ($c2 == '‡') {
                    $r1[$i1] = (byte) -121;
                } else if ('ˆ' == $c2) {
                    $r1[$i1] = (byte) -120;
                } else if ($c2 == '‰') {
                    $r1[$i1] = (byte) -119;
                } else if ('Š' == $c2) {
                    $r1[$i1] = (byte) -118;
                } else if ($c2 == '‹') {
                    $r1[$i1] = (byte) -117;
                } else if ('Œ' == $c2) {
                    $r1[$i1] = (byte) -116;
                } else if ($c2 == 'Ž') {
                    $r1[$i1] = (byte) -114;
                } else if ('‘' == $c2) {
                    $r1[$i1] = (byte) -111;
                } else if ('’' == $c2) {
                    $r1[$i1] = (byte) -110;
                } else if ($c2 == '“') {
                    $r1[$i1] = (byte) -109;
                } else if ('”' == $c2) {
                    $r1[$i1] = (byte) -108;
                } else if ('•' == $c2) {
                    $r1[$i1] = (byte) -107;
                } else if ('–' == $c2) {
                    $r1[$i1] = (byte) -106;
                } else if ('—' == $c2) {
                    $r1[$i1] = (byte) -105;
                } else if ('˜' == $c2) {
                    $r1[$i1] = (byte) -104;
                } else if ('™' == $c2) {
                    $r1[$i1] = (byte) -103;
                } else if ($c2 == 'š') {
                    $r1[$i1] = (byte) -102;
                } else if ('›' == $c2) {
                    $r1[$i1] = (byte) -101;
                } else if ('œ' == $c2) {
                    $r1[$i1] = (byte) -100;
                } else if ('ž' == $c2) {
                    $r1[$i1] = (byte) -98;
                } else if ('Ÿ' == $c2) {
                    $r1[$i1] = (byte) -97;
                } else {
                    $r1[$i1] = (byte) 63;
                }
            }
            return $r1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gt.ad(" + ')');
        }
    }

    static void read(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i6 = iArr2[i5];
                if (i6 != 0) {
                    i5 = (16711935 & i6) * i12;
                    i7 = ((((i6 * i12) - i5) & 16711680) + (i5 & -16711936)) >>> 8;
                    try {
                        i6 = iArr[i4];
                        i5 = i7 + i6;
                        i6 = (i7 & 16711935) + (i6 & 16711935);
                        i7 = ((i5 - i6) & PingManager.STATE_SENSOR_ON_FLAG) + (i6 & 16777472);
                        i6 = i4 + 1;
                        iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "gt.ap(" + ')');
                    }
                }
                i6 = i4 + 1;
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }
}
