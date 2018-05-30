package p000;

import java.lang.reflect.Array;

/* compiled from: dy */
public class Namespace extends Map {
    static final int ALIGNMENT = 16;
    static final int DEVICE = 1001;
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    static Controller context;
    static int[] value;

    Namespace() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dy.<init>(" + ')');
        }
    }

    static final void add(int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        try {
            if (Hashtable.get(i, (byte) -73)) {
                DrawingGroup.run(Float.size[i], -1, i2, i3, i4, i5, i6, i7, 1832340740);
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dy.eb(" + ')');
        }
    }

    static final void read(File file, byte b) {
        int $i1;
        int $i5;
        if (Contact.position * -521591013 > 0) {
            for ($i1 = 0; $i1 < 256; $i1++) {
                if (-521591013 * Contact.position > PingManager.ELEMENT) {
                    try {
                        Build$VERSION.size[$i1] = Chart.get(FileUtils.f119p[$i1], ZStream.size[$i1], 1024 - (Contact.position * -521591013), -1140785843);
                    } catch (RuntimeException $r4) {
                        throw StringBuilder.append($r4, "dy.ah(" + ')');
                    }
                } else if (-521591013 * Contact.position > 256) {
                    Build$VERSION.size[$i1] = ZStream.size[$i1];
                } else {
                    Build$VERSION.size[$i1] = Chart.get(ZStream.size[$i1], FileUtils.f119p[$i1], 256 - (-521591013 * Contact.position), -670109089);
                }
            }
        } else if (Contact.flags * -868909347 > 0) {
            for ($i1 = 0; $i1 < 256; $i1++) {
                if (-868909347 * Contact.flags > PingManager.ELEMENT) {
                    Build$VERSION.size[$i1] = Chart.get(FileUtils.f119p[$i1], Frame.f127p[$i1], 1024 - (Contact.flags * -868909347), -1943599353);
                } else if (Contact.flags * -868909347 > 256) {
                    Build$VERSION.size[$i1] = Frame.f127p[$i1];
                } else {
                    Build$VERSION.size[$i1] = Chart.get(Frame.f127p[$i1], FileUtils.f119p[$i1], 256 - (Contact.flags * -868909347), -860268945);
                }
            }
        } else {
            for ($i1 = 0; $i1 < 256; $i1++) {
                Build$VERSION.size[$i1] = FileUtils.f119p[$i1];
            }
        }
        file.write(Contact.log, 920632788);
        file.write(Contact.state * 286016249, 9, (286016249 * Contact.state) + Constants.f93X, 263, -536493990);
        file.add(GifDecoder.value, Contact.state * 286016249, 0, (byte) -58);
        file.add(Contact.log, 1095873449);
        int $i2 = 0;
        int $i4 = (Contact.state * 286016249) + (-36651515 * file.length);
        $i1 = 1;
        while ($i1 < 255) {
            int $i3 = ((Contact.next[$i1] * (256 - $i1)) / 256) + 22;
            if ($i3 < 0) {
                $i3 = 0;
            }
            $i5 = $i2 + $i3;
            $i2 = $i4;
            int $i7 = $i5;
            $i4 = $i3;
            while ($i4 < Constants.f93X) {
                $i5 = $i7 + 1;
                int $i6 = Contact.key[$i7];
                if ($i6 != 0) {
                    int $i11 = 256 - $i6;
                    int $i9 = Build$VERSION.size[$i6];
                    int $i12 = file.size[$i2];
                    $i7 = $i2 + 1;
                    int i = (((65280 & $i12) * $i11) + ((65280 & $i9) * $i6)) & 16711680;
                    int $i62 = $i6 * ($i9 & 16711935);
                    $i6 = $i62;
                    $i62 = ($i62 + ($i11 * ($i12 & 16711935))) & -16711936;
                    $i6 = $i62;
                    file.size[$i2] = (($i62 + i) >> 8) | -16777216;
                } else {
                    $i7 = $i2 + 1;
                }
                $i4++;
                $i2 = $i7;
                $i7 = $i5;
            }
            $i3 = $i2 + (($i3 + (-481290979 * file.length)) - 128);
            $i1++;
            $i2 = $i7;
            $i4 = $i3;
        }
        file.write(Contact.log, 1919436834);
        file.write(((Contact.state * 286016249) + 765) - 128, 9, (286016249 * Contact.state) + 765, 263, 187314471);
        file.add(Contact.left, (286016249 * Contact.state) + 382, 0, (byte) -97);
        file.add(Contact.log, 1095873449);
        $i4 = 0;
        $i2 = (Contact.state * 286016249) + (((file.length * -36651515) + 24) + 637);
        $i1 = 1;
        $i5 = $i2;
        while ($i1 < 255) {
            $i2 = ((256 - $i1) * Contact.next[$i1]) / 256;
            $i3 = 103 - $i2;
            $i6 = $i4;
            $i4 = $i5 + $i2;
            $i5 = 0;
            while ($i5 < $i3) {
                $i7 = $i6 + 1;
                i = Contact.key[$i6];
                if (i != 0) {
                    $i9 = 256 - i;
                    int $i10 = Build$VERSION.size[i];
                    $i11 = file.size[$i4];
                    $i6 = $i4 + 1;
                    $i12 = (((16711935 & $i11) * $i9) + ((16711935 & $i10) * i)) & -16711936;
                    $i62 = ((i * ($i10 & 65280)) + ($i9 * (65280 & $i11))) & 16711680;
                    $i9 = $i62;
                    file.size[$i4] = (($i62 + $i12) >> 8) | -16777216;
                } else {
                    $i6 = $i4 + 1;
                }
                $i5++;
                $i4 = $i6;
                $i6 = $i7;
            }
            $i2 = $i4 + (((-481290979 * file.length) - $i3) - $i2);
            $i1++;
            $i4 = $i6 + (Constants.f93X - $i3);
            $i5 = $i2;
        }
    }

    static final void set(Collection collection, int i) {
        try {
            int $i0 = collection.type * 637036499;
            i = $i0;
            collection.text = $i0;
            if (collection.parent * 761444243 == 0) {
                collection.height = 0;
                return;
            }
            if (collection.data * 1462124603 != -1) {
                if (collection.start * 1913892303 == 0) {
                    JSONArray $r6 = AbstractBuffer.get(collection.data * 1462124603, 181693584);
                    if (collection.width * -1210627617 > 0) {
                        if ($r6.index * -920725183 == 0) {
                            $i0 = collection.height + 72267307;
                            i = $i0;
                            collection.height = $i0;
                            return;
                        }
                    }
                    if (collection.width * -1210627617 <= 0) {
                        if ($r6.value * -990546557 == 0) {
                            $i0 = collection.height + 72267307;
                            i = $i0;
                            collection.height = $i0;
                            return;
                        }
                    }
                }
            }
            int $i4 = 516759209 * collection.size;
            int $i1 = collection.value * 2328865;
            i = (collection.this$0[(collection.parent * 761444243) - 1] * Constants.f93X) + (collection.count * -144385472);
            int $i7 = (-144385472 * collection.count) + (collection.length[(collection.parent * 761444243) - 1] * Constants.f93X);
            if ($i4 < i) {
                if ($i1 < $i7) {
                    collection.name = 120595712;
                } else if ($i1 > $i7) {
                    collection.name = 1027827456;
                } else {
                    collection.name = -1573272064;
                }
            } else if ($i4 > i) {
                if ($i1 < $i7) {
                    collection.name = -786636032;
                } else if ($i1 > $i7) {
                    collection.name = -1693867776;
                } else {
                    collection.name = 907231744;
                }
            } else if ($i1 < $i7) {
                collection.name = 1814463488;
            } else if ($i1 > $i7) {
                collection.name = 0;
            }
            byte $b3 = collection.log[(collection.parent * 761444243) - 1];
            if (i - $i4 > 256 || i - $i4 < -256 || $i7 - $i1 > 256 || $i7 - $i1 < -256) {
                $i0 = i * 1506829721;
                i = $i0;
                collection.size = $i0;
                collection.value = $i7 * -1638712607;
                $i0 = collection.parent - -521273701;
                i = $i0;
                collection.parent = $i0;
                if (collection.width * -1210627617 > 0) {
                    $i0 = collection.width - 948941343;
                    i = $i0;
                    collection.width = $i0;
                    return;
                }
            }
            int $i2 = ((-1058596255 * collection.name) - (-626668509 * collection.index)) & 2047;
            if ($i2 > 1024) {
                $i2 -= 2048;
            }
            int $i5 = -329496033 * collection.min;
            if ($i2 >= -256 && $i2 <= 256) {
                $i5 = collection.flags * -495497867;
            } else if ($i2 >= 256 && $i2 < PingManager.ELEMENT) {
                $i5 = collection.f79x * 303292531;
            } else if ($i2 >= -768 && $i2 <= -256) {
                $i5 = -1874110997 * collection.max;
            }
            if ($i5 == -1) {
                $i5 = collection.flags * -495497867;
            }
            collection.text = $i5 * -662713255;
            boolean $z0 = true;
            if (collection instanceof Time) {
                boolean $z02 = ((Time) collection).value;
                Vector $r8 = $z02;
                $z0 = $z02.max;
            }
            if ($z0) {
                if (collection.index * -626668509 != collection.name * -1058596255) {
                    if (-1 == collection.key * -609375913) {
                        if (collection.f76s * 1791262809 != 0) {
                            $i2 = 2;
                            if (collection.parent * 761444243 > 2) {
                                $i2 = 6;
                            }
                            if (collection.parent * 761444243 > 3) {
                                $i2 = 8;
                            }
                            if (collection.height * -1269933949 > 0) {
                                if (collection.parent * 761444243 > 1) {
                                    collection.height -= 72267307;
                                    $i2 = 8;
                                }
                            }
                        }
                    }
                }
                $i2 = 4;
                if (collection.parent * 761444243 > 2) {
                    $i2 = 6;
                }
                if (collection.parent * 761444243 > 3) {
                    $i2 = 8;
                }
                if (collection.height * -1269933949 > 0) {
                    if (collection.parent * 761444243 > 1) {
                        collection.height -= 72267307;
                        $i2 = 8;
                    }
                }
            } else {
                $i2 = collection.parent * 761444243 > 1 ? 6 : 4;
                if (collection.parent * 761444243 > 2) {
                    $i2 = 8;
                }
                if (collection.height * -1269933949 > 0) {
                    if (collection.parent * 761444243 > 1) {
                        collection.height -= 72267307;
                        $i2 = 8;
                    }
                }
            }
            if ((byte) 2 == $b3) {
                $i2 <<= 1;
            }
            if ($i2 >= 8) {
                $i0 = collection.text * 259701737;
                int i2 = $i0;
                if (collection.flags * -495497867 == $i0) {
                    if (114758451 * collection.element != -1) {
                        collection.text = 1381978299 * collection.element;
                    }
                }
            }
            if (!($i4 == i && $i7 == $i1)) {
                if ($i4 < i) {
                    collection.size += $i2 * 1506829721;
                    if (collection.size * 516759209 > i) {
                        collection.size = i * 1506829721;
                    }
                } else if ($i4 > i) {
                    collection.size -= $i2 * 1506829721;
                    if (collection.size * 516759209 < i) {
                        collection.size = 1506829721 * i;
                    }
                }
                if ($i1 < $i7) {
                    collection.value = ($i2 * -1638712607) + collection.value;
                    if (2328865 * collection.value > $i7) {
                        collection.value = -1638712607 * $i7;
                    }
                } else if ($i1 > $i7) {
                    collection.value -= $i2 * -1638712607;
                    if (collection.value * 2328865 < $i7) {
                        collection.value = $i7 * -1638712607;
                    }
                }
            }
            if (516759209 * collection.size == i) {
                $i0 = collection.value * 2328865;
                i = $i0;
                if ($i0 == $i7) {
                    $i0 = collection.parent - -521273701;
                    i = $i0;
                    collection.parent = $i0;
                    if (collection.width * -1210627617 > 0) {
                        $i0 = collection.width - 948941343;
                        i = $i0;
                        collection.width = $i0;
                    }
                }
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dy.bq(" + ')');
        }
    }

    public int compare() {
        return (-2112147609 * this.offset) | ((this.count * 631621543) << 8);
    }

    public boolean compare(Object obj) {
        if (!(obj instanceof Namespace)) {
            return false;
        }
        Namespace $r2 = (Namespace) obj;
        return $r2.offset * -2112147609 == this.offset * -2112147609 && $r2.count * 631621543 == this.count * 631621543;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Namespace)) {
            return false;
        }
        try {
            Namespace $r2 = (Namespace) obj;
            if ($r2.offset * -2112147609 == this.offset * -2112147609) {
                if ($r2.count * 631621543 == this.count * 631621543) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "dy.equals(" + ')');
        }
    }

    public int get() {
        return (-2112147609 * this.offset) | ((this.count * 631621543) << 8);
    }

    public boolean get(Object obj) {
        if (!(obj instanceof Namespace)) {
            return false;
        }
        Namespace $r2 = (Namespace) obj;
        return 587943994 * $r2.offset == -1003680410 * this.offset && $r2.count * 631621543 == -790638188 * this.count;
    }

    public int getValue() {
        return (-2112147609 * this.offset) | ((this.count * 631621543) << 8);
    }

    public int hashCode() {
        try {
            return (-2112147609 * this.offset) | ((this.count * 631621543) << 8);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dy.hashCode(" + ')');
        }
    }

    void init(Logger logger, Logger logger2) {
        if (ZStream.parser.buffer * -938545684 != logger2.get((byte) 0)) {
            throw new IllegalStateException("");
        }
        this.height = logger2.get((byte) 0) * 1316556905;
        this.data = logger2.get((byte) 0) * -238751605;
        this.index = logger2.get(60760294) * -1907175109;
        this.value = logger2.get(1227439689) * 1780355009;
        this.offset = logger2.get(-734543692) * -886062025;
        this.count = logger2.get(1674355554) * -1192787951;
        this.data = Math.min(330235966 * this.data, 4) * 67209706;
        this.start = (short[][][]) Array.newInstance(Short.TYPE, new int[]{1, 64, 64});
        this.buffer = (short[][][]) Array.newInstance(Short.TYPE, new int[]{-1806432256 * this.data, -862906857, 64});
        this.length = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * 1392925898, -384724707, -927715013});
        this.next = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, -147880942, 785340791});
        this.size = (Tags[][][][]) Array.newInstance(eu[].class, new int[]{this.data * -1533544669, -2009489821, -1527770090});
        if (logger.get((byte) 0) != -697378222 * ParserHelper.active.value) {
            throw new IllegalStateException("");
        }
        int $i1 = logger.get((byte) 0);
        int $i0 = logger.get((byte) 0);
        int $i2 = this.offset * 493887684;
        int i = $i2;
        if ($i2 == $i1 && $i0 == 631621543 * this.count) {
            for ($i0 = 0; $i0 < 64; $i0++) {
            }
            return;
        }
        throw new IllegalStateException("");
    }

    void read(Logger logger, Logger logger2) {
        if (ZStream.parser.buffer * 72155053 != logger2.get((byte) 0)) {
            throw new IllegalStateException("");
        }
        this.height = logger2.get((byte) 0) * 1316556905;
        this.data = logger2.get((byte) 0) * -238751605;
        this.index = logger2.get(-1560256607) * -1773843821;
        this.value = logger2.get(216382120) * 113036897;
        this.offset = logger2.get(2079328154) * -324305833;
        this.count = logger2.get(1962962384) * -345083881;
        this.data = Math.min(this.data * -1533544669, 4) * -238751605;
        this.start = (short[][][]) Array.newInstance(Short.TYPE, new int[]{1, 64, 64});
        this.buffer = (short[][][]) Array.newInstance(Short.TYPE, new int[]{this.data * -1533544669, 64, 64});
        this.length = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, 64, 64});
        this.next = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, 64, 64});
        this.size = (Tags[][][][]) Array.newInstance(eu[].class, new int[]{this.data * -1533544669, 64, 64});
        if (logger.get((byte) 0) != 1408692481 * ParserHelper.active.value) {
            throw new IllegalStateException("");
        }
        int $i1 = logger.get((byte) 0);
        int $i0 = logger.get((byte) 0);
        int $i2 = this.offset * -2112147609;
        int i = $i2;
        if ($i2 == $i1 && $i0 == 631621543 * this.count) {
            for ($i0 = 0; $i0 < 64; $i0++) {
                for ($i1 = 0; $i1 < 64; $i1++) {
                    parse($i0, $i1, logger, 952361632);
                }
            }
            return;
        }
        throw new IllegalStateException("");
    }

    void read(Logger logger, Logger logger2, int i) {
        try {
            if (ZStream.parser.buffer * 72155053 != logger2.get((byte) 0)) {
                throw new IllegalStateException("");
            }
            int $i0 = logger2.get((byte) 0) * 1316556905;
            i = $i0;
            this.height = $i0;
            $i0 = logger2.get((byte) 0) * -238751605;
            i = $i0;
            this.data = $i0;
            $i0 = logger2.get(-703540991) * -1773843821;
            i = $i0;
            this.index = $i0;
            $i0 = logger2.get(1332602971) * 113036897;
            i = $i0;
            this.value = $i0;
            $i0 = logger2.get(-523051896) * -324305833;
            i = $i0;
            this.offset = $i0;
            $i0 = logger2.get(872561504) * -345083881;
            i = $i0;
            this.count = $i0;
            $i0 = Math.min(this.data * -1533544669, 4) * -238751605;
            i = $i0;
            this.data = $i0;
            this.start = (short[][][]) Array.newInstance(Short.TYPE, new int[]{1, 64, 64});
            this.buffer = (short[][][]) Array.newInstance(Short.TYPE, new int[]{this.data * -1533544669, 64, 64});
            this.length = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, 64, 64});
            this.next = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.data * -1533544669, 64, 64});
            this.size = (Tags[][][][]) Array.newInstance(eu[].class, new int[]{this.data * -1533544669, 64, 64});
            if (logger.get((byte) 0) != 1408692481 * ParserHelper.active.value) {
                throw new IllegalStateException("");
            }
            int $i1 = logger.get((byte) 0);
            i = logger.get((byte) 0);
            $i0 = this.offset * -2112147609;
            int i2 = $i0;
            if ($i0 == $i1) {
                if (i == 631621543 * this.count) {
                    for ($i1 = 0; $i1 < 64; $i1++) {
                        for (i = 0; i < 64; i++) {
                            parse($i1, i, logger, 952361632);
                        }
                    }
                    return;
                }
            }
            throw new IllegalStateException("");
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "dy.av(" + ')');
        }
    }
}
