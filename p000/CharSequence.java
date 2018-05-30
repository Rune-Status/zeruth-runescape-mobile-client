package p000;

/* compiled from: gk */
public class CharSequence extends BitSet {
    public static final int ATTENDEES_INDEX_RELATIONSHIP = 3;
    static final int TAG_AUDIO = 32;
    static RuntimeException this$0 = new RuntimeException(Constants.f93X, null);
    static final int voice_input = 3261415;
    int[] data;
    int head;
    String[] length;
    int name;
    Date[] offset;
    int pos;
    int size;
    int[] value;

    CharSequence() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gk.<init>(" + ')');
        }
    }

    static final void encode(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, Context[] contextArr, int i8) {
        i8 = 0;
        while (i8 < 8) {
            int $i8 = 0;
            while ($i8 < 8) {
                if (i2 + i8 > 0 && i2 + i8 < 103 && $i8 + i3 > 0 && $i8 + i3 < 103) {
                    try {
                        int[] $r4 = contextArr[i].this$0[i8 + i2];
                        int $i9 = $i8 + i3;
                        $r4[$i9] = $r4[$i9] & -16777217;
                    } catch (Throwable $r6) {
                        throw StringBuilder.append($r6, "gk.aa(" + ')');
                    }
                }
                $i8++;
            }
            i8++;
        }
        Logger logger = new Logger(bArr);
        for (i8 = 0; i8 < 4; i8++) {
            $i8 = 0;
            while ($i8 < 64) {
                $i9 = 0;
                while ($i9 < 64) {
                    if (i4 != i8 || $i8 < i5 || $i8 >= i5 + 8 || $i9 < i6 || $i9 >= i6 + 8) {
                        IOUtils.read(logger, 0, -1, -1, 0, 0, 0, (byte) 4);
                    } else {
                        int $i10 = i2 + TDoubleLinkedList.insert($i8 & 7, $i9 & 7, i7, -1288784099);
                        int $i11 = $i8 & 7;
                        int $i12 = $i9 & 7;
                        int $i13 = i7 & 3;
                        if ($i13 == 0) {
                            $i11 = $i12;
                        } else if ($i13 == 1) {
                            $i11 = 7 - $i11;
                        } else if ($i13 == 2) {
                            $i11 = 7 - $i12;
                        }
                        IOUtils.read(logger, i, $i10, $i11 + i3, 0, 0, i7, (byte) 66);
                    }
                    $i9++;
                }
                $i8++;
            }
        }
    }

    static CharSequence getValue(int i) {
        CharSequence $r2 = (CharSequence) this$0.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = Envelope.data.get(i, 0, -42920725);
        if ($r4 == null) {
            return null;
        }
        $r2 = Main.read($r4, -889824203);
        this$0.get($r2, (long) i);
        return $r2;
    }

    static CharSequence getValue(int $i0, int i) {
        CharSequence $r2 = (CharSequence) this$0.get((long) ($i0 << 16));
        if ($r2 != null) {
            return $r2;
        }
        i = Envelope.data.get(String.valueOf($i0), 1907128669);
        if (-1 == i) {
            return null;
        }
        byte[] $r5 = Envelope.data.add(i, (byte) 65);
        if ($r5 != null && $r5.length > 1) {
            $r2 = Main.read($r5, 1850513260);
            if ($r2 != null) {
                this$0.get($r2, (long) ($i0 << 16));
                return $r2;
            }
        }
        return null;
    }

    public static void init(int i, int i2, int i3, boolean z, byte b) {
        try {
            Config $r3 = Logger.add(R$string.image, client.this$0.key, (byte) 43);
            $r3.this$0.ensureCapacity(i3, 537618701);
            $r3.this$0.toString(i, -1562397802);
            $r3.this$0.toString(i2, 1097173809);
            $r3.this$0.start(z ? 764635467 * client.debug : 0, 1242192116);
            client.this$0.add($r3, (short) 255);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "gk.gp(" + ')');
        }
    }

    static CharSequence parse(byte[] bArr) {
        CharSequence $r1 = new CharSequence();
        Logger $r2 = new Logger(bArr);
        byte[] $r0 = $r2.size;
        $r2.data = ($r0.length - 2) * 2065011939;
        int $i0 = $r2.get(-163462104);
        $r0 = $r2.size;
        $i0 = (($r0.length - 2) - $i0) - 12;
        $r2.data = $i0 * 2065011939;
        int $i2 = $r2.size(741843337);
        $r1.pos = $r2.get(-820812964) * -224765331;
        $r1.head = $r2.get(-501972872) * -2113356825;
        $r1.size = $r2.get(-711624438) * 347150479;
        $r1.name = $r2.get(1404951740) * -707503511;
        int $i3 = $r2.get((byte) 0);
        if ($i3 > 0) {
            $r1.offset = $r1.size($i3, 332936913);
            for (int $i4 = 0; $i4 < $i3; $i4++) {
                int $i6;
                int $i5 = $r2.get(-1285287882);
                if ($i5 > 0) {
                    $i6 = $i5 - 1;
                    $i6 |= $i6 >>> 1;
                    $i6 |= $i6 >>> 2;
                    $i6 |= $i6 >>> 4;
                    $i6 |= $i6 >>> 8;
                    $i6 = ($i6 | ($i6 >>> 16)) + 1;
                } else {
                    $i6 = 1;
                }
                Date $r5 = new Date($i6);
                $r1.offset[$i4] = $r5;
                $i6 = $i5;
                while (true) {
                    $i5 = $i6 - 1;
                    if ($i6 <= 0) {
                        break;
                    }
                    $r5.get(new Value($r2.size(842679833)), (long) $r2.size(402018117));
                    $i6 = $i5;
                }
            }
        }
        $r2.data = 0;
        $r2.write((byte) 47);
        int[] $r6 = new int[$i2];
        $r1.value = $r6;
        $r6 = new int[$i2];
        $r1.data = $r6;
        String[] $r7 = new String[$i2];
        $r1.length = $r7;
        $i2 = 0;
        while ($r2.data * 1978945739 < $i0) {
            $i3 = $r2.get(1489740217);
            if ($i3 == 3) {
                $r1.length[$i2] = $r2.toString(519862068);
            } else if ($i3 >= 100 || 21 == $i3 || 38 == $i3 || $i3 == 39) {
                $r1.data[$i2] = $r2.get((byte) 0);
            } else {
                $r1.data[$i2] = $r2.size(178547462);
            }
            $r1.value[$i2] = $i3;
            $i2++;
        }
        return $r1;
    }

    static CharSequence read(byte[] bArr) {
        CharSequence $r1 = new CharSequence();
        Logger $r2 = new Logger(bArr);
        byte[] $r0 = $r2.size;
        $r2.data = ($r0.length - 2) * 2065011939;
        int $i0 = $r2.get(-1829946875);
        $r0 = $r2.size;
        $i0 = (($r0.length - 2) - $i0) - 12;
        $r2.data = $i0 * 2065011939;
        int $i2 = $r2.size(-560342529);
        $r1.pos = $r2.get(2090458719) * 422013801;
        $r1.head = $r2.get(987105174) * -746799925;
        $r1.size = $r2.get(-1340608563) * -951648646;
        $r1.name = $r2.get(1302889142) * -707503511;
        int $i3 = $r2.get((byte) 0);
        if ($i3 > 0) {
            $r1.offset = $r1.size($i3, 1629716391);
            for (int $i4 = 0; $i4 < $i3; $i4++) {
                int $i6;
                int $i5 = $r2.get(1140928604);
                if ($i5 > 0) {
                    $i6 = $i5 - 1;
                    $i6 |= $i6 >>> 1;
                    $i6 |= $i6 >>> 2;
                    $i6 |= $i6 >>> 4;
                    $i6 |= $i6 >>> 8;
                    $i6 = ($i6 | ($i6 >>> 16)) + 1;
                } else {
                    $i6 = 1;
                }
                Date $r5 = new Date($i6);
                $r1.offset[$i4] = $r5;
                $i6 = $i5;
                while (true) {
                    $i5 = $i6 - 1;
                    if ($i6 <= 0) {
                        break;
                    }
                    $r5.get(new Value($r2.size(146874081)), (long) $r2.size(1523183144));
                    $i6 = $i5;
                }
            }
        }
        $r2.data = 0;
        $r2.write((byte) 31);
        int[] $r6 = new int[$i2];
        $r1.value = $r6;
        $r6 = new int[$i2];
        $r1.data = $r6;
        String[] $r7 = new String[$i2];
        $r1.length = $r7;
        $i2 = 0;
        while ($r2.data * 493907701 < $i0) {
            $i3 = $r2.get(-831326243);
            if ($i3 == 3) {
                $r1.length[$i2] = $r2.toString(1627993649);
            } else if ($i3 >= 100 || 21 == $i3 || 654244764 == $i3 || $i3 == 39) {
                $r1.data[$i2] = $r2.get((byte) 0);
            } else {
                $r1.data[$i2] = $r2.size(408586937);
            }
            $r1.value[$i2] = $i3;
            $i2++;
        }
        return $r1;
    }

    static CharSequence toString(int i) {
        CharSequence $r2 = (CharSequence) this$0.get((long) i);
        if ($r2 != null) {
            return $r2;
        }
        byte[] $r4 = Envelope.data.get(i, 0, -448038387);
        if ($r4 == null) {
            return null;
        }
        $r2 = Main.read($r4, 1523827279);
        this$0.get($r2, (long) i);
        return $r2;
    }

    static CharSequence toString(int $i0, int i) {
        CharSequence $r2 = (CharSequence) this$0.get((long) ($i0 << 16));
        if ($r2 != null) {
            return $r2;
        }
        i = Envelope.data.get(String.valueOf($i0), 946147943);
        if (-1 == i) {
            return null;
        }
        byte[] $r4 = Envelope.data.add(i, (byte) 91);
        if ($r4 != null) {
            if ($r4.length <= 1) {
                return null;
            }
            $r2 = Main.read($r4, 909534484);
            if ($r2 != null) {
                this$0.get($r2, (long) ($i0 << 16));
                return $r2;
            }
        }
        return null;
    }

    static CharSequence update(int $i0, int i) {
        CharSequence $r2 = (CharSequence) this$0.get((long) ($i0 << 16));
        if ($r2 != null) {
            return $r2;
        }
        i = Envelope.data.get(String.valueOf($i0), -656438427);
        if (-1 == i) {
            return null;
        }
        byte[] $r4 = Envelope.data.add(i, (byte) 30);
        if ($r4 != null) {
            if ($r4.length <= 1) {
                return null;
            }
            $r2 = Main.read($r4, -1285893158);
            if ($r2 != null) {
                this$0.get($r2, (long) ($i0 << 16));
                return $r2;
            }
        }
        return null;
    }

    public static void update(Class classR, int i) {
        HyperlinkRecord.file = classR;
    }

    static CharSequence write(byte[] bArr) {
        CharSequence $r1 = new CharSequence();
        Logger $r2 = new Logger(bArr);
        byte[] $r0 = $r2.size;
        $r2.data = -229429711 * ($r0.length - 2);
        int $i0 = $r2.get(1569035236);
        $r0 = $r2.size;
        $i0 = (($r0.length - 2) - $i0) - 12;
        $r2.data = 2065011939 * $i0;
        int $i2 = $r2.size(578697454);
        $r1.pos = $r2.get(967629640) * -224765331;
        $r1.head = $r2.get(1222916524) * 785240203;
        $r1.size = $r2.get(1729682574) * 1128967848;
        $r1.name = $r2.get(-1981214079) * 386793751;
        int $i3 = $r2.get((byte) 0);
        if ($i3 > 0) {
            $r1.offset = $r1.size($i3, 1330475150);
            for (int $i4 = 0; $i4 < $i3; $i4++) {
                int $i6;
                int $i5 = $r2.get(-1144347856);
                if ($i5 > 0) {
                    $i6 = $i5 - 1;
                    $i6 |= $i6 >>> 1;
                    $i6 |= $i6 >>> 2;
                    $i6 |= $i6 >>> 4;
                    $i6 |= $i6 >>> 8;
                    $i6 = ($i6 | ($i6 >>> 16)) + 1;
                } else {
                    $i6 = 1;
                }
                Date $r5 = new Date($i6);
                $r1.offset[$i4] = $r5;
                $i6 = $i5;
                while (true) {
                    $i5 = $i6 - 1;
                    if ($i6 <= 0) {
                        break;
                    }
                    $r5.get(new Value($r2.size(1811016098)), (long) $r2.size(1848497363));
                    $i6 = $i5;
                }
            }
        }
        $r2.data = 0;
        $r2.write((byte) 126);
        int[] $r6 = new int[$i2];
        $r1.value = $r6;
        $r6 = new int[$i2];
        $r1.data = $r6;
        String[] $r7 = new String[$i2];
        $r1.length = $r7;
        $i2 = 0;
        while ($r2.data * 1375726334 < $i0) {
            $i3 = $r2.get(-1885022275);
            if ($i3 == 3) {
                $r1.length[$i2] = $r2.toString(1581748804);
            } else if ($i3 >= 100 || 21 == $i3 || 38 == $i3 || $i3 == 39) {
                $r1.data[$i2] = $r2.get((byte) 0);
            } else {
                $r1.data[$i2] = $r2.size(1230707824);
            }
            $r1.value[$i2] = $i3;
            $i2++;
        }
        return $r1;
    }

    Date[] getDates(int i) {
        return new Date[i];
    }

    Date[] setFirstVisibleHour(int i) {
        return new Date[i];
    }

    Date[] setModification(int i) {
        return new Date[i];
    }

    Date[] size(int i, int i2) {
        try {
            return new Date[i];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gk.aa(" + ')');
        }
    }
}
