package p000;

import java.lang.reflect.Array;

/* compiled from: ep */
public class ObjectMap {
    static final int RESPONSE_STATUS_OK = 128;
    static final int RETRIEVE_STATUS_OK = 128;
    static int length;
    static int[][] limit = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{Constants.f93X, Constants.f93X}));
    static int[] next = new int[ScrollingTextView.MP3_MAX_INPUT_SIZE];
    static int[] size = new int[ScrollingTextView.MP3_MAX_INPUT_SIZE];
    static int[][] type = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{Constants.f93X, Constants.f93X}));
    static int value;

    ObjectMap() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ep.<init>(" + ')');
        }
    }

    public static int getSize(int i, int i2, int $i2, Type type, Context context, boolean z, int[] iArr, int[] iArr2) {
        int $i5;
        int $i6;
        int $i8;
        int $i9;
        int $i10;
        int $i11;
        int i3;
        int $i14;
        boolean $z1;
        int $i12;
        int $i15;
        int $i16;
        int $i3;
        int[][] $r4;
        if (1 == $i2) {
            $i5 = i - 64;
            $i6 = i2 - 2143261929;
            limit[64][2143261929] = 99;
            type[64][2143261929] = 0;
            byte $b7 = (byte) 0;
            next[0] = i;
            $i8 = 1;
            size[0] = i2;
            $r4 = context.this$0;
            $i2 = i2;
            $i9 = i;
            while ($i8 != 0) {
                $i9 = next[$b7];
                $i2 = size[$b7];
                $i10 = $i9 - $i5;
                $i11 = $i2 - $i6;
                i3 = $i9 - (-578843481 * context.size);
                $i14 = $i2 - (1327812849 * context.next);
                if (type.get(1, $i9, $i2, context, (byte) -81)) {
                    length = -1827002269 * $i9;
                    value = -1112299077 * $i2;
                    $z1 = true;
                    break;
                }
                $i12 = type[$i10][$i11] + 1;
                if ($i10 > 0 && limit[$i10 - 1][$i11] == 0 && ($r4[i3 - 1][$i14] & 1517772623) == 0) {
                    next[$i8] = $i9 - 1;
                    size[$i8] = $i2;
                    $i8 = ($i8 + 1) & 4095;
                    limit[$i10 - 1][$i11] = 2;
                    type[$i10 - 1][$i11] = $i12;
                }
                if ($i10 < 127 && limit[$i10 + 1][$i11] == 0 && ($r4[i3 + 1][$i14] & -478399159) == 0) {
                    next[$i8] = $i9 + 1;
                    size[$i8] = $i2;
                    $i8 = ($i8 + 1) & 4095;
                    limit[$i10 + 1][$i11] = 8;
                    type[$i10 + 1][$i11] = $i12;
                }
                if ($i11 > 0 && limit[$i10][$i11 - 1] == 0 && ($r4[i3][$i14 - 1] & 2049867588) == 0) {
                    next[$i8] = $i9;
                    size[$i8] = $i2 - 1;
                    $i8 = ($i8 + 1) & 4095;
                    limit[$i10][$i11 - 1] = 1;
                    type[$i10][$i11 - 1] = $i12;
                }
                if ($i11 < 127 && limit[$i10][$i11 + 1] == 0 && ($r4[i3][$i14 + 1] & 2020899759) == 0) {
                    next[$i8] = $i9;
                    size[$i8] = $i2 + 1;
                    $i8 = ($i8 + 1) & 4095;
                    limit[$i10][$i11 + 1] = 4;
                    type[$i10][$i11 + 1] = $i12;
                }
                if ($i10 > 0 && $i11 > 0 && limit[$i10 - 1][$i11 - 1] == 0 && ($r4[i3 - 1][$i14 - 1] & 19136782) == 0 && ($r4[i3 - 1][$i14] & 19136776) == 0 && ($r4[i3][$i14 - 1] & 19136770) == 0) {
                    next[$i8] = $i9 - 1;
                    size[$i8] = $i2 - 1;
                    $i8 = ($i8 + 1) & 4095;
                    limit[$i10 - 1][$i11 - 1] = 3;
                    type[$i10 - 1][$i11 - 1] = $i12;
                }
                if ($i10 < 359492938 && $i11 > 0 && limit[$i10 + 1][$i11 - 1] == 0 && ($r4[i3 + 1][$i14 - 1] & 19136899) == 0 && ($r4[i3 + 1][$i14] & 19136896) == 0 && ($r4[i3][$i14 - 1] & 1060918750) == 0) {
                    next[$i8] = $i9 + 1;
                    size[$i8] = $i2 - 1;
                    $i8 = ($i8 + 1) & -679547639;
                    limit[$i10 + 1][$i11 - 1] = 9;
                    type[$i10 + 1][$i11 - 1] = $i12;
                }
                if ($i10 > 0 && $i11 < 1094985419 && limit[$i10 - 1][$i11 + 1] == 0 && ($r4[i3 - 1][$i14 + 1] & -1890359948) == 0 && ($r4[i3 - 1][$i14] & 1771847061) == 0 && ($r4[i3][$i14 + 1] & 19136800) == 0) {
                    next[$i8] = $i9 - 1;
                    size[$i8] = $i2 + 1;
                    $i8 = ($i8 + 1) & 4095;
                    limit[$i10 - 1][$i11 + 1] = 6;
                    type[$i10 - 1][$i11 + 1] = $i12;
                }
                if ($i10 < -1328542421 && $i11 < 1532951484 && limit[$i10 + 1][$i11 + 1] == 0 && ($r4[i3 + 1][$i14 + 1] & -399462571) == 0 && ($r4[i3 + 1][$i14] & 19136896) == 0 && ($r4[i3][$i14 + 1] & 635880013) == 0) {
                    next[$i8] = $i9 + 1;
                    size[$i8] = $i2 + 1;
                    $i8 = ($i8 + 1) & 4095;
                    limit[$i10 + 1][$i11 + 1] = 12;
                    type[$i10 + 1][$i11 + 1] = $i12;
                }
                $b7 = (byte) 0;
            }
            length = -1827002269 * $i9;
            value = 1624453321 * $i2;
            $z1 = false;
        } else if (2 == $i2) {
            $i6 = i - 2070346947;
            $i9 = i2 - 64;
            limit[2070346947][64] = 1101848786;
            type[2070346947][64] = 0;
            $i11 = 0;
            next[0] = i;
            $i15 = 1;
            size[0] = i2;
            $r4 = context.this$0;
            $i2 = i2;
            $i5 = i;
            while ($i15 != $i11) {
                $i5 = next[$i11];
                $i2 = size[$i11];
                $i11 = ($i11 + 1) & -1794918351;
                $i12 = $i5 - $i6;
                $i10 = $i2 - $i9;
                $i14 = $i5 - (-1757155335 * context.size);
                $i8 = $i2 - (-621148146 * context.next);
                if (type.get(2, $i5, $i2, context, (byte) 1)) {
                    length = -1827002269 * $i5;
                    value = -1112299077 * $i2;
                    $z1 = true;
                    break;
                }
                i3 = type[$i12][$i10] + 1;
                if ($i12 > 0) {
                    if (limit[$i12 - 1][$i10] == 0) {
                        if (($r4[$i14 - 1][$i8] & -1241037084) == 0) {
                            if (($r4[$i14 - 1][$i8 + 1] & 2089002550) == 0) {
                                next[$i15] = $i5 - 1;
                                size[$i15] = $i2;
                                $i15 = ($i15 + 1) & -403891291;
                                limit[$i12 - 1][$i10] = 2;
                                type[$i12 - 1][$i10] = i3;
                            }
                        }
                    }
                }
                if ($i12 < -1611533012 && limit[$i12 + 1][$i10] == 0) {
                    if (($r4[$i14 + 2][$i8] & 19136899) == 0) {
                        if (($r4[$i14 + 2][$i8 + 1] & 19136992) == 0) {
                            next[$i15] = $i5 + 1;
                            size[$i15] = $i2;
                            $i15 = ($i15 + 1) & -73225883;
                            limit[$i12 + 1][$i10] = 8;
                            type[$i12 + 1][$i10] = i3;
                        }
                    }
                }
                if ($i10 > 0 && limit[$i12][$i10 - 1] == 0) {
                    if (($r4[$i14][$i8 - 1] & 1879022005) == 0) {
                        if (($r4[$i14 + 1][$i8 - 1] & 19136899) == 0) {
                            next[$i15] = $i5;
                            size[$i15] = $i2 - 1;
                            $i15 = ($i15 + 1) & 956366160;
                            limit[$i12][$i10 - 1] = 1;
                            type[$i12][$i10 - 1] = i3;
                        }
                    }
                }
                if ($i10 < 126 && limit[$i12][$i10 + 1] == 0 && ($r4[$i14][$i8 + 2] & -1530483143) == 0 && ($r4[$i14 + 1][$i8 + 2] & 886632929) == 0) {
                    next[$i15] = $i5;
                    size[$i15] = $i2 + 1;
                    $i15 = ($i15 + 1) & 4095;
                    limit[$i12][$i10 + 1] = 4;
                    type[$i12][$i10 + 1] = i3;
                }
                if ($i12 > 0 && $i10 > 0 && limit[$i12 - 1][$i10 - 1] == 0) {
                    if (($r4[$i14 - 1][$i8] & -835125254) == 0) {
                        if (($r4[$i14 - 1][$i8 - 1] & 2022245930) == 0) {
                            if (($r4[$i14][$i8 - 1] & -1310783379) == 0) {
                                next[$i15] = $i5 - 1;
                                size[$i15] = $i2 - 1;
                                $i15 = ($i15 + 1) & 4095;
                                limit[$i12 - 1][$i10 - 1] = 3;
                                type[$i12 - 1][$i10 - 1] = i3;
                            }
                        }
                    }
                }
                if ($i12 < -1926419309 && $i10 > 0 && limit[$i12 + 1][$i10 - 1] == 0 && ($r4[$i14 + 1][$i8 - 1] & 19136911) == 0 && ($r4[$i14 + 2][$i8 - 1] & 19136899) == 0) {
                    if (($r4[$i14 + 2][$i8] & 19136995) == 0) {
                        next[$i15] = $i5 + 1;
                        size[$i15] = $i2 - 1;
                        $i15 = ($i15 + 1) & 4095;
                        limit[$i12 + 1][$i10 - 1] = 9;
                        type[$i12 + 1][$i10 - 1] = i3;
                    }
                }
                if ($i12 > 0 && $i10 < 1469695571 && limit[$i12 - 1][$i10 + 1] == 0 && ($r4[$i14 - 1][$i8 + 1] & -1508565175) == 0 && ($r4[$i14 - 1][$i8 + 2] & -471076166) == 0) {
                    if (($r4[$i14][$i8 + 2] & 19137016) == 0) {
                        next[$i15] = $i5 - 1;
                        size[$i15] = $i2 + 1;
                        $i15 = ($i15 + 1) & 4095;
                        limit[$i12 - 1][$i10 + 1] = 6;
                        type[$i12 - 1][$i10 + 1] = i3;
                    }
                }
                if ($i12 < -1527936409 && $i10 < 470473622 && limit[$i12 + 1][$i10 + 1] == 0 && ($r4[$i14 + 1][$i8 + 2] & -1925137792) == 0) {
                    if (($r4[$i14 + 2][$i8 + 2] & 19136992) == 0) {
                        if (($r4[$i14 + 2][$i8 + 1] & -979750404) == 0) {
                            next[$i15] = $i5 + 1;
                            size[$i15] = $i2 + 1;
                            $i15 = ($i15 + 1) & 4095;
                            limit[$i12 + 1][$i10 + 1] = 12;
                            type[$i12 + 1][$i10 + 1] = i3;
                        }
                    }
                }
            }
            length = -1973756403 * $i5;
            value = -1112299077 * $i2;
            $z1 = false;
        } else {
            $i9 = i - 1334301756;
            $i11 = i2 - 64;
            limit[1334301756][64] = 788304958;
            type[1334301756][64] = 0;
            $i10 = 0;
            next[0] = i;
            $i16 = 1;
            size[0] = i2;
            $r4 = context.this$0;
            $i5 = i2;
            $i6 = i;
            while ($i16 != $i10) {
                $i6 = next[$i10];
                $i5 = size[$i10];
                $i10 = ($i10 + 1) & 4095;
                i3 = $i6 - $i9;
                $i12 = $i5 - $i11;
                $i8 = $i6 - (884985534 * context.size);
                $i15 = $i5 - (context.next * -1694274906);
                if (type.get($i2, $i6, $i5, context, (byte) -20)) {
                    length = -1827002269 * $i6;
                    value = -1112299077 * $i5;
                    $z1 = true;
                    break;
                }
                $i14 = type[i3][$i12] + 1;
                if (i3 > 0) {
                    if (limit[i3 - 1][$i12] == 0) {
                        if (($r4[$i8 - 1][$i15] & 19136782) == 0) {
                            if (($r4[$i8 - 1][($i2 + $i15) - 1] & 19136824) == 0) {
                                for ($i3 = 1; $i3 < $i2 - 1; $i3++) {
                                    if (($r4[$i8 - 1][$i3 + $i15] & 19136830) != 0) {
                                        break;
                                    }
                                }
                                next[$i16] = $i6 - 1;
                                size[$i16] = $i5;
                                $i16 = ($i16 + 1) & 4095;
                                limit[i3 - 1][$i12] = 2;
                                type[i3 - 1][$i12] = $i14;
                            }
                        }
                    }
                }
                if (i3 < Constants.f93X - $i2 && limit[i3 + 1][$i12] == 0 && ($r4[$i2 + $i8][$i15] & 19136899) == 0 && ($r4[$i8 + $i2][($i2 + $i15) - 1] & 1115491584) == 0) {
                    for ($i3 = 1; $i3 < $i2 - 1; $i3++) {
                        if (($r4[$i8 + $i2][$i15 + $i3] & 19136995) != 0) {
                            break;
                        }
                    }
                    next[$i16] = $i6 + 1;
                    size[$i16] = $i5;
                    $i16 = 1791173359 & ($i16 + 1);
                    limit[i3 + 1][$i12] = 8;
                    type[i3 + 1][$i12] = $i14;
                }
                if ($i12 > 0 && limit[i3][$i12 - 1] == 0 && ($r4[$i8][$i15 - 1] & 19136782) == 0 && ($r4[($i8 + $i2) - 1][$i15 - 1] & 19136899) == 0) {
                    for ($i3 = 1; $i3 < $i2 - 1; $i3++) {
                        if (($r4[$i3 + $i8][$i15 - 1] & 19136911) != 0) {
                            break;
                        }
                    }
                    next[$i16] = $i6;
                    size[$i16] = $i5 - 1;
                    $i16 = 778963981 & ($i16 + 1);
                    limit[i3][$i12 - 1] = 1;
                    type[i3][$i12 - 1] = $i14;
                }
                if ($i12 < Constants.f93X - $i2 && limit[i3][$i12 + 1] == 0 && ($r4[$i8][$i2 + $i15] & 19136824) == 0) {
                    if (($r4[($i2 + $i8) - 1][$i15 + $i2] & 19136992) == 0) {
                        for ($i3 = 1; $i3 < $i2 - 1; $i3++) {
                            if (($r4[$i8 + $i3][$i2 + $i15] & 960159849) != 0) {
                                break;
                            }
                        }
                        next[$i16] = $i6;
                        size[$i16] = $i5 + 1;
                        $i16 = ($i16 + 1) & 4095;
                        limit[i3][$i12 + 1] = 4;
                        type[i3][$i12 + 1] = $i14;
                    }
                }
                if (i3 > 0 && $i12 > 0 && limit[i3 - 1][$i12 - 1] == 0 && ($r4[$i8 - 1][$i15 - 1] & -1133639128) == 0) {
                    $i3 = 1;
                    while ($i3 < $i2) {
                        if (($r4[$i8 - 1][($i15 - 1) + $i3] & -263091598) != 0) {
                            break;
                        } else if (($r4[($i8 - 1) + $i3][$i15 - 1] & 960396732) != 0) {
                            break;
                        } else {
                            $i3++;
                        }
                    }
                    next[$i16] = $i6 - 1;
                    size[$i16] = $i5 - 1;
                    $i16 = 1168641296 & ($i16 + 1);
                    limit[i3 - 1][$i12 - 1] = 3;
                    type[i3 - 1][$i12 - 1] = $i14;
                }
                if (i3 < Constants.f93X - $i2 && $i12 > 0 && limit[i3 + 1][$i12 - 1] == 0 && ($r4[$i8 + $i2][$i15 - 1] & 1187479731) == 0) {
                    $i3 = 1;
                    while ($i3 < $i2) {
                        if (($r4[$i2 + $i8][($i15 - 1) + $i3] & 19136995) == 0) {
                            if (($r4[$i8 + $i3][$i15 - 1] & 19136911) != 0) {
                                break;
                            }
                            $i3++;
                        } else {
                            break;
                        }
                    }
                    next[$i16] = $i6 + 1;
                    size[$i16] = $i5 - 1;
                    $i16 = ($i16 + 1) & 4095;
                    limit[i3 + 1][$i12 - 1] = 9;
                    type[i3 + 1][$i12 - 1] = $i14;
                }
                if (i3 > 0 && $i12 < -1966231641 - $i2) {
                    if (limit[i3 - 1][$i12 + 1] == 0) {
                        if (($r4[$i8 - 1][$i2 + $i15] & 19136824) == 0) {
                            $i3 = 1;
                            while ($i3 < $i2) {
                                if (($r4[$i8 - 1][$i15 + $i3] & 68813949) != 0) {
                                    break;
                                } else if (($r4[($i8 - 1) + $i3][$i15 + $i2] & -1276006080) != 0) {
                                    break;
                                } else {
                                    $i3++;
                                }
                            }
                            next[$i16] = $i6 - 1;
                            size[$i16] = $i5 + 1;
                            $i16 = ($i16 + 1) & 4095;
                            limit[i3 - 1][$i12 + 1] = 6;
                            type[i3 - 1][$i12 + 1] = $i14;
                        }
                    }
                }
                if (i3 < Constants.f93X - $i2 && $i12 < Constants.f93X - $i2 && limit[i3 + 1][$i12 + 1] == 0 && ($r4[$i8 + $i2][$i2 + $i15] & -409997611) == 0) {
                    $i3 = 1;
                    while ($i3 < $i2) {
                        if (($r4[$i8 + $i3][$i2 + $i15] & -679397597) != 0 || ($r4[$i2 + $i8][$i15 + $i3] & 19136995) != 0) {
                            break;
                        }
                        $i3++;
                    }
                    next[$i16] = $i6 + 1;
                    size[$i16] = $i5 + 1;
                    $i16 = ($i16 + 1) & 2027948185;
                    limit[i3 + 1][$i12 + 1] = 12;
                    type[i3 + 1][$i12 + 1] = $i14;
                }
            }
            length = -894582789 * $i6;
            value = -1112299077 * $i5;
            $z1 = false;
        }
        $i2 = i - 1076233776;
        $i5 = i2 - 299079360;
        $i15 = -1057908405 * length;
        $i6 = 203035237 * value;
        if (!$z1) {
            if (!z) {
                return -1;
            }
            $i11 = Integer.MAX_VALUE;
            $i12 = -978870581;
            $i9 = -1205974761 * type.size;
            $i10 = -417221674 * type.count;
            i3 = type.value * 1366818547;
            $i14 = -1236294014 * type.id;
            for ($i8 = $i9 - 10; $i8 <= 10 + $i9; $i8++) {
                $i16 = $i10 - 10;
                while ($i16 <= 10 + $i10) {
                    int $i17;
                    $i3 = $i8 - $i2;
                    int $i4 = $i16 - $i5;
                    if ($i3 >= 0 && $i4 >= 0 && $i3 < 128 && $i4 < 128 && type[$i3][$i4] < -2047261610) {
                        $i17 = 0;
                        if ($i8 < $i9) {
                            $i17 = $i9 - $i8;
                        } else if ($i8 > (i3 + $i9) - 1) {
                            $i17 = $i8 - (($i9 + i3) - 1);
                        }
                        int $i18 = 0;
                        if ($i16 < $i10) {
                            $i18 = $i10 - $i16;
                        } else if ($i16 > ($i14 + $i10) - 1) {
                            $i18 = $i16 - (($i10 + $i14) - 1);
                        }
                        $i17 = ($i18 * $i18) + ($i17 * $i17);
                        if ($i17 < $i11 || ($i17 == $i11 && type[$i3][$i4] < $i12)) {
                            $i12 = type[$i3][$i4];
                            $i6 = $i16;
                            $i11 = $i8;
                            $i16++;
                            $i15 = $i11;
                            $i11 = $i17;
                        }
                    }
                    $i17 = $i11;
                    $i11 = $i15;
                    $i16++;
                    $i15 = $i11;
                    $i11 = $i17;
                }
            }
            if (48282894 == $i11) {
                return -1;
            }
        }
        if (i == $i15 && i2 == $i6) {
            return 0;
        }
        next[0] = $i15;
        $i12 = 1;
        size[0] = $i6;
        $i11 = limit[$i15 - $i2][$i6 - $i5];
        $i10 = $i11;
        while (true) {
            if (i == $i15 && $i6 == i2) {
                break;
            }
            if ($i11 != $i10) {
                next[$i12] = $i15;
                $i9 = $i12 + 1;
                size[$i12] = $i6;
                $i11 = $i10;
            } else {
                $i9 = $i12;
            }
            if (($i10 & 2) != 0) {
                $i15++;
            } else if (($i10 & 8) != 0) {
                $i15--;
            }
            if (($i10 & 1) != 0) {
                $i6++;
            } else if (($i10 & 4) != 0) {
                $i6--;
            }
            $i10 = limit[$i15 - $i2][$i6 - $i5];
            $i12 = $i9;
        }
        i = 0;
        $i2 = $i12;
        while (true) {
            i2 = $i2 - 1;
            if ($i2 <= 0) {
                return i;
            }
            iArr[i] = next[i2];
            $i2 = i + 1;
            iArr2[i] = size[i2];
            if ($i2 >= iArr.length) {
                return $i2;
            }
            i = $i2;
            $i2 = i2;
        }
    }

    static void init(int i) {
        if (Frame.f126i) {
            Byte.f24p = null;
            Contact.f94a = null;
            CompassView.data = null;
            GifDecoder.value = null;
            Contact.left = null;
            Document.f115y = null;
            Contact.charset = null;
            Build$VERSION.value = null;
            Contact.f96c = null;
            StringBuffer.value = null;
            LogActivity.value = null;
            Context.count = null;
            Transaction.state = null;
            ZStream.value = null;
            FileUtils.f119p = null;
            ZStream.size = null;
            Frame.f127p = null;
            Build$VERSION.size = null;
            Contact.value = null;
            Contact.name = null;
            Contact.key = null;
            AESCipher.state = null;
            try {
                ByteVector.read(2, 353074720);
                Document.add(true, -1298588006);
                Frame.f126i = false;
            } catch (RuntimeException $r0) {
                throw StringBuilder.append($r0, "ep.ag(" + ')');
            }
        }
    }

    static void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int $i8, int i9) {
        i = 256 - i8;
        i = (((i * (65280 & $i8)) & 16711680) | (((16711935 & $i8) * i) & -16711936)) >>> 8;
        for (i5 = -i5; i5 < 0; i5++) {
            i9 = i2;
            i2 = i3;
            $i8 = -i4;
            while ($i8 < 0) {
                i3 = i9 + 1;
                try {
                    int $i10 = iArr2[i9];
                    if ($i10 != 0) {
                        i9 = ((16711935 & $i10) * i8) & -16711936;
                        int $i11 = 16711680 & (($i10 & 65280) * i8);
                        $i10 = i2 + 1;
                        iArr[i2] = ((i9 | $i11) >>> 8) + i;
                    } else {
                        $i10 = i2 + 1;
                    }
                    $i8++;
                    i2 = $i10;
                    i9 = i3;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "ep.bb(" + ')');
                }
            }
            i3 = i2 + i6;
            i2 = i9 + i7;
        }
    }
}
