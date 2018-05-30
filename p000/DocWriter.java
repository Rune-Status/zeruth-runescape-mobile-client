package p000;

/* compiled from: eh */
public class DocWriter implements Scanner {
    static final int FLAGS_DEFAULT_TYPE_STRING = 256;
    static final int GT = 5;
    static final String TAB = "random.dat";
    static FileInfo this$0;

    static int add(int $i1, CharSequence charSequence, boolean $z0, byte b) {
        int[] $r1;
        int $i2;
        boolean $z1 = false;
        if ($i1 >= 2000) {
            $i1 -= 1000;
            $r1 = XMLParser.this$0;
            $i2 = XMLParser.type - -1194553915;
            XMLParser.type = $i2;
            try {
                $i2 = $r1[$i2 * 537618701];
                System $r2 = ArrayList.get($i2, 725613859);
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "eh.aa(" + ')');
            }
        }
        $r2 = $z0 ? Constants.data : XMLParser.state;
        $i2 = -1;
        if (1000 == $i1) {
            XMLParser.type -= -483248364;
            $r2.f285b = -1299204119 * XMLParser.this$0[XMLParser.type * 537618701];
            $r2.f299w = XMLParser.this$0[(XMLParser.type * 537618701) + 1] * 922175265;
            $r2.f298s = -1859331853 * XMLParser.this$0[(XMLParser.type * 537618701) + 2];
            $r2.f301y = 1800206059 * XMLParser.this$0[(XMLParser.type * 537618701) + 3];
            client.add($r2, (byte) 34);
            client.context.set($r2, (short) -15276);
            if (-1 != $i2) {
                if ($r2.name * -128421835 == 0) {
                    Model.write(Float.size[$i2 >> 16], $r2, false, (byte) -104);
                    return 1;
                }
            }
        } else if ($i1 == 1001) {
            XMLParser.type -= -483248364;
            $r2.f300x = 507881715 * XMLParser.this$0[XMLParser.type * 537618701];
            $r2.f288e = -14232227 * XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r2.f295p = XMLParser.this$0[(XMLParser.type * 537618701) + 2] * -1778589005;
            $r2.f290g = XMLParser.this$0[(XMLParser.type * 537618701) + 3] * -186773411;
            client.add($r2, (byte) 58);
            client.context.set($r2, (short) -22971);
            if ($i2 != -1) {
                if ($r2.name * -128421835 == 0) {
                    Model.write(Float.size[$i2 >> 16], $r2, false, (byte) -45);
                    return 1;
                }
            }
        } else if ($i1 == 1003) {
            $r1 = XMLParser.this$0;
            $i1 = XMLParser.type - -1194553915;
            XMLParser.type = $i1;
            if ($r1[$i1 * 537618701] == 1) {
                $z1 = true;
            }
            boolean $z02 = $r2.start;
            if ($z02 != $z1) {
                $r2.start = $z1;
                client.add($r2, (byte) 58);
                return 1;
            }
        } else if (1005 == $i1) {
            $r1 = XMLParser.this$0;
            $i1 = XMLParser.type - -1194553915;
            XMLParser.type = $i1;
            if ($r1[$i1 * 537618701] == 1) {
                $z1 = true;
            }
            $r2.f294n = $z1;
            return 1;
        } else if (1006 != $i1) {
            return 2;
        } else {
            $r1 = XMLParser.this$0;
            $i1 = XMLParser.type - -1194553915;
            XMLParser.type = $i1;
            if ($r1[$i1 * 537618701] == 1) {
                $z1 = true;
            }
            $r2.f291h = $z1;
        }
        return 1;
    }

    static void write(int i, int i2, int i3, boolean z, int i4, boolean z2, int i5) {
        if (i < i2) {
            i5 = (i2 + i) / 2;
            ByteBuffer $r1 = Short.value[i5];
            Short.value[i5] = Short.value[i2];
            Short.value[i2] = $r1;
            int $i5 = i;
            i5 = i;
            while ($i5 < i2) {
                int $i6;
                if (Diff.read(Short.value[$i5], $r1, i3, z, i4, z2, 944441159) <= 0) {
                    ByteBuffer $r3 = Short.value[$i5];
                    try {
                        Short.value[$i5] = Short.value[i5];
                        $i6 = i5 + 1;
                        Short.value[i5] = $r3;
                    } catch (RuntimeException $r5) {
                        throw StringBuilder.append($r5, "eh.ag(" + ')');
                    }
                }
                $i6 = i5;
                $i5++;
                i5 = $i6;
            }
            Short.value[i2] = Short.value[i5];
            Short.value[i5] = $r1;
            DocWriter.write(i, i5 - 1, i3, z, i4, z2, 1235124032);
            DocWriter.write(i5 + 1, i2, i3, z, i4, z2, 254359192);
        }
    }

    public FileInfo findParent() {
        return new PackFile();
    }

    public FileInfo get() {
        return new PackFile();
    }

    public FileInfo get(int i) {
        try {
            return new PackFile();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "eh.af(" + ')');
        }
    }
}
