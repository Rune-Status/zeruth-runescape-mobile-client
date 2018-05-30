package p000;

/* compiled from: da */
public class Packet implements Converter {
    public static final int HEADER_SIZE = 80;
    public static final int SSH_FXP_INIT = 1;
    static final Packet buffer = new Packet(2, (byte) 1);
    static final Packet factory = new Packet(3, (byte) 2);
    static final Packet random = new Packet(1, (byte) 3);
    static final Packet this$0 = new Packet(0, (byte) 0);
    final int bytes;
    final byte value;

    Packet(int $i0, byte b) {
        try {
            this.bytes = 506641 * $i0;
            this.value = b;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "da.<init>(" + ')');
        }
    }

    static Packet[] encode() {
        return new Packet[]{buffer, random, this$0, factory};
    }

    static Packet[] encode(byte b) {
        try {
            Packet[] $r0 = new Packet[4];
            $r0[0] = buffer;
            $r0[1] = random;
            $r0[2] = this$0;
            $r0[3] = factory;
            return $r0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "da.ag(" + ')');
        }
    }

    static Packet[] equals() {
        return new Packet[]{buffer, random, this$0, factory};
    }

    static Packet[] reset() {
        return new Packet[]{buffer, random, this$0, factory};
    }

    static final void toString(String str, int i) {
        if (MyAsyncTask.this$0 != null) {
            try {
                Config $r5 = Logger.add(R$string.adapter, client.this$0.key, (byte) -92);
                $r5.this$0.append(Record.toString(str, 2099286960), (byte) 31);
                $r5.this$0.add(str, (byte) -7);
                client.this$0.add($r5, (short) 255);
            } catch (RuntimeException $r7) {
                throw StringBuilder.append($r7, "da.fx(" + ')');
            }
        }
    }

    static Double[] toString(Class classR, int i, int i2, int i3) {
        try {
            return !Args.add(classR, i, i2, 1211366669) ? null : PdfGraphics2D.read((byte) 55);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "da.af(" + ')');
        }
    }

    public int get() {
        return this.value;
    }

    public int get(int i) {
        try {
            return this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "da.af(" + ')');
        }
    }

    public int read() {
        return this.value;
    }

    public int write() {
        return this.value;
    }
}
