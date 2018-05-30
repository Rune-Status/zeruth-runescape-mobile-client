package p000;

/* compiled from: jp */
public class Channel$1 implements Converter {
    static final int FLAGS_DEFAULT_TYPE_STRING = 256;
    static final int VERSION_CODE = 70;
    static int buffer;
    public static final Channel$1 format = new Channel$1(2);
    public static final Channel$1 head = new Channel$1(0);
    public static final Channel$1 size = new Channel$1(1);
    public static final Channel$1 this$0 = new Channel$1(3);
    protected static boolean value;
    final int closed;

    Channel$1(int $i0) {
        try {
            this.closed = 1881999357 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "jp.<init>(" + ')');
        }
    }

    static final Character write(int $i0, int i, int $i2, int i2) {
        try {
            Character $r0 = new Character();
            $r0.size = -140857607 * i;
            $r0.length = 517921497 * $i2;
            client.position.get($r0, (long) $i0);
            URI.add(i, (byte) -124);
            System $r2 = ArrayList.get($i0, 989220472);
            client.add($r2, (byte) 12);
            if (client.buffer != null) {
                client.add(client.buffer, (byte) 62);
                client.buffer = null;
            }
            Settings.this$0.clear(-832001586);
            Model.write(Float.size[$i0 >> 16], $r2, false, (byte) -113);
            Message.init(i, 1924962292);
            if (client.parent * 1704673651 == -1) {
                return $r0;
            }
            $i0 = client.parent * 1704673651;
            if (!Hashtable.get($i0, (byte) -91)) {
                return $r0;
            }
            JSONObject.get(Float.size[$i0], 1, 479542148);
            return $r0;
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "jp.fq(" + ')');
        }
    }

    public int get() {
        return this.closed * 1411288405;
    }

    public int get(int i) {
        try {
            return this.closed * 1411288405;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "jp.af(" + ')');
        }
    }

    public int read() {
        return this.closed * 1411288405;
    }

    public int write() {
        return this.closed * 1411288405;
    }
}
