package p000;

import group.jagex.oldscape.osrenderer.StringBuilder;

/* compiled from: gc */
public class TDoubleLinkedList extends File {
    static HttpRequest data;

    public TDoubleLinkedList(int[] iArr, int i, int i2) {
        try {
            super(iArr, i, i2);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gc.<init>(" + ')');
        }
    }

    static void add(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i7 = iArr2[i5];
                if (i7 != 0) {
                    i6 = iArr[i4];
                    i5 = i7 + i6;
                    i7 = (i7 & 16711935) + (i6 & 16711935);
                    i7 = (16777472 & i7) + ((i5 - i7) & PingManager.STATE_SENSOR_ON_FLAG);
                    i6 = i4 + 1;
                    iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                } else {
                    i6 = i4 + 1;
                }
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }

    static void add(int[] iArr, byte[] bArr, int[] iArr2, int i, int $i0, int i2, int $i2, int i3, int i4) {
        int $i5 = -(i2 >> 2);
        i2 = -(i2 & 3);
        $i2 = -$i2;
        int $i7 = i;
        while ($i2 < 0) {
            i = $i5;
            while (i < 0) {
                int $i8 = $i7 + 1;
                byte $b9 = bArr[$i7];
                if ($b9 != (byte) 0) {
                    $i7 = $i0 + 1;
                    iArr[$i0] = iArr2[$b9 & 1759651193];
                } else {
                    $i7 = $i0 + 1;
                }
                $i0 = $i8 + 1;
                $b9 = bArr[$i8];
                if ($b9 != (byte) 0) {
                    iArr[$i7] = iArr2[$b9 & 483467074];
                    $i8 = $i7 + 1;
                } else {
                    $i8 = $i7 + 1;
                }
                $i7 = $i0 + 1;
                $b9 = bArr[$i0];
                if ($b9 != (byte) 0) {
                    iArr[$i8] = iArr2[$b9 & 1059410251];
                    $i0 = $i8 + 1;
                } else {
                    $i0 = $i8 + 1;
                }
                $i8 = $i7 + 1;
                $b9 = bArr[$i7];
                if ($b9 != (byte) 0) {
                    iArr[$i0] = iArr2[$b9 & (short) 255];
                    $i0++;
                } else {
                    $i0++;
                }
                i++;
                $i7 = $i8;
            }
            i = $i0;
            $i0 = i2;
            while ($i0 < 0) {
                $i8 = $i7 + 1;
                $b9 = bArr[$i7];
                if ($b9 != (byte) 0) {
                    $i7 = i + 1;
                    iArr[i] = iArr2[$b9 & (short) 255];
                } else {
                    $i7 = i + 1;
                }
                $i0++;
                i = $i7;
                $i7 = $i8;
            }
            $i0 = i + i3;
            $i2++;
            $i7 += i4;
        }
    }

    static void add(int[] iArr, int[] iArr2, int i, int i2, int $i1, int i3, int $i3, int i4, int i5) {
        i = -(i3 >> 2);
        i3 = -(i3 & 3);
        $i3 = -$i3;
        int $i7 = i2;
        while ($i3 < 0) {
            for (i2 = i; i2 < 0; i2++) {
                int $i8 = $i7 + 1;
                int $i9 = iArr2[$i7];
                if ($i9 != 0) {
                    $i7 = $i1 + 1;
                    iArr[$i1] = $i9;
                } else {
                    $i7 = $i1 + 1;
                }
                $i9 = $i8 + 1;
                $i1 = iArr2[$i8];
                if ($i1 != 0) {
                    iArr[$i7] = $i1;
                    $i7++;
                } else {
                    $i7++;
                }
                $i1 = $i9 + 1;
                $i9 = iArr2[$i9];
                if ($i9 != 0) {
                    iArr[$i7] = $i9;
                    $i9 = $i7 + 1;
                } else {
                    $i9 = $i7 + 1;
                }
                $i7 = $i1 + 1;
                $i1 = iArr2[$i1];
                if ($i1 != 0) {
                    iArr[$i9] = $i1;
                    $i1 = $i9 + 1;
                } else {
                    $i1 = $i9 + 1;
                }
            }
            i2 = $i1;
            $i1 = i3;
            while ($i1 < 0) {
                $i9 = $i7 + 1;
                $i7 = iArr2[$i7];
                if ($i7 != 0) {
                    $i8 = i2 + 1;
                    iArr[i2] = $i7;
                } else {
                    $i8 = i2 + 1;
                }
                $i1++;
                i2 = $i8;
                $i7 = $i9;
            }
            $i1 = i2 + i4;
            $i3++;
            $i7 += i5;
        }
    }

    static void convertToARGB(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int $i8) {
        i = 255 - i8;
        i = (((i * (65280 & $i8)) & 16711680) | (((16711935 & $i8) * i) & -16711936)) >>> 8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i9 = i2;
            i2 = i3;
            $i8 = -i4;
            while ($i8 < 0) {
                i3 = $i9 + 1;
                $i9 = iArr2[$i9];
                if ($i9 != 0) {
                    int $i11 = 16711680 & (($i9 & 65280) * i8);
                    $i9 = i2 + 1;
                    iArr[i2] = ((((((16711935 & $i9) * i8) & -16711936) | $i11) >>> 8) + i) | -16777216;
                } else {
                    $i9 = i2 + 1;
                }
                $i8++;
                i2 = $i9;
                $i9 = i3;
            }
            i3 = i2 + i6;
            i2 = $i9 + i7;
        }
    }

    static void decode(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i7 = iArr2[i5];
                if (i7 != 0) {
                    i6 = iArr[i4];
                    i5 = i7 + i6;
                    i7 = (i7 & 16711935) + (i6 & 16711935);
                    i7 = (16777472 & i7) + ((i5 - i7) & PingManager.STATE_SENSOR_ON_FLAG);
                    i6 = i4 + 1;
                    iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                } else {
                    i6 = i4 + 1;
                }
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }

    static void decode(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i6 = iArr2[i5];
                if (i6 != 0) {
                    i5 = (16711935 & i6) * i12;
                    i6 = ((((i6 * i12) - i5) & 1781150907) + (i5 & -16711936)) >>> 8;
                    i7 = iArr[i4];
                    i5 = i6 + i7;
                    i6 = (i6 & 16711935) + (i7 & 16711935);
                    i7 = ((i5 - i6) & PingManager.STATE_SENSOR_ON_FLAG) + (i6 & 16777472);
                    i6 = i4 + 1;
                    iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                } else {
                    i6 = i4 + 1;
                }
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }

    static void init(int[] iArr, int[] iArr2, int i, int i2, int $i1, int i3, int $i3, int i4, int i5) {
        i = -(i3 >> 2);
        i3 = -(i3 & 3);
        $i3 = -$i3;
        int $i7 = i2;
        while ($i3 < 0) {
            for (i2 = i; i2 < 0; i2++) {
                int $i8 = $i7 + 1;
                int $i9 = iArr2[$i7];
                if ($i9 != 0) {
                    $i7 = $i1 + 1;
                    iArr[$i1] = $i9;
                } else {
                    $i7 = $i1 + 1;
                }
                $i9 = $i8 + 1;
                $i1 = iArr2[$i8];
                if ($i1 != 0) {
                    iArr[$i7] = $i1;
                    $i7++;
                } else {
                    $i7++;
                }
                $i1 = $i9 + 1;
                $i9 = iArr2[$i9];
                if ($i9 != 0) {
                    iArr[$i7] = $i9;
                    $i9 = $i7 + 1;
                } else {
                    $i9 = $i7 + 1;
                }
                $i7 = $i1 + 1;
                $i1 = iArr2[$i1];
                if ($i1 != 0) {
                    iArr[$i9] = $i1;
                    $i1 = $i9 + 1;
                } else {
                    $i1 = $i9 + 1;
                }
            }
            i2 = $i1;
            $i1 = i3;
            while ($i1 < 0) {
                $i9 = $i7 + 1;
                $i7 = iArr2[$i7];
                if ($i7 != 0) {
                    $i8 = i2 + 1;
                    iArr[i2] = $i7;
                } else {
                    $i8 = i2 + 1;
                }
                $i1++;
                i2 = $i8;
                $i7 = $i9;
            }
            $i1 = i2 + i4;
            $i3++;
            $i7 += i5;
        }
    }

    static void init(int[] iArr, int[] iArr2, int i, int $i1, int $i2, int i2, int $i4, int i3, int i4, int i5) {
        if (i5 >= 255) {
            Stream.read(iArr, iArr2, 0, $i1, $i2, i2, $i4, i3, i4, -272836284);
            return;
        }
        i = i5 << 24;
        int $i15 = 255 - i5;
        for ($i4 = -$i4; $i4 < 0; $i4++) {
            int i6 = $i1;
            $i1 = $i2;
            $i2 = -i2;
            while ($i2 < 0) {
                int $i8 = i6 + 1;
                int $i10 = iArr2[i6];
                if ($i10 != 0) {
                    int $i11 = iArr[$i1];
                    if ($i11 == 0) {
                        i6 = $i1 + 1;
                        iArr[$i1] = ($i10 & 16777215) | i;
                    } else {
                        i6 = $i1 + 1;
                        iArr[$i1] = (((((($i10 & 65280) * i5) + (($i11 & 65280) * $i15)) & 16711680) + ((((16711935 & $i11) * $i15) + ((16711935 & $i10) * i5)) & -16711936)) >>> 8) | (-16777216 & ($i11 | i));
                    }
                } else {
                    i6 = $i1 + 1;
                }
                $i2++;
                $i1 = i6;
                i6 = $i8;
            }
            $i2 = $i1 + i3;
            $i1 = i6 + i4;
        }
    }

    public static int insert(int $i3, int i, int $i1, int i2) {
        $i1 &= 3;
        return $i1 == 0 ? $i3 : $i1 == 1 ? i : $i1 == 2 ? 7 - $i3 : 7 - i;
    }

    static void read(int[] iArr, int[] iArr2, int i, int $i1, int $i2, int i2, int $i4, int i3, int i4, int i5) {
        if (i5 >= 255) {
            Stream.read(iArr, iArr2, 0, $i1, $i2, i2, $i4, i3, i4, -272836284);
            return;
        }
        i = i5 << 24;
        int $i13 = 255 - i5;
        for ($i4 = -$i4; $i4 < 0; $i4++) {
            int i6 = $i1;
            $i1 = $i2;
            $i2 = -i2;
            while ($i2 < 0) {
                int $i8 = i6 + 1;
                int $i10 = iArr2[i6];
                if ($i10 != 0) {
                    int $i11 = iArr[$i1];
                    if ($i11 == 0) {
                        i6 = $i1 + 1;
                        iArr[$i1] = ($i10 & 16777215) | i;
                    } else {
                        i6 = $i1 + 1;
                        iArr[$i1] = (((((($i10 & 65280) * i5) + (($i11 & 65280) * $i13)) & 16711680) + ((((16711935 & $i11) * $i13) + ((16711935 & $i10) * i5)) & -16711936)) >>> 8) | (-16777216 & ($i11 | i));
                    }
                } else {
                    i6 = $i1 + 1;
                }
                $i2++;
                $i1 = i6;
                i6 = $i8;
            }
            $i2 = $i1 + i3;
            $i1 = i6 + i4;
        }
    }

    static void reverse(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i7 = iArr2[i5];
                if (i7 != 0) {
                    i6 = iArr[i4];
                    i5 = i7 + i6;
                    i7 = (i7 & 16711935) + (i6 & -918087581);
                    i7 = (16777472 & i7) + ((i5 - i7) & 831820202);
                    i6 = i4 + 1;
                    iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                } else {
                    i6 = i4 + 1;
                }
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }

    static void reverse(int[] iArr, int[] iArr2, int i, int i2, int $i10, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        i = -i6;
        int $i11 = i3;
        i6 = i2;
        while (i < 0) {
            i3 = i9 * ($i10 >> 16);
            int $i12 = -i5;
            while ($i12 < 0) {
                int $i13;
                int $i9 = iArr2[(i6 >> 16) + i3];
                if ($i9 != 0) {
                    $i13 = $i11 + 1;
                    iArr[$i11] = $i9;
                } else {
                    $i13 = $i11 + 1;
                }
                $i12++;
                i6 += i7;
                $i11 = $i13;
            }
            $i10 += i8;
            $i11 += i4;
            i++;
            i6 = i2;
        }
    }

    static void set(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        i = -i9;
        i2 = i4;
        i4 = i6;
        while (i < 0) {
            i5 = i2;
            i3 = -i8;
            while (i3 < 0) {
                i2 = i5 + 1;
                i6 = iArr2[i5];
                if (i6 != 0) {
                    i5 = (16711935 & i6) * i12;
                    i6 = ((((i6 * i12) - i5) & 16711680) + (i5 & -16711936)) >>> 8;
                    i7 = iArr[i4];
                    i5 = i6 + i7;
                    i6 = (i6 & 16711935) + (i7 & 16711935);
                    i7 = ((i5 - i6) & PingManager.STATE_SENSOR_ON_FLAG) + (i6 & 16777472);
                    i6 = i4 + 1;
                    iArr[i4] = (i7 - (i7 >>> 8)) | (i5 - i7);
                } else {
                    i6 = i4 + 1;
                }
                i3++;
                i4 = i6;
                i5 = i2;
            }
            i2 = i5 + i11;
            i++;
            i4 += i10;
        }
    }

    static void set(int[] iArr, byte[] bArr, int[] iArr2, int i, int $i0, int i2, int $i2, int i3, int i4) {
        int $i5 = -(i2 >> 2);
        i2 = -(i2 & 3);
        $i2 = -$i2;
        int $i7 = i;
        while ($i2 < 0) {
            i = $i5;
            while (i < 0) {
                int $i8 = $i7 + 1;
                byte $b9 = bArr[$i7];
                if ($b9 != (byte) 0) {
                    $i7 = $i0 + 1;
                    iArr[$i0] = iArr2[$b9 & -1555336839];
                } else {
                    $i7 = $i0 + 1;
                }
                $i0 = $i8 + 1;
                $b9 = bArr[$i8];
                if ($b9 != (byte) 0) {
                    iArr[$i7] = iArr2[$b9 & 1601308361];
                    $i8 = $i7 + 1;
                } else {
                    $i8 = $i7 + 1;
                }
                $i7 = $i0 + 1;
                $b9 = bArr[$i0];
                if ($b9 != (byte) 0) {
                    iArr[$i8] = iArr2[$b9 & 733462281];
                    $i0 = $i8 + 1;
                } else {
                    $i0 = $i8 + 1;
                }
                $i8 = $i7 + 1;
                $b9 = bArr[$i7];
                if ($b9 != (byte) 0) {
                    iArr[$i0] = iArr2[$b9 & (short) 255];
                    $i0++;
                } else {
                    $i0++;
                }
                i++;
                $i7 = $i8;
            }
            i = $i0;
            $i0 = i2;
            while ($i0 < 0) {
                $i8 = $i7 + 1;
                $b9 = bArr[$i7];
                if ($b9 != (byte) 0) {
                    $i7 = i + 1;
                    iArr[i] = iArr2[$b9 & -611507698];
                } else {
                    $i7 = i + 1;
                }
                $i0++;
                i = $i7;
                $i7 = $i8;
            }
            $i0 = i + i3;
            $i2++;
            $i7 += i4;
        }
    }

    static void set(int[] iArr, int[] iArr2, int i, int i2, int $i1, int i3, int $i3, int i4, int i5) {
        i = -(i3 >> 2);
        i3 = -(i3 & 3);
        $i3 = -$i3;
        int $i7 = i2;
        while ($i3 < 0) {
            for (i2 = i; i2 < 0; i2++) {
                int $i8 = $i7 + 1;
                int $i9 = iArr2[$i7];
                if ($i9 != 0) {
                    $i7 = $i1 + 1;
                    iArr[$i1] = $i9;
                } else {
                    $i7 = $i1 + 1;
                }
                $i9 = $i8 + 1;
                $i1 = iArr2[$i8];
                if ($i1 != 0) {
                    iArr[$i7] = $i1;
                    $i7++;
                } else {
                    $i7++;
                }
                $i1 = $i9 + 1;
                $i9 = iArr2[$i9];
                if ($i9 != 0) {
                    iArr[$i7] = $i9;
                    $i9 = $i7 + 1;
                } else {
                    $i9 = $i7 + 1;
                }
                $i7 = $i1 + 1;
                $i1 = iArr2[$i1];
                if ($i1 != 0) {
                    iArr[$i9] = $i1;
                    $i1 = $i9 + 1;
                } else {
                    $i1 = $i9 + 1;
                }
            }
            i2 = $i1;
            $i1 = i3;
            while ($i1 < 0) {
                $i9 = $i7 + 1;
                $i7 = iArr2[$i7];
                if ($i7 != 0) {
                    $i8 = i2 + 1;
                    iArr[i2] = $i7;
                } else {
                    $i8 = i2 + 1;
                }
                $i1++;
                i2 = $i8;
                $i7 = $i9;
            }
            $i1 = i2 + i4;
            $i3++;
            $i7 += i5;
        }
    }

    static void set(int[] iArr, int[] iArr2, int i, int i2, int $i10, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        i = -i6;
        int $i11 = i3;
        i6 = i2;
        while (i < 0) {
            i3 = i9 * ($i10 >> 16);
            int $i12 = -i5;
            while ($i12 < 0) {
                int $i13;
                int $i9 = iArr2[(i6 >> 16) + i3];
                if ($i9 != 0) {
                    $i13 = $i11 + 1;
                    iArr[$i11] = $i9;
                } else {
                    $i13 = $i11 + 1;
                }
                $i12++;
                i6 += i7;
                $i11 = $i13;
            }
            $i10 += i8;
            $i11 += i4;
            i++;
            i6 = i2;
        }
    }

    void m49a(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        i = i10 & -363633202;
        i4 = (i10 >> 8) & 2118107482;
        for (i5 = -i7; i5 < 0; i5++) {
            i10 = i2;
            i2 = i3;
            i7 = -i6;
            while (i7 < 0) {
                i3 = i10 + 1;
                int $i10 = iArr2[i10];
                if ($i10 == 0) {
                    i10 = i2 + 1;
                } else if ((65535 & $i10) == ((16776960 & $i10) >> 8)) {
                    int $i12 = $i10 & 255;
                    i10 = i2 + 1;
                    iArr[i2] = (((($i12 * i) >> 8) & 16711935) + (($i12 * i4) & -1296414678)) | ($i10 & -16777216);
                } else {
                    i10 = i2 + 1;
                    iArr[i2] = $i10;
                }
                i7++;
                i2 = i10;
                i10 = i3;
            }
            i3 = i2 + i8;
            i2 = i10 + i9;
        }
    }

    public void add() {
        StringBuilder.compareTo(this.size);
    }

    void add(int i) {
    }

    public final void add(int $i2, int i, int $i3, int $i1) {
        $i1 = -16777216 | $i1;
        if (i >= this.count * -12571459 && i < -467581477 * this.data) {
            if ($i2 < 1829547545 * this.buffer) {
                $i3 -= (830601438 * this.buffer) - $i2;
                $i2 = this.buffer * 990070765;
            }
            if ($i3 + $i2 > this.index * -225170509) {
                $i3 = (this.index * 2074797577) - $i2;
            }
            i = ((707971051 * this.length) * i) + $i2;
            for (int $i4 = 0; $i4 < $i3; $i4++) {
                this.size[i + $i4] = $i1;
            }
        }
    }

