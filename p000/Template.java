package p000;

/* compiled from: fu */
public class Template {
    static final int lines = 22050;
    int count;
    int length;
    XmlReader[] value = new XmlReader[10];

    Template(Logger logger) {
        for (int $i0 = 0; $i0 < 10; $i0++) {
            if (logger.get((byte) 0) != 0) {
                logger.data -= 2065011939;
                this.value[$i0] = new XmlReader();
                this.value[$i0].add(logger);
            }
        }
        this.length = logger.get(-1656633433);
        this.count = logger.get(1000724896);
    }

    public static Template get(Class classR, int i, int i2) {
        byte[] $r2 = classR.get(i, i2, -1182109538);
        return $r2 == null ? null : new Template(new Logger($r2));
    }

    public static Template read(Class classR, int i, int i2) {
        byte[] $r2 = classR.get(i, i2, 584001346);
        return $r2 == null ? null : new Template(new Logger($r2));
    }

    public final int append() {
        int $i1 = 0;
        int $i2 = 9999999;
        while ($i1 < 10) {
            if (this.value[$i1] != null && this.value[$i1].value / 20 < $i2) {
                $i2 = this.value[$i1].value / 20;
            }
            $i1++;
        }
        if (this.length < this.count && this.length / 20 < $i2) {
            $i2 = this.length / 20;
        }
        if ($i2 == 9999999 || $i2 == 0) {
            return 0;
        }
        for (int $i0 = 0; $i0 < 10; $i0++) {
            if (this.value[$i0] != null) {
                XmlReader $r2 = this.value[$i0];
                $r2.value -= $i2 * 20;
            }
        }
        if (this.length < this.count) {
            this.length -= $i2 * 20;
            this.count -= $i2 * 20;
        }
        return $i2;
    }

    public User get() {
        return new User(lines, read(), (this.length * lines) / 1000, (this.count * lines) / 1000);
    }

    public User getValue() {
        return new User(lines, read(), (this.length * lines) / 1000, (this.count * lines) / 1000);
    }

    final byte[] init() {
        int $i2 = 0;
        int $i0 = 0;
        while ($i2 < 10) {
            if (this.value[$i2] != null && this.value[$i2].min + this.value[$i2].value > $i0) {
                $i0 = this.value[$i2].min + this.value[$i2].value;
            }
            $i2++;
        }
        if ($i0 == 0) {
            return new byte[0];
        }
        byte[] $r4 = new byte[(($i0 * lines) / 1000)];
        for ($i2 = 0; $i2 < 10; $i2++) {
            if (this.value[$i2] != null) {
                $i0 = (this.value[$i2].min * lines) / 1000;
                int $i1 = (this.value[$i2].value * lines) / 1000;
                int[] $r1 = this.value[$i2].get($i0, this.value[$i2].min);
                for (int $i3 = 0; $i3 < $i0; $i3++) {
                    int $i4 = $r4[$i3 + $i1] + ($r1[$i3] >> 8);
                    if ((($i4 + Constants.f93X) & -256) != 0) {
                        $i4 = ($i4 >> 31) ^ 127;
                    }
                    $r4[$i3 + $i1] = (byte) $i4;
                }
            }
        }
        return $r4;
    }

    public User length() {
        return new User(-2033373233, read(), (-1056533731 * this.length) / 1187481841, (this.count * lines) / 1000);
    }

    public final int parse() {
        int $i2 = -251603727;
        int $i0 = 0;
        while ($i0 < 10) {
            if (this.value[$i0] != null && this.value[$i0].value / 20 < $i2) {
                $i2 = this.value[$i0].value / 20;
            }
            $i0++;
        }
        if (this.length < this.count && this.length / 20 < $i2) {
            $i2 = this.length / 20;
        }
        if ($i2 == 9999999 || $i2 == 0) {
            return 0;
        }
        for (int $i1 = 0; $i1 < 10; $i1++) {
            if (this.value[$i1] != null) {
                XmlReader $r2 = this.value[$i1];
                $r2.value -= $i2 * 20;
            }
        }
        if (this.length < this.count) {
            this.length -= $i2 * 20;
            this.count -= $i2 * 20;
        }
        return $i2;
    }

