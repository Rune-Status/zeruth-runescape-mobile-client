package p000;

import java.util.Comparator;

/* compiled from: cr */
public class Document implements Comparator {
    static HttpRequest data;
    static Double f115y;
    final boolean start;

    public Document(boolean z) {
        try {
            this.start = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cr.<init>(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void add(boolean r16, int r17) {
        /*
        r1 = p000.MappedRandomAccessFile.buffer;
        if (r1 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r2 = new Logger;
        r3 = 4;
        r2.<init>(r3);	 Catch:{ IOException -> 0x0027, RuntimeException -> 0x003f }
        if (r16 == 0) goto L_0x005a;
    L_0x000d:
        r4 = 2;
    L_0x000e:
        r3 = 31;
        r2.append(r4, r3);	 Catch:{ IOException -> 0x0027, RuntimeException -> 0x003f }
        r3 = 0;
        r5 = 1462828146; // 0x5730fc72 float:1.94598291E14 double:7.227331327E-315;
        r2.append(r3, r5);	 Catch:{ IOException -> 0x0027, RuntimeException -> 0x003f }
        r1 = p000.MappedRandomAccessFile.buffer;
        r6 = r2.size;
        r3 = 0;
        r5 = 4;
        r7 = -1743832022; // 0xffffffff980f3c2a float:-1.8512692E-24 double:NaN;
        r1.add(r6, r3, r5, r7);	 Catch:{ IOException -> 0x0027, RuntimeException -> 0x003f }
        return;
    L_0x0027:
        r8 = move-exception;
        r1 = p000.MappedRandomAccessFile.buffer;
        r3 = -31;
        r1.get(r3);	 Catch:{ Exception -> 0x005c, RuntimeException -> 0x003f }
    L_0x002f:
        r17 = p000.MappedRandomAccessFile.start;
        r3 = 2083888617; // 0x7c359de9 float:3.772034E36 double:1.0295777754E-314;
        r0 = r17;
        r0 = r0 + r3;
        r17 = r0;
        p000.MappedRandomAccessFile.start = r17;
        r9 = 0;
        p000.MappedRandomAccessFile.buffer = r9;
        return;
    L_0x003f:
        r10 = move-exception;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = "cr.af(";
        r11 = r11.append(r12);
        r3 = 41;
        r11 = r11.append(r3);
        r13 = r11.toString();
        r14 = p000.StringBuilder.append(r10, r13);
        throw r14;
    L_0x005a:
        r4 = 3;
        goto L_0x000e;
    L_0x005c:
        r15 = move-exception;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: Document.add(boolean, int):void");
    }

    public static String decode(long j) {
        if (j <= 0) {
            return null;
        }
        if (j >= 6582952005840035281L) {
            return null;
        }
        if (0 == j % 37) {
            return null;
        }
        long $l3;
        int $i2 = 0;
        for ($l3 = j; 0 != $l3; $l3 /= 37) {
            $i2++;
        }
        try {
            StringBuilder $r0 = new StringBuilder($i2);
            while (j != 0) {
                $l3 = j / 37;
                long $l0 = j - (37 * $l3);
                j = $l0;
                $r0.append(UrlBase64.length[(int) $l0]);
                j = $l3;
            }
            return $r0.reverse().toString();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cr.af(" + 41);
        }
    }

    static int encode(int $i0, int $i2, int i) {
        if ($i0 == -2) {
            return 12345678;
        }
        if ($i0 == -1) {
            if ($i2 < 0) {
                $i2 = 0;
            } else if ($i2 > 127) {
                $i2 = 127;
            }
            return 127 - $i2;
        }
        $i2 = (($i0 & 127) * $i2) / Constants.f93X;
        if ($i2 < 2) {
            $i2 = 2;
        } else if ($i2 > 126) {
            $i2 = 126;
        }
        return $i2 + (65408 & $i0);
    }

    static final void init(Handler handler, int i, int i2) {
        try {
            i2 = handler.data * 1978945739;
            Database.data = 0;
            Parser.read(handler, (short) 210);
            Tag.run(handler, -1089562734);
            if ((handler.data * 1978945739) - i2 != i) {
                throw new RuntimeException(((handler.data * 1978945739) - i2) + " " + i);
            }
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cr.ad(" + ')');
        }
    }

    int add(Coordinate coordinate, Coordinate coordinate2) {
        return this.start ? (coordinate.f35y * 2046794799) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * 1807028887);
    }

    int add(Coordinate coordinate, Coordinate coordinate2, int i) {
        try {
            return this.start ? (coordinate.f35y * 2046794799) - (coordinate2.f35y * 2046794799) : (coordinate2.f35y * 2046794799) - (coordinate.f35y * 2046794799);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cr.af(" + ')');
        }
    }

    public int add(Object obj, Object obj2) {
        return add((Coordinate) obj, (Coordinate) obj2, 1639202246);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return add((Coordinate) obj, (Coordinate) obj2, 1322010932);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cr.compare(" + ')');
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cr.equals(" + ')');
        }
    }

    public boolean handleAsByteArray(Object obj) {
        return super.equals(obj);
    }

    public boolean holds(Object obj) {
        return super.equals(obj);
    }

    public int parse(Object obj, Object obj2) {
        return add((Coordinate) obj, (Coordinate) obj2, 1979102503);
    }

    int write(Coordinate coordinate, Coordinate coordinate2) {
        return this.start ? (coordinate.f35y * 2046794799) - (coordinate2.f35y * -351395839) : (84028463 * coordinate2.f35y) - (coordinate.f35y * 2046794799);
    }

    public int write(Object obj, Object obj2) {
        return add((Coordinate) obj, (Coordinate) obj2, 1172505342);
    }
}