    public final void add(int $i0, int $i4, int $i1, int $i2, byte b) {
        $i2 = -16777216 | $i2;
        if ($i0 >= this.buffer * 1829547545) {
            if ($i0 < this.index * 2074797577) {
                if ($i4 < this.count * -12571459) {
                    $i1 -= (this.count * -12571459) - $i4;
                    $i4 = this.count * -12571459;
                }
                if ($i4 + $i1 > this.data * -467581477) {
                    $i1 = (this.data * -467581477) - $i4;
                }
                try {
                    $i0 += (this.length * -481290979) * $i4;
                    for ($i4 = 0; $i4 < $i1; $i4++) {
                        this.size[((this.length * -481290979) * $i4) + $i0] = $i2;
                    }
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "gc.at(" + ')');
                }
            }
        }
    }

    public final void add(int $i3, int $i4, int i, int i2, int $i2) {
        $i2 = (-16777216 + $i2) & 16777215;
        i -= $i3;
        int $i5 = i2 - $i4;
        if ($i5 == 0) {
            if (i >= 0) {
                get($i3, $i4, i + 1, $i2, -1008139935);
                return;
            }
            get(i + $i3, $i4, (-i) + 1, $i2, 106747606);
        } else if (i != 0) {
            if ($i5 + i < 0) {
                $i4 += $i5;
                $i5 = -$i5;
                i2 = -i;
                i = $i3 + i;
            } else {
                i2 = i;
                i = $i3;
            }
            if (i2 > $i5) {
                $i4 = ($i4 << 16) + 32768;
                $i3 = (int) Math.floor(0.5d + (((double) ($i5 << 16)) / ((double) i2)));
                i2 += i;
                if (i < 1829547545 * this.buffer) {
                    $i4 += ((this.buffer * 1829547545) - i) * $i3;
                    i = 1829547545 * this.buffer;
                }
                if (i2 >= 2074797577 * this.index) {
                    i2 = (2074797577 * this.index) - 1;
                }
                while (i <= i2) {
                    $i5 = $i4 >> 16;
                    if ($i5 >= this.count * -12571459 && $i5 < this.data * -467581477) {
                        this.size[($i5 * (-481290979 * this.length)) + i] = $i2;
                    }
                    $i4 += $i3;
                    i++;
                }
            } else {
                i = (i << 16) + 32768;
                $i3 = (int) Math.floor((((double) (i2 << 16)) / ((double) $i5)) + 0.5d);
                i2 = $i5 + $i4;
                if ($i4 < -12571459 * this.count) {
                    i += ((-12571459 * this.count) - $i4) * $i3;
                    $i4 = -12571459 * this.count;
                }
                if (i2 >= this.data * -467581477) {
                    i2 = (this.data * -467581477) - 1;
                }
                while ($i4 <= i2) {
                    $i5 = i >> 16;
                    if ($i5 >= 1829547545 * this.buffer && $i5 < 2074797577 * this.index) {
                        this.size[$i5 + ((this.length * -481290979) * $i4)] = $i2;
                    }
                    i += $i3;
                    $i4++;
                }
            }
        } else if ($i5 >= 0) {
            add($i3, $i4, $i5 + 1, $i2, (byte) 1);
        } else {
            add($i3, $i5 + $i4, (-$i5) + 1, $i2, (byte) 1);
        }
    }

    public final void add(int i, int i2, int i3, int i4, int $i4, byte b) {
        try {
            clear(i, i2, i3, i4, -16777216 | $i4, -152066807);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gc.aa(" + ')');
        }
    }

    final void add(int $i0, int $i8, int i, int $i2, int i2, int i3) {
        if (i2 > 0) {
            if (i2 >= 255) {
                add($i0, $i8, i, $i2, (byte) 1);
                return;
            }
            if ($i0 >= 1829547545 * this.buffer) {
                if ($i0 < 2074797577 * this.index) {
                    if ($i8 < -12571459 * this.count) {
                        i -= (-12571459 * this.count) - $i8;
                        $i8 = -12571459 * this.count;
                    }
                    if ($i8 + i > this.data * -467581477) {
                        i = (-467581477 * this.data) - $i8;
                    }
                    i3 = 255 - i2;
                    int $i9 = i2 << 24;
                    int $i5 = (($i2 >> 16) & 255) * i2;
                    int $i6 = i2 * (($i2 >> 8) & 255);
                    int $i7 = i2 * ($i2 & 255);
                    $i2 = (i2 << 24) | $i2;
                    $i0 = ((-481290979 * this.length) * $i8) + $i0;
                    $i8 = 0;
                    while ($i8 < i) {
                        if (this.size[$i0] == 0) {
                            i2 = $i0 + 1;
                            this.size[$i0] = $i2;
                        } else {
                            int $i3 = (this.size[$i0] >> 16) & 255;
                            $i3 = (((($i3 * i3) + $i5) >> 8) << 16) + ((((((this.size[$i0] >> 8) & 255) * i3) + $i6) >> 8) << 8);
                            i2 = $i3;
                            try {
                                this.size[$i0] = ($i3 + ((((this.size[$i0] & 255) * i3) + $i7) >> 8)) | ((this.size[$i0] | $i9) & -16777216);
                                $i3 = this.length * -481290979;
                                i2 = $i3;
                                i2 = $i3 + $i0;
                            } catch (RuntimeException $r2) {
                                throw StringBuilder.append($r2, "gc.ab(" + ')');
                            }
                        }
                        $i8++;
                        $i0 = i2;
                    }
                }
            }
        }
    }

    public void add(Double doubleR, int i, int i2) {
        i += doubleR.count;
        int $i3 = i2 + doubleR.index;
        int $i1 = (-481290979 * this.length) * $i3;
        i2 = $i1;
        i2 = $i1 + i;
        int $i4 = 0;
        int $i5 = doubleR.data;
        int $i6 = doubleR.length;
        int $i2 = (this.length * -481290979) - $i6;
        if ($i3 < -12571459 * this.count) {
            int $i7 = (this.count * -1004284796) - $i3;
            $i5 -= $i7;
            $i3 = this.count * -12571459;
            $i4 = 0 + ($i7 * $i6);
            i2 += $i7 * (this.length * -792730889);
        }
        if ($i3 + $i5 > this.data * -467581477) {
            $i5 -= ($i3 + $i5) - (-467581477 * this.data);
        }
        if (i < this.buffer * 717469061) {
            $i7 = (893536515 * this.buffer) - i;
            i = $i6 - $i7;
            $i4 += $i7;
            $i3 = 0 + $i7;
            $i2 += $i7;
            i2 += $i7;
            $i7 = -1893767562 * this.buffer;
            $i6 = i;
        } else {
            $i3 = 0;
            $i7 = i;
        }
        if ($i6 + $i7 > 2074797577 * this.index) {
            $i1 = ($i7 + $i6) - (-865366927 * this.index);
            i = $i1;
            $i6 -= $i1;
            $i3 += i;
            i += $i2;
        } else {
            i = $i2;
        }
        if ($i6 > 0 && $i5 > 0) {
            Array.toString(this.size, doubleR.buffer, doubleR.size, $i4, i2, $i6, $i5, i, $i3, -2147386566);
        }
    }

    public void add(Double doubleR, int $i5, int $i6, int i, int i2) {
        int $i1 = doubleR.length;
        int $i7 = doubleR.data;
        int $i8 = 0;
        int $i9 = 0;
        int $i10 = doubleR.next;
        int $i11 = doubleR.value;
        int $i2 = ($i10 << 16) / i;
        int $i3 = ($i11 << 16) / i2;
        if (doubleR.count > 0) {
            $i8 = (((doubleR.count << 16) + $i2) - 1) / $i2;
            $i5 += $i8;
            $i8 = 0 + (($i8 * $i2) - (doubleR.count << 16));
        }
        if (doubleR.index > 0) {
            $i9 = (((doubleR.index << 16) + $i3) - 1) / $i3;
            $i6 += $i9;
            $i9 = 0 + (($i9 * $i3) - (doubleR.index << 16));
        }
        if ($i1 < $i10) {
            int $i0 = ($i1 << 16) - $i8;
            i = $i0;
            i = (($i0 + $i2) - 1) / $i2;
        }
        if ($i7 < $i11) {
            $i0 = ($i7 << 16) - $i9;
            i2 = $i0;
            i2 = (($i0 + $i3) - 1) / $i3;
        }
        $i11 = ((this.length * -481290979) * $i6) + $i5;
        $i7 = (-481290979 * this.length) - i;
        if ($i6 + i2 > this.data * -467581477) {
            i2 -= ($i6 + i2) - (-467581477 * this.data);
        }
        if ($i6 < -12571459 * this.count) {
            $i6 = (this.count * -12571459) - $i6;
            i2 -= $i6;
            $i11 += (this.length * -481290979) * $i6;
            $i0 = $i6 * $i3;
            $i6 = $i0;
            $i9 += $i0;
        }
        if ($i5 + i > this.index * 2074797577) {
            $i6 = (i + $i5) - (this.index * 2074797577);
            i -= $i6;
            $i7 += $i6;
        }
        if ($i5 < this.buffer * 1829547545) {
            $i5 = (this.buffer * 1829547545) - $i5;
            i -= $i5;
            $i11 += $i5;
            $i8 += $i5 * $i2;
            $i7 += $i5;
        }
        int[] $r2 = this.size;
        byte[] $r3 = doubleR.buffer;
        int[] $r4 = doubleR.size;
        $i5 = -i2;
        $i6 = $i9;
        $i9 = $i8;
        while ($i5 < 0) {
            i2 = $i1 * ($i6 >> 16);
            $i10 = -i;
            while ($i10 < 0) {
                int $i12;
                byte $b13 = $r3[($i9 >> 16) + i2];
                if ($b13 != (byte) 0) {
                    $i12 = $i11 + 1;
                    $r2[$i11] = $r4[$b13 & (short) 255];
                } else {
                    $i12 = $i11 + 1;
                }
                $i10++;
                $i9 += $i2;
                $i11 = $i12;
            }
            $i11 += $i7;
            $i5++;
            $i6 += $i3;
            $i9 = $i8;
        }
    }

    public void add(Double doubleR, int $i0, int i, short s) {
        try {
            $i0 = doubleR.count + $i0;
            int $i4 = doubleR.index + i;
            int $i1 = (-481290979 * this.length) * $i4;
            i = $i1;
            i = $i1 + $i0;
            int $i5 = 0;
            int $i3 = doubleR.data;
            int $i6 = doubleR.length;
            int $i7 = (this.length * -481290979) - $i6;
            int i2 = 0;
            if ($i4 < -12571459 * this.count) {
                int $i9 = (this.count * -12571459) - $i4;
                $i3 -= $i9;
                $i4 = this.count * -12571459;
                $i5 = 0 + ($i9 * $i6);
                i += $i9 * (this.length * -481290979);
            }
            if ($i4 + $i3 > this.data * -467581477) {
                $i3 -= ($i4 + $i3) - (-467581477 * this.data);
            }
            if ($i0 < this.buffer * 1829547545) {
                $i4 = (1829547545 * this.buffer) - $i0;
                $i6 -= $i4;
                $i0 = 1829547545 * this.buffer;
                $i5 += $i4;
                i += $i4;
                i2 = 0 + $i4;
                $i7 += $i4;
            }
            if ($i6 + $i0 > 2074797577 * this.index) {
                $i1 = ($i0 + $i6) - (2074797577 * this.index);
                $i0 = $i1;
                $i6 -= $i1;
                i2 += $i0;
                $i7 += $i0;
            }
            if ($i6 > 0 && $i3 > 0) {
                Array.toString(this.size, doubleR.buffer, doubleR.size, $i5, i, $i6, $i3, $i7, i2, -2141215494);
            }
        } catch (Throwable $r5) {
            throw StringBuilder.append($r5, "gc.ao(" + ')');
        }
    }

    public final void add(Long longR, int i, int i2) {
        int $i6;
        i += longR.next;
        int $i3 = i2 + longR.value;
        int $i1 = this.length * -481290979;
        i2 = $i1;
        int $i2 = i + ($i1 * $i3);
        int $i4 = longR.data;
        int $i5 = longR.length;
        i2 = (1482586867 * this.length) - $i5;
        if ($i3 < this.count * -12571459) {
            int $i7 = (-1386043563 * this.count) - $i3;
            $i4 -= $i7;
            $i6 = -12571459 * this.count;
            $i3 = ($i7 * $i5) + 0;
            $i1 = $i7 * (this.length * -481290979);
            $i7 = $i1;
            $i2 += $i1;
        } else {
            $i6 = $i3;
            $i3 = 0;
        }
        if ($i4 + $i6 > this.data * -467581477) {
            $i1 = this.data * -2057192682;
            $i7 = $i1;
            $i4 -= ($i6 + $i4) - $i1;
        }
        if (i < this.buffer * 560372401) {
            $i7 = (this.buffer * 605184491) - i;
            $i6 = 0 + $i7;
            i2 += $i7;
            $i5 -= $i7;
            $i2 += $i7;
            $i3 += $i7;
            i = 1829547545 * this.buffer;
        } else {
            $i6 = 0;
        }
        if ($i5 + i > -2023282509 * this.index) {
            $i1 = (i + $i5) - (2074797577 * this.index);
            i = $i1;
            $i5 -= $i1;
            $i6 += i;
            i += i2;
        } else {
            i = i2;
        }
        if ($i5 > 0 && $i4 > 0) {
            Stream.read(this.size, longR.size, 0, $i3, $i2, $i5, $i4, i, $i6, -272836284);
        }
    }

    public final void add(Long longR, int i, int i2, byte b) {
        try {
            int $i9;
            int $i4 = i + longR.next;
            int $i5 = i2 + longR.value;
            int $i0 = this.length * -481290979;
            i = $i0;
            i = $i4 + ($i0 * $i5);
            i2 = 0;
            int $i6 = longR.data;
            int $i3 = longR.length;
            int $i7 = (-481290979 * this.length) - $i3;
            int $i8 = 0;
            if ($i5 < this.count * -12571459) {
                $i9 = (-12571459 * this.count) - $i5;
                $i6 -= $i9;
                $i5 = -12571459 * this.count;
                i2 = 0 + ($i9 * $i3);
                i += $i9 * (this.length * -481290979);
            }
            if ($i6 + $i5 > this.data * -467581477) {
                $i6 -= ($i5 + $i6) - (this.data * -467581477);
            }
            if ($i4 < 1829547545 * this.buffer) {
                $i5 = (this.buffer * 1829547545) - $i4;
                $i3 -= $i5;
                $i4 = this.buffer * 1829547545;
                i2 += $i5;
                i += $i5;
                $i8 = 0 + $i5;
                $i7 += $i5;
            }
            if ($i4 + $i3 > this.index * 2074797577) {
                $i4 = ($i4 + $i3) - (this.index * 2074797577);
                $i3 -= $i4;
                $i7 += $i4;
                $i4 = $i8 + $i4;
            } else {
                $i4 = $i8;
            }
            if ($i3 > 0 && $i6 > 0) {
                int[] $r2 = this.size;
                int[] $r3 = longR.size;
                $i8 = -$i6;
                $i6 = i2;
                while ($i8 < 0) {
                    i2 = (i + $i3) - 3;
                    while (i < i2) {
                        $i5 = i + 1;
                        $i9 = $i6 + 1;
                        $r2[i] = $r3[$i6];
                        i = $i5 + 1;
                        $i6 = $i9 + 1;
                        $r2[$i5] = $r3[$i9];
                        $i5 = i + 1;
                        $i9 = $i6 + 1;
                        $r2[i] = $r3[$i6];
                        i = $i5 + 1;
                        $i6 = $i9 + 1;
                        $r2[$i5] = $r3[$i9];
                    }
                    i2 += 3;
                    while (i < i2) {
                        $i9 = $i6 + 1;
                        $r2[i] = $r3[$i6];
                        i++;
                        $i6 = $i9;
                    }
                    $i8++;
                    i += $i7;
                    $i6 += $i4;
                }
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gc.ai(" + ')');
        }
    }

    public void add(Long longR, int i, int i2, int i3) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        i = $i3 + ((-481290979 * this.length) * $i4);
        int i4 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        i2 = (-481290979 * this.length) - i6;
        int $i8 = this.count * 1491980371;
        int i7 = $i8;
        if ($i4 < $i8) {
            i7 = (this.count * -12571459) - $i4;
            i5 -= i7;
            $i4 = this.count * -12571459;
            i4 = 0 + (i6 * i7);
            i += i7 * (-481290979 * this.length);
        }
        if ($i4 + i5 > this.data * -467581477) {
            $i8 = this.data * -1095024508;
            i7 = $i8;
            i5 -= ($i4 + i5) - $i8;
        }
        if ($i3 < this.buffer * 1829547545) {
            $i3 = (this.buffer * 1829547545) - $i3;
            i6 -= $i3;
            i7 = this.buffer * 1829547545;
            i += $i3;
            $i4 = 0 + $i3;
            i2 += $i3;
            $i3 = i4 + $i3;
        } else {
            $i4 = 0;
            i7 = $i3;
            $i3 = i4;
        }
        if (i7 + i6 > 2074797577 * this.index) {
            i4 = (i7 + i6) - (-747150531 * this.index);
            i6 -= i4;
            $i4 += i4;
            i2 += i4;
        }
        if (i6 > 0 && i5 > 0) {
            read(this.size, longR.size, 0, $i3, i, 0, 0, i6, i5, i2, $i4, i3, 1078166753);
        }
    }

    public void add(Long longR, int i, int i2, int i3, int i4) {
        if (i3 > longR.this$0 || i4 > longR.count) {
            throw new IllegalArgumentException();
        }
        int $i13 = longR.next * i3;
        int $i22 = longR.this$0;
        $i13 = ($i13 / $i22) + i;
        $i22 = longR.next + longR.length;
        int i5 = $i22;
        $i22 = ((longR.this$0 + ($i22 * i3)) - 1) / longR.this$0;
        int i6 = $i22;
        i6 = $i22 + i;
        $i22 = longR.value;
        int $i25 = (($i22 * i4) / longR.count) + i2;
        $i22 = longR.data + longR.value;
        i5 = $i22;
        $i22 = ((($i22 * i4) + longR.count) - 1) / longR.count;
        i5 = $i22;
        i5 = $i22 + i2;
        if ($i13 < 1829547545 * this.buffer) {
            $i13 = 1829547545 * this.buffer;
        }
        if (i6 > 2074797577 * this.index) {
            i6 = this.index * 1514680009;
        }
        if ($i25 < this.count * -12571459) {
            $i25 = this.count * -12571459;
        }
        if (i5 > this.data * -1381219187) {
            i5 = this.data * -467581477;
        }
        if ($i13 < i6 && $i25 < i5) {
            $i22 = this.length * -481290979;
            int i7 = $i22;
            $i22 *= $i25;
            i7 = $i22;
            i7 = $i22 + $i13;
            int i8 = (1942352054 * this.length) - (i6 - $i13);
            if (i7 < this.size.length) {
                while ($i25 < i5) {
                    for (int $i26 = $i13; $i26 < i6; $i26++) {
                        int $i9 = ($i26 - i) << 4;
                        int $i8 = ($i25 - i2) << 4;
                        $i22 = longR.this$0;
                        $i22 *= $i9;
                        int i9 = $i22;
                        int $i4 = ($i22 / i3) - (longR.next << 4);
                        $i22 = ($i9 + 16) * longR.this$0;
                        $i9 = $i22;
                        $i9 = ($i22 / i3) - (longR.next << 4);
                        $i22 = longR.count;
                        $i22 *= $i8;
                        i9 = $i22;
                        int $i6 = ($i22 / i4) - (longR.value << 4);
                        $i22 = ($i8 + 16) * longR.count;
                        $i8 = $i22;
                        i9 = ($i22 / i4) - (longR.value << 4);
                        $i8 = (($i9 - $i4) * (i9 - $i6)) >> 1;
                        if ($i8 != 0) {
                            if ($i4 < 0) {
                                $i4 = 0;
                            }
                            if ($i9 >= (longR.length << 4)) {
                                $i9 = longR.length << 4;
                            }
                            if ($i6 < 0) {
                                $i6 = 0;
                            }
                            if (i9 >= (longR.data << 4)) {
                                i9 = longR.data << 4;
                            }
                            int $i11 = $i9 - 1;
                            int $i12 = i9 - 1;
                            $i9 = 16 - ($i4 & 15);
                            i9 = ($i11 & 15) + 1;
                            int $i5 = 16 - ($i6 & 15);
                            int $i27 = ($i12 & 15) + 1;
                            $i4 >>= 4;
                            $i11 >>= 4;
                            $i6 >>= 4;
                            $i12 >>= 4;
                            int $i17 = 0;
                            int $i18 = 0;
                            int $i20 = 0;
                            int $i15 = 0;
                            for (int $i28 = $i6; $i28 <= $i12; $i28++) {
                                int $i29 = 16;
                                if ($i6 == $i28) {
                                    $i29 = $i5;
                                }
                                if ($i28 == $i12) {
                                    $i29 = $i27;
                                }
                                int $i21 = $i4;
                                while ($i21 <= $i11) {
                                    int $i14;
                                    int $i19 = longR.size[(longR.length * $i28) + $i21];
                                    if ($i19 != 0) {
                                        $i14 = $i4 == $i21 ? $i29 * $i9 : $i11 == $i21 ? $i29 * i9 : $i29 << 4;
                                        $i15 += $i14;
                                        $i17 += (($i19 >> 16) & 255) * $i14;
                                        int $i16 = (($i19 >> 8) & 1654085403) * $i14;
                                        $i14 = ($i14 * ($i19 & -172523995)) + $i20;
                                        $i20 = $i18 + $i16;
                                        $i18 = $i17;
                                    } else {
                                        $i14 = $i20;
                                        $i20 = $i18;
                                        $i18 = $i17;
                                    }
                                    $i21++;
                                    $i17 = $i18;
                                    $i18 = $i20;
                                    $i20 = $i14;
                                }
                            }
                            if ($i15 >= $i8) {
                                this.size[i7] = -16777216 | (($i20 / $i15) + ((($i18 / $i15) << 8) + (($i17 / $i15) << 16)));
                            }
                            i7++;
                        }
                    }
                    i7 += i8;
                    $i25++;
                }
            }
        }
    }

    public void add(Long longR, int $i5, int $i6, int i, int i2, int i3) {
        if (i > 0 && i2 > 0) {
            i3 = longR.length;
            int $i7 = longR.data;
            int $i8 = 0;
            int $i9 = 0;
            int $i10 = longR.this$0;
            int $i11 = longR.count;
            int i4 = ($i10 << 16) / i;
            int i5 = ($i11 << 16) / i2;
            if (longR.next > 0) {
                $i8 = (((longR.next << 16) + i4) - 1) / i4;
                $i5 += $i8;
                $i8 = 0 + (($i8 * i4) - (longR.next << 16));
            }
            try {
                int $i0;
                if (longR.value > 0) {
                    $i9 = (((longR.value << 16) + i5) - 1) / i5;
                    $i6 += $i9;
                    $i9 = 0 + (($i9 * i5) - (longR.value << 16));
                }
                if (i3 < $i10) {
                    $i0 = (i3 << 16) - $i8;
                    i = $i0;
                    i = (($i0 + i4) - 1) / i4;
                }
                if ($i7 < $i11) {
                    $i0 = ($i7 << 16) - $i9;
                    i2 = $i0;
                    i2 = (($i0 + i5) - 1) / i5;
                }
                $i7 = ((-481290979 * this.length) * $i6) + $i5;
                $i0 = this.length * -481290979;
                $i11 = $i0;
                $i11 = $i0 - i;
                if (i2 + $i6 > this.data * -467581477) {
                    i2 -= (i2 + $i6) - (-467581477 * this.data);
                }
                if ($i6 < -12571459 * this.count) {
                    $i6 = (this.count * -12571459) - $i6;
                    i2 -= $i6;
                    $i0 = this.length * -481290979;
                    $i10 = $i0;
                    $i0 *= $i6;
                    $i10 = $i0;
                    $i7 += $i0;
                    $i0 = $i6 * i5;
                    $i6 = $i0;
                    $i9 += $i0;
                }
                if (i + $i5 > this.index * 2074797577) {
                    $i6 = ($i5 + i) - (2074797577 * this.index);
                    i -= $i6;
                    $i11 += $i6;
                }
                if ($i5 < this.buffer * 1829547545) {
                    $i5 = (this.buffer * 1829547545) - $i5;
                    i -= $i5;
                    $i7 += $i5;
                    $i8 += $i5 * i4;
                    $i11 += $i5;
                }
                CopyOnWriteArrayList.get(this.size, longR.size, 0, $i8, $i9, $i7, $i11, i, i2, i4, i5, i3, (short) -14366);
            } catch (Throwable $r4) {
                throw StringBuilder.append($r4, "gc.ax(" + ')');
            }
        }
    }

    void add(Long longR, int i, int i2, int $i2, int i3, int $i4, int i4) {
        if (i4 != 0) {
            int $i8 = i - (longR.next << 4);
            i2 -= longR.value << 4;
            double $d0 = ((double) (-1231506677 & $i4)) * 9.587379924285257E-5d;
            double d = $d0;
            $d0 = (Math.sin($d0) * ((double) i4)) + 0.5d;
            double d2 = $d0;
            i = (int) Math.floor($d0);
            $d0 = (Math.cos(d) * ((double) i4)) + 0.5d;
            d2 = $d0;
            int $i6 = (int) Math.floor($d0);
            int $i42 = -$i8;
            $i4 = ($i42 * $i6) + ((-i2) * i);
            int $i7 = ((-(-$i8)) * i) + ((-i2) * $i6);
            int $i9 = (((longR.length << 4) - $i8) * $i6) + ((-i2) * i);
            int $i10 = ((-((longR.length << 4) - $i8)) * i) + ((-i2) * $i6);
            int $i11 = ((-$i8) * $i6) + (((longR.data << 4) - i2) * i);
            int $i12 = (((longR.data << 4) - i2) * $i6) + ((-(-$i8)) * i);
            int $i13 = (((longR.data << 4) - i2) * i) + (((longR.length << 4) - $i8) * $i6);
            $i42 = i * (-((longR.length << 4) - $i8));
            i = $i42;
            i = $i42 + ($i6 * ((longR.data << 4) - i2));
            if ($i4 >= $i9) {
                $i6 = $i4;
                $i4 = $i9;
                $i9 = $i6;
            }
            if ($i11 < $i4) {
                $i4 = $i11;
            }
            if ($i13 < $i4) {
                $i4 = $i13;
            }
            if ($i11 <= $i9) {
                $i11 = $i9;
            }
            if ($i13 <= $i11) {
                $i13 = $i11;
            }
            if ($i7 < $i10) {
                $i6 = $i10;
                $i10 = $i7;
                $i7 = $i6;
            }
            if ($i12 < $i10) {
                $i10 = $i12;
            }
            if (i < $i10) {
                $i10 = i;
            }
            if ($i12 <= $i7) {
                $i12 = $i7;
            }
            if (i <= $i12) {
                i = $i12;
            }
            $i7 = $i10 >> 12;
            $i9 = ($i4 >> 12) + $i2;
            $i4 = $i7 + i3;
            $i6 = ((i - 723459670) >> 12) + i3;
            $i7 = $i9 >> 4;
            i = (((($i13 + 4095) >> 12) + $i2) + 15) >> 4;
            $i9 = $i4 >> 4;
            $i4 = ($i6 + 15) >> 4;
            if ($i7 < this.buffer * 1829547545) {
                $i7 = 1829547545 * this.buffer;
            }
            if (i > -1340898677 * this.index) {
                i = this.index * -1631050200;
            }
            if ($i9 < this.count * -12571459) {
                $i9 = -699988706 * this.count;
            }
            if ($i4 > -467581477 * this.data) {
                $i4 = 2023956251 * this.data;
            }
            i = $i7 - i;
            if (i < 0) {
                $i10 = $i9 - $i4;
                if ($i10 < 0) {
                    $i42 = this.length * -481290979;
                    $i4 = $i42;
                    $i6 = ($i42 * $i9) + $i7;
                    d2 = 1.6777216E7d / ((double) i4);
                    $d0 = (Math.sin(d) * d2) + 0.5d;
                    double d3 = $d0;
                    $i4 = (int) Math.floor($d0);
                    $d0 = (d2 * Math.cos(d)) + 0.5d;
                    d = $d0;
                    i4 = (int) Math.floor($d0);
                    $i2 = (($i7 << 4) + 8) - $i2;
                    $i7 = (($i9 << 4) + 8) - i3;
                    i3 = ($i8 << 8) - (($i4 * $i7) >> 4);
                    i2 = (i2 << 8) + (($i7 * i4) >> 4);
                    if (i4 == 0) {
                        if ($i4 == 0) {
                            for ($i2 = $i10; $i2 < 0; $i2++) {
                                if (i3 >= 0 && i2 >= 0 && i3 - (longR.length << 12) < 0 && i2 - (longR.data << 12) < 0) {
                                    $i4 = i;
                                    i4 = $i6;
                                    while ($i4 < 0) {
                                        $i8 = longR.size[(longR.length * (i2 >> 12)) + (i3 >> 12)];
                                        if ($i8 != 0) {
                                            $i7 = i4 + 1;
                                            this.size[i4] = $i8;
                                        } else {
                                            $i7 = i4 + 1;
                                        }
                                        $i4++;
                                        i4 = $i7;
                                    }
                                }
                                $i42 = this.length * -481290979;
                                $i4 = $i42;
                                $i6 += $i42;
                            }
                        } else if ($i4 < 0) {
                            i4 = $i10;
                            while (i4 < 0) {
                                $i8 = i2 + (($i4 * $i2) >> 4);
                                if (i3 >= 0) {
                                    if (i3 - (longR.length << 12) < 0) {
                                        $i7 = $i8 - (longR.data << 12);
                                        if ($i7 >= 0) {
                                            $i7 = ($i4 - $i7) / $i4;
                                            $i9 = i + $i7;
                                            $i8 += $i4 * $i7;
                                            $i7 += $i6;
                                        } else {
                                            $i9 = i;
                                            $i7 = $i6;
                                        }
                                        $i10 = ($i8 - $i4) / $i4;
                                        if ($i10 > $i9) {
                                            $i9 = $i10;
                                        }
                                        while ($i9 < 0) {
                                            $i10 = longR.size[(i3 >> 12) + (($i8 >> 12) * longR.length)];
                                            if ($i10 != 0) {
                                                $i11 = $i7 + 1;
                                                this.size[$i7] = $i10;
                                            } else {
                                                $i11 = $i7 + 1;
                                            }
                                            $i8 += $i4;
                                            $i9++;
                                            $i7 = $i11;
                                        }
                                    }
                                }
                                $i6 += -481290979 * this.length;
                                i4++;
                                i3 -= $i4;
                            }
                        } else {
                            i4 = $i10;
                            while (i4 < 0) {
                                $i8 = i2 + (($i2 * $i4) >> 4);
                                if (i3 >= 0 && i3 - (longR.length << 12) < 0) {
                                    if ($i8 < 0) {
                                        $i9 = (($i4 - 1) - $i8) / $i4;
                                        $i7 = i + $i9;
                                        $i8 += $i4 * $i9;
                                        $i9 += $i6;
                                    } else {
                                        $i7 = i;
                                        $i9 = $i6;
                                    }
                                    $i10 = ((($i8 + 1) - (longR.data << 12)) - $i4) / $i4;
                                    if ($i10 > $i7) {
                                        $i7 = $i10;
                                    }
                                    while ($i7 < 0) {
                                        $i10 = longR.size[(($i8 >> 12) * longR.length) + (i3 >> 12)];
                                        if ($i10 != 0) {
                                            $i11 = $i9 + 1;
                                            this.size[$i9] = $i10;
                                        } else {
                                            $i11 = $i9 + 1;
                                        }
                                        $i8 += $i4;
                                        $i7++;
                                        $i9 = $i11;
                                    }
                                }
                                $i6 += -481290979 * this.length;
                                i4++;
                                i3 -= $i4;
                            }
                        }
                    } else if (i4 < 0) {
                        if ($i4 == 0) {
                            for ($i4 = $i10; $i4 < 0; $i4++) {
                                $i8 = ((i4 * $i2) >> 4) + i3;
                                if (i2 >= 0) {
                                    if (i2 - (longR.data << 12) < 0) {
                                        $i7 = $i8 - (longR.length << 12);
                                        if ($i7 >= 0) {
                                            $i7 = (i4 - $i7) / i4;
                                            $i9 = i + $i7;
                                            $i8 += $i7 * i4;
                                            $i7 += $i6;
                                        } else {
                                            $i9 = i;
                                            $i7 = $i6;
                                        }
                                        $i10 = ($i8 - i4) / i4;
                                        if ($i10 > $i9) {
                                            $i9 = $i10;
                                        }
                                        while ($i9 < 0) {
                                            $i10 = longR.size[(longR.length * (i2 >> 12)) + ($i8 >> 12)];
                                            if ($i10 != 0) {
                                                $i11 = $i7 + 1;
                                                this.size[$i7] = $i10;
                                            } else {
                                                $i11 = $i7 + 1;
                                            }
                                            $i8 += i4;
                                            $i9++;
                                            $i7 = $i11;
                                        }
                                    }
                                }
                                i2 += i4;
                                $i6 += this.length * -481290979;
                            }
                        } else if ($i4 < 0) {
                            $i8 = $i10;
                            $i7 = i3;
                            i3 = $i6;
                            while ($i8 < 0) {
                                $i6 = $i7 + ((i4 * $i2) >> 4);
                                $i9 = (($i4 * $i2) >> 4) + i2;
                                $i10 = $i6 - (longR.length << 12);
                                if ($i10 >= 0) {
                                    $i11 = (i4 - $i10) / i4;
                                    $i10 = i + $i11;
                                    $i6 += i4 * $i11;
                                    $i9 += $i4 * $i11;
                                    $i11 += i3;
                                } else {
                                    $i10 = i;
                                    $i11 = i3;
                                }
                                $i12 = ($i6 - i4) / i4;
                                if ($i12 > $i10) {
                                    $i10 = $i12;
                                }
                                $i12 = $i9 - (longR.data << 12);
                                if ($i12 >= 0) {
                                    $i12 = ($i4 - $i12) / $i4;
                                    $i10 += $i12;
                                    $i6 += i4 * $i12;
                                    $i9 += $i12 * $i4;
                                    $i11 += $i12;
                                }
                                $i12 = ($i9 - $i4) / $i4;
                                if ($i12 > $i10) {
                                    $i10 = $i12;
                                }
                                while ($i10 < 0) {
                                    $i12 = longR.size[(longR.length * ($i9 >> 12)) + ($i6 >> 12)];
                                    if ($i12 != 0) {
                                        $i13 = $i11 + 1;
                                        this.size[$i11] = $i12;
                                    } else {
                                        $i13 = $i11 + 1;
                                    }
                                    $i6 += i4;
                                    $i9 += $i4;
                                    $i10++;
                                    $i11 = $i13;
                                }
                                i2 += i4;
                                i3 += -481290979 * this.length;
                                $i8++;
                                $i7 -= $i4;
                            }
                        } else {
                            $i8 = $i10;
                            $i7 = i3;
                            i3 = $i6;
                            while ($i8 < 0) {
                                $i6 = $i7 + (($i2 * i4) >> 4);
                                $i9 = (($i2 * $i4) >> 4) + i2;
                                $i10 = $i6 - (longR.length << 12);
                                if ($i10 >= 0) {
                                    $i11 = (i4 - $i10) / i4;
                                    $i10 = i + $i11;
                                    $i6 += i4 * $i11;
                                    $i9 += $i4 * $i11;
                                    $i11 += i3;
                                } else {
                                    $i10 = i;
                                    $i11 = i3;
                                }
                                $i12 = ($i6 - i4) / i4;
                                if ($i12 > $i10) {
                                    $i10 = $i12;
                                }
                                if ($i9 < 0) {
                                    $i12 = (($i4 - 1) - $i9) / $i4;
                                    $i10 += $i12;
                                    $i6 += i4 * $i12;
                                    $i9 += $i12 * $i4;
                                    $i11 += $i12;
                                }
                                $i12 = ((($i9 + 1) - (longR.data << 12)) - $i4) / $i4;
                                if ($i12 > $i10) {
                                    $i10 = $i12;
                                }
                                while ($i10 < 0) {
                                    $i12 = longR.size[($i6 >> 12) + (longR.length * ($i9 >> 12))];
                                    if ($i12 != 0) {
                                        $i13 = $i11 + 1;
                                        this.size[$i11] = $i12;
                                    } else {
                                        $i13 = $i11 + 1;
                                    }
                                    $i6 += i4;
                                    $i9 += $i4;
                                    $i10++;
                                    $i11 = $i13;
                                }
                                i2 += i4;
                                i3 += 1353639402 * this.length;
                                $i8++;
                                $i7 -= $i4;
                            }
                        }
                    } else if ($i4 == 0) {
                        for ($i4 = $i10; $i4 < 0; $i4++) {
                            $i8 = (($i2 * i4) >> 4) + i3;
                            if (i2 >= 0) {
                                if (i2 - (longR.data << 12) < 0) {
                                    if ($i8 < 0) {
                                        $i7 = ((i4 - 1) - $i8) / i4;
                                        $i9 = i + $i7;
                                        $i8 += $i7 * i4;
                                        $i7 += $i6;
                                    } else {
                                        $i9 = i;
                                        $i7 = $i6;
                                    }
                                    $i10 = ((($i8 + 1) - (longR.length << 12)) - i4) / i4;
                                    if ($i10 > $i9) {
                                        $i9 = $i10;
                                    }
                                    while ($i9 < 0) {
                                        $i11 = longR.size[((i2 >> 12) * longR.length) + ($i8 >> 12)];
                                        if ($i11 == 0) {
                                            $i10 = $i7 + 1;
                                        } else {
                                            $i10 = $i7 + 1;
                                            this.size[$i7] = $i11;
                                        }
                                        $i8 += i4;
                                        $i9++;
                                        $i7 = $i10;
                                    }
                                }
                            }
                            i2 += i4;
                            $i6 += -225862877 * this.length;
                        }
                    } else if ($i4 < 0) {
                        $i8 = $i10;
                        $i7 = i3;
                        i3 = $i6;
                        while ($i8 < 0) {
                            $i6 = $i7 + ((i4 * $i2) >> 4);
                            $i9 = i2 + (($i4 * $i2) >> 4);
                            if ($i6 < 0) {
                                $i11 = ((i4 - 1) - $i6) / i4;
                                $i10 = i + $i11;
                                $i6 += $i11 * i4;
                                $i9 += $i11 * $i4;
                                $i11 += i3;
                            } else {
                                $i10 = i;
                                $i11 = i3;
                            }
                            $i12 = ((($i6 + 1) - (longR.length << 12)) - i4) / i4;
                            if ($i12 > $i10) {
                                $i10 = $i12;
                            }
                            $i12 = $i9 - (longR.data << 12);
                            if ($i12 >= 0) {
                                $i12 = ($i4 - $i12) / $i4;
                                $i10 += $i12;
                                $i6 += i4 * $i12;
                                $i9 += $i12 * $i4;
                                $i11 += $i12;
                            }
                            $i12 = ($i9 - $i4) / $i4;
                            if ($i12 > $i10) {
                                $i10 = $i12;
                            }
                            while ($i10 < 0) {
                                $i13 = longR.size[(($i9 >> 12) * longR.length) + ($i6 >> 12)];
                                if ($i13 != 0) {
                                    $i12 = $i11 + 1;
                                    this.size[$i11] = $i13;
                                } else {
                                    $i12 = $i11 + 1;
                                }
                                $i6 += i4;
                                $i9 += $i4;
                                $i10++;
                                $i11 = $i12;
                            }
                            i3 += this.length * -481290979;
                            $i8++;
                            i2 += i4;
                            $i7 -= $i4;
                        }
                    } else {
                        $i8 = $i10;
                        $i7 = i3;
                        i3 = $i6;
                        while ($i8 < 0) {
                            $i6 = (($i2 * i4) >> 4) + $i7;
                            $i9 = (($i4 * $i2) >> 4) + i2;
                            if ($i6 < 0) {
                                $i11 = ((i4 - 1) - $i6) / i4;
                                $i10 = i + $i11;
                                $i6 += $i11 * i4;
                                $i9 += $i11 * $i4;
                                $i11 += i3;
                            } else {
                                $i10 = i;
                                $i11 = i3;
                            }
                            $i12 = ((($i6 + 1) - (longR.length << 12)) - i4) / i4;
                            if ($i12 > $i10) {
                                $i10 = $i12;
                            }
                            if ($i9 < 0) {
                                $i12 = (($i4 - 1) - $i9) / $i4;
                                $i10 += $i12;
                                $i6 += i4 * $i12;
                                $i9 += $i12 * $i4;
                                $i11 += $i12;
                            }
                            $i12 = ((($i9 + 1) - (longR.data << 12)) - $i4) / $i4;
                            if ($i12 > $i10) {
                                $i10 = $i12;
                            }
                            while ($i10 < 0) {
                                $i12 = longR.size[($i6 >> 12) + (longR.length * ($i9 >> 12))];
                                if ($i12 != 0) {
                                    $i13 = $i11 + 1;
                                    this.size[$i11] = $i12;
                                } else {
                                    $i13 = $i11 + 1;
                                }
                                $i6 += i4;
                                $i9 += $i4;
                                $i10++;
                                $i11 = $i13;
                            }
                            i2 += i4;
                            i3 += 1553190604 * this.length;
                            $i8++;
                            $i7 -= $i4;
                        }
                    }
                }
            }
        }
    }

    public void add(Long longR, int i, int $i1, int i2, int i3, int $i4, int i4, double d, int i5) {
        int $i8 = (-i2) / 2;
        int $i9 = (-i3) / 2;
        try {
            int $i7 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            $i7 = ($i7 * i5) >> 8;
            i5 = (((int) $d0) * i5) >> 8;
            $i4 = ($i4 << 16) + (($i8 * i5) + ($i7 * $i9));
            i4 = (($i9 * i5) - ($i8 * $i7)) + (i4 << 16);
            i += (-481290979 * this.length) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i8 = i4;
                $i9 = $i4;
                int $i10 = i;
                int $i11 = -i2;
                while ($i11 < 0) {
                    int $i12;
                    int $i13 = longR.size[(($i8 >> 16) * longR.length) + ($i9 >> 16)];
                    if ($i13 != 0) {
                        $i12 = $i10 + 1;
                        this.size[$i10] = $i13;
                    } else {
                        $i12 = $i10 + 1;
                    }
                    $i9 += i5;
                    $i8 -= $i7;
                    $i11++;
                    $i10 = $i12;
                }
                $i4 += $i7;
                i4 += i5;
                i += -481290979 * this.length;
            }
        } catch (Exception e) {
        }
    }

    public void add(Long longR, int i, int $i1, int i2, int i3, int $i4, int i4, double d, int i5, int i6) {
        int $i8 = (-i2) / 2;
        int $i9 = (-i3) / 2;
        try {
            i6 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            i6 = (i6 * i5) >> 8;
            i5 = (((int) $d0) * i5) >> 8;
            $i4 = ($i4 << 16) + (($i8 * i5) + (i6 * $i9));
            i4 = (($i9 * i5) - ($i8 * i6)) + (i4 << 16);
            i += (-481290979 * this.length) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i8 = i4;
                $i9 = $i4;
                int $i10 = i;
                int $i11 = -i2;
                while ($i11 < 0) {
                    int $i12;
                    int $i13 = longR.size[(($i8 >> 16) * longR.length) + ($i9 >> 16)];
                    if ($i13 != 0) {
                        $i12 = $i10 + 1;
                        try {
                            this.size[$i10] = $i13;
                        } catch (RuntimeException $r3) {
                            throw StringBuilder.append($r3, "gc.bp(" + ')');
                        }
                    }
                    $i12 = $i10 + 1;
                    $i9 += i5;
                    $i8 -= i6;
                    $i11++;
                    $i10 = $i12;
                }
                $i4 += i6;
                i4 += i5;
                i += -481290979 * this.length;
            }
        } catch (Exception e) {
        }
    }

    void add(Long longR, int i, int i2, int i3, int $i3, int i4, int i5, int i6) {
        if (i5 != 0) {
            int $i7 = i - (longR.next << 4);
            i6 = i2 - (longR.value << 4);
            double $d0 = ((double) (65535 & i4)) * 9.587379924285257E-5d;
            double $d1 = (Math.sin($d0) * ((double) i5)) + 0.5d;
            double d = $d1;
            i = (int) Math.floor($d1);
            $d1 = (Math.cos($d0) * ((double) i5)) + 0.5d;
            d = $d1;
            i4 = (int) Math.floor($d1);
            int $i1 = -$i7;
            i2 = ($i1 * i4) + ((-i6) * i);
            int $i8 = ((-(-$i7)) * i) + ((-i6) * i4);
            int $i9 = (((longR.length << 4) - $i7) * i4) + ((-i6) * i);
            int $i10 = ((-((longR.length << 4) - $i7)) * i) + ((-i6) * i4);
            int $i12 = ((-$i7) * i4) + (((longR.data << 4) - i6) * i);
            int $i11 = (((longR.data << 4) - i6) * i4) + ((-(-$i7)) * i);
            $i1 = (longR.length << 4) - $i7;
            int i7 = $i1;
            $i1 *= i4;
            i7 = $i1;
            int $i13 = (((longR.data << 4) - i6) * i) + $i1;
            $i1 = (longR.length << 4) - $i7;
            i7 = $i1;
            $i1 = i * (-$i1);
            i = $i1;
            i = $i1 + (i4 * ((longR.data << 4) - i6));
            if (i2 >= $i9) {
                i4 = i2;
                i2 = $i9;
                $i9 = i4;
            }
            if ($i12 < i2) {
                i2 = $i12;
            }
            if ($i13 < i2) {
                i2 = $i13;
            }
            if ($i12 <= $i9) {
                $i12 = $i9;
            }
            if ($i13 <= $i12) {
                $i13 = $i12;
            }
            if ($i8 < $i10) {
                i4 = $i10;
                $i10 = $i8;
                $i8 = i4;
            }
            if ($i11 < $i10) {
                $i10 = $i11;
            }
            if (i < $i10) {
                $i10 = i;
            }
            if ($i11 <= $i8) {
                $i11 = $i8;
            }
            if (i <= $i11) {
                i = $i11;
            }
            $i8 = ((i + 4095) >> 12) + $i3;
            i2 = ((i2 >> 12) + i3) >> 4;
            i = (((($i13 + 4095) >> 12) + i3) + 15) >> 4;
            $i9 = (($i10 >> 12) + $i3) >> 4;
            i4 = ($i8 + 15) >> 4;
            if (i2 < this.buffer * 1829547545) {
                i2 = 1829547545 * this.buffer;
            }
            try {
                if (i > 2074797577 * this.index) {
                    i = this.index * 2074797577;
                }
                if ($i9 < this.count * -12571459) {
                    $i9 = -12571459 * this.count;
                }
                if (i4 > -467581477 * this.data) {
                    i4 = -467581477 * this.data;
                }
                i = i2 - i;
                if (i < 0) {
                    $i10 = $i9 - i4;
                    if ($i10 < 0) {
                        $i1 = this.length * -481290979;
                        i4 = $i1;
                        $i8 = ($i1 * $i9) + i2;
                        d = 1.6777216E7d / ((double) i5);
                        $d1 = (Math.sin($d0) * d) + 0.5d;
                        double d2 = $d1;
                        i4 = (int) Math.floor($d1);
                        i5 = (int) Math.floor((d * Math.cos($d0)) + 0.5d);
                        i2 = ((i2 << 4) + 8) - i3;
                        $i3 = (($i9 << 4) + 8) - $i3;
                        i3 = ($i7 << 8) - ((i4 * $i3) >> 4);
                        $i3 = (($i3 * i5) >> 4) + (i6 << 8);
                        if (i5 == 0) {
                            if (i4 == 0) {
                                i2 = $i8;
                                for (i4 = $i10; i4 < 0; i4++) {
                                    if (i3 >= 0 && $i3 >= 0) {
                                        if (i3 - (longR.length << 12) < 0) {
                                            if ($i3 - (longR.data << 12) < 0) {
                                                i5 = i;
                                                i6 = i2;
                                                while (i5 < 0) {
                                                    $i7 = longR.size[(longR.length * ($i3 >> 12)) + (i3 >> 12)];
                                                    if ($i7 != 0) {
                                                        $i8 = i6 + 1;
                                                        this.size[i6] = $i7;
                                                    } else {
                                                        $i8 = i6 + 1;
                                                    }
                                                    i5++;
                                                    i6 = $i8;
                                                }
                                            }
                                        }
                                    }
                                    i2 += this.length * -481290979;
                                }
                            } else if (i4 < 0) {
                                i5 = $i10;
                                i6 = i3;
                                i3 = $i8;
                                while (i5 < 0) {
                                    $i7 = $i3 + ((i4 * i2) >> 4);
                                    if (i6 >= 0) {
                                        if (i6 - (longR.length << 12) < 0) {
                                            $i8 = $i7 - (longR.data << 12);
                                            if ($i8 >= 0) {
                                                $i9 = (i4 - $i8) / i4;
                                                $i8 = i + $i9;
                                                $i7 += i4 * $i9;
                                                $i9 = i3 + $i9;
                                            } else {
                                                $i8 = i;
                                                $i9 = i3;
                                            }
                                            $i10 = ($i7 - i4) / i4;
                                            if ($i10 > $i8) {
                                                $i8 = $i10;
                                            }
                                            while ($i8 < 0) {
                                                $i10 = longR.size[(i6 >> 12) + (($i7 >> 12) * longR.length)];
                                                if ($i10 != 0) {
                                                    $i12 = $i9 + 1;
                                                    this.size[$i9] = $i10;
                                                } else {
                                                    $i12 = $i9 + 1;
                                                }
                                                $i7 += i4;
                                                $i8++;
                                                $i9 = $i12;
                                            }
                                        }
                                    }
                                    i3 += -481290979 * this.length;
                                    i5++;
                                    i6 -= i4;
                                }
                            } else {
                                i5 = $i10;
                                i6 = i3;
                                i3 = $i8;
                                while (i5 < 0) {
                                    $i7 = $i3 + ((i2 * i4) >> 4);
                                    if (i6 >= 0) {
                                        if (i6 - (longR.length << 12) < 0) {
                                            if ($i7 < 0) {
                                                $i9 = ((i4 - 1) - $i7) / i4;
                                                $i8 = i + $i9;
                                                $i7 += i4 * $i9;
                                                $i9 = i3 + $i9;
                                            } else {
                                                $i8 = i;
                                                $i9 = i3;
                                            }
                                            $i10 = ((($i7 + 1) - (longR.data << 12)) - i4) / i4;
                                            if ($i10 > $i8) {
                                                $i8 = $i10;
                                            }
                                            while ($i8 < 0) {
                                                $i12 = longR.size[(($i7 >> 12) * longR.length) + (i6 >> 12)];
                                                if ($i12 != 0) {
                                                    $i10 = $i9 + 1;
                                                    this.size[$i9] = $i12;
                                                } else {
                                                    $i10 = $i9 + 1;
                                                }
                                                $i7 += i4;
                                                $i8++;
                                                $i9 = $i10;
                                            }
                                        }
                                    }
                                    i3 += -481290979 * this.length;
                                    i5++;
                                    i6 -= i4;
                                }
                            }
                        } else if (i5 < 0) {
                            if (i4 == 0) {
                                i4 = $i10;
                                i6 = $i3;
                                $i3 = $i8;
                                while (i4 < 0) {
                                    $i7 = ((i5 * i2) >> 4) + i3;
                                    if (i6 >= 0) {
                                        if (i6 - (longR.data << 12) < 0) {
                                            $i8 = $i7 - (longR.length << 12);
                                            if ($i8 >= 0) {
                                                $i9 = (i5 - $i8) / i5;
                                                $i8 = i + $i9;
                                                $i7 += $i9 * i5;
                                                $i9 = $i3 + $i9;
                                            } else {
                                                $i8 = i;
                                                $i9 = $i3;
                                            }
                                            $i10 = ($i7 - i5) / i5;
                                            if ($i10 > $i8) {
                                                $i8 = $i10;
                                            }
                                            while ($i8 < 0) {
                                                $i10 = longR.size[(longR.length * (i6 >> 12)) + ($i7 >> 12)];
                                                if ($i10 != 0) {
                                                    $i12 = $i9 + 1;
                                                    this.size[$i9] = $i10;
                                                } else {
                                                    $i12 = $i9 + 1;
                                                }
                                                $i7 += i5;
                                                $i8++;
                                                $i9 = $i12;
                                            }
                                        }
                                    }
                                    $i3 += this.length * -481290979;
                                    i4++;
                                    i6 += i5;
                                }
                            } else if (i4 < 0) {
                                i6 = $i10;
                                $i7 = i3;
                                i3 = $i8;
                                while (i6 < 0) {
                                    $i8 = $i7 + ((i5 * i2) >> 4);
                                    $i9 = ((i4 * i2) >> 4) + $i3;
                                    $i10 = $i8 - (longR.length << 12);
                                    if ($i10 >= 0) {
                                        $i10 = (i5 - $i10) / i5;
                                        $i11 = i + $i10;
                                        $i8 += i5 * $i10;
                                        $i9 += i4 * $i10;
                                        $i10 = i3 + $i10;
                                    } else {
                                        $i11 = i;
                                        $i10 = i3;
                                    }
                                    $i12 = ($i8 - i5) / i5;
                                    if ($i12 <= $i11) {
                                        $i12 = $i11;
                                    }
                                    $i11 = $i9 - (longR.data << 12);
                                    if ($i11 >= 0) {
                                        $i11 = (i4 - $i11) / i4;
                                        $i12 += $i11;
                                        $i8 += i5 * $i11;
                                        $i9 += $i11 * i4;
                                        $i10 += $i11;
                                    }
                                    $i11 = ($i9 - i4) / i4;
                                    if ($i11 > $i12) {
                                        $i12 = $i11;
                                    }
                                    while ($i12 < 0) {
                                        $i11 = longR.size[(longR.length * ($i9 >> 12)) + ($i8 >> 12)];
                                        if ($i11 != 0) {
                                            $i13 = $i10 + 1;
                                            this.size[$i10] = $i11;
                                        } else {
                                            $i13 = $i10 + 1;
                                        }
                                        $i8 += i5;
                                        $i9 += i4;
                                        $i12++;
                                        $i10 = $i13;
                                    }
                                    i3 += -481290979 * this.length;
                                    i6++;
                                    $i3 += i5;
                                    $i7 -= i4;
                                }
                            } else {
                                i6 = $i10;
                                $i7 = i3;
                                i3 = $i8;
                                while (i6 < 0) {
                                    $i8 = $i7 + ((i2 * i5) >> 4);
                                    $i9 = ((i2 * i4) >> 4) + $i3;
                                    $i10 = $i8 - (longR.length << 12);
                                    if ($i10 >= 0) {
                                        $i10 = (i5 - $i10) / i5;
                                        $i11 = i + $i10;
                                        $i8 += i5 * $i10;
                                        $i9 += i4 * $i10;
                                        $i10 = i3 + $i10;
                                    } else {
                                        $i11 = i;
                                        $i10 = i3;
                                    }
                                    $i12 = ($i8 - i5) / i5;
                                    if ($i12 <= $i11) {
                                        $i12 = $i11;
                                    }
                                    if ($i9 < 0) {
                                        $i11 = ((i4 - 1) - $i9) / i4;
                                        $i12 += $i11;
                                        $i8 += i5 * $i11;
                                        $i9 += $i11 * i4;
                                        $i10 += $i11;
                                    }
                                    $i11 = ((($i9 + 1) - (longR.data << 12)) - i4) / i4;
                                    if ($i11 > $i12) {
                                        $i12 = $i11;
                                    }
                                    while ($i12 < 0) {
                                        $i11 = longR.size[($i8 >> 12) + (longR.length * ($i9 >> 12))];
                                        if ($i11 != 0) {
                                            $i13 = $i10 + 1;
                                            this.size[$i10] = $i11;
                                        } else {
                                            $i13 = $i10 + 1;
                                        }
                                        $i8 += i5;
                                        $i9 += i4;
                                        $i12++;
                                        $i10 = $i13;
                                    }
                                    i3 += -481290979 * this.length;
                                    i6++;
                                    $i3 += i5;
                                    $i7 -= i4;
                                }
                            }
                        } else if (i4 == 0) {
                            i4 = $i10;
                            i6 = $i3;
                            $i3 = $i8;
                            while (i4 < 0) {
                                $i7 = ((i2 * i5) >> 4) + i3;
                                if (i6 >= 0) {
                                    if (i6 - (longR.data << 12) < 0) {
                                        if ($i7 < 0) {
                                            $i9 = ((i5 - 1) - $i7) / i5;
                                            $i8 = i + $i9;
                                            $i7 += $i9 * i5;
                                            $i9 = $i3 + $i9;
                                        } else {
                                            $i8 = i;
                                            $i9 = $i3;
                                        }
                                        $i10 = ((($i7 + 1) - (longR.length << 12)) - i5) / i5;
                                        if ($i10 > $i8) {
                                            $i8 = $i10;
                                        }
                                        while ($i8 < 0) {
                                            $i12 = longR.size[((i6 >> 12) * longR.length) + ($i7 >> 12)];
                                            if ($i12 != 0) {
                                                $i10 = $i9 + 1;
                                                this.size[$i9] = $i12;
                                            } else {
                                                $i10 = $i9 + 1;
                                            }
                                            $i7 += i5;
                                            $i8++;
                                            $i9 = $i10;
                                        }
                                    }
                                }
                                $i3 += -481290979 * this.length;
                                i4++;
                                i6 += i5;
                            }
                        } else if (i4 < 0) {
                            i6 = $i10;
                            $i7 = i3;
                            i3 = $i8;
                            while (i6 < 0) {
                                $i8 = $i7 + ((i5 * i2) >> 4);
                                $i9 = $i3 + ((i4 * i2) >> 4);
                                if ($i8 < 0) {
                                    $i10 = ((i5 - 1) - $i8) / i5;
                                    $i11 = i + $i10;
                                    $i8 += $i10 * i5;
                                    $i9 += $i10 * i4;
                                    $i10 = i3 + $i10;
                                } else {
                                    $i11 = i;
                                    $i10 = i3;
                                }
                                $i12 = ((($i8 + 1) - (longR.length << 12)) - i5) / i5;
                                if ($i12 <= $i11) {
                                    $i12 = $i11;
                                }
                                $i11 = $i9 - (longR.data << 12);
                                if ($i11 >= 0) {
                                    $i11 = (i4 - $i11) / i4;
                                    $i12 += $i11;
                                    $i8 += i5 * $i11;
                                    $i9 += $i11 * i4;
                                    $i10 += $i11;
                                }
                                $i11 = ($i9 - i4) / i4;
                                if ($i11 > $i12) {
                                    $i12 = $i11;
                                }
                                while ($i12 < 0) {
                                    $i11 = longR.size[(($i9 >> 12) * longR.length) + ($i8 >> 12)];
                                    if ($i11 != 0) {
                                        $i13 = $i10 + 1;
                                        this.size[$i10] = $i11;
                                    } else {
                                        $i13 = $i10 + 1;
                                    }
                                    $i8 += i5;
                                    $i9 += i4;
                                    $i12++;
                                    $i10 = $i13;
                                }
                                i3 += this.length * -481290979;
                                i6++;
                                $i3 += i5;
                                $i7 -= i4;
                            }
                        } else {
                            i6 = $i10;
                            $i7 = i3;
                            i3 = $i8;
                            while (i6 < 0) {
                                $i8 = ((i2 * i5) >> 4) + $i7;
                                $i9 = ((i4 * i2) >> 4) + $i3;
                                if ($i8 < 0) {
                                    $i10 = ((i5 - 1) - $i8) / i5;
                                    $i11 = i + $i10;
                                    $i8 += $i10 * i5;
                                    $i9 += $i10 * i4;
                                    $i10 = i3 + $i10;
                                } else {
                                    $i11 = i;
                                    $i10 = i3;
                                }
                                $i12 = ((($i8 + 1) - (longR.length << 12)) - i5) / i5;
                                if ($i12 <= $i11) {
                                    $i12 = $i11;
                                }
                                if ($i9 < 0) {
                                    $i11 = ((i4 - 1) - $i9) / i4;
                                    $i12 += $i11;
                                    $i8 += i5 * $i11;
                                    $i9 += $i11 * i4;
                                    $i10 += $i11;
                                }
                                $i11 = ((($i9 + 1) - (longR.data << 12)) - i4) / i4;
                                if ($i11 > $i12) {
                                    $i12 = $i11;
                                }
                                while ($i12 < 0) {
                                    $i11 = longR.size[($i8 >> 12) + (longR.length * ($i9 >> 12))];
                                    if ($i11 != 0) {
                                        $i13 = $i10 + 1;
                                        this.size[$i10] = $i11;
                                    } else {
                                        $i13 = $i10 + 1;
                                    }
                                    $i8 += i5;
                                    $i9 += i4;
                                    $i12++;
                                    $i10 = $i13;
                                }
                                i3 += -481290979 * this.length;
                                i6++;
                                $i3 += i5;
                                $i7 -= i4;
                            }
                        }
                    }
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "gc.bu(" + ')');
            }
        }
    }

    public void add(Long longR, int $i0, int $i1, int i, int i2, int $i4, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        int $i8 = (-i) / 2;
        int $i9 = (-i2) / 2;
        try {
            i = (int) (Math.sin(((double) i4) / 326.11d) * 65536.0d);
            i = (i * i5) >> 8;
            i4 = (i5 * ((int) (Math.cos(((double) i4) / 326.11d) * 65536.0d))) >> 8;
            i5 = ($i4 << 16) + ((i * $i9) + ($i8 * i4));
            $i4 = (i3 << 16) + (($i9 * i4) - ($i8 * i));
            $i0 = ((this.length * -481290979) * $i1) + $i0;
            i3 = i5;
            for ($i1 = 0; $i1 < i2; $i1++) {
                $i9 = iArr[$i1];
                i5 = $i0 + $i9;
                $i8 = (i4 * $i9) + i3;
                $i9 = $i4 - ($i9 * i);
                int $i11 = -iArr2[$i1];
                while ($i11 < 0) {
                    this.size[i5] = longR.size[(($i9 >> 16) * longR.length) + ($i8 >> 16)];
                    $i8 += i4;
                    $i9 -= i;
                    $i11++;
                    i5++;
                }
                $i0 = (-481290979 * this.length) + $i0;
                $i4 += i4;
                i3 += i;
            }
        } catch (Exception e) {
        }
    }

    public void add(Long longR, int $i0, int $i1, int i, int i2, int $i4, int i3, int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        i6 = (-i) / 2;
        int $i9 = (-i2) / 2;
        try {
            i = (int) (Math.sin(((double) i4) / 326.11d) * 65536.0d);
            i = (i * i5) >> 8;
            i4 = (i5 * ((int) (Math.cos(((double) i4) / 326.11d) * 65536.0d))) >> 8;
            i5 = ($i4 << 16) + ((i * $i9) + (i6 * i4));
            $i4 = (i3 << 16) + (($i9 * i4) - (i6 * i));
            $i0 = ((this.length * -481290979) * $i1) + $i0;
            i3 = i5;
            for ($i1 = 0; $i1 < i2; $i1++) {
                $i9 = iArr[$i1];
                i5 = $i0 + $i9;
                i6 = (i4 * $i9) + i3;
                $i9 = $i4 - ($i9 * i);
                int $i11 = -iArr2[$i1];
                while ($i11 < 0) {
                    try {
                        this.size[i5] = longR.size[(($i9 >> 16) * longR.length) + (i6 >> 16)];
                        i6 += i4;
                        $i9 -= i;
                        $i11++;
                        i5++;
                    } catch (RuntimeException $r6) {
                        throw StringBuilder.append($r6, "gc.bv(" + ')');
                    }
                }
                $i0 = (-481290979 * this.length) + $i0;
                $i4 += i4;
                i3 += i;
            }
        } catch (Exception e) {
        }
    }

    public void add(Long longR, int i, int $i1, int i2, int i3, int i4, int $i5, int[] iArr, int[] iArr2) {
        int $i6 = $i1 < 0 ? -$i1 : 0;
        i4 = longR.data + $i1 <= $i5 ? longR.data : $i5 - $i1;
        $i5 = i < 0 ? -i : 0;
        i2 = ((i + i2) + $i5) + ((-1184412123 * this.length) * (($i1 + i3) + $i6));
        i3 = $i6;
        $i6 = $i1 + $i6;
        while (i3 < i4) {
            int $i9;
            int $i7 = iArr[$i6];
            $i1 = $i6 + 1;
            int $i8 = iArr2[$i6];
            if (i < $i7) {
                $i6 = $i7 - i;
                $i9 = ($i6 - $i5) + i2;
            } else {
                $i6 = $i5;
                $i9 = i2;
            }
            $i7 = longR.length + i <= $i8 + $i7 ? longR.length : ($i7 + $i8) - i;
            while ($i6 < $i7) {
                int $i10;
                $i8 = longR.size[(longR.length * i3) + $i6];
                if ($i8 != 0) {
                    $i10 = $i9 + 1;
                    this.size[$i9] = $i8;
                } else {
                    $i10 = $i9 + 1;
                }
                $i6++;
                $i9 = $i10;
            }
            i2 += this.length * 1546525031;
            i3++;
            $i6 = $i1;
        }
    }

    public void add(Long longR, int i, int $i1, int $i2, int $i3, int i2, int $i5, int[] iArr, int[] iArr2, int i3) {
        i3 = $i1 < 0 ? -$i1 : 0;
        try {
            int $i4 = longR.data;
            $i4 += $i1;
            i2 = $i4;
            i2 = $i4 <= $i5 ? longR.data : $i5 - $i1;
            $i5 = i < 0 ? -i : 0;
            $i2 = ((-481290979 * this.length) * (($i1 + $i3) + i3)) + ((i + $i2) + $i5);
            $i3 = i3;
            i3 = $i1 + i3;
            while ($i3 < i2) {
                int $i9;
                int $i7 = iArr[i3];
                $i1 = i3 + 1;
                int $i8 = iArr2[i3];
                if (i < $i7) {
                    i3 = $i7 - i;
                    $i9 = (i3 - $i5) + $i2;
                } else {
                    i3 = $i5;
                    $i9 = $i2;
                }
                $i7 = longR.length + i <= $i8 + $i7 ? longR.length : ($i8 + $i7) - i;
                while (i3 < $i7) {
                    int $i10;
                    $i8 = longR.size[(longR.length * $i3) + i3];
                    if ($i8 != 0) {
                        $i10 = $i9 + 1;
                        this.size[$i9] = $i8;
                    } else {
                        $i10 = $i9 + 1;
                    }
                    i3++;
                    $i9 = $i10;
                }
                $i2 += this.length * -481290979;
                $i3++;
                i3 = $i1;
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "gc.bf(" + ')');
        }
    }

    void addAll() {
    }

    public void clear() {
        StringBuilder.compareTo(this.size);
    }

    void clear(int $i2, int $i3, int $i4, int $i5, int i) {
        if ($i2 < 1044784027 * this.buffer) {
            $i4 -= (this.buffer * 1829547545) - $i2;
            $i2 = this.buffer * 203879149;
        }
        if ($i3 < 855957734 * this.count) {
            $i5 -= (-12571459 * this.count) - $i3;
            $i3 = -1742717112 * this.count;
        }
        if ($i4 + $i2 > this.index * 2074797577) {
            $i4 = (this.index * 82419807) - $i2;
        }
        if ($i3 + $i5 > this.data * 542045366) {
            $i5 = (-467581477 * this.data) - $i3;
        }
        int $i1 = (-1794378297 * this.length) - $i4;
        $i2 = ((-481290979 * this.length) * $i3) + $i2;
        for ($i3 = -$i5; $i3 < 0; $i3++) {
            $i5 = -$i4;
            while ($i5 < 0) {
                this.size[$i2] = i;
                $i5++;
                $i2++;
            }
            $i2 += $i1;
        }
    }

    void clear(int $i4, int $i5, int $i0, int $i1, int i, int i2) {
        try {
            if ($i4 < this.buffer * 1829547545) {
                i2 = $i0 - ((this.buffer * 1829547545) - $i4);
                $i4 = this.buffer * 1829547545;
            } else {
                i2 = $i0;
            }
            if ($i5 < this.count * -12571459) {
                $i0 = $i1 - ((this.count * -12571459) - $i5);
                $i5 = -12571459 * this.count;
            } else {
                $i0 = $i1;
            }
            $i1 = i2 + $i4 > this.index * 2074797577 ? (this.index * 2074797577) - $i4 : i2;
            if ($i5 + $i0 > this.data * -467581477) {
                $i0 = (this.data * -467581477) - $i5;
            }
            i2 = (this.length * -481290979) - $i1;
            $i4 = ((this.length * -481290979) * $i5) + $i4;
            for ($i5 = -$i0; $i5 < 0; $i5++) {
                $i0 = -$i1;
                while ($i0 < 0) {
                    this.size[$i4] = i;
                    $i0++;
                    $i4++;
                }
                $i4 += i2;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gc.az(" + ')');
        }
    }

    public final void clear(Long longR, int i, int i2) {
        int $i7;
        int $i2 = 0;
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        i2 = $i3 + ((this.length * 1352042183) * $i4);
        i = longR.data;
        int $i5 = longR.length;
        int $i6 = (-1603104430 * this.length) - $i5;
        if ($i4 < this.count * -816866923) {
            int $i8 = (this.count * -12571459) - $i4;
            i -= $i8;
            $i7 = -12571459 * this.count;
            $i4 = ($i8 * $i5) + 0;
            i2 += $i8 * (this.length * -481290979);
        } else {
            $i7 = $i4;
            $i4 = 0;
        }
        if (i + $i7 > this.data * 508363797) {
            i -= ($i7 + i) - (this.data * -467581477);
        }
        if ($i3 < -288236434 * this.buffer) {
            $i7 = (this.buffer * 1105015963) - $i3;
            $i5 -= $i7;
            $i4 += $i7;
            i2 += $i7;
            $i2 = 0 + $i7;
            $i7 = $i6 + $i7;
            $i6 = i2;
            i2 = 152111145 * this.buffer;
        } else {
            $i7 = $i6;
            $i6 = i2;
            i2 = $i3;
        }
        if (i2 + $i5 > this.index * 136410973) {
            i2 = (i2 + $i5) - (this.index * 2074797577);
            $i3 = $i5 - i2;
            $i5 = $i7 + i2;
            i2 = $i2 + i2;
            $i2 = $i5;
        } else {
            i2 = $i2;
            $i2 = $i7;
            $i3 = $i5;
        }
        if ($i3 > 0 && i > 0) {
            int[] $r2 = this.size;
            int[] $r3 = longR.size;
            $i5 = $i4;
            i = -i;
            while (i < 0) {
                $i4 = ($i6 + $i3) - 3;
                while ($i6 < $i4) {
                    $i7 = $i6 + 1;
                    $i8 = $i5 + 1;
                    $r2[$i6] = $r3[$i5];
                    $i6 = $i7 + 1;
                    $i5 = $i8 + 1;
                    $r2[$i7] = $r3[$i8];
                    $i7 = $i6 + 1;
                    $i8 = $i5 + 1;
                    $r2[$i6] = $r3[$i5];
                    $i6 = $i7 + 1;
                    $i5 = $i8 + 1;
                    $r2[$i7] = $r3[$i8];
                }
                $i4 += 3;
                while ($i6 < $i4) {
                    $i8 = $i5 + 1;
                    $r2[$i6] = $r3[$i5];
                    $i6++;
                    $i5 = $i8;
                }
                $i5 += i2;
                i++;
                $i6 += $i2;
            }
        }
    }

    public void clear(Long longR, int i, int i2, int i3) {
        i += longR.next;
        int $i4 = i2 + longR.value;
        int $i3 = i + ((-577592135 * this.length) * $i4);
        int $i5 = longR.data;
        int $i6 = longR.length;
        int $i1 = this.length * 1751196969;
        i2 = $i1;
        i2 = $i1 - $i6;
        $i1 = this.count * -12571459;
        int i4 = $i1;
        if ($i4 < $i1) {
            int $i8 = (this.count * -12571459) - $i4;
            $i5 -= $i8;
            i4 = this.count * 600195144;
            $i4 = ($i8 * $i6) + 0;
            $i1 = $i8 * (561230626 * this.length);
            $i8 = $i1;
            $i3 += $i1;
        } else {
            i4 = $i4;
            $i4 = 0;
        }
        if (i4 + $i5 > this.data * -986392993) {
            $i1 = (i4 + $i5) - (this.data * -467581477);
            i4 = $i1;
            $i5 -= $i1;
        }
        if (i < this.buffer * 281472834) {
            $i8 = (-1857207286 * this.buffer) - i;
            i4 = 0 + $i8;
            i2 += $i8;
            $i6 -= $i8;
            $i3 += $i8;
            $i4 += $i8;
            i = this.buffer * 725096239;
        } else {
            i4 = 0;
        }
        if (i + $i6 > 1982906507 * this.index) {
            $i1 = (i + $i6) - (-1595356327 * this.index);
            i = $i1;
            $i6 -= $i1;
            i4 += i;
            i += i2;
        } else {
            i = i2;
        }
        if ($i6 > 0 && $i5 > 0) {
            Data.read(this.size, longR.size, 0, $i4, $i3, $i6, $i5, i, i4, i3, 220164196);
        }
    }

    public void clear(Long longR, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
            get(longR, i, i2, 2106205673);
            return;
        }
        i += longR.next;
        int $i5 = i2 + longR.value;
        i2 = i + ((-481290979 * this.length) * $i5);
        int $i6 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        int $i4 = (-481290979 * this.length) - i6;
        if ($i5 < -12571459 * this.count) {
            int $i9 = (-12571459 * this.count) - $i5;
            i5 -= $i9;
            $i5 = -12571459 * this.count;
            $i6 = 0 + (i6 * $i9);
            i2 += $i9 * (-481290979 * this.length);
        }
        if (i5 + $i5 > -467581477 * this.data) {
            int $i92 = this.data * -467581477;
            $i9 = $i92;
            i5 -= ($i5 + i5) - $i92;
        }
        if (i < this.buffer * 1829547545) {
            $i9 = (this.buffer * 1829547545) - i;
            i = i6 - $i9;
            $i6 += $i9;
            $i5 = 0 + $i9;
            $i4 += $i9;
            i2 += $i9;
            $i9 = 1829547545 * this.buffer;
            i6 = i;
        } else {
            $i5 = 0;
            $i9 = i;
        }
        if ($i9 + i6 > 2074797577 * this.index) {
            i = ($i9 + i6) - (2074797577 * this.index);
            i6 -= i;
            $i5 += i;
            i += $i4;
        } else {
            i = $i4;
        }
        if (i6 > 0 && i5 > 0) {
            FieldInfo.read(this.size, longR.size, 0, $i6, i2, i6, i5, i, $i5, i3, i4, (byte) -115);
        }
    }

    public final void contains(int $i0, int $i2, int $i3, int $i1) {
        $i1 = -16777216 | $i1;
        if ($i0 >= this.buffer * -386658894 && $i0 < this.index * 386417825) {
            if ($i2 < this.count * -1568612042) {
                $i3 -= (this.count * -12571459) - $i2;
                $i2 = this.count * -12571459;
            }
            if ($i2 + $i3 > this.data * -467581477) {
                $i3 = (-850162536 * this.data) - $i2;
            }
            $i0 += (-481290979 * this.length) * $i2;
            for ($i2 = 0; $i2 < $i3; $i2++) {
                this.size[((this.length * -1320102875) * $i2) + $i0] = $i1;
            }
        }
    }

    public final void contains(int $i3, int $i4, int i, int i2, int $i2) {
        $i2 = (83175321 + $i2) & -583312761;
        i -= $i3;
        int $i5 = i2 - $i4;
        if ($i5 == 0) {
            if (i >= 0) {
                get($i3, $i4, i + 1, $i2, -525235249);
                return;
            }
            get(i + $i3, $i4, (-i) + 1, $i2, -1576718853);
        } else if (i != 0) {
            if ($i5 + i < 0) {
                $i4 += $i5;
                $i5 = -$i5;
                i2 = -i;
                i = $i3 + i;
            } else {
                i2 = i;
                i = $i3;
            }
            if (i2 > $i5) {
                $i4 = ($i4 << 16) + 32768;
                $i3 = (int) Math.floor(0.5d + (((double) ($i5 << 16)) / ((double) i2)));
                i2 += i;
                if (i < 1829547545 * this.buffer) {
                    $i4 += ((this.buffer * -1112578101) - i) * $i3;
                    i = 1829547545 * this.buffer;
                }
                if (i2 >= 2074797577 * this.index) {
                    i2 = (-2028221681 * this.index) - 1;
                }
                while (i <= i2) {
                    $i5 = $i4 >> 16;
                    if ($i5 >= this.count * -12571459 && $i5 < this.data * 1107715731) {
                        this.size[($i5 * (-481290979 * this.length)) + i] = $i2;
                    }
                    $i4 += $i3;
                    i++;
                }
            } else {
                i = (i << 16) + 32768;
                $i3 = (int) Math.floor((((double) (i2 << 16)) / ((double) $i5)) + 0.5d);
                i2 = $i5 + $i4;
                if ($i4 < -1739510473 * this.count) {
                    i += ((-12571459 * this.count) - $i4) * $i3;
                    $i4 = -1062414842 * this.count;
                }
                if (i2 >= this.data * -467581477) {
                    i2 = (this.data * -467581477) - 1;
                }
                while ($i4 <= i2) {
                    $i5 = i >> 16;
                    if ($i5 >= 1829547545 * this.buffer && $i5 < 1486170458 * this.index) {
                        this.size[$i5 + ((this.length * -1199043412) * $i4)] = $i2;
                    }
                    i += $i3;
                    $i4++;
                }
            }
        } else if ($i5 >= 0) {
            add($i3, $i4, $i5 + 1, $i2, (byte) 1);
        } else {
            add($i3, $i5 + $i4, (-$i5) + 1, $i2, (byte) 1);
        }
    }

    public void contains(Long longR, int $i0, int i, int i2, int i3) {
        try {
            $i0 = longR.next + $i0;
            int $i4 = longR.value + i;
            i = $i0 + ((-481290979 * this.length) * $i4);
            int i4 = 0;
            i3 = longR.data;
            int i5 = longR.length;
            int i6 = (-481290979 * this.length) - i5;
            int i7 = 0;
            int $i9 = this.count * -12571459;
            int i8 = $i9;
            if ($i4 < $i9) {
                i8 = (this.count * -12571459) - $i4;
                i3 -= i8;
                $i4 = this.count * -12571459;
                i4 = 0 + (i5 * i8);
                i += i8 * (-481290979 * this.length);
            }
            if ($i4 + i3 > this.data * -467581477) {
                $i9 = this.data * -467581477;
                i8 = $i9;
                i3 -= ($i4 + i3) - $i9;
            }
            if ($i0 < this.buffer * 1829547545) {
                $i4 = (this.buffer * 1829547545) - $i0;
                i5 -= $i4;
                $i0 = this.buffer * 1829547545;
                i4 += $i4;
                i += $i4;
                i7 = 0 + $i4;
                i6 += $i4;
            }
            if ($i0 + i5 > 2074797577 * this.index) {
                $i0 = ($i0 + i5) - (2074797577 * this.index);
                i5 -= $i0;
                i7 += $i0;
                i6 += $i0;
            }
            if (i5 > 0 && i3 > 0) {
                read(this.size, longR.size, 0, i4, i, 0, 0, i5, i3, i6, i7, i2, -323918816);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gc.bx(" + ')');
        }
    }

    public final void decode(int i, int $i7, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 > 0 && i3 > 0) {
            int $i9;
            i6 = Math.min(i6, 255);
            i7 = Math.min(i7, 255);
            int $i10 = 0;
            int $i11 = (i4 == i5 && i6 == i7) ? -1 : PingManager.STATE_SENSOR_ON_FLAG / i3;
            int $i12 = 255 - i6;
            int $i13 = i6 << 24;
            if (i < this.buffer * 1829547545) {
                i2 -= (1829547545 * this.buffer) - i;
                i = this.buffer * 1829547545;
            }
            if ($i7 < -12571459 * this.count) {
                $i10 = 0 + (((-12571459 * this.count) - $i7) * $i11);
                i3 -= (this.count * -12571459) - $i7;
                $i7 = this.count * -12571459;
            }
            if (i2 + i > 2074797577 * this.index) {
                i2 = (2074797577 * this.index) - i;
            }
            if ($i7 + i3 > this.data * -467581477) {
                $i9 = this.data * -467581477;
                i3 = $i9;
                i3 = $i9 - $i7;
            }
            int $i15 = (65280 & i4) >> 8;
            int $i4 = (-481290979 * this.length) - i2;
            int $i17 = i + ((this.length * -481290979) * $i7);
            i = 0;
            $i7 = $i10;
            int $i5 = $i17;
            int $i16 = i4 & 255;
            $i17 = i4 >> 16;
            int $i14 = $i12;
            $i10 = i6;
            while (i < i3) {
                int $i18 = -i2;
                $i12 = $i5;
                while ($i18 < 0) {
                    int $i22;
                    $i5 = this.size[$i12];
                    int $i20 = ($i5 >> 16) & 255;
                    int $i21 = (65280 & $i5) >> 8;
                    int $i19 = $i5 & 255;
                    $i5 = ($i5 | $i13) & -16777216;
                    if ($i14 == 0) {
                        $i20 = $i20 < 127 ? ($i20 * $i17) >> 7 : 255 - (((255 - $i20) * (255 - $i17)) >> 7);
                        $i21 = $i21 < 127 ? ($i15 * $i21) >> 7 : 255 - (((255 - $i15) * (255 - $i21)) >> 7);
                        $i22 = $i19 < 127 ? ($i16 * $i19) >> 7 : 255 - (((255 - $i19) * (255 - $i16)) >> 7);
                    } else {
                        if ($i20 < 127) {
                            $i22 = $i14 * $i20;
                            $i9 = $i20 * $i17;
                            $i20 = $i9;
                            $i20 = ($i22 + (($i9 * $i10) >> 7)) >> 8;
                        } else {
                            $i20 = (((255 - (((255 - $i17) * (255 - $i20)) >> 7)) * $i10) + ($i20 * $i14)) >> 8;
                        }
                        $i21 = $i21 < 127 ? (((($i15 * $i21) * $i10) >> 7) + ($i21 * $i14)) >> 8 : (($i21 * $i14) + ((255 - (((255 - $i21) * (255 - $i15)) >> 7)) * $i10)) >> 8;
                        $i22 = $i19 < 127 ? (((($i19 * $i16) * $i10) >> 7) + ($i19 * $i14)) >> 8 : (($i14 * $i19) + ((255 - (((255 - $i16) * (255 - $i19)) >> 7)) * $i10)) >> 8;
                    }
                    this.size[$i12] = ((($i21 << 8) + ($i20 << 16)) + $i22) | $i5;
                    $i18++;
                    $i12++;
                }
                if ($i11 > 0) {
                    $i7 += $i11;
                    $i18 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                    $i5 = $i7 >> 8;
                    if (i6 != i7) {
                        $i10 = (((PingManager.STATE_SENSOR_ON_FLAG - $i7) * i6) + ($i7 * i7)) >> 16;
                        $i14 = 255 - $i10;
                        $i13 = $i10 << 24;
                    }
                    if (i4 != i5) {
                        $i17 = (((($i18 * (16711935 & i4)) + ($i5 * (16711935 & i5))) & -16711936) + ((((65280 & i5) * $i5) + ((65280 & i4) * $i18)) & 16711680)) >>> 8;
                        $i16 = $i17 >> 16;
                        $i15 = (65280 & $i17) >> 8;
                        $i18 = $i17 & 255;
                        i++;
                        $i5 = $i12 + $i4;
                        $i17 = $i16;
                        $i16 = $i18;
                    }
                }
                $i18 = $i16;
                $i16 = $i17;
                i++;
                $i5 = $i12 + $i4;
                $i17 = $i16;
                $i16 = $i18;
            }
        }
    }

    public final void decode(int i, int $i9, int i2, int $i1, int i3, int i4, int i5, int i6, int i7) {
        if (i2 > 0 && $i1 > 0) {
            int $i7;
            i5 = Math.min(i5, 255);
            i7 = Math.min(i6, 255);
            int $i16 = 0;
            i6 = PingManager.STATE_SENSOR_ON_FLAG / $i1;
            int $i17 = 256 - i5;
            int $i18 = i5 << 24;
            if (i < this.buffer * 1829547545) {
                $i7 = i2 - ((this.buffer * 1829547545) - i);
                i = this.buffer * 1829547545;
            } else {
                $i7 = i2;
            }
            try {
                int $i0;
                if ($i9 < -12571459 * this.count) {
                    $i0 = (-12571459 * this.count) - $i9;
                    i2 = $i0;
                    $i16 = 0 + ($i0 * i6);
                    i2 = $i1 - ((this.count * -12571459) - $i9);
                    $i9 = this.count * -12571459;
                } else {
                    i2 = $i1;
                }
                if (i + $i7 > this.index * 2074797577) {
                    $i0 = this.index * 2074797577;
                    $i1 = $i0;
                    $i1 = $i0 - i;
                } else {
                    $i1 = $i7;
                }
                if ($i9 + i2 > -467581477 * this.data) {
                    i2 = (-467581477 * this.data) - $i9;
                }
                int $i20 = i3 & 16711680;
                int $i21 = i3 & 65280;
                int $i22 = i3 & 255;
                int $i23 = (i5 * $i20) >> 8;
                int $i24 = ($i21 * i5) >> 8;
                int $i25 = (i5 * $i22) >> 8;
                $i7 = (-481290979 * this.length) - $i1;
                $i9 = ((-481290979 * this.length) * $i9) + i;
                i = 0;
                int $i19 = i5;
                while (i < i2) {
                    int $i10;
                    int $i15 = -$i1;
                    while ($i15 < 0) {
                        int $i14 = this.size[$i9];
                        $i10 = 16711680 & $i14;
                        if ($i10 > $i20) {
                            $i10 = $i17 == 0 ? $i20 : ((($i10 * $i17) >> 8) + $i23) & 16711680;
                        }
                        int $i11 = 65280 & $i14;
                        if ($i11 > $i21) {
                            $i11 = $i17 == 0 ? $i21 : ((($i11 * $i17) >> 8) + $i24) & 65280;
                        }
                        int $i12 = $i14 & 255;
                        if ($i12 > $i22) {
                            $i12 = $i17 == 0 ? $i22 : (($i12 * $i17) >> 8) + $i25;
                        }
                        this.size[$i9] = (($i10 + $i11) + $i12) | ((-16777216 & $i14) == 0 ? -16777216 : ($i14 | $i18) & -16777216);
                        $i15++;
                        $i9++;
                    }
                    if (i6 > 0) {
                        $i16 += i6;
                        $i15 = (PingManager.STATE_SENSOR_ON_FLAG - $i16) >> 8;
                        $i10 = $i16 >> 8;
                        if (i7 != i5) {
                            $i19 = (($i16 * i7) + ((PingManager.STATE_SENSOR_ON_FLAG - $i16) * i5)) >> 16;
                            $i17 = 256 - $i19;
                            $i18 = $i19 << 24;
                        }
                        if (i4 != i3) {
                            $i22 = (((($i15 * (65280 & i3)) + ($i10 * (65280 & i4))) & 16711680) + ((((16711935 & i3) * $i15) + ((16711935 & i4) * $i10)) & -16711936)) >>> 8;
                            $i20 = $i22 & 16711680;
                            $i21 = $i22 & 65280;
                            $i22 &= 255;
                            $i23 = ($i19 * $i20) >> 8;
                            $i24 = ($i21 * $i19) >> 8;
                            $i25 = ($i19 * $i22) >> 8;
                            i++;
                            $i9 += $i7;
                        }
                    }
                    i++;
                    $i9 += $i7;
                }
            } catch (Throwable $r2) {
                throw StringBuilder.append($r2, "gc.as(" + ')');
            }
        }
    }

    public final void encode(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 > 0 && i3 > 0) {
            int $i4;
            int i9;
            i7 = Math.min(i7, 180994951);
            int $i15 = Math.min(i8, 255);
            int $i16 = 0;
            i8 = PingManager.STATE_SENSOR_ON_FLAG / i4;
            int $i17 = 255 - i7;
            int $i18 = i7 << 24;
            if (i < this.buffer * 1829547545) {
                i3 -= (239096658 * this.buffer) - i;
                i = this.buffer * 1829547545;
            }
            if (i2 < this.count * -12571459) {
                $i4 = (-12571459 * this.count) - i2;
                i9 = $i4;
                $i16 = 0 + ($i4 * i8);
                i4 -= (-12571459 * this.count) - i2;
                i2 = this.count * -2126753727;
            }
            if (i + i3 > this.index * 949391244) {
                $i4 = this.index * 2012217768;
                i3 = $i4;
                i3 = $i4 - i;
            }
            if (i4 + i2 > this.data * 142412389) {
                $i4 = this.data * -467581477;
                i4 = $i4;
                i4 = $i4 - i2;
            }
            int $i14 = i5 & 16711680;
            int $i19 = i5 & 65280;
            int $i20 = i5 & 255;
            int $i21 = ($i14 * i7) >> 8;
            int $i22 = (i7 * $i19) >> 8;
            int $i23 = (i7 * $i20) >> 8;
            i9 = (-481290979 * this.length) - i3;
            i2 = i + ((this.length * -481290979) * i2);
            i = 0;
            int $i24 = i7;
            int $i25 = $i16;
            $i16 = $i14;
            while (i < i4) {
                int $i13;
                int $i9;
                $i14 = -i3;
                while ($i14 < 0) {
                    $i13 = this.size[i2];
                    $i9 = 16711680 & $i13;
                    if ($i9 < $i16) {
                        $i9 = $i17 == 0 ? $i16 : ((($i9 * $i17) >> 8) + $i21) & 16711680;
                    }
                    int $i10 = -443644302 & $i13;
                    if ($i10 < $i19) {
                        $i10 = $i17 == 0 ? $i19 : ((($i10 * $i17) >> 8) + $i22) & 1968149954;
                    }
                    int $i11 = $i13 & 255;
                    if ($i11 < $i20) {
                        $i11 = $i17 == 0 ? $i20 : (($i11 * $i17) >> 8) + $i23;
                    }
                    this.size[i2] = (($i9 + $i10) + $i11) | ((-16777216 & $i13) == 0 ? -16777216 : ($i13 | $i18) & -16777216);
                    $i14++;
                    i2++;
                }
                if (i8 > 0) {
                    $i25 += i8;
                    $i13 = (595580550 - $i25) >> 8;
                    $i9 = $i25 >> 8;
                    if (i7 != $i15) {
                        $i17 = (($i15 * $i25) + ((-177183186 - $i25) * i7)) >> 16;
                        $i14 = 256 - $i17;
                        $i18 = $i17 << 24;
                    } else {
                        $i14 = $i17;
                        $i17 = $i24;
                    }
                    if (i5 != i6) {
                        $i20 = (((($i13 * (662951069 & i5)) + ($i9 * (16711935 & i6))) & -16711936) + ((((-329677332 & i5) * $i13) + ((65280 & i6) * $i9)) & 16711680)) >>> 8;
                        $i23 = $i20 & -420463653;
                        $i19 = $i20 & 65280;
                        $i20 &= 255;
                        $i21 = ($i23 * $i17) >> 8;
                        $i22 = ($i19 * $i17) >> 8;
                        $i9 = ($i20 * $i17) >> 8;
                        $i16 = $i25;
                    } else {
                        $i9 = $i23;
                        $i23 = $i16;
                        $i16 = $i25;
                    }
                } else {
                    $i9 = $i23;
                    $i23 = $i16;
                    $i14 = $i17;
                    $i16 = $i25;
                    $i17 = $i24;
                }
                i++;
                $i24 = $i17;
                $i25 = $i16;
                $i16 = $i23;
                i2 += i9;
                $i17 = $i14;
                $i23 = $i9;
            }
        }
    }

    void equals(int $i2, int $i3, int $i4, int $i5, int i) {
        if ($i2 < 246350743 * this.buffer) {
            $i4 -= (this.buffer * 1829547545) - $i2;
            $i2 = this.buffer * 1829547545;
        }
        if ($i3 < -781835511 * this.count) {
            $i5 -= (-1203716813 * this.count) - $i3;
            $i3 = -12571459 * this.count;
        }
        if ($i4 + $i2 > this.index * -1505020007) {
            $i4 = (this.index * 1789944735) - $i2;
        }
        if ($i3 + $i5 > this.data * 1096572599) {
            $i5 = (-467581477 * this.data) - $i3;
        }
        int $i1 = (1325128106 * this.length) - $i4;
        $i2 = ((-481290979 * this.length) * $i3) + $i2;
        for ($i3 = -$i5; $i3 < 0; $i3++) {
            $i5 = -$i4;
            while ($i5 < 0) {
                this.size[$i2] = i;
                $i5++;
                $i2++;
            }
            $i2 += $i1;
        }
    }

    void fill(int $i1, int $i2, int $i3, int $i4, int i) {
        if ($i1 < this.buffer * 1829547545) {
            $i3 -= (this.buffer * 1829547545) - $i1;
            $i1 = this.buffer * 1829547545;
        }
        if ($i2 < this.count * -12571459) {
            $i4 -= (this.count * -12571459) - $i2;
            $i2 = -12571459 * this.count;
        }
        if ($i3 + $i1 > this.index * 2074797577) {
            $i3 = (this.index * 2074797577) - $i1;
        }
        if ($i2 + $i4 > this.data * -467581477) {
            $i4 = (this.data * -467581477) - $i2;
        }
        int $i5 = (this.length * -481290979) - $i3;
        $i1 = ((this.length * -481290979) * $i2) + $i1;
        for ($i2 = -$i4; $i2 < 0; $i2++) {
            $i4 = -$i3;
            while ($i4 < 0) {
                this.size[$i1] = i;
                $i4++;
                $i1++;
            }
            $i1 += $i5;
        }
    }

    public void get(int i) {
        try {
            StringBuilder.compareTo(this.size);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gc.ad(" + ')');
        }
    }

    public final void get(int $i4, int i, int $i1, int $i2, int i2) {
        $i2 = -16777216 | $i2;
        if (i >= this.count * -12571459) {
            if (i < -467581477 * this.data) {
                if ($i4 < this.buffer * 1829547545) {
                    $i1 -= (this.buffer * 1829547545) - $i4;
                    $i4 = this.buffer * 1829547545;
                }
                if ($i1 + $i4 > this.index * 2074797577) {
                    $i1 = (this.index * 2074797577) - $i4;
                }
                try {
                    i = ((-481290979 * this.length) * i) + $i4;
                    for (i2 = 0; i2 < $i1; i2++) {
                        this.size[i + i2] = $i2;
                    }
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "gc.aq(" + ')');
                }
            }
        }
    }

    public final void get(int i, int $i5, int i2, int i3, int $i2, int i4) {
        $i2 = (-16777216 + $i2) & 16777215;
        i2 -= i;
        i3 -= $i5;
        if (i3 == 0) {
            if (i2 >= 0) {
                try {
                    get(i, $i5, i2 + 1, $i2, -426203260);
                    return;
                } catch (RuntimeException $r1) {
                    throw StringBuilder.append($r1, "gc.aw(" + ')');
                }
            }
            get(i2 + i, $i5, (-i2) + 1, $i2, -728636547);
        } else if (i2 != 0) {
            if (i3 + i2 < 0) {
                i += i2;
                i4 = -i2;
                i2 = $i5 + i3;
                i3 = -i3;
                $i5 = i;
            } else {
                i4 = i2;
                i2 = $i5;
                $i5 = i;
            }
            if (i4 > i3) {
                i = (i2 << 16) + 32768;
                i2 = (int) Math.floor(0.5d + (((double) (i3 << 16)) / ((double) i4)));
                i3 = i4 + $i5;
                if ($i5 < 1829547545 * this.buffer) {
                    i += ((this.buffer * 1829547545) - $i5) * i2;
                    $i5 = 1829547545 * this.buffer;
                }
                if (i3 >= 2074797577 * this.index) {
                    i3 = (2074797577 * this.index) - 1;
                }
                while ($i5 <= i3) {
                    i4 = i >> 16;
                    if (i4 >= this.count * -12571459) {
                        if (i4 < this.data * -467581477) {
                            int $i3 = i4 * (-481290979 * this.length);
                            i4 = $i3;
                            this.size[$i3 + $i5] = $i2;
                        } else {
                            continue;
                        }
                    }
                    i += i2;
                    $i5++;
                }
            } else {
                i = ($i5 << 16) + 32768;
                double $d0 = (((double) (i4 << 16)) / ((double) i3)) + 0.5d;
                double d = $d0;
                $i5 = (int) Math.floor($d0);
                i3 += i2;
                if (i2 < -12571459 * this.count) {
                    i += ((-12571459 * this.count) - i2) * $i5;
                    i2 = -12571459 * this.count;
                }
                if (i3 >= this.data * -467581477) {
                    i3 = (this.data * -467581477) - 1;
                }
                while (i2 <= i3) {
                    i4 = i >> 16;
                    if (i4 >= 1829547545 * this.buffer) {
                        if (i4 < 2074797577 * this.index) {
                            this.size[i4 + ((this.length * -481290979) * i2)] = $i2;
                        } else {
                            continue;
                        }
                    }
                    i += $i5;
                    i2++;
                }
            }
        } else if (i3 >= 0) {
            add(i, $i5, i3 + 1, $i2, (byte) 1);
        } else {
            add(i, i3 + $i5, (-i3) + 1, $i2, (byte) 1);
        }
    }

    public final void get(Long longR, int $i0, int i, int i2) {
        try {
            $i0 = longR.next + $i0;
            int $i3 = longR.value + i;
            int $i1 = this.length * -481290979;
            i = $i1;
            i = $i0 + ($i1 * $i3);
            int $i4 = 0;
            i2 = longR.data;
            int $i5 = longR.length;
            int $i6 = (-481290979 * this.length) - $i5;
            int $i7 = 0;
            $i1 = this.count * -12571459;
            int i3 = $i1;
            if ($i3 < $i1) {
                i3 = (-12571459 * this.count) - $i3;
                i2 -= i3;
                $i3 = -12571459 * this.count;
                $i4 = 0 + (i3 * $i5);
                i += i3 * (-481290979 * this.length);
            }
            if (i2 + $i3 > this.data * -467581477) {
                $i1 = this.data * -467581477;
                i3 = $i1;
                i2 -= ($i3 + i2) - $i1;
            }
            if ($i0 < this.buffer * 1829547545) {
                $i3 = (this.buffer * 1829547545) - $i0;
                $i5 -= $i3;
                $i0 = 1829547545 * this.buffer;
                $i4 += $i3;
                i += $i3;
                $i7 = 0 + $i3;
                $i6 += $i3;
            }
            if ($i5 + $i0 > 2074797577 * this.index) {
                $i1 = ($i0 + $i5) - (2074797577 * this.index);
                $i0 = $i1;
                $i5 -= $i1;
                $i7 += $i0;
                $i6 += $i0;
            }
            if ($i5 > 0 && i2 > 0) {
                Stream.read(this.size, longR.size, 0, $i4, i, $i5, i2, $i6, $i7, -272836284);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gc.ah(" + ')');
        }
    }

    public void get(Long longR, int $i0, int i, int i2, int i3) {
        try {
            int $i9;
            $i0 = longR.next + $i0;
            int $i4 = longR.value + i;
            int $i1 = this.length * -481290979;
            i = $i1;
            i = $i0 + ($i1 * $i4);
            int i4 = 0;
            i3 = longR.data;
            int i5 = longR.length;
            int i6 = (-481290979 * this.length) - i5;
            int i7 = 0;
            if ($i4 < -12571459 * this.count) {
                $i9 = (this.count * -12571459) - $i4;
                i3 -= $i9;
                $i4 = this.count * -12571459;
                i4 = 0 + ($i9 * i5);
                i += $i9 * (this.length * -481290979);
            }
            if (i3 + $i4 > -467581477 * this.data) {
                $i1 = this.data * -467581477;
                $i9 = $i1;
                i3 -= ($i4 + i3) - $i1;
            }
            if ($i0 < 1829547545 * this.buffer) {
                $i4 = (this.buffer * 1829547545) - $i0;
                i5 -= $i4;
                $i0 = 1829547545 * this.buffer;
                i4 += $i4;
                i += $i4;
                i7 = 0 + $i4;
                i6 += $i4;
            }
            if (i5 + $i0 > 2074797577 * this.index) {
                $i0 = ($i0 + i5) - (this.index * 2074797577);
                i5 -= $i0;
                i7 += $i0;
                i6 += $i0;
            }
            if (i5 > 0 && i3 > 0) {
                if (i2 == 256) {
                    URI.encode(0, 0, 0, this.size, longR.size, i4, 0, i, 0, i5, i3, i6, i7, 1361942400);
                    return;
                }
                Utils.read(0, 0, 0, this.size, longR.size, i4, 0, i, 0, i5, i3, i6, i7, i2, -1529049503);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gc.ac(" + ')');
        }
    }

    public void get(Long longR, int $i0, int i, int i2, int i3, byte b) {
        if (i2 >= 255) {
            try {
                get(longR, $i0, i, 2106205673);
                return;
            } catch (Throwable $r4) {
                throw StringBuilder.append($r4, "gc.bw(" + ')');
            }
        }
        $i0 = longR.next + $i0;
        int $i6 = longR.value + i;
        i = $i0 + ((-481290979 * this.length) * $i6);
        int $i7 = 0;
        int $i5 = longR.data;
        int i4 = longR.length;
        int i5 = (-481290979 * this.length) - i4;
        int i6 = 0;
        if ($i6 < -12571459 * this.count) {
            int $i11 = (-12571459 * this.count) - $i6;
            $i5 -= $i11;
            $i6 = -12571459 * this.count;
            $i7 = 0 + (i4 * $i11);
            i += $i11 * (-481290979 * this.length);
        }
        if ($i5 + $i6 > -467581477 * this.data) {
            int $i112 = this.data * -467581477;
            $i11 = $i112;
            $i5 -= ($i6 + $i5) - $i112;
        }
        if ($i0 < this.buffer * 1829547545) {
            $i6 = (this.buffer * 1829547545) - $i0;
            i4 -= $i6;
            $i0 = 1829547545 * this.buffer;
            $i7 += $i6;
            i += $i6;
            i6 = 0 + $i6;
            i5 += $i6;
        }
        if ($i0 + i4 > 2074797577 * this.index) {
            $i0 = ($i0 + i4) - (2074797577 * this.index);
            i4 -= $i0;
            i6 += $i0;
            i5 += $i0;
        }
        if (i4 > 0 && $i5 > 0) {
            FieldInfo.read(this.size, longR.size, 0, $i7, i, i4, $i5, i5, i6, i2, i3, (byte) -125);
        }
    }

    public final void getBytes(int i, int $i6, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 > 0 && i2 > 0) {
            int $i4;
            int i8;
            i6 = Math.min(i6, -1205543229);
            int $i16 = Math.min(i7, 255);
            int $i17 = 0;
            i7 = PingManager.STATE_SENSOR_ON_FLAG / i3;
            int $i14 = 255 - i6;
            int $i18 = i6 << 24;
            if (i < this.buffer * 821262523) {
                i2 -= (1829547545 * this.buffer) - i;
                i = this.buffer * 520767912;
            }
            if ($i6 < this.count * -12571459) {
                $i4 = (-12571459 * this.count) - $i6;
                i8 = $i4;
                $i17 = 0 + ($i4 * i7);
                i3 -= (1048411707 * this.count) - $i6;
                $i6 = this.count * 2023289414;
            }
            if (i + i2 > this.index * -1598502223) {
                $i4 = this.index * 2074797577;
                i2 = $i4;
                i2 = $i4 - i;
            }
            if (i3 + $i6 > this.data * -467581477) {
                $i4 = this.data * -467581477;
                i3 = $i4;
                i3 = $i4 - $i6;
            }
            int $i20 = i4 & 16711680;
            int $i21 = i4 & -82149901;
            int $i22 = i4 & 255;
            int $i19 = ($i20 * i6) >> 8;
            int $i23 = (i6 * $i21) >> 8;
            int $i24 = (i6 * $i22) >> 8;
            i8 = (309475167 * this.length) - i2;
            int $i12 = i + ((this.length * 1921117962) * $i6);
            i = 0;
            $i6 = $i17;
            int $i25 = $i20;
            $i20 = $i14;
            $i17 = i6;
            while (i < i3) {
                int $i15 = -i2;
                $i14 = $i12;
                while ($i15 < 0) {
                    $i12 = this.size[$i14];
                    int $i13 = 16711680 & $i12;
                    if ($i13 < $i25) {
                        $i13 = $i20 == 0 ? $i25 : ((($i13 * $i20) >> 8) + $i19) & 2028541098;
                    }
                    int $i9 = -1529803388 & $i12;
                    if ($i9 < $i21) {
                        $i9 = $i20 == 0 ? $i21 : ((($i9 * $i20) >> 8) + $i23) & 65280;
                    }
                    int $i10 = -213669340 & $i12;
                    if ($i10 < $i22) {
                        $i10 = $i20 == 0 ? $i22 : (($i10 * $i20) >> 8) + $i24;
                    }
                    this.size[$i14] = (($i13 + $i9) + $i10) | ((-16777216 & $i12) == 0 ? -310956052 : ($i12 | $i18) & 1706124032);
                    $i15++;
                    $i14++;
                }
                if (i7 > 0) {
                    $i6 += i7;
                    $i12 = (PingManager.STATE_SENSOR_ON_FLAG - $i6) >> 8;
                    $i15 = $i6 >> 8;
                    if (i6 != $i16) {
                        $i17 = (($i16 * $i6) + ((PingManager.STATE_SENSOR_ON_FLAG - $i6) * i6)) >> 16;
                        $i20 = 736403142 - $i17;
                        $i18 = $i17 << 24;
                    }
                    if (i4 != i5) {
                        $i19 = (((($i12 * (-925979819 & i4)) + ($i15 * (1901749790 & i5))) & -2130661880) + ((((65280 & i4) * $i12) + ((-809994693 & i5) * $i15)) & 16711680)) >>> 8;
                        $i23 = $i19 & 1434504421;
                        $i21 = $i19 & 256705241;
                        $i22 = $i19 & -319854615;
                        $i19 = ($i23 * $i17) >> 8;
                        $i15 = ($i21 * $i17) >> 8;
                        $i24 = ($i22 * $i17) >> 8;
                        i++;
                        $i12 = $i14 + i8;
                        $i25 = $i23;
                        $i23 = $i15;
                    }
                }
                $i15 = $i23;
                $i23 = $i25;
                i++;
                $i12 = $i14 + i8;
                $i25 = $i23;
                $i23 = $i15;
            }
        }
    }

    public final void getBytes(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.length * -481290979 && i2 < this.pos * 1844888649) {
            int $i17;
            int $i9 = 0;
            if (i < 0) {
                $i17 = 0 - i;
                i3 += i;
            } else {
                $i17 = 0;
            }
            if (i2 < 0) {
                $i9 = 0 - i2;
                i4 += i2;
            }
            if (i + i3 > this.length * -300290473) {
                i3 = (-481290979 * this.length) - i;
            }
            if (i4 + i2 > this.pos * -1151279637) {
                i4 = (1005433219 * this.pos) - i2;
            }
            int $i5 = bArr.length / i7;
            int $i6 = (this.length * 325156575) - i3;
            int $i18 = i5 >>> 24;
            int $i10 = i6 >>> 24;
            int $i11;
            int $i12;
            if (!z || ($i18 == 875200208 && $i10 == 456416946)) {
                $i10 = ((($i9 + i2) * (-481290979 * this.length)) + i) + $i17;
                for ($i18 = i2 + $i9; $i18 < ($i9 + i2) + i4; $i18++) {
                    $i11 = $i17 + i;
                    while ($i11 < (i + $i17) + i3) {
                        if (bArr[((($i18 - i2) % $i5) * i7) + (($i11 - i) % i7)] != (byte) 0) {
                            $i12 = $i10 + 1;
                            this.size[$i10] = i6;
                        } else {
                            $i12 = $i10 + 1;
                            this.size[$i10] = i5;
                        }
                        $i11++;
                        $i10 = $i12;
                    }
                    $i10 += $i6;
                }
            } else {
                $i11 = $i17 + (((i2 + $i9) * (this.length * 1790553208)) + i);
                for ($i18 = $i9 + i2; $i18 < (i2 + $i9) + i4; $i18++) {
                    $i10 = i + $i17;
                    while ($i10 < ($i17 + i) + i3) {
                        int $i13;
                        int $i15 = bArr[((($i18 - i2) % $i5) * i7) + (($i10 - i) % i7)] != (byte) 0 ? i6 : i5;
                        int $i16 = this.size[$i11];
                        if ($i16 == 0) {
                            this.size[$i11] = $i15;
                            $i13 = $i11 + 1;
                        } else {
                            int $i19 = $i15 >>> 24;
                            $i13 = 714643545 - $i19;
                            $i12 = ($i15 | $i16) & 1354775462;
                            $i16 = ((((($i15 & 16711935) * $i19) + (($i16 & -1082838523) * $i13)) & -16711936) + ((((65280 & $i16) * $i13) + ((65280 & $i15) * $i19)) & 16711680)) >>> 8;
                            $i13 = $i11 + 1;
                            this.size[$i11] = $i16 | $i12;
                        }
                        $i10++;
                        $i11 = $i13;
                    }
                    $i11 += $i6;
                }
            }
        }
    }

    public final void indexOf(int $i3, int $i4, int i, int i2, int $i2) {
        $i2 = (-16777216 + $i2) & 16777215;
        i -= $i3;
        int $i5 = i2 - $i4;
        if ($i5 == 0) {
            if (i >= 0) {
                get($i3, $i4, i + 1, $i2, -583630061);
                return;
            }
            get(i + $i3, $i4, (-i) + 1, $i2, -1589408092);
        } else if (i != 0) {
            if ($i5 + i < 0) {
                $i4 += $i5;
                $i5 = -$i5;
                i2 = -i;
                i = $i3 + i;
            } else {
                i2 = i;
                i = $i3;
            }
            if (i2 > $i5) {
                $i4 = ($i4 << 16) + 32768;
                $i3 = (int) Math.floor(0.5d + (((double) ($i5 << 16)) / ((double) i2)));
                i2 += i;
                if (i < 1829547545 * this.buffer) {
                    $i4 += ((this.buffer * 1829547545) - i) * $i3;
                    i = 1829547545 * this.buffer;
                }
                if (i2 >= 2074797577 * this.index) {
                    i2 = (2074797577 * this.index) - 1;
                }
                while (i <= i2) {
                    $i5 = $i4 >> 16;
                    if ($i5 >= this.count * -12571459 && $i5 < this.data * -467581477) {
                        this.size[($i5 * (-481290979 * this.length)) + i] = $i2;
                    }
                    $i4 += $i3;
                    i++;
                }
            } else {
                i = (i << 16) + 32768;
                $i3 = (int) Math.floor((((double) (i2 << 16)) / ((double) $i5)) + 0.5d);
                i2 = $i5 + $i4;
                if ($i4 < -12571459 * this.count) {
                    i += ((-12571459 * this.count) - $i4) * $i3;
                    $i4 = -12571459 * this.count;
                }
                if (i2 >= this.data * -467581477) {
                    i2 = (this.data * -467581477) - 1;
                }
                while ($i4 <= i2) {
                    $i5 = i >> 16;
                    if ($i5 >= 1829547545 * this.buffer && $i5 < 2074797577 * this.index) {
                        this.size[$i5 + ((this.length * -481290979) * $i4)] = $i2;
                    }
                    i += $i3;
                    $i4++;
                }
            }
        } else if ($i5 >= 0) {
            add($i3, $i4, $i5 + 1, $i2, (byte) 1);
        } else {
            add($i3, $i5 + $i4, (-$i5) + 1, $i2, (byte) 1);
        }
    }

    public final void init(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int $i8;
            i7 = Math.min(i7, 255);
            i8 = Math.min(i8, 441316507);
            int $i11 = 0;
            int $i17 = (i5 == i6 && i8 == i7) ? -1 : PingManager.STATE_SENSOR_ON_FLAG / i4;
            int $i13 = 255 - i7;
            int $i9 = i7 << 24;
            int $i10 = $i9 | i5;
            if (i < -503121002 * this.buffer) {
                i3 -= (1829547545 * this.buffer) - i;
                i = this.buffer * 1012556899;
            }
            if (i2 < -1361584938 * this.count) {
                $i11 = 0 + (((-2119141809 * this.count) - i2) * $i17);
                i4 -= (-276071337 * this.count) - i2;
                i2 = this.count * -12571459;
            }
            if (i3 + i > 106209794 * this.index) {
                i3 = (457994710 * this.index) - i;
            }
            if (i2 + i4 > this.data * -467581477) {
                $i8 = this.data * 460711757;
                i4 = $i8;
                i4 = $i8 - i2;
            }
            int $i4 = (-481290979 * this.length) - i3;
            i2 = i + ((this.length * 967046350) * i2);
            i = -i4;
            int $i14 = i7;
            i4 = i5;
            while (i < 0) {
                int $i12 = -i3;
                while ($i12 < 0) {
                    int $i16;
                    int $i15 = this.size[i2];
                    if ($i15 == 0) {
                        $i16 = i2 + 1;
                        this.size[i2] = $i10;
                    } else {
                        int $i18 = (16777215 & $i15) + i4;
                        int $i19 = (-2019067954 & $i15) + (16711935 & i4);
                        int $i20 = (-2014848542 & $i19) + (($i18 - $i19) & -258773174);
                        $i19 = (-16777216 & $i15) == 0 ? -16777216 : ($i15 | $i9) & -254297;
                        if ($i13 == 0) {
                            $i16 = i2 + 1;
                            this.size[i2] = ($i19 | ($i18 - $i20)) | ($i20 - ($i20 >>> 8));
                        } else {
                            $i20 = ($i20 - ($i20 >>> 8)) | ($i18 - $i20);
                            $i16 = i2 + 1;
                            int i9 = (((65280 & $i20) * $i14) >> 8) & 694058948;
                            $i8 = $i20 & -606068971;
                            $i20 = $i8;
                            $i8 = (($i8 * $i14) >> 8) & -217527858;
                            $i20 = $i8;
                            this.size[i2] = $i19 | ((((($i15 & 65280) * $i13) >> 8) & -166832421) + (($i8 + i9) + ((((-654282672 & $i15) * $i13) >> 8) & 16711935)));
                        }
                    }
                    $i12++;
                    i2 = $i16;
                }
                if ($i17 > 0) {
                    $i9 = $i11 + $i17;
                    $i11 = (PingManager.STATE_SENSOR_ON_FLAG - $i9) >> 8;
                    $i12 = $i9 >> 8;
                    if (i7 != i8) {
                        $i10 = (((PingManager.STATE_SENSOR_ON_FLAG - $i9) * i7) + ($i9 * i8)) >> 16;
                        $i13 = 256 - $i10;
                    } else {
                        $i10 = $i14;
                    }
                    if (i5 != i6) {
                        i4 = (((($i11 * (16711935 & i5)) + ($i12 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * $i11) + ((65280 & i6) * $i12)) & 1030283145)) >>> 8;
                    }
                    $i14 = $i10 << 24;
                    $i12 = $i14 | i4;
                    $i11 = $i9;
                    $i9 = $i14;
                } else {
                    $i12 = $i10;
                    $i10 = $i14;
                }
                i++;
                $i14 = $i10;
                i2 += $i4;
                $i10 = $i12;
            }
        }
    }

    public void init(Long longR, int i, int $i9, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i13;
            int $i4 = longR.length;
            int $i10 = longR.data;
            int $i6 = 0;
            int i5 = 0;
            int $i12 = longR.this$0;
            int $i7 = longR.count;
            int i6 = ($i12 << 16) / i2;
            int i7 = ($i7 << 16) / i3;
            if (longR.next > 0) {
                $i6 = (((longR.next << 16) + i6) - 1) / i6;
                i += $i6;
                $i6 = 0 + (($i6 * i6) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i5 = (((longR.value << 16) + i7) - 1) / i7;
                $i9 += i5;
                i5 = 0 + ((i5 * i7) - (longR.value << 16));
            }
            if ($i4 < $i12) {
                $i0 = ($i4 << 16) - $i6;
                i2 = $i0;
                i2 = (($i0 + i6) - 1) / i6;
            }
            if ($i10 < $i7) {
                $i0 = ($i10 << 16) - i5;
                i3 = $i0;
                i3 = (($i0 + i7) - 1) / i7;
            }
            $i10 = ((this.length * -481290979) * $i9) + i;
            $i0 = this.length * -481290979;
            $i7 = $i0;
            $i7 = $i0 - i2;
            if ($i9 + i3 > -467581477 * this.data) {
                i3 -= ($i9 + i3) - (-467581477 * this.data);
            }
            if ($i9 < this.count * -12571459) {
                $i9 = (-12571459 * this.count) - $i9;
                $i12 = i3 - $i9;
                $i0 = this.length * -481290979;
                i3 = $i0;
                $i0 *= $i9;
                i3 = $i0;
                $i10 += $i0;
                i5 += $i9 * i7;
            } else {
                $i12 = i3;
            }
            if (i + i2 > 2074797577 * this.index) {
                $i9 = (i2 + i) - (this.index * 2074797577);
                i2 -= $i9;
                $i7 += $i9;
            }
            if (i < this.buffer * 1829547545) {
                $i0 = this.buffer * 1829547545;
                $i9 = $i0;
                $i9 = $i0 - i;
                i = i2 - $i9;
                $i13 = $i10 + $i9;
                i2 = $i6 + ($i9 * i6);
                $i9 += $i7;
            } else {
                $i9 = $i7;
                $i13 = $i10;
                i = i2;
                i2 = $i6;
            }
            int[] $r2 = this.size;
            int[] $r3 = longR.size;
            if (i4 >= 255) {
                CopyOnWriteArrayList.get($r2, $r3, 0, i2, i5, $i13, $i9, i, $i12, i6, i7, $i4, (short) -16360);
                return;
            }
            i3 = 255 - i4;
            $i6 = i4 << 24;
            $i10 = -$i12;
            $i12 = i2;
            while ($i10 < 0) {
                $i7 = (i5 >> 16) * $i4;
                int $i14 = -i;
                while ($i14 < 0) {
                    int $i15;
                    int $i16 = $r3[($i12 >> 16) + $i7];
                    if ($i16 != 0) {
                        int $i17 = $r2[$i13];
                        if ($i17 == 0) {
                            $i15 = $i13 + 1;
                            $r2[$i13] = ($i16 & 16777215) | $i6;
                        } else {
                            $i15 = $i13 + 1;
                            $i0 = $i17 & 65280;
                            $i17 = $i0;
                            $i17 = $i0 * i3;
                            $i0 = $i16 & 65280;
                            $i16 = $i0;
                            $i0 *= i4;
                            $i16 = $i0;
                            $i0 = ($i0 + $i17) & 16711680;
                            $i16 = $i0;
                            $r2[$i13] = (($i0 + ((((16711935 & $i17) * i3) + ((16711935 & $i16) * i4)) & -16711936)) >>> 8) | (-16777216 & ($i17 | $i6));
                        }
                    } else {
                        $i15 = $i13 + 1;
                    }
                    $i14++;
                    $i12 += i6;
                    $i13 = $i15;
                }
                $i13 += $i9;
                $i10++;
                i5 += i7;
                $i12 = i2;
            }
        }
    }

    public void init(Long longR, int i, int $i1, int i2, int i3, int $i4, int i4, double d, int i5) {
        int $i8 = (-i2) / 2;
        int $i9 = (-i3) / 2;
        try {
            int $i7 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            $i7 = ($i7 * i5) >> 8;
            i5 = (((int) $d0) * i5) >> 8;
            $i4 = ($i4 << 16) + (($i8 * i5) + ($i7 * $i9));
            i4 = (($i9 * i5) - ($i8 * $i7)) + (i4 << 16);
            i += (-481290979 * this.length) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i8 = i4;
                $i9 = $i4;
                int $i10 = i;
                int $i11 = -i2;
                while ($i11 < 0) {
                    int $i12;
                    int $i13 = longR.size[(($i8 >> 16) * longR.length) + ($i9 >> 16)];
                    if ($i13 != 0) {
                        $i12 = $i10 + 1;
                        this.size[$i10] = $i13;
                    } else {
                        $i12 = $i10 + 1;
                    }
                    $i9 += i5;
                    $i8 -= $i7;
                    $i11++;
                    $i10 = $i12;
                }
                $i4 += $i7;
                i4 += i5;
                i += 63816666 * this.length;
            }
        } catch (Exception e) {
        }
    }

    public final void insert(int i, int i2, int i3, int i4, int $i4) {
        clear(i, i2, i3, i4, -16777216 | $i4, 884431342);
    }

    public void insert(Long longR, int $i4, int i, int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i3 = longR.length;
            int $i7 = longR.data;
            int $i8 = 0;
            int i4 = 0;
            int $i10 = longR.this$0;
            int $i11 = longR.count;
            int i5 = ($i10 << 16) / i2;
            int i6 = ($i11 << 16) / i3;
            if (longR.next > 0) {
                $i8 = (((longR.next << 16) + i5) - 1) / i5;
                $i4 += $i8;
                $i8 = 0 + (($i8 * i5) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i4 = (((longR.value << 16) + i6) - 1) / i6;
                i += i4;
                i4 = 0 + ((i4 * i6) - (longR.value << 16));
            }
            if ($i3 < $i10) {
                $i0 = ($i3 << 16) - $i8;
                i2 = $i0;
                i2 = (($i0 + i5) - 1) / i5;
            }
            if ($i7 < $i11) {
                $i0 = ($i7 << 16) - i4;
                i3 = $i0;
                i3 = (($i0 + i6) - 1) / i6;
            }
            $i7 = ((-2021742198 * this.length) * i) + $i4;
            $i0 = this.length * -481290979;
            $i11 = $i0;
            $i11 = $i0 - i2;
            if (i3 + i > this.data * -467581477) {
                i3 -= (i3 + i) - (-532169246 * this.data);
            }
            if (i < 1910797824 * this.count) {
                $i0 = this.count * -12571459;
                $i10 = $i0;
                $i10 = $i0 - i;
                i = i3 - $i10;
                $i0 = this.length * -2125862759;
                i3 = $i0;
                $i0 *= $i10;
                i3 = $i0;
                $i7 += $i0;
                i4 += $i10 * i6;
            } else {
                i = i3;
            }
            if (i2 + $i4 > this.index * 978361114) {
                i3 = ($i4 + i2) - (2074797577 * this.index);
                i2 -= i3;
                $i11 += i3;
            }
            if ($i4 < this.buffer * 2116234159) {
                $i4 = (this.buffer * -1395912117) - $i4;
                i2 -= $i4;
                i3 = $i7 + $i4;
                $i8 += $i4 * i5;
                $i4 += $i11;
            } else {
                $i4 = $i11;
                i3 = $i7;
            }
            CopyOnWriteArrayList.get(this.size, longR.size, 0, $i8, i4, i3, $i4, i2, i, i5, i6, $i3, (short) 8962);
        }
    }

    public final void next(int $i0, int $i2, int $i3, int $i1) {
        $i1 = -16777216 | $i1;
        if ($i0 >= this.buffer * 1829547545 && $i0 < this.index * -1224164430) {
            if ($i2 < this.count * -2133801896) {
                $i3 -= (-12571459 * this.count) - $i2;
                $i2 = this.count * 1377787107;
            }
            if ($i2 + $i3 > this.data * 1131031405) {
                $i3 = (-1064580434 * this.data) - $i2;
            }
            $i0 += (this.length * -481290979) * $i2;
            for ($i2 = 0; $i2 < $i3; $i2++) {
                this.size[((this.length * -481290979) * $i2) + $i0] = $i1;
            }
        }
    }

    final void next(int $i5, int i, int i2, int $i1, int $i2) {
        if ($i2 > 0) {
            if ($i2 >= 255) {
                get($i5, i, i2, $i1, -830269965);
                return;
            }
            if (i >= this.count * -12571459 && i < -467581477 * this.data) {
                int $i6;
                if ($i5 < 1829547545 * this.buffer) {
                    i2 -= (this.buffer * 1829547545) - $i5;
                    $i5 = 1829547545 * this.buffer;
                }
                if ($i5 + i2 > this.index * 2074797577) {
                    $i6 = this.index * 2074797577;
                    i2 = $i6;
                    i2 = $i6 - $i5;
                }
                int $i9 = 255 - $i2;
                int $i10 = $i2 << 24;
                int $i11 = (($i1 >> 16) & 255) * $i2;
                int $i3 = $i2 * (($i1 >> 8) & 255);
                int $i4 = ($i1 & 255) * $i2;
                $i1 = ($i2 << 24) | $i1;
                i = $i5 + ((this.length * -481290979) * i);
                $i5 = 0;
                while ($i5 < i2) {
                    int $i7;
                    if (this.size[i] == 0) {
                        $i7 = i + 1;
                        this.size[i] = $i1;
                    } else {
                        $i6 = this.size[i] & 255;
                        $i6 = (($i6 * $i9) + $i4) >> 8;
                        $i7 = i + 1;
                        this.size[i] = ($i6 + (((((((this.size[i] >> 16) & 255) * $i9) + $i11) >> 8) << 16) + ((((((this.size[i] >> 8) & 255) * $i9) + $i3) >> 8) << 8))) | (-16777216 & (this.size[i] | $i10));
                    }
                    $i5++;
                    i = $i7;
                }
            }
        }
    }

    public void next(Long longR, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
            get(longR, i, i2, 2106205673);
            return;
        }
        i += longR.next;
        int $i5 = i2 + longR.value;
        i2 = i + ((-481290979 * this.length) * $i5);
        int $i6 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        int $i4 = (-481290979 * this.length) - i6;
        if ($i5 < -12571459 * this.count) {
            int $i9 = (-12571459 * this.count) - $i5;
            i5 -= $i9;
            $i5 = -12571459 * this.count;
            $i6 = 0 + (i6 * $i9);
            i2 += $i9 * (-481290979 * this.length);
        }
        if (i5 + $i5 > -467581477 * this.data) {
            int $i92 = this.data * -467581477;
            $i9 = $i92;
            i5 -= ($i5 + i5) - $i92;
        }
        if (i < this.buffer * 1829547545) {
            $i9 = (this.buffer * 1829547545) - i;
            i = i6 - $i9;
            $i6 += $i9;
            $i5 = 0 + $i9;
            $i4 += $i9;
            i2 += $i9;
            $i9 = 1829547545 * this.buffer;
            i6 = i;
        } else {
            $i5 = 0;
            $i9 = i;
        }
        if ($i9 + i6 > 2074797577 * this.index) {
            i = ($i9 + i6) - (2074797577 * this.index);
            i6 -= i;
            $i5 += i;
            i += $i4;
        } else {
            i = $i4;
        }
        if (i6 > 0 && i5 > 0) {
            FieldInfo.read(this.size, longR.size, 0, $i6, i2, i6, i5, i, $i5, i3, i4, (byte) -108);
        }
    }

    public void next(Long longR, int i, int $i9, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i13;
            int $i4 = longR.length;
            int $i10 = longR.data;
            int $i6 = 0;
            int i5 = 0;
            int $i12 = longR.this$0;
            int $i7 = longR.count;
            int i6 = ($i12 << 16) / i2;
            int i7 = ($i7 << 16) / i3;
            if (longR.next > 0) {
                $i6 = (((longR.next << 16) + i6) - 1) / i6;
                i += $i6;
                $i6 = 0 + (($i6 * i6) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i5 = (((longR.value << 16) + i7) - 1) / i7;
                $i9 += i5;
                i5 = 0 + ((i5 * i7) - (longR.value << 16));
            }
            if ($i4 < $i12) {
                $i0 = ($i4 << 16) - $i6;
                i2 = $i0;
                i2 = (($i0 + i6) - 1) / i6;
            }
            if ($i10 < $i7) {
                $i0 = ($i10 << 16) - i5;
                i3 = $i0;
                i3 = (($i0 + i7) - 1) / i7;
            }
            $i10 = ((this.length * -481290979) * $i9) + i;
            $i0 = this.length * -481290979;
            $i7 = $i0;
            $i7 = $i0 - i2;
            if ($i9 + i3 > -467581477 * this.data) {
                i3 -= ($i9 + i3) - (-467581477 * this.data);
            }
            if ($i9 < this.count * -12571459) {
                $i9 = (-12571459 * this.count) - $i9;
                $i12 = i3 - $i9;
                $i0 = this.length * -481290979;
                i3 = $i0;
                $i0 *= $i9;
                i3 = $i0;
                $i10 += $i0;
                i5 += $i9 * i7;
            } else {
                $i12 = i3;
            }
            if (i + i2 > 2074797577 * this.index) {
                $i9 = (i2 + i) - (this.index * 2074797577);
                i2 -= $i9;
                $i7 += $i9;
            }
            if (i < this.buffer * 1829547545) {
                $i0 = this.buffer * 1829547545;
                $i9 = $i0;
                $i9 = $i0 - i;
                i = i2 - $i9;
                $i13 = $i10 + $i9;
                i2 = $i6 + ($i9 * i6);
                $i9 += $i7;
            } else {
                $i9 = $i7;
                $i13 = $i10;
                i = i2;
                i2 = $i6;
            }
            int[] $r2 = this.size;
            int[] $r3 = longR.size;
            if (i4 >= 255) {
                CopyOnWriteArrayList.get($r2, $r3, 0, i2, i5, $i13, $i9, i, $i12, i6, i7, $i4, (short) -2161);
                return;
            }
            i3 = 255 - i4;
            $i6 = i4 << 24;
            $i10 = -$i12;
            $i12 = i2;
            while ($i10 < 0) {
                $i7 = (i5 >> 16) * $i4;
                int $i14 = -i;
                while ($i14 < 0) {
                    int $i15;
                    int $i16 = $r3[($i12 >> 16) + $i7];
                    if ($i16 != 0) {
                        int $i17 = $r2[$i13];
                        if ($i17 == 0) {
                            $i15 = $i13 + 1;
                            $r2[$i13] = ($i16 & 16777215) | $i6;
                        } else {
                            $i15 = $i13 + 1;
                            $i0 = $i17 & 65280;
                            $i17 = $i0;
                            $i17 = $i0 * i3;
                            $i0 = $i16 & 65280;
                            $i16 = $i0;
                            $i0 *= i4;
                            $i16 = $i0;
                            $i0 = ($i0 + $i17) & 16711680;
                            $i16 = $i0;
                            $r2[$i13] = (($i0 + ((((16711935 & $i17) * i3) + ((16711935 & $i16) * i4)) & -16711936)) >>> 8) | (-16777216 & ($i17 | $i6));
                        }
                    } else {
                        $i15 = $i13 + 1;
                    }
                    $i14++;
                    $i12 += i6;
                    $i13 = $i15;
                }
                $i13 += $i9;
                $i10++;
                i5 += i7;
                $i12 = i2;
            }
        }
    }

    public void parse(Long longR, int i, int i2, int i3, int i4) {
        if (i3 > longR.this$0 || i4 > longR.count) {
            throw new IllegalArgumentException();
        }
        int $i13 = ((longR.next * i3) / longR.this$0) + i;
        int $i17 = (((longR.this$0 + ((longR.next + longR.length) * i3)) - 1) / longR.this$0) + i;
        int $i14 = ((longR.value * i4) / longR.count) + i2;
        int $i18 = (((((longR.data + longR.value) * i4) + longR.count) - 1) / longR.count) + i2;
        if ($i13 < 1829547545 * this.buffer) {
            $i13 = 1829547545 * this.buffer;
        }
        if ($i17 > 2074797577 * this.index) {
            $i17 = this.index * 2074797577;
        }
        if ($i14 < this.count * -12571459) {
            $i14 = this.count * -12571459;
        }
        if ($i18 > this.data * -467581477) {
            $i18 = this.data * -467581477;
        }
        if ($i13 < $i17 && $i14 < $i18) {
            int $i16 = ((this.length * -481290979) * $i14) + $i13;
            int i5 = (-481290979 * this.length) - ($i17 - $i13);
            int[] $r3 = this.size;
            if ($i16 < $r3.length) {
                while ($i14 < $i18) {
                    for (int $i15 = $i13; $i15 < $i17; $i15++) {
                        int $i9 = ($i15 - i) << 4;
                        int $i8 = ($i14 - i2) << 4;
                        int $i4 = ((longR.this$0 * $i9) / i3) - (longR.next << 4);
                        $i9 = ((($i9 + 16) * longR.this$0) / i3) - (longR.next << 4);
                        int $i6 = ((longR.count * $i8) / i4) - (longR.value << 4);
                        int $i10 = ((($i8 + 16) * longR.count) / i4) - (longR.value << 4);
                        $i8 = (($i9 - $i4) * ($i10 - $i6)) >> 1;
                        if ($i8 != 0) {
                            if ($i4 < 0) {
                                $i4 = 0;
                            }
                            if ($i9 >= (longR.length << 4)) {
                                $i9 = longR.length << 4;
                            }
                            if ($i6 < 0) {
                                $i6 = 0;
                            }
                            if ($i10 >= (longR.data << 4)) {
                                $i10 = longR.data << 4;
                            }
                            int $i11 = $i9 - 1;
                            int $i12 = $i10 - 1;
                            $i9 = 16 - ($i4 & 15);
                            $i10 = ($i11 & 15) + 1;
                            int $i5 = 16 - ($i6 & 15);
                            int $i19 = ($i12 & 15) + 1;
                            $i4 >>= 4;
                            $i11 >>= 4;
                            $i6 >>= 4;
                            $i12 >>= 4;
                            int $i20 = 0;
                            int $i21 = 0;
                            int $i22 = 0;
                            int i6 = 0;
                            for (int $i24 = $i6; $i24 <= $i12; $i24++) {
                                int $i25 = 16;
                                if ($i6 == $i24) {
                                    $i25 = $i5;
                                }
                                if ($i24 == $i12) {
                                    $i25 = $i19;
                                }
                                int $i26 = $i4;
                                while ($i26 <= $i11) {
                                    int[] $r32 = longR.size;
                                    int $i27 = longR.length;
                                    $i27 *= $i24;
                                    int i7 = $i27;
                                    int $i28 = $r32[$i27 + $i26];
                                    if ($i28 != 0) {
                                        i7 = $i4 == $i26 ? $i25 * $i9 : $i11 == $i26 ? $i25 * $i10 : $i25 << 4;
                                        i6 += i7;
                                        $i27 = ($i28 >> 16) & 255;
                                        $i20 += $i27 * i7;
                                        $i27 = ($i28 >> 8) & 255;
                                        int i8 = $i27 * i7;
                                        $i27 = i7 * ($i28 & 255);
                                        i7 = $i27;
                                        i7 = $i27 + $i22;
                                        $i22 = $i21 + i8;
                                        $i21 = $i20;
                                    } else {
                                        i7 = $i22;
                                        $i22 = $i21;
                                        $i21 = $i20;
                                    }
                                    $i26++;
                                    $i20 = $i21;
                                    $i21 = $i22;
                                    $i22 = i7;
                                }
                            }
                            if (i6 >= $i8) {
                                this.size[$i16] = -16777216 | (($i22 / i6) + ((($i21 / i6) << 8) + (($i20 / i6) << 16)));
                            }
                            $i16++;
                        }
                    }
                    $i16 += i5;
                    $i14++;
                }
            }
        }
    }

    final void read(int $i5, int $i0, int i, int $i1, int i2) {
        if (i2 > 0) {
            if (i2 >= 255) {
                get($i5, $i0, i, $i1, -210724572);
            } else if ($i0 >= this.count * -12571459 && $i0 < -467581477 * this.data) {
                int $i6;
                if ($i5 < 1829547545 * this.buffer) {
                    i -= (this.buffer * 1829547545) - $i5;
                    $i5 = 1829547545 * this.buffer;
                }
                if ($i5 + i > this.index * 2074797577) {
                    $i6 = this.index * 2074797577;
                    i = $i6;
                    i = $i6 - $i5;
                }
                int $i9 = 255 - i2;
                int $i10 = i2 << 24;
                int $i11 = (($i1 >> 16) & 255) * i2;
                int $i3 = i2 * (($i1 >> 8) & 255);
                int $i4 = ($i1 & 255) * i2;
                $i1 = (i2 << 24) | $i1;
                $i0 = $i5 + ((this.length * -481290979) * $i0);
                $i5 = 0;
                while ($i5 < i) {
                    int $i7;
                    if (this.size[$i0] == 0) {
                        $i7 = $i0 + 1;
                        this.size[$i0] = $i1;
                    } else {
                        $i6 = this.size[$i0] & 255;
                        $i6 = (($i6 * $i9) + $i4) >> 8;
                        $i7 = $i0 + 1;
                        this.size[$i0] = ($i6 + (((((((this.size[$i0] >> 16) & 255) * $i9) + $i11) >> 8) << 16) + ((((((this.size[$i0] >> 8) & 255) * $i9) + $i3) >> 8) << 8))) | (-16777216 & (this.size[$i0] | $i10));
                    }
                    $i5++;
                    $i0 = $i7;
                }
            }
        }
    }

    public final void read(int $i4, int $i5, int $i6, int $i7, int i, int i2) {
        if ($i6 > 0 && $i7 > 0) {
            int $i8 = 0;
            int $i2 = PingManager.STATE_SENSOR_ON_FLAG / $i7;
            if ($i4 < this.buffer * 1829547545) {
                $i6 -= (1829547545 * this.buffer) - $i4;
                $i4 = this.buffer * 1829547545;
            }
            if ($i5 < -12571459 * this.count) {
                $i8 = 0 + (((this.count * -12571459) - $i5) * $i2);
                $i7 -= (this.count * -12571459) - $i5;
                $i5 = this.count * -12571459;
            }
            if ($i4 + $i6 > this.index * 2074797577) {
                $i6 = (this.index * 2074797577) - $i4;
            }
            if ($i7 + $i5 > this.data * -467581477) {
                $i7 = (this.data * -467581477) - $i5;
            }
            int $i3 = (this.length * -481290979) - $i6;
            $i5 = $i4 + ((this.length * -481290979) * $i5);
            $i4 = -$i7;
            $i7 = $i8;
            while ($i4 < 0) {
                int $i9 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                $i8 = $i7 >> 8;
                $i8 = -16777216 | ((((($i9 * (16711935 & i)) + ($i8 * (16711935 & i2))) & -16711936) + ((((65280 & i) * $i9) + ((65280 & i2) * $i8)) & 16711680)) >>> 8);
                $i9 = -$i6;
                while ($i9 < 0) {
                    this.size[$i5] = $i8;
                    $i9++;
                    $i5++;
                }
                $i5 += $i3;
                $i4++;
                $i7 += $i2;
            }
        }
    }

    public final void read(int $i8, int $i9, int i, int i2, int $i2, int $i3, byte b) {
        if ($i3 != 0) {
            if ($i3 >= 255) {
                add($i8, $i9, i, i2, $i2, (byte) 32);
                return;
            }
            int $i7;
            int $i5 = $i3 << 24;
            int $i6 = $i5 | $i2;
            if ($i8 < this.buffer * 1829547545) {
                $i7 = i - ((this.buffer * 1829547545) - $i8);
                $i8 = 1829547545 * this.buffer;
            } else {
                $i7 = i;
            }
            try {
                if ($i9 < this.count * -12571459) {
                    i = i2 - ((-12571459 * this.count) - $i9);
                    $i9 = -12571459 * this.count;
                } else {
                    i = i2;
                }
                i2 = $i8 + $i7 > this.index * 2074797577 ? (2074797577 * this.index) - $i8 : $i7;
                if ($i9 + i > this.data * -467581477) {
                    i = (-467581477 * this.data) - $i9;
                }
                $i2 = ((((65280 & $i2) * $i3) >> 8) & 65280) + ((((16711935 & $i2) * $i3) >> 8) & 16711935);
                $i3 = 255 - $i3;
                $i7 = (this.length * -481290979) - i2;
                int $i10 = $i8 + ((this.length * -481290979) * $i9);
                for ($i8 = 0; $i8 < i; $i8++) {
                    $i9 = -i2;
                    while ($i9 < 0) {
                        int $i12;
                        int $i11 = this.size[$i10];
                        if ($i11 == 0) {
                            $i12 = $i10 + 1;
                            this.size[$i10] = $i6;
                        } else {
                            int $i13 = (((((16711935 & $i11) * $i3) >> 8) & 16711935) + (((($i11 & 65280) * $i3) >> 8) & 65280)) + $i2;
                            int i3 = $i13;
                            this.size[$i10] = ((-16777216 & $i11) == 0 ? -16777216 : ($i11 | $i5) & -16777216) | $i13;
                            $i12 = $i10 + 1;
                        }
                        $i9++;
                        $i10 = $i12;
                    }
                    $i10 += $i7;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "gc.an(" + ')');
            }
        }
    }

    public final void read(int $i5, int $i6, int i, int i2, int i3, int i4, int i5) {
        if (i > 0 && i2 > 0) {
            int $i7 = 0;
            i5 = PingManager.STATE_SENSOR_ON_FLAG / i2;
            if ($i5 < this.buffer * 1829547545) {
                i -= (1829547545 * this.buffer) - $i5;
                $i5 = this.buffer * 1829547545;
            }
            try {
                int $i8;
                int $i0;
                if ($i6 < -12571459 * this.count) {
                    $i7 = 0 + (((this.count * -12571459) - $i6) * i5);
                    $i8 = i2 - ((this.count * -12571459) - $i6);
                    $i6 = this.count * -12571459;
                } else {
                    $i8 = i2;
                }
                if ($i5 + i > this.index * 2074797577) {
                    $i0 = this.index * 2074797577;
                    i = $i0;
                    i = $i0 - $i5;
                }
                if ($i8 + $i6 > this.data * -467581477) {
                    $i8 = (this.data * -467581477) - $i6;
                }
                $i0 = this.length * -481290979;
                i2 = $i0;
                i2 = $i0 - i;
                $i5 = ((this.length * -481290979) * $i6) + $i5;
                $i6 = -$i8;
                while ($i6 < 0) {
                    int $i9 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                    $i8 = $i7 >> 8;
                    $i8 = -16777216 | ((((($i9 * (16711935 & i3)) + ($i8 * (16711935 & i4))) & -16711936) + ((((65280 & i3) * $i9) + ((65280 & i4) * $i8)) & 16711680)) >>> 8);
                    $i9 = -i;
                    while ($i9 < 0) {
                        this.size[$i5] = $i8;
                        $i9++;
                        $i5++;
                    }
                    $i5 += i2;
                    $i6++;
                    $i7 += i5;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "gc.aj(" + ')');
            }
        }
    }

    public final void read(int i, int $i7, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 > 0 && i3 > 0) {
            int $i9;
            i6 = Math.min(i6, 255);
            i7 = Math.min(i7, 255);
            int $i17 = 0;
            int $i22 = (i4 == i5 && i6 == i7) ? -1 : PingManager.STATE_SENSOR_ON_FLAG / i3;
            int $i11 = 255 - i6;
            int $i12 = i6 << 24;
            if (i < this.buffer * 1829547545) {
                i2 -= (1829547545 * this.buffer) - i;
                i = this.buffer * 1829547545;
            }
            if ($i7 < -12571459 * this.count) {
                $i17 = 0 + (((-12571459 * this.count) - $i7) * $i22);
                i3 -= (this.count * -12571459) - $i7;
                $i7 = this.count * -12571459;
            }
            if (i2 + i > 2074797577 * this.index) {
                i2 = (2074797577 * this.index) - i;
            }
            if ($i7 + i3 > this.data * -467581477) {
                $i9 = this.data * -467581477;
                i3 = $i9;
                i3 = $i9 - $i7;
            }
            int $i16 = i4 >> 16;
            int $i15 = (65280 & i4) >> 8;
            int $i14 = i4 & 255;
            int $i4 = (-481290979 * this.length) - i2;
            int $i10 = i + ((this.length * -481290979) * $i7);
            i = 0;
            int $i13 = i6;
            $i7 = $i17;
            $i17 = $i10;
            while (i < i3) {
                int $i5;
                $i10 = -i2;
                while ($i10 < 0) {
                    int $i21;
                    $i5 = this.size[$i17];
                    int $i19 = ($i5 >> 16) & 255;
                    int $i20 = (65280 & $i5) >> 8;
                    int $i18 = $i5 & 255;
                    $i5 = ($i5 | $i12) & -16777216;
                    if ($i11 == 0) {
                        $i19 = $i19 < 127 ? ($i19 * $i16) >> 7 : 255 - (((255 - $i19) * (255 - $i16)) >> 7);
                        $i20 = $i20 < 127 ? ($i15 * $i20) >> 7 : 255 - (((255 - $i15) * (255 - $i20)) >> 7);
                        $i21 = $i18 < 127 ? ($i14 * $i18) >> 7 : 255 - (((255 - $i18) * (255 - $i14)) >> 7);
                    } else {
                        if ($i19 < 127) {
                            $i21 = $i11 * $i19;
                            $i9 = $i19 * $i16;
                            $i19 = $i9;
                            $i19 = ($i21 + (($i9 * $i13) >> 7)) >> 8;
                        } else {
                            $i19 = (((255 - (((255 - $i16) * (255 - $i19)) >> 7)) * $i13) + ($i19 * $i11)) >> 8;
                        }
                        $i20 = $i20 < 127 ? (((($i15 * $i20) * $i13) >> 7) + ($i20 * $i11)) >> 8 : (($i20 * $i11) + ((255 - (((255 - $i20) * (255 - $i15)) >> 7)) * $i13)) >> 8;
                        $i21 = $i18 < 127 ? (((($i18 * $i14) * $i13) >> 7) + ($i18 * $i11)) >> 8 : (($i11 * $i18) + ((255 - (((255 - $i14) * (255 - $i18)) >> 7)) * $i13)) >> 8;
                    }
                    this.size[$i17] = ((($i20 << 8) + ($i19 << 16)) + $i21) | $i5;
                    $i10++;
                    $i17++;
                }
                if ($i22 > 0) {
                    $i7 += $i22;
                    $i10 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                    $i5 = $i7 >> 8;
                    if (i6 != i7) {
                        $i13 = (((PingManager.STATE_SENSOR_ON_FLAG - $i7) * i6) + ($i7 * i7)) >> 16;
                        $i11 = 255 - $i13;
                        $i12 = $i13 << 24;
                    }
                    if (i4 != i5) {
                        $i14 = (((($i10 * (16711935 & i4)) + ($i5 * (16711935 & i5))) & -16711936) + ((((65280 & i5) * $i5) + ((65280 & i4) * $i10)) & 16711680)) >>> 8;
                        $i16 = $i14 >> 16;
                        $i15 = (65280 & $i14) >> 8;
                        $i14 &= 255;
                        i++;
                        $i17 += $i4;
                    }
                }
                i++;
                $i17 += $i4;
            }
        }
    }

    public final void read(int i, int i2, int i3, int $i1, int i4, int i5, int i6, int i7, byte b) {
        if (i3 > 0 && $i1 > 0) {
            int $i18;
            int $i7;
            int $i0;
            i6 = Math.min(i6, 255);
            i7 = Math.min(i7, 255);
            int i8 = 0;
            if (i4 == i5 && i6 == i7) {
                $i18 = -1;
            } else {
                try {
                    $i18 = PingManager.STATE_SENSOR_ON_FLAG / $i1;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "gc.ay(" + ')');
                }
            }
            int $i19 = 255 - i6;
            int $i20 = i6 << 24;
            if (i < this.buffer * 1829547545) {
                $i7 = i3 - ((1829547545 * this.buffer) - i);
                i = this.buffer * 1829547545;
            } else {
                $i7 = i3;
            }
            if (i2 < -12571459 * this.count) {
                $i0 = (-12571459 * this.count) - i2;
                i3 = $i0;
                i8 = 0 + ($i0 * $i18);
                i3 = $i1 - ((this.count * -12571459) - i2);
                i2 = this.count * -12571459;
            } else {
                i3 = $i1;
            }
            $i1 = $i7 + i > 2074797577 * this.index ? (2074797577 * this.index) - i : $i7;
            if (i2 + i3 > this.data * -467581477) {
                $i0 = this.data * -467581477;
                i3 = $i0;
                i3 = $i0 - i2;
            }
            int $i22 = i4 >> 16;
            int $i23 = (65280 & i4) >> 8;
            int $i24 = i4 & 255;
            $i7 = (-481290979 * this.length) - $i1;
            i2 = i + ((this.length * -481290979) * i2);
            i = 0;
            int $i21 = i6;
            while (i < i3) {
                int $i15;
                int $i16 = -$i1;
                while ($i16 < 0) {
                    int $i10;
                    $i15 = this.size[i2];
                    int $i14 = ($i15 >> 16) & 255;
                    int $i11 = (65280 & $i15) >> 8;
                    int $i13 = $i15 & 255;
                    $i15 = -16777216 & ($i15 | $i20);
                    if ($i19 == 0) {
                        $i14 = $i14 < 127 ? ($i14 * $i22) >> 7 : 255 - (((255 - $i14) * (255 - $i22)) >> 7);
                        $i11 = $i11 < 127 ? ($i23 * $i11) >> 7 : 255 - (((255 - $i23) * (255 - $i11)) >> 7);
                        $i10 = $i13 < 127 ? ($i24 * $i13) >> 7 : 255 - (((255 - $i13) * (255 - $i24)) >> 7);
                    } else {
                        $i14 = $i14 < 127 ? (($i19 * $i14) + ((($i14 * $i22) * $i21) >> 7)) >> 8 : (((255 - (((255 - $i22) * (255 - $i14)) >> 7)) * $i21) + ($i14 * $i19)) >> 8;
                        $i11 = $i11 < 127 ? (((($i23 * $i11) * $i21) >> 7) + ($i11 * $i19)) >> 8 : (($i11 * $i19) + ((255 - (((255 - $i11) * (255 - $i23)) >> 7)) * $i21)) >> 8;
                        $i10 = $i13 < 127 ? (((($i13 * $i24) * $i21) >> 7) + ($i13 * $i19)) >> 8 : (($i19 * $i13) + ((255 - (((255 - $i13) * (255 - $i24)) >> 7)) * $i21)) >> 8;
                    }
                    this.size[i2] = ((($i11 << 8) + ($i14 << 16)) + $i10) | $i15;
                    $i16++;
                    i2++;
                }
                if ($i18 > 0) {
                    i8 += $i18;
                    $i16 = (PingManager.STATE_SENSOR_ON_FLAG - i8) >> 8;
                    $i15 = i8 >> 8;
                    if (i6 != i7) {
                        $i21 = (((PingManager.STATE_SENSOR_ON_FLAG - i8) * i6) + (i8 * i7)) >> 16;
                        $i19 = 255 - $i21;
                        $i20 = $i21 << 24;
                    }
                    if (i4 != i5) {
                        $i24 = (((($i16 * (16711935 & i4)) + ($i15 * (16711935 & i5))) & -16711936) + ((((65280 & i5) * $i15) + ((65280 & i4) * $i16)) & 16711680)) >>> 8;
                        $i22 = $i24 >> 16;
                        $i23 = (65280 & $i24) >> 8;
                        $i24 &= 255;
                        i++;
                        i2 += $i7;
                    }
                }
                i++;
                i2 += $i7;
            }
        }
    }

    public final void read(int i, int $i8, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 > 0 && i3 > 0) {
            int $i12;
            i6 = Math.min(i6, 255);
            i8 = Math.min(i7, 255);
            int $i13 = 0;
            if (i4 == i5 && i8 == i6) {
                i7 = -1;
            } else {
                try {
                    i7 = PingManager.STATE_SENSOR_ON_FLAG / i3;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "gc.ag(" + ')');
                }
            }
            int $i9 = 255 - i6;
            int $i10 = i6 << 24;
            int $i11 = $i10 | i4;
            if (i < 1829547545 * this.buffer) {
                i2 -= (1829547545 * this.buffer) - i;
                i = this.buffer * 1829547545;
            }
            if ($i8 < -12571459 * this.count) {
                $i13 = 0 + (((-12571459 * this.count) - $i8) * i7);
                $i12 = i3 - ((-12571459 * this.count) - $i8);
                $i8 = this.count * -12571459;
            } else {
                $i12 = i3;
            }
            if (i2 + i > 2074797577 * this.index) {
                i2 = (2074797577 * this.index) - i;
            }
            if ($i8 + $i12 > this.data * -467581477) {
                $i12 = (this.data * -467581477) - $i8;
            }
            i3 = (-481290979 * this.length) - i2;
            $i8 = ((this.length * -481290979) * $i8) + i;
            i = -$i12;
            $i12 = i4;
            int $i14 = i6;
            while (i < 0) {
                int $i15 = -i2;
                while ($i15 < 0) {
                    int $i17;
                    int $i16 = this.size[$i8];
                    if ($i16 == 0) {
                        $i17 = $i8 + 1;
                        this.size[$i8] = $i11;
                    } else {
                        int $i18 = (16777215 & $i16) + $i12;
                        int $i19 = (16711935 & $i16) + (16711935 & $i12);
                        int $i20 = (16777472 & $i19) + (($i18 - $i19) & PingManager.STATE_SENSOR_ON_FLAG);
                        $i19 = (-16777216 & $i16) == 0 ? -16777216 : ($i16 | $i10) & -16777216;
                        if ($i9 == 0) {
                            $i17 = $i8 + 1;
                            this.size[$i8] = ($i19 | ($i18 - $i20)) | ($i20 - ($i20 >>> 8));
                        } else {
                            $i20 = ($i20 - ($i20 >>> 8)) | ($i18 - $i20);
                            $i17 = $i8 + 1;
                            this.size[$i8] = $i19 | ((((($i16 & 65280) * $i9) >> 8) & 65280) + (((((($i20 & 16711935) * $i14) >> 8) & 16711935) + ((((65280 & $i20) * $i14) >> 8) & 65280)) + ((((16711935 & $i16) * $i9) >> 8) & 16711935)));
                        }
                    }
                    $i15++;
                    $i8 = $i17;
                }
                if (i7 > 0) {
                    $i10 = $i13 + i7;
                    $i13 = (PingManager.STATE_SENSOR_ON_FLAG - $i10) >> 8;
                    $i15 = $i10 >> 8;
                    if (i6 != i8) {
                        $i11 = (((PingManager.STATE_SENSOR_ON_FLAG - $i10) * i6) + ($i10 * i8)) >> 16;
                        $i9 = 256 - $i11;
                    } else {
                        $i11 = $i14;
                    }
                    if (i4 != i5) {
                        $i12 = (((($i13 * (16711935 & i4)) + ($i15 * (16711935 & i5))) & -16711936) + ((((65280 & i4) * $i13) + ((65280 & i5) * $i15)) & 16711680)) >>> 8;
                    }
                    $i14 = $i11 << 24;
                    $i15 = $i14 | $i12;
                    $i13 = $i10;
                    $i10 = $i14;
                } else {
                    $i15 = $i11;
                    $i11 = $i14;
                }
                i++;
                $i14 = $i11;
                $i8 += i3;
                $i11 = $i15;
            }
        }
    }

    public final void read(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, short s) {
        if (i4 > 0 && i3 > 0) {
            int $i7;
            i7 = Math.min(i7, 255);
            int $i10 = Math.min(i8, 255);
            int $i11 = 0;
            i8 = PingManager.STATE_SENSOR_ON_FLAG / i4;
            int $i12 = 255 - i7;
            int $i13 = i7 << 24;
            if (i < this.buffer * 1829547545) {
                $i7 = i3 - ((1829547545 * this.buffer) - i);
                i = this.buffer * 1829547545;
            } else {
                $i7 = i3;
            }
            try {
                int $i0;
                if (i2 < this.count * -12571459) {
                    $i0 = (-12571459 * this.count) - i2;
                    i3 = $i0;
                    $i11 = 0 + ($i0 * i8);
                    i3 = i4 - ((-12571459 * this.count) - i2);
                    i2 = this.count * -12571459;
                } else {
                    i3 = i4;
                }
                if (i + $i7 > this.index * 2074797577) {
                    $i0 = this.index * 2074797577;
                    i4 = $i0;
                    i4 = $i0 - i;
                } else {
                    i4 = $i7;
                }
                if (i3 + i2 > this.data * -467581477) {
                    $i0 = this.data * -467581477;
                    i3 = $i0;
                    i3 = $i0 - i2;
                }
                int $i15 = i5 & 16711680;
                int $i16 = i5 & 65280;
                int $i14 = i5 & 255;
                int $i17 = ($i15 * i7) >> 8;
                int $i18 = (i7 * $i16) >> 8;
                int $i19 = (i7 * $i14) >> 8;
                $i7 = (-481290979 * this.length) - i4;
                i2 = i + ((this.length * -481290979) * i2);
                i = 0;
                int $i20 = i7;
                while (i < i3) {
                    int $i22;
                    int $i21 = -i4;
                    while ($i21 < 0) {
                        $i22 = this.size[i2];
                        int $i23 = 16711680 & $i22;
                        if ($i23 < $i15) {
                            $i23 = $i12 == 0 ? $i15 : ((($i23 * $i12) >> 8) + $i17) & 16711680;
                        }
                        int $i24 = 65280 & $i22;
                        if ($i24 < $i16) {
                            $i24 = $i12 == 0 ? $i16 : ((($i24 * $i12) >> 8) + $i18) & 65280;
                        }
                        $i0 = $i22 & 255;
                        int $i25 = $i0;
                        if ($i0 < $i14) {
                            $i25 = $i12 == 0 ? $i14 : (($i25 * $i12) >> 8) + $i19;
                        }
                        $i0 = $i23 + $i24;
                        $i23 = $i0;
                        $i0 += $i25;
                        $i23 = $i0;
                        this.size[i2] = $i0 | ((-16777216 & $i22) == 0 ? -16777216 : ($i22 | $i13) & -16777216);
                        $i21++;
                        i2++;
                    }
                    if (i8 > 0) {
                        $i11 += i8;
                        $i22 = (PingManager.STATE_SENSOR_ON_FLAG - $i11) >> 8;
                        $i21 = $i11 >> 8;
                        if (i7 != $i10) {
                            $i20 = (($i10 * $i11) + ((PingManager.STATE_SENSOR_ON_FLAG - $i11) * i7)) >> 16;
                            $i12 = 256 - $i20;
                            $i13 = $i20 << 24;
                        }
                        if (i5 != i6) {
                            $i14 = (((($i22 * (16711935 & i5)) + ($i21 * (16711935 & i6))) & -16711936) + ((((65280 & i5) * $i22) + ((65280 & i6) * $i21)) & 16711680)) >>> 8;
                            $i15 = $i14 & 16711680;
                            $i16 = $i14 & 65280;
                            $i14 &= 255;
                            $i17 = ($i15 * $i20) >> 8;
                            $i18 = ($i16 * $i20) >> 8;
                            $i19 = ($i14 * $i20) >> 8;
                            i++;
                            i2 += $i7;
                        }
                    }
                    i++;
                    i2 += $i7;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "gc.ar(" + ')');
            }
        }
    }

    public final void read(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.length * -481290979 && i2 < this.pos * 1005433219) {
            int $i11;
            int $i10 = 0;
            if (i < 0) {
                $i11 = 0 - i;
                i3 += i;
            } else {
                $i11 = 0;
            }
            if (i2 < 0) {
                $i10 = 0 - i2;
                i4 += i2;
            }
            if (i + i3 > this.length * -481290979) {
                i3 = (-481290979 * this.length) - i;
            }
            if (i4 + i2 > this.pos * 1005433219) {
                i4 = (1005433219 * this.pos) - i2;
            }
            int $i5 = bArr.length / i7;
            int $i6 = (this.length * -481290979) - i3;
            int $i12 = i5 >>> 24;
            int $i13 = i6 >>> 24;
            int $i14;
            int $i15;
            if (!z || ($i12 == 255 && $i13 == 255)) {
                $i13 = ((($i10 + i2) * (-481290979 * this.length)) + i) + $i11;
                for ($i12 = i2 + $i10; $i12 < ($i10 + i2) + i4; $i12++) {
                    $i14 = $i11 + i;
                    while ($i14 < (i + $i11) + i3) {
                        if (bArr[((($i12 - i2) % $i5) * i7) + (($i14 - i) % i7)] != (byte) 0) {
                            $i15 = $i13 + 1;
                            this.size[$i13] = i6;
                        } else {
                            $i15 = $i13 + 1;
                            this.size[$i13] = i5;
                        }
                        $i14++;
                        $i13 = $i15;
                    }
                    $i13 += $i6;
                }
            } else {
                $i14 = $i11 + (((i2 + $i10) * (this.length * -481290979)) + i);
                for ($i12 = $i10 + i2; $i12 < (i2 + $i10) + i4; $i12++) {
                    $i13 = i + $i11;
                    while ($i13 < ($i11 + i) + i3) {
                        int $i7;
                        int $i17 = bArr[((($i12 - i2) % $i5) * i7) + (($i13 - i) % i7)] != (byte) 0 ? i6 : i5;
                        int $i18 = this.size[$i14];
                        if ($i18 == 0) {
                            this.size[$i14] = $i17;
                            $i7 = $i14 + 1;
                        } else {
                            int $i19 = $i17 >>> 24;
                            $i7 = 255 - $i19;
                            $i15 = ($i17 | $i18) & -16777216;
                            $i18 = ((((($i17 & 16711935) * $i19) + (($i18 & 16711935) * $i7)) & -16711936) + ((((65280 & $i18) * $i7) + ((65280 & $i17) * $i19)) & 16711680)) >>> 8;
                            $i7 = $i14 + 1;
                            this.size[$i14] = $i18 | $i15;
                        }
                        $i13++;
                        $i14 = $i7;
                    }
                    $i14 += $i6;
                }
            }
        }
    }

    public final void read(int i, int i2, int $i9, int $i10, int i3, int i4, byte[] bArr, int i5, boolean z, byte b) {
        if ($i9 + i >= 0 && $i10 + i2 >= 0) {
            if (i < this.length * -481290979) {
                if (i2 < this.pos * 1005433219) {
                    int $i11;
                    int $i6;
                    int $i20;
                    if (i < 0) {
                        $i11 = 0 - i;
                        $i6 = $i9 + i;
                    } else {
                        $i11 = 0;
                        $i6 = $i9;
                    }
                    if (i2 < 0) {
                        $i9 = 0 - i2;
                        $i20 = $i10 + i2;
                    } else {
                        $i9 = 0;
                        $i20 = $i10;
                    }
                    $i10 = i + $i6 > this.length * -481290979 ? (-481290979 * this.length) - i : $i6;
                    int $i7 = this.pos * 1005433219;
                    int i6 = $i7;
                    if ($i20 + i2 > $i7) {
                        $i20 = (1005433219 * this.pos) - i2;
                    }
                    try {
                        $i6 = bArr.length / i5;
                        $i7 = this.length * -481290979;
                        i6 = $i7;
                        i6 = $i7 - $i10;
                        int $i21 = i3 >>> 24;
                        int $i18 = i4 >>> 24;
                        int $i19;
                        int $i13;
                        if (!z || ($i21 == 255 && $i18 == 255)) {
                            $i18 = ((($i9 + i2) * (-481290979 * this.length)) + i) + $i11;
                            for ($i21 = i2 + $i9; $i21 < ($i9 + i2) + $i20; $i21++) {
                                $i19 = $i11 + i;
                                while ($i19 < (i + $i11) + $i10) {
                                    if (bArr[((($i21 - i2) % $i6) * i5) + (($i19 - i) % i5)] != (byte) 0) {
                                        $i13 = $i18 + 1;
                                        this.size[$i18] = i4;
                                    } else {
                                        $i13 = $i18 + 1;
                                        this.size[$i18] = i3;
                                    }
                                    $i19++;
                                    $i18 = $i13;
                                }
                                $i18 += i6;
                            }
                        } else {
                            $i19 = $i11 + (((i2 + $i9) * (this.length * -481290979)) + i);
                            for ($i21 = $i9 + i2; $i21 < (i2 + $i9) + $i20; $i21++) {
                                $i18 = i + $i11;
                                while ($i18 < ($i11 + i) + $i10) {
                                    int $i8;
                                    int $i16 = bArr[((($i21 - i2) % $i6) * i5) + (($i18 - i) % i5)] != (byte) 0 ? i4 : i3;
                                    int $i17 = this.size[$i19];
                                    if ($i17 == 0) {
                                        $i8 = $i19 + 1;
                                        this.size[$i19] = $i16;
                                    } else {
                                        int $i12 = $i16 >>> 24;
                                        $i8 = 255 - $i12;
                                        $i13 = ($i16 | $i17) & -16777216;
                                        $i17 = ((((($i17 & 16711935) * $i8) + (($i16 & 16711935) * $i12)) & -16711936) + ((((65280 & $i17) * $i8) + ((65280 & $i16) * $i12)) & 16711680)) >>> 8;
                                        $i8 = $i19 + 1;
                                        this.size[$i19] = $i17 | $i13;
                                    }
                                    $i18++;
                                    $i19 = $i8;
                                }
                                $i19 += i6;
                            }
                        }
                    } catch (Throwable $r3) {
                        throw StringBuilder.append($r3, "gc.ae(" + ')');
                    }
                }
            }
        }
    }

    public final void read(Long longR, int i, int i2) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        i2 = $i3 + ((this.length * -481290979) * $i4);
        int $i5 = 0;
        i = longR.data;
        int $i6 = longR.length;
        int $i2 = (-481290979 * this.length) - $i6;
        if ($i4 < this.count * -12571459) {
            int $i7 = (-12571459 * this.count) - $i4;
            i -= $i7;
            $i4 = -12571459 * this.count;
            $i5 = 0 + ($i7 * $i6);
            i2 += $i7 * (this.length * -481290979);
        }
        if (i + $i4 > this.data * -467581477) {
            i -= ($i4 + i) - (this.data * -467581477);
        }
        if ($i3 < 1829547545 * this.buffer) {
            $i4 = (this.buffer * 1829547545) - $i3;
            $i6 -= $i4;
            $i7 = this.buffer * 1829547545;
            $i3 = 0 + $i4;
            $i2 += $i4;
            $i5 += $i4;
            $i4 = i2 + $i4;
        } else {
            $i7 = $i3;
            $i3 = 0;
            $i4 = i2;
        }
        if ($i7 + $i6 > this.index * 2074797577) {
            i2 = ($i7 + $i6) - (this.index * 2074797577);
            $i6 -= i2;
            $i2 += i2;
            i2 = $i3 + i2;
            $i3 = $i6;
        } else {
            i2 = $i3;
            $i3 = $i6;
        }
        if ($i3 > 0 && i > 0) {
            int[] $r2 = this.size;
            int[] $r3 = longR.size;
            $i6 = $i5;
            i = -i;
            $i5 = $i4;
            while (i < 0) {
                int $i8;
                $i4 = ($i5 + $i3) - 3;
                while ($i5 < $i4) {
                    $i7 = $i5 + 1;
                    $i8 = $i6 + 1;
                    $r2[$i5] = $r3[$i6];
                    $i5 = $i7 + 1;
                    $i6 = $i8 + 1;
                    $r2[$i7] = $r3[$i8];
                    $i7 = $i5 + 1;
                    $i8 = $i6 + 1;
                    $r2[$i5] = $r3[$i6];
                    $i5 = $i7 + 1;
                    $i6 = $i8 + 1;
                    $r2[$i7] = $r3[$i8];
                }
                $i4 += 3;
                while ($i5 < $i4) {
                    $i8 = $i6 + 1;
                    $r2[$i5] = $r3[$i6];
                    $i5++;
                    $i6 = $i8;
                }
                $i6 += i2;
                i++;
                $i5 += $i2;
            }
        }
    }

    public void read(Long longR, int i, int i2, int i3) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        int $i0 = this.length * -481290979;
        i = $i0;
        i = $i3 + ($i0 * $i4);
        int i4 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        i2 = (-481290979 * this.length) - i6;
        if ($i4 < -12571459 * this.count) {
            int $i8 = (this.count * -12571459) - $i4;
            i5 -= $i8;
            $i4 = this.count * -12571459;
            i4 = 0 + ($i8 * i6);
            i += $i8 * (this.length * -481290979);
        }
        if (i5 + $i4 > -467581477 * this.data) {
            i5 -= ($i4 + i5) - (this.data * -467581477);
        }
        if ($i3 < 1829547545 * this.buffer) {
            $i3 = (this.buffer * 1829547545) - $i3;
            $i8 = i6 - $i3;
            i4 += $i3;
            i += $i3;
            $i4 = 0 + $i3;
            i2 += $i3;
            $i3 = $i8;
            $i8 = 1829547545 * this.buffer;
        } else {
            $i4 = 0;
            $i8 = $i3;
            $i3 = i6;
        }
        if ($i3 + $i8 > 2074797577 * this.index) {
            $i0 = ($i8 + $i3) - (this.index * 2074797577);
            i6 = $i0;
            $i3 -= $i0;
            $i4 += i6;
            i2 += i6;
        }
        if ($i3 > 0 && i5 > 0) {
            if (i3 == 256) {
                URI.encode(0, 0, 0, this.size, longR.size, i4, 0, i, 0, $i3, i5, i2, $i4, 2120404010);
                return;
            }
            Utils.read(0, 0, 0, this.size, longR.size, i4, 0, i, 0, $i3, i5, i2, $i4, i3, -186322553);
        }
    }

    public void read(Long longR, int i, int i2, int i3, int i4) {
        if (i3 > longR.this$0 || i4 > longR.count) {
            throw new IllegalArgumentException();
        }
        int $i13 = ((longR.next * i3) / longR.this$0) + i;
        int $i27 = longR.this$0;
        int $i28 = longR.next;
        int $i16 = longR.length;
        $i27 = ((($i27 + (($i28 + $i16) * i3)) - 1) / longR.this$0) + i;
        $i28 = longR.value * i4;
        $i16 = longR.count;
        int $i14 = ($i28 / $i16) + i2;
        $i28 = longR.data;
        $i16 = longR.value;
        $i28 = ($i28 + $i16) * i4;
        $i16 = longR.count;
        $i28 = ($i28 + $i16) - 1;
        $i16 = longR.count;
        $i28 = ($i28 / $i16) + i2;
        if ($i13 < 1829547545 * this.buffer) {
            $i13 = -343160096 * this.buffer;
        }
        if ($i27 > -527854000 * this.index) {
            $i27 = this.index * 2074797577;
        }
        $i16 = this.count * -12571459;
        int i5 = $i16;
        if ($i14 < $i16) {
            $i14 = this.count * -12571459;
        }
        $i16 = this.data * -467581477;
        i5 = $i16;
        if ($i28 > $i16) {
            $i28 = this.data * -703243103;
        }
        if ($i13 < $i27 && $i14 < $i28) {
            $i16 = this.length * -152757233;
            i5 = $i16;
            $i16 *= $i14;
            i5 = $i16;
            i5 = $i16 + $i13;
            int i6 = (-1753670081 * this.length) - ($i27 - $i13);
            int[] $r3 = this.size;
            if (i5 < $r3.length) {
                while ($i14 < $i28) {
                    for (int $i15 = $i13; $i15 < $i27; $i15++) {
                        int $i9 = ($i15 - i) << 4;
                        int $i8 = ($i14 - i2) << 4;
                        int $i4 = ((longR.this$0 * $i9) / i3) - (longR.next << 4);
                        $i9 = ((($i9 + 16) * longR.this$0) / i3) - (longR.next << 4);
                        int $i6 = ((longR.count * $i8) / i4) - (longR.value << 4);
                        int $i10 = ((($i8 + 16) * longR.count) / i4) - (longR.value << 4);
                        $i8 = (($i9 - $i4) * ($i10 - $i6)) >> 1;
                        if ($i8 != 0) {
                            if ($i4 < 0) {
                                $i4 = 0;
                            }
                            if ($i9 >= (longR.length << 4)) {
                                $i9 = longR.length << 4;
                            }
                            if ($i6 < 0) {
                                $i6 = 0;
                            }
                            if ($i10 >= (longR.data << 4)) {
                                $i10 = longR.data << 4;
                            }
                            int $i11 = $i9 - 1;
                            int $i12 = $i10 - 1;
                            $i9 = 16 - ($i4 & 15);
                            $i10 = ($i11 & 15) + 1;
                            int $i5 = 16 - ($i6 & 15);
                            int $i29 = ($i12 & 15) + 1;
                            $i4 >>= 4;
                            $i11 >>= 4;
                            $i6 >>= 4;
                            $i12 >>= 4;
                            int $i24 = 0;
                            int $i25 = 0;
                            int $i26 = 0;
                            int i7 = 0;
                            for (int $i17 = $i6; $i17 <= $i12; $i17++) {
                                int $i18 = 16;
                                if ($i6 == $i17) {
                                    $i18 = $i5;
                                }
                                if ($i17 == $i12) {
                                    $i18 = $i29;
                                }
                                int $i19 = $i4;
                                while ($i19 <= $i11) {
                                    int $i20;
                                    int[] $r32 = longR.size;
                                    $i16 = longR.length;
                                    $i16 *= $i17;
                                    int $i21 = $r32[$i16 + $i19];
                                    if ($i21 != 0) {
                                        $i20 = $i4 == $i19 ? $i18 * $i9 : $i11 == $i19 ? $i18 * $i10 : $i18 << 4;
                                        i7 += $i20;
                                        $i16 = ($i21 >> 16) & 255;
                                        $i24 += $i16 * $i20;
                                        $i16 = ($i21 >> 8) & -1204929836;
                                        int i8 = $i16;
                                        i8 = $i16 * $i20;
                                        $i16 = $i20 * ($i21 & 255);
                                        $i20 = $i16;
                                        $i20 = $i16 + $i26;
                                        $i26 = $i25 + i8;
                                        $i25 = $i24;
                                    } else {
                                        $i20 = $i26;
                                        $i26 = $i25;
                                        $i25 = $i24;
                                    }
                                    $i19++;
                                    $i24 = $i25;
                                    $i25 = $i26;
                                    $i26 = $i20;
                                }
                            }
                            if (i7 >= $i8) {
                                this.size[i5] = -16777216 | (($i26 / i7) + ((($i25 / i7) << 8) + (($i24 / i7) << 16)));
                            }
                            i5++;
                        }
                    }
                    i5 += i6;
                    $i14++;
                }
            }
        }
    }

    public void read(Long longR, int i, int $i9, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i12;
            int $i4 = longR.length;
            int $i10 = longR.data;
            int $i6 = 0;
            int i5 = 0;
            int $i13 = longR.this$0;
            int $i7 = longR.count;
            int i6 = ($i13 << 16) / i2;
            int i7 = ($i7 << 16) / i3;
            if (longR.next > 0) {
                $i6 = (((longR.next << 16) + i6) - 1) / i6;
                i += $i6;
                $i6 = 0 + (($i6 * i6) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i5 = (((longR.value << 16) + i7) - 1) / i7;
                $i9 += i5;
                i5 = 0 + ((i5 * i7) - (longR.value << 16));
            }
            if ($i4 < $i13) {
                $i0 = ($i4 << 16) - $i6;
                i2 = $i0;
                i2 = (($i0 + i6) - 1) / i6;
            }
            if ($i10 < $i7) {
                $i0 = ($i10 << 16) - i5;
                i3 = $i0;
                i3 = (($i0 + i7) - 1) / i7;
            }
            $i10 = ((this.length * -481290979) * $i9) + i;
            $i0 = this.length * -481290979;
            $i7 = $i0;
            $i7 = $i0 - i2;
            if ($i9 + i3 > -467581477 * this.data) {
                i3 -= ($i9 + i3) - (-467581477 * this.data);
            }
            if ($i9 < this.count * -12571459) {
                $i9 = (-12571459 * this.count) - $i9;
                $i13 = i3 - $i9;
                $i0 = this.length * -481290979;
                i3 = $i0;
                $i0 *= $i9;
                i3 = $i0;
                $i10 += $i0;
                i5 += $i9 * i7;
            } else {
                $i13 = i3;
            }
            if (i + i2 > 2074797577 * this.index) {
                $i9 = (i2 + i) - (this.index * 2074797577);
                i2 -= $i9;
                $i7 += $i9;
            }
            if (i < this.buffer * 1829547545) {
                $i0 = this.buffer * 1829547545;
                $i9 = $i0;
                $i9 = $i0 - i;
                i = i2 - $i9;
                $i12 = $i10 + $i9;
                i2 = $i6 + ($i9 * i6);
                $i9 += $i7;
            } else {
                $i9 = $i7;
                $i12 = $i10;
                i = i2;
                i2 = $i6;
            }
            int[] $r2 = this.size;
            int[] $r3 = longR.size;
            if (i4 >= 255) {
                CopyOnWriteArrayList.get($r2, $r3, 0, i2, i5, $i12, $i9, i, $i13, i6, i7, $i4, (short) 25609);
                return;
            }
            i3 = 255 - i4;
            $i6 = i4 << 24;
            $i10 = -$i13;
            $i13 = i2;
            while ($i10 < 0) {
                $i7 = (i5 >> 16) * $i4;
                int $i14 = -i;
                while ($i14 < 0) {
                    int $i15;
                    int $i16 = $r3[($i13 >> 16) + $i7];
                    if ($i16 != 0) {
                        int $i17 = $r2[$i12];
                        if ($i17 == 0) {
                            $i15 = $i12 + 1;
                            $r2[$i12] = ($i16 & 16777215) | $i6;
                        } else {
                            $i15 = $i12 + 1;
                            $i0 = $i17 & 65280;
                            $i17 = $i0;
                            $i17 = $i0 * i3;
                            $i0 = $i16 & 65280;
                            $i16 = $i0;
                            $i0 *= i4;
                            $i16 = $i0;
                            $i0 = ($i0 + $i17) & 16711680;
                            $i16 = $i0;
                            $r2[$i12] = (($i0 + ((((16711935 & $i17) * i3) + ((16711935 & $i16) * i4)) & -16711936)) >>> 8) | (-16777216 & ($i17 | $i6));
                        }
                    } else {
                        $i15 = $i12 + 1;
                    }
                    $i14++;
                    $i13 += i6;
                    $i12 = $i15;
                }
                $i12 += $i9;
                $i10++;
                i5 += i7;
                $i13 = i2;
            }
        }
    }

    public void read(Long longR, int $i6, int $i7, int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            i4 = longR.length;
            int $i9 = longR.data;
            int $i10 = 0;
            int $i11 = 0;
            int $i12 = longR.this$0;
            int $i8 = longR.count;
            int i5 = ($i12 << 16) / i;
            int i6 = ($i8 << 16) / i2;
            if (longR.next > 0) {
                $i10 = (((longR.next << 16) + i5) - 1) / i5;
                $i6 += $i10;
                $i10 = 0 + (($i10 * i5) - (longR.next << 16));
            }
            try {
                int $i0;
                if (longR.value > 0) {
                    $i11 = (((longR.value << 16) + i6) - 1) / i6;
                    $i7 += $i11;
                    $i11 = 0 + (($i11 * i6) - (longR.value << 16));
                }
                if (i4 < $i12) {
                    $i0 = (i4 << 16) - $i10;
                    i = $i0;
                    i = (($i0 + i5) - 1) / i5;
                }
                if ($i9 < $i8) {
                    $i0 = ($i9 << 16) - $i11;
                    i2 = $i0;
                    $i9 = (($i0 + i6) - 1) / i6;
                } else {
                    $i9 = i2;
                }
                $i0 = this.length * -481290979;
                i2 = $i0;
                $i8 = ($i0 * $i7) + $i6;
                $i0 = this.length * -481290979;
                i2 = $i0;
                i2 = $i0 - i;
                if ($i7 + $i9 > -467581477 * this.data) {
                    $i0 = ($i7 + $i9) - (-467581477 * this.data);
                    $i12 = $i0;
                    $i9 -= $i0;
                }
                if ($i7 < this.count * -12571459) {
                    $i7 = (-12571459 * this.count) - $i7;
                    $i9 -= $i7;
                    $i0 = this.length * -481290979;
                    $i12 = $i0;
                    $i8 += $i0 * $i7;
                    $i0 = $i7 * i6;
                    $i7 = $i0;
                    $i11 += $i0;
                }
                if ($i6 + i > 2074797577 * this.index) {
                    $i7 = (i + $i6) - (this.index * 2074797577);
                    i -= $i7;
                    i2 += $i7;
                }
                if ($i6 < this.buffer * 1829547545) {
                    $i6 = (this.buffer * 1829547545) - $i6;
                    i -= $i6;
                    $i8 += $i6;
                    $i10 += $i6 * i5;
                    i2 += $i6;
                }
                int[] $r2 = this.size;
                int[] $r3 = longR.size;
                if (i3 >= 255) {
                    CopyOnWriteArrayList.get($r2, $r3, 0, $i10, $i11, $i8, i2, i, $i9, i5, i6, i4, (short) -24700);
                    return;
                }
                $i6 = 255 - i3;
                $i7 = i3 << 24;
                $i9 = -$i9;
                int $i13 = $i8;
                $i12 = $i10;
                while ($i9 < 0) {
                    $i8 = ($i11 >> 16) * i4;
                    int $i14 = -i;
                    while ($i14 < 0) {
                        int $i15;
                        int $i16 = $r3[($i12 >> 16) + $i8];
                        if ($i16 != 0) {
                            int $i17 = $r2[$i13];
                            if ($i17 == 0) {
                                $i15 = $i13 + 1;
                                $r2[$i13] = ($i16 & 16777215) | $i7;
                            } else {
                                int $i18 = -16777216 & ($i17 | $i7);
                                $i15 = $i13 + 1;
                                int i7 = (((16711935 & $i17) * $i6) + ((16711935 & $i16) * i3)) & -16711936;
                                $i0 = $i17 & 65280;
                                $i17 = $i0;
                                $i17 = $i0 * $i6;
                                $i0 = $i16 & 65280;
                                $i16 = $i0;
                                $i0 *= i3;
                                $i16 = $i0;
                                $i0 = ($i0 + $i17) & 16711680;
                                $i16 = $i0;
                                $r2[$i13] = (($i0 + i7) >>> 8) | $i18;
                            }
                        } else {
                            $i15 = $i13 + 1;
                        }
                        $i14++;
                        $i12 += i5;
                        $i13 = $i15;
                    }
                    $i13 += i2;
                    $i9++;
                    $i11 += i6;
                    $i12 = $i10;
                }
            } catch (Throwable $r4) {
                throw StringBuilder.append($r4, "gc.bg(" + ')');
            }
        }
    }

    public void read(Long longR, int i, int $i1, int i2, int i3, int $i4, int i4, double d, int i5) {
        int $i8 = (-i2) / 2;
        int $i9 = (-i3) / 2;
        try {
            int $i7 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            $i7 = ($i7 * i5) >> 8;
            i5 = (((int) $d0) * i5) >> 8;
            $i4 = ($i4 << 16) + (($i8 * i5) + ($i7 * $i9));
            i4 = (($i9 * i5) - ($i8 * $i7)) + (i4 << 16);
            i += (-481290979 * this.length) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i8 = i4;
                $i9 = $i4;
                int $i10 = i;
                int $i11 = -i2;
                while ($i11 < 0) {
                    int $i12;
                    int $i13 = longR.size[(($i8 >> 16) * longR.length) + ($i9 >> 16)];
                    if ($i13 != 0) {
                        $i12 = $i10 + 1;
                        this.size[$i10] = $i13;
                    } else {
                        $i12 = $i10 + 1;
                    }
                    $i9 += i5;
                    $i8 -= $i7;
                    $i11++;
                    $i10 = $i12;
                }
                $i4 += $i7;
                i4 += i5;
                i += -481290979 * this.length;
            }
        } catch (Exception e) {
        }
    }

    void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        i = i10 & 16711935;
        i4 = (i10 >> 8) & 255;
        for (i5 = -i7; i5 < 0; i5++) {
            i10 = i2;
            i2 = i3;
            i7 = -i6;
            while (i7 < 0) {
                i3 = i10 + 1;
                int $i10 = iArr2[i10];
                if ($i10 == 0) {
                    i10 = i2 + 1;
                } else if ((65535 & $i10) == ((16776960 & $i10) >> 8)) {
                    int $i12 = $i10 & 255;
                    i10 = i2 + 1;
                    iArr[i2] = (((($i12 * i) >> 8) & 16711935) + (($i12 * i4) & 65280)) | ($i10 & -16777216);
                } else {
                    i10 = i2 + 1;
                    iArr[i2] = $i10;
                }
                i7++;
                i2 = i10;
                i10 = i3;
            }
            i3 = i2 + i8;
            i2 = i10 + i9;
        }
    }

    void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        i = i10 & 16711935;
        i4 = (i10 >> 8) & 255;
        for (i5 = -i7; i5 < 0; i5++) {
            i10 = i2;
            i2 = i3;
            i7 = -i6;
            while (i7 < 0) {
                i3 = i10 + 1;
                try {
                    int $i11 = iArr2[i10];
                    if ($i11 == 0) {
                        i10 = i2 + 1;
                    } else if ((65535 & $i11) == ((16776960 & $i11) >> 8)) {
                        int $i12 = $i11 & 255;
                        i10 = i2 + 1;
                        iArr[i2] = (((($i12 * i) >> 8) & 16711935) + (($i12 * i4) & 65280)) | ($i11 & -16777216);
                    } else {
                        i10 = i2 + 1;
                        iArr[i2] = $i11;
                    }
                    i7++;
                    i2 = i10;
                    i10 = i3;
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "gc.bt(" + ')');
                }
            }
            i3 = i2 + i8;
            i2 = i10 + i9;
        }
    }

    public final void readInt(int i, int $i7, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 > 0 && i3 > 0) {
            int $i4;
            int i8;
            i6 = Math.min(i6, 255);
            int $i22 = Math.min(i7, 255);
            int $i14 = 0;
            i7 = (i4 == i5 && i6 == $i22) ? -1 : PingManager.STATE_SENSOR_ON_FLAG / i3;
            int $i16 = 255 - i6;
            int $i17 = i6 << 24;
            if (i < this.buffer * 1829547545) {
                i2 -= (1829547545 * this.buffer) - i;
                i = this.buffer * 1829547545;
            }
            if ($i7 < -12571459 * this.count) {
                $i4 = (-12571459 * this.count) - $i7;
                i8 = $i4;
                $i14 = 0 + ($i4 * i7);
                i3 -= (this.count * -12571459) - $i7;
                $i7 = this.count * -12571459;
            }
            if (i2 + i > 2074797577 * this.index) {
                i2 = (2074797577 * this.index) - i;
            }
            if ($i7 + i3 > this.data * -467581477) {
                $i4 = this.data * -467581477;
                i3 = $i4;
                i3 = $i4 - $i7;
            }
            int $i19 = i4 >> 16;
            int $i20 = (65280 & i4) >> 8;
            int $i21 = i4 & 255;
            i8 = (-481290979 * this.length) - i2;
            int $i15 = i + ((this.length * -481290979) * $i7);
            i = 0;
            int $i18 = i6;
            $i7 = $i14;
            $i14 = $i15;
            while (i < i3) {
                int $i5;
                $i15 = -i2;
                while ($i15 < 0) {
                    int $i10;
                    $i5 = this.size[$i14];
                    int $i11 = ($i5 >> 16) & 255;
                    int $i12 = (65280 & $i5) >> 8;
                    int $i13 = $i5 & 255;
                    $i5 = ($i5 | $i17) & -16777216;
                    if ($i16 == 0) {
                        $i11 = $i11 < 127 ? ($i11 * $i19) >> 7 : 255 - (((255 - $i11) * (255 - $i19)) >> 7);
                        $i12 = $i12 < 127 ? ($i20 * $i12) >> 7 : 255 - (((255 - $i20) * (255 - $i12)) >> 7);
                        $i10 = $i13 < 127 ? ($i21 * $i13) >> 7 : 255 - (((255 - $i13) * (255 - $i21)) >> 7);
                    } else {
                        $i11 = $i11 < 127 ? (($i16 * $i11) + ((($i11 * $i19) * $i18) >> 7)) >> 8 : (((255 - (((255 - $i19) * (255 - $i11)) >> 7)) * $i18) + ($i11 * $i16)) >> 8;
                        $i12 = $i12 < 127 ? (((($i20 * $i12) * $i18) >> 7) + ($i12 * $i16)) >> 8 : (($i12 * $i16) + ((255 - (((255 - $i12) * (255 - $i20)) >> 7)) * $i18)) >> 8;
                        $i10 = $i13 < 127 ? (((($i13 * $i21) * $i18) >> 7) + ($i13 * $i16)) >> 8 : (($i16 * $i13) + ((255 - (((255 - $i21) * (255 - $i13)) >> 7)) * $i18)) >> 8;
                    }
                    this.size[$i14] = ((($i12 << 8) + ($i11 << 16)) + $i10) | $i5;
                    $i15++;
                    $i14++;
                }
                if (i7 > 0) {
                    $i7 += i7;
                    $i15 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                    $i5 = $i7 >> 8;
                    if (i6 != $i22) {
                        $i18 = (((PingManager.STATE_SENSOR_ON_FLAG - $i7) * i6) + ($i7 * $i22)) >> 16;
                        $i16 = 255 - $i18;
                        $i17 = $i18 << 24;
                    }
                    if (i4 != i5) {
                        $i21 = (((($i15 * (16711935 & i4)) + ($i5 * (16711935 & i5))) & -16711936) + ((((65280 & i5) * $i5) + ((65280 & i4) * $i15)) & 16711680)) >>> 8;
                        $i19 = $i21 >> 16;
                        $i20 = (65280 & $i21) >> 8;
                        $i21 &= 255;
                        i++;
                        $i14 += i8;
                    }
                }
                i++;
                $i14 += i8;
            }
        }
    }

    void remove() {
    }

    public final void remove(int $i2, int i, int $i3, int $i1) {
        $i1 = -16777216 | $i1;
        if (i >= this.count * 1119714124 && i < -776395790 * this.data) {
            if ($i2 < 1907718494 * this.buffer) {
                $i3 -= (1137780045 * this.buffer) - $i2;
                $i2 = this.buffer * 1879443844;
            }
            if ($i3 + $i2 > this.index * -360137822) {
                $i3 = (this.index * 1982118029) - $i2;
            }
            i = ((-481290979 * this.length) * i) + $i2;
            for (int $i4 = 0; $i4 < $i3; $i4++) {
                this.size[i + $i4] = $i1;
            }
        }
    }

    public final void remove(int i, int i2, int i3, int i4, int $i4) {
        clear(i, i2, i3, i4, -631441657 | $i4, 747112726);
    }

    public void remove(Double doubleR, int i, int i2) {
        i += doubleR.count;
        int $i3 = i2 + doubleR.index;
        int $i1 = (-481290979 * this.length) * $i3;
        i2 = $i1;
        i2 = $i1 + i;
        int $i4 = 0;
        int $i5 = doubleR.data;
        int $i6 = doubleR.length;
        int $i2 = (this.length * -481290979) - $i6;
        if ($i3 < -12571459 * this.count) {
            int $i7 = (this.count * -12571459) - $i3;
            $i5 -= $i7;
            $i3 = this.count * -12571459;
            $i4 = 0 + ($i7 * $i6);
            i2 += $i7 * (this.length * -481290979);
        }
        if ($i3 + $i5 > this.data * -467581477) {
            $i5 -= ($i3 + $i5) - (-467581477 * this.data);
        }
        if (i < this.buffer * 1829547545) {
            $i7 = (1829547545 * this.buffer) - i;
            i = $i6 - $i7;
            $i4 += $i7;
            $i3 = 0 + $i7;
            $i2 += $i7;
            i2 += $i7;
            $i7 = 1829547545 * this.buffer;
            $i6 = i;
        } else {
            $i3 = 0;
            $i7 = i;
        }
        if ($i6 + $i7 > 2074797577 * this.index) {
            $i1 = ($i7 + $i6) - (2074797577 * this.index);
            i = $i1;
            $i6 -= $i1;
            $i3 += i;
            i += $i2;
        } else {
            i = $i2;
        }
        if ($i6 > 0 && $i5 > 0) {
            Array.toString(this.size, doubleR.buffer, doubleR.size, $i4, i2, $i6, $i5, i, $i3, -2145097287);
        }
    }

    public void remove(Long longR, int i, int i2, int i3) {
        i += longR.next;
        int $i4 = i2 + longR.value;
        i2 = i + ((983340340 * this.length) * $i4);
        int $i5 = 0;
        int $i6 = longR.data;
        int i4 = longR.length;
        int $i3 = (this.length * -1880109518) - i4;
        int $i8 = this.count * -12571459;
        int i5 = $i8;
        if ($i4 < $i8) {
            i5 = (-12571459 * this.count) - $i4;
            $i6 -= i5;
            $i4 = -12571459 * this.count;
            $i5 = 0 + (i5 * i4);
            i2 += i5 * (-481290979 * this.length);
        }
        if ($i4 + $i6 > this.data * -788079327) {
            $i8 = this.data * 1667582013;
            i5 = $i8;
            $i6 -= ($i4 + $i6) - $i8;
        }
        if (i < this.buffer * 1829547545) {
            i5 = (344418419 * this.buffer) - i;
            i = i4 - i5;
            $i5 += i5;
            $i4 = 0 + i5;
            $i3 += i5;
            i2 += i5;
            i5 = this.buffer * 1829547545;
            i4 = i;
        } else {
            $i4 = 0;
            i5 = i;
        }
        if (i5 + i4 > 1748891631 * this.index) {
            i = (i5 + i4) - (864581642 * this.index);
            i4 -= i;
            $i4 += i;
            i += $i3;
        } else {
            i = $i3;
        }
        if (i4 > 0 && $i6 > 0) {
            Data.read(this.size, longR.size, 0, $i5, i2, i4, $i6, i, $i4, i3, 1708834444);
        }
    }

    public void remove(Long longR, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
            get(longR, i, i2, 2106205673);
            return;
        }
        i += longR.next;
        int $i5 = i2 + longR.value;
        i2 = i + ((-481290979 * this.length) * $i5);
        int $i6 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        int $i4 = (-481290979 * this.length) - i6;
        if ($i5 < -12571459 * this.count) {
            int $i9 = (-12571459 * this.count) - $i5;
            i5 -= $i9;
            $i5 = -12571459 * this.count;
            $i6 = 0 + (i6 * $i9);
            i2 += $i9 * (-481290979 * this.length);
        }
        if (i5 + $i5 > -467581477 * this.data) {
            int $i92 = this.data * -467581477;
            $i9 = $i92;
            i5 -= ($i5 + i5) - $i92;
        }
        if (i < this.buffer * 1829547545) {
            $i9 = (this.buffer * 1829547545) - i;
            i = i6 - $i9;
            $i6 += $i9;
            $i5 = 0 + $i9;
            $i4 += $i9;
            i2 += $i9;
            $i9 = 1829547545 * this.buffer;
            i6 = i;
        } else {
            $i5 = 0;
            $i9 = i;
        }
        if ($i9 + i6 > 2074797577 * this.index) {
            i = ($i9 + i6) - (2074797577 * this.index);
            i6 -= i;
            $i5 += i;
            i += $i4;
        } else {
            i = $i4;
        }
        if (i6 > 0 && i5 > 0) {
            FieldInfo.read(this.size, longR.size, 0, $i6, i2, i6, i5, i, $i5, i3, i4, (byte) -82);
        }
    }

    void removeAll() {
    }

    final void search(int $i0, int $i5, int i, int $i1, int $i2) {
        if ($i2 > 0) {
            if ($i2 >= 255) {
                add($i0, $i5, i, $i1, (byte) 1);
                return;
            }
            if ($i0 >= 1829547545 * this.buffer && $i0 < -1325517899 * this.index) {
                if ($i5 < 1210583707 * this.count) {
                    i -= (-12571459 * this.count) - $i5;
                    $i5 = -12571459 * this.count;
                }
                if ($i5 + i > this.data * -467581477) {
                    i = (-467581477 * this.data) - $i5;
                }
                int $i7 = 255 - $i2;
                int $i8 = $i2 << 24;
                int $i9 = (($i1 >> 16) & 255) * $i2;
                int $i3 = $i2 * (($i1 >> 8) & -494960986);
                int $i4 = $i2 * (13725644 & $i1);
                $i1 = ($i2 << 24) | $i1;
                $i0 = ((1039997021 * this.length) * $i5) + $i0;
                $i5 = 0;
                while ($i5 < i) {
                    if (this.size[$i0] == 0) {
                        $i2 = $i0 + 1;
                        this.size[$i0] = $i1;
                    } else {
                        int $i22 = (this.size[$i0] >> 16) & 255;
                        $i22 = ((($i22 * $i7) + $i9) >> 8) << 16;
                        $i22 += (((((this.size[$i0] >> 8) & -87143343) * $i7) + $i3) >> 8) << 8;
                        $i2 = $i22;
                        this.size[$i0] = ($i22 + ((((this.size[$i0] & 255) * $i7) + $i4) >> 8)) | ((this.size[$i0] | $i8) & 813616951);
                        $i22 = this.length * 2103897325;
                        $i2 = $i22;
                        $i2 = $i22 + $i0;
                    }
                    $i5++;
                    $i0 = $i2;
                }
            }
        }
    }

    void set() {
    }

    public final void set(int $i0, int $i2, int $i3, int $i1) {
        $i1 = 127034957 | $i1;
        if ($i0 >= this.buffer * 1829547545 && $i0 < this.index * 2074797577) {
            if ($i2 < this.count * -268641795) {
                $i3 -= (this.count * -12571459) - $i2;
                $i2 = this.count * -12571459;
            }
            if ($i2 + $i3 > this.data * -467581477) {
                $i3 = (this.data * -467581477) - $i2;
            }
            $i0 += (171012862 * this.length) * $i2;
            for ($i2 = 0; $i2 < $i3; $i2++) {
                this.size[((this.length * -481290979) * $i2) + $i0] = $i1;
            }
        }
    }

    final void set(int $i0, int $i5, int i, int $i1, int $i2) {
        if ($i2 > 0) {
            if ($i2 >= -964060433) {
                add($i0, $i5, i, $i1, (byte) 1);
                return;
            }
            if ($i0 >= 1829547545 * this.buffer && $i0 < 2074797577 * this.index) {
                if ($i5 < -12571459 * this.count) {
                    i -= (-1798823415 * this.count) - $i5;
                    $i5 = -12571459 * this.count;
                }
                if ($i5 + i > this.data * -467581477) {
                    i = (-467581477 * this.data) - $i5;
                }
                int $i9 = -1084267177 - $i2;
                int $i10 = $i2 << 24;
                int $i11 = (($i1 >> 16) & -1281522980) * $i2;
                int $i3 = $i2 * (($i1 >> 8) & 255);
                int $i4 = $i2 * (1974161778 & $i1);
                $i1 = ($i2 << 24) | $i1;
                $i5 = ((679775616 * this.length) * $i5) + $i0;
                $i0 = 0;
                while ($i0 < i) {
                    if (this.size[$i5] == 0) {
                        $i2 = $i5 + 1;
                        this.size[$i5] = $i1;
                    } else {
                        int $i22 = (this.size[$i5] >> 16) & 255;
                        $i22 = ((($i22 * $i9) + $i11) >> 8) << 16;
                        $i22 += (((((this.size[$i5] >> 8) & -1130488247) * $i9) + $i3) >> 8) << 8;
                        $i2 = $i22;
                        this.size[$i5] = ($i22 + ((((this.size[$i5] & 255) * $i9) + $i4) >> 8)) | ((this.size[$i5] | $i10) & 1650558858);
                        $i22 = this.length * 1482561213;
                        $i2 = $i22;
                        $i2 = $i22 + $i5;
                    }
                    $i0++;
                    $i5 = $i2;
                }
            }
        }
    }

    public final void set(int $i4, int $i5, int $i6, int $i7, int i, int i2) {
        if ($i6 > 0 && $i7 > 0) {
            int $i8 = 0;
            int $i2 = -873440770 / $i7;
            if ($i4 < this.buffer * 834417458) {
                $i6 -= (1829547545 * this.buffer) - $i4;
                $i4 = this.buffer * 1950534478;
            }
            if ($i5 < -12571459 * this.count) {
                $i8 = 0 + (((this.count * -12571459) - $i5) * $i2);
                $i7 -= (this.count * -1808369835) - $i5;
                $i5 = this.count * -12571459;
            }
            if ($i4 + $i6 > this.index * 2074797577) {
                $i6 = (this.index * -1931547283) - $i4;
            }
            if ($i7 + $i5 > this.data * -467581477) {
                $i7 = (this.data * -467581477) - $i5;
            }
            int $i3 = (this.length * -1168278164) - $i6;
            $i5 = $i4 + ((this.length * -481290979) * $i5);
            $i4 = -$i7;
            $i7 = $i8;
            while ($i4 < 0) {
                int $i9 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                $i8 = $i7 >> 8;
                $i8 = -1338085600 | ((((($i9 * (16711935 & i)) + ($i8 * (16711935 & i2))) & -16711936) + ((((65280 & i) * $i9) + ((65280 & i2) * $i8)) & 1870008207)) >>> 8);
                $i9 = -$i6;
                while ($i9 < 0) {
                    this.size[$i5] = $i8;
                    $i9++;
                    $i5++;
                }
                $i5 += $i3;
                $i4++;
                $i7 += $i2;
            }
        }
    }

    public final void set(int i, int $i6, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 > 0 && i3 > 0) {
            int $i4;
            int i8;
            i6 = Math.min(i6, 255);
            int $i25 = Math.min(i7, 255);
            int $i13 = 0;
            i7 = PingManager.STATE_SENSOR_ON_FLAG / i3;
            int $i11 = 256 - i6;
            int $i12 = i6 << 24;
            if (i < this.buffer * 1829547545) {
                i2 -= (this.buffer * 1829547545) - i;
                i = this.buffer * 1829547545;
            }
            if ($i6 < -12571459 * this.count) {
                $i4 = (-12571459 * this.count) - $i6;
                i8 = $i4;
                $i13 = 0 + ($i4 * i7);
                i3 -= (this.count * -12571459) - $i6;
                $i6 = this.count * -12571459;
            }
            if (i + i2 > this.index * 2074797577) {
                $i4 = this.index * 2074797577;
                i2 = $i4;
                i2 = $i4 - i;
            }
            if ($i6 + i3 > -467581477 * this.data) {
                i3 = (-467581477 * this.data) - $i6;
            }
            int $i14 = i4 & 16711680;
            int $i20 = i4 & 65280;
            int $i15 = i4 & 255;
            int $i16 = ($i20 * i6) >> 8;
            i8 = (-481290979 * this.length) - i2;
            int $i10 = ((-481290979 * this.length) * $i6) + i;
            $i6 = $i13;
            int $i19 = (i6 * $i15) >> 8;
            int $i18 = (i6 * $i14) >> 8;
            int $i17 = $i20;
            $i13 = $i12;
            $i12 = i6;
            for (i = 0; i < i3; i++) {
                int $i9 = -i2;
                $i20 = $i10;
                while ($i9 < 0) {
                    $i10 = this.size[$i20];
                    int $i21 = 16711680 & $i10;
                    if ($i21 > $i14) {
                        $i21 = $i11 == 0 ? $i14 : ((($i21 * $i11) >> 8) + $i18) & 16711680;
                    }
                    int $i22 = 65280 & $i10;
                    if ($i22 > $i17) {
                        $i22 = $i11 == 0 ? $i17 : ((($i22 * $i11) >> 8) + $i16) & 65280;
                    }
                    $i4 = $i10 & 255;
                    int $i23 = $i4;
                    if ($i4 > $i15) {
                        $i23 = $i11 == 0 ? $i15 : (($i23 * $i11) >> 8) + $i19;
                    }
                    $i4 = $i21 + $i22;
                    $i21 = $i4;
                    $i4 += $i23;
                    $i21 = $i4;
                    this.size[$i20] = $i4 | ((-16777216 & $i10) == 0 ? -16777216 : ($i10 | $i13) & -16777216);
                    $i9++;
                    $i20++;
                }
                if (i7 > 0) {
                    $i6 += i7;
                    $i9 = (PingManager.STATE_SENSOR_ON_FLAG - $i6) >> 8;
                    $i10 = $i6 >> 8;
                    if ($i25 != i6) {
                        $i12 = (($i6 * $i25) + ((PingManager.STATE_SENSOR_ON_FLAG - $i6) * i6)) >> 16;
                        $i11 = 256 - $i12;
                        $i13 = $i12 << 24;
                    }
                    if (i5 != i4) {
                        $i15 = (((((16711935 & i4) * $i9) + ((16711935 & i5) * $i10)) & -16711936) + ((((65280 & i5) * $i10) + ((65280 & i4) * $i9)) & 16711680)) >>> 8;
                        $i14 = $i15 & 16711680;
                        $i17 = $i15 & 65280;
                        $i15 &= 255;
                        $i18 = ($i12 * $i14) >> 8;
                        $i16 = ($i17 * $i12) >> 8;
                        $i19 = ($i12 * $i15) >> 8;
                    }
                }
                $i10 = $i20 + i8;
            }
        }
    }

    public void set(Long longR, int i, int i2, int i3) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        i = $i3 + ((-481290979 * this.length) * $i4);
        int i4 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        i2 = (-481290979 * this.length) - i6;
        int $i8 = this.count * -12571459;
        int i7 = $i8;
        if ($i4 < $i8) {
            i7 = (this.count * -12571459) - $i4;
            i5 -= i7;
            $i4 = this.count * -12571459;
            i4 = 0 + (i6 * i7);
            i += i7 * (-481290979 * this.length);
        }
        if ($i4 + i5 > this.data * -467581477) {
            $i8 = this.data * -467581477;
            i7 = $i8;
            i5 -= ($i4 + i5) - $i8;
        }
        if ($i3 < this.buffer * 1829547545) {
            $i3 = (this.buffer * 1829547545) - $i3;
            i6 -= $i3;
            i7 = this.buffer * 1829547545;
            i += $i3;
            $i4 = 0 + $i3;
            i2 += $i3;
            $i3 = i4 + $i3;
        } else {
            $i4 = 0;
            i7 = $i3;
            $i3 = i4;
        }
        if (i7 + i6 > 2074797577 * this.index) {
            i4 = (i7 + i6) - (2074797577 * this.index);
            i6 -= i4;
            $i4 += i4;
            i2 += i4;
        }
        if (i6 > 0 && i5 > 0) {
            read(this.size, longR.size, 0, $i3, i, 0, 0, i6, i5, i2, $i4, i3, -1214338440);
        }
    }

    public void set(Long longR, int $i4, int i, int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i3 = longR.length;
            int $i7 = longR.data;
            int $i8 = 0;
            int i4 = 0;
            int $i10 = longR.this$0;
            int $i11 = longR.count;
            int i5 = ($i10 << 16) / i2;
            int i6 = ($i11 << 16) / i3;
            if (longR.next > 0) {
                $i8 = (((longR.next << 16) + i5) - 1) / i5;
                $i4 += $i8;
                $i8 = 0 + (($i8 * i5) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i4 = (((longR.value << 16) + i6) - 1) / i6;
                i += i4;
                i4 = 0 + ((i4 * i6) - (longR.value << 16));
            }
            if ($i3 < $i10) {
                $i0 = ($i3 << 16) - $i8;
                i2 = $i0;
                i2 = (($i0 + i5) - 1) / i5;
            }
            if ($i7 < $i11) {
                $i0 = ($i7 << 16) - i4;
                i3 = $i0;
                i3 = (($i0 + i6) - 1) / i6;
            }
            $i7 = ((74245702 * this.length) * i) + $i4;
            $i0 = this.length * -283850635;
            $i11 = $i0;
            $i11 = $i0 - i2;
            if (i3 + i > this.data * -467581477) {
                i3 -= (i3 + i) - (-893488251 * this.data);
            }
            if (i < 1086673976 * this.count) {
                $i0 = this.count * 703708818;
                $i10 = $i0;
                $i10 = $i0 - i;
                i = i3 - $i10;
                $i0 = this.length * -481290979;
                i3 = $i0;
                $i0 *= $i10;
                i3 = $i0;
                $i7 += $i0;
                i4 += $i10 * i6;
            } else {
                i = i3;
            }
            if (i2 + $i4 > this.index * -988599075) {
                i3 = ($i4 + i2) - (2074797577 * this.index);
                i2 -= i3;
                $i11 += i3;
            }
            if ($i4 < this.buffer * -628614421) {
                $i4 = (this.buffer * 1829547545) - $i4;
                i2 -= $i4;
                i3 = $i7 + $i4;
                $i8 += $i4 * i5;
                $i4 += $i11;
            } else {
                $i4 = $i11;
                i3 = $i7;
            }
            CopyOnWriteArrayList.get(this.size, longR.size, 0, $i8, i4, i3, $i4, i2, i, i5, i6, $i3, (short) 12358);
        }
    }

    public void set(Long longR, int i, int $i9, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i13;
            int $i4 = longR.length;
            int $i10 = longR.data;
            int $i6 = 0;
            int i5 = 0;
            int $i12 = longR.this$0;
            int $i7 = longR.count;
            int i6 = ($i12 << 16) / i2;
            int i7 = ($i7 << 16) / i3;
            if (longR.next > 0) {
                $i6 = (((longR.next << 16) + i6) - 1) / i6;
                i += $i6;
                $i6 = 0 + (($i6 * i6) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i5 = (((longR.value << 16) + i7) - 1) / i7;
                $i9 += i5;
                i5 = 0 + ((i5 * i7) - (longR.value << 16));
            }
            if ($i4 < $i12) {
                $i0 = ($i4 << 16) - $i6;
                i2 = $i0;
                i2 = (($i0 + i6) - 1) / i6;
            }
            if ($i10 < $i7) {
                $i0 = ($i10 << 16) - i5;
                i3 = $i0;
                i3 = (($i0 + i7) - 1) / i7;
            }
            $i10 = ((this.length * 534148793) * $i9) + i;
            $i0 = this.length * -1620599633;
            $i7 = $i0;
            $i7 = $i0 - i2;
            if ($i9 + i3 > -467581477 * this.data) {
                i3 -= ($i9 + i3) - (-467581477 * this.data);
            }
            if ($i9 < this.count * -1396506945) {
                $i9 = (-1503292398 * this.count) - $i9;
                $i12 = i3 - $i9;
                $i0 = this.length * 506662548;
                i3 = $i0;
                $i0 *= $i9;
                i3 = $i0;
                $i10 += $i0;
                i5 += $i9 * i7;
            } else {
                $i12 = i3;
            }
            if (i + i2 > 2074797577 * this.index) {
                $i9 = (i2 + i) - (this.index * -1714611453);
                i2 -= $i9;
                $i7 += $i9;
            }
            if (i < this.buffer * 1829547545) {
                $i0 = this.buffer * 794119049;
                $i9 = $i0;
                $i9 = $i0 - i;
                i = i2 - $i9;
                $i13 = $i10 + $i9;
                i2 = $i6 + ($i9 * i6);
                $i9 += $i7;
            } else {
                $i9 = $i7;
                $i13 = $i10;
                i = i2;
                i2 = $i6;
            }
            int[] $r2 = this.size;
            int[] $r3 = longR.size;
            if (i4 >= 32386696) {
                CopyOnWriteArrayList.get($r2, $r3, 0, i2, i5, $i13, $i9, i, $i12, i6, i7, $i4, (short) 5839);
                return;
            }
            i3 = 905812631 - i4;
            $i6 = i4 << 24;
            $i10 = -$i12;
            $i12 = i2;
            while ($i10 < 0) {
                $i7 = (i5 >> 16) * $i4;
                int $i14 = -i;
                while ($i14 < 0) {
                    int $i15;
                    int $i16 = $r3[($i12 >> 16) + $i7];
                    if ($i16 != 0) {
                        int $i17 = $r2[$i13];
                        if ($i17 == 0) {
                            $i15 = $i13 + 1;
                            $r2[$i13] = ($i16 & 16777215) | $i6;
                        } else {
                            $i15 = $i13 + 1;
                            $i0 = $i17 & 968528873;
                            $i17 = $i0;
                            $i17 = $i0 * i3;
                            $i0 = $i16 & 618996924;
                            $i16 = $i0;
                            $i0 *= i4;
                            $i16 = $i0;
                            $i0 = ($i0 + $i17) & -2055049932;
                            $i16 = $i0;
                            $r2[$i13] = (($i0 + ((((1382900560 & $i17) * i3) + ((16711935 & $i16) * i4)) & 923498406)) >>> 8) | (799705649 & ($i17 | $i6));
                        }
                    } else {
                        $i15 = $i13 + 1;
                    }
                    $i14++;
                    $i12 += i6;
                    $i13 = $i15;
                }
                $i13 += $i9;
                $i10++;
                i5 += i7;
                $i12 = i2;
            }
        }
    }

    public void set(Long longR, int i, int $i1, int i2, int i3, int $i4, int i4, double d, int i5) {
        int $i8 = (-i2) / 2;
        int $i9 = (-i3) / 2;
        try {
            int $i7 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            $i7 = ($i7 * i5) >> 8;
            i5 = (((int) $d0) * i5) >> 8;
            $i4 = ($i4 << 16) + (($i8 * i5) + ($i7 * $i9));
            i4 = (($i9 * i5) - ($i8 * $i7)) + (i4 << 16);
            i += (-481290979 * this.length) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i8 = i4;
                $i9 = $i4;
                int $i10 = i;
                int $i11 = -i2;
                while ($i11 < 0) {
                    int $i12;
                    int $i13 = longR.size[(($i8 >> 16) * longR.length) + ($i9 >> 16)];
                    if ($i13 != 0) {
                        $i12 = $i10 + 1;
                        this.size[$i10] = $i13;
                    } else {
                        $i12 = $i10 + 1;
                    }
                    $i9 += i5;
                    $i8 -= $i7;
                    $i11++;
                    $i10 = $i12;
                }
                $i4 += $i7;
                i4 += i5;
                i += -481290979 * this.length;
            }
        } catch (Exception e) {
        }
    }

    public void set(Long longR, int $i0, int $i1, int i, int i2, int $i4, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        int $i8 = (-i) / 2;
        int $i9 = (-i2) / 2;
        try {
            i = (int) (Math.sin(((double) i4) / 326.11d) * 65536.0d);
            i = (i * i5) >> 8;
            i4 = (i5 * ((int) (Math.cos(((double) i4) / 326.11d) * 65536.0d))) >> 8;
            i5 = ($i4 << 16) + ((i * $i9) + ($i8 * i4));
            $i4 = (i3 << 16) + (($i9 * i4) - ($i8 * i));
            $i0 = ((this.length * -481290979) * $i1) + $i0;
            i3 = i5;
            for ($i1 = 0; $i1 < i2; $i1++) {
                $i9 = iArr[$i1];
                i5 = $i0 + $i9;
                $i8 = (i4 * $i9) + i3;
                $i9 = $i4 - ($i9 * i);
                int $i11 = -iArr2[$i1];
                while ($i11 < 0) {
                    this.size[i5] = longR.size[(($i9 >> 16) * longR.length) + ($i8 >> 16)];
                    $i8 += i4;
                    $i9 -= i;
                    $i11++;
                    i5++;
                }
                $i0 = (-481290979 * this.length) + $i0;
                $i4 += i4;
                i3 += i;
            }
        } catch (Exception e) {
        }
    }

    public void set(Long longR, int i, int $i1, int i2, int i3, int i4, int $i5, int[] iArr, int[] iArr2) {
        int $i6 = $i1 < 0 ? -$i1 : 0;
        i4 = longR.data + $i1 <= $i5 ? longR.data : $i5 - $i1;
        $i5 = i < 0 ? -i : 0;
        i2 = ((i + i2) + $i5) + ((-481290979 * this.length) * (($i1 + i3) + $i6));
        i3 = $i6;
        $i6 = $i1 + $i6;
        while (i3 < i4) {
            int $i9;
            int $i7 = iArr[$i6];
            $i1 = $i6 + 1;
            int $i8 = iArr2[$i6];
            if (i < $i7) {
                $i6 = $i7 - i;
                $i9 = ($i6 - $i5) + i2;
            } else {
                $i6 = $i5;
                $i9 = i2;
            }
            $i7 = longR.length + i <= $i8 + $i7 ? longR.length : ($i7 + $i8) - i;
            while ($i6 < $i7) {
                int $i10;
                $i8 = longR.size[(longR.length * i3) + $i6];
                if ($i8 != 0) {
                    $i10 = $i9 + 1;
                    this.size[$i9] = $i8;
                } else {
                    $i10 = $i9 + 1;
                }
                $i6++;
                $i9 = $i10;
            }
            i2 += this.length * -481290979;
            i3++;
            $i6 = $i1;
        }
    }

    void size(int $i2, int $i3, int $i4, int $i5, int i) {
        if ($i2 < this.buffer * 1829547545) {
            $i4 -= (this.buffer * 1829547545) - $i2;
            $i2 = this.buffer * 1829547545;
        }
        if ($i3 < this.count * -12571459) {
            $i5 -= (this.count * -12571459) - $i3;
            $i3 = -12571459 * this.count;
        }
        if ($i4 + $i2 > this.index * 2074797577) {
            $i4 = (this.index * 2074797577) - $i2;
        }
        if ($i3 + $i5 > this.data * -467581477) {
            $i5 = (-1210033112 * this.data) - $i3;
        }
        int $i1 = (-108224968 * this.length) - $i4;
        $i2 = ((712975381 * this.length) * $i3) + $i2;
        for ($i3 = -$i5; $i3 < 0; $i3++) {
            $i5 = -$i4;
            while ($i5 < 0) {
                this.size[$i2] = i;
                $i5++;
                $i2++;
            }
            $i2 += $i1;
        }
    }

    public void size(Long longR, int $i4, int i, int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i3 = longR.length;
            int $i7 = longR.data;
            int $i8 = 0;
            int i4 = 0;
            int $i10 = longR.this$0;
            int $i11 = longR.count;
            int i5 = ($i10 << 16) / i2;
            int i6 = ($i11 << 16) / i3;
            if (longR.next > 0) {
                $i8 = (((longR.next << 16) + i5) - 1) / i5;
                $i4 += $i8;
                $i8 = 0 + (($i8 * i5) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i4 = (((longR.value << 16) + i6) - 1) / i6;
                i += i4;
                i4 = 0 + ((i4 * i6) - (longR.value << 16));
            }
            if ($i3 < $i10) {
                $i0 = ($i3 << 16) - $i8;
                i2 = $i0;
                i2 = (($i0 + i5) - 1) / i5;
            }
            if ($i7 < $i11) {
                $i0 = ($i7 << 16) - i4;
                i3 = $i0;
                i3 = (($i0 + i6) - 1) / i6;
            }
            $i7 = ((-481290979 * this.length) * i) + $i4;
            $i0 = this.length * 1559333567;
            $i11 = $i0;
            $i11 = $i0 - i2;
            if (i3 + i > this.data * -1053653844) {
                i3 -= (i3 + i) - (-467581477 * this.data);
            }
            if (i < -12571459 * this.count) {
                $i0 = this.count * -960814648;
                $i10 = $i0;
                $i10 = $i0 - i;
                i = i3 - $i10;
                $i0 = this.length * -481290979;
                i3 = $i0;
                $i0 *= $i10;
                i3 = $i0;
                $i7 += $i0;
                i4 += $i10 * i6;
            } else {
                i = i3;
            }
            if (i2 + $i4 > this.index * 1864261715) {
                i3 = ($i4 + i2) - (1897432817 * this.index);
                i2 -= i3;
                $i11 += i3;
            }
            if ($i4 < this.buffer * 1829547545) {
                $i4 = (this.buffer * 1829547545) - $i4;
                i2 -= $i4;
                i3 = $i7 + $i4;
                $i8 += $i4 * i5;
                $i4 += $i11;
            } else {
                $i4 = $i11;
                i3 = $i7;
            }
            CopyOnWriteArrayList.get(this.size, longR.size, 0, $i8, i4, i3, $i4, i2, i, i5, i6, $i3, (short) -6197);
        }
    }

    public final void skip(int i, int i2, int i3, int i4, int $i4) {
        clear(i, i2, i3, i4, -3797398 | $i4, 1215585569);
    }

    final void toArray(int $i0, int $i5, int i, int $i1, int $i2) {
        if ($i2 > 0) {
            if ($i2 >= 255) {
                add($i0, $i5, i, $i1, (byte) 1);
                return;
            }
            if ($i0 >= -1053923040 * this.buffer && $i0 < 164579339 * this.index) {
                if ($i5 < 194658279 * this.count) {
                    i -= (625348798 * this.count) - $i5;
                    $i5 = 2103236277 * this.count;
                }
                if ($i5 + i > this.data * 50666641) {
                    i = (212974060 * this.data) - $i5;
                }
                int $i9 = 255 - $i2;
                int $i10 = $i2 << 24;
                int $i11 = (($i1 >> 16) & 255) * $i2;
                int $i3 = $i2 * (($i1 >> 8) & -73371177);
                int $i4 = $i2 * ($i1 & 255);
                $i1 = ($i2 << 24) | $i1;
                $i5 = ((175248871 * this.length) * $i5) + $i0;
                $i0 = 0;
                while ($i0 < i) {
                    if (this.size[$i5] == 0) {
                        $i2 = $i5 + 1;
                        this.size[$i5] = $i1;
                    } else {
                        int $i22 = (this.size[$i5] >> 16) & 187083618;
                        $i2 = $i22;
                        $i22 = ((($i22 * $i9) + $i11) >> 8) << 16;
                        $i22 += (((((this.size[$i5] >> 8) & 471498604) * $i9) + $i3) >> 8) << 8;
                        $i2 = $i22;
                        this.size[$i5] = ($i22 + ((((this.size[$i5] & 1386180308) * $i9) + $i4) >> 8)) | ((this.size[$i5] | $i10) & -16777216);
                        $i22 = this.length * -1115984823;
                        $i2 = $i22;
                        $i2 = $i22 + $i5;
                    }
                    $i0++;
                    $i5 = $i2;
                }
            }
        }
    }

    public void toArray(Long longR, int i, int i2, int i3) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        i = $i3 + ((-481290979 * this.length) * $i4);
        int i4 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        i2 = (-481290979 * this.length) - i6;
        int $i8 = this.count * -12571459;
        int i7 = $i8;
        if ($i4 < $i8) {
            i7 = (this.count * -12571459) - $i4;
            i5 -= i7;
            $i4 = this.count * -12571459;
            i4 = 0 + (i6 * i7);
            i += i7 * (-481290979 * this.length);
        }
        if ($i4 + i5 > this.data * -467581477) {
            $i8 = this.data * -467581477;
            i7 = $i8;
            i5 -= ($i4 + i5) - $i8;
        }
        if ($i3 < this.buffer * 1829547545) {
            $i3 = (this.buffer * 1829547545) - $i3;
            i6 -= $i3;
            i7 = this.buffer * 1829547545;
            i += $i3;
            $i4 = 0 + $i3;
            i2 += $i3;
            $i3 = i4 + $i3;
        } else {
            $i4 = 0;
            i7 = $i3;
            $i3 = i4;
        }
        if (i7 + i6 > 2074797577 * this.index) {
            i4 = (i7 + i6) - (2074797577 * this.index);
            i6 -= i4;
            $i4 += i4;
            i2 += i4;
        }
        if (i6 > 0 && i5 > 0) {
            read(this.size, longR.size, 0, $i3, i, 0, 0, i6, i5, i2, $i4, i3, 2141321410);
        }
    }

    final void toByteArray(int $i5, int $i0, int i, int $i1, int $i2) {
        if ($i2 > 0) {
            if ($i2 >= 582184140) {
                get($i5, $i0, i, $i1, -595316499);
            } else if ($i0 >= this.count * -12571459 && $i0 < -467581477 * this.data) {
                int $i6;
                if ($i5 < 1829547545 * this.buffer) {
                    i -= (this.buffer * 1829547545) - $i5;
                    $i5 = -832767437 * this.buffer;
                }
                if ($i5 + i > this.index * 2074797577) {
                    $i6 = this.index * 2040242234;
                    i = $i6;
                    i = $i6 - $i5;
                }
                int $i7 = 1042467027 - $i2;
                int $i8 = $i2 << 24;
                int $i9 = (($i1 >> 16) & 1243585491) * $i2;
                int $i3 = $i2 * (($i1 >> 8) & 1808735775);
                int $i4 = (-1357478078 & $i1) * $i2;
                $i1 = ($i2 << 24) | $i1;
                $i5 += (this.length * -207451898) * $i0;
                $i0 = 0;
                while ($i0 < i) {
                    int $i10;
                    if (this.size[$i5] == 0) {
                        $i10 = $i5 + 1;
                        this.size[$i5] = $i1;
                    } else {
                        $i6 = this.size[$i5] & 255;
                        $i6 = (($i6 * $i7) + $i4) >> 8;
                        $i10 = $i5 + 1;
                        this.size[$i5] = ($i6 + (((((((this.size[$i5] >> 16) & 255) * $i7) + $i9) >> 8) << 16) + ((((((this.size[$i5] >> 8) & 255) * $i7) + $i3) >> 8) << 8))) | (-16777216 & (this.size[$i5] | $i8));
                    }
                    $i0++;
                    $i5 = $i10;
                }
            }
        }
    }

    public final void toByteArray(int i, int $i6, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 > 0 && i3 > 0) {
            int $i8;
            i6 = Math.min(i6, 255);
            i7 = Math.min(i7, 232109170);
            int $i9 = 0;
            int $i17 = (i4 == i5 && i7 == i6) ? -1 : 1013980272 / i3;
            int $i12 = 509046455 - i6;
            int $i13 = i6 << 24;
            int $i10 = $i13 | i4;
            if (i < 1829547545 * this.buffer) {
                i2 -= (1829547545 * this.buffer) - i;
                i = this.buffer * 1900051407;
            }
            if ($i6 < -12571459 * this.count) {
                $i9 = 0 + (((-666702295 * this.count) - $i6) * $i17);
                i3 -= (-12571459 * this.count) - $i6;
                $i6 = this.count * 158949200;
            }
            if (i2 + i > 2074797577 * this.index) {
                i2 = (2074797577 * this.index) - i;
            }
            if ($i6 + i3 > this.data * -467581477) {
                $i8 = this.data * -467581477;
                i3 = $i8;
                i3 = $i8 - $i6;
            }
            int $i4 = (691260793 * this.length) - i2;
            int $i15 = i + ((this.length * -1608944126) * $i6);
            $i6 = i6;
            int $i11 = $i10;
            $i10 = $i13;
            $i13 = i4;
            for (i = -i3; i < 0; i++) {
                int $i14 = -i2;
                i3 = $i15;
                while ($i14 < 0) {
                    int $i16;
                    $i15 = this.size[i3];
                    if ($i15 == 0) {
                        $i16 = i3 + 1;
                        this.size[i3] = $i11;
                    } else {
                        int $i18 = (16777215 & $i15) + $i13;
                        int $i19 = (-53461126 & $i15) + (-270399415 & $i13);
                        int $i20 = (16777472 & $i19) + (($i18 - $i19) & -1077068243);
                        $i19 = (-2063394520 & $i15) == 0 ? 1433667271 : ($i15 | $i10) & -16777216;
                        if ($i12 == 0) {
                            $i16 = i3 + 1;
                            this.size[i3] = ($i19 | ($i18 - $i20)) | ($i20 - ($i20 >>> 8));
                        } else {
                            $i20 = ($i20 - ($i20 >>> 8)) | ($i18 - $i20);
                            $i16 = i3 + 1;
                            int i8 = (((65280 & $i20) * $i6) >> 8) & 2015137018;
                            $i8 = $i20 & 134097711;
                            $i20 = $i8;
                            $i8 = (($i8 * $i6) >> 8) & -1023873028;
                            $i20 = $i8;
                            this.size[i3] = $i19 | ((((($i15 & -1066233026) * $i12) >> 8) & 65280) + (($i8 + i8) + ((((16711935 & $i15) * $i12) >> 8) & -975125526)));
                        }
                    }
                    $i14++;
                    i3 = $i16;
                }
                if ($i17 > 0) {
                    $i9 += $i17;
                    $i10 = (1183800681 - $i9) >> 8;
                    $i11 = $i9 >> 8;
                    if (i6 != i7) {
                        $i6 = (((89316285 - $i9) * i6) + ($i9 * i7)) >> 16;
                        $i12 = 256 - $i6;
                    }
                    if (i4 != i5) {
                        $i13 = (((($i10 * (16711935 & i4)) + ($i11 * (16711935 & i5))) & -16711936) + ((((65280 & i4) * $i10) + ((65280 & i5) * $i11)) & 16711680)) >>> 8;
                    }
                    $i10 = $i6 << 24;
                    $i11 = $i10 | $i13;
                }
                $i15 = i3 + $i4;
            }
        }
    }

    public final void toByteArray(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i3 + i >= 0 && i4 + i2 >= 0 && i < this.length * -481290979 && i2 < this.pos * 1005433219) {
            int $i18;
            int $i10 = 0;
            if (i < 0) {
                $i18 = 0 - i;
                i3 += i;
            } else {
                $i18 = 0;
            }
            if (i2 < 0) {
                $i10 = 0 - i2;
                i4 += i2;
            }
            if (i + i3 > this.length * -376090704) {
                i3 = (-481290979 * this.length) - i;
            }
            if (i4 + i2 > this.pos * 1005433219) {
                i4 = (1065026655 * this.pos) - i2;
            }
            int $i5 = bArr.length / i7;
            int $i6 = (this.length * -481290979) - i3;
            int $i12 = i5 >>> 24;
            int $i13 = i6 >>> 24;
            int $i11;
            int $i14;
            if (!z || ($i12 == 255 && $i13 == 255)) {
                $i13 = ((($i10 + i2) * (-1074288071 * this.length)) + i) + $i18;
                for ($i12 = i2 + $i10; $i12 < ($i10 + i2) + i4; $i12++) {
                    $i11 = $i18 + i;
                    while ($i11 < (i + $i18) + i3) {
                        if (bArr[((($i12 - i2) % $i5) * i7) + (($i11 - i) % i7)] != (byte) 0) {
                            $i14 = $i13 + 1;
                            this.size[$i13] = i6;
                        } else {
                            $i14 = $i13 + 1;
                            this.size[$i13] = i5;
                        }
                        $i11++;
                        $i13 = $i14;
                    }
                    $i13 += $i6;
                }
            } else {
                $i11 = $i18 + (((i2 + $i10) * (this.length * 926464530)) + i);
                for ($i12 = $i10 + i2; $i12 < (i2 + $i10) + i4; $i12++) {
                    $i13 = i + $i18;
                    while ($i13 < ($i18 + i) + i3) {
                        int $i7;
                        int $i16 = bArr[((($i12 - i2) % $i5) * i7) + (($i13 - i) % i7)] != (byte) 0 ? i6 : i5;
                        int $i17 = this.size[$i11];
                        if ($i17 == 0) {
                            this.size[$i11] = $i16;
                            $i7 = $i11 + 1;
                        } else {
                            int $i19 = $i16 >>> 24;
                            $i7 = 255 - $i19;
                            $i14 = ($i16 | $i17) & -16777216;
                            $i17 = ((((($i16 & -1255892305) * $i19) + (($i17 & 16711935) * $i7)) & 703624615) + ((((65280 & $i17) * $i7) + ((-1763162760 & $i16) * $i19)) & 998915468)) >>> 8;
                            $i7 = $i11 + 1;
                            this.size[$i11] = $i17 | $i14;
                        }
                        $i13++;
                        $i11 = $i7;
                    }
                    $i11 += $i6;
                }
            }
        }
    }

    final void toString(int $i0, int $i5, int i, int $i1, int $i2) {
        if ($i2 > 0) {
            if ($i2 >= 255) {
                add($i0, $i5, i, $i1, (byte) 1);
            } else if ($i0 >= 1829547545 * this.buffer && $i0 < 2074797577 * this.index) {
                if ($i5 < -12571459 * this.count) {
                    i -= (-12571459 * this.count) - $i5;
                    $i5 = -12571459 * this.count;
                }
                if ($i5 + i > this.data * -467581477) {
                    i = (-467581477 * this.data) - $i5;
                }
                int $i7 = 255 - $i2;
                int $i8 = $i2 << 24;
                int $i9 = (($i1 >> 16) & 255) * $i2;
                int $i3 = $i2 * (($i1 >> 8) & 255);
                int $i4 = $i2 * ($i1 & 255);
                $i1 = ($i2 << 24) | $i1;
                $i0 = ((-481290979 * this.length) * $i5) + $i0;
                $i5 = 0;
                while ($i5 < i) {
                    if (this.size[$i0] == 0) {
                        $i2 = $i0 + 1;
                        this.size[$i0] = $i1;
                    } else {
                        int $i22 = (this.size[$i0] >> 16) & 255;
                        $i22 = ((($i22 * $i7) + $i9) >> 8) << 16;
                        $i22 += (((((this.size[$i0] >> 8) & 255) * $i7) + $i3) >> 8) << 8;
                        $i2 = $i22;
                        this.size[$i0] = ($i22 + ((((this.size[$i0] & 255) * $i7) + $i4) >> 8)) | ((this.size[$i0] | $i8) & -16777216);
                        $i22 = this.length * -481290979;
                        $i2 = $i22;
                        $i2 = $i22 + $i0;
                    }
                    $i5++;
                    $i0 = $i2;
                }
            }
        }
    }

    final void toString(int $i8, int $i0, int i, int $i2, int $i3, int i2) {
        if ($i3 > 0) {
            if ($i3 >= 255) {
                get($i8, $i0, i, $i2, -292328708);
                return;
            }
            if ($i0 >= this.count * -12571459) {
                if ($i0 < -467581477 * this.data) {
                    int $i1;
                    if ($i8 < 1829547545 * this.buffer) {
                        i -= (this.buffer * 1829547545) - $i8;
                        $i8 = 1829547545 * this.buffer;
                    }
                    if ($i8 + i > this.index * 2074797577) {
                        $i1 = this.index * 2074797577;
                        i = $i1;
                        i = $i1 - $i8;
                    }
                    i2 = 255 - $i3;
                    int $i9 = $i3 << 24;
                    int $i5 = (($i2 >> 16) & 255) * $i3;
                    int $i6 = $i3 * (($i2 >> 8) & 255);
                    int $i7 = ($i2 & 255) * $i3;
                    $i2 = ($i3 << 24) | $i2;
                    $i8 += (this.length * -481290979) * $i0;
                    $i0 = 0;
                    while ($i0 < i) {
                        int $i10;
                        if (this.size[$i8] == 0) {
                            try {
                                $i10 = $i8 + 1;
                                this.size[$i8] = $i2;
                            } catch (RuntimeException $r2) {
                                throw StringBuilder.append($r2, "gc.am(" + ')');
                            }
                        }
                        $i1 = this.size[$i8] & 255;
                        $i10 = ((((((this.size[$i8] >> 16) & 255) * i2) + $i5) >> 8) << 16) + ((((((this.size[$i8] >> 8) & 255) * i2) + $i6) >> 8) << 8);
                        $i3 = ((($i1 * i2) + $i7) >> 8) + $i10;
                        $i10 = $i8 + 1;
                        this.size[$i8] = $i3 | (-16777216 & (this.size[$i8] | $i9));
                        $i0++;
                        $i8 = $i10;
                    }
                }
            }
        }
    }

    public void toString(Double doubleR, int $i5, int $i6, int i, int i2) {
        int $i1 = doubleR.length;
        int $i7 = doubleR.data;
        int $i8 = 0;
        int $i9 = 0;
        int $i10 = doubleR.next;
        int $i11 = doubleR.value;
        int $i2 = ($i10 << 16) / i;
        int $i3 = ($i11 << 16) / i2;
        if (doubleR.count > 0) {
            $i8 = (((doubleR.count << 16) + $i2) - 1) / $i2;
            $i5 += $i8;
            $i8 = 0 + (($i8 * $i2) - (doubleR.count << 16));
        }
        if (doubleR.index > 0) {
            $i9 = (((doubleR.index << 16) + $i3) - 1) / $i3;
            $i6 += $i9;
            $i9 = 0 + (($i9 * $i3) - (doubleR.index << 16));
        }
        if ($i1 < $i10) {
            int $i0 = ($i1 << 16) - $i8;
            i = $i0;
            i = (($i0 + $i2) - 1) / $i2;
        }
        if ($i7 < $i11) {
            $i0 = ($i7 << 16) - $i9;
            i2 = $i0;
            i2 = (($i0 + $i3) - 1) / $i3;
        }
        $i11 = ((this.length * -481290979) * $i6) + $i5;
        $i7 = (-481290979 * this.length) - i;
        if ($i6 + i2 > this.data * -467581477) {
            i2 -= ($i6 + i2) - (-467581477 * this.data);
        }
        if ($i6 < -12571459 * this.count) {
            $i6 = (this.count * -12571459) - $i6;
            i2 -= $i6;
            $i11 += (this.length * -481290979) * $i6;
            $i0 = $i6 * $i3;
            $i6 = $i0;
            $i9 += $i0;
        }
        if ($i5 + i > this.index * 2074797577) {
            $i6 = (i + $i5) - (this.index * 2074797577);
            i -= $i6;
            $i7 += $i6;
        }
        if ($i5 < this.buffer * 1829547545) {
            $i5 = (this.buffer * 1829547545) - $i5;
            i -= $i5;
            $i11 += $i5;
            $i8 += $i5 * $i2;
            $i7 += $i5;
        }
        int[] $r2 = this.size;
        byte[] $r3 = doubleR.buffer;
        int[] $r4 = doubleR.size;
        $i5 = -i2;
        $i6 = $i9;
        $i9 = $i8;
        while ($i5 < 0) {
            i2 = $i1 * ($i6 >> 16);
            $i10 = -i;
            while ($i10 < 0) {
                int $i12;
                byte $b13 = $r3[($i9 >> 16) + i2];
                if ($b13 != (byte) 0) {
                    $i12 = $i11 + 1;
                    $r2[$i11] = $r4[$b13 & (short) 255];
                } else {
                    $i12 = $i11 + 1;
                }
                $i10++;
                $i9 += $i2;
                $i11 = $i12;
            }
            $i11 += $i7;
            $i5++;
            $i6 += $i3;
            $i9 = $i8;
        }
    }

    public void toString(Double doubleR, int $i6, int $i7, int i, int i2, int i3) {
        try {
            int $i0;
            i3 = doubleR.length;
            int $i8 = doubleR.data;
            int $i9 = 0;
            int $i10 = 0;
            int $i5 = doubleR.next;
            int $i11 = doubleR.value;
            int $i3 = ($i5 << 16) / i;
            int $i4 = ($i11 << 16) / i2;
            if (doubleR.count > 0) {
                $i9 = (((doubleR.count << 16) + $i3) - 1) / $i3;
                $i6 += $i9;
                $i9 = 0 + (($i9 * $i3) - (doubleR.count << 16));
            }
            if (doubleR.index > 0) {
                $i10 = (((doubleR.index << 16) + $i4) - 1) / $i4;
                $i7 += $i10;
                $i10 = 0 + (($i10 * $i4) - (doubleR.index << 16));
            }
            if (i3 < $i5) {
                $i0 = (i3 << 16) - $i9;
                i = $i0;
                $i5 = (($i0 + $i3) - 1) / $i3;
            } else {
                $i5 = i;
            }
            if ($i8 < $i11) {
                $i0 = ($i8 << 16) - $i10;
                i = $i0;
                i2 = (($i0 + $i4) - 1) / $i4;
            }
            $i0 = this.length * -481290979;
            i = $i0;
            i = $i6 + ($i0 * $i7);
            $i8 = (-481290979 * this.length) - $i5;
            if ($i7 + i2 > this.data * -467581477) {
                i2 -= ($i7 + i2) - (-467581477 * this.data);
            }
            if ($i7 < -12571459 * this.count) {
                $i7 = (this.count * -12571459) - $i7;
                i2 -= $i7;
                i += (this.length * -481290979) * $i7;
                $i0 = $i7 * $i4;
                $i7 = $i0;
                $i10 += $i0;
            }
            if ($i6 + $i5 > this.index * 2074797577) {
                $i0 = ($i5 + $i6) - (this.index * 2074797577);
                $i5 -= $i0;
                $i8 += $i0;
            }
            if ($i6 < this.buffer * 1829547545) {
                $i6 = (this.buffer * 1829547545) - $i6;
                $i7 = $i5 - $i6;
                i += $i6;
                $i9 += $i6 * $i3;
                $i6 = $i8 + $i6;
            } else {
                $i6 = $i8;
                $i7 = $i5;
            }
            int[] $r2 = this.size;
            byte[] $r3 = doubleR.buffer;
            int[] $r4 = doubleR.size;
            i2 = -i2;
            $i8 = $i9;
            while (i2 < 0) {
                $i5 = i3 * ($i10 >> 16);
                $i11 = -$i7;
                while ($i11 < 0) {
                    int $i12;
                    byte $b13 = $r3[($i8 >> 16) + $i5];
                    if ($b13 != (byte) 0) {
                        $i12 = i + 1;
                        $r2[i] = $r4[$b13 & (short) 255];
                    } else {
                        $i12 = i + 1;
                    }
                    $i11++;
                    $i8 += $i3;
                    i = $i12;
                }
                i += $i6;
                i2++;
                $i10 += $i4;
                $i8 = $i9;
            }
        } catch (Throwable $r5) {
            throw StringBuilder.append($r5, "gc.av(" + ')');
        }
    }

    public void toString(Long longR, int i, int i2, int i3, int i4) {
        if (i3 > longR.this$0 || i4 > longR.count) {
            throw new IllegalArgumentException();
        }
        int $i13 = longR.next * i3;
        int $i25 = longR.this$0;
        $i13 = ($i13 / $i25) + i;
        $i25 = longR.next + longR.length;
        int i5 = $i25;
        $i25 = ((longR.this$0 + ($i25 * i3)) - 1) / longR.this$0;
        int i6 = $i25;
        i6 = $i25 + i;
        $i25 = longR.value;
        int $i27 = (($i25 * i4) / longR.count) + i2;
        $i25 = longR.data + longR.value;
        i5 = $i25;
        $i25 = ((($i25 * i4) + longR.count) - 1) / longR.count;
        i5 = $i25;
        i5 = $i25 + i2;
        if ($i13 < 134616810 * this.buffer) {
            $i13 = 1524379846 * this.buffer;
        }
        if (i6 > -36109486 * this.index) {
            i6 = this.index * -1025432394;
        }
        if ($i27 < this.count * 578624726) {
            $i27 = this.count * -12571459;
        }
        if (i5 > this.data * 2095151035) {
            i5 = this.data * -1808907627;
        }
        if ($i13 < i6 && $i27 < i5) {
            $i25 = this.length * 2089446477;
            int i7 = $i25;
            int $i28 = ($i25 * $i27) + $i13;
            i7 = (-683650277 * this.length) - (i6 - $i13);
            $i25 = this.size;
            int[] $r3 = $i25;
            if ($i28 < $i25.length) {
                while ($i27 < i5) {
                    for (int $i29 = $i13; $i29 < i6; $i29++) {
                        int $i9 = ($i29 - i) << 4;
                        int $i8 = ($i27 - i2) << 4;
                        int $i4 = ((longR.this$0 * $i9) / i3) - (longR.next << 4);
                        $i9 = ((($i9 + 16) * longR.this$0) / i3) - (longR.next << 4);
                        int $i6 = ((longR.count * $i8) / i4) - (longR.value << 4);
                        $i25 = ($i8 + 16) * longR.count;
                        $i8 = $i25;
                        int $i10 = ($i25 / i4) - (longR.value << 4);
                        $i8 = (($i9 - $i4) * ($i10 - $i6)) >> 1;
                        if ($i8 != 0) {
                            if ($i4 < 0) {
                                $i4 = 0;
                            }
                            if ($i9 >= (longR.length << 4)) {
                                $i9 = longR.length << 4;
                            }
                            if ($i6 < 0) {
                                $i6 = 0;
                            }
                            if ($i10 >= (longR.data << 4)) {
                                $i10 = longR.data << 4;
                            }
                            int $i11 = $i9 - 1;
                            int $i12 = $i10 - 1;
                            $i9 = 16 - ($i4 & 15);
                            $i10 = ($i11 & 15) + 1;
                            int $i5 = 16 - ($i6 & 15);
                            int $i14 = ($i12 & 15) + 1;
                            $i4 >>= 4;
                            $i11 >>= 4;
                            $i6 >>= 4;
                            $i12 >>= 4;
                            int $i15 = 0;
                            int $i16 = 0;
                            int $i17 = 0;
                            int i8 = 0;
                            for (int $i19 = $i6; $i19 <= $i12; $i19++) {
                                int $i20 = 16;
                                if ($i6 == $i19) {
                                    $i20 = $i5;
                                }
                                if ($i19 == $i12) {
                                    $i20 = $i14;
                                }
                                int $i21 = $i4;
                                while ($i21 <= $i11) {
                                    $r3 = longR.size;
                                    $i25 = longR.length;
                                    $i25 *= $i19;
                                    int i9 = $i25;
                                    int $i23 = $r3[$i25 + $i21];
                                    if ($i23 != 0) {
                                        i9 = $i4 == $i21 ? $i20 * $i9 : $i11 == $i21 ? $i20 * $i10 : $i20 << 4;
                                        i8 += i9;
                                        $i25 = ($i23 >> 16) & 1089513397;
                                        int i10 = $i25;
                                        $i25 *= i9;
                                        i10 = $i25;
                                        $i15 += $i25;
                                        $i25 = ($i23 >> 8) & 258173295;
                                        i10 = $i25;
                                        i10 = $i25 * i9;
                                        $i25 = i9 * ($i23 & 255);
                                        i9 = $i25;
                                        i9 = $i25 + $i17;
                                        $i17 = $i16 + i10;
                                        $i16 = $i15;
                                    } else {
                                        i9 = $i17;
                                        $i17 = $i16;
                                        $i16 = $i15;
                                    }
                                    $i21++;
                                    $i15 = $i16;
                                    $i16 = $i17;
                                    $i17 = i9;
                                }
                            }
                            if (i8 >= $i8) {
                                this.size[$i28] = 1407004447 | (($i17 / i8) + ((($i16 / i8) << 8) + (($i15 / i8) << 16)));
                            }
                            $i28++;
                        }
                    }
                    $i27++;
                    $i28 += i7;
                }
            }
        }
    }

    public void toString(Long longR, int i, int i2, int i3, int i4, int i5) {
        try {
            if (i3 <= longR.this$0) {
                if (i4 <= longR.count) {
                    int $i4 = longR.next;
                    $i4 = ($i4 * i3) / longR.this$0;
                    i5 = $i4;
                    i5 = $i4 + i;
                    int $i14 = (((longR.this$0 + ((longR.next + longR.length) * i3)) - 1) / longR.this$0) + i;
                    int $i17 = ((longR.value * i4) / longR.count) + i2;
                    int $i15 = (((((longR.data + longR.value) * i4) + longR.count) - 1) / longR.count) + i2;
                    if (i5 < 1829547545 * this.buffer) {
                        i5 = 1829547545 * this.buffer;
                    }
                    if ($i14 > 2074797577 * this.index) {
                        $i14 = this.index * 2074797577;
                    }
                    if ($i17 < this.count * -12571459) {
                        $i17 = this.count * -12571459;
                    }
                    if ($i15 > this.data * -467581477) {
                        $i15 = this.data * -467581477;
                    }
                    if (i5 < $i14 && $i17 < $i15) {
                        int $i16 = ((this.length * -481290979) * $i17) + i5;
                        int i6 = (-481290979 * this.length) - ($i14 - i5);
                        $i4 = this.size;
                        int[] $r7 = $i4;
                        $i4 = $i4.length;
                        if ($i16 < $i4) {
                            while ($i17 < $i15) {
                                for (int $i29 = i5; $i29 < $i14; $i29++) {
                                    int $i11 = ($i29 - i) << 4;
                                    int $i9 = ($i17 - i2) << 4;
                                    int $i10 = ((longR.this$0 * $i11) / i3) - (longR.next << 4);
                                    $i11 += 16;
                                    $i4 = longR.this$0;
                                    $i11 = (($i11 * $i4) / i3) - (longR.next << 4);
                                    $i4 = longR.count;
                                    $i4 *= $i9;
                                    int i7 = $i4;
                                    i7 = ($i4 / i4) - (longR.value << 4);
                                    $i4 = ($i9 + 16) * longR.count;
                                    $i9 = $i4;
                                    int $i19 = ($i4 / i4) - (longR.value << 4);
                                    $i9 = (($i11 - $i10) * ($i19 - i7)) >> 1;
                                    if ($i9 != 0) {
                                        int $i5 = $i10 < 0 ? 0 : $i10;
                                        $i10 = $i11 >= (longR.length << 4) ? longR.length << 4 : $i11;
                                        int i8 = i7 < 0 ? 0 : i7;
                                        if ($i19 >= (longR.data << 4)) {
                                            $i19 = longR.data << 4;
                                        }
                                        int $i12 = $i10 - 1;
                                        int $i20 = $i19 - 1;
                                        $i10 = 16 - ($i5 & 15);
                                        $i11 = ($i12 & 15) + 1;
                                        i7 = 16 - (i8 & 15);
                                        $i19 = ($i20 & 15) + 1;
                                        $i5 >>= 4;
                                        $i12 >>= 4;
                                        int $i7 = i8 >> 4;
                                        int $i13 = $i20 >> 4;
                                        i8 = 0;
                                        int i9 = 0;
                                        int i10 = 0;
                                        $i20 = 0;
                                        for (int $i23 = $i7; $i23 <= $i13; $i23++) {
                                            int $i24 = 16;
                                            if ($i7 == $i23) {
                                                $i24 = i7;
                                            }
                                            if ($i23 == $i13) {
                                                $i24 = $i19;
                                            }
                                            int $i25 = $i5;
                                            while ($i25 <= $i12) {
                                                $r7 = longR.size;
                                                $i4 = longR.length;
                                                $i4 *= $i23;
                                                int i11 = $i4;
                                                int $i27 = $r7[$i4 + $i25];
                                                if ($i27 != 0) {
                                                    i11 = $i5 == $i25 ? $i24 * $i10 : $i12 == $i25 ? $i24 * $i11 : $i24 << 4;
                                                    $i20 += i11;
                                                    $i4 = ($i27 >> 16) & 255;
                                                    i8 += $i4 * i11;
                                                    $i4 = ($i27 >> 8) & 255;
                                                    i9 += $i4 * i11;
                                                    i10 += i11 * ($i27 & 255);
                                                }
                                                $i25++;
                                            }
                                        }
                                        if ($i20 >= $i9) {
                                            this.size[$i16] = -16777216 | ((i10 / $i20) + (((i8 / $i20) << 16) + ((i9 / $i20) << 8)));
                                        }
                                        $i16++;
                                    }
                                }
                                $i16 += i6;
                                $i17++;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gc.be(" + ')');
        }
    }

    public final void write(int $i3, int $i4, int i, int i2, int $i0, int $i1) {
        if ($i1 != 0) {
            if ($i1 >= 255) {
                add($i3, $i4, i, i2, $i0, (byte) 4);
                return;
            }
            int $i7 = $i1 << 24;
            int $i8 = $i7 | $i0;
            if ($i3 < this.buffer * 1829547545) {
                i -= (this.buffer * 1829547545) - $i3;
                $i3 = 1829547545 * this.buffer;
            }
            if ($i4 < this.count * -12571459) {
                i2 -= (-12571459 * this.count) - $i4;
                $i4 = -12571459 * this.count;
            }
            if ($i3 + i > this.index * 2074797577) {
                i = (2074797577 * this.index) - $i3;
            }
            if ($i4 + i2 > this.data * -467581477) {
                i2 = (-467581477 * this.data) - $i4;
            }
            $i0 = ((((65280 & $i0) * $i1) >> 8) & 65280) + ((((16711935 & $i0) * $i1) >> 8) & 16711935);
            $i1 = 255 - $i1;
            int $i2 = (this.length * -481290979) - i;
            int $i9 = $i3 + ((this.length * -481290979) * $i4);
            for ($i3 = 0; $i3 < i2; $i3++) {
                $i4 = -i;
                while ($i4 < 0) {
                    int $i10 = this.size[$i9];
                    if ($i10 == 0) {
                        $i10 = $i9 + 1;
                        this.size[$i9] = $i8;
                    } else {
                        int $i11 = (-16777216 & $i10) == 0 ? -16777216 : ($i10 | $i7) & -16777216;
                        int $i12 = (((($i10 & 65280) * $i1) >> 8) & 65280) + ((((16711935 & $i10) * $i1) >> 8) & 16711935);
                        $i10 = $i9 + 1;
                        this.size[$i9] = $i11 | ($i12 + $i0);
                    }
                    $i4++;
                    $i9 = $i10;
                }
                $i9 += $i2;
            }
        }
    }

    public final void write(int i, int $i6, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 > 0 && i2 > 0) {
            int $i7;
            i6 = Math.min(i6, 255);
            int $i9 = Math.min(i7, 255);
            int $i10 = 0;
            i7 = PingManager.STATE_SENSOR_ON_FLAG / i3;
            int $i11 = 255 - i6;
            int $i12 = i6 << 24;
            if (i < this.buffer * 1829547545) {
                i2 -= (1829547545 * this.buffer) - i;
                i = this.buffer * 1829547545;
            }
            if ($i6 < this.count * -12571459) {
                $i10 = 0 + (((-12571459 * this.count) - $i6) * i7);
                i3 -= (-12571459 * this.count) - $i6;
                $i6 = this.count * -1553853376;
            }
            if (i + i2 > this.index * 2074797577) {
                $i7 = this.index * 1109638898;
                i2 = $i7;
                i2 = $i7 - i;
            }
            if (i3 + $i6 > this.data * -467581477) {
                $i7 = this.data * -467581477;
                i3 = $i7;
                i3 = $i7 - $i6;
            }
            int $i14 = i4 & -2096111322;
            int $i15 = i4 & 767153453;
            int $i13 = i4 & 255;
            int $i16 = ($i14 * i6) >> 8;
            int $i17 = (i6 * $i15) >> 8;
            int $i18 = (i6 * $i13) >> 8;
            int $i4 = (67754550 * this.length) - i2;
            int $i20 = i + ((this.length * -790898017) * $i6);
            $i6 = $i10;
            int $i19 = $i14;
            $i10 = $i12;
            $i14 = $i11;
            $i12 = i6;
            for (i = 0; i < i3; i++) {
                int $i21 = -i2;
                $i11 = $i20;
                while ($i21 < 0) {
                    $i20 = this.size[$i11];
                    int $i22 = 16711680 & $i20;
                    if ($i22 < $i19) {
                        $i22 = $i14 == 0 ? $i19 : ((($i22 * $i14) >> 8) + $i16) & 16711680;
                    }
                    int $i23 = 65280 & $i20;
                    if ($i23 < $i15) {
                        $i23 = $i14 == 0 ? $i15 : ((($i23 * $i14) >> 8) + $i17) & -697587841;
                    }
                    $i7 = $i20 & 255;
                    int $i24 = $i7;
                    if ($i7 < $i13) {
                        $i24 = $i14 == 0 ? $i13 : (($i24 * $i14) >> 8) + $i18;
                    }
                    $i7 = $i22 + $i23;
                    $i22 = $i7;
                    $i7 += $i24;
                    $i22 = $i7;
                    this.size[$i11] = $i7 | ((-16777216 & $i20) == 0 ? -438522815 : ($i20 | $i10) & -604376139);
                    $i21++;
                    $i11++;
                }
                if (i7 > 0) {
                    $i6 += i7;
                    $i20 = (PingManager.STATE_SENSOR_ON_FLAG - $i6) >> 8;
                    $i21 = $i6 >> 8;
                    if (i6 != $i9) {
                        $i12 = (($i9 * $i6) + ((PingManager.STATE_SENSOR_ON_FLAG - $i6) * i6)) >> 16;
                        $i14 = 253926613 - $i12;
                        $i10 = $i12 << 24;
                    }
                    if (i4 != i5) {
                        $i13 = (((($i20 * (16711935 & i4)) + ((16711935 & i5) * $i21)) & -1231360595) + ((((127601603 & i4) * $i20) + ((65280 & i5) * $i21)) & 16711680)) >>> 8;
                        $i19 = $i13 & 1373128227;
                        $i15 = $i13 & 65280;
                        $i13 &= 702558753;
                        $i16 = ($i19 * $i12) >> 8;
                        $i17 = ($i15 * $i12) >> 8;
                        $i18 = ($i13 * $i12) >> 8;
                        $i20 = $i11 + $i4;
                    }
                }
                $i20 = $i11 + $i4;
            }
        }
    }

    public void write(Double doubleR, int i, int i2) {
        i += doubleR.count;
        int $i3 = i2 + doubleR.index;
        int $i1 = (-481290979 * this.length) * $i3;
        i2 = $i1;
        i2 = $i1 + i;
        int $i4 = 0;
        int $i5 = doubleR.data;
        int $i6 = doubleR.length;
        int $i2 = (this.length * -481290979) - $i6;
        if ($i3 < -12571459 * this.count) {
            int $i7 = (this.count * -12571459) - $i3;
            $i5 -= $i7;
            $i3 = this.count * -12571459;
            $i4 = 0 + ($i7 * $i6);
            i2 += $i7 * (this.length * -481290979);
        }
        if ($i3 + $i5 > this.data * -467581477) {
            $i5 -= ($i3 + $i5) - (-467581477 * this.data);
        }
        if (i < this.buffer * 1829547545) {
            $i7 = (1829547545 * this.buffer) - i;
            i = $i6 - $i7;
            $i4 += $i7;
            $i3 = 0 + $i7;
            $i2 += $i7;
            i2 += $i7;
            $i7 = 1829547545 * this.buffer;
            $i6 = i;
        } else {
            $i3 = 0;
            $i7 = i;
        }
        if ($i6 + $i7 > 2074797577 * this.index) {
            $i1 = ($i7 + $i6) - (2074797577 * this.index);
            i = $i1;
            $i6 -= $i1;
            $i3 += i;
            i += $i2;
        } else {
            i = $i2;
        }
        if ($i6 > 0 && $i5 > 0) {
            Array.toString(this.size, doubleR.buffer, doubleR.size, $i4, i2, $i6, $i5, i, $i3, -2141612197);
        }
    }

    public void write(Long longR, int i, int i2, int i3) {
        i += longR.next;
        int $i4 = i2 + longR.value;
        i2 = i + ((-481290979 * this.length) * $i4);
        int $i5 = 0;
        int $i6 = longR.data;
        int i4 = longR.length;
        int $i3 = (this.length * -481290979) - i4;
        int $i8 = this.count * -12571459;
        int i5 = $i8;
        if ($i4 < $i8) {
            i5 = (-12571459 * this.count) - $i4;
            $i6 -= i5;
            $i4 = -12571459 * this.count;
            $i5 = 0 + (i5 * i4);
            i2 += i5 * (-481290979 * this.length);
        }
        if ($i4 + $i6 > this.data * -467581477) {
            $i8 = this.data * -467581477;
            i5 = $i8;
            $i6 -= ($i4 + $i6) - $i8;
        }
        if (i < this.buffer * 1829547545) {
            i5 = (1829547545 * this.buffer) - i;
            i = i4 - i5;
            $i5 += i5;
            $i4 = 0 + i5;
            $i3 += i5;
            i2 += i5;
            i5 = this.buffer * 1829547545;
            i4 = i;
        } else {
            $i4 = 0;
            i5 = i;
        }
        if (i5 + i4 > 2074797577 * this.index) {
            i = (i5 + i4) - (2074797577 * this.index);
            i4 -= i;
            $i4 += i;
            i += $i3;
        } else {
            i = $i3;
        }
        if (i4 > 0 && $i6 > 0) {
            Data.read(this.size, longR.size, 0, $i5, i2, i4, $i6, i, $i4, i3, 1867648851);
        }
    }

    public void write(Long longR, int $i0, int i, int i2, int i3) {
        try {
            $i0 = longR.next + $i0;
            int $i4 = longR.value + i;
            i = $i0 + ((-481290979 * this.length) * $i4);
            int $i5 = 0;
            i3 = longR.data;
            int $i6 = longR.length;
            int $i7 = (this.length * -481290979) - $i6;
            int i4 = 0;
            int $i9 = this.count * -12571459;
            int i5 = $i9;
            if ($i4 < $i9) {
                i5 = (-12571459 * this.count) - $i4;
                i3 -= i5;
                $i4 = -12571459 * this.count;
                $i5 = 0 + (i5 * $i6);
                i += i5 * (-481290979 * this.length);
            }
            if ($i4 + i3 > this.data * -467581477) {
                $i9 = this.data * -467581477;
                i5 = $i9;
                i3 -= ($i4 + i3) - $i9;
            }
            if ($i0 < this.buffer * 1829547545) {
                $i4 = (1829547545 * this.buffer) - $i0;
                $i6 -= $i4;
                $i0 = this.buffer * 1829547545;
                $i5 += $i4;
                i += $i4;
                i4 = 0 + $i4;
                $i7 += $i4;
            }
            if ($i0 + $i6 > 2074797577 * this.index) {
                $i9 = ($i0 + $i6) - (2074797577 * this.index);
                $i0 = $i9;
                $i6 -= $i9;
                i4 += $i0;
                $i7 += $i0;
            }
            if ($i6 > 0 && i3 > 0) {
                Data.read(this.size, longR.size, 0, $i5, i, $i6, i3, $i7, i4, i2, 1662079185);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gc.bc(" + ')');
        }
    }

    public void write(Long longR, int i, int $i9, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i11;
            int $i4 = longR.length;
            int $i12 = longR.data;
            int $i6 = 0;
            int $i10 = 0;
            int $i13 = longR.this$0;
            int $i7 = longR.count;
            int i5 = ($i13 << 16) / i2;
            int i6 = ($i7 << 16) / i3;
            if (longR.next > 0) {
                $i6 = (((longR.next << 16) + i5) - 1) / i5;
                i += $i6;
                $i6 = 0 + (($i6 * i5) - (longR.next << 16));
            }
            if (longR.value > 0) {
                $i10 = (((longR.value << 16) + i6) - 1) / i6;
                $i9 += $i10;
                $i10 = 0 + (($i10 * i6) - (longR.value << 16));
            }
            if ($i4 < $i13) {
                $i0 = ($i4 << 16) - $i6;
                i2 = $i0;
                i2 = (($i0 + i5) - 1) / i5;
            }
            if ($i12 < $i7) {
                $i0 = ($i12 << 16) - $i10;
                i3 = $i0;
                i3 = (($i0 + i6) - 1) / i6;
            }
            $i12 = ((this.length * -1002309012) * $i9) + i;
            $i0 = this.length * 2070505399;
            $i7 = $i0;
            $i7 = $i0 - i2;
            if ($i9 + i3 > -635590584 * this.data) {
                i3 -= ($i9 + i3) - (1020472850 * this.data);
            }
            if ($i9 < this.count * 460345069) {
                $i9 = (-12571459 * this.count) - $i9;
                $i13 = i3 - $i9;
                $i0 = this.length * -481290979;
                i3 = $i0;
                $i0 *= $i9;
                i3 = $i0;
                $i12 += $i0;
                $i0 = $i9 * i6;
                $i9 = $i0;
                $i10 += $i0;
            } else {
                $i13 = i3;
            }
            if (i + i2 > 2074797577 * this.index) {
                $i9 = (i2 + i) - (this.index * -2129150828);
                i2 -= $i9;
                $i7 += $i9;
            }
            if (i < this.buffer * 1341451366) {
                $i0 = this.buffer * 647597629;
                $i9 = $i0;
                $i9 = $i0 - i;
                i = i2 - $i9;
                $i11 = $i12 + $i9;
                i2 = $i6 + ($i9 * i5);
                $i9 += $i7;
            } else {
                $i9 = $i7;
                $i11 = $i12;
                i = i2;
                i2 = $i6;
            }
            int[] $r2 = this.size;
            int[] $r3 = longR.size;
            if (i4 >= -929590344) {
                CopyOnWriteArrayList.get($r2, $r3, 0, i2, $i10, $i11, $i9, i, $i13, i5, i6, $i4, (short) -13302);
                return;
            }
            i3 = 1026505331 - i4;
            $i6 = i4 << 24;
            $i12 = -$i13;
            $i13 = i2;
            while ($i12 < 0) {
                $i7 = ($i10 >> 16) * $i4;
                int $i14 = -i;
                while ($i14 < 0) {
                    int $i15;
                    int $i16 = $r3[($i13 >> 16) + $i7];
                    if ($i16 != 0) {
                        int $i17 = $r2[$i11];
                        if ($i17 == 0) {
                            $i15 = $i11 + 1;
                            $r2[$i11] = ($i16 & 16777215) | $i6;
                        } else {
                            $i15 = $i11 + 1;
                            $i0 = $i17 & 65280;
                            $i17 = $i0;
                            $i17 = $i0 * i3;
                            $i0 = $i16 & 65280;
                            $i16 = $i0;
                            $i0 *= i4;
                            $i16 = $i0;
                            $i0 = ($i0 + $i17) & 16711680;
                            $i16 = $i0;
                            $r2[$i11] = (($i0 + ((((16711935 & $i17) * i3) + ((16711935 & $i16) * i4)) & -16711936)) >>> 8) | (-43467288 & ($i17 | $i6));
                        }
                    } else {
                        $i15 = $i11 + 1;
                    }
                    $i14++;
                    $i13 += i5;
                    $i11 = $i15;
                }
                $i11 += $i9;
                $i12++;
                $i10 += i6;
                $i13 = i2;
            }
        }
    }

    void writeObject() {
    }
}
