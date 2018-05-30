package p000;

import java.util.Collection;

/* compiled from: cb */
public class AssertionError extends Element {
    public static int name;
    static int[] value;
    final boolean val$val;

    public AssertionError(boolean z) {
        try {
            this.val$val = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "cb.<init>(" + ')');
        }
    }

    public static Long get(Class classR, int i, int i2, byte b) {
        if (!Args.add(classR, i, i2, 1101922623)) {
            return null;
        }
        Long $r3 = new Long();
        $r3.this$0 = -102972929 * Level.count;
        int $i0 = App.index * -820473409;
        i = $i0;
        $r3.count = $i0;
        $r3.next = ZStream.index[0];
        $r3.value = Level.index[0];
        $r3.length = TCharArrayList.index[0];
        $r3.data = TFloatArrayList.buffer[0];
        i = $r3.data * $r3.length;
        byte[] $r5 = Level.data[0];
        i2 = 0;
        while (i2 < DatabaseUtil.buffer.length) {
            try {
                if (DatabaseUtil.buffer[i2] != 0) {
                    int[] $r1 = DatabaseUtil.buffer;
                    $r1[i2] = $r1[i2] | -16777216;
                }
                i2++;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "cb.an(" + ')');
            }
        }
        $r3.size = new int[i];
        for (int $i3 = 0; $i3 < i; $i3++) {
            $r3.size[$i3] = DatabaseUtil.buffer[$r5[$i3] & (short) 255];
        }
        Page.add(805967750);
        return $r3;
    }

    static final void init(String str, int i) {
        boolean $z0 = true;
        if (str.equalsIgnoreCase("toggleroof")) {
            try {
                Main.this$0.f276i = !Main.this$0.f276i;
                KeyPair.toString(-1282338992);
                if (Main.this$0.f276i) {
                    Message.add(99, "", "Roofs are now all hidden", 882727226);
                } else {
                    Message.add(99, "", "Roofs will only be removed selectively", 895752747);
                }
            } catch (Throwable $r15) {
                throw StringBuilder.append($r15, "cb.bl(" + ')');
            }
        }
        if (str.equalsIgnoreCase("displayfps")) {
            client.command = !client.command;
        }
        if (str.equalsIgnoreCase("suspend")) {
            PingManager.getInstance((byte) -36).initialize(-534697703);
        }
        if (str.equalsIgnoreCase("models")) {
            LazyList.f12i = !LazyList.f12i;
        }
        if (str.equalsIgnoreCase("world")) {
            client.history = !client.history;
        }
        if (str.equalsIgnoreCase("ground")) {
            Server.f23b = !Server.f23b;
        }
        if (str.equalsIgnoreCase("minimap")) {
            client.f393i = !client.f393i;
        }
        if (str.equalsIgnoreCase("clickbox")) {
            Integer.f137s = !Integer.f137s;
            Message.add(99, "", "Clickbox Mode: " + (Integer.f137s ? "AABB" : "Legacy"), 1926239725);
        }
        if (str.equalsIgnoreCase("renderself")) {
            client.date = !client.date;
        }
        if (str.equalsIgnoreCase("mouseovertext")) {
            Settings.this$0.length = !Settings.this$0.length;
        }
        if (client.out * -2036797811 >= 2) {
            if (str.equalsIgnoreCase("showcoord")) {
                Session $r8 = State.this$0;
                if (State.this$0.f281i) {
                    $z0 = false;
                }
                $r8.f281i = $z0;
            }
            if (str.equalsIgnoreCase("fpson")) {
                client.command = true;
            }
            if (str.equalsIgnoreCase("fpsoff")) {
                client.command = false;
            }
            if (str.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (str.equalsIgnoreCase("clientdrop")) {
                GifDrawable.create(794724824);
            }
        }
        Object $r13 = Logger.add(R$string.count, client.this$0.key, (byte) -108);
        $r13.this$0.append(str.length() + 1, (byte) 31);
        $r13.this$0.add(str, (byte) 73);
        client.this$0.add((Config) $r13, (short) 255);
    }

    static void read(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        i = 256 - i11;
        i7 = -i7;
        int $i12 = i4;
        i12 = i2;
        while (i7 < 0) {
            i4 = (i3 >> 16) * i10;
            int $i13 = -i6;
            while ($i13 < 0) {
                try {
                    int $i14;
                    int $i15 = iArr2[(i12 >> 16) + i4];
                    if ($i15 != 0) {
                        int $i16 = iArr[$i12];
                        $i14 = $i12 + 1;
                        iArr[$i12] = ((((($i15 & 65280) * i11) + (($i16 & 65280) * i)) & 16711680) + ((((16711935 & $i15) * i11) + ((16711935 & $i16) * i)) & -16711936)) >> 8;
                    } else {
                        $i14 = $i12 + 1;
                    }
                    $i13++;
                    i12 += i8;
                    $i12 = $i14;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "cb.bh(" + ')');
                }
            }
            i3 += i9;
            $i12 += i5;
            i7++;
            i12 = i2;
        }
    }

    public static void write(Collection collection, byte b) {
        try {
            collection.add(Message.callback);
            collection.add(Message.cache);
            collection.add(Message.context);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cb.ax(" + ')');
        }
    }

    public int add(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, (short) 19198);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.this$0 * -1161455169 == 0 || coordinate2.this$0 * -1161455169 == 0) ? equals(coordinate, coordinate2, 929285638) : this.val$val ? coordinate.getKey(2041862168).compare(coordinate2.getKey(2114260499), 2100379818) : coordinate2.getKey(2132733526).compare(coordinate.getKey(1752841601), 1670797393);
    }

    int compare(Coordinate coordinate, Coordinate coordinate2, short s) {
        try {
            if (coordinate.this$0 * -1161455169 != 0) {
                if (coordinate2.this$0 * -1161455169 != 0) {
                    return this.val$val ? coordinate.getKey(2039949714).compare(coordinate2.getKey(1975895015), 2084204588) : coordinate2.getKey(1939619169).compare(coordinate.getKey(2097774158), 1543369174);
                }
            }
            return equals(coordinate, coordinate2, 849553953);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cb.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((Coordinate) obj, (Coordinate) obj2, (short) 8180);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "cb.compare(" + ')');
        }
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, (short) 21277);
    }

    public int parse(Object obj, Object obj2) {
        return compare((Coordinate) obj, (Coordinate) obj2, (short) 20212);
    }
}
