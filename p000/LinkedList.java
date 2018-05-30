package p000;

/* compiled from: hu */
public final class LinkedList extends ArrayMap {
    public static final int Theme_colorControlHighlight = 87;
    public static IllegalArgumentException this$0;
    int count;
    JSONArray data;
    int dir;
    int index;
    int items;
    int key;
    int length;
    int size;
    int state;
    boolean type;

    LinkedList(int $i0, int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            this.size = 0;
            this.count = 0;
            this.type = false;
            this.index = -1255057293 * $i0;
            this.dir = -1639848523 * i;
            this.items = 1380766693 * i2;
            this.length = 418656119 * i3;
            this.key = 169508685 * i4;
            this.state = -984794795 * (i6 + i5);
            $i0 = HyperlinkRecord.get(this.index * -1489695557, 1969438561).count * 1690052581;
            if ($i0 != -1) {
                this.type = false;
                this.data = AbstractBuffer.get($i0, 1320744511);
                return;
            }
            this.type = true;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hu.<init>(" + ')');
        }
    }

    static void init(Class classR, Class classR2, boolean z, int $i0, File file, byte b) {
        boolean $z1 = true;
        if (!Frame.f126i) {
            client.context.add((Preference) Contact.out, (byte) 24);
            client.context.getInstance(-1290553606).clear(false, 1017154570);
            Tools $r6 = Contact.out;
            if (client.context.token) {
                $z1 = false;
            }
            try {
                int $i3;
                $r6.f324s = $z1;
                Contact.f109y = -574615605 * $i0;
                file.get(674418497);
                GifDecoder.value = this$0.get(classR.getData("title.jpg", "", 286016249), 317718879);
                Contact.left = GifDecoder.value.next();
                if (((client.f397m * 1164415301) & CompositeInlineMap.INTENT_TO_ADD) != 0) {
                    Document.f115y = History.valueOf(classR2, "logo_deadman_mode", "", -1635050561);
                } else {
                    Document.f115y = History.valueOf(classR2, "logo", "", -1736220721);
                }
                Byte.f24p = History.valueOf(classR2, "titlebox", "", -1604722933);
                Contact.f102m = -1001030557 * Byte.f24p.data;
                Contact.f94a = History.valueOf(classR2, "titlebutton", "", -1617719548);
                CompassView.data = ArrayRealVector.toString(classR2, "runes", "", (short) 338);
                Contact.charset = ArrayRealVector.toString(classR2, "title_mute", "", (short) 338);
                Build$VERSION.value = History.valueOf(classR2, "options_radio_buttons,0", "", -1597232845);
                Contact.f107v = History.valueOf(classR2, "options_radio_buttons,4", "", -1791229397);
                Contact.f96c = History.valueOf(classR2, "options_radio_buttons,2", "", -1546214929);
                CharArray.f37a = History.valueOf(classR2, "options_radio_buttons,6", "", -1609126243);
                JGitText.f166i = -2115672453 * Build$VERSION.value.length;
                LruCache.length = Build$VERSION.value.data * 1432182895;
                FileUtils.f119p = new int[256];
                for ($i0 = 0; $i0 < 64; $i0++) {
                    FileUtils.f119p[$i0] = 262144 * $i0;
                }
                for ($i0 = 0; $i0 < 64; $i0++) {
                    FileUtils.f119p[$i0 + 64] = ($i0 * 1024) + 16711680;
                }
                for ($i0 = 0; $i0 < 64; $i0++) {
                    FileUtils.f119p[$i0 + Constants.f93X] = ($i0 * 4) + 16776960;
                }
                for ($i0 = 0; $i0 < 64; $i0++) {
                    FileUtils.f119p[$i0 + 192] = 16777215;
                }
                ZStream.size = new int[256];
                for ($i3 = 0; $i3 < 64; $i3++) {
                    ZStream.size[$i3] = $i3 * 1024;
                }
                for ($i0 = 0; $i0 < 64; $i0++) {
                    ZStream.size[$i0 + 64] = ($i0 * 4) + 65280;
                }
                for ($i3 = 0; $i3 < 64; $i3++) {
                    ZStream.size[$i3 + Constants.f93X] = (262144 * $i3) + 65535;
                }
                for ($i3 = 0; $i3 < 64; $i3++) {
                    ZStream.size[$i3 + 192] = 16777215;
                }
                Frame.f127p = new int[256];
                for ($i0 = 0; $i0 < 64; $i0++) {
                    Frame.f127p[$i0] = $i0 * 4;
                }
                for ($i0 = 0; $i0 < 64; $i0++) {
                    Frame.f127p[$i0 + 64] = (262144 * $i0) + 255;
                }
                for ($i0 = 0; $i0 < 64; $i0++) {
                    Frame.f127p[$i0 + Constants.f93X] = ($i0 * 1024) + 16711935;
                }
                for (int $i2 = 0; $i2 < 64; $i2++) {
                    Frame.f127p[$i2 + 192] = 16777215;
                }
                Build$VERSION.size = new int[256];
                Contact.value = new int[32768];
                Contact.name = new int[32768];
                System.read(null, 488305351);
                Contact.key = new int[32768];
                AESCipher.state = new int[32768];
                if (z) {
                    Contact.text = "";
                    Contact.data = "";
                }
                Page.f222n = 0;
                Context.value = "";
                Contact.f106s = true;
                Contact.f101i = false;
                Contact.f95b = -382493535;
                Contact.f104p = -1786471745;
                float $f0 = Contact.f104p * -1519423211;
                float f = $f0;
                Contact.f99g = (float) $f0;
                if (Main.this$0.length) {
                    ByteVector.read(2, 450155103);
                } else {
                    TIntArrayList.read(2, client.header, "scape main", "", 255, false, -734572674);
                }
                Document.add(false, -840781090);
                Frame.f126i = true;
                Contact.state = -17113271 * (((-1946576867 * Vec2.this$0) - 765) / 2);
                Contact.this$0 = (-332095827 * Contact.state) + 447559442;
                Main.f207x = (-256483487 * Contact.this$0) + 1370065220;
            } catch (RuntimeException $r14) {
                throw StringBuilder.append($r14, "hu.ad(" + ')');
            }
        } else if (4 == $i0) {
            Path $r5 = client.context.getInstance(-1290553606).add(1, -939872729);
            $r5.add("", (byte) -20);
            $r5.append((byte) 2);
            Contact.f109y = -574615605 * $i0;
        }
    }

