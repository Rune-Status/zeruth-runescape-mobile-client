package p000;

/* compiled from: be */
public final class Shape {
    static int data;
    int active;
    int count;
    int index;
    int list;
    boolean lock;
    int name;
    int title;

    Shape(int $i0, int i, int i2, int i3, int i4, int i5, boolean z) {
        try {
            this.lock = true;
            this.title = -1613730901 * $i0;
            this.count = 5710261 * i;
            this.index = -1447981585 * i2;
            this.list = -601296403 * i3;
            this.name = -942060103 * i4;
            this.active = -162728129 * i5;
            this.lock = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "be.<init>(" + ')');
        }
    }

    static final void init(int i, int i2) {
        Contact.size += 1146258560 * i;
        if (Contact.size * -343770823 > Contact.value.length) {
            Contact.size -= 176727305 * Contact.value.length;
            System.read(CompassView.data[(int) (Math.random() * 12.0d)], 488305351);
        }
        i2 = i * Constants.f93X;
        int $i2 = (256 - i) * Constants.f93X;
        int $i3 = 0;
        int $i4 = 0;
        while ($i4 < $i2) {
            int $i6 = Contact.key[$i3 + i2] - ((Contact.value[((Contact.size * -343770823) + $i3) & (Contact.value.length - 1)] * i) / 6);
            if ($i6 < 0) {
                $i6 = 0;
            }
            try {
                Contact.key[$i3] = $i6;
                $i4++;
                $i3++;
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "be.ai(" + ')');
            }
        }
        for (i2 = 256 - i; i2 < 256; i2++) {
            $i2 = i2 * Constants.f93X;
            $i3 = 0;
            while ($i3 < Constants.f93X) {
                if (((int) (Math.random() * 100.0d)) >= 50 || $i3 <= 10 || $i3 >= 118) {
                    Contact.key[$i2 + $i3] = 0;
                } else {
                    Contact.key[$i2 + $i3] = 255;
                }
                $i3++;
            }
        }
        if (-521591013 * Contact.position > 0) {
            Contact.position -= -227840948 * i;
        }
        if (-868909347 * Contact.flags > 0) {
            Contact.flags -= -142531116 * i;
        }
        if (-521591013 * Contact.position == 0 && -868909347 * Contact.flags == 0) {
            double d = (double) (2000 / i);
            double $d1 = d;
            i2 = (int) (Math.random() * d);
            if (i2 == 0) {
                Contact.position = 1802259456;
            }
            if (1 == i2) {
                Contact.flags = -2128227328;
            }
        }
        for (i2 = 0; i2 < 256 - i; i2++) {
            Contact.next[i2] = Contact.next[i2 + i];
        }
        for (i2 = 256 - i; i2 < 256; i2++) {
            d = ((double) (-181680073 * Contact.index)) / 15.0d;
            $d1 = d;
            d = Math.sin(d) * 14.0d;
            $d1 = d;
            double $d0 = (Math.sin(((double) (-181680073 * Contact.index)) / 14.0d) * 16.0d) + d;
            d = ((double) (Contact.index * -181680073)) / 16.0d;
            $d1 = d;
            d = Math.sin(d) * 12.0d;
            $d1 = d;
            Contact.next[i2] = (int) ($d0 + d);
            Contact.index -= 1297715833;
        }
        Contact.type += -1866808155 * i;
        i = (((1581849891 * client.type) & 1) + i) / 2;
        if (i > 0) {
            for (i2 = 0; i2 < Contact.type * 529481108; i2++) {
                Contact.key[(((int) (Math.random() * 124.0d)) + 2) + ((((int) (Math.random() * 128.0d)) + Constants.f93X) << 7)] = 192;
            }
            Contact.type = 0;
            for (i2 = 0; i2 < 256; i2++) {
                $i2 = i2 * Constants.f93X;
                $i3 = 0;
                for ($i4 = -i; $i4 < Constants.f93X; $i4++) {
                    if ($i4 + i < Constants.f93X) {
                        $i3 += Contact.key[($i4 + $i2) + i];
                    }
                    if ($i4 - (i + 1) >= 0) {
                        $i3 -= Contact.key[($i4 + $i2) - (i + 1)];
                    }
                    if ($i4 >= 0) {
                        AESCipher.state[$i2 + $i4] = $i3 / ((i * 2) + 1);
                    }
                }
            }
            for (i2 = 0; i2 < 128; i2++) {
                $i2 = 0;
                for ($i3 = -i; $i3 < 256; $i3++) {
                    $i4 = $i3 * Constants.f93X;
                    if ($i3 + i < 256) {
                        $i2 += AESCipher.state[(i2 + $i4) + (i * Constants.f93X)];
                    }
                    if ($i3 - (i + 1) >= 0) {
                        $i2 -= AESCipher.state[(i2 + $i4) - ((i + 1) * Constants.f93X)];
                    }
                    if ($i3 >= 0) {
                        Contact.key[$i4 + i2] = $i2 / ((i * 2) + 1);
                    }
                }
            }
        }
    }

    static int next(int i, int $i2, int i2) {
        try {
            JsonReader $r0 = Logger.read(i, 2128791917);
            if ($r0 == null) {
                return $i2;
            }
            if ($r0.count * -308151409 >= 0) {
                return ($r0.count * -308151409) | -16777216;
            }
            if ($r0.length * -945425647 >= 0) {
                return Point.count[Document.encode(Point.type.toString($r0.length * -945425647, 1577195485), 96, 1641792905)] | -16777216;
            } else if (-345116671 * $r0.cursor == 16711935) {
                return $i2;
            } else {
                i2 = -828438867 * $r0.size;
                $i2 = $r0.type * 789156385;
                i = $r0.value * -1794633891;
                if (i > 179) {
                    $i2 /= 2;
                }
                if (i > 192) {
                    $i2 /= 2;
                }
                if (i > 217) {
                    $i2 /= 2;
                }
                if (i > 243) {
                    $i2 /= 2;
                }
                return Point.count[Document.encode(((($i2 / 32) << 7) + ((i2 / 4) << 10)) + (i / 2), 96, 1641792905)] | -16777216;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "be.af(" + ')');
        }
    }

    static boolean update(int i) {
        return ((1424263497 * client.message) & 2) != 0;
    }
}
