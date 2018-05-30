package p000;

import java.lang.reflect.Array;

/* compiled from: gz */
public class Rect {
    static final int HINT_CONTEXT_CAR_HOME = 2;
    static final long INT_MASK = 4294967295L;
    static final int QUIET_HOURS_DEFAULT_END_MINUTE = 0;
    static final int WEEKS_BUFFER = 1;
    public final Identifier data;
    final Scalar length;
    public final IOUtils this$0;
    int type;

    Rect(Scalar scalar) {
        try {
            this.type = 0;
            this.length = scalar;
            this.this$0 = new IOUtils(scalar);
            this.data = new Identifier(scalar);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gz.<init>(" + ')');
        }
    }

    static final void add(String str) {
        Config $r4 = Logger.add(R$string.other, client.this$0.key, (byte) 12);
        $r4.this$0.append(Record.toString(str, -1724811214), (byte) 31);
        $r4.this$0.add(str, (byte) -104);
        client.this$0.add($r4, (short) 255);
    }

    static final void contains(String str) {
        Message.add(30, "", str, 731695695);
    }

    static final void decode(String str) {
        Config $r4 = Logger.add(R$string.$assertionsDisabled, client.this$0.key, (byte) -64);
        $r4.this$0.append(Record.toString(str, 175632794), (byte) 31);
        $r4.this$0.add(str, (byte) 84);
        client.this$0.add($r4, (short) 255);
    }

    static final void delete(int i) {
        client.result = client.logger * -1301148863;
    }

    static final void dial(String str) {
        Locale.append(str + R$id.appName, (byte) 4);
    }

    static final void execute(String str) {
        Locale.append(R$id.email + str + R$id.subject, (byte) 4);
    }

    static final void init() {
        Locale.append(R$id.versionName, (byte) 4);
    }

    static void init(boolean z, int i) {
        try {
            client.context.getInstance(-1290553606).add(0, -2043775119);
            Contact.id = R$id.scheme;
            Contact.last = R$id.digest;
            Contact.f98e = R$id.random;
            Contact.f109y = -1149231210;
            if (z) {
                Contact.data = "";
            }
            Method.init(-89351019);
            IllegalStateException.update(-1772896823);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gz.ae(" + ')');
        }
    }

    static final void onBindViewHolder(String str) {
        Locale.append(str + R$id.appName, (byte) 4);
    }

    static final void parse(String str) {
        Config $r4 = Logger.add(R$string.$assertionsDisabled, client.this$0.key, (byte) -46);
        $r4.this$0.append(Record.toString(str, -874621531), (byte) 31);
        $r4.this$0.add(str, (byte) -97);
        client.this$0.add($r4, (short) 255);
    }

    static final void parse(boolean z, Handler handler, byte b) {
        client.offset = z;
        int $i3;
        int $i4;
        int $i5;
        int $i6;
        if (client.offset) {
            int $i1 = handler.getInstance(-1247901594);
            int $i2 = handler.getName(-1005835619);
            z = handler.read(-1507106888) == 1;
            $i3 = handler.get(1832082374);
            handler.debug(1565299499);
            for ($i4 = 0; $i4 < 4; $i4++) {
                for ($i5 = 0; $i5 < 13; $i5++) {
                    for ($i6 = 0; $i6 < 13; $i6++) {
                        if (1 == handler.add(1, (byte) 6)) {
                            client.min[$i4][$i5][$i6] = handler.add(26, (byte) -85);
                        } else {
                            client.min[$i4][$i5][$i6] = -1;
                        }
                    }
                }
            }
            handler.create(1885733558);
            ByteBufferList.length = (int[][]) Array.newInstance(Integer.TYPE, new int[]{$i3, 4});
            for ($i4 = 0; $i4 < $i3; $i4++) {
                for ($i5 = 0; $i5 < 4; $i5++) {
                    ByteBufferList.length[$i4][$i5] = handler.size(1166204191);
                }
            }
            BoundingBox.length = new int[$i3];
            BoundingBox.offset = new int[$i3];
            SoapEnvelope.length = new int[$i3];
            KeyPair.length = new byte[$i3][];
            Element.name = new byte[$i3][];
            $i5 = 0;
            for ($i3 = 0; $i3 < 4; $i3++) {
                for ($i4 = 0; $i4 < 13; $i4++) {
                    for ($i6 = 0; $i6 < 13; $i6++) {
                        int $i7 = client.min[$i3][$i4][$i6];
                        if ($i7 != -1) {
                            int $i8 = ((($i7 >> 3) & 2047) / 8) + (((($i7 >> 14) & 1023) / 8) << 8);
                            for ($i7 = 0; $i7 < $i5; $i7++) {
                                if (BoundingBox.length[$i7] == $i8) {
                                    $i8 = -1;
                                    break;
                                }
                            }
                            if ($i8 != -1) {
                                BoundingBox.length[$i5] = $i8;
                                $i7 = ($i8 >> 8) & 255;
                                $i8 &= 255;
                                BoundingBox.offset[$i5] = Vec2.size.get("m" + $i7 + "_" + $i8, -553729438);
                                SoapEnvelope.length[$i5] = Vec2.size.get("l" + $i7 + "_" + $i8, -85226279);
                                $i5++;
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            Volume.init($i1, $i2, !z, 522848037);
            return;
        }
        try {
            $i1 = handler.get(772750313);
            $i2 = handler.get(860117724);
            $i3 = handler.get(-336515255);
            ByteBufferList.length = (int[][]) Array.newInstance(Integer.TYPE, new int[]{$i3, 4});
            for ($i4 = 0; $i4 < $i3; $i4++) {
                for ($i5 = 0; $i5 < 4; $i5++) {
                    ByteBufferList.length[$i4][$i5] = handler.size(2047641470);
                }
            }
            BoundingBox.length = new int[$i3];
            BoundingBox.offset = new int[$i3];
            SoapEnvelope.length = new int[$i3];
            KeyPair.length = new byte[$i3][];
            Element.name = new byte[$i3][];
            z = false;
            if ((48 == $i1 / 8 || $i1 / 8 == 49) && $i2 / 8 == 48) {
                z = true;
            }
            if (48 == $i1 / 8 && 148 == $i2 / 8) {
                z = true;
            }
            $i4 = 0;
            $i3 = ($i1 - 6) / 8;
            while ($i3 <= ($i1 + 6) / 8) {
                $i5 = ($i2 - 6) / 8;
                while ($i5 <= ($i2 + 6) / 8) {
                    $i6 = ($i3 << 8) + $i5;
                    if (!(z && (49 == $i5 || 149 == $i5 || $i5 == 147 || $i3 == 50 || ($i3 == 49 && $i5 == 47)))) {
                        BoundingBox.length[$i4] = $i6;
                        BoundingBox.offset[$i4] = Vec2.size.get("m" + $i3 + "_" + $i5, 105764467);
                        SoapEnvelope.length[$i4] = Vec2.size.get("l" + $i3 + "_" + $i5, -2086387647);
                        $i4++;
                    }
                    $i5++;
                }
                $i3++;
            }
            Volume.init($i1, $i2, true, 774285674);
        } catch (Throwable $r10) {
            throw StringBuilder.append($r10, "gz.dw(" + ')');
        }
    }

    static final void parseTags(String str) {
        Message.add(30, "", str, 622427232);
    }

    static final void populateView() {
        Locale.append(R$id.versionName, (byte) 4);
    }

    static final void send(String str) {
        Locale.append(R$id.PHONE_MODEL + str + R$id.ANDROID_VERSION, (byte) 4);
    }

    static final void sendError(String str) {
        Locale.append(R$id.PHONE_MODEL + str + R$id.ANDROID_VERSION, (byte) 4);
    }

    static final void sendSms(String str) {
        Message.add(30, "", str, 1486363287);
    }

    static final void setDueDate(String str) {
        Message.add(30, "", str, 2056955016);
    }

    static final void show() {
        Locale.append(R$id.versionName, (byte) 4);
    }

    static final void startWebAuth(String str) {
        Locale.append(R$id.PHONE_MODEL + str + R$id.ANDROID_VERSION, (byte) 4);
    }

    static final int toString(int i, int i2, byte b) {
        try {
            return (((((State.getData(i - 1, i2 - 1, 2110090978) + State.getData(i + 1, i2 - 1, 712815219)) + State.getData(i - 1, i2 + 1, 604941577)) + State.getData(i + 1, i2 + 1, 1799407102)) / 16) + ((((State.getData(i - 1, i2, 65167017) + State.getData(i + 1, i2, 1702234808)) + State.getData(i, i2 - 1, 1742649007)) + State.getData(i, i2 + 1, 1039480694)) / 8)) + (State.getData(i, i2, -907323505) / 4);
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "gz.am(" + ')');
        }
    }

    static void toString(int i, int i2) {
        i2 = 0;
        Region $r2 = (Region) Region.value.get((long) i);
        if ($r2 != null) {
            while (i2 < $r2.size.length) {
                try {
                    $r2.size[i2] = -1;
                    $r2.data[i2] = 0;
                    i2++;
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "gz.aa(" + ')');
                }
            }
        }
    }

    final boolean add() {
        return !this.this$0.encode(553370568) ? this.this$0.get(1604799329) >= 200 && 1 != 1313514535 * client.year : true;
    }

    final boolean add(int i) {
        try {
            return !this.this$0.encode(553370568) ? this.this$0.get(1226565100) >= 200 && 1 != 1313514535 * client.year : true;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gz.ab(" + ')');
        }
    }

    final boolean add(JSONObject jSONObject) {
        Pair $r4 = (Pair) this.this$0.copy(jSONObject, 1313580001);
        return $r4 != null && $r4.write(-510830032);
    }

    final boolean add(JSONObject jSONObject, byte b) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return this.data.get(jSONObject, (byte) 0);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gz.as(" + ')');
        }
    }

    final void append() {
        Float $r4 = (Float) this.this$0.value.next();
        while ($r4 != null) {
            if (((long) ($r4.value * 81494893)) < (LinkedList.toString(121524611) / 1000) - 5) {
                if ($r4.this$0 > (short) 0) {
                    Message.add(5, "", $r4.data + R$id.buffer, 1885718555);
                }
                if ($r4.this$0 == (short) 0) {
                    Message.add(5, "", $r4.data + R$id.pos, 1342231914);
                }
                $r4.next();
            }
            $r4 = (Float) this.this$0.value.hasNext();
        }
    }

    final boolean check() {
        return !this.data.encode(553370568) ? this.data.get(1795791128) >= 100 && 1 != client.year * 1313514535 : true;
    }

    final boolean contains() {
        return !this.data.encode(553370568) ? this.data.get(1143425753) >= 100 && 1 != client.year * 1313514535 : true;
    }

    boolean contains(int i) {
        try {
            return 2 == this.type * -1211745851;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gz.af(" + ')');
        }
    }

    final boolean contains(JSONObject jSONObject) {
        return jSONObject == null ? false : this.data.get(jSONObject, (byte) 0);
    }

    final void doInBackground(String str) {
        if (str != null) {
            JSONObject $r8 = new JSONObject(str, this.length);
            if ($r8.get(-1069759578)) {
                if (this.data.toString($r8, (short) 6591)) {
                    Rect.delete(1594300479);
                    Config $r6 = Logger.add(R$string.id, client.this$0.key, (byte) -5);
                    $r6.this$0.append(Record.toString(str, 938525269), (byte) 31);
                    $r6.this$0.add(str, (byte) 77);
                    client.this$0.add($r6, (short) 255);
                }
                CSVReader.get(2111214471);
            }
        }
    }

    final boolean encode() {
        return !this.data.encode(553370568) ? this.data.get(2121450542) >= 100 && 1 != client.year * -2045220813 : true;
    }

    final boolean encode(int i) {
        try {
            return !this.data.encode(553370568) ? this.data.get(1445565575) >= 100 && 1 != client.year * 1313514535 : true;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gz.ah(" + ')');
        }
    }

    final boolean equals() {
        return !this.this$0.encode(553370568) ? this.this$0.get(2129925301) >= -125051962 && 1 != 1313514535 * client.year : true;
    }

    final boolean equals(JSONObject jSONObject) {
        Pair $r4 = (Pair) this.this$0.copy(jSONObject, 345263677);
        return $r4 != null && $r4.write(882260497);
    }

    final void get(String $r1) {
        if ($r1 != null) {
            JSONObject $r2 = new JSONObject($r1, this.length);
            if ($r2.get(-1069759578)) {
                if (encode(-151840734)) {
                    Locale.append(R$id.field, (byte) 4);
                } else if (File.this$0.type.equals($r2)) {
                    Locale.append(R$id.ref, (byte) 4);
                } else if (add($r2, (byte) -37)) {
                    Locale.append($r1 + R$id.year, (byte) 4);
                } else if (toString($r2, false, -889911197)) {
                    Exception.execute($r1, -528627774);
                } else {
                    NativeUint8Array.init($r1, 1505604662);
                }
            }
        }
    }

    final void get(String $r1, int i) {
        if ($r1 != null) {
            try {
                JSONObject $r2 = new JSONObject($r1, this.length);
                if ($r2.get(-1069759578)) {
                    if (encode(-151840734)) {
                        Locale.append(R$id.field, (byte) 4);
                    } else if (File.this$0.type.equals($r2)) {
                        Locale.append(R$id.ref, (byte) 4);
                    } else if (add($r2, (byte) -60)) {
                        Locale.append($r1 + R$id.year, (byte) 4);
                    } else if (toString($r2, false, -889911197)) {
                        Exception.execute($r1, -1713474832);
                    } else {
                        NativeUint8Array.init($r1, 1756705279);
                    }
                }
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "gz.aw(" + ')');
            }
        }
    }

    final void getItemOffsets() {
        this.type = -539960051;
    }

    final void init(String $r1) {
        if ($r1 != null) {
            JSONObject $r2 = new JSONObject($r1, this.length);
            if ($r2.get(-1069759578)) {
                if (add(989517052)) {
                    Transport.load(225856114);
                } else if (File.this$0.type.equals($r2)) {
                    Locale.append(R$id.info, (byte) 4);
                } else if (toString($r2, false, -889911197)) {
                    CompassView.init($r1, -981234186);
                } else if (add($r2, (byte) -7)) {
                    Intent.send($r1, 1808769067);
                } else {
                    SparseFieldVector.add($r1, 334261811);
                }
            }
        }
    }

    final void init(String $r1, byte b) {
        if ($r1 != null) {
            JSONObject $r5 = new JSONObject($r1, this.length);
            if ($r5.get(-1069759578)) {
                if (add(1480442510)) {
                    Transport.load(1026426701);
                } else if (File.this$0.type.equals($r5)) {
                    Locale.append(R$id.info, (byte) 4);
                } else if (toString($r5, false, -889911197)) {
                    CompassView.init($r1, -1096652039);
                } else {
                    try {
                        if (add($r5, (byte) -95)) {
                            Intent.send($r1, 1743105493);
                            return;
                        }
                        SparseFieldVector.add($r1, 334261811);
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "gz.ar(" + ')');
                    }
                }
            }
        }
    }

    final void initialize() {
        this.type = 0;
        this.this$0.set(-1604300578);
        this.data.set(-247556138);
    }

    final void load(String str) {
        if (str != null) {
            JSONObject $r8 = new JSONObject(str, this.length);
            if ($r8.get(-1069759578)) {
                if (this.data.toString($r8, (short) 8126)) {
                    Rect.delete(-626235645);
                    Config $r6 = Logger.add(R$string.id, client.this$0.key, (byte) -10);
                    $r6.this$0.append(Record.toString(str, -1246937055), (byte) 31);
                    $r6.this$0.add(str, (byte) 62);
                    client.this$0.add($r6, (short) 255);
                }
                CSVReader.get(2115918320);
            }
        }
    }

    final void load(String str, int i) {
        if (str != null) {
            try {
                JSONObject $r2 = new JSONObject(str, this.length);
                if ($r2.get(-1069759578)) {
                    if (this.data.toString($r2, (short) 1956)) {
                        Rect.delete(-917513652);
                        Config $r8 = Logger.add(R$string.id, client.this$0.key, (byte) -37);
                        $r8.this$0.append(Record.toString(str, -751178536), (byte) 31);
                        $r8.this$0.add(str, (byte) -10);
                        client.this$0.add($r8, (short) 255);
                    }
                    CSVReader.get(2115284625);
                }
            } catch (RuntimeException $r10) {
                throw StringBuilder.append($r10, "gz.ao(" + ')');
            }
        }
    }

    final boolean parse(JSONObject jSONObject, boolean $z0) {
        return jSONObject == null ? false : jSONObject.equals(File.this$0.type) ? true : this.this$0.write(jSONObject, $z0, (byte) -14);
    }

    final void read() {
        Float $r4 = (Float) this.this$0.value.next();
        while ($r4 != null) {
            if (((long) ($r4.value * 81494893)) < (LinkedList.toString(1382988276) / 1000) - 5) {
                if ($r4.this$0 > (short) 0) {
                    Message.add(5, "", $r4.data + R$id.buffer, 1796080401);
                }
                if ($r4.this$0 == (short) 0) {
                    Message.add(5, "", $r4.data + R$id.pos, 1965019716);
                }
                $r4.next();
            }
            $r4 = (Float) this.this$0.value.hasNext();
        }
    }

    final void read(byte b) {
        try {
            Float $r4 = (Float) this.this$0.value.next();
            while ($r4 != null) {
                if (((long) ($r4.value * 81494893)) < (LinkedList.toString(714092111) / 1000) - 5) {
                    if ($r4.this$0 > (short) 0) {
                        Message.add(5, "", $r4.data + R$id.buffer, 1764615349);
                    }
                    if ($r4.this$0 == (short) 0) {
                        Message.add(5, "", $r4.data + R$id.pos, 1184456806);
                    }
                    $r4.next();
                }
                $r4 = (Float) this.this$0.value.hasNext();
            }
        } catch (Throwable $r8) {
            throw StringBuilder.append($r8, "gz.aa(" + ')');
        }
    }

    final void resize() {
        this.type = 0;
        this.this$0.set(-1397536257);
        this.data.set(-898090975);
    }

    final void save() {
        this.type = -1121700566;
    }

    final boolean save(JSONObject jSONObject, boolean $z0) {
        return jSONObject == null ? false : jSONObject.equals(File.this$0.type) ? true : this.this$0.write(jSONObject, $z0, (byte) -20);
    }

    final void set() {
        this.type = 0;
        this.this$0.set(-157281489);
        this.data.set(-403268919);
    }

    final void set(byte b) {
        try {
            this.type = 0;
            this.this$0.set(-33642786);
            this.data.set(-2120097622);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gz.ag(" + ')');
        }
    }

    final void set(int i) {
        try {
            this.type = -539960051;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gz.ad(" + ')');
        }
    }

    final void set(Logger logger, int i) {
        this.this$0.write(logger, i, -1868213741);
        this.type = -1079920102;
        Color.toString(1068324830);
    }

    final void set(Logger logger, int i, byte b) {
        try {
            this.this$0.write(logger, i, -1868213741);
            this.type = -1079920102;
            Color.toString(-216491289);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "gz.an(" + ')');
        }
    }

    final void set(String $r1) {
        if ($r1 != null) {
            JSONObject $r4 = new JSONObject($r1, this.length);
            if (!$r4.get(-1069759578)) {
                return;
            }
            if (encode(-151840734)) {
                Locale.append(R$id.field, (byte) 4);
            } else if (File.this$0.type.equals($r4)) {
                Locale.append(R$id.ref, (byte) 4);
            } else if (add($r4, (byte) -65)) {
                Locale.append($r1 + R$id.year, (byte) 4);
            } else if (toString($r4, false, -889911197)) {
                Exception.execute($r1, 147836499);
            } else {
                NativeUint8Array.init($r1, 2111467445);
            }
        }
    }

    final boolean set(JSONObject jSONObject) {
        return jSONObject == null ? false : this.data.get(jSONObject, (byte) 0);
    }

    final boolean set(JSONObject jSONObject, boolean $z0) {
        return jSONObject == null ? false : jSONObject.equals(File.this$0.type) ? true : this.this$0.write(jSONObject, $z0, (byte) -103);
    }

    final void setBounds() {
        this.type = 1081674321;
    }

    final void show(String $r1) {
        if ($r1 != null) {
            JSONObject $r2 = new JSONObject($r1, this.length);
            if (!$r2.get(-1069759578)) {
                return;
            }
            if (add(1212646888)) {
                Transport.load(-1649886606);
            } else if (File.this$0.type.equals($r2)) {
                Locale.append(R$id.info, (byte) 4);
            } else if (toString($r2, false, -889911197)) {
                CompassView.init($r1, -1386585350);
            } else if (add($r2, (byte) -46)) {
                Intent.send($r1, 2116261033);
            } else {
                SparseFieldVector.add($r1, 334261811);
            }
        }
    }

    boolean size() {
        return 2 == this.type * -1211745851;
    }

    final void toString(String str) {
        if (str != null) {
            JSONObject $r2 = new JSONObject(str, this.length);
            if ($r2.get(-1069759578)) {
                if (this.this$0.toString($r2, (short) 25605)) {
                    Rect.delete(-36660238);
                    Config $r8 = Logger.add(R$string.to, client.this$0.key, (byte) -43);
                    $r8.this$0.append(Record.toString(str, -1389571052), (byte) 31);
                    $r8.this$0.add(str, (byte) -118);
                    client.this$0.add($r8, (short) 255);
                }
                Color.toString(772502736);
            }
        }
    }

    final void toString(String $r1, int i) {
        if ($r1 != null) {
            JSONObject $r11 = new JSONObject($r1, this.length);
            if ($r11.get(-1069759578)) {
                try {
                    if (this.this$0.toString($r11, (short) 10609)) {
                        Rect.delete(1297946345);
                        Config $r6 = Logger.add(R$string.to, client.this$0.key, (byte) -78);
                        $r6.this$0.append(Record.toString($r1, -1368412315), (byte) 31);
                        $r6.this$0.add($r1, Byte.MIN_VALUE);
                        client.this$0.add($r6, (short) 255);
                    }
                    Color.toString(168436470);
                } catch (RuntimeException $r8) {
                    throw StringBuilder.append($r8, "gz.ak(" + ')');
                }
            }
        }
    }

    final boolean toString(JSONObject jSONObject) {
        Pair $r4 = (Pair) this.this$0.copy(jSONObject, 1598947119);
        return $r4 != null && $r4.write(1058343934);
    }

    final boolean toString(JSONObject jSONObject, byte b) {
        try {
            Pair $r4 = (Pair) this.this$0.copy(jSONObject, -368924873);
            if ($r4 != null) {
                if ($r4.write(1301928706)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "gz.ax(" + ')');
        }
    }

    final boolean toString(JSONObject jSONObject, boolean $z0, int i) {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.equals(File.this$0.type)) {
            return true;
        }
        try {
            return this.this$0.write(jSONObject, $z0, (byte) -66);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "gz.ay(" + ')');
        }
    }

    final void update(String str) {
        if (str != null) {
            JSONObject $r8 = new JSONObject(str, this.length);
            if ($r8.get(-1069759578)) {
                if (this.data.toString($r8, (short) 16358)) {
                    Rect.delete(-1016643804);
                    Config $r6 = Logger.add(R$string.id, client.this$0.key, (byte) -67);
                    $r6.this$0.append(Record.toString(str, 1770407559), (byte) 31);
                    $r6.this$0.add(str, (byte) -24);
                    client.this$0.add($r6, (short) 255);
                }
                CSVReader.get(2103219745);
            }
        }
    }

    final void write() {
        Float $r4 = (Float) this.this$0.value.next();
        while ($r4 != null) {
            if (((long) ($r4.value * 81494893)) < (LinkedList.toString(2050167031) / 1000) - 5) {
                if ($r4.this$0 > (short) 0) {
                    Message.add(5, "", $r4.data + R$id.buffer, 2125891970);
                }
                if ($r4.this$0 == (short) 0) {
                    Message.add(5, "", $r4.data + R$id.pos, 1868930788);
                }
                $r4.next();
            }
            $r4 = (Float) this.this$0.value.hasNext();
        }
    }

    final void write(String $r1) {
        if ($r1 != null) {
            JSONObject $r3 = new JSONObject($r1, this.length);
            if (!$r3.get(-1069759578)) {
                return;
            }
            if (encode(-151840734)) {
                Locale.append(R$id.field, (byte) 4);
            } else if (File.this$0.type.equals($r3)) {
                Locale.append(R$id.ref, (byte) 4);
            } else if (add($r3, (byte) -65)) {
                Locale.append($r1 + R$id.year, (byte) 4);
            } else if (toString($r3, false, -889911197)) {
                Exception.execute($r1, -1171084682);
            } else {
                NativeUint8Array.init($r1, 1467955107);
            }
        }
    }

    final boolean write(JSONObject jSONObject, boolean $z0) {
        return jSONObject == null ? false : jSONObject.equals(File.this$0.type) ? true : this.this$0.write(jSONObject, $z0, (byte) -119);
    }
}
