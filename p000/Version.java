package p000;

/* compiled from: db */
public class Version implements Key {
    public static final int Theme_borderlessButtonStyle = 54;
    static final int VERSION = 4;
    static int f371a;
    static int path;
    int id;
    int key;
    int name;
    int text;
    int value;
    int view;

    Version() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "db.<init>(" + ')');
        }
    }

    static final void add(int i, int i2, int i3, byte b) {
        if (i < Constants.f93X || i2 < Constants.f93X || i > 13056 || i2 > 13056) {
            client.f386b = -1171803197;
            client.f387c = 412000025;
            return;
        }
        try {
            int $i4 = InputStream.toString(i, i2, Msg.size * -1674539149, 1752848368) - i3;
            i3 = i - (-721800181 * ClassWriter.f48x);
            i = $i4 - (43525885 * Locale.f177y);
            int $i5 = i2 - (Wallet.f372y * -2076152847);
            i2 = Point.f197x[Segment.f277y * -1421687705];
            int $i6 = Point.f198y[Segment.f277y * -1421687705];
            int $i7 = Point.f197x[Request.f272y * 1124758849];
            int $i8 = Point.f198y[1124758849 * Request.f272y];
            $i4 = (($i5 * $i7) + (i3 * $i8)) >> 16;
            $i5 = (($i5 * $i8) - (i3 * $i7)) >> 16;
            i3 = ((i * $i6) - (i2 * $i5)) >> 16;
            i = ((i * i2) + ($i5 * $i6)) >> 16;
            if (i >= 50) {
                client.f386b = (((client.mCurrent * 2140963035) / 2) + (((2097392939 * client.helper) * $i4) / i)) * 1171803197;
                client.f387c = ((((client.helper * 2097392939) * i3) / i) + ((client.page * -1949120505) / 2)) * -412000025;
                return;
            }
            client.f386b = -1171803197;
            client.f387c = 412000025;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "db.dr(" + ')');
        }
    }

    static void parse(List list, List list2, File file, int i) {
        int $i3;
        int i2;
        i = -1859364873 * Contact.out.text;
        int $i1 = Contact.out.context * -880399799;
        if (StringBuffer.value == null) {
            StringBuffer.value = StringBuffer.toString(ByteBuffer.this$0, "sl_back", "", -536533470);
        }
        if (LogActivity.value == null) {
            LogActivity.value = ArrayRealVector.toString(ByteBuffer.this$0, "sl_flags", "", (short) 338);
        }
        if (Context.count == null) {
            Context.count = ArrayRealVector.toString(ByteBuffer.this$0, "sl_arrows", "", (short) 338);
        }
        if (Transaction.state == null) {
            Transaction.state = ArrayRealVector.toString(ByteBuffer.this$0, "sl_stars", "", (short) 338);
        }
        file.add(Contact.state * 286016249, 23, 765, 480, 0, (byte) 6);
        file.read(Contact.state * 286016249, 0, 125, 23, 12425273, 9135624, -84164448);
        file.read((Contact.state * 286016249) + 125, 0, 640, 23, 5197647, 2697513, 183511339);
        list.append(R$id.channel, (286016249 * Contact.state) + 62, 15, 0, -1, file);
        if (Transaction.state != null) {
            $i3 = Contact.state * 286016249;
            i2 = $i3;
            file.add(Transaction.state[1], $i3 + 140, 1, (short) -12366);
            $i3 = Contact.state * 286016249;
            i2 = $i3;
            list2.add(R$id.pattern, $i3 + 152, 10, 16777215, -1, file);
            $i3 = Contact.state * 286016249;
            i2 = $i3;
            file.add(Transaction.state[0], $i3 + 140, 12, (short) 1041);
            $i3 = Contact.state * 286016249;
            i2 = $i3;
            list2.add(R$id.token, $i3 + 152, 21, 16777215, -1, file);
        }
        if (Context.count != null) {
            Double $r8;
            Double $r10;
            if (ByteBuffer.data[0] == 0) {
                if (1 == ByteBuffer.count[0]) {
                    $r8 = Context.count[2];
                    if (ByteBuffer.data[0] == 0) {
                        if (1 == ByteBuffer.count[0]) {
                            $r10 = Context.count[3];
                            $i3 = Contact.state * 286016249;
                            i2 = $i3;
                            i2 = $i3 + 280;
                            file.add($r8, i2, 4, (short) 8435);
                            file.add($r10, i2 + 15, 4, (short) 13044);
                            list.add(R$id.verifier, i2 + 32, 17, 16777215, -1, file);
                            i2 = (286016249 * Contact.state) + 390;
                            file.add($r8, i2, 4, (short) 1976);
                            file.add($r10, i2 + 15, 4, (short) -2785);
                            list.add(R$id.salt, i2 + 32, 17, 16777215, -1, file);
                            $i3 = Contact.state * 286016249;
                            i2 = $i3;
                            i2 = $i3 + 500;
                            file.add($r8, i2, 4, (short) 6496);
                            file.add($r10, i2 + 15, 4, (short) 7569);
                            list.add(R$id.iv, i2 + 32, 17, 16777215, -1, file);
                            $i3 = Contact.state * 286016249;
                            i2 = $i3;
                            i2 = $i3 + 610;
                            file.add($r8, i2, 4, (short) 16848);
                            file.add($r10, i2 + 15, 4, (short) 14268);
                            list.add(R$id.format, i2 + 32, 17, 16777215, -1, file);
                        }
                    }
                    $r10 = Context.count[1];
                    $i3 = Contact.state * 286016249;
                    i2 = $i3;
                    i2 = $i3 + 280;
                    file.add($r8, i2, 4, (short) 8435);
                    file.add($r10, i2 + 15, 4, (short) 13044);
                    list.add(R$id.verifier, i2 + 32, 17, 16777215, -1, file);
                    i2 = (286016249 * Contact.state) + 390;
                    file.add($r8, i2, 4, (short) 1976);
                    file.add($r10, i2 + 15, 4, (short) -2785);
                    list.add(R$id.salt, i2 + 32, 17, 16777215, -1, file);
                    $i3 = Contact.state * 286016249;
                    i2 = $i3;
                    i2 = $i3 + 500;
                    file.add($r8, i2, 4, (short) 6496);
                    file.add($r10, i2 + 15, 4, (short) 7569);
                    list.add(R$id.iv, i2 + 32, 17, 16777215, -1, file);
                    $i3 = Contact.state * 286016249;
                    i2 = $i3;
                    i2 = $i3 + 610;
                    file.add($r8, i2, 4, (short) 16848);
                    file.add($r10, i2 + 15, 4, (short) 14268);
                    list.add(R$id.format, i2 + 32, 17, 16777215, -1, file);
                }
            }
            $r8 = Context.count[0];
            if (ByteBuffer.data[0] == 0) {
                if (1 == ByteBuffer.count[0]) {
                    $r10 = Context.count[3];
                    $i3 = Contact.state * 286016249;
                    i2 = $i3;
                    i2 = $i3 + 280;
                    file.add($r8, i2, 4, (short) 8435);
                    file.add($r10, i2 + 15, 4, (short) 13044);
                    list.add(R$id.verifier, i2 + 32, 17, 16777215, -1, file);
                    i2 = (286016249 * Contact.state) + 390;
                    file.add($r8, i2, 4, (short) 1976);
                    file.add($r10, i2 + 15, 4, (short) -2785);
                    list.add(R$id.salt, i2 + 32, 17, 16777215, -1, file);
                    $i3 = Contact.state * 286016249;
                    i2 = $i3;
                    i2 = $i3 + 500;
                    file.add($r8, i2, 4, (short) 6496);
                    file.add($r10, i2 + 15, 4, (short) 7569);
                    list.add(R$id.iv, i2 + 32, 17, 16777215, -1, file);
                    $i3 = Contact.state * 286016249;
                    i2 = $i3;
                    i2 = $i3 + 610;
                    file.add($r8, i2, 4, (short) 16848);
                    file.add($r10, i2 + 15, 4, (short) 14268);
                    list.add(R$id.format, i2 + 32, 17, 16777215, -1, file);
                }
            }
            $r10 = Context.count[1];
            $i3 = Contact.state * 286016249;
            i2 = $i3;
            i2 = $i3 + 280;
            file.add($r8, i2, 4, (short) 8435);
            file.add($r10, i2 + 15, 4, (short) 13044);
            list.add(R$id.verifier, i2 + 32, 17, 16777215, -1, file);
            i2 = (286016249 * Contact.state) + 390;
            file.add($r8, i2, 4, (short) 1976);
            file.add($r10, i2 + 15, 4, (short) -2785);
            list.add(R$id.salt, i2 + 32, 17, 16777215, -1, file);
            $i3 = Contact.state * 286016249;
            i2 = $i3;
            i2 = $i3 + 500;
            file.add($r8, i2, 4, (short) 6496);
            file.add($r10, i2 + 15, 4, (short) 7569);
            list.add(R$id.iv, i2 + 32, 17, 16777215, -1, file);
            $i3 = Contact.state * 286016249;
            i2 = $i3;
            i2 = $i3 + 610;
            file.add($r8, i2, 4, (short) 16848);
            file.add($r10, i2 + 15, 4, (short) 14268);
            list.add(R$id.format, i2 + 32, 17, 16777215, -1, file);
        }
        $i3 = Contact.state * 286016249;
        i2 = $i3;
        file.add($i3 + 708, 4, 50, 16, 0, (byte) -77);
        list2.append(R$id.f257r, ((286016249 * Contact.state) + 708) + 25, 16, 16777215, -1, file);
        Contact.count = 241160457;
        if (StringBuffer.value != null) {
            int $i2;
            int $i4 = 8;
            int $i5 = 24;
            while (true) {
                $i2 = ($i4 + -1) * $i5 >= 443593871 * ByteBuffer.size ? $i4 - 1 : $i4;
                i2 = ($i5 + -1) * $i2 >= 443593871 * ByteBuffer.size ? $i5 - 1 : $i5;
                if ((i2 - 1) * $i2 >= ByteBuffer.size * 443593871) {
                    i2--;
                }
                if ($i5 == i2 && $i2 == $i4) {
                    break;
                }
                $i5 = i2;
                $i4 = $i2;
            }
            $i4 = (765 - ($i2 * 88)) / ($i2 + 1);
            if ($i4 > 5) {
                $i4 = 5;
            }
            $i5 = (480 - (i2 * 19)) / (i2 + 1);
            if ($i5 > 5) {
                $i5 = 5;
            }
            int $i6 = ((765 - (88 * $i2)) - (($i2 - 1) * $i4)) / 2;
            $i2 = ((480 - (19 * i2)) - ((i2 - 1) * $i5)) / 2;
            int $i7 = $i2 + 23;
            $i6 = (286016249 * Contact.state) + $i6;
            Object obj = null;
            int $i9 = 0;
            for (int $i8 = 0; $i8 < 443593871 * ByteBuffer.size; $i8++) {
                byte $b11;
                ByteBuffer $r12 = Short.value[$i8];
                $i3 = $r12.value * -1545862613;
                int i3 = $i3;
                String $r7 = Integer.toString($i3);
                boolean z;
                if (-1545862613 * $r12.value == -1) {
                    $r7 = R$id.off;
                    z = false;
                } else if (-1545862613 * $r12.value > 1980) {
                    $r7 = R$id.read;
                    z = false;
                } else {
                    z = true;
                }
                i3 = 0;
                if ($r12.toString(-1777923331)) {
                    $b11 = $r12.size(-852062985) ? (byte) 7 : (byte) 6;
                } else if ($r12.add((byte) 100)) {
                    i3 = 16711680;
                    $b11 = $r12.size(-852271876) ? (byte) 5 : (byte) 4;
                } else {
                    try {
                        $b11 = $r12.get(642927059) ? $r12.size(49466700) ? (byte) 3 : (byte) 2 : $r12.size(-526045928) ? (byte) 1 : (byte) 0;
                    } catch (Throwable $r15) {
                        throw StringBuilder.append($r15, "db.ak(" + ')');
                    }
                }
                if (i < $i6 || $i1 < $i7 || i >= $i6 + 88 || $i1 >= 19 + $i7 || !r37) {
                    file.add(StringBuffer.value[$b11], $i6, $i7, (byte) -118);
                } else {
                    Contact.count = -241160457 * $i8;
                    file.get(StringBuffer.value[$b11], $i6, $i7, Constants.f93X, 16777215, (byte) 40);
                    obj = 1;
                }
                if (LogActivity.value != null) {
                    file.add(LogActivity.value[($r12.size(-1906163587) ? (byte) 8 : (byte) 0) + ($r12.log * 1116252417)], $i6 + 29, $i7, (short) 11618);
                }
                list.append(Integer.toString(-756728079 * $r12.length), $i6 + 15, ($i7 + 9) + 5, i3, -1, file);
                list2.append($r7, $i6 + 60, ($i7 + 9) + 5, 268435455, -1, file);
                $i7 += $i5 + 19;
                $i9++;
                if ($i9 >= i2) {
                    $i7 = $i2 + 23;
                    $i6 += 88 + $i4;
                    $i9 = 0;
                }
            }
            if (obj != null) {
                i2 = list2.get(Short.value[Contact.count * 488305351].name) + 6;
                $i4 = list2.this$0 + 8;
                file.add(i - (i2 / 2), ($i1 + 20) + 5, i2, $i4, 16777120, (byte) -64);
                file.append(i - (i2 / 2), ($i1 + 20) + 5, i2, $i4, 0, 1951295925);
                list2.append(Short.value[488305351 * Contact.count].name, i, (list2.this$0 + (($i1 + 20) + 5)) + 4, 0, -1, file);
            }
        }
    }

    public int[] compareTo(int i, int i2, int i3) {
        if (!toString(i, i2, i3, -1048055167)) {
            return null;
        }
        return new int[]{((this.id * -1756269376) - (-2011694453 * this.value)) + i2, ((this.name * -1389163840) - (1430262772 * this.text)) + i3};
    }

    public Method equals(int $i0, int $i1) {
        if (!toString($i0, $i1, 365302223)) {
            return null;
        }
        return new Method(-2059926499 * this.key, $i0 + ((650560576 * this.value) - (-2130101894 * this.id)), ((this.text * -558151392) - (this.name * -892835640)) + $i1);
    }

    public void equals(Arrays arrays) {
        if (-1332676195 * arrays.value > -1689630765 * this.id) {
            arrays.value = this.id * -1077700049;
        }
        if (845527457 * arrays.type < -430094893 * this.id) {
            arrays.type = this.id * 8966899;
        }
        if (-655717773 * arrays.path > this.name * 1521798187) {
            arrays.path = -521987227 * this.name;
        }
        if (arrays.title * -1737342918 < this.name * 1521798187) {
            arrays.title = this.name * 1838538329;
        }
    }

    public boolean equals(int i, int $i1, int i2) {
        if (i >= this.key * -2059926499) {
            if (i >= (this.key * -2059926499) + (this.view * 140957137)) {
                return false;
            }
            if (2090539793 * this.value == ($i1 >> 6) && this.text * 730380621 == (i2 >> 6)) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(int i, int $i1, int i2) {
        if (i >= -2059926499 * this.key) {
            if (i >= (429488506 * this.key) + (this.view * 1936948403)) {
                return false;
            }
            if (-1020232405 * this.value == ($i1 >> 6) && this.text * 1158452701 == (i2 >> 6)) {
                return true;
            }
        }
        return false;
    }

    public Method get(int $i0, int $i1) {
        if (!toString($i0, $i1, 422972934)) {
            return null;
        }
        return new Method(1019610866 * this.key, $i0 + ((-1520747638 * this.value) - (-1521521326 * this.id)), ((this.text * -2132595458) - (this.name * -1389163840)) + $i1);
    }

    public boolean get(int i, int $i1, int i2) {
        if (i >= this.key * -2059926499) {
            if (i >= (this.key * -2059926499) + (this.view * 140957137)) {
                return false;
            }
            if (2090539793 * this.value == ($i1 >> 6) && this.text * 730380621 == (i2 >> 6)) {
                return true;
            }
        }
        return false;
    }

    public boolean init(int i, int $i1, int i2) {
        if (i >= -747196207 * this.key) {
            if (i >= (714057821 * this.key) + (this.view * -481025201)) {
                return false;
            }
            if (1051995194 * this.value == ($i1 >> 6) && this.text * 730380621 == (i2 >> 6)) {
                return true;
            }
        }
        return false;
    }

    public int[] onClick(int i, int i2, int i3) {
        if (!toString(i, i2, i3, -448158261)) {
            return null;
        }
        return new int[]{((this.id * -1756269376) - (650560576 * this.value)) + i2, ((this.name * -1389163840) - (-500280512 * this.text)) + i3};
    }

    public Method onCreate(int $i0, int $i1) {
        if (!toString($i0, $i1, -1059496891)) {
            return null;
        }
        return new Method(-2059926499 * this.key, $i0 + ((650560576 * this.value) - (-1756269376 * this.id)), ((this.text * -500280512) - (this.name * -1389163840)) + $i1);
    }

    public void onCreate(Arrays arrays) {
        if (-1332676195 * arrays.value > this.id * -430094893) {
            arrays.value = this.id * -1077700049;
        }
        if (845527457 * arrays.type < this.id * -430094893) {
            arrays.type = this.id * 8966899;
        }
        if (-668436401 * arrays.path > this.name * 1521798187) {
            arrays.path = -521987227 * this.name;
        }
        if (arrays.title * -519973341 < this.name * 1521798187) {
            arrays.title = this.name * 1838538329;
        }
    }

    public void onCreate(Logger logger) {
        this.key = logger.get((byte) 0) * 1129242165;
        this.view = logger.get((byte) 0) * 912203227;
        this.value = logger.get(162732391) * -1252968975;
        this.text = logger.get(-6545180) * 1848715141;
        this.id = logger.get(1367924472) * 1708799714;
        this.name = logger.get(-1389828917) * 498370671;
        setName(1250634188);
    }

    public void onCreate(Logger logger, byte b) {
        try {
            this.key = logger.get((byte) 0) * 1129242165;
            this.view = logger.get((byte) 0) * 2040374065;
            this.value = logger.get(553449930) * -1252968975;
            this.text = logger.get(-407305103) * 1848715141;
            this.id = logger.get(-625688911) * -117155237;
            this.name = logger.get(-12837572) * 916558467;
            setName(1250634188);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "db.ay(" + ')');
        }
    }

    public int[] onCreate(int i, int i2, int i3) {
        if (!toString(i, i2, i3, -2083795912)) {
            return null;
        }
        return new int[]{((this.id * 292212682) - (650560576 * this.value)) + i2, ((this.name * -1116020451) - (-500280512 * this.text)) + i3};
    }

    public int[] run(int i, int i2, int i3) {
        if (!toString(i, i2, i3, -1651788798)) {
            return null;
        }
        return new int[]{((this.id * -1756269376) - (650560576 * this.value)) + i2, ((this.name * -1389163840) - (-500280512 * this.text)) + i3};
    }

    void setMaxVersion() {
    }

    void setName(int i) {
    }

    public Method toString(int $i0, int $i1) {
        if (!toString($i0, $i1, -1946749375)) {
            return null;
        }
        return new Method(-2059926499 * this.key, $i0 + ((650560576 * this.value) - (-236346678 * this.id)), ((this.text * -1791524563) - (this.name * 160496051)) + $i1);
    }

    public void toString(Arrays arrays) {
        if (-1332676195 * arrays.value > this.id * -430094893) {
            arrays.value = this.id * -1077700049;
        }
        if (845527457 * arrays.type < this.id * -430094893) {
            arrays.type = this.id * 869953971;
        }
        if (-668436401 * arrays.path > 1521798187 * this.name) {
            arrays.path = -521987227 * this.name;
        }
        if (arrays.title * -519973341 < this.name * -2123172491) {
            arrays.title = this.name * 198189371;
        }
    }

    public void toString(Arrays arrays, int i) {
        try {
            if (-1332676195 * arrays.value > this.id * -430094893) {
                arrays.value = this.id * -1077700049;
            }
            if (845527457 * arrays.type < this.id * -430094893) {
                arrays.type = this.id * 8966899;
            }
            if (-668436401 * arrays.path > this.name * 1521798187) {
                arrays.path = -521987227 * this.name;
            }
            if (arrays.title * -519973341 < this.name * 1521798187) {
                arrays.title = this.name * 1838538329;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "db.af(" + ')');
        }
    }

    public boolean toString(int $i0, int $i1, int i) {
        try {
            if (($i0 >> 6) == -430094893 * this.id) {
                if (1521798187 * this.name == ($i1 >> 6)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "db.an(" + ')');
        }
    }

    public boolean toString(int i, int $i1, int i2, int i3) {
        try {
            if (i >= this.key * -2059926499) {
                if (i >= (this.key * -2059926499) + (this.view * 140957137)) {
                    return false;
                }
                if (2090539793 * this.value == ($i1 >> 6)) {
                    if (this.text * 730380621 == (i2 >> 6)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "db.ad(" + ')');
        }
    }

    public int[] toString(int i, int i2, int i3, byte b) {
        try {
            if (!toString(i, i2, i3, -465633644)) {
                return null;
            }
            int[] $r1 = new int[2];
            $r1[0] = ((this.id * -1756269376) - (650560576 * this.value)) + i2;
            $r1[1] = ((this.name * -1389163840) - (-500280512 * this.text)) + i3;
            return $r1;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "db.aa(" + ')');
        }
    }

    public Method update(int $i0, int $i1, int i) {
        try {
            return !toString($i0, $i1, -772629657) ? null : new Method(-2059926499 * this.key, $i0 + ((650560576 * this.value) - (-1756269376 * this.id)), ((this.text * -500280512) - (this.name * -1389163840)) + $i1);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "db.ag(" + ')');
        }
    }

    public boolean update(int $i0, int $i1) {
        return ($i0 >> 6) == -430094893 * this.id && 1521798187 * this.name == ($i1 >> 6);
    }
}
