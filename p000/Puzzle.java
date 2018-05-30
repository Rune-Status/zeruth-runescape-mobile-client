package p000;

/* compiled from: iv */
public class Puzzle implements Renderer {
    public static final int FORMAT_ISO_8859_7 = 8;
    static final int MAX_PRINT_SIZE = 3500;
    public static boolean data;
    static final int messages = 0;

    static synchronized byte[] get(int i, byte b) {
        byte[] $r0;
        synchronized (iv.class) {
            try {
                $r0 = Select.toString(i, false, 1430499170);
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "iv.ad(" + ')');
            }
        }
        return $r0;
    }

    static final void init(System system, int $i0, int $i1, int i) {
        byte $b3 = (byte) 1;
        if (1670603375 * client.location == 0 || client.location * 1670603375 == 3) {
            if (client.$assertionsDisabled.context == TimeUnit.count) {
                Category $r15 = system.get(true, -2062623005);
                if ($r15 != null) {
                    try {
                        $i0 = client.$assertionsDisabled.this$0[0] - $i0;
                        $i1 = client.$assertionsDisabled.data[0] - $i1;
                        if ($r15.load($i0, $i1, -1339448146)) {
                            $i0 -= ($r15.this$0 * 1248778045) / 2;
                            $i1 -= ($r15.name * -1565083491) / 2;
                            int $i2 = client.level * -198683079;
                            i = $i2;
                            i = $i2 & 2047;
                            int $i4 = Point.f197x[i];
                            int $i5 = Point.f198y[i];
                            i = (($i4 * $i1) + ($i0 * $i5)) >> 11;
                            i = ((516759209 * File.this$0.size) + i) >> 7;
                            $i4 = ((2328865 * File.this$0.value) - ((($i5 * $i1) - ($i4 * $i0)) >> 11)) >> 7;
                            Config $r7 = Logger.add(R$string.encoding, client.this$0.key, (byte) 45);
                            $r7.this$0.append(18, (byte) 31);
                            $r7.this$0.toString((Build$VERSION.type * 1407993063) + i, 1445736295);
                            $r7.this$0.write((1289967967 * Level.type) + $i4, 1239940751);
                            Logger $r8 = $r7.this$0;
                            if (!client.$assertionsDisabled.add(82, (byte) -104)) {
                                $b3 = (byte) 0;
                            } else if (client.$assertionsDisabled.add(81, (byte) -106)) {
                                $b3 = (byte) 2;
                            }
                            $r8.error($b3, -1163303791);
                            $r7.this$0.append($i0, (byte) 31);
                            $r7.this$0.append($i1, (byte) 31);
                            $r7.this$0.get(client.level * -198683079, -1752508204);
                            $r7.this$0.append(57, (byte) 31);
                            $r7.this$0.append(0, (byte) 31);
                            $r7.this$0.append(0, (byte) 31);
                            $r7.this$0.append(89, (byte) 31);
                            $r7.this$0.get(516759209 * File.this$0.size, -1752508204);
                            $r7.this$0.get(File.this$0.value * 2328865, -1752508204);
                            $r7.this$0.append(63, (byte) 31);
                            client.this$0.add($r7, (short) 255);
                            client.version = -751012115 * i;
                            client.element = 637696707 * $i4;
                            client.$assertionsDisabled.get(TimeUnit.$assertionsDisabled, 1459712006);
                        }
                    } catch (Throwable $r10) {
                        throw StringBuilder.append($r10, "iv.bn(" + ')');
                    }
                }
            }
        }
    }

    public float getInterpolation(float $f0) {
        return ($f0 * $f0) * $f0;
    }

    public float inout(float $f0) {
        return ($f0 * $f0) * $f0;
    }

    public float move(float $f0) {
        return ($f0 * $f0) * $f0;
    }

    public float update(float $f0, int i) {
        return ($f0 * $f0) * $f0;
    }
}
