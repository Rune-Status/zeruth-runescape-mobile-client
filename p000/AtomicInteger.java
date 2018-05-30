package p000;

/* compiled from: bv */
public class AtomicInteger extends LazyList {
    static String name;

    AtomicInteger(Resource resource) {
        try {
            super(resource);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bv.<init>(" + ')');
        }
    }

    static void execute(Logger logger, int i) {
        if (client.object != null) {
            try {
                logger.write(client.object, 0, client.object.length, -477745968);
                return;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "bv.gs(" + ')');
            }
        }
        byte[] $r1 = Format.toString((short) 15243);
        logger.write($r1, 0, $r1.length, 1286522064);
    }

    public static int get(int i, int i2) {
        try {
            return Data.get(Main.value[i]);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bv.ad(" + ')');
        }
    }

    static final int toString(int $i0, int $i2, int i) {
        i = 126;
        if ($i0 == -2) {
            return 12345678;
        }
        if (-1 == $i0) {
            return $i2 < 2 ? 2 : $i2 > 126 ? 126 : $i2;
        } else {
            $i2 = (($i0 & 127) * $i2) / Constants.f93X;
            if ($i2 < 2) {
                i = 2;
            } else if ($i2 <= 126) {
                i = $i2;
            }
            return i + (65408 & $i0);
        }
    }

    static final void toString(Collection collection, int i, byte b) {
        try {
            Version.add(516759209 * collection.size, collection.value * 2328865, i, (byte) 4);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bv.da(" + ')');
        }
    }

    public void add(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        try {
            Integer $r2 = arrayMap.read();
            if ($r2 != null) {
                this.size[0] = -1;
                if ($r2.f146x != 1) {
                    $r2.append();
                }
                $r2.read(i);
                int $i11 = ((i5 * i8) - (i4 * i6)) >> 16;
                int $i9 = ((i3 * $i11) + (i7 * i2)) >> 16;
                int $i12 = ($r2.width * i3) >> 16;
                int $i10 = $i12 + $i9;
                if ($i10 > 50 && $i9 < 3500) {
                    int $i13 = ((i5 * i6) + (i4 * i8)) >> 16;
                    Point $r4 = this.this$0;
                    int $i14 = ($r4.this$0 * 542614623) * ($i13 - $r2.width);
                    int $i15 = $i14 / $i10;
                    int $i16 = this.this$0;
                    Point $r42 = $i16;
                    if ($i15 < -1292978563 * $i16.index) {
                        $i16 = $r2.width;
                        $i15 = $i16 + $i13;
                        $i16 = this.this$0;
                        $r42 = $i16;
                        $i15 *= 542614623 * $i16.this$0;
                        int $i162 = $i15 / $i10;
                        $i16 = this.this$0;
                        $r42 = $i16;
                        if ($i162 > 1292965175 * $i16.key) {
                            $i11 = ((i3 * i7) - ($i11 * i2)) >> 16;
                            $i16 = $r2.width;
                            int $i17 = ($i16 * i2) >> 16;
                            $i162 = $i11 + $i17;
                            $i16 = this.this$0;
                            $r42 = $i16;
                            $i162 *= 542614623 * $i16.this$0;
                            int $i18 = $i162 / $i10;
                            $i16 = this.this$0;
                            $r42 = $i16;
                            if ($i18 > -1542934767 * $i16.height) {
                                $i17 += ((1500767459 * $r2.size) * i3) >> 16;
                                $i16 = this.this$0;
                                $r42 = $i16;
                                $i17 = (542614623 * $i16.this$0) * ($i11 - $i17);
                                $i18 = $i17 / $i10;
                                $i16 = this.this$0;
                                $r42 = $i16;
                                if ($i18 < -939286465 * $i16.width) {
                                    int $i19;
                                    boolean $z1;
                                    int $i20;
                                    long[] $r5;
                                    boolean $z2;
                                    int[] $r3;
                                    $i16 = $r2.size * 1500767459;
                                    $i18 = $i16;
                                    Object obj = null;
                                    if ($i9 - ($i12 + (($i16 * i2) >> 16)) <= 50) {
                                        obj = 1;
                                    }
                                    if (obj == null) {
                                        if ($r2.value <= 0) {
                                            obj = null;
                                            $i19 = -429386291 * Main.count;
                                            $i18 = Preconditions.format(-414970391);
                                            $z1 = Main.data;
                                            if (Type.add(j) && $z1) {
                                                $z1 = false;
                                                if (Main.active) {
                                                    $i12 = $i9 - $i12;
                                                    $i20 = $i12 > 50 ? 50 : $i12;
                                                    if ($i13 <= 0) {
                                                        $i13 = $i14 / $i10;
                                                        $i12 = $i15 / $i20;
                                                    } else {
                                                        $i12 = $i15 / $i10;
                                                        $i13 = $i14 / $i20;
                                                    }
                                                    if ($i11 <= 0) {
                                                        $i10 = $i17 / $i10;
                                                        $i14 = $i162 / $i20;
                                                    } else {
                                                        $i14 = $i162 / $i10;
                                                        $i10 = $i17 / $i20;
                                                    }
                                                    $i16 = this.this$0;
                                                    $r42 = $i16;
                                                    $i15 = $i19 - (-1575402035 * $i16.data);
                                                    $r4 = this.this$0;
                                                    $i11 = $i18 - (-1508152919 * $r4.parent);
                                                    if ($i15 > $i13 && $i15 < $i12 && $i11 > $i10 && $i11 < $i14) {
                                                        $z1 = true;
                                                    }
                                                } else {
                                                    $z1 = IntegerPolynomial.add($r2, i6, i7, i8, this, -1958541240);
                                                }
                                                if ($z1) {
                                                    if ($r2.flags) {
                                                        $z1 = true;
                                                    } else {
                                                        $r5 = Main.value;
                                                        $i10 = Main.size + 313171601;
                                                        Main.size = $i10;
                                                        $r5[($i10 * 963961457) - 1] = j;
                                                        $z1 = false;
                                                    }
                                                    $r4 = this.this$0;
                                                    $i10 = $r4.data * -1575402035;
                                                    $r4 = this.this$0;
                                                    $i12 = -1508152919 * $r4.parent;
                                                    $i13 = 0;
                                                    $i14 = 0;
                                                    if (i != 0) {
                                                        $i13 = LazyList.offset[i];
                                                        $i14 = LazyList.state[i];
                                                    }
                                                    $z2 = false;
                                                    for ($i15 = 0; $i15 < $r2.size; $i15++) {
                                                        $i162 = $r2.next[$i15];
                                                        $i11 = $r2.length[$i15];
                                                        $i18 = $r2.this$0[$i15];
                                                        if (i == 0) {
                                                            $i17 = (($i13 * $i18) + ($i162 * $i14)) >> 16;
                                                            $i18 = (($i18 * $i14) - ($i162 * $i13)) >> 16;
                                                        } else {
                                                            $i17 = $i162;
                                                        }
                                                        $i162 = $i17 + i6;
                                                        $i17 = $i11 + i7;
                                                        $i18 += i8;
                                                        $i11 = ((i5 * $i162) + (i4 * $i18)) >> 16;
                                                        $i18 = (($i18 * i5) - ($i162 * i4)) >> 16;
                                                        $i162 = (($i17 * i3) - (i2 * $i18)) >> 16;
                                                        $i17 = (($i18 * i3) + ($i17 * i2)) >> 16;
                                                        this.data[$i15] = $i17 - $i9;
                                                        if ($i17 < 50) {
                                                            $r3 = this.count;
                                                            $i16 = this.this$0;
                                                            $r42 = $i16;
                                                            $i16 = (542614623 * $i16.this$0) * $i11;
                                                            $i18 = $i16;
                                                            $i16 /= $i17;
                                                            $i18 = $i16;
                                                            $r3[$i15] = $i16 + $i10;
                                                            $r3 = this.next;
                                                            $r4 = this.this$0;
                                                            $i16 = $r4.this$0 * 542614623;
                                                            $i18 = $i16;
                                                            $i16 *= $i162;
                                                            $i18 = $i16;
                                                            $i16 /= $i17;
                                                            $i18 = $i16;
                                                            $r3[$i15] = $i16 + $i12;
                                                        } else {
                                                            this.count[$i15] = -5000;
                                                            $z2 = true;
                                                        }
                                                        if (obj == null) {
                                                            this.length[$i15] = $i11;
                                                            this.key[$i15] = $i162;
                                                            this.value[$i15] = $i17;
                                                        }
                                                    }
                                                    get($r2, $z2, $z1, j);
                                                }
                                            }
                                            $z1 = false;
                                            $r4 = this.this$0;
                                            $i10 = $r4.data * -1575402035;
                                            $r4 = this.this$0;
                                            $i12 = -1508152919 * $r4.parent;
                                            $i13 = 0;
                                            $i14 = 0;
                                            if (i != 0) {
                                                $i13 = LazyList.offset[i];
                                                $i14 = LazyList.state[i];
                                            }
                                            $z2 = false;
                                            for ($i15 = 0; $i15 < $r2.size; $i15++) {
                                                $i162 = $r2.next[$i15];
                                                $i11 = $r2.length[$i15];
                                                $i18 = $r2.this$0[$i15];
                                                if (i == 0) {
                                                    $i17 = $i162;
                                                } else {
                                                    $i17 = (($i13 * $i18) + ($i162 * $i14)) >> 16;
                                                    $i18 = (($i18 * $i14) - ($i162 * $i13)) >> 16;
                                                }
                                                $i162 = $i17 + i6;
                                                $i17 = $i11 + i7;
                                                $i18 += i8;
                                                $i11 = ((i5 * $i162) + (i4 * $i18)) >> 16;
                                                $i18 = (($i18 * i5) - ($i162 * i4)) >> 16;
                                                $i162 = (($i17 * i3) - (i2 * $i18)) >> 16;
                                                $i17 = (($i18 * i3) + ($i17 * i2)) >> 16;
                                                this.data[$i15] = $i17 - $i9;
                                                if ($i17 < 50) {
                                                    this.count[$i15] = -5000;
                                                    $z2 = true;
                                                } else {
                                                    $r3 = this.count;
                                                    $i16 = this.this$0;
                                                    $r42 = $i16;
                                                    $i16 = (542614623 * $i16.this$0) * $i11;
                                                    $i18 = $i16;
                                                    $i16 /= $i17;
                                                    $i18 = $i16;
                                                    $r3[$i15] = $i16 + $i10;
                                                    $r3 = this.next;
                                                    $r4 = this.this$0;
                                                    $i16 = $r4.this$0 * 542614623;
                                                    $i18 = $i16;
                                                    $i16 *= $i162;
                                                    $i18 = $i16;
                                                    $i16 /= $i17;
                                                    $i18 = $i16;
                                                    $r3[$i15] = $i16 + $i12;
                                                }
                                                if (obj == null) {
                                                    this.length[$i15] = $i11;
                                                    this.key[$i15] = $i162;
                                                    this.value[$i15] = $i17;
                                                }
                                            }
                                            get($r2, $z2, $z1, j);
                                        }
                                    }
                                    obj = 1;
                                    $i19 = -429386291 * Main.count;
                                    $i18 = Preconditions.format(-414970391);
                                    $z1 = Main.data;
                                    $z1 = false;
                                    if (Main.active) {
                                        $i12 = $i9 - $i12;
                                        if ($i12 > 50) {
                                        }
                                        if ($i13 <= 0) {
                                            $i12 = $i15 / $i10;
                                            $i13 = $i14 / $i20;
                                        } else {
                                            $i13 = $i14 / $i10;
                                            $i12 = $i15 / $i20;
                                        }
                                        if ($i11 <= 0) {
                                            $i14 = $i162 / $i10;
                                            $i10 = $i17 / $i20;
                                        } else {
                                            $i10 = $i17 / $i10;
                                            $i14 = $i162 / $i20;
                                        }
                                        $i16 = this.this$0;
                                        $r42 = $i16;
                                        $i15 = $i19 - (-1575402035 * $i16.data);
                                        $r4 = this.this$0;
                                        $i11 = $i18 - (-1508152919 * $r4.parent);
                                        $z1 = true;
                                    } else {
                                        $z1 = IntegerPolynomial.add($r2, i6, i7, i8, this, -1958541240);
                                    }
                                    if ($z1) {
                                        if ($r2.flags) {
                                            $z1 = true;
                                        } else {
                                            $r5 = Main.value;
                                            $i10 = Main.size + 313171601;
                                            Main.size = $i10;
                                            $r5[($i10 * 963961457) - 1] = j;
                                            $z1 = false;
                                        }
                                        $r4 = this.this$0;
                                        $i10 = $r4.data * -1575402035;
                                        $r4 = this.this$0;
                                        $i12 = -1508152919 * $r4.parent;
                                        $i13 = 0;
                                        $i14 = 0;
                                        if (i != 0) {
                                            $i13 = LazyList.offset[i];
                                            $i14 = LazyList.state[i];
                                        }
                                        $z2 = false;
                                        for ($i15 = 0; $i15 < $r2.size; $i15++) {
                                            $i162 = $r2.next[$i15];
                                            $i11 = $r2.length[$i15];
                                            $i18 = $r2.this$0[$i15];
                                            if (i == 0) {
                                                $i17 = (($i13 * $i18) + ($i162 * $i14)) >> 16;
                                                $i18 = (($i18 * $i14) - ($i162 * $i13)) >> 16;
                                            } else {
                                                $i17 = $i162;
                                            }
                                            $i162 = $i17 + i6;
                                            $i17 = $i11 + i7;
                                            $i18 += i8;
                                            $i11 = ((i5 * $i162) + (i4 * $i18)) >> 16;
                                            $i18 = (($i18 * i5) - ($i162 * i4)) >> 16;
                                            $i162 = (($i17 * i3) - (i2 * $i18)) >> 16;
                                            $i17 = (($i18 * i3) + ($i17 * i2)) >> 16;
                                            this.data[$i15] = $i17 - $i9;
                                            if ($i17 < 50) {
                                                $r3 = this.count;
                                                $i16 = this.this$0;
                                                $r42 = $i16;
                                                $i16 = (542614623 * $i16.this$0) * $i11;
                                                $i18 = $i16;
                                                $i16 /= $i17;
                                                $i18 = $i16;
                                                $r3[$i15] = $i16 + $i10;
                                                $r3 = this.next;
                                                $r4 = this.this$0;
                                                $i16 = $r4.this$0 * 542614623;
                                                $i18 = $i16;
                                                $i16 *= $i162;
                                                $i18 = $i16;
                                                $i16 /= $i17;
                                                $i18 = $i16;
                                                $r3[$i15] = $i16 + $i12;
                                            } else {
                                                this.count[$i15] = -5000;
                                                $z2 = true;
                                            }
                                            if (obj == null) {
                                                this.length[$i15] = $i11;
                                                this.key[$i15] = $i162;
                                                this.value[$i15] = $i17;
                                            }
                                        }
                                        get($r2, $z2, $z1, j);
                                    }
                                    $z1 = false;
                                    $r4 = this.this$0;
                                    $i10 = $r4.data * -1575402035;
                                    $r4 = this.this$0;
                                    $i12 = -1508152919 * $r4.parent;
                                    $i13 = 0;
                                    $i14 = 0;
                                    if (i != 0) {
                                        $i13 = LazyList.offset[i];
                                        $i14 = LazyList.state[i];
                                    }
                                    $z2 = false;
                                    for ($i15 = 0; $i15 < $r2.size; $i15++) {
                                        $i162 = $r2.next[$i15];
                                        $i11 = $r2.length[$i15];
                                        $i18 = $r2.this$0[$i15];
                                        if (i == 0) {
                                            $i17 = $i162;
                                        } else {
                                            $i17 = (($i13 * $i18) + ($i162 * $i14)) >> 16;
                                            $i18 = (($i18 * $i14) - ($i162 * $i13)) >> 16;
                                        }
                                        $i162 = $i17 + i6;
                                        $i17 = $i11 + i7;
                                        $i18 += i8;
                                        $i11 = ((i5 * $i162) + (i4 * $i18)) >> 16;
                                        $i18 = (($i18 * i5) - ($i162 * i4)) >> 16;
                                        $i162 = (($i17 * i3) - (i2 * $i18)) >> 16;
                                        $i17 = (($i18 * i3) + ($i17 * i2)) >> 16;
                                        this.data[$i15] = $i17 - $i9;
                                        if ($i17 < 50) {
                                            this.count[$i15] = -5000;
                                            $z2 = true;
                                        } else {
                                            $r3 = this.count;
                                            $i16 = this.this$0;
                                            $r42 = $i16;
                                            $i16 = (542614623 * $i16.this$0) * $i11;
                                            $i18 = $i16;
                                            $i16 /= $i17;
                                            $i18 = $i16;
                                            $r3[$i15] = $i16 + $i10;
                                            $r3 = this.next;
                                            $r4 = this.this$0;
                                            $i16 = $r4.this$0 * 542614623;
                                            $i18 = $i16;
                                            $i16 *= $i162;
                                            $i18 = $i16;
                                            $i16 /= $i17;
                                            $i18 = $i16;
                                            $r3[$i15] = $i16 + $i12;
                                        }
                                        if (obj == null) {
                                            this.length[$i15] = $i11;
                                            this.key[$i15] = $i162;
                                            this.value[$i15] = $i17;
                                        }
                                    }
                                    try {
                                        get($r2, $z2, $z1, j);
                                    } catch (Exception e) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "bv.an(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void add(p000.Integer r65, int r66) {
        /*
        r64 = this;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.data;
        r22 = r0;
        r24 = -520785265; // 0xffffffffe0f5728f float:-1.4149085E20 double:NaN;
        r23 = r22 * r24;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.parent;
        r22 = r0;
        r24 = -1006446418; // 0xffffffffc402d8ae float:-523.3856 double:NaN;
        r25 = r24 * r22;
        r0 = r65;
        r0 = r0.count;
        r26 = r0;
        r27 = r26[r66];
        r0 = r65;
        r0 = r0.queue;
        r26 = r0;
        r28 = r26[r66];
        r0 = r65;
        r0 = r0.key;
        r26 = r0;
        r22 = r26[r66];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r29 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r30 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r31 = r26[r22];
        r0 = r65;
        r0 = r0.position;
        r32 = r0;
        if (r32 != 0) goto L_0x069b;
    L_0x0056:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r24 = 0;
        r0 = r24;
        r1 = r21;
        r1.f200b = r0;
    L_0x0064:
        r24 = 19915055; // 0x12fe12f float:3.2303985E-38 double:9.8393445E-317;
        r0 = r29;
        r1 = r24;
        if (r0 < r1) goto L_0x0337;
    L_0x006d:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.count;
        r33 = r0;
        r34 = r33[r27];
        r24 = 0;
        r26[r24] = r34;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.next;
        r33 = r0;
        r34 = r33[r27];
        r24 = 0;
        r26[r24] = r34;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r34 = r33[r66];
        r24 = 0;
        r26[r24] = r34;
        r34 = 1;
    L_0x00a5:
        r24 = 50;
        r0 = r30;
        r1 = r24;
        if (r0 < r1) goto L_0x0909;
    L_0x00ad:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.count;
        r33 = r0;
        r35 = r33[r28];
        r26[r34] = r35;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.next;
        r33 = r0;
        r35 = r33[r28];
        r26[r34] = r35;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.current;
        r33 = r0;
        r36 = r33[r66];
        r26[r34] = r36;
        r34 = r34 + 1;
    L_0x00df:
        r24 = 50;
        r0 = r31;
        r1 = r24;
        if (r0 < r1) goto L_0x0b52;
    L_0x00e7:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.count;
        r33 = r0;
        r25 = r33[r22];
        r26[r34] = r25;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.next;
        r33 = r0;
        r25 = r33[r22];
        r26[r34] = r25;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.index;
        r33 = r0;
        r23 = r33[r66];
        r26[r34] = r23;
        r35 = r34 + 1;
    L_0x0119:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 0;
        r25 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 1;
        r31 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 2;
        r23 = r26[r24];
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 0;
        r34 = r26[r24];
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 1;
        r30 = r26[r24];
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 2;
        r29 = r26[r24];
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r24 = 0;
        r0 = r24;
        r1 = r21;
        r1.f201c = r0;
        r24 = 3;
        r0 = r35;
        r1 = r24;
        if (r0 != r1) goto L_0x021b;
    L_0x016b:
        if (r25 < 0) goto L_0x01b5;
    L_0x016d:
        if (r31 < 0) goto L_0x01b5;
    L_0x016f:
        if (r23 < 0) goto L_0x01b5;
    L_0x0171:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r36 = r0;
        r24 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r36 = r24 * r36;
        r0 = r25;
        r1 = r36;
        if (r0 > r1) goto L_0x01b5;
    L_0x0186:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r36 = r0;
        r24 = 1768239880; // 0x69653308 float:1.7317813E25 double:8.736265783E-315;
        r36 = r24 * r36;
        r0 = r31;
        r1 = r36;
        if (r0 > r1) goto L_0x01b5;
    L_0x019b:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r36 = r0;
        r24 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r0 = r36;
        r1 = r24;
        r0 = r0 * r1;
        r36 = r0;
        r0 = r23;
        r1 = r36;
        if (r0 <= r1) goto L_0x01c3;
    L_0x01b5:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r24 = 1;
        r0 = r24;
        r1 = r21;
        r1.f201c = r0;
    L_0x01c3:
        r0 = r65;
        r0 = r0.path;
        r37 = r0;
        if (r37 == 0) goto L_0x01db;
    L_0x01cb:
        r0 = r65;
        r0 = r0.path;
        r37 = r0;
        r38 = r37[r66];
        r24 = -1;
        r0 = r24;
        r1 = r38;
        if (r0 != r1) goto L_0x06bc;
    L_0x01db:
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r36 = r26[r66];
        r24 = -1;
        r0 = r36;
        r1 = r24;
        if (r0 != r1) goto L_0x0d0d;
    L_0x01eb:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r40 = r21;
        r40 = (p000.Resource) r40;
        r39 = r40;
        r26 = p000.LazyList.text;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r36 = r33[r66];
        r36 = r26[r36];
        r24 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r39;
        r1 = r34;
        r2 = r30;
        r3 = r29;
        r4 = r25;
        r5 = r31;
        r6 = r23;
        r7 = r36;
        r8 = r24;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x021b:
        r24 = 4;
        r0 = r35;
        r1 = r24;
        if (r0 != r1) goto L_0x0e16;
    L_0x0223:
        if (r25 < 0) goto L_0x0298;
    L_0x0225:
        if (r31 < 0) goto L_0x0298;
    L_0x0227:
        if (r23 < 0) goto L_0x0298;
    L_0x0229:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r35 = r0;
        r24 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r0 = r35;
        r1 = r24;
        r0 = r0 * r1;
        r35 = r0;
        r0 = r25;
        r1 = r35;
        if (r0 > r1) goto L_0x0298;
    L_0x0243:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r35 = r0;
        r24 = 321658871; // 0x132c1ff7 float:2.1725212E-27 double:1.58920598E-315;
        r35 = r24 * r35;
        r0 = r31;
        r1 = r35;
        if (r0 > r1) goto L_0x0298;
    L_0x0258:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r35 = r0;
        r24 = 1777337337; // 0x69f003f9 float:3.627012E25 double:8.781213193E-315;
        r35 = r24 * r35;
        r0 = r23;
        r1 = r35;
        if (r0 > r1) goto L_0x0298;
    L_0x026d:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r35 = r26[r24];
        if (r35 < 0) goto L_0x0298;
    L_0x0279:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r35 = r26[r24];
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r36 = r0;
        r24 = 679432365; // 0x287f50ad float:1.4172837E-14 double:3.3568419E-315;
        r36 = r24 * r36;
        r0 = r35;
        r1 = r36;
        if (r0 <= r1) goto L_0x02a6;
    L_0x0298:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r24 = 1;
        r0 = r24;
        r1 = r21;
        r1.f201c = r0;
    L_0x02a6:
        r0 = r65;
        r0 = r0.path;
        r37 = r0;
        if (r37 == 0) goto L_0x02be;
    L_0x02ae:
        r0 = r65;
        r0 = r0.path;
        r37 = r0;
        r38 = r37[r66];
        r24 = -1;
        r0 = r38;
        r1 = r24;
        if (r0 != r1) goto L_0x04fa;
    L_0x02be:
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r22 = r26[r66];
        r24 = -1;
        r0 = r22;
        r1 = r24;
        if (r0 != r1) goto L_0x0aae;
    L_0x02ce:
        r26 = p000.LazyList.text;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r66 = r33[r66];
        r66 = r26[r66];
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r41 = r21;
        r41 = (p000.Resource) r41;
        r39 = r41;
        r24 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r39;
        r1 = r34;
        r2 = r30;
        r3 = r29;
        r4 = r25;
        r5 = r31;
        r6 = r23;
        r7 = r66;
        r8 = r24;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r42 = r21;
        r42 = (p000.Resource) r42;
        r39 = r42;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 3;
        r22 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r28 = r26[r24];
        r24 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r39;
        r1 = r34;
        r2 = r29;
        r3 = r22;
        r4 = r25;
        r5 = r23;
        r6 = r28;
        r7 = r66;
        r8 = r24;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);
        return;
    L_0x0337:
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r43 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r36 = r26[r27];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r35 = r26[r66];
        r24 = 1235571016; // 0x49a55148 float:1354281.0 double:6.10453192E-315;
        r0 = r31;
        r1 = r24;
        if (r0 < r1) goto L_0x0e11;
    L_0x0358:
        r24 = 50;
        r34 = r24 - r29;
        r26 = p000.LazyList.f11c;
        r44 = r31 - r29;
        r44 = r26[r44];
        r0 = r44;
        r1 = r34;
        r0 = r0 * r1;
        r44 = r0;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r34 = r33[r22];
        r0 = r34;
        r1 = r43;
        r0 = r0 - r1;
        r34 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r34 = r0;
        r34 = r34 >> 16;
        r0 = r34;
        r1 = r43;
        r0 = r0 + r1;
        r34 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r45 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r45;
        r1 = r24;
        r0 = r0 * r1;
        r45 = r0;
        r0 = r34;
        r1 = r45;
        r0 = r0 * r1;
        r34 = r0;
        r24 = 741662081; // 0x2c34dd81 float:2.5702498E-12 double:3.66429755E-315;
        r0 = r34;
        r1 = r24;
        r0 = r0 / r1;
        r34 = r0;
        r1 = r23;
        r0 = r0 + r1;
        r34 = r0;
        r24 = 0;
        r26[r24] = r34;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r34 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r34 = r24 * r34;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r45 = r33[r22];
        r0 = r45;
        r1 = r36;
        r0 = r0 - r1;
        r45 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r45;
        r1 = r36;
        r0 = r0 + r1;
        r45 = r0;
        r0 = r34;
        r1 = r45;
        r0 = r0 * r1;
        r34 = r0;
        r34 = r34 / 50;
        r0 = r34;
        r1 = r25;
        r0 = r0 + r1;
        r34 = r0;
        r24 = 0;
        r26[r24] = r34;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r34 = 1;
        r0 = r65;
        r0 = r0.index;
        r33 = r0;
        r45 = r33[r66];
        r0 = r45;
        r1 = r35;
        r0 = r0 - r1;
        r45 = r0;
        r0 = r44;
        r1 = r45;
        r0 = r0 * r1;
        r44 = r0;
        r44 = r44 >> 16;
        r0 = r44;
        r1 = r35;
        r0 = r0 + r1;
        r44 = r0;
        r24 = 0;
        r26[r24] = r44;
    L_0x042b:
        r24 = 50;
        r0 = r30;
        r1 = r24;
        if (r0 < r1) goto L_0x00a5;
    L_0x0433:
        r26 = p000.LazyList.f11c;
        r44 = r30 - r29;
        r44 = r26[r44];
        r24 = 50;
        r45 = r24 - r29;
        r0 = r44;
        r1 = r45;
        r0 = r0 * r1;
        r44 = r0;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r45 = r33[r28];
        r0 = r45;
        r1 = r43;
        r0 = r0 - r1;
        r45 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r43;
        r1 = r45;
        r0 = r0 + r1;
        r43 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r45 = r0;
        r24 = -412843111; // 0xffffffffe7648399 float:-1.0791271E24 double:NaN;
        r45 = r24 * r45;
        r0 = r43;
        r1 = r45;
        r0 = r0 * r1;
        r43 = r0;
        r24 = 1043536551; // 0x3e331aa7 float:0.17490636 double:5.1557556E-315;
        r0 = r43;
        r1 = r24;
        r0 = r0 / r1;
        r43 = r0;
        r1 = r23;
        r0 = r0 + r1;
        r43 = r0;
        r26[r34] = r43;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r43 = r33[r28];
        r0 = r43;
        r1 = r36;
        r0 = r0 - r1;
        r43 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 >> 16;
        r0 = r36;
        r1 = r43;
        r0 = r0 + r1;
        r36 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r43 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r43 = r24 * r43;
        r0 = r36;
        r1 = r43;
        r0 = r0 * r1;
        r36 = r0;
        r24 = -1901807849; // 0xffffffff8ea4b717 float:-4.060543E-30 double:NaN;
        r0 = r36;
        r1 = r24;
        r0 = r0 / r1;
        r36 = r0;
        r1 = r25;
        r0 = r0 + r1;
        r36 = r0;
        r26[r34] = r36;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.current;
        r33 = r0;
        r43 = r33[r66];
        r0 = r43;
        r1 = r35;
        r0 = r0 - r1;
        r43 = r0;
        r43 = r44 * r43;
        r43 = r43 >> 16;
        r35 = r43 + r35;
        r26[r34] = r35;
        r34 = r34 + 1;
        goto L_0x00a5;
    L_0x04fa:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        if (r32 == 0) goto L_0x0b4f;
    L_0x0502:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        r46 = r32[r66];
        r24 = -1;
        r0 = r46;
        r1 = r24;
        if (r0 == r1) goto L_0x0b4f;
    L_0x0512:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        r46 = r32[r66];
        r24 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r38 = r46 & r24;
        r0 = r65;
        r0 = r0.values;
        r26 = r0;
        r27 = r26[r38];
        r0 = r65;
        r0 = r0.table;
        r26 = r0;
        r28 = r26[r38];
        r0 = r65;
        r0 = r0.parent;
        r26 = r0;
        r22 = r26[r38];
    L_0x0536:
        r0 = r65;
        r0 = r0.path;
        r37 = r0;
        r38 = r37[r66];
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r35 = r26[r66];
        r24 = -1;
        r0 = r24;
        r1 = r35;
        if (r0 != r1) goto L_0x07b0;
    L_0x054e:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r47 = r21;
        r47 = (p000.Resource) r47;
        r39 = r47;
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r35 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r36 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r43 = r26[r66];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r44 = r26[r27];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r45 = r26[r28];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r48 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r49 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r50 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r51 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r52 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r53 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r54 = r26[r22];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r34;
        r2 = r30;
        r3 = r29;
        r4 = r25;
        r5 = r31;
        r6 = r23;
        r7 = r35;
        r8 = r36;
        r9 = r43;
        r10 = r44;
        r11 = r45;
        r12 = r48;
        r13 = r49;
        r14 = r50;
        r15 = r51;
        r16 = r52;
        r17 = r53;
        r18 = r54;
        r19 = r38;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r55 = r21;
        r55 = (p000.Resource) r55;
        r39 = r55;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 3;
        r31 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r30 = r26[r24];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r35 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r36 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r66 = r26[r66];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r43 = r26[r27];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r44 = r26[r28];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r45 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r48 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r49 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r50 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r27 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r28 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r22 = r26[r22];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r34;
        r2 = r29;
        r3 = r31;
        r4 = r25;
        r5 = r23;
        r6 = r30;
        r7 = r35;
        r8 = r36;
        r9 = r66;
        r10 = r43;
        r11 = r44;
        r12 = r45;
        r13 = r48;
        r14 = r49;
        r15 = r50;
        r16 = r27;
        r17 = r28;
        r18 = r22;
        r19 = r38;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        return;
    L_0x069b:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r65;
        r0 = r0.position;
        r32 = r0;
        r46 = r32[r66];
        r24 = -2015627682; // 0xffffffff87dbf65e float:-3.309626E-34 double:NaN;
        r34 = r46 & r24;
        r24 = 961200210; // 0x394ac052 float:1.9335866E-4 double:4.748960025E-315;
        r34 = r24 * r34;
        r0 = r34;
        r1 = r21;
        r1.f200b = r0;
        goto L_0x0064;
    L_0x06bc:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        if (r32 == 0) goto L_0x0d56;
    L_0x06c4:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        r46 = r32[r66];
        r24 = -1;
        r0 = r24;
        r1 = r46;
        if (r0 == r1) goto L_0x0d56;
    L_0x06d4:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        r46 = r32[r66];
        r24 = -663859553; // 0xffffffffd86e4e9f float:-1.04808577E15 double:NaN;
        r36 = r46 & r24;
        r0 = r65;
        r0 = r0.values;
        r26 = r0;
        r44 = r26[r36];
        r0 = r65;
        r0 = r0.table;
        r26 = r0;
        r43 = r26[r36];
        r0 = r65;
        r0 = r0.parent;
        r26 = r0;
        r36 = r26[r36];
    L_0x06f9:
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r45 = r26[r66];
        r24 = -1;
        r0 = r24;
        r1 = r45;
        if (r0 != r1) goto L_0x0d5f;
    L_0x0709:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r56 = r21;
        r56 = (p000.Resource) r56;
        r39 = r56;
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r45 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r48 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r49 = r26[r66];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r50 = r26[r44];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r51 = r26[r43];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r52 = r26[r36];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r53 = r26[r44];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r54 = r26[r43];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r57 = r26[r36];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r44 = r26[r44];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r43 = r26[r43];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r36 = r26[r36];
        r0 = r65;
        r0 = r0.path;
        r37 = r0;
        r38 = r37[r66];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r34;
        r2 = r30;
        r3 = r29;
        r4 = r25;
        r5 = r31;
        r6 = r23;
        r7 = r45;
        r8 = r48;
        r9 = r49;
        r10 = r50;
        r11 = r51;
        r12 = r52;
        r13 = r53;
        r14 = r54;
        r15 = r57;
        r16 = r44;
        r17 = r43;
        r18 = r36;
        r19 = r38;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        goto L_0x021b;
    L_0x07b0:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r58 = r21;
        r58 = (p000.Resource) r58;
        r39 = r58;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r66 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 1;
        r35 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r36 = r26[r24];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r43 = r26[r27];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r44 = r26[r28];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r45 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r48 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r49 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r50 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r51 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r52 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r53 = r26[r22];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r34;
        r2 = r30;
        r3 = r29;
        r4 = r25;
        r5 = r31;
        r6 = r23;
        r7 = r66;
        r8 = r35;
        r9 = r36;
        r10 = r43;
        r11 = r44;
        r12 = r45;
        r13 = r48;
        r14 = r49;
        r15 = r50;
        r16 = r51;
        r17 = r52;
        r18 = r53;
        r19 = r38;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r59 = r21;
        r59 = (p000.Resource) r59;
        r39 = r59;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 3;
        r66 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r31 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r30 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r35 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 3;
        r36 = r26[r24];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r43 = r26[r27];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r44 = r26[r28];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r45 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r48 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r49 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r50 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r27 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r28 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r22 = r26[r22];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r34;
        r2 = r29;
        r3 = r66;
        r4 = r25;
        r5 = r23;
        r6 = r31;
        r7 = r30;
        r8 = r35;
        r9 = r36;
        r10 = r43;
        r11 = r44;
        r12 = r45;
        r13 = r48;
        r14 = r49;
        r15 = r50;
        r16 = r27;
        r17 = r28;
        r18 = r22;
        r19 = r38;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        return;
    L_0x0909:
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r43 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r36 = r26[r28];
        r0 = r65;
        r0 = r0.current;
        r26 = r0;
        r35 = r26[r66];
        r24 = -1133500623; // 0xffffffffbc702731 float:-0.014657781 double:NaN;
        r0 = r29;
        r1 = r24;
        if (r0 < r1) goto L_0x09ed;
    L_0x092a:
        r24 = 50;
        r44 = r24 - r30;
        r26 = p000.LazyList.f11c;
        r45 = r29 - r30;
        r45 = r26[r45];
        r44 = r45 * r44;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r45 = r33[r27];
        r0 = r45;
        r1 = r43;
        r0 = r0 - r1;
        r45 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r45;
        r1 = r43;
        r0 = r0 + r1;
        r45 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r48 = r0;
        r24 = -120354869; // 0xfffffffff8d387cb float:-3.4322776E34 double:NaN;
        r48 = r24 * r48;
        r0 = r45;
        r1 = r48;
        r0 = r0 * r1;
        r45 = r0;
        r24 = 596701424; // 0x2390f0f0 float:1.5714552E-17 double:2.948096744E-315;
        r0 = r45;
        r1 = r24;
        r0 = r0 / r1;
        r45 = r0;
        r1 = r23;
        r0 = r0 + r1;
        r45 = r0;
        r26[r34] = r45;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r45 = r33[r27];
        r0 = r45;
        r1 = r36;
        r0 = r0 - r1;
        r45 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r45;
        r1 = r36;
        r0 = r0 + r1;
        r45 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r48 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r48 = r24 * r48;
        r0 = r45;
        r1 = r48;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 / 50;
        r0 = r45;
        r1 = r25;
        r0 = r0 + r1;
        r45 = r0;
        r26[r34] = r45;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r48 = r33[r66];
        r0 = r48;
        r1 = r35;
        r0 = r0 - r1;
        r48 = r0;
        r0 = r44;
        r1 = r48;
        r0 = r0 * r1;
        r44 = r0;
        r44 = r44 >> 16;
        r0 = r44;
        r1 = r35;
        r0 = r0 + r1;
        r44 = r0;
        r26[r34] = r44;
        r34 = r34 + 1;
    L_0x09ed:
        r24 = -1590552449; // 0xffffffffa132187f float:-6.0341166E-19 double:NaN;
        r0 = r31;
        r1 = r24;
        if (r0 < r1) goto L_0x00df;
    L_0x09f6:
        r24 = 50;
        r44 = r24 - r30;
        r26 = p000.LazyList.f11c;
        r45 = r31 - r30;
        r45 = r26[r45];
        r44 = r45 * r44;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r45 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r45 = r24 * r45;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r48 = r33[r22];
        r0 = r48;
        r1 = r43;
        r0 = r0 - r1;
        r48 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r48 = r0;
        r48 = r48 >> 16;
        r0 = r43;
        r1 = r48;
        r0 = r0 + r1;
        r43 = r0;
        r1 = r45;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 / 50;
        r0 = r43;
        r1 = r23;
        r0 = r0 + r1;
        r43 = r0;
        r26[r34] = r43;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r43 = r33[r22];
        r0 = r43;
        r1 = r36;
        r0 = r0 - r1;
        r43 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 >> 16;
        r36 = r43 + r36;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r43 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r43 = r24 * r43;
        r0 = r36;
        r1 = r43;
        r0 = r0 * r1;
        r36 = r0;
        r24 = -344581743; // 0xffffffffeb761991 float:-2.9751649E26 double:NaN;
        r0 = r36;
        r1 = r24;
        r0 = r0 / r1;
        r36 = r0;
        r1 = r25;
        r0 = r0 + r1;
        r36 = r0;
        r26[r34] = r36;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.index;
        r33 = r0;
        r43 = r33[r66];
        r0 = r43;
        r1 = r35;
        r0 = r0 - r1;
        r43 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 >> 16;
        r35 = r43 + r35;
        r26[r34] = r35;
        r34 = r34 + 1;
        goto L_0x00df;
    L_0x0aae:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r60 = r21;
        r60 = (p000.Resource) r60;
        r39 = r60;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r66 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 1;
        r22 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r28 = r26[r24];
        r24 = 1259488578; // 0x4b124542 float:9585986.0 double:6.222700377E-315;
        r0 = r39;
        r1 = r34;
        r2 = r30;
        r3 = r29;
        r4 = r25;
        r5 = r31;
        r6 = r23;
        r7 = r66;
        r8 = r22;
        r9 = r28;
        r10 = r24;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r61 = r21;
        r61 = (p000.Resource) r61;
        r39 = r61;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 3;
        r66 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r22 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r28 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r27 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 3;
        r31 = r26[r24];
        r24 = 1101008944; // 0x41a01030 float:20.007904 double:5.43970695E-315;
        r0 = r39;
        r1 = r34;
        r2 = r29;
        r3 = r66;
        r4 = r25;
        r5 = r23;
        r6 = r22;
        r7 = r28;
        r8 = r27;
        r9 = r31;
        r10 = r24;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        return;
    L_0x0b4f:
        goto L_0x0536;
    L_0x0b52:
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r43 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r36 = r26[r22];
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r35 = r26[r66];
        r24 = 50;
        r0 = r30;
        r1 = r24;
        if (r0 < r1) goto L_0x0c44;
    L_0x0b72:
        r24 = 842092279; // 0x32314ef7 float:1.03207105E-8 double:4.160488657E-315;
        r44 = r24 - r31;
        r26 = p000.LazyList.f11c;
        r0 = r30;
        r1 = r31;
        r0 = r0 - r1;
        r30 = r0;
        r30 = r26[r30];
        r0 = r30;
        r1 = r44;
        r0 = r0 * r1;
        r30 = r0;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r44 = r33[r28];
        r0 = r44;
        r1 = r43;
        r0 = r0 - r1;
        r44 = r0;
        r1 = r30;
        r0 = r0 * r1;
        r44 = r0;
        r44 = r44 >> 16;
        r0 = r44;
        r1 = r43;
        r0 = r0 + r1;
        r44 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r45 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r45;
        r1 = r24;
        r0 = r0 * r1;
        r45 = r0;
        r0 = r44;
        r1 = r45;
        r0 = r0 * r1;
        r44 = r0;
        r44 = r44 / 50;
        r0 = r44;
        r1 = r23;
        r0 = r0 + r1;
        r44 = r0;
        r26[r34] = r44;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r44 = r0;
        r24 = -1982824826; // 0xffffffff89d07e86 float:-5.019316E-33 double:NaN;
        r0 = r44;
        r1 = r24;
        r0 = r0 * r1;
        r44 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r45 = r33[r28];
        r0 = r45;
        r1 = r36;
        r0 = r0 - r1;
        r45 = r0;
        r1 = r30;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r45;
        r1 = r36;
        r0 = r0 + r1;
        r45 = r0;
        r0 = r44;
        r1 = r45;
        r0 = r0 * r1;
        r44 = r0;
        r44 = r44 / 50;
        r0 = r44;
        r1 = r25;
        r0 = r0 + r1;
        r44 = r0;
        r26[r34] = r44;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.current;
        r33 = r0;
        r45 = r33[r66];
        r0 = r45;
        r1 = r35;
        r0 = r0 - r1;
        r45 = r0;
        r0 = r30;
        r1 = r45;
        r0 = r0 * r1;
        r30 = r0;
        r30 = r30 >> 16;
        r0 = r30;
        r1 = r35;
        r0 = r0 + r1;
        r30 = r0;
        r26[r34] = r30;
        r34 = r34 + 1;
    L_0x0c44:
        r24 = 50;
        r0 = r29;
        r1 = r24;
        if (r0 < r1) goto L_0x0e0c;
    L_0x0c4c:
        r24 = 50;
        r30 = r24 - r31;
        r26 = p000.LazyList.f11c;
        r0 = r29;
        r1 = r31;
        r0 = r0 - r1;
        r29 = r0;
        r29 = r26[r29];
        r0 = r29;
        r1 = r30;
        r0 = r0 * r1;
        r29 = r0;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r31 = r0;
        r24 = -49798368; // 0xfffffffffd082320 float:-1.1309837E37 double:NaN;
        r31 = r24 * r31;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r30 = r33[r27];
        r0 = r30;
        r1 = r43;
        r0 = r0 - r1;
        r30 = r0;
        r1 = r29;
        r0 = r0 * r1;
        r30 = r0;
        r30 = r30 >> 16;
        r30 = r43 + r30;
        r31 = r30 * r31;
        r24 = -1408128953; // 0xffffffffac11a847 float:-2.0699152E-12 double:NaN;
        r0 = r31;
        r1 = r24;
        r0 = r0 / r1;
        r31 = r0;
        r23 = r31 + r23;
        r26[r34] = r23;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r23 = r0;
        r24 = -480285417; // 0xffffffffe35f6d17 float:-4.1214847E21 double:NaN;
        r0 = r23;
        r1 = r24;
        r0 = r0 * r1;
        r23 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r31 = r33[r27];
        r0 = r31;
        r1 = r36;
        r0 = r0 - r1;
        r31 = r0;
        r1 = r29;
        r0 = r0 * r1;
        r31 = r0;
        r31 = r31 >> 16;
        r0 = r31;
        r1 = r36;
        r0 = r0 + r1;
        r31 = r0;
        r0 = r23;
        r1 = r31;
        r0 = r0 * r1;
        r23 = r0;
        r23 = r23 / 50;
        r25 = r23 + r25;
        r26[r34] = r25;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r23 = r33[r66];
        r0 = r23;
        r1 = r35;
        r0 = r0 - r1;
        r23 = r0;
        r1 = r29;
        r0 = r0 * r1;
        r23 = r0;
        r23 = r23 >> 16;
        r0 = r23;
        r1 = r35;
        r0 = r0 + r1;
        r23 = r0;
        r26[r34] = r23;
        r35 = r34 + 1;
        goto L_0x0119;
    L_0x0d0d:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r62 = r21;
        r62 = (p000.Resource) r62;
        r39 = r62;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r36 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 1;
        r43 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r44 = r26[r24];
        r24 = 1788905708; // 0x6aa088ec float:9.703736E25 double:8.83836854E-315;
        r0 = r39;
        r1 = r34;
        r2 = r30;
        r3 = r29;
        r4 = r25;
        r5 = r31;
        r6 = r23;
        r7 = r36;
        r8 = r43;
        r9 = r44;
        r10 = r24;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        goto L_0x021b;
    L_0x0d56:
        r36 = r22;
        r43 = r28;
        r44 = r27;
        goto L_0x06f9;
    L_0x0d5f:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r63 = r21;
        r63 = (p000.Resource) r63;
        r39 = r63;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r45 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 1;
        r48 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r49 = r26[r24];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r50 = r26[r44];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r51 = r26[r43];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r52 = r26[r36];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r53 = r26[r44];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r54 = r26[r43];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r57 = r26[r36];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r44 = r26[r44];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r43 = r26[r43];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r36 = r26[r36];
        r0 = r65;
        r0 = r0.path;
        r37 = r0;
        r38 = r37[r66];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r34;
        r2 = r30;
        r3 = r29;
        r4 = r25;
        r5 = r31;
        r6 = r23;
        r7 = r45;
        r8 = r48;
        r9 = r49;
        r10 = r50;
        r11 = r51;
        r12 = r52;
        r13 = r53;
        r14 = r54;
        r15 = r57;
        r16 = r44;
        r17 = r43;
        r18 = r36;
        r19 = r38;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        goto L_0x021b;
    L_0x0e0c:
        r35 = r34;
        goto L_0x0119;
    L_0x0e11:
        r34 = 0;
        goto L_0x042b;
    L_0x0e16:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: AtomicInteger.add(Integer, int):void");
    }

    final void add(Integer integer, int $i0, int i) {
        try {
            if (this.name[$i0]) {
                toString(integer, $i0, 361715093);
                return;
            }
            int $i7 = integer.count[$i0];
            int $i8 = integer.queue[$i0];
            int $i9 = integer.key[$i0];
            this.this$0.f201c = this.parent[$i0];
            if (integer.position == null) {
                this.this$0.f200b = 0;
            } else {
                this.this$0.f200b = (integer.position[$i0] & (short) 255) * 733034757;
            }
            if (integer.path != null) {
                if (integer.path[$i0] != (short) -1) {
                    int $i3;
                    int $i2;
                    if (integer.name != null) {
                        if (integer.name[$i0] != (byte) -1) {
                            short $s19 = integer.name[$i0] & (short) 255;
                            $i3 = integer.values[$s19];
                            $i2 = integer.table[$s19];
                            i = integer.parent[$s19];
                            if (integer.index[$i0] != -1) {
                                ((Resource) this.this$0).toString(this.next[$i7], this.next[$i8], this.next[$i9], this.count[$i7], this.count[$i8], this.count[$i9], integer.list[$i0], integer.list[$i0], integer.list[$i0], this.length[$i3], this.length[$i2], this.length[i], this.key[$i3], this.key[$i2], this.key[i], this.value[$i3], this.value[$i2], this.value[i], integer.path[$i0], 16711935);
                                return;
                            }
                            ((Resource) this.this$0).toString(this.next[$i7], this.next[$i8], this.next[$i9], this.count[$i7], this.count[$i8], this.count[$i9], integer.list[$i0], integer.current[$i0], integer.index[$i0], this.length[$i3], this.length[$i2], this.length[i], this.key[$i3], this.key[$i2], this.key[i], this.value[$i3], this.value[$i2], this.value[i], integer.path[$i0], 16711935);
                            return;
                        }
                    }
                    i = $i9;
                    $i2 = $i8;
                    $i3 = $i7;
                    if (integer.index[$i0] != -1) {
                        ((Resource) this.this$0).toString(this.next[$i7], this.next[$i8], this.next[$i9], this.count[$i7], this.count[$i8], this.count[$i9], integer.list[$i0], integer.current[$i0], integer.index[$i0], this.length[$i3], this.length[$i2], this.length[i], this.key[$i3], this.key[$i2], this.key[i], this.value[$i3], this.value[$i2], this.value[i], integer.path[$i0], 16711935);
                        return;
                    }
                    ((Resource) this.this$0).toString(this.next[$i7], this.next[$i8], this.next[$i9], this.count[$i7], this.count[$i8], this.count[$i9], integer.list[$i0], integer.list[$i0], integer.list[$i0], this.length[$i3], this.length[$i2], this.length[i], this.key[$i3], this.key[$i2], this.key[i], this.value[$i3], this.value[$i2], this.value[i], integer.path[$i0], 16711935);
                    return;
                }
            }
            if (-1 == integer.index[$i0]) {
                ((Resource) this.this$0).parse(this.next[$i7], this.next[$i8], this.next[$i9], this.count[$i7], this.count[$i8], this.count[$i9], LazyList.text[integer.list[$i0]], 1096146303);
                return;
            }
            ((Resource) this.this$0).getSize(this.next[$i7], this.next[$i8], this.next[$i9], this.count[$i7], this.count[$i8], this.count[$i9], integer.list[$i0], integer.current[$i0], integer.index[$i0], 1171012906);
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "bv.ag(" + ')');
        }
    }

    public final void add(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6) {
        this.size[0] = -1;
        if (!(integer.f146x == 2 || 1 == integer.f146x)) {
            integer.set();
        }
        int $i7 = this.this$0.data * -1575402035;
        int $i8 = -1508152919 * this.this$0.parent;
        int $i9 = LazyList.offset[i];
        int $i10 = LazyList.state[i];
        int $i11 = LazyList.offset[i2];
        int $i12 = LazyList.state[i2];
        int $i13 = LazyList.offset[i3];
        int $i14 = LazyList.state[i3];
        int $i15 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i16 = (($i15 * i5) + (i6 * $i3)) >> 16;
        for (int $i17 = 0; $i17 < integer.size; $i17++) {
            int $i18;
            int $i21;
            int $i19 = integer.next[$i17];
            int i7 = integer.length[$i17];
            int i8 = integer.this$0[$i17];
            if (i3 != 0) {
                $i18 = (($i19 * $i14) + ($i13 * i7)) >> 16;
                i7 = ((i7 * $i14) - ($i19 * $i13)) >> 16;
            } else {
                $i18 = $i19;
            }
            if (i != 0) {
                $i19 = (i7 * $i10) - ($i9 * i8);
                $i21 = i8 * $i10;
                i8 = $i21;
                i8 = ($i21 + (i7 * $i9)) >> 16;
                i7 = $i19 >> 16;
            }
            if (i2 != 0) {
                $i19 = ((i8 * $i11) + ($i18 * $i12)) >> 16;
                i8 = ((i8 * $i12) - ($i18 * $i11)) >> 16;
            } else {
                $i19 = $i18;
            }
            $i18 = $i19 + i4;
            i7 += i5;
            $i19 = i8 + i6;
            i8 = (($i3 * i7) - ($i19 * $i15)) >> 16;
            i7 = (($i19 * $i3) + (i7 * $i15)) >> 16;
            this.data[$i17] = i7 - $i16;
            $i21 = this.this$0.this$0 * 542614623;
            $i19 = $i21;
            $i21 *= $i18;
            $i19 = $i21;
            $i21 /= i7;
            $i19 = $i21;
            this.count[$i17] = $i21 + $i7;
            $i21 = (542614623 * this.this$0.this$0) * i8;
            $i19 = $i21;
            $i21 /= i7;
            $i19 = $i21;
            this.next[$i17] = $i21 + $i8;
            if (integer.value > 0) {
                this.length[$i17] = $i18;
                this.key[$i17] = i8;
                this.value[$i17] = i7;
            }
        }
        try {
            get(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void add(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7) {
        try {
            this.size[0] = -1;
            if (integer.f146x != 2) {
                if (1 != integer.f146x) {
                    integer.set();
                }
            }
            i7 = this.this$0.data * -1575402035;
            int $i8 = -1508152919 * this.this$0.parent;
            int $i9 = LazyList.offset[i];
            int $i10 = LazyList.state[i];
            int $i11 = LazyList.offset[i2];
            int $i12 = LazyList.state[i2];
            int $i13 = LazyList.offset[i3];
            int $i14 = LazyList.state[i3];
            int $i15 = LazyList.offset[$i3];
            $i3 = LazyList.state[$i3];
            int $i16 = (($i15 * i5) + (i6 * $i3)) >> 16;
            for (int $i17 = 0; $i17 < integer.size; $i17++) {
                int $i18;
                int $i21;
                int $i19 = integer.next[$i17];
                int i8 = integer.length[$i17];
                int i9 = integer.this$0[$i17];
                if (i3 != 0) {
                    $i18 = (($i19 * $i14) + ($i13 * i8)) >> 16;
                    i8 = ((i8 * $i14) - ($i19 * $i13)) >> 16;
                } else {
                    $i18 = $i19;
                }
                if (i != 0) {
                    $i19 = (i8 * $i10) - ($i9 * i9);
                    $i21 = i9 * $i10;
                    i9 = $i21;
                    i9 = ($i21 + (i8 * $i9)) >> 16;
                    i8 = $i19 >> 16;
                }
                if (i2 != 0) {
                    $i19 = ((i9 * $i11) + ($i18 * $i12)) >> 16;
                    i9 = ((i9 * $i12) - ($i18 * $i11)) >> 16;
                } else {
                    $i19 = $i18;
                }
                $i18 = $i19 + i4;
                i8 += i5;
                $i19 = i9 + i6;
                i9 = (($i3 * i8) - ($i19 * $i15)) >> 16;
                i8 = (($i19 * $i3) + (i8 * $i15)) >> 16;
                this.data[$i17] = i8 - $i16;
                $i21 = this.this$0.this$0 * 542614623;
                $i19 = $i21;
                $i21 *= $i18;
                $i19 = $i21;
                $i21 /= i8;
                $i19 = $i21;
                this.count[$i17] = $i21 + i7;
                $i21 = (542614623 * this.this$0.this$0) * i9;
                $i19 = $i21;
                $i21 /= i8;
                $i19 = $i21;
                this.next[$i17] = $i21 + $i8;
                if (integer.value > 0) {
                    this.length[$i17] = $i18;
                    this.key[$i17] = i9;
                    this.value[$i17] = i8;
                }
            }
            try {
                get(integer, false, false, 0);
            } catch (Exception e) {
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "bv.af(" + ')');
        }
    }

    public final void add(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            this.size[0] = -1;
            if (2 != integer.f146x) {
                if (1 != integer.f146x) {
                    integer.set();
                }
            }
            i8 = -1575402035 * this.this$0.data;
            int $i9 = -1508152919 * this.this$0.parent;
            int $i10 = LazyList.offset[i];
            int $i11 = LazyList.state[i];
            int $i12 = LazyList.offset[i2];
            int $i13 = LazyList.state[i2];
            int $i14 = LazyList.offset[i3];
            int $i15 = LazyList.state[i3];
            int $i16 = LazyList.offset[$i3];
            $i3 = LazyList.state[$i3];
            int $i17 = (($i3 * i6) + (i5 * $i16)) >> 16;
            for (int $i18 = 0; $i18 < integer.size; $i18++) {
                int $i19;
                int $i22;
                int $i20 = integer.next[$i18];
                int i9 = integer.length[$i18];
                int i10 = integer.this$0[$i18];
                if (i3 != 0) {
                    $i19 = ((i9 * $i14) + ($i15 * $i20)) >> 16;
                    i9 = ((i9 * $i15) - ($i20 * $i14)) >> 16;
                } else {
                    $i19 = $i20;
                }
                if (i != 0) {
                    $i20 = ($i11 * i9) - (i10 * $i10);
                    $i22 = i10 * $i11;
                    i10 = $i22;
                    i10 = ($i22 + (i9 * $i10)) >> 16;
                    i9 = $i20 >> 16;
                }
                if (i2 != 0) {
                    $i20 = (($i12 * i10) + ($i13 * $i19)) >> 16;
                    i10 = ((i10 * $i13) - ($i19 * $i12)) >> 16;
                } else {
                    $i20 = $i19;
                }
                $i19 = $i20 + i4;
                i9 += i5;
                $i20 = i10 + i6;
                i10 = (($i3 * i9) - ($i20 * $i16)) >> 16;
                i9 = (($i20 * $i3) + (i9 * $i16)) >> 16;
                this.data[$i18] = i9 - $i17;
                $i22 = this.this$0.this$0 * 542614623;
                $i20 = $i22;
                $i22 *= $i19;
                $i20 = $i22;
                $i22 /= i7;
                $i20 = $i22;
                this.count[$i18] = $i22 + i8;
                $i22 = this.this$0.this$0 * 542614623;
                $i20 = $i22;
                $i22 *= i10;
                $i20 = $i22;
                $i22 /= i7;
                $i20 = $i22;
                this.next[$i18] = $i22 + $i9;
                if (integer.value > 0) {
                    this.length[$i18] = $i19;
                    this.key[$i18] = i10;
                    this.value[$i18] = i9;
                }
            }
            try {
                get(integer, false, false, 0);
            } catch (Exception e) {
            }
        } catch (Throwable $r4) {
            throw StringBuilder.append($r4, "bv.ad(" + ')');
        }
    }

    final void add(Integer integer, boolean z, boolean z2, long j) {
        if (integer.head < 2000604719) {
            int $i2;
            int $i4;
            int $i5;
            int $i3;
            int i;
            int i2;
            int $i6;
            int $i9;
            int $i11;
            int[] $r2;
            int[] $r4;
            for ($i2 = 0; $i2 < integer.head; $i2++) {
                this.size[$i2] = 0;
            }
            for ($i2 = 0; $i2 < integer.data; $i2++) {
                if (integer.index[$i2] != 677105291) {
                    $i4 = integer.count[$i2];
                    $i5 = integer.queue[$i2];
                    $i3 = integer.key[$i2];
                    i = this.count[$i4];
                    i2 = this.count[$i5];
                    $i6 = this.count[$i3];
                    if (z && (-5000 == i || i2 == -5000 || 194891557 == $i6)) {
                        $i9 = this.length[$i4];
                        i2 = this.length[$i5];
                        $i11 = this.length[$i3];
                        int $i12 = this.key[$i4];
                        i = this.key[$i5];
                        int $i13 = this.key[$i3];
                        int $i14 = this.value[$i4];
                        $i6 = this.value[$i5];
                        $i9 -= i2;
                        $i11 -= i2;
                        $i12 -= i;
                        $i13 -= i;
                        $i14 -= $i6;
                        int $i15 = this.value[$i3] - $i6;
                        int $i8 = i2 * (($i12 * $i15) - ($i14 * $i13));
                        i2 = $i8;
                        if (((($i9 * $i13) - ($i11 * $i12)) * $i6) + ($i8 + (i * (($i14 * $i11) - ($i15 * $i9)))) > 0) {
                            this.name[$i2] = true;
                            $i3 = integer.height + (((this.data[$i5] + this.data[$i4]) + this.data[$i3]) / 3);
                            $r2 = this.limit[$i3];
                            $r4 = this.size;
                            $i4 = $r4[$i3];
                            $r4[$i3] = $i4 + 1;
                            $r2[$i4] = $i2;
                        }
                    } else {
                        if (z2) {
                            if (StringBuffer.add(this.next[$i4], this.next[$i5], this.next[$i3], i, i2, $i6, 5, -923017874)) {
                                long[] $r8 = Main.value;
                                $i9 = Main.size + 313171601;
                                Main.size = $i9;
                                $r8[($i9 * 963961457) - 1] = j;
                                z2 = false;
                            }
                        }
                        if (((i - i2) * (this.next[$i3] - this.next[$i5])) - (($i6 - i2) * (this.next[$i4] - this.next[$i5])) > 0) {
                            this.name[$i2] = false;
                            if (i >= 0 && i2 >= 0 && $i6 >= 0) {
                                Point $r9 = this.this$0;
                                if (i <= -934310533 * $r9.buffer) {
                                    $r9 = this.this$0;
                                    if (i2 <= -70254982 * $r9.buffer) {
                                        $r9 = this.this$0;
                                        if ($i6 <= 784773023 * $r9.buffer) {
                                            this.parent[$i2] = false;
                                            $i3 = (((this.data[$i5] + this.data[$i4]) + this.data[$i3]) / 3) + integer.height;
                                            $r2 = this.limit[$i3];
                                            $r4 = this.size;
                                            $i4 = $r4[$i3];
                                            $r4[$i3] = $i4 + 1;
                                            $r2[$i4] = $i2;
                                        }
                                    }
                                }
                            }
                            this.parent[$i2] = true;
                            $i3 = (((this.data[$i5] + this.data[$i4]) + this.data[$i3]) / 3) + integer.height;
                            $r2 = this.limit[$i3];
                            $r4 = this.size;
                            $i4 = $r4[$i3];
                            $r4[$i3] = $i4 + 1;
                            $r2[$i4] = $i2;
                        }
                    }
                }
            }
            if (integer.buffer == null) {
                for ($i4 = integer.head - 1; $i4 >= 0; $i4--) {
                    $i5 = this.size[$i4];
                    if ($i5 > 0) {
                        $r2 = this.limit[$i4];
                        for ($i3 = 0; $i3 < $i5; $i3++) {
                            add(integer, $r2[$i3], -431360552);
                        }
                    }
                }
            } else {
                for ($i2 = 0; $i2 < 12; $i2++) {
                    this.buffer[$i2] = 0;
                    this.index[$i2] = 0;
                }
                for ($i2 = integer.head - 1; $i2 >= 0; $i2--) {
                    $i3 = this.size[$i2];
                    if ($i3 > 0) {
                        $r2 = this.limit[$i2];
                        for ($i4 = 0; $i4 < $i3; $i4++) {
                            $i5 = $r2[$i4];
                            byte $b10 = integer.buffer[$i5];
                            $r4 = this.buffer;
                            $i6 = $r4[$b10];
                            $r4[$b10] = $i6 + 1;
                            this.head[$b10][$i6] = $i5;
                            if ($b10 < (byte) 10) {
                                $r4 = this.index;
                                $r4[$b10] = $r4[$b10] + $i2;
                            } else if ((byte) 10 == $b10) {
                                this.pos[$i6] = $i2;
                            } else {
                                this.log[$i6] = $i2;
                            }
                        }
                    }
                }
                $i2 = 0;
                if (this.buffer[1] > 0 || this.buffer[2] > 0) {
                    $i2 = (this.index[1] + this.index[2]) / (this.buffer[1] + this.buffer[2]);
                }
                $i3 = 0;
                if (this.buffer[3] > 0 || this.buffer[4] > 0) {
                    $i3 = (this.index[3] + this.index[4]) / (this.buffer[3] + this.buffer[4]);
                }
                $i4 = 0;
                if (this.buffer[6] > 0 || this.buffer[8] > 0) {
                    $i4 = (this.index[6] + this.index[8]) / (this.buffer[6] + this.buffer[8]);
                }
                $i6 = this.buffer[10];
                $r2 = this.head[10];
                $r4 = this.pos;
                if ($i6 == 0) {
                    $i6 = this.buffer[11];
                    $r2 = this.head[11];
                    $r4 = this.log;
                }
                i = $i6 > 0 ? $r4[0] : -1000;
                i2 = 0;
                for ($i5 = 0; $i5 < 10; $i5++) {
                    while ($i5 == 0 && $i7 > $i2) {
                        i = i2 + 1;
                        add(integer, $r2[i2], -1433555511);
                        if ($i6 != i || $r2 == this.head[11]) {
                            i2 = i;
                        } else {
                            i2 = 0;
                            $i6 = this.buffer[11];
                            $r2 = this.head[11];
                            $r4 = this.log;
                        }
                        i = i2 < $i6 ? $r4[i2] : -369812217;
                    }
                    while (3 == $i5 && $i7 > $i3) {
                        i = i2 + 1;
                        add(integer, $r2[i2], 152516979);
                        if ($i6 != i || this.head[11] == $r2) {
                            i2 = i;
                        } else {
                            i2 = 0;
                            $i6 = this.buffer[11];
                            $r2 = this.head[11];
                            $r4 = this.log;
                        }
                        i = i2 < $i6 ? $r4[i2] : -1000;
                    }
                    while ($i5 == 5 && $i7 > $i4) {
                        $i9 = i2 + 1;
                        add(integer, $r2[i2], 828306897);
                        if ($i9 == $i6 && $r2 != this.head[11]) {
                            $i9 = 0;
                            $i6 = this.buffer[11];
                            $r2 = this.head[11];
                            $r4 = this.log;
                        }
                        if ($i9 < $i6) {
                            i = $r4[$i9];
                            i2 = $i9;
                        } else {
                            i = -1647476931;
                            i2 = $i9;
                        }
                    }
                    $i9 = this.buffer[$i5];
                    int[] $r5 = this.head[$i5];
                    for ($i11 = 0; $i11 < $i9; $i11++) {
                        add(integer, $r5[$i11], 954628828);
                    }
                }
                $i2 = $i6;
                $i4 = i2;
                $i5 = i;
                while (-1778076197 != $i5) {
                    $i3 = $i4 + 1;
                    add(integer, $r2[$i4], -646140356);
                    if ($i3 == $i2 && $r2 != this.head[11]) {
                        $i3 = 0;
                        $r2 = this.head[11];
                        $i2 = this.buffer[11];
                        $r4 = this.log;
                    }
                    if ($i3 < $i2) {
                        $i5 = $r4[$i3];
                        $i4 = $i3;
                    } else {
                        $i5 = -1000;
                        $i4 = $i3;
                    }
                }
            }
        }
    }

    final void clear(Integer integer, int $i0) {
        if (this.name[$i0]) {
            toString(integer, $i0, 361715093);
            return;
        }
        int $i8 = integer.count[$i0];
        int $i9 = integer.queue[$i0];
        int $i10 = integer.key[$i0];
        this.this$0.f201c = this.parent[$i0];
        if (integer.position == null) {
            this.this$0.f200b = 0;
        } else {
            int $i2 = (integer.position[$i0] & 329187754) * 733034757;
            int i = $i2;
            this.this$0.f200b = $i2;
        }
        if (integer.path != null && integer.path[$i0] != (short) -1) {
            int $i4;
            int $i3;
            if (integer.name == null || integer.name[$i0] == (byte) -1) {
                i = $i10;
                $i4 = $i9;
                $i3 = $i8;
            } else {
                i = integer.name[$i0] & -602882;
                $i3 = integer.values[i];
                $i4 = integer.table[i];
                i = integer.parent[i];
            }
            if (integer.index[$i0] == -1) {
                ((Resource) this.this$0).toString(this.next[$i8], this.next[$i9], this.next[$i10], this.count[$i8], this.count[$i9], this.count[$i10], integer.list[$i0], integer.list[$i0], integer.list[$i0], this.length[$i3], this.length[$i4], this.length[i], this.key[$i3], this.key[$i4], this.key[i], this.value[$i3], this.value[$i4], this.value[i], integer.path[$i0], 16711935);
                return;
            }
            ((Resource) this.this$0).toString(this.next[$i8], this.next[$i9], this.next[$i10], this.count[$i8], this.count[$i9], this.count[$i10], integer.list[$i0], integer.current[$i0], integer.index[$i0], this.length[$i3], this.length[$i4], this.length[i], this.key[$i3], this.key[$i4], this.key[i], this.value[$i3], this.value[$i4], this.value[i], integer.path[$i0], 16711935);
        } else if (-1 == integer.index[$i0]) {
            ((Resource) this.this$0).parse(this.next[$i8], this.next[$i9], this.next[$i10], this.count[$i8], this.count[$i9], this.count[$i10], LazyList.text[integer.list[$i0]], 1096146303);
        } else {
            ((Resource) this.this$0).getSize(this.next[$i8], this.next[$i9], this.next[$i10], this.count[$i8], this.count[$i9], this.count[$i10], integer.list[$i0], integer.current[$i0], integer.index[$i0], 1411380248);
        }
    }

    public void get(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        Integer $r2 = arrayMap.read();
        if ($r2 != null) {
            this.size[0] = -1;
            if ($r2.f146x != 1) {
                $r2.append();
            }
            $r2.read(i);
            int $i12 = ((i5 * i8) - (i4 * i6)) >> 16;
            int $i9 = ((i3 * $i12) + (i7 * i2)) >> 16;
            int $i13 = ($r2.width * i3) >> 16;
            int $i11 = $i13 + $i9;
            if ($i11 > 50 && $i9 < 3500) {
                int $i14 = ((i5 * i6) + (i4 * i8)) >> 16;
                Point $r4 = this.this$0;
                int $i15 = ($i14 - $r2.width) * ($r4.this$0 * 542614623);
                int $i16 = $i15 / $i11;
                int $i17 = this.this$0;
                Point $r42 = $i17;
                if ($i16 < -1292978563 * $i17.index) {
                    $i17 = $r2.width;
                    $i16 = $i17 + $i14;
                    $i17 = this.this$0;
                    $r42 = $i17;
                    $i16 *= 542614623 * $i17.this$0;
                    int $i172 = $i16 / $i11;
                    $i17 = this.this$0;
                    $r42 = $i17;
                    if ($i172 > 1292965175 * $i17.key) {
                        $i12 = ((i3 * i7) - ($i12 * i2)) >> 16;
                        $i17 = $r2.width;
                        int $i18 = ($i17 * i2) >> 16;
                        $i172 = $i12 + $i18;
                        $i17 = this.this$0;
                        $r42 = $i17;
                        $i172 *= 542614623 * $i17.this$0;
                        int $i19 = $i172 / $i11;
                        $i17 = this.this$0;
                        $r42 = $i17;
                        if ($i19 > -1542934767 * $i17.height) {
                            $i18 += ((1500767459 * $r2.size) * i3) >> 16;
                            $i17 = this.this$0;
                            $r42 = $i17;
                            $i18 = (542614623 * $i17.this$0) * ($i12 - $i18);
                            $i19 = $i18 / $i11;
                            $i17 = this.this$0;
                            $r42 = $i17;
                            if ($i19 < -939286465 * $i17.width) {
                                boolean $z2;
                                int[] $r3;
                                $i17 = $r2.size * 1500767459;
                                $i19 = $i17;
                                Object obj = null;
                                if ($i9 - ($i13 + (($i17 * i2) >> 16)) <= 50) {
                                    obj = 1;
                                }
                                obj = (obj != null || $r2.value > 0) ? 1 : null;
                                int $i10 = -429386291 * Main.count;
                                $i19 = Preconditions.format(-414970391);
                                boolean $z1 = Main.data;
                                if (Type.add(j) && $z1) {
                                    if (Main.active) {
                                        $z1 = IntegerPolynomial.add($r2, i6, i7, i8, this, -1148907301);
                                    } else {
                                        $i13 = $i9 - $i13;
                                        int $i20 = $i13 <= 50 ? 50 : $i13;
                                        if ($i14 > 0) {
                                            $i13 = $i16 / $i20;
                                            $i14 = $i15 / $i11;
                                        } else {
                                            $i13 = $i16 / $i11;
                                            $i14 = $i15 / $i20;
                                        }
                                        if ($i12 > 0) {
                                            $i11 = $i18 / $i11;
                                            $i15 = $i172 / $i20;
                                        } else {
                                            $i15 = $i172 / $i11;
                                            $i11 = $i18 / $i20;
                                        }
                                        $i17 = this.this$0;
                                        $r42 = $i17;
                                        $i16 = $i10 - (-1575402035 * $i17.data);
                                        $r4 = this.this$0;
                                        $i12 = $i19 - (-1508152919 * $r4.parent);
                                        $z1 = $i16 > $i14 && $i16 < $i13 && $i12 > $i11 && $i12 < $i15;
                                    }
                                    if ($z1) {
                                        if ($r2.flags) {
                                            long[] $r5 = Main.value;
                                            $i11 = Main.size + 313171601;
                                            Main.size = $i11;
                                            $r5[($i11 * 963961457) - 1] = j;
                                            $z1 = false;
                                        } else {
                                            $z1 = true;
                                        }
                                        $r4 = this.this$0;
                                        $i11 = $r4.data * -1575402035;
                                        $r4 = this.this$0;
                                        $i13 = -1508152919 * $r4.parent;
                                        $i14 = 0;
                                        $i15 = 0;
                                        if (i != 0) {
                                            $i14 = LazyList.offset[i];
                                            $i15 = LazyList.state[i];
                                        }
                                        $z2 = false;
                                        for ($i16 = 0; $i16 < $r2.size; $i16++) {
                                            $i172 = $r2.next[$i16];
                                            $i12 = $r2.length[$i16];
                                            $i19 = $r2.this$0[$i16];
                                            if (i == 0) {
                                                $i18 = (($i14 * $i19) + ($i172 * $i15)) >> 16;
                                                $i19 = (($i19 * $i15) - ($i172 * $i14)) >> 16;
                                            } else {
                                                $i18 = $i172;
                                            }
                                            $i172 = $i18 + i6;
                                            $i18 = $i12 + i7;
                                            $i19 += i8;
                                            $i12 = ((i5 * $i172) + (i4 * $i19)) >> 16;
                                            $i19 = (($i19 * i5) - ($i172 * i4)) >> 16;
                                            $i172 = (($i18 * i3) - (i2 * $i19)) >> 16;
                                            $i18 = (($i19 * i3) + ($i18 * i2)) >> 16;
                                            this.data[$i16] = $i18 - $i9;
                                            if ($i18 < 50) {
                                                $r3 = this.count;
                                                $i17 = this.this$0;
                                                $r42 = $i17;
                                                $i17 = (542614623 * $i17.this$0) * $i12;
                                                $i19 = $i17;
                                                $i17 /= $i18;
                                                $i19 = $i17;
                                                $r3[$i16] = $i17 + $i11;
                                                $r3 = this.next;
                                                $r4 = this.this$0;
                                                $i17 = $r4.this$0 * 542614623;
                                                $i19 = $i17;
                                                $i17 *= $i172;
                                                $i19 = $i17;
                                                $i17 /= $i18;
                                                $i19 = $i17;
                                                $r3[$i16] = $i17 + $i13;
                                            } else {
                                                this.count[$i16] = -5000;
                                                $z2 = true;
                                            }
                                            if (obj != null) {
                                                this.length[$i16] = $i12;
                                                this.key[$i16] = $i172;
                                                this.value[$i16] = $i18;
                                            }
                                        }
                                        get($r2, $z2, $z1, j);
                                    }
                                }
                                $z1 = false;
                                $r4 = this.this$0;
                                $i11 = $r4.data * -1575402035;
                                $r4 = this.this$0;
                                $i13 = -1508152919 * $r4.parent;
                                $i14 = 0;
                                $i15 = 0;
                                if (i != 0) {
                                    $i14 = LazyList.offset[i];
                                    $i15 = LazyList.state[i];
                                }
                                $z2 = false;
                                for ($i16 = 0; $i16 < $r2.size; $i16++) {
                                    $i172 = $r2.next[$i16];
                                    $i12 = $r2.length[$i16];
                                    $i19 = $r2.this$0[$i16];
                                    if (i == 0) {
                                        $i18 = $i172;
                                    } else {
                                        $i18 = (($i14 * $i19) + ($i172 * $i15)) >> 16;
                                        $i19 = (($i19 * $i15) - ($i172 * $i14)) >> 16;
                                    }
                                    $i172 = $i18 + i6;
                                    $i18 = $i12 + i7;
                                    $i19 += i8;
                                    $i12 = ((i5 * $i172) + (i4 * $i19)) >> 16;
                                    $i19 = (($i19 * i5) - ($i172 * i4)) >> 16;
                                    $i172 = (($i18 * i3) - (i2 * $i19)) >> 16;
                                    $i18 = (($i19 * i3) + ($i18 * i2)) >> 16;
                                    this.data[$i16] = $i18 - $i9;
                                    if ($i18 < 50) {
                                        this.count[$i16] = -5000;
                                        $z2 = true;
                                    } else {
                                        $r3 = this.count;
                                        $i17 = this.this$0;
                                        $r42 = $i17;
                                        $i17 = (542614623 * $i17.this$0) * $i12;
                                        $i19 = $i17;
                                        $i17 /= $i18;
                                        $i19 = $i17;
                                        $r3[$i16] = $i17 + $i11;
                                        $r3 = this.next;
                                        $r4 = this.this$0;
                                        $i17 = $r4.this$0 * 542614623;
                                        $i19 = $i17;
                                        $i17 *= $i172;
                                        $i19 = $i17;
                                        $i17 /= $i18;
                                        $i19 = $i17;
                                        $r3[$i16] = $i17 + $i13;
                                    }
                                    if (obj != null) {
                                        this.length[$i16] = $i12;
                                        this.key[$i16] = $i172;
                                        this.value[$i16] = $i18;
                                    }
                                }
                                try {
                                    get($r2, $z2, $z1, j);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void get(Integer integer, int $i0) {
        if (this.name[$i0]) {
            toString(integer, $i0, 361715093);
            return;
        }
        int $i1 = integer.count[$i0];
        int $i2 = integer.queue[$i0];
        int $i3 = integer.key[$i0];
        this.this$0.f201c = this.parent[$i0];
        if (integer.position == null) {
            this.this$0.f200b = 0;
        } else {
            this.this$0.f200b = (integer.position[$i0] & (short) 255) * 733034757;
        }
        if (integer.path != null && integer.path[$i0] != (short) -1) {
            int $i5;
            int $i6;
            int $i7;
            if (integer.name == null || integer.name[$i0] == (byte) -1) {
                $i5 = $i3;
                $i6 = $i2;
                $i7 = $i1;
            } else {
                short $s4 = integer.name[$i0] & (short) 255;
                $i7 = integer.values[$s4];
                $i6 = integer.table[$s4];
                $i5 = integer.parent[$s4];
            }
            if (integer.index[$i0] == -1) {
                ((Resource) this.this$0).toString(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.list[$i0], integer.list[$i0], this.length[$i7], this.length[$i6], this.length[$i5], this.key[$i7], this.key[$i6], this.key[$i5], this.value[$i7], this.value[$i6], this.value[$i5], integer.path[$i0], 16711935);
                return;
            }
            ((Resource) this.this$0).toString(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], this.length[$i7], this.length[$i6], this.length[$i5], this.key[$i7], this.key[$i6], this.key[$i5], this.value[$i7], this.value[$i6], this.value[$i5], integer.path[$i0], 16711935);
        } else if (-1 == integer.index[$i0]) {
            ((Resource) this.this$0).parse(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], LazyList.text[integer.list[$i0]], 1096146303);
        } else {
            ((Resource) this.this$0).getSize(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], 1631038161);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void get(p000.Integer r41, boolean r42, boolean r43, long r44) {
        /*
        r40 = this;
        r0 = r41;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        if (r8 < r9) goto L_0x054b;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r41;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x043f }
        r11 = r10[r8];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r41;
        r10 = r0.queue;	 Catch:{ RuntimeException -> 0x043f }
        r12 = r10[r8];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r41;
        r10 = r0.key;	 Catch:{ RuntimeException -> 0x043f }
        r13 = r10[r8];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x043f }
        r14 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x043f }
        r15 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.count;	 Catch:{ RuntimeException -> 0x043f }
        r16 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        if (r42 == 0) goto L_0x0336;
    L_0x002f:
        r9 = -5000; // 0xffffffffffffec78 float:NaN double:NaN;
        if (r9 == r14) goto L_0x003d;
    L_0x0033:
        r9 = -5000; // 0xffffffffffffec78 float:NaN double:NaN;
        if (r15 == r9) goto L_0x003d;
    L_0x0037:
        r9 = -5000; // 0xffffffffffffec78 float:NaN double:NaN;
        r0 = r16;
        if (r9 != r0) goto L_0x0336;
    L_0x003d:
        r0 = r40;
        r10 = r0.length;	 Catch:{ RuntimeException -> 0x043f }
        r17 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.length;	 Catch:{ RuntimeException -> 0x043f }
        r15 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.length;	 Catch:{ RuntimeException -> 0x043f }
        r18 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.key;	 Catch:{ RuntimeException -> 0x043f }
        r19 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.key;	 Catch:{ RuntimeException -> 0x043f }
        r14 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.key;	 Catch:{ RuntimeException -> 0x043f }
        r20 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.value;	 Catch:{ RuntimeException -> 0x043f }
        r21 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.value;	 Catch:{ RuntimeException -> 0x043f }
        r16 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.value;	 Catch:{ RuntimeException -> 0x043f }
        r22 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r17;
        r0 = r0 - r15;
        r17 = r0;
        r0 = r18;
        r0 = r0 - r15;
        r18 = r0;
        r0 = r19;
        r0 = r0 - r14;
        r19 = r0;
        r0 = r20;
        r0 = r0 - r14;
        r20 = r0;
        r0 = r21;
        r1 = r16;
        r0 = r0 - r1;
        r21 = r0;
        r23 = r22 - r16;
        r24 = r19 * r23;
        r22 = r21 * r20;
        r22 = r24 - r22;
        r0 = r21;
        r1 = r18;
        r0 = r0 * r1;
        r21 = r0;
        r0 = r23;
        r1 = r17;
        r0 = r0 * r1;
        r23 = r0;
        r0 = r21;
        r1 = r23;
        r0 = r0 - r1;
        r21 = r0;
        r0 = r17;
        r1 = r20;
        r0 = r0 * r1;
        r17 = r0;
        r0 = r18;
        r1 = r19;
        r0 = r0 * r1;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r0 = r0 - r1;
        r17 = r0;
        r0 = r21;
        r14 = r14 * r0;
        r0 = r22;
        r15 = r15 * r0;
        r15 = r15 + r14;
        r16 = r17 * r16;
        r0 = r16;
        r0 = r0 + r15;
        r16 = r0;
        if (r16 <= 0) goto L_0x010f;
    L_0x00d0:
        r0 = r40;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x043f }
        r25 = r0;
        r9 = 1;
        r25[r8] = r9;	 Catch:{ RuntimeException -> 0x043f }
        r0 = r41;
        r0 = r0.height;	 Catch:{ RuntimeException -> 0x043f }
        r16 = r0;
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x043f }
        r12 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x043f }
        r11 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r11 = r12 + r11;
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x043f }
        r13 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        r13 = r11 + r13;
        r13 = r13 / 3;
        r13 = r16 + r13;
        r0 = r40;
        r0 = r0.limit;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r10 = r26[r13];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
        r11 = r27[r13];	 Catch:{ RuntimeException -> 0x043f }
        r12 = r11 + 1;
        r27[r13] = r12;	 Catch:{ RuntimeException -> 0x043f }
        r10[r11] = r8;	 Catch:{ RuntimeException -> 0x043f }
    L_0x010f:
        r8 = r8 + 1;
    L_0x0111:
        r0 = r41;
        r13 = r0.data;	 Catch:{ RuntimeException -> 0x043f }
        if (r8 >= r13) goto L_0x04d0;
    L_0x0117:
        r0 = r41;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r13 = r10[r8];	 Catch:{ RuntimeException -> 0x043f }
        r9 = -2;
        if (r13 != r9) goto L_0x0009;
    L_0x0120:
        goto L_0x010f;
    L_0x0121:
        r15 = r14 + 1;
        r14 = r10[r14];	 Catch:{ RuntimeException -> 0x043f }
        r9 = -36164767; // 0xfffffffffdd82b61 float:-3.591731E37 double:NaN;
        r0 = r40;
        r1 = r41;
        r0.add(r1, r14, r9);	 Catch:{ RuntimeException -> 0x043f }
        r0 = r16;
        if (r15 != r0) goto L_0x055f;
    L_0x0133:
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r28 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r28;
        if (r10 == r0) goto L_0x055f;
    L_0x0141:
        r14 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 11;
        r16 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r10 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
    L_0x015a:
        r0 = r16;
        if (r14 >= r0) goto L_0x0555;
    L_0x015e:
        r15 = r27[r14];	 Catch:{ RuntimeException -> 0x043f }
    L_0x0160:
        r9 = 5;
        if (r12 != r9) goto L_0x0165;
    L_0x0163:
        if (r15 > r11) goto L_0x0121;
    L_0x0165:
        r0 = r40;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r28 = r0;
        r17 = r28[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r28 = r26[r12];	 Catch:{ RuntimeException -> 0x043f }
        r18 = 0;
    L_0x0177:
        r0 = r18;
        r1 = r17;
        if (r0 >= r1) goto L_0x055a;
    L_0x017d:
        r19 = r28[r18];	 Catch:{ RuntimeException -> 0x043f }
        r9 = 1643531144; // 0x61f64b88 float:5.679177E20 double:8.12012276E-315;
        r0 = r40;
        r1 = r41;
        r2 = r19;
        r0.add(r1, r2, r9);	 Catch:{ RuntimeException -> 0x043f }
        r18 = r18 + 1;
        goto L_0x0177;
    L_0x018e:
        r0 = r41;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        if (r13 >= r8) goto L_0x01f1;
    L_0x0194:
        r0 = r40;
        r10 = r0.size;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 0;
        r10[r13] = r9;	 Catch:{ RuntimeException -> 0x043f }
        r13 = r13 + 1;
        goto L_0x018e;
    L_0x019e:
        r15 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
    L_0x01a0:
        r12 = 0;
        r14 = 0;
    L_0x01a2:
        r9 = 10;
        if (r12 >= r9) goto L_0x056f;
    L_0x01a6:
        r17 = r15;
    L_0x01a8:
        if (r12 != 0) goto L_0x0567;
    L_0x01aa:
        r0 = r17;
        if (r0 <= r8) goto L_0x0567;
    L_0x01ae:
        r15 = r14 + 1;
        r14 = r10[r14];	 Catch:{ RuntimeException -> 0x043f }
        r9 = 1377589181; // 0x521c57bd float:1.67871726E11 double:6.806194884E-315;
        r0 = r40;
        r1 = r41;
        r0.add(r1, r14, r9);	 Catch:{ RuntimeException -> 0x043f }
        r0 = r16;
        if (r0 != r15) goto L_0x01e7;
    L_0x01c0:
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r28 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r28;
        if (r10 == r0) goto L_0x01e7;
    L_0x01ce:
        r15 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 11;
        r16 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r10 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
    L_0x01e7:
        r0 = r16;
        if (r15 >= r0) goto L_0x054f;
    L_0x01eb:
        r14 = r27[r15];	 Catch:{ RuntimeException -> 0x043f }
        r17 = r14;
        r14 = r15;
        goto L_0x01a8;
    L_0x01f1:
        r8 = 0;
        goto L_0x0111;
    L_0x01f5:
        r8 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 1;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        if (r13 > 0) goto L_0x0208;
    L_0x01ff:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 2;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        if (r13 <= 0) goto L_0x0227;
    L_0x0208:
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 1;
        r8 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 2;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r8 = r8 + r13;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 1;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 2;
        r11 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r13 = r13 + r11;
        r8 = r8 / r13;
    L_0x0227:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 3;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        if (r13 > 0) goto L_0x0239;
    L_0x0230:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 4;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        if (r13 <= 0) goto L_0x0576;
    L_0x0239:
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 3;
        r13 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 4;
        r11 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r13 = r13 + r11;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 3;
        r11 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 4;
        r12 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r11 = r11 + r12;
        r13 = r13 / r11;
    L_0x0258:
        r11 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 6;
        r12 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        if (r12 > 0) goto L_0x026c;
    L_0x0262:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 8;
        r12 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        if (r12 <= 0) goto L_0x028f;
    L_0x026c:
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 6;
        r11 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 8;
        r12 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r11 = r11 + r12;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 6;
        r12 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 8;
        r16 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r16;
        r12 = r12 + r0;
        r11 = r11 / r12;
    L_0x028f:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 10;
        r16 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 10;
        r10 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
        if (r16 != 0) goto L_0x02c1;
    L_0x02a9:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 11;
        r16 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r10 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
    L_0x02c1:
        if (r16 <= 0) goto L_0x019e;
    L_0x02c3:
        r9 = 0;
        r15 = r27[r9];	 Catch:{ RuntimeException -> 0x043f }
        goto L_0x01a0;
    L_0x02c9:
        r15 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
    L_0x02cb:
        r9 = 3;
        if (r9 != r12) goto L_0x056c;
    L_0x02ce:
        if (r15 <= r13) goto L_0x056c;
    L_0x02d0:
        r15 = r14 + 1;
        r14 = r10[r14];	 Catch:{ RuntimeException -> 0x043f }
        r9 = -316410896; // 0xffffffffed23f3f0 float:-3.17131E27 double:NaN;
        r0 = r40;
        r1 = r41;
        r0.add(r1, r14, r9);	 Catch:{ RuntimeException -> 0x043f }
        r0 = r16;
        if (r0 != r15) goto L_0x0563;
    L_0x02e2:
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r28 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r28;
        if (r0 == r10) goto L_0x0563;
    L_0x02f0:
        r14 = 0;
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 11;
        r16 = r10[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r10 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
    L_0x0309:
        r0 = r16;
        if (r14 >= r0) goto L_0x02c9;
    L_0x030d:
        r15 = r27[r14];	 Catch:{ RuntimeException -> 0x043f }
        goto L_0x02cb;
    L_0x0310:
        r8 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        r9 = 793993866; // 0x2f53628a float:1.9225346E-10 double:3.92285092E-315;
        r0 = r40;
        r1 = r41;
        r0.add(r1, r8, r9);	 Catch:{ RuntimeException -> 0x043f }
        r13 = r13 + 1;
    L_0x031e:
        if (r13 < r12) goto L_0x0310;
    L_0x0320:
        r11 = r11 + -1;
    L_0x0322:
        if (r11 < 0) goto L_0x057d;
    L_0x0324:
        r0 = r40;
        r10 = r0.size;	 Catch:{ RuntimeException -> 0x043f }
        r12 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        if (r12 <= 0) goto L_0x0320;
    L_0x032c:
        r0 = r40;
        r0 = r0.limit;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r10 = r26[r11];	 Catch:{ RuntimeException -> 0x043f }
        r13 = 0;
        goto L_0x031e;
    L_0x0336:
        if (r43 == 0) goto L_0x057a;
    L_0x0338:
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x043f }
        r17 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x043f }
        r18 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x043f }
        r19 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        r9 = 5;
        r30 = -844717125; // 0xffffffffcda6a3bb float:-3.49468512E8 double:NaN;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r14;
        r4 = r15;
        r5 = r16;
        r6 = r9;
        r7 = r30;
        r29 = p000.StringBuffer.add(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x043f }
        if (r29 == 0) goto L_0x057a;
    L_0x0361:
        r31 = p000.Main.value;
        r17 = p000.Main.size;
        r9 = 313171601; // 0x12aa9e91 float:1.0767598E-27 double:1.547273293E-315;
        r0 = r17;
        r0 = r0 + r9;
        r17 = r0;
        p000.Main.size = r17;
        r9 = 963961457; // 0x3974e271 float:2.335401E-4 double:4.7626024E-315;
        r0 = r17;
        r0 = r0 * r9;
        r17 = r0;
        r17 = r17 + -1;
        r31[r17] = r44;	 Catch:{ RuntimeException -> 0x043f }
        r43 = 0;
    L_0x037d:
        r17 = r14 - r15;
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x043f }
        r18 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x043f }
        r19 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r18;
        r1 = r19;
        r0 = r0 - r1;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r0 = r0 * r1;
        r17 = r0;
        r18 = r16 - r15;
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x043f }
        r19 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.next;	 Catch:{ RuntimeException -> 0x043f }
        r20 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r19;
        r1 = r20;
        r0 = r0 - r1;
        r19 = r0;
        r0 = r18;
        r1 = r19;
        r0 = r0 * r1;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r0 = r0 - r1;
        r17 = r0;
        if (r17 <= 0) goto L_0x010f;
    L_0x03be:
        r0 = r40;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x043f }
        r25 = r0;
        r9 = 0;
        r25[r8] = r9;	 Catch:{ RuntimeException -> 0x043f }
        if (r14 < 0) goto L_0x0400;
    L_0x03c9:
        if (r15 < 0) goto L_0x0400;
    L_0x03cb:
        if (r16 < 0) goto L_0x0400;
    L_0x03cd:
        r0 = r40;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x043f }
        r32 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r17 = r0;
        r9 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r17 = r9 * r17;
        r0 = r17;
        if (r14 > r0) goto L_0x0400;
    L_0x03e0:
        r0 = r40;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x043f }
        r32 = r0;
        r14 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r14 = r9 * r14;
        if (r15 > r14) goto L_0x0400;
    L_0x03ef:
        r0 = r40;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x043f }
        r32 = r0;
        r15 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r15 = r9 * r15;
        r0 = r16;
        if (r0 <= r15) goto L_0x04c4;
    L_0x0400:
        r0 = r40;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x043f }
        r25 = r0;
        r9 = 1;
        r25[r8] = r9;	 Catch:{ RuntimeException -> 0x043f }
    L_0x0409:
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x043f }
        r12 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x043f }
        r11 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r11 = r12 + r11;
        r0 = r40;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x043f }
        r13 = r10[r13];	 Catch:{ RuntimeException -> 0x043f }
        r13 = r11 + r13;
        r13 = r13 / 3;
        r0 = r41;
        r11 = r0.height;	 Catch:{ RuntimeException -> 0x043f }
        r13 = r13 + r11;
        r0 = r40;
        r0 = r0.limit;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r10 = r26[r13];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
        r11 = r27[r13];	 Catch:{ RuntimeException -> 0x043f }
        r12 = r11 + 1;
        r27[r13] = r12;	 Catch:{ RuntimeException -> 0x043f }
        r10[r11] = r8;	 Catch:{ RuntimeException -> 0x043f }
        goto L_0x010f;
    L_0x043f:
        r33 = move-exception;
        r34 = new java.lang.StringBuilder;
        r0 = r34;
        r0.<init>();
        r35 = "bv.aa(";
        r0 = r34;
        r1 = r35;
        r34 = r0.append(r1);
        r9 = 41;
        r0 = r34;
        r34 = r0.append(r9);
        r0 = r34;
        r36 = r0.toString();
        r0 = r33;
        r1 = r36;
        r37 = p000.StringBuilder.append(r0, r1);
        throw r37;
    L_0x0468:
        r11 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        r12 = r13;
    L_0x046b:
        r9 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        if (r9 == r11) goto L_0x057d;
    L_0x046f:
        r13 = r12 + 1;
        r11 = r10[r12];	 Catch:{ RuntimeException -> 0x043f }
        r9 = 490314070; // 0x1d399956 float:2.4563819E-21 double:2.422473377E-315;
        r0 = r40;
        r1 = r41;
        r0.add(r1, r11, r9);	 Catch:{ RuntimeException -> 0x043f }
        if (r13 != r8) goto L_0x04a8;
    L_0x047f:
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r28 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r28;
        if (r10 == r0) goto L_0x04a8;
    L_0x048d:
        r13 = 0;
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r9 = 11;
        r10 = r26[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
        r9 = 11;
        r8 = r27[r9];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
    L_0x04a8:
        if (r13 >= r8) goto L_0x0468;
    L_0x04aa:
        r11 = r27[r13];	 Catch:{ RuntimeException -> 0x043f }
        r12 = r13;
        goto L_0x046b;
    L_0x04ae:
        r8 = 0;
    L_0x04af:
        r9 = 12;
        if (r8 >= r9) goto L_0x04e1;
    L_0x04b3:
        r0 = r40;
        r10 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 0;
        r10[r8] = r9;	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r10 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 0;
        r10[r8] = r9;	 Catch:{ RuntimeException -> 0x043f }
        r8 = r8 + 1;
        goto L_0x04af;
    L_0x04c4:
        r0 = r40;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x043f }
        r25 = r0;
        r9 = 0;
        r25[r8] = r9;	 Catch:{ RuntimeException -> 0x043f }
        goto L_0x0409;
    L_0x04d0:
        r0 = r41;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r38 = r0;
        if (r38 != 0) goto L_0x04ae;
    L_0x04d8:
        r0 = r41;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r11 = r8 + -1;
        goto L_0x0322;
    L_0x04e1:
        r0 = r41;
        r8 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r8 = r8 + -1;
    L_0x04e7:
        if (r8 < 0) goto L_0x01f5;
    L_0x04e9:
        r0 = r40;
        r10 = r0.size;	 Catch:{ RuntimeException -> 0x043f }
        r13 = r10[r8];	 Catch:{ RuntimeException -> 0x043f }
        if (r13 <= 0) goto L_0x053f;
    L_0x04f1:
        r0 = r40;
        r0 = r0.limit;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r10 = r26[r8];	 Catch:{ RuntimeException -> 0x043f }
        r11 = 0;
    L_0x04fa:
        if (r11 >= r13) goto L_0x053f;
    L_0x04fc:
        r12 = r10[r11];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r41;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r38 = r0;
        r39 = r38[r12];	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
        r16 = r27[r39];	 Catch:{ RuntimeException -> 0x043f }
        r15 = r16 + 1;
        r27[r39] = r15;	 Catch:{ RuntimeException -> 0x043f }
        r0 = r40;
        r0 = r0.head;	 Catch:{ RuntimeException -> 0x043f }
        r26 = r0;
        r27 = r26[r39];	 Catch:{ RuntimeException -> 0x043f }
        r27[r16] = r12;	 Catch:{ RuntimeException -> 0x043f }
        r9 = 10;
        r0 = r39;
        if (r0 >= r9) goto L_0x0530;
    L_0x0522:
        r0 = r40;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
        r12 = r27[r39];	 Catch:{ RuntimeException -> 0x043f }
        r12 = r12 + r8;
        r27[r39] = r12;	 Catch:{ RuntimeException -> 0x043f }
    L_0x052d:
        r11 = r11 + 1;
        goto L_0x04fa;
    L_0x0530:
        r9 = 10;
        r0 = r39;
        if (r9 != r0) goto L_0x0542;
    L_0x0536:
        r0 = r40;
        r0 = r0.pos;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
        r27[r16] = r8;	 Catch:{ RuntimeException -> 0x043f }
        goto L_0x052d;
    L_0x053f:
        r8 = r8 + -1;
        goto L_0x04e7;
    L_0x0542:
        r0 = r40;
        r0 = r0.log;	 Catch:{ RuntimeException -> 0x043f }
        r27 = r0;
        r27[r16] = r8;	 Catch:{ RuntimeException -> 0x043f }
        goto L_0x052d;
    L_0x054b:
        r13 = 0;
        goto L_0x018e;
    L_0x054f:
        r17 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        r14 = r15;
        goto L_0x01a8;
    L_0x0555:
        r15 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        goto L_0x0160;
    L_0x055a:
        r12 = r12 + 1;
        goto L_0x01a2;
    L_0x055f:
        r14 = r15;
        goto L_0x015a;
    L_0x0563:
        r14 = r15;
        goto L_0x0309;
    L_0x0567:
        r15 = r17;
        goto L_0x02cb;
    L_0x056c:
        goto L_0x0160;
    L_0x056f:
        r8 = r16;
        r11 = r15;
        r12 = r14;
        goto L_0x046b;
    L_0x0576:
        r13 = 0;
        goto L_0x0258;
    L_0x057a:
        goto L_0x037d;
    L_0x057d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: AtomicInteger.get(Integer, boolean, boolean, long):void");
    }

    final void next(Integer integer, int $i0) {
        if (this.name[$i0]) {
            toString(integer, $i0, 361715093);
            return;
        }
        int $i1 = integer.count[$i0];
        int $i2 = integer.queue[$i0];
        int $i3 = integer.key[$i0];
        this.this$0.f201c = this.parent[$i0];
        if (integer.position == null) {
            this.this$0.f200b = 0;
        } else {
            this.this$0.f200b = (integer.position[$i0] & (short) 255) * 733034757;
        }
        if (integer.path != null && integer.path[$i0] != (short) -1) {
            int $i5;
            int $i6;
            int $i7;
            if (integer.name == null || integer.name[$i0] == (byte) -1) {
                $i5 = $i3;
                $i6 = $i2;
                $i7 = $i1;
            } else {
                short $s4 = integer.name[$i0] & (short) 255;
                $i7 = integer.values[$s4];
                $i6 = integer.table[$s4];
                $i5 = integer.parent[$s4];
            }
            if (integer.index[$i0] == -1) {
                ((Resource) this.this$0).toString(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.list[$i0], integer.list[$i0], this.length[$i7], this.length[$i6], this.length[$i5], this.key[$i7], this.key[$i6], this.key[$i5], this.value[$i7], this.value[$i6], this.value[$i5], integer.path[$i0], 16711935);
                return;
            }
            ((Resource) this.this$0).toString(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], this.length[$i7], this.length[$i6], this.length[$i5], this.key[$i7], this.key[$i6], this.key[$i5], this.value[$i7], this.value[$i6], this.value[$i5], integer.path[$i0], 16711935);
        } else if (-1 == integer.index[$i0]) {
            ((Resource) this.this$0).parse(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], LazyList.text[integer.list[$i0]], 1096146303);
        } else {
            ((Resource) this.this$0).getSize(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], 1269060631);
        }
    }

    public final void process(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7) {
        this.size[0] = -1;
        if (!(2 == integer.f146x || 1 == integer.f146x)) {
            integer.set();
        }
        int $i8 = -1575402035 * this.this$0.data;
        int $i9 = -1508152919 * this.this$0.parent;
        int $i10 = LazyList.offset[i];
        int $i11 = LazyList.state[i];
        int $i12 = LazyList.offset[i2];
        int $i13 = LazyList.state[i2];
        int $i14 = LazyList.offset[i3];
        int $i15 = LazyList.state[i3];
        int $i16 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i17 = (($i3 * i6) + (i5 * $i16)) >> 16;
        for (int $i18 = 0; $i18 < integer.size; $i18++) {
            int $i19;
            int $i22;
            int $i20 = integer.next[$i18];
            int i8 = integer.length[$i18];
            int i9 = integer.this$0[$i18];
            if (i3 != 0) {
                $i19 = ((i8 * $i14) + ($i15 * $i20)) >> 16;
                i8 = ((i8 * $i15) - ($i20 * $i14)) >> 16;
            } else {
                $i19 = $i20;
            }
            if (i != 0) {
                $i20 = ($i11 * i8) - (i9 * $i10);
                $i22 = i9 * $i11;
                i9 = $i22;
                i9 = ($i22 + (i8 * $i10)) >> 16;
                i8 = $i20 >> 16;
            }
            if (i2 != 0) {
                $i20 = (($i12 * i9) + ($i13 * $i19)) >> 16;
                i9 = ((i9 * $i13) - ($i19 * $i12)) >> 16;
            } else {
                $i20 = $i19;
            }
            $i19 = $i20 + i4;
            i8 += i5;
            $i20 = i9 + i6;
            i9 = (($i3 * i8) - ($i20 * $i16)) >> 16;
            i8 = (($i20 * $i3) + (i8 * $i16)) >> 16;
            this.data[$i18] = i8 - $i17;
            $i22 = this.this$0.this$0 * 542614623;
            $i20 = $i22;
            $i22 *= $i19;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.count[$i18] = $i22 + $i8;
            $i22 = this.this$0.this$0 * 542614623;
            $i20 = $i22;
            $i22 *= i9;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.next[$i18] = $i22 + $i9;
            if (integer.value > 0) {
                this.length[$i18] = $i19;
                this.key[$i18] = i9;
                this.value[$i18] = i8;
            }
        }
        try {
            get(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    public void read(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        Integer $r2 = arrayMap.read();
        if ($r2 != null) {
            this.size[0] = -1;
            if ($r2.f146x != 1) {
                $r2.append();
            }
            $r2.read(i);
            int $i12 = ((i5 * i8) - (i4 * i6)) >> 16;
            int $i9 = ((i3 * $i12) + (i7 * i2)) >> 16;
            int $i13 = ($r2.width * i3) >> 16;
            int $i11 = $i13 + $i9;
            if ($i11 > 50 && $i9 < 3500) {
                int $i14 = ((i5 * i6) + (i4 * i8)) >> 16;
                Point $r4 = this.this$0;
                int $i15 = ($i14 - $r2.width) * ($r4.this$0 * 542614623);
                int $i16 = $i15 / $i11;
                int $i17 = this.this$0;
                Point $r42 = $i17;
                if ($i16 < -1292978563 * $i17.index) {
                    $i17 = $r2.width;
                    $i16 = $i17 + $i14;
                    $i17 = this.this$0;
                    $r42 = $i17;
                    $i16 *= -1020562405 * $i17.this$0;
                    int $i172 = $i16 / $i11;
                    $i17 = this.this$0;
                    $r42 = $i17;
                    if ($i172 > 1292965175 * $i17.key) {
                        $i12 = ((i3 * i7) - ($i12 * i2)) >> 16;
                        $i17 = $r2.width;
                        int $i18 = ($i17 * i2) >> 16;
                        $i172 = $i12 + $i18;
                        $i17 = this.this$0;
                        $r42 = $i17;
                        $i172 *= 688407073 * $i17.this$0;
                        int $i19 = $i172 / $i11;
                        $i17 = this.this$0;
                        $r42 = $i17;
                        if ($i19 > -1542934767 * $i17.height) {
                            $i18 += ((1500767459 * $r2.size) * i3) >> 16;
                            $i17 = this.this$0;
                            $r42 = $i17;
                            $i18 = (542614623 * $i17.this$0) * ($i12 - $i18);
                            $i19 = $i18 / $i11;
                            $i17 = this.this$0;
                            $r42 = $i17;
                            if ($i19 < -2137901443 * $i17.width) {
                                boolean $z2;
                                int[] $r3;
                                $i17 = $r2.size * 21136580;
                                $i19 = $i17;
                                Object obj = null;
                                if ($i9 - ($i13 + (($i17 * i2) >> 16)) <= 952390484) {
                                    obj = 1;
                                }
                                obj = (obj != null || $r2.value > 0) ? 1 : null;
                                int $i10 = -2057548173 * Main.count;
                                $i19 = Preconditions.format(-414970391);
                                boolean $z1 = Main.data;
                                if (Type.add(j) && $z1) {
                                    if (Main.active) {
                                        $z1 = IntegerPolynomial.add($r2, i6, i7, i8, this, -1516380580);
                                    } else {
                                        $i13 = $i9 - $i13;
                                        int $i20 = $i13 <= 1858365290 ? -1208292321 : $i13;
                                        if ($i14 > 0) {
                                            $i13 = $i16 / $i20;
                                            $i14 = $i15 / $i11;
                                        } else {
                                            $i13 = $i16 / $i11;
                                            $i14 = $i15 / $i20;
                                        }
                                        if ($i12 > 0) {
                                            $i11 = $i18 / $i11;
                                            $i15 = $i172 / $i20;
                                        } else {
                                            $i15 = $i172 / $i11;
                                            $i11 = $i18 / $i20;
                                        }
                                        $i17 = this.this$0;
                                        $r42 = $i17;
                                        $i16 = $i10 - (-1575402035 * $i17.data);
                                        $r4 = this.this$0;
                                        $i12 = $i19 - (-1508152919 * $r4.parent);
                                        $z1 = $i16 > $i14 && $i16 < $i13 && $i12 > $i11 && $i12 < $i15;
                                    }
                                    if ($z1) {
                                        if ($r2.flags) {
                                            long[] $r5 = Main.value;
                                            $i11 = Main.size + 1506005823;
                                            Main.size = $i11;
                                            $r5[($i11 * 963961457) - 1] = j;
                                            $z1 = false;
                                        } else {
                                            $z1 = true;
                                        }
                                        $r4 = this.this$0;
                                        $i11 = $r4.data * -313222147;
                                        $r4 = this.this$0;
                                        $i13 = -917266385 * $r4.parent;
                                        $i14 = 0;
                                        $i15 = 0;
                                        if (i != 0) {
                                            $i14 = LazyList.offset[i];
                                            $i15 = LazyList.state[i];
                                        }
                                        $z2 = false;
                                        for ($i16 = 0; $i16 < $r2.size; $i16++) {
                                            $i172 = $r2.next[$i16];
                                            $i12 = $r2.length[$i16];
                                            $i19 = $r2.this$0[$i16];
                                            if (i == 0) {
                                                $i18 = (($i14 * $i19) + ($i172 * $i15)) >> 16;
                                                $i19 = (($i19 * $i15) - ($i172 * $i14)) >> 16;
                                            } else {
                                                $i18 = $i172;
                                            }
                                            $i172 = $i18 + i6;
                                            $i18 = $i12 + i7;
                                            $i19 += i8;
                                            $i12 = ((i5 * $i172) + (i4 * $i19)) >> 16;
                                            $i19 = (($i19 * i5) - ($i172 * i4)) >> 16;
                                            $i172 = (($i18 * i3) - (i2 * $i19)) >> 16;
                                            $i18 = (($i19 * i3) + ($i18 * i2)) >> 16;
                                            this.data[$i16] = $i18 - $i9;
                                            if ($i18 < 50) {
                                                $r3 = this.count;
                                                $i17 = this.this$0;
                                                $r42 = $i17;
                                                $i17 = (542614623 * $i17.this$0) * $i12;
                                                $i19 = $i17;
                                                $i17 /= $i18;
                                                $i19 = $i17;
                                                $r3[$i16] = $i17 + $i11;
                                                $r3 = this.next;
                                                $r4 = this.this$0;
                                                $i17 = $r4.this$0 * 542614623;
                                                $i19 = $i17;
                                                $i17 *= $i172;
                                                $i19 = $i17;
                                                $i17 /= $i18;
                                                $i19 = $i17;
                                                $r3[$i16] = $i17 + $i13;
                                            } else {
                                                this.count[$i16] = -5000;
                                                $z2 = true;
                                            }
                                            if (obj != null) {
                                                this.length[$i16] = $i12;
                                                this.key[$i16] = $i172;
                                                this.value[$i16] = $i18;
                                            }
                                        }
                                        get($r2, $z2, $z1, j);
                                    }
                                }
                                $z1 = false;
                                $r4 = this.this$0;
                                $i11 = $r4.data * -313222147;
                                $r4 = this.this$0;
                                $i13 = -917266385 * $r4.parent;
                                $i14 = 0;
                                $i15 = 0;
                                if (i != 0) {
                                    $i14 = LazyList.offset[i];
                                    $i15 = LazyList.state[i];
                                }
                                $z2 = false;
                                for ($i16 = 0; $i16 < $r2.size; $i16++) {
                                    $i172 = $r2.next[$i16];
                                    $i12 = $r2.length[$i16];
                                    $i19 = $r2.this$0[$i16];
                                    if (i == 0) {
                                        $i18 = $i172;
                                    } else {
                                        $i18 = (($i14 * $i19) + ($i172 * $i15)) >> 16;
                                        $i19 = (($i19 * $i15) - ($i172 * $i14)) >> 16;
                                    }
                                    $i172 = $i18 + i6;
                                    $i18 = $i12 + i7;
                                    $i19 += i8;
                                    $i12 = ((i5 * $i172) + (i4 * $i19)) >> 16;
                                    $i19 = (($i19 * i5) - ($i172 * i4)) >> 16;
                                    $i172 = (($i18 * i3) - (i2 * $i19)) >> 16;
                                    $i18 = (($i19 * i3) + ($i18 * i2)) >> 16;
                                    this.data[$i16] = $i18 - $i9;
                                    if ($i18 < 50) {
                                        this.count[$i16] = -5000;
                                        $z2 = true;
                                    } else {
                                        $r3 = this.count;
                                        $i17 = this.this$0;
                                        $r42 = $i17;
                                        $i17 = (542614623 * $i17.this$0) * $i12;
                                        $i19 = $i17;
                                        $i17 /= $i18;
                                        $i19 = $i17;
                                        $r3[$i16] = $i17 + $i11;
                                        $r3 = this.next;
                                        $r4 = this.this$0;
                                        $i17 = $r4.this$0 * 542614623;
                                        $i19 = $i17;
                                        $i17 *= $i172;
                                        $i19 = $i17;
                                        $i17 /= $i18;
                                        $i19 = $i17;
                                        $r3[$i16] = $i17 + $i13;
                                    }
                                    if (obj != null) {
                                        this.length[$i16] = $i12;
                                        this.key[$i16] = $i172;
                                        this.value[$i16] = $i18;
                                    }
                                }
                                try {
                                    get($r2, $z2, $z1, j);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void read(Integer integer, int $i0) {
        if (this.name[$i0]) {
            toString(integer, $i0, 361715093);
            return;
        }
        int $i9 = integer.count[$i0];
        int $i10 = integer.queue[$i0];
        int $i11 = integer.key[$i0];
        this.this$0.f201c = this.parent[$i0];
        if (integer.position == null) {
            this.this$0.f200b = 0;
        } else {
            this.this$0.f200b = (integer.position[$i0] & (short) 255) * 733034757;
        }
        if (integer.path != null && integer.path[$i0] != (short) -1) {
            int $i5;
            int $i4;
            int $i3;
            if (integer.name == null || integer.name[$i0] == (byte) -1) {
                $i5 = $i11;
                $i4 = $i10;
                $i3 = $i9;
            } else {
                short $s2 = integer.name[$i0] & (short) 255;
                $i3 = integer.values[$s2];
                $i4 = integer.table[$s2];
                $i5 = integer.parent[$s2];
            }
            if (integer.index[$i0] == -1) {
                ((Resource) this.this$0).toString(this.next[$i9], this.next[$i10], this.next[$i11], this.count[$i9], this.count[$i10], this.count[$i11], integer.list[$i0], integer.list[$i0], integer.list[$i0], this.length[$i3], this.length[$i4], this.length[$i5], this.key[$i3], this.key[$i4], this.key[$i5], this.value[$i3], this.value[$i4], this.value[$i5], integer.path[$i0], 16711935);
                return;
            }
            ((Resource) this.this$0).toString(this.next[$i9], this.next[$i10], this.next[$i11], this.count[$i9], this.count[$i10], this.count[$i11], integer.list[$i0], integer.current[$i0], integer.index[$i0], this.length[$i3], this.length[$i4], this.length[$i5], this.key[$i3], this.key[$i4], this.key[$i5], this.value[$i3], this.value[$i4], this.value[$i5], integer.path[$i0], 16711935);
        } else if (-1 == integer.index[$i0]) {
            ((Resource) this.this$0).parse(this.next[$i9], this.next[$i10], this.next[$i11], this.count[$i9], this.count[$i10], this.count[$i11], LazyList.text[integer.list[$i0]], 1096146303);
        } else {
            ((Resource) this.this$0).getSize(this.next[$i9], this.next[$i10], this.next[$i11], this.count[$i9], this.count[$i10], this.count[$i11], integer.list[$i0], integer.current[$i0], integer.index[$i0], 1438759268);
        }
    }

    final void read(Integer integer, boolean z, boolean z2, long j) {
        if (integer.head < 1600) {
            int $i2;
            int $i3;
            int $i4;
            int $i5;
            int $i6;
            int $i7;
            int $i8;
            int $i9;
            int $i11;
            int[] $r2;
            int[] $r5;
            for ($i2 = 0; $i2 < integer.head; $i2++) {
                this.size[$i2] = 0;
            }
            for ($i2 = 0; $i2 < integer.data; $i2++) {
                if (integer.index[$i2] != -2) {
                    $i3 = integer.count[$i2];
                    $i4 = integer.queue[$i2];
                    $i5 = integer.key[$i2];
                    $i6 = this.count[$i3];
                    $i7 = this.count[$i4];
                    $i8 = this.count[$i5];
                    if (z && (-5000 == $i6 || $i7 == -5000 || -5000 == $i8)) {
                        $i9 = this.length[$i3];
                        $i7 = this.length[$i4];
                        int $i10 = this.length[$i5];
                        $i11 = this.key[$i3];
                        $i6 = this.key[$i4];
                        int $i12 = this.key[$i5];
                        int $i13 = this.value[$i3];
                        $i8 = this.value[$i4];
                        $i9 -= $i7;
                        $i10 -= $i7;
                        $i11 -= $i6;
                        $i12 -= $i6;
                        $i13 -= $i8;
                        int $i14 = this.value[$i5] - $i8;
                        if (((($i9 * $i12) - ($i10 * $i11)) * $i8) + (($i7 * (($i11 * $i14) - ($i13 * $i12))) + ($i6 * (($i13 * $i10) - ($i14 * $i9)))) > 0) {
                            this.name[$i2] = true;
                            $i5 = integer.height + (((this.data[$i4] + this.data[$i3]) + this.data[$i5]) / 3);
                            $r2 = this.limit[$i5];
                            $r5 = this.size;
                            $i3 = $r5[$i5];
                            $r5[$i5] = $i3 + 1;
                            $r2[$i3] = $i2;
                        }
                    } else {
                        if (z2) {
                            if (StringBuffer.add(this.next[$i3], this.next[$i4], this.next[$i5], $i6, $i7, $i8, 5, 105033613)) {
                                long[] $r8 = Main.value;
                                $i9 = Main.size + 313171601;
                                Main.size = $i9;
                                $r8[($i9 * 963961457) - 1] = j;
                                z2 = false;
                            }
                        }
                        if ((($i6 - $i7) * (this.next[$i5] - this.next[$i4])) - (($i8 - $i7) * (this.next[$i3] - this.next[$i4])) > 0) {
                            this.name[$i2] = false;
                            if ($i6 >= 0 && $i7 >= 0 && $i8 >= 0) {
                                Point $r9 = this.this$0;
                                if ($i6 <= 784773023 * $r9.buffer) {
                                    $r9 = this.this$0;
                                    if ($i7 <= 784773023 * $r9.buffer) {
                                        $r9 = this.this$0;
                                        if ($i8 <= 784773023 * $r9.buffer) {
                                            this.parent[$i2] = false;
                                            $i5 = (((this.data[$i4] + this.data[$i3]) + this.data[$i5]) / 3) + integer.height;
                                            $r2 = this.limit[$i5];
                                            $r5 = this.size;
                                            $i3 = $r5[$i5];
                                            $r5[$i5] = $i3 + 1;
                                            $r2[$i3] = $i2;
                                        }
                                    }
                                }
                            }
                            this.parent[$i2] = true;
                            $i5 = (((this.data[$i4] + this.data[$i3]) + this.data[$i5]) / 3) + integer.height;
                            $r2 = this.limit[$i5];
                            $r5 = this.size;
                            $i3 = $r5[$i5];
                            $r5[$i5] = $i3 + 1;
                            $r2[$i3] = $i2;
                        }
                    }
                }
            }
            if (integer.buffer == null) {
                for ($i3 = integer.head - 1; $i3 >= 0; $i3--) {
                    $i4 = this.size[$i3];
                    if ($i4 > 0) {
                        $r2 = this.limit[$i3];
                        for ($i5 = 0; $i5 < $i4; $i5++) {
                            add(integer, $r2[$i5], 97784886);
                        }
                    }
                }
            } else {
                for ($i2 = 0; $i2 < 12; $i2++) {
                    this.buffer[$i2] = 0;
                    this.index[$i2] = 0;
                }
                for ($i2 = integer.head - 1; $i2 >= 0; $i2--) {
                    $i5 = this.size[$i2];
                    if ($i5 > 0) {
                        $r2 = this.limit[$i2];
                        for ($i3 = 0; $i3 < $i5; $i3++) {
                            $i4 = $r2[$i3];
                            byte $b16 = integer.buffer[$i4];
                            $r5 = this.buffer;
                            $i8 = $r5[$b16];
                            $r5[$b16] = $i8 + 1;
                            this.head[$b16][$i8] = $i4;
                            if ($b16 < (byte) 10) {
                                $r5 = this.index;
                                $r5[$b16] = $r5[$b16] + $i2;
                            } else if ((byte) 10 == $b16) {
                                this.pos[$i8] = $i2;
                            } else {
                                this.log[$i8] = $i2;
                            }
                        }
                    }
                }
                $i2 = 0;
                if (this.buffer[1] > 0 || this.buffer[2] > 0) {
                    $i2 = (this.index[1] + this.index[2]) / (this.buffer[1] + this.buffer[2]);
                }
                $i5 = 0;
                if (this.buffer[3] > 0 || this.buffer[4] > 0) {
                    $i5 = (this.index[3] + this.index[4]) / (this.buffer[3] + this.buffer[4]);
                }
                $i3 = 0;
                if (this.buffer[6] > 0 || this.buffer[8] > 0) {
                    $i3 = (this.index[6] + this.index[8]) / (this.buffer[6] + this.buffer[8]);
                }
                $i8 = this.buffer[10];
                $r2 = this.head[10];
                $r5 = this.pos;
                if ($i8 == 0) {
                    $i8 = this.buffer[11];
                    $r2 = this.head[11];
                    $r5 = this.log;
                }
                $i6 = $i8 > 0 ? $r5[0] : -1000;
                $i7 = 0;
                for ($i4 = 0; $i4 < 10; $i4++) {
                    while ($i4 == 0 && $i6 > $i2) {
                        $i6 = $i7 + 1;
                        add(integer, $r2[$i7], -977055109);
                        if ($i8 != $i6 || $r2 == this.head[11]) {
                            $i7 = $i6;
                        } else {
                            $i7 = 0;
                            $i8 = this.buffer[11];
                            $r2 = this.head[11];
                            $r5 = this.log;
                        }
                        $i6 = $i7 < $i8 ? $r5[$i7] : -1000;
                    }
                    $i9 = $i6;
                    while (3 == $i4 && $i9 > $i5) {
                        $i6 = $i7 + 1;
                        add(integer, $r2[$i7], 583471490);
                        if ($i8 == $i6 && this.head[11] != $r2) {
                            $i6 = 0;
                            $i8 = this.buffer[11];
                            $r2 = this.head[11];
                            $r5 = this.log;
                        }
                        if ($i6 < $i8) {
                            $i9 = $r5[$i6];
                            $i7 = $i6;
                        } else {
                            $i9 = -1000;
                            $i7 = $i6;
                        }
                    }
                    $i6 = $i9;
                    while ($i4 == 5 && $i6 > $i3) {
                        $i9 = $i7 + 1;
                        add(integer, $r2[$i7], -1903900159);
                        if ($i9 == $i8 && $r2 != this.head[11]) {
                            $i9 = 0;
                            $i8 = this.buffer[11];
                            $r2 = this.head[11];
                            $r5 = this.log;
                        }
                        if ($i9 >= $i8) {
                            $i6 = -1000;
                            $i7 = $i9;
                        } else {
                            $i6 = $r5[$i9];
                            $i7 = $i9;
                        }
                    }
                    $i11 = this.buffer[$i4];
                    int[] $r6 = this.head[$i4];
                    for ($i9 = 0; $i9 < $i11; $i9++) {
                        add(integer, $r6[$i9], 979883306);
                    }
                }
                $i2 = $i8;
                $i3 = $i7;
                $i4 = $i6;
                while (-1000 != $i4) {
                    $i5 = $i3 + 1;
                    add(integer, $r2[$i3], 857704272);
                    if ($i5 == $i2 && $r2 != this.head[11]) {
                        $i5 = 0;
                        $r2 = this.head[11];
                        $i2 = this.buffer[11];
                        $r5 = this.log;
                    }
                    if ($i5 < $i2) {
                        $i4 = $r5[$i5];
                        $i3 = $i5;
                    } else {
                        $i4 = -1000;
                        $i3 = $i5;
                    }
                }
            }
        }
    }

    public final void remove(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7) {
        this.size[0] = -1;
        if (!(2 == integer.f146x || 1 == integer.f146x)) {
            integer.set();
        }
        int $i8 = -1575402035 * this.this$0.data;
        int $i9 = -1508152919 * this.this$0.parent;
        int $i10 = LazyList.offset[i];
        int $i11 = LazyList.state[i];
        int $i12 = LazyList.offset[i2];
        int $i13 = LazyList.state[i2];
        int $i14 = LazyList.offset[i3];
        int $i15 = LazyList.state[i3];
        int $i16 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i17 = (($i3 * i6) + (i5 * $i16)) >> 16;
        for (int $i18 = 0; $i18 < integer.size; $i18++) {
            int $i19;
            int $i22;
            int $i20 = integer.next[$i18];
            int i8 = integer.length[$i18];
            int i9 = integer.this$0[$i18];
            if (i3 != 0) {
                $i19 = ((i8 * $i14) + ($i15 * $i20)) >> 16;
                i8 = ((i8 * $i15) - ($i20 * $i14)) >> 16;
            } else {
                $i19 = $i20;
            }
            if (i != 0) {
                $i20 = ($i11 * i8) - (i9 * $i10);
                $i22 = i9 * $i11;
                i9 = $i22;
                i9 = ($i22 + (i8 * $i10)) >> 16;
                i8 = $i20 >> 16;
            }
            if (i2 != 0) {
                $i20 = (($i12 * i9) + ($i13 * $i19)) >> 16;
                i9 = ((i9 * $i13) - ($i19 * $i12)) >> 16;
            } else {
                $i20 = $i19;
            }
            $i19 = $i20 + i4;
            i8 += i5;
            $i20 = i9 + i6;
            i9 = (($i3 * i8) - ($i20 * $i16)) >> 16;
            i8 = (($i20 * $i3) + (i8 * $i16)) >> 16;
            this.data[$i18] = i8 - $i17;
            $i22 = this.this$0.this$0 * 542614623;
            $i20 = $i22;
            $i22 *= $i19;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.count[$i18] = $i22 + $i8;
            $i22 = this.this$0.this$0 * -1617954175;
            $i20 = $i22;
            $i22 *= i9;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.next[$i18] = $i22 + $i9;
            if (integer.value > 0) {
                this.length[$i18] = $i19;
                this.key[$i18] = i9;
                this.value[$i18] = i8;
            }
        }
        try {
            get(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    final void set(Integer integer, int $i0) {
        if (this.name[$i0]) {
            toString(integer, $i0, 361715093);
            return;
        }
        int $i1 = integer.count[$i0];
        int $i2 = integer.queue[$i0];
        int $i3 = integer.key[$i0];
        this.this$0.f201c = this.parent[$i0];
        if (integer.position == null) {
            this.this$0.f200b = 0;
        } else {
            this.this$0.f200b = (integer.position[$i0] & (short) 255) * 733034757;
        }
        if (integer.path != null && integer.path[$i0] != (short) -1) {
            int $i5;
            int $i6;
            int $i7;
            if (integer.name == null || integer.name[$i0] == (byte) -1) {
                $i5 = $i3;
                $i6 = $i2;
                $i7 = $i1;
            } else {
                short $s4 = integer.name[$i0] & (short) 255;
                $i7 = integer.values[$s4];
                $i6 = integer.table[$s4];
                $i5 = integer.parent[$s4];
            }
            if (integer.index[$i0] == -1) {
                ((Resource) this.this$0).toString(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.list[$i0], integer.list[$i0], this.length[$i7], this.length[$i6], this.length[$i5], this.key[$i7], this.key[$i6], this.key[$i5], this.value[$i7], this.value[$i6], this.value[$i5], integer.path[$i0], 16711935);
                return;
            }
            ((Resource) this.this$0).toString(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], this.length[$i7], this.length[$i6], this.length[$i5], this.key[$i7], this.key[$i6], this.key[$i5], this.value[$i7], this.value[$i6], this.value[$i5], integer.path[$i0], 16711935);
        } else if (-1 == integer.index[$i0]) {
            ((Resource) this.this$0).parse(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], LazyList.text[integer.list[$i0]], 1096146303);
        } else {
            ((Resource) this.this$0).getSize(this.next[$i1], this.next[$i2], this.next[$i3], this.count[$i1], this.count[$i2], this.count[$i3], integer.list[$i0], integer.current[$i0], integer.index[$i0], 1823886393);
        }
    }

    public void toString(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        Integer $r2 = arrayMap.read();
        if ($r2 != null) {
            this.size[0] = -1;
            if ($r2.f146x != 1) {
                $r2.append();
            }
            $r2.read(i);
            int $i12 = ((i5 * i8) - (i4 * i6)) >> 16;
            int $i9 = ((i3 * $i12) + (i7 * i2)) >> 16;
            int $i13 = ($r2.width * i3) >> 16;
            int $i11 = $i13 + $i9;
            if ($i11 > -1673095614 && $i9 < 878254379) {
                int $i14 = ((i5 * i6) + (i4 * i8)) >> 16;
                Point $r4 = this.this$0;
                int $i15 = ($i14 - $r2.width) * ($r4.this$0 * 542614623);
                int $i16 = $i15 / $i11;
                int $i17 = this.this$0;
                Point $r42 = $i17;
                if ($i16 < -1292978563 * $i17.index) {
                    $i17 = $r2.width;
                    $i16 = $i17 + $i14;
                    $i17 = this.this$0;
                    $r42 = $i17;
                    $i16 *= 1443779769 * $i17.this$0;
                    int $i172 = $i16 / $i11;
                    $i17 = this.this$0;
                    $r42 = $i17;
                    if ($i172 > -78303373 * $i17.key) {
                        $i12 = ((i3 * i7) - ($i12 * i2)) >> 16;
                        $i17 = $r2.width;
                        int $i18 = ($i17 * i2) >> 16;
                        $i172 = $i12 + $i18;
                        $i17 = this.this$0;
                        $r42 = $i17;
                        $i172 *= -2052646193 * $i17.this$0;
                        int $i19 = $i172 / $i11;
                        $i17 = this.this$0;
                        $r42 = $i17;
                        if ($i19 > -1144938555 * $i17.height) {
                            $i18 += ((1500767459 * $r2.size) * i3) >> 16;
                            $i17 = this.this$0;
                            $r42 = $i17;
                            $i18 = (-973400947 * $i17.this$0) * ($i12 - $i18);
                            $i19 = $i18 / $i11;
                            $i17 = this.this$0;
                            $r42 = $i17;
                            if ($i19 < -939286465 * $i17.width) {
                                boolean $z2;
                                int[] $r3;
                                $i17 = $r2.size * 1328150346;
                                $i19 = $i17;
                                Object obj = null;
                                if ($i9 - ($i13 + (($i17 * i2) >> 16)) <= -1870414513) {
                                    obj = 1;
                                }
                                obj = (obj != null || $r2.value > 0) ? 1 : null;
                                int $i10 = -429386291 * Main.count;
                                $i19 = Preconditions.format(-414970391);
                                boolean $z1 = Main.data;
                                if (Type.add(j) && $z1) {
                                    if (Main.active) {
                                        $z1 = IntegerPolynomial.add($r2, i6, i7, i8, this, -1460739985);
                                    } else {
                                        $i13 = $i9 - $i13;
                                        int $i20 = $i13 <= 50 ? 736464722 : $i13;
                                        if ($i14 > 0) {
                                            $i13 = $i16 / $i20;
                                            $i14 = $i15 / $i11;
                                        } else {
                                            $i13 = $i16 / $i11;
                                            $i14 = $i15 / $i20;
                                        }
                                        if ($i12 > 0) {
                                            $i11 = $i18 / $i11;
                                            $i15 = $i172 / $i20;
                                        } else {
                                            $i15 = $i172 / $i11;
                                            $i11 = $i18 / $i20;
                                        }
                                        $i17 = this.this$0;
                                        $r42 = $i17;
                                        $i16 = $i10 - (282644651 * $i17.data);
                                        $r4 = this.this$0;
                                        $i12 = $i19 - (42438850 * $r4.parent);
                                        $z1 = $i16 > $i14 && $i16 < $i13 && $i12 > $i11 && $i12 < $i15;
                                    }
                                    if ($z1) {
                                        if ($r2.flags) {
                                            long[] $r5 = Main.value;
                                            $i11 = Main.size + 1743519806;
                                            Main.size = $i11;
                                            $r5[($i11 * 963961457) - 1] = j;
                                            $z1 = false;
                                        } else {
                                            $z1 = true;
                                        }
                                        $r4 = this.this$0;
                                        $i11 = $r4.data * -1575402035;
                                        $r4 = this.this$0;
                                        $i13 = -1508152919 * $r4.parent;
                                        $i14 = 0;
                                        $i15 = 0;
                                        if (i != 0) {
                                            $i14 = LazyList.offset[i];
                                            $i15 = LazyList.state[i];
                                        }
                                        $z2 = false;
                                        for ($i16 = 0; $i16 < $r2.size; $i16++) {
                                            $i172 = $r2.next[$i16];
                                            $i12 = $r2.length[$i16];
                                            $i19 = $r2.this$0[$i16];
                                            if (i == 0) {
                                                $i18 = (($i14 * $i19) + ($i172 * $i15)) >> 16;
                                                $i19 = (($i19 * $i15) - ($i172 * $i14)) >> 16;
                                            } else {
                                                $i18 = $i172;
                                            }
                                            $i172 = $i18 + i6;
                                            $i18 = $i12 + i7;
                                            $i19 += i8;
                                            $i12 = ((i5 * $i172) + (i4 * $i19)) >> 16;
                                            $i19 = (($i19 * i5) - ($i172 * i4)) >> 16;
                                            $i172 = (($i18 * i3) - (i2 * $i19)) >> 16;
                                            $i18 = (($i19 * i3) + ($i18 * i2)) >> 16;
                                            this.data[$i16] = $i18 - $i9;
                                            if ($i18 < 50) {
                                                $r3 = this.count;
                                                $i17 = this.this$0;
                                                $r42 = $i17;
                                                $i17 = (542614623 * $i17.this$0) * $i12;
                                                $i19 = $i17;
                                                $i17 /= $i18;
                                                $i19 = $i17;
                                                $r3[$i16] = $i17 + $i11;
                                                $r3 = this.next;
                                                $r4 = this.this$0;
                                                $i17 = $r4.this$0 * 1258137245;
                                                $i19 = $i17;
                                                $i17 *= $i172;
                                                $i19 = $i17;
                                                $i17 /= $i18;
                                                $i19 = $i17;
                                                $r3[$i16] = $i17 + $i13;
                                            } else {
                                                this.count[$i16] = -5000;
                                                $z2 = true;
                                            }
                                            if (obj != null) {
                                                this.length[$i16] = $i12;
                                                this.key[$i16] = $i172;
                                                this.value[$i16] = $i18;
                                            }
                                        }
                                        get($r2, $z2, $z1, j);
                                    }
                                }
                                $z1 = false;
                                $r4 = this.this$0;
                                $i11 = $r4.data * -1575402035;
                                $r4 = this.this$0;
                                $i13 = -1508152919 * $r4.parent;
                                $i14 = 0;
                                $i15 = 0;
                                if (i != 0) {
                                    $i14 = LazyList.offset[i];
                                    $i15 = LazyList.state[i];
                                }
                                $z2 = false;
                                for ($i16 = 0; $i16 < $r2.size; $i16++) {
                                    $i172 = $r2.next[$i16];
                                    $i12 = $r2.length[$i16];
                                    $i19 = $r2.this$0[$i16];
                                    if (i == 0) {
                                        $i18 = $i172;
                                    } else {
                                        $i18 = (($i14 * $i19) + ($i172 * $i15)) >> 16;
                                        $i19 = (($i19 * $i15) - ($i172 * $i14)) >> 16;
                                    }
                                    $i172 = $i18 + i6;
                                    $i18 = $i12 + i7;
                                    $i19 += i8;
                                    $i12 = ((i5 * $i172) + (i4 * $i19)) >> 16;
                                    $i19 = (($i19 * i5) - ($i172 * i4)) >> 16;
                                    $i172 = (($i18 * i3) - (i2 * $i19)) >> 16;
                                    $i18 = (($i19 * i3) + ($i18 * i2)) >> 16;
                                    this.data[$i16] = $i18 - $i9;
                                    if ($i18 < 50) {
                                        this.count[$i16] = -5000;
                                        $z2 = true;
                                    } else {
                                        $r3 = this.count;
                                        $i17 = this.this$0;
                                        $r42 = $i17;
                                        $i17 = (542614623 * $i17.this$0) * $i12;
                                        $i19 = $i17;
                                        $i17 /= $i18;
                                        $i19 = $i17;
                                        $r3[$i16] = $i17 + $i11;
                                        $r3 = this.next;
                                        $r4 = this.this$0;
                                        $i17 = $r4.this$0 * 1258137245;
                                        $i19 = $i17;
                                        $i17 *= $i172;
                                        $i19 = $i17;
                                        $i17 /= $i18;
                                        $i19 = $i17;
                                        $r3[$i16] = $i17 + $i13;
                                    }
                                    if (obj != null) {
                                        this.length[$i16] = $i12;
                                        this.key[$i16] = $i172;
                                        this.value[$i16] = $i18;
                                    }
                                }
                                try {
                                    get($r2, $z2, $z1, j);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void toString(p000.Integer r65, int r66) {
        /*
        r64 = this;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.data;
        r22 = r0;
        r24 = -1575402035; // 0xffffffffa21945cd float:-2.0772319E-18 double:NaN;
        r23 = r22 * r24;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.parent;
        r22 = r0;
        r24 = -578257823; // 0xffffffffdd887c61 float:-1.22935529E18 double:NaN;
        r25 = r24 * r22;
        r0 = r65;
        r0 = r0.count;
        r26 = r0;
        r22 = r26[r66];
        r0 = r65;
        r0 = r0.queue;
        r26 = r0;
        r27 = r26[r66];
        r0 = r65;
        r0 = r0.key;
        r26 = r0;
        r28 = r26[r66];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r29 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r30 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r31 = r26[r28];
        r0 = r65;
        r0 = r0.position;
        r32 = r0;
        if (r32 != 0) goto L_0x04dc;
    L_0x0056:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r24 = 0;
        r0 = r24;
        r1 = r21;
        r1.f200b = r0;
    L_0x0064:
        r24 = 210499714; // 0xc8bf882 float:2.1565906E-31 double:1.04000677E-315;
        r0 = r29;
        r1 = r24;
        if (r0 < r1) goto L_0x04fc;
    L_0x006d:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.count;
        r33 = r0;
        r34 = r33[r22];
        r24 = 0;
        r26[r24] = r34;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.next;
        r33 = r0;
        r34 = r33[r22];
        r24 = 0;
        r26[r24] = r34;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r34 = r33[r66];
        r24 = 0;
        r26[r24] = r34;
        r35 = 1;
    L_0x00a5:
        r24 = 780962651; // 0x2e8c8b5b float:6.3912174E-11 double:3.858468165E-315;
        r0 = r30;
        r1 = r24;
        if (r0 < r1) goto L_0x0841;
    L_0x00ae:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.count;
        r33 = r0;
        r34 = r33[r27];
        r26[r35] = r34;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.next;
        r33 = r0;
        r34 = r33[r27];
        r26[r35] = r34;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r36 = r35 + 1;
        r0 = r65;
        r0 = r0.current;
        r33 = r0;
        r34 = r33[r66];
        r26[r35] = r34;
    L_0x00e0:
        r24 = 50;
        r0 = r31;
        r1 = r24;
        if (r0 < r1) goto L_0x09f8;
    L_0x00e8:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.count;
        r33 = r0;
        r25 = r33[r28];
        r26[r36] = r25;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.next;
        r33 = r0;
        r25 = r33[r28];
        r26[r36] = r25;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.index;
        r33 = r0;
        r23 = r33[r66];
        r26[r36] = r23;
        r37 = r36 + 1;
    L_0x011a:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 0;
        r25 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 1;
        r30 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 2;
        r23 = r26[r24];
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 0;
        r29 = r26[r24];
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 1;
        r34 = r26[r24];
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 2;
        r31 = r26[r24];
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r24 = 0;
        r0 = r24;
        r1 = r21;
        r1.f201c = r0;
        r24 = 3;
        r0 = r37;
        r1 = r24;
        if (r0 != r1) goto L_0x021c;
    L_0x016c:
        if (r25 < 0) goto L_0x01b6;
    L_0x016e:
        if (r30 < 0) goto L_0x01b6;
    L_0x0170:
        if (r23 < 0) goto L_0x01b6;
    L_0x0172:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r36 = r0;
        r24 = 583628202; // 0x22c975aa float:5.460574E-18 double:2.883506446E-315;
        r36 = r24 * r36;
        r0 = r25;
        r1 = r36;
        if (r0 > r1) goto L_0x01b6;
    L_0x0187:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r36 = r0;
        r24 = -1226208017; // 0xffffffffb6e98cef float:-6.960348E-6 double:NaN;
        r36 = r24 * r36;
        r0 = r30;
        r1 = r36;
        if (r0 > r1) goto L_0x01b6;
    L_0x019c:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r36 = r0;
        r24 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r0 = r36;
        r1 = r24;
        r0 = r0 * r1;
        r36 = r0;
        r0 = r23;
        r1 = r36;
        if (r0 <= r1) goto L_0x01c4;
    L_0x01b6:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r24 = 1;
        r0 = r24;
        r1 = r21;
        r1.f201c = r0;
    L_0x01c4:
        r0 = r65;
        r0 = r0.path;
        r38 = r0;
        if (r38 == 0) goto L_0x01dc;
    L_0x01cc:
        r0 = r65;
        r0 = r0.path;
        r38 = r0;
        r39 = r38[r66];
        r24 = -1;
        r0 = r24;
        r1 = r39;
        if (r0 != r1) goto L_0x06ac;
    L_0x01dc:
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r36 = r26[r66];
        r24 = -1;
        r0 = r36;
        r1 = r24;
        if (r0 != r1) goto L_0x0baa;
    L_0x01ec:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r41 = r21;
        r41 = (p000.Resource) r41;
        r40 = r41;
        r26 = p000.LazyList.text;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r36 = r33[r66];
        r36 = r26[r36];
        r24 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r40;
        r1 = r29;
        r2 = r34;
        r3 = r31;
        r4 = r25;
        r5 = r30;
        r6 = r23;
        r7 = r36;
        r8 = r24;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x021c:
        r24 = 4;
        r0 = r37;
        r1 = r24;
        if (r0 != r1) goto L_0x0e20;
    L_0x0224:
        if (r25 < 0) goto L_0x0299;
    L_0x0226:
        if (r30 < 0) goto L_0x0299;
    L_0x0228:
        if (r23 < 0) goto L_0x0299;
    L_0x022a:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r37 = r0;
        r24 = -1371271927; // 0xffffffffae440d09 float:-4.4576818E-11 double:NaN;
        r0 = r37;
        r1 = r24;
        r0 = r0 * r1;
        r37 = r0;
        r0 = r25;
        r1 = r37;
        if (r0 > r1) goto L_0x0299;
    L_0x0244:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r37 = r0;
        r24 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r37 = r24 * r37;
        r0 = r30;
        r1 = r37;
        if (r0 > r1) goto L_0x0299;
    L_0x0259:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r37 = r0;
        r24 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r37 = r24 * r37;
        r0 = r23;
        r1 = r37;
        if (r0 > r1) goto L_0x0299;
    L_0x026e:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r37 = r26[r24];
        if (r37 < 0) goto L_0x0299;
    L_0x027a:
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r37 = r26[r24];
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.buffer;
        r36 = r0;
        r24 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r36 = r24 * r36;
        r0 = r37;
        r1 = r36;
        if (r0 <= r1) goto L_0x02a7;
    L_0x0299:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r24 = 1;
        r0 = r24;
        r1 = r21;
        r1.f201c = r0;
    L_0x02a7:
        r0 = r65;
        r0 = r0.path;
        r38 = r0;
        if (r38 == 0) goto L_0x02bf;
    L_0x02af:
        r0 = r65;
        r0 = r0.path;
        r38 = r0;
        r39 = r38[r66];
        r24 = -1;
        r0 = r39;
        r1 = r24;
        if (r0 != r1) goto L_0x049d;
    L_0x02bf:
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r22 = r26[r66];
        r24 = -1;
        r0 = r22;
        r1 = r24;
        if (r0 != r1) goto L_0x07a0;
    L_0x02cf:
        r26 = p000.LazyList.text;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r66 = r33[r66];
        r66 = r26[r66];
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r42 = r21;
        r42 = (p000.Resource) r42;
        r40 = r42;
        r24 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r40;
        r1 = r29;
        r2 = r34;
        r3 = r31;
        r4 = r25;
        r5 = r30;
        r6 = r23;
        r7 = r66;
        r8 = r24;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r43 = r21;
        r43 = (p000.Resource) r43;
        r40 = r43;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 3;
        r22 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r27 = r26[r24];
        r24 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r40;
        r1 = r29;
        r2 = r31;
        r3 = r22;
        r4 = r25;
        r5 = r23;
        r6 = r27;
        r7 = r66;
        r8 = r24;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);
        return;
    L_0x0338:
        r0 = r65;
        r0 = r0.path;
        r38 = r0;
        r39 = r38[r66];
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r37 = r26[r66];
        r24 = -1;
        r0 = r24;
        r1 = r37;
        if (r0 != r1) goto L_0x0ca9;
    L_0x0350:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r44 = r21;
        r44 = (p000.Resource) r44;
        r40 = r44;
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r37 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r36 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r35 = r26[r66];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r45 = r26[r22];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r46 = r26[r27];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r47 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r48 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r49 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r50 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r51 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r52 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r53 = r26[r28];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r40;
        r1 = r29;
        r2 = r34;
        r3 = r31;
        r4 = r25;
        r5 = r30;
        r6 = r23;
        r7 = r37;
        r8 = r36;
        r9 = r35;
        r10 = r45;
        r11 = r46;
        r12 = r47;
        r13 = r48;
        r14 = r49;
        r15 = r50;
        r16 = r51;
        r17 = r52;
        r18 = r53;
        r19 = r39;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r54 = r21;
        r54 = (p000.Resource) r54;
        r40 = r54;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 3;
        r30 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r34 = r26[r24];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r37 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r36 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r66 = r26[r66];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r35 = r26[r22];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r45 = r26[r27];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r46 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r47 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r48 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r49 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r22 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r27 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r28 = r26[r28];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r40;
        r1 = r29;
        r2 = r31;
        r3 = r30;
        r4 = r25;
        r5 = r23;
        r6 = r34;
        r7 = r37;
        r8 = r36;
        r9 = r66;
        r10 = r35;
        r11 = r45;
        r12 = r46;
        r13 = r47;
        r14 = r48;
        r15 = r49;
        r16 = r22;
        r17 = r27;
        r18 = r28;
        r19 = r39;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        return;
    L_0x049d:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        if (r32 == 0) goto L_0x0338;
    L_0x04a5:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        r55 = r32[r66];
        r24 = -1;
        r0 = r55;
        r1 = r24;
        if (r0 == r1) goto L_0x0338;
    L_0x04b5:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        r55 = r32[r66];
        r24 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r39 = r55 & r24;
        r0 = r65;
        r0 = r0.values;
        r26 = r0;
        r22 = r26[r39];
        r0 = r65;
        r0 = r0.table;
        r26 = r0;
        r27 = r26[r39];
        r0 = r65;
        r0 = r0.parent;
        r26 = r0;
        r28 = r26[r39];
        goto L_0x0338;
    L_0x04dc:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r65;
        r0 = r0.position;
        r32 = r0;
        r55 = r32[r66];
        r24 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r39 = r55 & r24;
        r24 = -120202203; // 0xfffffffff8d5dc25 float:-3.470076E34 double:NaN;
        r34 = r24 * r39;
        r0 = r34;
        r1 = r21;
        r1.f200b = r0;
        goto L_0x0064;
    L_0x04fc:
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r36 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r37 = r26[r22];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r34 = r26[r66];
        r24 = 2015041866; // 0x781b194a float:1.2583108E34 double:9.95562961E-315;
        r0 = r31;
        r1 = r24;
        if (r0 < r1) goto L_0x0e1b;
    L_0x051d:
        r24 = 50;
        r35 = r24 - r29;
        r26 = p000.LazyList.f11c;
        r45 = r31 - r29;
        r45 = r26[r45];
        r35 = r45 * r35;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r45 = r33[r28];
        r0 = r45;
        r1 = r36;
        r0 = r0 - r1;
        r45 = r0;
        r1 = r35;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r45;
        r1 = r36;
        r0 = r0 + r1;
        r45 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r46 = r0;
        r24 = -1791557176; // 0xffffffff953701c8 float:-3.695796E-26 double:NaN;
        r0 = r46;
        r1 = r24;
        r0 = r0 * r1;
        r46 = r0;
        r0 = r45;
        r1 = r46;
        r0 = r0 * r1;
        r45 = r0;
        r24 = 792285163; // 0x2f394feb float:1.6854045E-10 double:3.914408807E-315;
        r0 = r45;
        r1 = r24;
        r0 = r0 / r1;
        r45 = r0;
        r1 = r23;
        r0 = r0 + r1;
        r45 = r0;
        r24 = 0;
        r26[r24] = r45;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r45 = r0;
        r24 = 288932201; // 0x1138c169 float:1.457464E-28 double:1.427514745E-315;
        r45 = r24 * r45;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r46 = r33[r28];
        r0 = r46;
        r1 = r37;
        r0 = r0 - r1;
        r46 = r0;
        r1 = r35;
        r0 = r0 * r1;
        r46 = r0;
        r46 = r46 >> 16;
        r0 = r46;
        r1 = r37;
        r0 = r0 + r1;
        r46 = r0;
        r0 = r45;
        r1 = r46;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 / 50;
        r0 = r45;
        r1 = r25;
        r0 = r0 + r1;
        r45 = r0;
        r24 = 0;
        r26[r24] = r45;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r55 = 1;
        r0 = r65;
        r0 = r0.index;
        r33 = r0;
        r45 = r33[r66];
        r0 = r45;
        r1 = r34;
        r0 = r0 - r1;
        r45 = r0;
        r0 = r35;
        r1 = r45;
        r0 = r0 * r1;
        r35 = r0;
        r35 = r35 >> 16;
        r0 = r35;
        r1 = r34;
        r0 = r0 + r1;
        r35 = r0;
        r24 = 0;
        r26[r24] = r35;
    L_0x05eb:
        r24 = 50;
        r0 = r30;
        r1 = r24;
        if (r0 < r1) goto L_0x0e02;
    L_0x05f3:
        r26 = p000.LazyList.f11c;
        r35 = r30 - r29;
        r35 = r26[r35];
        r24 = 50;
        r45 = r24 - r29;
        r0 = r45;
        r1 = r35;
        r0 = r0 * r1;
        r45 = r0;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r35 = r33[r27];
        r0 = r35;
        r1 = r36;
        r0 = r0 - r1;
        r35 = r0;
        r1 = r45;
        r0 = r0 * r1;
        r35 = r0;
        r35 = r35 >> 16;
        r0 = r36;
        r1 = r35;
        r0 = r0 + r1;
        r36 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r35 = r0;
        r24 = -53928899; // 0xfffffffffcc91c3d float:-8.353795E36 double:NaN;
        r35 = r24 * r35;
        r0 = r36;
        r1 = r35;
        r0 = r0 * r1;
        r36 = r0;
        r36 = r36 / 50;
        r0 = r36;
        r1 = r23;
        r0 = r0 + r1;
        r36 = r0;
        r26[r55] = r36;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r36 = r33[r27];
        r0 = r36;
        r1 = r37;
        r0 = r0 - r1;
        r36 = r0;
        r1 = r45;
        r0 = r0 * r1;
        r36 = r0;
        r36 = r36 >> 16;
        r37 = r36 + r37;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r36 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r36 = r24 * r36;
        r0 = r37;
        r1 = r36;
        r0 = r0 * r1;
        r37 = r0;
        r37 = r37 / 50;
        r0 = r37;
        r1 = r25;
        r0 = r0 + r1;
        r37 = r0;
        r26[r55] = r37;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r35 = r55 + 1;
        r0 = r65;
        r0 = r0.current;
        r33 = r0;
        r37 = r33[r66];
        r0 = r37;
        r1 = r34;
        r0 = r0 - r1;
        r37 = r0;
        r1 = r45;
        r0 = r0 * r1;
        r37 = r0;
        r37 = r37 >> 16;
        r34 = r37 + r34;
        r26[r55] = r34;
        goto L_0x00a5;
    L_0x06ac:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        if (r32 == 0) goto L_0x0bf3;
    L_0x06b4:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        r55 = r32[r66];
        r24 = -1;
        r0 = r24;
        r1 = r55;
        if (r0 == r1) goto L_0x0bf3;
    L_0x06c4:
        r0 = r65;
        r0 = r0.name;
        r32 = r0;
        r55 = r32[r66];
        r24 = -1855093557; // 0xffffffff916d84cb float:-1.8736923E-28 double:NaN;
        r36 = r55 & r24;
        r0 = r65;
        r0 = r0.values;
        r26 = r0;
        r45 = r26[r36];
        r0 = r65;
        r0 = r0.table;
        r26 = r0;
        r35 = r26[r36];
        r0 = r65;
        r0 = r0.parent;
        r26 = r0;
        r36 = r26[r36];
    L_0x06e9:
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r46 = r26[r66];
        r24 = -1;
        r0 = r24;
        r1 = r46;
        if (r0 != r1) goto L_0x0bfc;
    L_0x06f9:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r56 = r21;
        r56 = (p000.Resource) r56;
        r40 = r56;
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r46 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r47 = r26[r66];
        r0 = r65;
        r0 = r0.list;
        r26 = r0;
        r48 = r26[r66];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r49 = r26[r45];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r50 = r26[r35];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r51 = r26[r36];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r52 = r26[r45];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r53 = r26[r35];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r57 = r26[r36];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r45 = r26[r45];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r35 = r26[r35];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r36 = r26[r36];
        r0 = r65;
        r0 = r0.path;
        r38 = r0;
        r39 = r38[r66];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r40;
        r1 = r29;
        r2 = r34;
        r3 = r31;
        r4 = r25;
        r5 = r30;
        r6 = r23;
        r7 = r46;
        r8 = r47;
        r9 = r48;
        r10 = r49;
        r11 = r50;
        r12 = r51;
        r13 = r52;
        r14 = r53;
        r15 = r57;
        r16 = r45;
        r17 = r35;
        r18 = r36;
        r19 = r39;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        goto L_0x021c;
    L_0x07a0:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r58 = r21;
        r58 = (p000.Resource) r58;
        r40 = r58;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r66 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 1;
        r22 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r27 = r26[r24];
        r24 = 1031824041; // 0x3d8062a9 float:0.06268818 double:5.09788811E-315;
        r0 = r40;
        r1 = r29;
        r2 = r34;
        r3 = r31;
        r4 = r25;
        r5 = r30;
        r6 = r23;
        r7 = r66;
        r8 = r22;
        r9 = r27;
        r10 = r24;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r59 = r21;
        r59 = (p000.Resource) r59;
        r40 = r59;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 3;
        r66 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r22 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r27 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r28 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 3;
        r30 = r26[r24];
        r24 = 1774962483; // 0x69cbc733 float:3.079408E25 double:8.769479855E-315;
        r0 = r40;
        r1 = r29;
        r2 = r31;
        r3 = r66;
        r4 = r25;
        r5 = r23;
        r6 = r22;
        r7 = r27;
        r8 = r28;
        r9 = r30;
        r10 = r24;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        return;
    L_0x0841:
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r36 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r37 = r26[r27];
        r0 = r65;
        r0 = r0.current;
        r26 = r0;
        r34 = r26[r66];
        r24 = 50;
        r0 = r29;
        r1 = r24;
        if (r0 < r1) goto L_0x0e0c;
    L_0x0861:
        r24 = 50;
        r45 = r24 - r30;
        r26 = p000.LazyList.f11c;
        r46 = r29 - r30;
        r46 = r26[r46];
        r0 = r46;
        r1 = r45;
        r0 = r0 * r1;
        r46 = r0;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r45 = r33[r22];
        r0 = r45;
        r1 = r36;
        r0 = r0 - r1;
        r45 = r0;
        r1 = r46;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r45;
        r1 = r36;
        r0 = r0 + r1;
        r45 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r47 = r0;
        r24 = -439269775; // 0xffffffffe5d14671 float:-1.2353425E23 double:NaN;
        r47 = r24 * r47;
        r0 = r45;
        r1 = r47;
        r0 = r0 * r1;
        r45 = r0;
        r24 = -726459177; // 0xffffffffd4b31cd7 float:-6.154264E12 double:NaN;
        r0 = r45;
        r1 = r24;
        r0 = r0 / r1;
        r45 = r0;
        r1 = r23;
        r0 = r0 + r1;
        r45 = r0;
        r26[r35] = r45;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r45 = r33[r22];
        r0 = r45;
        r1 = r37;
        r0 = r0 - r1;
        r45 = r0;
        r1 = r46;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r45;
        r1 = r37;
        r0 = r0 + r1;
        r45 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r47 = r0;
        r24 = 2121889404; // 0x7e79767c float:8.2898244E37 double:1.048352659E-314;
        r47 = r24 * r47;
        r0 = r45;
        r1 = r47;
        r0 = r0 * r1;
        r45 = r0;
        r24 = -529048660; // 0xffffffffe0775bac float:-7.1296116E19 double:NaN;
        r0 = r45;
        r1 = r24;
        r0 = r0 / r1;
        r45 = r0;
        r1 = r25;
        r0 = r0 + r1;
        r45 = r0;
        r26[r35] = r45;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r45 = r35 + 1;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r47 = r33[r66];
        r0 = r47;
        r1 = r34;
        r0 = r0 - r1;
        r47 = r0;
        r0 = r46;
        r1 = r47;
        r0 = r0 * r1;
        r46 = r0;
        r46 = r46 >> 16;
        r0 = r46;
        r1 = r34;
        r0 = r0 + r1;
        r46 = r0;
        r26[r35] = r46;
    L_0x092f:
        r24 = -928665466; // 0xffffffffc8a5b086 float:-339332.2 double:NaN;
        r0 = r31;
        r1 = r24;
        if (r0 < r1) goto L_0x0e07;
    L_0x0938:
        r24 = 1568776891; // 0x5d81a2bb float:1.16765427E18 double:7.75078768E-315;
        r35 = r24 - r30;
        r26 = p000.LazyList.f11c;
        r46 = r31 - r30;
        r46 = r26[r46];
        r0 = r35;
        r1 = r46;
        r0 = r0 * r1;
        r35 = r0;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r46 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r46 = r24 * r46;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r47 = r33[r28];
        r0 = r47;
        r1 = r36;
        r0 = r0 - r1;
        r47 = r0;
        r1 = r35;
        r0 = r0 * r1;
        r47 = r0;
        r47 = r47 >> 16;
        r0 = r36;
        r1 = r47;
        r0 = r0 + r1;
        r36 = r0;
        r1 = r46;
        r0 = r0 * r1;
        r36 = r0;
        r24 = -397958343; // 0xffffffffe847a339 float:-3.7710474E24 double:NaN;
        r0 = r36;
        r1 = r24;
        r0 = r0 / r1;
        r36 = r0;
        r1 = r23;
        r0 = r0 + r1;
        r36 = r0;
        r26[r45] = r36;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r36 = r33[r28];
        r0 = r36;
        r1 = r37;
        r0 = r0 - r1;
        r36 = r0;
        r1 = r35;
        r0 = r0 * r1;
        r36 = r0;
        r36 = r36 >> 16;
        r0 = r37;
        r1 = r36;
        r0 = r0 + r1;
        r37 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r36 = r0;
        r24 = -260059012; // 0xfffffffff07fd07c float:-3.1668288E29 double:NaN;
        r36 = r24 * r36;
        r0 = r37;
        r1 = r36;
        r0 = r0 * r1;
        r37 = r0;
        r37 = r37 / 50;
        r0 = r37;
        r1 = r25;
        r0 = r0 + r1;
        r37 = r0;
        r26[r45] = r37;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r36 = r45 + 1;
        r0 = r65;
        r0 = r0.index;
        r33 = r0;
        r37 = r33[r66];
        r0 = r37;
        r1 = r34;
        r0 = r0 - r1;
        r37 = r0;
        r37 = r35 * r37;
        r37 = r37 >> 16;
        r34 = r37 + r34;
        r26[r45] = r34;
        goto L_0x00e0;
    L_0x09f8:
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r35 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r37 = r26[r28];
        r0 = r65;
        r0 = r0.index;
        r26 = r0;
        r34 = r26[r66];
        r24 = 50;
        r0 = r30;
        r1 = r24;
        if (r0 < r1) goto L_0x0e16;
    L_0x0a18:
        r24 = 50;
        r45 = r24 - r31;
        r26 = p000.LazyList.f11c;
        r0 = r30;
        r1 = r31;
        r0 = r0 - r1;
        r30 = r0;
        r30 = r26[r30];
        r45 = r30 * r45;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r30 = r33[r27];
        r0 = r30;
        r1 = r35;
        r0 = r0 - r1;
        r30 = r0;
        r1 = r45;
        r0 = r0 * r1;
        r30 = r0;
        r30 = r30 >> 16;
        r0 = r30;
        r1 = r35;
        r0 = r0 + r1;
        r30 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r46 = r0;
        r24 = 1822978229; // 0x6ca870b5 float:1.6290543E27 double:9.00670916E-315;
        r0 = r46;
        r1 = r24;
        r0 = r0 * r1;
        r46 = r0;
        r0 = r30;
        r1 = r46;
        r0 = r0 * r1;
        r30 = r0;
        r24 = 86826592; // 0x52cde60 float:8.128245E-36 double:4.28980363E-316;
        r0 = r30;
        r1 = r24;
        r0 = r0 / r1;
        r30 = r0;
        r1 = r23;
        r0 = r0 + r1;
        r30 = r0;
        r26[r36] = r30;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r30 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r30;
        r1 = r24;
        r0 = r0 * r1;
        r30 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r46 = r33[r27];
        r0 = r46;
        r1 = r37;
        r0 = r0 - r1;
        r46 = r0;
        r1 = r45;
        r0 = r0 * r1;
        r46 = r0;
        r46 = r46 >> 16;
        r0 = r46;
        r1 = r37;
        r0 = r0 + r1;
        r46 = r0;
        r0 = r30;
        r1 = r46;
        r0 = r0 * r1;
        r30 = r0;
        r24 = -109304018; // 0xfffffffff97c272e float:-8.182834E34 double:NaN;
        r0 = r30;
        r1 = r24;
        r0 = r0 / r1;
        r30 = r0;
        r1 = r25;
        r0 = r0 + r1;
        r30 = r0;
        r26[r36] = r30;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r30 = r36 + 1;
        r0 = r65;
        r0 = r0.current;
        r33 = r0;
        r46 = r33[r66];
        r0 = r46;
        r1 = r34;
        r0 = r0 - r1;
        r46 = r0;
        r0 = r45;
        r1 = r46;
        r0 = r0 * r1;
        r45 = r0;
        r45 = r45 >> 16;
        r0 = r45;
        r1 = r34;
        r0 = r0 + r1;
        r45 = r0;
        r26[r36] = r45;
    L_0x0af0:
        r24 = 2034541780; // 0x7944a4d4 float:6.381458E34 double:1.0051971985E-314;
        r0 = r29;
        r1 = r24;
        if (r0 < r1) goto L_0x0e11;
    L_0x0af9:
        r24 = 50;
        r36 = r24 - r31;
        r26 = p000.LazyList.f11c;
        r0 = r29;
        r1 = r31;
        r0 = r0 - r1;
        r29 = r0;
        r29 = r26[r29];
        r29 = r36 * r29;
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r31 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r31 = r24 * r31;
        r0 = r64;
        r0 = r0.length;
        r33 = r0;
        r36 = r33[r22];
        r0 = r36;
        r1 = r35;
        r0 = r0 - r1;
        r36 = r0;
        r1 = r29;
        r0 = r0 * r1;
        r36 = r0;
        r36 = r36 >> 16;
        r36 = r35 + r36;
        r31 = r36 * r31;
        r31 = r31 / 50;
        r23 = r31 + r23;
        r26[r30] = r23;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r0 = r0.this$0;
        r23 = r0;
        r24 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r23;
        r1 = r24;
        r0 = r0 * r1;
        r23 = r0;
        r0 = r64;
        r0 = r0.key;
        r33 = r0;
        r31 = r33[r22];
        r0 = r31;
        r1 = r37;
        r0 = r0 - r1;
        r31 = r0;
        r1 = r29;
        r0 = r0 * r1;
        r31 = r0;
        r31 = r31 >> 16;
        r0 = r31;
        r1 = r37;
        r0 = r0 + r1;
        r31 = r0;
        r0 = r23;
        r1 = r31;
        r0 = r0 * r1;
        r23 = r0;
        r23 = r23 / 50;
        r25 = r23 + r25;
        r26[r30] = r25;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r0 = r65;
        r0 = r0.list;
        r33 = r0;
        r23 = r33[r66];
        r0 = r23;
        r1 = r34;
        r0 = r0 - r1;
        r23 = r0;
        r23 = r29 * r23;
        r23 = r23 >> 16;
        r0 = r23;
        r1 = r34;
        r0 = r0 + r1;
        r23 = r0;
        r26[r30] = r23;
        r37 = r30 + 1;
        goto L_0x011a;
    L_0x0baa:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r60 = r21;
        r60 = (p000.Resource) r60;
        r40 = r60;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r36 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 1;
        r35 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r45 = r26[r24];
        r24 = 2055009934; // 0x7a7cf68e float:3.2836488E35 double:1.0153098103E-314;
        r0 = r40;
        r1 = r29;
        r2 = r34;
        r3 = r31;
        r4 = r25;
        r5 = r30;
        r6 = r23;
        r7 = r36;
        r8 = r35;
        r9 = r45;
        r10 = r24;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        goto L_0x021c;
    L_0x0bf3:
        r36 = r28;
        r35 = r27;
        r45 = r22;
        goto L_0x06e9;
    L_0x0bfc:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r61 = r21;
        r61 = (p000.Resource) r61;
        r40 = r61;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r46 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 1;
        r47 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r48 = r26[r24];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r49 = r26[r45];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r50 = r26[r35];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r51 = r26[r36];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r52 = r26[r45];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r53 = r26[r35];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r57 = r26[r36];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r45 = r26[r45];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r35 = r26[r35];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r36 = r26[r36];
        r0 = r65;
        r0 = r0.path;
        r38 = r0;
        r39 = r38[r66];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r40;
        r1 = r29;
        r2 = r34;
        r3 = r31;
        r4 = r25;
        r5 = r30;
        r6 = r23;
        r7 = r46;
        r8 = r47;
        r9 = r48;
        r10 = r49;
        r11 = r50;
        r12 = r51;
        r13 = r52;
        r14 = r53;
        r15 = r57;
        r16 = r45;
        r17 = r35;
        r18 = r36;
        r19 = r39;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        goto L_0x021c;
    L_0x0ca9:
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r62 = r21;
        r62 = (p000.Resource) r62;
        r40 = r62;
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r66 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 1;
        r37 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r36 = r26[r24];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r35 = r26[r22];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r45 = r26[r27];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r46 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r47 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r48 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r49 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r50 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r51 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r52 = r26[r28];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r40;
        r1 = r29;
        r2 = r34;
        r3 = r31;
        r4 = r25;
        r5 = r30;
        r6 = r23;
        r7 = r66;
        r8 = r37;
        r9 = r36;
        r10 = r35;
        r11 = r45;
        r12 = r46;
        r13 = r47;
        r14 = r48;
        r15 = r49;
        r16 = r50;
        r17 = r51;
        r18 = r52;
        r19 = r39;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r0 = r64;
        r0 = r0.this$0;
        r21 = r0;
        r63 = r21;
        r63 = (p000.Resource) r63;
        r40 = r63;
        r0 = r64;
        r0 = r0.flags;
        r26 = r0;
        r24 = 3;
        r66 = r26[r24];
        r0 = r64;
        r0 = r0.id;
        r26 = r0;
        r24 = 3;
        r30 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 0;
        r34 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 2;
        r37 = r26[r24];
        r0 = r64;
        r0 = r0.items;
        r26 = r0;
        r24 = 3;
        r36 = r26[r24];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r35 = r26[r22];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r45 = r26[r27];
        r0 = r64;
        r0 = r0.length;
        r26 = r0;
        r46 = r26[r28];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r47 = r26[r22];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r48 = r26[r27];
        r0 = r64;
        r0 = r0.key;
        r26 = r0;
        r49 = r26[r28];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r22 = r26[r22];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r27 = r26[r27];
        r0 = r64;
        r0 = r0.value;
        r26 = r0;
        r28 = r26[r28];
        r24 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r40;
        r1 = r29;
        r2 = r31;
        r3 = r66;
        r4 = r25;
        r5 = r23;
        r6 = r30;
        r7 = r34;
        r8 = r37;
        r9 = r36;
        r10 = r35;
        r11 = r45;
        r12 = r46;
        r13 = r47;
        r14 = r48;
        r15 = r49;
        r16 = r22;
        r17 = r27;
        r18 = r28;
        r19 = r39;
        r20 = r24;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        return;
    L_0x0e02:
        r35 = r55;
        goto L_0x00a5;
    L_0x0e07:
        r36 = r45;
        goto L_0x00e0;
    L_0x0e0c:
        r45 = r35;
        goto L_0x092f;
    L_0x0e11:
        r37 = r30;
        goto L_0x011a;
    L_0x0e16:
        r30 = r36;
        goto L_0x0af0;
    L_0x0e1b:
        r55 = 0;
        goto L_0x05eb;
    L_0x0e20:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: AtomicInteger.toString(Integer, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void toString(p000.Integer r69, int r70, int r71) {
        /*
        r68 = this;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x04dc }
        r71 = r0;
        r23 = -1575402035; // 0xffffffffa21945cd float:-2.0772319E-18 double:NaN;
        r22 = r71 * r23;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x04dc }
        r71 = r0;
        r23 = -1508152919; // 0xffffffffa61b69a9 float:-5.3919624E-16 double:NaN;
        r24 = r23 * r71;
        r0 = r69;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r26 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.queue;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r27 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r71 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r28 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r29 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r30 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x04dc }
        r31 = r0;
        if (r31 != 0) goto L_0x0660;
    L_0x0056:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r23 = 0;
        r0 = r23;
        r1 = r21;
        r1.f200b = r0;	 Catch:{ RuntimeException -> 0x04dc }
    L_0x0064:
        r23 = 50;
        r0 = r28;
        r1 = r23;
        if (r0 < r1) goto L_0x0336;
    L_0x006c:
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r33 = r32[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 0;
        r25[r23] = r33;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r33 = r32[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 0;
        r25[r23] = r33;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = 1;
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r33 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 0;
        r25[r23] = r33;	 Catch:{ RuntimeException -> 0x04dc }
    L_0x00a4:
        r23 = 50;
        r0 = r29;
        r1 = r23;
        if (r0 < r1) goto L_0x08d3;
    L_0x00ac:
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r33 = r32[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r25[r34] = r33;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r33 = r32[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r25[r34] = r33;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r69;
        r0 = r0.current;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r35 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r25[r34] = r35;	 Catch:{ RuntimeException -> 0x04dc }
        r33 = r34 + 1;
    L_0x00de:
        r23 = 50;
        r0 = r30;
        r1 = r23;
        if (r0 < r1) goto L_0x0721;
    L_0x00e6:
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r24 = r32[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r25[r33] = r24;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.next;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r24 = r32[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r25[r33] = r24;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r69;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r22 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r25[r33] = r22;	 Catch:{ RuntimeException -> 0x04dc }
        r35 = r33 + 1;
    L_0x0118:
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 0;
        r24 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 1;
        r29 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 2;
        r22 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 0;
        r28 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 1;
        r33 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 2;
        r30 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r23 = 0;
        r0 = r23;
        r1 = r21;
        r1.f201c = r0;	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 3;
        r0 = r35;
        r1 = r23;
        if (r0 != r1) goto L_0x021a;
    L_0x016a:
        if (r24 < 0) goto L_0x01b4;
    L_0x016c:
        if (r29 < 0) goto L_0x01b4;
    L_0x016e:
        if (r22 < 0) goto L_0x01b4;
    L_0x0170:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x04dc }
        r36 = r0;
        r23 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r36 = r23 * r36;
        r0 = r24;
        r1 = r36;
        if (r0 > r1) goto L_0x01b4;
    L_0x0185:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x04dc }
        r36 = r0;
        r23 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r36 = r23 * r36;
        r0 = r29;
        r1 = r36;
        if (r0 > r1) goto L_0x01b4;
    L_0x019a:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x04dc }
        r36 = r0;
        r23 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r0 = r36;
        r1 = r23;
        r0 = r0 * r1;
        r36 = r0;
        r0 = r22;
        r1 = r36;
        if (r0 <= r1) goto L_0x01c2;
    L_0x01b4:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r23 = 1;
        r0 = r23;
        r1 = r21;
        r1.f201c = r0;	 Catch:{ RuntimeException -> 0x04dc }
    L_0x01c2:
        r0 = r69;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x04dc }
        r37 = r0;
        if (r37 == 0) goto L_0x01da;
    L_0x01ca:
        r0 = r69;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x04dc }
        r37 = r0;
        r38 = r37[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = -1;
        r0 = r23;
        r1 = r38;
        if (r0 != r1) goto L_0x0d89;
    L_0x01da:
        r0 = r69;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = -1;
        r0 = r36;
        r1 = r23;
        if (r0 != r1) goto L_0x0dc8;
    L_0x01ea:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r40 = r21;
        r40 = (p000.Resource) r40;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r40;
        r25 = p000.LazyList.text;
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r36 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r36 = r25[r36];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r39;
        r1 = r28;
        r2 = r33;
        r3 = r30;
        r4 = r24;
        r5 = r29;
        r6 = r22;
        r7 = r36;
        r8 = r23;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ RuntimeException -> 0x04dc }
    L_0x021a:
        r23 = 4;
        r0 = r35;
        r1 = r23;
        if (r0 != r1) goto L_0x0e25;
    L_0x0222:
        if (r24 < 0) goto L_0x0297;
    L_0x0224:
        if (r29 < 0) goto L_0x0297;
    L_0x0226:
        if (r22 < 0) goto L_0x0297;
    L_0x0228:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x04dc }
        r35 = r0;
        r23 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r0 = r35;
        r1 = r23;
        r0 = r0 * r1;
        r35 = r0;
        r0 = r24;
        r1 = r35;
        if (r0 > r1) goto L_0x0297;
    L_0x0242:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x04dc }
        r35 = r0;
        r23 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r35 = r23 * r35;
        r0 = r29;
        r1 = r35;
        if (r0 > r1) goto L_0x0297;
    L_0x0257:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x04dc }
        r35 = r0;
        r23 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r35 = r23 * r35;
        r0 = r22;
        r1 = r35;
        if (r0 > r1) goto L_0x0297;
    L_0x026c:
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r35 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        if (r35 < 0) goto L_0x0297;
    L_0x0278:
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r35 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x04dc }
        r36 = r0;
        r23 = 784773023; // 0x2ec6af9f float:9.035194E-11 double:3.877293904E-315;
        r36 = r23 * r36;
        r0 = r35;
        r1 = r36;
        if (r0 <= r1) goto L_0x02a5;
    L_0x0297:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r23 = 1;
        r0 = r23;
        r1 = r21;
        r1.f201c = r0;	 Catch:{ RuntimeException -> 0x04dc }
    L_0x02a5:
        r0 = r69;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x04dc }
        r37 = r0;
        if (r37 == 0) goto L_0x02bd;
    L_0x02ad:
        r0 = r69;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x04dc }
        r37 = r0;
        r38 = r37[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = -1;
        r0 = r38;
        r1 = r23;
        if (r0 != r1) goto L_0x0b28;
    L_0x02bd:
        r0 = r69;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r71 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = -1;
        r0 = r71;
        r1 = r23;
        if (r0 != r1) goto L_0x0680;
    L_0x02cd:
        r25 = p000.LazyList.text;
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r70 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r70 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r41 = r21;
        r41 = (p000.Resource) r41;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r41;
        r23 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r39;
        r1 = r28;
        r2 = r33;
        r3 = r30;
        r4 = r24;
        r5 = r29;
        r6 = r22;
        r7 = r70;
        r8 = r23;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r42 = r21;
        r42 = (p000.Resource) r42;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r42;
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r71 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r27 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 1096146303; // 0x4155dd7f float:13.366576 double:5.41568231E-315;
        r0 = r39;
        r1 = r28;
        r2 = r30;
        r3 = r71;
        r4 = r24;
        r5 = r22;
        r6 = r27;
        r7 = r70;
        r8 = r23;
        r0.parse(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ RuntimeException -> 0x04dc }
        return;
    L_0x0336:
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r35 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r33 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 50;
        r0 = r30;
        r1 = r23;
        if (r0 < r1) goto L_0x0e20;
    L_0x0356:
        r23 = 50;
        r34 = r23 - r28;
        r25 = p000.LazyList.f11c;
        r43 = r30 - r28;
        r43 = r25[r43];	 Catch:{ RuntimeException -> 0x04dc }
        r34 = r43 * r34;
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r43 = r32[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r43;
        r1 = r36;
        r0 = r0 - r1;
        r43 = r0;
        r1 = r34;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 >> 16;
        r0 = r43;
        r1 = r36;
        r0 = r0 + r1;
        r43 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r44 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r44;
        r1 = r23;
        r0 = r0 * r1;
        r44 = r0;
        r0 = r43;
        r1 = r44;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 / 50;
        r0 = r43;
        r1 = r22;
        r0 = r0 + r1;
        r43 = r0;
        r23 = 0;
        r25[r23] = r43;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r43 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r43 = r23 * r43;
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r44 = r32[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r44;
        r1 = r35;
        r0 = r0 - r1;
        r44 = r0;
        r1 = r34;
        r0 = r0 * r1;
        r44 = r0;
        r44 = r44 >> 16;
        r0 = r44;
        r1 = r35;
        r0 = r0 + r1;
        r44 = r0;
        r0 = r43;
        r1 = r44;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 / 50;
        r0 = r43;
        r1 = r24;
        r0 = r0 + r1;
        r43 = r0;
        r23 = 0;
        r25[r23] = r43;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r45 = 1;
        r0 = r69;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r43 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r43;
        r1 = r33;
        r0 = r0 - r1;
        r43 = r0;
        r0 = r34;
        r1 = r43;
        r0 = r0 * r1;
        r34 = r0;
        r34 = r34 >> 16;
        r0 = r34;
        r1 = r33;
        r0 = r0 + r1;
        r34 = r0;
        r23 = 0;
        r25[r23] = r34;	 Catch:{ RuntimeException -> 0x04dc }
    L_0x041e:
        r23 = 50;
        r0 = r29;
        r1 = r23;
        if (r0 < r1) goto L_0x0e1b;
    L_0x0426:
        r25 = p000.LazyList.f11c;
        r34 = r29 - r28;
        r34 = r25[r34];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 50;
        r43 = r23 - r28;
        r43 = r34 * r43;
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r34 = r32[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r34;
        r1 = r36;
        r0 = r0 - r1;
        r34 = r0;
        r1 = r43;
        r0 = r0 * r1;
        r34 = r0;
        r34 = r34 >> 16;
        r0 = r36;
        r1 = r34;
        r0 = r0 + r1;
        r36 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r34 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r34 = r23 * r34;
        r0 = r36;
        r1 = r34;
        r0 = r0 * r1;
        r36 = r0;
        r36 = r36 / 50;
        r0 = r36;
        r1 = r22;
        r0 = r0 + r1;
        r36 = r0;
        r25[r45] = r36;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r36 = r32[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r36;
        r1 = r35;
        r0 = r0 - r1;
        r36 = r0;
        r1 = r43;
        r0 = r0 * r1;
        r36 = r0;
        r36 = r36 >> 16;
        r0 = r35;
        r1 = r36;
        r0 = r0 + r1;
        r35 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r36 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r36 = r23 * r36;
        r0 = r35;
        r1 = r36;
        r0 = r0 * r1;
        r35 = r0;
        r35 = r35 / 50;
        r0 = r35;
        r1 = r24;
        r0 = r0 + r1;
        r35 = r0;
        r25[r45] = r35;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r45 + 1;
        r0 = r69;
        r0 = r0.current;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r35 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r35;
        r1 = r33;
        r0 = r0 - r1;
        r35 = r0;
        r35 = r43 * r35;
        r35 = r35 >> 16;
        r33 = r35 + r33;
        r25[r45] = r33;	 Catch:{ RuntimeException -> 0x04dc }
        goto L_0x00a4;
    L_0x04dc:
        r46 = move-exception;
        r47 = new java.lang.StringBuilder;
        r0 = r47;
        r0.<init>();
        r48 = "bv.ay(";
        r0 = r47;
        r1 = r48;
        r47 = r0.append(r1);
        r23 = 41;
        r0 = r47;
        r1 = r23;
        r47 = r0.append(r1);
        r0 = r47;
        r49 = r0.toString();
        r0 = r46;
        r1 = r49;
        r50 = p000.StringBuilder.append(r0, r1);
        throw r50;
    L_0x0507:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r51 = r21;
        r51 = (p000.Resource) r51;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r51;
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 0;
        r70 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 1;
        r35 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 2;
        r36 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r43 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r44 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r52 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r53 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r54 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r55 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r56 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r57 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r28;
        r2 = r33;
        r3 = r30;
        r4 = r24;
        r5 = r29;
        r6 = r22;
        r7 = r70;
        r8 = r35;
        r9 = r36;
        r10 = r34;
        r11 = r43;
        r12 = r44;
        r13 = r52;
        r14 = r53;
        r15 = r54;
        r16 = r55;
        r17 = r56;
        r18 = r57;
        r19 = r38;
        r20 = r23;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r58 = r21;
        r58 = (p000.Resource) r58;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r58;
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r70 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r29 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 0;
        r33 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 2;
        r35 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r36 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r43 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r44 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r52 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r53 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r54 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r26 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r27 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r71 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r28;
        r2 = r30;
        r3 = r70;
        r4 = r24;
        r5 = r22;
        r6 = r29;
        r7 = r33;
        r8 = r35;
        r9 = r36;
        r10 = r34;
        r11 = r43;
        r12 = r44;
        r13 = r52;
        r14 = r53;
        r15 = r54;
        r16 = r26;
        r17 = r27;
        r18 = r71;
        r19 = r38;
        r20 = r23;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ RuntimeException -> 0x04dc }
        return;
    L_0x0660:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r69;
        r0 = r0.position;	 Catch:{ RuntimeException -> 0x04dc }
        r31 = r0;
        r45 = r31[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r38 = r45 & r23;
        r23 = 733034757; // 0x2bb13905 float:1.2592433E-12 double:3.621672906E-315;
        r33 = r23 * r38;
        r0 = r33;
        r1 = r21;
        r1.f200b = r0;	 Catch:{ RuntimeException -> 0x04dc }
        goto L_0x0064;
    L_0x0680:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r59 = r21;
        r59 = (p000.Resource) r59;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r59;
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 0;
        r70 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 1;
        r71 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 2;
        r27 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 1827695322; // 0x6cf06ada float:2.3251743E27 double:9.030014697E-315;
        r0 = r39;
        r1 = r28;
        r2 = r33;
        r3 = r30;
        r4 = r24;
        r5 = r29;
        r6 = r22;
        r7 = r70;
        r8 = r71;
        r9 = r27;
        r10 = r23;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r60 = r21;
        r60 = (p000.Resource) r60;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r60;
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r70 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r71 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 0;
        r27 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 2;
        r26 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r29 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 1193838011; // 0x472885bb float:43141.73 double:5.89834348E-315;
        r0 = r39;
        r1 = r28;
        r2 = r30;
        r3 = r70;
        r4 = r24;
        r5 = r22;
        r6 = r71;
        r7 = r27;
        r8 = r26;
        r9 = r29;
        r10 = r23;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ RuntimeException -> 0x04dc }
        return;
    L_0x0721:
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r35 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 50;
        r0 = r29;
        r1 = r23;
        if (r0 < r1) goto L_0x0812;
    L_0x0741:
        r23 = 50;
        r43 = r23 - r30;
        r25 = p000.LazyList.f11c;
        r0 = r29;
        r1 = r30;
        r0 = r0 - r1;
        r29 = r0;
        r29 = r25[r29];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r29;
        r1 = r43;
        r0 = r0 * r1;
        r29 = r0;
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r43 = r32[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r43;
        r1 = r34;
        r0 = r0 - r1;
        r43 = r0;
        r1 = r29;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 >> 16;
        r0 = r43;
        r1 = r34;
        r0 = r0 + r1;
        r43 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r44 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r44;
        r1 = r23;
        r0 = r0 * r1;
        r44 = r0;
        r0 = r43;
        r1 = r44;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 / 50;
        r0 = r43;
        r1 = r22;
        r0 = r0 + r1;
        r43 = r0;
        r25[r33] = r43;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r43 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r43;
        r1 = r23;
        r0 = r0 * r1;
        r43 = r0;
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r44 = r32[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r44;
        r1 = r36;
        r0 = r0 - r1;
        r44 = r0;
        r1 = r29;
        r0 = r0 * r1;
        r44 = r0;
        r44 = r44 >> 16;
        r0 = r44;
        r1 = r36;
        r0 = r0 + r1;
        r44 = r0;
        r0 = r43;
        r1 = r44;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 / 50;
        r0 = r43;
        r1 = r24;
        r0 = r0 + r1;
        r43 = r0;
        r25[r33] = r43;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r69;
        r0 = r0.current;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r44 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r44;
        r1 = r35;
        r0 = r0 - r1;
        r44 = r0;
        r0 = r29;
        r1 = r44;
        r0 = r0 * r1;
        r29 = r0;
        r29 = r29 >> 16;
        r0 = r29;
        r1 = r35;
        r0 = r0 + r1;
        r29 = r0;
        r25[r33] = r29;	 Catch:{ RuntimeException -> 0x04dc }
        r33 = r33 + 1;
    L_0x0812:
        r23 = 50;
        r0 = r28;
        r1 = r23;
        if (r0 < r1) goto L_0x0e11;
    L_0x081a:
        r23 = 50;
        r29 = r23 - r30;
        r25 = p000.LazyList.f11c;
        r0 = r28;
        r1 = r30;
        r0 = r0 - r1;
        r28 = r0;
        r28 = r25[r28];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r28;
        r1 = r29;
        r0 = r0 * r1;
        r28 = r0;
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r30 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r30 = r23 * r30;
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r29 = r32[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r29;
        r1 = r34;
        r0 = r0 - r1;
        r29 = r0;
        r1 = r28;
        r0 = r0 * r1;
        r29 = r0;
        r29 = r29 >> 16;
        r29 = r34 + r29;
        r30 = r29 * r30;
        r30 = r30 / 50;
        r22 = r30 + r22;
        r25[r33] = r22;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r22 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r22;
        r1 = r23;
        r0 = r0 * r1;
        r22 = r0;
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r30 = r32[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r30;
        r1 = r36;
        r0 = r0 - r1;
        r30 = r0;
        r1 = r28;
        r0 = r0 * r1;
        r30 = r0;
        r30 = r30 >> 16;
        r0 = r30;
        r1 = r36;
        r0 = r0 + r1;
        r30 = r0;
        r0 = r22;
        r1 = r30;
        r0 = r0 * r1;
        r22 = r0;
        r22 = r22 / 50;
        r24 = r22 + r24;
        r25[r33] = r24;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r22 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r22;
        r1 = r35;
        r0 = r0 - r1;
        r22 = r0;
        r1 = r28;
        r0 = r0 * r1;
        r22 = r0;
        r22 = r22 >> 16;
        r0 = r22;
        r1 = r35;
        r0 = r0 + r1;
        r22 = r0;
        r25[r33] = r22;	 Catch:{ RuntimeException -> 0x04dc }
        r35 = r33 + 1;
        goto L_0x0118;
    L_0x08d3:
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r43 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.current;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r35 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 50;
        r0 = r28;
        r1 = r23;
        if (r0 < r1) goto L_0x0e16;
    L_0x08f3:
        r23 = 50;
        r33 = r23 - r29;
        r25 = p000.LazyList.f11c;
        r44 = r28 - r29;
        r44 = r25[r44];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r44;
        r1 = r33;
        r0 = r0 * r1;
        r44 = r0;
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r33 = r32[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r33;
        r1 = r43;
        r0 = r0 - r1;
        r33 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r33 = r0;
        r33 = r33 >> 16;
        r0 = r33;
        r1 = r43;
        r0 = r0 + r1;
        r33 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r52 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r52 = r23 * r52;
        r0 = r33;
        r1 = r52;
        r0 = r0 * r1;
        r33 = r0;
        r33 = r33 / 50;
        r0 = r33;
        r1 = r22;
        r0 = r0 + r1;
        r33 = r0;
        r25[r34] = r33;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r33 = r32[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r33;
        r1 = r36;
        r0 = r0 - r1;
        r33 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r33 = r0;
        r33 = r33 >> 16;
        r0 = r33;
        r1 = r36;
        r0 = r0 + r1;
        r33 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r52 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r52 = r23 * r52;
        r0 = r33;
        r1 = r52;
        r0 = r0 * r1;
        r33 = r0;
        r33 = r33 / 50;
        r0 = r33;
        r1 = r24;
        r0 = r0 + r1;
        r33 = r0;
        r25[r34] = r33;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r33 = r34 + 1;
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r52 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r52;
        r1 = r35;
        r0 = r0 - r1;
        r52 = r0;
        r0 = r44;
        r1 = r52;
        r0 = r0 * r1;
        r44 = r0;
        r44 = r44 >> 16;
        r0 = r44;
        r1 = r35;
        r0 = r0 + r1;
        r44 = r0;
        r25[r34] = r44;	 Catch:{ RuntimeException -> 0x04dc }
    L_0x09b5:
        r23 = 50;
        r0 = r30;
        r1 = r23;
        if (r0 < r1) goto L_0x00de;
    L_0x09bd:
        r23 = 50;
        r34 = r23 - r29;
        r25 = p000.LazyList.f11c;
        r44 = r30 - r29;
        r44 = r25[r44];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r34;
        r1 = r44;
        r0 = r0 * r1;
        r34 = r0;
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r44 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r44 = r23 * r44;
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r52 = r32[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r52;
        r1 = r43;
        r0 = r0 - r1;
        r52 = r0;
        r1 = r34;
        r0 = r0 * r1;
        r52 = r0;
        r52 = r52 >> 16;
        r0 = r43;
        r1 = r52;
        r0 = r0 + r1;
        r43 = r0;
        r1 = r44;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 / 50;
        r0 = r43;
        r1 = r22;
        r0 = r0 + r1;
        r43 = r0;
        r25[r33] = r43;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r43 = r32[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r43;
        r1 = r36;
        r0 = r0 - r1;
        r43 = r0;
        r1 = r34;
        r0 = r0 * r1;
        r43 = r0;
        r43 = r43 >> 16;
        r0 = r36;
        r1 = r43;
        r0 = r0 + r1;
        r36 = r0;
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r43 = r0;
        r23 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r43 = r23 * r43;
        r0 = r36;
        r1 = r43;
        r0 = r0 * r1;
        r36 = r0;
        r36 = r36 / 50;
        r0 = r36;
        r1 = r24;
        r0 = r0 + r1;
        r36 = r0;
        r25[r33] = r36;	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r0 = r69;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x04dc }
        r32 = r0;
        r43 = r32[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r43;
        r1 = r35;
        r0 = r0 - r1;
        r43 = r0;
        r0 = r34;
        r1 = r43;
        r0 = r0 * r1;
        r34 = r0;
        r34 = r34 >> 16;
        r35 = r34 + r35;
        r25[r33] = r35;	 Catch:{ RuntimeException -> 0x04dc }
        r33 = r33 + 1;
        goto L_0x00de;
    L_0x0a7b:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r61 = r21;
        r61 = (p000.Resource) r61;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r61;
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 0;
        r44 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 1;
        r52 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 2;
        r53 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r54 = r25[r43];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r55 = r25[r34];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r56 = r25[r36];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r57 = r25[r43];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r62 = r25[r34];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r63 = r25[r36];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r43 = r25[r43];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r25[r34];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r36];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x04dc }
        r37 = r0;
        r38 = r37[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r28;
        r2 = r33;
        r3 = r30;
        r4 = r24;
        r5 = r29;
        r6 = r22;
        r7 = r44;
        r8 = r52;
        r9 = r53;
        r10 = r54;
        r11 = r55;
        r12 = r56;
        r13 = r57;
        r14 = r62;
        r15 = r63;
        r16 = r43;
        r17 = r34;
        r18 = r36;
        r19 = r38;
        r20 = r23;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ RuntimeException -> 0x04dc }
        goto L_0x021a;
    L_0x0b28:
        r0 = r69;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x04dc }
        r31 = r0;
        if (r31 == 0) goto L_0x0d86;
    L_0x0b30:
        r0 = r69;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x04dc }
        r31 = r0;
        r45 = r31[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = -1;
        r0 = r45;
        r1 = r23;
        if (r0 == r1) goto L_0x0d86;
    L_0x0b40:
        r0 = r69;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x04dc }
        r31 = r0;
        r45 = r31[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r38 = r45 & r23;
        r0 = r69;
        r0 = r0.values;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r26 = r25[r38];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.table;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r27 = r25[r38];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r71 = r25[r38];	 Catch:{ RuntimeException -> 0x04dc }
    L_0x0b64:
        r0 = r69;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x04dc }
        r37 = r0;
        r38 = r37[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r35 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = -1;
        r0 = r23;
        r1 = r35;
        if (r0 != r1) goto L_0x0507;
    L_0x0b7c:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r64 = r21;
        r64 = (p000.Resource) r64;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r64;
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r35 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r43 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r44 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r52 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r53 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r54 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r55 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r56 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r57 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r62 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r28;
        r2 = r33;
        r3 = r30;
        r4 = r24;
        r5 = r29;
        r6 = r22;
        r7 = r35;
        r8 = r36;
        r9 = r34;
        r10 = r43;
        r11 = r44;
        r12 = r52;
        r13 = r53;
        r14 = r54;
        r15 = r55;
        r16 = r56;
        r17 = r57;
        r18 = r62;
        r19 = r38;
        r20 = r23;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r65 = r21;
        r65 = (p000.Resource) r65;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r65;
        r0 = r68;
        r0 = r0.flags;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r29 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.id;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 3;
        r33 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r35 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r70 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r43 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r44 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r52 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r53 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r54 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r26 = r25[r26];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r27 = r25[r27];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r71 = r25[r71];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r28;
        r2 = r30;
        r3 = r29;
        r4 = r24;
        r5 = r22;
        r6 = r33;
        r7 = r35;
        r8 = r36;
        r9 = r70;
        r10 = r34;
        r11 = r43;
        r12 = r44;
        r13 = r52;
        r14 = r53;
        r15 = r54;
        r16 = r26;
        r17 = r27;
        r18 = r71;
        r19 = r38;
        r20 = r23;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ RuntimeException -> 0x04dc }
        return;
    L_0x0cc9:
        r36 = r71;
        r34 = r27;
        r43 = r26;
    L_0x0ccf:
        r0 = r69;
        r0 = r0.index;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r44 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = -1;
        r0 = r23;
        r1 = r44;
        if (r0 != r1) goto L_0x0a7b;
    L_0x0cdf:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r66 = r21;
        r66 = (p000.Resource) r66;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r66;
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r44 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r52 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.list;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r53 = r25[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r54 = r25[r43];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r55 = r25[r34];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r56 = r25[r36];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r57 = r25[r43];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r62 = r25[r34];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.key;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r63 = r25[r36];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r43 = r25[r43];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r25[r34];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r36];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.path;	 Catch:{ RuntimeException -> 0x04dc }
        r37 = r0;
        r38 = r37[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 16711935; // 0xff00ff float:2.3418409E-38 double:8.256793E-317;
        r0 = r39;
        r1 = r28;
        r2 = r33;
        r3 = r30;
        r4 = r24;
        r5 = r29;
        r6 = r22;
        r7 = r44;
        r8 = r52;
        r9 = r53;
        r10 = r54;
        r11 = r55;
        r12 = r56;
        r13 = r57;
        r14 = r62;
        r15 = r63;
        r16 = r43;
        r17 = r34;
        r18 = r36;
        r19 = r38;
        r20 = r23;
        r0.toString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ RuntimeException -> 0x04dc }
        goto L_0x021a;
    L_0x0d86:
        goto L_0x0b64;
    L_0x0d89:
        r0 = r69;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x04dc }
        r31 = r0;
        if (r31 == 0) goto L_0x0cc9;
    L_0x0d91:
        r0 = r69;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x04dc }
        r31 = r0;
        r45 = r31[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = -1;
        r0 = r23;
        r1 = r45;
        if (r0 == r1) goto L_0x0cc9;
    L_0x0da1:
        r0 = r69;
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x04dc }
        r31 = r0;
        r45 = r31[r70];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r38 = r45 & r23;
        r0 = r69;
        r0 = r0.values;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r43 = r25[r38];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.table;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r34 = r25[r38];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r69;
        r0 = r0.parent;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r36 = r25[r38];	 Catch:{ RuntimeException -> 0x04dc }
        goto L_0x0ccf;
    L_0x0dc8:
        r0 = r68;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x04dc }
        r21 = r0;
        r67 = r21;
        r67 = (p000.Resource) r67;	 Catch:{ RuntimeException -> 0x04dc }
        r39 = r67;
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 0;
        r36 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 1;
        r34 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r0 = r68;
        r0 = r0.items;	 Catch:{ RuntimeException -> 0x04dc }
        r25 = r0;
        r23 = 2;
        r43 = r25[r23];	 Catch:{ RuntimeException -> 0x04dc }
        r23 = 1596778500; // 0x5f2ce804 float:1.2459213E19 double:7.88913401E-315;
        r0 = r39;
        r1 = r28;
        r2 = r33;
        r3 = r30;
        r4 = r24;
        r5 = r29;
        r6 = r22;
        r7 = r36;
        r8 = r34;
        r9 = r43;
        r10 = r23;
        r0.getSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ RuntimeException -> 0x04dc }
        goto L_0x021a;
    L_0x0e11:
        r35 = r33;
        goto L_0x0118;
    L_0x0e16:
        r33 = r34;
        goto L_0x09b5;
    L_0x0e1b:
        r34 = r45;
        goto L_0x00a4;
    L_0x0e20:
        r45 = 0;
        goto L_0x041e;
    L_0x0e25:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: AtomicInteger.toString(Integer, int, int):void");
    }

    public final void toString(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6) {
        this.size[0] = -1;
        if (!(integer.f146x == 2 || 1 == integer.f146x)) {
            integer.set();
        }
        int $i7 = this.this$0.data * -1575402035;
        int $i8 = -1508152919 * this.this$0.parent;
        int $i9 = LazyList.offset[i];
        int $i10 = LazyList.state[i];
        int $i11 = LazyList.offset[i2];
        int $i12 = LazyList.state[i2];
        int $i13 = LazyList.offset[i3];
        int $i14 = LazyList.state[i3];
        int $i15 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i16 = (($i15 * i5) + (i6 * $i3)) >> 16;
        for (int $i17 = 0; $i17 < integer.size; $i17++) {
            int $i18;
            int $i21;
            int $i19 = integer.next[$i17];
            int i7 = integer.length[$i17];
            int i8 = integer.this$0[$i17];
            if (i3 != 0) {
                $i18 = (($i19 * $i14) + ($i13 * i7)) >> 16;
                i7 = ((i7 * $i14) - ($i19 * $i13)) >> 16;
            } else {
                $i18 = $i19;
            }
            if (i != 0) {
                $i19 = (i7 * $i10) - ($i9 * i8);
                $i21 = i8 * $i10;
                i8 = $i21;
                i8 = ($i21 + (i7 * $i9)) >> 16;
                i7 = $i19 >> 16;
            }
            if (i2 != 0) {
                $i19 = ((i8 * $i11) + ($i18 * $i12)) >> 16;
                i8 = ((i8 * $i12) - ($i18 * $i11)) >> 16;
            } else {
                $i19 = $i18;
            }
            $i18 = $i19 + i4;
            i7 += i5;
            $i19 = i8 + i6;
            i8 = (($i3 * i7) - ($i19 * $i15)) >> 16;
            i7 = (($i19 * $i3) + (i7 * $i15)) >> 16;
            this.data[$i17] = i7 - $i16;
            $i21 = this.this$0.this$0 * -337002440;
            $i19 = $i21;
            $i21 *= $i18;
            $i19 = $i21;
            $i21 /= i7;
            $i19 = $i21;
            this.count[$i17] = $i21 + $i7;
            $i21 = (542614623 * this.this$0.this$0) * i8;
            $i19 = $i21;
            $i21 /= i7;
            $i19 = $i21;
            this.next[$i17] = $i21 + $i8;
            if (integer.value > 0) {
                this.length[$i17] = $i18;
                this.key[$i17] = i8;
                this.value[$i17] = i7;
            }
        }
        try {
            get(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void toString(Integer integer, int i, int i2, int i3, int $i3, int i4, int i5, int i6, int i7) {
        this.size[0] = -1;
        if (!(2 == integer.f146x || 1 == integer.f146x)) {
            integer.set();
        }
        int $i8 = -1575402035 * this.this$0.data;
        int $i9 = -1581674473 * this.this$0.parent;
        int $i10 = LazyList.offset[i];
        int $i11 = LazyList.state[i];
        int $i12 = LazyList.offset[i2];
        int $i13 = LazyList.state[i2];
        int $i14 = LazyList.offset[i3];
        int $i15 = LazyList.state[i3];
        int $i16 = LazyList.offset[$i3];
        $i3 = LazyList.state[$i3];
        int $i17 = (($i3 * i6) + (i5 * $i16)) >> 16;
        for (int $i18 = 0; $i18 < integer.size; $i18++) {
            int $i19;
            int $i22;
            int $i20 = integer.next[$i18];
            int i8 = integer.length[$i18];
            int i9 = integer.this$0[$i18];
            if (i3 != 0) {
                $i19 = ((i8 * $i14) + ($i15 * $i20)) >> 16;
                i8 = ((i8 * $i15) - ($i20 * $i14)) >> 16;
            } else {
                $i19 = $i20;
            }
            if (i != 0) {
                $i20 = ($i11 * i8) - (i9 * $i10);
                $i22 = i9 * $i11;
                i9 = $i22;
                i9 = ($i22 + (i8 * $i10)) >> 16;
                i8 = $i20 >> 16;
            }
            if (i2 != 0) {
                $i20 = (($i12 * i9) + ($i13 * $i19)) >> 16;
                i9 = ((i9 * $i13) - ($i19 * $i12)) >> 16;
            } else {
                $i20 = $i19;
            }
            $i19 = $i20 + i4;
            i8 += i5;
            $i20 = i9 + i6;
            i9 = (($i3 * i8) - ($i20 * $i16)) >> 16;
            i8 = (($i20 * $i3) + (i8 * $i16)) >> 16;
            this.data[$i18] = i8 - $i17;
            $i22 = this.this$0.this$0 * 542614623;
            $i20 = $i22;
            $i22 *= $i19;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.count[$i18] = $i22 + $i8;
            $i22 = this.this$0.this$0 * 109369913;
            $i20 = $i22;
            $i22 *= i9;
            $i20 = $i22;
            $i22 /= i7;
            $i20 = $i22;
            this.next[$i18] = $i22 + $i9;
            if (integer.value > 0) {
                this.length[$i18] = $i19;
                this.key[$i18] = i9;
                this.value[$i18] = i8;
            }
        }
        try {
            get(integer, false, false, 0);
        } catch (Exception e) {
        }
    }

    final void toString(Integer integer, boolean z, boolean z2, long j) {
        if (integer.head < 1600) {
            int $i2;
            int $i4;
            int $i5;
            int $i3;
            int $i7;
            int i;
            int $i6;
            int $i10;
            int $i11;
            int[] $r2;
            int[] $r4;
            for ($i2 = 0; $i2 < integer.head; $i2++) {
                this.size[$i2] = 0;
            }
            for ($i2 = 0; $i2 < integer.data; $i2++) {
                if (integer.index[$i2] != -2) {
                    $i4 = integer.count[$i2];
                    $i5 = integer.queue[$i2];
                    $i3 = integer.key[$i2];
                    $i7 = this.count[$i4];
                    i = this.count[$i5];
                    $i6 = this.count[$i3];
                    if (z && (-5000 == $i7 || i == -726832116 || -5000 == $i6)) {
                        $i10 = this.length[$i4];
                        i = this.length[$i5];
                        $i11 = this.length[$i3];
                        int $i12 = this.key[$i4];
                        $i7 = this.key[$i5];
                        int $i13 = this.key[$i3];
                        int $i14 = this.value[$i4];
                        $i6 = this.value[$i5];
                        $i10 -= i;
                        $i11 -= i;
                        $i12 -= $i7;
                        $i13 -= $i7;
                        $i14 -= $i6;
                        int $i15 = this.value[$i3] - $i6;
                        int $i8 = i * (($i12 * $i15) - ($i14 * $i13));
                        i = $i8;
                        if (((($i10 * $i13) - ($i11 * $i12)) * $i6) + ($i8 + ($i7 * (($i14 * $i11) - ($i15 * $i10)))) > 0) {
                            this.name[$i2] = true;
                            $i3 = integer.height + (((this.data[$i5] + this.data[$i4]) + this.data[$i3]) / 3);
                            $r2 = this.limit[$i3];
                            $r4 = this.size;
                            $i4 = $r4[$i3];
                            $r4[$i3] = $i4 + 1;
                            $r2[$i4] = $i2;
                        }
                    } else {
                        if (z2) {
                            if (StringBuffer.add(this.next[$i4], this.next[$i5], this.next[$i3], $i7, i, $i6, 5, 1303012465)) {
                                long[] $r8 = Main.value;
                                $i10 = Main.size + 1410156517;
                                Main.size = $i10;
                                $r8[($i10 * -281996859) - 1] = j;
                                z2 = false;
                            }
                        }
                        if ((($i7 - i) * (this.next[$i3] - this.next[$i5])) - (($i6 - i) * (this.next[$i4] - this.next[$i5])) > 0) {
                            this.name[$i2] = false;
                            if ($i7 >= 0 && i >= 0 && $i6 >= 0) {
                                Point $r9 = this.this$0;
                                if ($i7 <= -1554548006 * $r9.buffer) {
                                    $r9 = this.this$0;
                                    if (i <= 784773023 * $r9.buffer) {
                                        $r9 = this.this$0;
                                        if ($i6 <= 784773023 * $r9.buffer) {
                                            this.parent[$i2] = false;
                                            $i3 = (((this.data[$i5] + this.data[$i4]) + this.data[$i3]) / 3) + integer.height;
                                            $r2 = this.limit[$i3];
                                            $r4 = this.size;
                                            $i4 = $r4[$i3];
                                            $r4[$i3] = $i4 + 1;
                                            $r2[$i4] = $i2;
                                        }
                                    }
                                }
                            }
                            this.parent[$i2] = true;
                            $i3 = (((this.data[$i5] + this.data[$i4]) + this.data[$i3]) / 3) + integer.height;
                            $r2 = this.limit[$i3];
                            $r4 = this.size;
                            $i4 = $r4[$i3];
                            $r4[$i3] = $i4 + 1;
                            $r2[$i4] = $i2;
                        }
                    }
                }
            }
            if (integer.buffer == null) {
                for ($i2 = integer.head - 1; $i2 >= 0; $i2--) {
                    $i3 = this.size[$i2];
                    if ($i3 > 0) {
                        $r2 = this.limit[$i2];
                        for ($i4 = 0; $i4 < $i3; $i4++) {
                            add(integer, $r2[$i4], 941129778);
                        }
                    }
                }
            } else {
                for ($i2 = 0; $i2 < 12; $i2++) {
                    this.buffer[$i2] = 0;
                    this.index[$i2] = 0;
                }
                for ($i2 = integer.head - 1; $i2 >= 0; $i2--) {
                    $i3 = this.size[$i2];
                    if ($i3 > 0) {
                        $r2 = this.limit[$i2];
                        for ($i4 = 0; $i4 < $i3; $i4++) {
                            $i5 = $r2[$i4];
                            byte $b9 = integer.buffer[$i5];
                            $r4 = this.buffer;
                            $i6 = $r4[$b9];
                            $r4[$b9] = $i6 + 1;
                            this.head[$b9][$i6] = $i5;
                            if ($b9 < (byte) 10) {
                                $r4 = this.index;
                                $r4[$b9] = $r4[$b9] + $i2;
                            } else if ((byte) 10 == $b9) {
                                this.pos[$i6] = $i2;
                            } else {
                                this.log[$i6] = $i2;
                            }
                        }
                    }
                }
                $i2 = 0;
                if (this.buffer[1] > 0 || this.buffer[2] > 0) {
                    $i2 = (this.index[1] + this.index[2]) / (this.buffer[1] + this.buffer[2]);
                }
                $i3 = 0;
                if (this.buffer[3] > 0 || this.buffer[4] > 0) {
                    $i3 = (this.index[3] + this.index[4]) / (this.buffer[3] + this.buffer[4]);
                }
                $i4 = 0;
                if (this.buffer[6] > 0 || this.buffer[8] > 0) {
                    $i4 = (this.index[6] + this.index[8]) / (this.buffer[6] + this.buffer[8]);
                }
                $i7 = this.buffer[10];
                $r2 = this.head[10];
                $r4 = this.pos;
                if ($i7 == 0) {
                    $i7 = this.buffer[11];
                    $r2 = this.head[11];
                    $r4 = this.log;
                }
                $i6 = $i7 > 0 ? $r4[0] : 1998963645;
                i = 0;
                for ($i5 = 0; $i5 < 10; $i5++) {
                    while ($i5 == 0 && $i6 > $i2) {
                        $i6 = i + 1;
                        add(integer, $r2[i], 279103833);
                        if ($i7 != $i6 || $r2 == this.head[11]) {
                            i = $i6;
                        } else {
                            i = 0;
                            $i7 = this.buffer[11];
                            $r2 = this.head[11];
                            $r4 = this.log;
                        }
                        $i6 = i < $i7 ? $r4[i] : 1840030007;
                    }
                    while (3 == $i5 && $i6 > $i3) {
                        $i6 = i + 1;
                        add(integer, $r2[i], 985672775);
                        if ($i7 != $i6 || this.head[11] == $r2) {
                            i = $i6;
                        } else {
                            i = 0;
                            $i7 = this.buffer[11];
                            $r2 = this.head[11];
                            $r4 = this.log;
                        }
                        $i6 = i < $i7 ? $r4[i] : 851347656;
                    }
                    while ($i5 == 5 && $i6 > $i4) {
                        $i6 = i + 1;
                        add(integer, $r2[i], 602769859);
                        if ($i6 != $i7 || $r2 == this.head[11]) {
                            i = $i6;
                        } else {
                            i = 0;
                            $i7 = this.buffer[11];
                            $r2 = this.head[11];
                            $r4 = this.log;
                        }
                        $i6 = i < $i7 ? $r4[i] : -1000;
                    }
                    $i10 = this.buffer[$i5];
                    int[] $r5 = this.head[$i5];
                    for ($i11 = 0; $i11 < $i10; $i11++) {
                        add(integer, $r5[$i11], 639142954);
                    }
                }
                $i2 = $i7;
                $i4 = i;
                $i5 = $i6;
                while (-725059289 != $i5) {
                    $i3 = $i4 + 1;
                    add(integer, $r2[$i4], 661092517);
                    if ($i3 == $i2 && $r2 != this.head[11]) {
                        $i3 = 0;
                        $r2 = this.head[11];
                        $i2 = this.buffer[11];
                        $r4 = this.log;
                    }
                    if ($i3 < $i2) {
                        $i5 = $r4[$i3];
                        $i4 = $i3;
                    } else {
                        $i5 = 896302179;
                        $i4 = $i3;
                    }
                }
            }
        }
    }
}
