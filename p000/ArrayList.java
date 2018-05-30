package p000;

/* compiled from: hv */
public class ArrayList extends Object {
    static final long DEFAULT_INTERVAL_TIME = 60000;
    int branch;
    int channel;
    boolean closed;
    int count;
    int head;
    int header = 741713220;
    public System name;
    String next;
    System parent;
    int pos;
    public Object[] size;
    int value;

    public static void add(String[] strArr, short[] sArr, int i, int i2, int i3) {
        if (i < i2) {
            i3 = (i + i2) / 2;
            String $r2 = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = $r2;
            short $s3 = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = $s3;
            int $i5 = i;
            i3 = i;
            while ($i5 < i2) {
                if ($r2 != null) {
                    if (strArr[$i5] == null) {
                        continue;
                    } else if (strArr[$i5].compareTo($r2) >= ($i5 & 1)) {
                        continue;
                    }
                    $i5++;
                }
                try {
                    String $r3 = strArr[$i5];
                    strArr[$i5] = strArr[i3];
                    strArr[i3] = $r3;
                    short $s4 = sArr[$i5];
                    sArr[$i5] = sArr[i3];
                    sArr[i3] = $s4;
                    i3++;
                    $i5++;
                } catch (RuntimeException $r5) {
                    throw StringBuilder.append($r5, "hv.af(" + ')');
                }
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = $r2;
            sArr[i2] = sArr[i3];
            sArr[i3] = $s3;
            ArrayList.add(strArr, sArr, i, i3 - 1, -467657098);
            ArrayList.add(strArr, sArr, i3 + 1, i2, -1938003635);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.System get(int r11, int r12) {
        /*
        r12 = r11 >> 16;
        r0 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r11 = r0 & r11;
        r1 = p000.Float.size;
        r2 = r1[r12];	 Catch:{ RuntimeException -> 0x0026 }
        if (r2 == 0) goto L_0x0015;
    L_0x000d:
        r1 = p000.Float.size;
        r2 = r1[r12];	 Catch:{ RuntimeException -> 0x0026 }
        r3 = r2[r11];	 Catch:{ RuntimeException -> 0x0026 }
        if (r3 != 0) goto L_0x001f;
    L_0x0015:
        r0 = -74;
        r4 = p000.Hashtable.get(r12, r0);	 Catch:{ RuntimeException -> 0x0026 }
        if (r4 != 0) goto L_0x001f;
    L_0x001d:
        r5 = 0;
        return r5;
    L_0x001f:
        r1 = p000.Float.size;
        r2 = r1[r12];	 Catch:{ RuntimeException -> 0x0026 }
        r3 = r2[r11];	 Catch:{ RuntimeException -> 0x0026 }
        return r3;
    L_0x0026:
        r6 = move-exception;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "hv.ad(";
        r7 = r7.append(r8);
        r0 = 41;
        r7 = r7.append(r0);
        r9 = r7.toString();
        r10 = p000.StringBuilder.append(r6, r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: ArrayList.get(int, int):System");
    }

    static void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        i = 256 - i8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i9 = i2;
            i2 = i3;
            i9 = -i4;
            while (i9 < 0) {
                i3 = $i9 + 1;
                int $i10 = iArr2[$i9];
                if ($i10 != 0) {
                    int $i11 = iArr[i2];
                    if ($i11 == 0) {
                        $i9 = i2 + 1;
                        iArr[i2] = $i10 | ((i - 48) << 24);
                    } else {
                        $i9 = i2 + 1;
                        try {
                            iArr[i2] = ((((($i10 & 65280) * i8) + (($i11 & 65280) * i)) & 16711680) + ((((16711935 & $i11) * i) + ((16711935 & $i10) * i8)) & -16711936)) >> 8;
                        } catch (RuntimeException $r2) {
                            throw StringBuilder.append($r2, "hv.bz(" + ')');
                        }
                    }
                }
                $i9 = i2 + 1;
                i9++;
                i2 = $i9;
                $i9 = i3;
            }
            i3 = i2 + i6;
            i2 = $i9 + i7;
        }
    }

    public void clearAndSet(Object[] objArr) {
        this.size = objArr;
    }

    public void m78get(int $i0, int i) {
        try {
            this.header = -1403058805 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hv.ad(" + ')');
        }
    }

    public void init(int $i0) {
        this.header = -1403058805 * $i0;
    }

    public void key(Object[] objArr, int i) {
        try {
            this.size = objArr;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hv.af(" + ')');
        }
    }

    public void putStash(Object[] objArr) {
        this.size = objArr;
    }

    public void setSIZE(Object[] objArr) {
        this.size = objArr;
    }
}
