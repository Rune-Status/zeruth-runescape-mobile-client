package p000;

/* compiled from: cx */
public class FileHeader {
    public static final FileHeader DIFF_CC = new FileHeader("1", "1");
    public static final FileHeader DIFF_COMBINED = new FileHeader("14", "14");
    public static final FileHeader DIFF_GIT = new FileHeader("4", "4");
    public static final FileHeader INDEX = new FileHeader("2", "2");
    public static final FileHeader NEW_NAME = new FileHeader("8", "8");
    public static final FileHeader OLD_NAME = new FileHeader("15", "15");
    static final int SALT_SIZE = 8;
    public static final FileHeader backgroundColor = new FileHeader("13", "13");
    public static final FileHeader buf = new FileHeader("10", "10");
    public static final FileHeader captions = new FileHeader("9", "9");
    public static final FileHeader color = new FileHeader("16", "16");
    public static final FileHeader context = new FileHeader("3", "3");
    public static final FileHeader end = new FileHeader("5", "5");
    public static final FileHeader fileName = new FileHeader("6", "6");
    public static final FileHeader name = new FileHeader("7", "7");
    public static final FileHeader path = new FileHeader("11", "11");
    public static final FileHeader start = new FileHeader("12", "12");
    public final String content;

    FileHeader(String str, String str2) {
        try {
            this.content = str2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "cx.<init>(" + ')');
        }
    }

    public static void add(Class classR, Class classR2, byte b) {
        TIntArrayList.index = classR;
        TIntArrayList.length = classR2;
        try {
            TIntArrayList.buffer = TIntArrayList.index.add(3, 1779611897) * 533815797;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cx.af(" + ')');
        }
    }

    public static boolean add(Class classR, Class classR2, int i) {
        InputStream.value = classR2;
        if (!classR.replace(1988219879)) {
            return false;
        }
        ByteBufferList.count = classR.add(35, -799574640) * 104489825;
        ByteBufferList.data = new ByteBufferList[(ByteBufferList.count * -1577615199)];
        for (i = 0; i < ByteBufferList.count * -1577615199; i++) {
            byte[] $r3 = classR.get(35, i, -1458722599);
            if ($r3 != null) {
                ByteBufferList.data[i] = new ByteBufferList(i);
                ByteBufferList.data[i].add(new Logger($r3), 2025448001);
                try {
                    ByteBufferList.data[i].add(60949248);
                } catch (RuntimeException $r6) {
                    throw StringBuilder.append($r6, "cx.af(" + ')');
                }
            }
        }
        return true;
    }

    static int init(int i, CharSequence charSequence, boolean $z0, int i2) {
        int[] $r1;
        boolean $z1 = false;
        if (i >= 2000) {
            i -= 1000;
            $r1 = XMLParser.this$0;
            i2 = XMLParser.type - -1194553915;
            XMLParser.type = i2;
            try {
                i2 = $r1[i2 * 537618701];
                System $r2 = ArrayList.get(i2, -22472462);
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "cx.ag(" + ')');
            }
        }
        $r2 = $z0 ? Constants.data : XMLParser.state;
        i2 = -1;
        int $i0;
        if (1100 == i) {
            XMLParser.type -= 1905859466;
            $r2.f292i = 1859612037 * XMLParser.this$0[XMLParser.type * 537618701];
            if (-2091547827 * $r2.f292i > (1151268625 * $r2.cursor) - ($r2.this$0 * 256177861)) {
                $i0 = ($r2.cursor * 588224725) - ($r2.this$0 * 827921753);
                i = $i0;
                $r2.f292i = $i0;
            }
            if (-2091547827 * $r2.f292i < 0) {
                $r2.f292i = 0;
            }
            $i0 = XMLParser.this$0[(XMLParser.type * 537618701) + 1] * 274170433;
            i = $i0;
            $r2.size = $i0;
            if (654937537 * $r2.size > ($r2.buf * -1243953689) - (57307023 * $r2.$assertionsDisabled)) {
                $i0 = (-158560857 * $r2.buf) - ($r2.$assertionsDisabled * -1002049201);
                i = $i0;
                $r2.size = $i0;
            }
            if (654937537 * $r2.size < 0) {
                $r2.size = 0;
            }
            client.add($r2, (byte) 2);
            return 1;
        } else if (i == 1101) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            $i0 = $r1[i * 537618701] * -1456194309;
            i = $i0;
            $r2.index = $i0;
            client.add($r2, (byte) 21);
            return 1;
        } else if (1102 == i) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            if ($r1[i * 537618701] == 1) {
                $z1 = true;
            }
            $r2.level = $z1;
            client.add($r2, (byte) 3);
            return 1;
        } else if (i == 1103) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            $i0 = $r1[i * 537618701] * -1014705653;
            i = $i0;
            $r2.result = $i0;
            client.add($r2, (byte) 8);
            return 1;
        } else if (1104 == i) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            $i0 = $r1[i * 537618701] * 1820900823;
            i = $i0;
            $r2.files = $i0;
            client.add($r2, (byte) 66);
            return 1;
        } else if (i == 1105) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            $i0 = $r1[i * 537618701] * -1237459785;
            i = $i0;
            $r2.path = $i0;
            client.add($r2, (byte) 124);
            return 1;
        } else if (i == 1106) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            $i0 = $r1[i * 537618701] * 84768945;
            i = $i0;
            $r2.code = $i0;
            client.add($r2, (byte) 57);
            return 1;
        } else if (1107 == i) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            if ($r1[i * 537618701] == 1) {
                $z1 = true;
            }
            $r2.first = $z1;
            client.add($r2, (byte) 43);
            return 1;
        } else if (i == 1108) {
            $r2.status = -713743521;
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            $i0 = $r1[i * 537618701] * -174447253;
            i = $i0;
            $r2.text = $i0;
            client.add($r2, (byte) 60);
            return 1;
        } else if (1109 == i) {
            XMLParser.type -= 1422611102;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701] * 1819609725;
            i = $i0;
            $r2.startTime = $i0;
            $r2.progress = 432797755 * XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r2.data = 770408497 * XMLParser.this$0[(XMLParser.type * 537618701) + 2];
            $r2.count = -41487175 * XMLParser.this$0[(XMLParser.type * 537618701) + 3];
            $r2.instance = 842525423 * XMLParser.this$0[(XMLParser.type * 537618701) + 4];
            $i0 = XMLParser.this$0[(XMLParser.type * 537618701) + 5] * 62563745;
            i = $i0;
            $r2.state = $i0;
            client.add($r2, (byte) 29);
            return 1;
        } else {
            if (1110 == i) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                i = $r1[i * 537618701];
                $i0 = $r2.parent * -1332946961;
                i2 = $i0;
                if ($i0 != i) {
                    $i0 = i * 2102736655;
                    i = $i0;
                    $r2.parent = $i0;
                    $r2.buffer = 0;
                    $r2.cnt = 0;
                    client.add($r2, (byte) 67);
                    return 1;
                }
            } else if (1111 == i) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.duration = $z1;
                client.add($r2, (byte) 63);
                return 1;
            } else if (i == 1112) {
                String[] $r10 = XMLParser.data;
                i = XMLParser.value - -1246602361;
                XMLParser.value = i;
                String $r8 = $r10[i * -1267697097];
                String $r11 = $r2.file;
                if (!$r8.equals($r11)) {
                    $r2.file = $r8;
                    client.add($r2, (byte) 24);
                    return 1;
                }
            } else if (i == 1113) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                $i0 = $r1[i * 537618701] * -343733379;
                i = $i0;
                $r2.uri = $i0;
                client.add($r2, (byte) 94);
                return 1;
            } else if (1114 == i) {
                XMLParser.type -= 711305551;
                $r2.f286c = 1287571003 * XMLParser.this$0[XMLParser.type * 537618701];
                $r2.f287d = 1411930085 * XMLParser.this$0[(XMLParser.type * 537618701) + 1];
                $i0 = XMLParser.this$0[(XMLParser.type * 537618701) + 2] * 1969493363;
                i = $i0;
                $r2.f289f = $i0;
                client.add($r2, (byte) 74);
                return 1;
            } else if (1115 == i) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.header = $z1;
                client.add($r2, (byte) 113);
                return 1;
            } else if (i == 1116) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                $i0 = $r1[i * 537618701] * 1914751949;
                i = $i0;
                $r2.mData = $i0;
                client.add($r2, (byte) 24);
                return 1;
            } else if (i == 1117) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                $i0 = $r1[i * 537618701] * 728184399;
                i = $i0;
                $r2.list = $i0;
                client.add($r2, (byte) 32);
                return 1;
            } else if (i == 1118) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.resource = $z1;
                client.add($r2, (byte) 122);
                return 1;
            } else if (i == 1119) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.user = $z1;
                client.add($r2, (byte) 86);
                return 1;
            } else if (1120 == i) {
                XMLParser.type -= 1905859466;
                $r2.cursor = 808245745 * XMLParser.this$0[XMLParser.type * 537618701];
                $i0 = XMLParser.this$0[(XMLParser.type * 537618701) + 1] * 1611562455;
                i = $i0;
                $r2.buf = $i0;
                client.add($r2, (byte) 108);
                if (i2 != -1) {
                    if ($r2.name * -128421835 == 0) {
                        Model.write(Float.size[i2 >> 16], $r2, false, (byte) -34);
                        return 1;
                    }
                }
            } else if (i == 1121) {
                R$id.init(1172750087 * $r2.value, 2102445939 * $r2.next, (byte) 0);
                client.buffer = $r2;
                client.add($r2, (byte) 102);
                return 1;
            } else if (i == 1122) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                $i0 = $r1[i * 537618701] * 245383255;
                i = $i0;
                $r2.hash = $i0;
                client.add($r2, (byte) 53);
                return 1;
            } else if (1123 == i) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                $i0 = $r1[i * 537618701] * 1982744395;
                i = $i0;
                $r2.current = $i0;
                client.add($r2, (byte) 61);
            } else if (1124 == i) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                $i0 = $r1[i * 537618701] * -236421259;
                i = $i0;
                $r2.source = $i0;
                client.add($r2, (byte) 81);
                return 1;
            } else if (i == 1125) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                i = $r1[i * 537618701];
                Reader[] $r3 = new Reader[5];
                $r3[0] = Reader.in;
                $r3[1] = Reader.log;
                $r3[2] = Reader.lock;
                $r3[3] = Reader.queue;
                $r3[4] = Reader.mHandler;
                Reader $r4 = (Reader) Calendar.add($r3, i, (byte) 41);
                if ($r4 != null) {
                    $r2.err = $r4;
                    client.add($r2, (byte) 37);
                    return 1;
                }
            } else if (1126 == i) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                if ($r1[i * 537618701] == 1) {
                    $z1 = true;
                }
                $r2.date = $z1;
                return 1;
            } else if (i != 1127) {
                return 2;
            } else {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                $r2.error = $r1[i * 537618701] == 1;
                return 1;
            }
            return 1;
        }
    }

    static int parse(int $i1, CharSequence charSequence, boolean z, byte b) {
        System $r2;
        int[] $r1;
        int $i2;
        if ($i1 >= 2000) {
            $i1 -= 1000;
            $r1 = XMLParser.this$0;
            $i2 = XMLParser.type - -1194553915;
            XMLParser.type = $i2;
            try {
                $r2 = ArrayList.get($r1[$i2 * 537618701], 1755190379);
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "cx.ay(" + ')');
            }
        }
        $r2 = z ? Constants.data : XMLParser.state;
        client.add($r2, (byte) 114);
        if (1200 == $i1 || $i1 == 1205 || 1212 == $i1) {
            XMLParser.type -= 1905859466;
            $i2 = XMLParser.this$0[XMLParser.type * 537618701];
            int $i3 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r2.left = -1404216569 * $i2;
            $r2.offset = $i3 * 895045473;
            Message $r3 = Set.get($i2, 2062362941);
            $r2.data = $r3.parent * -1010358009;
            $r2.count = $r3.level * -1123242253;
            $r2.instance = -1813573947 * $r3.f217x;
            $r2.startTime = $r3.index * -1211168499;
            $r2.progress = 1928138403 * $r3.key;
            $r2.state = $r3.data * -136593549;
            if ($i1 == 1205) {
                $r2.body = 0;
            } else {
                if (($r3.name * 1099170281 == 1) | ($i1 == 1212)) {
                    $r2.body = -144948821;
                } else {
                    $r2.body = -289897642;
                }
            }
            if (1535179975 * $r2.filter > 0) {
                $r2.state = (($r2.state * -1336947680) / ($r2.filter * 1535179975)) * 62563745;
            } else if ($r2.f300x * 1506390075 > 0) {
                $r2.state = (($r2.state * -1336947680) / (1506390075 * $r2.f300x)) * 62563745;
            }
            return 1;
        } else if (1201 == $i1) {
            $r2.status = -1427487042;
            $r1 = XMLParser.this$0;
            $i1 = XMLParser.type - -1194553915;
            XMLParser.type = $i1;
            $r2.text = $r1[$i1 * 537618701] * -174447253;
            return 1;
        } else if (1202 != $i1) {
            return 2;
        } else {
            $r2.status = -2141230563;
            $r2.text = File.this$0.this$0.toString((byte) 63) * -174447253;
            return 1;
        }
    }
}
