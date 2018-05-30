package p000;

/* compiled from: dr */
public class ZStream {
    static final int REMOTE_FLOW_CONTROL = 33;
    static Note data;
    static int[] index;
    static final ZStream lock = new ZStream(1);
    static final ZStream parser = new ZStream(0);
    static int[] size;
    static Double value;
    final int buffer;

    ZStream(int $i0) {
        try {
            this.buffer = 1561115685 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "dr.<init>(" + ')');
        }
    }

    static final void close(int i) {
        Log.id = false;
        client.LOG = false;
    }

    static int toString(int $i0, CharSequence charSequence, boolean z, int i) {
        i = -1;
        int[] $r1;
        if ($i0 == 3300) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            try {
                $r1[($i0 * 537618701) - 1] = client.type * 1581849891;
                return 1;
            } catch (Throwable $r8) {
                throw StringBuilder.append($r8, "dr.aw(" + ')');
            }
        } else if ($i0 == 3301) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            $i3 = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r1 = XMLParser.this$0;
            $i4 = XMLParser.type - 1194553915;
            XMLParser.type = $i4;
            $i4 = ($i4 * 537618701) - 1;
            $r5 = (Region) Region.value.get((long) $i0);
            if ($r5 != null && $i3 >= 0) {
                $i0 = $r5.size.length;
                if ($i3 < $i0) {
                    i = $r5.size[$i3];
                }
            }
            $r1[$i4] = i;
            return 1;
        } else if (3302 == $i0) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $r1[($i3 * 537618701) - 1] = HyperlinkRecord.get($i0, i, -965483900);
            return 1;
        } else if ($i0 == 3303) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701];
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $r1[($i3 * 537618701) - 1] = Tag.add($i0, i, 2043511556);
            return 1;
        } else if ($i0 == 3304) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = FileInfo.getData($i0, (byte) -93).size * -408205527;
            return 1;
        } else if (3305 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = client.TRUE[$i0];
            return 1;
        } else if (3306 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = client.INSTANCE[$i0];
            return 1;
        } else if ($i0 == 3307) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = client.reader[$i0];
            return 1;
        } else if ($i0 == 3308) {
            $i0 = Msg.size * -1674539149;
            i = ((File.this$0.size * 516759209) >> 7) + (Build$VERSION.type * 1407993063);
            $i3 = ((File.this$0.value * 2328865) >> 7) + (1289967967 * Level.type);
            $r1 = XMLParser.this$0;
            $i4 = XMLParser.type - 1194553915;
            XMLParser.type = $i4;
            $i0 = ($i0 << 28) + (i << 14);
            $i0 = $i0;
            $r1[($i4 * 537618701) - 1] = $i0 + $i3;
            return 1;
        } else if (3309 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = ($i0 >> 14) & 16383;
            return 1;
        } else if ($i0 == 3310) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = $i0 >> 28;
            return 1;
        } else if ($i0 == 3311) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = $i0 & 16383;
            return 1;
        } else if ($i0 == 3312) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = client.start ? (byte) 1 : (byte) 0;
            return 1;
        } else if ($i0 == 3313) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701] + 32768;
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $i3 = ($i3 * 537618701) - 1;
            $r5 = (Region) Region.value.get((long) $i0);
            if ($r5 == null) {
                $i0 = -1;
            } else {
                if (i >= 0) {
                    if (i < $r5.size.length) {
                        $i0 = $r5.size[i];
                    }
                }
                $i0 = -1;
            }
            $r1[$i3] = $i0;
            return 1;
        } else if ($i0 == 3314) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701] + 32768;
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $r1[($i3 * 537618701) - 1] = HyperlinkRecord.get($i0, i, 390220560);
            return 1;
        } else if (3315 == $i0) {
            XMLParser.type -= 1905859466;
            $i0 = XMLParser.this$0[XMLParser.type * 537618701] + 32768;
            i = XMLParser.this$0[(XMLParser.type * 537618701) + 1];
            $r1 = XMLParser.this$0;
            $i3 = XMLParser.type - 1194553915;
            XMLParser.type = $i3;
            $r1[($i3 * 537618701) - 1] = Tag.add($i0, i, 1741633247);
            return 1;
        } else if (3316 == $i0) {
            if (client.out * -2036797811 >= 2) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = client.out * -2036797811;
            } else {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 0;
            }
            return 1;
        } else if (3317 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = -659341571 * client.description;
            return 1;
        } else if (3318 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = client.f407x * -1304916389;
            return 1;
        } else if ($i0 == 3321) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = -28768771 * client.entry;
            return 1;
        } else if ($i0 == 3322) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = client.from * 392548631;
            return 1;
        } else if (3323 == $i0) {
            if (client.comments) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 1;
            } else {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = 0;
            }
            return 1;
        } else if (3324 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r1[($i0 * 537618701) - 1] = client.f397m * 1164415301;
            return 1;
        } else if (3325 != $i0) {
            return 2;
        } else {
            XMLParser.type -= -483248364;
            $i0 = (XMLParser.this$0[XMLParser.type * 537618701] + (XMLParser.this$0[(XMLParser.type * 537618701) + 1] << 14)) + (XMLParser.this$0[(XMLParser.type * 537618701) + 2] << 28);
            $i0 = $i0;
            $i0 = $i0 + XMLParser.this$0[(XMLParser.type * 537618701) + 3];
            $r1 = XMLParser.this$0;
            i = XMLParser.type - 1194553915;
            XMLParser.type = i;
            $r1[(i * 537618701) - 1] = $i0;
            return 1;
        }
    }
}
