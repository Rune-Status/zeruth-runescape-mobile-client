package p000;

/* compiled from: no */
public class Config extends Object {
    public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
    public static final int OTHER = 20;
    static int count = 0;
    static Config[] text = new Config[300];
    public int data;
    public int f92n;
    public Handler this$0;
    public R$string value;

    Config() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "no.<init>(" + ')');
        }
    }

    public static Config clone() {
        Config $r0 = Envelope.get(1016477333);
        $r0.value = null;
        $r0.f92n = 0;
        $r0.this$0 = new Handler(286654906);
        return $r0;
    }

    public static Config doInBackground() {
        Config $r0 = Envelope.get(1809046165);
        $r0.value = null;
        $r0.f92n = 0;
        $r0.this$0 = new Handler(5000);
        return $r0;
    }

    public static Config get() {
        if (count * -1061586891 == 0) {
            return new Config();
        }
        Config[] $r1 = text;
        int $i0 = count - -358082019;
        count = $i0;
        return $r1[$i0 * -1061586891];
    }

    public static Config init() {
        if (count * -1061586891 == 0) {
            return new Config();
        }
        Config[] $r1 = text;
        int $i0 = count - -358082019;
        count = $i0;
        return $r1[$i0 * -1061586891];
    }

    public static Config init(R$string r$string, TwofishEngine twofishEngine) {
        Config $r2 = Envelope.get(95767765);
        $r2.value = r$string;
        $r2.f92n = -1641769127 * r$string.input;
        if ($r2.f92n * 716777675 == -1) {
            $r2.this$0 = new Handler(MSG_ROUTE_VOLUME_CHANGED);
        } else if (-2 == $r2.f92n * 716777675) {
            $r2.this$0 = new Handler(Geometry.UNKNOWN_INT);
        } else if ($r2.f92n * 716777675 <= 18) {
            $r2.this$0 = new Handler(20);
        } else if ($r2.f92n * 716777675 <= 98) {
            $r2.this$0 = new Handler(100);
        } else {
            $r2.this$0 = new Handler(MSG_ROUTE_VOLUME_CHANGED);
        }
        $r2.this$0.m25a(twofishEngine, (short) -9414);
        $r2.this$0.put(-1641535671 * $r2.value.index, 679133613);
        $r2.data = 0;
        return $r2;
    }

    public static Config initialize(R$string r$string, TwofishEngine twofishEngine) {
        Config $r2 = Envelope.get(1400097742);
        $r2.value = r$string;
        $r2.f92n = 2019680206 * r$string.input;
        if ($r2.f92n * 843640588 == -1) {
            $r2.this$0 = new Handler(MSG_ROUTE_VOLUME_CHANGED);
        } else if (-2 == $r2.f92n * 716777675) {
            $r2.this$0 = new Handler(-1189561029);
        } else if ($r2.f92n * 1520444644 <= 18) {
            $r2.this$0 = new Handler(20);
        } else if ($r2.f92n * 716777675 <= 98) {
            $r2.this$0 = new Handler(1038972715);
        } else {
            $r2.this$0 = new Handler(1197789681);
        }
        $r2.this$0.m25a(twofishEngine, (short) -25843);
        $r2.this$0.put(-1547536551 * $r2.value.index, 679133613);
        $r2.data = 0;
        return $r2;
    }

    public static Config onCreate(R$string r$string, TwofishEngine twofishEngine) {
        Config $r2 = Envelope.get(1036252413);
        $r2.value = r$string;
        $r2.f92n = -1641769127 * r$string.input;
        if ($r2.f92n * 716777675 == -1) {
            $r2.this$0 = new Handler(MSG_ROUTE_VOLUME_CHANGED);
        } else if (-2 == $r2.f92n * 716777675) {
            $r2.this$0 = new Handler(Geometry.UNKNOWN_INT);
        } else if ($r2.f92n * 716777675 <= 18) {
            $r2.this$0 = new Handler(20);
        } else if ($r2.f92n * 716777675 <= 98) {
            $r2.this$0 = new Handler(100);
        } else {
            $r2.this$0 = new Handler(MSG_ROUTE_VOLUME_CHANGED);
        }
        $r2.this$0.m25a(twofishEngine, (short) 2642);
        $r2.this$0.put(-1641535671 * $r2.value.index, 679133613);
        $r2.data = 0;
        return $r2;
    }

    public static Config onResume() {
        if (count * -1061586891 == 0) {
            return new Config();
        }
        Config[] $r1 = text;
        int $i0 = count - -1195671262;
        count = $i0;
        return $r1[$i0 * -338343994];
    }

    static int parse(int $i0, CharSequence charSequence, boolean z, int i) {
        z = false;
        if (6600 == $i0) {
            try {
                Feed.getInstance(708929131).get(Msg.size * -1674539149, (Build$VERSION.type * 1407993063) + ((File.this$0.size * 516759209) >> 7), (Level.type * 1289967967) + ((File.this$0.value * 2328865) >> 7), true, 171221193);
                return 1;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "no.au(" + ')');
            }
        } else if (6601 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            String $r6 = "";
            $r11 = Feed.getInstance(-976602536).get($r3[$i0 * 537618701], 1726271524);
            if ($r11 != null) {
                $r6 = $r11.create(1845251321);
            }
            $r10 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r10[($i0 * -1267697097) - 1] = $r6;
            return 1;
        } else if ($i0 == 6602) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            Feed.getInstance(335651278).equals($r3[$i0 * 537618701], -1933376641);
            return 1;
        } else if ($i0 == 6603) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-414372601).init(-2137670055);
            return 1;
        } else if ($i0 == 6604) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            Feed.getInstance(-1256529079).read($r3[$i0 * 537618701], (byte) 16);
            return 1;
        } else if ($i0 == 6605) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Feed.getInstance(-1097831760).getProperty(-865828447)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if (6606 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r13 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-1291017129).load(1452060195 * $r13.value, $r13.data * 1719114399, -693299454);
            return 1;
        } else if (6607 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r13 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(490944026).read(1452060195 * $r13.value, $r13.data * 1719114399, (byte) 1);
            return 1;
        } else if ($i0 == 6608) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r13 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(579723083).init(1302348633 * $r13.type, $r13.value * 1452060195, $r13.data * 1719114399, 2063956963);
            return 1;
        } else if (6609 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r13 = new Method($r3[$i0 * 537618701]);
            Feed.getInstance(-1807016532).write(1302348633 * $r13.type, 1452060195 * $r13.value, $r13.data * 1719114399, (byte) 22);
            return 1;
        } else if (6610 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(401811286).read(-1489576847);
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(187072721).size(414296057);
            return 1;
        } else if (6611 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r11 = Feed.getInstance(-873927480).get($r3[$i0 * 537618701], 1299069430);
            if ($r11 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r11.read(-1932505483).toString(16711935);
            return 1;
        } else if ($i0 == 6612) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r11 = Feed.getInstance(812720276).get($r3[$i0 * 537618701], -1229368596);
            if ($r11 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r11.contains(2014424486) - $r11.add(-2113924132)) + 1) * 64;
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r11.add((byte) -103) - $r11.append(765234283)) + 1) * 64;
            return 1;
        } else if ($i0 == 6613) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r11 = Feed.getInstance(-976451990).get($r3[$i0 * 537618701], -1565948425);
            if ($r11 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r11.add(-2113924132) * 64;
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r11.append(-1659719630) * 64;
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r11.contains(-40221645) * 64) + 64) - 1;
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = (($r11.add((byte) -61) * 64) + 64) - 1;
            return 1;
        } else if ($i0 == 6614) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r11 = Feed.getInstance(-649372233).get($r3[$i0 * 537618701], 769319131);
            if ($r11 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r11.toString((byte) -52);
            return 1;
        } else if (6615 == $i0) {
            $r13 = Feed.getInstance(92285547).next(33704627);
            if ($r13 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r13.value * 1452060195;
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r13.data * 1719114399;
            return 1;
        } else if (6616 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1912595142).encode(-772798030);
            return 1;
        } else if ($i0 == 6617) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r13 = new Method($r3[$i0 * 537618701]);
            $r11 = Feed.getInstance(-1547065286).load(-2107994808);
            if ($r11 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = $r11.get(1302348633 * $r13.type, $r13.value * 1452060195, $r13.data * 1719114399, (byte) 2);
            if ($r3 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            int[] $r15 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r15[($i0 * 537618701) - 1] = $r3[0];
            $r15 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r15[($i0 * 537618701) - 1] = $r3[1];
            return 1;
        } else if ($i0 == 6618) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r13 = new Method($r3[$i0 * 537618701]);
            $r11 = Feed.getInstance(-17404569).load(-6668969);
            if ($r11 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r13 = $r11.add($r13.value * 1452060195, $r13.data * 1719114399, (byte) 93);
            if ($r13 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r13.toString(16711935);
            return 1;
        } else if ($i0 == 6619) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            $r13 = new Method(XMLParser.this$0[(XMLParser.type * 537618701) + 1]);
            $r11 = Feed.getInstance(-1342717531).get($i0, -2136579141);
            Feed.getInstance(-363340516).get($r11, new Method(File.this$0.context * -277606385, (1407993063 * Build$VERSION.type) + ((File.this$0.size * 516759209) >> 7), ((File.this$0.value * 2328865) >> 7) + (Level.type * 1289967967)), $r13, false, (byte) -98);
            return 1;
        } else if (6620 == $i0) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            $r13 = new Method(XMLParser.this$0[(XMLParser.type * 537618701) + 1]);
            $r11 = Feed.getInstance(-713380329).get($i0, 175256457);
            Feed.getInstance(-2146396553).get($r11, new Method(-277606385 * File.this$0.context, (1407993063 * Build$VERSION.type) + ((File.this$0.size * 516759209) >> 7), ((File.this$0.value * 2328865) >> 7) + (Level.type * 1289967967)), $r13, true, (byte) -127);
            return 1;
        } else if (6621 == $i0) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            $r13 = new Method(XMLParser.this$0[(XMLParser.type * 537618701) + 1]);
            $r11 = Feed.getInstance(-1006379170).get($i0, 1686029316);
            if ($r11 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = 0;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if ($r11.get($r13.type * 1302348633, 1452060195 * $r13.value, $r13.data * 1719114399, 1503612875)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if ($i0 == 6622) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1330171021).toString(-2077271061);
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = Feed.getInstance(-1637227366).parse(-1295775924);
            return 1;
        } else if (6623 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r13 = new Method($r3[$i0 * 537618701]);
            $r11 = Feed.getInstance(-724154224).get($r13.type * 1302348633, 1452060195 * $r13.value, $r13.data * 1719114399, 1304217362);
            if ($r11 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r11.toString(1740318190);
            return 1;
        } else if ($i0 == 6624) {
            $r2 = Feed.getInstance(-1655112197);
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r2.load($r3[$i0 * 537618701], 1830938089);
            return 1;
        } else if (6625 == $i0) {
            Feed.getInstance(-640163567).read((short) 32449);
            return 1;
        } else if ($i0 == 6626) {
            $r2 = Feed.getInstance(-319226697);
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r2.open($r3[$i0 * 537618701], -333289366);
            return 1;
        } else if (6627 == $i0) {
            Feed.getInstance(-1724302697).add((byte) 90);
            return 1;
        } else if ($i0 == 6628) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r3[$i0 * 537618701] == 1) {
                z = true;
            }
            Feed.getInstance(-1709262632).read(z, -1837148009);
            return 1;
        } else if (6629 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            Feed.getInstance(-625261986).add($r3[$i0 * 537618701], (byte) 37);
            return 1;
        } else if ($i0 == 6630) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            Feed.getInstance(-771155168).read($r3[$i0 * 537618701], -1772085722);
            return 1;
        } else if ($i0 == 6631) {
            Feed.getInstance(-60119873).read((byte) 22);
            return 1;
        } else if ($i0 == 6632) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r3[$i0 * 537618701] == 1) {
                z = true;
            }
            Feed.getInstance(-1318692522).load(z, 1244081313);
            return 1;
        } else if ($i0 == 6633) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            if (1 == XMLParser.this$0[(XMLParser.type * 537618701) + 1]) {
                z = true;
            }
            Feed.getInstance(-453243929).get($i0, z, -1826875779);
            return 1;
        } else if ($i0 == 6634) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            if (1 == XMLParser.this$0[(XMLParser.type * 537618701) + 1]) {
                z = true;
            }
            Feed.getInstance(588635121).read($i0, z, (short) 4095);
            return 1;
        } else if ($i0 == 6635) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Feed.getInstance(-1176897245).contains(-1294923696)) {
                z = true;
            }
            $r3[$i0] = z;
            return 1;
        } else if (6636 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r3[$i0 * 537618701];
            $r3 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            i = (i * 537618701) - 1;
            if (Feed.getInstance(-916156411).remove($i0, 1303649641)) {
                z = true;
            }
            $r3[i] = z;
            return 1;
        } else if (6637 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r3[$i0 * 537618701];
            $r3 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            i = (i * 537618701) - 1;
            if (Feed.getInstance(-638316351).contains($i0, -1749069155)) {
                z = true;
            }
            $r3[i] = z;
            return 1;
        } else if ($i0 == 6638) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            $r13 = Feed.getInstance(-1161583442).get($i0, new Method(XMLParser.this$0[(XMLParser.type * 537618701) + 1]), (byte) 100);
            if ($r13 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r13.toString(16711935);
            return 1;
        } else if ($i0 == 6639) {
            $r16 = Feed.getInstance(-402478096).create(-684791202);
            if ($r16 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r16.this$0 * -459008153;
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r16.key.toString(16711935);
            return 1;
        } else if ($i0 == 6640) {
            $r16 = Feed.getInstance(372752230).get(-67488227);
            if ($r16 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = -459008153 * $r16.this$0;
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r16.key.toString(16711935);
            return 1;
        } else if ($i0 == 6693) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r9 = ByteBufferList.data[$r3[$i0 * 537618701]];
            if ($r9.value == null) {
                $r10 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r10[($i0 * -1267697097) - 1] = "";
                return 1;
            }
            $r10 = XMLParser.data;
            $i0 = XMLParser.value - 1246602361;
            XMLParser.value = $i0;
            $r10[($i0 * -1267697097) - 1] = $r9.value;
            return 1;
        } else if (6694 == $i0) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r9 = ByteBufferList.data[$r3[$i0 * 537618701]];
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r9.text * 253714037;
            return 1;
        } else if ($i0 == 6695) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r9 = ByteBufferList.data[$r3[$i0 * 537618701]];
            if ($r9 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r9.type * -2068206069;
            return 1;
        } else if ($i0 == 6696) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $r9 = ByteBufferList.data[$r3[$i0 * 537618701]];
            if ($r9 == null) {
                $r3 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r3[($i0 * 537618701) - 1] = -1;
                return 1;
            }
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = $r9.pos * 1755658873;
            return 1;
        } else if ($i0 == 6697) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.length * -1099459587;
            return 1;
        } else if ($i0 == 6698) {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.type.toString(16711935);
            return 1;
        } else if (6699 != $i0) {
            return 2;
        } else {
            $r3 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r3[($i0 * 537618701) - 1] = SparseFieldVector.value.file.toString(16711935);
            return 1;
        }
    }

    public static Config remove() {
        Config $r0 = Envelope.get(760213904);
        $r0.value = null;
        $r0.f92n = 0;
        $r0.this$0 = new Handler(5000);
        return $r0;
    }

    public static Config reset() {
        Config $r0 = Envelope.get(1769154338);
        $r0.value = null;
        $r0.f92n = 0;
        $r0.this$0 = new Handler(5000);
        return $r0;
    }

    public static Config update() {
        if (count * 1410601379 == 0) {
            return new Config();
        }
        Config[] $r1 = text;
        int $i0 = count - 2068979672;
        count = $i0;
        return $r1[$i0 * -1061586891];
    }

    public void init(int i) {
        try {
            if (count * -1061586891 < text.length) {
                Config[] $r1 = text;
                i = count - 358082019;
                count = i;
                $r1[(i * -1061586891) - 1] = this;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "no.aa(" + ')');
        }
    }

    public void send() {
        if (count * -1061586891 < text.length) {
            Config[] $r1 = text;
            int $i0 = count - 358082019;
            count = $i0;
            $r1[($i0 * -1061586891) - 1] = this;
        }
    }
}
