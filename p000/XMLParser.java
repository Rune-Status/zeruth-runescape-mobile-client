package p000;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Comparator;

/* compiled from: hr */
public class XMLParser {
    static final int DEBUG = 3;
    static final int DPAD_LEFT = 21;
    static final float MAX_MULTITOUCH_POS_JUMP_SIZE = 30.0f;
    static final int MAX_SAMPLE_READAHEAD_US = 5000000;
    static final int MIN_TIMESTAMP_SAMPLE_INTERVAL_US = 500000;
    static PathParser[] count = new PathParser[50];
    static String[] data = new String[1000];
    static int index = 0;
    static int[] name = new int[5];
    static int offset = 0;
    static int[][] size = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 5000}));
    static System state;
    static final String[] text = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static int[] this$0 = new int[1000];
    static Calendar time = Calendar.getInstance();
    static int type;
    static int value;

    XMLParser() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hr.<init>(" + ')');
        }
    }

    static int m67a(int $i0, CharSequence charSequence, boolean z) {
        int $i1;
        System $r1;
        boolean $z1 = false;
        if ($i0 >= 2000) {
            $i0 -= 1000;
            int[] $r2 = this$0;
            $i1 = type - -1194553915;
            type = $i1;
            $i1 = $r2[$i1 * 537618701];
            $r1 = ArrayList.get($i1, 1491018413);
        } else {
            $r1 = z ? Constants.data : state;
            $i1 = -1;
        }
        if (1000 == $i0) {
            type -= -483248364;
            $r1.f285b = -1299204119 * this$0[type * 537618701];
            $r1.f299w = this$0[(type * 537618701) + 1] * 922175265;
            $r1.f298s = -1859331853 * this$0[(type * 537618701) + 2];
            $r1.f301y = 1800206059 * this$0[(type * 537618701) + 3];
            client.add($r1, (byte) 119);
            client.context.set($r1, (short) -7208);
            if (-1 != $i1 && $r1.name * -128421835 == 0) {
                Model.write(Float.size[$i1 >> 16], $r1, false, (byte) 8);
                return 1;
            }
        } else if ($i0 == 1001) {
            type -= -483248364;
            $r1.f300x = 507881715 * this$0[type * 537618701];
            $r1.f288e = -14232227 * this$0[(type * 537618701) + 1];
            $r1.f295p = this$0[(type * 537618701) + 2] * -1778589005;
            $r1.f290g = this$0[(type * 537618701) + 3] * -186773411;
            client.add($r1, (byte) 114);
            client.context.set($r1, (short) -5419);
            if ($i1 != -1 && $r1.name * -128421835 == 0) {
                Model.write(Float.size[$i1 >> 16], $r1, false, (byte) -94);
                return 1;
            }
        } else if ($i0 == 1003) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            z = $r2[$i0 * 537618701] == 1;
            if ($r1.start != z) {
                $r1.start = z;
                client.add($r1, (byte) 123);
                return 1;
            }
        } else if (1005 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $z1 = true;
            }
            $r1.f294n = $z1;
            return 1;
        } else if (1006 != $i0) {
            return 2;
        } else {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $z1 = true;
            }
            $r1.f291h = $z1;
            return 1;
        }
        return 1;
    }

    static int add(int i, CharSequence charSequence, boolean $z0) {
        boolean $i1 = false;
        String[] $r1;
        if (i == 1978441066) {
            $r1 = data;
            i = value - 455129804;
            value = i;
            Message.add(0, "", $r1[i * -1267697097], 817803530);
            return 1;
        } else if (3101 == i) {
            type -= 1905859466;
            Status.write(File.this$0, this$0[887342997 * type], this$0[(type * 537618701) + 1], (byte) 53);
            return 1;
        } else if (3103 == i) {
            Database.write(-1265034995);
            return 1;
        } else if (3104 == i) {
            $r1 = data;
            i = value - -1299641765;
            value = i;
            CharSequence $r2 = $r1[i * -1267697097];
            if (Resources.add($r2, -1953603472)) {
                $i1 = Node.decode($r2, 10, true, (byte) -26);
            }
            $r9 = Logger.add(R$string.width, client.this$0.key, (byte) 64);
            $r9.this$0.append($i1, (short) 128);
            client.this$0.add((Config) $r9, (short) 255);
            return 1;
        } else if (i == 157391912) {
            $r1 = data;
            i = value - -1246602361;
            value = i;
            $r2 = $r1[i * -1267697097];
            $r9 = Logger.add(R$string.body, client.this$0.key, (byte) 21);
            $r9.this$0.append($r2.length() + 1, (byte) 31);
            $r9.this$0.add($r2, (byte) -110);
            client.this$0.add((Config) $r9, (short) 255);
            return 1;
        } else if (-389604674 == i) {
            $r1 = data;
            i = value - -1246602361;
            value = i;
            $r2 = $r1[i * -1267697097];
            $r9 = Logger.add(R$string.head, client.this$0.key, (byte) 11);
            $r9.this$0.append($r2.length() + 1, (byte) 31);
            $r9.this$0.add($r2, (byte) -46);
            client.this$0.add((Config) $r9, (short) 255);
            return 1;
        } else if (3107 == i) {
            $r3 = this$0;
            i = type - 262375461;
            type = i;
            i = $r3[i * 537618701];
            $r1 = data;
            $i1 = value - -1246602361;
            value = $i1;
            Scalar.add(i, $r1[$i1 * -1267697097], (byte) 126);
            return 1;
        } else if (-284390598 == i) {
            type -= 711305551;
            ParserHelper.set(ArrayList.get(this$0[(type * 537618701) + 2], 1333363834), this$0[877821444 * type], this$0[(type * 1425635068) + 1], -1936702677);
            return 1;
        } else if (i == 1098715310) {
            type -= 1905859466;
            ParserHelper.set($z0 ? Constants.data : state, this$0[-1880238379 * type], this$0[(type * 537618701) + 1], -607333217);
            return 1;
        } else if (i == -1614888946) {
            $r3 = this$0;
            i = type - -1194553915;
            type = i;
            if ($r3[i * 537618701] == 1) {
                $i1 = true;
            }
            ByteBufferList.f25a = $i1;
            return 1;
        } else if (3111 == i) {
            $r3 = this$0;
            i = type - 1194553915;
            type = i;
            i = (i * 537618701) - 1;
            if (Main.this$0.f276i) {
                $i1 = 1;
            }
            $r3[i] = $i1;
            return 1;
        } else if (i == 3112) {
            SearchActivity $r13 = Main.this$0;
            $r3 = this$0;
            i = type - -16802562;
            type = i;
            if ($r3[i * -1704434607] == 1) {
                $i1 = true;
            }
            $r13.f276i = $i1;
            KeyPair.toString(-773961319);
            return 1;
        } else if (i == 3113) {
            $r1 = data;
            i = value - 396723836;
            value = i;
            $r2 = $r1[i * -1267697097];
            $r3 = this$0;
            i = type - -1194553915;
            type = i;
            IntegerPolynomial.update($r2, $r3[i * 537618701] == 1, false, (byte) 14);
            return 1;
        } else if (-1273923796 == i) {
            $r3 = this$0;
            i = type - 426730601;
            type = i;
            i = $r3[i * -1364912829];
            $r9 = Logger.add(R$string.reader, client.this$0.key, (byte) 3);
            $r9.this$0.get(i, -1752508204);
            client.this$0.add((Config) $r9, (short) 255);
            return 1;
        } else {
            if (1632997921 == i) {
                $r3 = this$0;
                i = type - -1363493497;
                type = i;
                i = $r3[i * 537618701];
                value -= -882377786;
                $r2 = data[-388661531 * value];
                String $r11 = data[(value * -1267697097) + 1];
                if ($r2.length() <= 500 && $r11.length() <= 1410036255) {
                    $r9 = Logger.add(R$string.cache, client.this$0.key, (byte) 54);
                    $r9.this$0.get((Record.toString($r2, -730449741) + 1) + Record.toString($r11, -445549660), -1752508204);
                    $r9.this$0.add($r11, (byte) -74);
                    $r9.this$0.append(i, (byte) 31);
                    $r9.this$0.add($r2, (byte) -99);
                    client.this$0.add((Config) $r9, (short) 255);
                    return 1;
                }
            } else if (i == 3117) {
                $r5 = Settings.this$0;
                $r3 = this$0;
                i = type - -1478738320;
                type = i;
                if ($r3[i * 662926746] == 1) {
                    $i1 = true;
                }
                $r5.clear($i1, -1284347001);
                return 1;
            } else if (3118 == i) {
                $r5 = Settings.this$0;
                $r3 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r3[i * -1895168705] == 1) {
                    $i1 = true;
                }
                $r5.length = $i1;
                return 1;
            } else if (i == 3119) {
                $r3 = this$0;
                i = type - -80608205;
                type = i;
                if ($r3[i * 1826156992] == 1) {
                    $i1 = true;
                }
                client.date = $i1;
                return 1;
            } else if (i == 3120) {
                $r3 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r3[i * -934602224] == 1) {
                    client.message = 213563641 * ((client.message * 1424263497) | 1);
                    return 1;
                }
                client.message = 213563641 * ((1424263497 * client.message) & -2);
                return 1;
            } else if (i == 3121) {
                $r3 = this$0;
                i = type - -1498690551;
                type = i;
                if ($r3[i * 340902191] == 1) {
                    client.message = 213563641 * ((client.message * 1424263497) | 2);
                    return 1;
                }
                client.message = ((-1451137936 * client.message) & -3) * 213563641;
                return 1;
            } else if (i == 3122) {
                $r3 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r3[i * -272849554] == 1) {
                    client.message = 1705213515 * ((client.message * 527966598) | 4);
                    return 1;
                }
                client.message = ((client.message * 307884747) & -5) * -806874138;
                return 1;
            } else if (i == 3123) {
                $r3 = this$0;
                i = type - -2089120149;
                type = i;
                if ($r3[i * -546727388] == 1) {
                    client.message = 1429956437 * ((-144579153 * client.message) | 8);
                    return 1;
                }
                client.message = ((client.message * -1343082360) & -9) * 213563641;
                return 1;
            } else if (857052209 == i) {
                client.message = 0;
                return 1;
            } else if (i == -1389828627) {
                $r3 = this$0;
                i = type - 712062225;
                type = i;
                if ($r3[i * 537618701] == 1) {
                    $i1 = true;
                }
                client.password = $i1;
                return 1;
            } else if (1214727079 == i) {
                $r3 = this$0;
                i = type - 1159992019;
                type = i;
                if ($r3[i * 1586491414] == 1) {
                    $i1 = true;
                }
                client.factory = $i1;
                return 1;
            } else if (392326526 == i) {
                $r5 = Settings.this$0;
                $r3 = this$0;
                i = type - -395605969;
                type = i;
                if ($r3[i * 1925164329] == 1) {
                    $i1 = true;
                }
                $r5.initialize($i1, (byte) 6);
                return 1;
            } else if (3128 == i) {
                $r3 = this$0;
                i = type + 668938702;
                type = i;
                i = (i * -291137458) - 1;
                if (Settings.this$0.put(1693428806)) {
                    $i1 = 1;
                }
                $r3[i] = $i1;
                return 1;
            } else if (3129 == i) {
                type -= 1905859466;
                client.engine = -1557400196 * this$0[type * 537618701];
                client.configuration = this$0[(type * -1109250475) + 1] * 1258156105;
                return 1;
            } else if (3130 == i) {
                type -= 1943124127;
                i = this$0[type * -1468302260];
                if (1 == this$0[(-610044264 * type) + 1]) {
                    $i1 = true;
                }
                Settings.this$0.create(i, $i1, 1829547545);
                return 1;
            } else if (i == 3131) {
                $r3 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r3[i * 2061739620] == 1) {
                    $i1 = true;
                }
                Settings.this$0.put($i1, -107858092);
            } else if (-1062750140 != i) {
                return 2;
            } else {
                $r3 = this$0;
                i = type - 1062294958;
                type = i;
                $r3[(i * 587841043) - 1] = Vec2.this$0 * -1946576867;
                $r3 = this$0;
                i = type - 1962439799;
                type = i;
                $r3[(i * 973947456) - 1] = Model.this$0 * 1308893036;
                return 1;
            }
            return 1;
        }
    }

    public static void add(Class classR, int i) {
        Score.id = classR;
    }

    static int apply(int $i0, CharSequence charSequence, boolean z) {
        boolean $i1 = false;
        int[] $r2;
        if (3600 == $i0) {
            if (Primitive.data.type * -1211745851 == 0) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = -2;
                return 1;
            } else if (-1211745851 * Primitive.data.type == 1) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = -1;
                return 1;
            } else {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = Primitive.data.this$0.get(1771532498);
                return 1;
            }
        } else if (3601 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (!Primitive.data.contains(2143301677) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(1112741123)) {
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            State $r11 = (Pair) Primitive.data.this$0.get($i0, -95154298);
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = $r11.get((byte) 30);
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = $r11.encode((byte) -1);
            return 1;
        } else if ($i0 == 3602) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (!Primitive.data.contains(2138655732) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(1183336497)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * 537618701) - 1] = ((Coordinate) Primitive.data.this$0.get($i0, 1532362376)).this$0 * -1161455169;
            return 1;
        } else if (3603 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (!Primitive.data.contains(2145465257) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(2012438880)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * 537618701) - 1] = ((Coordinate) Primitive.data.this$0.get($i0, -97961238)).count * -533735695;
            return 1;
        } else if ($i0 == 3604) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r10 = $r9[$i0 * -1267697097];
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            $r15 = Logger.add(R$string.offset, client.this$0.key, (byte) 14);
            $r15.this$0.append(Record.toString($r10, -859200405) + 1, (byte) 31);
            $r15.this$0.clear($i0, 1703184995);
            $r15.this$0.add($r10, (byte) 95);
            client.this$0.add((Config) $r15, (short) 255);
            return 1;
        } else if (3605 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Primitive.data.init($r9[$i0 * -1267697097], (byte) -36);
            return 1;
        } else if (3606 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Primitive.data.toString($r9[$i0 * -1267697097], -1669905710);
            return 1;
        } else if (3607 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Primitive.data.get($r9[$i0 * -1267697097], 2072552404);
            return 1;
        } else if (3608 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Primitive.data.load($r9[$i0 * -1267697097], 889641322);
            return 1;
        } else if ($i0 == 3609) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r10 = ArrayMap.get($r9[$i0 * -1267697097], -648450493);
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = Primitive.data.toString(new JSONObject($r10, LogActivity.type), false, -889911197) ? 1 : 0;
            return 1;
        } else if ($i0 == 3611) {
            if (MyAsyncTask.this$0 != null) {
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = MyAsyncTask.this$0.key;
                return 1;
            }
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (3612 == $i0) {
            if (MyAsyncTask.this$0 != null) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = MyAsyncTask.this$0.get(2128774370);
                return 1;
            }
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3613) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1903146148)) {
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r9 = data;
            $i1 = value - 1246602361;
            value = $i1;
            $r9[($i1 * -1267697097) - 1] = MyAsyncTask.this$0.get($i0, 13921556).getKey(2041882847).toString(-1449189930);
            return 1;
        } else if ($i0 == 3614) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1593178002)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * 537618701) - 1] = ((Coordinate) MyAsyncTask.this$0.get($i0, -113803846)).write((byte) -18);
            return 1;
        } else if (3615 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1742011064)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * 537618701) - 1] = ((Coordinate) MyAsyncTask.this$0.get($i0, 1240459375)).count * -533735695;
            return 1;
        } else if ($i0 == 3616) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (MyAsyncTask.this$0 != null) {
                $i1 = MyAsyncTask.this$0.state;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if (3617 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Packet.toString($r9[$i0 * -1267697097], -1492032523);
            return 1;
        } else if ($i0 == 3618) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (MyAsyncTask.this$0 != null) {
                $i1 = MyAsyncTask.this$0.f273a * -1067852927;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if (3619 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            TIntArrayList.add($r9[$i0 * -1267697097], (byte) 94);
            return 1;
        } else if (3620 == $i0) {
            $r15 = Logger.add(R$string.this$0, client.this$0.key, (byte) -43);
            $r15.this$0.append(0, (byte) 31);
            client.this$0.add((Config) $r15, (short) 255);
            return 1;
        } else if (3621 == $i0) {
            if (Primitive.data.contains(2126486924)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = Primitive.data.data.get(1092247204);
                return 1;
            }
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = -1;
            return 1;
        } else if (3622 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (!Primitive.data.contains(2134301386) || $i0 < 0 || $i0 >= Primitive.data.data.get(2090318063)) {
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            Timer $r8 = (Timer) Primitive.data.data.get($i0, 1466035655);
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = $r8.get((byte) -49);
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = $r8.encode((byte) -1);
            return 1;
        } else if ($i0 == 3623) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r10 = ArrayMap.get($r9[$i0 * -1267697097], 1649639898);
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Primitive.data.add(new JSONObject($r10, LogActivity.type), (byte) -19)) {
                $i1 = 1;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if ($i0 == 3624) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 != null && $i0 < MyAsyncTask.this$0.get(1144620670)) {
                if (MyAsyncTask.this$0.get($i0, 1393724332).getKey(1850918761).equals(File.this$0.type)) {
                    $r2 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r2[($i0 * 537618701) - 1] = 1;
                    return 1;
                }
            }
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3625) {
            if (MyAsyncTask.this$0 == null || MyAsyncTask.this$0.value == null) {
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = MyAsyncTask.this$0.value;
            return 1;
        } else if (3626 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1878325971) || !((Cell) MyAsyncTask.this$0.get($i0, 268308407)).add((byte) 12)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = 1;
            return 1;
        } else if ($i0 == 3627) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1873821705) || !((Cell) MyAsyncTask.this$0.get($i0, 945916339)).add(1598162017)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = 1;
            return 1;
        } else if ($i0 == 3628) {
            Primitive.data.this$0.transform(1073712267);
            return 1;
        } else if ($i0 == 3629) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString(new FileComparator($i1), (byte) 1);
            return 1;
        } else if (3630 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Geometry($i1), (byte) 1);
            return 1;
        } else if (3631 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new AbstractLoadingActivity$3$1($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3632) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Document($i1), (byte) 1);
            return 1;
        } else if (3633 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Diff($i1), (byte) 1);
            return 1;
        } else if (3634 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new AssertionError($i1), (byte) 1);
            return 1;
        } else if (3635 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new CharacterReference($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3636) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Exception($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3637) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Byte($i1), (byte) 1);
            return 1;
        } else if (3638 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Locale($i1), (byte) 1);
            return 1;
        } else if (3639 == $i0) {
            Primitive.data.this$0.toString(1241064189);
            return 1;
        } else if ($i0 == 3640) {
            Primitive.data.data.transform(-2125760298);
            return 1;
        } else if (3641 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.data.toString(new FileComparator($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3642) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.data.toString((Comparator) new Geometry($i1), (byte) 1);
            return 1;
        } else if (3643 == $i0) {
            Primitive.data.data.toString(1241064189);
            return 1;
        } else {
            if (3644 == $i0) {
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.transform(-1690532858);
                    return 1;
                }
            } else if (3645 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString(new FileComparator($i1), (byte) 1);
                    return 1;
                }
            } else if (3646 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Geometry($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3647) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new AbstractLoadingActivity$3$1($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3648) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Document($i1), (byte) 1);
                    return 1;
                }
            } else if (3649 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Diff($i1), (byte) 1);
                    return 1;
                }
            } else if (3650 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new AssertionError($i1), (byte) 1);
                    return 1;
                }
            } else if (3651 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new CharacterReference($i1), (byte) 1);
                    return 1;
                }
            } else if (3652 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Exception($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3653) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Byte($i1), (byte) 1);
                    return 1;
                }
            } else if (3654 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
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
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Vector2D($i1), (byte) 1);
                return 1;
            } else if (3657 != $i0) {
                return 2;
            } else {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
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

    static int call(int $i0, CharSequence charSequence, boolean z) {
        System $r1 = z ? Constants.data : state;
        int[] $r2;
        if ($i0 == 1600) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.f292i * -2091547827;
            return 1;
        } else if (1601 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.size * 654937537;
            return 1;
        } else if ($i0 == 1602) {
            String[] $r4 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r4[($i0 * -1267697097) - 1] = $r1.file;
            return 1;
        } else if ($i0 == 1603) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.cursor * 1151268625;
            return 1;
        } else if ($i0 == 1604) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.buf * -1243953689;
            return 1;
        } else if (1605 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.state * 2105704033;
            return 1;
        } else if ($i0 == 1606) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.data * -1375479599;
            return 1;
        } else if ($i0 == 1607) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.instance * -1211464689;
            return 1;
        } else if ($i0 == 1608) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.count * -2032348791;
            return 1;
        } else if ($i0 == 1609) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.result * -479221341;
            return 1;
        } else if (1610 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.source * -1726277411;
            return 1;
        } else if (1611 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.index * 334261811;
            return 1;
        } else if ($i0 == 1612) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.current * 1703184995;
            return 1;
        } else if ($i0 == 1613) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.err.get(1298992303);
            return 1;
        } else if (1614 != $i0) {
            return 2;
        } else {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.error ? (byte) 1 : (byte) 0;
            return 1;
        }
    }

    static int clear(int i, CharSequence charSequence, boolean z) {
        int $i1;
        System $r2;
        boolean $z1 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] $r1 = this$0;
            $i1 = type - -1194553915;
            type = $i1;
            $i1 = $r1[$i1 * 537618701];
            $r2 = ArrayList.get($i1, 822386259);
        } else {
            $r2 = z ? Constants.data : state;
            $i1 = -1;
        }
        int $i0;
        if (2015619668 == i) {
            type -= 1905859466;
            $r2.f292i = 1680009701 * this$0[type * -416559410];
            if (-2091547827 * $r2.f292i > (1151268625 * $r2.cursor) - ($r2.this$0 * 256177861)) {
                $i0 = ($r2.cursor * 1542076378) - ($r2.this$0 * 1954189653);
                i = $i0;
                $r2.f292i = $i0;
            }
            if (-2091547827 * $r2.f292i < 0) {
                $r2.f292i = 0;
            }
            $i0 = this$0[(type * 537618701) + 1] * 693206580;
            i = $i0;
            $r2.size = $i0;
            if (654937537 * $r2.size > ($r2.buf * 1444206320) - (57307023 * $r2.$assertionsDisabled)) {
                $i0 = (-158560857 * $r2.buf) - ($r2.$assertionsDisabled * -1002049201);
                i = $i0;
                $r2.size = $i0;
            }
            if (-1957315919 * $r2.size < 0) {
                $r2.size = 0;
            }
            client.add($r2, (byte) 66);
            return 1;
        } else if (i == 1101) {
            $r1 = this$0;
            i = type - -1194553915;
            type = i;
            $i0 = $r1[i * 537618701] * -1456194309;
            i = $i0;
            $r2.index = $i0;
            client.add($r2, (byte) 114);
            return 1;
        } else if (138635333 == i) {
            $r1 = this$0;
            i = type - -576579372;
            type = i;
            $r2.level = $r1[i * 598486078] == 1;
            client.add($r2, (byte) 22);
            return 1;
        } else if (i == 1103) {
            $r1 = this$0;
            i = type - 154149316;
            type = i;
            $i0 = $r1[i * 537618701] * -1014705653;
            i = $i0;
            $r2.result = $i0;
            client.add($r2, (byte) 21);
            return 1;
        } else if (1104 == i) {
            $r1 = this$0;
            i = type - -1155287769;
            type = i;
            $i0 = $r1[i * 537618701] * 1820900823;
            i = $i0;
            $r2.files = $i0;
            client.add($r2, (byte) 73);
            return 1;
        } else if (i == 1105) {
            $r1 = this$0;
            i = type - 1032255774;
            type = i;
            $i0 = $r1[i * 888110926] * -1880972889;
            i = $i0;
            $r2.path = $i0;
            client.add($r2, (byte) 83);
            return 1;
        } else if (i == 1106) {
            $r1 = this$0;
            i = type - -1194553915;
            type = i;
            $i0 = $r1[i * -2113627961] * -1598920003;
            i = $i0;
            $r2.code = $i0;
            client.add($r2, (byte) 17);
            return 1;
        } else if (180571607 == i) {
            $r1 = this$0;
            i = type - -1194553915;
            type = i;
            if ($r1[i * 537618701] == 1) {
                $z1 = true;
            }
            $r2.first = $z1;
            client.add($r2, (byte) 62);
            return 1;
        } else if (i == 1108) {
            $r2.status = -713743521;
            $r1 = this$0;
            i = type - -1194553915;
            type = i;
            $i0 = $r1[i * -1908760076] * -174447253;
            i = $i0;
            $r2.text = $i0;
            client.add($r2, (byte) 115);
            return 1;
        } else if (1109 == i) {
            type -= 1422611102;
            $i0 = this$0[type * 1164754645] * 1819609725;
            i = $i0;
            $r2.startTime = $i0;
            $r2.progress = 432797755 * this$0[(type * 537618701) + 1];
            $r2.data = 770408497 * this$0[(type * 537618701) + 2];
            $r2.count = -41487175 * this$0[(type * 537618701) + 3];
            $r2.instance = 842525423 * this$0[(type * 693098276) + 4];
            $i0 = this$0[(type * 537618701) + 5] * -1280824925;
            i = $i0;
            $r2.state = $i0;
            client.add($r2, (byte) 108);
            return 1;
        } else {
            if (618992983 == i) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                i = $r1[i * 537618701];
                if ($r2.parent * -1332946961 != i) {
                    $i0 = i * 2102736655;
                    i = $i0;
                    $r2.parent = $i0;
                    $r2.buffer = 0;
                    $r2.cnt = 0;
                    client.add($r2, (byte) 60);
                    return 1;
                }
            } else if (1111 == i) {
                $r1 = this$0;
                i = type - -2081276635;
                type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.duration = $z1;
                client.add($r2, (byte) 56);
                return 1;
            } else if (i == -2141473916) {
                String[] $r6 = data;
                i = value - 1748587584;
                value = i;
                String $r7 = $r6[i * -1267697097];
                if (!$r7.equals($r2.file)) {
                    $r2.file = $r7;
                    client.add($r2, (byte) 5);
                    return 1;
                }
            } else if (i == 1113) {
                $r1 = this$0;
                i = type - -259775457;
                type = i;
                $i0 = $r1[i * -1851914716] * -343733379;
                i = $i0;
                $r2.uri = $i0;
                client.add($r2, (byte) 41);
                return 1;
            } else if (1114 == i) {
                type -= 711305551;
                $r2.f286c = -133984684 * this$0[1316073309 * type];
                $r2.f287d = 226611983 * this$0[(type * 537618701) + 1];
                $i0 = this$0[(type * 537618701) + 2] * 1969493363;
                i = $i0;
                $r2.f289f = $i0;
                client.add($r2, (byte) 62);
                return 1;
            } else if (1115 == i) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.header = $z1;
                client.add($r2, (byte) 2);
                return 1;
            } else if (i == -774612011) {
                $r1 = this$0;
                i = type - 510404183;
                type = i;
                $i0 = $r1[i * 1656324411] * 1083250592;
                i = $i0;
                $r2.mData = $i0;
                client.add($r2, (byte) 33);
                return 1;
            } else if (i == 484125049) {
                $r1 = this$0;
                i = type - -2092249532;
                type = i;
                $i0 = $r1[i * 537316781] * 728184399;
                i = $i0;
                $r2.list = $i0;
                client.add($r2, (byte) 72);
                return 1;
            } else if (i == 246026090) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r1[i * -1415332016] == 1) {
                    $z1 = true;
                }
                $r2.resource = $z1;
                client.add($r2, (byte) 90);
                return 1;
            } else if (i == 1119) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.user = $z1;
                client.add($r2, (byte) 72);
                return 1;
            } else if (-808064038 == i) {
                type -= -503459622;
                $r2.cursor = 808245745 * this$0[type * 1238466632];
                $i0 = this$0[(type * 537618701) + 1] * -1702725469;
                i = $i0;
                $r2.buf = $i0;
                client.add($r2, (byte) 82);
                if ($i1 != -1 && $r2.name * -128421835 == 0) {
                    Model.write(Float.size[$i1 >> 16], $r2, false, (byte) 0);
                    return 1;
                }
            } else if (i == 541428711) {
                R$id.init(1172750087 * $r2.value, 2102445939 * $r2.next, (byte) 0);
                client.buffer = $r2;
                client.add($r2, (byte) 93);
                return 1;
            } else if (i == -367634348) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                $i0 = $r1[i * 1973304394] * 245383255;
                i = $i0;
                $r2.hash = $i0;
                client.add($r2, (byte) 106);
                return 1;
            } else if (-1786366836 == i) {
                $r1 = this$0;
                i = type - 1398909151;
                type = i;
                $i0 = $r1[i * -972404216] * 1733757175;
                i = $i0;
                $r2.current = $i0;
                client.add($r2, (byte) 99);
                return 1;
            } else if (1124 == i) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                $i0 = $r1[i * 537618701] * -236421259;
                i = $i0;
                $r2.source = $i0;
                client.add($r2, (byte) 55);
            } else if (i == 1125) {
                $r1 = this$0;
                i = type - -375688224;
                type = i;
                Reader $r4 = (Reader) Calendar.add(new Reader[]{Reader.in, Reader.log, Reader.lock, Reader.queue, Reader.mHandler}, $r1[i * -332645114], (byte) 50);
                if ($r4 != null) {
                    $r2.err = $r4;
                    client.add($r2, (byte) 2);
                    return 1;
                }
            } else if (-1901319037 == i) {
                $r1 = this$0;
                i = type - -939317217;
                type = i;
                if ($r1[i * -621946418] == 1) {
                    $z1 = true;
                }
                $r2.date = $z1;
                return 1;
            } else if (i != 1847673063) {
                return 2;
            } else {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.error = $z1;
                return 1;
            }
            return 1;
        }
    }

    static int close(int $i0, CharSequence charSequence, boolean z) {
        System $r1 = z ? Constants.data : state;
        int[] $r2;
        if ($i0 == 1600) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.f292i * -2091547827;
            return 1;
        } else if (1601 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.size * 654937537;
            return 1;
        } else if ($i0 == 1602) {
            String[] $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = $r1.file;
            return 1;
        } else if ($i0 == 1603) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.cursor * 1151268625;
            return 1;
        } else if ($i0 == 1604) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.buf * -1243953689;
            return 1;
        } else if (1605 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.state * 2105704033;
            return 1;
        } else if ($i0 == 1606) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.data * -1375479599;
            return 1;
        } else if ($i0 == 1607) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.instance * -1211464689;
            return 1;
        } else if ($i0 == 1608) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.count * -2032348791;
            return 1;
        } else if ($i0 == 1609) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.result * -479221341;
            return 1;
        } else if (1610 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.source * -1726277411;
            return 1;
        } else if (1611 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.index * 334261811;
            return 1;
        } else if ($i0 == 1612) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.current * 1703184995;
            return 1;
        } else if ($i0 == 1613) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.err.get(1485073402);
            return 1;
        } else if (1614 != $i0) {
            return 2;
        } else {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.error ? (byte) 1 : (byte) 0;
            return 1;
        }
    }

    static int copy(int $i0, CharSequence charSequence, boolean z) {
        System $r1 = z ? Constants.data : state;
        int[] $r2;
        if ($i0 == 1600) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.f292i * 315480984;
            return 1;
        } else if (1601 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * -249469663) - 1] = $r1.size * 654937537;
            return 1;
        } else if ($i0 == -471237678) {
            String[] $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = $r1.file;
            return 1;
        } else if ($i0 == 1603) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.cursor * 1151268625;
            return 1;
        } else if ($i0 == 1604) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 2062869999) - 1] = $r1.buf * 2103050581;
            return 1;
        } else if (-962023118 == $i0) {
            $r2 = this$0;
            $i0 = type - 2138175681;
            type = $i0;
            $r2[($i0 * -230261656) - 1] = $r1.state * 2105704033;
            return 1;
        } else if ($i0 == -1439523706) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.data * -1375479599;
            return 1;
        } else if ($i0 == 1607) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.instance * -1082025575;
            return 1;
        } else if ($i0 == -882466631) {
            $r2 = this$0;
            $i0 = type - 1713768704;
            type = $i0;
            $r2[($i0 * -1393478071) - 1] = $r1.count * -2032348791;
            return 1;
        } else if ($i0 == -2146156522) {
            $r2 = this$0;
            $i0 = type + 1416121560;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.result * -479221341;
            return 1;
        } else if (-1337524449 == $i0) {
            $r2 = this$0;
            $i0 = type - 6625027;
            type = $i0;
            $r2[($i0 * -1410750256) - 1] = $r1.source * -1726277411;
            return 1;
        } else if (1611 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 1118412946) - 1] = $r1.index * 2036412910;
            return 1;
        } else if ($i0 == 593109393) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * -410082362) - 1] = $r1.current * 1703184995;
            return 1;
        } else if ($i0 == 1613) {
            $r2 = this$0;
            $i0 = type + 1150843618;
            type = $i0;
            $r2[($i0 * -1676027327) - 1] = $r1.err.get(1106498801);
            return 1;
        } else if (276734658 != $i0) {
            return 2;
        } else {
            $r2 = this$0;
            $i0 = type - 676288580;
            type = $i0;
            $r2[($i0 * 270773695) - 1] = $r1.error ? (byte) 1 : (byte) 0;
            return 1;
        }
    }

    static int decode(int $i0, CharSequence charSequence, boolean z) {
        if (-287012744 == $i0) {
            type -= 1020032301;
            IOUtils.add(this$0[1221032437 * type], this$0[(type * 537618701) + 1], this$0[(type * -1996978601) + 2], -1562186178);
            return 1;
        } else if (-207986655 == $i0) {
            int[] $r1 = this$0;
            $i0 = type - 935706424;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            if (-1 == $i0 && !client.index) {
                Target.add((byte) 73);
            } else if (!($i0 == -1 || 2115268781 * client.table == $i0 || client.user * -1819605895 == 0 || client.index)) {
                HttpRequest $r2 = client.header;
                $i1 = client.user * -1819605895;
                MultiInputStream.index = -734138154;
                ParserHelper.index = $r2;
                DirCache.value = -1919717083 * $i0;
                MultiInputStream.value = 0;
                FieldInfo.index = 1634727746 * $i1;
                Time.index = false;
                AssertionError.name = -1566667469;
            }
            client.table = $i0 * -541914011;
            return 1;
        } else if ($i0 != 3202) {
            return 2;
        } else {
            type -= -1620888673;
            $i0 = this$0[type * -1105031955];
            $i1 = this$0[(type * 2016582817) + 1];
            if (!(client.user * -1819605895 == 0 || $i0 == -1)) {
                Hashtable.read(Vec2.data, $i0, 0, client.user * -1819605895, false, -1213370980);
                client.index = true;
            }
            return 1;
        }
    }

    static int doInBackground(int $i0, CharSequence charSequence, boolean $z0) {
        boolean $i1 = false;
        String[] $r1;
        if ($i0 == 3100) {
            $r1 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Message.add(0, "", $r1[$i0 * -1267697097], 1374273098);
            return 1;
        } else if (3101 == $i0) {
            type -= 1905859466;
            Status.write(File.this$0, this$0[type * 537618701], this$0[(type * 537618701) + 1], (byte) -35);
            return 1;
        } else if (3103 == $i0) {
            Database.write(-1265034995);
            return 1;
        } else if (3104 == $i0) {
            $r1 = data;
            $i0 = value - -1246602361;
            value = $i0;
            CharSequence $r2 = $r1[$i0 * -1267697097];
            if (Resources.add($r2, 1297087347)) {
                $i1 = Node.decode($r2, 10, true, (byte) -20);
            }
            $r10 = Logger.add(R$string.width, client.this$0.key, (byte) -100);
            $r10.this$0.append($i1, (short) 128);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if ($i0 == 3105) {
            $r1 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r2 = $r1[$i0 * -1267697097];
            $r10 = Logger.add(R$string.body, client.this$0.key, (byte) -98);
            $r10.this$0.append($r2.length() + 1, (byte) 31);
            $r10.this$0.add($r2, (byte) 72);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if (3106 == $i0) {
            $r1 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r2 = $r1[$i0 * -1267697097];
            $r10 = Logger.add(R$string.head, client.this$0.key, (byte) -17);
            $r10.this$0.append($r2.length() + 1, (byte) 31);
            $r10.this$0.add($r2, (byte) -102);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if (3107 == $i0) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r4[$i0 * 537618701];
            $r1 = data;
            $i1 = value - -1246602361;
            value = $i1;
            Scalar.add($i0, $r1[$i1 * -1267697097], (byte) 38);
            return 1;
        } else if (3108 == $i0) {
            type -= 711305551;
            ParserHelper.set(ArrayList.get(this$0[(type * 537618701) + 2], 966436867), this$0[type * 537618701], this$0[(type * 537618701) + 1], -1411741105);
            return 1;
        } else if ($i0 == 3109) {
            type -= 1905859466;
            ParserHelper.set($z0 ? Constants.data : state, this$0[type * 537618701], this$0[(type * 537618701) + 1], -1587995660);
            return 1;
        } else if ($i0 == 3110) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            ByteBufferList.f25a = $i1;
            return 1;
        } else if (3111 == $i0) {
            $r4 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Main.this$0.f276i) {
                $i1 = 1;
            }
            $r4[$i0] = $i1;
            return 1;
        } else if ($i0 == 3112) {
            SearchActivity $r5 = Main.this$0;
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r5.f276i = $i1;
            KeyPair.toString(-1817899549);
            return 1;
        } else if ($i0 == 3113) {
            $r1 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r2 = $r1[$i0 * -1267697097];
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            IntegerPolynomial.update($r2, $r4[$i0 * 537618701] == 1, false, (byte) 14);
            return 1;
        } else if (3115 == $i0) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r4[$i0 * 537618701];
            $r10 = Logger.add(R$string.reader, client.this$0.key, (byte) -70);
            $r10.this$0.get($i0, -1752508204);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if (3116 == $i0) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r4[$i0 * 537618701];
            value -= 1801762574;
            $r2 = data[value * -1267697097];
            String $r12 = data[(value * -1267697097) + 1];
            if ($r2.length() > 500 || $r12.length() > 500) {
                return 1;
            }
            $r10 = Logger.add(R$string.cache, client.this$0.key, (byte) -65);
            $r10.this$0.get((Record.toString($r2, -1590626361) + 1) + Record.toString($r12, -2120273923), -1752508204);
            $r10.this$0.add($r12, (byte) -41);
            $r10.this$0.append($i0, (byte) 31);
            $r10.this$0.add($r2, (byte) -14);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if ($i0 == 3117) {
            $r6 = Settings.this$0;
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r6.clear($i1, -2107451610);
            return 1;
        } else if (3118 == $i0) {
            $r6 = Settings.this$0;
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r6.length = $i1;
            return 1;
        } else if ($i0 == 3119) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            client.date = $i1;
            return 1;
        } else if ($i0 == 3120) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                client.message = 213563641 * ((client.message * 1424263497) | 1);
                return 1;
            }
            client.message = 213563641 * ((1424263497 * client.message) & -2);
            return 1;
        } else if ($i0 == 3121) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                client.message = 213563641 * ((client.message * 1424263497) | 2);
                return 1;
            }
            client.message = ((1424263497 * client.message) & -3) * 213563641;
            return 1;
        } else if ($i0 == 3122) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                client.message = 213563641 * ((client.message * 1424263497) | 4);
                return 1;
            }
            client.message = ((client.message * 1424263497) & -5) * 213563641;
            return 1;
        } else if ($i0 == 3123) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                client.message = 213563641 * ((1424263497 * client.message) | 8);
                return 1;
            }
            client.message = ((client.message * 1424263497) & -9) * 213563641;
            return 1;
        } else if (3124 == $i0) {
            client.message = 0;
            return 1;
        } else if ($i0 == 3125) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            client.password = $i1;
            return 1;
        } else if (3126 == $i0) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            client.factory = $i1;
            return 1;
        } else if (3127 == $i0) {
            $r6 = Settings.this$0;
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r6.initialize($i1, (byte) 6);
            return 1;
        } else if (3128 == $i0) {
            $r4 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Settings.this$0.put(1693428806)) {
                $i1 = 1;
            }
            $r4[$i0] = $i1;
            return 1;
        } else if (3129 == $i0) {
            type -= 1905859466;
            client.engine = -704603963 * this$0[type * 537618701];
            client.configuration = this$0[(type * 537618701) + 1] * -1890400699;
            return 1;
        } else if (3130 == $i0) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            if (1 == this$0[(type * 537618701) + 1]) {
                $i1 = true;
            }
            Settings.this$0.create($i0, $i1, 1829547545);
            return 1;
        } else if ($i0 == 3131) {
            $r4 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r4[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Settings.this$0.put($i1, -107858092);
            return 1;
        } else if (3132 != $i0) {
            return 2;
        } else {
            $r4 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r4[($i0 * 537618701) - 1] = Vec2.this$0 * -1946576867;
            $r4 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r4[($i0 * 537618701) - 1] = Model.this$0 * 1616559063;
            return 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int encode(int r37, p000.CharSequence r38, boolean r39) {
        /*
        r4 = 4100; // 0x1004 float:5.745E-42 double:2.0257E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x00c7;
    L_0x0006:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r5 = data;
        r8 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r8 = r8 + r4;
        value = r8;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r9 = r9.append(r6);
        r0 = r37;
        r9 = r9.append(r0);
        r6 = r9.toString();
        r5[r8] = r6;
        r4 = 1;
        return r4;
    L_0x005d:
        r4 = 4109; // 0x100d float:5.758E-42 double:2.03E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x07c2;
    L_0x0063:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r37 = type;
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r7 = this$0;
        r37 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r37 = r4 * r37;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + 1;
        r8 = r7[r8];
        r10 = p000.Vector.this$0;
        r4 = 0;
        r12 = -706386752; // 0xffffffffd5e564c0 float:-3.15276101E13 double:NaN;
        r11 = r10.get(r8, r4, r12);
        r13 = new List;
        r13.<init>(r11);
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r37 = r13.get(r6, r0);
        r7[r8] = r37;
        r4 = 1;
        return r4;
    L_0x00c7:
        r4 = 4101; // 0x1005 float:5.747E-42 double:2.026E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x02e7;
    L_0x00cd:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + 1;
        r14 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r9 = r9.append(r6);
        r9 = r9.append(r14);
        r6 = r9.toString();
        r5[r37] = r6;
        r4 = 1;
        return r4;
    L_0x0124:
        r4 = 4113; // 0x1011 float:5.764E-42 double:2.032E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0953;
    L_0x012a:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r15 = (char) r0;
        r4 = 32;
        if (r15 < r4) goto L_0x0941;
    L_0x0159:
        r4 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r15 > r4) goto L_0x0941;
    L_0x015d:
        r39 = 1;
    L_0x015f:
        if (r39 == 0) goto L_0x0678;
    L_0x0161:
        r16 = 1;
    L_0x0163:
        r7[r8] = r16;
        r4 = 1;
        return r4;
    L_0x0167:
        r4 = 4104; // 0x1008 float:5.751E-42 double:2.0276E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x03a6;
    L_0x016d:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r0 = r37;
        r0 = (long) r0;
        r17 = r0;
        r19 = 11745; // 0x2de1 float:1.6458E-41 double:5.803E-320;
        r0 = r17;
        r2 = r19;
        r0 = r0 + r2;
        r17 = r0;
        r19 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r0 = r17;
        r2 = r19;
        r0 = r0 * r2;
        r17 = r0;
        r21 = time;
        r22 = new java.util.Date;
        r0 = r22;
        r1 = r17;
        r0.<init>(r1);
        r0 = r21;
        r1 = r22;
        r0.setTime(r1);
        r21 = time;
        r4 = 5;
        r0 = r21;
        r37 = r0.get(r4);
        r21 = time;
        r4 = 2;
        r0 = r21;
        r8 = r0.get(r4);
        r21 = time;
        r4 = 1;
        r0 = r21;
        r23 = r0.get(r4);
        r5 = data;
        r24 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r24;
        r0 = r0 + r4;
        r24 = r0;
        value = r24;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r24;
        r0 = r0 * r4;
        r24 = r0;
        r24 = r24 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = r37;
        r9 = r9.append(r0);
        r25 = "-";
        r0 = r25;
        r9 = r9.append(r0);
        r26 = text;
        r6 = r26[r8];
        r9 = r9.append(r6);
        r25 = "-";
        r0 = r25;
        r9 = r9.append(r0);
        r0 = r23;
        r9 = r9.append(r0);
        r6 = r9.toString();
        r5[r24] = r6;
        r4 = 1;
        return r4;
    L_0x0213:
        r0 = r23;
        r1 = r24;
        r0 = r0 - r1;
        r23 = r0;
        if (r23 == 0) goto L_0x0829;
    L_0x021c:
        r4 = -1995248940; // 0xffffffff8912ead4 float:-1.7684526E-33 double:NaN;
        r0 = r23;
        r8 = p000.Locale.stackChange(r0, r4);
        r7[r37] = r8;
        r4 = 1;
        return r4;
    L_0x0229:
        r4 = 4107; // 0x100b float:5.755E-42 double:2.029E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x056d;
    L_0x022f:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5 = data;
        r8 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r4 * r8;
        r6 = r5[r8];
        r5 = data;
        r8 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r4 * r8;
        r8 = r8 + 1;
        r14 = r5[r8];
        r8 = p000.client.title;
        r4 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r8 = r4 * r8;
        r23 = r6.length();
        r24 = r14.length();
        r27 = 0;
        r15 = 0;
        r28 = 0;
        r29 = 0;
    L_0x0281:
        r30 = r29 - r27;
        r0 = r30;
        r1 = r23;
        if (r0 < r1) goto L_0x05e0;
    L_0x0289:
        r30 = r28 - r15;
        r0 = r30;
        r1 = r24;
        if (r0 < r1) goto L_0x05e0;
    L_0x0291:
        r0 = r23;
        r1 = r24;
        r28 = java.lang.Math.min(r0, r1);
        r29 = 0;
    L_0x029b:
        r0 = r29;
        r1 = r28;
        if (r0 >= r1) goto L_0x0213;
    L_0x02a1:
        r0 = r29;
        r27 = r6.charAt(r0);
        r0 = r29;
        r15 = r14.charAt(r0);
        r0 = r27;
        if (r15 == r0) goto L_0x05db;
    L_0x02b1:
        r0 = r27;
        r31 = java.lang.Character.toUpperCase(r0);
        r32 = java.lang.Character.toUpperCase(r15);
        r0 = r31;
        r1 = r32;
        if (r0 == r1) goto L_0x05db;
    L_0x02c1:
        r0 = r27;
        r27 = java.lang.Character.toLowerCase(r0);
        r15 = java.lang.Character.toLowerCase(r15);
        r0 = r27;
        if (r15 == r0) goto L_0x05db;
    L_0x02cf:
        r4 = 780476099; // 0x2e851ec3 float:6.053604E-11 double:3.85606428E-315;
        r0 = r27;
        r23 = p000.Location.add(r0, r8, r4);
        r4 = 713612319; // 0x2a88dc1f float:2.4311193E-13 double:3.525713313E-315;
        r8 = p000.Location.add(r15, r8, r4);
        r0 = r23;
        r0 = r0 - r8;
        r23 = r0;
        goto L_0x021c;
    L_0x02e7:
        r4 = 4102; // 0x1006 float:5.748E-42 double:2.0267E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0368;
    L_0x02ed:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r5 = data;
        r8 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r8 = r8 + r4;
        value = r8;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r9 = r9.append(r6);
        r4 = 1;
        r12 = -429978176; // 0xffffffffe65f0dc0 float:-2.6333534E23 double:NaN;
        r0 = r37;
        r6 = p000.Option.get(r0, r4, r12);
        r9 = r9.append(r6);
        r6 = r9.toString();
        r5[r8] = r6;
        r4 = 1;
        return r4;
    L_0x034c:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5[r37] = r14;
    L_0x0366:
        r4 = 1;
        return r4;
    L_0x0368:
        r4 = 4103; // 0x1007 float:5.75E-42 double:2.027E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0167;
    L_0x036e:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r6 = r6.toLowerCase();
        r5[r37] = r6;
        r4 = 1;
        return r4;
    L_0x03a6:
        r4 = 4105; // 0x1009 float:5.752E-42 double:2.028E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x040a;
    L_0x03ac:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + 1;
        r14 = r5[r37];
        r33 = p000.File.this$0;
        r0 = r33;
        r0 = r0.this$0;
        r34 = r0;
        if (r34 == 0) goto L_0x0505;
    L_0x03e0:
        r33 = p000.File.this$0;
        r0 = r33;
        r0 = r0.this$0;
        r34 = r0;
        r0 = r0.name;
        r39 = r0;
        if (r39 == 0) goto L_0x0505;
    L_0x03ee:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5[r37] = r14;
    L_0x0408:
        r4 = 1;
        return r4;
    L_0x040a:
        r4 = 4106; // 0x100a float:5.754E-42 double:2.0286E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0229;
    L_0x0410:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r5 = data;
        r8 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r8 = r8 + r4;
        value = r8;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r6 = java.lang.Integer.toString(r0);
        r5[r8] = r6;
        r4 = 1;
        return r4;
    L_0x0442:
        r4 = 4119; // 0x1017 float:5.772E-42 double:2.035E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x05ed;
    L_0x0448:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r9 = new java.lang.StringBuilder;
        r37 = r6.length();
        r0 = r37;
        r9.<init>(r0);
        r39 = 0;
        r37 = 0;
    L_0x046f:
        r8 = r6.length();
        r0 = r37;
        if (r0 >= r8) goto L_0x09ce;
    L_0x0477:
        r0 = r37;
        r15 = r6.charAt(r0);
        r4 = 60;
        if (r15 != r4) goto L_0x09bd;
    L_0x0481:
        r39 = 1;
    L_0x0483:
        r37 = r37 + 1;
        goto L_0x046f;
    L_0x0486:
        r4 = 8364; // 0x20ac float:1.172E-41 double:4.1324E-320;
        if (r15 == r4) goto L_0x049a;
    L_0x048a:
        r4 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r15 == r4) goto L_0x049a;
    L_0x048e:
        r4 = 8212; // 0x2014 float:1.1507E-41 double:4.0573E-320;
        if (r4 == r15) goto L_0x049a;
    L_0x0492:
        r4 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r4 == r15) goto L_0x049a;
    L_0x0496:
        r4 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        if (r15 != r4) goto L_0x094e;
    L_0x049a:
        r39 = 1;
        goto L_0x015f;
    L_0x049f:
        r4 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r0 = r31;
        if (r0 != r4) goto L_0x067d;
    L_0x04a5:
        r27 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x04a7:
        r4 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r0 = r32;
        if (r4 != r0) goto L_0x07a1;
    L_0x04ad:
        r15 = 69;
    L_0x04af:
        r4 = -1244916674; // 0xffffffffb5cc143e float:-1.5205076E-6 double:NaN;
        r0 = r31;
        r31 = p000.Arrays.encode(r0, r8, r4);
        r4 = 731299515; // 0x2b96bebb float:1.0711079E-12 double:3.61309967E-315;
        r0 = r32;
        r32 = p000.Arrays.encode(r0, r8, r4);
        r0 = r31;
        r1 = r32;
        if (r0 == r1) goto L_0x09f0;
    L_0x04c7:
        r0 = r31;
        r35 = java.lang.Character.toUpperCase(r0);
        r0 = r32;
        r36 = java.lang.Character.toUpperCase(r0);
        r0 = r35;
        r1 = r36;
        if (r0 == r1) goto L_0x09f0;
    L_0x04d9:
        r0 = r31;
        r31 = java.lang.Character.toLowerCase(r0);
        r0 = r32;
        r32 = java.lang.Character.toLowerCase(r0);
        r0 = r32;
        r1 = r31;
        if (r0 == r1) goto L_0x09f0;
    L_0x04eb:
        r4 = -501740898; // 0xffffffffe2180a9e float:-7.0116754E20 double:NaN;
        r0 = r31;
        r23 = p000.Location.add(r0, r8, r4);
        r4 = 171513803; // 0xa3917cb float:8.911901E-33 double:8.4739078E-316;
        r0 = r32;
        r8 = p000.Location.add(r0, r8, r4);
        r0 = r23;
        r0 = r0 - r8;
        r23 = r0;
        goto L_0x021c;
    L_0x0505:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5[r37] = r6;
        goto L_0x0408;
    L_0x0522:
        r4 = 4115; // 0x1013 float:5.766E-42 double:2.033E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x06f2;
    L_0x0528:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r15 = (char) r0;
        r4 = -220053740; // 0xfffffffff2e23f14 float:-8.962543E30 double:NaN;
        r39 = p000.Locale.isValidReferenceNameChar(r15, r4);
        if (r39 == 0) goto L_0x0992;
    L_0x055c:
        r16 = 1;
    L_0x055e:
        r7[r8] = r16;
        r4 = 1;
        return r4;
    L_0x0562:
        r4 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r0 = r32;
        if (r0 != r4) goto L_0x07b7;
    L_0x0568:
        r15 = 69;
        goto L_0x04af;
    L_0x056d:
        r4 = 4108; // 0x100c float:5.757E-42 double:2.0296E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x005d;
    L_0x0573:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r37 = type;
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r7 = this$0;
        r37 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r4 * r8;
        r8 = r8 + 1;
        r8 = r7[r8];
        r10 = p000.Vector.this$0;
        r4 = 0;
        r12 = -194777603; // 0xfffffffff463edfd float:-7.2233787E31 double:NaN;
        r11 = r10.get(r8, r4, r12);
        r13 = new List;
        r13.<init>(r11);
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r37 = r13.add(r6, r0);
        r7[r8] = r37;
        r4 = 1;
        return r4;
    L_0x05db:
        r29 = r29 + 1;
        goto L_0x029b;
    L_0x05e0:
        r30 = r29 - r27;
        r0 = r30;
        r1 = r23;
        if (r0 < r1) goto L_0x063d;
    L_0x05e8:
        r23 = -1;
        goto L_0x021c;
    L_0x05ed:
        r4 = 4120; // 0x1018 float:5.773E-42 double:2.0356E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0693;
    L_0x05f3:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r37 = r6.indexOf(r0);
        r7[r8] = r37;
        r4 = 1;
        return r4;
    L_0x063d:
        r30 = r28 - r15;
        r0 = r30;
        r1 = r24;
        if (r0 < r1) goto L_0x064a;
    L_0x0645:
        r23 = 1;
        goto L_0x021c;
    L_0x064a:
        if (r27 == 0) goto L_0x0662;
    L_0x064c:
        r31 = r27;
    L_0x064e:
        if (r15 == 0) goto L_0x066d;
    L_0x0650:
        r32 = r15;
    L_0x0652:
        r4 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r0 = r31;
        if (r4 != r0) goto L_0x049f;
    L_0x0658:
        r27 = 69;
        goto L_0x04a7;
    L_0x065d:
        r27 = 0;
        goto L_0x04a7;
    L_0x0662:
        r0 = r29;
        r27 = r6.charAt(r0);
        r29 = r29 + 1;
        r31 = r27;
        goto L_0x064e;
    L_0x066d:
        r0 = r28;
        r15 = r14.charAt(r0);
        r28 = r28 + 1;
        r32 = r15;
        goto L_0x0652;
    L_0x0678:
        r16 = 0;
        goto L_0x0163;
    L_0x067d:
        r4 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r31;
        if (r4 != r0) goto L_0x0688;
    L_0x0683:
        r27 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x04a7;
    L_0x0688:
        r4 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r0 = r31;
        if (r4 != r0) goto L_0x0730;
    L_0x068e:
        r27 = 69;
        goto L_0x04a7;
    L_0x0693:
        r4 = 4121; // 0x1019 float:5.775E-42 double:2.036E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x09ee;
    L_0x0699:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r37 = r4 * r37;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + 1;
        r14 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r37 = r6.indexOf(r14, r0);
        r7[r8] = r37;
        r4 = 1;
        return r4;
    L_0x06f2:
        r4 = 4116; // 0x1014 float:5.768E-42 double:2.0336E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x089f;
    L_0x06f8:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r15 = (char) r0;
        r4 = 5;
        r39 = p000.JGitText.get(r15, r4);
        if (r39 == 0) goto L_0x0997;
    L_0x072a:
        r16 = 1;
    L_0x072c:
        r7[r8] = r16;
        r4 = 1;
        return r4;
    L_0x0730:
        r4 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r0 = r31;
        if (r0 != r4) goto L_0x065d;
    L_0x0736:
        r27 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x04a7;
    L_0x073b:
        r4 = 4118; // 0x1016 float:5.77E-42 double:2.0346E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0442;
    L_0x0741:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r37 = type;
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r7 = this$0;
        r37 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + 1;
        r8 = r7[r8];
        r5 = data;
        r23 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r23;
        r0 = r0 + r4;
        r23 = r0;
        value = r23;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r23;
        r0 = r0 * r4;
        r23 = r0;
        r23 = r23 + -1;
        r0 = r37;
        r6 = r6.substring(r0, r8);
        r5[r23] = r6;
        r4 = 1;
        return r4;
    L_0x07a1:
        r4 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r0 = r32;
        if (r0 != r4) goto L_0x07ac;
    L_0x07a7:
        r15 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x04af;
    L_0x07ac:
        r4 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r32;
        if (r0 != r4) goto L_0x0562;
    L_0x07b2:
        r15 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x04af;
    L_0x07b7:
        r4 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r0 = r32;
        if (r4 != r0) goto L_0x093d;
    L_0x07bd:
        r15 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x04af;
    L_0x07c2:
        r4 = 4110; // 0x100e float:5.76E-42 double:2.0306E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0859;
    L_0x07c8:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r37 = r4 * r37;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + 1;
        r14 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r4 = 1;
        r0 = r37;
        if (r0 != r4) goto L_0x034c;
    L_0x080c:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5[r37] = r6;
        goto L_0x0366;
    L_0x0829:
        r23 = 0;
    L_0x082b:
        r0 = r23;
        r1 = r28;
        if (r0 >= r1) goto L_0x089a;
    L_0x0831:
        r0 = r23;
        r15 = r6.charAt(r0);
        r0 = r23;
        r27 = r14.charAt(r0);
        r0 = r27;
        if (r0 == r15) goto L_0x0897;
    L_0x0841:
        r4 = 2005586978; // 0x778ad422 float:5.631559E33 double:9.908916256E-315;
        r23 = p000.Location.add(r15, r8, r4);
        r4 = -914005010; // 0xffffffffc98563ee float:-1092733.8 double:NaN;
        r0 = r27;
        r8 = p000.Location.add(r0, r8, r4);
        r0 = r23;
        r0 = r0 - r8;
        r23 = r0;
        goto L_0x021c;
    L_0x0859:
        r4 = 4111; // 0x100f float:5.761E-42 double:2.031E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x08df;
    L_0x085f:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r6 = p000.List.add(r6);
        r5[r37] = r6;
        r4 = 1;
        return r4;
    L_0x0897:
        r23 = r23 + 1;
        goto L_0x082b;
    L_0x089a:
        r23 = 0;
        goto L_0x021c;
    L_0x089f:
        r4 = 4117; // 0x1015 float:5.769E-42 double:2.034E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x073b;
    L_0x08a5:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        if (r6 == 0) goto L_0x099f;
    L_0x08bf:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r8 = r6.length();
        r7[r37] = r8;
    L_0x08dd:
        r4 = 1;
        return r4;
    L_0x08df:
        r4 = 4112; // 0x1010 float:5.762E-42 double:2.0316E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0124;
    L_0x08e5:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r5 = data;
        r8 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r8 = r8 + r4;
        value = r8;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r9 = r9.append(r6);
        r0 = r37;
        r15 = (char) r0;
        r9 = r9.append(r15);
        r6 = r9.toString();
        r5[r8] = r6;
        r4 = 1;
        return r4;
    L_0x093d:
        r15 = 0;
        goto L_0x04af;
    L_0x0941:
        r4 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r15 < r4) goto L_0x0486;
    L_0x0945:
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r15 > r4) goto L_0x0486;
    L_0x0949:
        r39 = 1;
        goto L_0x015f;
    L_0x094e:
        r39 = 0;
        goto L_0x015f;
    L_0x0953:
        r4 = 4114; // 0x1012 float:5.765E-42 double:2.0326E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0522;
    L_0x0959:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r15 = (char) r0;
        r4 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r39 = p000.Logger.write(r15, r4);
        if (r39 == 0) goto L_0x099c;
    L_0x098c:
        r16 = 1;
    L_0x098e:
        r7[r8] = r16;
        r4 = 1;
        return r4;
    L_0x0992:
        r16 = 0;
        goto L_0x055e;
    L_0x0997:
        r16 = 0;
        goto L_0x072c;
    L_0x099c:
        r16 = 0;
        goto L_0x098e;
    L_0x099f:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r4 = 0;
        r7[r37] = r4;
        goto L_0x08dd;
    L_0x09bd:
        r4 = 62;
        if (r4 != r15) goto L_0x09c6;
    L_0x09c1:
        r39 = 0;
        goto L_0x0483;
    L_0x09c6:
        if (r39 != 0) goto L_0x0483;
    L_0x09c8:
        r9.append(r15);
        goto L_0x0483;
    L_0x09ce:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r6 = r9.toString();
        r5[r37] = r6;
        r4 = 1;
        return r4;
    L_0x09ee:
        r4 = 2;
        return r4;
    L_0x09f0:
        goto L_0x0281;
        */
        throw new UnsupportedOperationException("Method not decompiled: XMLParser.encode(int, CharSequence, boolean):int");
    }

    static int equals(int $i0, CharSequence charSequence, boolean z) {
        int $i1 = -1;
        int[] $r1;
        if ($i0 == 3300) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = client.type * 1581849891;
            return 1;
        } else if ($i0 == 3301) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            $i1 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            $r4 = (Region) Region.value.get((long) $i0);
            if ($r4 == null) {
                $i0 = -1;
            } else {
                if ($i1 >= 0) {
                    $i0 = $r4.size.length;
                    if ($i1 < $i0) {
                        $i0 = $r4.size[$i1];
                    }
                }
                $i0 = -1;
            }
            $r1[$i2] = $i0;
            return 1;
        } else if (3302 == $i0) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            $i1 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = HyperlinkRecord.get($i0, $i1, -2122722976);
            return 1;
        } else if ($i0 == 3303) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            $i1 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = Tag.add($i0, $i1, 2109708550);
            return 1;
        } else if ($i0 == 3304) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = FileInfo.getData($i0, (byte) -30).size * -408205527;
            return 1;
        } else if (3305 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.TRUE[$i0];
            return 1;
        } else if (3306 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.INSTANCE[$i0];
            return 1;
        } else if ($i0 == 3307) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.reader[$i0];
            return 1;
        } else if ($i0 == 3308) {
            $i0 = Msg.size * -1674539149;
            $i1 = ((File.this$0.size * 516759209) >> 7) + (Build$VERSION.type * 1407993063);
            $i2 = ((File.this$0.value * 2328865) >> 7) + (1289967967 * Level.type);
            $r1 = this$0;
            $i4 = type - 1194553915;
            type = $i4;
            $i0 = ($i0 << 28) + ($i1 << 14);
            $i0 = $i0;
            $r1[($i4 * 537618701) - 1] = $i0 + $i2;
            return 1;
        } else if (3309 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = ($i0 >> 14) & 16383;
            return 1;
        } else if ($i0 == 3310) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = $i0 >> 28;
            return 1;
        } else if ($i0 == 3311) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = $i0 & 16383;
            return 1;
        } else if ($i0 == 3312) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = client.start ? 1 : 0;
            return 1;
        } else if ($i0 == 3313) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701] + 32768;
            $i2 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i4 = type - 1194553915;
            type = $i4;
            $i4 = ($i4 * 537618701) - 1;
            $r4 = (Region) Region.value.get((long) $i0);
            if ($r4 != null && $i2 >= 0) {
                $i0 = $r4.size.length;
                if ($i2 < $i0) {
                    $i1 = $r4.size[$i2];
                }
            }
            $r1[$i4] = $i1;
            return 1;
        } else if ($i0 == 3314) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701] + 32768;
            $i1 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = HyperlinkRecord.get($i0, $i1, -1606886351);
            return 1;
        } else if (3315 == $i0) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701] + 32768;
            $i1 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = Tag.add($i0, $i1, 1217962947);
            return 1;
        } else if (3316 == $i0) {
            if (client.out * -2036797811 >= 2) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = client.out * -2036797811;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if (3317 == $i0) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -659341571 * client.description;
            return 1;
        } else if (3318 == $i0) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = client.f407x * -1304916389;
            return 1;
        } else if ($i0 == 3321) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -28768771 * client.entry;
            return 1;
        } else if ($i0 == 3322) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = client.from * 392548631;
            return 1;
        } else if (3323 == $i0) {
            if (client.comments) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = 1;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if (3324 == $i0) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = client.f397m * 1164415301;
            return 1;
        } else if (3325 != $i0) {
            return 2;
        } else {
            type -= -483248364;
            $i0 = (this$0[type * 537618701] + (this$0[(type * 537618701) + 1] << 14)) + (this$0[(type * 537618701) + 2] << 28);
            $i0 = $i0;
            $i0 = $i0 + this$0[(type * 537618701) + 3];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = $i0;
            return 1;
        }
    }

    static int evaluate(int $i0, CharSequence charSequence, boolean z) {
        System $r1 = z ? Constants.data : state;
        int[] $r2;
        if ($i0 == 1800) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = (JSONArray.get($r1, -182197182) >> 11) & 63;
            return 1;
        } else if ($i0 == 1801) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701] - 1;
            if ($r1.format == null || $i0 >= $r1.format.length || $r1.format[$i0] == null) {
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = "";
            } else {
                $r3 = data;
                int $i1 = value - 1246602361;
                value = $i1;
                $r3[($i1 * -1267697097) - 1] = $r1.format[$i0];
            }
            return 1;
        } else if (1802 != $i0) {
            return 2;
        } else {
            if ($r1.id == null) {
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = "";
            } else {
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = $r1.id;
            }
            return 1;
        }
    }

    static int execute(int $i0, CharSequence charSequence, boolean z) {
        z = false;
        if (6600 == $i0) {
            Feed.getInstance(-2073877955).get(Msg.size * -1674539149, (Build$VERSION.type * 1407993063) + ((File.this$0.size * 516759209) >> 7), (Level.type * 1289967967) + ((File.this$0.value * 2328865) >> 7), true, 208604515);
            return 1;
        } else if (6601 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            String $r4 = "";
            $r5 = Feed.getInstance(702760093).get($r3[$i0 * 537618701], 1780526797);
            if ($r5 != null) {
                $r4 = $r5.create(1845251321);
            }
            $r6 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r6[($i0 * -1267697097) - 1] = $r4;
            return 1;
        } else if ($i0 == 6602) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            Feed.getInstance(-2098228162).equals($r3[$i0 * 537618701], -2023164747);
            return 1;
        } else if ($i0 == 6603) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-131866102).init(-1543572246);
            return 1;
        } else if ($i0 == 6604) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            Feed.getInstance(-1839482565).read($r3[$i0 * 537618701], (byte) 16);
            return 1;
        } else if ($i0 == 6605) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Feed.getInstance(-165711757).getProperty(-1184788806)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if (6606 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-1609550999).load(1452060195 * r0.value, r0.data * 1719114399, 496060003);
            return 1;
        } else if (6607 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-1783442128).read(1452060195 * r0.value, r0.data * 1719114399, (byte) 1);
            return 1;
        } else if ($i0 == 6608) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-132004998).init(1302348633 * r0.type, r0.value * 1452060195, r0.data * 1719114399, 2063956963);
            return 1;
        } else if (6609 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-1411291472).write(1302348633 * r0.type, 1452060195 * r0.value, r0.data * 1719114399, (byte) 97);
            return 1;
        } else if (6610 == $i0) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(375576165).read(-1936129890);
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1703791860).size(414296057);
            return 1;
        } else if (6611 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(-2065461622).get($r3[$i0 * 537618701], -1227819454);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.read(-1585549308).toString(16711935);
            return 1;
        } else if ($i0 == 6612) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(837883150).get($r3[$i0 * 537618701], -2098912309);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.contains(-12536102) - $r5.add(-2113924132)) + 1) * 64;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.add((byte) -66) - $r5.append(1978452358)) + 1) * 64;
            return 1;
        } else if ($i0 == 6613) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(314159895).get($r3[$i0 * 537618701], 1999784472);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.add(-2113924132) * 64;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.append(-1391245846) * 64;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.contains(283805151) * 64) + 64) - 1;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.add((byte) 4) * 64) + 64) - 1;
            return 1;
        } else if ($i0 == 6614) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(-1586052486).get($r3[$i0 * 537618701], 1164948750);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.toString((byte) -85);
            return 1;
        } else if (6615 == $i0) {
            $r7 = Feed.getInstance(470613517).next(33704627);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r7.value * 1452060195;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r7.data * 1719114399;
            return 1;
        } else if (6616 == $i0) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1726339422).encode(-64702655);
            return 1;
        } else if ($i0 == 6617) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            $r5 = Feed.getInstance(-806377000).load(-2146210881);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = $r5.get(1302348633 * r0.type, r0.value * 1452060195, r0.data * 1719114399, (byte) 2);
            if ($r3 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            int[] $r13 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r13[($i0 * 537618701) - 1] = $r3[0];
            $r13 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r13[($i0 * 537618701) - 1] = $r3[1];
            return 1;
        } else if ($i0 == 6618) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            $r5 = Feed.getInstance(-1839651816).load(-1050095533);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r7 = $r5.add(r0.value * 1452060195, r0.data * 1719114399, (byte) 14);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r7.toString(16711935);
            return 1;
        } else if ($i0 == 6619) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            r0 = new Method(this$0[(type * 537618701) + 1]);
            Feed.getInstance(387366882).get(Feed.getInstance(365001959).get($i0, -578799116), (Method) new Method(File.this$0.context * -277606385, ((File.this$0.size * 516759209) >> 7) + (1407993063 * Build$VERSION.type), (Level.type * 1289967967) + ((File.this$0.value * 2328865) >> 7)), r0, false, (byte) -63);
            return 1;
        } else if (6620 == $i0) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            r0 = new Method(this$0[(type * 537618701) + 1]);
            $r5 = Feed.getInstance(814061826).get($i0, -384439412);
            int i = -277606385 * File.this$0.context;
            Feed.getInstance(647613243).get($r5, new Method(i, (1407993063 * Build$VERSION.type) + ((File.this$0.size * 516759209) >> 7), ((File.this$0.value * 2328865) >> 7) + (Level.type * 1289967967)), r0, true, Byte.MIN_VALUE);
            return 1;
        } else if (6621 == $i0) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            r0 = new Method(this$0[(type * 537618701) + 1]);
            $r5 = Feed.getInstance(-1581935455).get($i0, 1875881632);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if ($r5.get(r0.type * 1302348633, 1452060195 * r0.value, r0.data * 1719114399, 1946827084)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if ($i0 == 6622) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-750810919).toString(-2077494935);
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-789749000).parse(-1295775924);
            return 1;
        } else if (6623 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            $r5 = Feed.getInstance(-820020569).get(r0.type * 1302348633, 1452060195 * r0.value, r0.data * 1719114399, 526965417);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.toString(1686238370);
            return 1;
        } else if ($i0 == 6624) {
            $r2 = Feed.getInstance(-2111658206);
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.load($r3[$i0 * 537618701], 1182047553);
            return 1;
        } else if (6625 == $i0) {
            Feed.getInstance(433555728).read((short) -2490);
            return 1;
        } else if ($i0 == 6626) {
            $r2 = Feed.getInstance(-2061827769);
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.open($r3[$i0 * 537618701], -1820700323);
            return 1;
        } else if (6627 == $i0) {
            Feed.getInstance(627907373).add((byte) 111);
            return 1;
        } else if ($i0 == 6628) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r3[$i0 * 537618701] == 1) {
                z = true;
            }
            Feed.getInstance(-148598920).read(z, -737590336);
            return 1;
        } else if (6629 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            Feed.getInstance(-132754165).add($r3[$i0 * 537618701], (byte) 50);
            return 1;
        } else if ($i0 == 6630) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            Feed.getInstance(-1730427010).read($r3[$i0 * 537618701], -1772085722);
            return 1;
        } else if ($i0 == 6631) {
            Feed.getInstance(-1239742594).read((byte) 62);
            return 1;
        } else if ($i0 == 6632) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r3[$i0 * 537618701] == 1) {
                z = true;
            }
            Feed.getInstance(-1362653300).load(z, 1244081313);
            return 1;
        } else if ($i0 == 6633) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            if (1 == this$0[(type * 537618701) + 1]) {
                z = true;
            }
            Feed.getInstance(-125907935).get($i0, z, -1007046295);
            return 1;
        } else if ($i0 == 6634) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            if (1 == this$0[(type * 537618701) + 1]) {
                z = true;
            }
            Feed.getInstance(-694497830).read($i0, z, (short) 4095);
            return 1;
        } else if ($i0 == 6635) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Feed.getInstance(784830324).contains(1982431206)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if (6636 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r3[$i0 * 537618701];
            $r3 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $i1 = ($i1 * 537618701) - 1;
            if (Feed.getInstance(-1845026837).remove($i0, 372071910)) {
                z = true;
            }
            $r3[$i1] = z;
            return 1;
        } else if (6637 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r3[$i0 * 537618701];
            $r3 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $i1 = ($i1 * 537618701) - 1;
            if (Feed.getInstance(-996748985).contains($i0, -292849775)) {
                z = true;
            }
            $r3[$i1] = z;
            return 1;
        } else if ($i0 == 6638) {
            type -= 1905859466;
            $r7 = Feed.getInstance(-146458444).get(this$0[type * 537618701], new Method(this$0[(type * 537618701) + 1]), (byte) 85);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r7.toString(16711935);
            return 1;
        } else if ($i0 == 6639) {
            $r8 = Feed.getInstance(-246901920).create(-727768392);
            if ($r8 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r8.this$0 * -459008153;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r8.key.toString(16711935);
            return 1;
        } else if ($i0 == 6640) {
            $r8 = Feed.getInstance(-402500026).get(-67488227);
            if ($r8 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = -459008153 * $r8.this$0;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r8.key.toString(16711935);
            return 1;
        } else if ($i0 == 6693) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r11 = ByteBufferList.data[$r3[$i0 * 537618701]];
            if ($r11.value == null) {
                $r6 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r6[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r6 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r6[($i0 * -1267697097) - 1] = $r11.value;
            return 1;
        } else if (6694 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r11 = ByteBufferList.data[$r3[$i0 * 537618701]];
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r11.text * 253714037;
            return 1;
        } else if ($i0 == 6695) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r11 = ByteBufferList.data[$r3[$i0 * 537618701]];
            if ($r11 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r11.type * -2068206069;
            return 1;
        } else if ($i0 == 6696) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r11 = ByteBufferList.data[$r3[$i0 * 537618701]];
            if ($r11 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r11.pos * 1755658873;
            return 1;
        } else if ($i0 == 6697) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.length * -1099459587;
            return 1;
        } else if ($i0 == 6698) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.type.toString(16711935);
            return 1;
        } else if (6699 != $i0) {
            return 2;
        } else {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.file.toString(16711935);
            return 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int format(int r37, p000.CharSequence r38, boolean r39) {
        /*
        r4 = 4100; // 0x1004 float:5.745E-42 double:2.0257E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0062;
    L_0x0006:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r5 = data;
        r8 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r8 = r8 + r4;
        value = r8;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r9 = r9.append(r6);
        r0 = r37;
        r9 = r9.append(r0);
        r6 = r9.toString();
        r5[r8] = r6;
        r4 = 1;
        return r4;
    L_0x005d:
        r10 = 0;
    L_0x005e:
        r7[r8] = r10;
        r4 = 1;
        return r4;
    L_0x0062:
        r4 = 4101; // 0x1005 float:5.747E-42 double:2.026E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x0147;
    L_0x0068:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + 1;
        r11 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r9 = r9.append(r6);
        r9 = r9.append(r11);
        r6 = r9.toString();
        r5[r37] = r6;
        r4 = 1;
        return r4;
    L_0x00bf:
        r4 = 2;
        return r4;
    L_0x00c1:
        r12 = r12 + 1;
    L_0x00c3:
        if (r12 >= r13) goto L_0x07fd;
    L_0x00c5:
        r14 = r6.charAt(r12);
        r15 = r11.charAt(r12);
        if (r15 == r14) goto L_0x00c1;
    L_0x00cf:
        r16 = java.lang.Character.toUpperCase(r14);
        r17 = java.lang.Character.toUpperCase(r15);
        r0 = r16;
        r1 = r17;
        if (r0 == r1) goto L_0x00c1;
    L_0x00dd:
        r14 = java.lang.Character.toLowerCase(r14);
        r15 = java.lang.Character.toLowerCase(r15);
        if (r15 == r14) goto L_0x00c1;
    L_0x00e7:
        r4 = 1581168761; // 0x5e3eb879 float:3.43571683E18 double:7.81201165E-315;
        r18 = p000.Location.add(r14, r8, r4);
        r4 = -1275877076; // 0xffffffffb3f3a92c float:-1.13463415E-7 double:NaN;
        r8 = p000.Location.add(r15, r8, r4);
        r0 = r18;
        r0 = r0 - r8;
        r18 = r0;
    L_0x00fa:
        r4 = -1995248940; // 0xffffffff8912ead4 float:-1.7684526E-33 double:NaN;
        r0 = r18;
        r8 = p000.Locale.stackChange(r0, r4);
        r7[r37] = r8;
        r4 = 1;
        return r4;
    L_0x0107:
        r4 = 4117; // 0x1015 float:5.769E-42 double:2.034E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0225;
    L_0x010d:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        if (r6 == 0) goto L_0x094c;
    L_0x0127:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r8 = r6.length();
        r7[r37] = r8;
    L_0x0145:
        r4 = 1;
        return r4;
    L_0x0147:
        r4 = 4102; // 0x1006 float:5.748E-42 double:2.0267E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x028b;
    L_0x014d:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r5 = data;
        r8 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r8 = r8 + r4;
        value = r8;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r9 = r9.append(r6);
        r4 = 1;
        r19 = -89530187; // 0xfffffffffaa9e0b5 float:-4.410279E35 double:NaN;
        r0 = r37;
        r1 = r19;
        r6 = p000.Option.get(r0, r4, r1);
        r9 = r9.append(r6);
        r6 = r9.toString();
        r5[r8] = r6;
        r4 = 1;
        return r4;
    L_0x01ae:
        r4 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r15 < r4) goto L_0x0809;
    L_0x01b2:
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r15 > r4) goto L_0x0809;
    L_0x01b6:
        r39 = 1;
    L_0x01b8:
        if (r39 == 0) goto L_0x09de;
    L_0x01ba:
        r10 = 1;
    L_0x01bb:
        r7[r8] = r10;
        r4 = 1;
        return r4;
    L_0x01bf:
        r4 = 4110; // 0x100e float:5.76E-42 double:2.0306E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x06f5;
    L_0x01c5:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r37 = r4 * r37;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + 1;
        r11 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r4 = 1;
        r0 = r37;
        if (r0 != r4) goto L_0x0879;
    L_0x0209:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5[r37] = r6;
    L_0x0223:
        r4 = 1;
        return r4;
    L_0x0225:
        r4 = 4118; // 0x1016 float:5.77E-42 double:2.0346E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x06b1;
    L_0x022b:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r37 = type;
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r7 = this$0;
        r37 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + 1;
        r8 = r7[r8];
        r5 = data;
        r18 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r18;
        r0 = r0 + r4;
        r18 = r0;
        value = r18;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r18;
        r0 = r0 * r4;
        r18 = r0;
        r18 = r18 + -1;
        r0 = r37;
        r6 = r6.substring(r0, r8);
        r5[r18] = r6;
        r4 = 1;
        return r4;
    L_0x028b:
        r4 = 4103; // 0x1007 float:5.75E-42 double:2.027E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x02c9;
    L_0x0291:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r6 = r6.toLowerCase();
        r5[r37] = r6;
        r4 = 1;
        return r4;
    L_0x02c9:
        r4 = 4104; // 0x1008 float:5.751E-42 double:2.0276E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x03e6;
    L_0x02cf:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r0 = r37;
        r0 = (long) r0;
        r20 = r0;
        r22 = 11745; // 0x2de1 float:1.6458E-41 double:5.803E-320;
        r0 = r20;
        r2 = r22;
        r0 = r0 + r2;
        r20 = r0;
        r22 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r0 = r20;
        r2 = r22;
        r0 = r0 * r2;
        r20 = r0;
        r24 = time;
        r25 = new java.util.Date;
        r0 = r25;
        r1 = r20;
        r0.<init>(r1);
        r0 = r24;
        r1 = r25;
        r0.setTime(r1);
        r24 = time;
        r4 = 5;
        r0 = r24;
        r37 = r0.get(r4);
        r24 = time;
        r4 = 2;
        r0 = r24;
        r8 = r0.get(r4);
        r24 = time;
        r4 = 1;
        r0 = r24;
        r18 = r0.get(r4);
        r5 = data;
        r26 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r26;
        r0 = r0 + r4;
        r26 = r0;
        value = r26;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r26;
        r0 = r0 * r4;
        r26 = r0;
        r26 = r26 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = r37;
        r9 = r9.append(r0);
        r27 = "-";
        r0 = r27;
        r9 = r9.append(r0);
        r28 = text;
        r6 = r28[r8];
        r9 = r9.append(r6);
        r27 = "-";
        r0 = r27;
        r9 = r9.append(r0);
        r0 = r18;
        r9 = r9.append(r0);
        r6 = r9.toString();
        r5[r26] = r6;
        r4 = 1;
        return r4;
    L_0x0375:
        r4 = 4107; // 0x100b float:5.755E-42 double:2.029E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x0743;
    L_0x037b:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5 = data;
        r8 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r4 * r8;
        r6 = r5[r8];
        r5 = data;
        r8 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r4 * r8;
        r8 = r8 + 1;
        r11 = r5[r8];
        r8 = p000.client.title;
        r4 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r8 = r4 * r8;
        r18 = r6.length();
        r26 = r11.length();
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
    L_0x03ca:
        r29 = r12 - r14;
        r0 = r29;
        r1 = r18;
        if (r0 < r1) goto L_0x0567;
    L_0x03d2:
        r29 = r13 - r15;
        r0 = r29;
        r1 = r26;
        if (r0 < r1) goto L_0x0567;
    L_0x03da:
        r0 = r18;
        r1 = r26;
        r13 = java.lang.Math.min(r0, r1);
        r12 = 0;
        goto L_0x00c3;
    L_0x03e6:
        r4 = 4105; // 0x1009 float:5.752E-42 double:2.028E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x04d1;
    L_0x03ec:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + 1;
        r11 = r5[r37];
        r30 = p000.File.this$0;
        r0 = r30;
        r0 = r0.this$0;
        r31 = r0;
        if (r31 == 0) goto L_0x04b2;
    L_0x0420:
        r30 = p000.File.this$0;
        r0 = r30;
        r0 = r0.this$0;
        r31 = r0;
        r0 = r0.name;
        r39 = r0;
        if (r39 == 0) goto L_0x04b2;
    L_0x042e:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5[r37] = r11;
    L_0x0448:
        r4 = 1;
        return r4;
    L_0x044a:
        r4 = 4114; // 0x1012 float:5.765E-42 double:2.0326E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x07be;
    L_0x0450:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r15 = (char) r0;
        r4 = 52;
        r39 = p000.Logger.write(r15, r4);
        if (r39 == 0) goto L_0x04cf;
    L_0x0483:
        r10 = 1;
    L_0x0484:
        r7[r8] = r10;
        r4 = 1;
        return r4;
    L_0x0488:
        r18 = r18 + 1;
    L_0x048a:
        r0 = r18;
        if (r0 >= r13) goto L_0x0822;
    L_0x048e:
        r0 = r18;
        r15 = r6.charAt(r0);
        r0 = r18;
        r14 = r11.charAt(r0);
        if (r14 == r15) goto L_0x0488;
    L_0x049c:
        r4 = -1095324713; // 0xffffffffbeb6abd7 float:-0.35677978 double:NaN;
        r18 = p000.Location.add(r15, r8, r4);
        r4 = 295140931; // 0x11977e43 float:2.3901414E-28 double:1.458189947E-315;
        r8 = p000.Location.add(r14, r8, r4);
        r0 = r18;
        r0 = r0 - r8;
        r18 = r0;
        goto L_0x00fa;
    L_0x04b2:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5[r37] = r6;
        goto L_0x0448;
    L_0x04cf:
        r10 = 0;
        goto L_0x0484;
    L_0x04d1:
        r4 = 4106; // 0x100a float:5.754E-42 double:2.0286E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0375;
    L_0x04d7:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r5 = data;
        r8 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r8 = r8 + r4;
        value = r8;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r6 = java.lang.Integer.toString(r0);
        r5[r8] = r6;
        r4 = 1;
        return r4;
    L_0x0509:
        r4 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r17;
        if (r0 != r4) goto L_0x086e;
    L_0x050f:
        r15 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
    L_0x0511:
        r4 = -212465308; // 0xfffffffff3560964 float:-1.6957733E31 double:NaN;
        r0 = r16;
        r16 = p000.Arrays.encode(r0, r8, r4);
        r4 = 947426673; // 0x38789571 float:5.9266986E-5 double:4.68090971E-315;
        r0 = r17;
        r17 = p000.Arrays.encode(r0, r8, r4);
        r0 = r16;
        r1 = r17;
        if (r0 == r1) goto L_0x07bb;
    L_0x0529:
        r0 = r16;
        r32 = java.lang.Character.toUpperCase(r0);
        r0 = r17;
        r33 = java.lang.Character.toUpperCase(r0);
        r0 = r32;
        r1 = r33;
        if (r0 == r1) goto L_0x07bb;
    L_0x053b:
        r0 = r16;
        r16 = java.lang.Character.toLowerCase(r0);
        r0 = r17;
        r17 = java.lang.Character.toLowerCase(r0);
        r0 = r17;
        r1 = r16;
        if (r0 == r1) goto L_0x07bb;
    L_0x054d:
        r4 = -629923968; // 0xffffffffda741f80 float:-1.71786322E16 double:NaN;
        r0 = r16;
        r18 = p000.Location.add(r0, r8, r4);
        r4 = 2091630719; // 0x7cabc07f float:7.1342964E36 double:1.033402882E-314;
        r0 = r17;
        r8 = p000.Location.add(r0, r8, r4);
        r0 = r18;
        r0 = r0 - r8;
        r18 = r0;
        goto L_0x00fa;
    L_0x0567:
        r29 = r12 - r14;
        r0 = r29;
        r1 = r18;
        if (r0 < r1) goto L_0x0574;
    L_0x056f:
        r18 = -1;
        goto L_0x00fa;
    L_0x0574:
        r29 = r13 - r15;
        r0 = r29;
        r1 = r26;
        if (r0 < r1) goto L_0x0581;
    L_0x057c:
        r18 = 1;
        goto L_0x00fa;
    L_0x0581:
        if (r14 == 0) goto L_0x0863;
    L_0x0583:
        r16 = r14;
    L_0x0585:
        if (r15 == 0) goto L_0x059c;
    L_0x0587:
        r17 = r15;
    L_0x0589:
        r4 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r0 = r16;
        if (r4 != r0) goto L_0x0604;
    L_0x058f:
        r14 = 69;
    L_0x0591:
        r4 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r0 = r17;
        if (r4 != r0) goto L_0x06a6;
    L_0x0597:
        r15 = 69;
        goto L_0x0511;
    L_0x059c:
        r15 = r11.charAt(r13);
        r13 = r13 + 1;
        r17 = r15;
        goto L_0x0589;
    L_0x05a5:
        r4 = 4121; // 0x1019 float:5.775E-42 double:2.036E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x00bf;
    L_0x05ab:
        r37 = value;
        r4 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r37 = r4 * r37;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + 1;
        r11 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r37 = r6.indexOf(r11, r0);
        r7[r8] = r37;
        r4 = 1;
        return r4;
    L_0x0604:
        r4 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r0 = r16;
        if (r0 != r4) goto L_0x060d;
    L_0x060a:
        r14 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0591;
    L_0x060d:
        r4 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r16;
        if (r4 != r0) goto L_0x068c;
    L_0x0613:
        r14 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x0591;
    L_0x0618:
        r4 = 4109; // 0x100d float:5.758E-42 double:2.03E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x01bf;
    L_0x061e:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r37 = type;
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r7 = this$0;
        r37 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r37 = r4 * r37;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + 1;
        r8 = r7[r8];
        r34 = p000.Vector.this$0;
        r4 = 0;
        r19 = 543922053; // 0x206b9785 float:1.9955408E-19 double:2.687332004E-315;
        r0 = r34;
        r1 = r19;
        r35 = r0.get(r8, r4, r1);
        r36 = new List;
        r0 = r36;
        r1 = r35;
        r0.<init>(r1);
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r36;
        r1 = r37;
        r37 = r0.get(r6, r1);
        r7[r8] = r37;
        r4 = 1;
        return r4;
    L_0x068c:
        r4 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r0 = r16;
        if (r4 != r0) goto L_0x0697;
    L_0x0692:
        r14 = 69;
        goto L_0x0591;
    L_0x0697:
        r4 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r0 = r16;
        if (r0 != r4) goto L_0x06a2;
    L_0x069d:
        r14 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0591;
    L_0x06a2:
        r14 = 0;
        goto L_0x0591;
    L_0x06a6:
        r4 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r0 = r17;
        if (r0 != r4) goto L_0x0509;
    L_0x06ac:
        r15 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0511;
    L_0x06b1:
        r4 = 4119; // 0x1017 float:5.772E-42 double:2.035E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x098a;
    L_0x06b7:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r9 = new java.lang.StringBuilder;
        r37 = r6.length();
        r0 = r37;
        r9.<init>(r0);
        r39 = 0;
        r37 = 0;
    L_0x06de:
        r8 = r6.length();
        r0 = r37;
        if (r0 >= r8) goto L_0x096a;
    L_0x06e6:
        r0 = r37;
        r15 = r6.charAt(r0);
        r4 = 60;
        if (r15 != r4) goto L_0x0896;
    L_0x06f0:
        r39 = 1;
    L_0x06f2:
        r37 = r37 + 1;
        goto L_0x06de;
    L_0x06f5:
        r4 = 4111; // 0x100f float:5.761E-42 double:2.031E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x08a7;
    L_0x06fb:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r6 = p000.List.add(r6);
        r5[r37] = r6;
        r4 = 1;
        return r4;
    L_0x0733:
        r4 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r0 = r17;
        if (r4 != r0) goto L_0x09da;
    L_0x0739:
        r15 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0511;
    L_0x073e:
        r18 = 0;
        goto L_0x048a;
    L_0x0743:
        r4 = 4108; // 0x100c float:5.757E-42 double:2.0296E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x0618;
    L_0x0749:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r37 = type;
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r7 = this$0;
        r37 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r4 * r8;
        r8 = r8 + 1;
        r8 = r7[r8];
        r34 = p000.Vector.this$0;
        r4 = 0;
        r19 = -675285887; // 0xffffffffd7bff481 float:-4.22113714E14 double:NaN;
        r0 = r34;
        r1 = r19;
        r35 = r0.get(r8, r4, r1);
        r36 = new List;
        r0 = r36;
        r1 = r35;
        r0.<init>(r1);
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r36;
        r1 = r37;
        r37 = r0.add(r6, r1);
        r7[r8] = r37;
        r4 = 1;
        return r4;
    L_0x07bb:
        goto L_0x03ca;
    L_0x07be:
        r4 = 4115; // 0x1013 float:5.766E-42 double:2.033E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x0827;
    L_0x07c4:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r15 = (char) r0;
        r4 = -2009995551; // 0xffffffff8831e6e1 float:-5.3535397E-34 double:NaN;
        r39 = p000.Locale.isValidReferenceNameChar(r15, r4);
        if (r39 == 0) goto L_0x0948;
    L_0x07f8:
        r10 = 1;
    L_0x07f9:
        r7[r8] = r10;
        r4 = 1;
        return r4;
    L_0x07fd:
        r0 = r18;
        r1 = r26;
        r0 = r0 - r1;
        r18 = r0;
        if (r18 == 0) goto L_0x073e;
    L_0x0806:
        goto L_0x00fa;
    L_0x0809:
        r4 = 8364; // 0x20ac float:1.172E-41 double:4.1324E-320;
        if (r15 == r4) goto L_0x081d;
    L_0x080d:
        r4 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r15 == r4) goto L_0x081d;
    L_0x0811:
        r4 = 8212; // 0x2014 float:1.1507E-41 double:4.0573E-320;
        if (r4 == r15) goto L_0x081d;
    L_0x0815:
        r4 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r4 == r15) goto L_0x081d;
    L_0x0819:
        r4 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        if (r15 != r4) goto L_0x0943;
    L_0x081d:
        r39 = 1;
        goto L_0x01b8;
    L_0x0822:
        r18 = 0;
        goto L_0x00fa;
    L_0x0827:
        r4 = 4116; // 0x1014 float:5.768E-42 double:2.0336E-320;
        r0 = r37;
        if (r4 != r0) goto L_0x0107;
    L_0x082d:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r15 = (char) r0;
        r4 = 5;
        r39 = p000.JGitText.get(r15, r4);
        if (r39 == 0) goto L_0x005d;
    L_0x085f:
        r10 = 1;
        goto L_0x005e;
    L_0x0863:
        r14 = r6.charAt(r12);
        r12 = r12 + 1;
        r16 = r14;
        goto L_0x0585;
    L_0x086e:
        r4 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r0 = r17;
        if (r0 != r4) goto L_0x0733;
    L_0x0874:
        r15 = 69;
        goto L_0x0511;
    L_0x0879:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r5[r37] = r11;
        goto L_0x0223;
    L_0x0896:
        r4 = 62;
        if (r4 != r15) goto L_0x089f;
    L_0x089a:
        r39 = 0;
        goto L_0x06f2;
    L_0x089f:
        if (r39 != 0) goto L_0x06f2;
    L_0x08a1:
        r9.append(r15);
        goto L_0x06f2;
    L_0x08a7:
        r4 = 4112; // 0x1010 float:5.762E-42 double:2.0316E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x0905;
    L_0x08ad:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r5 = data;
        r8 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r8 = r8 + r4;
        value = r8;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r9 = r9.append(r6);
        r0 = r37;
        r15 = (char) r0;
        r9 = r9.append(r15);
        r6 = r9.toString();
        r5[r8] = r6;
        r4 = 1;
        return r4;
    L_0x0905:
        r4 = 4113; // 0x1011 float:5.764E-42 double:2.032E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x044a;
    L_0x090b:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r15 = (char) r0;
        r4 = 32;
        if (r15 < r4) goto L_0x01ae;
    L_0x093a:
        r4 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r15 > r4) goto L_0x01ae;
    L_0x093e:
        r39 = 1;
        goto L_0x01b8;
    L_0x0943:
        r39 = 0;
        goto L_0x01b8;
    L_0x0948:
        r10 = 0;
        goto L_0x07f9;
    L_0x094c:
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r4 = 0;
        r7[r37] = r4;
        goto L_0x0145;
    L_0x096a:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 + r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r37 + -1;
        r6 = r9.toString();
        r5[r37] = r6;
        r4 = 1;
        return r4;
    L_0x098a:
        r4 = 4120; // 0x1018 float:5.773E-42 double:2.0356E-320;
        r0 = r37;
        if (r0 != r4) goto L_0x05a5;
    L_0x0990:
        r5 = data;
        r37 = value;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        value = r37;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r6 = r5[r37];
        r7 = this$0;
        r37 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r37;
        r0 = r0 - r4;
        r37 = r0;
        type = r37;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r37;
        r0 = r0 * r4;
        r37 = r0;
        r37 = r7[r37];
        r7 = this$0;
        r8 = type;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r8 = r8 + r4;
        type = r8;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r8 = r8 * r4;
        r8 = r8 + -1;
        r0 = r37;
        r37 = r6.indexOf(r0);
        r7[r8] = r37;
        r4 = 1;
        return r4;
    L_0x09da:
        r15 = 0;
        goto L_0x0511;
    L_0x09de:
        r10 = 0;
        goto L_0x01bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: XMLParser.format(int, CharSequence, boolean):int");
    }

    static int get(int $i0, CharSequence charSequence, boolean $z0) {
        int $i1 = 2;
        int $i2 = 0;
        int $i3;
        System $r7;
        int[] $r1;
        if ($i0 < 1000) {
            if (609360810 == $i0) {
                type -= 711305551;
                $i3 = this$0[type * 537618701];
                $i1 = this$0[(type * 537618701) + 1];
                $i0 = this$0[(-461763076 * type) + 2];
                if ($i1 == 0) {
                    throw new RuntimeException();
                }
                System[] systemArr;
                System[] $r8;
                $r7 = ArrayList.get($i3, 1546202853);
                if ($r7.key == null) {
                    systemArr = new System[($i0 + 1)];
                    $r8 = systemArr;
                    $r7.key = systemArr;
                }
                systemArr = $r7.key;
                if (systemArr.length <= $i0) {
                    $r8 = new System[($i0 + 1)];
                    while (true) {
                        systemArr = $r7.key;
                        if ($i2 >= systemArr.length) {
                            break;
                        }
                        $r8[$i2] = $r7.key[$i2];
                        $i2++;
                    }
                    $r7.key = $r8;
                }
                if ($i0 <= 0 || $r7.key[$i0 - 1] != null) {
                    System system = new System();
                    system.name = $i1 * -264200545;
                    $i2 = $r7.value * 1;
                    system.value = $i2;
                    system.type = $i2 * 467915973;
                    system.next = -1063340613 * $i0;
                    system.position = true;
                    $r7.key[$i0] = system;
                    if ($z0) {
                        Constants.data = system;
                    } else {
                        state = system;
                    }
                    client.add($r7, (byte) 50);
                    $i0 = 1;
                } else {
                    throw new RuntimeException("" + ($i0 - 1));
                }
            } else if ($i0 == 996063855) {
                $r7 = $z0 ? Constants.data : state;
                System $r10 = ArrayList.get($r7.value * -935102127, 1116742514);
                $r10.key[$r7.next * -604219909] = null;
                client.add($r10, (byte) 50);
                $i0 = 1;
            } else if (102 == $i0) {
                $r1 = this$0;
                $i0 = type - 273799597;
                type = $i0;
                $r7 = ArrayList.get($r1[$i0 * 30518930], 265272224);
                $r7.key = null;
                client.add($r7, (byte) 24);
                $i0 = 1;
            } else if ($i0 == 200) {
                type -= -2087533020;
                $i0 = this$0[-1284380751 * type];
                $i2 = this$0[(type * 537618701) + 1];
                $r7 = DTrace.add($i0, $i2, (byte) 44);
                if ($r7 == null || -1 == $i2) {
                    $r1 = this$0;
                    $i0 = type - 1006822334;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                } else {
                    $r1 = this$0;
                    $i0 = type + 2044465183;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r7;
                    } else {
                        state = $r7;
                    }
                }
                $i0 = 1;
            } else if (-2059132087 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = ArrayList.get($r1[$i0 * 1589294017], 1199554195);
                if ($r7 != null) {
                    $r1 = this$0;
                    $i0 = type - 1208832692;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r7;
                    } else {
                        state = $r7;
                    }
                } else {
                    $r1 = this$0;
                    $i0 = type + 680677741;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                }
                $i0 = 1;
            } else {
                $i0 = 2;
            }
            return $i0;
        } else if ($i0 < 1100) {
            return DocWriter.add($i0, charSequence, $z0, (byte) 39);
        } else {
            if ($i0 < -1762965680) {
                return FileHeader.init($i0, charSequence, $z0, -27163539);
            }
            if ($i0 < -1941447697) {
                return FileHeader.parse($i0, charSequence, $z0, (byte) 44);
            }
            if ($i0 < -1385551038) {
                return Build$VERSION.parse($i0, charSequence, $z0, -1928876587);
            }
            if ($i0 < 1500) {
                return Timer.init($i0, charSequence, $z0, 2142624698);
            }
            if ($i0 < -628394364) {
                return Database.parse($i0, charSequence, $z0, -508209293);
            }
            if ($i0 < 1700) {
                return Map.parse($i0, charSequence, $z0, 1828945689);
            }
            if ($i0 < 1800) {
                $r7 = $z0 ? Constants.data : state;
                if (1607898089 == $i0) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r7.left * -594695551;
                    return 1;
                } else if (-737822947 == $i0) {
                    if (-868539721 * $r7.left != -1) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.offset * -1148087135;
                        return 1;
                    }
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 1169504711) - 1] = 0;
                    return 1;
                } else if ($i0 != 1702) {
                    return 2;
                } else {
                    $r1 = this$0;
                    $i0 = type + 1864161768;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r7.next * 2102445939;
                    return 1;
                }
            } else if ($i0 < 1900) {
                return Cell.toString($i0, charSequence, $z0, 509863009);
            } else {
                if ($i0 < 1227000947) {
                    return Cell.parse($i0, charSequence, $z0, -236915543);
                }
                if ($i0 < 2100) {
                    return DocWriter.add($i0, charSequence, $z0, (byte) 60);
                }
                if ($i0 < -926294908) {
                    return FileHeader.init($i0, charSequence, $z0, 655308219);
                }
                if ($i0 < 382952408) {
                    return FileHeader.parse($i0, charSequence, $z0, (byte) 24);
                }
                if ($i0 < 36928245) {
                    return Build$VERSION.parse($i0, charSequence, $z0, -631052933);
                }
                if ($i0 < 2078041123) {
                    return Timer.init($i0, charSequence, $z0, 2142624698);
                }
                if ($i0 < 2600) {
                    $r1 = this$0;
                    $i1 = type - -1194553915;
                    type = $i1;
                    $r7 = ArrayList.get($r1[$i1 * -1988682771], 1011413456);
                    if ($i0 == 44204433) {
                        $r1 = this$0;
                        $i0 = type - 1243987930;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.head * 642824123;
                        return 1;
                    } else if (-559734640 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.max * -116605217;
                        return 1;
                    } else if (1222838285 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 2113925563;
                        type = $i0;
                        $r1[($i0 * 1900599434) - 1] = $r7.this$0 * 256177861;
                        return 1;
                    } else if ($i0 == 2503) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.$assertionsDisabled * 1511706478;
                        return 1;
                    } else if (-1979345365 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r7.start) {
                            $i2 = 1;
                        }
                        $r1[$i0] = $i2;
                        return 1;
                    } else if ($i0 != 2052694657) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 690410499;
                        type = $i0;
                        $r1[($i0 * 1844076749) - 1] = $r7.type * -1008623461;
                        return 1;
                    }
                }
                String[] $r3;
                if ($i0 < 2700) {
                    $r1 = this$0;
                    $i1 = type - -1194553915;
                    type = $i1;
                    $r7 = ArrayList.get($r1[$i1 * 537618701], 612213305);
                    if ($i0 == 2600) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.f292i * 583356325;
                        return 1;
                    } else if (2601 == $i0) {
                        $r1 = this$0;
                        $i0 = type + 982895730;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.size * -1478588256;
                        return 1;
                    } else if ($i0 == 1873537024) {
                        $r3 = data;
                        $i0 = value + 2096962627;
                        value = $i0;
                        $r3[($i0 * -1267697097) - 1] = $r7.file;
                        return 1;
                    } else if ($i0 == -1181980940) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.cursor * 1151268625;
                        return 1;
                    } else if ($i0 == 2604) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * -1856269825) - 1] = $r7.buf * -1243953689;
                        return 1;
                    } else if (-14229068 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 830085593) - 1] = $r7.state * 1045303788;
                        return 1;
                    } else if ($i0 == 2606) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 998872248) - 1] = $r7.data * -1375479599;
                        return 1;
                    } else if (2607 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.instance * 92095237;
                        return 1;
                    } else if ($i0 == 2608) {
                        $r1 = this$0;
                        $i0 = type - 365489391;
                        type = $i0;
                        $r1[($i0 * -1151881142) - 1] = $r7.count * 1991471529;
                        return 1;
                    } else if ($i0 == 1017913535) {
                        $r1 = this$0;
                        $i0 = type + 1318801476;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.result * 635769745;
                        return 1;
                    } else if (913021773 == $i0) {
                        $r1 = this$0;
                        $i0 = type + 256195981;
                        type = $i0;
                        $r1[($i0 * 503297494) - 1] = $r7.source * -1726277411;
                        return 1;
                    } else if (2611 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 14402199) - 1] = $r7.index * 334261811;
                        return 1;
                    } else if (-1892565904 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * -325553060) - 1] = $r7.current * 1703184995;
                        return 1;
                    } else if (1968251948 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.err.get(1928103780);
                        return 1;
                    } else if (1189120143 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * -844401504) - 1;
                        if ($r7.error) {
                            $i2 = 1;
                        }
                        $r1[$i0] = $i2;
                        return 1;
                    }
                } else if ($i0 >= 2800) {
                    if ($i0 < 2900) {
                        $r1 = this$0;
                        $i2 = type - -1194553915;
                        type = $i2;
                        $r7 = ArrayList.get($r1[$i2 * 685379691], 970434138);
                        if (74036661 == $i0) {
                            $r1 = this$0;
                            $i0 = type - 542585973;
                            type = $i0;
                            $r1[($i0 * 1504094953) - 1] = (JSONArray.get($r7, -691253624) >> 11) & 63;
                            return 1;
                        } else if (2801 == $i0) {
                            $r1 = this$0;
                            $i0 = type - -202005084;
                            type = $i0;
                            $i0 = $r1[$i0 * 537618701] - 1;
                            if ($r7.format == null || $i0 >= $r7.format.length || $r7.format[$i0] == null) {
                                $r3 = data;
                                $i0 = value + 1257325476;
                                value = $i0;
                                $r3[($i0 * -1267697097) - 1] = "";
                                return 1;
                            }
                            $r3 = data;
                            $i2 = value + 28070787;
                            value = $i2;
                            $r3[($i2 * -1440752887) - 1] = $r7.format[$i0];
                            return 1;
                        } else if ($i0 == 1436883273) {
                            if ($r7.id == null) {
                                $r3 = data;
                                $i0 = value + 1499782071;
                                value = $i0;
                                $r3[($i0 * -1267697097) - 1] = "";
                                return 1;
                            }
                            $r3 = data;
                            $i0 = value + 460949938;
                            value = $i0;
                            $r3[($i0 * 2107008557) - 1] = $r7.id;
                            return 1;
                        }
                    } else if ($i0 < 744620898) {
                        return Cell.parse($i0, charSequence, $z0, -1210872974);
                    } else {
                        if ($i0 < -2041039788) {
                            return Character.parse($i0, charSequence, $z0, -1025704382);
                        }
                        if ($i0 < 3300) {
                            return Option.parse($i0, charSequence, $z0, 524713677);
                        }
                        if ($i0 < 3400) {
                            return ZStream.toString($i0, charSequence, $z0, 16711935);
                        }
                        int $i6;
                        if ($i0 < 3500) {
                            ByteVector $r6;
                            if (3400 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[-1144691655 * type];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r6 = CSVReader.add($i0, 1350202155);
                                if ('s' != $r6.value) {
                                    while ($i2 < -195897941 * $r6.count) {
                                        if ($i1 != $r6.index[$i2]) {
                                            $r3 = data;
                                            $i0 = value + 2069100327;
                                            value = $i0;
                                            $r3[($i0 * -1267697097) - 1] = $r6.length[$i2];
                                            $r6 = null;
                                            break;
                                        }
                                        $i2++;
                                    }
                                    if ($r6 != null) {
                                        $r3 = data;
                                        $i0 = value - 1246602361;
                                        value = $i0;
                                        $r3[($i0 * -1267697097) - 1] = $r6.size;
                                        return 1;
                                    }
                                }
                                while ($i2 < -195897941 * $r6.count) {
                                    if ($i1 != $r6.index[$i2]) {
                                        $r3 = data;
                                        $i0 = value + 2069100327;
                                        value = $i0;
                                        $r3[($i0 * -1267697097) - 1] = $r6.length[$i2];
                                        $r6 = null;
                                        break;
                                    }
                                    $i2++;
                                }
                                if ($r6 != null) {
                                    $r3 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r3[($i0 * -1267697097) - 1] = $r6.size;
                                    return 1;
                                }
                                if ($i2 < -195897941 * $r6.count) {
                                    if ($i1 != $r6.index[$i2]) {
                                        $r3 = data;
                                        $i0 = value + 2069100327;
                                        value = $i0;
                                        $r3[($i0 * -1267697097) - 1] = $r6.length[$i2];
                                        $r6 = null;
                                        break;
                                    }
                                    $i2++;
                                }
                                if ($r6 != null) {
                                    $r3 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r3[($i0 * -1267697097) - 1] = $r6.size;
                                    return 1;
                                }
                            } else if (-254701225 == $i0) {
                                type -= -483248364;
                                char $i12 = this$0[-1660313429 * type];
                                char $i02 = this$0[(type * 537618701) + 1];
                                $i3 = this$0[(1334870829 * type) + 2];
                                $i6 = this$0[(type * 537618701) + 3];
                                $r6 = CSVReader.add($i3, -1577278885);
                                char $c4 = $r6.data;
                                if ($c4 == $i12 && $i02 == $r6.value) {
                                    while ($i2 < 1493719121 * $r6.count) {
                                        if ($i6 == $r6.index[$i2]) {
                                            if ($i02 == '쒅') {
                                                $r3 = data;
                                                $i1 = value + 1281877678;
                                                value = $i1;
                                                $r3[($i1 * -1267697097) - 1] = $r6.length[$i2];
                                            } else {
                                                $r1 = this$0;
                                                $i1 = type - 1194553915;
                                                type = $i1;
                                                $r1[($i1 * 1121019432) - 1] = $r6.next[$i2];
                                            }
                                            $r6 = null;
                                            if ($r6 != null) {
                                                if ('s' != $i02) {
                                                    $r3 = data;
                                                    $i0 = value - 1246602361;
                                                    value = $i0;
                                                    $r3[($i0 * -1267697097) - 1] = $r6.size;
                                                    return 1;
                                                }
                                                $r1 = this$0;
                                                $i0 = type - 1194553915;
                                                type = $i0;
                                                $r1[($i0 * -94926322) - 1] = $r6.current * -1291569969;
                                                return 1;
                                            }
                                        }
                                        $i2++;
                                    }
                                    if ($r6 != null) {
                                        if ('s' != $i02) {
                                            $r1 = this$0;
                                            $i0 = type - 1194553915;
                                            type = $i0;
                                            $r1[($i0 * -94926322) - 1] = $r6.current * -1291569969;
                                            return 1;
                                        }
                                        $r3 = data;
                                        $i0 = value - 1246602361;
                                        value = $i0;
                                        $r3[($i0 * -1267697097) - 1] = $r6.size;
                                        return 1;
                                    }
                                } else if ($i02 == 's') {
                                    $r3 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r3[($i0 * -1267697097) - 1] = R$id.this$0;
                                    return 1;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1840279900;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                            } else if ($i0 != 744155932) {
                                return 2;
                            } else {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $r6 = CSVReader.add($r1[$i0 * 585917278], 579370154);
                                $r1 = this$0;
                                $i0 = type - 1194553915;
                                type = $i0;
                                $r1[($i0 * -1068241371) - 1] = $r6.add((byte) 1);
                                return 1;
                            }
                        } else if ($i0 < 3700) {
                            return BoundingBox.parse($i0, charSequence, $z0, 2123082082);
                        } else {
                            if ($i0 < -2108188274) {
                                return Item.parse($i0, charSequence, $z0, (byte) -75);
                            }
                            int $i03;
                            if ($i0 < 4100) {
                                if ($i0 == 4000) {
                                    type -= 229465007;
                                    $i0 = this$0[type * 537618701];
                                    $i2 = this$0[(type * -254802973) + 1];
                                    $r1 = this$0;
                                    $i1 = type - 2019074956;
                                    type = $i1;
                                    $r1[($i1 * 537618701) - 1] = $i0 + $i2;
                                    return 1;
                                } else if (-77834441 == $i0) {
                                    type -= 1905859466;
                                    $i0 = this$0[type * -836720145];
                                    $i2 = this$0[(type * -155147501) + 1];
                                    $r1 = this$0;
                                    $i1 = type - 935071154;
                                    type = $i1;
                                    $r1[($i1 * 537618701) - 1] = $i0 - $i2;
                                    return 1;
                                } else if ($i0 == 849996141) {
                                    type -= -1948834414;
                                    $i0 = this$0[type * -108427433];
                                    $i2 = this$0[(type * 537618701) + 1];
                                    $r1 = this$0;
                                    $i1 = type - 1194553915;
                                    type = $i1;
                                    $r1[($i1 * -1311711552) - 1] = $i0 * $i2;
                                    return 1;
                                } else if (4003 == $i0) {
                                    type -= -190720428;
                                    $i0 = this$0[type * 537618701];
                                    $i2 = this$0[(type * 537618701) + 1];
                                    $r1 = this$0;
                                    $i1 = type + 1894996924;
                                    type = $i1;
                                    $r1[($i1 * 835235655) - 1] = $i0 / $i2;
                                    return 1;
                                } else if (-2076776408 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -274118082;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    $r1 = this$0;
                                    $i2 = type + 1378661820;
                                    type = $i2;
                                    $i03 = Math.random() * ((double) $i0);
                                    r38 = $i03;
                                    $r1[($i2 * 537618701) - 1] = (int) $i03;
                                    return 1;
                                } else if ($i0 == 4005) {
                                    $r1 = this$0;
                                    $i0 = type - -936727123;
                                    type = $i0;
                                    $i0 = $r1[$i0 * -1440802726];
                                    $r1 = this$0;
                                    $i2 = type - 1194553915;
                                    type = $i2;
                                    $i03 = Math.random() * ((double) ($i0 + 1));
                                    r38 = $i03;
                                    $r1[($i2 * 537618701) - 1] = (int) $i03;
                                    return 1;
                                } else if (4006 == $i0) {
                                    type -= -519619430;
                                    $i0 = this$0[type * 537618701];
                                    $i2 = this$0[(type * 537618701) + 1];
                                    $i1 = this$0[(1496236102 * type) + 2];
                                    $i3 = this$0[(type * -675123012) + 3];
                                    int $i7 = this$0[(1314816576 * type) + 4];
                                    $r1 = this$0;
                                    $i6 = type - 1194553915;
                                    type = $i6;
                                    $r1[($i6 * 537618701) - 1] = $i0 + ((($i2 - $i0) * ($i7 - $i1)) / ($i3 - $i1));
                                    return 1;
                                } else if (4007 == $i0) {
                                    type -= -83687481;
                                    $i0 = this$0[type * -1374097481];
                                    $i2 = this$0[(type * 537618701) + 1];
                                    $r1 = this$0;
                                    $i1 = type - 1194553915;
                                    type = $i1;
                                    $r1[($i1 * 537618701) - 1] = $i0 + (($i2 * $i0) / 100);
                                    return 1;
                                } else if ($i0 == -1670431532) {
                                    type -= 1905859466;
                                    $i0 = this$0[-1598819259 * type];
                                    $i2 = this$0[(type * -963263360) + 1];
                                    $r1 = this$0;
                                    $i1 = type + 316226467;
                                    type = $i1;
                                    $r1[($i1 * 537618701) - 1] = $i0 | (1 << $i2);
                                    return 1;
                                } else if (4009 == $i0) {
                                    type -= -1552318167;
                                    $i0 = this$0[type * 537618701];
                                    $i2 = this$0[(type * 537618701) + 1];
                                    $r1 = this$0;
                                    $i1 = type - 1194553915;
                                    type = $i1;
                                    $r1[($i1 * -411653681) - 1] = $i0 & (-1 - (1 << $i2));
                                    return 1;
                                } else if (4010 == $i0) {
                                    type -= 1978341626;
                                    $i0 = this$0[type * -1560310455];
                                    $i1 = this$0[(-383262387 * type) + 1];
                                    $r1 = this$0;
                                    $i3 = type + 1491244494;
                                    type = $i3;
                                    $i3 = ($i3 * 1887587277) - 1;
                                    if (($i0 & (1 << $i1)) != 0) {
                                        $i2 = 1;
                                    }
                                    $r1[$i3] = $i2;
                                    return 1;
                                } else if ($i0 == 1241470693) {
                                    type -= 1905859466;
                                    $i0 = this$0[type * 537618701];
                                    $i2 = this$0[(type * 537618701) + 1];
                                    $r1 = this$0;
                                    $i1 = type - 1194553915;
                                    type = $i1;
                                    $r1[($i1 * -415270580) - 1] = $i0 % $i2;
                                    return 1;
                                } else if (1495935100 == $i0) {
                                    type -= 2111608732;
                                    $i0 = this$0[type * 537618701];
                                    $i2 = this$0[(362876690 * type) + 1];
                                    if ($i0 == 0) {
                                        $r1 = this$0;
                                        $i0 = type + 1789793446;
                                        type = $i0;
                                        $r1[($i0 * -1759864918) - 1] = 0;
                                        return 1;
                                    }
                                    $r1 = this$0;
                                    $i1 = type + 329286034;
                                    type = $i1;
                                    $r1[($i1 * 537618701) - 1] = (int) Math.pow((double) $i0, (double) $i2);
                                    return 1;
                                } else if (747463764 == $i0) {
                                    type -= 1905859466;
                                    $i0 = this$0[1996558147 * type];
                                    $i2 = this$0[(type * 537618701) + 1];
                                    if ($i0 == 0) {
                                        $r1 = this$0;
                                        $i0 = type - 314337403;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = 0;
                                        return 1;
                                    }
                                    double d;
                                    double d2;
                                    switch ($i2) {
                                        case 0:
                                            $r1 = this$0;
                                            $i0 = type - 577595027;
                                            type = $i0;
                                            $r1[($i0 * -1871309722) - 1] = -260652270;
                                            return 1;
                                        case 1:
                                            $r1 = this$0;
                                            $i2 = type - 1332448424;
                                            type = $i2;
                                            $r1[($i2 * 537618701) - 1] = $i0;
                                            return 1;
                                        case 2:
                                            $r1 = this$0;
                                            $i2 = type - 1194553915;
                                            type = $i2;
                                            d = (double) $i0;
                                            d2 = d;
                                            $r1[($i2 * -1769955058) - 1] = (int) Math.sqrt(d);
                                            return 1;
                                        case 3:
                                            $r1 = this$0;
                                            $i2 = type + 1951083130;
                                            type = $i2;
                                            d = (double) $i0;
                                            d2 = d;
                                            $r1[($i2 * 537618701) - 1] = (int) Math.cbrt(d);
                                            return 1;
                                        case 4:
                                            $r1 = this$0;
                                            $i2 = type - 1194553915;
                                            type = $i2;
                                            d = (double) $i0;
                                            d2 = d;
                                            $r1[($i2 * 1238147837) - 1] = (int) Math.sqrt(Math.sqrt(d));
                                            return 1;
                                        default:
                                            $r1 = this$0;
                                            $i1 = type - 1194553915;
                                            type = $i1;
                                            $r1[($i1 * 1950811349) - 1] = (int) Math.pow((double) $i0, 1.0d / ((double) $i2));
                                            return 1;
                                    }
                                } else if (4014 == $i0) {
                                    type -= 1905859466;
                                    $i0 = this$0[1910175602 * type];
                                    $i2 = this$0[(type * 123843816) + 1];
                                    $r1 = this$0;
                                    $i1 = type + 1740539053;
                                    type = $i1;
                                    $r1[($i1 * 537618701) - 1] = $i0 & $i2;
                                    return 1;
                                } else if (-873197491 == $i0) {
                                    type -= 1905859466;
                                    $i0 = this$0[1857960842 * type];
                                    $i2 = this$0[(type * -1789038791) + 1];
                                    $r1 = this$0;
                                    $i1 = type - 1194553915;
                                    type = $i1;
                                    $r1[($i1 * 1277403214) - 1] = $i0 | $i2;
                                    return 1;
                                } else if (4018 == $i0) {
                                    type -= 1994491172;
                                    long $l10 = (long) this$0[-1355532557 * type];
                                    long $l8 = (long) this$0[(type * -134942924) + 1];
                                    long $l11 = (long) this$0[(type * 537618701) + 2];
                                    $r1 = this$0;
                                    $i0 = type - 1851409983;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = (int) (($l10 * $l11) / $l8);
                                    return 1;
                                }
                            } else if ($i0 < 4200) {
                                return JSONArray.parse($i0, charSequence, $z0, 1330286677);
                            } else {
                                if ($i0 < -1786217505) {
                                    return Short.parse($i0, charSequence, $z0, -509657867);
                                }
                                if ($i0 < 5100) {
                                    return Msg.toString($i0, charSequence, $z0, 1203922167);
                                }
                                if ($i0 < -1307655713) {
                                    if ($i0 == -416118493) {
                                        $r1 = this$0;
                                        $i0 = type - 656709609;
                                        type = $i0;
                                        $i0 = ($i0 * -571996183) - 1;
                                        if (!client.state) {
                                            $i1 = 1;
                                        }
                                        $r1[$i0] = $i1;
                                        return 1;
                                    } else if (-114157465 == $i0) {
                                        $r1 = this$0;
                                        $i0 = type - -1194553915;
                                        type = $i0;
                                        $i0 = $r1[$i0 * -1120910393];
                                        if ($i0 == 1 || 2 == $i0) {
                                            client.context.init($i0, -292094485);
                                            return 1;
                                        }
                                    } else if ($i0 == 5308) {
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = 1775240613 * Main.this$0.value;
                                        return 1;
                                    } else if ($i0 != 918713938) {
                                        return 2;
                                    } else {
                                        $r1 = this$0;
                                        $i0 = type - -1194553915;
                                        type = $i0;
                                        $i0 = $r1[$i0 * 537618701];
                                        if (1 == $i0 || 2 == $i0) {
                                            $i03 = $i0 * 1983339053;
                                            $i0 = $i03;
                                            Main.this$0.value = $i03;
                                            KeyPair.toString(-907471620);
                                            return 1;
                                        }
                                    }
                                } else if ($i0 < 5600) {
                                    if ($i0 == 1707118933) {
                                        type -= 1905859466;
                                        $i0 = this$0[type * 43782868];
                                        $i2 = this$0[(-681026513 * type) + 1];
                                        if (!client.dir) {
                                            Stream.set($i0, $i2, -2076413030);
                                            return 1;
                                        }
                                    } else if ($i0 == 5505) {
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * -1855764845) - 1] = client.tag * 40837772;
                                        return 1;
                                    } else if (1465607694 == $i0) {
                                        $r1 = this$0;
                                        $i0 = type - 1364410642;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = client.level * 495897301;
                                        return 1;
                                    } else if (5530 == $i0) {
                                        $r1 = this$0;
                                        $i0 = type - -1194553915;
                                        type = $i0;
                                        $i0 = $r1[$i0 * -461652741];
                                        if ($i0 >= 0) {
                                            $i2 = $i0;
                                        }
                                        client.cursor = $i2 * -1089737365;
                                        return 1;
                                    } else if ($i0 == 1874336699) {
                                        $r1 = this$0;
                                        $i0 = type + 1552891031;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = client.cursor * -448360435;
                                        return 1;
                                    }
                                } else if ($i0 < -532377706) {
                                    if (5630 == $i0) {
                                        client.text = 2011709852;
                                        return 1;
                                    }
                                } else if ($i0 < 1117292950) {
                                    if ($i0 == 6200) {
                                        type -= 1905859466;
                                        client.TAG = (short) this$0[type * -2145862758];
                                        if (client.TAG <= (short) 0) {
                                            client.TAG = (short) -1038215099;
                                        }
                                        client.instance = (short) this$0[(type * 537618701) + 1];
                                        if (client.instance <= (short) 0) {
                                            client.instance = (short) 205;
                                            return 1;
                                        }
                                    } else if ($i0 == 6201) {
                                        type -= 966612135;
                                        client.counter = (short) this$0[type * 537618701];
                                        if (client.counter <= (short) 0) {
                                            client.counter = (short) 1242034992;
                                        }
                                        client.order = (short) this$0[(type * 537618701) + 1];
                                        if (client.order <= (short) 0) {
                                            client.order = (short) 320;
                                            return 1;
                                        }
                                    } else if (6202 == $i0) {
                                        type -= 1602130676;
                                        client.line = (short) this$0[type * -1829839310];
                                        if (client.line <= (short) 0) {
                                            client.line = (short) 1;
                                        }
                                        client.left = (short) this$0[(-1904322097 * type) + 1];
                                        if (client.left <= (short) 0) {
                                            client.left = Short.MAX_VALUE;
                                        } else {
                                            if (client.left < client.line) {
                                                client.left = client.line;
                                            }
                                        }
                                        client.last = (short) this$0[(464864921 * type) + 2];
                                        if (client.last <= (short) 0) {
                                            client.last = (short) 1;
                                        }
                                        client.max = (short) this$0[(-1662522601 * type) + 3];
                                        if (client.max <= (short) 0) {
                                            client.max = Short.MAX_VALUE;
                                            return 1;
                                        }
                                        if (client.max < client.last) {
                                            client.max = client.last;
                                            return 1;
                                        }
                                    } else if ($i0 == 22501719) {
                                        if (client.options != null) {
                                            MultiInputStream.init(0, 0, 256177861 * client.options.this$0, 1452563251 * client.options.$assertionsDisabled, false, -1691479348);
                                            $r1 = this$0;
                                            $i0 = type - 902605466;
                                            type = $i0;
                                            $r1[($i0 * 537618701) - 1] = 2140963035 * client.mCurrent;
                                            $r1 = this$0;
                                            $i0 = type - 1194553915;
                                            type = $i0;
                                            $r1[($i0 * 1374303615) - 1] = client.page * -1949120505;
                                            return 1;
                                        }
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 593906803) - 1] = -1;
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 1961539057) - 1] = -1;
                                        return 1;
                                    } else if ($i0 == 1588720848) {
                                        $r1 = this$0;
                                        $i0 = type - 1060560036;
                                        type = $i0;
                                        $r1[($i0 * 1881323370) - 1] = client.counter;
                                        $r1 = this$0;
                                        $i0 = type - 1028964408;
                                        type = $i0;
                                        $r1[($i0 * -1845479231) - 1] = client.order;
                                        return 1;
                                    } else if (36547797 != $i0) {
                                        return 2;
                                    } else {
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = client.TAG;
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 566347280) - 1] = client.instance;
                                        return 1;
                                    }
                                } else if ($i0 < 835244511) {
                                    return Chart.parse($i0, charSequence, $z0, 1965249910);
                                } else {
                                    if ($i0 < 78887209) {
                                        return Config.parse($i0, charSequence, $z0, -348012150);
                                    }
                                }
                            }
                        }
                        return 1;
                    }
                    return 2;
                } else if ($i0 == 2700) {
                    $r1 = this$0;
                    $i0 = type - -1727278937;
                    type = $i0;
                    $r7 = ArrayList.get($r1[$i0 * -569837503], 361963364);
                    $r1 = this$0;
                    $i0 = type - 1793513125;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r7.left * -868539721;
                    return 1;
                } else if ($i0 == -205843103) {
                    $r1 = this$0;
                    $i0 = type - 978255059;
                    type = $i0;
                    $r7 = ArrayList.get($r1[$i0 * 1417467314], 1886193310);
                    if ($r7.left * -1953085525 != -1) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r7.offset * -1148087135;
                        return 1;
                    }
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                    return 1;
                } else if ($i0 == 656515250) {
                    $r1 = this$0;
                    $i0 = type - -759301400;
                    type = $i0;
                    if (((Character) client.position.get((long) $r1[$i0 * 537618701])) != null) {
                        $r1 = this$0;
                        $i0 = type - 1905730663;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 1;
                        return 1;
                    }
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 1710895398) - 1] = 0;
                    return 1;
                } else if (2706 != $i0) {
                    return 2;
                } else {
                    $r1 = this$0;
                    $i0 = type + 1860507596;
                    type = $i0;
                    $r1[($i0 * -1745919207) - 1] = -1911077273 * client.parent;
                    return 1;
                }
                return 2;
            }
        }
    }

    static int getData(int $i0, CharSequence charSequence, boolean z) {
        boolean $i1 = false;
        int[] $r1;
        int $i12;
        if (3903 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].get((byte) -24);
            return 1;
        } else if ($i0 == 3904) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].state * 1845400323;
            return 1;
        } else if ($i0 == 3905) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].value * -1928030811;
            return 1;
        } else if (3906 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].name * -672413105;
            return 1;
        } else if ($i0 == 3907) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].pos * -732345473;
            return 1;
        } else if ($i0 == 3908) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].data * -1822937453;
            return 1;
        } else if (3910 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if ($i0 == 0) {
                $i12 = 1;
            }
            $r1[$i2] = $i12;
            return 1;
        } else if (3911 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if ($i0 == 2) {
                $i12 = 1;
            }
            $r1[$i2] = $i12;
            return 1;
        } else if (3912 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if ($i0 == 5) {
                $i12 = 1;
            }
            $r1[$i2] = $i12;
            return 1;
        } else if (3913 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if (1 == $i0) {
                $i12 = 1;
            }
            $r1[$i2] = $i12;
            return 1;
        } else {
            if ($i0 == 3914) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.text, $i1, -234524224);
                    return 1;
                }
            } else if (3915 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.url, $i1, -1041000693);
                    return 1;
                }
            } else if ($i0 == 3916) {
                type -= 1905859466;
                z = 1 == this$0[type * 537618701];
                if (this$0[(type * 537618701) + 1] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    client.intent.id = $i1;
                    ZStream.data.add(client.intent, z, -68794911);
                    return 1;
                }
            } else if ($i0 == 3917) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.type, $i1, 287223982);
                    return 1;
                }
            } else if (3918 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.intent, $i1, -250679384);
                    return 1;
                }
            } else if ($i0 == 3919) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $i0 = ($i0 * 537618701) - 1;
                if (ZStream.data != null) {
                    $i12 = ZStream.data.data.size();
                }
                $r1[$i0] = $i12;
                return 1;
            } else if ($i0 == 3920) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r9 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r9.index * -215043303;
                return 1;
            } else if ($i0 == 3921) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r9 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * -1267697097) - 1] = $r9.getKey(-1462247273);
                return 1;
            } else if (3922 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r9 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * -1267697097) - 1] = $r9.getParent(200354863);
                return 1;
            } else if (3923 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                long linkedList = (LinkedList.toString(1320582478) - (DrawingGroup.logger * 5304096097959642155L)) - (((AstNode) ZStream.data.data.get($r1[$i0 * 537618701])).position * 8313538393492320215L);
                $i0 = (int) (linkedList / 3600000);
                long $l4 = (linkedList - ((long) (3600000 * $i0))) / 60000;
                long j = $l4;
                $i12 = (int) $l4;
                $l4 = ((linkedList - ((long) (3600000 * $i0))) - ((long) (60000 * $i12))) / 1000;
                linkedList = $l4;
                $i2 = (int) $l4;
                String $r11 = $i0 + ":" + ($i12 / 10) + ($i12 % 10) + ":" + ($i2 / 10) + ($i2 % 10);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * -1267697097) - 1] = $r11;
                return 1;
            } else if (3924 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r9 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r9.this$0.name * -672413105;
            } else if ($i0 == 3925) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r9 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r9.this$0.value * -1928030811;
                return 1;
            } else if (3926 != $i0) {
                return 2;
            } else {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r9 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r9.this$0.state * 1845400323;
                return 1;
            }
            return 1;
        }
    }

    static int getSize(int $i0, CharSequence charSequence, boolean z) {
        byte $b1 = (byte) 0;
        int $i2 = -1;
        int[] $r1;
        if ($i0 == 3300) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 1790610553) - 1] = client.type * 78499482;
            return 1;
        } else if ($i0 == 1395563763) {
            type -= 1905859466;
            $i0 = this$0[type * 579937345];
            $i2 = this$0[(1396811946 * type) + 1];
            $r1 = this$0;
            $i3 = type - 1072409736;
            type = $i3;
            $i3 = ($i3 * 537618701) - 1;
            $r4 = (Region) Region.value.get((long) $i0);
            if ($r4 == null) {
                $i0 = -1;
            } else {
                if ($i2 >= 0) {
                    $i0 = $r4.size.length;
                    if ($i2 < $i0) {
                        $i0 = $r4.size[$i2];
                    }
                }
                $i0 = -1;
            }
            $r1[$i3] = $i0;
            return 1;
        } else if (294056897 == $i0) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            $i2 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i3 = type - 1194553915;
            type = $i3;
            $r1[($i3 * 537618701) - 1] = HyperlinkRecord.get($i0, $i2, -1658575385);
            return 1;
        } else if ($i0 == 3303) {
            type -= 1905859466;
            $i0 = this$0[-129300801 * type];
            $i2 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i3 = type + 1644223361;
            type = $i3;
            $r1[($i3 * 611541490) - 1] = Tag.add($i0, $i2, 1373980908);
            return 1;
        } else if ($i0 == 583995244) {
            $r1 = this$0;
            $i0 = type - -1364040999;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type + 901079353;
            type = $i2;
            $r1[($i2 * 815688554) - 1] = FileInfo.getData($i0, (byte) -89).size * -980731731;
            return 1;
        } else if (-1371798092 == $i0) {
            $r1 = this$0;
            $i0 = type - -1868032612;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 2018118307) - 1] = client.TRUE[$i0];
            return 1;
        } else if (3306 == $i0) {
            $r1 = this$0;
            $i0 = type - -477057334;
            type = $i0;
            $i0 = $r1[$i0 * 1943229229];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 446153780) - 1] = client.INSTANCE[$i0];
            return 1;
        } else if ($i0 == 3307) {
            $r1 = this$0;
            $i0 = type - 865226781;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * -1273427963) - 1] = client.reader[$i0];
            return 1;
        } else if ($i0 == -230411862) {
            $i0 = Msg.size * 1044452921;
            $i2 = ((File.this$0.size * 1796951273) >> 7) + (Build$VERSION.type * -1590778596);
            $i3 = ((File.this$0.value * 2328865) >> 7) + (1289967967 * Level.type);
            $r1 = this$0;
            $i4 = type - 1634340777;
            type = $i4;
            $i0 = ($i0 << 28) + ($i2 << 14);
            $i0 = $i0;
            $r1[($i4 * -1300679304) - 1] = $i0 + $i3;
            return 1;
        } else if (3309 == $i0) {
            $r1 = this$0;
            $i0 = type - 1588383775;
            type = $i0;
            $i0 = $r1[$i0 * -1710665958];
            $r1 = this$0;
            $i2 = type + 1658412568;
            type = $i2;
            $r1[($i2 * -478526104) - 1] = ($i0 >> 14) & 340285081;
            return 1;
        } else if ($i0 == -903380263) {
            $r1 = this$0;
            $i0 = type - -1003881308;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = $i0 >> 28;
            return 1;
        } else if ($i0 == 3311) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * -1215125633];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = $i0 & 16383;
            return 1;
        } else if ($i0 == 2047847153) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (client.start) {
                $b1 = (byte) 1;
            }
            $r1[$i0] = $b1;
            return 1;
        } else if ($i0 == 3313) {
            type -= 964176959;
            $i0 = this$0[type * 537618701] + 1258437867;
            $i3 = this$0[(type * 1301890610) + 1];
            $r1 = this$0;
            $i4 = type - 1194553915;
            type = $i4;
            $i4 = ($i4 * 537618701) - 1;
            $r4 = (Region) Region.value.get((long) $i0);
            if ($r4 != null && $i3 >= 0) {
                $i0 = $r4.size.length;
                if ($i3 < $i0) {
                    $i2 = $r4.size[$i3];
                }
            }
            $r1[$i4] = $i2;
            return 1;
        } else if ($i0 == -788553087) {
            type -= -81465654;
            $i0 = this$0[1874505109 * type] - 1828381412;
            $i2 = this$0[(type * -533807733) + 1];
            $r1 = this$0;
            $i3 = type + 1865293856;
            type = $i3;
            $r1[($i3 * 537618701) - 1] = HyperlinkRecord.get($i0, $i2, 209778143);
            return 1;
        } else if (-931679656 == $i0) {
            type -= -1326853824;
            $i0 = this$0[-2113016086 * type] - 1336727617;
            $i2 = this$0[(685595505 * type) + 1];
            $r1 = this$0;
            $i3 = type - 1194553915;
            type = $i3;
            $r1[($i3 * 537618701) - 1] = Tag.add($i0, $i2, 2052951427);
            return 1;
        } else if (3316 == $i0) {
            if (client.out * -2036797811 >= 2) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * -741344145) - 1] = client.out * -2036797811;
                return 1;
            }
            $r1 = this$0;
            $i0 = type + 50424720;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if (1487273303 == $i0) {
            $r1 = this$0;
            $i0 = type + 2144154231;
            type = $i0;
            $r1[($i0 * -1758894376) - 1] = -659341571 * client.description;
            return 1;
        } else if (1355959476 == $i0) {
            $r1 = this$0;
            $i0 = type + 2019308707;
            type = $i0;
            $r1[($i0 * -307534782) - 1] = client.f407x * -124152861;
            return 1;
        } else if ($i0 == 74564323) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -28768771 * client.entry;
            return 1;
        } else if ($i0 == 1175834186) {
            $r1 = this$0;
            $i0 = type - 1600092445;
            type = $i0;
            $r1[($i0 * 672306987) - 1] = client.from * 1199436251;
            return 1;
        } else if (3323 == $i0) {
            if (client.comments) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = 1;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if (3324 == $i0) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = client.f397m * 1164415301;
            return 1;
        } else if (3325 != $i0) {
            return 2;
        } else {
            type -= 1220951805;
            $i0 = this$0[type * -909257124];
            $i2 = this$0[(type * 537618701) + 1];
            $i0 = $i0 + ($i2 << 14);
            $i0 += this$0[(type * 537618701) + 2] << 28;
            $i0 = $i0;
            $i0 = $i0 + this$0[(type * 537618701) + 3];
            $r1 = this$0;
            $i2 = type + 262107402;
            type = $i2;
            $r1[($i2 * 1564089861) - 1] = $i0;
            return 1;
        }
    }

    static int getValue(int $i0, CharSequence charSequence, boolean z) {
        boolean $i1 = false;
        int[] $r2;
        if (-1297614677 == $i0) {
            if (Primitive.data.type * -1211745851 == 0) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 855905528;
                return 1;
            } else if (-1211745851 * Primitive.data.type == 1) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 378474664) - 1] = -1;
                return 1;
            } else {
                $r2 = this$0;
                $i0 = type + 2046014506;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = Primitive.data.this$0.get(1773870743);
                return 1;
            }
        } else if (3601 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 1027530262];
            if (!Primitive.data.contains(2130647203) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(1998751696)) {
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * 1180280646) - 1] = "";
                $r9 = data;
                $i0 = value + 1465861461;
                value = $i0;
                $r9[($i0 * 58881128) - 1] = "";
                return 1;
            }
            Pair $r8 = (Pair) Primitive.data.this$0.get($i0, -111822009);
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * 1658171177) - 1] = $r8.get((byte) -57);
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * -2122480592) - 1] = $r8.encode((byte) -1);
            return 1;
        } else if ($i0 == 3602) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 1242822101];
            if (!Primitive.data.contains(2145843369) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(1227556068)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * -53114437) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 702272243;
            type = $i1;
            $r2[($i1 * 1805614193) - 1] = ((Coordinate) Primitive.data.this$0.get($i0, 1929467084)).this$0 * -1161455169;
            return 1;
        } else if (28777835 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (!Primitive.data.contains(2134311347) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(1780386194)) {
                $r2 = this$0;
                $i0 = type + 1046573549;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * -55314782) - 1] = ((Coordinate) Primitive.data.this$0.get($i0, -42578265)).count * 1598845212;
            return 1;
        } else if ($i0 == 3604) {
            $r9 = data;
            $i0 = value - -359232846;
            value = $i0;
            $r10 = $r9[$i0 * -1267697097];
            $r2 = this$0;
            $i0 = type - 1145459495;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            $r20 = Logger.add(R$string.offset, client.this$0.key, (byte) -43);
            $r20.this$0.append(Record.toString($r10, 1238976728) + 1, (byte) 31);
            $r20.this$0.clear($i0, 1703184995);
            $r20.this$0.add($r10, Byte.MIN_VALUE);
            client.this$0.add((Config) $r20, (short) 255);
            return 1;
        } else if (-100772504 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Primitive.data.init($r9[$i0 * 702008767], (byte) -51);
            return 1;
        } else if (1247078626 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Primitive.data.toString($r9[$i0 * -1267697097], -1512304095);
            return 1;
        } else if (3607 == $i0) {
            $r9 = data;
            $i0 = value - -771647940;
            value = $i0;
            Primitive.data.get($r9[$i0 * -482009310], 1495663750);
            return 1;
        } else if (3608 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Primitive.data.load($r9[$i0 * -1267697097], -1862398429);
            return 1;
        } else if ($i0 == 3609) {
            $r9 = data;
            $i0 = value - 871764335;
            value = $i0;
            $r10 = ArrayMap.get($r9[$i0 * 468934902], -292013008);
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 1268766362) - 1;
            if (Primitive.data.toString(new JSONObject($r10, LogActivity.type), false, -889911197)) {
                $i1 = 1;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if ($i0 == -2024446699) {
            if (MyAsyncTask.this$0 != null) {
                $r9 = data;
                $i0 = value - 223507966;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = MyAsyncTask.this$0.key;
                return 1;
            }
            $r9 = data;
            $i0 = value - 1281910559;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (3612 == $i0) {
            if (MyAsyncTask.this$0 != null) {
                $r2 = this$0;
                $i0 = type - 1309337017;
                type = $i0;
                $r2[($i0 * -1120805237) - 1] = MyAsyncTask.this$0.get(1708695747);
                return 1;
            }
            $r2 = this$0;
            $i0 = type - 2111860823;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3613) {
            $r2 = this$0;
            $i0 = type - 1265707530;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1201202126)) {
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r9 = data;
            $i1 = value - 1246602361;
            value = $i1;
            $r9[($i1 * 1817210817) - 1] = MyAsyncTask.this$0.get($i0, 1147906357).getKey(1838004125).toString(-1348322271);
            return 1;
        } else if ($i0 == 3614) {
            $r2 = this$0;
            $i0 = type - 595236671;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1869992695)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1827236689;
            type = $i1;
            $r2[($i1 * -98471898) - 1] = ((Coordinate) MyAsyncTask.this$0.get($i0, 2108697232)).write((byte) -39);
            return 1;
        } else if (-1316568568 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 384771369];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1572613325)) {
                $r2 = this$0;
                $i0 = type + 671263075;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 365591603;
            type = $i1;
            $r2[($i1 * 1344217618) - 1] = ((Coordinate) MyAsyncTask.this$0.get($i0, 924147339)).count * -1055111740;
            return 1;
        } else if ($i0 == 1306388153) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (MyAsyncTask.this$0 != null) {
                $i1 = MyAsyncTask.this$0.state;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if (3617 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Packet.toString($r9[$i0 * -1267697097], 487356334);
            return 1;
        } else if ($i0 == 1535157330) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (MyAsyncTask.this$0 != null) {
                $i1 = MyAsyncTask.this$0.f273a * 1167196616;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if (3619 == $i0) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            TIntArrayList.add($r9[$i0 * -1267697097], (byte) 4);
            return 1;
        } else if (1652089165 == $i0) {
            $r20 = Logger.add(R$string.this$0, client.this$0.key, (byte) -22);
            $r20.this$0.append(0, (byte) 31);
            client.this$0.add((Config) $r20, (short) 255);
            return 1;
        } else if (1278543129 == $i0) {
            if (Primitive.data.contains(2128544391)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 438014208) - 1] = Primitive.data.data.get(1353054623);
                return 1;
            }
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * -577212892) - 1] = -1;
            return 1;
        } else if (3622 == $i0) {
            $r2 = this$0;
            $i0 = type - -1198393448;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (!Primitive.data.contains(2147009239) || $i0 < 0 || $i0 >= Primitive.data.data.get(1619021377)) {
                $r9 = data;
                $i0 = value + 344583304;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            State $r29 = (Timer) Primitive.data.data.get($i0, 277319274);
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * 1365961097) - 1] = $r29.get((byte) -29);
            $r9 = data;
            $i0 = value + 1540582260;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = $r29.encode((byte) -1);
            return 1;
        } else if ($i0 == 109828534) {
            $r9 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r10 = ArrayMap.get($r9[$i0 * 1600276449], 2141812703);
            $r2 = this$0;
            $i0 = type - 1548170549;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = Primitive.data.add(new JSONObject($r10, LogActivity.type), (byte) -12) ? 1 : 0;
            return 1;
        } else if ($i0 == 967076826) {
            $r2 = this$0;
            $i0 = type - 885409267;
            type = $i0;
            $i0 = $r2[$i0 * -2012413986];
            if (MyAsyncTask.this$0 != null && $i0 < MyAsyncTask.this$0.get(1418698946)) {
                if (MyAsyncTask.this$0.get($i0, -74873356).getKey(2136893101).equals(File.this$0.type)) {
                    $r2 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r2[($i0 * 89866724) - 1] = 1;
                    return 1;
                }
            }
            $r2 = this$0;
            $i0 = type + 8694945;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == -165198104) {
            if (MyAsyncTask.this$0 == null || MyAsyncTask.this$0.value == null) {
                $r9 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r9[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r9 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r9[($i0 * -1267697097) - 1] = MyAsyncTask.this$0.value;
            return 1;
        } else if (3626 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 231774437];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1107716384) || !((Cell) MyAsyncTask.this$0.get($i0, 544839444)).add((byte) 87)) {
                $r2 = this$0;
                $i0 = type + 7889855;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i0 = type + 989289464;
            type = $i0;
            $r2[($i0 * -1785095586) - 1] = 1;
            return 1;
        } else if ($i0 == 3627) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1980145743) || !((Cell) MyAsyncTask.this$0.get($i0, 669493504)).add(1799209702)) {
                $r2 = this$0;
                $i0 = type + 1456848866;
                type = $i0;
                $r2[($i0 * -1655422876) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i0 = type - 142049742;
            type = $i0;
            $r2[($i0 * 1051878527) - 1] = 1;
            return 1;
        } else if ($i0 == 3628) {
            Primitive.data.this$0.transform(6730569);
            return 1;
        } else if ($i0 == 1870121215) {
            $r2 = this$0;
            $i0 = type - 1050477592;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new FileComparator($i1), (byte) 1);
            return 1;
        } else if (3630 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 1036881252] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Geometry($i1), (byte) 1);
            return 1;
        } else if (3631 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new AbstractLoadingActivity$3$1($i1), (byte) 1);
            return 1;
        } else if ($i0 == 250000445) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Document($i1), (byte) 1);
            return 1;
        } else if (1166082827 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 1118354662] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Diff($i1), (byte) 1);
            return 1;
        } else if (38307178 == $i0) {
            $r2 = this$0;
            $i0 = type - 1723074616;
            type = $i0;
            if ($r2[$i0 * -280926950] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new AssertionError($i1), (byte) 1);
            return 1;
        } else if (-112235548 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString(new CharacterReference($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3636) {
            $r2 = this$0;
            $i0 = type - -337298846;
            type = $i0;
            if ($r2[$i0 * -1733434282] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Exception($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3637) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * -1904196949] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString((Comparator) new Byte($i1), (byte) 1);
            return 1;
        } else if (-1439895399 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.this$0.toString(new Locale($i1), (byte) 1);
            return 1;
        } else if (627861313 == $i0) {
            Primitive.data.this$0.toString(1241064189);
            return 1;
        } else if ($i0 == 3640) {
            Primitive.data.data.transform(1138189767);
            return 1;
        } else if (3641 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.data.toString((Comparator) new FileComparator($i1), (byte) 1);
            return 1;
        } else if ($i0 == 3642) {
            $r2 = this$0;
            $i0 = type - -1203799472;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Primitive.data.data.toString((Comparator) new Geometry($i1), (byte) 1);
            return 1;
        } else if (1121438628 == $i0) {
            Primitive.data.data.toString(1241064189);
            return 1;
        } else {
            if (3644 == $i0) {
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.transform(-695560403);
                    return 1;
                }
            } else if (-1181764213 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 322013206] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new FileComparator($i1), (byte) 1);
                    return 1;
                }
            } else if (-347847831 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 2026997172] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Geometry($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 36978708) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new AbstractLoadingActivity$3$1($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3648) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * -1852644887] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Document($i1), (byte) 1);
                    return 1;
                }
            } else if (3649 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Diff($i1), (byte) 1);
                    return 1;
                }
            } else if (3650 == $i0) {
                $r2 = this$0;
                $i0 = type - -834843968;
                type = $i0;
                if ($r2[$i0 * -1079579068] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new AssertionError($i1), (byte) 1);
                    return 1;
                }
            } else if (3651 == $i0) {
                $r2 = this$0;
                $i0 = type - 945413366;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString(new CharacterReference($i1), (byte) 1);
                    return 1;
                }
            } else if (3652 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Exception($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3653) {
                $r2 = this$0;
                $i0 = type - 1250261589;
                type = $i0;
                if ($r2[$i0 * 1203482373] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Byte($i1), (byte) 1);
                    return 1;
                }
            } else if (3654 == $i0) {
                $r2 = this$0;
                $i0 = type - 1547881759;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString(new Locale($i1), (byte) 1);
                    return 1;
                }
            } else if (3655 == $i0) {
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString(1241064189);
                    return 1;
                }
            } else if ($i0 == 1150181556) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Vector2D($i1), (byte) 1);
                return 1;
            } else if (-1829803746 != $i0) {
                return 2;
            } else {
                $r2 = this$0;
                $i0 = type - -1801489757;
                type = $i0;
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

    static int handleMessage(int $i0, CharSequence charSequence, boolean $z0) {
        System $r2;
        boolean $z1 = false;
        if ($i0 >= 2000) {
            $i0 -= 1000;
            int[] $r1 = this$0;
            int $i1 = type - -1194553915;
            type = $i1;
            $r2 = ArrayList.get($r1[$i1 * 537618701], 1364392318);
        } else {
            $r2 = $z0 ? Constants.data : state;
        }
        client.add($r2, (byte) 92);
        if (1200 == $i0 || $i0 == 1205 || 1212 == $i0) {
            type -= 1905859466;
            $i1 = this$0[type * 537618701];
            int $i2 = this$0[(type * 537618701) + 1];
            $r2.left = -1404216569 * $i1;
            $r2.offset = $i2 * 895045473;
            Message $r3 = Set.get($i1, 1678761558);
            $r2.data = $r3.parent * -1010358009;
            $r2.count = $r3.level * -1123242253;
            $r2.instance = -1813573947 * $r3.f217x;
            $r2.startTime = $r3.index * -1211168499;
            $r2.progress = 1928138403 * $r3.key;
            $r2.state = $r3.data * -136593549;
            if ($i0 == 1205) {
                $r2.body = 0;
            } else {
                $z0 = $i0 == 1212;
                if ($r3.name * 1099170281 == 1) {
                    $z1 = true;
                }
                if ($z0 | $z1) {
                    $r2.body = -144948821;
                } else {
                    $r2.body = -289897642;
                }
            }
            if (1535179975 * $r2.filter > 0) {
                $r2.state = (($r2.state * -1336947680) / ($r2.filter * 1535179975)) * 62563745;
                return 1;
            } else if ($r2.f300x * 1506390075 > 0) {
                $r2.state = (($r2.state * -1336947680) / (1506390075 * $r2.f300x)) * 62563745;
                return 1;
            }
        } else if (1201 == $i0) {
            $r2.status = -1427487042;
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.text = $r1[$i0 * 537618701] * -174447253;
            return 1;
        } else if (1202 != $i0) {
            return 2;
        } else {
            $r2.status = -2141230563;
            $r2.text = File.this$0.this$0.toString((byte) -41) * -174447253;
        }
        return 1;
    }

    static int init(int i, CharSequence charSequence, boolean z) {
        int $i1;
        System $r2;
        boolean $z1 = false;
        if (i >= 1479673524) {
            i -= 1000;
            int[] $r1 = this$0;
            $i1 = type - -1194553915;
            type = $i1;
            $i1 = $r1[$i1 * 431810672];
            $r2 = ArrayList.get($i1, 404399883);
        } else {
            $r2 = z ? Constants.data : state;
            $i1 = -1;
        }
        int $i0;
        if (1100 == i) {
            type -= -1555901327;
            $r2.f292i = 1859612037 * this$0[type * 537618701];
            if (-833835910 * $r2.f292i > (-2117482511 * $r2.cursor) - ($r2.this$0 * -213056279)) {
                $i0 = ($r2.cursor * -110289456) - ($r2.this$0 * 2145143210);
                i = $i0;
                $r2.f292i = $i0;
            }
            if (-1461613274 * $r2.f292i < 0) {
                $r2.f292i = 0;
            }
            $i0 = this$0[(type * -1541441538) + 1] * 274170433;
            i = $i0;
            $r2.size = $i0;
            if (-1099983610 * $r2.size > ($r2.buf * 615651065) - (-1289250750 * $r2.$assertionsDisabled)) {
                $i0 = (-158560857 * $r2.buf) - ($r2.$assertionsDisabled * 45066952);
                i = $i0;
                $r2.size = $i0;
            }
            if (654937537 * $r2.size < 0) {
                $r2.size = 0;
            }
            client.add($r2, (byte) 19);
            return 1;
        } else if (i == 442135620) {
            $r1 = this$0;
            i = type - -1194553915;
            type = i;
            $i0 = $r1[i * 537618701] * -1437691354;
            i = $i0;
            $r2.index = $i0;
            client.add($r2, (byte) 82);
            return 1;
        } else if (1102 == i) {
            $r1 = this$0;
            i = type - -898985714;
            type = i;
            $r2.level = $r1[i * 537618701] == 1;
            client.add($r2, (byte) 40);
            return 1;
        } else if (i == 2028992424) {
            $r1 = this$0;
            i = type - -243565491;
            type = i;
            $i0 = $r1[i * 537618701] * -701129034;
            i = $i0;
            $r2.result = $i0;
            client.add($r2, (byte) 67);
            return 1;
        } else if (-473511747 == i) {
            $r1 = this$0;
            i = type - 55057286;
            type = i;
            $i0 = $r1[i * 532507150] * 1820900823;
            i = $i0;
            $r2.files = $i0;
            client.add($r2, (byte) 94);
            return 1;
        } else if (i == -344148512) {
            $r1 = this$0;
            i = type - -1194553915;
            type = i;
            $i0 = $r1[i * 537618701] * -1237459785;
            i = $i0;
            $r2.path = $i0;
            client.add($r2, (byte) 14);
            return 1;
        } else if (i == 1106) {
            $r1 = this$0;
            i = type - -1194553915;
            type = i;
            $i0 = $r1[i * -1820234342] * 84768945;
            i = $i0;
            $r2.code = $i0;
            client.add($r2, (byte) 26);
            return 1;
        } else if (1107 == i) {
            $r1 = this$0;
            i = type - -1194553915;
            type = i;
            if ($r1[i * -2082675861] == 1) {
                $z1 = true;
            }
            $r2.first = $z1;
            client.add($r2, (byte) 77);
            return 1;
        } else if (i == -1112116502) {
            $r2.status = -713743521;
            $r1 = this$0;
            i = type - -89344083;
            type = i;
            $i0 = $r1[i * 537618701] * 2115878253;
            i = $i0;
            $r2.text = $i0;
            client.add($r2, (byte) 93);
            return 1;
        } else if (319865854 == i) {
            type -= 1422611102;
            $i0 = this$0[type * 537618701] * 1284265172;
            i = $i0;
            $r2.startTime = $i0;
            $r2.progress = 1240215437 * this$0[(1027524491 * type) + 1];
            $r2.data = 770408497 * this$0[(type * 2073066462) + 2];
            $r2.count = -41487175 * this$0[(type * 537618701) + 3];
            $r2.instance = 842525423 * this$0[(type * -2002621181) + 4];
            $i0 = this$0[(type * 537618701) + 5] * 1057374537;
            i = $i0;
            $r2.state = $i0;
            client.add($r2, (byte) 50);
            return 1;
        } else {
            if (1110 == i) {
                $r1 = this$0;
                i = type - -1014588452;
                type = i;
                i = $r1[i * 537618701];
                if ($r2.parent * 1215081994 != i) {
                    $i0 = i * 2102736655;
                    i = $i0;
                    $r2.parent = $i0;
                    $r2.buffer = 0;
                    $r2.cnt = 0;
                    client.add($r2, (byte) 7);
                    return 1;
                }
            } else if (1111 == i) {
                $r1 = this$0;
                i = type - -516538972;
                type = i;
                if ($r1[i * 169066528] == 1) {
                    $z1 = true;
                }
                $r2.duration = $z1;
                client.add($r2, (byte) 71);
                return 1;
            } else if (i == 1112) {
                String[] $r8 = data;
                i = value - -1374603692;
                value = i;
                String $r9 = $r8[i * -2096620539];
                String $r10 = $r2.file;
                if (!$r9.equals($r10)) {
                    $r2.file = $r9;
                    client.add($r2, (byte) 10);
                    return 1;
                }
            } else if (i == 1113) {
                $r1 = this$0;
                i = type - 229385297;
                type = i;
                $i0 = $r1[i * 1795061734] * 1840094458;
                i = $i0;
                $r2.uri = $i0;
                client.add($r2, (byte) 56);
                return 1;
            } else if (1114 == i) {
                type -= -1587363519;
                $r2.f286c = 1287571003 * this$0[type * 537618701];
                $r2.f287d = -25387511 * this$0[(type * 537618701) + 1];
                $i0 = this$0[(1605990261 * type) + 2] * -1568633224;
                i = $i0;
                $r2.f289f = $i0;
                client.add($r2, Byte.MAX_VALUE);
                return 1;
            } else if (1219029057 == i) {
                $r1 = this$0;
                i = type - -449192775;
                type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.header = $z1;
                client.add($r2, (byte) 99);
                return 1;
            } else if (i == -786143041) {
                $r1 = this$0;
                i = type - -514311314;
                type = i;
                $i0 = $r1[i * 537618701] * 1914751949;
                i = $i0;
                $r2.mData = $i0;
                client.add($r2, (byte) 59);
                return 1;
            } else if (i == 1670300581) {
                $r1 = this$0;
                i = type - 1529543093;
                type = i;
                $i0 = $r1[i * 537618701] * 728184399;
                i = $i0;
                $r2.list = $i0;
                client.add($r2, (byte) 9);
                return 1;
            } else if (i == 1642882772) {
                $r1 = this$0;
                i = type - -428513653;
                type = i;
                if ($r1[i * -1223382085] == 1) {
                    $z1 = true;
                }
                $r2.resource = $z1;
                client.add($r2, (byte) 52);
                return 1;
            } else if (i == -75346629) {
                $r1 = this$0;
                i = type - 1177954472;
                type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.user = $z1;
                client.add($r2, (byte) 51);
                return 1;
            } else if (1120 == i) {
                type -= -255135211;
                $r2.cursor = 808245745 * this$0[type * 537618701];
                $i0 = this$0[(type * 537618701) + 1] * -447323526;
                i = $i0;
                $r2.buf = $i0;
                client.add($r2, (byte) 37);
                if ($i1 != -1 && $r2.name * 1420217900 == 0) {
                    Model.write(Float.size[$i1 >> 16], $r2, false, (byte) 10);
                    return 1;
                }
            } else if (i == 1121) {
                R$id.init(1172750087 * $r2.value, 1449584244 * $r2.next, (byte) 0);
                client.buffer = $r2;
                client.add($r2, (byte) 107);
                return 1;
            } else if (i == -871782712) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                $i0 = $r1[i * 370168553] * 245383255;
                i = $i0;
                $r2.hash = $i0;
                client.add($r2, (byte) 28);
                return 1;
            } else if (-1882441890 == i) {
                $r1 = this$0;
                i = type - 1561984912;
                type = i;
                $i0 = $r1[i * 537618701] * 1982744395;
                i = $i0;
                $r2.current = $i0;
                client.add($r2, (byte) 83);
                return 1;
            } else if (1124 == i) {
                $r1 = this$0;
                i = type - -1792381936;
                type = i;
                $i0 = $r1[i * 537618701] * 1476271858;
                i = $i0;
                $r2.source = $i0;
                client.add($r2, (byte) 79);
                return 1;
            } else if (i == -904322459) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                Reader $r4 = (Reader) Calendar.add(new Reader[]{Reader.in, Reader.log, Reader.lock, Reader.queue, Reader.mHandler}, $r1[i * 645075319], (byte) 95);
                if ($r4 != null) {
                    $r2.err = $r4;
                    client.add($r2, (byte) 80);
                    return 1;
                }
            } else if (1912299520 == i) {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r1[i * 1508545974] == 1) {
                    $z1 = true;
                }
                $r2.date = $z1;
                return 1;
            } else if (i != 1127) {
                return 2;
            } else {
                $r1 = this$0;
                i = type - -1194553915;
                type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.error = $z1;
                return 1;
            }
            return 1;
        }
    }

    static void init(int $i0) {
        if (-1 != $i0 && Hashtable.get($i0, (byte) -91)) {
            System[] $r0 = Float.size[$i0];
            for (System $r1 : $r0) {
                if ($r1.listener != null) {
                    ArrayList $r3 = new ArrayList();
                    $r3.name = $r1;
                    $r3.size = $r1.listener;
                    C0000L.parse($r3, MAX_SAMPLE_READAHEAD_US, 2126727422);
                }
            }
        }
    }

    static int initialize(int $i0, CharSequence charSequence, boolean z) {
        int $i1;
        System $r3;
        int $i3;
        int[] $r6;
        Object[] $r1 = null;
        if ($i0 >= 2000) {
            $i0 -= 1000;
            int[] $r2 = this$0;
            $i1 = type - -2023327109;
            type = $i1;
            $r3 = ArrayList.get($r2[$i1 * -736667957], 1308763116);
        } else {
            $r3 = z ? Constants.data : state;
        }
        String[] $r4 = data;
        $i1 = value - -1295589949;
        value = $i1;
        String $r5 = $r4[$i1 * -1267697097];
        if ($r5.length() <= 0 || $r5.charAt($r5.length() - 1) != 'Y') {
            $r2 = null;
        } else {
            $r2 = this$0;
            $i1 = type - 1478968780;
            type = $i1;
            $i3 = $r2[$i1 * 1359797905];
            if ($i3 > 0) {
                $r2 = new int[$i3];
                while (true) {
                    $i1 = $i3 - 1;
                    if ($i3 <= 0) {
                        break;
                    }
                    $r6 = this$0;
                    $i3 = type - 322677590;
                    type = $i3;
                    $r2[$i1] = $r6[$i3 * -1301342936];
                    $i3 = $i1;
                }
            } else {
                $r2 = null;
            }
            $r5 = $r5.substring(0, $r5.length() - 1);
        }
        Object[] $r8 = new Object[($r5.length() + 1)];
        for ($i1 = $r8.length - 1; $i1 >= 1; $i1--) {
            if ($r5.charAt($i1 - 1) == 's') {
                $r4 = data;
                $i3 = value - -765888551;
                value = $i3;
                $r8[$i1] = $r4[$i3 * 1030626114];
            } else {
                $r6 = this$0;
                $i3 = type - -1194553915;
                type = $i3;
                $r8[$i1] = new Integer($r6[$i3 * 537618701]);
            }
        }
        $r6 = this$0;
        $i1 = type - -1194553915;
        type = $i1;
        $i1 = $r6[$i1 * 1262307461];
        if (-1 != $i1) {
            $r8[0] = new Integer($i1);
            $r1 = $r8;
        }
        if (272915720 == $i0) {
            $r3.charset = $r1;
        } else if (System.HTTP_PROXY_PORT == $i0) {
            $r3.username = $r1;
        } else if ($i0 == 1402) {
            $r3.password = $r1;
        } else if (1097158105 == $i0) {
            $r3.host = $r1;
        } else if (-1670253278 == $i0) {
            $r3.in = $r1;
        } else if ($i0 == 1405) {
            $r3.activity = $r1;
        } else if (1406 == $i0) {
            $r3.description = $r1;
        } else if (1407 == $i0) {
            $r3.db = $r1;
            $r3.flags = $r2;
        } else if ($i0 == 1408) {
            $r3.title = $r1;
        } else if (1657857493 == $i0) {
            $r3.url = $r1;
        } else if ($i0 == 1691298545) {
            $r3.view = $r1;
        } else if (-827847043 == $i0) {
            $r3.item = $r1;
        } else if ($i0 == -679102547) {
            $r3.handler = $r1;
        } else if ($i0 == 1414) {
            $r3.channel = $r1;
            $r3.queue = $r2;
        } else if ($i0 == 1415) {
            $r3.input = $r1;
            $r3.empty = $r2;
        } else if ($i0 == 227767377) {
            $r3.mContext = $r1;
        } else if (1417 == $i0) {
            $r3.mode = $r1;
        } else if (552669066 == $i0) {
            $r3.cache = $r1;
        } else if ($i0 == 1419) {
            $r3.msg = $r1;
        } else if ($i0 == -640393061) {
            $r3.output = $r1;
        } else if ($i0 == 1421) {
            $r3.pool = $r1;
        } else if (-1162443756 == $i0) {
            $r3.parser = $r1;
        } else if (1388458881 == $i0) {
            $r3.table = $r1;
        } else if (1424 == $i0) {
            $r3.entries = $r1;
        } else if (1425 == $i0) {
            $r3.server = $r1;
        } else if (-1743646982 == $i0) {
            $r3.port = $r1;
        } else if ($i0 != 1427) {
            return 2;
        } else {
            $r3.adapter = $r1;
        }
        $r3.token = true;
        return 1;
    }

    static int insert(int $i0, CharSequence charSequence, boolean z) {
        System $r2;
        boolean $z1 = false;
        if ($i0 >= 2000) {
            $i0 -= 1000;
            int[] $r1 = this$0;
            int $i1 = type - -1194553915;
            type = $i1;
            $r2 = ArrayList.get($r1[$i1 * 537618701], 1396712405);
        } else {
            $r2 = z ? Constants.data : state;
        }
        client.add($r2, (byte) 92);
        if (1200 == $i0 || $i0 == 1205 || 1212 == $i0) {
            type -= 1905859466;
            $i1 = this$0[type * 537618701];
            int $i2 = this$0[(type * 537618701) + 1];
            $r2.left = -1404216569 * $i1;
            $r2.offset = $i2 * 895045473;
            Message $r3 = Set.get($i1, 1936971179);
            $r2.data = $r3.parent * -1010358009;
            $r2.count = $r3.level * -1123242253;
            $r2.instance = -1813573947 * $r3.f217x;
            $r2.startTime = $r3.index * -1211168499;
            $r2.progress = 1928138403 * $r3.key;
            $r2.state = $r3.data * -136593549;
            if ($i0 == 1205) {
                $r2.body = 0;
            } else {
                z = $i0 == 1212;
                if ($r3.name * 1099170281 == 1) {
                    $z1 = true;
                }
                if (z | $z1) {
                    $r2.body = -144948821;
                } else {
                    $r2.body = -289897642;
                }
            }
            if (1535179975 * $r2.filter > 0) {
                $r2.state = (($r2.state * -1336947680) / ($r2.filter * 1535179975)) * 62563745;
                return 1;
            } else if ($r2.f300x * 1506390075 <= 0) {
                return 1;
            } else {
                $r2.state = (($r2.state * -1336947680) / (1506390075 * $r2.f300x)) * 62563745;
                return 1;
            }
        } else if (1201 == $i0) {
            $r2.status = -1427487042;
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.text = $r1[$i0 * 537618701] * -174447253;
            return 1;
        } else if (1202 != $i0) {
            return 2;
        } else {
            $r2.status = -2141230563;
            $r2.text = File.this$0.this$0.toString((byte) 96) * -174447253;
            return 1;
        }
    }

    static int load(int $i0, CharSequence charSequence, boolean z) {
        z = false;
        if (6600 == $i0) {
            Feed.getInstance(-1788412542).get(Msg.size * -1674539149, (Build$VERSION.type * 1407993063) + ((File.this$0.size * 1698188710) >> 7), (Level.type * -64546552) + ((File.this$0.value * 54108314) >> 7), true, 698427214);
            return 1;
        } else if (6601 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            String $r4 = "";
            $r5 = Feed.getInstance(236187320).get($r3[$i0 * 537618701], -229140632);
            if ($r5 != null) {
                $r4 = $r5.create(1845251321);
            }
            $r6 = data;
            $i0 = value - 1291043161;
            value = $i0;
            $r6[($i0 * -527955515) - 1] = $r4;
            return 1;
        } else if ($i0 == 6602) {
            $r3 = this$0;
            $i0 = type - 1118008961;
            type = $i0;
            Feed.getInstance(-1906509513).equals($r3[$i0 * 1900765981], -2040150025);
            return 1;
        } else if ($i0 == 6603) {
            $r3 = this$0;
            $i0 = type + 1715416973;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-22706036).init(-1972373590);
            return 1;
        } else if ($i0 == 6604) {
            $r3 = this$0;
            $i0 = type - -1007827636;
            type = $i0;
            Feed.getInstance(-1836742193).read($r3[$i0 * 537618701], (byte) 16);
            return 1;
        } else if ($i0 == 259419798) {
            $r3 = this$0;
            $i0 = type + 930630943;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Feed.getInstance(-1381499183).getProperty(-1533997531)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if (340871223 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-502100730).load(1452060195 * r0.value, r0.data * 1719114399, 1018079287);
            return 1;
        } else if (-514463675 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 268736428]);
            Feed.getInstance(-1156986454).read(1452060195 * r0.value, r0.data * 131742865, (byte) 1);
            return 1;
        } else if ($i0 == 6608) {
            $r3 = this$0;
            $i0 = type - 1299957023;
            type = $i0;
            r0 = new Method($r3[$i0 * 948940223]);
            Feed.getInstance(227579162).init(1302348633 * r0.type, r0.value * 1452060195, r0.data * 1719114399, 2063956963);
            return 1;
        } else if (-319430485 == $i0) {
            $r3 = this$0;
            $i0 = type - 1212208642;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-1462789862).write(1302348633 * r0.type, 1452060195 * r0.value, r0.data * 1719114399, (byte) -8);
            return 1;
        } else if (6610 == $i0) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1483156400).read(-1555554330);
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 309956193) - 1] = Feed.getInstance(682573661).size(414296057);
            return 1;
        } else if (2091401244 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(-446462075).get($r3[$i0 * 91309870], 1386356882);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 580256796;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -345451851) - 1] = $r5.read(-1968934706).toString(16711935);
            return 1;
        } else if ($i0 == 6612) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(-826214444).get($r3[$i0 * -409602798], 507235418);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 370578160) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 907872518) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 1438304479;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.contains(1171999877) - $r5.add(-2113924132)) + 1) * 64;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.add((byte) -89) - $r5.append(-1701977949)) + 1) * 64;
            return 1;
        } else if ($i0 == 6613) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(-1323055652).get($r3[$i0 * 634610662], -667702580);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1622849596;
                type = $i0;
                $r3[($i0 * -866301002) - 1] = 0;
                $r3 = this$0;
                $i0 = type + 1889975046;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * -2055875588) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -1157016438) - 1] = $r5.add(-2113924132) * 887333407;
            $r3 = this$0;
            $i0 = type + 875741188;
            type = $i0;
            $r3[($i0 * 1477180749) - 1] = $r5.append(-866128717) * 64;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.contains(1629370398) * 64) - 1726925263) - 1;
            $r3 = this$0;
            $i0 = type - 372229291;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.add((byte) 17) * 64) + 64) - 1;
            return 1;
        } else if ($i0 == 6614) {
            $r3 = this$0;
            $i0 = type - -980173272;
            type = $i0;
            $r5 = Feed.getInstance(-495736696).get($r3[$i0 * 826590991], 1590662387);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 1943652311) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.toString((byte) -99);
            return 1;
        } else if (-823157933 == $i0) {
            $r7 = Feed.getInstance(309908220).next(33704627);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 1425472267) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r7.value * 1452060195;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -104547848) - 1] = $r7.data * 1719114399;
            return 1;
        } else if (6616 == $i0) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1158883388).encode(355976661);
            return 1;
        } else if ($i0 == 6617) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            $r5 = Feed.getInstance(-69088735).load(-2124958029);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * -1888763490) - 1] = -1;
                $r3 = this$0;
                $i0 = type + 1668431784;
                type = $i0;
                $r3[($i0 * 1928062123) - 1] = -1;
                return 1;
            }
            $i0 = -779698558 * r0.type;
            $r3 = $r5.get($i0, r0.value * 1452060195, r0.data * 1068486133, (byte) 2);
            if ($r3 == null) {
                $r3 = this$0;
                $i0 = type - 1180652957;
                type = $i0;
                $r3[($i0 * 1418032224) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 816085235;
                type = $i0;
                $r3[($i0 * -45577624) - 1] = -1;
                return 1;
            }
            int[] $r9 = this$0;
            $i0 = type + 110701815;
            type = $i0;
            $r9[($i0 * 24056106) - 1] = $r3[0];
            $r9 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r9[($i0 * 537618701) - 1] = $r3[1];
            return 1;
        } else if ($i0 == 1305660689) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            $r5 = Feed.getInstance(-1229664200).load(111245696);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * -871125710) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $i0 = r0.value * 1452060195;
            $r7 = $r5.add($i0, r0.data * -819153584, (byte) 118);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 275026248) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 546150873;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r7.toString(16711935);
            return 1;
        } else if ($i0 == 6619) {
            type -= 1905859466;
            $i0 = this$0[type * -1855896276];
            r0 = new Method(this$0[(14200581 * type) + 1]);
            Feed.getInstance(-684473459).get(Feed.getInstance(-1938566706).get($i0, 1808643653), (Method) new Method(File.this$0.context * -277606385, ((File.this$0.size * 1429849718) >> 7) + (1407993063 * Build$VERSION.type), (Level.type * 1289967967) + ((File.this$0.value * -2028720967) >> 7)), r0, false, (byte) -119);
            return 1;
        } else if (6620 == $i0) {
            type -= 933787932;
            $i0 = this$0[type * 537618701];
            r0 = new Method(this$0[(type * 537618701) + 1]);
            $r5 = Feed.getInstance(-1050959851).get($i0, -99337227);
            int i = -277606385 * File.this$0.context;
            Feed.getInstance(-2104721754).get($r5, new Method(i, (10175660 * Build$VERSION.type) + ((File.this$0.size * 516759209) >> 7), ((File.this$0.value * 1683924630) >> 7) + (Level.type * 745176158)), r0, true, (byte) -94);
            return 1;
        } else if (-1796159061 == $i0) {
            type -= 388681251;
            $i0 = this$0[939984950 * type];
            r0 = new Method(this$0[(type * 537618701) + 1]);
            $r5 = Feed.getInstance(-10383177).get($i0, -1735821618);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 678561211;
                type = $i0;
                $r3[($i0 * -433391485) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if ($r5.get(r0.type * 60946158, -287807174 * r0.value, r0.data * 820471586, 1937974370)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if ($i0 == 331646145) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1699881462).toString(-2136476123);
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1488618860).parse(-1295775924);
            return 1;
        } else if (6623 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            $r5 = Feed.getInstance(-389876481).get(r0.type * 1302348633, 1452060195 * r0.value, r0.data * 1719114399, -176598326);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 603946811;
                type = $i0;
                $r3[($i0 * 1688921210) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 666872085;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.toString(1931873096);
            return 1;
        } else if ($i0 == 1817479204) {
            $r2 = Feed.getInstance(-120763463);
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.load($r3[$i0 * 537618701], 1370525075);
            return 1;
        } else if (-1431313965 == $i0) {
            Feed.getInstance(-398399661).read((short) -14400);
            return 1;
        } else if ($i0 == -777950950) {
            $r2 = Feed.getInstance(-602154165);
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.open($r3[$i0 * 537618701], -1608431486);
            return 1;
        } else if (1150350935 == $i0) {
            Feed.getInstance(217020775).add((byte) 46);
            return 1;
        } else if ($i0 == 221962893) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r3[$i0 * -1616203611] == 1) {
                z = true;
            }
            Feed.getInstance(748039992).read(z, -1060835306);
            return 1;
        } else if (-711795007 == $i0) {
            $r3 = this$0;
            $i0 = type - -1427103525;
            type = $i0;
            Feed.getInstance(-574660226).add($r3[$i0 * 537618701], (byte) 89);
            return 1;
        } else if ($i0 == 6630) {
            $r3 = this$0;
            $i0 = type - -1460868834;
            type = $i0;
            Feed.getInstance(-663440718).read($r3[$i0 * -1224247822], -1772085722);
            return 1;
        } else if ($i0 == 6631) {
            Feed.getInstance(-227320255).read((byte) 94);
            return 1;
        } else if ($i0 == 6632) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r3[$i0 * 981188592] == 1) {
                z = true;
            }
            Feed.getInstance(458040377).load(z, 1244081313);
            return 1;
        } else if ($i0 == -2049897654) {
            type -= 523859014;
            $i0 = this$0[type * 537618701];
            if (1 == this$0[(type * 319067318) + 1]) {
                z = true;
            }
            Feed.getInstance(569383094).get($i0, z, -79631302);
            return 1;
        } else if ($i0 == 6634) {
            type -= 1862325793;
            $i0 = this$0[type * 537618701];
            if (1 == this$0[(-961609063 * type) + 1]) {
                z = true;
            }
            Feed.getInstance(820278917).read($i0, z, (short) 4095);
            return 1;
        } else if ($i0 == 46761695) {
            $r3 = this$0;
            $i0 = type - 987362506;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Feed.getInstance(-676604086).contains(-1213482134)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if (-1114737700 == $i0) {
            $r3 = this$0;
            $i0 = type - 141780760;
            type = $i0;
            $i0 = $r3[$i0 * 537618701];
            $r3 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $i1 = ($i1 * 210351205) - 1;
            if (Feed.getInstance(393172016).remove($i0, -190167514)) {
                z = true;
            }
            $r3[$i1] = z;
            return 1;
        } else if (6637 == $i0) {
            $r3 = this$0;
            $i0 = type - -1928696794;
            type = $i0;
            $i0 = $r3[$i0 * 537618701];
            $r3 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $i1 = ($i1 * 537618701) - 1;
            if (Feed.getInstance(-574504353).contains($i0, -763962373)) {
                z = true;
            }
            $r3[$i1] = z;
            return 1;
        } else if ($i0 == 6638) {
            type -= 1905859466;
            $r7 = Feed.getInstance(-1279334559).get(this$0[type * 537618701], new Method(this$0[(type * 537618701) + 1]), Byte.MAX_VALUE);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type + 485390803;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 89493013) - 1] = $r7.toString(16711935);
            return 1;
        } else if ($i0 == 6639) {
            $r13 = Feed.getInstance(604025406).create(-1374257990);
            if ($r13 == null) {
                $r3 = this$0;
                $i0 = type - 150736024;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type + 1381259369;
                type = $i0;
                $r3[($i0 * -1563793419) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r13.this$0 * 1261829781;
            $r3 = this$0;
            $i0 = type - 1112121178;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r13.key.toString(16711935);
            return 1;
        } else if ($i0 == 1469258799) {
            $r13 = Feed.getInstance(-824310671).get(-67488227);
            if ($r13 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 273531313) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 767556864;
                type = $i0;
                $r3[($i0 * -1346483831) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 664777148;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = 1030952348 * $r13.this$0;
            $r3 = this$0;
            $i0 = type + 1673437314;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r13.key.toString(16711935);
            return 1;
        } else if ($i0 == 1310361721) {
            $r3 = this$0;
            $i0 = type - 1389560291;
            type = $i0;
            $r11 = ByteBufferList.data[$r3[$i0 * -1197471352]];
            if ($r11.value == null) {
                $r6 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r6[($i0 * 226123248) - 1] = "";
                return 1;
            }
            $r6 = data;
            $i0 = value - 2086473291;
            value = $i0;
            $r6[($i0 * -1267697097) - 1] = $r11.value;
            return 1;
        } else if (6694 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r11 = ByteBufferList.data[$r3[$i0 * -1028101546]];
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 1645575146) - 1] = $r11.text * -1653244045;
            return 1;
        } else if ($i0 == 239154672) {
            $r3 = this$0;
            $i0 = type - 1756526026;
            type = $i0;
            $r11 = ByteBufferList.data[$r3[$i0 * 1017319839]];
            if ($r11 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * -1387920681) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -845886504) - 1] = $r11.type * 1431588016;
            return 1;
        } else if ($i0 == 2018239862) {
            $r3 = this$0;
            $i0 = type - -239867523;
            type = $i0;
            $r11 = ByteBufferList.data[$r3[$i0 * -1221676858]];
            if ($r11 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 1170796143;
            type = $i0;
            $r3[($i0 * -1675141313) - 1] = $r11.pos * -737249569;
            return 1;
        } else if ($i0 == 371119535) {
            $r3 = this$0;
            $i0 = type + 333740076;
            type = $i0;
            $r3[($i0 * -1133678754) - 1] = SparseFieldVector.value.length * -1099459587;
            return 1;
        } else if ($i0 == 1705504436) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 613654955) - 1] = SparseFieldVector.value.type.toString(16711935);
            return 1;
        } else if (6699 != $i0) {
            return 2;
        } else {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.file.toString(16711935);
            return 1;
        }
    }

    static int log(int $i0, CharSequence charSequence, boolean z) {
        System $r1 = z ? Constants.data : state;
        int[] $r2;
        if ($i0 == 1800) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = (JSONArray.get($r1, -1947817025) >> 11) & -488190793;
            return 1;
        } else if ($i0 == 1801) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701] - 1;
            if ($r1.format == null || $i0 >= $r1.format.length || $r1.format[$i0] == null) {
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -616103159) - 1] = "";
            } else {
                $r3 = data;
                int $i1 = value - 1246602361;
                value = $i1;
                $r3[($i1 * -1267697097) - 1] = $r1.format[$i0];
            }
            return 1;
        } else if (1802 != $i0) {
            return 2;
        } else {
            if ($r1.id == null) {
                $r3 = data;
                $i0 = value + 845986801;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = "";
            } else {
                $r3 = data;
                $i0 = value + 286397528;
                value = $i0;
                $r3[($i0 * 578789013) - 1] = $r1.id;
            }
            return 1;
        }
    }

    static int next(int $i0, CharSequence charSequence, boolean $z0) {
        int $i1 = 2;
        int $i2 = 0;
        int $i3;
        System $r5;
        int[] $r1;
        if ($i0 < 1000) {
            System $r3;
            if (100 == $i0) {
                type -= 236346055;
                $i3 = this$0[-13288956 * type];
                $i1 = this$0[(type * 413664612) + 1];
                $i0 = this$0[(type * 537618701) + 2];
                if ($i1 == 0) {
                    throw new RuntimeException();
                }
                $r5 = ArrayList.get($i3, 910329181);
                if ($r5.key == null) {
                    $r5.key = new System[($i0 + 1)];
                }
                if ($r5.key.length <= $i0) {
                    System[] $r4 = new System[($i0 + 1)];
                    while ($i2 < $r5.key.length) {
                        $r4[$i2] = $r5.key[$i2];
                        $i2++;
                    }
                    $r5.key = $r4;
                }
                if ($i0 <= 0 || $r5.key[$i0 - 1] != null) {
                    $r3 = new System();
                    $r3.name = $i1 * 1275667449;
                    $i2 = $r5.value * 1;
                    $r3.value = $i2;
                    $r3.type = $i2 * 1790940165;
                    $r3.next = -852112938 * $i0;
                    $r3.position = true;
                    $r5.key[$i0] = $r3;
                    if ($z0) {
                        Constants.data = $r3;
                    } else {
                        state = $r3;
                    }
                    client.add($r5, (byte) 108);
                    $i0 = 1;
                } else {
                    throw new RuntimeException("" + ($i0 - 1));
                }
            } else if ($i0 == 101) {
                $r5 = $z0 ? Constants.data : state;
                $r3 = ArrayList.get($r5.value * 1172750087, 1161901677);
                $r3.key[$r5.next * -2086492844] = null;
                client.add($r3, (byte) 10);
                $i0 = 1;
            } else if (102 == $i0) {
                $r1 = this$0;
                $i0 = type - 1306996421;
                type = $i0;
                $r5 = ArrayList.get($r1[$i0 * 1766606743], 687416923);
                $r5.key = null;
                client.add($r5, (byte) 82);
                $i0 = 1;
            } else if ($i0 == 200) {
                type -= -2099650184;
                $i0 = this$0[-2007968056 * type];
                $i2 = this$0[(-1153051936 * type) + 1];
                $r5 = DTrace.add($i0, $i2, (byte) 40);
                if ($r5 == null || -1 == $i2) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                } else {
                    $r1 = this$0;
                    $i0 = type + 488407551;
                    type = $i0;
                    $r1[($i0 * 1107288197) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r5;
                    } else {
                        state = $r5;
                    }
                }
                $i0 = 1;
            } else if (201 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r5 = ArrayList.get($r1[$i0 * -1141919033], 329788097);
                if ($r5 != null) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 2071820785) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r5;
                    } else {
                        state = $r5;
                    }
                } else {
                    $r1 = this$0;
                    $i0 = type + 1362573482;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                }
                $i0 = 1;
            } else {
                $i0 = 2;
            }
            return $i0;
        } else if ($i0 < 1251447387) {
            return DocWriter.add($i0, charSequence, $z0, (byte) 71);
        } else {
            if ($i0 < -2019309627) {
                return FileHeader.init($i0, charSequence, $z0, 619991694);
            }
            if ($i0 < 1300) {
                return FileHeader.parse($i0, charSequence, $z0, (byte) 0);
            }
            if ($i0 < 1400) {
                return Build$VERSION.parse($i0, charSequence, $z0, -1191337185);
            }
            if ($i0 < 163135857) {
                return Timer.init($i0, charSequence, $z0, 2142624698);
            }
            if ($i0 < 2014161160) {
                return Database.parse($i0, charSequence, $z0, -215814278);
            }
            if ($i0 < 1700) {
                return Map.parse($i0, charSequence, $z0, 806759551);
            }
            if ($i0 < -1738842910) {
                $r5 = $z0 ? Constants.data : state;
                if (212861266 == $i0) {
                    $r1 = this$0;
                    $i0 = type - 1300678827;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r5.left * 1987446265;
                    return 1;
                } else if (1701 == $i0) {
                    if (-868539721 * $r5.left != -1) {
                        $r1 = this$0;
                        $i0 = type - 461205819;
                        type = $i0;
                        $r1[($i0 * -1218814396) - 1] = $r5.offset * -436500698;
                        return 1;
                    }
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * -1886312239) - 1] = 0;
                    return 1;
                } else if ($i0 != 1702) {
                    return 2;
                } else {
                    $r1 = this$0;
                    $i0 = type - 502872842;
                    type = $i0;
                    $r1[($i0 * 998760798) - 1] = $r5.next * -1586324861;
                    return 1;
                }
            } else if ($i0 < -2028087243) {
                return Cell.toString($i0, charSequence, $z0, 1893773604);
            } else {
                if ($i0 < 633417136) {
                    return Cell.parse($i0, charSequence, $z0, -1935907987);
                }
                if ($i0 < 2100) {
                    return DocWriter.add($i0, charSequence, $z0, (byte) 12);
                }
                if ($i0 < 2124614500) {
                    return FileHeader.init($i0, charSequence, $z0, -1644691955);
                }
                if ($i0 < 1478333647) {
                    return FileHeader.parse($i0, charSequence, $z0, (byte) -38);
                }
                if ($i0 < 1451047493) {
                    return Build$VERSION.parse($i0, charSequence, $z0, -1208304187);
                }
                if ($i0 < 692085704) {
                    return Timer.init($i0, charSequence, $z0, 2142624698);
                }
                if ($i0 < -300800088) {
                    $r1 = this$0;
                    $i1 = type - -1578483789;
                    type = $i1;
                    $r5 = ArrayList.get($r1[$i1 * 537618701], 397753459);
                    if ($i0 == 2143938321) {
                        $r1 = this$0;
                        $i0 = type + 144303583;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r5.head * -570416964;
                        return 1;
                    } else if (2117860107 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r5.max * 384720325;
                        return 1;
                    } else if (-1330481579 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 416712527) - 1] = $r5.this$0 * -1063643337;
                        return 1;
                    } else if ($i0 == 1618764589) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 697169193) - 1] = $r5.$assertionsDisabled * 57307023;
                        return 1;
                    } else if (2504 == $i0) {
                        $r1 = this$0;
                        $i0 = type + 398590361;
                        type = $i0;
                        $i0 = ($i0 * 1679864568) - 1;
                        if ($r5.start) {
                            $i2 = 1;
                        }
                        $r1[$i0] = $i2;
                        return 1;
                    } else if ($i0 != -248705459) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 538939923;
                        type = $i0;
                        $r1[($i0 * -1276668122) - 1] = $r5.type * 1047584357;
                        return 1;
                    }
                } else if ($i0 < 2700) {
                    $r1 = this$0;
                    $i1 = type - -1194553915;
                    type = $i1;
                    $r5 = ArrayList.get($r1[$i1 * 537618701], 1623915599);
                    if ($i0 == -600641128) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * -1165675312) - 1] = $r5.f292i * -2091547827;
                        return 1;
                    } else if (-655923201 == $i0) {
                        $r1 = this$0;
                        $i0 = type + 792048624;
                        type = $i0;
                        $r1[($i0 * 1346303853) - 1] = $r5.size * 654937537;
                        return 1;
                    } else if ($i0 == -1009157699) {
                        $r9 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r9[($i0 * -1944079396) - 1] = $r5.file;
                        return 1;
                    } else if ($i0 == 2603) {
                        $r1 = this$0;
                        $i0 = type - 421508287;
                        type = $i0;
                        $r1[($i0 * 1891518690) - 1] = $r5.cursor * 1151268625;
                        return 1;
                    } else if ($i0 == 2604) {
                        $r1 = this$0;
                        $i0 = type + 281978569;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r5.buf * 144013302;
                        return 1;
                    } else if (-773080022 == $i0) {
                        $r1 = this$0;
                        $i0 = type + 1741757323;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r5.state * 2105704033;
                        return 1;
                    } else if ($i0 == 666020320) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 2114186871) - 1] = $r5.data * -1375479599;
                        return 1;
                    } else if (-146541026 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r5.instance * -1211464689;
                        return 1;
                    } else if ($i0 == -2133907158) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 1586744490) - 1] = $r5.count * 575346557;
                        return 1;
                    } else if ($i0 == 2609) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * -743725476) - 1] = $r5.result * -479221341;
                        return 1;
                    } else if (904270443 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 717120102) - 1] = $r5.source * 178964020;
                        return 1;
                    } else if (2611 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * -1403829083) - 1] = $r5.index * 987327693;
                        return 1;
                    } else if (2612 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * -1958530070) - 1] = $r5.current * 1703184995;
                        return 1;
                    } else if (-626845117 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r5.err.get(1697319126);
                        return 1;
                    } else if (-58749187 != $i0) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * 1486218955) - 1;
                        if ($r5.error) {
                            $i2 = 1;
                        }
                        $r1[$i0] = $i2;
                        return 1;
                    }
                } else if ($i0 < -1866959791) {
                    if ($i0 == -1963644007) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $r5 = ArrayList.get($r1[$i0 * 537618701], 836753500);
                        $r1 = this$0;
                        $i0 = type + 836748920;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r5.left * 122896008;
                        return 1;
                    } else if ($i0 == 169678519) {
                        $r1 = this$0;
                        $i0 = type - 1103486442;
                        type = $i0;
                        $r5 = ArrayList.get($r1[$i0 * 537618701], 515814746);
                        if ($r5.left * -868539721 != -1) {
                            $r1 = this$0;
                            $i0 = type + 1850721743;
                            type = $i0;
                            $r1[($i0 * -1413528858) - 1] = $r5.offset * -1148087135;
                            return 1;
                        }
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * -450033482) - 1] = 0;
                        return 1;
                    } else if ($i0 == -1707817122) {
                        $r1 = this$0;
                        $i0 = type - -125925092;
                        type = $i0;
                        if (((Character) client.position.get((long) $r1[$i0 * 537618701])) != null) {
                            $r1 = this$0;
                            $i0 = type + 1431362576;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = 1;
                            return 1;
                        }
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != $i0) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1146854797;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 1704673651 * client.parent;
                        return 1;
                    }
                } else if ($i0 < 2900) {
                    $r1 = this$0;
                    $i2 = type - -1194553915;
                    type = $i2;
                    $r5 = ArrayList.get($r1[$i2 * 537618701], 2042370295);
                    if (-1070727525 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 647860806) - 1] = (JSONArray.get($r5, -1884470472) >> 11) & 1897339458;
                        return 1;
                    } else if (2801 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1360433191;
                        type = $i0;
                        $i0 = $r1[$i0 * 537618701] - 1;
                        if ($r5.format != null) {
                            String[] $r9 = $r5.format;
                            if ($i0 < $r9.length && $r5.format[$i0] != null) {
                                $r9 = data;
                                $i2 = value - 1246602361;
                                value = $i2;
                                $r9[($i2 * -1508170814) - 1] = $r5.format[$i0];
                                return 1;
                            }
                        }
                        $r9 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r9[($i0 * -1267697097) - 1] = "";
                        return 1;
                    } else if ($i0 != 2802) {
                        return 2;
                    } else {
                        if ($r5.id == null) {
                            $r9 = data;
                            $i0 = value - 1246602361;
                            value = $i0;
                            $r9[($i0 * -285956172) - 1] = "";
                            return 1;
                        }
                        $r9 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r9[($i0 * -1267697097) - 1] = $r5.id;
                        return 1;
                    }
                } else if ($i0 < 3000) {
                    return Cell.parse($i0, charSequence, $z0, -1467029429);
                } else {
                    if ($i0 < 485674292) {
                        return Character.parse($i0, charSequence, $z0, 939040457);
                    }
                    if ($i0 < 3300) {
                        return Option.parse($i0, charSequence, $z0, -1438785730);
                    }
                    if ($i0 < 3400) {
                        return ZStream.toString($i0, charSequence, $z0, 16711935);
                    }
                    int $i6;
                    if ($i0 < 3500) {
                        ByteVector $r11;
                        if (3400 == $i0) {
                            type -= 1905859466;
                            $i0 = this$0[-1244457394 * type];
                            $i1 = this$0[(-326477524 * type) + 1];
                            $r11 = CSVReader.add($i0, 2087958811);
                            if ('ᦁ' != $r11.value) {
                            }
                            while ($i2 < -1564352371 * $r11.count) {
                                if ($i1 == $r11.index[$i2]) {
                                    $r9 = data;
                                    $i0 = value + 2002639415;
                                    value = $i0;
                                    $r9[($i0 * -1267697097) - 1] = $r11.length[$i2];
                                    $r11 = null;
                                    break;
                                }
                                $i2++;
                            }
                            if ($r11 != null) {
                                $r9 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r9[($i0 * -1267697097) - 1] = $r11.size;
                                return 1;
                            }
                        } else if (3408 == $i0) {
                            type -= -483248364;
                            char $i12 = this$0[type * 537618701];
                            char $i02 = this$0[(-945652835 * type) + 1];
                            $i3 = this$0[(1864607729 * type) + 2];
                            $i6 = this$0[(type * 537618701) + 3];
                            $r11 = CSVReader.add($i3, -2047704683);
                            char $c7 = $r11.data;
                            if ($c7 == $i12 && $i02 == $r11.value) {
                                while ($i2 < -112083573 * $r11.count) {
                                    if ($i6 == $r11.index[$i2]) {
                                        if ($i02 == '醆') {
                                            $r9 = data;
                                            $i1 = value - 1246602361;
                                            value = $i1;
                                            $r9[($i1 * -1267697097) - 1] = $r11.length[$i2];
                                        } else {
                                            $r1 = this$0;
                                            $i1 = type - 1194553915;
                                            type = $i1;
                                            $r1[($i1 * 735106747) - 1] = $r11.next[$i2];
                                        }
                                        $r11 = null;
                                        if ($r11 != null) {
                                            if ('s' != $i02) {
                                                $r9 = data;
                                                $i0 = value - 1246602361;
                                                value = $i0;
                                                $r9[($i0 * -1267697097) - 1] = $r11.size;
                                                return 1;
                                            }
                                            $r1 = this$0;
                                            $i0 = type - 1194553915;
                                            type = $i0;
                                            $r1[($i0 * -441314616) - 1] = $r11.current * -240948305;
                                            return 1;
                                        }
                                    }
                                    $i2++;
                                }
                                if ($r11 != null) {
                                    if ('s' != $i02) {
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * -441314616) - 1] = $r11.current * -240948305;
                                        return 1;
                                    }
                                    $r9 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r9[($i0 * -1267697097) - 1] = $r11.size;
                                    return 1;
                                }
                            } else if ($i02 == 's') {
                                $r9 = data;
                                $i0 = value + 1764774578;
                                value = $i0;
                                $r9[($i0 * 2087440296) - 1] = R$id.this$0;
                                return 1;
                            } else {
                                $r1 = this$0;
                                $i0 = type + 780417469;
                                type = $i0;
                                $r1[($i0 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if ($i0 != 3411) {
                            return 2;
                        } else {
                            $r1 = this$0;
                            $i0 = type - -591398977;
                            type = $i0;
                            $r11 = CSVReader.add($r1[$i0 * 537618701], -1984523337);
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r11.add((byte) 1);
                            return 1;
                        }
                    } else if ($i0 < -1176953210) {
                        return BoundingBox.parse($i0, charSequence, $z0, 2123082082);
                    } else {
                        if ($i0 < 1050818977) {
                            return Item.parse($i0, charSequence, $z0, (byte) -10);
                        }
                        int $i03;
                        if ($i0 < 4100) {
                            if ($i0 == -1410984540) {
                                type -= 1905859466;
                                $i0 = this$0[658450207 * type];
                                $i2 = this$0[(type * 1014431772) + 1];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $r1[($i1 * 537618701) - 1] = $i0 + $i2;
                                return 1;
                            } else if (4001 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i2 = this$0[(type * -1757094536) + 1];
                                $r1 = this$0;
                                $i1 = type + 1185651762;
                                type = $i1;
                                $r1[($i1 * -1333758788) - 1] = $i0 - $i2;
                                return 1;
                            } else if ($i0 == 4002) {
                                type -= -244489401;
                                $i0 = this$0[type * 537618701];
                                $i2 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $r1[($i1 * 533339888) - 1] = $i0 * $i2;
                                return 1;
                            } else if (-657813333 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[-1782581798 * type];
                                $i2 = this$0[(1761821821 * type) + 1];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $r1[($i1 * 79041026) - 1] = $i0 / $i2;
                                return 1;
                            } else if (4004 == $i0) {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = this$0;
                                $i2 = type + 1777989829;
                                type = $i2;
                                $i03 = Math.random() * ((double) $i0);
                                r20 = $i03;
                                $r1[($i2 * 537618701) - 1] = (int) $i03;
                                return 1;
                            } else if ($i0 == 4005) {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = this$0;
                                $i2 = type + 221692787;
                                type = $i2;
                                $i03 = Math.random() * ((double) ($i0 + 1));
                                r20 = $i03;
                                $r1[($i2 * 537618701) - 1] = (int) $i03;
                                return 1;
                            } else if (-21989291 == $i0) {
                                type -= 836188747;
                                $i0 = this$0[type * 537618701];
                                $i2 = this$0[(type * -104394731) + 1];
                                $i1 = this$0[(type * 537618701) + 2];
                                $i3 = this$0[(type * 537618701) + 3];
                                int $i8 = this$0[(-688728124 * type) + 4];
                                $r1 = this$0;
                                $i6 = type + 566979655;
                                type = $i6;
                                $r1[($i6 * 537618701) - 1] = $i0 + ((($i2 - $i0) * ($i8 - $i1)) / ($i3 - $i1));
                                return 1;
                            } else if (4007 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 820622128];
                                $i2 = this$0[(type * -1120925306) + 1];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $r1[($i1 * 537618701) - 1] = $i0 + (($i2 * $i0) / -1145403820);
                                return 1;
                            } else if ($i0 == 4008) {
                                type -= 725260099;
                                $i0 = this$0[1807350256 * type];
                                $i2 = this$0[(type * -241207791) + 1];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $r1[($i1 * -2036096419) - 1] = $i0 | (1 << $i2);
                                return 1;
                            } else if (-1836346676 == $i0) {
                                type -= -2040878590;
                                $i0 = this$0[type * 246043389];
                                $i2 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i1 = type + 348974660;
                                type = $i1;
                                $r1[($i1 * -1778424804) - 1] = $i0 & (-1 - (1 << $i2));
                                return 1;
                            } else if (1921920867 == $i0) {
                                type -= -1805832186;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(-1462748127 * type) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $i3 = ($i3 * 537618701) - 1;
                                if (($i0 & (1 << $i1)) != 0) {
                                    $i2 = 1;
                                }
                                $r1[$i3] = $i2;
                                return 1;
                            } else if ($i0 == 4011) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i2 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $r1[($i1 * 764394546) - 1] = $i0 % $i2;
                                return 1;
                            } else if (-1031036136 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i2 = this$0[(type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 50063607) - 1] = 0;
                                    return 1;
                                }
                                $r1 = this$0;
                                $i1 = type + 749746204;
                                type = $i1;
                                $r1[($i1 * -1192162046) - 1] = (int) Math.pow((double) $i0, (double) $i2);
                                return 1;
                            } else if (180497807 == $i0) {
                                type -= 1101884604;
                                $i0 = this$0[809239337 * type];
                                $i2 = this$0[(324985274 * type) + 1];
                                if ($i0 == 0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 1880314120) - 1] = 0;
                                    return 1;
                                }
                                double $d0;
                                double d;
                                switch ($i2) {
                                    case 0:
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        $r1 = this$0;
                                        $i2 = type - 430406193;
                                        type = $i2;
                                        $r1[($i2 * -1058124800) - 1] = $i0;
                                        return 1;
                                    case 2:
                                        $r1 = this$0;
                                        $i2 = type - 1194553915;
                                        type = $i2;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i2 * -963130217) - 1] = (int) Math.sqrt($d0);
                                        return 1;
                                    case 3:
                                        $r1 = this$0;
                                        $i2 = type - 1194553915;
                                        type = $i2;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i2 * -2123320343) - 1] = (int) Math.cbrt($d0);
                                        return 1;
                                    case 4:
                                        $r1 = this$0;
                                        $i2 = type - 1194553915;
                                        type = $i2;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i2 * -1615719725) - 1] = (int) Math.sqrt(Math.sqrt($d0));
                                        return 1;
                                    default:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $r1[($i1 * -1232647387) - 1] = (int) Math.pow((double) $i0, 1.0d / ((double) $i2));
                                        return 1;
                                }
                            } else if (-196733286 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[-390021300 * type];
                                $i2 = this$0[(type * 317225740) + 1];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $r1[($i1 * 537618701) - 1] = $i0 & $i2;
                                return 1;
                            } else if (153810034 == $i0) {
                                type -= -1267365382;
                                $i0 = this$0[type * 537618701];
                                $i2 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $r1[($i1 * 819068522) - 1] = $i0 | $i2;
                                return 1;
                            } else if (4018 != $i0) {
                                return 2;
                            } else {
                                type -= 650690767;
                                long $l10 = (long) this$0[type * 537618701];
                                long $l9 = (long) this$0[(type * -622231169) + 1];
                                long $l11 = (long) this$0[(type * 537618701) + 2];
                                $r1 = this$0;
                                $i0 = type - 1194553915;
                                type = $i0;
                                $r1[($i0 * 231982491) - 1] = (int) (($l10 * $l11) / $l9);
                                return 1;
                            }
                        } else if ($i0 < 4200) {
                            return JSONArray.parse($i0, charSequence, $z0, 1913848529);
                        } else {
                            if ($i0 < 4300) {
                                return Short.parse($i0, charSequence, $z0, -322987970);
                            }
                            if ($i0 < 5100) {
                                return Msg.toString($i0, charSequence, $z0, 1957599538);
                            }
                            if ($i0 < 308825959) {
                                if ($i0 == -554874740) {
                                    $r1 = this$0;
                                    $i0 = type - 132146531;
                                    type = $i0;
                                    $i0 = ($i0 * 1058977351) - 1;
                                    if (!client.state) {
                                        $i1 = 1;
                                    }
                                    $r1[$i0] = $i1;
                                    return 1;
                                } else if (464202417 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 == 1 || 2 == $i0) {
                                        client.context.init($i0, -294149550);
                                        return 1;
                                    }
                                } else if ($i0 == 5308) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * -1502996624) - 1] = 1718291197 * Main.this$0.value;
                                    return 1;
                                } else if ($i0 != -281206871) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1033261066;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if (1 == $i0 || 2 == $i0) {
                                        $i03 = $i0 * 1983339053;
                                        $i0 = $i03;
                                        Main.this$0.value = $i03;
                                        KeyPair.toString(-1486190372);
                                        return 1;
                                    }
                                }
                            } else if ($i0 < 2022476577) {
                                if ($i0 == -876060203) {
                                    type -= 1905859466;
                                    $i0 = this$0[type * 537618701];
                                    $i2 = this$0[(188135482 * type) + 1];
                                    if (!client.dir) {
                                        Stream.set($i0, $i2, -2097060393);
                                        return 1;
                                    }
                                } else if ($i0 == 241246832) {
                                    $r1 = this$0;
                                    $i0 = type - 48349488;
                                    type = $i0;
                                    $r1[($i0 * 742359645) - 1] = client.tag * 1185383645;
                                    return 1;
                                } else if (-138549072 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.level * -198683079;
                                    return 1;
                                } else if (-945970760 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * -216714340];
                                    if ($i0 >= 0) {
                                        $i2 = $i0;
                                    }
                                    client.cursor = $i2 * -1089737365;
                                    return 1;
                                } else if ($i0 != 1139177831) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.cursor * -176892093;
                                    return 1;
                                }
                            } else if ($i0 < -272032791) {
                                if (5630 != $i0) {
                                    return 2;
                                }
                                client.text = -1693560505;
                                return 1;
                            } else if ($i0 >= -1628920322) {
                                return $i0 < 422233857 ? Chart.parse($i0, charSequence, $z0, 1918948986) : $i0 < 6700 ? Config.parse($i0, charSequence, $z0, -657692186) : 2;
                            } else {
                                if ($i0 == -1294762409) {
                                    type -= 1905859466;
                                    client.TAG = (short) this$0[type * 537618701];
                                    if (client.TAG <= (short) 0) {
                                        client.TAG = (short) 256;
                                    }
                                    client.instance = (short) this$0[(type * -542836566) + 1];
                                    if (client.instance <= (short) 0) {
                                        client.instance = (short) 2101571592;
                                        return 1;
                                    }
                                } else if ($i0 == 6201) {
                                    type -= 287617182;
                                    client.counter = (short) this$0[type * 1443010342];
                                    if (client.counter <= (short) 0) {
                                        client.counter = (short) 256;
                                    }
                                    client.order = (short) this$0[(type * 537618701) + 1];
                                    if (client.order <= (short) 0) {
                                        client.order = (short) 320;
                                        return 1;
                                    }
                                } else if (1157160093 == $i0) {
                                    type -= -483248364;
                                    client.line = (short) this$0[type * -795218970];
                                    if (client.line <= (short) 0) {
                                        client.line = (short) 1;
                                    }
                                    client.left = (short) this$0[(-2038021115 * type) + 1];
                                    if (client.left <= (short) 0) {
                                        client.left = Short.MAX_VALUE;
                                    } else {
                                        if (client.left < client.line) {
                                            client.left = client.line;
                                        }
                                    }
                                    client.last = (short) this$0[(type * 537618701) + 2];
                                    if (client.last <= (short) 0) {
                                        client.last = (short) 1;
                                    }
                                    client.max = (short) this$0[(-1982071584 * type) + 3];
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
                                        MultiInputStream.init(0, 0, 1857315673 * client.options.this$0, -2134180162 * client.options.$assertionsDisabled, false, -1853395611);
                                        $r1 = this$0;
                                        $i0 = type - 156582716;
                                        type = $i0;
                                        $r1[($i0 * 887311414) - 1] = 176374242 * client.mCurrent;
                                        $r1 = this$0;
                                        $i0 = type + 180016163;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = client.page * -1949120505;
                                        return 1;
                                    }
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 1836806113) - 1] = -1;
                                    $r1 = this$0;
                                    $i0 = type + 1139132135;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    return 1;
                                } else if ($i0 == -51376673) {
                                    $r1 = this$0;
                                    $i0 = type - 1203645612;
                                    type = $i0;
                                    $r1[($i0 * 725238235) - 1] = client.counter;
                                    $r1 = this$0;
                                    $i0 = type - 1207004171;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.order;
                                    return 1;
                                } else if (1045951251 != $i0) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type + 1260820863;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.TAG;
                                    $r1 = this$0;
                                    $i0 = type - 1468300889;
                                    type = $i0;
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

    static int onCreate(int $i0, CharSequence charSequence, boolean z) {
        int[] $r1;
        int $i1;
        System $r2;
        int[] $r5;
        int $i3;
        if ($i0 >= 922685758) {
            $i0 -= 1000;
            $r1 = this$0;
            $i1 = type - -876619946;
            type = $i1;
            $r2 = ArrayList.get($r1[$i1 * 537618701], 727832334);
        } else {
            $r2 = z ? Constants.data : state;
        }
        String[] $r3 = data;
        $i1 = value - -1246602361;
        value = $i1;
        String $r4 = $r3[$i1 * -1199068998];
        $r1 = null;
        if ($r4.length() > 0 && $r4.charAt($r4.length() - 1) == 'Y') {
            $r5 = this$0;
            $i1 = type - -1194553915;
            type = $i1;
            $i3 = $r5[$i1 * 537618701];
            if ($i3 > 0) {
                $r1 = new int[$i3];
                while (true) {
                    $i1 = $i3 - 1;
                    if ($i3 <= 0) {
                        break;
                    }
                    $r5 = this$0;
                    $i3 = type - -1194553915;
                    type = $i3;
                    $r1[$i1] = $r5[$i3 * -1924503382];
                    $i3 = $i1;
                }
            }
            $r4 = $r4.substring(0, $r4.length() - 1);
        }
        Object[] $r6 = new Object[($r4.length() + 1)];
        for ($i1 = $r6.length - 1; $i1 >= 1; $i1--) {
            if ($r4.charAt($i1 - 1) == 's') {
                $r3 = data;
                $i3 = value - -1246602361;
                value = $i3;
                $r6[$i1] = $r3[$i3 * -1267697097];
            } else {
                $r5 = this$0;
                $i3 = type - -1194553915;
                type = $i3;
                $r6[$i1] = new Integer($r5[$i3 * 537618701]);
            }
        }
        $r5 = this$0;
        $i1 = type - 1347847308;
        type = $i1;
        $i1 = $r5[$i1 * 60365506];
        if (-1 != $i1) {
            $r6[0] = new Integer($i1);
        } else {
            $r6 = null;
        }
        if (523499912 == $i0) {
            $r2.charset = $r6;
        } else if (System.HTTP_PROXY_PORT == $i0) {
            $r2.username = $r6;
        } else if ($i0 == -969226099) {
            $r2.password = $r6;
        } else if (218627641 == $i0) {
            $r2.host = $r6;
        } else if (1542680126 == $i0) {
            $r2.in = $r6;
        } else if ($i0 == 1405) {
            $r2.activity = $r6;
        } else if (-1421465946 == $i0) {
            $r2.description = $r6;
        } else if (174049690 == $i0) {
            $r2.db = $r6;
            $r2.flags = $r1;
        } else if ($i0 == 1408) {
            $r2.title = $r6;
        } else if (47273384 == $i0) {
            $r2.url = $r6;
        } else if ($i0 == 706670956) {
            $r2.view = $r6;
        } else if (1411 == $i0) {
            $r2.item = $r6;
        } else if ($i0 == 1412) {
            $r2.handler = $r6;
        } else if ($i0 == 1835230628) {
            $r2.channel = $r6;
            $r2.queue = $r1;
        } else if ($i0 == 1968633492) {
            $r2.input = $r6;
            $r2.empty = $r1;
        } else if ($i0 == 1416) {
            $r2.mContext = $r6;
        } else if (-98402636 == $i0) {
            $r2.mode = $r6;
        } else if (607282777 == $i0) {
            $r2.cache = $r6;
        } else if ($i0 == 1419) {
            $r2.msg = $r6;
        } else if ($i0 == 1903603523) {
            $r2.output = $r6;
        } else if ($i0 == 310549163) {
            $r2.pool = $r6;
        } else if (1422 == $i0) {
            $r2.parser = $r6;
        } else if (1423 == $i0) {
            $r2.table = $r6;
        } else if (1424 == $i0) {
            $r2.entries = $r6;
        } else if (1627374947 == $i0) {
            $r2.server = $r6;
        } else if (-1723397860 == $i0) {
            $r2.port = $r6;
        } else if ($i0 != -1218379612) {
            return 2;
        } else {
            $r2.adapter = $r6;
        }
        $r2.token = true;
        return 1;
    }

    static int onCreateView(int $i0, CharSequence charSequence, boolean z) {
        int $i1;
        System $r3;
        int $i3;
        int[] $r6;
        Object[] $r1 = null;
        if ($i0 >= 370442202) {
            $i0 -= 1000;
            int[] $r2 = this$0;
            $i1 = type - -1179176167;
            type = $i1;
            $r3 = ArrayList.get($r2[$i1 * -1916908261], 1094391555);
        } else {
            $r3 = z ? Constants.data : state;
        }
        String[] $r4 = data;
        $i1 = value - -1246602361;
        value = $i1;
        String $r5 = $r4[$i1 * -1267697097];
        if ($r5.length() <= 0 || $r5.charAt($r5.length() - 1) != 'Y') {
            $r2 = null;
        } else {
            $r2 = this$0;
            $i1 = type - 1468107154;
            type = $i1;
            $i3 = $r2[$i1 * 537618701];
            if ($i3 > 0) {
                $r2 = new int[$i3];
                while (true) {
                    $i1 = $i3 - 1;
                    if ($i3 <= 0) {
                        break;
                    }
                    $r6 = this$0;
                    $i3 = type - -1194553915;
                    type = $i3;
                    $r2[$i1] = $r6[$i3 * 1948593141];
                    $i3 = $i1;
                }
            } else {
                $r2 = null;
            }
            $r5 = $r5.substring(0, $r5.length() - 1);
        }
        Object[] $r8 = new Object[($r5.length() + 1)];
        for ($i1 = $r8.length - 1; $i1 >= 1; $i1--) {
            if ($r5.charAt($i1 - 1) == '魲') {
                $r4 = data;
                $i3 = value - -11595589;
                value = $i3;
                $r8[$i1] = $r4[$i3 * -1574499218];
            } else {
                $r6 = this$0;
                $i3 = type - -1194553915;
                type = $i3;
                $r8[$i1] = new Integer($r6[$i3 * 537618701]);
            }
        }
        $r6 = this$0;
        $i1 = type - -1194553915;
        type = $i1;
        $i1 = $r6[$i1 * 537618701];
        if (-1 != $i1) {
            $r8[0] = new Integer($i1);
            $r1 = $r8;
        }
        if (1206129589 == $i0) {
            $r3.charset = $r1;
        } else if (-1718774906 == $i0) {
            $r3.username = $r1;
        } else if ($i0 == 1402) {
            $r3.password = $r1;
        } else if (1403 == $i0) {
            $r3.host = $r1;
        } else if (-1384534052 == $i0) {
            $r3.in = $r1;
        } else if ($i0 == 1074803796) {
            $r3.activity = $r1;
        } else if (1406 == $i0) {
            $r3.description = $r1;
        } else if (2072920394 == $i0) {
            $r3.db = $r1;
            $r3.flags = $r2;
        } else if ($i0 == -938864223) {
            $r3.title = $r1;
        } else if (1409 == $i0) {
            $r3.url = $r1;
        } else if ($i0 == 1410) {
            $r3.view = $r1;
        } else if (1411 == $i0) {
            $r3.item = $r1;
        } else if ($i0 == 824274944) {
            $r3.handler = $r1;
        } else if ($i0 == 1414) {
            $r3.channel = $r1;
            $r3.queue = $r2;
        } else if ($i0 == 1415) {
            $r3.input = $r1;
            $r3.empty = $r2;
        } else if ($i0 == 1416) {
            $r3.mContext = $r1;
        } else if (678253793 == $i0) {
            $r3.mode = $r1;
        } else if (1418 == $i0) {
            $r3.cache = $r1;
        } else if ($i0 == 392014067) {
            $r3.msg = $r1;
        } else if ($i0 == 1420) {
            $r3.output = $r1;
        } else if ($i0 == 732591225) {
            $r3.pool = $r1;
        } else if (1422 == $i0) {
            $r3.parser = $r1;
        } else if (-2070871093 == $i0) {
            $r3.table = $r1;
        } else if (352814972 == $i0) {
            $r3.entries = $r1;
        } else if (1425 == $i0) {
            $r3.server = $r1;
        } else if (1426 == $i0) {
            $r3.port = $r1;
        } else if ($i0 != -1980465682) {
            return 2;
        } else {
            $r3.adapter = $r1;
        }
        $r3.token = true;
        return 1;
    }

    static int onItemClick(int $i0, CharSequence charSequence, boolean z) {
        boolean $i1 = false;
        int[] $r1;
        int $i12;
        if (-1039276280 == $i0) {
            $r1 = this$0;
            $i0 = type - 337581614;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1825361527;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].get((byte) 0);
            return 1;
        } else if ($i0 == 3904) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 611509164];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * -488833568) - 1] = client.target[$i0].state * 1845400323;
            return 1;
        } else if ($i0 == 3905) {
            $r1 = this$0;
            $i0 = type - 1889616515;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * -1051534165) - 1] = client.target[$i0].value * 798361731;
            return 1;
        } else if (1578640917 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].name * -1832118056;
            return 1;
        } else if ($i0 == 3907) {
            $r1 = this$0;
            $i0 = type - -1269321072;
            type = $i0;
            $i0 = $r1[$i0 * 1542598302];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * -1874381306) - 1] = client.target[$i0].pos * -2034245968;
            return 1;
        } else if ($i0 == 1887826787) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i12 = type - 1194553915;
            type = $i12;
            $r1[($i12 * 537618701) - 1] = client.target[$i0].data * -683379476;
            return 1;
        } else if (-1752716449 == $i0) {
            $r1 = this$0;
            $i0 = type - -894447165;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 1755441992]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 244545690;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if ($i0 == 0) {
                $i12 = 1;
            }
            $r1[$i2] = $i12;
            return 1;
        } else if (-1280877871 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 151277539;
            type = $i2;
            $i2 = ($i2 * 485502535) - 1;
            if ($i0 == 2) {
                $i12 = 1;
            }
            $r1[$i2] = $i12;
            return 1;
        } else if (-1938190086 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * -889951503]].set((byte) 32);
            $r1 = this$0;
            $i2 = type + 1831359139;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if ($i0 == 5) {
                $i12 = 1;
            }
            $r1[$i2] = $i12;
            return 1;
        } else if (3913 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 1430193225]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * -1133878207) - 1;
            if (1 == $i0) {
                $i12 = 1;
            }
            $r1[$i2] = $i12;
            return 1;
        } else {
            if ($i0 == -1619873318) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.text, $i1, -1461513947);
                    return 1;
                }
            } else if (3915 == $i0) {
                $r1 = this$0;
                $i0 = type - 103760732;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.url, $i1, 479440221);
                    return 1;
                }
            } else if ($i0 == 3916) {
                type -= -1745737973;
                z = 1 == this$0[type * -1480400447];
                if (this$0[(type * -973943839) + 1] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    client.intent.id = $i1;
                    ZStream.data.add(client.intent, z, -155754918);
                    return 1;
                }
            } else if ($i0 == 1135515395) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * -1877221653] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.type, $i1, -711042546);
                    return 1;
                }
            } else if (-1781542834 == $i0) {
                $r1 = this$0;
                $i0 = type - 1267571611;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.intent, $i1, 245333410);
                    return 1;
                }
            } else if ($i0 == 3919) {
                $r1 = this$0;
                $i0 = type + 732046453;
                type = $i0;
                $i0 = ($i0 * 1759858009) - 1;
                if (ZStream.data != null) {
                    $i12 = ZStream.data.data.size();
                }
                $r1[$i0] = $i12;
                return 1;
            } else if ($i0 == -1261715796) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 1583178457]);
                $r1 = this$0;
                $i0 = type + 1648838649;
                type = $i0;
                $r1[($i0 * -1531386247) - 1] = $r7.index * -1546500950;
                return 1;
            } else if ($i0 == 3921) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 498232121]);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * -1267697097) - 1] = $r7.getKey(-1462247273);
                return 1;
            } else if (3922 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 217186917]);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * 1076857120) - 1] = $r7.getParent(1083521505);
                return 1;
            } else if (1455465949 == $i0) {
                $r1 = this$0;
                $i0 = type - 88739131;
                type = $i0;
                long linkedList = (LinkedList.toString(768768681) - (DrawingGroup.logger * 5304096097959642155L)) - (((AstNode) ZStream.data.data.get($r1[$i0 * -1403010488])).position * 8313538393492320215L);
                $i0 = (int) (linkedList / 3600000);
                long $l4 = (linkedList - ((long) (-1404414013 * $i0))) / 60000;
                long j = $l4;
                $i12 = (int) $l4;
                $l4 = ((linkedList - ((long) (3600000 * $i0))) - ((long) (-1251161694 * $i12))) / 1000;
                linkedList = $l4;
                $i2 = (int) $l4;
                String $r11 = $i0 + ":" + ($i12 / 10) + ($i12 % 10) + ":" + ($i2 / 10) + ($i2 % 10);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * -70455473) - 1] = $r11;
                return 1;
            } else if (1296821054 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * -2073100357]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r7.this$0.name * -672413105;
            } else if ($i0 == 1831279018) {
                $r1 = this$0;
                $i0 = type - 1084483802;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type + 737258478;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r7.this$0.value * -1928030811;
                return 1;
            } else if (3926 != $i0) {
                return 2;
            } else {
                $r1 = this$0;
                $i0 = type - 2117921008;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r7.this$0.state * 203777790;
                return 1;
            }
            return 1;
        }
    }

    static int open(int $i0, CharSequence charSequence, boolean z) {
        z = false;
        if (6600 == $i0) {
            Feed.getInstance(-744282489).get(Msg.size * -1545402682, (Build$VERSION.type * 1427581220) + ((File.this$0.size * 2052868554) >> 7), (Level.type * 1289967967) + ((File.this$0.value * 1390099611) >> 7), true, 498403945);
            return 1;
        } else if (6601 == $i0) {
            $r3 = this$0;
            $i0 = type - -1670582083;
            type = $i0;
            String $r4 = "";
            $r5 = Feed.getInstance(-2103264818).get($r3[$i0 * 537618701], -644281150);
            if ($r5 != null) {
                $r4 = $r5.create(1845251321);
            }
            $r6 = data;
            $i0 = value - 112361374;
            value = $i0;
            $r6[($i0 * 1562692026) - 1] = $r4;
            return 1;
        } else if ($i0 == 6602) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            Feed.getInstance(-410537299).equals($r3[$i0 * -948081835], -1982418073);
            return 1;
        } else if ($i0 == 6603) {
            $r3 = this$0;
            $i0 = type + 813141663;
            type = $i0;
            $r3[($i0 * -146175937) - 1] = Feed.getInstance(32336226).init(-1899173653);
            return 1;
        } else if ($i0 == 6604) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            Feed.getInstance(-451192596).read($r3[$i0 * 1214056793], (byte) 16);
            return 1;
        } else if ($i0 == 6605) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 486874487) - 1;
            if (Feed.getInstance(772118419).getProperty(-396888605)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if (6606 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 1252621360]);
            Feed.getInstance(-1931746307).load(1452060195 * r0.value, r0.data * 1719114399, -179577559);
            return 1;
        } else if (6607 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-342118404).read(-1881909844 * r0.value, r0.data * 1719114399, (byte) 1);
            return 1;
        } else if ($i0 == 6608) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-350326553).init(1302348633 * r0.type, r0.value * 1452060195, r0.data * 1719114399, 2063956963);
            return 1;
        } else if (6609 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-1932144800).write(1599002659 * r0.type, 1017340150 * r0.value, r0.data * 1719114399, (byte) 42);
            return 1;
        } else if (6610 == $i0) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-489813825).read(-778913688);
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -595694560) - 1] = Feed.getInstance(-1446639010).size(414296057);
            return 1;
        } else if (6611 == $i0) {
            $r3 = this$0;
            $i0 = type - -1439157169;
            type = $i0;
            $r5 = Feed.getInstance(103020441).get($r3[$i0 * 537618701], -836572214);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 1997078975;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.read(-2070564002).toString(16711935);
            return 1;
        } else if ($i0 == 869257338) {
            $r3 = this$0;
            $i0 = type - -578583186;
            type = $i0;
            $r5 = Feed.getInstance(-212189667).get($r3[$i0 * 537618701], 1442955705);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1861986232;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = this$0;
                $i0 = type + 62384988;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1067137645;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.contains(-307085230) - $r5.add(-2113924132)) + 1) * 64;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -1407316235) - 1] = (($r5.add((byte) 20) - $r5.append(-2036083422)) + 1) * 1849017600;
            return 1;
        } else if ($i0 == -1917003763) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(-515907389).get($r3[$i0 * 537618701], 1426568606);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 917676541;
                type = $i0;
                $r3[($i0 * 1410086959) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * -2066921256) - 1] = 0;
                $r3 = this$0;
                $i0 = type - 1483302388;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -119410698) - 1] = $r5.add(-2113924132) * 64;
            $r3 = this$0;
            $i0 = type + 1392484365;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r5.append(2120281563) * 64;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 114712128) - 1] = (($r5.contains(2117089732) * -1302433548) + 64) - 1;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r5.add((byte) -109) * 64) + 1296394525) - 1;
            return 1;
        } else if ($i0 == 6614) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r5 = Feed.getInstance(-1535263885).get($r3[$i0 * 443977247], -1493885154);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 849005080) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1634642843;
            type = $i0;
            $r3[($i0 * -1666214882) - 1] = $r5.toString((byte) -64);
            return 1;
        } else if (155290788 == $i0) {
            $r7 = Feed.getInstance(384064732).next(33704627);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 1680201952) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 760369068;
            type = $i0;
            $r3[($i0 * -1369279395) - 1] = $r7.value * -707664818;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -550992890) - 1] = $r7.data * 1719114399;
            return 1;
        } else if (6616 == $i0) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -1036350388) - 1] = Feed.getInstance(504458625).encode(2086442125);
            return 1;
        } else if ($i0 == 872673284) {
            $r3 = this$0;
            $i0 = type - 913007870;
            type = $i0;
            r0 = new Method($r3[$i0 * 783921042]);
            $r5 = Feed.getInstance(-397929525).load(-1868192751);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 2009699255;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 1328149383) - 1] = -1;
                return 1;
            }
            $r3 = $r5.get(1302348633 * r0.type, r0.value * 20094867, r0.data * 759037223, (byte) 2);
            if ($r3 == null) {
                $r3 = this$0;
                $i0 = type - 20173133;
                type = $i0;
                $r3[($i0 * 1166932611) - 1] = -1;
                $r3 = this$0;
                $i0 = type + 342673155;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            int[] $r11 = this$0;
            $i0 = type - 525601174;
            type = $i0;
            $r11[($i0 * 1466430642) - 1] = $r3[0];
            $r11 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r11[($i0 * 1866020789) - 1] = $r3[1];
            return 1;
        } else if ($i0 == 2140181632) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            $r5 = Feed.getInstance(-2066016922).load(2082741391);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type + 985697718;
                type = $i0;
                $r3[($i0 * 1948290291) - 1] = -1;
                return 1;
            }
            $r7 = $r5.add(r0.value * 1452060195, r0.data * -1689986712, (byte) -21);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type - 464760403;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r7.toString(16711935);
            return 1;
        } else if ($i0 == 6619) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            r0 = new Method(this$0[(-1632166123 * type) + 1]);
            Feed.getInstance(-940134763).get(Feed.getInstance(-2138883401).get($i0, -20431029), (Method) new Method(File.this$0.context * -424098672, ((File.this$0.size * 1783877834) >> 7) + (1407993063 * Build$VERSION.type), (Level.type * 1289967967) + ((File.this$0.value * 2328865) >> 7)), r0, false, (byte) -98);
            return 1;
        } else if (6620 == $i0) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            r0 = new Method(this$0[(type * 537618701) + 1]);
            $r5 = Feed.getInstance(-861752672).get($i0, 454565455);
            int i = -277606385 * File.this$0.context;
            Feed.getInstance(-502315265).get($r5, new Method(i, (1407993063 * Build$VERSION.type) + ((File.this$0.size * 516759209) >> 7), ((File.this$0.value * 2328865) >> 7) + (Level.type * 1289967967)), r0, true, (byte) -30);
            return 1;
        } else if (1098906010 == $i0) {
            type -= -1279509410;
            $i0 = this$0[1187826452 * type];
            r0 = new Method(this$0[(type * -1489078277) + 1]);
            $r5 = Feed.getInstance(-1925609813).get($i0, 1894937249);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 379216255) - 1] = 0;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 129541142;
            type = $i0;
            $i0 = ($i0 * 220769254) - 1;
            if ($r5.get(r0.type * 265679071, -724190965 * r0.value, r0.data * 1719114399, 1649218560)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if ($i0 == 6622) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -1577399459) - 1] = Feed.getInstance(-889311582).toString(-2137944884);
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-721041555).parse(-1295775924);
            return 1;
        } else if (-308856509 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            r0 = new Method($r3[$i0 * 537618701]);
            $r5 = Feed.getInstance(-1794331590).get(r0.type * 816476895, 1452060195 * r0.value, r0.data * 2012925859, 96144404);
            if ($r5 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 1579699172) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * -1985208951) - 1] = $r5.toString(807916716);
            return 1;
        } else if ($i0 == 1736119966) {
            $r2 = Feed.getInstance(-465025304);
            $r3 = this$0;
            $i0 = type - -1641120853;
            type = $i0;
            $r2.load($r3[$i0 * 537618701], 1563404392);
            return 1;
        } else if (-1953171590 == $i0) {
            Feed.getInstance(-2047404687).read((short) 10999);
            return 1;
        } else if ($i0 == -312217135) {
            $r2 = Feed.getInstance(-1535676824);
            $r3 = this$0;
            $i0 = type - -531188693;
            type = $i0;
            $r2.open($r3[$i0 * 537618701], -1772464943);
            return 1;
        } else if (217877982 == $i0) {
            Feed.getInstance(653940244).add((byte) 107);
            return 1;
        } else if ($i0 == 6628) {
            $r3 = this$0;
            $i0 = type - -2032616487;
            type = $i0;
            if ($r3[$i0 * 537618701] == 1) {
                z = true;
            }
            Feed.getInstance(-888472372).read(z, -1775512641);
            return 1;
        } else if (6629 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            Feed.getInstance(-1278428042).add($r3[$i0 * 537618701], (byte) 30);
            return 1;
        } else if ($i0 == 6630) {
            $r3 = this$0;
            $i0 = type - -1102464720;
            type = $i0;
            Feed.getInstance(-1297199571).read($r3[$i0 * 1917444576], -1772085722);
            return 1;
        } else if ($i0 == 1204862888) {
            Feed.getInstance(-1811764734).read((byte) 47);
            return 1;
        } else if ($i0 == 6632) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r3[$i0 * 537618701] == 1) {
                z = true;
            }
            Feed.getInstance(-984618378).load(z, 1244081313);
            return 1;
        } else if ($i0 == 2144396689) {
            type -= 943996003;
            $i0 = this$0[type * 1140199365];
            if (1 == this$0[(type * -1442825403) + 1]) {
                z = true;
            }
            Feed.getInstance(431098358).get($i0, z, -1645035989);
            return 1;
        } else if ($i0 == -839340789) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            if (1 == this$0[(type * 537618701) + 1]) {
                z = true;
            }
            Feed.getInstance(530283958).read($i0, z, (short) 4095);
            return 1;
        } else if ($i0 == -668275450) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * -797352807) - 1;
            if (Feed.getInstance(-1764045173).contains(-608662179)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if (6636 == $i0) {
            $r3 = this$0;
            $i0 = type - -380857786;
            type = $i0;
            $i0 = $r3[$i0 * 537618701];
            $r3 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $i1 = ($i1 * 537618701) - 1;
            if (Feed.getInstance(-1289602600).remove($i0, 1576592013)) {
                z = true;
            }
            $r3[$i1] = z;
            return 1;
        } else if (-1196484888 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r3[$i0 * 1312315362];
            $r3 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $i1 = ($i1 * 537618701) - 1;
            if (Feed.getInstance(481293467).contains($i0, -908069963)) {
                z = true;
            }
            $r3[$i1] = z;
            return 1;
        } else if ($i0 == 6638) {
            type -= 74909282;
            $r7 = Feed.getInstance(-86584739).get(this$0[type * 537618701], new Method(this$0[(type * -877585240) + 1]), (byte) 125);
            if ($r7 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 762363390) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 2093531658;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r7.toString(16711935);
            return 1;
        } else if ($i0 == 6639) {
            $r8 = Feed.getInstance(-1817469779).create(1972839880);
            if ($r8 == null) {
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r3[($i0 * 1307366491) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 319300644;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r8.this$0 * -1992548508;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 53063439) - 1] = $r8.key.toString(16711935);
            return 1;
        } else if ($i0 == -467469745) {
            $r8 = Feed.getInstance(840590243).get(-67488227);
            if ($r8 == null) {
                $r3 = this$0;
                $i0 = type + 468433774;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = this$0;
                $i0 = type - 1455851224;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 2021368604;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = -2015222802 * $r8.this$0;
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r8.key.toString(16711935);
            return 1;
        } else if ($i0 == -572488365) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r10 = ByteBufferList.data[$r3[$i0 * 537618701]];
            if ($r10.value == null) {
                $r6 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r6[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r6 = data;
            $i0 = value - 1701934852;
            value = $i0;
            $r6[($i0 * 2070609321) - 1] = $r10.value;
            return 1;
        } else if (6694 == $i0) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r10 = ByteBufferList.data[$r3[$i0 * 537618701]];
            $r3 = this$0;
            $i0 = type - 1576594948;
            type = $i0;
            $r3[($i0 * 230344176) - 1] = $r10.text * 600070861;
            return 1;
        } else if ($i0 == -89432083) {
            $r3 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r10 = ByteBufferList.data[$r3[$i0 * 537618701]];
            if ($r10 == null) {
                $r3 = this$0;
                $i0 = type - 1156125893;
                type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type + 632025733;
            type = $i0;
            $r3[($i0 * 124549125) - 1] = $r10.type * -2068206069;
            return 1;
        } else if ($i0 == 1440750716) {
            $r3 = this$0;
            $i0 = type - 936697003;
            type = $i0;
            $r10 = ByteBufferList.data[$r3[$i0 * 2001555109]];
            if ($r10 == null) {
                $r3 = this$0;
                $i0 = type + 422445121;
                type = $i0;
                $r3[($i0 * -1920165374) - 1] = -1;
                return 1;
            }
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = $r10.pos * 1755658873;
            return 1;
        } else if ($i0 == 6697) {
            $r3 = this$0;
            $i0 = type - 1423993200;
            type = $i0;
            $r3[($i0 * -787086037) - 1] = SparseFieldVector.value.length * -1099459587;
            return 1;
        } else if ($i0 == 6698) {
            $r3 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.type.toString(16711935);
            return 1;
        } else if (1318510819 != $i0) {
            return 2;
        } else {
            $r3 = this$0;
            $i0 = type + 523668067;
            type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.file.toString(16711935);
            return 1;
        }
    }

    static int parse(int $i0, CharSequence charSequence, boolean $z0) {
        int $i1 = 0;
        int $i2;
        int $i3;
        System $r3;
        int[] $r1;
        if ($i0 < 1000) {
            int i;
            System $r6;
            if (100 == $i0) {
                type -= 711305551;
                $i2 = this$0[type * 537618701];
                $i3 = this$0[(type * 537618701) + 1];
                $i0 = this$0[(type * 537618701) + 2];
                if ($i3 == 0) {
                    throw new RuntimeException();
                }
                $r3 = ArrayList.get($i2, 526246520);
                if ($r3.key == null) {
                    $r3.key = new System[($i0 + 1)];
                }
                if ($r3.key.length <= $i0) {
                    System[] $r4 = new System[($i0 + 1)];
                    while ($i1 < $r3.key.length) {
                        $r4[$i1] = $r3.key[$i1];
                        $i1++;
                    }
                    $r3.key = $r4;
                }
                if ($i0 <= 0 || $r3.key[$i0 - 1] != null) {
                    $r6 = new System();
                    $r6.name = $i3 * 97215005;
                    $i1 = $r3.value * 1;
                    $r6.value = $i1;
                    $r6.type = $i1 * 1790940165;
                    $r6.next = -1063340613 * $i0;
                    $r6.position = true;
                    $r3.key[$i0] = $r6;
                    if ($z0) {
                        Constants.data = $r6;
                    } else {
                        state = $r6;
                    }
                    client.add($r3, (byte) 99);
                    i = 1;
                } else {
                    throw new RuntimeException("" + ($i0 - 1));
                }
            } else if ($i0 == MediaFile.FILE_TYPE_HTML) {
                $r3 = $z0 ? Constants.data : state;
                $r6 = ArrayList.get($r3.value * 1172750087, 1209239814);
                $r6.key[$r3.next * 2102445939] = null;
                client.add($r6, (byte) 79);
                i = 1;
            } else if (102 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r3 = ArrayList.get($r1[$i0 * 537618701], 974962934);
                $r3.key = null;
                client.add($r3, (byte) 102);
                i = 1;
            } else if ($i0 == 200) {
                type -= 1905859466;
                $i0 = this$0[type * 537618701];
                $i1 = this$0[(type * 537618701) + 1];
                $r3 = DTrace.add($i0, $i1, (byte) 81);
                if ($r3 == null || -1 == $i1) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r3;
                    } else {
                        state = $r3;
                    }
                }
                i = 1;
            } else if (201 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r3 = ArrayList.get($r1[$i0 * 537618701], 1502372482);
                if ($r3 != null) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r3;
                    } else {
                        state = $r3;
                    }
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                }
                i = 1;
            } else {
                i = 2;
            }
            return i;
        } else if ($i0 < 1100) {
            return DocWriter.add($i0, charSequence, $z0, (byte) 64);
        } else {
            if ($i0 < 1200) {
                return FileHeader.init($i0, charSequence, $z0, -949008047);
            }
            if ($i0 < 1300) {
                return FileHeader.parse($i0, charSequence, $z0, (byte) -15);
            }
            if ($i0 < 1400) {
                return Build$VERSION.parse($i0, charSequence, $z0, 1076076234);
            }
            if ($i0 < 1500) {
                return Timer.init($i0, charSequence, $z0, 2142624698);
            }
            if ($i0 < 1600) {
                return Database.parse($i0, charSequence, $z0, -1698055);
            }
            if ($i0 < 1700) {
                return Map.parse($i0, charSequence, $z0, 1211961219);
            }
            if ($i0 < 1800) {
                $r3 = $z0 ? Constants.data : state;
                if (1700 == $i0) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r3.left * -868539721;
                    return 1;
                } else if (1701 == $i0) {
                    if (-868539721 * $r3.left != -1) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.offset * -1148087135;
                        return 1;
                    }
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                    return 1;
                } else if ($i0 != 1702) {
                    return 2;
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r3.next * 2102445939;
                    return 1;
                }
            } else if ($i0 < 1900) {
                return Cell.toString($i0, charSequence, $z0, 1756044573);
            } else {
                if ($i0 < 2000) {
                    return Cell.parse($i0, charSequence, $z0, 576696414);
                }
                if ($i0 < 2100) {
                    return DocWriter.add($i0, charSequence, $z0, (byte) 78);
                }
                if ($i0 < 2200) {
                    return FileHeader.init($i0, charSequence, $z0, 268417648);
                }
                if ($i0 < 2300) {
                    return FileHeader.parse($i0, charSequence, $z0, (byte) -34);
                }
                if ($i0 < 2400) {
                    return Build$VERSION.parse($i0, charSequence, $z0, -1012761065);
                }
                if ($i0 < 2500) {
                    return Timer.init($i0, charSequence, $z0, 2142624698);
                }
                if ($i0 < 2600) {
                    $r1 = this$0;
                    $i3 = type - -1194553915;
                    type = $i3;
                    $r3 = ArrayList.get($r1[$i3 * 537618701], 1681360836);
                    if ($i0 == 2500) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.head * 642824123;
                        return 1;
                    } else if (2501 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.max * 384720325;
                        return 1;
                    } else if (2502 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.this$0 * 256177861;
                        return 1;
                    } else if ($i0 == 2503) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.$assertionsDisabled * 57307023;
                        return 1;
                    } else if (2504 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r3.start) {
                            $i1 = 1;
                        }
                        $r1[$i0] = $i1;
                        return 1;
                    } else if ($i0 != 2505) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.type * -1008623461;
                        return 1;
                    }
                } else if ($i0 < 2700) {
                    $r1 = this$0;
                    $i3 = type - -1194553915;
                    type = $i3;
                    $r3 = ArrayList.get($r1[$i3 * 537618701], 307644891);
                    if ($i0 == 2600) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.f292i * -2091547827;
                        return 1;
                    } else if (2601 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.size * 654937537;
                        return 1;
                    } else if ($i0 == 2602) {
                        $r7 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r7[($i0 * -1267697097) - 1] = $r3.file;
                        return 1;
                    } else if ($i0 == 2603) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.cursor * 1151268625;
                        return 1;
                    } else if ($i0 == 2604) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.buf * -1243953689;
                        return 1;
                    } else if (2605 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.state * 2105704033;
                        return 1;
                    } else if ($i0 == 2606) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.data * -1375479599;
                        return 1;
                    } else if (2607 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.instance * -1211464689;
                        return 1;
                    } else if ($i0 == 2608) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.count * -2032348791;
                        return 1;
                    } else if ($i0 == 2609) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.result * -479221341;
                        return 1;
                    } else if (2610 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.source * -1726277411;
                        return 1;
                    } else if (2611 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.index * 334261811;
                        return 1;
                    } else if (2612 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.current * 1703184995;
                        return 1;
                    } else if (2613 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.err.get(963311757);
                        return 1;
                    } else if (2614 != $i0) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r3.error) {
                            $i1 = 1;
                        }
                        $r1[$i0] = $i1;
                        return 1;
                    }
                } else if ($i0 < 2800) {
                    if ($i0 == 2700) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $r3 = ArrayList.get($r1[$i0 * 537618701], 1372579840);
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.left * -868539721;
                        return 1;
                    } else if ($i0 == 2701) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $r3 = ArrayList.get($r1[$i0 * 537618701], 1642858112);
                        if ($r3.left * -868539721 != -1) {
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r3.offset * -1148087135;
                            return 1;
                        }
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if ($i0 == 2702) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        if (((Character) client.position.get((long) $r1[$i0 * 537618701])) != null) {
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = 1;
                            return 1;
                        }
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != $i0) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 1704673651 * client.parent;
                        return 1;
                    }
                } else if ($i0 < 2900) {
                    $r1 = this$0;
                    $i1 = type - -1194553915;
                    type = $i1;
                    $r3 = ArrayList.get($r1[$i1 * 537618701], 1241989336);
                    if (2800 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = (JSONArray.get($r3, -519890722) >> 11) & 63;
                        return 1;
                    } else if (2801 == $i0) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $i0 = $r1[$i0 * 537618701] - 1;
                        if ($r3.format != null) {
                            String[] $r7 = $r3.format;
                            if ($i0 < $r7.length && $r3.format[$i0] != null) {
                                $r7 = data;
                                $i1 = value - 1246602361;
                                value = $i1;
                                $r7[($i1 * -1267697097) - 1] = $r3.format[$i0];
                                return 1;
                            }
                        }
                        $r7 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r7[($i0 * -1267697097) - 1] = "";
                        return 1;
                    } else if ($i0 != 2802) {
                        return 2;
                    } else {
                        if ($r3.id == null) {
                            $r7 = data;
                            $i0 = value - 1246602361;
                            value = $i0;
                            $r7[($i0 * -1267697097) - 1] = "";
                            return 1;
                        }
                        $r7 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r7[($i0 * -1267697097) - 1] = $r3.id;
                        return 1;
                    }
                } else if ($i0 < 3000) {
                    return Cell.parse($i0, charSequence, $z0, -264168039);
                } else {
                    if ($i0 < 3200) {
                        return Character.parse($i0, charSequence, $z0, -1678409687);
                    }
                    if ($i0 < 3300) {
                        return Option.parse($i0, charSequence, $z0, 282457005);
                    }
                    if ($i0 < 3400) {
                        return ZStream.toString($i0, charSequence, $z0, 16711935);
                    }
                    int $i7;
                    if ($i0 < 3500) {
                        ByteVector $r10;
                        if (3400 == $i0) {
                            type -= 1905859466;
                            $i0 = this$0[type * 537618701];
                            $i3 = this$0[(type * 537618701) + 1];
                            $r10 = CSVReader.add($i0, -1763341566);
                            if ('s' != $r10.value) {
                                while ($i1 < -112083573 * $r10.count) {
                                    if ($i3 != $r10.index[$i1]) {
                                        $r7 = data;
                                        $i0 = value - 1246602361;
                                        value = $i0;
                                        $r7[($i0 * -1267697097) - 1] = $r10.length[$i1];
                                        $r10 = null;
                                        break;
                                    }
                                    $i1++;
                                }
                                if ($r10 != null) {
                                    $r7 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r10.size;
                                    return 1;
                                }
                            }
                            while ($i1 < -112083573 * $r10.count) {
                                if ($i3 != $r10.index[$i1]) {
                                    $r7 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r10.length[$i1];
                                    $r10 = null;
                                    break;
                                }
                                $i1++;
                            }
                            if ($r10 != null) {
                                $r7 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r7[($i0 * -1267697097) - 1] = $r10.size;
                                return 1;
                            }
                            if ($i1 < -112083573 * $r10.count) {
                                if ($i3 != $r10.index[$i1]) {
                                    $r7 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r10.length[$i1];
                                    $r10 = null;
                                    break;
                                }
                                $i1++;
                            }
                            if ($r10 != null) {
                                $r7 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r7[($i0 * -1267697097) - 1] = $r10.size;
                                return 1;
                            }
                        } else if (3408 == $i0) {
                            type -= -483248364;
                            char $i32 = this$0[type * 537618701];
                            char $i02 = this$0[(type * 537618701) + 1];
                            $i2 = this$0[(type * 537618701) + 2];
                            $i7 = this$0[(type * 537618701) + 3];
                            $r10 = CSVReader.add($i2, 536378386);
                            char $c9 = $r10.data;
                            if ($c9 == $i32 && $i02 == $r10.value) {
                                while ($i1 < -112083573 * $r10.count) {
                                    if ($i7 == $r10.index[$i1]) {
                                        if ($i02 == 's') {
                                            $r7 = data;
                                            $i3 = value - 1246602361;
                                            value = $i3;
                                            $r7[($i3 * -1267697097) - 1] = $r10.length[$i1];
                                        } else {
                                            $r1 = this$0;
                                            $i3 = type - 1194553915;
                                            type = $i3;
                                            $r1[($i3 * 537618701) - 1] = $r10.next[$i1];
                                        }
                                        $r10 = null;
                                        if ($r10 != null) {
                                            if ('s' != $i02) {
                                                $r7 = data;
                                                $i0 = value - 1246602361;
                                                value = $i0;
                                                $r7[($i0 * -1267697097) - 1] = $r10.size;
                                                return 1;
                                            }
                                            $r1 = this$0;
                                            $i0 = type - 1194553915;
                                            type = $i0;
                                            $r1[($i0 * 537618701) - 1] = $r10.current * -240948305;
                                            return 1;
                                        }
                                    }
                                    $i1++;
                                }
                                if ($r10 != null) {
                                    if ('s' != $i02) {
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = $r10.current * -240948305;
                                        return 1;
                                    }
                                    $r7 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r10.size;
                                    return 1;
                                }
                            } else if ($i02 == 's') {
                                $r7 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r7[($i0 * -1267697097) - 1] = R$id.this$0;
                                return 1;
                            } else {
                                $r1 = this$0;
                                $i0 = type - 1194553915;
                                type = $i0;
                                $r1[($i0 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if ($i0 != 3411) {
                            return 2;
                        } else {
                            $r1 = this$0;
                            $i0 = type - -1194553915;
                            type = $i0;
                            $r10 = CSVReader.add($r1[$i0 * 537618701], -292993728);
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r10.add((byte) 1);
                            return 1;
                        }
                    } else if ($i0 < 3700) {
                        return BoundingBox.parse($i0, charSequence, $z0, 2123082082);
                    } else {
                        if ($i0 < 4000) {
                            return Item.parse($i0, charSequence, $z0, (byte) -61);
                        }
                        int $i03;
                        if ($i0 < 4100) {
                            if ($i0 == 4000) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 + $i1;
                                return 1;
                            } else if (4001 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 - $i1;
                                return 1;
                            } else if ($i0 == 4002) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 * $i1;
                                return 1;
                            } else if (4003 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 / $i1;
                                return 1;
                            } else if (4004 == $i0) {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $i03 = Math.random() * ((double) $i0);
                                r22 = $i03;
                                $r1[($i1 * 537618701) - 1] = (int) $i03;
                                return 1;
                            } else if ($i0 == 4005) {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $i03 = Math.random() * ((double) ($i0 + 1));
                                r22 = $i03;
                                $r1[($i1 * 537618701) - 1] = (int) $i03;
                                return 1;
                            } else if (4006 == $i0) {
                                type -= -1677802279;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $i3 = this$0[(type * 537618701) + 2];
                                $i2 = this$0[(type * 537618701) + 3];
                                int $i8 = this$0[(type * 537618701) + 4];
                                $r1 = this$0;
                                $i7 = type - 1194553915;
                                type = $i7;
                                $r1[($i7 * 537618701) - 1] = $i0 + ((($i1 - $i0) * ($i8 - $i3)) / ($i2 - $i3));
                                return 1;
                            } else if (4007 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 + (($i1 * $i0) / 100);
                                return 1;
                            } else if ($i0 == 4008) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 | (1 << $i1);
                                return 1;
                            } else if (4009 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 & (-1 - (1 << $i1));
                                return 1;
                            } else if (4010 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i3 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i2 = type - 1194553915;
                                type = $i2;
                                $i2 = ($i2 * 537618701) - 1;
                                if (($i0 & (1 << $i3)) != 0) {
                                    $i1 = 1;
                                }
                                $r1[$i2] = $i1;
                                return 1;
                            } else if ($i0 == 4011) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 % $i1;
                                return 1;
                            } else if (4012 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = (int) Math.pow((double) $i0, (double) $i1);
                                return 1;
                            } else if (4013 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                double $d0;
                                double d;
                                switch ($i1) {
                                    case 0:
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $r1[($i1 * 537618701) - 1] = $i0;
                                        return 1;
                                    case 2:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.sqrt($d0);
                                        return 1;
                                    case 3:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.cbrt($d0);
                                        return 1;
                                    case 4:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.sqrt(Math.sqrt($d0));
                                        return 1;
                                    default:
                                        $r1 = this$0;
                                        $i3 = type - 1194553915;
                                        type = $i3;
                                        $r1[($i3 * 537618701) - 1] = (int) Math.pow((double) $i0, 1.0d / ((double) $i1));
                                        return 1;
                                }
                            } else if (4014 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 & $i1;
                                return 1;
                            } else if (4015 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 | $i1;
                                return 1;
                            } else if (4018 != $i0) {
                                return 2;
                            } else {
                                type -= 711305551;
                                long $l10 = (long) this$0[type * 537618701];
                                long $l11 = (long) this$0[(type * 537618701) + 1];
                                long $l12 = (long) this$0[(type * 537618701) + 2];
                                $r1 = this$0;
                                $i0 = type - 1194553915;
                                type = $i0;
                                $r1[($i0 * 537618701) - 1] = (int) (($l10 * $l12) / $l11);
                                return 1;
                            }
                        } else if ($i0 < 4200) {
                            return JSONArray.parse($i0, charSequence, $z0, -86500708);
                        } else {
                            if ($i0 < 4300) {
                                return Short.parse($i0, charSequence, $z0, -193446610);
                            }
                            if ($i0 < 5100) {
                                return Msg.toString($i0, charSequence, $z0, -342601591);
                            }
                            if ($i0 < 5400) {
                                if ($i0 == 5306) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.state ? 2 : 1;
                                    return 1;
                                } else if (5307 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 == 1 || 2 == $i0) {
                                        client.context.init($i0, -627002736);
                                        return 1;
                                    }
                                } else if ($i0 == 5308) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 1775240613 * Main.this$0.value;
                                    return 1;
                                } else if ($i0 != 5309) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if (1 == $i0 || 2 == $i0) {
                                        $i03 = $i0 * 1983339053;
                                        $i0 = $i03;
                                        Main.this$0.value = $i03;
                                        KeyPair.toString(-539378675);
                                        return 1;
                                    }
                                }
                            } else if ($i0 < 5600) {
                                if ($i0 == 5504) {
                                    type -= 1905859466;
                                    $i0 = this$0[type * 537618701];
                                    $i1 = this$0[(type * 537618701) + 1];
                                    if (!client.dir) {
                                        Stream.set($i0, $i1, -2101227607);
                                        return 1;
                                    }
                                } else if ($i0 == 5505) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.tag * 1679658745;
                                    return 1;
                                } else if (5506 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.level * -198683079;
                                    return 1;
                                } else if (5530 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 >= 0) {
                                        $i1 = $i0;
                                    }
                                    client.cursor = $i1 * -1089737365;
                                    return 1;
                                } else if ($i0 != 5531) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
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
                                return $i0 < 6600 ? Chart.parse($i0, charSequence, $z0, 743280673) : $i0 < 6700 ? Config.parse($i0, charSequence, $z0, -1301472450) : 2;
                            } else {
                                if ($i0 == 6200) {
                                    type -= 1905859466;
                                    client.TAG = (short) this$0[type * 537618701];
                                    if (client.TAG <= (short) 0) {
                                        client.TAG = (short) 256;
                                    }
                                    client.instance = (short) this$0[(type * 537618701) + 1];
                                    if (client.instance <= (short) 0) {
                                        client.instance = (short) 205;
                                        return 1;
                                    }
                                } else if ($i0 == 6201) {
                                    type -= 1905859466;
                                    client.counter = (short) this$0[type * 537618701];
                                    if (client.counter <= (short) 0) {
                                        client.counter = (short) 256;
                                    }
                                    client.order = (short) this$0[(type * 537618701) + 1];
                                    if (client.order <= (short) 0) {
                                        client.order = (short) 320;
                                        return 1;
                                    }
                                } else if (6202 == $i0) {
                                    type -= -483248364;
                                    client.line = (short) this$0[type * 537618701];
                                    if (client.line <= (short) 0) {
                                        client.line = (short) 1;
                                    }
                                    client.left = (short) this$0[(type * 537618701) + 1];
                                    if (client.left <= (short) 0) {
                                        client.left = Short.MAX_VALUE;
                                    } else {
                                        if (client.left < client.line) {
                                            client.left = client.line;
                                        }
                                    }
                                    client.last = (short) this$0[(type * 537618701) + 2];
                                    if (client.last <= (short) 0) {
                                        client.last = (short) 1;
                                    }
                                    client.max = (short) this$0[(type * 537618701) + 3];
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
                                        MultiInputStream.init(0, 0, 256177861 * client.options.this$0, 57307023 * client.options.$assertionsDisabled, false, -1324809069);
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = 2140963035 * client.mCurrent;
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = client.page * -1949120505;
                                        return 1;
                                    }
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    return 1;
                                } else if ($i0 == 6204) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.counter;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.order;
                                    return 1;
                                } else if (6205 != $i0) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.TAG;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
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

    static void parse(int $i0) {
        if (-1 != $i0 && Hashtable.get($i0, (byte) -19)) {
            System[] $r0 = Float.size[$i0];
            for (System $r2 : $r0) {
                if ($r2.listener != null) {
                    ArrayList $r4 = new ArrayList();
                    $r4.name = $r2;
                    $r4.size = $r2.listener;
                    C0000L.parse($r4, -1471245495, 2142070241);
                }
            }
        }
    }

    static void parse(ArrayList arrayList, int i) {
        int $i1;
        int $i3;
        CharSequence $r6;
        CharSequence $r7;
        Throwable $r16;
        Object[] $r1 = arrayList.size;
        if (Page.toString(182090275 * arrayList.header, (byte) -19)) {
            SparseFieldVector.value = (MediaType) $r1[0];
            ByteBufferList $r5 = ByteBufferList.data[SparseFieldVector.value.length * -1099459587];
            $i1 = arrayList.header * 182090275;
            $i3 = -2068206069 * $r5.type;
            $r6 = Resources.toString(TwofishEngine.af(1733135393 * $r5.this$0, $i1, 735380873), $i1, -1988614422);
            $r7 = $r6;
            if ($r6 == null) {
                $r6 = Resources.toString(((40000 + $i3) << 8) + $i1, $i1, -1895038036);
                $r7 = $r6;
                if ($r6 == null) {
                    $r7 = null;
                }
            }
        } else {
            $r7 = Attribute.toString(((Integer) $r1[0]).intValue(), -1175444501);
        }
        if ($r7 != null) {
            int $i4;
            int $i42;
            int $i5;
            String $r14;
            type = 0;
            value = 0;
            int[] $r9 = $r7.value;
            int[] $r10 = $r7.data;
            offset = 0;
            AssertionError.value = new int[(407879525 * $r7.pos)];
            $i1 = 0;
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
                    AssertionError.value[$i1] = $i5 == -2147483639 ? arrayList.channel * 361884663 : $i5;
                    $i1++;
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
                        $i1 = -1;
                    }
                } else {
                    $i42 = $i2;
                }
                $i3++;
                $i2 = $i42;
            }
            $i2 = 0;
            index = arrayList.branch * 698456767;
            $i1 = -1;
            $i3 = -1;
            while (true) {
                $i2++;
                if ($i2 > i) {
                    throw new RuntimeException();
                }
                $i3++;
                $i1 = $r9[$i3];
                if ($i1 >= 100) {
                    switch (Byte.read($i1, $r7, $r7.data[$i3] == 1, (byte) -85)) {
                        case 0:
                            break;
                        case 1:
                            continue;
                        case 2:
                            throw new IllegalStateException();
                        default:
                            continue;
                    }
                } else if ($i1 == 0) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = $r10[$i3];
                } else if ($i1 == 1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - 1194553915;
                    type = $i5;
                    $r11[($i5 * 537618701) - 1] = Event.this$0[$i42];
                } else if ($i1 == 2) {
                    $i42 = $r10[$i3];
                    $r11 = Event.this$0;
                    $r21 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r11[$i42] = $r21[$i5 * 537618701];
                    IOUtils.update($i42, 535734134);
                } else if (3 == $i1) {
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r7.length[$i3];
                } else if ($i1 == 6) {
                    $i3 = $r10[$i3] + $i3;
                } else if ($i1 == 7) {
                    type -= 1905859466;
                    if (this$0[(537618701 * type) + 1] != this$0[537618701 * type]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (8 == $i1) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] == this$0[(type * 537618701) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 9) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] < this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 10) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] > this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (21 == $i1) {
                    if (344694797 * offset != 0) {
                        $r19 = count;
                        $i3 = offset - -1432768827;
                        offset = $i3;
                        PathParser $r20 = $r19[$i3 * 344694797];
                        $r7 = $r20.name;
                        $i3 = $r20.count;
                        AssertionError.value = $r20.value;
                        Target.value = $r20.data;
                        $r10 = $r7.data;
                        $r9 = $r7.value;
                        $i3 *= -132320779;
                    } else {
                        return;
                    }
                } else if ($i1 == 25) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - 1194553915;
                    type = $i5;
                    $r11[($i5 * 537618701) - 1] = IOException.toString($i42, 998830794);
                } else if (27 == $i1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    Identifier.toString($i42, $r11[$i5 * 537618701], (short) -4346);
                } else if ($i1 == 31) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] <= this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (32 == $i1) {
                    type -= 1905859466;
                    if (this$0[type * 537618701] >= this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 33) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = AssertionError.value[$r10[$i3]];
                } else if (34 == $i1) {
                    $r11 = AssertionError.value;
                    $i42 = $r10[$i3];
                    $r21 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r11[$i42] = $r21[$i5 * 537618701];
                } else if ($i1 == 35) {
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = Target.value[$r10[$i3]];
                } else if ($i1 == 36) {
                    $r12 = Target.value;
                    $i42 = $r10[$i3];
                    String[] $r22 = data;
                    $i5 = value - -1246602361;
                    value = $i5;
                    $r12[$i42] = $r22[$i5 * -1267697097];
                } else if ($i1 == 37) {
                    $i42 = $r10[$i3];
                    value -= -1246602361 * $i42;
                    $r12 = data;
                    $i5 = -1267697097 * value;
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
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r14;
                } else if (38 == $i1) {
                    type -= -1194553915;
                } else if (39 == $i1) {
                    value -= -1246602361;
                } else if ($i1 == 40) {
                    $r6 = Attribute.toString($r10[$i3], -230969754);
                    $r10 = new int[(407879525 * $r6.pos)];
                    String[] $r12 = $r6.head * -1469700137;
                    String[] strArr = $r12;
                    $r12 = new String[$r12];
                    for ($i42 = 0; $i42 < $r6.size * 950863471; $i42++) {
                        $i4 = (type * 537618701) - ($r6.size * 950863471);
                        $i5 = $i4;
                        $r10[$i42] = this$0[$i4 + $i42];
                    }
                    for ($i42 = 0; $i42 < 483841497 * $r6.name; $i42++) {
                        $i4 = (value * -1267697097) - (483841497 * $r6.name);
                        $i5 = $i4;
                        $r12[$i42] = data[$i4 + $i42];
                    }
                    type -= -769321365 * $r6.size;
                    value -= -1322194833 * $r6.name;
                    $i4 = new PathParser();
                    $i4.name = $r7;
                    $i4.count = -475434403 * $i3;
                    $i4.value = AssertionError.value;
                    $i4.data = Target.value;
                    $r19 = count;
                    $i3 = offset - 1432768827;
                    offset = $i3;
                    $r19[($i3 * 344694797) - 1] = $i4;
                    AssertionError.value = $r10;
                    Target.value = $r12;
                    $r10 = $r6.data;
                    $r9 = $r6.value;
                    $r7 = $r6;
                    $i3 = -1;
                } else if (42 == $i1) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = Connection.this$0.size($r10[$i3], 1753372502);
                } else if ($i1 == 43) {
                    $r23 = Connection.this$0;
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r23.add($i42, $r11[$i5 * 537618701], 1787865153);
                } else if (44 == $i1) {
                    $i42 = $r10[$i3] >> 16;
                    $i5 = 65535 & $r10[$i3];
                    $r11 = this$0;
                    $i7 = type - -1194553915;
                    type = $i7;
                    $i7 = $r11[$i7 * 537618701];
                    if ($i7 < 0 || $i7 > 5000) {
                        throw new RuntimeException();
                    }
                    name[$i42] = $i7;
                    int i2 = -1;
                    if ($i5 == 105) {
                        i2 = 0;
                    }
                    for ($i5 = 0; $i5 < $i7; $i5++) {
                        size[$i42][$i5] = i2;
                    }
                } else if (45 == $i1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $i5 = $r11[$i5 * 537618701];
                    if ($i5 < 0 || $i5 >= name[$i42]) {
                        throw new RuntimeException();
                    }
                    $r11 = this$0;
                    $i7 = type - 1194553915;
                    type = $i7;
                    $r11[($i7 * 537618701) - 1] = size[$i42][$i5];
                } else if ($i1 == 46) {
                    $i42 = $r10[$i3];
                    type -= 1905859466;
                    $i5 = this$0[537618701 * type];
                    if ($i5 < 0 || $i5 >= name[$i42]) {
                        throw new RuntimeException();
                    }
                    size[$i42][$i5] = this$0[(type * 537618701) + 1];
                } else if ($i1 == 47) {
                    $r14 = Connection.this$0.get($r10[$i3], -592909);
                    String $r25 = $r14;
                    if ($r14 == null) {
                        $r25 = R$id.this$0;
                    }
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r25;
                } else if ($i1 == 48) {
                    $r23 = Connection.this$0;
                    $i42 = $r10[$i3];
                    $r12 = data;
                    $i5 = value - -1246602361;
                    value = $i5;
                    $r23.put($i42, $r12[$i5 * -1267697097], 441446629);
                } else if (60 == $i1) {
                    Date $r27 = $r7.offset[$r10[$i3]];
                    $r11 = this$0;
                    $i42 = type - -1194553915;
                    type = $i42;
                    try {
                        Value $r29 = (Value) $r27.get((long) $r11[$i42 * 537618701]);
                        if ($r29 != null) {
                            $i3 = $r29.value + $i3;
                        }
                    } catch (Exception e2) {
                        $r16 = e2;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return;
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("").append($r7.size).append(" ");
        for (i = (344694797 * offset) - 1; i >= 0; i--) {
            StringBuilder $r18 = stringBuilder.append("");
            long $l6 = count[i].name;
            $r7 = $l6;
            $r18.append($l6.size).append(" ");
        }
        stringBuilder.append("").append($i1);
        JSONArray.get(stringBuilder.toString(), $r16, (short) -14169);
    }

    static int process(int $i0, CharSequence charSequence, boolean z) {
        byte $b1 = (byte) 0;
        int[] $r1;
        String[] $r2;
        int $i2;
        if (4200 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r2 = data;
            $i2 = value - 1246602361;
            value = $i2;
            $r2[($i2 * -1267697097) - 1] = Set.get($i0, 1522290910).value;
            return 1;
        } else if (4201 == $i0) {
            type -= 1905859466;
            $i2 = this$0[type * 537618701];
            $i0 = this$0[(type * 537618701) + 1];
            $r3 = Set.get($i2, 1926325702);
            if ($i0 < 1 || $i0 > 5 || $r3.text[$i0 - 1] == null) {
                $r2 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r2[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r2 = data;
            $i2 = value - 1246602361;
            value = $i2;
            $r2[($i2 * -1267697097) - 1] = $r3.text[$i0 - 1];
            return 1;
        } else if ($i0 == 4202) {
            type -= 1905859466;
            $i2 = this$0[type * 537618701];
            $i0 = this$0[(type * 537618701) + 1];
            $r3 = Set.get($i2, 1410981907);
            if ($i0 < 1 || $i0 > 5 || $r3.this$0[$i0 - 1] == null) {
                $r2 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r2[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r2 = data;
            $i2 = value - 1246602361;
            value = $i2;
            $r2[($i2 * -1267697097) - 1] = $r3.this$0[$i0 - 1];
            return 1;
        } else if (4203 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = Set.get($i0, 1792331783).id * 116446285;
            return 1;
        } else if (4204 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if (Set.get($i0, 1816989814).name * 1099170281 == 1) {
                $b1 = (byte) 1;
            }
            $r1[$i2] = $b1;
            return 1;
        } else if (4205 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r3 = Set.get($i0, 1538349127);
            if ($r3.log * -50977591 != -1 || -1461501241 * $r3.tag < 0) {
                $r1 = this$0;
                $i2 = type - 1194553915;
                type = $i2;
                $r1[($i2 * 537618701) - 1] = $i0;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r3.tag * -1461501241;
            return 1;
        } else if ($i0 == 4206) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r3 = Set.get($i0, 1640048281);
            if ($r3.log * -50977591 < 0 || $r3.tag * -1461501241 < 0) {
                $r1 = this$0;
                $i2 = type - 1194553915;
                type = $i2;
                $r1[($i2 * 537618701) - 1] = $i0;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r3.tag * -1461501241;
            return 1;
        } else if (4207 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if (Set.get($i0, 1889405901).type) {
                $b1 = (byte) 1;
            }
            $r1[$i2] = $b1;
            return 1;
        } else if (4208 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r3 = Set.get($i0, 1883108768);
            if ($r3.url * 2018587685 != -1 || -778372525 * $r3.source < 0) {
                $r1 = this$0;
                $i2 = type - 1194553915;
                type = $i2;
                $r1[($i2 * 537618701) - 1] = $i0;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r3.source * -778372525;
            return 1;
        } else if (4209 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r3 = Set.get($i0, 1202998163);
            if ($r3.url * 2018587685 < 0 || -778372525 * $r3.source < 0) {
                $r1 = this$0;
                $i2 = type - 1194553915;
                type = $i2;
                $r1[($i2 * 537618701) - 1] = $i0;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r3.source * -778372525;
            return 1;
        } else if ($i0 == 4210) {
            $r2 = data;
            $i0 = value - -1246602361;
            value = $i0;
            String $r4 = $r2[$i0 * -1267697097];
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            z = 1 == $r1[$i0 * 537618701];
            $r4 = $r4.toLowerCase();
            $i0 = 0;
            $r5 = new short[16];
            for ($i2 = 0; $i2 < Message.entry * 916326225; $i2++) {
                $r3 = Set.get($i2, 2034062102);
                if ((!z || $r3.root) && -50977591 * $r3.log == -1) {
                    String $r8 = $r3.value;
                    String str = $r8;
                    if ($r8.toLowerCase().indexOf($r4) != -1) {
                        if ($i0 >= 250) {
                            Cache.type = 1238222265;
                            AbstractParser.value = null;
                            break;
                        }
                        if ($i0 >= $r5.length) {
                            short[] $r7 = new short[($r5.length * 2)];
                            for (int $i3 = 0; $i3 < $i0; $i3++) {
                                $r7[$i3] = $r5[$i3];
                            }
                            $r5 = $r7;
                        }
                        $r5[$i0] = (short) $i2;
                        $i0++;
                    }
                }
            }
            AbstractParser.value = $r5;
            Locale.value = 0;
            Cache.type = -1238222265 * $i0;
            $r2 = new String[(-696430729 * Cache.type)];
            for ($i0 = 0; $i0 < Cache.type * -696430729; $i0++) {
                $r2[$i0] = Set.get($r5[$i0], 1390600912).value;
            }
            ArrayList.add($r2, AbstractParser.value, 0, $r2.length - 1, 1025692407);
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -696430729 * Cache.type;
            return 1;
        } else if ($i0 == 4211) {
            if (AbstractParser.value == null || Locale.value * 1214242337 >= Cache.type * -696430729) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            $r5 = AbstractParser.value;
            $i2 = Locale.value - 1505548831;
            Locale.value = $i2;
            $r1[$i0] = $r5[($i2 * 1214242337) - 1] & 65535;
            return 1;
        } else if (4212 != $i0) {
            return 2;
        } else {
            Locale.value = 0;
            return 1;
        }
    }

    static int put(int $i0, CharSequence charSequence, boolean z) {
        z = false;
        int[] $r1;
        if ($i0 == 481344092) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Msg.get(-1679128282)) {
                z = true;
            }
            $r1[$i0] = z;
            return 1;
        } else if ($i0 == 6501) {
            $r2 = AbstractBuffer.read(-466310398);
            if ($r2 != null) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * -308636496) - 1] = -756728079 * $r2.length;
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = 1768391501 * $r2.index;
                $r3 = data;
                $i0 = value + 1859552069;
                value = $i0;
                $r3[($i0 * 871670380) - 1] = $r2.name;
                $r1 = this$0;
                $i0 = type - 2147200780;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r2.log * 1116252417;
                $r1 = this$0;
                $i0 = type - 1593812798;
                type = $i0;
                $r1[($i0 * 325926276) - 1] = $r2.value * 625974172;
                $r3 = data;
                $i0 = value + 2034502478;
                value = $i0;
                $r3[($i0 * 1104127956) - 1] = $r2.buffer;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -1;
            $r1 = this$0;
            $i0 = type + 934971358;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r3 = data;
            $i0 = value - 1529811960;
            value = $i0;
            $r3[($i0 * 2012594365) - 1] = "";
            $r1 = this$0;
            $i0 = type + 1116456772;
            type = $i0;
            $r1[($i0 * 2099797204) - 1] = 0;
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * -1584192320) - 1] = 0;
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * 1964500398) - 1] = "";
            return 1;
        } else if (997338256 == $i0) {
            $r2 = ByteString.read(2142124585);
            if ($r2 != null) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = -756728079 * $r2.length;
                $r1 = this$0;
                $i0 = type + 917576911;
                type = $i0;
                $r1[($i0 * -1929214205) - 1] = $r2.index * -1903354033;
                $r3 = data;
                $i0 = value - 1172829391;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = $r2.name;
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 817287712) - 1] = $r2.log * -798117024;
                $r1 = this$0;
                $i0 = type + 2103048971;
                type = $i0;
                $r1[($i0 * -38393883) - 1] = $r2.value * -1545862613;
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = $r2.buffer;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1358042433;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -1;
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * 1539885470) - 1] = "";
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * -1652043604) - 1] = 0;
            $r1 = this$0;
            $i0 = type + 1806286432;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (6506 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            for ($i1 = 0; $i1 < ByteBuffer.size * 443593871; $i1++) {
                if ($i0 == -756728079 * Short.value[$i1].length) {
                    $r2 = Short.value[$i1];
                    break;
                }
            }
            $r2 = null;
            if ($r2 != null) {
                $r1 = this$0;
                $i0 = type + 2091463778;
                type = $i0;
                $r1[($i0 * 481231030) - 1] = -756728079 * $r2.length;
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * -295995985) - 1] = 259969383 * $r2.index;
                $r3 = data;
                $i0 = value + 129971566;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = $r2.name;
                $r1 = this$0;
                $i0 = type + 564108115;
                type = $i0;
                $r1[($i0 * 1577996980) - 1] = 1116252417 * $r2.log;
                $r1 = this$0;
                $i0 = type - 1268481249;
                type = $i0;
                $r1[($i0 * -818681680) - 1] = -1545862613 * $r2.value;
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = $r2.buffer;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -1;
            $r1 = this$0;
            $i0 = type - 1634117599;
            type = $i0;
            $r1[($i0 * -1528257269) - 1] = 0;
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -881174335) - 1] = "";
            $r1 = this$0;
            $i0 = type - 1174449495;
            type = $i0;
            $r1[($i0 * -1410490426) - 1] = 0;
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * -1833128565) - 1] = 0;
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if ($i0 == 6507) {
            type -= -483248364;
            $i0 = this$0[type * 537618701];
            boolean $z1 = 1 == this$0[(type * 537618701) + 1];
            $i1 = this$0[(-209350055 * type) + 2];
            if (1 == this$0[(type * 537618701) + 3]) {
                z = true;
            }
            TreeInt.add($i0, $z1, $i1, z, -521522458);
            return 1;
        } else if (690196060 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * -1379890083];
            if ($i0 < 0 || $i0 >= ByteBuffer.size * 417183227) {
                $r1 = this$0;
                $i0 = type - 302677895;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = -1;
                $r1 = this$0;
                $i0 = type + 1211081398;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = 0;
                $r3 = data;
                $i0 = value - 755896735;
                value = $i0;
                $r3[($i0 * -1824144820) - 1] = "";
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = 0;
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = 0;
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * 898940488) - 1] = "";
                return 1;
            }
            $r2 = Short.value[$i0];
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r2.length * -918222032;
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 259969383 * $r2.index;
            $r3 = data;
            $i0 = value - 983990048;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = $r2.name;
            $r1 = this$0;
            $i0 = type - 300945793;
            type = $i0;
            $r1[($i0 * 1085870907) - 1] = $r2.log * 1186073960;
            $r1 = this$0;
            $i0 = type + 1778183492;
            type = $i0;
            $r1[($i0 * 1595980354) - 1] = -1545862613 * $r2.value;
            $r3 = data;
            $i0 = value + 1709383875;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = $r2.buffer;
            return 1;
        } else if (6512 == $i0) {
            Util $r14 = Settings.this$0;
            $r1 = this$0;
            $i0 = type - -787910603;
            type = $i0;
            if ($r1[$i0 * 1340813430] == 1) {
                z = true;
            }
            $r14.add(z, 1344077126);
            return 1;
        } else if ($i0 == 941979692) {
            type -= -1063231914;
            $i0 = this$0[type * 537618701];
            $i1 = this$0[(type * 537618701) + 1];
            $r5 = PriorityQueue.add($i1, (byte) 28);
            if ($r5.add(2143171804)) {
                $r3 = data;
                $i2 = value - 198237981;
                value = $i2;
                $r3[($i2 * 1101585585) - 1] = Thread.add($i0, (byte) 10).toString($i1, $r5.size, -1307588498);
                return 1;
            }
            $r1 = this$0;
            $i2 = type + 532682592;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = Thread.add($i0, (byte) 75).add($i1, $r5.value * -54312713, (byte) -43);
            return 1;
        } else if ($i0 == 6514) {
            type -= 1905859466;
            $i0 = this$0[-155703305 * type];
            $i1 = this$0[(-278418012 * type) + 1];
            $r5 = PriorityQueue.add($i1, (byte) 61);
            if ($r5.add(2101414433)) {
                $r3 = data;
                $i2 = value + 364274862;
                value = $i2;
                $r3[($i2 * -1267697097) - 1] = BigInteger.get($i0, 1631171527).get($i1, $r5.size, (byte) -94);
                return 1;
            }
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = BigInteger.get($i0, 1761674887).add($i1, $r5.value * -54312713, (byte) 97);
            return 1;
        } else if ($i0 == 6515) {
            type -= 871874130;
            $i0 = this$0[-1006793875 * type];
            $i1 = this$0[(type * -1059135776) + 1];
            $r5 = PriorityQueue.add($i1, (byte) 93);
            if ($r5.add(2108285969)) {
                $r3 = data;
                $i2 = value - 1246602361;
                value = $i2;
                $r3[($i2 * 544900595) - 1] = Set.get($i0, 1442039690).write($i1, $r5.size, -156344076);
                return 1;
            }
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = Set.get($i0, 2097247361).write($i1, $r5.value * -54312713, -475697277);
            return 1;
        } else if ($i0 == -1786744395) {
            type -= 397000126;
            $i0 = this$0[type * 537618701];
            $i1 = this$0[(-466203210 * type) + 1];
            $r5 = PriorityQueue.add($i1, (byte) 91);
            if ($r5.add(2098056052)) {
                $r3 = data;
                $i2 = value - 584533236;
                value = $i2;
                $r3[($i2 * -1267697097) - 1] = HttpConnection.create($i0, (byte) 86).get($i1, $r5.size, 1492137410);
                return 1;
            }
            $r1 = this$0;
            $i2 = type - 771117839;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = HttpConnection.create($i0, (byte) 26).set($i1, $r5.value * -833289101, -861177319);
            return 1;
        } else if ($i0 == 6518) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 617838888) - 1;
            if (client.context.token) {
                z = true;
            }
            $r1[$i0] = z;
            return 1;
        } else if ($i0 == 6520 || $i0 == 6522) {
            $r13 = client.context.getInstance(-1290553606).add(2, 181378049);
            $r3 = data;
            $i0 = value - -712681053;
            value = $i0;
            $r13.add($r3[$i0 * -1677712293], (byte) -7);
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r13.add($r1[$i0 * 537618701], (byte) 49);
            $r13.append((byte) 2);
            return 1;
        } else if ($i0 == 1892861092) {
            client.context.getInstance(-1290553606).toString(2018786148);
            return 1;
        } else if ($i0 != -1883273079) {
            return 2;
        } else {
            $r13 = client.context.getInstance(-1290553606).add(1, 915695227);
            $r3 = data;
            $i0 = value - -1421242619;
            value = $i0;
            String $r4 = $r3[$i0 * -1267697097];
            $i0 = $r4.length();
            for ($i1 = 0; $i1 < $i0; $i1++) {
                if (!JGitText.get($r4.charAt($i1), (byte) 5)) {
                    break;
                }
            }
            z = true;
            if (z) {
                $r13.add($r4, (byte) -54);
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r13.add($r1[$i0 * 537618701], (byte) 7);
                $r13.append((byte) 2);
                return 1;
            }
            throw new IllegalArgumentException();
        }
    }

    static int read(int $i0, CharSequence charSequence, boolean $z0) {
        int $i1 = 0;
        int $i2;
        int $i3;
        System $r3;
        int[] $r1;
        if ($i0 < 1000) {
            int i;
            System $r6;
            if (100 == $i0) {
                type -= 711305551;
                $i2 = this$0[type * 537618701];
                $i3 = this$0[(type * 537618701) + 1];
                $i0 = this$0[(type * 537618701) + 2];
                if ($i3 == 0) {
                    throw new RuntimeException();
                }
                $r3 = ArrayList.get($i2, 1656591227);
                if ($r3.key == null) {
                    $r3.key = new System[($i0 + 1)];
                }
                if ($r3.key.length <= $i0) {
                    System[] $r4 = new System[($i0 + 1)];
                    while ($i1 < $r3.key.length) {
                        $r4[$i1] = $r3.key[$i1];
                        $i1++;
                    }
                    $r3.key = $r4;
                }
                if ($i0 <= 0 || $r3.key[$i0 - 1] != null) {
                    $r6 = new System();
                    $r6.name = $i3 * 97215005;
                    $i1 = $r3.value * 1;
                    $r6.value = $i1;
                    $r6.type = $i1 * 1790940165;
                    $r6.next = -1063340613 * $i0;
                    $r6.position = true;
                    $r3.key[$i0] = $r6;
                    if ($z0) {
                        Constants.data = $r6;
                    } else {
                        state = $r6;
                    }
                    client.add($r3, (byte) 83);
                    i = 1;
                } else {
                    throw new RuntimeException("" + ($i0 - 1));
                }
            } else if ($i0 == 101) {
                $r3 = $z0 ? Constants.data : state;
                $r6 = ArrayList.get($r3.value * 1172750087, 1471455264);
                $r6.key[$r3.next * 2102445939] = null;
                client.add($r6, (byte) 99);
                i = 1;
            } else if (102 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r3 = ArrayList.get($r1[$i0 * 537618701], 1729502942);
                $r3.key = null;
                client.add($r3, (byte) 54);
                i = 1;
            } else if ($i0 == 200) {
                type -= 1905859466;
                $i0 = this$0[type * 537618701];
                $i1 = this$0[(type * 537618701) + 1];
                $r3 = DTrace.add($i0, $i1, (byte) 52);
                if ($r3 == null || -1 == $i1) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r3;
                    } else {
                        state = $r3;
                    }
                }
                i = 1;
            } else if (201 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r3 = ArrayList.get($r1[$i0 * 537618701], 103912634);
                if ($r3 != null) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r3;
                    } else {
                        state = $r3;
                    }
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                }
                i = 1;
            } else {
                i = 2;
            }
            return i;
        } else if ($i0 < 1100) {
            return DocWriter.add($i0, charSequence, $z0, (byte) 92);
        } else {
            if ($i0 < 1200) {
                return FileHeader.init($i0, charSequence, $z0, -504755427);
            }
            if ($i0 < 1300) {
                return FileHeader.parse($i0, charSequence, $z0, (byte) -77);
            }
            if ($i0 < 1400) {
                return Build$VERSION.parse($i0, charSequence, $z0, -855166533);
            }
            if ($i0 < 1500) {
                return Timer.init($i0, charSequence, $z0, 2142624698);
            }
            if ($i0 < 1600) {
                return Database.parse($i0, charSequence, $z0, -634157123);
            }
            if ($i0 < 1700) {
                return Map.parse($i0, charSequence, $z0, 829285324);
            }
            if ($i0 < 1800) {
                $r3 = $z0 ? Constants.data : state;
                if (1700 == $i0) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r3.left * -868539721;
                    return 1;
                } else if (1701 == $i0) {
                    if (-868539721 * $r3.left != -1) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.offset * -1148087135;
                        return 1;
                    }
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                    return 1;
                } else if ($i0 != 1702) {
                    return 2;
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r3.next * 2102445939;
                    return 1;
                }
            } else if ($i0 < 1900) {
                return Cell.toString($i0, charSequence, $z0, 1525373600);
            } else {
                if ($i0 < 2000) {
                    return Cell.parse($i0, charSequence, $z0, 1748199288);
                }
                if ($i0 < 2100) {
                    return DocWriter.add($i0, charSequence, $z0, (byte) 41);
                }
                if ($i0 < 2200) {
                    return FileHeader.init($i0, charSequence, $z0, 156386604);
                }
                if ($i0 < 2300) {
                    return FileHeader.parse($i0, charSequence, $z0, (byte) -22);
                }
                if ($i0 < 2400) {
                    return Build$VERSION.parse($i0, charSequence, $z0, -1677895968);
                }
                if ($i0 < 2500) {
                    return Timer.init($i0, charSequence, $z0, 2142624698);
                }
                if ($i0 < 2600) {
                    $r1 = this$0;
                    $i3 = type - -1194553915;
                    type = $i3;
                    $r3 = ArrayList.get($r1[$i3 * 537618701], 1672017432);
                    if ($i0 == 2500) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.head * 642824123;
                        return 1;
                    } else if (2501 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.max * 384720325;
                        return 1;
                    } else if (2502 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.this$0 * 256177861;
                        return 1;
                    } else if ($i0 == 2503) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.$assertionsDisabled * 57307023;
                        return 1;
                    } else if (2504 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r3.start) {
                            $i1 = 1;
                        }
                        $r1[$i0] = $i1;
                        return 1;
                    } else if ($i0 != 2505) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.type * -1008623461;
                        return 1;
                    }
                } else if ($i0 < 2700) {
                    $r1 = this$0;
                    $i3 = type - -1194553915;
                    type = $i3;
                    $r3 = ArrayList.get($r1[$i3 * 537618701], 973620928);
                    if ($i0 == 2600) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.f292i * -2091547827;
                        return 1;
                    } else if (2601 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.size * 654937537;
                        return 1;
                    } else if ($i0 == 2602) {
                        $r7 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r7[($i0 * -1267697097) - 1] = $r3.file;
                        return 1;
                    } else if ($i0 == 2603) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.cursor * 1151268625;
                        return 1;
                    } else if ($i0 == 2604) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.buf * -1243953689;
                        return 1;
                    } else if (2605 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.state * 2105704033;
                        return 1;
                    } else if ($i0 == 2606) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.data * -1375479599;
                        return 1;
                    } else if (2607 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.instance * -1211464689;
                        return 1;
                    } else if ($i0 == 2608) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.count * -2032348791;
                        return 1;
                    } else if ($i0 == 2609) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.result * -479221341;
                        return 1;
                    } else if (2610 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.source * -1726277411;
                        return 1;
                    } else if (2611 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.index * 334261811;
                        return 1;
                    } else if (2612 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.current * 1703184995;
                        return 1;
                    } else if (2613 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.err.get(991068145);
                        return 1;
                    } else if (2614 != $i0) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r3.error) {
                            $i1 = 1;
                        }
                        $r1[$i0] = $i1;
                        return 1;
                    }
                } else if ($i0 < 2800) {
                    if ($i0 == 2700) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $r3 = ArrayList.get($r1[$i0 * 537618701], 2078478989);
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r3.left * -868539721;
                        return 1;
                    } else if ($i0 == 2701) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $r3 = ArrayList.get($r1[$i0 * 537618701], 958070486);
                        if ($r3.left * -868539721 != -1) {
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r3.offset * -1148087135;
                            return 1;
                        }
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if ($i0 == 2702) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        if (((Character) client.position.get((long) $r1[$i0 * 537618701])) != null) {
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = 1;
                            return 1;
                        }
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != $i0) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 1704673651 * client.parent;
                        return 1;
                    }
                } else if ($i0 < 2900) {
                    $r1 = this$0;
                    $i1 = type - -1194553915;
                    type = $i1;
                    $r3 = ArrayList.get($r1[$i1 * 537618701], 1752424260);
                    if (2800 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = (JSONArray.get($r3, -2005551113) >> 11) & 63;
                        return 1;
                    } else if (2801 == $i0) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $i0 = $r1[$i0 * 537618701] - 1;
                        if ($r3.format != null) {
                            String[] $r7 = $r3.format;
                            if ($i0 < $r7.length && $r3.format[$i0] != null) {
                                $r7 = data;
                                $i1 = value - 1246602361;
                                value = $i1;
                                $r7[($i1 * -1267697097) - 1] = $r3.format[$i0];
                                return 1;
                            }
                        }
                        $r7 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r7[($i0 * -1267697097) - 1] = "";
                        return 1;
                    } else if ($i0 != 2802) {
                        return 2;
                    } else {
                        if ($r3.id == null) {
                            $r7 = data;
                            $i0 = value - 1246602361;
                            value = $i0;
                            $r7[($i0 * -1267697097) - 1] = "";
                            return 1;
                        }
                        $r7 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r7[($i0 * -1267697097) - 1] = $r3.id;
                        return 1;
                    }
                } else if ($i0 < 3000) {
                    return Cell.parse($i0, charSequence, $z0, 599082505);
                } else {
                    if ($i0 < 3200) {
                        return Character.parse($i0, charSequence, $z0, -1699829299);
                    }
                    if ($i0 < 3300) {
                        return Option.parse($i0, charSequence, $z0, -151844425);
                    }
                    if ($i0 < 3400) {
                        return ZStream.toString($i0, charSequence, $z0, 16711935);
                    }
                    int $i7;
                    if ($i0 < 3500) {
                        ByteVector $r10;
                        if (3400 == $i0) {
                            type -= 1905859466;
                            $i0 = this$0[type * 537618701];
                            $i3 = this$0[(type * 537618701) + 1];
                            $r10 = CSVReader.add($i0, -288678908);
                            if ('s' != $r10.value) {
                                while ($i1 < -112083573 * $r10.count) {
                                    if ($i3 != $r10.index[$i1]) {
                                        $r7 = data;
                                        $i0 = value - 1246602361;
                                        value = $i0;
                                        $r7[($i0 * -1267697097) - 1] = $r10.length[$i1];
                                        $r10 = null;
                                        break;
                                    }
                                    $i1++;
                                }
                                if ($r10 != null) {
                                    $r7 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r10.size;
                                    return 1;
                                }
                            }
                            while ($i1 < -112083573 * $r10.count) {
                                if ($i3 != $r10.index[$i1]) {
                                    $r7 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r10.length[$i1];
                                    $r10 = null;
                                    break;
                                }
                                $i1++;
                            }
                            if ($r10 != null) {
                                $r7 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r7[($i0 * -1267697097) - 1] = $r10.size;
                                return 1;
                            }
                            if ($i1 < -112083573 * $r10.count) {
                                if ($i3 != $r10.index[$i1]) {
                                    $r7 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r10.length[$i1];
                                    $r10 = null;
                                    break;
                                }
                                $i1++;
                            }
                            if ($r10 != null) {
                                $r7 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r7[($i0 * -1267697097) - 1] = $r10.size;
                                return 1;
                            }
                        } else if (3408 == $i0) {
                            type -= -483248364;
                            char $i32 = this$0[type * 537618701];
                            char $i02 = this$0[(type * 537618701) + 1];
                            $i2 = this$0[(type * 537618701) + 2];
                            $i7 = this$0[(type * 537618701) + 3];
                            $r10 = CSVReader.add($i2, -670775006);
                            char $c9 = $r10.data;
                            if ($c9 == $i32 && $i02 == $r10.value) {
                                while ($i1 < -112083573 * $r10.count) {
                                    if ($i7 == $r10.index[$i1]) {
                                        if ($i02 == 's') {
                                            $r7 = data;
                                            $i3 = value - 1246602361;
                                            value = $i3;
                                            $r7[($i3 * -1267697097) - 1] = $r10.length[$i1];
                                        } else {
                                            $r1 = this$0;
                                            $i3 = type - 1194553915;
                                            type = $i3;
                                            $r1[($i3 * 537618701) - 1] = $r10.next[$i1];
                                        }
                                        $r10 = null;
                                        if ($r10 != null) {
                                            if ('s' != $i02) {
                                                $r7 = data;
                                                $i0 = value - 1246602361;
                                                value = $i0;
                                                $r7[($i0 * -1267697097) - 1] = $r10.size;
                                                return 1;
                                            }
                                            $r1 = this$0;
                                            $i0 = type - 1194553915;
                                            type = $i0;
                                            $r1[($i0 * 537618701) - 1] = $r10.current * -240948305;
                                            return 1;
                                        }
                                    }
                                    $i1++;
                                }
                                if ($r10 != null) {
                                    if ('s' != $i02) {
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = $r10.current * -240948305;
                                        return 1;
                                    }
                                    $r7 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r7[($i0 * -1267697097) - 1] = $r10.size;
                                    return 1;
                                }
                            } else if ($i02 == 's') {
                                $r7 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r7[($i0 * -1267697097) - 1] = R$id.this$0;
                                return 1;
                            } else {
                                $r1 = this$0;
                                $i0 = type - 1194553915;
                                type = $i0;
                                $r1[($i0 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if ($i0 != 3411) {
                            return 2;
                        } else {
                            $r1 = this$0;
                            $i0 = type - -1194553915;
                            type = $i0;
                            $r10 = CSVReader.add($r1[$i0 * 537618701], -896323716);
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r10.add((byte) 1);
                            return 1;
                        }
                    } else if ($i0 < 3700) {
                        return BoundingBox.parse($i0, charSequence, $z0, 2123082082);
                    } else {
                        if ($i0 < 4000) {
                            return Item.parse($i0, charSequence, $z0, (byte) -76);
                        }
                        int $i03;
                        if ($i0 < 4100) {
                            if ($i0 == 4000) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 + $i1;
                                return 1;
                            } else if (4001 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 - $i1;
                                return 1;
                            } else if ($i0 == 4002) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 * $i1;
                                return 1;
                            } else if (4003 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 / $i1;
                                return 1;
                            } else if (4004 == $i0) {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $i03 = Math.random() * ((double) $i0);
                                r31 = $i03;
                                $r1[($i1 * 537618701) - 1] = (int) $i03;
                                return 1;
                            } else if ($i0 == 4005) {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $i03 = Math.random() * ((double) ($i0 + 1));
                                r31 = $i03;
                                $r1[($i1 * 537618701) - 1] = (int) $i03;
                                return 1;
                            } else if (4006 == $i0) {
                                type -= -1677802279;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $i3 = this$0[(type * 537618701) + 2];
                                $i2 = this$0[(type * 537618701) + 3];
                                int $i8 = this$0[(type * 537618701) + 4];
                                $r1 = this$0;
                                $i7 = type - 1194553915;
                                type = $i7;
                                $r1[($i7 * 537618701) - 1] = $i0 + ((($i1 - $i0) * ($i8 - $i3)) / ($i2 - $i3));
                                return 1;
                            } else if (4007 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 + (($i1 * $i0) / 100);
                                return 1;
                            } else if ($i0 == 4008) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 | (1 << $i1);
                                return 1;
                            } else if (4009 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 & (-1 - (1 << $i1));
                                return 1;
                            } else if (4010 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i3 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i2 = type - 1194553915;
                                type = $i2;
                                $i2 = ($i2 * 537618701) - 1;
                                if (($i0 & (1 << $i3)) != 0) {
                                    $i1 = 1;
                                }
                                $r1[$i2] = $i1;
                                return 1;
                            } else if ($i0 == 4011) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 % $i1;
                                return 1;
                            } else if (4012 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = (int) Math.pow((double) $i0, (double) $i1);
                                return 1;
                            } else if (4013 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                double $d0;
                                double d;
                                switch ($i1) {
                                    case 0:
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $r1[($i1 * 537618701) - 1] = $i0;
                                        return 1;
                                    case 2:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.sqrt($d0);
                                        return 1;
                                    case 3:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.cbrt($d0);
                                        return 1;
                                    case 4:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.sqrt(Math.sqrt($d0));
                                        return 1;
                                    default:
                                        $r1 = this$0;
                                        $i3 = type - 1194553915;
                                        type = $i3;
                                        $r1[($i3 * 537618701) - 1] = (int) Math.pow((double) $i0, 1.0d / ((double) $i1));
                                        return 1;
                                }
                            } else if (4014 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 & $i1;
                                return 1;
                            } else if (4015 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 | $i1;
                                return 1;
                            } else if (4018 != $i0) {
                                return 2;
                            } else {
                                type -= 711305551;
                                long $l10 = (long) this$0[type * 537618701];
                                long $l11 = (long) this$0[(type * 537618701) + 1];
                                long $l12 = (long) this$0[(type * 537618701) + 2];
                                $r1 = this$0;
                                $i0 = type - 1194553915;
                                type = $i0;
                                $r1[($i0 * 537618701) - 1] = (int) (($l10 * $l12) / $l11);
                                return 1;
                            }
                        } else if ($i0 < 4200) {
                            return JSONArray.parse($i0, charSequence, $z0, -1092975641);
                        } else {
                            if ($i0 < 4300) {
                                return Short.parse($i0, charSequence, $z0, -483251386);
                            }
                            if ($i0 < 5100) {
                                return Msg.toString($i0, charSequence, $z0, -36554249);
                            }
                            if ($i0 < 5400) {
                                if ($i0 == 5306) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.state ? 2 : 1;
                                    return 1;
                                } else if (5307 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 == 1 || 2 == $i0) {
                                        client.context.init($i0, 2114443801);
                                        return 1;
                                    }
                                } else if ($i0 == 5308) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 1775240613 * Main.this$0.value;
                                    return 1;
                                } else if ($i0 != 5309) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if (1 == $i0 || 2 == $i0) {
                                        $i03 = $i0 * 1983339053;
                                        $i0 = $i03;
                                        Main.this$0.value = $i03;
                                        KeyPair.toString(-1207668997);
                                        return 1;
                                    }
                                }
                            } else if ($i0 < 5600) {
                                if ($i0 == 5504) {
                                    type -= 1905859466;
                                    $i0 = this$0[type * 537618701];
                                    $i1 = this$0[(type * 537618701) + 1];
                                    if (!client.dir) {
                                        Stream.set($i0, $i1, -2062366712);
                                        return 1;
                                    }
                                } else if ($i0 == 5505) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.tag * 1679658745;
                                    return 1;
                                } else if (5506 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.level * -198683079;
                                    return 1;
                                } else if (5530 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 >= 0) {
                                        $i1 = $i0;
                                    }
                                    client.cursor = $i1 * -1089737365;
                                    return 1;
                                } else if ($i0 != 5531) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
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
                                return $i0 < 6600 ? Chart.parse($i0, charSequence, $z0, 820734962) : $i0 < 6700 ? Config.parse($i0, charSequence, $z0, -2145227718) : 2;
                            } else {
                                if ($i0 == 6200) {
                                    type -= 1905859466;
                                    client.TAG = (short) this$0[type * 537618701];
                                    if (client.TAG <= (short) 0) {
                                        client.TAG = (short) 256;
                                    }
                                    client.instance = (short) this$0[(type * 537618701) + 1];
                                    if (client.instance <= (short) 0) {
                                        client.instance = (short) 205;
                                        return 1;
                                    }
                                } else if ($i0 == 6201) {
                                    type -= 1905859466;
                                    client.counter = (short) this$0[type * 537618701];
                                    if (client.counter <= (short) 0) {
                                        client.counter = (short) 256;
                                    }
                                    client.order = (short) this$0[(type * 537618701) + 1];
                                    if (client.order <= (short) 0) {
                                        client.order = (short) 320;
                                        return 1;
                                    }
                                } else if (6202 == $i0) {
                                    type -= -483248364;
                                    client.line = (short) this$0[type * 537618701];
                                    if (client.line <= (short) 0) {
                                        client.line = (short) 1;
                                    }
                                    client.left = (short) this$0[(type * 537618701) + 1];
                                    if (client.left <= (short) 0) {
                                        client.left = Short.MAX_VALUE;
                                    } else {
                                        if (client.left < client.line) {
                                            client.left = client.line;
                                        }
                                    }
                                    client.last = (short) this$0[(type * 537618701) + 2];
                                    if (client.last <= (short) 0) {
                                        client.last = (short) 1;
                                    }
                                    client.max = (short) this$0[(type * 537618701) + 3];
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
                                        MultiInputStream.init(0, 0, 256177861 * client.options.this$0, 57307023 * client.options.$assertionsDisabled, false, -1199401814);
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = 2140963035 * client.mCurrent;
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = client.page * -1949120505;
                                        return 1;
                                    }
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    return 1;
                                } else if ($i0 == 6204) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.counter;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.order;
                                    return 1;
                                } else if (6205 != $i0) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.TAG;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
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

    static void read(ArrayList arrayList, int i) {
        int $i1;
        int $i3;
        CharSequence $r6;
        CharSequence $r7;
        Throwable $r16;
        Object[] $r1 = arrayList.size;
        if (Page.toString(182090275 * arrayList.header, (byte) -110)) {
            SparseFieldVector.value = (MediaType) $r1[0];
            ByteBufferList $r5 = ByteBufferList.data[SparseFieldVector.value.length * -235703048];
            $i1 = arrayList.header * 182090275;
            $i3 = -1490254486 * $r5.type;
            $r6 = Resources.toString(TwofishEngine.af(1404154115 * $r5.this$0, $i1, 735380873), $i1, -2034917812);
            $r7 = $r6;
            if ($r6 == null) {
                $r6 = Resources.toString(((40000 + $i3) << 8) + $i1, $i1, -1858495796);
                $r7 = $r6;
                if ($r6 == null) {
                    $r7 = null;
                }
            }
        } else {
            $r7 = Attribute.toString(((Integer) $r1[0]).intValue(), -1721913271);
        }
        if ($r7 != null) {
            int $i4;
            int $i42;
            int $i5;
            String $r14;
            type = 0;
            value = 0;
            int[] $r9 = $r7.value;
            int[] $r10 = $r7.data;
            offset = 0;
            AssertionError.value = new int[(407879525 * $r7.pos)];
            $i1 = 0;
            Target.value = new String[($r7.head * 1952290069)];
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
                    if (-1728773917 == $i42) {
                        $i5 = -1050573046 * arrayList.count;
                    }
                    if (-454428760 == $i5) {
                        $i5 = 1604438419 * arrayList.value;
                    }
                    if ($i5 == -2006000562) {
                        if (arrayList.name != null) {
                            $i4 = arrayList.name;
                            $r13 = $i4;
                            $i5 = $i4.value * 1172750087;
                        } else {
                            $i5 = -1;
                        }
                    }
                    if ($i5 == -1795160421) {
                        $i5 = arrayList.pos * 465966367;
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
                    if ($i5 == -1525642635) {
                        if (arrayList.parent != null) {
                            $i4 = arrayList.parent;
                            $r13 = $i4;
                            $i5 = $i4.value * 1172750087;
                        } else {
                            $i5 = -1;
                        }
                    }
                    if (-1008433288 == $i5) {
                        if (arrayList.parent != null) {
                            $i4 = arrayList.parent;
                            $r13 = $i4;
                            $i5 = $i4.next * 2091887404;
                        } else {
                            $i5 = -1;
                        }
                    }
                    if (-1054734007 == $i5) {
                        $i5 = 1094872107 * arrayList.head;
                    }
                    AssertionError.value[$i1] = $i5 == -2147483639 ? arrayList.channel * 361884663 : $i5;
                    $i1++;
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
                        $i1 = -1;
                    }
                } else {
                    $i42 = $i2;
                }
                $i3++;
                $i2 = $i42;
            }
            $i2 = 0;
            index = arrayList.branch * -2064366074;
            $i1 = -1;
            $i3 = -1;
            while (true) {
                $i2++;
                if ($i2 > i) {
                    throw new RuntimeException();
                }
                $i3++;
                $i1 = $r9[$i3];
                if ($i1 >= 100) {
                    switch (Byte.read($i1, $r7, $r7.data[$i3] == 1, (byte) -51)) {
                        case 0:
                            break;
                        case 1:
                            continue;
                        case 2:
                            throw new IllegalStateException();
                        default:
                            continue;
                    }
                } else if ($i1 == 0) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * -227038924) - 1] = $r10[$i3];
                } else if ($i1 == 1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - 945588302;
                    type = $i5;
                    $r11[($i5 * 537618701) - 1] = Event.this$0[$i42];
                } else if ($i1 == 2) {
                    $i42 = $r10[$i3];
                    $r11 = Event.this$0;
                    $r21 = this$0;
                    $i5 = type - 1732272619;
                    type = $i5;
                    $r11[$i42] = $r21[$i5 * -1000344808];
                    IOUtils.update($i42, -948701986);
                } else if (3 == $i1) {
                    $r12 = data;
                    $i42 = value - 1151509123;
                    value = $i42;
                    $r12[($i42 * 1422344447) - 1] = $r7.length[$i3];
                } else if ($i1 == 6) {
                    $i3 = $r10[$i3] + $i3;
                } else if ($i1 == 7) {
                    type -= 1905859466;
                    if (this$0[(537618701 * type) + 1] != this$0[537618701 * type]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (8 == $i1) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] == this$0[(type * 730925423) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 9) {
                    type -= 1905859466;
                    if (this$0[-1614894283 * type] < this$0[(905414603 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 10) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] > this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (21 == $i1) {
                    if (1480692390 * offset != 0) {
                        $r19 = count;
                        $i3 = offset - -1472268760;
                        offset = $i3;
                        PathParser $r20 = $r19[$i3 * 461026031];
                        $r7 = $r20.name;
                        $i3 = $r20.count;
                        AssertionError.value = $r20.value;
                        Target.value = $r20.data;
                        $r10 = $r7.data;
                        $r9 = $r7.value;
                        $i3 *= -132320779;
                    } else {
                        return;
                    }
                } else if ($i1 == 25) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - 1194553915;
                    type = $i5;
                    $r11[($i5 * 537618701) - 1] = IOException.toString($i42, 998830794);
                } else if (27 == $i1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    Identifier.toString($i42, $r11[$i5 * -154332925], (short) 2310);
                } else if ($i1 == 31) {
                    type -= 1905859466;
                    if (this$0[-318558518 * type] <= this$0[(-1946694937 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (112184396 == $i1) {
                    type -= 2000302847;
                    if (this$0[type * 537618701] >= this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 33) {
                    $r11 = this$0;
                    $i42 = type - 189254226;
                    type = $i42;
                    $r11[($i42 * -688522194) - 1] = AssertionError.value[$r10[$i3]];
                } else if (-2066126186 == $i1) {
                    $r11 = AssertionError.value;
                    $i42 = $r10[$i3];
                    $r21 = this$0;
                    $i5 = type - -1607193923;
                    type = $i5;
                    $r11[$i42] = $r21[$i5 * 537618701];
                } else if ($i1 == 35) {
                    $r12 = data;
                    $i42 = value - 737069681;
                    value = $i42;
                    $r12[($i42 * 373566052) - 1] = Target.value[$r10[$i3]];
                } else if ($i1 == 36) {
                    $r12 = Target.value;
                    $i42 = $r10[$i3];
                    String[] $r22 = data;
                    $i5 = value - 828667997;
                    value = $i5;
                    $r12[$i42] = $r22[$i5 * 542232649];
                } else if ($i1 == -62367621) {
                    $i42 = $r10[$i3];
                    value -= 1006842196 * $i42;
                    $r12 = data;
                    $i5 = -1267697097 * value;
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
                            if ($r14 == null) {
                                $i7 += 4;
                            } else {
                                try {
                                    $i7 += $r14.length();
                                } catch (Exception e2) {
                                    $r16 = e2;
                                }
                            }
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
                    $r12 = data;
                    $i42 = value - 146758249;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r14;
                } else if (38 == $i1) {
                    type -= -1078349548;
                } else if (39 == $i1) {
                    value -= -1246602361;
                } else if ($i1 == 40) {
                    $r6 = Attribute.toString($r10[$i3], -749958224);
                    $r10 = new int[(359133038 * $r6.pos)];
                    String[] $r12 = $r6.head * -1758808353;
                    String[] strArr = $r12;
                    $r12 = new String[$r12];
                    for ($i42 = 0; $i42 < $r6.size * -492945279; $i42++) {
                        $i4 = (type * 537618701) - ($r6.size * 1440565427);
                        $i5 = $i4;
                        $r10[$i42] = this$0[$i4 + $i42];
                    }
                    for ($i42 = 0; $i42 < 483841497 * $r6.name; $i42++) {
                        $i4 = (value * -1267697097) - (-951204749 * $r6.name);
                        $i5 = $i4;
                        $r12[$i42] = data[$i4 + $i42];
                    }
                    type -= -1280206510 * $r6.size;
                    value -= 400755115 * $r6.name;
                    $i4 = new PathParser();
                    $i4.name = $r7;
                    $i4.count = -475434403 * $i3;
                    $i4.value = AssertionError.value;
                    $i4.data = Target.value;
                    $r19 = count;
                    $i3 = offset - 1432768827;
                    offset = $i3;
                    $r19[($i3 * 1547997781) - 1] = $i4;
                    AssertionError.value = $r10;
                    Target.value = $r12;
                    $r10 = $r6.data;
                    $r9 = $r6.value;
                    $r7 = $r6;
                    $i3 = -1;
                } else if (-417641592 == $i1) {
                    $r11 = this$0;
                    $i42 = type - 1553828577;
                    type = $i42;
                    $r11[($i42 * -1275765528) - 1] = Connection.this$0.size($r10[$i3], 1905649359);
                } else if ($i1 == -408169791) {
                    $r23 = Connection.this$0;
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -2007759774;
                    type = $i5;
                    $r23.add($i42, $r11[$i5 * 537618701], -1247855648);
                } else if (44 == $i1) {
                    $i42 = $r10[$i3] >> 16;
                    $i5 = 65535 & $r10[$i3];
                    $r11 = this$0;
                    $i7 = type - 1089377259;
                    type = $i7;
                    $i7 = $r11[$i7 * 537618701];
                    if ($i7 < 0 || $i7 > 1129533158) {
                        throw new RuntimeException();
                    }
                    name[$i42] = $i7;
                    int i2 = -1;
                    if ($i5 == 105) {
                        i2 = 0;
                    }
                    for ($i5 = 0; $i5 < $i7; $i5++) {
                        size[$i42][$i5] = i2;
                    }
                } else if (-487238594 == $i1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -493250260;
                    type = $i5;
                    $i5 = $r11[$i5 * 537618701];
                    if ($i5 < 0 || $i5 >= name[$i42]) {
                        throw new RuntimeException();
                    }
                    $r11 = this$0;
                    $i7 = type + 60360334;
                    type = $i7;
                    $r11[($i7 * 37438479) - 1] = size[$i42][$i5];
                } else if ($i1 == -219932604) {
                    $i42 = $r10[$i3];
                    type -= 1905859466;
                    $i5 = this$0[537618701 * type];
                    if ($i5 < 0 || $i5 >= name[$i42]) {
                        throw new RuntimeException();
                    }
                    size[$i42][$i5] = this$0[(type * -1020059551) + 1];
                } else if ($i1 == 47) {
                    $r14 = Connection.this$0.get($r10[$i3], -1514635107);
                    String $r25 = $r14;
                    if ($r14 == null) {
                        $r25 = R$id.this$0;
                    }
                    $r12 = data;
                    $i42 = value - 1649055793;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r25;
                } else if ($i1 == 1216370267) {
                    $r23 = Connection.this$0;
                    $i42 = $r10[$i3];
                    $r12 = data;
                    $i5 = value - -196408125;
                    value = $i5;
                    $r23.put($i42, $r12[$i5 * 2102353812], -817095256);
                } else if (60 == $i1) {
                    Date $r27 = $r7.offset[$r10[$i3]];
                    $r11 = this$0;
                    $i42 = type - -1194553915;
                    type = $i42;
                    Value $r29 = (Value) $r27.get((long) $r11[$i42 * 1391253640]);
                    if ($r29 != null) {
                        $i3 = $r29.value + $i3;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return;
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("").append($r7.size).append(" ");
        for (i = (344694797 * offset) - 1; i >= 0; i--) {
            StringBuilder $r18 = stringBuilder.append("");
            long $l6 = count[i].name;
            $r7 = $l6;
            $r18.append($l6.size).append(" ");
        }
        stringBuilder.append("").append($i1);
        JSONArray.get(stringBuilder.toString(), $r16, (short) 21738);
    }

    static int render(int $i0, CharSequence charSequence, boolean z) {
        System $r2;
        boolean $z1 = false;
        if ($i0 >= 2000) {
            $i0 -= 1000;
            int[] $r1 = this$0;
            int $i1 = type - -1194553915;
            type = $i1;
            $r2 = ArrayList.get($r1[$i1 * 537618701], 488191313);
        } else {
            $r2 = z ? Constants.data : state;
        }
        client.add($r2, (byte) 105);
        if (1200 == $i0 || $i0 == 1205 || 1212 == $i0) {
            type -= 1905859466;
            $i1 = this$0[type * 537618701];
            int $i2 = this$0[(type * 537618701) + 1];
            $r2.left = -1404216569 * $i1;
            $r2.offset = $i2 * 895045473;
            Message $r3 = Set.get($i1, 1613158220);
            $r2.data = $r3.parent * -1010358009;
            $r2.count = $r3.level * -1123242253;
            $r2.instance = -1813573947 * $r3.f217x;
            $r2.startTime = $r3.index * -1211168499;
            $r2.progress = 1928138403 * $r3.key;
            $r2.state = $r3.data * -136593549;
            if ($i0 == 1205) {
                $r2.body = 0;
            } else {
                z = $i0 == 1212;
                if ($r3.name * 1099170281 == 1) {
                    $z1 = true;
                }
                if (z | $z1) {
                    $r2.body = -144948821;
                } else {
                    $r2.body = -289897642;
                }
            }
            if (1535179975 * $r2.filter > 0) {
                $r2.state = (($r2.state * -1336947680) / ($r2.filter * 1535179975)) * 62563745;
                return 1;
            } else if ($r2.f300x * 1506390075 > 0) {
                $r2.state = (($r2.state * -1336947680) / (1506390075 * $r2.f300x)) * 62563745;
                return 1;
            }
        } else if (1201 == $i0) {
            $r2.status = -1427487042;
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.text = $r1[$i0 * 537618701] * -174447253;
            return 1;
        } else if (1202 != $i0) {
            return 2;
        } else {
            $r2.status = -2141230563;
            $r2.text = File.this$0.this$0.toString((byte) 29) * -174447253;
        }
        return 1;
    }

    static int reset(int $i0, CharSequence charSequence, boolean z) {
        int $i1;
        System $r2;
        boolean $z1 = false;
        if ($i0 >= 2000) {
            $i0 -= 1000;
            int[] $r1 = this$0;
            $i1 = type - -1194553915;
            type = $i1;
            $i1 = $r1[$i1 * 537618701];
            $r2 = ArrayList.get($i1, 743154379);
        } else {
            $r2 = z ? Constants.data : state;
            $i1 = -1;
        }
        int $i02;
        if (1100 == $i0) {
            type -= 1905859466;
            $r2.f292i = 1859612037 * this$0[type * 537618701];
            if ($r2.f292i * -2091547827 > (1151268625 * $r2.cursor) - ($r2.this$0 * 256177861)) {
                $i02 = ($r2.cursor * 588224725) - ($r2.this$0 * 827921753);
                $i0 = $i02;
                $r2.f292i = $i02;
            }
            if ($r2.f292i * -2091547827 < 0) {
                $r2.f292i = 0;
            }
            $i02 = this$0[(type * 537618701) + 1] * 274170433;
            $i0 = $i02;
            $r2.size = $i02;
            if (654937537 * $r2.size > ($r2.buf * -1243953689) - (57307023 * $r2.$assertionsDisabled)) {
                $i02 = (-158560857 * $r2.buf) - ($r2.$assertionsDisabled * -1002049201);
                $i0 = $i02;
                $r2.size = $i02;
            }
            if (654937537 * $r2.size < 0) {
                $r2.size = 0;
            }
            client.add($r2, (byte) 46);
            return 1;
        } else if ($i0 == 1101) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i02 = $r1[$i0 * 537618701] * -1456194309;
            $i0 = $i02;
            $r2.index = $i02;
            client.add($r2, (byte) 66);
            return 1;
        } else if (1102 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.level = $r1[$i0 * 537618701] == 1;
            client.add($r2, (byte) 108);
            return 1;
        } else if ($i0 == 1103) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i02 = $r1[$i0 * 537618701] * -1014705653;
            $i0 = $i02;
            $r2.result = $i02;
            client.add($r2, (byte) 74);
            return 1;
        } else if (1104 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i02 = $r1[$i0 * 537618701] * 1820900823;
            $i0 = $i02;
            $r2.files = $i02;
            client.add($r2, (byte) 41);
            return 1;
        } else if ($i0 == 1105) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i02 = $r1[$i0 * 537618701] * -1237459785;
            $i0 = $i02;
            $r2.path = $i02;
            client.add($r2, (byte) 118);
            return 1;
        } else if ($i0 == 1106) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i02 = $r1[$i0 * 537618701] * 84768945;
            $i0 = $i02;
            $r2.code = $i02;
            client.add($r2, (byte) 48);
            return 1;
        } else if (1107 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r1[$i0 * 537618701] == 1) {
                $z1 = true;
            }
            $r2.first = $z1;
            client.add($r2, (byte) 105);
            return 1;
        } else if ($i0 == 1108) {
            $r2.status = -713743521;
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i02 = $r1[$i0 * 537618701] * -174447253;
            $i0 = $i02;
            $r2.text = $i02;
            client.add($r2, (byte) 52);
            return 1;
        } else if (1109 == $i0) {
            type -= 1422611102;
            $i02 = this$0[type * 537618701] * 1819609725;
            $i0 = $i02;
            $r2.startTime = $i02;
            $r2.progress = 432797755 * this$0[(type * 537618701) + 1];
            $r2.data = 770408497 * this$0[(type * 537618701) + 2];
            $r2.count = -41487175 * this$0[(type * 537618701) + 3];
            $r2.instance = 842525423 * this$0[(type * 537618701) + 4];
            $i02 = this$0[(type * 537618701) + 5] * 62563745;
            $i0 = $i02;
            $r2.state = $i02;
            client.add($r2, (byte) 54);
            return 1;
        } else {
            if (1110 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $i0 = $r1[$i0 * 537618701];
                if ($r2.parent * -1332946961 != $i0) {
                    $i02 = $i0 * 2102736655;
                    $i0 = $i02;
                    $r2.parent = $i02;
                    $r2.buffer = 0;
                    $r2.cnt = 0;
                    client.add($r2, (byte) 16);
                    return 1;
                }
            } else if (1111 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.duration = $z1;
                client.add($r2, (byte) 42);
                return 1;
            } else if ($i0 == 1112) {
                String[] $r5 = data;
                $i0 = value - -1246602361;
                value = $i0;
                String $r6 = $r5[$i0 * -1267697097];
                if (!$r6.equals($r2.file)) {
                    $r2.file = $r6;
                    client.add($r2, (byte) 27);
                    return 1;
                }
            } else if ($i0 == 1113) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $i02 = $r1[$i0 * 537618701] * -343733379;
                $i0 = $i02;
                $r2.uri = $i02;
                client.add($r2, (byte) 20);
                return 1;
            } else if (1114 == $i0) {
                type -= 711305551;
                $r2.f286c = 1287571003 * this$0[type * 537618701];
                $r2.f287d = 1411930085 * this$0[(type * 537618701) + 1];
                $i02 = this$0[(type * 537618701) + 2] * 1969493363;
                $i0 = $i02;
                $r2.f289f = $i02;
                client.add($r2, (byte) 81);
                return 1;
            } else if (1115 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.header = $z1;
                client.add($r2, (byte) 119);
                return 1;
            } else if ($i0 == 1116) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $i02 = $r1[$i0 * 537618701] * 1914751949;
                $i0 = $i02;
                $r2.mData = $i02;
                client.add($r2, (byte) 20);
                return 1;
            } else if ($i0 == 1117) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $i02 = $r1[$i0 * 537618701] * 728184399;
                $i0 = $i02;
                $r2.list = $i02;
                client.add($r2, (byte) 84);
                return 1;
            } else if ($i0 == 1118) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.resource = $z1;
                client.add($r2, (byte) 66);
                return 1;
            } else if ($i0 == 1119) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.user = $z1;
                client.add($r2, (byte) 48);
                return 1;
            } else if (1120 == $i0) {
                type -= 1905859466;
                $r2.cursor = 808245745 * this$0[type * 537618701];
                $i02 = this$0[(type * 537618701) + 1] * 1611562455;
                $i0 = $i02;
                $r2.buf = $i02;
                client.add($r2, (byte) 43);
                if ($i1 != -1 && $r2.name * -128421835 == 0) {
                    Model.write(Float.size[$i1 >> 16], $r2, false, (byte) -22);
                    return 1;
                }
            } else if ($i0 == 1121) {
                R$id.init(1172750087 * $r2.value, 2102445939 * $r2.next, (byte) 0);
                client.buffer = $r2;
                client.add($r2, (byte) 40);
                return 1;
            } else if ($i0 == 1122) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $i02 = $r1[$i0 * 537618701] * 245383255;
                $i0 = $i02;
                $r2.hash = $i02;
                client.add($r2, (byte) 6);
                return 1;
            } else if (1123 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $i02 = $r1[$i0 * 537618701] * 1982744395;
                $i0 = $i02;
                $r2.current = $i02;
                client.add($r2, (byte) 80);
                return 1;
            } else if (1124 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $i02 = $r1[$i0 * 537618701] * -236421259;
                $i0 = $i02;
                $r2.source = $i02;
                client.add($r2, (byte) 72);
                return 1;
            } else if ($i0 == 1125) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                Reader $r9 = (Reader) Calendar.add(new Reader[]{Reader.in, Reader.log, Reader.lock, Reader.queue, Reader.mHandler}, $r1[$i0 * 537618701], (byte) 122);
                if ($r9 != null) {
                    $r2.err = $r9;
                    client.add($r2, (byte) 10);
                    return 1;
                }
            } else if (1126 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.date = $z1;
                return 1;
            } else if ($i0 != 1127) {
                return 2;
            } else {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.error = $z1;
                return 1;
            }
            return 1;
        }
    }

    static int run(int $i0, CharSequence charSequence, boolean $z0) {
        int $i1 = 0;
        int $i2;
        int $i3;
        System $r6;
        int $i02;
        int[] $r1;
        if ($i0 < 1000) {
            int i;
            if (100 == $i0) {
                type -= 711305551;
                $i2 = this$0[type * 537618701];
                $i3 = this$0[(type * 537618701) + 1];
                $i0 = this$0[(type * 537618701) + 2];
                if ($i3 == 0) {
                    throw new RuntimeException();
                }
                System[] $r7;
                $r6 = ArrayList.get($i2, 1857863263);
                if ($r6.key == null) {
                    $r7 = new System[($i0 + 1)];
                    $r6.key = $r7;
                }
                $r7 = $r6.key;
                if ($r7.length <= $i0) {
                    System[] $r72 = new System[($i0 + 1)];
                    while (true) {
                        $r7 = $r6.key;
                        if ($i1 >= $r7.length) {
                            break;
                        }
                        $r72[$i1] = $r6.key[$i1];
                        $i1++;
                    }
                    $r6.key = $r72;
                }
                if ($i0 <= 0 || $r6.key[$i0 - 1] != null) {
                    $i02 = new System();
                    $i02.name = $i3 * 97215005;
                    $i1 = $r6.value * 1;
                    $i02.value = $i1;
                    $i02.type = $i1 * 1790940165;
                    $i02.next = -1063340613 * $i0;
                    $i02.position = true;
                    $r6.key[$i0] = $i02;
                    if ($z0) {
                        Constants.data = $i02;
                    } else {
                        state = $i02;
                    }
                    client.add($r6, (byte) 121);
                    i = 1;
                } else {
                    throw new RuntimeException("" + ($i0 - 1));
                }
            } else if ($i0 == 101) {
                $r6 = $z0 ? Constants.data : state;
                System $r9 = ArrayList.get($r6.value * 1172750087, 436049493);
                $r9.key[$r6.next * 2102445939] = null;
                client.add($r9, (byte) 30);
                i = 1;
            } else if (102 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r6 = ArrayList.get($r1[$i0 * 537618701], 564447666);
                $r6.key = null;
                client.add($r6, (byte) 120);
                i = 1;
            } else if ($i0 == 200) {
                type -= 1905859466;
                $i0 = this$0[type * 537618701];
                $i1 = this$0[(type * 537618701) + 1];
                $r6 = DTrace.add($i0, $i1, (byte) 123);
                if ($r6 == null || -1 == $i1) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r6;
                    } else {
                        state = $r6;
                    }
                }
                i = 1;
            } else if (201 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r6 = ArrayList.get($r1[$i0 * 537618701], 1825216870);
                if ($r6 != null) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 1;
                    if ($z0) {
                        Constants.data = $r6;
                    } else {
                        state = $r6;
                    }
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                }
                i = 1;
            } else {
                i = 2;
            }
            return i;
        } else if ($i0 < 1100) {
            return DocWriter.add($i0, charSequence, $z0, (byte) 36);
        } else {
            if ($i0 < 1200) {
                return FileHeader.init($i0, charSequence, $z0, -1073153195);
            }
            if ($i0 < 1300) {
                return FileHeader.parse($i0, charSequence, $z0, (byte) -28);
            }
            if ($i0 < 1400) {
                return Build$VERSION.parse($i0, charSequence, $z0, 387092651);
            }
            if ($i0 < 1500) {
                return Timer.init($i0, charSequence, $z0, 2142624698);
            }
            if ($i0 < 1600) {
                return Database.parse($i0, charSequence, $z0, -272687888);
            }
            if ($i0 < 1700) {
                return Map.parse($i0, charSequence, $z0, 782921389);
            }
            if ($i0 < 1800) {
                $r6 = $z0 ? Constants.data : state;
                if (1700 == $i0) {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r6.left * -868539721;
                    return 1;
                } else if (1701 == $i0) {
                    if (-868539721 * $r6.left != -1) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.offset * -1148087135;
                        return 1;
                    }
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = 0;
                    return 1;
                } else if ($i0 != 1702) {
                    return 2;
                } else {
                    $r1 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r1[($i0 * 537618701) - 1] = $r6.next * 2102445939;
                    return 1;
                }
            } else if ($i0 < 1900) {
                return Cell.toString($i0, charSequence, $z0, 331766706);
            } else {
                if ($i0 < 2000) {
                    return Cell.parse($i0, charSequence, $z0, -1522754930);
                }
                if ($i0 < 2100) {
                    return DocWriter.add($i0, charSequence, $z0, (byte) 11);
                }
                if ($i0 < 2200) {
                    return FileHeader.init($i0, charSequence, $z0, -91733529);
                }
                if ($i0 < 2300) {
                    return FileHeader.parse($i0, charSequence, $z0, (byte) 106);
                }
                if ($i0 < 2400) {
                    return Build$VERSION.parse($i0, charSequence, $z0, -906746226);
                }
                if ($i0 < 2500) {
                    return Timer.init($i0, charSequence, $z0, 2142624698);
                }
                if ($i0 < 2600) {
                    $r1 = this$0;
                    $i3 = type - -1194553915;
                    type = $i3;
                    $r6 = ArrayList.get($r1[$i3 * 537618701], 350075350);
                    if ($i0 == 2500) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.head * 642824123;
                        return 1;
                    } else if (2501 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.max * 384720325;
                        return 1;
                    } else if (2502 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.this$0 * 256177861;
                        return 1;
                    } else if ($i0 == 2503) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.$assertionsDisabled * 57307023;
                        return 1;
                    } else if (2504 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r6.start) {
                            $i1 = 1;
                        }
                        $r1[$i0] = $i1;
                        return 1;
                    } else if ($i0 != 2505) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.type * -1008623461;
                        return 1;
                    }
                } else if ($i0 < 2700) {
                    $r1 = this$0;
                    $i3 = type - -1194553915;
                    type = $i3;
                    $r6 = ArrayList.get($r1[$i3 * 537618701], 1610138050);
                    if ($i0 == 2600) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.f292i * -2091547827;
                        return 1;
                    } else if (2601 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.size * 654937537;
                        return 1;
                    } else if ($i0 == 2602) {
                        $r4 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r4[($i0 * -1267697097) - 1] = $r6.file;
                        return 1;
                    } else if ($i0 == 2603) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.cursor * 1151268625;
                        return 1;
                    } else if ($i0 == 2604) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.buf * -1243953689;
                        return 1;
                    } else if (2605 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.state * 2105704033;
                        return 1;
                    } else if ($i0 == 2606) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.data * -1375479599;
                        return 1;
                    } else if (2607 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.instance * -1211464689;
                        return 1;
                    } else if ($i0 == 2608) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.count * -2032348791;
                        return 1;
                    } else if ($i0 == 2609) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.result * -479221341;
                        return 1;
                    } else if (2610 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.source * -1726277411;
                        return 1;
                    } else if (2611 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.index * 334261811;
                        return 1;
                    } else if (2612 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.current * 1703184995;
                        return 1;
                    } else if (2613 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.err.get(718081459);
                        return 1;
                    } else if (2614 != $i0) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $i0 = ($i0 * 537618701) - 1;
                        if ($r6.error) {
                            $i1 = 1;
                        }
                        $r1[$i0] = $i1;
                        return 1;
                    }
                } else if ($i0 < 2800) {
                    if ($i0 == 2700) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $r6 = ArrayList.get($r1[$i0 * 537618701], 746275757);
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = $r6.left * -868539721;
                        return 1;
                    } else if ($i0 == 2701) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $r6 = ArrayList.get($r1[$i0 * 537618701], 2054952612);
                        if ($r6.left * -868539721 != -1) {
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r6.offset * -1148087135;
                            return 1;
                        }
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if ($i0 == 2702) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        if (((Character) client.position.get((long) $r1[$i0 * 537618701])) != null) {
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = 1;
                            return 1;
                        }
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != $i0) {
                        return 2;
                    } else {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = 1704673651 * client.parent;
                        return 1;
                    }
                } else if ($i0 < 2900) {
                    $r1 = this$0;
                    $i1 = type - -1194553915;
                    type = $i1;
                    $r6 = ArrayList.get($r1[$i1 * 537618701], 662756657);
                    if (2800 == $i0) {
                        $r1 = this$0;
                        $i0 = type - 1194553915;
                        type = $i0;
                        $r1[($i0 * 537618701) - 1] = (JSONArray.get($r6, -699149418) >> 11) & 63;
                        return 1;
                    } else if (2801 == $i0) {
                        $r1 = this$0;
                        $i0 = type - -1194553915;
                        type = $i0;
                        $i0 = $r1[$i0 * 537618701] - 1;
                        if ($r6.format != null) {
                            String[] $r4 = $r6.format;
                            if ($i0 < $r4.length && $r6.format[$i0] != null) {
                                $r4 = data;
                                $i1 = value - 1246602361;
                                value = $i1;
                                $r4[($i1 * -1267697097) - 1] = $r6.format[$i0];
                                return 1;
                            }
                        }
                        $r4 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r4[($i0 * -1267697097) - 1] = "";
                        return 1;
                    } else if ($i0 != 2802) {
                        return 2;
                    } else {
                        if ($r6.id == null) {
                            $r4 = data;
                            $i0 = value - 1246602361;
                            value = $i0;
                            $r4[($i0 * -1267697097) - 1] = "";
                            return 1;
                        }
                        $r4 = data;
                        $i0 = value - 1246602361;
                        value = $i0;
                        $r4[($i0 * -1267697097) - 1] = $r6.id;
                        return 1;
                    }
                } else if ($i0 < 3000) {
                    return Cell.parse($i0, charSequence, $z0, 2038695401);
                } else {
                    if ($i0 < 3200) {
                        return Character.parse($i0, charSequence, $z0, -331111033);
                    }
                    if ($i0 < 3300) {
                        return Option.parse($i0, charSequence, $z0, -593781161);
                    }
                    if ($i0 < 3400) {
                        return ZStream.toString($i0, charSequence, $z0, 16711935);
                    }
                    int $i4;
                    if ($i0 < 3500) {
                        ByteVector $r3;
                        if (3400 == $i0) {
                            type -= 1905859466;
                            $i0 = this$0[type * 537618701];
                            $i3 = this$0[(type * 537618701) + 1];
                            $r3 = CSVReader.add($i0, -282531470);
                            if ('s' != $r3.value) {
                                while ($i1 < -112083573 * $r3.count) {
                                    if ($i3 != $r3.index[$i1]) {
                                        $r4 = data;
                                        $i0 = value - 1246602361;
                                        value = $i0;
                                        $r4[($i0 * -1267697097) - 1] = $r3.length[$i1];
                                        $r3 = null;
                                        break;
                                    }
                                    $i1++;
                                }
                                if ($r3 != null) {
                                    $r4 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r4[($i0 * -1267697097) - 1] = $r3.size;
                                    return 1;
                                }
                            }
                            while ($i1 < -112083573 * $r3.count) {
                                if ($i3 != $r3.index[$i1]) {
                                    $r4 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r4[($i0 * -1267697097) - 1] = $r3.length[$i1];
                                    $r3 = null;
                                    break;
                                }
                                $i1++;
                            }
                            if ($r3 != null) {
                                $r4 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r4[($i0 * -1267697097) - 1] = $r3.size;
                                return 1;
                            }
                            if ($i1 < -112083573 * $r3.count) {
                                if ($i3 != $r3.index[$i1]) {
                                    $r4 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r4[($i0 * -1267697097) - 1] = $r3.length[$i1];
                                    $r3 = null;
                                    break;
                                }
                                $i1++;
                            }
                            if ($r3 != null) {
                                $r4 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r4[($i0 * -1267697097) - 1] = $r3.size;
                                return 1;
                            }
                        } else if (3408 == $i0) {
                            type -= -483248364;
                            char $i32 = this$0[type * 537618701];
                            char $i03 = this$0[(type * 537618701) + 1];
                            $i2 = this$0[(type * 537618701) + 2];
                            $i4 = this$0[(type * 537618701) + 3];
                            $r3 = CSVReader.add($i2, -1586977394);
                            if ($r3.data == $i32 && $i03 == $r3.value) {
                                while ($i1 < -112083573 * $r3.count) {
                                    if ($i4 == $r3.index[$i1]) {
                                        if ($i03 == 's') {
                                            $r4 = data;
                                            $i3 = value - 1246602361;
                                            value = $i3;
                                            $r4[($i3 * -1267697097) - 1] = $r3.length[$i1];
                                        } else {
                                            $r1 = this$0;
                                            $i3 = type - 1194553915;
                                            type = $i3;
                                            $r1[($i3 * 537618701) - 1] = $r3.next[$i1];
                                        }
                                        $r3 = null;
                                        if ($r3 != null) {
                                            if ('s' != $i03) {
                                                $r4 = data;
                                                $i0 = value - 1246602361;
                                                value = $i0;
                                                $r4[($i0 * -1267697097) - 1] = $r3.size;
                                                return 1;
                                            }
                                            $r1 = this$0;
                                            $i0 = type - 1194553915;
                                            type = $i0;
                                            $r1[($i0 * 537618701) - 1] = $r3.current * -240948305;
                                            return 1;
                                        }
                                    }
                                    $i1++;
                                }
                                if ($r3 != null) {
                                    if ('s' != $i03) {
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = $r3.current * -240948305;
                                        return 1;
                                    }
                                    $r4 = data;
                                    $i0 = value - 1246602361;
                                    value = $i0;
                                    $r4[($i0 * -1267697097) - 1] = $r3.size;
                                    return 1;
                                }
                            } else if ($i03 == 's') {
                                $r4 = data;
                                $i0 = value - 1246602361;
                                value = $i0;
                                $r4[($i0 * -1267697097) - 1] = R$id.this$0;
                                return 1;
                            } else {
                                $r1 = this$0;
                                $i0 = type - 1194553915;
                                type = $i0;
                                $r1[($i0 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if ($i0 != 3411) {
                            return 2;
                        } else {
                            $r1 = this$0;
                            $i0 = type - -1194553915;
                            type = $i0;
                            $r3 = CSVReader.add($r1[$i0 * 537618701], 1812519497);
                            $r1 = this$0;
                            $i0 = type - 1194553915;
                            type = $i0;
                            $r1[($i0 * 537618701) - 1] = $r3.add((byte) 1);
                            return 1;
                        }
                    } else if ($i0 < 3700) {
                        return BoundingBox.parse($i0, charSequence, $z0, 2123082082);
                    } else {
                        if ($i0 < 4000) {
                            return Item.parse($i0, charSequence, $z0, (byte) -118);
                        }
                        if ($i0 < 4100) {
                            if ($i0 == 4000) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 + $i1;
                                return 1;
                            } else if (4001 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 - $i1;
                                return 1;
                            } else if ($i0 == 4002) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 * $i1;
                                return 1;
                            } else if (4003 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 / $i1;
                                return 1;
                            } else if (4004 == $i0) {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $i02 = Math.random() * ((double) $i0);
                                r26 = $i02;
                                $r1[($i1 * 537618701) - 1] = (int) $i02;
                                return 1;
                            } else if ($i0 == 4005) {
                                $r1 = this$0;
                                $i0 = type - -1194553915;
                                type = $i0;
                                $i0 = $r1[$i0 * 537618701];
                                $r1 = this$0;
                                $i1 = type - 1194553915;
                                type = $i1;
                                $i02 = Math.random() * ((double) ($i0 + 1));
                                r26 = $i02;
                                $r1[($i1 * 537618701) - 1] = (int) $i02;
                                return 1;
                            } else if (4006 == $i0) {
                                type -= -1677802279;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $i3 = this$0[(type * 537618701) + 2];
                                $i2 = this$0[(type * 537618701) + 3];
                                int $i11 = this$0[(type * 537618701) + 4];
                                $r1 = this$0;
                                $i4 = type - 1194553915;
                                type = $i4;
                                $r1[($i4 * 537618701) - 1] = $i0 + ((($i1 - $i0) * ($i11 - $i3)) / ($i2 - $i3));
                                return 1;
                            } else if (4007 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 + (($i1 * $i0) / 100);
                                return 1;
                            } else if ($i0 == 4008) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 | (1 << $i1);
                                return 1;
                            } else if (4009 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 & (-1 - (1 << $i1));
                                return 1;
                            } else if (4010 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i3 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i2 = type - 1194553915;
                                type = $i2;
                                $i2 = ($i2 * 537618701) - 1;
                                if (($i0 & (1 << $i3)) != 0) {
                                    $i1 = 1;
                                }
                                $r1[$i2] = $i1;
                                return 1;
                            } else if ($i0 == 4011) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 % $i1;
                                return 1;
                            } else if (4012 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = (int) Math.pow((double) $i0, (double) $i1);
                                return 1;
                            } else if (4013 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                if ($i0 == 0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                double $d0;
                                double d;
                                switch ($i1) {
                                    case 0:
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $r1[($i1 * 537618701) - 1] = $i0;
                                        return 1;
                                    case 2:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.sqrt($d0);
                                        return 1;
                                    case 3:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.cbrt($d0);
                                        return 1;
                                    case 4:
                                        $r1 = this$0;
                                        $i1 = type - 1194553915;
                                        type = $i1;
                                        $d0 = (double) $i0;
                                        d = $d0;
                                        $r1[($i1 * 537618701) - 1] = (int) Math.sqrt(Math.sqrt($d0));
                                        return 1;
                                    default:
                                        $r1 = this$0;
                                        $i3 = type - 1194553915;
                                        type = $i3;
                                        $r1[($i3 * 537618701) - 1] = (int) Math.pow((double) $i0, 1.0d / ((double) $i1));
                                        return 1;
                                }
                            } else if (4014 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 & $i1;
                                return 1;
                            } else if (4015 == $i0) {
                                type -= 1905859466;
                                $i0 = this$0[type * 537618701];
                                $i1 = this$0[(type * 537618701) + 1];
                                $r1 = this$0;
                                $i3 = type - 1194553915;
                                type = $i3;
                                $r1[($i3 * 537618701) - 1] = $i0 | $i1;
                                return 1;
                            } else if (4018 != $i0) {
                                return 2;
                            } else {
                                type -= 711305551;
                                long $l8 = (long) this$0[type * 537618701];
                                long $l9 = (long) this$0[(type * 537618701) + 1];
                                long $l10 = (long) this$0[(type * 537618701) + 2];
                                $r1 = this$0;
                                $i0 = type - 1194553915;
                                type = $i0;
                                $r1[($i0 * 537618701) - 1] = (int) (($l8 * $l10) / $l9);
                                return 1;
                            }
                        } else if ($i0 < 4200) {
                            return JSONArray.parse($i0, charSequence, $z0, -1339380354);
                        } else {
                            if ($i0 < 4300) {
                                return Short.parse($i0, charSequence, $z0, -396276527);
                            }
                            if ($i0 < 5100) {
                                return Msg.toString($i0, charSequence, $z0, 565482459);
                            }
                            if ($i0 < 5400) {
                                if ($i0 == 5306) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.state ? 2 : 1;
                                    return 1;
                                } else if (5307 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 == 1 || 2 == $i0) {
                                        client.context.init($i0, -628919830);
                                        return 1;
                                    }
                                } else if ($i0 == 5308) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = 1775240613 * Main.this$0.value;
                                    return 1;
                                } else if ($i0 != 5309) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if (1 == $i0 || 2 == $i0) {
                                        $i02 = $i0 * 1983339053;
                                        $i0 = $i02;
                                        Main.this$0.value = $i02;
                                        KeyPair.toString(-480187775);
                                        return 1;
                                    }
                                }
                            } else if ($i0 < 5600) {
                                if ($i0 == 5504) {
                                    type -= 1905859466;
                                    $i0 = this$0[type * 537618701];
                                    $i1 = this$0[(type * 537618701) + 1];
                                    if (!client.dir) {
                                        Stream.set($i0, $i1, -2086233489);
                                        return 1;
                                    }
                                } else if ($i0 == 5505) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.tag * 1679658745;
                                    return 1;
                                } else if (5506 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.level * -198683079;
                                    return 1;
                                } else if (5530 == $i0) {
                                    $r1 = this$0;
                                    $i0 = type - -1194553915;
                                    type = $i0;
                                    $i0 = $r1[$i0 * 537618701];
                                    if ($i0 >= 0) {
                                        $i1 = $i0;
                                    }
                                    client.cursor = $i1 * -1089737365;
                                    return 1;
                                } else if ($i0 != 5531) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
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
                                return $i0 < 6600 ? Chart.parse($i0, charSequence, $z0, 1717640738) : $i0 < 6700 ? Config.parse($i0, charSequence, $z0, -751569064) : 2;
                            } else {
                                if ($i0 == 6200) {
                                    type -= 1905859466;
                                    client.TAG = (short) this$0[type * 537618701];
                                    if (client.TAG <= (short) 0) {
                                        client.TAG = (short) 256;
                                    }
                                    client.instance = (short) this$0[(type * 537618701) + 1];
                                    if (client.instance <= (short) 0) {
                                        client.instance = (short) 205;
                                        return 1;
                                    }
                                } else if ($i0 == 6201) {
                                    type -= 1905859466;
                                    client.counter = (short) this$0[type * 537618701];
                                    if (client.counter <= (short) 0) {
                                        client.counter = (short) 256;
                                    }
                                    client.order = (short) this$0[(type * 537618701) + 1];
                                    if (client.order <= (short) 0) {
                                        client.order = (short) 320;
                                        return 1;
                                    }
                                } else if (6202 == $i0) {
                                    type -= -483248364;
                                    client.line = (short) this$0[type * 537618701];
                                    if (client.line <= (short) 0) {
                                        client.line = (short) 1;
                                    }
                                    client.left = (short) this$0[(type * 537618701) + 1];
                                    if (client.left <= (short) 0) {
                                        client.left = Short.MAX_VALUE;
                                    } else {
                                        if (client.left < client.line) {
                                            client.left = client.line;
                                        }
                                    }
                                    client.last = (short) this$0[(type * 537618701) + 2];
                                    if (client.last <= (short) 0) {
                                        client.last = (short) 1;
                                    }
                                    client.max = (short) this$0[(type * 537618701) + 3];
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
                                        MultiInputStream.init(0, 0, 256177861 * client.options.this$0, 57307023 * client.options.$assertionsDisabled, false, -1526745070);
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = 2140963035 * client.mCurrent;
                                        $r1 = this$0;
                                        $i0 = type - 1194553915;
                                        type = $i0;
                                        $r1[($i0 * 537618701) - 1] = client.page * -1949120505;
                                        return 1;
                                    }
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = -1;
                                    return 1;
                                } else if ($i0 == 6204) {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.counter;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.order;
                                    return 1;
                                } else if (6205 != $i0) {
                                    return 2;
                                } else {
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
                                    $r1[($i0 * 537618701) - 1] = client.TAG;
                                    $r1 = this$0;
                                    $i0 = type - 1194553915;
                                    type = $i0;
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

    static int save(int $i0, CharSequence charSequence, boolean z) {
        int $i1 = -1;
        int[] $r1;
        if ($i0 == 3300) {
            $r1 = this$0;
            $i0 = type - 1235005853;
            type = $i0;
            $r1[($i0 * -1784477734) - 1] = client.type * 1581849891;
            return 1;
        } else if ($i0 == 3301) {
            type -= 842640160;
            $i0 = this$0[type * -107807270];
            $i1 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 2139089110) - 1;
            $r4 = (Region) Region.value.get((long) $i0);
            if ($r4 == null) {
                $i0 = -1;
            } else {
                if ($i1 >= 0) {
                    $i0 = $r4.size.length;
                    if ($i1 < $i0) {
                        $i0 = $r4.size[$i1];
                    }
                }
                $i0 = -1;
            }
            $r1[$i2] = $i0;
            return 1;
        } else if (3302 == $i0) {
            type -= -35408527;
            $i0 = this$0[type * -555291948];
            $i1 = this$0[(-1228714381 * type) + 1];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * -171135686) - 1] = HyperlinkRecord.get($i0, $i1, -578963960);
            return 1;
        } else if ($i0 == 3303) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701];
            $i1 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = Tag.add($i0, $i1, 1642561598);
            return 1;
        } else if ($i0 == -1566635516) {
            $r1 = this$0;
            $i0 = type - -2064570284;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = FileInfo.getData($i0, (byte) -92).size * -408205527;
            return 1;
        } else if (1666596986 == $i0) {
            $r1 = this$0;
            $i0 = type - -2082525047;
            type = $i0;
            $i0 = $r1[$i0 * 930920652];
            $r1 = this$0;
            $i1 = type + 150835035;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.TRUE[$i0];
            return 1;
        } else if (-2071508279 == $i0) {
            $r1 = this$0;
            $i0 = type - -803761450;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type + 1572967805;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.INSTANCE[$i0];
            return 1;
        } else if ($i0 == -1005392689) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * -384117311];
            $r1 = this$0;
            $i1 = type - 1139816512;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.reader[$i0];
            return 1;
        } else if ($i0 == 3308) {
            $i0 = Msg.size * -2019340959;
            $i1 = ((File.this$0.size * -174069007) >> 7) + (Build$VERSION.type * 1407993063);
            $i2 = ((File.this$0.value * 2328865) >> 7) + (2018555913 * Level.type);
            $r1 = this$0;
            $i3 = type - 1911093223;
            type = $i3;
            $i0 = ($i0 << 28) + ($i1 << 14);
            $i0 = $i0;
            $r1[($i3 * 537618701) - 1] = $i0 + $i2;
            return 1;
        } else if (3309 == $i0) {
            $r1 = this$0;
            $i0 = type - 1371109420;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = ($i0 >> 14) & 123988984;
            return 1;
        } else if ($i0 == 1058883676) {
            $r1 = this$0;
            $i0 = type - 214659831;
            type = $i0;
            $i0 = $r1[$i0 * 692317785];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * -829922050) - 1] = $i0 >> 28;
            return 1;
        } else if ($i0 == 923782673) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 847755553];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 1551277748) - 1] = $i0 & 16383;
            return 1;
        } else if ($i0 == 1439889070) {
            $r1 = this$0;
            $i0 = type + 1895668845;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = client.start ? (byte) 1 : (byte) 0;
            return 1;
        } else if ($i0 == 1093302870) {
            type -= 1905859466;
            $i0 = this$0[type * 537618701] + 32768;
            $i2 = this$0[(type * 1572246078) + 1];
            $r1 = this$0;
            $i3 = type - 1194553915;
            type = $i3;
            $i3 = ($i3 * -1507921733) - 1;
            $r4 = (Region) Region.value.get((long) $i0);
            if ($r4 != null) {
                if ($i2 >= 0) {
                    $i0 = $r4.size.length;
                    if ($i2 < $i0) {
                        $i1 = $r4.size[$i2];
                    }
                }
            }
            $r1[$i3] = $i1;
            return 1;
        } else if ($i0 == 861453087) {
            type -= 1905859466;
            $i0 = this$0[1008107457 * type] + 32768;
            $i1 = this$0[(type * -555009043) + 1];
            $r1 = this$0;
            $i2 = type + 1094797215;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = HyperlinkRecord.get($i0, $i1, -187173969);
            return 1;
        } else if (3315 == $i0) {
            type -= 1905859466;
            $i0 = this$0[-933659544 * type] + 32768;
            $i1 = this$0[(type * 537618701) + 1];
            $r1 = this$0;
            $i2 = type - 1325351694;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = Tag.add($i0, $i1, 1858027395);
            return 1;
        } else if (-1477857730 == $i0) {
            if (client.out * 584317047 >= 2) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = client.out * -2036797811;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 723768802;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if (3317 == $i0) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -659341571 * client.description;
            return 1;
        } else if (3318 == $i0) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 1481623601) - 1] = client.f407x * -2011211603;
            return 1;
        } else if ($i0 == 3321) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -28768771 * client.entry;
            return 1;
        } else if ($i0 == 3322) {
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 1319832389) - 1] = client.from * -626982563;
            return 1;
        } else if (-1653069880 == $i0) {
            if (client.comments) {
                $r1 = this$0;
                $i0 = type - 2023980801;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = 1;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if (851713785 == $i0) {
            $r1 = this$0;
            $i0 = type + 2014003070;
            type = $i0;
            $r1[($i0 * -2091922815) - 1] = client.f397m * 1920818514;
            return 1;
        } else if (1777989949 != $i0) {
            return 2;
        } else {
            type -= 814304025;
            $i0 = (this$0[type * 537618701] + (this$0[(type * 766243172) + 1] << 14)) + (this$0[(type * -671686891) + 2] << 28);
            $i0 = $i0;
            $i0 = $i0 + this$0[(1577057563 * type) + 3];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 367375102) - 1] = $i0;
            return 1;
        }
    }

    static int set(int $i0, CharSequence charSequence, boolean z) {
        boolean $i1 = false;
        int[] $r2;
        if (3600 == $i0) {
            if (Primitive.data.type * -1211745851 == 0) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * -467046028) - 1] = 876925284;
                return 1;
            } else if (1943219422 * Primitive.data.type == 1) {
                $r2 = this$0;
                $i0 = type + 320316995;
                type = $i0;
                $r2[($i0 * -1170600057) - 1] = -1;
                return 1;
            } else {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = Primitive.data.this$0.get(1949752177);
                return 1;
            }
        } else if (3601 == $i0) {
            $r2 = this$0;
            $i0 = type - -1351509451;
            type = $i0;
            $i0 = $r2[$i0 * 796177992];
            if (!Primitive.data.contains(2141771458) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(1662792619)) {
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = "";
                $r3 = data;
                $i0 = value - 1880231430;
                value = $i0;
                $r3[($i0 * -25313481) - 1] = "";
                return 1;
            }
            State $r13 = (Pair) Primitive.data.this$0.get($i0, 1857625353);
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * 1236178409) - 1] = $r13.get((byte) -12);
            $r3 = data;
            $i0 = value + 157225499;
            value = $i0;
            $r3[($i0 * 1241064189) - 1] = $r13.encode((byte) -1);
            return 1;
        } else if ($i0 == 3602) {
            $r2 = this$0;
            $i0 = type - 1266910376;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (!Primitive.data.contains(2139823514) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(1806874550)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * 645263813) - 1] = ((Coordinate) Primitive.data.this$0.get($i0, 543043014)).this$0 * -1161455169;
            return 1;
        } else if (3603 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * -740453027];
            if (!Primitive.data.contains(2133241903) || $i0 < 0 || $i0 >= Primitive.data.this$0.get(1528152672)) {
                $r2 = this$0;
                $i0 = type + 1990332210;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * 537618701) - 1] = ((Coordinate) Primitive.data.this$0.get($i0, 23142955)).count * -533735695;
            return 1;
        } else if ($i0 == 3604) {
            $r3 = data;
            $i0 = value - -1495012347;
            value = $i0;
            $r4 = $r3[$i0 * 653574902];
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            $r8 = Logger.add(R$string.offset, client.this$0.key, (byte) 27);
            $r8.this$0.append(Record.toString($r4, 269060355) + 1, (byte) 31);
            $r8.this$0.clear($i0, 1703184995);
            $r8.this$0.add($r4, (byte) 33);
            client.this$0.add($r8, (short) 255);
            return 1;
        } else if (3605 == $i0) {
            $r3 = data;
            $i0 = value - 1839704103;
            value = $i0;
            Primitive.data.init($r3[$i0 * -1267697097], (byte) -48);
            return 1;
        } else if (3606 == $i0) {
            $r3 = data;
            $i0 = value - -910073670;
            value = $i0;
            Primitive.data.toString($r3[$i0 * -1267697097], -1721481581);
            return 1;
        } else if (-919836359 == $i0) {
            $r3 = data;
            $i0 = value - -1246602361;
            value = $i0;
            Primitive.data.get($r3[$i0 * -1267697097], 1160668496);
            return 1;
        } else if (3608 == $i0) {
            $r3 = data;
            $i0 = value - -1151401203;
            value = $i0;
            Primitive.data.load($r3[$i0 * -1738664533], -12491011);
            return 1;
        } else if ($i0 == 3609) {
            $r3 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r4 = ArrayMap.get($r3[$i0 * -1267697097], -1021555902);
            $r2 = this$0;
            $i0 = type + 1980709142;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Primitive.data.toString(new JSONObject($r4, LogActivity.type), false, -889911197)) {
                $i1 = 1;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if ($i0 == 3611) {
            if (MyAsyncTask.this$0 != null) {
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * 2141353817) - 1] = MyAsyncTask.this$0.key;
                return 1;
            }
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else if (-1366315435 == $i0) {
            if (MyAsyncTask.this$0 != null) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = MyAsyncTask.this$0.get(1650604653);
                return 1;
            }
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 == 3613) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1242639097)) {
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r3 = data;
            $i1 = value - 1740261130;
            value = $i1;
            $r3[($i1 * -1267697097) - 1] = MyAsyncTask.this$0.get($i0, 1512172766).getKey(1880522183).toString(-476772400);
            return 1;
        } else if ($i0 == 99937997) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * -150838268];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1480041639)) {
                $r2 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r2[($i0 * -1310811203) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * -1153106410) - 1] = ((Coordinate) MyAsyncTask.this$0.get($i0, 150198659)).write((byte) -30);
            return 1;
        } else if (1042418307 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r2[$i0 * -2124139135];
            if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1687568089)) {
                $r2 = this$0;
                $i0 = type + 283486550;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r2 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r2[($i1 * 1440902686) - 1] = ((Coordinate) MyAsyncTask.this$0.get($i0, 1308181010)).count * -272030229;
            return 1;
        } else if ($i0 == -1027077045) {
            $r2 = this$0;
            $i0 = type + 2048863572;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = MyAsyncTask.this$0 != null ? MyAsyncTask.this$0.state : (byte) 0;
            return 1;
        } else if (3617 == $i0) {
            $r3 = data;
            $i0 = value - 1999106770;
            value = $i0;
            Packet.toString($r3[$i0 * -1267697097], 477161637);
            return 1;
        } else if ($i0 == 3618) {
            $r2 = this$0;
            $i0 = type + 84069509;
            type = $i0;
            $i0 = ($i0 * 464103707) - 1;
            if (MyAsyncTask.this$0 != null) {
                $i1 = MyAsyncTask.this$0.f273a * 1338642877;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if (3619 == $i0) {
            $r3 = data;
            $i0 = value - -1246602361;
            value = $i0;
            TIntArrayList.add($r3[$i0 * -1267697097], (byte) 22);
            return 1;
        } else if (3620 == $i0) {
            $r8 = Logger.add(R$string.this$0, client.this$0.key, (byte) 14);
            $r8.this$0.append(0, (byte) 31);
            client.this$0.add($r8, (short) 255);
            return 1;
        } else if (3621 == $i0) {
            if (Primitive.data.contains(2137145989)) {
                $r2 = this$0;
                $i0 = type + 1709454674;
                type = $i0;
                $r2[($i0 * 537618701) - 1] = Primitive.data.data.get(1715490930);
                return 1;
            }
            $r2 = this$0;
            $i0 = type + 1691677434;
            type = $i0;
            $r2[($i0 * -679319138) - 1] = -1;
            return 1;
        } else if (3622 == $i0) {
            $r2 = this$0;
            $i0 = type - -1052304361;
            type = $i0;
            $i0 = $r2[$i0 * 796046100];
            if (!Primitive.data.contains(2138907131) || $i0 < 0 || $i0 >= Primitive.data.data.get(1627369708)) {
                $r3 = data;
                $i0 = value + 176732483;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = "";
                $r3 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r3[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            State $r30 = (Timer) Primitive.data.data.get($i0, 1096734740);
            $r3 = data;
            $i0 = value - 1929323834;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = $r30.get((byte) 41);
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = $r30.encode((byte) -1);
            return 1;
        } else if ($i0 == 631415018) {
            $r3 = data;
            $i0 = value - -1246602361;
            value = $i0;
            $r4 = ArrayMap.get($r3[$i0 * -1215034132], 2141040248);
            $r2 = this$0;
            $i0 = type - 23397499;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Primitive.data.add(new JSONObject($r4, LogActivity.type), (byte) -88)) {
                $i1 = 1;
            }
            $r2[$i0] = $i1;
            return 1;
        } else if ($i0 == 3624) {
            $r2 = this$0;
            $i0 = type - -943764074;
            type = $i0;
            $i0 = $r2[$i0 * 537618701];
            if (MyAsyncTask.this$0 != null && $i0 < MyAsyncTask.this$0.get(1771423729)) {
                if (MyAsyncTask.this$0.get($i0, 1068751682).getKey(1903111147).equals(File.this$0.type)) {
                    $r2 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r2[($i0 * 537618701) - 1] = 1;
                    return 1;
                }
            }
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = 0;
            return 1;
        } else if ($i0 != 3625) {
            if (-1743251511 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $i0 = $r2[$i0 * 1439273923];
                if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1453549884) || !((Cell) MyAsyncTask.this$0.get($i0, 1769604872)).add((byte) 48)) {
                    $r2 = this$0;
                    $i0 = type - 1194553915;
                    type = $i0;
                    $r2[($i0 * 537618701) - 1] = 0;
                } else {
                    $r2 = this$0;
                    $i0 = type + 1029184264;
                    type = $i0;
                    $r2[($i0 * 537618701) - 1] = 1;
                    return 1;
                }
            } else if ($i0 == 3627) {
                $r2 = this$0;
                $i0 = type - 672674325;
                type = $i0;
                $i0 = $r2[$i0 * 1039640653];
                if (MyAsyncTask.this$0 == null || $i0 >= MyAsyncTask.this$0.get(1149680897) || !((Cell) MyAsyncTask.this$0.get($i0, 1518234950)).add(2085049487)) {
                    $r2 = this$0;
                    $i0 = type + 598480927;
                    type = $i0;
                    $r2[($i0 * 537618701) - 1] = 0;
                    return 1;
                }
                $r2 = this$0;
                $i0 = type - 697652873;
                type = $i0;
                $r2[($i0 * 995967305) - 1] = 1;
                return 1;
            } else if ($i0 == 3628) {
                Primitive.data.this$0.transform(-1120867081);
                return 1;
            } else if ($i0 == -1280240364) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 352932280] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new FileComparator($i1), (byte) 1);
                return 1;
            } else if (850532896 == $i0) {
                $r2 = this$0;
                $i0 = type - -837168263;
                type = $i0;
                if ($r2[$i0 * -523027448] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Geometry($i1), (byte) 1);
                return 1;
            } else if (237655262 == $i0) {
                $r2 = this$0;
                $i0 = type - 304795582;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new AbstractLoadingActivity$3$1($i1), (byte) 1);
                return 1;
            } else if ($i0 == 322979134) {
                $r2 = this$0;
                $i0 = type - 347313453;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Document($i1), (byte) 1);
                return 1;
            } else if (3633 == $i0) {
                $r2 = this$0;
                $i0 = type - -1940255372;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Diff($i1), (byte) 1);
                return 1;
            } else if (1424204108 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new AssertionError($i1), (byte) 1);
                return 1;
            } else if (3635 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * -1083985782] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new CharacterReference($i1), (byte) 1);
                return 1;
            } else if ($i0 == 3636) {
                $r2 = this$0;
                $i0 = type - 1283102722;
                type = $i0;
                if ($r2[$i0 * -827819151] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Exception($i1), (byte) 1);
                return 1;
            } else if ($i0 == 631022294) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Byte($i1), (byte) 1);
                return 1;
            } else if (599124629 == $i0) {
                $r2 = this$0;
                $i0 = type - 1536805580;
                type = $i0;
                if ($r2[$i0 * 1168337569] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Locale($i1), (byte) 1);
                return 1;
            } else if (598707076 == $i0) {
                Primitive.data.this$0.toString(1241064189);
                return 1;
            } else if ($i0 == 3640) {
                Primitive.data.data.transform(32735448);
                return 1;
            } else if (3641 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * -1936574897] == 1) {
                    $i1 = true;
                }
                Primitive.data.data.toString((Comparator) new FileComparator($i1), (byte) 1);
                return 1;
            } else if ($i0 == 729961543) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                Primitive.data.data.toString((Comparator) new Geometry($i1), (byte) 1);
                return 1;
            } else if (-806271786 == $i0) {
                Primitive.data.data.toString(1241064189);
                return 1;
            } else if (3644 == $i0) {
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.transform(-2075013680);
                    return 1;
                }
            } else if (1568447020 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new FileComparator($i1), (byte) 1);
                    return 1;
                }
            } else if (1508103797 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * -1336884976] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Geometry($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == -777765029) {
                $r2 = this$0;
                $i0 = type - 1941968083;
                type = $i0;
                if ($r2[$i0 * 283703887] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new AbstractLoadingActivity$3$1($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == 3648) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Document($i1), (byte) 1);
                    return 1;
                }
            } else if (3649 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 1976250254] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Diff($i1), (byte) 1);
                    return 1;
                }
            } else if (3650 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new AssertionError($i1), (byte) 1);
                    return 1;
                }
            } else if (3651 == $i0) {
                $r2 = this$0;
                $i0 = type - 1203887229;
                type = $i0;
                if ($r2[$i0 * 1655218032] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new CharacterReference($i1), (byte) 1);
                    return 1;
                }
            } else if (2028221281 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * 537618701] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Exception($i1), (byte) 1);
                    return 1;
                }
            } else if ($i0 == -363004933) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * -1340886067] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Byte($i1), (byte) 1);
                    return 1;
                }
            } else if (1118952225 == $i0) {
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
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
                $r2 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r2[$i0 * -1640134218] == 1) {
                    $i1 = true;
                }
                Primitive.data.this$0.toString((Comparator) new Vector2D($i1), (byte) 1);
                return 1;
            } else if (-825351350 != $i0) {
                return 2;
            } else {
                $r2 = this$0;
                $i0 = type - 1898443116;
                type = $i0;
                if ($r2[$i0 * -46088246] == 1) {
                    $i1 = true;
                }
                if (MyAsyncTask.this$0 != null) {
                    MyAsyncTask.this$0.toString((Comparator) new Vector2D($i1), (byte) 1);
                    return 1;
                }
            }
            return 1;
        } else if (MyAsyncTask.this$0 == null || MyAsyncTask.this$0.value == null) {
            $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = "";
            return 1;
        } else {
            $r3 = data;
            $i0 = value - 963447591;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = MyAsyncTask.this$0.value;
            return 1;
        }
    }

    static int skip(int $i0, CharSequence charSequence, boolean z) {
        System $r1 = z ? Constants.data : state;
        int[] $r2;
        if ($i0 == 1600) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.f292i * -2091547827;
            return 1;
        } else if (1601 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.size * 654937537;
            return 1;
        } else if ($i0 == 1602) {
            String[] $r3 = data;
            $i0 = value - 1246602361;
            value = $i0;
            $r3[($i0 * -1267697097) - 1] = $r1.file;
            return 1;
        } else if ($i0 == 1603) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.cursor * 1151268625;
            return 1;
        } else if ($i0 == 1604) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.buf * -1243953689;
            return 1;
        } else if (1605 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.state * 2105704033;
            return 1;
        } else if ($i0 == 1606) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.data * -1375479599;
            return 1;
        } else if ($i0 == 1607) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.instance * -1211464689;
            return 1;
        } else if ($i0 == 1608) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.count * -2032348791;
            return 1;
        } else if ($i0 == 1609) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.result * -479221341;
            return 1;
        } else if (1610 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.source * -1726277411;
            return 1;
        } else if (1611 == $i0) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.index * 334261811;
            return 1;
        } else if ($i0 == 1612) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.current * 1703184995;
            return 1;
        } else if ($i0 == 1613) {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.err.get(553377644);
            return 1;
        } else if (1614 != $i0) {
            return 2;
        } else {
            $r2 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.error ? (byte) 1 : (byte) 0;
            return 1;
        }
    }

    static int start(int $i0, CharSequence charSequence, boolean z) {
        System $r2;
        boolean $z1 = false;
        if ($i0 >= 2000) {
            $i0 -= 1000;
            int[] $r1 = this$0;
            int $i1 = type - -1194553915;
            type = $i1;
            $r2 = ArrayList.get($r1[$i1 * 537618701], 115070878);
        } else {
            $r2 = z ? Constants.data : state;
        }
        client.add($r2, (byte) 37);
        if (1200 == $i0 || $i0 == 1205 || 1212 == $i0) {
            type -= 1905859466;
            $i1 = this$0[type * 537618701];
            int $i2 = this$0[(type * 537618701) + 1];
            $r2.left = -1404216569 * $i1;
            $r2.offset = $i2 * 895045473;
            Message $r3 = Set.get($i1, 1070061916);
            $r2.data = $r3.parent * -1010358009;
            $r2.count = $r3.level * -1123242253;
            $r2.instance = -1813573947 * $r3.f217x;
            $r2.startTime = $r3.index * -1211168499;
            $r2.progress = 1928138403 * $r3.key;
            $r2.state = $r3.data * -136593549;
            if ($i0 == 1205) {
                $r2.body = 0;
            } else {
                z = $i0 == 1212;
                if ($r3.name * 1099170281 == 1) {
                    $z1 = true;
                }
                if (z | $z1) {
                    $r2.body = -144948821;
                } else {
                    $r2.body = -289897642;
                }
            }
            if (1535179975 * $r2.filter > 0) {
                $r2.state = (($r2.state * -1336947680) / ($r2.filter * 1535179975)) * 62563745;
                return 1;
            } else if ($r2.f300x * 1506390075 <= 0) {
                return 1;
            } else {
                $r2.state = (($r2.state * -1336947680) / (1506390075 * $r2.f300x)) * 62563745;
                return 1;
            }
        } else if (1201 == $i0) {
            $r2.status = -1427487042;
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $r2.text = $r1[$i0 * 537618701] * -174447253;
            return 1;
        } else if (1202 != $i0) {
            return 2;
        } else {
            $r2.status = -2141230563;
            $r2.text = File.this$0.this$0.toString((byte) -60) * -174447253;
            return 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int toString(int r49, p000.CharSequence r50, boolean r51) {
        /*
        r7 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x006e;
    L_0x0006:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r9 = p000.client.top;
        r7 = 321761329; // 0x132db031 float:2.1922539E-27 double:1.58971219E-315;
        r9 = r9 * r7;
        r8[r49] = r9;
        r7 = 1;
        return r7;
    L_0x0028:
        r7 = 5017; // 0x1399 float:7.03E-42 double:2.4787E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x06a6;
    L_0x002e:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r8[r49];
        r8 = this$0;
        r9 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r9 = r9 + r7;
        type = r9;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r9 = r9 * r7;
        r9 = r9 + -1;
        r10 = p000.DrawingGroup.content;
        r0 = r49;
        r11 = java.lang.Integer.valueOf(r0);
        r12 = r10.get(r11);
        r14 = r12;
        r14 = (p000.Record) r14;
        r13 = r14;
        if (r13 != 0) goto L_0x0d46;
    L_0x0068:
        r49 = 0;
    L_0x006a:
        r8[r9] = r49;
        r7 = 1;
        return r7;
    L_0x006e:
        r7 = 5001; // 0x1389 float:7.008E-42 double:2.471E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x0458;
    L_0x0074:
        r49 = type;
        r7 = 711305551; // 0x2a65a94f float:2.0398027E-13 double:3.514316364E-315;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        type = r49;
        r8 = this$0;
        r49 = type;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r8[r49];
        r7 = -1551652655; // 0xffffffffa383a8d1 float:-1.4274545E-17 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        p000.client.top = r49;
        r8 = this$0;
        r49 = type;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + 1;
        r49 = r8[r49];
        r7 = 492323099; // 0x1d58411b float:2.862102E-21 double:2.4323993E-315;
        r15 = p000.Exception.toString(r7);
        r9 = 0;
    L_0x00b0:
        r0 = r15.length;
        r16 = r0;
        if (r9 >= r0) goto L_0x0c13;
    L_0x00b5:
        r17 = r15[r9];
        r0 = r17;
        r0 = r0.data;
        r16 = r0;
        r7 = 677600269; // 0x28635c0d float:1.2620992E-14 double:3.347790145E-315;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r1 = r49;
        if (r0 != r1) goto L_0x0db3;
    L_0x00c9:
        p000.ByteBufferList.position = r17;
        r17 = p000.ByteBufferList.position;
        if (r17 != 0) goto L_0x00d3;
    L_0x00cf:
        r17 = p000.Info.file;
        p000.ByteBufferList.position = r17;
    L_0x00d3:
        r8 = this$0;
        r49 = type;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + 2;
        r49 = r8[r49];
        r7 = -26121995; // 0xfffffffffe7168f5 float:-8.022223E37 double:NaN;
        r49 = r7 * r49;
        p000.client.pointer = r49;
        r18 = p000.R$string.current;
        r19 = p000.client.this$0;
        r0 = r19;
        r0 = r0.key;
        r20 = r0;
        r7 = 30;
        r0 = r18;
        r1 = r20;
        r21 = p000.Logger.add(r0, r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r49 = p000.client.top;
        r7 = 321761329; // 0x132db031 float:2.1922539E-27 double:1.58971219E-315;
        r49 = r7 * r49;
        r7 = 31;
        r0 = r22;
        r1 = r49;
        r0.append(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r17 = p000.ByteBufferList.position;
        r0 = r17;
        r0 = r0.data;
        r49 = r0;
        r7 = 677600269; // 0x28635c0d float:1.2620992E-14 double:3.347790145E-315;
        r49 = r7 * r49;
        r7 = 31;
        r0 = r22;
        r1 = r49;
        r0.append(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r49 = p000.client.pointer;
        r7 = -1224080547; // 0xffffffffb70a035d float:-8.226224E-6 double:NaN;
        r49 = r7 * r49;
        r7 = 31;
        r0 = r22;
        r1 = r49;
        r0.append(r1, r7);
        r19 = p000.client.this$0;
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r19;
        r1 = r21;
        r0.add(r1, r7);
        r7 = 1;
        return r7;
    L_0x0153:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = -1;
        r8[r49] = r7;
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = 0;
        r8[r49] = r7;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r24 = "";
        r23[r49] = r24;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r24 = "";
        r23[r49] = r24;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r24 = "";
        r23[r49] = r24;
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = 0;
        r8[r49] = r7;
        r7 = 1;
        return r7;
    L_0x01fa:
        r25 = p000.R$id.root;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x09f5;
    L_0x0206:
        r27 = 4;
        r26 = p000.R$id.root;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
    L_0x0216:
        r0 = r28;
        r26 = r0.toLowerCase();
        r25 = p000.R$id.proxy;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0998;
    L_0x0228:
        r26 = p000.R$id.proxy;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 1;
    L_0x0238:
        r18 = p000.R$string.result;
        r19 = p000.client.this$0;
        r0 = r19;
        r0 = r0.key;
        r20 = r0;
        r7 = 30;
        r0 = r18;
        r1 = r20;
        r21 = p000.Logger.add(r0, r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = 0;
        r30 = 31;
        r0 = r22;
        r1 = r30;
        r0.append(r7, r1);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r9 = r0.data;
        r7 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r9 = r9 * r7;
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = 31;
        r0 = r22;
        r1 = r49;
        r0.append(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = 31;
        r0 = r22;
        r1 = r27;
        r0.append(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = 31;
        r0 = r22;
        r1 = r29;
        r0.append(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r0 = r0.data;
        r49 = r0;
        r7 = 429372393; // 0x1997b3e9 float:1.5685699E-23 double:2.121381487E-315;
        r0 = r28;
        r31 = p000.TimeUnit.decode(r0, r7);
        r0 = r31;
        r0 = r0.length;
        r49 = r0;
        r7 = 1779617961; // 0x6a12d0a9 float:4.4372134E25 double:8.792480973E-315;
        r0 = r22;
        r1 = r49;
        r0.log(r1, r7);
        r0 = r22;
        r0 = r0.data;
        r49 = r0;
        r32 = p000.MimeType.data;
        r0 = r31;
        r0 = r0.length;
        r16 = r0;
        r0 = r22;
        r0 = r0.size;
        r33 = r0;
        r0 = r22;
        r0 = r0.data;
        r34 = r0;
        r7 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r34 = r7 * r34;
        r7 = 0;
        r30 = 1363166700; // 0x514045ec float:5.1612926E10 double:6.73493836E-315;
        r0 = r32;
        r1 = r31;
        r2 = r7;
        r3 = r16;
        r4 = r33;
        r5 = r34;
        r6 = r30;
        r16 = r0.encode(r1, r2, r3, r4, r5, r6);
        r7 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r49 = r16 + r49;
        r0 = r49;
        r1 = r22;
        r1.data = r0;
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r0 = r21;
        r0 = r0.this$0;
        r35 = r0;
        r0 = r0.data;
        r49 = r0;
        r7 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r49 = r7 * r49;
        r0 = r49;
        r0 = r0 - r9;
        r49 = r0;
        r7 = 684381889; // 0x28cad6c1 float:2.251964E-14 double:3.3812958E-315;
        r0 = r22;
        r1 = r49;
        r0.getName(r1, r7);
        r19 = p000.client.this$0;
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r19;
        r1 = r21;
        r0.add(r1, r7);
        r7 = 1;
        return r7;
    L_0x032b:
        r7 = 5003; // 0x138b float:7.01E-42 double:2.472E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x06e5;
    L_0x0331:
        r49 = type;
        r7 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        type = r49;
        r8 = this$0;
        r49 = type;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r8[r49];
        r8 = this$0;
        r9 = type;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r9 = r9 * r7;
        r9 = r9 + 1;
        r9 = r8[r9];
        r10 = p000.DrawingGroup.content;
        r0 = r49;
        r11 = java.lang.Integer.valueOf(r0);
        r12 = r10.get(r11);
        r36 = r12;
        r36 = (p000.Record) r36;
        r13 = r36;
        r7 = 1780605076; // 0x6a21e094 float:4.89244E25 double:8.79735797E-315;
        r37 = r13.getData(r9, r7);
        if (r37 == 0) goto L_0x0153;
    L_0x0372:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r9 = r0.value;
        r7 = 1687932353; // 0x649bcdc1 float:2.2992572E22 double:8.33949388E-315;
        r9 = r7 * r9;
        r8[r49] = r9;
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r9 = r0.max;
        r7 = -1939883689; // 0xffffffff8c5fb957 float:-1.7235069E-31 double:NaN;
        r9 = r9 * r7;
        r8[r49] = r9;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r0 = r0.id;
        r28 = r0;
        if (r28 == 0) goto L_0x06e0;
    L_0x03d7:
        r0 = r37;
        r0 = r0.id;
        r28 = r0;
    L_0x03dd:
        r23[r49] = r28;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r0 = r0.key;
        r28 = r0;
        if (r28 == 0) goto L_0x0851;
    L_0x03ff:
        r0 = r37;
        r0 = r0.key;
        r28 = r0;
    L_0x0405:
        r23[r49] = r28;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r0 = r0.length;
        r28 = r0;
        if (r28 == 0) goto L_0x0856;
    L_0x0427:
        r0 = r37;
        r0 = r0.length;
        r28 = r0;
    L_0x042d:
        r23[r49] = r28;
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = -1116170756; // 0xffffffffbd7895fc float:-0.06068991 double:NaN;
        r0 = r37;
        r51 = r0.add(r7);
        if (r51 == 0) goto L_0x085b;
    L_0x0452:
        r27 = 1;
    L_0x0454:
        r8[r49] = r27;
        r7 = 1;
        return r7;
    L_0x0458:
        r7 = 5002; // 0x138a float:7.009E-42 double:2.4713E-320;
        r0 = r49;
        if (r0 != r7) goto L_0x032b;
    L_0x045e:
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r28 = r23[r49];
        r49 = type;
        r7 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        type = r49;
        r8 = this$0;
        r49 = type;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r8[r49];
        r8 = this$0;
        r9 = type;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r9 = r9 * r7;
        r9 = r9 + 1;
        r9 = r8[r9];
        r18 = p000.R$string.line;
        r19 = p000.client.this$0;
        r0 = r19;
        r0 = r0.key;
        r20 = r0;
        r7 = 40;
        r0 = r18;
        r1 = r20;
        r21 = p000.Logger.add(r0, r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = 1512655907; // 0x5a294c23 float:1.19132461E16 double:7.473513176E-315;
        r0 = r28;
        r16 = p000.Record.toString(r0, r7);
        r16 = r16 + 2;
        r7 = 31;
        r0 = r22;
        r1 = r16;
        r0.append(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = -70;
        r0 = r22;
        r1 = r28;
        r0.add(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r49 = r49 + -1;
        r7 = 31;
        r0 = r22;
        r1 = r49;
        r0.append(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = 31;
        r0 = r22;
        r0.append(r9, r7);
        r19 = p000.client.this$0;
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r19;
        r1 = r21;
        r0.add(r1, r7);
        r7 = 1;
        return r7;
    L_0x0504:
        r7 = 5015; // 0x1397 float:7.028E-42 double:2.4777E-320;
        r0 = r49;
        if (r0 != r7) goto L_0x0c36;
    L_0x050a:
        r38 = p000.File.this$0;
        if (r38 == 0) goto L_0x0d41;
    L_0x050e:
        r38 = p000.File.this$0;
        r0 = r38;
        r0 = r0.type;
        r39 = r0;
        if (r39 == 0) goto L_0x0d41;
    L_0x0518:
        r38 = p000.File.this$0;
        r0 = r38;
        r0 = r0.type;
        r39 = r0;
        r7 = -698157884; // 0xffffffffd662f4c4 float:-6.2385222E13 double:NaN;
        r0 = r39;
        r28 = r0.toString(r7);
    L_0x0529:
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r23[r49] = r28;
        r7 = 1;
        return r7;
    L_0x0545:
        r25 = p000.R$id.header;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0cdb;
    L_0x0551:
        r26 = p000.R$id.header;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 5;
        goto L_0x0238;
    L_0x0564:
        r7 = 5005; // 0x138d float:7.013E-42 double:2.473E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x07f4;
    L_0x056a:
        r17 = p000.ByteBufferList.position;
        if (r17 != 0) goto L_0x0a14;
    L_0x056e:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = -1;
        r8[r49] = r7;
        r7 = 1;
        return r7;
    L_0x058b:
        r7 = 5009; // 0x1391 float:7.019E-42 double:2.475E-320;
        r0 = r49;
        if (r0 != r7) goto L_0x0504;
    L_0x0591:
        r49 = value;
        r7 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        value = r49;
        r23 = data;
        r49 = value;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r28 = r23[r49];
        r23 = data;
        r49 = value;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + 1;
        r26 = r23[r49];
        r18 = p000.R$string.address;
        r19 = p000.client.this$0;
        r0 = r19;
        r0 = r0.key;
        r20 = r0;
        r7 = 94;
        r0 = r18;
        r1 = r20;
        r21 = p000.Logger.add(r0, r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = 0;
        r30 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;
        r0 = r22;
        r1 = r30;
        r0.get(r7, r1);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r0 = r0.data;
        r49 = r0;
        r7 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r49 = r7 * r49;
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r7 = -19;
        r0 = r22;
        r1 = r28;
        r0.add(r1, r7);
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r9 = r0.data;
        r7 = -30026815; // 0xfffffffffe35d3c1 float:-6.042244E37 double:NaN;
        r0 = r26;
        r31 = p000.TimeUnit.decode(r0, r7);
        r0 = r31;
        r9 = r0.length;
        r7 = 1779617961; // 0x6a12d0a9 float:4.4372134E25 double:8.792480973E-315;
        r0 = r22;
        r0.log(r9, r7);
        r0 = r22;
        r9 = r0.data;
        r32 = p000.MimeType.data;
        r0 = r31;
        r0 = r0.length;
        r16 = r0;
        r0 = r22;
        r0 = r0.size;
        r33 = r0;
        r0 = r22;
        r0 = r0.data;
        r34 = r0;
        r7 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r0 = r34;
        r0 = r0 * r7;
        r34 = r0;
        r7 = 0;
        r30 = 1363166700; // 0x514045ec float:5.1612926E10 double:6.73493836E-315;
        r0 = r32;
        r1 = r31;
        r2 = r7;
        r3 = r16;
        r4 = r33;
        r5 = r34;
        r6 = r30;
        r16 = r0.encode(r1, r2, r3, r4, r5, r6);
        r7 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r0 = r16;
        r0 = r0 * r7;
        r16 = r0;
        r9 = r16 + r9;
        r0 = r22;
        r0.data = r9;
        r0 = r21;
        r0 = r0.this$0;
        r22 = r0;
        r0 = r21;
        r0 = r0.this$0;
        r35 = r0;
        r9 = r0.data;
        r7 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r9 = r7 * r9;
        r49 = r9 - r49;
        r7 = 36;
        r0 = r22;
        r1 = r49;
        r0.write(r1, r7);
        r19 = p000.client.this$0;
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r19;
        r1 = r21;
        r0.add(r1, r7);
        r7 = 1;
        return r7;
    L_0x0687:
        r25 = p000.R$id.to;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0b70;
    L_0x0693:
        r26 = p000.R$id.to;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 3;
        goto L_0x0238;
    L_0x06a6:
        r7 = 5018; // 0x139a float:7.032E-42 double:2.479E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x0d50;
    L_0x06ac:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r8[r49];
        r8 = this$0;
        r9 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r9 = r9 + r7;
        type = r9;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r9 = r9 * r7;
        r9 = r9 + -1;
        r7 = -32;
        r0 = r49;
        r49 = p000.Calendar.add(r0, r7);
        r8[r9] = r49;
        r7 = 1;
        return r7;
    L_0x06e0:
        r28 = "";
        goto L_0x03dd;
    L_0x06e5:
        r7 = 5004; // 0x138c float:7.012E-42 double:2.4723E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x0564;
    L_0x06eb:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r8[r49];
        r7 = -1396621184; // 0xffffffffacc14080 float:-5.492551E-12 double:NaN;
        r0 = r49;
        r37 = p000.AESCipher.getData(r0, r7);
        if (r37 == 0) goto L_0x08f1;
    L_0x070e:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r9 = r0.index;
        r7 = 977542055; // 0x3a441ba7 float:7.480927E-4 double:4.829699467E-315;
        r9 = r9 * r7;
        r8[r49] = r9;
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r9 = r0.max;
        r7 = -1939883689; // 0xffffffff8c5fb957 float:-1.7235069E-31 double:NaN;
        r9 = r7 * r9;
        r8[r49] = r9;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r0 = r0.id;
        r28 = r0;
        if (r28 == 0) goto L_0x088f;
    L_0x0773:
        r0 = r37;
        r0 = r0.id;
        r28 = r0;
    L_0x0779:
        r23[r49] = r28;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r0 = r0.key;
        r28 = r0;
        if (r28 == 0) goto L_0x0894;
    L_0x079b:
        r0 = r37;
        r0 = r0.key;
        r28 = r0;
    L_0x07a1:
        r23[r49] = r28;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r37;
        r0 = r0.length;
        r28 = r0;
        if (r28 == 0) goto L_0x08b8;
    L_0x07c3:
        r0 = r37;
        r0 = r0.length;
        r28 = r0;
    L_0x07c9:
        r23[r49] = r28;
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = -1116170756; // 0xffffffffbd7895fc float:-0.06068991 double:NaN;
        r0 = r37;
        r51 = r0.add(r7);
        if (r51 == 0) goto L_0x08dc;
    L_0x07ee:
        r27 = 1;
    L_0x07f0:
        r8[r49] = r27;
        r7 = 1;
        return r7;
    L_0x07f4:
        r7 = 5008; // 0x1390 float:7.018E-42 double:2.4743E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x058b;
    L_0x07fa:
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r28 = r23[r49];
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r8[r49];
        r0 = r28;
        r26 = r0.toLowerCase();
        r27 = 0;
        r25 = p000.R$id.author;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0ab6;
    L_0x083e:
        r27 = 0;
        r26 = p000.R$id.author;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0851:
        r28 = "";
        goto L_0x0405;
    L_0x0856:
        r28 = "";
        goto L_0x042d;
    L_0x085b:
        r7 = -1170859915; // 0xffffffffba361875 float:-6.9463934E-4 double:NaN;
        r0 = r37;
        r51 = r0.get(r7);
        if (r51 == 0) goto L_0x086b;
    L_0x0866:
        r27 = 2;
        goto L_0x0454;
    L_0x086b:
        r27 = 0;
        goto L_0x0454;
    L_0x0870:
        r25 = p000.R$id.label;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0c5f;
    L_0x087c:
        r27 = 6;
        r26 = p000.R$id.label;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x088f:
        r28 = "";
        goto L_0x0779;
    L_0x0894:
        r28 = "";
        goto L_0x07a1;
    L_0x0899:
        r25 = p000.R$id.color;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0bae;
    L_0x08a5:
        r27 = 11;
        r26 = p000.R$id.color;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x08b8:
        r28 = "";
        goto L_0x07c9;
    L_0x08bd:
        r25 = p000.R$id.image;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0a97;
    L_0x08c9:
        r27 = 2;
        r26 = p000.R$id.image;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x08dc:
        r7 = -1166587447; // 0xffffffffba7749c9 float:-9.433297E-4 double:NaN;
        r0 = r37;
        r51 = r0.get(r7);
        if (r51 == 0) goto L_0x08ec;
    L_0x08e7:
        r27 = 2;
        goto L_0x07f0;
    L_0x08ec:
        r27 = 0;
        goto L_0x07f0;
    L_0x08f1:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = -1;
        r8[r49] = r7;
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = 0;
        r8[r49] = r7;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r24 = "";
        r23[r49] = r24;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r24 = "";
        r23[r49] = r24;
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r24 = "";
        r23[r49] = r24;
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r7 = 0;
        r8[r49] = r7;
        r7 = 1;
        return r7;
    L_0x0998:
        r25 = p000.R$id.UNKNOWN;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0687;
    L_0x09a4:
        r26 = p000.R$id.UNKNOWN;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 2;
        goto L_0x0238;
    L_0x09b7:
        r25 = p000.R$id.command;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0b8f;
    L_0x09c3:
        r27 = 9;
        r26 = p000.R$id.command;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x09d6:
        r25 = p000.R$id.description;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x08bd;
    L_0x09e2:
        r26 = p000.R$id.description;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r27 = 1;
        goto L_0x0216;
    L_0x09f5:
        r25 = p000.R$id.link;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0b32;
    L_0x0a01:
        r27 = 5;
        r26 = p000.R$id.link;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0a14:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r17 = p000.ByteBufferList.position;
        r0 = r17;
        r9 = r0.data;
        r7 = 677600269; // 0x28635c0d float:1.2620992E-14 double:3.347790145E-315;
        r9 = r9 * r7;
        r8[r49] = r9;
        r7 = 1;
        return r7;
    L_0x0a3a:
        r25 = p000.R$id.properties;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0bf4;
    L_0x0a46:
        r26 = p000.R$id.properties;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 2;
        goto L_0x0238;
    L_0x0a59:
        r25 = p000.R$id.file;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0e34;
    L_0x0a65:
        r26 = p000.R$id.file;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 5;
        goto L_0x0238;
    L_0x0a78:
        r25 = p000.R$id.owner;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x09b7;
    L_0x0a84:
        r27 = 8;
        r26 = p000.R$id.owner;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0a97:
        r25 = p000.R$id.title;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0d03;
    L_0x0aa3:
        r27 = 3;
        r26 = p000.R$id.title;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0ab6:
        r25 = p000.R$id.date;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0ad5;
    L_0x0ac2:
        r26 = p000.R$id.date;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r27 = 1;
        goto L_0x0216;
    L_0x0ad5:
        r25 = p000.R$id.content;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0af4;
    L_0x0ae1:
        r27 = 2;
        r26 = p000.R$id.content;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0af4:
        r25 = p000.R$id.encoding;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x01fa;
    L_0x0b00:
        r27 = 3;
        r26 = p000.R$id.encoding;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0b13:
        r25 = p000.R$id.offset;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0870;
    L_0x0b1f:
        r27 = 5;
        r26 = p000.R$id.offset;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0b32:
        r25 = p000.R$id.limit;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0b51;
    L_0x0b3e:
        r27 = 6;
        r26 = p000.R$id.limit;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0b51:
        r25 = p000.R$id.text;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0a78;
    L_0x0b5d:
        r27 = 7;
        r26 = p000.R$id.text;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0b70:
        r25 = p000.R$id.name;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0545;
    L_0x0b7c:
        r26 = p000.R$id.name;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 4;
        goto L_0x0238;
    L_0x0b8f:
        r25 = p000.R$id.track;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0899;
    L_0x0b9b:
        r27 = 10;
        r26 = p000.R$id.track;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0bae:
        r9 = p000.client.title;
        r7 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r9 = r9 * r7;
        if (r9 == 0) goto L_0x0216;
    L_0x0bb6:
        r25 = p000.R$id.version;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x09d6;
    L_0x0bc2:
        r27 = 0;
        r26 = p000.R$id.version;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0bd5:
        r25 = p000.R$id.rating;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0216;
    L_0x0be1:
        r27 = 11;
        r26 = p000.R$id.rating;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0bf4:
        r25 = p000.R$id.points;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0d22;
    L_0x0c00:
        r26 = p000.R$id.points;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 3;
        goto L_0x0238;
    L_0x0c13:
        r17 = 0;
        goto L_0x00c9;
    L_0x0c18:
        r0 = r37;
        r0 = r0.size;
        r40 = r0;
        r41 = r40;
        r41 = (p000.TDoubleArrayList) r41;
        r37 = r41;
        r0 = r37;
        r0 = r0.value;
        r49 = r0;
        r7 = 1687932353; // 0x649bcdc1 float:2.2992572E22 double:8.33949388E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
    L_0x0c32:
        r8[r9] = r49;
        r7 = 1;
        return r7;
    L_0x0c36:
        r7 = 5016; // 0x1398 float:7.029E-42 double:2.478E-320;
        r0 = r49;
        if (r0 != r7) goto L_0x0028;
    L_0x0c3c:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r9 = p000.client.pointer;
        r7 = -1224080547; // 0xffffffffb70a035d float:-8.226224E-6 double:NaN;
        r9 = r7 * r9;
        r8[r49] = r9;
        r7 = 1;
        return r7;
    L_0x0c5f:
        r25 = p000.R$id.style;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0c7e;
    L_0x0c6b:
        r27 = 7;
        r26 = p000.R$id.style;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0c7e:
        r25 = p000.R$id.filename;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0c9d;
    L_0x0c8a:
        r27 = 8;
        r26 = p000.R$id.filename;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0c9d:
        r25 = p000.R$id.artist;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0cbc;
    L_0x0ca9:
        r27 = 9;
        r26 = p000.R$id.artist;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0cbc:
        r25 = p000.R$id.genre;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0bd5;
    L_0x0cc8:
        r27 = 10;
        r26 = p000.R$id.genre;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0cdb:
        r9 = p000.client.title;
        r7 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r9 = r7 * r9;
        if (r9 == 0) goto L_0x0e34;
    L_0x0ce4:
        r25 = p000.R$id.property;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0a3a;
    L_0x0cf0:
        r26 = p000.R$id.property;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 1;
        goto L_0x0238;
    L_0x0d03:
        r25 = p000.R$id.template;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0b13;
    L_0x0d0f:
        r27 = 4;
        r26 = p000.R$id.template;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        goto L_0x0216;
    L_0x0d22:
        r25 = p000.R$id.item;
        r0 = r26;
        r1 = r25;
        r51 = r0.startsWith(r1);
        if (r51 == 0) goto L_0x0a59;
    L_0x0d2e:
        r26 = p000.R$id.item;
        r0 = r26;
        r9 = r0.length();
        r0 = r28;
        r28 = r0.substring(r9);
        r29 = 4;
        goto L_0x0238;
    L_0x0d41:
        r28 = "";
        goto L_0x0529;
    L_0x0d46:
        r7 = 345678033; // 0x149aa0d1 float:1.5613457E-26 double:1.707876406E-315;
        r49 = r13.getKey(r7);
        goto L_0x006a;
    L_0x0d50:
        r7 = 5019; // 0x139b float:7.033E-42 double:2.4797E-320;
        r0 = r49;
        if (r0 != r7) goto L_0x0db8;
    L_0x0d56:
        r8 = this$0;
        r49 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        type = r49;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r8[r49];
        r8 = this$0;
        r9 = type;
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r9 = r9 + r7;
        type = r9;
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r9 = r9 * r7;
        r9 = r9 + -1;
        r42 = p000.DrawingGroup.data;
        r0 = r49;
        r0 = (long) r0;
        r43 = r0;
        r0 = r42;
        r1 = r43;
        r45 = r0.get(r1);
        r46 = r45;
        r46 = (p000.TDoubleArrayList) r46;
        r37 = r46;
        if (r37 != 0) goto L_0x0d9a;
    L_0x0d95:
        r49 = -1;
        goto L_0x0c32;
    L_0x0d9a:
        r47 = p000.DrawingGroup.map;
        r0 = r47;
        r0 = r0.next;
        r40 = r0;
        r0 = r37;
        r0 = r0.size;
        r48 = r0;
        r0 = r40;
        r1 = r48;
        if (r0 != r1) goto L_0x0c18;
    L_0x0dae:
        r49 = -1;
        goto L_0x0c32;
    L_0x0db3:
        r9 = r9 + 1;
        goto L_0x00b0;
    L_0x0db8:
        r7 = 5020; // 0x139c float:7.035E-42 double:2.48E-320;
        r0 = r49;
        if (r0 != r7) goto L_0x0de0;
    L_0x0dbe:
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r28 = r23[r49];
        r7 = 1819408327; // 0x6c71f7c7 float:1.1700849E27 double:8.9890715E-315;
        r0 = r28;
        p000.AssertionError.init(r0, r7);
        r7 = 1;
        return r7;
    L_0x0de0:
        r7 = 5021; // 0x139d float:7.036E-42 double:2.4807E-320;
        r0 = r49;
        if (r7 != r0) goto L_0x0e0e;
    L_0x0de6:
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r28 = r23[r49];
        r0 = r28;
        r28 = r0.toLowerCase();
        r0 = r28;
        r28 = r0.trim();
        p000.client.address = r28;
        r7 = 1;
        return r7;
    L_0x0e0e:
        r7 = 5022; // 0x139e float:7.037E-42 double:2.481E-320;
        r0 = r49;
        if (r0 != r7) goto L_0x0e32;
    L_0x0e14:
        r23 = data;
        r49 = value;
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r7;
        r49 = r0;
        value = r49;
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r7;
        r49 = r0;
        r49 = r49 + -1;
        r28 = p000.client.address;
        r23[r49] = r28;
        r7 = 1;
        return r7;
    L_0x0e32:
        r7 = 2;
        return r7;
    L_0x0e34:
        r29 = 0;
        goto L_0x0238;
        */
        throw new UnsupportedOperationException("Method not decompiled: XMLParser.toString(int, CharSequence, boolean):int");
    }

    static void toString(ArrayList arrayList, int i) {
        int $i1;
        int $i3;
        CharSequence $r6;
        CharSequence $r7;
        Throwable $r16;
        Object[] $r1 = arrayList.size;
        if (Page.toString(182090275 * arrayList.header, (byte) -15)) {
            SparseFieldVector.value = (MediaType) $r1[0];
            ByteBufferList $r5 = ByteBufferList.data[SparseFieldVector.value.length * -1099459587];
            $i1 = arrayList.header * 182090275;
            $i3 = -2068206069 * $r5.type;
            $r6 = Resources.toString(TwofishEngine.af(1733135393 * $r5.this$0, $i1, 735380873), $i1, -1898588231);
            $r7 = $r6;
            if ($r6 == null) {
                $r6 = Resources.toString(((40000 + $i3) << 8) + $i1, $i1, -1912404497);
                $r7 = $r6;
                if ($r6 == null) {
                    $r7 = null;
                }
            }
        } else {
            $r7 = Attribute.toString(((Integer) $r1[0]).intValue(), -2115468043);
        }
        if ($r7 != null) {
            int $i4;
            int $i42;
            int $i5;
            String $r14;
            type = 0;
            value = 0;
            int[] $r9 = $r7.value;
            int[] $r10 = $r7.data;
            offset = 0;
            AssertionError.value = new int[(407879525 * $r7.pos)];
            $i1 = 0;
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
                    AssertionError.value[$i1] = $i5 == -2147483639 ? arrayList.channel * 361884663 : $i5;
                    $i1++;
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
                        $i1 = -1;
                    }
                } else {
                    $i42 = $i2;
                }
                $i3++;
                $i2 = $i42;
            }
            $i2 = 0;
            index = arrayList.branch * 698456767;
            $i1 = -1;
            $i3 = -1;
            while (true) {
                $i2++;
                if ($i2 > i) {
                    throw new RuntimeException();
                }
                $i3++;
                $i1 = $r9[$i3];
                if ($i1 >= 100) {
                    switch (Byte.read($i1, $r7, $r7.data[$i3] == 1, (byte) -80)) {
                        case 0:
                            break;
                        case 1:
                            continue;
                        case 2:
                            throw new IllegalStateException();
                        default:
                            continue;
                    }
                } else if ($i1 == 0) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = $r10[$i3];
                } else if ($i1 == 1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - 1194553915;
                    type = $i5;
                    $r11[($i5 * 537618701) - 1] = Event.this$0[$i42];
                } else if ($i1 == 2) {
                    $i42 = $r10[$i3];
                    $r11 = Event.this$0;
                    $r21 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r11[$i42] = $r21[$i5 * 537618701];
                    IOUtils.update($i42, -340419356);
                } else if (3 == $i1) {
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r7.length[$i3];
                } else if ($i1 == 6) {
                    $i3 = $r10[$i3] + $i3;
                } else if ($i1 == 7) {
                    type -= 1905859466;
                    if (this$0[(537618701 * type) + 1] != this$0[537618701 * type]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (8 == $i1) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] == this$0[(type * 537618701) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 9) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] < this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 10) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] > this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (21 == $i1) {
                    if (344694797 * offset != 0) {
                        $r19 = count;
                        $i3 = offset - -1432768827;
                        offset = $i3;
                        PathParser $r20 = $r19[$i3 * 344694797];
                        $r7 = $r20.name;
                        $i3 = $r20.count;
                        AssertionError.value = $r20.value;
                        Target.value = $r20.data;
                        $r10 = $r7.data;
                        $r9 = $r7.value;
                        $i3 *= -132320779;
                    } else {
                        return;
                    }
                } else if ($i1 == 25) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - 1194553915;
                    type = $i5;
                    $r11[($i5 * 537618701) - 1] = IOException.toString($i42, 998830794);
                } else if (27 == $i1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    Identifier.toString($i42, $r11[$i5 * 537618701], (short) -3416);
                } else if ($i1 == 31) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] <= this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (32 == $i1) {
                    type -= 1905859466;
                    if (this$0[type * 537618701] >= this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 33) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = AssertionError.value[$r10[$i3]];
                } else if (34 == $i1) {
                    $r11 = AssertionError.value;
                    $i42 = $r10[$i3];
                    $r21 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r11[$i42] = $r21[$i5 * 537618701];
                } else if ($i1 == 35) {
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = Target.value[$r10[$i3]];
                } else if ($i1 == 36) {
                    $r12 = Target.value;
                    $i42 = $r10[$i3];
                    String[] $r22 = data;
                    $i5 = value - -1246602361;
                    value = $i5;
                    $r12[$i42] = $r22[$i5 * -1267697097];
                } else if ($i1 == 37) {
                    $i42 = $r10[$i3];
                    value -= -1246602361 * $i42;
                    $r12 = data;
                    $i5 = -1267697097 * value;
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
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r14;
                } else if (38 == $i1) {
                    type -= -1194553915;
                } else if (39 == $i1) {
                    value -= -1246602361;
                } else if ($i1 == 40) {
                    $r6 = Attribute.toString($r10[$i3], -279754684);
                    $r10 = new int[(407879525 * $r6.pos)];
                    String[] $r12 = $r6.head * -1469700137;
                    String[] strArr = $r12;
                    $r12 = new String[$r12];
                    for ($i42 = 0; $i42 < $r6.size * 950863471; $i42++) {
                        $i4 = (type * 537618701) - ($r6.size * 950863471);
                        $i5 = $i4;
                        $r10[$i42] = this$0[$i4 + $i42];
                    }
                    for ($i42 = 0; $i42 < 483841497 * $r6.name; $i42++) {
                        $i4 = (value * -1267697097) - (483841497 * $r6.name);
                        $i5 = $i4;
                        $r12[$i42] = data[$i4 + $i42];
                    }
                    type -= -769321365 * $r6.size;
                    value -= -1322194833 * $r6.name;
                    $i4 = new PathParser();
                    $i4.name = $r7;
                    $i4.count = -475434403 * $i3;
                    $i4.value = AssertionError.value;
                    $i4.data = Target.value;
                    $r19 = count;
                    $i3 = offset - 1432768827;
                    offset = $i3;
                    $r19[($i3 * 344694797) - 1] = $i4;
                    AssertionError.value = $r10;
                    Target.value = $r12;
                    $r10 = $r6.data;
                    $r9 = $r6.value;
                    $r7 = $r6;
                    $i3 = -1;
                } else if (42 == $i1) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = Connection.this$0.size($r10[$i3], 2013460253);
                } else if ($i1 == 43) {
                    $r23 = Connection.this$0;
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r23.add($i42, $r11[$i5 * 537618701], 224110188);
                } else if (44 == $i1) {
                    $i42 = $r10[$i3] >> 16;
                    $i5 = 65535 & $r10[$i3];
                    $r11 = this$0;
                    $i7 = type - -1194553915;
                    type = $i7;
                    $i7 = $r11[$i7 * 537618701];
                    if ($i7 < 0 || $i7 > 5000) {
                        throw new RuntimeException();
                    }
                    name[$i42] = $i7;
                    int i2 = -1;
                    if ($i5 == 105) {
                        i2 = 0;
                    }
                    for ($i5 = 0; $i5 < $i7; $i5++) {
                        size[$i42][$i5] = i2;
                    }
                } else if (45 == $i1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $i5 = $r11[$i5 * 537618701];
                    if ($i5 < 0 || $i5 >= name[$i42]) {
                        throw new RuntimeException();
                    }
                    $r11 = this$0;
                    $i7 = type - 1194553915;
                    type = $i7;
                    $r11[($i7 * 537618701) - 1] = size[$i42][$i5];
                } else if ($i1 == 46) {
                    $i42 = $r10[$i3];
                    type -= 1905859466;
                    $i5 = this$0[537618701 * type];
                    if ($i5 < 0 || $i5 >= name[$i42]) {
                        throw new RuntimeException();
                    }
                    size[$i42][$i5] = this$0[(type * 537618701) + 1];
                } else if ($i1 == 47) {
                    $r14 = Connection.this$0.get($r10[$i3], 1771818963);
                    String $r25 = $r14;
                    if ($r14 == null) {
                        $r25 = R$id.this$0;
                    }
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r25;
                } else if ($i1 == 48) {
                    $r23 = Connection.this$0;
                    $i42 = $r10[$i3];
                    $r12 = data;
                    $i5 = value - -1246602361;
                    value = $i5;
                    $r23.put($i42, $r12[$i5 * -1267697097], 427793602);
                } else if (60 == $i1) {
                    Date $r27 = $r7.offset[$r10[$i3]];
                    $r11 = this$0;
                    $i42 = type - -1194553915;
                    type = $i42;
                    try {
                        Value $r29 = (Value) $r27.get((long) $r11[$i42 * 537618701]);
                        if ($r29 != null) {
                            $i3 = $r29.value + $i3;
                        }
                    } catch (Exception e2) {
                        $r16 = e2;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return;
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("").append($r7.size).append(" ");
        for (i = (344694797 * offset) - 1; i >= 0; i--) {
            StringBuilder $r18 = stringBuilder.append("");
            long $l6 = count[i].name;
            $r7 = $l6;
            $r18.append($l6.size).append(" ");
        }
        stringBuilder.append("").append($i1);
        JSONArray.get(stringBuilder.toString(), $r16, (short) 8593);
    }

    static int update(int $i0, CharSequence charSequence, boolean z) {
        int $i1;
        System $r1;
        boolean $z1 = false;
        if ($i0 >= 2000) {
            $i0 -= 1000;
            int[] $r2 = this$0;
            $i1 = type - -1194553915;
            type = $i1;
            $i1 = $r2[$i1 * 537618701];
            $r1 = ArrayList.get($i1, 1383042454);
        } else {
            $r1 = z ? Constants.data : state;
            $i1 = -1;
        }
        if (1000 == $i0) {
            type -= -483248364;
            $r1.f285b = -1299204119 * this$0[type * 537618701];
            $r1.f299w = this$0[(type * 537618701) + 1] * 922175265;
            $r1.f298s = -1859331853 * this$0[(type * 537618701) + 2];
            $r1.f301y = 1800206059 * this$0[(type * 537618701) + 3];
            client.add($r1, (byte) 72);
            client.context.set($r1, (short) -27645);
            if (-1 != $i1 && $r1.name * -128421835 == 0) {
                Model.write(Float.size[$i1 >> 16], $r1, false, (byte) -68);
                return 1;
            }
        } else if ($i0 == 1001) {
            type -= -483248364;
            $r1.f300x = 507881715 * this$0[type * 537618701];
            $r1.f288e = -14232227 * this$0[(type * 537618701) + 1];
            $r1.f295p = this$0[(type * 537618701) + 2] * -1778589005;
            $r1.f290g = this$0[(type * 537618701) + 3] * -186773411;
            client.add($r1, (byte) 12);
            client.context.set($r1, (short) -32398);
            if ($i1 != -1 && $r1.name * -128421835 == 0) {
                Model.write(Float.size[$i1 >> 16], $r1, false, (byte) -103);
                return 1;
            }
        } else if ($i0 == 1003) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            z = $r2[$i0 * 537618701] == 1;
            if ($r1.start != z) {
                $r1.start = z;
                client.add($r1, (byte) 107);
                return 1;
            }
        } else if (1005 == $i0) {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $z1 = true;
            }
            $r1.f294n = $z1;
            return 1;
        } else if (1006 != $i0) {
            return 2;
        } else {
            $r2 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            if ($r2[$i0 * 537618701] == 1) {
                $z1 = true;
            }
            $r1.f291h = $z1;
            return 1;
        }
        return 1;
    }

    static int validate(int $i0, CharSequence charSequence, boolean z) {
        byte $b1 = (byte) 0;
        int[] $r1;
        String[] $r2;
        int $i2;
        if (4200 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r2 = data;
            $i2 = value - 1246602361;
            value = $i2;
            $r2[($i2 * -1267697097) - 1] = Set.get($i0, 1067181138).value;
            return 1;
        } else if (4201 == $i0) {
            type -= 1905859466;
            $i2 = this$0[type * 537618701];
            $i0 = this$0[(type * 537618701) + 1];
            $r3 = Set.get($i2, 1893701632);
            if ($i0 < 1 || $i0 > 5 || $r3.text[$i0 - 1] == null) {
                $r2 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r2[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r2 = data;
            $i2 = value - 1246602361;
            value = $i2;
            $r2[($i2 * -1267697097) - 1] = $r3.text[$i0 - 1];
            return 1;
        } else if ($i0 == 4202) {
            type -= 1905859466;
            $i2 = this$0[type * 537618701];
            $i0 = this$0[(type * 537618701) + 1];
            $r3 = Set.get($i2, 1665494072);
            if ($i0 < 1 || $i0 > 5 || $r3.this$0[$i0 - 1] == null) {
                $r2 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r2[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r2 = data;
            $i2 = value - 1246602361;
            value = $i2;
            $r2[($i2 * -1267697097) - 1] = $r3.this$0[$i0 - 1];
            return 1;
        } else if (4203 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $r1[($i2 * 537618701) - 1] = Set.get($i0, 1155660209).id * 116446285;
            return 1;
        } else if (4204 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if (Set.get($i0, 1120254279).name * 1099170281 == 1) {
                $b1 = (byte) 1;
            }
            $r1[$i2] = $b1;
            return 1;
        } else if (4205 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r3 = Set.get($i0, 1981758846);
            if ($r3.log * -50977591 != -1 || -1461501241 * $r3.tag < 0) {
                $r1 = this$0;
                $i2 = type - 1194553915;
                type = $i2;
                $r1[($i2 * 537618701) - 1] = $i0;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r3.tag * -1461501241;
            return 1;
        } else if ($i0 == 4206) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r3 = Set.get($i0, 1651202988);
            if ($r3.log * -50977591 < 0 || $r3.tag * -1461501241 < 0) {
                $r1 = this$0;
                $i2 = type - 1194553915;
                type = $i2;
                $r1[($i2 * 537618701) - 1] = $i0;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r3.tag * -1461501241;
            return 1;
        } else if (4207 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if (Set.get($i0, 1211241196).type) {
                $b1 = (byte) 1;
            }
            $r1[$i2] = $b1;
            return 1;
        } else if (4208 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r3 = Set.get($i0, 1553094246);
            if ($r3.url * 2018587685 != -1 || -778372525 * $r3.source < 0) {
                $r1 = this$0;
                $i2 = type - 1194553915;
                type = $i2;
                $r1[($i2 * 537618701) - 1] = $i0;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r3.source * -778372525;
            return 1;
        } else if (4209 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r3 = Set.get($i0, 1809280081);
            if ($r3.url * 2018587685 < 0 || -778372525 * $r3.source < 0) {
                $r1 = this$0;
                $i2 = type - 1194553915;
                type = $i2;
                $r1[($i2 * 537618701) - 1] = $i0;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = $r3.source * -778372525;
            return 1;
        } else if ($i0 == 4210) {
            $r2 = data;
            $i0 = value - -1246602361;
            value = $i0;
            String $r4 = $r2[$i0 * -1267697097];
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            z = 1 == $r1[$i0 * 537618701];
            $r4 = $r4.toLowerCase();
            $i0 = 0;
            $r6 = new short[16];
            for ($i2 = 0; $i2 < Message.entry * 916326225; $i2++) {
                $r3 = Set.get($i2, 1100427181);
                if ((!z || $r3.root) && -50977591 * $r3.log == -1) {
                    String $r8 = $r3.value;
                    String str = $r8;
                    if ($r8.toLowerCase().indexOf($r4) == -1) {
                        continue;
                    } else if ($i0 >= 250) {
                        Cache.type = 1238222265;
                        AbstractParser.value = null;
                        break;
                    } else {
                        short[] $r7;
                        if ($i0 >= $r6.length) {
                            $r7 = new short[($r6.length * 2)];
                            for (int $i4 = 0; $i4 < $i0; $i4++) {
                                $r7[$i4] = $r6[$i4];
                            }
                        } else {
                            $r7 = $r6;
                        }
                        $r7[$i0] = (short) $i2;
                        $i0++;
                        $r6 = $r7;
                    }
                }
            }
            AbstractParser.value = $r6;
            Locale.value = 0;
            Cache.type = -1238222265 * $i0;
            $r2 = new String[(-696430729 * Cache.type)];
            for ($i0 = 0; $i0 < Cache.type * -696430729; $i0++) {
                $r2[$i0] = Set.get($r6[$i0], 1221070367).value;
            }
            ArrayList.add($r2, AbstractParser.value, 0, $r2.length - 1, 601777241);
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $r1[($i0 * 537618701) - 1] = -696430729 * Cache.type;
            return 1;
        } else if ($i0 == 4211) {
            if (AbstractParser.value == null || Locale.value * 1214242337 >= Cache.type * -696430729) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r1 = this$0;
            $i0 = type - 1194553915;
            type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            $r6 = AbstractParser.value;
            $i2 = Locale.value - 1505548831;
            Locale.value = $i2;
            $r1[$i0] = $r6[($i2 * 1214242337) - 1] & 65535;
            return 1;
        } else if (4212 != $i0) {
            return 2;
        } else {
            Locale.value = 0;
            return 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int write(int r49, p000.CharSequence r50, boolean r51) {
        /*
        r7 = 0;
        r8 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0 = r49;
        if (r8 != r0) goto L_0x0167;
    L_0x0007:
        r9 = this$0;
        r49 = type;
        r8 = 1786084341; // 0x6a757bf5 float:7.419305E25 double:8.824429135E-315;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 1627883927; // 0x61078997 float:1.5626405E20 double:8.042815237E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r7 = p000.client.top;
        r8 = 321761329; // 0x132db031 float:2.1922539E-27 double:1.58971219E-315;
        r7 = r7 * r8;
        r9[r49] = r7;
        r8 = 1;
        return r8;
    L_0x0029:
        r10 = p000.R$id.to;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0beb;
    L_0x0031:
        r11 = p000.R$id.to;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 3;
    L_0x003c:
        r14 = p000.R$string.result;
        r15 = p000.client.this$0;
        r0 = r15.key;
        r16 = r0;
        r8 = -4;
        r0 = r16;
        r17 = p000.Logger.add(r14, r0, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = 0;
        r19 = 31;
        r0 = r18;
        r1 = r19;
        r0.append(r8, r1);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r7 = r0.data;
        r8 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r7 = r7 * r8;
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = 31;
        r0 = r18;
        r1 = r49;
        r0.append(r1, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = 31;
        r0 = r18;
        r1 = r20;
        r0.append(r1, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = 31;
        r0 = r18;
        r0.append(r13, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r0 = r0.data;
        r49 = r0;
        r8 = 765509944; // 0x2da0c138 float:1.82757E-11 double:3.78212165E-315;
        r21 = p000.TimeUnit.decode(r12, r8);
        r0 = r21;
        r0 = r0.length;
        r49 = r0;
        r8 = 1779617961; // 0x6a12d0a9 float:4.4372134E25 double:8.792480973E-315;
        r0 = r18;
        r1 = r49;
        r0.log(r1, r8);
        r0 = r18;
        r0 = r0.data;
        r49 = r0;
        r22 = p000.MimeType.data;
        r0 = r21;
        r0 = r0.length;
        r23 = r0;
        r0 = r18;
        r0 = r0.size;
        r24 = r0;
        r0 = r18;
        r0 = r0.data;
        r25 = r0;
        r8 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;
        r25 = r8 * r25;
        r8 = 0;
        r19 = 1363166700; // 0x514045ec float:5.1612926E10 double:6.73493836E-315;
        r0 = r22;
        r1 = r21;
        r2 = r8;
        r3 = r23;
        r4 = r24;
        r5 = r25;
        r6 = r19;
        r23 = r0.encode(r1, r2, r3, r4, r5, r6);
        r8 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r0 = r23;
        r0 = r0 * r8;
        r23 = r0;
        r49 = r23 + r49;
        r0 = r49;
        r1 = r18;
        r1.data = r0;
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r0 = r17;
        r0 = r0.this$0;
        r26 = r0;
        r0 = r0.data;
        r49 = r0;
        r8 = 1722228575; // 0x66a71f5f float:3.9460695E23 double:8.50893973E-315;
        r49 = r8 * r49;
        r0 = r49;
        r0 = r0 - r7;
        r49 = r0;
        r8 = 684381889; // 0x28cad6c1 float:2.251964E-14 double:3.3812958E-315;
        r0 = r18;
        r1 = r49;
        r0.getName(r1, r8);
        r15 = p000.client.this$0;
        r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r17;
        r15.add(r0, r8);
        r8 = 1;
        return r8;
    L_0x0124:
        r10 = p000.R$id.artist;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x074d;
    L_0x012c:
        r20 = 9;
        r11 = p000.R$id.artist;
        r7 = r11.length();
        r12 = r12.substring(r7);
    L_0x0138:
        r11 = r12.toLowerCase();
        r10 = p000.R$id.proxy;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0a48;
    L_0x0144:
        r11 = p000.R$id.proxy;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 1;
        goto L_0x003c;
    L_0x0152:
        r10 = p000.R$id.label;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0b88;
    L_0x015a:
        r20 = 6;
        r11 = p000.R$id.label;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0167:
        r8 = 5001; // 0x1389 float:7.008E-42 double:2.471E-320;
        r0 = r49;
        if (r8 != r0) goto L_0x0353;
    L_0x016d:
        r49 = type;
        r8 = 711305551; // 0x2a65a94f float:2.0398027E-13 double:3.514316364E-315;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        type = r49;
        r9 = this$0;
        r49 = type;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r9[r49];
        r8 = -1551652655; // 0xffffffffa383a8d1 float:-1.4274545E-17 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        p000.client.top = r49;
        r9 = this$0;
        r49 = type;
        r8 = -214419726; // 0xfffffffff33836f2 float:-1.4594987E31 double:NaN;
        r49 = r8 * r49;
        r49 = r49 + 1;
        r49 = r9[r49];
        r8 = -919757887; // 0xffffffffc92d9bc1 float:-711100.06 double:NaN;
        r27 = p000.Exception.toString(r8);
    L_0x01a5:
        r0 = r27;
        r0 = r0.length;
        r23 = r0;
        if (r7 >= r0) goto L_0x0301;
    L_0x01ac:
        r28 = r27[r7];
        r0 = r28;
        r0 = r0.data;
        r23 = r0;
        r8 = -1932085427; // 0xffffffff8cd6b74d float:-3.308224E-31 double:NaN;
        r0 = r23;
        r0 = r0 * r8;
        r23 = r0;
        r1 = r49;
        if (r0 != r1) goto L_0x05a5;
    L_0x01c0:
        p000.ByteBufferList.position = r28;
        r28 = p000.ByteBufferList.position;
        if (r28 != 0) goto L_0x01ca;
    L_0x01c6:
        r28 = p000.Info.file;
        p000.ByteBufferList.position = r28;
    L_0x01ca:
        r9 = this$0;
        r49 = type;
        r8 = -1397418443; // 0xffffffffacb51635 float:-5.146795E-12 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + 2;
        r49 = r9[r49];
        r8 = 498982199; // 0x1dbddd37 float:5.0256614E-21 double:2.465299624E-315;
        r49 = r8 * r49;
        p000.client.pointer = r49;
        r14 = p000.R$string.current;
        r15 = p000.client.this$0;
        r0 = r15.key;
        r16 = r0;
        r8 = -6;
        r0 = r16;
        r17 = p000.Logger.add(r14, r0, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r49 = p000.client.top;
        r8 = 321761329; // 0x132db031 float:2.1922539E-27 double:1.58971219E-315;
        r49 = r8 * r49;
        r8 = 31;
        r0 = r18;
        r1 = r49;
        r0.append(r1, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r28 = p000.ByteBufferList.position;
        r0 = r28;
        r0 = r0.data;
        r49 = r0;
        r8 = 677600269; // 0x28635c0d float:1.2620992E-14 double:3.347790145E-315;
        r49 = r8 * r49;
        r8 = 31;
        r0 = r18;
        r1 = r49;
        r0.append(r1, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r49 = p000.client.pointer;
        r8 = -1224080547; // 0xffffffffb70a035d float:-8.226224E-6 double:NaN;
        r49 = r8 * r49;
        r8 = 31;
        r0 = r18;
        r1 = r49;
        r0.append(r1, r8);
        r15 = p000.client.this$0;
        r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r17;
        r15.add(r0, r8);
        r8 = 1;
        return r8;
    L_0x0243:
        r9 = this$0;
        r49 = type;
        r8 = 289058578; // 0x113aaf12 float:1.472676E-28 double:1.42813913E-315;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = -1;
        r9[r49] = r8;
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = -1015070263; // 0xffffffffc37f41c9 float:-255.25697 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = 0;
        r9[r49] = r8;
        r29 = data;
        r49 = value;
        r8 = -965833125; // 0xffffffffc66e8e5b float:-15267.589 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = 1163920043; // 0x456002ab float:3584.1667 double:5.750529078E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r30 = "";
        r29[r49] = r30;
        r29 = data;
        r49 = value;
        r8 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r30 = "";
        r29[r49] = r30;
        r29 = data;
        r49 = value;
        r8 = 1108483871; // 0x42121f1f float:36.53039 double:5.476637996E-315;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = 233886563; // 0xdf0d363 float:1.48420315E-30 double:1.15555316E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r30 = "";
        r29[r49] = r30;
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = 0;
        r9[r49] = r8;
        r8 = 1;
        return r8;
    L_0x02ea:
        r10 = p000.R$id.command;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0a1a;
    L_0x02f2:
        r20 = 9;
        r11 = p000.R$id.command;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0301:
        r28 = 0;
        goto L_0x01c0;
    L_0x0306:
        r8 = -1028960758; // 0xffffffffc2ab4e0a float:-85.65242 double:NaN;
        r0 = r31;
        r51 = r0.get(r8);
        if (r51 == 0) goto L_0x0312;
    L_0x0311:
        r7 = 2;
    L_0x0312:
        r9[r49] = r7;
        r8 = 1;
        return r8;
    L_0x0316:
        r8 = 5020; // 0x139c float:7.035E-42 double:2.48E-320;
        r0 = r49;
        if (r0 != r8) goto L_0x0a5e;
    L_0x031c:
        r29 = data;
        r49 = value;
        r8 = 1157676752; // 0x4500bed0 float:2059.9258 double:5.71968312E-315;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        value = r49;
        r8 = 806114231; // 0x300c53b7 float:5.105067E-10 double:3.98273348E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r12 = r29[r49];
        r8 = 1819366339; // 0x6c7153c3 float:1.1669867E27 double:8.988864053E-315;
        p000.AssertionError.init(r12, r8);
        r8 = 1;
        return r8;
    L_0x033c:
        r10 = p000.R$id.root;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x08cd;
    L_0x0344:
        r20 = 4;
        r11 = p000.R$id.root;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0353:
        r8 = 5002; // 0x138a float:7.009E-42 double:2.4713E-320;
        r0 = r49;
        if (r0 != r8) goto L_0x0422;
    L_0x0359:
        r29 = data;
        r49 = value;
        r8 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r12 = r29[r49];
        r49 = type;
        r8 = 387594953; // 0x171a3ac9 float:4.983428E-25 double:1.91497351E-315;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        type = r49;
        r9 = this$0;
        r49 = type;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r9[r49];
        r9 = this$0;
        r7 = type;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r7 = r7 * r8;
        r7 = r7 + 1;
        r7 = r9[r7];
        r14 = p000.R$string.line;
        r15 = p000.client.this$0;
        r0 = r15.key;
        r16 = r0;
        r8 = -27;
        r0 = r16;
        r17 = p000.Logger.add(r14, r0, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = -695077764; // 0xffffffffd691f47c float:-8.0239619E13 double:NaN;
        r23 = p000.Record.toString(r12, r8);
        r23 = r23 + 2;
        r8 = 31;
        r0 = r18;
        r1 = r23;
        r0.append(r1, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = -105; // 0xffffffffffffff97 float:NaN double:NaN;
        r0 = r18;
        r0.add(r12, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r49 = r49 + -1;
        r8 = 31;
        r0 = r18;
        r1 = r49;
        r0.append(r1, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = 31;
        r0 = r18;
        r0.append(r7, r8);
        r15 = p000.client.this$0;
        r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r17;
        r15.add(r0, r8);
        r8 = 1;
        return r8;
    L_0x03f5:
        r10 = p000.R$id.file;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0cf3;
    L_0x03fd:
        r11 = p000.R$id.file;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 5;
        goto L_0x003c;
    L_0x040b:
        r10 = p000.R$id.filename;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0124;
    L_0x0413:
        r20 = 8;
        r11 = p000.R$id.filename;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0422:
        r8 = 5003; // 0x138b float:7.01E-42 double:2.472E-320;
        r0 = r49;
        if (r8 != r0) goto L_0x05c1;
    L_0x0428:
        r49 = type;
        r8 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        type = r49;
        r9 = this$0;
        r49 = type;
        r8 = 327967724; // 0x138c63ec float:3.54395E-27 double:1.620375854E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r9[r49];
        r9 = this$0;
        r23 = type;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r23;
        r0 = r0 * r8;
        r23 = r0;
        r23 = r23 + 1;
        r23 = r9[r23];
        r32 = p000.DrawingGroup.content;
        r0 = r49;
        r33 = java.lang.Integer.valueOf(r0);
        r0 = r32;
        r1 = r33;
        r34 = r0.get(r1);
        r36 = r34;
        r36 = (p000.Record) r36;
        r35 = r36;
        r8 = 1842229661; // 0x6dce319d float:7.9767363E27 double:9.101823872E-315;
        r0 = r35;
        r1 = r23;
        r31 = r0.getData(r1, r8);
        if (r31 == 0) goto L_0x0680;
    L_0x0475:
        r9 = this$0;
        r49 = type;
        r8 = 367310780; // 0x15e4b7bc float:9.237835E-26 double:1.814756377E-315;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = -947188577; // 0xffffffffc78b0c9f float:-71193.24 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r0 = r0.value;
        r23 = r0;
        r8 = 1687932353; // 0x649bcdc1 float:2.2992572E22 double:8.33949388E-315;
        r23 = r8 * r23;
        r9[r49] = r23;
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 1068297952; // 0x3faceee0 float:1.3510399 double:5.278093176E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r0 = r0.max;
        r23 = r0;
        r8 = -1939883689; // 0xffffffff8c5fb957 float:-1.7235069E-31 double:NaN;
        r0 = r23;
        r0 = r0 * r8;
        r23 = r0;
        r9[r49] = r23;
        r29 = data;
        r49 = value;
        r8 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r12 = r0.id;
        if (r12 == 0) goto L_0x0748;
    L_0x04e0:
        r0 = r31;
        r12 = r0.id;
    L_0x04e4:
        r29[r49] = r12;
        r29 = data;
        r49 = value;
        r8 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r12 = r0.key;
        if (r12 == 0) goto L_0x0727;
    L_0x0504:
        r0 = r31;
        r12 = r0.key;
    L_0x0508:
        r29[r49] = r12;
        r29 = data;
        r49 = value;
        r8 = -2116184830; // 0xffffffff81dd9502 float:-8.1396394E-38 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r12 = r0.length;
        if (r12 == 0) goto L_0x0743;
    L_0x0528:
        r0 = r31;
        r12 = r0.length;
    L_0x052c:
        r29[r49] = r12;
        r9 = this$0;
        r49 = type;
        r8 = 140260614; // 0x85c3506 float:6.626617E-34 double:6.9297951E-316;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = -1116170756; // 0xffffffffbd7895fc float:-0.06068991 double:NaN;
        r0 = r31;
        r51 = r0.add(r8);
        if (r51 == 0) goto L_0x0306;
    L_0x0551:
        r7 = 1;
        goto L_0x0312;
    L_0x0555:
        r12 = "";
    L_0x0557:
        r29[r49] = r12;
        r29 = data;
        r49 = value;
        r8 = -939886412; // 0xffffffffc7fa78b4 float:-128241.41 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r12 = r0.length;
        if (r12 == 0) goto L_0x08c8;
    L_0x0577:
        r0 = r31;
        r12 = r0.length;
    L_0x057b:
        r29[r49] = r12;
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = -442515438; // 0xffffffffe59fc012 float:-9.429992E22 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = -1116170756; // 0xffffffffbd7895fc float:-0.06068991 double:NaN;
        r0 = r31;
        r51 = r0.add(r8);
        if (r51 == 0) goto L_0x08e4;
    L_0x05a0:
        r7 = 1;
    L_0x05a1:
        r9[r49] = r7;
        r8 = 1;
        return r8;
    L_0x05a5:
        r7 = r7 + 1;
        goto L_0x01a5;
    L_0x05aa:
        r10 = p000.R$id.date;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x072c;
    L_0x05b2:
        r11 = p000.R$id.date;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r20 = 1;
        goto L_0x0138;
    L_0x05c1:
        r8 = 5004; // 0x138c float:7.012E-42 double:2.4723E-320;
        r0 = r49;
        if (r8 != r0) goto L_0x0909;
    L_0x05c7:
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r9[r49];
        r8 = -1396621184; // 0xffffffffacc14080 float:-5.492551E-12 double:NaN;
        r0 = r49;
        r31 = p000.AESCipher.getData(r0, r8);
        if (r31 == 0) goto L_0x0243;
    L_0x05ea:
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = -719232827; // 0xffffffffd52160c5 float:-1.10898121E13 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r0 = r0.index;
        r23 = r0;
        r8 = -1721295056; // 0xffffffff99671f30 float:-1.1948718E-23 double:NaN;
        r0 = r23;
        r0 = r0 * r8;
        r23 = r0;
        r9[r49] = r23;
        r9 = this$0;
        r49 = type;
        r8 = -948380219; // 0xffffffffc778ddc5 float:-63709.77 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 1654665915; // 0x62a032bb float:1.4775673E21 double:8.17513584E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r0 = r0.max;
        r23 = r0;
        r8 = -1973859422; // 0xffffffff8a594ba2 float:-1.0462395E-32 double:NaN;
        r23 = r8 * r23;
        r9[r49] = r23;
        r29 = data;
        r49 = value;
        r8 = -1033673458; // 0xffffffffc263650e float:-56.848686 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = 1148930453; // 0x447b4995 float:1005.1497 double:5.676470663E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r12 = r0.id;
        if (r12 == 0) goto L_0x08c3;
    L_0x0655:
        r0 = r31;
        r12 = r0.id;
    L_0x0659:
        r29[r49] = r12;
        r29 = data;
        r49 = value;
        r8 = -594569829; // 0xffffffffdc8f959b float:-3.23323317E17 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r0 = r31;
        r12 = r0.key;
        if (r12 == 0) goto L_0x0555;
    L_0x0679:
        r0 = r31;
        r12 = r0.key;
        goto L_0x0557;
    L_0x0680:
        r9 = this$0;
        r49 = type;
        r8 = -2008362603; // 0xffffffff884ad195 float:-6.1033526E-34 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = -1;
        r9[r49] = r8;
        r9 = this$0;
        r49 = type;
        r8 = -727473764; // 0xffffffffd4a3a19c float:-5.6223282E12 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 638897831; // 0x2614cea7 float:5.162788E-16 double:3.156574695E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = 0;
        r9[r49] = r8;
        r29 = data;
        r49 = value;
        r8 = -1522150956; // 0xffffffffa545d1d4 float:-1.7158119E-16 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = 2040059310; // 0x7998d5ae float:9.919538E34 double:1.0079232205E-314;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r30 = "";
        r29[r49] = r30;
        r29 = data;
        r49 = value;
        r8 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1707904683; // 0xffffffff9a337155 float:-3.710788E-23 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r30 = "";
        r29[r49] = r30;
        r29 = data;
        r49 = value;
        r8 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -31677470; // 0xfffffffffe1ca3e2 float:-5.2052624E37 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r30 = "";
        r29[r49] = r30;
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = 0;
        r9[r49] = r8;
        r8 = 1;
        return r8;
    L_0x0727:
        r12 = "";
        goto L_0x0508;
    L_0x072c:
        r10 = p000.R$id.content;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0a89;
    L_0x0734:
        r20 = 2;
        r11 = p000.R$id.content;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0743:
        r12 = "";
        goto L_0x052c;
    L_0x0748:
        r12 = "";
        goto L_0x04e4;
    L_0x074d:
        r10 = p000.R$id.genre;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0b9f;
    L_0x0755:
        r20 = 10;
        r11 = p000.R$id.genre;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0764:
        r10 = p000.R$id.title;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0b12;
    L_0x076c:
        r20 = 3;
        r11 = p000.R$id.title;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x077b:
        r8 = 631436054; // 0x25a2f316 float:2.8267242E-16 double:3.11970862E-315;
        r0 = r49;
        if (r0 != r8) goto L_0x086b;
    L_0x0782:
        r49 = value;
        r8 = 1592918790; // 0x5ef20306 float:8.7193944E18 double:7.87006451E-315;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        value = r49;
        r29 = data;
        r49 = value;
        r8 = -1345613935; // 0xffffffffafcb8f91 float:-3.7027495E-10 double:NaN;
        r49 = r8 * r49;
        r12 = r29[r49];
        r29 = data;
        r49 = value;
        r8 = -1493323607; // 0xffffffffa6fdb0a9 float:-1.7603285E-15 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + 1;
        r11 = r29[r49];
        r14 = p000.R$string.address;
        r15 = p000.client.this$0;
        r0 = r15.key;
        r16 = r0;
        r8 = 45;
        r0 = r16;
        r17 = p000.Logger.add(r14, r0, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = 0;
        r19 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;
        r0 = r18;
        r1 = r19;
        r0.get(r8, r1);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r0 = r0.data;
        r49 = r0;
        r8 = 1470562829; // 0x57a7020d float:3.672545E14 double:7.26554574E-315;
        r49 = r8 * r49;
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r8 = -47;
        r0 = r18;
        r0.add(r12, r8);
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r7 = r0.data;
        r8 = -626037447; // 0xffffffffdaaf6d39 float:-2.46891063E16 double:NaN;
        r21 = p000.TimeUnit.decode(r11, r8);
        r0 = r21;
        r7 = r0.length;
        r8 = 1779617961; // 0x6a12d0a9 float:4.4372134E25 double:8.792480973E-315;
        r0 = r18;
        r0.log(r7, r8);
        r0 = r18;
        r7 = r0.data;
        r22 = p000.MimeType.data;
        r0 = r21;
        r0 = r0.length;
        r23 = r0;
        r0 = r18;
        r0 = r0.size;
        r24 = r0;
        r0 = r18;
        r0 = r0.data;
        r25 = r0;
        r8 = 246207872; // 0xeacd580 float:4.2606867E-30 double:1.216428513E-315;
        r0 = r25;
        r0 = r0 * r8;
        r25 = r0;
        r8 = 0;
        r19 = 1363166700; // 0x514045ec float:5.1612926E10 double:6.73493836E-315;
        r0 = r22;
        r1 = r21;
        r2 = r8;
        r3 = r23;
        r4 = r24;
        r5 = r25;
        r6 = r19;
        r23 = r0.encode(r1, r2, r3, r4, r5, r6);
        r8 = 2065011939; // 0x7b1594e3 float:7.76672E35 double:1.0202514573E-314;
        r0 = r23;
        r0 = r0 * r8;
        r23 = r0;
        r7 = r23 + r7;
        r0 = r18;
        r0.data = r7;
        r0 = r17;
        r0 = r0.this$0;
        r18 = r0;
        r0 = r17;
        r0 = r0.this$0;
        r26 = r0;
        r7 = r0.data;
        r8 = 916946205; // 0x36a77d1d float:4.991553E-6 double:4.53031619E-315;
        r7 = r8 * r7;
        r49 = r7 - r49;
        r8 = 32;
        r0 = r18;
        r1 = r49;
        r0.write(r1, r8);
        r15 = p000.client.this$0;
        r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r17;
        r15.add(r0, r8);
        r8 = 1;
        return r8;
    L_0x086b:
        r8 = 5015; // 0x1397 float:7.028E-42 double:2.4777E-320;
        r0 = r49;
        if (r0 != r8) goto L_0x0b5e;
    L_0x0871:
        r37 = p000.File.this$0;
        if (r37 == 0) goto L_0x0c3c;
    L_0x0875:
        r37 = p000.File.this$0;
        r0 = r37;
        r0 = r0.type;
        r38 = r0;
        if (r38 == 0) goto L_0x0c3c;
    L_0x087f:
        r37 = p000.File.this$0;
        r0 = r37;
        r0 = r0.type;
        r38 = r0;
        r8 = -851744194; // 0xffffffffcd3b6a3e float:-1.9651888E8 double:NaN;
        r0 = r38;
        r12 = r0.toString(r8);
    L_0x0890:
        r29 = data;
        r49 = value;
        r8 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r29[r49] = r12;
        r8 = 1;
        return r8;
    L_0x08ac:
        r10 = p000.R$id.description;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0ae5;
    L_0x08b4:
        r11 = p000.R$id.description;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r20 = 1;
        goto L_0x0138;
    L_0x08c3:
        r12 = "";
        goto L_0x0659;
    L_0x08c8:
        r12 = "";
        goto L_0x057b;
    L_0x08cd:
        r10 = p000.R$id.link;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0aa0;
    L_0x08d5:
        r20 = 5;
        r11 = p000.R$id.link;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x08e4:
        r8 = -1048257947; // 0xffffffffc184da65 float:-16.606638 double:NaN;
        r0 = r31;
        r51 = r0.get(r8);
        if (r51 == 0) goto L_0x05a1;
    L_0x08ef:
        r7 = 2;
        goto L_0x05a1;
    L_0x08f3:
        r10 = p000.R$id.item;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x03f5;
    L_0x08fb:
        r11 = p000.R$id.item;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 4;
        goto L_0x003c;
    L_0x0909:
        r8 = -1920569926; // 0xffffffff8d866dba float:-8.284803E-31 double:NaN;
        r0 = r49;
        if (r8 != r0) goto L_0x09c9;
    L_0x0910:
        r28 = p000.ByteBufferList.position;
        if (r28 != 0) goto L_0x09a3;
    L_0x0914:
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r8 = -1;
        r9[r49] = r8;
        r8 = 1;
        return r8;
    L_0x0931:
        r7 = p000.client.title;
        r8 = 680934271; // 0x28963b7f float:1.6679148E-14 double:3.364262304E-315;
        r7 = r8 * r7;
        if (r7 == 0) goto L_0x0cf3;
    L_0x093a:
        r10 = p000.R$id.property;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0bd5;
    L_0x0942:
        r11 = p000.R$id.property;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 1;
        goto L_0x003c;
    L_0x0950:
        r8 = 913064681; // 0x366c42e9 float:3.5205687E-6 double:4.511138913E-315;
        r0 = r49;
        if (r8 != r0) goto L_0x0c41;
    L_0x0957:
        r9 = this$0;
        r49 = type;
        r8 = 2141649603; // 0x7fa6fac3 float:NaN double:1.0581154943E-314;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r9[r49];
        r9 = this$0;
        r23 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r23;
        r0 = r0 + r8;
        r23 = r0;
        type = r23;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r23;
        r0 = r0 * r8;
        r23 = r0;
        r23 = r23 + -1;
        r32 = p000.DrawingGroup.content;
        r0 = r49;
        r33 = java.lang.Integer.valueOf(r0);
        r0 = r32;
        r1 = r33;
        r34 = r0.get(r1);
        r39 = r34;
        r39 = (p000.Record) r39;
        r35 = r39;
        if (r35 != 0) goto L_0x0c30;
    L_0x099f:
        r9[r23] = r7;
        r8 = 1;
        return r8;
    L_0x09a3:
        r9 = this$0;
        r49 = type;
        r8 = -233006393; // 0xfffffffff21c9ac7 float:-3.1018737E30 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = -817255758; // 0xffffffffcf49aab2 float:-3.3834071E9 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r28 = p000.ByteBufferList.position;
        r0 = r28;
        r7 = r0.data;
        r8 = 677600269; // 0x28635c0d float:1.2620992E-14 double:3.347790145E-315;
        r7 = r7 * r8;
        r9[r49] = r7;
        r8 = 1;
        return r8;
    L_0x09c9:
        r8 = 5008; // 0x1390 float:7.018E-42 double:2.4743E-320;
        r0 = r49;
        if (r8 != r0) goto L_0x077b;
    L_0x09cf:
        r29 = data;
        r49 = value;
        r8 = 2063544439; // 0x7aff3077 float:6.6250934E35 double:1.019526416E-314;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        value = r49;
        r8 = -1950160193; // 0xffffffff8bc2eabf float:-7.507929E-32 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r12 = r29[r49];
        r9 = this$0;
        r49 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r9[r49];
        r11 = r12.toLowerCase();
        r10 = p000.R$id.author;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x05aa;
    L_0x0a0b:
        r11 = p000.R$id.author;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r20 = 0;
        goto L_0x0138;
    L_0x0a1a:
        r10 = p000.R$id.track;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0ace;
    L_0x0a22:
        r20 = 10;
        r11 = p000.R$id.track;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0a31:
        r10 = p000.R$id.owner;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x02ea;
    L_0x0a39:
        r20 = 8;
        r11 = p000.R$id.owner;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0a48:
        r10 = p000.R$id.UNKNOWN;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0029;
    L_0x0a50:
        r11 = p000.R$id.UNKNOWN;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 2;
        goto L_0x003c;
    L_0x0a5e:
        r8 = -895660512; // 0xffffffffca9d4e20 float:-5154576.0 double:NaN;
        r0 = r49;
        if (r8 != r0) goto L_0x0cc7;
    L_0x0a65:
        r29 = data;
        r49 = value;
        r8 = -874278282; // 0xffffffffcbe39276 float:-2.9828332E7 double:NaN;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r12 = r29[r49];
        r12 = r12.toLowerCase();
        r12 = r12.trim();
        p000.client.address = r12;
        r8 = 1;
        return r8;
    L_0x0a89:
        r10 = p000.R$id.encoding;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x033c;
    L_0x0a91:
        r20 = 3;
        r11 = p000.R$id.encoding;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0aa0:
        r10 = p000.R$id.limit;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0ab7;
    L_0x0aa8:
        r20 = 6;
        r11 = p000.R$id.limit;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0ab7:
        r10 = p000.R$id.text;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0a31;
    L_0x0abf:
        r20 = 7;
        r11 = p000.R$id.text;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0ace:
        r10 = p000.R$id.color;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0bb6;
    L_0x0ad6:
        r20 = 11;
        r11 = p000.R$id.color;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0ae5:
        r10 = p000.R$id.image;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0764;
    L_0x0aed:
        r20 = 2;
        r11 = p000.R$id.image;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0afc:
        r10 = p000.R$id.header;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0931;
    L_0x0b04:
        r11 = p000.R$id.header;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 5;
        goto L_0x003c;
    L_0x0b12:
        r10 = p000.R$id.template;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0b29;
    L_0x0b1a:
        r20 = 4;
        r11 = p000.R$id.template;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0b29:
        r10 = p000.R$id.offset;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0152;
    L_0x0b31:
        r20 = 5;
        r11 = p000.R$id.offset;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0b40:
        r0 = r31;
        r0 = r0.size;
        r40 = r0;
        r41 = r40;
        r41 = (p000.TDoubleArrayList) r41;
        r31 = r41;
        r0 = r31;
        r0 = r0.value;
        r49 = r0;
        r8 = -201486000; // 0xfffffffff3fd9150 float:-4.0179394E31 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
    L_0x0b5a:
        r9[r7] = r49;
        r8 = 1;
        return r8;
    L_0x0b5e:
        r8 = 49381582; // 0x2f180ce float:3.5485698E-37 double:2.4397743E-316;
        r0 = r49;
        if (r0 != r8) goto L_0x0950;
    L_0x0b65:
        r9 = this$0;
        r49 = type;
        r8 = -518849498; // 0xffffffffe112fc26 float:-1.6946212E20 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        type = r49;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r7 = p000.client.pointer;
        r8 = -2138574460; // 0xffffffff8087f184 float:-1.2484431E-38 double:NaN;
        r7 = r8 * r7;
        r9[r49] = r7;
        r8 = 1;
        return r8;
    L_0x0b88:
        r10 = p000.R$id.style;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x040b;
    L_0x0b90:
        r20 = 7;
        r11 = p000.R$id.style;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0b9f:
        r10 = p000.R$id.rating;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0cee;
    L_0x0ba7:
        r20 = 11;
        r11 = p000.R$id.rating;
        r7 = r11.length();
        r12 = r12.substring(r7);
        goto L_0x0138;
    L_0x0bb6:
        r7 = p000.client.title;
        r8 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r7 = r7 * r8;
        if (r7 == 0) goto L_0x0cee;
    L_0x0bbe:
        r10 = p000.R$id.version;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x08ac;
    L_0x0bc6:
        r11 = p000.R$id.version;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r20 = 0;
        goto L_0x0138;
    L_0x0bd5:
        r10 = p000.R$id.properties;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0c01;
    L_0x0bdd:
        r11 = p000.R$id.properties;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 2;
        goto L_0x003c;
    L_0x0beb:
        r10 = p000.R$id.name;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x0afc;
    L_0x0bf3:
        r11 = p000.R$id.name;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 4;
        goto L_0x003c;
    L_0x0c01:
        r10 = p000.R$id.points;
        r51 = r11.startsWith(r10);
        if (r51 == 0) goto L_0x08f3;
    L_0x0c09:
        r11 = p000.R$id.points;
        r7 = r11.length();
        r12 = r12.substring(r7);
        r13 = 3;
        goto L_0x003c;
    L_0x0c17:
        r42 = p000.DrawingGroup.map;
        r0 = r42;
        r0 = r0.next;
        r40 = r0;
        r0 = r31;
        r0 = r0.size;
        r43 = r0;
        r0 = r40;
        r1 = r43;
        if (r0 != r1) goto L_0x0b40;
    L_0x0c2b:
        r49 = -1;
        goto L_0x0b5a;
    L_0x0c30:
        r8 = 1643555437; // 0x61f6aa6d float:5.6877244E20 double:8.120242785E-315;
        r0 = r35;
        r7 = r0.getKey(r8);
        goto L_0x099f;
    L_0x0c3c:
        r12 = "";
        goto L_0x0890;
    L_0x0c41:
        r8 = -860082102; // 0xffffffffccbc304a float:-9.866504E7 double:NaN;
        r0 = r49;
        if (r8 != r0) goto L_0x0c7c;
    L_0x0c48:
        r9 = this$0;
        r49 = type;
        r8 = -2029895604; // 0xffffffff8702404c float:-9.799008E-35 double:NaN;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        type = r49;
        r8 = 220501954; // 0xd2497c2 float:5.0719074E-31 double:1.089424403E-315;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r9[r49];
        r9 = this$0;
        r7 = type;
        r8 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r7 = r7 + r8;
        type = r7;
        r8 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = 8;
        r0 = r49;
        r49 = p000.Calendar.add(r0, r8);
        r9[r7] = r49;
        r8 = 1;
        return r8;
    L_0x0c7c:
        r8 = 914550343; // 0x3682ee47 float:3.902041E-6 double:4.51847906E-315;
        r0 = r49;
        if (r0 != r8) goto L_0x0316;
    L_0x0c83:
        r9 = this$0;
        r49 = type;
        r8 = 2006407231; // 0x7797583f float:6.139271E33 double:9.912968844E-315;
        r0 = r49;
        r0 = r0 - r8;
        r49 = r0;
        type = r49;
        r8 = -1474577715; // 0xffffffffa81bbacd float:-8.644734E-15 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r9[r49];
        r9 = this$0;
        r7 = type;
        r8 = -1998622542; // 0xffffffff88df70b2 float:-1.3447819E-33 double:NaN;
        r7 = r7 + r8;
        type = r7;
        r8 = -517597567; // 0xffffffffe1261681 float:-1.9148632E20 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r44 = p000.DrawingGroup.data;
        r0 = r49;
        r0 = (long) r0;
        r45 = r0;
        r0 = r44;
        r1 = r45;
        r47 = r0.get(r1);
        r48 = r47;
        r48 = (p000.TDoubleArrayList) r48;
        r31 = r48;
        if (r31 != 0) goto L_0x0c17;
    L_0x0cc2:
        r49 = -1;
        goto L_0x0b5a;
    L_0x0cc7:
        r8 = -728487362; // 0xffffffffd4942a3e float:-5.0909109E12 double:NaN;
        r0 = r49;
        if (r0 != r8) goto L_0x0cec;
    L_0x0cce:
        r29 = data;
        r49 = value;
        r8 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r0 = r49;
        r0 = r0 + r8;
        r49 = r0;
        value = r49;
        r8 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r0 = r49;
        r0 = r0 * r8;
        r49 = r0;
        r49 = r49 + -1;
        r12 = p000.client.address;
        r29[r49] = r12;
        r8 = 1;
        return r8;
    L_0x0cec:
        r8 = 2;
        return r8;
    L_0x0cee:
        r20 = 0;
        goto L_0x0138;
    L_0x0cf3:
        r13 = 0;
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: XMLParser.write(int, CharSequence, boolean):int");
    }

    static void write(ArrayList arrayList, int i) {
        int $i1;
        int $i3;
        CharSequence $r6;
        CharSequence $r7;
        Throwable $r16;
        Object[] $r1 = arrayList.size;
        if (Page.toString(182090275 * arrayList.header, (byte) -107)) {
            SparseFieldVector.value = (MediaType) $r1[0];
            ByteBufferList $r5 = ByteBufferList.data[SparseFieldVector.value.length * -1099459587];
            $i1 = arrayList.header * 182090275;
            $i3 = -2068206069 * $r5.type;
            $r6 = Resources.toString(TwofishEngine.af(1733135393 * $r5.this$0, $i1, 735380873), $i1, -1830896753);
            $r7 = $r6;
            if ($r6 == null) {
                $r6 = Resources.toString(((40000 + $i3) << 8) + $i1, $i1, -1879399765);
                $r7 = $r6;
                if ($r6 == null) {
                    $r7 = null;
                }
            }
        } else {
            $r7 = Attribute.toString(((Integer) $r1[0]).intValue(), -1430527005);
        }
        if ($r7 != null) {
            int $i4;
            int $i42;
            int $i5;
            String $r14;
            type = 0;
            value = 0;
            int[] $r9 = $r7.value;
            int[] $r10 = $r7.data;
            offset = 0;
            AssertionError.value = new int[(407879525 * $r7.pos)];
            $i1 = 0;
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
                    AssertionError.value[$i1] = $i5 == -2147483639 ? arrayList.channel * 361884663 : $i5;
                    $i1++;
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
                        $i1 = -1;
                    }
                } else {
                    $i42 = $i2;
                }
                $i3++;
                $i2 = $i42;
            }
            $i2 = 0;
            index = arrayList.branch * 698456767;
            $i1 = -1;
            $i3 = -1;
            while (true) {
                $i2++;
                if ($i2 > i) {
                    throw new RuntimeException();
                }
                $i3++;
                $i1 = $r9[$i3];
                if ($i1 >= 100) {
                    switch (Byte.read($i1, $r7, $r7.data[$i3] == 1, (byte) -27)) {
                        case 0:
                            break;
                        case 1:
                            continue;
                        case 2:
                            throw new IllegalStateException();
                        default:
                            continue;
                    }
                } else if ($i1 == 0) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = $r10[$i3];
                } else if ($i1 == 1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - 1194553915;
                    type = $i5;
                    $r11[($i5 * 537618701) - 1] = Event.this$0[$i42];
                } else if ($i1 == 2) {
                    $i42 = $r10[$i3];
                    $r11 = Event.this$0;
                    $r21 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r11[$i42] = $r21[$i5 * 537618701];
                    IOUtils.update($i42, -840634432);
                } else if (3 == $i1) {
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r7.length[$i3];
                } else if ($i1 == 6) {
                    $i3 = $r10[$i3] + $i3;
                } else if ($i1 == 7) {
                    type -= 1905859466;
                    if (this$0[(537618701 * type) + 1] != this$0[537618701 * type]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (8 == $i1) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] == this$0[(type * 537618701) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 9) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] < this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 10) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] > this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (21 == $i1) {
                    if (344694797 * offset != 0) {
                        $r19 = count;
                        $i3 = offset - -1432768827;
                        offset = $i3;
                        PathParser $r20 = $r19[$i3 * 344694797];
                        $r7 = $r20.name;
                        $i3 = $r20.count;
                        AssertionError.value = $r20.value;
                        Target.value = $r20.data;
                        $r10 = $r7.data;
                        $r9 = $r7.value;
                        $i3 *= -132320779;
                    } else {
                        return;
                    }
                } else if ($i1 == 25) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - 1194553915;
                    type = $i5;
                    $r11[($i5 * 537618701) - 1] = IOException.toString($i42, 998830794);
                } else if (27 == $i1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    Identifier.toString($i42, $r11[$i5 * 537618701], (short) 13871);
                } else if ($i1 == 31) {
                    type -= 1905859466;
                    if (this$0[537618701 * type] <= this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if (32 == $i1) {
                    type -= 1905859466;
                    if (this$0[type * 537618701] >= this$0[(537618701 * type) + 1]) {
                        $i3 = $r10[$i3] + $i3;
                    }
                } else if ($i1 == 33) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = AssertionError.value[$r10[$i3]];
                } else if (34 == $i1) {
                    $r11 = AssertionError.value;
                    $i42 = $r10[$i3];
                    $r21 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r11[$i42] = $r21[$i5 * 537618701];
                } else if ($i1 == 35) {
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = Target.value[$r10[$i3]];
                } else if ($i1 == 36) {
                    $r12 = Target.value;
                    $i42 = $r10[$i3];
                    String[] $r22 = data;
                    $i5 = value - -1246602361;
                    value = $i5;
                    $r12[$i42] = $r22[$i5 * -1267697097];
                } else if ($i1 == 37) {
                    $i42 = $r10[$i3];
                    value -= -1246602361 * $i42;
                    $r12 = data;
                    $i5 = -1267697097 * value;
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
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r14;
                } else if (38 == $i1) {
                    type -= -1194553915;
                } else if (39 == $i1) {
                    value -= -1246602361;
                } else if ($i1 == 40) {
                    $r6 = Attribute.toString($r10[$i3], -1967892685);
                    $r10 = new int[(407879525 * $r6.pos)];
                    String[] $r12 = $r6.head * -1469700137;
                    String[] strArr = $r12;
                    $r12 = new String[$r12];
                    for ($i42 = 0; $i42 < $r6.size * 950863471; $i42++) {
                        $i4 = (type * 537618701) - ($r6.size * 950863471);
                        $i5 = $i4;
                        $r10[$i42] = this$0[$i4 + $i42];
                    }
                    for ($i42 = 0; $i42 < 483841497 * $r6.name; $i42++) {
                        $i4 = (value * -1267697097) - (483841497 * $r6.name);
                        $i5 = $i4;
                        $r12[$i42] = data[$i4 + $i42];
                    }
                    type -= -769321365 * $r6.size;
                    value -= -1322194833 * $r6.name;
                    $i4 = new PathParser();
                    $i4.name = $r7;
                    $i4.count = -475434403 * $i3;
                    $i4.value = AssertionError.value;
                    $i4.data = Target.value;
                    $r19 = count;
                    $i3 = offset - 1432768827;
                    offset = $i3;
                    $r19[($i3 * 344694797) - 1] = $i4;
                    AssertionError.value = $r10;
                    Target.value = $r12;
                    $r10 = $r6.data;
                    $r9 = $r6.value;
                    $r7 = $r6;
                    $i3 = -1;
                } else if (42 == $i1) {
                    $r11 = this$0;
                    $i42 = type - 1194553915;
                    type = $i42;
                    $r11[($i42 * 537618701) - 1] = Connection.this$0.size($r10[$i3], 2132372176);
                } else if ($i1 == 43) {
                    $r23 = Connection.this$0;
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $r23.add($i42, $r11[$i5 * 537618701], -1494251381);
                } else if (44 == $i1) {
                    $i42 = $r10[$i3] >> 16;
                    $i5 = 65535 & $r10[$i3];
                    $r11 = this$0;
                    $i7 = type - -1194553915;
                    type = $i7;
                    $i7 = $r11[$i7 * 537618701];
                    if ($i7 < 0 || $i7 > 5000) {
                        throw new RuntimeException();
                    }
                    name[$i42] = $i7;
                    int i2 = -1;
                    if ($i5 == 105) {
                        i2 = 0;
                    }
                    for ($i5 = 0; $i5 < $i7; $i5++) {
                        size[$i42][$i5] = i2;
                    }
                } else if (45 == $i1) {
                    $i42 = $r10[$i3];
                    $r11 = this$0;
                    $i5 = type - -1194553915;
                    type = $i5;
                    $i5 = $r11[$i5 * 537618701];
                    if ($i5 < 0 || $i5 >= name[$i42]) {
                        throw new RuntimeException();
                    }
                    $r11 = this$0;
                    $i7 = type - 1194553915;
                    type = $i7;
                    $r11[($i7 * 537618701) - 1] = size[$i42][$i5];
                } else if ($i1 == 46) {
                    $i42 = $r10[$i3];
                    type -= 1905859466;
                    $i5 = this$0[537618701 * type];
                    if ($i5 < 0 || $i5 >= name[$i42]) {
                        throw new RuntimeException();
                    }
                    size[$i42][$i5] = this$0[(type * 537618701) + 1];
                } else if ($i1 == 47) {
                    $r14 = Connection.this$0.get($r10[$i3], -1803199202);
                    String $r25 = $r14;
                    if ($r14 == null) {
                        $r25 = R$id.this$0;
                    }
                    $r12 = data;
                    $i42 = value - 1246602361;
                    value = $i42;
                    $r12[($i42 * -1267697097) - 1] = $r25;
                } else if ($i1 == 48) {
                    $r23 = Connection.this$0;
                    $i42 = $r10[$i3];
                    $r12 = data;
                    $i5 = value - -1246602361;
                    value = $i5;
                    $r23.put($i42, $r12[$i5 * -1267697097], -1716558009);
                } else if (60 == $i1) {
                    Date $r27 = $r7.offset[$r10[$i3]];
                    $r11 = this$0;
                    $i42 = type - -1194553915;
                    type = $i42;
                    try {
                        Value $r29 = (Value) $r27.get((long) $r11[$i42 * 537618701]);
                        if ($r29 != null) {
                            $i3 = $r29.value + $i3;
                        }
                    } catch (Exception e2) {
                        $r16 = e2;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return;
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("").append($r7.size).append(" ");
        for (i = (344694797 * offset) - 1; i >= 0; i--) {
            StringBuilder $r18 = stringBuilder.append("");
            long $l6 = count[i].name;
            $r7 = $l6;
            $r18.append($l6.size).append(" ");
        }
        stringBuilder.append("").append($i1);
        JSONArray.get(stringBuilder.toString(), $r16, (short) -6750);
    }

    static int writeTo(int $i0, CharSequence charSequence, boolean z) {
        int $i1 = 0;
        int[] $r1;
        if (3903 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.target[$i0].get((byte) -92);
            return 1;
        } else if ($i0 == 3904) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.target[$i0].state * 1845400323;
            return 1;
        } else if ($i0 == 3905) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.target[$i0].value * -1928030811;
            return 1;
        } else if (3906 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.target[$i0].name * -672413105;
            return 1;
        } else if ($i0 == 3907) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.target[$i0].pos * -732345473;
            return 1;
        } else if ($i0 == 3908) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = this$0;
            $i1 = type - 1194553915;
            type = $i1;
            $r1[($i1 * 537618701) - 1] = client.target[$i0].data * -1822937453;
            return 1;
        } else if (3910 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if ($i0 == 0) {
                $i1 = 1;
            }
            $r1[$i2] = $i1;
            return 1;
        } else if (3911 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if ($i0 == 2) {
                $i1 = 1;
            }
            $r1[$i2] = $i1;
            return 1;
        } else if (3912 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if ($i0 == 5) {
                $i1 = 1;
            }
            $r1[$i2] = $i1;
            return 1;
        } else if (3913 == $i0) {
            $r1 = this$0;
            $i0 = type - -1194553915;
            type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = this$0;
            $i2 = type - 1194553915;
            type = $i2;
            $i2 = ($i2 * 537618701) - 1;
            if (1 == $i0) {
                $i1 = 1;
            }
            $r1[$i2] = $i1;
            return 1;
        } else {
            boolean $i12;
            if ($i0 == 3914) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i12 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.text, $i12, 487251212);
                    return 1;
                }
            } else if (3915 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i12 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.url, $i12, -884315599);
                    return 1;
                }
            } else if ($i0 == 3916) {
                type -= 1905859466;
                z = 1 == this$0[type * 537618701];
                if (this$0[(type * 537618701) + 1] == 1) {
                    $i12 = true;
                }
                if (ZStream.data != null) {
                    client.intent.id = $i12;
                    ZStream.data.add(client.intent, z, -1609321230);
                    return 1;
                }
            } else if ($i0 == 3917) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i12 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.type, $i12, -2143421275);
                    return 1;
                }
            } else if (3918 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i12 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.intent, $i12, -418407966);
                    return 1;
                }
            } else if ($i0 == 3919) {
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $i0 = ($i0 * 537618701) - 1;
                if (ZStream.data != null) {
                    $i1 = ZStream.data.data.size();
                }
                $r1[$i0] = $i1;
                return 1;
            } else if ($i0 == 3920) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r7.index * -215043303;
                return 1;
            } else if ($i0 == 3921) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * -1267697097) - 1] = $r7.getKey(-1462247273);
                return 1;
            } else if (3922 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * -1267697097) - 1] = $r7.getParent(1492690594);
                return 1;
            } else if (3923 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                long linkedList = (LinkedList.toString(509651154) - (DrawingGroup.logger * 5304096097959642155L)) - (((AstNode) ZStream.data.data.get($r1[$i0 * 537618701])).position * 8313538393492320215L);
                $i0 = (int) (linkedList / 3600000);
                long $l4 = (linkedList - ((long) (3600000 * $i0))) / 60000;
                long j = $l4;
                $i1 = (int) $l4;
                $l4 = ((linkedList - ((long) (3600000 * $i0))) - ((long) (60000 * $i1))) / 1000;
                linkedList = $l4;
                $i2 = (int) $l4;
                String $r9 = $i0 + ":" + ($i1 / 10) + ($i1 % 10) + ":" + ($i2 / 10) + ($i2 % 10);
                $r10 = data;
                $i0 = value - 1246602361;
                value = $i0;
                $r10[($i0 * -1267697097) - 1] = $r9;
                return 1;
            } else if (3924 == $i0) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r7.this$0.name * -672413105;
            } else if ($i0 == 3925) {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r7.this$0.value * -1928030811;
                return 1;
            } else if (3926 != $i0) {
                return 2;
            } else {
                $r1 = this$0;
                $i0 = type - -1194553915;
                type = $i0;
                $r7 = (AstNode) ZStream.data.data.get($r1[$i0 * 537618701]);
                $r1 = this$0;
                $i0 = type - 1194553915;
                type = $i0;
                $r1[($i0 * 537618701) - 1] = $r7.this$0.state * 1845400323;
                return 1;
            }
            return 1;
        }
    }
}
