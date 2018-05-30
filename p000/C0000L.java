package p000;

/* compiled from: bw */
public class C0000L {
    static final int RESPONSE_STATUS_OK = 128;
    static final int TA_BASELINE = 24;

    C0000L() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bw.<init>(" + ')');
        }
    }

    public static int create(int $i0, int i, int $i1) {
        $i1 &= 3;
        return $i1 == 0 ? $i0 : $i1 != 1 ? $i1 == 2 ? 7 - $i0 : 7 - i : i;
    }

    public static int create(int $i3, int $i0, int $i1, int i, int i2, int $i2) {
        if (($i2 & 1) != 1) {
            $i2 = i2;
            i2 = i;
            i = $i2;
        }
        $i1 &= 3;
        return $i1 == 0 ? $i0 : $i1 == 1 ? (7 - $i3) - (i2 - 1) : $i1 == 2 ? (7 - $i0) - (i - 1) : $i3;
    }

    public static int m33d(int $i0, int i, int $i1) {
        $i1 &= 3;
        return $i1 == 0 ? $i0 : $i1 != 1 ? $i1 == 2 ? 7 - $i0 : 7 - i : i;
    }

    public static int m34d(int $i0, int $i3, int $i1, int i, int i2, int $i2) {
        if (($i2 & 1) != 1) {
            $i2 = i2;
            i2 = i;
            i = $i2;
        }
        $i1 &= 3;
        if ($i1 == 0) {
            return $i3;
        }
        if ($i1 == 1) {
            $i0 = (7 - $i0) - (i2 - 1);
        } else if ($i1 == 2) {
            return (7 - $i3) - (i - 1);
        }
        return $i0;
    }

    public static int encode(int $i3, int $i0, int $i1, int i, int i2, int $i2) {
        if (($i2 & 1) != 1) {
            $i2 = i2;
            i2 = i;
            i = $i2;
        }
        $i1 &= 3;
        return $i1 == 0 ? $i3 : $i1 == 1 ? $i0 : $i1 == 2 ? (7 - $i3) - (i2 - 1) : (7 - $i0) - (i - 1);
    }

    public static TIntArrayList get(int i, byte b) {
        try {
            TIntArrayList $r2 = (TIntArrayList) TIntArrayList.items.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = TIntArrayList.index.get(3, i, -1147498289);
            $r2 = new TIntArrayList();
            if ($r4 != null) {
                $r2.add(new Logger($r4), 1524776824);
            }
            TIntArrayList.items.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "bw.ad(" + ')');
        }
    }

    public static int m35i(int $i2, int i, int $i1) {
        $i1 &= 3;
        return $i1 == 0 ? $i2 : $i1 == 1 ? i : $i1 == 2 ? 7 - $i2 : 7 - i;
    }

    public static int log(int $i0, int i, int $i1) {
        $i1 &= 3;
        return $i1 == 0 ? $i0 : $i1 == 1 ? i : $i1 == 2 ? 7 - $i0 : 7 - i;
    }

    static void parse(ArrayList arrayList, int i, int i2) {
        try {
            int $i3;
            CharSequence $r6;
            CharSequence $r7;
            int $i4;
            Throwable $r16;
            Object[] $r1 = arrayList.size;
            if (Page.toString(182090275 * arrayList.header, (byte) -67)) {
                SparseFieldVector.value = (MediaType) $r1[0];
                ByteBufferList $r5 = ByteBufferList.data[SparseFieldVector.value.length * -1099459587];
                i2 = arrayList.header * 182090275;
                $i3 = -2068206069 * $r5.type;
                $r6 = Resources.toString(TwofishEngine.af(1733135393 * $r5.this$0, i2, 735380873), i2, -1341749200);
                $r7 = $r6;
                if ($r6 == null) {
                    $r6 = Resources.toString(((40000 + $i3) << 8) + i2, i2, -1386225938);
                    $r7 = $r6;
                    if ($r6 == null) {
                        $r7 = null;
                    }
                }
            } else {
                $r7 = Attribute.toString(((Integer) $r1[0]).intValue(), -59132673);
            }
            if ($r7 != null) {
                int $i42;
                int $i5;
                String $r14;
                XMLParser.type = 0;
                XMLParser.value = 0;
                int[] $r9 = $r7.value;
                int[] $r10 = $r7.data;
                XMLParser.offset = 0;
                AssertionError.value = new int[(407879525 * $r7.pos)];
                i2 = 0;
                Target.value = new String[($r7.head * -1469700137)];
                int $i2 = 0;
                $i3 = 1;
                while (true) {
                    $i4 = $r1.length;
                    if ($i3 >= $i4) {
                        break;
                    }
                    if ($r1[$i3] instanceof Integer) {
                        System $r13;
                        $i42 = ((Integer) $r1[$i3]).intValue();
                        $i5 = $i42;
                        if (-2147483647 == $i42) {
                            $i5 = -13807801 * arrayList.count;
                        }
                        if (-2147483646 == $i5) {
                            $i5 = 1604438419 * arrayList.value;
                        }
                        if ($i5 == -2147483645) {
                            if (arrayList.name != null) {
                                $i4 = arrayList.name;
                                $r13 = $i4;
                                $i5 = $i4.value * 1172750087;
                            } else {
                                $i5 = -1;
                            }
                        }
                        if ($i5 == -2147483644) {
                            $i5 = arrayList.pos * -947161835;
                        }
                        if ($i5 == -2147483643) {
                            if (arrayList.name != null) {
                                $i4 = arrayList.name;
                                $r13 = $i4;
                                $i5 = $i4.next * 2102445939;
                            } else {
                                $i5 = -1;
                            }
                        }
                        if ($i5 == -2147483642) {
                            if (arrayList.parent != null) {
                                $i4 = arrayList.parent;
                                $r13 = $i4;
                                $i5 = $i4.value * 1172750087;
                            } else {
                                $i5 = -1;
                            }
                        }
                        if (-2147483641 == $i5) {
                            if (arrayList.parent != null) {
                                $i4 = arrayList.parent;
                                $r13 = $i4;
                                $i5 = $i4.next * 2102445939;
                            } else {
                                $i5 = -1;
                            }
                        }
                        if (-2147483640 == $i5) {
                            $i5 = 1094872107 * arrayList.head;
                        }
                        AssertionError.value[i2] = $i5 == -2147483639 ? arrayList.channel * 361884663 : $i5;
                        i2++;
                        $i42 = $i2;
                    } else if ($r1[$i3] instanceof String) {
                        $r14 = (String) $r1[$i3];
                        try {
                            if ($r14.equals("event_opbase")) {
                                $r14 = arrayList.next;
                            }
                            $i42 = $i2 + 1;
                            Target.value[$i2] = $r14;
                        } catch (Exception e) {
                            $r16 = e;
                            i2 = -1;
                        }
                    } else {
                        $i42 = $i2;
                    }
                    $i3++;
                    $i2 = $i42;
                }
                $i2 = 0;
                XMLParser.index = arrayList.branch * 698456767;
                i2 = -1;
                $i3 = -1;
                while (true) {
                    $i2++;
                    if ($i2 > i) {
                        throw new RuntimeException();
                    } else {
                        $i3++;
                        i2 = $r9[$i3];
                        if (i2 >= 100) {
                            try {
                                switch (Byte.read(i2, $r7, $r7.data[$i3] == 1, (byte) -49)) {
                                    case 0:
                                        break;
                                    case 1:
                                        continue;
                                    case 2:
                                        throw new IllegalStateException();
                                    default:
                                        continue;
                                }
                            } catch (Exception e2) {
                                $r16 = e2;
                            }
                        } else if (i2 == 0) {
                            $r11 = XMLParser.this$0;
                            $i42 = XMLParser.type - 1194553915;
                            XMLParser.type = $i42;
                            $r11[($i42 * 537618701) - 1] = $r10[$i3];
                        } else if (i2 == 1) {
                            $i42 = $r10[$i3];
                            $r11 = XMLParser.this$0;
                            $i5 = XMLParser.type - 1194553915;
                            XMLParser.type = $i5;
                            $r11[($i5 * 537618701) - 1] = Event.this$0[$i42];
                        } else if (i2 == 2) {
                            $i42 = $r10[$i3];
                            $r11 = Event.this$0;
                            $r21 = XMLParser.this$0;
                            $i5 = XMLParser.type - -1194553915;
                            XMLParser.type = $i5;
                            $r11[$i42] = $r21[$i5 * 537618701];
                            IOUtils.update($i42, -261728602);
                        } else if (3 == i2) {
                            $r12 = XMLParser.data;
                            $i42 = XMLParser.value - 1246602361;
                            XMLParser.value = $i42;
                            $r12[($i42 * -1267697097) - 1] = $r7.length[$i3];
                        } else if (i2 == 6) {
                            $i3 = $r10[$i3] + $i3;
                        } else if (i2 == 7) {
                            XMLParser.type -= 1905859466;
                            if (XMLParser.this$0[(537618701 * XMLParser.type) + 1] != XMLParser.this$0[537618701 * XMLParser.type]) {
                                $i3 = $r10[$i3] + $i3;
                            }
                        } else if (8 == i2) {
                            XMLParser.type -= 1905859466;
                            if (XMLParser.this$0[537618701 * XMLParser.type] == XMLParser.this$0[(XMLParser.type * 537618701) + 1]) {
                                $i3 = $r10[$i3] + $i3;
                            }
                        } else if (i2 == 9) {
                            XMLParser.type -= 1905859466;
                            if (XMLParser.this$0[537618701 * XMLParser.type] < XMLParser.this$0[(537618701 * XMLParser.type) + 1]) {
                                $i3 = $r10[$i3] + $i3;
                            }
                        } else if (i2 == 10) {
                            XMLParser.type -= 1905859466;
                            if (XMLParser.this$0[537618701 * XMLParser.type] > XMLParser.this$0[(537618701 * XMLParser.type) + 1]) {
                                $i3 = $r10[$i3] + $i3;
                            }
                        } else if (21 == i2) {
                            if (344694797 * XMLParser.offset != 0) {
                                $r19 = XMLParser.count;
                                $i3 = XMLParser.offset - -1432768827;
                                XMLParser.offset = $i3;
                                PathParser $r20 = $r19[$i3 * 344694797];
                                $r7 = $r20.name;
                                $r9 = $r7.value;
                                $r10 = $r7.data;
                                $i3 = $r20.count;
                                AssertionError.value = $r20.value;
                                Target.value = $r20.data;
                                $i3 *= -132320779;
                            } else {
                                return;
                            }
                        } else if (i2 == 25) {
                            $i42 = $r10[$i3];
                            $r11 = XMLParser.this$0;
                            $i5 = XMLParser.type - 1194553915;
                            XMLParser.type = $i5;
                            $r11[($i5 * 537618701) - 1] = IOException.toString($i42, 998830794);
                        } else if (27 == i2) {
                            $i42 = $r10[$i3];
                            $r11 = XMLParser.this$0;
                            $i5 = XMLParser.type - -1194553915;
                            XMLParser.type = $i5;
                            Identifier.toString($i42, $r11[$i5 * 537618701], (short) -2769);
                        } else if (i2 == 31) {
                            XMLParser.type -= 1905859466;
                            if (XMLParser.this$0[537618701 * XMLParser.type] <= XMLParser.this$0[(537618701 * XMLParser.type) + 1]) {
                                $i3 = $r10[$i3] + $i3;
                            }
                        } else if (32 == i2) {
                            XMLParser.type -= 1905859466;
                            if (XMLParser.this$0[XMLParser.type * 537618701] >= XMLParser.this$0[(537618701 * XMLParser.type) + 1]) {
                                $i3 = $r10[$i3] + $i3;
                            }
                        } else if (i2 == 33) {
                            $r11 = XMLParser.this$0;
                            $i42 = XMLParser.type - 1194553915;
                            XMLParser.type = $i42;
                            $r11[($i42 * 537618701) - 1] = AssertionError.value[$r10[$i3]];
                        } else if (34 == i2) {
                            $r11 = AssertionError.value;
                            $i42 = $r10[$i3];
                            $r21 = XMLParser.this$0;
                            $i5 = XMLParser.type - -1194553915;
                            XMLParser.type = $i5;
                            $r11[$i42] = $r21[$i5 * 537618701];
                        } else if (i2 == 35) {
                            $r12 = XMLParser.data;
                            $i42 = XMLParser.value - 1246602361;
                            XMLParser.value = $i42;
                            $r12[($i42 * -1267697097) - 1] = Target.value[$r10[$i3]];
                        } else if (i2 == 36) {
                            $r12 = Target.value;
                            $i42 = $r10[$i3];
                            String[] $r22 = XMLParser.data;
                            $i5 = XMLParser.value - -1246602361;
                            XMLParser.value = $i5;
                            $r12[$i42] = $r22[$i5 * -1267697097];
                        } else if (i2 == 37) {
                            $i42 = $r10[$i3];
                            XMLParser.value -= -1246602361 * $i42;
                            $r12 = XMLParser.data;
                            $i5 = -1267697097 * XMLParser.value;
                            if ($i42 == 0) {
                                $r14 = "";
                            } else if ($i42 == 1) {
                                $r14 = $r12[$i5];
                                $r14 = $r14 == null ? "null" : $r14.toString();
                            } else {
                                $i42 += $i5;
                                $i7 = 0;
                                for (int $i8 = $i5; $i8 < $i42; $i8++) {
                                    $r14 = $r12[$i8];
                                    $i7 = $r14 == null ? $i7 + 4 : $i7 + $r14.length();
                                }
                                $i4 = new StringBuilder($i7);
                                while ($i5 < $i42) {
                                    $r14 = $r12[$i5];
                                    if ($r14 == null) {
                                        $i4.append("null");
                                    } else {
                                        $i4.append($r14);
                                    }
                                    $i5++;
                                }
                                $r14 = $i4.toString();
                            }
                            $r12 = XMLParser.data;
                            $i42 = XMLParser.value - 1246602361;
                            XMLParser.value = $i42;
                            $r12[($i42 * -1267697097) - 1] = $r14;
                        } else if (38 == i2) {
                            XMLParser.type -= -1194553915;
                        } else if (39 == i2) {
                            XMLParser.value -= -1246602361;
                        } else if (i2 == 40) {
                            $r6 = Attribute.toString($r10[$i3], -1244768047);
                            $r10 = new int[(407879525 * $r6.pos)];
                            String[] $r12 = $r6.head * -1469700137;
                            String[] strArr = $r12;
                            $r12 = new String[$r12];
                            $i42 = 0;
                            while (true) {
                                if ($i42 < $r6.size * 950863471) {
                                    $i4 = (XMLParser.type * 537618701) - ($r6.size * 950863471);
                                    $i5 = $i4;
                                    $r10[$i42] = XMLParser.this$0[$i4 + $i42];
                                    $i42++;
                                } else {
                                    for ($i42 = 0; $i42 < 483841497 * $r6.name; $i42++) {
                                        $i4 = (XMLParser.value * -1267697097) - (483841497 * $r6.name);
                                        $i5 = $i4;
                                        $r12[$i42] = XMLParser.data[$i4 + $i42];
                                    }
                                    XMLParser.type -= -769321365 * $r6.size;
                                    XMLParser.value -= -1322194833 * $r6.name;
                                    $i4 = new PathParser();
                                    $i4.name = $r7;
                                    $i4.count = -475434403 * $i3;
                                    $i4.value = AssertionError.value;
                                    $i4.data = Target.value;
                                    $r19 = XMLParser.count;
                                    $i3 = XMLParser.offset - 1432768827;
                                    XMLParser.offset = $i3;
                                    $r19[($i3 * 344694797) - 1] = $i4;
                                    $r9 = $r6.value;
                                    $r11 = $r6.data;
                                    AssertionError.value = $r10;
                                    Target.value = $r12;
                                    $r10 = $r11;
                                    $r7 = $r6;
                                    $i3 = -1;
                                }
                            }
                        } else if (42 == i2) {
                            $r11 = XMLParser.this$0;
                            $i42 = XMLParser.type - 1194553915;
                            XMLParser.type = $i42;
                            $r11[($i42 * 537618701) - 1] = Connection.this$0.size($r10[$i3], 2004268156);
                        } else if (i2 == 43) {
                            $r24 = Connection.this$0;
                            $i42 = $r10[$i3];
                            $r11 = XMLParser.this$0;
                            $i5 = XMLParser.type - -1194553915;
                            XMLParser.type = $i5;
                            $r24.add($i42, $r11[$i5 * 537618701], -313855895);
                        } else if (44 == i2) {
                            $i42 = $r10[$i3] >> 16;
                            $i5 = 65535 & $r10[$i3];
                            $r11 = XMLParser.this$0;
                            $i7 = XMLParser.type - -1194553915;
                            XMLParser.type = $i7;
                            $i7 = $r11[$i7 * 537618701];
                            if ($i7 < 0 || $i7 > 5000) {
                                throw new RuntimeException();
                            } else {
                                XMLParser.name[$i42] = $i7;
                                int i3 = -1;
                                if ($i5 == 105) {
                                    i3 = 0;
                                }
                                for ($i5 = 0; $i5 < $i7; $i5++) {
                                    XMLParser.size[$i42][$i5] = i3;
                                }
                            }
                        } else if (45 == i2) {
                            $i42 = $r10[$i3];
                            $r11 = XMLParser.this$0;
                            $i5 = XMLParser.type - -1194553915;
                            XMLParser.type = $i5;
                            $i5 = $r11[$i5 * 537618701];
                            if ($i5 >= 0) {
                                if ($i5 < XMLParser.name[$i42]) {
                                    $r11 = XMLParser.this$0;
                                    $i7 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i7;
                                    $r11[($i7 * 537618701) - 1] = XMLParser.size[$i42][$i5];
                                }
                            }
                            throw new RuntimeException();
                        } else if (i2 == 46) {
                            $i42 = $r10[$i3];
                            XMLParser.type -= 1905859466;
                            $i5 = XMLParser.this$0[537618701 * XMLParser.type];
                            if ($i5 >= 0) {
                                if ($i5 < XMLParser.name[$i42]) {
                                    XMLParser.size[$i42][$i5] = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                }
                            }
                            throw new RuntimeException();
                        } else if (i2 == 47) {
                            $r14 = Connection.this$0.get($r10[$i3], 712571588);
                            String $r26 = $r14;
                            if ($r14 == null) {
                                $r26 = R$id.this$0;
                            }
                            $r12 = XMLParser.data;
                            $i42 = XMLParser.value - 1246602361;
                            XMLParser.value = $i42;
                            $r12[($i42 * -1267697097) - 1] = $r26;
                        } else if (i2 == 48) {
                            $r24 = Connection.this$0;
                            $i42 = $r10[$i3];
                            $r12 = XMLParser.data;
                            $i5 = XMLParser.value - -1246602361;
                            XMLParser.value = $i5;
                            $r24.put($i42, $r12[$i5 * -1267697097], 689820898);
                        } else if (60 == i2) {
                            Date $r28 = $r7.offset[$r10[$i3]];
                            $r11 = XMLParser.this$0;
                            $i42 = XMLParser.type - -1194553915;
                            XMLParser.type = $i42;
                            Value $r30 = (Value) $r28.get((long) $r11[$i42 * 537618701]);
                            if ($r30 != null) {
                                $i3 = $r30.value + $i3;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
            return;
            $i4 = new StringBuilder(30);
            $i4.append("").append($r7.size).append(" ");
            for (i = (344694797 * XMLParser.offset) - 1; i >= 0; i--) {
                $i4.append("").append(XMLParser.count[i].name.size).append(" ");
            }
            $i4.append("").append(i2);
            JSONArray.get($i4.toString(), $r16, (short) -13250);
        } catch (RuntimeException $r15) {
            throw StringBuilder.append($r15, "bw.ad(" + ')');
        }
    }

    public static int translate(int $i3, int $i0, int $i1, int i, int i2, int $i2) {
        if (($i2 & 1) != 1) {
            $i2 = i2;
            i2 = i;
            i = $i2;
        }
        $i1 &= 3;
        return $i1 == 0 ? $i3 : $i1 == 1 ? $i0 : $i1 == 2 ? (7 - $i3) - (i2 - 1) : (7 - $i0) - (i - 1);
    }
}
