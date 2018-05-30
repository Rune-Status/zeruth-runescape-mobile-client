package p000;

/* compiled from: ck */
public class Token extends Object {
    static final int FIRST_BYTECODE_TOKEN = 2;
    static final int LEAVEWITH = 3;
    static final int QUIET_HOURS_DEFAULT_END_MINUTE = 0;
    static final int WEEKS_BUFFER = 1;
    static int[] data;
    int buf;
    int count;
    boolean index = false;
    int name;
    int next;
    int[] f318p;
    int priority;
    int[] size;
    int[] state;
    int[] type;
    int[] value;
    boolean f319y;

    Token(Logger logger) {
        this.next = logger.get(1373687030);
        this.f319y = logger.get((byte) 0) == 1;
        int $i0 = logger.get((byte) 0);
        if ($i0 < 1 || $i0 > 4) {
            throw new RuntimeException();
        }
        int $i1;
        this.size = new int[$i0];
        for ($i1 = 0; $i1 < $i0; $i1++) {
            this.size[$i1] = logger.get(-576165019);
        }
        if ($i0 > 1) {
            this.type = new int[($i0 - 1)];
            for ($i1 = 0; $i1 < $i0 - 1; $i1++) {
                this.type[$i1] = logger.get((byte) 0);
            }
        }
        if ($i0 > 1) {
            this.state = new int[($i0 - 1)];
            for ($i1 = 0; $i1 < $i0 - 1; $i1++) {
                this.state[$i1] = logger.get((byte) 0);
            }
        }
        this.f318p = new int[$i0];
        for (int $i2 = 0; $i2 < $i0; $i2++) {
            this.f318p[$i2] = logger.size(1164443199);
        }
        this.name = logger.get((byte) 0);
        this.priority = logger.get((byte) 0);
        this.value = null;
    }

