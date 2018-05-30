package p000;

/* compiled from: nh */
public class AstNode {
    static int[][][] value;
    String data;
    public final int index;
    String parent;
    public final long position;
    public final TokenStream this$0;

    AstNode(Logger logger, byte b, int $i1) {
        try {
            this.data = logger.toString(1866981390);
            this.parent = logger.toString(278999139);
            this.index = logger.get(-1930997952) * -1742538455;
            this.position = logger.replace(-633385453) * -4360069772385127449L;
            int $i4 = logger.size(1272602209);
            int $i2 = logger.size(1778457546);
            this.this$0 = new TokenStream();
            this.this$0.add(2, (byte) 81);
            this.this$0.reset(b, (byte) 16);
            this.this$0.value = $i4 * -2053092819;
            this.this$0.name = $i2 * 1578831023;
            this.this$0.pos = 0;
            this.this$0.data = 0;
            this.this$0.state = -851644501 * $i1;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "nh.<init>(" + ')');
        }
    }

    public String getKey(int i) {
        try {
            return this.data;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nh.af(" + ')');
        }
    }

    public String getLength() {
        return this.data;
    }

    public String getParent() {
        return this.parent;
    }

    public String getParent(int i) {
        try {
            return this.parent;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "nh.ad(" + ')');
        }
    }

    public String getPosition() {
        return this.data;
    }

    public String pop() {
        return this.data;
    }
}
