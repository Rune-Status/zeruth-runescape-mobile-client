package p000;

/* compiled from: ny */
public class BigReal implements FieldElement {
    static final BigReal[] ONE = new BigReal[32];
    public static final BigReal ZERO = new BigReal(18, -2);
    static final BigReal f13d = new BigReal(15, 4);
    public static final BigReal f14g = new BigReal(14, 0);
    public static final BigReal f15r = new BigReal(16, -2);
    public final int f16x;

    static {
        BigReal[] $r0 = Target.add(-1859443200);
        for (int $i0 = 0; $i0 < $r0.length; $i0++) {
            ONE[$r0[$i0].f16x * 1815608517] = $r0[$i0];
        }
    }

    BigReal(int $i0, int i) {
        try {
            this.f16x = -794942963 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ny.<init>(" + ')');
        }
    }

    static BigReal[] add() {
        return new BigReal[]{ZERO, f15r, f14g, f13d};
    }

    static BigReal[] multiply() {
        return new BigReal[]{ZERO, f15r, f14g, f13d};
    }
}
