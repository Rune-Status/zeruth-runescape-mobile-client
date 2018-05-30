package p000;

import java.net.URL;

/* compiled from: dq */
public class Msg {
    public static final Msg data = new Msg("SMALL", 0, 0, 4);
    public static final Msg id = new Msg("MEDIUM", 2, 1, 2);
    public static int size;
    public static final Msg type = new Msg("LARGE", 1, 2, 0);
    final String from;
    final int key;
    final int name;
    final int subject;

    Msg(String str, int $i0, int i, int i2) {
        try {
            this.from = str;
            this.subject = 1480974585 * $i0;
            this.name = -1029874131 * i;
            this.key = 957844047 * i2;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dq.<init>(" + ')');
        }
    }

    static boolean get(int i) {
        if (Chart.data == null) {
            Chart.data = Namespace.context.getInstance(new URL(AtomicInteger.name), -615329840);
        } else if (Chart.data.read(1135559204)) {
            Logger $r5 = new Logger(Chart.data.get(-1307040200));
            $r5.size(1157740290);
            ByteBuffer.size = $r5.get(-1686233487) * 1274669679;
            int $i0 = ByteBuffer.size * 443593871;
            i = $i0;
            Short.value = new ByteBuffer[$i0];
            i = 0;
            while (i < ByteBuffer.size * 443593871) {
                ByteBuffer[] $r6 = Short.value;
                $i0 = new ByteBuffer();
                $r6[i] = $i0;
                $i0.length = $r5.get(1020692194) * -71831023;
                $i0.index = $r5.size(-437493362) * -2031175081;
                $i0.buffer = $r5.toString(1508042908);
                $i0.name = $r5.toString(1536262798);
                try {
                    $i0.log = $r5.get((byte) 0) * 67655425;
                    $i0.value = $r5.getValue(1289432744) * -1042109309;
                    try {
                        $i0.next = -985792981 * i;
                        i++;
                    } catch (Throwable $r12) {
                        throw StringBuilder.append($r12, "dq.af(" + ')');
                    }
                } catch (Exception $r11) {
                    $r11.printStackTrace();
                    Chart.data = null;
                }
            }
            System.append(Short.value, 0, Short.value.length - 1, ByteBuffer.data, ByteBuffer.count, 1838607637);
            Chart.data = null;
            return true;
        }
        return false;
    }

    static Msg[] m76get(int i) {
        try {
            Msg[] $r0 = new Msg[3];
            $r0[0] = data;
            $r0[1] = type;
            $r0[2] = id;
            return $r0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dq.af(" + ')');
        }
    }

    static System serialize(System $r0, int i) {
        System $r1 = null;
        i = SearchActivity.get(JSONArray.get($r0, -1290016285), 1773673955);
        if (i != 0) {
            int $i1 = 0;
            System $r2 = $r0;
            while ($i1 < i) {
                try {
                    $r2 = ArrayList.get($r2.type * -1008623461, 541822623);
                    if ($r2 == null) {
                        break;
                    }
                    $i1++;
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "dq.fa(" + ')');
                }
            }
            $r1 = $r2;
        }
        return $r1 == null ? $r0.writer : $r1;
    }

    static Msg[] set() {
        return new Msg[]{data, type, id};
    }

    static int toString(int i, CharSequence charSequence, boolean z, int i2) {
        int[] $r1;
        if (5000 == i) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            try {
                $r1[(i * 537618701) - 1] = client.top * 321761329;
                return 1;
            } catch (Throwable $r24) {
                throw StringBuilder.append($r24, "dq.ao(" + ')');
            }
        } else if (5001 == i) {
            XMLParser.type -= 711305551;
            client.top = XMLParser.this$0[XMLParser.type * 537618701] * -1551652655;
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            Info[] $r5 = Exception.toString(1428275654);
            for (Info $r6 : $r5) {
                $i3 = $r6.data * 677600269;
                int i3 = $i3;
                if ($i3 == i) {
                    break;
                }
            }
            Info $r62 = null;
            ByteBufferList.position = $r62;
            if (ByteBufferList.position == null) {
                ByteBufferList.position = Info.file;
            }
            client.pointer = -26121995 * XMLParser.this$0[(XMLParser.type * 537618701) + 2];
            $r10 = Logger.add(R$string.current, client.this$0.key, (byte) 77);
            $r10.this$0.append(321761329 * client.top, (byte) 31);
            $r10.this$0.append(677600269 * ByteBufferList.position.data, (byte) 31);
            $r10.this$0.append(-1224080547 * client.pointer, (byte) 31);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if (i == 5002) {
            $r23 = XMLParser.data;
            i = XMLParser.value - -1246602361;
            XMLParser.value = i;
            $r14 = $r23[i * -1267697097];
            XMLParser.type -= 1905859466;
            i = XMLParser.this$0[XMLParser.type * 537618701];
            i2 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r10 = Logger.add(R$string.line, client.this$0.key, (byte) 66);
            $r10.this$0.append(Record.toString($r14, 1444515839) + 2, (byte) 31);
            $r10.this$0.add($r14, (byte) -108);
            $r10.this$0.append(i - 1, (byte) 31);
            $r10.this$0.append(i2, (byte) 31);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if (5003 == i) {
            XMLParser.type -= 1905859466;
            $r4 = ((Record) DrawingGroup.content.get(Integer.valueOf(XMLParser.this$0[XMLParser.type * 537618701]))).getData(XMLParser.this$0[(XMLParser.type * 537618701) + 1], 1935222174);
            if ($r4 != null) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = 1687932353 * $r4.value;
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = $r4.max * -1939883689;
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = $r4.id != null ? $r4.id : "";
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = $r4.key != null ? $r4.key : "";
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = $r4.length != null ? $r4.length : "";
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                i = (i * 537618701) - 1;
                r23 = $r4.add(-1116170756) ? 1 : $r4.get(559139842) ? 2 : 0;
                $r1[i] = r23;
            } else {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = -1;
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = 0;
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = "";
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = "";
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = "";
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = 0;
            }
            return 1;
        } else if (5004 == i) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            $r4 = AESCipher.getData($r1[i * 537618701], -1396621184);
            if ($r4 != null) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = $r4.index * 977542055;
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = -1939883689 * $r4.max;
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = $r4.id != null ? $r4.id : "";
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = $r4.key != null ? $r4.key : "";
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = $r4.length != null ? $r4.length : "";
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                i = (i * 537618701) - 1;
                r23 = $r4.add(-1116170756) ? 1 : $r4.get(891634236) ? 2 : 0;
                $r1[i] = r23;
            } else {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = -1;
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = 0;
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = "";
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = "";
                $r23 = XMLParser.data;
                i = XMLParser.value - 1246602361;
                XMLParser.value = i;
                $r23[(i * -1267697097) - 1] = "";
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = 0;
            }
            return 1;
        } else if (5005 == i) {
            if (ByteBufferList.position == null) {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = -1;
            } else {
                $r1 = XMLParser.this$0;
                i = XMLParser.type - 1194553915;
                XMLParser.type = i;
                $r1[(i * 537618701) - 1] = ByteBufferList.position.data * 677600269;
            }
            return 1;
        } else if (5008 == i) {
            byte $b6;
            $r23 = XMLParser.data;
            i = XMLParser.value - -1246602361;
            XMLParser.value = i;
            $r14 = $r23[i * -1267697097];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            i = $r1[i * 537618701];
            $r13 = $r14.toLowerCase();
            if ($r13.startsWith(R$id.author)) {
                $r14 = $r14.substring(R$id.author.length());
                $b6 = (byte) 0;
            } else if ($r13.startsWith(R$id.date)) {
                $r14 = $r14.substring(R$id.date.length());
                $b6 = (byte) 1;
            } else if ($r13.startsWith(R$id.content)) {
                $r14 = $r14.substring(R$id.content.length());
                $b6 = (byte) 2;
            } else if ($r13.startsWith(R$id.encoding)) {
                $r14 = $r14.substring(R$id.encoding.length());
                $b6 = (byte) 3;
            } else if ($r13.startsWith(R$id.root)) {
                $r14 = $r14.substring(R$id.root.length());
                $b6 = (byte) 4;
            } else if ($r13.startsWith(R$id.link)) {
                $r14 = $r14.substring(R$id.link.length());
                $b6 = (byte) 5;
            } else if ($r13.startsWith(R$id.limit)) {
                $r14 = $r14.substring(R$id.limit.length());
                $b6 = (byte) 6;
            } else if ($r13.startsWith(R$id.text)) {
                $r14 = $r14.substring(R$id.text.length());
                $b6 = (byte) 7;
            } else if ($r13.startsWith(R$id.owner)) {
                $r14 = $r14.substring(R$id.owner.length());
                $b6 = (byte) 8;
            } else if ($r13.startsWith(R$id.command)) {
                $r14 = $r14.substring(R$id.command.length());
                $b6 = (byte) 9;
            } else if ($r13.startsWith(R$id.track)) {
                $r14 = $r14.substring(R$id.track.length());
                $b6 = (byte) 10;
            } else if ($r13.startsWith(R$id.color)) {
                $r14 = $r14.substring(R$id.color.length());
                $b6 = (byte) 11;
            } else {
                if (client.title * -1387037251 != 0) {
                    if ($r13.startsWith(R$id.version)) {
                        $r14 = $r14.substring(R$id.version.length());
                        $b6 = (byte) 0;
                    } else if ($r13.startsWith(R$id.description)) {
                        $r14 = $r14.substring(R$id.description.length());
                        $b6 = (byte) 1;
                    } else if ($r13.startsWith(R$id.image)) {
                        $r14 = $r14.substring(R$id.image.length());
                        $b6 = (byte) 2;
                    } else if ($r13.startsWith(R$id.title)) {
                        $r14 = $r14.substring(R$id.title.length());
                        $b6 = (byte) 3;
                    } else if ($r13.startsWith(R$id.template)) {
                        $r14 = $r14.substring(R$id.template.length());
                        $b6 = (byte) 4;
                    } else if ($r13.startsWith(R$id.offset)) {
                        $r14 = $r14.substring(R$id.offset.length());
                        $b6 = (byte) 5;
                    } else if ($r13.startsWith(R$id.label)) {
                        $r14 = $r14.substring(R$id.label.length());
                        $b6 = (byte) 6;
                    } else if ($r13.startsWith(R$id.style)) {
                        $r14 = $r14.substring(R$id.style.length());
                        $b6 = (byte) 7;
                    } else if ($r13.startsWith(R$id.filename)) {
                        $r14 = $r14.substring(R$id.filename.length());
                        $b6 = (byte) 8;
                    } else if ($r13.startsWith(R$id.artist)) {
                        $r14 = $r14.substring(R$id.artist.length());
                        $b6 = (byte) 9;
                    } else if ($r13.startsWith(R$id.genre)) {
                        $r14 = $r14.substring(R$id.genre.length());
                        $b6 = (byte) 10;
                    } else if ($r13.startsWith(R$id.rating)) {
                        $r14 = $r14.substring(R$id.rating.length());
                        $b6 = (byte) 11;
                    }
                }
                $b6 = (byte) 0;
            }
            $r13 = $r14.toLowerCase();
            r23 = 0;
            if ($r13.startsWith(R$id.proxy)) {
                $r14 = $r14.substring(R$id.proxy.length());
                r23 = 1;
            } else if ($r13.startsWith(R$id.UNKNOWN)) {
                r23 = 2;
                $r14 = $r14.substring(R$id.UNKNOWN.length());
            } else if ($r13.startsWith(R$id.to)) {
                r23 = 3;
                $r14 = $r14.substring(R$id.to.length());
            } else if ($r13.startsWith(R$id.name)) {
                r23 = 4;
                $r14 = $r14.substring(R$id.name.length());
            } else if ($r13.startsWith(R$id.header)) {
                r23 = 5;
                $r14 = $r14.substring(R$id.header.length());
            } else if (-1387037251 * client.title != 0) {
                if ($r13.startsWith(R$id.property)) {
                    $r14 = $r14.substring(R$id.property.length());
                    r23 = 1;
                } else if ($r13.startsWith(R$id.properties)) {
                    r23 = 2;
                    $r14 = $r14.substring(R$id.properties.length());
                } else if ($r13.startsWith(R$id.points)) {
                    r23 = 3;
                    $r14 = $r14.substring(R$id.points.length());
                } else if ($r13.startsWith(R$id.item)) {
                    r23 = 4;
                    $r14 = $r14.substring(R$id.item.length());
                } else if ($r13.startsWith(R$id.file)) {
                    r23 = 5;
                    $r14 = $r14.substring(R$id.file.length());
                }
            }
            $r10 = Logger.add(R$string.result, client.this$0.key, (byte) 46);
            $r10.this$0.append(0, (byte) 31);
            $i3 = $r10.this$0;
            $r11 = $i3;
            i2 = $i3.data * 1978945739;
            $r10.this$0.append(i, (byte) 31);
            $r10.this$0.append((int) $b6, (byte) 31);
            $r10.this$0.append(r23, (byte) 31);
            $i3 = $r10.this$0;
            $r11 = $i3;
            i = $i3.data;
            $r15 = TimeUnit.decode($r14, 650144592);
            $r11.log($r15.length, 1779617961);
            $r11.data = (MimeType.data.encode($r15, 0, $r15.length, $r11.size, 1978945739 * $r11.data, 1363166700) * 2065011939) + $r11.data;
            $r11 = $r10.this$0;
            $i3 = $r10.this$0;
            $r18 = $i3;
            $r11.getName((1978945739 * $i3.data) - i2, 684381889);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if (i == 5009) {
            XMLParser.value -= 1801762574;
            $r14 = XMLParser.data[XMLParser.value * -1267697097];
            $r13 = XMLParser.data[(XMLParser.value * -1267697097) + 1];
            $r10 = Logger.add(R$string.address, client.this$0.key, (byte) -42);
            $r10.this$0.get(0, -1752508204);
            $i3 = $r10.this$0;
            $r11 = $i3;
            i = 1978945739 * $i3.data;
            $r10.this$0.add($r14, (byte) -15);
            $i3 = $r10.this$0;
            $r11 = $i3;
            i2 = $i3.data;
            $r15 = TimeUnit.decode($r13, 1874768173);
            $r11.log($r15.length, 1779617961);
            $r11.data = (MimeType.data.encode($r15, 0, $r15.length, $r11.size, $r11.data * 1978945739, 1363166700) * 2065011939) + $r11.data;
            $r11 = $r10.this$0;
            $i3 = $r10.this$0;
            $r18 = $i3;
            $r11.write((1978945739 * $i3.data) - i, (byte) 32);
            client.this$0.add((Config) $r10, (short) 255);
            return 1;
        } else if (i == 5015) {
            if (File.this$0 != null) {
                if (File.this$0.type != null) {
                    $r14 = File.this$0.type.toString(168057418);
                    $r23 = XMLParser.data;
                    i = XMLParser.value - 1246602361;
                    XMLParser.value = i;
                    $r23[(i * -1267697097) - 1] = $r14;
                    return 1;
                }
            }
            $r14 = "";
            $r23 = XMLParser.data;
            i = XMLParser.value - 1246602361;
            XMLParser.value = i;
            $r23[(i * -1267697097) - 1] = $r14;
            return 1;
        } else if (i == 5016) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = -1224080547 * client.pointer;
            return 1;
        } else if (5017 == i) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            i = $r1[i * 537618701];
            $r1 = XMLParser.this$0;
            i2 = XMLParser.type - 1194553915;
            XMLParser.type = i2;
            Record $r22 = (Record) DrawingGroup.content.get(Integer.valueOf(i));
            $r1[(i2 * 537618701) - 1] = $r22 == null ? 0 : $r22.getKey(178751624);
            return 1;
        } else if (5018 == i) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            i = $r1[i * 537618701];
            $r1 = XMLParser.this$0;
            i2 = XMLParser.type - 1194553915;
            XMLParser.type = i2;
            $r1[(i2 * 537618701) - 1] = Calendar.add(i, (byte) 42);
            return 1;
        } else if (i == 5019) {
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            i = $r1[i * 537618701];
            $r1 = XMLParser.this$0;
            i2 = XMLParser.type - 1194553915;
            XMLParser.type = i2;
            i2 = (i2 * 537618701) - 1;
            $r4 = (TDoubleArrayList) DrawingGroup.data.get((long) i);
            if ($r4 == null) {
                i = -1;
            } else {
                i = DrawingGroup.map.next == $r4.size ? -1 : ((TDoubleArrayList) $r4.size).value * 1687932353;
            }
            $r1[i2] = i;
            return 1;
        } else if (i == 5020) {
            $r23 = XMLParser.data;
            i = XMLParser.value - -1246602361;
            XMLParser.value = i;
            AssertionError.init($r23[i * -1267697097], 2092333717);
            return 1;
        } else if (5021 == i) {
            $r23 = XMLParser.data;
            i = XMLParser.value - -1246602361;
            XMLParser.value = i;
            client.address = $r23[i * -1267697097].toLowerCase().trim();
            return 1;
        } else if (i != 5022) {
            return 2;
        } else {
            $r23 = XMLParser.data;
            i = XMLParser.value - 1246602361;
            XMLParser.value = i;
            $r23[(i * -1267697097) - 1] = client.address;
            return 1;
        }
    }

    boolean set(float f) {
        return f >= ((float) (-1789440849 * this.key));
    }

    boolean write(float f, int i) {
        try {
            return f >= ((float) (-1789440849 * this.key));
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dq.ad(" + ')');
        }
    }
}
