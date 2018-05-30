package p000;

import java.util.zip.CRC32;

/* compiled from: jw */
public class MappedRandomAccessFile {
    public static Math $assertionsDisabled = new Math(ScrollingTextView.MP3_MAX_INPUT_SIZE);
    public static Headers buffer;
    public static int count = 0;
    public static Math cursor = new Math(ScrollingTextView.MP3_MAX_INPUT_SIZE);
    public static int data = 0;
    public static HttpRequest[] flags = new HttpRequest[256];
    public static Math index = new Math(32);
    public static int length = 0;
    public static Logger log = new Logger(8);
    public static byte name = (byte) 0;
    public static Math next = new Math(ScrollingTextView.MP3_MAX_INPUT_SIZE);
    public static long offset;
    public static int pos = 0;
    public static CRC32 f208s = new CRC32();
    public static int size = 0;
    public static int start = 0;
    public static int state = 0;
    public static RefList this$0 = new RefList();
    public static int value = 0;

    MappedRandomAccessFile() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jw.<init>(" + ')');
        }
    }

    static void add(HttpRequest httpRequest, int i, int i2, int i3, byte b, boolean z) {
        long $l4 = (long) ((i << 16) + i2);
        if (((Number) next.get($l4)) == null && ((Number) index.get($l4)) == null) {
            Number $r3 = (Number) cursor.get($l4);
            if ($r3 != null) {
                if (z) {
                    $r3.get();
                    next.get($r3, $l4);
                    value -= 1417772105;
                    size -= 65385844;
                }
            } else if (z || ((Number) $assertionsDisabled.get($l4)) == null) {
                $r3 = new Number();
                $r3.count = httpRequest;
                $r3.f220s = -1204241898 * i3;
                $r3.state = b;
                if (z) {
                    next.get($r3, $l4);
                    size -= 916264481;
                } else {
                    this$0.set($r3);
                    cursor.get($r3, $l4);
                    value += 702735533;
                }
            }
        }
    }

    public static int init(boolean z, boolean z2) {
        int $i0 = 0;
        if (z) {
            $i0 = 0 + ((-773058017 * size) + (1707497590 * count));
        }
        return z2 ? $i0 + ((-1775218268 * value) + (-920885363 * data)) : $i0;
    }

    public static void init() {
        if (buffer != null) {
            buffer.get((byte) -92);
        }
    }

    static final void init(Volume volume, int i) {
        Handler $r2 = client.this$0.this$0;
        int $i1;
        int i2;
        int $i3;
        int $i4;
        int $i5;
        int i3;
        if (volume == Volume.key) {
            $i1 = $r2.write(-169544585);
            i = (($i1 >> 4) & 7) + (889841655 * Vector2D.this$0);
            int $i2 = SparseFieldVector.data * 915762569;
            i2 = $i2;
            $i1 = ($i1 & 7) + $i2;
            i2 = $r2.encode(888828514);
            $i3 = $r2.write(-1784626264);
            $i4 = $i3 >> 2;
            $i3 &= 3;
            $i5 = client.tmp[$i4];
            if (i >= 0 && $i1 >= 0 && i < 103 && $i1 < 103) {
                long $l7;
                long j;
                if ($i5 == 0) {
                    Line $r6 = OrgFile.this$0.getText(-1674539149 * Msg.size, i, $i1);
                    if ($r6 != null) {
                        i3 = Method.get(2560327866738495599L * $r6.data);
                        if (2 == $i4) {
                            $r6.length = new AttributeList(i3, 2, $i3 + 4, Msg.size * -1674539149, i, $i1, i2, false, $r6.length);
                            $r6.buffer = new AttributeList(i3, 2, ($i3 + 1) & 3, Msg.size * -1674539149, i, $i1, i2, false, $r6.buffer);
                        } else {
                            $r6.length = new AttributeList(i3, $i4, $i3, -1674539149 * Msg.size, i, $i1, i2, false, $r6.length);
                        }
                    }
                }
                if ($i5 == 1) {
                    Stream $r9 = OrgFile.this$0.map(Msg.size * -1674539149, i, $i1);
                    if ($r9 != null) {
                        $l7 = $r9.count * 6162409934167472955L;
                        j = $l7;
                        i3 = Method.get($l7);
                        if ($i4 == 4 || 5 == $i4) {
                            $r9.buffer = new AttributeList(i3, 4, $i3, Msg.size * -1674539149, i, $i1, i2, false, $r9.buffer);
                        } else if ($i4 == 6) {
                            $r9.buffer = new AttributeList(i3, 4, $i3 + 4, Msg.size * -1674539149, i, $i1, i2, false, $r9.buffer);
                        } else if (7 == $i4) {
                            $r9.buffer = new AttributeList(i3, 4, (($i3 + 2) & 3) + 4, Msg.size * -1674539149, i, $i1, i2, false, $r9.buffer);
                        } else if ($i4 == 8) {
                            $r9.buffer = new AttributeList(i3, 4, $i3 + 4, Msg.size * -1674539149, i, $i1, i2, false, $r9.buffer);
                            $r9.type = new AttributeList(i3, 4, (($i3 + 2) & 3) + 4, Msg.size * -1674539149, i, $i1, i2, false, $r9.type);
                        }
                    }
                }
                if (2 == $i5) {
                    Set $r10 = OrgFile.this$0.initialize(-1674539149 * Msg.size, i, $i1);
                    if (11 == $i4) {
                        $i4 = 10;
                    }
                    if ($r10 != null) {
                        $r10.key = new AttributeList(Method.get(-966509501471514439L * $r10.next), $i4, $i3, Msg.size * -1674539149, i, $i1, i2, false, $r10.key);
                    }
                }
                if (3 == $i5) {
                    Calendar $r11 = OrgFile.this$0.validate(Msg.size * -1674539149, i, $i1);
                    if ($r11 != null) {
                        $l7 = $r11.data * -7401358002501475335L;
                        j = $l7;
                        $r11.buffer = new AttributeList(Method.get($l7), 22, $i3, Msg.size * -1674539149, i, $i1, i2, false, $r11.buffer);
                        return;
                    }
                }
            }
        }
        byte $b10;
        byte $b12;
        int $i8;
        int $i9;
        int i4;
        if (volume == Volume.id) {
            $i1 = $r2.decode(621523212);
            i2 = $r2.decode(541176769);
            i = (i2 >> 4) & 15;
            $i3 = i2 & 7;
            $i4 = $r2.get(998064398);
            $i5 = $r2.read(-1180003394);
            i2 = (($i5 >> 4) & 7) + (889841655 * Vector2D.this$0);
            $i5 = ($i5 & 7) + (915762569 * SparseFieldVector.data);
            if (i2 >= 0 && $i5 >= 0 && i2 < 104 && $i5 < 104) {
                i3 = i + 1;
                if (File.this$0.this$0[0] >= i2 - i3) {
                    if (File.this$0.this$0[0] <= i2 + i3) {
                        if (File.this$0.length[0] >= $i5 - i3) {
                            if (File.this$0.length[0] <= i3 + $i5 && client.items * 1137688059 != 0 && $i3 > 0 && client.cache * 2118073853 < 50) {
                                client.pool[client.cache * 2118073853] = $i4;
                                client.writer[client.cache * 2118073853] = $i3;
                                client.stack[client.cache * 2118073853] = $i1;
                                client.values[client.cache * 2118073853] = null;
                                client.TYPE[client.cache * 2118073853] = i + ((i2 << 16) + ($i5 << 8));
                                client.cache += 1636861781;
                            }
                        }
                    }
                }
            }
        }
        if (Volume.$assertionsDisabled == volume) {
            $b10 = $r2.getName((byte) 0);
            i2 = $r2.get(-1187975198);
            byte $b11 = $r2.next(1247983979);
            $b12 = $b11;
            $i1 = $r2.read(-2128114970);
            i = (889841655 * Vector2D.this$0) + (($i1 >> 4) & 7);
            $i2 = SparseFieldVector.data * 915762569;
            $i3 = $i2;
            $i1 = ($i1 & 7) + $i2;
            $i5 = $r2.encode(755438907);
            $i8 = $r2.getInstance(-790492867);
            byte $b13 = $r2.getLogger(1888708892);
            $i3 = $r2.get(-1075102152);
            byte $b14 = $r2.read((byte) -51);
            byte $b15 = $b14;
            $i4 = $r2.get((byte) 0);
            i3 = $i4 >> 2;
            $i9 = $i4 & 3;
            $i4 = client.tmp[i3];
            $i2 = client.flags * -1522892003;
            i4 = $i2;
            Item $r12 = $i2 == $i8 ? File.this$0 : client.size[$i8];
            if ($r12 != null) {
                Transaction $r14 = BigInteger.get($i5, 1765296136);
                if (1 == $i9 || $i9 == 3) {
                    try {
                        $i8 = -344743753 * $r14.offset;
                        $i5 = -265754695 * $r14.this$0;
                    } catch (RuntimeException $r20) {
                        throw StringBuilder.append($r20, "jw.dn(" + ')');
                    }
                }
                $i8 = $r14.this$0 * -265754695;
                $i5 = $r14.offset * -344743753;
                i4 = i + ($i8 >> 1);
                int $i17 = i + (($i8 + 1) >> 1);
                int $i18 = $i1 + ($i5 >> 1);
                int $i20 = $i1 + (($i5 + 1) >> 1);
                int[][] $r16 = Chart.length[Msg.size * -1674539149];
                int $i19 = $r16[$i17][$i20];
                $i20 = $r16[i4][$i20];
                $i2 = $r16[i4][$i18] + $r16[$i17][$i18];
                i4 = $i2;
                $i2 += $i20;
                i4 = $i2;
                i4 = ($i2 + $i19) >> 2;
                Integer $r17 = $r14.add(i3, $i9, $r16, ($i8 << 6) + (i << 7), i4, ($i5 << 6) + ($i1 << 7), 1698798723);
                if ($r17 != null) {
                    Fragment.read(-1674539149 * Msg.size, i, $i1, $i4, -1, 0, 0, $i3 + 1, i2 + 1, -2097215415);
                    $r12.current = -451425859 * ((1581849891 * client.type) + $i3);
                    $i2 = ((client.type * 1581849891) + i2) * -1452389121;
                    i2 = $i2;
                    $r12.path = $i2;
                    $r12.index = $r17;
                    $i2 = (-1544979584 * i) + (1374993856 * $i8);
                    i2 = $i2;
                    $r12.pos = $i2;
                    $i2 = (-116203840 * $i5) + (-232407680 * $i1);
                    i2 = $i2;
                    $r12.count = $i2;
                    $r12.head = -1010006159 * i4;
                    if ($b13 > $b14) {
                        $b14 = $b13;
                    } else {
                        $b15 = $b13;
                    }
                    if ($b10 > $b11) {
                        $b11 = $b10;
                    } else {
                        $b12 = $b10;
                    }
                    $r12.f159c = -1723441319 * ($b15 + i);
                    $i2 = ($b14 + i) * -1577193561;
                    i = $i2;
                    $r12.f160g = $i2;
                    $i2 = ($b12 + $i1) * 300270939;
                    i = $i2;
                    $r12.f162j = $i2;
                    $i2 = ($b11 + $i1) * 1865169791;
                    i = $i2;
                    $r12.width = $i2;
                }
            }
        }
        if (volume == Volume.this$0) {
            $b10 = $r2.getLogger(1781660396);
            i2 = $r2.get((byte) 0);
            $i3 = $r2.toByteArray(1990827408);
            $i5 = $r2.getName(-1005835619);
            $i1 = $r2.get((byte) 0) * 4;
            i = $r2.getName(-1005835619);
            $i4 = $r2.read(115239435) * 4;
            $i8 = $r2.decode(939425529);
            i3 = (Vector2D.this$0 * 889841655) + (($i8 >> 4) & 7);
            $i18 = ($i8 & 7) + (SparseFieldVector.data * 915762569);
            $i8 = $r2.read(-854108014);
            $b12 = $r2.getLogger(1908230195);
            $i9 = $r2.get(-1428590876);
            $i19 = $b12 + i3;
            i4 = $b10 + $i18;
            if (i3 >= 0 && $i18 >= 0 && i3 < 104 && $i18 < 104 && $i19 >= 0 && i4 >= 0 && $i19 < 104 && i4 < 104 && 65535 != $i9) {
                $i17 = (i3 * Constants.f93X) + 64;
                $i18 = ($i18 * Constants.f93X) + 64;
                i3 = ($i19 * Constants.f93X) + 64;
                i4 = (i4 * Constants.f93X) + 64;
                $i2 = client.type * 1581849891;
                $i20 = $i2;
                $i2 = new Color($i9, -1674539149 * Msg.size, $i17, $i18, InputStream.toString($i17, $i18, Msg.size * -1674539149, 1931065161) - $i4, $i2 + i, $i5 + (client.type * 1581849891), $i8, i2, $i3, $i1);
                $i2.add(i3, i4, InputStream.toString(i3, i4, -1674539149 * Msg.size, 1727508699) - $i1, i + (client.type * 1581849891), -684621192);
                client.root.toString($i2);
            }
        } else if (volume == Volume.data) {
            i = $r2.encode(1786961593);
            i2 = $r2.decode(1494741666);
            $i1 = ((i2 >> 4) & 7) + (889841655 * Vector2D.this$0);
            i2 = (SparseFieldVector.data * 915762569) + (i2 & 7);
            if ($i1 >= 0 && i2 >= 0 && $i1 < DiskLruCache.AppCompatTheme_editTextStyle && i2 < 104) {
                $r19 = client.map[-1674539149 * Msg.size][$i1][i2];
                if ($r19 != null) {
                    for (Object $r29 = (Status) $r19.get(); $r29 != null; $r29 = (Status) $r19.next()) {
                        if ($r29.size * -15746003 == (i & 32767)) {
                            $r29.iterator();
                            break;
                        }
                    }
                    if ($r19.get() == null) {
                        client.map[Msg.size * -1674539149][$i1][i2] = null;
                    }
                    JSONArray.write($i1, i2, (byte) -3);
                }
            }
        } else if (volume == Volume.file) {
            i = $r2.decode(1444759314);
            i2 = (889841655 * Vector2D.this$0) + ((i >> 4) & 7);
            $i5 = (i & 7) + (915762569 * SparseFieldVector.data);
            i = $r2.getName(-1005835619);
            $i1 = $r2.get(-64756827);
            $i3 = $r2.write(-381626981);
            if (i2 >= 0 && $i5 >= 0 && i2 < 104 && $i5 < 104) {
                i2 = (i2 * Constants.f93X) + 64;
                $i5 = ($i5 * Constants.f93X) + 64;
                client.points.toString(new LinkedList(i, Msg.size * -1674539149, i2, $i5, InputStream.toString(i2, $i5, Msg.size * -1674539149, 1756427816) - $i3, $i1, client.type * 1581849891));
            }
        } else if (volume == Volume.count) {
            i = $r2.encode(2093682491);
            $i1 = $r2.getInstance(-917971933);
            $i3 = $r2.get((byte) 0);
            i2 = (889841655 * Vector2D.this$0) + (($i3 >> 4) & 7);
            $i3 = (SparseFieldVector.data * 915762569) + ($i3 & 7);
            $i5 = $r2.get(-1779571287);
            if (i2 >= 0 && $i3 >= 0 && i2 < 104 && $i3 < 104) {
                $r19 = client.map[Msg.size * -1674539149][i2][$i3];
                if ($r19 != null) {
                    for (Status $r292 = (Status) $r19.get(); $r292 != null; $r292 = (Status) $r19.next()) {
                        if (($i1 & 32767) == -15746003 * $r292.size) {
                            if ($i5 == 1071269889 * $r292.name) {
                                $i2 = i * 1952823297;
                                i = $i2;
                                $r292.name = $i2;
                                break;
                            }
                        }
                    }
                    JSONArray.write(i2, $i3, (byte) -43);
                }
            }
        } else if (volume == Volume.log) {
            $i1 = $r2.get(-578542142);
            i2 = $r2.write(-6210703);
            i = ((i2 >> 4) & 7) + (Vector2D.this$0 * 889841655);
            i2 = (i2 & 7) + (915762569 * SparseFieldVector.data);
            $i3 = $r2.get(-329189687);
            if (i >= 0 && i2 >= 0 && i < 104 && i2 < 104) {
                $i2 = new Status();
                $i2.size = $i1 * 1162998693;
                $i2.name = 1952823297 * $i3;
                if (client.map[Msg.size * -1674539149][i][i2] == null) {
                    client.map[Msg.size * -1674539149][i][i2] = new Iterator();
                }
                client.map[Msg.size * -1674539149][i][i2].toString($i2);
                JSONArray.write(i, i2, (byte) -70);
            }
        } else if (Volume.header == volume) {
            $i1 = $r2.get((byte) 0);
            i = (889841655 * Vector2D.this$0) + (($i1 >> 4) & 7);
            $i1 = (915762569 * SparseFieldVector.data) + ($i1 & 7);
            i2 = $r2.get(1889572339);
            $i5 = $r2.read(415137868);
            $i3 = $i5 >> 2;
            $i5 &= 3;
            $i4 = client.tmp[$i3];
            if (i >= 0 && $i1 >= 0 && i < 104 && $i1 < DiskLruCache.AppCompatTheme_editTextStyle) {
                Fragment.read(Msg.size * -1674539149, i, $i1, $i4, i2, $i3, $i5, 0, -1, -1412019443);
            }
        } else if (Volume.parent == volume) {
            $i1 = $r2.get((byte) 0);
            i = (Vector2D.this$0 * 889841655) + (($i1 >> 4) & 7);
            $i1 = (SparseFieldVector.data * 915762569) + ($i1 & 7);
            $i3 = $r2.read(-728165286);
            i2 = $i3 >> 2;
            $i3 &= 3;
            $i5 = client.tmp[i2];
            if (i >= 0 && $i1 >= 0 && i < 104 && $i1 < 104) {
                Fragment.read(Msg.size * -1674539149, i, $i1, $i5, -1, i2, $i3, 0, -1, -1379064943);
            }
        }
    }

    public static int length(boolean z, boolean z2) {
        int $i0 = 0;
        if (z) {
            $i0 = 0 + ((-773058017 * size) + (-33214903 * count));
        }
        return z2 ? $i0 + ((-2034551303 * value) + (-920885363 * data)) : $i0;
    }

    static int read(int i, int i2) {
        return (PriorityQueue.buffer == null || ((long) ((i << 16) + i2)) != PriorityQueue.buffer.size) ? 0 : ((1981724264 * Connection.buffer.data) / (Connection.buffer.size.length - PriorityQueue.buffer.state)) + 1;
    }

    public static int read(boolean z, boolean z2) {
        int $i0 = 0;
        if (z) {
            $i0 = 0 + ((1993129475 * size) + (-620493534 * count));
        }
        return z2 ? $i0 + ((-2034551303 * value) + (-920885363 * data)) : $i0;
    }

    public static void read() {
        if (buffer != null) {
            buffer.get((byte) -34);
        }
    }

    static void read(HttpRequest httpRequest, int i, int i2, int i3, byte b, boolean z) {
        long $l4 = (long) ((i << 16) + i2);
        if (((Number) next.get($l4)) == null && ((Number) index.get($l4)) == null) {
            Number $r3 = (Number) cursor.get($l4);
            if ($r3 != null) {
                if (z) {
                    $r3.get();
                    next.get($r3, $l4);
                    value -= 1417772105;
                    size -= 916264481;
                }
            } else if (z || ((Number) $assertionsDisabled.get($l4)) == null) {
                $r3 = new Number();
                $r3.count = httpRequest;
                $r3.f220s = 1351238033 * i3;
                $r3.state = b;
                if (z) {
                    next.get($r3, $l4);
                    size -= 916264481;
                    return;
                }
                this$0.set($r3);
                cursor.get($r3, $l4);
                value += 852910101;
            }
        }
    }

    static void set(HttpRequest httpRequest, int i, int i2, int i3, byte b, boolean z) {
        long $l4 = (long) ((i << 16) + i2);
        if (((Number) next.get($l4)) == null && ((Number) index.get($l4)) == null) {
            Number $r3 = (Number) cursor.get($l4);
            if ($r3 != null) {
                if (z) {
                    $r3.get();
                    next.get($r3, $l4);
                    value -= 1417772105;
                    size -= 916264481;
                }
            } else if (z || ((Number) $assertionsDisabled.get($l4)) == null) {
                $r3 = new Number();
                $r3.count = httpRequest;
                $r3.f220s = 1351238033 * i3;
                $r3.state = b;
                if (z) {
                    next.get($r3, $l4);
                    size -= 916264481;
                    return;
                }
                this$0.set($r3);
                cursor.get($r3, $l4);
                value += 1417772105;
            }
        }
    }

    static int size(int i, int i2) {
        return (PriorityQueue.buffer == null || ((long) ((i << 16) + i2)) != PriorityQueue.buffer.size) ? 0 : ((1442462621 * Connection.buffer.data) / (Connection.buffer.size.length - PriorityQueue.buffer.state)) + 1;
    }
}
