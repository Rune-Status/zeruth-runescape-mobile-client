package p000;

/* compiled from: id */
public class TByteLinkedList {
    TByteLinkedList() throws Throwable {
        throw new Error();
    }

    public static void add(byte[] bArr, int $i0, byte[] bArr2, int $i1, int $i2) {
        int $i3;
        if (bArr == bArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        bArr2[$i1] = bArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            bArr2[$i1] = bArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            bArr2[$i1] = bArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void add(double[] dArr, int $i0, double[] dArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (dArr == dArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i0 = $i1 + $i3;
                    $i1 = ($i2 - $i3) + 3;
                    while ($i2 >= $i1) {
                        $i3 = $i0 - 1;
                        $i4 = $i2 - 1;
                        dArr2[$i0] = dArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        dArr2[$i3] = dArr[$i4];
                        $i3 = $i0 - 1;
                        $i4 = $i2 - 1;
                        dArr2[$i0] = dArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        dArr2[$i3] = dArr[$i4];
                    }
                    $i1 -= 3;
                    for ($i4 = $i2; $i4 >= $i1; $i4--) {
                        dArr2[$i0] = dArr[$i4];
                        $i0--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 3;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            dArr2[$i1] = dArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            dArr2[$i3] = dArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            dArr2[$i0] = dArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            dArr2[$i3] = dArr[$i4];
        }
        $i2 += 3;
        while ($i0 < $i2) {
            dArr2[$i1] = dArr[$i0];
            $i1++;
            $i0++;
        }
    }

    public static void add(int[] iArr, int $i0, int i) {
        int $i2;
        i = ($i0 + i) - 7;
        while ($i0 < i) {
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
        }
        $i2 = i + 7;
        while ($i0 < $i2) {
            iArr[$i0] = 0;
            $i0++;
        }
    }

    static void add(int[] iArr, int $i0, int[] iArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (iArr == iArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        iArr2[$i1] = iArr[$i2];
                        $i1 = $i3 - 1;
                        int $i5 = $i4 - 1;
                        iArr2[$i3] = iArr[$i4];
                        $i2 = $i1 - 1;
                        $i3 = $i5 - 1;
                        iArr2[$i1] = iArr[$i5];
                        $i1 = $i2 - 1;
                        $i4 = $i3 - 1;
                        iArr2[$i2] = iArr[$i3];
                        $i2 = $i1 - 1;
                        $i3 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1 = $i2 - 1;
                        $i4 = $i3 - 1;
                        iArr2[$i2] = iArr[$i3];
                        $i3 = $i1 - 1;
                        $i5 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1 = $i3 - 1;
                        $i2 = $i5 - 1;
                        iArr2[$i3] = iArr[$i5];
                    }
                    $i0 -= 7;
                    $i4 = $i2;
                    while ($i4 >= $i0) {
                        $i3 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1--;
                        $i4 = $i3;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            iArr2[$i1] = iArr[$i0];
            $i0 = $i3 + 1;
            $i5 = $i4 + 1;
            iArr2[$i3] = iArr[$i4];
            $i1 = $i0 + 1;
            $i3 = $i5 + 1;
            iArr2[$i0] = iArr[$i5];
            $i0 = $i1 + 1;
            $i4 = $i3 + 1;
            iArr2[$i1] = iArr[$i3];
            $i1 = $i0 + 1;
            $i3 = $i4 + 1;
            iArr2[$i0] = iArr[$i4];
            $i0 = $i1 + 1;
            $i4 = $i3 + 1;
            iArr2[$i1] = iArr[$i3];
            $i3 = $i0 + 1;
            $i5 = $i4 + 1;
            iArr2[$i0] = iArr[$i4];
            $i1 = $i3 + 1;
            $i0 = $i5 + 1;
            iArr2[$i3] = iArr[$i5];
        }
        $i2 += 7;
        $i4 = $i0;
        while ($i4 < $i2) {
            $i3 = $i4 + 1;
            iArr2[$i1] = iArr[$i4];
            $i1++;
            $i4 = $i3;
        }
    }

    static void add(long[] jArr, int $i0, long[] jArr2, int $i1, int $i2) {
        int $i3;
        if (jArr == jArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i0 = $i1 + $i3;
                    $i1 = ($i2 - $i3) + 3;
                    while ($i2 >= $i1) {
                        $i3 = $i0 - 1;
                        int $i5 = $i2 - 1;
                        jArr2[$i0] = jArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i5 - 1;
                        jArr2[$i3] = jArr[$i5];
                        $i3 = $i0 - 1;
                        $i5 = $i2 - 1;
                        jArr2[$i0] = jArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i5 - 1;
                        jArr2[$i3] = jArr[$i5];
                    }
                    $i1 -= 3;
                    while ($i2 >= $i1) {
                        jArr2[$i0] = jArr[$i2];
                        $i0--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 3;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i5 = $i0 + 1;
            jArr2[$i1] = jArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i5 + 1;
            jArr2[$i3] = jArr[$i5];
            $i3 = $i0 + 1;
            $i5 = $i1 + 1;
            jArr2[$i0] = jArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i5 + 1;
            jArr2[$i3] = jArr[$i5];
        }
        $i2 += 3;
        for ($i5 = $i0; $i5 < $i2; $i5++) {
            jArr2[$i1] = jArr[$i5];
            $i1++;
        }
    }

    static void add(Object[] objArr, int $i0, Object[] objArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (objArr == objArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        objArr2[$i1] = objArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        objArr2[$i3] = objArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        objArr2[$i1] = objArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        objArr2[$i3] = objArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        objArr2[$i1] = objArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        objArr2[$i3] = objArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        objArr2[$i1] = objArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        objArr2[$i3] = objArr[$i4];
                    }
                    $i0 -= 7;
                    for ($i4 = $i2; $i4 >= $i0; $i4--) {
                        objArr2[$i1] = objArr[$i4];
                        $i1--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            objArr2[$i1] = objArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            objArr2[$i3] = objArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            objArr2[$i0] = objArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            objArr2[$i3] = objArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            objArr2[$i0] = objArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            objArr2[$i3] = objArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            objArr2[$i0] = objArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            objArr2[$i3] = objArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            objArr2[$i1] = objArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void addAll(char[] cArr, int $i0, char[] cArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (cArr == cArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                    }
                    $i0 -= 7;
                    for ($i4 = $i2; $i4 >= $i0; $i4--) {
                        cArr2[$i1] = cArr[$i4];
                        $i1--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            cArr2[$i1] = cArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            cArr2[$i1] = cArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void addAll(float[] fArr, int $i0, float[] fArr2, int $i1, int $i2) {
        int $i3;
        if (fArr == fArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        fArr2[$i1] = fArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            fArr2[$i1] = fArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            fArr2[$i1] = fArr[$i0];
            $i1++;
            $i0++;
        }
    }

    public static void addAll(int[] iArr, int $i0, int i) {
        i = ($i0 + i) - 7;
        while ($i0 < i) {
            int $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
        }
        i += 7;
        while ($i0 < i) {
            iArr[$i0] = 0;
            $i0++;
        }
    }

    static void addAll(short[] sArr, int $i0, short[] sArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (sArr == sArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                    }
                    $i0 -= 7;
                    for ($i4 = $i2; $i4 >= $i0; $i4--) {
                        sArr2[$i1] = sArr[$i4];
                        $i1--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            sArr2[$i1] = sArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            sArr2[$i1] = sArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void addAll(boolean[] zArr, int $i0, boolean[] zArr2, int $i1, int $i2) {
        int $i3;
        if (zArr == zArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        zArr2[$i1] = zArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            zArr2[$i1] = zArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
        }
        $i2 += 7;
        for ($i4 = $i0; $i4 < $i2; $i4++) {
            zArr2[$i1] = zArr[$i4];
            $i1++;
        }
    }

    static void encode(short[] sArr, int $i0, short[] sArr2, int $i1, int $i2) {
        int $i3;
        if (sArr == sArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        sArr2[$i1] = sArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            sArr2[$i1] = sArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            sArr2[$i1] = sArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void fill(char[] cArr, int $i0, char[] cArr2, int $i1, int $i2) {
        int $i3;
        if (cArr == cArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        cArr2[$i1] = cArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            cArr2[$i1] = cArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
        }
        $i2 += 7;
        for ($i4 = $i0; $i4 < $i2; $i4++) {
            cArr2[$i1] = cArr[$i4];
            $i1++;
        }
    }

    static void fill(double[] dArr, int $i0, double[] dArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (dArr == dArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i0 = $i1 + $i3;
                    $i1 = ($i2 - $i3) + 3;
                    while ($i2 >= $i1) {
                        $i3 = $i0 - 1;
                        $i4 = $i2 - 1;
                        dArr2[$i0] = dArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        dArr2[$i3] = dArr[$i4];
                        $i3 = $i0 - 1;
                        $i4 = $i2 - 1;
                        dArr2[$i0] = dArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        dArr2[$i3] = dArr[$i4];
                    }
                    $i1 -= 3;
                    for ($i4 = $i2; $i4 >= $i1; $i4--) {
                        dArr2[$i0] = dArr[$i4];
                        $i0--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 3;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            dArr2[$i1] = dArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            dArr2[$i3] = dArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            dArr2[$i0] = dArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            dArr2[$i3] = dArr[$i4];
        }
        $i2 += 3;
        while ($i0 < $i2) {
            dArr2[$i1] = dArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void fill(float[] fArr, int $i0, float[] fArr2, int $i1, int $i2) {
        int $i3;
        if (fArr == fArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        fArr2[$i1] = fArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            fArr2[$i1] = fArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            fArr2[$i1] = fArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void fill(short[] sArr, int $i0, short[] sArr2, int $i1, int $i2) {
        int $i3;
        if (sArr == sArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        sArr2[$i1] = sArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        sArr2[$i3] = sArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        sArr2[$i1] = sArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            sArr2[$i1] = sArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            sArr2[$i0] = sArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            sArr2[$i3] = sArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            sArr2[$i1] = sArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void fill(boolean[] zArr, int $i0, boolean[] zArr2, int $i1, int $i2) {
        int $i3;
        if (zArr == zArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        zArr2[$i1] = zArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            zArr2[$i1] = zArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            zArr2[$i1] = zArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void indexOf(boolean[] zArr, int $i0, boolean[] zArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (zArr == zArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                    }
                    $i0 -= 7;
                    for ($i4 = $i2; $i4 >= $i0; $i4--) {
                        zArr2[$i1] = zArr[$i4];
                        $i1--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            zArr2[$i1] = zArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            zArr2[$i1] = zArr[$i0];
            $i1++;
            $i0++;
        }
    }

    public static void init(byte[] bArr, int $i0, byte[] bArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (bArr == bArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                    }
                    $i0 -= 7;
                    for ($i4 = $i2; $i4 >= $i0; $i4--) {
                        bArr2[$i1] = bArr[$i4];
                        $i1--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            bArr2[$i1] = bArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            bArr2[$i1] = bArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void init(int[] iArr, int $i0, int[] iArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (iArr == iArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        iArr2[$i1] = iArr[$i2];
                        $i1 = $i3 - 1;
                        int $i5 = $i4 - 1;
                        iArr2[$i3] = iArr[$i4];
                        $i2 = $i1 - 1;
                        $i3 = $i5 - 1;
                        iArr2[$i1] = iArr[$i5];
                        $i1 = $i2 - 1;
                        $i4 = $i3 - 1;
                        iArr2[$i2] = iArr[$i3];
                        $i2 = $i1 - 1;
                        $i3 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1 = $i2 - 1;
                        $i4 = $i3 - 1;
                        iArr2[$i2] = iArr[$i3];
                        $i3 = $i1 - 1;
                        $i5 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1 = $i3 - 1;
                        $i2 = $i5 - 1;
                        iArr2[$i3] = iArr[$i5];
                    }
                    $i0 -= 7;
                    $i4 = $i2;
                    while ($i4 >= $i0) {
                        $i3 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1--;
                        $i4 = $i3;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            iArr2[$i1] = iArr[$i0];
            $i0 = $i3 + 1;
            $i5 = $i4 + 1;
            iArr2[$i3] = iArr[$i4];
            $i1 = $i0 + 1;
            $i3 = $i5 + 1;
            iArr2[$i0] = iArr[$i5];
            $i0 = $i1 + 1;
            $i4 = $i3 + 1;
            iArr2[$i1] = iArr[$i3];
            $i1 = $i0 + 1;
            $i3 = $i4 + 1;
            iArr2[$i0] = iArr[$i4];
            $i0 = $i1 + 1;
            $i4 = $i3 + 1;
            iArr2[$i1] = iArr[$i3];
            $i3 = $i0 + 1;
            $i5 = $i4 + 1;
            iArr2[$i0] = iArr[$i4];
            $i1 = $i3 + 1;
            $i0 = $i5 + 1;
            iArr2[$i3] = iArr[$i5];
        }
        $i2 += 7;
        $i4 = $i0;
        while ($i4 < $i2) {
            $i3 = $i4 + 1;
            iArr2[$i1] = iArr[$i4];
            $i1++;
            $i4 = $i3;
        }
    }

    static void insert(char[] cArr, int $i0, char[] cArr2, int $i1, int $i2) {
        int $i4;
        int $i5;
        if (cArr == cArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i4 = $i2 - 1;
                    $i2 = $i0 + $i4;
                    $i1 += $i4;
                    $i0 = ($i2 - $i4) + 7;
                    while ($i2 >= $i0) {
                        $i4 = $i1 - 1;
                        $i5 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i4 - 1;
                        $i2 = $i5 - 1;
                        cArr2[$i4] = cArr[$i5];
                        $i4 = $i1 - 1;
                        $i5 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i4 - 1;
                        $i2 = $i5 - 1;
                        cArr2[$i4] = cArr[$i5];
                        $i4 = $i1 - 1;
                        $i5 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i4 - 1;
                        $i2 = $i5 - 1;
                        cArr2[$i4] = cArr[$i5];
                        $i4 = $i1 - 1;
                        $i5 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i4 - 1;
                        $i2 = $i5 - 1;
                        cArr2[$i4] = cArr[$i5];
                    }
                    $i0 -= 7;
                    for ($i5 = $i2; $i5 >= $i0; $i5--) {
                        cArr2[$i1] = cArr[$i5];
                        $i1--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i4 = $i1 + 1;
            $i5 = $i0 + 1;
            cArr2[$i1] = cArr[$i0];
            $i0 = $i4 + 1;
            $i1 = $i5 + 1;
            cArr2[$i4] = cArr[$i5];
            $i4 = $i0 + 1;
            $i5 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i0 = $i4 + 1;
            $i1 = $i5 + 1;
            cArr2[$i4] = cArr[$i5];
            $i4 = $i0 + 1;
            $i5 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i0 = $i4 + 1;
            $i1 = $i5 + 1;
            cArr2[$i4] = cArr[$i5];
            $i4 = $i0 + 1;
            $i5 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i1 = $i4 + 1;
            $i0 = $i5 + 1;
            cArr2[$i4] = cArr[$i5];
        }
        $i2 += 7;
        for ($i5 = $i0; $i5 < $i2; $i5++) {
            cArr2[$i1] = cArr[$i5];
            $i1++;
        }
    }

    static void insert(boolean[] zArr, int $i0, boolean[] zArr2, int $i1, int $i2) {
        int $i3;
        if (zArr == zArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        zArr2[$i1] = zArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        zArr2[$i3] = zArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        zArr2[$i1] = zArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            zArr2[$i1] = zArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            zArr2[$i0] = zArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            zArr2[$i3] = zArr[$i4];
        }
        $i2 += 7;
        for ($i4 = $i0; $i4 < $i2; $i4++) {
            zArr2[$i1] = zArr[$i4];
            $i1++;
        }
    }

    static void inverseTransform(float[] fArr, int $i0, float[] fArr2, int $i1, int $i2) {
        int $i3;
        if (fArr == fArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        fArr2[$i1] = fArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            fArr2[$i1] = fArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            fArr2[$i1] = fArr[$i0];
            $i1++;
            $i0++;
        }
    }

    public static void load(byte[] bArr, int $i0, byte[] bArr2, int $i1, int $i2) {
        int $i3;
        if (bArr == bArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        bArr2[$i1] = bArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            bArr2[$i1] = bArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            bArr2[$i1] = bArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void replace(char[] cArr, int $i0, char[] cArr2, int $i1, int $i2) {
        int $i3;
        if (cArr == cArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        cArr2[$i1] = cArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        cArr2[$i3] = cArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        cArr2[$i1] = cArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            cArr2[$i1] = cArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            cArr2[$i0] = cArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            cArr2[$i3] = cArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            cArr2[$i1] = cArr[$i0];
            $i1++;
            $i0++;
        }
    }

    public static void set(byte[] bArr, int $i0, byte[] bArr2, int $i1, int $i2) {
        int $i3;
        if (bArr == bArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        bArr2[$i1] = bArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        bArr2[$i3] = bArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        bArr2[$i1] = bArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            bArr2[$i1] = bArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            bArr2[$i0] = bArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            bArr2[$i3] = bArr[$i4];
        }
        $i2 += 7;
        for ($i4 = $i0; $i4 < $i2; $i4++) {
            bArr2[$i1] = bArr[$i4];
            $i1++;
        }
    }

    static void set(double[] dArr, int $i0, double[] dArr2, int $i1, int $i2) {
        int $i3;
        if (dArr == dArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i0 = $i1 + $i3;
                    $i1 = ($i2 - $i3) + 3;
                    while ($i2 >= $i1) {
                        $i3 = $i0 - 1;
                        int $i4 = $i2 - 1;
                        dArr2[$i0] = dArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        dArr2[$i3] = dArr[$i4];
                        $i3 = $i0 - 1;
                        $i4 = $i2 - 1;
                        dArr2[$i0] = dArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        dArr2[$i3] = dArr[$i4];
                    }
                    $i1 -= 3;
                    while ($i2 >= $i1) {
                        dArr2[$i0] = dArr[$i2];
                        $i0--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 3;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            dArr2[$i1] = dArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            dArr2[$i3] = dArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            dArr2[$i0] = dArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            dArr2[$i3] = dArr[$i4];
        }
        $i2 += 3;
        while ($i0 < $i2) {
            dArr2[$i1] = dArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void set(int[] iArr, int $i0, int[] iArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (iArr == iArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        iArr2[$i1] = iArr[$i2];
                        $i1 = $i3 - 1;
                        int $i5 = $i4 - 1;
                        iArr2[$i3] = iArr[$i4];
                        $i2 = $i1 - 1;
                        $i3 = $i5 - 1;
                        iArr2[$i1] = iArr[$i5];
                        $i1 = $i2 - 1;
                        $i4 = $i3 - 1;
                        iArr2[$i2] = iArr[$i3];
                        $i2 = $i1 - 1;
                        $i3 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1 = $i2 - 1;
                        $i4 = $i3 - 1;
                        iArr2[$i2] = iArr[$i3];
                        $i3 = $i1 - 1;
                        $i5 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1 = $i3 - 1;
                        $i2 = $i5 - 1;
                        iArr2[$i3] = iArr[$i5];
                    }
                    $i0 -= 7;
                    $i4 = $i2;
                    while ($i4 >= $i0) {
                        $i3 = $i4 - 1;
                        iArr2[$i1] = iArr[$i4];
                        $i1--;
                        $i4 = $i3;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        $i3 = $i0;
        while ($i3 < $i2) {
            $i0 = $i1 + 1;
            $i4 = $i3 + 1;
            iArr2[$i1] = iArr[$i3];
            $i1 = $i0 + 1;
            $i3 = $i4 + 1;
            iArr2[$i0] = iArr[$i4];
            $i0 = $i1 + 1;
            $i4 = $i3 + 1;
            iArr2[$i1] = iArr[$i3];
            $i1 = $i0 + 1;
            $i3 = $i4 + 1;
            iArr2[$i0] = iArr[$i4];
            $i0 = $i1 + 1;
            $i4 = $i3 + 1;
            iArr2[$i1] = iArr[$i3];
            $i1 = $i0 + 1;
            $i3 = $i4 + 1;
            iArr2[$i0] = iArr[$i4];
            $i0 = $i1 + 1;
            $i4 = $i3 + 1;
            iArr2[$i1] = iArr[$i3];
            $i1 = $i0 + 1;
            $i3 = $i4 + 1;
            iArr2[$i0] = iArr[$i4];
        }
        $i0 = $i2 + 7;
        $i4 = $i3;
        while ($i4 < $i0) {
            $i3 = $i4 + 1;
            iArr2[$i1] = iArr[$i4];
            $i1++;
            $i4 = $i3;
        }
    }

    static void set(long[] jArr, int $i0, long[] jArr2, int $i1, int $i2) {
        int $i3;
        if (jArr == jArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i0 = $i1 + $i3;
                    $i1 = ($i2 - $i3) + 3;
                    while ($i2 >= $i1) {
                        $i3 = $i0 - 1;
                        int $i4 = $i2 - 1;
                        jArr2[$i0] = jArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        jArr2[$i3] = jArr[$i4];
                        $i3 = $i0 - 1;
                        $i4 = $i2 - 1;
                        jArr2[$i0] = jArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        jArr2[$i3] = jArr[$i4];
                    }
                    $i1 -= 3;
                    while ($i2 >= $i1) {
                        jArr2[$i0] = jArr[$i2];
                        $i0--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 3;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            jArr2[$i1] = jArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            jArr2[$i3] = jArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            jArr2[$i0] = jArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            jArr2[$i3] = jArr[$i4];
        }
        $i2 += 3;
        while ($i0 < $i2) {
            jArr2[$i1] = jArr[$i0];
            $i1++;
            $i0++;
        }
    }

    public static void sort(int[] iArr, int $i0, int i) {
        i = ($i0 + i) - 7;
        while ($i0 < i) {
            int $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
            $i2 = $i0 + 1;
            iArr[$i0] = 0;
            $i0 = $i2 + 1;
            iArr[$i2] = 0;
        }
        i += 7;
        while ($i0 < i) {
            iArr[$i0] = 0;
            $i0++;
        }
    }

    static void toArray(double[] dArr, int $i0, double[] dArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (dArr == dArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i0 = $i1 + $i3;
                    $i1 = ($i2 - $i3) + 3;
                    while ($i2 >= $i1) {
                        $i3 = $i0 - 1;
                        $i4 = $i2 - 1;
                        dArr2[$i0] = dArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        dArr2[$i3] = dArr[$i4];
                        $i3 = $i0 - 1;
                        $i4 = $i2 - 1;
                        dArr2[$i0] = dArr[$i2];
                        $i0 = $i3 - 1;
                        $i2 = $i4 - 1;
                        dArr2[$i3] = dArr[$i4];
                    }
                    $i1 -= 3;
                    for ($i4 = $i2; $i4 >= $i1; $i4--) {
                        dArr2[$i0] = dArr[$i4];
                        $i0--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 3;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            dArr2[$i1] = dArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            dArr2[$i3] = dArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            dArr2[$i0] = dArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            dArr2[$i3] = dArr[$i4];
        }
        $i2 += 3;
        for ($i4 = $i0; $i4 < $i2; $i4++) {
            dArr2[$i1] = dArr[$i4];
            $i1++;
        }
    }

    static void transform(float[] fArr, int $i0, float[] fArr2, int $i1, int $i2) {
        int $i3;
        if (fArr == fArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        int $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        fArr2[$i1] = fArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        fArr2[$i3] = fArr[$i4];
                    }
                    $i0 -= 7;
                    while ($i2 >= $i0) {
                        fArr2[$i1] = fArr[$i2];
                        $i1--;
                        $i2--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            fArr2[$i1] = fArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            fArr2[$i0] = fArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            fArr2[$i3] = fArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            fArr2[$i1] = fArr[$i0];
            $i1++;
            $i0++;
        }
    }

    static void update(Object[] objArr, int $i0, Object[] objArr2, int $i1, int $i2) {
        int $i3;
        int $i4;
        if (objArr == objArr2) {
            if ($i0 != $i1) {
                if ($i1 > $i0 && $i1 < $i0 + $i2) {
                    $i3 = $i2 - 1;
                    $i2 = $i0 + $i3;
                    $i1 += $i3;
                    $i0 = ($i2 - $i3) + 7;
                    while ($i2 >= $i0) {
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        objArr2[$i1] = objArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        objArr2[$i3] = objArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        objArr2[$i1] = objArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        objArr2[$i3] = objArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        objArr2[$i1] = objArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        objArr2[$i3] = objArr[$i4];
                        $i3 = $i1 - 1;
                        $i4 = $i2 - 1;
                        objArr2[$i1] = objArr[$i2];
                        $i1 = $i3 - 1;
                        $i2 = $i4 - 1;
                        objArr2[$i3] = objArr[$i4];
                    }
                    $i0 -= 7;
                    for ($i4 = $i2; $i4 >= $i0; $i4--) {
                        objArr2[$i1] = objArr[$i4];
                        $i1--;
                    }
                }
            }
            return;
        }
        $i2 = ($i2 + $i0) - 7;
        while ($i0 < $i2) {
            $i3 = $i1 + 1;
            $i4 = $i0 + 1;
            objArr2[$i1] = objArr[$i0];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            objArr2[$i3] = objArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            objArr2[$i0] = objArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            objArr2[$i3] = objArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            objArr2[$i0] = objArr[$i1];
            $i0 = $i3 + 1;
            $i1 = $i4 + 1;
            objArr2[$i3] = objArr[$i4];
            $i3 = $i0 + 1;
            $i4 = $i1 + 1;
            objArr2[$i0] = objArr[$i1];
            $i1 = $i3 + 1;
            $i0 = $i4 + 1;
            objArr2[$i3] = objArr[$i4];
        }
        $i2 += 7;
        while ($i0 < $i2) {
            objArr2[$i1] = objArr[$i0];
            $i1++;
            $i0++;
        }
    }
}
