package p000;

/* compiled from: jy */
public class Vec3 {
    static final Vec3 ex = new Vec3("LIVE", 0);
    static final Vec3 next = new Vec3("BUILDLIVE", 3);
    static final Vec3 f353y = new Vec3("RC", 1);
    static final Vec3 f354z = new Vec3("WIP", 2);
    public final String content;
    final int key;

    Vec3(String str, int $i0) {
        try {
            this.content = str;
            this.key = 520365197 * $i0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jy.<init>(" + ')');
        }
    }

    public static Vec3 add(int i) {
        Vec3[] $r0 = new Vec3[]{f354z, ex, f353y, next};
        for (Vec3 $r1 : $r0) {
            if (i == $r1.key * -517456315) {
                return $r1;
            }
        }
        return null;
    }

    public static Vec3 equals(int i) {
        Vec3[] $r0 = new Vec3[]{f354z, ex, f353y, next};
        for (Vec3 $r1 : $r0) {
            if (i == $r1.key * -315464171) {
                return $r1;
            }
        }
        return null;
    }

    public static Vec3 set(int i) {
        Vec3[] $r0 = new Vec3[]{f354z, ex, f353y, next};
        for (Vec3 $r1 : $r0) {
            if (i == $r1.key * -517456315) {
                return $r1;
            }
        }
        return null;
    }

    public static Vec3 toString(int i) {
        Vec3[] $r0 = new Vec3[]{f354z, ex, f353y, next};
        for (Vec3 $r1 : $r0) {
            if (i == $r1.key * -517456315) {
                return $r1;
            }
        }
        return null;
    }
}
