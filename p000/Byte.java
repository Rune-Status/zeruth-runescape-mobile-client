package p000;

import java.lang.reflect.Array;

/* compiled from: ce */
public class Byte extends Element {
    static final int MERGE_BASE = 8;
    static Double f24p;
    static Double[] text;
    final boolean origin;

    public Byte(boolean z) {
        try {
            this.origin = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ce.<init>(" + ')');
        }
    }

    static void init(int i) {
        Chart.count = 1071674573;
        try {
            Chart.position = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
            Primitive.name = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
            ScrollingTextView.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
            Dialog.index = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, DiskLruCache.AppCompatTheme_editTextStyle, DiskLruCache.AppCompatTheme_editTextStyle});
            AstNode.value = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
            Server.value = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
            Chart.max = (int[][]) Array.newInstance(Integer.TYPE, new int[]{Thread.Theme_radioButtonStyle, Thread.Theme_radioButtonStyle});
            Primitive.value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
            Chart.index = new int[DiskLruCache.AppCompatTheme_editTextStyle];
            Namespace.value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
            Chart.next = new int[DiskLruCache.AppCompatTheme_editTextStyle];
            Chart.value = new int[DiskLruCache.AppCompatTheme_editTextStyle];
        } catch (Throwable $r6) {
            throw StringBuilder.append($r6, "ce.af(" + ')');
        }
    }

    static int read(int $i0, CharSequence charSequence, boolean $z0, byte b) {
        int $i2 = 0;
        int $i3;
        int $i4;
        System $r6;
        int[] $r1;
        if ($i0 < 1000) {
            if (100 == $i0) {
                XMLParser.type -= 711305551;
                try {
                    $i3 = XMLParser.this$0[XMLParser.type * 537618701];
                    $i4 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                    $i0 = XMLParser.this$0[(XMLParser.type * 537618701) + 2];
                    if ($i4 == 0) {
                        throw new RuntimeException();
                    }
                    System[] systemArr;
                    System[] $r8;
                    $r6 = ArrayList.get($i3, 187624186);
                    if ($r6.key == null) {
                        systemArr = new System[($i0 + 1)];
                        $r8 = systemArr;
                        $r6.key = systemArr;
                    }
                    systemArr = $r6.key;
                    if (systemArr.length <= $i0) {
                        $r8 = new System[($i0 + 1)];
                        while (true) {
                            systemArr = $r6.key;
                            if ($i2 >= systemArr.length) {
                                break;
                            }
                            $r8[$i2] = $r6.key[$i2];
                            $i2++;
                        }
                        $r6.key = $r8;
                    }
                    if ($i0 > 0) {
                        if ($r6.key[$i0 - 1] == null) {
                            throw new RuntimeException("" + ($i0 - 1));
                        }
                    }
                    System system = new System();
                    system.name = $i4 * 97215005;
                    $i2 = $r6.value * 1;
                    system.value = $i2;
                    system.type = $i2 * 1790940165;
                    system.next = -1063340613 * $i0;
                    system.position = true;
                    $r6.key[$i0] = system;
                    if ($z0) {
                        Constants.data = system;
                    } else {
                        XMLParser.state = system;
                    }
                    client.add($r6, (byte) 119);
                    b = (byte) 1;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "ce.an(" + ')');
                }
            } else if ($i0 == 101) {
                $r6 = $z0 ? Constants.data : XMLParser.state;
                System $r10 = ArrayList.get($r6.value * 1172750087, 265661025);
                $r10.key[$r6.next * 2102445939] = null;
                client.add($r10, (byte) 13);
                b = (byte) 1;
            } else if (102 == $i0) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $r6 = ArrayList.get($r1[$i0 * 537618701], 491963008);
                $r6.key = null;
                client.add($r6, (byte) 62);
                b = (byte) 1;
            } else if ($i0 == 200) {
                XMLParser.type -= 1905859466;
                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                $r6 = DTrace.add($i0, $i2, (byte) 59);
                if ($r6 == null || -1 == $i2) {
                    $r1 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                } else {
                    $r1 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r6;
                    } else {
                        XMLParser.state = $r6;
                    }
                }
                b = (byte) 1;
            } else if (201 == $i0) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $r6 = ArrayList.get($r1[$i0 * 537618701], 600157377);
                if ($r6 != null) {
                    $r1 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r6;
                    } else {
                        XMLParser.state = $r6;
                    }
                } else {
                    $r1 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                }
                b = (byte) 1;
            } else {
                b = (byte) 2;
            }
            return b;
        } else if ($i0 < 1100) {
            return DocWriter.add($i0, charSequence, $z0, (byte) 56);
        } else {
            if ($i0 < 1200) {
                return FileHeader.init($i0, charSequence, $z0, -1778997016);
            }
            if ($i0 < 1300) {
                return FileHeader.parse($i0, charSequence, $z0, (byte) 31);
            }
            if ($i0 < 1400) {
                return Build$VERSION.parse($i0, charSequence, $z0, -904071014);
            }
            if ($i0 < 1500) {
                return Timer.init($i0, charSequence, $z0, 2142624698);
            }
            if ($i0 < 1600) {
                return Database.parse($i0, charSequence, $z0, -104835752);
            }
            if ($i0 < 1700) {
                return Map.parse($i0, charSequence, $z0, 605832545);
            }
            if ($i0 < 1800) {
                $r6 = $z0 ? Constants.data : XMLParser.state;
                if (1700 == $i0) {
                    $r1 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r6.left * -868539721;
                    return 1;
                } else if (1701 == $i0) {
                    if (-868539721 * $r6.left != -1) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.offset * -1148087135;
                        return 1;
                    }
                    $r1 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                    return 1;
                } else if ($i0 != 1702) {
                    return 2;
                } else {
                    $r1 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r6.next * 2102445939;
                    return 1;
                }
            } else if ($i0 < 1900) {
                return Cell.toString($i0, charSequence, $z0, 971693591);
            } else {
                if ($i0 < 2000) {
                    return Cell.parse($i0, charSequence, $z0, -184226430);
                }
                if ($i0 < 2100) {
                    return DocWriter.add($i0, charSequence, $z0, (byte) 8);
                }
                if ($i0 < 2200) {
                    return FileHeader.init($i0, charSequence, $z0, -1779367566);
                }
                if ($i0 < 2300) {
                    return FileHeader.parse($i0, charSequence, $z0, (byte) 8);
                }
                if ($i0 < 2400) {
                    return Build$VERSION.parse($i0, charSequence, $z0, -925168768);
                }
                if ($i0 < 2500) {
                    return Timer.init($i0, charSequence, $z0, 2142624698);
                }
                if ($i0 < 2600) {
                    $r1 = XMLParser.this$0;
                    $i4 = XMLParser.type - -1194553915;
                    XMLParser.type = $i4;
                    $r6 = ArrayList.get($r1[$i4 * 537618701], 788752681);
                    if ($i0 == 2500) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.head * 642824123;
                        return 1;
                    } else if (2501 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.max * 384720325;
                        return 1;
                    } else if (2502 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.this$0 * 256177861;
                        return 1;
                    } else if ($i0 == 2503) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.$assertionsDisabled * 57307023;
                        return 1;
                    } else if (2504 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r6.start) {
                            $i2 = 1;
                        }
                        $r1[$i0] = $i2;
                        return 1;
                    } else if ($i0 != 2505) {
                        return 2;
                    } else {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.type * -1008623461;
                        return 1;
                    }
                } else if ($i0 < 2700) {
                    $r1 = XMLParser.this$0;
                    $i4 = XMLParser.type - -1194553915;
                    XMLParser.type = $i4;
                    $r6 = ArrayList.get($r1[$i4 * 537618701], 1396852174);
                    if ($i0 == 2600) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.f292i * -2091547827;
                        return 1;
                    } else if (2601 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.size * 654937537;
                        return 1;
                    } else if ($i0 == 2602) {
                        $r7 = XMLParser.data;
                        $i0 = XMLParser.value - 1246602361;
                        XMLParser.value = $i0;
                        $r7[($i0 * -1267697097) - 1] = $r6.file;
                        return 1;
                    } else if ($i0 == 2603) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.cursor * 1151268625;
                        return 1;
                    } else if ($i0 == 2604) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.buf * -1243953689;
                        return 1;
                    } else if (2605 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.state * 2105704033;
                        return 1;
                    } else if ($i0 == 2606) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.data * -1375479599;
                        return 1;
                    } else if (2607 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.instance * -1211464689;
                        return 1;
                    } else if ($i0 == 2608) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.count * -2032348791;
                        return 1;
                    } else if ($i0 == 2609) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.result * -479221341;
                        return 1;
                    } else if (2610 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.source * -1726277411;
                        return 1;
                    } else if (2611 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.index * 334261811;
                        return 1;
                    } else if (2612 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.current * 1703184995;
                        return 1;
                    } else if (2613 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.err.get(1125351792);
                        return 1;
                    } else if (2614 != $i0) {
                        return 2;
                    } else {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r6.error) {
                            $i2 = 1;
                        }
                        $r1[$i0] = $i2;
                        return 1;
                    }
                } else if ($i0 < 2800) {
                    if ($i0 == 2700) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - -1194553915;
                        XMLParser.type = $i0;
                        $r6 = ArrayList.get($r1[$i0 * 537618701], 161872534);
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.left * -868539721;
                        return 1;
                    } else if ($i0 == 2701) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - -1194553915;
                        XMLParser.type = $i0;
                        $r6 = ArrayList.get($r1[$i0 * 537618701], 1804218437);
                        if ($r6.left * -868539721 != -1) {
                            $r1 = XMLParser.this$0;
                            $i0 = XMLParser.type - 1194553915;
                            XMLParser.type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r6.offset * -1148087135;
                            return 1;
                        }
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if ($i0 == 2702) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - -1194553915;
                        XMLParser.type = $i0;
                        if (((Character) client.position.get((long) $r1[$i0 * 537618701])) != null) {
                            $r1 = XMLParser.this$0;
                            $i0 = XMLParser.type - 1194553915;
                            XMLParser.type = $i0;
                            $r1[($i0 * 537618701) - 1] = 1;
                            return 1;
                        }
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != $i0) {
                        return 2;
                    } else {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = 1704673651 * client.parent;
                        return 1;
                    }
                } else if ($i0 < 2900) {
                    $r1 = XMLParser.this$0;
                    $i2 = XMLParser.type - -1194553915;
                    XMLParser.type = $i2;
                    $r6 = ArrayList.get($r1[$i2 * 537618701], 738962627);
                    if (2800 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r1[($i0 * 537618701) - 1] = (JSONArray.get($r6, -1050399389) >> 11) & 63;
                        return 1;
                    } else if (2801 == $i0) {
                        $r1 = XMLParser.this$0;
                        $i0 = XMLParser.type - -1194553915;
                        XMLParser.type = $i0;
                        $i0 = $r1[$i0 * 537618701] - 1;
                        if ($r6.format != null) {
                            String[] $r7 = $r6.format;
                            if ($i0 < $r7.length) {
                                if ($r6.format[$i0] != null) {
                                    $r7 = XMLParser.data;
                                    $i2 = XMLParser.value - 1246602361;
                                    XMLParser.value = $i2;
                                    $r7[($i2 * -1267697097) - 1] = $r6.format[$i0];
                                    return 1;
                                }
                            }
                        }
                        $r7 = XMLParser.data;
                        $i0 = XMLParser.value - 1246602361;
                        XMLParser.value = $i0;
                        $r7[($i0 * -1267697097) - 1] = "";
                        return 1;
                    } else if ($i0 != 2802) {
                        return 2;
                    } else {
                        if ($r6.id == null) {
                            $r7 = XMLParser.data;
                            $i0 = XMLParser.value - 1246602361;
                            XMLParser.value = $i0;
                            $r7[($i0 * -1267697097) - 1] = "";
                            return 1;
                        }
                        $r7 = XMLParser.data;
                        $i0 = XMLParser.value - 1246602361;
                        XMLParser.value = $i0;
                        $r7[($i0 * -1267697097) - 1] = $r6.id;
                        return 1;
                    }
                } else if ($i0 < 3000) {
                    return Cell.parse($i0, charSequence, $z0, 471493344);
                } else {
                    if ($i0 < 3200) {
                        return Character.parse($i0, charSequence, $z0, 475635970);
                    }
                    if ($i0 < 3300) {
                        return Option.parse($i0, charSequence, $z0, -1401245391);
                    }
                    if ($i0 < 3400) {
                        return ZStream.toString($i0, charSequence, $z0, 16711935);
                    }
                    int $i11;
                    if ($i0 < 3500) {
                        ByteVector $r12;
                        if (3400 == $i0) {
                            XMLParser.type -= 1905859466;
                            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                            $i4 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                            $r12 = CSVReader.add($i0, -1036470545);
                            if ('s' != $r12.value) {
                                while ($i2 < -112083573 * $r12.count) {
                                    if ($i4 != $r12.index[$i2]) {
                                        $r7 = XMLParser.data;
                                        $i0 = XMLParser.value - 1246602361;
                                        XMLParser.value = $i0;
                                        $r7[($i0 * -1267697097) - 1] = $r12.length[$i2];
                                        $r12 = null;
                                        break;
                                    }
                                    $i2++;
                                }
                                if ($r12 != null) {
                                    $r7 = XMLParser.data;
                                    $i0 = XMLParser.value - 1246602361;
                                    XMLParser.value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r12.size;
                                    return 1;
                                }
                            }
                            while ($i2 < -112083573 * $r12.count) {
                                if ($i4 != $r12.index[$i2]) {
                                    $r7 = XMLParser.data;
                                    $i0 = XMLParser.value - 1246602361;
                                    XMLParser.value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r12.length[$i2];
                                    $r12 = null;
                                    break;
                                }
                                $i2++;
                            }
                            if ($r12 != null) {
                                $r7 = XMLParser.data;
                                $i0 = XMLParser.value - 1246602361;
                                XMLParser.value = $i0;
                                $r7[($i0 * -1267697097) - 1] = $r12.size;
                                return 1;
                            }
                            if ($i2 < -112083573 * $r12.count) {
                                if ($i4 != $r12.index[$i2]) {
                                    $r7 = XMLParser.data;
                                    $i0 = XMLParser.value - 1246602361;
                                    XMLParser.value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r12.length[$i2];
                                    $r12 = null;
                                    break;
                                }
                                $i2++;
                            }
                            if ($r12 != null) {
                                $r7 = XMLParser.data;
                                $i0 = XMLParser.value - 1246602361;
                                XMLParser.value = $i0;
                                $r7[($i0 * -1267697097) - 1] = $r12.size;
                                return 1;
                            }
                        } else if (3408 == $i0) {
                            XMLParser.type -= -483248364;
                            char $i42 = XMLParser.this$0[XMLParser.type * 537618701];
                            char $i02 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                            $i3 = XMLParser.this$0[(XMLParser.type * 537618701) + 2];
                            $i11 = XMLParser.this$0[(XMLParser.type * 537618701) + 3];
                            $r12 = CSVReader.add($i3, 2053406423);
                            char $c10 = $r12.data;
                            if ($c10 == $i42) {
                                if ($i02 == $r12.value) {
                                    while ($i2 < -112083573 * $r12.count) {
                                        if ($i11 == $r12.index[$i2]) {
                                            if ($i02 == 's') {
                                                $r7 = XMLParser.data;
                                                $i4 = XMLParser.value - 1246602361;
                                                XMLParser.value = $i4;
                                                $r7[($i4 * -1267697097) - 1] = $r12.length[$i2];
                                            } else {
                                                $r1 = XMLParser.this$0;
                                                $i4 = XMLParser.type - 1194553915;
                                                XMLParser.type = $i4;
                                                $r1[($i4 * 537618701) - 1] = $r12.next[$i2];
                                            }
                                            $r12 = null;
                                            if ($r12 != null) {
                                                if ('s' != $i02) {
                                                    $r7 = XMLParser.data;
                                                    $i0 = XMLParser.value - 1246602361;
                                                    XMLParser.value = $i0;
                                                    $r7[($i0 * -1267697097) - 1] = $r12.size;
                                                    return 1;
                                                }
                                                $r1 = XMLParser.this$0;
                                                $i0 = XMLParser.type - 1194553915;
                                                XMLParser.type = $i0;
                                                $r1[($i0 * 537618701) - 1] = $r12.current * -240948305;
                                                return 1;
                                            }
                                        }
                                        $i2++;
                                    }
                                    if ($r12 != null) {
                                        if ('s' != $i02) {
                                            $r1 = XMLParser.this$0;
                                            $i0 = XMLParser.type - 1194553915;
                                            XMLParser.type = $i0;
                                            $r1[($i0 * 537618701) - 1] = $r12.current * -240948305;
                                            return 1;
                                        }
                                        $r7 = XMLParser.data;
                                        $i0 = XMLParser.value - 1246602361;
                                        XMLParser.value = $i0;
                                        $r7[($i0 * -1267697097) - 1] = $r12.size;
                                        return 1;
                                    }
                                }
                            }
                            if ($i02 == 's') {
                                $r7 = XMLParser.data;
                                $i0 = XMLParser.value - 1246602361;
                                XMLParser.value = $i0;
                                $r7[($i0 * -1267697097) - 1] = R$id.this$0;
                                return 1;
                            }
                            $r1 = XMLParser.this$0;
                            $i0 = XMLParser.type - 1194553915;
                            XMLParser.type = $i0;
                            $r1[($i0 * 537618701) - 1] = 0;
                            return 1;
                        } else if ($i0 != 3411) {
                            return 2;
                        } else {
                            $r1 = XMLParser.this$0;
                            $i0 = XMLParser.type - -1194553915;
                            XMLParser.type = $i0;
                            $r12 = CSVReader.add($r1[$i0 * 537618701], -1519978075);
                            $r1 = XMLParser.this$0;
                            $i0 = XMLParser.type - 1194553915;
                            XMLParser.type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r12.add((byte) 1);
                            return 1;
                        }
                    } else if ($i0 < 3700) {
                        return BoundingBox.parse($i0, charSequence, $z0, 2123082082);
                    } else {
                        if ($i0 < 4000) {
                            return Item.parse($i0, charSequence, $z0, (byte) -89);
                        }
                        int $i03;
                        if ($i0 < 4100) {
                            if ($i0 == 4000) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 + $i2;
                                return 1;
                            } else if (4001 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 - $i2;
                                return 1;
                            } else if ($i0 == 4002) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 * $i2;
                                return 1;
                            } else if (4003 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 / $i2;
                                return 1;
                            } else if (4004 == $i0) {
                                $r1 = XMLParser.this$0;
                                $i0 = XMLParser.type - -1194553915;
                                XMLParser.type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = XMLParser.this$0;
                                $i2 = XMLParser.type - 1194553915;
                                XMLParser.type = $i2;
                                $i03 = Math.random() * ((double) $i0);
                                r34 = $i03;
                                $r1[($i2 * 537618701) - 1] = (int) $i03;
                                return 1;
                            } else if ($i0 == 4005) {
                                $r1 = XMLParser.this$0;
                                $i0 = XMLParser.type - -1194553915;
                                XMLParser.type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = XMLParser.this$0;
                                $i2 = XMLParser.type - 1194553915;
                                XMLParser.type = $i2;
                                $i03 = Math.random() * ((double) ($i0 + 1));
                                r34 = $i03;
                                $r1[($i2 * 537618701) - 1] = (int) $i03;
                                return 1;
                            } else if (4006 == $i0) {
                                XMLParser.type -= -1677802279;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $i4 = XMLParser.this$0[(XMLParser.type * 537618701) + 2];
                                $i3 = XMLParser.this$0[(XMLParser.type * 537618701) + 3];
                                int $i12 = XMLParser.this$0[(XMLParser.type * 537618701) + 4];
                                $r1 = XMLParser.this$0;
                                $i11 = XMLParser.type - 1194553915;
                                XMLParser.type = $i11;
                                $r1[($i11 * 537618701) - 1] = $i0 + ((($i2 - $i0) * ($i12 - $i4)) / ($i3 - $i4));
                                return 1;
                            } else if (4007 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 + (($i2 * $i0) / 100);
                                return 1;
                            } else if ($i0 == 4008) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 | (1 << $i2);
                                return 1;
                            } else if (4009 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 & (-1 - (1 << $i2));
                                return 1;
                            } else if (4010 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i4 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i3 = XMLParser.type - 1194553915;
                                XMLParser.type = $i3;
                                $i3 = ($i3 * 537618701) - 1;
                                if (($i0 & (1 << $i4)) != 0) {
                                    $i2 = 1;
                                }
                                $r1[$i3] = $i2;
                                return 1;
                            } else if ($i0 == 4011) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 % $i2;
                                return 1;
                            } else if (4012 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = (int) Math.pow((double) $i0, (double) $i2);
                                return 1;
                            } else if (4013 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                double $d0;
                                double d;
                                switch ($i2) {
                                    case 0:
                                        $r1 = XMLParser.this$0;
                                        $i0 = XMLParser.type - 1194553915;
                                        XMLParser.type = $i0;
                                        $r1[($i0 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        $r1 = XMLParser.this$0;
                                        $i2 = XMLParser.type - 1194553915;
                                        XMLParser.type = $i2;
                                        $r1[($i2 * 537618701) - 1] = $i0;
                                        return 1;
                                    case 2:
                                        $r1 = XMLParser.this$0;
                                        $i2 = XMLParser.type - 1194553915;
                                        XMLParser.type = $i2;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i2 * 537618701) - 1] = (int) Math.sqrt($d0);
                                        return 1;
                                    case 3:
                                        $r1 = XMLParser.this$0;
                                        $i2 = XMLParser.type - 1194553915;
                                        XMLParser.type = $i2;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i2 * 537618701) - 1] = (int) Math.cbrt($d0);
                                        return 1;
                                    case 4:
                                        $r1 = XMLParser.this$0;
                                        $i2 = XMLParser.type - 1194553915;
                                        XMLParser.type = $i2;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i2 * 537618701) - 1] = (int) Math.sqrt(Math.sqrt($d0));
                                        return 1;
                                    default:
                                        $r1 = XMLParser.this$0;
                                        $i4 = XMLParser.type - 1194553915;
                                        XMLParser.type = $i4;
                                        $r1[($i4 * 537618701) - 1] = (int) Math.pow((double) $i0, 1.0d / ((double) $i2));
                                        return 1;
                                }
                                throw StringBuilder.append($r2, "ce.an(" + ')');
                            } else if (4014 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 & $i2;
                                return 1;
                            } else if (4015 == $i0) {
                                XMLParser.type -= 1905859466;
                                $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                $r1 = XMLParser.this$0;
                                $i4 = XMLParser.type - 1194553915;
                                XMLParser.type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 | $i2;
                                return 1;
                            } else if (4018 != $i0) {
                                return 2;
                            } else {
                                XMLParser.type -= 711305551;
                                long $l6 = (long) XMLParser.this$0[XMLParser.type * 537618701];
                                long $l7 = (long) XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                long $l8 = (long) XMLParser.this$0[(XMLParser.type * 537618701) + 2];
                                $r1 = XMLParser.this$0;
                                $i0 = XMLParser.type - 1194553915;
                                XMLParser.type = $i0;
                                $r1[($i0 * 537618701) - 1] = (int) (($l6 * $l8) / $l7);
                                return 1;
                            }
                        } else if ($i0 < 4200) {
                            return JSONArray.parse($i0, charSequence, $z0, -465028232);
                        } else {
                            if ($i0 < 4300) {
                                return Short.parse($i0, charSequence, $z0, -376846818);
                            }
                            if ($i0 < 5100) {
                                return Msg.toString($i0, charSequence, $z0, 1227456561);
                            }
                            if ($i0 < 5400) {
                                if ($i0 == 5306) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.state ? (byte) 2 : (byte) 1;
                                    return 1;
                                } else if (5307 == $i0) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - -1194553915;
                                    XMLParser.type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 == 1 || 2 == $i0) {
                                        client.context.init($i0, -1340608345);
                                        return 1;
                                    }
                                } else if ($i0 == 5308) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 1775240613 * Main.this$0.value;
                                    return 1;
                                } else if ($i0 != 5309) {
                                    return 2;
                                } else {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - -1194553915;
                                    XMLParser.type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if (1 == $i0 || 2 == $i0) {
                                        $i03 = $i0 * 1983339053;
                                        $i0 = $i03;
                                        Main.this$0.value = $i03;
                                        KeyPair.toString(-958976715);
                                        return 1;
                                    }
                                }
                            } else if ($i0 < 5600) {
                                if ($i0 == 5504) {
                                    XMLParser.type -= 1905859466;
                                    $i0 = XMLParser.this$0[XMLParser.type * 537618701];
                                    $i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                    if (!client.dir) {
                                        Stream.set($i0, $i2, -2083594109);
                                        return 1;
                                    }
                                } else if ($i0 == 5505) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.tag * 1679658745;
                                    return 1;
                                } else if (5506 == $i0) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.level * -198683079;
                                    return 1;
                                } else if (5530 == $i0) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - -1194553915;
                                    XMLParser.type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 >= 0) {
                                        $i2 = $i0;
                                    }
                                    client.cursor = $i2 * -1089737365;
                                    return 1;
                                } else if ($i0 != 5531) {
                                    return 2;
                                } else {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.cursor * -176892093;
                                    return 1;
                                }
                            } else if ($i0 < 5700) {
                                if (5630 != $i0) {
                                    return 2;
                                }
                                client.text = -1012553922;
                                return 1;
                            } else if ($i0 >= 6300) {
                                return $i0 < 6600 ? Chart.parse($i0, charSequence, $z0, 1475832629) : $i0 < 6700 ? Config.parse($i0, charSequence, $z0, -1759784152) : 2;
                            } else {
                                if ($i0 == 6200) {
                                    XMLParser.type -= 1905859466;
                                    client.TAG = (short) XMLParser.this$0[XMLParser.type * 537618701];
                                    if (client.TAG <= (short) 0) {
                                        client.TAG = (short) 256;
                                    }
                                    client.instance = (short) XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                    if (client.instance <= (short) 0) {
                                        client.instance = (short) 205;
                                        return 1;
                                    }
                                } else if ($i0 == 6201) {
                                    XMLParser.type -= 1905859466;
                                    client.counter = (short) XMLParser.this$0[XMLParser.type * 537618701];
                                    if (client.counter <= (short) 0) {
                                        client.counter = (short) 256;
                                    }
                                    client.order = (short) XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                    if (client.order <= (short) 0) {
                                        client.order = (short) 320;
                                        return 1;
                                    }
                                } else if (6202 == $i0) {
                                    XMLParser.type -= -483248364;
                                    client.line = (short) XMLParser.this$0[XMLParser.type * 537618701];
                                    if (client.line <= (short) 0) {
                                        client.line = (short) 1;
                                    }
                                    client.left = (short) XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                                    if (client.left <= (short) 0) {
                                        client.left = Short.MAX_VALUE;
                                    } else {
                                        if (client.left < client.line) {
                                            client.left = client.line;
                                        }
                                    }
                                    client.last = (short) XMLParser.this$0[(XMLParser.type * 537618701) + 2];
                                    if (client.last <= (short) 0) {
                                        client.last = (short) 1;
                                    }
                                    client.max = (short) XMLParser.this$0[(XMLParser.type * 537618701) + 3];
                                    if (client.max <= (short) 0) {
                                        client.max = Short.MAX_VALUE;
                                        return 1;
                                    }
                                    if (client.max < client.last) {
                                        client.max = client.last;
                                        return 1;
                                    }
                                } else if ($i0 == 6203) {
                                    if (client.options != null) {
                                        MultiInputStream.init(0, 0, client.options.this$0 * 256177861, client.options.$assertionsDisabled * 57307023, false, -1848995880);
                                        $r1 = XMLParser.this$0;
                                        $i0 = XMLParser.type - 1194553915;
                                        XMLParser.type = $i0;
                                        $r1[($i0 * 537618701) - 1] = 2140963035 * client.mCurrent;
                                        $r1 = XMLParser.this$0;
                                        $i0 = XMLParser.type - 1194553915;
                                        XMLParser.type = $i0;
                                        $r1[($i0 * 537618701) - 1] = client.page * -1949120505;
                                        return 1;
                                    }
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    return 1;
                                } else if ($i0 == 6204) {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.counter;
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.order;
                                    return 1;
                                } else if (6205 != $i0) {
                                    return 2;
                                } else {
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.TAG;
                                    $r1 = XMLParser.this$0;
                                    $i0 = XMLParser.type - 1194553915;
                                    XMLParser.type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.instance;
                                    return 1;
                                }
                            }
                        }
                    }
                    return 1;
                }
            }
        }
    }

    int add(Coordinate coordinate, Coordinate coordinate2) {
        return (client.f407x * -1304916389 == coordinate.this$0 * -1161455169 && coordinate2.this$0 * -1161455169 == client.f407x * -1304916389) ? this.origin ? coordinate.getKey(2085686853).compare(coordinate2.getKey(2143407662), 1917482221) : coordinate2.getKey(1856358622).compare(coordinate.getKey(2110058131), 1320384654) : equals(coordinate, coordinate2, 2122215436);
    }

    public int add(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, -670091129);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2) {
        return (client.f407x * 728326442 == -1161455169 * coordinate.this$0 && coordinate2.this$0 * 1853756015 == client.f407x * -1304916389) ? this.origin ? coordinate.getKey(2008334827).compare(coordinate2.getKey(1786280479), 1903810597) : coordinate2.getKey(1745688309).compare(coordinate.getKey(1747144928), 2024781385) : equals(coordinate, coordinate2, 1136902679);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2, int i) {
        try {
            if (client.f407x * -1304916389 == coordinate.this$0 * -1161455169) {
                if (coordinate2.this$0 * -1161455169 == client.f407x * -1304916389) {
                    return this.origin ? coordinate.getKey(2081676274).compare(coordinate2.getKey(2007048518), 1961183806) : coordinate2.getKey(1774384181).compare(coordinate.getKey(1711309267), 1595925648);
                }
            }
            return equals(coordinate, coordinate2, 204280902);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ce.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((Coordinate) obj, (Coordinate) obj2, -183036185);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ce.compare(" + ')');
        }
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, -2075045638);
    }

    int init(Coordinate coordinate, Coordinate coordinate2) {
        return (client.f407x * 1427807732 == -571628182 * coordinate.this$0 && coordinate2.this$0 * -1161455169 == client.f407x * -1304916389) ? this.origin ? coordinate.getKey(2143887534).compare(coordinate2.getKey(1808305312), 1499185180) : coordinate2.getKey(1923157956).compare(coordinate.getKey(1970190864), 1742217353) : equals(coordinate, coordinate2, 1835594247);
    }

    public int parse(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, 1056838022);
    }
}
