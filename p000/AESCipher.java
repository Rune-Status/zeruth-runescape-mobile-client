package p000;

/* compiled from: dc */
public class AESCipher {
    public static final int ALIGNMENT = 16;
    public static final int FORMAT_ISO_8859_7 = 8;
    public static final int HINT_CONTEXT_CAR_HOME = 2;
    public static final int INFO_LEN_EXTENDED = 64;
    static int[] state = null;
    static final int voice_input = 19136995;

    AESCipher() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dc.<init>(" + ')');
        }
    }

    static void get(int i) {
        if (State.this$0 != null) {
            try {
                State.this$0.get(Msg.size * -1674539149, ((File.this$0.size * 516759209) >> 7) + (Build$VERSION.type * 1407993063), (Level.type * 1289967967) + ((File.this$0.value * 2328865) >> 7), false, 976087032);
                State.this$0.append(1715668880);
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "dc.cy(" + ')');
            }
        }
    }

    static TDoubleArrayList getData(int i, int i2) {
        try {
            return (TDoubleArrayList) DrawingGroup.data.get((long) i);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "dc.an(" + ')');
        }
    }

    public static void set(Class classR, Class classR2, Class classR3, Class classR4, int i) {
        Dictionary.buffer = classR;
        Feed.type = classR2;
        HyperlinkRecord.type = classR3;
        TokenStream.type = classR4;
        try {
            Float.size = new System[Dictionary.buffer.get(1761238379)][];
            ByteString.count = new boolean[Dictionary.buffer.get(1813553933)];
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "dc.af(" + ')');
        }
    }

    public static final boolean update(char c, int i) {
        return ' ' == c || ' ' == c || '_' == c || '-' == c;
    }

    static final void write(BigInteger bigInteger, int i) {
        i = 0;
        long $l1 = 0;
        try {
            int $i3;
            int $i2;
            if (bigInteger.count * -1833730097 == 0) {
                $l1 = OrgFile.this$0.append(bigInteger.data * -1783248061, bigInteger.value * -1294114749, bigInteger.length * -401817923);
            }
            if (1 == bigInteger.count * -1833730097) {
                $l1 = OrgFile.this$0.getType(bigInteger.data * -1783248061, bigInteger.value * -1294114749, bigInteger.length * -401817923);
            }
            if (bigInteger.count * -1833730097 == 2) {
                $l1 = OrgFile.this$0.next(bigInteger.data * -1783248061, bigInteger.value * -1294114749, bigInteger.length * -401817923);
            }
            if (bigInteger.count * -1833730097 == 3) {
                $l1 = OrgFile.this$0.get(bigInteger.data * -1783248061, bigInteger.value * -1294114749, bigInteger.length * -401817923);
            }
            if ($l1 != 0) {
                i = OrgFile.this$0.toString(bigInteger.data * -1783248061, bigInteger.value * -1294114749, bigInteger.length * -401817923, $l1);
                $i3 = Method.get($l1);
                $i2 = i & 31;
                i = (i >> 6) & 3;
            } else {
                $i3 = -1;
                $i2 = 0;
            }
            bigInteger.head = $i3 * -686175921;
            bigInteger.next = $i2 * 156191129;
            int $i0 = i * 573474583;
            i = $i0;
            bigInteger.index = $i0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dc.db(" + ')');
        }
    }
}
