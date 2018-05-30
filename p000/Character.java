package p000;

import java.io.IOException;
import java.net.Socket;

/* compiled from: hy */
public class Character extends Object {
    public static final int SUNDAY = 24;
    static int f38b;
    boolean data;
    int length;
    int size;

    Character() {
        try {
            this.data = false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hy.<init>(" + ')');
        }
    }

    public static Double add(int i) {
        Double $r0 = new Double();
        for (i = 0; i < DatabaseUtil.buffer.length; i++) {
            if (DatabaseUtil.buffer[i] != 0) {
                int[] $r1 = DatabaseUtil.buffer;
                try {
                    $r1[i] = $r1[i] | -16777216;
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "hy.at(" + ')');
                }
            }
        }
        $r0.next = -102972929 * Level.count;
        $r0.value = -820473409 * App.index;
        $r0.count = ZStream.index[0];
        $r0.index = Level.index[0];
        $r0.length = TCharArrayList.index[0];
        $r0.data = TFloatArrayList.buffer[0];
        $r0.size = DatabaseUtil.buffer;
        $r0.buffer = Level.data[0];
        Page.add(805967750);
        return $r0;
    }

    public static Headers add(Socket socket, int i, int i2, byte b) throws IOException {
        try {
            return new TCharArrayList(socket, i, i2);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hy.bw(" + ')');
        }
    }

    static int decode(Handler handler, int i) {
        try {
            i = handler.add(2, (byte) -77);
            return i == 0 ? 0 : 1 == i ? handler.add(5, (byte) -70) : 2 == i ? handler.add(8, (byte) -74) : handler.add(11, Byte.MIN_VALUE);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hy.aa(" + ')');
        }
    }

    static int parse(int $i0, CharSequence charSequence, boolean $z0, int i) {
        boolean $i1 = false;
        String[] $r1;
        if ($i0 == 3100) {
            $r1 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            try {
                Message.add(0, "", $r1[$i0 * -1267697097], 1289127989);
                return 1;
            } catch (RuntimeException $r8) {
                throw StringBuilder.append($r8, "hy.at(" + ')');
            }
        } else if (3101 == $i0) {
            XMLParser.type -= 1905859466;
            Status.write(File.this$0, XMLParser.this$0[XMLParser.type * 537618701], XMLParser.this$0[(XMLParser.type * 537618701) + 1], (byte) 7);
            return 1;
        } else if (3103 == $i0) {
            Database.write(-1265034995);
            return 1;
        } else if (3104 == $i0) {
            $r1 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            CharSequence $r2 = $r1[$i0 * -1267697097];
            if (Resources.add($r2, 1034746886)) {
                i = Node.decode($r2, 10, true, (byte) 3);
            }
            $r6 = Logger.add(R$string.width, client.this$0.key, (byte) -20);
            $r6.this$0.append(i, (short) 128);
            client.this$0.add($r6, (short) 255);
            return 1;
        } else if ($i0 == 3105) {
            $r1 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            $r2 = $r1[$i0 * -1267697097];
            $r6 = Logger.add(R$string.body, client.this$0.key, (byte) 50);
            $r6.this$0.append($r2.length() + 1, (byte) 31);
            $r6.this$0.add($r2, (byte) -30);
            client.this$0.add($r6, (short) 255);
            return 1;
        } else if (3106 == $i0) {
            $r1 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            $r2 = $r1[$i0 * -1267697097];
            $r6 = Logger.add(R$string.head, client.this$0.key, (byte) -20);
            $r6.this$0.append($r2.length() + 1, (byte) 31);
            $r6.this$0.add($r2, (byte) -95);
            client.this$0.add($r6, (short) 255);
            return 1;
        } else if (3107 == $i0) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r11[$i0 * 537618701];
            $r1 = XMLParser.data;
            i = XMLParser.value - -1246602361;
            XMLParser.value = i;
            Scalar.add($i0, $r1[i * -1267697097], (byte) 100);
            return 1;
        } else if (3108 == $i0) {
            XMLParser.type -= 711305551;
            ParserHelper.set(ArrayList.get(XMLParser.this$0[(XMLParser.type * 537618701) + 2], 1773719681), XMLParser.this$0[XMLParser.type * 537618701], XMLParser.this$0[(XMLParser.type * 537618701) + 1], -1966430811);
            return 1;
        } else if ($i0 == 3109) {
            XMLParser.type -= 1905859466;
            ParserHelper.set($z0 ? Constants.data : XMLParser.state, XMLParser.this$0[XMLParser.type * 537618701], XMLParser.this$0[(XMLParser.type * 537618701) + 1], -1069985512);
            return 1;
        } else if ($i0 == 3110) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            ByteBufferList.f25a = $i1;
            return 1;
        } else if (3111 == $i0) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Main.this$0.f276i) {
                i = 1;
            }
            $r11[$i0] = i;
            return 1;
        } else if ($i0 == 3112) {
            SearchActivity $r14 = Main.this$0;
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r14.f276i = $i1;
            KeyPair.toString(-659164844);
            return 1;
        } else if ($i0 == 3113) {
            $r1 = XMLParser.data;
            $i0 = XMLParser.value - -1246602361;
            XMLParser.value = $i0;
            $r2 = $r1[$i0 * -1267697097];
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            IntegerPolynomial.update($r2, $i1, false, (byte) 14);
            return 1;
        } else if (3115 == $i0) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r11[$i0 * 537618701];
            $r6 = Logger.add(R$string.reader, client.this$0.key, (byte) 33);
            $r6.this$0.get($i0, -1752508204);
            client.this$0.add($r6, (short) 255);
            return 1;
        } else if (3116 == $i0) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r11[$i0 * 537618701];
            XMLParser.value -= 1801762574;
            $r2 = XMLParser.data[XMLParser.value * -1267697097];
            String $r15 = XMLParser.data[(XMLParser.value * -1267697097) + 1];
            if ($r2.length() > 500) {
                return 1;
            }
            if ($r15.length() > 500) {
                return 1;
            }
            $r6 = Logger.add(R$string.cache, client.this$0.key, (byte) 61);
            $r6.this$0.get((Record.toString($r2, -812122429) + 1) + Record.toString($r15, -212422388), -1752508204);
            $r6.this$0.add($r15, (byte) 46);
            $r6.this$0.append($i0, (byte) 31);
            $r6.this$0.add($r2, (byte) 38);
            client.this$0.add($r6, (short) 255);
            return 1;
        } else if ($i0 == 3117) {
            $r16 = Settings.this$0;
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r16.clear($i1, 1910113390);
            return 1;
        } else if (3118 == $i0) {
            $r16 = Settings.this$0;
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r16.length = $i1;
            return 1;
        } else if ($i0 == 3119) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            client.date = $i1;
            return 1;
        } else if ($i0 == 3120) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                client.message = 213563641 * ((client.message * 1424263497) | 1);
                return 1;
            }
            client.message = 213563641 * ((1424263497 * client.message) & -2);
            return 1;
        } else if ($i0 == 3121) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                client.message = 213563641 * ((client.message * 1424263497) | 2);
                return 1;
            }
            client.message = ((1424263497 * client.message) & -3) * 213563641;
            return 1;
        } else if ($i0 == 3122) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                client.message = 213563641 * ((client.message * 1424263497) | 4);
                return 1;
            }
            client.message = ((client.message * 1424263497) & -5) * 213563641;
            return 1;
        } else if ($i0 == 3123) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                client.message = 213563641 * ((1424263497 * client.message) | 8);
                return 1;
            }
            client.message = ((client.message * 1424263497) & -9) * 213563641;
            return 1;
        } else if (3124 == $i0) {
            client.message = 0;
            return 1;
        } else if ($i0 == 3125) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            client.password = $i1;
            return 1;
        } else if (3126 == $i0) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            client.factory = $i1;
            return 1;
        } else if (3127 == $i0) {
            $r16 = Settings.this$0;
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            $r16.initialize($i1, (byte) 6);
            return 1;
        } else if (3128 == $i0) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $i0 = ($i0 * 537618701) - 1;
            if (Settings.this$0.put(1693428806)) {
                i = 1;
            }
            $r11[$i0] = i;
            return 1;
        } else if (3129 == $i0) {
            XMLParser.type -= 1905859466;
            client.engine = -704603963 * XMLParser.this$0[XMLParser.type * 537618701];
            client.configuration = XMLParser.this$0[(XMLParser.type * 537618701) + 1] * -1890400699;
            return 1;
        } else if (3130 == $i0) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            if (1 == XMLParser.this$0[(XMLParser.type * 537618701) + 1]) {
                $i1 = true;
            }
            Settings.this$0.create($i0, $i1, 1829547545);
            return 1;
        } else if ($i0 == 3131) {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            if ($r11[$i0 * 537618701] == 1) {
                $i1 = true;
            }
            Settings.this$0.put($i1, -107858092);
            return 1;
        } else if (3132 != $i0) {
            return 2;
        } else {
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r11[($i0 * 537618701) - 1] = Vec2.this$0 * -1946576867;
            $r11 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r11[($i0 * 537618701) - 1] = Model.this$0 * 1616559063;
            return 1;
        }
    }
}
