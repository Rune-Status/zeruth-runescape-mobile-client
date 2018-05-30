package p000;

/* compiled from: is */
public class R$styleable {
    public static final int LONGEST_PAST_TIME = 200;
    public static final int Theme_switchStyle = 57;

    R$styleable() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "is.<init>(" + ')');
        }
    }

    public static void compare(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int $i4 = (i + i2) / 2;
            String $r2 = strArr[$i4];
            strArr[$i4] = strArr[i2];
            strArr[i2] = $r2;
            short $s2 = sArr[$i4];
            sArr[$i4] = sArr[i2];
            sArr[i2] = $s2;
            int $i6 = i;
            $i4 = i;
            while ($i6 < i2) {
                int $i3;
                if ($r2 == null || (strArr[$i6] != null && strArr[$i6].compareTo($r2) < ($i6 & 1))) {
                    String $r3 = strArr[$i6];
                    strArr[$i6] = strArr[$i4];
                    strArr[$i4] = $r3;
                    short $s5 = sArr[$i6];
                    sArr[$i6] = sArr[$i4];
                    $i3 = $i4 + 1;
                    sArr[$i4] = $s5;
                } else {
                    $i3 = $i4;
                }
                $i6++;
                $i4 = $i3;
            }
            strArr[i2] = strArr[$i4];
            strArr[$i4] = $r2;
            sArr[i2] = sArr[$i4];
            sArr[$i4] = $s2;
            ArrayList.add(strArr, sArr, i, $i4 - 1, -1080108892);
            ArrayList.add(strArr, sArr, $i4 + 1, i2, 997591872);
        }
    }

    public static void parseMultiple(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int $i4 = (i + i2) / 2;
            String $r2 = strArr[$i4];
            strArr[$i4] = strArr[i2];
            strArr[i2] = $r2;
            short $s2 = sArr[$i4];
            sArr[$i4] = sArr[i2];
            sArr[i2] = $s2;
            int $i6 = i;
            $i4 = i;
            while ($i6 < i2) {
                if ($r2 == null || (strArr[$i6] != null && strArr[$i6].compareTo($r2) < ($i6 & 1))) {
                    String $r3 = strArr[$i6];
                    strArr[$i6] = strArr[$i4];
                    strArr[$i4] = $r3;
                    short $s5 = sArr[$i6];
                    sArr[$i6] = sArr[$i4];
                    sArr[$i4] = $s5;
                    $i4++;
                }
                $i6++;
            }
            strArr[i2] = strArr[$i4];
            strArr[$i4] = $r2;
            sArr[i2] = sArr[$i4];
            sArr[$i4] = $s2;
            ArrayList.add(strArr, sArr, i, $i4 - 1, -1004201782);
            ArrayList.add(strArr, sArr, $i4 + 1, i2, -902519895);
        }
    }

    public static void writeLineToContent(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int $i4 = (i + i2) / 2;
            String $r2 = strArr[$i4];
            strArr[$i4] = strArr[i2];
            strArr[i2] = $r2;
            short $s2 = sArr[$i4];
            sArr[$i4] = sArr[i2];
            sArr[i2] = $s2;
            int $i6 = i;
            $i4 = i;
            while ($i6 < i2) {
                if ($r2 == null || (strArr[$i6] != null && strArr[$i6].compareTo($r2) < ($i6 & 1))) {
                    String $r3 = strArr[$i6];
                    strArr[$i6] = strArr[$i4];
                    strArr[$i4] = $r3;
                    short $s5 = sArr[$i6];
                    sArr[$i6] = sArr[$i4];
                    sArr[$i4] = $s5;
                    $i4++;
                }
                $i6++;
            }
            strArr[i2] = strArr[$i4];
            strArr[$i4] = $r2;
            sArr[i2] = sArr[$i4];
            sArr[$i4] = $s2;
            ArrayList.add(strArr, sArr, i, $i4 - 1, -1906694344);
            ArrayList.add(strArr, sArr, $i4 + 1, i2, 148636355);
        }
    }
}
