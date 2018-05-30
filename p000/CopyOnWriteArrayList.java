package p000;

/* compiled from: gs */
public class CopyOnWriteArrayList extends File {
    static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    public static final int GRID_SIMPLEBLOB = 1009;
    public static final int STANDARD_GAP_WIDTH = 10;
    public static String name;

    CopyOnWriteArrayList(int i, int i2) {
        try {
            super(i, i2);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gs.<init>(" + ')');
        }
    }

    public CopyOnWriteArrayList(int[] iArr, int i, int i2) {
        try {
            super(iArr, i, i2);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gs.<init>(" + ')');
        }
    }

    static void add(int[] iArr, int[] iArr2, int i, int i2, int i3, int $i2, int i4, int i5) {
        $i2 = -$i2;
        int $i6 = i;
        i = i2;
        while ($i2 < 0) {
            i2 = (i + i3) - 3;
            while (i < i2) {
                int $i7 = i + 1;
                int $i8 = $i6 + 1;
                iArr[i] = iArr2[$i6];
                i = $i7 + 1;
                $i6 = $i8 + 1;
                iArr[$i7] = iArr2[$i8];
                $i7 = i + 1;
                $i8 = $i6 + 1;
                iArr[i] = iArr2[$i6];
                i = $i7 + 1;
                $i6 = $i8 + 1;
                iArr[$i7] = iArr2[$i8];
            }
            i2 += 3;
            while (i < i2) {
                $i8 = $i6 + 1;
                iArr[i] = iArr2[$i6];
                i++;
                $i6 = $i8;
            }
            $i6 += i5;
            $i2++;
            i += i4;
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
            i2 = i3;
            while (i2 < 0) {
                $i9 = $i7 + 1;
                $i8 = iArr2[$i7];
                if ($i8 == 0) {
                    $i7 = $i1 + 1;
                } else {
                    $i7 = $i1 + 1;
                    iArr[$i1] = $i8;
                }
                i2++;
                $i1 = $i7;
                $i7 = $i9;
            }
            $i1 += i4;
            $i3++;
            $i7 += i5;
        }
    }

    static void convertToARGB(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i = 256 - i8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i9 = i2;
            i2 = i3;
            int $i8 = -i4;
            while ($i8 < 0) {
                i3 = $i9 + 1;
                int $i10 = iArr2[$i9];
                if ($i10 != 0) {
                    int $i11 = iArr[i2];
                    if ($i11 == 0) {
                        $i9 = i2 + 1;
                        iArr[i2] = $i10 | ((i - 48) << 24);
                    } else {
                        $i9 = i2 + 1;
                        iArr[i2] = ((((($i10 & 65280) * i8) + (($i11 & 65280) * i)) & 16711680) + ((((16711935 & $i11) * i) + ((16711935 & $i10) * i8)) & -16711936)) >> 8;
                    }
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

    static void convertToARGB(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int $i8) {
        i = 256 - i8;
        i = (((i * (65280 & $i8)) & 16711680) | (((16711935 & $i8) * i) & -16711936)) >>> 8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i9 = i2;
            i2 = i3;
            $i8 = -i4;
            while ($i8 < 0) {
                i3 = $i9 + 1;
                int $i10 = iArr2[$i9];
                if ($i10 != 0) {
                    int $i11 = 16711680 & (($i10 & 65280) * i8);
                    $i10 = i2 + 1;
                    iArr[i2] = (((((16711935 & $i10) * i8) & -16711936) | $i11) >>> 8) + i;
                } else {
                    $i10 = i2 + 1;
                }
                $i8++;
                i2 = $i10;
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
                    i5 = i6 + i7;
                    i6 = (i7 & 1896567510) + (i6 & 16711935);
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
                    i7 = ((((i6 * i12) - i5) & 16711680) + (i5 & -16711936)) >>> 8;
                    i6 = iArr[i4];
                    i5 = i7 + i6;
                    i6 = (i7 & 16711935) + (i6 & 16711935);
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

    static void get(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, short s) {
        i = -i7;
        int $i12 = i4;
        i7 = i2;
        while (i < 0) {
            i4 = i10 * (i3 >> 16);
            int $i13 = -i6;
            while ($i13 < 0) {
                try {
                    int $i14;
                    int $i10 = iArr2[(i7 >> 16) + i4];
                    if ($i10 != 0) {
                        $i14 = $i12 + 1;
                        iArr[$i12] = $i10;
                    } else {
                        $i14 = $i12 + 1;
                    }
                    $i13++;
                    i7 += i8;
                    $i12 = $i14;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "gs.al(" + ')');
                }
            }
            i3 += i9;
            $i12 += i5;
            i++;
            i7 = i2;
        }
    }

    static void parse(System[] systemArr, int i, int i2, int i3, boolean z, int i4) {
        i4 = 0;
        while (i4 < systemArr.length) {
            try {
                System $r1 = systemArr[i4];
                if ($r1 != null) {
                    if (-1008623461 * $r1.type == i) {
                        Utils.init($r1, i2, i3, z, 508909523);
                        Data.add($r1, i2, i3, (byte) -65);
                        if ($r1.f292i * -2091547827 > ($r1.cursor * 1151268625) - (256177861 * $r1.this$0)) {
                            $r1.f292i = (588224725 * $r1.cursor) - (827921753 * $r1.this$0);
                        }
                        if ($r1.f292i * -2091547827 < 0) {
                            $r1.f292i = 0;
                        }
                        if ($r1.size * 654937537 > (-1243953689 * $r1.buf) - ($r1.$assertionsDisabled * 57307023)) {
                            $r1.size = (-158560857 * $r1.buf) - (-1002049201 * $r1.$assertionsDisabled);
                        }
                        if ($r1.size * 654937537 < 0) {
                            $r1.size = 0;
                        }
                        if (-128421835 * $r1.name == 0) {
                            Model.write(systemArr, $r1, z, (byte) -82);
                        } else {
                            continue;
                        }
                    }
                }
                i4++;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "gs.eg(" + ')');
            }
        }
    }

    static void read(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
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
                    i7 = ((((i6 * i12) - i5) & 16711680) + (i5 & -16711936)) >>> 8;
                    i6 = iArr[i4];
                    i5 = i7 + i6;
                    i6 = (i7 & 16711935) + (i6 & 16711935);
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

    static void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i = 256 - i8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i9 = i2;
            i2 = i3;
            int $i8 = -i4;
            while ($i8 < 0) {
                i3 = $i9 + 1;
                int $i10 = iArr2[$i9];
                if ($i10 != 0) {
                    int $i11 = iArr[i2];
                    if ($i11 == 0) {
                        $i9 = i2 + 1;
                        iArr[i2] = $i10 | ((i - 48) << 24);
                    } else {
                        $i9 = i2 + 1;
                        iArr[i2] = ((((($i10 & 65280) * i8) + (($i11 & 65280) * i)) & -594091132) + ((((-1575623890 & $i11) * i) + ((16711935 & $i10) * i8)) & -16711936)) >> 8;
                    }
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

    static void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int $i8) {
        i = 256 - i8;
        i = (((i * (65280 & $i8)) & 1230943313) | (((269198474 & $i8) * i) & -184778652)) >>> 8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i9 = i2;
            i2 = i3;
            $i8 = -i4;
            while ($i8 < 0) {
                i3 = $i9 + 1;
                int $i10 = iArr2[$i9];
                if ($i10 != 0) {
                    int $i11 = 16711680 & (($i10 & 65280) * i8);
                    $i10 = i2 + 1;
                    iArr[i2] = (((((-916798489 & $i10) * i8) & 1687584005) | $i11) >>> 8) + i;
                } else {
                    $i10 = i2 + 1;
                }
                $i8++;
                i2 = $i10;
                $i9 = i3;
            }
            i3 = i2 + i6;
            i2 = $i9 + i7;
        }
    }

    static void search(int[] iArr, int[] iArr2, int i, int i2, int $i10, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        i = -i6;
        int $i11 = i3;
        i6 = i2;
        while (i < 0) {
            i3 = ($i10 >> 16) * i9;
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

    static void set(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
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
                    i5 = i6 + i7;
                    i6 = (i7 & -1017958668) + (i6 & 16711935);
                    i7 = ((i5 - i6) & 315158724) + (i6 & 1537070883);
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
                    i7 = ((((i6 * i12) - i5) & 16711680) + (i5 & -16711936)) >>> 8;
                    i6 = iArr[i4];
                    i5 = i7 + i6;
                    i6 = (i7 & 16711935) + (i6 & 16711935);
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

    static void set(int[] iArr, int[] iArr2, int i, int i2, int i3, int $i2, int i4, int i5) {
        $i2 = -$i2;
        int $i6 = i;
        i = i2;
        while ($i2 < 0) {
            i2 = (i + i3) - 3;
            while (i < i2) {
                int $i7 = i + 1;
                int $i8 = $i6 + 1;
                iArr[i] = iArr2[$i6];
                i = $i7 + 1;
                $i6 = $i8 + 1;
                iArr[$i7] = iArr2[$i8];
                $i7 = i + 1;
                $i8 = $i6 + 1;
                iArr[i] = iArr2[$i6];
                i = $i7 + 1;
                $i6 = $i8 + 1;
                iArr[$i7] = iArr2[$i8];
            }
            i2 += 3;
            while (i < i2) {
                $i8 = $i6 + 1;
                iArr[i] = iArr2[$i6];
                i++;
                $i6 = $i8;
            }
            $i6 += i5;
            $i2++;
            i += i4;
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

    static void set(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i = 256 - i8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i9 = i2;
            i2 = i3;
            int $i8 = -i4;
            while ($i8 < 0) {
                i3 = $i9 + 1;
                int $i10 = iArr2[$i9];
                if ($i10 != 0) {
                    int $i11 = iArr[i2];
                    if ($i11 == 0) {
                        $i9 = i2 + 1;
                        iArr[i2] = $i10 | ((i - -2104000179) << 24);
                    } else {
                        $i9 = i2 + 1;
                        iArr[i2] = ((((($i10 & 340267671) * i8) + (($i11 & 65280) * i)) & -1040805410) + ((((16711935 & $i11) * i) + ((16711935 & $i10) * i8)) & -16711936)) >> 8;
                    }
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

    static void set(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int $i8) {
        i = -2062796839 - i8;
        i = (((i * (-424480073 & $i8)) & 977083719) | (((16711935 & $i8) * i) & -231056044)) >>> 8;
        for (i5 = -i5; i5 < 0; i5++) {
            int $i9 = i2;
            i2 = i3;
            $i8 = -i4;
            while ($i8 < 0) {
                i3 = $i9 + 1;
                int $i10 = iArr2[$i9];
                if ($i10 != 0) {
                    int $i11 = 16711680 & (($i10 & 65280) * i8);
                    $i10 = i2 + 1;
                    iArr[i2] = (((((-1482658144 & $i10) * i8) & -16711936) | $i11) >>> 8) + i;
                } else {
                    $i10 = i2 + 1;
                }
                $i8++;
                i2 = $i10;
                $i9 = i3;
            }
            i3 = i2 + i6;
            i2 = $i9 + i7;
        }
    }

    static void set(int[] iArr, int[] iArr2, int i, int i2, int $i10, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        i = -i6;
        int $i11 = i3;
        i6 = i2;
        while (i < 0) {
            i3 = ($i10 >> 16) * i9;
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

    static void set(int[] iArr, int[] iArr2, int i, int i2, int $i10, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        i = 256 - i10;
        i6 = -i6;
        int $i11 = i3;
        int $i12 = i2;
        while (i6 < 0) {
            i3 = ($i10 >> 16) * i9;
            int $i13 = -i5;
            while ($i13 < 0) {
                int $i14;
                int $i15 = iArr2[($i12 >> 16) + i3];
                if ($i15 != 0) {
                    int $i16 = iArr[$i11];
                    $i14 = $i11 + 1;
                    iArr[$i11] = ((((($i15 & -1386748259) * i10) + (($i16 & 1064973936) * i)) & 16711680) + ((((432149762 & $i15) * i10) + ((-1565440332 & $i16) * i)) & -16711936)) >> 8;
                } else {
                    $i14 = $i11 + 1;
                }
                $i13++;
                $i12 += i7;
                $i11 = $i14;
            }
            $i10 += i8;
            $i11 += i4;
            i6++;
            $i12 = i2;
        }
    }

    void m8a(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
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
                    int $i11 = $i10 & -16777216;
                    $i10 &= 255;
                    i10 = i2 + 1;
                    iArr[i2] = ((($i10 * i4) & 65280) + (((i * $i10) >> 8) & 16711935)) + $i11;
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
        int $i0 = ((this.length * -481290979) * (this.pos * 1005433219)) - 7;
        int $i1 = 0;
        while ($i1 < $i0) {
            int $i2 = $i1 + 1;
            this.size[$i1] = 0;
            $i1 = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = $i1 + 1;
            this.size[$i1] = 0;
            $i1 = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = $i1 + 1;
            this.size[$i1] = 0;
            $i1 = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = $i1 + 1;
            this.size[$i1] = 0;
            $i1 = $i2 + 1;
            this.size[$i2] = 0;
        }
        $i0 += 7;
        while ($i1 < $i0) {
            this.size[$i1] = 0;
            $i1++;
        }
    }

    void add(int i) {
        try {
            get(-1451081848);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gs.af(" + ')');
        }
    }

    public final void add(int $i2, int $i0, int $i3, int i) {
        if ($i0 >= this.count * -12571459 && $i0 < this.data * -467581477) {
            if ($i2 < this.buffer * 1829547545) {
                $i3 -= (this.buffer * 1829547545) - $i2;
                $i2 = 1829547545 * this.buffer;
            }
            if ($i3 + $i2 > this.index * 2074797577) {
                $i3 = (this.index * 2074797577) - $i2;
            }
            $i2 += (this.length * -481290979) * $i0;
            for ($i0 = 0; $i0 < $i3; $i0++) {
                this.size[$i2 + $i0] = i;
            }
        }
    }

    public final void add(int $i0, int $i4, int $i1, int i, byte b) {
        try {
            if ($i0 >= 1829547545 * this.buffer) {
                if ($i0 < 2074797577 * this.index) {
                    if ($i4 < this.count * -12571459) {
                        $i1 -= (this.count * -12571459) - $i4;
                        $i4 = -12571459 * this.count;
                    }
                    if ($i4 + $i1 > this.data * -467581477) {
                        $i1 = (this.data * -467581477) - $i4;
                    }
                    $i0 = ((this.length * -481290979) * $i4) + $i0;
                    for ($i4 = 0; $i4 < $i1; $i4++) {
                        this.size[((this.length * -481290979) * $i4) + $i0] = i;
                    }
                }
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gs.at(" + ')');
        }
    }

    public final void add(int $i3, int i, int i2, int i3, int i4) {
        i2 -= $i3;
        int $i5 = i3 - i;
        if ($i5 == 0) {
            if (i2 >= 0) {
                get($i3, i, i2 + 1, i4, -1073364722);
                return;
            }
            get($i3 + i2, i, (-i2) + 1, i4, -1315400252);
        } else if (i2 != 0) {
            if (i2 + $i5 < 0) {
                i += $i5;
                $i5 = -$i5;
                i3 = -i2;
                i2 = $i3 + i2;
            } else {
                i3 = i2;
                i2 = $i3;
            }
            if (i3 > $i5) {
                i = (i << 16) + 32768;
                $i3 = (int) Math.floor(0.5d + (((double) ($i5 << 16)) / ((double) i3)));
                i3 += i2;
                if (i2 < this.buffer * 1829547545) {
                    i += ((1829547545 * this.buffer) - i2) * $i3;
                    i2 = this.buffer * 1829547545;
                }
                if (i3 >= 2074797577 * this.index) {
                    i3 = (2074797577 * this.index) - 1;
                }
                while (i2 <= i3) {
                    $i5 = i >> 16;
                    if ($i5 >= -12571459 * this.count && $i5 < this.data * -467581477) {
                        this.size[($i5 * (this.length * -481290979)) + i2] = i4;
                    }
                    i += $i3;
                    i2++;
                }
            } else {
                i2 = (i2 << 16) + 32768;
                $i3 = (int) Math.floor((((double) (i3 << 16)) / ((double) $i5)) + 0.5d);
                i3 = $i5 + i;
                if (i < -12571459 * this.count) {
                    i2 += ((this.count * -12571459) - i) * $i3;
                    i = -12571459 * this.count;
                }
                if (i3 >= -467581477 * this.data) {
                    i3 = (-467581477 * this.data) - 1;
                }
                while (i <= i3) {
                    $i5 = i2 >> 16;
                    if ($i5 >= 1829547545 * this.buffer && $i5 < this.index * 2074797577) {
                        this.size[$i5 + ((this.length * -481290979) * i)] = i4;
                    }
                    i2 += $i3;
                    i++;
                }
            }
        } else if ($i5 >= 0) {
            add($i3, i, $i5 + 1, i4, (byte) 1);
        } else {
            add($i3, i + $i5, (-$i5) + 1, i4, (byte) 1);
        }
    }

    public final void add(int $i4, int $i5, int $i0, int $i1, int i, byte b) {
        try {
            int $i6;
            if ($i4 < this.buffer * 1829547545) {
                $i6 = $i0 - ((this.buffer * 1829547545) - $i4);
                $i4 = this.buffer * 1829547545;
            } else {
                $i6 = $i0;
            }
            if ($i5 < this.count * -12571459) {
                $i0 = $i1 - ((this.count * -12571459) - $i5);
                $i5 = this.count * -12571459;
            } else {
                $i0 = $i1;
            }
            $i1 = $i6 + $i4 > this.index * 2074797577 ? (this.index * 2074797577) - $i4 : $i6;
            if ($i0 + $i5 > this.data * -467581477) {
                $i0 = (this.data * -467581477) - $i5;
            }
            $i6 = (this.length * -481290979) - $i1;
            $i4 = ((this.length * -481290979) * $i5) + $i4;
            for ($i5 = -$i0; $i5 < 0; $i5++) {
                $i0 = -$i1;
                while ($i0 < 0) {
                    this.size[$i4] = i;
                    $i0++;
                    $i4++;
                }
                $i4 += $i6;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gs.aa(" + ')');
        }
    }

    final void add(int $i0, int $i7, int i, int i2, int i3, int i4) {
        try {
            if ($i0 >= 1829547545 * this.buffer) {
                int $i4 = this.index * 2074797577;
                i4 = $i4;
                if ($i0 < $i4) {
                    $i4 = this.count * -12571459;
                    i4 = $i4;
                    if ($i7 < $i4) {
                        i -= (this.count * -12571459) - $i7;
                        $i7 = this.count * -12571459;
                    }
                    if (i + $i7 > -467581477 * this.data) {
                        i = (-467581477 * this.data) - $i7;
                    }
                    i4 = 256 - i3;
                    int $i5 = i3 * ((i2 >> 16) & 255);
                    int $i6 = i3 * ((i2 >> 8) & 255);
                    i2 = i3 * (i2 & 255);
                    $i0 += (-481290979 * this.length) * $i7;
                    for ($i7 = 0; $i7 < i; $i7++) {
                        $i4 = this.size[$i0] & 255;
                        this.size[$i0] = (((((((this.size[$i0] >> 16) & 255) * i4) + $i5) >> 8) << 16) + ((((((this.size[$i0] >> 8) & 255) * i4) + $i6) >> 8) << 8)) + ((i2 + ($i4 * i4)) >> 8);
                        $i0 += -481290979 * this.length;
                    }
                }
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gs.ab(" + ')');
        }
    }

    public void add(Double doubleR, int i, int i2) {
        int $i8;
        int $i3 = doubleR;
        doubleR = $i3;
        int $i4 = i + $i3.count;
        int $i5 = i2 + doubleR.index;
        $i3 = this.length * -481290979;
        i = $i3;
        i2 = $i4 + ($i3 * $i5);
        int $i6 = 0;
        i = doubleR.data;
        int $i7 = doubleR.length;
        int $i32 = (this.length * -481290979) - $i7;
        if ($i5 < -12571459 * this.count) {
            int $i2 = (this.count * -12571459) - $i5;
            i -= $i2;
            $i5 = -12571459 * this.count;
            $i6 = 0 + ($i2 * $i7);
            i2 += $i2 * (this.length * -481290979);
        }
        if ($i5 + i > -467581477 * this.data) {
            i -= ($i5 + i) - (this.data * -467581477);
        }
        if ($i4 < 1829547545 * this.buffer) {
            $i5 = (1829547545 * this.buffer) - $i4;
            $i7 -= $i5;
            $i8 = 1829547545 * this.buffer;
            $i4 = 0 + $i5;
            $i32 += $i5;
            $i5 = $i6 + $i5;
            $i2 = i2 + $i5;
        } else {
            $i8 = $i4;
            $i5 = $i6;
            $i4 = 0;
            $i2 = i2;
        }
        if ($i7 + $i8 > 2074797577 * this.index) {
            $i3 = ($i8 + $i7) - (2074797577 * this.index);
            $i7 -= $i3;
            $i3 = $i3;
            $i32 += $i3;
            i2 = $i4 + $i3;
        } else {
            i2 = $i4;
        }
        if ($i7 > 0 && i > 0) {
            int[] $r3 = this.size;
            byte[] $r4 = doubleR.buffer;
            int[] $r2 = doubleR.size;
            $i4 = -($i7 >> 2);
            $i6 = -($i7 & 3);
            i = -i;
            while (i < 0) {
                byte $b10;
                for ($i7 = $i4; $i7 < 0; $i7++) {
                    int $i9 = $i5 + 1;
                    $b10 = $r4[$i5];
                    if ($b10 != (byte) 0) {
                        $i5 = $i2 + 1;
                        $r3[$i2] = $r2[$b10 & (short) 255];
                    } else {
                        $i5 = $i2 + 1;
                    }
                    $i8 = $i9 + 1;
                    $b10 = $r4[$i9];
                    if ($b10 != (byte) 0) {
                        $r3[$i5] = $r2[$b10 & (short) 255];
                        $i5++;
                    } else {
                        $i5++;
                    }
                    $i2 = $i8 + 1;
                    $b10 = $r4[$i8];
                    if ($b10 != (byte) 0) {
                        $r3[$i5] = $r2[$b10 & (short) 255];
                        $i8 = $i5 + 1;
                    } else {
                        $i8 = $i5 + 1;
                    }
                    $i5 = $i2 + 1;
                    $b10 = $r4[$i2];
                    if ($b10 != (byte) 0) {
                        $r3[$i8] = $r2[$b10 & (short) 255];
                        $i2 = $i8 + 1;
                    } else {
                        $i2 = $i8 + 1;
                    }
                }
                $i8 = $i2;
                $i2 = $i6;
                while ($i2 < 0) {
                    $i7 = $i5 + 1;
                    $b10 = $r4[$i5];
                    if ($b10 != (byte) 0) {
                        $i5 = $i8 + 1;
                        $r3[$i8] = $r2[$b10 & (short) 255];
                    } else {
                        $i5 = $i8 + 1;
                    }
                    $i2++;
                    $i8 = $i5;
                    $i5 = $i7;
                }
                $i2 = $i8 + $i32;
                i++;
                $i5 += i2;
            }
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
        if (i2 + $i6 > -467581477 * this.data) {
            i2 -= ($i6 + i2) - (this.data * -467581477);
        }
        if ($i6 < this.count * -12571459) {
            $i6 = (-12571459 * this.count) - $i6;
            i2 -= $i6;
            $i11 += (-481290979 * this.length) * $i6;
            $i0 = $i6 * $i3;
            $i6 = $i0;
            $i9 += $i0;
        }
        if ($i5 + i > this.index * 2074797577) {
            $i6 = ($i5 + i) - (2074797577 * this.index);
            i -= $i6;
            $i7 += $i6;
        }
        if ($i5 < this.buffer * 1829547545) {
            $i5 = (this.buffer * 1829547545) - $i5;
            i -= $i5;
            $i11 += $i5;
            $i8 += $i2 * $i5;
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

    public void add(Double doubleR, int i, int i2, short s) {
        try {
            int $i9;
            int $i3 = doubleR;
            doubleR = $i3;
            int $i4 = i + $i3.count;
            int $i5 = i2 + doubleR.index;
            $i3 = this.length * -481290979;
            i = $i3;
            i = $i4 + ($i3 * $i5);
            int $i32 = 0;
            i2 = doubleR.data;
            int $i6 = doubleR.length;
            int $i7 = (this.length * -481290979) - $i6;
            int $i8 = 0;
            if ($i5 < -12571459 * this.count) {
                $i9 = (this.count * -12571459) - $i5;
                i2 -= $i9;
                $i5 = -12571459 * this.count;
                $i32 = 0 + ($i9 * $i6);
                i += $i9 * (this.length * -481290979);
            }
            if ($i5 + i2 > -467581477 * r19.data) {
                i2 -= ($i5 + i2) - (r19.data * -467581477);
            }
            if ($i4 < 1829547545 * r19.buffer) {
                $i5 = (1829547545 * r19.buffer) - $i4;
                $i6 -= $i5;
                $i4 = 1829547545 * r19.buffer;
                $i32 += $i5;
                i += $i5;
                $i8 = 0 + $i5;
                $i7 += $i5;
            }
            if ($i6 + $i4 > 2074797577 * r19.index) {
                $i4 = ($i4 + $i6) - (2074797577 * r19.index);
                $i6 -= $i4;
                $i7 += $i4;
                $i4 = $i8 + $i4;
                $i8 = $i6;
            } else {
                $i4 = $i8;
                $i8 = $i6;
            }
            if ($i8 > 0 && i2 > 0) {
                int[] $r3 = r19.size;
                byte[] $r4 = doubleR.buffer;
                int[] $r2 = doubleR.size;
                $i6 = -($i8 >> 2);
                $i8 = -($i8 & 3);
                i2 = -i2;
                $i9 = $i32;
                while (i2 < 0) {
                    byte $b11;
                    $i32 = $i6;
                    while ($i32 < 0) {
                        $i5 = $i9 + 1;
                        $b11 = $r4[$i9];
                        if ($b11 != (byte) 0) {
                            $r3[i] = $r2[$b11 & (short) 255];
                            i++;
                        } else {
                            i++;
                        }
                        $i9 = $i5 + 1;
                        $b11 = $r4[$i5];
                        if ($b11 != (byte) 0) {
                            $r3[i] = $r2[$b11 & (short) 255];
                            $i5 = i + 1;
                        } else {
                            $i5 = i + 1;
                        }
                        i = $i9 + 1;
                        $b11 = $r4[$i9];
                        if ($b11 != (byte) 0) {
                            $r3[$i5] = $r2[$b11 & (short) 255];
                            $i9 = $i5 + 1;
                        } else {
                            $i9 = $i5 + 1;
                        }
                        $i5 = i + 1;
                        $b11 = $r4[i];
                        if ($b11 != (byte) 0) {
                            i = $i9 + 1;
                            $r3[$i9] = $r2[$b11 & (short) 255];
                        } else {
                            i = $i9 + 1;
                        }
                        $i32++;
                        $i9 = $i5;
                    }
                    $i32 = $i8;
                    while ($i32 < 0) {
                        $i5 = $i9 + 1;
                        $b11 = $r4[$i9];
                        if ($b11 != (byte) 0) {
                            $i9 = i + 1;
                            $r3[i] = $r2[$b11 & (short) 255];
                        } else {
                            $i9 = i + 1;
                        }
                        $i32++;
                        i = $i9;
                        $i9 = $i5;
                    }
                    i += $i7;
                    i2++;
                    $i9 += $i4;
                }
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "gs.ao(" + ')');
        }
    }

    public final void add(Long longR, int i, int i2) {
        i += longR.next;
        int $i3 = i2 + longR.value;
        int $i1 = (-481290979 * this.length) * $i3;
        i2 = $i1;
        i2 = $i1 + i;
        int $i4 = 0;
        int $i5 = longR.data;
        int $i6 = longR.length;
        int $i2 = (-481290979 * this.length) - $i6;
        if ($i3 < -12571459 * this.count) {
            int $i7 = (this.count * -12571459) - $i3;
            $i5 -= $i7;
            $i3 = -12571459 * this.count;
            $i4 = 0 + ($i7 * $i6);
            i2 += $i7 * (this.length * -481290979);
        }
        if ($i5 + $i3 > -467581477 * this.data) {
            $i1 = this.data * -467581477;
            $i7 = $i1;
            $i5 -= ($i3 + $i5) - $i1;
        }
        if (i < 1829547545 * this.buffer) {
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
        if ($i7 + $i6 > this.index * 2074797577) {
            $i1 = ($i7 + $i6) - (2074797577 * this.index);
            i = $i1;
            $i6 -= $i1;
            $i3 += i;
            i += $i2;
        } else {
            i = $i2;
        }
        if ($i6 > 0 && $i5 > 0) {
            PolynomialGF2mSmallM.add(this.size, longR.size, 0, $i4, i2, $i6, $i5, i, $i3, 1728372265);
        }
    }

    public final void add(Long longR, int $i0, int i, byte b) {
        try {
            int $i9;
            int $i92;
            $i0 = longR.next + $i0;
            int $i4 = longR.value + i;
            i = $i0 + ((-481290979 * this.length) * $i4);
            int $i5 = 0;
            int $i3 = longR.data;
            int $i6 = longR.length;
            int $i7 = (this.length * -481290979) - $i6;
            int $i8 = 0;
            if ($i4 < -12571459 * this.count) {
                $i9 = (this.count * -12571459) - $i4;
                $i3 -= $i9;
                $i4 = -12571459 * this.count;
                $i5 = 0 + ($i6 * $i9);
                i += $i9 * (this.length * -481290979);
            }
            if ($i4 + $i3 > -467581477 * this.data) {
                $i92 = this.data * -467581477;
                $i9 = $i92;
                $i3 -= ($i4 + $i3) - $i92;
            }
            if ($i0 < 1829547545 * this.buffer) {
                $i4 = (1829547545 * this.buffer) - $i0;
                $i6 -= $i4;
                $i0 = this.buffer * 1829547545;
                $i5 += $i4;
                i += $i4;
                $i8 = 0 + $i4;
                $i7 += $i4;
            }
            if ($i6 + $i0 > 2074797577 * this.index) {
                $i92 = ($i0 + $i6) - (this.index * 2074797577);
                $i0 = $i92;
                $i6 -= $i92;
                $i8 += $i0;
                $i7 += $i0;
            }
            if ($i6 > 0 && $i3 > 0) {
                HashMap.read(this.size, longR.size, $i5, i, $i6, $i3, $i7, $i8, 1717918682);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gs.ai(" + ')');
        }
    }

    public void add(Long longR, int i, int i2, int i3) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        int $i0 = this.length * -481290979;
        i = $i0;
        $i0 *= $i4;
        i = $i0;
        i = $i0 + $i3;
        int i4 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        i2 = (-481290979 * this.length) - i6;
        if ($i4 < -12571459 * this.count) {
            int $i8 = (-12571459 * this.count) - $i4;
            i5 -= $i8;
            $i4 = this.count * -12571459;
            i4 = 0 + (i6 * $i8);
            i += $i8 * (this.length * -481290979);
        }
        if ($i4 + i5 > -467581477 * this.data) {
            i5 -= ($i4 + i5) - (-467581477 * this.data);
        }
        if ($i3 < 1829547545 * this.buffer) {
            $i3 = (1829547545 * this.buffer) - $i3;
            i6 -= $i3;
            $i8 = 1829547545 * this.buffer;
            i += $i3;
            $i4 = 0 + $i3;
            i2 += $i3;
            $i3 = i4 + $i3;
        } else {
            $i4 = 0;
            $i8 = $i3;
            $i3 = i4;
        }
        if (i6 + $i8 > this.index * 2074797577) {
            i4 = ($i8 + i6) - (this.index * 2074797577);
            i6 -= i4;
            $i4 += i4;
            i2 += i4;
        }
        if (i6 > 0 && i5 > 0) {
            read(this.size, longR.size, 0, $i3, i, 0, 0, i6, i5, i2, $i4, i3, -766246002);
        }
    }

    public void add(Long longR, int i, int i2, int i3, int i4) {
        if (i3 > longR.this$0 || i4 > longR.count) {
            throw new IllegalArgumentException();
        }
        int $i13 = longR.next * i3;
        int $i28 = longR.this$0;
        $i13 = ($i13 / $i28) + i;
        $i28 = longR.length + longR.next;
        int i5 = $i28;
        $i28 = ((($i28 * i3) + longR.this$0) - 1) / longR.this$0;
        i5 = $i28;
        i5 = $i28 + i;
        $i28 = longR.value;
        int $i26 = (($i28 * i4) / longR.count) + i2;
        $i28 = longR.value + longR.data;
        int i6 = $i28;
        $i28 = ((longR.count + ($i28 * i4)) - 1) / longR.count;
        int i7 = $i28;
        i7 = $i28 + i2;
        $i28 = this.buffer * 1829547545;
        i6 = $i28;
        if ($i13 < $i28) {
            $i13 = 1829547545 * this.buffer;
        }
        if (i5 > this.index * 2074797577) {
            i5 = 2074797577 * this.index;
        }
        if ($i26 < this.count * -12571459) {
            $i26 = this.count * -12571459;
        }
        if (i7 > -467581477 * this.data) {
            i7 = -467581477 * this.data;
        }
        if ($i13 < i5 && $i26 < i7) {
            i6 = $i13 + ((-481290979 * this.length) * $i26);
            int i8 = (this.length * -481290979) - (i5 - $i13);
            $i28 = this.size;
            int[] $r3 = $i28;
            if (i6 < $i28.length) {
                while ($i26 < i7) {
                    for (int $i27 = $i13; $i27 < i5; $i27++) {
                        int $i9 = ($i27 - i) << 4;
                        int $i8 = ($i26 - i2) << 4;
                        int $i14 = ((longR.this$0 * $i9) / i3) - (longR.next << 4);
                        $i9 = ((($i9 + 16) * longR.this$0) / i3) - (longR.next << 4);
                        int $i15 = ((longR.count * $i8) / i4) - (longR.value << 4);
                        $i28 = ($i8 + 16) * longR.count;
                        $i8 = $i28;
                        int $i10 = ($i28 / i4) - (longR.value << 4);
                        $i8 = (($i10 - $i15) * ($i9 - $i14)) >> 1;
                        if ($i8 != 0) {
                            if ($i14 < 0) {
                                $i14 = 0;
                            }
                            if ($i9 >= (longR.length << 4)) {
                                $i9 = longR.length << 4;
                            }
                            if ($i15 < 0) {
                                $i15 = 0;
                            }
                            if ($i10 >= (longR.data << 4)) {
                                $i10 = longR.data << 4;
                            }
                            int $i11 = $i9 - 1;
                            int $i16 = $i10 - 1;
                            $i9 = 16 - ($i14 & 15);
                            $i10 = ($i11 & 15) + 1;
                            int $i5 = 16 - ($i15 & 15);
                            int $i17 = ($i16 & 15) + 1;
                            int $i4 = $i14 >> 4;
                            $i11 >>= 4;
                            int $i6 = $i15 >> 4;
                            int $i12 = $i16 >> 4;
                            $i16 = 0;
                            int i9 = 0;
                            $i14 = 0;
                            $i15 = 0;
                            for (int $i19 = $i6; $i19 <= $i12; $i19++) {
                                int $i20 = 16;
                                if ($i6 == $i19) {
                                    $i20 = $i5;
                                }
                                if ($i12 == $i19) {
                                    $i20 = $i17;
                                }
                                int $i21 = $i4;
                                while ($i21 <= $i11) {
                                    $r3 = longR.size;
                                    $i28 = longR.length;
                                    $i28 *= $i19;
                                    int i10 = $i28;
                                    int $i23 = $r3[$i28 + $i21];
                                    if ($i23 != 0) {
                                        i10 = $i21 == $i4 ? $i20 * $i9 : $i21 == $i11 ? $i20 * $i10 : $i20 << 4;
                                        $i15 += i10;
                                        $i28 = ($i23 >> 16) & 255;
                                        $i28 *= i10;
                                        int i11 = $i28;
                                        $i16 += $i28;
                                        $i28 = ($i23 >> 8) & 255;
                                        i9 += $i28 * i10;
                                        $i28 = i10 * ($i23 & 255);
                                        i10 = $i28;
                                        $i14 += $i28;
                                    }
                                    $i21++;
                                }
                            }
                            if ($i15 >= $i8) {
                                $i8 = (((i9 / $i15) << 8) + (($i16 / $i15) << 16)) + ($i14 / $i15);
                                if ($i8 == 0) {
                                    $i8 = 1;
                                }
                                this.size[i6] = $i8;
                            }
                            i6++;
                        }
                    }
                    i6 += i8;
                    $i26++;
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
                $i7 = $i5 + ((this.length * -481290979) * $i6);
                $i0 = this.length * -481290979;
                $i11 = $i0;
                $i11 = $i0 - i;
                if (i2 + $i6 > -467581477 * this.data) {
                    i2 -= ($i6 + i2) - (this.data * -467581477);
                }
                if ($i6 < this.count * -12571459) {
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
                    $i6 = (i + $i5) - (2074797577 * this.index);
                    i -= $i6;
                    $i11 += $i6;
                }
                if ($i5 < this.buffer * 1829547545) {
                    $i5 = (this.buffer * 1829547545) - $i5;
                    i -= $i5;
                    $i7 += $i5;
                    $i8 += i4 * $i5;
                    $i11 += $i5;
                }
                Geometry.toString(this.size, longR.size, 0, $i8, $i9, $i7, $i11, i, i2, i4, i5, i3, 1976898552);
            } catch (Throwable $r4) {
                throw StringBuilder.append($r4, "gs.ax(" + ')');
            }
        }
    }

    void add(Long longR, int i, int i2, int i3, int $i3, int i4, int i5) {
        if (i5 != 0) {
            int $i7 = i - (longR.next << 4);
            int $i8 = i2 - (longR.value << 4);
            double $d0 = 9.587379924285257E-5d * ((double) (65535 & i4));
            double $d1 = (Math.sin($d0) * ((double) i5)) + 0.5d;
            double d = $d1;
            i = (int) Math.floor($d1);
            $d1 = (Math.cos($d0) * ((double) i5)) + 0.5d;
            d = $d1;
            i4 = (int) Math.floor($d1);
            int $i1 = -$i7;
            i2 = ($i1 * i4) + ((-$i8) * i);
            int $i6 = ((-(-$i7)) * i) + ((-$i8) * i4);
            int $i9 = ((-$i8) * i) + (((longR.length << 4) - $i7) * i4);
            int $i10 = ((-$i8) * i4) + ((-((longR.length << 4) - $i7)) * i);
            int $i11 = (((longR.data << 4) - $i8) * i) + ((-$i7) * i4);
            int $i12 = (((longR.data << 4) - $i8) * i4) + ((-(-$i7)) * i);
            int $i13 = (((longR.length << 4) - $i7) * i4) + (((longR.data << 4) - $i8) * i);
            i4 *= (longR.data << 4) - $i8;
            $i1 = i * (-((longR.length << 4) - $i7));
            i = $i1;
            i = $i1 + i4;
            if (i2 >= $i9) {
                i4 = i2;
                i2 = $i9;
                $i9 = i4;
            }
            if ($i11 < i2) {
                i2 = $i11;
            }
            if ($i13 < i2) {
                i2 = $i13;
            }
            if ($i11 <= $i9) {
                $i11 = $i9;
            }
            if ($i13 <= $i11) {
                $i13 = $i11;
            }
            if ($i6 < $i10) {
                i4 = $i10;
                $i10 = $i6;
                $i6 = i4;
            }
            if ($i12 < $i10) {
                $i10 = $i12;
            }
            if (i < $i10) {
                $i10 = i;
            }
            if ($i12 <= $i6) {
                $i12 = $i6;
            }
            if (i <= $i12) {
                i = $i12;
            }
            $i6 = ((i + 4095) >> 12) + $i3;
            i2 = ((i2 >> 12) + i3) >> 4;
            i = (((($i13 + 4095) >> 12) + i3) + 15) >> 4;
            $i9 = (($i10 >> 12) + $i3) >> 4;
            i4 = ($i6 + 15) >> 4;
            if (i2 < 1829547545 * this.buffer) {
                i2 = 1829547545 * this.buffer;
            }
            if (i > 2074797577 * this.index) {
                i = 2074797577 * this.index;
            }
            if ($i9 < -12571459 * this.count) {
                $i9 = this.count * -12571459;
            }
            if (i4 > this.data * -467581477) {
                i4 = this.data * -467581477;
            }
            i = i2 - i;
            if (i < 0) {
                $i10 = $i9 - i4;
                if ($i10 < 0) {
                    $i1 = this.length * -481290979;
                    i4 = $i1;
                    $i6 = ($i1 * $i9) + i2;
                    d = 1.6777216E7d / ((double) i5);
                    $d1 = (Math.sin($d0) * d) + 0.5d;
                    double d2 = $d1;
                    i4 = (int) Math.floor($d1);
                    $d1 = (d * Math.cos($d0)) + 0.5d;
                    $d0 = $d1;
                    i5 = (int) Math.floor($d1);
                    i2 = ((i2 << 4) + 8) - i3;
                    $i3 = (($i9 << 4) + 8) - $i3;
                    i3 = ($i7 << 8) - (($i3 * i4) >> 4);
                    $i3 = (($i3 * i5) >> 4) + ($i8 << 8);
                    if (i5 == 0) {
                        if (i4 == 0) {
                            for (i2 = $i10; i2 < 0; i2++) {
                                if (i3 >= 0 && $i3 >= 0 && i3 - (longR.length << 12) < 0 && $i3 - (longR.data << 12) < 0) {
                                    i4 = i;
                                    i5 = $i6;
                                    while (i4 < 0) {
                                        $i8 = longR.size[(i3 >> 12) + (longR.length * ($i3 >> 12))];
                                        if ($i8 != 0) {
                                            $i7 = i5 + 1;
                                            this.size[i5] = $i8;
                                        } else {
                                            $i7 = i5 + 1;
                                        }
                                        i4++;
                                        i5 = $i7;
                                    }
                                }
                                $i1 = this.length * -481290979;
                                i4 = $i1;
                                $i6 += $i1;
                            }
                        } else if (i4 < 0) {
                            i5 = $i10;
                            while (i5 < 0) {
                                $i8 = $i3 + ((i4 * i2) >> 4);
                                if (i3 >= 0) {
                                    if (i3 - (longR.length << 12) < 0) {
                                        $i7 = $i8 - (longR.data << 12);
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
                                            $i10 = longR.size[(($i8 >> 12) * longR.length) + (i3 >> 12)];
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
                                $i6 += this.length * -481290979;
                                i5++;
                                i3 -= i4;
                            }
                        } else {
                            i5 = $i10;
                            while (i5 < 0) {
                                $i8 = ((i4 * i2) >> 4) + $i3;
                                if (i3 >= 0) {
                                    if (i3 - (longR.length << 12) < 0) {
                                        if ($i8 < 0) {
                                            $i9 = ((i4 - 1) - $i8) / i4;
                                            $i7 = i + $i9;
                                            $i8 += $i9 * i4;
                                            $i9 += $i6;
                                        } else {
                                            $i7 = i;
                                            $i9 = $i6;
                                        }
                                        $i10 = ((($i8 + 1) - (longR.data << 12)) - i4) / i4;
                                        if ($i10 > $i7) {
                                            $i7 = $i10;
                                        }
                                        while ($i7 < 0) {
                                            $i10 = longR.size[(i3 >> 12) + (longR.length * ($i8 >> 12))];
                                            if ($i10 != 0) {
                                                $i11 = $i9 + 1;
                                                this.size[$i9] = $i10;
                                            } else {
                                                $i11 = $i9 + 1;
                                            }
                                            $i8 += i4;
                                            $i7++;
                                            $i9 = $i11;
                                        }
                                    }
                                }
                                $i6 += this.length * -481290979;
                                i5++;
                                i3 -= i4;
                            }
                        }
                    } else if (i5 < 0) {
                        if (i4 == 0) {
                            i4 = $i10;
                            while (i4 < 0) {
                                $i8 = ((i2 * i5) >> 4) + i3;
                                if ($i3 >= 0 && $i3 - (longR.data << 12) < 0) {
                                    $i7 = $i8 - (longR.length << 12);
                                    if ($i7 >= 0) {
                                        $i7 = (i5 - $i7) / i5;
                                        $i9 = i + $i7;
                                        $i8 += i5 * $i7;
                                        $i7 += $i6;
                                    } else {
                                        $i9 = i;
                                        $i7 = $i6;
                                    }
                                    $i10 = ($i8 - i5) / i5;
                                    if ($i10 > $i9) {
                                        $i9 = $i10;
                                    }
                                    while ($i9 < 0) {
                                        $i10 = longR.size[($i8 >> 12) + (longR.length * ($i3 >> 12))];
                                        if ($i10 != 0) {
                                            $i11 = $i7 + 1;
                                            this.size[$i7] = $i10;
                                        } else {
                                            $i11 = $i7 + 1;
                                        }
                                        $i8 += i5;
                                        $i9++;
                                        $i7 = $i11;
                                    }
                                }
                                $i6 += this.length * -481290979;
                                i4++;
                                $i3 += i5;
                            }
                        } else if (i4 < 0) {
                            $i8 = $i10;
                            $i7 = i3;
                            i3 = $i6;
                            while ($i8 < 0) {
                                $i6 = $i7 + ((i2 * i5) >> 4);
                                $i9 = $i3 + ((i4 * i2) >> 4);
                                $i10 = $i6 - (longR.length << 12);
                                if ($i10 >= 0) {
                                    $i11 = (i5 - $i10) / i5;
                                    $i10 = i + $i11;
                                    $i6 += i5 * $i11;
                                    $i9 += i4 * $i11;
                                    $i11 += i3;
                                } else {
                                    $i10 = i;
                                    $i11 = i3;
                                }
                                $i12 = ($i6 - i5) / i5;
                                if ($i12 > $i10) {
                                    $i10 = $i12;
                                }
                                $i12 = $i9 - (longR.data << 12);
                                if ($i12 >= 0) {
                                    $i12 = (i4 - $i12) / i4;
                                    $i10 += $i12;
                                    $i6 += i5 * $i12;
                                    $i9 += $i12 * i4;
                                    $i11 += $i12;
                                }
                                $i12 = ($i9 - i4) / i4;
                                if ($i12 > $i10) {
                                    $i10 = $i12;
                                }
                                while ($i10 < 0) {
                                    $i12 = longR.size[($i6 >> 12) + (($i9 >> 12) * longR.length)];
                                    if ($i12 != 0) {
                                        $i13 = $i11 + 1;
                                        this.size[$i11] = $i12;
                                    } else {
                                        $i13 = $i11 + 1;
                                    }
                                    $i6 += i5;
                                    $i9 += i4;
                                    $i10++;
                                    $i11 = $i13;
                                }
                                i3 += this.length * -481290979;
                                $i8++;
                                $i3 += i5;
                                $i7 -= i4;
                            }
                        } else {
                            $i8 = $i10;
                            $i7 = i3;
                            i3 = $i6;
                            while ($i8 < 0) {
                                $i6 = $i7 + ((i5 * i2) >> 4);
                                $i9 = $i3 + ((i2 * i4) >> 4);
                                $i10 = $i6 - (longR.length << 12);
                                if ($i10 >= 0) {
                                    $i11 = (i5 - $i10) / i5;
                                    $i10 = i + $i11;
                                    $i6 += i5 * $i11;
                                    $i9 += $i11 * i4;
                                    $i11 += i3;
                                } else {
                                    $i10 = i;
                                    $i11 = i3;
                                }
                                $i12 = ($i6 - i5) / i5;
                                if ($i12 > $i10) {
                                    $i10 = $i12;
                                }
                                if ($i9 < 0) {
                                    $i12 = ((i4 - 1) - $i9) / i4;
                                    $i10 += $i12;
                                    $i6 += i5 * $i12;
                                    $i9 += $i12 * i4;
                                    $i11 += $i12;
                                }
                                $i12 = ((($i9 + 1) - (longR.data << 12)) - i4) / i4;
                                if ($i12 > $i10) {
                                    $i10 = $i12;
                                }
                                while ($i10 < 0) {
                                    $i12 = longR.size[($i6 >> 12) + (($i9 >> 12) * longR.length)];
                                    if ($i12 != 0) {
                                        $i13 = $i11 + 1;
                                        this.size[$i11] = $i12;
                                    } else {
                                        $i13 = $i11 + 1;
                                    }
                                    $i6 += i5;
                                    $i9 += i4;
                                    $i10++;
                                    $i11 = $i13;
                                }
                                i3 += this.length * -481290979;
                                $i8++;
                                $i3 += i5;
                                $i7 -= i4;
                            }
                        }
                    } else if (i4 == 0) {
                        i4 = $i10;
                        while (i4 < 0) {
                            $i8 = i3 + ((i2 * i5) >> 4);
                            if ($i3 >= 0) {
                                if ($i3 - (longR.data << 12) < 0) {
                                    if ($i8 < 0) {
                                        $i9 = ((i5 - 1) - $i8) / i5;
                                        $i7 = i + $i9;
                                        $i8 += $i9 * i5;
                                        $i9 += $i6;
                                    } else {
                                        $i7 = i;
                                        $i9 = $i6;
                                    }
                                    $i10 = ((($i8 + 1) - (longR.length << 12)) - i5) / i5;
                                    if ($i10 > $i7) {
                                        $i7 = $i10;
                                    }
                                    while ($i7 < 0) {
                                        $i10 = longR.size[($i8 >> 12) + (longR.length * ($i3 >> 12))];
                                        if ($i10 != 0) {
                                            $i11 = $i9 + 1;
                                            this.size[$i9] = $i10;
                                        } else {
                                            $i11 = $i9 + 1;
                                        }
                                        $i8 += i5;
                                        $i7++;
                                        $i9 = $i11;
                                    }
                                }
                            }
                            $i6 += this.length * -481290979;
                            i4++;
                            $i3 += i5;
                        }
                    } else if (i4 < 0) {
                        $i8 = $i10;
                        $i7 = i3;
                        i3 = $i6;
                        while ($i8 < 0) {
                            $i6 = ((i5 * i2) >> 4) + $i7;
                            $i9 = $i3 + ((i4 * i2) >> 4);
                            if ($i6 < 0) {
                                $i11 = ((i5 - 1) - $i6) / i5;
                                $i10 = i + $i11;
                                $i6 += $i11 * i5;
                                $i9 += i4 * $i11;
                                $i11 += i3;
                            } else {
                                $i10 = i;
                                $i11 = i3;
                            }
                            $i12 = ((($i6 + 1) - (longR.length << 12)) - i5) / i5;
                            if ($i12 > $i10) {
                                $i10 = $i12;
                            }
                            $i12 = $i9 - (longR.data << 12);
                            if ($i12 >= 0) {
                                $i12 = (i4 - $i12) / i4;
                                $i10 += $i12;
                                $i6 += $i12 * i5;
                                $i9 += $i12 * i4;
                                $i11 += $i12;
                            }
                            $i12 = ($i9 - i4) / i4;
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
                                $i6 += i5;
                                $i9 += i4;
                                $i10++;
                                $i11 = $i13;
                            }
                            i3 += this.length * -481290979;
                            $i8++;
                            $i3 += i5;
                            $i7 -= i4;
                        }
                    } else {
                        $i8 = $i10;
                        $i7 = i3;
                        i3 = $i6;
                        while ($i8 < 0) {
                            $i6 = $i7 + ((i2 * i5) >> 4);
                            $i9 = ((i4 * i2) >> 4) + $i3;
                            if ($i6 < 0) {
                                $i11 = ((i5 - 1) - $i6) / i5;
                                $i10 = i + $i11;
                                $i6 += i5 * $i11;
                                $i9 += $i11 * i4;
                                $i11 += i3;
                            } else {
                                $i10 = i;
                                $i11 = i3;
                            }
                            $i12 = ((($i6 + 1) - (longR.length << 12)) - i5) / i5;
                            if ($i12 > $i10) {
                                $i10 = $i12;
                            }
                            if ($i9 < 0) {
                                $i12 = ((i4 - 1) - $i9) / i4;
                                $i10 += $i12;
                                $i6 += i5 * $i12;
                                $i9 += $i12 * i4;
                                $i11 += $i12;
                            }
                            $i12 = ((($i9 + 1) - (longR.data << 12)) - i4) / i4;
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
                                $i6 += i5;
                                $i9 += i4;
                                $i10++;
                                $i11 = $i13;
                            }
                            i3 += -481290979 * this.length;
                            $i8++;
                            $i3 += i5;
                            $i7 -= i4;
                        }
                    }
                }
            }
        }
    }

    public void add(Long longR, int i, int $i1, int i2, int i3, int $i4, int $i5, double d, int i4) {
        int $i9 = (-i2) / 2;
        int $i10 = (-i3) / 2;
        try {
            int $i7 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            $i7 = ($i7 * i4) >> 8;
            i4 = (i4 * ((int) $d0)) >> 8;
            $i4 = ($i4 << 16) + (($i7 * $i10) + (i4 * $i9));
            $i5 = ($i5 << 16) + (($i10 * i4) - ($i9 * $i7));
            i += (this.length * -481290979) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i9 = $i5;
                $i10 = $i4;
                int $i11 = i;
                int $i12 = -i2;
                while ($i12 < 0) {
                    int $i13;
                    int $i8 = longR.size[($i10 >> 16) + (($i9 >> 16) * longR.length)];
                    if ($i8 != 0) {
                        $i13 = $i11 + 1;
                        this.size[$i11] = $i8;
                    } else {
                        $i13 = $i11 + 1;
                    }
                    $i10 += i4;
                    $i9 -= $i7;
                    $i12++;
                    $i11 = $i13;
                }
                $i4 += $i7;
                $i5 += i4;
                i += this.length * -481290979;
            }
        } catch (Exception e) {
        }
    }

    public void add(Long longR, int i, int $i1, int i2, int i3, int $i4, int $i5, double d, int i4, int i5) {
        int $i9 = (-i2) / 2;
        int $i10 = (-i3) / 2;
        try {
            i5 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            i5 = (i5 * i4) >> 8;
            i4 = (i4 * ((int) $d0)) >> 8;
            $i4 = ($i4 << 16) + ((i5 * $i10) + (i4 * $i9));
            $i5 = ($i5 << 16) + (($i10 * i4) - ($i9 * i5));
            i += (this.length * -481290979) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i9 = $i5;
                $i10 = $i4;
                int $i11 = i;
                int $i12 = -i2;
                while ($i12 < 0) {
                    int $i13;
                    int $i8 = longR.size[($i10 >> 16) + (($i9 >> 16) * longR.length)];
                    if ($i8 != 0) {
                        try {
                            $i13 = $i11 + 1;
                            this.size[$i11] = $i8;
                        } catch (RuntimeException $r3) {
                            throw StringBuilder.append($r3, "gs.bp(" + ')');
                        }
                    }
                    $i13 = $i11 + 1;
                    $i10 += i4;
                    $i9 -= i5;
                    $i12++;
                    $i11 = $i13;
                }
                $i4 += i5;
                $i5 += i4;
                i += this.length * -481290979;
            }
        } catch (Exception e) {
        }
    }

    void add(Long longR, int i, int i2, int $i2, int i3, int $i4, int i4, int i5) {
        if (i4 != 0) {
            int $i7 = i - (longR.next << 4);
            i5 = i2 - (longR.value << 4);
            double $d0 = 9.587379924285257E-5d * ((double) (65535 & $i4));
            double $d1 = (Math.sin($d0) * ((double) i4)) + 0.5d;
            double d = $d1;
            i = (int) Math.floor($d1);
            $d1 = (Math.cos($d0) * ((double) i4)) + 0.5d;
            d = $d1;
            $i4 = (int) Math.floor($d1);
            int $i1 = -$i7;
            i2 = ($i1 * $i4) + ((-i5) * i);
            int $i8 = ((-(-$i7)) * i) + ((-i5) * $i4);
            int $i9 = ((-i5) * i) + (((longR.length << 4) - $i7) * $i4);
            int $i10 = ((-i5) * $i4) + ((-((longR.length << 4) - $i7)) * i);
            int $i12 = (((longR.data << 4) - i5) * i) + ((-$i7) * $i4);
            int $i11 = (((longR.data << 4) - i5) * $i4) + ((-(-$i7)) * i);
            int $i13 = (((longR.length << 4) - $i7) * $i4) + (((longR.data << 4) - i5) * i);
            $i1 = i * (-((longR.length << 4) - $i7));
            i = $i1;
            i = $i1 + ($i4 * ((longR.data << 4) - i5));
            if (i2 >= $i9) {
                $i4 = i2;
                i2 = $i9;
                $i9 = $i4;
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
                $i4 = $i10;
                $i10 = $i8;
                $i8 = $i4;
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
            $i8 = $i10 >> 12;
            $i9 = (i2 >> 12) + $i2;
            i2 = $i8 + i3;
            $i4 = ((i + 4095) >> 12) + i3;
            $i8 = $i9 >> 4;
            i = (((($i13 + 4095) >> 12) + $i2) + 15) >> 4;
            $i9 = i2 >> 4;
            i2 = ($i4 + 15) >> 4;
            if ($i8 < 1829547545 * this.buffer) {
                $i8 = 1829547545 * this.buffer;
            }
            try {
                if (i > 2074797577 * this.index) {
                    i = 2074797577 * this.index;
                }
                if ($i9 < -12571459 * this.count) {
                    $i9 = this.count * -12571459;
                }
                if (i2 > this.data * -467581477) {
                    i2 = this.data * -467581477;
                }
                i = $i8 - i;
                if (i < 0) {
                    $i10 = $i9 - i2;
                    if ($i10 < 0) {
                        $i1 = this.length * -481290979;
                        i2 = $i1;
                        $i1 *= $i9;
                        i2 = $i1;
                        i2 = $i1 + $i8;
                        d = 1.6777216E7d / ((double) i4);
                        $d1 = (Math.sin($d0) * d) + 0.5d;
                        double d2 = $d1;
                        $i4 = (int) Math.floor($d1);
                        i4 = (int) Math.floor((Math.cos($d0) * d) + 0.5d);
                        $i2 = (($i8 << 4) + 8) - $i2;
                        $i8 = (($i9 << 4) + 8) - i3;
                        i3 = ($i7 << 8) - (($i8 * $i4) >> 4);
                        i5 = (($i8 * i4) >> 4) + (i5 << 8);
                        if (i4 == 0) {
                            if ($i4 == 0) {
                                for ($i2 = $i10; $i2 < 0; $i2++) {
                                    if (i3 >= 0 && i5 >= 0) {
                                        if (i3 - (longR.length << 12) < 0) {
                                            if (i5 - (longR.data << 12) < 0) {
                                                $i4 = i;
                                                i4 = i2;
                                                while ($i4 < 0) {
                                                    $i7 = longR.size[(i3 >> 12) + (longR.length * (i5 >> 12))];
                                                    if ($i7 != 0) {
                                                        $i8 = i4 + 1;
                                                        this.size[i4] = $i7;
                                                    } else {
                                                        $i8 = i4 + 1;
                                                    }
                                                    $i4++;
                                                    i4 = $i8;
                                                }
                                            }
                                        }
                                    }
                                    i2 += this.length * -481290979;
                                }
                            } else if ($i4 < 0) {
                                i4 = $i10;
                                while (i4 < 0) {
                                    $i7 = i5 + (($i4 * $i2) >> 4);
                                    if (i3 >= 0) {
                                        if (i3 - (longR.length << 12) < 0) {
                                            $i8 = $i7 - (longR.data << 12);
                                            if ($i8 >= 0) {
                                                $i9 = ($i4 - $i8) / $i4;
                                                $i8 = i + $i9;
                                                $i7 += $i9 * $i4;
                                                $i9 = i2 + $i9;
                                            } else {
                                                $i8 = i;
                                                $i9 = i2;
                                            }
                                            $i10 = ($i7 - $i4) / $i4;
                                            if ($i10 > $i8) {
                                                $i8 = $i10;
                                            }
                                            while ($i8 < 0) {
                                                $i10 = longR.size[(($i7 >> 12) * longR.length) + (i3 >> 12)];
                                                if ($i10 != 0) {
                                                    $i12 = $i9 + 1;
                                                    this.size[$i9] = $i10;
                                                } else {
                                                    $i12 = $i9 + 1;
                                                }
                                                $i7 += $i4;
                                                $i8++;
                                                $i9 = $i12;
                                            }
                                        }
                                    }
                                    i2 += this.length * -481290979;
                                    i4++;
                                    i3 -= $i4;
                                }
                            } else {
                                i4 = $i10;
                                while (i4 < 0) {
                                    $i7 = (($i4 * $i2) >> 4) + i5;
                                    if (i3 >= 0) {
                                        if (i3 - (longR.length << 12) < 0) {
                                            if ($i7 < 0) {
                                                $i9 = (($i4 - 1) - $i7) / $i4;
                                                $i8 = i + $i9;
                                                $i7 += $i9 * $i4;
                                                $i9 = i2 + $i9;
                                            } else {
                                                $i8 = i;
                                                $i9 = i2;
                                            }
                                            $i10 = ((($i7 + 1) - (longR.data << 12)) - $i4) / $i4;
                                            if ($i10 > $i8) {
                                                $i8 = $i10;
                                            }
                                            while ($i8 < 0) {
                                                $i10 = longR.size[(i3 >> 12) + (longR.length * ($i7 >> 12))];
                                                if ($i10 != 0) {
                                                    $i12 = $i9 + 1;
                                                    this.size[$i9] = $i10;
                                                } else {
                                                    $i12 = $i9 + 1;
                                                }
                                                $i7 += $i4;
                                                $i8++;
                                                $i9 = $i12;
                                            }
                                        }
                                    }
                                    i2 += this.length * -481290979;
                                    i4++;
                                    i3 -= $i4;
                                }
                            }
                        } else if (i4 < 0) {
                            if ($i4 == 0) {
                                $i4 = $i10;
                                while ($i4 < 0) {
                                    $i7 = (($i2 * i4) >> 4) + i3;
                                    if (i5 >= 0) {
                                        if (i5 - (longR.data << 12) < 0) {
                                            $i8 = $i7 - (longR.length << 12);
                                            if ($i8 >= 0) {
                                                $i9 = (i4 - $i8) / i4;
                                                $i8 = i + $i9;
                                                $i7 += i4 * $i9;
                                                $i9 = i2 + $i9;
                                            } else {
                                                $i8 = i;
                                                $i9 = i2;
                                            }
                                            $i10 = ($i7 - i4) / i4;
                                            if ($i10 > $i8) {
                                                $i8 = $i10;
                                            }
                                            while ($i8 < 0) {
                                                $i10 = longR.size[($i7 >> 12) + (longR.length * (i5 >> 12))];
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
                                    i2 += this.length * -481290979;
                                    $i4++;
                                    i5 += i4;
                                }
                            } else if ($i4 < 0) {
                                $i7 = $i10;
                                while ($i7 < 0) {
                                    $i8 = i3 + (($i2 * i4) >> 4);
                                    $i9 = i5 + (($i4 * $i2) >> 4);
                                    $i10 = $i8 - (longR.length << 12);
                                    if ($i10 >= 0) {
                                        $i10 = (i4 - $i10) / i4;
                                        $i11 = i + $i10;
                                        $i8 += i4 * $i10;
                                        $i9 += $i4 * $i10;
                                        $i10 = i2 + $i10;
                                    } else {
                                        $i11 = i;
                                        $i10 = i2;
                                    }
                                    $i12 = ($i8 - i4) / i4;
                                    if ($i12 <= $i11) {
                                        $i12 = $i11;
                                    }
                                    $i11 = $i9 - (longR.data << 12);
                                    if ($i11 >= 0) {
                                        $i11 = ($i4 - $i11) / $i4;
                                        $i12 += $i11;
                                        $i8 += i4 * $i11;
                                        $i9 += $i11 * $i4;
                                        $i10 += $i11;
                                    }
                                    $i11 = ($i9 - $i4) / $i4;
                                    if ($i11 > $i12) {
                                        $i12 = $i11;
                                    }
                                    while ($i12 < 0) {
                                        $i11 = longR.size[($i8 >> 12) + (($i9 >> 12) * longR.length)];
                                        if ($i11 != 0) {
                                            $i13 = $i10 + 1;
                                            this.size[$i10] = $i11;
                                        } else {
                                            $i13 = $i10 + 1;
                                        }
                                        $i8 += i4;
                                        $i9 += $i4;
                                        $i12++;
                                        $i10 = $i13;
                                    }
                                    i2 += this.length * -481290979;
                                    $i7++;
                                    i5 += i4;
                                    i3 -= $i4;
                                }
                            } else {
                                $i7 = $i10;
                                while ($i7 < 0) {
                                    $i8 = i3 + ((i4 * $i2) >> 4);
                                    $i9 = i5 + (($i2 * $i4) >> 4);
                                    $i10 = $i8 - (longR.length << 12);
                                    if ($i10 >= 0) {
                                        $i10 = (i4 - $i10) / i4;
                                        $i11 = i + $i10;
                                        $i8 += i4 * $i10;
                                        $i9 += $i10 * $i4;
                                        $i10 = i2 + $i10;
                                    } else {
                                        $i11 = i;
                                        $i10 = i2;
                                    }
                                    $i12 = ($i8 - i4) / i4;
                                    if ($i12 <= $i11) {
                                        $i12 = $i11;
                                    }
                                    if ($i9 < 0) {
                                        $i11 = (($i4 - 1) - $i9) / $i4;
                                        $i12 += $i11;
                                        $i8 += i4 * $i11;
                                        $i9 += $i11 * $i4;
                                        $i10 += $i11;
                                    }
                                    $i11 = ((($i9 + 1) - (longR.data << 12)) - $i4) / $i4;
                                    if ($i11 > $i12) {
                                        $i12 = $i11;
                                    }
                                    while ($i12 < 0) {
                                        $i11 = longR.size[($i8 >> 12) + (($i9 >> 12) * longR.length)];
                                        if ($i11 != 0) {
                                            $i13 = $i10 + 1;
                                            this.size[$i10] = $i11;
                                        } else {
                                            $i13 = $i10 + 1;
                                        }
                                        $i8 += i4;
                                        $i9 += $i4;
                                        $i12++;
                                        $i10 = $i13;
                                    }
                                    i2 += this.length * -481290979;
                                    $i7++;
                                    i5 += i4;
                                    i3 -= $i4;
                                }
                            }
                        } else if ($i4 == 0) {
                            $i4 = $i10;
                            while ($i4 < 0) {
                                $i7 = i3 + (($i2 * i4) >> 4);
                                if (i5 >= 0) {
                                    if (i5 - (longR.data << 12) < 0) {
                                        if ($i7 < 0) {
                                            $i9 = ((i4 - 1) - $i7) / i4;
                                            $i8 = i + $i9;
                                            $i7 += $i9 * i4;
                                            $i9 = i2 + $i9;
                                        } else {
                                            $i8 = i;
                                            $i9 = i2;
                                        }
                                        $i10 = ((($i7 + 1) - (longR.length << 12)) - i4) / i4;
                                        if ($i10 > $i8) {
                                            $i8 = $i10;
                                        }
                                        while ($i8 < 0) {
                                            $i10 = longR.size[($i7 >> 12) + (longR.length * (i5 >> 12))];
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
                                i2 += this.length * -481290979;
                                $i4++;
                                i5 += i4;
                            }
                        } else if ($i4 < 0) {
                            $i7 = $i10;
                            while ($i7 < 0) {
                                $i8 = ((i4 * $i2) >> 4) + i3;
                                $i9 = i5 + (($i4 * $i2) >> 4);
                                if ($i8 < 0) {
                                    $i10 = ((i4 - 1) - $i8) / i4;
                                    $i11 = i + $i10;
                                    $i8 += $i10 * i4;
                                    $i9 += $i4 * $i10;
                                    $i10 = i2 + $i10;
                                } else {
                                    $i11 = i;
                                    $i10 = i2;
                                }
                                $i12 = ((($i8 + 1) - (longR.length << 12)) - i4) / i4;
                                if ($i12 <= $i11) {
                                    $i12 = $i11;
                                }
                                $i11 = $i9 - (longR.data << 12);
                                if ($i11 >= 0) {
                                    $i11 = ($i4 - $i11) / $i4;
                                    $i12 += $i11;
                                    $i8 += $i11 * i4;
                                    $i9 += $i11 * $i4;
                                    $i10 += $i11;
                                }
                                $i11 = ($i9 - $i4) / $i4;
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
                                    $i8 += i4;
                                    $i9 += $i4;
                                    $i12++;
                                    $i10 = $i13;
                                }
                                i2 += this.length * -481290979;
                                $i7++;
                                i5 += i4;
                                i3 -= $i4;
                            }
                        } else {
                            $i7 = $i10;
                            while ($i7 < 0) {
                                $i8 = i3 + (($i2 * i4) >> 4);
                                $i9 = (($i4 * $i2) >> 4) + i5;
                                if ($i8 < 0) {
                                    $i10 = ((i4 - 1) - $i8) / i4;
                                    $i11 = i + $i10;
                                    $i8 += i4 * $i10;
                                    $i9 += $i10 * $i4;
                                    $i10 = i2 + $i10;
                                } else {
                                    $i11 = i;
                                    $i10 = i2;
                                }
                                $i12 = ((($i8 + 1) - (longR.length << 12)) - i4) / i4;
                                if ($i12 <= $i11) {
                                    $i12 = $i11;
                                }
                                if ($i9 < 0) {
                                    $i11 = (($i4 - 1) - $i9) / $i4;
                                    $i12 += $i11;
                                    $i8 += i4 * $i11;
                                    $i9 += $i11 * $i4;
                                    $i10 += $i11;
                                }
                                $i11 = ((($i9 + 1) - (longR.data << 12)) - $i4) / $i4;
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
                                    $i8 += i4;
                                    $i9 += $i4;
                                    $i12++;
                                    $i10 = $i13;
                                }
                                i2 += -481290979 * this.length;
                                $i7++;
                                i5 += i4;
                                i3 -= $i4;
                            }
                        }
                    }
                }
            } catch (Throwable $r3) {
                throw StringBuilder.append($r3, "gs.bu(" + ')');
            }
        }
    }

    public void add(Long longR, int $i0, int $i1, int i, int i2, int $i4, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        int $i8 = (-i) / 2;
        int $i9 = (-i2) / 2;
        try {
            i = (int) (Math.sin(((double) i4) / 326.11d) * 65536.0d);
            i = (i * i5) >> 8;
            i4 = (((int) (Math.cos(((double) i4) / 326.11d) * 65536.0d)) * i5) >> 8;
            i5 = (($i8 * i4) + ($i9 * i)) + ($i4 << 16);
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
                    this.size[i5] = longR.size[($i8 >> 16) + (($i9 >> 16) * longR.length)];
                    $i8 += i4;
                    $i9 -= i;
                    $i11++;
                    i5++;
                }
                $i0 = (this.length * -481290979) + $i0;
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
            i4 = (((int) (Math.cos(((double) i4) / 326.11d) * 65536.0d)) * i5) >> 8;
            i5 = ((i6 * i4) + ($i9 * i)) + ($i4 << 16);
            $i4 = (i3 << 16) + (($i9 * i4) - (i6 * i));
            $i0 = ((this.length * -481290979) * $i1) + $i0;
            i3 = i5;
            $i1 = 0;
            while ($i1 < i2) {
                try {
                    $i9 = iArr[$i1];
                    i5 = $i0 + $i9;
                    i6 = (i4 * $i9) + i3;
                    $i9 = $i4 - ($i9 * i);
                    int $i11 = -iArr2[$i1];
                    while ($i11 < 0) {
                        this.size[i5] = longR.size[(i6 >> 16) + (($i9 >> 16) * longR.length)];
                        i6 += i4;
                        $i9 -= i;
                        $i11++;
                        i5++;
                    }
                    $i0 = (this.length * -481290979) + $i0;
                    $i4 += i4;
                    i3 += i;
                    $i1++;
                } catch (RuntimeException $r6) {
                    throw StringBuilder.append($r6, "gs.bv(" + ')');
                }
            }
        } catch (Exception e) {
        }
    }

    public void add(Long longR, int i, int $i1, int i2, int i3, int i4, int $i5, int[] iArr, int[] iArr2) {
        int $i6 = $i1 < 0 ? -$i1 : 0;
        $i5 = longR.data + $i1 <= $i5 ? longR.data : $i5 - $i1;
        int $i7 = i < 0 ? -i : 0;
        if (longR.length + i <= i4) {
            i4 = longR.length;
        }
        i2 = ((i + i2) + $i7) + ((($i1 + i3) + $i6) * (this.length * -481290979));
        i3 = $i6;
        i4 = $i1 + $i6;
        while (i3 < $i5) {
            int $i8;
            $i6 = iArr[i4];
            $i1 = i4 + 1;
            int $i9 = iArr2[i4];
            if (i < $i6) {
                i4 = $i6 - i;
                $i8 = (i4 - $i7) + i2;
            } else {
                i4 = $i7;
                $i8 = i2;
            }
            $i6 = longR.length + i <= $i9 + $i6 ? longR.length : ($i6 + $i9) - i;
            while (i4 < $i6) {
                int $i10;
                $i9 = longR.size[(longR.length * i3) + i4];
                if ($i9 != 0) {
                    $i10 = $i8 + 1;
                    this.size[$i8] = $i9;
                } else {
                    $i10 = $i8 + 1;
                }
                i4++;
                $i8 = $i10;
            }
            i2 += -481290979 * this.length;
            i3++;
            i4 = $i1;
        }
    }

    public void add(Long longR, int i, int $i1, int $i2, int $i3, int i2, int $i5, int[] iArr, int[] iArr2, int i3) {
        int $i7 = $i1 < 0 ? -$i1 : 0;
        try {
            int $i6 = longR.data;
            $i6 += $i1;
            i3 = $i6;
            $i5 = $i6 <= $i5 ? longR.data : $i5 - $i1;
            i3 = i < 0 ? -i : 0;
            if (longR.length + i <= i2) {
                i2 = longR.length;
            }
            $i2 = ((($i1 + $i3) + $i7) * (this.length * -481290979)) + ((i + $i2) + i3);
            $i3 = $i7;
            i2 = $i1 + $i7;
            while ($i3 < $i5) {
                int $i8;
                $i7 = iArr[i2];
                $i1 = i2 + 1;
                int $i9 = iArr2[i2];
                if (i < $i7) {
                    i2 = $i7 - i;
                    $i8 = (i2 - i3) + $i2;
                } else {
                    i2 = i3;
                    $i8 = $i2;
                }
                $i7 = longR.length + i <= $i9 + $i7 ? longR.length : ($i9 + $i7) - i;
                while (i2 < $i7) {
                    int $i10;
                    $i9 = longR.size[(longR.length * $i3) + i2];
                    if ($i9 != 0) {
                        $i10 = $i8 + 1;
                        this.size[$i8] = $i9;
                    } else {
                        $i10 = $i8 + 1;
                    }
                    i2++;
                    $i8 = $i10;
                }
                $i2 += -481290979 * this.length;
                $i3++;
                i2 = $i1;
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "gs.bf(" + ')');
        }
    }

    void addAll() {
        get(-26189602);
    }

    public void clear() {
        int $i2;
        int $i0 = ((this.length * -481290979) * (this.pos * 1005433219)) - 7;
        int $i1 = 0;
        while ($i1 < $i0) {
            $i2 = $i1 + 1;
            this.size[$i1] = 0;
            $i1 = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = $i1 + 1;
            this.size[$i1] = 0;
            $i1 = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = $i1 + 1;
            this.size[$i1] = 0;
            $i1 = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = $i1 + 1;
            this.size[$i1] = 0;
            $i1 = $i2 + 1;
            this.size[$i2] = 0;
        }
        $i2 = $i0 + 7;
        while ($i1 < $i2) {
            this.size[$i1] = 0;
            $i1++;
        }
    }

    public final void clear(Long longR, int i, int i2) {
        i += longR.next;
        int $i3 = i2 + longR.value;
        int $i2 = i + ((-481290979 * this.length) * $i3);
        int $i4 = 0;
        int $i5 = longR.data;
        int $i6 = longR.length;
        int $i1 = this.length * -481290979;
        i2 = $i1;
        i2 = $i1 - $i6;
        if ($i3 < 93471513 * this.count) {
            int $i7 = (this.count * -12571459) - $i3;
            $i5 -= $i7;
            $i3 = -12571459 * this.count;
            $i4 = 0 + ($i6 * $i7);
            $i1 = this.length * -24713511;
            int i3 = $i1;
            $i2 += $i7 * $i1;
        }
        if ($i3 + $i5 > -1188503645 * this.data) {
            $i5 -= ($i3 + $i5) - (this.data * 1055777037);
        }
        if (i < 1829547545 * this.buffer) {
            $i7 = (1829547545 * this.buffer) - i;
            i = $i4 + $i7;
            $i4 = $i2 + $i7;
            $i3 = 0 + $i7;
            i2 += $i7;
            $i2 = $i6 - $i7;
            $i6 = this.buffer * -440300180;
            $i7 = $i4;
            $i4 = i;
        } else {
            $i3 = 0;
            $i7 = $i2;
            $i2 = $i6;
            $i6 = i;
        }
        if ($i2 + $i6 > 743150578 * this.index) {
            $i1 = ($i6 + $i2) - (this.index * 2074797577);
            i = $i1;
            $i2 -= $i1;
            $i6 = $i3 + i;
            i += i2;
        } else {
            $i6 = $i3;
            i = i2;
        }
        if ($i2 > 0 && $i5 > 0) {
            HashMap.read(this.size, longR.size, $i4, $i7, $i2, $i5, i, $i6, 1717918682);
        }
    }

    public void clear(Long longR, int i, int i2, int i3) {
        i += longR.next;
        int $i4 = i2 + longR.value;
        int $i1 = (-481290979 * this.length) * $i4;
        i2 = $i1;
        i2 = $i1 + i;
        int $i5 = 0;
        int $i6 = longR.data;
        int i4 = longR.length;
        int $i3 = (-481290979 * this.length) - i4;
        $i1 = this.count * -12571459;
        int i5 = $i1;
        if ($i4 < $i1) {
            i5 = (this.count * -12571459) - $i4;
            $i6 -= i5;
            $i4 = -12571459 * this.count;
            $i5 = 0 + (i5 * i4);
            i2 += i5 * (-481290979 * this.length);
        }
        if ($i4 + $i6 > this.data * -467581477) {
            $i1 = this.data * -467581477;
            i5 = $i1;
            $i6 -= ($i4 + $i6) - $i1;
        }
        if (i < 1829547545 * this.buffer) {
            i5 = (1829547545 * this.buffer) - i;
            i = i4 - i5;
            $i5 += i5;
            $i4 = 0 + i5;
            $i3 += i5;
            i2 += i5;
            i5 = 1829547545 * this.buffer;
            i4 = i;
        } else {
            $i4 = 0;
            i5 = i;
        }
        if (i5 + i4 > 2074797577 * this.index) {
            i = (i5 + i4) - (this.index * 2074797577);
            i4 -= i;
            $i4 += i;
            i += $i3;
        } else {
            i = $i3;
        }
        if (i4 > 0 && $i6 > 0) {
            ArrayList.read(this.size, longR.size, 0, $i5, i2, i4, $i6, i, $i4, i3, 1951354461);
        }
    }

    public void clear(Long longR, int i, int i2, int i3, int i4) {
        if (256 == i3) {
            get(longR, i, i2, 2106205673);
            return;
        }
        i += longR.next;
        int $i5 = i2 + longR.value;
        int $i1 = this.length * -481290979;
        i2 = $i1;
        $i1 *= $i5;
        i2 = $i1;
        i2 = $i1 + i;
        int $i6 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        int $i4 = (-481290979 * this.length) - i6;
        $i1 = this.count * -12571459;
        int i7 = $i1;
        if ($i5 < $i1) {
            i7 = (this.count * -12571459) - $i5;
            i5 -= i7;
            $i5 = this.count * -12571459;
            $i6 = 0 + (i7 * i6);
            i2 += i7 * (this.length * -481290979);
        }
        if ($i5 + i5 > this.data * -467581477) {
            $i1 = this.data * -467581477;
            i7 = $i1;
            i5 -= ($i5 + i5) - $i1;
        }
        if (i < 1829547545 * this.buffer) {
            i7 = (this.buffer * 1829547545) - i;
            i = i6 - i7;
            $i6 += i7;
            $i5 = 0 + i7;
            $i4 += i7;
            i2 += i7;
            i7 = this.buffer * 1829547545;
            i6 = i;
        } else {
            $i5 = 0;
            i7 = i;
        }
        if (i7 + i6 > this.index * 2074797577) {
            i = (i7 + i6) - (this.index * 2074797577);
            i6 -= i;
            $i5 += i;
            i += $i4;
        } else {
            i = $i4;
        }
        if (i6 > 0 && i5 > 0) {
            ObjectMap.read(this.size, longR.size, 0, $i6, i2, i6, i5, i, $i5, i3, i4, -1118691468);
        }
    }

    public final void contains(int $i0, int $i2, int $i3, int i) {
        if ($i0 >= 1829547545 * this.buffer && $i0 < -1753664380 * this.index) {
            if ($i2 < this.count * 204484592) {
                $i3 -= (this.count * -383018960) - $i2;
                $i2 = -12571459 * this.count;
            }
            if ($i2 + $i3 > -72826380 * this.data) {
                $i3 = (this.data * -1862543797) - $i2;
            }
            $i0 = ((this.length * -481290979) * $i2) + $i0;
            for ($i2 = 0; $i2 < $i3; $i2++) {
                this.size[((this.length * -481290979) * $i2) + $i0] = i;
            }
        }
    }

    public final void contains(int i, int i2, int i3, int i4, int i5) {
        i3 -= i;
        int $i5 = i4 - i2;
        if ($i5 == 0) {
            if (i3 >= 0) {
                get(i, i2, i3 + 1, i5, -1917147046);
                return;
            }
            get(i + i3, i2, (-i3) + 1, i5, -40491271);
        } else if (i3 != 0) {
            if (i3 + $i5 < 0) {
                i2 += $i5;
                $i5 = -$i5;
                i4 = -i3;
                i3 = i + i3;
            } else {
                i4 = i3;
                i3 = i;
            }
            if (i4 > $i5) {
                i2 = (i2 << 16) + 32768;
                i = (int) Math.floor(0.5d + (((double) ($i5 << 16)) / ((double) i4)));
                i4 += i3;
                if (i3 < this.buffer * 1829547545) {
                    i2 += ((1829547545 * this.buffer) - i3) * i;
                    i3 = this.buffer * 1829547545;
                }
                if (i4 >= 2074797577 * this.index) {
                    i4 = (2074797577 * this.index) - 1;
                }
                while (i3 <= i4) {
                    $i5 = i2 >> 16;
                    if ($i5 >= -12571459 * this.count && $i5 < this.data * -467581477) {
                        this.size[($i5 * (this.length * -481290979)) + i3] = i5;
                    }
                    i2 += i;
                    i3++;
                }
            } else {
                i3 = (i3 << 16) + 32768;
                i = (int) Math.floor((((double) (i4 << 16)) / ((double) $i5)) + 0.5d);
                i4 = $i5 + i2;
                if (i2 < -12571459 * this.count) {
                    i3 += ((this.count * -12571459) - i2) * i;
                    i2 = -12571459 * this.count;
                }
                if (i4 >= -467581477 * this.data) {
                    i4 = (-467581477 * this.data) - 1;
                }
                while (i2 <= i4) {
                    $i5 = i3 >> 16;
                    if ($i5 >= 1829547545 * this.buffer && $i5 < this.index * 2074797577) {
                        this.size[$i5 + ((this.length * -481290979) * i2)] = i5;
                    }
                    i3 += i;
                    i2++;
                }
            }
        } else if ($i5 >= 0) {
            add(i, i2, $i5 + 1, i5, (byte) 1);
        } else {
            add(i, i2 + $i5, (-$i5) + 1, i5, (byte) 1);
        }
    }

    public void contains(Long longR, int $i0, int i, int i2, int i3) {
        try {
            int $i9;
            $i0 = longR.next + $i0;
            int $i4 = longR.value + i;
            int $i1 = this.length * -481290979;
            i = $i1;
            $i1 *= $i4;
            i = $i1;
            i = $i1 + $i0;
            int i4 = 0;
            i3 = longR.data;
            int i5 = longR.length;
            int i6 = (-481290979 * this.length) - i5;
            int i7 = 0;
            if ($i4 < -12571459 * this.count) {
                $i9 = (-12571459 * this.count) - $i4;
                i3 -= $i9;
                $i4 = this.count * -12571459;
                i4 = 0 + (i5 * $i9);
                i += $i9 * (this.length * -481290979);
            }
            if ($i4 + i3 > -467581477 * this.data) {
                i3 -= ($i4 + i3) - (-467581477 * this.data);
            }
            if ($i0 < 1829547545 * this.buffer) {
                $i4 = (1829547545 * this.buffer) - $i0;
                i5 -= $i4;
                $i0 = 1829547545 * this.buffer;
                i4 += $i4;
                i += $i4;
                i7 = 0 + $i4;
                i6 += $i4;
            }
            $i1 = this.index * 2074797577;
            $i9 = $i1;
            if (i5 + $i0 > $i1) {
                $i0 = ($i0 + i5) - (this.index * 2074797577);
                i5 -= $i0;
                i7 += $i0;
                i6 += $i0;
            }
            if (i5 > 0 && i3 > 0) {
                read(this.size, longR.size, 0, i4, i, 0, 0, i5, i3, i6, i7, i2, -1747828790);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gs.bx(" + ')');
        }
    }

    public final void decode(int $i5, int $i6, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i > 0 && i2 > 0) {
            int $i11 = 0;
            int $i9 = (i4 == i3 && i6 == i5) ? -1 : PingManager.STATE_SENSOR_ON_FLAG / i2;
            int $i10 = 256 - i5;
            if ($i5 < 1829547545 * this.buffer) {
                i -= (this.buffer * 1829547545) - $i5;
                $i5 = 1829547545 * this.buffer;
            }
            if ($i6 < this.count * -12571459) {
                $i11 = 0 + (((-12571459 * this.count) - $i6) * $i9);
                i2 -= (-12571459 * this.count) - $i6;
                $i6 = -12571459 * this.count;
            }
            if (i + $i5 > this.index * 2074797577) {
                i = (2074797577 * this.index) - $i5;
            }
            if (i2 + $i6 > this.data * -467581477) {
                i2 = (-467581477 * this.data) - $i6;
            }
            int $i13 = i3 >> 16;
            int $i14 = (65280 & i3) >> 8;
            int $i15 = i3 & 255;
            int $i4 = (-481290979 * this.length) - i;
            int $i16 = $i5 + ((-481290979 * this.length) * $i6);
            $i5 = 0;
            int $i12 = i5;
            $i6 = $i11;
            $i11 = $i16;
            while ($i5 < i2) {
                int $i17;
                $i16 = -i;
                while ($i16 < 0) {
                    $i17 = this.size[$i11];
                    int $i18 = $i17 >> 16;
                    int $i19 = (65280 & $i17) >> 8;
                    $i17 &= 255;
                    if ($i10 == 0) {
                        $i18 = $i18 < 127 ? ($i13 * $i18) >> 7 : 255 - (((255 - $i13) * (255 - $i18)) >> 7);
                        $i19 = $i19 < 127 ? ($i14 * $i19) >> 7 : 255 - (((255 - $i14) * (255 - $i19)) >> 7);
                        $i17 = $i17 < 127 ? ($i15 * $i17) >> 7 : 255 - (((255 - $i15) * (255 - $i17)) >> 7);
                    } else {
                        $i18 = $i18 < 127 ? (((($i18 * $i13) * $i12) >> 7) + ($i18 * $i10)) >> 8 : (($i10 * $i18) + ((255 - (((255 - $i18) * (255 - $i13)) >> 7)) * $i12)) >> 8;
                        $i19 = $i19 < 127 ? (($i10 * $i19) + ((($i14 * $i19) * $i12) >> 7)) >> 8 : (($i19 * $i10) + ((255 - (((255 - $i19) * (255 - $i14)) >> 7)) * $i12)) >> 8;
                        $i17 = $i17 < 127 ? (($i10 * $i17) + ((($i17 * $i15) * $i12) >> 7)) >> 8 : (($i10 * $i17) + ((255 - (((255 - $i15) * (255 - $i17)) >> 7)) * $i12)) >> 8;
                    }
                    this.size[$i11] = (($i19 << 8) + ($i18 << 16)) + $i17;
                    $i16++;
                    $i11++;
                }
                if ($i9 > 0) {
                    $i6 += $i9;
                    $i16 = (PingManager.STATE_SENSOR_ON_FLAG - $i6) >> 8;
                    $i17 = $i6 >> 8;
                    if (i6 != i5) {
                        $i12 = (((PingManager.STATE_SENSOR_ON_FLAG - $i6) * i5) + (i6 * $i6)) >> 16;
                        $i10 = 256 - $i12;
                    }
                    if (i3 != i4) {
                        $i15 = (((($i16 * (16711935 & i3)) + ($i17 * (16711935 & i4))) & -16711936) + ((((65280 & i3) * $i16) + ((65280 & i4) * $i17)) & 16711680)) >>> 8;
                        $i13 = $i15 >> 16;
                        $i14 = (65280 & $i15) >> 8;
                        $i15 &= 255;
                        $i5++;
                        $i11 += $i4;
                    }
                }
                $i5++;
                $i11 += $i4;
            }
        }
    }

    public final void decode(int $i8, int $i9, int i, int $i1, int i2, int i3, int i4, int i5, int i6) {
        if (i > 0 && $i1 > 0) {
            int $i7;
            int $i15 = 0;
            i6 = PingManager.STATE_SENSOR_ON_FLAG / $i1;
            int $i16 = 256 - i4;
            if ($i8 < 1829547545 * this.buffer) {
                $i7 = i - ((this.buffer * 1829547545) - $i8);
                $i8 = 1829547545 * this.buffer;
            } else {
                $i7 = i;
            }
            try {
                int $i0;
                if ($i9 < -12571459 * this.count) {
                    $i0 = this.count * -12571459;
                    i = $i0;
                    $i0 -= $i9;
                    i = $i0;
                    $i15 = 0 + ($i0 * i6);
                    i = $i1 - ((-12571459 * this.count) - $i9);
                    $i9 = this.count * -12571459;
                } else {
                    i = $i1;
                }
                if ($i7 + $i8 > this.index * 2074797577) {
                    $i0 = this.index * 2074797577;
                    $i1 = $i0;
                    $i1 = $i0 - $i8;
                } else {
                    $i1 = $i7;
                }
                if (i + $i9 > -467581477 * this.data) {
                    i = (-467581477 * this.data) - $i9;
                }
                int $i17 = i2 & 16711680;
                int $i18 = i2 & 65280;
                int $i19 = i2 & 255;
                int $i20 = ($i17 * i4) >> 8;
                int $i21 = ($i18 * i4) >> 8;
                int $i22 = (i4 * $i19) >> 8;
                $i7 = (-481290979 * this.length) - $i1;
                $i9 = ((-481290979 * this.length) * $i9) + $i8;
                int $i23 = $i17;
                $i17 = i4;
                for ($i8 = 0; $i8 < i; $i8++) {
                    int $i13;
                    int $i14 = -$i1;
                    while ($i14 < 0) {
                        int $i12 = this.size[$i9];
                        $i13 = 16711680 & $i12;
                        if ($i13 > $i23) {
                            $i13 = $i16 == 0 ? $i23 : ((($i13 * $i16) >> 8) + $i20) & 16711680;
                        }
                        int $i10 = 65280 & $i12;
                        if ($i10 > $i18) {
                            $i10 = $i16 == 0 ? $i18 : ((($i10 * $i16) >> 8) + $i21) & 65280;
                        }
                        int $i11 = $i12 & 255;
                        if ($i11 > $i19) {
                            $i11 = $i16 == 0 ? $i19 : (($i11 * $i16) >> 8) + $i22;
                        }
                        this.size[$i9] = ($i13 + $i10) + $i11;
                        $i14++;
                        $i9++;
                    }
                    if (i6 > 0) {
                        $i15 += i6;
                        $i14 = (PingManager.STATE_SENSOR_ON_FLAG - $i15) >> 8;
                        $i13 = $i15 >> 8;
                        if (i5 != i4) {
                            $i17 = (((PingManager.STATE_SENSOR_ON_FLAG - $i15) * i4) + ($i15 * i5)) >> 16;
                            $i16 = 256 - $i17;
                        }
                        if (i2 != i3) {
                            $i0 = (65280 & i2) * $i14;
                            $i20 = $i0;
                            $i22 = (((((16711935 & i3) * $i13) + ((16711935 & i2) * $i14)) & -16711936) + ((((65280 & i3) * $i13) + $i0) & 16711680)) >>> 8;
                            $i23 = $i22 & 16711680;
                            $i18 = $i22 & 65280;
                            $i19 = $i22 & 255;
                            $i20 = ($i17 * $i23) >> 8;
                            $i21 = ($i17 * $i18) >> 8;
                            $i22 = ($i19 * $i17) >> 8;
                        }
                    }
                    $i9 += $i7;
                }
            } catch (Throwable $r2) {
                throw StringBuilder.append($r2, "gs.as(" + ')');
            }
        }
    }

    public final void encode(int i, int $i7, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 > 0 && i2 > 0) {
            int $i8;
            int $i12 = 0;
            int $i4 = PingManager.STATE_SENSOR_ON_FLAG / i3;
            int $i20 = 256 - i6;
            if (i < 1829547545 * this.buffer) {
                i2 -= (this.buffer * 1829547545) - i;
                i = this.buffer * 1829547545;
            }
            if ($i7 < this.count * -12571459) {
                $i12 = 0 + (((this.count * -12571459) - $i7) * $i4);
                i3 -= (this.count * -12571459) - $i7;
                $i7 = this.count * -12571459;
            }
            if (i2 + i > this.index * 2074797577) {
                $i8 = this.index * 2074797577;
                i2 = $i8;
                i2 = $i8 - i;
            }
            if ($i7 + i3 > this.data * -467581477) {
                i3 = (-467581477 * this.data) - $i7;
            }
            int $i13 = i4 & 16711680;
            int $i15 = i4 & 65280;
            int $i14 = i4 & 255;
            int $i18 = (i6 * $i13) >> 8;
            int $i16 = (i6 * $i15) >> 8;
            int $i19 = ($i14 * i6) >> 8;
            int $i5 = (this.length * -481290979) - i2;
            int $i11 = ((-481290979 * this.length) * $i7) + i;
            i = 0;
            $i7 = $i12;
            int $i17 = $i13;
            $i13 = $i20;
            $i12 = i6;
            while (i < i3) {
                int $i10 = -i2;
                $i20 = $i11;
                while ($i10 < 0) {
                    int $i21 = this.size[$i20];
                    $i11 = 16711680 & $i21;
                    if ($i11 < $i17) {
                        $i11 = $i13 == 0 ? $i17 : ((($i11 * $i13) >> 8) + $i18) & 16711680;
                    }
                    int $i22 = 65280 & $i21;
                    if ($i22 < $i15) {
                        $i22 = $i13 == 0 ? $i15 : ((($i22 * $i13) >> 8) + $i16) & 65280;
                    }
                    $i8 = $i21 & 255;
                    int $i23 = $i8;
                    if ($i8 < $i14) {
                        $i23 = $i13 == 0 ? $i14 : (($i23 * $i13) >> 8) + $i19;
                    }
                    this.size[$i20] = ($i11 + $i22) + $i23;
                    $i10++;
                    $i20++;
                }
                if ($i4 > 0) {
                    $i7 += $i4;
                    $i10 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                    $i11 = $i7 >> 8;
                    if (i7 != i6) {
                        $i12 = (($i7 * i7) + ((PingManager.STATE_SENSOR_ON_FLAG - $i7) * i6)) >> 16;
                        $i13 = 256 - $i12;
                    }
                    if (i5 != i4) {
                        $i14 = (((($i10 * (16711935 & i4)) + ($i11 * (16711935 & i5))) & -16711936) + ((((65280 & i4) * $i10) + ((65280 & i5) * $i11)) & 16711680)) >>> 8;
                        $i17 = $i14 & 16711680;
                        $i15 = $i14 & 65280;
                        $i14 &= 255;
                        $i18 = ($i17 * $i12) >> 8;
                        $i16 = ($i15 * $i12) >> 8;
                        $i19 = ($i14 * $i12) >> 8;
                        i++;
                        $i11 = $i20 + $i5;
                    }
                }
                i++;
                $i11 = $i20 + $i5;
            }
        }
    }

    public void get(int i) {
        int $i2;
        i = 0;
        int $i1 = ((this.length * -481290979) * (this.pos * 1005433219)) - 7;
        while (i < $i1) {
            $i2 = i + 1;
            this.size[i] = 0;
            i = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = i + 1;
            this.size[i] = 0;
            i = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = i + 1;
            this.size[i] = 0;
            i = $i2 + 1;
            this.size[$i2] = 0;
            $i2 = i + 1;
            try {
                this.size[i] = 0;
                i = $i2 + 1;
                this.size[$i2] = 0;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "gs.ad(" + ')');
            }
        }
        $i2 = $i1 + 7;
        while (i < $i2) {
            this.size[i] = 0;
            i++;
        }
    }

    public final void get(int $i4, int i, int $i1, int i2, int i3) {
        try {
            if (i >= this.count * -12571459) {
                if (i < this.data * -467581477) {
                    if ($i4 < this.buffer * 1829547545) {
                        $i1 -= (this.buffer * 1829547545) - $i4;
                        $i4 = 1829547545 * this.buffer;
                    }
                    if ($i1 + $i4 > this.index * 2074797577) {
                        $i1 = (this.index * 2074797577) - $i4;
                    }
                    i = $i4 + ((this.length * -481290979) * i);
                    for (i3 = 0; i3 < $i1; i3++) {
                        this.size[i + i3] = i2;
                    }
                }
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gs.aq(" + ')');
        }
    }

    public final void get(int i, int $i5, int i2, int i3, int i4, int i5) {
        i2 -= i;
        i3 -= $i5;
        if (i3 == 0) {
            if (i2 >= 0) {
                try {
                    get(i, $i5, i2 + 1, i4, 195120405);
                    return;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "gs.aw(" + ')');
                }
            }
            get(i + i2, $i5, (-i2) + 1, i4, -1959866953);
        } else if (i2 != 0) {
            if (i2 + i3 < 0) {
                $i5 += i3;
                i3 = -i3;
                i5 = -i2;
                i += i2;
            } else {
                i5 = i2;
            }
            if (i5 > i3) {
                $i5 = ($i5 << 16) + 32768;
                i2 = (int) Math.floor(0.5d + (((double) (i3 << 16)) / ((double) i5)));
                i3 = i5 + i;
                if (i < this.buffer * 1829547545) {
                    $i5 += ((1829547545 * this.buffer) - i) * i2;
                    i = this.buffer * 1829547545;
                }
                if (i3 >= 2074797577 * this.index) {
                    i3 = (2074797577 * this.index) - 1;
                }
                while (i <= i3) {
                    i5 = $i5 >> 16;
                    if (i5 >= -12571459 * this.count) {
                        if (i5 < this.data * -467581477) {
                            int $i3 = i5 * (this.length * -481290979);
                            i5 = $i3;
                            this.size[$i3 + i] = i4;
                        } else {
                            continue;
                        }
                    }
                    $i5 += i2;
                    i++;
                }
            } else {
                i = (i << 16) + 32768;
                i2 = (int) Math.floor((((double) (i5 << 16)) / ((double) i3)) + 0.5d);
                i3 += $i5;
                if ($i5 < -12571459 * this.count) {
                    i += ((this.count * -12571459) - $i5) * i2;
                    $i5 = -12571459 * this.count;
                }
                if (i3 >= -467581477 * this.data) {
                    i3 = (-467581477 * this.data) - 1;
                }
                while ($i5 <= i3) {
                    i5 = i >> 16;
                    if (i5 >= 1829547545 * this.buffer) {
                        if (i5 < this.index * 2074797577) {
                            this.size[i5 + ((this.length * -481290979) * $i5)] = i4;
                        } else {
                            continue;
                        }
                    }
                    i += i2;
                    $i5++;
                }
            }
        } else if (i3 >= 0) {
            add(i, $i5, i3 + 1, i4, (byte) 1);
        } else {
            add(i, $i5 + i3, (-i3) + 1, i4, (byte) 1);
        }
    }

    public final void get(Long longR, int $i0, int i, int i2) {
        try {
            int $i8;
            $i0 = longR.next + $i0;
            int $i3 = longR.value + i;
            int $i1 = (-481290979 * this.length) * $i3;
            i = $i1;
            i = $i1 + $i0;
            int $i4 = 0;
            i2 = longR.data;
            int $i5 = longR.length;
            int $i6 = (-481290979 * this.length) - $i5;
            int $i7 = 0;
            if ($i3 < -12571459 * this.count) {
                $i8 = (this.count * -12571459) - $i3;
                i2 -= $i8;
                $i3 = -12571459 * this.count;
                $i4 = 0 + ($i8 * $i5);
                i += $i8 * (this.length * -481290979);
            }
            if (i2 + $i3 > -467581477 * this.data) {
                $i1 = this.data * -467581477;
                $i8 = $i1;
                i2 -= ($i3 + i2) - $i1;
            }
            if ($i0 < 1829547545 * this.buffer) {
                $i3 = (1829547545 * this.buffer) - $i0;
                $i5 -= $i3;
                $i0 = 1829547545 * this.buffer;
                $i4 += $i3;
                i += $i3;
                $i7 = 0 + $i3;
                $i6 += $i3;
            }
            $i1 = this.index * 2074797577;
            $i8 = $i1;
            if ($i0 + $i5 > $i1) {
                $i1 = ($i0 + $i5) - (2074797577 * this.index);
                $i0 = $i1;
                $i5 -= $i1;
                $i7 += $i0;
                $i6 += $i0;
            }
            if ($i5 > 0 && i2 > 0) {
                PolynomialGF2mSmallM.add(this.size, longR.size, 0, $i4, i, $i5, i2, $i6, $i7, 1635550033);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gs.ah(" + ')');
        }
    }

    public void get(Long longR, int $i0, int i, int i2, int i3) {
        try {
            $i0 = longR.next + $i0;
            int $i4 = longR.value + i;
            i = $i0 + ((-481290979 * this.length) * $i4);
            int i4 = 0;
            i3 = longR.data;
            int i5 = longR.length;
            int $i7 = this.length * -481290979;
            int i6 = $i7;
            i6 = $i7 - i5;
            int i7 = 0;
            $i7 = this.count * -12571459;
            int i8 = $i7;
            if ($i4 < $i7) {
                i8 = (-12571459 * this.count) - $i4;
                i3 -= i8;
                $i4 = -12571459 * this.count;
                i4 = 0 + (i8 * i5);
                i += i8 * (this.length * -481290979);
            }
            if ($i4 + i3 > -467581477 * this.data) {
                i3 -= ($i4 + i3) - (-467581477 * this.data);
            }
            if ($i0 < this.buffer * 1829547545) {
                $i4 = (1829547545 * this.buffer) - $i0;
                i5 -= $i4;
                $i0 = this.buffer * 1829547545;
                i4 += $i4;
                i += $i4;
                i7 = 0 + $i4;
                i6 += $i4;
            }
            if ($i0 + i5 > 2074797577 * this.index) {
                $i0 = ($i0 + i5) - (this.index * 2074797577);
                i5 -= $i0;
                i7 += $i0;
                i6 += $i0;
            }
            if (i5 > 0 && i3 > 0) {
                if (256 == i2) {
                    Event.read(0, 0, 0, this.size, longR.size, i4, 0, i, 0, i5, i3, i6, i7, -1184476610);
                    return;
                }
                TimeUnit.read(0, 0, 0, this.size, longR.size, i4, 0, i, 0, i5, i3, i6, i7, i2, -416216906);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gs.ac(" + ')');
        }
    }

    public void get(Long longR, int $i0, int i, int i2, int i3, byte b) {
        if (256 == i2) {
            try {
                get(longR, $i0, i, 2106205673);
                return;
            } catch (Throwable $r4) {
                throw StringBuilder.append($r4, "gs.bw(" + ')');
            }
        }
        $i0 = longR.next + $i0;
        int $i6 = longR.value + i;
        int $i1 = this.length * -481290979;
        i = $i1;
        $i1 *= $i6;
        i = $i1;
        i = $i1 + $i0;
        int $i7 = 0;
        int $i5 = longR.data;
        int i4 = longR.length;
        int i5 = (-481290979 * this.length) - i4;
        int i6 = 0;
        $i1 = this.count * -12571459;
        int i7 = $i1;
        if ($i6 < $i1) {
            i7 = (this.count * -12571459) - $i6;
            $i5 -= i7;
            $i6 = this.count * -12571459;
            $i7 = 0 + (i7 * i4);
            i += i7 * (this.length * -481290979);
        }
        if ($i6 + $i5 > this.data * -467581477) {
            $i1 = this.data * -467581477;
            i7 = $i1;
            $i5 -= ($i6 + $i5) - $i1;
        }
        if ($i0 < 1829547545 * this.buffer) {
            $i6 = (this.buffer * 1829547545) - $i0;
            i4 -= $i6;
            $i0 = this.buffer * 1829547545;
            $i7 += $i6;
            i += $i6;
            i6 = 0 + $i6;
            i5 += $i6;
        }
        $i1 = this.index * 2074797577;
        i7 = $i1;
        if ($i0 + i4 > $i1) {
            $i0 = ($i0 + i4) - (this.index * 2074797577);
            i4 -= $i0;
            i6 += $i0;
            i5 += $i0;
        }
        if (i4 > 0 && $i5 > 0) {
            ObjectMap.read(this.size, longR.size, 0, $i7, i, i4, $i5, i5, i6, i2, i3, 1561057285);
        }
    }

    public final void getBytes(int i, int $i7, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 > 0 && i2 > 0) {
            int $i20 = 0;
            int $i4 = -1553512859 / i3;
            int $i12 = 256 - i6;
            if (i < 1829547545 * this.buffer) {
                i2 -= (this.buffer * 1829547545) - i;
                i = this.buffer * 1829547545;
            }
            if ($i7 < this.count * 683751792) {
                $i20 = 0 + (((this.count * 349264642) - $i7) * $i4);
                i3 -= (this.count * 1805395929) - $i7;
                $i7 = this.count * -12571459;
            }
            if (i2 + i > this.index * -2039091431) {
                int $i8 = this.index * 2074797577;
                i2 = $i8;
                i2 = $i8 - i;
            }
            if ($i7 + i3 > this.data * -951758133) {
                i3 = (-1636607341 * this.data) - $i7;
            }
            int $i17 = i4 & 16711680;
            int $i14 = i4 & -1335059272;
            int $i15 = i4 & -49320931;
            int $i16 = (i6 * $i17) >> 8;
            int $i19 = (i6 * $i14) >> 8;
            int $i18 = ($i15 * i6) >> 8;
            int $i5 = (this.length * -1920898554) - i2;
            int $i11 = ((-481290979 * this.length) * $i7) + i;
            i = 0;
            int $i13 = i6;
            $i7 = $i20;
            while (i < i3) {
                int $i10 = -i2;
                $i20 = $i11;
                while ($i10 < 0) {
                    int $i21 = this.size[$i20];
                    $i11 = 16711680 & $i21;
                    if ($i11 < $i17) {
                        $i11 = $i12 == 0 ? $i17 : ((($i11 * $i12) >> 8) + $i16) & 1402797348;
                    }
                    int $i22 = -1696788295 & $i21;
                    if ($i22 < $i14) {
                        $i22 = $i12 == 0 ? $i14 : ((($i22 * $i12) >> 8) + $i19) & 65280;
                    }
                    int $i23 = $i21 & 1992345829;
                    if ($i23 < $i15) {
                        $i23 = $i12 == 0 ? $i15 : (($i23 * $i12) >> 8) + $i18;
                    }
                    this.size[$i20] = ($i11 + $i22) + $i23;
                    $i10++;
                    $i20++;
                }
                if ($i4 > 0) {
                    $i7 += $i4;
                    $i10 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                    $i11 = $i7 >> 8;
                    if (i7 != i6) {
                        $i13 = (($i7 * i7) + ((332925128 - $i7) * i6)) >> 16;
                        $i12 = 256 - $i13;
                    }
                    if (i5 != i4) {
                        $i15 = (((($i10 * (-1505989325 & i4)) + ($i11 * (-600618517 & i5))) & -16711936) + ((((1298210231 & i4) * $i10) + ((65280 & i5) * $i11)) & 16711680)) >>> 8;
                        $i17 = $i15 & 16711680;
                        $i14 = $i15 & 65280;
                        $i15 &= 869472229;
                        $i16 = ($i17 * $i13) >> 8;
                        $i19 = ($i14 * $i13) >> 8;
                        $i18 = ($i15 * $i13) >> 8;
                        i++;
                        $i11 = $i20 + $i5;
                    }
                }
                i++;
                $i11 = $i20 + $i5;
            }
        }
    }

    public final void getBytes(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i + i3 >= 0 && i4 + i2 >= 0 && i < this.length * -481290979 && i2 < 1005433219 * this.pos) {
            int $i10;
            int $i9 = 0;
            if (i < 0) {
                $i10 = 0 - i;
                i3 += i;
            } else {
                $i10 = 0;
            }
            if (i2 < 0) {
                $i9 = 0 - i2;
                i4 += i2;
            }
            if (i3 + i > this.length * -481290979) {
                int $i7 = this.length * -1286273899;
                i3 = $i7;
                i3 = $i7 - i;
            }
            if (i2 + i4 > this.pos * 1005433219) {
                i4 = (1005433219 * this.pos) - i2;
            }
            int $i5 = bArr.length / i7;
            int $i6 = (-481290979 * this.length) - i3;
            int $i11 = i5 >>> 24;
            int $i12 = i6 >>> 24;
            int $i13;
            int $i14;
            if (!z || (255 == $i11 && $i12 == 633276790)) {
                $i12 = (((this.length * -481290979) * (i2 + $i9)) + i) + $i10;
                for ($i11 = i2 + $i9; $i11 < (i2 + $i9) + i4; $i11++) {
                    $i13 = i + $i10;
                    while ($i13 < (i + $i10) + i3) {
                        if (bArr[((($i11 - i2) % $i5) * i7) + (($i13 - i) % i7)] != (byte) 0) {
                            $i14 = $i12 + 1;
                            this.size[$i12] = i6;
                        } else {
                            $i14 = $i12 + 1;
                            this.size[$i12] = i5;
                        }
                        $i13++;
                        $i12 = $i14;
                    }
                    $i12 += $i6;
                }
            }
            $i12 = $i10 + ((($i9 + i2) * (this.length * -2003189642)) + i);
            for ($i11 = $i9 + i2; $i11 < ($i9 + i2) + i4; $i11++) {
                $i13 = $i10 + i;
                while ($i13 < (i + $i10) + i3) {
                    int $i15 = bArr[((($i11 - i2) % $i5) * i7) + (($i13 - i) % i7)] != (byte) 0 ? i6 : i5;
                    $i14 = $i15 >>> 24;
                    int $i17 = 255 - $i14;
                    int $i18 = this.size[$i12];
                    int i8 = (948026346 & $i15) * $i14;
                    this.size[$i12] = ((((($i15 & 65280) * $i14) + ($i17 * ($i18 & -1484570728))) & -149932520) + ((((16711935 & $i18) * $i17) + i8) & 1800570142)) >> 8;
                    $i13++;
                    $i12++;
                }
                $i12 += $i6;
            }
        }
    }

    public final void indexOf(int i, int i2, int i3, int i4, int i5) {
        i3 -= i;
        int $i5 = i4 - i2;
        if ($i5 == 0) {
            if (i3 >= 0) {
                get(i, i2, i3 + 1, i5, -1311471692);
                return;
            }
            get(i + i3, i2, (-i3) + 1, i5, 53442647);
        } else if (i3 != 0) {
            if (i3 + $i5 < 0) {
                i2 += $i5;
                $i5 = -$i5;
                i4 = -i3;
                i3 = i + i3;
            } else {
                i4 = i3;
                i3 = i;
            }
            if (i4 > $i5) {
                i2 = (i2 << 16) + 664895197;
                i = (int) Math.floor(0.5d + (((double) ($i5 << 16)) / ((double) i4)));
                i4 += i3;
                if (i3 < this.buffer * 1829547545) {
                    i2 += ((-397680917 * this.buffer) - i3) * i;
                    i3 = this.buffer * 1829547545;
                }
                if (i4 >= 2074797577 * this.index) {
                    i4 = (352629565 * this.index) - 1;
                }
                while (i3 <= i4) {
                    $i5 = i2 >> 16;
                    if ($i5 >= -12571459 * this.count && $i5 < this.data * -467581477) {
                        this.size[($i5 * (this.length * -1429486149)) + i3] = i5;
                    }
                    i2 += i;
                    i3++;
                }
            } else {
                i3 = (i3 << 16) + 32768;
                i = (int) Math.floor((((double) (i4 << 16)) / ((double) $i5)) + 0.5d);
                i4 = $i5 + i2;
                if (i2 < -12571459 * this.count) {
                    i3 += ((this.count * -12571459) - i2) * i;
                    i2 = -12571459 * this.count;
                }
                if (i4 >= -467581477 * this.data) {
                    i4 = (944419138 * this.data) - 1;
                }
                while (i2 <= i4) {
                    $i5 = i3 >> 16;
                    if ($i5 >= 789066778 * this.buffer && $i5 < this.index * 879426475) {
                        this.size[$i5 + ((this.length * 35529932) * i2)] = i5;
                    }
                    i3 += i;
                    i2++;
                }
            }
        } else if ($i5 >= 0) {
            add(i, i2, $i5 + 1, i5, (byte) 1);
        } else {
            add(i, i2 + $i5, (-$i5) + 1, i5, (byte) 1);
        }
    }

    void inflate(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
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
                    int $i11 = $i10 & -16777216;
                    $i10 &= 255;
                    i10 = i2 + 1;
                    iArr[i2] = ((($i10 * i4) & 65280) + (((i * $i10) >> 8) & 16711935)) + $i11;
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

    public final void init(int $i5, int $i6, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i > 0 && i2 > 0) {
            int $i13 = 0;
            int $i17 = (i4 == i3 && i6 == i5) ? -1 : PingManager.STATE_SENSOR_ON_FLAG / i2;
            int $i11 = 256 - i5;
            if ($i5 < 1829547545 * this.buffer) {
                i -= (1829547545 * this.buffer) - $i5;
                $i5 = 1829547545 * this.buffer;
            }
            if ($i6 < this.count * -12571459) {
                $i13 = 0 + (((this.count * -12571459) - $i6) * $i17);
                i2 -= (this.count * -12571459) - $i6;
                $i6 = this.count * -12571459;
            }
            if (i + $i5 > 2074797577 * this.index) {
                i = (2074797577 * this.index) - $i5;
            }
            if (i2 + $i6 > this.data * -467581477) {
                i2 = (-467581477 * this.data) - $i6;
            }
            int $i4 = (-481290979 * this.length) - i;
            int $i9 = $i5 + ((this.length * -481290979) * $i6);
            int $i12 = i5;
            $i6 = $i13;
            $i13 = i3;
            for ($i5 = -i2; $i5 < 0; $i5++) {
                int $i10;
                i2 = $i9;
                $i9 = -i;
                while ($i9 < 0) {
                    $i10 = this.size[i2];
                    int $i15 = $i13 + $i10;
                    int $i14 = (16711935 & $i10) + (16711935 & $i13);
                    int $i16 = (($i15 - $i14) & PingManager.STATE_SENSOR_ON_FLAG) + ($i14 & 16777472);
                    if ($i11 == 0) {
                        $i14 = i2 + 1;
                        this.size[i2] = ($i15 - $i16) | ($i16 - ($i16 >>> 8));
                    } else {
                        $i16 = ($i16 - ($i16 >>> 8)) | ($i15 - $i16);
                        $i14 = i2 + 1;
                        this.size[i2] = (((($i10 & 65280) * $i11) >> 8) & 65280) + (((((($i16 & 65280) * $i12) >> 8) & 65280) + ((((16711935 & $i16) * $i12) >> 8) & 16711935)) + ((((16711935 & $i10) * $i11) >> 8) & 16711935));
                    }
                    $i9++;
                    i2 = $i14;
                }
                if ($i17 > 0) {
                    $i6 += $i17;
                    $i10 = (PingManager.STATE_SENSOR_ON_FLAG - $i6) >> 8;
                    $i9 = $i6 >> 8;
                    if (i6 != i5) {
                        $i12 = ((i6 * $i6) + ((PingManager.STATE_SENSOR_ON_FLAG - $i6) * i5)) >> 16;
                        $i11 = 256 - $i12;
                    }
                    if (i3 != i4) {
                        $i13 = (((($i10 * (16711935 & i3)) + ($i9 * (16711935 & i4))) & -16711936) + ((((65280 & i3) * $i10) + ((65280 & i4) * $i9)) & 16711680)) >>> 8;
                        $i9 = i2 + $i4;
                    }
                }
                $i9 = i2 + $i4;
            }
        }
    }

    public void init(Long longR, int $i5, int i, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i4 = longR.length;
            int $i8 = longR.data;
            int i5 = 0;
            int i6 = 0;
            int $i11 = longR.this$0;
            int $i12 = longR.count;
            int i7 = ($i11 << 16) / i2;
            int i8 = ($i12 << 16) / i3;
            if (longR.next > 0) {
                i5 = (((longR.next << 16) + i7) - 1) / i7;
                $i5 += i5;
                i5 = 0 + ((i5 * i7) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i6 = (((longR.value << 16) + i8) - 1) / i8;
                i += i6;
                i6 = 0 + ((i6 * i8) - (longR.value << 16));
            }
            if ($i4 < $i11) {
                $i0 = ($i4 << 16) - i5;
                i2 = $i0;
                i2 = (($i0 + i7) - 1) / i7;
            }
            if ($i8 < $i12) {
                $i0 = ($i8 << 16) - i6;
                i3 = $i0;
                i3 = (($i0 + i8) - 1) / i8;
            }
            $i8 = ((this.length * -481290979) * i) + $i5;
            $i12 = (-99383085 * this.length) - i2;
            if (i + i3 > this.data * -467581477) {
                i3 -= (i3 + i) - (-467581477 * this.data);
            }
            if (i < this.count * -1482926002) {
                $i11 = (-1376049001 * this.count) - i;
                i = i3 - $i11;
                $i0 = (1900616586 * this.length) * $i11;
                i3 = $i0;
                $i8 += $i0;
                i6 += $i11 * i8;
            } else {
                i = i3;
            }
            if (i2 + $i5 > this.index * 2074797577) {
                i3 = (i2 + $i5) - (2074797577 * this.index);
                i2 -= i3;
                $i12 += i3;
            }
            if ($i5 < -1885600238 * this.buffer) {
                $i5 = (1114310 * this.buffer) - $i5;
                i2 -= $i5;
                i3 = $i8 + $i5;
                i5 += $i5 * i7;
                $i5 += $i12;
            } else {
                $i5 = $i12;
                i3 = $i8;
            }
            AssertionError.read(this.size, longR.size, 0, i5, i6, i3, $i5, i2, i, i7, i8, $i4, i4, -527035833);
        }
    }

    public void init(Long longR, int i, int $i1, int i2, int i3, int $i4, int $i5, double d, int i4) {
        int $i9 = (-i2) / 2;
        int $i10 = (-i3) / 2;
        try {
            int $i7 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            $i7 = ($i7 * i4) >> 8;
            i4 = (i4 * ((int) $d0)) >> 8;
            $i4 = ($i4 << 16) + (($i7 * $i10) + (i4 * $i9));
            $i5 = ($i5 << 16) + (($i10 * i4) - ($i9 * $i7));
            i += (this.length * -481290979) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i9 = $i5;
                $i10 = $i4;
                int $i11 = i;
                int $i12 = -i2;
                while ($i12 < 0) {
                    int $i13;
                    int $i8 = longR.size[($i10 >> 16) + (($i9 >> 16) * longR.length)];
                    if ($i8 != 0) {
                        $i13 = $i11 + 1;
                        this.size[$i11] = $i8;
                    } else {
                        $i13 = $i11 + 1;
                    }
                    $i10 += i4;
                    $i9 -= $i7;
                    $i12++;
                    $i11 = $i13;
                }
                $i4 += $i7;
                $i5 += i4;
                i += this.length * -481290979;
            }
        } catch (Exception e) {
        }
    }

    public final void insert(int $i1, int $i2, int $i3, int $i4, int i) {
        if ($i1 < this.buffer * 1829547545) {
            $i3 -= (this.buffer * 1829547545) - $i1;
            $i1 = this.buffer * 1829547545;
        }
        if ($i2 < this.count * -12571459) {
            $i4 -= (this.count * -12571459) - $i2;
            $i2 = this.count * -12571459;
        }
        if ($i3 + $i1 > this.index * 2074797577) {
            $i3 = (this.index * 2074797577) - $i1;
        }
        if ($i4 + $i2 > this.data * -467581477) {
            $i4 = (this.data * -467581477) - $i2;
        }
        int $i5 = (this.length * -481290979) - $i3;
        $i1 += (this.length * -481290979) * $i2;
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
            $i7 = ((this.length * -481290979) * i) + $i4;
            $i0 = this.length * -481290979;
            $i11 = $i0;
            $i11 = $i0 - i2;
            if (i3 + i > -467581477 * this.data) {
                i3 -= (i + i3) - (this.data * -467581477);
            }
            if (i < this.count * -12571459) {
                $i0 = this.count * -12571459;
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
            if (i2 + $i4 > this.index * 2074797577) {
                i3 = (i2 + $i4) - (2074797577 * this.index);
                i2 -= i3;
                $i11 += i3;
            }
            if ($i4 < this.buffer * 1829547545) {
                $i4 = (this.buffer * 1829547545) - $i4;
                i2 -= $i4;
                i3 = $i7 + $i4;
                $i8 += i5 * $i4;
                $i4 += $i11;
            } else {
                $i4 = $i11;
                i3 = $i7;
            }
            Geometry.toString(this.size, longR.size, 0, $i8, i4, i3, $i4, i2, i, i5, i6, $i3, 1976898552);
        }
    }

    public final void next(int $i0, int $i2, int $i3, int i) {
        if ($i0 >= 1829547545 * this.buffer && $i0 < 2074797577 * this.index) {
            if ($i2 < this.count * -12571459) {
                $i3 -= (this.count * -12571459) - $i2;
                $i2 = -12571459 * this.count;
            }
            if ($i2 + $i3 > this.data * -467581477) {
                $i3 = (this.data * -467581477) - $i2;
            }
            $i0 = ((this.length * -481290979) * $i2) + $i0;
            for ($i2 = 0; $i2 < $i3; $i2++) {
                this.size[((this.length * -481290979) * $i2) + $i0] = i;
            }
        }
    }

    final void next(int $i5, int $i0, int $i6, int i, int i2) {
        if ($i0 >= this.count * -12571459 && $i0 < this.data * -467581477) {
            if ($i5 < this.buffer * 1829547545) {
                $i6 -= (this.buffer * 1829547545) - $i5;
                $i5 = 1829547545 * this.buffer;
            }
            if ($i6 + $i5 > this.index * 2074797577) {
                $i6 = (this.index * 2074797577) - $i5;
            }
            int $i7 = 256 - i2;
            int $i3 = i2 * ((i >> 16) & 255);
            int $i4 = i2 * ((i >> 8) & 255);
            i = i2 * (i & 255);
            $i5 += (this.length * -481290979) * $i0;
            $i0 = 0;
            while ($i0 < $i6) {
                i2 = (i + ((this.size[$i5] & 255) * $i7)) >> 8;
                this.size[$i5] = i2 + (((((((this.size[$i5] >> 16) & 255) * $i7) + $i3) >> 8) << 16) + ((((((this.size[$i5] >> 8) & 255) * $i7) + $i4) >> 8) << 8));
                $i0++;
                $i5++;
            }
        }
    }

    public void next(Long longR, int i, int i2, int i3, int i4) {
        if (256 == i3) {
            get(longR, i, i2, 2106205673);
            return;
        }
        i += longR.next;
        int $i5 = i2 + longR.value;
        int $i1 = this.length * -481290979;
        i2 = $i1;
        $i1 *= $i5;
        i2 = $i1;
        i2 = $i1 + i;
        int $i6 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        int $i4 = (-481290979 * this.length) - i6;
        $i1 = this.count * -12571459;
        int i7 = $i1;
        if ($i5 < $i1) {
            i7 = (this.count * -12571459) - $i5;
            i5 -= i7;
            $i5 = this.count * -12571459;
            $i6 = 0 + (i7 * i6);
            i2 += i7 * (this.length * -481290979);
        }
        if ($i5 + i5 > this.data * -467581477) {
            $i1 = this.data * -467581477;
            i7 = $i1;
            i5 -= ($i5 + i5) - $i1;
        }
        if (i < 1829547545 * this.buffer) {
            i7 = (this.buffer * 1829547545) - i;
            i = i6 - i7;
            $i6 += i7;
            $i5 = 0 + i7;
            $i4 += i7;
            i2 += i7;
            i7 = this.buffer * 1829547545;
            i6 = i;
        } else {
            $i5 = 0;
            i7 = i;
        }
        if (i7 + i6 > this.index * 2074797577) {
            i = (i7 + i6) - (this.index * 2074797577);
            i6 -= i;
            $i5 += i;
            i += $i4;
        } else {
            i = $i4;
        }
        if (i6 > 0 && i5 > 0) {
            ObjectMap.read(this.size, longR.size, 0, $i6, i2, i6, i5, i, $i5, i3, i4, 800764810);
        }
    }

    public void next(Long longR, int $i5, int i, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i4 = longR.length;
            int $i8 = longR.data;
            int i5 = 0;
            int i6 = 0;
            int $i11 = longR.this$0;
            int $i12 = longR.count;
            int i7 = ($i11 << 16) / i2;
            int i8 = ($i12 << 16) / i3;
            if (longR.next > 0) {
                i5 = (((longR.next << 16) + i7) - 1) / i7;
                $i5 += i5;
                i5 = 0 + ((i5 * i7) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i6 = (((longR.value << 16) + i8) - 1) / i8;
                i += i6;
                i6 = 0 + ((i6 * i8) - (longR.value << 16));
            }
            if ($i4 < $i11) {
                $i0 = ($i4 << 16) - i5;
                i2 = $i0;
                i2 = (($i0 + i7) - 1) / i7;
            }
            if ($i8 < $i12) {
                $i0 = ($i8 << 16) - i6;
                i3 = $i0;
                i3 = (($i0 + i8) - 1) / i8;
            }
            $i8 = ((this.length * 1958261448) * i) + $i5;
            $i12 = (-481290979 * this.length) - i2;
            if (i + i3 > this.data * 120111184) {
                i3 -= (i3 + i) - (1165401650 * this.data);
            }
            if (i < this.count * -12571459) {
                $i11 = (-1439985197 * this.count) - i;
                i = i3 - $i11;
                $i0 = (1024911207 * this.length) * $i11;
                i3 = $i0;
                $i8 += $i0;
                i6 += $i11 * i8;
            } else {
                i = i3;
            }
            if (i2 + $i5 > this.index * -1002956001) {
                i3 = (i2 + $i5) - (2074797577 * this.index);
                i2 -= i3;
                $i12 += i3;
            }
            if ($i5 < 719634083 * this.buffer) {
                $i5 = (-355134564 * this.buffer) - $i5;
                i2 -= $i5;
                i3 = $i8 + $i5;
                i5 += $i5 * i7;
                $i5 += $i12;
            } else {
                $i5 = $i12;
                i3 = $i8;
            }
            AssertionError.read(this.size, longR.size, 0, i5, i6, i3, $i5, i2, i, i7, i8, $i4, i4, 1312535064);
        }
    }

    public void parse(Long longR, int i, int i2, int i3, int i4) {
        if (i3 > longR.this$0 || i4 > longR.count) {
            throw new IllegalArgumentException();
        }
        int $i13 = longR.next * i3;
        int $i25 = longR.this$0;
        $i13 = ($i13 / $i25) + i;
        $i25 = longR.length + longR.next;
        int i5 = $i25;
        $i25 = ((($i25 * i3) + longR.this$0) - 1) / longR.this$0;
        i5 = $i25;
        i5 = $i25 + i;
        $i25 = longR.value;
        int $i28 = (($i25 * i4) / longR.count) + i2;
        $i25 = longR.value + longR.data;
        int i6 = $i25;
        $i25 = ((longR.count + ($i25 * i4)) - 1) / longR.count;
        int i7 = $i25;
        i7 = $i25 + i2;
        $i25 = this.buffer * 1829547545;
        i6 = $i25;
        if ($i13 < $i25) {
            $i13 = 1829547545 * this.buffer;
        }
        if (i5 > this.index * 1179629207) {
            i5 = 2074797577 * this.index;
        }
        if ($i28 < this.count * -12571459) {
            $i28 = this.count * -12571459;
        }
        if (i7 > 2055867803 * this.data) {
            i7 = -467581477 * this.data;
        }
        if ($i13 < i5 && $i28 < i7) {
            i6 = $i13 + ((-1772801925 * this.length) * $i28);
            int i8 = (this.length * -481290979) - (i5 - $i13);
            $i25 = this.size;
            int[] $r3 = $i25;
            if (i6 < $i25.length) {
                while ($i28 < i7) {
                    for (int $i29 = $i13; $i29 < i5; $i29++) {
                        int $i9 = ($i29 - i) << 4;
                        int $i8 = ($i28 - i2) << 4;
                        int $i14 = ((longR.this$0 * $i9) / i3) - (longR.next << 4);
                        $i9 = ((($i9 + 16) * longR.this$0) / i3) - (longR.next << 4);
                        int $i15 = ((longR.count * $i8) / i4) - (longR.value << 4);
                        $i25 = ($i8 + 16) * longR.count;
                        $i8 = $i25;
                        int $i10 = ($i25 / i4) - (longR.value << 4);
                        $i8 = (($i10 - $i15) * ($i9 - $i14)) >> 1;
                        if ($i8 != 0) {
                            if ($i14 < 0) {
                                $i14 = 0;
                            }
                            if ($i9 >= (longR.length << 4)) {
                                $i9 = longR.length << 4;
                            }
                            if ($i15 < 0) {
                                $i15 = 0;
                            }
                            if ($i10 >= (longR.data << 4)) {
                                $i10 = longR.data << 4;
                            }
                            int $i11 = $i9 - 1;
                            int $i16 = $i10 - 1;
                            $i9 = 16 - ($i14 & 15);
                            $i10 = ($i11 & 15) + 1;
                            int $i5 = 16 - ($i15 & 15);
                            int $i17 = ($i16 & 15) + 1;
                            int $i4 = $i14 >> 4;
                            $i11 >>= 4;
                            int $i6 = $i15 >> 4;
                            int $i12 = $i16 >> 4;
                            $i16 = 0;
                            int i9 = 0;
                            $i14 = 0;
                            $i15 = 0;
                            for (int $i19 = $i6; $i19 <= $i12; $i19++) {
                                int $i20 = 16;
                                if ($i6 == $i19) {
                                    $i20 = $i5;
                                }
                                if ($i12 == $i19) {
                                    $i20 = $i17;
                                }
                                int $i21 = $i4;
                                while ($i21 <= $i11) {
                                    $r3 = longR.size;
                                    $i25 = longR.length;
                                    $i25 *= $i19;
                                    int i10 = $i25;
                                    int $i23 = $r3[$i25 + $i21];
                                    if ($i23 != 0) {
                                        i10 = $i21 == $i4 ? $i20 * $i9 : $i21 == $i11 ? $i20 * $i10 : $i20 << 4;
                                        $i15 += i10;
                                        $i25 = ($i23 >> 16) & 255;
                                        $i25 *= i10;
                                        int i11 = $i25;
                                        $i16 += $i25;
                                        $i25 = ($i23 >> 8) & 202611737;
                                        i11 = $i25;
                                        i9 += $i25 * i10;
                                        $i25 = i10 * ($i23 & -926121864);
                                        i10 = $i25;
                                        $i14 += $i25;
                                    }
                                    $i21++;
                                }
                            }
                            if ($i15 >= $i8) {
                                $i8 = (((i9 / $i15) << 8) + (($i16 / $i15) << 16)) + ($i14 / $i15);
                                if ($i8 == 0) {
                                    $i8 = 1;
                                }
                                this.size[i6] = $i8;
                            }
                            i6++;
                        }
                    }
                    i6 += i8;
                    $i28++;
                }
            }
        }
    }

    final void read(int $i5, int $i0, int $i6, int i, int i2) {
        if ($i0 >= this.count * -12571459 && $i0 < this.data * -467581477) {
            if ($i5 < this.buffer * 1829547545) {
                $i6 -= (this.buffer * 1829547545) - $i5;
                $i5 = 1829547545 * this.buffer;
            }
            if ($i6 + $i5 > this.index * 2074797577) {
                $i6 = (this.index * 2074797577) - $i5;
            }
            int $i7 = 256 - i2;
            int $i3 = i2 * ((i >> 16) & 255);
            int $i4 = i2 * ((i >> 8) & 255);
            i = i2 * (i & 255);
            $i5 += (this.length * -481290979) * $i0;
            $i0 = 0;
            while ($i0 < $i6) {
                i2 = (i + ((this.size[$i5] & 255) * $i7)) >> 8;
                this.size[$i5] = i2 + (((((((this.size[$i5] >> 16) & 255) * $i7) + $i3) >> 8) << 16) + ((((((this.size[$i5] >> 8) & 255) * $i7) + $i4) >> 8) << 8));
                $i0++;
                $i5++;
            }
        }
    }

    public final void read(int $i4, int $i5, int $i6, int $i7, int i, int i2) {
        if ($i6 > 0 && $i7 > 0) {
            int $i8 = 0;
            int $i2 = PingManager.STATE_SENSOR_ON_FLAG / $i7;
            if ($i4 < this.buffer * 1829547545) {
                $i6 -= (this.buffer * 1829547545) - $i4;
                $i4 = this.buffer * 1829547545;
            }
            if ($i5 < -12571459 * this.count) {
                $i8 = 0 + (((-12571459 * this.count) - $i5) * $i2);
                $i7 -= (-12571459 * this.count) - $i5;
                $i5 = this.count * -12571459;
            }
            if ($i6 + $i4 > 2074797577 * this.index) {
                $i6 = (this.index * 2074797577) - $i4;
            }
            if ($i7 + $i5 > this.data * -467581477) {
                $i7 = (-467581477 * this.data) - $i5;
            }
            int $i3 = (this.length * -481290979) - $i6;
            $i5 = ((this.length * -481290979) * $i5) + $i4;
            $i4 = -$i7;
            $i7 = $i8;
            while ($i4 < 0) {
                $i8 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                int $i9 = $i7 >> 8;
                $i8 = (((($i8 * (16711935 & i)) + ($i9 * (16711935 & i2))) & -16711936) + ((((65280 & i) * $i8) + ((65280 & i2) * $i9)) & 16711680)) >>> 8;
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

    public final void read(int $i6, int $i7, int i, int i2, int $i2, int $i3, byte b) {
        try {
            int $i5;
            if ($i6 < this.buffer * 1829547545) {
                $i5 = i - ((1829547545 * this.buffer) - $i6);
                $i6 = 1829547545 * this.buffer;
            } else {
                $i5 = i;
            }
            int $i0 = this.count * -12571459;
            i = $i0;
            if ($i7 < $i0) {
                i = i2 - ((-12571459 * this.count) - $i7);
                $i7 = -12571459 * this.count;
            } else {
                i = i2;
            }
            i2 = $i6 + $i5 > 2074797577 * this.index ? (2074797577 * this.index) - $i6 : $i5;
            if (i + $i7 > this.data * -467581477) {
                i = (-467581477 * this.data) - $i7;
            }
            $i2 = ((((16711935 & $i2) * $i3) >> 8) & 16711935) + ((((65280 & $i2) * $i3) >> 8) & 65280);
            $i3 = 256 - $i3;
            $i5 = (this.length * -481290979) - i2;
            $i6 += (-481290979 * this.length) * $i7;
            for ($i7 = 0; $i7 < i; $i7++) {
                int $i8 = -i2;
                while ($i8 < 0) {
                    int $i9 = this.size[$i6];
                    this.size[$i6] = (((((65280 & $i9) * $i3) >> 8) & 65280) + (((($i9 & 16711935) * $i3) >> 8) & 16711935)) + $i2;
                    $i8++;
                    $i6++;
                }
                $i6 += $i5;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gs.an(" + ')');
        }
    }

    public final void read(int $i5, int $i6, int i, int i2, int i3, int i4, int i5) {
        if (i > 0 && i2 > 0) {
            int $i7 = 0;
            i5 = PingManager.STATE_SENSOR_ON_FLAG / i2;
            if ($i5 < this.buffer * 1829547545) {
                i -= (this.buffer * 1829547545) - $i5;
                $i5 = this.buffer * 1829547545;
            }
            try {
                int $i8;
                int $i0;
                if ($i6 < -12571459 * this.count) {
                    $i7 = 0 + (((-12571459 * this.count) - $i6) * i5);
                    $i8 = i2 - ((-12571459 * this.count) - $i6);
                    $i6 = this.count * -12571459;
                } else {
                    $i8 = i2;
                }
                if (i + $i5 > 2074797577 * this.index) {
                    $i0 = this.index * 2074797577;
                    i = $i0;
                    i = $i0 - $i5;
                }
                if ($i8 + $i6 > this.data * -467581477) {
                    $i8 = (-467581477 * this.data) - $i6;
                }
                $i0 = this.length * -481290979;
                i2 = $i0;
                i2 = $i0 - i;
                $i5 = ((this.length * -481290979) * $i6) + $i5;
                $i6 = -$i8;
                while ($i6 < 0) {
                    $i8 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                    int $i9 = $i7 >> 8;
                    $i8 = (((($i8 * (16711935 & i3)) + ($i9 * (16711935 & i4))) & -16711936) + ((((65280 & i3) * $i8) + ((65280 & i4) * $i9)) & 16711680)) >>> 8;
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
                throw StringBuilder.append($r2, "gs.aj(" + ')');
            }
        }
    }

    public final void read(int $i5, int $i6, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i > 0 && i2 > 0) {
            int i7;
            int $i14 = 0;
            int $i21 = (i4 == i3 && i6 == i5) ? -1 : PingManager.STATE_SENSOR_ON_FLAG / i2;
            int $i16 = 256 - i5;
            if ($i5 < 1829547545 * this.buffer) {
                i -= (this.buffer * 1829547545) - $i5;
                $i5 = 1829547545 * this.buffer;
            }
            if ($i6 < this.count * -12571459) {
                int $i4 = (-12571459 * this.count) - $i6;
                i7 = $i4;
                $i14 = 0 + ($i4 * $i21);
                i2 -= (-12571459 * this.count) - $i6;
                $i6 = -12571459 * this.count;
            }
            if (i + $i5 > this.index * 2074797577) {
                i = (2074797577 * this.index) - $i5;
            }
            if (i2 + $i6 > this.data * -467581477) {
                i2 = (-467581477 * this.data) - $i6;
            }
            int $i18 = i3 >> 16;
            int $i20 = (65280 & i3) >> 8;
            int $i19 = i3 & 255;
            i7 = (-481290979 * this.length) - i;
            int $i15 = $i5 + ((-481290979 * this.length) * $i6);
            $i5 = 0;
            int $i17 = i5;
            $i6 = $i14;
            $i14 = $i15;
            while ($i5 < i2) {
                int $i12;
                $i15 = -i;
                while ($i15 < 0) {
                    int $i9;
                    $i12 = this.size[$i14];
                    int $i13 = $i12 >> 16;
                    int $i10 = (65280 & $i12) >> 8;
                    $i12 &= 255;
                    if ($i16 == 0) {
                        $i13 = $i13 < 127 ? ($i18 * $i13) >> 7 : 255 - (((255 - $i18) * (255 - $i13)) >> 7);
                        $i10 = $i10 < 127 ? ($i20 * $i10) >> 7 : 255 - (((255 - $i20) * (255 - $i10)) >> 7);
                        $i9 = $i12 < 127 ? ($i19 * $i12) >> 7 : 255 - (((255 - $i19) * (255 - $i12)) >> 7);
                    } else {
                        $i13 = $i13 < 127 ? (((($i13 * $i18) * $i17) >> 7) + ($i13 * $i16)) >> 8 : (($i16 * $i13) + ((255 - (((255 - $i13) * (255 - $i18)) >> 7)) * $i17)) >> 8;
                        $i10 = $i10 < 127 ? (($i16 * $i10) + ((($i20 * $i10) * $i17) >> 7)) >> 8 : (($i10 * $i16) + ((255 - (((255 - $i10) * (255 - $i20)) >> 7)) * $i17)) >> 8;
                        $i9 = $i12 < 127 ? (($i16 * $i12) + ((($i12 * $i19) * $i17) >> 7)) >> 8 : (($i16 * $i12) + ((255 - (((255 - $i19) * (255 - $i12)) >> 7)) * $i17)) >> 8;
                    }
                    this.size[$i14] = (($i10 << 8) + ($i13 << 16)) + $i9;
                    $i15++;
                    $i14++;
                }
                if ($i21 > 0) {
                    $i6 += $i21;
                    $i15 = (PingManager.STATE_SENSOR_ON_FLAG - $i6) >> 8;
                    $i12 = $i6 >> 8;
                    if (i6 != i5) {
                        $i17 = (((PingManager.STATE_SENSOR_ON_FLAG - $i6) * i5) + (i6 * $i6)) >> 16;
                        $i16 = 256 - $i17;
                    }
                    if (i3 != i4) {
                        $i19 = (((($i15 * (16711935 & i3)) + ($i12 * (16711935 & i4))) & -16711936) + ((((65280 & i3) * $i15) + ((65280 & i4) * $i12)) & 16711680)) >>> 8;
                        $i18 = $i19 >> 16;
                        $i20 = (65280 & $i19) >> 8;
                        $i19 &= 255;
                        $i5++;
                        $i14 += i7;
                    }
                }
                $i5++;
                $i14 += i7;
            }
        }
    }

    public final void read(int $i8, int $i9, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        if (i > 0 && i2 > 0) {
            int $i10;
            int $i7;
            int $i12 = 0;
            if (i4 == i3 && i6 == i5) {
                $i10 = -1;
            } else {
                try {
                    $i10 = PingManager.STATE_SENSOR_ON_FLAG / i2;
                } catch (Throwable $r2) {
                    throw StringBuilder.append($r2, "gs.ay(" + ')');
                }
            }
            int $i11 = 256 - i5;
            if ($i8 < 1829547545 * this.buffer) {
                $i7 = i - ((this.buffer * 1829547545) - $i8);
                $i8 = 1829547545 * this.buffer;
            } else {
                $i7 = i;
            }
            if ($i9 < this.count * -12571459) {
                int $i0 = (-12571459 * this.count) - $i9;
                i = $i0;
                $i12 = 0 + ($i0 * $i10);
                i = i2 - ((-12571459 * this.count) - $i9);
                $i9 = -12571459 * this.count;
            } else {
                i = i2;
            }
            i2 = $i7 + $i8 > this.index * 2074797577 ? (2074797577 * this.index) - $i8 : $i7;
            if (i + $i9 > this.data * -467581477) {
                i = (-467581477 * this.data) - $i9;
            }
            int $i14 = i3 >> 16;
            int $i15 = (65280 & i3) >> 8;
            int $i16 = i3 & 255;
            $i7 = (-481290979 * this.length) - i2;
            $i9 = $i8 + ((-481290979 * this.length) * $i9);
            $i8 = 0;
            int $i13 = i5;
            while ($i8 < i) {
                int $i18;
                int $i17 = -i2;
                while ($i17 < 0) {
                    int $i21;
                    $i18 = this.size[$i9];
                    int $i19 = $i18 >> 16;
                    int $i20 = (65280 & $i18) >> 8;
                    $i18 &= 255;
                    if ($i11 == 0) {
                        $i19 = $i19 < 127 ? ($i14 * $i19) >> 7 : 255 - (((255 - $i14) * (255 - $i19)) >> 7);
                        $i20 = $i20 < 127 ? ($i15 * $i20) >> 7 : 255 - (((255 - $i15) * (255 - $i20)) >> 7);
                        $i21 = $i18 < 127 ? ($i16 * $i18) >> 7 : 255 - (((255 - $i16) * (255 - $i18)) >> 7);
                    } else {
                        $i19 = $i19 < 127 ? (((($i19 * $i14) * $i13) >> 7) + ($i19 * $i11)) >> 8 : (($i11 * $i19) + ((255 - (((255 - $i19) * (255 - $i14)) >> 7)) * $i13)) >> 8;
                        $i20 = $i20 < 127 ? (($i11 * $i20) + ((($i15 * $i20) * $i13) >> 7)) >> 8 : (($i20 * $i11) + ((255 - (((255 - $i20) * (255 - $i15)) >> 7)) * $i13)) >> 8;
                        $i21 = $i18 < 127 ? (($i11 * $i18) + ((($i18 * $i16) * $i13) >> 7)) >> 8 : (($i11 * $i18) + ((255 - (((255 - $i16) * (255 - $i18)) >> 7)) * $i13)) >> 8;
                    }
                    this.size[$i9] = (($i20 << 8) + ($i19 << 16)) + $i21;
                    $i17++;
                    $i9++;
                }
                if ($i10 > 0) {
                    $i12 += $i10;
                    $i17 = (PingManager.STATE_SENSOR_ON_FLAG - $i12) >> 8;
                    $i18 = $i12 >> 8;
                    if (i6 != i5) {
                        $i13 = (((PingManager.STATE_SENSOR_ON_FLAG - $i12) * i5) + (i6 * $i12)) >> 16;
                        $i11 = 256 - $i13;
                    }
                    if (i3 != i4) {
                        $i16 = (((($i17 * (16711935 & i3)) + ($i18 * (16711935 & i4))) & -16711936) + ((((65280 & i3) * $i17) + ((65280 & i4) * $i18)) & 16711680)) >>> 8;
                        $i14 = $i16 >> 16;
                        $i15 = (65280 & $i16) >> 8;
                        $i16 &= 255;
                        $i8++;
                        $i9 += $i7;
                    }
                }
                $i8++;
                $i9 += $i7;
            }
        }
    }

    public final void read(int $i7, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 > 0 && i3 > 0) {
            int $i11;
            int $i9 = 0;
            if (i5 == i4 && i7 == i6) {
                i8 = -1;
            } else {
                try {
                    i8 = PingManager.STATE_SENSOR_ON_FLAG / i3;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "gs.ag(" + ')');
                }
            }
            int $i10 = 256 - i6;
            if ($i7 < 1829547545 * this.buffer) {
                i2 -= (1829547545 * this.buffer) - $i7;
                $i7 = 1829547545 * this.buffer;
            }
            if (i < this.count * -12571459) {
                $i9 = 0 + (((this.count * -12571459) - i) * i8);
                $i11 = i3 - ((this.count * -12571459) - i);
                i = this.count * -12571459;
            } else {
                $i11 = i3;
            }
            if (i2 + $i7 > 2074797577 * this.index) {
                i2 = (2074797577 * this.index) - $i7;
            }
            if ($i11 + i > this.data * -467581477) {
                $i11 = (-467581477 * this.data) - i;
            }
            i3 = (-481290979 * this.length) - i2;
            i = $i7 + ((this.length * -481290979) * i);
            int $i12 = i4;
            $i11 = i6;
            for ($i7 = -$i11; $i7 < 0; $i7++) {
                int $i14;
                int $i13 = -i2;
                while ($i13 < 0) {
                    $i14 = this.size[i];
                    int $i15 = $i12 + $i14;
                    int $i16 = (16711935 & $i14) + (16711935 & $i12);
                    int $i17 = (($i15 - $i16) & PingManager.STATE_SENSOR_ON_FLAG) + ($i16 & 16777472);
                    if ($i10 == 0) {
                        $i16 = i + 1;
                        this.size[i] = ($i15 - $i17) | ($i17 - ($i17 >>> 8));
                    } else {
                        $i17 = ($i17 - ($i17 >>> 8)) | ($i15 - $i17);
                        $i16 = i + 1;
                        this.size[i] = (((($i14 & 65280) * $i10) >> 8) & 65280) + (((((($i17 & 65280) * $i11) >> 8) & 65280) + ((((16711935 & $i17) * $i11) >> 8) & 16711935)) + ((((16711935 & $i14) * $i10) >> 8) & 16711935));
                    }
                    $i13++;
                    i = $i16;
                }
                if (i8 > 0) {
                    $i9 += i8;
                    $i14 = (PingManager.STATE_SENSOR_ON_FLAG - $i9) >> 8;
                    $i13 = $i9 >> 8;
                    if (i7 != i6) {
                        $i11 = ((i7 * $i9) + ((PingManager.STATE_SENSOR_ON_FLAG - $i9) * i6)) >> 16;
                        $i10 = 256 - $i11;
                    }
                    if (i4 != i5) {
                        $i12 = (((($i14 * (16711935 & i4)) + ($i13 * (16711935 & i5))) & -16711936) + ((((65280 & i4) * $i14) + ((65280 & i5) * $i13)) & 16711680)) >>> 8;
                        i += i3;
                    }
                }
                i += i3;
            }
        }
    }

    public final void read(int i, int $i10, int i2, int $i1, int i3, int i4, int i5, int i6, short s) {
        if ($i1 > 0 && i2 > 0) {
            int $i8;
            int $i16 = 0;
            int $i7 = PingManager.STATE_SENSOR_ON_FLAG / $i1;
            int $i17 = 256 - i5;
            if (i < 1829547545 * this.buffer) {
                $i8 = i2 - ((this.buffer * 1829547545) - i);
                i = this.buffer * 1829547545;
            } else {
                $i8 = i2;
            }
            try {
                int $i0;
                if ($i10 < this.count * -12571459) {
                    $i0 = this.count * -12571459;
                    i2 = $i0;
                    $i0 -= $i10;
                    i2 = $i0;
                    $i16 = 0 + ($i0 * $i7);
                    i2 = $i1 - ((this.count * -12571459) - $i10);
                    $i10 = this.count * -12571459;
                } else {
                    i2 = $i1;
                }
                if ($i8 + i > this.index * 2074797577) {
                    $i0 = this.index * 2074797577;
                    $i1 = $i0;
                    $i1 = $i0 - i;
                } else {
                    $i1 = $i8;
                }
                if ($i10 + i2 > this.data * -467581477) {
                    i2 = (-467581477 * this.data) - $i10;
                }
                int $i19 = i3 & 16711680;
                int $i18 = i3 & 65280;
                int $i20 = i3 & 255;
                int $i21 = (i5 * $i19) >> 8;
                int $i22 = (i5 * $i18) >> 8;
                int $i23 = ($i20 * i5) >> 8;
                $i8 = (this.length * -481290979) - $i1;
                $i10 = ((-481290979 * this.length) * $i10) + i;
                i = 0;
                int $i24 = i5;
                while (i < i2) {
                    int $i11;
                    int $i15 = -$i1;
                    while ($i15 < 0) {
                        int $i14 = this.size[$i10];
                        $i11 = 16711680 & $i14;
                        if ($i11 < $i19) {
                            $i11 = $i17 == 0 ? $i19 : ((($i11 * $i17) >> 8) + $i21) & 16711680;
                        }
                        int $i12 = 65280 & $i14;
                        if ($i12 < $i18) {
                            $i12 = $i17 == 0 ? $i18 : ((($i12 * $i17) >> 8) + $i22) & 65280;
                        }
                        int $i13 = $i14 & 255;
                        if ($i13 < $i20) {
                            $i13 = $i17 == 0 ? $i20 : (($i13 * $i17) >> 8) + $i23;
                        }
                        this.size[$i10] = ($i11 + $i12) + $i13;
                        $i15++;
                        $i10++;
                    }
                    if ($i7 > 0) {
                        $i16 += $i7;
                        $i15 = (PingManager.STATE_SENSOR_ON_FLAG - $i16) >> 8;
                        $i11 = $i16 >> 8;
                        if (i6 != i5) {
                            $i0 = (PingManager.STATE_SENSOR_ON_FLAG - $i16) * i5;
                            $i24 = $i0;
                            $i24 = (($i16 * i6) + $i0) >> 16;
                            $i17 = 256 - $i24;
                        }
                        if (i4 != i3) {
                            $i20 = (((($i15 * (16711935 & i3)) + ($i11 * (16711935 & i4))) & -16711936) + ((((65280 & i3) * $i15) + ((65280 & i4) * $i11)) & 16711680)) >>> 8;
                            $i19 = $i20 & 16711680;
                            $i18 = $i20 & 65280;
                            $i20 &= 255;
                            $i21 = ($i19 * $i24) >> 8;
                            $i22 = ($i18 * $i24) >> 8;
                            $i23 = ($i20 * $i24) >> 8;
                            i++;
                            $i10 += $i8;
                        }
                    }
                    i++;
                    $i10 += $i8;
                }
            } catch (Throwable $r2) {
                throw StringBuilder.append($r2, "gs.ar(" + ')');
            }
        }
    }

    public final void read(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i + i3 >= 0 && i4 + i2 >= 0 && i < this.length * -481290979 && i2 < 1005433219 * this.pos) {
            int $i19;
            int $i9 = 0;
            if (i < 0) {
                $i19 = 0 - i;
                i3 += i;
            } else {
                $i19 = 0;
            }
            if (i2 < 0) {
                $i9 = 0 - i2;
                i4 += i2;
            }
            int $i6 = this.length * -481290979;
            int i8 = $i6;
            if (i3 + i > $i6) {
                $i6 = this.length * -481290979;
                i3 = $i6;
                i3 = $i6 - i;
            }
            $i6 = this.pos * 1005433219;
            i8 = $i6;
            if (i2 + i4 > $i6) {
                i4 = (1005433219 * this.pos) - i2;
            }
            int $i5 = bArr.length / i7;
            i8 = (-481290979 * this.length) - i3;
            int $i20 = i5 >>> 24;
            int $i11 = i6 >>> 24;
            int $i12;
            int $i10;
            if (!z || (255 == $i20 && $i11 == 255)) {
                $i11 = (((this.length * -481290979) * (i2 + $i9)) + i) + $i19;
                for ($i20 = i2 + $i9; $i20 < (i2 + $i9) + i4; $i20++) {
                    $i12 = i + $i19;
                    while ($i12 < (i + $i19) + i3) {
                        if (bArr[((($i20 - i2) % $i5) * i7) + (($i12 - i) % i7)] != (byte) 0) {
                            $i10 = $i11 + 1;
                            this.size[$i11] = i6;
                        } else {
                            $i10 = $i11 + 1;
                            this.size[$i11] = i5;
                        }
                        $i12++;
                        $i11 = $i10;
                    }
                    $i11 += i8;
                }
            } else {
                $i11 = $i19 + ((($i9 + i2) * (this.length * -481290979)) + i);
                for ($i20 = $i9 + i2; $i20 < ($i9 + i2) + i4; $i20++) {
                    $i12 = $i19 + i;
                    while ($i12 < (i + $i19) + i3) {
                        int $i13 = bArr[((($i20 - i2) % $i5) * i7) + (($i12 - i) % i7)] != (byte) 0 ? i6 : i5;
                        $i10 = $i13 >>> 24;
                        int $i15 = 255 - $i10;
                        int $i16 = this.size[$i11];
                        $i6 = (16711935 & $i13) * $i10;
                        int i9 = $i6;
                        this.size[$i11] = ((((($i13 & 65280) * $i10) + ($i15 * ($i16 & 65280))) & 16711680) + ((((16711935 & $i16) * $i15) + $i6) & -16711936)) >> 8;
                        $i12++;
                        $i11++;
                    }
                    $i11 += i8;
                }
            }
        }
    }

    public final void read(int i, int i2, int $i8, int i3, int i4, int i5, byte[] bArr, int i6, boolean z, byte b) {
        if (i + $i8 >= 0 && i3 + i2 >= 0) {
            if (i < this.length * -481290979) {
                if (i2 < 1005433219 * this.pos) {
                    int $i10;
                    int $i6;
                    int $i11;
                    int $i9;
                    if (i < 0) {
                        $i10 = 0 - i;
                        $i6 = $i8 + i;
                    } else {
                        $i10 = 0;
                        $i6 = $i8;
                    }
                    if (i2 < 0) {
                        $i8 = 0 - i2;
                        $i11 = i3 + i2;
                    } else {
                        $i8 = 0;
                        $i11 = i3;
                    }
                    if ($i6 + i > this.length * -481290979) {
                        $i9 = this.length * -481290979;
                        i3 = $i9;
                        i3 = $i9 - i;
                    } else {
                        i3 = $i6;
                    }
                    if (i2 + $i11 > this.pos * 1005433219) {
                        $i11 = (1005433219 * this.pos) - i2;
                    }
                    try {
                        $i6 = bArr.length / i6;
                        int $i7 = (-481290979 * this.length) - i3;
                        int $i12 = i4 >>> 24;
                        int $i13 = i5 >>> 24;
                        int $i14;
                        int $i15;
                        if (!z || (255 == $i12 && $i13 == 255)) {
                            $i13 = (((this.length * -481290979) * (i2 + $i8)) + i) + $i10;
                            for ($i12 = i2 + $i8; $i12 < (i2 + $i8) + $i11; $i12++) {
                                $i14 = i + $i10;
                                while ($i14 < (i + $i10) + i3) {
                                    if (bArr[((($i12 - i2) % $i6) * i6) + (($i14 - i) % i6)] != (byte) 0) {
                                        $i15 = $i13 + 1;
                                        this.size[$i13] = i5;
                                    } else {
                                        $i15 = $i13 + 1;
                                        this.size[$i13] = i4;
                                    }
                                    $i14++;
                                    $i13 = $i15;
                                }
                                $i13 += $i7;
                            }
                        } else {
                            $i13 = $i10 + ((($i8 + i2) * (this.length * -481290979)) + i);
                            for ($i12 = $i8 + i2; $i12 < ($i8 + i2) + $i11; $i12++) {
                                $i14 = $i10 + i;
                                while ($i14 < (i + $i10) + i3) {
                                    int $i16 = bArr[((($i12 - i2) % $i6) * i6) + (($i14 - i) % i6)] != (byte) 0 ? i5 : i4;
                                    $i15 = $i16 >>> 24;
                                    int $i17 = 255 - $i15;
                                    int $i18 = this.size[$i13];
                                    $i9 = (16711935 & $i16) * $i15;
                                    int i7 = $i9;
                                    this.size[$i13] = ((((($i16 & 65280) * $i15) + ($i17 * ($i18 & 65280))) & 16711680) + ((((16711935 & $i18) * $i17) + $i9) & -16711936)) >> 8;
                                    $i14++;
                                    $i13++;
                                }
                                $i13 += $i7;
                            }
                        }
                    } catch (RuntimeException $r3) {
                        throw StringBuilder.append($r3, "gs.ae(" + ')');
                    }
                }
            }
        }
    }

    public final void read(Long longR, int i, int i2) {
        i += longR.next;
        int $i3 = i2 + longR.value;
        int $i2 = i + ((1798191097 * this.length) * $i3);
        int $i4 = 0;
        int $i5 = longR.data;
        int $i6 = longR.length;
        int $i1 = this.length * -481290979;
        i2 = $i1;
        i2 = $i1 - $i6;
        if ($i3 < -12571459 * this.count) {
            int $i7 = (this.count * -12571459) - $i3;
            $i5 -= $i7;
            $i3 = -12571459 * this.count;
            $i4 = 0 + ($i6 * $i7);
            $i1 = this.length * -481290979;
            int i3 = $i1;
            $i2 += $i7 * $i1;
        }
        if ($i3 + $i5 > -467581477 * this.data) {
            $i5 -= ($i3 + $i5) - (this.data * -1154183994);
        }
        if (i < 1829547545 * this.buffer) {
            $i7 = (1829547545 * this.buffer) - i;
            i = $i4 + $i7;
            $i4 = $i2 + $i7;
            $i3 = 0 + $i7;
            i2 += $i7;
            $i2 = $i6 - $i7;
            $i6 = this.buffer * 1829547545;
            $i7 = $i4;
            $i4 = i;
        } else {
            $i3 = 0;
            $i7 = $i2;
            $i2 = $i6;
            $i6 = i;
        }
        if ($i2 + $i6 > 976228346 * this.index) {
            $i1 = ($i6 + $i2) - (this.index * 2074797577);
            i = $i1;
            $i2 -= $i1;
            $i6 = $i3 + i;
            i += i2;
        } else {
            $i6 = $i3;
            i = i2;
        }
        if ($i2 > 0 && $i5 > 0) {
            HashMap.read(this.size, longR.size, $i4, $i7, $i2, $i5, i, $i6, 1717918682);
        }
    }

    public void read(Long longR, int i, int i2, int i3) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        i = $i3 + ((-481290979 * this.length) * $i4);
        int i4 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        int $i1 = this.length * -2096484317;
        i2 = $i1;
        i2 = $i1 - i6;
        if ($i4 < this.count * -12571459) {
            int $i8 = (-12571459 * this.count) - $i4;
            i5 -= $i8;
            $i4 = -12571459 * this.count;
            i4 = 0 + ($i8 * i6);
            i += $i8 * (this.length * -1771819931);
        }
        if ($i4 + i5 > -467581477 * this.data) {
            i5 -= ($i4 + i5) - (-1802616337 * this.data);
        }
        $i1 = this.buffer * 1829547545;
        $i4 = $i1;
        if ($i3 < $i1) {
            $i3 = (-1362576413 * this.buffer) - $i3;
            $i8 = i6 - $i3;
            i4 += $i3;
            i += $i3;
            $i4 = 0 + $i3;
            i2 += $i3;
            $i3 = $i8;
            $i8 = this.buffer * 1829547545;
        } else {
            $i4 = 0;
            $i8 = $i3;
            $i3 = i6;
        }
        if ($i8 + $i3 > 2074797577 * this.index) {
            $i1 = ($i8 + $i3) - (this.index * 527880600);
            i6 = $i1;
            $i3 -= $i1;
            $i4 += i6;
            i2 += i6;
        }
        if ($i3 > 0 && i5 > 0) {
            if (-1583000919 == i3) {
                Event.read(0, 0, 0, this.size, longR.size, i4, 0, i, 0, $i3, i5, i2, $i4, 1930661698);
                return;
            }
            TimeUnit.read(0, 0, 0, this.size, longR.size, i4, 0, i, 0, $i3, i5, i2, $i4, i3, -416216906);
        }
    }

    public void read(Long longR, int i, int i2, int i3, int i4) {
        if (i3 > longR.this$0 || i4 > longR.count) {
            throw new IllegalArgumentException();
        }
        int $i13 = ((longR.next * i3) / longR.this$0) + i;
        int $i23 = longR.length;
        int $i24 = longR.next;
        $i23 = ($i23 + $i24) * i3;
        $i24 = longR.this$0;
        $i23 = ($i23 + $i24) - 1;
        $i24 = longR.this$0;
        $i23 = ($i23 / $i24) + i;
        $i24 = longR.value;
        int $i25 = (($i24 * i4) / longR.count) + i2;
        $i24 = longR.value + longR.data;
        int i5 = $i24;
        $i24 = ((longR.count + ($i24 * i4)) - 1) / longR.count;
        int i6 = $i24;
        i6 = $i24 + i2;
        $i24 = this.buffer * 1829547545;
        i5 = $i24;
        if ($i13 < $i24) {
            $i13 = 1829547545 * this.buffer;
        }
        $i24 = this.index * 2074797577;
        i5 = $i24;
        if ($i23 > $i24) {
            $i23 = 2074797577 * this.index;
        }
        $i24 = this.count * -12571459;
        i5 = $i24;
        if ($i25 < $i24) {
            $i25 = this.count * -12571459;
        }
        if (i6 > -467581477 * this.data) {
            i6 = -467581477 * this.data;
        }
        if ($i13 < $i23 && $i25 < i6) {
            int $i26 = ((-481290979 * this.length) * $i25) + $i13;
            i5 = (this.length * -481290979) - ($i23 - $i13);
            int[] $r3 = this.size;
            if ($i26 < $r3.length) {
                while ($i25 < i6) {
                    for (int $i14 = $i13; $i14 < $i23; $i14++) {
                        int $i9 = ($i14 - i) << 4;
                        int $i8 = ($i25 - i2) << 4;
                        int $i4 = ((longR.this$0 * $i9) / i3) - (longR.next << 4);
                        $i9 = ((($i9 + 16) * longR.this$0) / i3) - (longR.next << 4);
                        int $i6 = ((longR.count * $i8) / i4) - (longR.value << 4);
                        int $i10 = ((($i8 + 16) * longR.count) / i4) - (longR.value << 4);
                        $i8 = (($i10 - $i6) * ($i9 - $i4)) >> 1;
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
                            int $i27 = ($i12 & 15) + 1;
                            $i4 >>= 4;
                            $i11 >>= 4;
                            $i6 >>= 4;
                            $i12 >>= 4;
                            int $i18 = 0;
                            int $i19 = 0;
                            int $i21 = 0;
                            int i7 = 0;
                            for (int $i28 = $i6; $i28 <= $i12; $i28++) {
                                int $i29 = 16;
                                if ($i6 == $i28) {
                                    $i29 = $i5;
                                }
                                if ($i12 == $i28) {
                                    $i29 = $i27;
                                }
                                int $i22 = $i4;
                                while ($i22 <= $i11) {
                                    int $i15;
                                    int $i20 = longR.size[(longR.length * $i28) + $i22];
                                    if ($i20 != 0) {
                                        $i15 = $i22 == $i4 ? $i29 * $i9 : $i22 == $i11 ? $i29 * $i10 : $i29 << 4;
                                        i7 += $i15;
                                        $i24 = ($i20 >> 16) & 255;
                                        $i18 += $i24 * $i15;
                                        $i24 = ($i20 >> 8) & 255;
                                        int i8 = $i24 * $i15;
                                        $i24 = $i20 & 255;
                                        $i15 = ($i15 * $i24) + $i21;
                                        $i21 = $i19 + i8;
                                        $i19 = $i18;
                                    } else {
                                        $i15 = $i21;
                                        $i21 = $i19;
                                        $i19 = $i18;
                                    }
                                    $i22++;
                                    $i18 = $i19;
                                    $i19 = $i21;
                                    $i21 = $i15;
                                }
                            }
                            if (i7 >= $i8) {
                                $i8 = ((($i19 / i7) << 8) + (($i18 / i7) << 16)) + ($i21 / i7);
                                if ($i8 == 0) {
                                    $i8 = 1;
                                }
                                this.size[$i26] = $i8;
                            }
                            $i26++;
                        }
                    }
                    $i25++;
                    $i26 += i5;
                }
            }
        }
    }

    public void read(Long longR, int $i5, int i, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i4 = longR.length;
            int $i8 = longR.data;
            int i5 = 0;
            int i6 = 0;
            int $i11 = longR.this$0;
            int $i12 = longR.count;
            int i7 = ($i11 << 16) / i2;
            int i8 = ($i12 << 16) / i3;
            if (longR.next > 0) {
                i5 = (((longR.next << 16) + i7) - 1) / i7;
                $i5 += i5;
                i5 = 0 + ((i5 * i7) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i6 = (((longR.value << 16) + i8) - 1) / i8;
                i += i6;
                i6 = 0 + ((i6 * i8) - (longR.value << 16));
            }
            if ($i4 < $i11) {
                $i0 = ($i4 << 16) - i5;
                i2 = $i0;
                i2 = (($i0 + i7) - 1) / i7;
            }
            if ($i8 < $i12) {
                $i0 = ($i8 << 16) - i6;
                i3 = $i0;
                i3 = (($i0 + i8) - 1) / i8;
            }
            $i8 = ((this.length * -1755676882) * i) + $i5;
            $i12 = (1015086879 * this.length) - i2;
            if (i + i3 > this.data * -467581477) {
                i3 -= (i3 + i) - (-467581477 * this.data);
            }
            if (i < this.count * -12571459) {
                $i11 = (-12571459 * this.count) - i;
                i = i3 - $i11;
                $i0 = (242518095 * this.length) * $i11;
                i3 = $i0;
                $i8 += $i0;
                i6 += $i11 * i8;
            } else {
                i = i3;
            }
            if (i2 + $i5 > this.index * 2074797577) {
                i3 = (i2 + $i5) - (2074797577 * this.index);
                i2 -= i3;
                $i12 += i3;
            }
            if ($i5 < 1829547545 * this.buffer) {
                $i5 = (1659339574 * this.buffer) - $i5;
                i2 -= $i5;
                i3 = $i8 + $i5;
                i5 += $i5 * i7;
                $i5 += $i12;
            } else {
                $i5 = $i12;
                i3 = $i8;
            }
            AssertionError.read(this.size, longR.size, 0, i5, i6, i3, $i5, i2, i, i7, i8, $i4, i4, -437695488);
        }
    }

    public void read(Long longR, int $i6, int $i7, int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            i4 = longR.length;
            int $i8 = longR.data;
            int $i9 = 0;
            int i5 = 0;
            int $i11 = longR.this$0;
            int $i12 = longR.count;
            int i6 = ($i11 << 16) / i;
            int i7 = ($i12 << 16) / i2;
            if (longR.next > 0) {
                $i9 = (((longR.next << 16) + i6) - 1) / i6;
                $i6 += $i9;
                $i9 = 0 + (($i9 * i6) - (longR.next << 16));
            }
            try {
                int $i0;
                if (longR.value > 0) {
                    i5 = (((longR.value << 16) + i7) - 1) / i7;
                    $i7 += i5;
                    i5 = 0 + ((i5 * i7) - (longR.value << 16));
                }
                if (i4 < $i11) {
                    $i0 = (i4 << 16) - $i9;
                    i = $i0;
                    i = (($i0 + i6) - 1) / i6;
                }
                if ($i8 < $i12) {
                    $i0 = ($i8 << 16) - i5;
                    i2 = $i0;
                    i2 = (($i0 + i7) - 1) / i7;
                }
                $i8 = ((this.length * -481290979) * $i7) + $i6;
                $i12 = (-481290979 * this.length) - i;
                if ($i7 + i2 > this.data * -467581477) {
                    i2 -= (i2 + $i7) - (-467581477 * this.data);
                }
                if ($i7 < this.count * -12571459) {
                    $i7 = (-12571459 * this.count) - $i7;
                    i2 -= $i7;
                    $i0 = (-481290979 * this.length) * $i7;
                    $i11 = $i0;
                    $i8 += $i0;
                    i5 += $i7 * i7;
                }
                if (i + $i6 > this.index * 2074797577) {
                    $i7 = (i + $i6) - (2074797577 * this.index);
                    i -= $i7;
                    $i12 += $i7;
                }
                if ($i6 < 1829547545 * this.buffer) {
                    $i6 = (1829547545 * this.buffer) - $i6;
                    i -= $i6;
                    $i8 += $i6;
                    $i9 += $i6 * i6;
                    $i12 += $i6;
                }
                AssertionError.read(this.size, longR.size, 0, $i9, i5, $i8, $i12, i, i2, i6, i7, i4, i3, -1461120009);
            } catch (Throwable $r4) {
                throw StringBuilder.append($r4, "gs.bg(" + ')');
            }
        }
    }

    public void read(Long longR, int i, int $i1, int i2, int i3, int $i4, int $i5, double d, int i4) {
        int $i9 = (-i2) / 2;
        int $i10 = (-i3) / 2;
        try {
            int $i7 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            $i7 = ($i7 * i4) >> 8;
            i4 = (i4 * ((int) $d0)) >> 8;
            $i4 = ($i4 << 16) + (($i7 * $i10) + (i4 * $i9));
            $i5 = ($i5 << 16) + (($i10 * i4) - ($i9 * $i7));
            i += (this.length * -481290979) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i9 = $i5;
                $i10 = $i4;
                int $i11 = i;
                int $i12 = -i2;
                while ($i12 < 0) {
                    int $i13;
                    int $i8 = longR.size[($i10 >> 16) + (($i9 >> 16) * longR.length)];
                    if ($i8 != 0) {
                        $i13 = $i11 + 1;
                        this.size[$i11] = $i8;
                    } else {
                        $i13 = $i11 + 1;
                    }
                    $i10 += i4;
                    $i9 -= $i7;
                    $i12++;
                    $i11 = $i13;
                }
                $i4 += $i7;
                $i5 += i4;
                i += this.length * -481290979;
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
                    int $i11 = $i10 & -16777216;
                    $i10 &= 255;
                    i10 = i2 + 1;
                    iArr[i2] = ((($i10 * i4) & 65280) + (((i * $i10) >> 8) & 16711935)) + $i11;
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
                        i11 = $i11 & -16777216;
                        $i11 &= 255;
                        i10 = i2 + 1;
                        iArr[i2] = ((($i11 * i4) & 65280) + (((i * $i11) >> 8) & 16711935)) + i11;
                    } else {
                        i10 = i2 + 1;
                        iArr[i2] = $i11;
                    }
                    i7++;
                    i2 = i10;
                    i10 = i3;
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "gs.bt(" + ')');
                }
            }
            i3 = i2 + i8;
            i2 = i10 + i9;
        }
    }

    public final void readInt(int $i5, int $i6, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i > 0 && i2 > 0) {
            int $i11 = 0;
            int $i9 = (i4 == i3 && i6 == i5) ? -1 : 582076520 / i2;
            int $i10 = 1665815171 - i5;
            if ($i5 < 456938202 * this.buffer) {
                i -= (this.buffer * 1829547545) - $i5;
                $i5 = 1829547545 * this.buffer;
            }
            if ($i6 < this.count * 2113655857) {
                $i11 = 0 + (((-1900304671 * this.count) - $i6) * $i9);
                i2 -= (-1177414610 * this.count) - $i6;
                $i6 = 211553984 * this.count;
            }
            if (i + $i5 > this.index * 2074797577) {
                i = (2074797577 * this.index) - $i5;
            }
            if (i2 + $i6 > this.data * 1820616055) {
                i2 = (-467581477 * this.data) - $i6;
            }
            int $i13 = (-526900072 & i3) >> 8;
            int $i4 = (584546053 * this.length) - i;
            int $i16 = $i5 + ((-481290979 * this.length) * $i6);
            $i6 = $i11;
            int $i15 = i3 & 255;
            int $i14 = i3 >> 16;
            $i11 = i5;
            for ($i5 = 0; $i5 < i2; $i5++) {
                int $i17 = -i;
                int $i12 = $i16;
                while ($i17 < 0) {
                    int $i20;
                    $i16 = this.size[$i12];
                    int $i18 = $i16 >> 16;
                    int $i19 = (65280 & $i16) >> 8;
                    $i16 &= 255;
                    if ($i10 == 0) {
                        $i18 = $i18 < 127 ? ($i14 * $i18) >> 7 : 255 - (((1329960784 - $i14) * (255 - $i18)) >> 7);
                        $i19 = $i19 < 127 ? ($i13 * $i19) >> 7 : -1181946833 - (((255 - $i19) * (255 - $i13)) >> 7);
                        $i20 = $i16 < 127 ? ($i15 * $i16) >> 7 : 255 - (((255 - $i15) * (959947244 - $i16)) >> 7);
                    } else {
                        $i18 = $i18 < 127 ? (((($i18 * $i14) * $i11) >> 7) + ($i18 * $i10)) >> 8 : (($i10 * $i18) + ((1777571498 - (((-1640490959 - $i18) * (255 - $i14)) >> 7)) * $i11)) >> 8;
                        $i19 = $i19 < 127 ? (($i10 * $i19) + ((($i19 * $i13) * $i11) >> 7)) >> 8 : (($i19 * $i10) + ((255 - (((-1669464399 - $i19) * (1420499923 - $i13)) >> 7)) * $i11)) >> 8;
                        $i20 = $i16 < 1398282284 ? (($i10 * $i16) + ((($i16 * $i15) * $i11) >> 7)) >> 8 : (($i10 * $i16) + ((1413965084 - (((626945756 - $i16) * (-1697539005 - $i15)) >> 7)) * $i11)) >> 8;
                    }
                    this.size[$i12] = (($i18 << 16) + ($i19 << 8)) + $i20;
                    $i17++;
                    $i12++;
                }
                if ($i9 > 0) {
                    $i6 += $i9;
                    $i17 = (PingManager.STATE_SENSOR_ON_FLAG - $i6) >> 8;
                    $i16 = $i6 >> 8;
                    if (i6 != i5) {
                        $i11 = (((PingManager.STATE_SENSOR_ON_FLAG - $i6) * i5) + (i6 * $i6)) >> 16;
                        $i10 = 1249978156 - $i11;
                    }
                    if (i3 != i4) {
                        $i15 = (((((65280 & i3) * $i17) + ((1289054268 & i4) * $i16)) & 440019256) + ((((16711935 & i4) * $i16) + ((16711935 & i3) * $i17)) & -16711936)) >>> 8;
                        $i14 = $i15 >> 16;
                        $i13 = (65280 & $i15) >> 8;
                        $i15 &= 1188209078;
                    }
                }
                $i16 = $i12 + $i4;
            }
        }
    }

    void remove() {
        get(1707907754);
    }

    public final void remove(int $i2, int i, int $i3, int i2) {
        if (i >= this.count * 860394785 && i < this.data * -467581477) {
            if ($i2 < this.buffer * 1829547545) {
                $i3 -= (this.buffer * 245395287) - $i2;
                $i2 = 1829547545 * this.buffer;
            }
            if ($i3 + $i2 > this.index * 1220239956) {
                $i3 = (2074797577 * this.index) - $i2;
            }
            i = $i2 + ((this.length * -481290979) * i);
            for (int $i4 = 0; $i4 < $i3; $i4++) {
                this.size[i + $i4] = i2;
            }
        }
    }

    public final void remove(int $i1, int $i2, int $i3, int $i4, int i) {
        if ($i1 < 2093178019 * this.buffer) {
            $i3 -= (this.buffer * 1829547545) - $i1;
            $i1 = this.buffer * 1829547545;
        }
        if ($i2 < this.count * -12571459) {
            $i4 -= (this.count * -12571459) - $i2;
            $i2 = this.count * -12571459;
        }
        if ($i3 + $i1 > this.index * -136170753) {
            $i3 = (1554065344 * this.index) - $i1;
        }
        if ($i4 + $i2 > this.data * -467581477) {
            $i4 = (this.data * -467581477) - $i2;
        }
        int $i5 = (-1310122807 * this.length) - $i3;
        $i1 += (1699229626 * this.length) * $i2;
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

    public void remove(Double doubleR, int i, int i2) {
        int $i8;
        int $i2 = doubleR;
        doubleR = $i2;
        int $i3 = i + $i2.count;
        int $i4 = i2 + doubleR.index;
        $i2 = this.length * -2030900990;
        i = $i2;
        i2 = $i3 + ($i2 * $i4);
        int $i5 = 0;
        i = doubleR.data;
        int $i6 = doubleR.length;
        int $i22 = (this.length * -1664023170) - $i6;
        if ($i4 < -12571459 * this.count) {
            int $i7 = (this.count * 928514493) - $i4;
            i -= $i7;
            $i4 = -1479424516 * this.count;
            $i5 = 0 + ($i7 * $i6);
            i2 += $i7 * (this.length * -481290979);
        }
        if ($i4 + i > 1916248004 * this.data) {
            i -= ($i4 + i) - (this.data * -2058753846);
        }
        if ($i3 < 2023642640 * this.buffer) {
            $i4 = (-2093083952 * this.buffer) - $i3;
            $i6 -= $i4;
            $i8 = 867323043 * this.buffer;
            $i3 = 0 + $i4;
            $i22 += $i4;
            $i4 = $i5 + $i4;
            $i7 = i2 + $i4;
        } else {
            $i8 = $i3;
            $i4 = $i5;
            $i3 = 0;
            $i7 = i2;
        }
        if ($i6 + $i8 > 1636610914 * this.index) {
            $i2 = ($i8 + $i6) - (2074797577 * this.index);
            $i6 -= $i2;
            $i2 = $i2;
            $i22 += $i2;
            i2 = $i3 + $i2;
        } else {
            i2 = $i3;
        }
        if ($i6 > 0 && i > 0) {
            int[] $r3 = this.size;
            byte[] $r4 = doubleR.buffer;
            int[] $r2 = doubleR.size;
            $i3 = -($i6 >> 2);
            $i5 = -($i6 & 3);
            i = -i;
            $i8 = $i4;
            while (i < 0) {
                byte $b9;
                $i6 = $i3;
                while ($i6 < 0) {
                    int $i10 = $i8 + 1;
                    $b9 = $r4[$i8];
                    if ($b9 != (byte) 0) {
                        $i4 = $i7 + 1;
                        $r3[$i7] = $r2[$b9 & (short) 255];
                    } else {
                        $i4 = $i7 + 1;
                    }
                    $i7 = $i10 + 1;
                    $b9 = $r4[$i10];
                    if ($b9 != (byte) 0) {
                        $r3[$i4] = $r2[$b9 & 1962139124];
                        $i8 = $i4 + 1;
                    } else {
                        $i8 = $i4 + 1;
                    }
                    $i4 = $i7 + 1;
                    $b9 = $r4[$i7];
                    if ($b9 != (byte) 0) {
                        $r3[$i8] = $r2[$b9 & 1120584626];
                        $i7 = $i8 + 1;
                    } else {
                        $i7 = $i8 + 1;
                    }
                    $i8 = $i4 + 1;
                    $b9 = $r4[$i4];
                    if ($b9 != (byte) 0) {
                        $r3[$i7] = $r2[$b9 & (short) 255];
                        $i4 = $i7 + 1;
                    } else {
                        $i4 = $i7 + 1;
                    }
                    $i6++;
                    $i7 = $i4;
                }
                $i4 = $i7;
                $i6 = $i5;
                while ($i6 < 0) {
                    $i7 = $i8 + 1;
                    $b9 = $r4[$i8];
                    if ($b9 != (byte) 0) {
                        $i8 = $i4 + 1;
                        $r3[$i4] = $r2[$b9 & -896193802];
                    } else {
                        $i8 = $i4 + 1;
                    }
                    $i6++;
                    $i4 = $i8;
                    $i8 = $i7;
                }
                $i7 = $i4 + $i22;
                i++;
                $i8 += i2;
            }
        }
    }

    public void remove(Long longR, int i, int i2, int i3) {
        i += longR.next;
        int $i4 = i2 + longR.value;
        int $i1 = (-481290979 * this.length) * $i4;
        i2 = $i1;
        i2 = $i1 + i;
        int $i5 = 0;
        int $i6 = longR.data;
        int i4 = longR.length;
        int $i3 = (-481290979 * this.length) - i4;
        $i1 = this.count * -12571459;
        int i5 = $i1;
        if ($i4 < $i1) {
            i5 = (this.count * -12571459) - $i4;
            $i6 -= i5;
            $i4 = -12571459 * this.count;
            $i5 = 0 + (i5 * i4);
            i2 += i5 * (-481290979 * this.length);
        }
        if ($i4 + $i6 > this.data * -467581477) {
            $i1 = this.data * -467581477;
            i5 = $i1;
            $i6 -= ($i4 + $i6) - $i1;
        }
        if (i < 1829547545 * this.buffer) {
            i5 = (1829547545 * this.buffer) - i;
            i = i4 - i5;
            $i5 += i5;
            $i4 = 0 + i5;
            $i3 += i5;
            i2 += i5;
            i5 = 1829547545 * this.buffer;
            i4 = i;
        } else {
            $i4 = 0;
            i5 = i;
        }
        if (i5 + i4 > 2074797577 * this.index) {
            i = (i5 + i4) - (this.index * 2074797577);
            i4 -= i;
            $i4 += i;
            i += $i3;
        } else {
            i = $i3;
        }
        if (i4 > 0 && $i6 > 0) {
            ArrayList.read(this.size, longR.size, 0, $i5, i2, i4, $i6, i, $i4, i3, 2088299476);
        }
    }

    public void remove(Long longR, int i, int i2, int i3, int i4) {
        if (103368085 == i3) {
            get(longR, i, i2, 2106205673);
            return;
        }
        i += longR.next;
        int $i5 = i2 + longR.value;
        int $i1 = this.length * 455880500;
        i2 = $i1;
        $i1 *= $i5;
        i2 = $i1;
        i2 = $i1 + i;
        int $i6 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        int $i4 = (-481290979 * this.length) - i6;
        $i1 = this.count * 2123995775;
        int i7 = $i1;
        if ($i5 < $i1) {
            i7 = (this.count * -12571459) - $i5;
            i5 -= i7;
            $i5 = this.count * 1173923806;
            $i6 = 0 + (i7 * i6);
            i2 += i7 * (this.length * -481290979);
        }
        if ($i5 + i5 > this.data * -121472496) {
            $i1 = this.data * -467581477;
            i7 = $i1;
            i5 -= ($i5 + i5) - $i1;
        }
        if (i < 1829547545 * this.buffer) {
            i7 = (this.buffer * 861507181) - i;
            i = i6 - i7;
            $i6 += i7;
            $i5 = 0 + i7;
            $i4 += i7;
            i2 += i7;
            i7 = this.buffer * -977413414;
            i6 = i;
        } else {
            $i5 = 0;
            i7 = i;
        }
        if (i7 + i6 > this.index * 391614464) {
            i = (i7 + i6) - (this.index * -2006087787);
            i6 -= i;
            $i5 += i;
            i += $i4;
        } else {
            i = $i4;
        }
        if (i6 > 0 && i5 > 0) {
            ObjectMap.read(this.size, longR.size, 0, $i6, i2, i6, i5, i, $i5, i3, i4, -698997565);
        }
    }

    void removeAll() {
        get(-630480889);
    }

    void reverse(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        i = i10 & -2821838;
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
                } else if ((65535 & $i10) == ((-125354118 & $i10) >> 8)) {
                    int $i11 = $i10 & 1583452492;
                    $i10 &= 805251642;
                    i10 = i2 + 1;
                    iArr[i2] = ((($i10 * i4) & 665312784) + (((i * $i10) >> 8) & 16711935)) + $i11;
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

    final void search(int $i0, int $i4, int $i5, int i, int i2) {
        if ($i0 >= 1829547545 * this.buffer && $i0 < this.index * 2074797577) {
            if ($i4 < this.count * -12571459) {
                $i5 -= (this.count * -12571459) - $i4;
                $i4 = this.count * -12571459;
            }
            if ($i5 + $i4 > this.data * -467581477) {
                $i5 = (this.data * -467581477) - $i4;
            }
            int $i6 = 256 - i2;
            int $i7 = i2 * ((i >> 16) & 255);
            int $i3 = i2 * ((i >> 8) & 255);
            i = i2 * (i & 255);
            $i0 += (this.length * -481290979) * $i4;
            for ($i4 = 0; $i4 < $i5; $i4++) {
                this.size[$i0] = (((((((this.size[$i0] >> 16) & 255) * $i6) + $i7) >> 8) << 16) + ((((((this.size[$i0] >> 8) & 255) * $i6) + $i3) >> 8) << 8)) + ((i + ((this.size[$i0] & 255) * $i6)) >> 8);
                $i0 += this.length * -481290979;
            }
        }
    }

    void set() {
        get(-627183963);
    }

    public final void set(int $i0, int $i2, int $i3, int i) {
        if ($i0 >= 1829547545 * this.buffer && $i0 < 2074797577 * this.index) {
            if ($i2 < this.count * -12571459) {
                $i3 -= (this.count * -12571459) - $i2;
                $i2 = -12571459 * this.count;
            }
            if ($i2 + $i3 > this.data * -467581477) {
                $i3 = (this.data * -467581477) - $i2;
            }
            $i0 = ((this.length * -481290979) * $i2) + $i0;
            for ($i2 = 0; $i2 < $i3; $i2++) {
                this.size[((this.length * -481290979) * $i2) + $i0] = i;
            }
        }
    }

    final void set(int $i0, int $i5, int $i6, int i, int i2) {
        if ($i0 >= 1829547545 * this.buffer && $i0 < this.index * 2074797577) {
            if ($i5 < this.count * 1690912137) {
                $i6 -= (this.count * -12571459) - $i5;
                $i5 = this.count * -12571459;
            }
            if ($i6 + $i5 > 1447437298 * this.data) {
                $i6 = (-1587033781 * this.data) - $i5;
            }
            int $i7 = 256 - i2;
            int $i3 = i2 * ((i >> 16) & 255);
            int $i4 = i2 * ((i >> 8) & 255);
            i = i2 * (193272399 & i);
            $i0 += (-481290979 * this.length) * $i5;
            for ($i5 = 0; $i5 < $i6; $i5++) {
                this.size[$i0] = (((((((this.size[$i0] >> 16) & 255) * $i7) + $i3) >> 8) << 16) + ((((((this.size[$i0] >> 8) & 255) * $i7) + $i4) >> 8) << 8)) + ((i + ((this.size[$i0] & 255) * $i7)) >> 8);
                $i0 += 2089793302 * this.length;
            }
        }
    }

    public final void set(int $i4, int $i5, int $i6, int $i7, int i, int i2) {
        if ($i6 > 0 && $i7 > 0) {
            int $i8 = 0;
            int $i2 = PingManager.STATE_SENSOR_ON_FLAG / $i7;
            if ($i4 < this.buffer * -1637132966) {
                $i6 -= (this.buffer * -1933698252) - $i4;
                $i4 = this.buffer * 1829547545;
            }
            if ($i5 < -12571459 * this.count) {
                $i8 = 0 + (((-809505798 * this.count) - $i5) * $i2);
                $i7 -= (2008861798 * this.count) - $i5;
                $i5 = this.count * 1077719537;
            }
            if ($i6 + $i4 > 786617926 * this.index) {
                $i6 = (this.index * -759949286) - $i4;
            }
            if ($i7 + $i5 > this.data * 1398623589) {
                $i7 = (1077653579 * this.data) - $i5;
            }
            int $i3 = (this.length * 233317332) - $i6;
            $i5 = ((this.length * 788086302) * $i5) + $i4;
            $i4 = -$i7;
            $i7 = $i8;
            while ($i4 < 0) {
                $i8 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                int $i9 = $i7 >> 8;
                $i8 = (((($i8 * (16711935 & i)) + ($i9 * (16711935 & i2))) & 1500656741) + ((((-1965958478 & i) * $i8) + ((-828466357 & i2) * $i9)) & 16711680)) >>> 8;
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

    public final void set(int $i6, int $i7, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i > 0 && i2 > 0) {
            int $i20 = 0;
            int $i4 = 796361019 / i2;
            int $i13 = 256 - i5;
            if ($i6 < 1829547545 * this.buffer) {
                i -= (this.buffer * 1829547545) - $i6;
                $i6 = 2063042980 * this.buffer;
            }
            if ($i7 < -12571459 * this.count) {
                $i20 = 0 + (((this.count * -12571459) - $i7) * $i4);
                i2 -= (-12571459 * this.count) - $i7;
                $i7 = this.count * -12571459;
            }
            if (i + $i6 > this.index * 2074797577) {
                int $i8 = this.index * -75215683;
                i = $i8;
                i = $i8 - $i6;
            }
            if (i2 + $i7 > -112557802 * this.data) {
                i2 = (-1029851324 * this.data) - $i7;
            }
            int $i12 = i3 & -621903420;
            int $i17 = i3 & -934596820;
            int $i14 = i3 & 545479624;
            int $i18 = ($i12 * i5) >> 8;
            int $i19 = (i5 * $i14) >> 8;
            int $i5 = (550850437 * this.length) - i;
            int $i11 = ((1310975384 * this.length) * $i7) + $i6;
            int $i16 = ($i17 * i5) >> 8;
            int $i15 = $i14;
            $i14 = $i12;
            $i12 = i5;
            $i7 = $i20;
            for ($i6 = 0; $i6 < i2; $i6++) {
                int $i10 = -i;
                $i20 = $i11;
                while ($i10 < 0) {
                    $i11 = this.size[$i20];
                    int $i21 = 40343 & $i11;
                    if ($i21 > $i14) {
                        $i21 = $i13 == 0 ? $i14 : ((($i21 * $i13) >> 8) + $i18) & 1818099884;
                    }
                    int $i22 = 65280 & $i11;
                    if ($i22 > $i17) {
                        $i22 = $i13 == 0 ? $i17 : ((($i22 * $i13) >> 8) + $i16) & 355389168;
                    }
                    int $i23 = $i11 & 13330359;
                    if ($i23 > $i15) {
                        $i23 = $i13 == 0 ? $i15 : (($i23 * $i13) >> 8) + $i19;
                    }
                    this.size[$i20] = ($i22 + $i21) + $i23;
                    $i10++;
                    $i20++;
                }
                if ($i4 > 0) {
                    $i7 += $i4;
                    $i10 = (810842030 - $i7) >> 8;
                    $i11 = $i7 >> 8;
                    if (i6 != i5) {
                        $i12 = (((PingManager.STATE_SENSOR_ON_FLAG - $i7) * i5) + ($i7 * i6)) >> 16;
                        $i13 = 1058925257 - $i12;
                    }
                    if (i3 != i4) {
                        $i15 = (((((-712926433 & i4) * $i11) + ((-2059822976 & i3) * $i10)) & -504527483) + ((((65280 & i4) * $i11) + ((65280 & i3) * $i10)) & -246844307)) >>> 8;
                        $i14 = $i15 & 16711680;
                        $i17 = $i15 & -199048965;
                        $i15 &= 255;
                        $i18 = ($i12 * $i14) >> 8;
                        $i16 = ($i12 * $i17) >> 8;
                        $i19 = ($i15 * $i12) >> 8;
                    }
                }
                $i11 = $i20 + $i5;
            }
        }
    }

    public void set(Long longR, int i, int i2, int i3) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        int $i0 = this.length * -481290979;
        i = $i0;
        $i0 *= $i4;
        i = $i0;
        i = $i0 + $i3;
        int i4 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        i2 = (1597828846 * this.length) - i6;
        if ($i4 < -12571459 * this.count) {
            int $i8 = (822513640 * this.count) - $i4;
            i5 -= $i8;
            $i4 = this.count * -12571459;
            i4 = 0 + (i6 * $i8);
            i += $i8 * (this.length * -481290979);
        }
        if ($i4 + i5 > -467581477 * this.data) {
            i5 -= ($i4 + i5) - (1881411186 * this.data);
        }
        if ($i3 < 1829547545 * this.buffer) {
            $i3 = (1829547545 * this.buffer) - $i3;
            i6 -= $i3;
            $i8 = 1829547545 * this.buffer;
            i += $i3;
            $i4 = 0 + $i3;
            i2 += $i3;
            $i3 = i4 + $i3;
        } else {
            $i4 = 0;
            $i8 = $i3;
            $i3 = i4;
        }
        if (i6 + $i8 > this.index * 794072004) {
            i4 = ($i8 + i6) - (this.index * 901557549);
            i6 -= i4;
            $i4 += i4;
            i2 += i4;
        }
        if (i6 > 0 && i5 > 0) {
            read(this.size, longR.size, 0, $i3, i, 0, 0, i6, i5, i2, $i4, i3, -86973297);
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
            $i7 = ((this.length * -457460507) * i) + $i4;
            $i0 = this.length * -481290979;
            $i11 = $i0;
            $i11 = $i0 - i2;
            if (i3 + i > 2098850289 * this.data) {
                i3 -= (i + i3) - (this.data * 66512329);
            }
            if (i < this.count * -12571459) {
                $i0 = this.count * -1546394885;
                $i10 = $i0;
                $i10 = $i0 - i;
                i = i3 - $i10;
                $i0 = this.length * 925092355;
                i3 = $i0;
                $i0 *= $i10;
                i3 = $i0;
                $i7 += $i0;
                i4 += $i10 * i6;
            } else {
                i = i3;
            }
            if (i2 + $i4 > this.index * -1117412164) {
                i3 = (i2 + $i4) - (2074797577 * this.index);
                i2 -= i3;
                $i11 += i3;
            }
            if ($i4 < this.buffer * 1829547545) {
                $i4 = (this.buffer * 1829547545) - $i4;
                i2 -= $i4;
                i3 = $i7 + $i4;
                $i8 += i5 * $i4;
                $i4 += $i11;
            } else {
                $i4 = $i11;
                i3 = $i7;
            }
            Geometry.toString(this.size, longR.size, 0, $i8, i4, i3, $i4, i2, i, i5, i6, $i3, 1976898552);
        }
    }

    public void set(Long longR, int $i5, int i, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i4 = longR.length;
            int $i8 = longR.data;
            int i5 = 0;
            int i6 = 0;
            int $i11 = longR.this$0;
            int $i12 = longR.count;
            int i7 = ($i11 << 16) / i2;
            int i8 = ($i12 << 16) / i3;
            if (longR.next > 0) {
                i5 = (((longR.next << 16) + i7) - 1) / i7;
                $i5 += i5;
                i5 = 0 + ((i5 * i7) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i6 = (((longR.value << 16) + i8) - 1) / i8;
                i += i6;
                i6 = 0 + ((i6 * i8) - (longR.value << 16));
            }
            if ($i4 < $i11) {
                $i0 = ($i4 << 16) - i5;
                i2 = $i0;
                i2 = (($i0 + i7) - 1) / i7;
            }
            if ($i8 < $i12) {
                $i0 = ($i8 << 16) - i6;
                i3 = $i0;
                i3 = (($i0 + i8) - 1) / i8;
            }
            $i8 = ((this.length * -481290979) * i) + $i5;
            $i12 = (-481290979 * this.length) - i2;
            if (i + i3 > this.data * -467581477) {
                i3 -= (i3 + i) - (-467581477 * this.data);
            }
            if (i < this.count * -12571459) {
                $i11 = (-12571459 * this.count) - i;
                i = i3 - $i11;
                $i0 = (-481290979 * this.length) * $i11;
                i3 = $i0;
                $i8 += $i0;
                i6 += $i11 * i8;
            } else {
                i = i3;
            }
            if (i2 + $i5 > this.index * 2074797577) {
                i3 = (i2 + $i5) - (2074797577 * this.index);
                i2 -= i3;
                $i12 += i3;
            }
            if ($i5 < 1829547545 * this.buffer) {
                $i5 = (1829547545 * this.buffer) - $i5;
                i2 -= $i5;
                i3 = $i8 + $i5;
                i5 += $i5 * i7;
                $i5 += $i12;
            } else {
                $i5 = $i12;
                i3 = $i8;
            }
            AssertionError.read(this.size, longR.size, 0, i5, i6, i3, $i5, i2, i, i7, i8, $i4, i4, 1988908352);
        }
    }

    public void set(Long longR, int i, int $i1, int i2, int i3, int $i4, int $i5, double d, int i4) {
        int $i9 = (-i2) / 2;
        int $i10 = (-i3) / 2;
        try {
            int $i7 = (int) (Math.sin(d) * 65536.0d);
            double $d0 = Math.cos(d) * 65536.0d;
            d = $d0;
            $i7 = ($i7 * i4) >> 8;
            i4 = (i4 * ((int) $d0)) >> 8;
            $i4 = ($i4 << 16) + (($i7 * $i10) + (i4 * $i9));
            $i5 = ($i5 << 16) + (($i10 * i4) - ($i9 * $i7));
            i += (this.length * -539857319) * $i1;
            for ($i1 = 0; $i1 < i3; $i1++) {
                $i9 = $i5;
                $i10 = $i4;
                int $i11 = i;
                int $i12 = -i2;
                while ($i12 < 0) {
                    int $i13;
                    int $i8 = longR.size[($i10 >> 16) + (($i9 >> 16) * longR.length)];
                    if ($i8 != 0) {
                        $i13 = $i11 + 1;
                        this.size[$i11] = $i8;
                    } else {
                        $i13 = $i11 + 1;
                    }
                    $i10 += i4;
                    $i9 -= $i7;
                    $i12++;
                    $i11 = $i13;
                }
                $i4 += $i7;
                $i5 += i4;
                i += this.length * 1854321250;
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
            i4 = (((int) (Math.cos(((double) i4) / 326.11d) * 65536.0d)) * i5) >> 8;
            i5 = (($i8 * i4) + ($i9 * i)) + ($i4 << 16);
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
                    this.size[i5] = longR.size[($i8 >> 16) + (($i9 >> 16) * longR.length)];
                    $i8 += i4;
                    $i9 -= i;
                    $i11++;
                    i5++;
                }
                $i0 = (this.length * -481290979) + $i0;
                $i4 += i4;
                i3 += i;
            }
        } catch (Exception e) {
        }
    }

    public void set(Long longR, int i, int $i1, int i2, int i3, int i4, int $i5, int[] iArr, int[] iArr2) {
        int $i6 = $i1 < 0 ? -$i1 : 0;
        $i5 = longR.data + $i1 <= $i5 ? longR.data : $i5 - $i1;
        int $i7 = i < 0 ? -i : 0;
        if (longR.length + i <= i4) {
            i4 = longR.length;
        }
        i2 = ((i + i2) + $i7) + ((($i1 + i3) + $i6) * (this.length * -481290979));
        i3 = $i6;
        i4 = $i1 + $i6;
        while (i3 < $i5) {
            int $i8;
            $i6 = iArr[i4];
            $i1 = i4 + 1;
            int $i9 = iArr2[i4];
            if (i < $i6) {
                i4 = $i6 - i;
                $i8 = (i4 - $i7) + i2;
            } else {
                i4 = $i7;
                $i8 = i2;
            }
            $i6 = longR.length + i <= $i9 + $i6 ? longR.length : ($i6 + $i9) - i;
            while (i4 < $i6) {
                int $i10;
                $i9 = longR.size[(longR.length * i3) + i4];
                if ($i9 != 0) {
                    $i10 = $i8 + 1;
                    this.size[$i8] = $i9;
                } else {
                    $i10 = $i8 + 1;
                }
                i4++;
                $i8 = $i10;
            }
            i2 += -758091127 * this.length;
            i3++;
            i4 = $i1;
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
            $i7 = ((this.length * -481290979) * i) + $i4;
            $i0 = this.length * -481290979;
            $i11 = $i0;
            $i11 = $i0 - i2;
            if (i3 + i > -699864653 * this.data) {
                i3 -= (i + i3) - (this.data * 590211898);
            }
            if (i < this.count * -12571459) {
                $i0 = this.count * 1634445700;
                $i10 = $i0;
                $i10 = $i0 - i;
                i = i3 - $i10;
                $i0 = this.length * 1289843793;
                i3 = $i0;
                $i0 *= $i10;
                i3 = $i0;
                $i7 += $i0;
                i4 += $i10 * i6;
            } else {
                i = i3;
            }
            if (i2 + $i4 > this.index * -1327690862) {
                i3 = (i2 + $i4) - (2074797577 * this.index);
                i2 -= i3;
                $i11 += i3;
            }
            if ($i4 < this.buffer * 1829547545) {
                $i4 = (this.buffer * 1829547545) - $i4;
                i2 -= $i4;
                i3 = $i7 + $i4;
                $i8 += i5 * $i4;
                $i4 += $i11;
            } else {
                $i4 = $i11;
                i3 = $i7;
            }
            Geometry.toString(this.size, longR.size, 0, $i8, i4, i3, $i4, i2, i, i5, i6, $i3, 1976898552);
        }
    }

    public final void skip(int $i1, int $i2, int $i3, int $i4, int i) {
        if ($i1 < this.buffer * 1829547545) {
            $i3 -= (this.buffer * 1829547545) - $i1;
            $i1 = this.buffer * 1829547545;
        }
        if ($i2 < this.count * -12571459) {
            $i4 -= (this.count * -12571459) - $i2;
            $i2 = this.count * -12571459;
        }
        if ($i3 + $i1 > this.index * 2074797577) {
            $i3 = (this.index * 2074797577) - $i1;
        }
        if ($i4 + $i2 > this.data * -467581477) {
            $i4 = (this.data * -467581477) - $i2;
        }
        int $i5 = (this.length * -481290979) - $i3;
        $i1 += (this.length * -481290979) * $i2;
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

    final void toArray(int $i0, int $i4, int $i5, int i, int i2) {
        if ($i0 >= 1829547545 * this.buffer && $i0 < this.index * 2074797577) {
            if ($i4 < this.count * -12571459) {
                $i5 -= (this.count * -12571459) - $i4;
                $i4 = this.count * -12571459;
            }
            if ($i5 + $i4 > this.data * -467581477) {
                $i5 = (this.data * -467581477) - $i4;
            }
            int $i6 = 256 - i2;
            int $i7 = i2 * ((i >> 16) & 255);
            int $i3 = i2 * ((i >> 8) & 255);
            i = i2 * (i & 255);
            $i0 += (this.length * -481290979) * $i4;
            for ($i4 = 0; $i4 < $i5; $i4++) {
                this.size[$i0] = (((((((this.size[$i0] >> 16) & 255) * $i6) + $i7) >> 8) << 16) + ((((((this.size[$i0] >> 8) & 255) * $i6) + $i3) >> 8) << 8)) + ((i + ((this.size[$i0] & 255) * $i6)) >> 8);
                $i0 += this.length * -481290979;
            }
        }
    }

    public void toArray(Long longR, int i, int i2, int i3) {
        int $i3 = i + longR.next;
        int $i4 = i2 + longR.value;
        int $i0 = this.length * -481290979;
        i = $i0;
        $i0 *= $i4;
        i = $i0;
        i = $i0 + $i3;
        int i4 = 0;
        int i5 = longR.data;
        int i6 = longR.length;
        i2 = (-481290979 * this.length) - i6;
        if ($i4 < -12571459 * this.count) {
            int $i8 = (-12571459 * this.count) - $i4;
            i5 -= $i8;
            $i4 = this.count * -12571459;
            i4 = 0 + (i6 * $i8);
            i += $i8 * (this.length * -481290979);
        }
        if ($i4 + i5 > -467581477 * this.data) {
            i5 -= ($i4 + i5) - (-467581477 * this.data);
        }
        if ($i3 < 1829547545 * this.buffer) {
            $i3 = (1829547545 * this.buffer) - $i3;
            i6 -= $i3;
            $i8 = 1829547545 * this.buffer;
            i += $i3;
            $i4 = 0 + $i3;
            i2 += $i3;
            $i3 = i4 + $i3;
        } else {
            $i4 = 0;
            $i8 = $i3;
            $i3 = i4;
        }
        if (i6 + $i8 > this.index * 2074797577) {
            i4 = ($i8 + i6) - (this.index * 2074797577);
            i6 -= i4;
            $i4 += i4;
            i2 += i4;
        }
        if (i6 > 0 && i5 > 0) {
            read(this.size, longR.size, 0, $i3, i, 0, 0, i6, i5, i2, $i4, i3, -1062385659);
        }
    }

    final void toByteArray(int $i6, int $i0, int $i7, int i, int i2) {
        if ($i0 >= this.count * 258715449 && $i0 < this.data * -467581477) {
            if ($i6 < this.buffer * 1190567188) {
                $i7 -= (this.buffer * 1829547545) - $i6;
                $i6 = 1829547545 * this.buffer;
            }
            if ($i7 + $i6 > this.index * 2074797577) {
                $i7 = (1969224285 * this.index) - $i6;
            }
            int $i3 = 256 - i2;
            int $i4 = i2 * ((i >> 16) & 1813284390);
            int $i5 = i2 * ((i >> 8) & 1697621819);
            i = i2 * (i & 255);
            $i6 += (this.length * -481290979) * $i0;
            $i0 = 0;
            while ($i0 < $i7) {
                i2 = (i + ((this.size[$i6] & -1159116765) * $i3)) >> 8;
                this.size[$i6] = i2 + (((((((this.size[$i6] >> 16) & 255) * $i3) + $i4) >> 8) << 16) + ((((((this.size[$i6] >> 8) & -1145285004) * $i3) + $i5) >> 8) << 8));
                $i0++;
                $i6++;
            }
        }
    }

    public final void toByteArray(int $i5, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 > 0 && i3 > 0) {
            int $i16 = 0;
            int $i14 = (i5 == i4 && i7 == i6) ? -1 : -481863107 / i3;
            int $i15 = 256 - i6;
            if ($i5 < 897464337 * this.buffer) {
                i2 -= (-1659637062 * this.buffer) - $i5;
                $i5 = 1829547545 * this.buffer;
            }
            if (i < this.count * -12571459) {
                $i16 = 0 + (((this.count * -1879635764) - i) * $i14);
                i3 -= (this.count * -795342422) - i;
                i = this.count * -12571459;
            }
            if (i2 + $i5 > -1701642690 * this.index) {
                i2 = (-1117649526 * this.index) - $i5;
            }
            if (i3 + i > this.data * -2038235349) {
                i3 = (-467581477 * this.data) - i;
            }
            int $i4 = (-284886408 * this.length) - i2;
            i = $i5 + ((this.length * 1602217352) * i);
            int $i17 = i6;
            i3 = $i16;
            $i16 = i4;
            for ($i5 = -i3; $i5 < 0; $i5++) {
                int $i9;
                int $i13 = -i2;
                while ($i13 < 0) {
                    int $i11 = this.size[i];
                    int $i12 = $i16 + $i11;
                    $i9 = (16711935 & $i11) + (981559295 & $i16);
                    int $i10 = (($i12 - $i9) & 1885792698) + ($i9 & 16777472);
                    if ($i15 == 0) {
                        $i9 = i + 1;
                        this.size[i] = ($i12 - $i10) | ($i10 - ($i10 >>> 8));
                    } else {
                        $i10 = ($i10 - ($i10 >>> 8)) | ($i12 - $i10);
                        $i9 = i + 1;
                        this.size[i] = (((($i11 & 65280) * $i15) >> 8) & 1941570439) + (((((($i10 & 65280) * $i17) >> 8) & 65280) + ((((16711935 & $i10) * $i17) >> 8) & 16711935)) + ((((-479943658 & $i11) * $i15) >> 8) & -980811071));
                    }
                    $i13++;
                    i = $i9;
                }
                if ($i14 > 0) {
                    i3 += $i14;
                    $i9 = (-678093412 - i3) >> 8;
                    $i13 = i3 >> 8;
                    if (i7 != i6) {
                        $i17 = ((i7 * i3) + ((PingManager.STATE_SENSOR_ON_FLAG - i3) * i6)) >> 16;
                        $i15 = 256 - $i17;
                    }
                    if (i4 != i5) {
                        $i16 = (((($i9 * (-1617722201 & i4)) + ($i13 * (-1254014154 & i5))) & -479463770) + ((((65280 & i4) * $i9) + ((-374807327 & i5) * $i13)) & -1870735578)) >>> 8;
                        i += $i4;
                    }
                }
                i += $i4;
            }
        }
    }

    public final void toByteArray(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        if (i + i3 >= 0 && i4 + i2 >= 0 && i < this.length * -481290979 && i2 < -1512168653 * this.pos) {
            int $i10;
            int $i9 = 0;
            if (i < 0) {
                $i10 = 0 - i;
                i3 += i;
            } else {
                $i10 = 0;
            }
            if (i2 < 0) {
                $i9 = 0 - i2;
                i4 += i2;
            }
            if (i3 + i > this.length * -481290979) {
                int $i7 = this.length * 1362959946;
                i3 = $i7;
                i3 = $i7 - i;
            }
            if (i2 + i4 > this.pos * 1005433219) {
                i4 = (1005433219 * this.pos) - i2;
            }
            int $i5 = bArr.length / i7;
            int $i6 = (-481290979 * this.length) - i3;
            int $i11 = i5 >>> 24;
            int $i12 = i6 >>> 24;
            int $i13;
            int $i14;
            if (!z || (1072928816 == $i11 && $i12 == 255)) {
                $i12 = (((this.length * 1851547812) * (i2 + $i9)) + i) + $i10;
                for ($i11 = i2 + $i9; $i11 < (i2 + $i9) + i4; $i11++) {
                    $i13 = i + $i10;
                    while ($i13 < (i + $i10) + i3) {
                        if (bArr[((($i11 - i2) % $i5) * i7) + (($i13 - i) % i7)] != (byte) 0) {
                            $i14 = $i12 + 1;
                            this.size[$i12] = i6;
                        } else {
                            $i14 = $i12 + 1;
                            this.size[$i12] = i5;
                        }
                        $i13++;
                        $i12 = $i14;
                    }
                    $i12 += $i6;
                }
            } else {
                $i12 = $i10 + ((($i9 + i2) * (this.length * -481290979)) + i);
                for ($i11 = $i9 + i2; $i11 < ($i9 + i2) + i4; $i11++) {
                    $i13 = $i10 + i;
                    while ($i13 < (i + $i10) + i3) {
                        int $i15 = bArr[((($i11 - i2) % $i5) * i7) + (($i13 - i) % i7)] != (byte) 0 ? i6 : i5;
                        $i14 = $i15 >>> 24;
                        int $i17 = -493251681 - $i14;
                        int $i18 = this.size[$i12];
                        int i8 = (16711935 & $i15) * $i14;
                        this.size[$i12] = ((((($i15 & 1258970480) * $i14) + ($i17 * ($i18 & 65280))) & -302734611) + ((((-1667891969 & $i18) * $i17) + i8) & 260536907)) >> 8;
                        $i13++;
                        $i12++;
                    }
                    $i12 += $i6;
                }
            }
        }
    }

    final void toString(int $i0, int $i4, int $i5, int i, int i2) {
        if ($i0 >= -1961947912 * this.buffer && $i0 < this.index * 220107095) {
            if ($i4 < this.count * -12571459) {
                $i5 -= (this.count * -12571459) - $i4;
                $i4 = this.count * -12571459;
            }
            if ($i5 + $i4 > this.data * -467581477) {
                $i5 = (this.data * -467581477) - $i4;
            }
            int $i6 = -996005550 - i2;
            int $i7 = i2 * ((i >> 16) & 255);
            int $i3 = i2 * ((i >> 8) & 255);
            i = i2 * (i & 255);
            $i0 += (-1591866680 * this.length) * $i4;
            for ($i4 = 0; $i4 < $i5; $i4++) {
                this.size[$i0] = (((((((this.size[$i0] >> 16) & 255) * $i6) + $i7) >> 8) << 16) + ((((((this.size[$i0] >> 8) & 1124104919) * $i6) + $i3) >> 8) << 8)) + ((i + ((this.size[$i0] & 439843040) * $i6)) >> 8);
                $i0 += 891354480 * this.length;
            }
        }
    }

    final void toString(int $i7, int $i0, int i, int i2, int i3, int i4) {
        try {
            int $i4 = this.count * -12571459;
            i4 = $i4;
            if ($i0 >= $i4) {
                $i4 = this.data * -467581477;
                i4 = $i4;
                if ($i0 < $i4) {
                    $i4 = this.buffer * 1829547545;
                    i4 = $i4;
                    if ($i7 < $i4) {
                        i -= (1829547545 * this.buffer) - $i7;
                        $i7 = 1829547545 * this.buffer;
                    }
                    if (i + $i7 > this.index * 2074797577) {
                        i = (2074797577 * this.index) - $i7;
                    }
                    i4 = 256 - i3;
                    int $i5 = i3 * ((i2 >> 16) & 255);
                    int $i6 = i3 * ((i2 >> 8) & 255);
                    i2 = i3 * (i2 & 255);
                    $i7 += (this.length * -481290979) * $i0;
                    $i0 = 0;
                    while ($i0 < i) {
                        $i4 = this.size[$i7] & 255;
                        this.size[$i7] = ((i2 + ($i4 * i4)) >> 8) + (((((((this.size[$i7] >> 16) & 255) * i4) + $i5) >> 8) << 16) + ((((((this.size[$i7] >> 8) & 255) * i4) + $i6) >> 8) << 8));
                        $i0++;
                        $i7++;
                    }
                }
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gs.am(" + ')');
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
        if (i2 + $i6 > -467581477 * this.data) {
            i2 -= ($i6 + i2) - (this.data * -467581477);
        }
        if ($i6 < this.count * -12571459) {
            $i6 = (-12571459 * this.count) - $i6;
            i2 -= $i6;
            $i11 += (-481290979 * this.length) * $i6;
            $i0 = $i6 * $i3;
            $i6 = $i0;
            $i9 += $i0;
        }
        if ($i5 + i > this.index * 2074797577) {
            $i6 = ($i5 + i) - (2074797577 * this.index);
            i -= $i6;
            $i7 += $i6;
        }
        if ($i5 < this.buffer * 1829547545) {
            $i5 = (this.buffer * 1829547545) - $i5;
            i -= $i5;
            $i11 += $i5;
            $i8 += $i2 * $i5;
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
            $i0 *= $i7;
            i = $i0;
            i = $i0 + $i6;
            $i8 = (-481290979 * this.length) - $i5;
            if (i2 + $i7 > -467581477 * this.data) {
                i2 -= ($i7 + i2) - (this.data * -467581477);
            }
            if ($i7 < this.count * -12571459) {
                $i7 = (-12571459 * this.count) - $i7;
                i2 -= $i7;
                i += (-481290979 * this.length) * $i7;
                $i0 = $i7 * $i4;
                $i7 = $i0;
                $i10 += $i0;
            }
            if ($i6 + $i5 > this.index * 2074797577) {
                $i0 = ($i6 + $i5) - (2074797577 * this.index);
                $i5 -= $i0;
                $i8 += $i0;
            }
            if ($i6 < this.buffer * 1829547545) {
                $i6 = (this.buffer * 1829547545) - $i6;
                $i7 = $i5 - $i6;
                i += $i6;
                $i9 += $i3 * $i6;
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
            throw StringBuilder.append($r5, "gs.av(" + ')');
        }
    }

    public void toString(Long longR, int i, int i2, int i3, int i4) {
        if (i3 > longR.this$0 || i4 > longR.count) {
            throw new IllegalArgumentException();
        }
        int $i13 = longR.next * i3;
        int $i25 = longR.this$0;
        $i13 = ($i13 / $i25) + i;
        $i25 = longR.length + longR.next;
        int i5 = $i25;
        $i25 = ((($i25 * i3) + longR.this$0) - 1) / longR.this$0;
        i5 = $i25;
        i5 = $i25 + i;
        $i25 = longR.value;
        int $i28 = (($i25 * i4) / longR.count) + i2;
        $i25 = longR.value + longR.data;
        int i6 = $i25;
        $i25 = ((longR.count + ($i25 * i4)) - 1) / longR.count;
        int i7 = $i25;
        i7 = $i25 + i2;
        $i25 = this.buffer * 1829547545;
        i6 = $i25;
        if ($i13 < $i25) {
            $i13 = 1829547545 * this.buffer;
        }
        if (i5 > this.index * 2074797577) {
            i5 = 2074797577 * this.index;
        }
        if ($i28 < this.count * -12571459) {
            $i28 = this.count * -12571459;
        }
        if (i7 > -467581477 * this.data) {
            i7 = -467581477 * this.data;
        }
        if ($i13 < i5 && $i28 < i7) {
            i6 = $i13 + ((-481290979 * this.length) * $i28);
            int i8 = (this.length * -481290979) - (i5 - $i13);
            $i25 = this.size;
            int[] $r3 = $i25;
            if (i6 < $i25.length) {
                while ($i28 < i7) {
                    for (int $i29 = $i13; $i29 < i5; $i29++) {
                        int $i9 = ($i29 - i) << 4;
                        int $i8 = ($i28 - i2) << 4;
                        int $i14 = ((longR.this$0 * $i9) / i3) - (longR.next << 4);
                        $i9 = ((($i9 + 16) * longR.this$0) / i3) - (longR.next << 4);
                        int $i15 = ((longR.count * $i8) / i4) - (longR.value << 4);
                        $i25 = ($i8 + 16) * longR.count;
                        $i8 = $i25;
                        int $i10 = ($i25 / i4) - (longR.value << 4);
                        $i8 = (($i10 - $i15) * ($i9 - $i14)) >> 1;
                        if ($i8 != 0) {
                            if ($i14 < 0) {
                                $i14 = 0;
                            }
                            if ($i9 >= (longR.length << 4)) {
                                $i9 = longR.length << 4;
                            }
                            if ($i15 < 0) {
                                $i15 = 0;
                            }
                            if ($i10 >= (longR.data << 4)) {
                                $i10 = longR.data << 4;
                            }
                            int $i11 = $i9 - 1;
                            int $i16 = $i10 - 1;
                            $i9 = 16 - ($i14 & 15);
                            $i10 = ($i11 & 15) + 1;
                            int $i5 = 16 - ($i15 & 15);
                            int $i17 = ($i16 & 15) + 1;
                            int $i4 = $i14 >> 4;
                            $i11 >>= 4;
                            int $i6 = $i15 >> 4;
                            int $i12 = $i16 >> 4;
                            $i16 = 0;
                            int i9 = 0;
                            $i14 = 0;
                            $i15 = 0;
                            for (int $i19 = $i6; $i19 <= $i12; $i19++) {
                                int $i20 = 16;
                                if ($i6 == $i19) {
                                    $i20 = $i5;
                                }
                                if ($i12 == $i19) {
                                    $i20 = $i17;
                                }
                                int $i21 = $i4;
                                while ($i21 <= $i11) {
                                    $r3 = longR.size;
                                    $i25 = longR.length;
                                    $i25 *= $i19;
                                    int i10 = $i25;
                                    int $i23 = $r3[$i25 + $i21];
                                    if ($i23 != 0) {
                                        i10 = $i21 == $i4 ? $i20 * $i9 : $i21 == $i11 ? $i20 * $i10 : $i20 << 4;
                                        $i15 += i10;
                                        $i25 = ($i23 >> 16) & 255;
                                        $i25 *= i10;
                                        int i11 = $i25;
                                        $i16 += $i25;
                                        $i25 = ($i23 >> 8) & 255;
                                        i9 += $i25 * i10;
                                        $i25 = i10 * ($i23 & 255);
                                        i10 = $i25;
                                        $i14 += $i25;
                                    }
                                    $i21++;
                                }
                            }
                            if ($i15 >= $i8) {
                                $i8 = (((i9 / $i15) << 8) + (($i16 / $i15) << 16)) + ($i14 / $i15);
                                if ($i8 == 0) {
                                    $i8 = 1;
                                }
                                this.size[i6] = $i8;
                            }
                            i6++;
                        }
                    }
                    i6 += i8;
                    $i28++;
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
                    int $i16 = (((((longR.length + longR.next) * i3) + longR.this$0) - 1) / longR.this$0) + i;
                    int $i18 = ((longR.value * i4) / longR.count) + i2;
                    int $i17 = (((longR.count + ((longR.value + longR.data) * i4)) - 1) / longR.count) + i2;
                    if (i5 < this.buffer * 1829547545) {
                        i5 = 1829547545 * this.buffer;
                    }
                    if ($i16 > this.index * 2074797577) {
                        $i16 = 2074797577 * this.index;
                    }
                    if ($i18 < this.count * -12571459) {
                        $i18 = this.count * -12571459;
                    }
                    if ($i17 > -467581477 * this.data) {
                        $i17 = -467581477 * this.data;
                    }
                    if (i5 < $i16 && $i18 < $i17) {
                        int $i14 = i5 + ((-481290979 * this.length) * $i18);
                        int $i8 = (this.length * -481290979) - ($i16 - i5);
                        if ($i14 < this.size.length) {
                            while ($i18 < $i17) {
                                for (int $i15 = i5; $i15 < $i16; $i15++) {
                                    int $i11 = ($i15 - i) << 4;
                                    int $i9 = ($i18 - i2) << 4;
                                    $i4 = longR.this$0;
                                    $i4 *= $i11;
                                    int i6 = $i4;
                                    i6 = ($i4 / i3) - (longR.next << 4);
                                    $i4 = ($i11 + 16) * longR.this$0;
                                    $i11 = $i4;
                                    $i11 = ($i4 / i3) - (longR.next << 4);
                                    $i4 = longR.count;
                                    $i4 *= $i9;
                                    int i7 = $i4;
                                    i7 = ($i4 / i4) - (longR.value << 4);
                                    int $i29 = ((longR.count * ($i9 + 16)) / i4) - (longR.value << 4);
                                    $i9 = (($i29 - i7) * ($i11 - i6)) >> 1;
                                    if ($i9 != 0) {
                                        int $i5 = i6 < 0 ? 0 : i6;
                                        i6 = $i11 >= (longR.length << 4) ? longR.length << 4 : $i11;
                                        int $i7 = i7 < 0 ? 0 : i7;
                                        if ($i29 >= (longR.data << 4)) {
                                            $i29 = longR.data << 4;
                                        }
                                        int $i12 = i6 - 1;
                                        int $i13 = $i29 - 1;
                                        i6 = 16 - ($i5 & 15);
                                        $i11 = ($i12 & 15) + 1;
                                        i7 = 16 - ($i7 & 15);
                                        $i29 = ($i13 & 15) + 1;
                                        $i5 >>= 4;
                                        $i12 >>= 4;
                                        $i7 >>= 4;
                                        $i13 >>= 4;
                                        int $i26 = 0;
                                        int $i27 = 0;
                                        int $i28 = 0;
                                        int i8 = 0;
                                        for (int $i19 = $i7; $i19 <= $i13; $i19++) {
                                            int $i20 = 16;
                                            if ($i7 == $i19) {
                                                $i20 = i7;
                                            }
                                            if ($i13 == $i19) {
                                                $i20 = $i29;
                                            }
                                            int $i21 = $i5;
                                            while ($i21 <= $i12) {
                                                int[] $r7 = longR.size;
                                                $i4 = longR.length;
                                                $i4 *= $i19;
                                                int i9 = $i4;
                                                int $i23 = $r7[$i4 + $i21];
                                                if ($i23 != 0) {
                                                    i9 = $i21 == $i5 ? $i20 * i6 : $i21 == $i12 ? $i20 * $i11 : $i20 << 4;
                                                    i8 += i9;
                                                    $i4 = ($i23 >> 16) & 255;
                                                    $i26 += $i4 * i9;
                                                    $i4 = ($i23 >> 8) & 255;
                                                    int i10 = $i4 * i9;
                                                    $i4 = i9 * ($i23 & 255);
                                                    i9 = $i4;
                                                    i9 = $i4 + $i28;
                                                    $i28 = $i27 + i10;
                                                    $i27 = $i26;
                                                } else {
                                                    i9 = $i28;
                                                    $i28 = $i27;
                                                    $i27 = $i26;
                                                }
                                                $i21++;
                                                $i26 = $i27;
                                                $i27 = $i28;
                                                $i28 = i9;
                                            }
                                        }
                                        if (i8 >= $i9) {
                                            $i9 = ((($i27 / i8) << 8) + (($i26 / i8) << 16)) + ($i28 / i8);
                                            if ($i9 == 0) {
                                                $i9 = 1;
                                            }
                                            this.size[$i14] = $i9;
                                        }
                                        $i14++;
                                    }
                                }
                                $i14 += $i8;
                                $i18++;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gs.be(" + ')');
        }
    }

    public final void write(int $i3, int $i4, int $i5, int $i6, int i, int $i1) {
        if ($i3 < this.buffer * 1829547545) {
            $i5 -= (1829547545 * this.buffer) - $i3;
            $i3 = 1829547545 * this.buffer;
        }
        if ($i4 < this.count * -12571459) {
            $i6 -= (-12571459 * this.count) - $i4;
            $i4 = -12571459 * this.count;
        }
        if ($i3 + $i5 > 2074797577 * this.index) {
            $i5 = (2074797577 * this.index) - $i3;
        }
        if ($i6 + $i4 > this.data * -467581477) {
            $i6 = (-467581477 * this.data) - $i4;
        }
        i = ((((16711935 & i) * $i1) >> 8) & 16711935) + ((((65280 & i) * $i1) >> 8) & 65280);
        $i1 = 256 - $i1;
        int $i2 = (this.length * -481290979) - $i5;
        $i3 += (-481290979 * this.length) * $i4;
        for ($i4 = 0; $i4 < $i6; $i4++) {
            int $i7 = -$i5;
            while ($i7 < 0) {
                int $i8 = this.size[$i3];
                this.size[$i3] = (((((65280 & $i8) * $i1) >> 8) & 65280) + (((($i8 & 16711935) * $i1) >> 8) & 16711935)) + i;
                $i7++;
                $i3++;
            }
            $i3 += $i2;
        }
    }

    public final void write(int i, int $i7, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 > 0 && i2 > 0) {
            int $i8;
            int $i10 = 0;
            int $i4 = PingManager.STATE_SENSOR_ON_FLAG / i3;
            int $i11 = 256 - i6;
            if (i < 1829547545 * this.buffer) {
                i2 -= (this.buffer * 1829547545) - i;
                i = this.buffer * 1829547545;
            }
            if ($i7 < this.count * -12571459) {
                $i10 = 0 + (((this.count * -12571459) - $i7) * $i4);
                i3 -= (this.count * -12571459) - $i7;
                $i7 = this.count * -12571459;
            }
            if (i2 + i > this.index * 2074797577) {
                $i8 = this.index * 2074797577;
                i2 = $i8;
                i2 = $i8 - i;
            }
            if ($i7 + i3 > this.data * -467581477) {
                i3 = (-467581477 * this.data) - $i7;
            }
            int $i13 = i4 & 16711680;
            int $i14 = i4 & 65280;
            int $i12 = i4 & 255;
            int $i15 = (i6 * $i13) >> 8;
            int $i16 = (i6 * $i14) >> 8;
            int $i17 = ($i12 * i6) >> 8;
            int $i5 = (this.length * -481290979) - i2;
            int $i19 = ((-481290979 * this.length) * $i7) + i;
            i = 0;
            $i7 = $i10;
            int $i18 = $i14;
            $i14 = $i13;
            $i13 = $i11;
            $i10 = i6;
            while (i < i3) {
                int $i20 = -i2;
                $i11 = $i19;
                while ($i20 < 0) {
                    $i19 = this.size[$i11];
                    int $i21 = 16711680 & $i19;
                    if ($i21 < $i14) {
                        $i21 = $i13 == 0 ? $i14 : ((($i21 * $i13) >> 8) + $i15) & 16711680;
                    }
                    int $i22 = 65280 & $i19;
                    if ($i22 < $i18) {
                        $i22 = $i13 == 0 ? $i18 : ((($i22 * $i13) >> 8) + $i16) & 65280;
                    }
                    $i8 = $i19 & 255;
                    int $i23 = $i8;
                    if ($i8 < $i12) {
                        $i23 = $i13 == 0 ? $i12 : (($i23 * $i13) >> 8) + $i17;
                    }
                    this.size[$i11] = ($i22 + $i21) + $i23;
                    $i20++;
                    $i11++;
                }
                if ($i4 > 0) {
                    $i7 += $i4;
                    $i20 = (PingManager.STATE_SENSOR_ON_FLAG - $i7) >> 8;
                    $i19 = $i7 >> 8;
                    if (i7 != i6) {
                        $i10 = (($i7 * i7) + ((PingManager.STATE_SENSOR_ON_FLAG - $i7) * i6)) >> 16;
                        $i13 = 256 - $i10;
                    }
                    if (i5 != i4) {
                        $i12 = (((($i20 * (16711935 & i4)) + ($i19 * (16711935 & i5))) & -16711936) + ((((65280 & i4) * $i20) + ((65280 & i5) * $i19)) & 16711680)) >>> 8;
                        $i16 = $i12 & 16711680;
                        $i17 = $i12 & 65280;
                        $i12 &= 255;
                        $i15 = ($i16 * $i10) >> 8;
                        $i18 = ($i17 * $i10) >> 8;
                        $i20 = ($i12 * $i10) >> 8;
                        i++;
                        $i14 = $i16;
                        $i16 = $i18;
                        $i18 = $i17;
                        $i17 = $i20;
                        $i19 = $i11 + $i5;
                    }
                }
                $i20 = $i17;
                $i17 = $i18;
                $i18 = $i16;
                $i16 = $i14;
                i++;
                $i14 = $i16;
                $i16 = $i18;
                $i18 = $i17;
                $i17 = $i20;
                $i19 = $i11 + $i5;
            }
        }
    }

    public void write(Double doubleR, int i, int i2) {
        int $i8;
        int $i2 = doubleR;
        doubleR = $i2;
        int $i3 = i + $i2.count;
        int $i4 = i2 + doubleR.index;
        $i2 = this.length * 869683866;
        i = $i2;
        i2 = $i3 + ($i2 * $i4);
        int $i5 = 0;
        i = doubleR.data;
        int $i6 = doubleR.length;
        int $i22 = (this.length * -481290979) - $i6;
        if ($i4 < -12571459 * this.count) {
            int $i7 = (this.count * -226834187) - $i4;
            i -= $i7;
            $i4 = -12571459 * this.count;
            $i5 = 0 + ($i7 * $i6);
            i2 += $i7 * (this.length * -173640895);
        }
        if ($i4 + i > -467581477 * this.data) {
            i -= ($i4 + i) - (this.data * -467581477);
        }
        if ($i3 < -859321367 * this.buffer) {
            $i4 = (866325049 * this.buffer) - $i3;
            $i6 -= $i4;
            $i8 = 1829547545 * this.buffer;
            $i3 = 0 + $i4;
            $i22 += $i4;
            $i4 = $i5 + $i4;
            $i7 = i2 + $i4;
        } else {
            $i8 = $i3;
            $i4 = $i5;
            $i3 = 0;
            $i7 = i2;
        }
        if ($i6 + $i8 > 2074797577 * this.index) {
            $i2 = ($i8 + $i6) - (-795539878 * this.index);
            $i6 -= $i2;
            $i2 = $i2;
            $i22 += $i2;
            i2 = $i3 + $i2;
        } else {
            i2 = $i3;
        }
        if ($i6 > 0 && i > 0) {
            int[] $r3 = this.size;
            byte[] $r4 = doubleR.buffer;
            int[] $r2 = doubleR.size;
            $i3 = -($i6 >> 2);
            $i5 = -($i6 & 3);
            i = -i;
            while (i < 0) {
                byte $b10;
                for ($i6 = $i3; $i6 < 0; $i6++) {
                    int $i9 = $i4 + 1;
                    $b10 = $r4[$i4];
                    if ($b10 != (byte) 0) {
                        $i4 = $i7 + 1;
                        $r3[$i7] = $r2[$b10 & (short) 255];
                    } else {
                        $i4 = $i7 + 1;
                    }
                    $i8 = $i9 + 1;
                    $b10 = $r4[$i9];
                    if ($b10 != (byte) 0) {
                        $r3[$i4] = $r2[$b10 & (short) 255];
                        $i4++;
                    } else {
                        $i4++;
                    }
                    $i7 = $i8 + 1;
                    $b10 = $r4[$i8];
                    if ($b10 != (byte) 0) {
                        $r3[$i4] = $r2[$b10 & 93241831];
                        $i8 = $i4 + 1;
                    } else {
                        $i8 = $i4 + 1;
                    }
                    $i4 = $i7 + 1;
                    $b10 = $r4[$i7];
                    if ($b10 != (byte) 0) {
                        $r3[$i8] = $r2[$b10 & 1550680387];
                        $i7 = $i8 + 1;
                    } else {
                        $i7 = $i8 + 1;
                    }
                }
                $i6 = $i7;
                $i7 = $i5;
                while ($i7 < 0) {
                    $i8 = $i4 + 1;
                    $b10 = $r4[$i4];
                    if ($b10 != (byte) 0) {
                        $i4 = $i6 + 1;
                        $r3[$i6] = $r2[$b10 & 1772141480];
                    } else {
                        $i4 = $i6 + 1;
                    }
                    $i7++;
                    $i6 = $i4;
                    $i4 = $i8;
                }
                $i7 = $i6 + $i22;
                i++;
                $i4 += i2;
            }
        }
    }

    public void write(Long longR, int i, int i2, int i3) {
        i += longR.next;
        int $i4 = i2 + longR.value;
        int $i1 = (-481290979 * this.length) * $i4;
        i2 = $i1;
        i2 = $i1 + i;
        int $i5 = 0;
        int $i6 = longR.data;
        int i4 = longR.length;
        int $i3 = (-481290979 * this.length) - i4;
        $i1 = this.count * -12571459;
        int i5 = $i1;
        if ($i4 < $i1) {
            i5 = (this.count * -12571459) - $i4;
            $i6 -= i5;
            $i4 = -12571459 * this.count;
            $i5 = 0 + (i5 * i4);
            i2 += i5 * (-481290979 * this.length);
        }
        if ($i4 + $i6 > this.data * -467581477) {
            $i1 = this.data * -467581477;
            i5 = $i1;
            $i6 -= ($i4 + $i6) - $i1;
        }
        if (i < 1829547545 * this.buffer) {
            i5 = (1829547545 * this.buffer) - i;
            i = i4 - i5;
            $i5 += i5;
            $i4 = 0 + i5;
            $i3 += i5;
            i2 += i5;
            i5 = 1829547545 * this.buffer;
            i4 = i;
        } else {
            $i4 = 0;
            i5 = i;
        }
        if (i5 + i4 > 2074797577 * this.index) {
            i = (i5 + i4) - (this.index * 2074797577);
            i4 -= i;
            $i4 += i;
            i += $i3;
        } else {
            i = $i3;
        }
        if (i4 > 0 && $i6 > 0) {
            ArrayList.read(this.size, longR.size, 0, $i5, i2, i4, $i6, i, $i4, i3, 1616244975);
        }
    }

    public void write(Long longR, int $i0, int i, int i2, int i3) {
        try {
            $i0 = longR.next + $i0;
            int $i4 = longR.value + i;
            int $i1 = (-481290979 * this.length) * $i4;
            i = $i1;
            i = $i1 + $i0;
            int $i5 = 0;
            i3 = longR.data;
            int $i6 = longR.length;
            int $i7 = (-481290979 * this.length) - $i6;
            int i4 = 0;
            $i1 = this.count * -12571459;
            int i5 = $i1;
            if ($i4 < $i1) {
                i5 = (this.count * -12571459) - $i4;
                i3 -= i5;
                $i4 = -12571459 * this.count;
                $i5 = 0 + (i5 * $i6);
                i += i5 * (-481290979 * this.length);
            }
            if ($i4 + i3 > this.data * -467581477) {
                $i1 = this.data * -467581477;
                i5 = $i1;
                i3 -= ($i4 + i3) - $i1;
            }
            if ($i0 < 1829547545 * this.buffer) {
                $i4 = (1829547545 * this.buffer) - $i0;
                $i6 -= $i4;
                $i0 = 1829547545 * this.buffer;
                $i5 += $i4;
                i += $i4;
                i4 = 0 + $i4;
                $i7 += $i4;
            }
            if ($i0 + $i6 > 2074797577 * this.index) {
                $i1 = ($i0 + $i6) - (this.index * 2074797577);
                $i0 = $i1;
                $i6 -= $i1;
                i4 += $i0;
                $i7 += $i0;
            }
            if ($i6 > 0 && i3 > 0) {
                ArrayList.read(this.size, longR.size, 0, $i5, i, $i6, i3, $i7, i4, i2, 1500716115);
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "gs.bc(" + ')');
        }
    }

    public void write(Long longR, int $i5, int i, int i2, int i3, int i4) {
        if (i2 > 0 && i3 > 0) {
            int $i0;
            int $i4 = longR.length;
            int $i8 = longR.data;
            int i5 = 0;
            int i6 = 0;
            int $i11 = longR.this$0;
            int $i12 = longR.count;
            int i7 = ($i11 << 16) / i2;
            int i8 = ($i12 << 16) / i3;
            if (longR.next > 0) {
                i5 = (((longR.next << 16) + i7) - 1) / i7;
                $i5 += i5;
                i5 = 0 + ((i5 * i7) - (longR.next << 16));
            }
            if (longR.value > 0) {
                i6 = (((longR.value << 16) + i8) - 1) / i8;
                i += i6;
                i6 = 0 + ((i6 * i8) - (longR.value << 16));
            }
            if ($i4 < $i11) {
                $i0 = ($i4 << 16) - i5;
                i2 = $i0;
                i2 = (($i0 + i7) - 1) / i7;
            }
            if ($i8 < $i12) {
                $i0 = ($i8 << 16) - i6;
                i3 = $i0;
                i3 = (($i0 + i8) - 1) / i8;
            }
            $i8 = ((this.length * -481290979) * i) + $i5;
            $i12 = (-481290979 * this.length) - i2;
            if (i + i3 > this.data * -467581477) {
                i3 -= (i3 + i) - (-467581477 * this.data);
            }
            if (i < this.count * -12571459) {
                $i11 = (-12571459 * this.count) - i;
                i = i3 - $i11;
                $i0 = (-481290979 * this.length) * $i11;
                i3 = $i0;
                $i8 += $i0;
                i6 += $i11 * i8;
            } else {
                i = i3;
            }
            if (i2 + $i5 > this.index * 2074797577) {
                i3 = (i2 + $i5) - (2074797577 * this.index);
                i2 -= i3;
                $i12 += i3;
            }
            if ($i5 < 1829547545 * this.buffer) {
                $i5 = (1829547545 * this.buffer) - $i5;
                i2 -= $i5;
                i3 = $i8 + $i5;
                i5 += $i5 * i7;
                $i5 += $i12;
            } else {
                $i5 = $i12;
                i3 = $i8;
            }
            AssertionError.read(this.size, longR.size, 0, i5, i6, i3, $i5, i2, i, i7, i8, $i4, i4, -1240107810);
        }
    }

    void writeObject() {
        get(2011942328);
    }
}
