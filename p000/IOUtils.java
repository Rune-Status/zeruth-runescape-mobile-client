package p000;

/* compiled from: em */
public class IOUtils extends StringBuffer {
    static final int PREF_SIZE = 300;
    public static final int TOPO_DELAY = 32;
    public static final int Theme_colorPrimaryDark = 83;
    int count;
    final Scalar parent;
    public SelectIterator value;

    public IOUtils(Scalar scalar) {
        try {
            super(400);
            this.count = -1929399585;
            this.value = new SelectIterator();
            this.parent = scalar;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "em.<init>(" + ')');
        }
    }

    static void add(int i, int i2, int i3, int i4) {
        if (client.group * 1745056855 != 0 && i2 != 0 && client.cache * 2118073853 < 50) {
            try {
                client.pool[client.cache * 2118073853] = i;
                client.writer[client.cache * 2118073853] = i2;
                client.stack[client.cache * 2118073853] = i3;
                client.values[client.cache * 2118073853] = null;
                client.TYPE[client.cache * 2118073853] = 0;
                client.cache += 1636861781;
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "em.bu(" + ')');
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void read(p000.Logger r18, int r19, int r20, int r21, int r22, int r23, int r24, byte r25) {
        /*
        r2 = 0;
        if (r20 < 0) goto L_0x00a0;
    L_0x0003:
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r20;
        if (r0 >= r3) goto L_0x00a0;
    L_0x0009:
        if (r21 < 0) goto L_0x00a0;
    L_0x000b:
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r21;
        if (r0 >= r3) goto L_0x00a0;
    L_0x0011:
        r4 = p000.Chart.size;
        r5 = r4[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r6 = r5[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r3 = 0;
        r6[r21] = r3;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x001a:
        r3 = 0;
        r0 = r18;
        r7 = r0.get(r3);	 Catch:{ RuntimeException -> 0x0079 }
        if (r7 != 0) goto L_0x0059;
    L_0x0023:
        if (r19 != 0) goto L_0x00f0;
    L_0x0025:
        r8 = p000.Chart.length;
        r3 = 0;
        r9 = r8[r3];	 Catch:{ RuntimeException -> 0x0079 }
        r10 = r9[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r3 = 932731; // 0xe3b7b float:1.307035E-39 double:4.608303E-318;
        r19 = r3 + r20;
        r0 = r19;
        r1 = r22;
        r0 = r0 + r1;
        r19 = r0;
        r3 = 556238; // 0x87cce float:7.79455E-40 double:2.74818E-318;
        r20 = r3 + r21;
        r0 = r20;
        r1 = r23;
        r0 = r0 + r1;
        r20 = r0;
        r3 = 1078822087; // 0x404d84c7 float:3.211229 double:5.33008931E-315;
        r0 = r19;
        r1 = r20;
        r19 = p000.CompositeMap.write(r0, r1, r3);	 Catch:{ RuntimeException -> 0x0079 }
        r0 = r19;
        r0 = -r0;
        r19 = r0;
        r19 = r19 * 8;
        r10[r21] = r19;	 Catch:{ RuntimeException -> 0x0079 }
        return;
    L_0x0059:
        r3 = 1;
        if (r7 != r3) goto L_0x00b5;
    L_0x005c:
        r3 = 0;
        r0 = r18;
        r22 = r0.get(r3);	 Catch:{ RuntimeException -> 0x0079 }
        r3 = 1;
        r0 = r22;
        if (r3 != r0) goto L_0x0149;
    L_0x0068:
        if (r19 != 0) goto L_0x012d;
    L_0x006a:
        r8 = p000.Chart.length;
        r3 = 0;
        r9 = r8[r3];	 Catch:{ RuntimeException -> 0x0079 }
        r10 = r9[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r0 = -r2;
        r19 = r0;
        r19 = r19 * 8;
        r10[r21] = r19;	 Catch:{ RuntimeException -> 0x0079 }
        return;
    L_0x0079:
        r11 = move-exception;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = "em.ag(";
        r12 = r12.append(r13);
        r3 = 41;
        r12 = r12.append(r3);
        r14 = r12.toString();
        r15 = p000.StringBuilder.append(r11, r14);
        throw r15;
    L_0x0094:
        r3 = 49;
        r0 = r19;
        if (r0 > r3) goto L_0x00a0;
    L_0x009a:
        r3 = 0;
        r0 = r18;
        r0.get(r3);	 Catch:{ RuntimeException -> 0x0079 }
    L_0x00a0:
        r3 = 0;
        r0 = r18;
        r19 = r0.get(r3);	 Catch:{ RuntimeException -> 0x0079 }
        if (r19 == 0) goto L_0x014e;
    L_0x00a9:
        r3 = 1;
        r0 = r19;
        if (r3 != r0) goto L_0x0094;
    L_0x00ae:
        r3 = 0;
        r0 = r18;
        r0.get(r3);	 Catch:{ RuntimeException -> 0x0079 }
        return;
    L_0x00b5:
        r3 = 49;
        if (r7 > r3) goto L_0x0109;
    L_0x00b9:
        r4 = p000.Primitive.name;
        r5 = r4[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r6 = r5[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r3 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r0 = r18;
        r25 = r0.next(r3);	 Catch:{ RuntimeException -> 0x0079 }
        r6[r21] = r25;	 Catch:{ RuntimeException -> 0x0079 }
        r4 = p000.ScrollingTextView.value;
        r5 = r4[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r6 = r5[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r16 = r7 + -2;
        r16 = r16 / 4;
        r0 = r16;
        r0 = (byte) r0;
        r25 = r0;
        r6[r21] = r25;	 Catch:{ RuntimeException -> 0x0079 }
        r4 = p000.Dialog.index;
        r5 = r4[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r6 = r5[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r7 = r7 + -2;
        r0 = r24;
        r7 = r7 + r0;
        r7 = r7 & 3;
        r0 = (byte) r7;
        r25 = r0;
        r6[r21] = r25;	 Catch:{ RuntimeException -> 0x0079 }
        goto L_0x001a;
    L_0x00f0:
        r8 = p000.Chart.length;
        r9 = r8[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r10 = r9[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r8 = p000.Chart.length;
        r19 = r19 + -1;
        r9 = r8[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r17 = r9[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r19 = r17[r21];	 Catch:{ RuntimeException -> 0x0079 }
        r0 = r19;
        r0 = r0 + -240;
        r19 = r0;
        r10[r21] = r19;	 Catch:{ RuntimeException -> 0x0079 }
        return;
    L_0x0109:
        r3 = 81;
        if (r7 > r3) goto L_0x011d;
    L_0x010d:
        r4 = p000.Chart.size;
        r5 = r4[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r6 = r5[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r7 = r7 + -49;
        r0 = (byte) r7;
        r25 = r0;
        r6[r21] = r25;	 Catch:{ RuntimeException -> 0x0079 }
        goto L_0x001a;
    L_0x011d:
        r4 = p000.Chart.position;
        r5 = r4[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r6 = r5[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r7 = r7 + -81;
        r0 = (byte) r7;
        r25 = r0;
        r6[r21] = r25;	 Catch:{ RuntimeException -> 0x0079 }
        goto L_0x001a;
    L_0x012d:
        r8 = p000.Chart.length;
        r9 = r8[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r10 = r9[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r8 = p000.Chart.length;
        r19 = r19 + -1;
        r9 = r8[r19];	 Catch:{ RuntimeException -> 0x0079 }
        r17 = r9[r20];	 Catch:{ RuntimeException -> 0x0079 }
        r19 = r17[r21];	 Catch:{ RuntimeException -> 0x0079 }
        r20 = r2 * 8;
        r0 = r19;
        r1 = r20;
        r0 = r0 - r1;
        r19 = r0;
        r10[r21] = r19;	 Catch:{ RuntimeException -> 0x0079 }
        return;
    L_0x0149:
        r2 = r22;
        goto L_0x0068;
    L_0x014e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: IOUtils.read(Logger, int, int, int, int, int, int, byte):void");
    }

    public static final void update(int $i0, int i) {
        try {
            Exception.write((short) 25864);
            for (Comment $r2 = (Comment) Comment.this$0.get(); $r2 != null; $r2 = (Comment) Comment.this$0.next()) {
                if ($r2.buffer != null) {
                    $r2.add((byte) 52);
                }
            }
            i = TextUtils.get($i0, (byte) 0).id * 828168313;
            if (i != 0) {
                Channel$1[] $r5;
                Channel$1 $r6;
                $i0 = Event.this$0[$i0];
                if (i == 1) {
                    double $d0;
                    int $i3;
                    int $i2;
                    double $d1;
                    double $d2;
                    int $i4;
                    double $d3;
                    double $d4;
                    double $d42;
                    double $d5;
                    double $d6;
                    double d;
                    int $i6;
                    long j;
                    int $i62;
                    long j2;
                    int i2;
                    if ($i0 == 1) {
                        Line.update(0.9d);
                        ((AbstractBuffer) Point.type).put(0.9d);
                    }
                    if ($i0 == 2) {
                        Line.update(0.8d);
                        ((AbstractBuffer) Point.type).put(0.8d);
                    }
                    if (3 == $i0) {
                        $d0 = 0.7d + ((Math.random() * 0.03d) - 0.015d);
                        $i3 = 0;
                        for ($i2 = 0; $i2 < 512; $i2++) {
                            $d1 = 0.0078125d + (((double) ($i2 >> 3)) / 64.0d);
                            $d2 = 0.0625d + (((double) ($i2 & 7)) / 8.0d);
                            $i4 = 0;
                            while ($i4 < 128) {
                                $d3 = ((double) $i4) / 128.0d;
                                if ($d2 != 0.0d) {
                                    $d4 = $d3 < 0.5d ? (1.0d + $d2) * $d3 : ($d2 + $d3) - ($d3 * $d2);
                                    $d42 = $d3 * 2.0d;
                                    $d3 = $d42;
                                    $d3 = $d42 - $d4;
                                    $d5 = 0.3333333333333333d + $d1;
                                    if ($d5 > 1.0d) {
                                        $d5 -= 1.0d;
                                    }
                                    $d6 = $d1 - 0.3333333333333333d;
                                    if ($d6 < 0.0d) {
                                        $d6 += 1.0d;
                                    }
                                    if (6.0d * $d5 < 1.0d) {
                                        $d42 = $d5 * (($d4 - $d3) * 6.0d);
                                        $d5 = $d42;
                                        $d5 = $d42 + $d3;
                                    } else {
                                        $d5 = 2.0d * $d5 < 1.0d ? $d4 : 3.0d * $d5 < 2.0d ? $d3 + (((0.6666666666666666d - $d5) * ($d4 - $d3)) * 6.0d) : $d3;
                                    }
                                    if (6.0d * $d1 < 1.0d) {
                                        $d42 = ($d4 - $d3) * 6.0d;
                                        d = $d42;
                                        $d42 *= $d1;
                                        d = $d42;
                                        d = $d42 + $d3;
                                    } else if (2.0d * $d1 < 1.0d) {
                                        d = $d4;
                                    } else if (3.0d * $d1 < 2.0d) {
                                        $d42 = ((0.6666666666666666d - $d1) * ($d4 - $d3)) * 6.0d;
                                        d = $d42;
                                        d = $d42 + $d3;
                                    } else {
                                        d = $d3;
                                    }
                                    if (6.0d * $d6 < 1.0d) {
                                        $d42 = ($d4 - $d3) * 6.0d;
                                        $d4 = $d42;
                                        $d42 *= $d6;
                                        $d4 = $d42;
                                        $d4 = $d42 + $d3;
                                        $d3 = d;
                                        $d6 = $d5;
                                    } else if (2.0d * $d6 < 1.0d) {
                                        $d3 = d;
                                        $d6 = $d5;
                                    } else if (3.0d * $d6 < 2.0d) {
                                        $d42 = (($d4 - $d3) * (0.6666666666666666d - $d6)) * 6.0d;
                                        $d4 = $d42;
                                        $d4 = $d42 + $d3;
                                        $d3 = d;
                                        $d6 = $d5;
                                    } else {
                                        $d4 = $d3;
                                        $d3 = d;
                                        $d6 = $d5;
                                    }
                                } else {
                                    $d4 = $d3;
                                    $d6 = $d3;
                                }
                                $i6 = $d6 * 256.0d;
                                j = $i6;
                                $i62 = (int) $i6;
                                $i6 = $d3 * 256.0d;
                                j2 = $i6;
                                $i6 = ((int) ($d4 * 256.0d)) + ((((int) $i6) << 8) + ($i62 << 16));
                                i2 = $i6;
                                $i62 = Hashtable.get($i6, $d0);
                                i2 = $i62;
                                if ($i62 == 0) {
                                    i2 = 1;
                                }
                                Point.count[$i3] = i2;
                                $i4++;
                                $i3++;
                            }
                        }
                        ((AbstractBuffer) Point.type).put(0.7d);
                    }
                    if (4 == $i0) {
                        $d0 = 0.6d + ((Math.random() * 0.03d) - 0.015d);
                        $i3 = 0;
                        for ($i2 = 0; $i2 < 512; $i2++) {
                            $d1 = 0.0078125d + (((double) ($i2 >> 3)) / 64.0d);
                            $d2 = 0.0625d + (((double) ($i2 & 7)) / 8.0d);
                            $i4 = 0;
                            while ($i4 < 128) {
                                $d3 = ((double) $i4) / 128.0d;
                                if (0.0d != $d2) {
                                    $d4 = $d3 < 0.5d ? (1.0d + $d2) * $d3 : ($d2 + $d3) - ($d3 * $d2);
                                    $d42 = $d3 * 2.0d;
                                    $d3 = $d42;
                                    $d3 = $d42 - $d4;
                                    $d5 = 0.3333333333333333d + $d1;
                                    if ($d5 > 1.0d) {
                                        $d5 -= 1.0d;
                                    }
                                    $d6 = $d1 - 0.3333333333333333d;
                                    if ($d6 < 0.0d) {
                                        $d6 += 1.0d;
                                    }
                                    if (6.0d * $d5 < 1.0d) {
                                        $d42 = $d5 * (($d4 - $d3) * 6.0d);
                                        $d5 = $d42;
                                        $d5 = $d42 + $d3;
                                    } else {
                                        $d5 = 2.0d * $d5 < 1.0d ? $d4 : 3.0d * $d5 < 2.0d ? $d3 + (((0.6666666666666666d - $d5) * ($d4 - $d3)) * 6.0d) : $d3;
                                    }
                                    if (6.0d * $d1 < 1.0d) {
                                        $d42 = (6.0d * ($d4 - $d3)) * $d1;
                                        d = $d42;
                                        d = $d42 + $d3;
                                    } else {
                                        d = 2.0d * $d1 < 1.0d ? $d4 : 3.0d * $d1 < 2.0d ? (6.0d * (($d4 - $d3) * (0.6666666666666666d - $d1))) + $d3 : $d3;
                                    }
                                    if (6.0d * $d6 < 1.0d) {
                                        $d42 = ($d4 - $d3) * 6.0d;
                                        $d4 = $d42;
                                        $d42 *= $d6;
                                        $d4 = $d42;
                                        $d4 = $d42 + $d3;
                                        $d3 = d;
                                        $d6 = $d5;
                                    } else if (2.0d * $d6 < 1.0d) {
                                        $d3 = d;
                                        $d6 = $d5;
                                    } else if (3.0d * $d6 < 2.0d) {
                                        $d42 = $d4 - $d3;
                                        $d4 = $d42;
                                        $d42 = ($d42 * (0.6666666666666666d - $d6)) * 6.0d;
                                        $d4 = $d42;
                                        $d4 = $d42 + $d3;
                                        $d3 = d;
                                        $d6 = $d5;
                                    } else {
                                        $d4 = $d3;
                                        $d3 = d;
                                        $d6 = $d5;
                                    }
                                } else {
                                    $d4 = $d3;
                                    $d6 = $d3;
                                }
                                $i6 = $d6 * 256.0d;
                                j = $i6;
                                int $i7 = (int) $i6;
                                $i6 = $d3 * 256.0d;
                                j2 = $i6;
                                $i6 = ((int) ($d4 * 256.0d)) + (($i7 << 16) + (((int) $i6) << 8));
                                i2 = $i6;
                                $i62 = Hashtable.get($i6, $d0);
                                i2 = $i62;
                                if ($i62 == 0) {
                                    i2 = 1;
                                }
                                Point.count[$i3] = i2;
                                $i4++;
                                $i3++;
                            }
                        }
                        ((AbstractBuffer) Point.type).put(0.6d);
                    }
                    Message.context.get();
                }
                if (i == 3) {
                    short $s9 = (short) 0;
                    if ($i0 == 0) {
                        $s9 = (short) 255;
                    }
                    if (1 == $i0) {
                        $s9 = (short) 192;
                    }
                    if (2 == $i0) {
                        $s9 = (short) 128;
                    }
                    if (3 == $i0) {
                        $s9 = (short) 64;
                    }
                    if ($i0 == 4) {
                        $s9 = (short) 0;
                    }
                    if ($s9 != -1819605895 * client.user) {
                        if (client.user * -1819605895 == 0 && client.table * 1387447661 != -1) {
                            Hashtable.read(client.header, 1387447661 * client.table, 0, $s9, false, -1132449550);
                            client.index = false;
                        } else if ($s9 == (short) 0) {
                            Target.add((byte) 41);
                            client.index = false;
                        } else if (MultiInputStream.index * -219207591 != 0) {
                            FieldInfo.index = -1734207119 * $s9;
                        } else {
                            MultiInputStream.this$0.write($s9, 891188647);
                        }
                        client.user = 1020536265 * $s9;
                    }
                }
                if (i == 4) {
                    if ($i0 == 0) {
                        client.group = 1098710041;
                    }
                    if ($i0 == 1) {
                        client.group = 864339616;
                    }
                    if (2 == $i0) {
                        client.group = 2007882176;
                    }
                    if ($i0 == 3) {
                        client.group = -1143542560;
                    }
                    if ($i0 == 4) {
                        client.group = 0;
                    }
                }
                if (5 == i) {
                    client.NONE = 1403721769 * $i0;
                }
                if (i == 6) {
                    client.f380A = 925438107 * $i0;
                }
                if (i == 9) {
                    client.link = -1357687407 * $i0;
                }
                if (10 == i) {
                    if ($i0 == 0) {
                        client.items = -594488243;
                    }
                    if ($i0 == 1) {
                        client.items = -1633029344;
                    }
                    if (2 == $i0) {
                        client.items = 342969536;
                    }
                    if ($i0 == 3) {
                        client.items = -1975998880;
                    }
                    if ($i0 == 4) {
                        client.items = 0;
                    }
                }
                if (i == 17) {
                    client.f409z = -1001387759 * (65535 & $i0);
                }
                if (i == 18) {
                    $r5 = new Channel$1[4];
                    $r5[0] = Channel$1.this$0;
                    $r5[1] = Channel$1.format;
                    $r5[2] = Channel$1.size;
                    $r5[3] = Channel$1.head;
                    $r6 = (Channel$1) Calendar.add($r5, $i0, (byte) 106);
                    if ($r6 == null) {
                        $r6 = Channel$1.head;
                    }
                    Settings.this$0.add($r6, -692207426);
                }
                if (19 == i) {
                    if (-1 == $i0) {
                        client.f402r = -1909811437;
                    } else {
                        client.f402r = ($i0 & 2047) * 1909811437;
                    }
                }
                if (22 == i) {
                    $r5 = new Channel$1[4];
                    $r5[0] = Channel$1.this$0;
                    $r5[1] = Channel$1.format;
                    $r5[2] = Channel$1.size;
                    $r5[3] = Channel$1.head;
                    $r6 = (Channel$1) Calendar.add($r5, $i0, (byte) 29);
                    if ($r6 == null) {
                        $r6 = Channel$1.head;
                    }
                    Settings.this$0.add($r6, (byte) 58);
                }
            }
        } catch (RuntimeException $r13) {
            throw StringBuilder.append($r13, "em.fp(" + ')');
        }
    }

    public void add(Logger logger, int i) {
        while (logger.data * 1978945739 < i) {
            boolean $z0 = logger.get((byte) 0) == 1;
            JSONObject $r2 = new JSONObject(logger.toString(1666359007), this.parent);
            JSONObject $r5 = new JSONObject(logger.toString(519920752), this.parent);
            int $i2 = logger.get(519541531);
            int $i1 = logger.get((byte) 0);
            int $i3 = logger.get((byte) 0);
            boolean $z1 = ($i3 & 2) != 0;
            boolean $z2 = ($i3 & 1) != 0;
            if ($i2 > 0) {
                logger.toString(338523306);
                logger.get((byte) 0);
                logger.size(-376784277);
            }
            logger.toString(545591321);
            if ($r2 == null || !$r2.get(-1069759578)) {
                throw new IllegalStateException();
            }
            State $r9;
            SelectIterator $r10;
            LinkedListMultimap$NodeIterator $r12;
            Coordinate $r8;
            State $r82 = (Pair) get($r2, 1099558325);
            if ($z0) {
                $r9 = (Pair) get($r5, 1099558325);
                if (!($r9 == null || $r82 == $r9)) {
                    if ($r82 != null) {
                        toString($r9, 2142124456);
                        $r9 = $r82;
                    }
                    if ($r9 != null) {
                        add($r9, $r2, $r5, (byte) 64);
                        if ($i2 == $r9.this$0 * -1161455169) {
                            $r10 = this.value;
                            $z0 = true;
                            $r12 = (Float) $r10.next();
                            while ($r12 != null) {
                                if ($r12.data.equals($r2)) {
                                    if ($i2 == 0 && $r12.this$0 == (short) 0) {
                                        $r12.next();
                                        $z0 = false;
                                        $r10 = this.value;
                                        $r12 = (Float) $r10.hasNext();
                                    } else if ($i2 == 0 && $r12.this$0 != (short) 0) {
                                        $r12.next();
                                        $z0 = false;
                                        $r10 = this.value;
                                        $r12 = (Float) $r10.hasNext();
                                    }
                                }
                                $r10 = this.value;
                                $r12 = (Float) $r10.hasNext();
                            }
                            if ($z0) {
                                this.value.next(new Float($r2, $i2));
                            }
                            $r8 = $r9;
                        } else {
                            $r82 = $r9;
                        }
                    } else if (get(1246020068) < 400) {
                        $r8 = (Pair) get($r2, $r5, -386352732);
                    }
                    if (-1161455169 * $r8.this$0 != $i2) {
                        $i3 = this.count - 1929399585;
                        this.count = $i3;
                        $r8.f35y = (($i3 * -2085582561) - 1) * 1327442639;
                        if ($r8.this$0 * -1161455169 == -1 && $i2 == 0) {
                            $r8.f35y = -($r8.f35y * 1);
                        }
                        $r8.this$0 = 1820808767 * $i2;
                    }
                    $r8.count = 862083601 * $i1;
                    $r8.size = $z1;
                    $r8.count = $z2;
                }
            }
            $r9 = $r82;
            if ($r9 != null) {
                add($r9, $r2, $r5, (byte) 64);
                if ($i2 == $r9.this$0 * -1161455169) {
                    $r82 = $r9;
                } else {
                    $r10 = this.value;
                    $z0 = true;
                    $r12 = (Float) $r10.next();
                    while ($r12 != null) {
                        if ($r12.data.equals($r2)) {
                            if ($i2 == 0) {
                            }
                            $r12.next();
                            $z0 = false;
                            $r10 = this.value;
                            $r12 = (Float) $r10.hasNext();
                        }
                        $r10 = this.value;
                        $r12 = (Float) $r10.hasNext();
                    }
                    if ($z0) {
                        this.value.next(new Float($r2, $i2));
                    }
                    $r8 = $r9;
                }
            } else if (get(1246020068) < 400) {
                $r8 = (Pair) get($r2, $r5, -386352732);
            }
            if (-1161455169 * $r8.this$0 != $i2) {
                $i3 = this.count - 1929399585;
                this.count = $i3;
                $r8.f35y = (($i3 * -2085582561) - 1) * 1327442639;
                $r8.f35y = -($r8.f35y * 1);
                $r8.this$0 = 1820808767 * $i2;
            }
            $r8.count = 862083601 * $i1;
            $r8.size = $z1;
            $r8.count = $z2;
        }
        toString(1241064189);
    }

    State copy() {
        return new Pair();
    }

    public boolean copy(JSONObject jSONObject, boolean z) {
        Pair $r3 = (Pair) copy(jSONObject, 1894854124);
        return $r3 == null ? false : (z && $r3.this$0 * -1161455169 == 0) ? false : true;
    }

    State equals() {
        return new Pair();
    }

    public boolean filter(JSONObject jSONObject, boolean z) {
        Pair $r3 = (Pair) copy(jSONObject, 2012253507);
        return $r3 == null ? false : (z && $r3.this$0 * -1161455169 == 0) ? false : true;
    }

    State[] getValue(int i) {
        return new Pair[i];
    }

    public void process(Logger logger, int i) {
        while (logger.data * 1978945739 < i) {
            boolean $z0 = logger.get((byte) 0) == 1;
            JSONObject $r2 = new JSONObject(logger.toString(715935815), this.parent);
            JSONObject $r5 = new JSONObject(logger.toString(333456645), this.parent);
            int $i2 = logger.get(-1281915736);
            int $i1 = logger.get((byte) 0);
            int $i3 = logger.get((byte) 0);
            boolean $z1 = ($i3 & 2) != 0;
            boolean $z2 = ($i3 & 1) != 0;
            if ($i2 > 0) {
                logger.toString(313257554);
                logger.get((byte) 0);
                logger.size(-142995574);
            }
            logger.toString(1236254766);
            if ($r2 == null || !$r2.get(-1069759578)) {
                throw new IllegalStateException();
            }
            State $r12;
            SelectIterator $r9;
            LinkedListMultimap$NodeIterator $r11;
            Coordinate $r8;
            State $r82 = (Pair) get($r2, 1099558325);
            if ($z0) {
                $r12 = (Pair) get($r5, 1099558325);
                if (!($r12 == null || $r82 == $r12)) {
                    if ($r82 != null) {
                        toString($r12, 2142124456);
                        $r12 = $r82;
                    }
                    if ($r12 != null) {
                        add($r12, $r2, $r5, (byte) 64);
                        if ($i2 == $r12.this$0 * -1161455169) {
                            $r9 = this.value;
                            $z0 = true;
                            $r11 = (Float) $r9.next();
                            while ($r11 != null) {
                                if ($r11.data.equals($r2)) {
                                    if ($i2 == 0 && $r11.this$0 == (short) 0) {
                                        $r11.next();
                                        $z0 = false;
                                        $r9 = this.value;
                                        $r11 = (Float) $r9.hasNext();
                                    } else if ($i2 == 0 && $r11.this$0 != (short) 0) {
                                        $r11.next();
                                        $z0 = false;
                                        $r9 = this.value;
                                        $r11 = (Float) $r9.hasNext();
                                    }
                                }
                                $r9 = this.value;
                                $r11 = (Float) $r9.hasNext();
                            }
                            if ($z0) {
                                this.value.next(new Float($r2, $i2));
                            }
                            $r82 = $r12;
                        } else {
                            $r82 = $r12;
                        }
                    } else if (get(1555683001) < 400) {
                        $r8 = (Pair) get($r2, $r5, -386352732);
                    }
                    if (-1161455169 * $r8.this$0 != $i2) {
                        $i3 = this.count - 1929399585;
                        this.count = $i3;
                        $r8.f35y = (($i3 * -2085582561) - 1) * 1327442639;
                        if ($r8.this$0 * -1161455169 == -1 && $i2 == 0) {
                            $r8.f35y = -($r8.f35y * 1);
                        }
                        $r8.this$0 = 1820808767 * $i2;
                    }
                    $r8.count = 862083601 * $i1;
                    $r8.size = $z1;
                    $r8.count = $z2;
                }
            }
            $r12 = $r82;
            if ($r12 != null) {
                add($r12, $r2, $r5, (byte) 64);
                if ($i2 == $r12.this$0 * -1161455169) {
                    $r82 = $r12;
                } else {
                    $r9 = this.value;
                    $z0 = true;
                    $r11 = (Float) $r9.next();
                    while ($r11 != null) {
                        if ($r11.data.equals($r2)) {
                            if ($i2 == 0) {
                            }
                            $r11.next();
                            $z0 = false;
                            $r9 = this.value;
                            $r11 = (Float) $r9.hasNext();
                        }
                        $r9 = this.value;
                        $r11 = (Float) $r9.hasNext();
                    }
                    if ($z0) {
                        this.value.next(new Float($r2, $i2));
                    }
                    $r82 = $r12;
                }
            } else if (get(1555683001) < 400) {
                $r8 = (Pair) get($r2, $r5, -386352732);
            }
            if (-1161455169 * $r8.this$0 != $i2) {
                $i3 = this.count - 1929399585;
                this.count = $i3;
                $r8.f35y = (($i3 * -2085582561) - 1) * 1327442639;
                $r8.f35y = -($r8.f35y * 1);
                $r8.this$0 = 1820808767 * $i2;
            }
            $r8.count = 862083601 * $i1;
            $r8.size = $z1;
            $r8.count = $z2;
        }
        toString(1241064189);
    }

    State[] setValue(int i) {
        return new Pair[i];
    }

    State[] toByteArray(int i) {
        return new Pair[i];
    }

    State toString(byte b) {
        try {
            return new Pair();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "em.ao(" + ')');
        }
    }

    State[] toString(int i, int i2) {
        try {
            return new Pair[i];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "em.ax(" + ')');
        }
    }

    public void write(Logger logger, int i) {
        while (logger.data * 1978945739 < i) {
            boolean $z0 = logger.get((byte) 0) == 1;
            JSONObject $r2 = new JSONObject(logger.toString(326929550), this.parent);
            JSONObject $r5 = new JSONObject(logger.toString(470117291), this.parent);
            int $i2 = logger.get(1289741373);
            int $i1 = logger.get((byte) 0);
            int $i3 = logger.get((byte) 0);
            boolean $z1 = ($i3 & 2) != 0;
            boolean $z2 = ($i3 & 1) != 0;
            if ($i2 > 0) {
                logger.toString(1633371468);
                logger.get((byte) 0);
                logger.size(9740449);
            }
            logger.toString(1731982232);
            if ($r2 == null || !$r2.get(-1069759578)) {
                throw new IllegalStateException();
            }
            State $r12;
            SelectIterator $r7;
            LinkedListMultimap$NodeIterator $r9;
            Coordinate $r11;
            State $r112 = (Pair) get($r2, 1099558325);
            if ($z0) {
                $r12 = (Pair) get($r5, 1099558325);
                if (!($r12 == null || $r112 == $r12)) {
                    if ($r112 != null) {
                        toString($r12, 2142124456);
                        $r12 = $r112;
                    }
                    if ($r12 != null) {
                        add($r12, $r2, $r5, (byte) 64);
                        if ($i2 == $r12.this$0 * -1161455169) {
                            $r7 = this.value;
                            $z0 = true;
                            $r9 = (Float) $r7.next();
                            while ($r9 != null) {
                                if ($r9.data.equals($r2)) {
                                    if ($i2 == 0 && $r9.this$0 == (short) 0) {
                                        $r9.next();
                                        $z0 = false;
                                        $r7 = this.value;
                                        $r9 = (Float) $r7.hasNext();
                                    } else if ($i2 == 0 && $r9.this$0 != (short) 0) {
                                        $r9.next();
                                        $z0 = false;
                                        $r7 = this.value;
                                        $r9 = (Float) $r7.hasNext();
                                    }
                                }
                                $r7 = this.value;
                                $r9 = (Float) $r7.hasNext();
                            }
                            if ($z0) {
                                this.value.next(new Float($r2, $i2));
                            }
                            $r11 = $r12;
                        } else {
                            $r112 = $r12;
                        }
                    } else if (get(1873643898) < 400) {
                        $r11 = (Pair) get($r2, $r5, -386352732);
                    }
                    if (-1161455169 * $r11.this$0 != $i2) {
                        $i3 = this.count - 1929399585;
                        this.count = $i3;
                        $r11.f35y = (($i3 * -2085582561) - 1) * 1327442639;
                        if ($r11.this$0 * -1161455169 == -1 && $i2 == 0) {
                            $r11.f35y = -($r11.f35y * 1);
                        }
                        $r11.this$0 = 1820808767 * $i2;
                    }
                    $r11.count = 862083601 * $i1;
                    $r11.size = $z1;
                    $r11.count = $z2;
                }
            }
            $r12 = $r112;
            if ($r12 != null) {
                add($r12, $r2, $r5, (byte) 64);
                if ($i2 == $r12.this$0 * -1161455169) {
                    $r112 = $r12;
                } else {
                    $r7 = this.value;
                    $z0 = true;
                    $r9 = (Float) $r7.next();
                    while ($r9 != null) {
                        if ($r9.data.equals($r2)) {
                            if ($i2 == 0) {
                            }
                            $r9.next();
                            $z0 = false;
                            $r7 = this.value;
                            $r9 = (Float) $r7.hasNext();
                        }
                        $r7 = this.value;
                        $r9 = (Float) $r7.hasNext();
                    }
                    if ($z0) {
                        this.value.next(new Float($r2, $i2));
                    }
                    $r11 = $r12;
                }
            } else if (get(1873643898) < 400) {
                $r11 = (Pair) get($r2, $r5, -386352732);
            }
            if (-1161455169 * $r11.this$0 != $i2) {
                $i3 = this.count - 1929399585;
                this.count = $i3;
                $r11.f35y = (($i3 * -2085582561) - 1) * 1327442639;
                $r11.f35y = -($r11.f35y * 1);
                $r11.this$0 = 1820808767 * $i2;
            }
            $r11.count = 862083601 * $i1;
            $r11.size = $z1;
            $r11.count = $z2;
        }
        toString(1241064189);
    }

    public void write(Logger logger, int i, int i2) {
        while (true) {
            try {
                int $i1 = logger.data * 1978945739;
                i2 = $i1;
                if ($i1 < i) {
                    boolean $z0 = logger.get((byte) 0) == 1;
                    JSONObject $r2 = new JSONObject(logger.toString(1553778620), this.parent);
                    JSONObject $r5 = new JSONObject(logger.toString(1591220529), this.parent);
                    int $i2 = logger.get(-1522507416);
                    i2 = logger.get((byte) 0);
                    int $i3 = logger.get((byte) 0);
                    boolean $z1 = ($i3 & 2) != 0;
                    boolean $z2 = ($i3 & 1) != 0;
                    if ($i2 > 0) {
                        logger.toString(331940072);
                        logger.get((byte) 0);
                        logger.size(-277587716);
                    }
                    logger.toString(1706683693);
                    if ($r2 == null) {
                        break;
                    } else if (!$r2.get(-1069759578)) {
                        break;
                    } else {
                        Coordinate $r10;
                        SelectIterator $r11;
                        LinkedListMultimap$NodeIterator $r13;
                        State $r102 = (Pair) get($r2, 1099558325);
                        if ($z0) {
                            State $r15 = (Pair) get($r5, 1099558325);
                            if (!($r15 == null || $r102 == $r15)) {
                                if ($r102 != null) {
                                    toString($r15, 2142124456);
                                } else {
                                    $r10 = $r15;
                                }
                                if ($r10 != null) {
                                    add($r10, $r2, $r5, (byte) 64);
                                    if ($i2 != $r10.this$0 * -1161455169) {
                                        $r11 = this.value;
                                        $r13 = (Float) $r11.next();
                                        $z0 = true;
                                        while ($r13 != null) {
                                            if ($r13.data.equals($r2)) {
                                                if ($i2 != 0) {
                                                    if ($r13.this$0 == (short) 0) {
                                                        $r13.next();
                                                        $z0 = false;
                                                        $r11 = this.value;
                                                        $r13 = (Float) $r11.hasNext();
                                                    }
                                                }
                                                if ($i2 == 0) {
                                                    if ($r13.this$0 != (short) 0) {
                                                        $r13.next();
                                                        $z0 = false;
                                                        $r11 = this.value;
                                                        $r13 = (Float) $r11.hasNext();
                                                    }
                                                }
                                            }
                                            $r11 = this.value;
                                            $r13 = (Float) $r11.hasNext();
                                        }
                                        if ($z0) {
                                            this.value.next(new Float($r2, $i2));
                                        }
                                    }
                                } else if (get(1743761639) >= 400) {
                                    $r10 = (Pair) get($r2, $r5, -386352732);
                                } else {
                                    continue;
                                }
                                if (-1161455169 * $r10.this$0 != $i2) {
                                    $i3 = this.count - 1929399585;
                                    this.count = $i3;
                                    $r10.f35y = (($i3 * -2085582561) - 1) * 1327442639;
                                    if ($r10.this$0 * -1161455169 == -1 && $i2 == 0) {
                                        $r10.f35y = -($r10.f35y * 1);
                                    }
                                    $r10.this$0 = 1820808767 * $i2;
                                }
                                $r10.count = 862083601 * i2;
                                $r10.size = $z1;
                                $r10.count = $z2;
                            }
                        }
                        if ($r10 != null) {
                            add($r10, $r2, $r5, (byte) 64);
                            if ($i2 != $r10.this$0 * -1161455169) {
                                $r11 = this.value;
                                $r13 = (Float) $r11.next();
                                $z0 = true;
                                while ($r13 != null) {
                                    if ($r13.data.equals($r2)) {
                                        if ($i2 != 0) {
                                            if ($r13.this$0 == (short) 0) {
                                                $r13.next();
                                                $z0 = false;
                                                $r11 = this.value;
                                                $r13 = (Float) $r11.hasNext();
                                            }
                                        }
                                        if ($i2 == 0) {
                                            if ($r13.this$0 != (short) 0) {
                                                $r13.next();
                                                $z0 = false;
                                                $r11 = this.value;
                                                $r13 = (Float) $r11.hasNext();
                                            }
                                        }
                                    }
                                    $r11 = this.value;
                                    $r13 = (Float) $r11.hasNext();
                                }
                                if ($z0) {
                                    this.value.next(new Float($r2, $i2));
                                }
                            }
                        } else if (get(1743761639) >= 400) {
                            continue;
                        } else {
                            $r10 = (Pair) get($r2, $r5, -386352732);
                        }
                        if (-1161455169 * $r10.this$0 != $i2) {
                            $i3 = this.count - 1929399585;
                            this.count = $i3;
                            $r10.f35y = (($i3 * -2085582561) - 1) * 1327442639;
                            $r10.f35y = -($r10.f35y * 1);
                            $r10.this$0 = 1820808767 * $i2;
                        }
                        $r10.count = 862083601 * i2;
                        $r10.size = $z1;
                        $r10.count = $z2;
                    }
                } else {
                    toString(1241064189);
                    return;
                }
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "em.dz(" + ')');
            }
        }
        throw new IllegalStateException();
    }

    public boolean write(JSONObject jSONObject, boolean z) {
        Pair $r3 = (Pair) copy(jSONObject, 481756558);
        return $r3 == null ? false : (z && $r3.this$0 * 1392905856 == 0) ? false : true;
    }

    public boolean write(JSONObject jSONObject, boolean z, byte b) {
        try {
            Pair $r3 = (Pair) copy(jSONObject, -184397091);
            if ($r3 == null) {
                return false;
            }
            if (z) {
                if ($r3.this$0 * -1161455169 == 0) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "em.dt(" + ')');
        }
    }
}
