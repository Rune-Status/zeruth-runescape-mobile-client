package p000;

/* compiled from: ba */
public class StringBuilder extends BitSet {
    public static final int ATTENDEES_INDEX_RELATIONSHIP = 3;
    public static final int DEFAULT_EDNS_PAYLOADSIZE = 1280;
    static final int Id_uneval = 13;
    static final int MASK = 1020;
    static List f283a;
    static HttpRequest data;
    static Properties settings;
    BitMatrix[] size;

    StringBuilder(Class classR, Class classR2, int i, boolean z) {
        try {
            BitSet bitSet = this;
            Iterator $r3 = new Iterator();
            this.size = new BitMatrix[classR.add(i, 263009488)];
            int[] $r5 = classR.getKey(i, -1179433539);
            for (int $i2 = 0; $i2 < $r5.length; $i2++) {
                byte[] $r6 = classR.get(i, $r5[$i2], -94701410);
                int $i3 = ($r6[1] & (short) 255) | (($r6[0] & (short) 255) << 8);
                PolynomialGF2mSmallM $r8 = (PolynomialGF2mSmallM) $r3.get();
                while ($r8 != null) {
                    if ($i3 == -1591590409 * $r8.name) {
                        break;
                    }
                    $r8 = (PolynomialGF2mSmallM) $r3.next();
                }
                $r8 = null;
                if ($r8 == null) {
                    $r8 = new PolynomialGF2mSmallM($i3, z ? classR2.add(0, $i3, 39825946) : classR2.add($i3, 0, 1371752079));
                    $r3.toString($r8);
                }
                this.size[$r5[$i2]] = new BitMatrix($r6, $r8);
            }
        } catch (Throwable $r11) {
            throw StringBuilder.append($r11, "ba.<init>(" + ')');
        }
    }

    public static Wrapper append(Throwable th, String $r0) {
        if (!(th instanceof Wrapper)) {
            return new Wrapper(th, $r0);
        }
        try {
            Wrapper $r2 = (Wrapper) th;
            $r2.value += ' ' + $r0;
            return $r2;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ba.ad(" + ')');
        }
    }

    public static StringBuilder apply(Class classR, Class classR2, int i, boolean z) {
        int[] $r2 = classR.getKey(i, 698977882);
        boolean $z1 = true;
        for (int $i2 : $r2) {
            int $i22;
            byte[] $r3 = classR.add(i, $i22, 149941467);
            if ($r3 == null) {
                $z1 = false;
            } else {
                $i22 = ($r3[1] & (short) 255) | (($r3[0] & (short) 255) << 8);
                if ((z ? classR2.add(0, $i22, -1922015631) : classR2.add($i22, 0, 67825600)) == null) {
                    $z1 = false;
                }
            }
        }
        if (!$z1) {
            return null;
        }
        try {
            return new StringBuilder(classR, classR2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean get(int r7, int r8) {
        /*
        r0 = p000.Action.length;
        r8 = r0.this$0;	 Catch:{ RuntimeException -> 0x0022 }
        r1 = -1010613707; // 0xffffffffc3c34235 float:-390.51724 double:NaN;
        r8 = r8 * r1;
        if (r7 < r8) goto L_0x0014;
    L_0x000a:
        r0 = p000.Action.value;
        r8 = r0.this$0;	 Catch:{ RuntimeException -> 0x0022 }
        r1 = -1010613707; // 0xffffffffc3c34235 float:-390.51724 double:NaN;
        r8 = r8 * r1;
        if (r7 <= r8) goto L_0x001e;
    L_0x0014:
        r0 = p000.Action.data;
        r8 = r0.this$0;	 Catch:{ RuntimeException -> 0x0022 }
        r1 = -1010613707; // 0xffffffffc3c34235 float:-390.51724 double:NaN;
        r8 = r8 * r1;
        if (r7 != r8) goto L_0x0020;
    L_0x001e:
        r1 = 1;
        return r1;
    L_0x0020:
        r1 = 0;
        return r1;
    L_0x0022:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "ba.ag(";
        r3 = r3.append(r4);
        r1 = 41;
        r3 = r3.append(r1);
        r5 = r3.toString();
        r6 = p000.StringBuilder.append(r2, r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: StringBuilder.get(int, int):boolean");
    }

    static void load(int i) {
        i = Database.size * -1675758365;
        int[] $r0 = Database.next;
        int $i1 = 0;
        while ($i1 < i) {
            try {
                if (1640838373 * client.f402r != $r0[$i1]) {
                    if ($r0[$i1] == client.flags * -1522892003) {
                        continue;
                    } else {
                        Class.toString(client.size[$r0[$i1]], true, 1104315898);
                    }
                }
                $i1++;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ba.cb(" + ')');
            }
        }
    }

    public static StringBuilder reverse(Class classR, Class classR2, int i, boolean z) {
        int[] $r2 = classR.getKey(i, 404736423);
        boolean $z1 = true;
        for (int $i2 : $r2) {
            int $i22;
            byte[] $r3 = classR.add(i, $i22, -1606660199);
            if ($r3 == null) {
                $z1 = false;
            } else {
                $i22 = ($r3[1] & -1842743163) | (($r3[0] & 193620583) << 8);
                if ((z ? classR2.add(0, $i22, -1292225819) : classR2.add($i22, 0, 1722847281)) == null) {
                    $z1 = false;
                }
            }
        }
        if (!$z1) {
            return null;
        }
        try {
            return new StringBuilder(classR, classR2, i, z);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean add(int i) {
        return this.size[i].parent;
    }

    public boolean add(int i, byte b) {
        try {
            return this.size[i].parent;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ba.ad(" + ')');
        }
    }

    public boolean get(int i) {
        return this.size[i].parent;
    }

    public boolean toArray(int i) {
        return this.size[i].parent;
    }
}
