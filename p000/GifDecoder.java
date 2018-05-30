package p000;

/* compiled from: fm */
public class GifDecoder {
    static final int SDLK_F = 9;
    static final int TRANSACTION_addSpeechFile = 7;
    static Long value;
    Class data;
    Math header;
    Class path;
    Math this$0;

    public GifDecoder(Class classR, Class classR2) {
        try {
            this.this$0 = new Math(256);
            this.header = new Math(256);
            this.data = classR;
            this.path = classR2;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "fm.<init>(" + ')');
        }
    }

    User getData(int i, int i2, int[] iArr) {
        long $l4 = (long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16));
        User $r4 = (User) this.header.get($l4);
        if ($r4 != null) {
            return $r4;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        Template $r6 = Template.get(this.data, i, i2);
        if ($r6 == null) {
            return null;
        }
        $r4 = $r6.get();
        this.header.get($r4, $l4);
        if (iArr != null) {
            iArr[0] = iArr[0] - $r4.data.length;
        }
        return $r4;
    }

    User parse(int i, int i2, int[] iArr) {
        long $l4 = (long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16));
        User $r4 = (User) this.header.get($l4);
        if ($r4 != null) {
            return $r4;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        Template $r6 = Template.get(this.data, i, i2);
        if ($r6 == null) {
            return null;
        }
        $r4 = $r6.get();
        this.header.get($r4, $l4);
        if (iArr != null) {
            iArr[0] = iArr[0] - $r4.data.length;
        }
        return $r4;
    }

    User read(int $i0, int $i1, int[] iArr) {
        long $l4 = (long) ((((($i0 << 4) & 2141570497) | ($i0 >>> 12)) ^ $i1) | ($i0 << 16));
        User $r4 = (User) this.header.get($l4);
        if ($r4 != null) {
            return $r4;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        Template $r7 = Template.get(this.data, $i0, $i1);
        if ($r7 == null) {
            return null;
        }
        $r4 = $r7.get();
        this.header.get($r4, $l4);
        if (iArr == null) {
            return $r4;
        }
        iArr[0] = iArr[0] - $r4.data.length;
        return $r4;
    }

    User read(int i, int $i1, int[] iArr, int i2) {
        int $i2 = ((i << 4) & 65535) | (i >>> 12);
        i2 = $i2;
        $i2 = ($i2 ^ $i1) | (i << 16);
        i2 = $i2;
        long $l4 = (long) $i2;
        try {
            User $r4 = (User) this.header.get($l4);
            if ($r4 != null) {
                return $r4;
            }
            if (iArr != null) {
                if (iArr[0] <= 0) {
                    return null;
                }
            }
            Class classR = this.data;
            Class $r10 = classR;
            Template $r11 = Template.get(classR, i, $i1);
            if ($r11 == null) {
                return null;
            }
            $r4 = $r11.get();
            this.header.get($r4, $l4);
            if (iArr == null) {
                return $r4;
            }
            iArr[0] = iArr[0] - $r4.data.length;
            return $r4;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "fm.af(" + ')');
        }
    }

    public User read(int i, int[] iArr) {
        if (this.data.get(1336872930) == 1) {
            return read(0, i, iArr, 2139214015);
        }
        if (this.data.add(i, -411458426) == 1) {
            return read(i, 0, iArr, 1580999162);
        }
        throw new RuntimeException();
    }

    public User read(int i, int[] iArr, byte b) {
        try {
            if (this.data.get(1772531020) == 1) {
                return read(0, i, iArr, 1663371717);
            }
            if (this.data.add(i, -1652247814) == 1) {
                return read(i, 0, iArr, 390465965);
            }
            throw new RuntimeException();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "fm.an(" + ')');
        }
    }

    public User read(int i, int[] iArr, int i2) {
        try {
            if (this.path.get(1417768690) == 1) {
                return update(0, i, iArr, -537795290);
            }
            if (this.path.add(i, 1083342061) == 1) {
                return update(i, 0, iArr, -537795290);
            }
            throw new RuntimeException();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "fm.aa(" + ')');
        }
    }

    User update(int i, int i2, int[] iArr) {
        long $l4 = 4294967296L ^ ((long) (((((i << 4) & 65535) | (i >>> 12)) ^ i2) | (i << 16)));
        User $r4 = (User) this.header.get($l4);
        if ($r4 != null) {
            return $r4;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        VMPCMac $r5 = (VMPCMac) this.this$0.get($l4);
        if ($r5 == null) {
            Object $r7 = VMPCMac.update(this.path, i, i2);
            $r5 = $r7;
            if ($r7 == null) {
                return null;
            }
            this.this$0.get($r7, $l4);
        }
        $r4 = $r5.update(iArr);
        if ($r4 == null) {
            return null;
        }
        $r5.iterator();
        this.header.get($r4, $l4);
        return $r4;
    }

    User update(int i, int i2, int[] iArr, int i3) {
        int $i2 = ((i << 4) & 65535) | (i >>> 12);
        i3 = $i2;
        $i2 = ($i2 ^ i2) | (i << 16);
        i3 = $i2;
        long $l4 = 4294967296L ^ ((long) $i2);
        try {
            User $r4 = (User) this.header.get($l4);
            if ($r4 != null) {
                return $r4;
            }
            if (iArr != null) {
                if (iArr[0] <= 0) {
                    return null;
                }
            }
            VMPCMac $r9 = (VMPCMac) this.this$0.get($l4);
            if ($r9 == null) {
                Class classR = this.path;
                Class $r10 = classR;
                $r9 = VMPCMac.update(classR, i, i2);
                if ($r9 == null) {
                    return null;
                }
                this.this$0.get($r9, $l4);
            }
            $r4 = $r9.update(iArr);
            if ($r4 == null) {
                return null;
            }
            $r9.iterator();
            this.header.get($r4, $l4);
            return $r4;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "fm.ad(" + ')');
        }
    }
}
