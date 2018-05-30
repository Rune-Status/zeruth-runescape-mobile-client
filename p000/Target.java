package p000;

/* compiled from: mx */
public class Target {
    static AbstractBuffer context;
    static String[] value;

    Target() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mx.<init>(" + ')');
        }
    }

    public static void add(byte b) {
        try {
            MultiInputStream.this$0.write(-1201213215);
            MultiInputStream.index = 63807465;
            ParserHelper.index = null;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mx.an(" + ')');
        }
    }

    static BigReal[] add(int i) {
        try {
            BigReal[] $r0 = new BigReal[4];
            $r0[0] = BigReal.ZERO;
            $r0[1] = BigReal.f15r;
            $r0[2] = BigReal.f14g;
            $r0[3] = BigReal.f13d;
            return $r0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "mx.af(" + ')');
        }
    }

    public static double tile2lat(double d, double d2, double d3) {
        d = (d - d2) / d3;
        return (Math.exp((d * (-d)) / 2.0d) / Math.sqrt(6.283185307179586d)) / d3;
    }
}
