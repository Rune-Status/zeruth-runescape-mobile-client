package p000;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: nn */
public class MappedChannelRandomAccessSource {
    byte[] buffer;
    int count;
    long data;
    long index;
    int length;
    byte[] name;
    long offset;
    long position;
    long size;
    ByteArrayBuffer this$0;
    long value;

    public MappedChannelRandomAccessSource(ByteArrayBuffer byteArrayBuffer, int i, int i2) throws IOException {
        try {
            this.offset = 2179898814543714021L;
            this.data = 472725623425503385L;
            this.count = 0;
            this.this$0 = byteArrayBuffer;
            long $l2 = byteArrayBuffer.get(2057608795) * 1114027514879369957L;
            this.position = $l2;
            this.index = $l2 * -6111940843886946427L;
            this.buffer = new byte[i];
            this.name = new byte[i2];
            this.size = 0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "nn.<init>(" + ')');
        }
    }

    void add() throws IOException {
        this.length = 0;
        if (this.size * -6693291830970498427L != this.value * -3350398878597138191L) {
            this.this$0.append(this.size * -6693291830970498427L);
            this.value = 4947570184559919829L * this.size;
        }
        this.offset = this.size * 3854352939879190791L;
        while (this.length * 1511913821 < this.buffer.length) {
            int $i0 = this.this$0.get(this.buffer, this.length * 1511913821, this.buffer.length - (this.length * 1511913821), (byte) 35);
            if ($i0 != -1) {
                this.value += -4373627620404348911L * ((long) $i0);
                this.length = ($i0 * 1373250293) + this.length;
            } else {
                return;
            }
        }
    }

    void add(int i) throws IOException {
        try {
            if (3134483291187657815L * this.data != -1) {
                long $l5;
                Object obj;
                long j;
                if (3134483291187657815L * this.data != -3350398878597138191L * this.value) {
                    this.this$0.append(3134483291187657815L * this.data);
                    this.value = -6689093519855580729L * this.data;
                }
                this.this$0.append(this.name, 0, -475933495 * this.count, 1463515503);
                long $l1 = this.value;
                int $i0 = this.count;
                this.value = $l1 + (((long) $i0) * 5890808303976520025L);
                if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                    this.position = 5831341056068923797L * this.value;
                }
                $l1 = -1;
                long $l3 = -1;
                if (this.data * 3134483291187657815L >= this.offset * 3483330859842504979L) {
                    if (this.data * 3134483291187657815L < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                        $l1 = this.data * 3134483291187657815L;
                        $i0 = this.count * -475933495;
                        i = $i0;
                        if ((this.data * 3134483291187657815L) + ((long) $i0) > 3483330859842504979L * this.offset) {
                            $l5 = this.count * -475933495;
                            obj = $l5;
                            j = (3134483291187657815L * this.data) + ((long) $l5);
                            $l5 = this.length * 1511913821;
                            obj = $l5;
                            if (j <= (3483330859842504979L * this.offset) + ((long) $l5)) {
                                $i0 = this.count * -475933495;
                                i = $i0;
                                $l3 = (long) $i0;
                                $l5 = this.data * 3134483291187657815L;
                                j = $l5;
                                $l3 += $l5;
                                if ($l1 > -1 && $l3 > $l1) {
                                    i = (int) ($l3 - $l1);
                                    System.arraycopy(this.name, (int) ($l1 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l1 - (this.offset * 3483330859842504979L)), i);
                                }
                                this.data = 472725623425503385L;
                                this.count = 0;
                            }
                        }
                        if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) > this.data * 3134483291187657815L) {
                            if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) <= ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                                $l5 = this.offset * 3483330859842504979L;
                                j = $l5;
                                $l3 = ((long) (1511913821 * this.length)) + $l5;
                            }
                        }
                        i = (int) ($l3 - $l1);
                        System.arraycopy(this.name, (int) ($l1 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l1 - (this.offset * 3483330859842504979L)), i);
                        this.data = 472725623425503385L;
                        this.count = 0;
                    }
                }
                if (this.offset * 3483330859842504979L >= this.data * 3134483291187657815L) {
                    if (3483330859842504979L * this.offset < ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                        $l1 = this.offset * 3483330859842504979L;
                    }
                }
                $i0 = this.count * -475933495;
                i = $i0;
                if ((this.data * 3134483291187657815L) + ((long) $i0) > 3483330859842504979L * this.offset) {
                    $l5 = this.count * -475933495;
                    obj = $l5;
                    j = (3134483291187657815L * this.data) + ((long) $l5);
                    $l5 = this.length * 1511913821;
                    obj = $l5;
                    if (j <= (3483330859842504979L * this.offset) + ((long) $l5)) {
                        $i0 = this.count * -475933495;
                        i = $i0;
                        $l3 = (long) $i0;
                        $l5 = this.data * 3134483291187657815L;
                        j = $l5;
                        $l3 += $l5;
                        i = (int) ($l3 - $l1);
                        System.arraycopy(this.name, (int) ($l1 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l1 - (this.offset * 3483330859842504979L)), i);
                        this.data = 472725623425503385L;
                        this.count = 0;
                    }
                }
                if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) > this.data * 3134483291187657815L) {
                    if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) <= ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                        $l5 = this.offset * 3483330859842504979L;
                        j = $l5;
                        $l3 = ((long) (1511913821 * this.length)) + $l5;
                    }
                }
                i = (int) ($l3 - $l1);
                System.arraycopy(this.name, (int) ($l1 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l1 - (this.offset * 3483330859842504979L)), i);
                this.data = 472725623425503385L;
                this.count = 0;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nn.ar(" + ')');
        }
    }

    public void add(byte[] bArr, int $i1, int i) throws IOException {
        if (((long) i) + (-6693291830970498427L * this.size) > this.index * -5327026315961459127L) {
            this.index = -6069604170517924871L * ((-6693291830970498427L * this.size) + ((long) i));
        }
        if (-1 != 3134483291187657815L * this.data && (-6693291830970498427L * this.size < 3134483291187657815L * this.data || -6693291830970498427L * this.size > (this.data * 3134483291187657815L) + ((long) (this.count * -795507675)))) {
            try {
                add(-1837341492);
            } catch (IOException $r4) {
                this.value = 4373627620404348911L;
                throw $r4;
            }
        }
        if (3134483291187657815L * this.data != -1 && (-6693291830970498427L * this.size) + ((long) i) > ((long) this.name.length) + (3134483291187657815L * this.data)) {
            int $i0 = (int) (((long) this.name.length) - ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)));
            System.arraycopy(bArr, $i1, this.name, (int) ((this.size * -6693291830970498427L) - (this.data * 3134483291187657815L)), $i0);
            this.size += ((long) $i0) * 6567201253033567821L;
            $i1 += $i0;
            i -= $i0;
            this.count = this.name.length * -163150471;
            add(-2124886432);
        }
        if (i > this.name.length) {
            long $l8;
            long j;
            if (this.size * -6693291830970498427L != this.value * -3350398878597138191L) {
                this.this$0.append(this.size * -6693291830970498427L);
                this.value = this.size * 4947570184559919829L;
            }
            this.this$0.append(bArr, $i1, i, 1172665953);
            this.value += ((long) i) * -4373627620404348911L;
            if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                this.position = this.value * 5831341056068923797L;
            }
            long $l3 = -1;
            long $l4 = -1;
            if (this.size * -6693291830970498427L >= 3483330859842504979L * this.offset) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (103723355 * this.length))) {
                    $l3 = this.size * -6693291830970498427L;
                    if (((long) i) + (-6693291830970498427L * this.size) > this.offset * 3483330859842504979L) {
                        $l8 = (long) i;
                        if ((this.size * -6693291830970498427L) + $l8 <= ((long) (1511913821 * this.length)) + (this.offset * 3483330859842504979L)) {
                            $l4 = (-6693291830970498427L * this.size) + ((long) i);
                            if ($l3 > -1 && $l4 > $l3) {
                                System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                            }
                            this.size += ((long) i) * 6567201253033567821L;
                            return;
                        }
                    }
                    if (((long) (this.length * 1841033958)) + (3483330859842504979L * this.offset) > this.size * -6693291830970498427L) {
                        $l8 = this.offset * 3483330859842504979L;
                        j = $l8;
                        if (((long) (this.length * -1675449812)) + $l8 <= ((long) i) + (this.size * -6693291830970498427L)) {
                            $l4 = (3483330859842504979L * this.offset) + ((long) (this.length * -1118150238));
                        }
                    }
                    System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                    this.size += ((long) i) * 6567201253033567821L;
                    return;
                }
            }
            if (this.offset * 3483330859842504979L >= this.size * -6693291830970498427L) {
                if (this.offset * 3483330859842504979L < (-6693291830970498427L * this.size) + ((long) i)) {
                    $l3 = this.offset * 3483330859842504979L;
                }
            }
            if (((long) i) + (-6693291830970498427L * this.size) > this.offset * 3483330859842504979L) {
                $l8 = (long) i;
                if ((this.size * -6693291830970498427L) + $l8 <= ((long) (1511913821 * this.length)) + (this.offset * 3483330859842504979L)) {
                    $l4 = (-6693291830970498427L * this.size) + ((long) i);
                    System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                    this.size += ((long) i) * 6567201253033567821L;
                    return;
                }
            }
            if (((long) (this.length * 1841033958)) + (3483330859842504979L * this.offset) > this.size * -6693291830970498427L) {
                $l8 = this.offset * 3483330859842504979L;
                j = $l8;
                if (((long) (this.length * -1675449812)) + $l8 <= ((long) i) + (this.size * -6693291830970498427L)) {
                    $l4 = (3483330859842504979L * this.offset) + ((long) (this.length * -1118150238));
                }
            }
            System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
            this.size += ((long) i) * 6567201253033567821L;
            return;
        }
        if (i > 0) {
            if (-1 == this.data * 3134483291187657815L) {
                this.data = 3915208806857371267L * this.size;
            }
            System.arraycopy(bArr, $i1, this.name, (int) ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)), i);
            this.size += 6567201253033567821L * ((long) i);
            int $i12 = this.count * -475933495;
            $i1 = $i12;
            if ((this.size * -6693291830970498427L) - (3134483291187657815L * this.data) > ((long) $i12)) {
                this.count = -163150471 * ((int) ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)));
            }
        }
    }

    public void addProcess() throws IOException {
        add(-1891125449);
        this.this$0.add(420907623);
    }

    public void append(byte[] bArr, int $i0, int $i1) throws IOException {
        int $i02;
        if ($i1 + $i0 > bArr.length) {
            $i02 = ($i1 + $i0) - bArr.length;
            $i0 = $i02;
            try {
                throw new ArrayIndexOutOfBoundsException($i02);
            } catch (Throwable $r3) {
                this.value = 4373627620404348911L;
                throw $r3;
            }
        } else if (-1 == this.data * 3134483291187657815L || -6693291830970498427L * this.size < 3134483291187657815L * this.data || ((long) $i1) + (this.size * -6693291830970498427L) > ((long) (1372562421 * this.count)) + (3134483291187657815L * this.data)) {
            long j;
            long j2;
            int $i2;
            int $i4;
            byte[] $r4;
            int $i3;
            long $l7;
            long $l5 = -6693291830970498427L * this.size;
            if (-6693291830970498427L * this.size >= this.offset * 3483330859842504979L) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (673609040 * this.length))) {
                    j = (this.size * -6693291830970498427L) - (3483330859842504979L * this.offset);
                    j2 = j;
                    $i2 = (int) (((long) (this.length * 1511913821)) - j);
                    if ($i2 > $i1) {
                        $i2 = $i1;
                    }
                    j = this.offset * 3483330859842504979L;
                    j2 = j;
                    System.arraycopy(this.buffer, (int) ((this.size * -6693291830970498427L) - j), bArr, $i0, $i2);
                    j = ((long) $i2) * 6567201253033567821L;
                    j2 = j;
                    this.size += j;
                    $i4 = $i0 + $i2;
                    $i2 = $i1 - $i2;
                    $i02 = this.buffer;
                    $r4 = $i02;
                    $i02 = $i02.length;
                    if ($i2 > $i02) {
                        this.this$0.append(-6693291830970498427L * this.size);
                        this.value = this.size * 4947570184559919829L;
                        while ($i2 > 0) {
                            $i3 = this.this$0.get(bArr, $i4, $i2, (byte) -33);
                            if (-1 == $i3) {
                                break;
                            }
                            j = ((long) $i3) * -4373627620404348911L;
                            j2 = j;
                            this.value += j;
                            this.size += 6567201253033567821L * ((long) $i3);
                            $i4 += $i3;
                            $i2 -= $i3;
                        }
                    } else if ($i2 > 0) {
                        toString(724203974);
                        $i02 = this.length * 1511913821;
                        $i3 = $i02;
                        $i3 = $i2 <= $i02 ? 1511913821 * this.length : $i2;
                        System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                        $i4 += $i3;
                        $i2 -= $i3;
                        this.size += 6567201253033567821L * ((long) $i3);
                    }
                    if (-1 != 3134483291187657815L * this.data) {
                        if (this.data * 3134483291187657815L > this.size * -6693291830970498427L && $i2 > 0) {
                            $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                            $i3 = $i02 + $i4;
                            if ($i3 > $i4 + $i2) {
                                $i3 = $i2 + $i4;
                            }
                            while ($i4 < $i3) {
                                bArr[$i4] = (byte) 0;
                                $i2--;
                                this.size += 6567201253033567821L;
                                $i4++;
                            }
                        }
                        j2 = -1;
                        $l7 = -1;
                        if (this.data * 3134483291187657815L >= $l5) {
                            j = (long) $i1;
                            if (3134483291187657815L * this.data < j + $l5) {
                                j2 = this.data * 3134483291187657815L;
                                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                                    j = (long) $i1;
                                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                        if (j2 > -1 && $l7 > j2) {
                                            System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                            if ($l7 > this.size * -6693291830970498427L) {
                                                $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                                this.size = $l7 * 6567201253033567821L;
                                            }
                                        }
                                    }
                                }
                                j = (long) $i1;
                                if (j + $l5 > this.data * 3134483291187657815L) {
                                    j = (long) $i1;
                                    if (j + $l5 <= ((long) (this.count * -1306800297)) + (3134483291187657815L * this.data)) {
                                        $l7 = ((long) $i1) + $l5;
                                    }
                                }
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        if ($l5 >= 3134483291187657815L * this.data) {
                            if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -1824830833))) {
                                j2 = $l5;
                            }
                        }
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -1306800297)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                    if ($i2 > 0) {
                        throw new EOFException();
                    }
                }
            }
            $i2 = $i1;
            $i4 = $i0;
            $i02 = this.buffer;
            $r4 = $i02;
            $i02 = $i02.length;
            if ($i2 > $i02) {
                this.this$0.append(-6693291830970498427L * this.size);
                this.value = this.size * 4947570184559919829L;
                while ($i2 > 0) {
                    $i3 = this.this$0.get(bArr, $i4, $i2, (byte) -33);
                    if (-1 == $i3) {
                        break;
                    }
                    j = ((long) $i3) * -4373627620404348911L;
                    j2 = j;
                    this.value += j;
                    this.size += 6567201253033567821L * ((long) $i3);
                    $i4 += $i3;
                    $i2 -= $i3;
                }
            } else if ($i2 > 0) {
                toString(724203974);
                $i02 = this.length * 1511913821;
                $i3 = $i02;
                if ($i2 <= $i02) {
                }
                System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                $i4 += $i3;
                $i2 -= $i3;
                this.size += 6567201253033567821L * ((long) $i3);
            }
            if (-1 != 3134483291187657815L * this.data) {
                $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                $i3 = $i02 + $i4;
                if ($i3 > $i4 + $i2) {
                    $i3 = $i2 + $i4;
                }
                while ($i4 < $i3) {
                    bArr[$i4] = (byte) 0;
                    $i2--;
                    this.size += 6567201253033567821L;
                    $i4++;
                }
                j2 = -1;
                $l7 = -1;
                if (this.data * 3134483291187657815L >= $l5) {
                    j = (long) $i1;
                    if (3134483291187657815L * this.data < j + $l5) {
                        j2 = this.data * 3134483291187657815L;
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -1306800297)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                if ($l5 >= 3134483291187657815L * this.data) {
                    if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -1824830833))) {
                        j2 = $l5;
                    }
                }
                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                    j = (long) $i1;
                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                j = (long) $i1;
                if (j + $l5 > this.data * 3134483291187657815L) {
                    j = (long) $i1;
                    if (j + $l5 <= ((long) (this.count * -1306800297)) + (3134483291187657815L * this.data)) {
                        $l7 = ((long) $i1) + $l5;
                    }
                }
                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                if ($l7 > this.size * -6693291830970498427L) {
                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                    this.size = $l7 * 6567201253033567821L;
                }
            }
            if ($i2 > 0) {
                throw new EOFException();
            }
        } else {
            System.arraycopy(this.name, (int) ((-6693291830970498427L * this.size) - (this.data * 3134483291187657815L)), bArr, $i0, $i1);
            this.size += ((long) $i1) * 6567201253033567821L;
        }
    }

    void clear() throws IOException {
        this.length = 0;
        if (this.size * -6693291830970498427L != this.value * -3350398878597138191L) {
            this.this$0.append(this.size * -6693291830970498427L);
            this.value = 4947570184559919829L * this.size;
        }
        this.offset = this.size * 3854352939879190791L;
        while (-857938112 * this.length < this.buffer.length) {
            int $i0 = this.this$0.get(this.buffer, this.length * 840740721, this.buffer.length - (this.length * -1425881636), (byte) -28);
            if ($i0 != -1) {
                this.value += -4373627620404348911L * ((long) $i0);
                this.length = ($i0 * 1373250293) + this.length;
            } else {
                return;
            }
        }
    }

    void close() throws IOException {
        if (this.data * 3134483291187657815L != -1) {
            long $l4;
            long $l0;
            long j;
            long $l2;
            int $i3;
            if (this.data * 3134483291187657815L != -3350398878597138191L * this.value) {
                this.this$0.append(this.data * 3134483291187657815L);
                this.value = -6689093519855580729L * this.data;
            }
            this.this$0.append(this.name, 0, -178697379 * this.count, 1065777529);
            this.value += ((long) this.count) * 5890808303976520025L;
            if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                this.position = 5831341056068923797L * this.value;
            }
            if (this.data * 3134483291187657815L >= this.offset * 3483330859842504979L) {
                $l4 = (long) (-2123132965 * this.length);
                if (this.data * 3134483291187657815L < (this.offset * 3483330859842504979L) + $l4) {
                    $l0 = this.data * 3134483291187657815L;
                    $l4 = (long) (this.count * -475933495);
                    if ((this.data * 3134483291187657815L) + $l4 > this.offset * 3483330859842504979L) {
                        $l4 = (long) (this.count * -475933495);
                        if ((this.data * 3134483291187657815L) + $l4 <= (this.offset * 3483330859842504979L) + ((long) (this.length * 1511913821))) {
                            $l4 = this.data * 3134483291187657815L;
                            j = $l4;
                            $l2 = ((long) (this.count * -1064082639)) + $l4;
                            if ($l0 > -1 && $l2 > $l0) {
                                $i3 = (int) ($l2 - $l0);
                                System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                            }
                            this.data = 472725623425503385L;
                            this.count = 0;
                        }
                    }
                    $l4 = (long) (this.length * 1511913821);
                    j = $l4;
                    if ((this.offset * 3483330859842504979L) + $l4 > this.data * 3134483291187657815L) {
                        $l4 = (long) (this.length * 1511913821);
                        if ((this.offset * 3483330859842504979L) + $l4 <= ((long) (743365992 * this.count)) + (this.data * 3134483291187657815L)) {
                            $l4 = this.offset * 3483330859842504979L;
                            j = $l4;
                            $l2 = ((long) (this.length * 1511913821)) + $l4;
                            $i3 = (int) ($l2 - $l0);
                            System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                            this.data = 472725623425503385L;
                            this.count = 0;
                        }
                    }
                    $l2 = -1;
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            if (this.offset * 3483330859842504979L >= this.data * 3134483291187657815L) {
                $l4 = this.data * 3134483291187657815L;
                j = $l4;
                if (this.offset * 3483330859842504979L < ((long) (259219487 * this.count)) + $l4) {
                    $l0 = this.offset * 3483330859842504979L;
                    $l4 = (long) (this.count * -475933495);
                    if ((this.data * 3134483291187657815L) + $l4 > this.offset * 3483330859842504979L) {
                        $l4 = (long) (this.count * -475933495);
                        if ((this.data * 3134483291187657815L) + $l4 <= (this.offset * 3483330859842504979L) + ((long) (this.length * 1511913821))) {
                            $l4 = this.data * 3134483291187657815L;
                            j = $l4;
                            $l2 = ((long) (this.count * -1064082639)) + $l4;
                            $i3 = (int) ($l2 - $l0);
                            System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                            this.data = 472725623425503385L;
                            this.count = 0;
                        }
                    }
                    $l4 = (long) (this.length * 1511913821);
                    j = $l4;
                    if ((this.offset * 3483330859842504979L) + $l4 > this.data * 3134483291187657815L) {
                        $l4 = (long) (this.length * 1511913821);
                        if ((this.offset * 3483330859842504979L) + $l4 <= ((long) (743365992 * this.count)) + (this.data * 3134483291187657815L)) {
                            $l4 = this.offset * 3483330859842504979L;
                            j = $l4;
                            $l2 = ((long) (this.length * 1511913821)) + $l4;
                            $i3 = (int) ($l2 - $l0);
                            System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                            this.data = 472725623425503385L;
                            this.count = 0;
                        }
                    }
                    $l2 = -1;
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            $l0 = -1;
            $l4 = (long) (this.count * -475933495);
            if ((this.data * 3134483291187657815L) + $l4 > this.offset * 3483330859842504979L) {
                $l4 = (long) (this.count * -475933495);
                if ((this.data * 3134483291187657815L) + $l4 <= (this.offset * 3483330859842504979L) + ((long) (this.length * 1511913821))) {
                    $l4 = this.data * 3134483291187657815L;
                    j = $l4;
                    $l2 = ((long) (this.count * -1064082639)) + $l4;
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            $l4 = (long) (this.length * 1511913821);
            j = $l4;
            if ((this.offset * 3483330859842504979L) + $l4 > this.data * 3134483291187657815L) {
                $l4 = (long) (this.length * 1511913821);
                if ((this.offset * 3483330859842504979L) + $l4 <= ((long) (743365992 * this.count)) + (this.data * 3134483291187657815L)) {
                    $l4 = this.offset * 3483330859842504979L;
                    j = $l4;
                    $l2 = ((long) (this.length * 1511913821)) + $l4;
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            $l2 = -1;
            $i3 = (int) ($l2 - $l0);
            System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
            this.data = 472725623425503385L;
            this.count = 0;
        }
    }

    public void close(long $l0) throws IOException {
        if ($l0 < 0) {
            throw new IOException("");
        }
        this.size = 6567201253033567821L * $l0;
    }

    public void close(byte[] bArr) throws IOException {
        get(bArr, 0, bArr.length, -606087449);
    }

    public void close(byte[] bArr, int $i1, int i) throws IOException {
        if (((long) i) + (-6693291830970498427L * this.size) > this.index * -5327026315961459127L) {
            this.index = -6069604170517924871L * ((-6693291830970498427L * this.size) + ((long) i));
        }
        if (-1 != 3134483291187657815L * this.data && (-6693291830970498427L * this.size < 3134483291187657815L * this.data || -6693291830970498427L * this.size > (this.data * 3134483291187657815L) + ((long) (this.count * -475933495)))) {
            try {
                add(-1963144896);
            } catch (IOException $r4) {
                this.value = 4373627620404348911L;
                throw $r4;
            }
        }
        if (3134483291187657815L * this.data != -1 && (-6693291830970498427L * this.size) + ((long) i) > ((long) this.name.length) + (3134483291187657815L * this.data)) {
            int $i0 = (int) (((long) this.name.length) - ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)));
            System.arraycopy(bArr, $i1, this.name, (int) ((this.size * -6693291830970498427L) - (this.data * 3134483291187657815L)), $i0);
            this.size += ((long) $i0) * 6567201253033567821L;
            $i1 += $i0;
            i -= $i0;
            this.count = this.name.length * -163150471;
            add(-1918187056);
        }
        if (i > this.name.length) {
            long $l8;
            long j;
            if (this.size * -6693291830970498427L != this.value * -3350398878597138191L) {
                this.this$0.append(this.size * -6693291830970498427L);
                this.value = this.size * 4947570184559919829L;
            }
            this.this$0.append(bArr, $i1, i, 1072687734);
            this.value += ((long) i) * -4373627620404348911L;
            if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                this.position = this.value * 5831341056068923797L;
            }
            long $l3 = -1;
            long $l4 = -1;
            if (this.size * -6693291830970498427L >= 3483330859842504979L * this.offset) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    $l3 = this.size * -6693291830970498427L;
                    if (((long) i) + (-6693291830970498427L * this.size) > this.offset * 3483330859842504979L) {
                        $l8 = (long) i;
                        if ((this.size * -6693291830970498427L) + $l8 <= ((long) (1511913821 * this.length)) + (this.offset * 3483330859842504979L)) {
                            $l4 = (-6693291830970498427L * this.size) + ((long) i);
                            if ($l3 > -1 && $l4 > $l3) {
                                System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                            }
                            this.size += ((long) i) * 6567201253033567821L;
                            return;
                        }
                    }
                    if (((long) (this.length * 1511913821)) + (3483330859842504979L * this.offset) > this.size * -6693291830970498427L) {
                        $l8 = this.offset * 3483330859842504979L;
                        j = $l8;
                        if (((long) (this.length * 1511913821)) + $l8 <= ((long) i) + (this.size * -6693291830970498427L)) {
                            $l4 = (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821));
                        }
                    }
                    System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                    this.size += ((long) i) * 6567201253033567821L;
                    return;
                }
            }
            if (this.offset * 3483330859842504979L >= this.size * -6693291830970498427L) {
                if (this.offset * 3483330859842504979L < (-6693291830970498427L * this.size) + ((long) i)) {
                    $l3 = this.offset * 3483330859842504979L;
                }
            }
            if (((long) i) + (-6693291830970498427L * this.size) > this.offset * 3483330859842504979L) {
                $l8 = (long) i;
                if ((this.size * -6693291830970498427L) + $l8 <= ((long) (1511913821 * this.length)) + (this.offset * 3483330859842504979L)) {
                    $l4 = (-6693291830970498427L * this.size) + ((long) i);
                    System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                    this.size += ((long) i) * 6567201253033567821L;
                    return;
                }
            }
            if (((long) (this.length * 1511913821)) + (3483330859842504979L * this.offset) > this.size * -6693291830970498427L) {
                $l8 = this.offset * 3483330859842504979L;
                j = $l8;
                if (((long) (this.length * 1511913821)) + $l8 <= ((long) i) + (this.size * -6693291830970498427L)) {
                    $l4 = (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821));
                }
            }
            System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
            this.size += ((long) i) * 6567201253033567821L;
            return;
        }
        if (i > 0) {
            if (-1 == this.data * 3134483291187657815L) {
                this.data = 3915208806857371267L * this.size;
            }
            System.arraycopy(bArr, $i1, this.name, (int) ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)), i);
            this.size += 6567201253033567821L * ((long) i);
            int $i12 = this.count * -475933495;
            $i1 = $i12;
            if ((this.size * -6693291830970498427L) - (3134483291187657815L * this.data) > ((long) $i12)) {
                this.count = -163150471 * ((int) ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)));
            }
        }
    }

    public void executeRequest() throws IOException {
        add(-1839044699);
        this.this$0.add(420907623);
    }

    public long get(short s) {
        try {
            return -5327026315961459127L * this.index;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nn.an(" + ')');
        }
    }

    void get() throws IOException {
        this.length = 0;
        if (this.size * -6693291830970498427L != this.value * -3350398878597138191L) {
            this.this$0.append(this.size * -6693291830970498427L);
            this.value = 4947570184559919829L * this.size;
        }
        this.offset = this.size * 3854352939879190791L;
        while (this.length * 1511913821 < this.buffer.length) {
            int $i0 = this.this$0.get(this.buffer, this.length * -394273915, this.buffer.length - (this.length * 1511913821), (byte) 37);
            if ($i0 != -1) {
                this.value += -4373627620404348911L * ((long) $i0);
                this.length = ($i0 * 1373250293) + this.length;
            } else {
                return;
            }
        }
    }

    public void get(long $l0) throws IOException {
        if ($l0 < 0) {
            try {
                throw new IOException("");
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "nn.ad(" + ')');
            }
        }
        this.size = 6567201253033567821L * $l0;
    }

    public void get(byte[] bArr) throws IOException {
        get(bArr, 0, bArr.length, -606087449);
    }

    public void get(byte[] bArr, byte b) throws IOException {
        try {
            get(bArr, 0, bArr.length, -606087449);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nn.aa(" + ')');
        }
    }

    public void get(byte[] bArr, int $i0, int $i1) throws IOException {
        int $i02;
        if ($i1 + $i0 > bArr.length) {
            $i02 = ($i1 + $i0) - bArr.length;
            $i0 = $i02;
            try {
                throw new ArrayIndexOutOfBoundsException($i02);
            } catch (Throwable $r3) {
                this.value = 4373627620404348911L;
                throw $r3;
            }
        } else if (-1 == this.data * 3134483291187657815L || -6693291830970498427L * this.size < 3134483291187657815L * this.data || ((long) $i1) + (this.size * -6693291830970498427L) > ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
            long j;
            long j2;
            int $i2;
            int $i4;
            byte[] $r4;
            int $i3;
            long $l7;
            long $l5 = -6693291830970498427L * this.size;
            if (-6693291830970498427L * this.size >= this.offset * 3483330859842504979L) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    j = (this.size * -6693291830970498427L) - (3483330859842504979L * this.offset);
                    j2 = j;
                    $i2 = (int) (((long) (this.length * 1511913821)) - j);
                    if ($i2 > $i1) {
                        $i2 = $i1;
                    }
                    j = this.offset * 3483330859842504979L;
                    j2 = j;
                    System.arraycopy(this.buffer, (int) ((this.size * -6693291830970498427L) - j), bArr, $i0, $i2);
                    j = ((long) $i2) * 6567201253033567821L;
                    j2 = j;
                    this.size += j;
                    $i4 = $i0 + $i2;
                    $i2 = $i1 - $i2;
                    $i02 = this.buffer;
                    $r4 = $i02;
                    $i02 = $i02.length;
                    if ($i2 > $i02) {
                        this.this$0.append(-6693291830970498427L * this.size);
                        this.value = this.size * 4947570184559919829L;
                        while ($i2 > 0) {
                            $i3 = this.this$0.get(bArr, $i4, $i2, (byte) 31);
                            if (-1 == $i3) {
                                break;
                            }
                            j = ((long) $i3) * -4373627620404348911L;
                            j2 = j;
                            this.value += j;
                            this.size += 6567201253033567821L * ((long) $i3);
                            $i4 += $i3;
                            $i2 -= $i3;
                        }
                    } else if ($i2 > 0) {
                        toString(724203974);
                        $i02 = this.length * 1511913821;
                        $i3 = $i02;
                        $i3 = $i2 <= $i02 ? 1511913821 * this.length : $i2;
                        System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                        $i4 += $i3;
                        $i2 -= $i3;
                        this.size += 6567201253033567821L * ((long) $i3);
                    }
                    if (-1 != 3134483291187657815L * this.data) {
                        if (this.data * 3134483291187657815L > this.size * -6693291830970498427L && $i2 > 0) {
                            $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                            $i3 = $i02 + $i4;
                            if ($i3 > $i4 + $i2) {
                                $i3 = $i2 + $i4;
                            }
                            while ($i4 < $i3) {
                                bArr[$i4] = (byte) 0;
                                $i2--;
                                this.size += 6567201253033567821L;
                                $i4++;
                            }
                        }
                        j2 = -1;
                        $l7 = -1;
                        if (this.data * 3134483291187657815L >= $l5) {
                            j = (long) $i1;
                            if (3134483291187657815L * this.data < j + $l5) {
                                j2 = this.data * 3134483291187657815L;
                                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                                    j = (long) $i1;
                                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                        if (j2 > -1 && $l7 > j2) {
                                            System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                            if ($l7 > this.size * -6693291830970498427L) {
                                                $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                                this.size = $l7 * 6567201253033567821L;
                                            }
                                        }
                                    }
                                }
                                j = (long) $i1;
                                if (j + $l5 > this.data * 3134483291187657815L) {
                                    j = (long) $i1;
                                    if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                        $l7 = ((long) $i1) + $l5;
                                    }
                                }
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        if ($l5 >= 3134483291187657815L * this.data) {
                            if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -475933495))) {
                                j2 = $l5;
                            }
                        }
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                    if ($i2 > 0) {
                        throw new EOFException();
                    }
                }
            }
            $i2 = $i1;
            $i4 = $i0;
            $i02 = this.buffer;
            $r4 = $i02;
            $i02 = $i02.length;
            if ($i2 > $i02) {
                this.this$0.append(-6693291830970498427L * this.size);
                this.value = this.size * 4947570184559919829L;
                while ($i2 > 0) {
                    $i3 = this.this$0.get(bArr, $i4, $i2, (byte) 31);
                    if (-1 == $i3) {
                        break;
                    }
                    j = ((long) $i3) * -4373627620404348911L;
                    j2 = j;
                    this.value += j;
                    this.size += 6567201253033567821L * ((long) $i3);
                    $i4 += $i3;
                    $i2 -= $i3;
                }
            } else if ($i2 > 0) {
                toString(724203974);
                $i02 = this.length * 1511913821;
                $i3 = $i02;
                if ($i2 <= $i02) {
                }
                System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                $i4 += $i3;
                $i2 -= $i3;
                this.size += 6567201253033567821L * ((long) $i3);
            }
            if (-1 != 3134483291187657815L * this.data) {
                $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                $i3 = $i02 + $i4;
                if ($i3 > $i4 + $i2) {
                    $i3 = $i2 + $i4;
                }
                while ($i4 < $i3) {
                    bArr[$i4] = (byte) 0;
                    $i2--;
                    this.size += 6567201253033567821L;
                    $i4++;
                }
                j2 = -1;
                $l7 = -1;
                if (this.data * 3134483291187657815L >= $l5) {
                    j = (long) $i1;
                    if (3134483291187657815L * this.data < j + $l5) {
                        j2 = this.data * 3134483291187657815L;
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                if ($l5 >= 3134483291187657815L * this.data) {
                    if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -475933495))) {
                        j2 = $l5;
                    }
                }
                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                    j = (long) $i1;
                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                j = (long) $i1;
                if (j + $l5 > this.data * 3134483291187657815L) {
                    j = (long) $i1;
                    if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                        $l7 = ((long) $i1) + $l5;
                    }
                }
                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                if ($l7 > this.size * -6693291830970498427L) {
                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                    this.size = $l7 * 6567201253033567821L;
                }
            }
            if ($i2 > 0) {
                throw new EOFException();
            }
        } else {
            System.arraycopy(this.name, (int) ((-6693291830970498427L * this.size) - (this.data * 3134483291187657815L)), bArr, $i0, $i1);
            this.size += ((long) $i1) * 6567201253033567821L;
        }
    }

    public void get(byte[] r35, int r36, int r37, int r38) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:MappedChannelRandomAccessSource.get(byte[], int, int, int):void. bs: [B:9:0x0019, B:56:0x0116]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r34 = this;
        r38 = r37 + r36;
        r0 = r35;	 Catch:{ RuntimeException -> 0x0028 }
        r5 = r0.length;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r38;
        if (r0 <= r5) goto L_0x0043;
    L_0x0009:
        r6 = new java.lang.ArrayIndexOutOfBoundsException;
        r36 = r37 + r36;
        r0 = r35;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0028 }
        r37 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r36;
        r1 = r37;
        r0 = r0 - r1;
        r36 = r0;
        r6.<init>(r0);	 Catch:{ IOException -> 0x001d }
        throw r6;	 Catch:{ RuntimeException -> 0x0028 }
    L_0x001d:
        r7 = move-exception;
        r8 = 4373627620404348911; // 0x3cb23f25f609c7ef float:-6.986326E32 double:2.5322345595678644E-16;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0.value = r8;	 Catch:{ RuntimeException -> 0x0028 }
        throw r7;	 Catch:{ RuntimeException -> 0x0028 }
    L_0x0028:
        r10 = move-exception;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = "nn.ag(";
        r11 = r11.append(r12);
        r13 = 41;
        r11 = r11.append(r13);
        r14 = r11.toString();
        r15 = p000.StringBuilder.append(r10, r14);
        throw r15;
    L_0x0043:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r16;
        r0 = r0 * r8;
        r16 = r0;
        r8 = -1;
        r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r18 == 0) goto L_0x0116;
    L_0x0059:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r16 = r8 * r16;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r19 = r8 * r19;
        r18 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1));
        if (r18 < 0) goto L_0x0116;
    L_0x0077:
        r0 = r37;
        r0 = (long) r0;
        r16 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r0 = r16;
        r2 = r19;
        r0 = r0 + r2;
        r16 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0028 }
        r38 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = -475933495; // 0xffffffffe3a1d4c9 float:-5.970517E21 double:NaN;
        r38 = r13 * r38;
        r0 = r38;
        r0 = (long) r0;
        r19 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r21 = r8 * r21;
        r0 = r19;
        r2 = r21;
        r0 = r0 + r2;
        r19 = r0;
        r18 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1));
        if (r18 > 0) goto L_0x0116;
    L_0x00bb:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x0028 }
        r23 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r16 = r8 * r16;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r0 = r16;
        r2 = r19;
        r0 = r0 - r2;
        r16 = r0;
        r0 = (int) r0;
        r38 = r0;
        r0 = r23;	 Catch:{ IOException -> 0x001d }
        r1 = r38;	 Catch:{ IOException -> 0x001d }
        r2 = r35;	 Catch:{ IOException -> 0x001d }
        r3 = r36;	 Catch:{ IOException -> 0x001d }
        r4 = r37;	 Catch:{ IOException -> 0x001d }
        java.lang.System.arraycopy(r0, r1, r2, r3, r4);	 Catch:{ IOException -> 0x001d }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r37;
        r0 = (long) r0;
        r19 = r0;
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r0 = r16;
        r2 = r19;
        r0 = r0 + r2;
        r16 = r0;
        r2 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r2.size = r0;	 Catch:{ RuntimeException -> 0x0028 }
        return;
    L_0x0116:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r16 = r8 * r16;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r19 = r8 * r19;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
        r18 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1));
        if (r18 < 0) goto L_0x058a;
    L_0x0144:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r19 = r8 * r19;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0028 }
        r38 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r38 = r13 * r38;
        r0 = r38;
        r0 = (long) r0;
        r24 = r0;
        r0 = r21;
        r2 = r24;
        r0 = r0 + r2;
        r21 = r0;
        r18 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1));
        if (r18 >= 0) goto L_0x058a;
    L_0x017c:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0028 }
        r38 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r0 = r38;
        r0 = r0 * r13;
        r38 = r0;
        r0 = (long) r0;
        r19 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0028 }
        r24 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r24 = r8 * r24;
        r0 = r21;
        r2 = r24;
        r0 = r0 - r2;
        r21 = r0;
        r0 = r19;
        r2 = r21;
        r0 = r0 - r2;
        r19 = r0;
        r0 = (int) r0;
        r38 = r0;
        r1 = r37;
        if (r0 <= r1) goto L_0x01c1;
    L_0x01bf:
        r38 = r37;
    L_0x01c1:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x0028 }
        r23 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
        r0 = r19;
        r2 = r21;
        r0 = r0 - r2;
        r19 = r0;
        r5 = (int) r0;
        r0 = r23;	 Catch:{ IOException -> 0x001d }
        r1 = r35;	 Catch:{ IOException -> 0x001d }
        r2 = r36;	 Catch:{ IOException -> 0x001d }
        r3 = r38;	 Catch:{ IOException -> 0x001d }
        java.lang.System.arraycopy(r0, r5, r1, r2, r3);	 Catch:{ IOException -> 0x001d }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r38;
        r0 = (long) r0;
        r21 = r0;
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
        r0 = r19;
        r2 = r21;
        r0 = r0 + r2;
        r19 = r0;
        r2 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r2.size = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r5 = r36 + r38;
        r38 = r37 - r38;
    L_0x021e:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.buffer;	 Catch:{ RuntimeException -> 0x0028 }
        r23 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0028 }
        r26 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r38;
        r1 = r26;
        if (r0 <= r1) goto L_0x034a;
    L_0x022d:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0028 }
        r27 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r19 = r8 * r19;
        r0 = r27;	 Catch:{ IOException -> 0x001d }
        r1 = r19;	 Catch:{ IOException -> 0x001d }
        r0.append(r1);	 Catch:{ IOException -> 0x001d }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 4947570184559919829; // 0x44a94cde980202d5 float:-1.6803536E-24 double:5.973857709681356E22;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r2 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r2.value = r0;	 Catch:{ RuntimeException -> 0x0028 }
    L_0x025b:
        if (r38 <= 0) goto L_0x0273;
    L_0x025d:
        r0 = r34;
        r0 = r0.this$0;
        r27 = r0;
        r13 = -1;	 Catch:{ IOException -> 0x001d }
        r0 = r27;	 Catch:{ IOException -> 0x001d }
        r1 = r35;	 Catch:{ IOException -> 0x001d }
        r2 = r38;	 Catch:{ IOException -> 0x001d }
        r26 = r0.get(r1, r5, r2, r13);	 Catch:{ IOException -> 0x001d }
        r13 = -1;
        r0 = r26;
        if (r13 != r0) goto L_0x0300;
    L_0x0273:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r19 = r8 * r19;
        r8 = -1;
        r18 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1));
        if (r18 == 0) goto L_0x04ea;
    L_0x0286:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
        r18 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1));
        if (r18 <= 0) goto L_0x03ad;
    L_0x02aa:
        if (r38 <= 0) goto L_0x03ad;
    L_0x02ac:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r21 = r8 * r21;
        r0 = r19;
        r2 = r21;
        r0 = r0 - r2;
        r19 = r0;
        r0 = (int) r0;
        r26 = r0;
        r0 = r0 + r5;
        r26 = r0;
        r28 = r5 + r38;
        r0 = r26;
        r1 = r28;
        if (r0 <= r1) goto L_0x02e0;
    L_0x02de:
        r26 = r38 + r5;
    L_0x02e0:
        r0 = r26;
        if (r5 >= r0) goto L_0x03ad;
    L_0x02e4:
        r13 = 0;	 Catch:{ RuntimeException -> 0x0028 }
        r35[r5] = r13;	 Catch:{ RuntimeException -> 0x0028 }
        r38 = r38 + -1;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r0 = r19;
        r0 = r0 + r8;
        r19 = r0;
        r2 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r2.size = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r5 = r5 + 1;
        goto L_0x02e0;
    L_0x0300:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.value;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r26;
        r0 = (long) r0;
        r21 = r0;
        r8 = -4373627620404348911; // 0xc34dc0da09f63811 float:5.927507E-33 double:-1.6749634054287394E16;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
        r0 = r19;
        r2 = r21;
        r0 = r0 + r2;
        r19 = r0;
        r2 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r2.value = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r26;
        r0 = (long) r0;
        r21 = r0;
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r21 = r8 * r21;
        r0 = r19;
        r2 = r21;
        r0 = r0 + r2;
        r19 = r0;
        r2 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r2.size = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r26;
        r5 = r5 + r0;
        r0 = r38;
        r1 = r26;
        r0 = r0 - r1;
        r38 = r0;
        goto L_0x025b;
    L_0x034a:
        if (r38 <= 0) goto L_0x0273;
    L_0x034c:
        r13 = 724203974; // 0x2b2a79c6 float:6.0565127E-13 double:3.57804304E-315;	 Catch:{ IOException -> 0x001d }
        r0 = r34;	 Catch:{ IOException -> 0x001d }
        r0.toString(r13);	 Catch:{ IOException -> 0x001d }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0028 }
        r26 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r0 = r26;
        r0 = r0 * r13;
        r26 = r0;
        r0 = r38;
        r1 = r26;
        if (r0 <= r1) goto L_0x0585;
    L_0x0368:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0028 }
        r26 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r26 = r13 * r26;
    L_0x0373:
        r0 = r34;
        r0 = r0.buffer;
        r23 = r0;
        r13 = 0;	 Catch:{ IOException -> 0x001d }
        r0 = r23;	 Catch:{ IOException -> 0x001d }
        r1 = r35;	 Catch:{ IOException -> 0x001d }
        r2 = r26;	 Catch:{ IOException -> 0x001d }
        java.lang.System.arraycopy(r0, r13, r1, r5, r2);	 Catch:{ IOException -> 0x001d }
        r0 = r26;
        r5 = r5 + r0;
        r0 = r38;
        r1 = r26;
        r0 = r0 - r1;
        r38 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r19 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r26;
        r0 = (long) r0;
        r21 = r0;
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r21 = r8 * r21;
        r0 = r19;
        r2 = r21;
        r0 = r0 + r2;
        r19 = r0;
        r2 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r2.size = r0;	 Catch:{ RuntimeException -> 0x0028 }
        goto L_0x0273;
    L_0x03ad:
        r21 = -1;
        r19 = -1;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r24 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r24;
        r0 = r0 * r8;
        r24 = r0;
        r18 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1));
        if (r18 < 0) goto L_0x04f4;
    L_0x03c5:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r24 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r24 = r8 * r24;
        r0 = r37;
        r0 = (long) r0;
        r29 = r0;
        r2 = r16;
        r0 = r0 + r2;
        r29 = r0;
        r18 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1));
        if (r18 >= 0) goto L_0x04f4;
    L_0x03e0:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
    L_0x03f0:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r24 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r24;
        r0 = r0 * r8;
        r24 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r5 = r0.count;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = -475933495; // 0xffffffffe3a1d4c9 float:-5.970517E21 double:NaN;
        r5 = r5 * r13;
        r0 = (long) r5;
        r29 = r0;
        r0 = r24;
        r2 = r29;
        r0 = r0 + r2;
        r24 = r0;
        r18 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1));
        if (r18 <= 0) goto L_0x052d;
    L_0x0416:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r5 = r0.count;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = -475933495; // 0xffffffffe3a1d4c9 float:-5.970517E21 double:NaN;
        r5 = r13 * r5;
        r0 = (long) r5;
        r24 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r29 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r29;
        r0 = r0 * r8;
        r29 = r0;
        r0 = r24;
        r2 = r29;
        r0 = r0 + r2;
        r24 = r0;
        r0 = r37;
        r0 = (long) r0;
        r29 = r0;
        r2 = r16;
        r0 = r0 + r2;
        r29 = r0;
        r18 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1));
        if (r18 > 0) goto L_0x052d;
    L_0x0447:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0028 }
        r37 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = -475933495; // 0xffffffffe3a1d4c9 float:-5.970517E21 double:NaN;
        r37 = r13 * r37;
        r0 = r37;
        r0 = (long) r0;
        r19 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r24 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r24 = r8 * r24;
        r0 = r19;
        r2 = r24;
        r0 = r0 + r2;
        r19 = r0;
    L_0x046b:
        r8 = -1;
        r18 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1));
        if (r18 <= 0) goto L_0x04ea;
    L_0x0471:
        r18 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1));
        if (r18 <= 0) goto L_0x04ea;
    L_0x0475:
        r24 = r19 - r21;
        r0 = r24;
        r5 = (int) r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x0028 }
        r23 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r24 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r24 = r8 * r24;
        r24 = r21 - r24;
        r0 = r24;
        r0 = (int) r0;
        r37 = r0;
        r16 = r21 - r16;
        r0 = r16;
        r0 = (int) r0;
        r26 = r0;
        r36 = r26 + r36;
        r0 = r23;	 Catch:{ IOException -> 0x001d }
        r1 = r37;	 Catch:{ IOException -> 0x001d }
        r2 = r35;	 Catch:{ IOException -> 0x001d }
        r3 = r36;	 Catch:{ IOException -> 0x001d }
        java.lang.System.arraycopy(r0, r1, r2, r3, r5);	 Catch:{ IOException -> 0x001d }
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r16 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r16;
        r0 = r0 * r8;
        r16 = r0;
        r18 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1));
        if (r18 <= 0) goto L_0x04ea;
    L_0x04bc:
        r0 = r38;
        r0 = (long) r0;
        r16 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0028 }
        r21 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r21;
        r0 = r0 * r8;
        r21 = r0;
        r21 = r19 - r21;
        r0 = r16;
        r2 = r21;
        r0 = r0 - r2;
        r16 = r0;
        r0 = (int) r0;
        r38 = r0;
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r16 = r19 * r8;
        r0 = r16;	 Catch:{ RuntimeException -> 0x0028 }
        r2 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r2.size = r0;	 Catch:{ RuntimeException -> 0x0028 }
    L_0x04ea:
        if (r38 <= 0) goto L_0x0591;
    L_0x04ec:
        r31 = new java.io.EOFException;
        r0 = r31;	 Catch:{ RuntimeException -> 0x0028 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0028 }
        throw r31;	 Catch:{ RuntimeException -> 0x0028 }
    L_0x04f4:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r24 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r24 = r8 * r24;
        r18 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1));
        if (r18 < 0) goto L_0x03f0;
    L_0x0505:
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r24 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r24 = r8 * r24;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r5 = r0.count;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = -475933495; // 0xffffffffe3a1d4c9 float:-5.970517E21 double:NaN;
        r5 = r5 * r13;
        r0 = (long) r5;
        r29 = r0;
        r0 = r24;
        r2 = r29;
        r0 = r0 + r2;
        r24 = r0;
        r18 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1));
        if (r18 >= 0) goto L_0x03f0;
    L_0x0528:
        r21 = r16;
        goto L_0x03f0;
    L_0x052d:
        r0 = r37;
        r0 = (long) r0;
        r24 = r0;
        r2 = r16;
        r0 = r0 + r2;
        r24 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r29 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r0 = r29;
        r0 = r0 * r8;
        r29 = r0;
        r18 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1));
        if (r18 <= 0) goto L_0x046b;
    L_0x054b:
        r0 = r37;
        r0 = (long) r0;
        r24 = r0;
        r2 = r16;
        r0 = r0 + r2;
        r24 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r5 = r0.count;	 Catch:{ RuntimeException -> 0x0028 }
        r13 = -475933495; // 0xffffffffe3a1d4c9 float:-5.970517E21 double:NaN;
        r5 = r5 * r13;
        r0 = (long) r5;
        r29 = r0;
        r0 = r34;	 Catch:{ RuntimeException -> 0x0028 }
        r0 = r0.data;	 Catch:{ RuntimeException -> 0x0028 }
        r32 = r0;	 Catch:{ RuntimeException -> 0x0028 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r32 = r8 * r32;
        r0 = r29;
        r2 = r32;
        r0 = r0 + r2;
        r29 = r0;
        r18 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1));
        if (r18 > 0) goto L_0x046b;
    L_0x0578:
        r0 = r37;
        r0 = (long) r0;
        r19 = r0;
        r2 = r16;
        r0 = r0 + r2;
        r19 = r0;
        goto L_0x046b;
    L_0x0585:
        r26 = r38;
        goto L_0x0373;
    L_0x058a:
        r38 = r37;
        r5 = r36;
        goto L_0x021e;
    L_0x0591:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: MappedChannelRandomAccessSource.get(byte[], int, int, int):void");
    }

    public long getIndexEntry() {
        return -5327026315961459127L * this.index;
    }

    public long length() {
        return -5327026315961459127L * this.index;
    }

    public void next(byte[] bArr, int $i1, int i) throws IOException {
        if (((long) i) + (-6693291830970498427L * this.size) > this.index * -5327026315961459127L) {
            this.index = -6069604170517924871L * ((-6693291830970498427L * this.size) + ((long) i));
        }
        if (-1 != 3134483291187657815L * this.data && (-6693291830970498427L * this.size < 3134483291187657815L * this.data || -6693291830970498427L * this.size > (this.data * 3134483291187657815L) + ((long) (this.count * -475933495)))) {
            try {
                add(-1982166192);
            } catch (IOException $r4) {
                this.value = 4373627620404348911L;
                throw $r4;
            }
        }
        if (3134483291187657815L * this.data != -1 && (-6693291830970498427L * this.size) + ((long) i) > ((long) this.name.length) + (3134483291187657815L * this.data)) {
            int $i0 = (int) (((long) this.name.length) - ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)));
            System.arraycopy(bArr, $i1, this.name, (int) ((this.size * -6693291830970498427L) - (this.data * 3134483291187657815L)), $i0);
            this.size += ((long) $i0) * 6567201253033567821L;
            $i1 += $i0;
            i -= $i0;
            this.count = this.name.length * -163150471;
            add(-2098835868);
        }
        if (i > this.name.length) {
            long $l8;
            long j;
            if (this.size * -6693291830970498427L != this.value * -3350398878597138191L) {
                this.this$0.append(this.size * -6693291830970498427L);
                this.value = this.size * 4947570184559919829L;
            }
            this.this$0.append(bArr, $i1, i, 1590375725);
            this.value += ((long) i) * -4373627620404348911L;
            if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                this.position = this.value * 5831341056068923797L;
            }
            long $l3 = -1;
            long $l4 = -1;
            if (this.size * -6693291830970498427L >= 3483330859842504979L * this.offset) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    $l3 = this.size * -6693291830970498427L;
                    if (((long) i) + (-6693291830970498427L * this.size) > this.offset * 3483330859842504979L) {
                        $l8 = (long) i;
                        if ((this.size * -6693291830970498427L) + $l8 <= ((long) (1511913821 * this.length)) + (this.offset * 3483330859842504979L)) {
                            $l4 = (-6693291830970498427L * this.size) + ((long) i);
                            if ($l3 > -1 && $l4 > $l3) {
                                System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                            }
                            this.size += ((long) i) * 6567201253033567821L;
                            return;
                        }
                    }
                    if (((long) (this.length * 1511913821)) + (3483330859842504979L * this.offset) > this.size * -6693291830970498427L) {
                        $l8 = this.offset * 3483330859842504979L;
                        j = $l8;
                        if (((long) (this.length * 1511913821)) + $l8 <= ((long) i) + (this.size * -6693291830970498427L)) {
                            $l4 = (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821));
                        }
                    }
                    System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                    this.size += ((long) i) * 6567201253033567821L;
                    return;
                }
            }
            if (this.offset * 3483330859842504979L >= this.size * -6693291830970498427L) {
                if (this.offset * 3483330859842504979L < (-6693291830970498427L * this.size) + ((long) i)) {
                    $l3 = this.offset * 3483330859842504979L;
                }
            }
            if (((long) i) + (-6693291830970498427L * this.size) > this.offset * 3483330859842504979L) {
                $l8 = (long) i;
                if ((this.size * -6693291830970498427L) + $l8 <= ((long) (1511913821 * this.length)) + (this.offset * 3483330859842504979L)) {
                    $l4 = (-6693291830970498427L * this.size) + ((long) i);
                    System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                    this.size += ((long) i) * 6567201253033567821L;
                    return;
                }
            }
            if (((long) (this.length * 1511913821)) + (3483330859842504979L * this.offset) > this.size * -6693291830970498427L) {
                $l8 = this.offset * 3483330859842504979L;
                j = $l8;
                if (((long) (this.length * 1511913821)) + $l8 <= ((long) i) + (this.size * -6693291830970498427L)) {
                    $l4 = (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821));
                }
            }
            System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
            this.size += ((long) i) * 6567201253033567821L;
            return;
        }
        if (i > 0) {
            if (-1 == this.data * 3134483291187657815L) {
                this.data = 3915208806857371267L * this.size;
            }
            System.arraycopy(bArr, $i1, this.name, (int) ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)), i);
            this.size += 6567201253033567821L * ((long) i);
            int $i12 = this.count * -475933495;
            $i1 = $i12;
            if ((this.size * -6693291830970498427L) - (3134483291187657815L * this.data) > ((long) $i12)) {
                this.count = -163150471 * ((int) ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)));
            }
        }
    }

    void open() throws IOException {
        if (3134483291187657815L * this.data != -1) {
            long $l4;
            long j;
            int $i3;
            if (3134483291187657815L * this.data != -3350398878597138191L * this.value) {
                this.this$0.append(3134483291187657815L * this.data);
                this.value = -6689093519855580729L * this.data;
            }
            this.this$0.append(this.name, 0, -475933495 * this.count, 1054205489);
            this.value += ((long) this.count) * 5890808303976520025L;
            if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                this.position = 5831341056068923797L * this.value;
            }
            long $l0 = -1;
            long $l2 = -1;
            if (this.data * 3134483291187657815L >= this.offset * 3483330859842504979L) {
                if (this.data * 3134483291187657815L < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    $l0 = this.data * 3134483291187657815L;
                    if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > 3483330859842504979L * this.offset) {
                        if ((3134483291187657815L * this.data) + ((long) (this.count * -475933495)) <= (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821))) {
                            $l4 = this.data * 3134483291187657815L;
                            j = $l4;
                            $l2 = ((long) (this.count * -475933495)) + $l4;
                            if ($l0 > -1 && $l2 > $l0) {
                                $i3 = (int) ($l2 - $l0);
                                System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                            }
                            this.data = 472725623425503385L;
                            this.count = 0;
                        }
                    }
                    if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) > this.data * 3134483291187657815L) {
                        if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) <= ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                            $l4 = this.offset * 3483330859842504979L;
                            j = $l4;
                            $l2 = ((long) (1511913821 * this.length)) + $l4;
                        }
                    }
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            if (this.offset * 3483330859842504979L >= this.data * 3134483291187657815L) {
                if (3483330859842504979L * this.offset < ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                    $l0 = this.offset * 3483330859842504979L;
                }
            }
            if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > 3483330859842504979L * this.offset) {
                if ((3134483291187657815L * this.data) + ((long) (this.count * -475933495)) <= (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821))) {
                    $l4 = this.data * 3134483291187657815L;
                    j = $l4;
                    $l2 = ((long) (this.count * -475933495)) + $l4;
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) > this.data * 3134483291187657815L) {
                if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) <= ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                    $l4 = this.offset * 3483330859842504979L;
                    j = $l4;
                    $l2 = ((long) (1511913821 * this.length)) + $l4;
                }
            }
            $i3 = (int) ($l2 - $l0);
            System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
            this.data = 472725623425503385L;
            this.count = 0;
        }
    }

    public void open(long $l0) throws IOException {
        if ($l0 < 0) {
            throw new IOException("");
        }
        this.size = 6567201253033567821L * $l0;
    }

    public void open(byte[] bArr) throws IOException {
        get(bArr, 0, bArr.length, -606087449);
    }

    public void open(byte[] bArr, int $i1, int i) throws IOException {
        if (((long) i) + (-6693291830970498427L * this.size) > this.index * -5327026315961459127L) {
            this.index = -6069604170517924871L * ((-6693291830970498427L * this.size) + ((long) i));
        }
        if (-1 != 3134483291187657815L * this.data && (-6693291830970498427L * this.size < 3134483291187657815L * this.data || -6693291830970498427L * this.size > (this.data * 3134483291187657815L) + ((long) (this.count * -321720003)))) {
            try {
                add(-1822769784);
            } catch (IOException $r4) {
                this.value = 4373627620404348911L;
                throw $r4;
            }
        }
        if (3134483291187657815L * this.data != -1 && (-6693291830970498427L * this.size) + ((long) i) > ((long) this.name.length) + (3134483291187657815L * this.data)) {
            int $i0 = (int) (((long) this.name.length) - ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)));
            System.arraycopy(bArr, $i1, this.name, (int) ((this.size * -6693291830970498427L) - (this.data * 3134483291187657815L)), $i0);
            this.size += ((long) $i0) * 6567201253033567821L;
            $i1 += $i0;
            i -= $i0;
            this.count = this.name.length * -1535272779;
            add(-1967321494);
        }
        if (i > this.name.length) {
            long $l8;
            long j;
            if (this.size * -6693291830970498427L != this.value * -3350398878597138191L) {
                this.this$0.append(this.size * -6693291830970498427L);
                this.value = this.size * 4947570184559919829L;
            }
            this.this$0.append(bArr, $i1, i, 1307486218);
            this.value += ((long) i) * -4373627620404348911L;
            if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                this.position = this.value * 5831341056068923797L;
            }
            long $l3 = -1;
            long $l4 = -1;
            if (this.size * -6693291830970498427L >= 3483330859842504979L * this.offset) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    $l3 = this.size * -6693291830970498427L;
                    if (((long) i) + (-6693291830970498427L * this.size) > this.offset * 3483330859842504979L) {
                        $l8 = (long) i;
                        if ((this.size * -6693291830970498427L) + $l8 <= ((long) (1229293257 * this.length)) + (this.offset * 3483330859842504979L)) {
                            $l4 = (-6693291830970498427L * this.size) + ((long) i);
                            if ($l3 > -1 && $l4 > $l3) {
                                System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                            }
                            this.size += ((long) i) * 6567201253033567821L;
                            return;
                        }
                    }
                    if (((long) (this.length * -1539115192)) + (3483330859842504979L * this.offset) > this.size * -6693291830970498427L) {
                        $l8 = this.offset * 3483330859842504979L;
                        j = $l8;
                        if (((long) (this.length * 138502812)) + $l8 <= ((long) i) + (this.size * -6693291830970498427L)) {
                            $l4 = (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821));
                        }
                    }
                    System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                    this.size += ((long) i) * 6567201253033567821L;
                    return;
                }
            }
            if (this.offset * 3483330859842504979L >= this.size * -6693291830970498427L) {
                if (this.offset * 3483330859842504979L < (-6693291830970498427L * this.size) + ((long) i)) {
                    $l3 = this.offset * 3483330859842504979L;
                }
            }
            if (((long) i) + (-6693291830970498427L * this.size) > this.offset * 3483330859842504979L) {
                $l8 = (long) i;
                if ((this.size * -6693291830970498427L) + $l8 <= ((long) (1229293257 * this.length)) + (this.offset * 3483330859842504979L)) {
                    $l4 = (-6693291830970498427L * this.size) + ((long) i);
                    System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
                    this.size += ((long) i) * 6567201253033567821L;
                    return;
                }
            }
            if (((long) (this.length * -1539115192)) + (3483330859842504979L * this.offset) > this.size * -6693291830970498427L) {
                $l8 = this.offset * 3483330859842504979L;
                j = $l8;
                if (((long) (this.length * 138502812)) + $l8 <= ((long) i) + (this.size * -6693291830970498427L)) {
                    $l4 = (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821));
                }
            }
            System.arraycopy(bArr, (int) ((((long) $i1) + $l3) - (this.size * -6693291830970498427L)), this.buffer, (int) ($l3 - (3483330859842504979L * this.offset)), (int) ($l4 - $l3));
            this.size += ((long) i) * 6567201253033567821L;
            return;
        }
        if (i > 0) {
            if (-1 == this.data * 3134483291187657815L) {
                this.data = 3915208806857371267L * this.size;
            }
            System.arraycopy(bArr, $i1, this.name, (int) ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)), i);
            this.size += 6567201253033567821L * ((long) i);
            int $i12 = this.count * -119942808;
            $i1 = $i12;
            if ((this.size * -6693291830970498427L) - (3134483291187657815L * this.data) > ((long) $i12)) {
                this.count = -163150471 * ((int) ((-6693291830970498427L * this.size) - (3134483291187657815L * this.data)));
            }
        }
    }

    public void parse(byte[] bArr, int $i0, int $i1) throws IOException {
        int $i02;
        if ($i1 + $i0 > bArr.length) {
            $i02 = ($i1 + $i0) - bArr.length;
            $i0 = $i02;
            try {
                throw new ArrayIndexOutOfBoundsException($i02);
            } catch (Throwable $r3) {
                this.value = 4373627620404348911L;
                throw $r3;
            }
        } else if (-1 == this.data * 3134483291187657815L || -6693291830970498427L * this.size < 3134483291187657815L * this.data || ((long) $i1) + (this.size * -6693291830970498427L) > ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
            long j;
            long j2;
            int $i2;
            int $i4;
            byte[] $r4;
            int $i3;
            long $l7;
            long $l5 = -6693291830970498427L * this.size;
            if (-6693291830970498427L * this.size >= this.offset * 3483330859842504979L) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    j = (this.size * -6693291830970498427L) - (3483330859842504979L * this.offset);
                    j2 = j;
                    $i2 = (int) (((long) (this.length * 1511913821)) - j);
                    if ($i2 > $i1) {
                        $i2 = $i1;
                    }
                    j = this.offset * 3483330859842504979L;
                    j2 = j;
                    System.arraycopy(this.buffer, (int) ((this.size * -6693291830970498427L) - j), bArr, $i0, $i2);
                    j = ((long) $i2) * 6567201253033567821L;
                    j2 = j;
                    this.size += j;
                    $i4 = $i0 + $i2;
                    $i2 = $i1 - $i2;
                    $i02 = this.buffer;
                    $r4 = $i02;
                    $i02 = $i02.length;
                    if ($i2 > $i02) {
                        this.this$0.append(-6693291830970498427L * this.size);
                        this.value = this.size * 4947570184559919829L;
                        while ($i2 > 0) {
                            $i3 = this.this$0.get(bArr, $i4, $i2, (byte) 69);
                            if (-1 == $i3) {
                                break;
                            }
                            j = ((long) $i3) * -4373627620404348911L;
                            j2 = j;
                            this.value += j;
                            this.size += 6567201253033567821L * ((long) $i3);
                            $i4 += $i3;
                            $i2 -= $i3;
                        }
                    } else if ($i2 > 0) {
                        toString(724203974);
                        $i02 = this.length * 1511913821;
                        $i3 = $i02;
                        $i3 = $i2 <= $i02 ? 1511913821 * this.length : $i2;
                        System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                        $i4 += $i3;
                        $i2 -= $i3;
                        this.size += 6567201253033567821L * ((long) $i3);
                    }
                    if (-1 != 3134483291187657815L * this.data) {
                        if (this.data * 3134483291187657815L > this.size * -6693291830970498427L && $i2 > 0) {
                            $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                            $i3 = $i02 + $i4;
                            if ($i3 > $i4 + $i2) {
                                $i3 = $i2 + $i4;
                            }
                            while ($i4 < $i3) {
                                bArr[$i4] = (byte) 0;
                                $i2--;
                                this.size += 6567201253033567821L;
                                $i4++;
                            }
                        }
                        j2 = -1;
                        $l7 = -1;
                        if (this.data * 3134483291187657815L >= $l5) {
                            j = (long) $i1;
                            if (3134483291187657815L * this.data < j + $l5) {
                                j2 = this.data * 3134483291187657815L;
                                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                                    j = (long) $i1;
                                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                        if (j2 > -1 && $l7 > j2) {
                                            System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                            if ($l7 > this.size * -6693291830970498427L) {
                                                $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                                this.size = $l7 * 6567201253033567821L;
                                            }
                                        }
                                    }
                                }
                                j = (long) $i1;
                                if (j + $l5 > this.data * 3134483291187657815L) {
                                    j = (long) $i1;
                                    if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                        $l7 = ((long) $i1) + $l5;
                                    }
                                }
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        if ($l5 >= 3134483291187657815L * this.data) {
                            if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -475933495))) {
                                j2 = $l5;
                            }
                        }
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                    if ($i2 > 0) {
                        throw new EOFException();
                    }
                }
            }
            $i2 = $i1;
            $i4 = $i0;
            $i02 = this.buffer;
            $r4 = $i02;
            $i02 = $i02.length;
            if ($i2 > $i02) {
                this.this$0.append(-6693291830970498427L * this.size);
                this.value = this.size * 4947570184559919829L;
                while ($i2 > 0) {
                    $i3 = this.this$0.get(bArr, $i4, $i2, (byte) 69);
                    if (-1 == $i3) {
                        break;
                    }
                    j = ((long) $i3) * -4373627620404348911L;
                    j2 = j;
                    this.value += j;
                    this.size += 6567201253033567821L * ((long) $i3);
                    $i4 += $i3;
                    $i2 -= $i3;
                }
            } else if ($i2 > 0) {
                toString(724203974);
                $i02 = this.length * 1511913821;
                $i3 = $i02;
                if ($i2 <= $i02) {
                }
                System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                $i4 += $i3;
                $i2 -= $i3;
                this.size += 6567201253033567821L * ((long) $i3);
            }
            if (-1 != 3134483291187657815L * this.data) {
                $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                $i3 = $i02 + $i4;
                if ($i3 > $i4 + $i2) {
                    $i3 = $i2 + $i4;
                }
                while ($i4 < $i3) {
                    bArr[$i4] = (byte) 0;
                    $i2--;
                    this.size += 6567201253033567821L;
                    $i4++;
                }
                j2 = -1;
                $l7 = -1;
                if (this.data * 3134483291187657815L >= $l5) {
                    j = (long) $i1;
                    if (3134483291187657815L * this.data < j + $l5) {
                        j2 = this.data * 3134483291187657815L;
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                if ($l5 >= 3134483291187657815L * this.data) {
                    if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -475933495))) {
                        j2 = $l5;
                    }
                }
                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                    j = (long) $i1;
                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                j = (long) $i1;
                if (j + $l5 > this.data * 3134483291187657815L) {
                    j = (long) $i1;
                    if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                        $l7 = ((long) $i1) + $l5;
                    }
                }
                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                if ($l7 > this.size * -6693291830970498427L) {
                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                    this.size = $l7 * 6567201253033567821L;
                }
            }
            if ($i2 > 0) {
                throw new EOFException();
            }
        } else {
            System.arraycopy(this.name, (int) ((-6693291830970498427L * this.size) - (this.data * 3134483291187657815L)), bArr, $i0, $i1);
            this.size += ((long) $i1) * 6567201253033567821L;
        }
    }

    void read() throws IOException {
        if (3134483291187657815L * this.data != -1) {
            long $l4;
            long j;
            int $i3;
            if (3134483291187657815L * this.data != -3350398878597138191L * this.value) {
                this.this$0.append(3134483291187657815L * this.data);
                this.value = -6689093519855580729L * this.data;
            }
            this.this$0.append(this.name, 0, 2045087782 * this.count, 1749696513);
            this.value += ((long) this.count) * 5890808303976520025L;
            if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                this.position = 5831341056068923797L * this.value;
            }
            long $l0 = -1;
            long $l2 = -1;
            if (this.data * 3134483291187657815L >= this.offset * 3483330859842504979L) {
                if (this.data * 3134483291187657815L < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    $l0 = this.data * 3134483291187657815L;
                    if ((this.data * 3134483291187657815L) + ((long) (this.count * 433413907)) > 3483330859842504979L * this.offset) {
                        if ((3134483291187657815L * this.data) + ((long) (this.count * -335621318)) <= (3483330859842504979L * this.offset) + ((long) (this.length * -1313093685))) {
                            $l4 = this.data * 3134483291187657815L;
                            j = $l4;
                            $l2 = ((long) (this.count * -475933495)) + $l4;
                            if ($l0 > -1 && $l2 > $l0) {
                                $i3 = (int) ($l2 - $l0);
                                System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                            }
                            this.data = 472725623425503385L;
                            this.count = 0;
                        }
                    }
                    if ((3483330859842504979L * this.offset) + ((long) (1085327477 * this.length)) > this.data * 3134483291187657815L) {
                        if ((3483330859842504979L * this.offset) + ((long) (1077546797 * this.length)) <= ((long) (-867261601 * this.count)) + (3134483291187657815L * this.data)) {
                            $l4 = this.offset * 3483330859842504979L;
                            j = $l4;
                            $l2 = ((long) (1511913821 * this.length)) + $l4;
                        }
                    }
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            if (this.offset * 3483330859842504979L >= this.data * 3134483291187657815L) {
                if (3483330859842504979L * this.offset < ((long) (1521284251 * this.count)) + (3134483291187657815L * this.data)) {
                    $l0 = this.offset * 3483330859842504979L;
                }
            }
            if ((this.data * 3134483291187657815L) + ((long) (this.count * 433413907)) > 3483330859842504979L * this.offset) {
                if ((3134483291187657815L * this.data) + ((long) (this.count * -335621318)) <= (3483330859842504979L * this.offset) + ((long) (this.length * -1313093685))) {
                    $l4 = this.data * 3134483291187657815L;
                    j = $l4;
                    $l2 = ((long) (this.count * -475933495)) + $l4;
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            if ((3483330859842504979L * this.offset) + ((long) (1085327477 * this.length)) > this.data * 3134483291187657815L) {
                if ((3483330859842504979L * this.offset) + ((long) (1077546797 * this.length)) <= ((long) (-867261601 * this.count)) + (3134483291187657815L * this.data)) {
                    $l4 = this.offset * 3483330859842504979L;
                    j = $l4;
                    $l2 = ((long) (1511913821 * this.length)) + $l4;
                }
            }
            $i3 = (int) ($l2 - $l0);
            System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
            this.data = 472725623425503385L;
            this.count = 0;
        }
    }

    public void read(byte[] bArr, int $i0, int $i1) throws IOException {
        int $i02;
        if ($i1 + $i0 > bArr.length) {
            $i02 = ($i1 + $i0) - bArr.length;
            $i0 = $i02;
            try {
                throw new ArrayIndexOutOfBoundsException($i02);
            } catch (Throwable $r3) {
                this.value = 4373627620404348911L;
                throw $r3;
            }
        } else if (-1 == this.data * 3134483291187657815L || -6693291830970498427L * this.size < 3134483291187657815L * this.data || ((long) $i1) + (this.size * -6693291830970498427L) > ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
            long j;
            long j2;
            int $i2;
            int $i4;
            byte[] $r4;
            int $i3;
            long $l7;
            long $l5 = -6693291830970498427L * this.size;
            if (-6693291830970498427L * this.size >= this.offset * 3483330859842504979L) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    j = (this.size * -6693291830970498427L) - (3483330859842504979L * this.offset);
                    j2 = j;
                    $i2 = (int) (((long) (this.length * 1511913821)) - j);
                    if ($i2 > $i1) {
                        $i2 = $i1;
                    }
                    j = this.offset * 3483330859842504979L;
                    j2 = j;
                    System.arraycopy(this.buffer, (int) ((this.size * -6693291830970498427L) - j), bArr, $i0, $i2);
                    j = ((long) $i2) * 6567201253033567821L;
                    j2 = j;
                    this.size += j;
                    $i4 = $i0 + $i2;
                    $i2 = $i1 - $i2;
                    $i02 = this.buffer;
                    $r4 = $i02;
                    $i02 = $i02.length;
                    if ($i2 > $i02) {
                        this.this$0.append(-6693291830970498427L * this.size);
                        this.value = this.size * 4947570184559919829L;
                        while ($i2 > 0) {
                            $i3 = this.this$0.get(bArr, $i4, $i2, (byte) -9);
                            if (-1 == $i3) {
                                break;
                            }
                            j = ((long) $i3) * -4373627620404348911L;
                            j2 = j;
                            this.value += j;
                            this.size += 6567201253033567821L * ((long) $i3);
                            $i4 += $i3;
                            $i2 -= $i3;
                        }
                    } else if ($i2 > 0) {
                        toString(724203974);
                        $i02 = this.length * 1511913821;
                        $i3 = $i02;
                        $i3 = $i2 <= $i02 ? 1511913821 * this.length : $i2;
                        System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                        $i4 += $i3;
                        $i2 -= $i3;
                        this.size += 6567201253033567821L * ((long) $i3);
                    }
                    if (-1 != 3134483291187657815L * this.data) {
                        if (this.data * 3134483291187657815L > this.size * -6693291830970498427L && $i2 > 0) {
                            $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                            $i3 = $i02 + $i4;
                            if ($i3 > $i4 + $i2) {
                                $i3 = $i2 + $i4;
                            }
                            while ($i4 < $i3) {
                                bArr[$i4] = (byte) 0;
                                $i2--;
                                this.size += 6567201253033567821L;
                                $i4++;
                            }
                        }
                        j2 = -1;
                        $l7 = -1;
                        if (this.data * 3134483291187657815L >= $l5) {
                            j = (long) $i1;
                            if (3134483291187657815L * this.data < j + $l5) {
                                j2 = this.data * 3134483291187657815L;
                                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                                    j = (long) $i1;
                                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                        if (j2 > -1 && $l7 > j2) {
                                            System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                            if ($l7 > this.size * -6693291830970498427L) {
                                                $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                                this.size = $l7 * 6567201253033567821L;
                                            }
                                        }
                                    }
                                }
                                j = (long) $i1;
                                if (j + $l5 > this.data * 3134483291187657815L) {
                                    j = (long) $i1;
                                    if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                        $l7 = ((long) $i1) + $l5;
                                    }
                                }
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        if ($l5 >= 3134483291187657815L * this.data) {
                            if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -475933495))) {
                                j2 = $l5;
                            }
                        }
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                    if ($i2 > 0) {
                        throw new EOFException();
                    }
                }
            }
            $i2 = $i1;
            $i4 = $i0;
            $i02 = this.buffer;
            $r4 = $i02;
            $i02 = $i02.length;
            if ($i2 > $i02) {
                this.this$0.append(-6693291830970498427L * this.size);
                this.value = this.size * 4947570184559919829L;
                while ($i2 > 0) {
                    $i3 = this.this$0.get(bArr, $i4, $i2, (byte) -9);
                    if (-1 == $i3) {
                        break;
                    }
                    j = ((long) $i3) * -4373627620404348911L;
                    j2 = j;
                    this.value += j;
                    this.size += 6567201253033567821L * ((long) $i3);
                    $i4 += $i3;
                    $i2 -= $i3;
                }
            } else if ($i2 > 0) {
                toString(724203974);
                $i02 = this.length * 1511913821;
                $i3 = $i02;
                if ($i2 <= $i02) {
                }
                System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                $i4 += $i3;
                $i2 -= $i3;
                this.size += 6567201253033567821L * ((long) $i3);
            }
            if (-1 != 3134483291187657815L * this.data) {
                $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                $i3 = $i02 + $i4;
                if ($i3 > $i4 + $i2) {
                    $i3 = $i2 + $i4;
                }
                while ($i4 < $i3) {
                    bArr[$i4] = (byte) 0;
                    $i2--;
                    this.size += 6567201253033567821L;
                    $i4++;
                }
                j2 = -1;
                $l7 = -1;
                if (this.data * 3134483291187657815L >= $l5) {
                    j = (long) $i1;
                    if (3134483291187657815L * this.data < j + $l5) {
                        j2 = this.data * 3134483291187657815L;
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                if ($l5 >= 3134483291187657815L * this.data) {
                    if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -475933495))) {
                        j2 = $l5;
                    }
                }
                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                    j = (long) $i1;
                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                j = (long) $i1;
                if (j + $l5 > this.data * 3134483291187657815L) {
                    j = (long) $i1;
                    if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                        $l7 = ((long) $i1) + $l5;
                    }
                }
                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                if ($l7 > this.size * -6693291830970498427L) {
                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                    this.size = $l7 * 6567201253033567821L;
                }
            }
            if ($i2 > 0) {
                throw new EOFException();
            }
        } else {
            System.arraycopy(this.name, (int) ((-6693291830970498427L * this.size) - (this.data * 3134483291187657815L)), bArr, $i0, $i1);
            this.size += ((long) $i1) * 6567201253033567821L;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void read(byte[] r28, int r29, int r30, int r31) throws java.io.IOException {
        /*
        r27 = this;
        r0 = r30;
        r4 = (long) r0;
        r0 = r27;
        r6 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r6 = r8 * r6;
        r4 = r4 + r6;
        r0 = r27;
        r6 = r0.index;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -5327026315961459127; // 0xb61299ca17f59e49 float:1.5872711E-24 double:-3.181785685073693E-48;
        r6 = r6 * r8;
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 <= 0) goto L_0x0037;
    L_0x001d:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r8 * r4;
        r0 = r30;
        r6 = (long) r0;
        r4 = r4 + r6;
        r8 = -6069604170517924871; // 0xabc46f2a410cb3f9 float:8.793939 double:-7.473944624588892E-98;
        r4 = r8 * r4;
        r0 = r27;
        r0.index = r4;	 Catch:{ RuntimeException -> 0x0497 }
    L_0x0037:
        r0 = r27;
        r4 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r4 = r8 * r4;
        r8 = -1;
        r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r10 == 0) goto L_0x0093;
    L_0x0048:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r8 * r4;
        r0 = r27;
        r6 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r6 = r8 * r6;
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 < 0) goto L_0x008b;
    L_0x0062:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r8 * r4;
        r0 = r27;
        r6 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r6 = r6 * r8;
        r0 = r27;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r11 = -475933495; // 0xffffffffe3a1d4c9 float:-5.970517E21 double:NaN;
        r0 = r31;
        r0 = r0 * r11;
        r31 = r0;
        r12 = (long) r0;
        r6 = r6 + r12;
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 <= 0) goto L_0x0093;
    L_0x008b:
        r11 = -2099107562; // 0xffffffff82e22916 float:-3.3231298E-37 double:NaN;
        r0 = r27;
        r0.add(r11);	 Catch:{ IOException -> 0x048c }
    L_0x0093:
        r0 = r27;
        r4 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r4 = r8 * r4;
        r8 = -1;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x014c;
    L_0x00a4:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r8 * r4;
        r0 = r30;
        r6 = (long) r0;
        r4 = r4 + r6;
        r0 = r27;
        r14 = r0.name;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r14.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r6 = (long) r0;
        r0 = r27;
        r12 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r12 = r8 * r12;
        r6 = r6 + r12;
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 <= 0) goto L_0x014c;
    L_0x00cb:
        r0 = r27;
        r14 = r0.name;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r14.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r4 = (long) r0;
        r0 = r27;
        r6 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r6 = r8 * r6;
        r0 = r27;
        r12 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r12 = r8 * r12;
        r6 = r6 - r12;
        r4 = r4 - r6;
        r0 = (int) r4;
        r31 = r0;
        r0 = r27;
        r14 = r0.name;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r4 * r8;
        r0 = r27;
        r6 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r6 = r6 * r8;
        r4 = r4 - r6;
        r15 = (int) r4;
        r0 = r28;
        r1 = r29;
        r2 = r31;
        java.lang.System.arraycopy(r0, r1, r14, r15, r2);	 Catch:{ IOException -> 0x048c }
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r31;
        r6 = (long) r0;
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r6 = r6 * r8;
        r4 = r4 + r6;
        r0 = r27;
        r0.size = r4;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r29;
        r1 = r31;
        r0 = r0 + r1;
        r29 = r0;
        r0 = r30;
        r1 = r31;
        r0 = r0 - r1;
        r30 = r0;
        r0 = r27;
        r14 = r0.name;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r14.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r11 = -163150471; // 0xfffffffff6468579 float:-1.006623E33 double:NaN;
        r0 = r31;
        r0 = r0 * r11;
        r31 = r0;
        r1 = r27;
        r1.count = r0;	 Catch:{ RuntimeException -> 0x0497 }
        r11 = -1837044326; // 0xffffffff9280ed9a float:-8.136509E-28 double:NaN;
        r0 = r27;
        r0.add(r11);	 Catch:{ IOException -> 0x048c }
    L_0x014c:
        r0 = r27;
        r14 = r0.name;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r14.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r0 = r30;
        r1 = r31;
        if (r0 <= r1) goto L_0x03e0;
    L_0x0159:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r4 * r8;
        r0 = r27;
        r6 = r0.value;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -3350398878597138191; // 0xd180fdf89959b8f1 float:-1.1255986E-23 double:-4.126246835211298E84;
        r6 = r6 * r8;
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 == 0) goto L_0x0194;
    L_0x0171:
        r0 = r27;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0497 }
        r16 = r0;
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r4 * r8;
        r0 = r16;
        r0.append(r4);	 Catch:{ IOException -> 0x048c }
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 4947570184559919829; // 0x44a94cde980202d5 float:-1.6803536E-24 double:5.973857709681356E22;
        r4 = r4 * r8;
        r0 = r27;
        r0.value = r4;	 Catch:{ RuntimeException -> 0x0497 }
    L_0x0194:
        r0 = r27;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x0497 }
        r16 = r0;
        r11 = 1049323154; // 0x3e8b6692 float:0.27226692 double:5.18434522E-315;
        r0 = r16;
        r1 = r28;
        r2 = r29;
        r3 = r30;
        r0.append(r1, r2, r3, r11);	 Catch:{ IOException -> 0x048c }
        r0 = r27;
        r4 = r0.value;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r30;
        r6 = (long) r0;
        r8 = -4373627620404348911; // 0xc34dc0da09f63811 float:5.927507E-33 double:-1.6749634054287394E16;
        r6 = r6 * r8;
        r4 = r4 + r6;
        r0 = r27;
        r0.value = r4;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r27;
        r4 = r0.value;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -3350398878597138191; // 0xd180fdf89959b8f1 float:-1.1255986E-23 double:-4.126246835211298E84;
        r4 = r4 * r8;
        r0 = r27;
        r6 = r0.position;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -3198465228173702419; // 0xd39cc4d238448aed float:4.6859426E-5 double:-6.000962273902021E94;
        r6 = r6 * r8;
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 <= 0) goto L_0x01e0;
    L_0x01d2:
        r0 = r27;
        r4 = r0.value;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 5831341056068923797; // 0x50ed15cb7323b195 float:1.296915E31 double:6.897313018510741E81;
        r4 = r4 * r8;
        r0 = r27;
        r0.position = r4;	 Catch:{ RuntimeException -> 0x0497 }
    L_0x01e0:
        r4 = -1;
        r6 = -1;
        r0 = r27;
        r12 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r12 = r12 * r8;
        r0 = r27;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r17 = r8 * r17;
        r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r10 < 0) goto L_0x02fd;
    L_0x01ff:
        r0 = r27;
        r12 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r12 = r8 * r12;
        r0 = r27;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r0 = r27;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r11 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r31 = r11 * r31;
        r0 = r31;
        r0 = (long) r0;
        r19 = r0;
        r0 = r17;
        r2 = r19;
        r0 = r0 + r2;
        r17 = r0;
        r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r10 >= 0) goto L_0x02fd;
    L_0x0235:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r4 * r8;
    L_0x023f:
        r0 = r30;
        r12 = (long) r0;
        r0 = r27;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r17 = r8 * r17;
        r0 = r17;
        r12 = r12 + r0;
        r0 = r27;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r10 <= 0) goto L_0x034f;
    L_0x0266:
        r0 = r27;
        r12 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r12 = r12 * r8;
        r0 = r30;
        r0 = (long) r0;
        r17 = r0;
        r12 = r12 + r0;
        r0 = r27;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r11 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r31 = r11 * r31;
        r0 = r31;
        r0 = (long) r0;
        r17 = r0;
        r0 = r27;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r19 = r0;
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r0 = r17;
        r2 = r19;
        r0 = r0 + r2;
        r17 = r0;
        r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r10 > 0) goto L_0x034f;
    L_0x02a1:
        r0 = r27;
        r6 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r6 = r8 * r6;
        r0 = r30;
        r12 = (long) r0;
        r6 = r6 + r12;
    L_0x02b0:
        r8 = -1;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x02ea;
    L_0x02b6:
        r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r10 <= 0) goto L_0x02ea;
    L_0x02ba:
        r6 = r6 - r4;
        r0 = (int) r6;
        r31 = r0;
        r0 = r29;
        r6 = (long) r0;
        r6 = r6 + r4;
        r0 = r27;
        r12 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r12 = r12 * r8;
        r6 = r6 - r12;
        r0 = (int) r6;
        r29 = r0;
        r0 = r27;
        r14 = r0.buffer;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r27;
        r6 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r6 = r8 * r6;
        r4 = r4 - r6;
        r15 = (int) r4;
        r0 = r28;
        r1 = r29;
        r2 = r31;
        java.lang.System.arraycopy(r0, r1, r14, r15, r2);	 Catch:{ IOException -> 0x048c }
    L_0x02ea:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r30;
        r6 = (long) r0;
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r6 = r6 * r8;
        r4 = r4 + r6;
        r0 = r27;
        r0.size = r4;	 Catch:{ RuntimeException -> 0x0497 }
        return;
    L_0x02fd:
        r0 = r27;
        r12 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r12 = r12 * r8;
        r0 = r27;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r10 < 0) goto L_0x023f;
    L_0x031b:
        r0 = r27;
        r12 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r12 = r12 * r8;
        r0 = r27;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r17 = r8 * r17;
        r0 = r30;
        r0 = (long) r0;
        r19 = r0;
        r0 = r17;
        r2 = r19;
        r0 = r0 + r2;
        r17 = r0;
        r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r10 >= 0) goto L_0x023f;
    L_0x0342:
        r0 = r27;
        r4 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r4 = r4 * r8;
        goto L_0x023f;
    L_0x034f:
        r0 = r27;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r11 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r0 = r31;
        r0 = r0 * r11;
        r31 = r0;
        r12 = (long) r0;
        r0 = r27;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r17 = r8 * r17;
        r0 = r17;
        r12 = r12 + r0;
        r0 = r27;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r10 <= 0) goto L_0x02b0;
    L_0x0382:
        r0 = r27;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r11 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r0 = r31;
        r0 = r0 * r11;
        r31 = r0;
        r12 = (long) r0;
        r0 = r27;
        r0 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r17 = r0;
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r0 = r17;
        r0 = r0 * r8;
        r17 = r0;
        r12 = r12 + r0;
        r0 = r30;
        r0 = (long) r0;
        r17 = r0;
        r0 = r27;
        r0 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r19 = r0;
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r0 = r19;
        r0 = r0 * r8;
        r19 = r0;
        r0 = r17;
        r2 = r19;
        r0 = r0 + r2;
        r17 = r0;
        r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1));
        if (r10 > 0) goto L_0x02b0;
    L_0x03c2:
        r0 = r27;
        r6 = r0.offset;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3483330859842504979; // 0x305746f628118913 float:8.07884E-15 double:8.041030679624852E-76;
        r6 = r8 * r6;
        r0 = r27;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x0497 }
        r31 = r0;
        r11 = 1511913821; // 0x5a1df95d float:1.11164373E16 double:7.469846784E-315;
        r0 = r31;
        r0 = r0 * r11;
        r31 = r0;
        r12 = (long) r0;
        r6 = r6 + r12;
        goto L_0x02b0;
    L_0x03e0:
        if (r30 <= 0) goto L_0x04c0;
    L_0x03e2:
        r0 = r27;
        r4 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r4 = r4 * r8;
        r8 = -1;
        r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r10 != 0) goto L_0x0401;
    L_0x03f2:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3915208806857371267; // 0x36559daa8a36ee83 float:-8.80784E-33 double:5.916075064232656E-47;
        r4 = r8 * r4;
        r0 = r27;
        r0.data = r4;	 Catch:{ RuntimeException -> 0x0497 }
    L_0x0401:
        r0 = r27;
        r14 = r0.name;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r8 * r4;
        r0 = r27;
        r6 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r6 = r8 * r6;
        r4 = r4 - r6;
        r0 = (int) r4;
        r31 = r0;
        r0 = r28;
        r1 = r29;
        r2 = r31;
        r3 = r30;
        java.lang.System.arraycopy(r0, r1, r14, r2, r3);	 Catch:{ IOException -> 0x048c }
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r30;
        r6 = (long) r0;
        r8 = 6567201253033567821; // 0x5b2362bebf90e64d float:-1.1320282 double:1.0750041381024172E131;
        r6 = r8 * r6;
        r4 = r4 + r6;
        r0 = r27;
        r0.size = r4;	 Catch:{ RuntimeException -> 0x0497 }
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r4 * r8;
        r0 = r27;
        r6 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r6 = r8 * r6;
        r4 = r4 - r6;
        r0 = r27;
        r0 = r0.count;	 Catch:{ RuntimeException -> 0x0497 }
        r29 = r0;
        r11 = -475933495; // 0xffffffffe3a1d4c9 float:-5.970517E21 double:NaN;
        r0 = r29;
        r0 = r0 * r11;
        r29 = r0;
        r6 = (long) r0;
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 <= 0) goto L_0x04c0;
    L_0x0466:
        r0 = r27;
        r4 = r0.size;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = -6693291830970498427; // 0xa31ca68ad4fac285 float:-8.6160426E12 double:-1.503678789056562E-139;
        r4 = r8 * r4;
        r0 = r27;
        r6 = r0.data;	 Catch:{ RuntimeException -> 0x0497 }
        r8 = 3134483291187657815; // 0x2b7febf235a33c57 float:1.2162008E-6 double:3.6486060116830442E-99;
        r6 = r8 * r6;
        r4 = r4 - r6;
        r0 = (int) r4;
        r29 = r0;
        r11 = -163150471; // 0xfffffffff6468579 float:-1.006623E33 double:NaN;
        r29 = r11 * r29;
        r0 = r29;
        r1 = r27;
        r1.count = r0;	 Catch:{ RuntimeException -> 0x0497 }
        return;
    L_0x048c:
        r21 = move-exception;
        r8 = 4373627620404348911; // 0x3cb23f25f609c7ef float:-6.986326E32 double:2.5322345595678644E-16;
        r0 = r27;
        r0.value = r8;	 Catch:{ RuntimeException -> 0x0497 }
        throw r21;	 Catch:{ RuntimeException -> 0x0497 }
    L_0x0497:
        r22 = move-exception;
        r23 = new java.lang.StringBuilder;
        r0 = r23;
        r0.<init>();
        r24 = "nn.as(";
        r0 = r23;
        r1 = r24;
        r23 = r0.append(r1);
        r11 = 41;
        r0 = r23;
        r23 = r0.append(r11);
        r0 = r23;
        r25 = r0.toString();
        r0 = r22;
        r1 = r25;
        r26 = p000.StringBuilder.append(r0, r1);
        throw r26;
    L_0x04c0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: MappedChannelRandomAccessSource.read(byte[], int, int, int):void");
    }

    void reset() throws IOException {
        if (3134483291187657815L * this.data != -1) {
            long $l4;
            long j;
            int $i3;
            if (3134483291187657815L * this.data != -3350398878597138191L * this.value) {
                this.this$0.append(3134483291187657815L * this.data);
                this.value = -6689093519855580729L * this.data;
            }
            this.this$0.append(this.name, 0, -475933495 * this.count, 1022510649);
            this.value += ((long) this.count) * 5890808303976520025L;
            if (this.value * -3350398878597138191L > this.position * -3198465228173702419L) {
                this.position = 5831341056068923797L * this.value;
            }
            long $l0 = -1;
            long $l2 = -1;
            if (this.data * 3134483291187657815L >= this.offset * 3483330859842504979L) {
                if (this.data * 3134483291187657815L < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    $l0 = this.data * 3134483291187657815L;
                    if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > 3483330859842504979L * this.offset) {
                        if ((3134483291187657815L * this.data) + ((long) (this.count * -475933495)) <= (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821))) {
                            $l4 = this.data * 3134483291187657815L;
                            j = $l4;
                            $l2 = ((long) (this.count * -475933495)) + $l4;
                            if ($l0 > -1 && $l2 > $l0) {
                                $i3 = (int) ($l2 - $l0);
                                System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                            }
                            this.data = 472725623425503385L;
                            this.count = 0;
                        }
                    }
                    if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) > this.data * 3134483291187657815L) {
                        if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) <= ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                            $l4 = this.offset * 3483330859842504979L;
                            j = $l4;
                            $l2 = ((long) (1511913821 * this.length)) + $l4;
                        }
                    }
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            if (this.offset * 3483330859842504979L >= this.data * 3134483291187657815L) {
                if (3483330859842504979L * this.offset < ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                    $l0 = this.offset * 3483330859842504979L;
                }
            }
            if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > 3483330859842504979L * this.offset) {
                if ((3134483291187657815L * this.data) + ((long) (this.count * -475933495)) <= (3483330859842504979L * this.offset) + ((long) (this.length * 1511913821))) {
                    $l4 = this.data * 3134483291187657815L;
                    j = $l4;
                    $l2 = ((long) (this.count * -475933495)) + $l4;
                    $i3 = (int) ($l2 - $l0);
                    System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
                    this.data = 472725623425503385L;
                    this.count = 0;
                }
            }
            if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) > this.data * 3134483291187657815L) {
                if ((3483330859842504979L * this.offset) + ((long) (1511913821 * this.length)) <= ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
                    $l4 = this.offset * 3483330859842504979L;
                    j = $l4;
                    $l2 = ((long) (1511913821 * this.length)) + $l4;
                }
            }
            $i3 = (int) ($l2 - $l0);
            System.arraycopy(this.name, (int) ($l0 - (this.data * 3134483291187657815L)), this.buffer, (int) ($l0 - (this.offset * 3483330859842504979L)), $i3);
            this.data = 472725623425503385L;
            this.count = 0;
        }
    }

    public void toString(byte b) throws IOException {
        try {
            add(-1805440642);
            this.this$0.add(420907623);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "nn.af(" + ')');
        }
    }

    void toString(int i) throws IOException {
        try {
            this.length = 0;
            if (this.size * -6693291830970498427L != this.value * -3350398878597138191L) {
                this.this$0.append(this.size * -6693291830970498427L);
                this.value = 4947570184559919829L * this.size;
            }
            this.offset = this.size * 3854352939879190791L;
            while (true) {
                if (this.length * 1511913821 < this.buffer.length) {
                    int $i4 = this.this$0.get(this.buffer, this.length * 1511913821, this.buffer.length - (this.length * 1511913821), (byte) -10);
                    if ($i4 != -1) {
                        this.value += -4373627620404348911L * ((long) $i4);
                        this.length = ($i4 * 1373250293) + this.length;
                    } else {
                        return;
                    }
                }
                return;
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nn.ay(" + ')');
        }
    }

    public void toString(byte[] bArr, int $i0, int $i1) throws IOException {
        int $i02;
        if ($i1 + $i0 > bArr.length) {
            $i02 = ($i1 + $i0) - bArr.length;
            $i0 = $i02;
            try {
                throw new ArrayIndexOutOfBoundsException($i02);
            } catch (Throwable $r3) {
                this.value = 4373627620404348911L;
                throw $r3;
            }
        } else if (-1 == this.data * 3134483291187657815L || -6693291830970498427L * this.size < 3134483291187657815L * this.data || ((long) $i1) + (this.size * -6693291830970498427L) > ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data)) {
            long j;
            long j2;
            int $i2;
            int $i4;
            byte[] $r4;
            int $i3;
            long $l7;
            long $l5 = -6693291830970498427L * this.size;
            if (-6693291830970498427L * this.size >= this.offset * 3483330859842504979L) {
                if (-6693291830970498427L * this.size < (this.offset * 3483330859842504979L) + ((long) (1511913821 * this.length))) {
                    j = (this.size * -6693291830970498427L) - (3483330859842504979L * this.offset);
                    j2 = j;
                    $i2 = (int) (((long) (this.length * 1511913821)) - j);
                    if ($i2 > $i1) {
                        $i2 = $i1;
                    }
                    j = this.offset * 3483330859842504979L;
                    j2 = j;
                    System.arraycopy(this.buffer, (int) ((this.size * -6693291830970498427L) - j), bArr, $i0, $i2);
                    j = ((long) $i2) * 6567201253033567821L;
                    j2 = j;
                    this.size += j;
                    $i4 = $i0 + $i2;
                    $i2 = $i1 - $i2;
                    $i02 = this.buffer;
                    $r4 = $i02;
                    $i02 = $i02.length;
                    if ($i2 > $i02) {
                        this.this$0.append(-6693291830970498427L * this.size);
                        this.value = this.size * 4947570184559919829L;
                        while ($i2 > 0) {
                            $i3 = this.this$0.get(bArr, $i4, $i2, (byte) -62);
                            if (-1 == $i3) {
                                break;
                            }
                            j = ((long) $i3) * -4373627620404348911L;
                            j2 = j;
                            this.value += j;
                            this.size += 6567201253033567821L * ((long) $i3);
                            $i4 += $i3;
                            $i2 -= $i3;
                        }
                    } else if ($i2 > 0) {
                        toString(724203974);
                        $i02 = this.length * 1511913821;
                        $i3 = $i02;
                        $i3 = $i2 <= $i02 ? 1511913821 * this.length : $i2;
                        System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                        $i4 += $i3;
                        $i2 -= $i3;
                        this.size += 6567201253033567821L * ((long) $i3);
                    }
                    if (-1 != 3134483291187657815L * this.data) {
                        if (this.data * 3134483291187657815L > this.size * -6693291830970498427L && $i2 > 0) {
                            $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                            $i3 = $i02 + $i4;
                            if ($i3 > $i4 + $i2) {
                                $i3 = $i2 + $i4;
                            }
                            while ($i4 < $i3) {
                                bArr[$i4] = (byte) 0;
                                $i2--;
                                this.size += 6567201253033567821L;
                                $i4++;
                            }
                        }
                        j2 = -1;
                        $l7 = -1;
                        if (this.data * 3134483291187657815L >= $l5) {
                            j = (long) $i1;
                            if (3134483291187657815L * this.data < j + $l5) {
                                j2 = this.data * 3134483291187657815L;
                                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                                    j = (long) $i1;
                                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                        if (j2 > -1 && $l7 > j2) {
                                            System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                            if ($l7 > this.size * -6693291830970498427L) {
                                                $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                                this.size = $l7 * 6567201253033567821L;
                                            }
                                        }
                                    }
                                }
                                j = (long) $i1;
                                if (j + $l5 > this.data * 3134483291187657815L) {
                                    j = (long) $i1;
                                    if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                        $l7 = ((long) $i1) + $l5;
                                    }
                                }
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        if ($l5 >= 3134483291187657815L * this.data) {
                            if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -475933495))) {
                                j2 = $l5;
                            }
                        }
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                    if ($i2 > 0) {
                        throw new EOFException();
                    }
                }
            }
            $i2 = $i1;
            $i4 = $i0;
            $i02 = this.buffer;
            $r4 = $i02;
            $i02 = $i02.length;
            if ($i2 > $i02) {
                this.this$0.append(-6693291830970498427L * this.size);
                this.value = this.size * 4947570184559919829L;
                while ($i2 > 0) {
                    $i3 = this.this$0.get(bArr, $i4, $i2, (byte) -62);
                    if (-1 == $i3) {
                        break;
                    }
                    j = ((long) $i3) * -4373627620404348911L;
                    j2 = j;
                    this.value += j;
                    this.size += 6567201253033567821L * ((long) $i3);
                    $i4 += $i3;
                    $i2 -= $i3;
                }
            } else if ($i2 > 0) {
                toString(724203974);
                $i02 = this.length * 1511913821;
                $i3 = $i02;
                if ($i2 <= $i02) {
                }
                System.arraycopy(this.buffer, 0, bArr, $i4, $i3);
                $i4 += $i3;
                $i2 -= $i3;
                this.size += 6567201253033567821L * ((long) $i3);
            }
            if (-1 != 3134483291187657815L * this.data) {
                $i02 = (int) ((this.data * 3134483291187657815L) - (-6693291830970498427L * this.size));
                $i3 = $i02 + $i4;
                if ($i3 > $i4 + $i2) {
                    $i3 = $i2 + $i4;
                }
                while ($i4 < $i3) {
                    bArr[$i4] = (byte) 0;
                    $i2--;
                    this.size += 6567201253033567821L;
                    $i4++;
                }
                j2 = -1;
                $l7 = -1;
                if (this.data * 3134483291187657815L >= $l5) {
                    j = (long) $i1;
                    if (3134483291187657815L * this.data < j + $l5) {
                        j2 = this.data * 3134483291187657815L;
                        if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                            j = (long) $i1;
                            if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                                $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                                if ($l7 > this.size * -6693291830970498427L) {
                                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                                    this.size = $l7 * 6567201253033567821L;
                                }
                            }
                        }
                        j = (long) $i1;
                        if (j + $l5 > this.data * 3134483291187657815L) {
                            j = (long) $i1;
                            if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                                $l7 = ((long) $i1) + $l5;
                            }
                        }
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                if ($l5 >= 3134483291187657815L * this.data) {
                    if ($l5 < (3134483291187657815L * this.data) + ((long) (this.count * -475933495))) {
                        j2 = $l5;
                    }
                }
                if ((this.data * 3134483291187657815L) + ((long) (this.count * -475933495)) > $l5) {
                    j = (long) $i1;
                    if (((long) (-475933495 * this.count)) + (this.data * 3134483291187657815L) <= j + $l5) {
                        $l7 = ((long) (-475933495 * this.count)) + (3134483291187657815L * this.data);
                        System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                        if ($l7 > this.size * -6693291830970498427L) {
                            $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                            this.size = $l7 * 6567201253033567821L;
                        }
                    }
                }
                j = (long) $i1;
                if (j + $l5 > this.data * 3134483291187657815L) {
                    j = (long) $i1;
                    if (j + $l5 <= ((long) (this.count * -475933495)) + (3134483291187657815L * this.data)) {
                        $l7 = ((long) $i1) + $l5;
                    }
                }
                System.arraycopy(this.name, (int) (j2 - (3134483291187657815L * this.data)), bArr, ((int) (j2 - $l5)) + $i0, (int) ($l7 - j2));
                if ($l7 > this.size * -6693291830970498427L) {
                    $i2 = (int) (((long) $i2) - ($l7 - (this.size * -6693291830970498427L)));
                    this.size = $l7 * 6567201253033567821L;
                }
            }
            if ($i2 > 0) {
                throw new EOFException();
            }
        } else {
            System.arraycopy(this.name, (int) ((-6693291830970498427L * this.size) - (this.data * 3134483291187657815L)), bArr, $i0, $i1);
            this.size += ((long) $i1) * 6567201253033567821L;
        }
    }
}
