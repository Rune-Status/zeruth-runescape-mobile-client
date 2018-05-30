package p000;

import java.util.Comparator;

/* compiled from: lm */
public class Geometry implements Comparator {
    static final int APPLICATION_EFFECTIVE_DATE = 37;
    public static final int ATTENDEES_INDEX_RELATIONSHIP = 3;
    public static final int TAG_DEST_LATITUDE_REF = 19;
    static final int TRANSACTION_getInfo = 5;
    public static final int UNKNOWN_INT = 10000;
    final boolean val$val;

    public Geometry(boolean z) {
        try {
            this.val$val = z;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "lm.<init>(" + ')');
        }
    }

    static final byte[] add(byte[] bArr, byte b) {
        try {
            Logger $r1 = new Logger(bArr);
            int $i1 = $r1.get((byte) 0);
            int $i2 = $r1.size(-532895429);
            if ($i2 < 0 || (Class.f45b * 1621223447 != 0 && $i2 > Class.f45b * 1621223447)) {
                throw new RuntimeException();
            } else if ($i1 == 0) {
                bArr = new byte[$i2];
                $r1.add(bArr, 0, $i2, 248078995);
                return bArr;
            } else {
                int $i3 = $r1.size(365135331);
                if ($i3 < 0 || (Class.f45b * 1621223447 != 0 && $i3 > Class.f45b * 1621223447)) {
                    throw new RuntimeException();
                }
                byte[] $r6 = new byte[$i3];
                if (1 == $i1) {
                    TFloatLinkedList.add($r6, $i3, bArr, $i2, 9);
                    return $r6;
                }
                Class.f46g.write($r1, $r6, 91258545);
                return $r6;
            }
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lm.bc(" + ')');
        }
    }

    static void toString(int[] iArr, int[] iArr2, int i, int i2, int $i11, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        i = -i6;
        i10 = i3;
        i6 = i2;
        while (i < 0) {
            i3 = ($i11 >> 16) * i9;
            int $i12 = -i5;
            while ($i12 < 0) {
                int $i13;
                int $i10 = iArr2[(i6 >> 16) + i3];
                if ($i10 != 0) {
                    $i13 = i10 + 1;
                    try {
                        iArr[i10] = $i10;
                    } catch (RuntimeException $r2) {
                        throw StringBuilder.append($r2, "lm.au(" + ')');
                    }
                }
                $i13 = i10 + 1;
                $i12++;
                i6 += i7;
                i10 = $i13;
            }
            $i11 += i8;
            i10 += i4;
            i++;
            i6 = i2;
        }
    }

    public int add(Object obj, Object obj2) {
        return compare((State) obj, (State) obj2, -545208989);
    }

    public boolean apply(Object obj) {
        return super.equals(obj);
    }

    int compare(State state, State state2) {
        return this.val$val ? state.getKey(2011959025).compare(state2.getKey(1879233576), 2122311966) : state2.getKey(1824641987).compare(state.getKey(1994725119), 1278748557);
    }

    int compare(State state, State state2, int i) {
        try {
            return this.val$val ? state.getKey(2008180065).compare(state2.getKey(2027580993), 2080932165) : state2.getKey(2042091061).compare(state.getKey(2110363659), 1311059541);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "lm.af(" + ')');
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return compare((State) obj, (State) obj2, 1510435830);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "lm.compare(" + ')');
        }
    }

    public int compareTo(Object obj, Object obj2) {
        return compare((State) obj, (State) obj2, -251710965);
    }

    public int compute(Object obj, Object obj2) {
        return compare((State) obj, (State) obj2, -278246749);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "lm.equals(" + ')');
        }
    }

    public boolean isEmpty(Object obj) {
        return super.equals(obj);
    }
}