    public static synchronized long toString(int i) {
        long $l1;
        synchronized (hu.class) {
            try {
                $l1 = System.currentTimeMillis();
                if ($l1 < Format.value * 7926980322832601301L) {
                    Format.blocks += ((Format.value * 7926980322832601301L) - $l1) * -2291085443158564657L;
                }
                Format.value = -2291242065625618307L * $l1;
                $l1 += -5630690095713884625L * Format.blocks;
            } catch (RuntimeException $r0) {
                throw StringBuilder.append($r0, "hu.af(" + ')');
            }
        }
        return $l1;
    }

    protected final Integer add() {
        Attribute $r1 = HyperlinkRecord.get(-1489695557 * this.index, 1941095890);
        Integer $r2 = !this.type ? $r1.get(-318902705 * this.size, -2127785113) : $r1.get(-1, -1915077758);
        return $r2 == null ? null : $r2;
    }

    final void add(int i) {
        if (!this.type) {
            this.count += i * 1489789375;
            while (this.count * -544960961 > this.data.buffer[this.size * -318902705]) {
                this.count -= this.data.buffer[this.size * -318902705] * 1489789375;
                this.size -= 1807325009;
                if (this.size * -318902705 >= this.data.size.length) {
                    this.type = true;
                    break;
                }
            }
        }
    }

    final void add(int i, int i2) {
        try {
            if (!this.type) {
                this.count += i * 1489789375;
                do {
                    if (this.count * -544960961 > this.data.buffer[this.size * -318902705]) {
                        this.count -= this.data.buffer[this.size * -318902705] * 1489789375;
                        this.size -= 1807325009;
                    } else {
                        return;
                    }
                } while (this.size * -318902705 < this.data.size.length);
                this.type = true;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hu.af(" + ')');
        }
    }

    final void clear(int i) {
        if (!this.type) {
            this.count += i * 1489789375;
            while (this.count * -544960961 > this.data.buffer[this.size * -318902705]) {
                this.count -= this.data.buffer[this.size * -318902705] * 1489789375;
                this.size -= 1807325009;
                if (this.size * -318902705 >= this.data.size.length) {
                    this.type = true;
                    break;
                }
            }
        }
    }

    protected final Integer clone() {
        Attribute $r1 = HyperlinkRecord.get(-1489695557 * this.index, 2054832255);
        Integer $r2 = !this.type ? $r1.get(-318902705 * this.size, -2112203726) : $r1.get(-1, -1749645452);
        return $r2 == null ? null : $r2;
    }

    protected final Integer read() {
        try {
            Attribute $r1 = HyperlinkRecord.get(-1489695557 * this.index, 1998880026);
            Integer $r2 = !this.type ? $r1.get(-318902705 * this.size, -1724415577) : $r1.get(-1, -2061204269);
            return $r2 == null ? null : $r2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hu.ac(" + ')');
        }
    }

    protected final Integer remove() {
        Attribute $r1 = HyperlinkRecord.get(791163697 * this.index, 2130609317);
        Integer $r2 = !this.type ? $r1.get(1358930600 * this.size, -1899177786) : $r1.get(-1, -2068181611);
        return $r2 == null ? null : $r2;
    }

    final void remove(int i) {
        if (!this.type) {
            this.count += i * 1489789375;
            while (this.count * -296122693 > this.data.buffer[this.size * -876274479]) {
                this.count -= this.data.buffer[this.size * -318902705] * 1489789375;
                this.size += 723322637;
                if (-1137283319 * this.size >= this.data.size.length) {
                    this.type = true;
                    break;
                }
            }
        }
    }

    final void toArray(int i) {
        if (!this.type) {
            this.count += i * 1489789375;
            while (this.count * -1498366788 > this.data.buffer[this.size * -318902705]) {
                this.count -= this.data.buffer[this.size * -544624823] * 1489789375;
                this.size -= 1807325009;
                if (-835801405 * this.size >= this.data.size.length) {
                    this.type = true;
                    break;
                }
            }
        }
    }

    protected final Integer write() {
        Attribute $r1 = HyperlinkRecord.get(1349797447 * this.index, 1879761513);
        Integer $r2 = !this.type ? $r1.get(-318902705 * this.size, -2094668301) : $r1.get(-1, -1737966768);
        return $r2 == null ? null : $r2;
    }
}
