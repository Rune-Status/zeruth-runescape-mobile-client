package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

/* compiled from: dh */
public class ByteArray {
    static final int HINT_CONTEXT_CAR_HOME = 2;
    static final int INITIAL_SIZE = 37748736;
    static final int Id_pow = 14;
    static final int TEXT_COLOR = -3355444;
    static final int TRANSACTION_getInfo = 5;
    public static InsnList buffer = new InsnList(256, 256);
    static final int bytes = -3407872;
    static StringMap cache = new StringMap();
    static final Method count = new Method();
    static final int growSize = 1003;
    public static InsnList index = new InsnList(INITIAL_SIZE, 256);
    static File next = cache.get(-1110183144);
    HashMap data;
    int first;
    List length;
    Namespace parent;
    final HashMap pos;
    int size;
    int this$0;
    LinkedList type;
    int value;

    ByteArray(int $i0, int i, int i2, HashMap hashMap) {
        try {
            this.this$0 = -1818377131 * $i0;
            this.value = -514969609 * i;
            this.type = new LinkedList();
            this.length = new LinkedList();
            this.data = new HashMap();
            this.first = (-16777216 | i2) * 1023037483;
            this.pos = hashMap;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "dh.<init>(" + ')');
        }
    }

    static long add(int i, int i2, int $i2) {
        return (long) ((($i2 << 16) | (i << 8)) | i2);
    }

    static void add(Long longR, int i, int i2, int i3) {
        index.set(longR, Buffer.toString(i, i2, i3, (byte) -114), longR.size.length * 4);
    }

    static void add(Vec2 vec2, int i, int i2) {
        buffer.add(vec2, Buffer.toString(i, i2, 0, (byte) -65));
    }

    static Vec2 append(int i, int i2) {
        return (Vec2) buffer.get(Buffer.toString(i, i2, 0, (byte) -24));
    }

    static Vec2 equals(int i, int i2) {
        return (Vec2) buffer.get(Buffer.toString(i, i2, 0, (byte) -28));
    }

    static long getBytes(int i, int i2, int $i2) {
        return (long) ((($i2 << 16) | (i << 8)) | i2);
    }

    static Vec2 getBytes(int i, int i2) {
        return (Vec2) buffer.get(Buffer.toString(i, i2, 0, (byte) -107));
    }

    static Vec2 getData(int i, int i2) {
        return (Vec2) buffer.get(Buffer.toString(i, i2, 0, (byte) -18));
    }

    static SearchActivity init(int i) {
        i = 0;
        ByteArrayBuffer $r0 = null;
        try {
            SearchActivity $r1 = new SearchActivity();
            try {
                ByteArrayBuffer $r4 = HttpRequest.get("", client.backgroundColor.key, false, -1111390073);
                $r0 = $r4;
                byte[] $r5 = new byte[((int) $r4.get(2057608795))];
                while (i < $r5.length) {
                    int $i2 = $r4.get($r5, i, $r5.length - i, (byte) -31);
                    if (-1 == $i2) {
                        throw new IOException();
                    } else {
                        i += $i2;
                    }
                }
                $r0 = $r4;
                $r1 = new SearchActivity(new Logger($r5));
            } catch (Exception e) {
            }
            if ($r0 != null) {
                try {
                    $r0.add(420907623);
                    return $r1;
                } catch (Exception e2) {
                }
            }
            return $r1;
        } catch (RuntimeException $r10) {
            throw StringBuilder.append($r10, "dh.an(" + ')');
        }
    }

    static long set(int i, int i2, int $i2) {
        return (long) ((($i2 << 16) | (i << 8)) | i2);
    }

    static Vec2 set(int i, int i2) {
        return (Vec2) buffer.get(Buffer.toString(i, i2, 0, (byte) -85));
    }

    static void set(Long longR, int i, int i2, int i3) {
        index.set(longR, Buffer.toString(i, i2, i3, (byte) -66), longR.size.length * 4);
    }

    static final void toString(int i) {
        i = 0;
        while (i < client.cache * 2118073853) {
            int[] $r0 = client.stack;
            $r0[i] = $r0[i] - 1;
            int $i1;
            if (client.stack[i] < -10) {
                client.cache -= 1636861781;
                for ($i1 = i; $i1 < client.cache * 2118073853; $i1++) {
                    client.pool[$i1] = client.pool[$i1 + 1];
                    client.values[$i1] = client.values[$i1 + 1];
                    client.writer[$i1] = client.writer[$i1 + 1];
                    client.stack[$i1] = client.stack[$i1 + 1];
                    client.TYPE[$i1] = client.TYPE[$i1 + 1];
                }
                i--;
            } else {
                Template $r4 = client.values[i];
                if ($r4 == null) {
                    Template $r10 = Template.get(Coordinate.size, client.pool[i], 0);
                    $r4 = $r10;
                    if ($r10 != null) {
                        $r0 = client.stack;
                        try {
                            $r0[i] = $r0[i] + $r10.append();
                            client.values[i] = $r10;
                        } catch (Throwable $r13) {
                            throw StringBuilder.append($r13, "dh.bx(" + ')');
                        }
                    }
                }
                if (client.stack[i] < 0) {
                    if (client.TYPE[i] != 0) {
                        $i1 = (client.TYPE[i] & 255) * Constants.f93X;
                        int $i2 = ((((client.TYPE[i] >> 16) & 255) * Constants.f93X) + 64) - (516759209 * File.this$0.size);
                        if ($i2 < 0) {
                            $i2 = -$i2;
                        }
                        int $i3 = ((((client.TYPE[i] >> 8) & 255) * Constants.f93X) + 64) - (2328865 * File.this$0.value);
                        if ($i3 < 0) {
                            $i3 = -$i3;
                        }
                        $i2 = ($i3 + $i2) - 128;
                        if ($i2 > $i1) {
                            client.stack[i] = -100;
                        } else {
                            if ($i2 < 0) {
                                $i2 = 0;
                            }
                            $i1 = (($i1 - $i2) * (1137688059 * client.items)) / $i1;
                        }
                    } else {
                        $i1 = 1745056855 * client.group;
                    }
                    if ($i1 > 0) {
                        Entry $r7 = Address.get($r4.get().toString(Path.size), 100, $i1);
                        $r7.equals(client.writer[i] - 1);
                        FileInfo.size.equals($r7);
                    }
                    client.stack[i] = -100;
                }
            }
            i++;
        }
        if (client.index) {
            if (!(-219207591 * MultiInputStream.index != 0 ? true : MultiInputStream.this$0.apply(2066477413))) {
                if (!(client.user * -1819605895 == 0 || client.table * 1387447661 == -1)) {
                    Hashtable.read(client.header, client.table * 1387447661, 0, client.user * -1819605895, false, -397377188);
                }
                client.index = false;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void write(p000.Collection r13, byte r14) {
        /*
        r0 = 0;
        r13.pos = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.text;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 259701737; // 0xf7abbe9 float:1.2362142E-29 double:1.283097064E-315;
        r1 = r1 * r0;
        r0 = -1;
        if (r1 == r0) goto L_0x0093;
    L_0x000c:
        r1 = r13.text;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 259701737; // 0xf7abbe9 float:1.2362142E-29 double:1.283097064E-315;
        r1 = r1 * r0;
        r0 = 633258181; // 0x25bec0c5 float:3.3090372E-16 double:3.12871112E-315;
        r2 = p000.AbstractBuffer.get(r1, r0);	 Catch:{ RuntimeException -> 0x01b3 }
        if (r2 == 0) goto L_0x01ce;
    L_0x001b:
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r3 == 0) goto L_0x01ce;
    L_0x001f:
        r1 = r13.pointer;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 2135145953; // 0x7f43bde1 float:2.6018537E38 double:1.054902264E-314;
        r1 = r1 + r0;
        r13.pointer = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.bytes;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 782711805; // 0x2ea73bfd float:7.604937E-11 double:3.867110134E-315;
        r1 = r1 * r0;
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r3.length;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 >= r4) goto L_0x006b;
    L_0x0032:
        r1 = r13.pointer;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -1283897823; // 0xffffffffb3794621 float:-5.8038612E-8 double:NaN;
        r1 = r0 * r1;
        r3 = r2.buffer;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r13.bytes;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 782711805; // 0x2ea73bfd float:7.604937E-11 double:3.867110134E-315;
        r4 = r0 * r4;
        r4 = r3[r4];	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 <= r4) goto L_0x006b;
    L_0x0046:
        r0 = 2135145953; // 0x7f43bde1 float:2.6018537E38 double:1.054902264E-314;
        r13.pointer = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.bytes;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 933296469; // 0x37a0f955 float:1.918959E-5 double:4.611097227E-315;
        r1 = r1 + r0;
        r13.bytes = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.bytes;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 782711805; // 0x2ea73bfd float:7.604937E-11 double:3.867110134E-315;
        r1 = r0 * r1;
        r4 = r13.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r4 = r4 * r0;
        r5 = r13.value;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r5 = r5 * r0;
        r0 = -36;
        p000.Map.toString(r2, r1, r4, r5, r0);	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x006b:
        r1 = r13.bytes;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 782711805; // 0x2ea73bfd float:7.604937E-11 double:3.867110134E-315;
        r1 = r1 * r0;
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r3.length;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 < r4) goto L_0x0093;
    L_0x0076:
        r0 = 0;
        r13.pointer = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 0;
        r13.bytes = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.bytes;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 782711805; // 0x2ea73bfd float:7.604937E-11 double:3.867110134E-315;
        r1 = r1 * r0;
        r4 = r13.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r4 = r4 * r0;
        r5 = r13.value;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r5 = r5 * r0;
        r0 = -20;
        p000.Map.toString(r2, r1, r4, r5, r0);	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x0093:
        r1 = r13.state;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 269129085; // 0x100a957d float:2.7330863E-29 double:1.32967435E-315;
        r1 = r1 * r0;
        r0 = -1;
        if (r0 == r1) goto L_0x0147;
    L_0x009c:
        r1 = p000.client.type;
        r0 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r1 = r1 * r0;
        r4 = r13.out;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 645928209; // 0x26801511 float:8.887494E-16 double:3.191309377E-315;
        r4 = r0 * r4;
        if (r1 < r4) goto L_0x0147;
    L_0x00ab:
        r1 = r13.f62a;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 628512873; // 0x25765869 float:2.1367053E-16 double:3.105266185E-315;
        r1 = r1 * r0;
        if (r1 >= 0) goto L_0x00b6;
    L_0x00b3:
        r0 = 0;
        r13.f62a = r0;	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x00b6:
        r1 = r13.state;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 269129085; // 0x100a957d float:2.7330863E-29 double:1.32967435E-315;
        r1 = r0 * r1;
        r0 = 1886636504; // 0x7073c9d8 float:3.0179549E29 double:9.32122283E-315;
        r6 = p000.HyperlinkRecord.get(r1, r0);	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r6.count;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1690052581; // 0x64bc27e5 float:2.77669E22 double:8.3499692E-315;
        r1 = r1 * r0;
        r0 = -1;
        if (r1 == r0) goto L_0x02a1;
    L_0x00cd:
        r0 = 799343456; // 0x2fa50360 float:3.0015723E-10 double:3.94928141E-315;
        r2 = p000.AbstractBuffer.get(r1, r0);	 Catch:{ RuntimeException -> 0x01b3 }
        if (r2 == 0) goto L_0x0299;
    L_0x00d6:
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r3 == 0) goto L_0x0299;
    L_0x00da:
        r1 = r13.f64c;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1417511579; // 0x547d829b float:4.35527169E12 double:7.00343774E-315;
        r1 = r1 + r0;
        r13.f64c = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.f62a;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 628512873; // 0x25765869 float:2.1367053E-16 double:3.105266185E-315;
        r1 = r1 * r0;
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r3.length;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 >= r4) goto L_0x0124;
    L_0x00ed:
        r1 = r13.f64c;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 289248147; // 0x113d9393 float:1.4954946E-28 double:1.429075726E-315;
        r1 = r0 * r1;
        r3 = r2.buffer;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r13.f62a;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 628512873; // 0x25765869 float:2.1367053E-16 double:3.105266185E-315;
        r4 = r4 * r0;
        r4 = r3[r4];	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 <= r4) goto L_0x0124;
    L_0x0100:
        r0 = 1417511579; // 0x547d829b float:4.35527169E12 double:7.00343774E-315;
        r13.f64c = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.f62a;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -367216679; // 0xffffffffea1cb7d9 float:-4.7365155E25 double:NaN;
        r1 = r1 + r0;
        r13.f62a = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.f62a;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 628512873; // 0x25765869 float:2.1367053E-16 double:3.105266185E-315;
        r1 = r1 * r0;
        r4 = r13.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r4 = r4 * r0;
        r5 = r13.value;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r5 = r5 * r0;
        r0 = -70;
        p000.Map.toString(r2, r1, r4, r5, r0);	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x0124:
        r1 = r13.f62a;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 628512873; // 0x25765869 float:2.1367053E-16 double:3.105266185E-315;
        r1 = r1 * r0;
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r3.length;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 < r4) goto L_0x0147;
    L_0x012f:
        r1 = r13.f62a;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 628512873; // 0x25765869 float:2.1367053E-16 double:3.105266185E-315;
        r1 = r1 * r0;
        if (r1 < 0) goto L_0x0142;
    L_0x0137:
        r1 = r13.f62a;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 628512873; // 0x25765869 float:2.1367053E-16 double:3.105266185E-315;
        r1 = r1 * r0;
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r3.length;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 < r4) goto L_0x0147;
    L_0x0142:
        r0 = 2015474731; // 0x7821b42b float:1.3118969E34 double:9.957768246E-315;
        r13.state = r0;	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x0147:
        r1 = r13.data;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r1 = r1 * r0;
        r0 = -1;
        if (r0 == r1) goto L_0x01d6;
    L_0x0150:
        r1 = r13.start;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1913892303; // 0x7213adcf float:2.9250828E30 double:9.455884368E-315;
        r1 = r0 * r1;
        r0 = 1;
        if (r1 > r0) goto L_0x01d6;
    L_0x015a:
        r1 = r13.data;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r1 = r1 * r0;
        r0 = 893501376; // 0x3541bfc0 float:7.2177136E-7 double:4.414483344E-315;
        r2 = p000.AbstractBuffer.get(r1, r0);	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r2.index;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -920725183; // 0xffffffffc91ed941 float:-650644.06 double:NaN;
        r1 = r1 * r0;
        r0 = 1;
        if (r0 != r1) goto L_0x01d6;
    L_0x0170:
        r1 = r13.width;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -1210627617; // 0xffffffffb7d749df float:-2.5664396E-5 double:NaN;
        r1 = r1 * r0;
        if (r1 <= 0) goto L_0x01d6;
    L_0x0178:
        r1 = r13.body;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 81181341; // 0x4d6ba9d float:5.0482535E-36 double:4.01089117E-316;
        r1 = r0 * r1;
        r4 = p000.client.type;
        r0 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r4 = r4 * r0;
        if (r1 > r4) goto L_0x01d6;
    L_0x0187:
        r1 = r13.title;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -216586625; // 0xfffffffff317267f float:-1.1975367E31 double:NaN;
        r1 = r0 * r1;
        r4 = p000.client.type;
        r0 = 1581849891; // 0x5e491d23 float:3.62294441E18 double:7.81537688E-315;
        r4 = r4 * r0;
        if (r1 >= r4) goto L_0x01d6;
    L_0x0196:
        r0 = -464504529; // 0xffffffffe450392f float:-1.5364173E22 double:NaN;
        r13.start = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        return;
    L_0x019c:
        r0 = 2033542925; // 0x7935670d float:5.886849E34 double:1.0047036986E-314;
        r13.data = r0;	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x01a1:
        r1 = r13.start;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1913892303; // 0x7213adcf float:2.9250828E30 double:9.455884368E-315;
        r1 = r0 * r1;
        if (r1 <= 0) goto L_0x02c1;
    L_0x01aa:
        r1 = r13.start;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -464504529; // 0xffffffffe450392f float:-1.5364173E22 double:NaN;
        r1 = r1 - r0;
        r13.start = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        return;
    L_0x01b3:
        r7 = move-exception;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "dh.co(";
        r8 = r8.append(r9);
        r0 = 41;
        r8 = r8.append(r0);
        r10 = r8.toString();
        r11 = p000.StringBuilder.append(r7, r10);
        throw r11;
    L_0x01ce:
        r0 = 662713255; // 0x278033a7 float:3.558314E-15 double:3.274238523E-315;
        r13.text = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        goto L_0x0093;
    L_0x01d6:
        r1 = r13.data;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r1 = r1 * r0;
        r0 = -1;
        if (r0 == r1) goto L_0x01a1;
    L_0x01df:
        r1 = r13.start;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1913892303; // 0x7213adcf float:2.9250828E30 double:9.455884368E-315;
        r1 = r1 * r0;
        if (r1 != 0) goto L_0x01a1;
    L_0x01e7:
        r1 = r13.data;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1462124603; // 0x5726403b float:1.82794798E14 double:7.223855363E-315;
        r1 = r0 * r1;
        r0 = 1227645796; // 0x492c6364 float:706102.25 double:6.06537613E-315;
        r2 = p000.AbstractBuffer.get(r1, r0);	 Catch:{ RuntimeException -> 0x01b3 }
        if (r2 == 0) goto L_0x019c;
    L_0x01f7:
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r3 == 0) goto L_0x019c;
    L_0x01fb:
        r1 = r13.limit;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 745521897; // 0x2c6fc2e9 float:3.407214E-12 double:3.683367575E-315;
        r1 = r1 + r0;
        r13.limit = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1816971127; // 0x6c4cc777 float:9.9025125E26 double:8.977030133E-315;
        r1 = r1 * r0;
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r3.length;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 >= r4) goto L_0x0245;
    L_0x020e:
        r1 = r13.limit;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -829213351; // 0xffffffffce933559 float:-1.23487347E9 double:NaN;
        r1 = r0 * r1;
        r3 = r2.buffer;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1816971127; // 0x6c4cc777 float:9.9025125E26 double:8.977030133E-315;
        r4 = r4 * r0;
        r4 = r3[r4];	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 <= r4) goto L_0x0245;
    L_0x0221:
        r0 = 745521897; // 0x2c6fc2e9 float:3.407214E-12 double:3.683367575E-315;
        r13.limit = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -1862778297; // 0xffffffff90f84247 float:-9.792087E-29 double:NaN;
        r1 = r1 + r0;
        r13.position = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1816971127; // 0x6c4cc777 float:9.9025125E26 double:8.977030133E-315;
        r1 = r1 * r0;
        r4 = r13.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r4 = r4 * r0;
        r5 = r13.value;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r5 = r5 * r0;
        r0 = -104; // 0xffffffffffffff98 float:NaN double:NaN;
        p000.Map.toString(r2, r1, r4, r5, r0);	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x0245:
        r1 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1816971127; // 0x6c4cc777 float:9.9025125E26 double:8.977030133E-315;
        r1 = r1 * r0;
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r3.length;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 < r4) goto L_0x0279;
    L_0x0250:
        r1 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r2.data;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -1654163021; // 0xffffffff9d6779b3 float:-3.0635512E-21 double:NaN;
        r4 = r0 * r4;
        r1 = r1 - r4;
        r13.position = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.first;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 2084308175; // 0x7c3c04cf float:3.9049974E36 double:1.0297850646E-314;
        r1 = r1 + r0;
        r13.first = r1;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r13.first;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = -1755938257; // 0xffffffff9756822f float:-6.9311444E-25 double:NaN;
        r1 = r0 * r1;
        r4 = r2.text;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 397534483; // 0x17b1e513 float:1.1496183E-24 double:1.96408131E-315;
        r4 = r0 * r4;
        if (r1 < r4) goto L_0x0280;
    L_0x0274:
        r0 = 2033542925; // 0x7935670d float:5.886849E34 double:1.0047036986E-314;
        r13.data = r0;	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x0279:
        r12 = r2.start;	 Catch:{ RuntimeException -> 0x01b3 }
        r13.pos = r12;	 Catch:{ RuntimeException -> 0x01b3 }
        goto L_0x01a1;
    L_0x0280:
        r1 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1816971127; // 0x6c4cc777 float:9.9025125E26 double:8.977030133E-315;
        r1 = r1 * r0;
        if (r1 < 0) goto L_0x0293;
    L_0x0288:
        r1 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1816971127; // 0x6c4cc777 float:9.9025125E26 double:8.977030133E-315;
        r1 = r1 * r0;
        r3 = r2.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r4 = r3.length;	 Catch:{ RuntimeException -> 0x01b3 }
        if (r1 < r4) goto L_0x02a9;
    L_0x0293:
        r0 = 2033542925; // 0x7935670d float:5.886849E34 double:1.0047036986E-314;
        r13.data = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        goto L_0x0279;
    L_0x0299:
        r0 = 2015474731; // 0x7821b42b float:1.3118969E34 double:9.957768246E-315;
        r13.state = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        goto L_0x0147;
    L_0x02a1:
        r0 = 2015474731; // 0x7821b42b float:1.3118969E34 double:9.957768246E-315;
        r13.state = r0;	 Catch:{ RuntimeException -> 0x01b3 }
        goto L_0x0147;
    L_0x02a9:
        r1 = r13.position;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 1816971127; // 0x6c4cc777 float:9.9025125E26 double:8.977030133E-315;
        r1 = r1 * r0;
        r4 = r13.size;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 516759209; // 0x1ecd1ea9 float:2.17179E-20 double:2.553129723E-315;
        r4 = r4 * r0;
        r5 = r13.value;	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = 2328865; // 0x238921 float:3.263435E-39 double:1.150612E-317;
        r5 = r5 * r0;
        r0 = -63;
        p000.Map.toString(r2, r1, r4, r5, r0);	 Catch:{ RuntimeException -> 0x01b3 }
        goto L_0x0279;
    L_0x02c1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ByteArray.write(Collection, byte):void");
    }

    int add(int $i0, int i) {
        if (this.parent != null) {
            return this.parent.get($i0, i, (short) 11848);
        }
        if (!this.type.isEmpty()) {
            Iterator $r3 = this.type.iterator();
            while ($r3.hasNext()) {
                Segment $r5 = (Segment) $r3.next();
                if ($r5.next($i0, i, (short) 270)) {
                    return $r5.get($i0, i, (short) 16807);
                }
            }
        }
        return -1;
    }

    int add(int $i0, int i, byte b) {
        try {
            if (this.parent != null) {
                return this.parent.get($i0, i, (short) 3);
            }
            if (!this.type.isEmpty()) {
                Iterator $r3 = this.type.iterator();
                while ($r3.hasNext()) {
                    Segment $r5 = (Segment) $r3.next();
                    if ($r5.next($i0, i, (short) 270)) {
                        return $r5.get($i0, i, (short) -6953);
                    }
                }
            }
            return -1;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "dh.ba(" + ')');
        }
    }

    int add(int $i0, int i, Map map, Vec2 vec2) {
        return map.start[0][$i0][i] == (short) 0 ? 514059907 * this.first : vec2.set($i0, i, 323278327);
    }

    int add(int $i0, int i, Map map, Vec2 vec2, byte b) {
        try {
            return map.start[0][$i0][i] == (short) 0 ? 514059907 * this.first : vec2.set($i0, i, 1846193930);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "dh.av(" + ')');
        }
    }

    int add(Long longR, AsyncTask asyncTask) {
        switch (-101861059 * asyncTask.value) {
            case 1:
                return 0;
            case 2:
                return (-longR.data) / 2;
            default:
                return -longR.data;
        }
    }

    int add(Long longR, Hashtable hashtable) {
        switch (-318433239 * hashtable.value) {
            case 0:
                return 0;
            case 1:
                break;
            case 2:
                return (-longR.length) / 2;
            default:
                break;
        }
        return -longR.length;
    }

    ByteString add(int i, byte b) {
        try {
            return get(ByteBufferList.data[i], 1393648028);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "dh.bu(" + ')');
        }
    }

    Vec2 add(int i, int i2, ByteArray[] byteArrayArr) {
        Vec2 $r2 = Stream.add(i, i2, (byte) 53);
        if ($r2 != null) {
            return $r2;
        }
        $r2 = add(byteArrayArr, (byte) -44);
        Tools.add($r2, i, i2, -1083974881);
        return $r2;
    }

    Vec2 add(int i, int i2, ByteArray[] byteArrayArr, int i3) {
        try {
            Vec2 $r2 = Stream.add(i, i2, (byte) 125);
            if ($r2 != null) {
                return $r2;
            }
            $r2 = add(byteArrayArr, (byte) -43);
            Tools.add($r2, i, i2, -1083974881);
            return $r2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "dh.ah(" + ')');
        }
    }

    Vec2 add(ByteArray[] byteArrayArr) {
        BlockFieldMatrix $r2 = new BlockFieldMatrix(1829758659, 1235002762);
        if (this.parent != null) {
            add(0, 0, -473639478, -481500039, this.parent, $r2, 1807476156);
        } else {
            LinkedList $r7 = this.type;
            Iterator $r8 = $r7.iterator();
            while ($r8.hasNext()) {
                Map $r6 = (Segment) $r8.next();
                add($r6.getValue(-1705611764) * 8, $r6.next(-1741252353) * 8, 8, 8, $r6, $r2, 1940718171);
            }
        }
        write(byteArrayArr, $r2, (short) -3918);
        Vec2 $r4 = new Vec2();
        $r4.multiply($r2, (byte) -99);
        return $r4;
    }

    Vec2 add(ByteArray[] byteArrayArr, byte b) {
        BlockFieldMatrix $r2 = new BlockFieldMatrix(64, 64);
        if (this.parent != null) {
            add(0, 0, 64, 64, this.parent, $r2, 1810786539);
        } else {
            LinkedList $r11 = this.type;
            Iterator $r12 = $r11.iterator();
            while ($r12.hasNext()) {
                try {
                    Map map = (Segment) $r12.next();
                    add(map.getValue(-1489761533) * 8, map.next(-1741252353) * 8, 8, 8, map, $r2, 1847415011);
                } catch (Throwable $r7) {
                    throw StringBuilder.append($r7, "dh.ak(" + ')');
                }
            }
        }
        write(byteArrayArr, $r2, (short) 2770);
        Vec2 $r4 = new Vec2();
        $r4.multiply($r2, (byte) -8);
        return $r4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.util.List add(int r14, int r15, int r16, int r17, int r18) {
        /*
        r13 = this;
        r2 = new java.util.LinkedList;
        r2.<init>();
        r0 = r17;
        if (r0 < r14) goto L_0x000d;
    L_0x0009:
        r0 = r18;
        if (r0 >= r15) goto L_0x002d;
    L_0x000d:
        return r2;
    L_0x000e:
        r3 = r4.next();
        r6 = r3;
        r6 = (p000.Complex) r6;
        r5 = r6;
        r8 = 724317782; // 0x2b2c3656 float:6.118208E-13 double:3.57860533E-315;
        r0 = r17;
        r1 = r18;
        r7 = r5.add(r0, r1, r8);
        if (r7 == 0) goto L_0x0026;
    L_0x0023:
        r2.add(r5);
    L_0x0026:
        r7 = r4.hasNext();
        if (r7 != 0) goto L_0x000e;
    L_0x002c:
        return r2;
    L_0x002d:
        r14 = r16 + r14;
        r0 = r17;
        if (r0 >= r14) goto L_0x0039;
    L_0x0033:
        r14 = r16 + r15;
        r0 = r18;
        if (r0 < r14) goto L_0x0059;
    L_0x0039:
        return r2;
    L_0x003a:
        r2.add(r5);
    L_0x003d:
        r7 = r4.hasNext();
        if (r7 == 0) goto L_0x0064;
    L_0x0043:
        r3 = r4.next();
        r9 = r3;
        r9 = (p000.Complex) r9;
        r5 = r9;
        r8 = 33498870; // 0x1ff26f6 float:9.372811E-38 double:1.6550641E-316;
        r0 = r17;
        r1 = r18;
        r7 = r5.add(r0, r1, r8);
        if (r7 == 0) goto L_0x003d;
    L_0x0058:
        goto L_0x003a;
    L_0x0059:
        r10 = r13.data;
        r11 = r10.values();
        r4 = r11.iterator();
        goto L_0x003d;
    L_0x0064:
        r12 = r13.length;
        r4 = r12.iterator();
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: ByteArray.add(int, int, int, int, int):java.util.List");
    }

    void add(int i) {
        try {
            int $i1;
            if (this.parent != null) {
                for (i = 0; i < 64; i++) {
                    for ($i1 = 0; $i1 < 64; $i1++) {
                        add(i, $i1, this.parent, 1839180585);
                    }
                }
                return;
            }
            Iterator $r3 = this.type.iterator();
            while ($r3.hasNext()) {
                Map $r5 = (Segment) $r3.next();
                for (i = $r5.getValue(-1773401360) * 8; i < ($r5.getValue(-1415833140) * 8) + 8; i++) {
                    for ($i1 = $r5.next(-1741252353) * 8; $i1 < ($r5.next(-1741252353) * 8) + 8; $i1++) {
                        add(i, $i1, $r5, 136299778);
                    }
                }
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "dh.bf(" + ')');
        }
    }

    void add(int i, int i2, int i3, int i4, int i5, int i6, ByteArray byteArray, BlockFieldMatrix blockFieldMatrix, int i7) {
        for (i7 = 0; i7 < i5; i7++) {
            int $i7 = 0;
            while ($i7 < i6) {
                try {
                    int $i8 = byteArray.add(i7 + i, $i7 + i2, (byte) -4);
                    if ($i8 != -1) {
                        blockFieldMatrix.add(i7 + i3, i4 + $i7, 5, ThemeDialog.get($i8, -225034574), 1117900680);
                    }
                    $i7++;
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "dh.au(" + ')');
                }
            }
        }
    }

    void add(int i, int i2, int i3, int i4, Map map) {
        for (int $i4 = i; $i4 < i3 + i; $i4++) {
            for (int $i5 = i2; $i5 < i4 + i2; $i5++) {
                Method $r2 = new Method(0, $i4, $i5);
                for (int $i6 = 0; $i6 < -1533544669 * map.data; $i6++) {
                    Tags[] $r6 = map.size[$i6][$i4][$i5];
                    if (!($r6 == null || $r6.length == 0)) {
                        int $i7 = 0;
                        while ($i7 < $r6.length) {
                            ByteBufferList $r14 = get($r6[$i7].value * 1352506155, -298784671);
                            if ($r14 == null) {
                                $i7++;
                            } else {
                                Method $r9;
                                Method $r7 = new Method($i6, (1044791104 * this.this$0) + $i4, (1666216384 * this.value) + $i5);
                                if (this.parent != null) {
                                    $r9 = new Method($i6 + (45449177 * this.parent.height), (this.parent.index * -975640896) + $i4, (this.parent.value * 253061184) + $i5);
                                } else {
                                    Map $r15 = (Segment) map;
                                    $r9 = new Method($i6 + ($r15.height * 45449177), (($r15.index * -975640896) + $i4) + ($r15.append(513429790) * 8), ($r15.getValue((byte) 3) * 8) + (($r15.value * 253061184) + $i5));
                                }
                                Complex complex = new Complex(1733135393 * $r14.this$0, $r9, $r7, get($r14, -658148628));
                                HashMap hashMap = this.data;
                                HashMap $r12 = hashMap;
                                hashMap.put($r2, complex);
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    void add(int i, int i2, int i3, int i4, Map map, int i5) {
        for (i5 = i; i5 < i3 + i; i5++) {
            for (int $i5 = i2; $i5 < i4 + i2; $i5++) {
                Method $r2 = new Method(0, i5, $i5);
                int $i6 = 0;
                while ($i6 < -1533544669 * map.data) {
                    try {
                        Tags[] $r6 = map.size[$i6][i5][$i5];
                        if ($r6 != null) {
                            if ($r6.length == 0) {
                                continue;
                            } else {
                                int $i7 = 0;
                                while ($i7 < $r6.length) {
                                    ByteBufferList $r13 = get($r6[$i7].value * 1352506155, -667549075);
                                    if ($r13 == null) {
                                        $i7++;
                                    } else {
                                        Method $r8;
                                        Method method = new Method($i6, (1044791104 * this.this$0) + i5, (1666216384 * this.value) + $i5);
                                        if (this.parent != null) {
                                            Namespace $r15 = this.parent;
                                            $i6 = (45449177 * $r15.height) + $i6;
                                            $r15 = this.parent;
                                            $i7 = ($r15.index * -975640896) + i5;
                                            $r15 = this.parent;
                                            $r8 = new Method($i6, $i7, ($r15.value * 253061184) + $i5);
                                        } else {
                                            Segment $r7 = (Segment) map;
                                            $r8 = new Method($i6 + ($r7.height * 45449177), (($r7.index * -975640896) + i5) + ($r7.append(1138204782) * 8), ($r7.getValue((byte) 3) * 8) + (($r7.value * 253061184) + $i5));
                                        }
                                        $i6 = 1733135393 * $r13.this$0;
                                        Complex complex = new Complex($i6, $r8, method, get($r13, 697718694));
                                        HashMap hashMap = this.data;
                                        HashMap $r11 = hashMap;
                                        hashMap.put($r2, complex);
                                    }
                                }
                                continue;
                            }
                        }
                        $i6++;
                    } catch (Throwable $r16) {
                        throw StringBuilder.append($r16, "dh.ar(" + ')');
                    }
                }
            }
        }
    }

    void add(int i, int i2, int i3, int i4, Map map, BlockFieldMatrix blockFieldMatrix) {
        for (int $i4 = i; $i4 < i + i3; $i4++) {
            for (int $i5 = i2; $i5 < i4 + i2; $i5++) {
                int $i6 = map.start[0][$i4][$i5] - 1;
                if (-1 != $i6) {
                    blockFieldMatrix.add($i4, $i5, 5, ThemeDialog.get($i6, 1398453163), 1117900680);
                }
            }
        }
    }

    void add(int i, int i2, int i3, int i4, Map map, BlockFieldMatrix blockFieldMatrix, int i5) {
        for (i5 = i; i5 < i + i3; i5++) {
            for (int $i5 = i2; $i5 < i4 + i2; $i5++) {
                int $i6 = map.start[0][i5][$i5] - 1;
                if (-1 != $i6) {
                    try {
                        blockFieldMatrix.add(i5, $i5, 5, ThemeDialog.get($i6, -2144854569), 1117900680);
                    } catch (RuntimeException $r7) {
                        throw StringBuilder.append($r7, "dh.ax(" + ')');
                    }
                }
            }
        }
    }

    void add(int i, int i2, int i3, File file) {
        Long longR = (Long) index.get(Buffer.toString(this.this$0 * -319219459, this.value * -824636236, -254069341 * this.size, (byte) -111));
        if (longR != null) {
            if (this.size * 919431360 == i3) {
                file.add(longR, i, i2, (byte) -101);
            } else {
                file.toString(longR, i, i2, i3, i3, -533821026);
            }
        }
    }

    void add(int i, int i2, int i3, File file, int i4) {
        try {
            i4 = this.this$0 * -319219459;
            int $i4 = this.value * 1636647367;
            int $i5 = -254069341 * this.size;
            Long $r4 = (Long) index.get(Buffer.toString(i4, $i4, $i5, (byte) -68));
            if ($r4 != null) {
                int $i3 = this.size * 919431360;
                i4 = $i3;
                if ($i3 == i3) {
                    file.add($r4, i, i2, (byte) -41);
                } else {
                    file.toString($r4, i, i2, i3, i3, -840585582);
                }
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "dh.ag(" + ')');
        }
    }

    void add(int i, int i2, int i3, HashSet $r1, File file) {
        if ($r1 == null) {
            $r1 = new HashSet();
        }
        add(i, i2, $r1, i3, file, 232442758);
        add(i, i2, $r1, i3, file, (byte) 11);
    }

    void add(int i, int i2, int i3, HashSet $r1, File file, int i4) {
        if ($r1 == null) {
            try {
                HashSet hashSet = new HashSet();
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "dh.aq(" + ')');
            }
        }
        add(i, i2, $r1, i3, file, -2093902427);
        add(i, i2, $r1, i3, file, (byte) 23);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void add(int r33, int r34, p000.Map r35) {
        /*
        r32 = this;
        r4 = count;
        r5 = 0;
        r6 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        r0 = r33;
        r1 = r34;
        r4.update(r5, r0, r1, r6);
        r7 = 0;
    L_0x000d:
        r0 = r35;
        r8 = r0.data;
        r5 = -1533544669; // 0xffffffffa497f723 float:-6.590448E-17 double:NaN;
        r8 = r8 * r5;
        if (r7 >= r8) goto L_0x0214;
    L_0x0017:
        r0 = r35;
        r9 = r0.size;
        r10 = r9[r7];
        r11 = r10[r33];
        r12 = r11[r34];
        if (r12 == 0) goto L_0x0026;
    L_0x0023:
        r8 = r12.length;
        if (r8 != 0) goto L_0x0210;
    L_0x0026:
        r7 = r7 + 1;
        goto L_0x000d;
    L_0x0029:
        r13 = r14.hasNext();
        if (r13 == 0) goto L_0x0269;
    L_0x002f:
        r15 = r14.next();
        r17 = r15;
        r17 = (p000.Segment) r17;
        r16 = r17;
        r5 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r0 = r16;
        r1 = r33;
        r2 = r34;
        r13 = r0.next(r1, r2, r5);
        if (r13 == 0) goto L_0x0029;
    L_0x0047:
        r18 = new Method;
        r0 = r16;
        r0 = r0.height;
        r19 = r0;
        r5 = 45449177; // 0x2b57fd9 float:2.666894E-37 double:2.2454877E-316;
        r19 = r5 * r19;
        r0 = r19;
        r0 = r0 + r7;
        r19 = r0;
        r0 = r16;
        r0 = r0.index;
        r20 = r0;
        r5 = -975640896; // 0xffffffffc5d8e6c0 float:-6940.8438 double:NaN;
        r0 = r20;
        r0 = r0 * r5;
        r20 = r0;
        r1 = r33;
        r0 = r0 + r1;
        r20 = r0;
        r5 = 1606474503; // 0x5fc0db07 float:2.7793418E19 double:7.93703863E-315;
        r0 = r16;
        r21 = r0.append(r5);
        r21 = r21 * 8;
        r0 = r20;
        r1 = r21;
        r0 = r0 + r1;
        r20 = r0;
        r0 = r16;
        r0 = r0.value;
        r21 = r0;
        r5 = 253061184; // 0xf156840 float:7.366345E-30 double:1.250288373E-315;
        r0 = r21;
        r0 = r0 * r5;
        r21 = r0;
        r1 = r34;
        r0 = r0 + r1;
        r21 = r0;
        r5 = 3;
        r0 = r16;
        r22 = r0.getValue(r5);
        r22 = r22 * 8;
        r21 = r22 + r21;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r0.<init>(r1, r2, r3);
    L_0x00a7:
        if (r18 != 0) goto L_0x0222;
    L_0x00a9:
        r8 = r8 + 1;
    L_0x00ab:
        r0 = r12.length;
        r19 = r0;
        if (r8 >= r0) goto L_0x0026;
    L_0x00b0:
        r23 = r12[r8];
        r0 = r23;
        r0 = r0.value;
        r19 = r0;
        r5 = 1352506155; // 0x509d9b2b float:2.1153536E10 double:6.68226827E-315;
        r0 = r19;
        r0 = r0 * r5;
        r19 = r0;
        r5 = -1695630142; // 0xffffffff9aeebcc2 float:-9.873945E-23 double:NaN;
        r0 = r32;
        r1 = r19;
        r24 = r0.get(r1, r5);
        if (r24 == 0) goto L_0x00a9;
    L_0x00cd:
        r0 = r32;
        r0 = r0.data;
        r25 = r0;
        r4 = count;
        r0 = r25;
        r15 = r0.get(r4);
        r27 = r15;
        r27 = (p000.Complex) r27;
        r26 = r27;
        if (r26 == 0) goto L_0x0189;
    L_0x00e3:
        r0 = r24;
        r0 = r0.this$0;
        r33 = r0;
        r5 = 1733135393; // 0x674d8c21 float:9.7067005E23 double:8.562826573E-315;
        r0 = r33;
        r0 = r0 * r5;
        r33 = r0;
        r0 = r26;
        r0 = r0.this$0;
        r34 = r0;
        r5 = -459008153; // 0xffffffffe4a41767 float:-2.4215619E22 double:NaN;
        r34 = r5 * r34;
        r0 = r33;
        r1 = r34;
        if (r0 == r1) goto L_0x0147;
    L_0x0102:
        r28 = new Complex;
        r0 = r24;
        r0 = r0.this$0;
        r33 = r0;
        r5 = 1733135393; // 0x674d8c21 float:9.7067005E23 double:8.562826573E-315;
        r33 = r5 * r33;
        r0 = r26;
        r4 = r0.length;
        r0 = r26;
        r0 = r0.key;
        r18 = r0;
        r5 = 659510932; // 0x274f5694 float:2.8773955E-15 double:3.258416946E-315;
        r0 = r32;
        r1 = r24;
        r29 = r0.get(r1, r5);
        r0 = r28;
        r1 = r33;
        r2 = r18;
        r3 = r29;
        r0.<init>(r1, r4, r2, r3);
        r0 = r32;
        r0 = r0.data;
        r25 = r0;
        r4 = new Method;
        r18 = count;
        r0 = r18;
        r4.<init>(r0);
        r0 = r25;
        r1 = r28;
        r0.put(r4, r1);
        r26 = r28;
    L_0x0147:
        r0 = r26;
        r4 = r0.length;
        r0 = r4.type;
        r33 = r0;
        r5 = 1302348633; // 0x4da04359 float:3.36096032E8 double:6.434457185E-315;
        r0 = r33;
        r0 = r0 * r5;
        r33 = r0;
        r0 = r26;
        r4 = r0.key;
        r0 = r4.type;
        r34 = r0;
        r5 = 1302348633; // 0x4da04359 float:3.36096032E8 double:6.434457185E-315;
        r34 = r5 * r34;
        r0 = r33;
        r1 = r34;
        r0 = r0 - r1;
        r33 = r0;
        r0 = r26;
        r4 = r0.key;
        r5 = -509225751; // 0xffffffffe1a5d4e9 float:-3.8238182E20 double:NaN;
        r34 = r5 * r7;
        r0 = r34;
        r4.type = r0;
        r0 = r26;
        r4 = r0.length;
        r33 = r7 + r33;
        r5 = -509225751; // 0xffffffffe1a5d4e9 float:-3.8238182E20 double:NaN;
        r0 = r33;
        r0 = r0 * r5;
        r33 = r0;
        r4.type = r0;
        return;
    L_0x0189:
        r4 = new Method;
        r0 = r32;
        r0 = r0.this$0;
        r19 = r0;
        r5 = 1044791104; // 0x3e463f40 float:0.19360065 double:5.161953916E-315;
        r19 = r5 * r19;
        r0 = r19;
        r1 = r33;
        r0 = r0 + r1;
        r19 = r0;
        r0 = r32;
        r0 = r0.value;
        r20 = r0;
        r5 = 1666216384; // 0x635071c0 float:3.8451193E21 double:8.23220274E-315;
        r20 = r5 * r20;
        r0 = r20;
        r1 = r34;
        r0 = r0 + r1;
        r20 = r0;
        r0 = r19;
        r1 = r20;
        r4.<init>(r7, r0, r1);
        r0 = r32;
        r0 = r0.parent;
        r30 = r0;
        if (r30 == 0) goto L_0x025c;
    L_0x01be:
        r18 = new Method;
        r0 = r32;
        r0 = r0.parent;
        r30 = r0;
        r0 = r0.height;
        r19 = r0;
        r5 = 45449177; // 0x2b57fd9 float:2.666894E-37 double:2.2454877E-316;
        r0 = r19;
        r0 = r0 * r5;
        r19 = r0;
        r0 = r0 + r7;
        r19 = r0;
        r0 = r32;
        r0 = r0.parent;
        r30 = r0;
        r0 = r0.index;
        r20 = r0;
        r5 = -975640896; // 0xffffffffc5d8e6c0 float:-6940.8438 double:NaN;
        r20 = r5 * r20;
        r0 = r20;
        r1 = r33;
        r0 = r0 + r1;
        r20 = r0;
        r0 = r32;
        r0 = r0.parent;
        r30 = r0;
        r0 = r0.value;
        r21 = r0;
        r5 = 253061184; // 0xf156840 float:7.366345E-30 double:1.250288373E-315;
        r0 = r21;
        r0 = r0 * r5;
        r21 = r0;
        r1 = r34;
        r0 = r0 + r1;
        r21 = r0;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r0.<init>(r1, r2, r3);
        goto L_0x00a7;
    L_0x0210:
        r8 = 0;
        goto L_0x00ab;
    L_0x0214:
        r0 = r32;
        r0 = r0.data;
        r25 = r0;
        r4 = count;
        r0 = r25;
        r0.remove(r4);
        return;
    L_0x0222:
        r26 = new Complex;
        r0 = r24;
        r0 = r0.this$0;
        r33 = r0;
        r5 = 1733135393; // 0x674d8c21 float:9.7067005E23 double:8.562826573E-315;
        r33 = r5 * r33;
        r5 = 1101737254; // 0x41ab2d26 float:21.397045 double:5.44330528E-315;
        r0 = r32;
        r1 = r24;
        r29 = r0.get(r1, r5);
        r0 = r26;
        r1 = r33;
        r2 = r18;
        r3 = r29;
        r0.<init>(r1, r2, r4, r3);
        r0 = r32;
        r0 = r0.data;
        r25 = r0;
        r4 = new Method;
        r18 = count;
        r0 = r18;
        r4.<init>(r0);
        r0 = r25;
        r1 = r26;
        r0.put(r4, r1);
        return;
    L_0x025c:
        r0 = r32;
        r0 = r0.type;
        r31 = r0;
        r14 = r0.iterator();
        goto L_0x0029;
    L_0x0269:
        r18 = 0;
        goto L_0x00a7;
        */
        throw new UnsupportedOperationException("Method not decompiled: ByteArray.add(int, int, Map):void");
    }

    void add(int $i0, int $i1, Map map, int i) {
        count.update(0, $i0, $i1, (byte) -103);
        for (i = 0; i < map.data * -1533544669; i++) {
            Tags[] $r6 = map.size[i][$i0][$i1];
            if ($r6 != null) {
                if ($r6.length == 0) {
                    continue;
                } else {
                    for (Tags $r7 : $r6) {
                        ByteBufferList $r8 = get($r7.value * 1352506155, -59975423);
                        if ($r8 != null) {
                            try {
                                Complex $r11 = (Complex) this.data.get(count);
                                int i2;
                                if ($r11 != null) {
                                    if ($r8.this$0 * 1733135393 != -459008153 * $r11.this$0) {
                                        Complex complex = new Complex(1733135393 * $r8.this$0, $r11.length, $r11.key, get($r8, 151254374));
                                        this.data.put(new Method(count), complex);
                                        $r11 = complex;
                                    }
                                    $i0 = ($r11.length.type * 1302348633) - (1302348633 * $r11.key.type);
                                    $r11.key.type = -509225751 * i;
                                    i2 = ($i0 + i) * -509225751;
                                    $i0 = i2;
                                    $r11.length.type = i2;
                                    return;
                                }
                                Method $r13;
                                Method $r2 = new Method(i, (1044791104 * this.this$0) + $i0, (1666216384 * this.value) + $i1);
                                int i3;
                                int i4;
                                if (this.parent != null) {
                                    Namespace $r15 = this.parent;
                                    int $i4 = ($r15.height * 45449177) + i;
                                    $r15 = this.parent;
                                    i3 = (-975640896 * $r15.index) + $i0;
                                    i2 = this.parent;
                                    Namespace $r152 = i2;
                                    i2 = i2.value * 253061184;
                                    i4 = i2;
                                    i2 = new Method($i4, i3, i2 + $i1);
                                } else {
                                    Map $r20;
                                    LinkedList $r21 = this.type;
                                    Iterator $r22 = $r21.iterator();
                                    do {
                                        if (!$r22.hasNext()) {
                                            $r13 = null;
                                            break;
                                        }
                                        $r20 = (Segment) $r22.next();
                                    } while (!$r20.next($i0, $i1, (short) 270));
                                    i2 = $r20.index * -975640896;
                                    i3 = i2;
                                    i3 = (i2 + $i0) + ($r20.append(1044328740) * 8);
                                    i2 = $r20.value * 253061184;
                                    i4 = i2;
                                    Method method = new Method((45449177 * $r20.height) + i, i3, ($r20.getValue((byte) 3) * 8) + (i2 + $i1));
                                }
                                if ($r13 != null) {
                                    this.data.put(new Method(count), new Complex(1733135393 * $r8.this$0, $r13, $r2, get($r8, 2146181675)));
                                    return;
                                }
                            } catch (Throwable $r16) {
                                throw StringBuilder.append($r16, "dh.bv(" + ')');
                            }
                        }
                    }
                    continue;
                }
            }
        }
        this.data.remove(count);
    }

    void add(int i, int i2, Map map, SparseFieldVector sparseFieldVector) {
        for (int $i6 = 1; $i6 < map.data * -1332583594; $i6++) {
            int $i5 = map.buffer[$i6][i][i2] - 1;
            if ($i5 > -1) {
                $i5 = Shape.next($i5, 514059907 * this.first, -1243953689);
                if (map.length[$i6][i][i2] == (byte) 0) {
                    int $i8 = this.size * -254069341;
                    int i3 = $i8;
                    next.add($i8 * i, (63 - i2) * (-254069341 * this.size), 114677448 * this.size, 1904603694 * this.size, $i5, (byte) 10);
                } else {
                    sparseFieldVector.add(i * (this.size * -115164391), (this.size * -2136405985) * (-1901878160 - i2), 0, $i5, 86060257 * this.size, this.size * -254069341, map.length[$i6][i][i2], map.next[$i6][i][i2], next, -1149402221);
                }
            }
        }
    }

    void add(int $i0, int i, Map map, SparseFieldVector sparseFieldVector, Vec2 vec2) {
        int $i2 = map.buffer[0][$i0][i] - 1;
        if (map.start[0][$i0][i] - 1 == -1 && -1 == $i2) {
            next.add((-793867044 * this.size) * $i0, (this.size * -254069341) * (63 - i), this.size * 128957859, -501461830 * this.size, 514059907 * this.first, (byte) 40);
        }
        int $i4 = -2032365979;
        if (-1 != $i2) {
            $i4 = Shape.next($i2, this.first * -380546264, -1243953689);
        }
        if ($i2 <= -1 || map.length[0][$i0][i] != (byte) 0) {
            int $i5 = add($i0, i, map, vec2, (byte) -24);
            if (-1 == $i2) {
                next.add((-1490116122 * this.size) * $i0, (1621103290 - i) * (-254069341 * this.size), -1855783798 * this.size, this.size * -254069341, $i5, (byte) -81);
                return;
            }
            sparseFieldVector.add($i0 * (-216866552 * this.size), (-911727559 - i) * (this.size * -254069341), $i5, $i4, this.size * -254069341, -606020341 * this.size, map.length[0][$i0][i], map.next[0][$i0][i], next, -1017184656);
            return;
        }
        next.add((this.size * 855139603) * $i0, (1859692319 - i) * (-1069824332 * this.size), 1761278101 * this.size, 673632919 * this.size, $i4, (byte) -11);
    }

    void add(int $i0, int i, Map map, SparseFieldVector sparseFieldVector, Vec2 vec2, int i2) {
        try {
            int $i3 = map.buffer[0][$i0][i] - 1;
            if (map.start[0][$i0][i] - 1 == -1 && -1 == $i3) {
                next.add((-254069341 * this.size) * $i0, (this.size * -254069341) * (63 - i), this.size * -254069341, -254069341 * this.size, 514059907 * this.first, (byte) -26);
            }
            i2 = 16711935;
            if (-1 != $i3) {
                i2 = Shape.next($i3, this.first * 514059907, -1243953689);
            }
            if ($i3 > -1) {
                if (map.length[0][$i0][i] == (byte) 0) {
                    next.add((this.size * -254069341) * $i0, (63 - i) * (-254069341 * this.size), -254069341 * this.size, -254069341 * this.size, i2, (byte) -80);
                    return;
                }
            }
            int $i5 = add($i0, i, map, vec2, (byte) -39);
            if (-1 == $i3) {
                next.add((-254069341 * this.size) * $i0, (63 - i) * (-254069341 * this.size), -254069341 * this.size, this.size * -254069341, $i5, (byte) 54);
                return;
            }
            sparseFieldVector.add($i0 * (-254069341 * this.size), (63 - i) * (this.size * -254069341), $i5, i2, this.size * -254069341, -254069341 * this.size, map.length[0][$i0][i], map.next[0][$i0][i], next, -185721228);
        } catch (RuntimeException $r11) {
            throw StringBuilder.append($r11, "dh.ai(" + ')');
        }
    }

    void add(int i, int i2, Map map, SparseFieldVector sparseFieldVector, Double[] doubleArr) {
        append(i, i2, map, 1127336728);
        toString(i, i2, map, doubleArr, -259014737);
    }

    void add(int i, int i2, Map map, SparseFieldVector sparseFieldVector, Double[] doubleArr, byte b) {
        try {
            append(i, i2, map, 1127336728);
            toString(i, i2, map, doubleArr, -802317211);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "dh.aw(" + ')');
        }
    }

    void add(int i, int i2, HashSet hashSet, int i3, File file) {
        float $f0 = ((float) i3) / 64.0f;
        float $f1 = $f0 / 2.0f;
        for (Entry entry : this.data.entrySet()) {
            Method $r8 = (Method) entry.getKey();
            float $f3 = $r8.value * 1452060195;
            float f = $f3;
            $f3 = (float) $f3;
            $f3 = ((float) i) + ($f3 * $f0);
            float f2 = $f3;
            $f3 -= $f1;
            f2 = $f3;
            int $i3 = (int) $f3;
            int $i4 = $r8.data * -1988966997;
            int i4 = $i4;
            $f3 = (float) $i4;
            $f3 = ((float) (i3 + i2)) - ($f3 * $f0);
            f2 = $f3;
            $f3 -= $f1;
            f2 = $f3;
            i4 = (int) $f3;
            Complex $r9 = (Complex) entry.getValue();
            if ($r9 != null) {
                $r9.next = 1162931015 * $i3;
                $r9.size = 2022774744 * i4;
                if (!hashSet.contains(Integer.valueOf(ByteBufferList.data[-459008153 * $r9.this$0].size(-1259892002)))) {
                    add($r9, $i3, i4, $f0, file, -445789671);
                }
            }
        }
    }

    void add(int i, int i2, HashSet hashSet, int i3, File file, byte b) {
        float $f0 = ((float) i3) / 64.0f;
        for (Complex $r6 : this.length) {
            int $i4 = ($r6.key.data * 1719114399) % 64;
            float $f2 = (float) (($r6.key.value * 1452060195) % 64);
            int $i2 = ((int) (($f2 * $f0) + ((float) i))) * 1162931015;
            i3 = $i2;
            $r6.next = $i2;
            $f2 = (float) (63 - $i4);
            $i2 = ($f2 * $f0) + ((float) i2);
            int i4 = $i2;
            $i2 = ((int) $i2) * 669005663;
            i3 = $i2;
            $r6.size = $i2;
            try {
                if (!hashSet.contains(Integer.valueOf(-459008153 * $r6.this$0))) {
                    add($r6, $r6.next * 1177898615, 229893279 * $r6.size, $f0, file, 318710261);
                }
            } catch (Throwable $r9) {
                throw StringBuilder.append($r9, "dh.bh(" + ')');
            }
        }
    }

    void add(int i, int i2, HashSet hashSet, int i3, File file, int i4) {
        float $f0 = ((float) i3) / 64.0f;
        float $f1 = $f0 / 2.0f;
        for (Entry $r7 : this.data.entrySet()) {
            Method $r8 = (Method) $r7.getKey();
            float $f3 = $r8.value * 1452060195;
            float f = $f3;
            $f3 = (float) $f3;
            $f3 = ((float) i) + ($f3 * $f0);
            float f2 = $f3;
            $f3 -= $f1;
            f2 = $f3;
            i4 = (int) $f3;
            int $i4 = $r8.data * 1719114399;
            int i5 = $i4;
            $f3 = (float) $i4;
            $f3 = ((float) (i3 + i2)) - ($f3 * $f0);
            f2 = $f3;
            $f3 -= $f1;
            f2 = $f3;
            i5 = (int) $f3;
            Complex $r9 = (Complex) $r7.getValue();
            if ($r9 != null) {
                $r9.next = 1162931015 * i4;
                $r9.size = 669005663 * i5;
                if (hashSet.contains(Integer.valueOf(ByteBufferList.data[-459008153 * $r9.this$0].size(-1057762652)))) {
                    continue;
                } else {
                    try {
                        add($r9, i4, i5, $f0, file, -1980049266);
                    } catch (Throwable $r13) {
                        throw StringBuilder.append($r13, "dh.ap(" + ')');
                    }
                }
            }
        }
    }

    void add(int i, SparseFieldVector sparseFieldVector, ByteArray[] byteArrayArr, Double[] doubleArr) {
        this.size = -500101979 * i;
        if (this.parent != null || !this.type.isEmpty()) {
            if (((Long) index.get(Buffer.toString(this.this$0 * 965863378, this.value * -891915474, i, (byte) -26))) == null) {
                Vec2 $r9 = add(1990798253 * this.this$0, 1636647367 * this.value, byteArrayArr, 2100062477);
                int $i0 = new Long(this.size * 919431360, this.size * 919431360);
                cache.add((Long) $i0, (byte) 38);
                if (this.parent != null) {
                    add(sparseFieldVector, byteArrayArr, doubleArr, $r9, (byte) -80);
                } else {
                    add(sparseFieldVector, doubleArr, $r9, (byte) -22);
                }
                TIntLinkedList.add($i0, -319219459 * this.this$0, this.value * -917105964, -254069341 * this.size, 2120942496);
            }
        }
    }

    void add(int i, SparseFieldVector sparseFieldVector, ByteArray[] byteArrayArr, Double[] doubleArr, byte b) {
        try {
            this.size = -2117097973 * i;
            if (this.parent == null) {
                if (this.type.isEmpty()) {
                    return;
                }
            }
            int $i2 = this.this$0 * -319219459;
            int $i3 = this.value * 1636647367;
            if (((Long) index.get(Buffer.toString($i2, $i3, i, (byte) -96))) == null) {
                Vec2 $r9 = add(this.this$0 * -319219459, this.value * 1636647367, byteArrayArr, 2100062477);
                int $i0 = new Long(this.size * 919431360, this.size * 919431360);
                cache.add((Long) $i0, (byte) 62);
                if (this.parent != null) {
                    add(sparseFieldVector, byteArrayArr, doubleArr, $r9, (byte) -50);
                } else {
                    add(sparseFieldVector, doubleArr, $r9, (byte) -84);
                }
                TIntLinkedList.add($i0, this.this$0 * -319219459, this.value * 1636647367, -254069341 * this.size, 1726340361);
            }
        } catch (RuntimeException $r11) {
            throw StringBuilder.append($r11, "dh.ae(" + ')');
        }
    }

    void add(ByteBufferList byteBufferList, int $i0, int $i1, int i, int i2, File file) {
        Long $r3 = byteBufferList.get(false, -1377703826);
        if ($r3 != null) {
            file.get($r3, $i0 - ($r3.length / 2), $i1 - ($r3.data / 2), 2106205673);
            if (i % i2 >= i2 / 2) {
            }
        }
    }

    void add(ByteBufferList byteBufferList, int $i0, int $i1, int i, int i2, File file, short s) {
        try {
            Long $r3 = byteBufferList.get(false, -822833381);
            if ($r3 != null) {
                file.get($r3, $i0 - ($r3.length / 2), $i1 - ($r3.data / 2), 2106205673);
                if (i % i2 >= i2 / 2) {
                }
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "dh.bb(" + ')');
        }
    }

    void add(ByteBufferList byteBufferList, int $i0, int $i1, File file) {
        Long $r3 = byteBufferList.get(false, -1956157715);
        if ($r3 != null) {
            file.get($r3, get($r3, byteBufferList.name, (short) -28365) + $i0, get($r3, byteBufferList.content, 952093640) + $i1, 2106205673);
        }
    }

    void add(ByteBufferList byteBufferList, int $i0, int $i1, File file, int i) {
        try {
            Long $r3 = byteBufferList.get(false, -1531589042);
            if ($r3 != null) {
                file.get($r3, get($r3, byteBufferList.name, (short) -14417) + $i0, get($r3, byteBufferList.content, 529477900) + $i1, 2106205673);
            }
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "dh.bz(" + ')');
        }
    }

    void add(Complex complex, int i, int i2, float f, File file) {
        ByteBufferList $r4 = ByteBufferList.data[-459008153 * complex.this$0];
        add($r4, i, i2, file, 1307036016);
        add(complex, $r4, i, i2, f, file, 986147959);
    }

    void add(Complex complex, int i, int i2, float f, File file, int i3) {
        try {
            ByteBufferList $r4 = ByteBufferList.data[-459008153 * complex.this$0];
            add($r4, i, i2, file, 1803323603);
            add(complex, $r4, i, i2, f, file, 2002579307);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "dh.bc(" + ')');
        }
    }

    void add(Complex complex, ByteBufferList byteBufferList, int i, int i2, float f, File file) {
        if (complex.value != null && complex.value.value.write(f, 1840724006)) {
            List list = (List) this.pos.get(complex.value.value);
            list.add(complex.value.data, i - ((1135522724 * complex.value.offset) / 2), i2, complex.value.offset * -61780877, complex.value.index * -1286895433, (-711885481 * byteBufferList.width) | -16777216, 0, 1, 0, list.this$0 / 2, file);
        }
    }

    void add(Complex complex, ByteBufferList byteBufferList, int i, int i2, float f, File file, int i3) {
        try {
            if (complex.value != null) {
                if (complex.value.value.write(f, 1840724006)) {
                    List list = (List) this.pos.get(complex.value.value);
                    list.add(complex.value.data, i - ((-61780877 * complex.value.offset) / 2), i2, complex.value.offset * -61780877, complex.value.index * 957930101, (382144197 * byteBufferList.width) | -16777216, 0, 1, 0, list.this$0 / 2, file);
                }
            }
        } catch (Throwable $r10) {
            throw StringBuilder.append($r10, "dh.bg(" + ')');
        }
    }

    void add(Namespace namespace, List list) {
        this.data.clear();
        this.parent = namespace;
        add(0, 0, 64, 64, this.parent, -260168609);
        add(list, -1847474998);
    }

    void add(Namespace namespace, List list, int i) {
        try {
            this.data.clear();
            this.parent = namespace;
            add(0, 0, 64, 64, this.parent, 787805004);
            add(list, -2052687657);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "dh.ay(" + ')');
        }
    }

    void add(SparseFieldVector sparseFieldVector, ByteArray[] byteArrayArr, Double[] doubleArr, Vec2 vec2) {
    }

    void add(SparseFieldVector sparseFieldVector, ByteArray[] byteArrayArr, Double[] doubleArr, Vec2 vec2, byte b) {
        int $i1;
        for ($i1 = 0; $i1 < 64; $i1++) {
            int $i2 = 0;
            while ($i2 < 64) {
                try {
                    add($i1, $i2, this.parent, sparseFieldVector, vec2, 644957254);
                    append($i1, $i2, this.parent, sparseFieldVector, -1307823947);
                    $i2++;
                } catch (RuntimeException $r6) {
                    throw StringBuilder.append($r6, "dh.at(" + ')');
                }
            }
        }
        for ($i1 = 0; $i1 < 64; $i1++) {
            for ($i2 = 0; $i2 < 64; $i2++) {
                add($i1, $i2, this.parent, sparseFieldVector, doubleArr, (byte) 111);
            }
        }
    }

    void add(SparseFieldVector sparseFieldVector, Double[] doubleArr, Vec2 vec2) {
        int $i1;
        Iterator $r5 = this.type.iterator();
        while ($r5.hasNext()) {
            int $i0;
            Map $r7 = (Segment) $r5.next();
            for ($i0 = $r7.getValue(-1458057997) * 8; $i0 < ($r7.getValue(-1438551219) * 8) + 8; $i0++) {
                for ($i1 = $r7.next(-1741252353) * 8; $i1 < ($r7.next(-1741252353) * 8) + 8; $i1++) {
                    add($i0, $i1, $r7, sparseFieldVector, vec2, 619010514);
                    append($i0, $i1, $r7, sparseFieldVector, -1288899452);
                }
            }
        }
        $r5 = this.type.iterator();
        while ($r5.hasNext()) {
            $r7 = (Segment) $r5.next();
            for ($i0 = $r7.getValue(-1380732101) * 8; $i0 < ($r7.getValue(-1792236617) * 8) + 8; $i0++) {
                for ($i1 = $r7.next(-1741252353) * 8; $i1 < ($r7.next(-1741252353) * 8) + 8; $i1++) {
                    add($i0, $i1, $r7, sparseFieldVector, doubleArr, (byte) 23);
                }
            }
        }
    }

    void add(SparseFieldVector sparseFieldVector, Double[] doubleArr, Vec2 vec2, byte b) {
        try {
            Map $r7;
            int $i1;
            int $i2;
            Iterator $r5 = this.type.iterator();
            while ($r5.hasNext()) {
                $r7 = (Segment) $r5.next();
                for ($i1 = $r7.getValue(-1777556446) * 8; $i1 < ($r7.getValue(-2034624324) * 8) + 8; $i1++) {
                    for ($i2 = $r7.next(-1741252353) * 8; $i2 < ($r7.next(-1741252353) * 8) + 8; $i2++) {
                        add($i1, $i2, $r7, sparseFieldVector, vec2, 453119551);
                        append($i1, $i2, $r7, sparseFieldVector, -339000351);
                    }
                }
            }
            $r5 = this.type.iterator();
            while ($r5.hasNext()) {
                $r7 = (Segment) $r5.next();
                for ($i1 = $r7.getValue(-1632814053) * 8; $i1 < ($r7.getValue(-1192604490) * 8) + 8; $i1++) {
                    for ($i2 = $r7.next(-1741252353) * 8; $i2 < ($r7.next(-1741252353) * 8) + 8; $i2++) {
                        add($i1, $i2, $r7, sparseFieldVector, doubleArr, (byte) 87);
                    }
                }
            }
        } catch (Throwable $r8) {
            throw StringBuilder.append($r8, "dh.ab(" + ')');
        }
    }

    void add(HashSet hashSet, int i, int i2, File file) {
        for (Complex $r6 : this.length) {
            ByteBufferList $r8 = ByteBufferList.data[-459008153 * $r6.this$0];
            if ($r8 != null && hashSet.contains(Integer.valueOf($r8.size(505297940)))) {
                add($r8, 1466392240 * $r6.next, 229893279 * $r6.size, i, i2, file, (short) -2192);
            }
        }
    }

    void add(HashSet hashSet, int i, int i2, File file, byte b) {
        try {
            for (Complex $r6 : this.length) {
                ByteBufferList $r8 = ByteBufferList.data[-459008153 * $r6.this$0];
                if ($r8 != null) {
                    if (hashSet.contains(Integer.valueOf($r8.size(-1038874774)))) {
                        add($r8, 1177898615 * $r6.next, 229893279 * $r6.size, i, i2, file, (short) -5849);
                    } else {
                        continue;
                    }
                }
            }
        } catch (Throwable $r10) {
            throw StringBuilder.append($r10, "dh.bw(" + ')');
        }
    }

    void add(HashSet hashSet, int i, int i2, File file, int i3) {
        try {
            for (Complex $r7 : this.data.values()) {
                int $i2 = $r7.this$0 * -459008153;
                i3 = $i2;
                if (hashSet.contains(Integer.valueOf($i2))) {
                    add(ByteBufferList.data[$r7.this$0 * -459008153], 1177898615 * $r7.next, 229893279 * $r7.size, i, i2, file, (short) 3659);
                }
            }
            add(hashSet, i, i2, file, (byte) 47);
        } catch (Throwable $r11) {
            throw StringBuilder.append($r11, "dh.am(" + ')');
        }
    }

    void add(HashSet hashSet, List list) {
        this.data.clear();
        Iterator $r4 = hashSet.iterator();
        while ($r4.hasNext()) {
            Map $r6 = (Segment) $r4.next();
            if ($r6.size(1161238427) == -319219459 * this.this$0 && $r6.getEntry(-1924895580) == 1636647367 * this.value) {
                LinkedList $r7 = this.type;
                $r7.add($r6);
                add($r6.getValue(-1865593038) * 8, $r6.next(-1741252353) * 8, 8, 8, $r6, -1533224748);
            }
        }
        add(list, -1961794658);
    }

    void add(HashSet hashSet, List list, byte b) {
        try {
            this.data.clear();
            Iterator $r4 = hashSet.iterator();
            while ($r4.hasNext()) {
                Map $r6 = (Segment) $r4.next();
                if ($r6.size(2116037704) == -319219459 * this.this$0) {
                    if ($r6.getEntry(-2122364291) == 1636647367 * this.value) {
                        LinkedList $r7 = this.type;
                        $r7.add($r6);
                        add($r6.getValue(-1133120469) * 8, $r6.next(-1741252353) * 8, 8, 8, $r6, -80210375);
                    } else {
                        continue;
                    }
                }
            }
            add(list, -1574480239);
        } catch (Throwable $r8) {
            throw StringBuilder.append($r8, "dh.as(" + ')');
        }
    }

    void add(List list) {
        for (Primitive $r5 : list) {
            if (this.this$0 * -319219459 == ((1452060195 * $r5.count.value) >> 6) && ((1719114399 * $r5.count.data) >> 6) == 1636647367 * this.value) {
                this.length.add(new Complex($r5.type * -1254917539, $r5.count, $r5.count, add($r5.type * -1254917539, (byte) 0)));
            }
        }
    }

    void add(List list, int i) {
        try {
            for (Primitive $r5 : list) {
                if (this.this$0 * -319219459 == ((1452060195 * $r5.count.value) >> 6)) {
                    if (((1719114399 * $r5.count.data) >> 6) == 1636647367 * this.value) {
                        i = $r5.type * -1254917539;
                        Method $r7 = $r5.count;
                        Method $r2 = $r5.count;
                        Complex $r6 = new Complex(i, $r7, $r2, add($r5.type * -1254917539, (byte) 0));
                        List $r1 = this.length;
                        $r1.add($r6);
                    } else {
                        continue;
                    }
                }
            }
        } catch (RuntimeException $r9) {
            throw StringBuilder.append($r9, "dh.aj(" + ')');
        }
    }

    void append(int i, int i2, int i3, HashSet $r1, File file) {
        if ($r1 == null) {
            $r1 = new HashSet();
        }
        add(i, i2, $r1, i3, file, -1800087957);
        add(i, i2, $r1, i3, file, (byte) 97);
    }

    void append(int i, int i2, Map map) {
        for (int $i3 = 0; $i3 < -1533544669 * map.data; $i3++) {
            Tags[] $r2 = map.size[$i3][i][i2];
            if (!($r2 == null || $r2.length == 0)) {
                for (Tags $r3 : $r2) {
                    if (StringBuilder.get($r3.length * 2134912077, -715960110)) {
                        int $i5 = BigInteger.get($r3.value * 1352506155, 1283879850).value * -1193025245 != 0 ? bytes : TEXT_COLOR;
                        if ($r3.length * 2134912077 == -1010613707 * Action.length.this$0) {
                            get(i, i2, -1998002507 * $r3.data, $i5, 1876463047);
                        }
                        int $i6 = $r3.length * 2134912077;
                        int i3 = $i6;
                        if (Action.size.this$0 * -1010613707 == $i6) {
                            get(i, i2, $r3.data * -1998002507, TEXT_COLOR, 1210333999);
                            get(i, i2, (-1998002507 * $r3.data) + 1, $i5, 1584382006);
                        }
                        if (-1010613707 * Action.value.this$0 == 2134912077 * $r3.length) {
                            if ($r3.data * -1998002507 == 0) {
                                next.get((-254069341 * this.size) * i, (63 - i2) * (-254069341 * this.size), 1, $i5, 147940588);
                            }
                            if (-1998002507 * $r3.data == 1) {
                                next.get((((-254069341 * this.size) * i) + (-254069341 * this.size)) - 1, (this.size * -254069341) * (63 - i2), 1, $i5, -1912786046);
                            }
                            if (-1998002507 * $r3.data == 2) {
                                $i6 = this.size * -254069341;
                                i3 = $i6;
                                next.get((((-254069341 * this.size) * i) + $i6) - 1, ((-254069341 * this.size) + ((-254069341 * this.size) * (63 - i2))) - 1, 1, $i5, -1767439419);
                            }
                            if (3 == -1998002507 * $r3.data) {
                                next.get((-254069341 * this.size) * i, ((this.size * -254069341) + ((this.size * -254069341) * (63 - i2))) - 1, 1, $i5, -2116153028);
                            }
                        }
                        if (2134912077 * $r3.length == -1010613707 * Action.data.this$0) {
                            int $i2;
                            if ((-1998002507 * $r3.data) % 2 == 0) {
                                $i2 = 0;
                                while (true) {
                                    $i6 = this.size * -254069341;
                                    i3 = $i6;
                                    if ($i2 >= $i6) {
                                        break;
                                    }
                                    $i6 = this.size * -254069341;
                                    i3 = $i6;
                                    $i6 *= i;
                                    i3 = $i6;
                                    next.get($i6 + $i2, (((64 - i2) * (-254069341 * this.size)) - 1) - $i2, 1, $i5, -1139759816);
                                    $i2++;
                                }
                            } else {
                                for ($i2 = 0; $i2 < -254069341 * this.size; $i2++) {
                                    $i6 = this.size * -254069341;
                                    i3 = $i6;
                                    $i6 *= i;
                                    i3 = $i6;
                                    i3 = $i6 + $i2;
                                    $i6 = (63 - i2) * (-254069341 * this.size);
                                    int i4 = $i6;
                                    next.get(i3, $i6 + $i2, 1, $i5, -2013459906);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void append(int i, int i2, Map map, int i3) {
        for (i3 = 0; i3 < -1533544669 * map.data; i3++) {
            Tags[] $r2 = map.size[i3][i][i2];
            if ($r2 != null) {
                if ($r2.length == 0) {
                    continue;
                } else {
                    for (Tags $r3 : $r2) {
                        if (StringBuilder.get($r3.length * 2134912077, -715960110)) {
                            int $i5 = BigInteger.get($r3.value * 1352506155, 1109134621).value * -1193025245 != 0 ? bytes : TEXT_COLOR;
                            if ($r3.length * 2134912077 == -1010613707 * Action.length.this$0) {
                                get(i, i2, -1998002507 * $r3.data, $i5, 899509545);
                            }
                            if (Action.size.this$0 * -1010613707 == $r3.length * 2134912077) {
                                get(i, i2, $r3.data * -1998002507, TEXT_COLOR, 1491837850);
                                get(i, i2, (-1998002507 * $r3.data) + 1, $i5, 1247043049);
                            }
                            if (-1010613707 * Action.value.this$0 == 2134912077 * $r3.length) {
                                if ($r3.data * -1998002507 == 0) {
                                    next.get((-254069341 * this.size) * i, (63 - i2) * (-254069341 * this.size), 1, $i5, -1936039213);
                                }
                                if (-1998002507 * $r3.data == 1) {
                                    next.get((((-254069341 * this.size) * i) + (-254069341 * this.size)) - 1, (this.size * -254069341) * (63 - i2), 1, $i5, -1389342506);
                                }
                                if (-1998002507 * $r3.data == 2) {
                                    next.get((((-254069341 * this.size) * i) + (this.size * -254069341)) - 1, ((-254069341 * this.size) + ((-254069341 * this.size) * (63 - i2))) - 1, 1, $i5, -808265123);
                                }
                                if (3 == -1998002507 * $r3.data) {
                                    next.get((-254069341 * this.size) * i, ((this.size * -254069341) + ((this.size * -254069341) * (63 - i2))) - 1, 1, $i5, -74527337);
                                }
                            }
                            if (2134912077 * $r3.length != -1010613707 * Action.data.this$0) {
                                continue;
                            } else if ((-1998002507 * $r3.data) % 2 == 0) {
                                $i3 = 0;
                                while (true) {
                                    if ($i3 >= this.size * -254069341) {
                                        continue;
                                        break;
                                    }
                                    try {
                                        $i6 = this.size * -254069341;
                                        r18 = $i6;
                                        $i6 *= i;
                                        r18 = $i6;
                                        next.get($i6 + $i3, (((64 - i2) * (-254069341 * this.size)) - 1) - $i3, 1, $i5, -983165484);
                                        $i3++;
                                    } catch (RuntimeException $r10) {
                                        throw StringBuilder.append($r10, "dh.al(" + ')');
                                    }
                                }
                            } else {
                                for ($i3 = 0; $i3 < -254069341 * this.size; $i3++) {
                                    $i6 = this.size * -254069341;
                                    r18 = $i6;
                                    $i6 *= i;
                                    r18 = $i6;
                                    r18 = $i6 + $i3;
                                    $i6 = (63 - i2) * (-254069341 * this.size);
                                    int i4 = $i6;
                                    next.get(r18, $i6 + $i3, 1, $i5, -1990934287);
                                }
                                continue;
                            }
                        }
                    }
                    continue;
                }
            }
        }
    }

    void append(int i, int i2, Map map, SparseFieldVector sparseFieldVector) {
        for (int $i6 = 1; $i6 < map.data * -1533544669; $i6++) {
            int $i5 = map.buffer[$i6][i][i2] - 1;
            if ($i5 > -1) {
                $i5 = Shape.next($i5, 514059907 * this.first, -1243953689);
                if (map.length[$i6][i][i2] == (byte) 0) {
                    int $i8 = this.size * -254069341;
                    int i3 = $i8;
                    next.add($i8 * i, (63 - i2) * (-254069341 * this.size), -254069341 * this.size, -254069341 * this.size, $i5, (byte) 93);
                } else {
                    sparseFieldVector.add(i * (this.size * -254069341), (this.size * -254069341) * (63 - i2), 0, $i5, -254069341 * this.size, this.size * -254069341, map.length[$i6][i][i2], map.next[$i6][i][i2], next, -420120762);
                }
            }
        }
    }

    void append(int i, int i2, Map map, SparseFieldVector sparseFieldVector, int i3) {
        for (i3 = 1; i3 < map.data * -1533544669; i3++) {
            int $i3 = map.buffer[i3][i][i2] - 1;
            if ($i3 > -1) {
                $i3 = Shape.next($i3, 514059907 * this.first, -1243953689);
                if (map.length[i3][i][i2] == (byte) 0) {
                    try {
                        next.add(i * (this.size * -254069341), (63 - i2) * (-254069341 * this.size), -254069341 * this.size, -254069341 * this.size, $i3, (byte) 47);
                    } catch (Throwable $r10) {
                        throw StringBuilder.append($r10, "dh.az(" + ')');
                    }
                }
                sparseFieldVector.add(i * (this.size * -254069341), (63 - i2) * (this.size * -254069341), 0, $i3, this.size * -254069341, -254069341 * this.size, map.length[i3][i][i2], map.next[i3][i][i2], next, -730886607);
            }
        }
    }

    void append(int $i0, int i, Map map, SparseFieldVector sparseFieldVector, Vec2 vec2) {
        int $i6;
        int $i7 = map.buffer[0][$i0][i] - 1;
        if (map.start[0][$i0][i] - 1 == -1 && -1 == $i7) {
            next.add((-254069341 * this.size) * $i0, (this.size * -254069341) * (63 - i), this.size * -254069341, -254069341 * this.size, 514059907 * this.first, (byte) -26);
        }
        if (-1 != $i7) {
            $i6 = Shape.next($i7, this.first * 514059907, -1243953689);
        } else {
            $i6 = 16711935;
        }
        if ($i7 <= -1 || map.length[0][$i0][i] != (byte) 0) {
            int $i8 = add($i0, i, map, vec2, (byte) -99);
            if (-1 == $i7) {
                next.add((-254069341 * this.size) * $i0, (63 - i) * (-254069341 * this.size), -254069341 * this.size, this.size * -254069341, $i8, (byte) 57);
                return;
            }
            sparseFieldVector.add($i0 * (-254069341 * this.size), (63 - i) * (this.size * -254069341), $i8, $i6, this.size * -254069341, -254069341 * this.size, map.length[0][$i0][i], map.next[0][$i0][i], next, -2123074064);
            return;
        }
        next.add((this.size * -254069341) * $i0, (63 - i) * (-254069341 * this.size), -254069341 * this.size, -254069341 * this.size, $i6, (byte) -68);
    }

    void append(int i, int i2, Map map, Double[] doubleArr) {
        for (int $i2 = 0; $i2 < -1533544669 * map.data; $i2++) {
            Tags[] $r3 = map.size[$i2][i][i2];
            if (!($r3 == null || $r3.length == 0)) {
                for (Tags $r7 : $r3) {
                    if (JSONObject.get($r7.length * 2134912077, 941019688) || Select.toString($r7.length * 2134912077, 653604806)) {
                        Transaction $r8 = BigInteger.get($r7.value * 1352506155, 1117801238);
                        if (-1 != $r8.pos * -2037709805) {
                            if ($r8.pos * -2037709805 == 46 || -616571427 == -2037709805 * $r8.pos) {
                                next.toString(doubleArr[$r8.pos * -2037709805], (-254069341 * this.size) * i, (642862578 - i2) * (this.size * 1445861948), (this.size * -508138682) + 1, (1129342385 * this.size) + 1, 1223327593);
                            } else {
                                next.toString(doubleArr[$r8.pos * -1582594092], (-485895219 * this.size) * i, (this.size * -254069341) * (-1616975400 - i2), this.size * -508138682, this.size * 1898433661, -329244348);
                            }
                        }
                    }
                }
            }
        }
    }

    void append(int i, int i2, HashSet hashSet, int i3, File file) {
        float $f0 = ((float) i3) / 64.0f;
        for (Complex $r6 : this.length) {
            int $i3 = ($r6.key.data * 1719114399) % 64;
            float $f2 = (float) (($r6.key.value * 1452060195) % 64);
            int $i2 = ((int) (($f2 * $f0) + ((float) i))) * 1162931015;
            i3 = $i2;
            $r6.next = $i2;
            $f2 = (float) (63 - $i3);
            $i2 = ($f2 * $f0) + ((float) i2);
            int i4 = $i2;
            $i2 = ((int) $i2) * 669005663;
            i3 = $i2;
            $r6.size = $i2;
            if (!hashSet.contains(Integer.valueOf(-459008153 * $r6.this$0))) {
                add($r6, $r6.next * 1177898615, 229893279 * $r6.size, $f0, file, -432836291);
            }
        }
    }

    void append(int i, SparseFieldVector sparseFieldVector, ByteArray[] byteArrayArr, Double[] doubleArr) {
        this.size = -2117097973 * i;
        if (this.parent != null || !this.type.isEmpty()) {
            if (((Long) index.get(Buffer.toString(this.this$0 * -319219459, this.value * 1636647367, i, (byte) -55))) == null) {
                Vec2 $r7 = add(this.this$0 * -319219459, this.value * 1636647367, byteArrayArr, 2100062477);
                Long $r4 = new Long(this.size * 919431360, this.size * 919431360);
                cache.add($r4, (byte) -46);
                if (this.parent != null) {
                    add(sparseFieldVector, byteArrayArr, doubleArr, $r7, (byte) -1);
                } else {
                    add(sparseFieldVector, doubleArr, $r7, (byte) 39);
                }
                TIntLinkedList.add($r4, this.this$0 * -319219459, this.value * 1636647367, -254069341 * this.size, 1680032557);
            }
        }
    }

    void append(Complex complex, ByteBufferList byteBufferList, int i, int i2, float f, File file) {
        if (complex.value != null && complex.value.value.write(f, 1840724006)) {
            List list = (List) this.pos.get(complex.value.value);
            list.add(complex.value.data, i - ((-61780877 * complex.value.offset) / 2), i2, complex.value.offset * -61780877, complex.value.index * 957930101, (382144197 * byteBufferList.width) | -16777216, 0, 1, 0, list.this$0 / 2, file);
        }
    }

    void append(Namespace namespace, List list) {
        this.data.clear();
        this.parent = namespace;
        add(0, 0, 64, 64, this.parent, 121363110);
        add(list, -1209425115);
    }

    void decode(int i, int i2, int i3, HashSet $r1, File file) {
        if ($r1 == null) {
            $r1 = new HashSet();
        }
        add(i, i2, $r1, i3, file, -143870488);
        add(i, i2, $r1, i3, file, (byte) 26);
    }

    int get(int $i0, int i, Map map, Vec2 vec2) {
        return map.start[0][$i0][i] == (short) 0 ? 514059907 * this.first : vec2.set($i0, i, 359880751);
    }

    int get(Long longR, AsyncTask asyncTask) {
        switch (-101861059 * asyncTask.value) {
            case 1:
                return 0;
            case 2:
                return (-longR.data) / 2;
            default:
                return -longR.data;
        }
    }

    int get(Long longR, AsyncTask asyncTask, int i) {
        try {
            switch (-101861059 * asyncTask.value) {
                case 1:
                    return 0;
                case 2:
                    return (-longR.data) / 2;
                default:
                    return -longR.data;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "dh.bx(" + ')');
        }
        throw StringBuilder.append($r3, "dh.bx(" + ')');
    }

    int get(Long longR, Hashtable hashtable) {
        switch (870311939 * hashtable.value) {
            case 0:
                return 0;
            case 1:
                break;
            case 2:
                return (-longR.length) / 2;
            default:
                break;
        }
        return -longR.length;
    }

    int get(Long longR, Hashtable hashtable, short s) {
        try {
            switch (870311939 * hashtable.value) {
                case 0:
                    return 0;
                case 1:
                    break;
                case 2:
                    return (-longR.length) / 2;
                default:
                    break;
            }
            return -longR.length;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "dh.bp(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    p000.ByteBufferList get(int r8) {
        /*
        r7 = this;
        r1 = 1362767082; // 0x513a2cea float:4.9976091E10 double:6.732963985E-315;
        r0 = p000.BigInteger.get(r8, r1);
        r2 = r0;
        r3 = r0.size;
        if (r3 == 0) goto L_0x0017;
    L_0x000c:
        r1 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r0 = r0.add(r1);
        r2 = r0;
        if (r0 != 0) goto L_0x0017;
    L_0x0015:
        r4 = 0;
        return r4;
    L_0x0017:
        r8 = r2.buffer;
        r1 = -515416689; // 0xffffffffe1475d8f float:-2.2985273E20 double:NaN;
        r8 = r8 * r1;
        r1 = -1;
        if (r8 == r1) goto L_0x0015;
    L_0x0020:
        r5 = p000.ByteBufferList.data;
        r8 = r2.buffer;
        r1 = -515416689; // 0xffffffffe1475d8f float:-2.2985273E20 double:NaN;
        r8 = r8 * r1;
        r6 = r5[r8];
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: ByteArray.get(int):ByteBufferList");
    }

    ByteBufferList get(int i, int i2) {
        try {
            Transaction $r1 = BigInteger.get(i, 1215270861);
            Transaction $r2 = $r1;
            if ($r1.size != null) {
                $r1 = $r1.add((byte) 31);
                $r2 = $r1;
                if ($r1 == null) {
                    return null;
                }
            }
            return $r2.buffer * -515416689 != -1 ? ByteBufferList.data[$r2.buffer * -515416689] : null;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "dh.bt(" + ')');
        }
    }

    ByteString get(ByteBufferList byteBufferList) {
        if (!(byteBufferList.value == null || this.pos == null)) {
            if (this.pos.get(Msg.data) == null) {
                return null;
            }
            int $i2;
            int $i1 = 990509389 * byteBufferList.text;
            Msg[] $r6 = Msg.get(-229827367);
            for (Msg $r4 : $r6) {
                if ($i1 == $r4.name * -1317326055) {
                    break;
                }
            }
            Msg $r42 = null;
            if ($r42 != null) {
                List $r7 = (List) this.pos.get($r42);
                if ($r7 != null) {
                    String[] $r8 = new String[$r7.add(byteBufferList.value, 1000000)];
                    $r7.add(byteBufferList.value, null, $r8);
                    $i1 = ($r7.this$0 * $r8.length) / 2;
                    $i2 = 0;
                    for (String $r2 : $r8) {
                        int $i3 = $r7.get($r2);
                        if ($i3 > $i2) {
                            $i2 = $i3;
                        }
                    }
                    return new ByteString(byteBufferList.value, $i2, $i1, $r42);
                }
            }
        }
        return null;
    }

    ByteString get(ByteBufferList byteBufferList, int i) {
        i = 0;
        if (byteBufferList.value != null) {
            if (this.pos != null) {
                if (this.pos.get(Msg.data) != null) {
                    Msg $r4;
                    int $i1 = 253714037 * byteBufferList.text;
                    Msg[] $r7 = Msg.get(-229827367);
                    int $i2 = 0;
                    while ($i2 < $r7.length) {
                        try {
                            $r4 = $r7[$i2];
                            if ($i1 == $r4.name * -2001165915) {
                                break;
                            }
                            $i2++;
                        } catch (Throwable $r9) {
                            throw StringBuilder.append($r9, "dh.be(" + ')');
                        }
                    }
                    $r4 = null;
                    if ($r4 == null) {
                        return null;
                    }
                    List $r12 = (List) this.pos.get($r4);
                    if ($r12 == null) {
                        return null;
                    }
                    String[] $r6 = new String[$r12.add(byteBufferList.value, 1000000)];
                    $r12.add(byteBufferList.value, null, $r6);
                    $i1 = ($r12.this$0 * $r6.length) / 2;
                    $i2 = 0;
                    while ($i2 < $r6.length) {
                        int $i4 = $r12.get($r6[$i2]);
                        int $i3 = $i4;
                        if ($i4 <= i) {
                            $i3 = i;
                        }
                        $i2++;
                        i = $i3;
                    }
                    return new ByteString(byteBufferList.value, i, $i1, $r4);
                }
            }
        }
        return null;
    }

    Vec2 get(int i, int i2, ByteArray[] byteArrayArr) {
        Vec2 $r2 = Stream.add(i, i2, (byte) 103);
        if ($r2 != null) {
            return $r2;
        }
        $r2 = add(byteArrayArr, (byte) 34);
        Tools.add($r2, i, i2, -1083974881);
        return $r2;
    }

    List get() {
        LinkedList $r1 = new LinkedList();
        $r1.addAll(this.length);
        $r1.addAll(this.data.values());
        return $r1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.util.List get(int r19, int r20, int r21, int r22, int r23, int r24) {
        /*
        r18 = this;
        r2 = new java.util.LinkedList;
        r2.<init>();	 Catch:{ RuntimeException -> 0x0077 }
        r0 = r22;
        r1 = r19;
        if (r0 < r1) goto L_0x0011;
    L_0x000b:
        r0 = r23;
        r1 = r20;
        if (r0 >= r1) goto L_0x0012;
    L_0x0011:
        return r2;
    L_0x0012:
        r19 = r21 + r19;
        r0 = r22;
        r1 = r19;
        if (r0 >= r1) goto L_0x0022;
    L_0x001a:
        r19 = r21 + r20;
        r0 = r23;
        r1 = r19;
        if (r0 < r1) goto L_0x0061;
    L_0x0022:
        return r2;
    L_0x0023:
        r3 = r4.next();	 Catch:{ RuntimeException -> 0x0077 }
        r6 = r3;
        r6 = (p000.Complex) r6;	 Catch:{ RuntimeException -> 0x0077 }
        r5 = r6;
        r8 = 37802189; // 0x240d0cd float:1.4165855E-37 double:1.8676763E-316;
        r0 = r22;
        r1 = r23;
        r7 = r5.add(r0, r1, r8);	 Catch:{ RuntimeException -> 0x0077 }
        if (r7 == 0) goto L_0x003b;
    L_0x0038:
        r2.add(r5);	 Catch:{ RuntimeException -> 0x0077 }
    L_0x003b:
        r7 = r4.hasNext();	 Catch:{ RuntimeException -> 0x0077 }
        if (r7 != 0) goto L_0x0023;
    L_0x0041:
        return r2;
    L_0x0042:
        r2.add(r5);	 Catch:{ RuntimeException -> 0x0077 }
    L_0x0045:
        r7 = r4.hasNext();	 Catch:{ RuntimeException -> 0x0077 }
        if (r7 == 0) goto L_0x006e;
    L_0x004b:
        r3 = r4.next();	 Catch:{ RuntimeException -> 0x0077 }
        r9 = r3;
        r9 = (p000.Complex) r9;	 Catch:{ RuntimeException -> 0x0077 }
        r5 = r9;
        r8 = 1655908087; // 0x62b326f7 float:1.6523875E21 double:8.181272985E-315;
        r0 = r22;
        r1 = r23;
        r7 = r5.add(r0, r1, r8);	 Catch:{ RuntimeException -> 0x0077 }
        if (r7 == 0) goto L_0x0045;
    L_0x0060:
        goto L_0x0042;
    L_0x0061:
        r0 = r18;
        r10 = r0.data;	 Catch:{ RuntimeException -> 0x0077 }
        r11 = r10.values();	 Catch:{ RuntimeException -> 0x0077 }
        r4 = r11.iterator();	 Catch:{ RuntimeException -> 0x0077 }
        goto L_0x0045;
    L_0x006e:
        r0 = r18;
        r12 = r0.length;	 Catch:{ RuntimeException -> 0x0077 }
        r4 = r12.iterator();	 Catch:{ RuntimeException -> 0x0077 }
        goto L_0x003b;
    L_0x0077:
        r13 = move-exception;
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r15 = "dh.bk(";
        r14 = r14.append(r15);
        r8 = 41;
        r14 = r14.append(r8);
        r16 = r14.toString();
        r0 = r16;
        r17 = p000.StringBuilder.append(r13, r0);
        throw r17;
        */
        throw new UnsupportedOperationException("Method not decompiled: ByteArray.get(int, int, int, int, int, int):java.util.List");
    }

    void get(int $i0, int $i1, int $i2, int i, int i2) {
        $i2 %= 4;
        if ($i2 == 0) {
            try {
                int $i4 = this.size * -254069341;
                i2 = $i4;
                next.add($i4 * $i0, (this.size * -254069341) * (63 - $i1), this.size * -254069341, i, (byte) 1);
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "dh.bn(" + ')');
            }
        }
        if (1 == $i2) {
            $i4 = this.size * -254069341;
            i2 = $i4;
            next.get($i4 * $i0, (this.size * -254069341) * (63 - $i1), this.size * -254069341, i, -955875818);
        }
        if (2 == $i2) {
            $i4 = this.size * -254069341;
            i2 = $i4;
            next.add((($i4 * $i0) + (this.size * -254069341)) - 1, (63 - $i1) * (this.size * -254069341), this.size * -254069341, i, (byte) 1);
        }
        if ($i2 == 3) {
            next.get((this.size * -254069341) * $i0, ((this.size * -254069341) + ((63 - $i1) * (this.size * -254069341))) - 1, this.size * -254069341, i, -1524800953);
        }
    }

    void get(int i, int i2, int i3, int i4, Map map) {
        for (int $i4 = i; $i4 < i3 + i; $i4++) {
            for (int $i5 = i2; $i5 < i4 + i2; $i5++) {
                Method $r2 = new Method(0, $i4, $i5);
                for (int $i6 = 0; $i6 < 1488342300 * map.data; $i6++) {
                    Tags[] $r6 = map.size[$i6][$i4][$i5];
                    if (!($r6 == null || $r6.length == 0)) {
                        int $i7 = 0;
                        while ($i7 < $r6.length) {
                            ByteBufferList $r8 = get($r6[$i7].value * 170252671, -1915340385);
                            if ($r8 == null) {
                                $i7++;
                            } else {
                                Method method = new Method($i6, (-1157891625 * this.this$0) + $i4, (1666216384 * this.value) + $i5);
                                if (this.parent != null) {
                                    Namespace $r15 = this.parent;
                                    $i6 += 45449177 * $r15.height;
                                    $r15 = this.parent;
                                    $i7 = ($r15.index * -1144896625) + $i4;
                                    $r15 = this.parent;
                                    method = new Method($i6, $i7, ($r15.value * 253061184) + $i5);
                                } else {
                                    Map $r9 = (Segment) map;
                                    method = new Method($i6 + ($r9.height * 45449177), (($r9.index * -975640896) + $i4) + ($r9.append(1896532949) * 8), ($r9.getValue((byte) 3) * 8) + (($r9.value * 253061184) + $i5));
                                }
                                Complex complex = new Complex(1733135393 * $r8.this$0, $r10, method, get($r8, 1259924141));
                                HashMap hashMap = this.data;
                                HashMap $r13 = hashMap;
                                hashMap.put($r2, complex);
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    void get(int i, int i2, int i3, File file) {
        Long longR = (Long) index.get(Buffer.toString(this.this$0 * -614232436, this.value * -1440356239, 1147065302 * this.size, (byte) -113));
        if (longR != null) {
            if (this.size * -1983516909 == i3) {
                file.add(longR, i, i2, (byte) -77);
            } else {
                file.toString(longR, i, i2, i3, i3, 1427881578);
            }
        }
    }

    void get(ByteBufferList byteBufferList, int $i0, int $i1, int i, int i2, File file) {
        Long $r3 = byteBufferList.get(false, -1227040608);
        if ($r3 != null) {
            file.get($r3, $i0 - ($r3.length / 2), $i1 - ($r3.data / 2), 2106205673);
            if (i % i2 >= i2 / 2) {
            }
        }
    }

    void get(HashSet hashSet, int i, int i2, File file) {
        for (Complex $r7 : this.data.values()) {
            if (hashSet.contains(Integer.valueOf($r7.this$0 * -459008153))) {
                add(ByteBufferList.data[2015798146 * $r7.this$0], 1177898615 * $r7.next, -1235165714 * $r7.size, i, i2, file, (short) 20321);
            }
        }
        add(hashSet, i, i2, file, (byte) 92);
    }

    void getBytes(int i, int i2, Map map) {
        for (int $i2 = 0; $i2 < 1949339368 * map.data; $i2++) {
            Tags[] $r2 = map.size[$i2][i][i2];
            if (!($r2 == null || $r2.length == 0)) {
                for (Tags $r8 : $r2) {
                    if (StringBuilder.get($r8.length * -272587918, -715960110)) {
                        int $i4 = BigInteger.get($r8.value * 549887215, 1787636133).value * -1193025245 != 0 ? 1835200408 : -435968854;
                        if ($r8.length * 2134912077 == -1010613707 * Action.length.this$0) {
                            get(i, i2, -1998002507 * $r8.data, $i4, 720551355);
                        }
                        int $i6 = $r8.length * 2134912077;
                        int i3 = $i6;
                        if (Action.size.this$0 * -1338500779 == $i6) {
                            get(i, i2, $r8.data * -611763617, TEXT_COLOR, 1961577961);
                            get(i, i2, (-1998002507 * $r8.data) + 1, $i4, 1962655181);
                        }
                        if (-691701134 * Action.value.this$0 == -2125257135 * $r8.length) {
                            if ($r8.data * 1891054597 == 0) {
                                next.get((-1626965234 * this.size) * i, (-2007311264 - i2) * (-599434625 * this.size), 1, $i4, -338474905);
                            }
                            if (-1882728446 * $r8.data == 1) {
                                next.get((((-254069341 * this.size) * i) + (1584079371 * this.size)) - 1, (this.size * -436759729) * (-2130544370 - i2), 1, $i4, -757981585);
                            }
                            if (1553790889 * $r8.data == 2) {
                                $i6 = this.size * 361286633;
                                i3 = $i6;
                                next.get((((-254069341 * this.size) * i) + $i6) - 1, ((246673870 * this.size) + ((-1987637127 * this.size) * (63 - i2))) - 1, 1, $i4, -407436314);
                            }
                            if (3 == -1998002507 * $r8.data) {
                                next.get((-1316140558 * this.size) * i, ((this.size * -1324969160) + ((this.size * 161196563) * (1842827473 - i2))) - 1, 1, $i4, -1072484351);
                            }
                        }
                        if (2134912077 * $r8.length == -1861957465 * Action.data.this$0) {
                            int $i5;
                            if ((-1998002507 * $r8.data) % 2 == 0) {
                                $i5 = 0;
                                while (true) {
                                    $i6 = this.size * -254069341;
                                    i3 = $i6;
                                    if ($i5 >= $i6) {
                                        break;
                                    }
                                    $i6 = this.size * 1801404860;
                                    i3 = $i6;
                                    $i6 *= i;
                                    i3 = $i6;
                                    next.get($i6 + $i5, (((64 - i2) * (-254069341 * this.size)) - 1) - $i5, 1, $i4, -65491171);
                                    $i5++;
                                }
                            } else {
                                for ($i5 = 0; $i5 < -662991763 * this.size; $i5++) {
                                    $i6 = this.size * 1450313320;
                                    i3 = $i6;
                                    $i6 *= i;
                                    i3 = $i6;
                                    i3 = $i6 + $i5;
                                    $i6 = (63 - i2) * (1119792719 * this.size);
                                    int i4 = $i6;
                                    next.get(i3, $i6 + $i5, 1, $i4, 80583811);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    ByteString getData(int i) {
        return get(ByteBufferList.data[i], 1993359359);
    }

    void getData(HashSet hashSet, List list) {
        this.data.clear();
        Iterator $r4 = hashSet.iterator();
        while ($r4.hasNext()) {
            Map $r6 = (Segment) $r4.next();
            if ($r6.size(2045859972) == -319219459 * this.this$0 && $r6.getEntry(-1891580190) == 1636647367 * this.value) {
                LinkedList $r7 = this.type;
                $r7.add($r6);
                add($r6.getValue(-1694116737) * 8, $r6.next(-1741252353) * 8, 8, 8, $r6, -1284106426);
            }
        }
        add(list, -959296306);
    }

    void getData(ByteArray[] byteArrayArr, BlockFieldMatrix blockFieldMatrix) {
        Binding[] $r3 = new Binding[]{Binding.settings, Binding.index, Binding.f17c, Binding.cache, Binding.context, Binding.buffer, Binding.data, Binding.id};
        for (Binding $r4 : $r3) {
            if (byteArrayArr[$r4.get(1786356488)] != null) {
                byte $b3 = (byte) 0;
                byte $b2 = (byte) 0;
                int $i4 = 1227236096;
                int $i1 = -1706193909;
                int i = 0;
                int i2 = 0;
                switch ($r4.blocks * -1954035562) {
                    case 0:
                        $b2 = (byte) 59;
                        $i1 = 5;
                        $b3 = (byte) 59;
                        $i4 = 5;
                        break;
                    case 1:
                        $b2 = (byte) 59;
                        $i1 = 5;
                        i = 451341788;
                        $i4 = 5;
                        break;
                    case 2:
                        i = 59;
                        $i4 = 5;
                        break;
                    case 3:
                        i2 = 442826123;
                        $i1 = 5;
                        $b3 = (byte) 59;
                        $i4 = 5;
                        break;
                    case 4:
                        $b3 = (byte) 59;
                        $i4 = 5;
                        break;
                    case 5:
                        i2 = 2117090659;
                        $i1 = 5;
                        break;
                    case 6:
                        i = 59;
                        i2 = 2098850577;
                        $i4 = 5;
                        $i1 = 5;
                        break;
                    case 7:
                        $b2 = (byte) 59;
                        $i1 = 5;
                        break;
                    default:
                        break;
                }
                add(i, i2, $b3, $b2, $i4, $i1, byteArrayArr[$r4.get(1317120273)], blockFieldMatrix, -1158603128);
            }
        }
    }

    void getSize(int i, int i2, int i3, File file) {
        Long longR = (Long) index.get(Buffer.toString(this.this$0 * -319219459, this.value * 1636647367, 1057260018 * this.size, (byte) -37));
        if (longR != null) {
            if (this.size * 1937240413 == i3) {
                file.add(longR, i, i2, (byte) -26);
            } else {
                file.toString(longR, i, i2, i3, i3, -1294971557);
            }
        }
    }

    int getValue(Long longR, Hashtable hashtable) {
        switch (870311939 * hashtable.value) {
            case 0:
                return 0;
            case 1:
                break;
            case 2:
                return (-longR.length) / 2;
            default:
                break;
        }
        return -longR.length;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.util.List getValue(int r14, int r15, int r16, int r17, int r18) {
        /*
        r13 = this;
        r2 = new java.util.LinkedList;
        r2.<init>();
        r0 = r17;
        if (r0 < r14) goto L_0x000d;
    L_0x0009:
        r0 = r18;
        if (r0 >= r15) goto L_0x005d;
    L_0x000d:
        return r2;
    L_0x000e:
        r3 = r13.length;
        r4 = r3.iterator();
    L_0x0014:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0069;
    L_0x001a:
        r6 = r4.next();
        r8 = r6;
        r8 = (p000.Complex) r8;
        r7 = r8;
        r9 = 1365980693; // 0x516b3615 float:6.3139041E10 double:6.748841333E-315;
        r0 = r17;
        r1 = r18;
        r5 = r7.add(r0, r1, r9);
        if (r5 == 0) goto L_0x0014;
    L_0x002f:
        r2.add(r7);
        goto L_0x0014;
    L_0x0033:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x000e;
    L_0x0039:
        r6 = r4.next();
        r10 = r6;
        r10 = (p000.Complex) r10;
        r7 = r10;
        r9 = 581305353; // 0x22a60409 float:4.4998663E-18 double:2.872030047E-315;
        r0 = r17;
        r1 = r18;
        r5 = r7.add(r0, r1, r9);
        if (r5 == 0) goto L_0x0033;
    L_0x004e:
        r2.add(r7);
        goto L_0x0033;
    L_0x0052:
        r11 = r13.data;
        r12 = r11.values();
        r4 = r12.iterator();
        goto L_0x0033;
    L_0x005d:
        r14 = r16 + r14;
        r0 = r17;
        if (r0 >= r14) goto L_0x0069;
    L_0x0063:
        r14 = r16 + r15;
        r0 = r18;
        if (r0 < r14) goto L_0x0052;
    L_0x0069:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: ByteArray.getValue(int, int, int, int, int):java.util.List");
    }

    ByteString isEmpty(int i) {
        return get(ByteBufferList.data[i], 302479548);
    }

    void load(HashSet hashSet, int i, int i2, File file) {
        for (Complex $r7 : this.data.values()) {
            if (hashSet.contains(Integer.valueOf($r7.this$0 * -459008153))) {
                add(ByteBufferList.data[$r7.this$0 * -459008153], 115880560 * $r7.next, -832156130 * $r7.size, i, i2, file, (short) 13870);
            }
        }
        add(hashSet, i, i2, file, (byte) 71);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.util.List parse(int r14, int r15, int r16, int r17, int r18) {
        /*
        r13 = this;
        r2 = new java.util.LinkedList;
        r2.<init>();
        r0 = r17;
        if (r0 < r14) goto L_0x000d;
    L_0x0009:
        r0 = r18;
        if (r0 >= r15) goto L_0x004c;
    L_0x000d:
        return r2;
    L_0x000e:
        r2.add(r3);
    L_0x0011:
        r4 = r5.hasNext();
        if (r4 == 0) goto L_0x006b;
    L_0x0017:
        r6 = r5.next();
        r7 = r6;
        r7 = (p000.Complex) r7;
        r3 = r7;
        r8 = 898666641; // 0x35909091 float:1.077091E-6 double:4.440003144E-315;
        r0 = r17;
        r1 = r18;
        r4 = r3.add(r0, r1, r8);
        if (r4 == 0) goto L_0x0011;
    L_0x002c:
        goto L_0x000e;
    L_0x002d:
        r4 = r5.hasNext();
        if (r4 == 0) goto L_0x0064;
    L_0x0033:
        r6 = r5.next();
        r9 = r6;
        r9 = (p000.Complex) r9;
        r3 = r9;
        r8 = 1769658798; // 0x697ad9ae float:1.8953714E25 double:8.74327617E-315;
        r0 = r17;
        r1 = r18;
        r4 = r3.add(r0, r1, r8);
        if (r4 == 0) goto L_0x002d;
    L_0x0048:
        r2.add(r3);
        goto L_0x002d;
    L_0x004c:
        r14 = r16 + r14;
        r0 = r17;
        if (r0 >= r14) goto L_0x0058;
    L_0x0052:
        r14 = r16 + r15;
        r0 = r18;
        if (r0 < r14) goto L_0x0059;
    L_0x0058:
        return r2;
    L_0x0059:
        r10 = r13.data;
        r11 = r10.values();
        r5 = r11.iterator();
        goto L_0x002d;
    L_0x0064:
        r12 = r13.length;
        r5 = r12.iterator();
        goto L_0x0011;
    L_0x006b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: ByteArray.parse(int, int, int, int, int):java.util.List");
    }

    Vec2 plus(int i, int i2, ByteArray[] byteArrayArr) {
        Vec2 $r2 = Stream.add(i, i2, (byte) 120);
        if ($r2 != null) {
            return $r2;
        }
        $r2 = add(byteArrayArr, (byte) -36);
        Tools.add($r2, i, i2, -1083974881);
        return $r2;
    }

    int read(int $i0, int i) {
        if (this.parent != null) {
            return this.parent.get($i0, i, (short) -15388);
        }
        if (!this.type.isEmpty()) {
            Iterator $r3 = this.type.iterator();
            while ($r3.hasNext()) {
                Segment $r5 = (Segment) $r3.next();
                if ($r5.next($i0, i, (short) 270)) {
                    return $r5.get($i0, i, (short) 10210);
                }
            }
        }
        return -1;
    }

    ByteBufferList read(int i) {
        Transaction $r1 = BigInteger.get(i, 1574060458);
        Transaction $r2 = $r1;
        if ($r1.size != null) {
            $r1 = $r1.add((byte) 76);
            $r2 = $r1;
            if ($r1 == null) {
                return null;
            }
        }
        return $r2.buffer * 335015664 != -1 ? ByteBufferList.data[$r2.buffer * -515416689] : null;
    }

    void read(HashSet hashSet, int i, int i2, File file) {
        for (Complex $r6 : this.length) {
            ByteBufferList $r8 = ByteBufferList.data[-1762216415 * $r6.this$0];
            if ($r8 != null && hashSet.contains(Integer.valueOf($r8.size(47412110)))) {
                add($r8, 1177898615 * $r6.next, 485758937 * $r6.size, i, i2, file, (short) -4905);
            }
        }
    }

    int remove(int $i0, int i) {
        if (this.parent != null) {
            return this.parent.get($i0, i, (short) 12811);
        }
        if (!this.type.isEmpty()) {
            Iterator $r5 = this.type.iterator();
            while ($r5.hasNext()) {
                Segment $r3 = (Segment) $r5.next();
                if ($r3.next($i0, i, (short) 270)) {
                    return $r3.get($i0, i, (short) -385);
                }
            }
        }
        return -1;
    }

    int set(int $i0, int i, Map map, Vec2 vec2) {
        return map.start[0][$i0][i] == (short) 0 ? 514059907 * this.first : vec2.set($i0, i, 727281278);
    }

    int set(Long longR, AsyncTask asyncTask) {
        switch (-101861059 * asyncTask.value) {
            case 1:
                return 0;
            case 2:
                return (-longR.data) / 2;
            default:
                return -longR.data;
        }
    }

    int set(Long longR, Hashtable hashtable) {
        switch (1975153051 * hashtable.value) {
            case 0:
                return 0;
            case 1:
                break;
            case 2:
                return (-longR.length) / 2;
            default:
                break;
        }
        return -longR.length;
    }

    List set() {
        LinkedList $r1 = new LinkedList();
        $r1.addAll(this.length);
        $r1.addAll(this.data.values());
        return $r1;
    }

    List set(int i) {
        try {
            LinkedList $r1 = new LinkedList();
            $r1.addAll(this.length);
            $r1.addAll(this.data.values());
            return $r1;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "dh.by(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.util.List set(int r14, int r15, int r16, int r17, int r18) {
        /*
        r13 = this;
        r2 = new java.util.LinkedList;
        r2.<init>();
        r0 = r17;
        if (r0 < r14) goto L_0x000d;
    L_0x0009:
        r0 = r18;
        if (r0 >= r15) goto L_0x000e;
    L_0x000d:
        return r2;
    L_0x000e:
        r14 = r16 + r14;
        r0 = r17;
        if (r0 >= r14) goto L_0x001a;
    L_0x0014:
        r14 = r16 + r15;
        r0 = r18;
        if (r0 < r14) goto L_0x005a;
    L_0x001a:
        return r2;
    L_0x001b:
        r2.add(r3);
    L_0x001e:
        r4 = r5.hasNext();
        if (r4 == 0) goto L_0x003a;
    L_0x0024:
        r6 = r5.next();
        r7 = r6;
        r7 = (p000.Complex) r7;
        r3 = r7;
        r8 = 1383936253; // 0x527d30fd float:2.71862153E11 double:6.837553586E-315;
        r0 = r17;
        r1 = r18;
        r4 = r3.add(r0, r1, r8);
        if (r4 == 0) goto L_0x001e;
    L_0x0039:
        goto L_0x001b;
    L_0x003a:
        return r2;
    L_0x003b:
        r4 = r5.hasNext();
        if (r4 == 0) goto L_0x0065;
    L_0x0041:
        r6 = r5.next();
        r9 = r6;
        r9 = (p000.Complex) r9;
        r3 = r9;
        r8 = 2048476279; // 0x7a194477 float:1.9895251E35 double:1.012081756E-314;
        r0 = r17;
        r1 = r18;
        r4 = r3.add(r0, r1, r8);
        if (r4 == 0) goto L_0x003b;
    L_0x0056:
        r2.add(r3);
        goto L_0x003b;
    L_0x005a:
        r10 = r13.data;
        r11 = r10.values();
        r5 = r11.iterator();
        goto L_0x003b;
    L_0x0065:
        r12 = r13.length;
        r5 = r12.iterator();
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: ByteArray.set(int, int, int, int, int):java.util.List");
    }

    void set(int $i0, int $i1, int $i2, int i) {
        $i2 %= 4;
        if ($i2 == 0) {
            next.add((this.size * 1724739381) * $i0, (this.size * -1450992696) * (1350801894 - $i1), -460793569 * this.size, i, (byte) 1);
        }
        if (1 == $i2) {
            next.get((-722395533 * this.size) * $i0, (this.size * -254069341) * (-1363849157 - $i1), this.size * -254069341, i, -1596624153);
        }
        if (2 == $i2) {
            next.add((((this.size * -59553146) * $i0) + (this.size * -254069341)) - 1, (-223351169 - $i1) * (this.size * -254069341), this.size * -254069341, i, (byte) 1);
        }
        if ($i2 == 3) {
            next.get((75525205 * this.size) * $i0, ((1050922366 * this.size) + ((63 - $i1) * (this.size * -254069341))) - 1, this.size * -254069341, i, -2116831254);
        }
    }

    void set(int i, int i2, int i3, File file) {
        Long longR = (Long) index.get(Buffer.toString(this.this$0 * -319219459, this.value * 1636647367, -254069341 * this.size, (byte) -86));
        if (longR != null) {
            if (this.size * 919431360 == i3) {
                file.add(longR, i, i2, (byte) -8);
            } else {
                file.toString(longR, i, i2, i3, i3, 1529111346);
            }
        }
    }

    void set(int i, int i2, int i3, HashSet $r1, File file) {
        if ($r1 == null) {
            $r1 = new HashSet();
        }
        add(i, i2, $r1, i3, file, 845258092);
        add(i, i2, $r1, i3, file, (byte) -86);
    }

    void set(int i, int i2, HashSet hashSet, int i3, File file) {
        float $f0 = ((float) i3) / 64.0f;
        for (Complex $r6 : this.length) {
            int $i3 = ($r6.key.data * 1719114399) % 64;
            float $f2 = (float) (($r6.key.value * 1452060195) % 64);
            int $i2 = ((int) (($f2 * $f0) + ((float) i))) * 1162931015;
            i3 = $i2;
            $r6.next = $i2;
            $f2 = (float) (63 - $i3);
            $i2 = ($f2 * $f0) + ((float) i2);
            int i4 = $i2;
            $i2 = ((int) $i2) * 669005663;
            i3 = $i2;
            $r6.size = $i2;
            if (!hashSet.contains(Integer.valueOf(-459008153 * $r6.this$0))) {
                add($r6, $r6.next * 1177898615, 229893279 * $r6.size, $f0, file, 2061124048);
            }
        }
    }

    void set(int i, SparseFieldVector sparseFieldVector, ByteArray[] byteArrayArr, Double[] doubleArr) {
        this.size = -2117097973 * i;
        if (this.parent != null || !this.type.isEmpty()) {
            if (((Long) index.get(Buffer.toString(this.this$0 * -319219459, this.value * 1636647367, i, (byte) -43))) == null) {
                Vec2 $r7 = add(this.this$0 * -319219459, this.value * 1636647367, byteArrayArr, 2100062477);
                Long $r4 = new Long(this.size * 919431360, this.size * 919431360);
                cache.add($r4, (byte) 76);
                if (this.parent != null) {
                    add(sparseFieldVector, byteArrayArr, doubleArr, $r7, (byte) -55);
                } else {
                    add(sparseFieldVector, doubleArr, $r7, (byte) -83);
                }
                TIntLinkedList.add($r4, this.this$0 * -319219459, this.value * 1636647367, -254069341 * this.size, 1233008486);
            }
        }
    }

    void set(Complex complex, int i, int i2, float f, File file) {
        ByteBufferList $r4 = ByteBufferList.data[-459008153 * complex.this$0];
        add($r4, i, i2, file, 831731154);
        add(complex, $r4, i, i2, f, file, 223418735);
    }

    void set(Complex complex, ByteBufferList byteBufferList, int i, int i2, float f, File file) {
        if (complex.value != null && complex.value.value.write(f, 1840724006)) {
            List list = (List) this.pos.get(complex.value.value);
            list.add(complex.value.data, i - ((-61780877 * complex.value.offset) / 2), i2, complex.value.offset * -61780877, complex.value.index * 957930101, (382144197 * byteBufferList.width) | -16777216, 0, 1, 0, list.this$0 / 2, file);
        }
    }

    void set(Namespace namespace, List list) {
        this.data.clear();
        this.parent = namespace;
        add(0, 0, -1191573637, 64, this.parent, -543467759);
        add(list, -904712538);
    }

    void set(SparseFieldVector sparseFieldVector, Double[] doubleArr, Vec2 vec2) {
        int $i0;
        Iterator $r5 = this.type.iterator();
        while ($r5.hasNext()) {
            Map $r7 = (Segment) $r5.next();
            for ($i0 = $r7.getValue(-2077144605) * 8; $i0 < ($r7.getValue(-1805360645) * 8) + 8; $i0++) {
                int $i1;
                for ($i1 = $r7.next(-1741252353) * 8; $i1 < ($r7.next(-1741252353) * 8) + 8; $i1++) {
                    add($i0, $i1, $r7, sparseFieldVector, vec2, 653505186);
                    append($i0, $i1, $r7, sparseFieldVector, -1321186665);
                }
            }
        }
        $r5 = this.type.iterator();
        while ($r5.hasNext()) {
            $r7 = (Segment) $r5.next();
            for ($i0 = $r7.getValue(-1507366978) * 8; $i0 < ($r7.getValue(-1675927535) * 8) + 8; $i0++) {
                for ($i1 = $r7.next(-1741252353) * 8; $i1 < ($r7.next(-1741252353) * 8) + 8; $i1++) {
                    add($i0, $i1, $r7, sparseFieldVector, doubleArr, (byte) 7);
                }
            }
        }
    }

    void set(HashSet hashSet, int i, int i2, File file) {
        for (Complex $r7 : this.data.values()) {
            if (hashSet.contains(Integer.valueOf($r7.this$0 * -459008153))) {
                add(ByteBufferList.data[404720025 * $r7.this$0], 6698318 * $r7.next, -725449633 * $r7.size, i, i2, file, (short) 1898);
            }
        }
        add(hashSet, i, i2, file, (byte) -76);
    }

    int size(int $i0, int i) {
        if (this.parent != null) {
            return this.parent.get($i0, i, (short) 19931);
        }
        if (!this.type.isEmpty()) {
            Iterator $r5 = this.type.iterator();
            while ($r5.hasNext()) {
                Segment $r3 = (Segment) $r5.next();
                if ($r3.next($i0, i, (short) 270)) {
                    return $r3.get($i0, i, (short) -11366);
                }
            }
        }
        return -1;
    }

    int size(int $i0, int i, Map map, Vec2 vec2) {
        return map.start[0][$i0][i] == (short) 0 ? 514059907 * this.first : vec2.set($i0, i, 1121644436);
    }

    void toArray(int i, int i2, Map map, SparseFieldVector sparseFieldVector) {
        for (int $i3 = 1; $i3 < map.data * -1533544669; $i3++) {
            int $i2 = map.buffer[$i3][i][i2] - 1;
            if ($i2 > -1) {
                $i2 = Shape.next($i2, -1307534619 * this.first, -1243953689);
                if (map.length[$i3][i][i2] == (byte) 0) {
                    next.add(i * (this.size * 51207413), (63 - i2) * (-87623506 * this.size), 1345508129 * this.size, -1331743192 * this.size, $i2, (byte) 114);
                } else {
                    sparseFieldVector.add(i * (this.size * -1363559556), (63 - i2) * (this.size * 1407406020), 0, $i2, this.size * -254069341, -808556431 * this.size, map.length[$i3][i][i2], map.next[$i3][i][i2], next, -638441419);
                }
            }
        }
    }

    int toString(int $i0, int i) {
        if (this.parent != null) {
            return this.parent.get($i0, i, (short) -10899);
        }
        if (!this.type.isEmpty()) {
            Iterator $r3 = this.type.iterator();
            while ($r3.hasNext()) {
                Segment $r5 = (Segment) $r3.next();
                if ($r5.next($i0, i, (short) 270)) {
                    return $r5.get($i0, i, (short) 13882);
                }
            }
        }
        return -1;
    }

    ByteString toString(ByteBufferList byteBufferList) {
        if (!(byteBufferList.value == null || this.pos == null)) {
            if (this.pos.get(Msg.data) == null) {
                return null;
            }
            int $i2;
            int $i1 = 253714037 * byteBufferList.text;
            Msg[] $r8 = Msg.get(-229827367);
            for (Msg $r4 : $r8) {
                if ($i1 == $r4.name * -2001165915) {
                    break;
                }
            }
            Msg $r42 = null;
            if ($r42 == null) {
                return null;
            }
            List $r6 = (List) this.pos.get($r42);
            if ($r6 != null) {
                String[] $r7 = new String[$r6.add(byteBufferList.value, 1000000)];
                $r6.add(byteBufferList.value, null, $r7);
                $i1 = ($r6.this$0 * $r7.length) / 2;
                $i2 = 0;
                for (String $r2 : $r7) {
                    int $i3 = $r6.get($r2);
                    if ($i3 > $i2) {
                        $i2 = $i3;
                    }
                }
                return new ByteString(byteBufferList.value, $i2, $i1, $r42);
            }
        }
        return null;
    }

    void toString(int i, int i2, int i3, int i4, Map map) {
        for (int $i4 = i; $i4 < i3 + i; $i4++) {
            for (int $i5 = i2; $i5 < i4 + i2; $i5++) {
                Method $r2 = new Method(0, $i4, $i5);
                for (int $i6 = 0; $i6 < 744519155 * map.data; $i6++) {
                    Tags[] $r6 = map.size[$i6][$i4][$i5];
                    if (!($r6 == null || $r6.length == 0)) {
                        int $i7 = 0;
                        while ($i7 < $r6.length) {
                            ByteBufferList $r8 = get($r6[$i7].value * 1303316682, 70332243);
                            if ($r8 == null) {
                                $i7++;
                            } else {
                                Method method = new Method($i6, (967067891 * this.this$0) + $i4, (1666216384 * this.value) + $i5);
                                if (this.parent != null) {
                                    Namespace $r15 = this.parent;
                                    $i6 += 45449177 * $r15.height;
                                    $r15 = this.parent;
                                    $i7 = ($r15.index * -975640896) + $i4;
                                    $r15 = this.parent;
                                    method = new Method($i6, $i7, ($r15.value * 253061184) + $i5);
                                } else {
                                    Map $r9 = (Segment) map;
                                    method = new Method($i6 + ($r9.height * 1356523658), (($r9.index * 422360699) + $i4) + ($r9.append(974268491) * 8), ($r9.getValue((byte) 3) * 8) + (($r9.value * 351471919) + $i5));
                                }
                                Complex complex = new Complex(1733135393 * $r8.this$0, $r10, method, get($r8, 1491495661));
                                HashMap hashMap = this.data;
                                HashMap $r13 = hashMap;
                                hashMap.put($r2, complex);
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    void toString(int i, int i2, Map map, SparseFieldVector sparseFieldVector) {
        for (int $i3 = 1; $i3 < map.data * -1533544669; $i3++) {
            int $i2 = map.buffer[$i3][i][i2] - 1;
            if ($i2 > -1) {
                $i2 = Shape.next($i2, 514059907 * this.first, -1243953689);
                if (map.length[$i3][i][i2] == (byte) 0) {
                    next.add(i * (this.size * 1581411202), (365475502 - i2) * (-254069341 * this.size), 2119228138 * this.size, 1372092233 * this.size, $i2, (byte) 28);
                } else {
                    sparseFieldVector.add(i * (this.size * -254069341), (63 - i2) * (this.size * -254069341), 0, $i2, this.size * -254069341, -254069341 * this.size, map.length[$i3][i][i2], map.next[$i3][i][i2], next, -1779759065);
                }
            }
        }
    }

    void toString(int i, int i2, Map map, Double[] doubleArr) {
        for (int $i2 = 0; $i2 < -1533544669 * map.data; $i2++) {
            Tags[] $r3 = map.size[$i2][i][i2];
            if (!($r3 == null || $r3.length == 0)) {
                for (Tags $r7 : $r3) {
                    if (JSONObject.get($r7.length * 2134912077, 1626710343) || Select.toString($r7.length * 2134912077, 105120075)) {
                        Transaction $r8 = BigInteger.get($r7.value * 1352506155, 1441371117);
                        if (-1 != $r8.pos * -2037709805) {
                            if ($r8.pos * -2037709805 == 46 || 52 == -2037709805 * $r8.pos) {
                                next.toString(doubleArr[$r8.pos * -2037709805], (-254069341 * this.size) * i, (63 - i2) * (this.size * -254069341), (this.size * -508138682) + 1, (-508138682 * this.size) + 1, 621737704);
                            } else {
                                next.toString(doubleArr[$r8.pos * -2037709805], (-254069341 * this.size) * i, (this.size * -254069341) * (63 - i2), this.size * -508138682, this.size * -508138682, -442811920);
                            }
                        }
                    }
                }
            }
        }
    }

    void toString(int i, int i2, Map map, Double[] doubleArr, int i3) {
        for (i3 = 0; i3 < -1533544669 * map.data; i3++) {
            Tags[] $r3 = map.size[i3][i][i2];
            if ($r3 != null) {
                if ($r3.length == 0) {
                    continue;
                } else {
                    for (Tags $r7 : $r3) {
                        if (!JSONObject.get($r7.length * 2134912077, 986650922)) {
                            if (!Select.toString($r7.length * 2134912077, 784944700)) {
                                continue;
                            }
                        }
                        Transaction $r8 = BigInteger.get($r7.value * 1352506155, 1900984712);
                        if (-1 != $r8.pos * -2037709805) {
                            if ($r8.pos * -2037709805 != 46) {
                                if (52 != -2037709805 * $r8.pos) {
                                    next.toString(doubleArr[$r8.pos * -2037709805], (-254069341 * this.size) * i, (this.size * -254069341) * (63 - i2), this.size * -508138682, this.size * -508138682, -262160100);
                                }
                            }
                            try {
                                next.toString(doubleArr[$r8.pos * -2037709805], (-254069341 * this.size) * i, (63 - i2) * (this.size * -254069341), (this.size * -508138682) + 1, (-508138682 * this.size) + 1, 429367108);
                            } catch (RuntimeException $r11) {
                                throw StringBuilder.append($r11, "dh.ac(" + ')');
                            }
                        }
                        continue;
                    }
                    continue;
                }
            }
        }
    }

    void toString(Complex complex, ByteBufferList byteBufferList, int i, int i2, float f, File file) {
        if (complex.value != null && complex.value.value.write(f, 1840724006)) {
            List list = (List) this.pos.get(complex.value.value);
            list.add(complex.value.data, i - ((-61780877 * complex.value.offset) / 2), i2, complex.value.offset * -61780877, complex.value.index * 957930101, (382144197 * byteBufferList.width) | -16777216, 0, 1, 0, list.this$0 / 2, file);
        }
    }

    Vec2 update(int i, int i2, ByteArray[] byteArrayArr) {
        Vec2 $r2 = Stream.add(i, i2, (byte) 104);
        if ($r2 != null) {
            return $r2;
        }
        $r2 = add(byteArrayArr, (byte) 27);
        Tools.add($r2, i, i2, -1083974881);
        return $r2;
    }

    void write(int i, int i2, HashSet hashSet, int i3, File file) {
        float $f0 = ((float) i3) / 64.0f;
        float $f1 = $f0 / 2.0f;
        for (Entry entry : this.data.entrySet()) {
            Method $r8 = (Method) entry.getKey();
            float $f3 = $r8.value * 1452060195;
            float f = $f3;
            $f3 = (float) $f3;
            $f3 = ((float) i) + ($f3 * $f0);
            float f2 = $f3;
            $f3 -= $f1;
            f2 = $f3;
            int $i3 = (int) $f3;
            int $i4 = $r8.data * 1719114399;
            int i4 = $i4;
            $f3 = (float) $i4;
            $f3 = ((float) (i3 + i2)) - ($f3 * $f0);
            f2 = $f3;
            $f3 -= $f1;
            f2 = $f3;
            i4 = (int) $f3;
            Complex $r9 = (Complex) entry.getValue();
            if ($r9 != null) {
                $r9.next = 1162931015 * $i3;
                $r9.size = 669005663 * i4;
                if (!hashSet.contains(Integer.valueOf(ByteBufferList.data[-459008153 * $r9.this$0].size(36342295)))) {
                    add($r9, $i3, i4, $f0, file, -2055492056);
                }
            }
        }
    }

    void write(Complex complex, ByteBufferList byteBufferList, int i, int i2, float f, File file) {
        if (complex.value != null && complex.value.value.write(f, 1840724006)) {
            List list = (List) this.pos.get(complex.value.value);
            list.add(complex.value.data, i - ((-61780877 * complex.value.offset) / 2), i2, complex.value.offset * -61780877, complex.value.index * 957930101, (2130725078 * byteBufferList.width) | -205551778, 0, 1, 0, list.this$0 / 2, file);
        }
    }

    void write(ByteArray[] byteArrayArr, BlockFieldMatrix blockFieldMatrix) {
        Binding[] $r3 = new Binding[]{Binding.settings, Binding.index, Binding.f17c, Binding.cache, Binding.context, Binding.buffer, Binding.data, Binding.id};
        for (Binding $r4 : $r3) {
            if (byteArrayArr[$r4.get(1539299449)] != null) {
                byte b = (byte) 0;
                byte $b2 = (byte) 0;
                byte $b5 = (byte) 64;
                byte $b3 = (byte) 64;
                byte $b4 = (byte) 0;
                byte $b6 = (byte) 0;
                switch ($r4.blocks * 582346959) {
                    case 0:
                        $b2 = (byte) 59;
                        $b3 = (byte) 5;
                        b = (byte) 59;
                        $b5 = (byte) 5;
                        break;
                    case 1:
                        $b2 = (byte) 59;
                        $b3 = (byte) 5;
                        $b4 = (byte) 59;
                        $b5 = (byte) 5;
                        break;
                    case 2:
                        $b4 = (byte) 59;
                        $b5 = (byte) 5;
                        break;
                    case 3:
                        $b6 = (byte) 59;
                        $b3 = (byte) 5;
                        b = (byte) 59;
                        $b5 = (byte) 5;
                        break;
                    case 4:
                        b = (byte) 59;
                        $b5 = (byte) 5;
                        break;
                    case 5:
                        $b6 = (byte) 59;
                        $b3 = (byte) 5;
                        break;
                    case 6:
                        $b4 = (byte) 59;
                        $b6 = (byte) 59;
                        $b5 = (byte) 5;
                        $b3 = (byte) 5;
                        break;
                    case 7:
                        $b2 = (byte) 59;
                        $b3 = (byte) 5;
                        break;
                    default:
                        break;
                }
                add($b4, $b6, b, $b2, $b5, $b3, byteArrayArr[$r4.get(1295788346)], blockFieldMatrix, -1146167580);
            }
        }
    }

    void write(ByteArray[] byteArrayArr, BlockFieldMatrix blockFieldMatrix, short s) {
        try {
            Binding[] $r3 = new Binding[8];
            $r3[0] = Binding.settings;
            $r3[1] = Binding.index;
            $r3[2] = Binding.f17c;
            $r3[3] = Binding.cache;
            $r3[4] = Binding.context;
            $r3[5] = Binding.buffer;
            $r3[6] = Binding.data;
            $r3[7] = Binding.id;
            for (Binding $r4 : $r3) {
                if (byteArrayArr[$r4.get(1979877089)] != null) {
                    byte b = (byte) 0;
                    byte $b5 = (byte) 0;
                    byte $b4 = (byte) 64;
                    byte $b6 = (byte) 64;
                    byte $b3 = (byte) 0;
                    byte b2 = (byte) 0;
                    switch ($r4.blocks * 582346959) {
                        case 0:
                            $b5 = (byte) 59;
                            $b6 = (byte) 5;
                            b = (byte) 59;
                            $b4 = (byte) 5;
                            break;
                        case 1:
                            $b5 = (byte) 59;
                            $b6 = (byte) 5;
                            $b3 = (byte) 59;
                            $b4 = (byte) 5;
                            break;
                        case 2:
                            $b3 = (byte) 59;
                            $b4 = (byte) 5;
                            break;
                        case 3:
                            b2 = (byte) 59;
                            $b6 = (byte) 5;
                            b = (byte) 59;
                            $b4 = (byte) 5;
                            break;
                        case 4:
                            b = (byte) 59;
                            $b4 = (byte) 5;
                            break;
                        case 5:
                            b2 = (byte) 59;
                            $b6 = (byte) 5;
                            break;
                        case 6:
                            $b3 = (byte) 59;
                            b2 = (byte) 59;
                            $b4 = (byte) 5;
                            $b6 = (byte) 5;
                            break;
                        case 7:
                            $b5 = (byte) 59;
                            $b6 = (byte) 5;
                            break;
                        default:
                            break;
                    }
                    add($b3, b2, b, $b5, $b4, $b6, byteArrayArr[$r4.get(1391537140)], blockFieldMatrix, 244003614);
                }
            }
        } catch (Throwable $r6) {
            throw StringBuilder.append($r6, "dh.ao(" + ')');
        }
    }
}
