package p000;

/* compiled from: hk */
public class Intent extends Object {
    static final int PERM_MASK = 4095;
    static String data;
    public static short[][] name;
    int f154e;
    int f155i;
    int next;
    int f156s;

    Intent(int $i0, int i, int i2, int i3) {
        try {
            this.next = -1879182819 * $i0;
            this.f155i = 1167767495 * i;
            this.f156s = -886958987 * i2;
            this.f154e = 1860984207 * i3;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hk.<init>(" + ')');
        }
    }

    public static int generate(int i, short s) {
        try {
            return (int) ((Main.value[i] >>> 14) & 3);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hk.ag(" + ')');
        }
    }

    public static int get(CharSequence charSequence, int i) {
        try {
            int $i2 = 0;
            for (i = 0; i < charSequence.length(); i++) {
                $i2 = (($i2 << 5) - $i2) + TextUtils.append(charSequence.charAt(i), 907446118);
            }
            return $i2;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hk.as(" + ')');
        }
    }

    static final void send(String str, int i) {
        try {
            Locale.append(R$id.PHONE_MODEL + str + R$id.ANDROID_VERSION, (byte) 4);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hk.am(" + ')');
        }
    }

    void m31a(int $i0, int i, int i2, int i3) {
        this.next = -1879182819 * $i0;
        this.f155i = 1167767495 * i;
        this.f156s = -886958987 * i2;
        this.f154e = 1860984207 * i3;
    }

    void init(int $i0, int i, int i2, int i3) {
        this.next = -1879182819 * $i0;
        this.f155i = 1167767495 * i;
        this.f156s = -886958987 * i2;
        this.f154e = 1860984207 * i3;
    }

    void init(int $i0, int i, int i2, int i3, byte b) {
        try {
            this.next = -1879182819 * $i0;
            this.f155i = 1167767495 * i;
            this.f156s = -886958987 * i2;
            this.f154e = 1860984207 * i3;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hk.af(" + ')');
        }
    }

    void set(int $i0, int i, int i2, int i3) {
        this.next = -710193799 * $i0;
        this.f155i = -636552269 * i;
        this.f156s = -886958987 * i2;
        this.f154e = 1860984207 * i3;
    }
}
