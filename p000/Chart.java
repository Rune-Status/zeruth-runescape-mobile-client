package p000;

import java.lang.reflect.Array;

/* compiled from: gu */
public final class Chart {
    static final int[] $assertionsDisabled = new int[]{16, 32, 64, Constants.f93X};
    static int f40a;
    static final int[] buf = new int[]{-1, -1, 1, 1};
    static int count = 1071674573;
    static Downloader data;
    static int[] index;
    static int[][][] length = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle}));
    static int[][] max;
    static int name = ((((int) (Math.random() * 33.0d)) - 16) * -2114995645);
    static int[] next;
    static final int[] f41p = new int[]{0, -1, 0, 1};
    static final int[] parent = new int[]{1, 2, 4, 8};
    static int pos = ((((int) (Math.random() * 17.0d)) - 8) * 1950971923);
    static byte[][][] position;
    static final int[] f42r = new int[]{1, -1, -1, 1};
    static byte[][][] size = ((byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle}));
    static final int[] text = new int[]{1, 0, -1, 0};
    static int[] value;

    Chart() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gu.<init>(" + ')');
        }
    }

    static void add() {
        count = 1071674573;
        position = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        Primitive.name = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        ScrollingTextView.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        Dialog.index = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        AstNode.value = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
        Server.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
        max = (int[][]) Array.newInstance(Integer.TYPE, new int[]{Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
        Primitive.value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        index = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        Namespace.value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        next = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
    }

    static final void add(int i, int $i1, int i2, int i3, int $i4, int $i5, int $i6, Log log, Context context) {
        int $i9;
        int i4;
        int i5;
        int $i7;
        int $i12;
        int $i13;
        Transaction $r2 = BigInteger.get($i4, 1793750264);
        if (1 == $i5 || 3 == $i5) {
            $i9 = $r2.this$0 * -265754695;
            i4 = $r2.offset * -344743753;
        } else {
            $i9 = $r2.offset * -344743753;
            i4 = $r2.this$0 * -265754695;
        }
        if (i4 + i2 <= 1030494989) {
            i5 = ((i4 + 1) >> 1) + i2;
            $i7 = i2 + (i4 >> 1);
        } else {
            i5 = i2 + 1;
            $i7 = i2;
        }
        if ($i9 + i3 <= -928302747) {
            $i12 = ($i9 >> 1) + i3;
            $i13 = (($i9 + 1) >> 1) + i3;
        } else {
            $i13 = i3 + 1;
            $i12 = i3;
        }
        int[][] $r4 = length[$i1];
        int $i72 = $r4[$i7][$i13] + ($r4[i5][$i12] + $r4[$i7][$i12]);
        $i7 = $i72;
        $i7 = ($i72 + $r4[i5][$i13]) >> 2;
        int i6 = (i4 << 6) + (i2 << 7);
        $i12 = ($i9 << 6) + (i3 << 7);
        long $l15 = Exception.format(i2, i3, 2, $r2.value * -7661206 == 0, $i4, -42276503);
        i5 = ($i5 << 6) + $i6;
        if (2114235682 * $r2.list == 1) {
            i5 += 256;
        }
        ArrayMap $r7;
        if ($i6 == 22) {
            $r7 = (-1 == -92301031 * $r2.position && $r2.size == null) ? $r2.add(22, $i5, $r4, i6, $i7, $i12, 1784243188) : new AttributeList($i4, 22, $i5, $i1, i2, i3, -229827367 * $r2.position, true, null);
            log.set(i, i2, i3, $i7, $r7, $l15, i5);
            if ($r2.count * -1655214851 == 1) {
                context.add(i2, i3, (byte) 3);
            }
        } else if ($i6 == 10 || $i6 == 11) {
            $r7 = ($r2.position * -229827367 == -1 && $r2.size == null) ? $r2.add(10, $i5, $r4, i6, $i7, $i12, 1608987223) : new AttributeList($i4, 10, $i5, $i1, i2, i3, $r2.position * -229827367, true, null);
            if ($r7 != null) {
                log.add(i, i2, i3, $i7, i4, $i9, $r7, (int) 11 == $i6 ? (short) 256 : (short) 0, $l15, i5);
            }
            if (-1655214851 * $r2.count != 0) {
                context.toString(i2, i3, i4, $i9, $r2.index, 1976478650);
            }
        } else if ($i6 >= 12) {
            $r7 = (-229827367 * $r2.position == -1 && $r2.size == null) ? $r2.add($i6, $i5, $r4, i6, $i7, $i12, 1037040848) : new AttributeList($i4, $i6, $i5, $i1, i2, i3, $r2.position * -1379795485, true, null);
            log.add(i, i2, i3, $i7, 1, 1, $r7, 0, $l15, i5);
            if ($r2.count * 1074005935 != 0) {
                context.toString(i2, i3, i4, $i9, $r2.index, 1978812488);
            }
        } else if ($i6 == 0) {
            $r7 = (-1 == $r2.position * -229827367 && $r2.size == null) ? $r2.add(0, $i5, $r4, i6, $i7, $i12, 983326174) : new AttributeList($i4, 0, $i5, $i1, i2, i3, $r2.position * -229827367, true, null);
            log.add(i, i2, i3, $i7, $r7, null, parent[$i5], 0, $l15, i5);
            if ($r2.count * -1655214851 != 0) {
                context.get(i2, i3, $i6, $i5, $r2.index, 2013770266);
            }
        } else if ($i6 == 1) {
            $r7 = ($r2.position * -229827367 == -1 && $r2.size == null) ? $r2.add(1, $i5, $r4, i6, $i7, $i12, 1950171865) : new AttributeList($i4, 1, $i5, $i1, i2, i3, -229827367 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, $assertionsDisabled[$i5], 0, $l15, i5);
            if ($r2.count * -1655214851 != 0) {
                context.get(i2, i3, $i6, $i5, $r2.index, 2117486687);
            }
        } else if (2 == $i6) {
            $i9 = ($i5 + 1) & 3;
            if (-1 == $r2.position * 1245534646 && $r2.size == null) {
                $r10 = $r2.add(2, $i5 + 4, $r4, i6, $i7, $i12, 787444038);
                $r7 = $r2.add(2, $i9, $r4, i6, $i7, $i12, 1805570103);
            } else {
                ArrayMap attributeList = new AttributeList($i4, 2, $i5 + 4, $i1, i2, i3, 123215941 * $r2.position, true, null);
                $r7 = new AttributeList($i4, 2, $i9, $i1, i2, i3, -1264029455 * $r2.position, true, null);
                $r10 = attributeList;
            }
            log.add(i, i2, i3, $i7, $r10, $r7, parent[$i5], parent[$i9], $l15, i5);
            if (-1655214851 * $r2.count != 0) {
                context.get(i2, i3, $i6, $i5, $r2.index, 2100285950);
            }
        } else if ($i6 == 3) {
            $r7 = ($r2.position * -229827367 == -1 && $r2.size == null) ? $r2.add(3, $i5, $r4, i6, $i7, $i12, 1216662905) : new AttributeList($i4, 3, $i5, $i1, i2, i3, $r2.position * -229827367, true, null);
            log.add(i, i2, i3, $i7, $r7, null, $assertionsDisabled[$i5], 0, $l15, i5);
            if ($r2.count * -1655214851 != 0) {
                context.get(i2, i3, $i6, $i5, $r2.index, 1273818809);
            }
        } else if ($i6 == 9) {
            $r7 = (-1 == $r2.position * -1476232658 && $r2.size == null) ? $r2.add($i6, $i5, $r4, i6, $i7, $i12, 1070377626) : new AttributeList($i4, $i6, $i5, $i1, i2, i3, -1569776004 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, 1, 1, $r7, 0, $l15, i5);
            if ($r2.count * -1740393668 != 0) {
                context.toString(i2, i3, i4, $i9, $r2.index, 1722802814);
            }
        } else if ($i6 == 4) {
            $r7 = ($r2.position * -229827367 == -1 && $r2.size == null) ? $r2.add(4, $i5, $r4, i6, $i7, $i12, 856106831) : new AttributeList($i4, 4, $i5, $i1, i2, i3, -229827367 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, parent[$i5], 0, 0, 0, $l15, i5);
        } else if ($i6 == 5) {
            $l16 = log.append(i, i2, i3);
            $i6 = 0 != $l16 ? BigInteger.get(Method.get($l16), 1190571442).buf * 974961319 : 16;
            $r7 = (1164079550 * $r2.position == -1 && $r2.size == null) ? $r2.add(4, $i5, $r4, i6, $i7, $i12, 703600017) : new AttributeList($i4, 4, $i5, $i1, i2, i3, -229827367 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, parent[$i5], 0, text[$i5] * $i6, $i6 * f41p[$i5], $l15, i5);
        } else if (6 == $i6) {
            $l16 = log.append(i, i2, i3);
            $i6 = 0 != $l16 ? (BigInteger.get(Method.get($l16), 1945604415).buf * 1681090481) / 2 : 8;
            $r7 = ($r2.position * 160914471 == -1 && $r2.size == null) ? $r2.add(4, $i5 + 4, $r4, i6, $i7, $i12, 987278498) : new AttributeList($i4, 4, $i5 + 4, $i1, i2, i3, -1735196019 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, 256, $i5, f42r[$i5] * $i6, $i6 * buf[$i5], $l15, i5);
        } else if (7 == $i6) {
            $i5 = ($i5 + 2) & 3;
            $r7 = (-1 == -229827367 * $r2.position && $r2.size == null) ? $r2.add(4, $i5 + 4, $r4, i6, $i7, $i12, 1093792406) : new AttributeList($i4, 4, $i5 + 4, $i1, i2, i3, -744313892 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, -604171157, $i5, 0, 0, $l15, i5);
        } else if ($i6 == 8) {
            $l16 = log.append(i, i2, i3);
            $i6 = 0 != $l16 ? (BigInteger.get(Method.get($l16), 1117753168).buf * 565688634) / 2 : 8;
            $i9 = ($i5 + 2) & 3;
            if ($r2.position * -229827367 == -1 && $r2.size == null) {
                ArrayMap $r6 = $r2.add(4, $i5 + 4, $r4, i6, $i7, $i12, 1023226078);
                $r7 = $r2.add(4, $i9 + 4, $r4, i6, $i7, $i12, 624097294);
                $r10 = $r6;
            } else {
                $i72 = new AttributeList($i4, 4, $i5 + 4, $i1, i2, i3, $r2.position * -1153280511, true, null);
                $r7 = new AttributeList($i4, 4, $i9 + 4, $i1, i2, i3, $r2.position * -229827367, true, null);
                $r10 = $i72;
            }
            log.add(i, i2, i3, $i7, $r10, $r7, 256, $i5, f42r[$i5] * $i6, $i6 * buf[$i5], $l15, i5);
        }
    }

    static final void add(int $i0, int i, int i2, int $i3, int $i4, int $i5, Log log, Context context) {
        if (!client.LOG || (size[0][i][i2] & 2) != (byte) 0 || (size[$i0][i][i2] & 16) == (byte) 0) {
            int $i9;
            int $i12;
            int $i11;
            int i3;
            int $i13;
            int $i14;
            if ($i0 < count * -126911639) {
                count = 1545434922 * $i0;
            }
            Transaction $r9 = BigInteger.get($i3, 1909135057);
            if ($i4 == 1 || $i4 == 3) {
                $i9 = $r9.this$0 * 221392712;
                $i12 = $r9.offset * -203723138;
            } else {
                $i9 = 1083986283 * $r9.offset;
                $i12 = -265754695 * $r9.this$0;
            }
            if ($i12 + i <= -2033647919) {
                $i11 = ($i12 >> 1) + i;
                i3 = (($i12 + 1) >> 1) + i;
            } else {
                i3 = i + 1;
                $i11 = i;
            }
            if ($i9 + i2 <= 104) {
                $i13 = i2 + ($i9 >> 1);
                $i14 = (($i9 + 1) >> 1) + i2;
            } else {
                $i14 = i2 + 1;
                $i13 = i2;
            }
            int[][] $r11 = length[$i0];
            i3 = (($r11[$i11][$i14] + ($r11[$i11][$i13] + $r11[i3][$i13])) + $r11[i3][$i14]) >> 2;
            int $i7 = ($i12 << 6) + (i << 7);
            $i13 = (i2 << 7) + ($i9 << 6);
            long $l15 = Exception.format(i, i2, 2, $r9.value * -1866509663 == 0, $i3, -676336445);
            $i11 = ($i4 << 6) + $i5;
            if (1 == 29042685 * $r9.list) {
                $i11 += 256;
            }
            if ($r9.get((byte) -57)) {
                Dictionary.add($i0, i, i2, $r9, $i4, 625392392);
            }
            ArrayMap $r6;
            ArrayMap attributeList;
            if (22 == $i5) {
                if (!client.LOG || -1411933786 * $r9.value != 0 || 1 == -1655214851 * $r9.count || $r9.end) {
                    if (-1 == $r9.position * -229827367 && $r9.size == null) {
                        $r6 = $r9.add(22, $i4, $r11, $i7, i3, $i13, (short) 5820);
                    } else {
                        $r6 = attributeList;
                        attributeList = new AttributeList($i3, 22, $i4, $i0, i, i2, -229827367 * $r9.position, true, null);
                    }
                    log.set($i0, i, i2, i3, $r6, $l15, $i11);
                    if (1 == $r9.count * -1824877892 && context != null) {
                        context.add(i, i2, (byte) 99);
                    }
                }
            } else if ($i5 == 10 || 11 == $i5) {
                $r6 = (-1 == $r9.position * -229827367 && $r9.size == null) ? $r9.add(10, $i4, $r11, $i7, i3, $i13, (short) -20243) : new AttributeList($i3, 10, $i4, $i0, i, i2, $r9.position * -229827367, true, null);
                if ($r6 != null) {
                    if (log.add($i0, i, i2, i3, $i12, $i9, $r6, $i5 == 11 ? 256 : 0, $l15, $i11) && $r9.$assertionsDisabled) {
                        byte $i32 = (byte) 15;
                        if ($r6 instanceof Integer) {
                            $i32 = ((Integer) $r6).getDimension() / 4;
                            if ($i32 > (byte) 30) {
                                $i32 = (byte) 30;
                            }
                        }
                        for ($i4 = 0; $i4 <= $i12; $i4++) {
                            for ($i5 = 0; $i5 <= $i9; $i5++) {
                                if ($i32 > Server.value[$i0][$i4 + i][$i5 + i2]) {
                                    Server.value[$i0][$i4 + i][$i5 + i2] = (byte) $i32;
                                }
                            }
                        }
                    }
                }
                if (!($r9.count * 546473537 == 0 || context == null)) {
                    context.toString(i, i2, $i12, $i9, $r9.index, 1749067773);
                }
            } else if ($i5 >= 12) {
                $r6 = (-1 == -229827367 * $r9.position && $r9.size == null) ? $r9.add($i5, $i4, $r11, $i7, i3, $i13, (short) -2742) : new AttributeList($i3, $i5, $i4, $i0, i, i2, $r9.position * -229827367, true, null);
                log.add($i0, i, i2, i3, 1, 1, $r6, 0, $l15, $i11);
                if ($i5 >= 12 && $i5 <= 17 && $i5 != 13 && $i0 > 0) {
                    $r8 = AstNode.value[$i0][i];
                    $r8[i2] = $r8[i2] | -1410064593;
                }
                if (!(-1655214851 * $r9.count == 0 || context == null)) {
                    context.toString(i, i2, $i12, $i9, $r9.index, 1805384695);
                }
            } else if ($i5 == 0) {
                if ($r9.position * 80523652 == -1 && $r9.size == null) {
                    $r6 = $r9.add(0, $i4, $r11, $i7, i3, $i13, (short) 4398);
                } else {
                    $r6 = attributeList;
                    attributeList = new AttributeList($i3, 0, $i4, $i0, i, i2, -229827367 * $r9.position, true, null);
                }
                log.add($i0, i, i2, i3, $r6, null, parent[$i4], 0, $l15, $i11);
                if ($i4 == 0) {
                    if ($r9.$assertionsDisabled) {
                        Server.value[$i0][i][i2] = (byte) (byte) 76;
                        Server.value[$i0][i][i2 + 1] = (byte) (byte) 76;
                    }
                    if ($r9.root) {
                        $r8 = AstNode.value[$i0][i];
                        $r8[i2] = $r8[i2] | 585;
                    }
                } else if ($i4 == 1) {
                    if ($r9.$assertionsDisabled) {
                        Server.value[$i0][i][i2 + 1] = (byte) (byte) -92;
                        Server.value[$i0][i + 1][i2 + 1] = (byte) 50;
                    }
                    if ($r9.root) {
                        $r8 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r8[$i3] = $r8[$i3] | 1076789494;
                    }
                } else if ($i4 == 2) {
                    if ($r9.$assertionsDisabled) {
                        Server.value[$i0][i + 1][i2] = (byte) 50;
                        Server.value[$i0][i + 1][i2 + 1] = (byte) (byte) -93;
                    }
                    if ($r9.root) {
                        $r8 = AstNode.value[$i0][i + 1];
                        $r8[i2] = $r8[i2] | -1779900810;
                    }
                } else if ($i4 == 3) {
                    if ($r9.$assertionsDisabled) {
                        Server.value[$i0][i][i2] = (byte) 50;
                        Server.value[$i0][i + 1][i2] = (byte) (byte) -78;
                    }
                    if ($r9.root) {
                        $r8 = AstNode.value[$i0][i];
                        $r8[i2] = $r8[i2] | 1170;
                    }
                }
                if (!(-1655214851 * $r9.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r9.index, 1300362312);
                }
                if ($r9.buf * -922582278 != 16) {
                    log.set($i0, i, i2, $r9.buf * -99209527);
                }
            } else if ($i5 == 1) {
                if (-1 == $r9.position * -533703263 && $r9.size == null) {
                    $r6 = $r9.add(1, $i4, $r11, $i7, i3, $i13, (short) -17242);
                } else {
                    $r6 = attributeList;
                    attributeList = new AttributeList($i3, 1, $i4, $i0, i, i2, 1992540300 * $r9.position, true, null);
                }
                log.add($i0, i, i2, i3, $r6, null, $assertionsDisabled[$i4], 0, $l15, $i11);
                if ($r9.$assertionsDisabled) {
                    if ($i4 == 0) {
                        Server.value[$i0][i][i2 + 1] = (byte) (byte) -43;
                    } else if ($i4 == 1) {
                        Server.value[$i0][i + 1][i2 + 1] = (byte) (byte) 47;
                    } else if ($i4 == 2) {
                        Server.value[$i0][i + 1][i2] = (byte) 50;
                    } else if (3 == $i4) {
                        Server.value[$i0][i][i2] = (byte) 50;
                    }
                }
                if (!(-71896872 * $r9.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r9.index, 1271679389);
                }
            } else if ($i5 == 2) {
                $i9 = ($i4 + 1) & 3;
                if (-1 == -229827367 * $r9.position && $r9.size == null) {
                    $r12 = $r9.add(2, $i4 + 4, $r11, $i7, i3, $i13, (short) 3676);
                    $r6 = $r9.add(2, $i9, $r11, $i7, i3, $i13, (short) -7759);
                } else {
                    $r12 = attributeList;
                    attributeList = new AttributeList($i3, 2, $i4 + 4, $i0, i, i2, -229827367 * $r9.position, true, null);
                    $r6 = attributeList;
                    attributeList = new AttributeList($i3, 2, $i9, $i0, i, i2, -229827367 * $r9.position, true, null);
                }
                log.add($i0, i, i2, i3, $r12, $r6, parent[$i4], parent[$i9], $l15, $i11);
                if ($r9.root) {
                    if ($i4 == 0) {
                        $r8 = AstNode.value[$i0][i];
                        $r8[i2] = $r8[i2] | -1815192993;
                        $r8 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r8[$i3] = $r8[$i3] | 1170;
                    } else if (1 == $i4) {
                        $r8 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r8[$i3] = $r8[$i3] | 1170;
                        $r8 = AstNode.value[$i0][i + 1];
                        $r8[i2] = $r8[i2] | 585;
                    } else if (2 == $i4) {
                        $r8 = AstNode.value[$i0][i + 1];
                        $r8[i2] = $r8[i2] | 585;
                        $r8 = AstNode.value[$i0][i];
                        $r8[i2] = $r8[i2] | 1170;
                    } else if ($i4 == 3) {
                        $r8 = AstNode.value[$i0][i];
                        $r8[i2] = $r8[i2] | 868858240;
                        $r8 = AstNode.value[$i0][i];
                        $r8[i2] = $r8[i2] | 585;
                    }
                }
                if (!($r9.count * -1655214851 == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r9.index, 1795835677);
                }
                if ($r9.buf * 1377247638 != 16) {
                    log.set($i0, i, i2, $r9.buf * 406850907);
                }
            } else if (3 == $i5) {
                if (-1 == 1958230057 * $r9.position && $r9.size == null) {
                    $r6 = $r9.add(3, $i4, $r11, $i7, i3, $i13, (short) -704);
                } else {
                    $r6 = attributeList;
                    attributeList = new AttributeList($i3, 3, $i4, $i0, i, i2, -229827367 * $r9.position, true, null);
                }
                log.add($i0, i, i2, i3, $r6, null, $assertionsDisabled[$i4], 0, $l15, $i11);
                if ($r9.$assertionsDisabled) {
                    if ($i4 == 0) {
                        Server.value[$i0][i][i2 + 1] = (byte) 50;
                    } else if ($i4 == 1) {
                        Server.value[$i0][i + 1][i2 + 1] = (byte) (byte) 38;
                    } else if ($i4 == 2) {
                        Server.value[$i0][i + 1][i2] = (byte) (byte) -90;
                    } else if ($i4 == 3) {
                        Server.value[$i0][i][i2] = (byte) (byte) 117;
                    }
                }
                if (!(-327980710 * $r9.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r9.index, 1259896869);
                }
            } else if (9 == $i5) {
                $r6 = (-1 == $r9.position * -229827367 && $r9.size == null) ? $r9.add($i5, $i4, $r11, $i7, i3, $i13, (short) 3299) : new AttributeList($i3, $i5, $i4, $i0, i, i2, 927206951 * $r9.position, true, null);
                log.add($i0, i, i2, i3, 1, 1, $r6, 0, $l15, $i11);
                if (!(1589414649 * $r9.count == 0 || context == null)) {
                    context.toString(i, i2, $i12, $i9, $r9.index, 2143605594);
                }
                if ($r9.buf * 1681090481 != 16) {
                    log.set($i0, i, i2, $r9.buf * -450175983);
                }
            } else if ($i5 == 4) {
                if (-1 == 238482874 * $r9.position && $r9.size == null) {
                    $r6 = $r9.add(4, $i4, $r11, $i7, i3, $i13, (short) -20789);
                } else {
                    $r6 = attributeList;
                    attributeList = new AttributeList($i3, 4, $i4, $i0, i, i2, 1411155488 * $r9.position, true, null);
                }
                log.add($i0, i, i2, i3, $r6, null, parent[$i4], 0, 0, 0, $l15, $i11);
            } else if (5 == $i5) {
                $l8 = log.append($i0, i, i2);
                $i5 = 0 != $l8 ? BigInteger.get(Method.get($l8), 1426643672).buf * -331080303 : 16;
                if (-1 == $r9.position * 1971667688 && $r9.size == null) {
                    $r6 = $r9.add(4, $i4, $r11, $i7, i3, $i13, (short) 6066);
                } else {
                    $r6 = attributeList;
                    attributeList = new AttributeList($i3, 4, $i4, $i0, i, i2, -392699332 * $r9.position, true, null);
                }
                log.add($i0, i, i2, i3, $r6, null, parent[$i4], 0, text[$i4] * $i5, $i5 * f41p[$i4], $l15, $i11);
            } else if ($i5 == 6) {
                $l8 = log.append($i0, i, i2);
                $i5 = 0 != $l8 ? (BigInteger.get(Method.get($l8), 2123486320).buf * 1681090481) / 2 : 8;
                if ($r9.position * -1859782173 == -1 && $r9.size == null) {
                    $r6 = $r9.add(4, $i4 + 4, $r11, $i7, i3, $i13, (short) 2731);
                } else {
                    $r6 = $i7;
                    $i7 = new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r9.position * -988731977, true, null);
                }
                log.add($i0, i, i2, i3, $r6, null, 256, $i4, f42r[$i4] * $i5, $i5 * buf[$i4], $l15, $i11);
            } else if (7 == $i5) {
                $i4 = ($i4 + 2) & 3;
                if (-1 == $r9.position * -229827367 && $r9.size == null) {
                    $r6 = $r9.add(4, $i4 + 4, $r11, $i7, i3, $i13, (short) 8665);
                } else {
                    $r6 = $i7;
                    $i7 = new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r9.position * 2022340154, true, null);
                }
                log.add($i0, i, i2, i3, $r6, null, 256, $i4, 0, 0, $l15, $i11);
            } else if ($i5 == 8) {
                $l8 = log.append($i0, i, i2);
                $i5 = $l8 != 0 ? (BigInteger.get(Method.get($l8), 1353768376).buf * 56534561) / 2 : 8;
                $i9 = ($i4 + 2) & 3;
                if ($r9.position * -229827367 == -1 && $r9.size == null) {
                    $r6 = $r9.add(4, $i4 + 4, $r11, $i7, i3, $i13, (short) -9414);
                    $r12 = $r9.add(4, $i9 + 4, $r11, $i7, i3, $i13, (short) 15384);
                } else {
                    $r6 = $i7;
                    $i7 = new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r9.position * 2110888349, true, null);
                    $r12 = $i7;
                    $i7 = new AttributeList($i3, 4, $i9 + 4, $i0, i, i2, $r9.position * -1549704167, true, null);
                }
                log.add($i0, i, i2, i3, $r6, $r12, 544134426, $i4, f42r[$i4] * $i5, $i5 * buf[$i4], $l15, $i11);
            }
        }
    }

    static void clear() {
        position = null;
        Primitive.name = null;
        ScrollingTextView.value = null;
        Dialog.index = null;
        AstNode.value = null;
        Server.value = null;
        max = null;
        Primitive.value = null;
        index = null;
        Namespace.value = null;
        next = null;
        value = null;
    }

    static final int convert(int i, int i2) {
        i = ((int) (((double) (((Cell.create(45365 + i, 91923 + i2, 4, 574644951) - 128) + ((Cell.create(i + 10294, 37821 + i2, 2, -1896318885) - 128) >> 1)) + ((Cell.create(i, i2, 1, -2027531729) - 128) >> 2))) * 0.3d)) + 35;
        return i < 10 ? 10 : i > 60 ? 60 : i;
    }

    static final int create(int $i0, int $i1, int i) {
        int $i3 = $i0 / i;
        $i0 = (i - 1) & $i0;
        int $i4 = $i1 / i;
        return Transaction.get(Transaction.get(Rect.toString($i3, $i4, (byte) 64), Rect.toString($i3 + 1, $i4, (byte) 64), $i0, i, 473109379), Transaction.get(Rect.toString($i3, $i4 + 1, (byte) 64), Rect.toString($i3 + 1, $i4 + 1, (byte) 64), $i0, i, 679446887), (i - 1) & $i1, i, -1857790767);
    }

    static final int createLayout(int $i0, int $i1, int i) {
        int $i3 = $i0 / i;
        $i0 = (i - 1) & $i0;
        int $i4 = $i1 / i;
        return Transaction.get(Transaction.get(Rect.toString($i3, $i4, (byte) 64), Rect.toString($i3 + 1, $i4, (byte) 64), $i0, i, -986229830), Transaction.get(Rect.toString($i3, $i4 + 1, (byte) 64), Rect.toString($i3 + 1, $i4 + 1, (byte) 64), $i0, i, -1626398905), (i - 1) & $i1, i, -2003857058);
    }

    static final int decode(int i, int i2) {
        int $i2 = 126;
        if (i == -1) {
            return 12345678;
        }
        i2 = ((i & 127) * i2) / Constants.f93X;
        if (i2 < 2) {
            $i2 = 2;
        } else if (i2 <= 126) {
            $i2 = i2;
        }
        return $i2 + (65408 & i);
    }

    static final int decode(int i, int $i1, int i2) {
        int $i3 = i2 > 179 ? $i1 / 2 : $i1;
        if (i2 > 192) {
            $i3 /= 2;
        }
        if (i2 > 217) {
            $i3 /= 2;
        }
        if (i2 > 243) {
            $i3 /= 2;
        }
        return ((($i3 / 32) << 7) + ((i / 4) << 10)) + (i2 / 2);
    }

    static final int decryptBlock(int i, int $i1) {
        int $i2 = 2;
        if (i == -2) {
            return 12345678;
        }
        if (-1 == i) {
            return $i1 >= 2 ? $i1 > 126 ? 126 : $i1 : 2;
        } else {
            $i1 = ((i & 127) * $i1) / Constants.f93X;
            if ($i1 >= 2) {
                $i2 = $i1 > 126 ? -83668245 : $i1;
            }
            return $i2 + (65408 & i);
        }
    }

    static final int dilate(int i, int i2, int i3, int i4) {
        i3 = (PingManager.STATE_SENSOR_ON_FLAG - Point.f198y[(i3 * 1024) / i4]) >> 1;
        return (((PingManager.STATE_SENSOR_ON_FLAG - i3) * i) >> 16) + ((i3 * i2) >> 16);
    }

    static final int encode(int $i0, int $i1) {
        int $i2 = 2;
        if ($i0 == 693148850) {
            return 12345678;
        }
        if (-1 == $i0) {
            return $i1 < 2 ? 2 : $i1 > 1298950862 ? 126 : $i1;
        } else {
            $i1 = ((-1901171287 & $i0) * $i1) / Constants.f93X;
            if ($i1 >= 2) {
                $i2 = $i1 > 126 ? -1734667423 : $i1;
            }
            return $i2 + (-445457717 & $i0);
        }
    }

    static final int encryptBlock(int i, int i2) {
        int $i2 = 2;
        if (i == -1) {
            return 12345678;
        }
        i2 = ((i & 127) * i2) / Constants.f93X;
        if (i2 >= 2) {
            $i2 = i2 > 126 ? 126 : i2;
        }
        return $i2 + (65408 & i);
    }

    static final int get(int i, int i2, int i3, int i4) {
        i4 = 256 - i3;
        return ((((i4 * (65280 & i)) + ((i2 & 65280) * i3)) & 16711680) + ((((i & 16711935) * i4) + ((16711935 & i2) * i3)) & -16711936)) >> 8;
    }

    static int getOrientation(int $i2, int i, int i2) {
        if ((size[$i2][i][i2] & (byte) 8) != (byte) 0) {
            return 0;
        }
        if ($i2 > 0 && (size[1][i][i2] & (byte) 2) != (byte) 0) {
            $i2--;
        }
        return $i2;
    }

    static final int init(int i, int i2) {
        i = ((int) (((double) (((Cell.create(1152167161 + i, 96081784 + i2, 4, -1810568322) - 128) + ((Cell.create(i + 10294, 37821 + i2, 2, 1825913396) - 128) >> 1)) + ((Cell.create(i, i2, 1, 1355042925) - 128) >> 2))) * 0.3d)) - 587322253;
        return i < 10 ? 10 : i <= 60 ? i : 60;
    }

    static void init() {
        count = 1071674573;
        position = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 1427400700, DiskLruCache.AppCompatTheme_editTextStyle});
        Primitive.name = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, -1890448200});
        ScrollingTextView.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 1185523638, DiskLruCache.AppCompatTheme_editTextStyle});
        Dialog.index = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        AstNode.value = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
        Server.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 416595581, -1575978992});
        max = (int[][]) Array.newInstance(Integer.TYPE, new int[]{570785521, Thread.Theme_radioButtonStyle});
        Primitive.value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        index = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        Namespace.value = new int[721482568];
        next = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
    }

    static final void init(int i, int i2, int i3, int i4) {
        int $i4 = i2;
        while ($i4 <= i4 + i2) {
            int $i5 = i;
            while ($i5 <= i + i3) {
                if ($i5 >= 0 && $i5 < -448424237 && $i4 >= 0 && $i4 < -2079011341) {
                    Server.value[0][$i5][$i4] = (byte) 106685435;
                    if ($i5 == i && $i5 > 0) {
                        length[0][$i5][$i4] = length[0][$i5 - 1][$i4];
                    }
                    if ($i5 == i3 + i && $i5 < -693115694) {
                        length[0][$i5][$i4] = length[0][$i5 + 1][$i4];
                    }
                    if ($i4 == i2 && $i4 > 0) {
                        length[0][$i5][$i4] = length[0][$i5][$i4 - 1];
                    }
                    if (i2 + i4 == $i4 && $i4 < -1781903967) {
                        length[0][$i5][$i4] = length[0][$i5][$i4 + 1];
                    }
                }
                $i5++;
            }
            $i4++;
        }
    }

    static final void init(int i, int $i1, int i2, int i3, int i4, int $i5, int i5, Log log, Context context) {
        int $i9;
        int i6;
        int i7;
        int $i7;
        int $i12;
        int $i13;
        Transaction $r2 = BigInteger.get(i4, 1690814605);
        if (1 == $i5 || 3 == $i5) {
            $i9 = $r2.this$0 * 1509011489;
            i6 = $r2.offset * 1345020446;
        } else {
            $i9 = $r2.offset * -1416663780;
            i6 = $r2.this$0 * -265754695;
        }
        if (i6 + i2 <= 104) {
            i7 = ((i6 + 1) >> 1) + i2;
            $i7 = i2 + (i6 >> 1);
        } else {
            i7 = i2 + 1;
            $i7 = i2;
        }
        if ($i9 + i3 <= DiskLruCache.AppCompatTheme_editTextStyle) {
            $i12 = ($i9 >> 1) + i3;
            $i13 = (($i9 + 1) >> 1) + i3;
        } else {
            $i13 = i3 + 1;
            $i12 = i3;
        }
        int[][] $r4 = length[$i1];
        int $i72 = $r4[$i7][$i13] + ($r4[i7][$i12] + $r4[$i7][$i12]);
        $i7 = $i72;
        $i7 = ($i72 + $r4[i7][$i13]) >> 2;
        int $i11 = (i6 << 6) + (i2 << 7);
        $i12 = ($i9 << 6) + (i3 << 7);
        long $l15 = Exception.format(i2, i3, 2, $r2.value * -1193025245 == 0, i4, 474309517);
        i7 = ($i5 << 6) + i5;
        if (-1397635736 * $r2.list == 1) {
            i7 += 256;
        }
        ArrayMap $r7;
        if (i5 == 22) {
            $r7 = (-1 == -229827367 * $r2.position && $r2.size == null) ? $r2.add(22, $i5, $r4, $i11, $i7, $i12, 2002218439) : new AttributeList(i4, 22, $i5, $i1, i2, i3, -229827367 * $r2.position, true, null);
            log.set(i, i2, i3, $i7, $r7, $l15, i7);
            if ($r2.count * -1655214851 == 1) {
                context.add(i2, i3, (byte) 100);
            }
        } else if (i5 == 10 || i5 == 11) {
            $r7 = ($r2.position * 1361940890 == -1 && $r2.size == null) ? $r2.add(10, $i5, $r4, $i11, $i7, $i12, 207078761) : new AttributeList(i4, 10, $i5, $i1, i2, i3, $r2.position * -229827367, true, null);
            if ($r7 != null) {
                log.add(i, i2, i3, $i7, i6, $i9, $r7, 11 == i5 ? 1091087294 : 0, $l15, i7);
            }
            if (-1655214851 * $r2.count != 0) {
                context.toString(i2, i3, i6, $i9, $r2.index, 1768441984);
            }
        } else if (i5 >= 12) {
            $r7 = (-229827367 * $r2.position == -1 && $r2.size == null) ? $r2.add(i5, $i5, $r4, $i11, $i7, $i12, 173554424) : new AttributeList(i4, i5, $i5, $i1, i2, i3, $r2.position * -229827367, true, null);
            log.add(i, i2, i3, $i7, 1, 1, $r7, 0, $l15, i7);
            if ($r2.count * 1292285931 != 0) {
                context.toString(i2, i3, i6, $i9, $r2.index, 1924336998);
            }
        } else if (i5 == 0) {
            $r7 = (-1 == $r2.position * 284118939 && $r2.size == null) ? $r2.add(0, $i5, $r4, $i11, $i7, $i12, 428975085) : new AttributeList(i4, 0, $i5, $i1, i2, i3, $r2.position * -229827367, true, null);
            log.add(i, i2, i3, $i7, $r7, null, parent[$i5], 0, $l15, i7);
            if ($r2.count * -1655214851 != 0) {
                context.get(i2, i3, i5, $i5, $r2.index, 1167891228);
            }
        } else if (i5 == 1) {
            $r7 = ($r2.position * -229827367 == -1 && $r2.size == null) ? $r2.add(1, $i5, $r4, $i11, $i7, $i12, 600244621) : new AttributeList(i4, 1, $i5, $i1, i2, i3, 252911260 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, $assertionsDisabled[$i5], 0, $l15, i7);
            if ($r2.count * -369801199 != 0) {
                context.get(i2, i3, i5, $i5, $r2.index, 1171538984);
            }
        } else if (2 == i5) {
            $i9 = ($i5 + 1) & 3;
            if (-1 == $r2.position * 624728598 && $r2.size == null) {
                ArrayMap $r6 = $r2.add(2, $i5 + 4, $r4, $i11, $i7, $i12, 1720800980);
                $r7 = $r2.add(2, $i9, $r4, $i11, $i7, $i12, 945313337);
                $r10 = $r6;
            } else {
                ArrayMap attributeList = new AttributeList(i4, 2, $i5 + 4, $i1, i2, i3, -229827367 * $r2.position, true, null);
                $r7 = new AttributeList(i4, 2, $i9, $i1, i2, i3, -229827367 * $r2.position, true, null);
                $r10 = attributeList;
            }
            log.add(i, i2, i3, $i7, $r10, $r7, parent[$i5], parent[$i9], $l15, i7);
            if (-545916197 * $r2.count != 0) {
                context.get(i2, i3, i5, $i5, $r2.index, 1814005802);
            }
        } else if (i5 == 3) {
            $r7 = ($r2.position * -229827367 == -1 && $r2.size == null) ? $r2.add(3, $i5, $r4, $i11, $i7, $i12, 1510122550) : new AttributeList(i4, 3, $i5, $i1, i2, i3, $r2.position * -80757257, true, null);
            log.add(i, i2, i3, $i7, $r7, null, $assertionsDisabled[$i5], 0, $l15, i7);
            if ($r2.count * -1655214851 != 0) {
                context.get(i2, i3, i5, $i5, $r2.index, 1620216848);
            }
        } else if (i5 == 9) {
            $r7 = (-1 == $r2.position * -310691050 && $r2.size == null) ? $r2.add(i5, $i5, $r4, $i11, $i7, $i12, 1365848323) : new AttributeList(i4, i5, $i5, $i1, i2, i3, -229827367 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, 1, 1, $r7, 0, $l15, i7);
            if ($r2.count * -279530045 != 0) {
                context.toString(i2, i3, i6, $i9, $r2.index, 1764151223);
            }
        } else if (i5 == 4) {
            $r7 = ($r2.position * -1022674983 == -1 && $r2.size == null) ? $r2.add(4, $i5, $r4, $i11, $i7, $i12, 688543335) : new AttributeList(i4, 4, $i5, $i1, i2, i3, -229827367 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, parent[$i5], 0, 0, 0, $l15, i7);
        } else if (i5 == 5) {
            $l16 = log.append(i, i2, i3);
            i5 = 0 != $l16 ? BigInteger.get(Method.get($l16), 1590863929).buf * 1681090481 : 16;
            $r7 = (-229827367 * $r2.position == -1 && $r2.size == null) ? $r2.add(4, $i5, $r4, $i11, $i7, $i12, 985539626) : new AttributeList(i4, 4, $i5, $i1, i2, i3, -2138601133 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, parent[$i5], 0, text[$i5] * i5, f41p[$i5] * i5, $l15, i7);
        } else if (6 == i5) {
            $l16 = log.append(i, i2, i3);
            i5 = 0 != $l16 ? (BigInteger.get(Method.get($l16), 1757633920).buf * -1101374621) / 2 : 8;
            $r7 = ($r2.position * -824157906 == -1 && $r2.size == null) ? $r2.add(4, $i5 + 4, $r4, $i11, $i7, $i12, 1569461934) : new AttributeList(i4, 4, $i5 + 4, $i1, i2, i3, 814981842 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, 256, $i5, f42r[$i5] * i5, buf[$i5] * i5, $l15, i7);
        } else if (7 == i5) {
            $i5 = ($i5 + 2) & 3;
            $r7 = (-1 == -229827367 * $r2.position && $r2.size == null) ? $r2.add(4, $i5 + 4, $r4, $i11, $i7, $i12, 1737528679) : new AttributeList(i4, 4, $i5 + 4, $i1, i2, i3, -229827367 * $r2.position, true, null);
            log.add(i, i2, i3, $i7, $r7, null, 1831583520, $i5, 0, 0, $l15, i7);
        } else if (i5 == 8) {
            $l16 = log.append(i, i2, i3);
            i5 = 0 != $l16 ? (BigInteger.get(Method.get($l16), 1786023011).buf * 170280286) / 2 : 8;
            $i9 = ($i5 + 2) & 3;
            if ($r2.position * -229827367 == -1 && $r2.size == null) {
                $r10 = $r2.add(4, $i5 + 4, $r4, $i11, $i7, $i12, 925576970);
                $r7 = $r2.add(4, $i9 + 4, $r4, $i11, $i7, $i12, 529996566);
            } else {
                $i72 = new AttributeList(i4, 4, $i5 + 4, $i1, i2, i3, $r2.position * -1464955644, true, null);
                $r7 = new AttributeList(i4, 4, $i9 + 4, $i1, i2, i3, $r2.position * -229827367, true, null);
                $r10 = $i72;
            }
            log.add(i, i2, i3, $i7, $r10, $r7, -1050063140, $i5, f42r[$i5] * i5, i5 * buf[$i5], $l15, i7);
        }
    }

    static final void init(int $i0, int i, int i2, int $i3, int $i4, int $i5, Log log, Context context) {
        if (!client.LOG || (size[0][i][i2] & 2) != (byte) 0 || (size[$i0][i][i2] & 16) == (byte) 0) {
            int $i9;
            int i3;
            int $i8;
            int i4;
            int $i12;
            int $i13;
            if ($i0 < count * 2025245167) {
                count = -726694641 * $i0;
            }
            Transaction $r7 = BigInteger.get($i3, 1721535871);
            if ($i4 == 1 || $i4 == 3) {
                $i9 = $r7.this$0 * -265754695;
                i3 = $r7.offset * -344743753;
            } else {
                $i9 = -344743753 * $r7.offset;
                i3 = -265754695 * $r7.this$0;
            }
            if (i3 + i <= 104) {
                $i8 = (i3 >> 1) + i;
                i4 = ((i3 + 1) >> 1) + i;
            } else {
                i4 = i + 1;
                $i8 = i;
            }
            if ($i9 + i2 <= 104) {
                $i12 = i2 + ($i9 >> 1);
                $i13 = (($i9 + 1) >> 1) + i2;
            } else {
                $i13 = i2 + 1;
                $i12 = i2;
            }
            int[][] $r9 = length[$i0];
            i4 = (($r9[$i8][$i13] + ($r9[$i8][$i12] + $r9[i4][$i12])) + $r9[i4][$i13]) >> 2;
            int $i11 = (i3 << 6) + (i << 7);
            $i12 = (i2 << 7) + ($i9 << 6);
            long $l14 = Exception.format(i, i2, 2, $r7.value * -1193025245 == 0, $i3, 995026628);
            $i8 = $i5 + ($i4 << 6);
            if (1 == 29042685 * $r7.list) {
                $i8 += 256;
            }
            if ($r7.get((byte) 95)) {
                Dictionary.add($i0, i, i2, $r7, $i4, -560420376);
            }
            ArrayMap $r6;
            if (22 == $i5) {
                if (!client.LOG || -1193025245 * $r7.value != 0 || 1 == -1655214851 * $r7.count || $r7.end) {
                    $r6 = (-1 == $r7.position * -229827367 && $r7.size == null) ? $r7.add(22, $i4, $r9, $i11, i4, $i12, (short) 4185) : new AttributeList($i3, 22, $i4, $i0, i, i2, -229827367 * $r7.position, true, null);
                    log.set($i0, i, i2, i4, $r6, $l14, $i8);
                    if (1 == -1655214851 * $r7.count && context != null) {
                        context.add(i, i2, (byte) 92);
                    }
                }
            } else if ($i5 == 10 || 11 == $i5) {
                $r6 = (-1 == $r7.position * -229827367 && $r7.size == null) ? $r7.add(10, $i4, $r9, $i11, i4, $i12, (short) -2818) : new AttributeList($i3, 10, $i4, $i0, i, i2, $r7.position * -229827367, true, null);
                if ($r6 != null) {
                    if (log.add($i0, i, i2, i4, i3, $i9, $r6, (int) $i5 == 11 ? (short) 256 : (short) 0, $l14, $i8) && $r7.$assertionsDisabled) {
                        byte $i32 = (byte) 15;
                        if ($r6 instanceof Integer) {
                            $i32 = ((Integer) $r6).getDimension() / 4;
                            if ($i32 > (byte) 30) {
                                $i32 = (byte) 30;
                            }
                        }
                        for ($i5 = 0; $i5 <= i3; $i5++) {
                            for ($i4 = 0; $i4 <= $i9; $i4++) {
                                if ($i32 > Server.value[$i0][$i5 + i][$i4 + i2]) {
                                    Server.value[$i0][$i5 + i][$i4 + i2] = (byte) $i32;
                                }
                            }
                        }
                    }
                }
                if (!($r7.count * -1655214851 == 0 || context == null)) {
                    context.toString(i, i2, i3, $i9, $r7.index, 2062824710);
                }
            } else if ($i5 >= 12) {
                $r6 = (-1 == -229827367 * $r7.position && $r7.size == null) ? $r7.add($i5, $i4, $r9, $i11, i4, $i12, (short) -22752) : new AttributeList($i3, $i5, $i4, $i0, i, i2, $r7.position * -229827367, true, null);
                log.add($i0, i, i2, i4, 1, 1, $r6, 0, $l14, $i8);
                if ($i5 >= 12 && $i5 <= 17 && $i5 != 13 && $i0 > 0) {
                    $r10 = AstNode.value[$i0][i];
                    $r10[i2] = $r10[i2] | 2340;
                }
                if (!(-1655214851 * $r7.count == 0 || context == null)) {
                    context.toString(i, i2, i3, $i9, $r7.index, 1969706582);
                }
            } else if ($i5 == 0) {
                $r6 = ($r7.position * -229827367 == -1 && $r7.size == null) ? $r7.add(0, $i4, $r9, $i11, i4, $i12, (short) -28415) : new AttributeList($i3, 0, $i4, $i0, i, i2, -229827367 * $r7.position, true, null);
                log.add($i0, i, i2, i4, $r6, null, parent[$i4], 0, $l14, $i8);
                if ($i4 == 0) {
                    if ($r7.$assertionsDisabled) {
                        Server.value[$i0][i][i2] = (byte) 50;
                        Server.value[$i0][i][i2 + 1] = (byte) 50;
                    }
                    if ($r7.root) {
                        $r10 = AstNode.value[$i0][i];
                        $r10[i2] = $r10[i2] | 585;
                    }
                } else if ($i4 == 1) {
                    if ($r7.$assertionsDisabled) {
                        Server.value[$i0][i][i2 + 1] = (byte) 50;
                        Server.value[$i0][i + 1][i2 + 1] = (byte) 50;
                    }
                    if ($r7.root) {
                        $r10 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r10[$i3] = $r10[$i3] | 1170;
                    }
                } else if ($i4 == 2) {
                    if ($r7.$assertionsDisabled) {
                        Server.value[$i0][i + 1][i2] = (byte) 50;
                        Server.value[$i0][i + 1][i2 + 1] = (byte) 50;
                    }
                    if ($r7.root) {
                        $r10 = AstNode.value[$i0][i + 1];
                        $r10[i2] = $r10[i2] | 585;
                    }
                } else if ($i4 == 3) {
                    if ($r7.$assertionsDisabled) {
                        Server.value[$i0][i][i2] = (byte) 50;
                        Server.value[$i0][i + 1][i2] = (byte) 50;
                    }
                    if ($r7.root) {
                        $r10 = AstNode.value[$i0][i];
                        $r10[i2] = $r10[i2] | 1170;
                    }
                }
                if (!(-1655214851 * $r7.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r7.index, 2033540433);
                }
                if ($r7.buf * 1681090481 != 16) {
                    log.set($i0, i, i2, $r7.buf * 1681090481);
                }
            } else if ($i5 == 1) {
                $r6 = (-1 == $r7.position * -229827367 && $r7.size == null) ? $r7.add(1, $i4, $r9, $i11, i4, $i12, (short) 540) : new AttributeList($i3, 1, $i4, $i0, i, i2, -229827367 * $r7.position, true, null);
                log.add($i0, i, i2, i4, $r6, null, $assertionsDisabled[$i4], 0, $l14, $i8);
                if ($r7.$assertionsDisabled) {
                    if ($i4 == 0) {
                        Server.value[$i0][i][i2 + 1] = (byte) 50;
                    } else if ($i4 == 1) {
                        Server.value[$i0][i + 1][i2 + 1] = (byte) 50;
                    } else if ($i4 == 2) {
                        Server.value[$i0][i + 1][i2] = (byte) 50;
                    } else if (3 == $i4) {
                        Server.value[$i0][i][i2] = (byte) 50;
                    }
                }
                if (!(-1655214851 * $r7.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r7.index, 1828499743);
                }
            } else if ($i5 == 2) {
                $i9 = ($i4 + 1) & 3;
                if (-1 == -229827367 * $r7.position && $r7.size == null) {
                    $r6 = $r7.add(2, $i4 + 4, $r9, $i11, i4, $i12, (short) -6735);
                    $r11 = $r7.add(2, $i9, $r9, $i11, i4, $i12, (short) -8535);
                } else {
                    ArrayMap attributeList = new AttributeList($i3, 2, $i4 + 4, $i0, i, i2, -229827367 * $r7.position, true, null);
                    $r11 = new AttributeList($i3, 2, $i9, $i0, i, i2, -229827367 * $r7.position, true, null);
                    $r6 = attributeList;
                }
                log.add($i0, i, i2, i4, $r6, $r11, parent[$i4], parent[$i9], $l14, $i8);
                if ($r7.root) {
                    if ($i4 == 0) {
                        $r10 = AstNode.value[$i0][i];
                        $r10[i2] = $r10[i2] | 585;
                        $r10 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r10[$i3] = $r10[$i3] | 1170;
                    } else if (1 == $i4) {
                        $r10 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r10[$i3] = $r10[$i3] | 1170;
                        $r10 = AstNode.value[$i0][i + 1];
                        $r10[i2] = $r10[i2] | 585;
                    } else if (2 == $i4) {
                        $r10 = AstNode.value[$i0][i + 1];
                        $r10[i2] = $r10[i2] | 585;
                        $r10 = AstNode.value[$i0][i];
                        $r10[i2] = $r10[i2] | 1170;
                    } else if ($i4 == 3) {
                        $r10 = AstNode.value[$i0][i];
                        $r10[i2] = $r10[i2] | 1170;
                        $r10 = AstNode.value[$i0][i];
                        $r10[i2] = $r10[i2] | 585;
                    }
                }
                if (!($r7.count * -1655214851 == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r7.index, 2017663540);
                }
                if ($r7.buf * 1681090481 != 16) {
                    log.set($i0, i, i2, $r7.buf * 1681090481);
                }
            } else if (3 == $i5) {
                $r6 = (-1 == -229827367 * $r7.position && $r7.size == null) ? $r7.add(3, $i4, $r9, $i11, i4, $i12, (short) 1532) : new AttributeList($i3, 3, $i4, $i0, i, i2, -229827367 * $r7.position, true, null);
                log.add($i0, i, i2, i4, $r6, null, $assertionsDisabled[$i4], 0, $l14, $i8);
                if ($r7.$assertionsDisabled) {
                    if ($i4 == 0) {
                        Server.value[$i0][i][i2 + 1] = (byte) 50;
                    } else if ($i4 == 1) {
                        Server.value[$i0][i + 1][i2 + 1] = (byte) 50;
                    } else if ($i4 == 2) {
                        Server.value[$i0][i + 1][i2] = (byte) 50;
                    } else if ($i4 == 3) {
                        Server.value[$i0][i][i2] = (byte) 50;
                    }
                }
                if (!(-1655214851 * $r7.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r7.index, 1647747944);
                }
            } else if (9 == $i5) {
                $r6 = (-1 == $r7.position * -229827367 && $r7.size == null) ? $r7.add($i5, $i4, $r9, $i11, i4, $i12, (short) 5287) : new AttributeList($i3, $i5, $i4, $i0, i, i2, -229827367 * $r7.position, true, null);
                log.add($i0, i, i2, i4, 1, 1, $r6, 0, $l14, $i8);
                if (!(-1655214851 * $r7.count == 0 || context == null)) {
                    context.toString(i, i2, i3, $i9, $r7.index, 1947904294);
                }
                if ($r7.buf * 1681090481 != 16) {
                    log.set($i0, i, i2, 1681090481 * $r7.buf);
                }
            } else if ($i5 == 4) {
                $r6 = (-1 == -229827367 * $r7.position && $r7.size == null) ? $r7.add(4, $i4, $r9, $i11, i4, $i12, (short) -12287) : new AttributeList($i3, 4, $i4, $i0, i, i2, -229827367 * $r7.position, true, null);
                log.add($i0, i, i2, i4, $r6, null, parent[$i4], 0, 0, 0, $l14, $i8);
            } else if (5 == $i5) {
                $l16 = log.append($i0, i, i2);
                $i5 = 0 != $l16 ? BigInteger.get(Method.get($l16), 1613122935).buf * 1681090481 : 16;
                $r6 = (-1 == $r7.position * -229827367 && $r7.size == null) ? $r7.add(4, $i4, $r9, $i11, i4, $i12, (short) 6969) : new AttributeList($i3, 4, $i4, $i0, i, i2, -229827367 * $r7.position, true, null);
                log.add($i0, i, i2, i4, $r6, null, parent[$i4], 0, text[$i4] * $i5, $i5 * f41p[$i4], $l14, $i8);
            } else if ($i5 == 6) {
                $l16 = log.append($i0, i, i2);
                $i5 = 0 != $l16 ? (BigInteger.get(Method.get($l16), 1508663371).buf * 1681090481) / 2 : 8;
                $r6 = ($r7.position * -229827367 == -1 && $r7.size == null) ? $r7.add(4, $i4 + 4, $r9, $i11, i4, $i12, (short) -3972) : new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r7.position * -229827367, true, null);
                log.add($i0, i, i2, i4, $r6, null, 256, $i4, f42r[$i4] * $i5, $i5 * buf[$i4], $l14, $i8);
            } else if (7 == $i5) {
                $i4 = ($i4 + 2) & 3;
                $r6 = (-1 == $r7.position * -229827367 && $r7.size == null) ? $r7.add(4, $i4 + 4, $r9, $i11, i4, $i12, (short) -7094) : new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r7.position * -229827367, true, null);
                log.add($i0, i, i2, i4, $r6, null, 256, $i4, 0, 0, $l14, $i8);
            } else if ($i5 == 8) {
                $l16 = log.append($i0, i, i2);
                $i5 = $l16 != 0 ? (BigInteger.get(Method.get($l16), 1102496165).buf * 1681090481) / 2 : 8;
                $i9 = ($i4 + 2) & 3;
                if ($r7.position * -229827367 == -1 && $r7.size == null) {
                    $r6 = $r7.add(4, $i4 + 4, $r9, $i11, i4, $i12, (short) -9800);
                    $r11 = $r7.add(4, $i9 + 4, $r9, $i11, i4, $i12, (short) 20180);
                } else {
                    int $i10 = new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r7.position * -229827367, true, null);
                    $r11 = new AttributeList($i3, 4, $i9 + 4, $i0, i, i2, $r7.position * -229827367, true, null);
                    $r6 = $i10;
                }
                log.add($i0, i, i2, i4, $r6, $r11, 256, $i4, f42r[$i4] * $i5, $i5 * buf[$i4], $l14, $i8);
            }
        }
    }

    static final int jjMoveNfa_5(int $i0, int $i1) {
        $i0 = ($i1 * 57) + $i0;
        $i0 ^= $i0 << 13;
        return (((($i0 * (789221 + (($i0 * $i0) * 15731))) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }

    static final int keyTyped(int i, int i2) {
        int $i2 = 2;
        if (i == -1) {
            return 992430029;
        }
        i2 = ((i & 127) * i2) / Constants.f93X;
        if (i2 >= 2) {
            $i2 = i2 > -588886528 ? 957139292 : i2;
        }
        return $i2 + (65408 & i);
    }

    static final int loadTexture(int $i0, int $i1, int i) {
        int $i3 = $i0 / i;
        $i0 = (i - 1) & $i0;
        int $i4 = $i1 / i;
        return Transaction.get(Transaction.get(Rect.toString($i3, $i4, (byte) 64), Rect.toString($i3 + 1, $i4, (byte) 64), $i0, i, 158892495), Transaction.get(Rect.toString($i3, $i4 + 1, (byte) 64), Rect.toString($i3 + 1, $i4 + 1, (byte) 64), $i0, i, -3870421), (i - 1) & $i1, i, -1029385219);
    }

    static final int makeMove(int $i0, int $i1) {
        $i0 = ($i1 * 57) + $i0;
        $i0 ^= $i0 << 13;
        return (((($i0 * (789221 + (($i0 * $i0) * 15731))) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }

    static int parse(int $i0, CharSequence charSequence, boolean z, int i) {
        int[] $r1;
        if ($i0 == 6500) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            try {
                $r1[($i0 * 537618701) - 1] = Msg.get(-1679128282) ? (byte) 1 : (byte) 0;
                return 1;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "gu.ax(" + ')');
            }
        } else if ($i0 == 6501) {
            $r10 = AbstractBuffer.read(-466310398);
            if ($r10 != null) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = -756728079 * $r10.length;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 259969383 * $r10.index;
                $r7 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r7[($i0 * -1267697097) - 1] = $r10.name;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r10.log * 1116252417;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r10.value * -1545862613;
                $r7 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r7[($i0 * -1267697097) - 1] = $r10.buffer;
                return 1;
            }
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = -1;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = "";
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (6502 == $i0) {
            $r10 = ByteString.read(2140310928);
            if ($r10 != null) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = -756728079 * $r10.length;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r10.index * 259969383;
                $r7 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r7[($i0 * -1267697097) - 1] = $r10.name;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r10.log * 1116252417;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r10.value * -1545862613;
                $r7 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r7[($i0 * -1267697097) - 1] = $r10.buffer;
                return 1;
            }
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = -1;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = "";
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (6506 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            i = $r1[$i0 * 537618701];
            ByteBuffer $r12 = null;
            for ($i0 = 0; $i0 < ByteBuffer.size * 443593871; $i0++) {
                if (i == -756728079 * Short.value[$i0].length) {
                    $r12 = Short.value[$i0];
                    break;
                }
            }
            if ($r12 != null) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = -756728079 * $r12.length;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 259969383 * $r12.index;
                $r7 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r7[($i0 * -1267697097) - 1] = $r12.name;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 1116252417 * $r12.log;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = -1545862613 * $r12.value;
                $r7 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r7[($i0 * -1267697097) - 1] = $r12.buffer;
                return 1;
            }
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = -1;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = "";
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if ($i0 == 6507) {
            XMLParser.type -= -483248364;
            TreeInt.add(XMLParser.this$0[XMLParser.type * 537618701], 1 == XMLParser.this$0[(XMLParser.type * 537618701) + 1], XMLParser.this$0[(XMLParser.type * 537618701) + 2], 1 == XMLParser.this$0[(XMLParser.type * 537618701) + 3], 1191637273);
            return 1;
        } else if (6511 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            if ($i0 < 0 || $i0 >= ByteBuffer.size * 443593871) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = -1;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 0;
                $r7 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r7[($i0 * -1267697097) - 1] = "";
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 0;
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 0;
                $r7 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r7[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r10 = Short.value[$i0];
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = $r10.length * -756728079;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = 259969383 * $r10.index;
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = $r10.name;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = $r10.log * 1116252417;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = -1545862613 * $r10.value;
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r7[($i0 * -1267697097) - 1] = $r10.buffer;
            return 1;
        } else if (6512 == $i0) {
            Util $r16 = Settings.this$0;
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r16.add($r1[$i0 * 537618701] == 1, 900634172);
            return 1;
        } else if ($i0 == 6513) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r6 = PriorityQueue.add(i, (byte) 100);
            if ($r6.add(2084805987)) {
                $r7 = XMLParser.data;
                $i3 = XMLParser.value - 1246602361;
                XMLParser.value = $i3;
                $r7[($i3 * -1267697097) - 1] = Thread.add($i0, (byte) 18).toString(i, $r6.size, -2135449806);
                return 1;
            }
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $r1[($i3 * 537618701) - 1] = Thread.add($i0, (byte) 91).add(i, $r6.value * -54312713, (byte) -52);
            return 1;
        } else if ($i0 == 6514) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r6 = PriorityQueue.add(i, (byte) 107);
            if ($r6.add(2067424475)) {
                $r7 = XMLParser.data;
                $i3 = XMLParser.value - 1246602361;
                XMLParser.value = $i3;
                $r7[($i3 * -1267697097) - 1] = BigInteger.get($i0, 1713755953).get(i, $r6.size, (byte) -107);
                return 1;
            }
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $r1[($i3 * 537618701) - 1] = BigInteger.get($i0, 1342623986).add(i, $r6.value * -54312713, (byte) 21);
            return 1;
        } else if ($i0 == 6515) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r6 = PriorityQueue.add(i, (byte) 47);
            if ($r6.add(2114696735)) {
                $r7 = XMLParser.data;
                $i3 = XMLParser.value - 1246602361;
                XMLParser.value = $i3;
                $r7[($i3 * -1267697097) - 1] = Set.get($i0, 1324527805).write(i, $r6.size, 603027064);
                return 1;
            }
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $r1[($i3 * 537618701) - 1] = Set.get($i0, 1624271199).write(i, $r6.value * -54312713, 481295699);
            return 1;
        } else if ($i0 == 6516) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r6 = PriorityQueue.add(i, (byte) 17);
            if ($r6.add(2063730353)) {
                $r7 = XMLParser.data;
                $i3 = XMLParser.value - 1246602361;
                XMLParser.value = $i3;
                $r7[($i3 * -1267697097) - 1] = HttpConnection.create($i0, (byte) 7).get(i, $r6.size, 232518493);
                return 1;
            }
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $r1[($i3 * 537618701) - 1] = HttpConnection.create($i0, (byte) -5).set(i, $r6.value * -54312713, 405823657);
            return 1;
        } else if ($i0 == 6518) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = client.context.token ? (byte) 1 : (byte) 0;
            return 1;
        } else if ($i0 == 6520 || $i0 == 6522) {
            $r15 = client.context.getInstance(-1290553606).add(2, -1509700007);
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            $r15.add($r7[$i0 * -1267697097], (byte) -44);
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r15.add($r1[$i0 * 537618701], (byte) 121);
            $r15.append((byte) 2);
            return 1;
        } else if ($i0 == 6521) {
            client.context.getInstance(-1290553606).toString(2088641433);
            return 1;
        } else if ($i0 != 6523) {
            return 2;
        } else {
            $r15 = client.context.getInstance(-1290553606).add(1, 355236637);
            $r7 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            String $r4 = $r7[$i0 * -1267697097];
            $i0 = $r4.length();
            for (i = 0; i < $i0; i++) {
                if (!JGitText.get($r4.charAt(i), (byte) 5)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                $r15.add($r4, (byte) -114);
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $r15.add($r1[$i0 * 537618701], (byte) 4);
                $r15.append((byte) 2);
                return 1;
            }
            throw new IllegalArgumentException();
        }
    }

    static final void parse(int $i0, int i, int i2, int $i3, int $i4, int $i5, Log log, Context context) {
        if (!client.LOG || (size[0][i][i2] & 2) != (byte) 0 || (size[$i0][i][i2] & 16) == (byte) 0) {
            int $i8;
            int $i9;
            int $i12;
            int i3;
            int $i14;
            int $i10;
            if ($i0 < count * 902197376) {
                count = -2121951491 * $i0;
            }
            Transaction $r10 = BigInteger.get($i3, 1655883005);
            if ($i4 == 1 || $i4 == 3) {
                $i8 = $r10.this$0 * -265754695;
                $i9 = $r10.offset * -344743753;
            } else {
                $i8 = -45146602 * $r10.offset;
                $i9 = -265754695 * $r10.this$0;
            }
            if ($i9 + i <= -1722952238) {
                $i12 = ($i9 >> 1) + i;
                i3 = (($i9 + 1) >> 1) + i;
            } else {
                i3 = i + 1;
                $i12 = i;
            }
            if ($i8 + i2 <= 1536944007) {
                $i14 = i2 + ($i8 >> 1);
                $i10 = (($i8 + 1) >> 1) + i2;
            } else {
                $i10 = i2 + 1;
                $i14 = i2;
            }
            int[][] $r9 = length[$i0];
            i3 = (($r9[$i12][$i10] + ($r9[$i12][$i14] + $r9[i3][$i14])) + $r9[i3][$i10]) >> 2;
            int $i13 = ($i9 << 6) + (i << 7);
            $i14 = (i2 << 7) + ($i8 << 6);
            long $l11 = Exception.format(i, i2, 2, $r10.value * 607891367 == 0, $i3, -815357149);
            $i12 = $i5 + ($i4 << 6);
            if (1 == 1443471409 * $r10.list) {
                $i12 += 256;
            }
            if ($r10.get((byte) 77)) {
                Dictionary.add($i0, i, i2, $r10, $i4, -2080444377);
            }
            ArrayMap $r6;
            if (22 == $i5) {
                if (!client.LOG || -1193025245 * $r10.value != 0 || 1 == -1655214851 * $r10.count || $r10.end) {
                    $r6 = (-1 == $r10.position * -1371660664 && $r10.size == null) ? $r10.add(22, $i4, $r9, $i13, i3, $i14, (short) 13135) : new AttributeList($i3, 22, $i4, $i0, i, i2, -229827367 * $r10.position, true, null);
                    log.set($i0, i, i2, i3, $r6, $l11, $i12);
                    if (1 == -1655214851 * $r10.count && context != null) {
                        context.add(i, i2, (byte) 121);
                    }
                }
            } else if ($i5 == 10 || 11 == $i5) {
                $r6 = (-1 == $r10.position * -2034619984 && $r10.size == null) ? $r10.add(10, $i4, $r9, $i13, i3, $i14, (short) -7289) : new AttributeList($i3, 10, $i4, $i0, i, i2, $r10.position * 1782809877, true, null);
                if ($r6 != null) {
                    if (log.add($i0, i, i2, i3, $i9, $i8, $r6, $i5 == 11 ? -686157894 : 0, $l11, $i12) && $r10.$assertionsDisabled) {
                        byte $i32 = (byte) 15;
                        if ($r6 instanceof Integer) {
                            $i32 = ((Integer) $r6).getDimension() / 4;
                            if ($i32 > (byte) 30) {
                                $i32 = (byte) 30;
                            }
                        }
                        for ($i4 = 0; $i4 <= $i9; $i4++) {
                            for ($i5 = 0; $i5 <= $i8; $i5++) {
                                if ($i32 > Server.value[$i0][$i4 + i][$i5 + i2]) {
                                    Server.value[$i0][$i4 + i][$i5 + i2] = (byte) $i32;
                                }
                            }
                        }
                    }
                }
                if (!($r10.count * -1655214851 == 0 || context == null)) {
                    context.toString(i, i2, $i9, $i8, $r10.index, 2105361462);
                }
            } else if ($i5 >= 12) {
                $r6 = (-1 == -229827367 * $r10.position && $r10.size == null) ? $r10.add($i5, $i4, $r9, $i13, i3, $i14, (short) -12292) : new AttributeList($i3, $i5, $i4, $i0, i, i2, $r10.position * 1271929190, true, null);
                log.add($i0, i, i2, i3, 1, 1, $r6, 0, $l11, $i12);
                if ($i5 >= 12 && $i5 <= 17 && $i5 != 13 && $i0 > 0) {
                    $r5 = AstNode.value[$i0][i];
                    $r5[i2] = $r5[i2] | 579050996;
                }
                if (!(317468537 * $r10.count == 0 || context == null)) {
                    context.toString(i, i2, $i9, $i8, $r10.index, 2052152587);
                }
            } else if ($i5 == 0) {
                $r6 = ($r10.position * -229827367 == -1 && $r10.size == null) ? $r10.add(0, $i4, $r9, $i13, i3, $i14, (short) -11667) : new AttributeList($i3, 0, $i4, $i0, i, i2, -1124633186 * $r10.position, true, null);
                log.add($i0, i, i2, i3, $r6, null, parent[$i4], 0, $l11, $i12);
                if ($i4 == 0) {
                    if ($r10.$assertionsDisabled) {
                        Server.value[$i0][i][i2] = (byte) 50;
                        Server.value[$i0][i][i2 + 1] = (byte) (byte) -56;
                    }
                    if ($r10.root) {
                        $r5 = AstNode.value[$i0][i];
                        $r5[i2] = $r5[i2] | 1322425629;
                    }
                } else if ($i4 == 1) {
                    if ($r10.$assertionsDisabled) {
                        Server.value[$i0][i][i2 + 1] = (byte) (byte) 125;
                        Server.value[$i0][i + 1][i2 + 1] = (byte) (byte) 117;
                    }
                    if ($r10.root) {
                        $r5 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r5[$i3] = $r5[$i3] | 2139670023;
                    }
                } else if ($i4 == 2) {
                    if ($r10.$assertionsDisabled) {
                        Server.value[$i0][i + 1][i2] = (byte) (byte) -120;
                        Server.value[$i0][i + 1][i2 + 1] = (byte) 50;
                    }
                    if ($r10.root) {
                        $r5 = AstNode.value[$i0][i + 1];
                        $r5[i2] = $r5[i2] | 585;
                    }
                } else if ($i4 == 3) {
                    if ($r10.$assertionsDisabled) {
                        Server.value[$i0][i][i2] = (byte) (byte) -34;
                        Server.value[$i0][i + 1][i2] = (byte) 50;
                    }
                    if ($r10.root) {
                        $r5 = AstNode.value[$i0][i];
                        $r5[i2] = $r5[i2] | 1170;
                    }
                }
                if (!(-1655214851 * $r10.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r10.index, 1697946457);
                }
                if ($r10.buf * -824545359 != 16) {
                    log.set($i0, i, i2, $r10.buf * -561921283);
                }
            } else if ($i5 == 1) {
                $r6 = (-1 == $r10.position * -1254493801 && $r10.size == null) ? $r10.add(1, $i4, $r9, $i13, i3, $i14, (short) -15831) : new AttributeList($i3, 1, $i4, $i0, i, i2, -655480621 * $r10.position, true, null);
                log.add($i0, i, i2, i3, $r6, null, $assertionsDisabled[$i4], 0, $l11, $i12);
                if ($r10.$assertionsDisabled) {
                    if ($i4 == 0) {
                        Server.value[$i0][i][i2 + 1] = (byte) (byte) 117;
                    } else if ($i4 == 1) {
                        Server.value[$i0][i + 1][i2 + 1] = (byte) 50;
                    } else if ($i4 == 2) {
                        Server.value[$i0][i + 1][i2] = (byte) (byte) 17;
                    } else if (3 == $i4) {
                        Server.value[$i0][i][i2] = (byte) NativeUint8Array.serialVersionUID;
                    }
                }
                if (!(-1655214851 * $r10.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r10.index, 1952876771);
                }
            } else if ($i5 == (byte) 2) {
                $i8 = ($i4 + 1) & 3;
                if (-1 == -648896950 * $r10.position && $r10.size == null) {
                    $r6 = $r10.add(2, $i4 + 4, $r9, $i13, i3, $i14, (short) 3299);
                    $r7 = $r10.add(2, $i8, $r9, $i13, i3, $i14, (short) -5254);
                } else {
                    ArrayMap attributeList = new AttributeList($i3, 2, $i4 + 4, $i0, i, i2, -279421234 * $r10.position, true, null);
                    $r7 = new AttributeList($i3, 2, $i8, $i0, i, i2, -229827367 * $r10.position, true, null);
                    $r6 = attributeList;
                }
                log.add($i0, i, i2, i3, $r6, $r7, parent[$i4], parent[$i8], $l11, $i12);
                if ($r10.root) {
                    if ($i4 == 0) {
                        $r5 = AstNode.value[$i0][i];
                        $r5[i2] = $r5[i2] | 585;
                        $r5 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r5[$i3] = $r5[$i3] | 1170;
                    } else if (1 == $i4) {
                        $r5 = AstNode.value[$i0][i];
                        $i3 = i2 + 1;
                        $r5[$i3] = $r5[$i3] | 1170;
                        $r5 = AstNode.value[$i0][i + 1];
                        $r5[i2] = $r5[i2] | 585;
                    } else if (2 == $i4) {
                        $r5 = AstNode.value[$i0][i + 1];
                        $r5[i2] = $r5[i2] | 1297261861;
                        $r5 = AstNode.value[$i0][i];
                        $r5[i2] = $r5[i2] | 1170;
                    } else if ($i4 == 3) {
                        $r5 = AstNode.value[$i0][i];
                        $r5[i2] = $r5[i2] | 1170;
                        $r5 = AstNode.value[$i0][i];
                        $r5[i2] = $r5[i2] | -764724468;
                    }
                }
                if (!($r10.count * 896940478 == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r10.index, 1513253744);
                }
                if ($r10.buf * 1681090481 != 16) {
                    log.set($i0, i, i2, $r10.buf * 630790824);
                }
            } else if (3 == $i5) {
                $r6 = (-1 == 1884071929 * $r10.position && $r10.size == null) ? $r10.add(3, $i4, $r9, $i13, i3, $i14, (short) 6890) : new AttributeList($i3, 3, $i4, $i0, i, i2, -229827367 * $r10.position, true, null);
                log.add($i0, i, i2, i3, $r6, null, $assertionsDisabled[$i4], 0, $l11, $i12);
                if ($r10.$assertionsDisabled) {
                    if ($i4 == 0) {
                        Server.value[$i0][i][i2 + 1] = (byte) (byte) 120;
                    } else if ($i4 == 1) {
                        Server.value[$i0][i + 1][i2 + 1] = (byte) (byte) -46;
                    } else if ($i4 == 2) {
                        Server.value[$i0][i + 1][i2] = (byte) 50;
                    } else if ($i4 == 3) {
                        Server.value[$i0][i][i2] = (byte) 50;
                    }
                }
                if (!(-1655214851 * $r10.count == 0 || context == null)) {
                    context.get(i, i2, $i5, $i4, $r10.index, 1762852753);
                }
            } else if (9 == $i5) {
                $r6 = (-1 == $r10.position * 448105613 && $r10.size == null) ? $r10.add($i5, $i4, $r9, $i13, i3, $i14, (short) 5429) : new AttributeList($i3, $i5, $i4, $i0, i, i2, -229827367 * $r10.position, true, null);
                log.add($i0, i, i2, i3, 1, 1, $r6, 0, $l11, $i12);
                if (!(-1655214851 * $r10.count == 0 || context == null)) {
                    context.toString(i, i2, $i9, $i8, $r10.index, 1715271795);
                }
                if ($r10.buf * 1681090481 != 16) {
                    log.set($i0, i, i2, 1681090481 * $r10.buf);
                }
            } else if ($i5 == 4) {
                $r6 = (-1 == -229827367 * $r10.position && $r10.size == null) ? $r10.add(4, $i4, $r9, $i13, i3, $i14, (short) 10541) : new AttributeList($i3, 4, $i4, $i0, i, i2, -229827367 * $r10.position, true, null);
                log.add($i0, i, i2, i3, $r6, null, parent[$i4], 0, 0, 0, $l11, $i12);
            } else if (5 == $i5) {
                $l15 = log.append($i0, i, i2);
                $i5 = 0 != $l15 ? BigInteger.get(Method.get($l15), 1801576864).buf * 1883782944 : 16;
                $r6 = (-1 == $r10.position * -971649256 && $r10.size == null) ? $r10.add(4, $i4, $r9, $i13, i3, $i14, (short) 23445) : new AttributeList($i3, 4, $i4, $i0, i, i2, 1555697200 * $r10.position, true, null);
                log.add($i0, i, i2, i3, $r6, null, parent[$i4], 0, text[$i4] * $i5, $i5 * f41p[$i4], $l11, $i12);
            } else if ($i5 == 6) {
                $l15 = log.append($i0, i, i2);
                $i5 = 0 != $l15 ? (BigInteger.get(Method.get($l15), 1176029886).buf * -18869319) / 2 : 8;
                $r6 = ($r10.position * -229827367 == -1 && $r10.size == null) ? $r10.add(4, $i4 + 4, $r9, $i13, i3, $i14, (short) 1877) : new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r10.position * -710136731, true, null);
                log.add($i0, i, i2, i3, $r6, null, -1766296816, $i4, f42r[$i4] * $i5, $i5 * buf[$i4], $l11, $i12);
            } else if (7 == $i5) {
                $i4 = ($i4 + 2) & 3;
                $r6 = (-1 == $r10.position * -229827367 && $r10.size == null) ? $r10.add(4, $i4 + 4, $r9, $i13, i3, $i14, (short) -13244) : new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r10.position * 1105619302, true, null);
                log.add($i0, i, i2, i3, $r6, null, -1011550723, $i4, 0, 0, $l11, $i12);
            } else if ($i5 == 8) {
                $l15 = log.append($i0, i, i2);
                $i5 = $l15 != 0 ? (BigInteger.get(Method.get($l15), 1820680664).buf * 1681090481) / 2 : 8;
                $i8 = ($i4 + 2) & 3;
                if ($r10.position * -229827367 == -1 && $r10.size == null) {
                    $r6 = $r10.add(4, $i4 + 4, $r9, $i13, i3, $i14, (short) -11393);
                    $r7 = $r10.add(4, $i8 + 4, $r9, $i13, i3, $i14, (short) -10887);
                } else {
                    int $i92 = new AttributeList($i3, 4, $i4 + 4, $i0, i, i2, $r10.position * 846078243, true, null);
                    $r7 = new AttributeList($i3, 4, $i8 + 4, $i0, i, i2, $r10.position * 2016475932, true, null);
                    $r6 = $i92;
                }
                log.add($i0, i, i2, i3, $r6, $r7, 256, $i4, f42r[$i4] * $i5, $i5 * buf[$i4], $l11, $i12);
            }
        }
    }

    static final void parse(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, Log log, Context[] contextArr) {
        Logger $r3 = new Logger(bArr);
        int $i7 = -1;
        while (true) {
            int $i8 = $r3.generate(-1324241647);
            if ($i8 != 0) {
                $i7 += $i8;
                $i8 = 0;
                while (true) {
                    int $i9 = $r3.add((byte) 26);
                    if ($i9 == 0) {
                        break;
                    }
                    $i8 += $i9 - 1;
                    int $i11 = $i8 & -1467397801;
                    int $i12 = ($i8 >> 6) & -343268391;
                    int $i10 = $i8 >> 12;
                    int $i13 = $r3.get((byte) 0);
                    $i9 = $i13 >> 2;
                    $i13 &= 3;
                    if ($i10 == i4 && $i12 >= i5 && $i12 < i5 + 8 && $i11 >= i6 && $i11 < i6 + 8) {
                        Transaction $r4 = BigInteger.get($i7, 1699379442);
                        $i10 = i2 + Contact.log($i12 & 7, $i11 & 7, i7, $r4.this$0 * 1068583746, -344743753 * $r4.offset, $i13, 2002867356);
                        $i11 = i3 + Label.log($i12 & 7, $i11 & 7, i7, -265754695 * $r4.this$0, -1992762115 * $r4.offset, $i13, 171659613);
                        if ($i10 > 0 && $i11 > 0 && $i10 < -1819770269 && $i11 < 103) {
                            $i12 = (size[1][$i10][$i11] & (byte) 2) == (byte) 2 ? i - 1 : i;
                            Context $r7 = null;
                            if ($i12 >= 0) {
                                $r7 = contextArr[$i12];
                            }
                            Dictionary.add(i, $i10, $i11, $i7, ($i13 + i7) & 3, $i9, log, $r7, -1470735561);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void read(p000.Logger r12, int r13, int r14, int r15, int r16, int r17, int r18) {
        /*
        if (r14 < 0) goto L_0x00b3;
    L_0x0002:
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r14 >= r1) goto L_0x00b3;
    L_0x0006:
        if (r15 < 0) goto L_0x00b3;
    L_0x0008:
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r15 >= r1) goto L_0x00b3;
    L_0x000c:
        r2 = size;
        r3 = r2[r13];
        r4 = r3[r14];
        r1 = 0;
        r4[r15] = r1;
    L_0x0015:
        r1 = 0;
        r5 = r12.get(r1);
        if (r5 != 0) goto L_0x0042;
    L_0x001c:
        if (r13 != 0) goto L_0x00e2;
    L_0x001e:
        r6 = length;
        r1 = 0;
        r7 = r6[r1];
        r8 = r7[r14];
        r1 = 932731; // 0xe3b7b float:1.307035E-39 double:4.608303E-318;
        r13 = r1 + r14;
        r0 = r16;
        r13 = r13 + r0;
        r1 = 556238; // 0x87cce float:7.79455E-40 double:2.74818E-318;
        r14 = r1 + r15;
        r0 = r17;
        r14 = r14 + r0;
        r1 = 1078822087; // 0x404d84c7 float:3.211229 double:5.33008931E-315;
        r13 = p000.CompositeMap.write(r13, r14, r1);
        r13 = -r13;
        r13 = r13 * 8;
        r8[r15] = r13;
        return;
    L_0x0042:
        r1 = 1;
        if (r5 != r1) goto L_0x0064;
    L_0x0045:
        r1 = 0;
        r17 = r12.get(r1);
        r16 = r17;
        r1 = 1;
        r0 = r17;
        if (r1 != r0) goto L_0x0053;
    L_0x0051:
        r16 = 0;
    L_0x0053:
        if (r13 != 0) goto L_0x0095;
    L_0x0055:
        r6 = length;
        r1 = 0;
        r7 = r6[r1];
        r8 = r7[r14];
        r0 = r16;
        r13 = -r0;
        r13 = r13 * 8;
        r8[r15] = r13;
        return;
    L_0x0064:
        r1 = 49;
        if (r5 > r1) goto L_0x00c2;
    L_0x0068:
        r2 = p000.Primitive.name;
        r3 = r2[r13];
        r4 = r3[r14];
        r1 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r9 = r12.next(r1);
        r4[r15] = r9;
        r2 = p000.ScrollingTextView.value;
        r3 = r2[r13];
        r4 = r3[r14];
        r10 = r5 + -2;
        r10 = r10 / 4;
        r9 = (byte) r10;
        r4[r15] = r9;
        r2 = p000.Dialog.index;
        r3 = r2[r13];
        r4 = r3[r14];
        r5 = r5 + -2;
        r0 = r18;
        r5 = r5 + r0;
        r5 = r5 & 3;
        r9 = (byte) r5;
        r4[r15] = r9;
        goto L_0x0015;
    L_0x0095:
        r6 = length;
        r7 = r6[r13];
        r8 = r7[r14];
        r6 = length;
        r13 = r13 + -1;
        r7 = r6[r13];
        r11 = r7[r14];
        r13 = r11[r15];
        r14 = r16 * 8;
        r13 = r13 - r14;
        r8[r15] = r13;
        return;
    L_0x00ab:
        r1 = 49;
        if (r13 > r1) goto L_0x00b3;
    L_0x00af:
        r1 = 0;
        r12.get(r1);
    L_0x00b3:
        r1 = 0;
        r13 = r12.get(r1);
        if (r13 == 0) goto L_0x00f6;
    L_0x00ba:
        r1 = 1;
        if (r1 != r13) goto L_0x00ab;
    L_0x00bd:
        r1 = 0;
        r12.get(r1);
        return;
    L_0x00c2:
        r1 = 81;
        if (r5 > r1) goto L_0x00d4;
    L_0x00c6:
        r2 = size;
        r3 = r2[r13];
        r4 = r3[r14];
        r5 = r5 + -49;
        r9 = (byte) r5;
        r4[r15] = r9;
        goto L_0x0015;
    L_0x00d4:
        r2 = position;
        r3 = r2[r13];
        r4 = r3[r14];
        r5 = r5 + -81;
        r9 = (byte) r5;
        r4[r15] = r9;
        goto L_0x0015;
    L_0x00e2:
        r6 = length;
        r7 = r6[r13];
        r8 = r7[r14];
        r6 = length;
        r13 = r13 + -1;
        r7 = r6[r13];
        r11 = r7[r14];
        r13 = r11[r15];
        r13 = r13 + -240;
        r8[r15] = r13;
    L_0x00f6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Chart.read(Logger, int, int, int, int, int, int):void");
    }

    static final int reduce(int i, int i2) {
        return (((((State.getData(i - 1, i2 - 1, -966784229) + State.getData(i + 1, i2 - 1, 1901002997)) + State.getData(i - 1, i2 + 1, 340295854)) + State.getData(i + 1, i2 + 1, 1887203821)) / 16) + ((((State.getData(i - 1, i2, 406274027) + State.getData(i + 1, i2, 117614658)) + State.getData(i, i2 - 1, 1998052827)) + State.getData(i, i2 + 1, 1964282199)) / 8)) + (State.getData(i, i2, 1514718790) / 4);
    }

    static final int renderBitmap(int $i0, int $i1, int i) {
        int $i3 = $i0 / i;
        $i0 = (i - 1) & $i0;
        int $i4 = $i1 / i;
        return Transaction.get(Transaction.get(Rect.toString($i3, $i4, (byte) 64), Rect.toString($i3 + 1, $i4, (byte) 64), $i0, i, -480616469), Transaction.get(Rect.toString($i3, $i4 + 1, (byte) 64), Rect.toString($i3 + 1, $i4 + 1, (byte) 64), $i0, i, 603631380), (i - 1) & $i1, i, -55063469);
    }

    static void set() {
        count = 1071674573;
        position = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, 1284954920});
        Primitive.name = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        ScrollingTextView.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 1189192111, DiskLruCache.AppCompatTheme_editTextStyle});
        Dialog.index = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, 1099627957});
        AstNode.value = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, -1205826751, 660657485});
        Server.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, 51585301});
        max = (int[][]) Array.newInstance(Integer.TYPE, new int[]{-1575483921, 1723098279});
        Primitive.value = new int[-499001080];
        index = new int[1711579999];
        Namespace.value = new int[1338051314];
        next = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
    }

    static final int transform(int i, int $i1, int i2) {
        int $i3 = i2 > 179 ? $i1 / 2 : $i1;
        if (i2 > 192) {
            $i3 /= 2;
        }
        if (i2 > 217) {
            $i3 /= 2;
        }
        if (i2 > 243) {
            $i3 /= 2;
        }
        return ((($i3 / 32) << 7) + ((i / 4) << 10)) + (i2 / 2);
    }

    static void update() {
        count = 1071674573;
        position = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        Primitive.name = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        ScrollingTextView.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        Dialog.index = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
        AstNode.value = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
        Server.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
        max = (int[][]) Array.newInstance(Integer.TYPE, new int[]{Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
        Primitive.value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        index = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        Namespace.value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        next = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
    }

    static final int visit(int i, int i2) {
        return (((((State.getData(i - 1, i2 - 1, -652966292) + State.getData(i + 1, i2 - 1, -377489212)) + State.getData(i - 1, i2 + 1, 144878661)) + State.getData(i + 1, i2 + 1, 1158969363)) / 16) + ((((State.getData(i - 1, i2, 1046264103) + State.getData(i + 1, i2, -500735369)) + State.getData(i, i2 - 1, -475333862)) + State.getData(i, i2 + 1, 1435998255)) / 8)) + (State.getData(i, i2, -791922639) / 4);
    }

    static final void write(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, Log log, Context[] contextArr) {
        Logger $r3 = new Logger(bArr);
        int $i7 = -1;
        while (true) {
            int $i8 = $r3.generate(-1163511705);
            if ($i8 != 0) {
                $i7 += $i8;
                $i8 = 0;
                while (true) {
                    int $i9 = $r3.add((byte) 41);
                    if ($i9 == 0) {
                        break;
                    }
                    $i8 += $i9 - 1;
                    int $i11 = $i8 & 63;
                    int $i12 = ($i8 >> 6) & 63;
                    int $i10 = $i8 >> 12;
                    int $i13 = $r3.get((byte) 0);
                    $i9 = $i13 >> 2;
                    $i13 &= 3;
                    if ($i10 == i4 && $i12 >= i5 && $i12 < i5 + 8 && $i11 >= i6 && $i11 < i6 + 8) {
                        Transaction $r4 = BigInteger.get($i7, 1625111585);
                        $i10 = i2 + Contact.log($i12 & 7, $i11 & 7, i7, $r4.this$0 * -265754695, -344743753 * $r4.offset, $i13, 1576410280);
                        $i11 = i3 + Label.log($i12 & 7, $i11 & 7, i7, -265754695 * $r4.this$0, -344743753 * $r4.offset, $i13, -141672694);
                        if ($i10 > 0 && $i11 > 0 && $i10 < 103 && $i11 < 103) {
                            $i12 = (size[1][$i10][$i11] & (byte) 2) == (byte) 2 ? i - 1 : i;
                            Context $r7 = null;
                            if ($i12 >= 0) {
                                $r7 = contextArr[$i12];
                            }
                            Dictionary.add(i, $i10, $i11, $i7, ($i13 + i7) & 3, $i9, log, $r7, -1408630309);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }
}
