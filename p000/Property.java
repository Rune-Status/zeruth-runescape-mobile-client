package p000;

/* compiled from: ij */
public abstract class Property {
    static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int Theme_colorButtonNormal = 88;
    public static final int flags = 1010;
    public static int[] name;
    static boolean status = false;

    Property() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ij.<init>(" + ')');
        }
    }

    static byte[] clone(byte[] bArr) {
        int $i0 = bArr.length;
        byte[] $r1 = new byte[$i0];
        System.arraycopy(bArr, 0, $r1, 0, $i0);
        return $r1;
    }

    public static Object copy(byte[] $r0, boolean z) {
        if ($r0 == null) {
            return null;
        }
        if ($r0.length > 136 && !status) {
            try {
                StyleRow $r1 = new StyleRow();
                $r1.copy($r0, 1161688935);
                return $r1;
            } catch (Throwable th) {
                status = true;
            }
        }
        if (z) {
            $r0 = Utils.get($r0, -238831611);
        }
        return $r0;
    }

    public static byte[] get(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] $r1 = (byte[]) obj;
            return z ? Utils.get($r1, -1786836332) : $r1;
        } else if (obj instanceof Property) {
            return ((Property) obj).get(-844372969);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static byte[] get(byte[] bArr) {
        int $i0 = bArr.length;
        byte[] $r1 = new byte[$i0];
        System.arraycopy(bArr, 0, $r1, 0, $i0);
        return $r1;
    }

    static byte[] getName(byte[] bArr) {
        int $i0 = bArr.length;
        byte[] $r1 = new byte[$i0];
        System.arraycopy(bArr, 0, $r1, 0, $i0);
        return $r1;
    }

    public static byte[] getValue(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] $r1 = (byte[]) obj;
            return z ? Utils.get($r1, 47958782) : $r1;
        } else if (obj instanceof Property) {
            return ((Property) obj).get(-844372969);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Object resolve(byte[] $r0, boolean z) {
        if ($r0 == null) {
            return null;
        }
        if ($r0.length > 1405496099 && !status) {
            try {
                StyleRow $r1 = new StyleRow();
                $r1.copy($r0, 1498706089);
                return $r1;
            } catch (Throwable th) {
                status = true;
            }
        }
        if (z) {
            $r0 = Utils.get($r0, 505368936);
        }
        return $r0;
    }

    public static Object set(byte[] $r0, boolean z) {
        if ($r0 == null) {
            return null;
        }
        if ($r0.length > 952149426 && !status) {
            try {
                StyleRow $r1 = new StyleRow();
                $r1.copy($r0, -1135076845);
                return $r1;
            } catch (Throwable th) {
                status = true;
            }
        }
        if (z) {
            $r0 = Utils.get($r0, -634706030);
        }
        return $r0;
    }

    abstract void allocate(byte[] bArr);

    abstract void copy(byte[] bArr);

    abstract void copy(byte[] bArr, int i);

    abstract byte[] copy();

    abstract byte[] get();

    abstract byte[] get(int i);
}