    boolean m57a(double d, int i, Class classR) {
        for (int $i2 : this.size) {
            if (classR.append($i2, 537618701) == null) {
                return false;
            }
        }
        int $i1 = i * i;
        this.value = new int[$i1];
        int $i22 = 0;
        while ($i22 < this.size.length) {
            int $i3;
            int $i7;
            int $i8;
            Double $r5 = !Short.add(classR, this.size[$i22], (byte) -125) ? null : Character.add(2013931918);
            $r5.add();
            byte[] $r2 = $r5.buffer;
            int[] $r3 = $r5.size;
            int $i4 = this.f318p[$i22];
            if ((141516294 & $i4) == Namespace.MEASURED_STATE_TOO_SMALL) {
            }
            if ((-687186240 & $i4) == NTLMEngineImpl.FLAG_REQUEST_VERSION) {
            }
            if ((-496150034 & $i4) == 717532562) {
                $i3 = 2070815974 & $i4;
                $i4 = ($i4 >> 8) & 255;
                $i7 = 0;
                while (true) {
                    int $i82 = $r3.length;
                    if ($i7 >= $i82) {
                        break;
                    }
                    $i8 = $r3[$i7];
                    if ($i8 != 0 && (65535 & $i8) == (($i8 >> 8) & 2140001770)) {
                        $i8 &= 255;
                        $i82 = ($i8 * $i4) & 712793068;
                        $i8 = $i82;
                        $r3[$i7] = $i82 | (-16777216 | ((($i3 * $i8) >> 8) & -1724130340));
                    }
                    $i7++;
                }
            }
            for ($i3 = 0; $i3 < $r3.length; $i3++) {
                $r3[$i3] = Hashtable.get($r3[$i3], d);
            }
            $i3 = $i22 == 0 ? 0 : this.type[$i22 - 1];
            if ($i3 == 0) {
                if ($r5.length == i) {
                    for ($i4 = 0; $i4 < $i1; $i4++) {
                        this.value[$i4] = $r3[$r2[$i4] & (short) 255];
                    }
                } else if ($r5.length == 83081648 && i == 304935040) {
                    $i4 = 0;
                    for ($i7 = 0; $i7 < i; $i7++) {
                        $i8 = 0;
                        while ($i8 < i) {
                            this.value[$i4] = $r3[$r2[($i8 >> 1) + (($i7 >> 1) << 6)] & 1022503649];
                            $i8++;
                            $i4++;
                        }
                    }
                } else if ($r5.length == Constants.f93X && i == 2115088523) {
                    $i4 = 0;
                    for ($i7 = 0; $i7 < i; $i7++) {
                        $i8 = 0;
                        while ($i8 < i) {
                            this.value[$i4] = $r3[$r2[($i8 << 1) + (($i7 << 1) << 7)] & 900977983];
                            $i8++;
                            $i4++;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if ($i3 == 1) {
            }
            if ($i3 == 2) {
            }
            $i22 = $i3 == 3 ? $i22 + 1 : $i22 + 1;
        }
        return true;
    }

    void add() {
        this.value = null;
    }

    void add(int $i0) {
        int $i1;
        if (this.name == 1 || this.name == 3) {
            int $i2 = this.priority * $i0;
            if (this.name == 1) {
                $i2 = -$i2;
            }
            $i1 = Constants.f93X * $i2;
            this.count = ($i2 + this.count) & 127;
            if (this.index && this.value != null) {
                if (data == null || data.length < this.value.length) {
                    data = new int[this.value.length];
                }
                for ($i2 = 0; $i2 < FileInfo.INITIAL_MAX_FRAME_SIZE; $i2++) {
                    data[$i2] = this.value[($i2 + $i1) & 16383];
                }
                int[] $r1 = this.value;
                this.value = data;
                data = $r1;
                this.index = false;
            }
        }
        if (this.name == 2 || this.name == 4) {
            $i0 = this.priority * $i0;
            if (this.name == 2) {
                $i0 = -$i0;
            }
            this.buf = (this.buf + $i0) & 127;
            if (this.index && this.value != null) {
                if (data == null || data.length < this.value.length) {
                    data = new int[this.value.length];
                }
                for (int $i3 = 0; $i3 < FileInfo.INITIAL_MAX_FRAME_SIZE; $i3 += Constants.f93X) {
                    for ($i1 = 0; $i1 < Constants.f93X; $i1++) {
                        data[$i3 + $i1] = this.value[(($i1 + $i0) & 16383) + $i3];
                    }
                }
                $r1 = this.value;
                this.value = data;
                data = $r1;
                this.index = false;
            }
        }
    }

    boolean add(double d, int i, Class classR) {
        for (int $i2 : this.size) {
            if (classR.append($i2, 537618701) == null) {
                return false;
            }
        }
        int $i1 = i * i;
        this.value = new int[$i1];
        int $i22 = 0;
        while (true) {
            int $i10 = this.size.length;
            if ($i22 >= $i10) {
                return true;
            }
            int $i102;
            int $i4;
            int $i5;
            Double $r5 = !Short.add(classR, this.size[$i22], (byte) -105) ? null : Character.add(2050289598);
            $r5.add();
            byte[] $r2 = $r5.buffer;
            int[] $r3 = $r5.size;
            int $i3 = this.f318p[$i22];
            if ((-16777216 & $i3) == 16777216) {
            }
            if ((1158134907 & $i3) == 33554432) {
            }
            if ((-16777216 & $i3) == 1103480519) {
                $i102 = 16711935 & $i3;
                $i3 = ($i3 >> 8) & 255;
                for ($i4 = 0; $i4 < $r3.length; $i4++) {
                    $i5 = $r3[$i4];
                    if ($i5 != 0 && (65535 & $i5) == (($i5 >> 8) & 2000813718)) {
                        $i5 &= -1347470861;
                        $r3[$i4] = (($i5 * $i3) & -1380228502) | (-16777216 | ((($i102 * $i5) >> 8) & -2101267487));
                    }
                }
            }
            for ($i102 = 0; $i102 < $r3.length; $i102++) {
                $r3[$i102] = Hashtable.get($r3[$i102], d);
            }
            $i102 = $i22 == 0 ? 0 : this.type[$i22 - 1];
            if ($i102 == 0) {
                if ($r5.length == i) {
                    for ($i3 = 0; $i3 < $i1; $i3++) {
                        this.value[$i3] = $r3[$r2[$i3] & (short) 255];
                    }
                } else if ($r5.length == 64 && i == 128) {
                    $i3 = 0;
                    for ($i4 = 0; $i4 < i; $i4++) {
                        $i5 = 0;
                        while ($i5 < i) {
                            this.value[$i3] = $r3[$r2[($i5 >> 1) + (($i4 >> 1) << 6)] & -1177553298];
                            $i5++;
                            $i3++;
                        }
                    }
                } else if ($r5.length == Constants.f93X && i == -1573677018) {
                    $i3 = 0;
                    for ($i4 = 0; $i4 < i; $i4++) {
                        $i5 = 0;
                        while ($i5 < i) {
                            this.value[$i3] = $r3[$r2[($i5 << 1) + (($i4 << 1) << 7)] & -89117710];
                            $i5++;
                            $i3++;
                        }
                    }
                }
            }
            if ($i102 == 1) {
            }
            if ($i102 == 2) {
            }
            $i22 = $i102 == 3 ? $i22 + 1 : $i22 + 1;
        }
        throw new RuntimeException();
    }

    void read(int $i0) {
        int $i1;
        if (this.name == 1 || this.name == 3) {
            $i1 = this.priority * $i0;
            if (this.name == 1) {
                $i1 = -$i1;
            }
            this.count = ($i1 + this.count) & 1725149236;
            if (this.index && this.value != null) {
                if (data == null || data.length < this.value.length) {
                    data = new int[this.value.length];
                }
                int[] $r1 = this.value;
                this.value = data;
                data = $r1;
                this.index = false;
            }
        }
        if (this.name == 2 || this.name == 4) {
            $i0 = this.priority * $i0;
            if (this.name == 2) {
                $i0 = -$i0;
            }
            this.buf = (this.buf + $i0) & 127;
            if (this.index && this.value != null) {
                if (data == null || data.length < this.value.length) {
                    data = new int[this.value.length];
                }
                for ($i1 = 0; $i1 < FileInfo.INITIAL_MAX_FRAME_SIZE; $i1 += Constants.f93X) {
                    for (int $i2 = 0; $i2 < Constants.f93X; $i2++) {
                        data[$i1 + $i2] = this.value[(($i2 + $i0) & 16383) + $i1];
                    }
                }
                $r1 = this.value;
                this.value = data;
                data = $r1;
                this.index = false;
            }
        }
    }

    boolean read(double d, int i, Class classR) {
        for (int $i2 : this.size) {
            if (classR.append($i2, 537618701) == null) {
                return false;
            }
        }
        int $i1 = i * i;
        this.value = new int[$i1];
        int $i22 = 0;
        while (true) {
            int $i11 = this.size.length;
            if ($i22 >= $i11) {
                return true;
            }
            int $i112;
            int $i3;
            int $i4;
            Double $r5 = !Short.add(classR, this.size[$i22], (byte) -118) ? null : Character.add(1959532289);
            $r5.add();
            byte[] $r2 = $r5.buffer;
            int[] $r3 = $r5.size;
            int $i10 = this.f318p[$i22];
            if ((-16777216 & $i10) == 16777216) {
            }
            if ((-16777216 & $i10) == 33554432) {
            }
            if ((-16777216 & $i10) == 50331648) {
                $i112 = 16711935 & $i10;
                $i10 = ($i10 >> 8) & 255;
                for ($i3 = 0; $i3 < $r3.length; $i3++) {
                    $i4 = $r3[$i3];
                    if ($i4 != 0 && (65535 & $i4) == (($i4 >> 8) & 65535)) {
                        $i4 &= 255;
                        $r3[$i3] = (($i4 * $i10) & 65280) | (-16777216 | ((($i112 * $i4) >> 8) & 16711935));
                    }
                }
            }
            for ($i112 = 0; $i112 < $r3.length; $i112++) {
                $r3[$i112] = Hashtable.get($r3[$i112], d);
            }
            $i112 = $i22 == 0 ? 0 : this.type[$i22 - 1];
            if ($i112 == 0) {
                if ($r5.length == i) {
                    for ($i10 = 0; $i10 < $i1; $i10++) {
                        this.value[$i10] = $r3[$r2[$i10] & (short) 255];
                    }
                } else if ($r5.length == 64 && i == 128) {
                    $i10 = 0;
                    for (int $i5 = 0; $i5 < i; $i5++) {
                        $i4 = 0;
                        while ($i4 < i) {
                            this.value[$i10] = $r3[$r2[($i4 >> 1) + (($i5 >> 1) << 6)] & (short) 255];
                            $i4++;
                            $i10++;
                        }
                    }
                } else if ($r5.length == Constants.f93X && i == 64) {
                    $i10 = 0;
                    for ($i3 = 0; $i3 < i; $i3++) {
                        $i4 = 0;
                        while ($i4 < i) {
                            this.value[$i10] = $r3[$r2[($i4 << 1) + (($i3 << 1) << 7)] & (short) 255];
                            $i4++;
                            $i10++;
                        }
                    }
                }
            }
            if ($i112 == 1) {
            }
            if ($i112 == 2) {
            }
            $i22 = $i112 == 3 ? $i22 + 1 : $i22 + 1;
        }
        throw new RuntimeException();
    }

    void readFrom() {
        this.value = null;
    }

    void setValue() {
        this.value = null;
    }

    void write(int $i0) {
        int $i2;
        int $i1;
        if (this.name == 1 || this.name == 3) {
            $i2 = this.priority * $i0;
            if (this.name == 1) {
                $i2 = -$i2;
            }
            $i1 = Constants.f93X * $i2;
            this.count = ($i2 + this.count) & 127;
            if (this.index && this.value != null) {
                if (data == null || data.length < this.value.length) {
                    data = new int[this.value.length];
                }
                for ($i2 = 0; $i2 < FileInfo.INITIAL_MAX_FRAME_SIZE; $i2++) {
                    data[$i2] = this.value[($i2 + $i1) & 16383];
                }
                int[] $r1 = this.value;
                this.value = data;
                data = $r1;
                this.index = false;
            }
        }
        if (this.name == 2 || this.name == 4) {
            $i0 = this.priority * $i0;
            if (this.name == 2) {
                $i0 = -$i0;
            }
            this.buf = (this.buf + $i0) & 127;
            if (this.index && this.value != null) {
                if (data == null || data.length < this.value.length) {
                    data = new int[this.value.length];
                }
                for ($i1 = 0; $i1 < 643057761; $i1 += 1628018609) {
                    for ($i2 = 0; $i2 < 1628018609; $i2++) {
                        data[$i1 + $i2] = this.value[(($i2 + $i0) & 643057760) + $i1];
                    }
                }
                $r1 = this.value;
                this.value = data;
                data = $r1;
                this.index = false;
            }
        }
    }
}
