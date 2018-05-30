package p000;

import java.util.Comparator;

/* compiled from: cv */
public final class BoundingBox extends Object {
    static final int KEYCODE_MEDIA_PAUSE = 127;
    public static final int OLD_ENVIRONMENT_VARIABLES = 36;
    static int[] length;
    static int[] offset;
    BoundingBox buffer;
    int cnt;
    int[] count;
    R$drawable data;
    int dim;
    int height;
    boolean id;
    int image;
    int index;
    Shape key;
    IntList level;
    int list;
    Calendar log;
    boolean name;
    Set[] next;
    int size;
    int start;
    int text;
    Stream this$0;
    boolean type;
    Line value;
    int width;
    int f20y;

    BoundingBox(int $i0, int i, int i2) {
        try {
            this.next = new Set[5];
            this.count = new int[5];
            this.index = 0;
            $i0 = -1480080031 * $i0;
            this.start = $i0;
            this.list = $i0 * 1345215503;
            this.cnt = 1913305513 * i;
            this.dim = 1148039003 * i2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cv.<init>(" + ')');
        }
    }

    static int parse(int $i0, CharSequence charSequence, boolean z, int i) {
        boolean $i1 = false;
        int[] $r2;
        if (3600 == $i0) {
            try {
                if (Primitive.data.type * -1211745851 == 0) {
                    $r2 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r2[($i0 * 537618701) - 1] = -2;
                    return 1;
                } else if (-1211745851 * Primitive.data.type == 1) {
                    $r2 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r2[($i0 * 537618701) - 1] = -1;
                    return 1;
                } else {
                    $r2 = XMLParser.this$0;
                    $i0 = XMLParser.type - 1194553915;
                    XMLParser.type = $i0;
                    $r2[($i0 * 537618701) - 1] = Primitive.data.this$0.get(1365914553);
                    return 1;
                }
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "cv.ai(" + ')');
            }
        } else if (3601 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (Primitive.data.contains(2135373027) && $i0 >= 0) {
                if ($i0 < Primitive.data.this$0.get(1918170236)) {
                    State $r13 = (Pair) Primitive.data.this$0.get($i0, 1796302402);
                    $r3 = XMLParser.data;
                    $i0 = XMLParser.value - 1246602361;
                    XMLParser.value = $i0;
                    $r3[($i0 * -1267697097) - 1] = $r13.get((byte) -58);
                    $r3 = XMLParser.data;
                    $i0 = XMLParser.value - 1246602361;
                    XMLParser.value = $i0;
                    $r3[($i0 * -1267697097) - 1] = $r13.encode((byte) -1);
                    return 1;
                }
            }
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if ($i0 == 3602) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (Primitive.data.contains(2136189206) && $i0 >= 0) {
                if ($i0 < Primitive.data.this$0.get(1116041167)) {
                    $r2 = XMLParser.this$0;
                    i = XMLParser.type - 1194553915;
                    XMLParser.type = i;
                    $r2[(i * 537618701) - 1] = ((Coordinate) Primitive.data.this$0.get($i0, 1918322504)).this$0 * -1161455169;
                    return 1;
                }
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if (3603 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (Primitive.data.contains(2129065042) && $i0 >= 0) {
                if ($i0 < Primitive.data.this$0.get(1191337728)) {
                    $r2 = XMLParser.this$0;
                    i = XMLParser.type - 1194553915;
                    XMLParser.type = i;
                    $r2[(i * 537618701) - 1] = ((Coordinate) Primitive.data.this$0.get($i0, 2077382435)).count * -533735695;
                    return 1;
                }
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3604) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            $r4 = $r3[$i0 * -1267697097];
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            $r18 = R$string.offset;
            $r21 = Logger.add($r18, client.this$0.key, (byte) 21);
            $r21.this$0.append(Record.toString($r4, -1414776189) + 1, (byte) 31);
            $r21.this$0.clear($i0, 1703184995);
            $r21.this$0.add($r4, (byte) 45);
            client.this$0.add((Config) $r21, (short) 255);
            return 1;
        } else if (3605 == $i0) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            Primitive.data.init($r3[$i0 * -1267697097], (byte) -48);
            return 1;
        } else if (3606 == $i0) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            Primitive.data.toString($r3[$i0 * -1267697097], -2108391507);
            return 1;
        } else if (3607 == $i0) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            Primitive.data.get($r3[$i0 * -1267697097], 1867967454);
            return 1;
        } else if (3608 == $i0) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            Primitive.data.load($r3[$i0 * -1267697097], -312090443);
            return 1;
        } else if ($i0 == 3609) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            $r4 = ArrayMap.get($r3[$i0 * -1267697097], 712982824);
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Primitive.data.toString(new JSONObject($r4, LogActivity.type), false, -889911197)) {
                i = 1;
            }
            $r2[$i0] = i;
            return 1;
        } else if ($i0 == 3611) {
            if (MyAsyncTask.this$0 != null) {
                $r3 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r3[($i0 * -1267697097) - 1] = MyAsyncTask.this$0.key;
                return 1;
            }
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (3612 == $i0) {
            if (MyAsyncTask.this$0 != null) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r2[($i0 * 537618701) - 1] = MyAsyncTask.this$0.get(1086533881);
                return 1;
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3613) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 != null) {
                if ($i0 < MyAsyncTask.this$0.get(1044739096)) {
                    $r3 = XMLParser.data;
                    i = XMLParser.value - 1246602361;
                    XMLParser.value = i;
                    $r3[(i * -1267697097) - 1] = MyAsyncTask.this$0.get($i0, 1685947825).getKey(2055278140).toString(1654378572);
                    return 1;
                }
            }
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if ($i0 == 3614) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 != null) {
                if ($i0 < MyAsyncTask.this$0.get(1255442212)) {
                    $r2 = XMLParser.this$0;
                    i = XMLParser.type - 1194553915;
                    XMLParser.type = i;
                    $r2[(i * 537618701) - 1] = ((Coordinate) MyAsyncTask.this$0.get($i0, 1281766531)).write((byte) 42);
                    return 1;
                }
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if (3615 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 != null) {
                if ($i0 < MyAsyncTask.this$0.get(1804046502)) {
                    $r2 = XMLParser.this$0;
                    i = XMLParser.type - 1194553915;
                    XMLParser.type = i;
                    $r2[(i * 537618701) - 1] = ((Coordinate) MyAsyncTask.this$0.get($i0, 2091271255)).count * -533735695;
                    return 1;
                }
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3616) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (MyAsyncTask.this$0 != null) {
                i = MyAsyncTask.this$0.state;
            }
            $r2[$i0] = i;
            return 1;
        } else if (3617 == $i0) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            Packet.toString($r3[$i0 * -1267697097], -974792443);
            return 1;
        } else if ($i0 == 3618) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (MyAsyncTask.this$0 != null) {
                i = MyAsyncTask.this$0.f273a * -1067852927;
            }
            $r2[$i0] = i;
            return 1;
        } else if (3619 == $i0) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            TIntArrayList.add($r3[$i0 * -1267697097], (byte) 109);
            return 1;
        } else if (3620 == $i0) {
            $r18 = R$string.this$0;
            $r21 = Logger.add($r18, client.this$0.key, (byte) -61);
            $r21.this$0.append(0, (byte) 31);
            client.this$0.add((Config) $r21, (short) 255);
            return 1;
        } else if (3621 == $i0) {
            if (Primitive.data.contains(2135734160)) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r2[($i0 * 537618701) - 1] = Primitive.data.data.get(1715486836);
                return 1;
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = -1;
            return 1;
        } else if (3622 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (Primitive.data.contains(2143500563) && $i0 >= 0) {
                if ($i0 < Primitive.data.data.get(1539566671)) {
                    State $r26 = (Timer) Primitive.data.data.get($i0, -55236320);
                    $r3 = XMLParser.data;
                    $i0 = XMLParser.value - 1246602361;
                    XMLParser.value = $i0;
                    $r3[($i0 * -1267697097) - 1] = $r26.get((byte) 17);
                    $r3 = XMLParser.data;
                    $i0 = XMLParser.value - 1246602361;
                    XMLParser.value = $i0;
                    $r3[($i0 * -1267697097) - 1] = $r26.encode((byte) -1);
                    return 1;
                }
            }
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if ($i0 == 3623) {
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            $r4 = ArrayMap.get($r3[$i0 * -1267697097], 768164474);
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Primitive.data.add(new JSONObject($r4, LogActivity.type), (byte) -40)) {
                i = 1;
            }
            $r2[$i0] = i;
            return 1;
        } else if ($i0 == 3624) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 != null) {
                if ($i0 < MyAsyncTask.this$0.get(1376304262)) {
                    JSONObject $r5 = MyAsyncTask.this$0.get($i0, 702435103).getKey(2125598953);
                    JSONObject $r30 = File.this$0.type;
                    if ($r5.equals($r30)) {
                        $r2 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r2[($i0 * 537618701) - 1] = 1;
                        return 1;
                    }
                }
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3625) {
            if (MyAsyncTask.this$0 != null) {
                if (MyAsyncTask.this$0.value != null) {
                    $r3 = XMLParser.data;
                    $i0 = XMLParser.value - 1246602361;
                    XMLParser.value = $i0;
                    $r3[($i0 * -1267697097) - 1] = MyAsyncTask.this$0.value;
                    return 1;
                }
            }
            $r3 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (3626 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 != null) {
                if ($i0 < MyAsyncTask.this$0.get(1188882703)) {
                    if (((Cell) MyAsyncTask.this$0.get($i0, 285693542)).add((byte) 93)) {
                        $r2 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r2[($i0 * 537618701) - 1] = 1;
                        return 1;
                    }
                }
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3627) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 != null) {
                if ($i0 < MyAsyncTask.this$0.get(2007112730)) {
                    if (((Cell) MyAsyncTask.this$0.get($i0, 474188063)).add(1802245613)) {
                        $r2 = XMLParser.this$0;
                        $i0 = XMLParser.type - 1194553915;
                        XMLParser.type = $i0;
                        $r2[($i0 * 537618701) - 1] = 1;
                        return 1;
                    }
                }
            }
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3628) {
            Primitive.data.this$0.transform(850004164);
            return 1;
        } else if ($i0 == 3629) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new FileComparator($i1), (byte) 1);
            return 1;
        } else if (3630 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Geometry($i1), (byte) 1);
            return 1;
        } else if (3631 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new AbstractLoadingActivity$3$1($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3632) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Document($i1), (byte) 1);
            return 1;
        } else if (3633 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Diff($i1), (byte) 1);
            return 1;
        } else if (3634 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new AssertionError($i1), (byte) 1);
            return 1;
        } else if (3635 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new CharacterReference($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3636) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Exception($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3637) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Byte($i1), (byte) 1);
            return 1;
        } else if (3638 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Locale($i1), (byte) 1);
            return 1;
        } else if (3639 == $i0) {
            Primitive.data.this$0.toString(1241064189);
            return 1;
        } else if ($i0 == 3640) {
            Primitive.data.data.transform(563485734);
            return 1;
        } else if (3641 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r15 = Primitive.data.data;
            $r15.toString((Comparator) new FileComparator($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3642) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r15 = Primitive.data.data;
            $r15.toString((Comparator) new Geometry($i1), (byte) 1);
            return 1;
        } else if (3643 == $i0) {
            Primitive.data.data.toString(1241064189);
            return 1;
        } else {
            if (3644 == $i0) {
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.transform(-1894145027);
                    return 1;
                }
            } else if (3645 == $i0) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new FileComparator($i1), (byte) 1);
                    return 1;
                }
            } else if (3646 == $i0) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Geometry($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3647) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new AbstractLoadingActivity$3$1($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3648) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Document($i1), (byte) 1);
                    return 1;
                }
            } else if (3649 == $i0) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Diff($i1), (byte) 1);
                    return 1;
                }
            } else if (3650 == $i0) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new AssertionError($i1), (byte) 1);
                    return 1;
                }
            } else if (3651 == $i0) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new CharacterReference($i1), (byte) 1);
                    return 1;
                }
            } else if (3652 == $i0) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Exception($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3653) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Byte($i1), (byte) 1);
                    return 1;
                }
            } else if (3654 == $i0) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Locale($i1), (byte) 1);
                    return 1;
                }
            } else if (3655 == $i0) {
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString(1241064189);
                    return 1;
                }
            } else if ($i0 == 3656) {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Vector2D($i1), (byte) 1);
                return 1;
            } else if (3657 != $i0) {
                return 2;
            } else {
                $r2 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Vector2D($i1), (byte) 1);
                    return 1;
                }
            }
            return 1;
        }
    }
}
