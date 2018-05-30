package p000;

/* compiled from: js */
public class IntegerPolynomial {
    String f148a;
    int f149b;
    int f150r;
    int this$0;
    String f151x;
    int f152y;
    boolean f153z;

    IntegerPolynomial() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "js.<init>(" + ')');
        }
    }

    IntegerPolynomial(String str, String str2, int $i0, int i, int i2, int i3, boolean z) {
        try {
            this.f148a = str;
            this.f151x = str2;
            this.f149b = -715868007 * $i0;
            this.f150r = 284619463 * i;
            this.this$0 = 1048076997 * i2;
            this.f152y = -492327079 * i3;
            this.f153z = z;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "js.<init>(" + ')');
        }
    }

    public static int add(CharSequence charSequence, byte b) {
        try {
            int $i3 = 0;
            for (int $i1 = 0; $i1 < charSequence.length(); $i1++) {
                $i3 = (($i3 << 5) - $i3) + charSequence.charAt($i1);
            }
            return $i3;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "js.ar(" + ')');
        }
    }

    public static Vec3 add(int i, int i2) {
        try {
            Vec3[] $r0 = new Vec3[4];
            $r0[0] = Vec3.f354z;
            $r0[1] = Vec3.ex;
            $r0[2] = Vec3.f353y;
            $r0[3] = Vec3.next;
            for (Vec3 $r1 : $r0) {
                if (i == $r1.key * -517456315) {
                    return $r1;
                }
            }
            return null;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "js.af(" + ')');
        }
    }

    static final boolean add(Integer integer, int i, int i2, int i3, LazyList lazyList, int i4) {
        if (!Main.data) {
            return false;
        }
        try {
            Connection.init(lazyList.this$0, -1720491938);
            int $i4 = integer.f147y + i;
            i4 = integer.f145p + i2;
            int $i5 = integer.f143m + i3;
            i = integer.f139b;
            i2 = integer.f141g;
            int $i6 = integer.f142i;
            i3 = (-2086919111 * Main.f206i) - $i4;
            i4 = (276416693 * Main.f204b) - i4;
            $i5 = (1822668035 * Main.f203a) - $i5;
            if (Math.abs(i3) > (State.view * 1497686983) + i) {
                return false;
            }
            if (Math.abs(i4) > (-1966739019 * Server.name) + i2) {
                return false;
            }
            if (Math.abs($i5) > (2101877851 * Level.text) + $i6) {
                return false;
            }
            if (Math.abs(((GifDrawable.view * 2043038857) * $i5) - ((1499032267 * AbstractParser.view) * i4)) > ((Server.name * -1966739019) * $i6) + ((Level.text * 2101877851) * i2)) {
                return false;
            }
            if (Math.abs(((1499032267 * AbstractParser.view) * i3) - ($i5 * (-185772607 * Main.view))) > ($i6 * (1497686983 * State.view)) + ((Level.text * 2101877851) * i)) {
                return false;
            }
            return Math.abs((i4 * (-185772607 * Main.view)) - (i3 * (GifDrawable.view * 2043038857))) <= ((1497686983 * State.view) * i2) + ((Server.name * -1966739019) * i);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "js.am(" + ')');
        }
    }

    public static void update(String $r0, boolean z, boolean z2, byte b) {
        if (z) {
            try {
                if (DatabaseUtil.data.startsWith("win") && !z2) {
                    AsyncTask.get($r0, 0, (byte) 3);
                    return;
                } else if (DatabaseUtil.data.startsWith("mac")) {
                    Tools.add($r0, 1, "openjs", -2043536893);
                    return;
                } else {
                    AsyncTask.get($r0, 2, (byte) 3);
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "js.ad(" + ')');
            }
        }
        AsyncTask.get($r0, 3, (byte) 3);
    }

    void add(IntegerPolynomial integerPolynomial) {
        this.f148a = integerPolynomial.f148a;
        this.f151x = integerPolynomial.f151x;
        this.f149b = integerPolynomial.f149b * 1;
        this.f150r = integerPolynomial.f150r * 1;
        this.this$0 = integerPolynomial.this$0 * 1;
        this.f152y = integerPolynomial.f152y * 1;
        this.f153z = integerPolynomial.f153z;
    }

    void add(IntegerPolynomial integerPolynomial, int i) {
        try {
            this.f148a = integerPolynomial.f148a;
            this.f151x = integerPolynomial.f151x;
            this.f149b = integerPolynomial.f149b * 1;
            this.f150r = integerPolynomial.f150r * 1;
            this.this$0 = integerPolynomial.this$0 * 1;
            this.f152y = integerPolynomial.f152y * 1;
            this.f153z = integerPolynomial.f153z;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "js.af(" + ')');
        }
    }

    void add(String str, String str2, int $i0, int i, int i2, int i3, boolean z) {
        this.f148a = str;
        this.f151x = str2;
        this.f149b = -715868007 * $i0;
        this.f150r = 284619463 * i;
        this.this$0 = 1048076997 * i2;
        this.f152y = -492327079 * i3;
        this.f153z = z;
    }

    void add(String str, String str2, int $i0, int i, int i2, int i3, boolean z, byte b) {
        try {
            this.f148a = str;
            this.f151x = str2;
            this.f149b = -715868007 * $i0;
            this.f150r = 284619463 * i;
            this.this$0 = 1048076997 * i2;
            this.f152y = -492327079 * i3;
            this.f153z = z;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "js.ad(" + ')');
        }
    }

    void set(IntegerPolynomial integerPolynomial) {
        this.f148a = integerPolynomial.f148a;
        this.f151x = integerPolynomial.f151x;
        this.f149b = integerPolynomial.f149b * 1;
        this.f150r = integerPolynomial.f150r * 1;
        this.this$0 = integerPolynomial.this$0 * 1;
        this.f152y = integerPolynomial.f152y * 1;
        this.f153z = integerPolynomial.f153z;
    }

    void sub(IntegerPolynomial integerPolynomial) {
        this.f148a = integerPolynomial.f148a;
        this.f151x = integerPolynomial.f151x;
        this.f149b = integerPolynomial.f149b * 1;
        this.f150r = integerPolynomial.f150r * 1;
        this.this$0 = integerPolynomial.this$0 * 1;
        this.f152y = integerPolynomial.f152y * 1;
        this.f153z = integerPolynomial.f153z;
    }

    void sub(String str, String str2, int $i0, int i, int i2, int i3, boolean z) {
        this.f148a = str;
        this.f151x = str2;
        this.f149b = 11900994 * $i0;
        this.f150r = 284619463 * i;
        this.this$0 = 1048076997 * i2;
        this.f152y = -865306953 * i3;
        this.f153z = z;
    }
}
