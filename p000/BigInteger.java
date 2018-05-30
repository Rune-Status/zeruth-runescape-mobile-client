package p000;

/* compiled from: gi */
public final class BigInteger extends Object {
    int buf;
    int buffer;
    int count;
    int data;
    int head;
    int index;
    int length;
    int next;
    int offset;
    int pos;
    int size;
    int value;

    BigInteger() {
        try {
            this.pos = 0;
            this.size = -1558812355;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gi.<init>(" + ')');
        }
    }

    static void add(int i, String str, String str2, String str3, int i2) {
        try {
            Record $r6 = (Record) DrawingGroup.content.get(Integer.valueOf(i));
            if ($r6 == null) {
                $r6 = new Record();
                DrawingGroup.content.put(Integer.valueOf(i), $r6);
            }
            TDoubleArrayList $r7 = $r6.toString(i, str, str2, str3, 369173311);
            DrawingGroup.data.get($r7, (long) (1687932353 * $r7.value));
            DrawingGroup.map.add($r7);
            client.empty = 1266001243 * client.logger;
        } catch (Throwable $r10) {
            throw StringBuilder.append($r10, "gi.ad(" + ')');
        }
    }

    public static Transaction get(int i, int i2) {
        try {
            Transaction $r2 = (Transaction) Transaction.body.get((long) i);
            if ($r2 != null) {
                return $r2;
            }
            byte[] $r4 = Transaction.current.get(6, i, -1298880814);
            $r2 = new Transaction();
            $r2.text = 1249799077 * i;
            if ($r4 != null) {
                $r2.parse(new Logger($r4), -536521880);
            }
            $r2.parse(-629598681);
            if ($r2.context) {
                $r2.count = 0;
                $r2.index = false;
            }
            Transaction.body.get($r2, (long) i);
            return $r2;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "gi.ad(" + ')');
        }
    }

    public static boolean log(int i) {
        return 1 == -1915091943 * client.NONE;
    }
}
