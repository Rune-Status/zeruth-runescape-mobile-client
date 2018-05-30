package p000;

import java.util.Collection;

/* compiled from: ap */
public class Category extends BitSet {
    public static final int ANY_ARRAY_N_ID = 13;
    static final int VERSION_CODE = 106;
    public final int[] data;
    public final int name;
    public final int this$0;
    public final int[] type;

    Category(int $i0, int i, int[] iArr, int[] iArr2, int i2) {
        try {
            this.this$0 = -1034995691 * $i0;
            this.name = -1990881867 * i;
            this.type = iArr;
            this.data = iArr2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ap.<init>(" + ')');
        }
    }

    public static void load(Collection collection, int i) {
        try {
            collection.add(System.settings);
            collection.add(System.map);
            collection.add(System.client);
            collection.add(System.TAG);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ap.ai(" + ')');
        }
    }

    public boolean load(int i, int i2) {
        if (i2 >= 0 && i2 < this.data.length) {
            int $i2 = this.data[i2];
            if (i >= $i2 && i <= $i2 + this.type[i2]) {
                return true;
            }
        }
        return false;
    }

    public boolean load(int i, int i2, int i3) {
        if (i2 >= 0) {
            try {
                if (i2 < this.data.length) {
                    i3 = this.data[i2];
                    if (i >= i3) {
                        if (i <= i3 + this.type[i2]) {
                            return true;
                        }
                    }
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "ap.af(" + ')');
            }
        }
        return false;
    }

    public boolean log(int i, int i2) {
        if (i2 >= 0 && i2 < this.data.length) {
            int $i2 = this.data[i2];
            if (i >= $i2 && i <= $i2 + this.type[i2]) {
                return true;
            }
        }
        return false;
    }
}
