package p000;

/* compiled from: do */
public class Short {
    public static final int DIALOG_DELAY = 1;
    static final int FORMAT_ISO_8859_7 = 8;
    static ByteBuffer[] value;

    Short() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "do.<init>(" + ')');
        }
    }

    static final void add(int i, int i2, int i3, int i4, int i5, int i6, int $i6, Log log, Context context, int i7) {
        try {
            int $i9;
            int i8;
            int i9;
            int $i12;
            int $i13;
            Transaction $r2 = BigInteger.get(i5, 1273233683);
            if (1 == i6 || 3 == i6) {
                $i9 = $r2.this$0 * -265754695;
                i8 = $r2.offset * -344743753;
            } else {
                $i9 = $r2.offset * -344743753;
                i8 = $r2.this$0 * -265754695;
            }
            if (i8 + i3 <= 104) {
                i9 = ((i8 + 1) >> 1) + i3;
                i7 = i3 + (i8 >> 1);
            } else {
                i9 = i3 + 1;
                i7 = i3;
            }
            if ($i9 + i4 <= DiskLruCache.AppCompatTheme_editTextStyle) {
                $i12 = ($i9 >> 1) + i4;
                $i13 = (($i9 + 1) >> 1) + i4;
            } else {
                $i13 = i4 + 1;
                $i12 = i4;
            }
            int[][] $r4 = Chart.length[i2];
            int $i7 = $r4[i7][$i13] + ($r4[i9][$i12] + $r4[i7][$i12]);
            i7 = $i7;
            i7 = ($i7 + $r4[i9][$i13]) >> 2;
            int $i11 = (i8 << 6) + (i3 << 7);
            $i12 = ($i9 << 6) + (i4 << 7);
            long $l15 = Exception.format(i3, i4, 2, $r2.value * -1193025245 == 0, i5, -1741390259);
            i9 = (i6 << 6) + $i6;
            if (29042685 * $r2.list == 1) {
                i9 += 256;
            }
            ArrayMap $r7;
            if ($i6 == 22) {
                if (-1 == -229827367 * $r2.position) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(22, i6, $r4, $i11, i7, $i12, 478835717);
                        log.set(i, i3, i4, i7, $r7, $l15, i9);
                        if ($r2.count * -1655214851 == 1) {
                            context.add(i3, i4, (byte) 29);
                        }
                    }
                }
                $r7 = new AttributeList(i5, 22, i6, i2, i3, i4, -229827367 * $r2.position, true, null);
                log.set(i, i3, i4, i7, $r7, $l15, i9);
                if ($r2.count * -1655214851 == 1) {
                    context.add(i3, i4, (byte) 29);
                }
            } else if ($i6 == 10 || $i6 == 11) {
                if ($r2.position * -229827367 == -1) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(10, i6, $r4, $i11, i7, $i12, 1164018653);
                        if ($r7 != null) {
                            log.add(i, i3, i4, i7, i8, $i9, $r7, (int) 11 != $i6 ? (short) 256 : (short) 0, $l15, i9);
                        }
                        if (-1655214851 * $r2.count != 0) {
                            context.toString(i3, i4, i8, $i9, $r2.index, 1814140291);
                        }
                    }
                }
                $r7 = new AttributeList(i5, 10, i6, i2, i3, i4, $r2.position * -229827367, true, null);
                if ($r7 != null) {
                    if (11 != $i6) {
                    }
                    log.add(i, i3, i4, i7, i8, $i9, $r7, (int) 11 != $i6 ? (short) 256 : (short) 0, $l15, i9);
                }
                if (-1655214851 * $r2.count != 0) {
                    context.toString(i3, i4, i8, $i9, $r2.index, 1814140291);
                }
            } else if ($i6 >= 12) {
                if (-229827367 * $r2.position == -1) {
                    if ($r2.size == null) {
                        $r7 = $r2.add($i6, i6, $r4, $i11, i7, $i12, 455189156);
                        log.add(i, i3, i4, i7, 1, 1, $r7, 0, $l15, i9);
                        if ($r2.count * -1655214851 != 0) {
                            context.toString(i3, i4, i8, $i9, $r2.index, 1802460213);
                        }
                    }
                }
                $r7 = new AttributeList(i5, $i6, i6, i2, i3, i4, $r2.position * -229827367, true, null);
                log.add(i, i3, i4, i7, 1, 1, $r7, 0, $l15, i9);
                if ($r2.count * -1655214851 != 0) {
                    context.toString(i3, i4, i8, $i9, $r2.index, 1802460213);
                }
            } else if ($i6 == 0) {
                if (-1 == $r2.position * -229827367) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(0, i6, $r4, $i11, i7, $i12, 1814722071);
                        log.add(i, i3, i4, i7, $r7, null, Chart.parent[i6], 0, $l15, i9);
                        if ($r2.count * -1655214851 != 0) {
                            context.get(i3, i4, $i6, i6, $r2.index, 1574293111);
                        }
                    }
                }
                $r7 = new AttributeList(i5, 0, i6, i2, i3, i4, $r2.position * -229827367, true, null);
                log.add(i, i3, i4, i7, $r7, null, Chart.parent[i6], 0, $l15, i9);
                if ($r2.count * -1655214851 != 0) {
                    context.get(i3, i4, $i6, i6, $r2.index, 1574293111);
                }
            } else if ($i6 == 1) {
                if ($r2.position * -229827367 == -1) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(1, i6, $r4, $i11, i7, $i12, 249241301);
                        log.add(i, i3, i4, i7, $r7, null, Chart.$assertionsDisabled[i6], 0, $l15, i9);
                        if ($r2.count * -1655214851 != 0) {
                            context.get(i3, i4, $i6, i6, $r2.index, 1614851779);
                        }
                    }
                }
                $r7 = new AttributeList(i5, 1, i6, i2, i3, i4, -229827367 * $r2.position, true, null);
                log.add(i, i3, i4, i7, $r7, null, Chart.$assertionsDisabled[i6], 0, $l15, i9);
                if ($r2.count * -1655214851 != 0) {
                    context.get(i3, i4, $i6, i6, $r2.index, 1614851779);
                }
            } else if (2 == $i6) {
                $i9 = (i6 + 1) & 3;
                if (-1 == $r2.position * -229827367) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(2, $i9, $r4, $i11, i7, $i12, 1023608519);
                        $r14 = $r2.add(2, i6 + 4, $r4, $i11, i7, $i12, 1798057524);
                        log.add(i, i3, i4, i7, $r14, $r7, Chart.parent[i6], Chart.parent[$i9], $l15, i9);
                        if (-1655214851 * $r2.count != 0) {
                            context.get(i3, i4, $i6, i6, $r2.index, 1597800519);
                        }
                    }
                }
                $r7 = new AttributeList(i5, 2, $i9, i2, i3, i4, -229827367 * $r2.position, true, null);
                $r14 = new AttributeList(i5, 2, i6 + 4, i2, i3, i4, -229827367 * $r2.position, true, null);
                log.add(i, i3, i4, i7, $r14, $r7, Chart.parent[i6], Chart.parent[$i9], $l15, i9);
                if (-1655214851 * $r2.count != 0) {
                    context.get(i3, i4, $i6, i6, $r2.index, 1597800519);
                }
            } else if ($i6 == 3) {
                if ($r2.position * -229827367 == -1) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(3, i6, $r4, $i11, i7, $i12, 859494049);
                        log.add(i, i3, i4, i7, $r7, null, Chart.$assertionsDisabled[i6], 0, $l15, i9);
                        if ($r2.count * -1655214851 != 0) {
                            context.get(i3, i4, $i6, i6, $r2.index, 1713935031);
                        }
                    }
                }
                $r7 = new AttributeList(i5, 3, i6, i2, i3, i4, $r2.position * -229827367, true, null);
                log.add(i, i3, i4, i7, $r7, null, Chart.$assertionsDisabled[i6], 0, $l15, i9);
                if ($r2.count * -1655214851 != 0) {
                    context.get(i3, i4, $i6, i6, $r2.index, 1713935031);
                }
            } else if ($i6 == 9) {
                if (-1 == $r2.position * -229827367) {
                    if ($r2.size == null) {
                        $r7 = $r2.add($i6, i6, $r4, $i11, i7, $i12, 885298490);
                        log.add(i, i3, i4, i7, 1, 1, $r7, 0, $l15, i9);
                        if ($r2.count * -1655214851 != 0) {
                            context.toString(i3, i4, i8, $i9, $r2.index, 1690204394);
                        }
                    }
                }
                $r7 = new AttributeList(i5, $i6, i6, i2, i3, i4, -229827367 * $r2.position, true, null);
                log.add(i, i3, i4, i7, 1, 1, $r7, 0, $l15, i9);
                if ($r2.count * -1655214851 != 0) {
                    context.toString(i3, i4, i8, $i9, $r2.index, 1690204394);
                }
            } else if ($i6 == 4) {
                if ($r2.position * -229827367 == -1) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(4, i6, $r4, $i11, i7, $i12, 524490615);
                        log.add(i, i3, i4, i7, $r7, null, Chart.parent[i6], 0, 0, 0, $l15, i9);
                    }
                }
                $r7 = new AttributeList(i5, 4, i6, i2, i3, i4, -229827367 * $r2.position, true, null);
                log.add(i, i3, i4, i7, $r7, null, Chart.parent[i6], 0, 0, 0, $l15, i9);
            } else if ($i6 == 5) {
                $l17 = log.append(i, i3, i4);
                $i6 = 0 != $l17 ? BigInteger.get(Method.get($l17), 2128849313).buf * 1681090481 : 16;
                if (-229827367 * $r2.position == -1) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(4, i6, $r4, $i11, i7, $i12, 1953538555);
                        log.add(i, i3, i4, i7, $r7, null, Chart.parent[i6], 0, Chart.text[i6] * $i6, Chart.f41p[i6] * $i6, $l15, i9);
                    }
                }
                $r7 = new AttributeList(i5, 4, i6, i2, i3, i4, -229827367 * $r2.position, true, null);
                log.add(i, i3, i4, i7, $r7, null, Chart.parent[i6], 0, Chart.text[i6] * $i6, Chart.f41p[i6] * $i6, $l15, i9);
            } else if (6 == $i6) {
                $l17 = log.append(i, i3, i4);
                $i6 = 0 != $l17 ? (BigInteger.get(Method.get($l17), 1721220864).buf * 1681090481) / 2 : 8;
                if ($r2.position * -229827367 == -1) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(4, i6 + 4, $r4, $i11, i7, $i12, 958417068);
                        log.add(i, i3, i4, i7, $r7, null, 256, i6, Chart.f42r[i6] * $i6, Chart.buf[i6] * $i6, $l15, i9);
                    }
                }
                $r7 = new AttributeList(i5, 4, i6 + 4, i2, i3, i4, -229827367 * $r2.position, true, null);
                log.add(i, i3, i4, i7, $r7, null, 256, i6, Chart.f42r[i6] * $i6, Chart.buf[i6] * $i6, $l15, i9);
            } else if (7 == $i6) {
                i6 = (i6 + 2) & 3;
                if (-1 == -229827367 * $r2.position) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(4, i6 + 4, $r4, $i11, i7, $i12, 837283294);
                        log.add(i, i3, i4, i7, $r7, null, 256, i6, 0, 0, $l15, i9);
                    }
                }
                $r7 = new AttributeList(i5, 4, i6 + 4, i2, i3, i4, -229827367 * $r2.position, true, null);
                log.add(i, i3, i4, i7, $r7, null, 256, i6, 0, 0, $l15, i9);
            } else if ($i6 == 8) {
                $l17 = log.append(i, i3, i4);
                $i6 = 0 != $l17 ? (BigInteger.get(Method.get($l17), 1740947552).buf * 1681090481) / 2 : 8;
                $i9 = (i6 + 2) & 3;
                if ($r2.position * -229827367 == -1) {
                    if ($r2.size == null) {
                        $r7 = $r2.add(4, $i9 + 4, $r4, $i11, i7, $i12, 8175521);
                        $r14 = $r2.add(4, i6 + 4, $r4, $i11, i7, $i12, 971868120);
                        log.add(i, i3, i4, i7, $r14, $r7, 256, i6, Chart.f42r[i6] * $i6, $i6 * Chart.buf[i6], $l15, i9);
                    }
                }
                $r7 = new AttributeList(i5, 4, $i9 + 4, i2, i3, i4, $r2.position * -229827367, true, null);
                $r14 = new AttributeList(i5, 4, i6 + 4, i2, i3, i4, $r2.position * -229827367, true, null);
                log.add(i, i3, i4, i7, $r14, $r7, 256, i6, Chart.f42r[i6] * $i6, $i6 * Chart.buf[i6], $l15, i9);
            }
        } catch (Throwable $r9) {
            throw StringBuilder.append($r9, "do.az(" + ')');
        }
    }

    public static boolean add(Class classR, int i, byte b) {
        try {
            byte[] $r1 = classR.add(i, (byte) 45);
            if ($r1 == null) {
                return false;
            }
            SparseFieldVector.add($r1, -346754440);
            return true;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "do.az(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int parse(int r22, p000.CharSequence r23, boolean r24, int r25) {
        /*
        r25 = 0;
        r3 = 4200; // 0x1068 float:5.885E-42 double:2.075E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x00e1;
    L_0x0008:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r5 = p000.XMLParser.data;
        r25 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.XMLParser.value = r25;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r3 = 1350441998; // 0x507e1c0e float:1.70530058E10 double:6.67206998E-315;
        r0 = r22;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r7 = r6.value;	 Catch:{ RuntimeException -> 0x0095 }
        r5[r25] = r7;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x0047:
        r3 = 4204; // 0x106c float:5.891E-42 double:2.077E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x0229;
    L_0x004d:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r4 = p000.XMLParser.this$0;
        r8 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r3;
        p000.XMLParser.type = r8;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r3;
        r8 = r8 + -1;
        r3 = 1955625534; // 0x74907a3e float:9.15735E31 double:9.662073925E-315;
        r0 = r22;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r6.name;	 Catch:{ RuntimeException -> 0x0095 }
        r22 = r0;
        r3 = 1099170281; // 0x418401e9 float:16.500933 double:5.43062275E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r3 = 1;
        r0 = r22;
        if (r0 != r3) goto L_0x0091;
    L_0x008f:
        r25 = 1;
    L_0x0091:
        r4[r8] = r25;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x0095:
        r9 = move-exception;
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = "do.ak(";
        r10 = r10.append(r11);
        r3 = 41;
        r10 = r10.append(r3);
        r7 = r10.toString();
        r12 = p000.StringBuilder.append(r9, r7);
        throw r12;
    L_0x00b0:
        r3 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r0 = r22;
        if (r0 < r3) goto L_0x05ff;
    L_0x00b6:
        r3 = 1238222265; // 0x49cdc5b9 float:1685687.1 double:6.11763083E-315;
        p000.Cache.type = r3;
        r13 = 0;
        p000.AbstractParser.value = r13;
    L_0x00be:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r25 = p000.Cache.type;
        r3 = -696430729; // 0xffffffffd67d4f77 float:-6.9629435E13 double:NaN;
        r25 = r3 * r25;
        r4[r22] = r25;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x00e1:
        r3 = 4201; // 0x1069 float:5.887E-42 double:2.0756E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x01bc;
    L_0x00e7:
        r22 = p000.XMLParser.type;
        r3 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r25 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + 1;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1643030917; // 0x61eea985 float:5.5031753E20 double:8.11765131E-315;
        r0 = r25;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        r0 = r22;
        if (r0 < r3) goto L_0x05d6;
    L_0x011f:
        r3 = 5;
        r0 = r22;
        if (r0 > r3) goto L_0x05d6;
    L_0x0124:
        r5 = r6.text;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r22 + -1;
        r7 = r5[r25];	 Catch:{ RuntimeException -> 0x0095 }
        if (r7 == 0) goto L_0x05d6;
    L_0x012c:
        r5 = p000.XMLParser.data;
        r25 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.XMLParser.value = r25;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r14 = r6.text;	 Catch:{ RuntimeException -> 0x0095 }
        r22 = r22 + -1;
        r7 = r14[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r5[r25] = r7;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x014e:
        r4 = p000.XMLParser.this$0;
        r25 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.XMLParser.type = r25;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r4[r25] = r22;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x016a:
        r15 = r17[r16];	 Catch:{ RuntimeException -> 0x0095 }
        r18[r16] = r15;	 Catch:{ RuntimeException -> 0x0095 }
        r16 = r16 + 1;
    L_0x0170:
        r0 = r16;
        r1 = r22;
        if (r0 < r1) goto L_0x016a;
    L_0x0176:
        r17 = r18;
    L_0x0178:
        r15 = (short) r8;
        r17[r22] = r15;	 Catch:{ RuntimeException -> 0x0095 }
        r22 = r22 + 1;
    L_0x017d:
        r8 = r8 + 1;
    L_0x017f:
        r16 = p000.Message.entry;
        r3 = 916326225; // 0x369e0751 float:4.7096187E-6 double:4.52725308E-315;
        r0 = r16;
        r0 = r0 * r3;
        r16 = r0;
        if (r8 >= r0) goto L_0x0478;
    L_0x018b:
        r3 = 1230503618; // 0x4957fec2 float:884716.1 double:6.079495647E-315;
        r6 = p000.Set.get(r8, r3);	 Catch:{ RuntimeException -> 0x0095 }
        if (r19 == 0) goto L_0x019a;
    L_0x0194:
        r0 = r6.root;	 Catch:{ RuntimeException -> 0x0095 }
        r24 = r0;
        if (r24 == 0) goto L_0x017d;
    L_0x019a:
        r0 = r6.log;	 Catch:{ RuntimeException -> 0x0095 }
        r16 = r0;
        r3 = -50977591; // 0xfffffffffcf624c9 float:-1.0224409E37 double:NaN;
        r16 = r3 * r16;
        r3 = -1;
        r0 = r16;
        if (r0 != r3) goto L_0x017d;
    L_0x01a8:
        r0 = r6.value;	 Catch:{ RuntimeException -> 0x0095 }
        r20 = r0;
        r20 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r20;
        r16 = r0.indexOf(r7);	 Catch:{ RuntimeException -> 0x0095 }
        r3 = -1;
        r0 = r16;
        if (r0 != r3) goto L_0x00b0;
    L_0x01bb:
        goto L_0x017d;
    L_0x01bc:
        r3 = 4202; // 0x106a float:5.888E-42 double:2.076E-320;
        r0 = r22;
        if (r0 != r3) goto L_0x031d;
    L_0x01c2:
        r22 = p000.XMLParser.type;
        r3 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r25 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + 1;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 2047435302; // 0x7a096226 float:1.7833384E35 double:1.011567445E-314;
        r0 = r25;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        r0 = r22;
        if (r0 < r3) goto L_0x0294;
    L_0x01fa:
        r3 = 5;
        r0 = r22;
        if (r0 > r3) goto L_0x0294;
    L_0x01ff:
        r5 = r6.this$0;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r22 + -1;
        r7 = r5[r25];	 Catch:{ RuntimeException -> 0x0095 }
        if (r7 == 0) goto L_0x0294;
    L_0x0207:
        r5 = p000.XMLParser.data;
        r25 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.XMLParser.value = r25;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r14 = r6.this$0;	 Catch:{ RuntimeException -> 0x0095 }
        r22 = r22 + -1;
        r7 = r14[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r5[r25] = r7;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x0229:
        r3 = 4205; // 0x106d float:5.892E-42 double:2.0775E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x02b2;
    L_0x022f:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1309300937; // 0x4e0a58c9 float:5.8026861E8 double:6.46880613E-315;
        r0 = r22;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r6.log;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -50977591; // 0xfffffffffcf624c9 float:-1.0224409E37 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r3 = -1;
        r0 = r25;
        if (r0 != r3) goto L_0x045c;
    L_0x0261:
        r0 = r6.tag;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -1461501241; // 0xffffffffa8e342c7 float:-2.5231023E-14 double:NaN;
        r25 = r3 * r25;
        if (r25 < 0) goto L_0x045c;
    L_0x026c:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r0 = r6.tag;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -1461501241; // 0xffffffffa8e342c7 float:-2.5231023E-14 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r4[r22] = r25;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x0294:
        r5 = p000.XMLParser.data;
        r22 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.value = r22;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r11 = "";
        r5[r22] = r11;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x02b2:
        r3 = 4206; // 0x106e float:5.894E-42 double:2.078E-320;
        r0 = r22;
        if (r0 != r3) goto L_0x04cb;
    L_0x02b8:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1568000668; // 0x5d75ca9c float:1.10694625E18 double:7.746952627E-315;
        r0 = r22;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r6.log;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -50977591; // 0xfffffffffcf624c9 float:-1.0224409E37 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        if (r25 < 0) goto L_0x04af;
    L_0x02e7:
        r0 = r6.tag;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -1461501241; // 0xffffffffa8e342c7 float:-2.5231023E-14 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        if (r25 < 0) goto L_0x04af;
    L_0x02f5:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r0 = r6.tag;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -1461501241; // 0xffffffffa8e342c7 float:-2.5231023E-14 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r4[r22] = r25;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x031d:
        r3 = 4203; // 0x106b float:5.89E-42 double:2.0766E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x0047;
    L_0x0323:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r4 = p000.XMLParser.this$0;
        r25 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.XMLParser.type = r25;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r3 = 1756153668; // 0x68acc744 float:6.5273827E24 double:8.67655196E-315;
        r0 = r22;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r6.id;	 Catch:{ RuntimeException -> 0x0095 }
        r22 = r0;
        r3 = 116446285; // 0x6f0d44d float:9.0589914E-35 double:5.7532109E-316;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r4[r25] = r22;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x036c:
        r3 = 4209; // 0x1071 float:5.898E-42 double:2.0795E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x040f;
    L_0x0372:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1122774771; // 0x42ec2ef3 float:118.0917 double:5.547244424E-315;
        r0 = r22;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r6.url;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = 2018587685; // 0x78513425 float:1.697262E34 double:9.973148283E-315;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        if (r25 < 0) goto L_0x014e;
    L_0x03a1:
        r0 = r6.source;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -778372525; // 0xffffffffd19afa53 float:-8.3203088E10 double:NaN;
        r25 = r3 * r25;
        if (r25 < 0) goto L_0x014e;
    L_0x03ac:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r0 = r6.source;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -778372525; // 0xffffffffd19afa53 float:-8.3203088E10 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r4[r22] = r25;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x03d4:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r17 = p000.AbstractParser.value;
        r25 = p000.Locale.value;
        r3 = -1505548831; // 0xffffffffa64325e1 float:-6.770555E-16 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.Locale.value = r25;
        r3 = 1214242337; // 0x485fde21 float:229240.52 double:5.999154244E-315;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r15 = r17[r25];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r25 = r15 & r3;
        r4[r22] = r25;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x040f:
        r3 = 4210; // 0x1072 float:5.9E-42 double:2.08E-320;
        r0 = r22;
        if (r0 != r3) goto L_0x0595;
    L_0x0415:
        r5 = p000.XMLParser.data;
        r22 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.value = r22;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r7 = r5[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        r0 = r22;
        if (r3 != r0) goto L_0x061c;
    L_0x044a:
        r19 = 1;
    L_0x044c:
        r7 = r7.toLowerCase();	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 16;
        r0 = new short[r3];	 Catch:{ RuntimeException -> 0x0095 }
        r17 = r0;
        r8 = 0;
        r22 = 0;
        goto L_0x017f;
    L_0x045c:
        r4 = p000.XMLParser.this$0;
        r25 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.XMLParser.type = r25;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r4[r25] = r22;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x0478:
        p000.AbstractParser.value = r17;
        r3 = 0;
        p000.Locale.value = r3;
        r3 = -1238222265; // 0xffffffffb6323a47 float:-2.6557989E-6 double:NaN;
        r22 = r3 * r22;
        p000.Cache.type = r22;
        r22 = p000.Cache.type;
        r3 = -696430729; // 0xffffffffd67d4f77 float:-6.9629435E13 double:NaN;
        r22 = r3 * r22;
        r0 = r22;
        r5 = new java.lang.String[r0];	 Catch:{ RuntimeException -> 0x0095 }
    L_0x048f:
        r22 = p000.Cache.type;
        r3 = -696430729; // 0xffffffffd67d4f77 float:-6.9629435E13 double:NaN;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r0 = r25;
        r1 = r22;
        if (r0 >= r1) goto L_0x0621;
    L_0x049f:
        r15 = r17[r25];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1810674935; // 0x6becb4f7 float:5.7232215E26 double:8.94592281E-315;
        r6 = p000.Set.get(r15, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r7 = r6.value;	 Catch:{ RuntimeException -> 0x0095 }
        r5[r25] = r7;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r25 + 1;
        goto L_0x048f;
    L_0x04af:
        r4 = p000.XMLParser.this$0;
        r25 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.XMLParser.type = r25;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r4[r25] = r22;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x04cb:
        r3 = 4207; // 0x106f float:5.895E-42 double:2.0785E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x050e;
    L_0x04d1:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r4 = p000.XMLParser.this$0;
        r8 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r3;
        p000.XMLParser.type = r8;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r3;
        r8 = r8 + -1;
        r3 = 1067851485; // 0x3fa61edd float:1.2978169 double:5.275887336E-315;
        r0 = r22;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r6.type;	 Catch:{ RuntimeException -> 0x0095 }
        r24 = r0;
        if (r24 == 0) goto L_0x050a;
    L_0x0508:
        r25 = 1;
    L_0x050a:
        r4[r8] = r25;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x050e:
        r3 = 4208; // 0x1070 float:5.897E-42 double:2.079E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x036c;
    L_0x0514:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 - r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r4[r22];	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1484553195; // 0x587c7beb float:1.11043662E15 double:7.33466733E-315;
        r0 = r22;
        r6 = p000.Set.get(r0, r3);	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r6.url;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = 2018587685; // 0x78513425 float:1.697262E34 double:9.973148283E-315;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r3 = -1;
        r0 = r25;
        if (r0 != r3) goto L_0x0579;
    L_0x0546:
        r0 = r6.source;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -778372525; // 0xffffffffd19afa53 float:-8.3203088E10 double:NaN;
        r25 = r3 * r25;
        if (r25 < 0) goto L_0x0579;
    L_0x0551:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r0 = r6.source;	 Catch:{ RuntimeException -> 0x0095 }
        r25 = r0;
        r3 = -778372525; // 0xffffffffd19afa53 float:-8.3203088E10 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r4[r22] = r25;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x0579:
        r4 = p000.XMLParser.this$0;
        r25 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r25;
        r0 = r0 + r3;
        r25 = r0;
        p000.XMLParser.type = r25;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r25 = r25 + -1;
        r4[r25] = r22;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x0595:
        r3 = 4211; // 0x1073 float:5.901E-42 double:2.0805E-320;
        r0 = r22;
        if (r0 != r3) goto L_0x05f4;
    L_0x059b:
        r17 = p000.AbstractParser.value;
        if (r17 == 0) goto L_0x05b9;
    L_0x059f:
        r22 = p000.Locale.value;
        r3 = 1214242337; // 0x485fde21 float:229240.52 double:5.999154244E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r25 = p000.Cache.type;
        r3 = -696430729; // 0xffffffffd67d4f77 float:-6.9629435E13 double:NaN;
        r0 = r25;
        r0 = r0 * r3;
        r25 = r0;
        r0 = r22;
        r1 = r25;
        if (r0 < r1) goto L_0x03d4;
    L_0x05b9:
        r4 = p000.XMLParser.this$0;
        r22 = p000.XMLParser.type;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.type = r22;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r3 = -1;
        r4[r22] = r3;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x05d6:
        r5 = p000.XMLParser.data;
        r22 = p000.XMLParser.value;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r22;
        r0 = r0 + r3;
        r22 = r0;
        p000.XMLParser.value = r22;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r22;
        r0 = r0 * r3;
        r22 = r0;
        r22 = r22 + -1;
        r11 = "";
        r5[r22] = r11;	 Catch:{ RuntimeException -> 0x0095 }
        r3 = 1;
        return r3;
    L_0x05f4:
        r3 = 4212; // 0x1074 float:5.902E-42 double:2.081E-320;
        r0 = r22;
        if (r3 != r0) goto L_0x0638;
    L_0x05fa:
        r3 = 0;
        p000.Locale.value = r3;
        r3 = 1;
        return r3;
    L_0x05ff:
        r0 = r17;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0095 }
        r16 = r0;
        r0 = r22;
        r1 = r16;
        if (r0 < r1) goto L_0x063a;
    L_0x060a:
        r0 = r17;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0095 }
        r16 = r0;
        r16 = r16 * 2;
        r0 = r16;
        r0 = new short[r0];	 Catch:{ RuntimeException -> 0x0095 }
        r18 = r0;
        r16 = 0;
        goto L_0x0170;
    L_0x061c:
        r19 = 0;
        goto L_0x044c;
    L_0x0621:
        r17 = p000.AbstractParser.value;
        r0 = r5.length;	 Catch:{ RuntimeException -> 0x0095 }
        r22 = r0;
        r22 = r22 + -1;
        r3 = 0;
        r21 = -1173317294; // 0xffffffffba109952 float:-5.5160106E-4 double:NaN;
        r0 = r17;
        r1 = r22;
        r2 = r21;
        p000.ArrayList.add(r5, r0, r3, r1, r2);	 Catch:{ RuntimeException -> 0x0095 }
        goto L_0x00be;
    L_0x0638:
        r3 = 2;
        return r3;
    L_0x063a:
        goto L_0x0178;
        */
        throw new UnsupportedOperationException("Method not decompiled: Short.parse(int, CharSequence, boolean, int):int");
    }

    public static void read(int i) {
        if (MappedRandomAccessFile.buffer != null) {
            try {
                MappedRandomAccessFile.buffer.get((byte) -80);
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "do.ag(" + ')');
            }
        }
    }
}
