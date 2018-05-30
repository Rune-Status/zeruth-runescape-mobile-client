package p000;

/* compiled from: cj */
public class Resource extends Point {
    static final byte FONT = (byte) 0;
    int[] size;

    public Resource(int[] iArr, int i, int i2) {
        try {
            get(iArr, i, i2, 1462363449);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cj.<init>(" + ')');
        }
    }

    static final int parse(System system, int i, int i2) {
        try {
            if (system.separator != null) {
                if (i < system.separator.length) {
                    int[] $r1 = system.separator[i];
                    i = 0;
                    i2 = 0;
                    byte $b2 = (byte) 0;
                    while (true) {
                        int $i3 = i2 + 1;
                        i2 = $r1[i2];
                        int $i4 = 0;
                        if (i2 == 0) {
                            return i;
                        }
                        int $i5;
                        int $i6;
                        if (i2 == 1) {
                            $i5 = $i3 + 1;
                            $i4 = client.TRUE[$r1[$i3]];
                        } else {
                            $i5 = $i3;
                        }
                        if (i2 == 2) {
                            $i3 = $i5 + 1;
                            $i4 = client.INSTANCE[$r1[$i5]];
                        } else {
                            $i3 = $i5;
                        }
                        if (i2 == 3) {
                            $i5 = $i3 + 1;
                            $i4 = client.reader[$r1[$i3]];
                        } else {
                            $i5 = $i3;
                        }
                        if (i2 == 4) {
                            $i6 = $i5 + 1;
                            $i3 = $i6 + 1;
                            system = ArrayList.get(($r1[$i5] << 16) + $r1[$i6], 565008712);
                            $i5 = $i3 + 1;
                            $i3 = $r1[$i3];
                            if ($i3 != -1) {
                                if (!Set.get($i3, 1404336134).type || client.start) {
                                    for ($i6 = 0; $i6 < system.pos.length; $i6++) {
                                        if (system.pos[$i6] == $i3 + 1) {
                                            $i4 += system.length[$i6];
                                        }
                                    }
                                }
                            }
                        }
                        if (5 == i2) {
                            $i6 = $i5 + 1;
                            $i4 = Event.this$0[$r1[$i5]];
                        } else {
                            $i6 = $i5;
                        }
                        if (i2 == 6) {
                            $i3 = $i6 + 1;
                            $i4 = AbstractParser.name[client.INSTANCE[$r1[$i6]] - 1];
                        } else {
                            $i3 = $i6;
                        }
                        if (i2 == 7) {
                            $i5 = $i3 + 1;
                            $i4 = (Event.this$0[$r1[$i3]] * 100) / 46875;
                        } else {
                            $i5 = $i3;
                        }
                        if (8 == i2) {
                            $i4 = File.this$0.size * -1986989913;
                        }
                        if (9 == i2) {
                            for ($i3 = 0; $i3 < 25; $i3++) {
                                if (AbstractParser.parser[$i3]) {
                                    $i4 += client.INSTANCE[$i3];
                                }
                            }
                        }
                        if (10 == i2) {
                            $i3 = $i5 + 1;
                            $i6 = $r1[$i5] << 16;
                            $i5 = $i3 + 1;
                            system = ArrayList.get($r1[$i3] + $i6, 1017786702);
                            $i3 = $i5 + 1;
                            $i5 = $r1[$i5];
                            if ($i5 != -1) {
                                try {
                                    if (!Set.get($i5, 1753582816).type || client.start) {
                                        for (int $i7 : system.pos) {
                                            if ($i7 == $i5 + 1) {
                                                $i4 = 999999999;
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    return -1;
                                }
                            }
                        } else {
                            $i3 = $i5;
                        }
                        if (i2 == 11) {
                            $i4 = client.entry * -28768771;
                        }
                        if (12 == i2) {
                            $i4 = client.from * 392548631;
                        }
                        if (i2 == 13) {
                            $i5 = $i3 + 1;
                            $i4 = $i5 + 1;
                            int i3 = (Event.this$0[$r1[$i3]] & (1 << $r1[$i5])) != 0 ? 1 : 0;
                            $i3 = $i4;
                            $i4 = i3;
                        }
                        if (14 == i2) {
                            $i5 = $i3 + 1;
                            $i4 = IOException.toString($r1[$i3], 998830794);
                        } else {
                            $i5 = $i3;
                        }
                        byte b = i2 == 15 ? (byte) 1 : (byte) 0;
                        if (16 == i2) {
                            b = (byte) 2;
                        }
                        if (i2 == 17) {
                            b = (byte) 3;
                        }
                        if (18 == i2) {
                            $i4 = ((516759209 * File.this$0.size) >> 7) + (1407993063 * Build$VERSION.type);
                        }
                        if (i2 == 19) {
                            $i4 = ((File.this$0.value * 2328865) >> 7) + (1289967967 * Level.type);
                        }
                        if (20 == i2) {
                            i2 = $i5 + 1;
                            $i4 = $r1[$i5];
                        } else {
                            i2 = $i5;
                        }
                        if (b == (byte) 0) {
                            if ($b2 == (byte) 0) {
                                i += $i4;
                            }
                            if ((byte) 1 == $b2) {
                                i -= $i4;
                            }
                            if ((byte) 2 == $b2 && $i4 != 0) {
                                i /= $i4;
                            }
                            if ($b2 == (byte) 3) {
                                i *= $i4;
                            }
                            b = (byte) 0;
                        }
                        $b2 = b;
                    }
                }
            }
            return -2;
        } catch (RuntimeException $r9) {
            throw StringBuilder.append($r9, "cj.ee(" + ')');
        }
    }

    static final int set(int $i0, int $i1, int i, int i2, byte b) {
        return (($i0 * i) - (i2 * $i1)) >> 16;
    }

    final void add(int[] iArr, int $i0, int $i1, int i, int i2, int i3, byte b) {
        try {
            if (this.f201c) {
                if (i3 > 784773023 * this.buffer) {
                    i3 = this.buffer * 784773023;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
            }
            if (i2 < i3) {
                int $i6 = $i0 + i2;
                $i0 = (i3 - i2) >> 2;
                if (238267341 * this.f200b != 0) {
                    if (this.f200b * 238267341 != 254) {
                        i = this.f200b * 238267341;
                        int $i7 = 256 - (238267341 * this.f200b);
                        $i1 = ((((16711935 & $i1) * $i7) >> 8) & 16711935) + ((($i7 * (65280 & $i1)) >> 8) & 65280);
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            int $i8 = iArr[$i6];
                            $i7 = $i6 + 1;
                            iArr[$i6] = (((($i8 & 65280) * i) >> 8) & 65280) + (((((16711935 & $i8) * i) >> 8) & 16711935) + $i1);
                            $i8 = iArr[$i7];
                            $i6 = $i7 + 1;
                            iArr[$i7] = (((($i8 & 65280) * i) >> 8) & 65280) + (((((16711935 & $i8) * i) >> 8) & 16711935) + $i1);
                            $i8 = iArr[$i6];
                            $i7 = $i6 + 1;
                            iArr[$i6] = (((($i8 & 65280) * i) >> 8) & 65280) + (((((16711935 & $i8) * i) >> 8) & 16711935) + $i1);
                            int $i9 = iArr[$i7];
                            $i6 = $i7 + 1;
                            iArr[$i7] = ((((($i9 & 16711935) * i) >> 8) & 16711935) + $i1) + ((((65280 & $i9) * i) >> 8) & 65280);
                        }
                        $i0 = (i3 - i2) & 3;
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            i3 = iArr[$i6];
                            $i7 = ((((16711935 & i3) * i) >> 8) & 16711935) + $i1;
                            int $i5 = i3 & 65280;
                            i3 = $i5;
                            $i5 = (($i5 * i) >> 8) & 65280;
                            i3 = $i5;
                            iArr[$i6] = $i5 + $i7;
                            $i6++;
                        }
                    } else {
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            $i1 = $i6 + 1;
                            iArr[$i6] = iArr[$i1];
                            i = $i1 + 1;
                            iArr[$i1] = iArr[i];
                            $i1 = i + 1;
                            iArr[i] = iArr[$i1];
                            $i6 = $i1 + 1;
                            iArr[$i1] = iArr[$i6];
                        }
                        $i0 = (i3 - i2) & 3;
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            $i1 = $i6 + 1;
                            iArr[$i6] = iArr[$i1];
                            $i6 = $i1;
                        }
                    }
                } else {
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        i = $i6 + 1;
                        iArr[$i6] = $i1;
                        $i6 = i + 1;
                        iArr[i] = $i1;
                        i = $i6 + 1;
                        iArr[$i6] = $i1;
                        $i6 = i + 1;
                        iArr[i] = $i1;
                    }
                    i = (i3 - i2) & 3;
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        iArr[$i6] = $i1;
                        $i6++;
                    }
                }
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cj.ar(" + ')');
        }
    }

    public final void encode(int $i4, int $i5, int $i6, int $i0, int $i1, int $i2, int i) {
        int $i7 = $i5 != $i4 ? (($i1 - $i0) << 14) / ($i5 - $i4) : 0;
        int $i9 = $i5 != $i6 ? (($i2 - $i1) << 14) / ($i6 - $i5) : 0;
        int $i8 = $i4 != $i6 ? (($i0 - $i2) << 14) / ($i4 - $i6) : 0;
        int $i10;
        int $i11;
        if ($i4 <= $i5 && $i4 <= $i6) {
            if ($i4 < this.length * -1759402563) {
                if ($i5 > this.length * -1759402563) {
                    $i5 = -1759402563 * this.length;
                }
                $i10 = $i6 > -1759402563 * this.length ? this.length * -1759402563 : $i6;
                if ($i5 >= $i10) {
                    $i0 <<= 14;
                    if ($i4 < 0) {
                        $i11 = $i0 - ($i4 * $i8);
                        $i0 -= $i4 * $i7;
                        $i4 = 0;
                    } else {
                        $i11 = $i0;
                    }
                    $i6 = $i2 << 14;
                    if ($i10 < 0) {
                        $i6 -= $i10 * $i9;
                        $i10 = 0;
                    }
                    if (($i10 != $i4 && $i8 < $i7) || ($i4 == $i10 && $i9 > $i7)) {
                        $i5 -= $i10;
                        $i1 = $i11;
                        $i2 = $i10 - $i4;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i2--;
                            if ($i2 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i1 >> 14, $i0 >> 14, (byte) 73);
                            $i0 += $i7;
                            $i4 += this.size * -1741252353;
                            $i1 += $i8;
                        }
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i0 >> 14, (byte) 103);
                            $i6 += $i9;
                            $i4 += this.size * -1741252353;
                            $i0 += $i7;
                        }
                    } else {
                        $i1 = $i5 - $i10;
                        $i2 = $i11;
                        $i5 = $i0;
                        $i0 = $i10 - $i4;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i2 >> 14, (byte) 102);
                            $i5 += $i7;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i8;
                        }
                        $i0 = $i1;
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i6 >> 14, (byte) 25);
                            $i4 += -1741252353 * this.size;
                            $i6 += $i9;
                            $i5 += $i7;
                        }
                    }
                } else {
                    $i2 = $i0 << 14;
                    if ($i4 < 0) {
                        $i0 = $i2 - ($i8 * $i4);
                        $i2 -= $i7 * $i4;
                        $i4 = 0;
                    } else {
                        $i0 = $i2;
                    }
                    $i6 = $i1 << 14;
                    if ($i5 < 0) {
                        $i6 -= $i9 * $i5;
                        $i5 = 0;
                    }
                    if (($i5 != $i4 && $i8 < $i7) || ($i5 == $i4 && $i8 > $i9)) {
                        $i1 = $i10 - $i5;
                        $i5 -= $i4;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i2 >> 14, (byte) 100);
                            $i0 += $i8;
                            $i4 += this.size * -1741252353;
                            $i2 += $i7;
                        }
                        $i5 = $i1;
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i6 >> 14, (byte) 47);
                            $i6 += $i9;
                            $i4 += -1741252353 * this.size;
                            $i0 += $i8;
                        }
                    } else {
                        $i1 = $i10 - $i5;
                        $i5 -= $i4;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i2 >> 14, $i0 >> 14, (byte) 77);
                            $i0 += $i8;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i7;
                        }
                        $i5 = $i1;
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i0 >> 14, (byte) 68);
                            $i4 += this.size * -1741252353;
                            $i0 += $i8;
                            $i6 += $i9;
                        }
                    }
                }
            }
        } else if ($i5 > $i6) {
            if ($i6 < -1759402563 * this.length) {
                if ($i4 > this.length * -1759402563) {
                    $i4 = -1759402563 * this.length;
                }
                $i10 = $i5 > -1759402563 * this.length ? this.length * -1759402563 : $i5;
                if ($i4 >= $i10) {
                    $i0 = $i2 << 14;
                    if ($i6 < 0) {
                        $i2 = $i0 - ($i6 * $i9);
                        $i0 -= $i8 * $i6;
                        $i6 = 0;
                    } else {
                        $i2 = $i0;
                    }
                    $i5 = $i1 << 14;
                    if ($i10 < 0) {
                        $i5 -= $i7 * $i10;
                        $i10 = 0;
                    }
                    if ($i9 >= $i8) {
                        $i1 = $i4 - $i10;
                        $i4 = this.next[$i6];
                        $i6 = $i10 - $i6;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i2 >> 14, (byte) 75);
                            $i0 += $i8;
                            $i4 += this.size * -1741252353;
                            $i2 += $i9;
                        }
                        $i6 = $i1;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i5 >> 14, (byte) 44);
                            $i5 += $i7;
                            $i4 += this.size * -1741252353;
                            $i0 += $i8;
                        }
                    } else {
                        $i1 = $i4 - $i10;
                        $i4 = this.next[$i6];
                        $i6 = $i10 - $i6;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i2 >> 14, $i0 >> 14, (byte) 22);
                            $i0 += $i8;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i9;
                        }
                        $i6 = $i0;
                        $i0 = $i5;
                        while (true) {
                            $i5 = $i1 - 1;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i6 >> 14, (byte) 18);
                            $i4 += this.size * -1741252353;
                            $i6 += $i8;
                            $i0 += $i7;
                            $i1 = $i5;
                        }
                    }
                } else {
                    $i2 <<= 14;
                    if ($i6 < 0) {
                        $i1 = $i2 - ($i6 * $i9);
                        $i2 -= $i8 * $i6;
                        $i6 = 0;
                    } else {
                        $i1 = $i2;
                    }
                    $i5 = $i0 << 14;
                    if ($i4 < 0) {
                        $i5 -= $i4 * $i7;
                        $i4 = 0;
                    }
                    if ($i9 >= $i8) {
                        $i0 = $i10 - $i4;
                        $i10 = $i4 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i2 >> 14, $i6 >> 14, (byte) 27);
                            $i6 += $i9;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i8;
                        }
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i6 >> 14, (byte) 116);
                            $i4 += this.size * -1741252353;
                            $i6 += $i9;
                            $i5 += $i7;
                        }
                    } else {
                        $i0 = $i10 - $i4;
                        $i10 = $i4 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i2 >> 14, (byte) 78);
                            $i6 += $i9;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i8;
                        }
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i5 >> 14, (byte) 34);
                            $i5 += $i7;
                            $i4 += this.size * -1741252353;
                            $i6 += $i9;
                        }
                    }
                }
            }
        } else if ($i5 < -1759402563 * this.length) {
            if ($i6 > this.length * -1759402563) {
                $i6 = -1759402563 * this.length;
            }
            $i10 = $i4 > -1759402563 * this.length ? this.length * -1759402563 : $i4;
            if ($i6 >= $i10) {
                $i4 = $i1 << 14;
                if ($i5 < 0) {
                    $i2 = $i4 - ($i7 * $i5);
                    $i1 = $i4 - ($i5 * $i9);
                    $i5 = 0;
                } else {
                    $i2 = $i4;
                    $i1 = $i4;
                }
                $i4 = $i0 << 14;
                if ($i10 < 0) {
                    $i4 -= $i8 * $i10;
                    $i0 = 0;
                } else {
                    $i0 = $i10;
                }
                if ($i7 >= $i9) {
                    $i6 -= $i0;
                    $i0 -= $i5;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i1 >> 14, $i2 >> 14, (byte) 86);
                        $i1 += $i9;
                        $i5 += -1741252353 * this.size;
                        $i2 += $i7;
                    }
                    $i0 = $i1;
                    $i1 = $i6;
                    $i6 = $i4;
                    while (true) {
                        $i4 = $i1 - 1;
                        if ($i4 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i0 >> 14, $i6 >> 14, (byte) 104);
                        $i5 += -1741252353 * this.size;
                        $i0 += $i9;
                        $i6 += $i8;
                        $i1 = $i4;
                    }
                } else {
                    $i6 -= $i0;
                    $i0 -= $i5;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i2 >> 14, $i1 >> 14, (byte) 59);
                        $i1 += $i9;
                        $i5 += -1741252353 * this.size;
                        $i2 += $i7;
                    }
                    $i0 = $i1;
                    while (true) {
                        $i6--;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i4 >> 14, $i0 >> 14, (byte) 104);
                        $i4 += $i8;
                        $i5 += this.size * -1741252353;
                        $i0 += $i9;
                    }
                }
            } else {
                $i11 = $i1 << 14;
                if ($i5 < 0) {
                    $i1 = $i11 - ($i5 * $i7);
                    $i11 -= $i9 * $i5;
                    $i5 = 0;
                } else {
                    $i1 = $i11;
                }
                $i4 = $i2 << 14;
                if ($i6 < 0) {
                    $i4 -= $i6 * $i8;
                    $i6 = 0;
                }
                if (($i5 != $i6 && $i7 < $i9) || ($i6 == $i5 && $i7 > $i8)) {
                    $i0 = $i10 - $i6;
                    $i10 = $i6 - $i5;
                    $i2 = $i11;
                    $i6 = $i1;
                    $i1 = $i10;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i6 >> 14, $i2 >> 14, (byte) 24);
                        $i6 += $i7;
                        $i5 += this.size * -1741252353;
                        $i2 += $i9;
                    }
                    $i1 = $i4;
                    $i4 = $i0;
                    while (true) {
                        $i4--;
                        if ($i4 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i6 >> 14, $i1 >> 14, (byte) 91);
                        $i5 += -1741252353 * this.size;
                        $i1 += $i8;
                        $i6 += $i7;
                    }
                } else {
                    $i0 = $i10 - $i6;
                    $i10 = $i6 - $i5;
                    $i2 = $i11;
                    $i6 = $i1;
                    $i1 = $i10;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i2 >> 14, $i6 >> 14, (byte) 76);
                        $i6 += $i7;
                        $i5 += this.size * -1741252353;
                        $i2 += $i9;
                    }
                    $i1 = $i6;
                    $i6 = $i0;
                    while (true) {
                        $i6--;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i4 >> 14, $i1 >> 14, (byte) 109);
                        $i4 += $i8;
                        $i5 += -1741252353 * this.size;
                        $i1 += $i7;
                    }
                }
            }
        }
    }

    final void encode(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int $i3, int $i4, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (this.f201c) {
            if (i5 > 784773023 * this.buffer) {
                i5 = 784773023 * this.buffer;
            }
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (i4 < i5) {
            int $i17 = i3 + i4;
            int $i18 = $i3 + (i4 * $i4);
            i2 = i5 - i4;
            int $i15;
            int $i14;
            int $i13;
            int $i16;
            int $i19;
            int $i12;
            if (this.value) {
                i3 = i4 - (this.data * -1575402035);
                i = i6 + ((i9 >> 3) * i3);
                $i3 = i7 + ((i10 >> 3) * i3);
                i3 = i8 + (i3 * (i11 >> 3));
                i6 = i3 >> 12;
                if (i6 != 0) {
                    i8 = i / i6;
                    $i15 = $i3 / i6;
                    if (i8 < 0) {
                        i8 = 0;
                    } else if (i8 > 4032) {
                        i8 = 4032;
                    }
                } else {
                    i8 = 0;
                    $i15 = 0;
                }
                i7 = i + i9;
                i6 = $i3 + i10;
                $i3 = i3 + i11;
                i = $i3 >> 12;
                if (i != 0) {
                    i3 = i7 / i;
                    i = i6 / i;
                    if (i3 < 0) {
                        i3 = 0;
                    } else if (i3 > 4032) {
                        i3 = 4032;
                    }
                } else {
                    i3 = 0;
                    i = 0;
                }
                $i14 = (i8 << 20) + $i15;
                $i13 = (((i3 - i8) >> 3) << 20) + ((i - $i15) >> 3);
                i8 = i2 >> 3;
                i2 = $i4 << 3;
                $i4 = $i18 >> 8;
                if (this.pos) {
                    if (i8 > 0) {
                        $i15 = $i4;
                        $i4 = i8;
                        $i16 = $i17;
                        i8 = $i18;
                        while (true) {
                            $i19 = iArr2[($i14 >>> 26) + ($i14 & 4032)];
                            $i17 = $i16 + 1;
                            iArr[$i16] = (((($i19 & 65280) * $i15) & 16711680) + (((16711935 & $i19) * $i15) & -16711936)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 >>> 26) + ($i14 & 4032)];
                            $i18 = $i17 + 1;
                            iArr[$i17] = (((($i19 & 16711935) * $i15) & -16711936) + (((65280 & $i19) * $i15) & 16711680)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 >>> 26) + ($i14 & 4032)];
                            $i17 = $i18 + 1;
                            iArr[$i18] = (((($i19 & 65280) * $i15) & 16711680) + (((16711935 & $i19) * $i15) & -16711936)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 & 4032) + ($i14 >>> 26)];
                            $i18 = $i17 + 1;
                            iArr[$i17] = (((($i19 & 16711935) * $i15) & -16711936) + (((65280 & $i19) * $i15) & 16711680)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 & 4032) + ($i14 >>> 26)];
                            $i17 = $i18 + 1;
                            iArr[$i18] = (((($i19 & 16711935) * $i15) & -16711936) + (((65280 & $i19) * $i15) & 16711680)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 & 4032) + ($i14 >>> 26)];
                            $i18 = $i17 + 1;
                            iArr[$i17] = (((($i19 & 65280) * $i15) & 16711680) + (((16711935 & $i19) * $i15) & -16711936)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 >>> 26) + ($i14 & 4032)];
                            $i17 = $i18 + 1;
                            iArr[$i18] = (((($i19 & 16711935) * $i15) & -16711936) + (((65280 & $i19) * $i15) & 16711680)) >> 8;
                            $i18 = $i14 + $i13;
                            $i14 = iArr2[($i18 >>> 26) + ($i18 & 4032)];
                            $i13 = $i17 + 1;
                            iArr[$i17] = ((($i15 * ($i14 & 65280)) & 16711680) + (((16711935 & $i14) * $i15) & -16711936)) >> 8;
                            i7 += i9;
                            i6 += i10;
                            $i14 = $i3 + i11;
                            $i3 = $i14 >> 12;
                            if ($i3 != 0) {
                                $i17 = i7 / $i3;
                                $i15 = i6 / $i3;
                                if ($i17 < 0) {
                                    $i17 = 0;
                                } else if ($i17 > 4032) {
                                    $i17 = 4032;
                                }
                            } else {
                                $i17 = 0;
                                $i15 = 0;
                            }
                            $i18 = (i3 << 20) + i;
                            i3 = ((($i17 - i3) >> 3) << 20) + (($i15 - i) >> 3);
                            i8 += i2;
                            $i3 = i8 >> 8;
                            i = $i4 - 1;
                            if (i <= 0) {
                                break;
                            }
                            $i4 = i;
                            i = $i15;
                            $i15 = $i3;
                            $i3 = $i14;
                            $i16 = $i13;
                            $i14 = $i18;
                            $i13 = i3;
                            i3 = $i17;
                        }
                    } else {
                        i3 = $i13;
                        $i3 = $i4;
                        $i18 = $i14;
                        $i13 = $i17;
                    }
                    i = (i5 - i4) & 7;
                    if (i > 0) {
                        while (true) {
                            i5 = iArr2[($i18 & 4032) + ($i18 >>> 26)];
                            i4 = ((16711935 & i5) * $i3) & -16711936;
                            $i12 = i5 & 65280;
                            i5 = $i12;
                            iArr[$i13] = ((($i12 * $i3) & 16711680) + i4) >> 8;
                            $i18 += i3;
                            i--;
                            if (i <= 0) {
                                break;
                            }
                            $i13++;
                        }
                    }
                } else {
                    if (i8 > 0) {
                        $i15 = $i4;
                        $i4 = i8;
                        i8 = $i18;
                        while (true) {
                            $i16 = iArr2[($i14 & 4032) + ($i14 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 16711935) * $i15) & -16711936) + (((65280 & $i16) * $i15) & 16711680)) >> 8;
                            }
                            $i17++;
                            $i18 = $i14 + $i13;
                            $i16 = iArr2[($i18 >>> 26) + ($i18 & 4032)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 65280) * $i15) & 16711680) + (((16711935 & $i16) * $i15) & -16711936)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 >>> 26) + ($i18 & 4032)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 16711935) * $i15) & -16711936) + (((65280 & $i16) * $i15) & 16711680)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 & 4032) + ($i18 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 16711935) * $i15) & -16711936) + (((65280 & $i16) * $i15) & 16711680)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 & 4032) + ($i18 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 16711935) * $i15) & -16711936) + (((65280 & $i16) * $i15) & 16711680)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 & 4032) + ($i18 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 65280) * $i15) & 16711680) + (((16711935 & $i16) * $i15) & -16711936)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 & 4032) + ($i18 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 65280) * $i15) & 16711680) + (((16711935 & $i16) * $i15) & -16711936)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i18 = iArr2[($i18 >>> 26) + ($i18 & 4032)];
                            if ($i18 != 0) {
                                iArr[$i17] = ((($i15 * ($i18 & 65280)) & 16711680) + (((16711935 & $i18) * $i15) & -16711936)) >> 8;
                            }
                            $i17++;
                            i7 += i9;
                            i6 += i10;
                            $i14 = $i3 + i11;
                            $i3 = $i14 >> 12;
                            if ($i3 != 0) {
                                $i15 = i7 / $i3;
                                $i13 = i6 / $i3;
                                if ($i15 < 0) {
                                    $i15 = 0;
                                } else if ($i15 > 4032) {
                                    $i15 = 4032;
                                }
                            } else {
                                $i15 = 0;
                                $i13 = 0;
                            }
                            $i18 = (i3 << 20) + i;
                            i3 = ((($i15 - i3) >> 3) << 20) + (($i13 - i) >> 3);
                            i8 += i2;
                            $i3 = i8 >> 8;
                            i = $i4 - 1;
                            if (i <= 0) {
                                break;
                            }
                            $i4 = i;
                            i = $i13;
                            $i13 = i3;
                            i3 = $i15;
                            $i15 = $i3;
                            $i3 = $i14;
                            $i14 = $i18;
                        }
                    } else {
                        i3 = $i13;
                        $i3 = $i4;
                        $i18 = $i14;
                    }
                    i = (i5 - i4) & 7;
                    if (i > 0) {
                        do {
                            i4 = iArr2[($i18 & 4032) + ($i18 >>> 26)];
                            if (i4 != 0) {
                                $i12 = i4 & 65280;
                                i4 = $i12;
                                iArr[$i17] = ((($i12 * $i3) & 16711680) + (((16711935 & i4) * $i3) & -16711936)) >> 8;
                            }
                            $i17++;
                            $i18 += i3;
                            i--;
                        } while (i > 0);
                    }
                }
            } else {
                i3 = i4 - (this.data * -1575402035);
                i = i6 + ((i9 >> 3) * i3);
                $i3 = i7 + ((i10 >> 3) * i3);
                i3 = i8 + (i3 * (i11 >> 3));
                i6 = i3 >> 14;
                if (i6 != 0) {
                    $i15 = i / i6;
                    i8 = $i3 / i6;
                    if ($i15 < 0) {
                        $i15 = 0;
                    } else if ($i15 > 16256) {
                        $i15 = 16256;
                    }
                } else {
                    $i15 = 0;
                    i8 = 0;
                }
                i7 = i + i9;
                i6 = $i3 + i10;
                $i3 = i3 + i11;
                i = $i3 >> 14;
                if (i != 0) {
                    i3 = i7 / i;
                    i = i6 / i;
                    if (i3 < 0) {
                        i3 = 0;
                    } else if (i3 > 16256) {
                        i3 = 16256;
                    }
                } else {
                    i3 = 0;
                    i = 0;
                }
                $i14 = ($i15 << 18) + i8;
                $i13 = (((i3 - $i15) >> 3) << 18) + ((i - i8) >> 3);
                i8 = i2 >> 3;
                i2 = $i4 << 3;
                $i4 = $i18 >> 8;
                if (this.pos) {
                    if (i8 > 0) {
                        $i15 = $i4;
                        $i4 = i8;
                        $i16 = $i17;
                        i8 = $i18;
                        while (true) {
                            $i19 = iArr2[($i14 >>> 25) + ($i14 & 16256)];
                            $i17 = $i16 + 1;
                            iArr[$i16] = (((($i19 & 16711935) * $i15) & -16711936) + (((65280 & $i19) * $i15) & 16711680)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 >>> 25) + ($i14 & 16256)];
                            $i18 = $i17 + 1;
                            iArr[$i17] = (((($i19 & 16711935) * $i15) & -16711936) + (((65280 & $i19) * $i15) & 16711680)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 >>> 25) + ($i14 & 16256)];
                            $i17 = $i18 + 1;
                            iArr[$i18] = (((($i19 & 65280) * $i15) & 16711680) + (((16711935 & $i19) * $i15) & -16711936)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 & 16256) + ($i14 >>> 25)];
                            $i18 = $i17 + 1;
                            iArr[$i17] = (((($i19 & 65280) * $i15) & 16711680) + (((16711935 & $i19) * $i15) & -16711936)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 & 16256) + ($i14 >>> 25)];
                            $i17 = $i18 + 1;
                            iArr[$i18] = (((($i19 & 65280) * $i15) & 16711680) + (((16711935 & $i19) * $i15) & -16711936)) >> 8;
                            $i14 += $i13;
                            $i19 = iArr2[($i14 & 16256) + ($i14 >>> 25)];
                            $i18 = $i17 + 1;
                            iArr[$i17] = (((($i19 & 65280) * $i15) & 16711680) + (((16711935 & $i19) * $i15) & -16711936)) >> 8;
                            $i17 = $i14 + $i13;
                            $i19 = iArr2[($i17 >>> 25) + ($i17 & 16256)];
                            $i14 = $i18 + 1;
                            iArr[$i18] = (((($i19 & 16711935) * $i15) & -16711936) + (((65280 & $i19) * $i15) & 16711680)) >> 8;
                            $i17 += $i13;
                            $i18 = iArr2[($i17 >>> 25) + ($i17 & 16256)];
                            $i17 = $i14 + 1;
                            iArr[$i14] = ((($i15 * ($i18 & 16711935)) & -16711936) + (((65280 & $i18) * $i15) & 16711680)) >> 8;
                            i7 += i9;
                            i6 += i10;
                            $i14 = $i3 + i11;
                            $i3 = $i14 >> 14;
                            if ($i3 != 0) {
                                $i15 = i7 / $i3;
                                $i13 = i6 / $i3;
                                if ($i15 < 0) {
                                    $i15 = 0;
                                } else if ($i15 > 16256) {
                                    $i15 = 16256;
                                }
                            } else {
                                $i15 = 0;
                                $i13 = 0;
                            }
                            $i18 = (i3 << 18) + i;
                            i3 = ((($i15 - i3) >> 3) << 18) + (($i13 - i) >> 3);
                            i8 += i2;
                            $i3 = i8 >> 8;
                            i = $i4 - 1;
                            if (i <= 0) {
                                break;
                            }
                            $i4 = i;
                            i = $i13;
                            $i13 = i3;
                            i3 = $i15;
                            $i15 = $i3;
                            $i3 = $i14;
                            $i16 = $i17;
                            $i14 = $i18;
                        }
                    } else {
                        i3 = $i13;
                        $i3 = $i4;
                        $i18 = $i14;
                    }
                    i = (i5 - i4) & 7;
                    if (i > 0) {
                        while (true) {
                            i5 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                            i4 = ((16711935 & i5) * $i3) & -16711936;
                            $i12 = i5 & 65280;
                            i5 = $i12;
                            iArr[$i17] = ((($i12 * $i3) & 16711680) + i4) >> 8;
                            $i18 += i3;
                            i--;
                            if (i <= 0) {
                                break;
                            }
                            $i17++;
                        }
                    }
                } else {
                    if (i8 > 0) {
                        $i15 = $i4;
                        $i4 = i8;
                        $i16 = $i17;
                        i8 = $i18;
                        while (true) {
                            $i18 = iArr2[($i14 >>> 25) + ($i14 & 16256)];
                            if ($i18 != 0) {
                                iArr[$i16] = (((($i18 & 65280) * $i15) & 16711680) + (((16711935 & $i18) * $i15) & -16711936)) >> 8;
                            }
                            $i17 = $i16 + 1;
                            $i18 = $i14 + $i13;
                            $i16 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 16711935) * $i15) & -16711936) + (((65280 & $i16) * $i15) & 16711680)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 >>> 25) + ($i18 & 16256)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 65280) * $i15) & 16711680) + (((16711935 & $i16) * $i15) & -16711936)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 >>> 25) + ($i18 & 16256)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 16711935) * $i15) & -16711936) + (((65280 & $i16) * $i15) & 16711680)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 >>> 25) + ($i18 & 16256)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 16711935) * $i15) & -16711936) + (((65280 & $i16) * $i15) & 16711680)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 65280) * $i15) & 16711680) + (((16711935 & $i16) * $i15) & -16711936)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i16 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                            if ($i16 != 0) {
                                iArr[$i17] = (((($i16 & 65280) * $i15) & 16711680) + (((16711935 & $i16) * $i15) & -16711936)) >> 8;
                            }
                            $i17++;
                            $i18 += $i13;
                            $i18 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                            if ($i18 != 0) {
                                iArr[$i17] = ((($i15 * ($i18 & 16711935)) & -16711936) + (((65280 & $i18) * $i15) & 16711680)) >> 8;
                            }
                            $i13 = $i17 + 1;
                            i7 += i9;
                            i6 += i10;
                            $i14 = $i3 + i11;
                            $i3 = $i14 >> 14;
                            if ($i3 != 0) {
                                $i17 = i7 / $i3;
                                $i15 = i6 / $i3;
                                if ($i17 < 0) {
                                    $i17 = 0;
                                } else if ($i17 > 16256) {
                                    $i17 = 16256;
                                }
                            } else {
                                $i17 = 0;
                                $i15 = 0;
                            }
                            $i18 = (i3 << 18) + i;
                            i3 = ((($i17 - i3) >> 3) << 18) + (($i15 - i) >> 3);
                            i8 += i2;
                            $i3 = i8 >> 8;
                            i = $i4 - 1;
                            if (i <= 0) {
                                break;
                            }
                            $i4 = i;
                            i = $i15;
                            $i15 = $i3;
                            $i3 = $i14;
                            $i16 = $i13;
                            $i14 = $i18;
                            $i13 = i3;
                            i3 = $i17;
                        }
                    } else {
                        i3 = $i13;
                        $i3 = $i4;
                        $i18 = $i14;
                        $i13 = $i17;
                    }
                    i = (i5 - i4) & 7;
                    if (i > 0) {
                        do {
                            i4 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                            if (i4 != 0) {
                                $i12 = i4 & 65280;
                                i4 = $i12;
                                iArr[$i13] = ((($i12 * $i3) & 16711680) + (((16711935 & i4) * $i3) & -16711936)) >> 8;
                            }
                            $i13++;
                            $i18 += i3;
                            i--;
                        } while (i > 0);
                    }
                }
            }
        }
    }

    final void encode(int[] iArr, int[] iArr2, int i, int i2, int $i2, int $i12, int i3, int i4, int $i4, int i5, int i6, int $i7, int $i8, int i7, int i8, int i9) {
        try {
            if (this.f201c) {
                if (i3 > this.buffer * 784773023) {
                    i3 = 784773023 * this.buffer;
                }
                if ($i12 < 0) {
                    $i12 = 0;
                }
            }
            if ($i12 < i3) {
                i9 = $i2 + $i12;
                i = i4 + ($i4 * $i12);
                $i2 = i3 - $i12;
                int $i82;
                if (this.value) {
                    i2 = $i12 - (-1575402035 * this.data);
                    i5 += i2 * $i8;
                    i6 += i7 * i2;
                    $i7 += i2 * i8;
                    i4 = $i7 >> 12;
                    if (i4 != 0) {
                        i2 = i5 / i4;
                        i4 = i6 / i4;
                    } else {
                        i2 = 0;
                        i4 = 0;
                    }
                    i5 += $i2 * $i8;
                    $i8 = ($i2 * i7) + i6;
                    $i7 = (($i2 * i8) + $i7) >> 12;
                    if ($i7 != 0) {
                        i6 = i5 / $i7;
                        $i7 = $i8 / $i7;
                    } else {
                        i6 = 0;
                        $i7 = 0;
                    }
                    i5 = (i2 << 20) + i4;
                    i2 = (($i7 - i4) / $i2) + (((i6 - i2) / $i2) << 20);
                    i6 = $i2 >> 3;
                    $i2 = $i4 << 3;
                    i4 = i >> 8;
                    if (this.pos) {
                        if (i6 > 0) {
                            $i4 = i6;
                            do {
                                $i8 = iArr2[(i5 >>> 26) + (i5 & 4032)];
                                i6 = i9 + 1;
                                $i7 = ((65280 & $i8) * i4) & 16711680;
                                $i82 = $i8 & 16711935;
                                $i8 = $i82;
                                iArr[i9] = ((($i82 * i4) & -16711936) + $i7) >> 8;
                                $i7 = i5 + i2;
                                i7 = iArr2[($i7 & 4032) + ($i7 >>> 26)];
                                i5 = i6 + 1;
                                $i8 = ((65280 & i7) * i4) & 16711680;
                                $i82 = i7 & 16711935;
                                i7 = $i82;
                                iArr[i6] = ((($i82 * i4) & -16711936) + $i8) >> 8;
                                $i82 = $i7 + i2;
                                $i7 = $i82;
                                i7 = iArr2[($i82 & 4032) + ($i7 >>> 26)];
                                i6 = i5 + 1;
                                $i8 = ((16711935 & i7) * i4) & -16711936;
                                $i82 = i7 & 65280;
                                i7 = $i82;
                                iArr[i5] = ((($i82 * i4) & 16711680) + $i8) >> 8;
                                $i82 = $i7 + i2;
                                $i7 = $i82;
                                i7 = iArr2[($i82 & 4032) + ($i7 >>> 26)];
                                i5 = i6 + 1;
                                $i8 = ((16711935 & i7) * i4) & -16711936;
                                $i82 = i7 & 65280;
                                i7 = $i82;
                                iArr[i6] = ((($i82 * i4) & 16711680) + $i8) >> 8;
                                $i7 += i2;
                                i7 = iArr2[($i7 >>> 26) + ($i7 & 4032)];
                                i6 = i5 + 1;
                                $i8 = ((16711935 & i7) * i4) & -16711936;
                                $i82 = i7 & 65280;
                                i7 = $i82;
                                iArr[i5] = ((($i82 * i4) & 16711680) + $i8) >> 8;
                                $i7 += i2;
                                i7 = iArr2[($i7 >>> 26) + ($i7 & 4032)];
                                i5 = i6 + 1;
                                $i8 = ((16711935 & i7) * i4) & -16711936;
                                $i82 = i7 & 65280;
                                i7 = $i82;
                                iArr[i6] = ((($i82 * i4) & 16711680) + $i8) >> 8;
                                $i7 += i2;
                                i7 = iArr2[($i7 >>> 26) + ($i7 & 4032)];
                                i6 = i5 + 1;
                                $i8 = ((16711935 & i7) * i4) & -16711936;
                                $i82 = i7 & 65280;
                                i7 = $i82;
                                iArr[i5] = ((($i82 * i4) & 16711680) + $i8) >> 8;
                                i5 = $i7 + i2;
                                $i8 = iArr2[(i5 & 4032) + (i5 >>> 26)];
                                i9 = i6 + 1;
                                $i7 = ((16711935 & $i8) * i4) & -16711936;
                                $i82 = (i4 * ($i8 & 65280)) & 16711680;
                                i4 = $i82;
                                iArr[i6] = ($i82 + $i7) >> 8;
                                i5 += i2;
                                i += $i2;
                                i4 = i >> 8;
                                $i4--;
                            } while ($i4 > 0);
                            $i4 = i5;
                            i = i4;
                            $i2 = i9;
                        } else {
                            $i2 = i9;
                            $i4 = i5;
                            i = i4;
                        }
                        $i12 = (i3 - $i12) & 7;
                        if ($i12 > 0) {
                            i3 = $i4;
                            while (true) {
                                i5 = iArr2[(i3 >>> 26) + (i3 & 4032)];
                                $i4 = ((65280 & i5) * i) & 16711680;
                                $i82 = i5 & 16711935;
                                i5 = $i82;
                                iArr[$i2] = ((($i82 * i) & -16711936) + $i4) >> 8;
                                $i12--;
                                if ($i12 <= 0) {
                                    break;
                                }
                                i3 += i2;
                                $i2++;
                            }
                        }
                    } else {
                        if (i6 > 0) {
                            $i4 = i6;
                            do {
                                $i7 = iArr2[(i5 >>> 26) + (i5 & 4032)];
                                if ($i7 != 0) {
                                    i6 = ((16711935 & $i7) * i4) & -16711936;
                                    $i82 = $i7 & 65280;
                                    $i7 = $i82;
                                    iArr[i9] = ((($i82 * i4) & 16711680) + i6) >> 8;
                                }
                                i6 = i9 + 1;
                                i5 += i2;
                                $i8 = iArr2[(i5 >>> 26) + (i5 & 4032)];
                                if ($i8 != 0) {
                                    $i7 = ((16711935 & $i8) * i4) & -16711936;
                                    $i82 = $i8 & 65280;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * i4) & 16711680) + $i7) >> 8;
                                }
                                i6++;
                                i5 += i2;
                                $i8 = iArr2[(i5 >>> 26) + (i5 & 4032)];
                                if ($i8 != 0) {
                                    $i7 = ((65280 & $i8) * i4) & 16711680;
                                    $i82 = $i8 & 16711935;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * i4) & -16711936) + $i7) >> 8;
                                }
                                i6++;
                                $i82 = i5 + i2;
                                i5 = $i82;
                                $i8 = iArr2[($i82 & 4032) + (i5 >>> 26)];
                                if ($i8 != 0) {
                                    $i7 = ((65280 & $i8) * i4) & 16711680;
                                    $i82 = $i8 & 16711935;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * i4) & -16711936) + $i7) >> 8;
                                }
                                i6++;
                                i5 += i2;
                                $i8 = iArr2[(i5 >>> 26) + (i5 & 4032)];
                                if ($i8 != 0) {
                                    $i7 = ((65280 & $i8) * i4) & 16711680;
                                    $i82 = $i8 & 16711935;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * i4) & -16711936) + $i7) >> 8;
                                }
                                i6++;
                                $i82 = i5 + i2;
                                i5 = $i82;
                                $i8 = iArr2[($i82 & 4032) + (i5 >>> 26)];
                                if ($i8 != 0) {
                                    $i7 = ((16711935 & $i8) * i4) & -16711936;
                                    $i82 = $i8 & 65280;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * i4) & 16711680) + $i7) >> 8;
                                }
                                i6++;
                                $i82 = i5 + i2;
                                i5 = $i82;
                                $i8 = iArr2[($i82 & 4032) + (i5 >>> 26)];
                                if ($i8 != 0) {
                                    $i7 = ((16711935 & $i8) * i4) & -16711936;
                                    $i82 = $i8 & 65280;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * i4) & 16711680) + $i7) >> 8;
                                }
                                i6++;
                                i5 += i2;
                                $i8 = iArr2[(i5 >>> 26) + (i5 & 4032)];
                                if ($i8 != 0) {
                                    $i7 = ((65280 & $i8) * i4) & 16711680;
                                    $i82 = (i4 * ($i8 & 16711935)) & -16711936;
                                    i4 = $i82;
                                    iArr[i6] = ($i82 + $i7) >> 8;
                                }
                                i9 = i6 + 1;
                                i5 += i2;
                                i += $i2;
                                i4 = i >> 8;
                                $i4--;
                            } while ($i4 > 0);
                        }
                        $i2 = (i3 - $i12) & 7;
                        if ($i2 > 0) {
                            i = i5;
                            do {
                                $i82 = i & 4032;
                                i3 = $i82;
                                i3 = iArr2[(i >>> 26) + $i82];
                                if (i3 != 0) {
                                    $i82 = i3 & 65280;
                                    i3 = $i82;
                                    iArr[i9] = ((($i82 * i4) & 16711680) + (((16711935 & i3) * i4) & -16711936)) >> 8;
                                }
                                i9++;
                                i += i2;
                                $i2--;
                            } while ($i2 > 0);
                        }
                    }
                } else {
                    i2 = $i12 - (this.data * -1575402035);
                    i5 += i2 * $i8;
                    i6 += i2 * i7;
                    $i7 += i2 * i8;
                    i2 = $i7 >> 14;
                    if (i2 != 0) {
                        i4 = i5 / i2;
                        i2 = i6 / i2;
                    } else {
                        i4 = 0;
                        i2 = 0;
                    }
                    i5 += $i8 * $i2;
                    i6 = (i7 * $i2) + i6;
                    $i8 = (($i2 * i8) + $i7) >> 14;
                    if ($i8 != 0) {
                        $i7 = i5 / $i8;
                        i6 /= $i8;
                    } else {
                        $i7 = 0;
                        i6 = 0;
                    }
                    i5 = (i4 << 18) + i2;
                    i2 = ((($i7 - i4) / $i2) << 18) + ((i6 - i2) / $i2);
                    i6 = $i2 >> 3;
                    i4 = $i4 << 3;
                    $i2 = i >> 8;
                    if (this.pos) {
                        if (i6 > 0) {
                            $i4 = i6;
                            while (true) {
                                $i8 = iArr2[(i5 >>> 25) + (i5 & 16256)];
                                i6 = i9 + 1;
                                $i7 = ((16711935 & $i8) * $i2) & -16711936;
                                $i82 = $i8 & 65280;
                                $i8 = $i82;
                                iArr[i9] = ((($i82 * $i2) & 16711680) + $i7) >> 8;
                                $i7 = i5 + i2;
                                i7 = iArr2[($i7 >>> 25) + ($i7 & 16256)];
                                i5 = i6 + 1;
                                $i8 = ((16711935 & i7) * $i2) & -16711936;
                                $i82 = i7 & 65280;
                                i7 = $i82;
                                iArr[i6] = ((($i82 * $i2) & 16711680) + $i8) >> 8;
                                $i7 += i2;
                                i7 = iArr2[($i7 >>> 25) + ($i7 & 16256)];
                                i6 = i5 + 1;
                                $i8 = ((16711935 & i7) * $i2) & -16711936;
                                $i82 = i7 & 65280;
                                i7 = $i82;
                                iArr[i5] = ((($i82 * $i2) & 16711680) + $i8) >> 8;
                                $i82 = $i7 + i2;
                                $i7 = $i82;
                                i7 = iArr2[($i82 & 16256) + ($i7 >>> 25)];
                                i5 = i6 + 1;
                                $i8 = ((65280 & i7) * $i2) & 16711680;
                                $i82 = i7 & 16711935;
                                i7 = $i82;
                                iArr[i6] = ((($i82 * $i2) & -16711936) + $i8) >> 8;
                                $i82 = $i7 + i2;
                                $i7 = $i82;
                                i7 = iArr2[($i82 & 16256) + ($i7 >>> 25)];
                                i6 = i5 + 1;
                                $i8 = ((65280 & i7) * $i2) & 16711680;
                                $i82 = i7 & 16711935;
                                i7 = $i82;
                                iArr[i5] = ((($i82 * $i2) & -16711936) + $i8) >> 8;
                                $i82 = $i7 + i2;
                                $i7 = $i82;
                                i7 = iArr2[($i82 & 16256) + ($i7 >>> 25)];
                                i5 = i6 + 1;
                                $i8 = ((65280 & i7) * $i2) & 16711680;
                                $i82 = i7 & 16711935;
                                i7 = $i82;
                                iArr[i6] = ((($i82 * $i2) & -16711936) + $i8) >> 8;
                                i6 = $i7 + i2;
                                i7 = iArr2[(i6 & 16256) + (i6 >>> 25)];
                                $i7 = i5 + 1;
                                $i8 = ((65280 & i7) * $i2) & 16711680;
                                $i82 = i7 & 16711935;
                                i7 = $i82;
                                iArr[i5] = ((($i82 * $i2) & -16711936) + $i8) >> 8;
                                i5 = i6 + i2;
                                i7 = iArr2[(i5 >>> 25) + (i5 & 16256)];
                                i6 = $i7 + 1;
                                $i8 = ((16711935 & i7) * $i2) & -16711936;
                                $i82 = i7 & 65280;
                                i7 = $i82;
                                iArr[$i7] = ((($i2 * $i82) & 16711680) + $i8) >> 8;
                                i5 += i2;
                                i += i4;
                                $i2 = i >> 8;
                                $i4--;
                                if ($i4 <= 0) {
                                    break;
                                }
                                i9 = i6;
                            }
                            i = $i2;
                        } else {
                            i6 = i9;
                            i = $i2;
                        }
                        $i2 = (i3 - $i12) & 7;
                        if ($i2 > 0) {
                            $i12 = i5;
                            while (true) {
                                $i4 = iArr2[($i12 & 16256) + ($i12 >>> 25)];
                                i4 = ((16711935 & $i4) * i) & -16711936;
                                $i82 = $i4 & 65280;
                                $i4 = $i82;
                                iArr[i6] = ((($i82 * i) & 16711680) + i4) >> 8;
                                $i2--;
                                if ($i2 <= 0) {
                                    break;
                                }
                                $i12 += i2;
                                i6++;
                            }
                        }
                    } else {
                        if (i6 > 0) {
                            $i4 = i6;
                            while (true) {
                                $i7 = iArr2[(i5 >>> 25) + (i5 & 16256)];
                                if ($i7 != 0) {
                                    i6 = ((65280 & $i7) * $i2) & 16711680;
                                    $i82 = $i7 & 16711935;
                                    $i7 = $i82;
                                    iArr[i9] = ((($i82 * $i2) & -16711936) + i6) >> 8;
                                }
                                i6 = i9 + 1;
                                $i82 = i5 + i2;
                                i5 = $i82;
                                $i8 = iArr2[($i82 & 16256) + (i5 >>> 25)];
                                if ($i8 != 0) {
                                    $i7 = ((16711935 & $i8) * $i2) & -16711936;
                                    $i82 = $i8 & 65280;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * $i2) & 16711680) + $i7) >> 8;
                                }
                                i6++;
                                $i82 = i5 + i2;
                                i5 = $i82;
                                $i8 = iArr2[($i82 & 16256) + (i5 >>> 25)];
                                if ($i8 != 0) {
                                    $i7 = ((65280 & $i8) * $i2) & 16711680;
                                    $i82 = $i8 & 16711935;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * $i2) & -16711936) + $i7) >> 8;
                                }
                                i6++;
                                i5 += i2;
                                $i8 = iArr2[(i5 >>> 25) + (i5 & 16256)];
                                if ($i8 != 0) {
                                    $i7 = ((16711935 & $i8) * $i2) & -16711936;
                                    $i82 = $i8 & 65280;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * $i2) & 16711680) + $i7) >> 8;
                                }
                                i6++;
                                i5 += i2;
                                $i8 = iArr2[(i5 >>> 25) + (i5 & 16256)];
                                if ($i8 != 0) {
                                    $i7 = ((65280 & $i8) * $i2) & 16711680;
                                    $i82 = $i8 & 16711935;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * $i2) & -16711936) + $i7) >> 8;
                                }
                                i6++;
                                i5 += i2;
                                $i8 = iArr2[(i5 >>> 25) + (i5 & 16256)];
                                if ($i8 != 0) {
                                    $i7 = ((16711935 & $i8) * $i2) & -16711936;
                                    $i82 = $i8 & 65280;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * $i2) & 16711680) + $i7) >> 8;
                                }
                                i6++;
                                i5 += i2;
                                $i8 = iArr2[(i5 >>> 25) + (i5 & 16256)];
                                if ($i8 != 0) {
                                    $i7 = ((65280 & $i8) * $i2) & 16711680;
                                    $i82 = $i8 & 16711935;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i82 * $i2) & -16711936) + $i7) >> 8;
                                }
                                i6++;
                                $i82 = i5 + i2;
                                i5 = $i82;
                                $i8 = iArr2[($i82 & 16256) + (i5 >>> 25)];
                                if ($i8 != 0) {
                                    $i7 = ((65280 & $i8) * $i2) & 16711680;
                                    $i82 = $i8 & 16711935;
                                    $i8 = $i82;
                                    iArr[i6] = ((($i2 * $i82) & -16711936) + $i7) >> 8;
                                }
                                i6++;
                                i5 += i2;
                                i += i4;
                                $i2 = i >> 8;
                                $i4--;
                                if ($i4 <= 0) {
                                    break;
                                }
                                i9 = i6;
                            }
                        } else {
                            i6 = i9;
                        }
                        i3 = (i3 - $i12) & 7;
                        if (i3 > 0) {
                            i = i5;
                            $i12 = i6;
                            do {
                                $i4 = iArr2[(i & 16256) + (i >>> 25)];
                                if ($i4 != 0) {
                                    i4 = ((65280 & $i4) * $i2) & 16711680;
                                    $i82 = $i4 & 16711935;
                                    $i4 = $i82;
                                    iArr[$i12] = ((($i82 * $i2) & -16711936) + i4) >> 8;
                                }
                                $i12++;
                                i += i2;
                                i3--;
                            } while (i3 > 0);
                        }
                    }
                }
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cj.ak(" + ')');
        }
    }

    public void get() {
    }

    public void get(int i) {
    }

    final void get(int $i17, int $i18, int $i19, int $i0, int i, int i2, int i3, int $i4, int $i5, int $i6, int i4, int i5, int i6, int $i10, int i7, int $i12, int i8, int i9, int i10) {
        int[] $r2 = Point.type.get(i10, (short) 255);
        if ($r2 == null) {
            $i6 = Point.type.toString(i10, 1577195485);
            getSize($i17, $i18, $i19, $i0, i, i2, Calendar.get($i6, i3, -2114752856), Calendar.get($i6, $i4, -2109001187), Calendar.get($i6, $i5, -2115506335), 1954783136);
            return;
        }
        this.value = Point.type.add(i10, 734833600);
        this.pos = Point.type.equals(i10, 1183408112);
        int $i20 = i - $i0;
        i10 = $i18 - $i17;
        int $i16 = i2 - $i0;
        int $i21 = $i19 - $i17;
        int $i22 = $i4 - i3;
        int $i23 = $i5 - i3;
        int i11 = $i18 != $i17 ? ((i - $i0) << 14) / ($i18 - $i17) : 0;
        int i12 = $i18 != $i19 ? ((i2 - i) << 14) / ($i19 - $i18) : 0;
        int i13 = $i17 != $i19 ? (($i0 - i2) << 14) / ($i17 - $i19) : 0;
        int i14 = ($i20 * $i21) - ($i16 * i10);
        if (i14 != 0) {
            i10 = ((($i21 * $i22) - (i10 * $i23)) << 9) / i14;
            $i16 = ((($i20 * $i23) - ($i22 * $i16)) << 9) / i14;
            $i22 = $i6 - i4;
            $i10 = i6 - $i10;
            $i20 = $i12 - i8;
            $i23 = i5 - $i6;
            $i21 = i7 - i6;
            i7 = i9 - $i12;
            i8 = ((i6 * $i23) - ($i6 * $i21)) << 14;
            long $l29 = ($i21 * $i12) - (i7 * i6);
            Object obj = $l29;
            int $i7 = ((((long) $l29) << 3) << 14) / ((long) (542614623 * this.this$0));
            long j = $i7;
            i4 = (int) $i7;
            $i7 = ($i6 * i7) - ($i23 * $i12);
            i5 = $i7;
            $i7 = (((long) $i7) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            i5 = (int) $i7;
            i9 = (($i22 * i6) - ($i10 * $i6)) << 14;
            $i7 = ((((long) (($i10 * $i12) - (i6 * $i20))) << 3) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            i6 = (int) $i7;
            $i7 = ($i6 * $i20) - ($i22 * $i12);
            $i6 = $i7;
            j = ((long) $i7) << 14;
            $l29 = this.this$0 * 542614623;
            Object obj2 = $l29;
            $l29 = j / ((long) $l29);
            j = $l29;
            $i6 = (int) $l29;
            $i12 = (($i10 * $i23) - ($i22 * $i21)) << 14;
            $i7 = ((((long) (($i21 * $i20) - ($i10 * i7))) << 3) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            $i10 = (int) $i7;
            $i7 = ($i22 * i7) - ($i20 * $i23);
            i7 = $i7;
            j = ((long) $i7) << 14;
            $l29 = this.this$0 * 542614623;
            Object obj3 = $l29;
            $l29 = j / ((long) $l29);
            j = $l29;
            i7 = (int) $l29;
            if ($i17 > $i18 || $i17 > $i19) {
                if ($i18 <= $i19) {
                    if ($i18 < -1759402563 * this.length) {
                        if ($i19 > -1759402563 * this.length) {
                            $i19 = this.length * -1759402563;
                        }
                        if ($i17 > this.length * -1759402563) {
                            $i17 = this.length * -1759402563;
                        }
                        $i7 = ($i4 << 9) - (i10 * i);
                        i3 = $i7;
                        i3 = $i7 + i10;
                        if ($i19 >= $i17) {
                            $i5 = i << 14;
                            if ($i18 < 0) {
                                $i22 = $i5 - (i11 * $i18);
                                $i5 -= i12 * $i18;
                                i3 -= $i16 * $i18;
                                $i18 = 0;
                            } else {
                                $i22 = $i5;
                            }
                            $i0 <<= 14;
                            if ($i17 < 0) {
                                $i0 -= i13 * $i17;
                                $i17 = 0;
                            }
                            $i4 = $i18 - (this.parent * -1508152919);
                            i = i8 + ($i4 * i5);
                            i2 = i9 + ($i6 * $i4);
                            $i4 = $i12 + ($i4 * i7);
                            if (i11 >= i12) {
                                $i19 -= $i17;
                                i8 = $i17 - $i18;
                                $i17 = this.next[$i18];
                                $i18 = i3;
                                $i12 = $i22;
                                i3 = $i5;
                                $i5 = i8;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i12 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                    i3 += i12;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i4 += i7;
                                    $i12 += i11;
                                }
                                while (true) {
                                    $i19--;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i0 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                    $i0 += i13;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i4 += i7;
                                    i3 += i12;
                                }
                            } else {
                                $i19 -= $i17;
                                i8 = $i17 - $i18;
                                $i17 = this.next[$i18];
                                $i18 = i3;
                                $i12 = $i22;
                                i3 = $i5;
                                $i5 = i8;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i12 >> 14, i3 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                    i3 += i12;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i4 += i7;
                                    $i12 += i11;
                                }
                                while (true) {
                                    $i19--;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i0 >> 14, i3 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                    $i0 += i13;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i += i5;
                                    i2 += $i6;
                                    $i4 += i7;
                                    i3 += i12;
                                }
                            }
                        } else {
                            $i22 = i << 14;
                            if ($i18 < 0) {
                                $i5 = $i22 - ($i18 * i11);
                                $i22 -= i12 * $i18;
                                i3 -= $i16 * $i18;
                                $i18 = 0;
                            } else {
                                $i5 = $i22;
                            }
                            $i0 = i2 << 14;
                            if ($i19 < 0) {
                                $i0 -= $i19 * i13;
                                $i19 = 0;
                            }
                            $i4 = $i18 - (-1508152919 * this.parent);
                            i = i8 + (i5 * $i4);
                            i2 = i9 + ($i4 * $i6);
                            $i4 = $i12 + ($i4 * i7);
                            if (($i18 != $i19 && i11 < i12) || ($i19 == $i18 && i11 > i13)) {
                                $i12 = $i17 - $i19;
                                i8 = $i19 - $i18;
                                $i17 = this.next[$i18];
                                $i18 = i3;
                                i3 = $i22;
                                $i19 = $i5;
                                $i5 = i8;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i19 >> 14, i3 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                    $i19 += i11;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i4 += i7;
                                    i3 += i12;
                                }
                                i3 = $i19;
                                $i19 = $i12;
                                while (true) {
                                    $i19--;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i0 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                    $i0 += i13;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i4 += i7;
                                    i3 += i11;
                                }
                            } else {
                                $i12 = $i17 - $i19;
                                i8 = $i19 - $i18;
                                $i17 = this.next[$i18];
                                $i18 = i3;
                                i3 = $i22;
                                $i19 = $i5;
                                $i5 = i8;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i19 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                    $i19 += i11;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i4 += i7;
                                    i3 += i12;
                                }
                                i3 = $i19;
                                $i19 = $i12;
                                while (true) {
                                    $i19--;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i0 >> 14, i3 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                    $i0 += i13;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i += i5;
                                    i2 += $i6;
                                    $i4 += i7;
                                    i3 += i11;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                if ($i19 < this.length * -1759402563) {
                    if ($i17 > this.length * -1759402563) {
                        $i17 = this.length * -1759402563;
                    }
                    if ($i18 > -1759402563 * this.length) {
                        $i18 = this.length * -1759402563;
                    }
                    $i7 = ($i5 << 9) - (i10 * i2);
                    i3 = $i7;
                    i3 = $i7 + i10;
                    if ($i17 >= $i18) {
                        $i22 = i2 << 14;
                        if ($i19 < 0) {
                            $i5 = $i22 - (i12 * $i19);
                            $i22 -= i13 * $i19;
                            i3 -= $i16 * $i19;
                            $i19 = 0;
                        } else {
                            $i5 = $i22;
                        }
                        $i0 = i << 14;
                        if ($i18 < 0) {
                            $i0 -= $i18 * i11;
                            $i18 = 0;
                        }
                        $i4 = $i19 - (this.parent * -1508152919);
                        i = i8 + (i5 * $i4);
                        i2 = i9 + ($i6 * $i4);
                        $i4 = $i12 + ($i4 * i7);
                        if (i12 >= i13) {
                            $i12 = $i17 - $i18;
                            i8 = $i18 - $i19;
                            $i17 = this.next[$i19];
                            $i18 = i3;
                            $i19 = $i22;
                            i3 = i8;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i19 >> 14, $i5 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                $i19 += i13;
                                $i18 += $i16;
                                $i17 += this.size * -1741252353;
                                i += i5;
                                i2 += $i6;
                                $i4 += i7;
                                $i5 += i12;
                            }
                            i3 = $i19;
                            $i19 = $i12;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i0 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                $i0 += i11;
                                $i18 += $i16;
                                $i17 += this.size * -1741252353;
                                i += i5;
                                i2 += $i6;
                                $i4 += i7;
                                i3 += i13;
                            }
                        } else {
                            $i12 = $i17 - $i18;
                            i8 = $i18 - $i19;
                            $i17 = this.next[$i19];
                            $i18 = i3;
                            $i19 = $i22;
                            i3 = i8;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i19 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                $i19 += i13;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i += i5;
                                i2 += $i6;
                                $i4 += i7;
                                $i5 += i12;
                            }
                            i3 = $i19;
                            $i19 = $i12;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i0 >> 14, i3 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                $i0 += i11;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i += i5;
                                i2 += $i6;
                                $i4 += i7;
                                i3 += i13;
                            }
                        }
                    } else {
                        $i22 = i2 << 14;
                        if ($i19 < 0) {
                            $i5 = $i22 - (i12 * $i19);
                            $i22 -= $i19 * i13;
                            i3 -= $i16 * $i19;
                            $i19 = 0;
                        } else {
                            $i5 = $i22;
                        }
                        $i0 <<= 14;
                        if ($i17 < 0) {
                            $i0 -= i11 * $i17;
                            $i17 = 0;
                        }
                        $i4 = $i19 - (this.parent * -1508152919);
                        i = i8 + ($i4 * i5);
                        i2 = i9 + ($i6 * $i4);
                        $i4 = $i12 + ($i4 * i7);
                        if (i12 >= i13) {
                            $i12 = $i18 - $i17;
                            i8 = $i17 - $i19;
                            $i17 = this.next[$i19];
                            $i18 = i3;
                            i3 = $i22;
                            $i19 = $i5;
                            $i5 = i8;
                            while (true) {
                                $i5--;
                                if ($i5 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i19 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                $i19 += i12;
                                $i18 += $i16;
                                $i17 += this.size * -1741252353;
                                i += i5;
                                i2 += $i6;
                                $i4 += i7;
                                i3 += i13;
                            }
                            i3 = $i19;
                            $i19 = $i12;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i0 >> 14, i3 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                $i0 += i11;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i += i5;
                                i2 += $i6;
                                $i4 += i7;
                                i3 += i12;
                            }
                        } else {
                            $i12 = $i18 - $i17;
                            i8 = $i17 - $i19;
                            $i17 = this.next[$i19];
                            $i18 = i3;
                            i3 = $i22;
                            $i19 = $i5;
                            $i5 = i8;
                            while (true) {
                                $i5--;
                                if ($i5 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i19 >> 14, i3 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                $i19 += i12;
                                $i18 += $i16;
                                $i17 += this.size * -1741252353;
                                i += i5;
                                i2 += $i6;
                                $i4 += i7;
                                i3 += i13;
                            }
                            i3 = $i19;
                            $i19 = $i12;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i0 >> 14, $i18, i10, i, i2, $i4, i4, i6, $i10, 1245522068);
                                $i0 += i11;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i += i5;
                                i2 += $i6;
                                $i4 += i7;
                                i3 += i12;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            if ($i17 < this.length * -1759402563) {
                if ($i18 > -1759402563 * this.length) {
                    $i18 = -1759402563 * this.length;
                }
                $i5 = $i19 > this.length * -1759402563 ? -1759402563 * this.length : $i19;
                i3 = ((i3 << 9) - (i10 * $i0)) + i10;
                if ($i18 >= $i5) {
                    $i0 <<= 14;
                    if ($i17 < 0) {
                        $i22 = $i0 - (i13 * $i17);
                        $i4 = $i0 - ($i17 * i11);
                        $i19 = i3 - ($i16 * $i17);
                        $i17 = 0;
                    } else {
                        $i19 = i3;
                        $i22 = $i0;
                        $i4 = $i0;
                    }
                    $i0 = i2 << 14;
                    if ($i5 < 0) {
                        $i0 -= $i5 * i12;
                        $i5 = 0;
                    }
                    i3 = $i17 - (-1508152919 * this.parent);
                    i = i8 + (i5 * i3);
                    i2 = i9 + (i3 * $i6);
                    i3 = $i12 + (i3 * i7);
                    if (($i5 != $i17 && i13 < i11) || ($i17 == $i5 && i12 > i11)) {
                        $i18 -= $i5;
                        $i5 -= $i17;
                        $i17 = this.next[$i17];
                        $i12 = $i22;
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i12 >> 14, $i4 >> 14, $i19, i10, i, i2, i3, i4, i6, $i10, 1245522068);
                            $i4 += i11;
                            $i19 += $i16;
                            $i17 += -1741252353 * this.size;
                            i += i5;
                            i2 += $i6;
                            i3 += i7;
                            $i12 += i13;
                        }
                        while (true) {
                            $i18--;
                            if ($i18 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i0 >> 14, $i4 >> 14, $i19, i10, i, i2, i3, i4, i6, $i10, 1245522068);
                            $i0 += i12;
                            $i19 += $i16;
                            $i17 += this.size * -1741252353;
                            i += i5;
                            i2 += $i6;
                            i3 += i7;
                            $i4 += i11;
                        }
                    } else {
                        $i18 -= $i5;
                        $i5 -= $i17;
                        $i17 = this.next[$i17];
                        $i12 = $i22;
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i4 >> 14, $i12 >> 14, $i19, i10, i, i2, i3, i4, i6, $i10, 1245522068);
                            $i4 += i11;
                            $i19 += $i16;
                            $i17 += this.size * -1741252353;
                            i += i5;
                            i2 += $i6;
                            i3 += i7;
                            $i12 += i13;
                        }
                        while (true) {
                            $i18--;
                            if ($i18 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i4 >> 14, $i0 >> 14, $i19, i10, i, i2, i3, i4, i6, $i10, 1245522068);
                            $i0 += i12;
                            $i19 += $i16;
                            $i17 += -1741252353 * this.size;
                            i += i5;
                            i2 += $i6;
                            i3 += i7;
                            $i4 += i11;
                        }
                    }
                } else {
                    $i4 = $i0 << 14;
                    if ($i17 < 0) {
                        $i22 = $i4 - ($i17 * i13);
                        $i4 -= i11 * $i17;
                        i3 -= $i17 * $i16;
                        $i17 = 0;
                    } else {
                        $i22 = $i4;
                    }
                    $i19 = i << 14;
                    if ($i18 < 0) {
                        $i19 -= $i18 * i12;
                        $i18 = 0;
                    }
                    i2 = $i17 - (-1508152919 * this.parent);
                    $i0 = i8 + (i5 * i2);
                    i = i9 + (i2 * $i6);
                    i2 = $i12 + (i2 * i7);
                    if (($i18 != $i17 && i13 < i11) || ($i18 == $i17 && i13 > i12)) {
                        $i5 -= $i18;
                        $i12 = $i18 - $i17;
                        $i17 = this.next[$i17];
                        $i18 = i3;
                        i3 = $i22;
                        i8 = $i4;
                        $i4 = $i12;
                        while (true) {
                            $i4--;
                            if ($i4 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, i3 >> 14, i8 >> 14, $i18, i10, $i0, i, i2, i4, i6, $i10, 1245522068);
                            i3 += i13;
                            $i18 += $i16;
                            $i17 += -1741252353 * this.size;
                            $i0 += i5;
                            i += $i6;
                            i2 += i7;
                            i8 += i11;
                        }
                        $i4 = i3;
                        i3 = $i5;
                        while (true) {
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i4 >> 14, $i19 >> 14, $i18, i10, $i0, i, i2, i4, i6, $i10, 1245522068);
                            $i19 += i12;
                            $i18 += $i16;
                            $i17 += this.size * -1741252353;
                            $i0 += i5;
                            i += $i6;
                            i2 += i7;
                            $i4 += i13;
                        }
                    } else {
                        $i5 -= $i18;
                        $i12 = $i18 - $i17;
                        $i17 = this.next[$i17];
                        $i18 = i3;
                        i3 = $i22;
                        i8 = $i4;
                        $i4 = $i12;
                        while (true) {
                            $i4--;
                            if ($i4 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, i8 >> 14, i3 >> 14, $i18, i10, $i0, i, i2, i4, i6, $i10, 1245522068);
                            i3 += i13;
                            $i18 += $i16;
                            $i17 += this.size * -1741252353;
                            $i0 += i5;
                            i += $i6;
                            i2 += i7;
                            i8 += i11;
                        }
                        $i4 = i3;
                        i3 = $i5;
                        while (true) {
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i19 >> 14, $i4 >> 14, $i18, i10, $i0, i, i2, i4, i6, $i10, 1245522068);
                            $i19 += i12;
                            $i18 += $i16;
                            $i17 += -1741252353 * this.size;
                            $i0 += i5;
                            i += $i6;
                            i2 += i7;
                            $i4 += i13;
                        }
                    }
                }
            }
        }
    }

    final void get(int $i17, int $i18, int i, int i2, int i3, int $i2, int $i3, int i4, int $i5, int $i6, int i5, int i6, int i7, int $i10, int i8, int i9, int i10, int i11, int i12, int i13) {
        try {
            int[] $r2 = Point.type.get(i12, (short) 255);
            if ($r2 == null) {
                $i6 = Point.type.toString(i12, 1577195485);
                getSize($i17, $i18, i, i2, i3, $i2, Calendar.get($i6, $i3, -2104684649), Calendar.get($i6, i4, -2118224208), Calendar.get($i6, $i5, -2138679208), 1843687308);
                return;
            }
            this.value = Point.type.add(i12, -411837604);
            this.pos = Point.type.equals(i12, 888214636);
            int $i20 = i3 - i2;
            i12 = $i18 - $i17;
            i13 = $i2 - i2;
            int $i21 = i - $i17;
            int $i22 = i4 - $i3;
            int $i23 = $i5 - $i3;
            int i14 = $i18 != $i17 ? ((i3 - i2) << 14) / ($i18 - $i17) : 0;
            int i15 = i != $i18 ? (($i2 - i3) << 14) / (i - $i18) : 0;
            int i16 = $i17 != i ? ((i2 - $i2) << 14) / ($i17 - i) : 0;
            int i17 = ($i21 * $i20) - (i13 * i12);
            if (i17 != 0) {
                i12 = ((($i21 * $i22) - (i12 * $i23)) << 9) / i17;
                i13 = ((($i20 * $i23) - ($i22 * i13)) << 9) / i17;
                $i22 = $i6 - i5;
                $i10 = i7 - $i10;
                $i20 = i9 - i10;
                $i23 = i6 - $i6;
                $i21 = i8 - i7;
                i8 = i11 - i9;
                i10 = (($i23 * i7) - ($i6 * $i21)) << 14;
                long $l29 = (i9 * $i21) - (i7 * i8);
                Object obj = $l29;
                int $i7 = (((long) $l29) << 14) / ((long) (542614623 * this.this$0));
                long j = $i7;
                i5 = (int) $i7;
                $i7 = (i8 * $i6) - (i9 * $i23);
                i6 = $i7;
                $i7 = (((long) $i7) << 14) / ((long) (542614623 * this.this$0));
                j = $i7;
                i6 = (int) $i7;
                i11 = ((i7 * $i22) - ($i6 * $i10)) << 14;
                j = ((long) (($i10 * i9) - ($i20 * i7))) << 14;
                $l29 = this.this$0 * 542614623;
                Object obj2 = $l29;
                $l29 = j / ((long) $l29);
                j = $l29;
                i7 = (int) $l29;
                $i7 = ($i6 * $i20) - (i9 * $i22);
                $i6 = $i7;
                j = ((long) $i7) << 14;
                $l29 = this.this$0 * 542614623;
                Object obj3 = $l29;
                $l29 = j / ((long) $l29);
                j = $l29;
                $i6 = (int) $l29;
                i9 = (($i23 * $i10) - ($i22 * $i21)) << 14;
                $i7 = (((long) (($i21 * $i20) - ($i10 * i8))) << 14) / ((long) (542614623 * this.this$0));
                j = $i7;
                $i10 = (int) $i7;
                $i7 = ($i22 * i8) - ($i23 * $i20);
                i8 = $i7;
                $i7 = (((long) $i7) << 14) / ((long) (542614623 * this.this$0));
                j = $i7;
                i8 = (int) $i7;
                if ($i17 > $i18 || $i17 > i) {
                    if ($i18 > i) {
                        if (i < this.length * -1759402563) {
                            i4 = $i17 > -1759402563 * this.length ? -1759402563 * this.length : $i17;
                            if ($i18 > -1759402563 * this.length) {
                                $i18 = -1759402563 * this.length;
                            }
                            $i3 = (($i5 << 9) - (i12 * $i2)) + i12;
                            if (i4 >= $i18) {
                                $i22 = $i2 << 14;
                                if (i < 0) {
                                    $i5 = $i22 - (i * i15);
                                    $i22 -= i16 * i;
                                    $i3 -= i13 * i;
                                    i = 0;
                                } else {
                                    $i5 = $i22;
                                }
                                i3 <<= 14;
                                if ($i18 < 0) {
                                    i3 -= $i18 * i14;
                                    $i18 = 0;
                                }
                                $i2 = i - (-1508152919 * this.parent);
                                $i17 = i10 + ($i2 * i6);
                                i2 = i11 + ($i2 * $i6);
                                $i2 = i9 + ($i2 * i8);
                                if (i15 >= i16) {
                                    i4 -= $i18;
                                    i10 = $i18 - i;
                                    $i18 = this.next[i];
                                    i = $i3;
                                    $i3 = $i22;
                                    i9 = $i5;
                                    $i5 = i10;
                                    while (true) {
                                        $i5--;
                                        if ($i5 < 0) {
                                            break;
                                        }
                                        encode(this.size, $r2, 0, 0, $i18, $i3 >> 14, i9 >> 14, i, i12, $i17, i2, $i2, i5, i7, $i10, 68239216);
                                        $i3 += i16;
                                        i += i13;
                                        $i18 += this.size * -1741252353;
                                        $i17 += i6;
                                        i2 += $i6;
                                        $i2 += i8;
                                        i9 += i15;
                                    }
                                    $i5 = i4;
                                    i4 = i3;
                                    while (true) {
                                        i3 = $i5 - 1;
                                        if (i3 < 0) {
                                            break;
                                        }
                                        encode(this.size, $r2, 0, 0, $i18, $i3 >> 14, i4 >> 14, i, i12, $i17, i2, $i2, i5, i7, $i10, 68239216);
                                        i += i13;
                                        $i18 += this.size * -1741252353;
                                        $i17 += i6;
                                        i2 += $i6;
                                        $i2 += i8;
                                        $i3 += i16;
                                        i4 += i14;
                                        $i5 = i3;
                                    }
                                } else {
                                    i4 -= $i18;
                                    i9 = $i18 - i;
                                    $i18 = this.next[i];
                                    i = $i3;
                                    $i3 = $i22;
                                    i10 = $i5;
                                    $i5 = i9;
                                    while (true) {
                                        $i5--;
                                        if ($i5 < 0) {
                                            break;
                                        }
                                        encode(this.size, $r2, 0, 0, $i18, i10 >> 14, $i3 >> 14, i, i12, $i17, i2, $i2, i5, i7, $i10, 68239216);
                                        $i3 += i16;
                                        i += i13;
                                        $i18 += this.size * -1741252353;
                                        $i17 += i6;
                                        i2 += $i6;
                                        $i2 += i8;
                                        i10 += i15;
                                    }
                                    $i5 = $i3;
                                    $i3 = i4;
                                    while (true) {
                                        $i3--;
                                        if ($i3 < 0) {
                                            break;
                                        }
                                        encode(this.size, $r2, 0, 0, $i18, i3 >> 14, $i5 >> 14, i, i12, $i17, i2, $i2, i5, i7, $i10, 68239216);
                                        i3 += i14;
                                        i += i13;
                                        $i18 += this.size * -1741252353;
                                        $i17 += i6;
                                        i2 += $i6;
                                        $i2 += i8;
                                        $i5 += i16;
                                    }
                                }
                            } else {
                                $i22 = $i2 << 14;
                                if (i < 0) {
                                    $i5 = $i22 - (i15 * i);
                                    $i22 -= i * i16;
                                    $i3 -= i13 * i;
                                    i = 0;
                                } else {
                                    $i5 = $i22;
                                }
                                i3 = i2 << 14;
                                if (i4 < 0) {
                                    i3 -= i4 * i14;
                                    i4 = 0;
                                }
                                $i2 = i - (-1508152919 * this.parent);
                                $i17 = i10 + ($i2 * i6);
                                i2 = i11 + ($i6 * $i2);
                                $i2 = i9 + ($i2 * i8);
                                if (i15 >= i16) {
                                    i9 = $i18 - i4;
                                    i10 = i4 - i;
                                    $i18 = this.next[i];
                                    i = $i3;
                                    i4 = $i22;
                                    $i3 = $i5;
                                    $i5 = i10;
                                    while (true) {
                                        $i5--;
                                        if ($i5 < 0) {
                                            break;
                                        }
                                        encode(this.size, $r2, 0, 0, $i18, i4 >> 14, $i3 >> 14, i, i12, $i17, i2, $i2, i5, i7, $i10, 68239216);
                                        $i3 += i15;
                                        i += i13;
                                        $i18 += -1741252353 * this.size;
                                        $i17 += i6;
                                        i2 += $i6;
                                        $i2 += i8;
                                        i4 += i16;
                                    }
                                    $i5 = i9;
                                    i4 = i3;
                                    while (true) {
                                        i3 = $i5 - 1;
                                        if (i3 < 0) {
                                            break;
                                        }
                                        encode(this.size, $r2, 0, 0, $i18, i4 >> 14, $i3 >> 14, i, i12, $i17, i2, $i2, i5, i7, $i10, 68239216);
                                        i += i13;
                                        $i18 += this.size * -1741252353;
                                        $i17 += i6;
                                        i2 += $i6;
                                        $i2 += i8;
                                        $i3 += i15;
                                        i4 += i14;
                                        $i5 = i3;
                                    }
                                } else {
                                    i9 = $i18 - i4;
                                    i10 = i4 - i;
                                    $i18 = this.next[i];
                                    i = $i3;
                                    i4 = $i22;
                                    $i3 = $i5;
                                    $i5 = i10;
                                    while (true) {
                                        $i5--;
                                        if ($i5 < 0) {
                                            break;
                                        }
                                        encode(this.size, $r2, 0, 0, $i18, $i3 >> 14, i4 >> 14, i, i12, $i17, i2, $i2, i5, i7, $i10, 68239216);
                                        $i3 += i15;
                                        i += i13;
                                        $i18 += -1741252353 * this.size;
                                        $i17 += i6;
                                        i2 += $i6;
                                        $i2 += i8;
                                        i4 += i16;
                                    }
                                    i4 = $i3;
                                    $i3 = i9;
                                    while (true) {
                                        $i3--;
                                        if ($i3 < 0) {
                                            break;
                                        }
                                        encode(this.size, $r2, 0, 0, $i18, i4 >> 14, i3 >> 14, i, i12, $i17, i2, $i2, i5, i7, $i10, 68239216);
                                        i3 += i14;
                                        i += i13;
                                        $i18 += -1741252353 * this.size;
                                        $i17 += i6;
                                        i2 += $i6;
                                        $i2 += i8;
                                        i4 += i15;
                                    }
                                }
                            }
                        }
                    } else if ($i18 < -1759402563 * this.length) {
                        $i5 = i > -1759402563 * this.length ? -1759402563 * this.length : i;
                        $i3 = $i17 > -1759402563 * this.length ? -1759402563 * this.length : $i17;
                        i4 = ((i4 << 9) - (i3 * i12)) + i12;
                        if ($i5 >= $i3) {
                            $i2 = i3 << 14;
                            if ($i18 < 0) {
                                $i22 = $i2 - ($i18 * i14);
                                $i2 -= i15 * $i18;
                                i4 -= $i18 * i13;
                                $i18 = 0;
                            } else {
                                $i22 = $i2;
                            }
                            i2 <<= 14;
                            if ($i3 < 0) {
                                i2 -= $i3 * i16;
                                $i3 = 0;
                            }
                            i3 = $i18 - (-1508152919 * this.parent);
                            $i17 = i10 + (i6 * i3);
                            i = i11 + ($i6 * i3);
                            i3 = i9 + (i3 * i8);
                            if (i14 >= i15) {
                                $i5 -= $i3;
                                i9 = $i3 - $i18;
                                $i18 = this.next[$i18];
                                $i3 = i4;
                                i4 = $i22;
                                while (true) {
                                    i9--;
                                    if (i9 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i18, $i2 >> 14, i4 >> 14, $i3, i12, $i17, i, i3, i5, i7, $i10, 68239216);
                                    $i2 += i15;
                                    $i3 += i13;
                                    $i18 += -1741252353 * this.size;
                                    $i17 += i6;
                                    i += $i6;
                                    i3 += i8;
                                    i4 += i14;
                                }
                                i4 = i2;
                                while (true) {
                                    i2 = $i5 - 1;
                                    if (i2 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i18, $i2 >> 14, i4 >> 14, $i3, i12, $i17, i, i3, i5, i7, $i10, 68239216);
                                    $i3 += i13;
                                    $i18 += this.size * -1741252353;
                                    $i17 += i6;
                                    i += $i6;
                                    i3 += i8;
                                    $i2 += i15;
                                    i4 += i16;
                                    $i5 = i2;
                                }
                            } else {
                                $i5 -= $i3;
                                i9 = $i3 - $i18;
                                $i18 = this.next[$i18];
                                $i3 = i4;
                                i4 = $i22;
                                while (true) {
                                    i9--;
                                    if (i9 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i18, i4 >> 14, $i2 >> 14, $i3, i12, $i17, i, i3, i5, i7, $i10, 68239216);
                                    $i2 += i15;
                                    $i3 += i13;
                                    $i18 += -1741252353 * this.size;
                                    $i17 += i6;
                                    i += $i6;
                                    i3 += i8;
                                    i4 += i14;
                                }
                                i4 = $i2;
                                $i2 = $i5;
                                while (true) {
                                    $i2--;
                                    if ($i2 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i18, i2 >> 14, i4 >> 14, $i3, i12, $i17, i, i3, i5, i7, $i10, 68239216);
                                    i2 += i16;
                                    $i3 += i13;
                                    $i18 += -1741252353 * this.size;
                                    $i17 += i6;
                                    i += $i6;
                                    i3 += i8;
                                    i4 += i15;
                                }
                            }
                        } else {
                            i = i3 << 14;
                            if ($i18 < 0) {
                                i3 = i - ($i18 * i14);
                                $i17 = i4 - (i13 * $i18);
                                $i18 = 0;
                                $i22 = i - (i15 * $i18);
                            } else {
                                $i17 = i4;
                                i3 = i;
                                $i22 = i;
                            }
                            $i2 <<= 14;
                            if ($i5 < 0) {
                                $i2 -= $i5 * i16;
                                $i5 = 0;
                            }
                            i4 = $i18 - (-1508152919 * this.parent);
                            i = i10 + (i6 * i4);
                            i2 = i11 + (i4 * $i6);
                            i4 = i9 + (i4 * i8);
                            if (($i18 != $i5 && i14 < i15) || ($i18 == $i5 && i14 > i16)) {
                                $i3 -= $i5;
                                $i5 -= $i18;
                                $i18 = this.next[$i18];
                                i9 = $i22;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i18, i3 >> 14, i9 >> 14, $i17, i12, i, i2, i4, i5, i7, $i10, 68239216);
                                    i3 += i14;
                                    $i17 += i13;
                                    $i18 += -1741252353 * this.size;
                                    i += i6;
                                    i2 += $i6;
                                    i4 += i8;
                                    i9 += i15;
                                }
                                $i5 = i3;
                                i3 = $i3;
                                while (true) {
                                    i3--;
                                    if (i3 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i18, $i5 >> 14, $i2 >> 14, $i17, i12, i, i2, i4, i5, i7, $i10, 68239216);
                                    $i2 += i16;
                                    $i17 += i13;
                                    $i18 += this.size * -1741252353;
                                    i += i6;
                                    i2 += $i6;
                                    i4 += i8;
                                    $i5 += i14;
                                }
                            } else {
                                $i3 -= $i5;
                                $i5 -= $i18;
                                $i18 = this.next[$i18];
                                i9 = $i22;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i18, i9 >> 14, i3 >> 14, $i17, i12, i, i2, i4, i5, i7, $i10, 68239216);
                                    i3 += i14;
                                    $i17 += i13;
                                    $i18 += this.size * -1741252353;
                                    i += i6;
                                    i2 += $i6;
                                    i4 += i8;
                                    i9 += i15;
                                }
                                $i5 = $i3;
                                $i3 = i3;
                                while (true) {
                                    i3 = $i5 - 1;
                                    if (i3 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i18, $i2 >> 14, $i3 >> 14, $i17, i12, i, i2, i4, i5, i7, $i10, 68239216);
                                    $i17 += i13;
                                    $i18 += -1741252353 * this.size;
                                    i += i6;
                                    i2 += $i6;
                                    i4 += i8;
                                    $i2 += i16;
                                    $i3 += i14;
                                    $i5 = i3;
                                }
                            }
                        }
                    }
                } else {
                    if ($i17 < this.length * -1759402563) {
                        i4 = $i18 > -1759402563 * this.length ? this.length * -1759402563 : $i18;
                        if (i > this.length * -1759402563) {
                            i = this.length * -1759402563;
                        }
                        $i3 = (($i3 << 9) - (i2 * i12)) + i12;
                        if (i4 >= i) {
                            $i5 = i2 << 14;
                            if ($i17 < 0) {
                                $i22 = $i5 - (i16 * $i17);
                                $i5 -= $i17 * i14;
                                $i3 -= i13 * $i17;
                                $i17 = 0;
                            } else {
                                $i22 = $i5;
                            }
                            $i2 <<= 14;
                            if (i < 0) {
                                $i2 -= i * i15;
                                i = 0;
                            }
                            i3 = $i17 - (this.parent * -1508152919);
                            $i18 = i10 + (i3 * i6);
                            i2 = i11 + (i3 * $i6);
                            i3 = i9 + (i3 * i8);
                            if ((i != $i17 && i16 < i14) || ($i17 == i && i15 > i14)) {
                                i4 -= i;
                                i10 = i - $i17;
                                $i17 = this.next[$i17];
                                i = $i3;
                                i9 = $i22;
                                $i3 = $i5;
                                $i5 = i10;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, i9 >> 14, $i3 >> 14, i, i12, $i18, i2, i3, i5, i7, $i10, 68239216);
                                    $i3 += i14;
                                    i += i13;
                                    $i17 += -1741252353 * this.size;
                                    $i18 += i6;
                                    i2 += $i6;
                                    i3 += i8;
                                    i9 += i16;
                                }
                                $i5 = i4;
                                i4 = $i3;
                                while (true) {
                                    $i3 = $i5 - 1;
                                    if ($i3 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i2 >> 14, i4 >> 14, i, i12, $i18, i2, i3, i5, i7, $i10, 68239216);
                                    i += i13;
                                    $i17 += -1741252353 * this.size;
                                    $i18 += i6;
                                    i2 += $i6;
                                    i3 += i8;
                                    $i2 += i15;
                                    i4 += i14;
                                    $i5 = $i3;
                                }
                            } else {
                                i4 -= i;
                                i10 = i - $i17;
                                $i17 = this.next[$i17];
                                i = $i3;
                                i9 = $i22;
                                $i3 = $i5;
                                $i5 = i10;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i3 >> 14, i9 >> 14, i, i12, $i18, i2, i3, i5, i7, $i10, 68239216);
                                    $i3 += i14;
                                    i += i13;
                                    $i17 += -1741252353 * this.size;
                                    $i18 += i6;
                                    i2 += $i6;
                                    i3 += i8;
                                    i9 += i16;
                                }
                                $i5 = $i3;
                                $i3 = i4;
                                while (true) {
                                    $i3--;
                                    if ($i3 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i2 >> 14, i, i12, $i18, i2, i3, i5, i7, $i10, 68239216);
                                    $i2 += i15;
                                    i += i13;
                                    $i17 += this.size * -1741252353;
                                    $i18 += i6;
                                    i2 += $i6;
                                    i3 += i8;
                                    $i5 += i14;
                                }
                            }
                        } else {
                            $i5 = i2 << 14;
                            if ($i17 < 0) {
                                $i22 = $i5 - (i16 * $i17);
                                $i5 -= $i17 * i14;
                                $i3 -= i13 * $i17;
                                $i17 = 0;
                            } else {
                                $i22 = $i5;
                            }
                            i3 <<= 14;
                            if (i4 < 0) {
                                i3 -= i4 * i15;
                                i4 = 0;
                            }
                            $i2 = $i17 - (this.parent * -1508152919);
                            $i18 = i10 + ($i2 * i6);
                            i2 = i11 + ($i2 * $i6);
                            $i2 = i9 + ($i2 * i8);
                            if ((i4 != $i17 && i16 < i14) || (i4 == $i17 && i16 > i15)) {
                                i9 = i - i4;
                                i4 -= $i17;
                                $i17 = this.next[$i17];
                                i = $i3;
                                $i3 = $i22;
                                while (true) {
                                    i4--;
                                    if (i4 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i5 >> 14, i, i12, $i18, i2, $i2, i5, i7, $i10, 68239216);
                                    $i3 += i16;
                                    i += i13;
                                    $i17 += -1741252353 * this.size;
                                    $i18 += i6;
                                    i2 += $i6;
                                    $i2 += i8;
                                    $i5 += i14;
                                }
                                $i5 = i9;
                                i4 = i3;
                                while (true) {
                                    i3 = $i5 - 1;
                                    if (i3 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i3 >> 14, i4 >> 14, i, i12, $i18, i2, $i2, i5, i7, $i10, 68239216);
                                    i += i13;
                                    $i17 += -1741252353 * this.size;
                                    $i18 += i6;
                                    i2 += $i6;
                                    $i2 += i8;
                                    $i3 += i16;
                                    i4 += i15;
                                    $i5 = i3;
                                }
                            } else {
                                i9 = i - i4;
                                i4 -= $i17;
                                $i17 = this.next[$i17];
                                i = $i3;
                                $i3 = $i22;
                                while (true) {
                                    i4--;
                                    if (i4 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i3 >> 14, i, i12, $i18, i2, $i2, i5, i7, $i10, 68239216);
                                    $i3 += i16;
                                    i += i13;
                                    $i17 += -1741252353 * this.size;
                                    $i18 += i6;
                                    i2 += $i6;
                                    $i2 += i8;
                                    $i5 += i14;
                                }
                                i4 = $i3;
                                $i3 = i9;
                                while (true) {
                                    $i3--;
                                    if ($i3 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, i3 >> 14, i4 >> 14, i, i12, $i18, i2, $i2, i5, i7, $i10, 68239216);
                                    i3 += i15;
                                    i += i13;
                                    $i17 += -1741252353 * this.size;
                                    $i18 += i6;
                                    i2 += $i6;
                                    $i2 += i8;
                                    i4 += i16;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "cj.ah(" + ')');
        }
    }

    public final void get(int[] iArr, int i, int i2, int i3) {
        try {
            this.size = iArr;
            this.size = -145201409 * i;
            this.header = 359809005 * i2;
            add(0, 0, i, i2, (byte) 13);
            toString(-1691347077);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cj.aa(" + ')');
        }
    }

    final void getBytes(int $i8, int $i9, int $i10, int $i0, int $i1, int $i2, int $i3, int $i4, int $i5) {
        int $i11 = $i1 - $i0;
        int $i6 = $i9 - $i8;
        int $i7 = $i2 - $i0;
        int $i12 = $i10 - $i8;
        int $i13 = $i4 - $i3;
        int $i14 = $i5 - $i3;
        int i = $i10 != $i9 ? (($i2 - $i1) << 14) / ($i10 - $i9) : 0;
        int i2 = $i8 != $i9 ? ($i11 << 14) / $i6 : 0;
        int i3 = $i8 != $i10 ? ($i7 << 14) / $i12 : 0;
        int i4 = ($i11 * $i12) - ($i6 * $i7);
        if (i4 != 0) {
            $i6 = ((($i12 * $i13) - ($i6 * $i14)) << 8) / i4;
            $i7 = ((($i11 * $i14) - ($i13 * $i7)) << 8) / i4;
            if ($i8 > $i9 || $i8 > $i10) {
                int $i32;
                if ($i9 <= $i10) {
                    if ($i9 < 282960379 * this.length) {
                        if ($i10 > this.length * -1759402563) {
                            $i10 = this.length * 1340490905;
                        }
                        if ($i8 > this.length * 198039490) {
                            $i8 = this.length * -1759402563;
                        }
                        $i32 = ($i4 << 8) - ($i1 * $i6);
                        $i3 = $i32;
                        $i3 = $i32 + $i6;
                        if ($i10 >= $i8) {
                            $i1 <<= 14;
                            if ($i9 < 0) {
                                $i2 = $i1 - ($i9 * i2);
                                $i1 -= $i9 * i;
                                $i3 -= $i7 * $i9;
                                $i9 = 0;
                            } else {
                                $i2 = $i1;
                            }
                            $i0 <<= 14;
                            if ($i8 < 0) {
                                $i0 -= i3 * $i8;
                                $i8 = 0;
                            }
                            if (i2 >= i) {
                                $i10 -= $i8;
                                $i4 = $i8 - $i9;
                                $i8 = $i3;
                                $i9 = this.next[$i9];
                                $i3 = $i4;
                                while (true) {
                                    $i3--;
                                    if ($i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $i9, 0, 0, $i1 >> 14, $i2 >> 14, $i8, $i6, -1726722954);
                                    $i1 += i;
                                    $i8 += $i7;
                                    $i9 += -512872569 * this.size;
                                    $i2 += i2;
                                }
                                while (true) {
                                    $i10--;
                                    if ($i10 < 0) {
                                        break;
                                    }
                                    read(this.size, $i9, 0, 0, $i1 >> 14, $i0 >> 14, $i8, $i6, -1254710495);
                                    $i8 += $i7;
                                    $i9 += this.size * -1741252353;
                                    $i1 += i;
                                    $i0 += i3;
                                }
                            } else {
                                $i10 -= $i8;
                                $i4 = $i8 - $i9;
                                $i8 = $i3;
                                $i9 = this.next[$i9];
                                $i3 = $i4;
                                while (true) {
                                    $i3--;
                                    if ($i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $i9, 0, 0, $i2 >> 14, $i1 >> 14, $i8, $i6, 1371032207);
                                    $i1 += i;
                                    $i8 += $i7;
                                    $i9 += -720434776 * this.size;
                                    $i2 += i2;
                                }
                                while (true) {
                                    $i10--;
                                    if ($i10 < 0) {
                                        break;
                                    }
                                    read(this.size, $i9, 0, 0, $i0 >> 14, $i1 >> 14, $i8, $i6, -107794268);
                                    $i0 += i3;
                                    $i8 += $i7;
                                    $i9 += -1741252353 * this.size;
                                    $i1 += i;
                                }
                            }
                        } else {
                            $i4 = $i1 << 14;
                            if ($i9 < 0) {
                                $i1 = $i4 - (i2 * $i9);
                                $i4 -= $i9 * i;
                                $i3 -= $i9 * $i7;
                                $i9 = 0;
                            } else {
                                $i1 = $i4;
                            }
                            $i0 = $i2 << 14;
                            if ($i10 < 0) {
                                $i0 -= $i10 * i3;
                                $i10 = 0;
                            }
                            if (($i9 != $i10 && i2 < i) || ($i10 == $i9 && i2 > i3)) {
                                $i2 = $i8 - $i10;
                                $i5 = $i10 - $i9;
                                $i8 = $i3;
                                $i3 = $i4;
                                $i10 = $i1;
                                $i1 = $i5;
                                $i9 = this.next[$i9];
                                while (true) {
                                    $i1--;
                                    if ($i1 < 0) {
                                        break;
                                    }
                                    read(this.size, $i9, 0, 0, $i10 >> 14, $i3 >> 14, $i8, $i6, -1410306909);
                                    $i10 += i2;
                                    $i8 += $i7;
                                    $i9 += this.size * -2034884771;
                                    $i3 += i;
                                }
                                $i1 = $i2;
                                while (true) {
                                    $i1--;
                                    if ($i1 < 0) {
                                        break;
                                    }
                                    read(this.size, $i9, 0, 0, $i10 >> 14, $i0 >> 14, $i8, $i6, -1072970015);
                                    $i8 += $i7;
                                    $i9 += this.size * -1741252353;
                                    $i0 += i3;
                                    $i10 += i2;
                                }
                            } else {
                                $i2 = $i8 - $i10;
                                $i5 = $i10 - $i9;
                                $i8 = $i3;
                                $i3 = $i4;
                                $i10 = $i1;
                                $i1 = $i5;
                                $i9 = this.next[$i9];
                                while (true) {
                                    $i1--;
                                    if ($i1 < 0) {
                                        break;
                                    }
                                    read(this.size, $i9, 0, 0, $i3 >> 14, $i10 >> 14, $i8, $i6, 552354461);
                                    $i10 += i2;
                                    $i8 += $i7;
                                    $i9 += 1385878766 * this.size;
                                    $i3 += i;
                                }
                                $i1 = $i2;
                                while (true) {
                                    $i1--;
                                    if ($i1 < 0) {
                                        break;
                                    }
                                    read(this.size, $i9, 0, 0, $i0 >> 14, $i10 >> 14, $i8, $i6, 873411848);
                                    $i0 += i3;
                                    $i8 += $i7;
                                    $i9 += -1741252353 * this.size;
                                    $i10 += i2;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                if ($i10 < this.length * -1759402563) {
                    if ($i8 > -1291981049 * this.length) {
                        $i8 = this.length * -257747086;
                    }
                    if ($i9 > -1759402563 * this.length) {
                        $i9 = this.length * 920435763;
                    }
                    $i32 = ($i5 << 8) - ($i2 * $i6);
                    $i3 = $i32;
                    $i3 = $i32 + $i6;
                    if ($i8 >= $i9) {
                        $i2 <<= 14;
                        if ($i10 < 0) {
                            $i4 = $i2 - ($i10 * i);
                            $i2 -= $i10 * i3;
                            $i0 = $i3 - ($i7 * $i10);
                            $i10 = 0;
                        } else {
                            $i0 = $i3;
                            $i4 = $i2;
                        }
                        $i1 <<= 14;
                        if ($i9 < 0) {
                            $i1 -= $i9 * i2;
                            $i9 = 0;
                        }
                        if (i >= i3) {
                            $i3 = $i8 - $i9;
                            $i9 -= $i10;
                            $i8 = this.next[$i10];
                            $i10 = $i4;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i2 >> 14, $i10 >> 14, $i0, $i6, 750602522);
                                $i2 += i3;
                                $i0 += $i7;
                                $i8 += -1741252353 * this.size;
                                $i10 += i;
                            }
                            $i9 = $i3;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i2 >> 14, $i1 >> 14, $i0, $i6, 1239092912);
                                $i0 += $i7;
                                $i8 += this.size * -1741252353;
                                $i2 += i3;
                                $i1 += i2;
                            }
                        } else {
                            $i3 = $i8 - $i9;
                            $i9 -= $i10;
                            $i8 = this.next[$i10];
                            $i10 = $i4;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i10 >> 14, $i2 >> 14, $i0, $i6, -2026306439);
                                $i2 += i3;
                                $i0 += $i7;
                                $i8 += this.size * 2137598819;
                                $i10 += i;
                            }
                            $i9 = $i3;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, $i2 >> 14, $i0, $i6, -924617256);
                                $i1 += i2;
                                $i0 += $i7;
                                $i8 += -1741252353 * this.size;
                                $i2 += i3;
                            }
                        }
                    } else {
                        $i4 = $i2 << 14;
                        if ($i10 < 0) {
                            $i1 = $i4 - (i * $i10);
                            $i4 -= $i10 * i3;
                            $i3 -= $i7 * $i10;
                            $i10 = 0;
                        } else {
                            $i1 = $i4;
                        }
                        $i0 <<= 14;
                        if ($i8 < 0) {
                            $i0 -= i2 * $i8;
                            $i8 = 0;
                        }
                        if (i >= i3) {
                            $i2 = $i9 - $i8;
                            $i5 = $i8 - $i10;
                            $i9 = this.next[$i10];
                            $i8 = $i3;
                            $i3 = $i4;
                            $i10 = $i1;
                            $i1 = $i5;
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, $i9, 0, 0, $i3 >> 14, $i10 >> 14, $i8, $i6, 2073318635);
                                $i10 += i;
                                $i8 += $i7;
                                $i9 += 903349994 * this.size;
                                $i3 += i3;
                            }
                            $i1 = $i2;
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, $i9, 0, 0, $i0 >> 14, $i10 >> 14, $i8, $i6, -1508302391);
                                $i0 += i2;
                                $i8 += $i7;
                                $i9 += this.size * 1577195485;
                                $i10 += i;
                            }
                        } else {
                            $i2 = $i9 - $i8;
                            $i5 = $i8 - $i10;
                            $i9 = this.next[$i10];
                            $i8 = $i3;
                            $i3 = $i4;
                            $i10 = $i1;
                            $i1 = $i5;
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, $i9, 0, 0, $i10 >> 14, $i3 >> 14, $i8, $i6, -622708464);
                                $i10 += i;
                                $i8 += $i7;
                                $i9 += this.size * -1741252353;
                                $i3 += i3;
                            }
                            $i1 = $i2;
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, $i9, 0, 0, $i10 >> 14, $i0 >> 14, $i8, $i6, -1668106477);
                                $i8 += $i7;
                                $i9 += this.size * -473968187;
                                $i10 += i;
                                $i0 += i2;
                            }
                        }
                    }
                }
            } else if ($i8 < -1759402563 * this.length) {
                if ($i9 > this.length * -1353331180) {
                    $i9 = this.length * 1867206882;
                }
                $i4 = $i10 > this.length * 339146237 ? -1534291447 * this.length : $i10;
                $i3 = (($i3 << 8) - ($i0 * $i6)) + $i6;
                if ($i9 >= $i4) {
                    $i0 <<= 14;
                    if ($i8 < 0) {
                        $i5 = $i0 - (i3 * $i8);
                        $i0 -= $i8 * i2;
                        $i3 -= $i7 * $i8;
                        $i8 = 0;
                    } else {
                        $i5 = $i0;
                    }
                    $i10 = $i2 << 14;
                    if ($i4 < 0) {
                        $i10 -= $i4 * i;
                        $i4 = 0;
                    }
                    if (($i4 != $i8 && i3 < i2) || ($i8 == $i4 && i > i2)) {
                        $i1 = $i9 - $i4;
                        $i9 = $i4 - $i8;
                        $i4 = this.next[$i8];
                        $i8 = $i3;
                        $i2 = $i5;
                        $i3 = $i9;
                        $i9 = $i4;
                        while (true) {
                            $i3--;
                            if ($i3 < 0) {
                                break;
                            }
                            read(this.size, $i9, 0, 0, $i2 >> 14, $i0 >> 14, $i8, $i6, -1024465145);
                            $i0 += i2;
                            $i8 += $i7;
                            $i9 += this.size * -1741252353;
                            $i2 += i3;
                        }
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            read(this.size, $i9, 0, 0, $i10 >> 14, $i0 >> 14, $i8, $i6, -878430029);
                            $i8 += $i7;
                            $i9 += this.size * -1741252353;
                            $i10 += i;
                            $i0 += i2;
                        }
                    } else {
                        $i1 = $i9 - $i4;
                        $i9 = $i4 - $i8;
                        $i4 = this.next[$i8];
                        $i8 = $i3;
                        $i2 = $i5;
                        $i3 = $i9;
                        $i9 = $i4;
                        while (true) {
                            $i3--;
                            if ($i3 < 0) {
                                break;
                            }
                            read(this.size, $i9, 0, 0, $i0 >> 14, $i2 >> 14, $i8, $i6, 355372884);
                            $i0 += i2;
                            $i8 += $i7;
                            $i9 += this.size * 1412026261;
                            $i2 += i3;
                        }
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            read(this.size, $i9, 0, 0, $i0 >> 14, $i10 >> 14, $i8, $i6, -454529699);
                            $i10 += i;
                            $i8 += $i7;
                            $i9 += this.size * 1420080582;
                            $i0 += i2;
                        }
                    }
                } else {
                    $i0 <<= 14;
                    if ($i8 < 0) {
                        $i2 = $i0 - ($i8 * i3);
                        $i0 -= $i8 * i2;
                        $i3 -= $i7 * $i8;
                        $i8 = 0;
                    } else {
                        $i2 = $i0;
                    }
                    $i10 = $i1 << 14;
                    if ($i9 < 0) {
                        $i10 -= $i9 * i;
                        $i9 = 0;
                    }
                    if (($i9 != $i8 && i3 < i2) || ($i9 == $i8 && i3 > i)) {
                        $i1 = $i4 - $i9;
                        $i4 = $i9 - $i8;
                        $i5 = this.next[$i8];
                        $i8 = $i3;
                        $i9 = $i2;
                        $i2 = $i0;
                        $i3 = $i4;
                        $i0 = $i5;
                        while (true) {
                            $i3--;
                            if ($i3 < 0) {
                                break;
                            }
                            read(this.size, $i0, 0, 0, $i9 >> 14, $i2 >> 14, $i8, $i6, -65543289);
                            $i9 += i3;
                            $i8 += $i7;
                            $i0 += this.size * 805805075;
                            $i2 += i2;
                        }
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            read(this.size, $i0, 0, 0, $i9 >> 14, $i10 >> 14, $i8, $i6, 1059626382);
                            $i10 += i;
                            $i8 += $i7;
                            $i0 += -1741252353 * this.size;
                            $i9 += i3;
                        }
                    } else {
                        $i1 = $i4 - $i9;
                        $i4 = $i9 - $i8;
                        $i5 = this.next[$i8];
                        $i8 = $i3;
                        $i9 = $i2;
                        $i2 = $i0;
                        $i3 = $i4;
                        $i0 = $i5;
                        while (true) {
                            $i3--;
                            if ($i3 < 0) {
                                break;
                            }
                            read(this.size, $i0, 0, 0, $i2 >> 14, $i9 >> 14, $i8, $i6, -2025095776);
                            $i9 += i3;
                            $i8 += $i7;
                            $i0 += this.size * 1341846669;
                            $i2 += i2;
                        }
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            read(this.size, $i0, 0, 0, $i10 >> 14, $i9 >> 14, $i8, $i6, -384879729);
                            $i8 += $i7;
                            $i0 += -2048513183 * this.size;
                            $i9 += i3;
                            $i10 += i;
                        }
                    }
                }
            }
        }
    }

    final void getBytes(int[] iArr, int[] iArr2, int i, int i2, int $i2, int i3, int $i12, int i4, int $i4, int i5, int $i6, int i6, int i7, int i8, int i9) {
        if (this.f201c) {
            if ($i12 > 1378401118 * this.buffer) {
                $i12 = -1521391158 * this.buffer;
            }
            if (i3 < 0) {
                i3 = 0;
            }
        }
        if (i3 < $i12) {
            int $i18 = $i2 + i3;
            i = i4 + (i3 * $i4);
            $i2 = $i12 - i3;
            int $i14;
            int $i13;
            int $i17;
            int $i15;
            int $i19;
            int $i3;
            int $i16;
            if (this.value) {
                i2 = i3 - (this.data * -89970551);
                i4 = i5 + ((i7 >> 3) * i2);
                $i6 += (i8 >> 3) * i2;
                $i14 = i6 + (i2 * (i9 >> 3));
                i5 = $i14 >> 12;
                if (i5 != 0) {
                    i2 = i4 / i5;
                    i6 = $i6 / i5;
                    if (i2 < 0) {
                        i2 = 0;
                    } else if (i2 > 4032) {
                        i2 = 4032;
                    }
                } else {
                    i2 = 0;
                    i6 = 0;
                }
                i5 = i4 + i7;
                i4 = $i6 + i8;
                $i6 = $i14 + i9;
                $i14 = $i6 >> 12;
                if ($i14 != 0) {
                    $i13 = i5 / $i14;
                    $i14 = i4 / $i14;
                    if ($i13 < 0) {
                        $i13 = 0;
                    } else if ($i13 > 508324844) {
                        $i13 = 1100687083;
                    }
                } else {
                    $i13 = 0;
                    $i14 = 0;
                }
                $i17 = (i2 << 20) + i6;
                i6 = (($i14 - i6) >> 3) + ((($i13 - i2) >> 3) << 20);
                i2 = $i2 >> 3;
                $i2 = $i4 << 3;
                $i4 = i >> 8;
                if (this.pos) {
                    if (i2 > 0) {
                        $i15 = $i18;
                        $i18 = $i4;
                        $i4 = $i13;
                        $i13 = i6;
                        i6 = $i14;
                        while (true) {
                            $i19 = iArr2[($i17 >>> 26) + ($i17 & 4032)];
                            $i14 = $i15 + 1;
                            iArr[$i15] = (((($i19 & 65280) * $i18) & 16711680) + (((-1131442474 & $i19) * $i18) & -705173502)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[($i17 >>> 26) + ($i17 & 4032)];
                            $i15 = $i14 + 1;
                            iArr[$i14] = (((($i19 & 884210677) * $i18) & -1552616846) + (((65280 & $i19) * $i18) & 16711680)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[($i17 >>> 26) + (794129768 & $i17)];
                            $i14 = $i15 + 1;
                            iArr[$i15] = (((($i19 & 2138530558) * $i18) & -451130871) + (((2060727440 & $i19) * $i18) & 1342076736)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[($i17 & 4032) + ($i17 >>> 26)];
                            $i15 = $i14 + 1;
                            iArr[$i14] = (((($i19 & 254421181) * $i18) & 77469151) + (((1505115280 & $i19) * $i18) & 16711680)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[(76106136 & $i17) + ($i17 >>> 26)];
                            $i14 = $i15 + 1;
                            iArr[$i15] = (((($i19 & 16711935) * $i18) & -999465720) + (((816575670 & $i19) * $i18) & 16711680)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[($i17 & 4032) + ($i17 >>> 26)];
                            $i15 = $i14 + 1;
                            iArr[$i14] = (((($i19 & 65280) * $i18) & 16711680) + (((16711935 & $i19) * $i18) & -16711936)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[($i17 >>> 26) + ($i17 & 4032)];
                            $i14 = $i15 + 1;
                            iArr[$i15] = (((($i19 & 1033453843) * $i18) & -178478766) + (((969985874 & $i19) * $i18) & 16711680)) >> 8;
                            $i15 = $i17 + $i13;
                            $i17 = iArr2[($i15 >>> 26) + ($i15 & 4032)];
                            $i15 = $i14 + 1;
                            iArr[$i14] = ((($i18 * ($i17 & 65280)) & 1411150211) + (((16711935 & $i17) * $i18) & -347448206)) >> 8;
                            i5 += i7;
                            i4 += i8;
                            $i17 = $i6 + i9;
                            $i14 = $i17 >> 12;
                            if ($i14 != 0) {
                                $i6 = i5 / $i14;
                                $i14 = i4 / $i14;
                                if ($i6 < 0) {
                                    $i6 = 0;
                                } else if ($i6 > 1912688881) {
                                    $i6 = 4032;
                                }
                            } else {
                                $i6 = 0;
                                $i14 = 0;
                            }
                            $i13 = ($i4 << 20) + i6;
                            i6 = (($i14 - i6) >> 3) + ((($i6 - $i4) >> 3) << 20);
                            i += $i2;
                            $i4 = i >> 8;
                            i2--;
                            if (i2 <= 0) {
                                break;
                            }
                            $i18 = $i4;
                            $i4 = $i6;
                            $i6 = $i17;
                            $i17 = $i13;
                            $i13 = i6;
                            i6 = $i14;
                        }
                    } else {
                        $i15 = $i18;
                        $i13 = $i17;
                    }
                    $i2 = ($i12 - i3) & 7;
                    if ($i2 > 0) {
                        i = $i13;
                        i2 = $i15;
                        while (true) {
                            i4 = iArr2[(-2020327506 & i) + (i >>> 26)];
                            $i12 = ((16711935 & i4) * $i4) & -16711936;
                            $i3 = i4 & 65280;
                            i4 = $i3;
                            iArr[i2] = ((($i3 * $i4) & 16711680) + $i12) >> 8;
                            $i2--;
                            if ($i2 <= 0) {
                                break;
                            }
                            i += i6;
                            i2++;
                        }
                    }
                } else {
                    if (i2 > 0) {
                        while (true) {
                            $i16 = iArr2[($i17 & 4032) + ($i17 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 361841737) * $i4) & 1246008906) + (((65280 & $i16) * $i4) & -1499797655)) >> 8;
                            }
                            $i18++;
                            $i15 = $i17 + i6;
                            $i16 = iArr2[($i15 >>> 26) + ($i15 & 4032)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 65280) * $i4) & 1847294918) + (((16711935 & $i16) * $i4) & -16711936)) >> 8;
                            }
                            $i18++;
                            $i15 += i6;
                            $i16 = iArr2[($i15 >>> 26) + ($i15 & 4032)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 16711935) * $i4) & -16711936) + (((65280 & $i16) * $i4) & 16711680)) >> 8;
                            }
                            $i18++;
                            $i15 += i6;
                            $i16 = iArr2[($i15 & 4032) + ($i15 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & -1300915308) * $i4) & 481339531) + (((998343808 & $i16) * $i4) & 16711680)) >> 8;
                            }
                            $i18++;
                            $i15 += i6;
                            $i16 = iArr2[(-737159543 & $i15) + ($i15 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 16711935) * $i4) & -1904205798) + (((-264407641 & $i16) * $i4) & 312505086)) >> 8;
                            }
                            $i18++;
                            $i15 += i6;
                            $i16 = iArr2[(-1672489817 & $i15) + ($i15 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & -392755032) * $i4) & -1401583199) + (((16711935 & $i16) * $i4) & 182776092)) >> 8;
                            }
                            $i18++;
                            $i15 += i6;
                            $i16 = iArr2[(-568114244 & $i15) + ($i15 >>> 26)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 1323948198) * $i4) & -1362191335) + (((16711935 & $i16) * $i4) & -16711936)) >> 8;
                            }
                            $i18++;
                            $i15 += i6;
                            $i15 = iArr2[($i15 >>> 26) + (-1873166303 & $i15)];
                            if ($i15 != 0) {
                                i6 = ((16711935 & $i15) * $i4) & 2067975511;
                                $i3 = ($i4 * ($i15 & 65280)) & 16711680;
                                $i4 = $i3;
                                iArr[$i18] = ($i3 + i6) >> 8;
                            }
                            $i18++;
                            i5 += i7;
                            i4 += i8;
                            $i6 += i9;
                            $i4 = $i6 >> 12;
                            if ($i4 != 0) {
                                $i15 = i5 / $i4;
                                $i4 = i4 / $i4;
                                if ($i15 < 0) {
                                    $i15 = 0;
                                } else if ($i15 > 62896450) {
                                    $i15 = 1306706923;
                                }
                            } else {
                                $i15 = 0;
                                $i4 = 0;
                            }
                            $i17 = ($i13 << 20) + $i14;
                            i6 = (($i4 - $i14) >> 3) + ((($i15 - $i13) >> 3) << 20);
                            i += $i2;
                            $i13 = i >> 8;
                            i2--;
                            if (i2 <= 0) {
                                break;
                            }
                            $i14 = $i4;
                            $i4 = $i13;
                            $i13 = $i15;
                        }
                        i = $i18;
                        i2 = $i13;
                        $i2 = i6;
                        i4 = $i17;
                    } else {
                        $i2 = i6;
                        i4 = $i17;
                        i2 = $i4;
                        i = $i18;
                    }
                    i3 = ($i12 - i3) & 7;
                    if (i3 > 0) {
                        do {
                            $i4 = iArr2[(i4 & 4032) + (i4 >>> 26)];
                            if ($i4 != 0) {
                                $i12 = ((16711935 & $i4) * i2) & -1992234997;
                                $i3 = $i4 & 65280;
                                $i4 = $i3;
                                iArr[i] = ((($i3 * i2) & -2038381771) + $i12) >> 8;
                            }
                            i++;
                            i4 += $i2;
                            i3--;
                        } while (i3 > 0);
                    }
                }
            } else {
                i4 = i3 - (this.data * -1575402035);
                i2 = i5 + ((i7 >> 3) * i4);
                $i6 += (i8 >> 3) * i4;
                i4 = i6 + (i4 * (i9 >> 3));
                i5 = i4 >> 14;
                if (i5 != 0) {
                    $i13 = i2 / i5;
                    $i14 = $i6 / i5;
                    if ($i13 < 0) {
                        $i13 = 0;
                    } else if ($i13 > 16256) {
                        $i13 = 16256;
                    }
                } else {
                    $i13 = 0;
                    $i14 = 0;
                }
                i5 = i2 + i7;
                $i6 += i8;
                i6 = i4 + i9;
                i2 = i6 >> 14;
                if (i2 != 0) {
                    i4 = i5 / i2;
                    i2 = $i6 / i2;
                    if (i4 < 0) {
                        i4 = 0;
                    } else if (i4 > 16256) {
                        i4 = 16256;
                    }
                } else {
                    i4 = 0;
                    i2 = 0;
                }
                $i15 = ($i13 << 18) + $i14;
                $i13 = (((i4 - $i13) >> 3) << 18) + ((i2 - $i14) >> 3);
                $i16 = $i2 >> 3;
                $i2 = $i4 << 3;
                $i4 = i >> 8;
                if (this.pos) {
                    if ($i16 > 0) {
                        $i14 = $i4;
                        $i4 = i6;
                        i6 = i5;
                        $i17 = $i18;
                        i5 = $i16;
                        while (true) {
                            $i19 = iArr2[($i15 >>> 25) + (-1819629554 & $i15)];
                            $i18 = $i17 + 1;
                            iArr[$i17] = (((($i19 & 108502580) * $i14) & -16711936) + (((65280 & $i19) * $i14) & -1664370722)) >> 8;
                            $i17 = $i15 + $i13;
                            $i19 = iArr2[($i17 >>> 25) + ($i17 & 16256)];
                            $i15 = $i18 + 1;
                            iArr[$i18] = (((($i19 & 16711935) * $i14) & -16711936) + (((65280 & $i19) * $i14) & -1944003229)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[($i17 >>> 25) + ($i17 & 16256)];
                            $i18 = $i15 + 1;
                            iArr[$i15] = (((($i19 & -458554041) * $i14) & 16711680) + (((16711935 & $i19) * $i14) & -515346911)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[($i17 & 16256) + ($i17 >>> 25)];
                            $i15 = $i18 + 1;
                            iArr[$i18] = (((($i19 & -2100593930) * $i14) & 16711680) + (((1967547125 & $i19) * $i14) & 1543941530)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[(1009060438 & $i17) + ($i17 >>> 25)];
                            $i18 = $i15 + 1;
                            iArr[$i15] = (((($i19 & -1987296569) * $i14) & -285475412) + (((-836591291 & $i19) * $i14) & 599727611)) >> 8;
                            $i17 += $i13;
                            $i19 = iArr2[($i17 & 16256) + ($i17 >>> 25)];
                            $i15 = $i18 + 1;
                            iArr[$i18] = (((($i19 & 31109719) * $i14) & 931022365) + (((16711935 & $i19) * $i14) & -16711936)) >> 8;
                            $i18 = $i17 + $i13;
                            $i19 = iArr2[($i18 >>> 25) + (-1597935254 & $i18)];
                            $i17 = $i15 + 1;
                            iArr[$i15] = (((($i19 & 16711935) * $i14) & -16711936) + (((1106459186 & $i19) * $i14) & 16711680)) >> 8;
                            $i18 += $i13;
                            $i15 = iArr2[($i18 >>> 25) + ($i18 & 16256)];
                            $i18 = $i17 + 1;
                            iArr[$i17] = ((($i14 * ($i15 & 1095754542)) & -16711936) + (((-31735412 & $i15) * $i14) & -1343329142)) >> 8;
                            i6 += i7;
                            $i6 += i8;
                            $i17 = $i4 + i9;
                            $i4 = $i17 >> 14;
                            if ($i4 != 0) {
                                $i14 = i6 / $i4;
                                $i13 = $i6 / $i4;
                                if ($i14 < 0) {
                                    $i14 = 0;
                                } else if ($i14 > 16256) {
                                    $i14 = 156220670;
                                }
                            } else {
                                $i14 = 0;
                                $i13 = 0;
                            }
                            $i15 = (i4 << 18) + i2;
                            i4 = ((($i14 - i4) >> 3) << 18) + (($i13 - i2) >> 3);
                            i += $i2;
                            $i4 = i >> 8;
                            i2 = i5 - 1;
                            if (i2 <= 0) {
                                break;
                            }
                            i5 = i2;
                            i2 = $i13;
                            $i13 = i4;
                            i4 = $i14;
                            $i14 = $i4;
                            $i4 = $i17;
                            $i17 = $i18;
                        }
                        i = i4;
                        i2 = $i18;
                        i4 = $i15;
                    } else {
                        i4 = $i15;
                        i = $i13;
                        i2 = $i18;
                    }
                    $i2 = ($i12 - i3) & 7;
                    if ($i2 > 0) {
                        i3 = i4;
                        while (true) {
                            i5 = iArr2[(-1209753664 & i3) + (i3 >>> 25)];
                            i4 = ((16711935 & i5) * $i4) & -16711936;
                            $i3 = i5 & -345957760;
                            i5 = $i3;
                            iArr[i2] = ((($i3 * $i4) & -724233687) + i4) >> 8;
                            $i2--;
                            if ($i2 <= 0) {
                                break;
                            }
                            i3 += i;
                            i2++;
                        }
                    }
                } else {
                    if ($i16 > 0) {
                        $i14 = $i16;
                        while (true) {
                            $i16 = iArr2[($i15 >>> 25) + ($i15 & 16256)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & -1589534554) * $i4) & 16711680) + (((16711935 & $i16) * $i4) & -16711936)) >> 8;
                            }
                            $i18++;
                            $i15 += $i13;
                            $i16 = iArr2[(1004272457 & $i15) + ($i15 >>> 25)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 16711935) * $i4) & -16711936) + (((65280 & $i16) * $i4) & 16711680)) >> 8;
                            }
                            $i18++;
                            $i15 += $i13;
                            $i16 = iArr2[($i15 >>> 25) + ($i15 & 16256)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & -1290453350) * $i4) & -2021943392) + (((16711935 & $i16) * $i4) & -16711936)) >> 8;
                            }
                            $i18++;
                            $i15 += $i13;
                            $i16 = iArr2[($i15 >>> 25) + (1155340756 & $i15)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 16711935) * $i4) & -785097313) + (((65280 & $i16) * $i4) & 16711680)) >> 8;
                            }
                            $i18++;
                            $i15 += $i13;
                            $i16 = iArr2[($i15 >>> 25) + (1791356602 & $i15)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & -2115784826) * $i4) & -16711936) + (((65280 & $i16) * $i4) & 16711680)) >> 8;
                            }
                            $i18++;
                            $i15 += $i13;
                            $i16 = iArr2[($i15 & 16256) + ($i15 >>> 25)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 1768470149) * $i4) & -1114420750) + (((16711935 & $i16) * $i4) & -1569696120)) >> 8;
                            }
                            $i18++;
                            $i15 += $i13;
                            $i16 = iArr2[(374225835 & $i15) + ($i15 >>> 25)];
                            if ($i16 != 0) {
                                iArr[$i18] = (((($i16 & 960128696) * $i4) & -1846230992) + (((16711935 & $i16) * $i4) & 209000861)) >> 8;
                            }
                            $i18++;
                            $i15 += $i13;
                            $i15 = iArr2[(-1062429550 & $i15) + ($i15 >>> 25)];
                            if ($i15 != 0) {
                                $i3 = ($i4 * ($i15 & 16711935)) & -16711936;
                                $i4 = $i3;
                                iArr[$i18] = ($i3 + (((-237812675 & $i15) * $i4) & 16711680)) >> 8;
                            }
                            $i13 = $i18 + 1;
                            i5 += i7;
                            $i6 += i8;
                            i6 += i9;
                            $i4 = i6 >> 14;
                            if ($i4 != 0) {
                                $i17 = i5 / $i4;
                                $i18 = $i6 / $i4;
                                if ($i17 < 0) {
                                    $i17 = 0;
                                } else if ($i17 > -1803554987) {
                                    $i17 = 16256;
                                }
                            } else {
                                $i17 = 0;
                                $i18 = 0;
                            }
                            $i15 = (i4 << 18) + i2;
                            i4 = ((($i17 - i4) >> 3) << 18) + (($i18 - i2) >> 3);
                            i += $i2;
                            $i4 = i >> 8;
                            i2 = $i14 - 1;
                            if (i2 <= 0) {
                                break;
                            }
                            $i14 = i2;
                            i2 = $i18;
                            $i18 = $i13;
                            $i13 = i4;
                            i4 = $i17;
                        }
                    } else {
                        i4 = $i13;
                        $i13 = $i18;
                    }
                    i = ($i12 - i3) & 7;
                    if (i > 0) {
                        do {
                            $i2 = iArr2[($i15 & 16256) + ($i15 >>> 25)];
                            if ($i2 != 0) {
                                $i3 = $i2 & 948607644;
                                $i2 = $i3;
                                iArr[$i13] = ((($i3 * $i4) & 321553347) + (((16711935 & $i2) * $i4) & -16711936)) >> 8;
                            }
                            $i13++;
                            $i15 += i4;
                            i--;
                        } while (i > 0);
                    }
                }
            }
        }
    }

    final void getSize(int $i8, int i, int $i10, int i2, int $i1, int $i2, int i3, int i4, int $i5) {
        int $i11 = $i1 - i2;
        int $i6 = i - $i8;
        int $i7 = $i2 - i2;
        int $i12 = $i10 - $i8;
        int $i13 = i4 - i3;
        int $i14 = $i5 - i3;
        int i5 = $i10 != i ? (($i2 - $i1) << 14) / ($i10 - i) : 0;
        int i6 = $i8 != i ? ($i11 << 14) / $i6 : 0;
        int i7 = $i8 != $i10 ? ($i7 << 14) / $i12 : 0;
        int i8 = ($i11 * $i12) - ($i6 * $i7);
        if (i8 != 0) {
            $i6 = ((($i12 * $i13) - ($i6 * $i14)) << 8) / i8;
            $i7 = ((($i11 * $i14) - ($i13 * $i7)) << 8) / i8;
            if ($i8 <= i && $i8 <= $i10) {
                if ($i8 < -2128734493 * this.length) {
                    if (i > this.length * 799933299) {
                        i = this.length * 105123573;
                    }
                    i4 = $i10 > this.length * -1759402563 ? 965323303 * this.length : $i10;
                    i3 = ((i3 << 8) - (i2 * $i6)) + $i6;
                    if (i >= i4) {
                        i2 <<= 14;
                        if ($i8 < 0) {
                            $i5 = i2 - (i7 * $i8);
                            $i1 = i2 - ($i8 * i6);
                            $i10 = i3 - ($i7 * $i8);
                            $i8 = 0;
                            i3 = $i5;
                        } else {
                            $i10 = i3;
                            $i1 = i2;
                            i3 = i2;
                        }
                        i2 = $i2 << 14;
                        if (i4 < 0) {
                            i2 -= i4 * i5;
                            $i2 = 0;
                        } else {
                            $i2 = i4;
                        }
                        if (($i2 != $i8 && i7 < i6) || ($i8 == $i2 && i5 > i6)) {
                            i -= $i2;
                            $i2 -= $i8;
                            $i8 = this.next[$i8];
                            while (true) {
                                $i2--;
                                if ($i2 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, i3 >> 14, $i1 >> 14, $i10, $i6, 864279770);
                                $i1 += i6;
                                $i10 += $i7;
                                $i8 += this.size * -1110109890;
                                i3 += i7;
                            }
                            while (true) {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, i2 >> 14, $i1 >> 14, $i10, $i6, 1438762045);
                                $i10 += $i7;
                                $i8 += this.size * -1712812913;
                                i2 += i5;
                                $i1 += i6;
                            }
                        } else {
                            i -= $i2;
                            $i2 -= $i8;
                            $i8 = this.next[$i8];
                            while (true) {
                                $i2--;
                                if ($i2 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, i3 >> 14, $i10, $i6, -1725138783);
                                $i1 += i6;
                                $i10 += $i7;
                                $i8 += this.size * 1714753286;
                                i3 += i7;
                            }
                            while (true) {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, i2 >> 14, $i10, $i6, -4384727);
                                i2 += i5;
                                $i10 += $i7;
                                $i8 += this.size * -1741252353;
                                $i1 += i6;
                            }
                        }
                    } else {
                        i2 <<= 14;
                        if ($i8 < 0) {
                            $i5 = i2 - ($i8 * i7);
                            i2 -= $i8 * i6;
                            i3 -= $i7 * $i8;
                            $i8 = 0;
                        } else {
                            $i5 = i2;
                        }
                        $i10 = $i1 << 14;
                        if (i < 0) {
                            $i10 -= i * i5;
                            i = 0;
                        }
                        if ((i != $i8 && i7 < i6) || (i == $i8 && i7 > i5)) {
                            $i1 = i4 - i;
                            i4 = i - $i8;
                            $i13 = this.next[$i8];
                            $i8 = i3;
                            i = $i5;
                            $i2 = i2;
                            i3 = i4;
                            i2 = $i13;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, i2, 0, 0, i >> 14, $i2 >> 14, $i8, $i6, 1912548146);
                                i += i7;
                                $i8 += $i7;
                                i2 += this.size * 1646731537;
                                $i2 += i6;
                            }
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, i2, 0, 0, i >> 14, $i10 >> 14, $i8, $i6, -611439700);
                                $i10 += i5;
                                $i8 += $i7;
                                i2 += -1690704097 * this.size;
                                i += i7;
                            }
                        } else {
                            $i2 = i4 - i;
                            i -= $i8;
                            i4 = this.next[$i8];
                            $i8 = i3;
                            $i1 = $i5;
                            i3 = i;
                            i = i4;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, i, 0, 0, i2 >> 14, $i1 >> 14, $i8, $i6, -579000529);
                                $i1 += i7;
                                $i8 += $i7;
                                i += this.size * 362333062;
                                i2 += i6;
                            }
                            i2 = $i2;
                            while (true) {
                                i2--;
                                if (i2 < 0) {
                                    break;
                                }
                                read(this.size, i, 0, 0, $i10 >> 14, $i1 >> 14, $i8, $i6, 2014923059);
                                $i8 += $i7;
                                i += -1741252353 * this.size;
                                $i1 += i7;
                                $i10 += i5;
                            }
                        }
                    }
                }
            } else if (i <= $i10) {
                if (i < 189978707 * this.length) {
                    if ($i10 > this.length * -1759402563) {
                        $i10 = this.length * -556564038;
                    }
                    $i5 = $i8 > this.length * -11753865 ? this.length * 1626047051 : $i8;
                    i3 = ((i4 << 8) - ($i1 * $i6)) + $i6;
                    if ($i10 >= $i5) {
                        $i1 <<= 14;
                        if (i < 0) {
                            $i2 = $i1 - (i * i6);
                            $i1 -= i * i5;
                            i3 -= $i7 * i;
                            i = 0;
                        } else {
                            $i2 = $i1;
                        }
                        $i8 = i2 << 14;
                        if ($i5 < 0) {
                            $i8 -= $i5 * i7;
                            $i5 = 0;
                        }
                        if (i6 >= i5) {
                            i2 = $i10 - $i5;
                            i4 = $i5 - i;
                            $i10 = this.next[i];
                            i = i3;
                            i3 = i4;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i1 >> 14, $i2 >> 14, i, $i6, -339901426);
                                $i1 += i5;
                                i += $i7;
                                $i10 += -1741252353 * this.size;
                                $i2 += i6;
                            }
                            while (true) {
                                i2--;
                                if (i2 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i1 >> 14, $i8 >> 14, i, $i6, -267689691);
                                i += $i7;
                                $i10 += this.size * -1607763372;
                                $i1 += i5;
                                $i8 += i7;
                            }
                        } else {
                            i2 = $i10 - $i5;
                            i4 = $i5 - i;
                            $i10 = this.next[i];
                            i = i3;
                            i3 = i4;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i2 >> 14, $i1 >> 14, i, $i6, 937405585);
                                $i1 += i5;
                                i += $i7;
                                $i10 += -1741252353 * this.size;
                                $i2 += i6;
                            }
                            while (true) {
                                i2--;
                                if (i2 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i8 >> 14, $i1 >> 14, i, $i6, -80744573);
                                $i8 += i7;
                                i += $i7;
                                $i10 += 23666123 * this.size;
                                $i1 += i5;
                            }
                        }
                    } else {
                        i4 = $i1 << 14;
                        if (i < 0) {
                            i2 = i4 - (i6 * i);
                            i4 -= i * i5;
                            i3 -= i * $i7;
                            i = 0;
                        } else {
                            i2 = i4;
                        }
                        $i8 = $i2 << 14;
                        if ($i10 < 0) {
                            $i8 -= $i10 * i7;
                            $i10 = 0;
                        }
                        if ((i != $i10 && i6 < i5) || ($i10 == i && i6 > i7)) {
                            $i1 = $i5 - $i10;
                            $i10 -= i;
                            $i5 = this.next[i];
                            i = i3;
                            $i2 = i4;
                            i3 = $i10;
                            $i10 = $i5;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, i2 >> 14, $i2 >> 14, i, $i6, -506583373);
                                i2 += i6;
                                i += $i7;
                                $i10 += this.size * -1957768570;
                                $i2 += i5;
                            }
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, i2 >> 14, $i8 >> 14, i, $i6, -2129907592);
                                i += $i7;
                                $i10 += this.size * -1741252353;
                                $i8 += i7;
                                i2 += i6;
                            }
                        } else {
                            $i1 = $i5 - $i10;
                            $i10 -= i;
                            $i5 = this.next[i];
                            i = i3;
                            $i2 = i4;
                            i3 = $i10;
                            $i10 = $i5;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i2 >> 14, i2 >> 14, i, $i6, 552775181);
                                i2 += i6;
                                i += $i7;
                                $i10 += -1741252353 * this.size;
                                $i2 += i5;
                            }
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i8 >> 14, i2 >> 14, i, $i6, 903717481);
                                $i8 += i7;
                                i += $i7;
                                $i10 += -1741252353 * this.size;
                                i2 += i6;
                            }
                        }
                    }
                }
            } else {
                if ($i10 < this.length * 158213387) {
                    if ($i8 > 1236590645 * this.length) {
                        $i8 = this.length * 2038860382;
                    }
                    if (i > -1759402563 * this.length) {
                        i = this.length * -1759402563;
                    }
                    int $i3 = ($i5 << 8) - ($i2 * $i6);
                    i3 = $i3;
                    i3 = $i3 + $i6;
                    if ($i8 >= i) {
                        $i2 <<= 14;
                        if ($i10 < 0) {
                            i4 = $i2 - ($i10 * i5);
                            $i2 -= $i10 * i7;
                            i2 = i3 - ($i7 * $i10);
                            $i10 = 0;
                        } else {
                            i2 = i3;
                            i4 = $i2;
                        }
                        $i1 <<= 14;
                        if (i < 0) {
                            $i1 -= i * i6;
                            i = 0;
                        }
                        if (i5 >= i7) {
                            i3 = $i8 - i;
                            i -= $i10;
                            $i8 = this.next[$i10];
                            $i10 = i4;
                            while (true) {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i2 >> 14, $i10 >> 14, i2, $i6, -673433197);
                                $i2 += i7;
                                i2 += $i7;
                                $i8 += -1200031126 * this.size;
                                $i10 += i5;
                            }
                            i = i3;
                            while (true) {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i2 >> 14, $i1 >> 14, i2, $i6, 408903327);
                                i2 += $i7;
                                $i8 += this.size * -1741252353;
                                $i2 += i7;
                                $i1 += i6;
                            }
                        } else {
                            i3 = $i8 - i;
                            i -= $i10;
                            $i8 = this.next[$i10];
                            $i10 = i4;
                            while (true) {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i10 >> 14, $i2 >> 14, i2, $i6, -1579320322);
                                $i2 += i7;
                                i2 += $i7;
                                $i8 += this.size * 2094236661;
                                $i10 += i5;
                            }
                            i = i3;
                            while (true) {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, $i2 >> 14, i2, $i6, 1072898942);
                                $i1 += i6;
                                i2 += $i7;
                                $i8 += -715164554 * this.size;
                                $i2 += i7;
                            }
                        }
                    } else {
                        i4 = $i2 << 14;
                        if ($i10 < 0) {
                            $i1 = i4 - (i5 * $i10);
                            i4 -= $i10 * i7;
                            i3 -= $i7 * $i10;
                            $i10 = 0;
                        } else {
                            $i1 = i4;
                        }
                        i2 <<= 14;
                        if ($i8 < 0) {
                            i2 -= i6 * $i8;
                            $i8 = 0;
                        }
                        if (i5 >= i7) {
                            $i2 = i - $i8;
                            $i5 = $i8 - $i10;
                            i = this.next[$i10];
                            $i8 = i3;
                            i3 = i4;
                            $i10 = $i1;
                            $i1 = $i5;
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, i, 0, 0, i3 >> 14, $i10 >> 14, $i8, $i6, 1819672146);
                                $i10 += i5;
                                $i8 += $i7;
                                i += -2123194586 * this.size;
                                i3 += i7;
                            }
                            $i1 = $i10;
                            $i10 = $i2;
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, i, 0, 0, i2 >> 14, $i1 >> 14, $i8, $i6, 346919709);
                                $i8 += $i7;
                                i += this.size * -1741252353;
                                $i1 += i5;
                                i2 += i6;
                            }
                        } else {
                            $i2 = i - $i8;
                            $i5 = $i8 - $i10;
                            i = this.next[$i10];
                            $i8 = i3;
                            i3 = i4;
                            $i10 = $i1;
                            $i1 = $i5;
                            while (true) {
                                $i1--;
                                if ($i1 < 0) {
                                    break;
                                }
                                read(this.size, i, 0, 0, $i10 >> 14, i3 >> 14, $i8, $i6, -18479016);
                                $i10 += i5;
                                $i8 += $i7;
                                i += this.size * -1703417886;
                                i3 += i7;
                            }
                            $i1 = $i10;
                            $i10 = $i2;
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, i, 0, 0, $i1 >> 14, i2 >> 14, $i8, $i6, 1871973656);
                                i2 += i6;
                                $i8 += $i7;
                                i += this.size * -1849017252;
                                $i1 += i5;
                            }
                        }
                    }
                }
            }
        }
    }

    final void getSize(int $i8, int $i9, int $i10, int $i0, int $i1, int $i2, int i, int $i4, int $i5, int i2) {
        int $i11 = $i1 - $i0;
        i2 = $i9 - $i8;
        int $i7 = $i2 - $i0;
        int $i12 = $i10 - $i8;
        int $i13 = $i4 - i;
        int $i14 = $i5 - i;
        if ($i10 != $i9) {
            try {
                int $i15 = (($i2 - $i1) << 14) / ($i10 - $i9);
            } catch (Throwable $r2) {
                throw StringBuilder.append($r2, "cj.ag(" + ')');
            }
        }
        $i15 = 0;
        int i3 = $i8 != $i9 ? ($i11 << 14) / i2 : 0;
        int i4 = $i8 != $i10 ? ($i7 << 14) / $i12 : 0;
        int i5 = ($i11 * $i12) - (i2 * $i7);
        if (i5 != 0) {
            i2 = ((($i12 * $i13) - (i2 * $i14)) << 8) / i5;
            $i7 = ((($i11 * $i14) - ($i13 * $i7)) << 8) / i5;
            int $i92;
            if ($i8 <= $i9 && $i8 <= $i10) {
                if ($i8 < -1759402563 * this.length) {
                    $i4 = $i9 > this.length * -1759402563 ? -1759402563 * this.length : $i9;
                    if ($i10 > this.length * -1759402563) {
                        $i10 = -1759402563 * this.length;
                    }
                    $i92 = (i << 8) - ($i0 * i2);
                    $i9 = $i92;
                    $i9 = $i92 + i2;
                    if ($i4 >= $i10) {
                        $i0 <<= 14;
                        if ($i8 < 0) {
                            i = $i0 - (i4 * $i8);
                            $i1 = $i0 - ($i8 * i3);
                            $i9 -= $i7 * $i8;
                            $i8 = 0;
                        } else {
                            i = $i0;
                            $i1 = $i0;
                        }
                        $i0 = $i2 << 14;
                        if ($i10 < 0) {
                            $i0 -= $i10 * $i15;
                            $i10 = 0;
                        }
                        if (($i10 != $i8 && i4 < i3) || ($i8 == $i10 && $i15 > i3)) {
                            $i2 = $i4 - $i10;
                            $i10 -= $i8;
                            $i8 = this.next[$i8];
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, i >> 14, $i1 >> 14, $i9, i2, 807429145);
                                $i1 += i3;
                                $i9 += $i7;
                                $i8 += this.size * -1741252353;
                                i += i4;
                            }
                            $i10 = $i2;
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i0 >> 14, $i1 >> 14, $i9, i2, -827905913);
                                $i0 += $i15;
                                $i9 += $i7;
                                $i8 += this.size * -1741252353;
                                $i1 += i3;
                            }
                        } else {
                            $i2 = $i4 - $i10;
                            $i10 -= $i8;
                            $i8 = this.next[$i8];
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, i >> 14, $i9, i2, -971000701);
                                $i1 += i3;
                                $i9 += $i7;
                                $i8 += this.size * -1741252353;
                                i += i4;
                            }
                            $i10 = $i0;
                            $i0 = $i2;
                            while (true) {
                                $i0--;
                                if ($i0 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, $i10 >> 14, $i9, i2, 1767927683);
                                $i9 += $i7;
                                $i8 += this.size * -1741252353;
                                $i10 += $i15;
                                $i1 += i3;
                            }
                        }
                    } else {
                        $i2 = $i0 << 14;
                        if ($i8 < 0) {
                            $i0 = $i2 - ($i8 * i4);
                            $i2 -= $i8 * i3;
                            $i9 -= $i7 * $i8;
                            $i8 = 0;
                        } else {
                            $i0 = $i2;
                        }
                        $i1 <<= 14;
                        if ($i4 < 0) {
                            $i1 -= $i4 * $i15;
                            $i4 = 0;
                        }
                        if (($i4 != $i8 && i4 < i3) || ($i4 == $i8 && i4 > $i15)) {
                            $i10 -= $i4;
                            $i4 -= $i8;
                            $i8 = this.next[$i8];
                            i = $i2;
                            $i2 = $i4;
                            while (true) {
                                $i2--;
                                if ($i2 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i0 >> 14, i >> 14, $i9, i2, -2107372889);
                                $i0 += i4;
                                $i9 += $i7;
                                $i8 += this.size * -1741252353;
                                i += i3;
                            }
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i0 >> 14, $i1 >> 14, $i9, i2, 1648024342);
                                $i9 += $i7;
                                $i8 += -1741252353 * this.size;
                                $i0 += i4;
                                $i1 += $i15;
                            }
                        } else {
                            $i10 -= $i4;
                            $i4 -= $i8;
                            $i8 = this.next[$i8];
                            i = $i2;
                            $i2 = $i4;
                            while (true) {
                                $i2--;
                                if ($i2 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, i >> 14, $i0 >> 14, $i9, i2, 166621584);
                                $i0 += i4;
                                $i9 += $i7;
                                $i8 += this.size * -1741252353;
                                i += i3;
                            }
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, $i0 >> 14, $i9, i2, -1078292781);
                                $i1 += $i15;
                                $i9 += $i7;
                                $i8 += -1741252353 * this.size;
                                $i0 += i4;
                            }
                        }
                    }
                }
            } else if ($i9 <= $i10) {
                if ($i9 < -1759402563 * this.length) {
                    i = $i10 > this.length * -1759402563 ? -1759402563 * this.length : $i10;
                    if ($i8 > this.length * -1759402563) {
                        $i8 = this.length * -1759402563;
                    }
                    $i92 = ($i4 << 8) - ($i1 * i2);
                    $i10 = $i92;
                    $i10 = $i92 + i2;
                    if (i >= $i8) {
                        $i1 <<= 14;
                        if ($i9 < 0) {
                            $i2 = $i1 - ($i9 * i3);
                            $i1 -= $i9 * $i15;
                            $i10 -= $i7 * $i9;
                            $i9 = 0;
                        } else {
                            $i2 = $i1;
                        }
                        $i0 <<= 14;
                        if ($i8 < 0) {
                            $i0 -= i4 * $i8;
                            $i8 = 0;
                        }
                        if (i3 >= $i15) {
                            i -= $i8;
                            $i4 = $i8 - $i9;
                            $i8 = this.next[$i9];
                            $i9 = $i4;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, $i2 >> 14, $i10, i2, 1353129087);
                                $i1 += $i15;
                                $i10 += $i7;
                                $i8 += -1741252353 * this.size;
                                $i2 += i3;
                            }
                            $i9 = i;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, $i0 >> 14, $i10, i2, -1048162916);
                                $i0 += i4;
                                $i10 += $i7;
                                $i8 += this.size * -1741252353;
                                $i1 += $i15;
                            }
                        } else {
                            i -= $i8;
                            $i4 = $i8 - $i9;
                            $i8 = this.next[$i9];
                            $i9 = $i4;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i2 >> 14, $i1 >> 14, $i10, i2, 403968514);
                                $i1 += $i15;
                                $i10 += $i7;
                                $i8 += -1741252353 * this.size;
                                $i2 += i3;
                            }
                            $i9 = i;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i0 >> 14, $i1 >> 14, $i10, i2, -916753724);
                                $i10 += $i7;
                                $i8 += -1741252353 * this.size;
                                $i1 += $i15;
                                $i0 += i4;
                            }
                        }
                    } else {
                        $i4 = $i1 << 14;
                        if ($i9 < 0) {
                            $i1 = $i4 - (i3 * $i9);
                            $i4 -= $i9 * $i15;
                            $i10 -= $i9 * $i7;
                            $i9 = 0;
                        } else {
                            $i1 = $i4;
                        }
                        $i0 = $i2 << 14;
                        if (i < 0) {
                            $i0 -= i * i4;
                            i = 0;
                        }
                        if (($i9 != i && i3 < $i15) || (i == $i9 && i3 > i4)) {
                            $i2 = $i8 - i;
                            $i5 = i - $i9;
                            $i8 = this.next[$i9];
                            i = $i4;
                            $i9 = $i5;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, i >> 14, $i10, i2, -904643055);
                                $i1 += i3;
                                $i10 += $i7;
                                $i8 += this.size * -1741252353;
                                i += $i15;
                            }
                            $i9 = $i2;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i1 >> 14, $i0 >> 14, $i10, i2, 148235902);
                                $i0 += i4;
                                $i10 += $i7;
                                $i8 += this.size * -1741252353;
                                $i1 += i3;
                            }
                        } else {
                            $i2 = $i8 - i;
                            $i5 = i - $i9;
                            $i8 = this.next[$i9];
                            i = $i4;
                            $i9 = $i5;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, i >> 14, $i1 >> 14, $i10, i2, -70527980);
                                $i1 += i3;
                                $i10 += $i7;
                                $i8 += -1741252353 * this.size;
                                i += $i15;
                            }
                            $i9 = $i2;
                            while (true) {
                                $i9--;
                                if ($i9 < 0) {
                                    break;
                                }
                                read(this.size, $i8, 0, 0, $i0 >> 14, $i1 >> 14, $i10, i2, 152729900);
                                $i10 += $i7;
                                $i8 += -1741252353 * this.size;
                                $i0 += i4;
                                $i1 += i3;
                            }
                        }
                    }
                }
            } else {
                if ($i10 < this.length * -1759402563) {
                    i = $i8 > -1759402563 * this.length ? this.length * -1759402563 : $i8;
                    if ($i9 > -1759402563 * this.length) {
                        $i9 = this.length * -1759402563;
                    }
                    $i4 = (($i5 << 8) - ($i2 * i2)) + i2;
                    if (i >= $i9) {
                        $i0 = $i2 << 14;
                        if ($i10 < 0) {
                            $i2 = $i0 - ($i10 * $i15);
                            $i0 -= $i10 * i4;
                            $i8 = $i4 - ($i7 * $i10);
                            $i10 = 0;
                            $i4 = $i2;
                        } else {
                            $i8 = $i4;
                            $i4 = $i0;
                        }
                        $i1 <<= 14;
                        if ($i9 < 0) {
                            $i1 -= $i9 * i3;
                            $i9 = 0;
                        }
                        if ($i15 >= i4) {
                            $i2 = i - $i9;
                            $i5 = $i9 - $i10;
                            $i9 = this.next[$i10];
                            i = $i4;
                            $i10 = $i5;
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i9, 0, 0, $i0 >> 14, i >> 14, $i8, i2, -566840791);
                                $i0 += i4;
                                $i8 += $i7;
                                $i9 += -1741252353 * this.size;
                                i += $i15;
                            }
                            $i10 = $i2;
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i9, 0, 0, $i0 >> 14, $i1 >> 14, $i8, i2, -980049945);
                                $i8 += $i7;
                                $i9 += this.size * -1741252353;
                                $i0 += i4;
                                $i1 += i3;
                            }
                        } else {
                            $i2 = i - $i9;
                            $i5 = $i9 - $i10;
                            $i9 = this.next[$i10];
                            i = $i4;
                            $i10 = $i5;
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i9, 0, 0, i >> 14, $i0 >> 14, $i8, i2, -664538634);
                                $i0 += i4;
                                $i8 += $i7;
                                $i9 += this.size * -1741252353;
                                i += $i15;
                            }
                            $i10 = $i2;
                            while (true) {
                                $i10--;
                                if ($i10 < 0) {
                                    break;
                                }
                                read(this.size, $i9, 0, 0, $i1 >> 14, $i0 >> 14, $i8, i2, -1489325526);
                                $i1 += i3;
                                $i8 += $i7;
                                $i9 += -1741252353 * this.size;
                                $i0 += i4;
                            }
                        }
                    } else {
                        $i2 <<= 14;
                        if ($i10 < 0) {
                            $i1 = $i2 - ($i15 * $i10);
                            $i2 -= $i10 * i4;
                            $i4 -= $i7 * $i10;
                            $i10 = 0;
                        } else {
                            $i1 = $i2;
                        }
                        $i8 = $i0 << 14;
                        if (i < 0) {
                            $i8 -= i * i3;
                            i = 0;
                        }
                        if ($i15 >= i4) {
                            $i0 = $i9 - i;
                            i -= $i10;
                            $i10 = this.next[$i10];
                            $i9 = $i4;
                            while (true) {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i2 >> 14, $i1 >> 14, $i9, i2, -1266191086);
                                $i1 += $i15;
                                $i9 += $i7;
                                $i10 += -1741252353 * this.size;
                                $i2 += i4;
                            }
                            while (true) {
                                $i0--;
                                if ($i0 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i8 >> 14, $i1 >> 14, $i9, i2, -753350603);
                                $i8 += i3;
                                $i9 += $i7;
                                $i10 += this.size * -1741252353;
                                $i1 += $i15;
                            }
                        } else {
                            $i0 = $i9 - i;
                            i -= $i10;
                            $i10 = this.next[$i10];
                            $i9 = $i4;
                            while (true) {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i1 >> 14, $i2 >> 14, $i9, i2, -1119263885);
                                $i1 += $i15;
                                $i9 += $i7;
                                $i10 += this.size * -1741252353;
                                $i2 += i4;
                            }
                            $i2 = $i0;
                            $i0 = $i8;
                            while (true) {
                                $i8 = $i2 - 1;
                                if ($i8 < 0) {
                                    break;
                                }
                                read(this.size, $i10, 0, 0, $i1 >> 14, $i0 >> 14, $i9, i2, 387050416);
                                $i9 += $i7;
                                $i10 += this.size * -1741252353;
                                $i1 += $i15;
                                $i0 += i3;
                                $i2 = $i8;
                            }
                        }
                    }
                }
            }
        }
    }

    final void getSize(int $i17, int $i18, int $i19, int $i0, int i, int i2, int $i3, int i3, int $i5, int $i6, int i4, int i5, int i6, int $i10, int i7, int $i12, int $i13, int $i14, int i8) {
        int[] $r2 = Point.type.get(i8, (short) 255);
        if ($r2 == null) {
            $i6 = Point.type.toString(i8, 1577195485);
            getSize($i17, $i18, $i19, $i0, i, i2, Calendar.get($i6, $i3, -2137942363), Calendar.get($i6, i3, -2137633569), Calendar.get($i6, $i5, -2146542776), 1872653134);
            return;
        }
        this.value = Point.type.add(i8, 1637064250);
        this.pos = Point.type.equals(i8, -2030401236);
        int $i21 = i - $i0;
        i8 = $i18 - $i17;
        int $i16 = i2 - $i0;
        int $i22 = $i19 - $i17;
        int $i20 = i3 - $i3;
        int $i23 = $i5 - $i3;
        int $i25 = $i18 != $i17 ? ((i - $i0) << 14) / ($i18 - $i17) : 0;
        int i9 = $i18 != $i19 ? ((i2 - i) << 14) / ($i19 - $i18) : 0;
        int i10 = $i17 != $i19 ? (($i0 - i2) << 14) / ($i17 - $i19) : 0;
        int i11 = ($i21 * $i22) - ($i16 * i8);
        if (i11 != 0) {
            i8 = ((($i22 * $i20) - (i8 * $i23)) << 9) / i11;
            $i16 = ((($i21 * $i23) - ($i20 * $i16)) << 9) / i11;
            $i20 = $i6 - i4;
            $i10 = i6 - $i10;
            $i21 = $i12 - $i13;
            $i23 = i5 - $i6;
            $i22 = i7 - i6;
            i7 = $i14 - $i12;
            $i13 = ((i6 * $i23) - ($i6 * $i22)) << 14;
            long $l29 = ($i22 * $i12) - (i7 * i6);
            Object obj = $l29;
            int $i7 = ((((long) $l29) << 3) << 14) / ((long) (542614623 * this.this$0));
            long j = $i7;
            i4 = (int) $i7;
            $i7 = ($i6 * i7) - ($i23 * $i12);
            i5 = $i7;
            $i7 = (((long) $i7) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            i5 = (int) $i7;
            $i14 = (($i20 * i6) - ($i10 * $i6)) << 14;
            $i7 = ((((long) (($i10 * $i12) - (i6 * $i21))) << 3) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            i6 = (int) $i7;
            $i7 = ($i6 * $i21) - ($i20 * $i12);
            $i6 = $i7;
            j = ((long) $i7) << 14;
            $l29 = this.this$0 * 542614623;
            Object obj2 = $l29;
            $l29 = j / ((long) $l29);
            j = $l29;
            $i6 = (int) $l29;
            $i12 = (($i10 * $i23) - ($i20 * $i22)) << 14;
            $i7 = ((((long) (($i22 * $i21) - ($i10 * i7))) << 3) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            $i10 = (int) $i7;
            $i7 = ($i20 * i7) - ($i21 * $i23);
            i7 = $i7;
            j = ((long) $i7) << 14;
            $l29 = this.this$0 * -1569461480;
            Object obj3 = $l29;
            $l29 = j / ((long) $l29);
            j = $l29;
            i7 = (int) $l29;
            if ($i17 > $i18 || $i17 > $i19) {
                if ($i18 <= $i19) {
                    if ($i18 < 1402058039 * this.length) {
                        if ($i19 > 1730448686 * this.length) {
                            $i19 = this.length * -1759402563;
                        }
                        if ($i17 > this.length * -1585951309) {
                            $i17 = this.length * -1759402563;
                        }
                        $i5 = ((i3 << 9) - (i8 * i)) + i8;
                        if ($i19 >= $i17) {
                            i2 = i << 14;
                            if ($i18 < 0) {
                                $i20 = i2 - ($i25 * $i18);
                                i3 = i2 - (i9 * $i18);
                                i = $i5 - ($i16 * $i18);
                                $i18 = 0;
                            } else {
                                i = $i5;
                                $i20 = i2;
                                i3 = i2;
                            }
                            $i0 <<= 14;
                            if ($i17 < 0) {
                                $i17 = 0;
                                $i5 = $i0 - (i10 * $i17);
                            } else {
                                $i5 = $i0;
                            }
                            $i3 = $i18 - (this.parent * -1508152919);
                            $i0 = $i13 + ($i3 * i5);
                            i2 = $i14 + ($i6 * $i3);
                            $i3 = $i12 + ($i3 * i7);
                            if ($i25 >= i9) {
                                $i19 -= $i17;
                                $i13 = $i17 - $i18;
                                $i17 = this.next[$i18];
                                $i12 = $i20;
                                while (true) {
                                    $i18 = $i13 - 1;
                                    if ($i18 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i12 >> 14, i, i8, $i0, i2, $i3, i4, i6, $i10, 1245522068);
                                    i3 += i9;
                                    i += $i16;
                                    $i17 += -1741252353 * this.size;
                                    $i0 += i5;
                                    i2 += $i6;
                                    $i3 += i7;
                                    $i12 += $i25;
                                    $i13 = $i18;
                                }
                                $i18 = $i19;
                                $i19 = i3;
                                i3 = $i5;
                                while (true) {
                                    $i18--;
                                    if ($i18 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i19 >> 14, i3 >> 14, i, i8, $i0, i2, $i3, i4, i6, $i10, 1245522068);
                                    i += $i16;
                                    $i17 += -1887934201 * this.size;
                                    $i0 += i5;
                                    i2 += $i6;
                                    $i3 += i7;
                                    $i19 += i9;
                                    i3 += i10;
                                }
                            } else {
                                $i19 -= $i17;
                                $i13 = $i17 - $i18;
                                $i17 = this.next[$i18];
                                $i12 = $i20;
                                while (true) {
                                    $i18 = $i13 - 1;
                                    if ($i18 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i12 >> 14, i3 >> 14, i, i8, $i0, i2, $i3, i4, i6, $i10, 1245522068);
                                    i3 += i9;
                                    i += $i16;
                                    $i17 += 27336923 * this.size;
                                    $i0 += i5;
                                    i2 += $i6;
                                    $i3 += i7;
                                    $i12 += $i25;
                                    $i13 = $i18;
                                }
                                $i18 = $i19;
                                $i19 = i3;
                                i3 = $i5;
                                while (true) {
                                    $i18--;
                                    if ($i18 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i19 >> 14, i, i8, $i0, i2, $i3, i4, i6, $i10, 1245522068);
                                    i += $i16;
                                    $i17 += this.size * -875113142;
                                    $i0 += i5;
                                    i2 += $i6;
                                    $i3 += i7;
                                    $i19 += i9;
                                    i3 += i10;
                                }
                            }
                        } else {
                            $i20 = i << 14;
                            if ($i18 < 0) {
                                i3 = $i20 - ($i18 * $i25);
                                $i20 -= i9 * $i18;
                                $i5 -= $i16 * $i18;
                                $i18 = 0;
                            } else {
                                i3 = $i20;
                            }
                            $i0 = i2 << 14;
                            if ($i19 < 0) {
                                $i0 -= $i19 * i10;
                                $i19 = 0;
                            }
                            $i3 = $i18 - (1521986482 * this.parent);
                            i = $i13 + (i5 * $i3);
                            i2 = $i14 + ($i3 * $i6);
                            $i3 = $i12 + ($i3 * i7);
                            if (($i18 != $i19 && $i25 < i9) || ($i19 == $i18 && $i25 > i10)) {
                                $i12 = $i17 - $i19;
                                $i13 = $i19 - $i18;
                                $i17 = this.next[$i18];
                                $i18 = $i5;
                                $i5 = $i20;
                                $i19 = i3;
                                i3 = $i13;
                                while (true) {
                                    i3--;
                                    if (i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i19 >> 14, $i5 >> 14, $i18, i8, i, i2, $i3, i4, i6, $i10, 1245522068);
                                    $i19 += $i25;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i3 += i7;
                                    $i5 += i9;
                                }
                                i3 = $i12;
                                while (true) {
                                    i3--;
                                    if (i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i19 >> 14, $i0 >> 14, $i18, i8, i, i2, $i3, i4, i6, $i10, 1245522068);
                                    $i0 += i10;
                                    $i18 += $i16;
                                    $i17 += 156939034 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i3 += i7;
                                    $i19 += $i25;
                                }
                            } else {
                                $i12 = $i17 - $i19;
                                $i13 = $i19 - $i18;
                                $i17 = this.next[$i18];
                                $i18 = $i5;
                                $i5 = $i20;
                                $i19 = i3;
                                i3 = $i13;
                                while (true) {
                                    i3--;
                                    if (i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i19 >> 14, $i18, i8, i, i2, $i3, i4, i6, $i10, 1245522068);
                                    $i19 += $i25;
                                    $i18 += $i16;
                                    $i17 += -2037578834 * this.size;
                                    i += i5;
                                    i2 += $i6;
                                    $i3 += i7;
                                    $i5 += i9;
                                }
                                i3 = $i12;
                                while (true) {
                                    i3--;
                                    if (i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i0 >> 14, $i19 >> 14, $i18, i8, i, i2, $i3, i4, i6, $i10, 1245522068);
                                    $i0 += i10;
                                    $i18 += $i16;
                                    $i17 += this.size * -1732537371;
                                    i += i5;
                                    i2 += $i6;
                                    $i3 += i7;
                                    $i19 += $i25;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                if ($i19 < this.length * -1759402563) {
                    if ($i17 > this.length * 2142384152) {
                        $i17 = this.length * -1759402563;
                    }
                    if ($i18 > 1678525590 * this.length) {
                        $i18 = this.length * 394113657;
                    }
                    $i5 = (($i5 << 9) - (i8 * i2)) + i8;
                    if ($i17 >= $i18) {
                        $i20 = i2 << 14;
                        if ($i19 < 0) {
                            i3 = $i20 - (i9 * $i19);
                            $i20 -= i10 * $i19;
                            $i5 -= $i16 * $i19;
                            $i19 = 0;
                        } else {
                            i3 = $i20;
                        }
                        $i0 = i << 14;
                        if ($i18 < 0) {
                            $i18 *= $i25;
                            $i18 = 0;
                            $i3 = $i0 - $i18;
                        } else {
                            $i3 = $i0;
                        }
                        i2 = $i19 - (this.parent * -1306095721);
                        $i0 = $i13 + (i5 * i2);
                        i = $i14 + ($i6 * i2);
                        i2 = $i12 + (i2 * i7);
                        if (i9 >= i10) {
                            $i12 = $i17 - $i18;
                            $i13 = $i18 - $i19;
                            $i17 = this.next[$i19];
                            $i18 = $i5;
                            $i19 = $i20;
                            $i5 = i3;
                            i3 = $i13;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i19 >> 14, $i5 >> 14, $i18, i8, $i0, i, i2, i4, i6, $i10, 1245522068);
                                $i19 += i10;
                                $i18 += $i16;
                                $i17 += this.size * -1690112186;
                                $i0 += i5;
                                i += $i6;
                                i2 += i7;
                                $i5 += i9;
                            }
                            $i5 = $i12;
                            i3 = $i19;
                            while (true) {
                                $i19 = $i5 - 1;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i3 >> 14, $i18, i8, $i0, i, i2, i4, i6, $i10, 1245522068);
                                $i18 += $i16;
                                $i17 += this.size * 1593584282;
                                $i0 += i5;
                                i += $i6;
                                i2 += i7;
                                i3 += i10;
                                $i3 += $i25;
                                $i5 = $i19;
                            }
                        } else {
                            $i12 = $i17 - $i18;
                            $i13 = $i18 - $i19;
                            $i17 = this.next[$i19];
                            $i18 = $i5;
                            $i19 = $i20;
                            $i5 = i3;
                            i3 = $i13;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i19 >> 14, $i18, i8, $i0, i, i2, i4, i6, $i10, 1245522068);
                                $i19 += i10;
                                $i18 += $i16;
                                $i17 += 219501817 * this.size;
                                $i0 += i5;
                                i += $i6;
                                i2 += i7;
                                $i5 += i9;
                            }
                            $i5 = $i12;
                            i3 = $i19;
                            while (true) {
                                $i19 = $i5 - 1;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i3 >> 14, i3 >> 14, $i18, i8, $i0, i, i2, i4, i6, $i10, 1245522068);
                                $i18 += $i16;
                                $i17 += 968080574 * this.size;
                                $i0 += i5;
                                i += $i6;
                                i2 += i7;
                                i3 += i10;
                                $i3 += $i25;
                                $i5 = $i19;
                            }
                        }
                    } else {
                        $i20 = i2 << 14;
                        if ($i19 < 0) {
                            i3 = $i20 - (i9 * $i19);
                            $i20 -= $i19 * i10;
                            i = $i5 - ($i16 * $i19);
                            $i19 = 0;
                        } else {
                            i = $i5;
                            i3 = $i20;
                        }
                        $i0 <<= 14;
                        if ($i17 < 0) {
                            $i17 = 0;
                            $i5 = $i0 - ($i25 * $i17);
                        } else {
                            $i5 = $i0;
                        }
                        $i3 = $i19 - (this.parent * -348431082);
                        $i0 = $i13 + ($i3 * i5);
                        i2 = $i14 + ($i6 * $i3);
                        $i3 = $i12 + ($i3 * i7);
                        if (i9 >= i10) {
                            $i18 -= $i17;
                            $i13 = $i17 - $i19;
                            $i17 = this.next[$i19];
                            $i12 = $i20;
                            while (true) {
                                $i19 = $i13 - 1;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i12 >> 14, i3 >> 14, i, i8, $i0, i2, $i3, i4, i6, $i10, 1245522068);
                                i3 += i9;
                                i += $i16;
                                $i17 += this.size * -1741252353;
                                $i0 += i5;
                                i2 += $i6;
                                $i3 += i7;
                                $i12 += i10;
                                $i13 = $i19;
                            }
                            $i19 = $i5;
                            while (true) {
                                $i18--;
                                if ($i18 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i19 >> 14, i3 >> 14, i, i8, $i0, i2, $i3, i4, i6, $i10, 1245522068);
                                i += $i16;
                                $i17 += 554814340 * this.size;
                                $i0 += i5;
                                i2 += $i6;
                                $i3 += i7;
                                $i19 += $i25;
                                i3 += i9;
                            }
                        } else {
                            $i18 -= $i17;
                            $i13 = $i17 - $i19;
                            $i17 = this.next[$i19];
                            $i12 = $i20;
                            while (true) {
                                $i19 = $i13 - 1;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i12 >> 14, i, i8, $i0, i2, $i3, i4, i6, $i10, 1245522068);
                                i3 += i9;
                                i += $i16;
                                $i17 += this.size * 1029096020;
                                $i0 += i5;
                                i2 += $i6;
                                $i3 += i7;
                                $i12 += i10;
                                $i13 = $i19;
                            }
                            $i19 = $i5;
                            while (true) {
                                $i18--;
                                if ($i18 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i19 >> 14, i, i8, $i0, i2, $i3, i4, i6, $i10, 1245522068);
                                i += $i16;
                                $i17 += -1741252353 * this.size;
                                $i0 += i5;
                                i2 += $i6;
                                $i3 += i7;
                                $i19 += $i25;
                                i3 += i9;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            if ($i17 < this.length * -1086144933) {
                if ($i18 > -1063766229 * this.length) {
                    $i18 = 1901896148 * this.length;
                }
                $i5 = $i19 > this.length * -1935819277 ? this.length * -1759402563 : $i19;
                $i7 = ($i3 << 9) - (i8 * $i0);
                $i19 = $i7;
                $i19 = $i7 + i8;
                if ($i18 >= $i5) {
                    $i0 <<= 14;
                    if ($i17 < 0) {
                        $i20 = $i0 - (i10 * $i17);
                        i = $i0 - ($i17 * $i25);
                        $i19 -= $i16 * $i17;
                        $i17 = 0;
                    } else {
                        $i20 = $i0;
                        i = $i0;
                    }
                    $i0 = i2 << 14;
                    if ($i5 < 0) {
                        $i0 -= $i5 * i9;
                        $i5 = 0;
                    }
                    i3 = $i17 - (-523971820 * this.parent);
                    i2 = $i13 + (i5 * i3);
                    $i3 = $i14 + (i3 * $i6);
                    i3 = $i12 + (i3 * i7);
                    if (($i5 != $i17 && i10 < $i25) || ($i17 == $i5 && i9 > $i25)) {
                        $i18 -= $i5;
                        $i5 -= $i17;
                        $i17 = this.next[$i17];
                        $i12 = $i20;
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i12 >> 14, i >> 14, $i19, i8, i2, $i3, i3, i4, i6, $i10, 1245522068);
                            i += $i25;
                            $i19 += $i16;
                            $i17 += -1741252353 * this.size;
                            i2 += i5;
                            $i3 += $i6;
                            i3 += i7;
                            $i12 += i10;
                        }
                        while (true) {
                            $i18--;
                            if ($i18 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i0 >> 14, i >> 14, $i19, i8, i2, $i3, i3, i4, i6, $i10, 1245522068);
                            $i0 += i9;
                            $i19 += $i16;
                            $i17 += this.size * -1642684794;
                            i2 += i5;
                            $i3 += $i6;
                            i3 += i7;
                            i += $i25;
                        }
                    } else {
                        $i18 -= $i5;
                        $i5 -= $i17;
                        $i17 = this.next[$i17];
                        $i12 = $i20;
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, i >> 14, $i12 >> 14, $i19, i8, i2, $i3, i3, i4, i6, $i10, 1245522068);
                            i += $i25;
                            $i19 += $i16;
                            $i17 += this.size * -1741252353;
                            i2 += i5;
                            $i3 += $i6;
                            i3 += i7;
                            $i12 += i10;
                        }
                        while (true) {
                            $i18--;
                            if ($i18 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, i >> 14, $i0 >> 14, $i19, i8, i2, $i3, i3, i4, i6, $i10, 1245522068);
                            $i0 += i9;
                            $i19 += $i16;
                            $i17 += 2046625773 * this.size;
                            i2 += i5;
                            $i3 += $i6;
                            i3 += i7;
                            i += $i25;
                        }
                    }
                } else {
                    $i0 <<= 14;
                    if ($i17 < 0) {
                        $i3 = $i0 - ($i17 * i10);
                        $i20 = $i0 - ($i25 * $i17);
                        $i19 -= $i17 * $i16;
                        $i17 = 0;
                    } else {
                        $i3 = $i0;
                        $i20 = $i0;
                    }
                    $i0 = i << 14;
                    if ($i18 < 0) {
                        $i18 *= i9;
                        $i18 = 0;
                        i3 = $i0 - $i18;
                    } else {
                        i3 = $i0;
                    }
                    i2 = $i17 - (-1571295876 * this.parent);
                    $i0 = $i13 + (i5 * i2);
                    i = $i14 + (i2 * $i6);
                    i2 = $i12 + (i2 * i7);
                    if (($i18 != $i17 && i10 < $i25) || ($i18 == $i17 && i10 > i9)) {
                        $i5 -= $i18;
                        $i18 -= $i17;
                        $i17 = this.next[$i17];
                        $i12 = $i20;
                        while (true) {
                            $i18--;
                            if ($i18 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i12 >> 14, $i19, i8, $i0, i, i2, i4, i6, $i10, 1245522068);
                            $i3 += i10;
                            $i19 += $i16;
                            $i17 += -1741252353 * this.size;
                            $i0 += i5;
                            i += $i6;
                            i2 += i7;
                            $i12 += $i25;
                        }
                        $i18 = $i5;
                        $i5 = $i3;
                        $i3 = i3;
                        while (true) {
                            $i18--;
                            if ($i18 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i3 >> 14, $i19, i8, $i0, i, i2, i4, i6, $i10, 1245522068);
                            $i19 += $i16;
                            $i17 += this.size * 1649587681;
                            $i0 += i5;
                            i += $i6;
                            i2 += i7;
                            $i3 += i9;
                            $i5 += i10;
                        }
                    } else {
                        $i5 -= $i18;
                        $i18 -= $i17;
                        $i17 = this.next[$i17];
                        $i12 = $i20;
                        while (true) {
                            $i18--;
                            if ($i18 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i12 >> 14, $i3 >> 14, $i19, i8, $i0, i, i2, i4, i6, $i10, 1245522068);
                            $i3 += i10;
                            $i19 += $i16;
                            $i17 += this.size * -1741252353;
                            $i0 += i5;
                            i += $i6;
                            i2 += i7;
                            $i12 += $i25;
                        }
                        $i18 = $i5;
                        $i5 = $i3;
                        $i3 = i3;
                        while (true) {
                            $i18--;
                            if ($i18 < 0) {
                                break;
                            }
                            read(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i5 >> 14, $i19, i8, $i0, i, i2, i4, i6, $i10, 1245522068);
                            $i19 += $i16;
                            $i17 += 353549606 * this.size;
                            $i0 += i5;
                            i += $i6;
                            i2 += i7;
                            $i3 += i9;
                            $i5 += i10;
                        }
                    }
                }
            }
        }
    }

    public final void getSize(int[] iArr, int i, int i2) {
        this.size = iArr;
        this.size = -145201409 * i;
        this.header = 359809005 * i2;
        add(0, 0, i, i2, (byte) -67);
        toString(-1402488977);
    }

    public void init() {
    }

    public final void init(int[] iArr, int i, int i2) {
        this.size = iArr;
        this.size = -1442418282 * i;
        this.header = 1360881458 * i2;
        add(0, 0, i, i2, (byte) -51);
        toString(-1419248460);
    }

    public final void jjMoveNfa_0(int $i4, int $i5, int $i6, int $i0, int $i1, int $i2, int i) {
        int $i7 = $i5 != $i4 ? (($i1 - $i0) << 14) / ($i5 - $i4) : 0;
        int $i9 = $i5 != $i6 ? (($i2 - $i1) << 14) / ($i6 - $i5) : 0;
        int $i8 = $i4 != $i6 ? (($i0 - $i2) << 14) / ($i4 - $i6) : 0;
        int $i10;
        int $i11;
        if ($i4 <= $i5 && $i4 <= $i6) {
            if ($i4 < this.length * -2136419805) {
                if ($i5 > this.length * -1759402563) {
                    $i5 = -1759402563 * this.length;
                }
                $i10 = $i6 > -1759402563 * this.length ? this.length * -722187615 : $i6;
                if ($i5 >= $i10) {
                    $i0 <<= 14;
                    if ($i4 < 0) {
                        $i11 = $i0 - ($i4 * $i8);
                        $i0 -= $i4 * $i7;
                        $i4 = 0;
                    } else {
                        $i11 = $i0;
                    }
                    $i6 = $i2 << 14;
                    if ($i10 < 0) {
                        $i6 -= $i10 * $i9;
                        $i10 = 0;
                    }
                    if (($i10 != $i4 && $i8 < $i7) || ($i4 == $i10 && $i9 > $i7)) {
                        $i5 -= $i10;
                        $i1 = $i11;
                        $i2 = $i10 - $i4;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i2--;
                            if ($i2 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i1 >> 14, $i0 >> 14, (byte) 91);
                            $i0 += $i7;
                            $i4 += this.size * -1741252353;
                            $i1 += $i8;
                        }
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i0 >> 14, (byte) 47);
                            $i6 += $i9;
                            $i4 += this.size * 1130222437;
                            $i0 += $i7;
                        }
                    } else {
                        $i1 = $i5 - $i10;
                        $i2 = $i11;
                        $i5 = $i0;
                        $i0 = $i10 - $i4;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i2 >> 14, (byte) 87);
                            $i5 += $i7;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i8;
                        }
                        $i0 = $i1;
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i6 >> 14, (byte) 126);
                            $i4 += 1587489504 * this.size;
                            $i6 += $i9;
                            $i5 += $i7;
                        }
                    }
                } else {
                    $i2 = $i0 << 14;
                    if ($i4 < 0) {
                        $i11 = $i2 - ($i8 * $i4);
                        $i2 -= $i7 * $i4;
                        $i4 = 0;
                    } else {
                        $i11 = $i2;
                    }
                    $i6 = $i1 << 14;
                    if ($i5 < 0) {
                        $i6 -= $i9 * $i5;
                        $i5 = 0;
                    }
                    if (($i5 != $i4 && $i8 < $i7) || ($i5 == $i4 && $i8 > $i9)) {
                        $i0 = $i10 - $i5;
                        $i10 = $i5 - $i4;
                        $i5 = $i11;
                        $i1 = $i2;
                        $i2 = $i10;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i2--;
                            if ($i2 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i1 >> 14, (byte) 112);
                            $i5 += $i8;
                            $i4 += this.size * 2073277916;
                            $i1 += $i7;
                        }
                        $i1 = $i0;
                        $i0 = $i6;
                        while (true) {
                            $i6 = $i1 - 1;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i0 >> 14, (byte) 90);
                            $i4 += -1741252353 * this.size;
                            $i5 += $i8;
                            $i0 += $i9;
                            $i1 = $i6;
                        }
                    } else {
                        $i0 = $i10 - $i5;
                        $i10 = $i5 - $i4;
                        $i5 = $i11;
                        $i1 = $i2;
                        $i2 = $i10;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i2--;
                            if ($i2 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i1 >> 14, $i5 >> 14, (byte) 106);
                            $i5 += $i8;
                            $i4 += -94997679 * this.size;
                            $i1 += $i7;
                        }
                        $i1 = $i5;
                        $i5 = $i0;
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i1 >> 14, (byte) 115);
                            $i6 += $i9;
                            $i4 += this.size * -49853882;
                            $i1 += $i8;
                        }
                    }
                }
            }
        } else if ($i5 > $i6) {
            if ($i6 < -1073236502 * this.length) {
                if ($i4 > this.length * -654296798) {
                    $i4 = -1759402563 * this.length;
                }
                $i10 = $i5 > 1347877634 * this.length ? this.length * -1759402563 : $i5;
                if ($i4 >= $i10) {
                    $i0 = $i2 << 14;
                    if ($i6 < 0) {
                        $i2 = $i0 - ($i6 * $i9);
                        $i0 -= $i8 * $i6;
                        $i6 = 0;
                    } else {
                        $i2 = $i0;
                    }
                    $i5 = $i1 << 14;
                    if ($i10 < 0) {
                        $i5 -= $i7 * $i10;
                        $i10 = 0;
                    }
                    if ($i9 >= $i8) {
                        $i1 = $i4 - $i10;
                        $i4 = this.next[$i6];
                        $i6 = $i10 - $i6;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i2 >> 14, (byte) 124);
                            $i0 += $i8;
                            $i4 += this.size * -1741252353;
                            $i2 += $i9;
                        }
                        $i6 = $i0;
                        $i0 = $i5;
                        while (true) {
                            $i5 = $i1 - 1;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i0 >> 14, (byte) 124);
                            $i4 += this.size * -1741252353;
                            $i6 += $i8;
                            $i0 += $i7;
                            $i1 = $i5;
                        }
                    } else {
                        $i1 = $i4 - $i10;
                        $i4 = this.next[$i6];
                        $i6 = $i10 - $i6;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i2 >> 14, $i0 >> 14, (byte) 35);
                            $i0 += $i8;
                            $i4 += -27971018 * this.size;
                            $i2 += $i9;
                        }
                        $i6 = $i1;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i0 >> 14, (byte) 24);
                            $i5 += $i7;
                            $i4 += this.size * -1741252353;
                            $i0 += $i8;
                        }
                    }
                } else {
                    $i2 <<= 14;
                    if ($i6 < 0) {
                        $i1 = $i2 - ($i6 * $i9);
                        $i2 -= $i8 * $i6;
                        $i6 = 0;
                    } else {
                        $i1 = $i2;
                    }
                    $i5 = $i0 << 14;
                    if ($i4 < 0) {
                        $i5 -= $i4 * $i7;
                        $i4 = 0;
                    }
                    if ($i9 >= $i8) {
                        $i0 = $i10 - $i4;
                        $i10 = $i4 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i2 >> 14, $i6 >> 14, (byte) 57);
                            $i6 += $i9;
                            $i4 += 1521185902 * this.size;
                            $i2 += $i8;
                        }
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i6 >> 14, (byte) 63);
                            $i4 += this.size * -1741252353;
                            $i6 += $i9;
                            $i5 += $i7;
                        }
                    } else {
                        $i0 = $i10 - $i4;
                        $i10 = $i4 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i2 >> 14, (byte) 23);
                            $i6 += $i9;
                            $i4 += 2008155961 * this.size;
                            $i2 += $i8;
                        }
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i5 >> 14, (byte) 57);
                            $i5 += $i7;
                            $i4 += this.size * -1741252353;
                            $i6 += $i9;
                        }
                    }
                }
            }
        } else if ($i5 < -1759402563 * this.length) {
            if ($i6 > this.length * 843792845) {
                $i6 = -1759402563 * this.length;
            }
            $i10 = $i4 > -1759402563 * this.length ? this.length * -1759402563 : $i4;
            if ($i6 >= $i10) {
                $i1 <<= 14;
                if ($i5 < 0) {
                    $i2 = $i1 - ($i7 * $i5);
                    $i1 -= $i5 * $i9;
                    $i5 = 0;
                } else {
                    $i2 = $i1;
                }
                $i4 = $i0 << 14;
                if ($i10 < 0) {
                    $i4 -= $i10 * $i8;
                    $i10 = 0;
                }
                if ($i7 >= $i9) {
                    $i6 -= $i10;
                    $i10 -= $i5;
                    $i5 = this.next[$i5];
                    $i0 = $i1;
                    $i1 = $i10;
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i0 >> 14, $i2 >> 14, (byte) 19);
                        $i0 += $i9;
                        $i5 += -1741252353 * this.size;
                        $i2 += $i7;
                    }
                    while (true) {
                        $i6--;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i0 >> 14, $i4 >> 14, (byte) 62);
                        $i4 += $i8;
                        $i5 += -383904990 * this.size;
                        $i0 += $i9;
                    }
                } else {
                    $i6 -= $i10;
                    $i10 -= $i5;
                    $i5 = this.next[$i5];
                    $i0 = $i1;
                    $i1 = $i10;
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i2 >> 14, $i0 >> 14, (byte) 109);
                        $i0 += $i9;
                        $i5 += -1385393910 * this.size;
                        $i2 += $i7;
                    }
                    $i1 = $i6;
                    $i6 = $i4;
                    while (true) {
                        $i4 = $i1 - 1;
                        if ($i4 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i6 >> 14, $i0 >> 14, (byte) 88);
                        $i5 += this.size * -1741252353;
                        $i0 += $i9;
                        $i6 += $i8;
                        $i1 = $i4;
                    }
                }
            } else {
                $i11 = $i1 << 14;
                if ($i5 < 0) {
                    $i1 = $i11 - ($i5 * $i7);
                    $i11 -= $i9 * $i5;
                    $i5 = 0;
                } else {
                    $i1 = $i11;
                }
                $i4 = $i2 << 14;
                if ($i6 < 0) {
                    $i4 -= $i6 * $i8;
                    $i6 = 0;
                }
                if (($i5 != $i6 && $i7 < $i9) || ($i6 == $i5 && $i7 > $i8)) {
                    $i0 = $i10 - $i6;
                    $i10 = $i6 - $i5;
                    $i2 = $i11;
                    $i6 = $i1;
                    $i1 = $i10;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i6 >> 14, $i2 >> 14, (byte) 53);
                        $i6 += $i7;
                        $i5 += this.size * -1741252353;
                        $i2 += $i9;
                    }
                    $i1 = $i6;
                    $i6 = $i0;
                    while (true) {
                        $i6--;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i1 >> 14, $i4 >> 14, (byte) 102);
                        $i4 += $i8;
                        $i5 += -1741252353 * this.size;
                        $i1 += $i7;
                    }
                } else {
                    $i0 = $i10 - $i6;
                    $i10 = $i6 - $i5;
                    $i2 = $i11;
                    $i6 = $i1;
                    $i1 = $i10;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i2 >> 14, $i6 >> 14, (byte) 59);
                        $i6 += $i7;
                        $i5 += this.size * -1741252353;
                        $i2 += $i9;
                    }
                    $i1 = $i4;
                    $i4 = $i0;
                    while (true) {
                        $i4--;
                        if ($i4 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i1 >> 14, $i6 >> 14, (byte) 31);
                        $i5 += -1741252353 * this.size;
                        $i1 += $i8;
                        $i6 += $i7;
                    }
                }
            }
        }
    }

    public final void jjMoveNfa_3(int $i4, int $i5, int $i6, int i, int $i1, int i2, int i3) {
        int $i7 = $i5 != $i4 ? (($i1 - i) << 14) / ($i5 - $i4) : 0;
        int $i9 = $i5 != $i6 ? ((i2 - $i1) << 14) / ($i6 - $i5) : 0;
        int $i8 = $i4 != $i6 ? ((i - i2) << 14) / ($i4 - $i6) : 0;
        int $i10;
        if ($i4 <= $i5 && $i4 <= $i6) {
            if ($i4 < this.length * -1759402563) {
                if ($i5 > this.length * 1860205044) {
                    $i5 = -1022567491 * this.length;
                }
                $i10 = $i6 > -1759402563 * this.length ? this.length * -1759402563 : $i6;
                if ($i5 >= $i10) {
                    $i6 = i << 14;
                    if ($i4 < 0) {
                        $i1 = $i6 - ($i4 * $i8);
                        i = $i6 - ($i4 * $i7);
                        $i4 = 0;
                    } else {
                        $i1 = $i6;
                        i = $i6;
                    }
                    $i6 = i2 << 14;
                    if ($i10 < 0) {
                        $i6 -= $i9 * $i10;
                        i2 = 0;
                    } else {
                        i2 = $i10;
                    }
                    if ((i2 != $i4 && $i8 < $i7) || ($i4 == i2 && $i9 > $i7)) {
                        $i5 -= i2;
                        $i10 = i2 - $i4;
                        $i4 = this.next[$i4];
                        i2 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, i2 >> 14, i >> 14, (byte) 110);
                            i += $i7;
                            $i4 += this.size * 1685644343;
                            i2 += $i8;
                        }
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, $i6 >> 14, i >> 14, (byte) 4);
                            $i4 += this.size * 1819327329;
                            $i6 += $i9;
                            i += $i7;
                        }
                    } else {
                        $i5 -= i2;
                        $i10 = i2 - $i4;
                        $i4 = this.next[$i4];
                        i2 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, i >> 14, i2 >> 14, (byte) 126);
                            i += $i7;
                            $i4 += 1885911592 * this.size;
                            i2 += $i8;
                        }
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, i >> 14, $i6 >> 14, (byte) 77);
                            $i6 += $i9;
                            $i4 += -1690196789 * this.size;
                            i += $i7;
                        }
                    }
                } else {
                    i <<= 14;
                    if ($i4 < 0) {
                        i2 = i - ($i8 * $i4);
                        i -= $i7 * $i4;
                        $i4 = 0;
                    } else {
                        i2 = i;
                    }
                    $i6 = $i1 << 14;
                    if ($i5 < 0) {
                        $i6 -= $i9 * $i5;
                        $i5 = 0;
                    }
                    if (($i5 != $i4 && $i8 < $i7) || ($i5 == $i4 && $i8 > $i9)) {
                        $i1 = $i10 - $i5;
                        $i5 -= $i4;
                        $i10 = this.next[$i4];
                        $i4 = i2;
                        i2 = $i5;
                        $i5 = $i10;
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            add(this.size, $i5, i3, 0, $i4 >> 14, i >> 14, (byte) 55);
                            $i4 += $i8;
                            $i5 += this.size * -1670229309;
                            i += $i7;
                        }
                        i = $i1;
                        while (true) {
                            i--;
                            if (i < 0) {
                                break;
                            }
                            add(this.size, $i5, i3, 0, $i4 >> 14, $i6 >> 14, (byte) 79);
                            $i5 += -1962086162 * this.size;
                            $i4 += $i8;
                            $i6 += $i9;
                        }
                    } else {
                        $i1 = $i10 - $i5;
                        $i10 = $i5 - $i4;
                        $i5 = i2;
                        i2 = $i10;
                        $i4 = this.next[$i4];
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, i >> 14, $i5 >> 14, (byte) 103);
                            $i5 += $i8;
                            $i4 += -1880822811 * this.size;
                            i += $i7;
                        }
                        i = $i1;
                        while (true) {
                            i--;
                            if (i < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, $i6 >> 14, $i5 >> 14, (byte) 124);
                            $i6 += $i9;
                            $i4 += this.size * 265516311;
                            $i5 += $i8;
                        }
                    }
                }
            }
        } else if ($i5 > $i6) {
            if ($i6 < -1759402563 * this.length) {
                if ($i4 > this.length * -1759402563) {
                    $i4 = 1438466713 * this.length;
                }
                $i10 = $i5 > -1759402563 * this.length ? this.length * 51413096 : $i5;
                if ($i4 >= $i10) {
                    $i11 = i2 << 14;
                    if ($i6 < 0) {
                        i2 = $i11 - ($i6 * $i9);
                        $i11 -= $i8 * $i6;
                        $i6 = 0;
                    } else {
                        i2 = $i11;
                    }
                    $i5 = $i1 << 14;
                    if ($i10 < 0) {
                        $i5 -= $i10 * $i7;
                        $i10 = 0;
                    }
                    if ($i9 >= $i8) {
                        i = $i4 - $i10;
                        $i1 = $i10 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i11;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, $i6 >> 14, i2 >> 14, (byte) 31);
                            $i6 += $i8;
                            $i4 += this.size * 1529427361;
                            i2 += $i9;
                        }
                        $i1 = i;
                        i = $i5;
                        while (true) {
                            $i5 = $i1 - 1;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, $i6 >> 14, i >> 14, (byte) 29);
                            $i4 += this.size * 739233481;
                            $i6 += $i8;
                            i += $i7;
                            $i1 = $i5;
                        }
                    } else {
                        i = $i4 - $i10;
                        $i1 = $i10 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i11;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, i2 >> 14, $i6 >> 14, (byte) 8);
                            $i6 += $i8;
                            $i4 += -1741252353 * this.size;
                            i2 += $i9;
                        }
                        $i1 = $i6;
                        $i6 = i;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, $i5 >> 14, $i1 >> 14, (byte) 23);
                            $i5 += $i7;
                            $i4 += this.size * -69929916;
                            $i1 += $i8;
                        }
                    }
                } else {
                    i2 <<= 14;
                    if ($i6 < 0) {
                        $i1 = i2 - ($i6 * $i9);
                        i2 -= $i8 * $i6;
                        $i6 = 0;
                    } else {
                        $i1 = i2;
                    }
                    $i5 = i << 14;
                    if ($i4 < 0) {
                        $i5 -= $i4 * $i7;
                        $i4 = 0;
                    }
                    if ($i9 >= $i8) {
                        i = $i10 - $i4;
                        $i10 = $i4 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, i2 >> 14, $i6 >> 14, (byte) 50);
                            $i6 += $i9;
                            $i4 += -1369823886 * this.size;
                            i2 += $i8;
                        }
                        while (true) {
                            i--;
                            if (i < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, $i5 >> 14, $i6 >> 14, (byte) 93);
                            $i4 += this.size * -1741252353;
                            $i6 += $i9;
                            $i5 += $i7;
                        }
                    } else {
                        i = $i10 - $i4;
                        $i10 = $i4 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, $i6 >> 14, i2 >> 14, (byte) 76);
                            $i6 += $i9;
                            $i4 += -1741252353 * this.size;
                            i2 += $i8;
                        }
                        while (true) {
                            i--;
                            if (i < 0) {
                                break;
                            }
                            add(this.size, $i4, i3, 0, $i6 >> 14, $i5 >> 14, (byte) 119);
                            $i5 += $i7;
                            $i4 += this.size * -226163218;
                            $i6 += $i9;
                        }
                    }
                }
            }
        } else if ($i5 < -1759402563 * this.length) {
            if ($i6 > this.length * -674590930) {
                $i6 = -1759402563 * this.length;
            }
            $i10 = $i4 > 533402719 * this.length ? this.length * -1759402563 : $i4;
            if ($i6 >= $i10) {
                $i1 <<= 14;
                if ($i5 < 0) {
                    i2 = $i1 - ($i7 * $i5);
                    $i1 -= $i5 * $i9;
                    $i5 = 0;
                } else {
                    i2 = $i1;
                }
                $i4 = i << 14;
                if ($i10 < 0) {
                    $i4 -= $i10 * $i8;
                    $i10 = 0;
                }
                if ($i7 >= $i9) {
                    i = $i6 - $i10;
                    $i10 -= $i5;
                    $i5 = this.next[$i5];
                    $i6 = $i1;
                    $i1 = $i10;
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i3, 0, $i6 >> 14, i2 >> 14, (byte) 40);
                        $i6 += $i9;
                        $i5 += -1741252353 * this.size;
                        i2 += $i7;
                    }
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        add(this.size, $i5, i3, 0, $i6 >> 14, $i4 >> 14, (byte) 19);
                        $i5 += 1501622557 * this.size;
                        $i6 += $i9;
                        $i4 += $i8;
                    }
                } else {
                    $i6 -= $i10;
                    $i10 -= $i5;
                    $i5 = this.next[$i5];
                    i = $i1;
                    $i1 = $i10;
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i3, 0, i2 >> 14, i >> 14, (byte) 58);
                        i += $i9;
                        $i5 += -842885926 * this.size;
                        i2 += $i7;
                    }
                    while (true) {
                        $i6--;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i3, 0, $i4 >> 14, i >> 14, (byte) 77);
                        $i4 += $i8;
                        $i5 += this.size * -1741252353;
                        i += $i9;
                    }
                }
            } else {
                $i11 = $i1 << 14;
                if ($i5 < 0) {
                    $i1 = $i11 - ($i5 * $i7);
                    $i11 -= $i9 * $i5;
                    $i5 = 0;
                } else {
                    $i1 = $i11;
                }
                $i4 = i2 << 14;
                if ($i6 < 0) {
                    $i4 -= $i6 * $i8;
                    $i6 = 0;
                }
                if (($i5 != $i6 && $i7 < $i9) || ($i6 == $i5 && $i7 > $i8)) {
                    i = $i10 - $i6;
                    $i10 = $i6 - $i5;
                    i2 = $i11;
                    $i6 = $i1;
                    $i1 = $i10;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i3, 0, $i6 >> 14, i2 >> 14, (byte) 121);
                        $i6 += $i7;
                        $i5 += this.size * -1741252353;
                        i2 += $i9;
                    }
                    $i1 = i;
                    i = $i6;
                    while (true) {
                        $i6 = $i1 - 1;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i3, 0, i >> 14, $i4 >> 14, (byte) 43);
                        $i5 += -1741252353 * this.size;
                        $i4 += $i8;
                        i += $i7;
                        $i1 = $i6;
                    }
                } else {
                    i = $i10 - $i6;
                    $i10 = $i6 - $i5;
                    i2 = $i11;
                    $i6 = $i1;
                    $i1 = $i10;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i3, 0, i2 >> 14, $i6 >> 14, (byte) 35);
                        $i6 += $i7;
                        $i5 += this.size * -1741252353;
                        i2 += $i9;
                    }
                    $i1 = $i6;
                    $i6 = i;
                    while (true) {
                        $i6--;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i3, 0, $i4 >> 14, $i1 >> 14, (byte) 109);
                        $i4 += $i8;
                        $i5 += -1741252353 * this.size;
                        $i1 += $i7;
                    }
                }
            }
        }
    }

    public final void parse(int $i4, int $i5, int $i6, int $i0, int $i1, int $i2, int i) {
        int $i7 = $i5 != $i4 ? (($i1 - $i0) << 14) / ($i5 - $i4) : 0;
        int $i9 = $i5 != $i6 ? (($i2 - $i1) << 14) / ($i6 - $i5) : 0;
        int $i8 = $i4 != $i6 ? (($i0 - $i2) << 14) / ($i4 - $i6) : 0;
        int $i10;
        int $i11;
        if ($i4 <= $i5 && $i4 <= $i6) {
            if ($i4 < this.length * -1759402563) {
                if ($i5 > this.length * -1759402563) {
                    $i5 = -1759402563 * this.length;
                }
                $i10 = $i6 > -1759402563 * this.length ? this.length * -1759402563 : $i6;
                if ($i5 >= $i10) {
                    $i6 = $i0 << 14;
                    if ($i4 < 0) {
                        $i1 = $i6 - ($i4 * $i8);
                        $i0 = $i6 - ($i4 * $i7);
                        $i4 = 0;
                    } else {
                        $i1 = $i6;
                        $i0 = $i6;
                    }
                    $i6 = $i2 << 14;
                    if ($i10 < 0) {
                        $i6 -= $i9 * $i10;
                        $i2 = 0;
                    } else {
                        $i2 = $i10;
                    }
                    if (($i2 != $i4 && $i8 < $i7) || ($i4 == $i2 && $i9 > $i7)) {
                        $i5 -= $i2;
                        $i10 = $i2 - $i4;
                        $i4 = this.next[$i4];
                        $i2 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i2 >> 14, $i0 >> 14, (byte) 6);
                            $i0 += $i7;
                            $i4 += this.size * -1741252353;
                            $i2 += $i8;
                        }
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i0 >> 14, (byte) 41);
                            $i4 += this.size * -1741252353;
                            $i6 += $i9;
                            $i0 += $i7;
                        }
                    } else {
                        $i5 -= $i2;
                        $i10 = $i2 - $i4;
                        $i4 = this.next[$i4];
                        $i2 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i2 >> 14, (byte) 76);
                            $i0 += $i7;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i8;
                        }
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i6 >> 14, (byte) 32);
                            $i6 += $i9;
                            $i4 += -1741252353 * this.size;
                            $i0 += $i7;
                        }
                    }
                } else {
                    $i2 = $i0 << 14;
                    if ($i4 < 0) {
                        $i11 = $i2 - ($i8 * $i4);
                        $i2 -= $i7 * $i4;
                        $i4 = 0;
                    } else {
                        $i11 = $i2;
                    }
                    $i6 = $i1 << 14;
                    if ($i5 < 0) {
                        $i6 -= $i9 * $i5;
                        $i5 = 0;
                    }
                    if (($i5 != $i4 && $i8 < $i7) || ($i5 == $i4 && $i8 > $i9)) {
                        $i0 = $i10 - $i5;
                        $i10 = $i5 - $i4;
                        $i5 = $i11;
                        $i1 = $i2;
                        $i2 = $i10;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i2--;
                            if ($i2 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i1 >> 14, (byte) 33);
                            $i5 += $i8;
                            $i4 += this.size * -1741252353;
                            $i1 += $i7;
                        }
                        $i1 = $i0;
                        $i0 = $i6;
                        while (true) {
                            $i6 = $i1 - 1;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i0 >> 14, (byte) 29);
                            $i4 += -1741252353 * this.size;
                            $i5 += $i8;
                            $i0 += $i9;
                            $i1 = $i6;
                        }
                    } else {
                        $i0 = $i10 - $i5;
                        $i10 = $i5 - $i4;
                        $i5 = $i11;
                        $i1 = $i2;
                        $i2 = $i10;
                        $i4 = this.next[$i4];
                        while (true) {
                            $i2--;
                            if ($i2 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i1 >> 14, $i5 >> 14, (byte) 36);
                            $i5 += $i8;
                            $i4 += -1741252353 * this.size;
                            $i1 += $i7;
                        }
                        $i1 = $i5;
                        $i5 = $i0;
                        while (true) {
                            $i5--;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i1 >> 14, (byte) 37);
                            $i6 += $i9;
                            $i4 += this.size * -1741252353;
                            $i1 += $i8;
                        }
                    }
                }
            }
        } else if ($i5 > $i6) {
            if ($i6 < -1759402563 * this.length) {
                if ($i4 > this.length * -1759402563) {
                    $i4 = -1759402563 * this.length;
                }
                $i10 = $i5 > -1759402563 * this.length ? this.length * -1759402563 : $i5;
                if ($i4 >= $i10) {
                    $i0 = $i2 << 14;
                    if ($i6 < 0) {
                        $i2 = $i0 - ($i6 * $i9);
                        $i0 -= $i8 * $i6;
                        $i6 = 0;
                    } else {
                        $i2 = $i0;
                    }
                    $i5 = $i1 << 14;
                    if ($i10 < 0) {
                        $i5 -= $i7 * $i10;
                        $i10 = 0;
                    }
                    if ($i9 >= $i8) {
                        $i1 = $i4 - $i10;
                        $i4 = this.next[$i6];
                        $i6 = $i10 - $i6;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i0 >> 14, $i2 >> 14, (byte) 44);
                            $i0 += $i8;
                            $i4 += this.size * -1741252353;
                            $i2 += $i9;
                        }
                        $i6 = $i0;
                        $i0 = $i5;
                        while (true) {
                            $i5 = $i1 - 1;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i0 >> 14, (byte) 104);
                            $i4 += this.size * -1741252353;
                            $i6 += $i8;
                            $i0 += $i7;
                            $i1 = $i5;
                        }
                    } else {
                        $i1 = $i4 - $i10;
                        $i4 = this.next[$i6];
                        $i6 = $i10 - $i6;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i2 >> 14, $i0 >> 14, (byte) 63);
                            $i0 += $i8;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i9;
                        }
                        $i6 = $i1;
                        while (true) {
                            $i6--;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i0 >> 14, (byte) 21);
                            $i5 += $i7;
                            $i4 += this.size * -1741252353;
                            $i0 += $i8;
                        }
                    }
                } else {
                    $i2 <<= 14;
                    if ($i6 < 0) {
                        $i1 = $i2 - ($i6 * $i9);
                        $i2 -= $i8 * $i6;
                        $i6 = 0;
                    } else {
                        $i1 = $i2;
                    }
                    $i5 = $i0 << 14;
                    if ($i4 < 0) {
                        $i5 -= $i4 * $i7;
                        $i4 = 0;
                    }
                    if ($i9 >= $i8) {
                        $i0 = $i10 - $i4;
                        $i10 = $i4 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i2 >> 14, $i6 >> 14, (byte) 29);
                            $i6 += $i9;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i8;
                        }
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i5 >> 14, $i6 >> 14, (byte) 28);
                            $i4 += this.size * -1741252353;
                            $i6 += $i9;
                            $i5 += $i7;
                        }
                    } else {
                        $i0 = $i10 - $i4;
                        $i10 = $i4 - $i6;
                        $i4 = this.next[$i6];
                        $i6 = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i2 >> 14, (byte) 116);
                            $i6 += $i9;
                            $i4 += -1741252353 * this.size;
                            $i2 += $i8;
                        }
                        while (true) {
                            $i0--;
                            if ($i0 < 0) {
                                break;
                            }
                            add(this.size, $i4, i, 0, $i6 >> 14, $i5 >> 14, (byte) 22);
                            $i5 += $i7;
                            $i4 += this.size * -1741252353;
                            $i6 += $i9;
                        }
                    }
                }
            }
        } else if ($i5 < -1759402563 * this.length) {
            if ($i6 > this.length * -1759402563) {
                $i6 = -1759402563 * this.length;
            }
            $i10 = $i4 > -1759402563 * this.length ? this.length * -1759402563 : $i4;
            if ($i6 >= $i10) {
                $i4 = $i1 << 14;
                if ($i5 < 0) {
                    $i2 = $i4 - ($i7 * $i5);
                    $i1 = $i4 - ($i5 * $i9);
                    $i5 = 0;
                } else {
                    $i2 = $i4;
                    $i1 = $i4;
                }
                $i4 = $i0 << 14;
                if ($i10 < 0) {
                    $i4 -= $i8 * $i10;
                    $i0 = 0;
                } else {
                    $i0 = $i10;
                }
                if ($i7 >= $i9) {
                    $i6 -= $i0;
                    $i0 -= $i5;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i1 >> 14, $i2 >> 14, (byte) 18);
                        $i1 += $i9;
                        $i5 += -1741252353 * this.size;
                        $i2 += $i7;
                    }
                    $i0 = $i1;
                    $i1 = $i6;
                    $i6 = $i4;
                    while (true) {
                        $i4 = $i1 - 1;
                        if ($i4 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i0 >> 14, $i6 >> 14, (byte) 84);
                        $i5 += -1741252353 * this.size;
                        $i0 += $i9;
                        $i6 += $i8;
                        $i1 = $i4;
                    }
                } else {
                    $i6 -= $i0;
                    $i0 -= $i5;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i2 >> 14, $i1 >> 14, (byte) 26);
                        $i1 += $i9;
                        $i5 += -1741252353 * this.size;
                        $i2 += $i7;
                    }
                    $i0 = $i1;
                    while (true) {
                        $i6--;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i4 >> 14, $i0 >> 14, (byte) 59);
                        $i4 += $i8;
                        $i5 += this.size * -1741252353;
                        $i0 += $i9;
                    }
                }
            } else {
                $i11 = $i1 << 14;
                if ($i5 < 0) {
                    $i1 = $i11 - ($i5 * $i7);
                    $i11 -= $i9 * $i5;
                    $i5 = 0;
                } else {
                    $i1 = $i11;
                }
                $i4 = $i2 << 14;
                if ($i6 < 0) {
                    $i4 -= $i6 * $i8;
                    $i6 = 0;
                }
                if (($i5 != $i6 && $i7 < $i9) || ($i6 == $i5 && $i7 > $i8)) {
                    $i0 = $i10 - $i6;
                    $i10 = $i6 - $i5;
                    $i2 = $i11;
                    $i6 = $i1;
                    $i1 = $i10;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i6 >> 14, $i2 >> 14, (byte) 115);
                        $i6 += $i7;
                        $i5 += this.size * -1741252353;
                        $i2 += $i9;
                    }
                    $i1 = $i0;
                    $i0 = $i6;
                    while (true) {
                        $i6 = $i1 - 1;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i0 >> 14, $i4 >> 14, (byte) 63);
                        $i5 += -1741252353 * this.size;
                        $i4 += $i8;
                        $i0 += $i7;
                        $i1 = $i6;
                    }
                } else {
                    $i0 = $i10 - $i6;
                    $i10 = $i6 - $i5;
                    $i2 = $i11;
                    $i6 = $i1;
                    $i1 = $i10;
                    $i5 = this.next[$i5];
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i2 >> 14, $i6 >> 14, (byte) 103);
                        $i6 += $i7;
                        $i5 += this.size * -1741252353;
                        $i2 += $i9;
                    }
                    $i1 = $i6;
                    $i6 = $i0;
                    while (true) {
                        $i6--;
                        if ($i6 < 0) {
                            break;
                        }
                        add(this.size, $i5, i, 0, $i4 >> 14, $i1 >> 14, (byte) 78);
                        $i4 += $i8;
                        $i5 += -1741252353 * this.size;
                        $i1 += $i7;
                    }
                }
            }
        }
    }

    public final void parse(int $i5, int $i6, int i, int i2, int $i1, int i3, int i4, int i5) {
        if ($i6 != $i5) {
            try {
                i5 = (($i1 - i2) << 14) / ($i6 - $i5);
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "cj.as(" + ')');
            }
        }
        i5 = 0;
        int $i9 = $i6 != i ? ((i3 - $i1) << 14) / (i - $i6) : 0;
        int $i8 = $i5 != i ? ((i2 - i3) << 14) / ($i5 - i) : 0;
        int $i10;
        int $i11;
        if ($i5 <= $i6 && $i5 <= i) {
            if ($i5 < this.length * -1759402563) {
                $i10 = $i6 > this.length * -1759402563 ? -1759402563 * this.length : $i6;
                if (i > -1759402563 * this.length) {
                    i = this.length * -1759402563;
                }
                if ($i10 >= i) {
                    i2 <<= 14;
                    if ($i5 < 0) {
                        $i11 = i2 - ($i5 * $i8);
                        i2 -= $i5 * i5;
                        $i5 = 0;
                    } else {
                        $i11 = i2;
                    }
                    $i6 = i3 << 14;
                    if (i < 0) {
                        $i6 -= i * $i9;
                        i = 0;
                    }
                    if ((i != $i5 && $i8 < i5) || ($i5 == i && $i9 > i5)) {
                        $i1 = $i10 - i;
                        $i10 = i - $i5;
                        $i5 = this.next[$i5];
                        i3 = $i11;
                        i = i2;
                        i2 = $i10;
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            add(this.size, $i5, i4, 0, i3 >> 14, i >> 14, (byte) 60);
                            i += i5;
                            $i5 += this.size * -1741252353;
                            i3 += $i8;
                        }
                        i2 = $i1;
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            add(this.size, $i5, i4, 0, $i6 >> 14, i >> 14, (byte) 67);
                            $i6 += $i9;
                            $i5 += this.size * -1741252353;
                            i += i5;
                        }
                    } else {
                        $i1 = $i10 - i;
                        $i10 = i - $i5;
                        $i5 = this.next[$i5];
                        i3 = $i11;
                        i = i2;
                        i2 = $i10;
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            add(this.size, $i5, i4, 0, i >> 14, i3 >> 14, (byte) 28);
                            i += i5;
                            $i5 += -1741252353 * this.size;
                            i3 += $i8;
                        }
                        i2 = $i1;
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            add(this.size, $i5, i4, 0, i >> 14, $i6 >> 14, (byte) 60);
                            $i5 += -1741252353 * this.size;
                            $i6 += $i9;
                            i += i5;
                        }
                    }
                } else {
                    i2 <<= 14;
                    if ($i5 < 0) {
                        i3 = i2 - ($i8 * $i5);
                        i2 -= i5 * $i5;
                        $i5 = 0;
                    } else {
                        i3 = i2;
                    }
                    $i6 = $i1 << 14;
                    if ($i10 < 0) {
                        $i6 -= $i10 * $i9;
                        $i10 = 0;
                    }
                    if (($i10 != $i5 && $i8 < i5) || ($i10 == $i5 && $i8 > $i9)) {
                        i -= $i10;
                        $i10 -= $i5;
                        $i5 = this.next[$i5];
                        $i1 = i3;
                        i3 = $i10;
                        while (true) {
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                            add(this.size, $i5, i4, 0, $i1 >> 14, i2 >> 14, (byte) 98);
                            $i1 += $i8;
                            $i5 += this.size * -1741252353;
                            i2 += i5;
                        }
                        i2 = $i1;
                        $i1 = i;
                        i = $i6;
                        while (true) {
                            $i6 = $i1 - 1;
                            if ($i6 < 0) {
                                break;
                            }
                            add(this.size, $i5, i4, 0, i2 >> 14, i >> 14, (byte) 104);
                            $i5 += -1741252353 * this.size;
                            i2 += $i8;
                            i += $i9;
                            $i1 = $i6;
                        }
                    } else {
                        i -= $i10;
                        $i10 -= $i5;
                        $i5 = this.next[$i5];
                        $i1 = i3;
                        i3 = $i10;
                        while (true) {
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                            add(this.size, $i5, i4, 0, i2 >> 14, $i1 >> 14, (byte) 85);
                            $i1 += $i8;
                            $i5 += -1741252353 * this.size;
                            i2 += i5;
                        }
                        i2 = $i1;
                        while (true) {
                            i--;
                            if (i < 0) {
                                break;
                            }
                            add(this.size, $i5, i4, 0, $i6 >> 14, i2 >> 14, (byte) 5);
                            $i6 += $i9;
                            $i5 += this.size * -1741252353;
                            i2 += $i8;
                        }
                    }
                }
            }
        } else if ($i6 > i) {
            if (i < -1759402563 * this.length) {
                $i10 = $i5 > this.length * -1759402563 ? -1759402563 * this.length : $i5;
                if ($i6 > -1759402563 * this.length) {
                    $i6 = this.length * -1759402563;
                }
                if ($i10 >= $i6) {
                    $i11 = i3 << 14;
                    if (i < 0) {
                        i3 = $i11 - (i * $i9);
                        $i11 -= $i8 * i;
                        i = 0;
                    } else {
                        i3 = $i11;
                    }
                    $i5 = $i1 << 14;
                    if ($i6 < 0) {
                        $i5 -= $i6 * i5;
                        $i6 = 0;
                    }
                    if ($i9 >= $i8) {
                        i2 = $i10 - $i6;
                        $i1 = $i6 - i;
                        $i6 = this.next[i];
                        i = $i11;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i6, i4, 0, i >> 14, i3 >> 14, (byte) 50);
                            i += $i8;
                            $i6 += this.size * -1741252353;
                            i3 += $i9;
                        }
                        $i1 = i2;
                        i2 = $i5;
                        while (true) {
                            $i5 = $i1 - 1;
                            if ($i5 < 0) {
                                break;
                            }
                            add(this.size, $i6, i4, 0, i >> 14, i2 >> 14, (byte) 98);
                            $i6 += this.size * -1741252353;
                            i += $i8;
                            i2 += i5;
                            $i1 = $i5;
                        }
                    } else {
                        i2 = $i10 - $i6;
                        $i1 = $i6 - i;
                        $i6 = this.next[i];
                        i = $i11;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i6, i4, 0, i3 >> 14, i >> 14, (byte) 84);
                            i += $i8;
                            $i6 += -1741252353 * this.size;
                            i3 += $i9;
                        }
                        $i1 = i;
                        i = i2;
                        while (true) {
                            i--;
                            if (i < 0) {
                                break;
                            }
                            add(this.size, $i6, i4, 0, $i5 >> 14, $i1 >> 14, (byte) 59);
                            $i5 += i5;
                            $i6 += this.size * -1741252353;
                            $i1 += $i8;
                        }
                    }
                } else {
                    i3 <<= 14;
                    if (i < 0) {
                        $i1 = i3 - (i * $i9);
                        i3 -= $i8 * i;
                        i = 0;
                    } else {
                        $i1 = i3;
                    }
                    $i5 = i2 << 14;
                    if ($i10 < 0) {
                        $i5 -= $i10 * i5;
                        $i10 = 0;
                    }
                    if ($i9 >= $i8) {
                        i2 = $i6 - $i10;
                        $i10 -= i;
                        $i6 = this.next[i];
                        i = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i6, i4, 0, i3 >> 14, i >> 14, (byte) 124);
                            i += $i9;
                            $i6 += -1741252353 * this.size;
                            i3 += $i8;
                        }
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            add(this.size, $i6, i4, 0, $i5 >> 14, i >> 14, (byte) 86);
                            $i5 += i5;
                            $i6 += this.size * -1741252353;
                            i += $i9;
                        }
                    } else {
                        i2 = $i6 - $i10;
                        $i10 -= i;
                        $i6 = this.next[i];
                        i = $i1;
                        $i1 = $i10;
                        while (true) {
                            $i1--;
                            if ($i1 < 0) {
                                break;
                            }
                            add(this.size, $i6, i4, 0, i >> 14, i3 >> 14, (byte) 21);
                            i += $i9;
                            $i6 += -1741252353 * this.size;
                            i3 += $i8;
                        }
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            add(this.size, $i6, i4, 0, i >> 14, $i5 >> 14, (byte) 75);
                            $i6 += this.size * -1741252353;
                            i += $i9;
                            $i5 += i5;
                        }
                    }
                }
            }
        } else if ($i6 < -1759402563 * this.length) {
            $i10 = i > this.length * -1759402563 ? -1759402563 * this.length : i;
            $i11 = $i5 > -1759402563 * this.length ? this.length * -1759402563 : $i5;
            if ($i10 >= $i11) {
                i = $i1 << 14;
                if ($i6 < 0) {
                    $i1 = i - (i5 * $i6);
                    i -= $i6 * $i9;
                    $i6 = 0;
                } else {
                    $i1 = i;
                }
                $i5 = i2 << 14;
                if ($i11 < 0) {
                    $i5 -= $i11 * $i8;
                    $i11 = 0;
                }
                if (i5 >= $i9) {
                    i2 = $i10 - $i11;
                    i3 = $i11 - $i6;
                    $i6 = this.next[$i6];
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        add(this.size, $i6, i4, 0, i >> 14, $i1 >> 14, (byte) 67);
                        i += $i9;
                        $i6 += -1741252353 * this.size;
                        $i1 += i5;
                    }
                    $i1 = i;
                    i = i2;
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        add(this.size, $i6, i4, 0, $i1 >> 14, $i5 >> 14, (byte) 84);
                        $i5 += $i8;
                        $i6 += -1741252353 * this.size;
                        $i1 += $i9;
                    }
                } else {
                    i2 = $i10 - $i11;
                    i3 = $i11 - $i6;
                    $i6 = this.next[$i6];
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        add(this.size, $i6, i4, 0, $i1 >> 14, i >> 14, (byte) 37);
                        i += $i9;
                        $i6 += -1741252353 * this.size;
                        $i1 += i5;
                    }
                    $i1 = i2;
                    i2 = $i5;
                    while (true) {
                        $i5 = $i1 - 1;
                        if ($i5 < 0) {
                            break;
                        }
                        add(this.size, $i6, i4, 0, i2 >> 14, i >> 14, (byte) 44);
                        $i6 += this.size * -1741252353;
                        i += $i9;
                        i2 += $i8;
                        $i1 = $i5;
                    }
                }
            } else {
                $i1 <<= 14;
                if ($i6 < 0) {
                    i = $i1 - ($i6 * i5);
                    $i1 -= $i9 * $i6;
                    $i6 = 0;
                } else {
                    i = $i1;
                }
                $i5 = i3 << 14;
                if ($i10 < 0) {
                    $i5 -= $i10 * $i8;
                    i3 = 0;
                } else {
                    i3 = $i10;
                }
                if (($i6 != i3 && i5 < $i9) || (i3 == $i6 && i5 > $i8)) {
                    i2 = $i11 - i3;
                    $i10 = i3 - $i6;
                    $i6 = this.next[$i6];
                    i3 = $i1;
                    $i1 = $i10;
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i6, i4, 0, i >> 14, i3 >> 14, (byte) 120);
                        i += i5;
                        $i6 += this.size * -1741252353;
                        i3 += $i9;
                    }
                    $i1 = $i5;
                    $i5 = i2;
                    while (true) {
                        $i5--;
                        if ($i5 < 0) {
                            break;
                        }
                        add(this.size, $i6, i4, 0, i >> 14, $i1 >> 14, (byte) 17);
                        $i6 += -1741252353 * this.size;
                        $i1 += $i8;
                        i += i5;
                    }
                } else {
                    i2 = $i11 - i3;
                    $i10 = i3 - $i6;
                    $i6 = this.next[$i6];
                    i3 = $i1;
                    $i1 = $i10;
                    while (true) {
                        $i1--;
                        if ($i1 < 0) {
                            break;
                        }
                        add(this.size, $i6, i4, 0, i3 >> 14, i >> 14, (byte) 55);
                        i += i5;
                        $i6 += this.size * -1741252353;
                        i3 += $i9;
                    }
                    $i1 = i;
                    i = i2;
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        add(this.size, $i6, i4, 0, $i5 >> 14, $i1 >> 14, (byte) 108);
                        $i5 += $i8;
                        $i6 += -1741252353 * this.size;
                        $i1 += i5;
                    }
                }
            }
        }
    }

    final void process(int $i17, int $i18, int $i19, int i, int i2, int i3, int $i3, int i4, int i5, int $i6, int i6, int i7, int i8, int $i10, int i9, int $i12, int $i13, int $i14, int i10) {
        int[] $r2 = Point.type.get(i10, (short) 255);
        if ($r2 == null) {
            $i6 = Point.type.toString(i10, 1577195485);
            getSize($i17, $i18, $i19, i, i2, i3, Calendar.get($i6, $i3, -2107159748), Calendar.get($i6, i4, -2084049681), Calendar.get($i6, i5, -2095219196), 1254219238);
            return;
        }
        this.value = Point.type.add(i10, -40973320);
        this.pos = Point.type.equals(i10, -181727620);
        int $i21 = i2 - i;
        i10 = $i18 - $i17;
        int $i16 = i3 - i;
        int $i22 = $i19 - $i17;
        int $i20 = i4 - $i3;
        int $i23 = i5 - $i3;
        int i11 = $i18 != $i17 ? ((i2 - i) << 14) / ($i18 - $i17) : 0;
        int i12 = $i19 != $i18 ? ((i3 - i2) << 14) / ($i19 - $i18) : 0;
        int i13 = $i17 != $i19 ? ((i - i3) << 14) / ($i17 - $i19) : 0;
        int i14 = ($i22 * $i21) - ($i16 * i10);
        if (i14 != 0) {
            i10 = ((($i22 * $i20) - (i10 * $i23)) << 9) / i14;
            $i16 = ((($i21 * $i23) - ($i20 * $i16)) << 9) / i14;
            $i20 = $i6 - i6;
            $i10 = i8 - $i10;
            $i21 = $i12 - $i13;
            $i23 = i7 - $i6;
            $i22 = i9 - i8;
            i9 = $i14 - $i12;
            $i13 = (($i23 * i8) - ($i6 * $i22)) << 14;
            long $l29 = ($i12 * $i22) - (i8 * i9);
            Object obj = $l29;
            int $i7 = (((long) $l29) << 14) / ((long) (542614623 * this.this$0));
            long j = $i7;
            i6 = (int) $i7;
            $i7 = (i9 * $i6) - ($i12 * $i23);
            i7 = $i7;
            $i7 = (((long) $i7) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            i7 = (int) $i7;
            $i14 = ((i8 * $i20) - ($i6 * $i10)) << 14;
            j = ((long) (($i10 * $i12) - ($i21 * i8))) << 14;
            $l29 = this.this$0 * 542614623;
            Object obj2 = $l29;
            $l29 = j / ((long) $l29);
            j = $l29;
            i8 = (int) $l29;
            $i7 = ($i6 * $i21) - ($i12 * $i20);
            $i6 = $i7;
            j = ((long) $i7) << 14;
            $l29 = this.this$0 * 542614623;
            Object obj3 = $l29;
            $l29 = j / ((long) $l29);
            j = $l29;
            $i6 = (int) $l29;
            $i12 = (($i23 * $i10) - ($i20 * $i22)) << 14;
            $i7 = (((long) (($i22 * $i21) - ($i10 * i9))) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            $i10 = (int) $i7;
            $i7 = ($i20 * i9) - ($i23 * $i21);
            i9 = $i7;
            $i7 = (((long) $i7) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            i9 = (int) $i7;
            if ($i17 > $i18 || $i17 > $i19) {
                if ($i18 > $i19) {
                    if ($i19 < this.length * -1759402563) {
                        if ($i17 > -1759402563 * this.length) {
                            $i17 = -1759402563 * this.length;
                        }
                        if ($i18 > -1759402563 * this.length) {
                            $i18 = -1759402563 * this.length;
                        }
                        i5 = ((i5 << 9) - (i10 * i3)) + i10;
                        if ($i17 >= $i18) {
                            $i20 = i3 << 14;
                            if ($i19 < 0) {
                                i4 = $i20 - ($i19 * i12);
                                $i20 -= i13 * $i19;
                                i5 -= $i16 * $i19;
                                $i19 = 0;
                            } else {
                                i4 = $i20;
                            }
                            i = i2 << 14;
                            if ($i18 < 0) {
                                i -= $i18 * i11;
                                $i18 = 0;
                            }
                            $i3 = $i19 - (-1508152919 * this.parent);
                            i2 = $i13 + ($i3 * i7);
                            i3 = $i14 + ($i3 * $i6);
                            $i3 = $i12 + ($i3 * i9);
                            if (i12 >= i13) {
                                $i12 = $i17 - $i18;
                                $i13 = $i18 - $i19;
                                $i17 = this.next[$i19];
                                $i18 = i5;
                                $i19 = $i20;
                                i5 = i4;
                                i4 = $i13;
                                while (true) {
                                    i4--;
                                    if (i4 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i19 >> 14, i5 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                    $i19 += i13;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i2 += i7;
                                    i3 += $i6;
                                    $i3 += i9;
                                    i5 += i12;
                                }
                                i4 = $i19;
                                $i19 = $i12;
                                while (true) {
                                    $i19--;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, i4 >> 14, i >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                    i += i11;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i2 += i7;
                                    i3 += $i6;
                                    $i3 += i9;
                                    i4 += i13;
                                }
                            } else {
                                $i12 = $i17 - $i18;
                                $i13 = $i18 - $i19;
                                $i17 = this.next[$i19];
                                $i18 = i5;
                                $i19 = $i20;
                                i5 = i4;
                                i4 = $i13;
                                while (true) {
                                    i4--;
                                    if (i4 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, i5 >> 14, $i19 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                    $i19 += i13;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i2 += i7;
                                    i3 += $i6;
                                    $i3 += i9;
                                    i5 += i12;
                                }
                                i4 = $i19;
                                $i19 = $i12;
                                while (true) {
                                    $i19--;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, i >> 14, i4 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                    i += i11;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i2 += i7;
                                    i3 += $i6;
                                    $i3 += i9;
                                    i4 += i13;
                                }
                            }
                        } else {
                            $i20 = i3 << 14;
                            if ($i19 < 0) {
                                i4 = $i20 - (i12 * $i19);
                                $i20 -= $i19 * i13;
                                i2 = i5 - ($i16 * $i19);
                                $i19 = 0;
                            } else {
                                i2 = i5;
                                i4 = $i20;
                            }
                            i <<= 14;
                            if ($i17 < 0) {
                                $i17 = 0;
                                i5 = i - (i11 * $i17);
                            } else {
                                i5 = i;
                            }
                            $i3 = $i19 - (-1508152919 * this.parent);
                            i = $i13 + ($i3 * i7);
                            i3 = $i14 + ($i6 * $i3);
                            $i3 = $i12 + ($i3 * i9);
                            if (i12 >= i13) {
                                $i18 -= $i17;
                                $i13 = $i17 - $i19;
                                $i17 = this.next[$i19];
                                $i12 = $i20;
                                while (true) {
                                    $i19 = $i13 - 1;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i12 >> 14, i4 >> 14, i2, i10, i, i3, $i3, i6, i8, $i10, 68239216);
                                    i4 += i12;
                                    i2 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i7;
                                    i3 += $i6;
                                    $i3 += i9;
                                    $i12 += i13;
                                    $i13 = $i19;
                                }
                                $i19 = i5;
                                while (true) {
                                    $i18--;
                                    if ($i18 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, $i19 >> 14, i4 >> 14, i2, i10, i, i3, $i3, i6, i8, $i10, 68239216);
                                    i2 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i += i7;
                                    i3 += $i6;
                                    $i3 += i9;
                                    $i19 += i11;
                                    i4 += i12;
                                }
                            } else {
                                $i18 -= $i17;
                                $i13 = $i17 - $i19;
                                $i17 = this.next[$i19];
                                $i12 = $i20;
                                while (true) {
                                    $i19 = $i13 - 1;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, i4 >> 14, $i12 >> 14, i2, i10, i, i3, $i3, i6, i8, $i10, 68239216);
                                    i4 += i12;
                                    i2 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i7;
                                    i3 += $i6;
                                    $i3 += i9;
                                    $i12 += i13;
                                    $i13 = $i19;
                                }
                                $i19 = i5;
                                while (true) {
                                    $i18--;
                                    if ($i18 < 0) {
                                        break;
                                    }
                                    encode(this.size, $r2, 0, 0, $i17, i4 >> 14, $i19 >> 14, i2, i10, i, i3, $i3, i6, i8, $i10, 68239216);
                                    i2 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i7;
                                    i3 += $i6;
                                    $i3 += i9;
                                    $i19 += i11;
                                    i4 += i12;
                                }
                            }
                        }
                    }
                } else if ($i18 < -1759402563 * this.length) {
                    if ($i19 > -1759402563 * this.length) {
                        $i19 = -1759402563 * this.length;
                    }
                    if ($i17 > -1759402563 * this.length) {
                        $i17 = -1759402563 * this.length;
                    }
                    i5 = ((i4 << 9) - (i2 * i10)) + i10;
                    if ($i19 >= $i17) {
                        i4 = i2 << 14;
                        if ($i18 < 0) {
                            $i20 = i4 - ($i18 * i11);
                            i4 -= i12 * $i18;
                            i5 -= $i18 * $i16;
                            $i18 = 0;
                        } else {
                            $i20 = i4;
                        }
                        i <<= 14;
                        if ($i17 < 0) {
                            i -= i13 * $i17;
                            $i17 = 0;
                        }
                        $i3 = $i18 - (-1508152919 * this.parent);
                        i2 = $i13 + (i7 * $i3);
                        i3 = $i14 + ($i6 * $i3);
                        $i3 = $i12 + ($i3 * i9);
                        if (i11 >= i12) {
                            $i19 -= $i17;
                            $i12 = $i17 - $i18;
                            $i17 = this.next[$i18];
                            $i18 = i5;
                            i5 = $i20;
                            while (true) {
                                $i12--;
                                if ($i12 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i4 >> 14, i5 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                i4 += i12;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i2 += i7;
                                i3 += $i6;
                                $i3 += i9;
                                i5 += i11;
                            }
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i4 >> 14, i >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                i += i13;
                                $i18 += $i16;
                                $i17 += this.size * -1741252353;
                                i2 += i7;
                                i3 += $i6;
                                $i3 += i9;
                                i4 += i12;
                            }
                        } else {
                            $i19 -= $i17;
                            $i13 = $i17 - $i18;
                            $i17 = this.next[$i18];
                            $i18 = i5;
                            $i12 = $i20;
                            i5 = $i13;
                            while (true) {
                                i5--;
                                if (i5 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, $i12 >> 14, i4 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                i4 += i12;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i2 += i7;
                                i3 += $i6;
                                $i3 += i9;
                                $i12 += i11;
                            }
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i >> 14, i4 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                i += i13;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i2 += i7;
                                i3 += $i6;
                                $i3 += i9;
                                i4 += i12;
                            }
                        }
                    } else {
                        $i20 = i2 << 14;
                        if ($i18 < 0) {
                            i4 = $i20 - ($i18 * i11);
                            $i20 -= i12 * $i18;
                            i = i5 - ($i16 * $i18);
                            $i18 = 0;
                        } else {
                            i = i5;
                            i4 = $i20;
                        }
                        i2 = i3 << 14;
                        if ($i19 < 0) {
                            i2 -= $i19 * i13;
                            $i19 = 0;
                        }
                        i5 = $i18 - (-1508152919 * this.parent);
                        i3 = $i13 + (i7 * i5);
                        $i3 = $i14 + (i5 * $i6);
                        i5 = $i12 + (i5 * i9);
                        if (($i18 != $i19 && i11 < i12) || ($i18 == $i19 && i11 > i13)) {
                            $i12 = $i17 - $i19;
                            $i13 = $i19 - $i18;
                            $i17 = this.next[$i18];
                            $i19 = $i20;
                            while (true) {
                                $i18 = $i13 - 1;
                                if ($i18 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i4 >> 14, $i19 >> 14, i, i10, i3, $i3, i5, i6, i8, $i10, 68239216);
                                i4 += i11;
                                i += $i16;
                                $i17 += -1741252353 * this.size;
                                i3 += i7;
                                $i3 += $i6;
                                i5 += i9;
                                $i19 += i12;
                                $i13 = $i18;
                            }
                            $i19 = i4;
                            $i18 = $i12;
                            while (true) {
                                $i18--;
                                if ($i18 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, $i19 >> 14, i2 >> 14, i, i10, i3, $i3, i5, i6, i8, $i10, 68239216);
                                i2 += i13;
                                i += $i16;
                                $i17 += this.size * -1741252353;
                                i3 += i7;
                                $i3 += $i6;
                                i5 += i9;
                                $i19 += i11;
                            }
                        } else {
                            $i12 = $i17 - $i19;
                            $i13 = $i19 - $i18;
                            $i17 = this.next[$i18];
                            $i19 = $i20;
                            while (true) {
                                $i18 = $i13 - 1;
                                if ($i18 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, $i19 >> 14, i4 >> 14, i, i10, i3, $i3, i5, i6, i8, $i10, 68239216);
                                i4 += i11;
                                i += $i16;
                                $i17 += this.size * -1741252353;
                                i3 += i7;
                                $i3 += $i6;
                                i5 += i9;
                                $i19 += i12;
                                $i13 = $i18;
                            }
                            $i19 = i4;
                            $i18 = $i12;
                            while (true) {
                                $i18--;
                                if ($i18 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i2 >> 14, $i19 >> 14, i, i10, i3, $i3, i5, i6, i8, $i10, 68239216);
                                i2 += i13;
                                i += $i16;
                                $i17 += -1741252353 * this.size;
                                i3 += i7;
                                $i3 += $i6;
                                i5 += i9;
                                $i19 += i11;
                            }
                        }
                    }
                }
            } else {
                if ($i17 < this.length * -1759402563) {
                    if ($i18 > -1759402563 * this.length) {
                        $i18 = this.length * -1759402563;
                    }
                    if ($i19 > this.length * -1759402563) {
                        $i19 = this.length * -1759402563;
                    }
                    i4 = (($i3 << 9) - (i * i10)) + i10;
                    if ($i18 >= $i19) {
                        i2 = i << 14;
                        if ($i17 < 0) {
                            $i20 = i2 - (i13 * $i17);
                            $i3 = i2 - ($i17 * i11);
                            i = i4 - ($i16 * $i17);
                            $i17 = 0;
                        } else {
                            i = i4;
                            $i20 = i2;
                            $i3 = i2;
                        }
                        i2 = i3 << 14;
                        if ($i19 < 0) {
                            i2 -= $i19 * i12;
                            $i19 = 0;
                        }
                        i5 = $i17 - (this.parent * -1508152919);
                        i3 = $i13 + (i5 * i7);
                        i4 = $i14 + (i5 * $i6);
                        i5 = $i12 + (i5 * i9);
                        if (($i19 != $i17 && i13 < i11) || ($i17 == $i19 && i12 > i11)) {
                            $i18 -= $i19;
                            $i19 -= $i17;
                            $i17 = this.next[$i17];
                            $i12 = $i20;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, $i12 >> 14, $i3 >> 14, i, i10, i3, i4, i5, i6, i8, $i10, 68239216);
                                $i3 += i11;
                                i += $i16;
                                $i17 += -1741252353 * this.size;
                                i3 += i7;
                                i4 += $i6;
                                i5 += i9;
                                $i12 += i13;
                            }
                            while (true) {
                                $i18--;
                                if ($i18 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i2 >> 14, $i3 >> 14, i, i10, i3, i4, i5, i6, i8, $i10, 68239216);
                                i2 += i12;
                                i += $i16;
                                $i17 += -1741252353 * this.size;
                                i3 += i7;
                                i4 += $i6;
                                i5 += i9;
                                $i3 += i11;
                            }
                        } else {
                            $i18 -= $i19;
                            $i19 -= $i17;
                            $i17 = this.next[$i17];
                            $i12 = $i20;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i12 >> 14, i, i10, i3, i4, i5, i6, i8, $i10, 68239216);
                                $i3 += i11;
                                i += $i16;
                                $i17 += -1741252353 * this.size;
                                i3 += i7;
                                i4 += $i6;
                                i5 += i9;
                                $i12 += i13;
                            }
                            while (true) {
                                $i18--;
                                if ($i18 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, $i3 >> 14, i2 >> 14, i, i10, i3, i4, i5, i6, i8, $i10, 68239216);
                                i2 += i12;
                                i += $i16;
                                $i17 += this.size * -1741252353;
                                i3 += i7;
                                i4 += $i6;
                                i5 += i9;
                                $i3 += i11;
                            }
                        }
                    } else {
                        i5 = i << 14;
                        if ($i17 < 0) {
                            $i20 = i5 - (i13 * $i17);
                            i5 -= $i17 * i11;
                            i4 -= $i16 * $i17;
                            $i17 = 0;
                        } else {
                            $i20 = i5;
                        }
                        i = i2 << 14;
                        if ($i18 < 0) {
                            i -= $i18 * i12;
                            $i18 = 0;
                        }
                        $i3 = $i17 - (this.parent * -1508152919);
                        i2 = $i13 + ($i3 * i7);
                        i3 = $i14 + ($i3 * $i6);
                        $i3 = $i12 + ($i3 * i9);
                        if (($i18 != $i17 && i13 < i11) || ($i18 == $i17 && i13 > i12)) {
                            $i19 -= $i18;
                            $i12 = $i18 - $i17;
                            $i17 = this.next[$i17];
                            $i18 = i4;
                            i4 = $i20;
                            $i13 = i5;
                            i5 = $i12;
                            while (true) {
                                i5--;
                                if (i5 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i4 >> 14, $i13 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                i4 += i13;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i2 += i7;
                                i3 += $i6;
                                $i3 += i9;
                                $i13 += i11;
                            }
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i4 >> 14, i >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                i += i12;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i2 += i7;
                                i3 += $i6;
                                $i3 += i9;
                                i4 += i13;
                            }
                        } else {
                            $i19 -= $i18;
                            $i12 = $i18 - $i17;
                            $i17 = this.next[$i17];
                            $i18 = i4;
                            i4 = $i20;
                            $i13 = i5;
                            i5 = $i12;
                            while (true) {
                                i5--;
                                if (i5 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, $i13 >> 14, i4 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                i4 += i13;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i2 += i7;
                                i3 += $i6;
                                $i3 += i9;
                                $i13 += i11;
                            }
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                encode(this.size, $r2, 0, 0, $i17, i >> 14, i4 >> 14, $i18, i10, i2, i3, $i3, i6, i8, $i10, 68239216);
                                i += i12;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                i2 += i7;
                                i3 += $i6;
                                $i3 += i9;
                                i4 += i13;
                            }
                        }
                    }
                }
            }
        }
    }

    final void process(int[] iArr, int $i0, int i, int i2, int $i5, int $i6, int $i3, int $i4) {
        if (this.f201c) {
            if ($i6 > this.buffer * 784773023) {
                $i6 = this.buffer * 784773023;
            }
            if ($i5 < 0) {
                $i5 = 0;
            }
        }
        if ($i5 < $i6) {
            i = $i0 + $i5;
            $i0 = ($i4 * $i5) + $i3;
            int $i11;
            int $i7;
            if (!this.f202s) {
                i2 = $i6 - $i5;
                if (this.f200b * 238267341 != 0) {
                    $i5 = this.f200b * 238267341;
                    $i6 = 256 - (this.f200b * 238267341);
                    while (true) {
                        $i11 = Point.count[$i0 >> 8];
                        $i0 += $i4;
                        $i7 = ((((65280 & $i11) * $i6) >> 8) & 65280) + (((($i11 & 16711935) * $i6) >> 8) & 16711935);
                        $i11 = iArr[i];
                        iArr[i] = ($i7 + ((((16711935 & $i11) * $i5) >> 8) & 16711935)) + (((($i11 & 65280) * $i5) >> 8) & 65280);
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        i++;
                    }
                } else {
                    while (true) {
                        iArr[i] = Point.count[$i0 >> 8];
                        $i0 += $i4;
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                $i3 = ($i6 - $i5) >> 2;
                $i11 = $i4 << 2;
                if (238267341 * this.f200b == 0) {
                    if ($i3 > 0) {
                        do {
                            i2 = Point.count[$i0 >> 8];
                            $i0 += $i11;
                            $i4 = i + 1;
                            iArr[i] = i2;
                            i = $i4 + 1;
                            iArr[$i4] = i2;
                            $i4 = i + 1;
                            iArr[i] = i2;
                            i = $i4 + 1;
                            iArr[$i4] = i2;
                            $i3--;
                        } while ($i3 > 0);
                    }
                    i2 = ($i6 - $i5) & 3;
                    if (i2 > 0) {
                        $i0 = Point.count[$i0 >> 8];
                        while (true) {
                            iArr[i] = $i0;
                            i2--;
                            if (i2 <= 0) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    i2 = 238267341 * this.f200b;
                    $i4 = 256 - (this.f200b * 238267341);
                    if ($i3 > 0) {
                        do {
                            int $i8 = Point.count[$i0 >> 8];
                            $i0 += $i11;
                            $i7 = (((($i8 & 16711935) * $i4) >> 8) & 16711935) + ((((65280 & $i8) * $i4) >> 8) & 65280);
                            int $i9 = iArr[i];
                            $i8 = i + 1;
                            iArr[i] = (((($i9 & 65280) * i2) >> 8) & 65280) + (((((16711935 & $i9) * i2) >> 8) & 16711935) + $i7);
                            int $i10 = iArr[$i8];
                            i = $i8 + 1;
                            iArr[$i8] = ((((($i10 & 16711935) * i2) >> 8) & 16711935) + $i7) + ((((65280 & $i10) * i2) >> 8) & 65280);
                            $i10 = iArr[i];
                            $i8 = i + 1;
                            iArr[i] = ((((($i10 & 16711935) * i2) >> 8) & 16711935) + $i7) + ((((65280 & $i10) * i2) >> 8) & 65280);
                            $i9 = iArr[$i8];
                            i = $i8 + 1;
                            iArr[$i8] = ($i7 + ((((16711935 & $i9) * i2) >> 8) & 16711935)) + (((($i9 & 65280) * i2) >> 8) & 65280);
                            $i3--;
                        } while ($i3 > 0);
                    }
                    $i5 = ($i6 - $i5) & 3;
                    if ($i5 > 0) {
                        $i6 = Point.count[$i0 >> 8];
                        $i0 = ((((65280 & $i6) * $i4) >> 8) & 65280) + (((($i6 & 16711935) * $i4) >> 8) & 16711935);
                        while (true) {
                            $i4 = iArr[i];
                            $i3 = (((65280 & $i4) * i2) >> 8) & 65280;
                            int $i42 = $i4 & 16711935;
                            $i4 = $i42;
                            $i42 = (($i42 * i2) >> 8) & 16711935;
                            $i4 = $i42;
                            iArr[i] = ($i42 + $i0) + $i3;
                            $i5--;
                            if ($i5 <= 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    final void read(int[] iArr, int $i0, int $i1, int i, int $i3, int $i4) {
        if (this.f201c) {
            if ($i4 > this.buffer * 784773023) {
                $i4 = this.buffer * 784773023;
            }
            if ($i3 < 0) {
                $i3 = 0;
            }
        }
        if ($i3 < $i4) {
            int $i6 = $i0 + $i3;
            $i0 = ($i4 - $i3) >> 2;
            if (this.f200b * 238267341 != 0) {
                if (this.f200b * 238267341 != 254) {
                    i = 238267341 * this.f200b;
                    int $i5 = 256 - (this.f200b * 238267341);
                    $i1 = (((($i1 & 16711935) * $i5) >> 8) & 16711935) + ((($i5 * ($i1 & 65280)) >> 8) & 65280);
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        int $i7 = iArr[$i6];
                        $i5 = $i6 + 1;
                        iArr[$i6] = (((($i7 & 65280) * i) >> 8) & 65280) + ((((($i7 & 16711935) * i) >> 8) & 16711935) + $i1);
                        $i7 = iArr[$i5];
                        $i6 = $i5 + 1;
                        iArr[$i5] = (((($i7 & 65280) * i) >> 8) & 65280) + ((((($i7 & 16711935) * i) >> 8) & 16711935) + $i1);
                        $i7 = iArr[$i6];
                        $i5 = $i6 + 1;
                        iArr[$i6] = (((($i7 & 65280) * i) >> 8) & 65280) + ((((($i7 & 16711935) * i) >> 8) & 16711935) + $i1);
                        int $i8 = iArr[$i5];
                        $i6 = $i5 + 1;
                        iArr[$i5] = ((((($i8 & 16711935) * i) >> 8) & 16711935) + $i1) + (((($i8 & 65280) * i) >> 8) & 65280);
                    }
                    $i0 = ($i4 - $i3) & 3;
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        $i4 = iArr[$i6];
                        iArr[$i6] = (((($i4 & 65280) * i) >> 8) & 65280) + ((((($i4 & 16711935) * i) >> 8) & 16711935) + $i1);
                        $i6++;
                    }
                } else {
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        $i1 = $i6 + 1;
                        iArr[$i6] = iArr[$i1];
                        i = $i1 + 1;
                        iArr[$i1] = iArr[i];
                        $i1 = i + 1;
                        iArr[i] = iArr[$i1];
                        $i6 = $i1 + 1;
                        iArr[$i1] = iArr[$i6];
                    }
                    $i0 = ($i4 - $i3) & 3;
                    while (true) {
                        $i0--;
                        if ($i0 < 0) {
                            break;
                        }
                        $i1 = $i6 + 1;
                        iArr[$i6] = iArr[$i1];
                        $i6 = $i1;
                    }
                }
            } else {
                while (true) {
                    $i0--;
                    if ($i0 < 0) {
                        break;
                    }
                    i = $i6 + 1;
                    iArr[$i6] = $i1;
                    $i6 = i + 1;
                    iArr[i] = $i1;
                    i = $i6 + 1;
                    iArr[$i6] = $i1;
                    $i6 = i + 1;
                    iArr[i] = $i1;
                }
                $i0 = ($i4 - $i3) & 3;
                while (true) {
                    $i0--;
                    if ($i0 < 0) {
                        break;
                    }
                    iArr[$i6] = $i1;
                    $i6++;
                }
            }
        }
    }

    final void read(int[] iArr, int $i0, int i, int i2, int $i5, int $i6, int $i3, int $i4) {
        if (this.f201c) {
            if ($i6 > this.buffer * 784773023) {
                $i6 = this.buffer * 784773023;
            }
            if ($i5 < 0) {
                $i5 = 0;
            }
        }
        if ($i5 < $i6) {
            i = $i0 + $i5;
            $i0 = ($i4 * $i5) + $i3;
            int $i11;
            int $i7;
            if (!this.f202s) {
                i2 = $i6 - $i5;
                if (this.f200b * 238267341 != 0) {
                    $i5 = this.f200b * 238267341;
                    $i6 = 256 - (this.f200b * 238267341);
                    while (true) {
                        $i11 = Point.count[$i0 >> 8];
                        $i0 += $i4;
                        $i7 = ((((65280 & $i11) * $i6) >> 8) & 65280) + (((($i11 & 16711935) * $i6) >> 8) & 16711935);
                        $i11 = iArr[i];
                        iArr[i] = ($i7 + ((((16711935 & $i11) * $i5) >> 8) & 16711935)) + (((($i11 & 65280) * $i5) >> 8) & 65280);
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        i++;
                    }
                } else {
                    while (true) {
                        iArr[i] = Point.count[$i0 >> 8];
                        $i0 += $i4;
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                $i3 = ($i6 - $i5) >> 2;
                $i11 = $i4 << 2;
                if (238267341 * this.f200b == 0) {
                    if ($i3 > 0) {
                        do {
                            i2 = Point.count[$i0 >> 8];
                            $i0 += $i11;
                            $i4 = i + 1;
                            iArr[i] = i2;
                            i = $i4 + 1;
                            iArr[$i4] = i2;
                            $i4 = i + 1;
                            iArr[i] = i2;
                            i = $i4 + 1;
                            iArr[$i4] = i2;
                            $i3--;
                        } while ($i3 > 0);
                    }
                    i2 = ($i6 - $i5) & 3;
                    if (i2 > 0) {
                        $i0 = Point.count[$i0 >> 8];
                        while (true) {
                            iArr[i] = $i0;
                            i2--;
                            if (i2 <= 0) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    i2 = 238267341 * this.f200b;
                    $i4 = 256 - (this.f200b * 238267341);
                    if ($i3 > 0) {
                        do {
                            int $i8 = Point.count[$i0 >> 8];
                            $i0 += $i11;
                            $i7 = (((($i8 & 16711935) * $i4) >> 8) & 16711935) + ((((65280 & $i8) * $i4) >> 8) & 65280);
                            int $i9 = iArr[i];
                            $i8 = i + 1;
                            iArr[i] = (((($i9 & 65280) * i2) >> 8) & 65280) + (((((16711935 & $i9) * i2) >> 8) & 16711935) + $i7);
                            int $i10 = iArr[$i8];
                            i = $i8 + 1;
                            iArr[$i8] = ((((($i10 & 16711935) * i2) >> 8) & 16711935) + $i7) + ((((65280 & $i10) * i2) >> 8) & 65280);
                            $i10 = iArr[i];
                            $i8 = i + 1;
                            iArr[i] = ((((($i10 & 16711935) * i2) >> 8) & 16711935) + $i7) + ((((65280 & $i10) * i2) >> 8) & 65280);
                            $i9 = iArr[$i8];
                            i = $i8 + 1;
                            iArr[$i8] = ($i7 + ((((16711935 & $i9) * i2) >> 8) & 16711935)) + (((($i9 & 65280) * i2) >> 8) & 65280);
                            $i3--;
                        } while ($i3 > 0);
                    }
                    $i5 = ($i6 - $i5) & 3;
                    if ($i5 > 0) {
                        $i6 = Point.count[$i0 >> 8];
                        $i0 = ((((65280 & $i6) * $i4) >> 8) & 65280) + (((($i6 & 16711935) * $i4) >> 8) & 16711935);
                        while (true) {
                            $i4 = iArr[i];
                            $i3 = (((65280 & $i4) * i2) >> 8) & 65280;
                            int $i42 = $i4 & 16711935;
                            $i4 = $i42;
                            $i42 = (($i42 * i2) >> 8) & 16711935;
                            $i4 = $i42;
                            iArr[i] = ($i42 + $i0) + $i3;
                            $i5--;
                            if ($i5 <= 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    final void read(int[] iArr, int i, int i2, int i3, int $i6, int i4, int $i3, int $i4, int i5) {
        try {
            if (this.f201c) {
                if (i4 > this.buffer * 784773023) {
                    i4 = this.buffer * 784773023;
                }
                if ($i6 < 0) {
                    $i6 = 0;
                }
            }
            if ($i6 < i4) {
                i2 = i + $i6;
                i = ($i4 * $i6) + $i3;
                int $i5;
                int $i8;
                if (!this.f202s) {
                    i4 -= $i6;
                    if (this.f200b * 238267341 != 0) {
                        i3 = this.f200b * 238267341;
                        $i6 = 256 - (this.f200b * 238267341);
                        while (true) {
                            i5 = Point.count[i >> 8];
                            i += $i4;
                            $i3 = (((65280 & i5) * $i6) >> 8) & 65280;
                            $i5 = i5 & 16711935;
                            i5 = $i5;
                            $i8 = $i3 + ((($i5 * $i6) >> 8) & 16711935);
                            i5 = iArr[i2];
                            $i5 = i5 & 65280;
                            i5 = $i5;
                            iArr[i2] = ($i8 + ((((16711935 & i5) * i3) >> 8) & 16711935)) + ((($i5 * i3) >> 8) & 65280);
                            i4--;
                            if (i4 <= 0) {
                                break;
                            }
                            i2++;
                        }
                    } else {
                        while (true) {
                            iArr[i2] = Point.count[i >> 8];
                            i += $i4;
                            i4--;
                            if (i4 <= 0) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    $i3 = (i4 - $i6) >> 2;
                    $i4 <<= 2;
                    if (238267341 * this.f200b == 0) {
                        if ($i3 > 0) {
                            do {
                                i3 = Point.count[i >> 8];
                                i += $i4;
                                i5 = i2 + 1;
                                iArr[i2] = i3;
                                i2 = i5 + 1;
                                iArr[i5] = i3;
                                i5 = i2 + 1;
                                iArr[i2] = i3;
                                i2 = i5 + 1;
                                iArr[i5] = i3;
                                $i3--;
                            } while ($i3 > 0);
                        }
                        i3 = (i4 - $i6) & 3;
                        if (i3 > 0) {
                            i = Point.count[i >> 8];
                            while (true) {
                                iArr[i2] = i;
                                i3--;
                                if (i3 <= 0) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        i3 = 238267341 * this.f200b;
                        i5 = 256 - (this.f200b * 238267341);
                        if ($i3 > 0) {
                            do {
                                int $i9 = Point.count[i >> 8];
                                i += $i4;
                                $i8 = (((($i9 & 16711935) * i5) >> 8) & 16711935) + ((((65280 & $i9) * i5) >> 8) & 65280);
                                int $i10 = iArr[i2];
                                $i9 = i2 + 1;
                                iArr[i2] = (((($i10 & 65280) * i3) >> 8) & 65280) + (((((16711935 & $i10) * i3) >> 8) & 16711935) + $i8);
                                int $i11 = iArr[$i9];
                                i2 = $i9 + 1;
                                iArr[$i9] = ((((($i11 & 16711935) * i3) >> 8) & 16711935) + $i8) + ((((65280 & $i11) * i3) >> 8) & 65280);
                                $i11 = iArr[i2];
                                $i9 = i2 + 1;
                                iArr[i2] = ((((($i11 & 16711935) * i3) >> 8) & 16711935) + $i8) + ((((65280 & $i11) * i3) >> 8) & 65280);
                                $i10 = iArr[$i9];
                                i2 = $i9 + 1;
                                iArr[$i9] = ($i8 + ((((16711935 & $i10) * i3) >> 8) & 16711935)) + (((($i10 & 65280) * i3) >> 8) & 65280);
                                $i3--;
                            } while ($i3 > 0);
                        }
                        $i6 = (i4 - $i6) & 3;
                        if ($i6 > 0) {
                            i4 = Point.count[i >> 8];
                            i = (((65280 & i4) * i5) >> 8) & 65280;
                            $i5 = i4 & 16711935;
                            i4 = $i5;
                            i += (($i5 * i5) >> 8) & 16711935;
                            while (true) {
                                $i4 = iArr[i2];
                                $i3 = (((65280 & $i4) * i3) >> 8) & 65280;
                                $i5 = $i4 & 16711935;
                                $i4 = $i5;
                                $i5 = (($i5 * i3) >> 8) & 16711935;
                                $i4 = $i5;
                                iArr[i2] = ($i5 + i) + $i3;
                                $i6--;
                                if ($i6 <= 0) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cj.ay(" + ')');
        }
    }

    final void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int $i12, int i4, int i5, int i6, int i7, int $i6, int $i7, int i8, int i9, int i10, int i11) {
        try {
            if (this.f201c) {
                if (i4 > 784773023 * this.buffer) {
                    i4 = 784773023 * this.buffer;
                }
                if ($i12 < 0) {
                    $i12 = 0;
                }
            }
            if ($i12 < i4) {
                i11 = i3 + $i12;
                i = i5 + ($i12 * i6);
                i2 = i4 - $i12;
                int $i14;
                int $i15;
                int $i16;
                int $i17;
                int $i18;
                int $i19;
                int $i2;
                if (this.value) {
                    i3 = $i12 - (this.data * -1575402035);
                    i5 = i7 + ((i8 >> 3) * i3);
                    $i6 += (i9 >> 3) * i3;
                    $i7 += i3 * (i10 >> 3);
                    i7 = $i7 >> 12;
                    if (i7 != 0) {
                        i3 = i5 / i7;
                        $i14 = $i6 / i7;
                        if (i3 < 0) {
                            i3 = 0;
                        } else if (i3 > 4032) {
                            i3 = 4032;
                        }
                    } else {
                        i3 = 0;
                        $i14 = 0;
                    }
                    i7 = i5 + i8;
                    $i6 += i9;
                    $i7 += i10;
                    i5 = $i7 >> 12;
                    if (i5 != 0) {
                        $i15 = i7 / i5;
                        $i16 = $i6 / i5;
                        if ($i15 < 0) {
                            $i15 = 0;
                        } else if ($i15 > 4032) {
                            $i15 = 4032;
                        }
                    } else {
                        $i15 = 0;
                        $i16 = 0;
                    }
                    $i17 = (i3 << 20) + $i14;
                    i5 = (($i16 - $i14) >> 3) + ((($i15 - i3) >> 3) << 20);
                    $i14 = i2 >> 3;
                    i2 = i6 << 3;
                    i3 = i >> 8;
                    if (this.pos) {
                        if ($i14 > 0) {
                            $i18 = $i7;
                            i6 = $i15;
                            $i7 = $i16;
                            $i16 = i11;
                            i11 = $i6;
                            $i6 = $i14;
                            $i15 = $i17;
                            while (true) {
                                $i19 = iArr2[($i15 >>> 26) + ($i15 & 4032)];
                                $i14 = $i16 + 1;
                                iArr[$i16] = (((($i19 & 65280) * i3) & 16711680) + (((16711935 & $i19) * i3) & -16711936)) >> 8;
                                $i15 += i5;
                                $i19 = iArr2[($i15 >>> 26) + ($i15 & 4032)];
                                $i16 = $i14 + 1;
                                iArr[$i14] = (((($i19 & 16711935) * i3) & -16711936) + (((65280 & $i19) * i3) & 16711680)) >> 8;
                                $i15 += i5;
                                $i19 = iArr2[($i15 >>> 26) + ($i15 & 4032)];
                                $i14 = $i16 + 1;
                                iArr[$i16] = (((($i19 & 65280) * i3) & 16711680) + (((16711935 & $i19) * i3) & -16711936)) >> 8;
                                $i15 += i5;
                                $i19 = iArr2[($i15 & 4032) + ($i15 >>> 26)];
                                $i16 = $i14 + 1;
                                iArr[$i14] = (((($i19 & 16711935) * i3) & -16711936) + (((65280 & $i19) * i3) & 16711680)) >> 8;
                                $i15 += i5;
                                $i19 = iArr2[($i15 & 4032) + ($i15 >>> 26)];
                                $i14 = $i16 + 1;
                                iArr[$i16] = (((($i19 & 16711935) * i3) & -16711936) + (((65280 & $i19) * i3) & 16711680)) >> 8;
                                $i15 += i5;
                                $i19 = iArr2[($i15 & 4032) + ($i15 >>> 26)];
                                $i16 = $i14 + 1;
                                iArr[$i14] = (((($i19 & 65280) * i3) & 16711680) + (((16711935 & $i19) * i3) & -16711936)) >> 8;
                                $i15 += i5;
                                $i19 = iArr2[($i15 >>> 26) + ($i15 & 4032)];
                                $i14 = $i16 + 1;
                                iArr[$i16] = (((($i19 & 16711935) * i3) & -16711936) + (((65280 & $i19) * i3) & 16711680)) >> 8;
                                $i16 = $i15 + i5;
                                $i15 = iArr2[($i16 >>> 26) + ($i16 & 4032)];
                                $i16 = $i14 + 1;
                                i5 = ((16711935 & $i15) * i3) & -16711936;
                                $i2 = (i3 * ($i15 & 65280)) & 16711680;
                                i3 = $i2;
                                iArr[$i14] = ($i2 + i5) >> 8;
                                i7 += i8;
                                i11 += i9;
                                $i14 = $i18 + i10;
                                i5 = $i14 >> 12;
                                if (i5 != 0) {
                                    i3 = i7 / i5;
                                    i5 = i11 / i5;
                                    if (i3 < 0) {
                                        $i18 = i5;
                                        $i17 = 0;
                                    } else if (i3 > 4032) {
                                        $i18 = i5;
                                        $i17 = 4032;
                                    } else {
                                        $i18 = i5;
                                        $i17 = i3;
                                    }
                                } else {
                                    $i18 = 0;
                                    $i17 = 0;
                                }
                                $i15 = (i6 << 20) + $i7;
                                i5 = (($i18 - $i7) >> 3) + ((($i17 - i6) >> 3) << 20);
                                i += i2;
                                i3 = i >> 8;
                                i6 = $i6 - 1;
                                if (i6 <= 0) {
                                    break;
                                }
                                $i6 = i6;
                                $i7 = $i18;
                                i6 = $i17;
                                $i18 = $i14;
                            }
                        } else {
                            $i16 = i11;
                            $i15 = $i17;
                        }
                        $i12 = (i4 - $i12) & 7;
                        if ($i12 > 0) {
                            i = $i15;
                            i2 = $i16;
                            while (true) {
                                i7 = iArr2[(i & 4032) + (i >>> 26)];
                                i6 = ((16711935 & i7) * i3) & -16711936;
                                $i2 = i7 & 65280;
                                i7 = $i2;
                                iArr[i2] = ((($i2 * i3) & 16711680) + i6) >> 8;
                                $i12--;
                                if ($i12 <= 0) {
                                    break;
                                }
                                i += i5;
                                i2++;
                            }
                        }
                    } else {
                        if ($i14 > 0) {
                            while (true) {
                                $i18 = iArr2[($i17 & 4032) + ($i17 >>> 26)];
                                if ($i18 != 0) {
                                    iArr[i11] = (((($i18 & 16711935) * i3) & -16711936) + (((65280 & $i18) * i3) & 16711680)) >> 8;
                                }
                                i6 = i11 + 1;
                                i11 = $i17 + i5;
                                $i17 = iArr2[(i11 >>> 26) + (i11 & 4032)];
                                if ($i17 != 0) {
                                    iArr[i6] = (((($i17 & 65280) * i3) & 16711680) + (((16711935 & $i17) * i3) & -16711936)) >> 8;
                                }
                                i6++;
                                i11 += i5;
                                $i17 = iArr2[(i11 >>> 26) + (i11 & 4032)];
                                if ($i17 != 0) {
                                    iArr[i6] = (((($i17 & 16711935) * i3) & -16711936) + (((65280 & $i17) * i3) & 16711680)) >> 8;
                                }
                                i6++;
                                $i2 = i11 + i5;
                                i11 = $i2;
                                $i17 = iArr2[($i2 & 4032) + (i11 >>> 26)];
                                if ($i17 != 0) {
                                    iArr[i6] = (((($i17 & 16711935) * i3) & -16711936) + (((65280 & $i17) * i3) & 16711680)) >> 8;
                                }
                                i6++;
                                $i2 = i11 + i5;
                                i11 = $i2;
                                $i17 = iArr2[($i2 & 4032) + (i11 >>> 26)];
                                if ($i17 != 0) {
                                    iArr[i6] = (((($i17 & 16711935) * i3) & -16711936) + (((65280 & $i17) * i3) & 16711680)) >> 8;
                                }
                                i6++;
                                $i2 = i11 + i5;
                                i11 = $i2;
                                $i17 = iArr2[($i2 & 4032) + (i11 >>> 26)];
                                if ($i17 != 0) {
                                    iArr[i6] = (((($i17 & 65280) * i3) & 16711680) + (((16711935 & $i17) * i3) & -16711936)) >> 8;
                                }
                                i6++;
                                $i2 = i11 + i5;
                                i11 = $i2;
                                $i17 = iArr2[($i2 & 4032) + (i11 >>> 26)];
                                if ($i17 != 0) {
                                    iArr[i6] = (((($i17 & 65280) * i3) & 16711680) + (((16711935 & $i17) * i3) & -16711936)) >> 8;
                                }
                                i6++;
                                i11 += i5;
                                i11 = iArr2[(i11 >>> 26) + (i11 & 4032)];
                                if (i11 != 0) {
                                    i5 = ((16711935 & i11) * i3) & -16711936;
                                    $i2 = (i3 * (i11 & 65280)) & 16711680;
                                    i3 = $i2;
                                    iArr[i6] = ($i2 + i5) >> 8;
                                }
                                i11 = i6 + 1;
                                i7 += i8;
                                $i6 += i9;
                                $i7 += i10;
                                i3 = $i7 >> 12;
                                if (i3 != 0) {
                                    i6 = i7 / i3;
                                    i3 = $i6 / i3;
                                    if (i6 < 0) {
                                        i6 = 0;
                                    } else if (i6 > 4032) {
                                        i6 = 4032;
                                    }
                                } else {
                                    i6 = 0;
                                    i3 = 0;
                                }
                                $i17 = ($i15 << 20) + $i16;
                                i5 = ((i3 - $i16) >> 3) + (((i6 - $i15) >> 3) << 20);
                                i += i2;
                                $i15 = i >> 8;
                                $i14--;
                                if ($i14 <= 0) {
                                    break;
                                }
                                $i16 = i3;
                                i3 = $i15;
                                $i15 = i6;
                            }
                            i = i11;
                            i2 = $i15;
                            i6 = $i17;
                        } else {
                            i6 = $i17;
                            i2 = i3;
                            i = i11;
                        }
                        i3 = (i4 - $i12) & 7;
                        if (i3 > 0) {
                            do {
                                i4 = iArr2[(i6 & 4032) + (i6 >>> 26)];
                                if (i4 != 0) {
                                    $i12 = ((16711935 & i4) * i2) & -16711936;
                                    $i2 = i4 & 65280;
                                    i4 = $i2;
                                    iArr[i] = ((($i2 * i2) & 16711680) + $i12) >> 8;
                                }
                                i++;
                                i6 += i5;
                                i3--;
                            } while (i3 > 0);
                        }
                    }
                } else {
                    i3 = $i12 - (this.data * -1575402035);
                    i7 += (i8 >> 3) * i3;
                    $i6 += (i9 >> 3) * i3;
                    $i16 = $i7 + (i3 * (i10 >> 3));
                    i3 = $i16 >> 14;
                    if (i3 != 0) {
                        i5 = i7 / i3;
                        i3 = $i6 / i3;
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > 16256) {
                            i5 = 16256;
                        }
                    } else {
                        i5 = 0;
                        i3 = 0;
                    }
                    i7 += i8;
                    $i7 = $i6 + i9;
                    $i6 = $i16 + i10;
                    $i16 = $i6 >> 14;
                    if ($i16 != 0) {
                        $i14 = i7 / $i16;
                        $i16 = $i7 / $i16;
                        if ($i14 < 0) {
                            $i14 = 0;
                        } else if ($i14 > 16256) {
                            $i14 = 16256;
                        }
                    } else {
                        $i14 = 0;
                        $i16 = 0;
                    }
                    $i17 = (i5 << 18) + i3;
                    i5 = (($i16 - i3) >> 3) + ((($i14 - i5) >> 3) << 18);
                    $i15 = i2 >> 3;
                    i2 = i6 << 3;
                    i3 = i >> 8;
                    if (this.pos) {
                        if ($i15 > 0) {
                            while (true) {
                                $i19 = iArr2[($i17 >>> 25) + ($i17 & 16256)];
                                i6 = i11 + 1;
                                iArr[i11] = (((($i19 & 16711935) * i3) & -16711936) + (((65280 & $i19) * i3) & 16711680)) >> 8;
                                $i18 = $i17 + i5;
                                $i19 = iArr2[($i18 >>> 25) + ($i18 & 16256)];
                                i11 = i6 + 1;
                                iArr[i6] = (((($i19 & 16711935) * i3) & -16711936) + (((65280 & $i19) * i3) & 16711680)) >> 8;
                                $i18 += i5;
                                $i19 = iArr2[($i18 >>> 25) + ($i18 & 16256)];
                                i6 = i11 + 1;
                                iArr[i11] = (((($i19 & 65280) * i3) & 16711680) + (((16711935 & $i19) * i3) & -16711936)) >> 8;
                                $i18 += i5;
                                $i19 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                                i11 = i6 + 1;
                                iArr[i6] = (((($i19 & 65280) * i3) & 16711680) + (((16711935 & $i19) * i3) & -16711936)) >> 8;
                                $i18 += i5;
                                $i19 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                                i6 = i11 + 1;
                                iArr[i11] = (((($i19 & 65280) * i3) & 16711680) + (((16711935 & $i19) * i3) & -16711936)) >> 8;
                                $i18 += i5;
                                $i19 = iArr2[($i18 & 16256) + ($i18 >>> 25)];
                                i11 = i6 + 1;
                                iArr[i6] = (((($i19 & 65280) * i3) & 16711680) + (((16711935 & $i19) * i3) & -16711936)) >> 8;
                                $i18 += i5;
                                $i19 = iArr2[($i18 >>> 25) + ($i18 & 16256)];
                                i6 = i11 + 1;
                                iArr[i11] = (((($i19 & 16711935) * i3) & -16711936) + (((65280 & $i19) * i3) & 16711680)) >> 8;
                                i11 = $i18 + i5;
                                $i18 = iArr2[(i11 >>> 25) + (i11 & 16256)];
                                i11 = i6 + 1;
                                i5 = ((65280 & $i18) * i3) & 16711680;
                                $i2 = (i3 * ($i18 & 16711935)) & -16711936;
                                i3 = $i2;
                                iArr[i6] = ($i2 + i5) >> 8;
                                i7 += i8;
                                $i7 += i9;
                                $i6 += i10;
                                i3 = $i6 >> 14;
                                if (i3 != 0) {
                                    i6 = i7 / i3;
                                    i3 = $i7 / i3;
                                    if (i6 < 0) {
                                        i6 = 0;
                                    } else if (i6 > 16256) {
                                        i6 = 16256;
                                    }
                                } else {
                                    i6 = 0;
                                    i3 = 0;
                                }
                                $i17 = ($i14 << 18) + $i16;
                                i5 = ((i3 - $i16) >> 3) + (((i6 - $i14) >> 3) << 18);
                                i += i2;
                                $i14 = i >> 8;
                                $i15--;
                                if ($i15 <= 0) {
                                    break;
                                }
                                $i16 = i3;
                                i3 = $i14;
                                $i14 = i6;
                            }
                            i = i11;
                            i2 = i5;
                            i6 = $i17;
                            i3 = $i14;
                        } else {
                            i6 = $i17;
                            i = i11;
                            i2 = i5;
                        }
                        $i12 = (i4 - $i12) & 7;
                        if ($i12 > 0) {
                            i4 = i6;
                            while (true) {
                                i7 = iArr2[(i4 & 16256) + (i4 >>> 25)];
                                i6 = ((16711935 & i7) * i3) & -16711936;
                                $i2 = i7 & 65280;
                                i7 = $i2;
                                iArr[i] = ((($i2 * i3) & 16711680) + i6) >> 8;
                                $i12--;
                                if ($i12 <= 0) {
                                    break;
                                }
                                i4 += i2;
                                i++;
                            }
                        }
                    } else {
                        if ($i15 > 0) {
                            $i18 = $i7;
                            i6 = $i15;
                            $i7 = $i16;
                            $i16 = $i6;
                            $i6 = $i14;
                            $i14 = $i17;
                            while (true) {
                                $i17 = iArr2[($i14 >>> 25) + ($i14 & 16256)];
                                if ($i17 != 0) {
                                    iArr[i11] = (((($i17 & 65280) * i3) & 16711680) + (((16711935 & $i17) * i3) & -16711936)) >> 8;
                                }
                                i11++;
                                $i14 += i5;
                                $i17 = iArr2[($i14 & 16256) + ($i14 >>> 25)];
                                if ($i17 != 0) {
                                    iArr[i11] = (((($i17 & 16711935) * i3) & -16711936) + (((65280 & $i17) * i3) & 16711680)) >> 8;
                                }
                                i11++;
                                $i14 += i5;
                                $i17 = iArr2[($i14 >>> 25) + ($i14 & 16256)];
                                if ($i17 != 0) {
                                    iArr[i11] = (((($i17 & 65280) * i3) & 16711680) + (((16711935 & $i17) * i3) & -16711936)) >> 8;
                                }
                                i11++;
                                $i14 += i5;
                                $i17 = iArr2[($i14 >>> 25) + ($i14 & 16256)];
                                if ($i17 != 0) {
                                    iArr[i11] = (((($i17 & 16711935) * i3) & -16711936) + (((65280 & $i17) * i3) & 16711680)) >> 8;
                                }
                                i11++;
                                $i14 += i5;
                                $i17 = iArr2[($i14 >>> 25) + ($i14 & 16256)];
                                if ($i17 != 0) {
                                    iArr[i11] = (((($i17 & 16711935) * i3) & -16711936) + (((65280 & $i17) * i3) & 16711680)) >> 8;
                                }
                                i11++;
                                $i14 += i5;
                                $i17 = iArr2[($i14 & 16256) + ($i14 >>> 25)];
                                if ($i17 != 0) {
                                    iArr[i11] = (((($i17 & 65280) * i3) & 16711680) + (((16711935 & $i17) * i3) & -16711936)) >> 8;
                                }
                                i11++;
                                $i14 += i5;
                                $i17 = iArr2[($i14 & 16256) + ($i14 >>> 25)];
                                if ($i17 != 0) {
                                    iArr[i11] = (((($i17 & 65280) * i3) & 16711680) + (((16711935 & $i17) * i3) & -16711936)) >> 8;
                                }
                                i11++;
                                $i14 += i5;
                                $i14 = iArr2[($i14 & 16256) + ($i14 >>> 25)];
                                if ($i14 != 0) {
                                    i5 = ((65280 & $i14) * i3) & 16711680;
                                    $i2 = (i3 * ($i14 & 16711935)) & -16711936;
                                    i3 = $i2;
                                    iArr[i11] = ($i2 + i5) >> 8;
                                }
                                i11++;
                                i7 += i8;
                                $i14 = $i18 + i9;
                                $i16 += i10;
                                i5 = $i16 >> 14;
                                if (i5 != 0) {
                                    i3 = i7 / i5;
                                    i5 = $i14 / i5;
                                    if (i3 < 0) {
                                        $i18 = i5;
                                        $i17 = 0;
                                    } else if (i3 > 16256) {
                                        $i18 = i5;
                                        $i17 = 16256;
                                    } else {
                                        $i18 = i5;
                                        $i17 = i3;
                                    }
                                } else {
                                    $i18 = 0;
                                    $i17 = 0;
                                }
                                $i15 = ($i6 << 18) + $i7;
                                i5 = (($i18 - $i7) >> 3) + ((($i17 - $i6) >> 3) << 18);
                                i += i2;
                                i3 = i >> 8;
                                i6--;
                                if (i6 <= 0) {
                                    break;
                                }
                                $i7 = $i18;
                                $i6 = $i17;
                                $i18 = $i14;
                                $i14 = $i15;
                            }
                        } else {
                            $i15 = $i17;
                        }
                        i2 = (i4 - $i12) & 7;
                        if (i2 > 0) {
                            i = $i15;
                            do {
                                i4 = iArr2[(i & 16256) + (i >>> 25)];
                                if (i4 != 0) {
                                    $i12 = ((16711935 & i4) * i3) & -16711936;
                                    $i2 = i4 & 65280;
                                    i4 = $i2;
                                    iArr[i11] = ((($i2 * i3) & 16711680) + $i12) >> 8;
                                }
                                i11++;
                                i += i5;
                                i2--;
                            } while (i2 > 0);
                        }
                    }
                }
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cj.az(" + ')');
        }
    }

    final void toByteArray(int[] iArr, int i, int $i1, int i2, int $i3, int $i4) {
        if (this.f201c) {
            if ($i4 > 784773023 * this.buffer) {
                $i4 = this.buffer * -1920743013;
            }
            if ($i3 < 0) {
                $i3 = 0;
            }
        }
        if ($i3 < $i4) {
            int $i5 = i + $i3;
            i = ($i4 - $i3) >> 2;
            if (238267341 * this.f200b != 0) {
                if (this.f200b * 2104977034 != 1141157452) {
                    i2 = this.f200b * -931012197;
                    int $i6 = -167412111 - (238267341 * this.f200b);
                    $i1 = ((((-1460685997 & $i1) * $i6) >> 8) & 768060759) + ((($i6 * (-1900205906 & $i1)) >> 8) & -1711788003);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        int $i7 = iArr[$i5];
                        $i6 = $i5 + 1;
                        iArr[$i5] = (((($i7 & 65280) * i2) >> 8) & -206950016) + (((((-1500428789 & $i7) * i2) >> 8) & 16711935) + $i1);
                        $i7 = iArr[$i6];
                        $i5 = $i6 + 1;
                        iArr[$i6] = (((($i7 & 1317533975) * i2) >> 8) & 979793965) + (((((-2136947203 & $i7) * i2) >> 8) & 733394844) + $i1);
                        $i7 = iArr[$i5];
                        $i6 = $i5 + 1;
                        iArr[$i5] = (((($i7 & 65280) * i2) >> 8) & 65280) + (((((-1139017643 & $i7) * i2) >> 8) & 16711935) + $i1);
                        int $i8 = iArr[$i6];
                        $i5 = $i6 + 1;
                        iArr[$i6] = ((((($i8 & 181828113) * i2) >> 8) & 16711935) + $i1) + ((((1136199648 & $i8) * i2) >> 8) & -361673176);
                    }
                    i = ($i4 - $i3) & 3;
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        $i4 = iArr[$i5];
                        iArr[$i5] = (((($i4 & 65280) * i2) >> 8) & 65280) + (((((16711935 & $i4) * i2) >> 8) & 16711935) + $i1);
                        $i5++;
                    }
                } else {
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        $i1 = $i5 + 1;
                        iArr[$i5] = iArr[$i1];
                        i2 = $i1 + 1;
                        iArr[$i1] = iArr[i2];
                        $i1 = i2 + 1;
                        iArr[i2] = iArr[$i1];
                        $i5 = $i1 + 1;
                        iArr[$i1] = iArr[$i5];
                    }
                    i = ($i4 - $i3) & 3;
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        $i1 = $i5 + 1;
                        iArr[$i5] = iArr[$i1];
                        $i5 = $i1;
                    }
                }
            } else {
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    i2 = $i5 + 1;
                    iArr[$i5] = $i1;
                    $i5 = i2 + 1;
                    iArr[i2] = $i1;
                    i2 = $i5 + 1;
                    iArr[$i5] = $i1;
                    $i5 = i2 + 1;
                    iArr[i2] = $i1;
                }
                i = ($i4 - $i3) & 3;
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    iArr[$i5] = $i1;
                    $i5++;
                }
            }
        }
    }

    final void toByteArray(int[] iArr, int i, int i2, int i3, int $i5, int $i6, int i4, int i5) {
        if (this.f201c) {
            if ($i6 > this.buffer * 784773023) {
                $i6 = this.buffer * -260895343;
            }
            if ($i5 < 0) {
                $i5 = 0;
            }
        }
        if ($i5 < $i6) {
            i2 = i + $i5;
            i = (i5 * $i5) + i4;
            int $i7;
            int $i8;
            if (!this.f202s) {
                i3 = $i6 - $i5;
                if (this.f200b * -557878139 != 0) {
                    $i5 = this.f200b * 238267341;
                    $i6 = 256 - (this.f200b * 238267341);
                    while (true) {
                        $i7 = Point.count[i >> 8];
                        i += i5;
                        $i8 = ((((65280 & $i7) * $i6) >> 8) & 65280) + (((($i7 & 16711935) * $i6) >> 8) & 16711935);
                        $i7 = iArr[i2];
                        iArr[i2] = ($i8 + ((((-935566339 & $i7) * $i5) >> 8) & 16711935)) + (((($i7 & 65280) * $i5) >> 8) & 65280);
                        i3--;
                        if (i3 <= 0) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    while (true) {
                        iArr[i2] = Point.count[i >> 8];
                        i += i5;
                        i3--;
                        if (i3 <= 0) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                i4 = ($i6 - $i5) >> 2;
                i5 <<= 2;
                if (238267341 * this.f200b == 0) {
                    if (i4 > 0) {
                        do {
                            i3 = Point.count[i >> 8];
                            i += i5;
                            $i7 = i2 + 1;
                            iArr[i2] = i3;
                            i2 = $i7 + 1;
                            iArr[$i7] = i3;
                            $i7 = i2 + 1;
                            iArr[i2] = i3;
                            i2 = $i7 + 1;
                            iArr[$i7] = i3;
                            i4--;
                        } while (i4 > 0);
                    }
                    i3 = ($i6 - $i5) & 3;
                    if (i3 > 0) {
                        i = Point.count[i >> 8];
                        while (true) {
                            iArr[i2] = i;
                            i3--;
                            if (i3 <= 0) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    i3 = 970669147 * this.f200b;
                    $i7 = 993219905 - (this.f200b * 215905729);
                    if (i4 > 0) {
                        do {
                            int $i9 = Point.count[i >> 8];
                            i += i5;
                            $i8 = (((($i9 & -1264235608) * $i7) >> 8) & -1506672242) + ((((-1162043640 & $i9) * $i7) >> 8) & -1789507423);
                            int $i10 = iArr[i2];
                            $i9 = i2 + 1;
                            iArr[i2] = (((($i10 & 65280) * i3) >> 8) & 65280) + (((((16711935 & $i10) * i3) >> 8) & 1696330621) + $i8);
                            int $i11 = iArr[$i9];
                            i2 = $i9 + 1;
                            iArr[$i9] = ((((($i11 & -646198042) * i3) >> 8) & -392065957) + $i8) + ((((-2076690748 & $i11) * i3) >> 8) & -2041325730);
                            $i11 = iArr[i2];
                            $i9 = i2 + 1;
                            iArr[i2] = ((((($i11 & 16711935) * i3) >> 8) & 16711935) + $i8) + ((((65280 & $i11) * i3) >> 8) & 918546951);
                            $i10 = iArr[$i9];
                            i2 = $i9 + 1;
                            iArr[$i9] = ($i8 + ((((1615151682 & $i10) * i3) >> 8) & 937812508)) + (((($i10 & 1923893366) * i3) >> 8) & -1492155629);
                            i4--;
                        } while (i4 > 0);
                    }
                    $i5 = ($i6 - $i5) & 3;
                    if ($i5 > 0) {
                        $i6 = Point.count[i >> 8];
                        i = ((((1610365092 & $i6) * $i7) >> 8) & 65280) + (((($i6 & 484986598) * $i7) >> 8) & 16711935);
                        while (true) {
                            i5 = iArr[i2];
                            i4 = (((-2001081651 & i5) * i3) >> 8) & -348935574;
                            int $i4 = i5 & 691325832;
                            i5 = $i4;
                            $i4 = (($i4 * i3) >> 8) & 1843720770;
                            i5 = $i4;
                            iArr[i2] = ($i4 + i) + i4;
                            $i5--;
                            if ($i5 <= 0) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    final void toByteArray(int[] iArr, int[] iArr2, int i, int i2, int $i2, int $i11, int $i12, int $i3, int $i4, int $i5, int i3, int i4, int i5, int i6, int i7) {
        if (this.f201c) {
            if ($i12 > this.buffer * 784773023) {
                $i12 = 784773023 * this.buffer;
            }
            if ($i11 < 0) {
                $i11 = 0;
            }
        }
        if ($i11 < $i12) {
            int $i13 = $i2 + $i11;
            i = $i3 + ($i4 * $i11);
            $i2 = $i12 - $i11;
            int $i8;
            if (this.value) {
                i2 = $i11 - (-1575402035 * this.data);
                $i5 += i2 * i5;
                i3 += i6 * i2;
                i4 += i2 * i7;
                $i3 = i4 >> 12;
                if ($i3 != 0) {
                    i2 = $i5 / $i3;
                    $i3 = i3 / $i3;
                } else {
                    i2 = 0;
                    $i3 = 0;
                }
                $i5 += $i2 * i5;
                i5 = ($i2 * i6) + i3;
                i4 = (($i2 * i7) + i4) >> 12;
                if (i4 != 0) {
                    i3 = $i5 / i4;
                    i4 = i5 / i4;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                $i5 = (i2 << 20) + $i3;
                i2 = ((i4 - $i3) / $i2) + (((i3 - i2) / $i2) << 20);
                $i3 = $i2 >> 3;
                $i4 <<= 3;
                $i2 = i >> 8;
                if (this.pos) {
                    if ($i3 > 0) {
                        do {
                            i5 = iArr2[($i5 >>> 26) + (1573285327 & $i5)];
                            i3 = $i13 + 1;
                            i4 = ((65280 & i5) * $i2) & 16711680;
                            $i8 = i5 & 16711935;
                            i5 = $i8;
                            iArr[$i13] = ((($i8 * $i2) & -16711936) + i4) >> 8;
                            i4 = $i5 + i2;
                            i6 = iArr2[(i4 & 4032) + (i4 >>> 26)];
                            $i5 = i3 + 1;
                            i5 = ((-2059219166 & i6) * $i2) & 670815339;
                            $i8 = i6 & 16711935;
                            i6 = $i8;
                            iArr[i3] = ((($i8 * $i2) & -1658717436) + i5) >> 8;
                            $i8 = i4 + i2;
                            i4 = $i8;
                            i6 = iArr2[($i8 & 4032) + (i4 >>> 26)];
                            i3 = $i5 + 1;
                            i5 = ((16711935 & i6) * $i2) & -16711936;
                            $i8 = i6 & 205668773;
                            i6 = $i8;
                            iArr[$i5] = ((($i8 * $i2) & 1211313845) + i5) >> 8;
                            $i8 = i4 + i2;
                            i4 = $i8;
                            i6 = iArr2[($i8 & 4032) + (i4 >>> 26)];
                            $i5 = i3 + 1;
                            i5 = ((16711935 & i6) * $i2) & 1581192158;
                            $i8 = i6 & 401122292;
                            i6 = $i8;
                            iArr[i3] = ((($i8 * $i2) & -605412352) + i5) >> 8;
                            i4 += i2;
                            i6 = iArr2[(i4 >>> 26) + (-1749332264 & i4)];
                            i3 = $i5 + 1;
                            i5 = ((73934828 & i6) * $i2) & -16711936;
                            $i8 = i6 & 1071534290;
                            i6 = $i8;
                            iArr[$i5] = ((($i8 * $i2) & 16711680) + i5) >> 8;
                            i4 += i2;
                            i6 = iArr2[(i4 >>> 26) + (-1850779729 & i4)];
                            $i5 = i3 + 1;
                            i5 = ((16711935 & i6) * $i2) & -16711936;
                            $i8 = i6 & 1562365116;
                            i6 = $i8;
                            iArr[i3] = ((($i8 * $i2) & -1541279547) + i5) >> 8;
                            i4 += i2;
                            i6 = iArr2[(i4 >>> 26) + (-1166568182 & i4)];
                            i3 = $i5 + 1;
                            i5 = ((16711935 & i6) * $i2) & -16711936;
                            $i8 = i6 & 65280;
                            i6 = $i8;
                            iArr[$i5] = ((($i8 * $i2) & 16711680) + i5) >> 8;
                            $i5 = i4 + i2;
                            i5 = iArr2[($i5 & 4032) + ($i5 >>> 26)];
                            $i13 = i3 + 1;
                            i4 = ((-2065124967 & i5) * $i2) & -16711936;
                            $i8 = i5 & 321005914;
                            i5 = $i8;
                            iArr[i3] = ((($i2 * $i8) & -1418948832) + i4) >> 8;
                            $i5 += i2;
                            i += $i4;
                            $i2 = i >> 8;
                            $i3--;
                        } while ($i3 > 0);
                        $i3 = $i5;
                        i = $i2;
                        $i2 = $i13;
                    } else {
                        $i3 = $i5;
                        i = $i2;
                        $i2 = $i13;
                    }
                    $i11 = ($i12 - $i11) & 7;
                    if ($i11 > 0) {
                        $i12 = $i3;
                        while (true) {
                            $i5 = iArr2[($i12 >>> 26) + ($i12 & 4032)];
                            iArr[$i2] = (((($i5 & -153698632) * i) & -1087498109) + (((-1958937280 & $i5) * i) & 16711680)) >> 8;
                            $i11--;
                            if ($i11 <= 0) {
                                break;
                            }
                            $i12 += i2;
                            $i2++;
                        }
                    }
                } else {
                    if ($i3 > 0) {
                        do {
                            i4 = iArr2[($i5 >>> 26) + (1100221445 & $i5)];
                            if (i4 != 0) {
                                i3 = ((16711935 & i4) * $i2) & 1301646154;
                                $i8 = i4 & 65280;
                                i4 = $i8;
                                iArr[$i13] = ((($i8 * $i2) & 16711680) + i3) >> 8;
                            }
                            i3 = $i13 + 1;
                            $i5 += i2;
                            i5 = iArr2[($i5 >>> 26) + ($i5 & 4032)];
                            if (i5 != 0) {
                                i4 = ((310126314 & i5) * $i2) & -383594231;
                                $i8 = i5 & 994535724;
                                i5 = $i8;
                                iArr[i3] = ((($i8 * $i2) & -728348252) + i4) >> 8;
                            }
                            i3++;
                            $i5 += i2;
                            i5 = iArr2[($i5 >>> 26) + (1459765400 & $i5)];
                            if (i5 != 0) {
                                i4 = ((65280 & i5) * $i2) & 1380874496;
                                $i8 = i5 & 16711935;
                                i5 = $i8;
                                iArr[i3] = ((($i8 * $i2) & 622938769) + i4) >> 8;
                            }
                            i3++;
                            $i5 += i2;
                            i5 = iArr2[(103255603 & $i5) + ($i5 >>> 26)];
                            if (i5 != 0) {
                                i4 = ((65280 & i5) * $i2) & 16711680;
                                $i8 = i5 & 16711935;
                                i5 = $i8;
                                iArr[i3] = ((($i8 * $i2) & -16711936) + i4) >> 8;
                            }
                            i3++;
                            $i5 += i2;
                            i5 = iArr2[($i5 >>> 26) + (-2015683942 & $i5)];
                            if (i5 != 0) {
                                i4 = ((65280 & i5) * $i2) & 16711680;
                                $i8 = i5 & 16711935;
                                i5 = $i8;
                                iArr[i3] = ((($i8 * $i2) & 1286049841) + i4) >> 8;
                            }
                            i3++;
                            $i5 += i2;
                            i5 = iArr2[(1797958838 & $i5) + ($i5 >>> 26)];
                            if (i5 != 0) {
                                i4 = ((16711935 & i5) * $i2) & -1799214960;
                                $i8 = i5 & 65280;
                                i5 = $i8;
                                iArr[i3] = ((($i8 * $i2) & -268270667) + i4) >> 8;
                            }
                            i3++;
                            $i5 += i2;
                            i5 = iArr2[($i5 & 4032) + ($i5 >>> 26)];
                            if (i5 != 0) {
                                i4 = ((16711935 & i5) * $i2) & -16711936;
                                $i8 = i5 & 65280;
                                i5 = $i8;
                                iArr[i3] = ((($i8 * $i2) & 1227691018) + i4) >> 8;
                            }
                            i3++;
                            $i5 += i2;
                            i5 = iArr2[($i5 >>> 26) + ($i5 & 4032)];
                            if (i5 != 0) {
                                i4 = ((-748893059 & i5) * $i2) & 16711680;
                                $i8 = i5 & -719220111;
                                i5 = $i8;
                                iArr[i3] = ((($i2 * $i8) & -16711936) + i4) >> 8;
                            }
                            $i13 = i3 + 1;
                            $i5 += i2;
                            i += $i4;
                            $i2 = i >> 8;
                            $i3--;
                        } while ($i3 > 0);
                    }
                    i = ($i12 - $i11) & 7;
                    if (i > 0) {
                        do {
                            $i12 = iArr2[($i5 >>> 26) + ($i5 & 4032)];
                            if ($i12 != 0) {
                                iArr[$i13] = (((($i12 & 1018514238) * $i2) & -99660451) + (((-194695784 & $i12) * $i2) & -16711936)) >> 8;
                            }
                            $i13++;
                            $i5 += i2;
                            i--;
                        } while (i > 0);
                    }
                }
            } else {
                i2 = $i11 - (this.data * -1575402035);
                $i5 += i2 * i5;
                i3 += i2 * i6;
                i4 += i2 * i7;
                i2 = i4 >> 14;
                if (i2 != 0) {
                    $i3 = $i5 / i2;
                    i2 = i3 / i2;
                } else {
                    $i3 = 0;
                    i2 = 0;
                }
                $i8 = i5 * $i2;
                i5 = $i8;
                $i5 += $i8;
                i3 = (i6 * $i2) + i3;
                i5 = (($i2 * i7) + i4) >> 14;
                if (i5 != 0) {
                    i4 = $i5 / i5;
                    $i5 = i3 / i5;
                } else {
                    i4 = 0;
                    $i5 = 0;
                }
                i3 = ($i3 << 18) + i2;
                i2 = (((i4 - $i3) / $i2) << 18) + (($i5 - i2) / $i2);
                $i5 = $i2 >> 3;
                $i3 = $i4 << 3;
                $i2 = i >> 8;
                if (this.pos) {
                    if ($i5 > 0) {
                        do {
                            $i8 = i3 & 16256;
                            i4 = $i8;
                            i5 = iArr2[(i3 >>> 25) + $i8];
                            $i4 = $i13 + 1;
                            i4 = ((16711935 & i5) * $i2) & -2064940273;
                            $i8 = i5 & 1900957353;
                            i5 = $i8;
                            iArr[$i13] = ((($i8 * $i2) & -1556087314) + i4) >> 8;
                            i4 = i3 + i2;
                            i6 = iArr2[(i4 >>> 25) + (i4 & 16256)];
                            i3 = $i4 + 1;
                            i5 = ((-1899879616 & i6) * $i2) & -776289075;
                            $i8 = i6 & -585988688;
                            i6 = $i8;
                            iArr[$i4] = ((($i8 * $i2) & 52353583) + i5) >> 8;
                            i4 += i2;
                            $i8 = i4 & 16256;
                            i6 = iArr2[(i4 >>> 25) + $i8];
                            $i4 = i3 + 1;
                            i5 = ((1343032791 & i6) * $i2) & -826396956;
                            $i8 = i6 & 663356892;
                            i6 = $i8;
                            iArr[i3] = ((($i8 * $i2) & -805469072) + i5) >> 8;
                            $i8 = i4 + i2;
                            i4 = $i8;
                            i6 = iArr2[($i8 & 16256) + (i4 >>> 25)];
                            i3 = $i4 + 1;
                            i5 = ((65280 & i6) * $i2) & 16711680;
                            $i8 = i6 & 16711935;
                            i6 = $i8;
                            iArr[$i4] = ((($i8 * $i2) & 1425738734) + i5) >> 8;
                            $i8 = i4 + i2;
                            i4 = $i8;
                            i6 = iArr2[($i8 & 16256) + (i4 >>> 25)];
                            $i4 = i3 + 1;
                            i5 = ((65280 & i6) * $i2) & 16711680;
                            $i8 = i6 & -1921560600;
                            i6 = $i8;
                            iArr[i3] = ((($i8 * $i2) & -16711936) + i5) >> 8;
                            $i8 = i4 + i2;
                            i4 = $i8;
                            i6 = iArr2[($i8 & 16256) + (i4 >>> 25)];
                            i3 = $i4 + 1;
                            i5 = ((-1507088930 & i6) * $i2) & 16711680;
                            $i8 = i6 & 16711935;
                            i6 = $i8;
                            iArr[$i4] = ((($i8 * $i2) & -1625836598) + i5) >> 8;
                            i4 += i2;
                            i6 = iArr2[(-1831290167 & i4) + (i4 >>> 25)];
                            $i4 = i3 + 1;
                            i5 = ((65280 & i6) * $i2) & 662057426;
                            $i8 = i6 & -299660756;
                            i6 = $i8;
                            iArr[i3] = ((($i8 * $i2) & -16711936) + i5) >> 8;
                            i3 = i4 + i2;
                            i5 = iArr2[(i3 >>> 25) + (1504490031 & i3)];
                            $i13 = $i4 + 1;
                            i4 = ((842727477 & i5) * $i2) & -16711936;
                            $i8 = i5 & 65280;
                            i5 = $i8;
                            iArr[$i4] = ((($i2 * $i8) & 16711680) + i4) >> 8;
                            i3 += i2;
                            i += $i3;
                            $i2 = i >> 8;
                            $i5--;
                        } while ($i5 > 0);
                    }
                    i = ($i12 - $i11) & 7;
                    if (i > 0) {
                        while (true) {
                            $i3 = iArr2[(236443176 & i3) + (i3 >>> 25)];
                            iArr[$i13] = (((($i3 & 815181670) * $i2) & 113580630) + (((2101257554 & $i3) * $i2) & -16711936)) >> 8;
                            i3 += i2;
                            i--;
                            if (i <= 0) {
                                break;
                            }
                            $i13++;
                        }
                    }
                } else {
                    if ($i5 > 0) {
                        $i4 = $i5;
                        $i5 = $i13;
                        do {
                            i5 = iArr2[(i3 >>> 25) + (i3 & 16256)];
                            if (i5 != 0) {
                                i4 = ((65280 & i5) * $i2) & -415586243;
                                $i8 = i5 & -1704488671;
                                i5 = $i8;
                                iArr[$i5] = ((($i8 * $i2) & -1623588630) + i4) >> 8;
                            }
                            $i5++;
                            $i8 = i3 + i2;
                            i3 = $i8;
                            i5 = iArr2[($i8 & 16256) + (i3 >>> 25)];
                            if (i5 != 0) {
                                i4 = ((-1845981894 & i5) * $i2) & 83173756;
                                $i8 = i5 & -524498566;
                                i5 = $i8;
                                iArr[$i5] = ((($i8 * $i2) & 16711680) + i4) >> 8;
                            }
                            $i5++;
                            $i8 = i3 + i2;
                            i3 = $i8;
                            i5 = iArr2[($i8 & 16256) + (i3 >>> 25)];
                            if (i5 != 0) {
                                i4 = ((424281372 & i5) * $i2) & 16711680;
                                $i8 = i5 & -2054401820;
                                i5 = $i8;
                                iArr[$i5] = ((($i8 * $i2) & -16711936) + i4) >> 8;
                            }
                            $i5++;
                            i3 += i2;
                            i5 = iArr2[(i3 >>> 25) + (1292908953 & i3)];
                            if (i5 != 0) {
                                i4 = ((16711935 & i5) * $i2) & -16711936;
                                $i8 = i5 & 65280;
                                i5 = $i8;
                                iArr[$i5] = ((($i8 * $i2) & 105578471) + i4) >> 8;
                            }
                            $i5++;
                            i3 += i2;
                            i5 = iArr2[(i3 >>> 25) + (-1078213544 & i3)];
                            if (i5 != 0) {
                                i4 = ((500274313 & i5) * $i2) & -109814759;
                                $i8 = i5 & -2133034872;
                                i5 = $i8;
                                iArr[$i5] = ((($i8 * $i2) & -16711936) + i4) >> 8;
                            }
                            $i5++;
                            i3 += i2;
                            i5 = iArr2[(i3 >>> 25) + (1830744643 & i3)];
                            if (i5 != 0) {
                                i4 = ((-1856062513 & i5) * $i2) & -1020833227;
                                $i8 = i5 & 1774354260;
                                i5 = $i8;
                                iArr[$i5] = ((($i8 * $i2) & 16711680) + i4) >> 8;
                            }
                            $i5++;
                            i3 += i2;
                            i5 = iArr2[(i3 >>> 25) + (-1104797229 & i3)];
                            if (i5 != 0) {
                                i4 = ((65280 & i5) * $i2) & -2071841277;
                                $i8 = i5 & 16711935;
                                i5 = $i8;
                                iArr[$i5] = ((($i8 * $i2) & -16711936) + i4) >> 8;
                            }
                            $i5++;
                            $i8 = i3 + i2;
                            i3 = $i8;
                            i5 = iArr2[($i8 & 16256) + (i3 >>> 25)];
                            if (i5 != 0) {
                                i4 = ((-1124253686 & i5) * $i2) & 1227933737;
                                $i8 = i5 & 16711935;
                                i5 = $i8;
                                iArr[$i5] = ((($i2 * $i8) & 414240322) + i4) >> 8;
                            }
                            $i5++;
                            i3 += i2;
                            i += $i3;
                            $i2 = i >> 8;
                            $i4--;
                        } while ($i4 > 0);
                    } else {
                        $i5 = $i13;
                    }
                    $i12 = ($i12 - $i11) & 7;
                    if ($i12 > 0) {
                        i = i3;
                        $i11 = $i5;
                        do {
                            $i4 = iArr2[(-1442243336 & i) + (i >>> 25)];
                            if ($i4 != 0) {
                                iArr[$i11] = (((($i4 & -996418066) * $i2) & -1452084392) + (((65280 & $i4) * $i2) & -2077136331)) >> 8;
                            }
                            $i11++;
                            i += i2;
                            $i12--;
                        } while ($i12 > 0);
                    }
                }
            }
        }
    }

    final void toString(int $i17, int $i18, int $i19, int $i0, int i, int i2, int $i3, int i3, int i4, int $i6, int i5, int i6, int i7, int $i10, int i8, int $i12, int i9, int i10, int i11) {
        int[] $r2 = Point.type.get(i11, (short) 255);
        if ($r2 == null) {
            $i6 = Point.type.toString(i11, 1577195485);
            getSize($i17, $i18, $i19, $i0, i, i2, Calendar.get($i6, $i3, -2146196316), Calendar.get($i6, i3, -2141582002), Calendar.get($i6, i4, -2111823019), 1584002306);
            return;
        }
        this.value = Point.type.add(i11, -421289729);
        this.pos = Point.type.equals(i11, -480947635);
        int $i21 = i - $i0;
        i11 = $i18 - $i17;
        int $i16 = i2 - $i0;
        int $i20 = $i19 - $i17;
        int $i22 = i3 - $i3;
        int $i23 = i4 - $i3;
        int i12 = $i18 != $i17 ? ((i - $i0) << 14) / ($i18 - $i17) : 0;
        int i13 = $i18 != $i19 ? ((i2 - i) << 14) / ($i19 - $i18) : 0;
        int i14 = $i17 != $i19 ? (($i0 - i2) << 14) / ($i17 - $i19) : 0;
        int i15 = ($i21 * $i20) - ($i16 * i11);
        if (i15 != 0) {
            i11 = ((($i20 * $i22) - (i11 * $i23)) << 9) / i15;
            $i16 = ((($i21 * $i23) - ($i22 * $i16)) << 9) / i15;
            $i22 = $i6 - i5;
            $i10 = i7 - $i10;
            $i21 = $i12 - i9;
            $i23 = i6 - $i6;
            $i20 = i8 - i7;
            i8 = i10 - $i12;
            i9 = ((i7 * $i23) - ($i6 * $i20)) << 14;
            long $l24 = ($i20 * $i12) - (i8 * i7);
            Object obj = $l24;
            int $i7 = ((((long) $l24) << 3) << 14) / ((long) (542614623 * this.this$0));
            long j = $i7;
            i5 = (int) $i7;
            $i7 = ($i6 * i8) - ($i23 * $i12);
            i6 = $i7;
            $i7 = (((long) $i7) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            i6 = (int) $i7;
            i10 = (($i22 * i7) - ($i10 * $i6)) << 14;
            $i7 = ((((long) (($i10 * $i12) - (i7 * $i21))) << 3) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            i7 = (int) $i7;
            $i7 = ($i6 * $i21) - ($i22 * $i12);
            $i6 = $i7;
            j = ((long) $i7) << 14;
            $l24 = this.this$0 * 542614623;
            Object obj2 = $l24;
            $l24 = j / ((long) $l24);
            j = $l24;
            $i6 = (int) $l24;
            $i12 = (($i10 * $i23) - ($i22 * $i20)) << 14;
            $i7 = ((((long) (($i20 * $i21) - ($i10 * i8))) << 3) << 14) / ((long) (542614623 * this.this$0));
            j = $i7;
            $i10 = (int) $i7;
            $i7 = ($i22 * i8) - ($i21 * $i23);
            i8 = $i7;
            j = ((long) $i7) << 14;
            $l24 = this.this$0 * 542614623;
            Object obj3 = $l24;
            $l24 = j / ((long) $l24);
            j = $l24;
            i8 = (int) $l24;
            if ($i17 > $i18 || $i17 > $i19) {
                if ($i18 > $i19) {
                    if ($i19 < this.length * -1759402563) {
                        if ($i17 > this.length * -1759402563) {
                            $i17 = this.length * -1759402563;
                        }
                        if ($i18 > -1759402563 * this.length) {
                            $i18 = this.length * -1759402563;
                        }
                        $i7 = (i4 << 9) - (i11 * i2);
                        $i3 = $i7;
                        $i3 = $i7 + i11;
                        if ($i17 >= $i18) {
                            $i22 = i2 << 14;
                            if ($i19 < 0) {
                                i4 = $i22 - (i13 * $i19);
                                $i22 -= i14 * $i19;
                                $i3 -= $i16 * $i19;
                                $i19 = 0;
                            } else {
                                i4 = $i22;
                            }
                            $i0 = i << 14;
                            if ($i18 < 0) {
                                $i18 *= i12;
                                $i18 = 0;
                                i3 = $i0 - $i18;
                            } else {
                                i3 = $i0;
                            }
                            i2 = $i19 - (this.parent * -1508152919);
                            $i0 = i9 + (i6 * i2);
                            i = i10 + ($i6 * i2);
                            i2 = $i12 + (i2 * i8);
                            if (i13 >= i14) {
                                $i12 = $i17 - $i18;
                                i9 = $i18 - $i19;
                                $i17 = this.next[$i19];
                                $i18 = $i3;
                                $i19 = $i22;
                                $i3 = i9;
                                while (true) {
                                    $i3--;
                                    if ($i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i19 >> 14, i4 >> 14, $i18, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                    $i19 += i14;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    $i0 += i6;
                                    i += $i6;
                                    i2 += i8;
                                    i4 += i13;
                                }
                                i4 = $i12;
                                $i3 = $i19;
                                while (true) {
                                    $i19 = i4 - 1;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i3 >> 14, i3 >> 14, $i18, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    $i0 += i6;
                                    i += $i6;
                                    i2 += i8;
                                    $i3 += i14;
                                    i3 += i12;
                                    i4 = $i19;
                                }
                            } else {
                                $i12 = $i17 - $i18;
                                i9 = $i18 - $i19;
                                $i17 = this.next[$i19];
                                $i18 = $i3;
                                $i19 = $i22;
                                $i3 = i9;
                                while (true) {
                                    $i3--;
                                    if ($i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, i4 >> 14, $i19 >> 14, $i18, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                    $i19 += i14;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    $i0 += i6;
                                    i += $i6;
                                    i2 += i8;
                                    i4 += i13;
                                }
                                i4 = $i12;
                                $i3 = $i19;
                                while (true) {
                                    $i19 = i4 - 1;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, i3 >> 14, $i3 >> 14, $i18, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    $i0 += i6;
                                    i += $i6;
                                    i2 += i8;
                                    $i3 += i14;
                                    i3 += i12;
                                    i4 = $i19;
                                }
                            }
                        } else {
                            $i22 = i2 << 14;
                            if ($i19 < 0) {
                                i4 = $i22 - (i13 * $i19);
                                $i22 -= $i19 * i14;
                                $i3 -= $i16 * $i19;
                                $i19 = 0;
                            } else {
                                i4 = $i22;
                            }
                            $i0 <<= 14;
                            if ($i17 < 0) {
                                $i0 -= i12 * $i17;
                                $i17 = 0;
                            }
                            i3 = $i19 - (this.parent * -1508152919);
                            i = i9 + (i3 * i6);
                            i2 = i10 + ($i6 * i3);
                            i3 = $i12 + (i3 * i8);
                            if (i13 >= i14) {
                                $i12 = $i18 - $i17;
                                i9 = $i17 - $i19;
                                $i17 = this.next[$i19];
                                $i18 = $i3;
                                $i3 = $i22;
                                $i19 = i4;
                                i4 = i9;
                                while (true) {
                                    i4--;
                                    if (i4 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i19 >> 14, $i18, i11, i, i2, i3, i5, i7, $i10, 1245522068);
                                    $i19 += i13;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i += i6;
                                    i2 += $i6;
                                    i3 += i8;
                                    $i3 += i14;
                                }
                                $i3 = $i19;
                                $i19 = $i12;
                                while (true) {
                                    $i19--;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i0 >> 14, $i3 >> 14, $i18, i11, i, i2, i3, i5, i7, $i10, 1245522068);
                                    $i0 += i12;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i6;
                                    i2 += $i6;
                                    i3 += i8;
                                    $i3 += i13;
                                }
                            } else {
                                $i12 = $i18 - $i17;
                                i9 = $i17 - $i19;
                                $i17 = this.next[$i19];
                                $i18 = $i3;
                                $i3 = $i22;
                                $i19 = i4;
                                i4 = i9;
                                while (true) {
                                    i4--;
                                    if (i4 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i19 >> 14, $i3 >> 14, $i18, i11, i, i2, i3, i5, i7, $i10, 1245522068);
                                    $i19 += i13;
                                    $i18 += $i16;
                                    $i17 += this.size * -1741252353;
                                    i += i6;
                                    i2 += $i6;
                                    i3 += i8;
                                    $i3 += i14;
                                }
                                $i3 = $i19;
                                $i19 = $i12;
                                while (true) {
                                    $i19--;
                                    if ($i19 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i0 >> 14, $i18, i11, i, i2, i3, i5, i7, $i10, 1245522068);
                                    $i0 += i12;
                                    $i18 += $i16;
                                    $i17 += -1741252353 * this.size;
                                    i += i6;
                                    i2 += $i6;
                                    i3 += i8;
                                    $i3 += i13;
                                }
                            }
                        }
                    }
                } else if ($i18 < -1759402563 * this.length) {
                    if ($i19 > -1759402563 * this.length) {
                        $i19 = this.length * -1759402563;
                    }
                    i4 = $i17 > this.length * -1759402563 ? this.length * -1759402563 : $i17;
                    $i3 = ((i3 << 9) - (i11 * i)) + i11;
                    if ($i19 >= i4) {
                        i3 = i << 14;
                        if ($i18 < 0) {
                            $i22 = i3 - (i12 * $i18);
                            i3 -= i13 * $i18;
                            $i3 -= $i16 * $i18;
                            $i18 = 0;
                        } else {
                            $i22 = i3;
                        }
                        $i17 = $i0 << 14;
                        if (i4 < 0) {
                            $i17 -= i4 * i14;
                            $i21 = 0;
                        } else {
                            $i21 = i4;
                        }
                        i2 = $i18 - (this.parent * -1508152919);
                        $i0 = i9 + (i2 * i6);
                        i = i10 + ($i6 * i2);
                        i2 = $i12 + (i2 * i8);
                        if (i12 >= i13) {
                            i4 = $i19 - $i21;
                            i9 = $i21 - $i18;
                            $i18 = this.next[$i18];
                            $i19 = $i3;
                            $i12 = $i22;
                            $i3 = i3;
                            i3 = i9;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i18, $i3 >> 14, $i12 >> 14, $i19, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                $i3 += i13;
                                $i19 += $i16;
                                $i18 += -1741252353 * this.size;
                                $i0 += i6;
                                i += $i6;
                                i2 += i8;
                                $i12 += i12;
                            }
                            i3 = $i3;
                            $i3 = i4;
                            while (true) {
                                $i3--;
                                if ($i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i18, i3 >> 14, $i17 >> 14, $i19, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                $i17 += i14;
                                $i19 += $i16;
                                $i18 += -1741252353 * this.size;
                                $i0 += i6;
                                i += $i6;
                                i2 += i8;
                                i3 += i13;
                            }
                        } else {
                            i4 = $i19 - $i21;
                            i9 = $i21 - $i18;
                            $i18 = this.next[$i18];
                            $i19 = $i3;
                            $i12 = $i22;
                            $i3 = i3;
                            i3 = i9;
                            while (true) {
                                i3--;
                                if (i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i18, $i12 >> 14, $i3 >> 14, $i19, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                $i3 += i13;
                                $i19 += $i16;
                                $i18 += -1741252353 * this.size;
                                $i0 += i6;
                                i += $i6;
                                i2 += i8;
                                $i12 += i12;
                            }
                            i3 = $i3;
                            $i3 = i4;
                            while (true) {
                                $i3--;
                                if ($i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i18, $i17 >> 14, i3 >> 14, $i19, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                $i17 += i14;
                                $i19 += $i16;
                                $i18 += this.size * -1741252353;
                                $i0 += i6;
                                i += $i6;
                                i2 += i8;
                                i3 += i13;
                            }
                        }
                    } else {
                        $i22 = i << 14;
                        if ($i18 < 0) {
                            $i0 = $i22 - ($i18 * i12);
                            $i22 -= i13 * $i18;
                            $i17 = $i3 - ($i16 * $i18);
                            $i18 = 0;
                        } else {
                            $i17 = $i3;
                            $i0 = $i22;
                        }
                        i = i2 << 14;
                        if ($i19 < 0) {
                            i -= $i19 * i14;
                            $i19 = 0;
                        }
                        i3 = $i18 - (-1508152919 * this.parent);
                        i2 = i9 + (i6 * i3);
                        $i3 = i10 + (i3 * $i6);
                        i3 = $i12 + (i3 * i8);
                        if (($i18 != $i19 && i12 < i13) || ($i19 == $i18 && i12 > i14)) {
                            i4 -= $i19;
                            $i19 -= $i18;
                            $i18 = this.next[$i18];
                            $i12 = $i22;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i18, $i0 >> 14, $i12 >> 14, $i17, i11, i2, $i3, i3, i5, i7, $i10, 1245522068);
                                $i0 += i12;
                                $i17 += $i16;
                                $i18 += -1741252353 * this.size;
                                i2 += i6;
                                $i3 += $i6;
                                i3 += i8;
                                $i12 += i13;
                            }
                            $i19 = i4;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i18, $i0 >> 14, i >> 14, $i17, i11, i2, $i3, i3, i5, i7, $i10, 1245522068);
                                i += i14;
                                $i17 += $i16;
                                $i18 += -1741252353 * this.size;
                                i2 += i6;
                                $i3 += $i6;
                                i3 += i8;
                                $i0 += i12;
                            }
                        } else {
                            i4 -= $i19;
                            $i19 -= $i18;
                            $i18 = this.next[$i18];
                            $i12 = $i22;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i18, $i12 >> 14, $i0 >> 14, $i17, i11, i2, $i3, i3, i5, i7, $i10, 1245522068);
                                $i0 += i12;
                                $i17 += $i16;
                                $i18 += -1741252353 * this.size;
                                i2 += i6;
                                $i3 += $i6;
                                i3 += i8;
                                $i12 += i13;
                            }
                            $i19 = i4;
                            while (true) {
                                $i19--;
                                if ($i19 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i18, i >> 14, $i0 >> 14, $i17, i11, i2, $i3, i3, i5, i7, $i10, 1245522068);
                                i += i14;
                                $i17 += $i16;
                                $i18 += this.size * -1741252353;
                                i2 += i6;
                                $i3 += $i6;
                                i3 += i8;
                                $i0 += i12;
                            }
                        }
                    }
                }
            } else {
                if ($i17 < this.length * -1759402563) {
                    if ($i18 > -1759402563 * this.length) {
                        $i18 = -1759402563 * this.length;
                    }
                    i3 = $i19 > this.length * -1759402563 ? -1759402563 * this.length : $i19;
                    i4 = (($i3 << 9) - (i11 * $i0)) + i11;
                    if ($i18 >= i3) {
                        $i0 <<= 14;
                        if ($i17 < 0) {
                            $i22 = $i0 - (i14 * $i17);
                            $i3 = $i0 - ($i17 * i12);
                            $i19 = i4 - ($i16 * $i17);
                            $i17 = 0;
                        } else {
                            $i19 = i4;
                            $i22 = $i0;
                            $i3 = $i0;
                        }
                        $i0 = i2 << 14;
                        if (i3 < 0) {
                            $i0 -= i3 * i13;
                            i4 = 0;
                        } else {
                            i4 = i3;
                        }
                        i3 = $i17 - (-1508152919 * this.parent);
                        i = i9 + (i6 * i3);
                        i2 = i10 + (i3 * $i6);
                        i3 = $i12 + (i3 * i8);
                        if ((i4 != $i17 && i14 < i12) || ($i17 == i4 && i13 > i12)) {
                            $i18 -= i4;
                            i4 -= $i17;
                            $i17 = this.next[$i17];
                            $i12 = $i22;
                            while (true) {
                                i4--;
                                if (i4 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i12 >> 14, $i3 >> 14, $i19, i11, i, i2, i3, i5, i7, $i10, 1245522068);
                                $i3 += i12;
                                $i19 += $i16;
                                $i17 += -1741252353 * this.size;
                                i += i6;
                                i2 += $i6;
                                i3 += i8;
                                $i12 += i14;
                            }
                            while (true) {
                                $i18--;
                                if ($i18 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i0 >> 14, $i3 >> 14, $i19, i11, i, i2, i3, i5, i7, $i10, 1245522068);
                                $i0 += i13;
                                $i19 += $i16;
                                $i17 += this.size * -1741252353;
                                i += i6;
                                i2 += $i6;
                                i3 += i8;
                                $i3 += i12;
                            }
                        } else {
                            $i18 -= i4;
                            i4 -= $i17;
                            $i17 = this.next[$i17];
                            $i12 = $i22;
                            while (true) {
                                i4--;
                                if (i4 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i12 >> 14, $i19, i11, i, i2, i3, i5, i7, $i10, 1245522068);
                                $i3 += i12;
                                $i19 += $i16;
                                $i17 += this.size * -1741252353;
                                i += i6;
                                i2 += $i6;
                                i3 += i8;
                                $i12 += i14;
                            }
                            while (true) {
                                $i18--;
                                if ($i18 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i0 >> 14, $i19, i11, i, i2, i3, i5, i7, $i10, 1245522068);
                                $i0 += i13;
                                $i19 += $i16;
                                $i17 += -1741252353 * this.size;
                                i += i6;
                                i2 += $i6;
                                i3 += i8;
                                $i3 += i12;
                            }
                        }
                    } else {
                        $i3 = $i0 << 14;
                        if ($i17 < 0) {
                            $i22 = $i3 - ($i17 * i14);
                            $i3 -= i12 * $i17;
                            i4 -= $i17 * $i16;
                            $i17 = 0;
                        } else {
                            $i22 = $i3;
                        }
                        $i19 = i << 14;
                        if ($i18 < 0) {
                            $i19 -= $i18 * i13;
                            $i18 = 0;
                        }
                        i2 = $i17 - (-1508152919 * this.parent);
                        $i0 = i9 + (i6 * i2);
                        i = i10 + (i2 * $i6);
                        i2 = $i12 + (i2 * i8);
                        if (($i18 != $i17 && i14 < i12) || ($i18 == $i17 && i14 > i13)) {
                            i3 -= $i18;
                            $i12 = $i18 - $i17;
                            $i17 = this.next[$i17];
                            $i18 = i4;
                            i4 = $i22;
                            i9 = $i3;
                            $i3 = $i12;
                            while (true) {
                                $i3--;
                                if ($i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i4 >> 14, i9 >> 14, $i18, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                i4 += i14;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                $i0 += i6;
                                i += $i6;
                                i2 += i8;
                                i9 += i12;
                            }
                            $i3 = i3;
                            while (true) {
                                $i3--;
                                if ($i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i4 >> 14, $i19 >> 14, $i18, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                $i19 += i13;
                                $i18 += $i16;
                                $i17 += this.size * -1741252353;
                                $i0 += i6;
                                i += $i6;
                                i2 += i8;
                                i4 += i14;
                            }
                        } else {
                            i3 -= $i18;
                            $i12 = $i18 - $i17;
                            $i17 = this.next[$i17];
                            $i18 = i4;
                            i4 = $i22;
                            i9 = $i3;
                            $i3 = $i12;
                            while (true) {
                                $i3--;
                                if ($i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i9 >> 14, i4 >> 14, $i18, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                i4 += i14;
                                $i18 += $i16;
                                $i17 += this.size * -1741252353;
                                $i0 += i6;
                                i += $i6;
                                i2 += i8;
                                i9 += i12;
                            }
                            $i3 = i3;
                            while (true) {
                                $i3--;
                                if ($i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i19 >> 14, i4 >> 14, $i18, i11, $i0, i, i2, i5, i7, $i10, 1245522068);
                                $i19 += i13;
                                $i18 += $i16;
                                $i17 += -1741252353 * this.size;
                                $i0 += i6;
                                i += $i6;
                                i2 += i8;
                                i4 += i14;
                            }
                        }
                    }
                }
            }
        }
    }

    final void toString(int $i17, int $i18, int i, int $i0, int i2, int $i2, int $i3, int $i4, int $i5, int $i6, int i3, int i4, int i5, int $i10, int i6, int $i12, int i7, int $i14, int i8, int i9) {
        try {
            int[] $r2 = Point.type.get(i8, (short) 255);
            if ($r2 == null) {
                $i6 = Point.type.toString(i8, 1577195485);
                getSize($i17, $i18, i, $i0, i2, $i2, Calendar.get($i6, $i3, -2138350775), Calendar.get($i6, $i4, -2085123791), Calendar.get($i6, $i5, -2128438283), 971130952);
                return;
            }
            this.value = Point.type.add(i8, -16085959);
            this.pos = Point.type.equals(i8, -498676197);
            int $i21 = i2 - $i0;
            i8 = $i18 - $i17;
            i9 = $i2 - $i0;
            int $i22 = i - $i17;
            int $i20 = $i4 - $i3;
            int $i23 = $i5 - $i3;
            int i10 = $i18 != $i17 ? ((i2 - $i0) << 14) / ($i18 - $i17) : 0;
            int i11 = $i18 != i ? (($i2 - i2) << 14) / (i - $i18) : 0;
            int i12 = $i17 != i ? (($i0 - $i2) << 14) / ($i17 - i) : 0;
            int i13 = ($i21 * $i22) - (i9 * i8);
            if (i13 != 0) {
                i8 = ((($i22 * $i20) - (i8 * $i23)) << 9) / i13;
                i9 = ((($i21 * $i23) - ($i20 * i9)) << 9) / i13;
                $i20 = $i6 - i3;
                $i10 = i5 - $i10;
                $i21 = $i12 - i7;
                $i23 = i4 - $i6;
                $i22 = i6 - i5;
                i6 = $i14 - $i12;
                i7 = ((i5 * $i23) - ($i6 * $i22)) << 14;
                long $l29 = ($i22 * $i12) - (i6 * i5);
                Object obj = $l29;
                int $i7 = ((((long) $l29) << 3) << 14) / ((long) (542614623 * this.this$0));
                long j = $i7;
                i3 = (int) $i7;
                $i7 = ($i6 * i6) - ($i23 * $i12);
                i4 = $i7;
                $i7 = (((long) $i7) << 14) / ((long) (542614623 * this.this$0));
                j = $i7;
                i4 = (int) $i7;
                $i14 = (($i20 * i5) - ($i10 * $i6)) << 14;
                $i7 = ((((long) (($i10 * $i12) - (i5 * $i21))) << 3) << 14) / ((long) (542614623 * this.this$0));
                j = $i7;
                i5 = (int) $i7;
                $i7 = ($i6 * $i21) - ($i20 * $i12);
                $i6 = $i7;
                j = ((long) $i7) << 14;
                $l29 = this.this$0 * 542614623;
                Object obj2 = $l29;
                $l29 = j / ((long) $l29);
                j = $l29;
                $i6 = (int) $l29;
                $i12 = (($i10 * $i23) - ($i20 * $i22)) << 14;
                $i7 = ((((long) (($i22 * $i21) - ($i10 * i6))) << 3) << 14) / ((long) (542614623 * this.this$0));
                j = $i7;
                $i10 = (int) $i7;
                $i7 = ($i20 * i6) - ($i21 * $i23);
                i6 = $i7;
                j = ((long) $i7) << 14;
                $l29 = this.this$0 * 542614623;
                Object obj3 = $l29;
                $l29 = j / ((long) $l29);
                j = $l29;
                i6 = (int) $l29;
                if ($i17 > $i18 || $i17 > i) {
                    if ($i18 <= i) {
                        if ($i18 < -1759402563 * this.length) {
                            $i3 = i > -1759402563 * this.length ? -1759402563 * this.length : i;
                            if ($i17 > this.length * -1759402563) {
                                $i17 = this.length * -1759402563;
                            }
                            i = i8 + (($i4 << 9) - (i8 * i2));
                            if ($i3 >= $i17) {
                                i2 <<= 14;
                                if ($i18 < 0) {
                                    $i20 = i2 - (i10 * $i18);
                                    i2 -= i11 * $i18;
                                    i -= i9 * $i18;
                                    $i18 = 0;
                                } else {
                                    $i20 = i2;
                                }
                                $i0 <<= 14;
                                if ($i17 < 0) {
                                    $i0 -= i12 * $i17;
                                    $i17 = 0;
                                }
                                $i5 = $i18 - (this.parent * -1508152919);
                                $i2 = i7 + ($i5 * i4);
                                $i4 = $i14 + ($i6 * $i5);
                                $i5 = $i12 + ($i5 * i6);
                                if (i10 >= i11) {
                                    $i3 -= $i17;
                                    i7 = $i17 - $i18;
                                    $i17 = this.next[$i18];
                                    $i12 = $i20;
                                    $i18 = i7;
                                    while (true) {
                                        $i18--;
                                        if ($i18 < 0) {
                                            break;
                                        }
                                        read(this.size, $r2, 0, 0, $i17, i2 >> 14, $i12 >> 14, i, i8, $i2, $i4, $i5, i3, i5, $i10, 1245522068);
                                        i2 += i11;
                                        i += i9;
                                        $i17 += -1741252353 * this.size;
                                        $i2 += i4;
                                        $i4 += $i6;
                                        $i5 += i6;
                                        $i12 += i10;
                                    }
                                    $i18 = $i3;
                                    while (true) {
                                        $i18--;
                                        if ($i18 < 0) {
                                            break;
                                        }
                                        read(this.size, $r2, 0, 0, $i17, i2 >> 14, $i0 >> 14, i, i8, $i2, $i4, $i5, i3, i5, $i10, 1245522068);
                                        $i0 += i12;
                                        i += i9;
                                        $i17 += -1741252353 * this.size;
                                        $i2 += i4;
                                        $i4 += $i6;
                                        $i5 += i6;
                                        i2 += i11;
                                    }
                                } else {
                                    $i3 -= $i17;
                                    i7 = $i17 - $i18;
                                    $i17 = this.next[$i18];
                                    $i12 = $i20;
                                    $i18 = i7;
                                    while (true) {
                                        $i18--;
                                        if ($i18 < 0) {
                                            break;
                                        }
                                        read(this.size, $r2, 0, 0, $i17, $i12 >> 14, i2 >> 14, i, i8, $i2, $i4, $i5, i3, i5, $i10, 1245522068);
                                        i2 += i11;
                                        i += i9;
                                        $i17 += -1741252353 * this.size;
                                        $i2 += i4;
                                        $i4 += $i6;
                                        $i5 += i6;
                                        $i12 += i10;
                                    }
                                    $i18 = $i3;
                                    while (true) {
                                        $i18--;
                                        if ($i18 < 0) {
                                            break;
                                        }
                                        read(this.size, $r2, 0, 0, $i17, $i0 >> 14, i2 >> 14, i, i8, $i2, $i4, $i5, i3, i5, $i10, 1245522068);
                                        i += i9;
                                        $i17 += this.size * -1741252353;
                                        $i2 += i4;
                                        $i4 += $i6;
                                        $i5 += i6;
                                        i2 += i11;
                                        $i0 += i12;
                                    }
                                }
                            } else {
                                $i20 = i2 << 14;
                                if ($i18 < 0) {
                                    $i5 = $i20 - ($i18 * i10);
                                    $i20 -= i11 * $i18;
                                    i -= i9 * $i18;
                                    $i18 = 0;
                                } else {
                                    $i5 = $i20;
                                }
                                $i4 = $i2 << 14;
                                if ($i3 < 0) {
                                    $i4 -= $i3 * i12;
                                    $i3 = 0;
                                }
                                $i2 = $i18 - (-1508152919 * this.parent);
                                $i0 = i7 + (i4 * $i2);
                                i2 = $i14 + ($i2 * $i6);
                                $i2 = $i12 + ($i2 * i6);
                                if (($i18 != $i3 && i10 < i11) || ($i3 == $i18 && i10 > i12)) {
                                    $i12 = $i17 - $i3;
                                    i7 = $i3 - $i18;
                                    $i17 = this.next[$i18];
                                    $i3 = $i20;
                                    $i18 = i7;
                                    while (true) {
                                        $i18--;
                                        if ($i18 < 0) {
                                            break;
                                        }
                                        read(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i3 >> 14, i, i8, $i0, i2, $i2, i3, i5, $i10, 1245522068);
                                        $i5 += i10;
                                        i += i9;
                                        $i17 += -1741252353 * this.size;
                                        $i0 += i4;
                                        i2 += $i6;
                                        $i2 += i6;
                                        $i3 += i11;
                                    }
                                    $i3 = $i4;
                                    $i18 = $i12;
                                    $i4 = $i5;
                                    while (true) {
                                        $i18--;
                                        if ($i18 < 0) {
                                            break;
                                        }
                                        read(this.size, $r2, 0, 0, $i17, $i4 >> 14, $i3 >> 14, i, i8, $i0, i2, $i2, i3, i5, $i10, 1245522068);
                                        i += i9;
                                        $i17 += -1741252353 * this.size;
                                        $i0 += i4;
                                        i2 += $i6;
                                        $i2 += i6;
                                        $i3 += i12;
                                        $i4 += i10;
                                    }
                                } else {
                                    $i12 = $i17 - $i3;
                                    i7 = $i3 - $i18;
                                    $i17 = this.next[$i18];
                                    $i3 = $i20;
                                    $i18 = i7;
                                    while (true) {
                                        $i18--;
                                        if ($i18 < 0) {
                                            break;
                                        }
                                        read(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i5 >> 14, i, i8, $i0, i2, $i2, i3, i5, $i10, 1245522068);
                                        $i5 += i10;
                                        i += i9;
                                        $i17 += -1741252353 * this.size;
                                        $i0 += i4;
                                        i2 += $i6;
                                        $i2 += i6;
                                        $i3 += i11;
                                    }
                                    $i3 = $i5;
                                    $i18 = $i12;
                                    while (true) {
                                        $i18--;
                                        if ($i18 < 0) {
                                            break;
                                        }
                                        read(this.size, $r2, 0, 0, $i17, $i4 >> 14, $i3 >> 14, i, i8, $i0, i2, $i2, i3, i5, $i10, 1245522068);
                                        $i4 += i12;
                                        i += i9;
                                        $i17 += this.size * -1741252353;
                                        $i0 += i4;
                                        i2 += $i6;
                                        $i2 += i6;
                                        $i3 += i10;
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    if (i < this.length * -1759402563) {
                        $i3 = $i17 > this.length * -1759402563 ? this.length * -1759402563 : $i17;
                        if ($i18 > -1759402563 * this.length) {
                            $i18 = this.length * -1759402563;
                        }
                        $i4 = (($i5 << 9) - (i8 * $i2)) + i8;
                        if ($i3 >= $i18) {
                            $i5 = $i2 << 14;
                            if (i < 0) {
                                $i0 = $i5 - (i11 * i);
                                $i5 -= i12 * i;
                                $i17 = $i4 - (i9 * i);
                                i = 0;
                                $i20 = $i0;
                            } else {
                                $i17 = $i4;
                                $i20 = $i5;
                            }
                            $i2 = i2 << 14;
                            if ($i18 < 0) {
                                $i2 -= $i18 * i10;
                                $i18 = 0;
                            }
                            $i4 = i - (this.parent * -1508152919);
                            $i0 = i7 + (i4 * $i4);
                            i2 = $i14 + ($i6 * $i4);
                            $i4 = $i12 + ($i4 * i6);
                            if (i11 >= i12) {
                                $i3 -= $i18;
                                i7 = $i18 - i;
                                $i18 = this.next[i];
                                $i12 = $i20;
                                i = i7;
                                while (true) {
                                    i--;
                                    if (i < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i18, $i5 >> 14, $i12 >> 14, $i17, i8, $i0, i2, $i4, i3, i5, $i10, 1245522068);
                                    $i5 += i12;
                                    $i17 += i9;
                                    $i18 += this.size * -1741252353;
                                    $i0 += i4;
                                    i2 += $i6;
                                    $i4 += i6;
                                    $i12 += i11;
                                }
                                i = $i5;
                                $i5 = $i3;
                                $i3 = $i2;
                                while (true) {
                                    $i2 = $i5 - 1;
                                    if ($i2 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i18, i >> 14, $i3 >> 14, $i17, i8, $i0, i2, $i4, i3, i5, $i10, 1245522068);
                                    $i17 += i9;
                                    $i18 += this.size * -1741252353;
                                    $i0 += i4;
                                    i2 += $i6;
                                    $i4 += i6;
                                    i += i12;
                                    $i3 += i10;
                                    $i5 = $i2;
                                }
                            } else {
                                $i3 -= $i18;
                                i7 = $i18 - i;
                                $i18 = this.next[i];
                                $i12 = $i20;
                                i = i7;
                                while (true) {
                                    i--;
                                    if (i < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i18, $i12 >> 14, $i5 >> 14, $i17, i8, $i0, i2, $i4, i3, i5, $i10, 1245522068);
                                    $i5 += i12;
                                    $i17 += i9;
                                    $i18 += -1741252353 * this.size;
                                    $i0 += i4;
                                    i2 += $i6;
                                    $i4 += i6;
                                    $i12 += i11;
                                }
                                i = $i3;
                                while (true) {
                                    i--;
                                    if (i < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i18, $i2 >> 14, $i5 >> 14, $i17, i8, $i0, i2, $i4, i3, i5, $i10, 1245522068);
                                    $i2 += i10;
                                    $i17 += i9;
                                    $i18 += -1741252353 * this.size;
                                    $i0 += i4;
                                    i2 += $i6;
                                    $i4 += i6;
                                    $i5 += i12;
                                }
                            }
                        } else {
                            $i20 = $i2 << 14;
                            if (i < 0) {
                                $i5 = $i20 - (i11 * i);
                                $i20 -= i * i12;
                                $i4 -= i9 * i;
                                i = 0;
                            } else {
                                $i5 = $i20;
                            }
                            i2 = $i0 << 14;
                            if ($i3 < 0) {
                                i2 -= $i3 * i10;
                                $i3 = 0;
                            }
                            $i2 = i - (this.parent * -1508152919);
                            $i17 = i7 + ($i2 * i4);
                            $i0 = $i14 + ($i6 * $i2);
                            $i2 = $i12 + ($i2 * i6);
                            if (i11 >= i12) {
                                $i12 = $i18 - $i3;
                                i7 = $i3 - i;
                                $i18 = this.next[i];
                                i = $i4;
                                $i4 = $i20;
                                $i3 = $i5;
                                $i5 = i7;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i18, $i4 >> 14, $i3 >> 14, i, i8, $i17, $i0, $i2, i3, i5, $i10, 1245522068);
                                    $i3 += i11;
                                    i += i9;
                                    $i18 += this.size * -1741252353;
                                    $i17 += i4;
                                    $i0 += $i6;
                                    $i2 += i6;
                                    $i4 += i12;
                                }
                                $i4 = $i3;
                                $i3 = $i12;
                                while (true) {
                                    $i3--;
                                    if ($i3 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i18, i2 >> 14, $i4 >> 14, i, i8, $i17, $i0, $i2, i3, i5, $i10, 1245522068);
                                    i2 += i10;
                                    i += i9;
                                    $i18 += -1741252353 * this.size;
                                    $i17 += i4;
                                    $i0 += $i6;
                                    $i2 += i6;
                                    $i4 += i11;
                                }
                            } else {
                                $i12 = $i18 - $i3;
                                i7 = $i3 - i;
                                $i18 = this.next[i];
                                i = $i4;
                                $i4 = $i20;
                                $i3 = $i5;
                                $i5 = i7;
                                while (true) {
                                    $i5--;
                                    if ($i5 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i18, $i3 >> 14, $i4 >> 14, i, i8, $i17, $i0, $i2, i3, i5, $i10, 1245522068);
                                    $i3 += i11;
                                    i += i9;
                                    $i18 += this.size * -1741252353;
                                    $i17 += i4;
                                    $i0 += $i6;
                                    $i2 += i6;
                                    $i4 += i12;
                                }
                                $i5 = $i12;
                                $i4 = i2;
                                while (true) {
                                    i2 = $i5 - 1;
                                    if (i2 < 0) {
                                        break;
                                    }
                                    read(this.size, $r2, 0, 0, $i18, $i3 >> 14, $i4 >> 14, i, i8, $i17, $i0, $i2, i3, i5, $i10, 1245522068);
                                    i += i9;
                                    $i18 += -1741252353 * this.size;
                                    $i17 += i4;
                                    $i0 += $i6;
                                    $i2 += i6;
                                    $i3 += i11;
                                    $i4 += i10;
                                    $i5 = i2;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                if ($i17 < this.length * -1759402563) {
                    $i4 = $i18 > -1759402563 * this.length ? -1759402563 * this.length : $i18;
                    $i5 = i > this.length * -1759402563 ? -1759402563 * this.length : i;
                    $i3 = (($i3 << 9) - (i8 * $i0)) + i8;
                    if ($i4 >= $i5) {
                        $i20 = $i0 << 14;
                        if ($i17 < 0) {
                            $i21 = $i20 - (i12 * $i17);
                            $i20 -= $i17 * i10;
                            $i3 -= i9 * $i17;
                            $i17 = 0;
                        } else {
                            $i21 = $i20;
                        }
                        $i0 = $i2 << 14;
                        if ($i5 < 0) {
                            $i0 -= $i5 * i11;
                            $i5 = 0;
                        }
                        i2 = $i17 - (-1508152919 * this.parent);
                        $i18 = i7 + (i4 * i2);
                        i = $i14 + (i2 * $i6);
                        i2 = $i12 + (i2 * i6);
                        if (($i5 != $i17 && i12 < i10) || ($i17 == $i5 && i11 > i10)) {
                            $i4 -= $i5;
                            $i12 = $i5 - $i17;
                            $i17 = this.next[$i17];
                            $i2 = $i3;
                            $i5 = $i21;
                            $i3 = $i20;
                            while (true) {
                                $i12--;
                                if ($i12 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i3 >> 14, $i2, i8, $i18, i, i2, i3, i5, $i10, 1245522068);
                                $i3 += i10;
                                $i2 += i9;
                                $i17 += -1741252353 * this.size;
                                $i18 += i4;
                                i += $i6;
                                i2 += i6;
                                $i5 += i12;
                            }
                            $i5 = $i4;
                            $i4 = $i3;
                            while (true) {
                                $i3 = $i5 - 1;
                                if ($i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i0 >> 14, $i4 >> 14, $i2, i8, $i18, i, i2, i3, i5, $i10, 1245522068);
                                $i2 += i9;
                                $i17 += this.size * -1741252353;
                                $i18 += i4;
                                i += $i6;
                                i2 += i6;
                                $i0 += i11;
                                $i4 += i10;
                                $i5 = $i3;
                            }
                        } else {
                            $i4 -= $i5;
                            $i12 = $i5 - $i17;
                            $i17 = this.next[$i17];
                            $i2 = $i3;
                            $i5 = $i21;
                            $i3 = $i20;
                            while (true) {
                                $i12--;
                                if ($i12 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i3 >> 14, $i5 >> 14, $i2, i8, $i18, i, i2, i3, i5, $i10, 1245522068);
                                $i3 += i10;
                                $i2 += i9;
                                $i17 += this.size * -1741252353;
                                $i18 += i4;
                                i += $i6;
                                i2 += i6;
                                $i5 += i12;
                            }
                            $i5 = $i3;
                            $i3 = $i4;
                            while (true) {
                                $i3--;
                                if ($i3 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i5 >> 14, $i0 >> 14, $i2, i8, $i18, i, i2, i3, i5, $i10, 1245522068);
                                $i0 += i11;
                                $i2 += i9;
                                $i17 += -1741252353 * this.size;
                                $i18 += i4;
                                i += $i6;
                                i2 += i6;
                                $i5 += i10;
                            }
                        }
                    } else {
                        $i2 = $i0 << 14;
                        if ($i17 < 0) {
                            $i20 = $i2 - ($i17 * i12);
                            $i2 -= i10 * $i17;
                            $i3 -= $i17 * i9;
                            $i17 = 0;
                        } else {
                            $i20 = $i2;
                        }
                        $i18 = i2 << 14;
                        if ($i4 < 0) {
                            $i18 -= $i4 * i11;
                            $i4 = 0;
                        }
                        i2 = $i17 - (-1508152919 * this.parent);
                        i = i7 + (i4 * i2);
                        $i0 = $i14 + (i2 * $i6);
                        i2 = $i12 + (i2 * i6);
                        if (($i4 != $i17 && i12 < i10) || ($i4 == $i17 && i12 > i11)) {
                            $i5 -= $i4;
                            $i12 = $i4 - $i17;
                            $i17 = this.next[$i17];
                            $i4 = $i20;
                            i7 = $i2;
                            $i2 = $i12;
                            while (true) {
                                $i2--;
                                if ($i2 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i4 >> 14, i7 >> 14, $i3, i8, i, $i0, i2, i3, i5, $i10, 1245522068);
                                $i4 += i12;
                                $i3 += i9;
                                $i17 += -1741252353 * this.size;
                                i += i4;
                                $i0 += $i6;
                                i2 += i6;
                                i7 += i10;
                            }
                            $i2 = $i5;
                            while (true) {
                                $i2--;
                                if ($i2 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i4 >> 14, $i18 >> 14, $i3, i8, i, $i0, i2, i3, i5, $i10, 1245522068);
                                $i18 += i11;
                                $i3 += i9;
                                $i17 += this.size * -1741252353;
                                i += i4;
                                $i0 += $i6;
                                i2 += i6;
                                $i4 += i12;
                            }
                        } else {
                            $i5 -= $i4;
                            $i12 = $i4 - $i17;
                            $i17 = this.next[$i17];
                            $i4 = $i20;
                            i7 = $i2;
                            $i2 = $i12;
                            while (true) {
                                $i2--;
                                if ($i2 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, i7 >> 14, $i4 >> 14, $i3, i8, i, $i0, i2, i3, i5, $i10, 1245522068);
                                $i4 += i12;
                                $i3 += i9;
                                $i17 += this.size * -1741252353;
                                i += i4;
                                $i0 += $i6;
                                i2 += i6;
                                i7 += i10;
                            }
                            $i2 = $i5;
                            while (true) {
                                $i2--;
                                if ($i2 < 0) {
                                    break;
                                }
                                read(this.size, $r2, 0, 0, $i17, $i18 >> 14, $i4 >> 14, $i3, i8, i, $i0, i2, i3, i5, $i10, 1245522068);
                                $i3 += i9;
                                $i17 += -1741252353 * this.size;
                                i += i4;
                                $i0 += $i6;
                                i2 += i6;
                                $i4 += i12;
                                $i18 += i11;
                            }
                        }
                    }
                }
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "cj.aj(" + ')');
        }
    }

    final void write(int[] iArr, int $i0, int i, int i2, int $i5, int $i6, int i3, int $i4) {
        if (this.f201c) {
            if ($i6 > this.buffer * 784773023) {
                $i6 = this.buffer * 784773023;
            }
            if ($i5 < 0) {
                $i5 = 0;
            }
        }
        if ($i5 < $i6) {
            i2 = $i0 + $i5;
            $i0 = ($i4 * $i5) + i3;
            int $i7;
            int $i8;
            if (!this.f202s) {
                i = $i6 - $i5;
                if (this.f200b * 238267341 != 0) {
                    $i5 = this.f200b * 238267341;
                    $i6 = 256 - (this.f200b * 238267341);
                    while (true) {
                        $i7 = Point.count[$i0 >> 8];
                        $i0 += $i4;
                        $i8 = ((((65280 & $i7) * $i6) >> 8) & 65280) + (((($i7 & 16711935) * $i6) >> 8) & 16711935);
                        $i7 = iArr[i2];
                        iArr[i2] = ($i8 + ((((16711935 & $i7) * $i5) >> 8) & 16711935)) + (((($i7 & 65280) * $i5) >> 8) & 65280);
                        i--;
                        if (i <= 0) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    while (true) {
                        iArr[i2] = Point.count[$i0 >> 8];
                        $i0 += $i4;
                        i--;
                        if (i <= 0) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                i3 = ($i6 - $i5) >> 2;
                $i4 <<= 2;
                if (238267341 * this.f200b == 0) {
                    if (i3 > 0) {
                        do {
                            i = Point.count[$i0 >> 8];
                            $i0 += $i4;
                            $i7 = i2 + 1;
                            iArr[i2] = i;
                            i2 = $i7 + 1;
                            iArr[$i7] = i;
                            $i7 = i2 + 1;
                            iArr[i2] = i;
                            i2 = $i7 + 1;
                            iArr[$i7] = i;
                            i3--;
                        } while (i3 > 0);
                    }
                    i = i2;
                    i2 = ($i6 - $i5) & 3;
                    if (i2 > 0) {
                        $i0 = Point.count[$i0 >> 8];
                        while (true) {
                            iArr[i] = $i0;
                            i2--;
                            if (i2 <= 0) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    i = 238267341 * this.f200b;
                    $i7 = 256 - (this.f200b * 238267341);
                    if (i3 > 0) {
                        do {
                            int $i9 = Point.count[$i0 >> 8];
                            $i0 += $i4;
                            $i8 = (((($i9 & 16711935) * $i7) >> 8) & 16711935) + ((((65280 & $i9) * $i7) >> 8) & 65280);
                            int $i10 = iArr[i2];
                            $i9 = i2 + 1;
                            iArr[i2] = (((($i10 & 65280) * i) >> 8) & 65280) + (((((16711935 & $i10) * i) >> 8) & 16711935) + $i8);
                            int $i11 = iArr[$i9];
                            i2 = $i9 + 1;
                            iArr[$i9] = ((((($i11 & 16711935) * i) >> 8) & 16711935) + $i8) + ((((65280 & $i11) * i) >> 8) & 65280);
                            $i11 = iArr[i2];
                            $i9 = i2 + 1;
                            iArr[i2] = ((((($i11 & 16711935) * i) >> 8) & 16711935) + $i8) + ((((65280 & $i11) * i) >> 8) & 65280);
                            $i10 = iArr[$i9];
                            i2 = $i9 + 1;
                            iArr[$i9] = ($i8 + ((((16711935 & $i10) * i) >> 8) & 16711935)) + (((($i10 & 65280) * i) >> 8) & 65280);
                            i3--;
                        } while (i3 > 0);
                    }
                    $i5 = ($i6 - $i5) & 3;
                    if ($i5 > 0) {
                        $i6 = Point.count[$i0 >> 8];
                        $i0 = ((((65280 & $i6) * $i7) >> 8) & 65280) + (((($i6 & 16711935) * $i7) >> 8) & 16711935);
                        while (true) {
                            $i4 = iArr[i2];
                            i3 = (((65280 & $i4) * i) >> 8) & 65280;
                            int $i42 = $i4 & 16711935;
                            $i4 = $i42;
                            $i42 = (($i42 * i) >> 8) & 16711935;
                            $i4 = $i42;
                            iArr[i2] = ($i42 + $i0) + i3;
                            $i5--;
                            if ($i5 <= 0) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }
}
