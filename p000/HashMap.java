package p000;

/* compiled from: ft */
public abstract class HashMap {
    HashMap() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ft.<init>(" + ')');
        }
    }

    static final void add(boolean z, int i) {
        if (z) {
            client.f391g = Contact.f106s ? C0002f.f412i : C0002f.f410b;
            return;
        }
        try {
            client.f391g = Main.this$0.map.containsKey(Integer.valueOf(IntegerPolynomial.add(Contact.text, (byte) 7))) ? C0002f.f415p : C0002f.f411g;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ft.bh(" + ')');
        }
    }

    static boolean decode(CharSequence charSequence, int i, boolean z, int i2) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("");
        }
        int $i6 = charSequence.length();
        i2 = 0;
        int $i2 = 0;
        boolean $z1 = false;
        boolean $z2 = false;
        while (i2 < $i6) {
            try {
                int $i4;
                char $c3 = charSequence.charAt(i2);
                if (i2 == 0) {
                    if ('-' == $c3) {
                        $z2 = true;
                        $i4 = $i2;
                    } else if ('+' == $c3 && z) {
                        $i4 = $i2;
                    }
                    i2++;
                    $i2 = $i4;
                }
                if ($c3 >= '0' && $c3 <= '9') {
                    $i4 = $c3 - 48;
                } else if ($c3 >= 'A' && $c3 <= 'Z') {
                    $i4 = $c3 - 55;
                } else if ($c3 < 'a' || $c3 > 'z') {
                    return false;
                } else {
                    $i4 = $c3 - 87;
                }
                if ($i4 >= i) {
                    return false;
                }
                if ($z2) {
                    $i4 = -$i4;
                }
                $i4 += $i2 * i;
                if ($i4 / i != $i2) {
                    return false;
                }
                $z1 = true;
                i2++;
                $i2 = $i4;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ft.ad(" + ')');
            }
        }
        return $z1;
    }

    static void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int $i2, int i4, int i5, int i6) {
        $i2 = -$i2;
        i6 = i;
        i = i2;
        while ($i2 < 0) {
            i2 = (i + i3) - 3;
            while (i < i2) {
                int $i7 = i + 1;
                int $i8 = i6 + 1;
                iArr[i] = iArr2[i6];
                i = $i7 + 1;
                i6 = $i8 + 1;
                iArr[$i7] = iArr2[$i8];
                $i7 = i + 1;
                $i8 = i6 + 1;
                try {
                    iArr[i] = iArr2[i6];
                    i = $i7 + 1;
                    i6 = $i8 + 1;
                    iArr[$i7] = iArr2[$i8];
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "ft.az(" + ')');
                }
            }
            i2 += 3;
            while (i < i2) {
                $i8 = i6 + 1;
                iArr[i] = iArr2[i6];
                i++;
                i6 = $i8;
            }
            i6 += i5;
            $i2++;
            i += i4;
        }
    }

    public static int update(int i, int i2, int i3) {
        i3 = i >>> 31;
        try {
            return ((i3 + i) / i2) - i3;
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "ft.an(" + ')');
        }
    }

    public abstract void clear();

    public abstract void clear(int i);

    public abstract Server containsKey();

    public void filter() {
        get((byte) -54).get(1199110531);
        get(938113793).add(530135724);
    }

    public abstract File get();

    public abstract File get(int i);

    public abstract Point get(byte b);

    public abstract void get(int i, int i2);

    public abstract void get(int i, int i2, int i3);

    public abstract Point getEntry();

    public abstract Server getKey();

    public abstract void insert();

    public abstract Server keys();

    public abstract void push(int i, int i2);

    public abstract Point put();

    public abstract void put(int i, int i2);

    public abstract void put(int i, int i2, int i3);

    public abstract void put(int i, int i2, int i3, int i4);

    public abstract void put(int i, int i2, int i3, int i4, byte b);

    public abstract void remove();

    public abstract void remove(int i, int i2);

    public abstract Server toString(int i);

    public abstract void toString(int i, int i2);

    public void update() {
        get((byte) -106).get(-2045891699);
        get(-281726618).add(530135724);
    }

    public void update(byte b) {
        try {
            get((byte) -122).get(-756299969);
            get(-1199560407).add(530135724);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ft.ag(" + ')');
        }
    }

    public abstract File values();
}
