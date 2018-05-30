package p000;

import java.net.URL;

/* compiled from: hq */
public class ByteBuffer {
    static final int ATTENDEES_INDEX_RELATIONSHIP = 3;
    public static final int INTER_TAB_SIZE2 = 1024;
    static final int WEEKS_BUFFER = 1;
    static int[] count = new int[]{1, 1, 1, 1};
    static int[] data = new int[]{0, 1, 2, 3};
    static final int encoding = 2;
    static int head = 0;
    static int size = 0;
    static HttpRequest this$0;
    String buffer;
    int index;
    int length;
    int log;
    String name;
    int next;
    int value;

    ByteBuffer() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hq.<init>(" + ')');
        }
    }

    static ByteBuffer append() {
        if (head * 821077127 >= size * 443593871) {
            return null;
        }
        ByteBuffer[] $r0 = Short.value;
        int $i0 = head - 2059476681;
        head = $i0;
        return $r0[($i0 * 821077127) - 1];
    }

    static void append(int i, int i2) {
        int[] $r0 = new int[4];
        int[] $r1 = new int[4];
        $r0[0] = i;
        $r1[0] = i2;
        i2 = 1;
        for (int $i2 = 0; $i2 < 4; $i2++) {
            if (i != data[$i2]) {
                $r0[i2] = data[$i2];
                $r1[i2] = count[$i2];
                i2++;
            }
        }
        data = $r0;
        count = $r1;
        System.append(Short.value, 0, Short.value.length - 1, data, count, -1626713127);
    }

    static void append(int i, boolean z, int i2, boolean z2) {
        if (Short.value != null) {
            DocWriter.write(0, Short.value.length - 1, i, z, i2, z2, -522920707);
        }
    }

    static ByteBuffer clear() {
        head = 0;
        return ByteString.read(2138313132);
    }

    static int compare(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int $i0, boolean $z0) {
        byte $b1 = (byte) 1;
        if (1 == $i0) {
            $i0 = byteBuffer.value * -1545862613;
            int $i2 = byteBuffer2.value * -1545862613;
            if (!$z0) {
                if ($i0 == -1) {
                    $i0 = 2135099822;
                }
                if ($i2 == -1) {
                    $i2 = 865429117;
                }
            }
            return $i0 - $i2;
        } else if ($i0 == 2) {
            return (byteBuffer.log * 1116252417) - (1116252417 * byteBuffer2.log);
        } else {
            if (3 == $i0) {
                if (byteBuffer.name.equals("-")) {
                    if (!byteBuffer2.name.equals("-")) {
                        if ($z0) {
                            $b1 = (byte) -1;
                        }
                        return $b1;
                    }
                } else if (!byteBuffer2.name.equals("-")) {
                    return byteBuffer.name.compareTo(byteBuffer2.name);
                } else {
                    if (!$z0) {
                        $b1 = (byte) -1;
                    }
                    return $b1;
                }
            } else if ($i0 == 4) {
                if (byteBuffer.write(2117921008)) {
                    if (!byteBuffer2.write(2117921008)) {
                        return 1;
                    }
                } else if (byteBuffer2.write(2117921008)) {
                    return -1;
                }
            } else if (5 == $i0) {
                if (byteBuffer.replace(-1229537357)) {
                    return byteBuffer2.replace(-1706436733) ? 0 : 1;
                } else {
                    if (byteBuffer2.replace(-586532559)) {
                        return -1;
                    }
                }
            } else if ($i0 == 6) {
                if (byteBuffer.get(54893033)) {
                    if (!byteBuffer2.get(283700611)) {
                        return 1;
                    }
                } else if (byteBuffer2.get(1643884620)) {
                    return -1;
                }
            } else if ($i0 != 7) {
                return (1486375648 * byteBuffer.length) - (-54537764 * byteBuffer2.length);
            } else {
                if (byteBuffer.size(-144541583)) {
                    return byteBuffer2.size(-1479818165) ? 0 : 1;
                } else {
                    if (byteBuffer2.size(-865349712)) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    static int encode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int $i0, boolean $z0) {
        byte $b1 = (byte) 1;
        byte $b2 = (byte) -1;
        if (1 == $i0) {
            $i0 = byteBuffer.value * -1545862613;
            int $i3 = byteBuffer2.value * -1545862613;
            if (!$z0) {
                if ($i0 == -1) {
                    $i0 = 2001;
                }
                if ($i3 == -1) {
                    $i3 = 2001;
                    return $i0 - $i3;
                }
            }
            return $i0 - $i3;
        } else if ($i0 == 2) {
            return (byteBuffer.log * 1116252417) - (1116252417 * byteBuffer2.log);
        } else {
            if (3 == $i0) {
                if (byteBuffer.name.equals("-")) {
                    if (!byteBuffer2.name.equals("-")) {
                        if (!$z0) {
                            $b2 = (byte) 1;
                        }
                        return $b2;
                    }
                } else if (!byteBuffer2.name.equals("-")) {
                    return byteBuffer.name.compareTo(byteBuffer2.name);
                } else {
                    if (!$z0) {
                        $b1 = (byte) -1;
                    }
                    return $b1;
                }
            } else if ($i0 == 4) {
                if (!byteBuffer.write(2117921008)) {
                    $b1 = byteBuffer2.write(2117921008) ? (byte) -1 : (byte) 0;
                } else if (byteBuffer2.write(2117921008)) {
                    $b1 = (byte) 0;
                }
                return $b1;
            } else if (5 == $i0) {
                if (byteBuffer.replace(-1776015026)) {
                    if (!byteBuffer2.replace(-505300467)) {
                        return 1;
                    }
                } else if (byteBuffer2.replace(-1103140518)) {
                    return -1;
                }
            } else if ($i0 == 6) {
                if (byteBuffer.get(2141541472)) {
                    if (!byteBuffer2.get(204554265)) {
                        return 1;
                    }
                } else if (byteBuffer2.get(-884780241)) {
                    return -1;
                }
            } else if ($i0 != 7) {
                return (-756728079 * byteBuffer.length) - (-756728079 * byteBuffer2.length);
            } else {
                if (byteBuffer.size(-1387660401)) {
                    return byteBuffer2.size(-872581753) ? 0 : 1;
                } else {
                    if (byteBuffer2.size(651885505)) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    static boolean get() {
        if (Chart.data == null) {
            Chart.data = Namespace.context.getInstance(new URL(AtomicInteger.name), -615329840);
        } else if (Chart.data.read(236645063)) {
            Logger $r5 = new Logger(Chart.data.get(-359188190));
            $r5.size(377402374);
            size = $r5.get(-909075768) * 1274669679;
            Short.value = new ByteBuffer[(-2031940049 * size)];
            int $i0 = 0;
            while ($i0 < 443593871 * size) {
                ByteBuffer[] $r6 = Short.value;
                ByteBuffer byteBuffer = new ByteBuffer();
                $r6[$i0] = byteBuffer;
                int $i1 = $r5.get(-1430071555) * -71831023;
                int i = $i1;
                byteBuffer.length = $i1;
                $i1 = $r5.size(254596852) * -2031175081;
                i = $i1;
                byteBuffer.index = $i1;
                byteBuffer.buffer = $r5.toString(1689188702);
                byteBuffer.name = $r5.toString(1725329164);
                try {
                    $i1 = $r5.get((byte) 0) * 67655425;
                    i = $i1;
                    byteBuffer.log = $i1;
                    $i1 = $r5.getValue(824564969) * 1666997391;
                    i = $i1;
                    byteBuffer.value = $i1;
                    byteBuffer.next = -985792981 * $i0;
                    $i0++;
                } catch (Exception $r11) {
                    $r11.printStackTrace();
                    Chart.data = null;
                }
            }
            System.append(Short.value, 0, Short.value.length - 1, data, count, -1467029759);
            Chart.data = null;
            return true;
        }
        return false;
    }

    static void getData(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        if (i < i2) {
            int $i5 = (i2 + i) / 2;
            ByteBuffer $r1 = Short.value[$i5];
            Short.value[$i5] = Short.value[i2];
            Short.value[i2] = $r1;
            int $i6 = i;
            $i5 = i;
            while ($i6 < i2) {
                int $i4;
                if (Diff.read(Short.value[$i6], $r1, i3, z, i4, z2, -895035459) <= 0) {
                    ByteBuffer $r3 = Short.value[$i6];
                    Short.value[$i6] = Short.value[$i5];
                    $i4 = $i5 + 1;
                    Short.value[$i5] = $r3;
                } else {
                    $i4 = $i5;
                }
                $i6++;
                $i5 = $i4;
            }
            Short.value[i2] = Short.value[$i5];
            Short.value[$i5] = $r1;
            DocWriter.write(i, $i5 - 1, i3, z, i4, z2, 240808303);
            DocWriter.write($i5 + 1, i2, i3, z, i4, z2, 1007632057);
        }
    }

    static boolean init() {
        if (Chart.data == null) {
            Chart.data = Namespace.context.getInstance(new URL(AtomicInteger.name), -615329840);
        } else if (Chart.data.read(1561832906)) {
            Logger $r5 = new Logger(Chart.data.get(-1533608147));
            $r5.size(1457391035);
            size = $r5.get(-1743465355) * 1274669679;
            Short.value = new ByteBuffer[(size * 443593871)];
            int $i0 = 0;
            while (true) {
                int $i1 = size * 443593871;
                int i = $i1;
                if ($i0 < $i1) {
                    ByteBuffer[] $r6 = Short.value;
                    $i1 = new ByteBuffer();
                    $r6[$i0] = $i1;
                    $i1 = $r5.get(525118342) * -71831023;
                    i = $i1;
                    $i1.length = $i1;
                    $i1 = $r5.size(-842392271) * -2031175081;
                    i = $i1;
                    $i1.index = $i1;
                    $i1.buffer = $r5.toString(1258369954);
                    $i1.name = $r5.toString(1678839314);
                    try {
                        $i1 = $r5.get((byte) 0) * 67655425;
                        i = $i1;
                        $i1.log = $i1;
                        $i1 = $r5.getValue(1165405723) * -1042109309;
                        i = $i1;
                        $i1.value = $i1;
                        $i1.next = -985792981 * $i0;
                        $i0++;
                    } catch (Exception $r11) {
                        $r11.printStackTrace();
                        Chart.data = null;
                    }
                } else {
                    System.append(Short.value, 0, Short.value.length - 1, data, count, -1456066596);
                    Chart.data = null;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean parse() {
        if (Chart.data == null) {
            Chart.data = Namespace.context.getInstance(new URL(AtomicInteger.name), -615329840);
        } else if (Chart.data.read(-758209018)) {
            Logger $r5 = new Logger(Chart.data.get(-1193483713));
            $r5.size(1611501950);
            size = $r5.get(326281373) * 1274669679;
            Short.value = new ByteBuffer[(443593871 * size)];
            int $i0 = 0;
            while ($i0 < 11777706 * size) {
                ByteBuffer[] $r6 = Short.value;
                ByteBuffer byteBuffer = new ByteBuffer();
                $r6[$i0] = byteBuffer;
                int $i1 = $r5.get(362959818) * -71831023;
                int i = $i1;
                byteBuffer.length = $i1;
                $i1 = $r5.size(-144075190) * -1652552006;
                i = $i1;
                byteBuffer.index = $i1;
                byteBuffer.buffer = $r5.toString(1105936486);
                byteBuffer.name = $r5.toString(2026720788);
                try {
                    $i1 = $r5.get((byte) 0) * 67655425;
                    i = $i1;
                    byteBuffer.log = $i1;
                    $i1 = $r5.getValue(1224748185) * -1341634468;
                    i = $i1;
                    byteBuffer.value = $i1;
                    byteBuffer.next = -985792981 * $i0;
                    $i0++;
                } catch (Exception $r11) {
                    $r11.printStackTrace();
                    Chart.data = null;
                }
            }
            System.append(Short.value, 0, Short.value.length - 1, data, count, 2137924855);
            Chart.data = null;
            return true;
        }
        return false;
    }

    static int process(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int $i0, boolean z, int i, boolean z2) {
        $i0 = Stream.add(byteBuffer, byteBuffer2, $i0, z, (byte) 69);
        if ($i0 != 0) {
            if (z) {
                return -$i0;
            }
        } else if (-1 == i) {
            return 0;
        } else {
            $i0 = Stream.add(byteBuffer, byteBuffer2, i, z2, (byte) 108);
            if (z2) {
                $i0 = -$i0;
            }
        }
        return $i0;
    }

    static ByteBuffer read() {
        head = 0;
        return ByteString.read(2144112063);
    }

    static ByteBuffer remove() {
        if (head * 821077127 >= size * 443593871) {
            return null;
        }
        ByteBuffer[] $r0 = Short.value;
        int $i0 = head - 2059476681;
        head = $i0;
        return $r0[($i0 * 821077127) - 1];
    }

    static void replace(ByteBuffer[] byteBufferArr, int i, int i2, int[] iArr, int[] iArr2) {
        if (i < i2) {
            int $i2 = i - 1;
            int $i3 = i2 + 1;
            int $i4 = (i + i2) / 2;
            ByteBuffer $r3 = byteBufferArr[$i4];
            byteBufferArr[$i4] = byteBufferArr[i];
            byteBufferArr[i] = $r3;
            while ($i2 < $i3) {
                int $i5;
                int $i6;
                boolean $z0 = true;
                do {
                    $i3--;
                    $i4 = 0;
                    while ($i4 < 4) {
                        if (iArr[$i4] == 2) {
                            $i5 = byteBufferArr[$i3].next * -1327352239;
                            $i6 = -1169371005 * $r3.next;
                        } else if (iArr[$i4] == 1) {
                            $i5 = -1545862613 * byteBufferArr[$i3].value;
                            $i6 = -355058205 * $r3.value;
                            if ($i5 == -1 && iArr2[$i4] == 1) {
                                $i5 = 2001;
                            }
                            if ($i6 == -1 && iArr2[$i4] == 1) {
                                $i6 = 2001;
                            }
                        } else if (iArr[$i4] == 3) {
                            $i5 = byteBufferArr[$i3].size(-221310371) ? 1 : 0;
                            $i6 = $r3.size(918412012) ? 1 : 0;
                        } else {
                            $i5 = -756728079 * byteBufferArr[$i3].length;
                            $i6 = 1980072484 * $r3.length;
                        }
                        if ($i5 == $i6) {
                            if (3 == $i4) {
                                $z0 = false;
                            }
                            $i4++;
                        } else if (1 != iArr2[$i4] || $i5 <= $i6) {
                            if (iArr2[$i4] != 0 || $i5 >= $i6) {
                                $z0 = false;
                                continue;
                            } else {
                                continue;
                            }
                        }
                    }
                } while ($z0);
                $z0 = true;
                do {
                    $i2++;
                    $i4 = 0;
                    while ($i4 < 4) {
                        if (2 == iArr[$i4]) {
                            $i5 = 1318703350 * byteBufferArr[$i2].next;
                            $i6 = $r3.next * 1869293170;
                        } else if (1 == iArr[$i4]) {
                            $i5 = 1344570793 * byteBufferArr[$i2].value;
                            $i6 = 1023454962 * $r3.value;
                            if ($i5 == -1 && iArr2[$i4] == 1) {
                                $i5 = 2001;
                            }
                            if (-1 == $i6 && iArr2[$i4] == 1) {
                                $i6 = -1097445461;
                            }
                        } else if (3 == iArr[$i4]) {
                            $i5 = byteBufferArr[$i2].size(-1658033259) ? 1 : 0;
                            $i6 = $r3.size(905537760) ? 1 : 0;
                        } else {
                            $i5 = -756728079 * byteBufferArr[$i2].length;
                            $i6 = $r3.length * 259046327;
                        }
                        if ($i6 == $i5) {
                            if ($i4 == 3) {
                                $z0 = false;
                            }
                            $i4++;
                        } else if (iArr2[$i4] == 1 && $i5 < $i6) {
                            continue;
                        } else if (iArr2[$i4] != 0 || $i5 <= $i6) {
                            $z0 = false;
                            continue;
                        } else {
                            continue;
                        }
                    }
                } while ($z0);
                if ($i2 < $i3) {
                    ByteBuffer $r4 = byteBufferArr[$i2];
                    byteBufferArr[$i2] = byteBufferArr[$i3];
                    byteBufferArr[$i3] = $r4;
                }
            }
            System.append(byteBufferArr, i, $i3, iArr, iArr2, 253491444);
            System.append(byteBufferArr, $i3 + 1, i2, iArr, iArr2, -1549576534);
        }
    }

    static int toString(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int $i0, boolean z, int i, boolean z2) {
        $i0 = Stream.add(byteBuffer, byteBuffer2, $i0, z, (byte) 52);
        if ($i0 != 0) {
            if (z) {
                return -$i0;
            }
        } else if (-1 == i) {
            return 0;
        } else {
            $i0 = Stream.add(byteBuffer, byteBuffer2, i, z2, (byte) 6);
            if (z2) {
                $i0 = -$i0;
            }
        }
        return $i0;
    }

    static void toString(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        if (i < i2) {
            int $i5 = (i2 + i) / 2;
            ByteBuffer $r1 = Short.value[$i5];
            Short.value[$i5] = Short.value[i2];
            Short.value[i2] = $r1;
            int $i6 = i;
            $i5 = i;
            while ($i6 < i2) {
                int $i4;
                if (Diff.read(Short.value[$i6], $r1, i3, z, i4, z2, -1687313625) <= 0) {
                    ByteBuffer $r3 = Short.value[$i6];
                    Short.value[$i6] = Short.value[$i5];
                    $i4 = $i5 + 1;
                    Short.value[$i5] = $r3;
                } else {
                    $i4 = $i5;
                }
                $i6++;
                $i5 = $i4;
            }
            Short.value[i2] = Short.value[$i5];
            Short.value[$i5] = $r1;
            DocWriter.write(i, $i5 - 1, i3, z, i4, z2, 1259708791);
            DocWriter.write($i5 + 1, i2, i3, z, i4, z2, 1822463744);
        }
    }

    static int write(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int $i0, boolean $z0) {
        byte $b1 = (byte) 1;
        byte $b2 = (byte) -1;
        if (1 == $i0) {
            $i0 = byteBuffer.value * -1545862613;
            int $i3 = byteBuffer2.value * -1545862613;
            if (!$z0) {
                if ($i0 == -1) {
                    $i0 = 2001;
                }
                if ($i3 == -1) {
                    $i3 = 2001;
                }
            }
            return $i0 - $i3;
        } else if ($i0 == 2) {
            return (byteBuffer.log * 1116252417) - (1116252417 * byteBuffer2.log);
        } else {
            if (3 == $i0) {
                if (byteBuffer.name.equals("-")) {
                    if (!byteBuffer2.name.equals("-")) {
                        if (!$z0) {
                            $b2 = (byte) 1;
                        }
                        return $b2;
                    }
                } else if (!byteBuffer2.name.equals("-")) {
                    return byteBuffer.name.compareTo(byteBuffer2.name);
                } else {
                    if (!$z0) {
                        $b1 = (byte) -1;
                    }
                    return $b1;
                }
            } else if ($i0 == 4) {
                if (!byteBuffer.write(2117921008)) {
                    $b1 = byteBuffer2.write(2117921008) ? (byte) -1 : (byte) 0;
                } else if (byteBuffer2.write(2117921008)) {
                    $b1 = (byte) 0;
                }
                return $b1;
            } else if (5 == $i0) {
                if (byteBuffer.replace(-1533191387)) {
                    if (!byteBuffer2.replace(-1306033535)) {
                        return 1;
                    }
                } else if (byteBuffer2.replace(-1562771604)) {
                    return -1;
                }
            } else if ($i0 == 6) {
                if (byteBuffer.get(-403952489)) {
                    return byteBuffer2.get(975274343) ? 0 : 1;
                } else {
                    if (byteBuffer2.get(-1516275250)) {
                        return -1;
                    }
                }
            } else if ($i0 != 7) {
                return (-756728079 * byteBuffer.length) - (-756728079 * byteBuffer2.length);
            } else {
                if (byteBuffer.size(-316196973)) {
                    if (!byteBuffer2.size(-1310609633)) {
                        return 1;
                    }
                } else if (byteBuffer2.size(814148060)) {
                    return -1;
                }
            }
            return 0;
        }
    }

    static int write(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int $i0, boolean z, int i, boolean z2) {
        $i0 = Stream.add(byteBuffer, byteBuffer2, $i0, z, (byte) 77);
        if ($i0 != 0) {
            if (z) {
                return -$i0;
            }
        } else if (-1 == i) {
            return 0;
        } else {
            $i0 = Stream.add(byteBuffer, byteBuffer2, i, z2, (byte) 108);
            if (z2) {
                $i0 = -$i0;
            }
        }
        return $i0;
    }

    static void write(int i, int i2) {
        int[] $r0 = new int[4];
        int[] $r1 = new int[4];
        $r0[0] = i;
        $r1[0] = i2;
        i2 = 1;
        for (int $i2 = 0; $i2 < 4; $i2++) {
            if (i != data[$i2]) {
                $r0[i2] = data[$i2];
                $r1[i2] = count[$i2];
                i2++;
            }
        }
        data = $r0;
        count = $r1;
        System.append(Short.value, 0, Short.value.length - 1, data, count, 1870319303);
    }

    static void write(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        if (i < i2) {
            int $i5 = (i2 + i) / 2;
            ByteBuffer $r1 = Short.value[$i5];
            Short.value[$i5] = Short.value[i2];
            Short.value[i2] = $r1;
            int $i6 = i;
            $i5 = i;
            while ($i6 < i2) {
                int $i4;
                if (Diff.read(Short.value[$i6], $r1, i3, z, i4, z2, -899466485) <= 0) {
                    ByteBuffer $r3 = Short.value[$i6];
                    Short.value[$i6] = Short.value[$i5];
                    $i4 = $i5 + 1;
                    Short.value[$i5] = $r3;
                } else {
                    $i4 = $i5;
                }
                $i6++;
                $i5 = $i4;
            }
            Short.value[i2] = Short.value[$i5];
            Short.value[$i5] = $r1;
            DocWriter.write(i, $i5 - 1, i3, z, i4, z2, 578552677);
            DocWriter.write($i5 + 1, i2, i3, z, i4, z2, -350593813);
        }
    }

    static boolean write() {
        if (Chart.data == null) {
            Chart.data = Namespace.context.getInstance(new URL(AtomicInteger.name), -615329840);
        } else if (Chart.data.read(-1202690329)) {
            Logger $r5 = new Logger(Chart.data.get(-2062150126));
            $r5.size(22610582);
            size = $r5.get(362347205) * -1916274541;
            Short.value = new ByteBuffer[(-1509698177 * size)];
            int $i0 = 0;
            while ($i0 < 443593871 * size) {
                ByteBuffer[] $r6 = Short.value;
                ByteBuffer byteBuffer = new ByteBuffer();
                $r6[$i0] = byteBuffer;
                int $i1 = $r5.get(553709964) * -733952439;
                int i = $i1;
                byteBuffer.length = $i1;
                $i1 = $r5.size(380210060) * -8433870;
                i = $i1;
                byteBuffer.index = $i1;
                byteBuffer.buffer = $r5.toString(1316147533);
                byteBuffer.name = $r5.toString(577413561);
                try {
                    $i1 = $r5.get((byte) 0) * 997069084;
                    i = $i1;
                    byteBuffer.log = $i1;
                    $i1 = $r5.getValue(1324170996) * -856970474;
                    i = $i1;
                    byteBuffer.value = $i1;
                    byteBuffer.next = 1505983768 * $i0;
                    $i0++;
                } catch (Exception $r11) {
                    $r11.printStackTrace();
                    Chart.data = null;
                }
            }
            System.append(Short.value, 0, Short.value.length - 1, data, count, -1813153525);
            Chart.data = null;
            return true;
        }
        return false;
    }

    static ByteBuffer writeTo() {
        if (head * 821077127 >= size * 443593871) {
            return null;
        }
        ByteBuffer[] $r0 = Short.value;
        int $i0 = head - 2059476681;
        head = $i0;
        return $r0[($i0 * 821077127) - 1];
    }

    static void writeTo(int i, int i2) {
        int[] $r0 = new int[4];
        int[] $r1 = new int[4];
        $r0[0] = i;
        $r1[0] = i2;
        i2 = 1;
        for (int $i2 = 0; $i2 < 4; $i2++) {
            if (i != data[$i2]) {
                $r0[i2] = data[$i2];
                $r1[i2] = count[$i2];
                i2++;
            }
        }
        data = $r0;
        count = $r1;
        System.append(Short.value, 0, Short.value.length - 1, data, count, -176267135);
    }

    static void writeTo(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        if (i < i2) {
            int $i5 = (i2 + i) / 2;
            ByteBuffer $r1 = Short.value[$i5];
            Short.value[$i5] = Short.value[i2];
            Short.value[i2] = $r1;
            int $i6 = i;
            $i5 = i;
            while ($i6 < i2) {
                int $i4;
                if (Diff.read(Short.value[$i6], $r1, i3, z, i4, z2, 224308096) <= 0) {
                    ByteBuffer $r3 = Short.value[$i6];
                    Short.value[$i6] = Short.value[$i5];
                    $i4 = $i5 + 1;
                    Short.value[$i5] = $r3;
                } else {
                    $i4 = $i5;
                }
                $i6++;
                $i5 = $i4;
            }
            Short.value[i2] = Short.value[$i5];
            Short.value[$i5] = $r1;
            DocWriter.write(i, $i5 - 1, i3, z, i4, z2, -856512192);
            DocWriter.write($i5 + 1, i2, i3, z, i4, z2, 1481932421);
        }
    }

    static void writeTo(int i, boolean z, int i2, boolean z2) {
        if (Short.value != null) {
            DocWriter.write(0, Short.value.length - 1, i, z, i2, z2, -1223827223);
        }
    }

    boolean m1a() {
        return (NTLMEngineImpl.FLAG_REQUEST_VERSION & (this.index * 259969383)) != 0;
    }

    boolean add(byte b) {
        try {
            return (CompositeInlineMap.INTENT_TO_ADD & (259969383 * this.index)) != 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hq.ab(" + ')');
        }
    }

    boolean addWord() {
        return (CompositeInlineMap.INTENT_TO_ADD & (259969383 * this.index)) != 0;
    }

    boolean ensureCapacity() {
        return (CompositeInlineMap.INTENT_TO_ADD & (-446137987 * this.index)) != 0;
    }

    boolean fillCache() {
        return ((this.index * 259969383) & 1) != 0;
    }

    boolean get(int i) {
        try {
            return ((259969383 * this.index) & 4) != 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hq.am(" + ')');
        }
    }

    boolean getData() {
        return ((259969383 * this.index) & 8) != 0;
    }

    boolean getLength() {
        return ((259969383 * this.index) & 8) != 0;
    }

    boolean indexOf() {
        return ((259969383 * this.index) & 4) != 0;
    }

    boolean isEmpty() {
        return ((this.index * 259969383) & 1) != 0;
    }

    boolean isScreenOn() {
        return (CompositeInlineMap.INTENT_TO_ADD & (259969383 * this.index)) != 0;
    }

    boolean length() {
        return ((this.index * -2127632581) & 2) != 0;
    }

    boolean merge() {
        return ((259969383 * this.index) & 8) != 0;
    }

    boolean onOptionsItemSelected() {
        return (CompositeInlineMap.INTENT_TO_ADD & (259969383 * this.index)) != 0;
    }

    boolean replace() {
        return ((259969383 * this.index) & 4) != 0;
    }

    boolean replace(int i) {
        try {
            return ((this.index * 259969383) & 2) != 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hq.aq(" + ')');
        }
    }

    boolean reset() {
        return (NTLMEngineImpl.FLAG_REQUEST_VERSION & (this.index * 259969383)) != 0;
    }

    boolean size() {
        return (1993462894 & (this.index * -1091646424)) != 0;
    }

    boolean size(int i) {
        try {
            return ((this.index * 259969383) & 1) != 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hq.ae(" + ')');
        }
    }

    boolean stop() {
        return (CompositeInlineMap.INTENT_TO_ADD & (259969383 * this.index)) != 0;
    }

    boolean toByteArray() {
        return ((259969383 * this.index) & 8) != 0;
    }

    boolean toString(int i) {
        try {
            return (NTLMEngineImpl.FLAG_REQUEST_VERSION & (this.index * 259969383)) != 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hq.aw(" + ')');
        }
    }

    boolean write(int i) {
        try {
            return ((259969383 * this.index) & 8) != 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "hq.at(" + ')');
        }
    }
}
