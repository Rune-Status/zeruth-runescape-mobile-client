package p000;

/* compiled from: bm */
public final class Stream {
    public ArrayMap buffer;
    public long count;
    int data;
    int height;
    int index;
    int length;
    int name;
    int size;
    public ArrayMap type;
    int value;
    int width;

    Stream() {
        try {
            this.count = 0;
            this.index = 0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bm.<init>(" + ')');
        }
    }

    static int add(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int $i0, boolean $z0, byte b) {
        b = (byte) 1;
        if (1 == $i0) {
            try {
                $i0 = byteBuffer.value * -1545862613;
                int $i2 = byteBuffer2.value * -1545862613;
                if (!$z0) {
                    if ($i0 == -1) {
                        $i0 = 2001;
                    }
                    if ($i2 == -1) {
                        $i2 = 2001;
                    }
                }
                return $i0 - $i2;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "bm.as(" + ')');
            }
        } else if ($i0 == 2) {
            return (byteBuffer.log * 1116252417) - (1116252417 * byteBuffer2.log);
        } else {
            if (3 == $i0) {
                if (byteBuffer.name.equals("-")) {
                    if (!byteBuffer2.name.equals("-")) {
                        if ($z0) {
                            b = (byte) -1;
                        }
                        return b;
                    }
                } else if (!byteBuffer2.name.equals("-")) {
                    return byteBuffer.name.compareTo(byteBuffer2.name);
                } else {
                    if (!$z0) {
                        b = (byte) -1;
                    }
                    return b;
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
                if (!byteBuffer.replace(-336102326)) {
                    b = byteBuffer2.replace(-784258097) ? (byte) -1 : (byte) 0;
                } else if (byteBuffer2.replace(759479627)) {
                    b = (byte) 0;
                }
                return b;
            } else if ($i0 == 6) {
                if (byteBuffer.get(603044897)) {
                    if (!byteBuffer2.get(-1001711820)) {
                        return 1;
                    }
                } else if (byteBuffer2.get(-18997462)) {
                    return -1;
                }
            } else if ($i0 != 7) {
                return (-756728079 * byteBuffer.length) - (-756728079 * byteBuffer2.length);
            } else {
                if (byteBuffer.size(-1998519929)) {
                    if (!byteBuffer2.size(-1726215933)) {
                        return 1;
                    }
                } else if (byteBuffer2.size(-1077274779)) {
                    return -1;
                }
            }
            return 0;
        }
    }

    static Vec2 add(int i, int i2, byte b) {
        try {
            return (Vec2) ByteArray.buffer.get(Buffer.toString(i, i2, 0, (byte) -62));
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "bm.an(" + ')');
        }
    }

    static void read(int[] iArr, int[] iArr2, int i, int i2, int $i7, int i3, int $i3, int i4, int i5, int i6) {
        i = -(i3 >> 2);
        i3 = -(i3 & 3);
        $i3 = -$i3;
        i6 = i2;
        while ($i3 < 0) {
            int $i8;
            i2 = i;
            while (i2 < 0) {
                int $i9;
                $i8 = i6 + 1;
                try {
                    i6 = iArr2[i6];
                    if (i6 != 0) {
                        $i9 = $i7 + 1;
                        iArr[$i7] = i6;
                    } else {
                        $i9 = $i7 + 1;
                    }
                    i6 = $i8 + 1;
                    $i7 = iArr2[$i8];
                    if ($i7 != 0) {
                        iArr[$i9] = $i7;
                        $i8 = $i9 + 1;
                    } else {
                        $i8 = $i9 + 1;
                    }
                    $i7 = i6 + 1;
                    i6 = iArr2[i6];
                    if (i6 != 0) {
                        iArr[$i8] = i6;
                        $i8++;
                    } else {
                        $i8++;
                    }
                    i6 = $i7 + 1;
                    $i9 = iArr2[$i7];
                    if ($i9 != 0) {
                        $i7 = $i8 + 1;
                        iArr[$i8] = $i9;
                    } else {
                        $i7 = $i8 + 1;
                    }
                    i2++;
                } catch (RuntimeException $r2) {
                    throw StringBuilder.append($r2, "bm.ak(" + ')');
                }
            }
            i2 = $i7;
            $i8 = i6;
            $i7 = i3;
            while ($i7 < 0) {
                i6 = $i8 + 1;
                $i8 = iArr2[$i8];
                if ($i8 != 0) {
                    $i9 = i2 + 1;
                    iArr[i2] = $i8;
                } else {
                    $i9 = i2 + 1;
                }
                $i7++;
                i2 = $i9;
                $i8 = i6;
            }
            i6 = $i8 + i5;
            $i3++;
            $i7 = i2 + i4;
        }
    }

    static void set(int $i0, int i, int i2) {
        client.tag = -1672228023 * $i0;
        client.level = -243484663 * i;
        client.action = 0;
        client.priority = 0;
    }
}