    public final int process() {
        int $i1 = 0;
        int $i2 = 9999999;
        while ($i1 < 10) {
            if (this.value[$i1] != null && this.value[$i1].value / 20 < $i2) {
                $i2 = this.value[$i1].value / 20;
            }
            $i1++;
        }
        if (this.length < this.count && this.length / 20 < $i2) {
            $i2 = this.length / 20;
        }
        if ($i2 == 9999999 || $i2 == 0) {
            return 0;
        }
        for (int $i0 = 0; $i0 < 10; $i0++) {
            if (this.value[$i0] != null) {
                XmlReader $r2 = this.value[$i0];
                $r2.value -= $i2 * 20;
            }
        }
        if (this.length < this.count) {
            this.length -= $i2 * 20;
            this.count -= $i2 * 20;
        }
        return $i2;
    }

    final byte[] read() {
        int $i2 = 0;
        int $i0 = 0;
        while ($i2 < 10) {
            if (this.value[$i2] != null && this.value[$i2].min + this.value[$i2].value > $i0) {
                $i0 = this.value[$i2].min + this.value[$i2].value;
            }
            $i2++;
        }
        if ($i0 == 0) {
            return new byte[0];
        }
        byte[] $r4 = new byte[(($i0 * lines) / 1000)];
        for ($i2 = 0; $i2 < 10; $i2++) {
            if (this.value[$i2] != null) {
                $i0 = (this.value[$i2].min * lines) / 1000;
                int $i1 = (this.value[$i2].value * lines) / 1000;
                int[] $r1 = this.value[$i2].get($i0, this.value[$i2].min);
                for (int $i3 = 0; $i3 < $i0; $i3++) {
                    int $i4 = $r4[$i3 + $i1] + ($r1[$i3] >> 8);
                    if ((($i4 + Constants.f93X) & -256) != 0) {
                        $i4 = ($i4 >> 31) ^ 127;
                    }
                    $r4[$i3 + $i1] = (byte) $i4;
                }
            }
        }
        return $r4;
    }

    final byte[] transform() {
        int $i2 = 0;
        int $i0 = 0;
        while ($i2 < 10) {
            if (this.value[$i2] != null && this.value[$i2].min + this.value[$i2].value > $i0) {
                $i0 = this.value[$i2].min + this.value[$i2].value;
            }
            $i2++;
        }
        if ($i0 == 0) {
            return new byte[0];
        }
        byte[] $r4 = new byte[(($i0 * 362835679) / 290154379)];
        for ($i2 = 0; $i2 < 10; $i2++) {
            if (this.value[$i2] != null) {
                $i0 = (this.value[$i2].min * -152436760) / -1329454760;
                int $i1 = (this.value[$i2].value * lines) / 1000;
                int[] $r1 = this.value[$i2].get($i0, this.value[$i2].min);
                for (int $i3 = 0; $i3 < $i0; $i3++) {
                    int $i4 = $r4[$i3 + $i1] + ($r1[$i3] >> 8);
                    if (((1025328298 + $i4) & -854265840) != 0) {
                        $i4 = ($i4 >> 31) ^ 127;
                    }
                    $r4[$i3 + $i1] = (byte) $i4;
                }
            }
        }
        return $r4;
    }

    final byte[] write() {
        int $i2 = 0;
        int $i0 = 0;
        while ($i2 < 10) {
            if (this.value[$i2] != null && this.value[$i2].min + this.value[$i2].value > $i0) {
                $i0 = this.value[$i2].min + this.value[$i2].value;
            }
            $i2++;
        }
        if ($i0 == 0) {
            return new byte[0];
        }
        byte[] $r5 = new byte[(($i0 * lines) / 1000)];
        for ($i2 = 0; $i2 < 10; $i2++) {
            if (this.value[$i2] != null) {
                $i0 = (this.value[$i2].min * lines) / 1000;
                int $i1 = (this.value[$i2].value * lines) / 1000;
                int[] $r1 = this.value[$i2].get($i0, this.value[$i2].min);
                for (int $i3 = 0; $i3 < $i0; $i3++) {
                    int $i4 = $r5[$i3 + $i1] + ($r1[$i3] >> 8);
                    if ((($i4 + Constants.f93X) & -256) != 0) {
                        $i4 = ($i4 >> 31) ^ 127;
                    }
                    $r5[$i3 + $i1] = (byte) $i4;
                }
            }
        }
        return $r5;
    }
}
