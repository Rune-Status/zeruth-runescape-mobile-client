package p000;

/* compiled from: bp */
public final class Tag {
    int bytes;
    int count;
    int data;
    int head;
    int id;
    int index;
    int key;
    int length;
    int log;
    int name;
    int next;
    int offset;
    int parent;
    int pos;
    int size;
    int state;
    int type;
    int value;

    Tag() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bp.<init>(" + ')');
        }
    }

    static int add(int i, int i2, int i3) {
        i3 = 0;
        Region $r2 = (Region) Region.value.get((long) i);
        if ($r2 == null) {
            return 0;
        }
        if (-1 == i2) {
            return 0;
        }
        i = 0;
        while (i < $r2.data.length) {
            try {
                if ($r2.size[i] == i2) {
                    i3 += $r2.data[i];
                }
                i++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "bp.ad(" + ')');
            }
        }
        return i3;
    }

    static final int equals(int $i0, int $i1, int i, int i2, int i3) {
        return ((i * $i0) + (i2 * $i1)) >> 16;
    }

    static final void run(Handler handler, int i) {
        for (i = 0; i < Database.data * 482038467; i++) {
            int $i2;
            int $i6;
            int $i7;
            int $i10;
            int $i1 = Database.context[i];
            Collection $r4 = client.size[$i1];
            int $i3 = handler.get((byte) 0);
            if (($i3 & 1) != 0) {
                $i3 += handler.get((byte) 0) << 8;
            }
            byte $b5 = (byte) -1;
            if (($i3 & 512) != 0) {
                $r4.state = handler.getName(-1005835619) * -2015474731;
                int $i4 = handler.size(1411925854);
                $i2 = ($i4 >> 16) * -2073088321;
                int i2 = $i2;
                $r4.active = $i2;
                $r4.out = (($i4 & 65535) + (1581849891 * client.type)) * 243104753;
                $r4.f62a = 0;
                $r4.f64c = 0;
                $i2 = client.type * 1581849891;
                i2 = $i2;
                if ($r4.out * 645928209 > $i2) {
                    $r4.f62a = 367216679;
                }
                if ($r4.state * 269129085 == 65535) {
                    $r4.state = 2015474731;
                }
            }
            if (($i3 & 256) != 0) {
                $b5 = handler.read((byte) -70);
            }
            if (($i3 & Constants.f93X) != 0) {
                $r4.key = handler.getInstance(-867819452) * 1968525927;
                if ($r4.key * -609375913 == 65535) {
                    $r4.key = -1968525927;
                }
            }
            if (($i3 & 64) != 0) {
                $i4 = handler.get((byte) 0);
                byte[] $r5 = new byte[$i4];
                Logger logger = new Logger($r5);
                handler.read($r5, 0, $i4, -1562068619);
                Database.id[$i1] = logger;
                $r4.add(logger, -2134558627);
            }
            if (($i3 & 32) != 0) {
                int $i8;
                $i4 = handler.decode(1576393144);
                if ($i4 > 0) {
                    for (i2 = 0; i2 < $i4; i2++) {
                        $i6 = -1;
                        $i7 = -1;
                        $i8 = -1;
                        int $i9 = handler.add((byte) 47);
                        $i10 = $i9;
                        if (32767 == $i9) {
                            $i10 = handler.add((byte) 100);
                            $i7 = handler.add((byte) 67);
                            $i6 = handler.add((byte) 61);
                            $i8 = handler.add((byte) 23);
                        } else if ($i9 != 32766) {
                            $i7 = handler.add((byte) 12);
                        } else {
                            $i10 = -1;
                        }
                        $r4.init($i10, $i7, $i6, $i8, 1581849891 * client.type, handler.add((byte) 36), -1638817307);
                    }
                }
                $i4 = handler.get((byte) 0);
                if ($i4 > 0) {
                    for (i2 = 0; i2 < $i4; i2++) {
                        $i10 = handler.add((byte) 24);
                        $i6 = handler.add((byte) 59);
                        if (32767 != $i6) {
                            $i7 = handler.add((byte) 51);
                            $i8 = handler.decode(736990482);
                            $r4.get($i10, 1581849891 * client.type, $i6, $i7, $i8, $i6 > 0 ? handler.read(-1575896008) : $i8, (byte) 0);
                        } else {
                            $r4.get($i10, 1723956826);
                        }
                    }
                }
            }
            if (($i3 & 4) != 0) {
                $r4.next = handler.get(-1062003388) * 464408867;
                if ($r4.parent * 761444243 == 0) {
                    $r4.name = $r4.next * 981885035;
                    $r4.next = -464408867;
                }
            }
            if (($i3 & ScrollingTextView.MP3_MAX_INPUT_SIZE) != 0) {
                Database.parent[$i1] = handler.read((byte) -29);
            }
            if (($i3 & Constants.ACC_STRICT) != 0) {
                $r4.items = handler.next(1247983979) * 1177469221;
                $r4.offset = handler.read((byte) 79) * -153025727;
                $r4.color = handler.next(1247983979) * 533146735;
                $r4.location = handler.next(1247983979) * -1865694973;
                $i2 = client.type * 1581849891;
                i2 = $i2;
                $r4.body = (handler.get(1017960951) + $i2) * 1386585013;
                $i2 = client.type * 1581849891;
                i2 = $i2;
                $r4.title = (handler.getInstance(-924561298) + $i2) * -511796865;
                $r4.uri = handler.getInstance(-1478756997) * 814763455;
                if ($r4.id) {
                    $i2 = $r4.f164x * 1226261927;
                    i2 = $i2;
                    $r4.items += $i2;
                    $i2 = $r4.f165y * -1172262661;
                    i2 = $i2;
                    $r4.offset += $i2;
                    $i2 = $r4.f164x * 615654389;
                    i2 = $i2;
                    $r4.color += $i2;
                    $i2 = $r4.f165y * 112692913;
                    i2 = $i2;
                    $r4.location += $i2;
                    $r4.parent = 0;
                } else {
                    $r4.items += 1177469221 * $r4.this$0[0];
                    $i2 = $r4.length[0] * -153025727;
                    i2 = $i2;
                    $r4.offset += $i2;
                    $i2 = $r4.this$0[0] * 533146735;
                    i2 = $i2;
                    $r4.color += $i2;
                    $i2 = $r4.length[0] * -1865694973;
                    i2 = $i2;
                    $r4.location += $i2;
                    $r4.parent = -521273701;
                }
                $r4.width = 0;
            }
            if (($i3 & 16) != 0) {
                $i10 = handler.getInstance(-820369669);
                CircularBuffer[] $r11 = new CircularBuffer[6];
                $r11[0] = CircularBuffer.count;
                $r11[1] = CircularBuffer.cache;
                $r11[2] = CircularBuffer.context;
                $r11[3] = CircularBuffer.buffer;
                $r11[4] = CircularBuffer.f44s;
                $r11[5] = CircularBuffer.this$0;
                CircularBuffer $r12 = (CircularBuffer) Calendar.add($r11, handler.read(-1345818157), (byte) 107);
                boolean $z0 = handler.read(257556920) == 1;
                $i4 = handler.read(-855829634);
                i2 = 1978945739 * handler.data;
                try {
                    if ($r4.type != null) {
                        if ($r4.this$0 != null) {
                            Object obj = null;
                            if ($r12.address) {
                                if (Primitive.data.add($r4.type, (byte) -126)) {
                                    obj = 1;
                                }
                            }
                            if (obj == null && client.timer * 783729645 == 0) {
                                if (!$r4.data) {
                                    String $r9;
                                    boolean $z1;
                                    byte $b12;
                                    Database.logger.data = 0;
                                    handler.init(Database.logger.size, 0, $i4, (byte) -72);
                                    Database.logger.data = 0;
                                    Logger $r1 = Database.logger;
                                    try {
                                        $i7 = $r1.add((byte) 8);
                                        $i6 = $i7;
                                        if ($i7 > 32767) {
                                            $i6 = 32767;
                                        }
                                        $r5 = new byte[$i6];
                                        $r1.data = (MimeType.data.write($r1.size, $r1.data * 1978945739, $r5, 0, $i6, 1810093772) * 2065011939) + $r1.data;
                                        $r9 = Class.toString($r5, 0, $i6, -1880242583);
                                    } catch (Exception e) {
                                        $r9 = "Cabbage";
                                    }
                                    $r9 = List.add(Downloader.parse($r9, 678093770));
                                    $r4.f63b = $r9.trim();
                                    $i2 = ($i10 >> 8) * 169672723;
                                    $i6 = $i2;
                                    $r4.f67g = $i2;
                                    $i2 = ($i10 & 255) * -2058240637;
                                    $i10 = $i2;
                                    $r4.f71m = $i2;
                                    $r4.buffer = -309974418;
                                    $r4.f68h = $z0;
                                    if (File.this$0 != $r4) {
                                        if ($r12.address && client.address != "") {
                                            if ($r9.toLowerCase().indexOf(client.address) == -1) {
                                                $z1 = true;
                                                $r4.f78w = $z1;
                                                $b12 = $r12.data ? $z0 ? (byte) 91 : (byte) 1 : $z0 ? (byte) 90 : (byte) 2;
                                                if (1675619249 * $r12.size == -1) {
                                                    Message.add($b12, CompassView.get(1675619249 * $r12.size, (byte) -4) + $r4.type.toString(-1105652119), $r9, 999846153);
                                                } else {
                                                    Message.add($b12, $r4.type.toString(-48184690), $r9, 933702572);
                                                }
                                            }
                                        }
                                    }
                                    $z1 = false;
                                    $r4.f78w = $z1;
                                    if ($r12.data) {
                                        if ($z0) {
                                        }
                                    }
                                    if (1675619249 * $r12.size == -1) {
                                        Message.add($b12, $r4.type.toString(-48184690), $r9, 933702572);
                                    } else {
                                        Message.add($b12, CompassView.get(1675619249 * $r12.size, (byte) -4) + $r4.type.toString(-1105652119), $r9, 999846153);
                                    }
                                }
                            }
                        }
                    }
                    handler.data = 2065011939 * ($i4 + i2);
                } catch (Throwable $r7) {
                    throw StringBuilder.append($r7, "bp.as(" + ')');
                }
            }
            if (($i3 & 2) != 0) {
                $r4.f63b = handler.toString(902754203);
                if ($r4.f63b.charAt(0) == '~') {
                    $r4.f63b = $r4.f63b.substring(1);
                    Message.add(2, $r4.type.toString(1687894680), $r4.f63b, 1296003480);
                } else if (File.this$0 == $r4) {
                    Message.add(2, $r4.type.toString(1349766460), $r4.f63b, 1050589564);
                }
                $r4.f68h = false;
                $r4.f67g = 0;
                $r4.f71m = 0;
                $r4.buffer = -309974418;
            }
            if (($i3 & 8) != 0) {
                i2 = handler.getInstance(-1852429445);
                $i4 = i2;
                if (65535 == i2) {
                    $i4 = -1;
                }
                Status.write($r4, $i4, handler.write(-921002307), (byte) 41);
            }
            if (($i3 & 1024) != 0) {
                for ($i3 = 0; $i3 < 3; $i3++) {
                    $r4.next[$i3] = handler.toString(665944217);
                }
            }
            if ($r4.id) {
                if ($b5 == Byte.MAX_VALUE) {
                    $r4.add($r4.f164x * 589656027, $r4.f165y * -1060785861, -2063937617);
                } else {
                    if ($b5 == (byte) -1) {
                        $b5 = Database.parent[$i1];
                    }
                    $r4.get($r4.f164x * 589656027, $r4.f165y * -1060785861, $b5, -834829682);
                }
            }
        }
    }

    static int toString(int i, int i2, int i3) {
        long $l3 = (long) ((i << 16) + i2);
        if (PriorityQueue.buffer != null) {
            try {
                if ($l3 == PriorityQueue.buffer.size) {
                    return ((-1652867455 * Connection.buffer.data) / (Connection.buffer.size.length - PriorityQueue.buffer.state)) + 1;
                }
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "bp.an(" + ')');
            }
        }
        return 0;
    }

    public static Long toString(Class classR, String str, String str2, byte b) {
        try {
            int $i1 = classR.get(str, -471188350);
            return AssertionError.get(classR, $i1, classR.get($i1, str2, 138188633), (byte) 0);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "bp.ar(" + ')');
        }
    }
}
