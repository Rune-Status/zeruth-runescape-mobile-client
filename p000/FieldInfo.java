package p000;

/* compiled from: ci */
public class FieldInfo {
    static final int MAX_TILES_PER_ROW = 6;
    static final int QUERY_TYPE_NEWER = 1;
    public static int index;
    int count;
    int data;
    int name;
    int value;

    FieldInfo() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ci.<init>(" + ')');
        }
    }

    FieldInfo(FieldInfo fieldInfo) {
        try {
            this.name = fieldInfo.name * 1;
            this.value = fieldInfo.value * 1;
            this.data = fieldInfo.data * 1;
            this.count = fieldInfo.count * 1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ci.<init>(" + ')');
        }
    }

    static void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int $i8, byte b) {
        i = 255 - i8;
        i = (((i * (65280 & $i8)) & 16711680) | (((16711935 & $i8) * i) & -16711936)) >>> 8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i10 = i2;
            i2 = i3;
            $i8 = -i4;
            while ($i8 < 0) {
                i3 = $i10 + 1;
                $i10 = iArr2[$i10];
                if ($i10 != 0) {
                    int $i12 = 16711680 & (($i10 & 65280) * i8);
                    $i10 = i2 + 1;
                    try {
                        iArr[i2] = ((((((16711935 & $i10) * i8) & -16711936) | $i12) >>> 8) + i) | -16777216;
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "ci.bz(" + ')');
                    }
                }
                $i10 = i2 + 1;
                $i8++;
                i2 = $i10;
                $i10 = i3;
            }
            i3 = i2 + i6;
            i2 = $i10 + i7;
        }
    }
}
