package p000;

/* compiled from: fi */
public class AbstractHashedMap extends OrgFile implements ConcurrentHashMap {
    static final int STATE_ROUND_2_VALIDATED = 40;
    final Device data;
    FileUtils value;

    public AbstractHashedMap(int i, int i2) {
        try {
            this.data = PingManager.getInstance((byte) -20);
            get(i, i2, -1966164865);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "fi.<init>(" + ')');
        }
    }

    static final void toString(byte b) {
        if (client.fileName * 1285013819 != Msg.size * -1674539149) {
            int $i4;
            client.fileName = Msg.size * -617740503;
            byte $i1 = -1674539149 * Msg.size;
            int[] $r1 = Frame.data.size;
            int $i2 = $r1.length;
            int $i3 = 0;
            while ($i3 < $i2) {
                try {
                    $r1[$i3] = -16777216;
                    $i3++;
                } catch (RuntimeException $r10) {
                    throw StringBuilder.append($r10, "fi.by(" + ')');
                }
            }
            for ($i2 = 1; $i2 < 103; $i2++) {
                $i3 = ((103 - $i2) * Constants.ACC_STRICT) + 24628;
                for ($i4 = 1; $i4 < 103; $i4++) {
                    if ((Chart.size[$i1][$i4][$i2] & (byte) 24) == (byte) 0) {
                        OrgFile.this$0.read($r1, $i3, 512, (int) $i1, $i4, $i2);
                    }
                    if ($i1 < (byte) 3) {
                        if ((Chart.size[$i1 + 1][$i4][$i2] & (byte) 8) != (byte) 0) {
                            OrgFile.this$0.read($r1, $i3, 512, $i1 + 1, $i4, $i2);
                        } else {
                            continue;
                        }
                    }
                    $i3 += 4;
                }
            }
            double $d0 = Math.random() * 20.0d;
            double d = $d0;
            $i2 = ((((int) $d0) + 238) - 10) << 16;
            $d0 = Math.random() * 20.0d;
            d = $d0;
            $i2 += ((((int) $d0) + 238) - 10) << 8;
            $d0 = Math.random() * 20.0d;
            d = $d0;
            $i2 += (((int) $d0) + 238) - 10;
            $d0 = Math.random() * 20.0d;
            d = $d0;
            $i3 = ((((int) $d0) + 238) - 10) << 16;
            for ($i4 = 1; $i4 < 103; $i4++) {
                for (int $i5 = 1; $i5 < 103; $i5++) {
                    if ((Chart.size[$i1][$i5][$i4] & (byte) 24) == (byte) 0) {
                        ByteArrayOutputStream.write((int) $i1, $i5, $i4, $i2, $i3, 1312345556);
                    }
                    if ($i1 < (byte) 3) {
                        if ((Chart.size[$i1 + 1][$i5][$i4] & (byte) 8) != (byte) 0) {
                            ByteArrayOutputStream.write((int) $i1 + 1, $i5, $i4, $i2, $i3, 1117249319);
                        } else {
                            continue;
                        }
                    }
                }
            }
            client.encoding = 0;
            for (int $i12 = 0; $i12 < DiskLruCache.AppCompatTheme_editTextStyle; $i12++) {
                for ($i2 = 0; $i2 < DiskLruCache.AppCompatTheme_editTextStyle; $i2++) {
                    long $l6 = OrgFile.this$0.get(-1674539149 * Msg.size, $i12, $i2);
                    if (0 != $l6) {
                        $i3 = BigInteger.get(Method.get($l6), 1306994803).buffer * -515416689;
                        if ($i3 >= 0) {
                            client.attributes[-54161213 * client.encoding] = ByteBufferList.data[$i3].get(false, -1462542974);
                            client.append[-54161213 * client.encoding] = $i12;
                            client.ZERO[client.encoding * -54161213] = $i2;
                            client.encoding += 2074714091;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    public final int clear() {
        return 2054578337 * this.value;
    }

    final void clear(int $i0, int i) {
        this.count = -1240870246 * $i0;
        this.value = -1043102879 * i;
        if (this.value == null) {
            this.value = this.data.toString(36955457);
        }
        get(this.value, 1231757322);
    }

    final void clear(FileUtils fileUtils) {
        this.value = fileUtils;
        this.value.initialize(this.count * -1141985453, 2054578337 * this.value, (byte) -28);
        this.id = this.value.read(-1866593962);
    }

    public final int get(short s) {
        try {
            return 2054578337 * this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fi.an(" + ')');
        }
    }

    public final FileUtils get() {
        return this.value;
    }

    public final FileUtils get(int i) {
        try {
            return this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fi.af(" + ')');
        }
    }

    final void get(int i, int i2) {
        get(this.data.execute(this.value, 428394740), 1586146418);
    }

    final void get(int $i0, int i, int i2) {
        try {
            this.count = -1650234149 * $i0;
            this.value = -1043102879 * i;
            if (this.value == null) {
                this.value = this.data.toString(659193261);
            }
            get(this.value, 1876952188);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "fi.aj(" + ')');
        }
    }

    final void get(FileUtils fileUtils, int i) {
        try {
            this.value = fileUtils;
            this.value.initialize(this.count * -1141985453, 2054578337 * this.value, (byte) -109);
            this.id = this.value.read(1346814193);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "fi.ae(" + ')');
        }
    }

    public final int init() {
        return this.count * -1141985453;
    }

    final void init(int i, int i2, int i3, int i4) {
    }

    final void init(int i, int i2, int i3, int i4, int i5) {
    }

    final void init(FileUtils fileUtils) {
        this.value = fileUtils;
        this.value.initialize(this.count * -1141985453, 2054578337 * this.value, (byte) -121);
        this.id = this.value.read(-57660350);
    }

    final void put(int $i0, int i) {
        this.count = 2026730087 * $i0;
        this.value = -1374740552 * i;
        if (this.value == null) {
            this.value = this.data.toString(-480929344);
        }
        get(this.value, 1531320631);
    }

    final void put(int i, int i2, int i3, int i4) {
    }

    public final FileUtils remove() {
        return this.value;
    }

    final void remove(int i, int i2) {
        get(this.data.execute(this.value, -1212662119), 1697398088);
    }

    final void remove(int i, int i2, int i3) {
        try {
            get(this.data.execute(this.value, 165473906), 1936316691);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "fi.aq(" + ')');
        }
    }

    final void removeEntry(int i, int i2) {
        get(this.data.execute(this.value, -1150178727), 571034460);
    }

    public final int size() {
        return this.count * -1141985453;
    }

    public final int size(int i) {
        try {
            return this.count * -1141985453;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "fi.ad(" + ')');
        }
    }

    final void size(int i, int i2) {
        get(this.data.execute(this.value, 271984961), 1571389972);
    }
}
