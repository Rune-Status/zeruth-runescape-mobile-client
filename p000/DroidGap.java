package p000;

/* compiled from: gv */
public class DroidGap implements Preference {
    DroidGap() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gv.<init>(" + ')');
        }
    }

    static final void parse(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, Log log, Context[] contextArr, short s) {
        Logger $r3 = new Logger(bArr);
        int $i9 = -1;
        while (true) {
            int $i8 = $r3.generate(-1819149345);
            if ($i8 != 0) {
                $i9 += $i8;
                $i8 = 0;
                while (true) {
                    int $i10 = $r3.add((byte) 87);
                    if ($i10 == 0) {
                        break;
                    }
                    $i8 += $i10 - 1;
                    int $i12 = $i8 & 63;
                    int $i13 = ($i8 >> 6) & 63;
                    int $i11 = $i8 >> 12;
                    int $i14 = $r3.get((byte) 0);
                    $i10 = $i14 >> 2;
                    $i14 &= 3;
                    if ($i11 == i4 && $i13 >= i5 && $i13 < i5 + 8 && $i12 >= i6 && $i12 < i6 + 8) {
                        try {
                            Transaction $r4 = BigInteger.get($i9, 1158441283);
                            $i11 = i2 + Contact.log($i13 & 7, $i12 & 7, i7, $r4.this$0 * -265754695, -344743753 * $r4.offset, $i14, -218565506);
                            $i12 = i3 + Label.log($i13 & 7, $i12 & 7, i7, -265754695 * $r4.this$0, -344743753 * $r4.offset, $i14, 795795941);
                            if ($i11 > 0 && $i12 > 0 && $i11 < 103 && $i12 < 103) {
                                $i13 = (Chart.size[1][$i11][$i12] & (byte) 2) == (byte) 2 ? i - 1 : i;
                                Context $r7 = null;
                                if ($i13 >= 0) {
                                    $r7 = contextArr[$i13];
                                }
                                Dictionary.add(i, $i11, $i12, $i9, ($i14 + i7) & 3, $i10, log, $r7, 1112033984);
                            }
                        } catch (Throwable $r8) {
                            throw StringBuilder.append($r8, "gv.ay(" + ')');
                        }
                    }
                }
            }
            return;
        }
    }

    public boolean add(char c, long j) {
        return true;
    }

    public boolean add(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean add(int i, long j) {
        return true;
    }

    public boolean close(int i, long j) {
        return true;
    }

    public boolean init(char c, long j) {
        return true;
    }

    public boolean init(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean init(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean init(int i, int i2, long j) {
        return true;
    }

    public boolean init(int i, long j) {
        return true;
    }

    public boolean onClick(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean onClick(int i, long j) {
        return true;
    }

    public boolean onCreate(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean onCreate(int i, int i2, long j) {
        return true;
    }

    public boolean onCreate(int i, long j) {
        return true;
    }

    public boolean onOptionsItemSelected(char c, long j) {
        return true;
    }

    public boolean onOptionsItemSelected(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean onOptionsItemSelected(int i, long j) {
        return true;
    }

    public boolean onResume(char c, long j) {
        return true;
    }

    public boolean onResume(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean onResume(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean onResume(int i, long j) {
        return true;
    }

    public boolean process(int i, long j) {
        return true;
    }

    public boolean render(int i, long j) {
        return true;
    }

    public boolean reset(int i, long j) {
        return true;
    }

    public boolean send(int i, long j) {
        return true;
    }

    public boolean toString(char c, long j) {
        return true;
    }

    public boolean toString(int i, long j) {
        return true;
    }

    public boolean update(char c, long j) {
        return true;
    }

    public boolean update(int i, long j) {
        return true;
    }
}
